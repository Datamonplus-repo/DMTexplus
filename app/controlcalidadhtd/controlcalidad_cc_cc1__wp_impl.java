package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class controlcalidad_cc_cc1__wp_impl extends GXDataArea
{
   public controlcalidad_cc_cc1__wp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public controlcalidad_cc_cc1__wp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controlcalidad_cc_cc1__wp_impl.class ));
   }

   public controlcalidad_cc_cc1__wp_impl( int remoteHandle ,
                                          ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavGridactions = new HTMLChoice();
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridcontrolcalidad_cc1_sdts") == 0 )
         {
            gxnrgridcontrolcalidad_cc1_sdts_newrow_invoke( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Gridcontrolcalidad_cc1_sdts") == 0 )
         {
            gxgrgridcontrolcalidad_cc1_sdts_refresh_invoke( ) ;
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
            AV20EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20EmprCod", AV20EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20EmprCod, "@!"))));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV19Barcod = (int)(GXutil.lval( httpContext.GetPar( "Barcod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV19Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Barcod), 8, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV19Barcod), "ZZZZZZZ9")));
               AV18Barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Barcodreo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18Barcodreo", GXutil.str( AV18Barcodreo, 1, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18Barcodreo), "9")));
               AV17BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17BarCodPar", AV17BarCodPar);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17BarCodPar, ""))));
               AV26CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV26CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26CliCod), 6, 0));
               AV24CliNom = httpContext.GetPar( "CliNom") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV24CliNom", AV24CliNom);
               AV27BarSer = httpContext.GetPar( "BarSer") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV27BarSer", AV27BarSer);
               AV28BarSerDsc = httpContext.GetPar( "BarSerDsc") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV28BarSerDsc", AV28BarSerDsc);
               AV29BarColNom = httpContext.GetPar( "BarColNom") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV29BarColNom", AV29BarColNom);
               AV30BarColNum = (int)(GXutil.lval( httpContext.GetPar( "BarColNum"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV30BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30BarColNum), 6, 0));
               AV31BarKgm = CommonUtil.decimalVal( httpContext.GetPar( "BarKgm"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV31BarKgm", GXutil.ltrimstr( AV31BarKgm, 9, 2));
               AV32BarMtr = CommonUtil.decimalVal( httpContext.GetPar( "BarMtr"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV32BarMtr", GXutil.ltrimstr( AV32BarMtr, 9, 2));
               AV25BarPie = (int)(GXutil.lval( httpContext.GetPar( "BarPie"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV25BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25BarPie), 6, 0));
               AV33BarNHdr = httpContext.GetPar( "BarNHdr") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV33BarNHdr", AV33BarNHdr);
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
      nRC_GXsfl_87 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_87"))) ;
      nGXsfl_87_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_87_idx"))) ;
      sGXsfl_87_idx = httpContext.GetPar( "sGXsfl_87_idx") ;
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
      subGridcontrolcalidad_cc1_sdts_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGridcontrolcalidad_cc1_sdts_Rows"))) ;
      AV20EmprCod = httpContext.GetPar( "EmprCod") ;
      AV19Barcod = (int)(GXutil.lval( httpContext.GetPar( "Barcod"))) ;
      AV18Barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Barcodreo"))) ;
      AV17BarCodPar = httpContext.GetPar( "BarCodPar") ;
      AV77Pgmname = httpContext.GetPar( "Pgmname") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV12ControlCalidad_CC_CC1_SDT);
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, subGridcontrolcalidad_cc1_sdts_Rows, AV20EmprCod, AV19Barcod, AV18Barcodreo, AV17BarCodPar, AV77Pgmname, AV12ControlCalidad_CC_CC1_SDT) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void gxnrgridcontrolcalidad_cc1_sdts_newrow_invoke( )
   {
      nRC_GXsfl_116 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_116"))) ;
      nGXsfl_116_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_116_idx"))) ;
      sGXsfl_116_idx = httpContext.GetPar( "sGXsfl_116_idx") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridcontrolcalidad_cc1_sdts_newrow( ) ;
      /* End function gxnrGridcontrolcalidad_cc1_sdts_newrow_invoke */
   }

   public void gxgrgridcontrolcalidad_cc1_sdts_refresh_invoke( )
   {
      subGrid_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid_Rows"))) ;
      subGridcontrolcalidad_cc1_sdts_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGridcontrolcalidad_cc1_sdts_Rows"))) ;
      AV20EmprCod = httpContext.GetPar( "EmprCod") ;
      AV19Barcod = (int)(GXutil.lval( httpContext.GetPar( "Barcod"))) ;
      AV18Barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Barcodreo"))) ;
      AV17BarCodPar = httpContext.GetPar( "BarCodPar") ;
      AV77Pgmname = httpContext.GetPar( "Pgmname") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV12ControlCalidad_CC_CC1_SDT);
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgridcontrolcalidad_cc1_sdts_refresh( subGrid_Rows, subGridcontrolcalidad_cc1_sdts_Rows, AV20EmprCod, AV19Barcod, AV18Barcodreo, AV17BarCodPar, AV77Pgmname, AV12ControlCalidad_CC_CC1_SDT) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGridcontrolcalidad_cc1_sdts_refresh_invoke */
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
      pa2CB2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2CB2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"false\" data-Skiponenter=\"false\"" ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.controlcalidadhtd.controlcalidad_cc_cc1__wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV20EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV19Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV18Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV17BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV26CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV24CliNom)),GXutil.URLEncode(GXutil.rtrim(AV27BarSer)),GXutil.URLEncode(GXutil.rtrim(AV28BarSerDsc)),GXutil.URLEncode(GXutil.rtrim(AV29BarColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV30BarColNum,6,0)),GXutil.URLEncode(DecimalUtil.decToString(AV31BarKgm)),GXutil.URLEncode(DecimalUtil.decToString(AV32BarMtr)),GXutil.URLEncode(GXutil.ltrimstr(AV25BarPie,6,0)),GXutil.URLEncode(GXutil.rtrim(AV33BarNHdr))}, new String[] {"EmprCod","Barcod","Barcodreo","BarCodPar","CliCod","CliNom","BarSer","BarSerDsc","BarColNom","BarColNum","BarKgm","BarMtr","BarPie","BarNHdr"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTROLCALIDAD_CC_CC1_SDT", getSecureSignedToken( "", AV12ControlCalidad_CC_CC1_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV19Barcod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18Barcodreo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17BarCodPar, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"ControlCalidad_CC_CC1__WP");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV77Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("controlcalidadhtd\\controlcalidad_cc_cc1__wp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Controlcalidad_cc_cc1_sdt", AV12ControlCalidad_CC_CC1_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Controlcalidad_cc_cc1_sdt", AV12ControlCalidad_CC_CC1_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Controlcalidad_cc_cc1_sdt", getSecureSignedToken( "", AV12ControlCalidad_CC_CC1_SDT));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Controlcalidad_cc1_sdt", AV35ControlCalidad_CC1_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Controlcalidad_cc1_sdt", AV35ControlCalidad_CC1_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_87", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_87, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_116", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_116, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV15GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV16GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCONTROLCALIDAD_CC1_SDTSCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV36GridControlCalidad_CC1_SDTsCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCONTROLCALIDAD_CC1_SDTSPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV37GridControlCalidad_CC1_SDTsPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV20EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV19Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV19Barcod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV18Barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18Barcodreo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV17BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17BarCodPar, ""))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCONTROLCALIDAD_CC_CC1_SDT", AV12ControlCalidad_CC_CC1_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCONTROLCALIDAD_CC_CC1_SDT", AV12ControlCalidad_CC_CC1_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTROLCALIDAD_CC_CC1_SDT", getSecureSignedToken( "", AV12ControlCalidad_CC_CC1_SDT));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCONTROLCALIDAD_CC1_SDT", AV35ControlCalidad_CC1_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCONTROLCALIDAD_CC1_SDT", AV35ControlCalidad_CC1_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CC1_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDCONTROLCALIDAD_CC1_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CC1_SDTS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDCONTROLCALIDAD_CC1_SDTS_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CC1_SDTS_Rows", GXutil.ltrim( localUtil.ntoc( subGridcontrolcalidad_cc1_sdts_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Width", GXutil.rtrim( Dvpanel_tableheader_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Autowidth", GXutil.booltostr( Dvpanel_tableheader_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Autoheight", GXutil.booltostr( Dvpanel_tableheader_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Cls", GXutil.rtrim( Dvpanel_tableheader_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Title", GXutil.rtrim( Dvpanel_tableheader_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Collapsible", GXutil.booltostr( Dvpanel_tableheader_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Collapsed", GXutil.booltostr( Dvpanel_tableheader_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Showcollapseicon", GXutil.booltostr( Dvpanel_tableheader_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Iconposition", GXutil.rtrim( Dvpanel_tableheader_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Autoscroll", GXutil.booltostr( Dvpanel_tableheader_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Class", GXutil.rtrim( Gridpaginationbar_Class));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Showfirst", GXutil.booltostr( Gridpaginationbar_Showfirst));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Showprevious", GXutil.booltostr( Gridpaginationbar_Showprevious));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Shownext", GXutil.booltostr( Gridpaginationbar_Shownext));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Showlast", GXutil.booltostr( Gridpaginationbar_Showlast));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Pagestoshow", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Pagestoshow, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Pagingbuttonsposition", GXutil.rtrim( Gridpaginationbar_Pagingbuttonsposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Pagingcaptionposition", GXutil.rtrim( Gridpaginationbar_Pagingcaptionposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Emptygridclass", GXutil.rtrim( Gridpaginationbar_Emptygridclass));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselector", GXutil.booltostr( Gridpaginationbar_Rowsperpageselector));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageoptions", GXutil.rtrim( Gridpaginationbar_Rowsperpageoptions));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Previous", GXutil.rtrim( Gridpaginationbar_Previous));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Next", GXutil.rtrim( Gridpaginationbar_Next));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Caption", GXutil.rtrim( Gridpaginationbar_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Emptygridcaption", GXutil.rtrim( Gridpaginationbar_Emptygridcaption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpagecaption", GXutil.rtrim( Gridpaginationbar_Rowsperpagecaption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CC1_SDTSPAGINATIONBAR_Class", GXutil.rtrim( Gridcontrolcalidad_cc1_sdtspaginationbar_Class));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CC1_SDTSPAGINATIONBAR_Showfirst", GXutil.booltostr( Gridcontrolcalidad_cc1_sdtspaginationbar_Showfirst));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CC1_SDTSPAGINATIONBAR_Showprevious", GXutil.booltostr( Gridcontrolcalidad_cc1_sdtspaginationbar_Showprevious));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CC1_SDTSPAGINATIONBAR_Shownext", GXutil.booltostr( Gridcontrolcalidad_cc1_sdtspaginationbar_Shownext));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CC1_SDTSPAGINATIONBAR_Showlast", GXutil.booltostr( Gridcontrolcalidad_cc1_sdtspaginationbar_Showlast));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CC1_SDTSPAGINATIONBAR_Pagestoshow", GXutil.ltrim( localUtil.ntoc( Gridcontrolcalidad_cc1_sdtspaginationbar_Pagestoshow, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CC1_SDTSPAGINATIONBAR_Pagingbuttonsposition", GXutil.rtrim( Gridcontrolcalidad_cc1_sdtspaginationbar_Pagingbuttonsposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CC1_SDTSPAGINATIONBAR_Pagingcaptionposition", GXutil.rtrim( Gridcontrolcalidad_cc1_sdtspaginationbar_Pagingcaptionposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CC1_SDTSPAGINATIONBAR_Emptygridclass", GXutil.rtrim( Gridcontrolcalidad_cc1_sdtspaginationbar_Emptygridclass));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CC1_SDTSPAGINATIONBAR_Rowsperpageselector", GXutil.booltostr( Gridcontrolcalidad_cc1_sdtspaginationbar_Rowsperpageselector));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CC1_SDTSPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridcontrolcalidad_cc1_sdtspaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CC1_SDTSPAGINATIONBAR_Rowsperpageoptions", GXutil.rtrim( Gridcontrolcalidad_cc1_sdtspaginationbar_Rowsperpageoptions));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CC1_SDTSPAGINATIONBAR_Previous", GXutil.rtrim( Gridcontrolcalidad_cc1_sdtspaginationbar_Previous));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CC1_SDTSPAGINATIONBAR_Next", GXutil.rtrim( Gridcontrolcalidad_cc1_sdtspaginationbar_Next));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CC1_SDTSPAGINATIONBAR_Caption", GXutil.rtrim( Gridcontrolcalidad_cc1_sdtspaginationbar_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CC1_SDTSPAGINATIONBAR_Emptygridcaption", GXutil.rtrim( Gridcontrolcalidad_cc1_sdtspaginationbar_Emptygridcaption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CC1_SDTSPAGINATIONBAR_Rowsperpagecaption", GXutil.rtrim( Gridcontrolcalidad_cc1_sdtspaginationbar_Rowsperpagecaption));
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
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_TITLESCATEGORIES_Gridinternalname", GXutil.rtrim( Grid_titlescategories_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_TITLESCATEGORIES_Gridtitlescategories", GXutil.rtrim( Grid_titlescategories_Gridtitlescategories));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hascategories", GXutil.booltostr( Grid_empowerer_Hascategories));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Fixedcolumns", GXutil.rtrim( Grid_empowerer_Fixedcolumns));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CC1_SDTS_EMPOWERER_Gridinternalname", GXutil.rtrim( Gridcontrolcalidad_cc1_sdts_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CC1_SDTSPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridcontrolcalidad_cc1_sdtspaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CC1_SDTSPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridcontrolcalidad_cc1_sdtspaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CC1_SDTSPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridcontrolcalidad_cc1_sdtspaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CC1_SDTSPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridcontrolcalidad_cc1_sdtspaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
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
         we2CB2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2CB2( ) ;
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
      return formatLink("app.controlcalidadhtd.controlcalidad_cc_cc1__wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV20EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV19Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV18Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV17BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV26CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV24CliNom)),GXutil.URLEncode(GXutil.rtrim(AV27BarSer)),GXutil.URLEncode(GXutil.rtrim(AV28BarSerDsc)),GXutil.URLEncode(GXutil.rtrim(AV29BarColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV30BarColNum,6,0)),GXutil.URLEncode(DecimalUtil.decToString(AV31BarKgm)),GXutil.URLEncode(DecimalUtil.decToString(AV32BarMtr)),GXutil.URLEncode(GXutil.ltrimstr(AV25BarPie,6,0)),GXutil.URLEncode(GXutil.rtrim(AV33BarNHdr))}, new String[] {"EmprCod","Barcod","Barcodreo","BarCodPar","CliCod","CliNom","BarSer","BarSerDsc","BarColNom","BarColNum","BarKgm","BarMtr","BarPie","BarNHdr"})  ;
   }

   public String getPgmname( )
   {
      return "ControlCalidadHTD.ControlCalidad_CC_CC1__WP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Control de Calidad por Nº HDR ( Fases)", "") ;
   }

   public void wb2CB0( )
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
         ucDvpanel_tableheader.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tableheader_Internalname, "DVPANEL_TABLEHEADERContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TABLEHEADERContainer"+"TableHeader"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableheader_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarnhdr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarnhdr_Internalname, httpContext.getMessage( "N Hdr", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarnhdr_Internalname, GXutil.rtrim( AV33BarNHdr), GXutil.rtrim( localUtil.format( AV33BarNHdr, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarnhdr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarnhdr_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidad_CC_CC1__WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClicod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV26CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV26CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV26CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\ControlCalidad_CC_CC1__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClinom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClinom_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClinom_Internalname, GXutil.rtrim( AV24CliNom), GXutil.rtrim( localUtil.format( AV24CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClinom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClinom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidad_CC_CC1__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarser_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarser_Internalname, httpContext.getMessage( "Articulo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarser_Internalname, GXutil.rtrim( AV27BarSer), GXutil.rtrim( localUtil.format( AV27BarSer, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarser_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarser_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidad_CC_CC1__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarserdsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarserdsc_Internalname, httpContext.getMessage( "Descripción", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarserdsc_Internalname, GXutil.rtrim( AV28BarSerDsc), GXutil.rtrim( localUtil.format( AV28BarSerDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarserdsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarserdsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidad_CC_CC1__WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnom_Internalname, httpContext.getMessage( "Color", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnom_Internalname, GXutil.rtrim( AV29BarColNom), GXutil.rtrim( localUtil.format( AV29BarColNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidad_CC_CC1__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnum_Internalname, httpContext.getMessage( "Numero", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnum_Internalname, GXutil.ltrim( localUtil.ntoc( AV30BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV30BarColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV30BarColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\ControlCalidad_CC_CC1__WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarkgm_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarkgm_Internalname, httpContext.getMessage( "KIlos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarkgm_Internalname, GXutil.ltrim( localUtil.ntoc( AV31BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarkgm_Enabled!=0) ? localUtil.format( AV31BarKgm, "ZZZZZ9.99") : localUtil.format( AV31BarKgm, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarkgm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarkgm_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\ControlCalidad_CC_CC1__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarmtr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarmtr_Internalname, httpContext.getMessage( "Metros", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarmtr_Internalname, GXutil.ltrim( localUtil.ntoc( AV32BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarmtr_Enabled!=0) ? localUtil.format( AV32BarMtr, "ZZZZZ9.99") : localUtil.format( AV32BarMtr, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarmtr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarmtr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\ControlCalidad_CC_CC1__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarpie_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarpie_Internalname, httpContext.getMessage( "Piezas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarpie_Internalname, GXutil.ltrim( localUtil.ntoc( AV25BarPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarpie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV25BarPie), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV25BarPie), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarpie_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarpie_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\ControlCalidad_CC_CC1__WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTxtmensaje_Internalname, lblTxtmensaje_Caption, "", "", lblTxtmensaje_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextDanger", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\ControlCalidad_CC_CC1__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "Center", "top", "", "", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 87, 2, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\ControlCalidad_CC_CC1__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell CellMarginTop HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol87( ) ;
      }
      if ( wbEnd == 87 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_87 = (int)(nGXsfl_87_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV54GXV1 = nGXsfl_87_idx ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV15GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV16GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, "GRIDPAGINATIONBARContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell CellMarginTop HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridcontrolcalidad_cc1_sdtstablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         Gridcontrolcalidad_cc1_sdtsContainer.SetWrapped(nGXWrapped);
         startgridcontrol116( ) ;
      }
      if ( wbEnd == 116 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_116 = (int)(nGXsfl_116_idx-1) ;
         if ( Gridcontrolcalidad_cc1_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV69GXV16 = nGXsfl_116_idx ;
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"Gridcontrolcalidad_cc1_sdtsContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Gridcontrolcalidad_cc1_sdts", Gridcontrolcalidad_cc1_sdtsContainer, subGridcontrolcalidad_cc1_sdts_Internalname);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "Gridcontrolcalidad_cc1_sdtsContainerData", Gridcontrolcalidad_cc1_sdtsContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "Gridcontrolcalidad_cc1_sdtsContainerData"+"V", Gridcontrolcalidad_cc1_sdtsContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridcontrolcalidad_cc1_sdtsContainerData"+"V"+"\" value='"+Gridcontrolcalidad_cc1_sdtsContainer.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucGridcontrolcalidad_cc1_sdtspaginationbar.setProperty("Class", Gridcontrolcalidad_cc1_sdtspaginationbar_Class);
         ucGridcontrolcalidad_cc1_sdtspaginationbar.setProperty("ShowFirst", Gridcontrolcalidad_cc1_sdtspaginationbar_Showfirst);
         ucGridcontrolcalidad_cc1_sdtspaginationbar.setProperty("ShowPrevious", Gridcontrolcalidad_cc1_sdtspaginationbar_Showprevious);
         ucGridcontrolcalidad_cc1_sdtspaginationbar.setProperty("ShowNext", Gridcontrolcalidad_cc1_sdtspaginationbar_Shownext);
         ucGridcontrolcalidad_cc1_sdtspaginationbar.setProperty("ShowLast", Gridcontrolcalidad_cc1_sdtspaginationbar_Showlast);
         ucGridcontrolcalidad_cc1_sdtspaginationbar.setProperty("PagesToShow", Gridcontrolcalidad_cc1_sdtspaginationbar_Pagestoshow);
         ucGridcontrolcalidad_cc1_sdtspaginationbar.setProperty("PagingButtonsPosition", Gridcontrolcalidad_cc1_sdtspaginationbar_Pagingbuttonsposition);
         ucGridcontrolcalidad_cc1_sdtspaginationbar.setProperty("PagingCaptionPosition", Gridcontrolcalidad_cc1_sdtspaginationbar_Pagingcaptionposition);
         ucGridcontrolcalidad_cc1_sdtspaginationbar.setProperty("EmptyGridClass", Gridcontrolcalidad_cc1_sdtspaginationbar_Emptygridclass);
         ucGridcontrolcalidad_cc1_sdtspaginationbar.setProperty("RowsPerPageSelector", Gridcontrolcalidad_cc1_sdtspaginationbar_Rowsperpageselector);
         ucGridcontrolcalidad_cc1_sdtspaginationbar.setProperty("RowsPerPageOptions", Gridcontrolcalidad_cc1_sdtspaginationbar_Rowsperpageoptions);
         ucGridcontrolcalidad_cc1_sdtspaginationbar.setProperty("Previous", Gridcontrolcalidad_cc1_sdtspaginationbar_Previous);
         ucGridcontrolcalidad_cc1_sdtspaginationbar.setProperty("Next", Gridcontrolcalidad_cc1_sdtspaginationbar_Next);
         ucGridcontrolcalidad_cc1_sdtspaginationbar.setProperty("Caption", Gridcontrolcalidad_cc1_sdtspaginationbar_Caption);
         ucGridcontrolcalidad_cc1_sdtspaginationbar.setProperty("EmptyGridCaption", Gridcontrolcalidad_cc1_sdtspaginationbar_Emptygridcaption);
         ucGridcontrolcalidad_cc1_sdtspaginationbar.setProperty("RowsPerPageCaption", Gridcontrolcalidad_cc1_sdtspaginationbar_Rowsperpagecaption);
         ucGridcontrolcalidad_cc1_sdtspaginationbar.setProperty("CurrentPage", AV36GridControlCalidad_CC1_SDTsCurrentPage);
         ucGridcontrolcalidad_cc1_sdtspaginationbar.setProperty("PageCount", AV37GridControlCalidad_CC1_SDTsPageCount);
         ucGridcontrolcalidad_cc1_sdtspaginationbar.render(context, "dvelop.dvpaginationbar", Gridcontrolcalidad_cc1_sdtspaginationbar_Internalname, "GRIDCONTROLCALIDAD_CC1_SDTSPAGINATIONBARContainer");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV77Pgmname), GXutil.rtrim( localUtil.format( AV77Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidad_CC_CC1__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDatamonjs.render(context, "datamonjs", Datamonjs_Internalname, "DATAMONJSContainer");
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
         ucGrid_titlescategories.setProperty("GridTitlesCategories", Grid_titlescategories_Gridtitlescategories);
         ucGrid_titlescategories.render(context, "dvelop.gridtitlescategories", Grid_titlescategories_Internalname, "GRID_TITLESCATEGORIESContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasCategories", Grid_empowerer_Hascategories);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* User Defined Control */
         ucGridcontrolcalidad_cc1_sdts_empowerer.render(context, "wwp.gridempowerer", Gridcontrolcalidad_cc1_sdts_empowerer_Internalname, "GRIDCONTROLCALIDAD_CC1_SDTS_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 87 )
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
               AV54GXV1 = nGXsfl_87_idx ;
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
      if ( wbEnd == 116 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( Gridcontrolcalidad_cc1_sdtsContainer.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               AV69GXV16 = nGXsfl_116_idx ;
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+"Gridcontrolcalidad_cc1_sdtsContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Gridcontrolcalidad_cc1_sdts", Gridcontrolcalidad_cc1_sdtsContainer, subGridcontrolcalidad_cc1_sdts_Internalname);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "Gridcontrolcalidad_cc1_sdtsContainerData", Gridcontrolcalidad_cc1_sdtsContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "Gridcontrolcalidad_cc1_sdtsContainerData"+"V", Gridcontrolcalidad_cc1_sdtsContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridcontrolcalidad_cc1_sdtsContainerData"+"V"+"\" value='"+Gridcontrolcalidad_cc1_sdtsContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void start2CB2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Control de Calidad por Nº HDR ( Fases)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2CB0( ) ;
   }

   public void ws2CB2( )
   {
      start2CB2( ) ;
      evt2CB2( ) ;
   }

   public void evt2CB2( )
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
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e112CB2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e122CB2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDCONTROLCALIDAD_CC1_SDTSPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e132CB2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDCONTROLCALIDAD_CC1_SDTSPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e142CB2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e152CB2 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VGRIDACTIONS.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 39), "CONTROLCALIDAD_CC_CC1_SDT__PROCOD.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 42), "CONTROLCALIDAD_CC_CC1_SDT__BARORDLIN.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VGRIDACTIONS.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 42), "CONTROLCALIDAD_CC_CC1_SDT__BARORDLIN.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 39), "CONTROLCALIDAD_CC_CC1_SDT__PROCOD.CLICK") == 0 ) )
                        {
                           nGXsfl_87_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_87_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_87_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_872( ) ;
                           AV54GXV1 = (int)(nGXsfl_87_idx+GRID_nFirstRecordOnPage) ;
                           if ( ( AV12ControlCalidad_CC_CC1_SDT.size() >= AV54GXV1 ) && ( AV54GXV1 > 0 ) )
                           {
                              AV12ControlCalidad_CC_CC1_SDT.currentItem( ((app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item)AV12ControlCalidad_CC_CC1_SDT.elementAt(-1+AV54GXV1)) );
                              cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                              cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                              AV44GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                              httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44GridActions), 4, 0));
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
                                 e162CB2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e172CB2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e182CB2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONS.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e192CB2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "CONTROLCALIDAD_CC_CC1_SDT__PROCOD.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e202CB2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "CONTROLCALIDAD_CC_CC1_SDT__BARORDLIN.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e212CB2 ();
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
                        else if ( GXutil.strcmp(GXutil.left( sEvt, 32), "GRIDCONTROLCALIDAD_CC1_SDTS.LOAD") == 0 )
                        {
                           nGXsfl_116_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_116_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_116_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1163( ) ;
                           AV69GXV16 = (int)(nGXsfl_116_idx+GRIDCONTROLCALIDAD_CC1_SDTS_nFirstRecordOnPage) ;
                           if ( ( AV35ControlCalidad_CC1_SDT.size() >= AV69GXV16 ) && ( AV69GXV16 > 0 ) )
                           {
                              AV35ControlCalidad_CC1_SDT.currentItem( ((app.controlcalidadhtd.SdtControlCalidad_CC1_SDT_Item)AV35ControlCalidad_CC1_SDT.elementAt(-1+AV69GXV16)) );
                           }
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "GRIDCONTROLCALIDAD_CC1_SDTS.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e222CB3 ();
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

   public void we2CB2( )
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

   public void pa2CB2( )
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
      subsflControlProps_872( ) ;
      while ( nGXsfl_87_idx <= nRC_GXsfl_87 )
      {
         sendrow_872( ) ;
         nGXsfl_87_idx = ((subGrid_Islastpage==1)&&(nGXsfl_87_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_87_idx+1) ;
         sGXsfl_87_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_87_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_872( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxnrgridcontrolcalidad_cc1_sdts_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_1163( ) ;
      while ( nGXsfl_116_idx <= nRC_GXsfl_116 )
      {
         sendrow_1163( ) ;
         nGXsfl_116_idx = ((subGridcontrolcalidad_cc1_sdts_Islastpage==1)&&(nGXsfl_116_idx+1>subgridcontrolcalidad_cc1_sdts_fnc_recordsperpage( )) ? 1 : nGXsfl_116_idx+1) ;
         sGXsfl_116_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_116_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1163( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridcontrolcalidad_cc1_sdtsContainer)) ;
      /* End function gxnrGridcontrolcalidad_cc1_sdts_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 int subGridcontrolcalidad_cc1_sdts_Rows ,
                                 String AV20EmprCod ,
                                 int AV19Barcod ,
                                 byte AV18Barcodreo ,
                                 String AV17BarCodPar ,
                                 String AV77Pgmname ,
                                 GXBaseCollection<app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item> AV12ControlCalidad_CC_CC1_SDT )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e172CB2 ();
      GRID_nCurrentRecord = 0 ;
      rf2CB2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"ControlCalidad_CC_CC1__WP");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV77Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("controlcalidadhtd\\controlcalidad_cc_cc1__wp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void gxgrgridcontrolcalidad_cc1_sdts_refresh( int subGrid_Rows ,
                                                        int subGridcontrolcalidad_cc1_sdts_Rows ,
                                                        String AV20EmprCod ,
                                                        int AV19Barcod ,
                                                        byte AV18Barcodreo ,
                                                        String AV17BarCodPar ,
                                                        String AV77Pgmname ,
                                                        GXBaseCollection<app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item> AV12ControlCalidad_CC_CC1_SDT )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e172CB2 ();
      GRIDCONTROLCALIDAD_CC1_SDTS_nCurrentRecord = 0 ;
      rf2CB3( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"ControlCalidad_CC_CC1__WP");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV77Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("controlcalidadhtd\\controlcalidad_cc_cc1__wp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGridcontrolcalidad_cc1_sdts_refresh */
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
      rf2CB2( ) ;
      rf2CB3( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV77Pgmname = "ControlCalidadHTD.ControlCalidad_CC_CC1__WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV77Pgmname", AV77Pgmname);
      Gx_err = (short)(0) ;
      edtavBarnhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarnhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnhdr_Enabled), 5, 0), true);
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavBarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarser_Enabled), 5, 0), true);
      edtavBarserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarserdsc_Enabled), 5, 0), true);
      edtavBarcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnom_Enabled), 5, 0), true);
      edtavBarcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnum_Enabled), 5, 0), true);
      edtavBarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm_Enabled), 5, 0), true);
      edtavBarmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmtr_Enabled), 5, 0), true);
      edtavBarpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpie_Enabled), 5, 0), true);
      edtavControlcalidad_cc_cc1_sdt__barordlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_cc_cc1_sdt__barordlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_cc_cc1_sdt__barordlin_Enabled), 5, 0), !bGXsfl_87_Refreshing);
      edtavControlcalidad_cc_cc1_sdt__procod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_cc_cc1_sdt__procod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_cc_cc1_sdt__procod_Enabled), 5, 0), !bGXsfl_87_Refreshing);
      edtavControlcalidad_cc_cc1_sdt__prodsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_cc_cc1_sdt__prodsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_cc_cc1_sdt__prodsc_Enabled), 5, 0), !bGXsfl_87_Refreshing);
      edtavControlcalidad_cc_cc1_sdt__fascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_cc_cc1_sdt__fascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_cc_cc1_sdt__fascod_Enabled), 5, 0), !bGXsfl_87_Refreshing);
      edtavControlcalidad_cc_cc1_sdt__fasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_cc_cc1_sdt__fasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_cc_cc1_sdt__fasdsc_Enabled), 5, 0), !bGXsfl_87_Refreshing);
      edtavControlcalidad_cc_cc1_sdt__cctcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_cc_cc1_sdt__cctcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_cc_cc1_sdt__cctcod_Enabled), 5, 0), !bGXsfl_87_Refreshing);
      edtavControlcalidad_cc_cc1_sdt__cctdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_cc_cc1_sdt__cctdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_cc_cc1_sdt__cctdsc_Enabled), 5, 0), !bGXsfl_87_Refreshing);
      edtavControlcalidad_cc_cc1_sdt__ccopecod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_cc_cc1_sdt__ccopecod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_cc_cc1_sdt__ccopecod_Enabled), 5, 0), !bGXsfl_87_Refreshing);
      edtavControlcalidad_cc_cc1_sdt__ccfch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_cc_cc1_sdt__ccfch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_cc_cc1_sdt__ccfch_Enabled), 5, 0), !bGXsfl_87_Refreshing);
      edtavControlcalidad_cc_cc1_sdt__cc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_cc_cc1_sdt__cc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_cc_cc1_sdt__cc_Enabled), 5, 0), !bGXsfl_87_Refreshing);
      edtavControlcalidad_cc_cc1_sdt__ccfas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_cc_cc1_sdt__ccfas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_cc_cc1_sdt__ccfas_Enabled), 5, 0), !bGXsfl_87_Refreshing);
      edtavControlcalidad_cc_cc1_sdt__ccser1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_cc_cc1_sdt__ccser1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_cc_cc1_sdt__ccser1_Enabled), 5, 0), !bGXsfl_87_Refreshing);
      edtavControlcalidad_cc_cc1_sdt__errcontrol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_cc_cc1_sdt__errcontrol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_cc_cc1_sdt__errcontrol_Enabled), 5, 0), !bGXsfl_87_Refreshing);
      edtavControlcalidad_cc_cc1_sdt__barfasest_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_cc_cc1_sdt__barfasest_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_cc_cc1_sdt__barfasest_Enabled), 5, 0), !bGXsfl_87_Refreshing);
      edtavControlcalidad_cc1_sdt__cctlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_cc1_sdt__cctlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_cc1_sdt__cctlin_Enabled), 5, 0), !bGXsfl_116_Refreshing);
      edtavControlcalidad_cc1_sdt__cctlindsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_cc1_sdt__cctlindsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_cc1_sdt__cctlindsc_Enabled), 5, 0), !bGXsfl_116_Refreshing);
      edtavControlcalidad_cc1_sdt__cctlindc2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_cc1_sdt__cctlindc2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_cc1_sdt__cctlindc2_Enabled), 5, 0), !bGXsfl_116_Refreshing);
      edtavControlcalidad_cc1_sdt__ccmetodo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_cc1_sdt__ccmetodo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_cc1_sdt__ccmetodo_Enabled), 5, 0), !bGXsfl_116_Refreshing);
      edtavControlcalidad_cc1_sdt__ccespecif2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_cc1_sdt__ccespecif2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_cc1_sdt__ccespecif2_Enabled), 5, 0), !bGXsfl_116_Refreshing);
      edtavControlcalidad_cc1_sdt__ccval_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_cc1_sdt__ccval_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_cc1_sdt__ccval_Enabled), 5, 0), !bGXsfl_116_Refreshing);
      edtavControlcalidad_cc1_sdt__cctvaldsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_cc1_sdt__cctvaldsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_cc1_sdt__cctvaldsc_Enabled), 5, 0), !bGXsfl_116_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2CB2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(87) ;
      /* Execute user event: Refresh */
      e172CB2 ();
      nGXsfl_87_idx = 1 ;
      sGXsfl_87_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_87_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_872( ) ;
      bGXsfl_87_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_872( ) ;
         e182CB2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_87_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e182CB2 ();
         }
         wbEnd = (short)(87) ;
         wb2CB0( ) ;
      }
      bGXsfl_87_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2CB2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV20EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20EmprCod, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCONTROLCALIDAD_CC_CC1_SDT", AV12ControlCalidad_CC_CC1_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCONTROLCALIDAD_CC_CC1_SDT", AV12ControlCalidad_CC_CC1_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTROLCALIDAD_CC_CC1_SDT", getSecureSignedToken( "", AV12ControlCalidad_CC_CC1_SDT));
   }

   public void rf2CB3( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         Gridcontrolcalidad_cc1_sdtsContainer.ClearRows();
      }
      wbStart = (short)(116) ;
      nGXsfl_116_idx = 1 ;
      sGXsfl_116_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_116_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1163( ) ;
      bGXsfl_116_Refreshing = true ;
      Gridcontrolcalidad_cc1_sdtsContainer.AddObjectProperty("GridName", "Gridcontrolcalidad_cc1_sdts");
      Gridcontrolcalidad_cc1_sdtsContainer.AddObjectProperty("CmpContext", "");
      Gridcontrolcalidad_cc1_sdtsContainer.AddObjectProperty("InMasterPage", "false");
      Gridcontrolcalidad_cc1_sdtsContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
      Gridcontrolcalidad_cc1_sdtsContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridcontrolcalidad_cc1_sdtsContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridcontrolcalidad_cc1_sdtsContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridcontrolcalidad_cc1_sdts_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridcontrolcalidad_cc1_sdtsContainer.setPageSize( subgridcontrolcalidad_cc1_sdts_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_1163( ) ;
         e222CB3 ();
         if ( ( GRIDCONTROLCALIDAD_CC1_SDTS_nCurrentRecord > 0 ) && ( GRIDCONTROLCALIDAD_CC1_SDTS_nGridOutOfScope == 0 ) && ( nGXsfl_116_idx == 1 ) )
         {
            GRIDCONTROLCALIDAD_CC1_SDTS_nCurrentRecord = 0 ;
            GRIDCONTROLCALIDAD_CC1_SDTS_nGridOutOfScope = 1 ;
            subgridcontrolcalidad_cc1_sdts_firstpage( ) ;
            e222CB3 ();
         }
         wbEnd = (short)(116) ;
         wb2CB0( ) ;
      }
      bGXsfl_116_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2CB3( )
   {
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
      return AV12ControlCalidad_CC_CC1_SDT.size() ;
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
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, subGridcontrolcalidad_cc1_sdts_Rows, AV20EmprCod, AV19Barcod, AV18Barcodreo, AV17BarCodPar, AV77Pgmname, AV12ControlCalidad_CC_CC1_SDT) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( ( GRID_nRecordCount >= subgrid_fnc_recordsperpage( ) ) && ( GRID_nEOF == 0 ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, subGridcontrolcalidad_cc1_sdts_Rows, AV20EmprCod, AV19Barcod, AV18Barcodreo, AV17BarCodPar, AV77Pgmname, AV12ControlCalidad_CC_CC1_SDT) ;
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
         gxgrgrid_refresh( subGrid_Rows, subGridcontrolcalidad_cc1_sdts_Rows, AV20EmprCod, AV19Barcod, AV18Barcodreo, AV17BarCodPar, AV77Pgmname, AV12ControlCalidad_CC_CC1_SDT) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
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
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, subGridcontrolcalidad_cc1_sdts_Rows, AV20EmprCod, AV19Barcod, AV18Barcodreo, AV17BarCodPar, AV77Pgmname, AV12ControlCalidad_CC_CC1_SDT) ;
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
         gxgrgrid_refresh( subGrid_Rows, subGridcontrolcalidad_cc1_sdts_Rows, AV20EmprCod, AV19Barcod, AV18Barcodreo, AV17BarCodPar, AV77Pgmname, AV12ControlCalidad_CC_CC1_SDT) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public int subgridcontrolcalidad_cc1_sdts_fnc_pagecount( )
   {
      GRIDCONTROLCALIDAD_CC1_SDTS_nRecordCount = subgridcontrolcalidad_cc1_sdts_fnc_recordcount( ) ;
      if ( ((int)((GRIDCONTROLCALIDAD_CC1_SDTS_nRecordCount) % (subgridcontrolcalidad_cc1_sdts_fnc_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRIDCONTROLCALIDAD_CC1_SDTS_nRecordCount/ (double) (subgridcontrolcalidad_cc1_sdts_fnc_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRIDCONTROLCALIDAD_CC1_SDTS_nRecordCount/ (double) (subgridcontrolcalidad_cc1_sdts_fnc_recordsperpage( )))+1) ;
   }

   public int subgridcontrolcalidad_cc1_sdts_fnc_recordcount( )
   {
      return AV35ControlCalidad_CC1_SDT.size() ;
   }

   public int subgridcontrolcalidad_cc1_sdts_fnc_recordsperpage( )
   {
      if ( subGridcontrolcalidad_cc1_sdts_Rows > 0 )
      {
         return subGridcontrolcalidad_cc1_sdts_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subgridcontrolcalidad_cc1_sdts_fnc_currentpage( )
   {
      return (int)(GXutil.Int( GRIDCONTROLCALIDAD_CC1_SDTS_nFirstRecordOnPage/ (double) (subgridcontrolcalidad_cc1_sdts_fnc_recordsperpage( )))+1) ;
   }

   public short subgridcontrolcalidad_cc1_sdts_firstpage( )
   {
      GRIDCONTROLCALIDAD_CC1_SDTS_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CC1_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDCONTROLCALIDAD_CC1_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridcontrolcalidad_cc1_sdts_refresh( subGrid_Rows, subGridcontrolcalidad_cc1_sdts_Rows, AV20EmprCod, AV19Barcod, AV18Barcodreo, AV17BarCodPar, AV77Pgmname, AV12ControlCalidad_CC_CC1_SDT) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridcontrolcalidad_cc1_sdts_nextpage( )
   {
      GRIDCONTROLCALIDAD_CC1_SDTS_nRecordCount = subgridcontrolcalidad_cc1_sdts_fnc_recordcount( ) ;
      if ( ( GRIDCONTROLCALIDAD_CC1_SDTS_nRecordCount >= subgridcontrolcalidad_cc1_sdts_fnc_recordsperpage( ) ) && ( GRIDCONTROLCALIDAD_CC1_SDTS_nEOF == 0 ) )
      {
         GRIDCONTROLCALIDAD_CC1_SDTS_nFirstRecordOnPage = (long)(GRIDCONTROLCALIDAD_CC1_SDTS_nFirstRecordOnPage+subgridcontrolcalidad_cc1_sdts_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CC1_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDCONTROLCALIDAD_CC1_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      Gridcontrolcalidad_cc1_sdtsContainer.AddObjectProperty("GRIDCONTROLCALIDAD_CC1_SDTS_nFirstRecordOnPage", GRIDCONTROLCALIDAD_CC1_SDTS_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgridcontrolcalidad_cc1_sdts_refresh( subGrid_Rows, subGridcontrolcalidad_cc1_sdts_Rows, AV20EmprCod, AV19Barcod, AV18Barcodreo, AV17BarCodPar, AV77Pgmname, AV12ControlCalidad_CC_CC1_SDT) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRIDCONTROLCALIDAD_CC1_SDTS_nEOF==0) ? 0 : 2)) ;
   }

   public short subgridcontrolcalidad_cc1_sdts_previouspage( )
   {
      if ( GRIDCONTROLCALIDAD_CC1_SDTS_nFirstRecordOnPage >= subgridcontrolcalidad_cc1_sdts_fnc_recordsperpage( ) )
      {
         GRIDCONTROLCALIDAD_CC1_SDTS_nFirstRecordOnPage = (long)(GRIDCONTROLCALIDAD_CC1_SDTS_nFirstRecordOnPage-subgridcontrolcalidad_cc1_sdts_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CC1_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDCONTROLCALIDAD_CC1_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridcontrolcalidad_cc1_sdts_refresh( subGrid_Rows, subGridcontrolcalidad_cc1_sdts_Rows, AV20EmprCod, AV19Barcod, AV18Barcodreo, AV17BarCodPar, AV77Pgmname, AV12ControlCalidad_CC_CC1_SDT) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridcontrolcalidad_cc1_sdts_lastpage( )
   {
      GRIDCONTROLCALIDAD_CC1_SDTS_nRecordCount = subgridcontrolcalidad_cc1_sdts_fnc_recordcount( ) ;
      if ( GRIDCONTROLCALIDAD_CC1_SDTS_nRecordCount > subgridcontrolcalidad_cc1_sdts_fnc_recordsperpage( ) )
      {
         if ( ((int)((GRIDCONTROLCALIDAD_CC1_SDTS_nRecordCount) % (subgridcontrolcalidad_cc1_sdts_fnc_recordsperpage( )))) == 0 )
         {
            GRIDCONTROLCALIDAD_CC1_SDTS_nFirstRecordOnPage = (long)(GRIDCONTROLCALIDAD_CC1_SDTS_nRecordCount-subgridcontrolcalidad_cc1_sdts_fnc_recordsperpage( )) ;
         }
         else
         {
            GRIDCONTROLCALIDAD_CC1_SDTS_nFirstRecordOnPage = (long)(GRIDCONTROLCALIDAD_CC1_SDTS_nRecordCount-((int)((GRIDCONTROLCALIDAD_CC1_SDTS_nRecordCount) % (subgridcontrolcalidad_cc1_sdts_fnc_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRIDCONTROLCALIDAD_CC1_SDTS_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CC1_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDCONTROLCALIDAD_CC1_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridcontrolcalidad_cc1_sdts_refresh( subGrid_Rows, subGridcontrolcalidad_cc1_sdts_Rows, AV20EmprCod, AV19Barcod, AV18Barcodreo, AV17BarCodPar, AV77Pgmname, AV12ControlCalidad_CC_CC1_SDT) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgridcontrolcalidad_cc1_sdts_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRIDCONTROLCALIDAD_CC1_SDTS_nFirstRecordOnPage = (long)(subgridcontrolcalidad_cc1_sdts_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRIDCONTROLCALIDAD_CC1_SDTS_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CC1_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDCONTROLCALIDAD_CC1_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridcontrolcalidad_cc1_sdts_refresh( subGrid_Rows, subGridcontrolcalidad_cc1_sdts_Rows, AV20EmprCod, AV19Barcod, AV18Barcodreo, AV17BarCodPar, AV77Pgmname, AV12ControlCalidad_CC_CC1_SDT) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV77Pgmname = "ControlCalidadHTD.ControlCalidad_CC_CC1__WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV77Pgmname", AV77Pgmname);
      Gx_err = (short)(0) ;
      edtavBarnhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarnhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnhdr_Enabled), 5, 0), true);
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavBarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarser_Enabled), 5, 0), true);
      edtavBarserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarserdsc_Enabled), 5, 0), true);
      edtavBarcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnom_Enabled), 5, 0), true);
      edtavBarcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnum_Enabled), 5, 0), true);
      edtavBarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm_Enabled), 5, 0), true);
      edtavBarmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmtr_Enabled), 5, 0), true);
      edtavBarpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpie_Enabled), 5, 0), true);
      edtavControlcalidad_cc_cc1_sdt__barordlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_cc_cc1_sdt__barordlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_cc_cc1_sdt__barordlin_Enabled), 5, 0), !bGXsfl_87_Refreshing);
      edtavControlcalidad_cc_cc1_sdt__procod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_cc_cc1_sdt__procod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_cc_cc1_sdt__procod_Enabled), 5, 0), !bGXsfl_87_Refreshing);
      edtavControlcalidad_cc_cc1_sdt__prodsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_cc_cc1_sdt__prodsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_cc_cc1_sdt__prodsc_Enabled), 5, 0), !bGXsfl_87_Refreshing);
      edtavControlcalidad_cc_cc1_sdt__fascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_cc_cc1_sdt__fascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_cc_cc1_sdt__fascod_Enabled), 5, 0), !bGXsfl_87_Refreshing);
      edtavControlcalidad_cc_cc1_sdt__fasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_cc_cc1_sdt__fasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_cc_cc1_sdt__fasdsc_Enabled), 5, 0), !bGXsfl_87_Refreshing);
      edtavControlcalidad_cc_cc1_sdt__cctcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_cc_cc1_sdt__cctcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_cc_cc1_sdt__cctcod_Enabled), 5, 0), !bGXsfl_87_Refreshing);
      edtavControlcalidad_cc_cc1_sdt__cctdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_cc_cc1_sdt__cctdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_cc_cc1_sdt__cctdsc_Enabled), 5, 0), !bGXsfl_87_Refreshing);
      edtavControlcalidad_cc_cc1_sdt__ccopecod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_cc_cc1_sdt__ccopecod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_cc_cc1_sdt__ccopecod_Enabled), 5, 0), !bGXsfl_87_Refreshing);
      edtavControlcalidad_cc_cc1_sdt__ccfch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_cc_cc1_sdt__ccfch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_cc_cc1_sdt__ccfch_Enabled), 5, 0), !bGXsfl_87_Refreshing);
      edtavControlcalidad_cc_cc1_sdt__cc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_cc_cc1_sdt__cc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_cc_cc1_sdt__cc_Enabled), 5, 0), !bGXsfl_87_Refreshing);
      edtavControlcalidad_cc_cc1_sdt__ccfas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_cc_cc1_sdt__ccfas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_cc_cc1_sdt__ccfas_Enabled), 5, 0), !bGXsfl_87_Refreshing);
      edtavControlcalidad_cc_cc1_sdt__ccser1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_cc_cc1_sdt__ccser1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_cc_cc1_sdt__ccser1_Enabled), 5, 0), !bGXsfl_87_Refreshing);
      edtavControlcalidad_cc_cc1_sdt__errcontrol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_cc_cc1_sdt__errcontrol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_cc_cc1_sdt__errcontrol_Enabled), 5, 0), !bGXsfl_87_Refreshing);
      edtavControlcalidad_cc_cc1_sdt__barfasest_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_cc_cc1_sdt__barfasest_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_cc_cc1_sdt__barfasest_Enabled), 5, 0), !bGXsfl_87_Refreshing);
      edtavControlcalidad_cc1_sdt__cctlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_cc1_sdt__cctlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_cc1_sdt__cctlin_Enabled), 5, 0), !bGXsfl_116_Refreshing);
      edtavControlcalidad_cc1_sdt__cctlindsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_cc1_sdt__cctlindsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_cc1_sdt__cctlindsc_Enabled), 5, 0), !bGXsfl_116_Refreshing);
      edtavControlcalidad_cc1_sdt__cctlindc2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_cc1_sdt__cctlindc2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_cc1_sdt__cctlindc2_Enabled), 5, 0), !bGXsfl_116_Refreshing);
      edtavControlcalidad_cc1_sdt__ccmetodo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_cc1_sdt__ccmetodo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_cc1_sdt__ccmetodo_Enabled), 5, 0), !bGXsfl_116_Refreshing);
      edtavControlcalidad_cc1_sdt__ccespecif2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_cc1_sdt__ccespecif2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_cc1_sdt__ccespecif2_Enabled), 5, 0), !bGXsfl_116_Refreshing);
      edtavControlcalidad_cc1_sdt__ccval_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_cc1_sdt__ccval_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_cc1_sdt__ccval_Enabled), 5, 0), !bGXsfl_116_Refreshing);
      edtavControlcalidad_cc1_sdt__cctvaldsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_cc1_sdt__cctvaldsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_cc1_sdt__cctvaldsc_Enabled), 5, 0), !bGXsfl_116_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2CB0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e162CB2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Controlcalidad_cc_cc1_sdt"), AV12ControlCalidad_CC_CC1_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Controlcalidad_cc1_sdt"), AV35ControlCalidad_CC1_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCONTROLCALIDAD_CC_CC1_SDT"), AV12ControlCalidad_CC_CC1_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCONTROLCALIDAD_CC1_SDT"), AV35ControlCalidad_CC1_SDT);
         /* Read saved values. */
         nRC_GXsfl_87 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_87"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nRC_GXsfl_116 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_116"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV15GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV16GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV36GridControlCalidad_CC1_SDTsCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCONTROLCALIDAD_CC1_SDTSCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV37GridControlCalidad_CC1_SDTsPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDCONTROLCALIDAD_CC1_SDTSPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRIDCONTROLCALIDAD_CC1_SDTS_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRIDCONTROLCALIDAD_CC1_SDTS_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         GRIDCONTROLCALIDAD_CC1_SDTS_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRIDCONTROLCALIDAD_CC1_SDTS_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         subGridcontrolcalidad_cc1_sdts_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDCONTROLCALIDAD_CC1_SDTS_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CC1_SDTS_Rows", GXutil.ltrim( localUtil.ntoc( subGridcontrolcalidad_cc1_sdts_Rows, (byte)(6), (byte)(0), ".", "")));
         Dvpanel_tableheader_Width = httpContext.cgiGet( "DVPANEL_TABLEHEADER_Width") ;
         Dvpanel_tableheader_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Autowidth")) ;
         Dvpanel_tableheader_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Autoheight")) ;
         Dvpanel_tableheader_Cls = httpContext.cgiGet( "DVPANEL_TABLEHEADER_Cls") ;
         Dvpanel_tableheader_Title = httpContext.cgiGet( "DVPANEL_TABLEHEADER_Title") ;
         Dvpanel_tableheader_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Collapsible")) ;
         Dvpanel_tableheader_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Collapsed")) ;
         Dvpanel_tableheader_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Showcollapseicon")) ;
         Dvpanel_tableheader_Iconposition = httpContext.cgiGet( "DVPANEL_TABLEHEADER_Iconposition") ;
         Dvpanel_tableheader_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Autoscroll")) ;
         Gridpaginationbar_Class = httpContext.cgiGet( "GRIDPAGINATIONBAR_Class") ;
         Gridpaginationbar_Showfirst = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Showfirst")) ;
         Gridpaginationbar_Showprevious = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Showprevious")) ;
         Gridpaginationbar_Shownext = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Shownext")) ;
         Gridpaginationbar_Showlast = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Showlast")) ;
         Gridpaginationbar_Pagestoshow = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Pagestoshow"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridpaginationbar_Pagingbuttonsposition = httpContext.cgiGet( "GRIDPAGINATIONBAR_Pagingbuttonsposition") ;
         Gridpaginationbar_Pagingcaptionposition = httpContext.cgiGet( "GRIDPAGINATIONBAR_Pagingcaptionposition") ;
         Gridpaginationbar_Emptygridclass = httpContext.cgiGet( "GRIDPAGINATIONBAR_Emptygridclass") ;
         Gridpaginationbar_Rowsperpageselector = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselector")) ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridpaginationbar_Rowsperpageoptions = httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageoptions") ;
         Gridpaginationbar_Previous = httpContext.cgiGet( "GRIDPAGINATIONBAR_Previous") ;
         Gridpaginationbar_Next = httpContext.cgiGet( "GRIDPAGINATIONBAR_Next") ;
         Gridpaginationbar_Caption = httpContext.cgiGet( "GRIDPAGINATIONBAR_Caption") ;
         Gridpaginationbar_Emptygridcaption = httpContext.cgiGet( "GRIDPAGINATIONBAR_Emptygridcaption") ;
         Gridpaginationbar_Rowsperpagecaption = httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpagecaption") ;
         Gridcontrolcalidad_cc1_sdtspaginationbar_Class = httpContext.cgiGet( "GRIDCONTROLCALIDAD_CC1_SDTSPAGINATIONBAR_Class") ;
         Gridcontrolcalidad_cc1_sdtspaginationbar_Showfirst = GXutil.strtobool( httpContext.cgiGet( "GRIDCONTROLCALIDAD_CC1_SDTSPAGINATIONBAR_Showfirst")) ;
         Gridcontrolcalidad_cc1_sdtspaginationbar_Showprevious = GXutil.strtobool( httpContext.cgiGet( "GRIDCONTROLCALIDAD_CC1_SDTSPAGINATIONBAR_Showprevious")) ;
         Gridcontrolcalidad_cc1_sdtspaginationbar_Shownext = GXutil.strtobool( httpContext.cgiGet( "GRIDCONTROLCALIDAD_CC1_SDTSPAGINATIONBAR_Shownext")) ;
         Gridcontrolcalidad_cc1_sdtspaginationbar_Showlast = GXutil.strtobool( httpContext.cgiGet( "GRIDCONTROLCALIDAD_CC1_SDTSPAGINATIONBAR_Showlast")) ;
         Gridcontrolcalidad_cc1_sdtspaginationbar_Pagestoshow = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDCONTROLCALIDAD_CC1_SDTSPAGINATIONBAR_Pagestoshow"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridcontrolcalidad_cc1_sdtspaginationbar_Pagingbuttonsposition = httpContext.cgiGet( "GRIDCONTROLCALIDAD_CC1_SDTSPAGINATIONBAR_Pagingbuttonsposition") ;
         Gridcontrolcalidad_cc1_sdtspaginationbar_Pagingcaptionposition = httpContext.cgiGet( "GRIDCONTROLCALIDAD_CC1_SDTSPAGINATIONBAR_Pagingcaptionposition") ;
         Gridcontrolcalidad_cc1_sdtspaginationbar_Emptygridclass = httpContext.cgiGet( "GRIDCONTROLCALIDAD_CC1_SDTSPAGINATIONBAR_Emptygridclass") ;
         Gridcontrolcalidad_cc1_sdtspaginationbar_Rowsperpageselector = GXutil.strtobool( httpContext.cgiGet( "GRIDCONTROLCALIDAD_CC1_SDTSPAGINATIONBAR_Rowsperpageselector")) ;
         Gridcontrolcalidad_cc1_sdtspaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDCONTROLCALIDAD_CC1_SDTSPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridcontrolcalidad_cc1_sdtspaginationbar_Rowsperpageoptions = httpContext.cgiGet( "GRIDCONTROLCALIDAD_CC1_SDTSPAGINATIONBAR_Rowsperpageoptions") ;
         Gridcontrolcalidad_cc1_sdtspaginationbar_Previous = httpContext.cgiGet( "GRIDCONTROLCALIDAD_CC1_SDTSPAGINATIONBAR_Previous") ;
         Gridcontrolcalidad_cc1_sdtspaginationbar_Next = httpContext.cgiGet( "GRIDCONTROLCALIDAD_CC1_SDTSPAGINATIONBAR_Next") ;
         Gridcontrolcalidad_cc1_sdtspaginationbar_Caption = httpContext.cgiGet( "GRIDCONTROLCALIDAD_CC1_SDTSPAGINATIONBAR_Caption") ;
         Gridcontrolcalidad_cc1_sdtspaginationbar_Emptygridcaption = httpContext.cgiGet( "GRIDCONTROLCALIDAD_CC1_SDTSPAGINATIONBAR_Emptygridcaption") ;
         Gridcontrolcalidad_cc1_sdtspaginationbar_Rowsperpagecaption = httpContext.cgiGet( "GRIDCONTROLCALIDAD_CC1_SDTSPAGINATIONBAR_Rowsperpagecaption") ;
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
         Grid_titlescategories_Gridinternalname = httpContext.cgiGet( "GRID_TITLESCATEGORIES_Gridinternalname") ;
         Grid_titlescategories_Gridtitlescategories = httpContext.cgiGet( "GRID_TITLESCATEGORIES_Gridtitlescategories") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hascategories = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hascategories")) ;
         Grid_empowerer_Fixedcolumns = httpContext.cgiGet( "GRID_EMPOWERER_Fixedcolumns") ;
         Gridcontrolcalidad_cc1_sdts_empowerer_Gridinternalname = httpContext.cgiGet( "GRIDCONTROLCALIDAD_CC1_SDTS_EMPOWERER_Gridinternalname") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( "GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridcontrolcalidad_cc1_sdtspaginationbar_Selectedpage = httpContext.cgiGet( "GRIDCONTROLCALIDAD_CC1_SDTSPAGINATIONBAR_Selectedpage") ;
         Gridcontrolcalidad_cc1_sdtspaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDCONTROLCALIDAD_CC1_SDTSPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nRC_GXsfl_87 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_87"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_87_fel_idx = 0 ;
         while ( nGXsfl_87_fel_idx < nRC_GXsfl_87 )
         {
            nGXsfl_87_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_87_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_87_fel_idx+1) ;
            sGXsfl_87_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_87_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_872( ) ;
            AV54GXV1 = (int)(nGXsfl_87_fel_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV12ControlCalidad_CC_CC1_SDT.size() >= AV54GXV1 ) && ( AV54GXV1 > 0 ) )
            {
               AV12ControlCalidad_CC_CC1_SDT.currentItem( ((app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item)AV12ControlCalidad_CC_CC1_SDT.elementAt(-1+AV54GXV1)) );
               cmbavGridactions.setName( cmbavGridactions.getInternalname() );
               cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
               AV44GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
            }
         }
         if ( nGXsfl_87_fel_idx == 0 )
         {
            nGXsfl_87_idx = 1 ;
            sGXsfl_87_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_87_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_872( ) ;
         }
         nGXsfl_87_fel_idx = 1 ;
         nRC_GXsfl_116 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_116"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_116_fel_idx = 0 ;
         while ( nGXsfl_116_fel_idx < nRC_GXsfl_116 )
         {
            nGXsfl_116_fel_idx = ((subGridcontrolcalidad_cc1_sdts_Islastpage==1)&&(nGXsfl_116_fel_idx+1>subgridcontrolcalidad_cc1_sdts_fnc_recordsperpage( )) ? 1 : nGXsfl_116_fel_idx+1) ;
            sGXsfl_116_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_116_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_1163( ) ;
            AV69GXV16 = (int)(nGXsfl_116_fel_idx+GRIDCONTROLCALIDAD_CC1_SDTS_nFirstRecordOnPage) ;
            if ( ( AV35ControlCalidad_CC1_SDT.size() >= AV69GXV16 ) && ( AV69GXV16 > 0 ) )
            {
               AV35ControlCalidad_CC1_SDT.currentItem( ((app.controlcalidadhtd.SdtControlCalidad_CC1_SDT_Item)AV35ControlCalidad_CC1_SDT.elementAt(-1+AV69GXV16)) );
            }
         }
         if ( nGXsfl_116_fel_idx == 0 )
         {
            nGXsfl_116_idx = 1 ;
            sGXsfl_116_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_116_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_1163( ) ;
         }
         nGXsfl_116_fel_idx = 1 ;
         /* Read variables values. */
         AV77Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV77Pgmname", AV77Pgmname);
         /* Read subfile selected row values. */
         nGXsfl_87_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_87_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_87_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_872( ) ;
         AV54GXV1 = (int)(nGXsfl_87_idx+GRID_nFirstRecordOnPage) ;
         if ( nGXsfl_87_idx > 0 )
         {
            AV54GXV1 = (int)(nGXsfl_87_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV12ControlCalidad_CC_CC1_SDT.size() >= AV54GXV1 ) && ( AV54GXV1 > 0 ) )
            {
               AV12ControlCalidad_CC_CC1_SDT.currentItem( ((app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item)AV12ControlCalidad_CC_CC1_SDT.elementAt(-1+AV54GXV1)) );
               cmbavGridactions.setName( cmbavGridactions.getInternalname() );
               cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
               AV44GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44GridActions), 4, 0));
            }
            if ( ( AV54GXV1 > 0 ) && ( AV12ControlCalidad_CC_CC1_SDT.size() >= AV54GXV1 ) )
            {
               AV12ControlCalidad_CC_CC1_SDT.currentItem( ((app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item)AV12ControlCalidad_CC_CC1_SDT.elementAt(-1+AV54GXV1)) );
            }
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"ControlCalidad_CC_CC1__WP");
         AV77Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV77Pgmname", AV77Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV77Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("controlcalidadhtd\\controlcalidad_cc_cc1__wp:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
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
      e162CB2 ();
      if (returnInSub) return;
   }

   public void e162CB2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV23Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      controlcalidad_cc_cc1__wp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV23Station = GXt_char1 ;
      GXv_char2[0] = AV20EmprCod ;
      GXv_char3[0] = AV22EmprNom ;
      GXv_char4[0] = AV21UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV23Station, GXv_char2, GXv_char3, GXv_char4) ;
      controlcalidad_cc_cc1__wp_impl.this.AV20EmprCod = GXv_char2[0] ;
      controlcalidad_cc_cc1__wp_impl.this.AV22EmprNom = GXv_char3[0] ;
      controlcalidad_cc_cc1__wp_impl.this.AV21UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20EmprCod", AV20EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20EmprCod, "@!"))));
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Grid_titlescategories_Gridinternalname = subGrid_Internalname ;
      ucGrid_titlescategories.sendProperty(context, "", false, Grid_titlescategories_Internalname, "GridInternalName", Grid_titlescategories_Gridinternalname);
      Form.setCaption( httpContext.getMessage( "Control de Calidad por Nº HDR ( Fases)", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S112 ();
      if (returnInSub) return;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      Gridcontrolcalidad_cc1_sdts_empowerer_Gridinternalname = subGridcontrolcalidad_cc1_sdts_Internalname ;
      ucGridcontrolcalidad_cc1_sdts_empowerer.sendProperty(context, "", false, Gridcontrolcalidad_cc1_sdts_empowerer_Internalname, "GridInternalName", Gridcontrolcalidad_cc1_sdts_empowerer_Gridinternalname);
      subGridcontrolcalidad_cc1_sdts_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CC1_SDTS_Rows", GXutil.ltrim( localUtil.ntoc( subGridcontrolcalidad_cc1_sdts_Rows, (byte)(6), (byte)(0), ".", "")));
      Gridcontrolcalidad_cc1_sdtspaginationbar_Rowsperpageselectedvalue = subGridcontrolcalidad_cc1_sdts_Rows ;
      ucGridcontrolcalidad_cc1_sdtspaginationbar.sendProperty(context, "", false, Gridcontrolcalidad_cc1_sdtspaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridcontrolcalidad_cc1_sdtspaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_char1 = AV34ControlCalidad_CC_CC1_SDT_json ;
      GXv_char4[0] = GXt_char1 ;
      new app.controlcalidadhtd.controlcalidad_cc_cc1_prc(remoteHandle, context).execute( AV20EmprCod, AV19Barcod, AV18Barcodreo, AV17BarCodPar, GXv_char4) ;
      controlcalidad_cc_cc1__wp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV34ControlCalidad_CC_CC1_SDT_json = GXt_char1 ;
      AV12ControlCalidad_CC_CC1_SDT.fromJSonString(AV34ControlCalidad_CC_CC1_SDT_json, null);
      gx_BV87 = true ;
   }

   public void e172CB2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext5[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV6WWPContext = GXv_SdtWWPContext5[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSDT' */
      S132 ();
      if (returnInSub) return;
      AV15GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15GridCurrentPage), 10, 0));
      AV16GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16GridPageCount), 10, 0));
      AV36GridControlCalidad_CC1_SDTsCurrentPage = subgridcontrolcalidad_cc1_sdts_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36GridControlCalidad_CC1_SDTsCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36GridControlCalidad_CC1_SDTsCurrentPage), 10, 0));
      AV37GridControlCalidad_CC1_SDTsPageCount = subgridcontrolcalidad_cc1_sdts_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37GridControlCalidad_CC1_SDTsPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37GridControlCalidad_CC1_SDTsPageCount), 10, 0));
      GXt_char1 = AV34ControlCalidad_CC_CC1_SDT_json ;
      GXv_char4[0] = GXt_char1 ;
      new app.controlcalidadhtd.controlcalidad_cc_cc1_prc(remoteHandle, context).execute( AV20EmprCod, AV19Barcod, AV18Barcodreo, AV17BarCodPar, GXv_char4) ;
      controlcalidad_cc_cc1__wp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV34ControlCalidad_CC_CC1_SDT_json = GXt_char1 ;
      AV12ControlCalidad_CC_CC1_SDT.fromJSonString(AV34ControlCalidad_CC_CC1_SDT_json, null);
      gx_BV87 = true ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV12ControlCalidad_CC_CC1_SDT", AV12ControlCalidad_CC_CC1_SDT);
   }

   public void e112CB2( )
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
         AV14PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV14PageToGo) ;
      }
   }

   public void e122CB2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   private void e182CB2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV54GXV1 = 1 ;
      while ( AV54GXV1 <= AV12ControlCalidad_CC_CC1_SDT.size() )
      {
         AV12ControlCalidad_CC_CC1_SDT.currentItem( ((app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item)AV12ControlCalidad_CC_CC1_SDT.elementAt(-1+AV54GXV1)) );
         cmbavGridactions.removeAllItems();
         cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
         cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Ingresar Resultados", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "Lineas", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(87) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_872( ) ;
            GRID_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRID_nCurrentRecord + 1 >= subgrid_fnc_recordcount( ) )
            {
               GRID_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_87_Refreshing )
         {
            httpContext.doAjaxLoad(87, GridRow);
         }
         AV54GXV1 = (int)(AV54GXV1+1) ;
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV44GridActions, 4, 0)) );
   }

   public void e192CB2( )
   {
      AV54GXV1 = (int)(nGXsfl_87_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV54GXV1 > 0 ) && ( AV12ControlCalidad_CC_CC1_SDT.size() >= AV54GXV1 ) )
      {
         AV12ControlCalidad_CC_CC1_SDT.currentItem( ((app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item)AV12ControlCalidad_CC_CC1_SDT.elementAt(-1+AV54GXV1)) );
      }
      /* Gridactions_Click Routine */
      returnInSub = false ;
      if ( AV44GridActions == 1 )
      {
         /* Execute user subroutine: 'DO INGRESARRESULTADOS' */
         S142 ();
         if (returnInSub) return;
      }
      else if ( AV44GridActions == 2 )
      {
         /* Execute user subroutine: 'DO LINEAS' */
         S152 ();
         if (returnInSub) return;
      }
      AV44GridActions = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44GridActions), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV44GridActions, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV12ControlCalidad_CC_CC1_SDT", AV12ControlCalidad_CC_CC1_SDT);
      nGXsfl_87_bak_idx = nGXsfl_87_idx ;
      gxgrgrid_refresh( subGrid_Rows, subGridcontrolcalidad_cc1_sdts_Rows, AV20EmprCod, AV19Barcod, AV18Barcodreo, AV17BarCodPar, AV77Pgmname, AV12ControlCalidad_CC_CC1_SDT) ;
      nGXsfl_87_idx = nGXsfl_87_bak_idx ;
      sGXsfl_87_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_87_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_872( ) ;
   }

   public void e152CB2( )
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

   public void e132CB2( )
   {
      /* Gridcontrolcalidad_cc1_sdtspaginationbar_Changepage Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gridcontrolcalidad_cc1_sdtspaginationbar_Selectedpage, "Previous") == 0 )
      {
         subgridcontrolcalidad_cc1_sdts_previouspage( ) ;
      }
      else if ( GXutil.strcmp(Gridcontrolcalidad_cc1_sdtspaginationbar_Selectedpage, "Next") == 0 )
      {
         AV14PageToGo = subgridcontrolcalidad_cc1_sdts_fnc_currentpage( ) ;
         AV14PageToGo = (int)(AV14PageToGo+1) ;
         subgridcontrolcalidad_cc1_sdts_gotopage( AV14PageToGo) ;
      }
      else
      {
         AV14PageToGo = (int)(GXutil.lval( Gridcontrolcalidad_cc1_sdtspaginationbar_Selectedpage)) ;
         subgridcontrolcalidad_cc1_sdts_gotopage( AV14PageToGo) ;
      }
   }

   public void e142CB2( )
   {
      /* Gridcontrolcalidad_cc1_sdtspaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGridcontrolcalidad_cc1_sdts_Rows = Gridcontrolcalidad_cc1_sdtspaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CC1_SDTS_Rows", GXutil.ltrim( localUtil.ntoc( subGridcontrolcalidad_cc1_sdts_Rows, (byte)(6), (byte)(0), ".", "")));
      subgridcontrolcalidad_cc1_sdts_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void S132( )
   {
      /* 'LOADGRIDSDT' Routine */
      returnInSub = false ;
   }

   public void S142( )
   {
      /* 'DO INGRESARRESULTADOS' Routine */
      returnInSub = false ;
      lblTxtmensaje_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxtmensaje_Internalname, "Caption", lblTxtmensaje_Caption, true);
      AV45ccopecod = ((app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item)(AV12ControlCalidad_CC_CC1_SDT.currentItem())).getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccopecod() ;
      AV41Cctcod = ((app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item)(AV12ControlCalidad_CC_CC1_SDT.currentItem())).getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Cctcod() ;
      AV39Procod = ((app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item)(AV12ControlCalidad_CC_CC1_SDT.currentItem())).getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Procod() ;
      AV40Barordlin = ((app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item)(AV12ControlCalidad_CC_CC1_SDT.currentItem())).getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Barordlin() ;
      if ( (0==AV45ccopecod) )
      {
         callWebObject(formatLink("app.controlcalidadhtd.controlcalidad_cc_operario", new String[] {GXutil.URLEncode(GXutil.rtrim(AV20EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV19Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV18Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV17BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV39Procod)),GXutil.URLEncode(GXutil.ltrimstr(AV40Barordlin,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV41Cctcod,6,0))}, new String[] {"EmprCod","Barcod","Barcodreo","BarCodPar","Procod","Barordlin","CCtcod"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      else
      {
         GXv_int6[0] = (byte)(AV46var_ok) ;
         GXv_char4[0] = AV47mensaje ;
         new app.controlcalidadhtd.controlcalidad_pccins(remoteHandle, context).execute( AV20EmprCod, AV19Barcod, AV17BarCodPar, AV18Barcodreo, AV39Procod, AV40Barordlin, AV41Cctcod, AV45ccopecod, "L", GXv_int6, GXv_char4) ;
         controlcalidad_cc_cc1__wp_impl.this.AV46var_ok = GXv_int6[0] ;
         controlcalidad_cc_cc1__wp_impl.this.AV47mensaje = GXv_char4[0] ;
         if ( AV46var_ok == 0 )
         {
            lblTxtmensaje_Caption = AV47mensaje ;
            httpContext.ajax_rsp_assign_prop("", false, lblTxtmensaje_Internalname, "Caption", lblTxtmensaje_Caption, true);
         }
         else
         {
            httpContext.popup(formatLink("app.controlcalidadhtd.controlcalidad_cc_trn", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(AV20EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV19Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV18Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV17BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV39Procod)),GXutil.URLEncode(GXutil.ltrimstr(AV40Barordlin,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV41Cctcod,6,0))}, new String[] {"Mode","EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","BarOrdLin","CCTCod"}) , new Object[] {});
            httpContext.doAjaxRefresh();
         }
      }
   }

   public void S152( )
   {
      /* 'DO LINEAS' Routine */
      returnInSub = false ;
      lblTxtmensaje_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxtmensaje_Internalname, "Caption", lblTxtmensaje_Caption, true);
      if ( ((app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item)(AV12ControlCalidad_CC_CC1_SDT.currentItem())).getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Cc() == 1 )
      {
         AV39Procod = ((app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item)(AV12ControlCalidad_CC_CC1_SDT.currentItem())).getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Procod() ;
         AV48Prodsc = ((app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item)(AV12ControlCalidad_CC_CC1_SDT.currentItem())).getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Prodsc() ;
         AV49Fascod = ((app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item)(AV12ControlCalidad_CC_CC1_SDT.currentItem())).getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Fascod() ;
         AV50Fasdsc = ((app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item)(AV12ControlCalidad_CC_CC1_SDT.currentItem())).getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Fasdsc() ;
         AV51CCTDsc = ((app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item)(AV12ControlCalidad_CC_CC1_SDT.currentItem())).getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Cctdsc() ;
         AV40Barordlin = ((app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item)(AV12ControlCalidad_CC_CC1_SDT.currentItem())).getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Barordlin() ;
         AV41Cctcod = ((app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item)(AV12ControlCalidad_CC_CC1_SDT.currentItem())).getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Cctcod() ;
         httpContext.popup(formatLink("app.controlcalidadhtd.controlcalidad_cc1_wkp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV20EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV19Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV18Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV17BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV39Procod)),GXutil.URLEncode(GXutil.rtrim(AV48Prodsc)),GXutil.URLEncode(GXutil.ltrimstr(AV40Barordlin,4,0)),GXutil.URLEncode(GXutil.rtrim(AV49Fascod)),GXutil.URLEncode(GXutil.rtrim(AV50Fasdsc)),GXutil.URLEncode(GXutil.ltrimstr(AV41Cctcod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV51CCTDsc))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","ProDsc","BarOrdLin","FasCod","FasDsc","CCTCod","CCTDsc"}) , new Object[] {});
      }
      else
      {
         lblTxtmensaje_Caption = httpContext.getMessage( "Debe de Ingresar datos.", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxtmensaje_Internalname, "Caption", lblTxtmensaje_Caption, true);
      }
      httpContext.doAjaxRefresh();
   }

   public void S112( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV13Session.getValue(AV77Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV77Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV13Session.getValue(AV77Pgmname+"GridState"), null, null);
      }
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S122( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV13Session.getValue(AV77Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV77Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void e202CB2( )
   {
      AV54GXV1 = (int)(nGXsfl_87_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV54GXV1 > 0 ) && ( AV12ControlCalidad_CC_CC1_SDT.size() >= AV54GXV1 ) )
      {
         AV12ControlCalidad_CC_CC1_SDT.currentItem( ((app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item)AV12ControlCalidad_CC_CC1_SDT.elementAt(-1+AV54GXV1)) );
      }
      /* Controlcalidad_cc_cc1_sdt__procod_Click Routine */
      returnInSub = false ;
      AV41Cctcod = ((app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item)(AV12ControlCalidad_CC_CC1_SDT.currentItem())).getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Cctcod() ;
      AV39Procod = ((app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item)(AV12ControlCalidad_CC_CC1_SDT.currentItem())).getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Procod() ;
      AV40Barordlin = ((app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item)(AV12ControlCalidad_CC_CC1_SDT.currentItem())).getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Barordlin() ;
   }

   public void e212CB2( )
   {
      AV69GXV16 = (int)(nGXsfl_116_idx+GRIDCONTROLCALIDAD_CC1_SDTS_nFirstRecordOnPage) ;
      if ( ( AV69GXV16 > 0 ) && ( AV35ControlCalidad_CC1_SDT.size() >= AV69GXV16 ) )
      {
         AV35ControlCalidad_CC1_SDT.currentItem( ((app.controlcalidadhtd.SdtControlCalidad_CC1_SDT_Item)AV35ControlCalidad_CC1_SDT.elementAt(-1+AV69GXV16)) );
      }
      AV54GXV1 = (int)(nGXsfl_87_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV54GXV1 > 0 ) && ( AV12ControlCalidad_CC_CC1_SDT.size() >= AV54GXV1 ) )
      {
         AV12ControlCalidad_CC_CC1_SDT.currentItem( ((app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item)AV12ControlCalidad_CC_CC1_SDT.elementAt(-1+AV54GXV1)) );
      }
      /* Controlcalidad_cc_cc1_sdt__barordlin_Click Routine */
      returnInSub = false ;
      AV39Procod = ((app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item)(AV12ControlCalidad_CC_CC1_SDT.currentItem())).getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Procod() ;
      AV40Barordlin = ((app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item)(AV12ControlCalidad_CC_CC1_SDT.currentItem())).getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Barordlin() ;
      AV41Cctcod = ((app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item)(AV12ControlCalidad_CC_CC1_SDT.currentItem())).getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Cctcod() ;
      System.out.println( "----------------------------------------------------------------------------------------------------------------" );
      System.out.println( httpContext.getMessage( "&barcod=", "")+localUtil.format( DecimalUtil.doubleToDec(AV19Barcod), "ZZZZZZZ9")+httpContext.getMessage( "&barcodreo=", "")+localUtil.format( DecimalUtil.doubleToDec(AV18Barcodreo), "9")+httpContext.getMessage( "&barcodpar=", "")+AV17BarCodPar+httpContext.getMessage( "&Procod=", "")+AV39Procod+httpContext.getMessage( "&barordlin=", "")+localUtil.format( DecimalUtil.doubleToDec(AV40Barordlin), "ZZZ9")+httpContext.getMessage( "&cctcod=", "")+localUtil.format( DecimalUtil.doubleToDec(AV41Cctcod), "ZZZZZ9") );
      System.out.println( "----------------------------------------------------------------------------------------------------------------" );
      GXt_char1 = AV38ControlCalidad_CC1_SDT_json ;
      GXv_char4[0] = GXt_char1 ;
      new app.controlcalidadhtd.controlcalidad_cc1_prc(remoteHandle, context).execute( AV20EmprCod, AV19Barcod, AV18Barcodreo, AV17BarCodPar, AV39Procod, AV40Barordlin, AV41Cctcod, GXv_char4) ;
      controlcalidad_cc_cc1__wp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV38ControlCalidad_CC1_SDT_json = GXt_char1 ;
      AV35ControlCalidad_CC1_SDT.fromJSonString(AV38ControlCalidad_CC1_SDT_json, null);
      gx_BV116 = true ;
      gxgrgridcontrolcalidad_cc1_sdts_refresh( subGrid_Rows, subGridcontrolcalidad_cc1_sdts_Rows, AV20EmprCod, AV19Barcod, AV18Barcodreo, AV17BarCodPar, AV77Pgmname, AV12ControlCalidad_CC_CC1_SDT) ;
      /*  Sending Event outputs  */
      if ( gx_BV116 )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV35ControlCalidad_CC1_SDT", AV35ControlCalidad_CC1_SDT);
         nGXsfl_116_bak_idx = nGXsfl_116_idx ;
         gxgrgridcontrolcalidad_cc1_sdts_refresh( subGrid_Rows, subGridcontrolcalidad_cc1_sdts_Rows, AV20EmprCod, AV19Barcod, AV18Barcodreo, AV17BarCodPar, AV77Pgmname, AV12ControlCalidad_CC_CC1_SDT) ;
         nGXsfl_116_idx = nGXsfl_116_bak_idx ;
         sGXsfl_116_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_116_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1163( ) ;
      }
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV12ControlCalidad_CC_CC1_SDT", AV12ControlCalidad_CC_CC1_SDT);
      nGXsfl_87_bak_idx = nGXsfl_87_idx ;
      gxgrgrid_refresh( subGrid_Rows, subGridcontrolcalidad_cc1_sdts_Rows, AV20EmprCod, AV19Barcod, AV18Barcodreo, AV17BarCodPar, AV77Pgmname, AV12ControlCalidad_CC_CC1_SDT) ;
      nGXsfl_87_idx = nGXsfl_87_bak_idx ;
      sGXsfl_87_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_87_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_872( ) ;
   }

   private void e222CB3( )
   {
      /* Gridcontrolcalidad_cc1_sdts_Load Routine */
      returnInSub = false ;
      AV69GXV16 = 1 ;
      while ( AV69GXV16 <= AV35ControlCalidad_CC1_SDT.size() )
      {
         AV35ControlCalidad_CC1_SDT.currentItem( ((app.controlcalidadhtd.SdtControlCalidad_CC1_SDT_Item)AV35ControlCalidad_CC1_SDT.elementAt(-1+AV69GXV16)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(116) ;
         }
         if ( ( subGridcontrolcalidad_cc1_sdts_Islastpage == 1 ) || ( subGridcontrolcalidad_cc1_sdts_Rows == 0 ) || ( ( GRIDCONTROLCALIDAD_CC1_SDTS_nCurrentRecord >= GRIDCONTROLCALIDAD_CC1_SDTS_nFirstRecordOnPage ) && ( GRIDCONTROLCALIDAD_CC1_SDTS_nCurrentRecord < GRIDCONTROLCALIDAD_CC1_SDTS_nFirstRecordOnPage + subgridcontrolcalidad_cc1_sdts_fnc_recordsperpage( ) ) ) )
         {
            sendrow_1163( ) ;
            GRIDCONTROLCALIDAD_CC1_SDTS_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CC1_SDTS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDCONTROLCALIDAD_CC1_SDTS_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRIDCONTROLCALIDAD_CC1_SDTS_nCurrentRecord + 1 >= subgridcontrolcalidad_cc1_sdts_fnc_recordcount( ) )
            {
               GRIDCONTROLCALIDAD_CC1_SDTS_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CC1_SDTS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDCONTROLCALIDAD_CC1_SDTS_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRIDCONTROLCALIDAD_CC1_SDTS_nCurrentRecord = (long)(GRIDCONTROLCALIDAD_CC1_SDTS_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_116_Refreshing )
         {
            httpContext.doAjaxLoad(116, Gridcontrolcalidad_cc1_sdtsRow);
         }
         AV69GXV16 = (int)(AV69GXV16+1) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV20EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20EmprCod", AV20EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20EmprCod, "@!"))));
      AV19Barcod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Barcod), 8, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV19Barcod), "ZZZZZZZ9")));
      AV18Barcodreo = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Barcodreo", GXutil.str( AV18Barcodreo, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18Barcodreo), "9")));
      AV17BarCodPar = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17BarCodPar", AV17BarCodPar);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17BarCodPar, ""))));
      AV26CliCod = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26CliCod), 6, 0));
      AV24CliNom = (String)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24CliNom", AV24CliNom);
      AV27BarSer = (String)getParm(obj,6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27BarSer", AV27BarSer);
      AV28BarSerDsc = (String)getParm(obj,7) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28BarSerDsc", AV28BarSerDsc);
      AV29BarColNom = (String)getParm(obj,8) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29BarColNom", AV29BarColNom);
      AV30BarColNum = ((Number) GXutil.testNumericType( getParm(obj,9), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30BarColNum), 6, 0));
      AV31BarKgm = (java.math.BigDecimal)getParm(obj,10) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31BarKgm", GXutil.ltrimstr( AV31BarKgm, 9, 2));
      AV32BarMtr = (java.math.BigDecimal)getParm(obj,11) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32BarMtr", GXutil.ltrimstr( AV32BarMtr, 9, 2));
      AV25BarPie = ((Number) GXutil.testNumericType( getParm(obj,12), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25BarPie), 6, 0));
      AV33BarNHdr = (String)getParm(obj,13) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33BarNHdr", AV33BarNHdr);
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
      pa2CB2( ) ;
      ws2CB2( ) ;
      we2CB2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116153873", true, true);
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
      httpContext.AddJavascriptSource("controlcalidadhtd/controlcalidad_cc_cc1__wp.js", "?202682116153874", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_872( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_87_idx );
      edtavControlcalidad_cc_cc1_sdt__barordlin_Internalname = "CONTROLCALIDAD_CC_CC1_SDT__BARORDLIN_"+sGXsfl_87_idx ;
      edtavControlcalidad_cc_cc1_sdt__procod_Internalname = "CONTROLCALIDAD_CC_CC1_SDT__PROCOD_"+sGXsfl_87_idx ;
      edtavControlcalidad_cc_cc1_sdt__prodsc_Internalname = "CONTROLCALIDAD_CC_CC1_SDT__PRODSC_"+sGXsfl_87_idx ;
      edtavControlcalidad_cc_cc1_sdt__fascod_Internalname = "CONTROLCALIDAD_CC_CC1_SDT__FASCOD_"+sGXsfl_87_idx ;
      edtavControlcalidad_cc_cc1_sdt__fasdsc_Internalname = "CONTROLCALIDAD_CC_CC1_SDT__FASDSC_"+sGXsfl_87_idx ;
      edtavControlcalidad_cc_cc1_sdt__cctcod_Internalname = "CONTROLCALIDAD_CC_CC1_SDT__CCTCOD_"+sGXsfl_87_idx ;
      edtavControlcalidad_cc_cc1_sdt__cctdsc_Internalname = "CONTROLCALIDAD_CC_CC1_SDT__CCTDSC_"+sGXsfl_87_idx ;
      edtavControlcalidad_cc_cc1_sdt__ccopecod_Internalname = "CONTROLCALIDAD_CC_CC1_SDT__CCOPECOD_"+sGXsfl_87_idx ;
      edtavControlcalidad_cc_cc1_sdt__ccfch_Internalname = "CONTROLCALIDAD_CC_CC1_SDT__CCFCH_"+sGXsfl_87_idx ;
      edtavControlcalidad_cc_cc1_sdt__cc_Internalname = "CONTROLCALIDAD_CC_CC1_SDT__CC_"+sGXsfl_87_idx ;
      edtavControlcalidad_cc_cc1_sdt__ccfas_Internalname = "CONTROLCALIDAD_CC_CC1_SDT__CCFAS_"+sGXsfl_87_idx ;
      edtavControlcalidad_cc_cc1_sdt__ccser1_Internalname = "CONTROLCALIDAD_CC_CC1_SDT__CCSER1_"+sGXsfl_87_idx ;
      edtavControlcalidad_cc_cc1_sdt__errcontrol_Internalname = "CONTROLCALIDAD_CC_CC1_SDT__ERRCONTROL_"+sGXsfl_87_idx ;
      edtavControlcalidad_cc_cc1_sdt__barfasest_Internalname = "CONTROLCALIDAD_CC_CC1_SDT__BARFASEST_"+sGXsfl_87_idx ;
   }

   public void subsflControlProps_fel_872( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_87_fel_idx );
      edtavControlcalidad_cc_cc1_sdt__barordlin_Internalname = "CONTROLCALIDAD_CC_CC1_SDT__BARORDLIN_"+sGXsfl_87_fel_idx ;
      edtavControlcalidad_cc_cc1_sdt__procod_Internalname = "CONTROLCALIDAD_CC_CC1_SDT__PROCOD_"+sGXsfl_87_fel_idx ;
      edtavControlcalidad_cc_cc1_sdt__prodsc_Internalname = "CONTROLCALIDAD_CC_CC1_SDT__PRODSC_"+sGXsfl_87_fel_idx ;
      edtavControlcalidad_cc_cc1_sdt__fascod_Internalname = "CONTROLCALIDAD_CC_CC1_SDT__FASCOD_"+sGXsfl_87_fel_idx ;
      edtavControlcalidad_cc_cc1_sdt__fasdsc_Internalname = "CONTROLCALIDAD_CC_CC1_SDT__FASDSC_"+sGXsfl_87_fel_idx ;
      edtavControlcalidad_cc_cc1_sdt__cctcod_Internalname = "CONTROLCALIDAD_CC_CC1_SDT__CCTCOD_"+sGXsfl_87_fel_idx ;
      edtavControlcalidad_cc_cc1_sdt__cctdsc_Internalname = "CONTROLCALIDAD_CC_CC1_SDT__CCTDSC_"+sGXsfl_87_fel_idx ;
      edtavControlcalidad_cc_cc1_sdt__ccopecod_Internalname = "CONTROLCALIDAD_CC_CC1_SDT__CCOPECOD_"+sGXsfl_87_fel_idx ;
      edtavControlcalidad_cc_cc1_sdt__ccfch_Internalname = "CONTROLCALIDAD_CC_CC1_SDT__CCFCH_"+sGXsfl_87_fel_idx ;
      edtavControlcalidad_cc_cc1_sdt__cc_Internalname = "CONTROLCALIDAD_CC_CC1_SDT__CC_"+sGXsfl_87_fel_idx ;
      edtavControlcalidad_cc_cc1_sdt__ccfas_Internalname = "CONTROLCALIDAD_CC_CC1_SDT__CCFAS_"+sGXsfl_87_fel_idx ;
      edtavControlcalidad_cc_cc1_sdt__ccser1_Internalname = "CONTROLCALIDAD_CC_CC1_SDT__CCSER1_"+sGXsfl_87_fel_idx ;
      edtavControlcalidad_cc_cc1_sdt__errcontrol_Internalname = "CONTROLCALIDAD_CC_CC1_SDT__ERRCONTROL_"+sGXsfl_87_fel_idx ;
      edtavControlcalidad_cc_cc1_sdt__barfasest_Internalname = "CONTROLCALIDAD_CC_CC1_SDT__BARFASEST_"+sGXsfl_87_fel_idx ;
   }

   public void sendrow_872( )
   {
      subsflControlProps_872( ) ;
      wb2CB0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_87_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_87_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_87_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 88,'',false,'"+sGXsfl_87_idx+"',87)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_87_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               if ( ( AV54GXV1 > 0 ) && ( AV12ControlCalidad_CC_CC1_SDT.size() >= AV54GXV1 ) && (0==AV44GridActions) )
               {
                  AV44GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV44GridActions, 4, 0))))) ;
                  httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44GridActions), 4, 0));
               }
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV44GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONS.CLICK."+sGXsfl_87_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,88);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV44GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_87_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavControlcalidad_cc_cc1_sdt__barordlin_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item)AV12ControlCalidad_CC_CC1_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Barordlin(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavControlcalidad_cc_cc1_sdt__barordlin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item)AV12ControlCalidad_CC_CC1_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Barordlin()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item)AV12ControlCalidad_CC_CC1_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Barordlin()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+"ECONTROLCALIDAD_CC_CC1_SDT__BARORDLIN.CLICK."+sGXsfl_87_idx+"'","","","","",edtavControlcalidad_cc_cc1_sdt__barordlin_Jsonclick,Integer.valueOf(5),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavControlcalidad_cc_cc1_sdt__barordlin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(87),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavControlcalidad_cc_cc1_sdt__procod_Internalname,GXutil.rtrim( ((app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item)AV12ControlCalidad_CC_CC1_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Procod()),"","","'"+""+"'"+",false,"+"'"+"ECONTROLCALIDAD_CC_CC1_SDT__PROCOD.CLICK."+sGXsfl_87_idx+"'","","","","",edtavControlcalidad_cc_cc1_sdt__procod_Jsonclick,Integer.valueOf(5),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavControlcalidad_cc_cc1_sdt__procod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(87),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavControlcalidad_cc_cc1_sdt__prodsc_Internalname,GXutil.rtrim( ((app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item)AV12ControlCalidad_CC_CC1_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Prodsc()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavControlcalidad_cc_cc1_sdt__prodsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavControlcalidad_cc_cc1_sdt__prodsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(87),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavControlcalidad_cc_cc1_sdt__fascod_Internalname,GXutil.rtrim( ((app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item)AV12ControlCalidad_CC_CC1_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Fascod()),GXutil.rtrim( localUtil.format( ((app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item)AV12ControlCalidad_CC_CC1_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Fascod(), "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavControlcalidad_cc_cc1_sdt__fascod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavControlcalidad_cc_cc1_sdt__fascod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(87),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavControlcalidad_cc_cc1_sdt__fasdsc_Internalname,GXutil.rtrim( ((app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item)AV12ControlCalidad_CC_CC1_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Fasdsc()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavControlcalidad_cc_cc1_sdt__fasdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavControlcalidad_cc_cc1_sdt__fasdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(87),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavControlcalidad_cc_cc1_sdt__cctcod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item)AV12ControlCalidad_CC_CC1_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Cctcod(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavControlcalidad_cc_cc1_sdt__cctcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item)AV12ControlCalidad_CC_CC1_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Cctcod()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item)AV12ControlCalidad_CC_CC1_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Cctcod()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavControlcalidad_cc_cc1_sdt__cctcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavControlcalidad_cc_cc1_sdt__cctcod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(87),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavControlcalidad_cc_cc1_sdt__cctdsc_Internalname,GXutil.rtrim( ((app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item)AV12ControlCalidad_CC_CC1_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Cctdsc()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavControlcalidad_cc_cc1_sdt__cctdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavControlcalidad_cc_cc1_sdt__cctdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(87),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavControlcalidad_cc_cc1_sdt__ccopecod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item)AV12ControlCalidad_CC_CC1_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccopecod(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavControlcalidad_cc_cc1_sdt__ccopecod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item)AV12ControlCalidad_CC_CC1_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccopecod()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item)AV12ControlCalidad_CC_CC1_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccopecod()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavControlcalidad_cc_cc1_sdt__ccopecod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavControlcalidad_cc_cc1_sdt__ccopecod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(87),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavControlcalidad_cc_cc1_sdt__ccfch_Internalname,localUtil.format(((app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item)AV12ControlCalidad_CC_CC1_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccfch(), "99/99/99"),localUtil.format( ((app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item)AV12ControlCalidad_CC_CC1_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccfch(), "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavControlcalidad_cc_cc1_sdt__ccfch_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavControlcalidad_cc_cc1_sdt__ccfch_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(87),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavControlcalidad_cc_cc1_sdt__cc_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item)AV12ControlCalidad_CC_CC1_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Cc(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavControlcalidad_cc_cc1_sdt__cc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item)AV12ControlCalidad_CC_CC1_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Cc()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item)AV12ControlCalidad_CC_CC1_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Cc()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavControlcalidad_cc_cc1_sdt__cc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavControlcalidad_cc_cc1_sdt__cc_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(87),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavControlcalidad_cc_cc1_sdt__ccfas_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item)AV12ControlCalidad_CC_CC1_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccfas(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavControlcalidad_cc_cc1_sdt__ccfas_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item)AV12ControlCalidad_CC_CC1_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccfas()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item)AV12ControlCalidad_CC_CC1_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccfas()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavControlcalidad_cc_cc1_sdt__ccfas_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavControlcalidad_cc_cc1_sdt__ccfas_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(87),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavControlcalidad_cc_cc1_sdt__ccser1_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item)AV12ControlCalidad_CC_CC1_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccser1(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavControlcalidad_cc_cc1_sdt__ccser1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item)AV12ControlCalidad_CC_CC1_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccser1()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item)AV12ControlCalidad_CC_CC1_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccser1()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavControlcalidad_cc_cc1_sdt__ccser1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavControlcalidad_cc_cc1_sdt__ccser1_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(87),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavControlcalidad_cc_cc1_sdt__errcontrol_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item)AV12ControlCalidad_CC_CC1_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Errcontrol(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavControlcalidad_cc_cc1_sdt__errcontrol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item)AV12ControlCalidad_CC_CC1_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Errcontrol()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item)AV12ControlCalidad_CC_CC1_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Errcontrol()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavControlcalidad_cc_cc1_sdt__errcontrol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavControlcalidad_cc_cc1_sdt__errcontrol_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(87),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavControlcalidad_cc_cc1_sdt__barfasest_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item)AV12ControlCalidad_CC_CC1_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Barfasest(), (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavControlcalidad_cc_cc1_sdt__barfasest_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item)AV12ControlCalidad_CC_CC1_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Barfasest()), "9") : localUtil.format( DecimalUtil.doubleToDec(((app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item)AV12ControlCalidad_CC_CC1_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Barfasest()), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavControlcalidad_cc_cc1_sdt__barfasest_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavControlcalidad_cc_cc1_sdt__barfasest_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(87),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes2CB2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_87_idx = ((subGrid_Islastpage==1)&&(nGXsfl_87_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_87_idx+1) ;
         sGXsfl_87_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_87_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_872( ) ;
      }
      /* End function sendrow_872 */
   }

   public void subsflControlProps_1163( )
   {
      edtavControlcalidad_cc1_sdt__cctlin_Internalname = "CONTROLCALIDAD_CC1_SDT__CCTLIN_"+sGXsfl_116_idx ;
      edtavControlcalidad_cc1_sdt__cctlindsc_Internalname = "CONTROLCALIDAD_CC1_SDT__CCTLINDSC_"+sGXsfl_116_idx ;
      edtavControlcalidad_cc1_sdt__cctlindc2_Internalname = "CONTROLCALIDAD_CC1_SDT__CCTLINDC2_"+sGXsfl_116_idx ;
      edtavControlcalidad_cc1_sdt__ccmetodo_Internalname = "CONTROLCALIDAD_CC1_SDT__CCMETODO_"+sGXsfl_116_idx ;
      edtavControlcalidad_cc1_sdt__ccespecif2_Internalname = "CONTROLCALIDAD_CC1_SDT__CCESPECIF2_"+sGXsfl_116_idx ;
      edtavControlcalidad_cc1_sdt__ccval_Internalname = "CONTROLCALIDAD_CC1_SDT__CCVAL_"+sGXsfl_116_idx ;
      edtavControlcalidad_cc1_sdt__cctvaldsc_Internalname = "CONTROLCALIDAD_CC1_SDT__CCTVALDSC_"+sGXsfl_116_idx ;
   }

   public void subsflControlProps_fel_1163( )
   {
      edtavControlcalidad_cc1_sdt__cctlin_Internalname = "CONTROLCALIDAD_CC1_SDT__CCTLIN_"+sGXsfl_116_fel_idx ;
      edtavControlcalidad_cc1_sdt__cctlindsc_Internalname = "CONTROLCALIDAD_CC1_SDT__CCTLINDSC_"+sGXsfl_116_fel_idx ;
      edtavControlcalidad_cc1_sdt__cctlindc2_Internalname = "CONTROLCALIDAD_CC1_SDT__CCTLINDC2_"+sGXsfl_116_fel_idx ;
      edtavControlcalidad_cc1_sdt__ccmetodo_Internalname = "CONTROLCALIDAD_CC1_SDT__CCMETODO_"+sGXsfl_116_fel_idx ;
      edtavControlcalidad_cc1_sdt__ccespecif2_Internalname = "CONTROLCALIDAD_CC1_SDT__CCESPECIF2_"+sGXsfl_116_fel_idx ;
      edtavControlcalidad_cc1_sdt__ccval_Internalname = "CONTROLCALIDAD_CC1_SDT__CCVAL_"+sGXsfl_116_fel_idx ;
      edtavControlcalidad_cc1_sdt__cctvaldsc_Internalname = "CONTROLCALIDAD_CC1_SDT__CCTVALDSC_"+sGXsfl_116_fel_idx ;
   }

   public void sendrow_1163( )
   {
      subsflControlProps_1163( ) ;
      wb2CB0( ) ;
      if ( ( subGridcontrolcalidad_cc1_sdts_Rows * 1 == 0 ) || ( nGXsfl_116_idx <= subgridcontrolcalidad_cc1_sdts_fnc_recordsperpage( ) * 1 ) )
      {
         Gridcontrolcalidad_cc1_sdtsRow = GXWebRow.GetNew(context,Gridcontrolcalidad_cc1_sdtsContainer) ;
         if ( subGridcontrolcalidad_cc1_sdts_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGridcontrolcalidad_cc1_sdts_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGridcontrolcalidad_cc1_sdts_Class, "") != 0 )
            {
               subGridcontrolcalidad_cc1_sdts_Linesclass = subGridcontrolcalidad_cc1_sdts_Class+"Odd" ;
            }
         }
         else if ( subGridcontrolcalidad_cc1_sdts_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGridcontrolcalidad_cc1_sdts_Backstyle = (byte)(0) ;
            subGridcontrolcalidad_cc1_sdts_Backcolor = subGridcontrolcalidad_cc1_sdts_Allbackcolor ;
            if ( GXutil.strcmp(subGridcontrolcalidad_cc1_sdts_Class, "") != 0 )
            {
               subGridcontrolcalidad_cc1_sdts_Linesclass = subGridcontrolcalidad_cc1_sdts_Class+"Uniform" ;
            }
         }
         else if ( subGridcontrolcalidad_cc1_sdts_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGridcontrolcalidad_cc1_sdts_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGridcontrolcalidad_cc1_sdts_Class, "") != 0 )
            {
               subGridcontrolcalidad_cc1_sdts_Linesclass = subGridcontrolcalidad_cc1_sdts_Class+"Odd" ;
            }
            subGridcontrolcalidad_cc1_sdts_Backcolor = (int)(0x0) ;
         }
         else if ( subGridcontrolcalidad_cc1_sdts_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGridcontrolcalidad_cc1_sdts_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_116_idx) % (2))) == 0 )
            {
               subGridcontrolcalidad_cc1_sdts_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridcontrolcalidad_cc1_sdts_Class, "") != 0 )
               {
                  subGridcontrolcalidad_cc1_sdts_Linesclass = subGridcontrolcalidad_cc1_sdts_Class+"Even" ;
               }
            }
            else
            {
               subGridcontrolcalidad_cc1_sdts_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridcontrolcalidad_cc1_sdts_Class, "") != 0 )
               {
                  subGridcontrolcalidad_cc1_sdts_Linesclass = subGridcontrolcalidad_cc1_sdts_Class+"Odd" ;
               }
            }
         }
         if ( Gridcontrolcalidad_cc1_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_116_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Gridcontrolcalidad_cc1_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridcontrolcalidad_cc1_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavControlcalidad_cc1_sdt__cctlin_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.controlcalidadhtd.SdtControlCalidad_CC1_SDT_Item)AV35ControlCalidad_CC1_SDT.elementAt(-1+AV69GXV16)).getgxTv_SdtControlCalidad_CC1_SDT_Item_Cctlin(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavControlcalidad_cc1_sdt__cctlin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.controlcalidadhtd.SdtControlCalidad_CC1_SDT_Item)AV35ControlCalidad_CC1_SDT.elementAt(-1+AV69GXV16)).getgxTv_SdtControlCalidad_CC1_SDT_Item_Cctlin()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.controlcalidadhtd.SdtControlCalidad_CC1_SDT_Item)AV35ControlCalidad_CC1_SDT.elementAt(-1+AV69GXV16)).getgxTv_SdtControlCalidad_CC1_SDT_Item_Cctlin()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavControlcalidad_cc1_sdt__cctlin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavControlcalidad_cc1_sdt__cctlin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(116),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(false),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridcontrolcalidad_cc1_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridcontrolcalidad_cc1_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavControlcalidad_cc1_sdt__cctlindsc_Internalname,GXutil.rtrim( ((app.controlcalidadhtd.SdtControlCalidad_CC1_SDT_Item)AV35ControlCalidad_CC1_SDT.elementAt(-1+AV69GXV16)).getgxTv_SdtControlCalidad_CC1_SDT_Item_Cctlindsc()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavControlcalidad_cc1_sdt__cctlindsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavControlcalidad_cc1_sdt__cctlindsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(116),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(false),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridcontrolcalidad_cc1_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridcontrolcalidad_cc1_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavControlcalidad_cc1_sdt__cctlindc2_Internalname,GXutil.rtrim( ((app.controlcalidadhtd.SdtControlCalidad_CC1_SDT_Item)AV35ControlCalidad_CC1_SDT.elementAt(-1+AV69GXV16)).getgxTv_SdtControlCalidad_CC1_SDT_Item_Cctlindc2()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavControlcalidad_cc1_sdt__cctlindc2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavControlcalidad_cc1_sdt__cctlindc2_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(116),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(false),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridcontrolcalidad_cc1_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridcontrolcalidad_cc1_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavControlcalidad_cc1_sdt__ccmetodo_Internalname,GXutil.rtrim( ((app.controlcalidadhtd.SdtControlCalidad_CC1_SDT_Item)AV35ControlCalidad_CC1_SDT.elementAt(-1+AV69GXV16)).getgxTv_SdtControlCalidad_CC1_SDT_Item_Ccmetodo()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavControlcalidad_cc1_sdt__ccmetodo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavControlcalidad_cc1_sdt__ccmetodo_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(116),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(false),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridcontrolcalidad_cc1_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridcontrolcalidad_cc1_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavControlcalidad_cc1_sdt__ccespecif2_Internalname,GXutil.rtrim( ((app.controlcalidadhtd.SdtControlCalidad_CC1_SDT_Item)AV35ControlCalidad_CC1_SDT.elementAt(-1+AV69GXV16)).getgxTv_SdtControlCalidad_CC1_SDT_Item_Ccespecif2()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavControlcalidad_cc1_sdt__ccespecif2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavControlcalidad_cc1_sdt__ccespecif2_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(116),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(false),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridcontrolcalidad_cc1_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridcontrolcalidad_cc1_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavControlcalidad_cc1_sdt__ccval_Internalname,GXutil.rtrim( ((app.controlcalidadhtd.SdtControlCalidad_CC1_SDT_Item)AV35ControlCalidad_CC1_SDT.elementAt(-1+AV69GXV16)).getgxTv_SdtControlCalidad_CC1_SDT_Item_Ccval()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavControlcalidad_cc1_sdt__ccval_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavControlcalidad_cc1_sdt__ccval_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(116),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(false),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridcontrolcalidad_cc1_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridcontrolcalidad_cc1_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavControlcalidad_cc1_sdt__cctvaldsc_Internalname,GXutil.rtrim( ((app.controlcalidadhtd.SdtControlCalidad_CC1_SDT_Item)AV35ControlCalidad_CC1_SDT.elementAt(-1+AV69GXV16)).getgxTv_SdtControlCalidad_CC1_SDT_Item_Cctvaldsc()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavControlcalidad_cc1_sdt__cctvaldsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavControlcalidad_cc1_sdt__cctvaldsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(116),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(false),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes2CB3( ) ;
         Gridcontrolcalidad_cc1_sdtsContainer.AddRow(Gridcontrolcalidad_cc1_sdtsRow);
         nGXsfl_116_idx = ((subGridcontrolcalidad_cc1_sdts_Islastpage==1)&&(nGXsfl_116_idx+1>subgridcontrolcalidad_cc1_sdts_fnc_recordsperpage( )) ? 1 : nGXsfl_116_idx+1) ;
         sGXsfl_116_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_116_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1163( ) ;
      }
      /* End function sendrow_1163 */
   }

   public void startgridcontrol87( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"87\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ConvertToDDO"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Orden", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Proceso", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Operario", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "CC", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "CCfas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "CCser1", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Err Control", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Estado", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridContainer.AddObjectProperty("GridName", "Grid");
      }
      else
      {
         GridContainer.AddObjectProperty("GridName", "Grid");
         GridContainer.AddObjectProperty("Header", subGrid_Header);
         GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV44GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavControlcalidad_cc_cc1_sdt__barordlin_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavControlcalidad_cc_cc1_sdt__procod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavControlcalidad_cc_cc1_sdt__prodsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavControlcalidad_cc_cc1_sdt__fascod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavControlcalidad_cc_cc1_sdt__fasdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavControlcalidad_cc_cc1_sdt__cctcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavControlcalidad_cc_cc1_sdt__cctdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavControlcalidad_cc_cc1_sdt__ccopecod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavControlcalidad_cc_cc1_sdt__ccfch_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavControlcalidad_cc_cc1_sdt__cc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavControlcalidad_cc_cc1_sdt__ccfas_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavControlcalidad_cc_cc1_sdt__ccser1_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavControlcalidad_cc_cc1_sdt__errcontrol_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavControlcalidad_cc_cc1_sdt__barfasest_Enabled, (byte)(5), (byte)(0), ".", "")));
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

   public void startgridcontrol116( )
   {
      if ( Gridcontrolcalidad_cc1_sdtsContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"Gridcontrolcalidad_cc1_sdtsContainer"+"DivS\" data-gxgridid=\"116\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGridcontrolcalidad_cc1_sdts_Internalname, subGridcontrolcalidad_cc1_sdts_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subGridcontrolcalidad_cc1_sdts_Backcolorstyle == 0 )
         {
            subGridcontrolcalidad_cc1_sdts_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subGridcontrolcalidad_cc1_sdts_Class) > 0 )
            {
               subGridcontrolcalidad_cc1_sdts_Linesclass = subGridcontrolcalidad_cc1_sdts_Class+"Title" ;
            }
         }
         else
         {
            subGridcontrolcalidad_cc1_sdts_Titlebackstyle = (byte)(1) ;
            if ( subGridcontrolcalidad_cc1_sdts_Backcolorstyle == 1 )
            {
               subGridcontrolcalidad_cc1_sdts_Titlebackcolor = subGridcontrolcalidad_cc1_sdts_Allbackcolor ;
               if ( GXutil.len( subGridcontrolcalidad_cc1_sdts_Class) > 0 )
               {
                  subGridcontrolcalidad_cc1_sdts_Linesclass = subGridcontrolcalidad_cc1_sdts_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subGridcontrolcalidad_cc1_sdts_Class) > 0 )
               {
                  subGridcontrolcalidad_cc1_sdts_Linesclass = subGridcontrolcalidad_cc1_sdts_Class+"Title" ;
               }
            }
         }
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "# Lín", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion (cont)", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metodo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Especificacion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Valor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         Gridcontrolcalidad_cc1_sdtsContainer.AddObjectProperty("GridName", "Gridcontrolcalidad_cc1_sdts");
      }
      else
      {
         Gridcontrolcalidad_cc1_sdtsContainer.AddObjectProperty("GridName", "Gridcontrolcalidad_cc1_sdts");
         Gridcontrolcalidad_cc1_sdtsContainer.AddObjectProperty("Header", subGridcontrolcalidad_cc1_sdts_Header);
         Gridcontrolcalidad_cc1_sdtsContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
         Gridcontrolcalidad_cc1_sdtsContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         Gridcontrolcalidad_cc1_sdtsContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         Gridcontrolcalidad_cc1_sdtsContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridcontrolcalidad_cc1_sdts_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         Gridcontrolcalidad_cc1_sdtsContainer.AddObjectProperty("CmpContext", "");
         Gridcontrolcalidad_cc1_sdtsContainer.AddObjectProperty("InMasterPage", "false");
         Gridcontrolcalidad_cc1_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridcontrolcalidad_cc1_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavControlcalidad_cc1_sdt__cctlin_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridcontrolcalidad_cc1_sdtsContainer.AddColumnProperties(Gridcontrolcalidad_cc1_sdtsColumn);
         Gridcontrolcalidad_cc1_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridcontrolcalidad_cc1_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavControlcalidad_cc1_sdt__cctlindsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridcontrolcalidad_cc1_sdtsContainer.AddColumnProperties(Gridcontrolcalidad_cc1_sdtsColumn);
         Gridcontrolcalidad_cc1_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridcontrolcalidad_cc1_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavControlcalidad_cc1_sdt__cctlindc2_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridcontrolcalidad_cc1_sdtsContainer.AddColumnProperties(Gridcontrolcalidad_cc1_sdtsColumn);
         Gridcontrolcalidad_cc1_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridcontrolcalidad_cc1_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavControlcalidad_cc1_sdt__ccmetodo_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridcontrolcalidad_cc1_sdtsContainer.AddColumnProperties(Gridcontrolcalidad_cc1_sdtsColumn);
         Gridcontrolcalidad_cc1_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridcontrolcalidad_cc1_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavControlcalidad_cc1_sdt__ccespecif2_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridcontrolcalidad_cc1_sdtsContainer.AddColumnProperties(Gridcontrolcalidad_cc1_sdtsColumn);
         Gridcontrolcalidad_cc1_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridcontrolcalidad_cc1_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavControlcalidad_cc1_sdt__ccval_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridcontrolcalidad_cc1_sdtsContainer.AddColumnProperties(Gridcontrolcalidad_cc1_sdtsColumn);
         Gridcontrolcalidad_cc1_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridcontrolcalidad_cc1_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavControlcalidad_cc1_sdt__cctvaldsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridcontrolcalidad_cc1_sdtsContainer.AddColumnProperties(Gridcontrolcalidad_cc1_sdtsColumn);
         Gridcontrolcalidad_cc1_sdtsContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridcontrolcalidad_cc1_sdts_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         Gridcontrolcalidad_cc1_sdtsContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridcontrolcalidad_cc1_sdts_Allowselection, (byte)(1), (byte)(0), ".", "")));
         Gridcontrolcalidad_cc1_sdtsContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridcontrolcalidad_cc1_sdts_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         Gridcontrolcalidad_cc1_sdtsContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridcontrolcalidad_cc1_sdts_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         Gridcontrolcalidad_cc1_sdtsContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridcontrolcalidad_cc1_sdts_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         Gridcontrolcalidad_cc1_sdtsContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridcontrolcalidad_cc1_sdts_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         Gridcontrolcalidad_cc1_sdtsContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridcontrolcalidad_cc1_sdts_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void init_default_properties( )
   {
      edtavBarnhdr_Internalname = "vBARNHDR" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      edtavClicod_Internalname = "vCLICOD" ;
      edtavClinom_Internalname = "vCLINOM" ;
      edtavBarser_Internalname = "vBARSER" ;
      edtavBarserdsc_Internalname = "vBARSERDSC" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      edtavBarcolnom_Internalname = "vBARCOLNOM" ;
      edtavBarcolnum_Internalname = "vBARCOLNUM" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      edtavBarkgm_Internalname = "vBARKGM" ;
      edtavBarmtr_Internalname = "vBARMTR" ;
      edtavBarpie_Internalname = "vBARPIE" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      lblTxtmensaje_Internalname = "TXTMENSAJE" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtavControlcalidad_cc_cc1_sdt__barordlin_Internalname = "CONTROLCALIDAD_CC_CC1_SDT__BARORDLIN" ;
      edtavControlcalidad_cc_cc1_sdt__procod_Internalname = "CONTROLCALIDAD_CC_CC1_SDT__PROCOD" ;
      edtavControlcalidad_cc_cc1_sdt__prodsc_Internalname = "CONTROLCALIDAD_CC_CC1_SDT__PRODSC" ;
      edtavControlcalidad_cc_cc1_sdt__fascod_Internalname = "CONTROLCALIDAD_CC_CC1_SDT__FASCOD" ;
      edtavControlcalidad_cc_cc1_sdt__fasdsc_Internalname = "CONTROLCALIDAD_CC_CC1_SDT__FASDSC" ;
      edtavControlcalidad_cc_cc1_sdt__cctcod_Internalname = "CONTROLCALIDAD_CC_CC1_SDT__CCTCOD" ;
      edtavControlcalidad_cc_cc1_sdt__cctdsc_Internalname = "CONTROLCALIDAD_CC_CC1_SDT__CCTDSC" ;
      edtavControlcalidad_cc_cc1_sdt__ccopecod_Internalname = "CONTROLCALIDAD_CC_CC1_SDT__CCOPECOD" ;
      edtavControlcalidad_cc_cc1_sdt__ccfch_Internalname = "CONTROLCALIDAD_CC_CC1_SDT__CCFCH" ;
      edtavControlcalidad_cc_cc1_sdt__cc_Internalname = "CONTROLCALIDAD_CC_CC1_SDT__CC" ;
      edtavControlcalidad_cc_cc1_sdt__ccfas_Internalname = "CONTROLCALIDAD_CC_CC1_SDT__CCFAS" ;
      edtavControlcalidad_cc_cc1_sdt__ccser1_Internalname = "CONTROLCALIDAD_CC_CC1_SDT__CCSER1" ;
      edtavControlcalidad_cc_cc1_sdt__errcontrol_Internalname = "CONTROLCALIDAD_CC_CC1_SDT__ERRCONTROL" ;
      edtavControlcalidad_cc_cc1_sdt__barfasest_Internalname = "CONTROLCALIDAD_CC_CC1_SDT__BARFASEST" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavControlcalidad_cc1_sdt__cctlin_Internalname = "CONTROLCALIDAD_CC1_SDT__CCTLIN" ;
      edtavControlcalidad_cc1_sdt__cctlindsc_Internalname = "CONTROLCALIDAD_CC1_SDT__CCTLINDSC" ;
      edtavControlcalidad_cc1_sdt__cctlindc2_Internalname = "CONTROLCALIDAD_CC1_SDT__CCTLINDC2" ;
      edtavControlcalidad_cc1_sdt__ccmetodo_Internalname = "CONTROLCALIDAD_CC1_SDT__CCMETODO" ;
      edtavControlcalidad_cc1_sdt__ccespecif2_Internalname = "CONTROLCALIDAD_CC1_SDT__CCESPECIF2" ;
      edtavControlcalidad_cc1_sdt__ccval_Internalname = "CONTROLCALIDAD_CC1_SDT__CCVAL" ;
      edtavControlcalidad_cc1_sdt__cctvaldsc_Internalname = "CONTROLCALIDAD_CC1_SDT__CCTVALDSC" ;
      Gridcontrolcalidad_cc1_sdtspaginationbar_Internalname = "GRIDCONTROLCALIDAD_CC1_SDTSPAGINATIONBAR" ;
      divGridcontrolcalidad_cc1_sdtstablewithpaginationbar_Internalname = "GRIDCONTROLCALIDAD_CC1_SDTSTABLEWITHPAGINATIONBAR" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Grid_titlescategories_Internalname = "GRID_TITLESCATEGORIES" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      Gridcontrolcalidad_cc1_sdts_empowerer_Internalname = "GRIDCONTROLCALIDAD_CC1_SDTS_EMPOWERER" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGrid_Internalname = "GRID" ;
      subGridcontrolcalidad_cc1_sdts_Internalname = "GRIDCONTROLCALIDAD_CC1_SDTS" ;
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
      subGridcontrolcalidad_cc1_sdts_Allowcollapsing = (byte)(0) ;
      subGridcontrolcalidad_cc1_sdts_Allowselection = (byte)(0) ;
      subGridcontrolcalidad_cc1_sdts_Header = "" ;
      subGrid_Allowcollapsing = (byte)(0) ;
      subGrid_Allowhovering = (byte)(-1) ;
      subGrid_Allowselection = (byte)(1) ;
      subGrid_Header = "" ;
      edtavControlcalidad_cc1_sdt__cctvaldsc_Jsonclick = "" ;
      edtavControlcalidad_cc1_sdt__cctvaldsc_Enabled = 0 ;
      edtavControlcalidad_cc1_sdt__ccval_Jsonclick = "" ;
      edtavControlcalidad_cc1_sdt__ccval_Enabled = 0 ;
      edtavControlcalidad_cc1_sdt__ccespecif2_Jsonclick = "" ;
      edtavControlcalidad_cc1_sdt__ccespecif2_Enabled = 0 ;
      edtavControlcalidad_cc1_sdt__ccmetodo_Jsonclick = "" ;
      edtavControlcalidad_cc1_sdt__ccmetodo_Enabled = 0 ;
      edtavControlcalidad_cc1_sdt__cctlindc2_Jsonclick = "" ;
      edtavControlcalidad_cc1_sdt__cctlindc2_Enabled = 0 ;
      edtavControlcalidad_cc1_sdt__cctlindsc_Jsonclick = "" ;
      edtavControlcalidad_cc1_sdt__cctlindsc_Enabled = 0 ;
      edtavControlcalidad_cc1_sdt__cctlin_Jsonclick = "" ;
      edtavControlcalidad_cc1_sdt__cctlin_Enabled = 0 ;
      subGridcontrolcalidad_cc1_sdts_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGridcontrolcalidad_cc1_sdts_Backcolorstyle = (byte)(0) ;
      edtavControlcalidad_cc_cc1_sdt__barfasest_Jsonclick = "" ;
      edtavControlcalidad_cc_cc1_sdt__barfasest_Enabled = 0 ;
      edtavControlcalidad_cc_cc1_sdt__errcontrol_Jsonclick = "" ;
      edtavControlcalidad_cc_cc1_sdt__errcontrol_Enabled = 0 ;
      edtavControlcalidad_cc_cc1_sdt__ccser1_Jsonclick = "" ;
      edtavControlcalidad_cc_cc1_sdt__ccser1_Enabled = 0 ;
      edtavControlcalidad_cc_cc1_sdt__ccfas_Jsonclick = "" ;
      edtavControlcalidad_cc_cc1_sdt__ccfas_Enabled = 0 ;
      edtavControlcalidad_cc_cc1_sdt__cc_Jsonclick = "" ;
      edtavControlcalidad_cc_cc1_sdt__cc_Enabled = 0 ;
      edtavControlcalidad_cc_cc1_sdt__ccfch_Jsonclick = "" ;
      edtavControlcalidad_cc_cc1_sdt__ccfch_Enabled = 0 ;
      edtavControlcalidad_cc_cc1_sdt__ccopecod_Jsonclick = "" ;
      edtavControlcalidad_cc_cc1_sdt__ccopecod_Enabled = 0 ;
      edtavControlcalidad_cc_cc1_sdt__cctdsc_Jsonclick = "" ;
      edtavControlcalidad_cc_cc1_sdt__cctdsc_Enabled = 0 ;
      edtavControlcalidad_cc_cc1_sdt__cctcod_Jsonclick = "" ;
      edtavControlcalidad_cc_cc1_sdt__cctcod_Enabled = 0 ;
      edtavControlcalidad_cc_cc1_sdt__fasdsc_Jsonclick = "" ;
      edtavControlcalidad_cc_cc1_sdt__fasdsc_Enabled = 0 ;
      edtavControlcalidad_cc_cc1_sdt__fascod_Jsonclick = "" ;
      edtavControlcalidad_cc_cc1_sdt__fascod_Enabled = 0 ;
      edtavControlcalidad_cc_cc1_sdt__prodsc_Jsonclick = "" ;
      edtavControlcalidad_cc_cc1_sdt__prodsc_Enabled = 0 ;
      edtavControlcalidad_cc_cc1_sdt__procod_Jsonclick = "" ;
      edtavControlcalidad_cc_cc1_sdt__procod_Enabled = 0 ;
      edtavControlcalidad_cc_cc1_sdt__barordlin_Jsonclick = "" ;
      edtavControlcalidad_cc_cc1_sdt__barordlin_Enabled = 0 ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavControlcalidad_cc1_sdt__cctvaldsc_Enabled = -1 ;
      edtavControlcalidad_cc1_sdt__ccval_Enabled = -1 ;
      edtavControlcalidad_cc1_sdt__ccespecif2_Enabled = -1 ;
      edtavControlcalidad_cc1_sdt__ccmetodo_Enabled = -1 ;
      edtavControlcalidad_cc1_sdt__cctlindc2_Enabled = -1 ;
      edtavControlcalidad_cc1_sdt__cctlindsc_Enabled = -1 ;
      edtavControlcalidad_cc1_sdt__cctlin_Enabled = -1 ;
      edtavControlcalidad_cc_cc1_sdt__barfasest_Enabled = -1 ;
      edtavControlcalidad_cc_cc1_sdt__errcontrol_Enabled = -1 ;
      edtavControlcalidad_cc_cc1_sdt__ccser1_Enabled = -1 ;
      edtavControlcalidad_cc_cc1_sdt__ccfas_Enabled = -1 ;
      edtavControlcalidad_cc_cc1_sdt__cc_Enabled = -1 ;
      edtavControlcalidad_cc_cc1_sdt__ccfch_Enabled = -1 ;
      edtavControlcalidad_cc_cc1_sdt__ccopecod_Enabled = -1 ;
      edtavControlcalidad_cc_cc1_sdt__cctdsc_Enabled = -1 ;
      edtavControlcalidad_cc_cc1_sdt__cctcod_Enabled = -1 ;
      edtavControlcalidad_cc_cc1_sdt__fasdsc_Enabled = -1 ;
      edtavControlcalidad_cc_cc1_sdt__fascod_Enabled = -1 ;
      edtavControlcalidad_cc_cc1_sdt__prodsc_Enabled = -1 ;
      edtavControlcalidad_cc_cc1_sdt__procod_Enabled = -1 ;
      edtavControlcalidad_cc_cc1_sdt__barordlin_Enabled = -1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      lblTxtmensaje_Caption = "" ;
      edtavBarpie_Jsonclick = "" ;
      edtavBarpie_Enabled = 0 ;
      edtavBarmtr_Jsonclick = "" ;
      edtavBarmtr_Enabled = 0 ;
      edtavBarkgm_Jsonclick = "" ;
      edtavBarkgm_Enabled = 0 ;
      edtavBarcolnum_Jsonclick = "" ;
      edtavBarcolnum_Enabled = 0 ;
      edtavBarcolnom_Jsonclick = "" ;
      edtavBarcolnom_Enabled = 0 ;
      edtavBarserdsc_Jsonclick = "" ;
      edtavBarserdsc_Enabled = 0 ;
      edtavBarser_Jsonclick = "" ;
      edtavBarser_Enabled = 0 ;
      edtavClinom_Jsonclick = "" ;
      edtavClinom_Enabled = 0 ;
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Enabled = 0 ;
      edtavBarnhdr_Jsonclick = "" ;
      edtavBarnhdr_Enabled = 0 ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;;;" ;
      Grid_empowerer_Hascategories = GXutil.toBoolean( -1) ;
      Grid_titlescategories_Gridtitlescategories = ";;;;;;;;Calidad;Calidad;Tablas;Tablas;Tablas;;" ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = httpContext.getMessage( "Mas datos (Orden)", "") ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
      Gridcontrolcalidad_cc1_sdtspaginationbar_Rowsperpagecaption = "WWP_PagingRowsPerPage" ;
      Gridcontrolcalidad_cc1_sdtspaginationbar_Emptygridcaption = "WWP_PagingEmptyGridCaption" ;
      Gridcontrolcalidad_cc1_sdtspaginationbar_Caption = httpContext.getMessage( "WWP_PagingCaption", "") ;
      Gridcontrolcalidad_cc1_sdtspaginationbar_Next = "WWP_PagingNextCaption" ;
      Gridcontrolcalidad_cc1_sdtspaginationbar_Previous = "WWP_PagingPreviousCaption" ;
      Gridcontrolcalidad_cc1_sdtspaginationbar_Rowsperpageoptions = "5:WWP_Rows5,10:WWP_Rows10,20:WWP_Rows20,50:WWP_Rows50" ;
      Gridcontrolcalidad_cc1_sdtspaginationbar_Rowsperpageselectedvalue = 10 ;
      Gridcontrolcalidad_cc1_sdtspaginationbar_Rowsperpageselector = GXutil.toBoolean( -1) ;
      Gridcontrolcalidad_cc1_sdtspaginationbar_Emptygridclass = "PaginationBarEmptyGrid" ;
      Gridcontrolcalidad_cc1_sdtspaginationbar_Pagingcaptionposition = "Left" ;
      Gridcontrolcalidad_cc1_sdtspaginationbar_Pagingbuttonsposition = "Right" ;
      Gridcontrolcalidad_cc1_sdtspaginationbar_Pagestoshow = 5 ;
      Gridcontrolcalidad_cc1_sdtspaginationbar_Showlast = GXutil.toBoolean( 0) ;
      Gridcontrolcalidad_cc1_sdtspaginationbar_Shownext = GXutil.toBoolean( -1) ;
      Gridcontrolcalidad_cc1_sdtspaginationbar_Showprevious = GXutil.toBoolean( -1) ;
      Gridcontrolcalidad_cc1_sdtspaginationbar_Showfirst = GXutil.toBoolean( 0) ;
      Gridcontrolcalidad_cc1_sdtspaginationbar_Class = "PaginationBar" ;
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
      Dvpanel_tableheader_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_tableheader_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tableheader_Title = httpContext.getMessage( "Informacion", "") ;
      Dvpanel_tableheader_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tableheader_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableheader_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Control de Calidad por Nº HDR ( Fases)", "") );
      subGridcontrolcalidad_cc1_sdts_Rows = 0 ;
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_87_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         if ( ( AV54GXV1 > 0 ) && ( AV12ControlCalidad_CC_CC1_SDT.size() >= AV54GXV1 ) && (0==AV44GridActions) )
         {
            AV44GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV44GridActions, 4, 0))))) ;
            httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44GridActions), 4, 0));
         }
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'GRIDCONTROLCALIDAD_CC1_SDTS_nFirstRecordOnPage'},{av:'GRIDCONTROLCALIDAD_CC1_SDTS_nEOF'},{av:'AV35ControlCalidad_CC1_SDT',fld:'vCONTROLCALIDAD_CC1_SDT',grid:116,pic:''},{av:'nGXsfl_116_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:116},{av:'nRC_GXsfl_116',ctrl:'GRIDCONTROLCALIDAD_CC1_SDTS',prop:'GridRC',grid:116},{av:'subGridcontrolcalidad_cc1_sdts_Rows',ctrl:'GRIDCONTROLCALIDAD_CC1_SDTS',prop:'Rows'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV20EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV19Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV18Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV17BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV77Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12ControlCalidad_CC_CC1_SDT',fld:'vCONTROLCALIDAD_CC_CC1_SDT',grid:87,pic:'',hsh:true},{av:'nGXsfl_87_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:87},{av:'nRC_GXsfl_87',ctrl:'GRID',prop:'GridRC',grid:87}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV15GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV16GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV36GridControlCalidad_CC1_SDTsCurrentPage',fld:'vGRIDCONTROLCALIDAD_CC1_SDTSCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV37GridControlCalidad_CC1_SDTsPageCount',fld:'vGRIDCONTROLCALIDAD_CC1_SDTSPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV12ControlCalidad_CC_CC1_SDT',fld:'vCONTROLCALIDAD_CC_CC1_SDT',grid:87,pic:'',hsh:true},{av:'nGXsfl_87_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:87},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_87',ctrl:'GRID',prop:'GridRC',grid:87}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e112CB2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'subGridcontrolcalidad_cc1_sdts_Rows',ctrl:'GRIDCONTROLCALIDAD_CC1_SDTS',prop:'Rows'},{av:'AV20EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV19Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV18Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV17BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV77Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12ControlCalidad_CC_CC1_SDT',fld:'vCONTROLCALIDAD_CC_CC1_SDT',grid:87,pic:'',hsh:true},{av:'nGXsfl_87_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:87},{av:'nRC_GXsfl_87',ctrl:'GRID',prop:'GridRC',grid:87},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e122CB2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'subGridcontrolcalidad_cc1_sdts_Rows',ctrl:'GRIDCONTROLCALIDAD_CC1_SDTS',prop:'Rows'},{av:'AV20EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV19Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV18Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV17BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV77Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12ControlCalidad_CC_CC1_SDT',fld:'vCONTROLCALIDAD_CC_CC1_SDT',grid:87,pic:'',hsh:true},{av:'nGXsfl_87_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:87},{av:'nRC_GXsfl_87',ctrl:'GRID',prop:'GridRC',grid:87},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e182CB2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV44GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e192CB2',iparms:[{av:'cmbavGridactions'},{av:'AV44GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'subGridcontrolcalidad_cc1_sdts_Rows',ctrl:'GRIDCONTROLCALIDAD_CC1_SDTS',prop:'Rows'},{av:'AV20EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV19Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV18Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV17BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV77Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12ControlCalidad_CC_CC1_SDT',fld:'vCONTROLCALIDAD_CC_CC1_SDT',grid:87,pic:'',hsh:true},{av:'nGXsfl_87_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:87},{av:'nRC_GXsfl_87',ctrl:'GRID',prop:'GridRC',grid:87},{av:'GRIDCONTROLCALIDAD_CC1_SDTS_nFirstRecordOnPage'},{av:'GRIDCONTROLCALIDAD_CC1_SDTS_nEOF'},{av:'AV35ControlCalidad_CC1_SDT',fld:'vCONTROLCALIDAD_CC1_SDT',grid:116,pic:''},{av:'nGXsfl_116_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:116},{av:'nRC_GXsfl_116',ctrl:'GRIDCONTROLCALIDAD_CC1_SDTS',prop:'GridRC',grid:116}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV44GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'lblTxtmensaje_Caption',ctrl:'TXTMENSAJE',prop:'Caption'},{av:'AV15GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV16GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV36GridControlCalidad_CC1_SDTsCurrentPage',fld:'vGRIDCONTROLCALIDAD_CC1_SDTSCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV37GridControlCalidad_CC1_SDTsPageCount',fld:'vGRIDCONTROLCALIDAD_CC1_SDTSPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV12ControlCalidad_CC_CC1_SDT',fld:'vCONTROLCALIDAD_CC_CC1_SDT',grid:87,pic:'',hsh:true},{av:'nGXsfl_87_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:87},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_87',ctrl:'GRID',prop:'GridRC',grid:87}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e152CB2',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("GRIDCONTROLCALIDAD_CC1_SDTS.LOAD","{handler:'e222CB3',iparms:[]");
      setEventMetadata("GRIDCONTROLCALIDAD_CC1_SDTS.LOAD",",oparms:[]}");
      setEventMetadata("GRIDCONTROLCALIDAD_CC1_SDTSPAGINATIONBAR.CHANGEPAGE","{handler:'e132CB2',iparms:[{av:'GRIDCONTROLCALIDAD_CC1_SDTS_nFirstRecordOnPage'},{av:'GRIDCONTROLCALIDAD_CC1_SDTS_nEOF'},{av:'AV35ControlCalidad_CC1_SDT',fld:'vCONTROLCALIDAD_CC1_SDT',grid:116,pic:''},{av:'nGXsfl_116_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:116},{av:'nRC_GXsfl_116',ctrl:'GRIDCONTROLCALIDAD_CC1_SDTS',prop:'GridRC',grid:116},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'subGridcontrolcalidad_cc1_sdts_Rows',ctrl:'GRIDCONTROLCALIDAD_CC1_SDTS',prop:'Rows'},{av:'AV20EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV19Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV18Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV17BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV77Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12ControlCalidad_CC_CC1_SDT',fld:'vCONTROLCALIDAD_CC_CC1_SDT',grid:87,pic:'',hsh:true},{av:'nGXsfl_87_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:87},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_87',ctrl:'GRID',prop:'GridRC',grid:87},{av:'Gridcontrolcalidad_cc1_sdtspaginationbar_Selectedpage',ctrl:'GRIDCONTROLCALIDAD_CC1_SDTSPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDCONTROLCALIDAD_CC1_SDTSPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDCONTROLCALIDAD_CC1_SDTSPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e142CB2',iparms:[{av:'GRIDCONTROLCALIDAD_CC1_SDTS_nFirstRecordOnPage'},{av:'GRIDCONTROLCALIDAD_CC1_SDTS_nEOF'},{av:'AV35ControlCalidad_CC1_SDT',fld:'vCONTROLCALIDAD_CC1_SDT',grid:116,pic:''},{av:'nGXsfl_116_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:116},{av:'nRC_GXsfl_116',ctrl:'GRIDCONTROLCALIDAD_CC1_SDTS',prop:'GridRC',grid:116},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'subGridcontrolcalidad_cc1_sdts_Rows',ctrl:'GRIDCONTROLCALIDAD_CC1_SDTS',prop:'Rows'},{av:'AV20EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV19Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV18Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV17BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV77Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12ControlCalidad_CC_CC1_SDT',fld:'vCONTROLCALIDAD_CC_CC1_SDT',grid:87,pic:'',hsh:true},{av:'nGXsfl_87_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:87},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_87',ctrl:'GRID',prop:'GridRC',grid:87},{av:'Gridcontrolcalidad_cc1_sdtspaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDCONTROLCALIDAD_CC1_SDTSPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDCONTROLCALIDAD_CC1_SDTSPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGridcontrolcalidad_cc1_sdts_Rows',ctrl:'GRIDCONTROLCALIDAD_CC1_SDTS',prop:'Rows'}]}");
      setEventMetadata("CONTROLCALIDAD_CC_CC1_SDT__PROCOD.CLICK","{handler:'e202CB2',iparms:[{av:'AV12ControlCalidad_CC_CC1_SDT',fld:'vCONTROLCALIDAD_CC_CC1_SDT',grid:87,pic:'',hsh:true},{av:'nGXsfl_87_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:87},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_87',ctrl:'GRID',prop:'GridRC',grid:87}]");
      setEventMetadata("CONTROLCALIDAD_CC_CC1_SDT__PROCOD.CLICK",",oparms:[]}");
      setEventMetadata("CONTROLCALIDAD_CC_CC1_SDT__BARORDLIN.CLICK","{handler:'e212CB2',iparms:[{av:'GRIDCONTROLCALIDAD_CC1_SDTS_nFirstRecordOnPage'},{av:'GRIDCONTROLCALIDAD_CC1_SDTS_nEOF'},{av:'AV35ControlCalidad_CC1_SDT',fld:'vCONTROLCALIDAD_CC1_SDT',grid:116,pic:''},{av:'nGXsfl_116_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:116},{av:'nRC_GXsfl_116',ctrl:'GRIDCONTROLCALIDAD_CC1_SDTS',prop:'GridRC',grid:116},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'subGridcontrolcalidad_cc1_sdts_Rows',ctrl:'GRIDCONTROLCALIDAD_CC1_SDTS',prop:'Rows'},{av:'AV20EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV19Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV18Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV17BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV77Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12ControlCalidad_CC_CC1_SDT',fld:'vCONTROLCALIDAD_CC_CC1_SDT',grid:87,pic:'',hsh:true},{av:'nGXsfl_87_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:87},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_87',ctrl:'GRID',prop:'GridRC',grid:87},{av:'GRID_nEOF'}]");
      setEventMetadata("CONTROLCALIDAD_CC_CC1_SDT__BARORDLIN.CLICK",",oparms:[{av:'AV35ControlCalidad_CC1_SDT',fld:'vCONTROLCALIDAD_CC1_SDT',grid:116,pic:''},{av:'nGXsfl_116_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:116},{av:'GRIDCONTROLCALIDAD_CC1_SDTS_nFirstRecordOnPage'},{av:'nRC_GXsfl_116',ctrl:'GRIDCONTROLCALIDAD_CC1_SDTS',prop:'GridRC',grid:116},{av:'AV15GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV16GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV36GridControlCalidad_CC1_SDTsCurrentPage',fld:'vGRIDCONTROLCALIDAD_CC1_SDTSCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV37GridControlCalidad_CC1_SDTsPageCount',fld:'vGRIDCONTROLCALIDAD_CC1_SDTSPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV12ControlCalidad_CC_CC1_SDT',fld:'vCONTROLCALIDAD_CC_CC1_SDT',grid:87,pic:'',hsh:true},{av:'nGXsfl_87_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:87},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_87',ctrl:'GRID',prop:'GridRC',grid:87}]}");
      setEventMetadata("VALIDV_GXV15","{handler:'validv_Gxv15',iparms:[]");
      setEventMetadata("VALIDV_GXV15",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Gxv23',iparms:[]");
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
      wcpOAV20EmprCod = "" ;
      wcpOAV17BarCodPar = "" ;
      wcpOAV24CliNom = "" ;
      wcpOAV27BarSer = "" ;
      wcpOAV28BarSerDsc = "" ;
      wcpOAV29BarColNom = "" ;
      wcpOAV31BarKgm = DecimalUtil.ZERO ;
      wcpOAV32BarMtr = DecimalUtil.ZERO ;
      wcpOAV33BarNHdr = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Gridcontrolcalidad_cc1_sdtspaginationbar_Selectedpage = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV20EmprCod = "" ;
      AV17BarCodPar = "" ;
      AV24CliNom = "" ;
      AV27BarSer = "" ;
      AV28BarSerDsc = "" ;
      AV29BarColNom = "" ;
      AV31BarKgm = DecimalUtil.ZERO ;
      AV32BarMtr = DecimalUtil.ZERO ;
      AV33BarNHdr = "" ;
      AV77Pgmname = "" ;
      AV12ControlCalidad_CC_CC1_SDT = new GXBaseCollection<app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item>(app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV35ControlCalidad_CC1_SDT = new GXBaseCollection<app.controlcalidadhtd.SdtControlCalidad_CC1_SDT_Item>(app.controlcalidadhtd.SdtControlCalidad_CC1_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      Grid_titlescategories_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      Gridcontrolcalidad_cc1_sdts_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      lblTxtmensaje_Jsonclick = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtncerrar_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      Gridcontrolcalidad_cc1_sdtsContainer = new com.genexus.webpanels.GXWebGrid(context);
      ucGridcontrolcalidad_cc1_sdtspaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucGrid_titlescategories = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      ucGridcontrolcalidad_cc1_sdts_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      hsh = "" ;
      AV23Station = "" ;
      GXv_char2 = new String[1] ;
      AV22EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV21UsurCod = "" ;
      AV34ControlCalidad_CC_CC1_SDT_json = "" ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV39Procod = "" ;
      GXv_int6 = new byte[1] ;
      AV47mensaje = "" ;
      AV48Prodsc = "" ;
      AV49Fascod = "" ;
      AV50Fasdsc = "" ;
      AV51CCTDsc = "" ;
      AV13Session = httpContext.getWebSession();
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV38ControlCalidad_CC1_SDT_json = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      Gridcontrolcalidad_cc1_sdtsRow = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      subGridcontrolcalidad_cc1_sdts_Linesclass = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      Gridcontrolcalidad_cc1_sdtsColumn = new com.genexus.webpanels.GXWebColumn();
      AV77Pgmname = "ControlCalidadHTD.ControlCalidad_CC_CC1__WP" ;
      /* GeneXus formulas. */
      AV77Pgmname = "ControlCalidadHTD.ControlCalidad_CC_CC1__WP" ;
      Gx_err = (short)(0) ;
      edtavBarnhdr_Enabled = 0 ;
      edtavClicod_Enabled = 0 ;
      edtavClinom_Enabled = 0 ;
      edtavBarser_Enabled = 0 ;
      edtavBarserdsc_Enabled = 0 ;
      edtavBarcolnom_Enabled = 0 ;
      edtavBarcolnum_Enabled = 0 ;
      edtavBarkgm_Enabled = 0 ;
      edtavBarmtr_Enabled = 0 ;
      edtavBarpie_Enabled = 0 ;
      edtavControlcalidad_cc_cc1_sdt__barordlin_Enabled = 0 ;
      edtavControlcalidad_cc_cc1_sdt__procod_Enabled = 0 ;
      edtavControlcalidad_cc_cc1_sdt__prodsc_Enabled = 0 ;
      edtavControlcalidad_cc_cc1_sdt__fascod_Enabled = 0 ;
      edtavControlcalidad_cc_cc1_sdt__fasdsc_Enabled = 0 ;
      edtavControlcalidad_cc_cc1_sdt__cctcod_Enabled = 0 ;
      edtavControlcalidad_cc_cc1_sdt__cctdsc_Enabled = 0 ;
      edtavControlcalidad_cc_cc1_sdt__ccopecod_Enabled = 0 ;
      edtavControlcalidad_cc_cc1_sdt__ccfch_Enabled = 0 ;
      edtavControlcalidad_cc_cc1_sdt__cc_Enabled = 0 ;
      edtavControlcalidad_cc_cc1_sdt__ccfas_Enabled = 0 ;
      edtavControlcalidad_cc_cc1_sdt__ccser1_Enabled = 0 ;
      edtavControlcalidad_cc_cc1_sdt__errcontrol_Enabled = 0 ;
      edtavControlcalidad_cc_cc1_sdt__barfasest_Enabled = 0 ;
      edtavControlcalidad_cc1_sdt__cctlin_Enabled = 0 ;
      edtavControlcalidad_cc1_sdt__cctlindsc_Enabled = 0 ;
      edtavControlcalidad_cc1_sdt__cctlindc2_Enabled = 0 ;
      edtavControlcalidad_cc1_sdt__ccmetodo_Enabled = 0 ;
      edtavControlcalidad_cc1_sdt__ccespecif2_Enabled = 0 ;
      edtavControlcalidad_cc1_sdt__ccval_Enabled = 0 ;
      edtavControlcalidad_cc1_sdt__cctvaldsc_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV18Barcodreo ;
   private byte GRID_nEOF ;
   private byte GRIDCONTROLCALIDAD_CC1_SDTS_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV18Barcodreo ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGridcontrolcalidad_cc1_sdts_Backcolorstyle ;
   private byte GXv_int6[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGridcontrolcalidad_cc1_sdts_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private byte subGridcontrolcalidad_cc1_sdts_Titlebackstyle ;
   private byte subGridcontrolcalidad_cc1_sdts_Allowselection ;
   private byte subGridcontrolcalidad_cc1_sdts_Allowhovering ;
   private byte subGridcontrolcalidad_cc1_sdts_Allowcollapsing ;
   private byte subGridcontrolcalidad_cc1_sdts_Collapsed ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short wbEnd ;
   private short wbStart ;
   private short AV44GridActions ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV40Barordlin ;
   private short AV46var_ok ;
   private int wcpOAV19Barcod ;
   private int wcpOAV26CliCod ;
   private int wcpOAV30BarColNum ;
   private int wcpOAV25BarPie ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int Gridcontrolcalidad_cc1_sdtspaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_87 ;
   private int nRC_GXsfl_116 ;
   private int subGridcontrolcalidad_cc1_sdts_Rows ;
   private int AV19Barcod ;
   private int AV26CliCod ;
   private int AV30BarColNum ;
   private int AV25BarPie ;
   private int nGXsfl_87_idx=1 ;
   private int nGXsfl_116_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int Gridcontrolcalidad_cc1_sdtspaginationbar_Pagestoshow ;
   private int edtavBarnhdr_Enabled ;
   private int edtavClicod_Enabled ;
   private int edtavClinom_Enabled ;
   private int edtavBarser_Enabled ;
   private int edtavBarserdsc_Enabled ;
   private int edtavBarcolnom_Enabled ;
   private int edtavBarcolnum_Enabled ;
   private int edtavBarkgm_Enabled ;
   private int edtavBarmtr_Enabled ;
   private int edtavBarpie_Enabled ;
   private int AV54GXV1 ;
   private int AV69GXV16 ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int subGridcontrolcalidad_cc1_sdts_Islastpage ;
   private int edtavControlcalidad_cc_cc1_sdt__barordlin_Enabled ;
   private int edtavControlcalidad_cc_cc1_sdt__procod_Enabled ;
   private int edtavControlcalidad_cc_cc1_sdt__prodsc_Enabled ;
   private int edtavControlcalidad_cc_cc1_sdt__fascod_Enabled ;
   private int edtavControlcalidad_cc_cc1_sdt__fasdsc_Enabled ;
   private int edtavControlcalidad_cc_cc1_sdt__cctcod_Enabled ;
   private int edtavControlcalidad_cc_cc1_sdt__cctdsc_Enabled ;
   private int edtavControlcalidad_cc_cc1_sdt__ccopecod_Enabled ;
   private int edtavControlcalidad_cc_cc1_sdt__ccfch_Enabled ;
   private int edtavControlcalidad_cc_cc1_sdt__cc_Enabled ;
   private int edtavControlcalidad_cc_cc1_sdt__ccfas_Enabled ;
   private int edtavControlcalidad_cc_cc1_sdt__ccser1_Enabled ;
   private int edtavControlcalidad_cc_cc1_sdt__errcontrol_Enabled ;
   private int edtavControlcalidad_cc_cc1_sdt__barfasest_Enabled ;
   private int edtavControlcalidad_cc1_sdt__cctlin_Enabled ;
   private int edtavControlcalidad_cc1_sdt__cctlindsc_Enabled ;
   private int edtavControlcalidad_cc1_sdt__cctlindc2_Enabled ;
   private int edtavControlcalidad_cc1_sdt__ccmetodo_Enabled ;
   private int edtavControlcalidad_cc1_sdt__ccespecif2_Enabled ;
   private int edtavControlcalidad_cc1_sdt__ccval_Enabled ;
   private int edtavControlcalidad_cc1_sdt__cctvaldsc_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int GRIDCONTROLCALIDAD_CC1_SDTS_nGridOutOfScope ;
   private int nGXsfl_87_fel_idx=1 ;
   private int nGXsfl_116_fel_idx=1 ;
   private int AV14PageToGo ;
   private int nGXsfl_87_bak_idx=1 ;
   private int AV45ccopecod ;
   private int AV41Cctcod ;
   private int nGXsfl_116_bak_idx=1 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGridcontrolcalidad_cc1_sdts_Backcolor ;
   private int subGridcontrolcalidad_cc1_sdts_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private int subGridcontrolcalidad_cc1_sdts_Titlebackcolor ;
   private int subGridcontrolcalidad_cc1_sdts_Selectedindex ;
   private int subGridcontrolcalidad_cc1_sdts_Selectioncolor ;
   private int subGridcontrolcalidad_cc1_sdts_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long GRIDCONTROLCALIDAD_CC1_SDTS_nFirstRecordOnPage ;
   private long AV15GridCurrentPage ;
   private long AV16GridPageCount ;
   private long AV36GridControlCalidad_CC1_SDTsCurrentPage ;
   private long AV37GridControlCalidad_CC1_SDTsPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRIDCONTROLCALIDAD_CC1_SDTS_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private long GRIDCONTROLCALIDAD_CC1_SDTS_nRecordCount ;
   private java.math.BigDecimal wcpOAV31BarKgm ;
   private java.math.BigDecimal wcpOAV32BarMtr ;
   private java.math.BigDecimal AV31BarKgm ;
   private java.math.BigDecimal AV32BarMtr ;
   private String wcpOAV20EmprCod ;
   private String wcpOAV17BarCodPar ;
   private String wcpOAV24CliNom ;
   private String wcpOAV27BarSer ;
   private String wcpOAV28BarSerDsc ;
   private String wcpOAV29BarColNom ;
   private String wcpOAV33BarNHdr ;
   private String Gridpaginationbar_Selectedpage ;
   private String Gridcontrolcalidad_cc1_sdtspaginationbar_Selectedpage ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV20EmprCod ;
   private String AV17BarCodPar ;
   private String AV24CliNom ;
   private String AV27BarSer ;
   private String AV28BarSerDsc ;
   private String AV29BarColNom ;
   private String AV33BarNHdr ;
   private String sGXsfl_87_idx="0001" ;
   private String AV77Pgmname ;
   private String sGXsfl_116_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
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
   private String Gridcontrolcalidad_cc1_sdtspaginationbar_Class ;
   private String Gridcontrolcalidad_cc1_sdtspaginationbar_Pagingbuttonsposition ;
   private String Gridcontrolcalidad_cc1_sdtspaginationbar_Pagingcaptionposition ;
   private String Gridcontrolcalidad_cc1_sdtspaginationbar_Emptygridclass ;
   private String Gridcontrolcalidad_cc1_sdtspaginationbar_Rowsperpageoptions ;
   private String Gridcontrolcalidad_cc1_sdtspaginationbar_Previous ;
   private String Gridcontrolcalidad_cc1_sdtspaginationbar_Next ;
   private String Gridcontrolcalidad_cc1_sdtspaginationbar_Caption ;
   private String Gridcontrolcalidad_cc1_sdtspaginationbar_Emptygridcaption ;
   private String Gridcontrolcalidad_cc1_sdtspaginationbar_Rowsperpagecaption ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
   private String Grid_titlescategories_Gridinternalname ;
   private String Grid_titlescategories_Gridtitlescategories ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Fixedcolumns ;
   private String Gridcontrolcalidad_cc1_sdts_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String edtavBarnhdr_Internalname ;
   private String edtavBarnhdr_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String edtavClicod_Internalname ;
   private String edtavClicod_Jsonclick ;
   private String edtavClinom_Internalname ;
   private String edtavClinom_Jsonclick ;
   private String edtavBarser_Internalname ;
   private String edtavBarser_Jsonclick ;
   private String edtavBarserdsc_Internalname ;
   private String edtavBarserdsc_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String edtavBarcolnom_Internalname ;
   private String edtavBarcolnom_Jsonclick ;
   private String edtavBarcolnum_Internalname ;
   private String edtavBarcolnum_Jsonclick ;
   private String divUnnamedtable6_Internalname ;
   private String edtavBarkgm_Internalname ;
   private String edtavBarkgm_Jsonclick ;
   private String edtavBarmtr_Internalname ;
   private String edtavBarmtr_Jsonclick ;
   private String edtavBarpie_Internalname ;
   private String edtavBarpie_Jsonclick ;
   private String lblTxtmensaje_Internalname ;
   private String lblTxtmensaje_Caption ;
   private String lblTxtmensaje_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divGridcontrolcalidad_cc1_sdtstablewithpaginationbar_Internalname ;
   private String subGridcontrolcalidad_cc1_sdts_Internalname ;
   private String Gridcontrolcalidad_cc1_sdtspaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Grid_titlescategories_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String Gridcontrolcalidad_cc1_sdts_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavControlcalidad_cc_cc1_sdt__barordlin_Internalname ;
   private String edtavControlcalidad_cc_cc1_sdt__procod_Internalname ;
   private String edtavControlcalidad_cc_cc1_sdt__prodsc_Internalname ;
   private String edtavControlcalidad_cc_cc1_sdt__fascod_Internalname ;
   private String edtavControlcalidad_cc_cc1_sdt__fasdsc_Internalname ;
   private String edtavControlcalidad_cc_cc1_sdt__cctcod_Internalname ;
   private String edtavControlcalidad_cc_cc1_sdt__cctdsc_Internalname ;
   private String edtavControlcalidad_cc_cc1_sdt__ccopecod_Internalname ;
   private String edtavControlcalidad_cc_cc1_sdt__ccfch_Internalname ;
   private String edtavControlcalidad_cc_cc1_sdt__cc_Internalname ;
   private String edtavControlcalidad_cc_cc1_sdt__ccfas_Internalname ;
   private String edtavControlcalidad_cc_cc1_sdt__ccser1_Internalname ;
   private String edtavControlcalidad_cc_cc1_sdt__errcontrol_Internalname ;
   private String edtavControlcalidad_cc_cc1_sdt__barfasest_Internalname ;
   private String edtavControlcalidad_cc1_sdt__cctlin_Internalname ;
   private String edtavControlcalidad_cc1_sdt__cctlindsc_Internalname ;
   private String edtavControlcalidad_cc1_sdt__cctlindc2_Internalname ;
   private String edtavControlcalidad_cc1_sdt__ccmetodo_Internalname ;
   private String edtavControlcalidad_cc1_sdt__ccespecif2_Internalname ;
   private String edtavControlcalidad_cc1_sdt__ccval_Internalname ;
   private String edtavControlcalidad_cc1_sdt__cctvaldsc_Internalname ;
   private String sGXsfl_87_fel_idx="0001" ;
   private String sGXsfl_116_fel_idx="0001" ;
   private String hsh ;
   private String AV23Station ;
   private String GXv_char2[] ;
   private String AV22EmprNom ;
   private String GXv_char3[] ;
   private String AV21UsurCod ;
   private String AV39Procod ;
   private String AV48Prodsc ;
   private String AV49Fascod ;
   private String AV50Fasdsc ;
   private String AV51CCTDsc ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtavControlcalidad_cc_cc1_sdt__barordlin_Jsonclick ;
   private String edtavControlcalidad_cc_cc1_sdt__procod_Jsonclick ;
   private String edtavControlcalidad_cc_cc1_sdt__prodsc_Jsonclick ;
   private String edtavControlcalidad_cc_cc1_sdt__fascod_Jsonclick ;
   private String edtavControlcalidad_cc_cc1_sdt__fasdsc_Jsonclick ;
   private String edtavControlcalidad_cc_cc1_sdt__cctcod_Jsonclick ;
   private String edtavControlcalidad_cc_cc1_sdt__cctdsc_Jsonclick ;
   private String edtavControlcalidad_cc_cc1_sdt__ccopecod_Jsonclick ;
   private String edtavControlcalidad_cc_cc1_sdt__ccfch_Jsonclick ;
   private String edtavControlcalidad_cc_cc1_sdt__cc_Jsonclick ;
   private String edtavControlcalidad_cc_cc1_sdt__ccfas_Jsonclick ;
   private String edtavControlcalidad_cc_cc1_sdt__ccser1_Jsonclick ;
   private String edtavControlcalidad_cc_cc1_sdt__errcontrol_Jsonclick ;
   private String edtavControlcalidad_cc_cc1_sdt__barfasest_Jsonclick ;
   private String subGridcontrolcalidad_cc1_sdts_Class ;
   private String subGridcontrolcalidad_cc1_sdts_Linesclass ;
   private String edtavControlcalidad_cc1_sdt__cctlin_Jsonclick ;
   private String edtavControlcalidad_cc1_sdt__cctlindsc_Jsonclick ;
   private String edtavControlcalidad_cc1_sdt__cctlindc2_Jsonclick ;
   private String edtavControlcalidad_cc1_sdt__ccmetodo_Jsonclick ;
   private String edtavControlcalidad_cc1_sdt__ccespecif2_Jsonclick ;
   private String edtavControlcalidad_cc1_sdt__ccval_Jsonclick ;
   private String edtavControlcalidad_cc1_sdt__cctvaldsc_Jsonclick ;
   private String subGrid_Header ;
   private String subGridcontrolcalidad_cc1_sdts_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
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
   private boolean Gridcontrolcalidad_cc1_sdtspaginationbar_Showfirst ;
   private boolean Gridcontrolcalidad_cc1_sdtspaginationbar_Showprevious ;
   private boolean Gridcontrolcalidad_cc1_sdtspaginationbar_Shownext ;
   private boolean Gridcontrolcalidad_cc1_sdtspaginationbar_Showlast ;
   private boolean Gridcontrolcalidad_cc1_sdtspaginationbar_Rowsperpageselector ;
   private boolean Dvpanel_unnamedtable2_Autowidth ;
   private boolean Dvpanel_unnamedtable2_Autoheight ;
   private boolean Dvpanel_unnamedtable2_Collapsible ;
   private boolean Dvpanel_unnamedtable2_Collapsed ;
   private boolean Dvpanel_unnamedtable2_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable2_Autoscroll ;
   private boolean Grid_empowerer_Hascategories ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_87_Refreshing=false ;
   private boolean bGXsfl_116_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_BV87 ;
   private boolean gx_refresh_fired ;
   private boolean gx_BV116 ;
   private String AV34ControlCalidad_CC_CC1_SDT_json ;
   private String AV38ControlCalidad_CC1_SDT_json ;
   private String AV47mensaje ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebGrid Gridcontrolcalidad_cc1_sdtsContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebRow Gridcontrolcalidad_cc1_sdtsRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebColumn Gridcontrolcalidad_cc1_sdtsColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV13Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucGridcontrolcalidad_cc1_sdtspaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucGrid_titlescategories ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucGridcontrolcalidad_cc1_sdts_empowerer ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavGridactions ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item> AV12ControlCalidad_CC_CC1_SDT ;
   private GXBaseCollection<app.controlcalidadhtd.SdtControlCalidad_CC1_SDT_Item> AV35ControlCalidad_CC1_SDT ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
}

