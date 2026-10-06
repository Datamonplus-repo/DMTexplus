package app.documentotransporteproduccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class documentodetransporteproduccion_4_wc_impl extends GXWebComponent
{
   public documentodetransporteproduccion_4_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public documentodetransporteproduccion_4_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentodetransporteproduccion_4_wc_impl.class ));
   }

   public documentodetransporteproduccion_4_wc_impl( int remoteHandle ,
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
      cmbavGridactiongroup1 = new HTMLChoice();
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
               AV33Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33Emprcod", AV33Emprcod);
               AV34Albprocod = GXutil.lval( httpContext.GetPar( "Albprocod")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34Albprocod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Albprocod), 10, 0));
               AV35Barcod = (int)(GXutil.lval( httpContext.GetPar( "Barcod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35Barcod), 8, 0));
               AV36Barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Barcodreo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36Barcodreo", GXutil.str( AV36Barcodreo, 1, 0));
               AV37Barcodpar = httpContext.GetPar( "Barcodpar") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37Barcodpar", AV37Barcodpar);
               AV46AlbEnvFtp = (byte)(GXutil.lval( httpContext.GetPar( "AlbEnvFtp"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46AlbEnvFtp", GXutil.str( AV46AlbEnvFtp, 1, 0));
               AV47AlbLic = httpContext.GetPar( "AlbLic") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47AlbLic", AV47AlbLic);
               AV48AlbProEst = (byte)(GXutil.lval( httpContext.GetPar( "AlbProEst"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48AlbProEst", GXutil.str( AV48AlbProEst, 1, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV33Emprcod,Long.valueOf(AV34Albprocod),Integer.valueOf(AV35Barcod),Byte.valueOf(AV36Barcodreo),AV37Barcodpar,Byte.valueOf(AV46AlbEnvFtp),AV47AlbLic,Byte.valueOf(AV48AlbProEst)});
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
      nRC_GXsfl_17 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_17"))) ;
      nGXsfl_17_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_17_idx"))) ;
      sGXsfl_17_idx = httpContext.GetPar( "sGXsfl_17_idx") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      edtGuiFasPKg_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtGuiFasPKg_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasPKg_Visible), 5, 0), !bGXsfl_17_Refreshing);
      edtGuiFasPMt_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtGuiFasPMt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasPMt_Visible), 5, 0), !bGXsfl_17_Refreshing);
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
      AV33Emprcod = httpContext.GetPar( "Emprcod") ;
      AV34Albprocod = GXutil.lval( httpContext.GetPar( "Albprocod")) ;
      AV35Barcod = (int)(GXutil.lval( httpContext.GetPar( "Barcod"))) ;
      AV36Barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Barcodreo"))) ;
      AV37Barcodpar = httpContext.GetPar( "Barcodpar") ;
      AV16TFGuiFasLin = (short)(GXutil.lval( httpContext.GetPar( "TFGuiFasLin"))) ;
      AV17TFGuiFasLin_To = (short)(GXutil.lval( httpContext.GetPar( "TFGuiFasLin_To"))) ;
      AV18TFFasCod = httpContext.GetPar( "TFFasCod") ;
      AV19TFFasCod_Sel = httpContext.GetPar( "TFFasCod_Sel") ;
      AV20TFFasDsc = httpContext.GetPar( "TFFasDsc") ;
      AV21TFFasDsc_Sel = httpContext.GetPar( "TFFasDsc_Sel") ;
      AV22TFFasKgm = CommonUtil.decimalVal( httpContext.GetPar( "TFFasKgm"), ".") ;
      AV23TFFasKgm_To = CommonUtil.decimalVal( httpContext.GetPar( "TFFasKgm_To"), ".") ;
      AV24TFGuiFasPKg = CommonUtil.decimalVal( httpContext.GetPar( "TFGuiFasPKg"), ".") ;
      AV25TFGuiFasPKg_To = CommonUtil.decimalVal( httpContext.GetPar( "TFGuiFasPKg_To"), ".") ;
      AV26TFFasMtr = CommonUtil.decimalVal( httpContext.GetPar( "TFFasMtr"), ".") ;
      AV27TFFasMtr_To = CommonUtil.decimalVal( httpContext.GetPar( "TFFasMtr_To"), ".") ;
      AV28TFGuiFasPMt = CommonUtil.decimalVal( httpContext.GetPar( "TFGuiFasPMt"), ".") ;
      AV29TFGuiFasPMt_To = CommonUtil.decimalVal( httpContext.GetPar( "TFGuiFasPMt_To"), ".") ;
      AV51Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV46AlbEnvFtp = (byte)(GXutil.lval( httpContext.GetPar( "AlbEnvFtp"))) ;
      AV47AlbLic = httpContext.GetPar( "AlbLic") ;
      AV48AlbProEst = (byte)(GXutil.lval( httpContext.GetPar( "AlbProEst"))) ;
      edtGuiFasPKg_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtGuiFasPKg_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasPKg_Visible), 5, 0), !bGXsfl_17_Refreshing);
      edtGuiFasPMt_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtGuiFasPMt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasPMt_Visible), 5, 0), !bGXsfl_17_Refreshing);
      AV43ContVal = (int)(GXutil.lval( httpContext.GetPar( "ContVal"))) ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
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
      gxgrgrid_refresh( subGrid_Rows, AV33Emprcod, AV34Albprocod, AV35Barcod, AV36Barcodreo, AV37Barcodpar, AV16TFGuiFasLin, AV17TFGuiFasLin_To, AV18TFFasCod, AV19TFFasCod_Sel, AV20TFFasDsc, AV21TFFasDsc_Sel, AV22TFFasKgm, AV23TFFasKgm_To, AV24TFGuiFasPKg, AV25TFGuiFasPKg_To, AV26TFFasMtr, AV27TFFasMtr_To, AV28TFGuiFasPMt, AV29TFGuiFasPMt_To, AV51Pgmname, AV12OrderedBy, AV13OrderedDsc, AV46AlbEnvFtp, AV47AlbLic, AV48AlbProEst, AV43ContVal, A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa29I2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Detalle de Fases p/produccion (Servicios)", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_4_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV33Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV34Albprocod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(AV35Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV36Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV37Barcodpar)),GXutil.URLEncode(GXutil.ltrimstr(AV46AlbEnvFtp,1,0)),GXutil.URLEncode(GXutil.rtrim(AV47AlbLic)),GXutil.URLEncode(GXutil.ltrimstr(AV48AlbProEst,1,0))}, new String[] {"Emprcod","Albprocod","Barcod","Barcodreo","Barcodpar","AlbEnvFtp","AlbLic","AlbProEst"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_ALBPROCOD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARCOD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARCODREO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARCODPAR", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A130BarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCONTVAL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV43ContVal), "ZZZZZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"DocumentodeTransporteProduccion_4_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV51Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("documentotransporteproduccion\\documentodetransporteproduccion_4_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_17", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_17, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV30DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV30DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV33Emprcod", GXutil.rtrim( wcpOAV33Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV34Albprocod", GXutil.ltrim( localUtil.ntoc( wcpOAV34Albprocod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV35Barcod", GXutil.ltrim( localUtil.ntoc( wcpOAV35Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV36Barcodreo", GXutil.ltrim( localUtil.ntoc( wcpOAV36Barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV37Barcodpar", GXutil.rtrim( wcpOAV37Barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV46AlbEnvFtp", GXutil.ltrim( localUtil.ntoc( wcpOAV46AlbEnvFtp, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV47AlbLic", GXutil.rtrim( wcpOAV47AlbLic));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV48AlbProEst", GXutil.ltrim( localUtil.ntoc( wcpOAV48AlbProEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFGUIFASLIN", GXutil.ltrim( localUtil.ntoc( AV16TFGuiFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFGUIFASLIN_TO", GXutil.ltrim( localUtil.ntoc( AV17TFGuiFasLin_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASCOD", GXutil.rtrim( AV18TFFasCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASCOD_SEL", GXutil.rtrim( AV19TFFasCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASDSC", GXutil.rtrim( AV20TFFasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASDSC_SEL", GXutil.rtrim( AV21TFFasDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASKGM", GXutil.ltrim( localUtil.ntoc( AV22TFFasKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASKGM_TO", GXutil.ltrim( localUtil.ntoc( AV23TFFasKgm_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFGUIFASPKG", GXutil.ltrim( localUtil.ntoc( AV24TFGuiFasPKg, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFGUIFASPKG_TO", GXutil.ltrim( localUtil.ntoc( AV25TFGuiFasPKg_To, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASMTR", GXutil.ltrim( localUtil.ntoc( AV26TFFasMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASMTR_TO", GXutil.ltrim( localUtil.ntoc( AV27TFFasMtr_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFGUIFASPMT", GXutil.ltrim( localUtil.ntoc( AV28TFGuiFasPMt, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFGUIFASPMT_TO", GXutil.ltrim( localUtil.ntoc( AV29TFGuiFasPMt_To, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV33Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBPROCOD", GXutil.ltrim( localUtil.ntoc( AV34Albprocod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOD", GXutil.ltrim( localUtil.ntoc( AV35Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV36Barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODPAR", GXutil.rtrim( AV37Barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBENVFTP", GXutil.ltrim( localUtil.ntoc( AV46AlbEnvFtp, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBLIC", GXutil.rtrim( AV47AlbLic));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBPROEST", GXutil.ltrim( localUtil.ntoc( AV48AlbProEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"ALBPROCOD", GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_ALBPROCOD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARCOD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARCODREO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARCODPAR", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A130BarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCONTVAL", GXutil.ltrim( localUtil.ntoc( AV43ContVal, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCONTVAL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV43ContVal), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Infinitescrolling", GXutil.rtrim( Grid_empowerer_Infinitescrolling));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GUIFASPKG_Visible", GXutil.ltrim( localUtil.ntoc( edtGuiFasPKg_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GUIFASPMT_Visible", GXutil.ltrim( localUtil.ntoc( edtGuiFasPMt_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
   }

   public void renderHtmlCloseForm29I2( )
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
      return "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_4_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Detalle de Fases p/produccion (Servicios)", "") ;
   }

   public void wb29I0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.documentotransporteproduccion.documentodetransporteproduccion_4_wc");
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
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTbmessage_Internalname, lblTbmessage_Caption, "", "", lblTbmessage_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextDanger", 0, "", 1, 1, 0, (short)(0), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_4_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 hidden-xs", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell HasGridEmpowerer", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV51Pgmname), GXutil.rtrim( localUtil.format( AV51Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_4_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV30DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         wb_table1_34_29I2( true) ;
      }
      else
      {
         wb_table1_34_29I2( false) ;
      }
      return  ;
   }

   public void wb_table1_34_29I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("InfiniteScrolling", Grid_empowerer_Infinitescrolling);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
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

   public void start29I2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Detalle de Fases p/produccion (Servicios)", ""), (short)(0)) ;
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
            strup29I0( ) ;
         }
      }
   }

   public void ws29I2( )
   {
      start29I2( ) ;
      evt29I2( ) ;
   }

   public void evt29I2( )
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
                              strup29I0( ) ;
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
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup29I0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1129I2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup29I0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1229I2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup29I0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = cmbavGridactiongroup1.getInternalname() ;
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup29I0( ) ;
                           }
                           AV52Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_1_tfguifaslin = AV16TFGuiFasLin ;
                           AV53Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_2_tfguifaslin_to = AV17TFGuiFasLin_To ;
                           AV54Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_3_tffascod = AV18TFFasCod ;
                           AV55Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_4_tffascod_sel = AV19TFFasCod_Sel ;
                           AV56Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_5_tffasdsc = AV20TFFasDsc ;
                           AV57Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_6_tffasdsc_sel = AV21TFFasDsc_Sel ;
                           AV58Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_7_tffaskgm = AV22TFFasKgm ;
                           AV59Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_8_tffaskgm_to = AV23TFFasKgm_To ;
                           AV60Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_9_tfguifaspkg = AV24TFGuiFasPKg ;
                           AV61Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_10_tfguifaspkg_to = AV25TFGuiFasPKg_To ;
                           AV62Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_11_tffasmtr = AV26TFFasMtr ;
                           AV63Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_12_tffasmtr_to = AV27TFFasMtr_To ;
                           AV64Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_13_tfguifaspmt = AV28TFGuiFasPMt ;
                           AV65Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_14_tfguifaspmt_to = AV29TFGuiFasPMt_To ;
                           sEvt = httpContext.cgiGet( sPrefix+"GRIDPAGING") ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 23), "VGRIDACTIONGROUP1.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 23), "VGRIDACTIONGROUP1.CLICK") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup29I0( ) ;
                           }
                           nGXsfl_17_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_17_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_17_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_172( ) ;
                           cmbavGridactiongroup1.setName( cmbavGridactiongroup1.getInternalname() );
                           cmbavGridactiongroup1.setValue( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()) );
                           AV41GridActionGroup1 = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41GridActionGroup1), 4, 0));
                           A1240GuiFasLin = (short)(localUtil.ctol( httpContext.cgiGet( edtGuiFasLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
                           A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
                           A1275FasKgm = localUtil.ctond( httpContext.cgiGet( edtFasKgm_Internalname)) ;
                           A1241GuiFasPKg = localUtil.ctond( httpContext.cgiGet( edtGuiFasPKg_Internalname)) ;
                           A1276FasMtr = localUtil.ctond( httpContext.cgiGet( edtFasMtr_Internalname)) ;
                           A1242GuiFasPMt = localUtil.ctond( httpContext.cgiGet( edtGuiFasPMt_Internalname)) ;
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
                                       GX_FocusControl = cmbavGridactiongroup1.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e1329I2 ();
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
                                       GX_FocusControl = cmbavGridactiongroup1.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e1429I2 ();
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
                                       GX_FocusControl = cmbavGridactiongroup1.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e1529I2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONGROUP1.CLICK") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGridactiongroup1.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e1629I2 ();
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
                                    strup29I0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGridactiongroup1.getInternalname() ;
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

   public void we29I2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm29I2( ) ;
         }
      }
   }

   public void pa29I2( )
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
                                 String AV33Emprcod ,
                                 long AV34Albprocod ,
                                 int AV35Barcod ,
                                 byte AV36Barcodreo ,
                                 String AV37Barcodpar ,
                                 short AV16TFGuiFasLin ,
                                 short AV17TFGuiFasLin_To ,
                                 String AV18TFFasCod ,
                                 String AV19TFFasCod_Sel ,
                                 String AV20TFFasDsc ,
                                 String AV21TFFasDsc_Sel ,
                                 java.math.BigDecimal AV22TFFasKgm ,
                                 java.math.BigDecimal AV23TFFasKgm_To ,
                                 java.math.BigDecimal AV24TFGuiFasPKg ,
                                 java.math.BigDecimal AV25TFGuiFasPKg_To ,
                                 java.math.BigDecimal AV26TFFasMtr ,
                                 java.math.BigDecimal AV27TFFasMtr_To ,
                                 java.math.BigDecimal AV28TFGuiFasPMt ,
                                 java.math.BigDecimal AV29TFGuiFasPMt_To ,
                                 String AV51Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 byte AV46AlbEnvFtp ,
                                 String AV47AlbLic ,
                                 byte AV48AlbProEst ,
                                 int AV43ContVal ,
                                 String A396EmprCod ,
                                 long A30AlbProCod ,
                                 int A129BarCod ,
                                 byte A132BarCodReo ,
                                 String A130BarCodPar ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e1429I2 ();
      GRID_nCurrentRecord = 0 ;
      rf29I2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"DocumentodeTransporteProduccion_4_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV51Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("documentotransporteproduccion\\documentodetransporteproduccion_4_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_GUIFASLIN", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A1240GuiFasLin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GUIFASLIN", GXutil.ltrim( localUtil.ntoc( A1240GuiFasLin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_FASCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A457FasCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FASCOD", GXutil.rtrim( A457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_FASDSC", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A460FasDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FASDSC", GXutil.rtrim( A460FasDsc));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      send_integrity_hashes( ) ;
      rf29I2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV51Pgmname = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_4_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51Pgmname", AV51Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf29I2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(17) ;
      /* Execute user event: Refresh */
      e1429I2 ();
      nGXsfl_17_idx = (int)(1+GRID_nFirstRecordOnPage) ;
      sGXsfl_17_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_17_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_172( ) ;
      bGXsfl_17_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWithSelection WorkWith");
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
         subsflControlProps_172( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Short.valueOf(AV52Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_1_tfguifaslin) ,
                                              Short.valueOf(AV53Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_2_tfguifaslin_to) ,
                                              AV55Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_4_tffascod_sel ,
                                              AV54Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_3_tffascod ,
                                              AV57Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_6_tffasdsc_sel ,
                                              AV56Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_5_tffasdsc ,
                                              AV58Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_7_tffaskgm ,
                                              AV59Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_8_tffaskgm_to ,
                                              AV60Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_9_tfguifaspkg ,
                                              AV61Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_10_tfguifaspkg_to ,
                                              AV62Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_11_tffasmtr ,
                                              AV63Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_12_tffasmtr_to ,
                                              AV64Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_13_tfguifaspmt ,
                                              AV65Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_14_tfguifaspmt_to ,
                                              Short.valueOf(A1240GuiFasLin) ,
                                              A457FasCod ,
                                              A460FasDsc ,
                                              A1275FasKgm ,
                                              A1241GuiFasPKg ,
                                              A1276FasMtr ,
                                              A1242GuiFasPMt ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV33Emprcod ,
                                              Long.valueOf(AV34Albprocod) ,
                                              Integer.valueOf(AV35Barcod) ,
                                              Byte.valueOf(AV36Barcodreo) ,
                                              AV37Barcodpar ,
                                              A396EmprCod ,
                                              Long.valueOf(A30AlbProCod) ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar } ,
                                              new int[]{
                                              TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG,
                                              TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                              }
         });
         /* Using cursor H029I2 */
         pr_default.execute(0, new Object[] {AV33Emprcod, Long.valueOf(AV34Albprocod), Integer.valueOf(AV35Barcod), Byte.valueOf(AV36Barcodreo), AV37Barcodpar, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_17_idx = (int)(1+GRID_nFirstRecordOnPage) ;
         sGXsfl_17_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_17_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_172( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H029I2_A396EmprCod[0] ;
            A30AlbProCod = H029I2_A30AlbProCod[0] ;
            A129BarCod = H029I2_A129BarCod[0] ;
            A132BarCodReo = H029I2_A132BarCodReo[0] ;
            A130BarCodPar = H029I2_A130BarCodPar[0] ;
            e1529I2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(17) ;
         wb29I0( ) ;
      }
      bGXsfl_17_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes29I2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"ALBPROCOD", GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_ALBPROCOD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARCOD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARCODREO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARCODPAR", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A130BarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_GUIFASLIN"+"_"+sGXsfl_17_idx, getSecureSignedToken( sPrefix+sGXsfl_17_idx, localUtil.format( DecimalUtil.doubleToDec(A1240GuiFasLin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_FASCOD"+"_"+sGXsfl_17_idx, getSecureSignedToken( sPrefix+sGXsfl_17_idx, GXutil.rtrim( localUtil.format( A457FasCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_FASDSC"+"_"+sGXsfl_17_idx, getSecureSignedToken( sPrefix+sGXsfl_17_idx, GXutil.rtrim( localUtil.format( A460FasDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCONTVAL", GXutil.ltrim( localUtil.ntoc( AV43ContVal, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCONTVAL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV43ContVal), "ZZZZZZZ9")));
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
      AV52Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_1_tfguifaslin = AV16TFGuiFasLin ;
      AV53Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_2_tfguifaslin_to = AV17TFGuiFasLin_To ;
      AV54Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_3_tffascod = AV18TFFasCod ;
      AV55Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_4_tffascod_sel = AV19TFFasCod_Sel ;
      AV56Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_5_tffasdsc = AV20TFFasDsc ;
      AV57Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_6_tffasdsc_sel = AV21TFFasDsc_Sel ;
      AV58Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_7_tffaskgm = AV22TFFasKgm ;
      AV59Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_8_tffaskgm_to = AV23TFFasKgm_To ;
      AV60Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_9_tfguifaspkg = AV24TFGuiFasPKg ;
      AV61Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_10_tfguifaspkg_to = AV25TFGuiFasPKg_To ;
      AV62Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_11_tffasmtr = AV26TFFasMtr ;
      AV63Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_12_tffasmtr_to = AV27TFFasMtr_To ;
      AV64Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_13_tfguifaspmt = AV28TFGuiFasPMt ;
      AV65Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_14_tfguifaspmt_to = AV29TFGuiFasPMt_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Short.valueOf(AV52Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_1_tfguifaslin) ,
                                           Short.valueOf(AV53Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_2_tfguifaslin_to) ,
                                           AV55Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_4_tffascod_sel ,
                                           AV54Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_3_tffascod ,
                                           AV57Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_6_tffasdsc_sel ,
                                           AV56Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_5_tffasdsc ,
                                           AV58Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_7_tffaskgm ,
                                           AV59Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_8_tffaskgm_to ,
                                           AV60Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_9_tfguifaspkg ,
                                           AV61Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_10_tfguifaspkg_to ,
                                           AV62Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_11_tffasmtr ,
                                           AV63Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_12_tffasmtr_to ,
                                           AV64Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_13_tfguifaspmt ,
                                           AV65Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_14_tfguifaspmt_to ,
                                           Short.valueOf(A1240GuiFasLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A1275FasKgm ,
                                           A1241GuiFasPKg ,
                                           A1276FasMtr ,
                                           A1242GuiFasPMt ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV33Emprcod ,
                                           Long.valueOf(AV34Albprocod) ,
                                           Integer.valueOf(AV35Barcod) ,
                                           Byte.valueOf(AV36Barcodreo) ,
                                           AV37Barcodpar ,
                                           A396EmprCod ,
                                           Long.valueOf(A30AlbProCod) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      /* Using cursor H029I3 */
      pr_default.execute(1, new Object[] {AV33Emprcod, Long.valueOf(AV34Albprocod), Integer.valueOf(AV35Barcod), Byte.valueOf(AV36Barcodreo), AV37Barcodpar});
      GRID_nRecordCount = H029I3_AGRID_nRecordCount[0] ;
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
      AV52Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_1_tfguifaslin = AV16TFGuiFasLin ;
      AV53Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_2_tfguifaslin_to = AV17TFGuiFasLin_To ;
      AV54Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_3_tffascod = AV18TFFasCod ;
      AV55Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_4_tffascod_sel = AV19TFFasCod_Sel ;
      AV56Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_5_tffasdsc = AV20TFFasDsc ;
      AV57Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_6_tffasdsc_sel = AV21TFFasDsc_Sel ;
      AV58Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_7_tffaskgm = AV22TFFasKgm ;
      AV59Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_8_tffaskgm_to = AV23TFFasKgm_To ;
      AV60Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_9_tfguifaspkg = AV24TFGuiFasPKg ;
      AV61Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_10_tfguifaspkg_to = AV25TFGuiFasPKg_To ;
      AV62Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_11_tffasmtr = AV26TFFasMtr ;
      AV63Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_12_tffasmtr_to = AV27TFFasMtr_To ;
      AV64Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_13_tfguifaspmt = AV28TFGuiFasPMt ;
      AV65Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_14_tfguifaspmt_to = AV29TFGuiFasPMt_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV33Emprcod, AV34Albprocod, AV35Barcod, AV36Barcodreo, AV37Barcodpar, AV16TFGuiFasLin, AV17TFGuiFasLin_To, AV18TFFasCod, AV19TFFasCod_Sel, AV20TFFasDsc, AV21TFFasDsc_Sel, AV22TFFasKgm, AV23TFFasKgm_To, AV24TFGuiFasPKg, AV25TFGuiFasPKg_To, AV26TFFasMtr, AV27TFFasMtr_To, AV28TFGuiFasPMt, AV29TFGuiFasPMt_To, AV51Pgmname, AV12OrderedBy, AV13OrderedDsc, AV46AlbEnvFtp, AV47AlbLic, AV48AlbProEst, AV43ContVal, A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV52Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_1_tfguifaslin = AV16TFGuiFasLin ;
      AV53Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_2_tfguifaslin_to = AV17TFGuiFasLin_To ;
      AV54Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_3_tffascod = AV18TFFasCod ;
      AV55Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_4_tffascod_sel = AV19TFFasCod_Sel ;
      AV56Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_5_tffasdsc = AV20TFFasDsc ;
      AV57Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_6_tffasdsc_sel = AV21TFFasDsc_Sel ;
      AV58Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_7_tffaskgm = AV22TFFasKgm ;
      AV59Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_8_tffaskgm_to = AV23TFFasKgm_To ;
      AV60Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_9_tfguifaspkg = AV24TFGuiFasPKg ;
      AV61Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_10_tfguifaspkg_to = AV25TFGuiFasPKg_To ;
      AV62Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_11_tffasmtr = AV26TFFasMtr ;
      AV63Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_12_tffasmtr_to = AV27TFFasMtr_To ;
      AV64Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_13_tfguifaspmt = AV28TFGuiFasPMt ;
      AV65Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_14_tfguifaspmt_to = AV29TFGuiFasPMt_To ;
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( ( GRID_nRecordCount >= subgrid_fnc_recordsperpage( ) ) && ( GRID_nEOF == 0 ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      if ( GRID_nEOF == 1 )
      {
         GRID_nFirstRecordOnPage = GRID_nCurrentRecord ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV33Emprcod, AV34Albprocod, AV35Barcod, AV36Barcodreo, AV37Barcodpar, AV16TFGuiFasLin, AV17TFGuiFasLin_To, AV18TFFasCod, AV19TFFasCod_Sel, AV20TFFasDsc, AV21TFFasDsc_Sel, AV22TFFasKgm, AV23TFFasKgm_To, AV24TFGuiFasPKg, AV25TFGuiFasPKg_To, AV26TFFasMtr, AV27TFFasMtr_To, AV28TFGuiFasPMt, AV29TFGuiFasPMt_To, AV51Pgmname, AV12OrderedBy, AV13OrderedDsc, AV46AlbEnvFtp, AV47AlbLic, AV48AlbProEst, AV43ContVal, A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV52Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_1_tfguifaslin = AV16TFGuiFasLin ;
      AV53Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_2_tfguifaslin_to = AV17TFGuiFasLin_To ;
      AV54Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_3_tffascod = AV18TFFasCod ;
      AV55Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_4_tffascod_sel = AV19TFFasCod_Sel ;
      AV56Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_5_tffasdsc = AV20TFFasDsc ;
      AV57Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_6_tffasdsc_sel = AV21TFFasDsc_Sel ;
      AV58Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_7_tffaskgm = AV22TFFasKgm ;
      AV59Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_8_tffaskgm_to = AV23TFFasKgm_To ;
      AV60Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_9_tfguifaspkg = AV24TFGuiFasPKg ;
      AV61Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_10_tfguifaspkg_to = AV25TFGuiFasPKg_To ;
      AV62Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_11_tffasmtr = AV26TFFasMtr ;
      AV63Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_12_tffasmtr_to = AV27TFFasMtr_To ;
      AV64Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_13_tfguifaspmt = AV28TFGuiFasPMt ;
      AV65Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_14_tfguifaspmt_to = AV29TFGuiFasPMt_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV33Emprcod, AV34Albprocod, AV35Barcod, AV36Barcodreo, AV37Barcodpar, AV16TFGuiFasLin, AV17TFGuiFasLin_To, AV18TFFasCod, AV19TFFasCod_Sel, AV20TFFasDsc, AV21TFFasDsc_Sel, AV22TFFasKgm, AV23TFFasKgm_To, AV24TFGuiFasPKg, AV25TFGuiFasPKg_To, AV26TFFasMtr, AV27TFFasMtr_To, AV28TFGuiFasPMt, AV29TFGuiFasPMt_To, AV51Pgmname, AV12OrderedBy, AV13OrderedDsc, AV46AlbEnvFtp, AV47AlbLic, AV48AlbProEst, AV43ContVal, A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV52Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_1_tfguifaslin = AV16TFGuiFasLin ;
      AV53Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_2_tfguifaslin_to = AV17TFGuiFasLin_To ;
      AV54Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_3_tffascod = AV18TFFasCod ;
      AV55Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_4_tffascod_sel = AV19TFFasCod_Sel ;
      AV56Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_5_tffasdsc = AV20TFFasDsc ;
      AV57Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_6_tffasdsc_sel = AV21TFFasDsc_Sel ;
      AV58Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_7_tffaskgm = AV22TFFasKgm ;
      AV59Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_8_tffaskgm_to = AV23TFFasKgm_To ;
      AV60Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_9_tfguifaspkg = AV24TFGuiFasPKg ;
      AV61Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_10_tfguifaspkg_to = AV25TFGuiFasPKg_To ;
      AV62Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_11_tffasmtr = AV26TFFasMtr ;
      AV63Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_12_tffasmtr_to = AV27TFFasMtr_To ;
      AV64Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_13_tfguifaspmt = AV28TFGuiFasPMt ;
      AV65Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_14_tfguifaspmt_to = AV29TFGuiFasPMt_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV33Emprcod, AV34Albprocod, AV35Barcod, AV36Barcodreo, AV37Barcodpar, AV16TFGuiFasLin, AV17TFGuiFasLin_To, AV18TFFasCod, AV19TFFasCod_Sel, AV20TFFasDsc, AV21TFFasDsc_Sel, AV22TFFasKgm, AV23TFFasKgm_To, AV24TFGuiFasPKg, AV25TFGuiFasPKg_To, AV26TFFasMtr, AV27TFFasMtr_To, AV28TFGuiFasPMt, AV29TFGuiFasPMt_To, AV51Pgmname, AV12OrderedBy, AV13OrderedDsc, AV46AlbEnvFtp, AV47AlbLic, AV48AlbProEst, AV43ContVal, A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV52Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_1_tfguifaslin = AV16TFGuiFasLin ;
      AV53Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_2_tfguifaslin_to = AV17TFGuiFasLin_To ;
      AV54Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_3_tffascod = AV18TFFasCod ;
      AV55Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_4_tffascod_sel = AV19TFFasCod_Sel ;
      AV56Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_5_tffasdsc = AV20TFFasDsc ;
      AV57Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_6_tffasdsc_sel = AV21TFFasDsc_Sel ;
      AV58Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_7_tffaskgm = AV22TFFasKgm ;
      AV59Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_8_tffaskgm_to = AV23TFFasKgm_To ;
      AV60Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_9_tfguifaspkg = AV24TFGuiFasPKg ;
      AV61Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_10_tfguifaspkg_to = AV25TFGuiFasPKg_To ;
      AV62Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_11_tffasmtr = AV26TFFasMtr ;
      AV63Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_12_tffasmtr_to = AV27TFFasMtr_To ;
      AV64Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_13_tfguifaspmt = AV28TFGuiFasPMt ;
      AV65Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_14_tfguifaspmt_to = AV29TFGuiFasPMt_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV33Emprcod, AV34Albprocod, AV35Barcod, AV36Barcodreo, AV37Barcodpar, AV16TFGuiFasLin, AV17TFGuiFasLin_To, AV18TFFasCod, AV19TFFasCod_Sel, AV20TFFasDsc, AV21TFFasDsc_Sel, AV22TFFasKgm, AV23TFFasKgm_To, AV24TFGuiFasPKg, AV25TFGuiFasPKg_To, AV26TFFasMtr, AV27TFFasMtr_To, AV28TFGuiFasPMt, AV29TFGuiFasPMt_To, AV51Pgmname, AV12OrderedBy, AV13OrderedDsc, AV46AlbEnvFtp, AV47AlbLic, AV48AlbProEst, AV43ContVal, A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV51Pgmname = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_4_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51Pgmname", AV51Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup29I0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1329I2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV30DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_17 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_17"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV33Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV33Emprcod") ;
         wcpOAV34Albprocod = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV34Albprocod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV35Barcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV35Barcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV36Barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV36Barcodreo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV37Barcodpar = httpContext.cgiGet( sPrefix+"wcpOAV37Barcodpar") ;
         wcpOAV46AlbEnvFtp = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV46AlbEnvFtp"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV47AlbLic = httpContext.cgiGet( sPrefix+"wcpOAV47AlbLic") ;
         wcpOAV48AlbProEst = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV48AlbProEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
         Dvelop_confirmpanel_eliminar_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Title") ;
         Dvelop_confirmpanel_eliminar_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext") ;
         Dvelop_confirmpanel_eliminar_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_eliminar_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Infinitescrolling = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Infinitescrolling") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedcolumn") ;
         Dvelop_confirmpanel_eliminar_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Result") ;
         /* Read variables values. */
         AV51Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51Pgmname", AV51Pgmname);
         /* Read subfile selected row values. */
         nGXsfl_17_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_17_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_17_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_172( ) ;
         if ( nGXsfl_17_idx > 0 )
         {
            cmbavGridactiongroup1.setName( cmbavGridactiongroup1.getInternalname() );
            cmbavGridactiongroup1.setValue( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()) );
            AV41GridActionGroup1 = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41GridActionGroup1), 4, 0));
            A1240GuiFasLin = (short)(localUtil.ctol( httpContext.cgiGet( edtGuiFasLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
            A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
            A1275FasKgm = localUtil.ctond( httpContext.cgiGet( edtFasKgm_Internalname)) ;
            A1241GuiFasPKg = localUtil.ctond( httpContext.cgiGet( edtGuiFasPKg_Internalname)) ;
            A1276FasMtr = localUtil.ctond( httpContext.cgiGet( edtFasMtr_Internalname)) ;
            A1242GuiFasPMt = localUtil.ctond( httpContext.cgiGet( edtGuiFasPMt_Internalname)) ;
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"DocumentodeTransporteProduccion_4_WC");
         AV51Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51Pgmname", AV51Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV51Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("documentotransporteproduccion\\documentodetransporteproduccion_4_wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e1329I2 ();
      if (returnInSub) return;
   }

   public void e1329I2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV38Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      documentodetransporteproduccion_4_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV38Station = GXt_char1 ;
      GXv_char2[0] = AV33Emprcod ;
      GXv_char3[0] = AV39EmprNom ;
      GXv_char4[0] = AV40UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV38Station, GXv_char2, GXv_char3, GXv_char4) ;
      documentodetransporteproduccion_4_wc_impl.this.AV33Emprcod = GXv_char2[0] ;
      documentodetransporteproduccion_4_wc_impl.this.AV39EmprNom = GXv_char3[0] ;
      documentodetransporteproduccion_4_wc_impl.this.AV40UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33Emprcod", AV33Emprcod);
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if (returnInSub) return;
      subGrid_Rows = 50 ;
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
      if ( AV12OrderedBy < 1 )
      {
         AV12OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV30DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV30DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      GXt_int7 = (byte)(AV42Moda21) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV33Emprcod, httpContext.getMessage( "MODA21", ""), GXv_int8) ;
      documentodetransporteproduccion_4_wc_impl.this.GXt_int7 = GXv_int8[0] ;
      AV42Moda21 = GXt_int7 ;
      GXt_int9 = AV43ContVal ;
      GXv_int10[0] = GXt_int9 ;
      new app.pbuscon(remoteHandle, context).execute( AV33Emprcod, httpContext.getMessage( "UPDPFS", ""), GXv_int10) ;
      documentodetransporteproduccion_4_wc_impl.this.GXt_int9 = GXv_int10[0] ;
      AV43ContVal = GXt_int9 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43ContVal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43ContVal), 8, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCONTVAL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV43ContVal), "ZZZZZZZ9")));
   }

   public void e1429I2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext11[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext11) ;
      AV6WWPContext = GXv_SdtWWPContext11[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      AV52Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_1_tfguifaslin = AV16TFGuiFasLin ;
      AV53Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_2_tfguifaslin_to = AV17TFGuiFasLin_To ;
      AV54Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_3_tffascod = AV18TFFasCod ;
      AV55Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_4_tffascod_sel = AV19TFFasCod_Sel ;
      AV56Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_5_tffasdsc = AV20TFFasDsc ;
      AV57Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_6_tffasdsc_sel = AV21TFFasDsc_Sel ;
      AV58Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_7_tffaskgm = AV22TFFasKgm ;
      AV59Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_8_tffaskgm_to = AV23TFFasKgm_To ;
      AV60Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_9_tfguifaspkg = AV24TFGuiFasPKg ;
      AV61Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_10_tfguifaspkg_to = AV25TFGuiFasPKg_To ;
      AV62Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_11_tffasmtr = AV26TFFasMtr ;
      AV63Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_12_tffasmtr_to = AV27TFFasMtr_To ;
      AV64Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_13_tfguifaspmt = AV28TFGuiFasPMt ;
      AV65Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_14_tfguifaspmt_to = AV29TFGuiFasPMt_To ;
   }

   public void e1129I2( )
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
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "GuiFasLin") == 0 )
         {
            AV16TFGuiFasLin = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16TFGuiFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16TFGuiFasLin), 4, 0));
            AV17TFGuiFasLin_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17TFGuiFasLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17TFGuiFasLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasCod") == 0 )
         {
            AV18TFFasCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18TFFasCod", AV18TFFasCod);
            AV19TFFasCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19TFFasCod_Sel", AV19TFFasCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasDsc") == 0 )
         {
            AV20TFFasDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20TFFasDsc", AV20TFFasDsc);
            AV21TFFasDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21TFFasDsc_Sel", AV21TFFasDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasKgm") == 0 )
         {
            AV22TFFasKgm = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22TFFasKgm", GXutil.ltrimstr( AV22TFFasKgm, 9, 2));
            AV23TFFasKgm_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23TFFasKgm_To", GXutil.ltrimstr( AV23TFFasKgm_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "GuiFasPKg") == 0 )
         {
            AV24TFGuiFasPKg = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24TFGuiFasPKg", GXutil.ltrimstr( AV24TFGuiFasPKg, 13, 5));
            AV25TFGuiFasPKg_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25TFGuiFasPKg_To", GXutil.ltrimstr( AV25TFGuiFasPKg_To, 13, 5));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasMtr") == 0 )
         {
            AV26TFFasMtr = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFFasMtr", GXutil.ltrimstr( AV26TFFasMtr, 9, 2));
            AV27TFFasMtr_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFFasMtr_To", GXutil.ltrimstr( AV27TFFasMtr_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "GuiFasPMt") == 0 )
         {
            AV28TFGuiFasPMt = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFGuiFasPMt", GXutil.ltrimstr( AV28TFGuiFasPMt, 13, 5));
            AV29TFGuiFasPMt_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFGuiFasPMt_To", GXutil.ltrimstr( AV29TFGuiFasPMt_To, 13, 5));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e1529I2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactiongroup1.removeAllItems();
      cmbavGridactiongroup1.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactiongroup1.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Eliminar", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactiongroup1.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "Alterar Preço", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(17) ;
      }
      sendrow_172( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_17_Refreshing )
      {
         httpContext.doAjaxLoad(17, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV41GridActionGroup1, 4, 0)) );
   }

   public void e1629I2( )
   {
      /* Gridactiongroup1_Click Routine */
      returnInSub = false ;
      if ( AV41GridActionGroup1 == 1 )
      {
         /* Execute user subroutine: 'DO ELIMINAR' */
         S162 ();
         if (returnInSub) return;
      }
      else if ( AV41GridActionGroup1 == 2 )
      {
         /* Execute user subroutine: 'DO MODIFICARPRECIO' */
         S172 ();
         if (returnInSub) return;
      }
      AV41GridActionGroup1 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41GridActionGroup1), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV41GridActionGroup1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGridactiongroup1.getInternalname(), "Values", cmbavGridactiongroup1.ToJavascriptSource(), true);
   }

   public void e1229I2( )
   {
      /* Dvelop_confirmpanel_eliminar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINAR' */
         S182 ();
         if (returnInSub) return;
      }
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV12OrderedBy, 4, 0))+":"+(AV13OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'DO ELIMINAR' Routine */
      returnInSub = false ;
      lblTbmessage_Caption = " " ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      if ( ( AV46AlbEnvFtp == 3 ) || ( GXutil.strcmp(AV47AlbLic, " ") != 0 ) || ( AV48AlbProEst == 2 ) )
      {
         httpContext.doAjaxRefreshCmp(sPrefix);
         lblTbmessage_Caption = ((AV48AlbProEst==2) ? httpContext.getMessage( "Guia faturada", "") : httpContext.getMessage( "Comunicada a AT", "")) ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      }
      else
      {
         AV66Emprcod_selected = A396EmprCod ;
         AV67Albprocod_selected = A30AlbProCod ;
         AV68Barcod_selected = A129BarCod ;
         AV69Barcodreo_selected = A132BarCodReo ;
         AV70Barcodpar_selected = A130BarCodPar ;
         this.executeUsercontrolMethod(sPrefix, false, "DVELOP_CONFIRMPANEL_ELIMINARContainer", "Confirm", "", new Object[] {});
      }
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S182( )
   {
      /* 'DO ACTION ELIMINAR' Routine */
      returnInSub = false ;
      new app.documentotransporteproduccion.del_albfas(remoteHandle, context).execute( AV33Emprcod, AV34Albprocod, AV35Barcod, AV36Barcodreo, AV37Barcodpar, A1240GuiFasLin) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S172( )
   {
      /* 'DO MODIFICARPRECIO' Routine */
      returnInSub = false ;
      lblTbmessage_Caption = " " ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      if ( ( AV46AlbEnvFtp == 3 ) || ( GXutil.strcmp(AV47AlbLic, " ") != 0 ) || ( AV48AlbProEst == 2 ) )
      {
         httpContext.doAjaxRefreshCmp(sPrefix);
         lblTbmessage_Caption = ((AV48AlbProEst==2) ? httpContext.getMessage( "Guia faturada", "") : httpContext.getMessage( "Comunicada a AT", "")) ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      }
      else
      {
         httpContext.popup(formatLink("app.albaranes.documentodetransporteproduccion_14_pwdgrl", new String[] {GXutil.URLEncode(GXutil.rtrim(AV33Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV34Albprocod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(AV35Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV36Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV37Barcodpar)),GXutil.URLEncode(GXutil.ltrimstr(A1240GuiFasLin,4,0)),GXutil.URLEncode(GXutil.rtrim(A457FasCod)),GXutil.URLEncode(GXutil.rtrim(A460FasDsc)),GXutil.URLEncode(GXutil.ltrimstr(AV43ContVal,8,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar","GuiFasLin","Fascod","Fasdsc","UsurPwd1","PwdBo"}) , new Object[] {"AV44Ok"});
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV15Session.getValue(AV51Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV51Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV15Session.getValue(AV51Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      AV71GXV1 = 1 ;
      while ( AV71GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV71GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIFASLIN") == 0 )
         {
            AV16TFGuiFasLin = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16TFGuiFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16TFGuiFasLin), 4, 0));
            AV17TFGuiFasLin_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17TFGuiFasLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17TFGuiFasLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD") == 0 )
         {
            AV18TFFasCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18TFFasCod", AV18TFFasCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD_SEL") == 0 )
         {
            AV19TFFasCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19TFFasCod_Sel", AV19TFFasCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC") == 0 )
         {
            AV20TFFasDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20TFFasDsc", AV20TFFasDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC_SEL") == 0 )
         {
            AV21TFFasDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21TFFasDsc_Sel", AV21TFFasDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASKGM") == 0 )
         {
            AV22TFFasKgm = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22TFFasKgm", GXutil.ltrimstr( AV22TFFasKgm, 9, 2));
            AV23TFFasKgm_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23TFFasKgm_To", GXutil.ltrimstr( AV23TFFasKgm_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIFASPKG") == 0 )
         {
            AV24TFGuiFasPKg = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24TFGuiFasPKg", GXutil.ltrimstr( AV24TFGuiFasPKg, 13, 5));
            AV25TFGuiFasPKg_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25TFGuiFasPKg_To", GXutil.ltrimstr( AV25TFGuiFasPKg_To, 13, 5));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASMTR") == 0 )
         {
            AV26TFFasMtr = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFFasMtr", GXutil.ltrimstr( AV26TFFasMtr, 9, 2));
            AV27TFFasMtr_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFFasMtr_To", GXutil.ltrimstr( AV27TFFasMtr_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIFASPMT") == 0 )
         {
            AV28TFGuiFasPMt = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFGuiFasPMt", GXutil.ltrimstr( AV28TFGuiFasPMt, 13, 5));
            AV29TFGuiFasPMt_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFGuiFasPMt_To", GXutil.ltrimstr( AV29TFGuiFasPMt_To, 13, 5));
         }
         AV71GXV1 = (int)(AV71GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV19TFFasCod_Sel)==0), AV19TFFasCod_Sel, GXv_char4) ;
      documentodetransporteproduccion_4_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV21TFFasDsc_Sel)==0), AV21TFFasDsc_Sel, GXv_char3) ;
      documentodetransporteproduccion_4_wc_impl.this.GXt_char12 = GXv_char3[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|"+GXt_char12+"||||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char12 = "" ;
      GXv_char4[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV18TFFasCod)==0), AV18TFFasCod, GXv_char4) ;
      documentodetransporteproduccion_4_wc_impl.this.GXt_char12 = GXv_char4[0] ;
      GXt_char1 = "" ;
      GXv_char3[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV20TFFasDsc)==0), AV20TFFasDsc, GXv_char3) ;
      documentodetransporteproduccion_4_wc_impl.this.GXt_char1 = GXv_char3[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV16TFGuiFasLin) ? "" : GXutil.str( AV16TFGuiFasLin, 4, 0))+"|"+GXt_char12+"|"+GXt_char1+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV22TFFasKgm)==0) ? "" : GXutil.str( AV22TFFasKgm, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV24TFGuiFasPKg)==0) ? "" : GXutil.str( AV24TFGuiFasPKg, 13, 5))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV26TFFasMtr)==0) ? "" : GXutil.str( AV26TFFasMtr, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV28TFGuiFasPMt)==0) ? "" : GXutil.str( AV28TFGuiFasPMt, 13, 5)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV17TFGuiFasLin_To) ? "" : GXutil.str( AV17TFGuiFasLin_To, 4, 0))+"|||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV23TFFasKgm_To)==0) ? "" : GXutil.str( AV23TFFasKgm_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV25TFGuiFasPKg_To)==0) ? "" : GXutil.str( AV25TFGuiFasPKg_To, 13, 5))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV27TFFasMtr_To)==0) ? "" : GXutil.str( AV27TFFasMtr_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV29TFGuiFasPMt_To)==0) ? "" : GXutil.str( AV29TFGuiFasPMt_To, 13, 5)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV15Session.getValue(AV51Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState13[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState13, "TFGUIFASLIN", "", !((0==AV16TFGuiFasLin)&&(0==AV17TFGuiFasLin_To)), (short)(0), GXutil.trim( GXutil.str( AV16TFGuiFasLin, 4, 0)), GXutil.trim( GXutil.str( AV17TFGuiFasLin_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState13[0] ;
      GXv_SdtWWPGridState13[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState13, "TFFASCOD", "", !(GXutil.strcmp("", AV18TFFasCod)==0), (short)(0), AV18TFFasCod, "", !(GXutil.strcmp("", AV19TFFasCod_Sel)==0), AV19TFFasCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState13[0] ;
      GXv_SdtWWPGridState13[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState13, "TFFASDSC", "", !(GXutil.strcmp("", AV20TFFasDsc)==0), (short)(0), AV20TFFasDsc, "", !(GXutil.strcmp("", AV21TFFasDsc_Sel)==0), AV21TFFasDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState13[0] ;
      GXv_SdtWWPGridState13[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState13, "TFFASKGM", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV22TFFasKgm)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV23TFFasKgm_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV22TFFasKgm, 9, 2)), GXutil.trim( GXutil.str( AV23TFFasKgm_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState13[0] ;
      GXv_SdtWWPGridState13[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState13, "TFGUIFASPKG", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV24TFGuiFasPKg)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV25TFGuiFasPKg_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV24TFGuiFasPKg, 13, 5)), GXutil.trim( GXutil.str( AV25TFGuiFasPKg_To, 13, 5))) ;
      AV10GridState = GXv_SdtWWPGridState13[0] ;
      GXv_SdtWWPGridState13[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState13, "TFFASMTR", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV26TFFasMtr)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV27TFFasMtr_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV26TFFasMtr, 9, 2)), GXutil.trim( GXutil.str( AV27TFFasMtr_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState13[0] ;
      GXv_SdtWWPGridState13[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState13, "TFGUIFASPMT", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV28TFGuiFasPMt)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV29TFGuiFasPMt_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV28TFGuiFasPMt, 13, 5)), GXutil.trim( GXutil.str( AV29TFGuiFasPMt_To, 13, 5))) ;
      AV10GridState = GXv_SdtWWPGridState13[0] ;
      if ( ! (GXutil.strcmp("", AV33Emprcod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV33Emprcod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV34Albprocod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBPROCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV34Albprocod, 10, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV35Barcod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV35Barcod, 8, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV36Barcodreo) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODREO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV36Barcodreo, 1, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV37Barcodpar)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODPAR" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV37Barcodpar );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV46AlbEnvFtp) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBENVFTP" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV46AlbEnvFtp, 1, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV47AlbLic)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBLIC" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV47AlbLic );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV48AlbProEst) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBPROEST" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV48AlbProEst, 1, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV51Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV51Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TALBPre" );
      AV15Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV15Session.getValue(AV51Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV51Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV15Session.getValue(AV51Pgmname+"GridState"), null, null);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( AV33Emprcod, httpContext.getMessage( "MODA21", "")) == 0 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtGuiFasPKg_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtGuiFasPKg_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasPKg_Visible), 5, 0), !bGXsfl_17_Refreshing);
         GXv_SdtWWPGridState13[0] = AV10GridState;
         if ( new app.wwpbaseobjects.wwp_deletefilter(remoteHandle, context).executeUdp( GXv_SdtWWPGridState13, "TFGUIFASPKG", false) )
         {
            Cond_result = true ;
         }
         else
         {
            Cond_result = false ;
         }
         AV10GridState = GXv_SdtWWPGridState13[0] ;
         if ( Cond_result )
         {
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV51Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
         }
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( AV33Emprcod, httpContext.getMessage( "MODA21", "")) == 0 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtGuiFasPMt_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtGuiFasPMt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasPMt_Visible), 5, 0), !bGXsfl_17_Refreshing);
         GXv_SdtWWPGridState13[0] = AV10GridState;
         if ( new app.wwpbaseobjects.wwp_deletefilter(remoteHandle, context).executeUdp( GXv_SdtWWPGridState13, "TFGUIFASPMT", false) )
         {
            Cond_result = true ;
         }
         else
         {
            Cond_result = false ;
         }
         AV10GridState = GXv_SdtWWPGridState13[0] ;
         if ( Cond_result )
         {
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV51Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
         }
      }
   }

   public void wb_table1_34_29I2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_eliminar_Internalname, tblTabledvelop_confirmpanel_eliminar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_eliminar.setProperty("Title", Dvelop_confirmpanel_eliminar_Title);
         ucDvelop_confirmpanel_eliminar.setProperty("ConfirmationText", Dvelop_confirmpanel_eliminar_Confirmationtext);
         ucDvelop_confirmpanel_eliminar.setProperty("YesButtonCaption", Dvelop_confirmpanel_eliminar_Yesbuttoncaption);
         ucDvelop_confirmpanel_eliminar.setProperty("NoButtonCaption", Dvelop_confirmpanel_eliminar_Nobuttoncaption);
         ucDvelop_confirmpanel_eliminar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_eliminar_Cancelbuttoncaption);
         ucDvelop_confirmpanel_eliminar.setProperty("YesButtonPosition", Dvelop_confirmpanel_eliminar_Yesbuttonposition);
         ucDvelop_confirmpanel_eliminar.setProperty("ConfirmType", Dvelop_confirmpanel_eliminar_Confirmtype);
         ucDvelop_confirmpanel_eliminar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_eliminar_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_34_29I2e( true) ;
      }
      else
      {
         wb_table1_34_29I2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV33Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33Emprcod", AV33Emprcod);
      AV34Albprocod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34Albprocod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Albprocod), 10, 0));
      AV35Barcod = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35Barcod), 8, 0));
      AV36Barcodreo = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36Barcodreo", GXutil.str( AV36Barcodreo, 1, 0));
      AV37Barcodpar = (String)getParm(obj,4,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37Barcodpar", AV37Barcodpar);
      AV46AlbEnvFtp = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46AlbEnvFtp", GXutil.str( AV46AlbEnvFtp, 1, 0));
      AV47AlbLic = (String)getParm(obj,6,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47AlbLic", AV47AlbLic);
      AV48AlbProEst = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48AlbProEst", GXutil.str( AV48AlbProEst, 1, 0));
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
      pa29I2( ) ;
      ws29I2( ) ;
      we29I2( ) ;
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
      sCtrlAV33Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV34Albprocod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV35Barcod = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV36Barcodreo = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV37Barcodpar = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV46AlbEnvFtp = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV47AlbLic = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV48AlbProEst = (String)getParm(obj,7,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa29I2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "documentotransporteproduccion\\documentodetransporteproduccion_4_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa29I2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV33Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33Emprcod", AV33Emprcod);
         AV34Albprocod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34Albprocod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Albprocod), 10, 0));
         AV35Barcod = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35Barcod), 8, 0));
         AV36Barcodreo = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36Barcodreo", GXutil.str( AV36Barcodreo, 1, 0));
         AV37Barcodpar = (String)getParm(obj,6,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37Barcodpar", AV37Barcodpar);
         AV46AlbEnvFtp = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46AlbEnvFtp", GXutil.str( AV46AlbEnvFtp, 1, 0));
         AV47AlbLic = (String)getParm(obj,8,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47AlbLic", AV47AlbLic);
         AV48AlbProEst = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48AlbProEst", GXutil.str( AV48AlbProEst, 1, 0));
      }
      wcpOAV33Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV33Emprcod") ;
      wcpOAV34Albprocod = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV34Albprocod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      wcpOAV35Barcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV35Barcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV36Barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV36Barcodreo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV37Barcodpar = httpContext.cgiGet( sPrefix+"wcpOAV37Barcodpar") ;
      wcpOAV46AlbEnvFtp = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV46AlbEnvFtp"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV47AlbLic = httpContext.cgiGet( sPrefix+"wcpOAV47AlbLic") ;
      wcpOAV48AlbProEst = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV48AlbProEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV33Emprcod, wcpOAV33Emprcod) != 0 ) || ( AV34Albprocod != wcpOAV34Albprocod ) || ( AV35Barcod != wcpOAV35Barcod ) || ( AV36Barcodreo != wcpOAV36Barcodreo ) || ( GXutil.strcmp(AV37Barcodpar, wcpOAV37Barcodpar) != 0 ) || ( AV46AlbEnvFtp != wcpOAV46AlbEnvFtp ) || ( GXutil.strcmp(AV47AlbLic, wcpOAV47AlbLic) != 0 ) || ( AV48AlbProEst != wcpOAV48AlbProEst ) ) )
      {
         setjustcreated();
      }
      wcpOAV33Emprcod = AV33Emprcod ;
      wcpOAV34Albprocod = AV34Albprocod ;
      wcpOAV35Barcod = AV35Barcod ;
      wcpOAV36Barcodreo = AV36Barcodreo ;
      wcpOAV37Barcodpar = AV37Barcodpar ;
      wcpOAV46AlbEnvFtp = AV46AlbEnvFtp ;
      wcpOAV47AlbLic = AV47AlbLic ;
      wcpOAV48AlbProEst = AV48AlbProEst ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV33Emprcod = httpContext.cgiGet( sPrefix+"AV33Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV33Emprcod) > 0 )
      {
         AV33Emprcod = httpContext.cgiGet( sCtrlAV33Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33Emprcod", AV33Emprcod);
      }
      else
      {
         AV33Emprcod = httpContext.cgiGet( sPrefix+"AV33Emprcod_PARM") ;
      }
      sCtrlAV34Albprocod = httpContext.cgiGet( sPrefix+"AV34Albprocod_CTRL") ;
      if ( GXutil.len( sCtrlAV34Albprocod) > 0 )
      {
         AV34Albprocod = localUtil.ctol( httpContext.cgiGet( sCtrlAV34Albprocod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34Albprocod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Albprocod), 10, 0));
      }
      else
      {
         AV34Albprocod = localUtil.ctol( httpContext.cgiGet( sPrefix+"AV34Albprocod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      }
      sCtrlAV35Barcod = httpContext.cgiGet( sPrefix+"AV35Barcod_CTRL") ;
      if ( GXutil.len( sCtrlAV35Barcod) > 0 )
      {
         AV35Barcod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV35Barcod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35Barcod), 8, 0));
      }
      else
      {
         AV35Barcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV35Barcod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV36Barcodreo = httpContext.cgiGet( sPrefix+"AV36Barcodreo_CTRL") ;
      if ( GXutil.len( sCtrlAV36Barcodreo) > 0 )
      {
         AV36Barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV36Barcodreo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36Barcodreo", GXutil.str( AV36Barcodreo, 1, 0));
      }
      else
      {
         AV36Barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV36Barcodreo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV37Barcodpar = httpContext.cgiGet( sPrefix+"AV37Barcodpar_CTRL") ;
      if ( GXutil.len( sCtrlAV37Barcodpar) > 0 )
      {
         AV37Barcodpar = httpContext.cgiGet( sCtrlAV37Barcodpar) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37Barcodpar", AV37Barcodpar);
      }
      else
      {
         AV37Barcodpar = httpContext.cgiGet( sPrefix+"AV37Barcodpar_PARM") ;
      }
      sCtrlAV46AlbEnvFtp = httpContext.cgiGet( sPrefix+"AV46AlbEnvFtp_CTRL") ;
      if ( GXutil.len( sCtrlAV46AlbEnvFtp) > 0 )
      {
         AV46AlbEnvFtp = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV46AlbEnvFtp), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46AlbEnvFtp", GXutil.str( AV46AlbEnvFtp, 1, 0));
      }
      else
      {
         AV46AlbEnvFtp = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV46AlbEnvFtp_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV47AlbLic = httpContext.cgiGet( sPrefix+"AV47AlbLic_CTRL") ;
      if ( GXutil.len( sCtrlAV47AlbLic) > 0 )
      {
         AV47AlbLic = httpContext.cgiGet( sCtrlAV47AlbLic) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47AlbLic", AV47AlbLic);
      }
      else
      {
         AV47AlbLic = httpContext.cgiGet( sPrefix+"AV47AlbLic_PARM") ;
      }
      sCtrlAV48AlbProEst = httpContext.cgiGet( sPrefix+"AV48AlbProEst_CTRL") ;
      if ( GXutil.len( sCtrlAV48AlbProEst) > 0 )
      {
         AV48AlbProEst = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV48AlbProEst), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48AlbProEst", GXutil.str( AV48AlbProEst, 1, 0));
      }
      else
      {
         AV48AlbProEst = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV48AlbProEst_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa29I2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws29I2( ) ;
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
      ws29I2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV33Emprcod_PARM", GXutil.rtrim( AV33Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV33Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV33Emprcod_CTRL", GXutil.rtrim( sCtrlAV33Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV34Albprocod_PARM", GXutil.ltrim( localUtil.ntoc( AV34Albprocod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV34Albprocod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV34Albprocod_CTRL", GXutil.rtrim( sCtrlAV34Albprocod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV35Barcod_PARM", GXutil.ltrim( localUtil.ntoc( AV35Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV35Barcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV35Barcod_CTRL", GXutil.rtrim( sCtrlAV35Barcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV36Barcodreo_PARM", GXutil.ltrim( localUtil.ntoc( AV36Barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV36Barcodreo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV36Barcodreo_CTRL", GXutil.rtrim( sCtrlAV36Barcodreo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV37Barcodpar_PARM", GXutil.rtrim( AV37Barcodpar));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV37Barcodpar)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV37Barcodpar_CTRL", GXutil.rtrim( sCtrlAV37Barcodpar));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV46AlbEnvFtp_PARM", GXutil.ltrim( localUtil.ntoc( AV46AlbEnvFtp, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV46AlbEnvFtp)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV46AlbEnvFtp_CTRL", GXutil.rtrim( sCtrlAV46AlbEnvFtp));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV47AlbLic_PARM", GXutil.rtrim( AV47AlbLic));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV47AlbLic)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV47AlbLic_CTRL", GXutil.rtrim( sCtrlAV47AlbLic));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV48AlbProEst_PARM", GXutil.ltrim( localUtil.ntoc( AV48AlbProEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV48AlbProEst)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV48AlbProEst_CTRL", GXutil.rtrim( sCtrlAV48AlbProEst));
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
      we29I2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115552564", true, true);
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
      httpContext.AddJavascriptSource("documentotransporteproduccion/documentodetransporteproduccion_4_wc.js", "?202682115552564", false, true);
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

   public void subsflControlProps_172( )
   {
      cmbavGridactiongroup1.setInternalname( sPrefix+"vGRIDACTIONGROUP1_"+sGXsfl_17_idx );
      edtGuiFasLin_Internalname = sPrefix+"GUIFASLIN_"+sGXsfl_17_idx ;
      edtFasCod_Internalname = sPrefix+"FASCOD_"+sGXsfl_17_idx ;
      edtFasDsc_Internalname = sPrefix+"FASDSC_"+sGXsfl_17_idx ;
      edtFasKgm_Internalname = sPrefix+"FASKGM_"+sGXsfl_17_idx ;
      edtGuiFasPKg_Internalname = sPrefix+"GUIFASPKG_"+sGXsfl_17_idx ;
      edtFasMtr_Internalname = sPrefix+"FASMTR_"+sGXsfl_17_idx ;
      edtGuiFasPMt_Internalname = sPrefix+"GUIFASPMT_"+sGXsfl_17_idx ;
   }

   public void subsflControlProps_fel_172( )
   {
      cmbavGridactiongroup1.setInternalname( sPrefix+"vGRIDACTIONGROUP1_"+sGXsfl_17_fel_idx );
      edtGuiFasLin_Internalname = sPrefix+"GUIFASLIN_"+sGXsfl_17_fel_idx ;
      edtFasCod_Internalname = sPrefix+"FASCOD_"+sGXsfl_17_fel_idx ;
      edtFasDsc_Internalname = sPrefix+"FASDSC_"+sGXsfl_17_fel_idx ;
      edtFasKgm_Internalname = sPrefix+"FASKGM_"+sGXsfl_17_fel_idx ;
      edtGuiFasPKg_Internalname = sPrefix+"GUIFASPKG_"+sGXsfl_17_fel_idx ;
      edtFasMtr_Internalname = sPrefix+"FASMTR_"+sGXsfl_17_fel_idx ;
      edtGuiFasPMt_Internalname = sPrefix+"GUIFASPMT_"+sGXsfl_17_fel_idx ;
   }

   public void sendrow_172( )
   {
      subsflControlProps_172( ) ;
      wb29I0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_17_idx - GRID_nFirstRecordOnPage <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            httpContext.writeText( " class=\""+"GridNoBorder WorkWithSelection WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_17_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactiongroup1.getEnabled()!=0)&&(cmbavGridactiongroup1.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 18,'"+sPrefix+"',false,'"+sGXsfl_17_idx+"',17)\"" : " ") ;
         if ( ( cmbavGridactiongroup1.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONGROUP1_" + sGXsfl_17_idx ;
            cmbavGridactiongroup1.setName( GXCCtl );
            cmbavGridactiongroup1.setWebtags( "" );
            if ( cmbavGridactiongroup1.getItemCount() > 0 )
            {
               AV41GridActionGroup1 = (short)(GXutil.lval( cmbavGridactiongroup1.getValidValue(GXutil.trim( GXutil.str( AV41GridActionGroup1, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41GridActionGroup1), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactiongroup1,cmbavGridactiongroup1.getInternalname(),GXutil.trim( GXutil.str( AV41GridActionGroup1, 4, 0)),Integer.valueOf(1),cmbavGridactiongroup1.getJsonclick(),Integer.valueOf(5),"'"+sPrefix+"'"+",false,"+"'"+sPrefix+"EVGRIDACTIONGROUP1.CLICK."+sGXsfl_17_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactiongroup1.getEnabled()!=0)&&(cmbavGridactiongroup1.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,18);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV41GridActionGroup1, 4, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGridactiongroup1.getInternalname(), "Values", cmbavGridactiongroup1.ToJavascriptSource(), !bGXsfl_17_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "WWActionColumn" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGuiFasLin_Internalname,GXutil.ltrim( localUtil.ntoc( A1240GuiFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1240GuiFasLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtGuiFasLin_Jsonclick,Integer.valueOf(0),"WWActionColumn","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "AttributeWidth100Porc" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasCod_Internalname,GXutil.rtrim( A457FasCod),GXutil.rtrim( localUtil.format( A457FasCod, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtFasCod_Jsonclick,Integer.valueOf(0),"AttributeWidth100Porc","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasDsc_Internalname,GXutil.rtrim( A460FasDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtFasDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A1275FasKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1275FasKgm, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtFasKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtGuiFasPKg_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGuiFasPKg_Internalname,GXutil.ltrim( localUtil.ntoc( A1241GuiFasPKg, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1241GuiFasPKg, "ZZZZZZ9.999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtGuiFasPKg_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtGuiFasPKg_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A1276FasMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1276FasMtr, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtFasMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtGuiFasPMt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGuiFasPMt_Internalname,GXutil.ltrim( localUtil.ntoc( A1242GuiFasPMt, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1242GuiFasPMt, "ZZZZZZ9.999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtGuiFasPMt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtGuiFasPMt_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes29I2( ) ;
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
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"17\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridNoBorder WorkWithSelection WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"WWActionColumn"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"AttributeWidth100Porc"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtGuiFasPKg_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Precio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtGuiFasPMt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Precio", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWithSelection WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV41GridActionGroup1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1240GuiFasLin, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A457FasCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A460FasDsc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1275FasKgm, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1241GuiFasPKg, (byte)(13), (byte)(5), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtGuiFasPKg_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1276FasMtr, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1242GuiFasPMt, (byte)(13), (byte)(5), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtGuiFasPMt_Visible, (byte)(5), (byte)(0), ".", "")));
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
      lblTbmessage_Internalname = sPrefix+"TBMESSAGE" ;
      cmbavGridactiongroup1.setInternalname( sPrefix+"vGRIDACTIONGROUP1" );
      edtGuiFasLin_Internalname = sPrefix+"GUIFASLIN" ;
      edtFasCod_Internalname = sPrefix+"FASCOD" ;
      edtFasDsc_Internalname = sPrefix+"FASDSC" ;
      edtFasKgm_Internalname = sPrefix+"FASKGM" ;
      edtGuiFasPKg_Internalname = sPrefix+"GUIFASPKG" ;
      edtFasMtr_Internalname = sPrefix+"FASMTR" ;
      edtGuiFasPMt_Internalname = sPrefix+"GUIFASPMT" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Dvelop_confirmpanel_eliminar_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR" ;
      tblTabledvelop_confirmpanel_eliminar_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_ELIMINAR" ;
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
      subGrid_Allowhovering = (byte)(-1) ;
      subGrid_Allowselection = (byte)(1) ;
      subGrid_Header = "" ;
      edtGuiFasPMt_Jsonclick = "" ;
      edtFasMtr_Jsonclick = "" ;
      edtGuiFasPKg_Jsonclick = "" ;
      edtFasKgm_Jsonclick = "" ;
      edtFasDsc_Jsonclick = "" ;
      edtFasCod_Jsonclick = "" ;
      edtGuiFasLin_Jsonclick = "" ;
      cmbavGridactiongroup1.setJsonclick( "" );
      cmbavGridactiongroup1.setVisible( -1 );
      cmbavGridactiongroup1.setEnabled( 1 );
      subGrid_Class = "GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      lblTbmessage_Caption = "  " ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Infinitescrolling = "Form" ;
      Dvelop_confirmpanel_eliminar_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminar_Confirmationtext = "¿Desea eliminar la linea?" ;
      Dvelop_confirmpanel_eliminar_Title = "" ;
      Ddo_grid_Datalistproc = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_4_WCGetFilterData" ;
      Ddo_grid_Datalisttype = "|Dynamic|Dynamic||||" ;
      Ddo_grid_Includedatalist = "|T|T||||" ;
      Ddo_grid_Filterisrange = "T|||T|T|T|T" ;
      Ddo_grid_Filtertype = "Numeric|Character|Character|Numeric|Numeric|Numeric|Numeric" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|7|8" ;
      Ddo_grid_Columnids = "1:GuiFasLin|2:FasCod|3:FasDsc|4:FasKgm|5:GuiFasPKg|6:FasMtr|7:GuiFasPMt" ;
      Ddo_grid_Gridinternalname = "" ;
      edtGuiFasPMt_Visible = -1 ;
      edtGuiFasPKg_Visible = -1 ;
      subGrid_Rows = 50 ;
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
      GXCCtl = "vGRIDACTIONGROUP1_" + sGXsfl_17_idx ;
      cmbavGridactiongroup1.setName( GXCCtl );
      cmbavGridactiongroup1.setWebtags( "" );
      if ( cmbavGridactiongroup1.getItemCount() > 0 )
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'edtGuiFasPKg_Visible',ctrl:'GUIFASPKG',prop:'Visible'},{av:'edtGuiFasPMt_Visible',ctrl:'GUIFASPMT',prop:'Visible'},{av:'sPrefix'},{av:'AV16TFGuiFasLin',fld:'vTFGUIFASLIN',pic:'ZZZ9'},{av:'AV17TFGuiFasLin_To',fld:'vTFGUIFASLIN_TO',pic:'ZZZ9'},{av:'AV18TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV19TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV20TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV21TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV22TFFasKgm',fld:'vTFFASKGM',pic:'ZZZZZ9.99'},{av:'AV23TFFasKgm_To',fld:'vTFFASKGM_TO',pic:'ZZZZZ9.99'},{av:'AV24TFGuiFasPKg',fld:'vTFGUIFASPKG',pic:'ZZZZZZ9.999'},{av:'AV25TFGuiFasPKg_To',fld:'vTFGUIFASPKG_TO',pic:'ZZZZZZ9.999'},{av:'AV26TFFasMtr',fld:'vTFFASMTR',pic:'ZZZZZ9.99'},{av:'AV27TFFasMtr_To',fld:'vTFFASMTR_TO',pic:'ZZZZZ9.99'},{av:'AV28TFGuiFasPMt',fld:'vTFGUIFASPMT',pic:'ZZZZZZ9.999'},{av:'AV29TFGuiFasPMt_To',fld:'vTFGUIFASPMT_TO',pic:'ZZZZZZ9.999'},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV33Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV34Albprocod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV35Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV36Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV37Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV46AlbEnvFtp',fld:'vALBENVFTP',pic:'9'},{av:'AV47AlbLic',fld:'vALBLIC',pic:''},{av:'AV48AlbProEst',fld:'vALBPROEST',pic:'9'},{av:'AV43ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:'',hsh:true},{av:'AV51Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e1129I2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV33Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV34Albprocod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV35Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV36Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV37Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV16TFGuiFasLin',fld:'vTFGUIFASLIN',pic:'ZZZ9'},{av:'AV17TFGuiFasLin_To',fld:'vTFGUIFASLIN_TO',pic:'ZZZ9'},{av:'AV18TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV19TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV20TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV21TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV22TFFasKgm',fld:'vTFFASKGM',pic:'ZZZZZ9.99'},{av:'AV23TFFasKgm_To',fld:'vTFFASKGM_TO',pic:'ZZZZZ9.99'},{av:'AV24TFGuiFasPKg',fld:'vTFGUIFASPKG',pic:'ZZZZZZ9.999'},{av:'AV25TFGuiFasPKg_To',fld:'vTFGUIFASPKG_TO',pic:'ZZZZZZ9.999'},{av:'AV26TFFasMtr',fld:'vTFFASMTR',pic:'ZZZZZ9.99'},{av:'AV27TFFasMtr_To',fld:'vTFFASMTR_TO',pic:'ZZZZZ9.99'},{av:'AV28TFGuiFasPMt',fld:'vTFGUIFASPMT',pic:'ZZZZZZ9.999'},{av:'AV29TFGuiFasPMt_To',fld:'vTFGUIFASPMT_TO',pic:'ZZZZZZ9.999'},{av:'AV51Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV46AlbEnvFtp',fld:'vALBENVFTP',pic:'9'},{av:'AV47AlbLic',fld:'vALBLIC',pic:''},{av:'AV48AlbProEst',fld:'vALBPROEST',pic:'9'},{av:'edtGuiFasPKg_Visible',ctrl:'GUIFASPKG',prop:'Visible'},{av:'edtGuiFasPMt_Visible',ctrl:'GUIFASPMT',prop:'Visible'},{av:'AV43ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:'',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV28TFGuiFasPMt',fld:'vTFGUIFASPMT',pic:'ZZZZZZ9.999'},{av:'AV29TFGuiFasPMt_To',fld:'vTFGUIFASPMT_TO',pic:'ZZZZZZ9.999'},{av:'AV26TFFasMtr',fld:'vTFFASMTR',pic:'ZZZZZ9.99'},{av:'AV27TFFasMtr_To',fld:'vTFFASMTR_TO',pic:'ZZZZZ9.99'},{av:'AV24TFGuiFasPKg',fld:'vTFGUIFASPKG',pic:'ZZZZZZ9.999'},{av:'AV25TFGuiFasPKg_To',fld:'vTFGUIFASPKG_TO',pic:'ZZZZZZ9.999'},{av:'AV22TFFasKgm',fld:'vTFFASKGM',pic:'ZZZZZ9.99'},{av:'AV23TFFasKgm_To',fld:'vTFFASKGM_TO',pic:'ZZZZZ9.99'},{av:'AV20TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV21TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV18TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV19TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV16TFGuiFasLin',fld:'vTFGUIFASLIN',pic:'ZZZ9'},{av:'AV17TFGuiFasLin_To',fld:'vTFGUIFASLIN_TO',pic:'ZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e1529I2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactiongroup1'},{av:'AV41GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'}]}");
      setEventMetadata("VGRIDACTIONGROUP1.CLICK","{handler:'e1629I2',iparms:[{av:'cmbavGridactiongroup1'},{av:'AV41GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV33Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV34Albprocod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV35Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV36Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV37Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV16TFGuiFasLin',fld:'vTFGUIFASLIN',pic:'ZZZ9'},{av:'AV17TFGuiFasLin_To',fld:'vTFGUIFASLIN_TO',pic:'ZZZ9'},{av:'AV18TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV19TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV20TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV21TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV22TFFasKgm',fld:'vTFFASKGM',pic:'ZZZZZ9.99'},{av:'AV23TFFasKgm_To',fld:'vTFFASKGM_TO',pic:'ZZZZZ9.99'},{av:'AV24TFGuiFasPKg',fld:'vTFGUIFASPKG',pic:'ZZZZZZ9.999'},{av:'AV25TFGuiFasPKg_To',fld:'vTFGUIFASPKG_TO',pic:'ZZZZZZ9.999'},{av:'AV26TFFasMtr',fld:'vTFFASMTR',pic:'ZZZZZ9.99'},{av:'AV27TFFasMtr_To',fld:'vTFFASMTR_TO',pic:'ZZZZZ9.99'},{av:'AV28TFGuiFasPMt',fld:'vTFGUIFASPMT',pic:'ZZZZZZ9.999'},{av:'AV29TFGuiFasPMt_To',fld:'vTFGUIFASPMT_TO',pic:'ZZZZZZ9.999'},{av:'AV51Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV46AlbEnvFtp',fld:'vALBENVFTP',pic:'9'},{av:'AV47AlbLic',fld:'vALBLIC',pic:''},{av:'AV48AlbProEst',fld:'vALBPROEST',pic:'9'},{av:'edtGuiFasPKg_Visible',ctrl:'GUIFASPKG',prop:'Visible'},{av:'edtGuiFasPMt_Visible',ctrl:'GUIFASPMT',prop:'Visible'},{av:'AV43ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:'',hsh:true},{av:'sPrefix'},{av:'A1240GuiFasLin',fld:'GUIFASLIN',pic:'ZZZ9',hsh:true},{av:'A457FasCod',fld:'FASCOD',pic:'@!',hsh:true},{av:'A460FasDsc',fld:'FASDSC',pic:'',hsh:true}]");
      setEventMetadata("VGRIDACTIONGROUP1.CLICK",",oparms:[{av:'cmbavGridactiongroup1'},{av:'AV41GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE","{handler:'e1229I2',iparms:[{av:'Dvelop_confirmpanel_eliminar_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINAR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV33Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV34Albprocod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV35Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV36Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV37Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV16TFGuiFasLin',fld:'vTFGUIFASLIN',pic:'ZZZ9'},{av:'AV17TFGuiFasLin_To',fld:'vTFGUIFASLIN_TO',pic:'ZZZ9'},{av:'AV18TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV19TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV20TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV21TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV22TFFasKgm',fld:'vTFFASKGM',pic:'ZZZZZ9.99'},{av:'AV23TFFasKgm_To',fld:'vTFFASKGM_TO',pic:'ZZZZZ9.99'},{av:'AV24TFGuiFasPKg',fld:'vTFGUIFASPKG',pic:'ZZZZZZ9.999'},{av:'AV25TFGuiFasPKg_To',fld:'vTFGUIFASPKG_TO',pic:'ZZZZZZ9.999'},{av:'AV26TFFasMtr',fld:'vTFFASMTR',pic:'ZZZZZ9.99'},{av:'AV27TFFasMtr_To',fld:'vTFFASMTR_TO',pic:'ZZZZZ9.99'},{av:'AV28TFGuiFasPMt',fld:'vTFGUIFASPMT',pic:'ZZZZZZ9.999'},{av:'AV29TFGuiFasPMt_To',fld:'vTFGUIFASPMT_TO',pic:'ZZZZZZ9.999'},{av:'AV51Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV46AlbEnvFtp',fld:'vALBENVFTP',pic:'9'},{av:'AV47AlbLic',fld:'vALBLIC',pic:''},{av:'AV48AlbProEst',fld:'vALBPROEST',pic:'9'},{av:'edtGuiFasPKg_Visible',ctrl:'GUIFASPKG',prop:'Visible'},{av:'edtGuiFasPMt_Visible',ctrl:'GUIFASPMT',prop:'Visible'},{av:'AV43ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:'',hsh:true},{av:'sPrefix'},{av:'A1240GuiFasLin',fld:'GUIFASLIN',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE",",oparms:[]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'edtGuiFasPKg_Visible',ctrl:'GUIFASPKG',prop:'Visible'},{av:'edtGuiFasPMt_Visible',ctrl:'GUIFASPMT',prop:'Visible'},{av:'AV43ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:'',hsh:true},{av:'sPrefix'},{av:'AV16TFGuiFasLin',fld:'vTFGUIFASLIN',pic:'ZZZ9'},{av:'AV17TFGuiFasLin_To',fld:'vTFGUIFASLIN_TO',pic:'ZZZ9'},{av:'AV18TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV19TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV20TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV21TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV22TFFasKgm',fld:'vTFFASKGM',pic:'ZZZZZ9.99'},{av:'AV23TFFasKgm_To',fld:'vTFFASKGM_TO',pic:'ZZZZZ9.99'},{av:'AV24TFGuiFasPKg',fld:'vTFGUIFASPKG',pic:'ZZZZZZ9.999'},{av:'AV25TFGuiFasPKg_To',fld:'vTFGUIFASPKG_TO',pic:'ZZZZZZ9.999'},{av:'AV26TFFasMtr',fld:'vTFFASMTR',pic:'ZZZZZ9.99'},{av:'AV27TFFasMtr_To',fld:'vTFFASMTR_TO',pic:'ZZZZZ9.99'},{av:'AV28TFGuiFasPMt',fld:'vTFGUIFASPMT',pic:'ZZZZZZ9.999'},{av:'AV29TFGuiFasPMt_To',fld:'vTFGUIFASPMT_TO',pic:'ZZZZZZ9.999'},{av:'AV51Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV33Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV34Albprocod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV35Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV36Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV37Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV46AlbEnvFtp',fld:'vALBENVFTP',pic:'9'},{av:'AV47AlbLic',fld:'vALBLIC',pic:''},{av:'AV48AlbProEst',fld:'vALBPROEST',pic:'9'}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'edtGuiFasPKg_Visible',ctrl:'GUIFASPKG',prop:'Visible'},{av:'edtGuiFasPMt_Visible',ctrl:'GUIFASPMT',prop:'Visible'},{av:'AV43ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:'',hsh:true},{av:'sPrefix'},{av:'AV16TFGuiFasLin',fld:'vTFGUIFASLIN',pic:'ZZZ9'},{av:'AV17TFGuiFasLin_To',fld:'vTFGUIFASLIN_TO',pic:'ZZZ9'},{av:'AV18TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV19TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV20TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV21TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV22TFFasKgm',fld:'vTFFASKGM',pic:'ZZZZZ9.99'},{av:'AV23TFFasKgm_To',fld:'vTFFASKGM_TO',pic:'ZZZZZ9.99'},{av:'AV24TFGuiFasPKg',fld:'vTFGUIFASPKG',pic:'ZZZZZZ9.999'},{av:'AV25TFGuiFasPKg_To',fld:'vTFGUIFASPKG_TO',pic:'ZZZZZZ9.999'},{av:'AV26TFFasMtr',fld:'vTFFASMTR',pic:'ZZZZZ9.99'},{av:'AV27TFFasMtr_To',fld:'vTFFASMTR_TO',pic:'ZZZZZ9.99'},{av:'AV28TFGuiFasPMt',fld:'vTFGUIFASPMT',pic:'ZZZZZZ9.999'},{av:'AV29TFGuiFasPMt_To',fld:'vTFGUIFASPMT_TO',pic:'ZZZZZZ9.999'},{av:'AV51Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV33Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV34Albprocod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV35Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV36Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV37Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV46AlbEnvFtp',fld:'vALBENVFTP',pic:'9'},{av:'AV47AlbLic',fld:'vALBLIC',pic:''},{av:'AV48AlbProEst',fld:'vALBPROEST',pic:'9'}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'edtGuiFasPKg_Visible',ctrl:'GUIFASPKG',prop:'Visible'},{av:'edtGuiFasPMt_Visible',ctrl:'GUIFASPMT',prop:'Visible'},{av:'AV43ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:'',hsh:true},{av:'sPrefix'},{av:'AV16TFGuiFasLin',fld:'vTFGUIFASLIN',pic:'ZZZ9'},{av:'AV17TFGuiFasLin_To',fld:'vTFGUIFASLIN_TO',pic:'ZZZ9'},{av:'AV18TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV19TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV20TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV21TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV22TFFasKgm',fld:'vTFFASKGM',pic:'ZZZZZ9.99'},{av:'AV23TFFasKgm_To',fld:'vTFFASKGM_TO',pic:'ZZZZZ9.99'},{av:'AV24TFGuiFasPKg',fld:'vTFGUIFASPKG',pic:'ZZZZZZ9.999'},{av:'AV25TFGuiFasPKg_To',fld:'vTFGUIFASPKG_TO',pic:'ZZZZZZ9.999'},{av:'AV26TFFasMtr',fld:'vTFFASMTR',pic:'ZZZZZ9.99'},{av:'AV27TFFasMtr_To',fld:'vTFFASMTR_TO',pic:'ZZZZZ9.99'},{av:'AV28TFGuiFasPMt',fld:'vTFGUIFASPMT',pic:'ZZZZZZ9.999'},{av:'AV29TFGuiFasPMt_To',fld:'vTFGUIFASPMT_TO',pic:'ZZZZZZ9.999'},{av:'AV51Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV33Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV34Albprocod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV35Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV36Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV37Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV46AlbEnvFtp',fld:'vALBENVFTP',pic:'9'},{av:'AV47AlbLic',fld:'vALBLIC',pic:''},{av:'AV48AlbProEst',fld:'vALBPROEST',pic:'9'}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'edtGuiFasPKg_Visible',ctrl:'GUIFASPKG',prop:'Visible'},{av:'edtGuiFasPMt_Visible',ctrl:'GUIFASPMT',prop:'Visible'},{av:'AV43ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:'',hsh:true},{av:'sPrefix'},{av:'AV16TFGuiFasLin',fld:'vTFGUIFASLIN',pic:'ZZZ9'},{av:'AV17TFGuiFasLin_To',fld:'vTFGUIFASLIN_TO',pic:'ZZZ9'},{av:'AV18TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV19TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV20TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV21TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV22TFFasKgm',fld:'vTFFASKGM',pic:'ZZZZZ9.99'},{av:'AV23TFFasKgm_To',fld:'vTFFASKGM_TO',pic:'ZZZZZ9.99'},{av:'AV24TFGuiFasPKg',fld:'vTFGUIFASPKG',pic:'ZZZZZZ9.999'},{av:'AV25TFGuiFasPKg_To',fld:'vTFGUIFASPKG_TO',pic:'ZZZZZZ9.999'},{av:'AV26TFFasMtr',fld:'vTFFASMTR',pic:'ZZZZZ9.99'},{av:'AV27TFFasMtr_To',fld:'vTFFASMTR_TO',pic:'ZZZZZ9.99'},{av:'AV28TFGuiFasPMt',fld:'vTFGUIFASPMT',pic:'ZZZZZZ9.999'},{av:'AV29TFGuiFasPMt_To',fld:'vTFGUIFASPMT_TO',pic:'ZZZZZZ9.999'},{av:'AV51Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV33Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV34Albprocod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV35Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV36Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV37Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV46AlbEnvFtp',fld:'vALBENVFTP',pic:'9'},{av:'AV47AlbLic',fld:'vALBLIC',pic:''},{av:'AV48AlbProEst',fld:'vALBPROEST',pic:'9'}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Guifaspmt',iparms:[]");
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
      wcpOAV33Emprcod = "" ;
      wcpOAV37Barcodpar = "" ;
      wcpOAV47AlbLic = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Dvelop_confirmpanel_eliminar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV33Emprcod = "" ;
      AV37Barcodpar = "" ;
      AV47AlbLic = "" ;
      AV18TFFasCod = "" ;
      AV19TFFasCod_Sel = "" ;
      AV20TFFasDsc = "" ;
      AV21TFFasDsc_Sel = "" ;
      AV22TFFasKgm = DecimalUtil.ZERO ;
      AV23TFFasKgm_To = DecimalUtil.ZERO ;
      AV24TFGuiFasPKg = DecimalUtil.ZERO ;
      AV25TFGuiFasPKg_To = DecimalUtil.ZERO ;
      AV26TFFasMtr = DecimalUtil.ZERO ;
      AV27TFFasMtr_To = DecimalUtil.ZERO ;
      AV28TFGuiFasPMt = DecimalUtil.ZERO ;
      AV29TFGuiFasPMt_To = DecimalUtil.ZERO ;
      AV51Pgmname = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV30DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      lblTbmessage_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV54Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_3_tffascod = "" ;
      AV55Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_4_tffascod_sel = "" ;
      AV56Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_5_tffasdsc = "" ;
      AV57Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_6_tffasdsc_sel = "" ;
      AV58Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_7_tffaskgm = DecimalUtil.ZERO ;
      AV59Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_8_tffaskgm_to = DecimalUtil.ZERO ;
      AV60Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_9_tfguifaspkg = DecimalUtil.ZERO ;
      AV61Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_10_tfguifaspkg_to = DecimalUtil.ZERO ;
      AV62Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_11_tffasmtr = DecimalUtil.ZERO ;
      AV63Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_12_tffasmtr_to = DecimalUtil.ZERO ;
      AV64Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_13_tfguifaspmt = DecimalUtil.ZERO ;
      AV65Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_14_tfguifaspmt_to = DecimalUtil.ZERO ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A1275FasKgm = DecimalUtil.ZERO ;
      A1241GuiFasPKg = DecimalUtil.ZERO ;
      A1276FasMtr = DecimalUtil.ZERO ;
      A1242GuiFasPMt = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      H029I2_A396EmprCod = new String[] {""} ;
      H029I2_A30AlbProCod = new long[1] ;
      H029I2_A129BarCod = new int[1] ;
      H029I2_A132BarCodReo = new byte[1] ;
      H029I2_A130BarCodPar = new String[] {""} ;
      H029I3_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV38Station = "" ;
      GXv_char2 = new String[1] ;
      AV39EmprNom = "" ;
      AV40UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      GXv_int8 = new byte[1] ;
      GXv_int10 = new int[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext11 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV66Emprcod_selected = "" ;
      AV70Barcodpar_selected = "" ;
      AV15Session = httpContext.getWebSession();
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char12 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char3 = new String[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      GXv_SdtWWPGridState13 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      ucDvelop_confirmpanel_eliminar = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV33Emprcod = "" ;
      sCtrlAV34Albprocod = "" ;
      sCtrlAV35Barcod = "" ;
      sCtrlAV36Barcodreo = "" ;
      sCtrlAV37Barcodpar = "" ;
      sCtrlAV46AlbEnvFtp = "" ;
      sCtrlAV47AlbLic = "" ;
      sCtrlAV48AlbProEst = "" ;
      subGrid_Linesclass = "" ;
      TempTags = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.documentodetransporteproduccion_4_wc__default(),
         new Object[] {
             new Object[] {
            H029I2_A396EmprCod, H029I2_A30AlbProCod, H029I2_A129BarCod, H029I2_A132BarCodReo, H029I2_A130BarCodPar
            }
            , new Object[] {
            H029I3_AGRID_nRecordCount
            }
         }
      );
      AV51Pgmname = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_4_WC" ;
      /* GeneXus formulas. */
      AV51Pgmname = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_4_WC" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV36Barcodreo ;
   private byte wcpOAV46AlbEnvFtp ;
   private byte wcpOAV48AlbProEst ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV36Barcodreo ;
   private byte AV46AlbEnvFtp ;
   private byte AV48AlbProEst ;
   private byte A132BarCodReo ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
   private byte AV69Barcodreo_selected ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV16TFGuiFasLin ;
   private short AV17TFGuiFasLin_To ;
   private short AV12OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV52Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_1_tfguifaslin ;
   private short AV53Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_2_tfguifaslin_to ;
   private short AV41GridActionGroup1 ;
   private short A1240GuiFasLin ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV42Moda21 ;
   private int wcpOAV35Barcod ;
   private int edtGuiFasPKg_Visible ;
   private int edtGuiFasPMt_Visible ;
   private int nRC_GXsfl_17 ;
   private int AV35Barcod ;
   private int subGrid_Rows ;
   private int nGXsfl_17_idx=1 ;
   private int AV43ContVal ;
   private int A129BarCod ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int GXt_int9 ;
   private int GXv_int10[] ;
   private int AV68Barcod_selected ;
   private int AV71GXV1 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long wcpOAV34Albprocod ;
   private long GRID_nFirstRecordOnPage ;
   private long AV34Albprocod ;
   private long A30AlbProCod ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private long AV67Albprocod_selected ;
   private java.math.BigDecimal AV22TFFasKgm ;
   private java.math.BigDecimal AV23TFFasKgm_To ;
   private java.math.BigDecimal AV24TFGuiFasPKg ;
   private java.math.BigDecimal AV25TFGuiFasPKg_To ;
   private java.math.BigDecimal AV26TFFasMtr ;
   private java.math.BigDecimal AV27TFFasMtr_To ;
   private java.math.BigDecimal AV28TFGuiFasPMt ;
   private java.math.BigDecimal AV29TFGuiFasPMt_To ;
   private java.math.BigDecimal AV58Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_7_tffaskgm ;
   private java.math.BigDecimal AV59Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_8_tffaskgm_to ;
   private java.math.BigDecimal AV60Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_9_tfguifaspkg ;
   private java.math.BigDecimal AV61Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_10_tfguifaspkg_to ;
   private java.math.BigDecimal AV62Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_11_tffasmtr ;
   private java.math.BigDecimal AV63Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_12_tffasmtr_to ;
   private java.math.BigDecimal AV64Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_13_tfguifaspmt ;
   private java.math.BigDecimal AV65Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_14_tfguifaspmt_to ;
   private java.math.BigDecimal A1275FasKgm ;
   private java.math.BigDecimal A1241GuiFasPKg ;
   private java.math.BigDecimal A1276FasMtr ;
   private java.math.BigDecimal A1242GuiFasPMt ;
   private String wcpOAV33Emprcod ;
   private String wcpOAV37Barcodpar ;
   private String wcpOAV47AlbLic ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Dvelop_confirmpanel_eliminar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV33Emprcod ;
   private String AV37Barcodpar ;
   private String AV47AlbLic ;
   private String sGXsfl_17_idx="0001" ;
   private String edtGuiFasPKg_Internalname ;
   private String edtGuiFasPMt_Internalname ;
   private String AV18TFFasCod ;
   private String AV19TFFasCod_Sel ;
   private String AV20TFFasDsc ;
   private String AV21TFFasDsc_Sel ;
   private String AV51Pgmname ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
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
   private String Dvelop_confirmpanel_eliminar_Title ;
   private String Dvelop_confirmpanel_eliminar_Confirmationtext ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_eliminar_Confirmtype ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Infinitescrolling ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String lblTbmessage_Internalname ;
   private String lblTbmessage_Caption ;
   private String lblTbmessage_Jsonclick ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV54Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_3_tffascod ;
   private String AV55Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_4_tffascod_sel ;
   private String AV56Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_5_tffasdsc ;
   private String AV57Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_6_tffasdsc_sel ;
   private String edtGuiFasLin_Internalname ;
   private String A457FasCod ;
   private String edtFasCod_Internalname ;
   private String A460FasDsc ;
   private String edtFasDsc_Internalname ;
   private String edtFasKgm_Internalname ;
   private String edtFasMtr_Internalname ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String hsh ;
   private String AV38Station ;
   private String GXv_char2[] ;
   private String AV39EmprNom ;
   private String AV40UsurCod ;
   private String AV66Emprcod_selected ;
   private String AV70Barcodpar_selected ;
   private String GXt_char12 ;
   private String GXv_char4[] ;
   private String GXt_char1 ;
   private String GXv_char3[] ;
   private String tblTabledvelop_confirmpanel_eliminar_Internalname ;
   private String Dvelop_confirmpanel_eliminar_Internalname ;
   private String sCtrlAV33Emprcod ;
   private String sCtrlAV34Albprocod ;
   private String sCtrlAV35Barcod ;
   private String sCtrlAV36Barcodreo ;
   private String sCtrlAV37Barcodpar ;
   private String sCtrlAV46AlbEnvFtp ;
   private String sCtrlAV47AlbLic ;
   private String sCtrlAV48AlbProEst ;
   private String sGXsfl_17_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String TempTags ;
   private String ROClassString ;
   private String edtGuiFasLin_Jsonclick ;
   private String edtFasCod_Jsonclick ;
   private String edtFasDsc_Jsonclick ;
   private String edtFasKgm_Jsonclick ;
   private String edtGuiFasPKg_Jsonclick ;
   private String edtFasMtr_Jsonclick ;
   private String edtGuiFasPMt_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean bGXsfl_17_Refreshing=false ;
   private boolean AV13OrderedDsc ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean Cond_result ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV15Session ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminar ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavGridactiongroup1 ;
   private IDataStoreProvider pr_default ;
   private String[] H029I2_A396EmprCod ;
   private long[] H029I2_A30AlbProCod ;
   private int[] H029I2_A129BarCod ;
   private byte[] H029I2_A132BarCodReo ;
   private String[] H029I2_A130BarCodPar ;
   private long[] H029I3_AGRID_nRecordCount ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext11[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState13[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV30DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class documentodetransporteproduccion_4_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H029I2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV52Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_1_tfguifaslin ,
                                          short AV53Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_2_tfguifaslin_to ,
                                          String AV55Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_4_tffascod_sel ,
                                          String AV54Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_3_tffascod ,
                                          String AV57Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_6_tffasdsc_sel ,
                                          String AV56Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_5_tffasdsc ,
                                          java.math.BigDecimal AV58Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_7_tffaskgm ,
                                          java.math.BigDecimal AV59Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_8_tffaskgm_to ,
                                          java.math.BigDecimal AV60Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_9_tfguifaspkg ,
                                          java.math.BigDecimal AV61Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_10_tfguifaspkg_to ,
                                          java.math.BigDecimal AV62Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_11_tffasmtr ,
                                          java.math.BigDecimal AV63Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_12_tffasmtr_to ,
                                          java.math.BigDecimal AV64Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_13_tfguifaspmt ,
                                          java.math.BigDecimal AV65Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_14_tfguifaspmt_to ,
                                          short A1240GuiFasLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          java.math.BigDecimal A1275FasKgm ,
                                          java.math.BigDecimal A1241GuiFasPKg ,
                                          java.math.BigDecimal A1276FasMtr ,
                                          java.math.BigDecimal A1242GuiFasPMt ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV33Emprcod ,
                                          long AV34Albprocod ,
                                          int AV35Barcod ,
                                          byte AV36Barcodreo ,
                                          String AV37Barcodpar ,
                                          String A396EmprCod ,
                                          long A30AlbProCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[10];
      Object[] GXv_Object15 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar" ;
      sFromString = " FROM TXPALBBAR" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)");
      if ( AV12OrderedBy == 1 )
      {
         sOrderString += " ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         sOrderString += "" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += "" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_H029I3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV52Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_1_tfguifaslin ,
                                          short AV53Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_2_tfguifaslin_to ,
                                          String AV55Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_4_tffascod_sel ,
                                          String AV54Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_3_tffascod ,
                                          String AV57Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_6_tffasdsc_sel ,
                                          String AV56Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_5_tffasdsc ,
                                          java.math.BigDecimal AV58Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_7_tffaskgm ,
                                          java.math.BigDecimal AV59Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_8_tffaskgm_to ,
                                          java.math.BigDecimal AV60Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_9_tfguifaspkg ,
                                          java.math.BigDecimal AV61Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_10_tfguifaspkg_to ,
                                          java.math.BigDecimal AV62Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_11_tffasmtr ,
                                          java.math.BigDecimal AV63Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_12_tffasmtr_to ,
                                          java.math.BigDecimal AV64Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_13_tfguifaspmt ,
                                          java.math.BigDecimal AV65Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_14_tfguifaspmt_to ,
                                          short A1240GuiFasLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          java.math.BigDecimal A1275FasKgm ,
                                          java.math.BigDecimal A1241GuiFasPKg ,
                                          java.math.BigDecimal A1276FasMtr ,
                                          java.math.BigDecimal A1242GuiFasPMt ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV33Emprcod ,
                                          long AV34Albprocod ,
                                          int AV35Barcod ,
                                          byte AV36Barcodreo ,
                                          String AV37Barcodpar ,
                                          String A396EmprCod ,
                                          long A30AlbProCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[5];
      Object[] GXv_Object17 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM TXPALBBAR" ;
      addWhere(sWhereString, "(EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)");
      scmdbuf += sWhereString ;
      if ( AV12OrderedBy == 1 )
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
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object17[0] = scmdbuf ;
      GXv_Object17[1] = GXv_int16 ;
      return GXv_Object17 ;
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
                  return conditional_H029I2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , ((Number) dynConstraints[21]).shortValue() , ((Boolean) dynConstraints[22]).booleanValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).longValue() , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).longValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] );
            case 1 :
                  return conditional_H029I3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , ((Number) dynConstraints[21]).shortValue() , ((Boolean) dynConstraints[22]).booleanValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).longValue() , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).longValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H029I2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H029I3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
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
                  stmt.setString(sIdx, (String)parms[10], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[11]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[13]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[5], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[6]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[7]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[8]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 1);
               }
               return;
      }
   }

}

