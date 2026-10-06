package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class generacionaccesorios1_impl extends GXWebComponent
{
   public generacionaccesorios1_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public generacionaccesorios1_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( generacionaccesorios1_impl.class ));
   }

   public generacionaccesorios1_impl( int remoteHandle ,
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
               AV5EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5EmprCod", AV5EmprCod);
               AV16DisEst = (byte)(GXutil.lval( httpContext.GetPar( "DisEst"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16DisEst", GXutil.str( AV16DisEst, 1, 0));
               AV81BarNHdr = httpContext.GetPar( "BarNHdr") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81BarNHdr", AV81BarNHdr);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV5EmprCod,Byte.valueOf(AV16DisEst),AV81BarNHdr});
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
      nRC_GXsfl_62 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_62"))) ;
      nGXsfl_62_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_62_idx"))) ;
      sGXsfl_62_idx = httpContext.GetPar( "sGXsfl_62_idx") ;
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
      AV5EmprCod = httpContext.GetPar( "EmprCod") ;
      AV16DisEst = (byte)(GXutil.lval( httpContext.GetPar( "DisEst"))) ;
      AV82TFDisUsrCod = httpContext.GetPar( "TFDisUsrCod") ;
      AV83TFDisUsrCod_Sel = httpContext.GetPar( "TFDisUsrCod_Sel") ;
      AV43TFDisCod = (int)(GXutil.lval( httpContext.GetPar( "TFDisCod"))) ;
      AV44TFDisCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFDisCod_To"))) ;
      AV51TFDisFec = localUtil.parseDateParm( httpContext.GetPar( "TFDisFec")) ;
      AV35TFCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod"))) ;
      AV36TFCliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod_To"))) ;
      AV37TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV38TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      AV55TFDisPart = (short)(GXutil.lval( httpContext.GetPar( "TFDisPart"))) ;
      AV56TFDisPart_To = (short)(GXutil.lval( httpContext.GetPar( "TFDisPart_To"))) ;
      AV39TFDisArtCod = httpContext.GetPar( "TFDisArtCod") ;
      AV40TFDisArtCod_Sel = httpContext.GetPar( "TFDisArtCod_Sel") ;
      AV41TFDisArtDsc = httpContext.GetPar( "TFDisArtDsc") ;
      AV42TFDisArtDsc_Sel = httpContext.GetPar( "TFDisArtDsc_Sel") ;
      AV45TFDisColNom = httpContext.GetPar( "TFDisColNom") ;
      AV46TFDisColNom_Sel = httpContext.GetPar( "TFDisColNom_Sel") ;
      AV47TFDisColNum = (int)(GXutil.lval( httpContext.GetPar( "TFDisColNum"))) ;
      AV48TFDisColNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFDisColNum_To"))) ;
      AV63TFDisTipCol = (byte)(GXutil.lval( httpContext.GetPar( "TFDisTipCol"))) ;
      AV64TFDisTipCol_To = (byte)(GXutil.lval( httpContext.GetPar( "TFDisTipCol_To"))) ;
      AV53TFDisNomCli = httpContext.GetPar( "TFDisNomCli") ;
      AV54TFDisNomCli_Sel = httpContext.GetPar( "TFDisNomCli_Sel") ;
      AV65TFDisUniMed = httpContext.GetPar( "TFDisUniMed") ;
      AV66TFDisUniMed_Sel = httpContext.GetPar( "TFDisUniMed_Sel") ;
      AV61TFDisPiePie = (short)(GXutil.lval( httpContext.GetPar( "TFDisPiePie"))) ;
      AV62TFDisPiePie_To = (short)(GXutil.lval( httpContext.GetPar( "TFDisPiePie_To"))) ;
      AV57TFDisPieKgm = CommonUtil.decimalVal( httpContext.GetPar( "TFDisPieKgm"), ".") ;
      AV58TFDisPieKgm_To = CommonUtil.decimalVal( httpContext.GetPar( "TFDisPieKgm_To"), ".") ;
      AV59TFDisPieMtr = CommonUtil.decimalVal( httpContext.GetPar( "TFDisPieMtr"), ".") ;
      AV60TFDisPieMtr_To = CommonUtil.decimalVal( httpContext.GetPar( "TFDisPieMtr_To"), ".") ;
      AV84TFMaqCodDis = httpContext.GetPar( "TFMaqCodDis") ;
      AV85TFMaqCodDis_Sel = httpContext.GetPar( "TFMaqCodDis_Sel") ;
      AV86TFDisVolMaq = (int)(GXutil.lval( httpContext.GetPar( "TFDisVolMaq"))) ;
      AV87TFDisVolMaq_To = (int)(GXutil.lval( httpContext.GetPar( "TFDisVolMaq_To"))) ;
      AV88TFRevenID = httpContext.GetPar( "TFRevenID") ;
      AV89TFRevenID_Sel = httpContext.GetPar( "TFRevenID_Sel") ;
      AV92Pgmname = httpContext.GetPar( "Pgmname") ;
      AV81BarNHdr = httpContext.GetPar( "BarNHdr") ;
      AV69TotDisPiePie = GXutil.lval( httpContext.GetPar( "TotDisPiePie")) ;
      AV67TotDisPieKgm = CommonUtil.decimalVal( httpContext.GetPar( "TotDisPieKgm"), ".") ;
      AV68TotDisPieMtr = CommonUtil.decimalVal( httpContext.GetPar( "TotDisPieMtr"), ".") ;
      A1202MacDisCod = (int)(GXutil.lval( httpContext.GetPar( "MacDisCod"))) ;
      A1199MacCod = (int)(GXutil.lval( httpContext.GetPar( "MacCod"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV77Col_Discod);
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV5EmprCod, AV16DisEst, AV82TFDisUsrCod, AV83TFDisUsrCod_Sel, AV43TFDisCod, AV44TFDisCod_To, AV51TFDisFec, AV35TFCliCod, AV36TFCliCod_To, AV37TFCliNom, AV38TFCliNom_Sel, AV55TFDisPart, AV56TFDisPart_To, AV39TFDisArtCod, AV40TFDisArtCod_Sel, AV41TFDisArtDsc, AV42TFDisArtDsc_Sel, AV45TFDisColNom, AV46TFDisColNom_Sel, AV47TFDisColNum, AV48TFDisColNum_To, AV63TFDisTipCol, AV64TFDisTipCol_To, AV53TFDisNomCli, AV54TFDisNomCli_Sel, AV65TFDisUniMed, AV66TFDisUniMed_Sel, AV61TFDisPiePie, AV62TFDisPiePie_To, AV57TFDisPieKgm, AV58TFDisPieKgm_To, AV59TFDisPieMtr, AV60TFDisPieMtr_To, AV84TFMaqCodDis, AV85TFMaqCodDis_Sel, AV86TFDisVolMaq, AV87TFDisVolMaq_To, AV88TFRevenID, AV89TFRevenID_Sel, AV92Pgmname, AV81BarNHdr, AV69TotDisPiePie, AV67TotDisPieKgm, AV68TotDisPieMtr, A1202MacDisCod, A1199MacCod, AV77Col_Discod, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa25T2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Generacion Accesorios ", "")) ;
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
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.pedidos.generacionaccesorios1", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV16DisEst,1,0)),GXutil.URLEncode(GXutil.rtrim(AV81BarNHdr))}, new String[] {"EmprCod","DisEst","BarNHdr"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTDISPIEPIE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV69TotDisPiePie), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTDISPIEKGM", getSecureSignedToken( sPrefix, localUtil.format( AV67TotDisPieKgm, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTDISPIEMTR", getSecureSignedToken( sPrefix, localUtil.format( AV68TotDisPieMtr, "ZZZZZ9.99")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"GeneracionAccesorios1");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV92Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("pedidos\\generacionaccesorios1:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_62", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_62, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV18GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV19GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV15DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV15DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV5EmprCod", GXutil.rtrim( wcpOAV5EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV16DisEst", GXutil.ltrim( localUtil.ntoc( wcpOAV16DisEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV81BarNHdr", GXutil.rtrim( wcpOAV81BarNHdr));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDISUSRCOD", GXutil.rtrim( AV82TFDisUsrCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDISUSRCOD_SEL", GXutil.rtrim( AV83TFDisUsrCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDISCOD", GXutil.ltrim( localUtil.ntoc( AV43TFDisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDISCOD_TO", GXutil.ltrim( localUtil.ntoc( AV44TFDisCod_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDISFEC", localUtil.dtoc( AV51TFDisFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICOD", GXutil.ltrim( localUtil.ntoc( AV35TFCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV36TFCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM", GXutil.rtrim( AV37TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM_SEL", GXutil.rtrim( AV38TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDISPART", GXutil.ltrim( localUtil.ntoc( AV55TFDisPart, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDISPART_TO", GXutil.ltrim( localUtil.ntoc( AV56TFDisPart_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDISARTCOD", GXutil.rtrim( AV39TFDisArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDISARTCOD_SEL", GXutil.rtrim( AV40TFDisArtCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDISARTDSC", GXutil.rtrim( AV41TFDisArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDISARTDSC_SEL", GXutil.rtrim( AV42TFDisArtDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDISCOLNOM", GXutil.rtrim( AV45TFDisColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDISCOLNOM_SEL", GXutil.rtrim( AV46TFDisColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDISCOLNUM", GXutil.ltrim( localUtil.ntoc( AV47TFDisColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDISCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV48TFDisColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDISTIPCOL", GXutil.ltrim( localUtil.ntoc( AV63TFDisTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDISTIPCOL_TO", GXutil.ltrim( localUtil.ntoc( AV64TFDisTipCol_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDISNOMCLI", GXutil.rtrim( AV53TFDisNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDISNOMCLI_SEL", GXutil.rtrim( AV54TFDisNomCli_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDISUNIMED", GXutil.rtrim( AV65TFDisUniMed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDISUNIMED_SEL", GXutil.rtrim( AV66TFDisUniMed_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDISPIEPIE", GXutil.ltrim( localUtil.ntoc( AV61TFDisPiePie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDISPIEPIE_TO", GXutil.ltrim( localUtil.ntoc( AV62TFDisPiePie_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDISPIEKGM", GXutil.ltrim( localUtil.ntoc( AV57TFDisPieKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDISPIEKGM_TO", GXutil.ltrim( localUtil.ntoc( AV58TFDisPieKgm_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDISPIEMTR", GXutil.ltrim( localUtil.ntoc( AV59TFDisPieMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDISPIEMTR_TO", GXutil.ltrim( localUtil.ntoc( AV60TFDisPieMtr_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMAQCODDIS", GXutil.rtrim( AV84TFMaqCodDis));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMAQCODDIS_SEL", GXutil.rtrim( AV85TFMaqCodDis_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDISVOLMAQ", GXutil.ltrim( localUtil.ntoc( AV86TFDisVolMaq, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDISVOLMAQ_TO", GXutil.ltrim( localUtil.ntoc( AV87TFDisVolMaq_To, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFREVENID", GXutil.rtrim( AV88TFRevenID));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFREVENID_SEL", GXutil.rtrim( AV89TFRevenID_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV5EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vDISEST", GXutil.ltrim( localUtil.ntoc( AV16DisEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DISEST", GXutil.ltrim( localUtil.ntoc( A367DisEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTDISPIEPIE", GXutil.ltrim( localUtil.ntoc( AV69TotDisPiePie, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTDISPIEPIE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV69TotDisPiePie), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTDISPIEKGM", GXutil.ltrim( localUtil.ntoc( AV67TotDisPieKgm, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTDISPIEKGM", getSecureSignedToken( sPrefix, localUtil.format( AV67TotDisPieKgm, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTDISPIEMTR", GXutil.ltrim( localUtil.ntoc( AV68TotDisPieMtr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTDISPIEMTR", getSecureSignedToken( sPrefix, localUtil.format( AV68TotDisPieMtr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"MACDISCOD", GXutil.ltrim( localUtil.ntoc( A1202MacDisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"MACCOD", GXutil.ltrim( localUtil.ntoc( A1199MacCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DISENCCLI", GXutil.rtrim( A4813DisEncCli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DISCLINUM", GXutil.rtrim( A360DisCliNum));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOL_DISCOD", AV77Col_Discod);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOL_DISCOD", AV77Col_Discod);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vI", GXutil.ltrim( localUtil.ntoc( AV78i, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHAY_SEL", GXutil.ltrim( localUtil.ntoc( AV22Hay_sel, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DISDES", GXutil.rtrim( A365DisDes));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filterisrange", GXutil.rtrim( Ddo_grid_Filterisrange));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includedatalist", GXutil.rtrim( Ddo_grid_Includedatalist));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalisttype", GXutil.rtrim( Ddo_grid_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CREARACCESORIOS_Title", GXutil.rtrim( Dvelop_confirmpanel_crearaccesorios_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CREARACCESORIOS_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_crearaccesorios_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CREARACCESORIOS_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_crearaccesorios_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CREARACCESORIOS_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_crearaccesorios_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CREARACCESORIOS_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_crearaccesorios_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CREARACCESORIOS_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_crearaccesorios_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CREARACCESORIOS_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_crearaccesorios_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARACCESORIOS_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminaraccesorios_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARACCESORIOS_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminaraccesorios_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARACCESORIOS_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminaraccesorios_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARACCESORIOS_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminaraccesorios_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARACCESORIOS_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminaraccesorios_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARACCESORIOS_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminaraccesorios_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARACCESORIOS_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminaraccesorios_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_TITLESCATEGORIES_Gridinternalname", GXutil.rtrim( Grid_titlescategories_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_TITLESCATEGORIES_Gridtitlescategories", GXutil.rtrim( Grid_titlescategories_Gridtitlescategories));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascategories", GXutil.booltostr( Grid_empowerer_Hascategories));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CREARACCESORIOS_Result", GXutil.rtrim( Dvelop_confirmpanel_crearaccesorios_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARACCESORIOS_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminaraccesorios_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CREARACCESORIOS_Result", GXutil.rtrim( Dvelop_confirmpanel_crearaccesorios_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARACCESORIOS_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminaraccesorios_Result));
   }

   public void renderHtmlCloseForm25T2( )
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
      return "Pedidos.GeneracionAccesorios1" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Generacion Accesorios ", "") ;
   }

   public void wb25T0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.pedidos.generacionaccesorios1");
            httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
            httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
            httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableactionheader_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 CellMarginTop", "left", "top", "", "", "div");
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup3_Internalname, httpContext.getMessage( "Accesorios", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_Pedidos\\GeneracionAccesorios1.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncrearaccesorios_Internalname, "gx.evt.setGridEvt("+GXutil.str( 62, 2, 0)+","+"null"+");", httpContext.getMessage( "Crear", ""), bttBtncrearaccesorios_Jsonclick, 7, httpContext.getMessage( "Crear", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e1125t1_client"+"'", TempTags, "", 2, "HLP_Pedidos\\GeneracionAccesorios1.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneliminaraccesorios_Internalname, "gx.evt.setGridEvt("+GXutil.str( 62, 2, 0)+","+"null"+");", httpContext.getMessage( "Eliminar", ""), bttBtneliminaraccesorios_Jsonclick, 7, httpContext.getMessage( "Eliminar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e1225t1_client"+"'", TempTags, "", 2, "HLP_Pedidos\\GeneracionAccesorios1.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</fieldset>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 CellMarginTop", "left", "top", "", "", "div");
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup5_Internalname, httpContext.getMessage( "Crear Hdr", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_Pedidos\\GeneracionAccesorios1.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtngenerarhdrs_Internalname, "gx.evt.setGridEvt("+GXutil.str( 62, 2, 0)+","+"null"+");", httpContext.getMessage( "Generar Hdrs", ""), bttBtngenerarhdrs_Jsonclick, 5, httpContext.getMessage( "Generar Hdrs", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOGENERARHDRS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Pedidos\\GeneracionAccesorios1.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</fieldset>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 CellMarginTop50", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 62, 2, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Pedidos\\GeneracionAccesorios1.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarnhdr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarnhdr_Internalname, httpContext.getMessage( "Ultima HDR Creada", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarnhdr_Internalname, GXutil.rtrim( AV81BarNHdr), GXutil.rtrim( localUtil.format( AV81BarNHdr, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarnhdr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarnhdr_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\GeneracionAccesorios1.htm");
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
         /* User Defined Control */
         ucBarradeprogreso.render(context, "gxprogressindicator", Barradeprogreso_Internalname, sPrefix+"BARRADEPROGRESOContainer");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV92Pgmname), GXutil.rtrim( localUtil.format( AV92Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\GeneracionAccesorios1.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDatamonjs.render(context, "datamonjs", Datamonjs_Internalname, sPrefix+"DATAMONJSContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", divUnnamedtable1_Height, "px", "GridVerticalScroll", "left", "top", "", "", "div");
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
         startgridcontrol62( ) ;
      }
      if ( wbEnd == 62 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_62 = (int)(nGXsfl_62_idx-1) ;
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
         wb_table1_87_25T2( true) ;
      }
      else
      {
         wb_table1_87_25T2( false) ;
      }
      return  ;
   }

   public void wb_table1_87_25T2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV18GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV19GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, sPrefix+"GRIDPAGINATIONBARContainer");
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
         app.GxWebStd.gx_div_start( httpContext, divHtml_bottomauxiliarcontrols_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDdo_grid.setProperty("Caption", Ddo_grid_Caption);
         ucDdo_grid.setProperty("ColumnIds", Ddo_grid_Columnids);
         ucDdo_grid.setProperty("ColumnsSortValues", Ddo_grid_Columnssortvalues);
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("FilterIsRange", Ddo_grid_Filterisrange);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV15DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         wb_table2_124_25T2( true) ;
      }
      else
      {
         wb_table2_124_25T2( false) ;
      }
      return  ;
   }

   public void wb_table2_124_25T2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table3_129_25T2( true) ;
      }
      else
      {
         wb_table3_129_25T2( false) ;
      }
      return  ;
   }

   public void wb_table3_129_25T2e( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 137,'" + sPrefix + "',false,'" + sGXsfl_62_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_disfecauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_disfecauxdate_Internalname, localUtil.format(AV13DDO_DisFecAuxDate, "99/99/99"), localUtil.format( AV13DDO_DisFecAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,137);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_disfecauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\GeneracionAccesorios1.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_disfecauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Pedidos\\GeneracionAccesorios1.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 62 )
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

   public void start25T2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Generacion Accesorios ", ""), (short)(0)) ;
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
            strup25T0( ) ;
         }
      }
   }

   public void ws25T2( )
   {
      start25T2( ) ;
      evt25T2( ) ;
   }

   public void evt25T2( )
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
                              strup25T0( ) ;
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
                              strup25T0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1325T2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup25T0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1425T2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup25T0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1525T2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_CREARACCESORIOS.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup25T0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1625T2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINARACCESORIOS.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup25T0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1725T2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup25T0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoCerrar' */
                                 e1825T2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOGENERARHDRS'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup25T0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoGenerarHdrs' */
                                 e1925T2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup25T0( ) ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VSELECCIONAR.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VSELECCIONAR.CLICK") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup25T0( ) ;
                           }
                           nGXsfl_62_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_62_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_62_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_622( ) ;
                           AV33Seleccionar = ((GXutil.strcmp(httpContext.cgiGet( chkavSeleccionar.getInternalname()), "S")==0) ? "S" : "N") ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionar.getInternalname(), AV33Seleccionar);
                           A4348DisUsrCod = httpContext.cgiGet( edtDisUsrCod_Internalname) ;
                           A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A369DisFec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtDisFec_Internalname), 0)) ;
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavMaccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavMaccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMACCOD");
                              GX_FocusControl = edtavMaccod_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV25MacCod = 0 ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMaccod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25MacCod), 8, 0));
                           }
                           else
                           {
                              AV25MacCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavMaccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMaccod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25MacCod), 8, 0));
                           }
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           AV80DisEncCli = httpContext.cgiGet( edtavDisenccli_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDisenccli_Internalname, AV80DisEncCli);
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
                           A1122MaqCodDis = httpContext.cgiGet( edtMaqCodDis_Internalname) ;
                           n1122MaqCodDis = false ;
                           A6547DisVolMaq = (int)(localUtil.ctol( httpContext.cgiGet( edtDisVolMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A12328RevenID = httpContext.cgiGet( edtRevenID_Internalname) ;
                           n12328RevenID = false ;
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
                                       e2025T2 ();
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
                                       e2125T2 ();
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
                                       e2225T2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "VSELECCIONAR.CLICK") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = chkavSeleccionar.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e2325T2 ();
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
                                    strup25T0( ) ;
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

   public void we25T2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm25T2( ) ;
         }
      }
   }

   public void pa25T2( )
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
            GX_FocusControl = edtavTotvaluedispiepie_Internalname ;
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
      subsflControlProps_622( ) ;
      while ( nGXsfl_62_idx <= nRC_GXsfl_62 )
      {
         sendrow_622( ) ;
         nGXsfl_62_idx = ((subGrid_Islastpage==1)&&(nGXsfl_62_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_62_idx+1) ;
         sGXsfl_62_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_62_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_622( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV5EmprCod ,
                                 byte AV16DisEst ,
                                 String AV82TFDisUsrCod ,
                                 String AV83TFDisUsrCod_Sel ,
                                 int AV43TFDisCod ,
                                 int AV44TFDisCod_To ,
                                 java.util.Date AV51TFDisFec ,
                                 int AV35TFCliCod ,
                                 int AV36TFCliCod_To ,
                                 String AV37TFCliNom ,
                                 String AV38TFCliNom_Sel ,
                                 short AV55TFDisPart ,
                                 short AV56TFDisPart_To ,
                                 String AV39TFDisArtCod ,
                                 String AV40TFDisArtCod_Sel ,
                                 String AV41TFDisArtDsc ,
                                 String AV42TFDisArtDsc_Sel ,
                                 String AV45TFDisColNom ,
                                 String AV46TFDisColNom_Sel ,
                                 int AV47TFDisColNum ,
                                 int AV48TFDisColNum_To ,
                                 byte AV63TFDisTipCol ,
                                 byte AV64TFDisTipCol_To ,
                                 String AV53TFDisNomCli ,
                                 String AV54TFDisNomCli_Sel ,
                                 String AV65TFDisUniMed ,
                                 String AV66TFDisUniMed_Sel ,
                                 short AV61TFDisPiePie ,
                                 short AV62TFDisPiePie_To ,
                                 java.math.BigDecimal AV57TFDisPieKgm ,
                                 java.math.BigDecimal AV58TFDisPieKgm_To ,
                                 java.math.BigDecimal AV59TFDisPieMtr ,
                                 java.math.BigDecimal AV60TFDisPieMtr_To ,
                                 String AV84TFMaqCodDis ,
                                 String AV85TFMaqCodDis_Sel ,
                                 int AV86TFDisVolMaq ,
                                 int AV87TFDisVolMaq_To ,
                                 String AV88TFRevenID ,
                                 String AV89TFRevenID_Sel ,
                                 String AV92Pgmname ,
                                 String AV81BarNHdr ,
                                 long AV69TotDisPiePie ,
                                 java.math.BigDecimal AV67TotDisPieKgm ,
                                 java.math.BigDecimal AV68TotDisPieMtr ,
                                 int A1202MacDisCod ,
                                 int A1199MacCod ,
                                 GXSimpleCollection<Integer> AV77Col_Discod ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e2125T2 ();
      GRID_nCurrentRecord = 0 ;
      rf25T2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"GeneracionAccesorios1");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV92Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("pedidos\\generacionaccesorios1:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf25T2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV92Pgmname = "Pedidos.GeneracionAccesorios1" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92Pgmname", AV92Pgmname);
      Gx_err = (short)(0) ;
      edtavBarnhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarnhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnhdr_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavMaccod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMaccod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaccod_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavDisenccli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDisenccli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDisenccli_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavTotvaluedispiepie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluedispiepie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluedispiepie_Enabled), 5, 0), true);
      edtavTotvaluedispiekgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluedispiekgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluedispiekgm_Enabled), 5, 0), true);
      edtavTotvaluedispiemtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluedispiemtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluedispiemtr_Enabled), 5, 0), true);
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV93Pedidos_generacionaccesorios1ds_1_tfdisusrcod = AV82TFDisUsrCod ;
      AV94Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel = AV83TFDisUsrCod_Sel ;
      AV95Pedidos_generacionaccesorios1ds_3_tfdiscod = AV43TFDisCod ;
      AV96Pedidos_generacionaccesorios1ds_4_tfdiscod_to = AV44TFDisCod_To ;
      AV97Pedidos_generacionaccesorios1ds_5_tfdisfec = AV51TFDisFec ;
      AV98Pedidos_generacionaccesorios1ds_6_tfclicod = AV35TFCliCod ;
      AV99Pedidos_generacionaccesorios1ds_7_tfclicod_to = AV36TFCliCod_To ;
      AV100Pedidos_generacionaccesorios1ds_8_tfclinom = AV37TFCliNom ;
      AV101Pedidos_generacionaccesorios1ds_9_tfclinom_sel = AV38TFCliNom_Sel ;
      AV102Pedidos_generacionaccesorios1ds_10_tfdispart = AV55TFDisPart ;
      AV103Pedidos_generacionaccesorios1ds_11_tfdispart_to = AV56TFDisPart_To ;
      AV104Pedidos_generacionaccesorios1ds_12_tfdisartcod = AV39TFDisArtCod ;
      AV105Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel = AV40TFDisArtCod_Sel ;
      AV106Pedidos_generacionaccesorios1ds_14_tfdisartdsc = AV41TFDisArtDsc ;
      AV107Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel = AV42TFDisArtDsc_Sel ;
      AV108Pedidos_generacionaccesorios1ds_16_tfdiscolnom = AV45TFDisColNom ;
      AV109Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel = AV46TFDisColNom_Sel ;
      AV110Pedidos_generacionaccesorios1ds_18_tfdiscolnum = AV47TFDisColNum ;
      AV111Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to = AV48TFDisColNum_To ;
      AV112Pedidos_generacionaccesorios1ds_20_tfdistipcol = AV63TFDisTipCol ;
      AV113Pedidos_generacionaccesorios1ds_21_tfdistipcol_to = AV64TFDisTipCol_To ;
      AV114Pedidos_generacionaccesorios1ds_22_tfdisnomcli = AV53TFDisNomCli ;
      AV115Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel = AV54TFDisNomCli_Sel ;
      AV116Pedidos_generacionaccesorios1ds_24_tfdisunimed = AV65TFDisUniMed ;
      AV117Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel = AV66TFDisUniMed_Sel ;
      AV118Pedidos_generacionaccesorios1ds_26_tfdispiepie = AV61TFDisPiePie ;
      AV119Pedidos_generacionaccesorios1ds_27_tfdispiepie_to = AV62TFDisPiePie_To ;
      AV120Pedidos_generacionaccesorios1ds_28_tfdispiekgm = AV57TFDisPieKgm ;
      AV121Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to = AV58TFDisPieKgm_To ;
      AV122Pedidos_generacionaccesorios1ds_30_tfdispiemtr = AV59TFDisPieMtr ;
      AV123Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to = AV60TFDisPieMtr_To ;
      AV124Pedidos_generacionaccesorios1ds_32_tfmaqcoddis = AV84TFMaqCodDis ;
      AV125Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel = AV85TFMaqCodDis_Sel ;
      AV126Pedidos_generacionaccesorios1ds_34_tfdisvolmaq = AV86TFDisVolMaq ;
      AV127Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to = AV87TFDisVolMaq_To ;
      AV128Pedidos_generacionaccesorios1ds_36_tfrevenid = AV88TFRevenID ;
      AV129Pedidos_generacionaccesorios1ds_37_tfrevenid_sel = AV89TFRevenID_Sel ;
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV94Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel ,
                                           AV93Pedidos_generacionaccesorios1ds_1_tfdisusrcod ,
                                           Integer.valueOf(AV95Pedidos_generacionaccesorios1ds_3_tfdiscod) ,
                                           Integer.valueOf(AV96Pedidos_generacionaccesorios1ds_4_tfdiscod_to) ,
                                           AV97Pedidos_generacionaccesorios1ds_5_tfdisfec ,
                                           Integer.valueOf(AV98Pedidos_generacionaccesorios1ds_6_tfclicod) ,
                                           Integer.valueOf(AV99Pedidos_generacionaccesorios1ds_7_tfclicod_to) ,
                                           AV101Pedidos_generacionaccesorios1ds_9_tfclinom_sel ,
                                           AV100Pedidos_generacionaccesorios1ds_8_tfclinom ,
                                           Short.valueOf(AV102Pedidos_generacionaccesorios1ds_10_tfdispart) ,
                                           Short.valueOf(AV103Pedidos_generacionaccesorios1ds_11_tfdispart_to) ,
                                           AV105Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel ,
                                           AV104Pedidos_generacionaccesorios1ds_12_tfdisartcod ,
                                           AV107Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel ,
                                           AV106Pedidos_generacionaccesorios1ds_14_tfdisartdsc ,
                                           AV109Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel ,
                                           AV108Pedidos_generacionaccesorios1ds_16_tfdiscolnom ,
                                           Integer.valueOf(AV110Pedidos_generacionaccesorios1ds_18_tfdiscolnum) ,
                                           Integer.valueOf(AV111Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to) ,
                                           Byte.valueOf(AV112Pedidos_generacionaccesorios1ds_20_tfdistipcol) ,
                                           Byte.valueOf(AV113Pedidos_generacionaccesorios1ds_21_tfdistipcol_to) ,
                                           AV115Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel ,
                                           AV114Pedidos_generacionaccesorios1ds_22_tfdisnomcli ,
                                           AV117Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel ,
                                           AV116Pedidos_generacionaccesorios1ds_24_tfdisunimed ,
                                           AV125Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel ,
                                           AV124Pedidos_generacionaccesorios1ds_32_tfmaqcoddis ,
                                           Integer.valueOf(AV126Pedidos_generacionaccesorios1ds_34_tfdisvolmaq) ,
                                           Integer.valueOf(AV127Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to) ,
                                           AV129Pedidos_generacionaccesorios1ds_37_tfrevenid_sel ,
                                           AV128Pedidos_generacionaccesorios1ds_36_tfrevenid ,
                                           A4348DisUsrCod ,
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
                                           A1122MaqCodDis ,
                                           Integer.valueOf(A6547DisVolMaq) ,
                                           A12328RevenID ,
                                           Short.valueOf(AV118Pedidos_generacionaccesorios1ds_26_tfdispiepie) ,
                                           Short.valueOf(A387DisPiePie) ,
                                           Short.valueOf(AV119Pedidos_generacionaccesorios1ds_27_tfdispiepie_to) ,
                                           AV120Pedidos_generacionaccesorios1ds_28_tfdispiekgm ,
                                           A381DisPieKgm ,
                                           AV121Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to ,
                                           AV122Pedidos_generacionaccesorios1ds_30_tfdispiemtr ,
                                           A385DisPieMtr ,
                                           AV123Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to ,
                                           Byte.valueOf(A367DisEst) ,
                                           Byte.valueOf(AV16DisEst) ,
                                           AV5EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV93Pedidos_generacionaccesorios1ds_1_tfdisusrcod = GXutil.padr( GXutil.rtrim( AV93Pedidos_generacionaccesorios1ds_1_tfdisusrcod), 8, "%") ;
      lV100Pedidos_generacionaccesorios1ds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV100Pedidos_generacionaccesorios1ds_8_tfclinom), 30, "%") ;
      lV104Pedidos_generacionaccesorios1ds_12_tfdisartcod = GXutil.padr( GXutil.rtrim( AV104Pedidos_generacionaccesorios1ds_12_tfdisartcod), 16, "%") ;
      lV106Pedidos_generacionaccesorios1ds_14_tfdisartdsc = GXutil.padr( GXutil.rtrim( AV106Pedidos_generacionaccesorios1ds_14_tfdisartdsc), 26, "%") ;
      lV108Pedidos_generacionaccesorios1ds_16_tfdiscolnom = GXutil.padr( GXutil.rtrim( AV108Pedidos_generacionaccesorios1ds_16_tfdiscolnom), 13, "%") ;
      lV114Pedidos_generacionaccesorios1ds_22_tfdisnomcli = GXutil.padr( GXutil.rtrim( AV114Pedidos_generacionaccesorios1ds_22_tfdisnomcli), 13, "%") ;
      lV116Pedidos_generacionaccesorios1ds_24_tfdisunimed = GXutil.padr( GXutil.rtrim( AV116Pedidos_generacionaccesorios1ds_24_tfdisunimed), 1, "%") ;
      lV124Pedidos_generacionaccesorios1ds_32_tfmaqcoddis = GXutil.padr( GXutil.rtrim( AV124Pedidos_generacionaccesorios1ds_32_tfmaqcoddis), 6, "%") ;
      lV128Pedidos_generacionaccesorios1ds_36_tfrevenid = GXutil.padr( GXutil.rtrim( AV128Pedidos_generacionaccesorios1ds_36_tfrevenid), 10, "%") ;
      /* Using cursor H025T3 */
      pr_default.execute(0, new Object[] {AV5EmprCod, Short.valueOf(AV118Pedidos_generacionaccesorios1ds_26_tfdispiepie), Short.valueOf(AV118Pedidos_generacionaccesorios1ds_26_tfdispiepie), Short.valueOf(AV119Pedidos_generacionaccesorios1ds_27_tfdispiepie_to), Short.valueOf(AV119Pedidos_generacionaccesorios1ds_27_tfdispiepie_to), Byte.valueOf(AV16DisEst), lV93Pedidos_generacionaccesorios1ds_1_tfdisusrcod, AV94Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel, Integer.valueOf(AV95Pedidos_generacionaccesorios1ds_3_tfdiscod), Integer.valueOf(AV96Pedidos_generacionaccesorios1ds_4_tfdiscod_to), AV97Pedidos_generacionaccesorios1ds_5_tfdisfec, Integer.valueOf(AV98Pedidos_generacionaccesorios1ds_6_tfclicod), Integer.valueOf(AV99Pedidos_generacionaccesorios1ds_7_tfclicod_to), lV100Pedidos_generacionaccesorios1ds_8_tfclinom, AV101Pedidos_generacionaccesorios1ds_9_tfclinom_sel, Short.valueOf(AV102Pedidos_generacionaccesorios1ds_10_tfdispart), Short.valueOf(AV103Pedidos_generacionaccesorios1ds_11_tfdispart_to), lV104Pedidos_generacionaccesorios1ds_12_tfdisartcod, AV105Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel, lV106Pedidos_generacionaccesorios1ds_14_tfdisartdsc, AV107Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel, lV108Pedidos_generacionaccesorios1ds_16_tfdiscolnom, AV109Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel, Integer.valueOf(AV110Pedidos_generacionaccesorios1ds_18_tfdiscolnum), Integer.valueOf(AV111Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to), Byte.valueOf(AV112Pedidos_generacionaccesorios1ds_20_tfdistipcol), Byte.valueOf(AV113Pedidos_generacionaccesorios1ds_21_tfdistipcol_to), lV114Pedidos_generacionaccesorios1ds_22_tfdisnomcli, AV115Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel, lV116Pedidos_generacionaccesorios1ds_24_tfdisunimed, AV117Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel, lV124Pedidos_generacionaccesorios1ds_32_tfmaqcoddis, AV125Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel, Integer.valueOf(AV126Pedidos_generacionaccesorios1ds_34_tfdisvolmaq), Integer.valueOf(AV127Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to), lV128Pedidos_generacionaccesorios1ds_36_tfrevenid, AV129Pedidos_generacionaccesorios1ds_37_tfrevenid_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = H025T3_A361DisCod[0] ;
         A396EmprCod = H025T3_A396EmprCod[0] ;
         A367DisEst = H025T3_A367DisEst[0] ;
         A360DisCliNum = H025T3_A360DisCliNum[0] ;
         A4813DisEncCli = H025T3_A4813DisEncCli[0] ;
         A12328RevenID = H025T3_A12328RevenID[0] ;
         n12328RevenID = H025T3_n12328RevenID[0] ;
         A6547DisVolMaq = H025T3_A6547DisVolMaq[0] ;
         A1122MaqCodDis = H025T3_A1122MaqCodDis[0] ;
         n1122MaqCodDis = H025T3_n1122MaqCodDis[0] ;
         A392DisUniMed = H025T3_A392DisUniMed[0] ;
         A1195DisNomCli = H025T3_A1195DisNomCli[0] ;
         A390DisTipCol = H025T3_A390DisTipCol[0] ;
         n390DisTipCol = H025T3_n390DisTipCol[0] ;
         A363DisColNum = H025T3_A363DisColNum[0] ;
         n363DisColNum = H025T3_n363DisColNum[0] ;
         A362DisColNom = H025T3_A362DisColNom[0] ;
         n362DisColNom = H025T3_n362DisColNom[0] ;
         A337DisArtDsc = H025T3_A337DisArtDsc[0] ;
         A335DisArtCod = H025T3_A335DisArtCod[0] ;
         A1502DisPart = H025T3_A1502DisPart[0] ;
         A279CliNom = H025T3_A279CliNom[0] ;
         A252CliCod = H025T3_A252CliCod[0] ;
         A369DisFec = H025T3_A369DisFec[0] ;
         A4348DisUsrCod = H025T3_A4348DisUsrCod[0] ;
         A387DisPiePie = H025T3_A387DisPiePie[0] ;
         n387DisPiePie = H025T3_n387DisPiePie[0] ;
         A365DisDes = H025T3_A365DisDes[0] ;
         A387DisPiePie = H025T3_A387DisPiePie[0] ;
         n387DisPiePie = H025T3_n387DisPiePie[0] ;
         A279CliNom = H025T3_A279CliNom[0] ;
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
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV120Pedidos_generacionaccesorios1ds_28_tfdispiekgm)==0) || ( ( DecimalUtil.compareTo(A381DisPieKgm, AV120Pedidos_generacionaccesorios1ds_28_tfdispiekgm) >= 0 ) ) )
         {
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to)==0) || ( ( DecimalUtil.compareTo(A381DisPieKgm, AV121Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to) <= 0 ) ) )
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
               if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Pedidos_generacionaccesorios1ds_30_tfdispiemtr)==0) || ( ( DecimalUtil.compareTo(A385DisPieMtr, AV122Pedidos_generacionaccesorios1ds_30_tfdispiemtr) >= 0 ) ) )
               {
                  if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to)==0) || ( ( DecimalUtil.compareTo(A385DisPieMtr, AV123Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to) <= 0 ) ) )
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

   public void rf25T2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(62) ;
      /* Execute user event: Refresh */
      e2125T2 ();
      nGXsfl_62_idx = 1 ;
      sGXsfl_62_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_62_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_622( ) ;
      bGXsfl_62_Refreshing = true ;
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
         subsflControlProps_622( ) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              AV94Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel ,
                                              AV93Pedidos_generacionaccesorios1ds_1_tfdisusrcod ,
                                              Integer.valueOf(AV95Pedidos_generacionaccesorios1ds_3_tfdiscod) ,
                                              Integer.valueOf(AV96Pedidos_generacionaccesorios1ds_4_tfdiscod_to) ,
                                              AV97Pedidos_generacionaccesorios1ds_5_tfdisfec ,
                                              Integer.valueOf(AV98Pedidos_generacionaccesorios1ds_6_tfclicod) ,
                                              Integer.valueOf(AV99Pedidos_generacionaccesorios1ds_7_tfclicod_to) ,
                                              AV101Pedidos_generacionaccesorios1ds_9_tfclinom_sel ,
                                              AV100Pedidos_generacionaccesorios1ds_8_tfclinom ,
                                              Short.valueOf(AV102Pedidos_generacionaccesorios1ds_10_tfdispart) ,
                                              Short.valueOf(AV103Pedidos_generacionaccesorios1ds_11_tfdispart_to) ,
                                              AV105Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel ,
                                              AV104Pedidos_generacionaccesorios1ds_12_tfdisartcod ,
                                              AV107Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel ,
                                              AV106Pedidos_generacionaccesorios1ds_14_tfdisartdsc ,
                                              AV109Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel ,
                                              AV108Pedidos_generacionaccesorios1ds_16_tfdiscolnom ,
                                              Integer.valueOf(AV110Pedidos_generacionaccesorios1ds_18_tfdiscolnum) ,
                                              Integer.valueOf(AV111Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to) ,
                                              Byte.valueOf(AV112Pedidos_generacionaccesorios1ds_20_tfdistipcol) ,
                                              Byte.valueOf(AV113Pedidos_generacionaccesorios1ds_21_tfdistipcol_to) ,
                                              AV115Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel ,
                                              AV114Pedidos_generacionaccesorios1ds_22_tfdisnomcli ,
                                              AV117Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel ,
                                              AV116Pedidos_generacionaccesorios1ds_24_tfdisunimed ,
                                              AV125Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel ,
                                              AV124Pedidos_generacionaccesorios1ds_32_tfmaqcoddis ,
                                              Integer.valueOf(AV126Pedidos_generacionaccesorios1ds_34_tfdisvolmaq) ,
                                              Integer.valueOf(AV127Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to) ,
                                              AV129Pedidos_generacionaccesorios1ds_37_tfrevenid_sel ,
                                              AV128Pedidos_generacionaccesorios1ds_36_tfrevenid ,
                                              A4348DisUsrCod ,
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
                                              A1122MaqCodDis ,
                                              Integer.valueOf(A6547DisVolMaq) ,
                                              A12328RevenID ,
                                              Short.valueOf(AV118Pedidos_generacionaccesorios1ds_26_tfdispiepie) ,
                                              Short.valueOf(A387DisPiePie) ,
                                              Short.valueOf(AV119Pedidos_generacionaccesorios1ds_27_tfdispiepie_to) ,
                                              AV120Pedidos_generacionaccesorios1ds_28_tfdispiekgm ,
                                              A381DisPieKgm ,
                                              AV121Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to ,
                                              AV122Pedidos_generacionaccesorios1ds_30_tfdispiemtr ,
                                              A385DisPieMtr ,
                                              AV123Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to ,
                                              Byte.valueOf(A367DisEst) ,
                                              Byte.valueOf(AV16DisEst) ,
                                              AV5EmprCod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                              TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                              TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV93Pedidos_generacionaccesorios1ds_1_tfdisusrcod = GXutil.padr( GXutil.rtrim( AV93Pedidos_generacionaccesorios1ds_1_tfdisusrcod), 8, "%") ;
         lV100Pedidos_generacionaccesorios1ds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV100Pedidos_generacionaccesorios1ds_8_tfclinom), 30, "%") ;
         lV104Pedidos_generacionaccesorios1ds_12_tfdisartcod = GXutil.padr( GXutil.rtrim( AV104Pedidos_generacionaccesorios1ds_12_tfdisartcod), 16, "%") ;
         lV106Pedidos_generacionaccesorios1ds_14_tfdisartdsc = GXutil.padr( GXutil.rtrim( AV106Pedidos_generacionaccesorios1ds_14_tfdisartdsc), 26, "%") ;
         lV108Pedidos_generacionaccesorios1ds_16_tfdiscolnom = GXutil.padr( GXutil.rtrim( AV108Pedidos_generacionaccesorios1ds_16_tfdiscolnom), 13, "%") ;
         lV114Pedidos_generacionaccesorios1ds_22_tfdisnomcli = GXutil.padr( GXutil.rtrim( AV114Pedidos_generacionaccesorios1ds_22_tfdisnomcli), 13, "%") ;
         lV116Pedidos_generacionaccesorios1ds_24_tfdisunimed = GXutil.padr( GXutil.rtrim( AV116Pedidos_generacionaccesorios1ds_24_tfdisunimed), 1, "%") ;
         lV124Pedidos_generacionaccesorios1ds_32_tfmaqcoddis = GXutil.padr( GXutil.rtrim( AV124Pedidos_generacionaccesorios1ds_32_tfmaqcoddis), 6, "%") ;
         lV128Pedidos_generacionaccesorios1ds_36_tfrevenid = GXutil.padr( GXutil.rtrim( AV128Pedidos_generacionaccesorios1ds_36_tfrevenid), 10, "%") ;
         /* Using cursor H025T5 */
         pr_default.execute(1, new Object[] {AV5EmprCod, Short.valueOf(AV118Pedidos_generacionaccesorios1ds_26_tfdispiepie), Short.valueOf(AV118Pedidos_generacionaccesorios1ds_26_tfdispiepie), Short.valueOf(AV119Pedidos_generacionaccesorios1ds_27_tfdispiepie_to), Short.valueOf(AV119Pedidos_generacionaccesorios1ds_27_tfdispiepie_to), Byte.valueOf(AV16DisEst), lV93Pedidos_generacionaccesorios1ds_1_tfdisusrcod, AV94Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel, Integer.valueOf(AV95Pedidos_generacionaccesorios1ds_3_tfdiscod), Integer.valueOf(AV96Pedidos_generacionaccesorios1ds_4_tfdiscod_to), AV97Pedidos_generacionaccesorios1ds_5_tfdisfec, Integer.valueOf(AV98Pedidos_generacionaccesorios1ds_6_tfclicod), Integer.valueOf(AV99Pedidos_generacionaccesorios1ds_7_tfclicod_to), lV100Pedidos_generacionaccesorios1ds_8_tfclinom, AV101Pedidos_generacionaccesorios1ds_9_tfclinom_sel, Short.valueOf(AV102Pedidos_generacionaccesorios1ds_10_tfdispart), Short.valueOf(AV103Pedidos_generacionaccesorios1ds_11_tfdispart_to), lV104Pedidos_generacionaccesorios1ds_12_tfdisartcod, AV105Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel, lV106Pedidos_generacionaccesorios1ds_14_tfdisartdsc, AV107Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel, lV108Pedidos_generacionaccesorios1ds_16_tfdiscolnom, AV109Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel, Integer.valueOf(AV110Pedidos_generacionaccesorios1ds_18_tfdiscolnum), Integer.valueOf(AV111Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to), Byte.valueOf(AV112Pedidos_generacionaccesorios1ds_20_tfdistipcol), Byte.valueOf(AV113Pedidos_generacionaccesorios1ds_21_tfdistipcol_to), lV114Pedidos_generacionaccesorios1ds_22_tfdisnomcli, AV115Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel, lV116Pedidos_generacionaccesorios1ds_24_tfdisunimed, AV117Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel, lV124Pedidos_generacionaccesorios1ds_32_tfmaqcoddis, AV125Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel, Integer.valueOf(AV126Pedidos_generacionaccesorios1ds_34_tfdisvolmaq), Integer.valueOf(AV127Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to), lV128Pedidos_generacionaccesorios1ds_36_tfrevenid, AV129Pedidos_generacionaccesorios1ds_37_tfrevenid_sel});
         nGXsfl_62_idx = 1 ;
         sGXsfl_62_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_62_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_622( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A361DisCod = H025T5_A361DisCod[0] ;
            A396EmprCod = H025T5_A396EmprCod[0] ;
            A367DisEst = H025T5_A367DisEst[0] ;
            A360DisCliNum = H025T5_A360DisCliNum[0] ;
            A4813DisEncCli = H025T5_A4813DisEncCli[0] ;
            A12328RevenID = H025T5_A12328RevenID[0] ;
            n12328RevenID = H025T5_n12328RevenID[0] ;
            A6547DisVolMaq = H025T5_A6547DisVolMaq[0] ;
            A1122MaqCodDis = H025T5_A1122MaqCodDis[0] ;
            n1122MaqCodDis = H025T5_n1122MaqCodDis[0] ;
            A392DisUniMed = H025T5_A392DisUniMed[0] ;
            A1195DisNomCli = H025T5_A1195DisNomCli[0] ;
            A390DisTipCol = H025T5_A390DisTipCol[0] ;
            n390DisTipCol = H025T5_n390DisTipCol[0] ;
            A363DisColNum = H025T5_A363DisColNum[0] ;
            n363DisColNum = H025T5_n363DisColNum[0] ;
            A362DisColNom = H025T5_A362DisColNom[0] ;
            n362DisColNom = H025T5_n362DisColNom[0] ;
            A337DisArtDsc = H025T5_A337DisArtDsc[0] ;
            A335DisArtCod = H025T5_A335DisArtCod[0] ;
            A1502DisPart = H025T5_A1502DisPart[0] ;
            A279CliNom = H025T5_A279CliNom[0] ;
            A252CliCod = H025T5_A252CliCod[0] ;
            A369DisFec = H025T5_A369DisFec[0] ;
            A4348DisUsrCod = H025T5_A4348DisUsrCod[0] ;
            A387DisPiePie = H025T5_A387DisPiePie[0] ;
            n387DisPiePie = H025T5_n387DisPiePie[0] ;
            A365DisDes = H025T5_A365DisDes[0] ;
            A387DisPiePie = H025T5_A387DisPiePie[0] ;
            n387DisPiePie = H025T5_n387DisPiePie[0] ;
            A279CliNom = H025T5_A279CliNom[0] ;
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
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV120Pedidos_generacionaccesorios1ds_28_tfdispiekgm)==0) || ( ( DecimalUtil.compareTo(A381DisPieKgm, AV120Pedidos_generacionaccesorios1ds_28_tfdispiekgm) >= 0 ) ) )
            {
               if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to)==0) || ( ( DecimalUtil.compareTo(A381DisPieKgm, AV121Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to) <= 0 ) ) )
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
                  if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Pedidos_generacionaccesorios1ds_30_tfdispiemtr)==0) || ( ( DecimalUtil.compareTo(A385DisPieMtr, AV122Pedidos_generacionaccesorios1ds_30_tfdispiemtr) >= 0 ) ) )
                  {
                     if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to)==0) || ( ( DecimalUtil.compareTo(A385DisPieMtr, AV123Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to) <= 0 ) ) )
                     {
                        e2225T2 ();
                     }
                  }
               }
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(62) ;
         wb25T0( ) ;
      }
      bGXsfl_62_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes25T2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTDISPIEPIE", GXutil.ltrim( localUtil.ntoc( AV69TotDisPiePie, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTDISPIEPIE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV69TotDisPiePie), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTDISPIEKGM", GXutil.ltrim( localUtil.ntoc( AV67TotDisPieKgm, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTDISPIEKGM", getSecureSignedToken( sPrefix, localUtil.format( AV67TotDisPieKgm, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTDISPIEMTR", GXutil.ltrim( localUtil.ntoc( AV68TotDisPieMtr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTDISPIEMTR", getSecureSignedToken( sPrefix, localUtil.format( AV68TotDisPieMtr, "ZZZZZ9.99")));
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
      AV93Pedidos_generacionaccesorios1ds_1_tfdisusrcod = AV82TFDisUsrCod ;
      AV94Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel = AV83TFDisUsrCod_Sel ;
      AV95Pedidos_generacionaccesorios1ds_3_tfdiscod = AV43TFDisCod ;
      AV96Pedidos_generacionaccesorios1ds_4_tfdiscod_to = AV44TFDisCod_To ;
      AV97Pedidos_generacionaccesorios1ds_5_tfdisfec = AV51TFDisFec ;
      AV98Pedidos_generacionaccesorios1ds_6_tfclicod = AV35TFCliCod ;
      AV99Pedidos_generacionaccesorios1ds_7_tfclicod_to = AV36TFCliCod_To ;
      AV100Pedidos_generacionaccesorios1ds_8_tfclinom = AV37TFCliNom ;
      AV101Pedidos_generacionaccesorios1ds_9_tfclinom_sel = AV38TFCliNom_Sel ;
      AV102Pedidos_generacionaccesorios1ds_10_tfdispart = AV55TFDisPart ;
      AV103Pedidos_generacionaccesorios1ds_11_tfdispart_to = AV56TFDisPart_To ;
      AV104Pedidos_generacionaccesorios1ds_12_tfdisartcod = AV39TFDisArtCod ;
      AV105Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel = AV40TFDisArtCod_Sel ;
      AV106Pedidos_generacionaccesorios1ds_14_tfdisartdsc = AV41TFDisArtDsc ;
      AV107Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel = AV42TFDisArtDsc_Sel ;
      AV108Pedidos_generacionaccesorios1ds_16_tfdiscolnom = AV45TFDisColNom ;
      AV109Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel = AV46TFDisColNom_Sel ;
      AV110Pedidos_generacionaccesorios1ds_18_tfdiscolnum = AV47TFDisColNum ;
      AV111Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to = AV48TFDisColNum_To ;
      AV112Pedidos_generacionaccesorios1ds_20_tfdistipcol = AV63TFDisTipCol ;
      AV113Pedidos_generacionaccesorios1ds_21_tfdistipcol_to = AV64TFDisTipCol_To ;
      AV114Pedidos_generacionaccesorios1ds_22_tfdisnomcli = AV53TFDisNomCli ;
      AV115Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel = AV54TFDisNomCli_Sel ;
      AV116Pedidos_generacionaccesorios1ds_24_tfdisunimed = AV65TFDisUniMed ;
      AV117Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel = AV66TFDisUniMed_Sel ;
      AV118Pedidos_generacionaccesorios1ds_26_tfdispiepie = AV61TFDisPiePie ;
      AV119Pedidos_generacionaccesorios1ds_27_tfdispiepie_to = AV62TFDisPiePie_To ;
      AV120Pedidos_generacionaccesorios1ds_28_tfdispiekgm = AV57TFDisPieKgm ;
      AV121Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to = AV58TFDisPieKgm_To ;
      AV122Pedidos_generacionaccesorios1ds_30_tfdispiemtr = AV59TFDisPieMtr ;
      AV123Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to = AV60TFDisPieMtr_To ;
      AV124Pedidos_generacionaccesorios1ds_32_tfmaqcoddis = AV84TFMaqCodDis ;
      AV125Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel = AV85TFMaqCodDis_Sel ;
      AV126Pedidos_generacionaccesorios1ds_34_tfdisvolmaq = AV86TFDisVolMaq ;
      AV127Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to = AV87TFDisVolMaq_To ;
      AV128Pedidos_generacionaccesorios1ds_36_tfrevenid = AV88TFRevenID ;
      AV129Pedidos_generacionaccesorios1ds_37_tfrevenid_sel = AV89TFRevenID_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV5EmprCod, AV16DisEst, AV82TFDisUsrCod, AV83TFDisUsrCod_Sel, AV43TFDisCod, AV44TFDisCod_To, AV51TFDisFec, AV35TFCliCod, AV36TFCliCod_To, AV37TFCliNom, AV38TFCliNom_Sel, AV55TFDisPart, AV56TFDisPart_To, AV39TFDisArtCod, AV40TFDisArtCod_Sel, AV41TFDisArtDsc, AV42TFDisArtDsc_Sel, AV45TFDisColNom, AV46TFDisColNom_Sel, AV47TFDisColNum, AV48TFDisColNum_To, AV63TFDisTipCol, AV64TFDisTipCol_To, AV53TFDisNomCli, AV54TFDisNomCli_Sel, AV65TFDisUniMed, AV66TFDisUniMed_Sel, AV61TFDisPiePie, AV62TFDisPiePie_To, AV57TFDisPieKgm, AV58TFDisPieKgm_To, AV59TFDisPieMtr, AV60TFDisPieMtr_To, AV84TFMaqCodDis, AV85TFMaqCodDis_Sel, AV86TFDisVolMaq, AV87TFDisVolMaq_To, AV88TFRevenID, AV89TFRevenID_Sel, AV92Pgmname, AV81BarNHdr, AV69TotDisPiePie, AV67TotDisPieKgm, AV68TotDisPieMtr, A1202MacDisCod, A1199MacCod, AV77Col_Discod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV93Pedidos_generacionaccesorios1ds_1_tfdisusrcod = AV82TFDisUsrCod ;
      AV94Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel = AV83TFDisUsrCod_Sel ;
      AV95Pedidos_generacionaccesorios1ds_3_tfdiscod = AV43TFDisCod ;
      AV96Pedidos_generacionaccesorios1ds_4_tfdiscod_to = AV44TFDisCod_To ;
      AV97Pedidos_generacionaccesorios1ds_5_tfdisfec = AV51TFDisFec ;
      AV98Pedidos_generacionaccesorios1ds_6_tfclicod = AV35TFCliCod ;
      AV99Pedidos_generacionaccesorios1ds_7_tfclicod_to = AV36TFCliCod_To ;
      AV100Pedidos_generacionaccesorios1ds_8_tfclinom = AV37TFCliNom ;
      AV101Pedidos_generacionaccesorios1ds_9_tfclinom_sel = AV38TFCliNom_Sel ;
      AV102Pedidos_generacionaccesorios1ds_10_tfdispart = AV55TFDisPart ;
      AV103Pedidos_generacionaccesorios1ds_11_tfdispart_to = AV56TFDisPart_To ;
      AV104Pedidos_generacionaccesorios1ds_12_tfdisartcod = AV39TFDisArtCod ;
      AV105Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel = AV40TFDisArtCod_Sel ;
      AV106Pedidos_generacionaccesorios1ds_14_tfdisartdsc = AV41TFDisArtDsc ;
      AV107Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel = AV42TFDisArtDsc_Sel ;
      AV108Pedidos_generacionaccesorios1ds_16_tfdiscolnom = AV45TFDisColNom ;
      AV109Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel = AV46TFDisColNom_Sel ;
      AV110Pedidos_generacionaccesorios1ds_18_tfdiscolnum = AV47TFDisColNum ;
      AV111Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to = AV48TFDisColNum_To ;
      AV112Pedidos_generacionaccesorios1ds_20_tfdistipcol = AV63TFDisTipCol ;
      AV113Pedidos_generacionaccesorios1ds_21_tfdistipcol_to = AV64TFDisTipCol_To ;
      AV114Pedidos_generacionaccesorios1ds_22_tfdisnomcli = AV53TFDisNomCli ;
      AV115Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel = AV54TFDisNomCli_Sel ;
      AV116Pedidos_generacionaccesorios1ds_24_tfdisunimed = AV65TFDisUniMed ;
      AV117Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel = AV66TFDisUniMed_Sel ;
      AV118Pedidos_generacionaccesorios1ds_26_tfdispiepie = AV61TFDisPiePie ;
      AV119Pedidos_generacionaccesorios1ds_27_tfdispiepie_to = AV62TFDisPiePie_To ;
      AV120Pedidos_generacionaccesorios1ds_28_tfdispiekgm = AV57TFDisPieKgm ;
      AV121Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to = AV58TFDisPieKgm_To ;
      AV122Pedidos_generacionaccesorios1ds_30_tfdispiemtr = AV59TFDisPieMtr ;
      AV123Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to = AV60TFDisPieMtr_To ;
      AV124Pedidos_generacionaccesorios1ds_32_tfmaqcoddis = AV84TFMaqCodDis ;
      AV125Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel = AV85TFMaqCodDis_Sel ;
      AV126Pedidos_generacionaccesorios1ds_34_tfdisvolmaq = AV86TFDisVolMaq ;
      AV127Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to = AV87TFDisVolMaq_To ;
      AV128Pedidos_generacionaccesorios1ds_36_tfrevenid = AV88TFRevenID ;
      AV129Pedidos_generacionaccesorios1ds_37_tfrevenid_sel = AV89TFRevenID_Sel ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV5EmprCod, AV16DisEst, AV82TFDisUsrCod, AV83TFDisUsrCod_Sel, AV43TFDisCod, AV44TFDisCod_To, AV51TFDisFec, AV35TFCliCod, AV36TFCliCod_To, AV37TFCliNom, AV38TFCliNom_Sel, AV55TFDisPart, AV56TFDisPart_To, AV39TFDisArtCod, AV40TFDisArtCod_Sel, AV41TFDisArtDsc, AV42TFDisArtDsc_Sel, AV45TFDisColNom, AV46TFDisColNom_Sel, AV47TFDisColNum, AV48TFDisColNum_To, AV63TFDisTipCol, AV64TFDisTipCol_To, AV53TFDisNomCli, AV54TFDisNomCli_Sel, AV65TFDisUniMed, AV66TFDisUniMed_Sel, AV61TFDisPiePie, AV62TFDisPiePie_To, AV57TFDisPieKgm, AV58TFDisPieKgm_To, AV59TFDisPieMtr, AV60TFDisPieMtr_To, AV84TFMaqCodDis, AV85TFMaqCodDis_Sel, AV86TFDisVolMaq, AV87TFDisVolMaq_To, AV88TFRevenID, AV89TFRevenID_Sel, AV92Pgmname, AV81BarNHdr, AV69TotDisPiePie, AV67TotDisPieKgm, AV68TotDisPieMtr, A1202MacDisCod, A1199MacCod, AV77Col_Discod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV93Pedidos_generacionaccesorios1ds_1_tfdisusrcod = AV82TFDisUsrCod ;
      AV94Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel = AV83TFDisUsrCod_Sel ;
      AV95Pedidos_generacionaccesorios1ds_3_tfdiscod = AV43TFDisCod ;
      AV96Pedidos_generacionaccesorios1ds_4_tfdiscod_to = AV44TFDisCod_To ;
      AV97Pedidos_generacionaccesorios1ds_5_tfdisfec = AV51TFDisFec ;
      AV98Pedidos_generacionaccesorios1ds_6_tfclicod = AV35TFCliCod ;
      AV99Pedidos_generacionaccesorios1ds_7_tfclicod_to = AV36TFCliCod_To ;
      AV100Pedidos_generacionaccesorios1ds_8_tfclinom = AV37TFCliNom ;
      AV101Pedidos_generacionaccesorios1ds_9_tfclinom_sel = AV38TFCliNom_Sel ;
      AV102Pedidos_generacionaccesorios1ds_10_tfdispart = AV55TFDisPart ;
      AV103Pedidos_generacionaccesorios1ds_11_tfdispart_to = AV56TFDisPart_To ;
      AV104Pedidos_generacionaccesorios1ds_12_tfdisartcod = AV39TFDisArtCod ;
      AV105Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel = AV40TFDisArtCod_Sel ;
      AV106Pedidos_generacionaccesorios1ds_14_tfdisartdsc = AV41TFDisArtDsc ;
      AV107Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel = AV42TFDisArtDsc_Sel ;
      AV108Pedidos_generacionaccesorios1ds_16_tfdiscolnom = AV45TFDisColNom ;
      AV109Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel = AV46TFDisColNom_Sel ;
      AV110Pedidos_generacionaccesorios1ds_18_tfdiscolnum = AV47TFDisColNum ;
      AV111Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to = AV48TFDisColNum_To ;
      AV112Pedidos_generacionaccesorios1ds_20_tfdistipcol = AV63TFDisTipCol ;
      AV113Pedidos_generacionaccesorios1ds_21_tfdistipcol_to = AV64TFDisTipCol_To ;
      AV114Pedidos_generacionaccesorios1ds_22_tfdisnomcli = AV53TFDisNomCli ;
      AV115Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel = AV54TFDisNomCli_Sel ;
      AV116Pedidos_generacionaccesorios1ds_24_tfdisunimed = AV65TFDisUniMed ;
      AV117Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel = AV66TFDisUniMed_Sel ;
      AV118Pedidos_generacionaccesorios1ds_26_tfdispiepie = AV61TFDisPiePie ;
      AV119Pedidos_generacionaccesorios1ds_27_tfdispiepie_to = AV62TFDisPiePie_To ;
      AV120Pedidos_generacionaccesorios1ds_28_tfdispiekgm = AV57TFDisPieKgm ;
      AV121Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to = AV58TFDisPieKgm_To ;
      AV122Pedidos_generacionaccesorios1ds_30_tfdispiemtr = AV59TFDisPieMtr ;
      AV123Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to = AV60TFDisPieMtr_To ;
      AV124Pedidos_generacionaccesorios1ds_32_tfmaqcoddis = AV84TFMaqCodDis ;
      AV125Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel = AV85TFMaqCodDis_Sel ;
      AV126Pedidos_generacionaccesorios1ds_34_tfdisvolmaq = AV86TFDisVolMaq ;
      AV127Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to = AV87TFDisVolMaq_To ;
      AV128Pedidos_generacionaccesorios1ds_36_tfrevenid = AV88TFRevenID ;
      AV129Pedidos_generacionaccesorios1ds_37_tfrevenid_sel = AV89TFRevenID_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5EmprCod, AV16DisEst, AV82TFDisUsrCod, AV83TFDisUsrCod_Sel, AV43TFDisCod, AV44TFDisCod_To, AV51TFDisFec, AV35TFCliCod, AV36TFCliCod_To, AV37TFCliNom, AV38TFCliNom_Sel, AV55TFDisPart, AV56TFDisPart_To, AV39TFDisArtCod, AV40TFDisArtCod_Sel, AV41TFDisArtDsc, AV42TFDisArtDsc_Sel, AV45TFDisColNom, AV46TFDisColNom_Sel, AV47TFDisColNum, AV48TFDisColNum_To, AV63TFDisTipCol, AV64TFDisTipCol_To, AV53TFDisNomCli, AV54TFDisNomCli_Sel, AV65TFDisUniMed, AV66TFDisUniMed_Sel, AV61TFDisPiePie, AV62TFDisPiePie_To, AV57TFDisPieKgm, AV58TFDisPieKgm_To, AV59TFDisPieMtr, AV60TFDisPieMtr_To, AV84TFMaqCodDis, AV85TFMaqCodDis_Sel, AV86TFDisVolMaq, AV87TFDisVolMaq_To, AV88TFRevenID, AV89TFRevenID_Sel, AV92Pgmname, AV81BarNHdr, AV69TotDisPiePie, AV67TotDisPieKgm, AV68TotDisPieMtr, A1202MacDisCod, A1199MacCod, AV77Col_Discod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV93Pedidos_generacionaccesorios1ds_1_tfdisusrcod = AV82TFDisUsrCod ;
      AV94Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel = AV83TFDisUsrCod_Sel ;
      AV95Pedidos_generacionaccesorios1ds_3_tfdiscod = AV43TFDisCod ;
      AV96Pedidos_generacionaccesorios1ds_4_tfdiscod_to = AV44TFDisCod_To ;
      AV97Pedidos_generacionaccesorios1ds_5_tfdisfec = AV51TFDisFec ;
      AV98Pedidos_generacionaccesorios1ds_6_tfclicod = AV35TFCliCod ;
      AV99Pedidos_generacionaccesorios1ds_7_tfclicod_to = AV36TFCliCod_To ;
      AV100Pedidos_generacionaccesorios1ds_8_tfclinom = AV37TFCliNom ;
      AV101Pedidos_generacionaccesorios1ds_9_tfclinom_sel = AV38TFCliNom_Sel ;
      AV102Pedidos_generacionaccesorios1ds_10_tfdispart = AV55TFDisPart ;
      AV103Pedidos_generacionaccesorios1ds_11_tfdispart_to = AV56TFDisPart_To ;
      AV104Pedidos_generacionaccesorios1ds_12_tfdisartcod = AV39TFDisArtCod ;
      AV105Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel = AV40TFDisArtCod_Sel ;
      AV106Pedidos_generacionaccesorios1ds_14_tfdisartdsc = AV41TFDisArtDsc ;
      AV107Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel = AV42TFDisArtDsc_Sel ;
      AV108Pedidos_generacionaccesorios1ds_16_tfdiscolnom = AV45TFDisColNom ;
      AV109Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel = AV46TFDisColNom_Sel ;
      AV110Pedidos_generacionaccesorios1ds_18_tfdiscolnum = AV47TFDisColNum ;
      AV111Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to = AV48TFDisColNum_To ;
      AV112Pedidos_generacionaccesorios1ds_20_tfdistipcol = AV63TFDisTipCol ;
      AV113Pedidos_generacionaccesorios1ds_21_tfdistipcol_to = AV64TFDisTipCol_To ;
      AV114Pedidos_generacionaccesorios1ds_22_tfdisnomcli = AV53TFDisNomCli ;
      AV115Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel = AV54TFDisNomCli_Sel ;
      AV116Pedidos_generacionaccesorios1ds_24_tfdisunimed = AV65TFDisUniMed ;
      AV117Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel = AV66TFDisUniMed_Sel ;
      AV118Pedidos_generacionaccesorios1ds_26_tfdispiepie = AV61TFDisPiePie ;
      AV119Pedidos_generacionaccesorios1ds_27_tfdispiepie_to = AV62TFDisPiePie_To ;
      AV120Pedidos_generacionaccesorios1ds_28_tfdispiekgm = AV57TFDisPieKgm ;
      AV121Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to = AV58TFDisPieKgm_To ;
      AV122Pedidos_generacionaccesorios1ds_30_tfdispiemtr = AV59TFDisPieMtr ;
      AV123Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to = AV60TFDisPieMtr_To ;
      AV124Pedidos_generacionaccesorios1ds_32_tfmaqcoddis = AV84TFMaqCodDis ;
      AV125Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel = AV85TFMaqCodDis_Sel ;
      AV126Pedidos_generacionaccesorios1ds_34_tfdisvolmaq = AV86TFDisVolMaq ;
      AV127Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to = AV87TFDisVolMaq_To ;
      AV128Pedidos_generacionaccesorios1ds_36_tfrevenid = AV88TFRevenID ;
      AV129Pedidos_generacionaccesorios1ds_37_tfrevenid_sel = AV89TFRevenID_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5EmprCod, AV16DisEst, AV82TFDisUsrCod, AV83TFDisUsrCod_Sel, AV43TFDisCod, AV44TFDisCod_To, AV51TFDisFec, AV35TFCliCod, AV36TFCliCod_To, AV37TFCliNom, AV38TFCliNom_Sel, AV55TFDisPart, AV56TFDisPart_To, AV39TFDisArtCod, AV40TFDisArtCod_Sel, AV41TFDisArtDsc, AV42TFDisArtDsc_Sel, AV45TFDisColNom, AV46TFDisColNom_Sel, AV47TFDisColNum, AV48TFDisColNum_To, AV63TFDisTipCol, AV64TFDisTipCol_To, AV53TFDisNomCli, AV54TFDisNomCli_Sel, AV65TFDisUniMed, AV66TFDisUniMed_Sel, AV61TFDisPiePie, AV62TFDisPiePie_To, AV57TFDisPieKgm, AV58TFDisPieKgm_To, AV59TFDisPieMtr, AV60TFDisPieMtr_To, AV84TFMaqCodDis, AV85TFMaqCodDis_Sel, AV86TFDisVolMaq, AV87TFDisVolMaq_To, AV88TFRevenID, AV89TFRevenID_Sel, AV92Pgmname, AV81BarNHdr, AV69TotDisPiePie, AV67TotDisPieKgm, AV68TotDisPieMtr, A1202MacDisCod, A1199MacCod, AV77Col_Discod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV93Pedidos_generacionaccesorios1ds_1_tfdisusrcod = AV82TFDisUsrCod ;
      AV94Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel = AV83TFDisUsrCod_Sel ;
      AV95Pedidos_generacionaccesorios1ds_3_tfdiscod = AV43TFDisCod ;
      AV96Pedidos_generacionaccesorios1ds_4_tfdiscod_to = AV44TFDisCod_To ;
      AV97Pedidos_generacionaccesorios1ds_5_tfdisfec = AV51TFDisFec ;
      AV98Pedidos_generacionaccesorios1ds_6_tfclicod = AV35TFCliCod ;
      AV99Pedidos_generacionaccesorios1ds_7_tfclicod_to = AV36TFCliCod_To ;
      AV100Pedidos_generacionaccesorios1ds_8_tfclinom = AV37TFCliNom ;
      AV101Pedidos_generacionaccesorios1ds_9_tfclinom_sel = AV38TFCliNom_Sel ;
      AV102Pedidos_generacionaccesorios1ds_10_tfdispart = AV55TFDisPart ;
      AV103Pedidos_generacionaccesorios1ds_11_tfdispart_to = AV56TFDisPart_To ;
      AV104Pedidos_generacionaccesorios1ds_12_tfdisartcod = AV39TFDisArtCod ;
      AV105Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel = AV40TFDisArtCod_Sel ;
      AV106Pedidos_generacionaccesorios1ds_14_tfdisartdsc = AV41TFDisArtDsc ;
      AV107Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel = AV42TFDisArtDsc_Sel ;
      AV108Pedidos_generacionaccesorios1ds_16_tfdiscolnom = AV45TFDisColNom ;
      AV109Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel = AV46TFDisColNom_Sel ;
      AV110Pedidos_generacionaccesorios1ds_18_tfdiscolnum = AV47TFDisColNum ;
      AV111Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to = AV48TFDisColNum_To ;
      AV112Pedidos_generacionaccesorios1ds_20_tfdistipcol = AV63TFDisTipCol ;
      AV113Pedidos_generacionaccesorios1ds_21_tfdistipcol_to = AV64TFDisTipCol_To ;
      AV114Pedidos_generacionaccesorios1ds_22_tfdisnomcli = AV53TFDisNomCli ;
      AV115Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel = AV54TFDisNomCli_Sel ;
      AV116Pedidos_generacionaccesorios1ds_24_tfdisunimed = AV65TFDisUniMed ;
      AV117Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel = AV66TFDisUniMed_Sel ;
      AV118Pedidos_generacionaccesorios1ds_26_tfdispiepie = AV61TFDisPiePie ;
      AV119Pedidos_generacionaccesorios1ds_27_tfdispiepie_to = AV62TFDisPiePie_To ;
      AV120Pedidos_generacionaccesorios1ds_28_tfdispiekgm = AV57TFDisPieKgm ;
      AV121Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to = AV58TFDisPieKgm_To ;
      AV122Pedidos_generacionaccesorios1ds_30_tfdispiemtr = AV59TFDisPieMtr ;
      AV123Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to = AV60TFDisPieMtr_To ;
      AV124Pedidos_generacionaccesorios1ds_32_tfmaqcoddis = AV84TFMaqCodDis ;
      AV125Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel = AV85TFMaqCodDis_Sel ;
      AV126Pedidos_generacionaccesorios1ds_34_tfdisvolmaq = AV86TFDisVolMaq ;
      AV127Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to = AV87TFDisVolMaq_To ;
      AV128Pedidos_generacionaccesorios1ds_36_tfrevenid = AV88TFRevenID ;
      AV129Pedidos_generacionaccesorios1ds_37_tfrevenid_sel = AV89TFRevenID_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5EmprCod, AV16DisEst, AV82TFDisUsrCod, AV83TFDisUsrCod_Sel, AV43TFDisCod, AV44TFDisCod_To, AV51TFDisFec, AV35TFCliCod, AV36TFCliCod_To, AV37TFCliNom, AV38TFCliNom_Sel, AV55TFDisPart, AV56TFDisPart_To, AV39TFDisArtCod, AV40TFDisArtCod_Sel, AV41TFDisArtDsc, AV42TFDisArtDsc_Sel, AV45TFDisColNom, AV46TFDisColNom_Sel, AV47TFDisColNum, AV48TFDisColNum_To, AV63TFDisTipCol, AV64TFDisTipCol_To, AV53TFDisNomCli, AV54TFDisNomCli_Sel, AV65TFDisUniMed, AV66TFDisUniMed_Sel, AV61TFDisPiePie, AV62TFDisPiePie_To, AV57TFDisPieKgm, AV58TFDisPieKgm_To, AV59TFDisPieMtr, AV60TFDisPieMtr_To, AV84TFMaqCodDis, AV85TFMaqCodDis_Sel, AV86TFDisVolMaq, AV87TFDisVolMaq_To, AV88TFRevenID, AV89TFRevenID_Sel, AV92Pgmname, AV81BarNHdr, AV69TotDisPiePie, AV67TotDisPieKgm, AV68TotDisPieMtr, A1202MacDisCod, A1199MacCod, AV77Col_Discod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV92Pgmname = "Pedidos.GeneracionAccesorios1" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92Pgmname", AV92Pgmname);
      Gx_err = (short)(0) ;
      edtavBarnhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarnhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnhdr_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavMaccod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMaccod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaccod_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavDisenccli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDisenccli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDisenccli_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavTotvaluedispiepie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluedispiepie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluedispiepie_Enabled), 5, 0), true);
      edtavTotvaluedispiekgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluedispiekgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluedispiekgm_Enabled), 5, 0), true);
      edtavTotvaluedispiemtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluedispiemtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluedispiemtr_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup25T0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e2025T2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV15DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOL_DISCOD"), AV77Col_Discod);
         /* Read saved values. */
         nRC_GXsfl_62 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_62"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV18GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV19GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV5EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV5EmprCod") ;
         wcpOAV16DisEst = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV16DisEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV81BarNHdr = httpContext.cgiGet( sPrefix+"wcpOAV81BarNHdr") ;
         AV78i = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV22Hay_sel = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vHAY_SEL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
         Ddo_grid_Includefilter = httpContext.cgiGet( sPrefix+"DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( sPrefix+"DDO_GRID_Filtertype") ;
         Ddo_grid_Filterisrange = httpContext.cgiGet( sPrefix+"DDO_GRID_Filterisrange") ;
         Ddo_grid_Includedatalist = httpContext.cgiGet( sPrefix+"DDO_GRID_Includedatalist") ;
         Ddo_grid_Datalisttype = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalisttype") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalistproc") ;
         Dvelop_confirmpanel_crearaccesorios_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CREARACCESORIOS_Title") ;
         Dvelop_confirmpanel_crearaccesorios_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CREARACCESORIOS_Confirmationtext") ;
         Dvelop_confirmpanel_crearaccesorios_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CREARACCESORIOS_Yesbuttoncaption") ;
         Dvelop_confirmpanel_crearaccesorios_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CREARACCESORIOS_Nobuttoncaption") ;
         Dvelop_confirmpanel_crearaccesorios_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CREARACCESORIOS_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_crearaccesorios_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CREARACCESORIOS_Yesbuttonposition") ;
         Dvelop_confirmpanel_crearaccesorios_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CREARACCESORIOS_Confirmtype") ;
         Dvelop_confirmpanel_eliminaraccesorios_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARACCESORIOS_Title") ;
         Dvelop_confirmpanel_eliminaraccesorios_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARACCESORIOS_Confirmationtext") ;
         Dvelop_confirmpanel_eliminaraccesorios_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARACCESORIOS_Yesbuttoncaption") ;
         Dvelop_confirmpanel_eliminaraccesorios_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARACCESORIOS_Nobuttoncaption") ;
         Dvelop_confirmpanel_eliminaraccesorios_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARACCESORIOS_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_eliminaraccesorios_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARACCESORIOS_Yesbuttonposition") ;
         Dvelop_confirmpanel_eliminaraccesorios_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARACCESORIOS_Confirmtype") ;
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
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedcolumn") ;
         Dvelop_confirmpanel_crearaccesorios_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CREARACCESORIOS_Result") ;
         Dvelop_confirmpanel_eliminaraccesorios_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARACCESORIOS_Result") ;
         /* Read variables values. */
         AV92Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92Pgmname", AV92Pgmname);
         AV72TotValueDisPiePie = httpContext.cgiGet( edtavTotvaluedispiepie_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72TotValueDisPiePie", AV72TotValueDisPiePie);
         AV70TotValueDisPieKgm = httpContext.cgiGet( edtavTotvaluedispiekgm_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70TotValueDisPieKgm", AV70TotValueDisPieKgm);
         AV71TotValueDisPieMtr = httpContext.cgiGet( edtavTotvaluedispiemtr_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TotValueDisPieMtr", AV71TotValueDisPieMtr);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_disfecauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_DISFECAUXDATE");
            GX_FocusControl = edtavDdo_disfecauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13DDO_DisFecAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13DDO_DisFecAuxDate", localUtil.format(AV13DDO_DisFecAuxDate, "99/99/99"));
         }
         else
         {
            AV13DDO_DisFecAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_disfecauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13DDO_DisFecAuxDate", localUtil.format(AV13DDO_DisFecAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         nGXsfl_62_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_62_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_62_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_622( ) ;
         if ( nGXsfl_62_idx > 0 )
         {
            AV33Seleccionar = ((GXutil.strcmp(httpContext.cgiGet( chkavSeleccionar.getInternalname()), "S")==0) ? "S" : "N") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionar.getInternalname(), AV33Seleccionar);
            A4348DisUsrCod = httpContext.cgiGet( edtDisUsrCod_Internalname) ;
            A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A369DisFec = localUtil.ctod( httpContext.cgiGet( edtDisFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavMaccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavMaccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMACCOD");
               GX_FocusControl = edtavMaccod_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV25MacCod = 0 ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMaccod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25MacCod), 8, 0));
            }
            else
            {
               AV25MacCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavMaccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMaccod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25MacCod), 8, 0));
            }
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            AV80DisEncCli = httpContext.cgiGet( edtavDisenccli_Internalname) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDisenccli_Internalname, AV80DisEncCli);
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
            A1122MaqCodDis = httpContext.cgiGet( edtMaqCodDis_Internalname) ;
            n1122MaqCodDis = false ;
            A6547DisVolMaq = (int)(localUtil.ctol( httpContext.cgiGet( edtDisVolMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A12328RevenID = httpContext.cgiGet( edtRevenID_Internalname) ;
            n12328RevenID = false ;
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"GeneracionAccesorios1");
         AV92Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92Pgmname", AV92Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV92Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("pedidos\\generacionaccesorios1:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e2025T2 ();
      if (returnInSub) return;
   }

   public void e2025T2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      generacionaccesorios1_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Station = GXt_char1 ;
      GXv_char2[0] = AV5EmprCod ;
      GXv_char3[0] = AV6EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV7Station, GXv_char2, GXv_char3, GXv_char4) ;
      generacionaccesorios1_impl.this.AV5EmprCod = GXv_char2[0] ;
      generacionaccesorios1_impl.this.AV6EmprNom = GXv_char3[0] ;
      generacionaccesorios1_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5EmprCod", AV5EmprCod);
      divUnnamedtable1_Height = 500 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, divUnnamedtable1_Internalname, "Height", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable1_Height), 9, 0), true);
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV15DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV15DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e2125T2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV76WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV76WWPContext = GXv_SdtWWPContext7[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S142 ();
      if (returnInSub) return;
      AV18GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18GridCurrentPage), 10, 0));
      AV19GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19GridPageCount), 10, 0));
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S152 ();
      if (returnInSub) return;
      AV93Pedidos_generacionaccesorios1ds_1_tfdisusrcod = AV82TFDisUsrCod ;
      AV94Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel = AV83TFDisUsrCod_Sel ;
      AV95Pedidos_generacionaccesorios1ds_3_tfdiscod = AV43TFDisCod ;
      AV96Pedidos_generacionaccesorios1ds_4_tfdiscod_to = AV44TFDisCod_To ;
      AV97Pedidos_generacionaccesorios1ds_5_tfdisfec = AV51TFDisFec ;
      AV98Pedidos_generacionaccesorios1ds_6_tfclicod = AV35TFCliCod ;
      AV99Pedidos_generacionaccesorios1ds_7_tfclicod_to = AV36TFCliCod_To ;
      AV100Pedidos_generacionaccesorios1ds_8_tfclinom = AV37TFCliNom ;
      AV101Pedidos_generacionaccesorios1ds_9_tfclinom_sel = AV38TFCliNom_Sel ;
      AV102Pedidos_generacionaccesorios1ds_10_tfdispart = AV55TFDisPart ;
      AV103Pedidos_generacionaccesorios1ds_11_tfdispart_to = AV56TFDisPart_To ;
      AV104Pedidos_generacionaccesorios1ds_12_tfdisartcod = AV39TFDisArtCod ;
      AV105Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel = AV40TFDisArtCod_Sel ;
      AV106Pedidos_generacionaccesorios1ds_14_tfdisartdsc = AV41TFDisArtDsc ;
      AV107Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel = AV42TFDisArtDsc_Sel ;
      AV108Pedidos_generacionaccesorios1ds_16_tfdiscolnom = AV45TFDisColNom ;
      AV109Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel = AV46TFDisColNom_Sel ;
      AV110Pedidos_generacionaccesorios1ds_18_tfdiscolnum = AV47TFDisColNum ;
      AV111Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to = AV48TFDisColNum_To ;
      AV112Pedidos_generacionaccesorios1ds_20_tfdistipcol = AV63TFDisTipCol ;
      AV113Pedidos_generacionaccesorios1ds_21_tfdistipcol_to = AV64TFDisTipCol_To ;
      AV114Pedidos_generacionaccesorios1ds_22_tfdisnomcli = AV53TFDisNomCli ;
      AV115Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel = AV54TFDisNomCli_Sel ;
      AV116Pedidos_generacionaccesorios1ds_24_tfdisunimed = AV65TFDisUniMed ;
      AV117Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel = AV66TFDisUniMed_Sel ;
      AV118Pedidos_generacionaccesorios1ds_26_tfdispiepie = AV61TFDisPiePie ;
      AV119Pedidos_generacionaccesorios1ds_27_tfdispiepie_to = AV62TFDisPiePie_To ;
      AV120Pedidos_generacionaccesorios1ds_28_tfdispiekgm = AV57TFDisPieKgm ;
      AV121Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to = AV58TFDisPieKgm_To ;
      AV122Pedidos_generacionaccesorios1ds_30_tfdispiemtr = AV59TFDisPieMtr ;
      AV123Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to = AV60TFDisPieMtr_To ;
      AV124Pedidos_generacionaccesorios1ds_32_tfmaqcoddis = AV84TFMaqCodDis ;
      AV125Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel = AV85TFMaqCodDis_Sel ;
      AV126Pedidos_generacionaccesorios1ds_34_tfdisvolmaq = AV86TFDisVolMaq ;
      AV127Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to = AV87TFDisVolMaq_To ;
      AV128Pedidos_generacionaccesorios1ds_36_tfrevenid = AV88TFRevenID ;
      AV129Pedidos_generacionaccesorios1ds_37_tfrevenid_sel = AV89TFRevenID_Sel ;
      /*  Sending Event outputs  */
   }

   public void e1325T2( )
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
         AV32PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV32PageToGo) ;
      }
   }

   public void e1425T2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e1525T2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisUsrCod") == 0 )
         {
            AV82TFDisUsrCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82TFDisUsrCod", AV82TFDisUsrCod);
            AV83TFDisUsrCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83TFDisUsrCod_Sel", AV83TFDisUsrCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisCod") == 0 )
         {
            AV43TFDisCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43TFDisCod), 8, 0));
            AV44TFDisCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFDisCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFDisCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisFec") == 0 )
         {
            AV51TFDisFec = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFDisFec", localUtil.format(AV51TFDisFec, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliCod") == 0 )
         {
            AV35TFCliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFCliCod), 6, 0));
            AV36TFCliCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliNom") == 0 )
         {
            AV37TFCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFCliNom", AV37TFCliNom);
            AV38TFCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFCliNom_Sel", AV38TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisPart") == 0 )
         {
            AV55TFDisPart = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFDisPart", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFDisPart), 4, 0));
            AV56TFDisPart_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFDisPart_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFDisPart_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisArtCod") == 0 )
         {
            AV39TFDisArtCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFDisArtCod", AV39TFDisArtCod);
            AV40TFDisArtCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFDisArtCod_Sel", AV40TFDisArtCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisArtDsc") == 0 )
         {
            AV41TFDisArtDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFDisArtDsc", AV41TFDisArtDsc);
            AV42TFDisArtDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFDisArtDsc_Sel", AV42TFDisArtDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisColNom") == 0 )
         {
            AV45TFDisColNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFDisColNom", AV45TFDisColNom);
            AV46TFDisColNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFDisColNom_Sel", AV46TFDisColNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisColNum") == 0 )
         {
            AV47TFDisColNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFDisColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFDisColNum), 6, 0));
            AV48TFDisColNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFDisColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFDisColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisTipCol") == 0 )
         {
            AV63TFDisTipCol = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFDisTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63TFDisTipCol), 2, 0));
            AV64TFDisTipCol_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFDisTipCol_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64TFDisTipCol_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisNomCli") == 0 )
         {
            AV53TFDisNomCli = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFDisNomCli", AV53TFDisNomCli);
            AV54TFDisNomCli_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFDisNomCli_Sel", AV54TFDisNomCli_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisUniMed") == 0 )
         {
            AV65TFDisUniMed = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFDisUniMed", AV65TFDisUniMed);
            AV66TFDisUniMed_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFDisUniMed_Sel", AV66TFDisUniMed_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisPiePie") == 0 )
         {
            AV61TFDisPiePie = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFDisPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61TFDisPiePie), 4, 0));
            AV62TFDisPiePie_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFDisPiePie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62TFDisPiePie_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisPieKgm") == 0 )
         {
            AV57TFDisPieKgm = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFDisPieKgm", GXutil.ltrimstr( AV57TFDisPieKgm, 9, 2));
            AV58TFDisPieKgm_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFDisPieKgm_To", GXutil.ltrimstr( AV58TFDisPieKgm_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisPieMtr") == 0 )
         {
            AV59TFDisPieMtr = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFDisPieMtr", GXutil.ltrimstr( AV59TFDisPieMtr, 9, 2));
            AV60TFDisPieMtr_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFDisPieMtr_To", GXutil.ltrimstr( AV60TFDisPieMtr_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MaqCodDis") == 0 )
         {
            AV84TFMaqCodDis = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84TFMaqCodDis", AV84TFMaqCodDis);
            AV85TFMaqCodDis_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85TFMaqCodDis_Sel", AV85TFMaqCodDis_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisVolMaq") == 0 )
         {
            AV86TFDisVolMaq = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86TFDisVolMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV86TFDisVolMaq), 5, 0));
            AV87TFDisVolMaq_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV87TFDisVolMaq_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV87TFDisVolMaq_To), 5, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RevenID") == 0 )
         {
            AV88TFRevenID = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88TFRevenID", AV88TFRevenID);
            AV89TFRevenID_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89TFRevenID_Sel", AV89TFRevenID_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e2225T2( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         AV33Seleccionar = "N" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionar.getInternalname(), AV33Seleccionar);
         AV130GXLvl148 = (byte)(0) ;
         /* Using cursor H025T6 */
         pr_default.execute(2, new Object[] {AV5EmprCod, Integer.valueOf(A361DisCod)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A1202MacDisCod = H025T6_A1202MacDisCod[0] ;
            A396EmprCod = H025T6_A396EmprCod[0] ;
            A1199MacCod = H025T6_A1199MacCod[0] ;
            AV130GXLvl148 = (byte)(1) ;
            AV25MacCod = A1199MacCod ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMaccod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25MacCod), 8, 0));
            pr_default.readNext(2);
         }
         pr_default.close(2);
         if ( AV130GXLvl148 == 0 )
         {
            AV25MacCod = 0 ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMaccod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25MacCod), 8, 0));
         }
         AV80DisEncCli = ((GXutil.strcmp(A4813DisEncCli, " ")!=0) ? A4813DisEncCli : A360DisCliNum) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDisenccli_Internalname, AV80DisEncCli);
         AV33Seleccionar = "N" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionar.getInternalname(), AV33Seleccionar);
         AV78i = (short)(1) ;
         while ( AV78i <= AV77Col_Discod.size() )
         {
            if ( ((Number) AV77Col_Discod.elementAt(-1+AV78i)).intValue() == A361DisCod )
            {
               AV33Seleccionar = "S" ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionar.getInternalname(), AV33Seleccionar);
               if (true) break;
            }
            AV78i = (short)(AV78i+1) ;
         }
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(62) ;
         }
         sendrow_622( ) ;
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
      if ( isFullAjaxMode( ) && ! bGXsfl_62_Refreshing )
      {
         httpContext.doAjaxLoad(62, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e1825T2( )
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

   public void e1925T2( )
   {
      /* 'DoGenerarHdrs' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.pedidos.contenedorcrearhdrs", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(1,9,0)),GXutil.URLEncode(GXutil.rtrim(AV81BarNHdr))}, new String[] {"Emprcod","Disest","barnhdr"}) , new Object[] {});
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void e1625T2( )
   {
      /* Dvelop_confirmpanel_crearaccesorios_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_crearaccesorios_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION CREARACCESORIOS' */
         S162 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV77Col_Discod", AV77Col_Discod);
   }

   public void e1725T2( )
   {
      /* Dvelop_confirmpanel_eliminaraccesorios_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminaraccesorios_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINARACCESORIOS' */
         S172 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void S162( )
   {
      /* 'DO ACTION CREARACCESORIOS' Routine */
      returnInSub = false ;
      GXv_int8[0] = AV9CodMac ;
      new app.pnumdoc(remoteHandle, context).execute( AV5EmprCod, "444444", GXv_int8) ;
      generacionaccesorios1_impl.this.AV9CodMac = GXv_int8[0] ;
      AV78i = (short)(1) ;
      while ( AV78i <= AV77Col_Discod.size() )
      {
         AV79Discod = ((Number) AV77Col_Discod.elementAt(-1+AV78i)).intValue() ;
         new app.pgenmac(remoteHandle, context).execute( AV5EmprCod, AV79Discod, AV9CodMac) ;
         AV78i = (short)(AV78i+1) ;
      }
      AV77Col_Discod.clear();
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S172( )
   {
      /* 'DO ACTION ELIMINARACCESORIOS' Routine */
      returnInSub = false ;
      if ( ! (0==AV25MacCod) )
      {
         GXv_int8[0] = AV25MacCod ;
         new app.pelimac(remoteHandle, context).execute( AV5EmprCod, GXv_int8) ;
         generacionaccesorios1_impl.this.AV25MacCod = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMaccod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25MacCod), 8, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO hay valor en la columna Nº Macro", ""));
      }
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV34Session.getValue(AV92Pgmname+"GridState"), "") == 0 )
      {
         AV20GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV92Pgmname+"GridState"), null, null);
      }
      else
      {
         AV20GridState.fromxml(AV34Session.getValue(AV92Pgmname+"GridState"), null, null);
      }
      AV131GXV1 = 1 ;
      while ( AV131GXV1 <= AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV21GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV131GXV1));
         if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUSRCOD") == 0 )
         {
            AV82TFDisUsrCod = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82TFDisUsrCod", AV82TFDisUsrCod);
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUSRCOD_SEL") == 0 )
         {
            AV83TFDisUsrCod_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83TFDisUsrCod_Sel", AV83TFDisUsrCod_Sel);
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOD") == 0 )
         {
            AV43TFDisCod = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43TFDisCod), 8, 0));
            AV44TFDisCod_To = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFDisCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFDisCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISFEC") == 0 )
         {
            AV51TFDisFec = localUtil.ctod( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFDisFec", localUtil.format(AV51TFDisFec, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV35TFCliCod = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFCliCod), 6, 0));
            AV36TFCliCod_To = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV37TFCliNom = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFCliNom", AV37TFCliNom);
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV38TFCliNom_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFCliNom_Sel", AV38TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISPART") == 0 )
         {
            AV55TFDisPart = (short)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFDisPart", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFDisPart), 4, 0));
            AV56TFDisPart_To = (short)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFDisPart_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFDisPart_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTCOD") == 0 )
         {
            AV39TFDisArtCod = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFDisArtCod", AV39TFDisArtCod);
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTCOD_SEL") == 0 )
         {
            AV40TFDisArtCod_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFDisArtCod_Sel", AV40TFDisArtCod_Sel);
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTDSC") == 0 )
         {
            AV41TFDisArtDsc = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFDisArtDsc", AV41TFDisArtDsc);
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTDSC_SEL") == 0 )
         {
            AV42TFDisArtDsc_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFDisArtDsc_Sel", AV42TFDisArtDsc_Sel);
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOLNOM") == 0 )
         {
            AV45TFDisColNom = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFDisColNom", AV45TFDisColNom);
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOLNOM_SEL") == 0 )
         {
            AV46TFDisColNom_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFDisColNom_Sel", AV46TFDisColNom_Sel);
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOLNUM") == 0 )
         {
            AV47TFDisColNum = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFDisColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFDisColNum), 6, 0));
            AV48TFDisColNum_To = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFDisColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFDisColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISTIPCOL") == 0 )
         {
            AV63TFDisTipCol = (byte)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFDisTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63TFDisTipCol), 2, 0));
            AV64TFDisTipCol_To = (byte)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFDisTipCol_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64TFDisTipCol_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNOMCLI") == 0 )
         {
            AV53TFDisNomCli = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFDisNomCli", AV53TFDisNomCli);
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNOMCLI_SEL") == 0 )
         {
            AV54TFDisNomCli_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFDisNomCli_Sel", AV54TFDisNomCli_Sel);
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUNIMED") == 0 )
         {
            AV65TFDisUniMed = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFDisUniMed", AV65TFDisUniMed);
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUNIMED_SEL") == 0 )
         {
            AV66TFDisUniMed_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFDisUniMed_Sel", AV66TFDisUniMed_Sel);
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISPIEPIE") == 0 )
         {
            AV61TFDisPiePie = (short)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFDisPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61TFDisPiePie), 4, 0));
            AV62TFDisPiePie_To = (short)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFDisPiePie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62TFDisPiePie_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISPIEKGM") == 0 )
         {
            AV57TFDisPieKgm = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFDisPieKgm", GXutil.ltrimstr( AV57TFDisPieKgm, 9, 2));
            AV58TFDisPieKgm_To = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFDisPieKgm_To", GXutil.ltrimstr( AV58TFDisPieKgm_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISPIEMTR") == 0 )
         {
            AV59TFDisPieMtr = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFDisPieMtr", GXutil.ltrimstr( AV59TFDisPieMtr, 9, 2));
            AV60TFDisPieMtr_To = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFDisPieMtr_To", GXutil.ltrimstr( AV60TFDisPieMtr_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODDIS") == 0 )
         {
            AV84TFMaqCodDis = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84TFMaqCodDis", AV84TFMaqCodDis);
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODDIS_SEL") == 0 )
         {
            AV85TFMaqCodDis_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85TFMaqCodDis_Sel", AV85TFMaqCodDis_Sel);
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISVOLMAQ") == 0 )
         {
            AV86TFDisVolMaq = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86TFDisVolMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV86TFDisVolMaq), 5, 0));
            AV87TFDisVolMaq_To = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV87TFDisVolMaq_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV87TFDisVolMaq_To), 5, 0));
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFREVENID") == 0 )
         {
            AV88TFRevenID = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88TFRevenID", AV88TFRevenID);
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFREVENID_SEL") == 0 )
         {
            AV89TFRevenID_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89TFRevenID_Sel", AV89TFRevenID_Sel);
         }
         AV131GXV1 = (int)(AV131GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV83TFDisUsrCod_Sel)==0), AV83TFDisUsrCod_Sel, GXv_char4) ;
      generacionaccesorios1_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char9 = "" ;
      GXv_char3[0] = GXt_char9 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV38TFCliNom_Sel)==0), AV38TFCliNom_Sel, GXv_char3) ;
      generacionaccesorios1_impl.this.GXt_char9 = GXv_char3[0] ;
      GXt_char10 = "" ;
      GXv_char2[0] = GXt_char10 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV40TFDisArtCod_Sel)==0), AV40TFDisArtCod_Sel, GXv_char2) ;
      generacionaccesorios1_impl.this.GXt_char10 = GXv_char2[0] ;
      GXt_char11 = "" ;
      GXv_char12[0] = GXt_char11 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV42TFDisArtDsc_Sel)==0), AV42TFDisArtDsc_Sel, GXv_char12) ;
      generacionaccesorios1_impl.this.GXt_char11 = GXv_char12[0] ;
      GXt_char13 = "" ;
      GXv_char14[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV46TFDisColNom_Sel)==0), AV46TFDisColNom_Sel, GXv_char14) ;
      generacionaccesorios1_impl.this.GXt_char13 = GXv_char14[0] ;
      GXt_char15 = "" ;
      GXv_char16[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV54TFDisNomCli_Sel)==0), AV54TFDisNomCli_Sel, GXv_char16) ;
      generacionaccesorios1_impl.this.GXt_char15 = GXv_char16[0] ;
      GXt_char17 = "" ;
      GXv_char18[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV66TFDisUniMed_Sel)==0), AV66TFDisUniMed_Sel, GXv_char18) ;
      generacionaccesorios1_impl.this.GXt_char17 = GXv_char18[0] ;
      GXt_char19 = "" ;
      GXv_char20[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV85TFMaqCodDis_Sel)==0), AV85TFMaqCodDis_Sel, GXv_char20) ;
      generacionaccesorios1_impl.this.GXt_char19 = GXv_char20[0] ;
      GXt_char21 = "" ;
      GXv_char22[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV89TFRevenID_Sel)==0), AV89TFRevenID_Sel, GXv_char22) ;
      generacionaccesorios1_impl.this.GXt_char21 = GXv_char22[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"||||"+GXt_char9+"||"+GXt_char10+"|"+GXt_char11+"|"+GXt_char13+"|||"+GXt_char15+"|"+GXt_char17+"||||"+GXt_char19+"||"+GXt_char21 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char21 = "" ;
      GXv_char22[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV82TFDisUsrCod)==0), AV82TFDisUsrCod, GXv_char22) ;
      generacionaccesorios1_impl.this.GXt_char21 = GXv_char22[0] ;
      GXt_char19 = "" ;
      GXv_char20[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV37TFCliNom)==0), AV37TFCliNom, GXv_char20) ;
      generacionaccesorios1_impl.this.GXt_char19 = GXv_char20[0] ;
      GXt_char17 = "" ;
      GXv_char18[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV39TFDisArtCod)==0), AV39TFDisArtCod, GXv_char18) ;
      generacionaccesorios1_impl.this.GXt_char17 = GXv_char18[0] ;
      GXt_char15 = "" ;
      GXv_char16[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV41TFDisArtDsc)==0), AV41TFDisArtDsc, GXv_char16) ;
      generacionaccesorios1_impl.this.GXt_char15 = GXv_char16[0] ;
      GXt_char13 = "" ;
      GXv_char14[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV45TFDisColNom)==0), AV45TFDisColNom, GXv_char14) ;
      generacionaccesorios1_impl.this.GXt_char13 = GXv_char14[0] ;
      GXt_char11 = "" ;
      GXv_char12[0] = GXt_char11 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV53TFDisNomCli)==0), AV53TFDisNomCli, GXv_char12) ;
      generacionaccesorios1_impl.this.GXt_char11 = GXv_char12[0] ;
      GXt_char10 = "" ;
      GXv_char4[0] = GXt_char10 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV65TFDisUniMed)==0), AV65TFDisUniMed, GXv_char4) ;
      generacionaccesorios1_impl.this.GXt_char10 = GXv_char4[0] ;
      GXt_char9 = "" ;
      GXv_char3[0] = GXt_char9 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV84TFMaqCodDis)==0), AV84TFMaqCodDis, GXv_char3) ;
      generacionaccesorios1_impl.this.GXt_char9 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV88TFRevenID)==0), AV88TFRevenID, GXv_char2) ;
      generacionaccesorios1_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = GXt_char21+"|"+((0==AV43TFDisCod) ? "" : GXutil.str( AV43TFDisCod, 8, 0))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV51TFDisFec)) ? "" : localUtil.dtoc( AV51TFDisFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+((0==AV35TFCliCod) ? "" : GXutil.str( AV35TFCliCod, 6, 0))+"|"+GXt_char19+"|"+((0==AV55TFDisPart) ? "" : GXutil.str( AV55TFDisPart, 4, 0))+"|"+GXt_char17+"|"+GXt_char15+"|"+GXt_char13+"|"+((0==AV47TFDisColNum) ? "" : GXutil.str( AV47TFDisColNum, 6, 0))+"|"+((0==AV63TFDisTipCol) ? "" : GXutil.str( AV63TFDisTipCol, 2, 0))+"|"+GXt_char11+"|"+GXt_char10+"|"+((0==AV61TFDisPiePie) ? "" : GXutil.str( AV61TFDisPiePie, 4, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV57TFDisPieKgm)==0) ? "" : GXutil.str( AV57TFDisPieKgm, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV59TFDisPieMtr)==0) ? "" : GXutil.str( AV59TFDisPieMtr, 9, 2))+"|"+GXt_char9+"|"+((0==AV86TFDisVolMaq) ? "" : GXutil.str( AV86TFDisVolMaq, 5, 0))+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|"+((0==AV44TFDisCod_To) ? "" : GXutil.str( AV44TFDisCod_To, 8, 0))+"||"+((0==AV36TFCliCod_To) ? "" : GXutil.str( AV36TFCliCod_To, 6, 0))+"||"+((0==AV56TFDisPart_To) ? "" : GXutil.str( AV56TFDisPart_To, 4, 0))+"||||"+((0==AV48TFDisColNum_To) ? "" : GXutil.str( AV48TFDisColNum_To, 6, 0))+"|"+((0==AV64TFDisTipCol_To) ? "" : GXutil.str( AV64TFDisTipCol_To, 2, 0))+"|||"+((0==AV62TFDisPiePie_To) ? "" : GXutil.str( AV62TFDisPiePie_To, 4, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV58TFDisPieKgm_To)==0) ? "" : GXutil.str( AV58TFDisPieKgm_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV60TFDisPieMtr_To)==0) ? "" : GXutil.str( AV60TFDisPieMtr_To, 9, 2))+"||"+((0==AV87TFDisVolMaq_To) ? "" : GXutil.str( AV87TFDisVolMaq_To, 5, 0))+"|" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
      if ( ! (GXutil.strcmp("", GXutil.trim( AV20GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV20GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV20GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S132( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV20GridState.fromxml(AV34Session.getValue(AV92Pgmname+"GridState"), null, null);
      AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState23[0] = AV20GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFDISUSRCOD", "", !(GXutil.strcmp("", AV82TFDisUsrCod)==0), (short)(0), AV82TFDisUsrCod, "", !(GXutil.strcmp("", AV83TFDisUsrCod_Sel)==0), AV83TFDisUsrCod_Sel, "") ;
      AV20GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV20GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFDISCOD", "", !((0==AV43TFDisCod)&&(0==AV44TFDisCod_To)), (short)(0), GXutil.trim( GXutil.str( AV43TFDisCod, 8, 0)), GXutil.trim( GXutil.str( AV44TFDisCod_To, 8, 0))) ;
      AV20GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV20GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFDISFEC", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV51TFDisFec)), (short)(0), GXutil.trim( localUtil.dtoc( AV51TFDisFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV20GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV20GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFCLICOD", "", !((0==AV35TFCliCod)&&(0==AV36TFCliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV35TFCliCod, 6, 0)), GXutil.trim( GXutil.str( AV36TFCliCod_To, 6, 0))) ;
      AV20GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV20GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFCLINOM", "", !(GXutil.strcmp("", AV37TFCliNom)==0), (short)(0), AV37TFCliNom, "", !(GXutil.strcmp("", AV38TFCliNom_Sel)==0), AV38TFCliNom_Sel, "") ;
      AV20GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV20GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFDISPART", "", !((0==AV55TFDisPart)&&(0==AV56TFDisPart_To)), (short)(0), GXutil.trim( GXutil.str( AV55TFDisPart, 4, 0)), GXutil.trim( GXutil.str( AV56TFDisPart_To, 4, 0))) ;
      AV20GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV20GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFDISARTCOD", "", !(GXutil.strcmp("", AV39TFDisArtCod)==0), (short)(0), AV39TFDisArtCod, "", !(GXutil.strcmp("", AV40TFDisArtCod_Sel)==0), AV40TFDisArtCod_Sel, "") ;
      AV20GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV20GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFDISARTDSC", "", !(GXutil.strcmp("", AV41TFDisArtDsc)==0), (short)(0), AV41TFDisArtDsc, "", !(GXutil.strcmp("", AV42TFDisArtDsc_Sel)==0), AV42TFDisArtDsc_Sel, "") ;
      AV20GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV20GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFDISCOLNOM", "", !(GXutil.strcmp("", AV45TFDisColNom)==0), (short)(0), AV45TFDisColNom, "", !(GXutil.strcmp("", AV46TFDisColNom_Sel)==0), AV46TFDisColNom_Sel, "") ;
      AV20GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV20GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFDISCOLNUM", "", !((0==AV47TFDisColNum)&&(0==AV48TFDisColNum_To)), (short)(0), GXutil.trim( GXutil.str( AV47TFDisColNum, 6, 0)), GXutil.trim( GXutil.str( AV48TFDisColNum_To, 6, 0))) ;
      AV20GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV20GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFDISTIPCOL", "", !((0==AV63TFDisTipCol)&&(0==AV64TFDisTipCol_To)), (short)(0), GXutil.trim( GXutil.str( AV63TFDisTipCol, 2, 0)), GXutil.trim( GXutil.str( AV64TFDisTipCol_To, 2, 0))) ;
      AV20GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV20GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFDISNOMCLI", "", !(GXutil.strcmp("", AV53TFDisNomCli)==0), (short)(0), AV53TFDisNomCli, "", !(GXutil.strcmp("", AV54TFDisNomCli_Sel)==0), AV54TFDisNomCli_Sel, "") ;
      AV20GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV20GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFDISUNIMED", "", !(GXutil.strcmp("", AV65TFDisUniMed)==0), (short)(0), AV65TFDisUniMed, "", !(GXutil.strcmp("", AV66TFDisUniMed_Sel)==0), AV66TFDisUniMed_Sel, "") ;
      AV20GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV20GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFDISPIEPIE", "", !((0==AV61TFDisPiePie)&&(0==AV62TFDisPiePie_To)), (short)(0), GXutil.trim( GXutil.str( AV61TFDisPiePie, 4, 0)), GXutil.trim( GXutil.str( AV62TFDisPiePie_To, 4, 0))) ;
      AV20GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV20GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFDISPIEKGM", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV57TFDisPieKgm)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV58TFDisPieKgm_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV57TFDisPieKgm, 9, 2)), GXutil.trim( GXutil.str( AV58TFDisPieKgm_To, 9, 2))) ;
      AV20GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV20GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFDISPIEMTR", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV59TFDisPieMtr)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV60TFDisPieMtr_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV59TFDisPieMtr, 9, 2)), GXutil.trim( GXutil.str( AV60TFDisPieMtr_To, 9, 2))) ;
      AV20GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV20GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFMAQCODDIS", "", !(GXutil.strcmp("", AV84TFMaqCodDis)==0), (short)(0), AV84TFMaqCodDis, "", !(GXutil.strcmp("", AV85TFMaqCodDis_Sel)==0), AV85TFMaqCodDis_Sel, "") ;
      AV20GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV20GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFDISVOLMAQ", "", !((0==AV86TFDisVolMaq)&&(0==AV87TFDisVolMaq_To)), (short)(0), GXutil.trim( GXutil.str( AV86TFDisVolMaq, 5, 0)), GXutil.trim( GXutil.str( AV87TFDisVolMaq_To, 5, 0))) ;
      AV20GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV20GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFREVENID", "", !(GXutil.strcmp("", AV88TFRevenID)==0), (short)(0), AV88TFRevenID, "", !(GXutil.strcmp("", AV89TFRevenID_Sel)==0), AV89TFRevenID_Sel, "") ;
      AV20GridState = GXv_SdtWWPGridState23[0] ;
      if ( ! (GXutil.strcmp("", AV5EmprCod)==0) )
      {
         AV21GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV21GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV21GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV5EmprCod );
         AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV21GridStateFilterValue, 0);
      }
      if ( ! (0==AV16DisEst) )
      {
         AV21GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV21GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&DISEST" );
         AV21GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV16DisEst, 1, 0) );
         AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV21GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV81BarNHdr)==0) )
      {
         AV21GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV21GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARNHDR" );
         AV21GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV81BarNHdr );
         AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV21GridStateFilterValue, 0);
      }
      AV20GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV20GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV92Pgmname+"GridState", AV20GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV73TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV73TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV92Pgmname );
      AV73TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV73TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV23HTTPRequest.getScriptName()+"?"+AV23HTTPRequest.getQuerystring() );
      AV73TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "Pedidos.Dis" );
      AV34Session.setValue("TrnContext", AV73TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S142( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV69TotDisPiePie = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TotDisPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69TotDisPiePie), 18, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTDISPIEPIE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV69TotDisPiePie), "ZZZ9")));
      AV67TotDisPieKgm = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TotDisPieKgm", GXutil.ltrimstr( AV67TotDisPieKgm, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTDISPIEKGM", getSecureSignedToken( sPrefix, localUtil.format( AV67TotDisPieKgm, "ZZZZZ9.99")));
      AV68TotDisPieMtr = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TotDisPieMtr", GXutil.ltrimstr( AV68TotDisPieMtr, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTDISPIEMTR", getSecureSignedToken( sPrefix, localUtil.format( AV68TotDisPieMtr, "ZZZZZ9.99")));
   }

   public void S152( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      AV93Pedidos_generacionaccesorios1ds_1_tfdisusrcod = AV82TFDisUsrCod ;
      AV94Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel = AV83TFDisUsrCod_Sel ;
      AV95Pedidos_generacionaccesorios1ds_3_tfdiscod = AV43TFDisCod ;
      AV96Pedidos_generacionaccesorios1ds_4_tfdiscod_to = AV44TFDisCod_To ;
      AV97Pedidos_generacionaccesorios1ds_5_tfdisfec = AV51TFDisFec ;
      AV98Pedidos_generacionaccesorios1ds_6_tfclicod = AV35TFCliCod ;
      AV99Pedidos_generacionaccesorios1ds_7_tfclicod_to = AV36TFCliCod_To ;
      AV100Pedidos_generacionaccesorios1ds_8_tfclinom = AV37TFCliNom ;
      AV101Pedidos_generacionaccesorios1ds_9_tfclinom_sel = AV38TFCliNom_Sel ;
      AV102Pedidos_generacionaccesorios1ds_10_tfdispart = AV55TFDisPart ;
      AV103Pedidos_generacionaccesorios1ds_11_tfdispart_to = AV56TFDisPart_To ;
      AV104Pedidos_generacionaccesorios1ds_12_tfdisartcod = AV39TFDisArtCod ;
      AV105Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel = AV40TFDisArtCod_Sel ;
      AV106Pedidos_generacionaccesorios1ds_14_tfdisartdsc = AV41TFDisArtDsc ;
      AV107Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel = AV42TFDisArtDsc_Sel ;
      AV108Pedidos_generacionaccesorios1ds_16_tfdiscolnom = AV45TFDisColNom ;
      AV109Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel = AV46TFDisColNom_Sel ;
      AV110Pedidos_generacionaccesorios1ds_18_tfdiscolnum = AV47TFDisColNum ;
      AV111Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to = AV48TFDisColNum_To ;
      AV112Pedidos_generacionaccesorios1ds_20_tfdistipcol = AV63TFDisTipCol ;
      AV113Pedidos_generacionaccesorios1ds_21_tfdistipcol_to = AV64TFDisTipCol_To ;
      AV114Pedidos_generacionaccesorios1ds_22_tfdisnomcli = AV53TFDisNomCli ;
      AV115Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel = AV54TFDisNomCli_Sel ;
      AV116Pedidos_generacionaccesorios1ds_24_tfdisunimed = AV65TFDisUniMed ;
      AV117Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel = AV66TFDisUniMed_Sel ;
      AV118Pedidos_generacionaccesorios1ds_26_tfdispiepie = AV61TFDisPiePie ;
      AV119Pedidos_generacionaccesorios1ds_27_tfdispiepie_to = AV62TFDisPiePie_To ;
      AV120Pedidos_generacionaccesorios1ds_28_tfdispiekgm = AV57TFDisPieKgm ;
      AV121Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to = AV58TFDisPieKgm_To ;
      AV122Pedidos_generacionaccesorios1ds_30_tfdispiemtr = AV59TFDisPieMtr ;
      AV123Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to = AV60TFDisPieMtr_To ;
      AV124Pedidos_generacionaccesorios1ds_32_tfmaqcoddis = AV84TFMaqCodDis ;
      AV125Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel = AV85TFMaqCodDis_Sel ;
      AV126Pedidos_generacionaccesorios1ds_34_tfdisvolmaq = AV86TFDisVolMaq ;
      AV127Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to = AV87TFDisVolMaq_To ;
      AV128Pedidos_generacionaccesorios1ds_36_tfrevenid = AV88TFRevenID ;
      AV129Pedidos_generacionaccesorios1ds_37_tfrevenid_sel = AV89TFRevenID_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV94Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel ,
                                           AV93Pedidos_generacionaccesorios1ds_1_tfdisusrcod ,
                                           Integer.valueOf(AV95Pedidos_generacionaccesorios1ds_3_tfdiscod) ,
                                           Integer.valueOf(AV96Pedidos_generacionaccesorios1ds_4_tfdiscod_to) ,
                                           AV97Pedidos_generacionaccesorios1ds_5_tfdisfec ,
                                           Integer.valueOf(AV98Pedidos_generacionaccesorios1ds_6_tfclicod) ,
                                           Integer.valueOf(AV99Pedidos_generacionaccesorios1ds_7_tfclicod_to) ,
                                           AV101Pedidos_generacionaccesorios1ds_9_tfclinom_sel ,
                                           AV100Pedidos_generacionaccesorios1ds_8_tfclinom ,
                                           Short.valueOf(AV102Pedidos_generacionaccesorios1ds_10_tfdispart) ,
                                           Short.valueOf(AV103Pedidos_generacionaccesorios1ds_11_tfdispart_to) ,
                                           AV105Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel ,
                                           AV104Pedidos_generacionaccesorios1ds_12_tfdisartcod ,
                                           AV107Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel ,
                                           AV106Pedidos_generacionaccesorios1ds_14_tfdisartdsc ,
                                           AV109Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel ,
                                           AV108Pedidos_generacionaccesorios1ds_16_tfdiscolnom ,
                                           Integer.valueOf(AV110Pedidos_generacionaccesorios1ds_18_tfdiscolnum) ,
                                           Integer.valueOf(AV111Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to) ,
                                           Byte.valueOf(AV112Pedidos_generacionaccesorios1ds_20_tfdistipcol) ,
                                           Byte.valueOf(AV113Pedidos_generacionaccesorios1ds_21_tfdistipcol_to) ,
                                           AV115Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel ,
                                           AV114Pedidos_generacionaccesorios1ds_22_tfdisnomcli ,
                                           AV117Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel ,
                                           AV116Pedidos_generacionaccesorios1ds_24_tfdisunimed ,
                                           AV125Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel ,
                                           AV124Pedidos_generacionaccesorios1ds_32_tfmaqcoddis ,
                                           Integer.valueOf(AV126Pedidos_generacionaccesorios1ds_34_tfdisvolmaq) ,
                                           Integer.valueOf(AV127Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to) ,
                                           AV129Pedidos_generacionaccesorios1ds_37_tfrevenid_sel ,
                                           AV128Pedidos_generacionaccesorios1ds_36_tfrevenid ,
                                           A4348DisUsrCod ,
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
                                           A1122MaqCodDis ,
                                           Integer.valueOf(A6547DisVolMaq) ,
                                           A12328RevenID ,
                                           Short.valueOf(AV118Pedidos_generacionaccesorios1ds_26_tfdispiepie) ,
                                           Short.valueOf(A387DisPiePie) ,
                                           Short.valueOf(AV119Pedidos_generacionaccesorios1ds_27_tfdispiepie_to) ,
                                           AV120Pedidos_generacionaccesorios1ds_28_tfdispiekgm ,
                                           A381DisPieKgm ,
                                           AV121Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to ,
                                           AV122Pedidos_generacionaccesorios1ds_30_tfdispiemtr ,
                                           A385DisPieMtr ,
                                           AV123Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to ,
                                           AV5EmprCod ,
                                           Byte.valueOf(AV16DisEst) ,
                                           A396EmprCod ,
                                           Byte.valueOf(A367DisEst) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE
                                           }
      });
      lV93Pedidos_generacionaccesorios1ds_1_tfdisusrcod = GXutil.padr( GXutil.rtrim( AV93Pedidos_generacionaccesorios1ds_1_tfdisusrcod), 8, "%") ;
      lV100Pedidos_generacionaccesorios1ds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV100Pedidos_generacionaccesorios1ds_8_tfclinom), 30, "%") ;
      lV104Pedidos_generacionaccesorios1ds_12_tfdisartcod = GXutil.padr( GXutil.rtrim( AV104Pedidos_generacionaccesorios1ds_12_tfdisartcod), 16, "%") ;
      lV106Pedidos_generacionaccesorios1ds_14_tfdisartdsc = GXutil.padr( GXutil.rtrim( AV106Pedidos_generacionaccesorios1ds_14_tfdisartdsc), 26, "%") ;
      lV108Pedidos_generacionaccesorios1ds_16_tfdiscolnom = GXutil.padr( GXutil.rtrim( AV108Pedidos_generacionaccesorios1ds_16_tfdiscolnom), 13, "%") ;
      lV114Pedidos_generacionaccesorios1ds_22_tfdisnomcli = GXutil.padr( GXutil.rtrim( AV114Pedidos_generacionaccesorios1ds_22_tfdisnomcli), 13, "%") ;
      lV116Pedidos_generacionaccesorios1ds_24_tfdisunimed = GXutil.padr( GXutil.rtrim( AV116Pedidos_generacionaccesorios1ds_24_tfdisunimed), 1, "%") ;
      lV124Pedidos_generacionaccesorios1ds_32_tfmaqcoddis = GXutil.padr( GXutil.rtrim( AV124Pedidos_generacionaccesorios1ds_32_tfmaqcoddis), 6, "%") ;
      lV128Pedidos_generacionaccesorios1ds_36_tfrevenid = GXutil.padr( GXutil.rtrim( AV128Pedidos_generacionaccesorios1ds_36_tfrevenid), 10, "%") ;
      /* Using cursor H025T8 */
      pr_default.execute(3, new Object[] {AV5EmprCod, Byte.valueOf(AV16DisEst), Short.valueOf(AV118Pedidos_generacionaccesorios1ds_26_tfdispiepie), Short.valueOf(AV118Pedidos_generacionaccesorios1ds_26_tfdispiepie), Short.valueOf(AV119Pedidos_generacionaccesorios1ds_27_tfdispiepie_to), Short.valueOf(AV119Pedidos_generacionaccesorios1ds_27_tfdispiepie_to), lV93Pedidos_generacionaccesorios1ds_1_tfdisusrcod, AV94Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel, Integer.valueOf(AV95Pedidos_generacionaccesorios1ds_3_tfdiscod), Integer.valueOf(AV96Pedidos_generacionaccesorios1ds_4_tfdiscod_to), AV97Pedidos_generacionaccesorios1ds_5_tfdisfec, Integer.valueOf(AV98Pedidos_generacionaccesorios1ds_6_tfclicod), Integer.valueOf(AV99Pedidos_generacionaccesorios1ds_7_tfclicod_to), lV100Pedidos_generacionaccesorios1ds_8_tfclinom, AV101Pedidos_generacionaccesorios1ds_9_tfclinom_sel, Short.valueOf(AV102Pedidos_generacionaccesorios1ds_10_tfdispart), Short.valueOf(AV103Pedidos_generacionaccesorios1ds_11_tfdispart_to), lV104Pedidos_generacionaccesorios1ds_12_tfdisartcod, AV105Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel, lV106Pedidos_generacionaccesorios1ds_14_tfdisartdsc, AV107Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel, lV108Pedidos_generacionaccesorios1ds_16_tfdiscolnom, AV109Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel, Integer.valueOf(AV110Pedidos_generacionaccesorios1ds_18_tfdiscolnum), Integer.valueOf(AV111Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to), Byte.valueOf(AV112Pedidos_generacionaccesorios1ds_20_tfdistipcol), Byte.valueOf(AV113Pedidos_generacionaccesorios1ds_21_tfdistipcol_to), lV114Pedidos_generacionaccesorios1ds_22_tfdisnomcli, AV115Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel, lV116Pedidos_generacionaccesorios1ds_24_tfdisunimed, AV117Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel, lV124Pedidos_generacionaccesorios1ds_32_tfmaqcoddis, AV125Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel, Integer.valueOf(AV126Pedidos_generacionaccesorios1ds_34_tfdisvolmaq), Integer.valueOf(AV127Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to), lV128Pedidos_generacionaccesorios1ds_36_tfrevenid, AV129Pedidos_generacionaccesorios1ds_37_tfrevenid_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A367DisEst = H025T8_A367DisEst[0] ;
         A396EmprCod = H025T8_A396EmprCod[0] ;
         A12328RevenID = H025T8_A12328RevenID[0] ;
         n12328RevenID = H025T8_n12328RevenID[0] ;
         A6547DisVolMaq = H025T8_A6547DisVolMaq[0] ;
         A1122MaqCodDis = H025T8_A1122MaqCodDis[0] ;
         n1122MaqCodDis = H025T8_n1122MaqCodDis[0] ;
         A392DisUniMed = H025T8_A392DisUniMed[0] ;
         A1195DisNomCli = H025T8_A1195DisNomCli[0] ;
         A390DisTipCol = H025T8_A390DisTipCol[0] ;
         n390DisTipCol = H025T8_n390DisTipCol[0] ;
         A363DisColNum = H025T8_A363DisColNum[0] ;
         n363DisColNum = H025T8_n363DisColNum[0] ;
         A362DisColNom = H025T8_A362DisColNom[0] ;
         n362DisColNom = H025T8_n362DisColNom[0] ;
         A337DisArtDsc = H025T8_A337DisArtDsc[0] ;
         A335DisArtCod = H025T8_A335DisArtCod[0] ;
         A1502DisPart = H025T8_A1502DisPart[0] ;
         A279CliNom = H025T8_A279CliNom[0] ;
         A252CliCod = H025T8_A252CliCod[0] ;
         A369DisFec = H025T8_A369DisFec[0] ;
         A361DisCod = H025T8_A361DisCod[0] ;
         A4348DisUsrCod = H025T8_A4348DisUsrCod[0] ;
         A387DisPiePie = H025T8_A387DisPiePie[0] ;
         n387DisPiePie = H025T8_n387DisPiePie[0] ;
         A365DisDes = H025T8_A365DisDes[0] ;
         A279CliNom = H025T8_A279CliNom[0] ;
         A387DisPiePie = H025T8_A387DisPiePie[0] ;
         n387DisPiePie = H025T8_n387DisPiePie[0] ;
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
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV120Pedidos_generacionaccesorios1ds_28_tfdispiekgm)==0) || ( ( DecimalUtil.compareTo(A381DisPieKgm, AV120Pedidos_generacionaccesorios1ds_28_tfdispiekgm) >= 0 ) ) )
         {
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to)==0) || ( ( DecimalUtil.compareTo(A381DisPieKgm, AV121Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to) <= 0 ) ) )
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
               if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Pedidos_generacionaccesorios1ds_30_tfdispiemtr)==0) || ( ( DecimalUtil.compareTo(A385DisPieMtr, AV122Pedidos_generacionaccesorios1ds_30_tfdispiemtr) >= 0 ) ) )
               {
                  if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to)==0) || ( ( DecimalUtil.compareTo(A385DisPieMtr, AV123Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to) <= 0 ) ) )
                  {
                     AV69TotDisPiePie = (long)(A387DisPiePie+AV69TotDisPiePie) ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TotDisPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69TotDisPiePie), 18, 0));
                     app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTDISPIEPIE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV69TotDisPiePie), "ZZZ9")));
                     AV67TotDisPieKgm = A381DisPieKgm.add(AV67TotDisPieKgm) ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TotDisPieKgm", GXutil.ltrimstr( AV67TotDisPieKgm, 18, 2));
                     app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTDISPIEKGM", getSecureSignedToken( sPrefix, localUtil.format( AV67TotDisPieKgm, "ZZZZZ9.99")));
                     AV68TotDisPieMtr = A385DisPieMtr.add(AV68TotDisPieMtr) ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TotDisPieMtr", GXutil.ltrimstr( AV68TotDisPieMtr, 18, 2));
                     app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTDISPIEMTR", getSecureSignedToken( sPrefix, localUtil.format( AV68TotDisPieMtr, "ZZZZZ9.99")));
                  }
               }
            }
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
      AV72TotValueDisPiePie = localUtil.format( DecimalUtil.doubleToDec(AV69TotDisPiePie), "ZZZ9") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72TotValueDisPiePie", AV72TotValueDisPiePie);
      AV70TotValueDisPieKgm = localUtil.format( AV67TotDisPieKgm, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70TotValueDisPieKgm", AV70TotValueDisPieKgm);
      AV71TotValueDisPieMtr = localUtil.format( AV68TotDisPieMtr, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TotValueDisPieMtr", AV71TotValueDisPieMtr);
   }

   public void e2325T2( )
   {
      /* Seleccionar_Click Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV33Seleccionar, "S") == 0 )
      {
         if ( (0==AV25MacCod) )
         {
            AV77Col_Discod.add((int)(A361DisCod), 0);
         }
         else
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "NO puede seleccionar la linea, tiene Nº Accesorio", ""));
            AV33Seleccionar = "N" ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionar.getInternalname(), AV33Seleccionar);
            httpContext.doAjaxRefreshCmp(sPrefix);
         }
      }
      else
      {
         AV78i = (short)(1) ;
         while ( AV78i <= AV77Col_Discod.size() )
         {
            if ( ((Number) AV77Col_Discod.elementAt(-1+AV78i)).intValue() == A361DisCod )
            {
               AV77Col_Discod.removeItem(AV78i);
               if (true) break;
            }
            AV78i = (short)(AV78i+1) ;
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV77Col_Discod", AV77Col_Discod);
   }

   public void wb_table3_129_25T2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_eliminaraccesorios_Internalname, tblTabledvelop_confirmpanel_eliminaraccesorios_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_eliminaraccesorios.setProperty("Title", Dvelop_confirmpanel_eliminaraccesorios_Title);
         ucDvelop_confirmpanel_eliminaraccesorios.setProperty("ConfirmationText", Dvelop_confirmpanel_eliminaraccesorios_Confirmationtext);
         ucDvelop_confirmpanel_eliminaraccesorios.setProperty("YesButtonCaption", Dvelop_confirmpanel_eliminaraccesorios_Yesbuttoncaption);
         ucDvelop_confirmpanel_eliminaraccesorios.setProperty("NoButtonCaption", Dvelop_confirmpanel_eliminaraccesorios_Nobuttoncaption);
         ucDvelop_confirmpanel_eliminaraccesorios.setProperty("CancelButtonCaption", Dvelop_confirmpanel_eliminaraccesorios_Cancelbuttoncaption);
         ucDvelop_confirmpanel_eliminaraccesorios.setProperty("YesButtonPosition", Dvelop_confirmpanel_eliminaraccesorios_Yesbuttonposition);
         ucDvelop_confirmpanel_eliminaraccesorios.setProperty("ConfirmType", Dvelop_confirmpanel_eliminaraccesorios_Confirmtype);
         ucDvelop_confirmpanel_eliminaraccesorios.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_eliminaraccesorios_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARACCESORIOSContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARACCESORIOSContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_129_25T2e( true) ;
      }
      else
      {
         wb_table3_129_25T2e( false) ;
      }
   }

   public void wb_table2_124_25T2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_crearaccesorios_Internalname, tblTabledvelop_confirmpanel_crearaccesorios_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_crearaccesorios.setProperty("Title", Dvelop_confirmpanel_crearaccesorios_Title);
         ucDvelop_confirmpanel_crearaccesorios.setProperty("ConfirmationText", Dvelop_confirmpanel_crearaccesorios_Confirmationtext);
         ucDvelop_confirmpanel_crearaccesorios.setProperty("YesButtonCaption", Dvelop_confirmpanel_crearaccesorios_Yesbuttoncaption);
         ucDvelop_confirmpanel_crearaccesorios.setProperty("NoButtonCaption", Dvelop_confirmpanel_crearaccesorios_Nobuttoncaption);
         ucDvelop_confirmpanel_crearaccesorios.setProperty("CancelButtonCaption", Dvelop_confirmpanel_crearaccesorios_Cancelbuttoncaption);
         ucDvelop_confirmpanel_crearaccesorios.setProperty("YesButtonPosition", Dvelop_confirmpanel_crearaccesorios_Yesbuttonposition);
         ucDvelop_confirmpanel_crearaccesorios.setProperty("ConfirmType", Dvelop_confirmpanel_crearaccesorios_Confirmtype);
         ucDvelop_confirmpanel_crearaccesorios.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_crearaccesorios_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_CREARACCESORIOSContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_CREARACCESORIOSContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_124_25T2e( true) ;
      }
      else
      {
         wb_table2_124_25T2e( false) ;
      }
   }

   public void wb_table1_87_25T2( boolean wbgen )
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
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluedispiepie_Internalname, httpContext.getMessage( "Tot Value Dis Pie Pie", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'" + sPrefix + "',false,'" + sGXsfl_62_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluedispiepie_Internalname, AV72TotValueDisPiePie, GXutil.rtrim( localUtil.format( AV72TotValueDisPiePie, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,107);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluedispiepie_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluedispiepie_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\GeneracionAccesorios1.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluedispiekgm_Internalname, httpContext.getMessage( "Tot Value Dis Pie Kgm", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 110,'" + sPrefix + "',false,'" + sGXsfl_62_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluedispiekgm_Internalname, AV70TotValueDisPieKgm, GXutil.rtrim( localUtil.format( AV70TotValueDisPieKgm, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,110);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluedispiekgm_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluedispiekgm_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\GeneracionAccesorios1.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluedispiemtr_Internalname, httpContext.getMessage( "Tot Value Dis Pie Mtr", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'" + sPrefix + "',false,'" + sGXsfl_62_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluedispiemtr_Internalname, AV71TotValueDisPieMtr, GXutil.rtrim( localUtil.format( AV71TotValueDisPieMtr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,113);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluedispiemtr_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluedispiemtr_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\GeneracionAccesorios1.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         wb_table1_87_25T2e( true) ;
      }
      else
      {
         wb_table1_87_25T2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV5EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5EmprCod", AV5EmprCod);
      AV16DisEst = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16DisEst", GXutil.str( AV16DisEst, 1, 0));
      AV81BarNHdr = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81BarNHdr", AV81BarNHdr);
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
      pa25T2( ) ;
      ws25T2( ) ;
      we25T2( ) ;
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
      sCtrlAV5EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV16DisEst = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV81BarNHdr = (String)getParm(obj,2,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa25T2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "pedidos\\generacionaccesorios1", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa25T2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV5EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5EmprCod", AV5EmprCod);
         AV16DisEst = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16DisEst", GXutil.str( AV16DisEst, 1, 0));
         AV81BarNHdr = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81BarNHdr", AV81BarNHdr);
      }
      wcpOAV5EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV5EmprCod") ;
      wcpOAV16DisEst = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV16DisEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV81BarNHdr = httpContext.cgiGet( sPrefix+"wcpOAV81BarNHdr") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV5EmprCod, wcpOAV5EmprCod) != 0 ) || ( AV16DisEst != wcpOAV16DisEst ) || ( GXutil.strcmp(AV81BarNHdr, wcpOAV81BarNHdr) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV5EmprCod = AV5EmprCod ;
      wcpOAV16DisEst = AV16DisEst ;
      wcpOAV81BarNHdr = AV81BarNHdr ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV5EmprCod = httpContext.cgiGet( sPrefix+"AV5EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV5EmprCod) > 0 )
      {
         AV5EmprCod = httpContext.cgiGet( sCtrlAV5EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5EmprCod", AV5EmprCod);
      }
      else
      {
         AV5EmprCod = httpContext.cgiGet( sPrefix+"AV5EmprCod_PARM") ;
      }
      sCtrlAV16DisEst = httpContext.cgiGet( sPrefix+"AV16DisEst_CTRL") ;
      if ( GXutil.len( sCtrlAV16DisEst) > 0 )
      {
         AV16DisEst = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV16DisEst), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16DisEst", GXutil.str( AV16DisEst, 1, 0));
      }
      else
      {
         AV16DisEst = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV16DisEst_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV81BarNHdr = httpContext.cgiGet( sPrefix+"AV81BarNHdr_CTRL") ;
      if ( GXutil.len( sCtrlAV81BarNHdr) > 0 )
      {
         AV81BarNHdr = httpContext.cgiGet( sCtrlAV81BarNHdr) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81BarNHdr", AV81BarNHdr);
      }
      else
      {
         AV81BarNHdr = httpContext.cgiGet( sPrefix+"AV81BarNHdr_PARM") ;
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
      pa25T2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws25T2( ) ;
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
      ws25T2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5EmprCod_PARM", GXutil.rtrim( AV5EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV5EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5EmprCod_CTRL", GXutil.rtrim( sCtrlAV5EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV16DisEst_PARM", GXutil.ltrim( localUtil.ntoc( AV16DisEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV16DisEst)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV16DisEst_CTRL", GXutil.rtrim( sCtrlAV16DisEst));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV81BarNHdr_PARM", GXutil.rtrim( AV81BarNHdr));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV81BarNHdr)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV81BarNHdr_CTRL", GXutil.rtrim( sCtrlAV81BarNHdr));
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
      we25T2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211684675", true, true);
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
      httpContext.AddJavascriptSource("pedidos/generacionaccesorios1.js", "?20268211684676", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_622( )
   {
      chkavSeleccionar.setInternalname( sPrefix+"vSELECCIONAR_"+sGXsfl_62_idx );
      edtDisUsrCod_Internalname = sPrefix+"DISUSRCOD_"+sGXsfl_62_idx ;
      edtDisCod_Internalname = sPrefix+"DISCOD_"+sGXsfl_62_idx ;
      edtDisFec_Internalname = sPrefix+"DISFEC_"+sGXsfl_62_idx ;
      edtavMaccod_Internalname = sPrefix+"vMACCOD_"+sGXsfl_62_idx ;
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_62_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_62_idx ;
      edtavDisenccli_Internalname = sPrefix+"vDISENCCLI_"+sGXsfl_62_idx ;
      edtDisPart_Internalname = sPrefix+"DISPART_"+sGXsfl_62_idx ;
      edtDisArtCod_Internalname = sPrefix+"DISARTCOD_"+sGXsfl_62_idx ;
      edtDisArtDsc_Internalname = sPrefix+"DISARTDSC_"+sGXsfl_62_idx ;
      edtDisColNom_Internalname = sPrefix+"DISCOLNOM_"+sGXsfl_62_idx ;
      edtDisColNum_Internalname = sPrefix+"DISCOLNUM_"+sGXsfl_62_idx ;
      edtDisTipCol_Internalname = sPrefix+"DISTIPCOL_"+sGXsfl_62_idx ;
      edtDisNomCli_Internalname = sPrefix+"DISNOMCLI_"+sGXsfl_62_idx ;
      edtDisUniMed_Internalname = sPrefix+"DISUNIMED_"+sGXsfl_62_idx ;
      edtDisPiePie_Internalname = sPrefix+"DISPIEPIE_"+sGXsfl_62_idx ;
      edtDisPieKgm_Internalname = sPrefix+"DISPIEKGM_"+sGXsfl_62_idx ;
      edtDisPieMtr_Internalname = sPrefix+"DISPIEMTR_"+sGXsfl_62_idx ;
      edtMaqCodDis_Internalname = sPrefix+"MAQCODDIS_"+sGXsfl_62_idx ;
      edtDisVolMaq_Internalname = sPrefix+"DISVOLMAQ_"+sGXsfl_62_idx ;
      edtRevenID_Internalname = sPrefix+"REVENID_"+sGXsfl_62_idx ;
   }

   public void subsflControlProps_fel_622( )
   {
      chkavSeleccionar.setInternalname( sPrefix+"vSELECCIONAR_"+sGXsfl_62_fel_idx );
      edtDisUsrCod_Internalname = sPrefix+"DISUSRCOD_"+sGXsfl_62_fel_idx ;
      edtDisCod_Internalname = sPrefix+"DISCOD_"+sGXsfl_62_fel_idx ;
      edtDisFec_Internalname = sPrefix+"DISFEC_"+sGXsfl_62_fel_idx ;
      edtavMaccod_Internalname = sPrefix+"vMACCOD_"+sGXsfl_62_fel_idx ;
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_62_fel_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_62_fel_idx ;
      edtavDisenccli_Internalname = sPrefix+"vDISENCCLI_"+sGXsfl_62_fel_idx ;
      edtDisPart_Internalname = sPrefix+"DISPART_"+sGXsfl_62_fel_idx ;
      edtDisArtCod_Internalname = sPrefix+"DISARTCOD_"+sGXsfl_62_fel_idx ;
      edtDisArtDsc_Internalname = sPrefix+"DISARTDSC_"+sGXsfl_62_fel_idx ;
      edtDisColNom_Internalname = sPrefix+"DISCOLNOM_"+sGXsfl_62_fel_idx ;
      edtDisColNum_Internalname = sPrefix+"DISCOLNUM_"+sGXsfl_62_fel_idx ;
      edtDisTipCol_Internalname = sPrefix+"DISTIPCOL_"+sGXsfl_62_fel_idx ;
      edtDisNomCli_Internalname = sPrefix+"DISNOMCLI_"+sGXsfl_62_fel_idx ;
      edtDisUniMed_Internalname = sPrefix+"DISUNIMED_"+sGXsfl_62_fel_idx ;
      edtDisPiePie_Internalname = sPrefix+"DISPIEPIE_"+sGXsfl_62_fel_idx ;
      edtDisPieKgm_Internalname = sPrefix+"DISPIEKGM_"+sGXsfl_62_fel_idx ;
      edtDisPieMtr_Internalname = sPrefix+"DISPIEMTR_"+sGXsfl_62_fel_idx ;
      edtMaqCodDis_Internalname = sPrefix+"MAQCODDIS_"+sGXsfl_62_fel_idx ;
      edtDisVolMaq_Internalname = sPrefix+"DISVOLMAQ_"+sGXsfl_62_fel_idx ;
      edtRevenID_Internalname = sPrefix+"REVENID_"+sGXsfl_62_fel_idx ;
   }

   public void sendrow_622( )
   {
      subsflControlProps_622( ) ;
      wb25T0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_62_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_62_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_62_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavSeleccionar.getEnabled()!=0)&&(chkavSeleccionar.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 63,'"+sPrefix+"',false,'"+sGXsfl_62_idx+"',62)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "vSELECCIONAR_" + sGXsfl_62_idx ;
         chkavSeleccionar.setName( GXCCtl );
         chkavSeleccionar.setWebtags( "" );
         chkavSeleccionar.setCaption( "" );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSeleccionar.getInternalname(), "TitleCaption", chkavSeleccionar.getCaption(), !bGXsfl_62_Refreshing);
         chkavSeleccionar.setCheckedValue( "N" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSeleccionar.getInternalname(),AV33Seleccionar,"","",Integer.valueOf(-1),Integer.valueOf(1),"S","",StyleString,ClassString,"WWColumn","",TempTags+((chkavSeleccionar.getEnabled()!=0)&&(chkavSeleccionar.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,63);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisUsrCod_Internalname,GXutil.rtrim( A4348DisUsrCod),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDisUsrCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisCod_Internalname,GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDisCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisFec_Internalname,localUtil.format(A369DisFec, "99/99/99"),localUtil.format( A369DisFec, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDisFec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavMaccod_Enabled!=0)&&(edtavMaccod_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 67,'"+sPrefix+"',false,'"+sGXsfl_62_idx+"',62)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaccod_Internalname,GXutil.ltrim( localUtil.ntoc( AV25MacCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavMaccod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV25MacCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV25MacCod), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavMaccod_Enabled!=0)&&(edtavMaccod_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,67);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavMaccod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavMaccod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDisenccli_Enabled!=0)&&(edtavDisenccli_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 70,'"+sPrefix+"',false,'"+sGXsfl_62_idx+"',62)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDisenccli_Internalname,GXutil.rtrim( AV80DisEncCli),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavDisenccli_Enabled!=0)&&(edtavDisenccli_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,70);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDisenccli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDisenccli_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisPart_Internalname,GXutil.ltrim( localUtil.ntoc( A1502DisPart, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1502DisPart), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDisPart_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisArtCod_Internalname,GXutil.rtrim( A335DisArtCod),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDisArtCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisArtDsc_Internalname,GXutil.rtrim( A337DisArtDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDisArtDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisColNom_Internalname,GXutil.rtrim( A362DisColNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDisColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A363DisColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A363DisColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDisColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisTipCol_Internalname,GXutil.ltrim( localUtil.ntoc( A390DisTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A390DisTipCol), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDisTipCol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisNomCli_Internalname,GXutil.rtrim( A1195DisNomCli),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDisNomCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisUniMed_Internalname,GXutil.rtrim( A392DisUniMed),GXutil.rtrim( localUtil.format( A392DisUniMed, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDisUniMed_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisPiePie_Internalname,GXutil.ltrim( localUtil.ntoc( A387DisPiePie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A387DisPiePie), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDisPiePie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisPieKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A381DisPieKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A381DisPieKgm, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDisPieKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisPieMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A385DisPieMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A385DisPieMtr, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDisPieMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqCodDis_Internalname,GXutil.rtrim( A1122MaqCodDis),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMaqCodDis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisVolMaq_Internalname,GXutil.ltrim( localUtil.ntoc( A6547DisVolMaq, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6547DisVolMaq), "ZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDisVolMaq_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRevenID_Internalname,GXutil.rtrim( A12328RevenID),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRevenID_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes25T2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_62_idx = ((subGrid_Islastpage==1)&&(nGXsfl_62_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_62_idx+1) ;
         sGXsfl_62_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_62_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_622( ) ;
      }
      /* End function sendrow_622 */
   }

   public void startgridcontrol62( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"62\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Usuario", "")) ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Volumen", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Revendedor", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV33Seleccionar));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4348DisUsrCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A369DisFec, "99/99/99"));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV25MacCod, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaccod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A279CliNom));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV80DisEncCli));
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
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1122MaqCodDis));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6547DisVolMaq, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A12328RevenID));
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
      bttBtncrearaccesorios_Internalname = sPrefix+"BTNCREARACCESORIOS" ;
      bttBtneliminaraccesorios_Internalname = sPrefix+"BTNELIMINARACCESORIOS" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      grpUnnamedgroup3_Internalname = sPrefix+"UNNAMEDGROUP3" ;
      bttBtngenerarhdrs_Internalname = sPrefix+"BTNGENERARHDRS" ;
      divUnnamedtable4_Internalname = sPrefix+"UNNAMEDTABLE4" ;
      grpUnnamedgroup5_Internalname = sPrefix+"UNNAMEDGROUP5" ;
      bttBtncerrar_Internalname = sPrefix+"BTNCERRAR" ;
      divUnnamedtable6_Internalname = sPrefix+"UNNAMEDTABLE6" ;
      edtavBarnhdr_Internalname = sPrefix+"vBARNHDR" ;
      divUnnamedtable7_Internalname = sPrefix+"UNNAMEDTABLE7" ;
      divTableactionheader_Internalname = sPrefix+"TABLEACTIONHEADER" ;
      Barradeprogreso_Internalname = sPrefix+"BARRADEPROGRESO" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      Datamonjs_Internalname = sPrefix+"DATAMONJS" ;
      chkavSeleccionar.setInternalname( sPrefix+"vSELECCIONAR" );
      edtDisUsrCod_Internalname = sPrefix+"DISUSRCOD" ;
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
      edtMaqCodDis_Internalname = sPrefix+"MAQCODDIS" ;
      edtDisVolMaq_Internalname = sPrefix+"DISVOLMAQ" ;
      edtRevenID_Internalname = sPrefix+"REVENID" ;
      edtavTotvaluedispiepie_Internalname = sPrefix+"vTOTVALUEDISPIEPIE" ;
      edtavTotvaluedispiekgm_Internalname = sPrefix+"vTOTVALUEDISPIEKGM" ;
      edtavTotvaluedispiemtr_Internalname = sPrefix+"vTOTVALUEDISPIEMTR" ;
      tblGridtabletotalizer_Internalname = sPrefix+"GRIDTABLETOTALIZER" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Dvelop_confirmpanel_crearaccesorios_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_CREARACCESORIOS" ;
      tblTabledvelop_confirmpanel_crearaccesorios_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_CREARACCESORIOS" ;
      Dvelop_confirmpanel_eliminaraccesorios_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARACCESORIOS" ;
      tblTabledvelop_confirmpanel_eliminaraccesorios_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_ELIMINARACCESORIOS" ;
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
      edtRevenID_Jsonclick = "" ;
      edtDisVolMaq_Jsonclick = "" ;
      edtMaqCodDis_Jsonclick = "" ;
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
      edtDisUsrCod_Jsonclick = "" ;
      chkavSeleccionar.setCaption( "" );
      chkavSeleccionar.setVisible( -1 );
      chkavSeleccionar.setEnabled( 1 );
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavTotvaluedispiemtr_Jsonclick = "" ;
      edtavTotvaluedispiemtr_Enabled = 1 ;
      edtavTotvaluedispiekgm_Jsonclick = "" ;
      edtavTotvaluedispiekgm_Enabled = 1 ;
      edtavTotvaluedispiepie_Jsonclick = "" ;
      edtavTotvaluedispiepie_Enabled = 1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_disfecauxdate_Jsonclick = "" ;
      divUnnamedtable1_Height = 0 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavBarnhdr_Jsonclick = "" ;
      edtavBarnhdr_Enabled = 0 ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hascategories = GXutil.toBoolean( -1) ;
      Grid_titlescategories_Gridtitlescategories = ";;;;;Cliente;Cliente;;;Articulo;Articulo;;Color;;;;;;;;;" ;
      Dvelop_confirmpanel_eliminaraccesorios_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminaraccesorios_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminaraccesorios_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminaraccesorios_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminaraccesorios_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminaraccesorios_Confirmationtext = "¿Desea eliminar el accesorio?" ;
      Dvelop_confirmpanel_eliminaraccesorios_Title = "" ;
      Dvelop_confirmpanel_crearaccesorios_Confirmtype = "1" ;
      Dvelop_confirmpanel_crearaccesorios_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_crearaccesorios_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_crearaccesorios_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_crearaccesorios_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_crearaccesorios_Confirmationtext = "¿Desea Crear Accesorio?" ;
      Dvelop_confirmpanel_crearaccesorios_Title = "" ;
      Ddo_grid_Datalistproc = "Pedidos.GeneracionAccesorios1GetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic||||Dynamic||Dynamic|Dynamic|Dynamic|||Dynamic|Dynamic||||Dynamic||Dynamic" ;
      Ddo_grid_Includedatalist = "T||||T||T|T|T|||T|T||||T||T" ;
      Ddo_grid_Filterisrange = "|T||T||T||||T|T|||T|T|T||T|" ;
      Ddo_grid_Filtertype = "Character|Numeric|Date|Numeric|Character|Numeric|Character|Character|Character|Numeric|Numeric|Character|Character|Numeric|Numeric|Numeric|Character|Numeric|Character" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Columnssortvalues = "||||||||||||||||||" ;
      Ddo_grid_Columnids = "1:DisUsrCod|2:DisCod|3:DisFec|5:CliCod|6:CliNom|8:DisPart|9:DisArtCod|10:DisArtDsc|11:DisColNom|12:DisColNum|13:DisTipCol|14:DisNomCli|15:DisUniMed|16:DisPiePie|17:DisPieKgm|18:DisPieMtr|19:MaqCodDis|20:DisVolMaq|21:RevenID" ;
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
      GXCCtl = "vSELECCIONAR_" + sGXsfl_62_idx ;
      chkavSeleccionar.setName( GXCCtl );
      chkavSeleccionar.setWebtags( "" );
      chkavSeleccionar.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSeleccionar.getInternalname(), "TitleCaption", chkavSeleccionar.getCaption(), !bGXsfl_62_Refreshing);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A1202MacDisCod',fld:'MACDISCOD',pic:'ZZZZZZZ9'},{av:'A1199MacCod',fld:'MACCOD',pic:'ZZZZZZZ9'},{av:'AV77Col_Discod',fld:'vCOL_DISCOD',pic:''},{av:'sPrefix'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV16DisEst',fld:'vDISEST',pic:'9'},{av:'AV82TFDisUsrCod',fld:'vTFDISUSRCOD',pic:''},{av:'AV83TFDisUsrCod_Sel',fld:'vTFDISUSRCOD_SEL',pic:''},{av:'AV43TFDisCod',fld:'vTFDISCOD',pic:'ZZZZZZZ9'},{av:'AV44TFDisCod_To',fld:'vTFDISCOD_TO',pic:'ZZZZZZZ9'},{av:'AV51TFDisFec',fld:'vTFDISFEC',pic:''},{av:'AV35TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV36TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV37TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV38TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV55TFDisPart',fld:'vTFDISPART',pic:'ZZZ9'},{av:'AV56TFDisPart_To',fld:'vTFDISPART_TO',pic:'ZZZ9'},{av:'AV39TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV40TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV41TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV42TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV45TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV46TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV47TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV48TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV63TFDisTipCol',fld:'vTFDISTIPCOL',pic:'Z9'},{av:'AV64TFDisTipCol_To',fld:'vTFDISTIPCOL_TO',pic:'Z9'},{av:'AV53TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV54TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV65TFDisUniMed',fld:'vTFDISUNIMED',pic:'@!'},{av:'AV66TFDisUniMed_Sel',fld:'vTFDISUNIMED_SEL',pic:'@!'},{av:'AV61TFDisPiePie',fld:'vTFDISPIEPIE',pic:'ZZZ9'},{av:'AV62TFDisPiePie_To',fld:'vTFDISPIEPIE_TO',pic:'ZZZ9'},{av:'AV57TFDisPieKgm',fld:'vTFDISPIEKGM',pic:'ZZZZZ9.99'},{av:'AV58TFDisPieKgm_To',fld:'vTFDISPIEKGM_TO',pic:'ZZZZZ9.99'},{av:'AV59TFDisPieMtr',fld:'vTFDISPIEMTR',pic:'ZZZZZ9.99'},{av:'AV60TFDisPieMtr_To',fld:'vTFDISPIEMTR_TO',pic:'ZZZZZ9.99'},{av:'AV84TFMaqCodDis',fld:'vTFMAQCODDIS',pic:''},{av:'AV85TFMaqCodDis_Sel',fld:'vTFMAQCODDIS_SEL',pic:''},{av:'AV86TFDisVolMaq',fld:'vTFDISVOLMAQ',pic:'ZZZZ9'},{av:'AV87TFDisVolMaq_To',fld:'vTFDISVOLMAQ_TO',pic:'ZZZZ9'},{av:'AV88TFRevenID',fld:'vTFREVENID',pic:''},{av:'AV89TFRevenID_Sel',fld:'vTFREVENID_SEL',pic:''},{av:'AV92Pgmname',fld:'vPGMNAME',pic:''},{av:'AV81BarNHdr',fld:'vBARNHDR',pic:''},{av:'AV69TotDisPiePie',fld:'vTOTDISPIEPIE',pic:'ZZZ9',hsh:true},{av:'AV67TotDisPieKgm',fld:'vTOTDISPIEKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV68TotDisPieMtr',fld:'vTOTDISPIEMTR',pic:'ZZZZZ9.99',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A367DisEst',fld:'DISEST',pic:'9'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A387DisPiePie',fld:'DISPIEPIE',pic:'ZZZ9'},{av:'A381DisPieKgm',fld:'DISPIEKGM',pic:'ZZZZZ9.99'},{av:'A385DisPieMtr',fld:'DISPIEMTR',pic:'ZZZZZ9.99'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV18GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV19GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV69TotDisPiePie',fld:'vTOTDISPIEPIE',pic:'ZZZ9',hsh:true},{av:'AV67TotDisPieKgm',fld:'vTOTDISPIEKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV68TotDisPieMtr',fld:'vTOTDISPIEMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV72TotValueDisPiePie',fld:'vTOTVALUEDISPIEPIE',pic:''},{av:'AV70TotValueDisPieKgm',fld:'vTOTVALUEDISPIEKGM',pic:''},{av:'AV71TotValueDisPieMtr',fld:'vTOTVALUEDISPIEMTR',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1325T2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV16DisEst',fld:'vDISEST',pic:'9'},{av:'AV82TFDisUsrCod',fld:'vTFDISUSRCOD',pic:''},{av:'AV83TFDisUsrCod_Sel',fld:'vTFDISUSRCOD_SEL',pic:''},{av:'AV43TFDisCod',fld:'vTFDISCOD',pic:'ZZZZZZZ9'},{av:'AV44TFDisCod_To',fld:'vTFDISCOD_TO',pic:'ZZZZZZZ9'},{av:'AV51TFDisFec',fld:'vTFDISFEC',pic:''},{av:'AV35TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV36TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV37TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV38TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV55TFDisPart',fld:'vTFDISPART',pic:'ZZZ9'},{av:'AV56TFDisPart_To',fld:'vTFDISPART_TO',pic:'ZZZ9'},{av:'AV39TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV40TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV41TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV42TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV45TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV46TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV47TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV48TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV63TFDisTipCol',fld:'vTFDISTIPCOL',pic:'Z9'},{av:'AV64TFDisTipCol_To',fld:'vTFDISTIPCOL_TO',pic:'Z9'},{av:'AV53TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV54TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV65TFDisUniMed',fld:'vTFDISUNIMED',pic:'@!'},{av:'AV66TFDisUniMed_Sel',fld:'vTFDISUNIMED_SEL',pic:'@!'},{av:'AV61TFDisPiePie',fld:'vTFDISPIEPIE',pic:'ZZZ9'},{av:'AV62TFDisPiePie_To',fld:'vTFDISPIEPIE_TO',pic:'ZZZ9'},{av:'AV57TFDisPieKgm',fld:'vTFDISPIEKGM',pic:'ZZZZZ9.99'},{av:'AV58TFDisPieKgm_To',fld:'vTFDISPIEKGM_TO',pic:'ZZZZZ9.99'},{av:'AV59TFDisPieMtr',fld:'vTFDISPIEMTR',pic:'ZZZZZ9.99'},{av:'AV60TFDisPieMtr_To',fld:'vTFDISPIEMTR_TO',pic:'ZZZZZ9.99'},{av:'AV84TFMaqCodDis',fld:'vTFMAQCODDIS',pic:''},{av:'AV85TFMaqCodDis_Sel',fld:'vTFMAQCODDIS_SEL',pic:''},{av:'AV86TFDisVolMaq',fld:'vTFDISVOLMAQ',pic:'ZZZZ9'},{av:'AV87TFDisVolMaq_To',fld:'vTFDISVOLMAQ_TO',pic:'ZZZZ9'},{av:'AV88TFRevenID',fld:'vTFREVENID',pic:''},{av:'AV89TFRevenID_Sel',fld:'vTFREVENID_SEL',pic:''},{av:'AV92Pgmname',fld:'vPGMNAME',pic:''},{av:'AV81BarNHdr',fld:'vBARNHDR',pic:''},{av:'AV69TotDisPiePie',fld:'vTOTDISPIEPIE',pic:'ZZZ9',hsh:true},{av:'AV67TotDisPieKgm',fld:'vTOTDISPIEKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV68TotDisPieMtr',fld:'vTOTDISPIEMTR',pic:'ZZZZZ9.99',hsh:true},{av:'A1202MacDisCod',fld:'MACDISCOD',pic:'ZZZZZZZ9'},{av:'A1199MacCod',fld:'MACCOD',pic:'ZZZZZZZ9'},{av:'AV77Col_Discod',fld:'vCOL_DISCOD',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1425T2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV16DisEst',fld:'vDISEST',pic:'9'},{av:'AV82TFDisUsrCod',fld:'vTFDISUSRCOD',pic:''},{av:'AV83TFDisUsrCod_Sel',fld:'vTFDISUSRCOD_SEL',pic:''},{av:'AV43TFDisCod',fld:'vTFDISCOD',pic:'ZZZZZZZ9'},{av:'AV44TFDisCod_To',fld:'vTFDISCOD_TO',pic:'ZZZZZZZ9'},{av:'AV51TFDisFec',fld:'vTFDISFEC',pic:''},{av:'AV35TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV36TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV37TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV38TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV55TFDisPart',fld:'vTFDISPART',pic:'ZZZ9'},{av:'AV56TFDisPart_To',fld:'vTFDISPART_TO',pic:'ZZZ9'},{av:'AV39TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV40TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV41TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV42TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV45TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV46TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV47TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV48TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV63TFDisTipCol',fld:'vTFDISTIPCOL',pic:'Z9'},{av:'AV64TFDisTipCol_To',fld:'vTFDISTIPCOL_TO',pic:'Z9'},{av:'AV53TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV54TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV65TFDisUniMed',fld:'vTFDISUNIMED',pic:'@!'},{av:'AV66TFDisUniMed_Sel',fld:'vTFDISUNIMED_SEL',pic:'@!'},{av:'AV61TFDisPiePie',fld:'vTFDISPIEPIE',pic:'ZZZ9'},{av:'AV62TFDisPiePie_To',fld:'vTFDISPIEPIE_TO',pic:'ZZZ9'},{av:'AV57TFDisPieKgm',fld:'vTFDISPIEKGM',pic:'ZZZZZ9.99'},{av:'AV58TFDisPieKgm_To',fld:'vTFDISPIEKGM_TO',pic:'ZZZZZ9.99'},{av:'AV59TFDisPieMtr',fld:'vTFDISPIEMTR',pic:'ZZZZZ9.99'},{av:'AV60TFDisPieMtr_To',fld:'vTFDISPIEMTR_TO',pic:'ZZZZZ9.99'},{av:'AV84TFMaqCodDis',fld:'vTFMAQCODDIS',pic:''},{av:'AV85TFMaqCodDis_Sel',fld:'vTFMAQCODDIS_SEL',pic:''},{av:'AV86TFDisVolMaq',fld:'vTFDISVOLMAQ',pic:'ZZZZ9'},{av:'AV87TFDisVolMaq_To',fld:'vTFDISVOLMAQ_TO',pic:'ZZZZ9'},{av:'AV88TFRevenID',fld:'vTFREVENID',pic:''},{av:'AV89TFRevenID_Sel',fld:'vTFREVENID_SEL',pic:''},{av:'AV92Pgmname',fld:'vPGMNAME',pic:''},{av:'AV81BarNHdr',fld:'vBARNHDR',pic:''},{av:'AV69TotDisPiePie',fld:'vTOTDISPIEPIE',pic:'ZZZ9',hsh:true},{av:'AV67TotDisPieKgm',fld:'vTOTDISPIEKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV68TotDisPieMtr',fld:'vTOTDISPIEMTR',pic:'ZZZZZ9.99',hsh:true},{av:'A1202MacDisCod',fld:'MACDISCOD',pic:'ZZZZZZZ9'},{av:'A1199MacCod',fld:'MACCOD',pic:'ZZZZZZZ9'},{av:'AV77Col_Discod',fld:'vCOL_DISCOD',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e1525T2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV16DisEst',fld:'vDISEST',pic:'9'},{av:'AV82TFDisUsrCod',fld:'vTFDISUSRCOD',pic:''},{av:'AV83TFDisUsrCod_Sel',fld:'vTFDISUSRCOD_SEL',pic:''},{av:'AV43TFDisCod',fld:'vTFDISCOD',pic:'ZZZZZZZ9'},{av:'AV44TFDisCod_To',fld:'vTFDISCOD_TO',pic:'ZZZZZZZ9'},{av:'AV51TFDisFec',fld:'vTFDISFEC',pic:''},{av:'AV35TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV36TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV37TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV38TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV55TFDisPart',fld:'vTFDISPART',pic:'ZZZ9'},{av:'AV56TFDisPart_To',fld:'vTFDISPART_TO',pic:'ZZZ9'},{av:'AV39TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV40TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV41TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV42TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV45TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV46TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV47TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV48TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV63TFDisTipCol',fld:'vTFDISTIPCOL',pic:'Z9'},{av:'AV64TFDisTipCol_To',fld:'vTFDISTIPCOL_TO',pic:'Z9'},{av:'AV53TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV54TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV65TFDisUniMed',fld:'vTFDISUNIMED',pic:'@!'},{av:'AV66TFDisUniMed_Sel',fld:'vTFDISUNIMED_SEL',pic:'@!'},{av:'AV61TFDisPiePie',fld:'vTFDISPIEPIE',pic:'ZZZ9'},{av:'AV62TFDisPiePie_To',fld:'vTFDISPIEPIE_TO',pic:'ZZZ9'},{av:'AV57TFDisPieKgm',fld:'vTFDISPIEKGM',pic:'ZZZZZ9.99'},{av:'AV58TFDisPieKgm_To',fld:'vTFDISPIEKGM_TO',pic:'ZZZZZ9.99'},{av:'AV59TFDisPieMtr',fld:'vTFDISPIEMTR',pic:'ZZZZZ9.99'},{av:'AV60TFDisPieMtr_To',fld:'vTFDISPIEMTR_TO',pic:'ZZZZZ9.99'},{av:'AV84TFMaqCodDis',fld:'vTFMAQCODDIS',pic:''},{av:'AV85TFMaqCodDis_Sel',fld:'vTFMAQCODDIS_SEL',pic:''},{av:'AV86TFDisVolMaq',fld:'vTFDISVOLMAQ',pic:'ZZZZ9'},{av:'AV87TFDisVolMaq_To',fld:'vTFDISVOLMAQ_TO',pic:'ZZZZ9'},{av:'AV88TFRevenID',fld:'vTFREVENID',pic:''},{av:'AV89TFRevenID_Sel',fld:'vTFREVENID_SEL',pic:''},{av:'AV92Pgmname',fld:'vPGMNAME',pic:''},{av:'AV81BarNHdr',fld:'vBARNHDR',pic:''},{av:'AV69TotDisPiePie',fld:'vTOTDISPIEPIE',pic:'ZZZ9',hsh:true},{av:'AV67TotDisPieKgm',fld:'vTOTDISPIEKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV68TotDisPieMtr',fld:'vTOTDISPIEMTR',pic:'ZZZZZ9.99',hsh:true},{av:'A1202MacDisCod',fld:'MACDISCOD',pic:'ZZZZZZZ9'},{av:'A1199MacCod',fld:'MACCOD',pic:'ZZZZZZZ9'},{av:'AV77Col_Discod',fld:'vCOL_DISCOD',pic:''},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV88TFRevenID',fld:'vTFREVENID',pic:''},{av:'AV89TFRevenID_Sel',fld:'vTFREVENID_SEL',pic:''},{av:'AV86TFDisVolMaq',fld:'vTFDISVOLMAQ',pic:'ZZZZ9'},{av:'AV87TFDisVolMaq_To',fld:'vTFDISVOLMAQ_TO',pic:'ZZZZ9'},{av:'AV84TFMaqCodDis',fld:'vTFMAQCODDIS',pic:''},{av:'AV85TFMaqCodDis_Sel',fld:'vTFMAQCODDIS_SEL',pic:''},{av:'AV59TFDisPieMtr',fld:'vTFDISPIEMTR',pic:'ZZZZZ9.99'},{av:'AV60TFDisPieMtr_To',fld:'vTFDISPIEMTR_TO',pic:'ZZZZZ9.99'},{av:'AV57TFDisPieKgm',fld:'vTFDISPIEKGM',pic:'ZZZZZ9.99'},{av:'AV58TFDisPieKgm_To',fld:'vTFDISPIEKGM_TO',pic:'ZZZZZ9.99'},{av:'AV61TFDisPiePie',fld:'vTFDISPIEPIE',pic:'ZZZ9'},{av:'AV62TFDisPiePie_To',fld:'vTFDISPIEPIE_TO',pic:'ZZZ9'},{av:'AV65TFDisUniMed',fld:'vTFDISUNIMED',pic:'@!'},{av:'AV66TFDisUniMed_Sel',fld:'vTFDISUNIMED_SEL',pic:'@!'},{av:'AV53TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV54TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV63TFDisTipCol',fld:'vTFDISTIPCOL',pic:'Z9'},{av:'AV64TFDisTipCol_To',fld:'vTFDISTIPCOL_TO',pic:'Z9'},{av:'AV47TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV48TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV45TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV46TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV41TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV42TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV39TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV40TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV55TFDisPart',fld:'vTFDISPART',pic:'ZZZ9'},{av:'AV56TFDisPart_To',fld:'vTFDISPART_TO',pic:'ZZZ9'},{av:'AV37TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV38TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV35TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV36TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV51TFDisFec',fld:'vTFDISFEC',pic:''},{av:'AV43TFDisCod',fld:'vTFDISCOD',pic:'ZZZZZZZ9'},{av:'AV44TFDisCod_To',fld:'vTFDISCOD_TO',pic:'ZZZZZZZ9'},{av:'AV82TFDisUsrCod',fld:'vTFDISUSRCOD',pic:''},{av:'AV83TFDisUsrCod_Sel',fld:'vTFDISUSRCOD_SEL',pic:''}]}");
      setEventMetadata("GRID.LOAD","{handler:'e2225T2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1202MacDisCod',fld:'MACDISCOD',pic:'ZZZZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A1199MacCod',fld:'MACCOD',pic:'ZZZZZZZ9'},{av:'A4813DisEncCli',fld:'DISENCCLI',pic:''},{av:'A360DisCliNum',fld:'DISCLINUM',pic:''},{av:'AV77Col_Discod',fld:'vCOL_DISCOD',pic:''}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV33Seleccionar',fld:'vSELECCIONAR',pic:''},{av:'AV25MacCod',fld:'vMACCOD',pic:'ZZZZZZZ9'},{av:'AV80DisEncCli',fld:'vDISENCCLI',pic:''}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e1825T2',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("'DOGENERARHDRS'","{handler:'e1925T2',iparms:[{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV81BarNHdr',fld:'vBARNHDR',pic:''}]");
      setEventMetadata("'DOGENERARHDRS'",",oparms:[]}");
      setEventMetadata("'DOCREARACCESORIOS'","{handler:'e1125T1',iparms:[{av:'AV77Col_Discod',fld:'vCOL_DISCOD',pic:''}]");
      setEventMetadata("'DOCREARACCESORIOS'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_CREARACCESORIOS.CLOSE","{handler:'e1625T2',iparms:[{av:'Dvelop_confirmpanel_crearaccesorios_Result',ctrl:'DVELOP_CONFIRMPANEL_CREARACCESORIOS',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV16DisEst',fld:'vDISEST',pic:'9'},{av:'AV82TFDisUsrCod',fld:'vTFDISUSRCOD',pic:''},{av:'AV83TFDisUsrCod_Sel',fld:'vTFDISUSRCOD_SEL',pic:''},{av:'AV43TFDisCod',fld:'vTFDISCOD',pic:'ZZZZZZZ9'},{av:'AV44TFDisCod_To',fld:'vTFDISCOD_TO',pic:'ZZZZZZZ9'},{av:'AV51TFDisFec',fld:'vTFDISFEC',pic:''},{av:'AV35TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV36TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV37TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV38TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV55TFDisPart',fld:'vTFDISPART',pic:'ZZZ9'},{av:'AV56TFDisPart_To',fld:'vTFDISPART_TO',pic:'ZZZ9'},{av:'AV39TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV40TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV41TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV42TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV45TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV46TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV47TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV48TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV63TFDisTipCol',fld:'vTFDISTIPCOL',pic:'Z9'},{av:'AV64TFDisTipCol_To',fld:'vTFDISTIPCOL_TO',pic:'Z9'},{av:'AV53TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV54TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV65TFDisUniMed',fld:'vTFDISUNIMED',pic:'@!'},{av:'AV66TFDisUniMed_Sel',fld:'vTFDISUNIMED_SEL',pic:'@!'},{av:'AV61TFDisPiePie',fld:'vTFDISPIEPIE',pic:'ZZZ9'},{av:'AV62TFDisPiePie_To',fld:'vTFDISPIEPIE_TO',pic:'ZZZ9'},{av:'AV57TFDisPieKgm',fld:'vTFDISPIEKGM',pic:'ZZZZZ9.99'},{av:'AV58TFDisPieKgm_To',fld:'vTFDISPIEKGM_TO',pic:'ZZZZZ9.99'},{av:'AV59TFDisPieMtr',fld:'vTFDISPIEMTR',pic:'ZZZZZ9.99'},{av:'AV60TFDisPieMtr_To',fld:'vTFDISPIEMTR_TO',pic:'ZZZZZ9.99'},{av:'AV84TFMaqCodDis',fld:'vTFMAQCODDIS',pic:''},{av:'AV85TFMaqCodDis_Sel',fld:'vTFMAQCODDIS_SEL',pic:''},{av:'AV86TFDisVolMaq',fld:'vTFDISVOLMAQ',pic:'ZZZZ9'},{av:'AV87TFDisVolMaq_To',fld:'vTFDISVOLMAQ_TO',pic:'ZZZZ9'},{av:'AV88TFRevenID',fld:'vTFREVENID',pic:''},{av:'AV89TFRevenID_Sel',fld:'vTFREVENID_SEL',pic:''},{av:'AV92Pgmname',fld:'vPGMNAME',pic:''},{av:'AV81BarNHdr',fld:'vBARNHDR',pic:''},{av:'AV69TotDisPiePie',fld:'vTOTDISPIEPIE',pic:'ZZZ9',hsh:true},{av:'AV67TotDisPieKgm',fld:'vTOTDISPIEKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV68TotDisPieMtr',fld:'vTOTDISPIEMTR',pic:'ZZZZZ9.99',hsh:true},{av:'A1202MacDisCod',fld:'MACDISCOD',pic:'ZZZZZZZ9'},{av:'A1199MacCod',fld:'MACCOD',pic:'ZZZZZZZ9'},{av:'AV77Col_Discod',fld:'vCOL_DISCOD',pic:''},{av:'sPrefix'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A367DisEst',fld:'DISEST',pic:'9'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A387DisPiePie',fld:'DISPIEPIE',pic:'ZZZ9'},{av:'A381DisPieKgm',fld:'DISPIEKGM',pic:'ZZZZZ9.99'},{av:'A385DisPieMtr',fld:'DISPIEMTR',pic:'ZZZZZ9.99'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_CREARACCESORIOS.CLOSE",",oparms:[{av:'AV77Col_Discod',fld:'vCOL_DISCOD',pic:''},{av:'AV18GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV19GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV69TotDisPiePie',fld:'vTOTDISPIEPIE',pic:'ZZZ9',hsh:true},{av:'AV67TotDisPieKgm',fld:'vTOTDISPIEKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV68TotDisPieMtr',fld:'vTOTDISPIEMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV72TotValueDisPiePie',fld:'vTOTVALUEDISPIEPIE',pic:''},{av:'AV70TotValueDisPieKgm',fld:'vTOTVALUEDISPIEKGM',pic:''},{av:'AV71TotValueDisPieMtr',fld:'vTOTVALUEDISPIEMTR',pic:''}]}");
      setEventMetadata("'DOELIMINARACCESORIOS'","{handler:'e1225T1',iparms:[{av:'AV25MacCod',fld:'vMACCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DOELIMINARACCESORIOS'",",oparms:[{av:'Dvelop_confirmpanel_eliminaraccesorios_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_ELIMINARACCESORIOS',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARACCESORIOS.CLOSE","{handler:'e1725T2',iparms:[{av:'Dvelop_confirmpanel_eliminaraccesorios_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINARACCESORIOS',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV16DisEst',fld:'vDISEST',pic:'9'},{av:'AV82TFDisUsrCod',fld:'vTFDISUSRCOD',pic:''},{av:'AV83TFDisUsrCod_Sel',fld:'vTFDISUSRCOD_SEL',pic:''},{av:'AV43TFDisCod',fld:'vTFDISCOD',pic:'ZZZZZZZ9'},{av:'AV44TFDisCod_To',fld:'vTFDISCOD_TO',pic:'ZZZZZZZ9'},{av:'AV51TFDisFec',fld:'vTFDISFEC',pic:''},{av:'AV35TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV36TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV37TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV38TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV55TFDisPart',fld:'vTFDISPART',pic:'ZZZ9'},{av:'AV56TFDisPart_To',fld:'vTFDISPART_TO',pic:'ZZZ9'},{av:'AV39TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV40TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV41TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV42TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV45TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV46TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV47TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV48TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV63TFDisTipCol',fld:'vTFDISTIPCOL',pic:'Z9'},{av:'AV64TFDisTipCol_To',fld:'vTFDISTIPCOL_TO',pic:'Z9'},{av:'AV53TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV54TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV65TFDisUniMed',fld:'vTFDISUNIMED',pic:'@!'},{av:'AV66TFDisUniMed_Sel',fld:'vTFDISUNIMED_SEL',pic:'@!'},{av:'AV61TFDisPiePie',fld:'vTFDISPIEPIE',pic:'ZZZ9'},{av:'AV62TFDisPiePie_To',fld:'vTFDISPIEPIE_TO',pic:'ZZZ9'},{av:'AV57TFDisPieKgm',fld:'vTFDISPIEKGM',pic:'ZZZZZ9.99'},{av:'AV58TFDisPieKgm_To',fld:'vTFDISPIEKGM_TO',pic:'ZZZZZ9.99'},{av:'AV59TFDisPieMtr',fld:'vTFDISPIEMTR',pic:'ZZZZZ9.99'},{av:'AV60TFDisPieMtr_To',fld:'vTFDISPIEMTR_TO',pic:'ZZZZZ9.99'},{av:'AV84TFMaqCodDis',fld:'vTFMAQCODDIS',pic:''},{av:'AV85TFMaqCodDis_Sel',fld:'vTFMAQCODDIS_SEL',pic:''},{av:'AV86TFDisVolMaq',fld:'vTFDISVOLMAQ',pic:'ZZZZ9'},{av:'AV87TFDisVolMaq_To',fld:'vTFDISVOLMAQ_TO',pic:'ZZZZ9'},{av:'AV88TFRevenID',fld:'vTFREVENID',pic:''},{av:'AV89TFRevenID_Sel',fld:'vTFREVENID_SEL',pic:''},{av:'AV92Pgmname',fld:'vPGMNAME',pic:''},{av:'AV81BarNHdr',fld:'vBARNHDR',pic:''},{av:'AV69TotDisPiePie',fld:'vTOTDISPIEPIE',pic:'ZZZ9',hsh:true},{av:'AV67TotDisPieKgm',fld:'vTOTDISPIEKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV68TotDisPieMtr',fld:'vTOTDISPIEMTR',pic:'ZZZZZ9.99',hsh:true},{av:'A1202MacDisCod',fld:'MACDISCOD',pic:'ZZZZZZZ9'},{av:'A1199MacCod',fld:'MACCOD',pic:'ZZZZZZZ9'},{av:'AV77Col_Discod',fld:'vCOL_DISCOD',pic:''},{av:'sPrefix'},{av:'AV25MacCod',fld:'vMACCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A367DisEst',fld:'DISEST',pic:'9'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A387DisPiePie',fld:'DISPIEPIE',pic:'ZZZ9'},{av:'A381DisPieKgm',fld:'DISPIEKGM',pic:'ZZZZZ9.99'},{av:'A385DisPieMtr',fld:'DISPIEMTR',pic:'ZZZZZ9.99'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARACCESORIOS.CLOSE",",oparms:[{av:'AV25MacCod',fld:'vMACCOD',pic:'ZZZZZZZ9'},{av:'AV18GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV19GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV69TotDisPiePie',fld:'vTOTDISPIEPIE',pic:'ZZZ9',hsh:true},{av:'AV67TotDisPieKgm',fld:'vTOTDISPIEKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV68TotDisPieMtr',fld:'vTOTDISPIEMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV72TotValueDisPiePie',fld:'vTOTVALUEDISPIEPIE',pic:''},{av:'AV70TotValueDisPieKgm',fld:'vTOTVALUEDISPIEKGM',pic:''},{av:'AV71TotValueDisPieMtr',fld:'vTOTVALUEDISPIEMTR',pic:''}]}");
      setEventMetadata("VSELECCIONAR.CLICK","{handler:'e2325T2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV16DisEst',fld:'vDISEST',pic:'9'},{av:'AV82TFDisUsrCod',fld:'vTFDISUSRCOD',pic:''},{av:'AV83TFDisUsrCod_Sel',fld:'vTFDISUSRCOD_SEL',pic:''},{av:'AV43TFDisCod',fld:'vTFDISCOD',pic:'ZZZZZZZ9'},{av:'AV44TFDisCod_To',fld:'vTFDISCOD_TO',pic:'ZZZZZZZ9'},{av:'AV51TFDisFec',fld:'vTFDISFEC',pic:''},{av:'AV35TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV36TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV37TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV38TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV55TFDisPart',fld:'vTFDISPART',pic:'ZZZ9'},{av:'AV56TFDisPart_To',fld:'vTFDISPART_TO',pic:'ZZZ9'},{av:'AV39TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV40TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV41TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV42TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV45TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV46TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV47TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV48TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV63TFDisTipCol',fld:'vTFDISTIPCOL',pic:'Z9'},{av:'AV64TFDisTipCol_To',fld:'vTFDISTIPCOL_TO',pic:'Z9'},{av:'AV53TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV54TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV65TFDisUniMed',fld:'vTFDISUNIMED',pic:'@!'},{av:'AV66TFDisUniMed_Sel',fld:'vTFDISUNIMED_SEL',pic:'@!'},{av:'AV61TFDisPiePie',fld:'vTFDISPIEPIE',pic:'ZZZ9'},{av:'AV62TFDisPiePie_To',fld:'vTFDISPIEPIE_TO',pic:'ZZZ9'},{av:'AV57TFDisPieKgm',fld:'vTFDISPIEKGM',pic:'ZZZZZ9.99'},{av:'AV58TFDisPieKgm_To',fld:'vTFDISPIEKGM_TO',pic:'ZZZZZ9.99'},{av:'AV59TFDisPieMtr',fld:'vTFDISPIEMTR',pic:'ZZZZZ9.99'},{av:'AV60TFDisPieMtr_To',fld:'vTFDISPIEMTR_TO',pic:'ZZZZZ9.99'},{av:'AV84TFMaqCodDis',fld:'vTFMAQCODDIS',pic:''},{av:'AV85TFMaqCodDis_Sel',fld:'vTFMAQCODDIS_SEL',pic:''},{av:'AV86TFDisVolMaq',fld:'vTFDISVOLMAQ',pic:'ZZZZ9'},{av:'AV87TFDisVolMaq_To',fld:'vTFDISVOLMAQ_TO',pic:'ZZZZ9'},{av:'AV88TFRevenID',fld:'vTFREVENID',pic:''},{av:'AV89TFRevenID_Sel',fld:'vTFREVENID_SEL',pic:''},{av:'AV92Pgmname',fld:'vPGMNAME',pic:''},{av:'AV81BarNHdr',fld:'vBARNHDR',pic:''},{av:'AV69TotDisPiePie',fld:'vTOTDISPIEPIE',pic:'ZZZ9',hsh:true},{av:'AV67TotDisPieKgm',fld:'vTOTDISPIEKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV68TotDisPieMtr',fld:'vTOTDISPIEMTR',pic:'ZZZZZ9.99',hsh:true},{av:'A1202MacDisCod',fld:'MACDISCOD',pic:'ZZZZZZZ9'},{av:'A1199MacCod',fld:'MACCOD',pic:'ZZZZZZZ9'},{av:'AV77Col_Discod',fld:'vCOL_DISCOD',pic:''},{av:'sPrefix'},{av:'AV33Seleccionar',fld:'vSELECCIONAR',pic:''},{av:'AV25MacCod',fld:'vMACCOD',pic:'ZZZZZZZ9'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A367DisEst',fld:'DISEST',pic:'9'},{av:'A387DisPiePie',fld:'DISPIEPIE',pic:'ZZZ9'},{av:'A381DisPieKgm',fld:'DISPIEKGM',pic:'ZZZZZ9.99'},{av:'A385DisPieMtr',fld:'DISPIEMTR',pic:'ZZZZZ9.99'}]");
      setEventMetadata("VSELECCIONAR.CLICK",",oparms:[{av:'AV77Col_Discod',fld:'vCOL_DISCOD',pic:''},{av:'AV33Seleccionar',fld:'vSELECCIONAR',pic:''},{av:'AV18GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV19GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV69TotDisPiePie',fld:'vTOTDISPIEPIE',pic:'ZZZ9',hsh:true},{av:'AV67TotDisPieKgm',fld:'vTOTDISPIEKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV68TotDisPieMtr',fld:'vTOTDISPIEMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV72TotValueDisPiePie',fld:'vTOTVALUEDISPIEPIE',pic:''},{av:'AV70TotValueDisPieKgm',fld:'vTOTVALUEDISPIEKGM',pic:''},{av:'AV71TotValueDisPieMtr',fld:'vTOTVALUEDISPIEMTR',pic:''}]}");
      setEventMetadata("VALID_DISCOD","{handler:'valid_Discod',iparms:[]");
      setEventMetadata("VALID_DISCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_DISPIEKGM","{handler:'valid_Dispiekgm',iparms:[]");
      setEventMetadata("VALID_DISPIEKGM",",oparms:[]}");
      setEventMetadata("VALID_DISPIEMTR","{handler:'valid_Dispiemtr',iparms:[]");
      setEventMetadata("VALID_DISPIEMTR",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Revenid',iparms:[]");
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
   public java.math.BigDecimal getDisPieMtr1( String E396EmprCod ,
                                              int E361DisCod )
   {
      X631Metros = DecimalUtil.doubleToDec(0) ;
      /* Using cursor H025T9 */
      pr_default.execute(4, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         X631Metros = H025T9_A631Metros[0] ;
      }
      pr_default.close(4);
      return X631Metros ;
   }

   public java.math.BigDecimal getDisPieMtr0( String E396EmprCod ,
                                              int E361DisCod )
   {
      X384DisPieMet = DecimalUtil.doubleToDec(0) ;
      /* Using cursor H025T10 */
      pr_default.execute(5, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         X384DisPieMet = H025T10_A384DisPieMet[0] ;
      }
      pr_default.close(5);
      return X384DisPieMet ;
   }

   public java.math.BigDecimal getDisPieKgm1( String E396EmprCod ,
                                              int E361DisCod )
   {
      X595Kilos = DecimalUtil.ZERO ;
      /* Using cursor H025T11 */
      pr_default.execute(6, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         X595Kilos = H025T11_A595Kilos[0] ;
      }
      pr_default.close(6);
      return X595Kilos ;
   }

   public java.math.BigDecimal getDisPieKgm0( String E396EmprCod ,
                                              int E361DisCod )
   {
      X382DisPieKil = DecimalUtil.ZERO ;
      /* Using cursor H025T12 */
      pr_default.execute(7, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         X382DisPieKil = H025T12_A382DisPieKil[0] ;
      }
      pr_default.close(7);
      return X382DisPieKil ;
   }

   public void initialize( )
   {
      wcpOAV5EmprCod = "" ;
      wcpOAV81BarNHdr = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Dvelop_confirmpanel_crearaccesorios_Result = "" ;
      Dvelop_confirmpanel_eliminaraccesorios_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV5EmprCod = "" ;
      AV81BarNHdr = "" ;
      AV82TFDisUsrCod = "" ;
      AV83TFDisUsrCod_Sel = "" ;
      AV51TFDisFec = GXutil.nullDate() ;
      AV37TFCliNom = "" ;
      AV38TFCliNom_Sel = "" ;
      AV39TFDisArtCod = "" ;
      AV40TFDisArtCod_Sel = "" ;
      AV41TFDisArtDsc = "" ;
      AV42TFDisArtDsc_Sel = "" ;
      AV45TFDisColNom = "" ;
      AV46TFDisColNom_Sel = "" ;
      AV53TFDisNomCli = "" ;
      AV54TFDisNomCli_Sel = "" ;
      AV65TFDisUniMed = "" ;
      AV66TFDisUniMed_Sel = "" ;
      AV57TFDisPieKgm = DecimalUtil.ZERO ;
      AV58TFDisPieKgm_To = DecimalUtil.ZERO ;
      AV59TFDisPieMtr = DecimalUtil.ZERO ;
      AV60TFDisPieMtr_To = DecimalUtil.ZERO ;
      AV84TFMaqCodDis = "" ;
      AV85TFMaqCodDis_Sel = "" ;
      AV88TFRevenID = "" ;
      AV89TFRevenID_Sel = "" ;
      AV92Pgmname = "" ;
      AV67TotDisPieKgm = DecimalUtil.ZERO ;
      AV68TotDisPieMtr = DecimalUtil.ZERO ;
      AV77Col_Discod = new GXSimpleCollection<Integer>(Integer.class, "internal", "");
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV15DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A4813DisEncCli = "" ;
      A360DisCliNum = "" ;
      A396EmprCod = "" ;
      A365DisDes = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Grid_titlescategories_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      TempTags = "" ;
      bttBtncrearaccesorios_Jsonclick = "" ;
      bttBtneliminaraccesorios_Jsonclick = "" ;
      bttBtngenerarhdrs_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      ucBarradeprogreso = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_titlescategories = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV13DDO_DisFecAuxDate = GXutil.nullDate() ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV33Seleccionar = "" ;
      A4348DisUsrCod = "" ;
      A369DisFec = GXutil.nullDate() ;
      A279CliNom = "" ;
      AV80DisEncCli = "" ;
      A335DisArtCod = "" ;
      A337DisArtDsc = "" ;
      A362DisColNom = "" ;
      A1195DisNomCli = "" ;
      A392DisUniMed = "" ;
      A381DisPieKgm = DecimalUtil.ZERO ;
      A385DisPieMtr = DecimalUtil.ZERO ;
      A1122MaqCodDis = "" ;
      A12328RevenID = "" ;
      AV93Pedidos_generacionaccesorios1ds_1_tfdisusrcod = "" ;
      AV94Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel = "" ;
      AV97Pedidos_generacionaccesorios1ds_5_tfdisfec = GXutil.nullDate() ;
      AV100Pedidos_generacionaccesorios1ds_8_tfclinom = "" ;
      AV101Pedidos_generacionaccesorios1ds_9_tfclinom_sel = "" ;
      AV104Pedidos_generacionaccesorios1ds_12_tfdisartcod = "" ;
      AV105Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel = "" ;
      AV106Pedidos_generacionaccesorios1ds_14_tfdisartdsc = "" ;
      AV107Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel = "" ;
      AV108Pedidos_generacionaccesorios1ds_16_tfdiscolnom = "" ;
      AV109Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel = "" ;
      AV114Pedidos_generacionaccesorios1ds_22_tfdisnomcli = "" ;
      AV115Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel = "" ;
      AV116Pedidos_generacionaccesorios1ds_24_tfdisunimed = "" ;
      AV117Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel = "" ;
      AV120Pedidos_generacionaccesorios1ds_28_tfdispiekgm = DecimalUtil.ZERO ;
      AV121Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to = DecimalUtil.ZERO ;
      AV122Pedidos_generacionaccesorios1ds_30_tfdispiemtr = DecimalUtil.ZERO ;
      AV123Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to = DecimalUtil.ZERO ;
      AV124Pedidos_generacionaccesorios1ds_32_tfmaqcoddis = "" ;
      AV125Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel = "" ;
      AV128Pedidos_generacionaccesorios1ds_36_tfrevenid = "" ;
      AV129Pedidos_generacionaccesorios1ds_37_tfrevenid_sel = "" ;
      scmdbuf = "" ;
      lV93Pedidos_generacionaccesorios1ds_1_tfdisusrcod = "" ;
      lV100Pedidos_generacionaccesorios1ds_8_tfclinom = "" ;
      lV104Pedidos_generacionaccesorios1ds_12_tfdisartcod = "" ;
      lV106Pedidos_generacionaccesorios1ds_14_tfdisartdsc = "" ;
      lV108Pedidos_generacionaccesorios1ds_16_tfdiscolnom = "" ;
      lV114Pedidos_generacionaccesorios1ds_22_tfdisnomcli = "" ;
      lV116Pedidos_generacionaccesorios1ds_24_tfdisunimed = "" ;
      lV124Pedidos_generacionaccesorios1ds_32_tfmaqcoddis = "" ;
      lV128Pedidos_generacionaccesorios1ds_36_tfrevenid = "" ;
      H025T3_A361DisCod = new int[1] ;
      H025T3_A396EmprCod = new String[] {""} ;
      H025T3_A367DisEst = new byte[1] ;
      H025T3_A360DisCliNum = new String[] {""} ;
      H025T3_A4813DisEncCli = new String[] {""} ;
      H025T3_A12328RevenID = new String[] {""} ;
      H025T3_n12328RevenID = new boolean[] {false} ;
      H025T3_A6547DisVolMaq = new int[1] ;
      H025T3_A1122MaqCodDis = new String[] {""} ;
      H025T3_n1122MaqCodDis = new boolean[] {false} ;
      H025T3_A392DisUniMed = new String[] {""} ;
      H025T3_A1195DisNomCli = new String[] {""} ;
      H025T3_A390DisTipCol = new byte[1] ;
      H025T3_n390DisTipCol = new boolean[] {false} ;
      H025T3_A363DisColNum = new int[1] ;
      H025T3_n363DisColNum = new boolean[] {false} ;
      H025T3_A362DisColNom = new String[] {""} ;
      H025T3_n362DisColNom = new boolean[] {false} ;
      H025T3_A337DisArtDsc = new String[] {""} ;
      H025T3_A335DisArtCod = new String[] {""} ;
      H025T3_A1502DisPart = new short[1] ;
      H025T3_A279CliNom = new String[] {""} ;
      H025T3_A252CliCod = new int[1] ;
      H025T3_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      H025T3_A4348DisUsrCod = new String[] {""} ;
      H025T3_A387DisPiePie = new short[1] ;
      H025T3_n387DisPiePie = new boolean[] {false} ;
      H025T3_A365DisDes = new String[] {""} ;
      H025T5_A361DisCod = new int[1] ;
      H025T5_A396EmprCod = new String[] {""} ;
      H025T5_A367DisEst = new byte[1] ;
      H025T5_A360DisCliNum = new String[] {""} ;
      H025T5_A4813DisEncCli = new String[] {""} ;
      H025T5_A12328RevenID = new String[] {""} ;
      H025T5_n12328RevenID = new boolean[] {false} ;
      H025T5_A6547DisVolMaq = new int[1] ;
      H025T5_A1122MaqCodDis = new String[] {""} ;
      H025T5_n1122MaqCodDis = new boolean[] {false} ;
      H025T5_A392DisUniMed = new String[] {""} ;
      H025T5_A1195DisNomCli = new String[] {""} ;
      H025T5_A390DisTipCol = new byte[1] ;
      H025T5_n390DisTipCol = new boolean[] {false} ;
      H025T5_A363DisColNum = new int[1] ;
      H025T5_n363DisColNum = new boolean[] {false} ;
      H025T5_A362DisColNom = new String[] {""} ;
      H025T5_n362DisColNom = new boolean[] {false} ;
      H025T5_A337DisArtDsc = new String[] {""} ;
      H025T5_A335DisArtCod = new String[] {""} ;
      H025T5_A1502DisPart = new short[1] ;
      H025T5_A279CliNom = new String[] {""} ;
      H025T5_A252CliCod = new int[1] ;
      H025T5_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      H025T5_A4348DisUsrCod = new String[] {""} ;
      H025T5_A387DisPiePie = new short[1] ;
      H025T5_n387DisPiePie = new boolean[] {false} ;
      H025T5_A365DisDes = new String[] {""} ;
      AV72TotValueDisPiePie = "" ;
      AV70TotValueDisPieKgm = "" ;
      AV71TotValueDisPieMtr = "" ;
      hsh = "" ;
      AV7Station = "" ;
      AV6EmprNom = "" ;
      AV8UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV76WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      H025T6_A1201MacLin = new short[1] ;
      H025T6_A1202MacDisCod = new int[1] ;
      H025T6_A396EmprCod = new String[] {""} ;
      H025T6_A1199MacCod = new int[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      GXv_int8 = new int[1] ;
      AV34Session = httpContext.getWebSession();
      AV20GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV21GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char21 = "" ;
      GXv_char22 = new String[1] ;
      GXt_char19 = "" ;
      GXv_char20 = new String[1] ;
      GXt_char17 = "" ;
      GXv_char18 = new String[1] ;
      GXt_char15 = "" ;
      GXv_char16 = new String[1] ;
      GXt_char13 = "" ;
      GXv_char14 = new String[1] ;
      GXt_char11 = "" ;
      GXv_char12 = new String[1] ;
      GXt_char10 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char9 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState23 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV73TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV23HTTPRequest = httpContext.getHttpRequest();
      H025T8_A367DisEst = new byte[1] ;
      H025T8_A396EmprCod = new String[] {""} ;
      H025T8_A12328RevenID = new String[] {""} ;
      H025T8_n12328RevenID = new boolean[] {false} ;
      H025T8_A6547DisVolMaq = new int[1] ;
      H025T8_A1122MaqCodDis = new String[] {""} ;
      H025T8_n1122MaqCodDis = new boolean[] {false} ;
      H025T8_A392DisUniMed = new String[] {""} ;
      H025T8_A1195DisNomCli = new String[] {""} ;
      H025T8_A390DisTipCol = new byte[1] ;
      H025T8_n390DisTipCol = new boolean[] {false} ;
      H025T8_A363DisColNum = new int[1] ;
      H025T8_n363DisColNum = new boolean[] {false} ;
      H025T8_A362DisColNom = new String[] {""} ;
      H025T8_n362DisColNom = new boolean[] {false} ;
      H025T8_A337DisArtDsc = new String[] {""} ;
      H025T8_A335DisArtCod = new String[] {""} ;
      H025T8_A1502DisPart = new short[1] ;
      H025T8_A279CliNom = new String[] {""} ;
      H025T8_A252CliCod = new int[1] ;
      H025T8_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      H025T8_A361DisCod = new int[1] ;
      H025T8_A4348DisUsrCod = new String[] {""} ;
      H025T8_A387DisPiePie = new short[1] ;
      H025T8_n387DisPiePie = new boolean[] {false} ;
      H025T8_A365DisDes = new String[] {""} ;
      ucDvelop_confirmpanel_eliminaraccesorios = new com.genexus.webpanels.GXUserControl();
      ucDvelop_confirmpanel_crearaccesorios = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV5EmprCod = "" ;
      sCtrlAV16DisEst = "" ;
      sCtrlAV81BarNHdr = "" ;
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      X631Metros = DecimalUtil.ZERO ;
      E396EmprCod = "" ;
      H025T9_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      X384DisPieMet = DecimalUtil.ZERO ;
      H025T10_A384DisPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      X595Kilos = DecimalUtil.ZERO ;
      H025T11_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      X382DisPieKil = DecimalUtil.ZERO ;
      H025T12_A382DisPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.generacionaccesorios1__default(),
         new Object[] {
             new Object[] {
            H025T3_A361DisCod, H025T3_A396EmprCod, H025T3_A367DisEst, H025T3_A360DisCliNum, H025T3_A4813DisEncCli, H025T3_A12328RevenID, H025T3_n12328RevenID, H025T3_A6547DisVolMaq, H025T3_A1122MaqCodDis, H025T3_n1122MaqCodDis,
            H025T3_A392DisUniMed, H025T3_A1195DisNomCli, H025T3_A390DisTipCol, H025T3_n390DisTipCol, H025T3_A363DisColNum, H025T3_n363DisColNum, H025T3_A362DisColNom, H025T3_n362DisColNom, H025T3_A337DisArtDsc, H025T3_A335DisArtCod,
            H025T3_A1502DisPart, H025T3_A279CliNom, H025T3_A252CliCod, H025T3_A369DisFec, H025T3_A4348DisUsrCod, H025T3_A387DisPiePie, H025T3_n387DisPiePie, H025T3_A365DisDes
            }
            , new Object[] {
            H025T5_A361DisCod, H025T5_A396EmprCod, H025T5_A367DisEst, H025T5_A360DisCliNum, H025T5_A4813DisEncCli, H025T5_A12328RevenID, H025T5_n12328RevenID, H025T5_A6547DisVolMaq, H025T5_A1122MaqCodDis, H025T5_n1122MaqCodDis,
            H025T5_A392DisUniMed, H025T5_A1195DisNomCli, H025T5_A390DisTipCol, H025T5_n390DisTipCol, H025T5_A363DisColNum, H025T5_n363DisColNum, H025T5_A362DisColNom, H025T5_n362DisColNom, H025T5_A337DisArtDsc, H025T5_A335DisArtCod,
            H025T5_A1502DisPart, H025T5_A279CliNom, H025T5_A252CliCod, H025T5_A369DisFec, H025T5_A4348DisUsrCod, H025T5_A387DisPiePie, H025T5_n387DisPiePie, H025T5_A365DisDes
            }
            , new Object[] {
            H025T6_A1201MacLin, H025T6_A1202MacDisCod, H025T6_A396EmprCod, H025T6_A1199MacCod
            }
            , new Object[] {
            H025T8_A367DisEst, H025T8_A396EmprCod, H025T8_A12328RevenID, H025T8_n12328RevenID, H025T8_A6547DisVolMaq, H025T8_A1122MaqCodDis, H025T8_n1122MaqCodDis, H025T8_A392DisUniMed, H025T8_A1195DisNomCli, H025T8_A390DisTipCol,
            H025T8_n390DisTipCol, H025T8_A363DisColNum, H025T8_n363DisColNum, H025T8_A362DisColNom, H025T8_n362DisColNom, H025T8_A337DisArtDsc, H025T8_A335DisArtCod, H025T8_A1502DisPart, H025T8_A279CliNom, H025T8_A252CliCod,
            H025T8_A369DisFec, H025T8_A361DisCod, H025T8_A4348DisUsrCod, H025T8_A387DisPiePie, H025T8_n387DisPiePie, H025T8_A365DisDes
            }
            , new Object[] {
            H025T9_A631Metros
            }
            , new Object[] {
            H025T10_A384DisPieMet
            }
            , new Object[] {
            H025T11_A595Kilos
            }
            , new Object[] {
            H025T12_A382DisPieKil
            }
         }
      );
      AV92Pgmname = "Pedidos.GeneracionAccesorios1" ;
      /* GeneXus formulas. */
      AV92Pgmname = "Pedidos.GeneracionAccesorios1" ;
      Gx_err = (short)(0) ;
      edtavBarnhdr_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
      edtavMaccod_Enabled = 0 ;
      edtavDisenccli_Enabled = 0 ;
      edtavTotvaluedispiepie_Enabled = 0 ;
      edtavTotvaluedispiekgm_Enabled = 0 ;
      edtavTotvaluedispiemtr_Enabled = 0 ;
   }

   private byte wcpOAV16DisEst ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV16DisEst ;
   private byte AV63TFDisTipCol ;
   private byte AV64TFDisTipCol_To ;
   private byte A367DisEst ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A390DisTipCol ;
   private byte nDonePA ;
   private byte AV112Pedidos_generacionaccesorios1ds_20_tfdistipcol ;
   private byte AV113Pedidos_generacionaccesorios1ds_21_tfdistipcol_to ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV130GXLvl148 ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV55TFDisPart ;
   private short AV56TFDisPart_To ;
   private short AV61TFDisPiePie ;
   private short AV62TFDisPiePie_To ;
   private short AV78i ;
   private short AV22Hay_sel ;
   private short wbEnd ;
   private short wbStart ;
   private short A1502DisPart ;
   private short A387DisPiePie ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV102Pedidos_generacionaccesorios1ds_10_tfdispart ;
   private short AV103Pedidos_generacionaccesorios1ds_11_tfdispart_to ;
   private short AV118Pedidos_generacionaccesorios1ds_26_tfdispiepie ;
   private short AV119Pedidos_generacionaccesorios1ds_27_tfdispiepie_to ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_62 ;
   private int nGXsfl_62_idx=1 ;
   private int AV43TFDisCod ;
   private int AV44TFDisCod_To ;
   private int AV35TFCliCod ;
   private int AV36TFCliCod_To ;
   private int AV47TFDisColNum ;
   private int AV48TFDisColNum_To ;
   private int AV86TFDisVolMaq ;
   private int AV87TFDisVolMaq_To ;
   private int A1202MacDisCod ;
   private int A1199MacCod ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavBarnhdr_Enabled ;
   private int edtavPgmname_Enabled ;
   private int divUnnamedtable1_Height ;
   private int A361DisCod ;
   private int AV25MacCod ;
   private int A252CliCod ;
   private int A363DisColNum ;
   private int A6547DisVolMaq ;
   private int subGrid_Islastpage ;
   private int edtavMaccod_Enabled ;
   private int edtavDisenccli_Enabled ;
   private int edtavTotvaluedispiepie_Enabled ;
   private int edtavTotvaluedispiekgm_Enabled ;
   private int edtavTotvaluedispiemtr_Enabled ;
   private int AV95Pedidos_generacionaccesorios1ds_3_tfdiscod ;
   private int AV96Pedidos_generacionaccesorios1ds_4_tfdiscod_to ;
   private int AV98Pedidos_generacionaccesorios1ds_6_tfclicod ;
   private int AV99Pedidos_generacionaccesorios1ds_7_tfclicod_to ;
   private int AV110Pedidos_generacionaccesorios1ds_18_tfdiscolnum ;
   private int AV111Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to ;
   private int AV126Pedidos_generacionaccesorios1ds_34_tfdisvolmaq ;
   private int AV127Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to ;
   private int AV32PageToGo ;
   private int AV9CodMac ;
   private int AV79Discod ;
   private int GXv_int8[] ;
   private int AV131GXV1 ;
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
   private long GRID_nFirstRecordOnPage ;
   private long AV69TotDisPiePie ;
   private long AV18GridCurrentPage ;
   private long AV19GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV57TFDisPieKgm ;
   private java.math.BigDecimal AV58TFDisPieKgm_To ;
   private java.math.BigDecimal AV59TFDisPieMtr ;
   private java.math.BigDecimal AV60TFDisPieMtr_To ;
   private java.math.BigDecimal AV67TotDisPieKgm ;
   private java.math.BigDecimal AV68TotDisPieMtr ;
   private java.math.BigDecimal A381DisPieKgm ;
   private java.math.BigDecimal A385DisPieMtr ;
   private java.math.BigDecimal AV120Pedidos_generacionaccesorios1ds_28_tfdispiekgm ;
   private java.math.BigDecimal AV121Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to ;
   private java.math.BigDecimal AV122Pedidos_generacionaccesorios1ds_30_tfdispiemtr ;
   private java.math.BigDecimal AV123Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to ;
   private java.math.BigDecimal X631Metros ;
   private java.math.BigDecimal X384DisPieMet ;
   private java.math.BigDecimal X595Kilos ;
   private java.math.BigDecimal X382DisPieKil ;
   private String wcpOAV5EmprCod ;
   private String wcpOAV81BarNHdr ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Dvelop_confirmpanel_crearaccesorios_Result ;
   private String Dvelop_confirmpanel_eliminaraccesorios_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV5EmprCod ;
   private String AV81BarNHdr ;
   private String sGXsfl_62_idx="0001" ;
   private String AV82TFDisUsrCod ;
   private String AV83TFDisUsrCod_Sel ;
   private String AV37TFCliNom ;
   private String AV38TFCliNom_Sel ;
   private String AV39TFDisArtCod ;
   private String AV40TFDisArtCod_Sel ;
   private String AV41TFDisArtDsc ;
   private String AV42TFDisArtDsc_Sel ;
   private String AV45TFDisColNom ;
   private String AV46TFDisColNom_Sel ;
   private String AV53TFDisNomCli ;
   private String AV54TFDisNomCli_Sel ;
   private String AV65TFDisUniMed ;
   private String AV66TFDisUniMed_Sel ;
   private String AV84TFMaqCodDis ;
   private String AV85TFMaqCodDis_Sel ;
   private String AV88TFRevenID ;
   private String AV89TFRevenID_Sel ;
   private String AV92Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A4813DisEncCli ;
   private String A360DisCliNum ;
   private String A396EmprCod ;
   private String A365DisDes ;
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
   private String Ddo_grid_Includefilter ;
   private String Ddo_grid_Filtertype ;
   private String Ddo_grid_Filterisrange ;
   private String Ddo_grid_Includedatalist ;
   private String Ddo_grid_Datalisttype ;
   private String Ddo_grid_Datalistproc ;
   private String Dvelop_confirmpanel_crearaccesorios_Title ;
   private String Dvelop_confirmpanel_crearaccesorios_Confirmationtext ;
   private String Dvelop_confirmpanel_crearaccesorios_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_crearaccesorios_Nobuttoncaption ;
   private String Dvelop_confirmpanel_crearaccesorios_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_crearaccesorios_Yesbuttonposition ;
   private String Dvelop_confirmpanel_crearaccesorios_Confirmtype ;
   private String Dvelop_confirmpanel_eliminaraccesorios_Title ;
   private String Dvelop_confirmpanel_eliminaraccesorios_Confirmationtext ;
   private String Dvelop_confirmpanel_eliminaraccesorios_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_eliminaraccesorios_Nobuttoncaption ;
   private String Dvelop_confirmpanel_eliminaraccesorios_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_eliminaraccesorios_Yesbuttonposition ;
   private String Dvelop_confirmpanel_eliminaraccesorios_Confirmtype ;
   private String Grid_titlescategories_Gridinternalname ;
   private String Grid_titlescategories_Gridtitlescategories ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTableactionheader_Internalname ;
   private String grpUnnamedgroup3_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String TempTags ;
   private String bttBtncrearaccesorios_Internalname ;
   private String bttBtncrearaccesorios_Jsonclick ;
   private String bttBtneliminaraccesorios_Internalname ;
   private String bttBtneliminaraccesorios_Jsonclick ;
   private String grpUnnamedgroup5_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String bttBtngenerarhdrs_Internalname ;
   private String bttBtngenerarhdrs_Jsonclick ;
   private String divUnnamedtable6_Internalname ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String divUnnamedtable7_Internalname ;
   private String edtavBarnhdr_Internalname ;
   private String edtavBarnhdr_Jsonclick ;
   private String Barradeprogreso_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divUnnamedtable1_Internalname ;
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
   private String AV33Seleccionar ;
   private String A4348DisUsrCod ;
   private String edtDisUsrCod_Internalname ;
   private String edtDisCod_Internalname ;
   private String edtDisFec_Internalname ;
   private String edtavMaccod_Internalname ;
   private String edtCliCod_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String AV80DisEncCli ;
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
   private String A1122MaqCodDis ;
   private String edtMaqCodDis_Internalname ;
   private String edtDisVolMaq_Internalname ;
   private String A12328RevenID ;
   private String edtRevenID_Internalname ;
   private String edtavTotvaluedispiepie_Internalname ;
   private String edtavTotvaluedispiekgm_Internalname ;
   private String edtavTotvaluedispiemtr_Internalname ;
   private String AV93Pedidos_generacionaccesorios1ds_1_tfdisusrcod ;
   private String AV94Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel ;
   private String AV100Pedidos_generacionaccesorios1ds_8_tfclinom ;
   private String AV101Pedidos_generacionaccesorios1ds_9_tfclinom_sel ;
   private String AV104Pedidos_generacionaccesorios1ds_12_tfdisartcod ;
   private String AV105Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel ;
   private String AV106Pedidos_generacionaccesorios1ds_14_tfdisartdsc ;
   private String AV107Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel ;
   private String AV108Pedidos_generacionaccesorios1ds_16_tfdiscolnom ;
   private String AV109Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel ;
   private String AV114Pedidos_generacionaccesorios1ds_22_tfdisnomcli ;
   private String AV115Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel ;
   private String AV116Pedidos_generacionaccesorios1ds_24_tfdisunimed ;
   private String AV117Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel ;
   private String AV124Pedidos_generacionaccesorios1ds_32_tfmaqcoddis ;
   private String AV125Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel ;
   private String AV128Pedidos_generacionaccesorios1ds_36_tfrevenid ;
   private String AV129Pedidos_generacionaccesorios1ds_37_tfrevenid_sel ;
   private String scmdbuf ;
   private String lV93Pedidos_generacionaccesorios1ds_1_tfdisusrcod ;
   private String lV100Pedidos_generacionaccesorios1ds_8_tfclinom ;
   private String lV104Pedidos_generacionaccesorios1ds_12_tfdisartcod ;
   private String lV106Pedidos_generacionaccesorios1ds_14_tfdisartdsc ;
   private String lV108Pedidos_generacionaccesorios1ds_16_tfdiscolnom ;
   private String lV114Pedidos_generacionaccesorios1ds_22_tfdisnomcli ;
   private String lV116Pedidos_generacionaccesorios1ds_24_tfdisunimed ;
   private String lV124Pedidos_generacionaccesorios1ds_32_tfmaqcoddis ;
   private String lV128Pedidos_generacionaccesorios1ds_36_tfrevenid ;
   private String hsh ;
   private String AV7Station ;
   private String AV6EmprNom ;
   private String AV8UsurCod ;
   private String GXt_char21 ;
   private String GXv_char22[] ;
   private String GXt_char19 ;
   private String GXv_char20[] ;
   private String GXt_char17 ;
   private String GXv_char18[] ;
   private String GXt_char15 ;
   private String GXv_char16[] ;
   private String GXt_char13 ;
   private String GXv_char14[] ;
   private String GXt_char11 ;
   private String GXv_char12[] ;
   private String GXt_char10 ;
   private String GXv_char4[] ;
   private String GXt_char9 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblTabledvelop_confirmpanel_eliminaraccesorios_Internalname ;
   private String Dvelop_confirmpanel_eliminaraccesorios_Internalname ;
   private String tblTabledvelop_confirmpanel_crearaccesorios_Internalname ;
   private String Dvelop_confirmpanel_crearaccesorios_Internalname ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvaluedispiepie_Jsonclick ;
   private String edtavTotvaluedispiekgm_Jsonclick ;
   private String edtavTotvaluedispiemtr_Jsonclick ;
   private String sCtrlAV5EmprCod ;
   private String sCtrlAV16DisEst ;
   private String sCtrlAV81BarNHdr ;
   private String sGXsfl_62_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtDisUsrCod_Jsonclick ;
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
   private String edtMaqCodDis_Jsonclick ;
   private String edtDisVolMaq_Jsonclick ;
   private String edtRevenID_Jsonclick ;
   private String subGrid_Header ;
   private String E396EmprCod ;
   private java.util.Date AV51TFDisFec ;
   private java.util.Date AV13DDO_DisFecAuxDate ;
   private java.util.Date A369DisFec ;
   private java.util.Date AV97Pedidos_generacionaccesorios1ds_5_tfdisfec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
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
   private boolean n1122MaqCodDis ;
   private boolean n12328RevenID ;
   private boolean bGXsfl_62_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV72TotValueDisPiePie ;
   private String AV70TotValueDisPieKgm ;
   private String AV71TotValueDisPieMtr ;
   private GXSimpleCollection<Integer> AV77Col_Discod ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV23HTTPRequest ;
   private com.genexus.webpanels.WebSession AV34Session ;
   private com.genexus.webpanels.GXUserControl ucBarradeprogreso ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_titlescategories ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminaraccesorios ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_crearaccesorios ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkavSeleccionar ;
   private IDataStoreProvider pr_default ;
   private int[] H025T3_A361DisCod ;
   private String[] H025T3_A396EmprCod ;
   private byte[] H025T3_A367DisEst ;
   private String[] H025T3_A360DisCliNum ;
   private String[] H025T3_A4813DisEncCli ;
   private String[] H025T3_A12328RevenID ;
   private boolean[] H025T3_n12328RevenID ;
   private int[] H025T3_A6547DisVolMaq ;
   private String[] H025T3_A1122MaqCodDis ;
   private boolean[] H025T3_n1122MaqCodDis ;
   private String[] H025T3_A392DisUniMed ;
   private String[] H025T3_A1195DisNomCli ;
   private byte[] H025T3_A390DisTipCol ;
   private boolean[] H025T3_n390DisTipCol ;
   private int[] H025T3_A363DisColNum ;
   private boolean[] H025T3_n363DisColNum ;
   private String[] H025T3_A362DisColNom ;
   private boolean[] H025T3_n362DisColNom ;
   private String[] H025T3_A337DisArtDsc ;
   private String[] H025T3_A335DisArtCod ;
   private short[] H025T3_A1502DisPart ;
   private String[] H025T3_A279CliNom ;
   private int[] H025T3_A252CliCod ;
   private java.util.Date[] H025T3_A369DisFec ;
   private String[] H025T3_A4348DisUsrCod ;
   private short[] H025T3_A387DisPiePie ;
   private boolean[] H025T3_n387DisPiePie ;
   private String[] H025T3_A365DisDes ;
   private int[] H025T5_A361DisCod ;
   private String[] H025T5_A396EmprCod ;
   private byte[] H025T5_A367DisEst ;
   private String[] H025T5_A360DisCliNum ;
   private String[] H025T5_A4813DisEncCli ;
   private String[] H025T5_A12328RevenID ;
   private boolean[] H025T5_n12328RevenID ;
   private int[] H025T5_A6547DisVolMaq ;
   private String[] H025T5_A1122MaqCodDis ;
   private boolean[] H025T5_n1122MaqCodDis ;
   private String[] H025T5_A392DisUniMed ;
   private String[] H025T5_A1195DisNomCli ;
   private byte[] H025T5_A390DisTipCol ;
   private boolean[] H025T5_n390DisTipCol ;
   private int[] H025T5_A363DisColNum ;
   private boolean[] H025T5_n363DisColNum ;
   private String[] H025T5_A362DisColNom ;
   private boolean[] H025T5_n362DisColNom ;
   private String[] H025T5_A337DisArtDsc ;
   private String[] H025T5_A335DisArtCod ;
   private short[] H025T5_A1502DisPart ;
   private String[] H025T5_A279CliNom ;
   private int[] H025T5_A252CliCod ;
   private java.util.Date[] H025T5_A369DisFec ;
   private String[] H025T5_A4348DisUsrCod ;
   private short[] H025T5_A387DisPiePie ;
   private boolean[] H025T5_n387DisPiePie ;
   private String[] H025T5_A365DisDes ;
   private short[] H025T6_A1201MacLin ;
   private int[] H025T6_A1202MacDisCod ;
   private String[] H025T6_A396EmprCod ;
   private int[] H025T6_A1199MacCod ;
   private byte[] H025T8_A367DisEst ;
   private String[] H025T8_A396EmprCod ;
   private String[] H025T8_A12328RevenID ;
   private boolean[] H025T8_n12328RevenID ;
   private int[] H025T8_A6547DisVolMaq ;
   private String[] H025T8_A1122MaqCodDis ;
   private boolean[] H025T8_n1122MaqCodDis ;
   private String[] H025T8_A392DisUniMed ;
   private String[] H025T8_A1195DisNomCli ;
   private byte[] H025T8_A390DisTipCol ;
   private boolean[] H025T8_n390DisTipCol ;
   private int[] H025T8_A363DisColNum ;
   private boolean[] H025T8_n363DisColNum ;
   private String[] H025T8_A362DisColNom ;
   private boolean[] H025T8_n362DisColNom ;
   private String[] H025T8_A337DisArtDsc ;
   private String[] H025T8_A335DisArtCod ;
   private short[] H025T8_A1502DisPart ;
   private String[] H025T8_A279CliNom ;
   private int[] H025T8_A252CliCod ;
   private java.util.Date[] H025T8_A369DisFec ;
   private int[] H025T8_A361DisCod ;
   private String[] H025T8_A4348DisUsrCod ;
   private short[] H025T8_A387DisPiePie ;
   private boolean[] H025T8_n387DisPiePie ;
   private String[] H025T8_A365DisDes ;
   private java.math.BigDecimal[] H025T9_A631Metros ;
   private java.math.BigDecimal[] H025T10_A384DisPieMet ;
   private java.math.BigDecimal[] H025T11_A595Kilos ;
   private java.math.BigDecimal[] H025T12_A382DisPieKil ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV15DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV20GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState23[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV21GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV73TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV76WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

final  class generacionaccesorios1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H025T3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV94Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel ,
                                          String AV93Pedidos_generacionaccesorios1ds_1_tfdisusrcod ,
                                          int AV95Pedidos_generacionaccesorios1ds_3_tfdiscod ,
                                          int AV96Pedidos_generacionaccesorios1ds_4_tfdiscod_to ,
                                          java.util.Date AV97Pedidos_generacionaccesorios1ds_5_tfdisfec ,
                                          int AV98Pedidos_generacionaccesorios1ds_6_tfclicod ,
                                          int AV99Pedidos_generacionaccesorios1ds_7_tfclicod_to ,
                                          String AV101Pedidos_generacionaccesorios1ds_9_tfclinom_sel ,
                                          String AV100Pedidos_generacionaccesorios1ds_8_tfclinom ,
                                          short AV102Pedidos_generacionaccesorios1ds_10_tfdispart ,
                                          short AV103Pedidos_generacionaccesorios1ds_11_tfdispart_to ,
                                          String AV105Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel ,
                                          String AV104Pedidos_generacionaccesorios1ds_12_tfdisartcod ,
                                          String AV107Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel ,
                                          String AV106Pedidos_generacionaccesorios1ds_14_tfdisartdsc ,
                                          String AV109Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel ,
                                          String AV108Pedidos_generacionaccesorios1ds_16_tfdiscolnom ,
                                          int AV110Pedidos_generacionaccesorios1ds_18_tfdiscolnum ,
                                          int AV111Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to ,
                                          byte AV112Pedidos_generacionaccesorios1ds_20_tfdistipcol ,
                                          byte AV113Pedidos_generacionaccesorios1ds_21_tfdistipcol_to ,
                                          String AV115Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel ,
                                          String AV114Pedidos_generacionaccesorios1ds_22_tfdisnomcli ,
                                          String AV117Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel ,
                                          String AV116Pedidos_generacionaccesorios1ds_24_tfdisunimed ,
                                          String AV125Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel ,
                                          String AV124Pedidos_generacionaccesorios1ds_32_tfmaqcoddis ,
                                          int AV126Pedidos_generacionaccesorios1ds_34_tfdisvolmaq ,
                                          int AV127Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to ,
                                          String AV129Pedidos_generacionaccesorios1ds_37_tfrevenid_sel ,
                                          String AV128Pedidos_generacionaccesorios1ds_36_tfrevenid ,
                                          String A4348DisUsrCod ,
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
                                          String A1122MaqCodDis ,
                                          int A6547DisVolMaq ,
                                          String A12328RevenID ,
                                          short AV118Pedidos_generacionaccesorios1ds_26_tfdispiepie ,
                                          short A387DisPiePie ,
                                          short AV119Pedidos_generacionaccesorios1ds_27_tfdispiepie_to ,
                                          java.math.BigDecimal AV120Pedidos_generacionaccesorios1ds_28_tfdispiekgm ,
                                          java.math.BigDecimal A381DisPieKgm ,
                                          java.math.BigDecimal AV121Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to ,
                                          java.math.BigDecimal AV122Pedidos_generacionaccesorios1ds_30_tfdispiemtr ,
                                          java.math.BigDecimal A385DisPieMtr ,
                                          java.math.BigDecimal AV123Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to ,
                                          byte A367DisEst ,
                                          byte AV16DisEst ,
                                          String AV5EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int24 = new byte[37];
      Object[] GXv_Object25 = new Object[2];
      scmdbuf = "SELECT T1.DisCod, T1.EmprCod, T1.DisEst, T1.DisCliNum, T1.DisEncCli, T1.RevenID, T1.DisVolMaq, T1.MaqCodDis, T1.DisUniMed, T1.DisNomCli, T1.DisTipCol, T1.DisColNum," ;
      scmdbuf += " T1.DisColNom, T1.DisArtDsc, T1.DisArtCod, T1.DisPart, T3.CliNom, T1.CliCod, T1.DisFec, T1.DisUsrCod, COALESCE( T2.DisPiePie, 0) AS DisPiePie, T1.DisDes FROM ((TXPDISPOS" ;
      scmdbuf += " T1 LEFT JOIN (SELECT COUNT(*) AS DisPiePie, EmprCod, DisCod FROM TXPDISALD GROUP BY EmprCod, DisCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) INNER" ;
      scmdbuf += " JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.DisCod > 0)");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.DisPiePie, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.DisPiePie, 0) <= ?))");
      addWhere(sWhereString, "(T1.DisEst = ?)");
      if ( (GXutil.strcmp("", AV94Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel)==0) && ( ! (GXutil.strcmp("", AV93Pedidos_generacionaccesorios1ds_1_tfdisusrcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUsrCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUsrCod = ?)");
      }
      else
      {
         GXv_int24[7] = (byte)(1) ;
      }
      if ( ! (0==AV95Pedidos_generacionaccesorios1ds_3_tfdiscod) )
      {
         addWhere(sWhereString, "(T1.DisCod >= ?)");
      }
      else
      {
         GXv_int24[8] = (byte)(1) ;
      }
      if ( ! (0==AV96Pedidos_generacionaccesorios1ds_4_tfdiscod_to) )
      {
         addWhere(sWhereString, "(T1.DisCod <= ?)");
      }
      else
      {
         GXv_int24[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV97Pedidos_generacionaccesorios1ds_5_tfdisfec)) )
      {
         addWhere(sWhereString, "(T1.DisFec >= ?)");
      }
      else
      {
         GXv_int24[10] = (byte)(1) ;
      }
      if ( ! (0==AV98Pedidos_generacionaccesorios1ds_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int24[11] = (byte)(1) ;
      }
      if ( ! (0==AV99Pedidos_generacionaccesorios1ds_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int24[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Pedidos_generacionaccesorios1ds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV100Pedidos_generacionaccesorios1ds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Pedidos_generacionaccesorios1ds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int24[14] = (byte)(1) ;
      }
      if ( ! (0==AV102Pedidos_generacionaccesorios1ds_10_tfdispart) )
      {
         addWhere(sWhereString, "(T1.DisPart >= ?)");
      }
      else
      {
         GXv_int24[15] = (byte)(1) ;
      }
      if ( ! (0==AV103Pedidos_generacionaccesorios1ds_11_tfdispart_to) )
      {
         addWhere(sWhereString, "(T1.DisPart <= ?)");
      }
      else
      {
         GXv_int24[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV104Pedidos_generacionaccesorios1ds_12_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int24[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV106Pedidos_generacionaccesorios1ds_14_tfdisartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc = ?)");
      }
      else
      {
         GXv_int24[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel)==0) && ( ! (GXutil.strcmp("", AV108Pedidos_generacionaccesorios1ds_16_tfdiscolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom = ?)");
      }
      else
      {
         GXv_int24[22] = (byte)(1) ;
      }
      if ( ! (0==AV110Pedidos_generacionaccesorios1ds_18_tfdiscolnum) )
      {
         addWhere(sWhereString, "(T1.DisColNum >= ?)");
      }
      else
      {
         GXv_int24[23] = (byte)(1) ;
      }
      if ( ! (0==AV111Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to) )
      {
         addWhere(sWhereString, "(T1.DisColNum <= ?)");
      }
      else
      {
         GXv_int24[24] = (byte)(1) ;
      }
      if ( ! (0==AV112Pedidos_generacionaccesorios1ds_20_tfdistipcol) )
      {
         addWhere(sWhereString, "(T1.DisTipCol >= ?)");
      }
      else
      {
         GXv_int24[25] = (byte)(1) ;
      }
      if ( ! (0==AV113Pedidos_generacionaccesorios1ds_21_tfdistipcol_to) )
      {
         addWhere(sWhereString, "(T1.DisTipCol <= ?)");
      }
      else
      {
         GXv_int24[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV114Pedidos_generacionaccesorios1ds_22_tfdisnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisNomCli = ?)");
      }
      else
      {
         GXv_int24[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel)==0) && ( ! (GXutil.strcmp("", AV116Pedidos_generacionaccesorios1ds_24_tfdisunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUniMed = ?)");
      }
      else
      {
         GXv_int24[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel)==0) && ( ! (GXutil.strcmp("", AV124Pedidos_generacionaccesorios1ds_32_tfmaqcoddis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodDis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodDis = ?)");
      }
      else
      {
         GXv_int24[32] = (byte)(1) ;
      }
      if ( ! (0==AV126Pedidos_generacionaccesorios1ds_34_tfdisvolmaq) )
      {
         addWhere(sWhereString, "(T1.DisVolMaq >= ?)");
      }
      else
      {
         GXv_int24[33] = (byte)(1) ;
      }
      if ( ! (0==AV127Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to) )
      {
         addWhere(sWhereString, "(T1.DisVolMaq <= ?)");
      }
      else
      {
         GXv_int24[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Pedidos_generacionaccesorios1ds_37_tfrevenid_sel)==0) && ( ! (GXutil.strcmp("", AV128Pedidos_generacionaccesorios1ds_36_tfrevenid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RevenID) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Pedidos_generacionaccesorios1ds_37_tfrevenid_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RevenID = ?)");
      }
      else
      {
         GXv_int24[36] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.DisCod" ;
      GXv_Object25[0] = scmdbuf ;
      GXv_Object25[1] = GXv_int24 ;
      return GXv_Object25 ;
   }

   protected Object[] conditional_H025T5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV94Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel ,
                                          String AV93Pedidos_generacionaccesorios1ds_1_tfdisusrcod ,
                                          int AV95Pedidos_generacionaccesorios1ds_3_tfdiscod ,
                                          int AV96Pedidos_generacionaccesorios1ds_4_tfdiscod_to ,
                                          java.util.Date AV97Pedidos_generacionaccesorios1ds_5_tfdisfec ,
                                          int AV98Pedidos_generacionaccesorios1ds_6_tfclicod ,
                                          int AV99Pedidos_generacionaccesorios1ds_7_tfclicod_to ,
                                          String AV101Pedidos_generacionaccesorios1ds_9_tfclinom_sel ,
                                          String AV100Pedidos_generacionaccesorios1ds_8_tfclinom ,
                                          short AV102Pedidos_generacionaccesorios1ds_10_tfdispart ,
                                          short AV103Pedidos_generacionaccesorios1ds_11_tfdispart_to ,
                                          String AV105Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel ,
                                          String AV104Pedidos_generacionaccesorios1ds_12_tfdisartcod ,
                                          String AV107Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel ,
                                          String AV106Pedidos_generacionaccesorios1ds_14_tfdisartdsc ,
                                          String AV109Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel ,
                                          String AV108Pedidos_generacionaccesorios1ds_16_tfdiscolnom ,
                                          int AV110Pedidos_generacionaccesorios1ds_18_tfdiscolnum ,
                                          int AV111Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to ,
                                          byte AV112Pedidos_generacionaccesorios1ds_20_tfdistipcol ,
                                          byte AV113Pedidos_generacionaccesorios1ds_21_tfdistipcol_to ,
                                          String AV115Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel ,
                                          String AV114Pedidos_generacionaccesorios1ds_22_tfdisnomcli ,
                                          String AV117Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel ,
                                          String AV116Pedidos_generacionaccesorios1ds_24_tfdisunimed ,
                                          String AV125Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel ,
                                          String AV124Pedidos_generacionaccesorios1ds_32_tfmaqcoddis ,
                                          int AV126Pedidos_generacionaccesorios1ds_34_tfdisvolmaq ,
                                          int AV127Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to ,
                                          String AV129Pedidos_generacionaccesorios1ds_37_tfrevenid_sel ,
                                          String AV128Pedidos_generacionaccesorios1ds_36_tfrevenid ,
                                          String A4348DisUsrCod ,
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
                                          String A1122MaqCodDis ,
                                          int A6547DisVolMaq ,
                                          String A12328RevenID ,
                                          short AV118Pedidos_generacionaccesorios1ds_26_tfdispiepie ,
                                          short A387DisPiePie ,
                                          short AV119Pedidos_generacionaccesorios1ds_27_tfdispiepie_to ,
                                          java.math.BigDecimal AV120Pedidos_generacionaccesorios1ds_28_tfdispiekgm ,
                                          java.math.BigDecimal A381DisPieKgm ,
                                          java.math.BigDecimal AV121Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to ,
                                          java.math.BigDecimal AV122Pedidos_generacionaccesorios1ds_30_tfdispiemtr ,
                                          java.math.BigDecimal A385DisPieMtr ,
                                          java.math.BigDecimal AV123Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to ,
                                          byte A367DisEst ,
                                          byte AV16DisEst ,
                                          String AV5EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int26 = new byte[37];
      Object[] GXv_Object27 = new Object[2];
      scmdbuf = "SELECT T1.DisCod, T1.EmprCod, T1.DisEst, T1.DisCliNum, T1.DisEncCli, T1.RevenID, T1.DisVolMaq, T1.MaqCodDis, T1.DisUniMed, T1.DisNomCli, T1.DisTipCol, T1.DisColNum," ;
      scmdbuf += " T1.DisColNom, T1.DisArtDsc, T1.DisArtCod, T1.DisPart, T3.CliNom, T1.CliCod, T1.DisFec, T1.DisUsrCod, COALESCE( T2.DisPiePie, 0) AS DisPiePie, T1.DisDes FROM ((TXPDISPOS" ;
      scmdbuf += " T1 LEFT JOIN (SELECT COUNT(*) AS DisPiePie, EmprCod, DisCod FROM TXPDISALD GROUP BY EmprCod, DisCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) INNER" ;
      scmdbuf += " JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.DisCod > 0)");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.DisPiePie, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.DisPiePie, 0) <= ?))");
      addWhere(sWhereString, "(T1.DisEst = ?)");
      if ( (GXutil.strcmp("", AV94Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel)==0) && ( ! (GXutil.strcmp("", AV93Pedidos_generacionaccesorios1ds_1_tfdisusrcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUsrCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUsrCod = ?)");
      }
      else
      {
         GXv_int26[7] = (byte)(1) ;
      }
      if ( ! (0==AV95Pedidos_generacionaccesorios1ds_3_tfdiscod) )
      {
         addWhere(sWhereString, "(T1.DisCod >= ?)");
      }
      else
      {
         GXv_int26[8] = (byte)(1) ;
      }
      if ( ! (0==AV96Pedidos_generacionaccesorios1ds_4_tfdiscod_to) )
      {
         addWhere(sWhereString, "(T1.DisCod <= ?)");
      }
      else
      {
         GXv_int26[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV97Pedidos_generacionaccesorios1ds_5_tfdisfec)) )
      {
         addWhere(sWhereString, "(T1.DisFec >= ?)");
      }
      else
      {
         GXv_int26[10] = (byte)(1) ;
      }
      if ( ! (0==AV98Pedidos_generacionaccesorios1ds_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int26[11] = (byte)(1) ;
      }
      if ( ! (0==AV99Pedidos_generacionaccesorios1ds_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int26[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Pedidos_generacionaccesorios1ds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV100Pedidos_generacionaccesorios1ds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Pedidos_generacionaccesorios1ds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int26[14] = (byte)(1) ;
      }
      if ( ! (0==AV102Pedidos_generacionaccesorios1ds_10_tfdispart) )
      {
         addWhere(sWhereString, "(T1.DisPart >= ?)");
      }
      else
      {
         GXv_int26[15] = (byte)(1) ;
      }
      if ( ! (0==AV103Pedidos_generacionaccesorios1ds_11_tfdispart_to) )
      {
         addWhere(sWhereString, "(T1.DisPart <= ?)");
      }
      else
      {
         GXv_int26[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV104Pedidos_generacionaccesorios1ds_12_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int26[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV106Pedidos_generacionaccesorios1ds_14_tfdisartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc = ?)");
      }
      else
      {
         GXv_int26[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel)==0) && ( ! (GXutil.strcmp("", AV108Pedidos_generacionaccesorios1ds_16_tfdiscolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom = ?)");
      }
      else
      {
         GXv_int26[22] = (byte)(1) ;
      }
      if ( ! (0==AV110Pedidos_generacionaccesorios1ds_18_tfdiscolnum) )
      {
         addWhere(sWhereString, "(T1.DisColNum >= ?)");
      }
      else
      {
         GXv_int26[23] = (byte)(1) ;
      }
      if ( ! (0==AV111Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to) )
      {
         addWhere(sWhereString, "(T1.DisColNum <= ?)");
      }
      else
      {
         GXv_int26[24] = (byte)(1) ;
      }
      if ( ! (0==AV112Pedidos_generacionaccesorios1ds_20_tfdistipcol) )
      {
         addWhere(sWhereString, "(T1.DisTipCol >= ?)");
      }
      else
      {
         GXv_int26[25] = (byte)(1) ;
      }
      if ( ! (0==AV113Pedidos_generacionaccesorios1ds_21_tfdistipcol_to) )
      {
         addWhere(sWhereString, "(T1.DisTipCol <= ?)");
      }
      else
      {
         GXv_int26[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV114Pedidos_generacionaccesorios1ds_22_tfdisnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisNomCli = ?)");
      }
      else
      {
         GXv_int26[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel)==0) && ( ! (GXutil.strcmp("", AV116Pedidos_generacionaccesorios1ds_24_tfdisunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUniMed = ?)");
      }
      else
      {
         GXv_int26[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel)==0) && ( ! (GXutil.strcmp("", AV124Pedidos_generacionaccesorios1ds_32_tfmaqcoddis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodDis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodDis = ?)");
      }
      else
      {
         GXv_int26[32] = (byte)(1) ;
      }
      if ( ! (0==AV126Pedidos_generacionaccesorios1ds_34_tfdisvolmaq) )
      {
         addWhere(sWhereString, "(T1.DisVolMaq >= ?)");
      }
      else
      {
         GXv_int26[33] = (byte)(1) ;
      }
      if ( ! (0==AV127Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to) )
      {
         addWhere(sWhereString, "(T1.DisVolMaq <= ?)");
      }
      else
      {
         GXv_int26[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Pedidos_generacionaccesorios1ds_37_tfrevenid_sel)==0) && ( ! (GXutil.strcmp("", AV128Pedidos_generacionaccesorios1ds_36_tfrevenid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RevenID) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Pedidos_generacionaccesorios1ds_37_tfrevenid_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RevenID = ?)");
      }
      else
      {
         GXv_int26[36] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.DisCod" ;
      GXv_Object27[0] = scmdbuf ;
      GXv_Object27[1] = GXv_int26 ;
      return GXv_Object27 ;
   }

   protected Object[] conditional_H025T8( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV94Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel ,
                                          String AV93Pedidos_generacionaccesorios1ds_1_tfdisusrcod ,
                                          int AV95Pedidos_generacionaccesorios1ds_3_tfdiscod ,
                                          int AV96Pedidos_generacionaccesorios1ds_4_tfdiscod_to ,
                                          java.util.Date AV97Pedidos_generacionaccesorios1ds_5_tfdisfec ,
                                          int AV98Pedidos_generacionaccesorios1ds_6_tfclicod ,
                                          int AV99Pedidos_generacionaccesorios1ds_7_tfclicod_to ,
                                          String AV101Pedidos_generacionaccesorios1ds_9_tfclinom_sel ,
                                          String AV100Pedidos_generacionaccesorios1ds_8_tfclinom ,
                                          short AV102Pedidos_generacionaccesorios1ds_10_tfdispart ,
                                          short AV103Pedidos_generacionaccesorios1ds_11_tfdispart_to ,
                                          String AV105Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel ,
                                          String AV104Pedidos_generacionaccesorios1ds_12_tfdisartcod ,
                                          String AV107Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel ,
                                          String AV106Pedidos_generacionaccesorios1ds_14_tfdisartdsc ,
                                          String AV109Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel ,
                                          String AV108Pedidos_generacionaccesorios1ds_16_tfdiscolnom ,
                                          int AV110Pedidos_generacionaccesorios1ds_18_tfdiscolnum ,
                                          int AV111Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to ,
                                          byte AV112Pedidos_generacionaccesorios1ds_20_tfdistipcol ,
                                          byte AV113Pedidos_generacionaccesorios1ds_21_tfdistipcol_to ,
                                          String AV115Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel ,
                                          String AV114Pedidos_generacionaccesorios1ds_22_tfdisnomcli ,
                                          String AV117Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel ,
                                          String AV116Pedidos_generacionaccesorios1ds_24_tfdisunimed ,
                                          String AV125Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel ,
                                          String AV124Pedidos_generacionaccesorios1ds_32_tfmaqcoddis ,
                                          int AV126Pedidos_generacionaccesorios1ds_34_tfdisvolmaq ,
                                          int AV127Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to ,
                                          String AV129Pedidos_generacionaccesorios1ds_37_tfrevenid_sel ,
                                          String AV128Pedidos_generacionaccesorios1ds_36_tfrevenid ,
                                          String A4348DisUsrCod ,
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
                                          String A1122MaqCodDis ,
                                          int A6547DisVolMaq ,
                                          String A12328RevenID ,
                                          short AV118Pedidos_generacionaccesorios1ds_26_tfdispiepie ,
                                          short A387DisPiePie ,
                                          short AV119Pedidos_generacionaccesorios1ds_27_tfdispiepie_to ,
                                          java.math.BigDecimal AV120Pedidos_generacionaccesorios1ds_28_tfdispiekgm ,
                                          java.math.BigDecimal A381DisPieKgm ,
                                          java.math.BigDecimal AV121Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to ,
                                          java.math.BigDecimal AV122Pedidos_generacionaccesorios1ds_30_tfdispiemtr ,
                                          java.math.BigDecimal A385DisPieMtr ,
                                          java.math.BigDecimal AV123Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to ,
                                          String AV5EmprCod ,
                                          byte AV16DisEst ,
                                          String A396EmprCod ,
                                          byte A367DisEst )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int28 = new byte[37];
      Object[] GXv_Object29 = new Object[2];
      scmdbuf = "SELECT T1.DisEst, T1.EmprCod, T1.RevenID, T1.DisVolMaq, T1.MaqCodDis, T1.DisUniMed, T1.DisNomCli, T1.DisTipCol, T1.DisColNum, T1.DisColNom, T1.DisArtDsc, T1.DisArtCod," ;
      scmdbuf += " T1.DisPart, T2.CliNom, T1.CliCod, T1.DisFec, T1.DisCod, T1.DisUsrCod, COALESCE( T3.DisPiePie, 0) AS DisPiePie, T1.DisDes FROM ((TXPDISPOS T1 INNER JOIN TXPCLIENT" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT COUNT(*) AS DisPiePie, EmprCod, DisCod FROM TXPDISALD GROUP BY EmprCod, DisCod ) T3 ON" ;
      scmdbuf += " T3.EmprCod = T1.EmprCod AND T3.DisCod = T1.DisCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.DisEst = ?)");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.DisPiePie, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.DisPiePie, 0) <= ?))");
      addWhere(sWhereString, "(T1.DisCod > 0)");
      if ( (GXutil.strcmp("", AV94Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel)==0) && ( ! (GXutil.strcmp("", AV93Pedidos_generacionaccesorios1ds_1_tfdisusrcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUsrCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUsrCod = ?)");
      }
      else
      {
         GXv_int28[7] = (byte)(1) ;
      }
      if ( ! (0==AV95Pedidos_generacionaccesorios1ds_3_tfdiscod) )
      {
         addWhere(sWhereString, "(T1.DisCod >= ?)");
      }
      else
      {
         GXv_int28[8] = (byte)(1) ;
      }
      if ( ! (0==AV96Pedidos_generacionaccesorios1ds_4_tfdiscod_to) )
      {
         addWhere(sWhereString, "(T1.DisCod <= ?)");
      }
      else
      {
         GXv_int28[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV97Pedidos_generacionaccesorios1ds_5_tfdisfec)) )
      {
         addWhere(sWhereString, "(T1.DisFec >= ?)");
      }
      else
      {
         GXv_int28[10] = (byte)(1) ;
      }
      if ( ! (0==AV98Pedidos_generacionaccesorios1ds_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int28[11] = (byte)(1) ;
      }
      if ( ! (0==AV99Pedidos_generacionaccesorios1ds_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int28[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Pedidos_generacionaccesorios1ds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV100Pedidos_generacionaccesorios1ds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Pedidos_generacionaccesorios1ds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int28[14] = (byte)(1) ;
      }
      if ( ! (0==AV102Pedidos_generacionaccesorios1ds_10_tfdispart) )
      {
         addWhere(sWhereString, "(T1.DisPart >= ?)");
      }
      else
      {
         GXv_int28[15] = (byte)(1) ;
      }
      if ( ! (0==AV103Pedidos_generacionaccesorios1ds_11_tfdispart_to) )
      {
         addWhere(sWhereString, "(T1.DisPart <= ?)");
      }
      else
      {
         GXv_int28[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV104Pedidos_generacionaccesorios1ds_12_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int28[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV106Pedidos_generacionaccesorios1ds_14_tfdisartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc = ?)");
      }
      else
      {
         GXv_int28[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel)==0) && ( ! (GXutil.strcmp("", AV108Pedidos_generacionaccesorios1ds_16_tfdiscolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom = ?)");
      }
      else
      {
         GXv_int28[22] = (byte)(1) ;
      }
      if ( ! (0==AV110Pedidos_generacionaccesorios1ds_18_tfdiscolnum) )
      {
         addWhere(sWhereString, "(T1.DisColNum >= ?)");
      }
      else
      {
         GXv_int28[23] = (byte)(1) ;
      }
      if ( ! (0==AV111Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to) )
      {
         addWhere(sWhereString, "(T1.DisColNum <= ?)");
      }
      else
      {
         GXv_int28[24] = (byte)(1) ;
      }
      if ( ! (0==AV112Pedidos_generacionaccesorios1ds_20_tfdistipcol) )
      {
         addWhere(sWhereString, "(T1.DisTipCol >= ?)");
      }
      else
      {
         GXv_int28[25] = (byte)(1) ;
      }
      if ( ! (0==AV113Pedidos_generacionaccesorios1ds_21_tfdistipcol_to) )
      {
         addWhere(sWhereString, "(T1.DisTipCol <= ?)");
      }
      else
      {
         GXv_int28[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV114Pedidos_generacionaccesorios1ds_22_tfdisnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisNomCli = ?)");
      }
      else
      {
         GXv_int28[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel)==0) && ( ! (GXutil.strcmp("", AV116Pedidos_generacionaccesorios1ds_24_tfdisunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUniMed = ?)");
      }
      else
      {
         GXv_int28[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel)==0) && ( ! (GXutil.strcmp("", AV124Pedidos_generacionaccesorios1ds_32_tfmaqcoddis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodDis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodDis = ?)");
      }
      else
      {
         GXv_int28[32] = (byte)(1) ;
      }
      if ( ! (0==AV126Pedidos_generacionaccesorios1ds_34_tfdisvolmaq) )
      {
         addWhere(sWhereString, "(T1.DisVolMaq >= ?)");
      }
      else
      {
         GXv_int28[33] = (byte)(1) ;
      }
      if ( ! (0==AV127Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to) )
      {
         addWhere(sWhereString, "(T1.DisVolMaq <= ?)");
      }
      else
      {
         GXv_int28[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Pedidos_generacionaccesorios1ds_37_tfrevenid_sel)==0) && ( ! (GXutil.strcmp("", AV128Pedidos_generacionaccesorios1ds_36_tfrevenid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RevenID) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Pedidos_generacionaccesorios1ds_37_tfrevenid_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RevenID = ?)");
      }
      else
      {
         GXv_int28[36] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.DisEst" ;
      GXv_Object29[0] = scmdbuf ;
      GXv_Object29[1] = GXv_int28 ;
      return GXv_Object29 ;
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
                  return conditional_H025T3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (java.util.Date)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , ((Number) dynConstraints[47]).shortValue() , ((Number) dynConstraints[48]).shortValue() , ((Number) dynConstraints[49]).shortValue() , (java.math.BigDecimal)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , (java.math.BigDecimal)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] , (java.math.BigDecimal)dynConstraints[55] , ((Number) dynConstraints[56]).byteValue() , ((Number) dynConstraints[57]).byteValue() , (String)dynConstraints[58] , (String)dynConstraints[59] );
            case 1 :
                  return conditional_H025T5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (java.util.Date)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , ((Number) dynConstraints[47]).shortValue() , ((Number) dynConstraints[48]).shortValue() , ((Number) dynConstraints[49]).shortValue() , (java.math.BigDecimal)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , (java.math.BigDecimal)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] , (java.math.BigDecimal)dynConstraints[55] , ((Number) dynConstraints[56]).byteValue() , ((Number) dynConstraints[57]).byteValue() , (String)dynConstraints[58] , (String)dynConstraints[59] );
            case 3 :
                  return conditional_H025T8(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (java.util.Date)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , ((Number) dynConstraints[47]).shortValue() , ((Number) dynConstraints[48]).shortValue() , ((Number) dynConstraints[49]).shortValue() , (java.math.BigDecimal)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , (java.math.BigDecimal)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] , (java.math.BigDecimal)dynConstraints[55] , (String)dynConstraints[56] , ((Number) dynConstraints[57]).byteValue() , (String)dynConstraints[58] , ((Number) dynConstraints[59]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H025T3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H025T5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H025T6", "SELECT MacLin, MacDisCod, EmprCod, MacCod FROM TXPLMACRO WHERE EmprCod = ? and MacDisCod = ? ORDER BY EmprCod, MacDisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H025T8", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H025T9", "SELECT SUM(Metros) AS GXC2 FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H025T10", "SELECT SUM(DisPieMet) AS GXC1 FROM TXPDISALD WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H025T11", "SELECT SUM(Kilos) AS GXC5 FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H025T12", "SELECT SUM(DisPieKil) AS GXC4 FROM TXPDISALD WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               ((String[]) buf[11])[0] = rslt.getString(10, 13);
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(12);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(13, 13);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(14, 26);
               ((String[]) buf[19])[0] = rslt.getString(15, 16);
               ((short[]) buf[20])[0] = rslt.getShort(16);
               ((String[]) buf[21])[0] = rslt.getString(17, 30);
               ((int[]) buf[22])[0] = rslt.getInt(18);
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDate(19);
               ((String[]) buf[24])[0] = rslt.getString(20, 8);
               ((short[]) buf[25])[0] = rslt.getShort(21);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(22, 1);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               ((String[]) buf[11])[0] = rslt.getString(10, 13);
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(12);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(13, 13);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(14, 26);
               ((String[]) buf[19])[0] = rslt.getString(15, 16);
               ((short[]) buf[20])[0] = rslt.getShort(16);
               ((String[]) buf[21])[0] = rslt.getString(17, 30);
               ((int[]) buf[22])[0] = rslt.getInt(18);
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDate(19);
               ((String[]) buf[24])[0] = rslt.getString(20, 8);
               ((short[]) buf[25])[0] = rslt.getShort(21);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(22, 1);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((String[]) buf[8])[0] = rslt.getString(7, 13);
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 26);
               ((String[]) buf[16])[0] = rslt.getString(12, 16);
               ((short[]) buf[17])[0] = rslt.getShort(13);
               ((String[]) buf[18])[0] = rslt.getString(14, 30);
               ((int[]) buf[19])[0] = rslt.getInt(15);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(16);
               ((int[]) buf[21])[0] = rslt.getInt(17);
               ((String[]) buf[22])[0] = rslt.getString(18, 8);
               ((short[]) buf[23])[0] = rslt.getShort(19);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(20, 1);
               return;
            case 4 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 5 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 6 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 7 :
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
                  stmt.setString(sIdx, (String)parms[37], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[38]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[39]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[62]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[63]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 6);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 6);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 10);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 10);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[38]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[39]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[62]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[63]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 6);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 6);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 10);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 10);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[39]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[42]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[62]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[63]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 6);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 6);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 10);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 10);
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

