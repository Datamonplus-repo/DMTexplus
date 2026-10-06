package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class consultadeproduccion_fasesfull_impl extends GXWebComponent
{
   public consultadeproduccion_fasesfull_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public consultadeproduccion_fasesfull_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultadeproduccion_fasesfull_impl.class ));
   }

   public consultadeproduccion_fasesfull_impl( int remoteHandle ,
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
               AV17EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17EmprCod", AV17EmprCod);
               AV5BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCod), 8, 0));
               AV7BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7BarCodReo", GXutil.str( AV7BarCodReo, 1, 0));
               AV6BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6BarCodPar", AV6BarCodPar);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV17EmprCod,Integer.valueOf(AV5BarCod),Byte.valueOf(AV7BarCodReo),AV6BarCodPar});
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
      nRC_GXsfl_235 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_235"))) ;
      nGXsfl_235_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_235_idx"))) ;
      sGXsfl_235_idx = httpContext.GetPar( "sGXsfl_235_idx") ;
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
      AV17EmprCod = httpContext.GetPar( "EmprCod") ;
      AV5BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      AV7BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      AV6BarCodPar = httpContext.GetPar( "BarCodPar") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV9ColumnsSelector);
      AV56TFBarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "TFBarOrdLin"))) ;
      AV57TFBarOrdLin_To = (short)(GXutil.lval( httpContext.GetPar( "TFBarOrdLin_To"))) ;
      AV60TFFasCod = httpContext.GetPar( "TFFasCod") ;
      AV61TFFasCod_Sel = httpContext.GetPar( "TFFasCod_Sel") ;
      AV62TFFasDsc = httpContext.GetPar( "TFFasDsc") ;
      AV63TFFasDsc_Sel = httpContext.GetPar( "TFFasDsc_Sel") ;
      AV64TFMaqCodBis = httpContext.GetPar( "TFMaqCodBis") ;
      AV65TFMaqCodBis_Sel = httpContext.GetPar( "TFMaqCodBis_Sel") ;
      AV46TFBarFasDTI = localUtil.parseDTimeParm( httpContext.GetPar( "TFBarFasDTI")) ;
      AV58TFBarTieRea = CommonUtil.decimalVal( httpContext.GetPar( "TFBarTieRea"), ".") ;
      AV59TFBarTieRea_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarTieRea_To"), ".") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV48TFBarFasEst_Sels);
      AV50TFBarFasKgm = CommonUtil.decimalVal( httpContext.GetPar( "TFBarFasKgm"), ".") ;
      AV51TFBarFasKgm_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarFasKgm_To"), ".") ;
      AV52TFBarFasMtr = CommonUtil.decimalVal( httpContext.GetPar( "TFBarFasMtr"), ".") ;
      AV53TFBarFasMtr_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarFasMtr_To"), ".") ;
      AV54TFBarFasPri = (byte)(GXutil.lval( httpContext.GetPar( "TFBarFasPri"))) ;
      AV55TFBarFasPri_To = (byte)(GXutil.lval( httpContext.GetPar( "TFBarFasPri_To"))) ;
      AV118Pgmname = httpContext.GetPar( "Pgmname") ;
      AV36OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV38OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      A2689ExHdrFas = httpContext.GetPar( "ExHdrFas") ;
      AV22FasCod = httpContext.GetPar( "FasCod") ;
      A2697ExHdrFeE = localUtil.parseDateParm( httpContext.GetPar( "ExHdrFeE")) ;
      n2697ExHdrFeE = false ;
      A2700ExHdrFeR = localUtil.parseDateParm( httpContext.GetPar( "ExHdrFeR")) ;
      n2700ExHdrFeR = false ;
      AV119Consultadeproduccion_fasesfullds_1_emprcod = httpContext.GetPar( "Consultadeproduccion_fasesfullds_1_emprcod") ;
      AV120Consultadeproduccion_fasesfullds_2_barcod = (int)(GXutil.lval( httpContext.GetPar( "Consultadeproduccion_fasesfullds_2_barcod"))) ;
      AV121Consultadeproduccion_fasesfullds_3_barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Consultadeproduccion_fasesfullds_3_barcodreo"))) ;
      AV122Consultadeproduccion_fasesfullds_4_barcodpar = httpContext.GetPar( "Consultadeproduccion_fasesfullds_4_barcodpar") ;
      AV93Dorado = (byte)(GXutil.lval( httpContext.GetPar( "Dorado"))) ;
      AV94Moda21 = (byte)(GXutil.lval( httpContext.GetPar( "Moda21"))) ;
      AV72CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
      AV74BarSer = httpContext.GetPar( "BarSer") ;
      AV82BarColNom = httpContext.GetPar( "BarColNom") ;
      AV83BarColNum = (int)(GXutil.lval( httpContext.GetPar( "BarColNum"))) ;
      AV98AlbRFen = localUtil.parseDateParm( httpContext.GetPar( "AlbRFen")) ;
      AV99ForFecApr = localUtil.parseDateParm( httpContext.GetPar( "ForFecApr")) ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      n129BarCod = false ;
      A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      n132BarCodReo = false ;
      A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
      n130BarCodPar = false ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV17EmprCod, AV5BarCod, AV7BarCodReo, AV6BarCodPar, AV9ColumnsSelector, AV56TFBarOrdLin, AV57TFBarOrdLin_To, AV60TFFasCod, AV61TFFasCod_Sel, AV62TFFasDsc, AV63TFFasDsc_Sel, AV64TFMaqCodBis, AV65TFMaqCodBis_Sel, AV46TFBarFasDTI, AV58TFBarTieRea, AV59TFBarTieRea_To, AV48TFBarFasEst_Sels, AV50TFBarFasKgm, AV51TFBarFasKgm_To, AV52TFBarFasMtr, AV53TFBarFasMtr_To, AV54TFBarFasPri, AV55TFBarFasPri_To, AV118Pgmname, AV36OrderedBy, AV38OrderedDsc, A2689ExHdrFas, AV22FasCod, A2697ExHdrFeE, A2700ExHdrFeR, AV119Consultadeproduccion_fasesfullds_1_emprcod, AV120Consultadeproduccion_fasesfullds_2_barcod, AV121Consultadeproduccion_fasesfullds_3_barcodreo, AV122Consultadeproduccion_fasesfullds_4_barcodpar, AV93Dorado, AV94Moda21, AV72CliCod, AV74BarSer, AV82BarColNom, AV83BarColNum, AV98AlbRFen, AV99ForFecApr, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa23B2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Consulta de Fases Produccion", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.consultadeproduccion_fasesfull", new String[] {GXutil.URLEncode(GXutil.rtrim(AV17EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV5BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV6BarCodPar))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFASCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV22FasCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vDORADO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV93Dorado), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV94Moda21), "9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ConsultadeProduccion_FasesFull");
      forbiddenHiddens.add("CliCod", localUtil.format( DecimalUtil.doubleToDec(AV72CliCod), "ZZZZZ9"));
      forbiddenHiddens.add("BarSer", GXutil.rtrim( localUtil.format( AV74BarSer, "")));
      forbiddenHiddens.add("BarColNom", GXutil.rtrim( localUtil.format( AV82BarColNom, "")));
      forbiddenHiddens.add("BarColNum", localUtil.format( DecimalUtil.doubleToDec(AV83BarColNum), "ZZZZZ9"));
      forbiddenHiddens.add("AlbRFen", localUtil.format(AV98AlbRFen, "99/99/99"));
      forbiddenHiddens.add("ForFecApr", localUtil.format(AV99ForFecApr, "99/99/99"));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV118Pgmname, "")));
      forbiddenHiddens.add("EmprCod", GXutil.rtrim( localUtil.format( A396EmprCod, "@!")));
      forbiddenHiddens.add("BarCod", localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"));
      forbiddenHiddens.add("BarCodReo", localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"));
      forbiddenHiddens.add("BarCodPar", GXutil.rtrim( localUtil.format( A130BarCodPar, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("consultadeproduccion_fasesfull:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_235", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_235, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV24GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV25GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV16DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV16DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV9ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV9ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV17EmprCod", GXutil.rtrim( wcpOAV17EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV5BarCod", GXutil.ltrim( localUtil.ntoc( wcpOAV5BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7BarCodReo", GXutil.ltrim( localUtil.ntoc( wcpOAV7BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV6BarCodPar", GXutil.rtrim( wcpOAV6BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV17EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOD", GXutil.ltrim( localUtil.ntoc( AV5BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV7BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODPAR", GXutil.rtrim( AV6BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARORDLIN", GXutil.ltrim( localUtil.ntoc( AV56TFBarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARORDLIN_TO", GXutil.ltrim( localUtil.ntoc( AV57TFBarOrdLin_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASCOD", GXutil.rtrim( AV60TFFasCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASCOD_SEL", GXutil.rtrim( AV61TFFasCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASDSC", GXutil.rtrim( AV62TFFasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASDSC_SEL", GXutil.rtrim( AV63TFFasDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMAQCODBIS", GXutil.rtrim( AV64TFMaqCodBis));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMAQCODBIS_SEL", GXutil.rtrim( AV65TFMaqCodBis_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFASDTI", localUtil.ttoc( AV46TFBarFasDTI, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARTIEREA", GXutil.ltrim( localUtil.ntoc( AV58TFBarTieRea, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARTIEREA_TO", GXutil.ltrim( localUtil.ntoc( AV59TFBarTieRea_To, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vTFBARFASEST_SELS", AV48TFBarFasEst_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vTFBARFASEST_SELS", AV48TFBarFasEst_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFASKGM", GXutil.ltrim( localUtil.ntoc( AV50TFBarFasKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFASKGM_TO", GXutil.ltrim( localUtil.ntoc( AV51TFBarFasKgm_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFASMTR", GXutil.ltrim( localUtil.ntoc( AV52TFBarFasMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFASMTR_TO", GXutil.ltrim( localUtil.ntoc( AV53TFBarFasMtr_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFASPRI", GXutil.ltrim( localUtil.ntoc( AV54TFBarFasPri, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFASPRI_TO", GXutil.ltrim( localUtil.ntoc( AV55TFBarFasPri_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV36OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV38OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARFASDTF", localUtil.ttoc( A4443BarFasDTF, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BAREXT", GXutil.ltrim( localUtil.ntoc( A2265BarExt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EXHDRFAS", GXutil.rtrim( A2689ExHdrFas));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFASCOD", GXutil.rtrim( AV22FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFASCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV22FasCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EXHDRFEE", localUtil.dtoc( A2697ExHdrFeE, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EXHDRFER", localUtil.dtoc( A2700ExHdrFeR, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARFASSEC", GXutil.rtrim( A6173BarFasSec));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARESTREO", GXutil.ltrim( localUtil.ntoc( A148BarEstReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARREOCOD", GXutil.ltrim( localUtil.ntoc( A934BarReoCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARREOREO", GXutil.ltrim( localUtil.ntoc( A936BarReoReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARREOPAR", GXutil.rtrim( A935BarReoPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vDORADO", GXutil.ltrim( localUtil.ntoc( AV93Dorado, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vDORADO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV93Dorado), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMODA21", GXutil.ltrim( localUtil.ntoc( AV94Moda21, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV94Moda21), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCONSULTADEPRODUCCION_FASESFULLDS_1_EMPRCOD", GXutil.rtrim( AV119Consultadeproduccion_fasesfullds_1_emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCONSULTADEPRODUCCION_FASESFULLDS_2_BARCOD", GXutil.ltrim( localUtil.ntoc( AV120Consultadeproduccion_fasesfullds_2_barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCONSULTADEPRODUCCION_FASESFULLDS_3_BARCODREO", GXutil.ltrim( localUtil.ntoc( AV121Consultadeproduccion_fasesfullds_3_barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCONSULTADEPRODUCCION_FASESFULLDS_4_BARCODPAR", GXutil.rtrim( AV122Consultadeproduccion_fasesfullds_4_barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADERTOP_Width", GXutil.rtrim( Dvpanel_tableheadertop_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADERTOP_Autowidth", GXutil.booltostr( Dvpanel_tableheadertop_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADERTOP_Autoheight", GXutil.booltostr( Dvpanel_tableheadertop_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADERTOP_Cls", GXutil.rtrim( Dvpanel_tableheadertop_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADERTOP_Title", GXutil.rtrim( Dvpanel_tableheadertop_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADERTOP_Collapsible", GXutil.booltostr( Dvpanel_tableheadertop_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADERTOP_Collapsed", GXutil.booltostr( Dvpanel_tableheadertop_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADERTOP_Showcollapseicon", GXutil.booltostr( Dvpanel_tableheadertop_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADERTOP_Iconposition", GXutil.rtrim( Dvpanel_tableheadertop_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADERTOP_Autoscroll", GXutil.booltostr( Dvpanel_tableheadertop_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INNEWWINDOW1_Width", GXutil.rtrim( Innewwindow1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INNEWWINDOW1_Height", GXutil.rtrim( Innewwindow1_Height));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INNEWWINDOW1_Target", GXutil.rtrim( Innewwindow1_Target));
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

   public void renderHtmlCloseForm23B2( )
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
      return "ConsultadeProduccion_FasesFull" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Consulta de Fases Produccion", "") ;
   }

   public void wb23B0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.consultadeproduccion_fasesfull");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
            httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
         /* User Defined Control */
         ucDvpanel_tableheadertop.setProperty("Width", Dvpanel_tableheadertop_Width);
         ucDvpanel_tableheadertop.setProperty("AutoWidth", Dvpanel_tableheadertop_Autowidth);
         ucDvpanel_tableheadertop.setProperty("AutoHeight", Dvpanel_tableheadertop_Autoheight);
         ucDvpanel_tableheadertop.setProperty("Cls", Dvpanel_tableheadertop_Cls);
         ucDvpanel_tableheadertop.setProperty("Title", Dvpanel_tableheadertop_Title);
         ucDvpanel_tableheadertop.setProperty("Collapsible", Dvpanel_tableheadertop_Collapsible);
         ucDvpanel_tableheadertop.setProperty("Collapsed", Dvpanel_tableheadertop_Collapsed);
         ucDvpanel_tableheadertop.setProperty("ShowCollapseIcon", Dvpanel_tableheadertop_Showcollapseicon);
         ucDvpanel_tableheadertop.setProperty("IconPosition", Dvpanel_tableheadertop_Iconposition);
         ucDvpanel_tableheadertop.setProperty("AutoScroll", Dvpanel_tableheadertop_Autoscroll);
         ucDvpanel_tableheadertop.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tableheadertop_Internalname, sPrefix+"DVPANEL_TABLEHEADERTOPContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_TABLEHEADERTOPContainer"+"TableHeaderTop"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableheadertop_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnpdf_hdr_Internalname, "gx.evt.setGridEvt("+GXutil.str( 235, 3, 0)+","+"null"+");", httpContext.getMessage( "PDF (Ver Hdr)", ""), bttBtnpdf_hdr_Jsonclick, 5, httpContext.getMessage( "PDF (Ver Hdr)", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOPDF_HDR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ConsultadeProduccion_FasesFull.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnpdf_prodcliente_Internalname, "gx.evt.setGridEvt("+GXutil.str( 235, 3, 0)+","+"null"+");", httpContext.getMessage( "PDF (Prod x Cliente)", ""), bttBtnpdf_prodcliente_Jsonclick, 5, httpContext.getMessage( "PDF (Prod x Cliente)", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOPDF_PRODCLIENTE\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ConsultadeProduccion_FasesFull.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablecol1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDiscod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDiscod_Internalname, httpContext.getMessage( "Código Disposición", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'" + sPrefix + "',false,'" + sGXsfl_235_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDiscod_Internalname, GXutil.ltrim( localUtil.ntoc( AV90DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavDiscod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV90DisCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV90DisCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,35);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDiscod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDiscod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ConsultadeProduccion_FasesFull.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavEnccli_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavEnccli_Internalname, httpContext.getMessage( "Enc. Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'" + sPrefix + "',false,'" + sGXsfl_235_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavEnccli_Internalname, GXutil.rtrim( AV91EncCli), GXutil.rtrim( localUtil.format( AV91EncCli, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,39);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavEnccli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavEnccli_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ConsultadeProduccion_FasesFull.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divTablecliente_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClicod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'" + sPrefix + "',false,'" + sGXsfl_235_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV72CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV72CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV72CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,47);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ConsultadeProduccion_FasesFull.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-10", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClinom_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'" + sPrefix + "',false,'" + sGXsfl_235_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClinom_Internalname, GXutil.rtrim( AV73CliNom), GXutil.rtrim( localUtil.format( AV73CliNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClinom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClinom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ConsultadeProduccion_FasesFull.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divTablearticulo_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarser_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarser_Internalname, httpContext.getMessage( "Artículo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'" + sPrefix + "',false,'" + sGXsfl_235_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarser_Internalname, GXutil.rtrim( AV74BarSer), GXutil.rtrim( localUtil.format( AV74BarSer, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarser_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarser_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ConsultadeProduccion_FasesFull.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarserdsc_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'" + sPrefix + "',false,'" + sGXsfl_235_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarserdsc_Internalname, GXutil.rtrim( AV75BarSerDsc), GXutil.rtrim( localUtil.format( AV75BarSerDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,63);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarserdsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarserdsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ConsultadeProduccion_FasesFull.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTipartdsc_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'" + sPrefix + "',false,'" + sGXsfl_235_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTipartdsc_Internalname, GXutil.rtrim( AV76TipArtDsc), GXutil.rtrim( localUtil.format( AV76TipArtDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,67);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTipartdsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTipartdsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ConsultadeProduccion_FasesFull.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divTablecolor_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnom_Internalname, httpContext.getMessage( "N/Color", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'" + sPrefix + "',false,'" + sGXsfl_235_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnom_Internalname, GXutil.rtrim( AV82BarColNom), GXutil.rtrim( localUtil.format( AV82BarColNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,75);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ConsultadeProduccion_FasesFull.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnum_Internalname, httpContext.getMessage( "Número", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'" + sPrefix + "',false,'" + sGXsfl_235_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnum_Internalname, GXutil.ltrim( localUtil.ntoc( AV83BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV83BarColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV83BarColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,79);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ConsultadeProduccion_FasesFull.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divTablecolorcliente_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarnomcli_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarnomcli_Internalname, httpContext.getMessage( "Color Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'" + sPrefix + "',false,'" + sGXsfl_235_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarnomcli_Internalname, GXutil.rtrim( AV88BarNomCli), GXutil.rtrim( localUtil.format( AV88BarNomCli, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,87);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarnomcli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarnomcli_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ConsultadeProduccion_FasesFull.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarnumcli_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarnumcli_Internalname, httpContext.getMessage( "Número", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'" + sPrefix + "',false,'" + sGXsfl_235_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarnumcli_Internalname, GXutil.ltrim( localUtil.ntoc( AV89BarNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarnumcli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV89BarNumCli), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV89BarNumCli), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,91);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarnumcli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarnumcli_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ConsultadeProduccion_FasesFull.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divTablepesomedida_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarkgm_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarkgm_Internalname, httpContext.getMessage( "Kilos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'" + sPrefix + "',false,'" + sGXsfl_235_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarkgm_Internalname, GXutil.ltrim( localUtil.ntoc( AV84BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarkgm_Enabled!=0) ? localUtil.format( AV84BarKgm, "ZZZZZ9.99") : localUtil.format( AV84BarKgm, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,99);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarkgm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarkgm_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ConsultadeProduccion_FasesFull.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarmtr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarmtr_Internalname, httpContext.getMessage( "Metros", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'" + sPrefix + "',false,'" + sGXsfl_235_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarmtr_Internalname, GXutil.ltrim( localUtil.ntoc( AV85BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarmtr_Enabled!=0) ? localUtil.format( AV85BarMtr, "ZZZZZ9.99") : localUtil.format( AV85BarMtr, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,103);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarmtr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarmtr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ConsultadeProduccion_FasesFull.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarpie_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarpie_Internalname, httpContext.getMessage( "Piezas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'" + sPrefix + "',false,'" + sGXsfl_235_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarpie_Internalname, GXutil.ltrim( localUtil.ntoc( AV86BarPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarpie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV86BarPie), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV86BarPie), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,107);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarpie_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarpie_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ConsultadeProduccion_FasesFull.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarancaca1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarancaca1_Internalname, httpContext.getMessage( "Larg Acabado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'" + sPrefix + "',false,'" + sGXsfl_235_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarancaca1_Internalname, GXutil.ltrim( localUtil.ntoc( AV106BarAncAca1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarancaca1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV106BarAncAca1), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV106BarAncAca1), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,111);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarancaca1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarancaca1_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ConsultadeProduccion_FasesFull.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBargraaca_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBargraaca_Internalname, httpContext.getMessage( "Grm2 Acabado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 115,'" + sPrefix + "',false,'" + sGXsfl_235_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBargraaca_Internalname, GXutil.ltrim( localUtil.ntoc( AV107BarGraAca, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBargraaca_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV107BarGraAca), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV107BarGraAca), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,115);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBargraaca_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBargraaca_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ConsultadeProduccion_FasesFull.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablecol2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbrfen_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbrfen_Internalname, httpContext.getMessage( "Fecha Entrada", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 125,'" + sPrefix + "',false,'" + sGXsfl_235_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavAlbrfen_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbrfen_Internalname, localUtil.format(AV98AlbRFen, "99/99/99"), localUtil.format( AV98AlbRFen, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,125);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbrfen_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbrfen_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ConsultadeProduccion_FasesFull.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavAlbrfen_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavAlbrfen_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ConsultadeProduccion_FasesFull.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarfecgen_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarfecgen_Internalname, httpContext.getMessage( "Fecha Hdr", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 130,'" + sPrefix + "',false,'" + sGXsfl_235_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavBarfecgen_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfecgen_Internalname, localUtil.format(AV108BarFecGen, "99/99/99"), localUtil.format( AV108BarFecGen, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,130);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfecgen_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarfecgen_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ConsultadeProduccion_FasesFull.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavBarfecgen_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavBarfecgen_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ConsultadeProduccion_FasesFull.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarfeccli_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarfeccli_Internalname, httpContext.getMessage( "Fecha Enc. Cli.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 135,'" + sPrefix + "',false,'" + sGXsfl_235_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavBarfeccli_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfeccli_Internalname, localUtil.format(AV81BarFecCli, "99/99/99"), localUtil.format( AV81BarFecCli, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,135);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfeccli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarfeccli_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ConsultadeProduccion_FasesFull.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavBarfeccli_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavBarfeccli_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ConsultadeProduccion_FasesFull.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavForfecapr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavForfecapr_Internalname, httpContext.getMessage( "Fecha Aprob. Col.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 140,'" + sPrefix + "',false,'" + sGXsfl_235_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavForfecapr_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavForfecapr_Internalname, localUtil.format(AV99ForFecApr, "99/99/99"), localUtil.format( AV99ForFecApr, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,140);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavForfecapr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavForfecapr_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ConsultadeProduccion_FasesFull.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavForfecapr_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavForfecapr_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ConsultadeProduccion_FasesFull.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarfecfpr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarfecfpr_Internalname, httpContext.getMessage( "Fecha Ent.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 145,'" + sPrefix + "',false,'" + sGXsfl_235_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavBarfecfpr_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfecfpr_Internalname, localUtil.format(AV109BarFecFpr, "99/99/99"), localUtil.format( AV109BarFecFpr, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,145);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfecfpr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarfecfpr_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ConsultadeProduccion_FasesFull.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavBarfecfpr_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavBarfecfpr_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ConsultadeProduccion_FasesFull.htm");
         httpContext.writeTextNL( "</div>") ;
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablecompuestos_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablecompuesto1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBartra1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBartra1_Internalname, httpContext.getMessage( "Compuesto.1", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 156,'" + sPrefix + "',false,'" + sGXsfl_235_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBartra1_Internalname, GXutil.rtrim( AV100BarTra1), GXutil.rtrim( localUtil.format( AV100BarTra1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,156);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBartra1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBartra1_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ConsultadeProduccion_FasesFull.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBartrap1_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 160,'" + sPrefix + "',false,'" + sGXsfl_235_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBartrap1_Internalname, GXutil.ltrim( localUtil.ntoc( AV103BarTraP1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBartrap1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV103BarTraP1), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV103BarTraP1), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,160);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBartrap1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBartrap1_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ConsultadeProduccion_FasesFull.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBartra2_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 164,'" + sPrefix + "',false,'" + sGXsfl_235_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBartra2_Internalname, GXutil.rtrim( AV101BarTra2), GXutil.rtrim( localUtil.format( AV101BarTra2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,164);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBartra2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBartra2_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ConsultadeProduccion_FasesFull.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBartrap2_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 168,'" + sPrefix + "',false,'" + sGXsfl_235_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBartrap2_Internalname, GXutil.ltrim( localUtil.ntoc( AV104BarTraP2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBartrap2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV104BarTraP2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV104BarTraP2), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,168);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBartrap2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBartrap2_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ConsultadeProduccion_FasesFull.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBartra3_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 172,'" + sPrefix + "',false,'" + sGXsfl_235_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBartra3_Internalname, GXutil.rtrim( AV102BarTra3), GXutil.rtrim( localUtil.format( AV102BarTra3, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,172);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBartra3_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBartra3_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ConsultadeProduccion_FasesFull.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBartrap3_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 176,'" + sPrefix + "',false,'" + sGXsfl_235_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBartrap3_Internalname, GXutil.ltrim( localUtil.ntoc( AV105BarTraP3, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBartrap3_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV105BarTraP3), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV105BarTraP3), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,176);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBartrap3_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBartrap3_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ConsultadeProduccion_FasesFull.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablecompuesto2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarurd1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarurd1_Internalname, httpContext.getMessage( "Compuesto.2", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 183,'" + sPrefix + "',false,'" + sGXsfl_235_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarurd1_Internalname, GXutil.rtrim( AV114BarUrd1), GXutil.rtrim( localUtil.format( AV114BarUrd1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,183);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarurd1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarurd1_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ConsultadeProduccion_FasesFull.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarurdp1_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 187,'" + sPrefix + "',false,'" + sGXsfl_235_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarurdp1_Internalname, GXutil.ltrim( localUtil.ntoc( AV112BarUrdP1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarurdp1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV112BarUrdP1), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV112BarUrdP1), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,187);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarurdp1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarurdp1_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ConsultadeProduccion_FasesFull.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarurd2_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 191,'" + sPrefix + "',false,'" + sGXsfl_235_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarurd2_Internalname, GXutil.rtrim( AV110BarUrd2), GXutil.rtrim( localUtil.format( AV110BarUrd2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,191);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarurd2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarurd2_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ConsultadeProduccion_FasesFull.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarurdp2_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 195,'" + sPrefix + "',false,'" + sGXsfl_235_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarurdp2_Internalname, GXutil.ltrim( localUtil.ntoc( AV115BarUrdP2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarurdp2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV115BarUrdP2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV115BarUrdP2), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,195);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarurdp2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarurdp2_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ConsultadeProduccion_FasesFull.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarurd3_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 199,'" + sPrefix + "',false,'" + sGXsfl_235_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarurd3_Internalname, GXutil.rtrim( AV111BarUrd3), GXutil.rtrim( localUtil.format( AV111BarUrd3, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,199);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarurd3_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarurd3_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ConsultadeProduccion_FasesFull.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarurdp3_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 203,'" + sPrefix + "',false,'" + sGXsfl_235_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarurdp3_Internalname, GXutil.ltrim( localUtil.ntoc( AV113BarUrdP3, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarurdp3_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV113BarUrdP3), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV113BarUrdP3), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,203);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarurdp3_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarurdp3_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ConsultadeProduccion_FasesFull.htm");
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
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 214,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 235, 3, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ConsultadeProduccion_FasesFull.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 216,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 235, 3, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ConsultadeProduccion_FasesFull.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 218,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 235, 3, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 7, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e1123b1_client"+"'", TempTags, "", 2, "HLP_ConsultadeProduccion_FasesFull.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 220,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnpdf_win_Internalname, "gx.evt.setGridEvt("+GXutil.str( 235, 3, 0)+","+"null"+");", httpContext.getMessage( "Pdf (Win)", ""), bttBtnpdf_win_Jsonclick, 5, httpContext.getMessage( "Pdf (Win)", ""), "", StyleString, ClassString, bttBtnpdf_win_Visible, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOPDF_WIN\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ConsultadeProduccion_FasesFull.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 222,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 235, 3, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ConsultadeProduccion_FasesFull.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_224_23B2( true) ;
      }
      else
      {
         wb_table1_224_23B2( false) ;
      }
      return  ;
   }

   public void wb_table1_224_23B2e( boolean wbgen )
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
         startgridcontrol235( ) ;
      }
      if ( wbEnd == 235 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_235 = (int)(nGXsfl_235_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV24GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV25GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, sPrefix+"GRIDPAGINATIONBARContainer");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV118Pgmname), GXutil.rtrim( localUtil.format( AV118Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ConsultadeProduccion_FasesFull.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV16DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, 0, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ConsultadeProduccion_FasesFull.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "Attribute", "", "", "", "", edtBarCod_Visible, 0, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ConsultadeProduccion_FasesFull.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "Attribute", "", "", "", "", edtBarCodReo_Visible, 0, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ConsultadeProduccion_FasesFull.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "Attribute", "", "", "", "", edtBarCodPar_Visible, 0, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ConsultadeProduccion_FasesFull.htm");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, sPrefix+"INNEWWINDOW1Container");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV16DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV9ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_barfasdtiauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 273,'" + sPrefix + "',false,'" + sGXsfl_235_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_barfasdtiauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_barfasdtiauxdate_Internalname, localUtil.format(AV14DDO_BarFasDTIAuxDate, "99/99/99"), localUtil.format( AV14DDO_BarFasDTIAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,273);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_barfasdtiauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ConsultadeProduccion_FasesFull.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_barfasdtiauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ConsultadeProduccion_FasesFull.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 235 )
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

   public void start23B2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Consulta de Fases Produccion", ""), (short)(0)) ;
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
            strup23B0( ) ;
         }
      }
   }

   public void ws23B2( )
   {
      start23B2( ) ;
      evt23B2( ) ;
   }

   public void evt23B2( )
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
                              strup23B0( ) ;
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
                              strup23B0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1223B2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup23B0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1323B2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup23B0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1423B2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup23B0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1523B2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOPDF_HDR'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup23B0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoPdf_Hdr' */
                                 e1623B2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup23B0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e1723B2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup23B0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e1823B2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOPDF_WIN'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup23B0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoPdf_win' */
                                 e1923B2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOPDF_PRODCLIENTE'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup23B0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoPDF_ProdCliente' */
                                 e2023B2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup23B0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavDiscod_Internalname ;
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
                              strup23B0( ) ;
                           }
                           nGXsfl_235_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_235_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_235_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_2352( ) ;
                           A194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
                           A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
                           A150BarFacTin = GXutil.upper( httpContext.cgiGet( edtBarFacTin_Internalname)) ;
                           A603MaqCodBis = httpContext.cgiGet( edtMaqCodBis_Internalname) ;
                           AV34MaqDsc = httpContext.cgiGet( edtavMaqdsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMaqdsc_Internalname, AV34MaqDsc);
                           A4442BarFasDTI = localUtil.ctot( httpContext.cgiGet( edtBarFasDTI_Internalname), 0) ;
                           n4442BarFasDTI = false ;
                           AV8BarFasDTF = httpContext.cgiGet( edtavBarfasdtf_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarfasdtf_Internalname, AV8BarFasDTF);
                           A215BarTieRea = localUtil.ctond( httpContext.cgiGet( edtBarTieRea_Internalname)) ;
                           AV41Situacion = httpContext.cgiGet( edtavSituacion_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavSituacion_Internalname, AV41Situacion);
                           cmbBarFasEst.setName( cmbBarFasEst.getInternalname() );
                           cmbBarFasEst.setValue( httpContext.cgiGet( cmbBarFasEst.getInternalname()) );
                           A153BarFasEst = (byte)(GXutil.lval( httpContext.cgiGet( cmbBarFasEst.getInternalname()))) ;
                           A3837BarFasKgm = localUtil.ctond( httpContext.cgiGet( edtBarFasKgm_Internalname)) ;
                           n3837BarFasKgm = false ;
                           A3838BarFasMtr = localUtil.ctond( httpContext.cgiGet( edtBarFasMtr_Internalname)) ;
                           n3838BarFasMtr = false ;
                           AV35OpeNom = httpContext.cgiGet( edtavOpenom_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOpenom_Internalname, AV35OpeNom);
                           A3836BarFasPri = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarFasPri_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
                                       GX_FocusControl = edtavDiscod_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e2123B2 ();
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
                                       GX_FocusControl = edtavDiscod_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e2223B2 ();
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
                                       GX_FocusControl = edtavDiscod_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e2323B2 ();
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
                                    strup23B0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavDiscod_Internalname ;
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

   public void we23B2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm23B2( ) ;
         }
      }
   }

   public void pa23B2( )
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
            GX_FocusControl = edtavDiscod_Internalname ;
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
      subsflControlProps_2352( ) ;
      while ( nGXsfl_235_idx <= nRC_GXsfl_235 )
      {
         sendrow_2352( ) ;
         nGXsfl_235_idx = ((subGrid_Islastpage==1)&&(nGXsfl_235_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_235_idx+1) ;
         sGXsfl_235_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_235_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_2352( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV17EmprCod ,
                                 int AV5BarCod ,
                                 byte AV7BarCodReo ,
                                 String AV6BarCodPar ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV9ColumnsSelector ,
                                 short AV56TFBarOrdLin ,
                                 short AV57TFBarOrdLin_To ,
                                 String AV60TFFasCod ,
                                 String AV61TFFasCod_Sel ,
                                 String AV62TFFasDsc ,
                                 String AV63TFFasDsc_Sel ,
                                 String AV64TFMaqCodBis ,
                                 String AV65TFMaqCodBis_Sel ,
                                 java.util.Date AV46TFBarFasDTI ,
                                 java.math.BigDecimal AV58TFBarTieRea ,
                                 java.math.BigDecimal AV59TFBarTieRea_To ,
                                 GXSimpleCollection<Byte> AV48TFBarFasEst_Sels ,
                                 java.math.BigDecimal AV50TFBarFasKgm ,
                                 java.math.BigDecimal AV51TFBarFasKgm_To ,
                                 java.math.BigDecimal AV52TFBarFasMtr ,
                                 java.math.BigDecimal AV53TFBarFasMtr_To ,
                                 byte AV54TFBarFasPri ,
                                 byte AV55TFBarFasPri_To ,
                                 String AV118Pgmname ,
                                 short AV36OrderedBy ,
                                 boolean AV38OrderedDsc ,
                                 String A2689ExHdrFas ,
                                 String AV22FasCod ,
                                 java.util.Date A2697ExHdrFeE ,
                                 java.util.Date A2700ExHdrFeR ,
                                 String AV119Consultadeproduccion_fasesfullds_1_emprcod ,
                                 int AV120Consultadeproduccion_fasesfullds_2_barcod ,
                                 byte AV121Consultadeproduccion_fasesfullds_3_barcodreo ,
                                 String AV122Consultadeproduccion_fasesfullds_4_barcodpar ,
                                 byte AV93Dorado ,
                                 byte AV94Moda21 ,
                                 int AV72CliCod ,
                                 String AV74BarSer ,
                                 String AV82BarColNom ,
                                 int AV83BarColNum ,
                                 java.util.Date AV98AlbRFen ,
                                 java.util.Date AV99ForFecApr ,
                                 String A396EmprCod ,
                                 int A129BarCod ,
                                 byte A132BarCodReo ,
                                 String A130BarCodPar ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e2223B2 ();
      GRID_nCurrentRecord = 0 ;
      rf23B2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ConsultadeProduccion_FasesFull");
      forbiddenHiddens.add("CliCod", localUtil.format( DecimalUtil.doubleToDec(AV72CliCod), "ZZZZZ9"));
      forbiddenHiddens.add("BarSer", GXutil.rtrim( localUtil.format( AV74BarSer, "")));
      forbiddenHiddens.add("BarColNom", GXutil.rtrim( localUtil.format( AV82BarColNom, "")));
      forbiddenHiddens.add("BarColNum", localUtil.format( DecimalUtil.doubleToDec(AV83BarColNum), "ZZZZZ9"));
      forbiddenHiddens.add("AlbRFen", localUtil.format(AV98AlbRFen, "99/99/99"));
      forbiddenHiddens.add("ForFecApr", localUtil.format(AV99ForFecApr, "99/99/99"));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV118Pgmname, "")));
      forbiddenHiddens.add("EmprCod", GXutil.rtrim( localUtil.format( A396EmprCod, "@!")));
      forbiddenHiddens.add("BarCod", localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"));
      forbiddenHiddens.add("BarCodReo", localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"));
      forbiddenHiddens.add("BarCodPar", GXutil.rtrim( localUtil.format( A130BarCodPar, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("consultadeproduccion_fasesfull:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf23B2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV118Pgmname = "ConsultadeProduccion_FasesFull" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV118Pgmname", AV118Pgmname);
      Gx_err = (short)(0) ;
      edtavDiscod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiscod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiscod_Enabled), 5, 0), true);
      edtavEnccli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEnccli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEnccli_Enabled), 5, 0), true);
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavBarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarser_Enabled), 5, 0), true);
      edtavBarserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarserdsc_Enabled), 5, 0), true);
      edtavTipartdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTipartdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipartdsc_Enabled), 5, 0), true);
      edtavBarcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnom_Enabled), 5, 0), true);
      edtavBarcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnum_Enabled), 5, 0), true);
      edtavBarnomcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarnomcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnomcli_Enabled), 5, 0), true);
      edtavBarnumcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarnumcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnumcli_Enabled), 5, 0), true);
      edtavBarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm_Enabled), 5, 0), true);
      edtavBarmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmtr_Enabled), 5, 0), true);
      edtavBarpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpie_Enabled), 5, 0), true);
      edtavBarancaca1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarancaca1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarancaca1_Enabled), 5, 0), true);
      edtavBargraaca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBargraaca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBargraaca_Enabled), 5, 0), true);
      edtavAlbrfen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlbrfen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbrfen_Enabled), 5, 0), true);
      edtavBarfecgen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarfecgen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfecgen_Enabled), 5, 0), true);
      edtavBarfeccli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarfeccli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfeccli_Enabled), 5, 0), true);
      edtavForfecapr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavForfecapr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavForfecapr_Enabled), 5, 0), true);
      edtavBarfecfpr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarfecfpr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfecfpr_Enabled), 5, 0), true);
      edtavBartra1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBartra1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBartra1_Enabled), 5, 0), true);
      edtavBartrap1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBartrap1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBartrap1_Enabled), 5, 0), true);
      edtavBartra2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBartra2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBartra2_Enabled), 5, 0), true);
      edtavBartrap2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBartrap2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBartrap2_Enabled), 5, 0), true);
      edtavBartra3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBartra3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBartra3_Enabled), 5, 0), true);
      edtavBartrap3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBartrap3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBartrap3_Enabled), 5, 0), true);
      edtavBarurd1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarurd1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarurd1_Enabled), 5, 0), true);
      edtavBarurdp1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarurdp1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarurdp1_Enabled), 5, 0), true);
      edtavBarurd2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarurd2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarurd2_Enabled), 5, 0), true);
      edtavBarurdp2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarurdp2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarurdp2_Enabled), 5, 0), true);
      edtavBarurd3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarurd3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarurd3_Enabled), 5, 0), true);
      edtavBarurdp3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarurdp3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarurdp3_Enabled), 5, 0), true);
      edtavMaqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMaqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqdsc_Enabled), 5, 0), !bGXsfl_235_Refreshing);
      edtavBarfasdtf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarfasdtf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfasdtf_Enabled), 5, 0), !bGXsfl_235_Refreshing);
      edtavSituacion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSituacion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSituacion_Enabled), 5, 0), !bGXsfl_235_Refreshing);
      edtavOpenom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavOpenom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOpenom_Enabled), 5, 0), !bGXsfl_235_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf23B2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(235) ;
      /* Execute user event: Refresh */
      e2223B2 ();
      nGXsfl_235_idx = 1 ;
      sGXsfl_235_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_235_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_2352( ) ;
      bGXsfl_235_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
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
         subsflControlProps_2352( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Byte.valueOf(A153BarFasEst) ,
                                              AV134Consultadeproduccion_fasesfullds_16_tfbarfasest_sels ,
                                              Short.valueOf(AV123Consultadeproduccion_fasesfullds_5_tfbarordlin) ,
                                              Short.valueOf(AV124Consultadeproduccion_fasesfullds_6_tfbarordlin_to) ,
                                              AV126Consultadeproduccion_fasesfullds_8_tffascod_sel ,
                                              AV125Consultadeproduccion_fasesfullds_7_tffascod ,
                                              AV128Consultadeproduccion_fasesfullds_10_tffasdsc_sel ,
                                              AV127Consultadeproduccion_fasesfullds_9_tffasdsc ,
                                              AV130Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel ,
                                              AV129Consultadeproduccion_fasesfullds_11_tfmaqcodbis ,
                                              AV131Consultadeproduccion_fasesfullds_13_tfbarfasdti ,
                                              AV132Consultadeproduccion_fasesfullds_14_tfbartierea ,
                                              AV133Consultadeproduccion_fasesfullds_15_tfbartierea_to ,
                                              Integer.valueOf(AV134Consultadeproduccion_fasesfullds_16_tfbarfasest_sels.size()) ,
                                              AV135Consultadeproduccion_fasesfullds_17_tfbarfaskgm ,
                                              AV136Consultadeproduccion_fasesfullds_18_tfbarfaskgm_to ,
                                              AV137Consultadeproduccion_fasesfullds_19_tfbarfasmtr ,
                                              AV138Consultadeproduccion_fasesfullds_20_tfbarfasmtr_to ,
                                              Byte.valueOf(AV139Consultadeproduccion_fasesfullds_21_tfbarfaspri) ,
                                              Byte.valueOf(AV140Consultadeproduccion_fasesfullds_22_tfbarfaspri_to) ,
                                              Short.valueOf(A194BarOrdLin) ,
                                              A457FasCod ,
                                              A460FasDsc ,
                                              A603MaqCodBis ,
                                              A4442BarFasDTI ,
                                              A215BarTieRea ,
                                              A3837BarFasKgm ,
                                              A3838BarFasMtr ,
                                              Byte.valueOf(A3836BarFasPri) ,
                                              Short.valueOf(AV36OrderedBy) ,
                                              Boolean.valueOf(AV38OrderedDsc) ,
                                              A396EmprCod ,
                                              AV17EmprCod ,
                                              Integer.valueOf(A129BarCod) ,
                                              Integer.valueOf(AV5BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              Byte.valueOf(AV7BarCodReo) ,
                                              A130BarCodPar ,
                                              AV6BarCodPar ,
                                              AV119Consultadeproduccion_fasesfullds_1_emprcod ,
                                              Integer.valueOf(AV120Consultadeproduccion_fasesfullds_2_barcod) ,
                                              Byte.valueOf(AV121Consultadeproduccion_fasesfullds_3_barcodreo) ,
                                              AV122Consultadeproduccion_fasesfullds_4_barcodpar } ,
                                              new int[]{
                                              TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                              TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BOOLEAN,
                                              TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                              }
         });
         lV125Consultadeproduccion_fasesfullds_7_tffascod = GXutil.padr( GXutil.rtrim( AV125Consultadeproduccion_fasesfullds_7_tffascod), 8, "%") ;
         lV127Consultadeproduccion_fasesfullds_9_tffasdsc = GXutil.padr( GXutil.rtrim( AV127Consultadeproduccion_fasesfullds_9_tffasdsc), 28, "%") ;
         lV129Consultadeproduccion_fasesfullds_11_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV129Consultadeproduccion_fasesfullds_11_tfmaqcodbis), 6, "%") ;
         /* Using cursor H023B2 */
         pr_default.execute(0, new Object[] {AV119Consultadeproduccion_fasesfullds_1_emprcod, Integer.valueOf(AV120Consultadeproduccion_fasesfullds_2_barcod), Byte.valueOf(AV121Consultadeproduccion_fasesfullds_3_barcodreo), AV122Consultadeproduccion_fasesfullds_4_barcodpar, AV17EmprCod, Integer.valueOf(AV5BarCod), Byte.valueOf(AV7BarCodReo), AV6BarCodPar, Short.valueOf(AV123Consultadeproduccion_fasesfullds_5_tfbarordlin), Short.valueOf(AV124Consultadeproduccion_fasesfullds_6_tfbarordlin_to), lV125Consultadeproduccion_fasesfullds_7_tffascod, AV126Consultadeproduccion_fasesfullds_8_tffascod_sel, lV127Consultadeproduccion_fasesfullds_9_tffasdsc, AV128Consultadeproduccion_fasesfullds_10_tffasdsc_sel, lV129Consultadeproduccion_fasesfullds_11_tfmaqcodbis, AV130Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel, AV131Consultadeproduccion_fasesfullds_13_tfbarfasdti, AV132Consultadeproduccion_fasesfullds_14_tfbartierea, AV133Consultadeproduccion_fasesfullds_15_tfbartierea_to, AV135Consultadeproduccion_fasesfullds_17_tfbarfaskgm, AV136Consultadeproduccion_fasesfullds_18_tfbarfaskgm_to, AV137Consultadeproduccion_fasesfullds_19_tfbarfasmtr, AV138Consultadeproduccion_fasesfullds_20_tfbarfasmtr_to, Byte.valueOf(AV139Consultadeproduccion_fasesfullds_21_tfbarfaspri), Byte.valueOf(AV140Consultadeproduccion_fasesfullds_22_tfbarfaspri_to), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_235_idx = 1 ;
         sGXsfl_235_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_235_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_2352( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H023B2_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
            A129BarCod = H023B2_A129BarCod[0] ;
            n129BarCod = H023B2_n129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = H023B2_A132BarCodReo[0] ;
            n132BarCodReo = H023B2_n132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = H023B2_A130BarCodPar[0] ;
            n130BarCodPar = H023B2_n130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A130BarCodPar", A130BarCodPar);
            A4443BarFasDTF = H023B2_A4443BarFasDTF[0] ;
            n4443BarFasDTF = H023B2_n4443BarFasDTF[0] ;
            A2265BarExt = H023B2_A2265BarExt[0] ;
            n2265BarExt = H023B2_n2265BarExt[0] ;
            A148BarEstReo = H023B2_A148BarEstReo[0] ;
            A6173BarFasSec = H023B2_A6173BarFasSec[0] ;
            n6173BarFasSec = H023B2_n6173BarFasSec[0] ;
            A934BarReoCod = H023B2_A934BarReoCod[0] ;
            A936BarReoReo = H023B2_A936BarReoReo[0] ;
            A935BarReoPar = H023B2_A935BarReoPar[0] ;
            A3836BarFasPri = H023B2_A3836BarFasPri[0] ;
            A3838BarFasMtr = H023B2_A3838BarFasMtr[0] ;
            n3838BarFasMtr = H023B2_n3838BarFasMtr[0] ;
            A3837BarFasKgm = H023B2_A3837BarFasKgm[0] ;
            n3837BarFasKgm = H023B2_n3837BarFasKgm[0] ;
            A153BarFasEst = H023B2_A153BarFasEst[0] ;
            A215BarTieRea = H023B2_A215BarTieRea[0] ;
            A4442BarFasDTI = H023B2_A4442BarFasDTI[0] ;
            n4442BarFasDTI = H023B2_n4442BarFasDTI[0] ;
            A603MaqCodBis = H023B2_A603MaqCodBis[0] ;
            A150BarFacTin = H023B2_A150BarFacTin[0] ;
            A460FasDsc = H023B2_A460FasDsc[0] ;
            A457FasCod = H023B2_A457FasCod[0] ;
            A194BarOrdLin = H023B2_A194BarOrdLin[0] ;
            A2265BarExt = H023B2_A2265BarExt[0] ;
            n2265BarExt = H023B2_n2265BarExt[0] ;
            A148BarEstReo = H023B2_A148BarEstReo[0] ;
            A934BarReoCod = H023B2_A934BarReoCod[0] ;
            A936BarReoReo = H023B2_A936BarReoReo[0] ;
            A935BarReoPar = H023B2_A935BarReoPar[0] ;
            A460FasDsc = H023B2_A460FasDsc[0] ;
            e2323B2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(235) ;
         wb23B0( ) ;
      }
      bGXsfl_235_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes23B2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFASCOD", GXutil.rtrim( AV22FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFASCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV22FasCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vDORADO", GXutil.ltrim( localUtil.ntoc( AV93Dorado, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vDORADO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV93Dorado), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMODA21", GXutil.ltrim( localUtil.ntoc( AV94Moda21, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV94Moda21), "9")));
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
      AV119Consultadeproduccion_fasesfullds_1_emprcod = AV17EmprCod ;
      AV120Consultadeproduccion_fasesfullds_2_barcod = AV5BarCod ;
      AV121Consultadeproduccion_fasesfullds_3_barcodreo = AV7BarCodReo ;
      AV122Consultadeproduccion_fasesfullds_4_barcodpar = AV6BarCodPar ;
      AV123Consultadeproduccion_fasesfullds_5_tfbarordlin = AV56TFBarOrdLin ;
      AV124Consultadeproduccion_fasesfullds_6_tfbarordlin_to = AV57TFBarOrdLin_To ;
      AV125Consultadeproduccion_fasesfullds_7_tffascod = AV60TFFasCod ;
      AV126Consultadeproduccion_fasesfullds_8_tffascod_sel = AV61TFFasCod_Sel ;
      AV127Consultadeproduccion_fasesfullds_9_tffasdsc = AV62TFFasDsc ;
      AV128Consultadeproduccion_fasesfullds_10_tffasdsc_sel = AV63TFFasDsc_Sel ;
      AV129Consultadeproduccion_fasesfullds_11_tfmaqcodbis = AV64TFMaqCodBis ;
      AV130Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel = AV65TFMaqCodBis_Sel ;
      AV131Consultadeproduccion_fasesfullds_13_tfbarfasdti = AV46TFBarFasDTI ;
      AV132Consultadeproduccion_fasesfullds_14_tfbartierea = AV58TFBarTieRea ;
      AV133Consultadeproduccion_fasesfullds_15_tfbartierea_to = AV59TFBarTieRea_To ;
      AV134Consultadeproduccion_fasesfullds_16_tfbarfasest_sels = AV48TFBarFasEst_Sels ;
      AV135Consultadeproduccion_fasesfullds_17_tfbarfaskgm = AV50TFBarFasKgm ;
      AV136Consultadeproduccion_fasesfullds_18_tfbarfaskgm_to = AV51TFBarFasKgm_To ;
      AV137Consultadeproduccion_fasesfullds_19_tfbarfasmtr = AV52TFBarFasMtr ;
      AV138Consultadeproduccion_fasesfullds_20_tfbarfasmtr_to = AV53TFBarFasMtr_To ;
      AV139Consultadeproduccion_fasesfullds_21_tfbarfaspri = AV54TFBarFasPri ;
      AV140Consultadeproduccion_fasesfullds_22_tfbarfaspri_to = AV55TFBarFasPri_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(A153BarFasEst) ,
                                           AV134Consultadeproduccion_fasesfullds_16_tfbarfasest_sels ,
                                           Short.valueOf(AV123Consultadeproduccion_fasesfullds_5_tfbarordlin) ,
                                           Short.valueOf(AV124Consultadeproduccion_fasesfullds_6_tfbarordlin_to) ,
                                           AV126Consultadeproduccion_fasesfullds_8_tffascod_sel ,
                                           AV125Consultadeproduccion_fasesfullds_7_tffascod ,
                                           AV128Consultadeproduccion_fasesfullds_10_tffasdsc_sel ,
                                           AV127Consultadeproduccion_fasesfullds_9_tffasdsc ,
                                           AV130Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel ,
                                           AV129Consultadeproduccion_fasesfullds_11_tfmaqcodbis ,
                                           AV131Consultadeproduccion_fasesfullds_13_tfbarfasdti ,
                                           AV132Consultadeproduccion_fasesfullds_14_tfbartierea ,
                                           AV133Consultadeproduccion_fasesfullds_15_tfbartierea_to ,
                                           Integer.valueOf(AV134Consultadeproduccion_fasesfullds_16_tfbarfasest_sels.size()) ,
                                           AV135Consultadeproduccion_fasesfullds_17_tfbarfaskgm ,
                                           AV136Consultadeproduccion_fasesfullds_18_tfbarfaskgm_to ,
                                           AV137Consultadeproduccion_fasesfullds_19_tfbarfasmtr ,
                                           AV138Consultadeproduccion_fasesfullds_20_tfbarfasmtr_to ,
                                           Byte.valueOf(AV139Consultadeproduccion_fasesfullds_21_tfbarfaspri) ,
                                           Byte.valueOf(AV140Consultadeproduccion_fasesfullds_22_tfbarfaspri_to) ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A603MaqCodBis ,
                                           A4442BarFasDTI ,
                                           A215BarTieRea ,
                                           A3837BarFasKgm ,
                                           A3838BarFasMtr ,
                                           Byte.valueOf(A3836BarFasPri) ,
                                           Short.valueOf(AV36OrderedBy) ,
                                           Boolean.valueOf(AV38OrderedDsc) ,
                                           A396EmprCod ,
                                           AV17EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV5BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV7BarCodReo) ,
                                           A130BarCodPar ,
                                           AV6BarCodPar ,
                                           AV119Consultadeproduccion_fasesfullds_1_emprcod ,
                                           Integer.valueOf(AV120Consultadeproduccion_fasesfullds_2_barcod) ,
                                           Byte.valueOf(AV121Consultadeproduccion_fasesfullds_3_barcodreo) ,
                                           AV122Consultadeproduccion_fasesfullds_4_barcodpar } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BOOLEAN,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV125Consultadeproduccion_fasesfullds_7_tffascod = GXutil.padr( GXutil.rtrim( AV125Consultadeproduccion_fasesfullds_7_tffascod), 8, "%") ;
      lV127Consultadeproduccion_fasesfullds_9_tffasdsc = GXutil.padr( GXutil.rtrim( AV127Consultadeproduccion_fasesfullds_9_tffasdsc), 28, "%") ;
      lV129Consultadeproduccion_fasesfullds_11_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV129Consultadeproduccion_fasesfullds_11_tfmaqcodbis), 6, "%") ;
      /* Using cursor H023B3 */
      pr_default.execute(1, new Object[] {AV119Consultadeproduccion_fasesfullds_1_emprcod, Integer.valueOf(AV120Consultadeproduccion_fasesfullds_2_barcod), Byte.valueOf(AV121Consultadeproduccion_fasesfullds_3_barcodreo), AV122Consultadeproduccion_fasesfullds_4_barcodpar, AV17EmprCod, Integer.valueOf(AV5BarCod), Byte.valueOf(AV7BarCodReo), AV6BarCodPar, Short.valueOf(AV123Consultadeproduccion_fasesfullds_5_tfbarordlin), Short.valueOf(AV124Consultadeproduccion_fasesfullds_6_tfbarordlin_to), lV125Consultadeproduccion_fasesfullds_7_tffascod, AV126Consultadeproduccion_fasesfullds_8_tffascod_sel, lV127Consultadeproduccion_fasesfullds_9_tffasdsc, AV128Consultadeproduccion_fasesfullds_10_tffasdsc_sel, lV129Consultadeproduccion_fasesfullds_11_tfmaqcodbis, AV130Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel, AV131Consultadeproduccion_fasesfullds_13_tfbarfasdti, AV132Consultadeproduccion_fasesfullds_14_tfbartierea, AV133Consultadeproduccion_fasesfullds_15_tfbartierea_to, AV135Consultadeproduccion_fasesfullds_17_tfbarfaskgm, AV136Consultadeproduccion_fasesfullds_18_tfbarfaskgm_to, AV137Consultadeproduccion_fasesfullds_19_tfbarfasmtr, AV138Consultadeproduccion_fasesfullds_20_tfbarfasmtr_to, Byte.valueOf(AV139Consultadeproduccion_fasesfullds_21_tfbarfaspri), Byte.valueOf(AV140Consultadeproduccion_fasesfullds_22_tfbarfaspri_to)});
      GRID_nRecordCount = H023B3_AGRID_nRecordCount[0] ;
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
      AV119Consultadeproduccion_fasesfullds_1_emprcod = AV17EmprCod ;
      AV120Consultadeproduccion_fasesfullds_2_barcod = AV5BarCod ;
      AV121Consultadeproduccion_fasesfullds_3_barcodreo = AV7BarCodReo ;
      AV122Consultadeproduccion_fasesfullds_4_barcodpar = AV6BarCodPar ;
      AV123Consultadeproduccion_fasesfullds_5_tfbarordlin = AV56TFBarOrdLin ;
      AV124Consultadeproduccion_fasesfullds_6_tfbarordlin_to = AV57TFBarOrdLin_To ;
      AV125Consultadeproduccion_fasesfullds_7_tffascod = AV60TFFasCod ;
      AV126Consultadeproduccion_fasesfullds_8_tffascod_sel = AV61TFFasCod_Sel ;
      AV127Consultadeproduccion_fasesfullds_9_tffasdsc = AV62TFFasDsc ;
      AV128Consultadeproduccion_fasesfullds_10_tffasdsc_sel = AV63TFFasDsc_Sel ;
      AV129Consultadeproduccion_fasesfullds_11_tfmaqcodbis = AV64TFMaqCodBis ;
      AV130Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel = AV65TFMaqCodBis_Sel ;
      AV131Consultadeproduccion_fasesfullds_13_tfbarfasdti = AV46TFBarFasDTI ;
      AV132Consultadeproduccion_fasesfullds_14_tfbartierea = AV58TFBarTieRea ;
      AV133Consultadeproduccion_fasesfullds_15_tfbartierea_to = AV59TFBarTieRea_To ;
      AV134Consultadeproduccion_fasesfullds_16_tfbarfasest_sels = AV48TFBarFasEst_Sels ;
      AV135Consultadeproduccion_fasesfullds_17_tfbarfaskgm = AV50TFBarFasKgm ;
      AV136Consultadeproduccion_fasesfullds_18_tfbarfaskgm_to = AV51TFBarFasKgm_To ;
      AV137Consultadeproduccion_fasesfullds_19_tfbarfasmtr = AV52TFBarFasMtr ;
      AV138Consultadeproduccion_fasesfullds_20_tfbarfasmtr_to = AV53TFBarFasMtr_To ;
      AV139Consultadeproduccion_fasesfullds_21_tfbarfaspri = AV54TFBarFasPri ;
      AV140Consultadeproduccion_fasesfullds_22_tfbarfaspri_to = AV55TFBarFasPri_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV17EmprCod, AV5BarCod, AV7BarCodReo, AV6BarCodPar, AV9ColumnsSelector, AV56TFBarOrdLin, AV57TFBarOrdLin_To, AV60TFFasCod, AV61TFFasCod_Sel, AV62TFFasDsc, AV63TFFasDsc_Sel, AV64TFMaqCodBis, AV65TFMaqCodBis_Sel, AV46TFBarFasDTI, AV58TFBarTieRea, AV59TFBarTieRea_To, AV48TFBarFasEst_Sels, AV50TFBarFasKgm, AV51TFBarFasKgm_To, AV52TFBarFasMtr, AV53TFBarFasMtr_To, AV54TFBarFasPri, AV55TFBarFasPri_To, AV118Pgmname, AV36OrderedBy, AV38OrderedDsc, A2689ExHdrFas, AV22FasCod, A2697ExHdrFeE, A2700ExHdrFeR, AV119Consultadeproduccion_fasesfullds_1_emprcod, AV120Consultadeproduccion_fasesfullds_2_barcod, AV121Consultadeproduccion_fasesfullds_3_barcodreo, AV122Consultadeproduccion_fasesfullds_4_barcodpar, AV93Dorado, AV94Moda21, AV72CliCod, AV74BarSer, AV82BarColNom, AV83BarColNum, AV98AlbRFen, AV99ForFecApr, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV119Consultadeproduccion_fasesfullds_1_emprcod = AV17EmprCod ;
      AV120Consultadeproduccion_fasesfullds_2_barcod = AV5BarCod ;
      AV121Consultadeproduccion_fasesfullds_3_barcodreo = AV7BarCodReo ;
      AV122Consultadeproduccion_fasesfullds_4_barcodpar = AV6BarCodPar ;
      AV123Consultadeproduccion_fasesfullds_5_tfbarordlin = AV56TFBarOrdLin ;
      AV124Consultadeproduccion_fasesfullds_6_tfbarordlin_to = AV57TFBarOrdLin_To ;
      AV125Consultadeproduccion_fasesfullds_7_tffascod = AV60TFFasCod ;
      AV126Consultadeproduccion_fasesfullds_8_tffascod_sel = AV61TFFasCod_Sel ;
      AV127Consultadeproduccion_fasesfullds_9_tffasdsc = AV62TFFasDsc ;
      AV128Consultadeproduccion_fasesfullds_10_tffasdsc_sel = AV63TFFasDsc_Sel ;
      AV129Consultadeproduccion_fasesfullds_11_tfmaqcodbis = AV64TFMaqCodBis ;
      AV130Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel = AV65TFMaqCodBis_Sel ;
      AV131Consultadeproduccion_fasesfullds_13_tfbarfasdti = AV46TFBarFasDTI ;
      AV132Consultadeproduccion_fasesfullds_14_tfbartierea = AV58TFBarTieRea ;
      AV133Consultadeproduccion_fasesfullds_15_tfbartierea_to = AV59TFBarTieRea_To ;
      AV134Consultadeproduccion_fasesfullds_16_tfbarfasest_sels = AV48TFBarFasEst_Sels ;
      AV135Consultadeproduccion_fasesfullds_17_tfbarfaskgm = AV50TFBarFasKgm ;
      AV136Consultadeproduccion_fasesfullds_18_tfbarfaskgm_to = AV51TFBarFasKgm_To ;
      AV137Consultadeproduccion_fasesfullds_19_tfbarfasmtr = AV52TFBarFasMtr ;
      AV138Consultadeproduccion_fasesfullds_20_tfbarfasmtr_to = AV53TFBarFasMtr_To ;
      AV139Consultadeproduccion_fasesfullds_21_tfbarfaspri = AV54TFBarFasPri ;
      AV140Consultadeproduccion_fasesfullds_22_tfbarfaspri_to = AV55TFBarFasPri_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV17EmprCod, AV5BarCod, AV7BarCodReo, AV6BarCodPar, AV9ColumnsSelector, AV56TFBarOrdLin, AV57TFBarOrdLin_To, AV60TFFasCod, AV61TFFasCod_Sel, AV62TFFasDsc, AV63TFFasDsc_Sel, AV64TFMaqCodBis, AV65TFMaqCodBis_Sel, AV46TFBarFasDTI, AV58TFBarTieRea, AV59TFBarTieRea_To, AV48TFBarFasEst_Sels, AV50TFBarFasKgm, AV51TFBarFasKgm_To, AV52TFBarFasMtr, AV53TFBarFasMtr_To, AV54TFBarFasPri, AV55TFBarFasPri_To, AV118Pgmname, AV36OrderedBy, AV38OrderedDsc, A2689ExHdrFas, AV22FasCod, A2697ExHdrFeE, A2700ExHdrFeR, AV119Consultadeproduccion_fasesfullds_1_emprcod, AV120Consultadeproduccion_fasesfullds_2_barcod, AV121Consultadeproduccion_fasesfullds_3_barcodreo, AV122Consultadeproduccion_fasesfullds_4_barcodpar, AV93Dorado, AV94Moda21, AV72CliCod, AV74BarSer, AV82BarColNom, AV83BarColNum, AV98AlbRFen, AV99ForFecApr, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV119Consultadeproduccion_fasesfullds_1_emprcod = AV17EmprCod ;
      AV120Consultadeproduccion_fasesfullds_2_barcod = AV5BarCod ;
      AV121Consultadeproduccion_fasesfullds_3_barcodreo = AV7BarCodReo ;
      AV122Consultadeproduccion_fasesfullds_4_barcodpar = AV6BarCodPar ;
      AV123Consultadeproduccion_fasesfullds_5_tfbarordlin = AV56TFBarOrdLin ;
      AV124Consultadeproduccion_fasesfullds_6_tfbarordlin_to = AV57TFBarOrdLin_To ;
      AV125Consultadeproduccion_fasesfullds_7_tffascod = AV60TFFasCod ;
      AV126Consultadeproduccion_fasesfullds_8_tffascod_sel = AV61TFFasCod_Sel ;
      AV127Consultadeproduccion_fasesfullds_9_tffasdsc = AV62TFFasDsc ;
      AV128Consultadeproduccion_fasesfullds_10_tffasdsc_sel = AV63TFFasDsc_Sel ;
      AV129Consultadeproduccion_fasesfullds_11_tfmaqcodbis = AV64TFMaqCodBis ;
      AV130Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel = AV65TFMaqCodBis_Sel ;
      AV131Consultadeproduccion_fasesfullds_13_tfbarfasdti = AV46TFBarFasDTI ;
      AV132Consultadeproduccion_fasesfullds_14_tfbartierea = AV58TFBarTieRea ;
      AV133Consultadeproduccion_fasesfullds_15_tfbartierea_to = AV59TFBarTieRea_To ;
      AV134Consultadeproduccion_fasesfullds_16_tfbarfasest_sels = AV48TFBarFasEst_Sels ;
      AV135Consultadeproduccion_fasesfullds_17_tfbarfaskgm = AV50TFBarFasKgm ;
      AV136Consultadeproduccion_fasesfullds_18_tfbarfaskgm_to = AV51TFBarFasKgm_To ;
      AV137Consultadeproduccion_fasesfullds_19_tfbarfasmtr = AV52TFBarFasMtr ;
      AV138Consultadeproduccion_fasesfullds_20_tfbarfasmtr_to = AV53TFBarFasMtr_To ;
      AV139Consultadeproduccion_fasesfullds_21_tfbarfaspri = AV54TFBarFasPri ;
      AV140Consultadeproduccion_fasesfullds_22_tfbarfaspri_to = AV55TFBarFasPri_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV17EmprCod, AV5BarCod, AV7BarCodReo, AV6BarCodPar, AV9ColumnsSelector, AV56TFBarOrdLin, AV57TFBarOrdLin_To, AV60TFFasCod, AV61TFFasCod_Sel, AV62TFFasDsc, AV63TFFasDsc_Sel, AV64TFMaqCodBis, AV65TFMaqCodBis_Sel, AV46TFBarFasDTI, AV58TFBarTieRea, AV59TFBarTieRea_To, AV48TFBarFasEst_Sels, AV50TFBarFasKgm, AV51TFBarFasKgm_To, AV52TFBarFasMtr, AV53TFBarFasMtr_To, AV54TFBarFasPri, AV55TFBarFasPri_To, AV118Pgmname, AV36OrderedBy, AV38OrderedDsc, A2689ExHdrFas, AV22FasCod, A2697ExHdrFeE, A2700ExHdrFeR, AV119Consultadeproduccion_fasesfullds_1_emprcod, AV120Consultadeproduccion_fasesfullds_2_barcod, AV121Consultadeproduccion_fasesfullds_3_barcodreo, AV122Consultadeproduccion_fasesfullds_4_barcodpar, AV93Dorado, AV94Moda21, AV72CliCod, AV74BarSer, AV82BarColNom, AV83BarColNum, AV98AlbRFen, AV99ForFecApr, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV119Consultadeproduccion_fasesfullds_1_emprcod = AV17EmprCod ;
      AV120Consultadeproduccion_fasesfullds_2_barcod = AV5BarCod ;
      AV121Consultadeproduccion_fasesfullds_3_barcodreo = AV7BarCodReo ;
      AV122Consultadeproduccion_fasesfullds_4_barcodpar = AV6BarCodPar ;
      AV123Consultadeproduccion_fasesfullds_5_tfbarordlin = AV56TFBarOrdLin ;
      AV124Consultadeproduccion_fasesfullds_6_tfbarordlin_to = AV57TFBarOrdLin_To ;
      AV125Consultadeproduccion_fasesfullds_7_tffascod = AV60TFFasCod ;
      AV126Consultadeproduccion_fasesfullds_8_tffascod_sel = AV61TFFasCod_Sel ;
      AV127Consultadeproduccion_fasesfullds_9_tffasdsc = AV62TFFasDsc ;
      AV128Consultadeproduccion_fasesfullds_10_tffasdsc_sel = AV63TFFasDsc_Sel ;
      AV129Consultadeproduccion_fasesfullds_11_tfmaqcodbis = AV64TFMaqCodBis ;
      AV130Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel = AV65TFMaqCodBis_Sel ;
      AV131Consultadeproduccion_fasesfullds_13_tfbarfasdti = AV46TFBarFasDTI ;
      AV132Consultadeproduccion_fasesfullds_14_tfbartierea = AV58TFBarTieRea ;
      AV133Consultadeproduccion_fasesfullds_15_tfbartierea_to = AV59TFBarTieRea_To ;
      AV134Consultadeproduccion_fasesfullds_16_tfbarfasest_sels = AV48TFBarFasEst_Sels ;
      AV135Consultadeproduccion_fasesfullds_17_tfbarfaskgm = AV50TFBarFasKgm ;
      AV136Consultadeproduccion_fasesfullds_18_tfbarfaskgm_to = AV51TFBarFasKgm_To ;
      AV137Consultadeproduccion_fasesfullds_19_tfbarfasmtr = AV52TFBarFasMtr ;
      AV138Consultadeproduccion_fasesfullds_20_tfbarfasmtr_to = AV53TFBarFasMtr_To ;
      AV139Consultadeproduccion_fasesfullds_21_tfbarfaspri = AV54TFBarFasPri ;
      AV140Consultadeproduccion_fasesfullds_22_tfbarfaspri_to = AV55TFBarFasPri_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV17EmprCod, AV5BarCod, AV7BarCodReo, AV6BarCodPar, AV9ColumnsSelector, AV56TFBarOrdLin, AV57TFBarOrdLin_To, AV60TFFasCod, AV61TFFasCod_Sel, AV62TFFasDsc, AV63TFFasDsc_Sel, AV64TFMaqCodBis, AV65TFMaqCodBis_Sel, AV46TFBarFasDTI, AV58TFBarTieRea, AV59TFBarTieRea_To, AV48TFBarFasEst_Sels, AV50TFBarFasKgm, AV51TFBarFasKgm_To, AV52TFBarFasMtr, AV53TFBarFasMtr_To, AV54TFBarFasPri, AV55TFBarFasPri_To, AV118Pgmname, AV36OrderedBy, AV38OrderedDsc, A2689ExHdrFas, AV22FasCod, A2697ExHdrFeE, A2700ExHdrFeR, AV119Consultadeproduccion_fasesfullds_1_emprcod, AV120Consultadeproduccion_fasesfullds_2_barcod, AV121Consultadeproduccion_fasesfullds_3_barcodreo, AV122Consultadeproduccion_fasesfullds_4_barcodpar, AV93Dorado, AV94Moda21, AV72CliCod, AV74BarSer, AV82BarColNom, AV83BarColNum, AV98AlbRFen, AV99ForFecApr, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV119Consultadeproduccion_fasesfullds_1_emprcod = AV17EmprCod ;
      AV120Consultadeproduccion_fasesfullds_2_barcod = AV5BarCod ;
      AV121Consultadeproduccion_fasesfullds_3_barcodreo = AV7BarCodReo ;
      AV122Consultadeproduccion_fasesfullds_4_barcodpar = AV6BarCodPar ;
      AV123Consultadeproduccion_fasesfullds_5_tfbarordlin = AV56TFBarOrdLin ;
      AV124Consultadeproduccion_fasesfullds_6_tfbarordlin_to = AV57TFBarOrdLin_To ;
      AV125Consultadeproduccion_fasesfullds_7_tffascod = AV60TFFasCod ;
      AV126Consultadeproduccion_fasesfullds_8_tffascod_sel = AV61TFFasCod_Sel ;
      AV127Consultadeproduccion_fasesfullds_9_tffasdsc = AV62TFFasDsc ;
      AV128Consultadeproduccion_fasesfullds_10_tffasdsc_sel = AV63TFFasDsc_Sel ;
      AV129Consultadeproduccion_fasesfullds_11_tfmaqcodbis = AV64TFMaqCodBis ;
      AV130Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel = AV65TFMaqCodBis_Sel ;
      AV131Consultadeproduccion_fasesfullds_13_tfbarfasdti = AV46TFBarFasDTI ;
      AV132Consultadeproduccion_fasesfullds_14_tfbartierea = AV58TFBarTieRea ;
      AV133Consultadeproduccion_fasesfullds_15_tfbartierea_to = AV59TFBarTieRea_To ;
      AV134Consultadeproduccion_fasesfullds_16_tfbarfasest_sels = AV48TFBarFasEst_Sels ;
      AV135Consultadeproduccion_fasesfullds_17_tfbarfaskgm = AV50TFBarFasKgm ;
      AV136Consultadeproduccion_fasesfullds_18_tfbarfaskgm_to = AV51TFBarFasKgm_To ;
      AV137Consultadeproduccion_fasesfullds_19_tfbarfasmtr = AV52TFBarFasMtr ;
      AV138Consultadeproduccion_fasesfullds_20_tfbarfasmtr_to = AV53TFBarFasMtr_To ;
      AV139Consultadeproduccion_fasesfullds_21_tfbarfaspri = AV54TFBarFasPri ;
      AV140Consultadeproduccion_fasesfullds_22_tfbarfaspri_to = AV55TFBarFasPri_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV17EmprCod, AV5BarCod, AV7BarCodReo, AV6BarCodPar, AV9ColumnsSelector, AV56TFBarOrdLin, AV57TFBarOrdLin_To, AV60TFFasCod, AV61TFFasCod_Sel, AV62TFFasDsc, AV63TFFasDsc_Sel, AV64TFMaqCodBis, AV65TFMaqCodBis_Sel, AV46TFBarFasDTI, AV58TFBarTieRea, AV59TFBarTieRea_To, AV48TFBarFasEst_Sels, AV50TFBarFasKgm, AV51TFBarFasKgm_To, AV52TFBarFasMtr, AV53TFBarFasMtr_To, AV54TFBarFasPri, AV55TFBarFasPri_To, AV118Pgmname, AV36OrderedBy, AV38OrderedDsc, A2689ExHdrFas, AV22FasCod, A2697ExHdrFeE, A2700ExHdrFeR, AV119Consultadeproduccion_fasesfullds_1_emprcod, AV120Consultadeproduccion_fasesfullds_2_barcod, AV121Consultadeproduccion_fasesfullds_3_barcodreo, AV122Consultadeproduccion_fasesfullds_4_barcodpar, AV93Dorado, AV94Moda21, AV72CliCod, AV74BarSer, AV82BarColNom, AV83BarColNum, AV98AlbRFen, AV99ForFecApr, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV118Pgmname = "ConsultadeProduccion_FasesFull" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV118Pgmname", AV118Pgmname);
      Gx_err = (short)(0) ;
      edtavDiscod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiscod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiscod_Enabled), 5, 0), true);
      edtavEnccli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEnccli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEnccli_Enabled), 5, 0), true);
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavBarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarser_Enabled), 5, 0), true);
      edtavBarserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarserdsc_Enabled), 5, 0), true);
      edtavTipartdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTipartdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipartdsc_Enabled), 5, 0), true);
      edtavBarcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnom_Enabled), 5, 0), true);
      edtavBarcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnum_Enabled), 5, 0), true);
      edtavBarnomcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarnomcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnomcli_Enabled), 5, 0), true);
      edtavBarnumcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarnumcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnumcli_Enabled), 5, 0), true);
      edtavBarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm_Enabled), 5, 0), true);
      edtavBarmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmtr_Enabled), 5, 0), true);
      edtavBarpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpie_Enabled), 5, 0), true);
      edtavBarancaca1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarancaca1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarancaca1_Enabled), 5, 0), true);
      edtavBargraaca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBargraaca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBargraaca_Enabled), 5, 0), true);
      edtavAlbrfen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlbrfen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbrfen_Enabled), 5, 0), true);
      edtavBarfecgen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarfecgen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfecgen_Enabled), 5, 0), true);
      edtavBarfeccli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarfeccli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfeccli_Enabled), 5, 0), true);
      edtavForfecapr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavForfecapr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavForfecapr_Enabled), 5, 0), true);
      edtavBarfecfpr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarfecfpr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfecfpr_Enabled), 5, 0), true);
      edtavBartra1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBartra1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBartra1_Enabled), 5, 0), true);
      edtavBartrap1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBartrap1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBartrap1_Enabled), 5, 0), true);
      edtavBartra2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBartra2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBartra2_Enabled), 5, 0), true);
      edtavBartrap2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBartrap2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBartrap2_Enabled), 5, 0), true);
      edtavBartra3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBartra3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBartra3_Enabled), 5, 0), true);
      edtavBartrap3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBartrap3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBartrap3_Enabled), 5, 0), true);
      edtavBarurd1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarurd1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarurd1_Enabled), 5, 0), true);
      edtavBarurdp1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarurdp1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarurdp1_Enabled), 5, 0), true);
      edtavBarurd2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarurd2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarurd2_Enabled), 5, 0), true);
      edtavBarurdp2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarurdp2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarurdp2_Enabled), 5, 0), true);
      edtavBarurd3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarurd3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarurd3_Enabled), 5, 0), true);
      edtavBarurdp3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarurdp3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarurdp3_Enabled), 5, 0), true);
      edtavMaqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMaqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqdsc_Enabled), 5, 0), !bGXsfl_235_Refreshing);
      edtavBarfasdtf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarfasdtf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfasdtf_Enabled), 5, 0), !bGXsfl_235_Refreshing);
      edtavSituacion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSituacion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSituacion_Enabled), 5, 0), !bGXsfl_235_Refreshing);
      edtavOpenom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavOpenom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOpenom_Enabled), 5, 0), !bGXsfl_235_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup23B0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e2123B2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV16DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV9ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_235 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_235"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV24GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV25GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV17EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV17EmprCod") ;
         wcpOAV5BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV5BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV7BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV7BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV6BarCodPar = httpContext.cgiGet( sPrefix+"wcpOAV6BarCodPar") ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Dvpanel_tableheadertop_Width = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADERTOP_Width") ;
         Dvpanel_tableheadertop_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADERTOP_Autowidth")) ;
         Dvpanel_tableheadertop_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADERTOP_Autoheight")) ;
         Dvpanel_tableheadertop_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADERTOP_Cls") ;
         Dvpanel_tableheadertop_Title = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADERTOP_Title") ;
         Dvpanel_tableheadertop_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADERTOP_Collapsible")) ;
         Dvpanel_tableheadertop_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADERTOP_Collapsed")) ;
         Dvpanel_tableheadertop_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADERTOP_Showcollapseicon")) ;
         Dvpanel_tableheadertop_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADERTOP_Iconposition") ;
         Dvpanel_tableheadertop_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADERTOP_Autoscroll")) ;
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
         Innewwindow1_Width = httpContext.cgiGet( sPrefix+"INNEWWINDOW1_Width") ;
         Innewwindow1_Height = httpContext.cgiGet( sPrefix+"INNEWWINDOW1_Height") ;
         Innewwindow1_Target = httpContext.cgiGet( sPrefix+"INNEWWINDOW1_Target") ;
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
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavDiscod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavDiscod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDISCOD");
            GX_FocusControl = edtavDiscod_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV90DisCod = 0 ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV90DisCod), 8, 0));
         }
         else
         {
            AV90DisCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavDiscod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV90DisCod), 8, 0));
         }
         AV91EncCli = httpContext.cgiGet( edtavEnccli_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91EncCli", AV91EncCli);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICOD");
            GX_FocusControl = edtavClicod_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV72CliCod = 0 ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72CliCod), 6, 0));
         }
         else
         {
            AV72CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72CliCod), 6, 0));
         }
         AV73CliNom = httpContext.cgiGet( edtavClinom_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73CliNom", AV73CliNom);
         AV74BarSer = httpContext.cgiGet( edtavBarser_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74BarSer", AV74BarSer);
         AV75BarSerDsc = httpContext.cgiGet( edtavBarserdsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75BarSerDsc", AV75BarSerDsc);
         AV76TipArtDsc = httpContext.cgiGet( edtavTipartdsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76TipArtDsc", AV76TipArtDsc);
         AV82BarColNom = httpContext.cgiGet( edtavBarcolnom_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82BarColNom", AV82BarColNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOLNUM");
            GX_FocusControl = edtavBarcolnum_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV83BarColNum = 0 ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83BarColNum), 6, 0));
         }
         else
         {
            AV83BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83BarColNum), 6, 0));
         }
         AV88BarNomCli = httpContext.cgiGet( edtavBarnomcli_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88BarNomCli", AV88BarNomCli);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarnumcli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarnumcli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARNUMCLI");
            GX_FocusControl = edtavBarnumcli_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV89BarNumCli = 0 ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89BarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV89BarNumCli), 6, 0));
         }
         else
         {
            AV89BarNumCli = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarnumcli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89BarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV89BarNumCli), 6, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavBarkgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavBarkgm_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARKGM");
            GX_FocusControl = edtavBarkgm_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV84BarKgm = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84BarKgm", GXutil.ltrimstr( AV84BarKgm, 9, 2));
         }
         else
         {
            AV84BarKgm = localUtil.ctond( httpContext.cgiGet( edtavBarkgm_Internalname)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84BarKgm", GXutil.ltrimstr( AV84BarKgm, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavBarmtr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavBarmtr_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARMTR");
            GX_FocusControl = edtavBarmtr_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV85BarMtr = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85BarMtr", GXutil.ltrimstr( AV85BarMtr, 9, 2));
         }
         else
         {
            AV85BarMtr = localUtil.ctond( httpContext.cgiGet( edtavBarmtr_Internalname)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85BarMtr", GXutil.ltrimstr( AV85BarMtr, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarpie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarpie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARPIE");
            GX_FocusControl = edtavBarpie_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV86BarPie = 0 ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV86BarPie), 6, 0));
         }
         else
         {
            AV86BarPie = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarpie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV86BarPie), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarancaca1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarancaca1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARANCACA1");
            GX_FocusControl = edtavBarancaca1_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV106BarAncAca1 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV106BarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV106BarAncAca1), 3, 0));
         }
         else
         {
            AV106BarAncAca1 = (short)(localUtil.ctol( httpContext.cgiGet( edtavBarancaca1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV106BarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV106BarAncAca1), 3, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBargraaca_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBargraaca_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARGRAACA");
            GX_FocusControl = edtavBargraaca_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV107BarGraAca = (short)(0) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV107BarGraAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV107BarGraAca), 4, 0));
         }
         else
         {
            AV107BarGraAca = (short)(localUtil.ctol( httpContext.cgiGet( edtavBargraaca_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV107BarGraAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV107BarGraAca), 4, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavAlbrfen_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vALBRFEN");
            GX_FocusControl = edtavAlbrfen_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV98AlbRFen = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV98AlbRFen", localUtil.format(AV98AlbRFen, "99/99/99"));
         }
         else
         {
            AV98AlbRFen = localUtil.ctod( httpContext.cgiGet( edtavAlbrfen_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV98AlbRFen", localUtil.format(AV98AlbRFen, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavBarfecgen_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vBARFECGEN");
            GX_FocusControl = edtavBarfecgen_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV108BarFecGen = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV108BarFecGen", localUtil.format(AV108BarFecGen, "99/99/99"));
         }
         else
         {
            AV108BarFecGen = localUtil.ctod( httpContext.cgiGet( edtavBarfecgen_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV108BarFecGen", localUtil.format(AV108BarFecGen, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavBarfeccli_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vBARFECCLI");
            GX_FocusControl = edtavBarfeccli_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV81BarFecCli = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81BarFecCli", localUtil.format(AV81BarFecCli, "99/99/99"));
         }
         else
         {
            AV81BarFecCli = localUtil.ctod( httpContext.cgiGet( edtavBarfeccli_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81BarFecCli", localUtil.format(AV81BarFecCli, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavForfecapr_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFORFECAPR");
            GX_FocusControl = edtavForfecapr_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV99ForFecApr = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV99ForFecApr", localUtil.format(AV99ForFecApr, "99/99/99"));
         }
         else
         {
            AV99ForFecApr = localUtil.ctod( httpContext.cgiGet( edtavForfecapr_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV99ForFecApr", localUtil.format(AV99ForFecApr, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavBarfecfpr_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vBARFECFPR");
            GX_FocusControl = edtavBarfecfpr_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV109BarFecFpr = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV109BarFecFpr", localUtil.format(AV109BarFecFpr, "99/99/99"));
         }
         else
         {
            AV109BarFecFpr = localUtil.ctod( httpContext.cgiGet( edtavBarfecfpr_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV109BarFecFpr", localUtil.format(AV109BarFecFpr, "99/99/99"));
         }
         AV100BarTra1 = httpContext.cgiGet( edtavBartra1_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV100BarTra1", AV100BarTra1);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBartrap1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBartrap1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARTRAP1");
            GX_FocusControl = edtavBartrap1_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV103BarTraP1 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV103BarTraP1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV103BarTraP1), 3, 0));
         }
         else
         {
            AV103BarTraP1 = (short)(localUtil.ctol( httpContext.cgiGet( edtavBartrap1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV103BarTraP1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV103BarTraP1), 3, 0));
         }
         AV101BarTra2 = httpContext.cgiGet( edtavBartra2_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV101BarTra2", AV101BarTra2);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBartrap2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBartrap2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARTRAP2");
            GX_FocusControl = edtavBartrap2_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV104BarTraP2 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV104BarTraP2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV104BarTraP2), 3, 0));
         }
         else
         {
            AV104BarTraP2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavBartrap2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV104BarTraP2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV104BarTraP2), 3, 0));
         }
         AV102BarTra3 = httpContext.cgiGet( edtavBartra3_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV102BarTra3", AV102BarTra3);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBartrap3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBartrap3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARTRAP3");
            GX_FocusControl = edtavBartrap3_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV105BarTraP3 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV105BarTraP3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV105BarTraP3), 3, 0));
         }
         else
         {
            AV105BarTraP3 = (short)(localUtil.ctol( httpContext.cgiGet( edtavBartrap3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV105BarTraP3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV105BarTraP3), 3, 0));
         }
         AV114BarUrd1 = httpContext.cgiGet( edtavBarurd1_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV114BarUrd1", AV114BarUrd1);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarurdp1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarurdp1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARURDP1");
            GX_FocusControl = edtavBarurdp1_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV112BarUrdP1 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV112BarUrdP1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV112BarUrdP1), 3, 0));
         }
         else
         {
            AV112BarUrdP1 = (short)(localUtil.ctol( httpContext.cgiGet( edtavBarurdp1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV112BarUrdP1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV112BarUrdP1), 3, 0));
         }
         AV110BarUrd2 = httpContext.cgiGet( edtavBarurd2_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV110BarUrd2", AV110BarUrd2);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarurdp2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarurdp2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARURDP2");
            GX_FocusControl = edtavBarurdp2_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV115BarUrdP2 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV115BarUrdP2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV115BarUrdP2), 3, 0));
         }
         else
         {
            AV115BarUrdP2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavBarurdp2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV115BarUrdP2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV115BarUrdP2), 3, 0));
         }
         AV111BarUrd3 = httpContext.cgiGet( edtavBarurd3_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV111BarUrd3", AV111BarUrd3);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarurdp3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarurdp3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARURDP3");
            GX_FocusControl = edtavBarurdp3_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV113BarUrdP3 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV113BarUrdP3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV113BarUrdP3), 3, 0));
         }
         else
         {
            AV113BarUrdP3 = (short)(localUtil.ctol( httpContext.cgiGet( edtavBarurdp3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV113BarUrdP3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV113BarUrdP3), 3, 0));
         }
         AV118Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV118Pgmname", AV118Pgmname);
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n129BarCod = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n132BarCodReo = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
         n130BarCodPar = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A130BarCodPar", A130BarCodPar);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_barfasdtiauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_BARFASDTIAUXDATE");
            GX_FocusControl = edtavDdo_barfasdtiauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV14DDO_BarFasDTIAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14DDO_BarFasDTIAuxDate", localUtil.format(AV14DDO_BarFasDTIAuxDate, "99/99/99"));
         }
         else
         {
            AV14DDO_BarFasDTIAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_barfasdtiauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14DDO_BarFasDTIAuxDate", localUtil.format(AV14DDO_BarFasDTIAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         nGXsfl_235_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_235_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_235_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_2352( ) ;
         if ( nGXsfl_235_idx > 0 )
         {
            A194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
            A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
            A150BarFacTin = GXutil.upper( httpContext.cgiGet( edtBarFacTin_Internalname)) ;
            A603MaqCodBis = httpContext.cgiGet( edtMaqCodBis_Internalname) ;
            AV34MaqDsc = httpContext.cgiGet( edtavMaqdsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMaqdsc_Internalname, AV34MaqDsc);
            A4442BarFasDTI = localUtil.ctot( httpContext.cgiGet( edtBarFasDTI_Internalname)) ;
            n4442BarFasDTI = false ;
            AV8BarFasDTF = httpContext.cgiGet( edtavBarfasdtf_Internalname) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarfasdtf_Internalname, AV8BarFasDTF);
            A215BarTieRea = localUtil.ctond( httpContext.cgiGet( edtBarTieRea_Internalname)) ;
            AV41Situacion = httpContext.cgiGet( edtavSituacion_Internalname) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavSituacion_Internalname, AV41Situacion);
            cmbBarFasEst.setName( cmbBarFasEst.getInternalname() );
            cmbBarFasEst.setValue( httpContext.cgiGet( cmbBarFasEst.getInternalname()) );
            A153BarFasEst = (byte)(GXutil.lval( httpContext.cgiGet( cmbBarFasEst.getInternalname()))) ;
            A3837BarFasKgm = localUtil.ctond( httpContext.cgiGet( edtBarFasKgm_Internalname)) ;
            n3837BarFasKgm = false ;
            A3838BarFasMtr = localUtil.ctond( httpContext.cgiGet( edtBarFasMtr_Internalname)) ;
            n3838BarFasMtr = false ;
            AV35OpeNom = httpContext.cgiGet( edtavOpenom_Internalname) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOpenom_Internalname, AV35OpeNom);
            A3836BarFasPri = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarFasPri_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ConsultadeProduccion_FasesFull");
         AV72CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72CliCod), 6, 0));
         forbiddenHiddens.add("CliCod", localUtil.format( DecimalUtil.doubleToDec(AV72CliCod), "ZZZZZ9"));
         AV74BarSer = httpContext.cgiGet( edtavBarser_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74BarSer", AV74BarSer);
         forbiddenHiddens.add("BarSer", GXutil.rtrim( localUtil.format( AV74BarSer, "")));
         AV82BarColNom = httpContext.cgiGet( edtavBarcolnom_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82BarColNom", AV82BarColNom);
         forbiddenHiddens.add("BarColNom", GXutil.rtrim( localUtil.format( AV82BarColNom, "")));
         AV83BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83BarColNum), 6, 0));
         forbiddenHiddens.add("BarColNum", localUtil.format( DecimalUtil.doubleToDec(AV83BarColNum), "ZZZZZ9"));
         AV98AlbRFen = localUtil.ctod( httpContext.cgiGet( edtavAlbrfen_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV98AlbRFen", localUtil.format(AV98AlbRFen, "99/99/99"));
         forbiddenHiddens.add("AlbRFen", localUtil.format(AV98AlbRFen, "99/99/99"));
         AV99ForFecApr = localUtil.ctod( httpContext.cgiGet( edtavForfecapr_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV99ForFecApr", localUtil.format(AV99ForFecApr, "99/99/99"));
         forbiddenHiddens.add("ForFecApr", localUtil.format(AV99ForFecApr, "99/99/99"));
         AV118Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV118Pgmname", AV118Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV118Pgmname, "")));
         A396EmprCod = httpContext.cgiGet( edtEmprCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         forbiddenHiddens.add("EmprCod", GXutil.rtrim( localUtil.format( A396EmprCod, "@!")));
         A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n129BarCod = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         forbiddenHiddens.add("BarCod", localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"));
         A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n132BarCodReo = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         forbiddenHiddens.add("BarCodReo", localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"));
         A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
         n130BarCodPar = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A130BarCodPar", A130BarCodPar);
         forbiddenHiddens.add("BarCodPar", GXutil.rtrim( localUtil.format( A130BarCodPar, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("consultadeproduccion_fasesfull:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e2123B2 ();
      if (returnInSub) return;
   }

   public void e2123B2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV77Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      consultadeproduccion_fasesfull_impl.this.GXt_char1 = GXv_char2[0] ;
      AV77Station = GXt_char1 ;
      GXv_char2[0] = AV17EmprCod ;
      GXv_char3[0] = AV79EmprNom ;
      GXv_char4[0] = AV78UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV77Station, GXv_char2, GXv_char3, GXv_char4) ;
      consultadeproduccion_fasesfull_impl.this.AV17EmprCod = GXv_char2[0] ;
      consultadeproduccion_fasesfull_impl.this.AV79EmprNom = GXv_char3[0] ;
      consultadeproduccion_fasesfull_impl.this.AV78UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17EmprCod", AV17EmprCod);
      GXt_int5 = AV92Enc20c ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV17EmprCod, httpContext.getMessage( "ENC20C", ""), GXv_int6) ;
      consultadeproduccion_fasesfull_impl.this.GXt_int5 = GXv_int6[0] ;
      AV92Enc20c = GXt_int5 ;
      GXt_int5 = AV93Dorado ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV17EmprCod, httpContext.getMessage( "DORADO", ""), GXv_int6) ;
      consultadeproduccion_fasesfull_impl.this.GXt_int5 = GXv_int6[0] ;
      AV93Dorado = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV93Dorado", GXutil.str( AV93Dorado, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vDORADO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV93Dorado), "9")));
      GXt_int5 = AV94Moda21 ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV17EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int6) ;
      consultadeproduccion_fasesfull_impl.this.GXt_int5 = GXv_int6[0] ;
      AV94Moda21 = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV94Moda21", GXutil.str( AV94Moda21, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV94Moda21), "9")));
      GXt_int7 = AV96ValCont ;
      GXv_int8[0] = GXt_int7 ;
      new app.pbuscon(remoteHandle, context).execute( AV17EmprCod, httpContext.getMessage( "CLI350", ""), GXv_int8) ;
      consultadeproduccion_fasesfull_impl.this.GXt_int7 = GXv_int8[0] ;
      AV96ValCont = (byte)(GXt_int7) ;
      GXt_int5 = AV95Cli350 ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV17EmprCod, httpContext.getMessage( "CLI350", ""), GXv_int6) ;
      consultadeproduccion_fasesfull_impl.this.GXt_int5 = GXv_int6[0] ;
      AV95Cli350 = GXt_int5 ;
      GXt_char1 = AV77Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      consultadeproduccion_fasesfull_impl.this.GXt_char1 = GXv_char4[0] ;
      AV77Station = GXt_char1 ;
      GXv_char4[0] = AV17EmprCod ;
      GXv_char3[0] = AV79EmprNom ;
      GXv_char2[0] = AV78UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV77Station, GXv_char4, GXv_char3, GXv_char2) ;
      consultadeproduccion_fasesfull_impl.this.AV17EmprCod = GXv_char4[0] ;
      consultadeproduccion_fasesfull_impl.this.AV79EmprNom = GXv_char3[0] ;
      consultadeproduccion_fasesfull_impl.this.AV78UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17EmprCod", AV17EmprCod);
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
      if ( AV36OrderedBy < 1 )
      {
         AV36OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = AV16DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[0] ;
      AV16DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXv_int8[0] = AV72CliCod ;
      GXv_char4[0] = AV73CliNom ;
      GXv_char3[0] = AV80BarDisNum ;
      GXv_char2[0] = AV74BarSer ;
      GXv_date11[0] = AV81BarFecCli ;
      GXv_char12[0] = AV82BarColNom ;
      GXv_int13[0] = AV83BarColNum ;
      GXv_decimal14[0] = AV84BarKgm ;
      GXv_decimal15[0] = AV85BarMtr ;
      GXv_int16[0] = AV86BarPie ;
      GXv_char17[0] = AV75BarSerDsc ;
      GXv_char18[0] = AV76TipArtDsc ;
      GXv_int6[0] = AV87BarTipCol ;
      GXv_char19[0] = AV88BarNomCli ;
      GXv_int20[0] = AV89BarNumCli ;
      GXv_char21[0] = AV97BarTipDis ;
      GXv_char22[0] = AV91EncCli ;
      GXv_int23[0] = AV90DisCod ;
      GXv_char24[0] = AV100BarTra1 ;
      GXv_char25[0] = AV101BarTra2 ;
      GXv_char26[0] = AV102BarTra3 ;
      GXv_int27[0] = AV103BarTraP1 ;
      GXv_int28[0] = AV104BarTraP2 ;
      GXv_int29[0] = AV105BarTraP3 ;
      GXv_char30[0] = AV114BarUrd1 ;
      GXv_char31[0] = AV110BarUrd2 ;
      GXv_char32[0] = AV111BarUrd3 ;
      GXv_int33[0] = AV112BarUrdP1 ;
      GXv_int34[0] = AV115BarUrdP2 ;
      GXv_int35[0] = AV113BarUrdP3 ;
      GXv_int36[0] = AV106BarAncAca1 ;
      GXv_int37[0] = AV107BarGraAca ;
      GXv_date38[0] = AV108BarFecGen ;
      GXv_date39[0] = AV109BarFecFpr ;
      new app.produccion.consultaproduccioninfgral_fases(remoteHandle, context).execute( AV17EmprCod, AV5BarCod, AV7BarCodReo, AV6BarCodPar, GXv_int8, GXv_char4, GXv_char3, GXv_char2, GXv_date11, GXv_char12, GXv_int13, GXv_decimal14, GXv_decimal15, GXv_int16, GXv_char17, GXv_char18, GXv_int6, GXv_char19, GXv_int20, GXv_char21, GXv_char22, GXv_int23, GXv_char24, GXv_char25, GXv_char26, GXv_int27, GXv_int28, GXv_int29, GXv_char30, GXv_char31, GXv_char32, GXv_int33, GXv_int34, GXv_int35, GXv_int36, GXv_int37, GXv_date38, GXv_date39) ;
      consultadeproduccion_fasesfull_impl.this.AV72CliCod = GXv_int8[0] ;
      consultadeproduccion_fasesfull_impl.this.AV73CliNom = GXv_char4[0] ;
      consultadeproduccion_fasesfull_impl.this.AV80BarDisNum = GXv_char3[0] ;
      consultadeproduccion_fasesfull_impl.this.AV74BarSer = GXv_char2[0] ;
      consultadeproduccion_fasesfull_impl.this.AV81BarFecCli = GXv_date11[0] ;
      consultadeproduccion_fasesfull_impl.this.AV82BarColNom = GXv_char12[0] ;
      consultadeproduccion_fasesfull_impl.this.AV83BarColNum = GXv_int13[0] ;
      consultadeproduccion_fasesfull_impl.this.AV84BarKgm = GXv_decimal14[0] ;
      consultadeproduccion_fasesfull_impl.this.AV85BarMtr = GXv_decimal15[0] ;
      consultadeproduccion_fasesfull_impl.this.AV86BarPie = GXv_int16[0] ;
      consultadeproduccion_fasesfull_impl.this.AV75BarSerDsc = GXv_char17[0] ;
      consultadeproduccion_fasesfull_impl.this.AV76TipArtDsc = GXv_char18[0] ;
      consultadeproduccion_fasesfull_impl.this.AV87BarTipCol = GXv_int6[0] ;
      consultadeproduccion_fasesfull_impl.this.AV88BarNomCli = GXv_char19[0] ;
      consultadeproduccion_fasesfull_impl.this.AV89BarNumCli = GXv_int20[0] ;
      consultadeproduccion_fasesfull_impl.this.AV97BarTipDis = GXv_char21[0] ;
      consultadeproduccion_fasesfull_impl.this.AV91EncCli = GXv_char22[0] ;
      consultadeproduccion_fasesfull_impl.this.AV90DisCod = GXv_int23[0] ;
      consultadeproduccion_fasesfull_impl.this.AV100BarTra1 = GXv_char24[0] ;
      consultadeproduccion_fasesfull_impl.this.AV101BarTra2 = GXv_char25[0] ;
      consultadeproduccion_fasesfull_impl.this.AV102BarTra3 = GXv_char26[0] ;
      consultadeproduccion_fasesfull_impl.this.AV103BarTraP1 = GXv_int27[0] ;
      consultadeproduccion_fasesfull_impl.this.AV104BarTraP2 = GXv_int28[0] ;
      consultadeproduccion_fasesfull_impl.this.AV105BarTraP3 = GXv_int29[0] ;
      consultadeproduccion_fasesfull_impl.this.AV114BarUrd1 = GXv_char30[0] ;
      consultadeproduccion_fasesfull_impl.this.AV110BarUrd2 = GXv_char31[0] ;
      consultadeproduccion_fasesfull_impl.this.AV111BarUrd3 = GXv_char32[0] ;
      consultadeproduccion_fasesfull_impl.this.AV112BarUrdP1 = GXv_int33[0] ;
      consultadeproduccion_fasesfull_impl.this.AV115BarUrdP2 = GXv_int34[0] ;
      consultadeproduccion_fasesfull_impl.this.AV113BarUrdP3 = GXv_int35[0] ;
      consultadeproduccion_fasesfull_impl.this.AV106BarAncAca1 = GXv_int36[0] ;
      consultadeproduccion_fasesfull_impl.this.AV107BarGraAca = GXv_int37[0] ;
      consultadeproduccion_fasesfull_impl.this.AV108BarFecGen = GXv_date38[0] ;
      consultadeproduccion_fasesfull_impl.this.AV109BarFecFpr = GXv_date39[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72CliCod), 6, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73CliNom", AV73CliNom);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74BarSer", AV74BarSer);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81BarFecCli", localUtil.format(AV81BarFecCli, "99/99/99"));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82BarColNom", AV82BarColNom);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83BarColNum), 6, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84BarKgm", GXutil.ltrimstr( AV84BarKgm, 9, 2));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85BarMtr", GXutil.ltrimstr( AV85BarMtr, 9, 2));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV86BarPie), 6, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75BarSerDsc", AV75BarSerDsc);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76TipArtDsc", AV76TipArtDsc);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV87BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV87BarTipCol), 2, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88BarNomCli", AV88BarNomCli);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89BarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV89BarNumCli), 6, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91EncCli", AV91EncCli);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV90DisCod), 8, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV100BarTra1", AV100BarTra1);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV101BarTra2", AV101BarTra2);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV102BarTra3", AV102BarTra3);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV103BarTraP1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV103BarTraP1), 3, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV104BarTraP2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV104BarTraP2), 3, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV105BarTraP3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV105BarTraP3), 3, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV114BarUrd1", AV114BarUrd1);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV110BarUrd2", AV110BarUrd2);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV111BarUrd3", AV111BarUrd3);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV112BarUrdP1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV112BarUrdP1), 3, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV115BarUrdP2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV115BarUrdP2), 3, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV113BarUrdP3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV113BarUrdP3), 3, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV106BarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV106BarAncAca1), 3, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV107BarGraAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV107BarGraAca), 4, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV108BarFecGen", localUtil.format(AV108BarFecGen, "99/99/99"));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV109BarFecFpr", localUtil.format(AV109BarFecFpr, "99/99/99"));
      /* Execute user subroutine: 'CFORMU' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'BARPIE' */
      S152 ();
      if (returnInSub) return;
   }

   public void e2223B2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext40[0] = AV71WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext40) ;
      AV71WWPContext = GXv_SdtWWPContext40[0] ;
      /* Execute user subroutine: 'CHECKSECURITYFORACTIONS' */
      S162 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S172 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV40Session.getValue("ConsultadeProduccion_FasesFullColumnsSelector"), "") != 0 )
      {
         AV11ColumnsSelectorXML = AV40Session.getValue("ConsultadeProduccion_FasesFullColumnsSelector") ;
         AV9ColumnsSelector.fromxml(AV11ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S182 ();
         if (returnInSub) return;
      }
      edtBarOrdLin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarOrdLin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarOrdLin_Visible), 5, 0), !bGXsfl_235_Refreshing);
      edtFasCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFasCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Visible), 5, 0), !bGXsfl_235_Refreshing);
      edtFasDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFasDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Visible), 5, 0), !bGXsfl_235_Refreshing);
      edtMaqCodBis_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMaqCodBis_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCodBis_Visible), 5, 0), !bGXsfl_235_Refreshing);
      edtavMaqdsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMaqdsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqdsc_Visible), 5, 0), !bGXsfl_235_Refreshing);
      edtBarFasDTI_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarFasDTI_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasDTI_Visible), 5, 0), !bGXsfl_235_Refreshing);
      edtavBarfasdtf_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarfasdtf_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfasdtf_Visible), 5, 0), !bGXsfl_235_Refreshing);
      edtBarTieRea_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarTieRea_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTieRea_Visible), 5, 0), !bGXsfl_235_Refreshing);
      cmbBarFasEst.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbBarFasEst.getInternalname(), "Visible", GXutil.ltrimstr( cmbBarFasEst.getVisible(), 5, 0), !bGXsfl_235_Refreshing);
      edtBarFasKgm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarFasKgm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasKgm_Visible), 5, 0), !bGXsfl_235_Refreshing);
      edtBarFasMtr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarFasMtr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasMtr_Visible), 5, 0), !bGXsfl_235_Refreshing);
      edtavOpenom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavOpenom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOpenom_Visible), 5, 0), !bGXsfl_235_Refreshing);
      edtBarFasPri_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarFasPri_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasPri_Visible), 5, 0), !bGXsfl_235_Refreshing);
      AV24GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24GridCurrentPage), 10, 0));
      AV25GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25GridPageCount), 10, 0));
      edtBarOrdLin_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarOrdLin_Internalname, "Columnheaderclass", edtBarOrdLin_Columnheaderclass, !bGXsfl_235_Refreshing);
      edtFasCod_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFasCod_Internalname, "Columnheaderclass", edtFasCod_Columnheaderclass, !bGXsfl_235_Refreshing);
      edtFasDsc_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFasDsc_Internalname, "Columnheaderclass", edtFasDsc_Columnheaderclass, !bGXsfl_235_Refreshing);
      edtMaqCodBis_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMaqCodBis_Internalname, "Columnheaderclass", edtMaqCodBis_Columnheaderclass, !bGXsfl_235_Refreshing);
      edtavMaqdsc_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMaqdsc_Internalname, "Columnheaderclass", edtavMaqdsc_Columnheaderclass, !bGXsfl_235_Refreshing);
      edtBarFasDTI_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarFasDTI_Internalname, "Columnheaderclass", edtBarFasDTI_Columnheaderclass, !bGXsfl_235_Refreshing);
      edtavBarfasdtf_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarfasdtf_Internalname, "Columnheaderclass", edtavBarfasdtf_Columnheaderclass, !bGXsfl_235_Refreshing);
      edtBarTieRea_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarTieRea_Internalname, "Columnheaderclass", edtBarTieRea_Columnheaderclass, !bGXsfl_235_Refreshing);
      cmbBarFasEst.setColumnHeaderClass( "WWColumn hidden-xs" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbBarFasEst.getInternalname(), "Columnheaderclass", cmbBarFasEst.getColumnHeaderClass(), !bGXsfl_235_Refreshing);
      edtBarFasKgm_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarFasKgm_Internalname, "Columnheaderclass", edtBarFasKgm_Columnheaderclass, !bGXsfl_235_Refreshing);
      edtBarFasMtr_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarFasMtr_Internalname, "Columnheaderclass", edtBarFasMtr_Columnheaderclass, !bGXsfl_235_Refreshing);
      edtavOpenom_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavOpenom_Internalname, "Columnheaderclass", edtavOpenom_Columnheaderclass, !bGXsfl_235_Refreshing);
      edtBarFasPri_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarFasPri_Internalname, "Columnheaderclass", edtBarFasPri_Columnheaderclass, !bGXsfl_235_Refreshing);
      AV119Consultadeproduccion_fasesfullds_1_emprcod = AV17EmprCod ;
      AV120Consultadeproduccion_fasesfullds_2_barcod = AV5BarCod ;
      AV121Consultadeproduccion_fasesfullds_3_barcodreo = AV7BarCodReo ;
      AV122Consultadeproduccion_fasesfullds_4_barcodpar = AV6BarCodPar ;
      AV123Consultadeproduccion_fasesfullds_5_tfbarordlin = AV56TFBarOrdLin ;
      AV124Consultadeproduccion_fasesfullds_6_tfbarordlin_to = AV57TFBarOrdLin_To ;
      AV125Consultadeproduccion_fasesfullds_7_tffascod = AV60TFFasCod ;
      AV126Consultadeproduccion_fasesfullds_8_tffascod_sel = AV61TFFasCod_Sel ;
      AV127Consultadeproduccion_fasesfullds_9_tffasdsc = AV62TFFasDsc ;
      AV128Consultadeproduccion_fasesfullds_10_tffasdsc_sel = AV63TFFasDsc_Sel ;
      AV129Consultadeproduccion_fasesfullds_11_tfmaqcodbis = AV64TFMaqCodBis ;
      AV130Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel = AV65TFMaqCodBis_Sel ;
      AV131Consultadeproduccion_fasesfullds_13_tfbarfasdti = AV46TFBarFasDTI ;
      AV132Consultadeproduccion_fasesfullds_14_tfbartierea = AV58TFBarTieRea ;
      AV133Consultadeproduccion_fasesfullds_15_tfbartierea_to = AV59TFBarTieRea_To ;
      AV134Consultadeproduccion_fasesfullds_16_tfbarfasest_sels = AV48TFBarFasEst_Sels ;
      AV135Consultadeproduccion_fasesfullds_17_tfbarfaskgm = AV50TFBarFasKgm ;
      AV136Consultadeproduccion_fasesfullds_18_tfbarfaskgm_to = AV51TFBarFasKgm_To ;
      AV137Consultadeproduccion_fasesfullds_19_tfbarfasmtr = AV52TFBarFasMtr ;
      AV138Consultadeproduccion_fasesfullds_20_tfbarfasmtr_to = AV53TFBarFasMtr_To ;
      AV139Consultadeproduccion_fasesfullds_21_tfbarfaspri = AV54TFBarFasPri ;
      AV140Consultadeproduccion_fasesfullds_22_tfbarfaspri_to = AV55TFBarFasPri_To ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV9ColumnsSelector", AV9ColumnsSelector);
   }

   public void e1223B2( )
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
         AV39PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV39PageToGo) ;
      }
   }

   public void e1323B2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e1423B2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV36OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36OrderedBy), 4, 0));
         AV38OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38OrderedDsc", AV38OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarOrdLin") == 0 )
         {
            AV56TFBarOrdLin = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFBarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFBarOrdLin), 4, 0));
            AV57TFBarOrdLin_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFBarOrdLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TFBarOrdLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasCod") == 0 )
         {
            AV60TFFasCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFFasCod", AV60TFFasCod);
            AV61TFFasCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFFasCod_Sel", AV61TFFasCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasDsc") == 0 )
         {
            AV62TFFasDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFFasDsc", AV62TFFasDsc);
            AV63TFFasDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFFasDsc_Sel", AV63TFFasDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MaqCodBis") == 0 )
         {
            AV64TFMaqCodBis = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFMaqCodBis", AV64TFMaqCodBis);
            AV65TFMaqCodBis_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFMaqCodBis_Sel", AV65TFMaqCodBis_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFasDTI") == 0 )
         {
            AV46TFBarFasDTI = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFBarFasDTI", localUtil.ttoc( AV46TFBarFasDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarTieRea") == 0 )
         {
            AV58TFBarTieRea = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFBarTieRea", GXutil.ltrimstr( AV58TFBarTieRea, 5, 2));
            AV59TFBarTieRea_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFBarTieRea_To", GXutil.ltrimstr( AV59TFBarTieRea_To, 5, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFasEst") == 0 )
         {
            AV49TFBarFasEst_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFBarFasEst_SelsJson", AV49TFBarFasEst_SelsJson);
            AV48TFBarFasEst_Sels.fromJSonString(GXutil.strReplace( AV49TFBarFasEst_SelsJson, "\"", ""), null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFasKgm") == 0 )
         {
            AV50TFBarFasKgm = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFBarFasKgm", GXutil.ltrimstr( AV50TFBarFasKgm, 9, 2));
            AV51TFBarFasKgm_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFBarFasKgm_To", GXutil.ltrimstr( AV51TFBarFasKgm_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFasMtr") == 0 )
         {
            AV52TFBarFasMtr = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFBarFasMtr", GXutil.ltrimstr( AV52TFBarFasMtr, 9, 2));
            AV53TFBarFasMtr_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFBarFasMtr_To", GXutil.ltrimstr( AV53TFBarFasMtr_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFasPri") == 0 )
         {
            AV54TFBarFasPri = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFBarFasPri", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFBarFasPri), 2, 0));
            AV55TFBarFasPri_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFBarFasPri_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFBarFasPri_To), 2, 0));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV48TFBarFasEst_Sels", AV48TFBarFasEst_Sels);
   }

   private void e2323B2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      GXt_char1 = AV34MaqDsc ;
      GXv_char32[0] = A396EmprCod ;
      GXv_char31[0] = A603MaqCodBis ;
      GXv_char30[0] = GXt_char1 ;
      new app.pmaqdsc(remoteHandle, context).execute( GXv_char32, GXv_char31, GXv_char30) ;
      consultadeproduccion_fasesfull_impl.this.A396EmprCod = GXv_char32[0] ;
      consultadeproduccion_fasesfull_impl.this.A603MaqCodBis = GXv_char31[0] ;
      consultadeproduccion_fasesfull_impl.this.GXt_char1 = GXv_char30[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      AV34MaqDsc = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMaqdsc_Internalname, AV34MaqDsc);
      AV8BarFasDTF = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarfasdtf_Internalname, AV8BarFasDTF);
      if ( ( ( A153BarFasEst > 0 ) ) || ( ! (0==A3836BarFasPri) ) )
      {
         if ( ! GXutil.dateCompare(GXutil.nullDate(), A4442BarFasDTI) )
         {
            AV8BarFasDTF = localUtil.ttoc( A4443BarFasDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarfasdtf_Internalname, AV8BarFasDTF);
         }
      }
      if ( ( ( A153BarFasEst >= 2 ) ) || ( ! (0==A3836BarFasPri) ) )
      {
         AV8BarFasDTF = localUtil.ttoc( A4443BarFasDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarfasdtf_Internalname, AV8BarFasDTF);
      }
      if ( A2265BarExt != 0 )
      {
         AV30Lexmvh = (byte)(0) ;
         /* Using cursor H023B4 */
         pr_default.execute(2, new Object[] {AV17EmprCod, Integer.valueOf(AV5BarCod), Byte.valueOf(AV7BarCodReo), AV6BarCodPar, AV22FasCod});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A396EmprCod = H023B4_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
            A129BarCod = H023B4_A129BarCod[0] ;
            n129BarCod = H023B4_n129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = H023B4_A132BarCodReo[0] ;
            n132BarCodReo = H023B4_n132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = H023B4_A130BarCodPar[0] ;
            n130BarCodPar = H023B4_n130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A130BarCodPar", A130BarCodPar);
            A2689ExHdrFas = H023B4_A2689ExHdrFas[0] ;
            A2697ExHdrFeE = H023B4_A2697ExHdrFeE[0] ;
            n2697ExHdrFeE = H023B4_n2697ExHdrFeE[0] ;
            A2700ExHdrFeR = H023B4_A2700ExHdrFeR[0] ;
            n2700ExHdrFeR = H023B4_n2700ExHdrFeR[0] ;
            AV20ExHdrFeE = A2697ExHdrFeE ;
            AV21ExHdrFeR = A2700ExHdrFeR ;
            AV30Lexmvh = (byte)(1) ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         AV8BarFasDTF = (!GXutil.dateCompare(GXutil.nullDate(), A4443BarFasDTF) ? localUtil.ttoc( A4443BarFasDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") : localUtil.dtoc( AV21ExHdrFeR, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarfasdtf_Internalname, AV8BarFasDTF);
      }
      if ( A153BarFasEst == 2 )
      {
         AV41Situacion = httpContext.getMessage( "C", "") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavSituacion_Internalname, AV41Situacion);
      }
      else
      {
         if ( A153BarFasEst == 1 )
         {
            AV41Situacion = httpContext.getMessage( "P", "") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavSituacion_Internalname, AV41Situacion);
         }
         else
         {
            if ( A153BarFasEst == 0 )
            {
               AV41Situacion = " " ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavSituacion_Internalname, AV41Situacion);
            }
         }
      }
      if ( ( GXutil.strcmp(A6173BarFasSec, httpContext.getMessage( "OR", "")) == 0 ) && ( A148BarEstReo == 1 ) )
      {
         GXt_char1 = AV35OpeNom ;
         GXv_char32[0] = A396EmprCod ;
         GXv_int23[0] = A934BarReoCod ;
         GXv_int6[0] = A936BarReoReo ;
         GXv_char31[0] = A935BarReoPar ;
         GXv_int37[0] = A194BarOrdLin ;
         GXv_char30[0] = GXt_char1 ;
         new app.pjln001(remoteHandle, context).execute( GXv_char32, GXv_int23, GXv_int6, GXv_char31, GXv_int37, GXv_char30) ;
         consultadeproduccion_fasesfull_impl.this.A396EmprCod = GXv_char32[0] ;
         consultadeproduccion_fasesfull_impl.this.A934BarReoCod = GXv_int23[0] ;
         consultadeproduccion_fasesfull_impl.this.A936BarReoReo = GXv_int6[0] ;
         consultadeproduccion_fasesfull_impl.this.A935BarReoPar = GXv_char31[0] ;
         consultadeproduccion_fasesfull_impl.this.A194BarOrdLin = GXv_int37[0] ;
         consultadeproduccion_fasesfull_impl.this.GXt_char1 = GXv_char30[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A934BarReoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A934BarReoCod), 8, 0));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A936BarReoReo", GXutil.str( A936BarReoReo, 1, 0));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A935BarReoPar", A935BarReoPar);
         AV35OpeNom = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOpenom_Internalname, AV35OpeNom);
      }
      else
      {
         GXt_char1 = AV35OpeNom ;
         GXv_char32[0] = A396EmprCod ;
         GXv_int23[0] = A129BarCod ;
         GXv_int6[0] = A132BarCodReo ;
         GXv_char31[0] = A130BarCodPar ;
         GXv_int37[0] = A194BarOrdLin ;
         GXv_char30[0] = GXt_char1 ;
         new app.pjln001(remoteHandle, context).execute( GXv_char32, GXv_int23, GXv_int6, GXv_char31, GXv_int37, GXv_char30) ;
         consultadeproduccion_fasesfull_impl.this.A396EmprCod = GXv_char32[0] ;
         consultadeproduccion_fasesfull_impl.this.A129BarCod = GXv_int23[0] ;
         consultadeproduccion_fasesfull_impl.this.A132BarCodReo = GXv_int6[0] ;
         consultadeproduccion_fasesfull_impl.this.A130BarCodPar = GXv_char31[0] ;
         consultadeproduccion_fasesfull_impl.this.A194BarOrdLin = GXv_int37[0] ;
         consultadeproduccion_fasesfull_impl.this.GXt_char1 = GXv_char30[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A130BarCodPar", A130BarCodPar);
         AV35OpeNom = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOpenom_Internalname, AV35OpeNom);
      }
      if ( ( A3836BarFasPri > 0 ) && ( A153BarFasEst == 0 ) && ! (GXutil.strcmp("", AV8BarFasDTF)==0) )
      {
         edtBarOrdLin_Columnclass = "WWColumn WWColumnDanger hidden-xs WWColumnDangerFirstColumn" ;
         edtFasCod_Columnclass = "WWColumn WWColumnDanger hidden-xs" ;
         edtFasDsc_Columnclass = "WWColumn WWColumnDanger" ;
         edtMaqCodBis_Columnclass = "WWColumn WWColumnDanger hidden-xs" ;
         edtavMaqdsc_Columnclass = "WWColumn WWColumnDanger" ;
         edtBarFasDTI_Columnclass = "WWColumn WWColumnDanger" ;
         edtavBarfasdtf_Columnclass = "WWColumn WWColumnDanger" ;
         edtBarTieRea_Columnclass = "WWColumn WWColumnDanger hidden-xs" ;
         cmbBarFasEst.setColumnClass( "WWColumn WWColumnDanger hidden-xs" );
         edtBarFasKgm_Columnclass = "WWColumn WWColumnDanger" ;
         edtBarFasMtr_Columnclass = "WWColumn WWColumnDanger" ;
         edtavOpenom_Columnclass = "WWColumn WWColumnDanger" ;
         edtBarFasPri_Columnclass = "WWColumn WWColumnDanger hidden-xs" ;
      }
      else if ( A153BarFasEst == 1 )
      {
         edtBarOrdLin_Columnclass = "WWColumn WWColumnSuccess hidden-xs WWColumnSuccessFirstColumn" ;
         edtFasCod_Columnclass = "WWColumn WWColumnSuccess hidden-xs" ;
         edtFasDsc_Columnclass = "WWColumn WWColumnSuccess" ;
         edtMaqCodBis_Columnclass = "WWColumn WWColumnSuccess hidden-xs" ;
         edtavMaqdsc_Columnclass = "WWColumn WWColumnSuccess" ;
         edtBarFasDTI_Columnclass = "WWColumn WWColumnSuccess" ;
         edtavBarfasdtf_Columnclass = "WWColumn WWColumnSuccess" ;
         edtBarTieRea_Columnclass = "WWColumn WWColumnSuccess hidden-xs" ;
         cmbBarFasEst.setColumnClass( "WWColumn WWColumnSuccess hidden-xs" );
         edtBarFasKgm_Columnclass = "WWColumn WWColumnSuccess" ;
         edtBarFasMtr_Columnclass = "WWColumn WWColumnSuccess" ;
         edtavOpenom_Columnclass = "WWColumn WWColumnSuccess" ;
         edtBarFasPri_Columnclass = "WWColumn WWColumnSuccess hidden-xs" ;
      }
      else if ( A153BarFasEst == 2 )
      {
         edtBarOrdLin_Columnclass = "WWColumn WWColumnInfo hidden-xs WWColumnInfoFirstColumn" ;
         edtFasCod_Columnclass = "WWColumn WWColumnInfo hidden-xs" ;
         edtFasDsc_Columnclass = "WWColumn WWColumnInfo" ;
         edtMaqCodBis_Columnclass = "WWColumn WWColumnInfo hidden-xs" ;
         edtavMaqdsc_Columnclass = "WWColumn WWColumnInfo" ;
         edtBarFasDTI_Columnclass = "WWColumn WWColumnInfo" ;
         edtavBarfasdtf_Columnclass = "WWColumn WWColumnInfo" ;
         edtBarTieRea_Columnclass = "WWColumn WWColumnInfo hidden-xs" ;
         cmbBarFasEst.setColumnClass( "WWColumn WWColumnInfo hidden-xs" );
         edtBarFasKgm_Columnclass = "WWColumn WWColumnInfo" ;
         edtBarFasMtr_Columnclass = "WWColumn WWColumnInfo" ;
         edtavOpenom_Columnclass = "WWColumn WWColumnInfo" ;
         edtBarFasPri_Columnclass = "WWColumn WWColumnInfo hidden-xs" ;
      }
      else
      {
         edtBarOrdLin_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
         edtFasCod_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
         edtFasDsc_Columnclass = httpContext.getMessage( "WWColumn", "") ;
         edtMaqCodBis_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
         edtavMaqdsc_Columnclass = httpContext.getMessage( "WWColumn", "") ;
         edtBarFasDTI_Columnclass = httpContext.getMessage( "WWColumn", "") ;
         edtavBarfasdtf_Columnclass = httpContext.getMessage( "WWColumn", "") ;
         edtBarTieRea_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
         cmbBarFasEst.setColumnClass( httpContext.getMessage( "WWColumn hidden-xs", "") );
         edtBarFasKgm_Columnclass = httpContext.getMessage( "WWColumn", "") ;
         edtBarFasMtr_Columnclass = httpContext.getMessage( "WWColumn", "") ;
         edtavOpenom_Columnclass = httpContext.getMessage( "WWColumn", "") ;
         edtBarFasPri_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
      }
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(235) ;
      }
      sendrow_2352( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_235_Refreshing )
      {
         httpContext.doAjaxLoad(235, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e1523B2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV11ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV9ColumnsSelector.fromJSonString(AV11ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "ConsultadeProduccion_FasesFullColumnsSelector", ((GXutil.strcmp("", AV11ColumnsSelectorXML)==0) ? "" : AV9ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV9ColumnsSelector", AV9ColumnsSelector);
   }

   public void e1923B2( )
   {
      /* 'DoPdf_win' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.rconprc1", new String[] {GXutil.URLEncode(GXutil.rtrim(AV17EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV5BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV6BarCodPar))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar"}) , new Object[] {"AV17EmprCod","AV5BarCod","AV7BarCodReo","AV6BarCodPar"});
      /*  Sending Event outputs  */
   }

   public void e1623B2( )
   {
      /* 'DoPdf_Hdr' Routine */
      returnInSub = false ;
      if ( AV93Dorado == 1 )
      {
         GXv_char32[0] = AV17EmprCod ;
         GXv_int23[0] = AV5BarCod ;
         GXv_int6[0] = AV7BarCodReo ;
         GXv_char31[0] = AV6BarCodPar ;
         GXv_char30[0] = httpContext.getMessage( "SCR", "") ;
         new app.rhdrdo(remoteHandle, context).execute( GXv_char32, GXv_int23, GXv_int6, GXv_char31, GXv_char30) ;
         consultadeproduccion_fasesfull_impl.this.AV17EmprCod = GXv_char32[0] ;
         consultadeproduccion_fasesfull_impl.this.AV5BarCod = GXv_int23[0] ;
         consultadeproduccion_fasesfull_impl.this.AV7BarCodReo = GXv_int6[0] ;
         consultadeproduccion_fasesfull_impl.this.AV6BarCodPar = GXv_char31[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17EmprCod", AV17EmprCod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7BarCodReo", GXutil.str( AV7BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6BarCodPar", AV6BarCodPar);
      }
      else
      {
         if ( AV94Moda21 == 1 )
         {
            httpContext.popup(formatLink("app.rhdrmod", new String[] {GXutil.URLEncode(GXutil.rtrim(AV17EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV5BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV6BarCodPar)),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "SCR", "")))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","ImpCod","Output"}) , new Object[] {});
         }
         else
         {
            httpContext.popup(formatLink("app.pcarordemservico", new String[] {GXutil.URLEncode(GXutil.rtrim(AV17EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV5BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV6BarCodPar)),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "SCR", "")))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","ImpCod","Output"}) , new Object[] {"AV17EmprCod","AV5BarCod","AV7BarCodReo","AV6BarCodPar","",""});
         }
      }
      /*  Sending Event outputs  */
   }

   public void e2023B2( )
   {
      /* 'DoPDF_ProdCliente' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.rconprc1", new String[] {GXutil.URLEncode(GXutil.rtrim(AV17EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV5BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV6BarCodPar))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar"}) , new Object[] {"AV17EmprCod","AV5BarCod","AV7BarCodReo","AV6BarCodPar"});
      /*  Sending Event outputs  */
   }

   public void e1723B2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      AV69Var_Hdr = AV17EmprCod + GXutil.str( AV5BarCod, 8, 0) + GXutil.str( AV7BarCodReo, 1, 0) + AV6BarCodPar ;
      AV70WebSession.setValue("&Var_Hdr", AV69Var_Hdr);
      GXv_char32[0] = AV19ExcelFilename ;
      GXv_char31[0] = AV18ErrorMessage ;
      new app.consultadeproduccion_fasesfullexport(remoteHandle, context).execute( GXv_char32, GXv_char31) ;
      consultadeproduccion_fasesfull_impl.this.AV19ExcelFilename = GXv_char32[0] ;
      consultadeproduccion_fasesfull_impl.this.AV18ErrorMessage = GXv_char31[0] ;
      if ( GXutil.strcmp(AV19ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV19ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV18ErrorMessage);
      }
   }

   public void e1823B2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      AV69Var_Hdr = AV17EmprCod + GXutil.str( AV5BarCod, 8, 0) + GXutil.str( AV7BarCodReo, 1, 0) + AV6BarCodPar ;
      AV70WebSession.setValue("&Var_Hdr", AV69Var_Hdr);
      callWebObject(formatLink("app.consultadeproduccion_fasesfullexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void S132( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV36OrderedBy, 4, 0))+":"+(AV38OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S182( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV9ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector41[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector41, "BarOrdLin", "", "Orden", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector41[0] ;
      GXv_SdtWWPColumnsSelector41[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector41, "FasCod", "", "Codigo Fase", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector41[0] ;
      GXv_SdtWWPColumnsSelector41[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector41, "FasDsc", "", "Descripcion de Fase", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector41[0] ;
      GXv_SdtWWPColumnsSelector41[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector41, "MaqCodBis", "", "Maquina", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector41[0] ;
      GXv_SdtWWPColumnsSelector41[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector41, "&MaqDsc", "", "Descripcion ", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector41[0] ;
      GXv_SdtWWPColumnsSelector41[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector41, "BarFasDTI", "", "Inicio", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector41[0] ;
      GXv_SdtWWPColumnsSelector41[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector41, "&BarFasDTF", "", "Fin", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector41[0] ;
      GXv_SdtWWPColumnsSelector41[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector41, "BarTieRea", "", "HhMm", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector41[0] ;
      GXv_SdtWWPColumnsSelector41[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector41, "BarFasEst", "", "E", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector41[0] ;
      GXv_SdtWWPColumnsSelector41[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector41, "BarFasKgm", "", "Unidades", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector41[0] ;
      GXv_SdtWWPColumnsSelector41[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector41, "BarFasMtr", "", "Metros", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector41[0] ;
      GXv_SdtWWPColumnsSelector41[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector41, "&OpeNom", "", "Operario", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector41[0] ;
      GXv_SdtWWPColumnsSelector41[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector41, "BarFasPri", "", "PP", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector41[0] ;
      GXt_char1 = AV68UserCustomValue ;
      GXv_char32[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "ConsultadeProduccion_FasesFullColumnsSelector", GXv_char32) ;
      consultadeproduccion_fasesfull_impl.this.GXt_char1 = GXv_char32[0] ;
      AV68UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV68UserCustomValue)==0) ) )
      {
         AV10ColumnsSelectorAux.fromxml(AV68UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector41[0] = AV10ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector42[0] = AV9ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector41, GXv_SdtWWPColumnsSelector42) ;
         AV10ColumnsSelectorAux = GXv_SdtWWPColumnsSelector41[0] ;
         AV9ColumnsSelector = GXv_SdtWWPColumnsSelector42[0] ;
      }
   }

   public void S162( )
   {
      /* 'CHECKSECURITYFORACTIONS' Routine */
      returnInSub = false ;
      if ( ! ( ( 1 == 0 ) ) )
      {
         bttBtnpdf_win_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, bttBtnpdf_win_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtnpdf_win_Visible), 5, 0), true);
      }
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV40Session.getValue(AV118Pgmname+"GridState"), "") == 0 )
      {
         AV26GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV118Pgmname+"GridState"), null, null);
      }
      else
      {
         AV26GridState.fromxml(AV40Session.getValue(AV118Pgmname+"GridState"), null, null);
      }
      AV36OrderedBy = AV26GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36OrderedBy), 4, 0));
      AV38OrderedDsc = AV26GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38OrderedDsc", AV38OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S132 ();
      if (returnInSub) return;
      AV142GXV1 = 1 ;
      while ( AV142GXV1 <= AV26GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV27GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV26GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV142GXV1));
         if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARORDLIN") == 0 )
         {
            AV56TFBarOrdLin = (short)(GXutil.lval( AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFBarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFBarOrdLin), 4, 0));
            AV57TFBarOrdLin_To = (short)(GXutil.lval( AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFBarOrdLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TFBarOrdLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD") == 0 )
         {
            AV60TFFasCod = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFFasCod", AV60TFFasCod);
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD_SEL") == 0 )
         {
            AV61TFFasCod_Sel = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFFasCod_Sel", AV61TFFasCod_Sel);
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC") == 0 )
         {
            AV62TFFasDsc = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFFasDsc", AV62TFFasDsc);
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC_SEL") == 0 )
         {
            AV63TFFasDsc_Sel = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFFasDsc_Sel", AV63TFFasDsc_Sel);
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODBIS") == 0 )
         {
            AV64TFMaqCodBis = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFMaqCodBis", AV64TFMaqCodBis);
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODBIS_SEL") == 0 )
         {
            AV65TFMaqCodBis_Sel = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFMaqCodBis_Sel", AV65TFMaqCodBis_Sel);
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASDTI") == 0 )
         {
            AV46TFBarFasDTI = localUtil.ctot( AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFBarFasDTI", localUtil.ttoc( AV46TFBarFasDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV14DDO_BarFasDTIAuxDate = GXutil.resetTime(AV46TFBarFasDTI) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14DDO_BarFasDTIAuxDate", localUtil.format(AV14DDO_BarFasDTIAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIEREA") == 0 )
         {
            AV58TFBarTieRea = CommonUtil.decimalVal( AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFBarTieRea", GXutil.ltrimstr( AV58TFBarTieRea, 5, 2));
            AV59TFBarTieRea_To = CommonUtil.decimalVal( AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFBarTieRea_To", GXutil.ltrimstr( AV59TFBarTieRea_To, 5, 2));
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASEST_SEL") == 0 )
         {
            AV49TFBarFasEst_SelsJson = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFBarFasEst_SelsJson", AV49TFBarFasEst_SelsJson);
            AV48TFBarFasEst_Sels.fromJSonString(AV49TFBarFasEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASKGM") == 0 )
         {
            AV50TFBarFasKgm = CommonUtil.decimalVal( AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFBarFasKgm", GXutil.ltrimstr( AV50TFBarFasKgm, 9, 2));
            AV51TFBarFasKgm_To = CommonUtil.decimalVal( AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFBarFasKgm_To", GXutil.ltrimstr( AV51TFBarFasKgm_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASMTR") == 0 )
         {
            AV52TFBarFasMtr = CommonUtil.decimalVal( AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFBarFasMtr", GXutil.ltrimstr( AV52TFBarFasMtr, 9, 2));
            AV53TFBarFasMtr_To = CommonUtil.decimalVal( AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFBarFasMtr_To", GXutil.ltrimstr( AV53TFBarFasMtr_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASPRI") == 0 )
         {
            AV54TFBarFasPri = (byte)(GXutil.lval( AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFBarFasPri", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFBarFasPri), 2, 0));
            AV55TFBarFasPri_To = (byte)(GXutil.lval( AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFBarFasPri_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFBarFasPri_To), 2, 0));
         }
         AV142GXV1 = (int)(AV142GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char32[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV61TFFasCod_Sel)==0), AV61TFFasCod_Sel, GXv_char32) ;
      consultadeproduccion_fasesfull_impl.this.GXt_char1 = GXv_char32[0] ;
      GXt_char43 = "" ;
      GXv_char31[0] = GXt_char43 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV63TFFasDsc_Sel)==0), AV63TFFasDsc_Sel, GXv_char31) ;
      consultadeproduccion_fasesfull_impl.this.GXt_char43 = GXv_char31[0] ;
      GXt_char44 = "" ;
      GXv_char30[0] = GXt_char44 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV65TFMaqCodBis_Sel)==0), AV65TFMaqCodBis_Sel, GXv_char30) ;
      consultadeproduccion_fasesfull_impl.this.GXt_char44 = GXv_char30[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|"+GXt_char43+"|"+GXt_char44+"|||||"+((AV48TFBarFasEst_Sels.size()==0) ? "" : AV49TFBarFasEst_SelsJson)+"||||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char44 = "" ;
      GXv_char32[0] = GXt_char44 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV60TFFasCod)==0), AV60TFFasCod, GXv_char32) ;
      consultadeproduccion_fasesfull_impl.this.GXt_char44 = GXv_char32[0] ;
      GXt_char43 = "" ;
      GXv_char31[0] = GXt_char43 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV62TFFasDsc)==0), AV62TFFasDsc, GXv_char31) ;
      consultadeproduccion_fasesfull_impl.this.GXt_char43 = GXv_char31[0] ;
      GXt_char1 = "" ;
      GXv_char30[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV64TFMaqCodBis)==0), AV64TFMaqCodBis, GXv_char30) ;
      consultadeproduccion_fasesfull_impl.this.GXt_char1 = GXv_char30[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV56TFBarOrdLin) ? "" : GXutil.str( AV56TFBarOrdLin, 4, 0))+"|"+GXt_char44+"|"+GXt_char43+"|"+GXt_char1+"||"+(GXutil.dateCompare(GXutil.nullDate(), AV46TFBarFasDTI) ? "" : localUtil.dtoc( AV14DDO_BarFasDTIAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV58TFBarTieRea)==0) ? "" : GXutil.str( AV58TFBarTieRea, 5, 2))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFBarFasKgm)==0) ? "" : GXutil.str( AV50TFBarFasKgm, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV52TFBarFasMtr)==0) ? "" : GXutil.str( AV52TFBarFasMtr, 9, 2))+"||"+((0==AV54TFBarFasPri) ? "" : GXutil.str( AV54TFBarFasPri, 2, 0)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV57TFBarOrdLin_To) ? "" : GXutil.str( AV57TFBarOrdLin_To, 4, 0))+"|||||||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV59TFBarTieRea_To)==0) ? "" : GXutil.str( AV59TFBarTieRea_To, 5, 2))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFBarFasKgm_To)==0) ? "" : GXutil.str( AV51TFBarFasKgm_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFBarFasMtr_To)==0) ? "" : GXutil.str( AV53TFBarFasMtr_To, 9, 2))+"||"+((0==AV55TFBarFasPri_To) ? "" : GXutil.str( AV55TFBarFasPri_To, 2, 0)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
      if ( ! (GXutil.strcmp("", GXutil.trim( AV26GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV26GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV26GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S172( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV26GridState.fromxml(AV40Session.getValue(AV118Pgmname+"GridState"), null, null);
      AV26GridState.setgxTv_SdtWWPGridState_Orderedby( AV36OrderedBy );
      AV26GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV38OrderedDsc );
      AV26GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState45[0] = AV26GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState45, "TFBARORDLIN", "", !((0==AV56TFBarOrdLin)&&(0==AV57TFBarOrdLin_To)), (short)(0), GXutil.trim( GXutil.str( AV56TFBarOrdLin, 4, 0)), GXutil.trim( GXutil.str( AV57TFBarOrdLin_To, 4, 0))) ;
      AV26GridState = GXv_SdtWWPGridState45[0] ;
      GXv_SdtWWPGridState45[0] = AV26GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState45, "TFFASCOD", "", !(GXutil.strcmp("", AV60TFFasCod)==0), (short)(0), AV60TFFasCod, "", !(GXutil.strcmp("", AV61TFFasCod_Sel)==0), AV61TFFasCod_Sel, "") ;
      AV26GridState = GXv_SdtWWPGridState45[0] ;
      GXv_SdtWWPGridState45[0] = AV26GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState45, "TFFASDSC", "", !(GXutil.strcmp("", AV62TFFasDsc)==0), (short)(0), AV62TFFasDsc, "", !(GXutil.strcmp("", AV63TFFasDsc_Sel)==0), AV63TFFasDsc_Sel, "") ;
      AV26GridState = GXv_SdtWWPGridState45[0] ;
      GXv_SdtWWPGridState45[0] = AV26GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState45, "TFMAQCODBIS", "", !(GXutil.strcmp("", AV64TFMaqCodBis)==0), (short)(0), AV64TFMaqCodBis, "", !(GXutil.strcmp("", AV65TFMaqCodBis_Sel)==0), AV65TFMaqCodBis_Sel, "") ;
      AV26GridState = GXv_SdtWWPGridState45[0] ;
      GXv_SdtWWPGridState45[0] = AV26GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState45, "TFBARFASDTI", "", !GXutil.dateCompare(GXutil.nullDate(), AV46TFBarFasDTI), (short)(0), GXutil.trim( localUtil.ttoc( AV46TFBarFasDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV26GridState = GXv_SdtWWPGridState45[0] ;
      GXv_SdtWWPGridState45[0] = AV26GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState45, "TFBARTIEREA", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV58TFBarTieRea)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV59TFBarTieRea_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV58TFBarTieRea, 5, 2)), GXutil.trim( GXutil.str( AV59TFBarTieRea_To, 5, 2))) ;
      AV26GridState = GXv_SdtWWPGridState45[0] ;
      GXv_SdtWWPGridState45[0] = AV26GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState45, "TFBARFASEST_SEL", "", !(AV48TFBarFasEst_Sels.size()==0), (short)(0), AV48TFBarFasEst_Sels.toJSonString(false), "") ;
      AV26GridState = GXv_SdtWWPGridState45[0] ;
      GXv_SdtWWPGridState45[0] = AV26GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState45, "TFBARFASKGM", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFBarFasKgm)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFBarFasKgm_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV50TFBarFasKgm, 9, 2)), GXutil.trim( GXutil.str( AV51TFBarFasKgm_To, 9, 2))) ;
      AV26GridState = GXv_SdtWWPGridState45[0] ;
      GXv_SdtWWPGridState45[0] = AV26GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState45, "TFBARFASMTR", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV52TFBarFasMtr)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFBarFasMtr_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV52TFBarFasMtr, 9, 2)), GXutil.trim( GXutil.str( AV53TFBarFasMtr_To, 9, 2))) ;
      AV26GridState = GXv_SdtWWPGridState45[0] ;
      GXv_SdtWWPGridState45[0] = AV26GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState45, "TFBARFASPRI", "", !((0==AV54TFBarFasPri)&&(0==AV55TFBarFasPri_To)), (short)(0), GXutil.trim( GXutil.str( AV54TFBarFasPri, 2, 0)), GXutil.trim( GXutil.str( AV55TFBarFasPri_To, 2, 0))) ;
      AV26GridState = GXv_SdtWWPGridState45[0] ;
      if ( ! (GXutil.strcmp("", AV17EmprCod)==0) )
      {
         AV27GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV27GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV27GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV17EmprCod );
         AV26GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV27GridStateFilterValue, 0);
      }
      if ( ! (0==AV5BarCod) )
      {
         AV27GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV27GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOD" );
         AV27GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV5BarCod, 8, 0) );
         AV26GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV27GridStateFilterValue, 0);
      }
      if ( ! (0==AV7BarCodReo) )
      {
         AV27GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV27GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODREO" );
         AV27GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV7BarCodReo, 1, 0) );
         AV26GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV27GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV6BarCodPar)==0) )
      {
         AV27GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV27GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODPAR" );
         AV27GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV6BarCodPar );
         AV26GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV27GridStateFilterValue, 0);
      }
      AV26GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV26GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV118Pgmname+"GridState", AV26GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV66TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV66TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV118Pgmname );
      AV66TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV66TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV28HTTPRequest.getScriptName()+"?"+AV28HTTPRequest.getQuerystring() );
      AV66TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "BARFAS" );
      AV67TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV67TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "EmprCod" );
      AV67TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( AV17EmprCod );
      AV66TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV67TrnContextAtt, 0);
      AV67TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV67TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "BarCod" );
      AV67TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( GXutil.str( AV5BarCod, 8, 0) );
      AV66TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV67TrnContextAtt, 0);
      AV67TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV67TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "BarCodReo" );
      AV67TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( GXutil.str( AV7BarCodReo, 1, 0) );
      AV66TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV67TrnContextAtt, 0);
      AV67TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV67TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "BarCodPar" );
      AV67TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( AV6BarCodPar );
      AV66TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV67TrnContextAtt, 0);
      AV40Session.setValue("TrnContext", AV66TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S152( )
   {
      /* 'BARPIE' Routine */
      returnInSub = false ;
      AV98AlbRFen = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV98AlbRFen", localUtil.format(AV98AlbRFen, "99/99/99"));
      /* Using cursor H023B5 */
      pr_default.execute(3, new Object[] {Integer.valueOf(AV5BarCod), Byte.valueOf(AV7BarCodReo), AV6BarCodPar});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk23B4 = false ;
         A44AlbRecCod = H023B5_A44AlbRecCod[0] ;
         A130BarCodPar = H023B5_A130BarCodPar[0] ;
         n130BarCodPar = H023B5_n130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A130BarCodPar", A130BarCodPar);
         A132BarCodReo = H023B5_A132BarCodReo[0] ;
         n132BarCodReo = H023B5_n132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A129BarCod = H023B5_A129BarCod[0] ;
         n129BarCod = H023B5_n129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A396EmprCod = H023B5_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         A49AlbRFen = H023B5_A49AlbRFen[0] ;
         A200BarPieCod = H023B5_A200BarPieCod[0] ;
         A49AlbRFen = H023B5_A49AlbRFen[0] ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(H023B5_A396EmprCod[0], A396EmprCod) == 0 ) && ( H023B5_A129BarCod[0] == A129BarCod ) && ( H023B5_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(H023B5_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            if ( ! ( ( H023B5_A44AlbRecCod[0] == A44AlbRecCod ) ) )
            {
               if (true) break;
            }
            brk23B4 = false ;
            A49AlbRFen = H023B5_A49AlbRFen[0] ;
            A200BarPieCod = H023B5_A200BarPieCod[0] ;
            A49AlbRFen = H023B5_A49AlbRFen[0] ;
            AV98AlbRFen = A49AlbRFen ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV98AlbRFen", localUtil.format(AV98AlbRFen, "99/99/99"));
            brk23B4 = true ;
            pr_default.readNext(3);
         }
         if ( ! brk23B4 )
         {
            brk23B4 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S142( )
   {
      /* 'CFORMU' Routine */
      returnInSub = false ;
      AV99ForFecApr = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV99ForFecApr", localUtil.format(AV99ForFecApr, "99/99/99"));
      /* Using cursor H023B6 */
      pr_default.execute(4, new Object[] {AV17EmprCod, Integer.valueOf(AV72CliCod), AV74BarSer, AV82BarColNom, Integer.valueOf(AV83BarColNum), Byte.valueOf(AV87BarTipCol)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A831TipColCod = H023B6_A831TipColCod[0] ;
         A483ForColNum = H023B6_A483ForColNum[0] ;
         A482ForColNom = H023B6_A482ForColNom[0] ;
         A494ForSer = H023B6_A494ForSer[0] ;
         A252CliCod = H023B6_A252CliCod[0] ;
         A396EmprCod = H023B6_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         A3558ForFecApr = H023B6_A3558ForFecApr[0] ;
         n3558ForFecApr = H023B6_n3558ForFecApr[0] ;
         AV99ForFecApr = A3558ForFecApr ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV99ForFecApr", localUtil.format(AV99ForFecApr, "99/99/99"));
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
   }

   public void wb_table1_224_23B2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablerightheader_Internalname, tblTablerightheader_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_224_23B2e( true) ;
      }
      else
      {
         wb_table1_224_23B2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV17EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17EmprCod", AV17EmprCod);
      AV5BarCod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCod), 8, 0));
      AV7BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7BarCodReo", GXutil.str( AV7BarCodReo, 1, 0));
      AV6BarCodPar = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6BarCodPar", AV6BarCodPar);
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
      pa23B2( ) ;
      ws23B2( ) ;
      we23B2( ) ;
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
      sCtrlAV17EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV5BarCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV7BarCodReo = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV6BarCodPar = (String)getParm(obj,3,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa23B2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "consultadeproduccion_fasesfull", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa23B2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV17EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17EmprCod", AV17EmprCod);
         AV5BarCod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCod), 8, 0));
         AV7BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7BarCodReo", GXutil.str( AV7BarCodReo, 1, 0));
         AV6BarCodPar = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6BarCodPar", AV6BarCodPar);
      }
      wcpOAV17EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV17EmprCod") ;
      wcpOAV5BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV5BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV7BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV7BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV6BarCodPar = httpContext.cgiGet( sPrefix+"wcpOAV6BarCodPar") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV17EmprCod, wcpOAV17EmprCod) != 0 ) || ( AV5BarCod != wcpOAV5BarCod ) || ( AV7BarCodReo != wcpOAV7BarCodReo ) || ( GXutil.strcmp(AV6BarCodPar, wcpOAV6BarCodPar) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV17EmprCod = AV17EmprCod ;
      wcpOAV5BarCod = AV5BarCod ;
      wcpOAV7BarCodReo = AV7BarCodReo ;
      wcpOAV6BarCodPar = AV6BarCodPar ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV17EmprCod = httpContext.cgiGet( sPrefix+"AV17EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV17EmprCod) > 0 )
      {
         AV17EmprCod = httpContext.cgiGet( sCtrlAV17EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17EmprCod", AV17EmprCod);
      }
      else
      {
         AV17EmprCod = httpContext.cgiGet( sPrefix+"AV17EmprCod_PARM") ;
      }
      sCtrlAV5BarCod = httpContext.cgiGet( sPrefix+"AV5BarCod_CTRL") ;
      if ( GXutil.len( sCtrlAV5BarCod) > 0 )
      {
         AV5BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV5BarCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCod), 8, 0));
      }
      else
      {
         AV5BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV5BarCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV7BarCodReo = httpContext.cgiGet( sPrefix+"AV7BarCodReo_CTRL") ;
      if ( GXutil.len( sCtrlAV7BarCodReo) > 0 )
      {
         AV7BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV7BarCodReo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7BarCodReo", GXutil.str( AV7BarCodReo, 1, 0));
      }
      else
      {
         AV7BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV7BarCodReo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV6BarCodPar = httpContext.cgiGet( sPrefix+"AV6BarCodPar_CTRL") ;
      if ( GXutil.len( sCtrlAV6BarCodPar) > 0 )
      {
         AV6BarCodPar = httpContext.cgiGet( sCtrlAV6BarCodPar) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6BarCodPar", AV6BarCodPar);
      }
      else
      {
         AV6BarCodPar = httpContext.cgiGet( sPrefix+"AV6BarCodPar_PARM") ;
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
      pa23B2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws23B2( ) ;
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
      ws23B2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV17EmprCod_PARM", GXutil.rtrim( AV17EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV17EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV17EmprCod_CTRL", GXutil.rtrim( sCtrlAV17EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5BarCod_PARM", GXutil.ltrim( localUtil.ntoc( AV5BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV5BarCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5BarCod_CTRL", GXutil.rtrim( sCtrlAV5BarCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7BarCodReo_PARM", GXutil.ltrim( localUtil.ntoc( AV7BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7BarCodReo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7BarCodReo_CTRL", GXutil.rtrim( sCtrlAV7BarCodReo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6BarCodPar_PARM", GXutil.rtrim( AV6BarCodPar));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV6BarCodPar)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6BarCodPar_CTRL", GXutil.rtrim( sCtrlAV6BarCodPar));
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
      we23B2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211685415", true, true);
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
      httpContext.AddJavascriptSource("consultadeproduccion_fasesfull.js", "?20268211685418", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_2352( )
   {
      edtBarOrdLin_Internalname = sPrefix+"BARORDLIN_"+sGXsfl_235_idx ;
      edtFasCod_Internalname = sPrefix+"FASCOD_"+sGXsfl_235_idx ;
      edtFasDsc_Internalname = sPrefix+"FASDSC_"+sGXsfl_235_idx ;
      edtBarFacTin_Internalname = sPrefix+"BARFACTIN_"+sGXsfl_235_idx ;
      edtMaqCodBis_Internalname = sPrefix+"MAQCODBIS_"+sGXsfl_235_idx ;
      edtavMaqdsc_Internalname = sPrefix+"vMAQDSC_"+sGXsfl_235_idx ;
      edtBarFasDTI_Internalname = sPrefix+"BARFASDTI_"+sGXsfl_235_idx ;
      edtavBarfasdtf_Internalname = sPrefix+"vBARFASDTF_"+sGXsfl_235_idx ;
      edtBarTieRea_Internalname = sPrefix+"BARTIEREA_"+sGXsfl_235_idx ;
      edtavSituacion_Internalname = sPrefix+"vSITUACION_"+sGXsfl_235_idx ;
      cmbBarFasEst.setInternalname( sPrefix+"BARFASEST_"+sGXsfl_235_idx );
      edtBarFasKgm_Internalname = sPrefix+"BARFASKGM_"+sGXsfl_235_idx ;
      edtBarFasMtr_Internalname = sPrefix+"BARFASMTR_"+sGXsfl_235_idx ;
      edtavOpenom_Internalname = sPrefix+"vOPENOM_"+sGXsfl_235_idx ;
      edtBarFasPri_Internalname = sPrefix+"BARFASPRI_"+sGXsfl_235_idx ;
   }

   public void subsflControlProps_fel_2352( )
   {
      edtBarOrdLin_Internalname = sPrefix+"BARORDLIN_"+sGXsfl_235_fel_idx ;
      edtFasCod_Internalname = sPrefix+"FASCOD_"+sGXsfl_235_fel_idx ;
      edtFasDsc_Internalname = sPrefix+"FASDSC_"+sGXsfl_235_fel_idx ;
      edtBarFacTin_Internalname = sPrefix+"BARFACTIN_"+sGXsfl_235_fel_idx ;
      edtMaqCodBis_Internalname = sPrefix+"MAQCODBIS_"+sGXsfl_235_fel_idx ;
      edtavMaqdsc_Internalname = sPrefix+"vMAQDSC_"+sGXsfl_235_fel_idx ;
      edtBarFasDTI_Internalname = sPrefix+"BARFASDTI_"+sGXsfl_235_fel_idx ;
      edtavBarfasdtf_Internalname = sPrefix+"vBARFASDTF_"+sGXsfl_235_fel_idx ;
      edtBarTieRea_Internalname = sPrefix+"BARTIEREA_"+sGXsfl_235_fel_idx ;
      edtavSituacion_Internalname = sPrefix+"vSITUACION_"+sGXsfl_235_fel_idx ;
      cmbBarFasEst.setInternalname( sPrefix+"BARFASEST_"+sGXsfl_235_fel_idx );
      edtBarFasKgm_Internalname = sPrefix+"BARFASKGM_"+sGXsfl_235_fel_idx ;
      edtBarFasMtr_Internalname = sPrefix+"BARFASMTR_"+sGXsfl_235_fel_idx ;
      edtavOpenom_Internalname = sPrefix+"vOPENOM_"+sGXsfl_235_fel_idx ;
      edtBarFasPri_Internalname = sPrefix+"BARFASPRI_"+sGXsfl_235_fel_idx ;
   }

   public void sendrow_2352( )
   {
      subsflControlProps_2352( ) ;
      wb23B0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_235_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_235_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_235_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarOrdLin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "TagColumn" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarOrdLin_Internalname,GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarOrdLin_Jsonclick,Integer.valueOf(0),"TagColumn","",ROClassString,edtBarOrdLin_Columnclass,edtBarOrdLin_Columnheaderclass,Integer.valueOf(edtBarOrdLin_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(235),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtFasCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "TagColumn" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasCod_Internalname,GXutil.rtrim( A457FasCod),GXutil.rtrim( localUtil.format( A457FasCod, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtFasCod_Jsonclick,Integer.valueOf(0),"TagColumn","",ROClassString,edtFasCod_Columnclass,edtFasCod_Columnheaderclass,Integer.valueOf(edtFasCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(235),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtFasDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "TagColumn" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasDsc_Internalname,GXutil.rtrim( A460FasDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtFasDsc_Jsonclick,Integer.valueOf(0),"TagColumn","",ROClassString,edtFasDsc_Columnclass,edtFasDsc_Columnheaderclass,Integer.valueOf(edtFasDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(235),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFacTin_Internalname,GXutil.rtrim( A150BarFacTin),GXutil.rtrim( localUtil.format( A150BarFacTin, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFacTin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(235),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMaqCodBis_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "TagColumn" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqCodBis_Internalname,GXutil.rtrim( A603MaqCodBis),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMaqCodBis_Jsonclick,Integer.valueOf(0),"TagColumn","",ROClassString,edtMaqCodBis_Columnclass,edtMaqCodBis_Columnheaderclass,Integer.valueOf(edtMaqCodBis_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(235),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavMaqdsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "TagColumn" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqdsc_Internalname,GXutil.rtrim( AV34MaqDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavMaqdsc_Jsonclick,Integer.valueOf(0),"TagColumn","",ROClassString,edtavMaqdsc_Columnclass,edtavMaqdsc_Columnheaderclass,Integer.valueOf(edtavMaqdsc_Visible),Integer.valueOf(edtavMaqdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(235),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarFasDTI_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "TagColumn" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasDTI_Internalname,localUtil.ttoc( A4442BarFasDTI, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A4442BarFasDTI, "99/99/99 99:99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFasDTI_Jsonclick,Integer.valueOf(0),"TagColumn","",ROClassString,edtBarFasDTI_Columnclass,edtBarFasDTI_Columnheaderclass,Integer.valueOf(edtBarFasDTI_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(235),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavBarfasdtf_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "TagColumn" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarfasdtf_Internalname,GXutil.rtrim( AV8BarFasDTF),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBarfasdtf_Jsonclick,Integer.valueOf(0),"TagColumn","",ROClassString,edtavBarfasdtf_Columnclass,edtavBarfasdtf_Columnheaderclass,Integer.valueOf(edtavBarfasdtf_Visible),Integer.valueOf(edtavBarfasdtf_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(235),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarTieRea_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "TagColumn" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTieRea_Internalname,GXutil.ltrim( localUtil.ntoc( A215BarTieRea, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A215BarTieRea, "Z9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarTieRea_Jsonclick,Integer.valueOf(0),"TagColumn","",ROClassString,edtBarTieRea_Columnclass,edtBarTieRea_Columnheaderclass,Integer.valueOf(edtBarTieRea_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(235),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSituacion_Internalname,GXutil.rtrim( AV41Situacion),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSituacion_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavSituacion_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(235),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((cmbBarFasEst.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbBarFasEst.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "BARFASEST_" + sGXsfl_235_idx ;
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
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbBarFasEst,cmbBarFasEst.getInternalname(),GXutil.trim( GXutil.str( A153BarFasEst, 1, 0)),Integer.valueOf(1),cmbBarFasEst.getJsonclick(),Integer.valueOf(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(cmbBarFasEst.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","TagColumn",cmbBarFasEst.getColumnClass(),cmbBarFasEst.getColumnHeaderClass(),"","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbBarFasEst.setValue( GXutil.trim( GXutil.str( A153BarFasEst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbBarFasEst.getInternalname(), "Values", cmbBarFasEst.ToJavascriptSource(), !bGXsfl_235_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarFasKgm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "TagColumn" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A3837BarFasKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A3837BarFasKgm, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFasKgm_Jsonclick,Integer.valueOf(0),"TagColumn","",ROClassString,edtBarFasKgm_Columnclass,edtBarFasKgm_Columnheaderclass,Integer.valueOf(edtBarFasKgm_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(235),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarFasMtr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "TagColumn" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A3838BarFasMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A3838BarFasMtr, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFasMtr_Jsonclick,Integer.valueOf(0),"TagColumn","",ROClassString,edtBarFasMtr_Columnclass,edtBarFasMtr_Columnheaderclass,Integer.valueOf(edtBarFasMtr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(235),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavOpenom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "TagColumn" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavOpenom_Internalname,GXutil.rtrim( AV35OpeNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavOpenom_Jsonclick,Integer.valueOf(0),"TagColumn","",ROClassString,edtavOpenom_Columnclass,edtavOpenom_Columnheaderclass,Integer.valueOf(edtavOpenom_Visible),Integer.valueOf(edtavOpenom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(235),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarFasPri_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasPri_Internalname,GXutil.ltrim( localUtil.ntoc( A3836BarFasPri, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3836BarFasPri), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFasPri_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtBarFasPri_Columnclass,edtBarFasPri_Columnheaderclass,Integer.valueOf(edtBarFasPri_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(235),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes23B2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_235_idx = ((subGrid_Islastpage==1)&&(nGXsfl_235_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_235_idx+1) ;
         sGXsfl_235_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_235_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_2352( ) ;
      }
      /* End function sendrow_2352 */
   }

   public void startgridcontrol235( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"235\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"TagColumn"+"\" "+" style=\""+((edtBarOrdLin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Orden", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"TagColumn"+"\" "+" style=\""+((edtFasCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"TagColumn"+"\" "+" style=\""+((edtFasDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion de Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"TagColumn"+"\" "+" style=\""+((edtMaqCodBis_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"TagColumn"+"\" "+" style=\""+((edtavMaqdsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion ", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"TagColumn"+"\" "+" style=\""+((edtBarFasDTI_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Inicio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"TagColumn"+"\" "+" style=\""+((edtavBarfasdtf_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fin", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"TagColumn"+"\" "+" style=\""+((edtBarTieRea_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "HhMm", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"TagColumn"+"\" "+" style=\""+((cmbBarFasEst.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "E", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"TagColumn"+"\" "+" style=\""+((edtBarFasKgm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unidades", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"TagColumn"+"\" "+" style=\""+((edtBarFasMtr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"TagColumn"+"\" "+" style=\""+((edtavOpenom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Operario", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarFasPri_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "PP", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarOrdLin_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarOrdLin_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarOrdLin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A457FasCod));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtFasCod_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtFasCod_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtFasCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A460FasDsc));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtFasDsc_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtFasDsc_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A150BarFacTin));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A603MaqCodBis));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtMaqCodBis_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtMaqCodBis_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMaqCodBis_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV34MaqDsc));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavMaqdsc_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavMaqdsc_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavMaqdsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A4442BarFasDTI, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarFasDTI_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarFasDTI_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarFasDTI_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV8BarFasDTF));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavBarfasdtf_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavBarfasdtf_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarfasdtf_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavBarfasdtf_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A215BarTieRea, (byte)(5), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarTieRea_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarTieRea_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarTieRea_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV41Situacion));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSituacion_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A153BarFasEst, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbBarFasEst.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbBarFasEst.getColumnHeaderClass()));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbBarFasEst.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3837BarFasKgm, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarFasKgm_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarFasKgm_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarFasKgm_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3838BarFasMtr, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarFasMtr_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarFasMtr_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarFasMtr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV35OpeNom));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavOpenom_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavOpenom_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavOpenom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavOpenom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3836BarFasPri, (byte)(2), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarFasPri_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarFasPri_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarFasPri_Visible, (byte)(5), (byte)(0), ".", "")));
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
      bttBtnpdf_hdr_Internalname = sPrefix+"BTNPDF_HDR" ;
      bttBtnpdf_prodcliente_Internalname = sPrefix+"BTNPDF_PRODCLIENTE" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      edtavDiscod_Internalname = sPrefix+"vDISCOD" ;
      edtavEnccli_Internalname = sPrefix+"vENCCLI" ;
      divUnnamedtable4_Internalname = sPrefix+"UNNAMEDTABLE4" ;
      edtavClicod_Internalname = sPrefix+"vCLICOD" ;
      edtavClinom_Internalname = sPrefix+"vCLINOM" ;
      divTablecliente_Internalname = sPrefix+"TABLECLIENTE" ;
      edtavBarser_Internalname = sPrefix+"vBARSER" ;
      edtavBarserdsc_Internalname = sPrefix+"vBARSERDSC" ;
      edtavTipartdsc_Internalname = sPrefix+"vTIPARTDSC" ;
      divTablearticulo_Internalname = sPrefix+"TABLEARTICULO" ;
      edtavBarcolnom_Internalname = sPrefix+"vBARCOLNOM" ;
      edtavBarcolnum_Internalname = sPrefix+"vBARCOLNUM" ;
      divTablecolor_Internalname = sPrefix+"TABLECOLOR" ;
      edtavBarnomcli_Internalname = sPrefix+"vBARNOMCLI" ;
      edtavBarnumcli_Internalname = sPrefix+"vBARNUMCLI" ;
      divTablecolorcliente_Internalname = sPrefix+"TABLECOLORCLIENTE" ;
      edtavBarkgm_Internalname = sPrefix+"vBARKGM" ;
      edtavBarmtr_Internalname = sPrefix+"vBARMTR" ;
      edtavBarpie_Internalname = sPrefix+"vBARPIE" ;
      edtavBarancaca1_Internalname = sPrefix+"vBARANCACA1" ;
      edtavBargraaca_Internalname = sPrefix+"vBARGRAACA" ;
      divTablepesomedida_Internalname = sPrefix+"TABLEPESOMEDIDA" ;
      divTablecol1_Internalname = sPrefix+"TABLECOL1" ;
      edtavAlbrfen_Internalname = sPrefix+"vALBRFEN" ;
      edtavBarfecgen_Internalname = sPrefix+"vBARFECGEN" ;
      edtavBarfeccli_Internalname = sPrefix+"vBARFECCLI" ;
      edtavForfecapr_Internalname = sPrefix+"vFORFECAPR" ;
      edtavBarfecfpr_Internalname = sPrefix+"vBARFECFPR" ;
      divUnnamedtable3_Internalname = sPrefix+"UNNAMEDTABLE3" ;
      divTablecol2_Internalname = sPrefix+"TABLECOL2" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      edtavBartra1_Internalname = sPrefix+"vBARTRA1" ;
      edtavBartrap1_Internalname = sPrefix+"vBARTRAP1" ;
      edtavBartra2_Internalname = sPrefix+"vBARTRA2" ;
      edtavBartrap2_Internalname = sPrefix+"vBARTRAP2" ;
      edtavBartra3_Internalname = sPrefix+"vBARTRA3" ;
      edtavBartrap3_Internalname = sPrefix+"vBARTRAP3" ;
      divTablecompuesto1_Internalname = sPrefix+"TABLECOMPUESTO1" ;
      edtavBarurd1_Internalname = sPrefix+"vBARURD1" ;
      edtavBarurdp1_Internalname = sPrefix+"vBARURDP1" ;
      edtavBarurd2_Internalname = sPrefix+"vBARURD2" ;
      edtavBarurdp2_Internalname = sPrefix+"vBARURDP2" ;
      edtavBarurd3_Internalname = sPrefix+"vBARURD3" ;
      edtavBarurdp3_Internalname = sPrefix+"vBARURDP3" ;
      divTablecompuesto2_Internalname = sPrefix+"TABLECOMPUESTO2" ;
      divTablecompuestos_Internalname = sPrefix+"TABLECOMPUESTOS" ;
      divTableheadertop_Internalname = sPrefix+"TABLEHEADERTOP" ;
      Dvpanel_tableheadertop_Internalname = sPrefix+"DVPANEL_TABLEHEADERTOP" ;
      bttBtnexport_Internalname = sPrefix+"BTNEXPORT" ;
      bttBtnexportcsv_Internalname = sPrefix+"BTNEXPORTCSV" ;
      bttBtnexportreport_Internalname = sPrefix+"BTNEXPORTREPORT" ;
      bttBtnpdf_win_Internalname = sPrefix+"BTNPDF_WIN" ;
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtBarOrdLin_Internalname = sPrefix+"BARORDLIN" ;
      edtFasCod_Internalname = sPrefix+"FASCOD" ;
      edtFasDsc_Internalname = sPrefix+"FASDSC" ;
      edtBarFacTin_Internalname = sPrefix+"BARFACTIN" ;
      edtMaqCodBis_Internalname = sPrefix+"MAQCODBIS" ;
      edtavMaqdsc_Internalname = sPrefix+"vMAQDSC" ;
      edtBarFasDTI_Internalname = sPrefix+"BARFASDTI" ;
      edtavBarfasdtf_Internalname = sPrefix+"vBARFASDTF" ;
      edtBarTieRea_Internalname = sPrefix+"BARTIEREA" ;
      edtavSituacion_Internalname = sPrefix+"vSITUACION" ;
      cmbBarFasEst.setInternalname( sPrefix+"BARFASEST" );
      edtBarFasKgm_Internalname = sPrefix+"BARFASKGM" ;
      edtBarFasMtr_Internalname = sPrefix+"BARFASMTR" ;
      edtavOpenom_Internalname = sPrefix+"vOPENOM" ;
      edtBarFasPri_Internalname = sPrefix+"BARFASPRI" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      Datamonjs_Internalname = sPrefix+"DATAMONJS" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      edtEmprCod_Internalname = sPrefix+"EMPRCOD" ;
      edtBarCod_Internalname = sPrefix+"BARCOD" ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO" ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR" ;
      Innewwindow1_Internalname = sPrefix+"INNEWWINDOW1" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      edtavDdo_barfasdtiauxdate_Internalname = sPrefix+"vDDO_BARFASDTIAUXDATE" ;
      divDdo_barfasdtiauxdates_Internalname = sPrefix+"DDO_BARFASDTIAUXDATES" ;
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
      edtBarFasPri_Jsonclick = "" ;
      edtBarFasPri_Columnclass = "WWColumn hidden-xs" ;
      edtavOpenom_Jsonclick = "" ;
      edtavOpenom_Columnclass = "WWColumn" ;
      edtavOpenom_Enabled = 0 ;
      edtBarFasMtr_Jsonclick = "" ;
      edtBarFasMtr_Columnclass = "WWColumn" ;
      edtBarFasKgm_Jsonclick = "" ;
      edtBarFasKgm_Columnclass = "WWColumn" ;
      cmbBarFasEst.setJsonclick( "" );
      cmbBarFasEst.setColumnClass( "WWColumn hidden-xs" );
      edtavSituacion_Jsonclick = "" ;
      edtavSituacion_Enabled = 0 ;
      edtBarTieRea_Jsonclick = "" ;
      edtBarTieRea_Columnclass = "WWColumn hidden-xs" ;
      edtavBarfasdtf_Jsonclick = "" ;
      edtavBarfasdtf_Columnclass = "WWColumn" ;
      edtavBarfasdtf_Enabled = 0 ;
      edtBarFasDTI_Jsonclick = "" ;
      edtBarFasDTI_Columnclass = "WWColumn" ;
      edtavMaqdsc_Jsonclick = "" ;
      edtavMaqdsc_Columnclass = "WWColumn" ;
      edtavMaqdsc_Enabled = 0 ;
      edtMaqCodBis_Jsonclick = "" ;
      edtMaqCodBis_Columnclass = "WWColumn hidden-xs" ;
      edtBarFacTin_Jsonclick = "" ;
      edtFasDsc_Jsonclick = "" ;
      edtFasDsc_Columnclass = "WWColumn" ;
      edtFasCod_Jsonclick = "" ;
      edtFasCod_Columnclass = "WWColumn hidden-xs" ;
      edtBarOrdLin_Jsonclick = "" ;
      edtBarOrdLin_Columnclass = "WWColumn hidden-xs" ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtBarFasPri_Columnheaderclass = "" ;
      edtavOpenom_Columnheaderclass = "" ;
      edtBarFasMtr_Columnheaderclass = "" ;
      edtBarFasKgm_Columnheaderclass = "" ;
      cmbBarFasEst.setColumnHeaderClass( "" );
      edtBarTieRea_Columnheaderclass = "" ;
      edtavBarfasdtf_Columnheaderclass = "" ;
      edtBarFasDTI_Columnheaderclass = "" ;
      edtavMaqdsc_Columnheaderclass = "" ;
      edtMaqCodBis_Columnheaderclass = "" ;
      edtFasDsc_Columnheaderclass = "" ;
      edtFasCod_Columnheaderclass = "" ;
      edtBarOrdLin_Columnheaderclass = "" ;
      edtBarFasPri_Visible = -1 ;
      edtavOpenom_Visible = -1 ;
      edtBarFasMtr_Visible = -1 ;
      edtBarFasKgm_Visible = -1 ;
      cmbBarFasEst.setVisible( -1 );
      edtBarTieRea_Visible = -1 ;
      edtavBarfasdtf_Visible = -1 ;
      edtBarFasDTI_Visible = -1 ;
      edtavMaqdsc_Visible = -1 ;
      edtMaqCodBis_Visible = -1 ;
      edtFasDsc_Visible = -1 ;
      edtFasCod_Visible = -1 ;
      edtBarOrdLin_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_barfasdtiauxdate_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Visible = 1 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Visible = 1 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Visible = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtnpdf_win_Visible = 1 ;
      edtavBarurdp3_Jsonclick = "" ;
      edtavBarurdp3_Enabled = 1 ;
      edtavBarurd3_Jsonclick = "" ;
      edtavBarurd3_Enabled = 1 ;
      edtavBarurdp2_Jsonclick = "" ;
      edtavBarurdp2_Enabled = 1 ;
      edtavBarurd2_Jsonclick = "" ;
      edtavBarurd2_Enabled = 1 ;
      edtavBarurdp1_Jsonclick = "" ;
      edtavBarurdp1_Enabled = 1 ;
      edtavBarurd1_Jsonclick = "" ;
      edtavBarurd1_Enabled = 1 ;
      edtavBartrap3_Jsonclick = "" ;
      edtavBartrap3_Enabled = 1 ;
      edtavBartra3_Jsonclick = "" ;
      edtavBartra3_Enabled = 1 ;
      edtavBartrap2_Jsonclick = "" ;
      edtavBartrap2_Enabled = 1 ;
      edtavBartra2_Jsonclick = "" ;
      edtavBartra2_Enabled = 1 ;
      edtavBartrap1_Jsonclick = "" ;
      edtavBartrap1_Enabled = 1 ;
      edtavBartra1_Jsonclick = "" ;
      edtavBartra1_Enabled = 1 ;
      edtavBarfecfpr_Jsonclick = "" ;
      edtavBarfecfpr_Enabled = 1 ;
      edtavForfecapr_Jsonclick = "" ;
      edtavForfecapr_Enabled = 1 ;
      edtavBarfeccli_Jsonclick = "" ;
      edtavBarfeccli_Enabled = 1 ;
      edtavBarfecgen_Jsonclick = "" ;
      edtavBarfecgen_Enabled = 1 ;
      edtavAlbrfen_Jsonclick = "" ;
      edtavAlbrfen_Enabled = 1 ;
      edtavBargraaca_Jsonclick = "" ;
      edtavBargraaca_Enabled = 1 ;
      edtavBarancaca1_Jsonclick = "" ;
      edtavBarancaca1_Enabled = 1 ;
      edtavBarpie_Jsonclick = "" ;
      edtavBarpie_Enabled = 1 ;
      edtavBarmtr_Jsonclick = "" ;
      edtavBarmtr_Enabled = 1 ;
      edtavBarkgm_Jsonclick = "" ;
      edtavBarkgm_Enabled = 1 ;
      edtavBarnumcli_Jsonclick = "" ;
      edtavBarnumcli_Enabled = 1 ;
      edtavBarnomcli_Jsonclick = "" ;
      edtavBarnomcli_Enabled = 1 ;
      edtavBarcolnum_Jsonclick = "" ;
      edtavBarcolnum_Enabled = 1 ;
      edtavBarcolnom_Jsonclick = "" ;
      edtavBarcolnom_Enabled = 1 ;
      edtavTipartdsc_Jsonclick = "" ;
      edtavTipartdsc_Enabled = 1 ;
      edtavBarserdsc_Jsonclick = "" ;
      edtavBarserdsc_Enabled = 1 ;
      edtavBarser_Jsonclick = "" ;
      edtavBarser_Enabled = 1 ;
      edtavClinom_Jsonclick = "" ;
      edtavClinom_Enabled = 1 ;
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Enabled = 1 ;
      edtavEnccli_Jsonclick = "" ;
      edtavEnccli_Enabled = 1 ;
      edtavDiscod_Jsonclick = "" ;
      edtavDiscod_Enabled = 1 ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Innewwindow1_Target = "" ;
      Innewwindow1_Height = "50" ;
      Innewwindow1_Width = "50" ;
      Ddo_grid_Datalistproc = "ConsultadeProduccion_FasesFullGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "||||||||0:Pendiente,1:En Proceso,2:Finalizada||||" ;
      Ddo_grid_Allowmultipleselection = "||||||||T||||" ;
      Ddo_grid_Datalisttype = "|Dynamic|Dynamic|Dynamic|||||FixedValues||||" ;
      Ddo_grid_Includedatalist = "|T|T|T|||||T||||" ;
      Ddo_grid_Filterisrange = "T|||||||T||T|T||T" ;
      Ddo_grid_Filtertype = "Numeric|Character|Character|Character||Date||Numeric||Numeric|Numeric||Numeric" ;
      Ddo_grid_Includefilter = "T|T|T|T||T||T||T|T||T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T|T|T||T||T|T|T|T||T" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4||5||6|7|8|9||10" ;
      Ddo_grid_Columnids = "0:BarOrdLin|1:FasCod|2:FasDsc|4:MaqCodBis|5:MaqDsc|6:BarFasDTI|7:BarFasDTF|8:BarTieRea|10:BarFasEst|11:BarFasKgm|12:BarFasMtr|13:OpeNom|14:BarFasPri" ;
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
      Dvpanel_tableheadertop_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableheadertop_Iconposition = "Right" ;
      Dvpanel_tableheadertop_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableheadertop_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tableheadertop_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tableheadertop_Title = httpContext.getMessage( "Información General", "") ;
      Dvpanel_tableheadertop_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tableheadertop_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableheadertop_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableheadertop_Width = "100%" ;
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
      GXCCtl = "BARFASEST_" + sGXsfl_235_idx ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A2689ExHdrFas',fld:'EXHDRFAS',pic:''},{av:'A2697ExHdrFeE',fld:'EXHDRFEE',pic:''},{av:'A2700ExHdrFeR',fld:'EXHDRFER',pic:''},{av:'AV119Consultadeproduccion_fasesfullds_1_emprcod',fld:'vCONSULTADEPRODUCCION_FASESFULLDS_1_EMPRCOD',pic:'@!'},{av:'AV120Consultadeproduccion_fasesfullds_2_barcod',fld:'vCONSULTADEPRODUCCION_FASESFULLDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV121Consultadeproduccion_fasesfullds_3_barcodreo',fld:'vCONSULTADEPRODUCCION_FASESFULLDS_3_BARCODREO',pic:'9'},{av:'AV122Consultadeproduccion_fasesfullds_4_barcodpar',fld:'vCONSULTADEPRODUCCION_FASESFULLDS_4_BARCODPAR',pic:''},{av:'sPrefix'},{av:'AV9ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV6BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV56TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV57TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV60TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV61TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV62TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV63TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV64TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV65TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'AV46TFBarFasDTI',fld:'vTFBARFASDTI',pic:'99/99/99 99:99:99'},{av:'AV58TFBarTieRea',fld:'vTFBARTIEREA',pic:'Z9.99'},{av:'AV59TFBarTieRea_To',fld:'vTFBARTIEREA_TO',pic:'Z9.99'},{av:'AV48TFBarFasEst_Sels',fld:'vTFBARFASEST_SELS',pic:''},{av:'AV50TFBarFasKgm',fld:'vTFBARFASKGM',pic:'ZZZZZ9.99'},{av:'AV51TFBarFasKgm_To',fld:'vTFBARFASKGM_TO',pic:'ZZZZZ9.99'},{av:'AV52TFBarFasMtr',fld:'vTFBARFASMTR',pic:'ZZZZZ9.99'},{av:'AV53TFBarFasMtr_To',fld:'vTFBARFASMTR_TO',pic:'ZZZZZ9.99'},{av:'AV54TFBarFasPri',fld:'vTFBARFASPRI',pic:'Z9'},{av:'AV55TFBarFasPri_To',fld:'vTFBARFASPRI_TO',pic:'Z9'},{av:'AV118Pgmname',fld:'vPGMNAME',pic:''},{av:'AV36OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV38OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV22FasCod',fld:'vFASCOD',pic:'@!',hsh:true},{av:'AV93Dorado',fld:'vDORADO',pic:'9',hsh:true},{av:'AV94Moda21',fld:'vMODA21',pic:'9',hsh:true},{av:'AV72CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV74BarSer',fld:'vBARSER',pic:''},{av:'AV82BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV83BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV98AlbRFen',fld:'vALBRFEN',pic:''},{av:'AV99ForFecApr',fld:'vFORFECAPR',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV9ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtBarOrdLin_Visible',ctrl:'BARORDLIN',prop:'Visible'},{av:'edtFasCod_Visible',ctrl:'FASCOD',prop:'Visible'},{av:'edtFasDsc_Visible',ctrl:'FASDSC',prop:'Visible'},{av:'edtMaqCodBis_Visible',ctrl:'MAQCODBIS',prop:'Visible'},{av:'edtavMaqdsc_Visible',ctrl:'vMAQDSC',prop:'Visible'},{av:'edtBarFasDTI_Visible',ctrl:'BARFASDTI',prop:'Visible'},{av:'edtavBarfasdtf_Visible',ctrl:'vBARFASDTF',prop:'Visible'},{av:'edtBarTieRea_Visible',ctrl:'BARTIEREA',prop:'Visible'},{av:'cmbBarFasEst'},{av:'edtBarFasKgm_Visible',ctrl:'BARFASKGM',prop:'Visible'},{av:'edtBarFasMtr_Visible',ctrl:'BARFASMTR',prop:'Visible'},{av:'edtavOpenom_Visible',ctrl:'vOPENOM',prop:'Visible'},{av:'edtBarFasPri_Visible',ctrl:'BARFASPRI',prop:'Visible'},{av:'AV24GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV25GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtBarOrdLin_Columnheaderclass',ctrl:'BARORDLIN',prop:'Columnheaderclass'},{av:'edtFasCod_Columnheaderclass',ctrl:'FASCOD',prop:'Columnheaderclass'},{av:'edtFasDsc_Columnheaderclass',ctrl:'FASDSC',prop:'Columnheaderclass'},{av:'edtMaqCodBis_Columnheaderclass',ctrl:'MAQCODBIS',prop:'Columnheaderclass'},{av:'edtavMaqdsc_Columnheaderclass',ctrl:'vMAQDSC',prop:'Columnheaderclass'},{av:'edtBarFasDTI_Columnheaderclass',ctrl:'BARFASDTI',prop:'Columnheaderclass'},{av:'edtavBarfasdtf_Columnheaderclass',ctrl:'vBARFASDTF',prop:'Columnheaderclass'},{av:'edtBarTieRea_Columnheaderclass',ctrl:'BARTIEREA',prop:'Columnheaderclass'},{av:'edtBarFasKgm_Columnheaderclass',ctrl:'BARFASKGM',prop:'Columnheaderclass'},{av:'edtBarFasMtr_Columnheaderclass',ctrl:'BARFASMTR',prop:'Columnheaderclass'},{av:'edtavOpenom_Columnheaderclass',ctrl:'vOPENOM',prop:'Columnheaderclass'},{av:'edtBarFasPri_Columnheaderclass',ctrl:'BARFASPRI',prop:'Columnheaderclass'},{ctrl:'BTNPDF_WIN',prop:'Visible'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1223B2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV6BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV9ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV56TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV57TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV60TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV61TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV62TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV63TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV64TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV65TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'AV46TFBarFasDTI',fld:'vTFBARFASDTI',pic:'99/99/99 99:99:99'},{av:'AV58TFBarTieRea',fld:'vTFBARTIEREA',pic:'Z9.99'},{av:'AV59TFBarTieRea_To',fld:'vTFBARTIEREA_TO',pic:'Z9.99'},{av:'AV48TFBarFasEst_Sels',fld:'vTFBARFASEST_SELS',pic:''},{av:'AV50TFBarFasKgm',fld:'vTFBARFASKGM',pic:'ZZZZZ9.99'},{av:'AV51TFBarFasKgm_To',fld:'vTFBARFASKGM_TO',pic:'ZZZZZ9.99'},{av:'AV52TFBarFasMtr',fld:'vTFBARFASMTR',pic:'ZZZZZ9.99'},{av:'AV53TFBarFasMtr_To',fld:'vTFBARFASMTR_TO',pic:'ZZZZZ9.99'},{av:'AV54TFBarFasPri',fld:'vTFBARFASPRI',pic:'Z9'},{av:'AV55TFBarFasPri_To',fld:'vTFBARFASPRI_TO',pic:'Z9'},{av:'AV118Pgmname',fld:'vPGMNAME',pic:''},{av:'AV36OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV38OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A2689ExHdrFas',fld:'EXHDRFAS',pic:''},{av:'AV22FasCod',fld:'vFASCOD',pic:'@!',hsh:true},{av:'A2697ExHdrFeE',fld:'EXHDRFEE',pic:''},{av:'A2700ExHdrFeR',fld:'EXHDRFER',pic:''},{av:'AV119Consultadeproduccion_fasesfullds_1_emprcod',fld:'vCONSULTADEPRODUCCION_FASESFULLDS_1_EMPRCOD',pic:'@!'},{av:'AV120Consultadeproduccion_fasesfullds_2_barcod',fld:'vCONSULTADEPRODUCCION_FASESFULLDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV121Consultadeproduccion_fasesfullds_3_barcodreo',fld:'vCONSULTADEPRODUCCION_FASESFULLDS_3_BARCODREO',pic:'9'},{av:'AV122Consultadeproduccion_fasesfullds_4_barcodpar',fld:'vCONSULTADEPRODUCCION_FASESFULLDS_4_BARCODPAR',pic:''},{av:'AV93Dorado',fld:'vDORADO',pic:'9',hsh:true},{av:'AV94Moda21',fld:'vMODA21',pic:'9',hsh:true},{av:'AV72CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV74BarSer',fld:'vBARSER',pic:''},{av:'AV82BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV83BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV98AlbRFen',fld:'vALBRFEN',pic:''},{av:'AV99ForFecApr',fld:'vFORFECAPR',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1323B2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV6BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV9ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV56TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV57TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV60TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV61TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV62TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV63TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV64TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV65TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'AV46TFBarFasDTI',fld:'vTFBARFASDTI',pic:'99/99/99 99:99:99'},{av:'AV58TFBarTieRea',fld:'vTFBARTIEREA',pic:'Z9.99'},{av:'AV59TFBarTieRea_To',fld:'vTFBARTIEREA_TO',pic:'Z9.99'},{av:'AV48TFBarFasEst_Sels',fld:'vTFBARFASEST_SELS',pic:''},{av:'AV50TFBarFasKgm',fld:'vTFBARFASKGM',pic:'ZZZZZ9.99'},{av:'AV51TFBarFasKgm_To',fld:'vTFBARFASKGM_TO',pic:'ZZZZZ9.99'},{av:'AV52TFBarFasMtr',fld:'vTFBARFASMTR',pic:'ZZZZZ9.99'},{av:'AV53TFBarFasMtr_To',fld:'vTFBARFASMTR_TO',pic:'ZZZZZ9.99'},{av:'AV54TFBarFasPri',fld:'vTFBARFASPRI',pic:'Z9'},{av:'AV55TFBarFasPri_To',fld:'vTFBARFASPRI_TO',pic:'Z9'},{av:'AV118Pgmname',fld:'vPGMNAME',pic:''},{av:'AV36OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV38OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A2689ExHdrFas',fld:'EXHDRFAS',pic:''},{av:'AV22FasCod',fld:'vFASCOD',pic:'@!',hsh:true},{av:'A2697ExHdrFeE',fld:'EXHDRFEE',pic:''},{av:'A2700ExHdrFeR',fld:'EXHDRFER',pic:''},{av:'AV119Consultadeproduccion_fasesfullds_1_emprcod',fld:'vCONSULTADEPRODUCCION_FASESFULLDS_1_EMPRCOD',pic:'@!'},{av:'AV120Consultadeproduccion_fasesfullds_2_barcod',fld:'vCONSULTADEPRODUCCION_FASESFULLDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV121Consultadeproduccion_fasesfullds_3_barcodreo',fld:'vCONSULTADEPRODUCCION_FASESFULLDS_3_BARCODREO',pic:'9'},{av:'AV122Consultadeproduccion_fasesfullds_4_barcodpar',fld:'vCONSULTADEPRODUCCION_FASESFULLDS_4_BARCODPAR',pic:''},{av:'AV93Dorado',fld:'vDORADO',pic:'9',hsh:true},{av:'AV94Moda21',fld:'vMODA21',pic:'9',hsh:true},{av:'AV72CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV74BarSer',fld:'vBARSER',pic:''},{av:'AV82BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV83BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV98AlbRFen',fld:'vALBRFEN',pic:''},{av:'AV99ForFecApr',fld:'vFORFECAPR',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e1423B2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV6BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV9ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV56TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV57TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV60TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV61TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV62TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV63TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV64TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV65TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'AV46TFBarFasDTI',fld:'vTFBARFASDTI',pic:'99/99/99 99:99:99'},{av:'AV58TFBarTieRea',fld:'vTFBARTIEREA',pic:'Z9.99'},{av:'AV59TFBarTieRea_To',fld:'vTFBARTIEREA_TO',pic:'Z9.99'},{av:'AV48TFBarFasEst_Sels',fld:'vTFBARFASEST_SELS',pic:''},{av:'AV50TFBarFasKgm',fld:'vTFBARFASKGM',pic:'ZZZZZ9.99'},{av:'AV51TFBarFasKgm_To',fld:'vTFBARFASKGM_TO',pic:'ZZZZZ9.99'},{av:'AV52TFBarFasMtr',fld:'vTFBARFASMTR',pic:'ZZZZZ9.99'},{av:'AV53TFBarFasMtr_To',fld:'vTFBARFASMTR_TO',pic:'ZZZZZ9.99'},{av:'AV54TFBarFasPri',fld:'vTFBARFASPRI',pic:'Z9'},{av:'AV55TFBarFasPri_To',fld:'vTFBARFASPRI_TO',pic:'Z9'},{av:'AV118Pgmname',fld:'vPGMNAME',pic:''},{av:'AV36OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV38OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A2689ExHdrFas',fld:'EXHDRFAS',pic:''},{av:'AV22FasCod',fld:'vFASCOD',pic:'@!',hsh:true},{av:'A2697ExHdrFeE',fld:'EXHDRFEE',pic:''},{av:'A2700ExHdrFeR',fld:'EXHDRFER',pic:''},{av:'AV119Consultadeproduccion_fasesfullds_1_emprcod',fld:'vCONSULTADEPRODUCCION_FASESFULLDS_1_EMPRCOD',pic:'@!'},{av:'AV120Consultadeproduccion_fasesfullds_2_barcod',fld:'vCONSULTADEPRODUCCION_FASESFULLDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV121Consultadeproduccion_fasesfullds_3_barcodreo',fld:'vCONSULTADEPRODUCCION_FASESFULLDS_3_BARCODREO',pic:'9'},{av:'AV122Consultadeproduccion_fasesfullds_4_barcodpar',fld:'vCONSULTADEPRODUCCION_FASESFULLDS_4_BARCODPAR',pic:''},{av:'AV93Dorado',fld:'vDORADO',pic:'9',hsh:true},{av:'AV94Moda21',fld:'vMODA21',pic:'9',hsh:true},{av:'AV72CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV74BarSer',fld:'vBARSER',pic:''},{av:'AV82BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV83BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV98AlbRFen',fld:'vALBRFEN',pic:''},{av:'AV99ForFecApr',fld:'vFORFECAPR',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV36OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV38OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV54TFBarFasPri',fld:'vTFBARFASPRI',pic:'Z9'},{av:'AV55TFBarFasPri_To',fld:'vTFBARFASPRI_TO',pic:'Z9'},{av:'AV52TFBarFasMtr',fld:'vTFBARFASMTR',pic:'ZZZZZ9.99'},{av:'AV53TFBarFasMtr_To',fld:'vTFBARFASMTR_TO',pic:'ZZZZZ9.99'},{av:'AV50TFBarFasKgm',fld:'vTFBARFASKGM',pic:'ZZZZZ9.99'},{av:'AV51TFBarFasKgm_To',fld:'vTFBARFASKGM_TO',pic:'ZZZZZ9.99'},{av:'AV49TFBarFasEst_SelsJson',fld:'vTFBARFASEST_SELSJSON',pic:''},{av:'AV48TFBarFasEst_Sels',fld:'vTFBARFASEST_SELS',pic:''},{av:'AV58TFBarTieRea',fld:'vTFBARTIEREA',pic:'Z9.99'},{av:'AV59TFBarTieRea_To',fld:'vTFBARTIEREA_TO',pic:'Z9.99'},{av:'AV46TFBarFasDTI',fld:'vTFBARFASDTI',pic:'99/99/99 99:99:99'},{av:'AV64TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV65TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'AV62TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV63TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV60TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV61TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV56TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV57TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e2323B2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A603MaqCodBis',fld:'MAQCODBIS',pic:''},{av:'cmbBarFasEst'},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A3836BarFasPri',fld:'BARFASPRI',pic:'Z9'},{av:'A4442BarFasDTI',fld:'BARFASDTI',pic:'99/99/99 99:99:99'},{av:'A4443BarFasDTF',fld:'BARFASDTF',pic:'99/99/99 99:99:99'},{av:'A2265BarExt',fld:'BAREXT',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2689ExHdrFas',fld:'EXHDRFAS',pic:''},{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV6BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV22FasCod',fld:'vFASCOD',pic:'@!',hsh:true},{av:'A2697ExHdrFeE',fld:'EXHDRFEE',pic:''},{av:'A2700ExHdrFeR',fld:'EXHDRFER',pic:''},{av:'A6173BarFasSec',fld:'BARFASSEC',pic:''},{av:'A148BarEstReo',fld:'BARESTREO',pic:'9'},{av:'A934BarReoCod',fld:'BARREOCOD',pic:'ZZZZZZZ9'},{av:'A936BarReoReo',fld:'BARREOREO',pic:'9'},{av:'A935BarReoPar',fld:'BARREOPAR',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV34MaqDsc',fld:'vMAQDSC',pic:''},{av:'A603MaqCodBis',fld:'MAQCODBIS',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV8BarFasDTF',fld:'vBARFASDTF',pic:''},{av:'AV41Situacion',fld:'vSITUACION',pic:''},{av:'A935BarReoPar',fld:'BARREOPAR',pic:''},{av:'A936BarReoReo',fld:'BARREOREO',pic:'9'},{av:'A934BarReoCod',fld:'BARREOCOD',pic:'ZZZZZZZ9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'AV35OpeNom',fld:'vOPENOM',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'edtBarOrdLin_Columnclass',ctrl:'BARORDLIN',prop:'Columnclass'},{av:'edtFasCod_Columnclass',ctrl:'FASCOD',prop:'Columnclass'},{av:'edtFasDsc_Columnclass',ctrl:'FASDSC',prop:'Columnclass'},{av:'edtMaqCodBis_Columnclass',ctrl:'MAQCODBIS',prop:'Columnclass'},{av:'edtavMaqdsc_Columnclass',ctrl:'vMAQDSC',prop:'Columnclass'},{av:'edtBarFasDTI_Columnclass',ctrl:'BARFASDTI',prop:'Columnclass'},{av:'edtavBarfasdtf_Columnclass',ctrl:'vBARFASDTF',prop:'Columnclass'},{av:'edtBarTieRea_Columnclass',ctrl:'BARTIEREA',prop:'Columnclass'},{av:'cmbBarFasEst'},{av:'edtBarFasKgm_Columnclass',ctrl:'BARFASKGM',prop:'Columnclass'},{av:'edtBarFasMtr_Columnclass',ctrl:'BARFASMTR',prop:'Columnclass'},{av:'edtavOpenom_Columnclass',ctrl:'vOPENOM',prop:'Columnclass'},{av:'edtBarFasPri_Columnclass',ctrl:'BARFASPRI',prop:'Columnclass'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e1523B2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV6BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV9ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV56TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV57TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV60TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV61TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV62TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV63TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV64TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV65TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'AV46TFBarFasDTI',fld:'vTFBARFASDTI',pic:'99/99/99 99:99:99'},{av:'AV58TFBarTieRea',fld:'vTFBARTIEREA',pic:'Z9.99'},{av:'AV59TFBarTieRea_To',fld:'vTFBARTIEREA_TO',pic:'Z9.99'},{av:'AV48TFBarFasEst_Sels',fld:'vTFBARFASEST_SELS',pic:''},{av:'AV50TFBarFasKgm',fld:'vTFBARFASKGM',pic:'ZZZZZ9.99'},{av:'AV51TFBarFasKgm_To',fld:'vTFBARFASKGM_TO',pic:'ZZZZZ9.99'},{av:'AV52TFBarFasMtr',fld:'vTFBARFASMTR',pic:'ZZZZZ9.99'},{av:'AV53TFBarFasMtr_To',fld:'vTFBARFASMTR_TO',pic:'ZZZZZ9.99'},{av:'AV54TFBarFasPri',fld:'vTFBARFASPRI',pic:'Z9'},{av:'AV55TFBarFasPri_To',fld:'vTFBARFASPRI_TO',pic:'Z9'},{av:'AV118Pgmname',fld:'vPGMNAME',pic:''},{av:'AV36OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV38OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A2689ExHdrFas',fld:'EXHDRFAS',pic:''},{av:'AV22FasCod',fld:'vFASCOD',pic:'@!',hsh:true},{av:'A2697ExHdrFeE',fld:'EXHDRFEE',pic:''},{av:'A2700ExHdrFeR',fld:'EXHDRFER',pic:''},{av:'AV119Consultadeproduccion_fasesfullds_1_emprcod',fld:'vCONSULTADEPRODUCCION_FASESFULLDS_1_EMPRCOD',pic:'@!'},{av:'AV120Consultadeproduccion_fasesfullds_2_barcod',fld:'vCONSULTADEPRODUCCION_FASESFULLDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV121Consultadeproduccion_fasesfullds_3_barcodreo',fld:'vCONSULTADEPRODUCCION_FASESFULLDS_3_BARCODREO',pic:'9'},{av:'AV122Consultadeproduccion_fasesfullds_4_barcodpar',fld:'vCONSULTADEPRODUCCION_FASESFULLDS_4_BARCODPAR',pic:''},{av:'AV93Dorado',fld:'vDORADO',pic:'9',hsh:true},{av:'AV94Moda21',fld:'vMODA21',pic:'9',hsh:true},{av:'AV72CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV74BarSer',fld:'vBARSER',pic:''},{av:'AV82BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV83BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV98AlbRFen',fld:'vALBRFEN',pic:''},{av:'AV99ForFecApr',fld:'vFORFECAPR',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV9ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtBarOrdLin_Visible',ctrl:'BARORDLIN',prop:'Visible'},{av:'edtFasCod_Visible',ctrl:'FASCOD',prop:'Visible'},{av:'edtFasDsc_Visible',ctrl:'FASDSC',prop:'Visible'},{av:'edtMaqCodBis_Visible',ctrl:'MAQCODBIS',prop:'Visible'},{av:'edtavMaqdsc_Visible',ctrl:'vMAQDSC',prop:'Visible'},{av:'edtBarFasDTI_Visible',ctrl:'BARFASDTI',prop:'Visible'},{av:'edtavBarfasdtf_Visible',ctrl:'vBARFASDTF',prop:'Visible'},{av:'edtBarTieRea_Visible',ctrl:'BARTIEREA',prop:'Visible'},{av:'cmbBarFasEst'},{av:'edtBarFasKgm_Visible',ctrl:'BARFASKGM',prop:'Visible'},{av:'edtBarFasMtr_Visible',ctrl:'BARFASMTR',prop:'Visible'},{av:'edtavOpenom_Visible',ctrl:'vOPENOM',prop:'Visible'},{av:'edtBarFasPri_Visible',ctrl:'BARFASPRI',prop:'Visible'},{av:'AV24GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV25GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtBarOrdLin_Columnheaderclass',ctrl:'BARORDLIN',prop:'Columnheaderclass'},{av:'edtFasCod_Columnheaderclass',ctrl:'FASCOD',prop:'Columnheaderclass'},{av:'edtFasDsc_Columnheaderclass',ctrl:'FASDSC',prop:'Columnheaderclass'},{av:'edtMaqCodBis_Columnheaderclass',ctrl:'MAQCODBIS',prop:'Columnheaderclass'},{av:'edtavMaqdsc_Columnheaderclass',ctrl:'vMAQDSC',prop:'Columnheaderclass'},{av:'edtBarFasDTI_Columnheaderclass',ctrl:'BARFASDTI',prop:'Columnheaderclass'},{av:'edtavBarfasdtf_Columnheaderclass',ctrl:'vBARFASDTF',prop:'Columnheaderclass'},{av:'edtBarTieRea_Columnheaderclass',ctrl:'BARTIEREA',prop:'Columnheaderclass'},{av:'edtBarFasKgm_Columnheaderclass',ctrl:'BARFASKGM',prop:'Columnheaderclass'},{av:'edtBarFasMtr_Columnheaderclass',ctrl:'BARFASMTR',prop:'Columnheaderclass'},{av:'edtavOpenom_Columnheaderclass',ctrl:'vOPENOM',prop:'Columnheaderclass'},{av:'edtBarFasPri_Columnheaderclass',ctrl:'BARFASPRI',prop:'Columnheaderclass'},{ctrl:'BTNPDF_WIN',prop:'Visible'}]}");
      setEventMetadata("'DOPDF_WIN'","{handler:'e1923B2',iparms:[{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV6BarCodPar',fld:'vBARCODPAR',pic:''}]");
      setEventMetadata("'DOPDF_WIN'",",oparms:[{av:'AV6BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOPDF_HDR'","{handler:'e1623B2',iparms:[{av:'AV93Dorado',fld:'vDORADO',pic:'9',hsh:true},{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV6BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV94Moda21',fld:'vMODA21',pic:'9',hsh:true}]");
      setEventMetadata("'DOPDF_HDR'",",oparms:[{av:'AV6BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOPDF_PRODCLIENTE'","{handler:'e2023B2',iparms:[{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV6BarCodPar',fld:'vBARCODPAR',pic:''}]");
      setEventMetadata("'DOPDF_PRODCLIENTE'",",oparms:[{av:'AV6BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e1723B2',iparms:[{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV6BarCodPar',fld:'vBARCODPAR',pic:''}]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e1123B1',iparms:[]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e1823B2',iparms:[{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV6BarCodPar',fld:'vBARCODPAR',pic:''}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VALIDV_CLICOD","{handler:'validv_Clicod',iparms:[]");
      setEventMetadata("VALIDV_CLICOD",",oparms:[]}");
      setEventMetadata("VALIDV_BARSER","{handler:'validv_Barser',iparms:[]");
      setEventMetadata("VALIDV_BARSER",",oparms:[]}");
      setEventMetadata("VALIDV_BARCOLNOM","{handler:'validv_Barcolnom',iparms:[]");
      setEventMetadata("VALIDV_BARCOLNOM",",oparms:[]}");
      setEventMetadata("VALIDV_BARCOLNUM","{handler:'validv_Barcolnum',iparms:[]");
      setEventMetadata("VALIDV_BARCOLNUM",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[]");
      setEventMetadata("VALID_FASCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Barfaspri',iparms:[]");
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
      wcpOAV17EmprCod = "" ;
      wcpOAV6BarCodPar = "" ;
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
      AV17EmprCod = "" ;
      AV6BarCodPar = "" ;
      AV9ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV60TFFasCod = "" ;
      AV61TFFasCod_Sel = "" ;
      AV62TFFasDsc = "" ;
      AV63TFFasDsc_Sel = "" ;
      AV64TFMaqCodBis = "" ;
      AV65TFMaqCodBis_Sel = "" ;
      AV46TFBarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      AV58TFBarTieRea = DecimalUtil.ZERO ;
      AV59TFBarTieRea_To = DecimalUtil.ZERO ;
      AV48TFBarFasEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV50TFBarFasKgm = DecimalUtil.ZERO ;
      AV51TFBarFasKgm_To = DecimalUtil.ZERO ;
      AV52TFBarFasMtr = DecimalUtil.ZERO ;
      AV53TFBarFasMtr_To = DecimalUtil.ZERO ;
      AV118Pgmname = "" ;
      A2689ExHdrFas = "" ;
      AV22FasCod = "" ;
      A2697ExHdrFeE = GXutil.nullDate() ;
      A2700ExHdrFeR = GXutil.nullDate() ;
      AV119Consultadeproduccion_fasesfullds_1_emprcod = "" ;
      AV122Consultadeproduccion_fasesfullds_4_barcodpar = "" ;
      AV74BarSer = "" ;
      AV82BarColNom = "" ;
      AV98AlbRFen = GXutil.nullDate() ;
      AV99ForFecApr = GXutil.nullDate() ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV16DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      A6173BarFasSec = "" ;
      A935BarReoPar = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_tableheadertop = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnpdf_hdr_Jsonclick = "" ;
      bttBtnpdf_prodcliente_Jsonclick = "" ;
      AV91EncCli = "" ;
      AV73CliNom = "" ;
      AV75BarSerDsc = "" ;
      AV76TipArtDsc = "" ;
      AV88BarNomCli = "" ;
      AV84BarKgm = DecimalUtil.ZERO ;
      AV85BarMtr = DecimalUtil.ZERO ;
      AV108BarFecGen = GXutil.nullDate() ;
      AV81BarFecCli = GXutil.nullDate() ;
      AV109BarFecFpr = GXutil.nullDate() ;
      AV100BarTra1 = "" ;
      AV101BarTra2 = "" ;
      AV102BarTra3 = "" ;
      AV114BarUrd1 = "" ;
      AV110BarUrd2 = "" ;
      AV111BarUrd3 = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtnexportreport_Jsonclick = "" ;
      bttBtnpdf_win_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucInnewwindow1 = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV14DDO_BarFasDTIAuxDate = GXutil.nullDate() ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A150BarFacTin = "" ;
      A603MaqCodBis = "" ;
      AV34MaqDsc = "" ;
      A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      AV8BarFasDTF = "" ;
      A215BarTieRea = DecimalUtil.ZERO ;
      AV41Situacion = "" ;
      A3837BarFasKgm = DecimalUtil.ZERO ;
      A3838BarFasMtr = DecimalUtil.ZERO ;
      AV35OpeNom = "" ;
      AV134Consultadeproduccion_fasesfullds_16_tfbarfasest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      scmdbuf = "" ;
      lV125Consultadeproduccion_fasesfullds_7_tffascod = "" ;
      lV127Consultadeproduccion_fasesfullds_9_tffasdsc = "" ;
      lV129Consultadeproduccion_fasesfullds_11_tfmaqcodbis = "" ;
      AV126Consultadeproduccion_fasesfullds_8_tffascod_sel = "" ;
      AV125Consultadeproduccion_fasesfullds_7_tffascod = "" ;
      AV128Consultadeproduccion_fasesfullds_10_tffasdsc_sel = "" ;
      AV127Consultadeproduccion_fasesfullds_9_tffasdsc = "" ;
      AV130Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel = "" ;
      AV129Consultadeproduccion_fasesfullds_11_tfmaqcodbis = "" ;
      AV131Consultadeproduccion_fasesfullds_13_tfbarfasdti = GXutil.resetTime( GXutil.nullDate() );
      AV132Consultadeproduccion_fasesfullds_14_tfbartierea = DecimalUtil.ZERO ;
      AV133Consultadeproduccion_fasesfullds_15_tfbartierea_to = DecimalUtil.ZERO ;
      AV135Consultadeproduccion_fasesfullds_17_tfbarfaskgm = DecimalUtil.ZERO ;
      AV136Consultadeproduccion_fasesfullds_18_tfbarfaskgm_to = DecimalUtil.ZERO ;
      AV137Consultadeproduccion_fasesfullds_19_tfbarfasmtr = DecimalUtil.ZERO ;
      AV138Consultadeproduccion_fasesfullds_20_tfbarfasmtr_to = DecimalUtil.ZERO ;
      H023B2_A758ProCod = new String[] {""} ;
      H023B2_A396EmprCod = new String[] {""} ;
      H023B2_A129BarCod = new int[1] ;
      H023B2_n129BarCod = new boolean[] {false} ;
      H023B2_A132BarCodReo = new byte[1] ;
      H023B2_n132BarCodReo = new boolean[] {false} ;
      H023B2_A130BarCodPar = new String[] {""} ;
      H023B2_n130BarCodPar = new boolean[] {false} ;
      H023B2_A4443BarFasDTF = new java.util.Date[] {GXutil.nullDate()} ;
      H023B2_n4443BarFasDTF = new boolean[] {false} ;
      H023B2_A2265BarExt = new byte[1] ;
      H023B2_n2265BarExt = new boolean[] {false} ;
      H023B2_A148BarEstReo = new byte[1] ;
      H023B2_A6173BarFasSec = new String[] {""} ;
      H023B2_n6173BarFasSec = new boolean[] {false} ;
      H023B2_A934BarReoCod = new int[1] ;
      H023B2_A936BarReoReo = new byte[1] ;
      H023B2_A935BarReoPar = new String[] {""} ;
      H023B2_A3836BarFasPri = new byte[1] ;
      H023B2_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H023B2_n3838BarFasMtr = new boolean[] {false} ;
      H023B2_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H023B2_n3837BarFasKgm = new boolean[] {false} ;
      H023B2_A153BarFasEst = new byte[1] ;
      H023B2_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H023B2_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      H023B2_n4442BarFasDTI = new boolean[] {false} ;
      H023B2_A603MaqCodBis = new String[] {""} ;
      H023B2_A150BarFacTin = new String[] {""} ;
      H023B2_A460FasDsc = new String[] {""} ;
      H023B2_A457FasCod = new String[] {""} ;
      H023B2_A194BarOrdLin = new short[1] ;
      H023B3_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV77Station = "" ;
      AV79EmprNom = "" ;
      AV78UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      GXv_int8 = new int[1] ;
      GXv_char4 = new String[1] ;
      AV80BarDisNum = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_date11 = new java.util.Date[1] ;
      GXv_char12 = new String[1] ;
      GXv_int13 = new int[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_decimal15 = new java.math.BigDecimal[1] ;
      GXv_int16 = new int[1] ;
      GXv_char17 = new String[1] ;
      GXv_char18 = new String[1] ;
      GXv_char19 = new String[1] ;
      GXv_int20 = new int[1] ;
      AV97BarTipDis = "" ;
      GXv_char21 = new String[1] ;
      GXv_char22 = new String[1] ;
      GXv_char24 = new String[1] ;
      GXv_char25 = new String[1] ;
      GXv_char26 = new String[1] ;
      GXv_int27 = new short[1] ;
      GXv_int28 = new short[1] ;
      GXv_int29 = new short[1] ;
      GXv_int33 = new short[1] ;
      GXv_int34 = new short[1] ;
      GXv_int35 = new short[1] ;
      GXv_int36 = new short[1] ;
      GXv_date38 = new java.util.Date[1] ;
      GXv_date39 = new java.util.Date[1] ;
      AV71WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext40 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV40Session = httpContext.getWebSession();
      AV11ColumnsSelectorXML = "" ;
      AV49TFBarFasEst_SelsJson = "" ;
      H023B4_A2248ManCod = new short[1] ;
      H023B4_A2692ExHdrLin = new int[1] ;
      H023B4_A396EmprCod = new String[] {""} ;
      H023B4_A129BarCod = new int[1] ;
      H023B4_n129BarCod = new boolean[] {false} ;
      H023B4_A132BarCodReo = new byte[1] ;
      H023B4_n132BarCodReo = new boolean[] {false} ;
      H023B4_A130BarCodPar = new String[] {""} ;
      H023B4_n130BarCodPar = new boolean[] {false} ;
      H023B4_A2689ExHdrFas = new String[] {""} ;
      H023B4_A2697ExHdrFeE = new java.util.Date[] {GXutil.nullDate()} ;
      H023B4_n2697ExHdrFeE = new boolean[] {false} ;
      H023B4_A2700ExHdrFeR = new java.util.Date[] {GXutil.nullDate()} ;
      H023B4_n2700ExHdrFeR = new boolean[] {false} ;
      AV20ExHdrFeE = GXutil.nullDate() ;
      AV21ExHdrFeR = GXutil.nullDate() ;
      GXv_int37 = new short[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      GXv_int23 = new int[1] ;
      GXv_int6 = new byte[1] ;
      AV69Var_Hdr = "" ;
      AV70WebSession = httpContext.getWebSession();
      AV19ExcelFilename = "" ;
      AV18ErrorMessage = "" ;
      AV68UserCustomValue = "" ;
      AV10ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector41 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector42 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV26GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV27GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char44 = "" ;
      GXv_char32 = new String[1] ;
      GXt_char43 = "" ;
      GXv_char31 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char30 = new String[1] ;
      GXv_SdtWWPGridState45 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV66TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV28HTTPRequest = httpContext.getHttpRequest();
      AV67TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      H023B5_A44AlbRecCod = new int[1] ;
      H023B5_A130BarCodPar = new String[] {""} ;
      H023B5_n130BarCodPar = new boolean[] {false} ;
      H023B5_A132BarCodReo = new byte[1] ;
      H023B5_n132BarCodReo = new boolean[] {false} ;
      H023B5_A129BarCod = new int[1] ;
      H023B5_n129BarCod = new boolean[] {false} ;
      H023B5_A396EmprCod = new String[] {""} ;
      H023B5_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      H023B5_A200BarPieCod = new String[] {""} ;
      A49AlbRFen = GXutil.nullDate() ;
      A200BarPieCod = "" ;
      H023B6_A831TipColCod = new byte[1] ;
      H023B6_A483ForColNum = new int[1] ;
      H023B6_A482ForColNom = new String[] {""} ;
      H023B6_A494ForSer = new String[] {""} ;
      H023B6_A252CliCod = new int[1] ;
      H023B6_A396EmprCod = new String[] {""} ;
      H023B6_A3558ForFecApr = new java.util.Date[] {GXutil.nullDate()} ;
      H023B6_n3558ForFecApr = new boolean[] {false} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A3558ForFecApr = GXutil.nullDate() ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV17EmprCod = "" ;
      sCtrlAV5BarCod = "" ;
      sCtrlAV7BarCodReo = "" ;
      sCtrlAV6BarCodPar = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.consultadeproduccion_fasesfull__default(),
         new Object[] {
             new Object[] {
            H023B2_A758ProCod, H023B2_A396EmprCod, H023B2_A129BarCod, H023B2_A132BarCodReo, H023B2_A130BarCodPar, H023B2_A4443BarFasDTF, H023B2_n4443BarFasDTF, H023B2_A2265BarExt, H023B2_n2265BarExt, H023B2_A148BarEstReo,
            H023B2_A6173BarFasSec, H023B2_n6173BarFasSec, H023B2_A934BarReoCod, H023B2_A936BarReoReo, H023B2_A935BarReoPar, H023B2_A3836BarFasPri, H023B2_A3838BarFasMtr, H023B2_n3838BarFasMtr, H023B2_A3837BarFasKgm, H023B2_n3837BarFasKgm,
            H023B2_A153BarFasEst, H023B2_A215BarTieRea, H023B2_A4442BarFasDTI, H023B2_n4442BarFasDTI, H023B2_A603MaqCodBis, H023B2_A150BarFacTin, H023B2_A460FasDsc, H023B2_A457FasCod, H023B2_A194BarOrdLin
            }
            , new Object[] {
            H023B3_AGRID_nRecordCount
            }
            , new Object[] {
            H023B4_A2248ManCod, H023B4_A2692ExHdrLin, H023B4_A396EmprCod, H023B4_A129BarCod, H023B4_n129BarCod, H023B4_A132BarCodReo, H023B4_n132BarCodReo, H023B4_A130BarCodPar, H023B4_n130BarCodPar, H023B4_A2689ExHdrFas,
            H023B4_A2697ExHdrFeE, H023B4_n2697ExHdrFeE, H023B4_A2700ExHdrFeR, H023B4_n2700ExHdrFeR
            }
            , new Object[] {
            H023B5_A44AlbRecCod, H023B5_A130BarCodPar, H023B5_A132BarCodReo, H023B5_A129BarCod, H023B5_A396EmprCod, H023B5_A49AlbRFen, H023B5_A200BarPieCod
            }
            , new Object[] {
            H023B6_A831TipColCod, H023B6_A483ForColNum, H023B6_A482ForColNom, H023B6_A494ForSer, H023B6_A252CliCod, H023B6_A396EmprCod, H023B6_A3558ForFecApr, H023B6_n3558ForFecApr
            }
         }
      );
      AV118Pgmname = "ConsultadeProduccion_FasesFull" ;
      /* GeneXus formulas. */
      AV118Pgmname = "ConsultadeProduccion_FasesFull" ;
      Gx_err = (short)(0) ;
      edtavDiscod_Enabled = 0 ;
      edtavEnccli_Enabled = 0 ;
      edtavClicod_Enabled = 0 ;
      edtavClinom_Enabled = 0 ;
      edtavBarser_Enabled = 0 ;
      edtavBarserdsc_Enabled = 0 ;
      edtavTipartdsc_Enabled = 0 ;
      edtavBarcolnom_Enabled = 0 ;
      edtavBarcolnum_Enabled = 0 ;
      edtavBarnomcli_Enabled = 0 ;
      edtavBarnumcli_Enabled = 0 ;
      edtavBarkgm_Enabled = 0 ;
      edtavBarmtr_Enabled = 0 ;
      edtavBarpie_Enabled = 0 ;
      edtavBarancaca1_Enabled = 0 ;
      edtavBargraaca_Enabled = 0 ;
      edtavAlbrfen_Enabled = 0 ;
      edtavBarfecgen_Enabled = 0 ;
      edtavBarfeccli_Enabled = 0 ;
      edtavForfecapr_Enabled = 0 ;
      edtavBarfecfpr_Enabled = 0 ;
      edtavBartra1_Enabled = 0 ;
      edtavBartrap1_Enabled = 0 ;
      edtavBartra2_Enabled = 0 ;
      edtavBartrap2_Enabled = 0 ;
      edtavBartra3_Enabled = 0 ;
      edtavBartrap3_Enabled = 0 ;
      edtavBarurd1_Enabled = 0 ;
      edtavBarurdp1_Enabled = 0 ;
      edtavBarurd2_Enabled = 0 ;
      edtavBarurdp2_Enabled = 0 ;
      edtavBarurd3_Enabled = 0 ;
      edtavBarurdp3_Enabled = 0 ;
      edtavMaqdsc_Enabled = 0 ;
      edtavBarfasdtf_Enabled = 0 ;
      edtavSituacion_Enabled = 0 ;
      edtavOpenom_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV7BarCodReo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV7BarCodReo ;
   private byte AV54TFBarFasPri ;
   private byte AV55TFBarFasPri_To ;
   private byte AV121Consultadeproduccion_fasesfullds_3_barcodreo ;
   private byte AV93Dorado ;
   private byte AV94Moda21 ;
   private byte A132BarCodReo ;
   private byte A2265BarExt ;
   private byte A148BarEstReo ;
   private byte A936BarReoReo ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A153BarFasEst ;
   private byte A3836BarFasPri ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV139Consultadeproduccion_fasesfullds_21_tfbarfaspri ;
   private byte AV140Consultadeproduccion_fasesfullds_22_tfbarfaspri_to ;
   private byte AV92Enc20c ;
   private byte AV96ValCont ;
   private byte AV95Cli350 ;
   private byte GXt_int5 ;
   private byte AV87BarTipCol ;
   private byte AV30Lexmvh ;
   private byte GXv_int6[] ;
   private byte A831TipColCod ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short nRcdExists_6 ;
   private short nIsMod_6 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV56TFBarOrdLin ;
   private short AV57TFBarOrdLin_To ;
   private short AV36OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV106BarAncAca1 ;
   private short AV107BarGraAca ;
   private short AV103BarTraP1 ;
   private short AV104BarTraP2 ;
   private short AV105BarTraP3 ;
   private short AV112BarUrdP1 ;
   private short AV115BarUrdP2 ;
   private short AV113BarUrdP3 ;
   private short A194BarOrdLin ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV123Consultadeproduccion_fasesfullds_5_tfbarordlin ;
   private short AV124Consultadeproduccion_fasesfullds_6_tfbarordlin_to ;
   private short GXv_int27[] ;
   private short GXv_int28[] ;
   private short GXv_int29[] ;
   private short GXv_int33[] ;
   private short GXv_int34[] ;
   private short GXv_int35[] ;
   private short GXv_int36[] ;
   private short GXv_int37[] ;
   private int wcpOAV5BarCod ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_235 ;
   private int AV5BarCod ;
   private int nGXsfl_235_idx=1 ;
   private int AV120Consultadeproduccion_fasesfullds_2_barcod ;
   private int AV72CliCod ;
   private int AV83BarColNum ;
   private int A129BarCod ;
   private int A934BarReoCod ;
   private int Gridpaginationbar_Pagestoshow ;
   private int AV90DisCod ;
   private int edtavDiscod_Enabled ;
   private int edtavEnccli_Enabled ;
   private int edtavClicod_Enabled ;
   private int edtavClinom_Enabled ;
   private int edtavBarser_Enabled ;
   private int edtavBarserdsc_Enabled ;
   private int edtavTipartdsc_Enabled ;
   private int edtavBarcolnom_Enabled ;
   private int edtavBarcolnum_Enabled ;
   private int edtavBarnomcli_Enabled ;
   private int AV89BarNumCli ;
   private int edtavBarnumcli_Enabled ;
   private int edtavBarkgm_Enabled ;
   private int edtavBarmtr_Enabled ;
   private int AV86BarPie ;
   private int edtavBarpie_Enabled ;
   private int edtavBarancaca1_Enabled ;
   private int edtavBargraaca_Enabled ;
   private int edtavAlbrfen_Enabled ;
   private int edtavBarfecgen_Enabled ;
   private int edtavBarfeccli_Enabled ;
   private int edtavForfecapr_Enabled ;
   private int edtavBarfecfpr_Enabled ;
   private int edtavBartra1_Enabled ;
   private int edtavBartrap1_Enabled ;
   private int edtavBartra2_Enabled ;
   private int edtavBartrap2_Enabled ;
   private int edtavBartra3_Enabled ;
   private int edtavBartrap3_Enabled ;
   private int edtavBarurd1_Enabled ;
   private int edtavBarurdp1_Enabled ;
   private int edtavBarurd2_Enabled ;
   private int edtavBarurdp2_Enabled ;
   private int edtavBarurd3_Enabled ;
   private int edtavBarurdp3_Enabled ;
   private int bttBtnpdf_win_Visible ;
   private int edtavPgmname_Enabled ;
   private int edtEmprCod_Visible ;
   private int edtBarCod_Visible ;
   private int edtBarCodReo_Visible ;
   private int edtBarCodPar_Visible ;
   private int subGrid_Islastpage ;
   private int edtavMaqdsc_Enabled ;
   private int edtavBarfasdtf_Enabled ;
   private int edtavSituacion_Enabled ;
   private int edtavOpenom_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV134Consultadeproduccion_fasesfullds_16_tfbarfasest_sels_size ;
   private int GXt_int7 ;
   private int GXv_int8[] ;
   private int GXv_int13[] ;
   private int GXv_int16[] ;
   private int GXv_int20[] ;
   private int edtBarOrdLin_Visible ;
   private int edtFasCod_Visible ;
   private int edtFasDsc_Visible ;
   private int edtMaqCodBis_Visible ;
   private int edtavMaqdsc_Visible ;
   private int edtBarFasDTI_Visible ;
   private int edtavBarfasdtf_Visible ;
   private int edtBarTieRea_Visible ;
   private int edtBarFasKgm_Visible ;
   private int edtBarFasMtr_Visible ;
   private int edtavOpenom_Visible ;
   private int edtBarFasPri_Visible ;
   private int AV39PageToGo ;
   private int GXv_int23[] ;
   private int AV142GXV1 ;
   private int A44AlbRecCod ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV24GridCurrentPage ;
   private long AV25GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV58TFBarTieRea ;
   private java.math.BigDecimal AV59TFBarTieRea_To ;
   private java.math.BigDecimal AV50TFBarFasKgm ;
   private java.math.BigDecimal AV51TFBarFasKgm_To ;
   private java.math.BigDecimal AV52TFBarFasMtr ;
   private java.math.BigDecimal AV53TFBarFasMtr_To ;
   private java.math.BigDecimal AV84BarKgm ;
   private java.math.BigDecimal AV85BarMtr ;
   private java.math.BigDecimal A215BarTieRea ;
   private java.math.BigDecimal A3837BarFasKgm ;
   private java.math.BigDecimal A3838BarFasMtr ;
   private java.math.BigDecimal AV132Consultadeproduccion_fasesfullds_14_tfbartierea ;
   private java.math.BigDecimal AV133Consultadeproduccion_fasesfullds_15_tfbartierea_to ;
   private java.math.BigDecimal AV135Consultadeproduccion_fasesfullds_17_tfbarfaskgm ;
   private java.math.BigDecimal AV136Consultadeproduccion_fasesfullds_18_tfbarfaskgm_to ;
   private java.math.BigDecimal AV137Consultadeproduccion_fasesfullds_19_tfbarfasmtr ;
   private java.math.BigDecimal AV138Consultadeproduccion_fasesfullds_20_tfbarfasmtr_to ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private java.math.BigDecimal GXv_decimal15[] ;
   private String wcpOAV17EmprCod ;
   private String wcpOAV6BarCodPar ;
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
   private String AV17EmprCod ;
   private String AV6BarCodPar ;
   private String sGXsfl_235_idx="0001" ;
   private String AV60TFFasCod ;
   private String AV61TFFasCod_Sel ;
   private String AV62TFFasDsc ;
   private String AV63TFFasDsc_Sel ;
   private String AV64TFMaqCodBis ;
   private String AV65TFMaqCodBis_Sel ;
   private String AV118Pgmname ;
   private String A2689ExHdrFas ;
   private String AV22FasCod ;
   private String AV119Consultadeproduccion_fasesfullds_1_emprcod ;
   private String AV122Consultadeproduccion_fasesfullds_4_barcodpar ;
   private String AV74BarSer ;
   private String AV82BarColNom ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A6173BarFasSec ;
   private String A935BarReoPar ;
   private String Dvpanel_tableheadertop_Width ;
   private String Dvpanel_tableheadertop_Cls ;
   private String Dvpanel_tableheadertop_Title ;
   private String Dvpanel_tableheadertop_Iconposition ;
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
   private String Innewwindow1_Width ;
   private String Innewwindow1_Height ;
   private String Innewwindow1_Target ;
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
   private String Dvpanel_tableheadertop_Internalname ;
   private String divTableheadertop_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtnpdf_hdr_Internalname ;
   private String bttBtnpdf_hdr_Jsonclick ;
   private String bttBtnpdf_prodcliente_Internalname ;
   private String bttBtnpdf_prodcliente_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String divTablecol1_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String edtavDiscod_Internalname ;
   private String edtavDiscod_Jsonclick ;
   private String edtavEnccli_Internalname ;
   private String AV91EncCli ;
   private String edtavEnccli_Jsonclick ;
   private String divTablecliente_Internalname ;
   private String edtavClicod_Internalname ;
   private String edtavClicod_Jsonclick ;
   private String edtavClinom_Internalname ;
   private String AV73CliNom ;
   private String edtavClinom_Jsonclick ;
   private String divTablearticulo_Internalname ;
   private String edtavBarser_Internalname ;
   private String edtavBarser_Jsonclick ;
   private String edtavBarserdsc_Internalname ;
   private String AV75BarSerDsc ;
   private String edtavBarserdsc_Jsonclick ;
   private String edtavTipartdsc_Internalname ;
   private String AV76TipArtDsc ;
   private String edtavTipartdsc_Jsonclick ;
   private String divTablecolor_Internalname ;
   private String edtavBarcolnom_Internalname ;
   private String edtavBarcolnom_Jsonclick ;
   private String edtavBarcolnum_Internalname ;
   private String edtavBarcolnum_Jsonclick ;
   private String divTablecolorcliente_Internalname ;
   private String edtavBarnomcli_Internalname ;
   private String AV88BarNomCli ;
   private String edtavBarnomcli_Jsonclick ;
   private String edtavBarnumcli_Internalname ;
   private String edtavBarnumcli_Jsonclick ;
   private String divTablepesomedida_Internalname ;
   private String edtavBarkgm_Internalname ;
   private String edtavBarkgm_Jsonclick ;
   private String edtavBarmtr_Internalname ;
   private String edtavBarmtr_Jsonclick ;
   private String edtavBarpie_Internalname ;
   private String edtavBarpie_Jsonclick ;
   private String edtavBarancaca1_Internalname ;
   private String edtavBarancaca1_Jsonclick ;
   private String edtavBargraaca_Internalname ;
   private String edtavBargraaca_Jsonclick ;
   private String divTablecol2_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String edtavAlbrfen_Internalname ;
   private String edtavAlbrfen_Jsonclick ;
   private String edtavBarfecgen_Internalname ;
   private String edtavBarfecgen_Jsonclick ;
   private String edtavBarfeccli_Internalname ;
   private String edtavBarfeccli_Jsonclick ;
   private String edtavForfecapr_Internalname ;
   private String edtavForfecapr_Jsonclick ;
   private String edtavBarfecfpr_Internalname ;
   private String edtavBarfecfpr_Jsonclick ;
   private String divTablecompuestos_Internalname ;
   private String divTablecompuesto1_Internalname ;
   private String edtavBartra1_Internalname ;
   private String AV100BarTra1 ;
   private String edtavBartra1_Jsonclick ;
   private String edtavBartrap1_Internalname ;
   private String edtavBartrap1_Jsonclick ;
   private String edtavBartra2_Internalname ;
   private String AV101BarTra2 ;
   private String edtavBartra2_Jsonclick ;
   private String edtavBartrap2_Internalname ;
   private String edtavBartrap2_Jsonclick ;
   private String edtavBartra3_Internalname ;
   private String AV102BarTra3 ;
   private String edtavBartra3_Jsonclick ;
   private String edtavBartrap3_Internalname ;
   private String edtavBartrap3_Jsonclick ;
   private String divTablecompuesto2_Internalname ;
   private String edtavBarurd1_Internalname ;
   private String AV114BarUrd1 ;
   private String edtavBarurd1_Jsonclick ;
   private String edtavBarurdp1_Internalname ;
   private String edtavBarurdp1_Jsonclick ;
   private String edtavBarurd2_Internalname ;
   private String AV110BarUrd2 ;
   private String edtavBarurd2_Jsonclick ;
   private String edtavBarurdp2_Internalname ;
   private String edtavBarurdp2_Jsonclick ;
   private String edtavBarurd3_Internalname ;
   private String AV111BarUrd3 ;
   private String edtavBarurd3_Jsonclick ;
   private String edtavBarurdp3_Internalname ;
   private String edtavBarurdp3_Jsonclick ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableactions_Internalname ;
   private String bttBtnexport_Internalname ;
   private String bttBtnexport_Jsonclick ;
   private String bttBtnexportcsv_Internalname ;
   private String bttBtnexportcsv_Jsonclick ;
   private String bttBtnexportreport_Internalname ;
   private String bttBtnexportreport_Jsonclick ;
   private String bttBtnpdf_win_Internalname ;
   private String bttBtnpdf_win_Jsonclick ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
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
   private String Innewwindow1_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_barfasdtiauxdates_Internalname ;
   private String edtavDdo_barfasdtiauxdate_Internalname ;
   private String edtavDdo_barfasdtiauxdate_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtBarOrdLin_Internalname ;
   private String A457FasCod ;
   private String edtFasCod_Internalname ;
   private String A460FasDsc ;
   private String edtFasDsc_Internalname ;
   private String A150BarFacTin ;
   private String edtBarFacTin_Internalname ;
   private String A603MaqCodBis ;
   private String edtMaqCodBis_Internalname ;
   private String AV34MaqDsc ;
   private String edtavMaqdsc_Internalname ;
   private String edtBarFasDTI_Internalname ;
   private String AV8BarFasDTF ;
   private String edtavBarfasdtf_Internalname ;
   private String edtBarTieRea_Internalname ;
   private String AV41Situacion ;
   private String edtavSituacion_Internalname ;
   private String edtBarFasKgm_Internalname ;
   private String edtBarFasMtr_Internalname ;
   private String AV35OpeNom ;
   private String edtavOpenom_Internalname ;
   private String edtBarFasPri_Internalname ;
   private String scmdbuf ;
   private String lV125Consultadeproduccion_fasesfullds_7_tffascod ;
   private String lV127Consultadeproduccion_fasesfullds_9_tffasdsc ;
   private String lV129Consultadeproduccion_fasesfullds_11_tfmaqcodbis ;
   private String AV126Consultadeproduccion_fasesfullds_8_tffascod_sel ;
   private String AV125Consultadeproduccion_fasesfullds_7_tffascod ;
   private String AV128Consultadeproduccion_fasesfullds_10_tffasdsc_sel ;
   private String AV127Consultadeproduccion_fasesfullds_9_tffasdsc ;
   private String AV130Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel ;
   private String AV129Consultadeproduccion_fasesfullds_11_tfmaqcodbis ;
   private String hsh ;
   private String AV77Station ;
   private String AV79EmprNom ;
   private String AV78UsurCod ;
   private String GXv_char4[] ;
   private String AV80BarDisNum ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char12[] ;
   private String GXv_char17[] ;
   private String GXv_char18[] ;
   private String GXv_char19[] ;
   private String AV97BarTipDis ;
   private String GXv_char21[] ;
   private String GXv_char22[] ;
   private String GXv_char24[] ;
   private String GXv_char25[] ;
   private String GXv_char26[] ;
   private String edtBarOrdLin_Columnheaderclass ;
   private String edtFasCod_Columnheaderclass ;
   private String edtFasDsc_Columnheaderclass ;
   private String edtMaqCodBis_Columnheaderclass ;
   private String edtavMaqdsc_Columnheaderclass ;
   private String edtBarFasDTI_Columnheaderclass ;
   private String edtavBarfasdtf_Columnheaderclass ;
   private String edtBarTieRea_Columnheaderclass ;
   private String edtBarFasKgm_Columnheaderclass ;
   private String edtBarFasMtr_Columnheaderclass ;
   private String edtavOpenom_Columnheaderclass ;
   private String edtBarFasPri_Columnheaderclass ;
   private String edtBarOrdLin_Columnclass ;
   private String edtFasCod_Columnclass ;
   private String edtFasDsc_Columnclass ;
   private String edtMaqCodBis_Columnclass ;
   private String edtavMaqdsc_Columnclass ;
   private String edtBarFasDTI_Columnclass ;
   private String edtavBarfasdtf_Columnclass ;
   private String edtBarTieRea_Columnclass ;
   private String edtBarFasKgm_Columnclass ;
   private String edtBarFasMtr_Columnclass ;
   private String edtavOpenom_Columnclass ;
   private String edtBarFasPri_Columnclass ;
   private String AV69Var_Hdr ;
   private String GXt_char44 ;
   private String GXv_char32[] ;
   private String GXt_char43 ;
   private String GXv_char31[] ;
   private String GXt_char1 ;
   private String GXv_char30[] ;
   private String A200BarPieCod ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String tblTablerightheader_Internalname ;
   private String sCtrlAV17EmprCod ;
   private String sCtrlAV5BarCod ;
   private String sCtrlAV7BarCodReo ;
   private String sCtrlAV6BarCodPar ;
   private String sGXsfl_235_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtBarOrdLin_Jsonclick ;
   private String edtFasCod_Jsonclick ;
   private String edtFasDsc_Jsonclick ;
   private String edtBarFacTin_Jsonclick ;
   private String edtMaqCodBis_Jsonclick ;
   private String edtavMaqdsc_Jsonclick ;
   private String edtBarFasDTI_Jsonclick ;
   private String edtavBarfasdtf_Jsonclick ;
   private String edtBarTieRea_Jsonclick ;
   private String edtavSituacion_Jsonclick ;
   private String GXCCtl ;
   private String edtBarFasKgm_Jsonclick ;
   private String edtBarFasMtr_Jsonclick ;
   private String edtavOpenom_Jsonclick ;
   private String edtBarFasPri_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV46TFBarFasDTI ;
   private java.util.Date A4443BarFasDTF ;
   private java.util.Date A4442BarFasDTI ;
   private java.util.Date AV131Consultadeproduccion_fasesfullds_13_tfbarfasdti ;
   private java.util.Date A2697ExHdrFeE ;
   private java.util.Date A2700ExHdrFeR ;
   private java.util.Date AV98AlbRFen ;
   private java.util.Date AV99ForFecApr ;
   private java.util.Date AV108BarFecGen ;
   private java.util.Date AV81BarFecCli ;
   private java.util.Date AV109BarFecFpr ;
   private java.util.Date AV14DDO_BarFasDTIAuxDate ;
   private java.util.Date GXv_date11[] ;
   private java.util.Date GXv_date38[] ;
   private java.util.Date GXv_date39[] ;
   private java.util.Date AV20ExHdrFeE ;
   private java.util.Date AV21ExHdrFeR ;
   private java.util.Date A49AlbRFen ;
   private java.util.Date A3558ForFecApr ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV38OrderedDsc ;
   private boolean n2697ExHdrFeE ;
   private boolean n2700ExHdrFeR ;
   private boolean n129BarCod ;
   private boolean n132BarCodReo ;
   private boolean n130BarCodPar ;
   private boolean Dvpanel_tableheadertop_Autowidth ;
   private boolean Dvpanel_tableheadertop_Autoheight ;
   private boolean Dvpanel_tableheadertop_Collapsible ;
   private boolean Dvpanel_tableheadertop_Collapsed ;
   private boolean Dvpanel_tableheadertop_Showcollapseicon ;
   private boolean Dvpanel_tableheadertop_Autoscroll ;
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
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n4442BarFasDTI ;
   private boolean n3837BarFasKgm ;
   private boolean n3838BarFasMtr ;
   private boolean bGXsfl_235_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n4443BarFasDTF ;
   private boolean n2265BarExt ;
   private boolean n6173BarFasSec ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean brk23B4 ;
   private boolean n3558ForFecApr ;
   private String AV11ColumnsSelectorXML ;
   private String AV49TFBarFasEst_SelsJson ;
   private String AV68UserCustomValue ;
   private String AV19ExcelFilename ;
   private String AV18ErrorMessage ;
   private GXSimpleCollection<Byte> AV134Consultadeproduccion_fasesfullds_16_tfbarfasest_sels ;
   private GXSimpleCollection<Byte> AV48TFBarFasEst_Sels ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV28HTTPRequest ;
   private com.genexus.webpanels.WebSession AV40Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheadertop ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucInnewwindow1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbBarFasEst ;
   private IDataStoreProvider pr_default ;
   private String[] H023B2_A758ProCod ;
   private String[] H023B2_A396EmprCod ;
   private int[] H023B2_A129BarCod ;
   private boolean[] H023B2_n129BarCod ;
   private byte[] H023B2_A132BarCodReo ;
   private boolean[] H023B2_n132BarCodReo ;
   private String[] H023B2_A130BarCodPar ;
   private boolean[] H023B2_n130BarCodPar ;
   private java.util.Date[] H023B2_A4443BarFasDTF ;
   private boolean[] H023B2_n4443BarFasDTF ;
   private byte[] H023B2_A2265BarExt ;
   private boolean[] H023B2_n2265BarExt ;
   private byte[] H023B2_A148BarEstReo ;
   private String[] H023B2_A6173BarFasSec ;
   private boolean[] H023B2_n6173BarFasSec ;
   private int[] H023B2_A934BarReoCod ;
   private byte[] H023B2_A936BarReoReo ;
   private String[] H023B2_A935BarReoPar ;
   private byte[] H023B2_A3836BarFasPri ;
   private java.math.BigDecimal[] H023B2_A3838BarFasMtr ;
   private boolean[] H023B2_n3838BarFasMtr ;
   private java.math.BigDecimal[] H023B2_A3837BarFasKgm ;
   private boolean[] H023B2_n3837BarFasKgm ;
   private byte[] H023B2_A153BarFasEst ;
   private java.math.BigDecimal[] H023B2_A215BarTieRea ;
   private java.util.Date[] H023B2_A4442BarFasDTI ;
   private boolean[] H023B2_n4442BarFasDTI ;
   private String[] H023B2_A603MaqCodBis ;
   private String[] H023B2_A150BarFacTin ;
   private String[] H023B2_A460FasDsc ;
   private String[] H023B2_A457FasCod ;
   private short[] H023B2_A194BarOrdLin ;
   private long[] H023B3_AGRID_nRecordCount ;
   private short[] H023B4_A2248ManCod ;
   private int[] H023B4_A2692ExHdrLin ;
   private String[] H023B4_A396EmprCod ;
   private int[] H023B4_A129BarCod ;
   private boolean[] H023B4_n129BarCod ;
   private byte[] H023B4_A132BarCodReo ;
   private boolean[] H023B4_n132BarCodReo ;
   private String[] H023B4_A130BarCodPar ;
   private boolean[] H023B4_n130BarCodPar ;
   private String[] H023B4_A2689ExHdrFas ;
   private java.util.Date[] H023B4_A2697ExHdrFeE ;
   private boolean[] H023B4_n2697ExHdrFeE ;
   private java.util.Date[] H023B4_A2700ExHdrFeR ;
   private boolean[] H023B4_n2700ExHdrFeR ;
   private int[] H023B5_A44AlbRecCod ;
   private String[] H023B5_A130BarCodPar ;
   private boolean[] H023B5_n130BarCodPar ;
   private byte[] H023B5_A132BarCodReo ;
   private boolean[] H023B5_n132BarCodReo ;
   private int[] H023B5_A129BarCod ;
   private boolean[] H023B5_n129BarCod ;
   private String[] H023B5_A396EmprCod ;
   private java.util.Date[] H023B5_A49AlbRFen ;
   private String[] H023B5_A200BarPieCod ;
   private byte[] H023B6_A831TipColCod ;
   private int[] H023B6_A483ForColNum ;
   private String[] H023B6_A482ForColNom ;
   private String[] H023B6_A494ForSer ;
   private int[] H023B6_A252CliCod ;
   private String[] H023B6_A396EmprCod ;
   private java.util.Date[] H023B6_A3558ForFecApr ;
   private boolean[] H023B6_n3558ForFecApr ;
   private com.genexus.webpanels.WebSession AV70WebSession ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV9ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV10ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector41[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector42[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV16DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV26GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState45[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV27GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV66TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV67TrnContextAtt ;
   private app.wwpbaseobjects.SdtWWPContext AV71WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext40[] ;
}

final  class consultadeproduccion_fasesfull__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H023B2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A153BarFasEst ,
                                          GXSimpleCollection<Byte> AV134Consultadeproduccion_fasesfullds_16_tfbarfasest_sels ,
                                          short AV123Consultadeproduccion_fasesfullds_5_tfbarordlin ,
                                          short AV124Consultadeproduccion_fasesfullds_6_tfbarordlin_to ,
                                          String AV126Consultadeproduccion_fasesfullds_8_tffascod_sel ,
                                          String AV125Consultadeproduccion_fasesfullds_7_tffascod ,
                                          String AV128Consultadeproduccion_fasesfullds_10_tffasdsc_sel ,
                                          String AV127Consultadeproduccion_fasesfullds_9_tffasdsc ,
                                          String AV130Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel ,
                                          String AV129Consultadeproduccion_fasesfullds_11_tfmaqcodbis ,
                                          java.util.Date AV131Consultadeproduccion_fasesfullds_13_tfbarfasdti ,
                                          java.math.BigDecimal AV132Consultadeproduccion_fasesfullds_14_tfbartierea ,
                                          java.math.BigDecimal AV133Consultadeproduccion_fasesfullds_15_tfbartierea_to ,
                                          int AV134Consultadeproduccion_fasesfullds_16_tfbarfasest_sels_size ,
                                          java.math.BigDecimal AV135Consultadeproduccion_fasesfullds_17_tfbarfaskgm ,
                                          java.math.BigDecimal AV136Consultadeproduccion_fasesfullds_18_tfbarfaskgm_to ,
                                          java.math.BigDecimal AV137Consultadeproduccion_fasesfullds_19_tfbarfasmtr ,
                                          java.math.BigDecimal AV138Consultadeproduccion_fasesfullds_20_tfbarfasmtr_to ,
                                          byte AV139Consultadeproduccion_fasesfullds_21_tfbarfaspri ,
                                          byte AV140Consultadeproduccion_fasesfullds_22_tfbarfaspri_to ,
                                          short A194BarOrdLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A603MaqCodBis ,
                                          java.util.Date A4442BarFasDTI ,
                                          java.math.BigDecimal A215BarTieRea ,
                                          java.math.BigDecimal A3837BarFasKgm ,
                                          java.math.BigDecimal A3838BarFasMtr ,
                                          byte A3836BarFasPri ,
                                          short AV36OrderedBy ,
                                          boolean AV38OrderedDsc ,
                                          String A396EmprCod ,
                                          String AV17EmprCod ,
                                          int A129BarCod ,
                                          int AV5BarCod ,
                                          byte A132BarCodReo ,
                                          byte AV7BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV6BarCodPar ,
                                          String AV119Consultadeproduccion_fasesfullds_1_emprcod ,
                                          int AV120Consultadeproduccion_fasesfullds_2_barcod ,
                                          byte AV121Consultadeproduccion_fasesfullds_3_barcodreo ,
                                          String AV122Consultadeproduccion_fasesfullds_4_barcodpar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int46 = new byte[30];
      Object[] GXv_Object47 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.ProCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFasDTF, T2.BarExt, T2.BarEstReo, T1.BarFasSec, T2.BarReoCod, T2.BarReoReo, T2.BarReoPar, T1.BarFasPri," ;
      sSelectString += " T1.BarFasMtr, T1.BarFasKgm, T1.BarFasEst, T1.BarTieRea, T1.BarFasDTI, T1.MaqCodBis, T1.BarFacTin, T3.FasDsc, T1.FasCod, T1.BarOrdLin" ;
      sFromString = " FROM ((TXPBARFAS T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      sFromString += " INNER JOIN TXPFASPRO T3 ON T3.EmprCod = T1.EmprCod AND T3.FasCod = T1.FasCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      if ( ! (0==AV123Consultadeproduccion_fasesfullds_5_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int46[8] = (byte)(1) ;
      }
      if ( ! (0==AV124Consultadeproduccion_fasesfullds_6_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int46[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV126Consultadeproduccion_fasesfullds_8_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV125Consultadeproduccion_fasesfullds_7_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int46[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Consultadeproduccion_fasesfullds_8_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int46[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV128Consultadeproduccion_fasesfullds_10_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV127Consultadeproduccion_fasesfullds_9_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int46[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV128Consultadeproduccion_fasesfullds_10_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.FasDsc = ?)");
      }
      else
      {
         GXv_int46[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV130Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV129Consultadeproduccion_fasesfullds_11_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int46[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int46[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV131Consultadeproduccion_fasesfullds_13_tfbarfasdti) )
      {
         addWhere(sWhereString, "(T1.BarFasDTI >= ?)");
      }
      else
      {
         GXv_int46[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV132Consultadeproduccion_fasesfullds_14_tfbartierea)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea >= ?)");
      }
      else
      {
         GXv_int46[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV133Consultadeproduccion_fasesfullds_15_tfbartierea_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea <= ?)");
      }
      else
      {
         GXv_int46[18] = (byte)(1) ;
      }
      if ( AV134Consultadeproduccion_fasesfullds_16_tfbarfasest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV134Consultadeproduccion_fasesfullds_16_tfbarfasest_sels, "T1.BarFasEst IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV135Consultadeproduccion_fasesfullds_17_tfbarfaskgm)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm >= ?)");
      }
      else
      {
         GXv_int46[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV136Consultadeproduccion_fasesfullds_18_tfbarfaskgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm <= ?)");
      }
      else
      {
         GXv_int46[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV137Consultadeproduccion_fasesfullds_19_tfbarfasmtr)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr >= ?)");
      }
      else
      {
         GXv_int46[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV138Consultadeproduccion_fasesfullds_20_tfbarfasmtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr <= ?)");
      }
      else
      {
         GXv_int46[22] = (byte)(1) ;
      }
      if ( ! (0==AV139Consultadeproduccion_fasesfullds_21_tfbarfaspri) )
      {
         addWhere(sWhereString, "(T1.BarFasPri >= ?)");
      }
      else
      {
         GXv_int46[23] = (byte)(1) ;
      }
      if ( ! (0==AV140Consultadeproduccion_fasesfullds_22_tfbarfaspri_to) )
      {
         addWhere(sWhereString, "(T1.BarFasPri <= ?)");
      }
      else
      {
         GXv_int46[24] = (byte)(1) ;
      }
      if ( ( AV36OrderedBy == 1 ) && ! AV38OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarOrdLin" ;
      }
      else if ( ( AV36OrderedBy == 1 ) && ( AV38OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarOrdLin DESC" ;
      }
      else if ( ( AV36OrderedBy == 2 ) && ! AV38OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.FasCod" ;
      }
      else if ( ( AV36OrderedBy == 2 ) && ( AV38OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.FasCod DESC" ;
      }
      else if ( ( AV36OrderedBy == 3 ) && ! AV38OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T3.FasDsc" ;
      }
      else if ( ( AV36OrderedBy == 3 ) && ( AV38OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T3.FasDsc DESC" ;
      }
      else if ( ( AV36OrderedBy == 4 ) && ! AV38OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MaqCodBis" ;
      }
      else if ( ( AV36OrderedBy == 4 ) && ( AV38OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.MaqCodBis DESC" ;
      }
      else if ( ( AV36OrderedBy == 5 ) && ! AV38OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFasDTI" ;
      }
      else if ( ( AV36OrderedBy == 5 ) && ( AV38OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarFasDTI DESC" ;
      }
      else if ( ( AV36OrderedBy == 6 ) && ! AV38OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarTieRea" ;
      }
      else if ( ( AV36OrderedBy == 6 ) && ( AV38OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarTieRea DESC" ;
      }
      else if ( ( AV36OrderedBy == 7 ) && ! AV38OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFasEst" ;
      }
      else if ( ( AV36OrderedBy == 7 ) && ( AV38OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarFasEst DESC" ;
      }
      else if ( ( AV36OrderedBy == 8 ) && ! AV38OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFasKgm" ;
      }
      else if ( ( AV36OrderedBy == 8 ) && ( AV38OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarFasKgm DESC" ;
      }
      else if ( ( AV36OrderedBy == 9 ) && ! AV38OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFasMtr" ;
      }
      else if ( ( AV36OrderedBy == 9 ) && ( AV38OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarFasMtr DESC" ;
      }
      else if ( ( AV36OrderedBy == 10 ) && ! AV38OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFasPri" ;
      }
      else if ( ( AV36OrderedBy == 10 ) && ( AV38OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarFasPri DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object47[0] = scmdbuf ;
      GXv_Object47[1] = GXv_int46 ;
      return GXv_Object47 ;
   }

   protected Object[] conditional_H023B3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A153BarFasEst ,
                                          GXSimpleCollection<Byte> AV134Consultadeproduccion_fasesfullds_16_tfbarfasest_sels ,
                                          short AV123Consultadeproduccion_fasesfullds_5_tfbarordlin ,
                                          short AV124Consultadeproduccion_fasesfullds_6_tfbarordlin_to ,
                                          String AV126Consultadeproduccion_fasesfullds_8_tffascod_sel ,
                                          String AV125Consultadeproduccion_fasesfullds_7_tffascod ,
                                          String AV128Consultadeproduccion_fasesfullds_10_tffasdsc_sel ,
                                          String AV127Consultadeproduccion_fasesfullds_9_tffasdsc ,
                                          String AV130Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel ,
                                          String AV129Consultadeproduccion_fasesfullds_11_tfmaqcodbis ,
                                          java.util.Date AV131Consultadeproduccion_fasesfullds_13_tfbarfasdti ,
                                          java.math.BigDecimal AV132Consultadeproduccion_fasesfullds_14_tfbartierea ,
                                          java.math.BigDecimal AV133Consultadeproduccion_fasesfullds_15_tfbartierea_to ,
                                          int AV134Consultadeproduccion_fasesfullds_16_tfbarfasest_sels_size ,
                                          java.math.BigDecimal AV135Consultadeproduccion_fasesfullds_17_tfbarfaskgm ,
                                          java.math.BigDecimal AV136Consultadeproduccion_fasesfullds_18_tfbarfaskgm_to ,
                                          java.math.BigDecimal AV137Consultadeproduccion_fasesfullds_19_tfbarfasmtr ,
                                          java.math.BigDecimal AV138Consultadeproduccion_fasesfullds_20_tfbarfasmtr_to ,
                                          byte AV139Consultadeproduccion_fasesfullds_21_tfbarfaspri ,
                                          byte AV140Consultadeproduccion_fasesfullds_22_tfbarfaspri_to ,
                                          short A194BarOrdLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A603MaqCodBis ,
                                          java.util.Date A4442BarFasDTI ,
                                          java.math.BigDecimal A215BarTieRea ,
                                          java.math.BigDecimal A3837BarFasKgm ,
                                          java.math.BigDecimal A3838BarFasMtr ,
                                          byte A3836BarFasPri ,
                                          short AV36OrderedBy ,
                                          boolean AV38OrderedDsc ,
                                          String A396EmprCod ,
                                          String AV17EmprCod ,
                                          int A129BarCod ,
                                          int AV5BarCod ,
                                          byte A132BarCodReo ,
                                          byte AV7BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV6BarCodPar ,
                                          String AV119Consultadeproduccion_fasesfullds_1_emprcod ,
                                          int AV120Consultadeproduccion_fasesfullds_2_barcod ,
                                          byte AV121Consultadeproduccion_fasesfullds_3_barcodreo ,
                                          String AV122Consultadeproduccion_fasesfullds_4_barcodpar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int49 = new byte[25];
      Object[] GXv_Object50 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM ((TXPBARFAS T1 INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar) INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      if ( ! (0==AV123Consultadeproduccion_fasesfullds_5_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int49[8] = (byte)(1) ;
      }
      if ( ! (0==AV124Consultadeproduccion_fasesfullds_6_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int49[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV126Consultadeproduccion_fasesfullds_8_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV125Consultadeproduccion_fasesfullds_7_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int49[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Consultadeproduccion_fasesfullds_8_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int49[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV128Consultadeproduccion_fasesfullds_10_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV127Consultadeproduccion_fasesfullds_9_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int49[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV128Consultadeproduccion_fasesfullds_10_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int49[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV130Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV129Consultadeproduccion_fasesfullds_11_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int49[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int49[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV131Consultadeproduccion_fasesfullds_13_tfbarfasdti) )
      {
         addWhere(sWhereString, "(T1.BarFasDTI >= ?)");
      }
      else
      {
         GXv_int49[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV132Consultadeproduccion_fasesfullds_14_tfbartierea)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea >= ?)");
      }
      else
      {
         GXv_int49[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV133Consultadeproduccion_fasesfullds_15_tfbartierea_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea <= ?)");
      }
      else
      {
         GXv_int49[18] = (byte)(1) ;
      }
      if ( AV134Consultadeproduccion_fasesfullds_16_tfbarfasest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV134Consultadeproduccion_fasesfullds_16_tfbarfasest_sels, "T1.BarFasEst IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV135Consultadeproduccion_fasesfullds_17_tfbarfaskgm)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm >= ?)");
      }
      else
      {
         GXv_int49[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV136Consultadeproduccion_fasesfullds_18_tfbarfaskgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm <= ?)");
      }
      else
      {
         GXv_int49[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV137Consultadeproduccion_fasesfullds_19_tfbarfasmtr)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr >= ?)");
      }
      else
      {
         GXv_int49[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV138Consultadeproduccion_fasesfullds_20_tfbarfasmtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr <= ?)");
      }
      else
      {
         GXv_int49[22] = (byte)(1) ;
      }
      if ( ! (0==AV139Consultadeproduccion_fasesfullds_21_tfbarfaspri) )
      {
         addWhere(sWhereString, "(T1.BarFasPri >= ?)");
      }
      else
      {
         GXv_int49[23] = (byte)(1) ;
      }
      if ( ! (0==AV140Consultadeproduccion_fasesfullds_22_tfbarfaspri_to) )
      {
         addWhere(sWhereString, "(T1.BarFasPri <= ?)");
      }
      else
      {
         GXv_int49[24] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV36OrderedBy == 1 ) && ! AV38OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV36OrderedBy == 1 ) && ( AV38OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV36OrderedBy == 2 ) && ! AV38OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV36OrderedBy == 2 ) && ( AV38OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV36OrderedBy == 3 ) && ! AV38OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV36OrderedBy == 3 ) && ( AV38OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV36OrderedBy == 4 ) && ! AV38OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV36OrderedBy == 4 ) && ( AV38OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV36OrderedBy == 5 ) && ! AV38OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV36OrderedBy == 5 ) && ( AV38OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV36OrderedBy == 6 ) && ! AV38OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV36OrderedBy == 6 ) && ( AV38OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV36OrderedBy == 7 ) && ! AV38OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV36OrderedBy == 7 ) && ( AV38OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV36OrderedBy == 8 ) && ! AV38OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV36OrderedBy == 8 ) && ( AV38OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV36OrderedBy == 9 ) && ! AV38OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV36OrderedBy == 9 ) && ( AV38OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV36OrderedBy == 10 ) && ! AV38OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV36OrderedBy == 10 ) && ( AV38OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object50[0] = scmdbuf ;
      GXv_Object50[1] = GXv_int49 ;
      return GXv_Object50 ;
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
                  return conditional_H023B2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).shortValue() , ((Boolean) dynConstraints[30]).booleanValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).byteValue() , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] );
            case 1 :
                  return conditional_H023B3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).shortValue() , ((Boolean) dynConstraints[30]).booleanValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).byteValue() , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H023B2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H023B3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H023B4", "SELECT ManCod, ExHdrLin, EmprCod, BarCod, BarCodReo, BarCodPar, ExHdrFas, ExHdrFeE, ExHdrFeR FROM TXPLEXMVH WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ExHdrFas = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ExHdrFas ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H023B5", "SELECT T1.AlbRecCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T2.AlbRFen, T1.BarPieCod FROM (TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE (T1.BarCod = ?) AND (T1.BarCodReo = ?) AND (T1.BarCodPar = ?) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H023B6", "SELECT TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod, ForFecApr FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(10);
               ((byte[]) buf[13])[0] = rslt.getByte(11);
               ((String[]) buf[14])[0] = rslt.getString(12, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(13);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((byte[]) buf[20])[0] = rslt.getByte(16);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(17,2);
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDateTime(18);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(19, 6);
               ((String[]) buf[25])[0] = rslt.getString(20, 1);
               ((String[]) buf[26])[0] = rslt.getString(21, 28);
               ((String[]) buf[27])[0] = rslt.getString(22, 8);
               ((short[]) buf[28])[0] = rslt.getShort(23);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 8);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 9);
               return;
            case 4 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[30], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[32]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[38]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[39]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 28);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 28);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[46], false);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[27]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 28);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 28);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[41], false);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 3 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
      }
   }

}

