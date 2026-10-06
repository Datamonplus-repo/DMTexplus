package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcfaseshdr_impl extends GXWebComponent
{
   public wcfaseshdr_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wcfaseshdr_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcfaseshdr_impl.class ));
   }

   public wcfaseshdr_impl( int remoteHandle ,
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
      cmbBarFasEst = new HTMLChoice();
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( GXutil.len( sPrefix) == 0 )
      {
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
               AV63Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63Emprcod", AV63Emprcod);
               AV64Barcod = (int)(GXutil.lval( httpContext.GetPar( "Barcod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64Barcod), 8, 0));
               AV65Barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Barcodreo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65Barcodreo", GXutil.str( AV65Barcodreo, 1, 0));
               AV66Barcodpar = httpContext.GetPar( "Barcodpar") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66Barcodpar", AV66Barcodpar);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV63Emprcod,Integer.valueOf(AV64Barcod),Byte.valueOf(AV65Barcodreo),AV66Barcodpar});
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
      nRC_GXsfl_35 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_35"))) ;
      nGXsfl_35_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_35_idx"))) ;
      sGXsfl_35_idx = httpContext.GetPar( "sGXsfl_35_idx") ;
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
      AV67FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV63Emprcod = httpContext.GetPar( "Emprcod") ;
      AV64Barcod = (int)(GXutil.lval( httpContext.GetPar( "Barcod"))) ;
      AV65Barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Barcodreo"))) ;
      AV66Barcodpar = httpContext.GetPar( "Barcodpar") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV21ColumnsSelector);
      AV25TFBarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "TFBarOrdLin"))) ;
      AV26TFBarOrdLin_To = (short)(GXutil.lval( httpContext.GetPar( "TFBarOrdLin_To"))) ;
      AV28TFFasCod = httpContext.GetPar( "TFFasCod") ;
      AV29TFFasCod_Sel = httpContext.GetPar( "TFFasCod_Sel") ;
      AV31TFFasDsc = httpContext.GetPar( "TFFasDsc") ;
      AV32TFFasDsc_Sel = httpContext.GetPar( "TFFasDsc_Sel") ;
      AV34TFMaqCodBis = httpContext.GetPar( "TFMaqCodBis") ;
      AV35TFMaqCodBis_Sel = httpContext.GetPar( "TFMaqCodBis_Sel") ;
      AV37TFBarFasDTI = localUtil.parseDTimeParm( httpContext.GetPar( "TFBarFasDTI")) ;
      AV42TFBarFasDTF = localUtil.parseDTimeParm( httpContext.GetPar( "TFBarFasDTF")) ;
      AV47TFBarTieRea = CommonUtil.decimalVal( httpContext.GetPar( "TFBarTieRea"), ".") ;
      AV48TFBarTieRea_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarTieRea_To"), ".") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV51TFBarFasEst_Sels);
      AV53TFBarFasKgm = CommonUtil.decimalVal( httpContext.GetPar( "TFBarFasKgm"), ".") ;
      AV54TFBarFasKgm_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarFasKgm_To"), ".") ;
      AV56TFBarFasMtr = CommonUtil.decimalVal( httpContext.GetPar( "TFBarFasMtr"), ".") ;
      AV57TFBarFasMtr_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarFasMtr_To"), ".") ;
      AV96Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      A603MaqCodBis = httpContext.GetPar( "MaqCodBis") ;
      A6173BarFasSec = httpContext.GetPar( "BarFasSec") ;
      A194BarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLin"))) ;
      AV74Wcfaseshdrds_1_emprcod = httpContext.GetPar( "Wcfaseshdrds_1_emprcod") ;
      AV75Wcfaseshdrds_2_barcod = (int)(GXutil.lval( httpContext.GetPar( "Wcfaseshdrds_2_barcod"))) ;
      AV76Wcfaseshdrds_3_barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Wcfaseshdrds_3_barcodreo"))) ;
      AV77Wcfaseshdrds_4_barcodpar = httpContext.GetPar( "Wcfaseshdrds_4_barcodpar") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV67FilterFullText, AV63Emprcod, AV64Barcod, AV65Barcodreo, AV66Barcodpar, AV21ColumnsSelector, AV25TFBarOrdLin, AV26TFBarOrdLin_To, AV28TFFasCod, AV29TFFasCod_Sel, AV31TFFasDsc, AV32TFFasDsc_Sel, AV34TFMaqCodBis, AV35TFMaqCodBis_Sel, AV37TFBarFasDTI, AV42TFBarFasDTF, AV47TFBarTieRea, AV48TFBarTieRea_To, AV51TFBarFasEst_Sels, AV53TFBarFasKgm, AV54TFBarFasKgm_To, AV56TFBarFasMtr, AV57TFBarFasMtr_To, AV96Pgmname, AV12OrderedBy, AV13OrderedDsc, A603MaqCodBis, A6173BarFasSec, A194BarOrdLin, AV74Wcfaseshdrds_1_emprcod, AV75Wcfaseshdrds_2_barcod, AV76Wcfaseshdrds_3_barcodreo, AV77Wcfaseshdrds_4_barcodpar, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         paIW2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Fases Hdr", "")) ;
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
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManager.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/json2005.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/rsh.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManagerCreate.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wcfaseshdr", new String[] {GXutil.URLEncode(GXutil.rtrim(AV63Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV64Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV65Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV66Barcodpar))}, new String[] {"Emprcod","Barcod","Barcodreo","Barcodpar"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV96Pgmname, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"WCFasesHdr");
      forbiddenHiddens.add("EmprCod", GXutil.rtrim( localUtil.format( A396EmprCod, "@!")));
      forbiddenHiddens.add("BarCod", localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"));
      forbiddenHiddens.add("BarCodReo", localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"));
      forbiddenHiddens.add("BarCodPar", GXutil.rtrim( localUtil.format( A130BarCodPar, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("wcfaseshdr:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vFILTERFULLTEXT", AV67FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_35", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_35, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV61GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV62GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV59DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV59DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV21ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV21ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV63Emprcod", GXutil.rtrim( wcpOAV63Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV64Barcod", GXutil.ltrim( localUtil.ntoc( wcpOAV64Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV65Barcodreo", GXutil.ltrim( localUtil.ntoc( wcpOAV65Barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV66Barcodpar", GXutil.rtrim( wcpOAV66Barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV63Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOD", GXutil.ltrim( localUtil.ntoc( AV64Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV65Barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODPAR", GXutil.rtrim( AV66Barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARORDLIN", GXutil.ltrim( localUtil.ntoc( AV25TFBarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARORDLIN_TO", GXutil.ltrim( localUtil.ntoc( AV26TFBarOrdLin_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASCOD", GXutil.rtrim( AV28TFFasCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASCOD_SEL", GXutil.rtrim( AV29TFFasCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASDSC", GXutil.rtrim( AV31TFFasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASDSC_SEL", GXutil.rtrim( AV32TFFasDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMAQCODBIS", GXutil.rtrim( AV34TFMaqCodBis));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMAQCODBIS_SEL", GXutil.rtrim( AV35TFMaqCodBis_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFASDTI", localUtil.ttoc( AV37TFBarFasDTI, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFASDTF", localUtil.ttoc( AV42TFBarFasDTF, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARTIEREA", GXutil.ltrim( localUtil.ntoc( AV47TFBarTieRea, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARTIEREA_TO", GXutil.ltrim( localUtil.ntoc( AV48TFBarTieRea_To, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vTFBARFASEST_SELS", AV51TFBarFasEst_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vTFBARFASEST_SELS", AV51TFBarFasEst_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFASKGM", GXutil.ltrim( localUtil.ntoc( AV53TFBarFasKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFASKGM_TO", GXutil.ltrim( localUtil.ntoc( AV54TFBarFasKgm_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFASMTR", GXutil.ltrim( localUtil.ntoc( AV56TFBarFasMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFASMTR_TO", GXutil.ltrim( localUtil.ntoc( AV57TFBarFasMtr_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV96Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV96Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARFASSEC", GXutil.rtrim( A6173BarFasSec));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARESTREO", GXutil.ltrim( localUtil.ntoc( A148BarEstReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARREOCOD", GXutil.ltrim( localUtil.ntoc( A934BarReoCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARREOREO", GXutil.ltrim( localUtil.ntoc( A936BarReoReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARREOPAR", GXutil.rtrim( A935BarReoPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vWCFASESHDRDS_1_EMPRCOD", GXutil.rtrim( AV74Wcfaseshdrds_1_emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vWCFASESHDRDS_2_BARCOD", GXutil.ltrim( localUtil.ntoc( AV75Wcfaseshdrds_2_barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vWCFASESHDRDS_3_BARCODREO", GXutil.ltrim( localUtil.ntoc( AV76Wcfaseshdrds_3_barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vWCFASESHDRDS_4_BARCODPAR", GXutil.rtrim( AV77Wcfaseshdrds_4_barcodpar));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXUITABSPANEL_TABS_Pagecount", GXutil.ltrim( localUtil.ntoc( Gxuitabspanel_tabs_Pagecount, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXUITABSPANEL_TABS_Class", GXutil.rtrim( Gxuitabspanel_tabs_Class));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXUITABSPANEL_TABS_Historymanagement", GXutil.booltostr( Gxuitabspanel_tabs_Historymanagement));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Caption", GXutil.rtrim( Ddo_grid_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_set", GXutil.rtrim( Ddo_grid_Filteredtext_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_set", GXutil.rtrim( Ddo_grid_Filteredtextto_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_set", GXutil.rtrim( Ddo_grid_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includesortasc", GXutil.rtrim( Ddo_grid_Includesortasc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Fixable", GXutil.rtrim( Ddo_grid_Fixable));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filterisrange", GXutil.rtrim( Ddo_grid_Filterisrange));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includedatalist", GXutil.rtrim( Ddo_grid_Includedatalist));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalisttype", GXutil.rtrim( Ddo_grid_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Allowmultipleselection", GXutil.rtrim( Ddo_grid_Allowmultipleselection));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalistfixedvalues", GXutil.rtrim( Ddo_grid_Datalistfixedvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption", GXutil.rtrim( Ddo_gridcolumnsselector_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip", GXutil.rtrim( Ddo_gridcolumnsselector_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls", GXutil.rtrim( Ddo_gridcolumnsselector_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype", GXutil.rtrim( Ddo_gridcolumnsselector_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname", GXutil.rtrim( Ddo_gridcolumnsselector_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace", GXutil.rtrim( Ddo_gridcolumnsselector_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
   }

   public void renderHtmlCloseFormIW2( )
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
         if ( ! ( WebComp_Wcwclecturasproduccion == null ) )
         {
            WebComp_Wcwclecturasproduccion.componentjscripts();
         }
         if ( ! ( WebComp_Wcwcmtskgsexpautsindetalle == null ) )
         {
            WebComp_Wcwcmtskgsexpautsindetalle.componentjscripts();
         }
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
      return "WCFasesHdr" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Fases Hdr", "") ;
   }

   public void wbIW0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.wcfaseshdr");
            httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManager.js", "", false, true);
            httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/json2005.js", "", false, true);
            httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/rsh.js", "", false, true);
            httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManagerCreate.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
            httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
         ucDvpanel_tableheader.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tableheader_Internalname, sPrefix+"DVPANEL_TABLEHEADERContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_TABLEHEADERContainer"+"TableHeader"+"\" style=\"display:none;\">") ;
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 35, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCFasesHdr.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_19_IW2( true) ;
      }
      else
      {
         wb_table1_19_IW2( false) ;
      }
      return  ;
   }

   public void wb_table1_19_IW2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV61GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV62GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, sPrefix+"GRIDPAGINATIONBARContainer");
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
         ucGxuitabspanel_tabs.setProperty("PageCount", Gxuitabspanel_tabs_Pagecount);
         ucGxuitabspanel_tabs.setProperty("Class", Gxuitabspanel_tabs_Class);
         ucGxuitabspanel_tabs.setProperty("HistoryManagement", Gxuitabspanel_tabs_Historymanagement);
         ucGxuitabspanel_tabs.render(context, "tab", Gxuitabspanel_tabs_Internalname, sPrefix+"GXUITABSPANEL_TABSContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"GXUITABSPANEL_TABSContainer"+"title1"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblProduccion_title_Internalname, httpContext.getMessage( "Partes de Produccion", ""), "", "", lblProduccion_title_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_WCFasesHdr.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "Produccion") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"GXUITABSPANEL_TABSContainer"+"panel1"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"W0061"+"", GXutil.rtrim( WebComp_Wcwclecturasproduccion_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+sPrefix+"gxHTMLWrpW0061"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_35_Refreshing )
            {
               if ( GXutil.len( WebComp_Wcwclecturasproduccion_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldWcwclecturasproduccion), GXutil.lower( WebComp_Wcwclecturasproduccion_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0061"+"");
                  }
                  WebComp_Wcwclecturasproduccion.componentdraw();
                  if ( GXutil.strcmp(GXutil.lower( OldWcwclecturasproduccion), GXutil.lower( WebComp_Wcwclecturasproduccion_Component)) != 0 )
                  {
                     httpContext.ajax_rspEndCmp();
                  }
               }
            }
            httpContext.writeText( "</div>") ;
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"GXUITABSPANEL_TABSContainer"+"title2"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblPiezas_title_Internalname, httpContext.getMessage( "Piezas Exp Aut", ""), "", "", lblPiezas_title_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_WCFasesHdr.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "Piezas") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"GXUITABSPANEL_TABSContainer"+"panel2"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"W0069"+"", GXutil.rtrim( WebComp_Wcwcmtskgsexpautsindetalle_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+sPrefix+"gxHTMLWrpW0069"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_35_Refreshing )
            {
               if ( GXutil.len( WebComp_Wcwcmtskgsexpautsindetalle_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldWcwcmtskgsexpautsindetalle), GXutil.lower( WebComp_Wcwcmtskgsexpautsindetalle_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0069"+"");
                  }
                  WebComp_Wcwcmtskgsexpautsindetalle.componentdraw();
                  if ( GXutil.strcmp(GXutil.lower( OldWcwcmtskgsexpautsindetalle), GXutil.lower( WebComp_Wcwcmtskgsexpautsindetalle_Component)) != 0 )
                  {
                     httpContext.ajax_rspEndCmp();
                  }
               }
            }
            httpContext.writeText( "</div>") ;
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         /* User Defined Control */
         ucDdo_grid.setProperty("Caption", Ddo_grid_Caption);
         ucDdo_grid.setProperty("ColumnIds", Ddo_grid_Columnids);
         ucDdo_grid.setProperty("ColumnsSortValues", Ddo_grid_Columnssortvalues);
         ucDdo_grid.setProperty("IncludeSortASC", Ddo_grid_Includesortasc);
         ucDdo_grid.setProperty("Fixable", Ddo_grid_Fixable);
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("FilterIsRange", Ddo_grid_Filterisrange);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("AllowMultipleSelection", Ddo_grid_Allowmultipleselection);
         ucDdo_grid.setProperty("DataListFixedValues", Ddo_grid_Datalistfixedvalues);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV59DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, 0, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WCFasesHdr.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "Attribute", "", "", "", "", edtBarCod_Visible, 0, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WCFasesHdr.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "Attribute", "", "", "", "", edtBarCodReo_Visible, 0, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WCFasesHdr.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "Attribute", "", "", "", "", edtBarCodPar_Visible, 0, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WCFasesHdr.htm");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV59DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV21ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_barfasdtiauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'" + sPrefix + "',false,'" + sGXsfl_35_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_barfasdtiauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_barfasdtiauxdate_Internalname, localUtil.format(AV39DDO_BarFasDTIAuxDate, "99/99/99"), localUtil.format( AV39DDO_BarFasDTIAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,81);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_barfasdtiauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WCFasesHdr.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_barfasdtiauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WCFasesHdr.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_barfasdtfauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'" + sPrefix + "',false,'" + sGXsfl_35_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_barfasdtfauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_barfasdtfauxdate_Internalname, localUtil.format(AV44DDO_BarFasDTFAuxDate, "99/99/99"), localUtil.format( AV44DDO_BarFasDTFAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,83);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_barfasdtfauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WCFasesHdr.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_barfasdtfauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WCFasesHdr.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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

   public void startIW2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Fases Hdr", ""), (short)(0)) ;
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
            strupIW0( ) ;
         }
      }
   }

   public void wsIW2( )
   {
      startIW2( ) ;
      evtIW2( ) ;
   }

   public void evtIW2( )
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
                              strupIW0( ) ;
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
                              strupIW0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e11IW2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupIW0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e12IW2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupIW0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e13IW2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupIW0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e14IW2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupIW0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavFilterfulltext_Internalname ;
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
                              strupIW0( ) ;
                           }
                           nGXsfl_35_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_352( ) ;
                           A194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
                           A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
                           A603MaqCodBis = httpContext.cgiGet( edtMaqCodBis_Internalname) ;
                           AV15MaqDsc = httpContext.cgiGet( edtavMaqdsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMaqdsc_Internalname, AV15MaqDsc);
                           A4442BarFasDTI = localUtil.ctot( httpContext.cgiGet( edtBarFasDTI_Internalname), 0) ;
                           A4443BarFasDTF = localUtil.ctot( httpContext.cgiGet( edtBarFasDTF_Internalname), 0) ;
                           A215BarTieRea = localUtil.ctond( httpContext.cgiGet( edtBarTieRea_Internalname)) ;
                           cmbBarFasEst.setName( cmbBarFasEst.getInternalname() );
                           cmbBarFasEst.setValue( httpContext.cgiGet( cmbBarFasEst.getInternalname()) );
                           A153BarFasEst = (byte)(GXutil.lval( httpContext.cgiGet( cmbBarFasEst.getInternalname()))) ;
                           A3837BarFasKgm = localUtil.ctond( httpContext.cgiGet( edtBarFasKgm_Internalname)) ;
                           A3838BarFasMtr = localUtil.ctond( httpContext.cgiGet( edtBarFasMtr_Internalname)) ;
                           AV16OpeNom = httpContext.cgiGet( edtavOpenom_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOpenom_Internalname, AV16OpeNom);
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
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e15IW2 ();
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
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e16IW2 ();
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
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e17IW2 ();
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
                                          /* Set Refresh If Filterfulltext Changed */
                                          if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV67FilterFullText) != 0 )
                                          {
                                             Rfr0gs = true ;
                                          }
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
                                    strupIW0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
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
                  else if ( GXutil.strcmp(sEvtType, "W") == 0 )
                  {
                     sEvtType = GXutil.left( sEvt, 4) ;
                     sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-4) ;
                     nCmpId = (short)(GXutil.lval( sEvtType)) ;
                     if ( nCmpId == 61 )
                     {
                        OldWcwclecturasproduccion = httpContext.cgiGet( sPrefix+"W0061") ;
                        if ( ( GXutil.len( OldWcwclecturasproduccion) == 0 ) || ( GXutil.strcmp(OldWcwclecturasproduccion, WebComp_Wcwclecturasproduccion_Component) != 0 ) )
                        {
                           WebComp_Wcwclecturasproduccion = WebUtils.getWebComponent(getClass(), "app." + OldWcwclecturasproduccion + "_impl", remoteHandle, context);
                           WebComp_Wcwclecturasproduccion_Component = OldWcwclecturasproduccion ;
                        }
                        if ( GXutil.len( WebComp_Wcwclecturasproduccion_Component) != 0 )
                        {
                           WebComp_Wcwclecturasproduccion.componentprocess(sPrefix+"W0061", "", sEvt);
                        }
                        WebComp_Wcwclecturasproduccion_Component = OldWcwclecturasproduccion ;
                     }
                     else if ( nCmpId == 69 )
                     {
                        OldWcwcmtskgsexpautsindetalle = httpContext.cgiGet( sPrefix+"W0069") ;
                        if ( ( GXutil.len( OldWcwcmtskgsexpautsindetalle) == 0 ) || ( GXutil.strcmp(OldWcwcmtskgsexpautsindetalle, WebComp_Wcwcmtskgsexpautsindetalle_Component) != 0 ) )
                        {
                           WebComp_Wcwcmtskgsexpautsindetalle = WebUtils.getWebComponent(getClass(), "app." + OldWcwcmtskgsexpautsindetalle + "_impl", remoteHandle, context);
                           WebComp_Wcwcmtskgsexpautsindetalle_Component = OldWcwcmtskgsexpautsindetalle ;
                        }
                        if ( GXutil.len( WebComp_Wcwcmtskgsexpautsindetalle_Component) != 0 )
                        {
                           WebComp_Wcwcmtskgsexpautsindetalle.componentprocess(sPrefix+"W0069", "", sEvt);
                        }
                        WebComp_Wcwcmtskgsexpautsindetalle_Component = OldWcwcmtskgsexpautsindetalle ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void weIW2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseFormIW2( ) ;
         }
      }
   }

   public void paIW2( )
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
            GX_FocusControl = edtavFilterfulltext_Internalname ;
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
                                 String AV67FilterFullText ,
                                 String AV63Emprcod ,
                                 int AV64Barcod ,
                                 byte AV65Barcodreo ,
                                 String AV66Barcodpar ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV21ColumnsSelector ,
                                 short AV25TFBarOrdLin ,
                                 short AV26TFBarOrdLin_To ,
                                 String AV28TFFasCod ,
                                 String AV29TFFasCod_Sel ,
                                 String AV31TFFasDsc ,
                                 String AV32TFFasDsc_Sel ,
                                 String AV34TFMaqCodBis ,
                                 String AV35TFMaqCodBis_Sel ,
                                 java.util.Date AV37TFBarFasDTI ,
                                 java.util.Date AV42TFBarFasDTF ,
                                 java.math.BigDecimal AV47TFBarTieRea ,
                                 java.math.BigDecimal AV48TFBarTieRea_To ,
                                 GXSimpleCollection<Byte> AV51TFBarFasEst_Sels ,
                                 java.math.BigDecimal AV53TFBarFasKgm ,
                                 java.math.BigDecimal AV54TFBarFasKgm_To ,
                                 java.math.BigDecimal AV56TFBarFasMtr ,
                                 java.math.BigDecimal AV57TFBarFasMtr_To ,
                                 String AV96Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 String A603MaqCodBis ,
                                 String A6173BarFasSec ,
                                 short A194BarOrdLin ,
                                 String AV74Wcfaseshdrds_1_emprcod ,
                                 int AV75Wcfaseshdrds_2_barcod ,
                                 byte AV76Wcfaseshdrds_3_barcodreo ,
                                 String AV77Wcfaseshdrds_4_barcodpar ,
                                 String A396EmprCod ,
                                 int A129BarCod ,
                                 byte A132BarCodReo ,
                                 String A130BarCodPar ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e16IW2 ();
      GRID_nCurrentRecord = 0 ;
      rfIW2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"WCFasesHdr");
      forbiddenHiddens.add("EmprCod", GXutil.rtrim( localUtil.format( A396EmprCod, "@!")));
      forbiddenHiddens.add("BarCod", localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"));
      forbiddenHiddens.add("BarCodReo", localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"));
      forbiddenHiddens.add("BarCodPar", GXutil.rtrim( localUtil.format( A130BarCodPar, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("wcfaseshdr:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rfIW2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV96Pgmname = "WCFasesHdr" ;
      Gx_err = (short)(0) ;
      edtavMaqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMaqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqdsc_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtavOpenom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavOpenom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOpenom_Enabled), 5, 0), !bGXsfl_35_Refreshing);
   }

   public void rfIW2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(35) ;
      /* Execute user event: Refresh */
      e16IW2 ();
      nGXsfl_35_idx = 1 ;
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_352( ) ;
      bGXsfl_35_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcwclecturasproduccion_Component) != 0 )
            {
               WebComp_Wcwclecturasproduccion.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcwcmtskgsexpautsindetalle_Component) != 0 )
            {
               WebComp_Wcwcmtskgsexpautsindetalle.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_352( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Byte.valueOf(A153BarFasEst) ,
                                              AV91Wcfaseshdrds_18_tfbarfasest_sels ,
                                              AV78Wcfaseshdrds_5_filterfulltext ,
                                              Short.valueOf(AV79Wcfaseshdrds_6_tfbarordlin) ,
                                              Short.valueOf(AV80Wcfaseshdrds_7_tfbarordlin_to) ,
                                              AV82Wcfaseshdrds_9_tffascod_sel ,
                                              AV81Wcfaseshdrds_8_tffascod ,
                                              AV84Wcfaseshdrds_11_tffasdsc_sel ,
                                              AV83Wcfaseshdrds_10_tffasdsc ,
                                              AV86Wcfaseshdrds_13_tfmaqcodbis_sel ,
                                              AV85Wcfaseshdrds_12_tfmaqcodbis ,
                                              AV87Wcfaseshdrds_14_tfbarfasdti ,
                                              AV88Wcfaseshdrds_15_tfbarfasdtf ,
                                              AV89Wcfaseshdrds_16_tfbartierea ,
                                              AV90Wcfaseshdrds_17_tfbartierea_to ,
                                              Integer.valueOf(AV91Wcfaseshdrds_18_tfbarfasest_sels.size()) ,
                                              AV92Wcfaseshdrds_19_tfbarfaskgm ,
                                              AV93Wcfaseshdrds_20_tfbarfaskgm_to ,
                                              AV94Wcfaseshdrds_21_tfbarfasmtr ,
                                              AV95Wcfaseshdrds_22_tfbarfasmtr_to ,
                                              Short.valueOf(A194BarOrdLin) ,
                                              A457FasCod ,
                                              A460FasDsc ,
                                              A603MaqCodBis ,
                                              A215BarTieRea ,
                                              A3837BarFasKgm ,
                                              A3838BarFasMtr ,
                                              A4442BarFasDTI ,
                                              A4443BarFasDTF ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              A396EmprCod ,
                                              AV63Emprcod ,
                                              Integer.valueOf(A129BarCod) ,
                                              Integer.valueOf(AV64Barcod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              Byte.valueOf(AV65Barcodreo) ,
                                              A130BarCodPar ,
                                              AV66Barcodpar ,
                                              AV74Wcfaseshdrds_1_emprcod ,
                                              Integer.valueOf(AV75Wcfaseshdrds_2_barcod) ,
                                              Byte.valueOf(AV76Wcfaseshdrds_3_barcodreo) ,
                                              AV77Wcfaseshdrds_4_barcodpar } ,
                                              new int[]{
                                              TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.BYTE, TypeConstants.STRING
                                              }
         });
         /* Using cursor H00IW2 */
         pr_default.execute(0, new Object[] {AV74Wcfaseshdrds_1_emprcod, Integer.valueOf(AV75Wcfaseshdrds_2_barcod), Byte.valueOf(AV76Wcfaseshdrds_3_barcodreo), AV77Wcfaseshdrds_4_barcodpar, AV63Emprcod, Integer.valueOf(AV64Barcod), Byte.valueOf(AV65Barcodreo), AV66Barcodpar, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_35_idx = 1 ;
         sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_352( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A148BarEstReo = H00IW2_A148BarEstReo[0] ;
            A934BarReoCod = H00IW2_A934BarReoCod[0] ;
            A936BarReoReo = H00IW2_A936BarReoReo[0] ;
            A935BarReoPar = H00IW2_A935BarReoPar[0] ;
            A396EmprCod = H00IW2_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
            A129BarCod = H00IW2_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = H00IW2_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = H00IW2_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A130BarCodPar", A130BarCodPar);
            e17IW2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(35) ;
         wbIW0( ) ;
      }
      bGXsfl_35_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesIW2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV96Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV96Pgmname, ""))));
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
      AV74Wcfaseshdrds_1_emprcod = AV63Emprcod ;
      AV75Wcfaseshdrds_2_barcod = AV64Barcod ;
      AV76Wcfaseshdrds_3_barcodreo = AV65Barcodreo ;
      AV77Wcfaseshdrds_4_barcodpar = AV66Barcodpar ;
      AV78Wcfaseshdrds_5_filterfulltext = AV67FilterFullText ;
      AV79Wcfaseshdrds_6_tfbarordlin = AV25TFBarOrdLin ;
      AV80Wcfaseshdrds_7_tfbarordlin_to = AV26TFBarOrdLin_To ;
      AV81Wcfaseshdrds_8_tffascod = AV28TFFasCod ;
      AV82Wcfaseshdrds_9_tffascod_sel = AV29TFFasCod_Sel ;
      AV83Wcfaseshdrds_10_tffasdsc = AV31TFFasDsc ;
      AV84Wcfaseshdrds_11_tffasdsc_sel = AV32TFFasDsc_Sel ;
      AV85Wcfaseshdrds_12_tfmaqcodbis = AV34TFMaqCodBis ;
      AV86Wcfaseshdrds_13_tfmaqcodbis_sel = AV35TFMaqCodBis_Sel ;
      AV87Wcfaseshdrds_14_tfbarfasdti = AV37TFBarFasDTI ;
      AV88Wcfaseshdrds_15_tfbarfasdtf = AV42TFBarFasDTF ;
      AV89Wcfaseshdrds_16_tfbartierea = AV47TFBarTieRea ;
      AV90Wcfaseshdrds_17_tfbartierea_to = AV48TFBarTieRea_To ;
      AV91Wcfaseshdrds_18_tfbarfasest_sels = AV51TFBarFasEst_Sels ;
      AV92Wcfaseshdrds_19_tfbarfaskgm = AV53TFBarFasKgm ;
      AV93Wcfaseshdrds_20_tfbarfaskgm_to = AV54TFBarFasKgm_To ;
      AV94Wcfaseshdrds_21_tfbarfasmtr = AV56TFBarFasMtr ;
      AV95Wcfaseshdrds_22_tfbarfasmtr_to = AV57TFBarFasMtr_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(A153BarFasEst) ,
                                           AV91Wcfaseshdrds_18_tfbarfasest_sels ,
                                           AV78Wcfaseshdrds_5_filterfulltext ,
                                           Short.valueOf(AV79Wcfaseshdrds_6_tfbarordlin) ,
                                           Short.valueOf(AV80Wcfaseshdrds_7_tfbarordlin_to) ,
                                           AV82Wcfaseshdrds_9_tffascod_sel ,
                                           AV81Wcfaseshdrds_8_tffascod ,
                                           AV84Wcfaseshdrds_11_tffasdsc_sel ,
                                           AV83Wcfaseshdrds_10_tffasdsc ,
                                           AV86Wcfaseshdrds_13_tfmaqcodbis_sel ,
                                           AV85Wcfaseshdrds_12_tfmaqcodbis ,
                                           AV87Wcfaseshdrds_14_tfbarfasdti ,
                                           AV88Wcfaseshdrds_15_tfbarfasdtf ,
                                           AV89Wcfaseshdrds_16_tfbartierea ,
                                           AV90Wcfaseshdrds_17_tfbartierea_to ,
                                           Integer.valueOf(AV91Wcfaseshdrds_18_tfbarfasest_sels.size()) ,
                                           AV92Wcfaseshdrds_19_tfbarfaskgm ,
                                           AV93Wcfaseshdrds_20_tfbarfaskgm_to ,
                                           AV94Wcfaseshdrds_21_tfbarfasmtr ,
                                           AV95Wcfaseshdrds_22_tfbarfasmtr_to ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A603MaqCodBis ,
                                           A215BarTieRea ,
                                           A3837BarFasKgm ,
                                           A3838BarFasMtr ,
                                           A4442BarFasDTI ,
                                           A4443BarFasDTF ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           A396EmprCod ,
                                           AV63Emprcod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV64Barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV65Barcodreo) ,
                                           A130BarCodPar ,
                                           AV66Barcodpar ,
                                           AV74Wcfaseshdrds_1_emprcod ,
                                           Integer.valueOf(AV75Wcfaseshdrds_2_barcod) ,
                                           Byte.valueOf(AV76Wcfaseshdrds_3_barcodreo) ,
                                           AV77Wcfaseshdrds_4_barcodpar } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      /* Using cursor H00IW3 */
      pr_default.execute(1, new Object[] {AV74Wcfaseshdrds_1_emprcod, Integer.valueOf(AV75Wcfaseshdrds_2_barcod), Byte.valueOf(AV76Wcfaseshdrds_3_barcodreo), AV77Wcfaseshdrds_4_barcodpar, AV63Emprcod, Integer.valueOf(AV64Barcod), Byte.valueOf(AV65Barcodreo), AV66Barcodpar});
      GRID_nRecordCount = H00IW3_AGRID_nRecordCount[0] ;
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
      AV74Wcfaseshdrds_1_emprcod = AV63Emprcod ;
      AV75Wcfaseshdrds_2_barcod = AV64Barcod ;
      AV76Wcfaseshdrds_3_barcodreo = AV65Barcodreo ;
      AV77Wcfaseshdrds_4_barcodpar = AV66Barcodpar ;
      AV78Wcfaseshdrds_5_filterfulltext = AV67FilterFullText ;
      AV79Wcfaseshdrds_6_tfbarordlin = AV25TFBarOrdLin ;
      AV80Wcfaseshdrds_7_tfbarordlin_to = AV26TFBarOrdLin_To ;
      AV81Wcfaseshdrds_8_tffascod = AV28TFFasCod ;
      AV82Wcfaseshdrds_9_tffascod_sel = AV29TFFasCod_Sel ;
      AV83Wcfaseshdrds_10_tffasdsc = AV31TFFasDsc ;
      AV84Wcfaseshdrds_11_tffasdsc_sel = AV32TFFasDsc_Sel ;
      AV85Wcfaseshdrds_12_tfmaqcodbis = AV34TFMaqCodBis ;
      AV86Wcfaseshdrds_13_tfmaqcodbis_sel = AV35TFMaqCodBis_Sel ;
      AV87Wcfaseshdrds_14_tfbarfasdti = AV37TFBarFasDTI ;
      AV88Wcfaseshdrds_15_tfbarfasdtf = AV42TFBarFasDTF ;
      AV89Wcfaseshdrds_16_tfbartierea = AV47TFBarTieRea ;
      AV90Wcfaseshdrds_17_tfbartierea_to = AV48TFBarTieRea_To ;
      AV91Wcfaseshdrds_18_tfbarfasest_sels = AV51TFBarFasEst_Sels ;
      AV92Wcfaseshdrds_19_tfbarfaskgm = AV53TFBarFasKgm ;
      AV93Wcfaseshdrds_20_tfbarfaskgm_to = AV54TFBarFasKgm_To ;
      AV94Wcfaseshdrds_21_tfbarfasmtr = AV56TFBarFasMtr ;
      AV95Wcfaseshdrds_22_tfbarfasmtr_to = AV57TFBarFasMtr_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV67FilterFullText, AV63Emprcod, AV64Barcod, AV65Barcodreo, AV66Barcodpar, AV21ColumnsSelector, AV25TFBarOrdLin, AV26TFBarOrdLin_To, AV28TFFasCod, AV29TFFasCod_Sel, AV31TFFasDsc, AV32TFFasDsc_Sel, AV34TFMaqCodBis, AV35TFMaqCodBis_Sel, AV37TFBarFasDTI, AV42TFBarFasDTF, AV47TFBarTieRea, AV48TFBarTieRea_To, AV51TFBarFasEst_Sels, AV53TFBarFasKgm, AV54TFBarFasKgm_To, AV56TFBarFasMtr, AV57TFBarFasMtr_To, AV96Pgmname, AV12OrderedBy, AV13OrderedDsc, A603MaqCodBis, A6173BarFasSec, A194BarOrdLin, AV74Wcfaseshdrds_1_emprcod, AV75Wcfaseshdrds_2_barcod, AV76Wcfaseshdrds_3_barcodreo, AV77Wcfaseshdrds_4_barcodpar, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV74Wcfaseshdrds_1_emprcod = AV63Emprcod ;
      AV75Wcfaseshdrds_2_barcod = AV64Barcod ;
      AV76Wcfaseshdrds_3_barcodreo = AV65Barcodreo ;
      AV77Wcfaseshdrds_4_barcodpar = AV66Barcodpar ;
      AV78Wcfaseshdrds_5_filterfulltext = AV67FilterFullText ;
      AV79Wcfaseshdrds_6_tfbarordlin = AV25TFBarOrdLin ;
      AV80Wcfaseshdrds_7_tfbarordlin_to = AV26TFBarOrdLin_To ;
      AV81Wcfaseshdrds_8_tffascod = AV28TFFasCod ;
      AV82Wcfaseshdrds_9_tffascod_sel = AV29TFFasCod_Sel ;
      AV83Wcfaseshdrds_10_tffasdsc = AV31TFFasDsc ;
      AV84Wcfaseshdrds_11_tffasdsc_sel = AV32TFFasDsc_Sel ;
      AV85Wcfaseshdrds_12_tfmaqcodbis = AV34TFMaqCodBis ;
      AV86Wcfaseshdrds_13_tfmaqcodbis_sel = AV35TFMaqCodBis_Sel ;
      AV87Wcfaseshdrds_14_tfbarfasdti = AV37TFBarFasDTI ;
      AV88Wcfaseshdrds_15_tfbarfasdtf = AV42TFBarFasDTF ;
      AV89Wcfaseshdrds_16_tfbartierea = AV47TFBarTieRea ;
      AV90Wcfaseshdrds_17_tfbartierea_to = AV48TFBarTieRea_To ;
      AV91Wcfaseshdrds_18_tfbarfasest_sels = AV51TFBarFasEst_Sels ;
      AV92Wcfaseshdrds_19_tfbarfaskgm = AV53TFBarFasKgm ;
      AV93Wcfaseshdrds_20_tfbarfaskgm_to = AV54TFBarFasKgm_To ;
      AV94Wcfaseshdrds_21_tfbarfasmtr = AV56TFBarFasMtr ;
      AV95Wcfaseshdrds_22_tfbarfasmtr_to = AV57TFBarFasMtr_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV67FilterFullText, AV63Emprcod, AV64Barcod, AV65Barcodreo, AV66Barcodpar, AV21ColumnsSelector, AV25TFBarOrdLin, AV26TFBarOrdLin_To, AV28TFFasCod, AV29TFFasCod_Sel, AV31TFFasDsc, AV32TFFasDsc_Sel, AV34TFMaqCodBis, AV35TFMaqCodBis_Sel, AV37TFBarFasDTI, AV42TFBarFasDTF, AV47TFBarTieRea, AV48TFBarTieRea_To, AV51TFBarFasEst_Sels, AV53TFBarFasKgm, AV54TFBarFasKgm_To, AV56TFBarFasMtr, AV57TFBarFasMtr_To, AV96Pgmname, AV12OrderedBy, AV13OrderedDsc, A603MaqCodBis, A6173BarFasSec, A194BarOrdLin, AV74Wcfaseshdrds_1_emprcod, AV75Wcfaseshdrds_2_barcod, AV76Wcfaseshdrds_3_barcodreo, AV77Wcfaseshdrds_4_barcodpar, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV74Wcfaseshdrds_1_emprcod = AV63Emprcod ;
      AV75Wcfaseshdrds_2_barcod = AV64Barcod ;
      AV76Wcfaseshdrds_3_barcodreo = AV65Barcodreo ;
      AV77Wcfaseshdrds_4_barcodpar = AV66Barcodpar ;
      AV78Wcfaseshdrds_5_filterfulltext = AV67FilterFullText ;
      AV79Wcfaseshdrds_6_tfbarordlin = AV25TFBarOrdLin ;
      AV80Wcfaseshdrds_7_tfbarordlin_to = AV26TFBarOrdLin_To ;
      AV81Wcfaseshdrds_8_tffascod = AV28TFFasCod ;
      AV82Wcfaseshdrds_9_tffascod_sel = AV29TFFasCod_Sel ;
      AV83Wcfaseshdrds_10_tffasdsc = AV31TFFasDsc ;
      AV84Wcfaseshdrds_11_tffasdsc_sel = AV32TFFasDsc_Sel ;
      AV85Wcfaseshdrds_12_tfmaqcodbis = AV34TFMaqCodBis ;
      AV86Wcfaseshdrds_13_tfmaqcodbis_sel = AV35TFMaqCodBis_Sel ;
      AV87Wcfaseshdrds_14_tfbarfasdti = AV37TFBarFasDTI ;
      AV88Wcfaseshdrds_15_tfbarfasdtf = AV42TFBarFasDTF ;
      AV89Wcfaseshdrds_16_tfbartierea = AV47TFBarTieRea ;
      AV90Wcfaseshdrds_17_tfbartierea_to = AV48TFBarTieRea_To ;
      AV91Wcfaseshdrds_18_tfbarfasest_sels = AV51TFBarFasEst_Sels ;
      AV92Wcfaseshdrds_19_tfbarfaskgm = AV53TFBarFasKgm ;
      AV93Wcfaseshdrds_20_tfbarfaskgm_to = AV54TFBarFasKgm_To ;
      AV94Wcfaseshdrds_21_tfbarfasmtr = AV56TFBarFasMtr ;
      AV95Wcfaseshdrds_22_tfbarfasmtr_to = AV57TFBarFasMtr_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV67FilterFullText, AV63Emprcod, AV64Barcod, AV65Barcodreo, AV66Barcodpar, AV21ColumnsSelector, AV25TFBarOrdLin, AV26TFBarOrdLin_To, AV28TFFasCod, AV29TFFasCod_Sel, AV31TFFasDsc, AV32TFFasDsc_Sel, AV34TFMaqCodBis, AV35TFMaqCodBis_Sel, AV37TFBarFasDTI, AV42TFBarFasDTF, AV47TFBarTieRea, AV48TFBarTieRea_To, AV51TFBarFasEst_Sels, AV53TFBarFasKgm, AV54TFBarFasKgm_To, AV56TFBarFasMtr, AV57TFBarFasMtr_To, AV96Pgmname, AV12OrderedBy, AV13OrderedDsc, A603MaqCodBis, A6173BarFasSec, A194BarOrdLin, AV74Wcfaseshdrds_1_emprcod, AV75Wcfaseshdrds_2_barcod, AV76Wcfaseshdrds_3_barcodreo, AV77Wcfaseshdrds_4_barcodpar, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV74Wcfaseshdrds_1_emprcod = AV63Emprcod ;
      AV75Wcfaseshdrds_2_barcod = AV64Barcod ;
      AV76Wcfaseshdrds_3_barcodreo = AV65Barcodreo ;
      AV77Wcfaseshdrds_4_barcodpar = AV66Barcodpar ;
      AV78Wcfaseshdrds_5_filterfulltext = AV67FilterFullText ;
      AV79Wcfaseshdrds_6_tfbarordlin = AV25TFBarOrdLin ;
      AV80Wcfaseshdrds_7_tfbarordlin_to = AV26TFBarOrdLin_To ;
      AV81Wcfaseshdrds_8_tffascod = AV28TFFasCod ;
      AV82Wcfaseshdrds_9_tffascod_sel = AV29TFFasCod_Sel ;
      AV83Wcfaseshdrds_10_tffasdsc = AV31TFFasDsc ;
      AV84Wcfaseshdrds_11_tffasdsc_sel = AV32TFFasDsc_Sel ;
      AV85Wcfaseshdrds_12_tfmaqcodbis = AV34TFMaqCodBis ;
      AV86Wcfaseshdrds_13_tfmaqcodbis_sel = AV35TFMaqCodBis_Sel ;
      AV87Wcfaseshdrds_14_tfbarfasdti = AV37TFBarFasDTI ;
      AV88Wcfaseshdrds_15_tfbarfasdtf = AV42TFBarFasDTF ;
      AV89Wcfaseshdrds_16_tfbartierea = AV47TFBarTieRea ;
      AV90Wcfaseshdrds_17_tfbartierea_to = AV48TFBarTieRea_To ;
      AV91Wcfaseshdrds_18_tfbarfasest_sels = AV51TFBarFasEst_Sels ;
      AV92Wcfaseshdrds_19_tfbarfaskgm = AV53TFBarFasKgm ;
      AV93Wcfaseshdrds_20_tfbarfaskgm_to = AV54TFBarFasKgm_To ;
      AV94Wcfaseshdrds_21_tfbarfasmtr = AV56TFBarFasMtr ;
      AV95Wcfaseshdrds_22_tfbarfasmtr_to = AV57TFBarFasMtr_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV67FilterFullText, AV63Emprcod, AV64Barcod, AV65Barcodreo, AV66Barcodpar, AV21ColumnsSelector, AV25TFBarOrdLin, AV26TFBarOrdLin_To, AV28TFFasCod, AV29TFFasCod_Sel, AV31TFFasDsc, AV32TFFasDsc_Sel, AV34TFMaqCodBis, AV35TFMaqCodBis_Sel, AV37TFBarFasDTI, AV42TFBarFasDTF, AV47TFBarTieRea, AV48TFBarTieRea_To, AV51TFBarFasEst_Sels, AV53TFBarFasKgm, AV54TFBarFasKgm_To, AV56TFBarFasMtr, AV57TFBarFasMtr_To, AV96Pgmname, AV12OrderedBy, AV13OrderedDsc, A603MaqCodBis, A6173BarFasSec, A194BarOrdLin, AV74Wcfaseshdrds_1_emprcod, AV75Wcfaseshdrds_2_barcod, AV76Wcfaseshdrds_3_barcodreo, AV77Wcfaseshdrds_4_barcodpar, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV74Wcfaseshdrds_1_emprcod = AV63Emprcod ;
      AV75Wcfaseshdrds_2_barcod = AV64Barcod ;
      AV76Wcfaseshdrds_3_barcodreo = AV65Barcodreo ;
      AV77Wcfaseshdrds_4_barcodpar = AV66Barcodpar ;
      AV78Wcfaseshdrds_5_filterfulltext = AV67FilterFullText ;
      AV79Wcfaseshdrds_6_tfbarordlin = AV25TFBarOrdLin ;
      AV80Wcfaseshdrds_7_tfbarordlin_to = AV26TFBarOrdLin_To ;
      AV81Wcfaseshdrds_8_tffascod = AV28TFFasCod ;
      AV82Wcfaseshdrds_9_tffascod_sel = AV29TFFasCod_Sel ;
      AV83Wcfaseshdrds_10_tffasdsc = AV31TFFasDsc ;
      AV84Wcfaseshdrds_11_tffasdsc_sel = AV32TFFasDsc_Sel ;
      AV85Wcfaseshdrds_12_tfmaqcodbis = AV34TFMaqCodBis ;
      AV86Wcfaseshdrds_13_tfmaqcodbis_sel = AV35TFMaqCodBis_Sel ;
      AV87Wcfaseshdrds_14_tfbarfasdti = AV37TFBarFasDTI ;
      AV88Wcfaseshdrds_15_tfbarfasdtf = AV42TFBarFasDTF ;
      AV89Wcfaseshdrds_16_tfbartierea = AV47TFBarTieRea ;
      AV90Wcfaseshdrds_17_tfbartierea_to = AV48TFBarTieRea_To ;
      AV91Wcfaseshdrds_18_tfbarfasest_sels = AV51TFBarFasEst_Sels ;
      AV92Wcfaseshdrds_19_tfbarfaskgm = AV53TFBarFasKgm ;
      AV93Wcfaseshdrds_20_tfbarfaskgm_to = AV54TFBarFasKgm_To ;
      AV94Wcfaseshdrds_21_tfbarfasmtr = AV56TFBarFasMtr ;
      AV95Wcfaseshdrds_22_tfbarfasmtr_to = AV57TFBarFasMtr_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV67FilterFullText, AV63Emprcod, AV64Barcod, AV65Barcodreo, AV66Barcodpar, AV21ColumnsSelector, AV25TFBarOrdLin, AV26TFBarOrdLin_To, AV28TFFasCod, AV29TFFasCod_Sel, AV31TFFasDsc, AV32TFFasDsc_Sel, AV34TFMaqCodBis, AV35TFMaqCodBis_Sel, AV37TFBarFasDTI, AV42TFBarFasDTF, AV47TFBarTieRea, AV48TFBarTieRea_To, AV51TFBarFasEst_Sels, AV53TFBarFasKgm, AV54TFBarFasKgm_To, AV56TFBarFasMtr, AV57TFBarFasMtr_To, AV96Pgmname, AV12OrderedBy, AV13OrderedDsc, A603MaqCodBis, A6173BarFasSec, A194BarOrdLin, AV74Wcfaseshdrds_1_emprcod, AV75Wcfaseshdrds_2_barcod, AV76Wcfaseshdrds_3_barcodreo, AV77Wcfaseshdrds_4_barcodpar, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV96Pgmname = "WCFasesHdr" ;
      Gx_err = (short)(0) ;
      edtavMaqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMaqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqdsc_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtavOpenom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavOpenom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOpenom_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strupIW0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e15IW2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV59DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV21ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_35 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_35"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV61GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV62GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV63Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV63Emprcod") ;
         wcpOAV64Barcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV64Barcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV65Barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV65Barcodreo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV66Barcodpar = httpContext.cgiGet( sPrefix+"wcpOAV66Barcodpar") ;
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
         Gxuitabspanel_tabs_Pagecount = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GXUITABSPANEL_TABS_Pagecount"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gxuitabspanel_tabs_Class = httpContext.cgiGet( sPrefix+"GXUITABSPANEL_TABS_Class") ;
         Gxuitabspanel_tabs_Historymanagement = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GXUITABSPANEL_TABS_Historymanagement")) ;
         Ddo_grid_Caption = httpContext.cgiGet( sPrefix+"DDO_GRID_Caption") ;
         Ddo_grid_Filteredtext_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_set") ;
         Ddo_grid_Filteredtextto_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_set") ;
         Ddo_grid_Selectedvalue_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_set") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Includesortasc = httpContext.cgiGet( sPrefix+"DDO_GRID_Includesortasc") ;
         Ddo_grid_Fixable = httpContext.cgiGet( sPrefix+"DDO_GRID_Fixable") ;
         Ddo_grid_Sortedstatus = httpContext.cgiGet( sPrefix+"DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( sPrefix+"DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( sPrefix+"DDO_GRID_Filtertype") ;
         Ddo_grid_Filterisrange = httpContext.cgiGet( sPrefix+"DDO_GRID_Filterisrange") ;
         Ddo_grid_Includedatalist = httpContext.cgiGet( sPrefix+"DDO_GRID_Includedatalist") ;
         Ddo_grid_Datalisttype = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalisttype") ;
         Ddo_grid_Allowmultipleselection = httpContext.cgiGet( sPrefix+"DDO_GRID_Allowmultipleselection") ;
         Ddo_grid_Datalistfixedvalues = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalistfixedvalues") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalistproc") ;
         Ddo_gridcolumnsselector_Caption = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption") ;
         Ddo_gridcolumnsselector_Tooltip = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip") ;
         Ddo_gridcolumnsselector_Cls = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls") ;
         Ddo_gridcolumnsselector_Dropdownoptionstype = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype") ;
         Ddo_gridcolumnsselector_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname") ;
         Ddo_gridcolumnsselector_Titlecontrolidtoreplace = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascolumnsselector")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedcolumn") ;
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         /* Read variables values. */
         AV67FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67FilterFullText", AV67FilterFullText);
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A130BarCodPar", A130BarCodPar);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_barfasdtiauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_BARFASDTIAUXDATE");
            GX_FocusControl = edtavDdo_barfasdtiauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV39DDO_BarFasDTIAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39DDO_BarFasDTIAuxDate", localUtil.format(AV39DDO_BarFasDTIAuxDate, "99/99/99"));
         }
         else
         {
            AV39DDO_BarFasDTIAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_barfasdtiauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39DDO_BarFasDTIAuxDate", localUtil.format(AV39DDO_BarFasDTIAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_barfasdtfauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_BARFASDTFAUXDATE");
            GX_FocusControl = edtavDdo_barfasdtfauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV44DDO_BarFasDTFAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44DDO_BarFasDTFAuxDate", localUtil.format(AV44DDO_BarFasDTFAuxDate, "99/99/99"));
         }
         else
         {
            AV44DDO_BarFasDTFAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_barfasdtfauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44DDO_BarFasDTFAuxDate", localUtil.format(AV44DDO_BarFasDTFAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"WCFasesHdr");
         A396EmprCod = httpContext.cgiGet( edtEmprCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         forbiddenHiddens.add("EmprCod", GXutil.rtrim( localUtil.format( A396EmprCod, "@!")));
         A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         forbiddenHiddens.add("BarCod", localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"));
         A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         forbiddenHiddens.add("BarCodReo", localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"));
         A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A130BarCodPar", A130BarCodPar);
         forbiddenHiddens.add("BarCodPar", GXutil.rtrim( localUtil.format( A130BarCodPar, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("wcfaseshdr:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV67FilterFullText) != 0 )
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
      e15IW2 ();
      if (returnInSub) return;
   }

   public void e15IW2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV71Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wcfaseshdr_impl.this.GXt_char1 = GXv_char2[0] ;
      AV71Station = GXt_char1 ;
      GXv_char2[0] = AV63Emprcod ;
      GXv_char3[0] = AV72Emprnom ;
      GXv_char4[0] = AV73Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV71Station, GXv_char2, GXv_char3, GXv_char4) ;
      wcfaseshdr_impl.this.AV63Emprcod = GXv_char2[0] ;
      wcfaseshdr_impl.this.AV72Emprnom = GXv_char3[0] ;
      wcfaseshdr_impl.this.AV73Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63Emprcod", AV63Emprcod);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      edtBarCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Visible), 5, 0), true);
      edtBarCodReo_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarCodReo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Visible), 5, 0), true);
      edtBarCodPar_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarCodPar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Visible), 5, 0), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      if ( AV12OrderedBy < 1 )
      {
         AV12OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
      }
      /* Object Property */
      if ( GXutil.len( sPrefix) == 0 )
      {
         bDynCreated_Wcwcmtskgsexpautsindetalle = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcmtskgsexpautsindetalle_Component), GXutil.lower( "WCMtsKgsExpAutsindetalle")) != 0 )
      {
         WebComp_Wcwcmtskgsexpautsindetalle = WebUtils.getWebComponent(getClass(), "app.wcmtskgsexpautsindetalle_impl", remoteHandle, context);
         WebComp_Wcwcmtskgsexpautsindetalle_Component = "WCMtsKgsExpAutsindetalle" ;
      }
      if ( GXutil.len( WebComp_Wcwcmtskgsexpautsindetalle_Component) != 0 )
      {
         WebComp_Wcwcmtskgsexpautsindetalle.setjustcreated();
         WebComp_Wcwcmtskgsexpautsindetalle.componentprepare(new Object[] {sPrefix+"W0069","",A396EmprCod,Integer.valueOf(A129BarCod),Byte.valueOf(A132BarCodReo),A130BarCodPar});
         WebComp_Wcwcmtskgsexpautsindetalle.componentbind(new Object[] {"","","",""});
      }
      /* Object Property */
      if ( GXutil.len( sPrefix) == 0 )
      {
         bDynCreated_Wcwclecturasproduccion = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwclecturasproduccion_Component), GXutil.lower( "WCLecturasProduccion")) != 0 )
      {
         WebComp_Wcwclecturasproduccion = WebUtils.getWebComponent(getClass(), "app.wclecturasproduccion_impl", remoteHandle, context);
         WebComp_Wcwclecturasproduccion_Component = "WCLecturasProduccion" ;
      }
      if ( GXutil.len( WebComp_Wcwclecturasproduccion_Component) != 0 )
      {
         WebComp_Wcwclecturasproduccion.setjustcreated();
         WebComp_Wcwclecturasproduccion.componentprepare(new Object[] {sPrefix+"W0061","",A396EmprCod,Integer.valueOf(A129BarCod),Byte.valueOf(A132BarCodReo),A130BarCodPar});
         WebComp_Wcwclecturasproduccion.componentbind(new Object[] {"","","",""});
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV59DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV59DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      /* Object Property */
      if ( GXutil.len( sPrefix) == 0 )
      {
         bDynCreated_Wcwcmtskgsexpautsindetalle = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcmtskgsexpautsindetalle_Component), GXutil.lower( "WCMtsKgsExpAutsindetalle")) != 0 )
      {
         WebComp_Wcwcmtskgsexpautsindetalle = WebUtils.getWebComponent(getClass(), "app.wcmtskgsexpautsindetalle_impl", remoteHandle, context);
         WebComp_Wcwcmtskgsexpautsindetalle_Component = "WCMtsKgsExpAutsindetalle" ;
      }
      if ( GXutil.len( WebComp_Wcwcmtskgsexpautsindetalle_Component) != 0 )
      {
         WebComp_Wcwcmtskgsexpautsindetalle.setjustcreated();
         WebComp_Wcwcmtskgsexpautsindetalle.componentprepare(new Object[] {sPrefix+"W0069","",AV63Emprcod,Integer.valueOf(AV64Barcod),Byte.valueOf(AV65Barcodreo),AV66Barcodpar});
         WebComp_Wcwcmtskgsexpautsindetalle.componentbind(new Object[] {"","","",""});
      }
      /* Object Property */
      if ( GXutil.len( sPrefix) == 0 )
      {
         bDynCreated_Wcwclecturasproduccion = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwclecturasproduccion_Component), GXutil.lower( "WCLecturasProduccion")) != 0 )
      {
         WebComp_Wcwclecturasproduccion = WebUtils.getWebComponent(getClass(), "app.wclecturasproduccion_impl", remoteHandle, context);
         WebComp_Wcwclecturasproduccion_Component = "WCLecturasProduccion" ;
      }
      if ( GXutil.len( WebComp_Wcwclecturasproduccion_Component) != 0 )
      {
         WebComp_Wcwclecturasproduccion.setjustcreated();
         WebComp_Wcwclecturasproduccion.componentprepare(new Object[] {sPrefix+"W0061","",AV63Emprcod,Integer.valueOf(AV64Barcod),Byte.valueOf(AV65Barcodreo),AV66Barcodpar});
         WebComp_Wcwclecturasproduccion.componentbind(new Object[] {"","","",""});
      }
   }

   public void e16IW2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV6WWPContext = GXv_SdtWWPContext7[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV23Session.getValue("WCFasesHdrColumnsSelector"), "") != 0 )
      {
         AV19ColumnsSelectorXML = AV23Session.getValue("WCFasesHdrColumnsSelector") ;
         AV21ColumnsSelector.fromxml(AV19ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S152 ();
         if (returnInSub) return;
      }
      edtBarOrdLin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarOrdLin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarOrdLin_Visible), 5, 0), !bGXsfl_35_Refreshing);
      edtFasCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFasCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Visible), 5, 0), !bGXsfl_35_Refreshing);
      edtFasDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFasDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Visible), 5, 0), !bGXsfl_35_Refreshing);
      edtMaqCodBis_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMaqCodBis_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCodBis_Visible), 5, 0), !bGXsfl_35_Refreshing);
      edtavMaqdsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMaqdsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqdsc_Visible), 5, 0), !bGXsfl_35_Refreshing);
      edtBarFasDTI_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarFasDTI_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasDTI_Visible), 5, 0), !bGXsfl_35_Refreshing);
      edtBarFasDTF_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarFasDTF_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasDTF_Visible), 5, 0), !bGXsfl_35_Refreshing);
      edtBarTieRea_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarTieRea_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTieRea_Visible), 5, 0), !bGXsfl_35_Refreshing);
      cmbBarFasEst.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbBarFasEst.getInternalname(), "Visible", GXutil.ltrimstr( cmbBarFasEst.getVisible(), 5, 0), !bGXsfl_35_Refreshing);
      edtBarFasKgm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarFasKgm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasKgm_Visible), 5, 0), !bGXsfl_35_Refreshing);
      edtBarFasMtr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarFasMtr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasMtr_Visible), 5, 0), !bGXsfl_35_Refreshing);
      edtavOpenom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavOpenom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOpenom_Visible), 5, 0), !bGXsfl_35_Refreshing);
      AV61GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61GridCurrentPage), 10, 0));
      AV62GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62GridPageCount), 10, 0));
      AV74Wcfaseshdrds_1_emprcod = AV63Emprcod ;
      AV75Wcfaseshdrds_2_barcod = AV64Barcod ;
      AV76Wcfaseshdrds_3_barcodreo = AV65Barcodreo ;
      AV77Wcfaseshdrds_4_barcodpar = AV66Barcodpar ;
      AV78Wcfaseshdrds_5_filterfulltext = AV67FilterFullText ;
      AV79Wcfaseshdrds_6_tfbarordlin = AV25TFBarOrdLin ;
      AV80Wcfaseshdrds_7_tfbarordlin_to = AV26TFBarOrdLin_To ;
      AV81Wcfaseshdrds_8_tffascod = AV28TFFasCod ;
      AV82Wcfaseshdrds_9_tffascod_sel = AV29TFFasCod_Sel ;
      AV83Wcfaseshdrds_10_tffasdsc = AV31TFFasDsc ;
      AV84Wcfaseshdrds_11_tffasdsc_sel = AV32TFFasDsc_Sel ;
      AV85Wcfaseshdrds_12_tfmaqcodbis = AV34TFMaqCodBis ;
      AV86Wcfaseshdrds_13_tfmaqcodbis_sel = AV35TFMaqCodBis_Sel ;
      AV87Wcfaseshdrds_14_tfbarfasdti = AV37TFBarFasDTI ;
      AV88Wcfaseshdrds_15_tfbarfasdtf = AV42TFBarFasDTF ;
      AV89Wcfaseshdrds_16_tfbartierea = AV47TFBarTieRea ;
      AV90Wcfaseshdrds_17_tfbartierea_to = AV48TFBarTieRea_To ;
      AV91Wcfaseshdrds_18_tfbarfasest_sels = AV51TFBarFasEst_Sels ;
      AV92Wcfaseshdrds_19_tfbarfaskgm = AV53TFBarFasKgm ;
      AV93Wcfaseshdrds_20_tfbarfaskgm_to = AV54TFBarFasKgm_To ;
      AV94Wcfaseshdrds_21_tfbarfasmtr = AV56TFBarFasMtr ;
      AV95Wcfaseshdrds_22_tfbarfasmtr_to = AV57TFBarFasMtr_To ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV21ColumnsSelector", AV21ColumnsSelector);
   }

   public void e11IW2( )
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
         AV60PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV60PageToGo) ;
      }
   }

   public void e12IW2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e13IW2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV12OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         AV13OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarOrdLin") == 0 )
         {
            AV25TFBarOrdLin = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25TFBarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25TFBarOrdLin), 4, 0));
            AV26TFBarOrdLin_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFBarOrdLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFBarOrdLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasCod") == 0 )
         {
            AV28TFFasCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFFasCod", AV28TFFasCod);
            AV29TFFasCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFFasCod_Sel", AV29TFFasCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasDsc") == 0 )
         {
            AV31TFFasDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFFasDsc", AV31TFFasDsc);
            AV32TFFasDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFFasDsc_Sel", AV32TFFasDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MaqCodBis") == 0 )
         {
            AV34TFMaqCodBis = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFMaqCodBis", AV34TFMaqCodBis);
            AV35TFMaqCodBis_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFMaqCodBis_Sel", AV35TFMaqCodBis_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFasDTI") == 0 )
         {
            AV37TFBarFasDTI = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFBarFasDTI", localUtil.ttoc( AV37TFBarFasDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFasDTF") == 0 )
         {
            AV42TFBarFasDTF = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFBarFasDTF", localUtil.ttoc( AV42TFBarFasDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarTieRea") == 0 )
         {
            AV47TFBarTieRea = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFBarTieRea", GXutil.ltrimstr( AV47TFBarTieRea, 5, 2));
            AV48TFBarTieRea_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFBarTieRea_To", GXutil.ltrimstr( AV48TFBarTieRea_To, 5, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFasEst") == 0 )
         {
            AV50TFBarFasEst_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFBarFasEst_SelsJson", AV50TFBarFasEst_SelsJson);
            AV51TFBarFasEst_Sels.fromJSonString(GXutil.strReplace( AV50TFBarFasEst_SelsJson, "\"", ""), null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFasKgm") == 0 )
         {
            AV53TFBarFasKgm = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFBarFasKgm", GXutil.ltrimstr( AV53TFBarFasKgm, 9, 2));
            AV54TFBarFasKgm_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFBarFasKgm_To", GXutil.ltrimstr( AV54TFBarFasKgm_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFasMtr") == 0 )
         {
            AV56TFBarFasMtr = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFBarFasMtr", GXutil.ltrimstr( AV56TFBarFasMtr, 9, 2));
            AV57TFBarFasMtr_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFBarFasMtr_To", GXutil.ltrimstr( AV57TFBarFasMtr_To, 9, 2));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV51TFBarFasEst_Sels", AV51TFBarFasEst_Sels);
   }

   private void e17IW2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      GXt_char1 = AV15MaqDsc ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A603MaqCodBis ;
      GXv_char2[0] = GXt_char1 ;
      new app.pmaqdsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      wcfaseshdr_impl.this.A396EmprCod = GXv_char4[0] ;
      wcfaseshdr_impl.this.A603MaqCodBis = GXv_char3[0] ;
      wcfaseshdr_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      AV15MaqDsc = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMaqdsc_Internalname, AV15MaqDsc);
      if ( ( GXutil.strcmp(A6173BarFasSec, httpContext.getMessage( "OR", "")) == 0 ) && ( A148BarEstReo == 1 ) )
      {
         GXt_char1 = AV16OpeNom ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A934BarReoCod ;
         GXv_int9[0] = A936BarReoReo ;
         GXv_char3[0] = A935BarReoPar ;
         GXv_int10[0] = A194BarOrdLin ;
         GXv_char2[0] = GXt_char1 ;
         new app.pjln001(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int9, GXv_char3, GXv_int10, GXv_char2) ;
         wcfaseshdr_impl.this.A396EmprCod = GXv_char4[0] ;
         wcfaseshdr_impl.this.A934BarReoCod = GXv_int8[0] ;
         wcfaseshdr_impl.this.A936BarReoReo = GXv_int9[0] ;
         wcfaseshdr_impl.this.A935BarReoPar = GXv_char3[0] ;
         wcfaseshdr_impl.this.A194BarOrdLin = GXv_int10[0] ;
         wcfaseshdr_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A934BarReoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A934BarReoCod), 8, 0));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A936BarReoReo", GXutil.str( A936BarReoReo, 1, 0));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A935BarReoPar", A935BarReoPar);
         AV16OpeNom = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOpenom_Internalname, AV16OpeNom);
      }
      else
      {
         GXt_char1 = AV16OpeNom ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A129BarCod ;
         GXv_int9[0] = A132BarCodReo ;
         GXv_char3[0] = A130BarCodPar ;
         GXv_int10[0] = A194BarOrdLin ;
         GXv_char2[0] = GXt_char1 ;
         new app.pjln001(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int9, GXv_char3, GXv_int10, GXv_char2) ;
         wcfaseshdr_impl.this.A396EmprCod = GXv_char4[0] ;
         wcfaseshdr_impl.this.A129BarCod = GXv_int8[0] ;
         wcfaseshdr_impl.this.A132BarCodReo = GXv_int9[0] ;
         wcfaseshdr_impl.this.A130BarCodPar = GXv_char3[0] ;
         wcfaseshdr_impl.this.A194BarOrdLin = GXv_int10[0] ;
         wcfaseshdr_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A130BarCodPar", A130BarCodPar);
         AV16OpeNom = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOpenom_Internalname, AV16OpeNom);
      }
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
      /*  Sending Event outputs  */
   }

   public void e14IW2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV19ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV21ColumnsSelector.fromJSonString(AV19ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "WCFasesHdrColumnsSelector", ((GXutil.strcmp("", AV19ColumnsSelectorXML)==0) ? "" : AV21ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV21ColumnsSelector", AV21ColumnsSelector);
   }

   public void S132( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV12OrderedBy, 4, 0))+":"+(AV13OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S152( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV21ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector11[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "BarOrdLin", "", "Orden", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "FasCod", "", "Codigo Fase", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "FasDsc", "", "Descripcion de Fase", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "MaqCodBis", "", "Maquina", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "&MaqDsc", "", "Descripcion ", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "BarFasDTI", "", "Inicio", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "BarFasDTF", "", "Fin", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "BarTieRea", "", "HhMm", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "BarFasEst", "", "E", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "BarFasKgm", "", "kgs", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "BarFasMtr", "", "mts", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "&OpeNom", "", "Ult Operario", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXt_char1 = AV20UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCFasesHdrColumnsSelector", GXv_char4) ;
      wcfaseshdr_impl.this.GXt_char1 = GXv_char4[0] ;
      AV20UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV20UserCustomValue)==0) ) )
      {
         AV22ColumnsSelectorAux.fromxml(AV20UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector11[0] = AV22ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector12[0] = AV21ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, GXv_SdtWWPColumnsSelector12) ;
         AV22ColumnsSelectorAux = GXv_SdtWWPColumnsSelector11[0] ;
         AV21ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      }
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV23Session.getValue(AV96Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV96Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV23Session.getValue(AV96Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S132 ();
      if (returnInSub) return;
      AV97GXV1 = 1 ;
      while ( AV97GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV97GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV67FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67FilterFullText", AV67FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARORDLIN") == 0 )
         {
            AV25TFBarOrdLin = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25TFBarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25TFBarOrdLin), 4, 0));
            AV26TFBarOrdLin_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFBarOrdLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFBarOrdLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD") == 0 )
         {
            AV28TFFasCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFFasCod", AV28TFFasCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD_SEL") == 0 )
         {
            AV29TFFasCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFFasCod_Sel", AV29TFFasCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC") == 0 )
         {
            AV31TFFasDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFFasDsc", AV31TFFasDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC_SEL") == 0 )
         {
            AV32TFFasDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFFasDsc_Sel", AV32TFFasDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODBIS") == 0 )
         {
            AV34TFMaqCodBis = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFMaqCodBis", AV34TFMaqCodBis);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODBIS_SEL") == 0 )
         {
            AV35TFMaqCodBis_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFMaqCodBis_Sel", AV35TFMaqCodBis_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASDTI") == 0 )
         {
            AV37TFBarFasDTI = localUtil.ctot( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFBarFasDTI", localUtil.ttoc( AV37TFBarFasDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV39DDO_BarFasDTIAuxDate = GXutil.resetTime(AV37TFBarFasDTI) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39DDO_BarFasDTIAuxDate", localUtil.format(AV39DDO_BarFasDTIAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASDTF") == 0 )
         {
            AV42TFBarFasDTF = localUtil.ctot( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFBarFasDTF", localUtil.ttoc( AV42TFBarFasDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV44DDO_BarFasDTFAuxDate = GXutil.resetTime(AV42TFBarFasDTF) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44DDO_BarFasDTFAuxDate", localUtil.format(AV44DDO_BarFasDTFAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIEREA") == 0 )
         {
            AV47TFBarTieRea = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFBarTieRea", GXutil.ltrimstr( AV47TFBarTieRea, 5, 2));
            AV48TFBarTieRea_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFBarTieRea_To", GXutil.ltrimstr( AV48TFBarTieRea_To, 5, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASEST_SEL") == 0 )
         {
            AV50TFBarFasEst_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFBarFasEst_SelsJson", AV50TFBarFasEst_SelsJson);
            AV51TFBarFasEst_Sels.fromJSonString(AV50TFBarFasEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASKGM") == 0 )
         {
            AV53TFBarFasKgm = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFBarFasKgm", GXutil.ltrimstr( AV53TFBarFasKgm, 9, 2));
            AV54TFBarFasKgm_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFBarFasKgm_To", GXutil.ltrimstr( AV54TFBarFasKgm_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASMTR") == 0 )
         {
            AV56TFBarFasMtr = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFBarFasMtr", GXutil.ltrimstr( AV56TFBarFasMtr, 9, 2));
            AV57TFBarFasMtr_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFBarFasMtr_To", GXutil.ltrimstr( AV57TFBarFasMtr_To, 9, 2));
         }
         AV97GXV1 = (int)(AV97GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV29TFFasCod_Sel)==0), AV29TFFasCod_Sel, GXv_char4) ;
      wcfaseshdr_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char13 = "" ;
      GXv_char3[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV32TFFasDsc_Sel)==0), AV32TFFasDsc_Sel, GXv_char3) ;
      wcfaseshdr_impl.this.GXt_char13 = GXv_char3[0] ;
      GXt_char14 = "" ;
      GXv_char2[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV35TFMaqCodBis_Sel)==0), AV35TFMaqCodBis_Sel, GXv_char2) ;
      wcfaseshdr_impl.this.GXt_char14 = GXv_char2[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|"+GXt_char13+"|"+GXt_char14+"|||||"+((AV51TFBarFasEst_Sels.size()==0) ? "" : AV50TFBarFasEst_SelsJson)+"|||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char14 = "" ;
      GXv_char4[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV28TFFasCod)==0), AV28TFFasCod, GXv_char4) ;
      wcfaseshdr_impl.this.GXt_char14 = GXv_char4[0] ;
      GXt_char13 = "" ;
      GXv_char3[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV31TFFasDsc)==0), AV31TFFasDsc, GXv_char3) ;
      wcfaseshdr_impl.this.GXt_char13 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV34TFMaqCodBis)==0), AV34TFMaqCodBis, GXv_char2) ;
      wcfaseshdr_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV25TFBarOrdLin) ? "" : GXutil.str( AV25TFBarOrdLin, 4, 0))+"|"+GXt_char14+"|"+GXt_char13+"|"+GXt_char1+"||"+(GXutil.dateCompare(GXutil.nullDate(), AV37TFBarFasDTI) ? "" : localUtil.dtoc( AV39DDO_BarFasDTIAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV42TFBarFasDTF) ? "" : localUtil.dtoc( AV44DDO_BarFasDTFAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV47TFBarTieRea)==0) ? "" : GXutil.str( AV47TFBarTieRea, 5, 2))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFBarFasKgm)==0) ? "" : GXutil.str( AV53TFBarFasKgm, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV56TFBarFasMtr)==0) ? "" : GXutil.str( AV56TFBarFasMtr, 9, 2))+"|" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV26TFBarOrdLin_To) ? "" : GXutil.str( AV26TFBarOrdLin_To, 4, 0))+"|||||||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV48TFBarTieRea_To)==0) ? "" : GXutil.str( AV48TFBarTieRea_To, 5, 2))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV54TFBarFasKgm_To)==0) ? "" : GXutil.str( AV54TFBarFasKgm_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV57TFBarFasMtr_To)==0) ? "" : GXutil.str( AV57TFBarFasMtr_To, 9, 2))+"|" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S142( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV23Session.getValue(AV96Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState15[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState15, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV67FilterFullText)==0), (short)(0), AV67FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState15[0] ;
      GXv_SdtWWPGridState15[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState15, "TFBARORDLIN", "", !((0==AV25TFBarOrdLin)&&(0==AV26TFBarOrdLin_To)), (short)(0), GXutil.trim( GXutil.str( AV25TFBarOrdLin, 4, 0)), GXutil.trim( GXutil.str( AV26TFBarOrdLin_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState15[0] ;
      GXv_SdtWWPGridState15[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState15, "TFFASCOD", "", !(GXutil.strcmp("", AV28TFFasCod)==0), (short)(0), AV28TFFasCod, "", !(GXutil.strcmp("", AV29TFFasCod_Sel)==0), AV29TFFasCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState15[0] ;
      GXv_SdtWWPGridState15[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState15, "TFFASDSC", "", !(GXutil.strcmp("", AV31TFFasDsc)==0), (short)(0), AV31TFFasDsc, "", !(GXutil.strcmp("", AV32TFFasDsc_Sel)==0), AV32TFFasDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState15[0] ;
      GXv_SdtWWPGridState15[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState15, "TFMAQCODBIS", "", !(GXutil.strcmp("", AV34TFMaqCodBis)==0), (short)(0), AV34TFMaqCodBis, "", !(GXutil.strcmp("", AV35TFMaqCodBis_Sel)==0), AV35TFMaqCodBis_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState15[0] ;
      GXv_SdtWWPGridState15[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState15, "TFBARFASDTI", "", !GXutil.dateCompare(GXutil.nullDate(), AV37TFBarFasDTI), (short)(0), GXutil.trim( localUtil.ttoc( AV37TFBarFasDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV10GridState = GXv_SdtWWPGridState15[0] ;
      GXv_SdtWWPGridState15[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState15, "TFBARFASDTF", "", !GXutil.dateCompare(GXutil.nullDate(), AV42TFBarFasDTF), (short)(0), GXutil.trim( localUtil.ttoc( AV42TFBarFasDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV10GridState = GXv_SdtWWPGridState15[0] ;
      GXv_SdtWWPGridState15[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState15, "TFBARTIEREA", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV47TFBarTieRea)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV48TFBarTieRea_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV47TFBarTieRea, 5, 2)), GXutil.trim( GXutil.str( AV48TFBarTieRea_To, 5, 2))) ;
      AV10GridState = GXv_SdtWWPGridState15[0] ;
      GXv_SdtWWPGridState15[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState15, "TFBARFASEST_SEL", "", !(AV51TFBarFasEst_Sels.size()==0), (short)(0), AV51TFBarFasEst_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState15[0] ;
      GXv_SdtWWPGridState15[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState15, "TFBARFASKGM", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFBarFasKgm)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV54TFBarFasKgm_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV53TFBarFasKgm, 9, 2)), GXutil.trim( GXutil.str( AV54TFBarFasKgm_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState15[0] ;
      GXv_SdtWWPGridState15[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState15, "TFBARFASMTR", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV56TFBarFasMtr)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV57TFBarFasMtr_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV56TFBarFasMtr, 9, 2)), GXutil.trim( GXutil.str( AV57TFBarFasMtr_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState15[0] ;
      if ( ! (GXutil.strcmp("", AV63Emprcod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV63Emprcod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV64Barcod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV64Barcod, 8, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV65Barcodreo) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODREO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV65Barcodreo, 1, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV66Barcodpar)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODPAR" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV66Barcodpar );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV96Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV96Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TBARFAS" );
      AV9TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "Emprcod" );
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( AV63Emprcod );
      AV8TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV9TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "Barcod" );
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( GXutil.str( AV64Barcod, 8, 0) );
      AV8TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV9TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "Barcodreo" );
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( GXutil.str( AV65Barcodreo, 1, 0) );
      AV8TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV9TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "Barcodpar" );
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( AV66Barcodpar );
      AV8TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV23Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_19_IW2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablerightheader_Internalname, tblTablerightheader_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_22_IW2( true) ;
      }
      else
      {
         wb_table2_22_IW2( false) ;
      }
      return  ;
   }

   public void wb_table2_22_IW2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_19_IW2e( true) ;
      }
      else
      {
         wb_table1_19_IW2e( false) ;
      }
   }

   public void wb_table2_22_IW2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'" + sPrefix + "',false,'" + sGXsfl_35_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV67FilterFullText, GXutil.rtrim( localUtil.format( AV67FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_WCFasesHdr.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_22_IW2e( true) ;
      }
      else
      {
         wb_table2_22_IW2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV63Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63Emprcod", AV63Emprcod);
      AV64Barcod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64Barcod), 8, 0));
      AV65Barcodreo = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65Barcodreo", GXutil.str( AV65Barcodreo, 1, 0));
      AV66Barcodpar = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66Barcodpar", AV66Barcodpar);
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
      paIW2( ) ;
      wsIW2( ) ;
      weIW2( ) ;
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
      sCtrlAV63Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV64Barcod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV65Barcodreo = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV66Barcodpar = (String)getParm(obj,3,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      paIW2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "wcfaseshdr", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      paIW2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV63Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63Emprcod", AV63Emprcod);
         AV64Barcod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64Barcod), 8, 0));
         AV65Barcodreo = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65Barcodreo", GXutil.str( AV65Barcodreo, 1, 0));
         AV66Barcodpar = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66Barcodpar", AV66Barcodpar);
      }
      wcpOAV63Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV63Emprcod") ;
      wcpOAV64Barcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV64Barcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV65Barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV65Barcodreo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV66Barcodpar = httpContext.cgiGet( sPrefix+"wcpOAV66Barcodpar") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV63Emprcod, wcpOAV63Emprcod) != 0 ) || ( AV64Barcod != wcpOAV64Barcod ) || ( AV65Barcodreo != wcpOAV65Barcodreo ) || ( GXutil.strcmp(AV66Barcodpar, wcpOAV66Barcodpar) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV63Emprcod = AV63Emprcod ;
      wcpOAV64Barcod = AV64Barcod ;
      wcpOAV65Barcodreo = AV65Barcodreo ;
      wcpOAV66Barcodpar = AV66Barcodpar ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV63Emprcod = httpContext.cgiGet( sPrefix+"AV63Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV63Emprcod) > 0 )
      {
         AV63Emprcod = httpContext.cgiGet( sCtrlAV63Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63Emprcod", AV63Emprcod);
      }
      else
      {
         AV63Emprcod = httpContext.cgiGet( sPrefix+"AV63Emprcod_PARM") ;
      }
      sCtrlAV64Barcod = httpContext.cgiGet( sPrefix+"AV64Barcod_CTRL") ;
      if ( GXutil.len( sCtrlAV64Barcod) > 0 )
      {
         AV64Barcod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV64Barcod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64Barcod), 8, 0));
      }
      else
      {
         AV64Barcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV64Barcod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV65Barcodreo = httpContext.cgiGet( sPrefix+"AV65Barcodreo_CTRL") ;
      if ( GXutil.len( sCtrlAV65Barcodreo) > 0 )
      {
         AV65Barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV65Barcodreo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65Barcodreo", GXutil.str( AV65Barcodreo, 1, 0));
      }
      else
      {
         AV65Barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV65Barcodreo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV66Barcodpar = httpContext.cgiGet( sPrefix+"AV66Barcodpar_CTRL") ;
      if ( GXutil.len( sCtrlAV66Barcodpar) > 0 )
      {
         AV66Barcodpar = httpContext.cgiGet( sCtrlAV66Barcodpar) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66Barcodpar", AV66Barcodpar);
      }
      else
      {
         AV66Barcodpar = httpContext.cgiGet( sPrefix+"AV66Barcodpar_PARM") ;
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
      paIW2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      wsIW2( ) ;
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
      wsIW2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV63Emprcod_PARM", GXutil.rtrim( AV63Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV63Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV63Emprcod_CTRL", GXutil.rtrim( sCtrlAV63Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV64Barcod_PARM", GXutil.ltrim( localUtil.ntoc( AV64Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV64Barcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV64Barcod_CTRL", GXutil.rtrim( sCtrlAV64Barcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV65Barcodreo_PARM", GXutil.ltrim( localUtil.ntoc( AV65Barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV65Barcodreo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV65Barcodreo_CTRL", GXutil.rtrim( sCtrlAV65Barcodreo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV66Barcodpar_PARM", GXutil.rtrim( AV66Barcodpar));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV66Barcodpar)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV66Barcodpar_CTRL", GXutil.rtrim( sCtrlAV66Barcodpar));
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
      weIW2( ) ;
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
      if ( ! ( WebComp_Wcwclecturasproduccion == null ) )
      {
         WebComp_Wcwclecturasproduccion.componentjscripts();
      }
      if ( ! ( WebComp_Wcwcmtskgsexpautsindetalle == null ) )
      {
         WebComp_Wcwcmtskgsexpautsindetalle.componentjscripts();
      }
   }

   public void componentthemes( )
   {
      define_styles( ) ;
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("DVelop/DVPaginationBar/DVPaginationBar.css", "");
      httpContext.AddStyleSheetFile("calendar-system.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      if ( ! ( WebComp_Wcwclecturasproduccion == null ) )
      {
         if ( GXutil.len( WebComp_Wcwclecturasproduccion_Component) != 0 )
         {
            WebComp_Wcwclecturasproduccion.componentthemes();
         }
      }
      if ( ! ( WebComp_Wcwcmtskgsexpautsindetalle == null ) )
      {
         if ( GXutil.len( WebComp_Wcwcmtskgsexpautsindetalle_Component) != 0 )
         {
            WebComp_Wcwcmtskgsexpautsindetalle.componentthemes();
         }
      }
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211556567", true, true);
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
      httpContext.AddJavascriptSource("wcfaseshdr.js", "?20268211556567", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManager.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/json2005.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/rsh.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManagerCreate.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
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
      edtBarOrdLin_Internalname = sPrefix+"BARORDLIN_"+sGXsfl_35_idx ;
      edtFasCod_Internalname = sPrefix+"FASCOD_"+sGXsfl_35_idx ;
      edtFasDsc_Internalname = sPrefix+"FASDSC_"+sGXsfl_35_idx ;
      edtMaqCodBis_Internalname = sPrefix+"MAQCODBIS_"+sGXsfl_35_idx ;
      edtavMaqdsc_Internalname = sPrefix+"vMAQDSC_"+sGXsfl_35_idx ;
      edtBarFasDTI_Internalname = sPrefix+"BARFASDTI_"+sGXsfl_35_idx ;
      edtBarFasDTF_Internalname = sPrefix+"BARFASDTF_"+sGXsfl_35_idx ;
      edtBarTieRea_Internalname = sPrefix+"BARTIEREA_"+sGXsfl_35_idx ;
      cmbBarFasEst.setInternalname( sPrefix+"BARFASEST_"+sGXsfl_35_idx );
      edtBarFasKgm_Internalname = sPrefix+"BARFASKGM_"+sGXsfl_35_idx ;
      edtBarFasMtr_Internalname = sPrefix+"BARFASMTR_"+sGXsfl_35_idx ;
      edtavOpenom_Internalname = sPrefix+"vOPENOM_"+sGXsfl_35_idx ;
   }

   public void subsflControlProps_fel_352( )
   {
      edtBarOrdLin_Internalname = sPrefix+"BARORDLIN_"+sGXsfl_35_fel_idx ;
      edtFasCod_Internalname = sPrefix+"FASCOD_"+sGXsfl_35_fel_idx ;
      edtFasDsc_Internalname = sPrefix+"FASDSC_"+sGXsfl_35_fel_idx ;
      edtMaqCodBis_Internalname = sPrefix+"MAQCODBIS_"+sGXsfl_35_fel_idx ;
      edtavMaqdsc_Internalname = sPrefix+"vMAQDSC_"+sGXsfl_35_fel_idx ;
      edtBarFasDTI_Internalname = sPrefix+"BARFASDTI_"+sGXsfl_35_fel_idx ;
      edtBarFasDTF_Internalname = sPrefix+"BARFASDTF_"+sGXsfl_35_fel_idx ;
      edtBarTieRea_Internalname = sPrefix+"BARTIEREA_"+sGXsfl_35_fel_idx ;
      cmbBarFasEst.setInternalname( sPrefix+"BARFASEST_"+sGXsfl_35_fel_idx );
      edtBarFasKgm_Internalname = sPrefix+"BARFASKGM_"+sGXsfl_35_fel_idx ;
      edtBarFasMtr_Internalname = sPrefix+"BARFASMTR_"+sGXsfl_35_fel_idx ;
      edtavOpenom_Internalname = sPrefix+"vOPENOM_"+sGXsfl_35_fel_idx ;
   }

   public void sendrow_352( )
   {
      subsflControlProps_352( ) ;
      wbIW0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_35_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_35_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarOrdLin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarOrdLin_Internalname,GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarOrdLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarOrdLin_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtFasCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasCod_Internalname,GXutil.rtrim( A457FasCod),GXutil.rtrim( localUtil.format( A457FasCod, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtFasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtFasCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtFasDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasDsc_Internalname,GXutil.rtrim( A460FasDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtFasDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtFasDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMaqCodBis_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqCodBis_Internalname,GXutil.rtrim( A603MaqCodBis),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMaqCodBis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMaqCodBis_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavMaqdsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqdsc_Internalname,GXutil.rtrim( AV15MaqDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavMaqdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavMaqdsc_Visible),Integer.valueOf(edtavMaqdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarFasDTI_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasDTI_Internalname,localUtil.ttoc( A4442BarFasDTI, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A4442BarFasDTI, "99/99/99 99:99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFasDTI_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarFasDTI_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarFasDTF_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasDTF_Internalname,localUtil.ttoc( A4443BarFasDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A4443BarFasDTF, "99/99/99 99:99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFasDTF_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarFasDTF_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarTieRea_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTieRea_Internalname,GXutil.ltrim( localUtil.ntoc( A215BarTieRea, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A215BarTieRea, "Z9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarTieRea_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarTieRea_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((cmbBarFasEst.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbBarFasEst.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "BARFASEST_" + sGXsfl_35_idx ;
            cmbBarFasEst.setName( GXCCtl );
            cmbBarFasEst.setWebtags( "" );
            cmbBarFasEst.addItem("0", httpContext.getMessage( "Pendiente", ""), (short)(0));
            cmbBarFasEst.addItem("1", httpContext.getMessage( "En Proceso", ""), (short)(0));
            cmbBarFasEst.addItem("2", httpContext.getMessage( "Finalizada", ""), (short)(0));
            if ( cmbBarFasEst.getItemCount() > 0 )
            {
               A153BarFasEst = (byte)(GXutil.lval( cmbBarFasEst.getValidValue(GXutil.trim( GXutil.str( A153BarFasEst, 1, 0))))) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbBarFasEst,cmbBarFasEst.getInternalname(),GXutil.trim( GXutil.str( A153BarFasEst, 1, 0)),Integer.valueOf(1),cmbBarFasEst.getJsonclick(),Integer.valueOf(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(cmbBarFasEst.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbBarFasEst.setValue( GXutil.trim( GXutil.str( A153BarFasEst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbBarFasEst.getInternalname(), "Values", cmbBarFasEst.ToJavascriptSource(), !bGXsfl_35_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarFasKgm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A3837BarFasKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A3837BarFasKgm, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFasKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarFasKgm_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarFasMtr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A3838BarFasMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A3838BarFasMtr, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFasMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarFasMtr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavOpenom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavOpenom_Internalname,GXutil.rtrim( AV16OpeNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavOpenom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavOpenom_Visible),Integer.valueOf(edtavOpenom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashesIW2( ) ;
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
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"35\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarOrdLin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Orden", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtFasCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtFasDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion de Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMaqCodBis_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavMaqdsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion ", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarFasDTI_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Inicio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarFasDTF_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fin", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarTieRea_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "HhMm", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbBarFasEst.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "E", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarFasKgm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "kgs", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarFasMtr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "mts", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavOpenom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ult Operario", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarOrdLin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A457FasCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtFasCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A460FasDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A603MaqCodBis));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMaqCodBis_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV15MaqDsc));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavMaqdsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A4442BarFasDTI, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarFasDTI_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A4443BarFasDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarFasDTF_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A215BarTieRea, (byte)(5), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarTieRea_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A153BarFasEst, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbBarFasEst.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3837BarFasKgm, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarFasKgm_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3838BarFasMtr, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarFasMtr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV16OpeNom));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavOpenom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavOpenom_Visible, (byte)(5), (byte)(0), ".", "")));
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
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtBarOrdLin_Internalname = sPrefix+"BARORDLIN" ;
      edtFasCod_Internalname = sPrefix+"FASCOD" ;
      edtFasDsc_Internalname = sPrefix+"FASDSC" ;
      edtMaqCodBis_Internalname = sPrefix+"MAQCODBIS" ;
      edtavMaqdsc_Internalname = sPrefix+"vMAQDSC" ;
      edtBarFasDTI_Internalname = sPrefix+"BARFASDTI" ;
      edtBarFasDTF_Internalname = sPrefix+"BARFASDTF" ;
      edtBarTieRea_Internalname = sPrefix+"BARTIEREA" ;
      cmbBarFasEst.setInternalname( sPrefix+"BARFASEST" );
      edtBarFasKgm_Internalname = sPrefix+"BARFASKGM" ;
      edtBarFasMtr_Internalname = sPrefix+"BARFASMTR" ;
      edtavOpenom_Internalname = sPrefix+"vOPENOM" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      lblProduccion_title_Internalname = sPrefix+"PRODUCCION_TITLE" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      lblPiezas_title_Internalname = sPrefix+"PIEZAS_TITLE" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      Gxuitabspanel_tabs_Internalname = sPrefix+"GXUITABSPANEL_TABS" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      edtEmprCod_Internalname = sPrefix+"EMPRCOD" ;
      edtBarCod_Internalname = sPrefix+"BARCOD" ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO" ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      edtavDdo_barfasdtiauxdate_Internalname = sPrefix+"vDDO_BARFASDTIAUXDATE" ;
      divDdo_barfasdtiauxdates_Internalname = sPrefix+"DDO_BARFASDTIAUXDATES" ;
      edtavDdo_barfasdtfauxdate_Internalname = sPrefix+"vDDO_BARFASDTFAUXDATE" ;
      divDdo_barfasdtfauxdates_Internalname = sPrefix+"DDO_BARFASDTFAUXDATES" ;
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
      edtavOpenom_Jsonclick = "" ;
      edtavOpenom_Enabled = 0 ;
      edtBarFasMtr_Jsonclick = "" ;
      edtBarFasKgm_Jsonclick = "" ;
      cmbBarFasEst.setJsonclick( "" );
      edtBarTieRea_Jsonclick = "" ;
      edtBarFasDTF_Jsonclick = "" ;
      edtBarFasDTI_Jsonclick = "" ;
      edtavMaqdsc_Jsonclick = "" ;
      edtavMaqdsc_Enabled = 0 ;
      edtMaqCodBis_Jsonclick = "" ;
      edtFasDsc_Jsonclick = "" ;
      edtFasCod_Jsonclick = "" ;
      edtBarOrdLin_Jsonclick = "" ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavOpenom_Visible = -1 ;
      edtBarFasMtr_Visible = -1 ;
      edtBarFasKgm_Visible = -1 ;
      cmbBarFasEst.setVisible( -1 );
      edtBarTieRea_Visible = -1 ;
      edtBarFasDTF_Visible = -1 ;
      edtBarFasDTI_Visible = -1 ;
      edtavMaqdsc_Visible = -1 ;
      edtMaqCodBis_Visible = -1 ;
      edtFasDsc_Visible = -1 ;
      edtFasCod_Visible = -1 ;
      edtBarOrdLin_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_barfasdtfauxdate_Jsonclick = "" ;
      edtavDdo_barfasdtiauxdate_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Visible = 1 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Visible = 1 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Visible = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Visible = 1 ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "WCFasesHdrGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "||||||||0:Pendiente,1:En Proceso,2:Finalizada|||" ;
      Ddo_grid_Allowmultipleselection = "||||||||T|||" ;
      Ddo_grid_Datalisttype = "|Dynamic|Dynamic|Dynamic|||||FixedValues|||" ;
      Ddo_grid_Includedatalist = "|T|T|T|||||T|||" ;
      Ddo_grid_Filterisrange = "T|||||||T||T|T|" ;
      Ddo_grid_Filtertype = "Numeric|Character|Character|Character||Date|Date|Numeric||Numeric|Numeric|" ;
      Ddo_grid_Includefilter = "T|T|T|T||T|T|T||T|T|" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T|T|T||T|T|T|T|T|T|" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4||5|6|7|8|9|10|" ;
      Ddo_grid_Columnids = "0:BarOrdLin|1:FasCod|2:FasDsc|3:MaqCodBis|4:MaqDsc|5:BarFasDTI|6:BarFasDTF|7:BarTieRea|8:BarFasEst|9:BarFasKgm|10:BarFasMtr|11:OpeNom" ;
      Ddo_grid_Gridinternalname = "" ;
      Gxuitabspanel_tabs_Historymanagement = GXutil.toBoolean( 0) ;
      Gxuitabspanel_tabs_Class = "" ;
      Gxuitabspanel_tabs_Pagecount = 2 ;
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
      GXCCtl = "BARFASEST_" + sGXsfl_35_idx ;
      cmbBarFasEst.setName( GXCCtl );
      cmbBarFasEst.setWebtags( "" );
      cmbBarFasEst.addItem("0", httpContext.getMessage( "Pendiente", ""), (short)(0));
      cmbBarFasEst.addItem("1", httpContext.getMessage( "En Proceso", ""), (short)(0));
      cmbBarFasEst.addItem("2", httpContext.getMessage( "Finalizada", ""), (short)(0));
      if ( cmbBarFasEst.getItemCount() > 0 )
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A603MaqCodBis',fld:'MAQCODBIS',pic:''},{av:'A6173BarFasSec',fld:'BARFASSEC',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV74Wcfaseshdrds_1_emprcod',fld:'vWCFASESHDRDS_1_EMPRCOD',pic:'@!'},{av:'AV75Wcfaseshdrds_2_barcod',fld:'vWCFASESHDRDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV76Wcfaseshdrds_3_barcodreo',fld:'vWCFASESHDRDS_3_BARCODREO',pic:'9'},{av:'AV77Wcfaseshdrds_4_barcodpar',fld:'vWCFASESHDRDS_4_BARCODPAR',pic:''},{av:'sPrefix'},{av:'AV21ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV67FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV63Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV64Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV65Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV66Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV25TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV26TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV28TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV29TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV31TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV32TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV34TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV35TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'AV37TFBarFasDTI',fld:'vTFBARFASDTI',pic:'99/99/99 99:99:99'},{av:'AV42TFBarFasDTF',fld:'vTFBARFASDTF',pic:'99/99/99 99:99:99'},{av:'AV47TFBarTieRea',fld:'vTFBARTIEREA',pic:'Z9.99'},{av:'AV48TFBarTieRea_To',fld:'vTFBARTIEREA_TO',pic:'Z9.99'},{av:'AV51TFBarFasEst_Sels',fld:'vTFBARFASEST_SELS',pic:''},{av:'AV53TFBarFasKgm',fld:'vTFBARFASKGM',pic:'ZZZZZ9.99'},{av:'AV54TFBarFasKgm_To',fld:'vTFBARFASKGM_TO',pic:'ZZZZZ9.99'},{av:'AV56TFBarFasMtr',fld:'vTFBARFASMTR',pic:'ZZZZZ9.99'},{av:'AV57TFBarFasMtr_To',fld:'vTFBARFASMTR_TO',pic:'ZZZZZ9.99'},{av:'AV96Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV21ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtBarOrdLin_Visible',ctrl:'BARORDLIN',prop:'Visible'},{av:'edtFasCod_Visible',ctrl:'FASCOD',prop:'Visible'},{av:'edtFasDsc_Visible',ctrl:'FASDSC',prop:'Visible'},{av:'edtMaqCodBis_Visible',ctrl:'MAQCODBIS',prop:'Visible'},{av:'edtavMaqdsc_Visible',ctrl:'vMAQDSC',prop:'Visible'},{av:'edtBarFasDTI_Visible',ctrl:'BARFASDTI',prop:'Visible'},{av:'edtBarFasDTF_Visible',ctrl:'BARFASDTF',prop:'Visible'},{av:'edtBarTieRea_Visible',ctrl:'BARTIEREA',prop:'Visible'},{av:'cmbBarFasEst'},{av:'edtBarFasKgm_Visible',ctrl:'BARFASKGM',prop:'Visible'},{av:'edtBarFasMtr_Visible',ctrl:'BARFASMTR',prop:'Visible'},{av:'edtavOpenom_Visible',ctrl:'vOPENOM',prop:'Visible'},{av:'AV61GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV62GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e11IW2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV67FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV63Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV64Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV65Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV66Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV21ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV26TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV28TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV29TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV31TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV32TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV34TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV35TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'AV37TFBarFasDTI',fld:'vTFBARFASDTI',pic:'99/99/99 99:99:99'},{av:'AV42TFBarFasDTF',fld:'vTFBARFASDTF',pic:'99/99/99 99:99:99'},{av:'AV47TFBarTieRea',fld:'vTFBARTIEREA',pic:'Z9.99'},{av:'AV48TFBarTieRea_To',fld:'vTFBARTIEREA_TO',pic:'Z9.99'},{av:'AV51TFBarFasEst_Sels',fld:'vTFBARFASEST_SELS',pic:''},{av:'AV53TFBarFasKgm',fld:'vTFBARFASKGM',pic:'ZZZZZ9.99'},{av:'AV54TFBarFasKgm_To',fld:'vTFBARFASKGM_TO',pic:'ZZZZZ9.99'},{av:'AV56TFBarFasMtr',fld:'vTFBARFASMTR',pic:'ZZZZZ9.99'},{av:'AV57TFBarFasMtr_To',fld:'vTFBARFASMTR_TO',pic:'ZZZZZ9.99'},{av:'AV96Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A603MaqCodBis',fld:'MAQCODBIS',pic:''},{av:'A6173BarFasSec',fld:'BARFASSEC',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV74Wcfaseshdrds_1_emprcod',fld:'vWCFASESHDRDS_1_EMPRCOD',pic:'@!'},{av:'AV75Wcfaseshdrds_2_barcod',fld:'vWCFASESHDRDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV76Wcfaseshdrds_3_barcodreo',fld:'vWCFASESHDRDS_3_BARCODREO',pic:'9'},{av:'AV77Wcfaseshdrds_4_barcodpar',fld:'vWCFASESHDRDS_4_BARCODPAR',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e12IW2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV67FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV63Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV64Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV65Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV66Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV21ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV26TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV28TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV29TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV31TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV32TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV34TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV35TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'AV37TFBarFasDTI',fld:'vTFBARFASDTI',pic:'99/99/99 99:99:99'},{av:'AV42TFBarFasDTF',fld:'vTFBARFASDTF',pic:'99/99/99 99:99:99'},{av:'AV47TFBarTieRea',fld:'vTFBARTIEREA',pic:'Z9.99'},{av:'AV48TFBarTieRea_To',fld:'vTFBARTIEREA_TO',pic:'Z9.99'},{av:'AV51TFBarFasEst_Sels',fld:'vTFBARFASEST_SELS',pic:''},{av:'AV53TFBarFasKgm',fld:'vTFBARFASKGM',pic:'ZZZZZ9.99'},{av:'AV54TFBarFasKgm_To',fld:'vTFBARFASKGM_TO',pic:'ZZZZZ9.99'},{av:'AV56TFBarFasMtr',fld:'vTFBARFASMTR',pic:'ZZZZZ9.99'},{av:'AV57TFBarFasMtr_To',fld:'vTFBARFASMTR_TO',pic:'ZZZZZ9.99'},{av:'AV96Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A603MaqCodBis',fld:'MAQCODBIS',pic:''},{av:'A6173BarFasSec',fld:'BARFASSEC',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV74Wcfaseshdrds_1_emprcod',fld:'vWCFASESHDRDS_1_EMPRCOD',pic:'@!'},{av:'AV75Wcfaseshdrds_2_barcod',fld:'vWCFASESHDRDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV76Wcfaseshdrds_3_barcodreo',fld:'vWCFASESHDRDS_3_BARCODREO',pic:'9'},{av:'AV77Wcfaseshdrds_4_barcodpar',fld:'vWCFASESHDRDS_4_BARCODPAR',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e13IW2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV67FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV63Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV64Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV65Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV66Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV21ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV26TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV28TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV29TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV31TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV32TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV34TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV35TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'AV37TFBarFasDTI',fld:'vTFBARFASDTI',pic:'99/99/99 99:99:99'},{av:'AV42TFBarFasDTF',fld:'vTFBARFASDTF',pic:'99/99/99 99:99:99'},{av:'AV47TFBarTieRea',fld:'vTFBARTIEREA',pic:'Z9.99'},{av:'AV48TFBarTieRea_To',fld:'vTFBARTIEREA_TO',pic:'Z9.99'},{av:'AV51TFBarFasEst_Sels',fld:'vTFBARFASEST_SELS',pic:''},{av:'AV53TFBarFasKgm',fld:'vTFBARFASKGM',pic:'ZZZZZ9.99'},{av:'AV54TFBarFasKgm_To',fld:'vTFBARFASKGM_TO',pic:'ZZZZZ9.99'},{av:'AV56TFBarFasMtr',fld:'vTFBARFASMTR',pic:'ZZZZZ9.99'},{av:'AV57TFBarFasMtr_To',fld:'vTFBARFASMTR_TO',pic:'ZZZZZ9.99'},{av:'AV96Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A603MaqCodBis',fld:'MAQCODBIS',pic:''},{av:'A6173BarFasSec',fld:'BARFASSEC',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV74Wcfaseshdrds_1_emprcod',fld:'vWCFASESHDRDS_1_EMPRCOD',pic:'@!'},{av:'AV75Wcfaseshdrds_2_barcod',fld:'vWCFASESHDRDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV76Wcfaseshdrds_3_barcodreo',fld:'vWCFASESHDRDS_3_BARCODREO',pic:'9'},{av:'AV77Wcfaseshdrds_4_barcodpar',fld:'vWCFASESHDRDS_4_BARCODPAR',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV56TFBarFasMtr',fld:'vTFBARFASMTR',pic:'ZZZZZ9.99'},{av:'AV57TFBarFasMtr_To',fld:'vTFBARFASMTR_TO',pic:'ZZZZZ9.99'},{av:'AV53TFBarFasKgm',fld:'vTFBARFASKGM',pic:'ZZZZZ9.99'},{av:'AV54TFBarFasKgm_To',fld:'vTFBARFASKGM_TO',pic:'ZZZZZ9.99'},{av:'AV50TFBarFasEst_SelsJson',fld:'vTFBARFASEST_SELSJSON',pic:''},{av:'AV51TFBarFasEst_Sels',fld:'vTFBARFASEST_SELS',pic:''},{av:'AV47TFBarTieRea',fld:'vTFBARTIEREA',pic:'Z9.99'},{av:'AV48TFBarTieRea_To',fld:'vTFBARTIEREA_TO',pic:'Z9.99'},{av:'AV42TFBarFasDTF',fld:'vTFBARFASDTF',pic:'99/99/99 99:99:99'},{av:'AV37TFBarFasDTI',fld:'vTFBARFASDTI',pic:'99/99/99 99:99:99'},{av:'AV34TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV35TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'AV31TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV32TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV28TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV29TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV25TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV26TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e17IW2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A603MaqCodBis',fld:'MAQCODBIS',pic:''},{av:'A6173BarFasSec',fld:'BARFASSEC',pic:''},{av:'A148BarEstReo',fld:'BARESTREO',pic:'9'},{av:'A934BarReoCod',fld:'BARREOCOD',pic:'ZZZZZZZ9'},{av:'A936BarReoReo',fld:'BARREOREO',pic:'9'},{av:'A935BarReoPar',fld:'BARREOPAR',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV15MaqDsc',fld:'vMAQDSC',pic:''},{av:'A603MaqCodBis',fld:'MAQCODBIS',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A935BarReoPar',fld:'BARREOPAR',pic:''},{av:'A936BarReoReo',fld:'BARREOREO',pic:'9'},{av:'A934BarReoCod',fld:'BARREOCOD',pic:'ZZZZZZZ9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'AV16OpeNom',fld:'vOPENOM',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e14IW2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV67FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV63Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV64Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV65Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV66Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV21ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV26TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV28TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV29TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV31TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV32TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV34TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV35TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'AV37TFBarFasDTI',fld:'vTFBARFASDTI',pic:'99/99/99 99:99:99'},{av:'AV42TFBarFasDTF',fld:'vTFBARFASDTF',pic:'99/99/99 99:99:99'},{av:'AV47TFBarTieRea',fld:'vTFBARTIEREA',pic:'Z9.99'},{av:'AV48TFBarTieRea_To',fld:'vTFBARTIEREA_TO',pic:'Z9.99'},{av:'AV51TFBarFasEst_Sels',fld:'vTFBARFASEST_SELS',pic:''},{av:'AV53TFBarFasKgm',fld:'vTFBARFASKGM',pic:'ZZZZZ9.99'},{av:'AV54TFBarFasKgm_To',fld:'vTFBARFASKGM_TO',pic:'ZZZZZ9.99'},{av:'AV56TFBarFasMtr',fld:'vTFBARFASMTR',pic:'ZZZZZ9.99'},{av:'AV57TFBarFasMtr_To',fld:'vTFBARFASMTR_TO',pic:'ZZZZZ9.99'},{av:'AV96Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A603MaqCodBis',fld:'MAQCODBIS',pic:''},{av:'A6173BarFasSec',fld:'BARFASSEC',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV74Wcfaseshdrds_1_emprcod',fld:'vWCFASESHDRDS_1_EMPRCOD',pic:'@!'},{av:'AV75Wcfaseshdrds_2_barcod',fld:'vWCFASESHDRDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV76Wcfaseshdrds_3_barcodreo',fld:'vWCFASESHDRDS_3_BARCODREO',pic:'9'},{av:'AV77Wcfaseshdrds_4_barcodpar',fld:'vWCFASESHDRDS_4_BARCODPAR',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV21ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtBarOrdLin_Visible',ctrl:'BARORDLIN',prop:'Visible'},{av:'edtFasCod_Visible',ctrl:'FASCOD',prop:'Visible'},{av:'edtFasDsc_Visible',ctrl:'FASDSC',prop:'Visible'},{av:'edtMaqCodBis_Visible',ctrl:'MAQCODBIS',prop:'Visible'},{av:'edtavMaqdsc_Visible',ctrl:'vMAQDSC',prop:'Visible'},{av:'edtBarFasDTI_Visible',ctrl:'BARFASDTI',prop:'Visible'},{av:'edtBarFasDTF_Visible',ctrl:'BARFASDTF',prop:'Visible'},{av:'edtBarTieRea_Visible',ctrl:'BARTIEREA',prop:'Visible'},{av:'cmbBarFasEst'},{av:'edtBarFasKgm_Visible',ctrl:'BARFASKGM',prop:'Visible'},{av:'edtBarFasMtr_Visible',ctrl:'BARFASMTR',prop:'Visible'},{av:'edtavOpenom_Visible',ctrl:'vOPENOM',prop:'Visible'},{av:'AV61GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV62GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("NULL","{handler:'validv_Openom',iparms:[]");
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
      wcpOAV63Emprcod = "" ;
      wcpOAV66Barcodpar = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV63Emprcod = "" ;
      AV66Barcodpar = "" ;
      AV67FilterFullText = "" ;
      AV21ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV28TFFasCod = "" ;
      AV29TFFasCod_Sel = "" ;
      AV31TFFasDsc = "" ;
      AV32TFFasDsc_Sel = "" ;
      AV34TFMaqCodBis = "" ;
      AV35TFMaqCodBis_Sel = "" ;
      AV37TFBarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      AV42TFBarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      AV47TFBarTieRea = DecimalUtil.ZERO ;
      AV48TFBarTieRea_To = DecimalUtil.ZERO ;
      AV51TFBarFasEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV53TFBarFasKgm = DecimalUtil.ZERO ;
      AV54TFBarFasKgm_To = DecimalUtil.ZERO ;
      AV56TFBarFasMtr = DecimalUtil.ZERO ;
      AV57TFBarFasMtr_To = DecimalUtil.ZERO ;
      AV96Pgmname = "" ;
      A603MaqCodBis = "" ;
      A6173BarFasSec = "" ;
      AV74Wcfaseshdrds_1_emprcod = "" ;
      AV77Wcfaseshdrds_4_barcodpar = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV59DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A935BarReoPar = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucGxuitabspanel_tabs = new com.genexus.webpanels.GXUserControl();
      lblProduccion_title_Jsonclick = "" ;
      WebComp_Wcwclecturasproduccion_Component = "" ;
      OldWcwclecturasproduccion = "" ;
      lblPiezas_title_Jsonclick = "" ;
      WebComp_Wcwcmtskgsexpautsindetalle_Component = "" ;
      OldWcwcmtskgsexpautsindetalle = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV39DDO_BarFasDTIAuxDate = GXutil.nullDate() ;
      AV44DDO_BarFasDTFAuxDate = GXutil.nullDate() ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      AV15MaqDsc = "" ;
      A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      A215BarTieRea = DecimalUtil.ZERO ;
      A3837BarFasKgm = DecimalUtil.ZERO ;
      A3838BarFasMtr = DecimalUtil.ZERO ;
      AV16OpeNom = "" ;
      AV91Wcfaseshdrds_18_tfbarfasest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      scmdbuf = "" ;
      AV78Wcfaseshdrds_5_filterfulltext = "" ;
      AV82Wcfaseshdrds_9_tffascod_sel = "" ;
      AV81Wcfaseshdrds_8_tffascod = "" ;
      AV84Wcfaseshdrds_11_tffasdsc_sel = "" ;
      AV83Wcfaseshdrds_10_tffasdsc = "" ;
      AV86Wcfaseshdrds_13_tfmaqcodbis_sel = "" ;
      AV85Wcfaseshdrds_12_tfmaqcodbis = "" ;
      AV87Wcfaseshdrds_14_tfbarfasdti = GXutil.resetTime( GXutil.nullDate() );
      AV88Wcfaseshdrds_15_tfbarfasdtf = GXutil.resetTime( GXutil.nullDate() );
      AV89Wcfaseshdrds_16_tfbartierea = DecimalUtil.ZERO ;
      AV90Wcfaseshdrds_17_tfbartierea_to = DecimalUtil.ZERO ;
      AV92Wcfaseshdrds_19_tfbarfaskgm = DecimalUtil.ZERO ;
      AV93Wcfaseshdrds_20_tfbarfaskgm_to = DecimalUtil.ZERO ;
      AV94Wcfaseshdrds_21_tfbarfasmtr = DecimalUtil.ZERO ;
      AV95Wcfaseshdrds_22_tfbarfasmtr_to = DecimalUtil.ZERO ;
      H00IW2_A148BarEstReo = new byte[1] ;
      H00IW2_A934BarReoCod = new int[1] ;
      H00IW2_A936BarReoReo = new byte[1] ;
      H00IW2_A935BarReoPar = new String[] {""} ;
      H00IW2_A396EmprCod = new String[] {""} ;
      H00IW2_A129BarCod = new int[1] ;
      H00IW2_A132BarCodReo = new byte[1] ;
      H00IW2_A130BarCodPar = new String[] {""} ;
      H00IW3_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV71Station = "" ;
      AV72Emprnom = "" ;
      AV73Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV23Session = httpContext.getWebSession();
      AV19ColumnsSelectorXML = "" ;
      AV50TFBarFasEst_SelsJson = "" ;
      GXv_int8 = new int[1] ;
      GXv_int9 = new byte[1] ;
      GXv_int10 = new short[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV20UserCustomValue = "" ;
      AV22ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector11 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector12 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char14 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char13 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState15 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      AV9TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV63Emprcod = "" ;
      sCtrlAV64Barcod = "" ;
      sCtrlAV65Barcodreo = "" ;
      sCtrlAV66Barcodpar = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcfaseshdr__default(),
         new Object[] {
             new Object[] {
            H00IW2_A148BarEstReo, H00IW2_A934BarReoCod, H00IW2_A936BarReoReo, H00IW2_A935BarReoPar, H00IW2_A396EmprCod, H00IW2_A129BarCod, H00IW2_A132BarCodReo, H00IW2_A130BarCodPar
            }
            , new Object[] {
            H00IW3_AGRID_nRecordCount
            }
         }
      );
      AV96Pgmname = "WCFasesHdr" ;
      /* GeneXus formulas. */
      AV96Pgmname = "WCFasesHdr" ;
      Gx_err = (short)(0) ;
      edtavMaqdsc_Enabled = 0 ;
      edtavOpenom_Enabled = 0 ;
      WebComp_Wcwclecturasproduccion = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wcwcmtskgsexpautsindetalle = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte wcpOAV65Barcodreo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV65Barcodreo ;
   private byte AV76Wcfaseshdrds_3_barcodreo ;
   private byte A132BarCodReo ;
   private byte A148BarEstReo ;
   private byte A936BarReoReo ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A153BarFasEst ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXv_int9[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV25TFBarOrdLin ;
   private short AV26TFBarOrdLin_To ;
   private short AV12OrderedBy ;
   private short A194BarOrdLin ;
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV79Wcfaseshdrds_6_tfbarordlin ;
   private short AV80Wcfaseshdrds_7_tfbarordlin_to ;
   private short GXv_int10[] ;
   private int wcpOAV64Barcod ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_35 ;
   private int AV64Barcod ;
   private int nGXsfl_35_idx=1 ;
   private int AV75Wcfaseshdrds_2_barcod ;
   private int A129BarCod ;
   private int A934BarReoCod ;
   private int Gridpaginationbar_Pagestoshow ;
   private int Gxuitabspanel_tabs_Pagecount ;
   private int edtEmprCod_Visible ;
   private int edtBarCod_Visible ;
   private int edtBarCodReo_Visible ;
   private int edtBarCodPar_Visible ;
   private int subGrid_Islastpage ;
   private int edtavMaqdsc_Enabled ;
   private int edtavOpenom_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV91Wcfaseshdrds_18_tfbarfasest_sels_size ;
   private int edtBarOrdLin_Visible ;
   private int edtFasCod_Visible ;
   private int edtFasDsc_Visible ;
   private int edtMaqCodBis_Visible ;
   private int edtavMaqdsc_Visible ;
   private int edtBarFasDTI_Visible ;
   private int edtBarFasDTF_Visible ;
   private int edtBarTieRea_Visible ;
   private int edtBarFasKgm_Visible ;
   private int edtBarFasMtr_Visible ;
   private int edtavOpenom_Visible ;
   private int AV60PageToGo ;
   private int GXv_int8[] ;
   private int AV97GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV61GridCurrentPage ;
   private long AV62GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV47TFBarTieRea ;
   private java.math.BigDecimal AV48TFBarTieRea_To ;
   private java.math.BigDecimal AV53TFBarFasKgm ;
   private java.math.BigDecimal AV54TFBarFasKgm_To ;
   private java.math.BigDecimal AV56TFBarFasMtr ;
   private java.math.BigDecimal AV57TFBarFasMtr_To ;
   private java.math.BigDecimal A215BarTieRea ;
   private java.math.BigDecimal A3837BarFasKgm ;
   private java.math.BigDecimal A3838BarFasMtr ;
   private java.math.BigDecimal AV89Wcfaseshdrds_16_tfbartierea ;
   private java.math.BigDecimal AV90Wcfaseshdrds_17_tfbartierea_to ;
   private java.math.BigDecimal AV92Wcfaseshdrds_19_tfbarfaskgm ;
   private java.math.BigDecimal AV93Wcfaseshdrds_20_tfbarfaskgm_to ;
   private java.math.BigDecimal AV94Wcfaseshdrds_21_tfbarfasmtr ;
   private java.math.BigDecimal AV95Wcfaseshdrds_22_tfbarfasmtr_to ;
   private String wcpOAV63Emprcod ;
   private String wcpOAV66Barcodpar ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV63Emprcod ;
   private String AV66Barcodpar ;
   private String sGXsfl_35_idx="0001" ;
   private String AV28TFFasCod ;
   private String AV29TFFasCod_Sel ;
   private String AV31TFFasDsc ;
   private String AV32TFFasDsc_Sel ;
   private String AV34TFMaqCodBis ;
   private String AV35TFMaqCodBis_Sel ;
   private String AV96Pgmname ;
   private String A603MaqCodBis ;
   private String A6173BarFasSec ;
   private String AV74Wcfaseshdrds_1_emprcod ;
   private String AV77Wcfaseshdrds_4_barcodpar ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A935BarReoPar ;
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
   private String Gxuitabspanel_tabs_Class ;
   private String Ddo_grid_Caption ;
   private String Ddo_grid_Filteredtext_set ;
   private String Ddo_grid_Filteredtextto_set ;
   private String Ddo_grid_Selectedvalue_set ;
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Includesortasc ;
   private String Ddo_grid_Fixable ;
   private String Ddo_grid_Sortedstatus ;
   private String Ddo_grid_Includefilter ;
   private String Ddo_grid_Filtertype ;
   private String Ddo_grid_Filterisrange ;
   private String Ddo_grid_Includedatalist ;
   private String Ddo_grid_Datalisttype ;
   private String Ddo_grid_Allowmultipleselection ;
   private String Ddo_grid_Datalistfixedvalues ;
   private String Ddo_grid_Datalistproc ;
   private String Ddo_gridcolumnsselector_Caption ;
   private String Ddo_gridcolumnsselector_Tooltip ;
   private String Ddo_gridcolumnsselector_Cls ;
   private String Ddo_gridcolumnsselector_Dropdownoptionstype ;
   private String Ddo_gridcolumnsselector_Gridinternalname ;
   private String Ddo_gridcolumnsselector_Titlecontrolidtoreplace ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
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
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String Gxuitabspanel_tabs_Internalname ;
   private String lblProduccion_title_Internalname ;
   private String lblProduccion_title_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String WebComp_Wcwclecturasproduccion_Component ;
   private String OldWcwclecturasproduccion ;
   private String lblPiezas_title_Internalname ;
   private String lblPiezas_title_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String WebComp_Wcwcmtskgsexpautsindetalle_Component ;
   private String OldWcwcmtskgsexpautsindetalle ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_barfasdtiauxdates_Internalname ;
   private String edtavDdo_barfasdtiauxdate_Internalname ;
   private String edtavDdo_barfasdtiauxdate_Jsonclick ;
   private String divDdo_barfasdtfauxdates_Internalname ;
   private String edtavDdo_barfasdtfauxdate_Internalname ;
   private String edtavDdo_barfasdtfauxdate_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavFilterfulltext_Internalname ;
   private String edtBarOrdLin_Internalname ;
   private String A457FasCod ;
   private String edtFasCod_Internalname ;
   private String A460FasDsc ;
   private String edtFasDsc_Internalname ;
   private String edtMaqCodBis_Internalname ;
   private String AV15MaqDsc ;
   private String edtavMaqdsc_Internalname ;
   private String edtBarFasDTI_Internalname ;
   private String edtBarFasDTF_Internalname ;
   private String edtBarTieRea_Internalname ;
   private String edtBarFasKgm_Internalname ;
   private String edtBarFasMtr_Internalname ;
   private String AV16OpeNom ;
   private String edtavOpenom_Internalname ;
   private String scmdbuf ;
   private String AV82Wcfaseshdrds_9_tffascod_sel ;
   private String AV81Wcfaseshdrds_8_tffascod ;
   private String AV84Wcfaseshdrds_11_tffasdsc_sel ;
   private String AV83Wcfaseshdrds_10_tffasdsc ;
   private String AV86Wcfaseshdrds_13_tfmaqcodbis_sel ;
   private String AV85Wcfaseshdrds_12_tfmaqcodbis ;
   private String hsh ;
   private String AV71Station ;
   private String AV72Emprnom ;
   private String AV73Usurcod ;
   private String GXt_char14 ;
   private String GXv_char4[] ;
   private String GXt_char13 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblTablerightheader_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV63Emprcod ;
   private String sCtrlAV64Barcod ;
   private String sCtrlAV65Barcodreo ;
   private String sCtrlAV66Barcodpar ;
   private String sGXsfl_35_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtBarOrdLin_Jsonclick ;
   private String edtFasCod_Jsonclick ;
   private String edtFasDsc_Jsonclick ;
   private String edtMaqCodBis_Jsonclick ;
   private String edtavMaqdsc_Jsonclick ;
   private String edtBarFasDTI_Jsonclick ;
   private String edtBarFasDTF_Jsonclick ;
   private String edtBarTieRea_Jsonclick ;
   private String GXCCtl ;
   private String edtBarFasKgm_Jsonclick ;
   private String edtBarFasMtr_Jsonclick ;
   private String edtavOpenom_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV37TFBarFasDTI ;
   private java.util.Date AV42TFBarFasDTF ;
   private java.util.Date A4442BarFasDTI ;
   private java.util.Date A4443BarFasDTF ;
   private java.util.Date AV87Wcfaseshdrds_14_tfbarfasdti ;
   private java.util.Date AV88Wcfaseshdrds_15_tfbarfasdtf ;
   private java.util.Date AV39DDO_BarFasDTIAuxDate ;
   private java.util.Date AV44DDO_BarFasDTFAuxDate ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV13OrderedDsc ;
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
   private boolean Gxuitabspanel_tabs_Historymanagement ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean bGXsfl_35_Refreshing=false ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean bDynCreated_Wcwcmtskgsexpautsindetalle ;
   private boolean bDynCreated_Wcwclecturasproduccion ;
   private boolean gx_refresh_fired ;
   private String AV19ColumnsSelectorXML ;
   private String AV50TFBarFasEst_SelsJson ;
   private String AV20UserCustomValue ;
   private String AV67FilterFullText ;
   private String AV78Wcfaseshdrds_5_filterfulltext ;
   private GXSimpleCollection<Byte> AV91Wcfaseshdrds_18_tfbarfasest_sels ;
   private GXSimpleCollection<Byte> AV51TFBarFasEst_Sels ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wcwclecturasproduccion ;
   private GXWebComponent WebComp_Wcwcmtskgsexpautsindetalle ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV23Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucGxuitabspanel_tabs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbBarFasEst ;
   private IDataStoreProvider pr_default ;
   private byte[] H00IW2_A148BarEstReo ;
   private int[] H00IW2_A934BarReoCod ;
   private byte[] H00IW2_A936BarReoReo ;
   private String[] H00IW2_A935BarReoPar ;
   private String[] H00IW2_A396EmprCod ;
   private int[] H00IW2_A129BarCod ;
   private byte[] H00IW2_A132BarCodReo ;
   private String[] H00IW2_A130BarCodPar ;
   private long[] H00IW3_AGRID_nRecordCount ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV9TrnContextAtt ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState15[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV21ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV22ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector11[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector12[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV59DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class wcfaseshdr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00IW2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A153BarFasEst ,
                                          GXSimpleCollection<Byte> AV91Wcfaseshdrds_18_tfbarfasest_sels ,
                                          String AV78Wcfaseshdrds_5_filterfulltext ,
                                          short AV79Wcfaseshdrds_6_tfbarordlin ,
                                          short AV80Wcfaseshdrds_7_tfbarordlin_to ,
                                          String AV82Wcfaseshdrds_9_tffascod_sel ,
                                          String AV81Wcfaseshdrds_8_tffascod ,
                                          String AV84Wcfaseshdrds_11_tffasdsc_sel ,
                                          String AV83Wcfaseshdrds_10_tffasdsc ,
                                          String AV86Wcfaseshdrds_13_tfmaqcodbis_sel ,
                                          String AV85Wcfaseshdrds_12_tfmaqcodbis ,
                                          java.util.Date AV87Wcfaseshdrds_14_tfbarfasdti ,
                                          java.util.Date AV88Wcfaseshdrds_15_tfbarfasdtf ,
                                          java.math.BigDecimal AV89Wcfaseshdrds_16_tfbartierea ,
                                          java.math.BigDecimal AV90Wcfaseshdrds_17_tfbartierea_to ,
                                          int AV91Wcfaseshdrds_18_tfbarfasest_sels_size ,
                                          java.math.BigDecimal AV92Wcfaseshdrds_19_tfbarfaskgm ,
                                          java.math.BigDecimal AV93Wcfaseshdrds_20_tfbarfaskgm_to ,
                                          java.math.BigDecimal AV94Wcfaseshdrds_21_tfbarfasmtr ,
                                          java.math.BigDecimal AV95Wcfaseshdrds_22_tfbarfasmtr_to ,
                                          short A194BarOrdLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A603MaqCodBis ,
                                          java.math.BigDecimal A215BarTieRea ,
                                          java.math.BigDecimal A3837BarFasKgm ,
                                          java.math.BigDecimal A3838BarFasMtr ,
                                          java.util.Date A4442BarFasDTI ,
                                          java.util.Date A4443BarFasDTF ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String A396EmprCod ,
                                          String AV63Emprcod ,
                                          int A129BarCod ,
                                          int AV64Barcod ,
                                          byte A132BarCodReo ,
                                          byte AV65Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV66Barcodpar ,
                                          String AV74Wcfaseshdrds_1_emprcod ,
                                          int AV75Wcfaseshdrds_2_barcod ,
                                          byte AV76Wcfaseshdrds_3_barcodreo ,
                                          String AV77Wcfaseshdrds_4_barcodpar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[13];
      Object[] GXv_Object17 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " BarEstReo, BarReoCod, BarReoReo, BarReoPar, EmprCod, BarCod, BarCodReo, BarCodPar" ;
      sFromString = " FROM TXPBARCAD" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)");
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(BarCod = ?)");
      addWhere(sWhereString, "(BarCodReo = ?)");
      addWhere(sWhereString, "(BarCodPar = ?)");
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object17[0] = scmdbuf ;
      GXv_Object17[1] = GXv_int16 ;
      return GXv_Object17 ;
   }

   protected Object[] conditional_H00IW3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A153BarFasEst ,
                                          GXSimpleCollection<Byte> AV91Wcfaseshdrds_18_tfbarfasest_sels ,
                                          String AV78Wcfaseshdrds_5_filterfulltext ,
                                          short AV79Wcfaseshdrds_6_tfbarordlin ,
                                          short AV80Wcfaseshdrds_7_tfbarordlin_to ,
                                          String AV82Wcfaseshdrds_9_tffascod_sel ,
                                          String AV81Wcfaseshdrds_8_tffascod ,
                                          String AV84Wcfaseshdrds_11_tffasdsc_sel ,
                                          String AV83Wcfaseshdrds_10_tffasdsc ,
                                          String AV86Wcfaseshdrds_13_tfmaqcodbis_sel ,
                                          String AV85Wcfaseshdrds_12_tfmaqcodbis ,
                                          java.util.Date AV87Wcfaseshdrds_14_tfbarfasdti ,
                                          java.util.Date AV88Wcfaseshdrds_15_tfbarfasdtf ,
                                          java.math.BigDecimal AV89Wcfaseshdrds_16_tfbartierea ,
                                          java.math.BigDecimal AV90Wcfaseshdrds_17_tfbartierea_to ,
                                          int AV91Wcfaseshdrds_18_tfbarfasest_sels_size ,
                                          java.math.BigDecimal AV92Wcfaseshdrds_19_tfbarfaskgm ,
                                          java.math.BigDecimal AV93Wcfaseshdrds_20_tfbarfaskgm_to ,
                                          java.math.BigDecimal AV94Wcfaseshdrds_21_tfbarfasmtr ,
                                          java.math.BigDecimal AV95Wcfaseshdrds_22_tfbarfasmtr_to ,
                                          short A194BarOrdLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A603MaqCodBis ,
                                          java.math.BigDecimal A215BarTieRea ,
                                          java.math.BigDecimal A3837BarFasKgm ,
                                          java.math.BigDecimal A3838BarFasMtr ,
                                          java.util.Date A4442BarFasDTI ,
                                          java.util.Date A4443BarFasDTF ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String A396EmprCod ,
                                          String AV63Emprcod ,
                                          int A129BarCod ,
                                          int AV64Barcod ,
                                          byte A132BarCodReo ,
                                          byte AV65Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV66Barcodpar ,
                                          String AV74Wcfaseshdrds_1_emprcod ,
                                          int AV75Wcfaseshdrds_2_barcod ,
                                          byte AV76Wcfaseshdrds_3_barcodreo ,
                                          String AV77Wcfaseshdrds_4_barcodpar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int18 = new byte[8];
      Object[] GXv_Object19 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM TXPBARCAD" ;
      addWhere(sWhereString, "(EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)");
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(BarCod = ?)");
      addWhere(sWhereString, "(BarCodReo = ?)");
      addWhere(sWhereString, "(BarCodPar = ?)");
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
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
                  return conditional_H00IW2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (java.util.Date)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Boolean) dynConstraints[30]).booleanValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).byteValue() , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] );
            case 1 :
                  return conditional_H00IW3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (java.util.Date)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Boolean) dynConstraints[30]).booleanValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).byteValue() , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00IW2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00IW3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
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
                  stmt.setString(sIdx, (String)parms[13], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[15]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[19]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[9]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[10]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[14]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 1);
               }
               return;
      }
   }

}

