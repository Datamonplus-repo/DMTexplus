package app.trabajosexternos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class trabajoexterno_fase_una_impl extends GXDataArea
{
   public trabajoexterno_fase_una_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public trabajoexterno_fase_una_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( trabajoexterno_fase_una_impl.class ));
   }

   public trabajoexterno_fase_una_impl( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbBarFasEst = new HTMLChoice();
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
         entryPointCalled = false ;
         gxfirstwebparm = httpContext.GetFirstPar( "InOutEmprCod") ;
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
            gxfirstwebparm = httpContext.GetFirstPar( "InOutEmprCod") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "InOutEmprCod") ;
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
            AV22InOutEmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22InOutEmprCod", AV22InOutEmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINOUTEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV22InOutEmprCod, "@!"))));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV18InOutBarCod = (int)(GXutil.lval( httpContext.GetPar( "InOutBarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18InOutBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18InOutBarCod), 8, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINOUTBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18InOutBarCod), "ZZZZZZZ9")));
               AV20InOutBarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "InOutBarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV20InOutBarCodReo", GXutil.str( AV20InOutBarCodReo, 1, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINOUTBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV20InOutBarCodReo), "9")));
               AV19InOutBarCodPar = httpContext.GetPar( "InOutBarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV19InOutBarCodPar", AV19InOutBarCodPar);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINOUTBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV19InOutBarCodPar, ""))));
               AV21InOutBarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "InOutBarOrdLin"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV21InOutBarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21InOutBarOrdLin), 4, 0));
               AV23InOutFascod = httpContext.GetPar( "InOutFascod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV23InOutFascod", AV23InOutFascod);
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
      AV12FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV22InOutEmprCod = httpContext.GetPar( "InOutEmprCod") ;
      AV18InOutBarCod = (int)(GXutil.lval( httpContext.GetPar( "InOutBarCod"))) ;
      AV20InOutBarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "InOutBarCodReo"))) ;
      AV19InOutBarCodPar = httpContext.GetPar( "InOutBarCodPar") ;
      AV26OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV27OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV38TFProCod = httpContext.GetPar( "TFProCod") ;
      AV39TFProCod_Sel = httpContext.GetPar( "TFProCod_Sel") ;
      AV32TFBarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "TFBarOrdLin"))) ;
      AV33TFBarOrdLin_To = (short)(GXutil.lval( httpContext.GetPar( "TFBarOrdLin_To"))) ;
      AV34TFFasCod = httpContext.GetPar( "TFFasCod") ;
      AV35TFFasCod_Sel = httpContext.GetPar( "TFFasCod_Sel") ;
      AV36TFFasDsc = httpContext.GetPar( "TFFasDsc") ;
      AV37TFFasDsc_Sel = httpContext.GetPar( "TFFasDsc_Sel") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV30TFBarFasEst_Sels);
      AV43Pgmname = httpContext.GetPar( "Pgmname") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV12FilterFullText, AV22InOutEmprCod, AV18InOutBarCod, AV20InOutBarCodReo, AV19InOutBarCodPar, AV26OrderedBy, AV27OrderedDsc, AV38TFProCod, AV39TFProCod_Sel, AV32TFBarOrdLin, AV33TFBarOrdLin_To, AV34TFFasCod, AV35TFFasCod_Sel, AV36TFFasDsc, AV37TFFasDsc_Sel, AV30TFBarFasEst_Sels, AV43Pgmname) ;
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
      pa27A2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start27A2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal FormNoBackgroundColor\" data-gx-class=\"form-horizontal FormNoBackgroundColor\" novalidate action=\""+formatLink("app.trabajosexternos.trabajoexterno_fase_una", new String[] {GXutil.URLEncode(GXutil.rtrim(AV22InOutEmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV18InOutBarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV20InOutBarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV19InOutBarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV21InOutBarOrdLin,4,0)),GXutil.URLEncode(GXutil.rtrim(AV23InOutFascod))}, new String[] {"InOutEmprCod","InOutBarCod","InOutBarCodReo","InOutBarCodPar","InOutBarOrdLin","InOutFascod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINOUTBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV19InOutBarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINOUTBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV20InOutBarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINOUTBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18InOutBarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINOUTEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV22InOutEmprCod, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TrabajoExterno_Fase_una");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV43Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("trabajosexternos\\trabajoexterno_fase_una:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vFILTERFULLTEXT", AV12FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_24", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_24, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV13GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV14GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV10DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV10DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV26OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV27OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROCOD", GXutil.rtrim( AV38TFProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROCOD_SEL", GXutil.rtrim( AV39TFProCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARORDLIN", GXutil.ltrim( localUtil.ntoc( AV32TFBarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARORDLIN_TO", GXutil.ltrim( localUtil.ntoc( AV33TFBarOrdLin_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASCOD", GXutil.rtrim( AV34TFFasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASCOD_SEL", GXutil.rtrim( AV35TFFasCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASDSC", GXutil.rtrim( AV36TFFasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASDSC_SEL", GXutil.rtrim( AV37TFFasDsc_Sel));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFBARFASEST_SELS", AV30TFBarFasEst_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFBARFASEST_SELS", AV30TFBarFasEst_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vINOUTBARCODPAR", GXutil.rtrim( AV19InOutBarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINOUTBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV19InOutBarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vINOUTBARCODREO", GXutil.ltrim( localUtil.ntoc( AV20InOutBarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINOUTBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV20InOutBarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINOUTBARCOD", GXutil.ltrim( localUtil.ntoc( AV18InOutBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINOUTBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18InOutBarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINOUTEMPRCOD", GXutil.rtrim( AV22InOutEmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINOUTEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV22InOutEmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vINOUTFASCOD", GXutil.rtrim( AV23InOutFascod));
      app.GxWebStd.gx_hidden_field( httpContext, "vINOUTBARORDLIN", GXutil.ltrim( localUtil.ntoc( AV21InOutBarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Allowmultipleselection", GXutil.rtrim( Ddo_grid_Allowmultipleselection));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistfixedvalues", GXutil.rtrim( Ddo_grid_Datalistfixedvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
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
         we27A2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt27A2( ) ;
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
      return formatLink("app.trabajosexternos.trabajoexterno_fase_una", new String[] {GXutil.URLEncode(GXutil.rtrim(AV22InOutEmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV18InOutBarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV20InOutBarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV19InOutBarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV21InOutBarOrdLin,4,0)),GXutil.URLEncode(GXutil.rtrim(AV23InOutFascod))}, new String[] {"InOutEmprCod","InOutBarCod","InOutBarCodReo","InOutBarCodPar","InOutBarOrdLin","InOutFascod"})  ;
   }

   public String getPgmname( )
   {
      return "TrabajosExternos.TrabajoExterno_Fase_una" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Selecciona Tabla BARFAS", "") ;
   }

   public void wb27A0( )
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
         wb_table1_12_27A2( true) ;
      }
      else
      {
         wb_table1_12_27A2( false) ;
      }
      return  ;
   }

   public void wb_table1_12_27A2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV13GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV14GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, "GRIDPAGINATIONBARContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 24, 2, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TrabajosExternos\\TrabajoExterno_Fase_una.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV43Pgmname), GXutil.rtrim( localUtil.format( AV43Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TrabajoExterno_Fase_una.htm");
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
         ucDdo_grid.setProperty("AllowMultipleSelection", Ddo_grid_Allowmultipleselection);
         ucDdo_grid.setProperty("DataListFixedValues", Ddo_grid_Datalistfixedvalues);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV10DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
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

   public void start27A2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Selecciona Tabla BARFAS", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup27A0( ) ;
   }

   public void ws27A2( )
   {
      start27A2( ) ;
      evt27A2( ) ;
   }

   public void evt27A2( )
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
                           e1127A2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1227A2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1327A2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCLEANFILTERS'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCleanFilters' */
                           e1427A2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e1527A2 ();
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
                           AV29Select = httpContext.cgiGet( edtavSelect_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavSelect_Internalname, AV29Select);
                           A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
                           A194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
                           A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
                           cmbBarFasEst.setName( cmbBarFasEst.getInternalname() );
                           cmbBarFasEst.setValue( httpContext.cgiGet( cmbBarFasEst.getInternalname()) );
                           A153BarFasEst = (byte)(GXutil.lval( httpContext.cgiGet( cmbBarFasEst.getInternalname()))) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e1627A2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e1727A2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e1827A2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Filterfulltext Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV12FilterFullText) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e1927A2 ();
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

   public void we27A2( )
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

   public void pa27A2( )
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
                                 String AV12FilterFullText ,
                                 String AV22InOutEmprCod ,
                                 int AV18InOutBarCod ,
                                 byte AV20InOutBarCodReo ,
                                 String AV19InOutBarCodPar ,
                                 short AV26OrderedBy ,
                                 boolean AV27OrderedDsc ,
                                 String AV38TFProCod ,
                                 String AV39TFProCod_Sel ,
                                 short AV32TFBarOrdLin ,
                                 short AV33TFBarOrdLin_To ,
                                 String AV34TFFasCod ,
                                 String AV35TFFasCod_Sel ,
                                 String AV36TFFasDsc ,
                                 String AV37TFFasDsc_Sel ,
                                 GXSimpleCollection<Byte> AV30TFBarFasEst_Sels ,
                                 String AV43Pgmname )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e1727A2 ();
      GRID_nCurrentRecord = 0 ;
      rf27A2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TrabajoExterno_Fase_una");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV43Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("trabajosexternos\\trabajoexterno_fase_una:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
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
      rf27A2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV43Pgmname = "TrabajosExternos.TrabajoExterno_Fase_una" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43Pgmname", AV43Pgmname);
      Gx_err = (short)(0) ;
      edtavSelect_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSelect_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSelect_Enabled), 5, 0), !bGXsfl_24_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf27A2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(24) ;
      /* Execute user event: Refresh */
      e1727A2 ();
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
                                              Byte.valueOf(A153BarFasEst) ,
                                              AV30TFBarFasEst_Sels ,
                                              AV12FilterFullText ,
                                              AV39TFProCod_Sel ,
                                              AV38TFProCod ,
                                              Short.valueOf(AV32TFBarOrdLin) ,
                                              Short.valueOf(AV33TFBarOrdLin_To) ,
                                              AV35TFFasCod_Sel ,
                                              AV34TFFasCod ,
                                              AV37TFFasDsc_Sel ,
                                              AV36TFFasDsc ,
                                              Integer.valueOf(AV30TFBarFasEst_Sels.size()) ,
                                              A758ProCod ,
                                              Short.valueOf(A194BarOrdLin) ,
                                              A457FasCod ,
                                              A460FasDsc ,
                                              Short.valueOf(AV26OrderedBy) ,
                                              Boolean.valueOf(AV27OrderedDsc) ,
                                              AV22InOutEmprCod ,
                                              Integer.valueOf(AV18InOutBarCod) ,
                                              Byte.valueOf(AV20InOutBarCodReo) ,
                                              AV19InOutBarCodPar ,
                                              A396EmprCod ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar } ,
                                              new int[]{
                                              TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                              }
         });
         lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
         lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
         lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
         lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
         lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
         lV38TFProCod = GXutil.padr( GXutil.rtrim( AV38TFProCod), 8, "%") ;
         lV34TFFasCod = GXutil.padr( GXutil.rtrim( AV34TFFasCod), 8, "%") ;
         lV36TFFasDsc = GXutil.padr( GXutil.rtrim( AV36TFFasDsc), 28, "%") ;
         /* Using cursor H027A2 */
         pr_default.execute(0, new Object[] {AV22InOutEmprCod, Integer.valueOf(AV18InOutBarCod), Byte.valueOf(AV20InOutBarCodReo), AV19InOutBarCodPar, lV12FilterFullText, lV12FilterFullText, lV12FilterFullText, lV12FilterFullText, lV12FilterFullText, lV38TFProCod, AV39TFProCod_Sel, Short.valueOf(AV32TFBarOrdLin), Short.valueOf(AV33TFBarOrdLin_To), lV34TFFasCod, AV35TFFasCod_Sel, lV36TFFasDsc, AV37TFFasDsc_Sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_24_idx = 1 ;
         sGXsfl_24_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_24_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_242( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A130BarCodPar = H027A2_A130BarCodPar[0] ;
            A132BarCodReo = H027A2_A132BarCodReo[0] ;
            A129BarCod = H027A2_A129BarCod[0] ;
            A396EmprCod = H027A2_A396EmprCod[0] ;
            A153BarFasEst = H027A2_A153BarFasEst[0] ;
            A460FasDsc = H027A2_A460FasDsc[0] ;
            A457FasCod = H027A2_A457FasCod[0] ;
            A194BarOrdLin = H027A2_A194BarOrdLin[0] ;
            A758ProCod = H027A2_A758ProCod[0] ;
            A460FasDsc = H027A2_A460FasDsc[0] ;
            e1827A2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(24) ;
         wb27A0( ) ;
      }
      bGXsfl_24_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes27A2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARORDLIN"+"_"+sGXsfl_24_idx, getSecureSignedToken( sGXsfl_24_idx, localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_FASCOD"+"_"+sGXsfl_24_idx, getSecureSignedToken( sGXsfl_24_idx, GXutil.rtrim( localUtil.format( A457FasCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vINOUTBARCODPAR", GXutil.rtrim( AV19InOutBarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINOUTBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV19InOutBarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vINOUTBARCODREO", GXutil.ltrim( localUtil.ntoc( AV20InOutBarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINOUTBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV20InOutBarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINOUTBARCOD", GXutil.ltrim( localUtil.ntoc( AV18InOutBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINOUTBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18InOutBarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINOUTEMPRCOD", GXutil.rtrim( AV22InOutEmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINOUTEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV22InOutEmprCod, "@!"))));
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
                                           Byte.valueOf(A153BarFasEst) ,
                                           AV30TFBarFasEst_Sels ,
                                           AV12FilterFullText ,
                                           AV39TFProCod_Sel ,
                                           AV38TFProCod ,
                                           Short.valueOf(AV32TFBarOrdLin) ,
                                           Short.valueOf(AV33TFBarOrdLin_To) ,
                                           AV35TFFasCod_Sel ,
                                           AV34TFFasCod ,
                                           AV37TFFasDsc_Sel ,
                                           AV36TFFasDsc ,
                                           Integer.valueOf(AV30TFBarFasEst_Sels.size()) ,
                                           A758ProCod ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           Short.valueOf(AV26OrderedBy) ,
                                           Boolean.valueOf(AV27OrderedDsc) ,
                                           AV22InOutEmprCod ,
                                           Integer.valueOf(AV18InOutBarCod) ,
                                           Byte.valueOf(AV20InOutBarCodReo) ,
                                           AV19InOutBarCodPar ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
      lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
      lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
      lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
      lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
      lV38TFProCod = GXutil.padr( GXutil.rtrim( AV38TFProCod), 8, "%") ;
      lV34TFFasCod = GXutil.padr( GXutil.rtrim( AV34TFFasCod), 8, "%") ;
      lV36TFFasDsc = GXutil.padr( GXutil.rtrim( AV36TFFasDsc), 28, "%") ;
      /* Using cursor H027A3 */
      pr_default.execute(1, new Object[] {AV22InOutEmprCod, Integer.valueOf(AV18InOutBarCod), Byte.valueOf(AV20InOutBarCodReo), AV19InOutBarCodPar, lV12FilterFullText, lV12FilterFullText, lV12FilterFullText, lV12FilterFullText, lV12FilterFullText, lV38TFProCod, AV39TFProCod_Sel, Short.valueOf(AV32TFBarOrdLin), Short.valueOf(AV33TFBarOrdLin_To), lV34TFFasCod, AV35TFFasCod_Sel, lV36TFFasDsc, AV37TFFasDsc_Sel});
      GRID_nRecordCount = H027A3_AGRID_nRecordCount[0] ;
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
         gxgrgrid_refresh( subGrid_Rows, AV12FilterFullText, AV22InOutEmprCod, AV18InOutBarCod, AV20InOutBarCodReo, AV19InOutBarCodPar, AV26OrderedBy, AV27OrderedDsc, AV38TFProCod, AV39TFProCod_Sel, AV32TFBarOrdLin, AV33TFBarOrdLin_To, AV34TFFasCod, AV35TFFasCod_Sel, AV36TFFasDsc, AV37TFFasDsc_Sel, AV30TFBarFasEst_Sels, AV43Pgmname) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV12FilterFullText, AV22InOutEmprCod, AV18InOutBarCod, AV20InOutBarCodReo, AV19InOutBarCodPar, AV26OrderedBy, AV27OrderedDsc, AV38TFProCod, AV39TFProCod_Sel, AV32TFBarOrdLin, AV33TFBarOrdLin_To, AV34TFFasCod, AV35TFFasCod_Sel, AV36TFFasDsc, AV37TFFasDsc_Sel, AV30TFBarFasEst_Sels, AV43Pgmname) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV12FilterFullText, AV22InOutEmprCod, AV18InOutBarCod, AV20InOutBarCodReo, AV19InOutBarCodPar, AV26OrderedBy, AV27OrderedDsc, AV38TFProCod, AV39TFProCod_Sel, AV32TFBarOrdLin, AV33TFBarOrdLin_To, AV34TFFasCod, AV35TFFasCod_Sel, AV36TFFasDsc, AV37TFFasDsc_Sel, AV30TFBarFasEst_Sels, AV43Pgmname) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV12FilterFullText, AV22InOutEmprCod, AV18InOutBarCod, AV20InOutBarCodReo, AV19InOutBarCodPar, AV26OrderedBy, AV27OrderedDsc, AV38TFProCod, AV39TFProCod_Sel, AV32TFBarOrdLin, AV33TFBarOrdLin_To, AV34TFFasCod, AV35TFFasCod_Sel, AV36TFFasDsc, AV37TFFasDsc_Sel, AV30TFBarFasEst_Sels, AV43Pgmname) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV12FilterFullText, AV22InOutEmprCod, AV18InOutBarCod, AV20InOutBarCodReo, AV19InOutBarCodPar, AV26OrderedBy, AV27OrderedDsc, AV38TFProCod, AV39TFProCod_Sel, AV32TFBarOrdLin, AV33TFBarOrdLin_To, AV34TFFasCod, AV35TFFasCod_Sel, AV36TFFasDsc, AV37TFFasDsc_Sel, AV30TFBarFasEst_Sels, AV43Pgmname) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV43Pgmname = "TrabajosExternos.TrabajoExterno_Fase_una" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43Pgmname", AV43Pgmname);
      Gx_err = (short)(0) ;
      edtavSelect_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSelect_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSelect_Enabled), 5, 0), !bGXsfl_24_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup27A0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1627A2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV10DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_24 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_24"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV13GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV14GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         Ddo_grid_Allowmultipleselection = httpContext.cgiGet( "DDO_GRID_Allowmultipleselection") ;
         Ddo_grid_Datalistfixedvalues = httpContext.cgiGet( "DDO_GRID_Datalistfixedvalues") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( "DDO_GRID_Datalistproc") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( "GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( "DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( "DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( "DDO_GRID_Selectedcolumn") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( "DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( "DDO_GRID_Filteredtextto_get") ;
         /* Read variables values. */
         AV12FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12FilterFullText", AV12FilterFullText);
         AV43Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV43Pgmname", AV43Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"TrabajoExterno_Fase_una");
         AV43Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV43Pgmname", AV43Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV43Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("trabajosexternos\\trabajoexterno_fase_una:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV12FilterFullText) != 0 )
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
      e1627A2 ();
      if (returnInSub) return;
   }

   public void e1627A2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      trabajoexterno_fase_una_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Station = GXt_char1 ;
      GXv_char2[0] = AV5EmprCod ;
      GXv_char3[0] = AV6EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV7Station, GXv_char2, GXv_char3, GXv_char4) ;
      trabajoexterno_fase_una_impl.this.AV5EmprCod = GXv_char2[0] ;
      trabajoexterno_fase_una_impl.this.AV6EmprNom = GXv_char3[0] ;
      trabajoexterno_fase_una_impl.this.AV8UsurCod = GXv_char4[0] ;
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( "Selecciona Tabla BARFAS", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      if ( AV26OrderedBy < 1 )
      {
         AV26OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S112 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV10DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV10DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e1727A2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV40WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV40WWPContext = GXv_SdtWWPContext7[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      AV13GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13GridCurrentPage), 10, 0));
      AV14GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14GridPageCount), 10, 0));
      /*  Sending Event outputs  */
   }

   public void e1127A2( )
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
         AV28PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV28PageToGo) ;
      }
   }

   public void e1227A2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e1327A2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV26OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26OrderedBy), 4, 0));
         AV27OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27OrderedDsc", AV27OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S112 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProCod") == 0 )
         {
            AV38TFProCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFProCod", AV38TFProCod);
            AV39TFProCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFProCod_Sel", AV39TFProCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarOrdLin") == 0 )
         {
            AV32TFBarOrdLin = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFBarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32TFBarOrdLin), 4, 0));
            AV33TFBarOrdLin_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFBarOrdLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33TFBarOrdLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasCod") == 0 )
         {
            AV34TFFasCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFFasCod", AV34TFFasCod);
            AV35TFFasCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFFasCod_Sel", AV35TFFasCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasDsc") == 0 )
         {
            AV36TFFasDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFFasDsc", AV36TFFasDsc);
            AV37TFFasDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFFasDsc_Sel", AV37TFFasDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFasEst") == 0 )
         {
            AV31TFBarFasEst_SelsJson = Ddo_grid_Selectedvalue_get ;
            AV30TFBarFasEst_Sels.fromJSonString(GXutil.strReplace( AV31TFBarFasEst_SelsJson, "\"", ""), null);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30TFBarFasEst_Sels", AV30TFBarFasEst_Sels);
   }

   private void e1827A2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV29Select = "<i class=\"fas fa-check\"></i>" ;
      httpContext.ajax_rsp_assign_attri("", false, edtavSelect_Internalname, AV29Select);
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
      e1927A2 ();
      if (returnInSub) return;
   }

   public void e1927A2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      AV21InOutBarOrdLin = A194BarOrdLin ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21InOutBarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21InOutBarOrdLin), 4, 0));
      AV23InOutFascod = A457FasCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23InOutFascod", AV23InOutFascod);
      httpContext.setWebReturnParms(new Object[] {AV22InOutEmprCod,Integer.valueOf(AV18InOutBarCod),Byte.valueOf(AV20InOutBarCodReo),AV19InOutBarCodPar,Short.valueOf(AV21InOutBarOrdLin),AV23InOutFascod});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV22InOutEmprCod","AV18InOutBarCod","AV20InOutBarCodReo","AV19InOutBarCodPar","AV21InOutBarOrdLin","AV23InOutFascod"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
   }

   public void e1427A2( )
   {
      /* 'DoCleanFilters' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'CLEANFILTERS' */
      S132 ();
      if (returnInSub) return;
      subgrid_firstpage( ) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30TFBarFasEst_Sels", AV30TFBarFasEst_Sels);
   }

   public void e1527A2( )
   {
      /* 'DoCerrar' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {AV22InOutEmprCod,Integer.valueOf(AV18InOutBarCod),Byte.valueOf(AV20InOutBarCodReo),AV19InOutBarCodPar,Short.valueOf(AV21InOutBarOrdLin),AV23InOutFascod});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV22InOutEmprCod","AV18InOutBarCod","AV20InOutBarCodReo","AV19InOutBarCodPar","AV21InOutBarOrdLin","AV23InOutFascod"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S112( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV26OrderedBy, 4, 0))+":"+(AV27OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S132( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV12FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12FilterFullText", AV12FilterFullText);
      AV38TFProCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38TFProCod", AV38TFProCod);
      AV39TFProCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39TFProCod_Sel", AV39TFProCod_Sel);
      AV32TFBarOrdLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32TFBarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32TFBarOrdLin), 4, 0));
      AV33TFBarOrdLin_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33TFBarOrdLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33TFBarOrdLin_To), 4, 0));
      AV34TFFasCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34TFFasCod", AV34TFFasCod);
      AV35TFFasCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35TFFasCod_Sel", AV35TFFasCod_Sel);
      AV36TFFasDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36TFFasDsc", AV36TFFasDsc);
      AV37TFFasDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37TFFasDsc_Sel", AV37TFFasDsc_Sel);
      AV30TFBarFasEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "") ;
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
      AV15GridState.setgxTv_SdtWWPGridState_Orderedby( AV26OrderedBy );
      AV15GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV27OrderedDsc );
      AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState8[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState8, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV12FilterFullText)==0), (short)(0), AV12FilterFullText, "") ;
      AV15GridState = GXv_SdtWWPGridState8[0] ;
      GXv_SdtWWPGridState8[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState8, "TFPROCOD", "", !(GXutil.strcmp("", AV38TFProCod)==0), (short)(0), AV38TFProCod, "", !(GXutil.strcmp("", AV39TFProCod_Sel)==0), AV39TFProCod_Sel, "") ;
      AV15GridState = GXv_SdtWWPGridState8[0] ;
      GXv_SdtWWPGridState8[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState8, "TFBARORDLIN", "", !((0==AV32TFBarOrdLin)&&(0==AV33TFBarOrdLin_To)), (short)(0), GXutil.trim( GXutil.str( AV32TFBarOrdLin, 4, 0)), GXutil.trim( GXutil.str( AV33TFBarOrdLin_To, 4, 0))) ;
      AV15GridState = GXv_SdtWWPGridState8[0] ;
      GXv_SdtWWPGridState8[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState8, "TFFASCOD", "", !(GXutil.strcmp("", AV34TFFasCod)==0), (short)(0), AV34TFFasCod, "", !(GXutil.strcmp("", AV35TFFasCod_Sel)==0), AV35TFFasCod_Sel, "") ;
      AV15GridState = GXv_SdtWWPGridState8[0] ;
      GXv_SdtWWPGridState8[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState8, "TFFASDSC", "", !(GXutil.strcmp("", AV36TFFasDsc)==0), (short)(0), AV36TFFasDsc, "", !(GXutil.strcmp("", AV37TFFasDsc_Sel)==0), AV37TFFasDsc_Sel, "") ;
      AV15GridState = GXv_SdtWWPGridState8[0] ;
      GXv_SdtWWPGridState8[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState8, "TFBARFASEST_SEL", "", !(AV30TFBarFasEst_Sels.size()==0), (short)(0), AV30TFBarFasEst_Sels.toJSonString(false), "") ;
      AV15GridState = GXv_SdtWWPGridState8[0] ;
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV43Pgmname+"GridState", AV15GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void wb_table1_12_27A2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablefilters_Internalname, tblTablefilters_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='CellAlignTopPaddingTop10'>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblCleanfilters_Internalname, httpContext.getMessage( "<i class=\"fas fa-filter CleanFiltersIcon\"></i>", ""), "", "", lblCleanfilters_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'DOCLEANFILTERS\\'."+"'", "", "TextBlock", 5, httpContext.getMessage( "WWP_CleanFiltersTooltip", ""), 1, 1, 0, (short)(1), "HLP_TrabajosExternos\\TrabajoExterno_Fase_una.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFilterfulltext_Internalname, httpContext.getMessage( "Filter Full Text", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'" + sGXsfl_24_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV12FilterFullText, GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,18);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_TrabajosExternos\\TrabajoExterno_Fase_una.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_12_27A2e( true) ;
      }
      else
      {
         wb_table1_12_27A2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV22InOutEmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22InOutEmprCod", AV22InOutEmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINOUTEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV22InOutEmprCod, "@!"))));
      AV18InOutBarCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18InOutBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18InOutBarCod), 8, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINOUTBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18InOutBarCod), "ZZZZZZZ9")));
      AV20InOutBarCodReo = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20InOutBarCodReo", GXutil.str( AV20InOutBarCodReo, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINOUTBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV20InOutBarCodReo), "9")));
      AV19InOutBarCodPar = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19InOutBarCodPar", AV19InOutBarCodPar);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINOUTBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV19InOutBarCodPar, ""))));
      AV21InOutBarOrdLin = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21InOutBarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21InOutBarOrdLin), 4, 0));
      AV23InOutFascod = (String)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23InOutFascod", AV23InOutFascod);
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
      pa27A2( ) ;
      ws27A2( ) ;
      we27A2( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116145644", true, true);
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
      httpContext.AddJavascriptSource("trabajosexternos/trabajoexterno_fase_una.js", "?202682116145645", false, true);
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
      edtProCod_Internalname = "PROCOD_"+sGXsfl_24_idx ;
      edtBarOrdLin_Internalname = "BARORDLIN_"+sGXsfl_24_idx ;
      edtFasCod_Internalname = "FASCOD_"+sGXsfl_24_idx ;
      edtFasDsc_Internalname = "FASDSC_"+sGXsfl_24_idx ;
      cmbBarFasEst.setInternalname( "BARFASEST_"+sGXsfl_24_idx );
   }

   public void subsflControlProps_fel_242( )
   {
      edtavSelect_Internalname = "vSELECT_"+sGXsfl_24_fel_idx ;
      edtProCod_Internalname = "PROCOD_"+sGXsfl_24_fel_idx ;
      edtBarOrdLin_Internalname = "BARORDLIN_"+sGXsfl_24_fel_idx ;
      edtFasCod_Internalname = "FASCOD_"+sGXsfl_24_fel_idx ;
      edtFasDsc_Internalname = "FASDSC_"+sGXsfl_24_fel_idx ;
      cmbBarFasEst.setInternalname( "BARFASEST_"+sGXsfl_24_fel_idx );
   }

   public void sendrow_242( )
   {
      subsflControlProps_242( ) ;
      wb27A0( ) ;
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
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSelect_Internalname,GXutil.rtrim( AV29Select),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavSelect_Enabled!=0)&&(edtavSelect_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,25);\"" : " "),"'"+""+"'"+",false,"+"'"+"EENTER."+sGXsfl_24_idx+"'","","",httpContext.getMessage( "GX_BtnSelect", ""),"",edtavSelect_Jsonclick,Integer.valueOf(5),"Attribute","",ROClassString,"WWIconActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSelect_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProCod_Internalname,GXutil.rtrim( A758ProCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
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
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( cmbBarFasEst.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "BARFASEST_" + sGXsfl_24_idx ;
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
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbBarFasEst,cmbBarFasEst.getInternalname(),GXutil.trim( GXutil.str( A153BarFasEst, 1, 0)),Integer.valueOf(1),cmbBarFasEst.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbBarFasEst.setValue( GXutil.trim( GXutil.str( A153BarFasEst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbBarFasEst.getInternalname(), "Values", cmbBarFasEst.ToJavascriptSource(), !bGXsfl_24_Refreshing);
         send_integrity_lvl_hashes27A2( ) ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Proceso", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Orden", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Estado", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV29Select));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSelect_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A758ProCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A457FasCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A460FasDsc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A153BarFasEst, (byte)(1), (byte)(0), ".", "")));
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
      edtProCod_Internalname = "PROCOD" ;
      edtBarOrdLin_Internalname = "BARORDLIN" ;
      edtFasCod_Internalname = "FASCOD" ;
      edtFasDsc_Internalname = "FASDSC" ;
      cmbBarFasEst.setInternalname( "BARFASEST" );
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
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
      cmbBarFasEst.setJsonclick( "" );
      edtFasDsc_Jsonclick = "" ;
      edtFasCod_Jsonclick = "" ;
      edtBarOrdLin_Jsonclick = "" ;
      edtProCod_Jsonclick = "" ;
      edtavSelect_Jsonclick = "" ;
      edtavSelect_Visible = -1 ;
      edtavSelect_Enabled = 1 ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_grid_Datalistproc = "TrabajosExternos.TrabajoExterno_Fase_unaGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "||||0:Pendiente,1:En Proceso,2:Finalizada" ;
      Ddo_grid_Allowmultipleselection = "||||T" ;
      Ddo_grid_Datalisttype = "Dynamic||Dynamic|Dynamic|FixedValues" ;
      Ddo_grid_Includedatalist = "T||T|T|T" ;
      Ddo_grid_Filterisrange = "|T|||" ;
      Ddo_grid_Filtertype = "Character|Numeric|Character|Character|" ;
      Ddo_grid_Includefilter = "T|T|T|T|" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6" ;
      Ddo_grid_Columnids = "1:ProCod|2:BarOrdLin|3:FasCod|4:FasDsc|5:BarFasEst" ;
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
      Form.setCaption( httpContext.getMessage( "Selecciona Tabla BARFAS", "") );
      subGrid_Rows = 0 ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "BARFASEST_" + sGXsfl_24_idx ;
      cmbBarFasEst.setName( GXCCtl );
      cmbBarFasEst.setWebtags( "" );
      cmbBarFasEst.addItem("0", httpContext.getMessage( "Pendiente", ""), (short)(0));
      cmbBarFasEst.addItem("1", httpContext.getMessage( "En Proceso", ""), (short)(0));
      cmbBarFasEst.addItem("2", httpContext.getMessage( "Finalizada", ""), (short)(0));
      if ( cmbBarFasEst.getItemCount() > 0 )
      {
         A153BarFasEst = (byte)(GXutil.lval( cmbBarFasEst.getValidValue(GXutil.trim( GXutil.str( A153BarFasEst, 1, 0))))) ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV22InOutEmprCod',fld:'vINOUTEMPRCOD',pic:'@!',hsh:true},{av:'AV18InOutBarCod',fld:'vINOUTBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV20InOutBarCodReo',fld:'vINOUTBARCODREO',pic:'9',hsh:true},{av:'AV19InOutBarCodPar',fld:'vINOUTBARCODPAR',pic:'',hsh:true},{av:'AV26OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV27OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV38TFProCod',fld:'vTFPROCOD',pic:''},{av:'AV39TFProCod_Sel',fld:'vTFPROCOD_SEL',pic:''},{av:'AV32TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV33TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV34TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV35TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV36TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV37TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV30TFBarFasEst_Sels',fld:'vTFBARFASEST_SELS',pic:''},{av:'AV43Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV13GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV14GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1127A2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV22InOutEmprCod',fld:'vINOUTEMPRCOD',pic:'@!',hsh:true},{av:'AV18InOutBarCod',fld:'vINOUTBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV20InOutBarCodReo',fld:'vINOUTBARCODREO',pic:'9',hsh:true},{av:'AV19InOutBarCodPar',fld:'vINOUTBARCODPAR',pic:'',hsh:true},{av:'AV26OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV27OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV38TFProCod',fld:'vTFPROCOD',pic:''},{av:'AV39TFProCod_Sel',fld:'vTFPROCOD_SEL',pic:''},{av:'AV32TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV33TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV34TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV35TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV36TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV37TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV30TFBarFasEst_Sels',fld:'vTFBARFASEST_SELS',pic:''},{av:'AV43Pgmname',fld:'vPGMNAME',pic:''},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1227A2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV22InOutEmprCod',fld:'vINOUTEMPRCOD',pic:'@!',hsh:true},{av:'AV18InOutBarCod',fld:'vINOUTBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV20InOutBarCodReo',fld:'vINOUTBARCODREO',pic:'9',hsh:true},{av:'AV19InOutBarCodPar',fld:'vINOUTBARCODPAR',pic:'',hsh:true},{av:'AV26OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV27OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV38TFProCod',fld:'vTFPROCOD',pic:''},{av:'AV39TFProCod_Sel',fld:'vTFPROCOD_SEL',pic:''},{av:'AV32TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV33TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV34TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV35TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV36TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV37TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV30TFBarFasEst_Sels',fld:'vTFBARFASEST_SELS',pic:''},{av:'AV43Pgmname',fld:'vPGMNAME',pic:''},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e1327A2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV22InOutEmprCod',fld:'vINOUTEMPRCOD',pic:'@!',hsh:true},{av:'AV18InOutBarCod',fld:'vINOUTBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV20InOutBarCodReo',fld:'vINOUTBARCODREO',pic:'9',hsh:true},{av:'AV19InOutBarCodPar',fld:'vINOUTBARCODPAR',pic:'',hsh:true},{av:'AV26OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV27OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV38TFProCod',fld:'vTFPROCOD',pic:''},{av:'AV39TFProCod_Sel',fld:'vTFPROCOD_SEL',pic:''},{av:'AV32TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV33TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV34TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV35TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV36TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV37TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV30TFBarFasEst_Sels',fld:'vTFBARFASEST_SELS',pic:''},{av:'AV43Pgmname',fld:'vPGMNAME',pic:''},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV26OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV27OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV38TFProCod',fld:'vTFPROCOD',pic:''},{av:'AV39TFProCod_Sel',fld:'vTFPROCOD_SEL',pic:''},{av:'AV32TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV33TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV34TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV35TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV36TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV37TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV30TFBarFasEst_Sels',fld:'vTFBARFASEST_SELS',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e1827A2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV29Select',fld:'vSELECT',pic:''}]}");
      setEventMetadata("ENTER","{handler:'e1927A2',iparms:[{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9',hsh:true},{av:'A457FasCod',fld:'FASCOD',pic:'@!',hsh:true},{av:'AV19InOutBarCodPar',fld:'vINOUTBARCODPAR',pic:'',hsh:true},{av:'AV20InOutBarCodReo',fld:'vINOUTBARCODREO',pic:'9',hsh:true},{av:'AV18InOutBarCod',fld:'vINOUTBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV22InOutEmprCod',fld:'vINOUTEMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[{av:'AV21InOutBarOrdLin',fld:'vINOUTBARORDLIN',pic:'ZZZ9'},{av:'AV23InOutFascod',fld:'vINOUTFASCOD',pic:'@!'}]}");
      setEventMetadata("'DOCLEANFILTERS'","{handler:'e1427A2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV22InOutEmprCod',fld:'vINOUTEMPRCOD',pic:'@!',hsh:true},{av:'AV18InOutBarCod',fld:'vINOUTBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV20InOutBarCodReo',fld:'vINOUTBARCODREO',pic:'9',hsh:true},{av:'AV19InOutBarCodPar',fld:'vINOUTBARCODPAR',pic:'',hsh:true},{av:'AV26OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV27OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV38TFProCod',fld:'vTFPROCOD',pic:''},{av:'AV39TFProCod_Sel',fld:'vTFPROCOD_SEL',pic:''},{av:'AV32TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV33TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV34TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV35TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV36TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV37TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV30TFBarFasEst_Sels',fld:'vTFBARFASEST_SELS',pic:''},{av:'AV43Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("'DOCLEANFILTERS'",",oparms:[{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV38TFProCod',fld:'vTFPROCOD',pic:''},{av:'AV39TFProCod_Sel',fld:'vTFPROCOD_SEL',pic:''},{av:'AV32TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV33TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV34TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV35TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV36TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV37TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV30TFBarFasEst_Sels',fld:'vTFBARFASEST_SELS',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'AV13GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV14GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e1527A2',iparms:[{av:'AV23InOutFascod',fld:'vINOUTFASCOD',pic:'@!'},{av:'AV21InOutBarOrdLin',fld:'vINOUTBARORDLIN',pic:'ZZZ9'},{av:'AV19InOutBarCodPar',fld:'vINOUTBARCODPAR',pic:'',hsh:true},{av:'AV20InOutBarCodReo',fld:'vINOUTBARCODREO',pic:'9',hsh:true},{av:'AV18InOutBarCod',fld:'vINOUTBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV22InOutEmprCod',fld:'vINOUTEMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[]");
      setEventMetadata("VALID_FASCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Barfasest',iparms:[]");
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
      wcpOAV22InOutEmprCod = "" ;
      wcpOAV19InOutBarCodPar = "" ;
      wcpOAV23InOutFascod = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV22InOutEmprCod = "" ;
      AV19InOutBarCodPar = "" ;
      AV23InOutFascod = "" ;
      AV12FilterFullText = "" ;
      AV38TFProCod = "" ;
      AV39TFProCod_Sel = "" ;
      AV34TFFasCod = "" ;
      AV35TFFasCod_Sel = "" ;
      AV36TFFasDsc = "" ;
      AV37TFFasDsc_Sel = "" ;
      AV30TFBarFasEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV43Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV10DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
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
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtncerrar_Jsonclick = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV29Select = "" ;
      A758ProCod = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      scmdbuf = "" ;
      lV12FilterFullText = "" ;
      lV38TFProCod = "" ;
      lV34TFFasCod = "" ;
      lV36TFFasDsc = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      H027A2_A130BarCodPar = new String[] {""} ;
      H027A2_A132BarCodReo = new byte[1] ;
      H027A2_A129BarCod = new int[1] ;
      H027A2_A396EmprCod = new String[] {""} ;
      H027A2_A153BarFasEst = new byte[1] ;
      H027A2_A460FasDsc = new String[] {""} ;
      H027A2_A457FasCod = new String[] {""} ;
      H027A2_A194BarOrdLin = new short[1] ;
      H027A2_A758ProCod = new String[] {""} ;
      H027A3_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV7Station = "" ;
      GXt_char1 = "" ;
      AV5EmprCod = "" ;
      GXv_char2 = new String[1] ;
      AV6EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV8UsurCod = "" ;
      GXv_char4 = new String[1] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV40WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV31TFBarFasEst_SelsJson = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV15GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      GXv_SdtWWPGridState8 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      lblCleanfilters_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.trabajoexterno_fase_una__default(),
         new Object[] {
             new Object[] {
            H027A2_A130BarCodPar, H027A2_A132BarCodReo, H027A2_A129BarCod, H027A2_A396EmprCod, H027A2_A153BarFasEst, H027A2_A460FasDsc, H027A2_A457FasCod, H027A2_A194BarOrdLin, H027A2_A758ProCod
            }
            , new Object[] {
            H027A3_AGRID_nRecordCount
            }
         }
      );
      AV43Pgmname = "TrabajosExternos.TrabajoExterno_Fase_una" ;
      /* GeneXus formulas. */
      AV43Pgmname = "TrabajosExternos.TrabajoExterno_Fase_una" ;
      Gx_err = (short)(0) ;
      edtavSelect_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV20InOutBarCodReo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV20InOutBarCodReo ;
   private byte gxajaxcallmode ;
   private byte A153BarFasEst ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte A132BarCodReo ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wcpOAV21InOutBarOrdLin ;
   private short AV21InOutBarOrdLin ;
   private short AV26OrderedBy ;
   private short AV32TFBarOrdLin ;
   private short AV33TFBarOrdLin_To ;
   private short wbEnd ;
   private short wbStart ;
   private short A194BarOrdLin ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV18InOutBarCod ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_24 ;
   private int subGrid_Rows ;
   private int AV18InOutBarCod ;
   private int nGXsfl_24_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int edtavSelect_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV30TFBarFasEst_Sels_size ;
   private int A129BarCod ;
   private int AV28PageToGo ;
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
   private long AV13GridCurrentPage ;
   private long AV14GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String wcpOAV22InOutEmprCod ;
   private String wcpOAV19InOutBarCodPar ;
   private String wcpOAV23InOutFascod ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV22InOutEmprCod ;
   private String AV19InOutBarCodPar ;
   private String AV23InOutFascod ;
   private String sGXsfl_24_idx="0001" ;
   private String AV38TFProCod ;
   private String AV39TFProCod_Sel ;
   private String AV34TFFasCod ;
   private String AV35TFFasCod_Sel ;
   private String AV36TFFasDsc ;
   private String AV37TFFasDsc_Sel ;
   private String AV43Pgmname ;
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
   private String Ddo_grid_Allowmultipleselection ;
   private String Ddo_grid_Datalistfixedvalues ;
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
   private String divUnnamedtable1_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV29Select ;
   private String edtavSelect_Internalname ;
   private String A758ProCod ;
   private String edtProCod_Internalname ;
   private String edtBarOrdLin_Internalname ;
   private String A457FasCod ;
   private String edtFasCod_Internalname ;
   private String A460FasDsc ;
   private String edtFasDsc_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String scmdbuf ;
   private String lV38TFProCod ;
   private String lV34TFFasCod ;
   private String lV36TFFasDsc ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String hsh ;
   private String AV7Station ;
   private String GXt_char1 ;
   private String AV5EmprCod ;
   private String GXv_char2[] ;
   private String AV6EmprNom ;
   private String GXv_char3[] ;
   private String AV8UsurCod ;
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
   private String edtProCod_Jsonclick ;
   private String edtBarOrdLin_Jsonclick ;
   private String edtFasCod_Jsonclick ;
   private String edtFasDsc_Jsonclick ;
   private String GXCCtl ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV27OrderedDsc ;
   private boolean Gridpaginationbar_Showfirst ;
   private boolean Gridpaginationbar_Showprevious ;
   private boolean Gridpaginationbar_Shownext ;
   private boolean Gridpaginationbar_Showlast ;
   private boolean Gridpaginationbar_Rowsperpageselector ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_24_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV31TFBarFasEst_SelsJson ;
   private String AV12FilterFullText ;
   private String lV12FilterFullText ;
   private GXSimpleCollection<Byte> AV30TFBarFasEst_Sels ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbBarFasEst ;
   private IDataStoreProvider pr_default ;
   private String[] H027A2_A130BarCodPar ;
   private byte[] H027A2_A132BarCodReo ;
   private int[] H027A2_A129BarCod ;
   private String[] H027A2_A396EmprCod ;
   private byte[] H027A2_A153BarFasEst ;
   private String[] H027A2_A460FasDsc ;
   private String[] H027A2_A457FasCod ;
   private short[] H027A2_A194BarOrdLin ;
   private String[] H027A2_A758ProCod ;
   private long[] H027A3_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV10DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV15GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState8[] ;
   private app.wwpbaseobjects.SdtWWPContext AV40WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

final  class trabajoexterno_fase_una__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H027A2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A153BarFasEst ,
                                          GXSimpleCollection<Byte> AV30TFBarFasEst_Sels ,
                                          String AV12FilterFullText ,
                                          String AV39TFProCod_Sel ,
                                          String AV38TFProCod ,
                                          short AV32TFBarOrdLin ,
                                          short AV33TFBarOrdLin_To ,
                                          String AV35TFFasCod_Sel ,
                                          String AV34TFFasCod ,
                                          String AV37TFFasDsc_Sel ,
                                          String AV36TFFasDsc ,
                                          int AV30TFBarFasEst_Sels_size ,
                                          String A758ProCod ,
                                          short A194BarOrdLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          short AV26OrderedBy ,
                                          boolean AV27OrderedDsc ,
                                          String AV22InOutEmprCod ,
                                          int AV18InOutBarCod ,
                                          byte AV20InOutBarCodReo ,
                                          String AV19InOutBarCodPar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[22];
      Object[] GXv_Object10 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.BarFasEst, T2.FasDsc, T1.FasCod, T1.BarOrdLin, T1.ProCod" ;
      sFromString = " FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      if ( ! (GXutil.strcmp("", AV12FilterFullText)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.ProCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarOrdLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T2.FasDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarFasEst,'90'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int9[4] = (byte)(1) ;
         GXv_int9[5] = (byte)(1) ;
         GXv_int9[6] = (byte)(1) ;
         GXv_int9[7] = (byte)(1) ;
         GXv_int9[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV39TFProCod_Sel)==0) && ( ! (GXutil.strcmp("", AV38TFProCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39TFProCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int9[10] = (byte)(1) ;
      }
      if ( ! (0==AV32TFBarOrdLin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int9[11] = (byte)(1) ;
      }
      if ( ! (0==AV33TFBarOrdLin_To) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int9[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV35TFFasCod_Sel)==0) && ( ! (GXutil.strcmp("", AV34TFFasCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV35TFFasCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int9[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV37TFFasDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV36TFFasDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV37TFFasDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int9[16] = (byte)(1) ;
      }
      if ( AV30TFBarFasEst_Sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV30TFBarFasEst_Sels, "T1.BarFasEst IN (", ")")+")");
      }
      if ( AV26OrderedBy == 1 )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin" ;
      }
      else if ( ( AV26OrderedBy == 2 ) && ! AV27OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ProCod" ;
      }
      else if ( ( AV26OrderedBy == 2 ) && ( AV27OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ProCod DESC" ;
      }
      else if ( ( AV26OrderedBy == 3 ) && ! AV27OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarOrdLin" ;
      }
      else if ( ( AV26OrderedBy == 3 ) && ( AV27OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarOrdLin DESC" ;
      }
      else if ( ( AV26OrderedBy == 4 ) && ! AV27OrderedDsc )
      {
         sOrderString += " ORDER BY T1.FasCod" ;
      }
      else if ( ( AV26OrderedBy == 4 ) && ( AV27OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.FasCod DESC" ;
      }
      else if ( ( AV26OrderedBy == 5 ) && ! AV27OrderedDsc )
      {
         sOrderString += " ORDER BY T2.FasDsc" ;
      }
      else if ( ( AV26OrderedBy == 5 ) && ( AV27OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.FasDsc DESC" ;
      }
      else if ( ( AV26OrderedBy == 6 ) && ! AV27OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarFasEst" ;
      }
      else if ( ( AV26OrderedBy == 6 ) && ( AV27OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarFasEst DESC" ;
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

   protected Object[] conditional_H027A3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A153BarFasEst ,
                                          GXSimpleCollection<Byte> AV30TFBarFasEst_Sels ,
                                          String AV12FilterFullText ,
                                          String AV39TFProCod_Sel ,
                                          String AV38TFProCod ,
                                          short AV32TFBarOrdLin ,
                                          short AV33TFBarOrdLin_To ,
                                          String AV35TFFasCod_Sel ,
                                          String AV34TFFasCod ,
                                          String AV37TFFasDsc_Sel ,
                                          String AV36TFFasDsc ,
                                          int AV30TFBarFasEst_Sels_size ,
                                          String A758ProCod ,
                                          short A194BarOrdLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          short AV26OrderedBy ,
                                          boolean AV27OrderedDsc ,
                                          String AV22InOutEmprCod ,
                                          int AV18InOutBarCod ,
                                          byte AV20InOutBarCodReo ,
                                          String AV19InOutBarCodPar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[17];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      if ( ! (GXutil.strcmp("", AV12FilterFullText)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.ProCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarOrdLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T2.FasDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarFasEst,'90'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int12[4] = (byte)(1) ;
         GXv_int12[5] = (byte)(1) ;
         GXv_int12[6] = (byte)(1) ;
         GXv_int12[7] = (byte)(1) ;
         GXv_int12[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV39TFProCod_Sel)==0) && ( ! (GXutil.strcmp("", AV38TFProCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39TFProCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int12[10] = (byte)(1) ;
      }
      if ( ! (0==AV32TFBarOrdLin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int12[11] = (byte)(1) ;
      }
      if ( ! (0==AV33TFBarOrdLin_To) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int12[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV35TFFasCod_Sel)==0) && ( ! (GXutil.strcmp("", AV34TFFasCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV35TFFasCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int12[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV37TFFasDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV36TFFasDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV37TFFasDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      if ( AV30TFBarFasEst_Sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV30TFBarFasEst_Sels, "T1.BarFasEst IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      if ( AV26OrderedBy == 1 )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV26OrderedBy == 2 ) && ! AV27OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV26OrderedBy == 2 ) && ( AV27OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV26OrderedBy == 3 ) && ! AV27OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV26OrderedBy == 3 ) && ( AV27OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV26OrderedBy == 4 ) && ! AV27OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV26OrderedBy == 4 ) && ( AV27OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV26OrderedBy == 5 ) && ! AV27OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV26OrderedBy == 5 ) && ( AV27OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV26OrderedBy == 6 ) && ! AV27OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV26OrderedBy == 6 ) && ( AV27OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
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
                  return conditional_H027A2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Boolean) dynConstraints[17]).booleanValue() , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] );
            case 1 :
                  return conditional_H027A3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Boolean) dynConstraints[17]).booleanValue() , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H027A2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H027A3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 28);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
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
                  stmt.setString(sIdx, (String)parms[22], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[24]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 28);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 28);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               return;
            case 1 :
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
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 28);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 28);
               }
               return;
      }
   }

}

