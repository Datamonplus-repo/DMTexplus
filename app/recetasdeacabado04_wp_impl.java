package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class recetasdeacabado04_wp_impl extends GXDataArea
{
   public recetasdeacabado04_wp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public recetasdeacabado04_wp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recetasdeacabado04_wp_impl.class ));
   }

   public recetasdeacabado04_wp_impl( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavGrupodeacciones = new HTMLChoice();
   }

   public void initweb( )
   {
      initialize_properties( ) ;
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
         if ( ! entryPointCalled && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            AV6Emprcod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6Emprcod", AV6Emprcod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV7Barcod = (int)(GXutil.lval( httpContext.GetPar( "Barcod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7Barcod), 8, 0));
               AV8Barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Barcodreo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8Barcodreo", GXutil.str( AV8Barcodreo, 1, 0));
               AV5Barcodpar = httpContext.GetPar( "Barcodpar") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV5Barcodpar", AV5Barcodpar);
               Gx_mode = httpContext.GetPar( "Mode") ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               AV24Usurcod = httpContext.GetPar( "Usurcod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV24Usurcod", AV24Usurcod);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV24Usurcod, "@!"))));
               AV23Station = httpContext.GetPar( "Station") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV23Station", AV23Station);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV23Station, ""))));
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
      nRC_GXsfl_27 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_27"))) ;
      nGXsfl_27_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_27_idx"))) ;
      sGXsfl_27_idx = httpContext.GetPar( "sGXsfl_27_idx") ;
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
      AV6Emprcod = httpContext.GetPar( "Emprcod") ;
      AV7Barcod = (int)(GXutil.lval( httpContext.GetPar( "Barcod"))) ;
      AV8Barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Barcodreo"))) ;
      AV5Barcodpar = httpContext.GetPar( "Barcodpar") ;
      AV45TFBarNHdr = httpContext.GetPar( "TFBarNHdr") ;
      AV46TFBarNHdr_Sel = httpContext.GetPar( "TFBarNHdr_Sel") ;
      AV47TFRecLinMaq = (short)(GXutil.lval( httpContext.GetPar( "TFRecLinMaq"))) ;
      AV48TFRecLinMaq_To = (short)(GXutil.lval( httpContext.GetPar( "TFRecLinMaq_To"))) ;
      AV49TFMaqCod = httpContext.GetPar( "TFMaqCod") ;
      AV50TFMaqCod_Sel = httpContext.GetPar( "TFMaqCod_Sel") ;
      AV51TFRecVolPrd = (int)(GXutil.lval( httpContext.GetPar( "TFRecVolPrd"))) ;
      AV52TFRecVolPrd_To = (int)(GXutil.lval( httpContext.GetPar( "TFRecVolPrd_To"))) ;
      AV53TFRecFA = CommonUtil.decimalVal( httpContext.GetPar( "TFRecFA"), ".") ;
      AV54TFRecFA_To = CommonUtil.decimalVal( httpContext.GetPar( "TFRecFA_To"), ".") ;
      AV75Pgmname = httpContext.GetPar( "Pgmname") ;
      AV33OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV34OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV24Usurcod = httpContext.GetPar( "Usurcod") ;
      AV23Station = httpContext.GetPar( "Station") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV6Emprcod, AV7Barcod, AV8Barcodreo, AV5Barcodpar, AV45TFBarNHdr, AV46TFBarNHdr_Sel, AV47TFRecLinMaq, AV48TFRecLinMaq_To, AV49TFMaqCod, AV50TFMaqCod_Sel, AV51TFRecVolPrd, AV52TFRecVolPrd_To, AV53TFRecFA, AV54TFRecFA_To, AV75Pgmname, AV33OrderedBy, AV34OrderedDsc, AV24Usurcod, AV23Station, Gx_mode) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
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
      pa1HL2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1HL2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.recetasdeacabado04_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV6Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV7Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV8Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV5Barcodpar)),GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV24Usurcod)),GXutil.URLEncode(GXutil.rtrim(AV23Station))}, new String[] {"Emprcod","Barcod","Barcodreo","Barcodpar","Gx_mode","Usurcod","Station"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV75Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV24Usurcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV23Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_27", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_27, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV17GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV18GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV55DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV55DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARNHDR", GXutil.rtrim( AV45TFBarNHdr));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARNHDR_SEL", GXutil.rtrim( AV46TFBarNHdr_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECLINMAQ", GXutil.ltrim( localUtil.ntoc( AV47TFRecLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECLINMAQ_TO", GXutil.ltrim( localUtil.ntoc( AV48TFRecLinMaq_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQCOD", GXutil.rtrim( AV49TFMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQCOD_SEL", GXutil.rtrim( AV50TFMaqCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECVOLPRD", GXutil.ltrim( localUtil.ntoc( AV51TFRecVolPrd, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECVOLPRD_TO", GXutil.ltrim( localUtil.ntoc( AV52TFRecVolPrd_To, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECFA", GXutil.ltrim( localUtil.ntoc( AV53TFRecFA, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECFA_TO", GXutil.ltrim( localUtil.ntoc( AV54TFRecFA_To, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV75Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV75Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV33OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV34OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV6Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV7Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV8Barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV5Barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, "vIMPCOD", GXutil.rtrim( AV26ImpCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV24Usurcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV24Usurcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV23Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV23Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
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
         we1HL2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1HL2( ) ;
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
      return formatLink("app.recetasdeacabado04_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV6Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV7Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV8Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV5Barcodpar)),GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV24Usurcod)),GXutil.URLEncode(GXutil.rtrim(AV23Station))}, new String[] {"Emprcod","Barcod","Barcodreo","Barcodpar","Gx_mode","Usurcod","Station"})  ;
   }

   public String getPgmname( )
   {
      return "RecetasdeAcabado04_WP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Recetas de Acabado", "") ;
   }

   public void wb1HL0( )
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
         ucDvpanel_tableheader.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tableheader_Internalname, "DVPANEL_TABLEHEADERContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TABLEHEADERContainer"+"TableHeader"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableheader_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 27, 2, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RecetasdeAcabado04_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
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
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
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
         startgridcontrol27( ) ;
      }
      if ( wbEnd == 27 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_27 = (int)(nGXsfl_27_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV17GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV18GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, "GRIDPAGINATIONBARContainer");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV55DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         wb_table1_47_1HL2( true) ;
      }
      else
      {
         wb_table1_47_1HL2( false) ;
      }
      return  ;
   }

   public void wb_table1_47_1HL2e( boolean wbgen )
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
      if ( wbEnd == 27 )
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

   public void start1HL2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Recetas de Acabado", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1HL0( ) ;
   }

   public void ws1HL2( )
   {
      start1HL2( ) ;
      evt1HL2( ) ;
   }

   public void evt1HL2( )
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
                           e111HL2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e121HL2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e131HL2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e141HL2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e151HL2 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 22), "VGRUPODEACCIONES.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 22), "VGRUPODEACCIONES.CLICK") == 0 ) )
                        {
                           nGXsfl_27_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_27_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_27_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_272( ) ;
                           cmbavGrupodeacciones.setName( cmbavGrupodeacciones.getInternalname() );
                           cmbavGrupodeacciones.setValue( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()) );
                           AV19GrupodeAcciones = (short)(GXutil.lval( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGrupodeacciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19GrupodeAcciones), 4, 0));
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
                           A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
                           A2804RecLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( edtRecLinMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
                           A2805RecVolPrd = (int)(localUtil.ctol( httpContext.cgiGet( edtRecVolPrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A2806RecFA = localUtil.ctond( httpContext.cgiGet( edtRecFA_Internalname)) ;
                           A9812RecHdrLts = httpContext.cgiGet( edtRecHdrLts_Internalname) ;
                           n9812RecHdrLts = false ;
                           A9764RecLtsSR = (int)(localUtil.ctol( httpContext.cgiGet( edtRecLtsSR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n9764RecLtsSR = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e161HL2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e171HL2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e181HL2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRUPODEACCIONES.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e191HL2 ();
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
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we1HL2( )
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

   public void pa1HL2( )
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
      subsflControlProps_272( ) ;
      while ( nGXsfl_27_idx <= nRC_GXsfl_27 )
      {
         sendrow_272( ) ;
         nGXsfl_27_idx = ((subGrid_Islastpage==1)&&(nGXsfl_27_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_27_idx+1) ;
         sGXsfl_27_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_27_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_272( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV6Emprcod ,
                                 int AV7Barcod ,
                                 byte AV8Barcodreo ,
                                 String AV5Barcodpar ,
                                 String AV45TFBarNHdr ,
                                 String AV46TFBarNHdr_Sel ,
                                 short AV47TFRecLinMaq ,
                                 short AV48TFRecLinMaq_To ,
                                 String AV49TFMaqCod ,
                                 String AV50TFMaqCod_Sel ,
                                 int AV51TFRecVolPrd ,
                                 int AV52TFRecVolPrd_To ,
                                 java.math.BigDecimal AV53TFRecFA ,
                                 java.math.BigDecimal AV54TFRecFA_To ,
                                 String AV75Pgmname ,
                                 short AV33OrderedBy ,
                                 boolean AV34OrderedDsc ,
                                 String AV24Usurcod ,
                                 String AV23Station ,
                                 String Gx_mode )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e171HL2 ();
      GRID_nCurrentRecord = 0 ;
      rf1HL2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARNHDR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A13696BarNHdr, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "BARNHDR", GXutil.rtrim( A13696BarNHdr));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A130BarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR", GXutil.rtrim( A130BarCodPar));
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
      rf1HL2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV75Pgmname = "RecetasdeAcabado04_WP" ;
      Gx_err = (short)(0) ;
   }

   public void rf1HL2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(27) ;
      /* Execute user event: Refresh */
      e171HL2 ();
      nGXsfl_27_idx = 1 ;
      sGXsfl_27_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_27_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_272( ) ;
      bGXsfl_27_Refreshing = true ;
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
         subsflControlProps_272( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV61Recetasdeacabado04_wpds_2_tfbarnhdr_sel ,
                                              AV60Recetasdeacabado04_wpds_1_tfbarnhdr ,
                                              Short.valueOf(AV62Recetasdeacabado04_wpds_3_tfreclinmaq) ,
                                              Short.valueOf(AV63Recetasdeacabado04_wpds_4_tfreclinmaq_to) ,
                                              AV65Recetasdeacabado04_wpds_6_tfmaqcod_sel ,
                                              AV64Recetasdeacabado04_wpds_5_tfmaqcod ,
                                              Integer.valueOf(AV66Recetasdeacabado04_wpds_7_tfrecvolprd) ,
                                              Integer.valueOf(AV67Recetasdeacabado04_wpds_8_tfrecvolprd_to) ,
                                              AV68Recetasdeacabado04_wpds_9_tfrecfa ,
                                              AV69Recetasdeacabado04_wpds_10_tfrecfa_to ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar ,
                                              Short.valueOf(A2804RecLinMaq) ,
                                              A602MaqCod ,
                                              Integer.valueOf(A2805RecVolPrd) ,
                                              A2806RecFA ,
                                              Short.valueOf(AV33OrderedBy) ,
                                              Boolean.valueOf(AV34OrderedDsc) ,
                                              A6039RecAcab ,
                                              AV6Emprcod ,
                                              Integer.valueOf(AV7Barcod) ,
                                              Byte.valueOf(AV8Barcodreo) ,
                                              AV5Barcodpar ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                              TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV60Recetasdeacabado04_wpds_1_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV60Recetasdeacabado04_wpds_1_tfbarnhdr), 11, "%") ;
         lV64Recetasdeacabado04_wpds_5_tfmaqcod = GXutil.padr( GXutil.rtrim( AV64Recetasdeacabado04_wpds_5_tfmaqcod), 6, "%") ;
         /* Using cursor H01HL2 */
         pr_default.execute(0, new Object[] {AV6Emprcod, Integer.valueOf(AV7Barcod), Byte.valueOf(AV8Barcodreo), AV5Barcodpar, lV60Recetasdeacabado04_wpds_1_tfbarnhdr, AV61Recetasdeacabado04_wpds_2_tfbarnhdr_sel, Short.valueOf(AV62Recetasdeacabado04_wpds_3_tfreclinmaq), Short.valueOf(AV63Recetasdeacabado04_wpds_4_tfreclinmaq_to), lV64Recetasdeacabado04_wpds_5_tfmaqcod, AV65Recetasdeacabado04_wpds_6_tfmaqcod_sel, Integer.valueOf(AV66Recetasdeacabado04_wpds_7_tfrecvolprd), Integer.valueOf(AV67Recetasdeacabado04_wpds_8_tfrecvolprd_to), AV68Recetasdeacabado04_wpds_9_tfrecfa, AV69Recetasdeacabado04_wpds_10_tfrecfa_to, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_27_idx = 1 ;
         sGXsfl_27_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_27_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_272( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A6039RecAcab = H01HL2_A6039RecAcab[0] ;
            n6039RecAcab = H01HL2_n6039RecAcab[0] ;
            A9764RecLtsSR = H01HL2_A9764RecLtsSR[0] ;
            n9764RecLtsSR = H01HL2_n9764RecLtsSR[0] ;
            A9812RecHdrLts = H01HL2_A9812RecHdrLts[0] ;
            n9812RecHdrLts = H01HL2_n9812RecHdrLts[0] ;
            A2806RecFA = H01HL2_A2806RecFA[0] ;
            A2805RecVolPrd = H01HL2_A2805RecVolPrd[0] ;
            A602MaqCod = H01HL2_A602MaqCod[0] ;
            A2804RecLinMaq = H01HL2_A2804RecLinMaq[0] ;
            A396EmprCod = H01HL2_A396EmprCod[0] ;
            A130BarCodPar = H01HL2_A130BarCodPar[0] ;
            A132BarCodReo = H01HL2_A132BarCodReo[0] ;
            A129BarCod = H01HL2_A129BarCod[0] ;
            A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
            e181HL2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(27) ;
         wb1HL0( ) ;
      }
      bGXsfl_27_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1HL2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV75Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV75Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARNHDR"+"_"+sGXsfl_27_idx, getSecureSignedToken( sGXsfl_27_idx, GXutil.rtrim( localUtil.format( A13696BarNHdr, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD"+"_"+sGXsfl_27_idx, getSecureSignedToken( sGXsfl_27_idx, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCOD"+"_"+sGXsfl_27_idx, getSecureSignedToken( sGXsfl_27_idx, localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCODREO"+"_"+sGXsfl_27_idx, getSecureSignedToken( sGXsfl_27_idx, localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCODPAR"+"_"+sGXsfl_27_idx, getSecureSignedToken( sGXsfl_27_idx, GXutil.rtrim( localUtil.format( A130BarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV24Usurcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV24Usurcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV23Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV23Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
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
      AV60Recetasdeacabado04_wpds_1_tfbarnhdr = AV45TFBarNHdr ;
      AV61Recetasdeacabado04_wpds_2_tfbarnhdr_sel = AV46TFBarNHdr_Sel ;
      AV62Recetasdeacabado04_wpds_3_tfreclinmaq = AV47TFRecLinMaq ;
      AV63Recetasdeacabado04_wpds_4_tfreclinmaq_to = AV48TFRecLinMaq_To ;
      AV64Recetasdeacabado04_wpds_5_tfmaqcod = AV49TFMaqCod ;
      AV65Recetasdeacabado04_wpds_6_tfmaqcod_sel = AV50TFMaqCod_Sel ;
      AV66Recetasdeacabado04_wpds_7_tfrecvolprd = AV51TFRecVolPrd ;
      AV67Recetasdeacabado04_wpds_8_tfrecvolprd_to = AV52TFRecVolPrd_To ;
      AV68Recetasdeacabado04_wpds_9_tfrecfa = AV53TFRecFA ;
      AV69Recetasdeacabado04_wpds_10_tfrecfa_to = AV54TFRecFA_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV61Recetasdeacabado04_wpds_2_tfbarnhdr_sel ,
                                           AV60Recetasdeacabado04_wpds_1_tfbarnhdr ,
                                           Short.valueOf(AV62Recetasdeacabado04_wpds_3_tfreclinmaq) ,
                                           Short.valueOf(AV63Recetasdeacabado04_wpds_4_tfreclinmaq_to) ,
                                           AV65Recetasdeacabado04_wpds_6_tfmaqcod_sel ,
                                           AV64Recetasdeacabado04_wpds_5_tfmaqcod ,
                                           Integer.valueOf(AV66Recetasdeacabado04_wpds_7_tfrecvolprd) ,
                                           Integer.valueOf(AV67Recetasdeacabado04_wpds_8_tfrecvolprd_to) ,
                                           AV68Recetasdeacabado04_wpds_9_tfrecfa ,
                                           AV69Recetasdeacabado04_wpds_10_tfrecfa_to ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           A602MaqCod ,
                                           Integer.valueOf(A2805RecVolPrd) ,
                                           A2806RecFA ,
                                           Short.valueOf(AV33OrderedBy) ,
                                           Boolean.valueOf(AV34OrderedDsc) ,
                                           A6039RecAcab ,
                                           AV6Emprcod ,
                                           Integer.valueOf(AV7Barcod) ,
                                           Byte.valueOf(AV8Barcodreo) ,
                                           AV5Barcodpar ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV60Recetasdeacabado04_wpds_1_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV60Recetasdeacabado04_wpds_1_tfbarnhdr), 11, "%") ;
      lV64Recetasdeacabado04_wpds_5_tfmaqcod = GXutil.padr( GXutil.rtrim( AV64Recetasdeacabado04_wpds_5_tfmaqcod), 6, "%") ;
      /* Using cursor H01HL3 */
      pr_default.execute(1, new Object[] {AV6Emprcod, Integer.valueOf(AV7Barcod), Byte.valueOf(AV8Barcodreo), AV5Barcodpar, lV60Recetasdeacabado04_wpds_1_tfbarnhdr, AV61Recetasdeacabado04_wpds_2_tfbarnhdr_sel, Short.valueOf(AV62Recetasdeacabado04_wpds_3_tfreclinmaq), Short.valueOf(AV63Recetasdeacabado04_wpds_4_tfreclinmaq_to), lV64Recetasdeacabado04_wpds_5_tfmaqcod, AV65Recetasdeacabado04_wpds_6_tfmaqcod_sel, Integer.valueOf(AV66Recetasdeacabado04_wpds_7_tfrecvolprd), Integer.valueOf(AV67Recetasdeacabado04_wpds_8_tfrecvolprd_to), AV68Recetasdeacabado04_wpds_9_tfrecfa, AV69Recetasdeacabado04_wpds_10_tfrecfa_to});
      GRID_nRecordCount = H01HL3_AGRID_nRecordCount[0] ;
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
      AV60Recetasdeacabado04_wpds_1_tfbarnhdr = AV45TFBarNHdr ;
      AV61Recetasdeacabado04_wpds_2_tfbarnhdr_sel = AV46TFBarNHdr_Sel ;
      AV62Recetasdeacabado04_wpds_3_tfreclinmaq = AV47TFRecLinMaq ;
      AV63Recetasdeacabado04_wpds_4_tfreclinmaq_to = AV48TFRecLinMaq_To ;
      AV64Recetasdeacabado04_wpds_5_tfmaqcod = AV49TFMaqCod ;
      AV65Recetasdeacabado04_wpds_6_tfmaqcod_sel = AV50TFMaqCod_Sel ;
      AV66Recetasdeacabado04_wpds_7_tfrecvolprd = AV51TFRecVolPrd ;
      AV67Recetasdeacabado04_wpds_8_tfrecvolprd_to = AV52TFRecVolPrd_To ;
      AV68Recetasdeacabado04_wpds_9_tfrecfa = AV53TFRecFA ;
      AV69Recetasdeacabado04_wpds_10_tfrecfa_to = AV54TFRecFA_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV6Emprcod, AV7Barcod, AV8Barcodreo, AV5Barcodpar, AV45TFBarNHdr, AV46TFBarNHdr_Sel, AV47TFRecLinMaq, AV48TFRecLinMaq_To, AV49TFMaqCod, AV50TFMaqCod_Sel, AV51TFRecVolPrd, AV52TFRecVolPrd_To, AV53TFRecFA, AV54TFRecFA_To, AV75Pgmname, AV33OrderedBy, AV34OrderedDsc, AV24Usurcod, AV23Station, Gx_mode) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV60Recetasdeacabado04_wpds_1_tfbarnhdr = AV45TFBarNHdr ;
      AV61Recetasdeacabado04_wpds_2_tfbarnhdr_sel = AV46TFBarNHdr_Sel ;
      AV62Recetasdeacabado04_wpds_3_tfreclinmaq = AV47TFRecLinMaq ;
      AV63Recetasdeacabado04_wpds_4_tfreclinmaq_to = AV48TFRecLinMaq_To ;
      AV64Recetasdeacabado04_wpds_5_tfmaqcod = AV49TFMaqCod ;
      AV65Recetasdeacabado04_wpds_6_tfmaqcod_sel = AV50TFMaqCod_Sel ;
      AV66Recetasdeacabado04_wpds_7_tfrecvolprd = AV51TFRecVolPrd ;
      AV67Recetasdeacabado04_wpds_8_tfrecvolprd_to = AV52TFRecVolPrd_To ;
      AV68Recetasdeacabado04_wpds_9_tfrecfa = AV53TFRecFA ;
      AV69Recetasdeacabado04_wpds_10_tfrecfa_to = AV54TFRecFA_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV6Emprcod, AV7Barcod, AV8Barcodreo, AV5Barcodpar, AV45TFBarNHdr, AV46TFBarNHdr_Sel, AV47TFRecLinMaq, AV48TFRecLinMaq_To, AV49TFMaqCod, AV50TFMaqCod_Sel, AV51TFRecVolPrd, AV52TFRecVolPrd_To, AV53TFRecFA, AV54TFRecFA_To, AV75Pgmname, AV33OrderedBy, AV34OrderedDsc, AV24Usurcod, AV23Station, Gx_mode) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV60Recetasdeacabado04_wpds_1_tfbarnhdr = AV45TFBarNHdr ;
      AV61Recetasdeacabado04_wpds_2_tfbarnhdr_sel = AV46TFBarNHdr_Sel ;
      AV62Recetasdeacabado04_wpds_3_tfreclinmaq = AV47TFRecLinMaq ;
      AV63Recetasdeacabado04_wpds_4_tfreclinmaq_to = AV48TFRecLinMaq_To ;
      AV64Recetasdeacabado04_wpds_5_tfmaqcod = AV49TFMaqCod ;
      AV65Recetasdeacabado04_wpds_6_tfmaqcod_sel = AV50TFMaqCod_Sel ;
      AV66Recetasdeacabado04_wpds_7_tfrecvolprd = AV51TFRecVolPrd ;
      AV67Recetasdeacabado04_wpds_8_tfrecvolprd_to = AV52TFRecVolPrd_To ;
      AV68Recetasdeacabado04_wpds_9_tfrecfa = AV53TFRecFA ;
      AV69Recetasdeacabado04_wpds_10_tfrecfa_to = AV54TFRecFA_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV6Emprcod, AV7Barcod, AV8Barcodreo, AV5Barcodpar, AV45TFBarNHdr, AV46TFBarNHdr_Sel, AV47TFRecLinMaq, AV48TFRecLinMaq_To, AV49TFMaqCod, AV50TFMaqCod_Sel, AV51TFRecVolPrd, AV52TFRecVolPrd_To, AV53TFRecFA, AV54TFRecFA_To, AV75Pgmname, AV33OrderedBy, AV34OrderedDsc, AV24Usurcod, AV23Station, Gx_mode) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV60Recetasdeacabado04_wpds_1_tfbarnhdr = AV45TFBarNHdr ;
      AV61Recetasdeacabado04_wpds_2_tfbarnhdr_sel = AV46TFBarNHdr_Sel ;
      AV62Recetasdeacabado04_wpds_3_tfreclinmaq = AV47TFRecLinMaq ;
      AV63Recetasdeacabado04_wpds_4_tfreclinmaq_to = AV48TFRecLinMaq_To ;
      AV64Recetasdeacabado04_wpds_5_tfmaqcod = AV49TFMaqCod ;
      AV65Recetasdeacabado04_wpds_6_tfmaqcod_sel = AV50TFMaqCod_Sel ;
      AV66Recetasdeacabado04_wpds_7_tfrecvolprd = AV51TFRecVolPrd ;
      AV67Recetasdeacabado04_wpds_8_tfrecvolprd_to = AV52TFRecVolPrd_To ;
      AV68Recetasdeacabado04_wpds_9_tfrecfa = AV53TFRecFA ;
      AV69Recetasdeacabado04_wpds_10_tfrecfa_to = AV54TFRecFA_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV6Emprcod, AV7Barcod, AV8Barcodreo, AV5Barcodpar, AV45TFBarNHdr, AV46TFBarNHdr_Sel, AV47TFRecLinMaq, AV48TFRecLinMaq_To, AV49TFMaqCod, AV50TFMaqCod_Sel, AV51TFRecVolPrd, AV52TFRecVolPrd_To, AV53TFRecFA, AV54TFRecFA_To, AV75Pgmname, AV33OrderedBy, AV34OrderedDsc, AV24Usurcod, AV23Station, Gx_mode) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV60Recetasdeacabado04_wpds_1_tfbarnhdr = AV45TFBarNHdr ;
      AV61Recetasdeacabado04_wpds_2_tfbarnhdr_sel = AV46TFBarNHdr_Sel ;
      AV62Recetasdeacabado04_wpds_3_tfreclinmaq = AV47TFRecLinMaq ;
      AV63Recetasdeacabado04_wpds_4_tfreclinmaq_to = AV48TFRecLinMaq_To ;
      AV64Recetasdeacabado04_wpds_5_tfmaqcod = AV49TFMaqCod ;
      AV65Recetasdeacabado04_wpds_6_tfmaqcod_sel = AV50TFMaqCod_Sel ;
      AV66Recetasdeacabado04_wpds_7_tfrecvolprd = AV51TFRecVolPrd ;
      AV67Recetasdeacabado04_wpds_8_tfrecvolprd_to = AV52TFRecVolPrd_To ;
      AV68Recetasdeacabado04_wpds_9_tfrecfa = AV53TFRecFA ;
      AV69Recetasdeacabado04_wpds_10_tfrecfa_to = AV54TFRecFA_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV6Emprcod, AV7Barcod, AV8Barcodreo, AV5Barcodpar, AV45TFBarNHdr, AV46TFBarNHdr_Sel, AV47TFRecLinMaq, AV48TFRecLinMaq_To, AV49TFMaqCod, AV50TFMaqCod_Sel, AV51TFRecVolPrd, AV52TFRecVolPrd_To, AV53TFRecFA, AV54TFRecFA_To, AV75Pgmname, AV33OrderedBy, AV34OrderedDsc, AV24Usurcod, AV23Station, Gx_mode) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV75Pgmname = "RecetasdeAcabado04_WP" ;
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup1HL0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e161HL2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV55DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_27 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_27"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV17GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV18GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
         Dvelop_confirmpanel_eliminar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Title") ;
         Dvelop_confirmpanel_eliminar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext") ;
         Dvelop_confirmpanel_eliminar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_eliminar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( "GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( "DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( "DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( "DDO_GRID_Selectedcolumn") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( "DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( "DDO_GRID_Filteredtextto_get") ;
         Dvelop_confirmpanel_eliminar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Result") ;
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
      e161HL2 ();
      if (returnInSub) return;
   }

   public void e161HL2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV23Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      recetasdeacabado04_wp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV23Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Station", AV23Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV23Station, ""))));
      GXv_char2[0] = AV6Emprcod ;
      GXv_char3[0] = AV59Emprnom ;
      GXv_char4[0] = AV24Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV23Station, GXv_char2, GXv_char3, GXv_char4) ;
      recetasdeacabado04_wp_impl.this.AV6Emprcod = GXv_char2[0] ;
      recetasdeacabado04_wp_impl.this.AV59Emprnom = GXv_char3[0] ;
      recetasdeacabado04_wp_impl.this.AV24Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Emprcod", AV6Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV24Usurcod", AV24Usurcod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV24Usurcod, "@!"))));
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( "Recetas de Acabado", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      if ( AV33OrderedBy < 1 )
      {
         AV33OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV55DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV55DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e171HL2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV28WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV28WWPContext = GXv_SdtWWPContext7[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      AV17GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17GridCurrentPage), 10, 0));
      AV18GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18GridPageCount), 10, 0));
      AV60Recetasdeacabado04_wpds_1_tfbarnhdr = AV45TFBarNHdr ;
      AV61Recetasdeacabado04_wpds_2_tfbarnhdr_sel = AV46TFBarNHdr_Sel ;
      AV62Recetasdeacabado04_wpds_3_tfreclinmaq = AV47TFRecLinMaq ;
      AV63Recetasdeacabado04_wpds_4_tfreclinmaq_to = AV48TFRecLinMaq_To ;
      AV64Recetasdeacabado04_wpds_5_tfmaqcod = AV49TFMaqCod ;
      AV65Recetasdeacabado04_wpds_6_tfmaqcod_sel = AV50TFMaqCod_Sel ;
      AV66Recetasdeacabado04_wpds_7_tfrecvolprd = AV51TFRecVolPrd ;
      AV67Recetasdeacabado04_wpds_8_tfrecvolprd_to = AV52TFRecVolPrd_To ;
      AV68Recetasdeacabado04_wpds_9_tfrecfa = AV53TFRecFA ;
      AV69Recetasdeacabado04_wpds_10_tfrecfa_to = AV54TFRecFA_To ;
      /*  Sending Event outputs  */
   }

   public void e111HL2( )
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

   public void e121HL2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e131HL2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV33OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33OrderedBy), 4, 0));
         AV34OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34OrderedDsc", AV34OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarNHdr") == 0 )
         {
            AV45TFBarNHdr = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFBarNHdr", AV45TFBarNHdr);
            AV46TFBarNHdr_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFBarNHdr_Sel", AV46TFBarNHdr_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecLinMaq") == 0 )
         {
            AV47TFRecLinMaq = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFRecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFRecLinMaq), 4, 0));
            AV48TFRecLinMaq_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFRecLinMaq_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFRecLinMaq_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MaqCod") == 0 )
         {
            AV49TFMaqCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFMaqCod", AV49TFMaqCod);
            AV50TFMaqCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFMaqCod_Sel", AV50TFMaqCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecVolPrd") == 0 )
         {
            AV51TFRecVolPrd = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFRecVolPrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51TFRecVolPrd), 5, 0));
            AV52TFRecVolPrd_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFRecVolPrd_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52TFRecVolPrd_To), 5, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecFA") == 0 )
         {
            AV53TFRecFA = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFRecFA", GXutil.ltrimstr( AV53TFRecFA, 6, 2));
            AV54TFRecFA_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFRecFA_To", GXutil.ltrimstr( AV54TFRecFA_To, 6, 2));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e181HL2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGrupodeacciones.removeAllItems();
      cmbavGrupodeacciones.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGrupodeacciones.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Modificar", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGrupodeacciones.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "Eliminar", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      cmbavGrupodeacciones.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "Imprimir", ""), "fas fa-file-powerpoint", "", "", "", "", "", "", ""), (short)(0));
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(27) ;
      }
      sendrow_272( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_27_Refreshing )
      {
         httpContext.doAjaxLoad(27, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGrupodeacciones.setValue( GXutil.trim( GXutil.str( AV19GrupodeAcciones, 4, 0)) );
   }

   public void e191HL2( )
   {
      /* Grupodeacciones_Click Routine */
      returnInSub = false ;
      if ( AV19GrupodeAcciones == 1 )
      {
         /* Execute user subroutine: 'DO MODIFICAR' */
         S152 ();
         if (returnInSub) return;
      }
      else if ( AV19GrupodeAcciones == 2 )
      {
         /* Execute user subroutine: 'DO ELIMINAR' */
         S162 ();
         if (returnInSub) return;
      }
      else if ( AV19GrupodeAcciones == 3 )
      {
         /* Execute user subroutine: 'DO IMPRIMIR' */
         S172 ();
         if (returnInSub) return;
      }
      AV19GrupodeAcciones = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGrupodeacciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19GrupodeAcciones), 4, 0));
      /*  Sending Event outputs  */
      cmbavGrupodeacciones.setValue( GXutil.trim( GXutil.str( AV19GrupodeAcciones, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGrupodeacciones.getInternalname(), "Values", cmbavGrupodeacciones.ToJavascriptSource(), true);
   }

   public void e141HL2( )
   {
      /* Dvelop_confirmpanel_eliminar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINAR' */
         S182 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e151HL2( )
   {
      /* 'DoCerrar' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {AV6Emprcod,Integer.valueOf(AV7Barcod),Byte.valueOf(AV8Barcodreo),AV5Barcodpar,Gx_mode,AV24Usurcod,AV23Station});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV6Emprcod","AV7Barcod","AV8Barcodreo","AV5Barcodpar","Gx_mode","AV24Usurcod","AV23Station"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S132( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV33OrderedBy, 4, 0))+":"+(AV34OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S152( )
   {
      /* 'DO MODIFICAR' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.formulaciontinte.recetadeacabados02_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV6Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV7Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV8Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV5Barcodpar)),GXutil.URLEncode(GXutil.ltrimstr(A2804RecLinMaq,4,0)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "UPD", "")))}, new String[] {"Emprcod","Barcod","Barcodreo","Barcodpar","RecLinMaq","Mode"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S162( )
   {
      /* 'DO ELIMINAR' Routine */
      returnInSub = false ;
      Dvelop_confirmpanel_eliminar_Confirmationtext = httpContext.getMessage( "Desea eliminar la receta ", "")+GXutil.trim( A13696BarNHdr)+" / "+GXutil.trim( GXutil.str( A2804RecLinMaq, 4, 0))+"?" ;
      ucDvelop_confirmpanel_eliminar.sendProperty(context, "", false, Dvelop_confirmpanel_eliminar_Internalname, "ConfirmationText", Dvelop_confirmpanel_eliminar_Confirmationtext);
      AV70Emprcod_selected = A396EmprCod ;
      AV71Barcod_selected = A129BarCod ;
      AV72Barcodreo_selected = A132BarCodReo ;
      AV73Barcodpar_selected = A130BarCodPar ;
      AV74Reclinmaq_selected = A2804RecLinMaq ;
      this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ELIMINARContainer", "Confirm", "", new Object[] {});
   }

   public void S182( )
   {
      /* 'DO ACTION ELIMINAR' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV6Emprcod ;
      GXv_char3[0] = A9812RecHdrLts ;
      GXv_int8[0] = A9764RecLtsSR ;
      new app.prac105(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int8) ;
      recetasdeacabado04_wp_impl.this.AV6Emprcod = GXv_char4[0] ;
      recetasdeacabado04_wp_impl.this.A9812RecHdrLts = GXv_char3[0] ;
      recetasdeacabado04_wp_impl.this.A9764RecLtsSR = GXv_int8[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Emprcod", AV6Emprcod);
      GXv_char4[0] = AV6Emprcod ;
      GXv_int8[0] = AV7Barcod ;
      GXv_int9[0] = AV8Barcodreo ;
      GXv_char3[0] = AV5Barcodpar ;
      GXv_int10[0] = A2804RecLinMaq ;
      new app.pbajrec(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int9, GXv_char3, GXv_int10) ;
      recetasdeacabado04_wp_impl.this.AV6Emprcod = GXv_char4[0] ;
      recetasdeacabado04_wp_impl.this.AV7Barcod = GXv_int8[0] ;
      recetasdeacabado04_wp_impl.this.AV8Barcodreo = GXv_int9[0] ;
      recetasdeacabado04_wp_impl.this.AV5Barcodpar = GXv_char3[0] ;
      recetasdeacabado04_wp_impl.this.A2804RecLinMaq = GXv_int10[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Emprcod", AV6Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV7Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7Barcod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV8Barcodreo", GXutil.str( AV8Barcodreo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV5Barcodpar", AV5Barcodpar);
      GXv_char4[0] = AV6Emprcod ;
      GXv_int8[0] = AV7Barcod ;
      GXv_int9[0] = AV8Barcodreo ;
      GXv_char3[0] = AV5Barcodpar ;
      GXv_int10[0] = A2804RecLinMaq ;
      new app.pdelrec3(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int9, GXv_char3, GXv_int10) ;
      recetasdeacabado04_wp_impl.this.AV6Emprcod = GXv_char4[0] ;
      recetasdeacabado04_wp_impl.this.AV7Barcod = GXv_int8[0] ;
      recetasdeacabado04_wp_impl.this.AV8Barcodreo = GXv_int9[0] ;
      recetasdeacabado04_wp_impl.this.AV5Barcodpar = GXv_char3[0] ;
      recetasdeacabado04_wp_impl.this.A2804RecLinMaq = GXv_int10[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Emprcod", AV6Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV7Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7Barcod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV8Barcodreo", GXutil.str( AV8Barcodreo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV5Barcodpar", AV5Barcodpar);
      AV22Inc_obs = httpContext.getMessage( "Eliminacion RECETA QUIMICA DE ACABADO", "") + GXutil.newLine( ) ;
      new app.pctrinc(remoteHandle, context).execute( AV6Emprcod, GXutil.substring( AV75Pgmname, 1, 10), AV24Usurcod, AV23Station, AV22Inc_obs, AV7Barcod, AV8Barcodreo, AV5Barcodpar) ;
      httpContext.doAjaxRefresh();
   }

   public void S172( )
   {
      /* 'DO IMPRIMIR' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.rrac006", new String[] {GXutil.URLEncode(GXutil.rtrim(AV6Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV7Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV8Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV5Barcodpar)),GXutil.URLEncode(GXutil.rtrim(A602MaqCod)),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.ltrimstr(A2805RecVolPrd,5,0)),GXutil.URLEncode(GXutil.ltrimstr(A2804RecLinMaq,4,0)),GXutil.URLEncode(GXutil.rtrim(AV26ImpCod)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "PRN", "")))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","BarMaqCod","BarSua","Volumen","RecLinMaq","ImpCod","Output"}) , new Object[] {"AV6Emprcod","AV7Barcod","AV8Barcodreo","AV5Barcodpar","A602MaqCod","","A2805RecVolPrd","A2804RecLinMaq","AV26ImpCod",""});
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV41Session.getValue(AV75Pgmname+"GridState"), "") == 0 )
      {
         AV31GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV75Pgmname+"GridState"), null, null);
      }
      else
      {
         AV31GridState.fromxml(AV41Session.getValue(AV75Pgmname+"GridState"), null, null);
      }
      AV33OrderedBy = AV31GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33OrderedBy), 4, 0));
      AV34OrderedDsc = AV31GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34OrderedDsc", AV34OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S132 ();
      if (returnInSub) return;
      AV76GXV1 = 1 ;
      while ( AV76GXV1 <= AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV32GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV76GXV1));
         if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV45TFBarNHdr = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFBarNHdr", AV45TFBarNHdr);
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV46TFBarNHdr_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFBarNHdr_Sel", AV46TFBarNHdr_Sel);
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINMAQ") == 0 )
         {
            AV47TFRecLinMaq = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFRecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFRecLinMaq), 4, 0));
            AV48TFRecLinMaq_To = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFRecLinMaq_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFRecLinMaq_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV49TFMaqCod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFMaqCod", AV49TFMaqCod);
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV50TFMaqCod_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFMaqCod_Sel", AV50TFMaqCod_Sel);
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECVOLPRD") == 0 )
         {
            AV51TFRecVolPrd = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFRecVolPrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51TFRecVolPrd), 5, 0));
            AV52TFRecVolPrd_To = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFRecVolPrd_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52TFRecVolPrd_To), 5, 0));
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECFA") == 0 )
         {
            AV53TFRecFA = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFRecFA", GXutil.ltrimstr( AV53TFRecFA, 6, 2));
            AV54TFRecFA_To = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFRecFA_To", GXutil.ltrimstr( AV54TFRecFA_To, 6, 2));
         }
         AV76GXV1 = (int)(AV76GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV46TFBarNHdr_Sel)==0), AV46TFBarNHdr_Sel, GXv_char4) ;
      recetasdeacabado04_wp_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char11 = "" ;
      GXv_char3[0] = GXt_char11 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV50TFMaqCod_Sel)==0), AV50TFMaqCod_Sel, GXv_char3) ;
      recetasdeacabado04_wp_impl.this.GXt_char11 = GXv_char3[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"||"+GXt_char11+"||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char11 = "" ;
      GXv_char4[0] = GXt_char11 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV45TFBarNHdr)==0), AV45TFBarNHdr, GXv_char4) ;
      recetasdeacabado04_wp_impl.this.GXt_char11 = GXv_char4[0] ;
      GXt_char1 = "" ;
      GXv_char3[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV49TFMaqCod)==0), AV49TFMaqCod, GXv_char3) ;
      recetasdeacabado04_wp_impl.this.GXt_char1 = GXv_char3[0] ;
      Ddo_grid_Filteredtext_set = GXt_char11+"|"+((0==AV47TFRecLinMaq) ? "" : GXutil.str( AV47TFRecLinMaq, 4, 0))+"|"+GXt_char1+"|"+((0==AV51TFRecVolPrd) ? "" : GXutil.str( AV51TFRecVolPrd, 5, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFRecFA)==0) ? "" : GXutil.str( AV53TFRecFA, 6, 2)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|"+((0==AV48TFRecLinMaq_To) ? "" : GXutil.str( AV48TFRecLinMaq_To, 4, 0))+"||"+((0==AV52TFRecVolPrd_To) ? "" : GXutil.str( AV52TFRecVolPrd_To, 5, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV54TFRecFA_To)==0) ? "" : GXutil.str( AV54TFRecFA_To, 6, 2)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
      if ( ! (GXutil.strcmp("", GXutil.trim( AV31GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV31GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV31GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S142( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV31GridState.fromxml(AV41Session.getValue(AV75Pgmname+"GridState"), null, null);
      AV31GridState.setgxTv_SdtWWPGridState_Orderedby( AV33OrderedBy );
      AV31GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV34OrderedDsc );
      AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState12[0] = AV31GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFBARNHDR", "", !(GXutil.strcmp("", AV45TFBarNHdr)==0), (short)(0), AV45TFBarNHdr, "", !(GXutil.strcmp("", AV46TFBarNHdr_Sel)==0), AV46TFBarNHdr_Sel, "") ;
      AV31GridState = GXv_SdtWWPGridState12[0] ;
      GXv_SdtWWPGridState12[0] = AV31GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFRECLINMAQ", "", !((0==AV47TFRecLinMaq)&&(0==AV48TFRecLinMaq_To)), (short)(0), GXutil.trim( GXutil.str( AV47TFRecLinMaq, 4, 0)), GXutil.trim( GXutil.str( AV48TFRecLinMaq_To, 4, 0))) ;
      AV31GridState = GXv_SdtWWPGridState12[0] ;
      GXv_SdtWWPGridState12[0] = AV31GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFMAQCOD", "", !(GXutil.strcmp("", AV49TFMaqCod)==0), (short)(0), AV49TFMaqCod, "", !(GXutil.strcmp("", AV50TFMaqCod_Sel)==0), AV50TFMaqCod_Sel, "") ;
      AV31GridState = GXv_SdtWWPGridState12[0] ;
      GXv_SdtWWPGridState12[0] = AV31GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFRECVOLPRD", "", !((0==AV51TFRecVolPrd)&&(0==AV52TFRecVolPrd_To)), (short)(0), GXutil.trim( GXutil.str( AV51TFRecVolPrd, 5, 0)), GXutil.trim( GXutil.str( AV52TFRecVolPrd_To, 5, 0))) ;
      AV31GridState = GXv_SdtWWPGridState12[0] ;
      GXv_SdtWWPGridState12[0] = AV31GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFRECFA", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFRecFA)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV54TFRecFA_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV53TFRecFA, 6, 2)), GXutil.trim( GXutil.str( AV54TFRecFA_To, 6, 2))) ;
      AV31GridState = GXv_SdtWWPGridState12[0] ;
      AV31GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV31GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV75Pgmname+"GridState", AV31GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV29TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV29TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV75Pgmname );
      AV29TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV29TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV15HTTPRequest.getScriptName()+"?"+AV15HTTPRequest.getQuerystring() );
      AV29TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "RECMAQ" );
      AV41Session.setValue("TrnContext", AV29TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_47_1HL2( boolean wbgen )
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
         ucDvelop_confirmpanel_eliminar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_eliminar_Internalname, "DVELOP_CONFIRMPANEL_ELIMINARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_ELIMINARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_47_1HL2e( true) ;
      }
      else
      {
         wb_table1_47_1HL2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV6Emprcod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Emprcod", AV6Emprcod);
      AV7Barcod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7Barcod), 8, 0));
      AV8Barcodreo = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Barcodreo", GXutil.str( AV8Barcodreo, 1, 0));
      AV5Barcodpar = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5Barcodpar", AV5Barcodpar);
      Gx_mode = (String)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      AV24Usurcod = (String)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Usurcod", AV24Usurcod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV24Usurcod, "@!"))));
      AV23Station = (String)getParm(obj,6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Station", AV23Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV23Station, ""))));
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
      pa1HL2( ) ;
      ws1HL2( ) ;
      we1HL2( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116133212", true, true);
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
      httpContext.AddJavascriptSource("recetasdeacabado04_wp.js", "?202682116133213", false, true);
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

   public void subsflControlProps_272( )
   {
      cmbavGrupodeacciones.setInternalname( "vGRUPODEACCIONES_"+sGXsfl_27_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_27_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_27_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_27_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_27_idx ;
      edtBarNHdr_Internalname = "BARNHDR_"+sGXsfl_27_idx ;
      edtRecLinMaq_Internalname = "RECLINMAQ_"+sGXsfl_27_idx ;
      edtMaqCod_Internalname = "MAQCOD_"+sGXsfl_27_idx ;
      edtRecVolPrd_Internalname = "RECVOLPRD_"+sGXsfl_27_idx ;
      edtRecFA_Internalname = "RECFA_"+sGXsfl_27_idx ;
      edtRecHdrLts_Internalname = "RECHDRLTS_"+sGXsfl_27_idx ;
      edtRecLtsSR_Internalname = "RECLTSSR_"+sGXsfl_27_idx ;
   }

   public void subsflControlProps_fel_272( )
   {
      cmbavGrupodeacciones.setInternalname( "vGRUPODEACCIONES_"+sGXsfl_27_fel_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_27_fel_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_27_fel_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_27_fel_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_27_fel_idx ;
      edtBarNHdr_Internalname = "BARNHDR_"+sGXsfl_27_fel_idx ;
      edtRecLinMaq_Internalname = "RECLINMAQ_"+sGXsfl_27_fel_idx ;
      edtMaqCod_Internalname = "MAQCOD_"+sGXsfl_27_fel_idx ;
      edtRecVolPrd_Internalname = "RECVOLPRD_"+sGXsfl_27_fel_idx ;
      edtRecFA_Internalname = "RECFA_"+sGXsfl_27_fel_idx ;
      edtRecHdrLts_Internalname = "RECHDRLTS_"+sGXsfl_27_fel_idx ;
      edtRecLtsSR_Internalname = "RECLTSSR_"+sGXsfl_27_fel_idx ;
   }

   public void sendrow_272( )
   {
      subsflControlProps_272( ) ;
      wb1HL0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_27_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_27_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_27_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGrupodeacciones.getEnabled()!=0)&&(cmbavGrupodeacciones.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 28,'',false,'"+sGXsfl_27_idx+"',27)\"" : " ") ;
         if ( ( cmbavGrupodeacciones.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRUPODEACCIONES_" + sGXsfl_27_idx ;
            cmbavGrupodeacciones.setName( GXCCtl );
            cmbavGrupodeacciones.setWebtags( "" );
            if ( cmbavGrupodeacciones.getItemCount() > 0 )
            {
               AV19GrupodeAcciones = (short)(GXutil.lval( cmbavGrupodeacciones.getValidValue(GXutil.trim( GXutil.str( AV19GrupodeAcciones, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGrupodeacciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19GrupodeAcciones), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGrupodeacciones,cmbavGrupodeacciones.getInternalname(),GXutil.trim( GXutil.str( AV19GrupodeAcciones, 4, 0)),Integer.valueOf(1),cmbavGrupodeacciones.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRUPODEACCIONES.CLICK."+sGXsfl_27_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGrupodeacciones.getEnabled()!=0)&&(cmbavGrupodeacciones.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,28);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGrupodeacciones.setValue( GXutil.trim( GXutil.str( AV19GrupodeAcciones, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGrupodeacciones.getInternalname(), "Values", cmbavGrupodeacciones.ToJavascriptSource(), !bGXsfl_27_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNHdr_Internalname,GXutil.rtrim( A13696BarNHdr),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarNHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecLinMaq_Internalname,GXutil.ltrim( localUtil.ntoc( A2804RecLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2804RecLinMaq), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecLinMaq_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqCod_Internalname,GXutil.rtrim( A602MaqCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecVolPrd_Internalname,GXutil.ltrim( localUtil.ntoc( A2805RecVolPrd, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2805RecVolPrd), "ZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecVolPrd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecFA_Internalname,GXutil.ltrim( localUtil.ntoc( A2806RecFA, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A2806RecFA, "ZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecFA_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecHdrLts_Internalname,GXutil.rtrim( A9812RecHdrLts),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecHdrLts_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecLtsSR_Internalname,GXutil.ltrim( localUtil.ntoc( A9764RecLtsSR, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9764RecLtsSR), "ZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecLtsSR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(27),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1HL2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_27_idx = ((subGrid_Islastpage==1)&&(nGXsfl_27_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_27_idx+1) ;
         sGXsfl_27_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_27_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_272( ) ;
      }
      /* End function sendrow_272 */
   }

   public void startgridcontrol27( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"27\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "#") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código Máquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Volumen", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Factor Absorcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hdr HisTomo Lts Sobrantes", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Lts Sobrantes/Recuperados", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV19GrupodeAcciones, (byte)(4), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13696BarNHdr));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2804RecLinMaq, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A602MaqCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2805RecVolPrd, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2806RecFA, (byte)(6), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A9812RecHdrLts));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9764RecLtsSR, (byte)(5), (byte)(0), ".", "")));
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
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      cmbavGrupodeacciones.setInternalname( "vGRUPODEACCIONES" );
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtBarNHdr_Internalname = "BARNHDR" ;
      edtRecLinMaq_Internalname = "RECLINMAQ" ;
      edtMaqCod_Internalname = "MAQCOD" ;
      edtRecVolPrd_Internalname = "RECVOLPRD" ;
      edtRecFA_Internalname = "RECFA" ;
      edtRecHdrLts_Internalname = "RECHDRLTS" ;
      edtRecLtsSR_Internalname = "RECLTSSR" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Dvelop_confirmpanel_eliminar_Internalname = "DVELOP_CONFIRMPANEL_ELIMINAR" ;
      tblTabledvelop_confirmpanel_eliminar_Internalname = "TABLEDVELOP_CONFIRMPANEL_ELIMINAR" ;
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
      edtRecLtsSR_Jsonclick = "" ;
      edtRecHdrLts_Jsonclick = "" ;
      edtRecFA_Jsonclick = "" ;
      edtRecVolPrd_Jsonclick = "" ;
      edtMaqCod_Jsonclick = "" ;
      edtRecLinMaq_Jsonclick = "" ;
      edtBarNHdr_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      cmbavGrupodeacciones.setJsonclick( "" );
      cmbavGrupodeacciones.setVisible( -1 );
      cmbavGrupodeacciones.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      subGrid_Sortable = (byte)(0) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_eliminar_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminar_Confirmationtext = "¿Desea eliminar la Receta?" ;
      Dvelop_confirmpanel_eliminar_Title = "" ;
      Ddo_grid_Datalistproc = "RecetasdeAcabado04_WPGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic||Dynamic||" ;
      Ddo_grid_Includedatalist = "T||T||" ;
      Ddo_grid_Filterisrange = "|T||T|T" ;
      Ddo_grid_Filtertype = "Character|Numeric|Character|Numeric|Numeric" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "|T|T|T|T" ;
      Ddo_grid_Columnssortvalues = "|1|2|3|4" ;
      Ddo_grid_Columnids = "5:BarNHdr|6:RecLinMaq|7:MaqCod|8:RecVolPrd|9:RecFA" ;
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
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Recetas de Acabado", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vGRUPODEACCIONES_" + sGXsfl_27_idx ;
      cmbavGrupodeacciones.setName( GXCCtl );
      cmbavGrupodeacciones.setWebtags( "" );
      if ( cmbavGrupodeacciones.getItemCount() > 0 )
      {
         AV19GrupodeAcciones = (short)(GXutil.lval( cmbavGrupodeacciones.getValidValue(GXutil.trim( GXutil.str( AV19GrupodeAcciones, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGrupodeacciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19GrupodeAcciones), 4, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV6Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV8Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV5Barcodpar',fld:'vBARCODPAR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV45TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV46TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV47TFRecLinMaq',fld:'vTFRECLINMAQ',pic:'ZZZ9'},{av:'AV48TFRecLinMaq_To',fld:'vTFRECLINMAQ_TO',pic:'ZZZ9'},{av:'AV49TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV50TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV51TFRecVolPrd',fld:'vTFRECVOLPRD',pic:'ZZZZ9'},{av:'AV52TFRecVolPrd_To',fld:'vTFRECVOLPRD_TO',pic:'ZZZZ9'},{av:'AV53TFRecFA',fld:'vTFRECFA',pic:'ZZ9.99'},{av:'AV54TFRecFA_To',fld:'vTFRECFA_TO',pic:'ZZ9.99'},{av:'AV75Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV33OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV34OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV24Usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV23Station',fld:'vSTATION',pic:'',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV17GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV18GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e111HL2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV6Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV8Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV5Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV45TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV46TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV47TFRecLinMaq',fld:'vTFRECLINMAQ',pic:'ZZZ9'},{av:'AV48TFRecLinMaq_To',fld:'vTFRECLINMAQ_TO',pic:'ZZZ9'},{av:'AV49TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV50TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV51TFRecVolPrd',fld:'vTFRECVOLPRD',pic:'ZZZZ9'},{av:'AV52TFRecVolPrd_To',fld:'vTFRECVOLPRD_TO',pic:'ZZZZ9'},{av:'AV53TFRecFA',fld:'vTFRECFA',pic:'ZZ9.99'},{av:'AV54TFRecFA_To',fld:'vTFRECFA_TO',pic:'ZZ9.99'},{av:'AV75Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV33OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV34OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV24Usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV23Station',fld:'vSTATION',pic:'',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e121HL2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV6Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV8Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV5Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV45TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV46TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV47TFRecLinMaq',fld:'vTFRECLINMAQ',pic:'ZZZ9'},{av:'AV48TFRecLinMaq_To',fld:'vTFRECLINMAQ_TO',pic:'ZZZ9'},{av:'AV49TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV50TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV51TFRecVolPrd',fld:'vTFRECVOLPRD',pic:'ZZZZ9'},{av:'AV52TFRecVolPrd_To',fld:'vTFRECVOLPRD_TO',pic:'ZZZZ9'},{av:'AV53TFRecFA',fld:'vTFRECFA',pic:'ZZ9.99'},{av:'AV54TFRecFA_To',fld:'vTFRECFA_TO',pic:'ZZ9.99'},{av:'AV75Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV33OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV34OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV24Usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV23Station',fld:'vSTATION',pic:'',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e131HL2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV6Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV8Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV5Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV45TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV46TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV47TFRecLinMaq',fld:'vTFRECLINMAQ',pic:'ZZZ9'},{av:'AV48TFRecLinMaq_To',fld:'vTFRECLINMAQ_TO',pic:'ZZZ9'},{av:'AV49TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV50TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV51TFRecVolPrd',fld:'vTFRECVOLPRD',pic:'ZZZZ9'},{av:'AV52TFRecVolPrd_To',fld:'vTFRECVOLPRD_TO',pic:'ZZZZ9'},{av:'AV53TFRecFA',fld:'vTFRECFA',pic:'ZZ9.99'},{av:'AV54TFRecFA_To',fld:'vTFRECFA_TO',pic:'ZZ9.99'},{av:'AV75Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV33OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV34OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV24Usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV23Station',fld:'vSTATION',pic:'',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV33OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV34OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV45TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV46TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV47TFRecLinMaq',fld:'vTFRECLINMAQ',pic:'ZZZ9'},{av:'AV48TFRecLinMaq_To',fld:'vTFRECLINMAQ_TO',pic:'ZZZ9'},{av:'AV49TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV50TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV51TFRecVolPrd',fld:'vTFRECVOLPRD',pic:'ZZZZ9'},{av:'AV52TFRecVolPrd_To',fld:'vTFRECVOLPRD_TO',pic:'ZZZZ9'},{av:'AV53TFRecFA',fld:'vTFRECFA',pic:'ZZ9.99'},{av:'AV54TFRecFA_To',fld:'vTFRECFA_TO',pic:'ZZ9.99'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e181HL2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGrupodeacciones'},{av:'AV19GrupodeAcciones',fld:'vGRUPODEACCIONES',pic:'ZZZ9'}]}");
      setEventMetadata("VGRUPODEACCIONES.CLICK","{handler:'e191HL2',iparms:[{av:'cmbavGrupodeacciones'},{av:'AV19GrupodeAcciones',fld:'vGRUPODEACCIONES',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV6Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV8Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV5Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV45TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV46TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV47TFRecLinMaq',fld:'vTFRECLINMAQ',pic:'ZZZ9'},{av:'AV48TFRecLinMaq_To',fld:'vTFRECLINMAQ_TO',pic:'ZZZ9'},{av:'AV49TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV50TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV51TFRecVolPrd',fld:'vTFRECVOLPRD',pic:'ZZZZ9'},{av:'AV52TFRecVolPrd_To',fld:'vTFRECVOLPRD_TO',pic:'ZZZZ9'},{av:'AV53TFRecFA',fld:'vTFRECFA',pic:'ZZ9.99'},{av:'AV54TFRecFA_To',fld:'vTFRECFA_TO',pic:'ZZ9.99'},{av:'AV75Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV33OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV34OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV24Usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV23Station',fld:'vSTATION',pic:'',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'A13696BarNHdr',fld:'BARNHDR',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:'',hsh:true},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A2805RecVolPrd',fld:'RECVOLPRD',pic:'ZZZZ9'},{av:'AV26ImpCod',fld:'vIMPCOD',pic:''}]");
      setEventMetadata("VGRUPODEACCIONES.CLICK",",oparms:[{av:'cmbavGrupodeacciones'},{av:'AV19GrupodeAcciones',fld:'vGRUPODEACCIONES',pic:'ZZZ9'},{av:'Dvelop_confirmpanel_eliminar_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_ELIMINAR',prop:'ConfirmationText'},{av:'AV26ImpCod',fld:'vIMPCOD',pic:''},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'A2805RecVolPrd',fld:'RECVOLPRD',pic:'ZZZZ9'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'AV5Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV8Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV7Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV6Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV17GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV18GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE","{handler:'e141HL2',iparms:[{av:'Dvelop_confirmpanel_eliminar_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINAR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV6Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV8Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV5Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV45TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV46TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV47TFRecLinMaq',fld:'vTFRECLINMAQ',pic:'ZZZ9'},{av:'AV48TFRecLinMaq_To',fld:'vTFRECLINMAQ_TO',pic:'ZZZ9'},{av:'AV49TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV50TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV51TFRecVolPrd',fld:'vTFRECVOLPRD',pic:'ZZZZ9'},{av:'AV52TFRecVolPrd_To',fld:'vTFRECVOLPRD_TO',pic:'ZZZZ9'},{av:'AV53TFRecFA',fld:'vTFRECFA',pic:'ZZ9.99'},{av:'AV54TFRecFA_To',fld:'vTFRECFA_TO',pic:'ZZ9.99'},{av:'AV75Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV33OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV34OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV24Usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV23Station',fld:'vSTATION',pic:'',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A9812RecHdrLts',fld:'RECHDRLTS',pic:''},{av:'A9764RecLtsSR',fld:'RECLTSSR',pic:'ZZZZ9'},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE",",oparms:[{av:'A9764RecLtsSR',fld:'RECLTSSR',pic:'ZZZZ9'},{av:'A9812RecHdrLts',fld:'RECHDRLTS',pic:''},{av:'AV6Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'AV5Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV8Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV7Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV17GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV18GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e151HL2',iparms:[{av:'AV23Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV24Usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV5Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV8Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV7Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV6Emprcod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Recltssr',iparms:[]");
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
      wcpOAV6Emprcod = "" ;
      wcpOAV5Barcodpar = "" ;
      wcpOGx_mode = "" ;
      wcpOAV24Usurcod = "" ;
      wcpOAV23Station = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Dvelop_confirmpanel_eliminar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV6Emprcod = "" ;
      AV5Barcodpar = "" ;
      Gx_mode = "" ;
      AV24Usurcod = "" ;
      AV23Station = "" ;
      AV45TFBarNHdr = "" ;
      AV46TFBarNHdr_Sel = "" ;
      AV49TFMaqCod = "" ;
      AV50TFMaqCod_Sel = "" ;
      AV53TFRecFA = DecimalUtil.ZERO ;
      AV54TFRecFA_To = DecimalUtil.ZERO ;
      AV75Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV55DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV26ImpCod = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtncerrar_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A13696BarNHdr = "" ;
      A602MaqCod = "" ;
      A2806RecFA = DecimalUtil.ZERO ;
      A9812RecHdrLts = "" ;
      scmdbuf = "" ;
      lV60Recetasdeacabado04_wpds_1_tfbarnhdr = "" ;
      lV64Recetasdeacabado04_wpds_5_tfmaqcod = "" ;
      AV61Recetasdeacabado04_wpds_2_tfbarnhdr_sel = "" ;
      AV60Recetasdeacabado04_wpds_1_tfbarnhdr = "" ;
      AV65Recetasdeacabado04_wpds_6_tfmaqcod_sel = "" ;
      AV64Recetasdeacabado04_wpds_5_tfmaqcod = "" ;
      AV68Recetasdeacabado04_wpds_9_tfrecfa = DecimalUtil.ZERO ;
      AV69Recetasdeacabado04_wpds_10_tfrecfa_to = DecimalUtil.ZERO ;
      A6039RecAcab = "" ;
      H01HL2_A6039RecAcab = new String[] {""} ;
      H01HL2_n6039RecAcab = new boolean[] {false} ;
      H01HL2_A9764RecLtsSR = new int[1] ;
      H01HL2_n9764RecLtsSR = new boolean[] {false} ;
      H01HL2_A9812RecHdrLts = new String[] {""} ;
      H01HL2_n9812RecHdrLts = new boolean[] {false} ;
      H01HL2_A2806RecFA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01HL2_A2805RecVolPrd = new int[1] ;
      H01HL2_A602MaqCod = new String[] {""} ;
      H01HL2_A2804RecLinMaq = new short[1] ;
      H01HL2_A396EmprCod = new String[] {""} ;
      H01HL2_A130BarCodPar = new String[] {""} ;
      H01HL2_A132BarCodReo = new byte[1] ;
      H01HL2_A129BarCod = new int[1] ;
      H01HL3_AGRID_nRecordCount = new long[1] ;
      GXv_char2 = new String[1] ;
      AV59Emprnom = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV28WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      ucDvelop_confirmpanel_eliminar = new com.genexus.webpanels.GXUserControl();
      AV70Emprcod_selected = "" ;
      AV73Barcodpar_selected = "" ;
      GXv_int8 = new int[1] ;
      GXv_int9 = new byte[1] ;
      GXv_int10 = new short[1] ;
      AV22Inc_obs = "" ;
      AV41Session = httpContext.getWebSession();
      AV31GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV32GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char11 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char3 = new String[1] ;
      GXv_SdtWWPGridState12 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV29TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV15HTTPRequest = httpContext.getHttpRequest();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.recetasdeacabado04_wp__default(),
         new Object[] {
             new Object[] {
            H01HL2_A6039RecAcab, H01HL2_n6039RecAcab, H01HL2_A9764RecLtsSR, H01HL2_n9764RecLtsSR, H01HL2_A9812RecHdrLts, H01HL2_n9812RecHdrLts, H01HL2_A2806RecFA, H01HL2_A2805RecVolPrd, H01HL2_A602MaqCod, H01HL2_A2804RecLinMaq,
            H01HL2_A396EmprCod, H01HL2_A130BarCodPar, H01HL2_A132BarCodReo, H01HL2_A129BarCod
            }
            , new Object[] {
            H01HL3_AGRID_nRecordCount
            }
         }
      );
      AV75Pgmname = "RecetasdeAcabado04_WP" ;
      /* GeneXus formulas. */
      AV75Pgmname = "RecetasdeAcabado04_WP" ;
      Gx_err = (short)(0) ;
   }

   private byte wcpOAV8Barcodreo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV8Barcodreo ;
   private byte gxajaxcallmode ;
   private byte A132BarCodReo ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV72Barcodreo_selected ;
   private byte GXv_int9[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV47TFRecLinMaq ;
   private short AV48TFRecLinMaq_To ;
   private short AV33OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV19GrupodeAcciones ;
   private short A2804RecLinMaq ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV62Recetasdeacabado04_wpds_3_tfreclinmaq ;
   private short AV63Recetasdeacabado04_wpds_4_tfreclinmaq_to ;
   private short AV74Reclinmaq_selected ;
   private short GXv_int10[] ;
   private int wcpOAV7Barcod ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_27 ;
   private int AV7Barcod ;
   private int nGXsfl_27_idx=1 ;
   private int AV51TFRecVolPrd ;
   private int AV52TFRecVolPrd_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int A129BarCod ;
   private int A2805RecVolPrd ;
   private int A9764RecLtsSR ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV66Recetasdeacabado04_wpds_7_tfrecvolprd ;
   private int AV67Recetasdeacabado04_wpds_8_tfrecvolprd_to ;
   private int AV16PageToGo ;
   private int AV71Barcod_selected ;
   private int GXv_int8[] ;
   private int AV76GXV1 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV17GridCurrentPage ;
   private long AV18GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV53TFRecFA ;
   private java.math.BigDecimal AV54TFRecFA_To ;
   private java.math.BigDecimal A2806RecFA ;
   private java.math.BigDecimal AV68Recetasdeacabado04_wpds_9_tfrecfa ;
   private java.math.BigDecimal AV69Recetasdeacabado04_wpds_10_tfrecfa_to ;
   private String wcpOAV6Emprcod ;
   private String wcpOAV5Barcodpar ;
   private String wcpOGx_mode ;
   private String wcpOAV24Usurcod ;
   private String wcpOAV23Station ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Dvelop_confirmpanel_eliminar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV6Emprcod ;
   private String AV5Barcodpar ;
   private String Gx_mode ;
   private String AV24Usurcod ;
   private String AV23Station ;
   private String sGXsfl_27_idx="0001" ;
   private String AV45TFBarNHdr ;
   private String AV46TFBarNHdr_Sel ;
   private String AV49TFMaqCod ;
   private String AV50TFMaqCod_Sel ;
   private String AV75Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV26ImpCod ;
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
   private String Dvelop_confirmpanel_eliminar_Title ;
   private String Dvelop_confirmpanel_eliminar_Confirmationtext ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_eliminar_Confirmtype ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
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
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Grid_empowerer_Internalname ;
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
   private String A13696BarNHdr ;
   private String edtBarNHdr_Internalname ;
   private String edtRecLinMaq_Internalname ;
   private String A602MaqCod ;
   private String edtMaqCod_Internalname ;
   private String edtRecVolPrd_Internalname ;
   private String edtRecFA_Internalname ;
   private String A9812RecHdrLts ;
   private String edtRecHdrLts_Internalname ;
   private String edtRecLtsSR_Internalname ;
   private String scmdbuf ;
   private String lV60Recetasdeacabado04_wpds_1_tfbarnhdr ;
   private String lV64Recetasdeacabado04_wpds_5_tfmaqcod ;
   private String AV61Recetasdeacabado04_wpds_2_tfbarnhdr_sel ;
   private String AV60Recetasdeacabado04_wpds_1_tfbarnhdr ;
   private String AV65Recetasdeacabado04_wpds_6_tfmaqcod_sel ;
   private String AV64Recetasdeacabado04_wpds_5_tfmaqcod ;
   private String A6039RecAcab ;
   private String GXv_char2[] ;
   private String AV59Emprnom ;
   private String Dvelop_confirmpanel_eliminar_Internalname ;
   private String AV70Emprcod_selected ;
   private String AV73Barcodpar_selected ;
   private String GXt_char11 ;
   private String GXv_char4[] ;
   private String GXt_char1 ;
   private String GXv_char3[] ;
   private String tblTabledvelop_confirmpanel_eliminar_Internalname ;
   private String sGXsfl_27_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtEmprCod_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String edtBarNHdr_Jsonclick ;
   private String edtRecLinMaq_Jsonclick ;
   private String edtMaqCod_Jsonclick ;
   private String edtRecVolPrd_Jsonclick ;
   private String edtRecFA_Jsonclick ;
   private String edtRecHdrLts_Jsonclick ;
   private String edtRecLtsSR_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV34OrderedDsc ;
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
   private boolean n9812RecHdrLts ;
   private boolean n9764RecLtsSR ;
   private boolean bGXsfl_27_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n6039RecAcab ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV22Inc_obs ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV15HTTPRequest ;
   private com.genexus.webpanels.WebSession AV41Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminar ;
   private HTMLChoice cmbavGrupodeacciones ;
   private IDataStoreProvider pr_default ;
   private String[] H01HL2_A6039RecAcab ;
   private boolean[] H01HL2_n6039RecAcab ;
   private int[] H01HL2_A9764RecLtsSR ;
   private boolean[] H01HL2_n9764RecLtsSR ;
   private String[] H01HL2_A9812RecHdrLts ;
   private boolean[] H01HL2_n9812RecHdrLts ;
   private java.math.BigDecimal[] H01HL2_A2806RecFA ;
   private int[] H01HL2_A2805RecVolPrd ;
   private String[] H01HL2_A602MaqCod ;
   private short[] H01HL2_A2804RecLinMaq ;
   private String[] H01HL2_A396EmprCod ;
   private String[] H01HL2_A130BarCodPar ;
   private byte[] H01HL2_A132BarCodReo ;
   private int[] H01HL2_A129BarCod ;
   private long[] H01HL3_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV28WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV29TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV31GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState12[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV32GridStateFilterValue ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV55DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class recetasdeacabado04_wp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01HL2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV61Recetasdeacabado04_wpds_2_tfbarnhdr_sel ,
                                          String AV60Recetasdeacabado04_wpds_1_tfbarnhdr ,
                                          short AV62Recetasdeacabado04_wpds_3_tfreclinmaq ,
                                          short AV63Recetasdeacabado04_wpds_4_tfreclinmaq_to ,
                                          String AV65Recetasdeacabado04_wpds_6_tfmaqcod_sel ,
                                          String AV64Recetasdeacabado04_wpds_5_tfmaqcod ,
                                          int AV66Recetasdeacabado04_wpds_7_tfrecvolprd ,
                                          int AV67Recetasdeacabado04_wpds_8_tfrecvolprd_to ,
                                          java.math.BigDecimal AV68Recetasdeacabado04_wpds_9_tfrecfa ,
                                          java.math.BigDecimal AV69Recetasdeacabado04_wpds_10_tfrecfa_to ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short A2804RecLinMaq ,
                                          String A602MaqCod ,
                                          int A2805RecVolPrd ,
                                          java.math.BigDecimal A2806RecFA ,
                                          short AV33OrderedBy ,
                                          boolean AV34OrderedDsc ,
                                          String A6039RecAcab ,
                                          String AV6Emprcod ,
                                          int AV7Barcod ,
                                          byte AV8Barcodreo ,
                                          String AV5Barcodpar ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int13 = new byte[19];
      Object[] GXv_Object14 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " RecAcab, RecLtsSR, RecHdrLts, RecFA, RecVolPrd, MaqCod, RecLinMaq, EmprCod, BarCodPar, BarCodReo, BarCod" ;
      sFromString = " FROM TXPRECMAQ" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)");
      addWhere(sWhereString, "(RecAcab = 'S')");
      if ( (GXutil.strcmp("", AV61Recetasdeacabado04_wpds_2_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV60Recetasdeacabado04_wpds_1_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCodReo,'90'), 2))) || BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Recetasdeacabado04_wpds_2_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCodReo,'90'), 2))) || BarCodPar = ?)");
      }
      else
      {
         GXv_int13[5] = (byte)(1) ;
      }
      if ( ! (0==AV62Recetasdeacabado04_wpds_3_tfreclinmaq) )
      {
         addWhere(sWhereString, "(RecLinMaq >= ?)");
      }
      else
      {
         GXv_int13[6] = (byte)(1) ;
      }
      if ( ! (0==AV63Recetasdeacabado04_wpds_4_tfreclinmaq_to) )
      {
         addWhere(sWhereString, "(RecLinMaq <= ?)");
      }
      else
      {
         GXv_int13[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Recetasdeacabado04_wpds_6_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV64Recetasdeacabado04_wpds_5_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Recetasdeacabado04_wpds_6_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MaqCod = ?)");
      }
      else
      {
         GXv_int13[9] = (byte)(1) ;
      }
      if ( ! (0==AV66Recetasdeacabado04_wpds_7_tfrecvolprd) )
      {
         addWhere(sWhereString, "(RecVolPrd >= ?)");
      }
      else
      {
         GXv_int13[10] = (byte)(1) ;
      }
      if ( ! (0==AV67Recetasdeacabado04_wpds_8_tfrecvolprd_to) )
      {
         addWhere(sWhereString, "(RecVolPrd <= ?)");
      }
      else
      {
         GXv_int13[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV68Recetasdeacabado04_wpds_9_tfrecfa)==0) )
      {
         addWhere(sWhereString, "(RecFA >= ?)");
      }
      else
      {
         GXv_int13[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Recetasdeacabado04_wpds_10_tfrecfa_to)==0) )
      {
         addWhere(sWhereString, "(RecFA <= ?)");
      }
      else
      {
         GXv_int13[13] = (byte)(1) ;
      }
      if ( ( AV33OrderedBy == 1 ) && ! AV34OrderedDsc )
      {
         sOrderString += " ORDER BY RecLinMaq" ;
      }
      else if ( ( AV33OrderedBy == 1 ) && ( AV34OrderedDsc ) )
      {
         sOrderString += " ORDER BY RecLinMaq DESC" ;
      }
      else if ( ( AV33OrderedBy == 2 ) && ! AV34OrderedDsc )
      {
         sOrderString += " ORDER BY MaqCod" ;
      }
      else if ( ( AV33OrderedBy == 2 ) && ( AV34OrderedDsc ) )
      {
         sOrderString += " ORDER BY MaqCod DESC" ;
      }
      else if ( ( AV33OrderedBy == 3 ) && ! AV34OrderedDsc )
      {
         sOrderString += " ORDER BY RecVolPrd" ;
      }
      else if ( ( AV33OrderedBy == 3 ) && ( AV34OrderedDsc ) )
      {
         sOrderString += " ORDER BY RecVolPrd DESC" ;
      }
      else if ( ( AV33OrderedBy == 4 ) && ! AV34OrderedDsc )
      {
         sOrderString += " ORDER BY RecFA" ;
      }
      else if ( ( AV33OrderedBy == 4 ) && ( AV34OrderedDsc ) )
      {
         sOrderString += " ORDER BY RecFA DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object14[0] = scmdbuf ;
      GXv_Object14[1] = GXv_int13 ;
      return GXv_Object14 ;
   }

   protected Object[] conditional_H01HL3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV61Recetasdeacabado04_wpds_2_tfbarnhdr_sel ,
                                          String AV60Recetasdeacabado04_wpds_1_tfbarnhdr ,
                                          short AV62Recetasdeacabado04_wpds_3_tfreclinmaq ,
                                          short AV63Recetasdeacabado04_wpds_4_tfreclinmaq_to ,
                                          String AV65Recetasdeacabado04_wpds_6_tfmaqcod_sel ,
                                          String AV64Recetasdeacabado04_wpds_5_tfmaqcod ,
                                          int AV66Recetasdeacabado04_wpds_7_tfrecvolprd ,
                                          int AV67Recetasdeacabado04_wpds_8_tfrecvolprd_to ,
                                          java.math.BigDecimal AV68Recetasdeacabado04_wpds_9_tfrecfa ,
                                          java.math.BigDecimal AV69Recetasdeacabado04_wpds_10_tfrecfa_to ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short A2804RecLinMaq ,
                                          String A602MaqCod ,
                                          int A2805RecVolPrd ,
                                          java.math.BigDecimal A2806RecFA ,
                                          short AV33OrderedBy ,
                                          boolean AV34OrderedDsc ,
                                          String A6039RecAcab ,
                                          String AV6Emprcod ,
                                          int AV7Barcod ,
                                          byte AV8Barcodreo ,
                                          String AV5Barcodpar ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int15 = new byte[14];
      Object[] GXv_Object16 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM TXPRECMAQ" ;
      addWhere(sWhereString, "(EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)");
      addWhere(sWhereString, "(RecAcab = 'S')");
      if ( (GXutil.strcmp("", AV61Recetasdeacabado04_wpds_2_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV60Recetasdeacabado04_wpds_1_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCodReo,'90'), 2))) || BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Recetasdeacabado04_wpds_2_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCodReo,'90'), 2))) || BarCodPar = ?)");
      }
      else
      {
         GXv_int15[5] = (byte)(1) ;
      }
      if ( ! (0==AV62Recetasdeacabado04_wpds_3_tfreclinmaq) )
      {
         addWhere(sWhereString, "(RecLinMaq >= ?)");
      }
      else
      {
         GXv_int15[6] = (byte)(1) ;
      }
      if ( ! (0==AV63Recetasdeacabado04_wpds_4_tfreclinmaq_to) )
      {
         addWhere(sWhereString, "(RecLinMaq <= ?)");
      }
      else
      {
         GXv_int15[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Recetasdeacabado04_wpds_6_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV64Recetasdeacabado04_wpds_5_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Recetasdeacabado04_wpds_6_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MaqCod = ?)");
      }
      else
      {
         GXv_int15[9] = (byte)(1) ;
      }
      if ( ! (0==AV66Recetasdeacabado04_wpds_7_tfrecvolprd) )
      {
         addWhere(sWhereString, "(RecVolPrd >= ?)");
      }
      else
      {
         GXv_int15[10] = (byte)(1) ;
      }
      if ( ! (0==AV67Recetasdeacabado04_wpds_8_tfrecvolprd_to) )
      {
         addWhere(sWhereString, "(RecVolPrd <= ?)");
      }
      else
      {
         GXv_int15[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV68Recetasdeacabado04_wpds_9_tfrecfa)==0) )
      {
         addWhere(sWhereString, "(RecFA >= ?)");
      }
      else
      {
         GXv_int15[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Recetasdeacabado04_wpds_10_tfrecfa_to)==0) )
      {
         addWhere(sWhereString, "(RecFA <= ?)");
      }
      else
      {
         GXv_int15[13] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV33OrderedBy == 1 ) && ! AV34OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV33OrderedBy == 1 ) && ( AV34OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV33OrderedBy == 2 ) && ! AV34OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV33OrderedBy == 2 ) && ( AV34OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV33OrderedBy == 3 ) && ! AV34OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV33OrderedBy == 3 ) && ( AV34OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV33OrderedBy == 4 ) && ! AV34OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV33OrderedBy == 4 ) && ( AV34OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object16[0] = scmdbuf ;
      GXv_Object16[1] = GXv_int15 ;
      return GXv_Object16 ;
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
                  return conditional_H01HL2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , (java.math.BigDecimal)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , ((Boolean) dynConstraints[18]).booleanValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] );
            case 1 :
                  return conditional_H01HL3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , (java.math.BigDecimal)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , ((Boolean) dynConstraints[18]).booleanValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01HL2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01HL3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 12);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((String[]) buf[8])[0] = rslt.getString(6, 6);
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((String[]) buf[10])[0] = rslt.getString(8, 3);
               ((String[]) buf[11])[0] = rslt.getString(9, 1);
               ((byte[]) buf[12])[0] = rslt.getByte(10);
               ((int[]) buf[13])[0] = rslt.getInt(11);
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
                  stmt.setString(sIdx, (String)parms[19], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[21]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 11);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[25]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[16]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 11);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[20]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[21]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[26], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 2);
               }
               return;
      }
   }

}

