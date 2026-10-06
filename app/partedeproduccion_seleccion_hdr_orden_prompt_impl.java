package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class partedeproduccion_seleccion_hdr_orden_prompt_impl extends GXDataArea
{
   public partedeproduccion_seleccion_hdr_orden_prompt_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public partedeproduccion_seleccion_hdr_orden_prompt_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( partedeproduccion_seleccion_hdr_orden_prompt_impl.class ));
   }

   public partedeproduccion_seleccion_hdr_orden_prompt_impl( int remoteHandle ,
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
         gxfirstwebparm = httpContext.GetFirstPar( "InEmprCod") ;
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
            gxfirstwebparm = httpContext.GetFirstPar( "InEmprCod") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "InEmprCod") ;
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
            AV7InEmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7InEmprCod", AV7InEmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7InEmprCod, "@!"))));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV8InBarCod = (int)(GXutil.lval( httpContext.GetPar( "InBarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8InBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8InBarCod), 8, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8InBarCod), "ZZZZZZZ9")));
               AV9InBarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "InBarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9InBarCodReo", GXutil.str( AV9InBarCodReo, 1, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9InBarCodReo), "9")));
               AV10InBarCodPar = httpContext.GetPar( "InBarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10InBarCodPar", AV10InBarCodPar);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10InBarCodPar, ""))));
               AV12InOutBarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "InOutBarOrdLin"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12InOutBarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12InOutBarOrdLin), 4, 0));
               AV53OutFascod = httpContext.GetPar( "OutFascod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV53OutFascod", AV53OutFascod);
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
      nRC_GXsfl_24 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_24"))) ;
      nGXsfl_24_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_24_idx"))) ;
      sGXsfl_24_idx = httpContext.GetPar( "sGXsfl_24_idx") ;
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
      AV19FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV7InEmprCod = httpContext.GetPar( "InEmprCod") ;
      AV8InBarCod = (int)(GXutil.lval( httpContext.GetPar( "InBarCod"))) ;
      AV9InBarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "InBarCodReo"))) ;
      AV10InBarCodPar = httpContext.GetPar( "InBarCodPar") ;
      AV17OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV18OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV20TFBarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "TFBarOrdLin"))) ;
      AV21TFBarOrdLin_To = (short)(GXutil.lval( httpContext.GetPar( "TFBarOrdLin_To"))) ;
      AV22TFMaqCodBis = httpContext.GetPar( "TFMaqCodBis") ;
      AV23TFMaqCodBis_Sel = httpContext.GetPar( "TFMaqCodBis_Sel") ;
      AV24TFFasCod = httpContext.GetPar( "TFFasCod") ;
      AV25TFFasCod_Sel = httpContext.GetPar( "TFFasCod_Sel") ;
      AV26TFFasDsc = httpContext.GetPar( "TFFasDsc") ;
      AV27TFFasDsc_Sel = httpContext.GetPar( "TFFasDsc_Sel") ;
      AV28TFBarFasCon = httpContext.GetPar( "TFBarFasCon") ;
      AV29TFBarFasCon_Sel = httpContext.GetPar( "TFBarFasCon_Sel") ;
      AV30TFBarFasEst = (byte)(GXutil.lval( httpContext.GetPar( "TFBarFasEst"))) ;
      AV31TFBarFasEst_To = (byte)(GXutil.lval( httpContext.GetPar( "TFBarFasEst_To"))) ;
      AV32TFBarFacTin = httpContext.GetPar( "TFBarFacTin") ;
      AV33TFBarFacTin_Sel = httpContext.GetPar( "TFBarFacTin_Sel") ;
      AV34TFBarFecRea = localUtil.parseDateParm( httpContext.GetPar( "TFBarFecRea")) ;
      AV38TFBarTieTeo = CommonUtil.decimalVal( httpContext.GetPar( "TFBarTieTeo"), ".") ;
      AV39TFBarTieTeo_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarTieTeo_To"), ".") ;
      AV40TFBarFasDTI = localUtil.parseDTimeParm( httpContext.GetPar( "TFBarFasDTI")) ;
      AV44TFBarFasDTF = localUtil.parseDTimeParm( httpContext.GetPar( "TFBarFasDTF")) ;
      AV56Pgmname = httpContext.GetPar( "Pgmname") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV19FilterFullText, AV7InEmprCod, AV8InBarCod, AV9InBarCodReo, AV10InBarCodPar, AV17OrderedBy, AV18OrderedDsc, AV20TFBarOrdLin, AV21TFBarOrdLin_To, AV22TFMaqCodBis, AV23TFMaqCodBis_Sel, AV24TFFasCod, AV25TFFasCod_Sel, AV26TFFasDsc, AV27TFFasDsc_Sel, AV28TFBarFasCon, AV29TFBarFasCon_Sel, AV30TFBarFasEst, AV31TFBarFasEst_To, AV32TFBarFacTin, AV33TFBarFacTin_Sel, AV34TFBarFecRea, AV38TFBarTieTeo, AV39TFBarTieTeo_To, AV40TFBarFasDTI, AV44TFBarFasDTF, AV56Pgmname) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         MasterPageObj= createMasterPage(remoteHandle, "app.wwpbaseobjects.workwithplusmasterpageprompt");
         MasterPageObj.setDataArea(this,true);
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
      pa1ZC2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1ZC2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"false\"" ;
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
      httpContext.writeText( " "+"class=\"form-horizontal FormNoBackgroundColor\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal FormNoBackgroundColor\" data-gx-class=\"form-horizontal FormNoBackgroundColor\" novalidate action=\""+formatLink("app.partedeproduccion_seleccion_hdr_orden_prompt", new String[] {GXutil.URLEncode(GXutil.rtrim(AV7InEmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8InBarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9InBarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV10InBarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV12InOutBarOrdLin,4,0)),GXutil.URLEncode(GXutil.rtrim(AV53OutFascod))}, new String[] {"InEmprCod","InBarCod","InBarCodReo","InBarCodPar","InOutBarOrdLin","OutFascod"}) +"\">") ;
      app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Class", "form-horizontal FormNoBackgroundColor", true);
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
   }

   public void send_integrity_footer_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7InEmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8InBarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9InBarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10InBarCodPar, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"PartedeProduccion_Seleccion_HDR_Orden_Prompt");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV56Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("partedeproduccion_seleccion_hdr_orden_prompt:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vFILTERFULLTEXT", AV19FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_24", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_24, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV50GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV51GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV48DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV48DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV17OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV18OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARORDLIN", GXutil.ltrim( localUtil.ntoc( AV20TFBarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARORDLIN_TO", GXutil.ltrim( localUtil.ntoc( AV21TFBarOrdLin_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQCODBIS", GXutil.rtrim( AV22TFMaqCodBis));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQCODBIS_SEL", GXutil.rtrim( AV23TFMaqCodBis_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASCOD", GXutil.rtrim( AV24TFFasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASCOD_SEL", GXutil.rtrim( AV25TFFasCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASDSC", GXutil.rtrim( AV26TFFasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASDSC_SEL", GXutil.rtrim( AV27TFFasDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARFASCON", GXutil.rtrim( AV28TFBarFasCon));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARFASCON_SEL", GXutil.rtrim( AV29TFBarFasCon_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARFASEST", GXutil.ltrim( localUtil.ntoc( AV30TFBarFasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARFASEST_TO", GXutil.ltrim( localUtil.ntoc( AV31TFBarFasEst_To, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARFACTIN", GXutil.rtrim( AV32TFBarFacTin));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARFACTIN_SEL", GXutil.rtrim( AV33TFBarFacTin_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARFECREA", localUtil.dtoc( AV34TFBarFecRea, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARTIETEO", GXutil.ltrim( localUtil.ntoc( AV38TFBarTieTeo, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARTIETEO_TO", GXutil.ltrim( localUtil.ntoc( AV39TFBarTieTeo_To, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARFASDTI", localUtil.ttoc( AV40TFBarFasDTI, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARFASDTF", localUtil.ttoc( AV44TFBarFasDTF, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vINEMPRCOD", GXutil.rtrim( AV7InEmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7InEmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vINBARCOD", GXutil.ltrim( localUtil.ntoc( AV8InBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8InBarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINBARCODREO", GXutil.ltrim( localUtil.ntoc( AV9InBarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9InBarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINBARCODPAR", GXutil.rtrim( AV10InBarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10InBarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vINOUTBARORDLIN", GXutil.ltrim( localUtil.ntoc( AV12InOutBarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOUTFASCOD", GXutil.rtrim( AV53OutFascod));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Caption", GXutil.rtrim( Ddo_grid_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_set", GXutil.rtrim( Ddo_grid_Filteredtext_set));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_set", GXutil.rtrim( Ddo_grid_Filteredtextto_set));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_set", GXutil.rtrim( Ddo_grid_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includesortasc", GXutil.rtrim( Ddo_grid_Includesortasc));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filterisrange", GXutil.rtrim( Ddo_grid_Filterisrange));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includedatalist", GXutil.rtrim( Ddo_grid_Includedatalist));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalisttype", GXutil.rtrim( Ddo_grid_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
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
         app.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal FormNoBackgroundColor" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         we1ZC2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1ZC2( ) ;
   }

   public boolean hasEnterEvent( )
   {
      return true ;
   }

   public com.genexus.webpanels.GXWebForm getForm( )
   {
      return Form ;
   }

   public String getSelfLink( )
   {
      return formatLink("app.partedeproduccion_seleccion_hdr_orden_prompt", new String[] {GXutil.URLEncode(GXutil.rtrim(AV7InEmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8InBarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9InBarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV10InBarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV12InOutBarOrdLin,4,0)),GXutil.URLEncode(GXutil.rtrim(AV53OutFascod))}, new String[] {"InEmprCod","InBarCod","InBarCodReo","InBarCodPar","InOutBarOrdLin","OutFascod"})  ;
   }

   public String getPgmname( )
   {
      return "PartedeProduccion_Seleccion_HDR_Orden_Prompt" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Detalle Fases Produccion", "") ;
   }

   public void wb1ZC0( )
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
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), "", "", "", "false");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-gx-base-lib=\"bootstrapv3\""+" "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divLayoutmaintable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablemain_Internalname, 1, 0, "px", 0, "px", "TableMainPrompt", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableheader_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 hidden-xs", "left", "top", "", "", "div");
         wb_table1_12_1ZC2( true) ;
      }
      else
      {
         wb_table1_12_1ZC2( false) ;
      }
      return  ;
   }

   public void wb_table1_12_1ZC2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginPrompt GridNoBorderCell HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol24( ) ;
      }
      if ( wbEnd == 24 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_24 = (int)(nGXsfl_24_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
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
         ucGridpaginationbar.setProperty("CurrentPage", AV50GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV51GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, "GRIDPAGINATIONBARContainer");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV56Pgmname), GXutil.rtrim( localUtil.format( AV56Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PartedeProduccion_Seleccion_HDR_Orden_Prompt.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV48DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_barfecreaauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'" + sGXsfl_24_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_barfecreaauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_barfecreaauxdate_Internalname, localUtil.format(AV36DDO_BarFecReaAuxDate, "99/99/99"), localUtil.format( AV36DDO_BarFecReaAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,55);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_barfecreaauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PartedeProduccion_Seleccion_HDR_Orden_Prompt.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_barfecreaauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_PartedeProduccion_Seleccion_HDR_Orden_Prompt.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_barfasdtiauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'" + sGXsfl_24_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_barfasdtiauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_barfasdtiauxdate_Internalname, localUtil.format(AV42DDO_BarFasDTIAuxDate, "99/99/99"), localUtil.format( AV42DDO_BarFasDTIAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_barfasdtiauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PartedeProduccion_Seleccion_HDR_Orden_Prompt.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_barfasdtiauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_PartedeProduccion_Seleccion_HDR_Orden_Prompt.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_barfasdtfauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'" + sGXsfl_24_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_barfasdtfauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_barfasdtfauxdate_Internalname, localUtil.format(AV46DDO_BarFasDTFAuxDate, "99/99/99"), localUtil.format( AV46DDO_BarFasDTFAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_barfasdtfauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PartedeProduccion_Seleccion_HDR_Orden_Prompt.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_barfasdtfauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_PartedeProduccion_Seleccion_HDR_Orden_Prompt.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 24 )
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

   public void start1ZC2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Detalle Fases Produccion", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1ZC0( ) ;
   }

   public void ws1ZC2( )
   {
      start1ZC2( ) ;
      evt1ZC2( ) ;
   }

   public void evt1ZC2( )
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
                           e111ZC2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e121ZC2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e131ZC2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCLEANFILTERS'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCleanFilters' */
                           e141ZC2 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) )
                        {
                           nGXsfl_24_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_24_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_24_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_242( ) ;
                           AV52Select = httpContext.cgiGet( edtavSelect_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavSelect_Internalname, AV52Select);
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
                           A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
                           A194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A603MaqCodBis = httpContext.cgiGet( edtMaqCodBis_Internalname) ;
                           A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
                           A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
                           A152BarFasCon = GXutil.upper( httpContext.cgiGet( edtBarFasCon_Internalname)) ;
                           A153BarFasEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarFasEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A150BarFacTin = GXutil.upper( httpContext.cgiGet( edtBarFacTin_Internalname)) ;
                           A160BarFecRea = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtBarFecRea_Internalname), 0)) ;
                           A216BarTieTeo = localUtil.ctond( httpContext.cgiGet( edtBarTieTeo_Internalname)) ;
                           A4442BarFasDTI = localUtil.ctot( httpContext.cgiGet( edtBarFasDTI_Internalname), 0) ;
                           n4442BarFasDTI = false ;
                           A4443BarFasDTF = localUtil.ctot( httpContext.cgiGet( edtBarFasDTF_Internalname), 0) ;
                           n4443BarFasDTF = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e151ZC2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e161ZC2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e171ZC2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Filterfulltext Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV19FilterFullText) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e181ZC2 ();
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

   public void we1ZC2( )
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

   public void pa1ZC2( )
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
            GX_FocusControl = edtavFilterfulltext_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
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
      subsflControlProps_242( ) ;
      while ( nGXsfl_24_idx <= nRC_GXsfl_24 )
      {
         sendrow_242( ) ;
         nGXsfl_24_idx = ((subGrid_Islastpage==1)&&(nGXsfl_24_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_24_idx+1) ;
         sGXsfl_24_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_24_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_242( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV19FilterFullText ,
                                 String AV7InEmprCod ,
                                 int AV8InBarCod ,
                                 byte AV9InBarCodReo ,
                                 String AV10InBarCodPar ,
                                 short AV17OrderedBy ,
                                 boolean AV18OrderedDsc ,
                                 short AV20TFBarOrdLin ,
                                 short AV21TFBarOrdLin_To ,
                                 String AV22TFMaqCodBis ,
                                 String AV23TFMaqCodBis_Sel ,
                                 String AV24TFFasCod ,
                                 String AV25TFFasCod_Sel ,
                                 String AV26TFFasDsc ,
                                 String AV27TFFasDsc_Sel ,
                                 String AV28TFBarFasCon ,
                                 String AV29TFBarFasCon_Sel ,
                                 byte AV30TFBarFasEst ,
                                 byte AV31TFBarFasEst_To ,
                                 String AV32TFBarFacTin ,
                                 String AV33TFBarFacTin_Sel ,
                                 java.util.Date AV34TFBarFecRea ,
                                 java.math.BigDecimal AV38TFBarTieTeo ,
                                 java.math.BigDecimal AV39TFBarTieTeo_To ,
                                 java.util.Date AV40TFBarFasDTI ,
                                 java.util.Date AV44TFBarFasDTF ,
                                 String AV56Pgmname )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e161ZC2 ();
      GRID_nCurrentRecord = 0 ;
      rf1ZC2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"PartedeProduccion_Seleccion_HDR_Orden_Prompt");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV56Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("partedeproduccion_seleccion_hdr_orden_prompt:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARFASEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A153BarFasEst), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASEST", GXutil.ltrim( localUtil.ntoc( A153BarFasEst, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARORDLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARORDLIN", GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_FASCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A457FasCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCOD", GXutil.rtrim( A457FasCod));
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
      rf1ZC2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV56Pgmname = "PartedeProduccion_Seleccion_HDR_Orden_Prompt" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56Pgmname", AV56Pgmname);
      Gx_err = (short)(0) ;
      edtavSelect_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSelect_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSelect_Enabled), 5, 0), !bGXsfl_24_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1ZC2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(24) ;
      /* Execute user event: Refresh */
      e161ZC2 ();
      nGXsfl_24_idx = 1 ;
      sGXsfl_24_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_24_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_242( ) ;
      bGXsfl_24_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
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
         subsflControlProps_242( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV19FilterFullText ,
                                              Short.valueOf(AV20TFBarOrdLin) ,
                                              Short.valueOf(AV21TFBarOrdLin_To) ,
                                              AV23TFMaqCodBis_Sel ,
                                              AV22TFMaqCodBis ,
                                              AV25TFFasCod_Sel ,
                                              AV24TFFasCod ,
                                              AV27TFFasDsc_Sel ,
                                              AV26TFFasDsc ,
                                              AV29TFBarFasCon_Sel ,
                                              AV28TFBarFasCon ,
                                              Byte.valueOf(AV30TFBarFasEst) ,
                                              Byte.valueOf(AV31TFBarFasEst_To) ,
                                              AV33TFBarFacTin_Sel ,
                                              AV32TFBarFacTin ,
                                              AV34TFBarFecRea ,
                                              AV38TFBarTieTeo ,
                                              AV39TFBarTieTeo_To ,
                                              AV40TFBarFasDTI ,
                                              AV44TFBarFasDTF ,
                                              Short.valueOf(A194BarOrdLin) ,
                                              A603MaqCodBis ,
                                              A457FasCod ,
                                              A460FasDsc ,
                                              A152BarFasCon ,
                                              Byte.valueOf(A153BarFasEst) ,
                                              A150BarFacTin ,
                                              A216BarTieTeo ,
                                              A160BarFecRea ,
                                              A4442BarFasDTI ,
                                              A4443BarFasDTF ,
                                              Short.valueOf(AV17OrderedBy) ,
                                              Boolean.valueOf(AV18OrderedDsc) ,
                                              AV7InEmprCod ,
                                              Integer.valueOf(AV8InBarCod) ,
                                              Byte.valueOf(AV9InBarCodReo) ,
                                              AV10InBarCodPar ,
                                              A396EmprCod ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE,
                                              TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE,
                                              TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                              }
         });
         lV19FilterFullText = GXutil.concat( GXutil.rtrim( AV19FilterFullText), "%", "") ;
         lV19FilterFullText = GXutil.concat( GXutil.rtrim( AV19FilterFullText), "%", "") ;
         lV19FilterFullText = GXutil.concat( GXutil.rtrim( AV19FilterFullText), "%", "") ;
         lV19FilterFullText = GXutil.concat( GXutil.rtrim( AV19FilterFullText), "%", "") ;
         lV19FilterFullText = GXutil.concat( GXutil.rtrim( AV19FilterFullText), "%", "") ;
         lV19FilterFullText = GXutil.concat( GXutil.rtrim( AV19FilterFullText), "%", "") ;
         lV19FilterFullText = GXutil.concat( GXutil.rtrim( AV19FilterFullText), "%", "") ;
         lV19FilterFullText = GXutil.concat( GXutil.rtrim( AV19FilterFullText), "%", "") ;
         lV22TFMaqCodBis = GXutil.padr( GXutil.rtrim( AV22TFMaqCodBis), 6, "%") ;
         lV24TFFasCod = GXutil.padr( GXutil.rtrim( AV24TFFasCod), 8, "%") ;
         lV26TFFasDsc = GXutil.padr( GXutil.rtrim( AV26TFFasDsc), 28, "%") ;
         lV28TFBarFasCon = GXutil.padr( GXutil.rtrim( AV28TFBarFasCon), 1, "%") ;
         lV32TFBarFacTin = GXutil.padr( GXutil.rtrim( AV32TFBarFacTin), 1, "%") ;
         /* Using cursor H01ZC2 */
         pr_default.execute(0, new Object[] {AV7InEmprCod, Integer.valueOf(AV8InBarCod), Byte.valueOf(AV9InBarCodReo), AV10InBarCodPar, lV19FilterFullText, lV19FilterFullText, lV19FilterFullText, lV19FilterFullText, lV19FilterFullText, lV19FilterFullText, lV19FilterFullText, lV19FilterFullText, Short.valueOf(AV20TFBarOrdLin), Short.valueOf(AV21TFBarOrdLin_To), lV22TFMaqCodBis, AV23TFMaqCodBis_Sel, lV24TFFasCod, AV25TFFasCod_Sel, lV26TFFasDsc, AV27TFFasDsc_Sel, lV28TFBarFasCon, AV29TFBarFasCon_Sel, Byte.valueOf(AV30TFBarFasEst), Byte.valueOf(AV31TFBarFasEst_To), lV32TFBarFacTin, AV33TFBarFacTin_Sel, AV34TFBarFecRea, AV38TFBarTieTeo, AV39TFBarTieTeo_To, AV40TFBarFasDTI, AV44TFBarFasDTF, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_24_idx = 1 ;
         sGXsfl_24_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_24_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_242( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A4443BarFasDTF = H01ZC2_A4443BarFasDTF[0] ;
            n4443BarFasDTF = H01ZC2_n4443BarFasDTF[0] ;
            A4442BarFasDTI = H01ZC2_A4442BarFasDTI[0] ;
            n4442BarFasDTI = H01ZC2_n4442BarFasDTI[0] ;
            A216BarTieTeo = H01ZC2_A216BarTieTeo[0] ;
            A160BarFecRea = H01ZC2_A160BarFecRea[0] ;
            A150BarFacTin = H01ZC2_A150BarFacTin[0] ;
            A153BarFasEst = H01ZC2_A153BarFasEst[0] ;
            A152BarFasCon = H01ZC2_A152BarFasCon[0] ;
            A460FasDsc = H01ZC2_A460FasDsc[0] ;
            A457FasCod = H01ZC2_A457FasCod[0] ;
            A603MaqCodBis = H01ZC2_A603MaqCodBis[0] ;
            A194BarOrdLin = H01ZC2_A194BarOrdLin[0] ;
            A758ProCod = H01ZC2_A758ProCod[0] ;
            A130BarCodPar = H01ZC2_A130BarCodPar[0] ;
            A132BarCodReo = H01ZC2_A132BarCodReo[0] ;
            A129BarCod = H01ZC2_A129BarCod[0] ;
            A396EmprCod = H01ZC2_A396EmprCod[0] ;
            A460FasDsc = H01ZC2_A460FasDsc[0] ;
            e171ZC2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(24) ;
         wb1ZC0( ) ;
      }
      bGXsfl_24_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1ZC2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vINEMPRCOD", GXutil.rtrim( AV7InEmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7InEmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vINBARCOD", GXutil.ltrim( localUtil.ntoc( AV8InBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8InBarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINBARCODREO", GXutil.ltrim( localUtil.ntoc( AV9InBarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9InBarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINBARCODPAR", GXutil.rtrim( AV10InBarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10InBarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARFASEST"+"_"+sGXsfl_24_idx, getSecureSignedToken( sGXsfl_24_idx, localUtil.format( DecimalUtil.doubleToDec(A153BarFasEst), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARORDLIN"+"_"+sGXsfl_24_idx, getSecureSignedToken( sGXsfl_24_idx, localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_FASCOD"+"_"+sGXsfl_24_idx, getSecureSignedToken( sGXsfl_24_idx, GXutil.rtrim( localUtil.format( A457FasCod, "@!"))));
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
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV19FilterFullText ,
                                           Short.valueOf(AV20TFBarOrdLin) ,
                                           Short.valueOf(AV21TFBarOrdLin_To) ,
                                           AV23TFMaqCodBis_Sel ,
                                           AV22TFMaqCodBis ,
                                           AV25TFFasCod_Sel ,
                                           AV24TFFasCod ,
                                           AV27TFFasDsc_Sel ,
                                           AV26TFFasDsc ,
                                           AV29TFBarFasCon_Sel ,
                                           AV28TFBarFasCon ,
                                           Byte.valueOf(AV30TFBarFasEst) ,
                                           Byte.valueOf(AV31TFBarFasEst_To) ,
                                           AV33TFBarFacTin_Sel ,
                                           AV32TFBarFacTin ,
                                           AV34TFBarFecRea ,
                                           AV38TFBarTieTeo ,
                                           AV39TFBarTieTeo_To ,
                                           AV40TFBarFasDTI ,
                                           AV44TFBarFasDTF ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A603MaqCodBis ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A152BarFasCon ,
                                           Byte.valueOf(A153BarFasEst) ,
                                           A150BarFacTin ,
                                           A216BarTieTeo ,
                                           A160BarFecRea ,
                                           A4442BarFasDTI ,
                                           A4443BarFasDTF ,
                                           Short.valueOf(AV17OrderedBy) ,
                                           Boolean.valueOf(AV18OrderedDsc) ,
                                           AV7InEmprCod ,
                                           Integer.valueOf(AV8InBarCod) ,
                                           Byte.valueOf(AV9InBarCodReo) ,
                                           AV10InBarCodPar ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV19FilterFullText = GXutil.concat( GXutil.rtrim( AV19FilterFullText), "%", "") ;
      lV19FilterFullText = GXutil.concat( GXutil.rtrim( AV19FilterFullText), "%", "") ;
      lV19FilterFullText = GXutil.concat( GXutil.rtrim( AV19FilterFullText), "%", "") ;
      lV19FilterFullText = GXutil.concat( GXutil.rtrim( AV19FilterFullText), "%", "") ;
      lV19FilterFullText = GXutil.concat( GXutil.rtrim( AV19FilterFullText), "%", "") ;
      lV19FilterFullText = GXutil.concat( GXutil.rtrim( AV19FilterFullText), "%", "") ;
      lV19FilterFullText = GXutil.concat( GXutil.rtrim( AV19FilterFullText), "%", "") ;
      lV19FilterFullText = GXutil.concat( GXutil.rtrim( AV19FilterFullText), "%", "") ;
      lV22TFMaqCodBis = GXutil.padr( GXutil.rtrim( AV22TFMaqCodBis), 6, "%") ;
      lV24TFFasCod = GXutil.padr( GXutil.rtrim( AV24TFFasCod), 8, "%") ;
      lV26TFFasDsc = GXutil.padr( GXutil.rtrim( AV26TFFasDsc), 28, "%") ;
      lV28TFBarFasCon = GXutil.padr( GXutil.rtrim( AV28TFBarFasCon), 1, "%") ;
      lV32TFBarFacTin = GXutil.padr( GXutil.rtrim( AV32TFBarFacTin), 1, "%") ;
      /* Using cursor H01ZC3 */
      pr_default.execute(1, new Object[] {AV7InEmprCod, Integer.valueOf(AV8InBarCod), Byte.valueOf(AV9InBarCodReo), AV10InBarCodPar, lV19FilterFullText, lV19FilterFullText, lV19FilterFullText, lV19FilterFullText, lV19FilterFullText, lV19FilterFullText, lV19FilterFullText, lV19FilterFullText, Short.valueOf(AV20TFBarOrdLin), Short.valueOf(AV21TFBarOrdLin_To), lV22TFMaqCodBis, AV23TFMaqCodBis_Sel, lV24TFFasCod, AV25TFFasCod_Sel, lV26TFFasDsc, AV27TFFasDsc_Sel, lV28TFBarFasCon, AV29TFBarFasCon_Sel, Byte.valueOf(AV30TFBarFasEst), Byte.valueOf(AV31TFBarFasEst_To), lV32TFBarFacTin, AV33TFBarFacTin_Sel, AV34TFBarFecRea, AV38TFBarTieTeo, AV39TFBarTieTeo_To, AV40TFBarFasDTI, AV44TFBarFasDTF});
      GRID_nRecordCount = H01ZC3_AGRID_nRecordCount[0] ;
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
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV19FilterFullText, AV7InEmprCod, AV8InBarCod, AV9InBarCodReo, AV10InBarCodPar, AV17OrderedBy, AV18OrderedDsc, AV20TFBarOrdLin, AV21TFBarOrdLin_To, AV22TFMaqCodBis, AV23TFMaqCodBis_Sel, AV24TFFasCod, AV25TFFasCod_Sel, AV26TFFasDsc, AV27TFFasDsc_Sel, AV28TFBarFasCon, AV29TFBarFasCon_Sel, AV30TFBarFasEst, AV31TFBarFasEst_To, AV32TFBarFacTin, AV33TFBarFacTin_Sel, AV34TFBarFecRea, AV38TFBarTieTeo, AV39TFBarTieTeo_To, AV40TFBarFasDTI, AV44TFBarFasDTF, AV56Pgmname) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV19FilterFullText, AV7InEmprCod, AV8InBarCod, AV9InBarCodReo, AV10InBarCodPar, AV17OrderedBy, AV18OrderedDsc, AV20TFBarOrdLin, AV21TFBarOrdLin_To, AV22TFMaqCodBis, AV23TFMaqCodBis_Sel, AV24TFFasCod, AV25TFFasCod_Sel, AV26TFFasDsc, AV27TFFasDsc_Sel, AV28TFBarFasCon, AV29TFBarFasCon_Sel, AV30TFBarFasEst, AV31TFBarFasEst_To, AV32TFBarFacTin, AV33TFBarFacTin_Sel, AV34TFBarFecRea, AV38TFBarTieTeo, AV39TFBarTieTeo_To, AV40TFBarFasDTI, AV44TFBarFasDTF, AV56Pgmname) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV19FilterFullText, AV7InEmprCod, AV8InBarCod, AV9InBarCodReo, AV10InBarCodPar, AV17OrderedBy, AV18OrderedDsc, AV20TFBarOrdLin, AV21TFBarOrdLin_To, AV22TFMaqCodBis, AV23TFMaqCodBis_Sel, AV24TFFasCod, AV25TFFasCod_Sel, AV26TFFasDsc, AV27TFFasDsc_Sel, AV28TFBarFasCon, AV29TFBarFasCon_Sel, AV30TFBarFasEst, AV31TFBarFasEst_To, AV32TFBarFacTin, AV33TFBarFacTin_Sel, AV34TFBarFecRea, AV38TFBarTieTeo, AV39TFBarTieTeo_To, AV40TFBarFasDTI, AV44TFBarFasDTF, AV56Pgmname) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV19FilterFullText, AV7InEmprCod, AV8InBarCod, AV9InBarCodReo, AV10InBarCodPar, AV17OrderedBy, AV18OrderedDsc, AV20TFBarOrdLin, AV21TFBarOrdLin_To, AV22TFMaqCodBis, AV23TFMaqCodBis_Sel, AV24TFFasCod, AV25TFFasCod_Sel, AV26TFFasDsc, AV27TFFasDsc_Sel, AV28TFBarFasCon, AV29TFBarFasCon_Sel, AV30TFBarFasEst, AV31TFBarFasEst_To, AV32TFBarFacTin, AV33TFBarFacTin_Sel, AV34TFBarFecRea, AV38TFBarTieTeo, AV39TFBarTieTeo_To, AV40TFBarFasDTI, AV44TFBarFasDTF, AV56Pgmname) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV19FilterFullText, AV7InEmprCod, AV8InBarCod, AV9InBarCodReo, AV10InBarCodPar, AV17OrderedBy, AV18OrderedDsc, AV20TFBarOrdLin, AV21TFBarOrdLin_To, AV22TFMaqCodBis, AV23TFMaqCodBis_Sel, AV24TFFasCod, AV25TFFasCod_Sel, AV26TFFasDsc, AV27TFFasDsc_Sel, AV28TFBarFasCon, AV29TFBarFasCon_Sel, AV30TFBarFasEst, AV31TFBarFasEst_To, AV32TFBarFacTin, AV33TFBarFacTin_Sel, AV34TFBarFecRea, AV38TFBarTieTeo, AV39TFBarTieTeo_To, AV40TFBarFasDTI, AV44TFBarFasDTF, AV56Pgmname) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV56Pgmname = "PartedeProduccion_Seleccion_HDR_Orden_Prompt" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56Pgmname", AV56Pgmname);
      Gx_err = (short)(0) ;
      edtavSelect_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSelect_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSelect_Enabled), 5, 0), !bGXsfl_24_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1ZC0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e151ZC2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV48DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_24 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_24"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV50GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV51GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
         Ddo_grid_Caption = httpContext.cgiGet( "DDO_GRID_Caption") ;
         Ddo_grid_Filteredtext_set = httpContext.cgiGet( "DDO_GRID_Filteredtext_set") ;
         Ddo_grid_Filteredtextto_set = httpContext.cgiGet( "DDO_GRID_Filteredtextto_set") ;
         Ddo_grid_Selectedvalue_set = httpContext.cgiGet( "DDO_GRID_Selectedvalue_set") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( "DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( "DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( "DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Includesortasc = httpContext.cgiGet( "DDO_GRID_Includesortasc") ;
         Ddo_grid_Sortedstatus = httpContext.cgiGet( "DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( "DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( "DDO_GRID_Filtertype") ;
         Ddo_grid_Filterisrange = httpContext.cgiGet( "DDO_GRID_Filterisrange") ;
         Ddo_grid_Includedatalist = httpContext.cgiGet( "DDO_GRID_Includedatalist") ;
         Ddo_grid_Datalisttype = httpContext.cgiGet( "DDO_GRID_Datalisttype") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( "DDO_GRID_Datalistproc") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( "GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( "DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( "DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( "DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( "DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( "DDO_GRID_Selectedcolumn") ;
         /* Read variables values. */
         AV19FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19FilterFullText", AV19FilterFullText);
         AV56Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV56Pgmname", AV56Pgmname);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_barfecreaauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_BARFECREAAUXDATE");
            GX_FocusControl = edtavDdo_barfecreaauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV36DDO_BarFecReaAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36DDO_BarFecReaAuxDate", localUtil.format(AV36DDO_BarFecReaAuxDate, "99/99/99"));
         }
         else
         {
            AV36DDO_BarFecReaAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_barfecreaauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36DDO_BarFecReaAuxDate", localUtil.format(AV36DDO_BarFecReaAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_barfasdtiauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_BARFASDTIAUXDATE");
            GX_FocusControl = edtavDdo_barfasdtiauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV42DDO_BarFasDTIAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42DDO_BarFasDTIAuxDate", localUtil.format(AV42DDO_BarFasDTIAuxDate, "99/99/99"));
         }
         else
         {
            AV42DDO_BarFasDTIAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_barfasdtiauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42DDO_BarFasDTIAuxDate", localUtil.format(AV42DDO_BarFasDTIAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_barfasdtfauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_BARFASDTFAUXDATE");
            GX_FocusControl = edtavDdo_barfasdtfauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV46DDO_BarFasDTFAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46DDO_BarFasDTFAuxDate", localUtil.format(AV46DDO_BarFasDTFAuxDate, "99/99/99"));
         }
         else
         {
            AV46DDO_BarFasDTFAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_barfasdtfauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46DDO_BarFasDTFAuxDate", localUtil.format(AV46DDO_BarFasDTFAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"PartedeProduccion_Seleccion_HDR_Orden_Prompt");
         AV56Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV56Pgmname", AV56Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV56Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("partedeproduccion_seleccion_hdr_orden_prompt:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV19FilterFullText) != 0 )
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
      e151ZC2 ();
      if (returnInSub) return;
   }

   public void e151ZC2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV57Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      partedeproduccion_seleccion_hdr_orden_prompt_impl.this.GXt_char1 = GXv_char2[0] ;
      AV57Station = GXt_char1 ;
      GXv_char2[0] = AV58Emprcod ;
      GXv_char3[0] = AV59Emprnom ;
      GXv_char4[0] = AV60Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV57Station, GXv_char2, GXv_char3, GXv_char4) ;
      partedeproduccion_seleccion_hdr_orden_prompt_impl.this.AV58Emprcod = GXv_char2[0] ;
      partedeproduccion_seleccion_hdr_orden_prompt_impl.this.AV59Emprnom = GXv_char3[0] ;
      partedeproduccion_seleccion_hdr_orden_prompt_impl.this.AV60Usurcod = GXv_char4[0] ;
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( "Detalle Fases Produccion", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      if ( AV17OrderedBy < 1 )
      {
         AV17OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S112 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV48DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV48DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e161ZC2( )
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
      S122 ();
      if (returnInSub) return;
      AV50GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50GridCurrentPage), 10, 0));
      AV51GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51GridPageCount), 10, 0));
      /*  Sending Event outputs  */
   }

   public void e111ZC2( )
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
         AV49PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV49PageToGo) ;
      }
   }

   public void e121ZC2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e131ZC2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV17OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17OrderedBy), 4, 0));
         AV18OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18OrderedDsc", AV18OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S112 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarOrdLin") == 0 )
         {
            AV20TFBarOrdLin = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20TFBarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20TFBarOrdLin), 4, 0));
            AV21TFBarOrdLin_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21TFBarOrdLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21TFBarOrdLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MaqCodBis") == 0 )
         {
            AV22TFMaqCodBis = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22TFMaqCodBis", AV22TFMaqCodBis);
            AV23TFMaqCodBis_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23TFMaqCodBis_Sel", AV23TFMaqCodBis_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasCod") == 0 )
         {
            AV24TFFasCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24TFFasCod", AV24TFFasCod);
            AV25TFFasCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25TFFasCod_Sel", AV25TFFasCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasDsc") == 0 )
         {
            AV26TFFasDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFFasDsc", AV26TFFasDsc);
            AV27TFFasDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFFasDsc_Sel", AV27TFFasDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFasCon") == 0 )
         {
            AV28TFBarFasCon = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFBarFasCon", AV28TFBarFasCon);
            AV29TFBarFasCon_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFBarFasCon_Sel", AV29TFBarFasCon_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFasEst") == 0 )
         {
            AV30TFBarFasEst = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFBarFasEst", GXutil.str( AV30TFBarFasEst, 1, 0));
            AV31TFBarFasEst_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFBarFasEst_To", GXutil.str( AV31TFBarFasEst_To, 1, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFacTin") == 0 )
         {
            AV32TFBarFacTin = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFBarFacTin", AV32TFBarFacTin);
            AV33TFBarFacTin_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFBarFacTin_Sel", AV33TFBarFacTin_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFecRea") == 0 )
         {
            AV34TFBarFecRea = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFBarFecRea", localUtil.format(AV34TFBarFecRea, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarTieTeo") == 0 )
         {
            AV38TFBarTieTeo = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFBarTieTeo", GXutil.ltrimstr( AV38TFBarTieTeo, 5, 2));
            AV39TFBarTieTeo_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFBarTieTeo_To", GXutil.ltrimstr( AV39TFBarTieTeo_To, 5, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFasDTI") == 0 )
         {
            AV40TFBarFasDTI = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFBarFasDTI", localUtil.ttoc( AV40TFBarFasDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFasDTF") == 0 )
         {
            AV44TFBarFasDTF = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFBarFasDTF", localUtil.ttoc( AV44TFBarFasDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e171ZC2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV52Select = "<i class=\"fas fa-check\"></i>" ;
      httpContext.ajax_rsp_assign_attri("", false, edtavSelect_Internalname, AV52Select);
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(24) ;
      }
      sendrow_242( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_24_Refreshing )
      {
         httpContext.doAjaxLoad(24, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e181ZC2 ();
      if (returnInSub) return;
   }

   public void e181ZC2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      if ( A153BarFasEst != 2 )
      {
         AV12InOutBarOrdLin = A194BarOrdLin ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12InOutBarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12InOutBarOrdLin), 4, 0));
         AV53OutFascod = A457FasCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53OutFascod", AV53OutFascod);
         httpContext.setWebReturnParms(new Object[] {Short.valueOf(AV12InOutBarOrdLin),AV53OutFascod});
         httpContext.setWebReturnParmsMetadata(new Object[] {"AV12InOutBarOrdLin","AV53OutFascod"});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion. Fase ya Procesada", ""));
      }
      /*  Sending Event outputs  */
   }

   public void e141ZC2( )
   {
      /* 'DoCleanFilters' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'CLEANFILTERS' */
      S132 ();
      if (returnInSub) return;
      subgrid_firstpage( ) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV17OrderedBy, 4, 0))+":"+(AV18OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S132( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV19FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19FilterFullText", AV19FilterFullText);
      AV20TFBarOrdLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20TFBarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20TFBarOrdLin), 4, 0));
      AV21TFBarOrdLin_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21TFBarOrdLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21TFBarOrdLin_To), 4, 0));
      AV22TFMaqCodBis = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22TFMaqCodBis", AV22TFMaqCodBis);
      AV23TFMaqCodBis_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23TFMaqCodBis_Sel", AV23TFMaqCodBis_Sel);
      AV24TFFasCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24TFFasCod", AV24TFFasCod);
      AV25TFFasCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25TFFasCod_Sel", AV25TFFasCod_Sel);
      AV26TFFasDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26TFFasDsc", AV26TFFasDsc);
      AV27TFFasDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27TFFasDsc_Sel", AV27TFFasDsc_Sel);
      AV28TFBarFasCon = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28TFBarFasCon", AV28TFBarFasCon);
      AV29TFBarFasCon_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29TFBarFasCon_Sel", AV29TFBarFasCon_Sel);
      AV30TFBarFasEst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30TFBarFasEst", GXutil.str( AV30TFBarFasEst, 1, 0));
      AV31TFBarFasEst_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31TFBarFasEst_To", GXutil.str( AV31TFBarFasEst_To, 1, 0));
      AV32TFBarFacTin = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32TFBarFacTin", AV32TFBarFacTin);
      AV33TFBarFacTin_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33TFBarFacTin_Sel", AV33TFBarFacTin_Sel);
      AV34TFBarFecRea = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34TFBarFecRea", localUtil.format(AV34TFBarFecRea, "99/99/99"));
      AV38TFBarTieTeo = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38TFBarTieTeo", GXutil.ltrimstr( AV38TFBarTieTeo, 5, 2));
      AV39TFBarTieTeo_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39TFBarTieTeo_To", GXutil.ltrimstr( AV39TFBarTieTeo_To, 5, 2));
      AV40TFBarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "AV40TFBarFasDTI", localUtil.ttoc( AV40TFBarFasDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV44TFBarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "AV44TFBarFasDTF", localUtil.ttoc( AV44TFBarFasDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S122( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV15GridState = (app.wwpbaseobjects.SdtWWPGridState)new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV15GridState.setgxTv_SdtWWPGridState_Orderedby( AV17OrderedBy );
      AV15GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV18OrderedDsc );
      AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState8[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState8, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV19FilterFullText)==0), (short)(0), AV19FilterFullText, "") ;
      AV15GridState = GXv_SdtWWPGridState8[0] ;
      GXv_SdtWWPGridState8[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState8, "TFBARORDLIN", "", !((0==AV20TFBarOrdLin)&&(0==AV21TFBarOrdLin_To)), (short)(0), GXutil.trim( GXutil.str( AV20TFBarOrdLin, 4, 0)), GXutil.trim( GXutil.str( AV21TFBarOrdLin_To, 4, 0))) ;
      AV15GridState = GXv_SdtWWPGridState8[0] ;
      GXv_SdtWWPGridState8[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState8, "TFMAQCODBIS", "", !(GXutil.strcmp("", AV22TFMaqCodBis)==0), (short)(0), AV22TFMaqCodBis, "", !(GXutil.strcmp("", AV23TFMaqCodBis_Sel)==0), AV23TFMaqCodBis_Sel, "") ;
      AV15GridState = GXv_SdtWWPGridState8[0] ;
      GXv_SdtWWPGridState8[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState8, "TFFASCOD", "", !(GXutil.strcmp("", AV24TFFasCod)==0), (short)(0), AV24TFFasCod, "", !(GXutil.strcmp("", AV25TFFasCod_Sel)==0), AV25TFFasCod_Sel, "") ;
      AV15GridState = GXv_SdtWWPGridState8[0] ;
      GXv_SdtWWPGridState8[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState8, "TFFASDSC", "", !(GXutil.strcmp("", AV26TFFasDsc)==0), (short)(0), AV26TFFasDsc, "", !(GXutil.strcmp("", AV27TFFasDsc_Sel)==0), AV27TFFasDsc_Sel, "") ;
      AV15GridState = GXv_SdtWWPGridState8[0] ;
      GXv_SdtWWPGridState8[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState8, "TFBARFASCON", "", !(GXutil.strcmp("", AV28TFBarFasCon)==0), (short)(0), AV28TFBarFasCon, "", !(GXutil.strcmp("", AV29TFBarFasCon_Sel)==0), AV29TFBarFasCon_Sel, "") ;
      AV15GridState = GXv_SdtWWPGridState8[0] ;
      GXv_SdtWWPGridState8[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState8, "TFBARFASEST", "", !((0==AV30TFBarFasEst)&&(0==AV31TFBarFasEst_To)), (short)(0), GXutil.trim( GXutil.str( AV30TFBarFasEst, 1, 0)), GXutil.trim( GXutil.str( AV31TFBarFasEst_To, 1, 0))) ;
      AV15GridState = GXv_SdtWWPGridState8[0] ;
      GXv_SdtWWPGridState8[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState8, "TFBARFACTIN", "", !(GXutil.strcmp("", AV32TFBarFacTin)==0), (short)(0), AV32TFBarFacTin, "", !(GXutil.strcmp("", AV33TFBarFacTin_Sel)==0), AV33TFBarFacTin_Sel, "") ;
      AV15GridState = GXv_SdtWWPGridState8[0] ;
      GXv_SdtWWPGridState8[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState8, "TFBARFECREA", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV34TFBarFecRea)), (short)(0), GXutil.trim( localUtil.dtoc( AV34TFBarFecRea, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV15GridState = GXv_SdtWWPGridState8[0] ;
      GXv_SdtWWPGridState8[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState8, "TFBARTIETEO", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV38TFBarTieTeo)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFBarTieTeo_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV38TFBarTieTeo, 5, 2)), GXutil.trim( GXutil.str( AV39TFBarTieTeo_To, 5, 2))) ;
      AV15GridState = GXv_SdtWWPGridState8[0] ;
      GXv_SdtWWPGridState8[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState8, "TFBARFASDTI", "", !GXutil.dateCompare(GXutil.nullDate(), AV40TFBarFasDTI), (short)(0), GXutil.trim( localUtil.ttoc( AV40TFBarFasDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV15GridState = GXv_SdtWWPGridState8[0] ;
      GXv_SdtWWPGridState8[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState8, "TFBARFASDTF", "", !GXutil.dateCompare(GXutil.nullDate(), AV44TFBarFasDTF), (short)(0), GXutil.trim( localUtil.ttoc( AV44TFBarFasDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV15GridState = GXv_SdtWWPGridState8[0] ;
      if ( ! (GXutil.strcmp("", AV7InEmprCod)==0) )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&INEMPRCOD" );
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV7InEmprCod );
         AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV16GridStateFilterValue, 0);
      }
      if ( ! (0==AV8InBarCod) )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&INBARCOD" );
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV8InBarCod, 8, 0) );
         AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV16GridStateFilterValue, 0);
      }
      if ( ! (0==AV9InBarCodReo) )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&INBARCODREO" );
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV9InBarCodReo, 1, 0) );
         AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV16GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV10InBarCodPar)==0) )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&INBARCODPAR" );
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV10InBarCodPar );
         AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV16GridStateFilterValue, 0);
      }
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV56Pgmname+"GridState", AV15GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void wb_table1_12_1ZC2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablefilters_Internalname, tblTablefilters_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='CellAlignTopPaddingTop10'>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblCleanfilters_Internalname, httpContext.getMessage( "<i class=\"fas fa-filter CleanFiltersIcon\"></i>", ""), "", "", lblCleanfilters_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'DOCLEANFILTERS\\'."+"'", "", "TextBlock", 5, httpContext.getMessage( "WWP_CleanFiltersTooltip", ""), 1, 1, 0, (short)(1), "HLP_PartedeProduccion_Seleccion_HDR_Orden_Prompt.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFilterfulltext_Internalname, httpContext.getMessage( "Filter Full Text", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'" + sGXsfl_24_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV19FilterFullText, GXutil.rtrim( localUtil.format( AV19FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,18);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_PartedeProduccion_Seleccion_HDR_Orden_Prompt.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_12_1ZC2e( true) ;
      }
      else
      {
         wb_table1_12_1ZC2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV7InEmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7InEmprCod", AV7InEmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7InEmprCod, "@!"))));
      AV8InBarCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8InBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8InBarCod), 8, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8InBarCod), "ZZZZZZZ9")));
      AV9InBarCodReo = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9InBarCodReo", GXutil.str( AV9InBarCodReo, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9InBarCodReo), "9")));
      AV10InBarCodPar = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10InBarCodPar", AV10InBarCodPar);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10InBarCodPar, ""))));
      AV12InOutBarOrdLin = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12InOutBarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12InOutBarOrdLin), 4, 0));
      AV53OutFascod = (String)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53OutFascod", AV53OutFascod);
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
      pa1ZC2( ) ;
      ws1ZC2( ) ;
      we1ZC2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116142741", true, true);
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
      httpContext.AddJavascriptSource("partedeproduccion_seleccion_hdr_orden_prompt.js", "?202682116142741", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_242( )
   {
      edtavSelect_Internalname = "vSELECT_"+sGXsfl_24_idx ;
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_24_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_24_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_24_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_24_idx ;
      edtProCod_Internalname = "PROCOD_"+sGXsfl_24_idx ;
      edtBarOrdLin_Internalname = "BARORDLIN_"+sGXsfl_24_idx ;
      edtMaqCodBis_Internalname = "MAQCODBIS_"+sGXsfl_24_idx ;
      edtFasCod_Internalname = "FASCOD_"+sGXsfl_24_idx ;
      edtFasDsc_Internalname = "FASDSC_"+sGXsfl_24_idx ;
      edtBarFasCon_Internalname = "BARFASCON_"+sGXsfl_24_idx ;
      edtBarFasEst_Internalname = "BARFASEST_"+sGXsfl_24_idx ;
      edtBarFacTin_Internalname = "BARFACTIN_"+sGXsfl_24_idx ;
      edtBarFecRea_Internalname = "BARFECREA_"+sGXsfl_24_idx ;
      edtBarTieTeo_Internalname = "BARTIETEO_"+sGXsfl_24_idx ;
      edtBarFasDTI_Internalname = "BARFASDTI_"+sGXsfl_24_idx ;
      edtBarFasDTF_Internalname = "BARFASDTF_"+sGXsfl_24_idx ;
   }

   public void subsflControlProps_fel_242( )
   {
      edtavSelect_Internalname = "vSELECT_"+sGXsfl_24_fel_idx ;
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_24_fel_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_24_fel_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_24_fel_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_24_fel_idx ;
      edtProCod_Internalname = "PROCOD_"+sGXsfl_24_fel_idx ;
      edtBarOrdLin_Internalname = "BARORDLIN_"+sGXsfl_24_fel_idx ;
      edtMaqCodBis_Internalname = "MAQCODBIS_"+sGXsfl_24_fel_idx ;
      edtFasCod_Internalname = "FASCOD_"+sGXsfl_24_fel_idx ;
      edtFasDsc_Internalname = "FASDSC_"+sGXsfl_24_fel_idx ;
      edtBarFasCon_Internalname = "BARFASCON_"+sGXsfl_24_fel_idx ;
      edtBarFasEst_Internalname = "BARFASEST_"+sGXsfl_24_fel_idx ;
      edtBarFacTin_Internalname = "BARFACTIN_"+sGXsfl_24_fel_idx ;
      edtBarFecRea_Internalname = "BARFECREA_"+sGXsfl_24_fel_idx ;
      edtBarTieTeo_Internalname = "BARTIETEO_"+sGXsfl_24_fel_idx ;
      edtBarFasDTI_Internalname = "BARFASDTI_"+sGXsfl_24_fel_idx ;
      edtBarFasDTF_Internalname = "BARFASDTF_"+sGXsfl_24_fel_idx ;
   }

   public void sendrow_242( )
   {
      subsflControlProps_242( ) ;
      wb1ZC0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_24_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_24_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_24_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavSelect_Enabled!=0)&&(edtavSelect_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 25,'',false,'"+sGXsfl_24_idx+"',24)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSelect_Internalname,GXutil.rtrim( AV52Select),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavSelect_Enabled!=0)&&(edtavSelect_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,25);\"" : " "),"'"+""+"'"+",false,"+"'"+"EENTER."+sGXsfl_24_idx+"'","","",httpContext.getMessage( "GX_BtnSelect", ""),"",edtavSelect_Jsonclick,Integer.valueOf(5),"Attribute","",ROClassString,"WWIconActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSelect_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProCod_Internalname,GXutil.rtrim( A758ProCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarOrdLin_Internalname,GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarOrdLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqCodBis_Internalname,GXutil.rtrim( A603MaqCodBis),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqCodBis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasCod_Internalname,GXutil.rtrim( A457FasCod),GXutil.rtrim( localUtil.format( A457FasCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasDsc_Internalname,GXutil.rtrim( A460FasDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasCon_Internalname,GXutil.rtrim( A152BarFasCon),GXutil.rtrim( localUtil.format( A152BarFasCon, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFasCon_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasEst_Internalname,GXutil.ltrim( localUtil.ntoc( A153BarFasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A153BarFasEst), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFasEst_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFacTin_Internalname,GXutil.rtrim( A150BarFacTin),GXutil.rtrim( localUtil.format( A150BarFacTin, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFacTin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecRea_Internalname,localUtil.format(A160BarFecRea, "99/99/99"),localUtil.format( A160BarFecRea, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFecRea_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTieTeo_Internalname,GXutil.ltrim( localUtil.ntoc( A216BarTieTeo, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A216BarTieTeo, "Z9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarTieTeo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasDTI_Internalname,localUtil.ttoc( A4442BarFasDTI, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A4442BarFasDTI, "99/99/99 99:99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFasDTI_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasDTF_Internalname,localUtil.ttoc( A4443BarFasDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A4443BarFasDTF, "99/99/99 99:99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFasDTF_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1ZC2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_24_idx = ((subGrid_Islastpage==1)&&(nGXsfl_24_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_24_idx+1) ;
         sGXsfl_24_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_24_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_242( ) ;
      }
      /* End function sendrow_242 */
   }

   public void startgridcontrol24( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"24\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Proceso", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Orden", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion de Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "C?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "E", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "T?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "T. Real", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "T. Teo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Inicio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fin", "")) ;
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
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV52Select));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSelect_Enabled, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A758ProCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A603MaqCodBis));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A457FasCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A460FasDsc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A152BarFasCon));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A153BarFasEst, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A150BarFacTin));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A160BarFecRea, "99/99/99"));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A216BarTieTeo, (byte)(5), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A4442BarFasDTI, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A4443BarFasDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
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
      lblCleanfilters_Internalname = "CLEANFILTERS" ;
      edtavFilterfulltext_Internalname = "vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = "TABLEFILTERS" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      edtavSelect_Internalname = "vSELECT" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtProCod_Internalname = "PROCOD" ;
      edtBarOrdLin_Internalname = "BARORDLIN" ;
      edtMaqCodBis_Internalname = "MAQCODBIS" ;
      edtFasCod_Internalname = "FASCOD" ;
      edtFasDsc_Internalname = "FASDSC" ;
      edtBarFasCon_Internalname = "BARFASCON" ;
      edtBarFasEst_Internalname = "BARFASEST" ;
      edtBarFacTin_Internalname = "BARFACTIN" ;
      edtBarFecRea_Internalname = "BARFECREA" ;
      edtBarTieTeo_Internalname = "BARTIETEO" ;
      edtBarFasDTI_Internalname = "BARFASDTI" ;
      edtBarFasDTF_Internalname = "BARFASDTF" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      edtavDdo_barfecreaauxdate_Internalname = "vDDO_BARFECREAAUXDATE" ;
      divDdo_barfecreaauxdates_Internalname = "DDO_BARFECREAAUXDATES" ;
      edtavDdo_barfasdtiauxdate_Internalname = "vDDO_BARFASDTIAUXDATE" ;
      divDdo_barfasdtiauxdates_Internalname = "DDO_BARFASDTIAUXDATES" ;
      edtavDdo_barfasdtfauxdate_Internalname = "vDDO_BARFASDTFAUXDATE" ;
      divDdo_barfasdtfauxdates_Internalname = "DDO_BARFASDTFAUXDATES" ;
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
      edtBarFasDTF_Jsonclick = "" ;
      edtBarFasDTI_Jsonclick = "" ;
      edtBarTieTeo_Jsonclick = "" ;
      edtBarFecRea_Jsonclick = "" ;
      edtBarFacTin_Jsonclick = "" ;
      edtBarFasEst_Jsonclick = "" ;
      edtBarFasCon_Jsonclick = "" ;
      edtFasDsc_Jsonclick = "" ;
      edtFasCod_Jsonclick = "" ;
      edtMaqCodBis_Jsonclick = "" ;
      edtBarOrdLin_Jsonclick = "" ;
      edtProCod_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      edtavSelect_Jsonclick = "" ;
      edtavSelect_Visible = -1 ;
      edtavSelect_Enabled = 1 ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_barfasdtfauxdate_Jsonclick = "" ;
      edtavDdo_barfasdtiauxdate_Jsonclick = "" ;
      edtavDdo_barfecreaauxdate_Jsonclick = "" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_grid_Datalistproc = "PartedeProduccion_Seleccion_HDR_Orden_PromptGetFilterData" ;
      Ddo_grid_Datalisttype = "|Dynamic|Dynamic|Dynamic|Dynamic||Dynamic||||" ;
      Ddo_grid_Includedatalist = "|T|T|T|T||T||||" ;
      Ddo_grid_Filterisrange = "T|||||T|||T||" ;
      Ddo_grid_Filtertype = "Numeric|Character|Character|Character|Character|Numeric|Character|Date|Numeric|Date|Date" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|7|8|9|10|11|12" ;
      Ddo_grid_Columnids = "6:BarOrdLin|7:MaqCodBis|8:FasCod|9:FasDsc|10:BarFasCon|11:BarFasEst|12:BarFacTin|13:BarFecRea|14:BarTieTeo|15:BarFasDTI|16:BarFasDTF" ;
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
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Detalle Fases Produccion", "") );
      subGrid_Rows = 0 ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV7InEmprCod',fld:'vINEMPRCOD',pic:'@!',hsh:true},{av:'AV8InBarCod',fld:'vINBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV9InBarCodReo',fld:'vINBARCODREO',pic:'9',hsh:true},{av:'AV10InBarCodPar',fld:'vINBARCODPAR',pic:'',hsh:true},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV20TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV21TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV22TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV23TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'AV24TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV25TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV26TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV27TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV28TFBarFasCon',fld:'vTFBARFASCON',pic:'@!'},{av:'AV29TFBarFasCon_Sel',fld:'vTFBARFASCON_SEL',pic:'@!'},{av:'AV30TFBarFasEst',fld:'vTFBARFASEST',pic:'9'},{av:'AV31TFBarFasEst_To',fld:'vTFBARFASEST_TO',pic:'9'},{av:'AV32TFBarFacTin',fld:'vTFBARFACTIN',pic:'@!'},{av:'AV33TFBarFacTin_Sel',fld:'vTFBARFACTIN_SEL',pic:'@!'},{av:'AV34TFBarFecRea',fld:'vTFBARFECREA',pic:''},{av:'AV38TFBarTieTeo',fld:'vTFBARTIETEO',pic:'Z9.99'},{av:'AV39TFBarTieTeo_To',fld:'vTFBARTIETEO_TO',pic:'Z9.99'},{av:'AV40TFBarFasDTI',fld:'vTFBARFASDTI',pic:'99/99/99 99:99:99'},{av:'AV44TFBarFasDTF',fld:'vTFBARFASDTF',pic:'99/99/99 99:99:99'},{av:'AV56Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV50GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV51GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e111ZC2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV7InEmprCod',fld:'vINEMPRCOD',pic:'@!',hsh:true},{av:'AV8InBarCod',fld:'vINBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV9InBarCodReo',fld:'vINBARCODREO',pic:'9',hsh:true},{av:'AV10InBarCodPar',fld:'vINBARCODPAR',pic:'',hsh:true},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV20TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV21TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV22TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV23TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'AV24TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV25TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV26TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV27TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV28TFBarFasCon',fld:'vTFBARFASCON',pic:'@!'},{av:'AV29TFBarFasCon_Sel',fld:'vTFBARFASCON_SEL',pic:'@!'},{av:'AV30TFBarFasEst',fld:'vTFBARFASEST',pic:'9'},{av:'AV31TFBarFasEst_To',fld:'vTFBARFASEST_TO',pic:'9'},{av:'AV32TFBarFacTin',fld:'vTFBARFACTIN',pic:'@!'},{av:'AV33TFBarFacTin_Sel',fld:'vTFBARFACTIN_SEL',pic:'@!'},{av:'AV34TFBarFecRea',fld:'vTFBARFECREA',pic:''},{av:'AV38TFBarTieTeo',fld:'vTFBARTIETEO',pic:'Z9.99'},{av:'AV39TFBarTieTeo_To',fld:'vTFBARTIETEO_TO',pic:'Z9.99'},{av:'AV40TFBarFasDTI',fld:'vTFBARFASDTI',pic:'99/99/99 99:99:99'},{av:'AV44TFBarFasDTF',fld:'vTFBARFASDTF',pic:'99/99/99 99:99:99'},{av:'AV56Pgmname',fld:'vPGMNAME',pic:''},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e121ZC2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV7InEmprCod',fld:'vINEMPRCOD',pic:'@!',hsh:true},{av:'AV8InBarCod',fld:'vINBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV9InBarCodReo',fld:'vINBARCODREO',pic:'9',hsh:true},{av:'AV10InBarCodPar',fld:'vINBARCODPAR',pic:'',hsh:true},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV20TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV21TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV22TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV23TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'AV24TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV25TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV26TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV27TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV28TFBarFasCon',fld:'vTFBARFASCON',pic:'@!'},{av:'AV29TFBarFasCon_Sel',fld:'vTFBARFASCON_SEL',pic:'@!'},{av:'AV30TFBarFasEst',fld:'vTFBARFASEST',pic:'9'},{av:'AV31TFBarFasEst_To',fld:'vTFBARFASEST_TO',pic:'9'},{av:'AV32TFBarFacTin',fld:'vTFBARFACTIN',pic:'@!'},{av:'AV33TFBarFacTin_Sel',fld:'vTFBARFACTIN_SEL',pic:'@!'},{av:'AV34TFBarFecRea',fld:'vTFBARFECREA',pic:''},{av:'AV38TFBarTieTeo',fld:'vTFBARTIETEO',pic:'Z9.99'},{av:'AV39TFBarTieTeo_To',fld:'vTFBARTIETEO_TO',pic:'Z9.99'},{av:'AV40TFBarFasDTI',fld:'vTFBARFASDTI',pic:'99/99/99 99:99:99'},{av:'AV44TFBarFasDTF',fld:'vTFBARFASDTF',pic:'99/99/99 99:99:99'},{av:'AV56Pgmname',fld:'vPGMNAME',pic:''},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e131ZC2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV7InEmprCod',fld:'vINEMPRCOD',pic:'@!',hsh:true},{av:'AV8InBarCod',fld:'vINBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV9InBarCodReo',fld:'vINBARCODREO',pic:'9',hsh:true},{av:'AV10InBarCodPar',fld:'vINBARCODPAR',pic:'',hsh:true},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV20TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV21TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV22TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV23TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'AV24TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV25TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV26TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV27TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV28TFBarFasCon',fld:'vTFBARFASCON',pic:'@!'},{av:'AV29TFBarFasCon_Sel',fld:'vTFBARFASCON_SEL',pic:'@!'},{av:'AV30TFBarFasEst',fld:'vTFBARFASEST',pic:'9'},{av:'AV31TFBarFasEst_To',fld:'vTFBARFASEST_TO',pic:'9'},{av:'AV32TFBarFacTin',fld:'vTFBARFACTIN',pic:'@!'},{av:'AV33TFBarFacTin_Sel',fld:'vTFBARFACTIN_SEL',pic:'@!'},{av:'AV34TFBarFecRea',fld:'vTFBARFECREA',pic:''},{av:'AV38TFBarTieTeo',fld:'vTFBARTIETEO',pic:'Z9.99'},{av:'AV39TFBarTieTeo_To',fld:'vTFBARTIETEO_TO',pic:'Z9.99'},{av:'AV40TFBarFasDTI',fld:'vTFBARFASDTI',pic:'99/99/99 99:99:99'},{av:'AV44TFBarFasDTF',fld:'vTFBARFASDTF',pic:'99/99/99 99:99:99'},{av:'AV56Pgmname',fld:'vPGMNAME',pic:''},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV44TFBarFasDTF',fld:'vTFBARFASDTF',pic:'99/99/99 99:99:99'},{av:'AV40TFBarFasDTI',fld:'vTFBARFASDTI',pic:'99/99/99 99:99:99'},{av:'AV38TFBarTieTeo',fld:'vTFBARTIETEO',pic:'Z9.99'},{av:'AV39TFBarTieTeo_To',fld:'vTFBARTIETEO_TO',pic:'Z9.99'},{av:'AV34TFBarFecRea',fld:'vTFBARFECREA',pic:''},{av:'AV32TFBarFacTin',fld:'vTFBARFACTIN',pic:'@!'},{av:'AV33TFBarFacTin_Sel',fld:'vTFBARFACTIN_SEL',pic:'@!'},{av:'AV30TFBarFasEst',fld:'vTFBARFASEST',pic:'9'},{av:'AV31TFBarFasEst_To',fld:'vTFBARFASEST_TO',pic:'9'},{av:'AV28TFBarFasCon',fld:'vTFBARFASCON',pic:'@!'},{av:'AV29TFBarFasCon_Sel',fld:'vTFBARFASCON_SEL',pic:'@!'},{av:'AV26TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV27TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV24TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV25TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV22TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV23TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'AV20TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV21TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e171ZC2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV52Select',fld:'vSELECT',pic:''}]}");
      setEventMetadata("ENTER","{handler:'e181ZC2',iparms:[{av:'A153BarFasEst',fld:'BARFASEST',pic:'9',hsh:true},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9',hsh:true},{av:'A457FasCod',fld:'FASCOD',pic:'@!',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[{av:'AV12InOutBarOrdLin',fld:'vINOUTBARORDLIN',pic:'ZZZ9'},{av:'AV53OutFascod',fld:'vOUTFASCOD',pic:'@!'}]}");
      setEventMetadata("'DOCLEANFILTERS'","{handler:'e141ZC2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV7InEmprCod',fld:'vINEMPRCOD',pic:'@!',hsh:true},{av:'AV8InBarCod',fld:'vINBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV9InBarCodReo',fld:'vINBARCODREO',pic:'9',hsh:true},{av:'AV10InBarCodPar',fld:'vINBARCODPAR',pic:'',hsh:true},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV20TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV21TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV22TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV23TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'AV24TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV25TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV26TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV27TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV28TFBarFasCon',fld:'vTFBARFASCON',pic:'@!'},{av:'AV29TFBarFasCon_Sel',fld:'vTFBARFASCON_SEL',pic:'@!'},{av:'AV30TFBarFasEst',fld:'vTFBARFASEST',pic:'9'},{av:'AV31TFBarFasEst_To',fld:'vTFBARFASEST_TO',pic:'9'},{av:'AV32TFBarFacTin',fld:'vTFBARFACTIN',pic:'@!'},{av:'AV33TFBarFacTin_Sel',fld:'vTFBARFACTIN_SEL',pic:'@!'},{av:'AV34TFBarFecRea',fld:'vTFBARFECREA',pic:''},{av:'AV38TFBarTieTeo',fld:'vTFBARTIETEO',pic:'Z9.99'},{av:'AV39TFBarTieTeo_To',fld:'vTFBARTIETEO_TO',pic:'Z9.99'},{av:'AV40TFBarFasDTI',fld:'vTFBARFASDTI',pic:'99/99/99 99:99:99'},{av:'AV44TFBarFasDTF',fld:'vTFBARFASDTF',pic:'99/99/99 99:99:99'},{av:'AV56Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("'DOCLEANFILTERS'",",oparms:[{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV20TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV21TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV22TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV23TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'AV24TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV25TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV26TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV27TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV28TFBarFasCon',fld:'vTFBARFASCON',pic:'@!'},{av:'AV29TFBarFasCon_Sel',fld:'vTFBARFASCON_SEL',pic:'@!'},{av:'AV30TFBarFasEst',fld:'vTFBARFASEST',pic:'9'},{av:'AV31TFBarFasEst_To',fld:'vTFBARFASEST_TO',pic:'9'},{av:'AV32TFBarFacTin',fld:'vTFBARFACTIN',pic:'@!'},{av:'AV33TFBarFacTin_Sel',fld:'vTFBARFACTIN_SEL',pic:'@!'},{av:'AV34TFBarFecRea',fld:'vTFBARFECREA',pic:''},{av:'AV38TFBarTieTeo',fld:'vTFBARTIETEO',pic:'Z9.99'},{av:'AV39TFBarTieTeo_To',fld:'vTFBARTIETEO_TO',pic:'Z9.99'},{av:'AV40TFBarFasDTI',fld:'vTFBARFASDTI',pic:'99/99/99 99:99:99'},{av:'AV44TFBarFasDTF',fld:'vTFBARFASDTF',pic:'99/99/99 99:99:99'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'AV50GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV51GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[]");
      setEventMetadata("VALID_FASCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Barfasdtf',iparms:[]");
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
      wcpOAV7InEmprCod = "" ;
      wcpOAV10InBarCodPar = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV7InEmprCod = "" ;
      AV10InBarCodPar = "" ;
      AV53OutFascod = "" ;
      AV19FilterFullText = "" ;
      AV22TFMaqCodBis = "" ;
      AV23TFMaqCodBis_Sel = "" ;
      AV24TFFasCod = "" ;
      AV25TFFasCod_Sel = "" ;
      AV26TFFasDsc = "" ;
      AV27TFFasDsc_Sel = "" ;
      AV28TFBarFasCon = "" ;
      AV29TFBarFasCon_Sel = "" ;
      AV32TFBarFacTin = "" ;
      AV33TFBarFacTin_Sel = "" ;
      AV34TFBarFecRea = GXutil.nullDate() ;
      AV38TFBarTieTeo = DecimalUtil.ZERO ;
      AV39TFBarTieTeo_To = DecimalUtil.ZERO ;
      AV40TFBarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      AV44TFBarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      AV56Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV48DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV36DDO_BarFecReaAuxDate = GXutil.nullDate() ;
      AV42DDO_BarFasDTIAuxDate = GXutil.nullDate() ;
      AV46DDO_BarFasDTFAuxDate = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV52Select = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A758ProCod = "" ;
      A603MaqCodBis = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A152BarFasCon = "" ;
      A150BarFacTin = "" ;
      A160BarFecRea = GXutil.nullDate() ;
      A216BarTieTeo = DecimalUtil.ZERO ;
      A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      lV19FilterFullText = "" ;
      lV22TFMaqCodBis = "" ;
      lV24TFFasCod = "" ;
      lV26TFFasDsc = "" ;
      lV28TFBarFasCon = "" ;
      lV32TFBarFacTin = "" ;
      H01ZC2_A4443BarFasDTF = new java.util.Date[] {GXutil.nullDate()} ;
      H01ZC2_n4443BarFasDTF = new boolean[] {false} ;
      H01ZC2_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      H01ZC2_n4442BarFasDTI = new boolean[] {false} ;
      H01ZC2_A216BarTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01ZC2_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      H01ZC2_A150BarFacTin = new String[] {""} ;
      H01ZC2_A153BarFasEst = new byte[1] ;
      H01ZC2_A152BarFasCon = new String[] {""} ;
      H01ZC2_A460FasDsc = new String[] {""} ;
      H01ZC2_A457FasCod = new String[] {""} ;
      H01ZC2_A603MaqCodBis = new String[] {""} ;
      H01ZC2_A194BarOrdLin = new short[1] ;
      H01ZC2_A758ProCod = new String[] {""} ;
      H01ZC2_A130BarCodPar = new String[] {""} ;
      H01ZC2_A132BarCodReo = new byte[1] ;
      H01ZC2_A129BarCod = new int[1] ;
      H01ZC2_A396EmprCod = new String[] {""} ;
      H01ZC3_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV57Station = "" ;
      GXt_char1 = "" ;
      AV58Emprcod = "" ;
      GXv_char2 = new String[1] ;
      AV59Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV60Usurcod = "" ;
      GXv_char4 = new String[1] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV15GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      GXv_SdtWWPGridState8 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV16GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      lblCleanfilters_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.partedeproduccion_seleccion_hdr_orden_prompt__default(),
         new Object[] {
             new Object[] {
            H01ZC2_A4443BarFasDTF, H01ZC2_n4443BarFasDTF, H01ZC2_A4442BarFasDTI, H01ZC2_n4442BarFasDTI, H01ZC2_A216BarTieTeo, H01ZC2_A160BarFecRea, H01ZC2_A150BarFacTin, H01ZC2_A153BarFasEst, H01ZC2_A152BarFasCon, H01ZC2_A460FasDsc,
            H01ZC2_A457FasCod, H01ZC2_A603MaqCodBis, H01ZC2_A194BarOrdLin, H01ZC2_A758ProCod, H01ZC2_A130BarCodPar, H01ZC2_A132BarCodReo, H01ZC2_A129BarCod, H01ZC2_A396EmprCod
            }
            , new Object[] {
            H01ZC3_AGRID_nRecordCount
            }
         }
      );
      AV56Pgmname = "PartedeProduccion_Seleccion_HDR_Orden_Prompt" ;
      /* GeneXus formulas. */
      AV56Pgmname = "PartedeProduccion_Seleccion_HDR_Orden_Prompt" ;
      Gx_err = (short)(0) ;
      edtavSelect_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV9InBarCodReo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV9InBarCodReo ;
   private byte AV30TFBarFasEst ;
   private byte AV31TFBarFasEst_To ;
   private byte gxajaxcallmode ;
   private byte A132BarCodReo ;
   private byte A153BarFasEst ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wcpOAV12InOutBarOrdLin ;
   private short AV12InOutBarOrdLin ;
   private short AV17OrderedBy ;
   private short AV20TFBarOrdLin ;
   private short AV21TFBarOrdLin_To ;
   private short wbEnd ;
   private short wbStart ;
   private short A194BarOrdLin ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV8InBarCod ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_24 ;
   private int subGrid_Rows ;
   private int AV8InBarCod ;
   private int nGXsfl_24_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPgmname_Enabled ;
   private int A129BarCod ;
   private int subGrid_Islastpage ;
   private int edtavSelect_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV49PageToGo ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavSelect_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV50GridCurrentPage ;
   private long AV51GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV38TFBarTieTeo ;
   private java.math.BigDecimal AV39TFBarTieTeo_To ;
   private java.math.BigDecimal A216BarTieTeo ;
   private String wcpOAV7InEmprCod ;
   private String wcpOAV10InBarCodPar ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV7InEmprCod ;
   private String AV10InBarCodPar ;
   private String AV53OutFascod ;
   private String sGXsfl_24_idx="0001" ;
   private String AV22TFMaqCodBis ;
   private String AV23TFMaqCodBis_Sel ;
   private String AV24TFFasCod ;
   private String AV25TFFasCod_Sel ;
   private String AV26TFFasDsc ;
   private String AV27TFFasDsc_Sel ;
   private String AV28TFBarFasCon ;
   private String AV29TFBarFasCon_Sel ;
   private String AV32TFBarFacTin ;
   private String AV33TFBarFacTin_Sel ;
   private String AV56Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
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
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String divTableheader_Internalname ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_barfecreaauxdates_Internalname ;
   private String TempTags ;
   private String edtavDdo_barfecreaauxdate_Internalname ;
   private String edtavDdo_barfecreaauxdate_Jsonclick ;
   private String divDdo_barfasdtiauxdates_Internalname ;
   private String edtavDdo_barfasdtiauxdate_Internalname ;
   private String edtavDdo_barfasdtiauxdate_Jsonclick ;
   private String divDdo_barfasdtfauxdates_Internalname ;
   private String edtavDdo_barfasdtfauxdate_Internalname ;
   private String edtavDdo_barfasdtfauxdate_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV52Select ;
   private String edtavSelect_Internalname ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String A130BarCodPar ;
   private String edtBarCodPar_Internalname ;
   private String A758ProCod ;
   private String edtProCod_Internalname ;
   private String edtBarOrdLin_Internalname ;
   private String A603MaqCodBis ;
   private String edtMaqCodBis_Internalname ;
   private String A457FasCod ;
   private String edtFasCod_Internalname ;
   private String A460FasDsc ;
   private String edtFasDsc_Internalname ;
   private String A152BarFasCon ;
   private String edtBarFasCon_Internalname ;
   private String edtBarFasEst_Internalname ;
   private String A150BarFacTin ;
   private String edtBarFacTin_Internalname ;
   private String edtBarFecRea_Internalname ;
   private String edtBarTieTeo_Internalname ;
   private String edtBarFasDTI_Internalname ;
   private String edtBarFasDTF_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String scmdbuf ;
   private String lV22TFMaqCodBis ;
   private String lV24TFFasCod ;
   private String lV26TFFasDsc ;
   private String lV28TFBarFasCon ;
   private String lV32TFBarFacTin ;
   private String hsh ;
   private String AV57Station ;
   private String GXt_char1 ;
   private String AV58Emprcod ;
   private String GXv_char2[] ;
   private String AV59Emprnom ;
   private String GXv_char3[] ;
   private String AV60Usurcod ;
   private String GXv_char4[] ;
   private String tblTablefilters_Internalname ;
   private String lblCleanfilters_Internalname ;
   private String lblCleanfilters_Jsonclick ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sGXsfl_24_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavSelect_Jsonclick ;
   private String edtEmprCod_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String edtProCod_Jsonclick ;
   private String edtBarOrdLin_Jsonclick ;
   private String edtMaqCodBis_Jsonclick ;
   private String edtFasCod_Jsonclick ;
   private String edtFasDsc_Jsonclick ;
   private String edtBarFasCon_Jsonclick ;
   private String edtBarFasEst_Jsonclick ;
   private String edtBarFacTin_Jsonclick ;
   private String edtBarFecRea_Jsonclick ;
   private String edtBarTieTeo_Jsonclick ;
   private String edtBarFasDTI_Jsonclick ;
   private String edtBarFasDTF_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV40TFBarFasDTI ;
   private java.util.Date AV44TFBarFasDTF ;
   private java.util.Date A4442BarFasDTI ;
   private java.util.Date A4443BarFasDTF ;
   private java.util.Date AV34TFBarFecRea ;
   private java.util.Date AV36DDO_BarFecReaAuxDate ;
   private java.util.Date AV42DDO_BarFasDTIAuxDate ;
   private java.util.Date AV46DDO_BarFasDTFAuxDate ;
   private java.util.Date A160BarFecRea ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV18OrderedDsc ;
   private boolean Gridpaginationbar_Showfirst ;
   private boolean Gridpaginationbar_Showprevious ;
   private boolean Gridpaginationbar_Shownext ;
   private boolean Gridpaginationbar_Showlast ;
   private boolean Gridpaginationbar_Rowsperpageselector ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n4442BarFasDTI ;
   private boolean n4443BarFasDTF ;
   private boolean bGXsfl_24_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV19FilterFullText ;
   private String lV19FilterFullText ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] H01ZC2_A4443BarFasDTF ;
   private boolean[] H01ZC2_n4443BarFasDTF ;
   private java.util.Date[] H01ZC2_A4442BarFasDTI ;
   private boolean[] H01ZC2_n4442BarFasDTI ;
   private java.math.BigDecimal[] H01ZC2_A216BarTieTeo ;
   private java.util.Date[] H01ZC2_A160BarFecRea ;
   private String[] H01ZC2_A150BarFacTin ;
   private byte[] H01ZC2_A153BarFasEst ;
   private String[] H01ZC2_A152BarFasCon ;
   private String[] H01ZC2_A460FasDsc ;
   private String[] H01ZC2_A457FasCod ;
   private String[] H01ZC2_A603MaqCodBis ;
   private short[] H01ZC2_A194BarOrdLin ;
   private String[] H01ZC2_A758ProCod ;
   private String[] H01ZC2_A130BarCodPar ;
   private byte[] H01ZC2_A132BarCodReo ;
   private int[] H01ZC2_A129BarCod ;
   private String[] H01ZC2_A396EmprCod ;
   private long[] H01ZC3_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV15GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState8[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV16GridStateFilterValue ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV48DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class partedeproduccion_seleccion_hdr_orden_prompt__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01ZC2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV19FilterFullText ,
                                          short AV20TFBarOrdLin ,
                                          short AV21TFBarOrdLin_To ,
                                          String AV23TFMaqCodBis_Sel ,
                                          String AV22TFMaqCodBis ,
                                          String AV25TFFasCod_Sel ,
                                          String AV24TFFasCod ,
                                          String AV27TFFasDsc_Sel ,
                                          String AV26TFFasDsc ,
                                          String AV29TFBarFasCon_Sel ,
                                          String AV28TFBarFasCon ,
                                          byte AV30TFBarFasEst ,
                                          byte AV31TFBarFasEst_To ,
                                          String AV33TFBarFacTin_Sel ,
                                          String AV32TFBarFacTin ,
                                          java.util.Date AV34TFBarFecRea ,
                                          java.math.BigDecimal AV38TFBarTieTeo ,
                                          java.math.BigDecimal AV39TFBarTieTeo_To ,
                                          java.util.Date AV40TFBarFasDTI ,
                                          java.util.Date AV44TFBarFasDTF ,
                                          short A194BarOrdLin ,
                                          String A603MaqCodBis ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A152BarFasCon ,
                                          byte A153BarFasEst ,
                                          String A150BarFacTin ,
                                          java.math.BigDecimal A216BarTieTeo ,
                                          java.util.Date A160BarFecRea ,
                                          java.util.Date A4442BarFasDTI ,
                                          java.util.Date A4443BarFasDTF ,
                                          short AV17OrderedBy ,
                                          boolean AV18OrderedDsc ,
                                          String AV7InEmprCod ,
                                          int AV8InBarCod ,
                                          byte AV9InBarCodReo ,
                                          String AV10InBarCodPar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[36];
      Object[] GXv_Object10 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.BarFasDTF, T1.BarFasDTI, T1.BarTieTeo, T1.BarFecRea, T1.BarFacTin, T1.BarFasEst, T1.BarFasCon, T2.FasDsc, T1.FasCod, T1.MaqCodBis, T1.BarOrdLin, T1.ProCod, T1.BarCodPar," ;
      sSelectString += " T1.BarCodReo, T1.BarCod, T1.EmprCod" ;
      sFromString = " FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      if ( ! (GXutil.strcmp("", AV19FilterFullText)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.BarOrdLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.MaqCodBis) like '%' || UPPER(?)) or ( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T2.FasDsc) like '%' || UPPER(?)) or ( UPPER(T1.BarFasCon) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarFasEst,'90'), 2) like '%' || ?) or ( UPPER(T1.BarFacTin) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarTieTeo,'90.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int9[4] = (byte)(1) ;
         GXv_int9[5] = (byte)(1) ;
         GXv_int9[6] = (byte)(1) ;
         GXv_int9[7] = (byte)(1) ;
         GXv_int9[8] = (byte)(1) ;
         GXv_int9[9] = (byte)(1) ;
         GXv_int9[10] = (byte)(1) ;
         GXv_int9[11] = (byte)(1) ;
      }
      if ( ! (0==AV20TFBarOrdLin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int9[12] = (byte)(1) ;
      }
      if ( ! (0==AV21TFBarOrdLin_To) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int9[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV23TFMaqCodBis_Sel)==0) && ( ! (GXutil.strcmp("", AV22TFMaqCodBis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV23TFMaqCodBis_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int9[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV25TFFasCod_Sel)==0) && ( ! (GXutil.strcmp("", AV24TFFasCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV25TFFasCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int9[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV27TFFasDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV26TFFasDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV27TFFasDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int9[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV29TFBarFasCon_Sel)==0) && ( ! (GXutil.strcmp("", AV28TFBarFasCon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarFasCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV29TFBarFasCon_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasCon = ?)");
      }
      else
      {
         GXv_int9[21] = (byte)(1) ;
      }
      if ( ! (0==AV30TFBarFasEst) )
      {
         addWhere(sWhereString, "(T1.BarFasEst >= ?)");
      }
      else
      {
         GXv_int9[22] = (byte)(1) ;
      }
      if ( ! (0==AV31TFBarFasEst_To) )
      {
         addWhere(sWhereString, "(T1.BarFasEst <= ?)");
      }
      else
      {
         GXv_int9[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV33TFBarFacTin_Sel)==0) && ( ! (GXutil.strcmp("", AV32TFBarFacTin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarFacTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV33TFBarFacTin_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarFacTin = ?)");
      }
      else
      {
         GXv_int9[25] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV34TFBarFecRea)) )
      {
         addWhere(sWhereString, "(T1.BarFecRea >= ?)");
      }
      else
      {
         GXv_int9[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV38TFBarTieTeo)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieTeo >= ?)");
      }
      else
      {
         GXv_int9[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFBarTieTeo_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieTeo <= ?)");
      }
      else
      {
         GXv_int9[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV40TFBarFasDTI) )
      {
         addWhere(sWhereString, "(T1.BarFasDTI >= ?)");
      }
      else
      {
         GXv_int9[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV44TFBarFasDTF) )
      {
         addWhere(sWhereString, "(T1.BarFasDTF >= ?)");
      }
      else
      {
         GXv_int9[30] = (byte)(1) ;
      }
      if ( AV17OrderedBy == 1 )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarOrdLin" ;
      }
      else if ( ( AV17OrderedBy == 2 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarOrdLin" ;
      }
      else if ( ( AV17OrderedBy == 2 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarOrdLin DESC" ;
      }
      else if ( ( AV17OrderedBy == 3 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY T1.MaqCodBis" ;
      }
      else if ( ( AV17OrderedBy == 3 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.MaqCodBis DESC" ;
      }
      else if ( ( AV17OrderedBy == 4 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY T1.FasCod" ;
      }
      else if ( ( AV17OrderedBy == 4 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.FasCod DESC" ;
      }
      else if ( ( AV17OrderedBy == 5 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY T2.FasDsc" ;
      }
      else if ( ( AV17OrderedBy == 5 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.FasDsc DESC" ;
      }
      else if ( ( AV17OrderedBy == 6 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarFasCon" ;
      }
      else if ( ( AV17OrderedBy == 6 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarFasCon DESC" ;
      }
      else if ( ( AV17OrderedBy == 7 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarFasEst" ;
      }
      else if ( ( AV17OrderedBy == 7 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarFasEst DESC" ;
      }
      else if ( ( AV17OrderedBy == 8 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarFacTin" ;
      }
      else if ( ( AV17OrderedBy == 8 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarFacTin DESC" ;
      }
      else if ( ( AV17OrderedBy == 9 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarFecRea" ;
      }
      else if ( ( AV17OrderedBy == 9 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarFecRea DESC" ;
      }
      else if ( ( AV17OrderedBy == 10 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarTieTeo" ;
      }
      else if ( ( AV17OrderedBy == 10 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarTieTeo DESC" ;
      }
      else if ( ( AV17OrderedBy == 11 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarFasDTI" ;
      }
      else if ( ( AV17OrderedBy == 11 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarFasDTI DESC" ;
      }
      else if ( ( AV17OrderedBy == 12 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarFasDTF" ;
      }
      else if ( ( AV17OrderedBy == 12 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarFasDTF DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object10[0] = scmdbuf ;
      GXv_Object10[1] = GXv_int9 ;
      return GXv_Object10 ;
   }

   protected Object[] conditional_H01ZC3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV19FilterFullText ,
                                          short AV20TFBarOrdLin ,
                                          short AV21TFBarOrdLin_To ,
                                          String AV23TFMaqCodBis_Sel ,
                                          String AV22TFMaqCodBis ,
                                          String AV25TFFasCod_Sel ,
                                          String AV24TFFasCod ,
                                          String AV27TFFasDsc_Sel ,
                                          String AV26TFFasDsc ,
                                          String AV29TFBarFasCon_Sel ,
                                          String AV28TFBarFasCon ,
                                          byte AV30TFBarFasEst ,
                                          byte AV31TFBarFasEst_To ,
                                          String AV33TFBarFacTin_Sel ,
                                          String AV32TFBarFacTin ,
                                          java.util.Date AV34TFBarFecRea ,
                                          java.math.BigDecimal AV38TFBarTieTeo ,
                                          java.math.BigDecimal AV39TFBarTieTeo_To ,
                                          java.util.Date AV40TFBarFasDTI ,
                                          java.util.Date AV44TFBarFasDTF ,
                                          short A194BarOrdLin ,
                                          String A603MaqCodBis ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A152BarFasCon ,
                                          byte A153BarFasEst ,
                                          String A150BarFacTin ,
                                          java.math.BigDecimal A216BarTieTeo ,
                                          java.util.Date A160BarFecRea ,
                                          java.util.Date A4442BarFasDTI ,
                                          java.util.Date A4443BarFasDTF ,
                                          short AV17OrderedBy ,
                                          boolean AV18OrderedDsc ,
                                          String AV7InEmprCod ,
                                          int AV8InBarCod ,
                                          byte AV9InBarCodReo ,
                                          String AV10InBarCodPar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[31];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      if ( ! (GXutil.strcmp("", AV19FilterFullText)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.BarOrdLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.MaqCodBis) like '%' || UPPER(?)) or ( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T2.FasDsc) like '%' || UPPER(?)) or ( UPPER(T1.BarFasCon) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarFasEst,'90'), 2) like '%' || ?) or ( UPPER(T1.BarFacTin) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarTieTeo,'90.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int11[4] = (byte)(1) ;
         GXv_int11[5] = (byte)(1) ;
         GXv_int11[6] = (byte)(1) ;
         GXv_int11[7] = (byte)(1) ;
         GXv_int11[8] = (byte)(1) ;
         GXv_int11[9] = (byte)(1) ;
         GXv_int11[10] = (byte)(1) ;
         GXv_int11[11] = (byte)(1) ;
      }
      if ( ! (0==AV20TFBarOrdLin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int11[12] = (byte)(1) ;
      }
      if ( ! (0==AV21TFBarOrdLin_To) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int11[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV23TFMaqCodBis_Sel)==0) && ( ! (GXutil.strcmp("", AV22TFMaqCodBis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV23TFMaqCodBis_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int11[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV25TFFasCod_Sel)==0) && ( ! (GXutil.strcmp("", AV24TFFasCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV25TFFasCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int11[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV27TFFasDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV26TFFasDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV27TFFasDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int11[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV29TFBarFasCon_Sel)==0) && ( ! (GXutil.strcmp("", AV28TFBarFasCon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarFasCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV29TFBarFasCon_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasCon = ?)");
      }
      else
      {
         GXv_int11[21] = (byte)(1) ;
      }
      if ( ! (0==AV30TFBarFasEst) )
      {
         addWhere(sWhereString, "(T1.BarFasEst >= ?)");
      }
      else
      {
         GXv_int11[22] = (byte)(1) ;
      }
      if ( ! (0==AV31TFBarFasEst_To) )
      {
         addWhere(sWhereString, "(T1.BarFasEst <= ?)");
      }
      else
      {
         GXv_int11[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV33TFBarFacTin_Sel)==0) && ( ! (GXutil.strcmp("", AV32TFBarFacTin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarFacTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV33TFBarFacTin_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarFacTin = ?)");
      }
      else
      {
         GXv_int11[25] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV34TFBarFecRea)) )
      {
         addWhere(sWhereString, "(T1.BarFecRea >= ?)");
      }
      else
      {
         GXv_int11[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV38TFBarTieTeo)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieTeo >= ?)");
      }
      else
      {
         GXv_int11[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFBarTieTeo_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieTeo <= ?)");
      }
      else
      {
         GXv_int11[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV40TFBarFasDTI) )
      {
         addWhere(sWhereString, "(T1.BarFasDTI >= ?)");
      }
      else
      {
         GXv_int11[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV44TFBarFasDTF) )
      {
         addWhere(sWhereString, "(T1.BarFasDTF >= ?)");
      }
      else
      {
         GXv_int11[30] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV17OrderedBy == 1 )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 2 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 2 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 3 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 3 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 4 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 4 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 5 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 5 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 6 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 6 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 7 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 7 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 8 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 8 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 9 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 9 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 10 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 10 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 11 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 11 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 12 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 12 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
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
                  return conditional_H01ZC2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.util.Date)dynConstraints[18] , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , (java.util.Date)dynConstraints[30] , ((Number) dynConstraints[31]).shortValue() , ((Boolean) dynConstraints[32]).booleanValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).byteValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] );
            case 1 :
                  return conditional_H01ZC3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.util.Date)dynConstraints[18] , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , (java.util.Date)dynConstraints[30] , ((Number) dynConstraints[31]).shortValue() , ((Boolean) dynConstraints[32]).booleanValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).byteValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01ZC2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01ZC3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(3,2);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((String[]) buf[9])[0] = rslt.getString(8, 28);
               ((String[]) buf[10])[0] = rslt.getString(9, 8);
               ((String[]) buf[11])[0] = rslt.getString(10, 6);
               ((short[]) buf[12])[0] = rslt.getShort(11);
               ((String[]) buf[13])[0] = rslt.getString(12, 8);
               ((String[]) buf[14])[0] = rslt.getString(13, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(14);
               ((int[]) buf[16])[0] = rslt.getInt(15);
               ((String[]) buf[17])[0] = rslt.getString(16, 3);
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
                  stmt.setString(sIdx, (String)parms[36], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 28);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 28);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[58]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[62]);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[65], false);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[66], false);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[33]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[43]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 28);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 28);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 1);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[57]);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[60], false);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[61], false);
               }
               return;
      }
   }

}

