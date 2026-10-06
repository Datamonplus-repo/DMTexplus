package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class seleccionhdrprompt_impl extends GXDataArea
{
   public seleccionhdrprompt_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public seleccionhdrprompt_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( seleccionhdrprompt_impl.class ));
   }

   public seleccionhdrprompt_impl( int remoteHandle ,
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
            AV43InEmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43InEmprCod", AV43InEmprCod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV44InOutBarCod = (int)(GXutil.lval( httpContext.GetPar( "InOutBarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV44InOutBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44InOutBarCod), 8, 0));
               AV46InOutBarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "InOutBarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV46InOutBarCodReo", GXutil.str( AV46InOutBarCodReo, 1, 0));
               AV45InOutBarCodPar = httpContext.GetPar( "InOutBarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV45InOutBarCodPar", AV45InOutBarCodPar);
               AV42InClicod = (short)(GXutil.lval( httpContext.GetPar( "InClicod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV42InClicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42InClicod), 4, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV42InClicod), "ZZZ9")));
               AV41InBarsit = (byte)(GXutil.lval( httpContext.GetPar( "InBarsit"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV41InBarsit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41InBarsit), 2, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINBARSIT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV41InBarsit), "Z9")));
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
      nRC_GXsfl_60 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_60"))) ;
      nGXsfl_60_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_60_idx"))) ;
      sGXsfl_60_idx = httpContext.GetPar( "sGXsfl_60_idx") ;
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
      AV63CliCodfrom = (int)(GXutil.lval( httpContext.GetPar( "CliCodfrom"))) ;
      AV64PedidoClientefrom = httpContext.GetPar( "PedidoClientefrom") ;
      AV60BarSitfrom = (byte)(GXutil.lval( httpContext.GetPar( "BarSitfrom"))) ;
      AV59BarSit = (byte)(GXutil.lval( httpContext.GetPar( "BarSit"))) ;
      AV48TFBarFecGen = localUtil.parseDateParm( httpContext.GetPar( "TFBarFecGen")) ;
      AV49TFBarFecGen_To = localUtil.parseDateParm( httpContext.GetPar( "TFBarFecGen_To")) ;
      AV6FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV43InEmprCod = httpContext.GetPar( "InEmprCod") ;
      AV53Ensayos = (short)(GXutil.lval( httpContext.GetPar( "Ensayos"))) ;
      AV77TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
      AV41InBarsit = (byte)(GXutil.lval( httpContext.GetPar( "InBarsit"))) ;
      AV42InClicod = (short)(GXutil.lval( httpContext.GetPar( "InClicod"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV63CliCodfrom, AV64PedidoClientefrom, AV60BarSitfrom, AV59BarSit, AV48TFBarFecGen, AV49TFBarFecGen_To, AV6FilterFullText, AV43InEmprCod, AV53Ensayos, AV77TipColCod, AV41InBarsit, AV42InClicod) ;
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
      pa1WZ2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1WZ2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal FormNoBackgroundColor\" data-gx-class=\"form-horizontal FormNoBackgroundColor\" novalidate action=\""+formatLink("app.seleccionhdrprompt", new String[] {GXutil.URLEncode(GXutil.rtrim(AV43InEmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV44InOutBarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV46InOutBarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV45InOutBarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV42InClicod,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV41InBarsit,2,0))}, new String[] {"InEmprCod","InOutBarCod","InOutBarCodReo","InOutBarCodPar","InClicod","InBarsit"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vENSAYOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV53Ensayos), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPCOLCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV77TipColCod), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINBARSIT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV41InBarsit), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV42InClicod), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vCLICODFROM", GXutil.ltrim( localUtil.ntoc( AV63CliCodfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vPEDIDOCLIENTEFROM", GXutil.rtrim( AV64PedidoClientefrom));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARSITFROM", GXutil.ltrim( localUtil.ntoc( AV60BarSitfrom, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARSIT", GXutil.ltrim( localUtil.ntoc( AV59BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vTFBARFECGEN", localUtil.format(AV48TFBarFecGen, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vTFBARFECGEN_TO", localUtil.format(AV49TFBarFecGen_To, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vFILTERFULLTEXT", AV6FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_60", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_60, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV7GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV8GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV5DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV5DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV14OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV15OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODTN", GXutil.ltrim( localUtil.ntoc( A1923BarCodTN, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vENSAYOS", GXutil.ltrim( localUtil.ntoc( AV53Ensayos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vENSAYOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV53Ensayos), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPCOLCOD", GXutil.ltrim( localUtil.ntoc( AV77TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPCOLCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV77TipColCod), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINBARSIT", GXutil.ltrim( localUtil.ntoc( AV41InBarsit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINBARSIT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV41InBarsit), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINCLICOD", GXutil.ltrim( localUtil.ntoc( AV42InClicod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV42InClicod), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINOUTBARCODPAR", GXutil.rtrim( AV45InOutBarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "vINOUTBARCODREO", GXutil.ltrim( localUtil.ntoc( AV46InOutBarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINOUTBARCOD", GXutil.ltrim( localUtil.ntoc( AV44InOutBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARENCCLI", GXutil.rtrim( A4812BarEncCli));
      app.GxWebStd.gx_hidden_field( httpContext, "BARDISNUM", GXutil.rtrim( A143BarDisNum));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIENDES", GXutil.ltrim( localUtil.ntoc( A898BarPieNDes, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISDES", GXutil.rtrim( A365DisDes));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIE1", GXutil.ltrim( localUtil.ntoc( A199BarPie1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includesortasc", GXutil.rtrim( Ddo_grid_Includesortasc));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNUSERACTION1_Title", GXutil.rtrim( Dvelop_confirmpanel_btnuseraction1_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNUSERACTION1_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_btnuseraction1_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNUSERACTION1_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnuseraction1_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNUSERACTION1_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnuseraction1_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNUSERACTION1_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnuseraction1_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNUSERACTION1_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_btnuseraction1_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNUSERACTION1_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_btnuseraction1_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNUSERACTION1_Comment", GXutil.rtrim( Dvelop_confirmpanel_btnuseraction1_Comment));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNUSERACTION1_Result", GXutil.rtrim( Dvelop_confirmpanel_btnuseraction1_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNUSERACTION1_Result", GXutil.rtrim( Dvelop_confirmpanel_btnuseraction1_Result));
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
         we1WZ2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1WZ2( ) ;
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
      return formatLink("app.seleccionhdrprompt", new String[] {GXutil.URLEncode(GXutil.rtrim(AV43InEmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV44InOutBarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV46InOutBarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV45InOutBarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV42InClicod,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV41InBarsit,2,0))}, new String[] {"InEmprCod","InOutBarCod","InOutBarCodReo","InOutBarCodPar","InClicod","InBarsit"})  ;
   }

   public String getPgmname( )
   {
      return "SeleccionHDRPrompt" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Seleccion HDRs .", "") ;
   }

   public void wb1WZ0( )
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
         app.GxWebStd.gx_div_start( httpContext, divLayoutmaintable_Internalname, 1, 0, "px", 0, "px", "Table TableWithSelectableGrid", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablemain_Internalname, 1, 0, "px", 0, "px", "TableMainPrompt", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablacontenido_Internalname, 1, 0, "px", 0, "px", "TableContent15", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClicodfrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicodfrom_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'" + sGXsfl_60_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicodfrom_Internalname, GXutil.ltrim( localUtil.ntoc( AV63CliCodfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicodfrom_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV63CliCodfrom), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV63CliCodfrom), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,19);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicodfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicodfrom_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_SeleccionHDRPrompt.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPedidoclientefrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPedidoclientefrom_Internalname, httpContext.getMessage( "Pedido Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'" + sGXsfl_60_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPedidoclientefrom_Internalname, GXutil.rtrim( AV64PedidoClientefrom), GXutil.rtrim( localUtil.format( AV64PedidoClientefrom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,23);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPedidoclientefrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPedidoclientefrom_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_SeleccionHDRPrompt.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarsitfrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarsitfrom_Internalname, httpContext.getMessage( "Sit. Ini.", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'" + sGXsfl_60_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarsitfrom_Internalname, GXutil.ltrim( localUtil.ntoc( AV60BarSitfrom, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarsitfrom_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV60BarSitfrom), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV60BarSitfrom), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,27);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarsitfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarsitfrom_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_SeleccionHDRPrompt.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarsit_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarsit_Internalname, httpContext.getMessage( "Sit. Fin.", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'" + sGXsfl_60_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarsit_Internalname, GXutil.ltrim( localUtil.ntoc( AV59BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarsit_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV59BarSit), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV59BarSit), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarsit_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarsit_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_SeleccionHDRPrompt.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTfbarfecgen_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTfbarfecgen_Internalname, httpContext.getMessage( "Fecha Inicial", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'" + sGXsfl_60_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavTfbarfecgen_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTfbarfecgen_Internalname, localUtil.format(AV48TFBarFecGen, "99/99/99"), localUtil.format( AV48TFBarFecGen, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTfbarfecgen_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTfbarfecgen_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_SeleccionHDRPrompt.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavTfbarfecgen_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavTfbarfecgen_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_SeleccionHDRPrompt.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTfbarfecgen_to_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTfbarfecgen_to_Internalname, httpContext.getMessage( "Fecha Final", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'" + sGXsfl_60_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavTfbarfecgen_to_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTfbarfecgen_to_Internalname, localUtil.format(AV49TFBarFecGen_To, "99/99/99"), localUtil.format( AV49TFBarFecGen_To, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTfbarfecgen_to_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTfbarfecgen_to_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_SeleccionHDRPrompt.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavTfbarfecgen_to_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavTfbarfecgen_to_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_SeleccionHDRPrompt.htm");
         httpContext.writeTextNL( "</div>") ;
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         wb_table1_48_1WZ2( true) ;
      }
      else
      {
         wb_table1_48_1WZ2( false) ;
      }
      return  ;
   }

   public void wb_table1_48_1WZ2e( boolean wbgen )
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
         startgridcontrol60( ) ;
      }
      if ( wbEnd == 60 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_60 = (int)(nGXsfl_60_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV7GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV8GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV80Pgmname), GXutil.rtrim( localUtil.format( AV80Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_SeleccionHDRPrompt.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 hidden-xs hidden-sm hidden-md hidden-lg", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 90,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnuseraction1_Internalname, "gx.evt.setGridEvt("+GXutil.str( 60, 2, 0)+","+"null"+");", httpContext.getMessage( "Bloqueado", ""), bttBtnuseraction1_Jsonclick, 7, httpContext.getMessage( "Bloqueado", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e111wz1_client"+"'", TempTags, "", 2, "HLP_SeleccionHDRPrompt.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV5DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavInemprcod_Internalname, GXutil.rtrim( AV43InEmprCod), GXutil.rtrim( localUtil.format( AV43InEmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavInemprcod_Jsonclick, 0, "Attribute", "", "", "", "", edtavInemprcod_Visible, 0, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_SeleccionHDRPrompt.htm");
         wb_table2_96_1WZ2( true) ;
      }
      else
      {
         wb_table2_96_1WZ2( false) ;
      }
      return  ;
   }

   public void wb_table2_96_1WZ2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 60 )
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

   public void start1WZ2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Seleccion HDRs .", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1WZ0( ) ;
   }

   public void ws1WZ2( )
   {
      start1WZ2( ) ;
      evt1WZ2( ) ;
   }

   public void evt1WZ2( )
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
                           e121WZ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e131WZ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e141WZ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_BTNUSERACTION1.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e151WZ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCLEANFILTERS'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCleanFilters' */
                           e161WZ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VBARSITFROM.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e171WZ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VBARSIT.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e181WZ2 ();
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
                           nGXsfl_60_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_602( ) ;
                           AV17Select = httpContext.cgiGet( edtavSelect_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavSelect_Internalname, AV17Select);
                           A2010BarTipDis = GXutil.upper( httpContext.cgiGet( edtBarTipDis_Internalname)) ;
                           A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
                           A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
                           A120BarAgrEst = GXutil.upper( httpContext.cgiGet( edtBarAgrEst_Internalname)) ;
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n252CliCod = false ;
                           A159BarFecGen = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtBarFecGen_Internalname), 0)) ;
                           A13878PedidoClie = httpContext.cgiGet( edtPedidoClie_Internalname) ;
                           A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
                           A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
                           A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1234BarNomCli = httpContext.cgiGet( edtBarNomCli_Internalname) ;
                           A1235BarNumCli = (int)(localUtil.ctol( httpContext.cgiGet( edtBarNumCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A198BarPie = (int)(localUtil.ctol( httpContext.cgiGet( edtBarPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A166BarKgm = localUtil.ctond( httpContext.cgiGet( edtBarKgm_Internalname)) ;
                           A184BarMtr = localUtil.ctond( httpContext.cgiGet( edtBarMtr_Internalname)) ;
                           A213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavF_color_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavF_color_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vF_COLOR");
                              GX_FocusControl = edtavF_color_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV54F_color = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavF_color_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54F_color), 4, 0));
                           }
                           else
                           {
                              AV54F_color = (short)(localUtil.ctol( httpContext.cgiGet( edtavF_color_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavF_color_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54F_color), 4, 0));
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
                                 e191WZ2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e201WZ2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e211WZ2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Clicodfrom Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCLICODFROM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV63CliCodfrom )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Pedidoclientefrom Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vPEDIDOCLIENTEFROM"), AV64PedidoClientefrom) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barsitfrom Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARSITFROM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV60BarSitfrom )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barsit Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARSIT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV59BarSit )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Tfbarfecgen Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vTFBARFECGEN"), 0), AV48TFBarFecGen) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Tfbarfecgen_to Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vTFBARFECGEN_TO"), 0), AV49TFBarFecGen_To) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Filterfulltext Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV6FilterFullText) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e221WZ2 ();
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

   public void we1WZ2( )
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

   public void pa1WZ2( )
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
            GX_FocusControl = edtavClicodfrom_Internalname ;
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
      subsflControlProps_602( ) ;
      while ( nGXsfl_60_idx <= nRC_GXsfl_60 )
      {
         sendrow_602( ) ;
         nGXsfl_60_idx = ((subGrid_Islastpage==1)&&(nGXsfl_60_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_60_idx+1) ;
         sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_602( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 int AV63CliCodfrom ,
                                 String AV64PedidoClientefrom ,
                                 byte AV60BarSitfrom ,
                                 byte AV59BarSit ,
                                 java.util.Date AV48TFBarFecGen ,
                                 java.util.Date AV49TFBarFecGen_To ,
                                 String AV6FilterFullText ,
                                 String AV43InEmprCod ,
                                 short AV53Ensayos ,
                                 byte AV77TipColCod ,
                                 byte AV41InBarsit ,
                                 short AV42InClicod )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e201WZ2 ();
      GRID_nCurrentRecord = 0 ;
      rf1WZ2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A130BarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCOLNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOLNUM", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARSIT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARSIT", GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARSER", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A212BarSer, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "BARSER", GXutil.rtrim( A212BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCOLNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A135BarColNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOLNOM", GXutil.rtrim( A135BarColNom));
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
      rf1WZ2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      AV80Pgmname = "SeleccionHDRPrompt" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80Pgmname", AV80Pgmname);
      Gx_err = (short)(0) ;
      edtavSelect_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSelect_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSelect_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtavF_color_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavF_color_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavF_color_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public int subgridclient_rec_count_fnc( )
   {
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV48TFBarFecGen ,
                                           AV49TFBarFecGen_To ,
                                           Integer.valueOf(AV63CliCodfrom) ,
                                           A159BarFecGen ,
                                           Integer.valueOf(A252CliCod) ,
                                           Short.valueOf(AV14OrderedBy) ,
                                           Boolean.valueOf(AV15OrderedDsc) ,
                                           AV6FilterFullText ,
                                           A2010BarTipDis ,
                                           A13696BarNHdr ,
                                           A120BarAgrEst ,
                                           A13878PedidoClie ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           Integer.valueOf(A1235BarNumCli) ,
                                           Integer.valueOf(A198BarPie) ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           Byte.valueOf(A213BarSit) ,
                                           Byte.valueOf(AV60BarSitfrom) ,
                                           Byte.valueOf(AV59BarSit) ,
                                           AV64PedidoClientefrom ,
                                           AV43InEmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor H01WZ3 */
      pr_default.execute(0, new Object[] {AV43InEmprCod, Byte.valueOf(AV60BarSitfrom), Byte.valueOf(AV59BarSit), AV48TFBarFecGen, AV49TFBarFecGen_To, Integer.valueOf(AV63CliCodfrom)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1923BarCodTN = H01WZ3_A1923BarCodTN[0] ;
         A213BarSit = H01WZ3_A213BarSit[0] ;
         A1235BarNumCli = H01WZ3_A1235BarNumCli[0] ;
         A1234BarNomCli = H01WZ3_A1234BarNomCli[0] ;
         A136BarColNum = H01WZ3_A136BarColNum[0] ;
         A135BarColNom = H01WZ3_A135BarColNom[0] ;
         A212BarSer = H01WZ3_A212BarSer[0] ;
         A159BarFecGen = H01WZ3_A159BarFecGen[0] ;
         A252CliCod = H01WZ3_A252CliCod[0] ;
         n252CliCod = H01WZ3_n252CliCod[0] ;
         A120BarAgrEst = H01WZ3_A120BarAgrEst[0] ;
         A13696BarNHdr = H01WZ3_A13696BarNHdr[0] ;
         A2010BarTipDis = H01WZ3_A2010BarTipDis[0] ;
         A184BarMtr = H01WZ3_A184BarMtr[0] ;
         A166BarKgm = H01WZ3_A166BarKgm[0] ;
         A129BarCod = H01WZ3_A129BarCod[0] ;
         A132BarCodReo = H01WZ3_A132BarCodReo[0] ;
         A130BarCodPar = H01WZ3_A130BarCodPar[0] ;
         A143BarDisNum = H01WZ3_A143BarDisNum[0] ;
         A4812BarEncCli = H01WZ3_A4812BarEncCli[0] ;
         A396EmprCod = H01WZ3_A396EmprCod[0] ;
         A199BarPie1 = H01WZ3_A199BarPie1[0] ;
         A365DisDes = H01WZ3_A365DisDes[0] ;
         A898BarPieNDes = H01WZ3_A898BarPieNDes[0] ;
         A184BarMtr = H01WZ3_A184BarMtr[0] ;
         A166BarKgm = H01WZ3_A166BarKgm[0] ;
         A199BarPie1 = H01WZ3_A199BarPie1[0] ;
         A898BarPieNDes = H01WZ3_A898BarPieNDes[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
         }
         else
         {
            A198BarPie = A199BarPie1 ;
         }
         GXt_char1 = A13878PedidoClie ;
         GXv_char2[0] = A396EmprCod ;
         GXv_char3[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char5[0] = GXt_char1 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_char4, GXv_char5) ;
         seleccionhdrprompt_impl.this.A396EmprCod = GXv_char2[0] ;
         seleccionhdrprompt_impl.this.A4812BarEncCli = GXv_char3[0] ;
         seleccionhdrprompt_impl.this.A143BarDisNum = GXv_char4[0] ;
         seleccionhdrprompt_impl.this.GXt_char1 = GXv_char5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", A4812BarEncCli);
         httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
         A13878PedidoClie = GXt_char1 ;
         if ( (GXutil.strcmp("", AV6FilterFullText)==0) || ( ( GXutil.like( GXutil.upper( A2010BarTipDis) , GXutil.padr( "%" + GXutil.upper( AV6FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV6FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A120BarAgrEst) , GXutil.padr( "%" + GXutil.upper( AV6FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV6FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV6FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV6FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV6FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV6FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1234BarNomCli) , GXutil.padr( "%" + GXutil.upper( AV6FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1235BarNumCli, 6, 0) , GXutil.padr( "%" + AV6FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A198BarPie, 6, 0) , GXutil.padr( "%" + AV6FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV6FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A184BarMtr, 9, 2) , GXutil.padr( "%" + AV6FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV6FilterFullText , 254 , "%"),  ' ' ) ) ) )
         {
            if ( (GXutil.strcmp("", AV64PedidoClientefrom)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV64PedidoClientefrom) == 0 ) ) )
            {
               GRID_nRecordCount = (long)(GRID_nRecordCount+1) ;
            }
         }
         pr_default.readNext(0);
      }
      GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      pr_default.close(0);
      return (int)(GRID_nRecordCount) ;
   }

   public void rf1WZ2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(60) ;
      /* Execute user event: Refresh */
      e201WZ2 ();
      nGXsfl_60_idx = 1 ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_602( ) ;
      bGXsfl_60_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
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
         subsflControlProps_602( ) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              AV48TFBarFecGen ,
                                              AV49TFBarFecGen_To ,
                                              Integer.valueOf(AV63CliCodfrom) ,
                                              A159BarFecGen ,
                                              Integer.valueOf(A252CliCod) ,
                                              Short.valueOf(AV14OrderedBy) ,
                                              Boolean.valueOf(AV15OrderedDsc) ,
                                              AV6FilterFullText ,
                                              A2010BarTipDis ,
                                              A13696BarNHdr ,
                                              A120BarAgrEst ,
                                              A13878PedidoClie ,
                                              A212BarSer ,
                                              A135BarColNom ,
                                              Integer.valueOf(A136BarColNum) ,
                                              A1234BarNomCli ,
                                              Integer.valueOf(A1235BarNumCli) ,
                                              Integer.valueOf(A198BarPie) ,
                                              A166BarKgm ,
                                              A184BarMtr ,
                                              Byte.valueOf(A213BarSit) ,
                                              Byte.valueOf(AV60BarSitfrom) ,
                                              Byte.valueOf(AV59BarSit) ,
                                              AV64PedidoClientefrom ,
                                              AV43InEmprCod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         /* Using cursor H01WZ5 */
         pr_default.execute(1, new Object[] {AV43InEmprCod, Byte.valueOf(AV60BarSitfrom), Byte.valueOf(AV59BarSit), AV48TFBarFecGen, AV49TFBarFecGen_To, Integer.valueOf(AV63CliCodfrom)});
         nGXsfl_60_idx = 1 ;
         sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_602( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A1923BarCodTN = H01WZ5_A1923BarCodTN[0] ;
            A213BarSit = H01WZ5_A213BarSit[0] ;
            A1235BarNumCli = H01WZ5_A1235BarNumCli[0] ;
            A1234BarNomCli = H01WZ5_A1234BarNomCli[0] ;
            A136BarColNum = H01WZ5_A136BarColNum[0] ;
            A135BarColNom = H01WZ5_A135BarColNom[0] ;
            A212BarSer = H01WZ5_A212BarSer[0] ;
            A159BarFecGen = H01WZ5_A159BarFecGen[0] ;
            A252CliCod = H01WZ5_A252CliCod[0] ;
            n252CliCod = H01WZ5_n252CliCod[0] ;
            A120BarAgrEst = H01WZ5_A120BarAgrEst[0] ;
            A13696BarNHdr = H01WZ5_A13696BarNHdr[0] ;
            A2010BarTipDis = H01WZ5_A2010BarTipDis[0] ;
            A184BarMtr = H01WZ5_A184BarMtr[0] ;
            A166BarKgm = H01WZ5_A166BarKgm[0] ;
            A129BarCod = H01WZ5_A129BarCod[0] ;
            A132BarCodReo = H01WZ5_A132BarCodReo[0] ;
            A130BarCodPar = H01WZ5_A130BarCodPar[0] ;
            A143BarDisNum = H01WZ5_A143BarDisNum[0] ;
            A4812BarEncCli = H01WZ5_A4812BarEncCli[0] ;
            A396EmprCod = H01WZ5_A396EmprCod[0] ;
            A199BarPie1 = H01WZ5_A199BarPie1[0] ;
            A365DisDes = H01WZ5_A365DisDes[0] ;
            A898BarPieNDes = H01WZ5_A898BarPieNDes[0] ;
            A184BarMtr = H01WZ5_A184BarMtr[0] ;
            A166BarKgm = H01WZ5_A166BarKgm[0] ;
            A199BarPie1 = H01WZ5_A199BarPie1[0] ;
            A898BarPieNDes = H01WZ5_A898BarPieNDes[0] ;
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               A198BarPie = A898BarPieNDes ;
            }
            else
            {
               A198BarPie = A199BarPie1 ;
            }
            GXt_char1 = A13878PedidoClie ;
            GXv_char5[0] = A396EmprCod ;
            GXv_char4[0] = A4812BarEncCli ;
            GXv_char3[0] = A143BarDisNum ;
            GXv_char2[0] = GXt_char1 ;
            new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_char3, GXv_char2) ;
            seleccionhdrprompt_impl.this.A396EmprCod = GXv_char5[0] ;
            seleccionhdrprompt_impl.this.A4812BarEncCli = GXv_char4[0] ;
            seleccionhdrprompt_impl.this.A143BarDisNum = GXv_char3[0] ;
            seleccionhdrprompt_impl.this.GXt_char1 = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", A4812BarEncCli);
            httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
            A13878PedidoClie = GXt_char1 ;
            if ( (GXutil.strcmp("", AV6FilterFullText)==0) || ( ( GXutil.like( GXutil.upper( A2010BarTipDis) , GXutil.padr( "%" + GXutil.upper( AV6FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV6FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A120BarAgrEst) , GXutil.padr( "%" + GXutil.upper( AV6FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV6FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV6FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV6FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV6FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV6FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1234BarNomCli) , GXutil.padr( "%" + GXutil.upper( AV6FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1235BarNumCli, 6, 0) , GXutil.padr( "%" + AV6FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A198BarPie, 6, 0) , GXutil.padr( "%" + AV6FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV6FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A184BarMtr, 9, 2) , GXutil.padr( "%" + AV6FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV6FilterFullText , 254 , "%"),  ' ' ) ) ) )
            {
               if ( (GXutil.strcmp("", AV64PedidoClientefrom)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV64PedidoClientefrom) == 0 ) ) )
               {
                  e211WZ2 ();
               }
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(60) ;
         wb1WZ0( ) ;
      }
      bGXsfl_60_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1WZ2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vENSAYOS", GXutil.ltrim( localUtil.ntoc( AV53Ensayos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vENSAYOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV53Ensayos), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCOD"+"_"+sGXsfl_60_idx, getSecureSignedToken( sGXsfl_60_idx, localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCODREO"+"_"+sGXsfl_60_idx, getSecureSignedToken( sGXsfl_60_idx, localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCODPAR"+"_"+sGXsfl_60_idx, getSecureSignedToken( sGXsfl_60_idx, GXutil.rtrim( localUtil.format( A130BarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCOLNUM"+"_"+sGXsfl_60_idx, getSecureSignedToken( sGXsfl_60_idx, localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARSIT"+"_"+sGXsfl_60_idx, getSecureSignedToken( sGXsfl_60_idx, localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CLICOD"+"_"+sGXsfl_60_idx, getSecureSignedToken( sGXsfl_60_idx, localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARSER"+"_"+sGXsfl_60_idx, getSecureSignedToken( sGXsfl_60_idx, GXutil.rtrim( localUtil.format( A212BarSer, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCOLNOM"+"_"+sGXsfl_60_idx, getSecureSignedToken( sGXsfl_60_idx, GXutil.rtrim( localUtil.format( A135BarColNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPCOLCOD", GXutil.ltrim( localUtil.ntoc( AV77TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPCOLCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV77TipColCod), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINBARSIT", GXutil.ltrim( localUtil.ntoc( AV41InBarsit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINBARSIT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV41InBarsit), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINCLICOD", GXutil.ltrim( localUtil.ntoc( AV42InClicod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV42InClicod), "ZZZ9")));
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
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV63CliCodfrom, AV64PedidoClientefrom, AV60BarSitfrom, AV59BarSit, AV48TFBarFecGen, AV49TFBarFecGen_To, AV6FilterFullText, AV43InEmprCod, AV53Ensayos, AV77TipColCod, AV41InBarsit, AV42InClicod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV63CliCodfrom, AV64PedidoClientefrom, AV60BarSitfrom, AV59BarSit, AV48TFBarFecGen, AV49TFBarFecGen_To, AV6FilterFullText, AV43InEmprCod, AV53Ensayos, AV77TipColCod, AV41InBarsit, AV42InClicod) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV63CliCodfrom, AV64PedidoClientefrom, AV60BarSitfrom, AV59BarSit, AV48TFBarFecGen, AV49TFBarFecGen_To, AV6FilterFullText, AV43InEmprCod, AV53Ensayos, AV77TipColCod, AV41InBarsit, AV42InClicod) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV63CliCodfrom, AV64PedidoClientefrom, AV60BarSitfrom, AV59BarSit, AV48TFBarFecGen, AV49TFBarFecGen_To, AV6FilterFullText, AV43InEmprCod, AV53Ensayos, AV77TipColCod, AV41InBarsit, AV42InClicod) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV63CliCodfrom, AV64PedidoClientefrom, AV60BarSitfrom, AV59BarSit, AV48TFBarFecGen, AV49TFBarFecGen_To, AV6FilterFullText, AV43InEmprCod, AV53Ensayos, AV77TipColCod, AV41InBarsit, AV42InClicod) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      Gx_date = GXutil.today( ) ;
      AV80Pgmname = "SeleccionHDRPrompt" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80Pgmname", AV80Pgmname);
      Gx_err = (short)(0) ;
      edtavSelect_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSelect_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSelect_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtavF_color_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavF_color_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavF_color_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1WZ0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e191WZ2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV5DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_60 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_60"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV7GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV8GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
         Ddo_grid_Gridinternalname = httpContext.cgiGet( "DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( "DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( "DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Includesortasc = httpContext.cgiGet( "DDO_GRID_Includesortasc") ;
         Ddo_grid_Sortedstatus = httpContext.cgiGet( "DDO_GRID_Sortedstatus") ;
         Dvelop_confirmpanel_btnuseraction1_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNUSERACTION1_Title") ;
         Dvelop_confirmpanel_btnuseraction1_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNUSERACTION1_Confirmationtext") ;
         Dvelop_confirmpanel_btnuseraction1_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNUSERACTION1_Yesbuttoncaption") ;
         Dvelop_confirmpanel_btnuseraction1_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNUSERACTION1_Nobuttoncaption") ;
         Dvelop_confirmpanel_btnuseraction1_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNUSERACTION1_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_btnuseraction1_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNUSERACTION1_Yesbuttonposition") ;
         Dvelop_confirmpanel_btnuseraction1_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNUSERACTION1_Confirmtype") ;
         Dvelop_confirmpanel_btnuseraction1_Comment = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNUSERACTION1_Comment") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( "GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( "DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( "DDO_GRID_Selectedvalue_get") ;
         Dvelop_confirmpanel_btnuseraction1_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNUSERACTION1_Result") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICODFROM");
            GX_FocusControl = edtavClicodfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV63CliCodfrom = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63CliCodfrom), 6, 0));
         }
         else
         {
            AV63CliCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63CliCodfrom), 6, 0));
         }
         AV64PedidoClientefrom = httpContext.cgiGet( edtavPedidoclientefrom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV64PedidoClientefrom", AV64PedidoClientefrom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarsitfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarsitfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARSITFROM");
            GX_FocusControl = edtavBarsitfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV60BarSitfrom = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60BarSitfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60BarSitfrom), 2, 0));
         }
         else
         {
            AV60BarSitfrom = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarsitfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60BarSitfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60BarSitfrom), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarsit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarsit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARSIT");
            GX_FocusControl = edtavBarsit_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV59BarSit = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59BarSit), 2, 0));
         }
         else
         {
            AV59BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarsit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59BarSit), 2, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavTfbarfecgen_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vTFBARFECGEN");
            GX_FocusControl = edtavTfbarfecgen_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV48TFBarFecGen = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFBarFecGen", localUtil.format(AV48TFBarFecGen, "99/99/99"));
         }
         else
         {
            AV48TFBarFecGen = localUtil.ctod( httpContext.cgiGet( edtavTfbarfecgen_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFBarFecGen", localUtil.format(AV48TFBarFecGen, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavTfbarfecgen_to_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vTFBARFECGEN_TO");
            GX_FocusControl = edtavTfbarfecgen_to_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV49TFBarFecGen_To = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFBarFecGen_To", localUtil.format(AV49TFBarFecGen_To, "99/99/99"));
         }
         else
         {
            AV49TFBarFecGen_To = localUtil.ctod( httpContext.cgiGet( edtavTfbarfecgen_to_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFBarFecGen_To", localUtil.format(AV49TFBarFecGen_To, "99/99/99"));
         }
         AV6FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6FilterFullText", AV6FilterFullText);
         AV80Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV80Pgmname", AV80Pgmname);
         /* Read subfile selected row values. */
         nGXsfl_60_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_602( ) ;
         if ( nGXsfl_60_idx > 0 )
         {
            AV17Select = httpContext.cgiGet( edtavSelect_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavSelect_Internalname, AV17Select);
            A2010BarTipDis = GXutil.upper( httpContext.cgiGet( edtBarTipDis_Internalname)) ;
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
            A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
            A120BarAgrEst = GXutil.upper( httpContext.cgiGet( edtBarAgrEst_Internalname)) ;
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n252CliCod = false ;
            A159BarFecGen = localUtil.ctod( httpContext.cgiGet( edtBarFecGen_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            A13878PedidoClie = httpContext.cgiGet( edtPedidoClie_Internalname) ;
            A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
            A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
            A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1234BarNomCli = httpContext.cgiGet( edtBarNomCli_Internalname) ;
            A1235BarNumCli = (int)(localUtil.ctol( httpContext.cgiGet( edtBarNumCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A198BarPie = (int)(localUtil.ctol( httpContext.cgiGet( edtBarPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A166BarKgm = localUtil.ctond( httpContext.cgiGet( edtBarKgm_Internalname)) ;
            A184BarMtr = localUtil.ctond( httpContext.cgiGet( edtBarMtr_Internalname)) ;
            A213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavF_color_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavF_color_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vF_COLOR");
               GX_FocusControl = edtavF_color_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV54F_color = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavF_color_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54F_color), 4, 0));
            }
            else
            {
               AV54F_color = (short)(localUtil.ctol( httpContext.cgiGet( edtavF_color_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavF_color_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54F_color), 4, 0));
            }
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCLICODFROM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV63CliCodfrom )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vPEDIDOCLIENTEFROM"), AV64PedidoClientefrom) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARSITFROM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV60BarSitfrom )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARSIT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV59BarSit )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vTFBARFECGEN"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV48TFBarFecGen)) ) )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vTFBARFECGEN_TO"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV49TFBarFecGen_To)) ) )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV6FilterFullText) != 0 )
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
      e191WZ2 ();
      if (returnInSub) return;
   }

   public void e191WZ2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_int6 = (byte)(AV53Ensayos) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV43InEmprCod, httpContext.getMessage( "ENS000", ""), GXv_int7) ;
      seleccionhdrprompt_impl.this.GXt_int6 = GXv_int7[0] ;
      AV53Ensayos = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53Ensayos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53Ensayos), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vENSAYOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV53Ensayos), "ZZZ9")));
      GXt_char1 = AV66Station ;
      GXv_char5[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char5) ;
      seleccionhdrprompt_impl.this.GXt_char1 = GXv_char5[0] ;
      AV66Station = GXt_char1 ;
      GXv_char5[0] = AV67EmprCod ;
      GXv_char4[0] = AV68EmprNom ;
      GXv_char3[0] = AV69UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV66Station, GXv_char5, GXv_char4, GXv_char3) ;
      seleccionhdrprompt_impl.this.AV67EmprCod = GXv_char5[0] ;
      seleccionhdrprompt_impl.this.AV68EmprNom = GXv_char4[0] ;
      seleccionhdrprompt_impl.this.AV69UsurCod = GXv_char3[0] ;
      edtavInemprcod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavInemprcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInemprcod_Visible), 5, 0), true);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( "Seleccion HDRs .", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      if ( AV14OrderedBy < 1 )
      {
         AV14OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S112 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = AV5DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9[0] ;
      AV5DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      AV63CliCodfrom = AV42InClicod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63CliCodfrom), 6, 0));
      AV60BarSitfrom = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60BarSitfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60BarSitfrom), 2, 0));
      AV59BarSit = (byte)(((0==AV41InBarsit) ? 5 : AV41InBarsit)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59BarSit), 2, 0));
      AV48TFBarFecGen = GXutil.dadd(Gx_date,-(30)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48TFBarFecGen", localUtil.format(AV48TFBarFecGen, "99/99/99"));
      AV49TFBarFecGen_To = Gx_date ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49TFBarFecGen_To", localUtil.format(AV49TFBarFecGen_To, "99/99/99"));
   }

   public void e201WZ2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext10[0] = AV40WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext10) ;
      AV40WWPContext = GXv_SdtWWPContext10[0] ;
      AV7GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7GridCurrentPage), 10, 0));
      AV8GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8GridPageCount), 10, 0));
      edtavSelect_Columnheaderclass = "WWIconActionColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSelect_Internalname, "Columnheaderclass", edtavSelect_Columnheaderclass, !bGXsfl_60_Refreshing);
      edtBarTipDis_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTipDis_Internalname, "Columnheaderclass", edtBarTipDis_Columnheaderclass, !bGXsfl_60_Refreshing);
      edtBarNHdr_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNHdr_Internalname, "Columnheaderclass", edtBarNHdr_Columnheaderclass, !bGXsfl_60_Refreshing);
      edtBarAgrEst_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrEst_Internalname, "Columnheaderclass", edtBarAgrEst_Columnheaderclass, !bGXsfl_60_Refreshing);
      edtCliCod_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Columnheaderclass", edtCliCod_Columnheaderclass, !bGXsfl_60_Refreshing);
      edtBarFecGen_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFecGen_Internalname, "Columnheaderclass", edtBarFecGen_Columnheaderclass, !bGXsfl_60_Refreshing);
      edtPedidoClie_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedidoClie_Internalname, "Columnheaderclass", edtPedidoClie_Columnheaderclass, !bGXsfl_60_Refreshing);
      edtBarSer_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Columnheaderclass", edtBarSer_Columnheaderclass, !bGXsfl_60_Refreshing);
      edtBarColNom_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNom_Internalname, "Columnheaderclass", edtBarColNom_Columnheaderclass, !bGXsfl_60_Refreshing);
      edtBarColNum_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNum_Internalname, "Columnheaderclass", edtBarColNum_Columnheaderclass, !bGXsfl_60_Refreshing);
      edtBarNomCli_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNomCli_Internalname, "Columnheaderclass", edtBarNomCli_Columnheaderclass, !bGXsfl_60_Refreshing);
      edtBarNumCli_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNumCli_Internalname, "Columnheaderclass", edtBarNumCli_Columnheaderclass, !bGXsfl_60_Refreshing);
      edtBarPie_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPie_Internalname, "Columnheaderclass", edtBarPie_Columnheaderclass, !bGXsfl_60_Refreshing);
      edtBarKgm_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarKgm_Internalname, "Columnheaderclass", edtBarKgm_Columnheaderclass, !bGXsfl_60_Refreshing);
      edtBarMtr_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarMtr_Internalname, "Columnheaderclass", edtBarMtr_Columnheaderclass, !bGXsfl_60_Refreshing);
      edtBarSit_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSit_Internalname, "Columnheaderclass", edtBarSit_Columnheaderclass, !bGXsfl_60_Refreshing);
      /*  Sending Event outputs  */
   }

   public void e121WZ2( )
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
         AV16PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV16PageToGo) ;
      }
   }

   public void e131WZ2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e141WZ2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV14OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14OrderedBy), 4, 0));
         AV15OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15OrderedDsc", AV15OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S112 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e211WZ2( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         AV17Select = "<i class=\"fas fa-check\"></i>" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavSelect_Internalname, AV17Select);
         if ( ( A213BarSit == 1 ) && ( A1923BarCodTN == 1 ) && ( AV53Ensayos == 1 ) )
         {
            AV54F_color = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavF_color_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54F_color), 4, 0));
         }
         else if ( ( A213BarSit == 1 ) && ( A1923BarCodTN != 1 ) && ( AV53Ensayos == 1 ) )
         {
            AV54F_color = (short)(2) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavF_color_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54F_color), 4, 0));
         }
         else
         {
            AV54F_color = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavF_color_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54F_color), 4, 0));
         }
         if ( AV54F_color == 2 )
         {
            edtavSelect_Columnclass = "WWIconActionColumn WWColumnDanger WWColumnDangerFirstColumn" ;
            edtBarTipDis_Columnclass = "WWColumn WWColumnDanger hidden-xs" ;
            edtBarNHdr_Columnclass = "WWColumn WWColumnDanger" ;
            edtBarAgrEst_Columnclass = "WWColumn WWColumnDanger" ;
            edtCliCod_Columnclass = "WWColumn WWColumnDanger hidden-xs" ;
            edtBarFecGen_Columnclass = "WWColumn WWColumnDanger hidden-xs" ;
            edtPedidoClie_Columnclass = "WWColumn WWColumnDanger hidden-xs" ;
            edtBarSer_Columnclass = "WWColumn WWColumnDanger hidden-xs" ;
            edtBarColNom_Columnclass = "WWColumn WWColumnDanger hidden-xs" ;
            edtBarColNum_Columnclass = "WWColumn WWColumnDanger hidden-xs" ;
            edtBarNomCli_Columnclass = "WWColumn WWColumnDanger hidden-xs" ;
            edtBarNumCli_Columnclass = "WWColumn WWColumnDanger hidden-xs" ;
            edtBarPie_Columnclass = "WWColumn WWColumnDanger hidden-xs" ;
            edtBarKgm_Columnclass = "WWColumn WWColumnDanger hidden-xs" ;
            edtBarMtr_Columnclass = "WWColumn WWColumnDanger hidden-xs" ;
            edtBarSit_Columnclass = "WWColumn WWColumnDanger hidden-xs" ;
         }
         else if ( AV54F_color == 1 )
         {
            edtavSelect_Columnclass = "WWIconActionColumn WWColumnInfo WWColumnInfoFirstColumn" ;
            edtBarTipDis_Columnclass = "WWColumn WWColumnInfo hidden-xs" ;
            edtBarNHdr_Columnclass = "WWColumn WWColumnInfo" ;
            edtBarAgrEst_Columnclass = "WWColumn WWColumnInfo" ;
            edtCliCod_Columnclass = "WWColumn WWColumnInfo hidden-xs" ;
            edtBarFecGen_Columnclass = "WWColumn WWColumnInfo hidden-xs" ;
            edtPedidoClie_Columnclass = "WWColumn WWColumnInfo hidden-xs" ;
            edtBarSer_Columnclass = "WWColumn WWColumnInfo hidden-xs" ;
            edtBarColNom_Columnclass = "WWColumn WWColumnInfo hidden-xs" ;
            edtBarColNum_Columnclass = "WWColumn WWColumnInfo hidden-xs" ;
            edtBarNomCli_Columnclass = "WWColumn WWColumnInfo hidden-xs" ;
            edtBarNumCli_Columnclass = "WWColumn WWColumnInfo hidden-xs" ;
            edtBarPie_Columnclass = "WWColumn WWColumnInfo hidden-xs" ;
            edtBarKgm_Columnclass = "WWColumn WWColumnInfo hidden-xs" ;
            edtBarMtr_Columnclass = "WWColumn WWColumnInfo hidden-xs" ;
            edtBarSit_Columnclass = "WWColumn WWColumnInfo hidden-xs" ;
         }
         else if ( AV54F_color == 0 )
         {
            edtavSelect_Columnclass = "WWIconActionColumn WWColumnGray WWColumnGrayFirstColumn" ;
            edtBarTipDis_Columnclass = "WWColumn WWColumnGray hidden-xs" ;
            edtBarNHdr_Columnclass = "WWColumn WWColumnGray" ;
            edtBarAgrEst_Columnclass = "WWColumn WWColumnGray" ;
            edtCliCod_Columnclass = "WWColumn WWColumnGray hidden-xs" ;
            edtBarFecGen_Columnclass = "WWColumn WWColumnGray hidden-xs" ;
            edtPedidoClie_Columnclass = "WWColumn WWColumnGray hidden-xs" ;
            edtBarSer_Columnclass = "WWColumn WWColumnGray hidden-xs" ;
            edtBarColNom_Columnclass = "WWColumn WWColumnGray hidden-xs" ;
            edtBarColNum_Columnclass = "WWColumn WWColumnGray hidden-xs" ;
            edtBarNomCli_Columnclass = "WWColumn WWColumnGray hidden-xs" ;
            edtBarNumCli_Columnclass = "WWColumn WWColumnGray hidden-xs" ;
            edtBarPie_Columnclass = "WWColumn WWColumnGray hidden-xs" ;
            edtBarKgm_Columnclass = "WWColumn WWColumnGray hidden-xs" ;
            edtBarMtr_Columnclass = "WWColumn WWColumnGray hidden-xs" ;
            edtBarSit_Columnclass = "WWColumn WWColumnGray hidden-xs" ;
         }
         else
         {
            edtavSelect_Columnclass = httpContext.getMessage( "WWIconActionColumn", "") ;
            edtBarTipDis_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
            edtBarNHdr_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtBarAgrEst_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtCliCod_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
            edtBarFecGen_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
            edtPedidoClie_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
            edtBarSer_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
            edtBarColNom_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
            edtBarColNum_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
            edtBarNomCli_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
            edtBarNumCli_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
            edtBarPie_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
            edtBarKgm_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
            edtBarMtr_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
            edtBarSit_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
         }
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(60) ;
         }
         sendrow_602( ) ;
         GRID_nEOF = (byte)(1) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         if ( ( subGrid_Islastpage == 1 ) && ( ((int)((GRID_nCurrentRecord) % (subgrid_fnc_recordsperpage( )))) == 0 ) )
         {
            GRID_nFirstRecordOnPage = GRID_nCurrentRecord ;
         }
      }
      if ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) )
      {
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      }
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_60_Refreshing )
      {
         httpContext.doAjaxLoad(60, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e221WZ2 ();
      if (returnInSub) return;
   }

   public void e221WZ2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      AV44InOutBarCod = A129BarCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44InOutBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44InOutBarCod), 8, 0));
      AV46InOutBarCodReo = A132BarCodReo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46InOutBarCodReo", GXutil.str( AV46InOutBarCodReo, 1, 0));
      AV45InOutBarCodPar = A130BarCodPar ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45InOutBarCodPar", AV45InOutBarCodPar);
      AV70InOutBarColNum = A136BarColNum ;
      AV71InOutBarSit = A213BarSit ;
      AV73CliCod = A252CliCod ;
      AV74ForSer = A212BarSer ;
      AV75ForColNom = A135BarColNom ;
      AV76ForColNum = A136BarColNum ;
      GXt_char1 = AV72FORBLO ;
      GXv_char5[0] = GXt_char1 ;
      new app.colorbloqueado(remoteHandle, context).execute( AV43InEmprCod, AV73CliCod, AV74ForSer, AV75ForColNom, AV76ForColNum, AV77TipColCod, GXv_char5) ;
      seleccionhdrprompt_impl.this.GXt_char1 = GXv_char5[0] ;
      AV72FORBLO = GXt_char1 ;
      if ( GXutil.strcmp(AV72FORBLO, httpContext.getMessage( "S", "")) == 0 )
      {
         Dvelop_confirmpanel_btnuseraction1_Confirmationtext = httpContext.getMessage( "Existem OS na situação 2 ou com número de cor igual a zero. Deseja confirmar as cores?", "") ;
         ucDvelop_confirmpanel_btnuseraction1.sendProperty(context, "", false, Dvelop_confirmpanel_btnuseraction1_Internalname, "ConfirmationText", Dvelop_confirmpanel_btnuseraction1_Confirmationtext);
         Dvelop_confirmpanel_btnuseraction1_Comment = httpContext.getMessage( "Existem OS na situação 2 ou com número de cor igual a zero. Deseja confirmar as cores?", "") ;
         ucDvelop_confirmpanel_btnuseraction1.sendProperty(context, "", false, Dvelop_confirmpanel_btnuseraction1_Internalname, "Comment", Dvelop_confirmpanel_btnuseraction1_Comment);
         this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_BTNUSERACTION1Container", "Confirm", "", new Object[] {});
      }
      else
      {
         httpContext.setWebReturnParms(new Object[] {AV43InEmprCod,Integer.valueOf(AV44InOutBarCod),Byte.valueOf(AV46InOutBarCodReo),AV45InOutBarCodPar,Short.valueOf(AV42InClicod),Byte.valueOf(AV41InBarsit)});
         httpContext.setWebReturnParmsMetadata(new Object[] {"AV43InEmprCod","AV44InOutBarCod","AV46InOutBarCodReo","AV45InOutBarCodPar","AV42InClicod","AV41InBarsit"});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      if ( 1 == 2 )
      {
         httpContext.setWebReturnParms(new Object[] {AV43InEmprCod,Integer.valueOf(AV44InOutBarCod),Byte.valueOf(AV46InOutBarCodReo),AV45InOutBarCodPar,Short.valueOf(AV42InClicod),Byte.valueOf(AV41InBarsit)});
         httpContext.setWebReturnParmsMetadata(new Object[] {"AV43InEmprCod","AV44InOutBarCod","AV46InOutBarCodReo","AV45InOutBarCodPar","AV42InClicod","AV41InBarsit"});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      /*  Sending Event outputs  */
   }

   public void e161WZ2( )
   {
      /* 'DoCleanFilters' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'CLEANFILTERS' */
      S122 ();
      if (returnInSub) return;
      subgrid_firstpage( ) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e151WZ2( )
   {
      /* Dvelop_confirmpanel_btnuseraction1_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_btnuseraction1_Result, "Yes") == 0 )
      {
         httpContext.setWebReturnParms(new Object[] {AV43InEmprCod,Integer.valueOf(AV44InOutBarCod),Byte.valueOf(AV46InOutBarCodReo),AV45InOutBarCodPar,Short.valueOf(AV42InClicod),Byte.valueOf(AV41InBarsit)});
         httpContext.setWebReturnParmsMetadata(new Object[] {"AV43InEmprCod","AV44InOutBarCod","AV46InOutBarCodReo","AV45InOutBarCodPar","AV42InClicod","AV41InBarsit"});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
   }

   public void S112( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV14OrderedBy, 4, 0))+":"+(AV15OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S122( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV6FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6FilterFullText", AV6FilterFullText);
   }

   public void e171WZ2( )
   {
      /* Barsitfrom_Controlvaluechanged Routine */
      returnInSub = false ;
      if ( (0==AV60BarSitfrom) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error.Es obligatorio un valor. Desde 1 hasta 9", ""));
         AV60BarSitfrom = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV60BarSitfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60BarSitfrom), 2, 0));
         GX_FocusControl = edtavBarsitfrom_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      /*  Sending Event outputs  */
   }

   public void e181WZ2( )
   {
      /* Barsit_Controlvaluechanged Routine */
      returnInSub = false ;
      if ( (0==AV59BarSit) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error.Es obligatorio un valor. Desde 1 hasta 9", ""));
         AV59BarSit = AV41InBarsit ;
         httpContext.ajax_rsp_assign_attri("", false, "AV59BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59BarSit), 2, 0));
         GX_FocusControl = edtavBarsit_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      /*  Sending Event outputs  */
   }

   public void wb_table2_96_1WZ2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_btnuseraction1_Internalname, tblTabledvelop_confirmpanel_btnuseraction1_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_btnuseraction1.setProperty("Title", Dvelop_confirmpanel_btnuseraction1_Title);
         ucDvelop_confirmpanel_btnuseraction1.setProperty("ConfirmationText", Dvelop_confirmpanel_btnuseraction1_Confirmationtext);
         ucDvelop_confirmpanel_btnuseraction1.setProperty("YesButtonCaption", Dvelop_confirmpanel_btnuseraction1_Yesbuttoncaption);
         ucDvelop_confirmpanel_btnuseraction1.setProperty("NoButtonCaption", Dvelop_confirmpanel_btnuseraction1_Nobuttoncaption);
         ucDvelop_confirmpanel_btnuseraction1.setProperty("CancelButtonCaption", Dvelop_confirmpanel_btnuseraction1_Cancelbuttoncaption);
         ucDvelop_confirmpanel_btnuseraction1.setProperty("YesButtonPosition", Dvelop_confirmpanel_btnuseraction1_Yesbuttonposition);
         ucDvelop_confirmpanel_btnuseraction1.setProperty("ConfirmType", Dvelop_confirmpanel_btnuseraction1_Confirmtype);
         ucDvelop_confirmpanel_btnuseraction1.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_btnuseraction1_Internalname, "DVELOP_CONFIRMPANEL_BTNUSERACTION1Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_BTNUSERACTION1Container"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_96_1WZ2e( true) ;
      }
      else
      {
         wb_table2_96_1WZ2e( false) ;
      }
   }

   public void wb_table1_48_1WZ2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablefilters_Internalname, tblTablefilters_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='CellAlignTopPaddingTop10'>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblCleanfilters_Internalname, httpContext.getMessage( "<i class=\"fas fa-filter CleanFiltersIcon\"></i>", ""), "", "", lblCleanfilters_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'DOCLEANFILTERS\\'."+"'", "", "TextBlock", 5, httpContext.getMessage( "WWP_CleanFiltersTooltip", ""), 1, 1, 0, (short)(1), "HLP_SeleccionHDRPrompt.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFilterfulltext_Internalname, httpContext.getMessage( "Filter Full Text", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'" + sGXsfl_60_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV6FilterFullText, GXutil.rtrim( localUtil.format( AV6FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_SeleccionHDRPrompt.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_48_1WZ2e( true) ;
      }
      else
      {
         wb_table1_48_1WZ2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV43InEmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43InEmprCod", AV43InEmprCod);
      AV44InOutBarCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44InOutBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44InOutBarCod), 8, 0));
      AV46InOutBarCodReo = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46InOutBarCodReo", GXutil.str( AV46InOutBarCodReo, 1, 0));
      AV45InOutBarCodPar = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45InOutBarCodPar", AV45InOutBarCodPar);
      AV42InClicod = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42InClicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42InClicod), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV42InClicod), "ZZZ9")));
      AV41InBarsit = ((Number) GXutil.testNumericType( getParm(obj,5), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41InBarsit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41InBarsit), 2, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINBARSIT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV41InBarsit), "Z9")));
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
      pa1WZ2( ) ;
      ws1WZ2( ) ;
      we1WZ2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202692911253498", true, true);
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
      httpContext.AddJavascriptSource("seleccionhdrprompt.js", "?202692911253499", false, true);
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

   public void subsflControlProps_602( )
   {
      edtavSelect_Internalname = "vSELECT_"+sGXsfl_60_idx ;
      edtBarTipDis_Internalname = "BARTIPDIS_"+sGXsfl_60_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_60_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_60_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_60_idx ;
      edtBarNHdr_Internalname = "BARNHDR_"+sGXsfl_60_idx ;
      edtBarAgrEst_Internalname = "BARAGREST_"+sGXsfl_60_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_60_idx ;
      edtBarFecGen_Internalname = "BARFECGEN_"+sGXsfl_60_idx ;
      edtPedidoClie_Internalname = "PEDIDOCLIE_"+sGXsfl_60_idx ;
      edtBarSer_Internalname = "BARSER_"+sGXsfl_60_idx ;
      edtBarColNom_Internalname = "BARCOLNOM_"+sGXsfl_60_idx ;
      edtBarColNum_Internalname = "BARCOLNUM_"+sGXsfl_60_idx ;
      edtBarNomCli_Internalname = "BARNOMCLI_"+sGXsfl_60_idx ;
      edtBarNumCli_Internalname = "BARNUMCLI_"+sGXsfl_60_idx ;
      edtBarPie_Internalname = "BARPIE_"+sGXsfl_60_idx ;
      edtBarKgm_Internalname = "BARKGM_"+sGXsfl_60_idx ;
      edtBarMtr_Internalname = "BARMTR_"+sGXsfl_60_idx ;
      edtBarSit_Internalname = "BARSIT_"+sGXsfl_60_idx ;
      edtavF_color_Internalname = "vF_COLOR_"+sGXsfl_60_idx ;
   }

   public void subsflControlProps_fel_602( )
   {
      edtavSelect_Internalname = "vSELECT_"+sGXsfl_60_fel_idx ;
      edtBarTipDis_Internalname = "BARTIPDIS_"+sGXsfl_60_fel_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_60_fel_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_60_fel_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_60_fel_idx ;
      edtBarNHdr_Internalname = "BARNHDR_"+sGXsfl_60_fel_idx ;
      edtBarAgrEst_Internalname = "BARAGREST_"+sGXsfl_60_fel_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_60_fel_idx ;
      edtBarFecGen_Internalname = "BARFECGEN_"+sGXsfl_60_fel_idx ;
      edtPedidoClie_Internalname = "PEDIDOCLIE_"+sGXsfl_60_fel_idx ;
      edtBarSer_Internalname = "BARSER_"+sGXsfl_60_fel_idx ;
      edtBarColNom_Internalname = "BARCOLNOM_"+sGXsfl_60_fel_idx ;
      edtBarColNum_Internalname = "BARCOLNUM_"+sGXsfl_60_fel_idx ;
      edtBarNomCli_Internalname = "BARNOMCLI_"+sGXsfl_60_fel_idx ;
      edtBarNumCli_Internalname = "BARNUMCLI_"+sGXsfl_60_fel_idx ;
      edtBarPie_Internalname = "BARPIE_"+sGXsfl_60_fel_idx ;
      edtBarKgm_Internalname = "BARKGM_"+sGXsfl_60_fel_idx ;
      edtBarMtr_Internalname = "BARMTR_"+sGXsfl_60_fel_idx ;
      edtBarSit_Internalname = "BARSIT_"+sGXsfl_60_fel_idx ;
      edtavF_color_Internalname = "vF_COLOR_"+sGXsfl_60_fel_idx ;
   }

   public void sendrow_602( )
   {
      subsflControlProps_602( ) ;
      wb1WZ0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_60_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_60_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_60_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavSelect_Enabled!=0)&&(edtavSelect_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 61,'',false,'"+sGXsfl_60_idx+"',60)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSelect_Internalname,GXutil.rtrim( AV17Select),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavSelect_Enabled!=0)&&(edtavSelect_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,61);\"" : " "),"'"+""+"'"+",false,"+"'"+"EENTER."+sGXsfl_60_idx+"'","","",httpContext.getMessage( "GX_BtnSelect", ""),"",edtavSelect_Jsonclick,Integer.valueOf(5),"Attribute","",ROClassString,edtavSelect_Columnclass,edtavSelect_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavSelect_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTipDis_Internalname,GXutil.rtrim( A2010BarTipDis),GXutil.rtrim( localUtil.format( A2010BarTipDis, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarTipDis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtBarTipDis_Columnclass,edtBarTipDis_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNHdr_Internalname,GXutil.rtrim( A13696BarNHdr),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarNHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtBarNHdr_Columnclass,edtBarNHdr_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAgrEst_Internalname,GXutil.rtrim( A120BarAgrEst),GXutil.rtrim( localUtil.format( A120BarAgrEst, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAgrEst_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtBarAgrEst_Columnclass,edtBarAgrEst_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtCliCod_Columnclass,edtCliCod_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecGen_Internalname,localUtil.format(A159BarFecGen, "99/99/99"),localUtil.format( A159BarFecGen, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFecGen_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtBarFecGen_Columnclass,edtBarFecGen_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPedidoClie_Internalname,GXutil.rtrim( A13878PedidoClie),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPedidoClie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtPedidoClie_Columnclass,edtPedidoClie_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSer_Internalname,GXutil.rtrim( A212BarSer),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtBarSer_Columnclass,edtBarSer_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNom_Internalname,GXutil.rtrim( A135BarColNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtBarColNom_Columnclass,edtBarColNom_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtBarColNum_Columnclass,edtBarColNum_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNomCli_Internalname,GXutil.rtrim( A1234BarNomCli),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarNomCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtBarNomCli_Columnclass,edtBarNomCli_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNumCli_Internalname,GXutil.ltrim( localUtil.ntoc( A1235BarNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1235BarNumCli), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarNumCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtBarNumCli_Columnclass,edtBarNumCli_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPie_Internalname,GXutil.ltrim( localUtil.ntoc( A198BarPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A198BarPie), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtBarPie_Columnclass,edtBarPie_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A166BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A166BarKgm, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtBarKgm_Columnclass,edtBarKgm_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A184BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A184BarMtr, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtBarMtr_Columnclass,edtBarMtr_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSit_Internalname,GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarSit_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtBarSit_Columnclass,edtBarSit_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavF_color_Enabled!=0)&&(edtavF_color_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 80,'',false,'"+sGXsfl_60_idx+"',60)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavF_color_Internalname,GXutil.ltrim( localUtil.ntoc( AV54F_color, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavF_color_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV54F_color), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV54F_color), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavF_color_Enabled!=0)&&(edtavF_color_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,80);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavF_color_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavF_color_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1WZ2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_60_idx = ((subGrid_Islastpage==1)&&(nGXsfl_60_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_60_idx+1) ;
         sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_602( ) ;
      }
      /* End function sendrow_602 */
   }

   public void startgridcontrol60( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"60\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo", "")) ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N° Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "A?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pedido Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Piezas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Sit.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
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
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV17Select));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavSelect_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavSelect_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSelect_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A2010BarTipDis));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarTipDis_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarTipDis_Columnheaderclass));
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13696BarNHdr));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarNHdr_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarNHdr_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A120BarAgrEst));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarAgrEst_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarAgrEst_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtCliCod_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtCliCod_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A159BarFecGen, "99/99/99"));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarFecGen_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarFecGen_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13878PedidoClie));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtPedidoClie_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtPedidoClie_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A212BarSer));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarSer_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarSer_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A135BarColNom));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarColNom_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarColNom_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarColNum_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarColNum_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1234BarNomCli));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarNomCli_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarNomCli_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1235BarNumCli, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarNumCli_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarNumCli_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A198BarPie, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarPie_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarPie_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A166BarKgm, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarKgm_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarKgm_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A184BarMtr, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarMtr_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarMtr_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarSit_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarSit_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV54F_color, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavF_color_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtavClicodfrom_Internalname = "vCLICODFROM" ;
      edtavPedidoclientefrom_Internalname = "vPEDIDOCLIENTEFROM" ;
      edtavBarsitfrom_Internalname = "vBARSITFROM" ;
      edtavBarsit_Internalname = "vBARSIT" ;
      edtavTfbarfecgen_Internalname = "vTFBARFECGEN" ;
      edtavTfbarfecgen_to_Internalname = "vTFBARFECGEN_TO" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      lblCleanfilters_Internalname = "CLEANFILTERS" ;
      edtavFilterfulltext_Internalname = "vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = "TABLEFILTERS" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      edtavSelect_Internalname = "vSELECT" ;
      edtBarTipDis_Internalname = "BARTIPDIS" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtBarNHdr_Internalname = "BARNHDR" ;
      edtBarAgrEst_Internalname = "BARAGREST" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtBarFecGen_Internalname = "BARFECGEN" ;
      edtPedidoClie_Internalname = "PEDIDOCLIE" ;
      edtBarSer_Internalname = "BARSER" ;
      edtBarColNom_Internalname = "BARCOLNOM" ;
      edtBarColNum_Internalname = "BARCOLNUM" ;
      edtBarNomCli_Internalname = "BARNOMCLI" ;
      edtBarNumCli_Internalname = "BARNUMCLI" ;
      edtBarPie_Internalname = "BARPIE" ;
      edtBarKgm_Internalname = "BARKGM" ;
      edtBarMtr_Internalname = "BARMTR" ;
      edtBarSit_Internalname = "BARSIT" ;
      edtavF_color_Internalname = "vF_COLOR" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablacontenido_Internalname = "TABLACONTENIDO" ;
      bttBtnuseraction1_Internalname = "BTNUSERACTION1" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      edtavInemprcod_Internalname = "vINEMPRCOD" ;
      Dvelop_confirmpanel_btnuseraction1_Internalname = "DVELOP_CONFIRMPANEL_BTNUSERACTION1" ;
      tblTabledvelop_confirmpanel_btnuseraction1_Internalname = "TABLEDVELOP_CONFIRMPANEL_BTNUSERACTION1" ;
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
      subGrid_Allowhovering = (byte)(-1) ;
      subGrid_Allowselection = (byte)(1) ;
      subGrid_Header = "" ;
      edtavF_color_Jsonclick = "" ;
      edtavF_color_Visible = 0 ;
      edtavF_color_Enabled = 1 ;
      edtBarSit_Jsonclick = "" ;
      edtBarSit_Columnclass = "WWColumn hidden-xs" ;
      edtBarMtr_Jsonclick = "" ;
      edtBarMtr_Columnclass = "WWColumn hidden-xs" ;
      edtBarKgm_Jsonclick = "" ;
      edtBarKgm_Columnclass = "WWColumn hidden-xs" ;
      edtBarPie_Jsonclick = "" ;
      edtBarPie_Columnclass = "WWColumn hidden-xs" ;
      edtBarNumCli_Jsonclick = "" ;
      edtBarNumCli_Columnclass = "WWColumn hidden-xs" ;
      edtBarNomCli_Jsonclick = "" ;
      edtBarNomCli_Columnclass = "WWColumn hidden-xs" ;
      edtBarColNum_Jsonclick = "" ;
      edtBarColNum_Columnclass = "WWColumn hidden-xs" ;
      edtBarColNom_Jsonclick = "" ;
      edtBarColNom_Columnclass = "WWColumn hidden-xs" ;
      edtBarSer_Jsonclick = "" ;
      edtBarSer_Columnclass = "WWColumn hidden-xs" ;
      edtPedidoClie_Jsonclick = "" ;
      edtPedidoClie_Columnclass = "WWColumn hidden-xs" ;
      edtBarFecGen_Jsonclick = "" ;
      edtBarFecGen_Columnclass = "WWColumn hidden-xs" ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Columnclass = "WWColumn hidden-xs" ;
      edtBarAgrEst_Jsonclick = "" ;
      edtBarAgrEst_Columnclass = "WWColumn" ;
      edtBarNHdr_Jsonclick = "" ;
      edtBarNHdr_Columnclass = "WWColumn" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      edtBarTipDis_Jsonclick = "" ;
      edtBarTipDis_Columnclass = "WWColumn hidden-xs" ;
      edtavSelect_Jsonclick = "" ;
      edtavSelect_Columnclass = "WWIconActionColumn" ;
      edtavSelect_Visible = -1 ;
      edtavSelect_Enabled = 1 ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtBarSit_Columnheaderclass = "" ;
      edtBarMtr_Columnheaderclass = "" ;
      edtBarKgm_Columnheaderclass = "" ;
      edtBarPie_Columnheaderclass = "" ;
      edtBarNumCli_Columnheaderclass = "" ;
      edtBarNomCli_Columnheaderclass = "" ;
      edtBarColNum_Columnheaderclass = "" ;
      edtBarColNom_Columnheaderclass = "" ;
      edtBarSer_Columnheaderclass = "" ;
      edtPedidoClie_Columnheaderclass = "" ;
      edtBarFecGen_Columnheaderclass = "" ;
      edtCliCod_Columnheaderclass = "" ;
      edtBarAgrEst_Columnheaderclass = "" ;
      edtBarNHdr_Columnheaderclass = "" ;
      edtBarTipDis_Columnheaderclass = "" ;
      edtavSelect_Columnheaderclass = "" ;
      subGrid_Sortable = (byte)(0) ;
      edtavInemprcod_Jsonclick = "" ;
      edtavInemprcod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavTfbarfecgen_to_Jsonclick = "" ;
      edtavTfbarfecgen_to_Enabled = 1 ;
      edtavTfbarfecgen_Jsonclick = "" ;
      edtavTfbarfecgen_Enabled = 1 ;
      edtavBarsit_Jsonclick = "" ;
      edtavBarsit_Enabled = 1 ;
      edtavBarsitfrom_Jsonclick = "" ;
      edtavBarsitfrom_Enabled = 1 ;
      edtavPedidoclientefrom_Jsonclick = "" ;
      edtavPedidoclientefrom_Enabled = 1 ;
      edtavClicodfrom_Jsonclick = "" ;
      edtavClicodfrom_Enabled = 1 ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_btnuseraction1_Comment = "No" ;
      Dvelop_confirmpanel_btnuseraction1_Confirmtype = "1" ;
      Dvelop_confirmpanel_btnuseraction1_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_btnuseraction1_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_btnuseraction1_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_btnuseraction1_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_btnuseraction1_Confirmationtext = "Color Bloqueado !  Desea continuar ?" ;
      Dvelop_confirmpanel_btnuseraction1_Title = httpContext.getMessage( "Aviso", "") ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|7|8|9|10|11" ;
      Ddo_grid_Columnids = "1:BarTipDis|6:BarAgrEst|7:CliCod|8:BarFecGen|10:BarSer|11:BarColNom|12:BarColNum|13:BarNomCli|14:BarNumCli|18:BarSit" ;
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
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Seleccion HDRs .", "") );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV63CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV64PedidoClientefrom',fld:'vPEDIDOCLIENTEFROM',pic:''},{av:'AV60BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV59BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV48TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV49TFBarFecGen_To',fld:'vTFBARFECGEN_TO',pic:''},{av:'AV6FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV43InEmprCod',fld:'vINEMPRCOD',pic:'@!'},{av:'AV53Ensayos',fld:'vENSAYOS',pic:'ZZZ9',hsh:true},{av:'AV77TipColCod',fld:'vTIPCOLCOD',pic:'Z9',hsh:true},{av:'AV41InBarsit',fld:'vINBARSIT',pic:'Z9',hsh:true},{av:'AV42InClicod',fld:'vINCLICOD',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV7GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV8GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtavSelect_Columnheaderclass',ctrl:'vSELECT',prop:'Columnheaderclass'},{av:'edtBarTipDis_Columnheaderclass',ctrl:'BARTIPDIS',prop:'Columnheaderclass'},{av:'edtBarNHdr_Columnheaderclass',ctrl:'BARNHDR',prop:'Columnheaderclass'},{av:'edtBarAgrEst_Columnheaderclass',ctrl:'BARAGREST',prop:'Columnheaderclass'},{av:'edtCliCod_Columnheaderclass',ctrl:'CLICOD',prop:'Columnheaderclass'},{av:'edtBarFecGen_Columnheaderclass',ctrl:'BARFECGEN',prop:'Columnheaderclass'},{av:'edtPedidoClie_Columnheaderclass',ctrl:'PEDIDOCLIE',prop:'Columnheaderclass'},{av:'edtBarSer_Columnheaderclass',ctrl:'BARSER',prop:'Columnheaderclass'},{av:'edtBarColNom_Columnheaderclass',ctrl:'BARCOLNOM',prop:'Columnheaderclass'},{av:'edtBarColNum_Columnheaderclass',ctrl:'BARCOLNUM',prop:'Columnheaderclass'},{av:'edtBarNomCli_Columnheaderclass',ctrl:'BARNOMCLI',prop:'Columnheaderclass'},{av:'edtBarNumCli_Columnheaderclass',ctrl:'BARNUMCLI',prop:'Columnheaderclass'},{av:'edtBarPie_Columnheaderclass',ctrl:'BARPIE',prop:'Columnheaderclass'},{av:'edtBarKgm_Columnheaderclass',ctrl:'BARKGM',prop:'Columnheaderclass'},{av:'edtBarMtr_Columnheaderclass',ctrl:'BARMTR',prop:'Columnheaderclass'},{av:'edtBarSit_Columnheaderclass',ctrl:'BARSIT',prop:'Columnheaderclass'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e121WZ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV63CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV64PedidoClientefrom',fld:'vPEDIDOCLIENTEFROM',pic:''},{av:'AV60BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV59BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV48TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV49TFBarFecGen_To',fld:'vTFBARFECGEN_TO',pic:''},{av:'AV6FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV43InEmprCod',fld:'vINEMPRCOD',pic:'@!'},{av:'AV53Ensayos',fld:'vENSAYOS',pic:'ZZZ9',hsh:true},{av:'AV77TipColCod',fld:'vTIPCOLCOD',pic:'Z9',hsh:true},{av:'AV41InBarsit',fld:'vINBARSIT',pic:'Z9',hsh:true},{av:'AV42InClicod',fld:'vINCLICOD',pic:'ZZZ9',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e131WZ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV63CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV64PedidoClientefrom',fld:'vPEDIDOCLIENTEFROM',pic:''},{av:'AV60BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV59BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV48TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV49TFBarFecGen_To',fld:'vTFBARFECGEN_TO',pic:''},{av:'AV6FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV43InEmprCod',fld:'vINEMPRCOD',pic:'@!'},{av:'AV53Ensayos',fld:'vENSAYOS',pic:'ZZZ9',hsh:true},{av:'AV77TipColCod',fld:'vTIPCOLCOD',pic:'Z9',hsh:true},{av:'AV41InBarsit',fld:'vINBARSIT',pic:'Z9',hsh:true},{av:'AV42InClicod',fld:'vINCLICOD',pic:'ZZZ9',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e141WZ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV63CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV64PedidoClientefrom',fld:'vPEDIDOCLIENTEFROM',pic:''},{av:'AV60BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV59BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV48TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV49TFBarFecGen_To',fld:'vTFBARFECGEN_TO',pic:''},{av:'AV6FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV43InEmprCod',fld:'vINEMPRCOD',pic:'@!'},{av:'AV53Ensayos',fld:'vENSAYOS',pic:'ZZZ9',hsh:true},{av:'AV77TipColCod',fld:'vTIPCOLCOD',pic:'Z9',hsh:true},{av:'AV41InBarsit',fld:'vINBARSIT',pic:'Z9',hsh:true},{av:'AV42InClicod',fld:'vINCLICOD',pic:'ZZZ9',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e211WZ2',iparms:[{av:'A213BarSit',fld:'BARSIT',pic:'Z9',hsh:true},{av:'A1923BarCodTN',fld:'BARCODTN',pic:'ZZZZZ9'},{av:'AV53Ensayos',fld:'vENSAYOS',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV17Select',fld:'vSELECT',pic:''},{av:'AV54F_color',fld:'vF_COLOR',pic:'ZZZ9'},{av:'edtavSelect_Columnclass',ctrl:'vSELECT',prop:'Columnclass'},{av:'edtBarTipDis_Columnclass',ctrl:'BARTIPDIS',prop:'Columnclass'},{av:'edtBarNHdr_Columnclass',ctrl:'BARNHDR',prop:'Columnclass'},{av:'edtBarAgrEst_Columnclass',ctrl:'BARAGREST',prop:'Columnclass'},{av:'edtCliCod_Columnclass',ctrl:'CLICOD',prop:'Columnclass'},{av:'edtBarFecGen_Columnclass',ctrl:'BARFECGEN',prop:'Columnclass'},{av:'edtPedidoClie_Columnclass',ctrl:'PEDIDOCLIE',prop:'Columnclass'},{av:'edtBarSer_Columnclass',ctrl:'BARSER',prop:'Columnclass'},{av:'edtBarColNom_Columnclass',ctrl:'BARCOLNOM',prop:'Columnclass'},{av:'edtBarColNum_Columnclass',ctrl:'BARCOLNUM',prop:'Columnclass'},{av:'edtBarNomCli_Columnclass',ctrl:'BARNOMCLI',prop:'Columnclass'},{av:'edtBarNumCli_Columnclass',ctrl:'BARNUMCLI',prop:'Columnclass'},{av:'edtBarPie_Columnclass',ctrl:'BARPIE',prop:'Columnclass'},{av:'edtBarKgm_Columnclass',ctrl:'BARKGM',prop:'Columnclass'},{av:'edtBarMtr_Columnclass',ctrl:'BARMTR',prop:'Columnclass'},{av:'edtBarSit_Columnclass',ctrl:'BARSIT',prop:'Columnclass'}]}");
      setEventMetadata("ENTER","{handler:'e221WZ2',iparms:[{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:'',hsh:true},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'A213BarSit',fld:'BARSIT',pic:'Z9',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9',hsh:true},{av:'A212BarSer',fld:'BARSER',pic:'',hsh:true},{av:'A135BarColNom',fld:'BARCOLNOM',pic:'',hsh:true},{av:'AV43InEmprCod',fld:'vINEMPRCOD',pic:'@!'},{av:'AV77TipColCod',fld:'vTIPCOLCOD',pic:'Z9',hsh:true},{av:'AV41InBarsit',fld:'vINBARSIT',pic:'Z9',hsh:true},{av:'AV42InClicod',fld:'vINCLICOD',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[{av:'AV44InOutBarCod',fld:'vINOUTBARCOD',pic:'ZZZZZZZ9'},{av:'AV46InOutBarCodReo',fld:'vINOUTBARCODREO',pic:'9'},{av:'AV45InOutBarCodPar',fld:'vINOUTBARCODPAR',pic:''},{av:'Dvelop_confirmpanel_btnuseraction1_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_BTNUSERACTION1',prop:'ConfirmationText'},{av:'Dvelop_confirmpanel_btnuseraction1_Comment',ctrl:'DVELOP_CONFIRMPANEL_BTNUSERACTION1',prop:'Comment'}]}");
      setEventMetadata("'DOCLEANFILTERS'","{handler:'e161WZ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV63CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV64PedidoClientefrom',fld:'vPEDIDOCLIENTEFROM',pic:''},{av:'AV60BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV59BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV48TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV49TFBarFecGen_To',fld:'vTFBARFECGEN_TO',pic:''},{av:'AV6FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV43InEmprCod',fld:'vINEMPRCOD',pic:'@!'},{av:'AV53Ensayos',fld:'vENSAYOS',pic:'ZZZ9',hsh:true},{av:'AV77TipColCod',fld:'vTIPCOLCOD',pic:'Z9',hsh:true},{av:'AV41InBarsit',fld:'vINBARSIT',pic:'Z9',hsh:true},{av:'AV42InClicod',fld:'vINCLICOD',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("'DOCLEANFILTERS'",",oparms:[{av:'AV6FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV7GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV8GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtavSelect_Columnheaderclass',ctrl:'vSELECT',prop:'Columnheaderclass'},{av:'edtBarTipDis_Columnheaderclass',ctrl:'BARTIPDIS',prop:'Columnheaderclass'},{av:'edtBarNHdr_Columnheaderclass',ctrl:'BARNHDR',prop:'Columnheaderclass'},{av:'edtBarAgrEst_Columnheaderclass',ctrl:'BARAGREST',prop:'Columnheaderclass'},{av:'edtCliCod_Columnheaderclass',ctrl:'CLICOD',prop:'Columnheaderclass'},{av:'edtBarFecGen_Columnheaderclass',ctrl:'BARFECGEN',prop:'Columnheaderclass'},{av:'edtPedidoClie_Columnheaderclass',ctrl:'PEDIDOCLIE',prop:'Columnheaderclass'},{av:'edtBarSer_Columnheaderclass',ctrl:'BARSER',prop:'Columnheaderclass'},{av:'edtBarColNom_Columnheaderclass',ctrl:'BARCOLNOM',prop:'Columnheaderclass'},{av:'edtBarColNum_Columnheaderclass',ctrl:'BARCOLNUM',prop:'Columnheaderclass'},{av:'edtBarNomCli_Columnheaderclass',ctrl:'BARNOMCLI',prop:'Columnheaderclass'},{av:'edtBarNumCli_Columnheaderclass',ctrl:'BARNUMCLI',prop:'Columnheaderclass'},{av:'edtBarPie_Columnheaderclass',ctrl:'BARPIE',prop:'Columnheaderclass'},{av:'edtBarKgm_Columnheaderclass',ctrl:'BARKGM',prop:'Columnheaderclass'},{av:'edtBarMtr_Columnheaderclass',ctrl:'BARMTR',prop:'Columnheaderclass'},{av:'edtBarSit_Columnheaderclass',ctrl:'BARSIT',prop:'Columnheaderclass'}]}");
      setEventMetadata("'DOUSERACTION1'","{handler:'e111WZ1',iparms:[]");
      setEventMetadata("'DOUSERACTION1'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNUSERACTION1.CLOSE","{handler:'e151WZ2',iparms:[{av:'Dvelop_confirmpanel_btnuseraction1_Result',ctrl:'DVELOP_CONFIRMPANEL_BTNUSERACTION1',prop:'Result'},{av:'AV41InBarsit',fld:'vINBARSIT',pic:'Z9',hsh:true},{av:'AV42InClicod',fld:'vINCLICOD',pic:'ZZZ9',hsh:true},{av:'AV45InOutBarCodPar',fld:'vINOUTBARCODPAR',pic:''},{av:'AV46InOutBarCodReo',fld:'vINOUTBARCODREO',pic:'9'},{av:'AV44InOutBarCod',fld:'vINOUTBARCOD',pic:'ZZZZZZZ9'},{av:'AV43InEmprCod',fld:'vINEMPRCOD',pic:'@!'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNUSERACTION1.CLOSE",",oparms:[]}");
      setEventMetadata("VBARSITFROM.CONTROLVALUECHANGED","{handler:'e171WZ2',iparms:[{av:'AV60BarSitfrom',fld:'vBARSITFROM',pic:'Z9'}]");
      setEventMetadata("VBARSITFROM.CONTROLVALUECHANGED",",oparms:[{av:'AV60BarSitfrom',fld:'vBARSITFROM',pic:'Z9'}]}");
      setEventMetadata("VBARSIT.CONTROLVALUECHANGED","{handler:'e181WZ2',iparms:[{av:'AV59BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV41InBarsit',fld:'vINBARSIT',pic:'Z9',hsh:true}]");
      setEventMetadata("VBARSIT.CONTROLVALUECHANGED",",oparms:[{av:'AV59BarSit',fld:'vBARSIT',pic:'Z9'}]}");
      setEventMetadata("VALIDV_INEMPRCOD","{handler:'validv_Inemprcod',iparms:[]");
      setEventMetadata("VALIDV_INEMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARTIPDIS","{handler:'valid_Bartipdis',iparms:[]");
      setEventMetadata("VALID_BARTIPDIS",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_BARNHDR","{handler:'valid_Barnhdr',iparms:[]");
      setEventMetadata("VALID_BARNHDR",",oparms:[]}");
      setEventMetadata("VALID_BARAGREST","{handler:'valid_Baragrest',iparms:[]");
      setEventMetadata("VALID_BARAGREST",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_PEDIDOCLIE","{handler:'valid_Pedidoclie',iparms:[]");
      setEventMetadata("VALID_PEDIDOCLIE",",oparms:[]}");
      setEventMetadata("VALID_BARSER","{handler:'valid_Barser',iparms:[]");
      setEventMetadata("VALID_BARSER",",oparms:[]}");
      setEventMetadata("VALID_BARCOLNOM","{handler:'valid_Barcolnom',iparms:[]");
      setEventMetadata("VALID_BARCOLNOM",",oparms:[]}");
      setEventMetadata("VALID_BARCOLNUM","{handler:'valid_Barcolnum',iparms:[]");
      setEventMetadata("VALID_BARCOLNUM",",oparms:[]}");
      setEventMetadata("VALID_BARNOMCLI","{handler:'valid_Barnomcli',iparms:[]");
      setEventMetadata("VALID_BARNOMCLI",",oparms:[]}");
      setEventMetadata("VALID_BARNUMCLI","{handler:'valid_Barnumcli',iparms:[]");
      setEventMetadata("VALID_BARNUMCLI",",oparms:[]}");
      setEventMetadata("VALID_BARPIE","{handler:'valid_Barpie',iparms:[]");
      setEventMetadata("VALID_BARPIE",",oparms:[]}");
      setEventMetadata("VALID_BARKGM","{handler:'valid_Barkgm',iparms:[]");
      setEventMetadata("VALID_BARKGM",",oparms:[]}");
      setEventMetadata("VALID_BARMTR","{handler:'valid_Barmtr',iparms:[]");
      setEventMetadata("VALID_BARMTR",",oparms:[]}");
      setEventMetadata("VALID_BARSIT","{handler:'valid_Barsit',iparms:[]");
      setEventMetadata("VALID_BARSIT",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_F_color',iparms:[]");
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
      wcpOAV43InEmprCod = "" ;
      wcpOAV45InOutBarCodPar = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Dvelop_confirmpanel_btnuseraction1_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV43InEmprCod = "" ;
      AV45InOutBarCodPar = "" ;
      AV64PedidoClientefrom = "" ;
      AV48TFBarFecGen = GXutil.nullDate() ;
      AV49TFBarFecGen_To = GXutil.nullDate() ;
      AV6FilterFullText = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV5DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A396EmprCod = "" ;
      A4812BarEncCli = "" ;
      A143BarDisNum = "" ;
      A365DisDes = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      AV80Pgmname = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnuseraction1_Jsonclick = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV17Select = "" ;
      A2010BarTipDis = "" ;
      A130BarCodPar = "" ;
      A13696BarNHdr = "" ;
      A120BarAgrEst = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A13878PedidoClie = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      Gx_date = GXutil.nullDate() ;
      scmdbuf = "" ;
      lV6FilterFullText = "" ;
      H01WZ3_A1923BarCodTN = new int[1] ;
      H01WZ3_A213BarSit = new byte[1] ;
      H01WZ3_A1235BarNumCli = new int[1] ;
      H01WZ3_A1234BarNomCli = new String[] {""} ;
      H01WZ3_A136BarColNum = new int[1] ;
      H01WZ3_A135BarColNom = new String[] {""} ;
      H01WZ3_A212BarSer = new String[] {""} ;
      H01WZ3_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      H01WZ3_A252CliCod = new int[1] ;
      H01WZ3_n252CliCod = new boolean[] {false} ;
      H01WZ3_A120BarAgrEst = new String[] {""} ;
      H01WZ3_A13696BarNHdr = new String[] {""} ;
      H01WZ3_A2010BarTipDis = new String[] {""} ;
      H01WZ3_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01WZ3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01WZ3_A129BarCod = new int[1] ;
      H01WZ3_A132BarCodReo = new byte[1] ;
      H01WZ3_A130BarCodPar = new String[] {""} ;
      H01WZ3_A143BarDisNum = new String[] {""} ;
      H01WZ3_A4812BarEncCli = new String[] {""} ;
      H01WZ3_A396EmprCod = new String[] {""} ;
      H01WZ3_A199BarPie1 = new short[1] ;
      H01WZ3_A365DisDes = new String[] {""} ;
      H01WZ3_A898BarPieNDes = new int[1] ;
      H01WZ5_A1923BarCodTN = new int[1] ;
      H01WZ5_A213BarSit = new byte[1] ;
      H01WZ5_A1235BarNumCli = new int[1] ;
      H01WZ5_A1234BarNomCli = new String[] {""} ;
      H01WZ5_A136BarColNum = new int[1] ;
      H01WZ5_A135BarColNom = new String[] {""} ;
      H01WZ5_A212BarSer = new String[] {""} ;
      H01WZ5_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      H01WZ5_A252CliCod = new int[1] ;
      H01WZ5_n252CliCod = new boolean[] {false} ;
      H01WZ5_A120BarAgrEst = new String[] {""} ;
      H01WZ5_A13696BarNHdr = new String[] {""} ;
      H01WZ5_A2010BarTipDis = new String[] {""} ;
      H01WZ5_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01WZ5_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01WZ5_A129BarCod = new int[1] ;
      H01WZ5_A132BarCodReo = new byte[1] ;
      H01WZ5_A130BarCodPar = new String[] {""} ;
      H01WZ5_A143BarDisNum = new String[] {""} ;
      H01WZ5_A4812BarEncCli = new String[] {""} ;
      H01WZ5_A396EmprCod = new String[] {""} ;
      H01WZ5_A199BarPie1 = new short[1] ;
      H01WZ5_A365DisDes = new String[] {""} ;
      H01WZ5_A898BarPieNDes = new int[1] ;
      GXv_char2 = new String[1] ;
      GXv_int7 = new byte[1] ;
      AV66Station = "" ;
      AV67EmprCod = "" ;
      AV68EmprNom = "" ;
      GXv_char4 = new String[1] ;
      AV69UsurCod = "" ;
      GXv_char3 = new String[1] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV40WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext10 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV74ForSer = "" ;
      AV75ForColNom = "" ;
      AV72FORBLO = "" ;
      GXt_char1 = "" ;
      GXv_char5 = new String[1] ;
      ucDvelop_confirmpanel_btnuseraction1 = new com.genexus.webpanels.GXUserControl();
      lblCleanfilters_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.seleccionhdrprompt__default(),
         new Object[] {
             new Object[] {
            H01WZ3_A1923BarCodTN, H01WZ3_A213BarSit, H01WZ3_A1235BarNumCli, H01WZ3_A1234BarNomCli, H01WZ3_A136BarColNum, H01WZ3_A135BarColNom, H01WZ3_A212BarSer, H01WZ3_A159BarFecGen, H01WZ3_A252CliCod, H01WZ3_n252CliCod,
            H01WZ3_A120BarAgrEst, H01WZ3_A13696BarNHdr, H01WZ3_A2010BarTipDis, H01WZ3_A184BarMtr, H01WZ3_A166BarKgm, H01WZ3_A129BarCod, H01WZ3_A132BarCodReo, H01WZ3_A130BarCodPar, H01WZ3_A143BarDisNum, H01WZ3_A4812BarEncCli,
            H01WZ3_A396EmprCod, H01WZ3_A199BarPie1, H01WZ3_A365DisDes, H01WZ3_A898BarPieNDes
            }
            , new Object[] {
            H01WZ5_A1923BarCodTN, H01WZ5_A213BarSit, H01WZ5_A1235BarNumCli, H01WZ5_A1234BarNomCli, H01WZ5_A136BarColNum, H01WZ5_A135BarColNom, H01WZ5_A212BarSer, H01WZ5_A159BarFecGen, H01WZ5_A252CliCod, H01WZ5_n252CliCod,
            H01WZ5_A120BarAgrEst, H01WZ5_A13696BarNHdr, H01WZ5_A2010BarTipDis, H01WZ5_A184BarMtr, H01WZ5_A166BarKgm, H01WZ5_A129BarCod, H01WZ5_A132BarCodReo, H01WZ5_A130BarCodPar, H01WZ5_A143BarDisNum, H01WZ5_A4812BarEncCli,
            H01WZ5_A396EmprCod, H01WZ5_A199BarPie1, H01WZ5_A365DisDes, H01WZ5_A898BarPieNDes
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV80Pgmname = "SeleccionHDRPrompt" ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      AV80Pgmname = "SeleccionHDRPrompt" ;
      Gx_err = (short)(0) ;
      edtavSelect_Enabled = 0 ;
      edtavF_color_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV46InOutBarCodReo ;
   private byte wcpOAV41InBarsit ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV46InOutBarCodReo ;
   private byte AV41InBarsit ;
   private byte AV60BarSitfrom ;
   private byte AV59BarSit ;
   private byte AV77TipColCod ;
   private byte gxajaxcallmode ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXt_int6 ;
   private byte GXv_int7[] ;
   private byte AV71InOutBarSit ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wcpOAV42InClicod ;
   private short AV42InClicod ;
   private short AV53Ensayos ;
   private short AV14OrderedBy ;
   private short A199BarPie1 ;
   private short wbEnd ;
   private short wbStart ;
   private short AV54F_color ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV44InOutBarCod ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_60 ;
   private int subGrid_Rows ;
   private int AV44InOutBarCod ;
   private int nGXsfl_60_idx=1 ;
   private int AV63CliCodfrom ;
   private int A1923BarCodTN ;
   private int A898BarPieNDes ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavClicodfrom_Enabled ;
   private int edtavPedidoclientefrom_Enabled ;
   private int edtavBarsitfrom_Enabled ;
   private int edtavBarsit_Enabled ;
   private int edtavTfbarfecgen_Enabled ;
   private int edtavTfbarfecgen_to_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavInemprcod_Visible ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int A198BarPie ;
   private int subGrid_Islastpage ;
   private int edtavSelect_Enabled ;
   private int edtavF_color_Enabled ;
   private int AV16PageToGo ;
   private int AV70InOutBarColNum ;
   private int AV73CliCod ;
   private int AV76ForColNum ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavSelect_Visible ;
   private int edtavF_color_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV7GridCurrentPage ;
   private long AV8GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private String wcpOAV43InEmprCod ;
   private String wcpOAV45InOutBarCodPar ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Dvelop_confirmpanel_btnuseraction1_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV43InEmprCod ;
   private String AV45InOutBarCodPar ;
   private String sGXsfl_60_idx="0001" ;
   private String AV64PedidoClientefrom ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
   private String A4812BarEncCli ;
   private String A143BarDisNum ;
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
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Includesortasc ;
   private String Ddo_grid_Sortedstatus ;
   private String Dvelop_confirmpanel_btnuseraction1_Title ;
   private String Dvelop_confirmpanel_btnuseraction1_Confirmationtext ;
   private String Dvelop_confirmpanel_btnuseraction1_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_btnuseraction1_Nobuttoncaption ;
   private String Dvelop_confirmpanel_btnuseraction1_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_btnuseraction1_Yesbuttonposition ;
   private String Dvelop_confirmpanel_btnuseraction1_Confirmtype ;
   private String Dvelop_confirmpanel_btnuseraction1_Comment ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String divTablacontenido_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String edtavClicodfrom_Internalname ;
   private String TempTags ;
   private String edtavClicodfrom_Jsonclick ;
   private String edtavPedidoclientefrom_Internalname ;
   private String edtavPedidoclientefrom_Jsonclick ;
   private String edtavBarsitfrom_Internalname ;
   private String edtavBarsitfrom_Jsonclick ;
   private String edtavBarsit_Internalname ;
   private String edtavBarsit_Jsonclick ;
   private String edtavTfbarfecgen_Internalname ;
   private String edtavTfbarfecgen_Jsonclick ;
   private String edtavTfbarfecgen_to_Internalname ;
   private String edtavTfbarfecgen_to_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String divTableheader_Internalname ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String AV80Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtnuseraction1_Internalname ;
   private String bttBtnuseraction1_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String edtavInemprcod_Internalname ;
   private String edtavInemprcod_Jsonclick ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV17Select ;
   private String edtavSelect_Internalname ;
   private String A2010BarTipDis ;
   private String edtBarTipDis_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String A130BarCodPar ;
   private String edtBarCodPar_Internalname ;
   private String A13696BarNHdr ;
   private String edtBarNHdr_Internalname ;
   private String A120BarAgrEst ;
   private String edtBarAgrEst_Internalname ;
   private String edtCliCod_Internalname ;
   private String edtBarFecGen_Internalname ;
   private String A13878PedidoClie ;
   private String edtPedidoClie_Internalname ;
   private String A212BarSer ;
   private String edtBarSer_Internalname ;
   private String A135BarColNom ;
   private String edtBarColNom_Internalname ;
   private String edtBarColNum_Internalname ;
   private String A1234BarNomCli ;
   private String edtBarNomCli_Internalname ;
   private String edtBarNumCli_Internalname ;
   private String edtBarPie_Internalname ;
   private String edtBarKgm_Internalname ;
   private String edtBarMtr_Internalname ;
   private String edtBarSit_Internalname ;
   private String edtavF_color_Internalname ;
   private String scmdbuf ;
   private String GXv_char2[] ;
   private String edtavFilterfulltext_Internalname ;
   private String AV66Station ;
   private String AV67EmprCod ;
   private String AV68EmprNom ;
   private String GXv_char4[] ;
   private String AV69UsurCod ;
   private String GXv_char3[] ;
   private String edtavSelect_Columnheaderclass ;
   private String edtBarTipDis_Columnheaderclass ;
   private String edtBarNHdr_Columnheaderclass ;
   private String edtBarAgrEst_Columnheaderclass ;
   private String edtCliCod_Columnheaderclass ;
   private String edtBarFecGen_Columnheaderclass ;
   private String edtPedidoClie_Columnheaderclass ;
   private String edtBarSer_Columnheaderclass ;
   private String edtBarColNom_Columnheaderclass ;
   private String edtBarColNum_Columnheaderclass ;
   private String edtBarNomCli_Columnheaderclass ;
   private String edtBarNumCli_Columnheaderclass ;
   private String edtBarPie_Columnheaderclass ;
   private String edtBarKgm_Columnheaderclass ;
   private String edtBarMtr_Columnheaderclass ;
   private String edtBarSit_Columnheaderclass ;
   private String edtavSelect_Columnclass ;
   private String edtBarTipDis_Columnclass ;
   private String edtBarNHdr_Columnclass ;
   private String edtBarAgrEst_Columnclass ;
   private String edtCliCod_Columnclass ;
   private String edtBarFecGen_Columnclass ;
   private String edtPedidoClie_Columnclass ;
   private String edtBarSer_Columnclass ;
   private String edtBarColNom_Columnclass ;
   private String edtBarColNum_Columnclass ;
   private String edtBarNomCli_Columnclass ;
   private String edtBarNumCli_Columnclass ;
   private String edtBarPie_Columnclass ;
   private String edtBarKgm_Columnclass ;
   private String edtBarMtr_Columnclass ;
   private String edtBarSit_Columnclass ;
   private String AV74ForSer ;
   private String AV75ForColNom ;
   private String AV72FORBLO ;
   private String GXt_char1 ;
   private String GXv_char5[] ;
   private String Dvelop_confirmpanel_btnuseraction1_Internalname ;
   private String tblTabledvelop_confirmpanel_btnuseraction1_Internalname ;
   private String tblTablefilters_Internalname ;
   private String lblCleanfilters_Internalname ;
   private String lblCleanfilters_Jsonclick ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sGXsfl_60_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavSelect_Jsonclick ;
   private String edtBarTipDis_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String edtBarNHdr_Jsonclick ;
   private String edtBarAgrEst_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtBarFecGen_Jsonclick ;
   private String edtPedidoClie_Jsonclick ;
   private String edtBarSer_Jsonclick ;
   private String edtBarColNom_Jsonclick ;
   private String edtBarColNum_Jsonclick ;
   private String edtBarNomCli_Jsonclick ;
   private String edtBarNumCli_Jsonclick ;
   private String edtBarPie_Jsonclick ;
   private String edtBarKgm_Jsonclick ;
   private String edtBarMtr_Jsonclick ;
   private String edtBarSit_Jsonclick ;
   private String edtavF_color_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV48TFBarFecGen ;
   private java.util.Date AV49TFBarFecGen_To ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV15OrderedDsc ;
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
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n252CliCod ;
   private boolean bGXsfl_60_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV6FilterFullText ;
   private String lV6FilterFullText ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_btnuseraction1 ;
   private IDataStoreProvider pr_default ;
   private int[] H01WZ3_A1923BarCodTN ;
   private byte[] H01WZ3_A213BarSit ;
   private int[] H01WZ3_A1235BarNumCli ;
   private String[] H01WZ3_A1234BarNomCli ;
   private int[] H01WZ3_A136BarColNum ;
   private String[] H01WZ3_A135BarColNom ;
   private String[] H01WZ3_A212BarSer ;
   private java.util.Date[] H01WZ3_A159BarFecGen ;
   private int[] H01WZ3_A252CliCod ;
   private boolean[] H01WZ3_n252CliCod ;
   private String[] H01WZ3_A120BarAgrEst ;
   private String[] H01WZ3_A13696BarNHdr ;
   private String[] H01WZ3_A2010BarTipDis ;
   private java.math.BigDecimal[] H01WZ3_A184BarMtr ;
   private java.math.BigDecimal[] H01WZ3_A166BarKgm ;
   private int[] H01WZ3_A129BarCod ;
   private byte[] H01WZ3_A132BarCodReo ;
   private String[] H01WZ3_A130BarCodPar ;
   private String[] H01WZ3_A143BarDisNum ;
   private String[] H01WZ3_A4812BarEncCli ;
   private String[] H01WZ3_A396EmprCod ;
   private short[] H01WZ3_A199BarPie1 ;
   private String[] H01WZ3_A365DisDes ;
   private int[] H01WZ3_A898BarPieNDes ;
   private int[] H01WZ5_A1923BarCodTN ;
   private byte[] H01WZ5_A213BarSit ;
   private int[] H01WZ5_A1235BarNumCli ;
   private String[] H01WZ5_A1234BarNomCli ;
   private int[] H01WZ5_A136BarColNum ;
   private String[] H01WZ5_A135BarColNom ;
   private String[] H01WZ5_A212BarSer ;
   private java.util.Date[] H01WZ5_A159BarFecGen ;
   private int[] H01WZ5_A252CliCod ;
   private boolean[] H01WZ5_n252CliCod ;
   private String[] H01WZ5_A120BarAgrEst ;
   private String[] H01WZ5_A13696BarNHdr ;
   private String[] H01WZ5_A2010BarTipDis ;
   private java.math.BigDecimal[] H01WZ5_A184BarMtr ;
   private java.math.BigDecimal[] H01WZ5_A166BarKgm ;
   private int[] H01WZ5_A129BarCod ;
   private byte[] H01WZ5_A132BarCodReo ;
   private String[] H01WZ5_A130BarCodPar ;
   private String[] H01WZ5_A143BarDisNum ;
   private String[] H01WZ5_A4812BarEncCli ;
   private String[] H01WZ5_A396EmprCod ;
   private short[] H01WZ5_A199BarPie1 ;
   private String[] H01WZ5_A365DisDes ;
   private int[] H01WZ5_A898BarPieNDes ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV5DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9[] ;
   private app.wwpbaseobjects.SdtWWPContext AV40WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext10[] ;
}

final  class seleccionhdrprompt__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01WZ3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV48TFBarFecGen ,
                                          java.util.Date AV49TFBarFecGen_To ,
                                          int AV63CliCodfrom ,
                                          java.util.Date A159BarFecGen ,
                                          int A252CliCod ,
                                          short AV14OrderedBy ,
                                          boolean AV15OrderedDsc ,
                                          String AV6FilterFullText ,
                                          String A2010BarTipDis ,
                                          String A13696BarNHdr ,
                                          String A120BarAgrEst ,
                                          String A13878PedidoClie ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          int A1235BarNumCli ,
                                          int A198BarPie ,
                                          java.math.BigDecimal A166BarKgm ,
                                          java.math.BigDecimal A184BarMtr ,
                                          byte A213BarSit ,
                                          byte AV60BarSitfrom ,
                                          byte AV59BarSit ,
                                          String AV64PedidoClientefrom ,
                                          String AV43InEmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[6];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T1.BarCodTN, T1.BarSit, T1.BarNumCli, T1.BarNomCli, T1.BarColNum, T1.BarColNom, T1.BarSer, T1.BarFecGen, T1.CliCod, T1.BarAgrEst, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990')," ;
      scmdbuf += " 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar AS BarNHdr, T1.BarTipDis, COALESCE( T2.BarMtr, 0) AS BarMtr, COALESCE( T2.BarKgm," ;
      scmdbuf += " 0) AS BarKgm, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarDisNum, T1.BarEncCli, T1.EmprCod, COALESCE( T2.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T2.BarPieNDes," ;
      scmdbuf += " 0) AS BarPieNDes FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm, SUM(BarPiePie)" ;
      scmdbuf += " AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV48TFBarFecGen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int11[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV49TFBarFecGen_To)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int11[4] = (byte)(1) ;
      }
      if ( ! (0==AV63CliCodfrom) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int11[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV14OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarFecGen, T1.BarSit" ;
      }
      else if ( ( AV14OrderedBy == 2 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarTipDis" ;
      }
      else if ( ( AV14OrderedBy == 2 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarTipDis DESC" ;
      }
      else if ( ( AV14OrderedBy == 3 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarAgrEst" ;
      }
      else if ( ( AV14OrderedBy == 3 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarAgrEst DESC" ;
      }
      else if ( ( AV14OrderedBy == 4 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV14OrderedBy == 4 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV14OrderedBy == 5 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecGen" ;
      }
      else if ( ( AV14OrderedBy == 5 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecGen DESC" ;
      }
      else if ( ( AV14OrderedBy == 6 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSer" ;
      }
      else if ( ( AV14OrderedBy == 6 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSer DESC" ;
      }
      else if ( ( AV14OrderedBy == 7 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNom" ;
      }
      else if ( ( AV14OrderedBy == 7 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNom DESC" ;
      }
      else if ( ( AV14OrderedBy == 8 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNum" ;
      }
      else if ( ( AV14OrderedBy == 8 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNum DESC" ;
      }
      else if ( ( AV14OrderedBy == 9 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarNomCli" ;
      }
      else if ( ( AV14OrderedBy == 9 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarNomCli DESC" ;
      }
      else if ( ( AV14OrderedBy == 10 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarNumCli" ;
      }
      else if ( ( AV14OrderedBy == 10 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarNumCli DESC" ;
      }
      else if ( ( AV14OrderedBy == 11 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSit" ;
      }
      else if ( ( AV14OrderedBy == 11 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSit DESC" ;
      }
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   protected Object[] conditional_H01WZ5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV48TFBarFecGen ,
                                          java.util.Date AV49TFBarFecGen_To ,
                                          int AV63CliCodfrom ,
                                          java.util.Date A159BarFecGen ,
                                          int A252CliCod ,
                                          short AV14OrderedBy ,
                                          boolean AV15OrderedDsc ,
                                          String AV6FilterFullText ,
                                          String A2010BarTipDis ,
                                          String A13696BarNHdr ,
                                          String A120BarAgrEst ,
                                          String A13878PedidoClie ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          int A1235BarNumCli ,
                                          int A198BarPie ,
                                          java.math.BigDecimal A166BarKgm ,
                                          java.math.BigDecimal A184BarMtr ,
                                          byte A213BarSit ,
                                          byte AV60BarSitfrom ,
                                          byte AV59BarSit ,
                                          String AV64PedidoClientefrom ,
                                          String AV43InEmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int13 = new byte[6];
      Object[] GXv_Object14 = new Object[2];
      scmdbuf = "SELECT T1.BarCodTN, T1.BarSit, T1.BarNumCli, T1.BarNomCli, T1.BarColNum, T1.BarColNom, T1.BarSer, T1.BarFecGen, T1.CliCod, T1.BarAgrEst, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990')," ;
      scmdbuf += " 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar AS BarNHdr, T1.BarTipDis, COALESCE( T2.BarMtr, 0) AS BarMtr, COALESCE( T2.BarKgm," ;
      scmdbuf += " 0) AS BarKgm, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarDisNum, T1.BarEncCli, T1.EmprCod, COALESCE( T2.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T2.BarPieNDes," ;
      scmdbuf += " 0) AS BarPieNDes FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm, SUM(BarPiePie)" ;
      scmdbuf += " AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV48TFBarFecGen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int13[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV49TFBarFecGen_To)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int13[4] = (byte)(1) ;
      }
      if ( ! (0==AV63CliCodfrom) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int13[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV14OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarFecGen, T1.BarSit" ;
      }
      else if ( ( AV14OrderedBy == 2 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarTipDis" ;
      }
      else if ( ( AV14OrderedBy == 2 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarTipDis DESC" ;
      }
      else if ( ( AV14OrderedBy == 3 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarAgrEst" ;
      }
      else if ( ( AV14OrderedBy == 3 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarAgrEst DESC" ;
      }
      else if ( ( AV14OrderedBy == 4 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV14OrderedBy == 4 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV14OrderedBy == 5 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecGen" ;
      }
      else if ( ( AV14OrderedBy == 5 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecGen DESC" ;
      }
      else if ( ( AV14OrderedBy == 6 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSer" ;
      }
      else if ( ( AV14OrderedBy == 6 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSer DESC" ;
      }
      else if ( ( AV14OrderedBy == 7 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNom" ;
      }
      else if ( ( AV14OrderedBy == 7 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNom DESC" ;
      }
      else if ( ( AV14OrderedBy == 8 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNum" ;
      }
      else if ( ( AV14OrderedBy == 8 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNum DESC" ;
      }
      else if ( ( AV14OrderedBy == 9 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarNomCli" ;
      }
      else if ( ( AV14OrderedBy == 9 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarNomCli DESC" ;
      }
      else if ( ( AV14OrderedBy == 10 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarNumCli" ;
      }
      else if ( ( AV14OrderedBy == 10 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarNumCli DESC" ;
      }
      else if ( ( AV14OrderedBy == 11 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSit" ;
      }
      else if ( ( AV14OrderedBy == 11 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSit DESC" ;
      }
      GXv_Object14[0] = scmdbuf ;
      GXv_Object14[1] = GXv_int13 ;
      return GXv_Object14 ;
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
                  return conditional_H01WZ3(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , (java.util.Date)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).shortValue() , ((Boolean) dynConstraints[6]).booleanValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] );
            case 1 :
                  return conditional_H01WZ5(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , (java.util.Date)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).shortValue() , ((Boolean) dynConstraints[6]).booleanValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01WZ3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01WZ5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((String[]) buf[11])[0] = rslt.getString(11, 11);
               ((String[]) buf[12])[0] = rslt.getString(12, 1);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,2);
               ((int[]) buf[15])[0] = rslt.getInt(15);
               ((byte[]) buf[16])[0] = rslt.getByte(16);
               ((String[]) buf[17])[0] = rslt.getString(17, 1);
               ((String[]) buf[18])[0] = rslt.getString(18, 8);
               ((String[]) buf[19])[0] = rslt.getString(19, 20);
               ((String[]) buf[20])[0] = rslt.getString(20, 3);
               ((short[]) buf[21])[0] = rslt.getShort(21);
               ((String[]) buf[22])[0] = rslt.getString(22, 1);
               ((int[]) buf[23])[0] = rslt.getInt(23);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((String[]) buf[11])[0] = rslt.getString(11, 11);
               ((String[]) buf[12])[0] = rslt.getString(12, 1);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,2);
               ((int[]) buf[15])[0] = rslt.getInt(15);
               ((byte[]) buf[16])[0] = rslt.getByte(16);
               ((String[]) buf[17])[0] = rslt.getString(17, 1);
               ((String[]) buf[18])[0] = rslt.getString(18, 8);
               ((String[]) buf[19])[0] = rslt.getString(19, 20);
               ((String[]) buf[20])[0] = rslt.getString(20, 3);
               ((short[]) buf[21])[0] = rslt.getShort(21);
               ((String[]) buf[22])[0] = rslt.getString(22, 1);
               ((int[]) buf[23])[0] = rslt.getInt(23);
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
                  stmt.setString(sIdx, (String)parms[6], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[7]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[8]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[9]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[10]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[7]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[8]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[9]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[10]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               return;
      }
   }

}

