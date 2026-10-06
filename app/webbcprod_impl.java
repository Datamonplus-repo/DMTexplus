package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webbcprod_impl extends GXDataArea
{
   public webbcprod_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webbcprod_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webbcprod_impl.class ));
   }

   public webbcprod_impl( int remoteHandle ,
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
         gxfirstwebparm = httpContext.GetNextPar( ) ;
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
            gxfirstwebparm = httpContext.GetNextPar( ) ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetNextPar( ) ;
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
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgrid_newrow_invoke( )
   {
      nRC_GXsfl_43 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_43"))) ;
      nGXsfl_43_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_43_idx"))) ;
      sGXsfl_43_idx = httpContext.GetPar( "sGXsfl_43_idx") ;
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
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV44ColumnsSelector);
      AV55TFPrdNum = httpContext.GetPar( "TFPrdNum") ;
      AV56TFPrdNum_Sel = httpContext.GetPar( "TFPrdNum_Sel") ;
      AV58TFPrdNom = httpContext.GetPar( "TFPrdNom") ;
      AV59TFPrdNom_Sel = httpContext.GetPar( "TFPrdNom_Sel") ;
      AV64TFPrdUcpDsc = httpContext.GetPar( "TFPrdUcpDsc") ;
      AV65TFPrdUcpDsc_Sel = httpContext.GetPar( "TFPrdUcpDsc_Sel") ;
      AV61TFPrdPreAct = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdPreAct"), ".") ;
      AV62TFPrdPreAct_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdPreAct_To"), ".") ;
      AV107TFPrdDisponible = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdDisponible"), ".") ;
      AV108TFPrdDisponible_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdDisponible_To"), ".") ;
      AV67TFPrvNif = httpContext.GetPar( "TFPrvNif") ;
      AV68TFPrvNif_Sel = httpContext.GetPar( "TFPrvNif_Sel") ;
      AV124Pgmname = httpContext.GetPar( "Pgmname") ;
      AV14OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV15OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV100AplicarConfirmar = GXutil.strtobool( httpContext.GetPar( "AplicarConfirmar")) ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV5EmprCod, AV44ColumnsSelector, AV55TFPrdNum, AV56TFPrdNum_Sel, AV58TFPrdNom, AV59TFPrdNom_Sel, AV64TFPrdUcpDsc, AV65TFPrdUcpDsc_Sel, AV61TFPrdPreAct, AV62TFPrdPreAct_To, AV107TFPrdDisponible, AV108TFPrdDisponible_To, AV67TFPrvNif, AV68TFPrvNif_Sel, AV124Pgmname, AV14OrderedBy, AV15OrderedDsc, AV100AplicarConfirmar, A396EmprCod) ;
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
      pa522( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start522( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
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
      httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.webbcprod", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV124Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_43", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_43, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV72GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV73GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV70DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV70DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV44ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV44ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNUM", GXutil.rtrim( AV55TFPrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNUM_SEL", GXutil.rtrim( AV56TFPrdNum_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNOM", GXutil.rtrim( AV58TFPrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNOM_SEL", GXutil.rtrim( AV59TFPrdNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDUCPDSC", GXutil.rtrim( AV64TFPrdUcpDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDUCPDSC_SEL", GXutil.rtrim( AV65TFPrdUcpDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDPREACT", GXutil.ltrim( localUtil.ntoc( AV61TFPrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDPREACT_TO", GXutil.ltrim( localUtil.ntoc( AV62TFPrdPreAct_To, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDDISPONIBLE", GXutil.ltrim( localUtil.ntoc( AV107TFPrdDisponible, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDDISPONIBLE_TO", GXutil.ltrim( localUtil.ntoc( AV108TFPrdDisponible_To, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVNIF", GXutil.rtrim( AV67TFPrvNif));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVNIF_SEL", GXutil.rtrim( AV68TFPrvNif_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV124Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV124Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV14OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV15OrderedDsc);
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vAPLICARCONFIRMAR", AV100AplicarConfirmar);
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDUNICOM", GXutil.ltrim( localUtil.ntoc( A742PrdUniCom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV5EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDEXIALM", GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDCANRES", GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDEQLP", GXutil.rtrim( A3936PrdEqLP));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLECONFIRMAR_Width", GXutil.rtrim( Dvpanel_tableconfirmar_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLECONFIRMAR_Autowidth", GXutil.booltostr( Dvpanel_tableconfirmar_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLECONFIRMAR_Autoheight", GXutil.booltostr( Dvpanel_tableconfirmar_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLECONFIRMAR_Cls", GXutil.rtrim( Dvpanel_tableconfirmar_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLECONFIRMAR_Title", GXutil.rtrim( Dvpanel_tableconfirmar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLECONFIRMAR_Collapsible", GXutil.booltostr( Dvpanel_tableconfirmar_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLECONFIRMAR_Collapsed", GXutil.booltostr( Dvpanel_tableconfirmar_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLECONFIRMAR_Showcollapseicon", GXutil.booltostr( Dvpanel_tableconfirmar_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLECONFIRMAR_Iconposition", GXutil.rtrim( Dvpanel_tableconfirmar_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLECONFIRMAR_Autoscroll", GXutil.booltostr( Dvpanel_tableconfirmar_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Fixable", GXutil.rtrim( Ddo_grid_Fixable));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filterisrange", GXutil.rtrim( Ddo_grid_Filterisrange));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includedatalist", GXutil.rtrim( Ddo_grid_Includedatalist));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalisttype", GXutil.rtrim( Ddo_grid_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, "INNEWWINDOW1_Width", GXutil.rtrim( Innewwindow1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "INNEWWINDOW1_Height", GXutil.rtrim( Innewwindow1_Height));
      app.GxWebStd.gx_hidden_field( httpContext, "INNEWWINDOW1_Target", GXutil.rtrim( Innewwindow1_Target));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Caption", GXutil.rtrim( Ddo_gridcolumnsselector_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Tooltip", GXutil.rtrim( Ddo_gridcolumnsselector_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Cls", GXutil.rtrim( Ddo_gridcolumnsselector_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype", GXutil.rtrim( Ddo_gridcolumnsselector_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Gridinternalname", GXutil.rtrim( Ddo_gridcolumnsselector_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace", GXutil.rtrim( Ddo_gridcolumnsselector_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Fixedcolumns", GXutil.rtrim( Grid_empowerer_Fixedcolumns));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
         we522( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt522( ) ;
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
      return formatLink("app.webbcprod", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "WebBCPROD" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Envío de datos de productos químicos de Datamon a BC", "") ;
   }

   public void wb520( )
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
         app.GxWebStd.gx_div_start( httpContext, divTableactions_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroupGrouped", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebBCPROD.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTREPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebBCPROD.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebBCPROD.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebBCPROD.htm");
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
         ucDvpanel_tableconfirmar.setProperty("Width", Dvpanel_tableconfirmar_Width);
         ucDvpanel_tableconfirmar.setProperty("AutoWidth", Dvpanel_tableconfirmar_Autowidth);
         ucDvpanel_tableconfirmar.setProperty("AutoHeight", Dvpanel_tableconfirmar_Autoheight);
         ucDvpanel_tableconfirmar.setProperty("Cls", Dvpanel_tableconfirmar_Cls);
         ucDvpanel_tableconfirmar.setProperty("Title", Dvpanel_tableconfirmar_Title);
         ucDvpanel_tableconfirmar.setProperty("Collapsible", Dvpanel_tableconfirmar_Collapsible);
         ucDvpanel_tableconfirmar.setProperty("Collapsed", Dvpanel_tableconfirmar_Collapsed);
         ucDvpanel_tableconfirmar.setProperty("ShowCollapseIcon", Dvpanel_tableconfirmar_Showcollapseicon);
         ucDvpanel_tableconfirmar.setProperty("IconPosition", Dvpanel_tableconfirmar_Iconposition);
         ucDvpanel_tableconfirmar.setProperty("AutoScroll", Dvpanel_tableconfirmar_Autoscroll);
         ucDvpanel_tableconfirmar.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tableconfirmar_Internalname, "DVPANEL_TABLECONFIRMARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TABLECONFIRMARContainer"+"TableConfirmar"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableconfirmar_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellWidthAuto", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableactionsconfirmar_Internalname, 1, 0, "px", 0, "px", "TableCellsWidthAuto", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Right", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "GX_BtnEnter", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebBCPROD.htm");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
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
         startgridcontrol43( ) ;
      }
      if ( wbEnd == 43 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_43 = (int)(nGXsfl_43_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV72GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV73GridPageCount);
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
         ucDdo_grid.setProperty("Fixable", Ddo_grid_Fixable);
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("FilterIsRange", Ddo_grid_Filterisrange);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV70DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, "INNEWWINDOW1Container");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV70DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV44ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 43 )
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

   public void start522( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Envío de datos de productos químicos de Datamon a BC", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup520( ) ;
   }

   public void ws522( )
   {
      start522( ) ;
      evt522( ) ;
   }

   public void evt522( )
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
                           e11522 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e12522 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e13522 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e14522 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ! wbErr )
                           {
                              Rfr0gs = false ;
                              if ( ! Rfr0gs )
                              {
                                 /* Execute user event: Enter */
                                 e15522 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e16522 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTREPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportReport' */
                           e17522 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e18522 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_43_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_432( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV106GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV106GridActions), 4, 0));
                           A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
                           A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
                           A737PrdUcpDsc = httpContext.cgiGet( edtPrdUcpDsc_Internalname) ;
                           n737PrdUcpDsc = false ;
                           A724PrdPreAct = localUtil.ctond( httpContext.cgiGet( edtPrdPreAct_Internalname)) ;
                           A13747PrdCDsc = httpContext.cgiGet( edtPrdCDsc_Internalname) ;
                           A13831PrdDisponi = localUtil.ctond( httpContext.cgiGet( edtPrdDisponi_Internalname)) ;
                           A793PrvNif = httpContext.cgiGet( edtPrvNif_Internalname) ;
                           n793PrvNif = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e19522 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e20522 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e21522 ();
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

   public void we522( )
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

   public void pa522( )
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
      subsflControlProps_432( ) ;
      while ( nGXsfl_43_idx <= nRC_GXsfl_43 )
      {
         sendrow_432( ) ;
         nGXsfl_43_idx = ((subGrid_Islastpage==1)&&(nGXsfl_43_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_43_idx+1) ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_432( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV5EmprCod ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV44ColumnsSelector ,
                                 String AV55TFPrdNum ,
                                 String AV56TFPrdNum_Sel ,
                                 String AV58TFPrdNom ,
                                 String AV59TFPrdNom_Sel ,
                                 String AV64TFPrdUcpDsc ,
                                 String AV65TFPrdUcpDsc_Sel ,
                                 java.math.BigDecimal AV61TFPrdPreAct ,
                                 java.math.BigDecimal AV62TFPrdPreAct_To ,
                                 java.math.BigDecimal AV107TFPrdDisponible ,
                                 java.math.BigDecimal AV108TFPrdDisponible_To ,
                                 String AV67TFPrvNif ,
                                 String AV68TFPrvNif_Sel ,
                                 String AV124Pgmname ,
                                 short AV14OrderedBy ,
                                 boolean AV15OrderedDsc ,
                                 boolean AV100AplicarConfirmar ,
                                 String A396EmprCod )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e20522 ();
      GRID_nCurrentRecord = 0 ;
      rf522( ) ;
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
      rf522( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV124Pgmname = "WebBCPROD" ;
      Gx_err = (short)(0) ;
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV112Webbcprodds_1_tfprdnum = AV55TFPrdNum ;
      AV113Webbcprodds_2_tfprdnum_sel = AV56TFPrdNum_Sel ;
      AV114Webbcprodds_3_tfprdnom = AV58TFPrdNom ;
      AV115Webbcprodds_4_tfprdnom_sel = AV59TFPrdNom_Sel ;
      AV116Webbcprodds_5_tfprducpdsc = AV64TFPrdUcpDsc ;
      AV117Webbcprodds_6_tfprducpdsc_sel = AV65TFPrdUcpDsc_Sel ;
      AV118Webbcprodds_7_tfprdpreact = AV61TFPrdPreAct ;
      AV119Webbcprodds_8_tfprdpreact_to = AV62TFPrdPreAct_To ;
      AV120Webbcprodds_9_tfprddisponible = AV107TFPrdDisponible ;
      AV121Webbcprodds_10_tfprddisponible_to = AV108TFPrdDisponible_To ;
      AV122Webbcprodds_11_tfprvnif = AV67TFPrvNif ;
      AV123Webbcprodds_12_tfprvnif_sel = AV68TFPrvNif_Sel ;
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV113Webbcprodds_2_tfprdnum_sel ,
                                           AV112Webbcprodds_1_tfprdnum ,
                                           AV115Webbcprodds_4_tfprdnom_sel ,
                                           AV114Webbcprodds_3_tfprdnom ,
                                           AV117Webbcprodds_6_tfprducpdsc_sel ,
                                           AV116Webbcprodds_5_tfprducpdsc ,
                                           AV118Webbcprodds_7_tfprdpreact ,
                                           AV119Webbcprodds_8_tfprdpreact_to ,
                                           AV120Webbcprodds_9_tfprddisponible ,
                                           AV121Webbcprodds_10_tfprddisponible_to ,
                                           AV123Webbcprodds_12_tfprvnif_sel ,
                                           AV122Webbcprodds_11_tfprvnif ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A737PrdUcpDsc ,
                                           A724PrdPreAct ,
                                           A704PrdExiAlm ,
                                           A685PrdCanRes ,
                                           A793PrvNif ,
                                           Short.valueOf(AV14OrderedBy) ,
                                           Boolean.valueOf(AV15OrderedDsc) ,
                                           Byte.valueOf(A856ValCod) ,
                                           A3936PrdEqLP ,
                                           AV5EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV112Webbcprodds_1_tfprdnum = GXutil.padr( GXutil.rtrim( AV112Webbcprodds_1_tfprdnum), 6, "%") ;
      lV114Webbcprodds_3_tfprdnom = GXutil.padr( GXutil.rtrim( AV114Webbcprodds_3_tfprdnom), 26, "%") ;
      lV116Webbcprodds_5_tfprducpdsc = GXutil.padr( GXutil.rtrim( AV116Webbcprodds_5_tfprducpdsc), 8, "%") ;
      lV122Webbcprodds_11_tfprvnif = GXutil.padr( GXutil.rtrim( AV122Webbcprodds_11_tfprvnif), 20, "%") ;
      /* Using cursor H00522 */
      pr_default.execute(0, new Object[] {AV5EmprCod, lV112Webbcprodds_1_tfprdnum, AV113Webbcprodds_2_tfprdnum_sel, lV114Webbcprodds_3_tfprdnom, AV115Webbcprodds_4_tfprdnom_sel, lV116Webbcprodds_5_tfprducpdsc, AV117Webbcprodds_6_tfprducpdsc_sel, AV118Webbcprodds_7_tfprdpreact, AV119Webbcprodds_8_tfprdpreact_to, AV120Webbcprodds_9_tfprddisponible, AV121Webbcprodds_10_tfprddisponible_to, lV122Webbcprodds_11_tfprvnif, AV123Webbcprodds_12_tfprvnif_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A795PrvNum = H00522_A795PrvNum[0] ;
         A856ValCod = H00522_A856ValCod[0] ;
         A3936PrdEqLP = H00522_A3936PrdEqLP[0] ;
         A742PrdUniCom = H00522_A742PrdUniCom[0] ;
         A396EmprCod = H00522_A396EmprCod[0] ;
         A793PrvNif = H00522_A793PrvNif[0] ;
         n793PrvNif = H00522_n793PrvNif[0] ;
         A724PrdPreAct = H00522_A724PrdPreAct[0] ;
         A737PrdUcpDsc = H00522_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = H00522_n737PrdUcpDsc[0] ;
         A718PrdNom = H00522_A718PrdNom[0] ;
         A719PrdNum = H00522_A719PrdNum[0] ;
         A685PrdCanRes = H00522_A685PrdCanRes[0] ;
         A704PrdExiAlm = H00522_A704PrdExiAlm[0] ;
         A793PrvNif = H00522_A793PrvNif[0] ;
         n793PrvNif = H00522_n793PrvNif[0] ;
         A737PrdUcpDsc = H00522_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = H00522_n737PrdUcpDsc[0] ;
         if ( GXutil.strcmp(A3936PrdEqLP, httpContext.getMessage( "BC", "")) != 0 )
         {
            A13831PrdDisponi = A704PrdExiAlm.subtract(A685PrdCanRes) ;
            A13747PrdCDsc = GXutil.trim( A719PrdNum) + " - " + GXutil.trim( A718PrdNom) ;
            GRID_nRecordCount = (long)(GRID_nRecordCount+1) ;
         }
         pr_default.readNext(0);
      }
      GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      pr_default.close(0);
      return (int)(GRID_nRecordCount) ;
   }

   public void rf522( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(43) ;
      /* Execute user event: Refresh */
      e20522 ();
      nGXsfl_43_idx = 1 ;
      sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_432( ) ;
      bGXsfl_43_Refreshing = true ;
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
         subsflControlProps_432( ) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              AV113Webbcprodds_2_tfprdnum_sel ,
                                              AV112Webbcprodds_1_tfprdnum ,
                                              AV115Webbcprodds_4_tfprdnom_sel ,
                                              AV114Webbcprodds_3_tfprdnom ,
                                              AV117Webbcprodds_6_tfprducpdsc_sel ,
                                              AV116Webbcprodds_5_tfprducpdsc ,
                                              AV118Webbcprodds_7_tfprdpreact ,
                                              AV119Webbcprodds_8_tfprdpreact_to ,
                                              AV120Webbcprodds_9_tfprddisponible ,
                                              AV121Webbcprodds_10_tfprddisponible_to ,
                                              AV123Webbcprodds_12_tfprvnif_sel ,
                                              AV122Webbcprodds_11_tfprvnif ,
                                              A719PrdNum ,
                                              A718PrdNom ,
                                              A737PrdUcpDsc ,
                                              A724PrdPreAct ,
                                              A704PrdExiAlm ,
                                              A685PrdCanRes ,
                                              A793PrvNif ,
                                              Short.valueOf(AV14OrderedBy) ,
                                              Boolean.valueOf(AV15OrderedDsc) ,
                                              Byte.valueOf(A856ValCod) ,
                                              A3936PrdEqLP ,
                                              AV5EmprCod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                              TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV112Webbcprodds_1_tfprdnum = GXutil.padr( GXutil.rtrim( AV112Webbcprodds_1_tfprdnum), 6, "%") ;
         lV114Webbcprodds_3_tfprdnom = GXutil.padr( GXutil.rtrim( AV114Webbcprodds_3_tfprdnom), 26, "%") ;
         lV116Webbcprodds_5_tfprducpdsc = GXutil.padr( GXutil.rtrim( AV116Webbcprodds_5_tfprducpdsc), 8, "%") ;
         lV122Webbcprodds_11_tfprvnif = GXutil.padr( GXutil.rtrim( AV122Webbcprodds_11_tfprvnif), 20, "%") ;
         /* Using cursor H00523 */
         pr_default.execute(1, new Object[] {AV5EmprCod, lV112Webbcprodds_1_tfprdnum, AV113Webbcprodds_2_tfprdnum_sel, lV114Webbcprodds_3_tfprdnom, AV115Webbcprodds_4_tfprdnom_sel, lV116Webbcprodds_5_tfprducpdsc, AV117Webbcprodds_6_tfprducpdsc_sel, AV118Webbcprodds_7_tfprdpreact, AV119Webbcprodds_8_tfprdpreact_to, AV120Webbcprodds_9_tfprddisponible, AV121Webbcprodds_10_tfprddisponible_to, lV122Webbcprodds_11_tfprvnif, AV123Webbcprodds_12_tfprvnif_sel});
         nGXsfl_43_idx = 1 ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_432( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A795PrvNum = H00523_A795PrvNum[0] ;
            A856ValCod = H00523_A856ValCod[0] ;
            A3936PrdEqLP = H00523_A3936PrdEqLP[0] ;
            A742PrdUniCom = H00523_A742PrdUniCom[0] ;
            A396EmprCod = H00523_A396EmprCod[0] ;
            A793PrvNif = H00523_A793PrvNif[0] ;
            n793PrvNif = H00523_n793PrvNif[0] ;
            A724PrdPreAct = H00523_A724PrdPreAct[0] ;
            A737PrdUcpDsc = H00523_A737PrdUcpDsc[0] ;
            n737PrdUcpDsc = H00523_n737PrdUcpDsc[0] ;
            A718PrdNom = H00523_A718PrdNom[0] ;
            A719PrdNum = H00523_A719PrdNum[0] ;
            A685PrdCanRes = H00523_A685PrdCanRes[0] ;
            A704PrdExiAlm = H00523_A704PrdExiAlm[0] ;
            A793PrvNif = H00523_A793PrvNif[0] ;
            n793PrvNif = H00523_n793PrvNif[0] ;
            A737PrdUcpDsc = H00523_A737PrdUcpDsc[0] ;
            n737PrdUcpDsc = H00523_n737PrdUcpDsc[0] ;
            if ( GXutil.strcmp(A3936PrdEqLP, httpContext.getMessage( "BC", "")) != 0 )
            {
               A13831PrdDisponi = A704PrdExiAlm.subtract(A685PrdCanRes) ;
               A13747PrdCDsc = GXutil.trim( A719PrdNum) + " - " + GXutil.trim( A718PrdNom) ;
               e21522 ();
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(43) ;
         wb520( ) ;
      }
      bGXsfl_43_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes522( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV124Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV124Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
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
      AV112Webbcprodds_1_tfprdnum = AV55TFPrdNum ;
      AV113Webbcprodds_2_tfprdnum_sel = AV56TFPrdNum_Sel ;
      AV114Webbcprodds_3_tfprdnom = AV58TFPrdNom ;
      AV115Webbcprodds_4_tfprdnom_sel = AV59TFPrdNom_Sel ;
      AV116Webbcprodds_5_tfprducpdsc = AV64TFPrdUcpDsc ;
      AV117Webbcprodds_6_tfprducpdsc_sel = AV65TFPrdUcpDsc_Sel ;
      AV118Webbcprodds_7_tfprdpreact = AV61TFPrdPreAct ;
      AV119Webbcprodds_8_tfprdpreact_to = AV62TFPrdPreAct_To ;
      AV120Webbcprodds_9_tfprddisponible = AV107TFPrdDisponible ;
      AV121Webbcprodds_10_tfprddisponible_to = AV108TFPrdDisponible_To ;
      AV122Webbcprodds_11_tfprvnif = AV67TFPrvNif ;
      AV123Webbcprodds_12_tfprvnif_sel = AV68TFPrvNif_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV5EmprCod, AV44ColumnsSelector, AV55TFPrdNum, AV56TFPrdNum_Sel, AV58TFPrdNom, AV59TFPrdNom_Sel, AV64TFPrdUcpDsc, AV65TFPrdUcpDsc_Sel, AV61TFPrdPreAct, AV62TFPrdPreAct_To, AV107TFPrdDisponible, AV108TFPrdDisponible_To, AV67TFPrvNif, AV68TFPrvNif_Sel, AV124Pgmname, AV14OrderedBy, AV15OrderedDsc, AV100AplicarConfirmar, A396EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV112Webbcprodds_1_tfprdnum = AV55TFPrdNum ;
      AV113Webbcprodds_2_tfprdnum_sel = AV56TFPrdNum_Sel ;
      AV114Webbcprodds_3_tfprdnom = AV58TFPrdNom ;
      AV115Webbcprodds_4_tfprdnom_sel = AV59TFPrdNom_Sel ;
      AV116Webbcprodds_5_tfprducpdsc = AV64TFPrdUcpDsc ;
      AV117Webbcprodds_6_tfprducpdsc_sel = AV65TFPrdUcpDsc_Sel ;
      AV118Webbcprodds_7_tfprdpreact = AV61TFPrdPreAct ;
      AV119Webbcprodds_8_tfprdpreact_to = AV62TFPrdPreAct_To ;
      AV120Webbcprodds_9_tfprddisponible = AV107TFPrdDisponible ;
      AV121Webbcprodds_10_tfprddisponible_to = AV108TFPrdDisponible_To ;
      AV122Webbcprodds_11_tfprvnif = AV67TFPrvNif ;
      AV123Webbcprodds_12_tfprvnif_sel = AV68TFPrvNif_Sel ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV5EmprCod, AV44ColumnsSelector, AV55TFPrdNum, AV56TFPrdNum_Sel, AV58TFPrdNom, AV59TFPrdNom_Sel, AV64TFPrdUcpDsc, AV65TFPrdUcpDsc_Sel, AV61TFPrdPreAct, AV62TFPrdPreAct_To, AV107TFPrdDisponible, AV108TFPrdDisponible_To, AV67TFPrvNif, AV68TFPrvNif_Sel, AV124Pgmname, AV14OrderedBy, AV15OrderedDsc, AV100AplicarConfirmar, A396EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV112Webbcprodds_1_tfprdnum = AV55TFPrdNum ;
      AV113Webbcprodds_2_tfprdnum_sel = AV56TFPrdNum_Sel ;
      AV114Webbcprodds_3_tfprdnom = AV58TFPrdNom ;
      AV115Webbcprodds_4_tfprdnom_sel = AV59TFPrdNom_Sel ;
      AV116Webbcprodds_5_tfprducpdsc = AV64TFPrdUcpDsc ;
      AV117Webbcprodds_6_tfprducpdsc_sel = AV65TFPrdUcpDsc_Sel ;
      AV118Webbcprodds_7_tfprdpreact = AV61TFPrdPreAct ;
      AV119Webbcprodds_8_tfprdpreact_to = AV62TFPrdPreAct_To ;
      AV120Webbcprodds_9_tfprddisponible = AV107TFPrdDisponible ;
      AV121Webbcprodds_10_tfprddisponible_to = AV108TFPrdDisponible_To ;
      AV122Webbcprodds_11_tfprvnif = AV67TFPrvNif ;
      AV123Webbcprodds_12_tfprvnif_sel = AV68TFPrvNif_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5EmprCod, AV44ColumnsSelector, AV55TFPrdNum, AV56TFPrdNum_Sel, AV58TFPrdNom, AV59TFPrdNom_Sel, AV64TFPrdUcpDsc, AV65TFPrdUcpDsc_Sel, AV61TFPrdPreAct, AV62TFPrdPreAct_To, AV107TFPrdDisponible, AV108TFPrdDisponible_To, AV67TFPrvNif, AV68TFPrvNif_Sel, AV124Pgmname, AV14OrderedBy, AV15OrderedDsc, AV100AplicarConfirmar, A396EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV112Webbcprodds_1_tfprdnum = AV55TFPrdNum ;
      AV113Webbcprodds_2_tfprdnum_sel = AV56TFPrdNum_Sel ;
      AV114Webbcprodds_3_tfprdnom = AV58TFPrdNom ;
      AV115Webbcprodds_4_tfprdnom_sel = AV59TFPrdNom_Sel ;
      AV116Webbcprodds_5_tfprducpdsc = AV64TFPrdUcpDsc ;
      AV117Webbcprodds_6_tfprducpdsc_sel = AV65TFPrdUcpDsc_Sel ;
      AV118Webbcprodds_7_tfprdpreact = AV61TFPrdPreAct ;
      AV119Webbcprodds_8_tfprdpreact_to = AV62TFPrdPreAct_To ;
      AV120Webbcprodds_9_tfprddisponible = AV107TFPrdDisponible ;
      AV121Webbcprodds_10_tfprddisponible_to = AV108TFPrdDisponible_To ;
      AV122Webbcprodds_11_tfprvnif = AV67TFPrvNif ;
      AV123Webbcprodds_12_tfprvnif_sel = AV68TFPrvNif_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5EmprCod, AV44ColumnsSelector, AV55TFPrdNum, AV56TFPrdNum_Sel, AV58TFPrdNom, AV59TFPrdNom_Sel, AV64TFPrdUcpDsc, AV65TFPrdUcpDsc_Sel, AV61TFPrdPreAct, AV62TFPrdPreAct_To, AV107TFPrdDisponible, AV108TFPrdDisponible_To, AV67TFPrvNif, AV68TFPrvNif_Sel, AV124Pgmname, AV14OrderedBy, AV15OrderedDsc, AV100AplicarConfirmar, A396EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV112Webbcprodds_1_tfprdnum = AV55TFPrdNum ;
      AV113Webbcprodds_2_tfprdnum_sel = AV56TFPrdNum_Sel ;
      AV114Webbcprodds_3_tfprdnom = AV58TFPrdNom ;
      AV115Webbcprodds_4_tfprdnom_sel = AV59TFPrdNom_Sel ;
      AV116Webbcprodds_5_tfprducpdsc = AV64TFPrdUcpDsc ;
      AV117Webbcprodds_6_tfprducpdsc_sel = AV65TFPrdUcpDsc_Sel ;
      AV118Webbcprodds_7_tfprdpreact = AV61TFPrdPreAct ;
      AV119Webbcprodds_8_tfprdpreact_to = AV62TFPrdPreAct_To ;
      AV120Webbcprodds_9_tfprddisponible = AV107TFPrdDisponible ;
      AV121Webbcprodds_10_tfprddisponible_to = AV108TFPrdDisponible_To ;
      AV122Webbcprodds_11_tfprvnif = AV67TFPrvNif ;
      AV123Webbcprodds_12_tfprvnif_sel = AV68TFPrvNif_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5EmprCod, AV44ColumnsSelector, AV55TFPrdNum, AV56TFPrdNum_Sel, AV58TFPrdNom, AV59TFPrdNom_Sel, AV64TFPrdUcpDsc, AV65TFPrdUcpDsc_Sel, AV61TFPrdPreAct, AV62TFPrdPreAct_To, AV107TFPrdDisponible, AV108TFPrdDisponible_To, AV67TFPrvNif, AV68TFPrvNif_Sel, AV124Pgmname, AV14OrderedBy, AV15OrderedDsc, AV100AplicarConfirmar, A396EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV124Pgmname = "WebBCPROD" ;
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup520( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e19522 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV70DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV44ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_43 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_43"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV72GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV73GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
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
         Dvpanel_tableconfirmar_Width = httpContext.cgiGet( "DVPANEL_TABLECONFIRMAR_Width") ;
         Dvpanel_tableconfirmar_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLECONFIRMAR_Autowidth")) ;
         Dvpanel_tableconfirmar_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLECONFIRMAR_Autoheight")) ;
         Dvpanel_tableconfirmar_Cls = httpContext.cgiGet( "DVPANEL_TABLECONFIRMAR_Cls") ;
         Dvpanel_tableconfirmar_Title = httpContext.cgiGet( "DVPANEL_TABLECONFIRMAR_Title") ;
         Dvpanel_tableconfirmar_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLECONFIRMAR_Collapsible")) ;
         Dvpanel_tableconfirmar_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLECONFIRMAR_Collapsed")) ;
         Dvpanel_tableconfirmar_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLECONFIRMAR_Showcollapseicon")) ;
         Dvpanel_tableconfirmar_Iconposition = httpContext.cgiGet( "DVPANEL_TABLECONFIRMAR_Iconposition") ;
         Dvpanel_tableconfirmar_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLECONFIRMAR_Autoscroll")) ;
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
         Ddo_grid_Fixable = httpContext.cgiGet( "DDO_GRID_Fixable") ;
         Ddo_grid_Sortedstatus = httpContext.cgiGet( "DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( "DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( "DDO_GRID_Filtertype") ;
         Ddo_grid_Filterisrange = httpContext.cgiGet( "DDO_GRID_Filterisrange") ;
         Ddo_grid_Includedatalist = httpContext.cgiGet( "DDO_GRID_Includedatalist") ;
         Ddo_grid_Datalisttype = httpContext.cgiGet( "DDO_GRID_Datalisttype") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( "DDO_GRID_Datalistproc") ;
         Innewwindow1_Width = httpContext.cgiGet( "INNEWWINDOW1_Width") ;
         Innewwindow1_Height = httpContext.cgiGet( "INNEWWINDOW1_Height") ;
         Innewwindow1_Target = httpContext.cgiGet( "INNEWWINDOW1_Target") ;
         Ddo_gridcolumnsselector_Caption = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Caption") ;
         Ddo_gridcolumnsselector_Tooltip = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Tooltip") ;
         Ddo_gridcolumnsselector_Cls = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Cls") ;
         Ddo_gridcolumnsselector_Dropdownoptionstype = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype") ;
         Ddo_gridcolumnsselector_Gridinternalname = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Gridinternalname") ;
         Ddo_gridcolumnsselector_Titlecontrolidtoreplace = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hascolumnsselector")) ;
         Grid_empowerer_Fixedcolumns = httpContext.cgiGet( "GRID_EMPOWERER_Fixedcolumns") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( "GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( "DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( "DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( "DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( "DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( "DDO_GRID_Selectedcolumn") ;
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
      e19522 ();
      if (returnInSub) return;
   }

   public void e19522( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV111Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webbcprod_impl.this.GXt_char1 = GXv_char2[0] ;
      AV111Station = GXt_char1 ;
      GXv_char2[0] = AV5EmprCod ;
      GXv_char3[0] = AV98EmprNom ;
      GXv_char4[0] = AV99UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV111Station, GXv_char2, GXv_char3, GXv_char4) ;
      webbcprod_impl.this.AV5EmprCod = GXv_char2[0] ;
      webbcprod_impl.this.AV98EmprNom = GXv_char3[0] ;
      webbcprod_impl.this.AV99UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
      AV100AplicarConfirmar = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV100AplicarConfirmar", AV100AplicarConfirmar);
      GXt_char1 = AV111Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      webbcprod_impl.this.GXt_char1 = GXv_char4[0] ;
      AV111Station = GXt_char1 ;
      GXv_char4[0] = AV5EmprCod ;
      GXv_char3[0] = AV98EmprNom ;
      GXv_char2[0] = AV99UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV111Station, GXv_char4, GXv_char3, GXv_char2) ;
      webbcprod_impl.this.AV5EmprCod = GXv_char4[0] ;
      webbcprod_impl.this.AV98EmprNom = GXv_char3[0] ;
      webbcprod_impl.this.AV99UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( "Envío de datos de productos químicos de Datamon a BC", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      if ( AV14OrderedBy < 1 )
      {
         AV14OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV70DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV70DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e20522( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV7WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV7WWPContext = GXv_SdtWWPContext7[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV50Session.getValue("WebBCPRODColumnsSelector"), "") != 0 )
      {
         AV32ColumnsSelectorXML = AV50Session.getValue("WebBCPRODColumnsSelector") ;
         AV44ColumnsSelector.fromxml(AV32ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S152 ();
         if (returnInSub) return;
      }
      edtPrdNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV44ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrdNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV44ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrdUcpDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV44ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdUcpDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdUcpDsc_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrdPreAct_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV44ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdPreAct_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPreAct_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrdDisponi_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV44ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdDisponi_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdDisponi_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrvNif_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV44ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvNif_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNif_Visible), 5, 0), !bGXsfl_43_Refreshing);
      AV72GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV72GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72GridCurrentPage), 10, 0));
      AV73GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73GridPageCount), 10, 0));
      AV112Webbcprodds_1_tfprdnum = AV55TFPrdNum ;
      AV113Webbcprodds_2_tfprdnum_sel = AV56TFPrdNum_Sel ;
      AV114Webbcprodds_3_tfprdnom = AV58TFPrdNom ;
      AV115Webbcprodds_4_tfprdnom_sel = AV59TFPrdNom_Sel ;
      AV116Webbcprodds_5_tfprducpdsc = AV64TFPrdUcpDsc ;
      AV117Webbcprodds_6_tfprducpdsc_sel = AV65TFPrdUcpDsc_Sel ;
      AV118Webbcprodds_7_tfprdpreact = AV61TFPrdPreAct ;
      AV119Webbcprodds_8_tfprdpreact_to = AV62TFPrdPreAct_To ;
      AV120Webbcprodds_9_tfprddisponible = AV107TFPrdDisponible ;
      AV121Webbcprodds_10_tfprddisponible_to = AV108TFPrdDisponible_To ;
      AV122Webbcprodds_11_tfprvnif = AV67TFPrvNif ;
      AV123Webbcprodds_12_tfprvnif_sel = AV68TFPrvNif_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV44ColumnsSelector", AV44ColumnsSelector);
   }

   public void e11522( )
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
         AV71PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV71PageToGo) ;
      }
   }

   public void e12522( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e13522( )
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
         S132 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNum") == 0 )
         {
            AV55TFPrdNum = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFPrdNum", AV55TFPrdNum);
            AV56TFPrdNum_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFPrdNum_Sel", AV56TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNom") == 0 )
         {
            AV58TFPrdNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFPrdNom", AV58TFPrdNom);
            AV59TFPrdNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFPrdNom_Sel", AV59TFPrdNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdUcpDsc") == 0 )
         {
            AV64TFPrdUcpDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFPrdUcpDsc", AV64TFPrdUcpDsc);
            AV65TFPrdUcpDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFPrdUcpDsc_Sel", AV65TFPrdUcpDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdPreAct") == 0 )
         {
            AV61TFPrdPreAct = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFPrdPreAct", GXutil.ltrimstr( AV61TFPrdPreAct, 14, 5));
            AV62TFPrdPreAct_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFPrdPreAct_To", GXutil.ltrimstr( AV62TFPrdPreAct_To, 14, 5));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdDisponible") == 0 )
         {
            AV107TFPrdDisponible = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV107TFPrdDisponible", GXutil.ltrimstr( AV107TFPrdDisponible, 12, 4));
            AV108TFPrdDisponible_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV108TFPrdDisponible_To", GXutil.ltrimstr( AV108TFPrdDisponible_To, 12, 4));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvNif") == 0 )
         {
            AV67TFPrvNif = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFPrvNif", AV67TFPrvNif);
            AV68TFPrvNif_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFPrvNif_Sel", AV68TFPrvNif_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e21522( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         if ( AV100AplicarConfirmar )
         {
            /* Execute user subroutine: 'APLICAR CONFIRMAR' */
            S162 ();
            if (returnInSub) return;
         }
         cmbavGridactions.removeAllItems();
         cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
         cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
         edtPrdUcpDsc_Link = formatLink("app.stocksquimicos.ttipuniview", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A742PrdUniCom,1,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","UniCod","TabCode"})  ;
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(43) ;
         }
         sendrow_432( ) ;
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
      if ( isFullAjaxMode( ) && ! bGXsfl_43_Refreshing )
      {
         httpContext.doAjaxLoad(43, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV106GridActions, 4, 0)) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV44ColumnsSelector", AV44ColumnsSelector);
   }

   public void e14522( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV32ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV44ColumnsSelector.fromJSonString(AV32ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "WebBCPRODColumnsSelector", ((GXutil.strcmp("", AV32ColumnsSelectorXML)==0) ? "" : AV44ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV44ColumnsSelector", AV44ColumnsSelector);
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e15522 ();
      if (returnInSub) return;
   }

   public void e15522( )
   {
      /* Enter Routine */
      returnInSub = false ;
      AV100AplicarConfirmar = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV100AplicarConfirmar", AV100AplicarConfirmar);
      /* Execute user subroutine: 'APLICAR CONFIRMAR' */
      S162 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV44ColumnsSelector", AV44ColumnsSelector);
   }

   public void e16522( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      GXv_char4[0] = AV30ExcelFilename ;
      GXv_char3[0] = AV31ErrorMessage ;
      new app.webbcprodexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      webbcprod_impl.this.AV30ExcelFilename = GXv_char4[0] ;
      webbcprod_impl.this.AV31ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV30ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV30ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV31ErrorMessage);
      }
      /*  Sending Event outputs  */
   }

   public void e17522( )
   {
      /* 'DoExportReport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      Innewwindow1_Target = formatLink("app.webbcprodexportreport", new String[] {}, new String[] {})  ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Target", Innewwindow1_Target);
      Innewwindow1_Height = "600" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Height", Innewwindow1_Height);
      Innewwindow1_Width = "800" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Width", Innewwindow1_Width);
      this.executeUsercontrolMethod("", false, "INNEWWINDOW1Container", "OpenWindow", "", new Object[] {});
      /*  Sending Event outputs  */
   }

   public void e18522( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.webbcprodexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
   }

   public void S132( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV14OrderedBy, 4, 0))+":"+(AV15OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S152( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV44ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8[0] = AV44ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdNum", "", "Producto", true, "") ;
      AV44ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV44ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdNom", "", "Descripcion", true, "") ;
      AV44ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV44ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdUcpDsc", "", "Unidad", true, "") ;
      AV44ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV44ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdPreAct", "", "Precio Actual", true, "") ;
      AV44ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV44ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdDisponible", "", "Disponible", true, "") ;
      AV44ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV44ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrvNif", "", "N.I.F.", true, "") ;
      AV44ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV39UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WebBCPRODColumnsSelector", GXv_char4) ;
      webbcprod_impl.this.GXt_char1 = GXv_char4[0] ;
      AV39UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV39UserCustomValue)==0) ) )
      {
         AV45ColumnsSelectorAux.fromxml(AV39UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector8[0] = AV45ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector9[0] = AV44ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, GXv_SdtWWPColumnsSelector9) ;
         AV45ColumnsSelectorAux = GXv_SdtWWPColumnsSelector8[0] ;
         AV44ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
   }

   public void S172( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.ttproduc", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A719PrdNum))}, new String[] {"Mode","EmprCod","PrdNum"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S182( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.ttproduc", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A719PrdNum))}, new String[] {"Mode","EmprCod","PrdNum"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV50Session.getValue(AV124Pgmname+"GridState"), "") == 0 )
      {
         AV11GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV124Pgmname+"GridState"), null, null);
      }
      else
      {
         AV11GridState.fromxml(AV50Session.getValue(AV124Pgmname+"GridState"), null, null);
      }
      AV14OrderedBy = AV11GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14OrderedBy), 4, 0));
      AV15OrderedDsc = AV11GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15OrderedDsc", AV15OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S132 ();
      if (returnInSub) return;
      AV125GXV1 = 1 ;
      while ( AV125GXV1 <= AV11GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV12GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV11GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV125GXV1));
         if ( GXutil.strcmp(AV12GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV55TFPrdNum = AV12GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFPrdNum", AV55TFPrdNum);
         }
         else if ( GXutil.strcmp(AV12GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV56TFPrdNum_Sel = AV12GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFPrdNum_Sel", AV56TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(AV12GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV58TFPrdNom = AV12GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFPrdNom", AV58TFPrdNom);
         }
         else if ( GXutil.strcmp(AV12GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV59TFPrdNom_Sel = AV12GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFPrdNom_Sel", AV59TFPrdNom_Sel);
         }
         else if ( GXutil.strcmp(AV12GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDUCPDSC") == 0 )
         {
            AV64TFPrdUcpDsc = AV12GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFPrdUcpDsc", AV64TFPrdUcpDsc);
         }
         else if ( GXutil.strcmp(AV12GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDUCPDSC_SEL") == 0 )
         {
            AV65TFPrdUcpDsc_Sel = AV12GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFPrdUcpDsc_Sel", AV65TFPrdUcpDsc_Sel);
         }
         else if ( GXutil.strcmp(AV12GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDPREACT") == 0 )
         {
            AV61TFPrdPreAct = CommonUtil.decimalVal( AV12GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFPrdPreAct", GXutil.ltrimstr( AV61TFPrdPreAct, 14, 5));
            AV62TFPrdPreAct_To = CommonUtil.decimalVal( AV12GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFPrdPreAct_To", GXutil.ltrimstr( AV62TFPrdPreAct_To, 14, 5));
         }
         else if ( GXutil.strcmp(AV12GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDDISPONIBLE") == 0 )
         {
            AV107TFPrdDisponible = CommonUtil.decimalVal( AV12GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV107TFPrdDisponible", GXutil.ltrimstr( AV107TFPrdDisponible, 12, 4));
            AV108TFPrdDisponible_To = CommonUtil.decimalVal( AV12GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV108TFPrdDisponible_To", GXutil.ltrimstr( AV108TFPrdDisponible_To, 12, 4));
         }
         else if ( GXutil.strcmp(AV12GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNIF") == 0 )
         {
            AV67TFPrvNif = AV12GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFPrvNif", AV67TFPrvNif);
         }
         else if ( GXutil.strcmp(AV12GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNIF_SEL") == 0 )
         {
            AV68TFPrvNif_Sel = AV12GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFPrvNif_Sel", AV68TFPrvNif_Sel);
         }
         AV125GXV1 = (int)(AV125GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV56TFPrdNum_Sel)==0), AV56TFPrdNum_Sel, GXv_char4) ;
      webbcprod_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char10 = "" ;
      GXv_char3[0] = GXt_char10 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV59TFPrdNom_Sel)==0), AV59TFPrdNom_Sel, GXv_char3) ;
      webbcprod_impl.this.GXt_char10 = GXv_char3[0] ;
      GXt_char11 = "" ;
      GXv_char2[0] = GXt_char11 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV65TFPrdUcpDsc_Sel)==0), AV65TFPrdUcpDsc_Sel, GXv_char2) ;
      webbcprod_impl.this.GXt_char11 = GXv_char2[0] ;
      GXt_char12 = "" ;
      GXv_char13[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV68TFPrvNif_Sel)==0), AV68TFPrvNif_Sel, GXv_char13) ;
      webbcprod_impl.this.GXt_char12 = GXv_char13[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|"+GXt_char10+"|"+GXt_char11+"|||"+GXt_char12 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char12 = "" ;
      GXv_char13[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV55TFPrdNum)==0), AV55TFPrdNum, GXv_char13) ;
      webbcprod_impl.this.GXt_char12 = GXv_char13[0] ;
      GXt_char11 = "" ;
      GXv_char4[0] = GXt_char11 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV58TFPrdNom)==0), AV58TFPrdNom, GXv_char4) ;
      webbcprod_impl.this.GXt_char11 = GXv_char4[0] ;
      GXt_char10 = "" ;
      GXv_char3[0] = GXt_char10 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV64TFPrdUcpDsc)==0), AV64TFPrdUcpDsc, GXv_char3) ;
      webbcprod_impl.this.GXt_char10 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV67TFPrvNif)==0), AV67TFPrvNif, GXv_char2) ;
      webbcprod_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = GXt_char12+"|"+GXt_char11+"|"+GXt_char10+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV61TFPrdPreAct)==0) ? "" : GXutil.str( AV61TFPrdPreAct, 14, 5))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV107TFPrdDisponible)==0) ? "" : GXutil.str( AV107TFPrdDisponible, 12, 4))+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV62TFPrdPreAct_To)==0) ? "" : GXutil.str( AV62TFPrdPreAct_To, 14, 5))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV108TFPrdDisponible_To)==0) ? "" : GXutil.str( AV108TFPrdDisponible_To, 12, 4))+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
      if ( ! (GXutil.strcmp("", GXutil.trim( AV11GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV11GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV11GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S142( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV11GridState.fromxml(AV50Session.getValue(AV124Pgmname+"GridState"), null, null);
      AV11GridState.setgxTv_SdtWWPGridState_Orderedby( AV14OrderedBy );
      AV11GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV15OrderedDsc );
      AV11GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState14[0] = AV11GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFPRDNUM", "", !(GXutil.strcmp("", AV55TFPrdNum)==0), (short)(0), AV55TFPrdNum, "", !(GXutil.strcmp("", AV56TFPrdNum_Sel)==0), AV56TFPrdNum_Sel, "") ;
      AV11GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV11GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFPRDNOM", "", !(GXutil.strcmp("", AV58TFPrdNom)==0), (short)(0), AV58TFPrdNom, "", !(GXutil.strcmp("", AV59TFPrdNom_Sel)==0), AV59TFPrdNom_Sel, "") ;
      AV11GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV11GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFPRDUCPDSC", "", !(GXutil.strcmp("", AV64TFPrdUcpDsc)==0), (short)(0), AV64TFPrdUcpDsc, "", !(GXutil.strcmp("", AV65TFPrdUcpDsc_Sel)==0), AV65TFPrdUcpDsc_Sel, "") ;
      AV11GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV11GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFPRDPREACT", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV61TFPrdPreAct)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV62TFPrdPreAct_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV61TFPrdPreAct, 14, 5)), GXutil.trim( GXutil.str( AV62TFPrdPreAct_To, 14, 5))) ;
      AV11GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV11GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFPRDDISPONIBLE", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV107TFPrdDisponible)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV108TFPrdDisponible_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV107TFPrdDisponible, 12, 4)), GXutil.trim( GXutil.str( AV108TFPrdDisponible_To, 12, 4))) ;
      AV11GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV11GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFPRVNIF", "", !(GXutil.strcmp("", AV67TFPrvNif)==0), (short)(0), AV67TFPrvNif, "", !(GXutil.strcmp("", AV68TFPrvNif_Sel)==0), AV68TFPrvNif_Sel, "") ;
      AV11GridState = GXv_SdtWWPGridState14[0] ;
      AV11GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV11GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV124Pgmname+"GridState", AV11GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV9TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV9TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV124Pgmname );
      AV9TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV9TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV8HTTPRequest.getScriptName()+"?"+AV8HTTPRequest.getQuerystring() );
      AV9TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TTproduc" );
      AV50Session.setValue("TrnContext", AV9TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S162( )
   {
      /* 'APLICAR CONFIRMAR' Routine */
      returnInSub = false ;
      if ( AV100AplicarConfirmar )
      {
         GXv_char13[0] = AV5EmprCod ;
         GXv_char4[0] = A719PrdNum ;
         new app.pbcprod(remoteHandle, context).execute( GXv_char13, GXv_char4) ;
         webbcprod_impl.this.AV5EmprCod = GXv_char13[0] ;
         webbcprod_impl.this.A719PrdNum = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
      }
      if ( ! ( subgrid_fnc_pagecount( ) > 0 ) )
      {
         if ( AV100AplicarConfirmar )
         {
            AV100AplicarConfirmar = false ;
            httpContext.ajax_rsp_assign_attri("", false, "AV100AplicarConfirmar", AV100AplicarConfirmar);
            httpContext.doAjaxRefresh();
         }
      }
      else
      {
         if ( AV100AplicarConfirmar && ( subGrid_Rows > 0 ) )
         {
            gxgrgrid_refresh( subGrid_Rows, AV5EmprCod, AV44ColumnsSelector, AV55TFPrdNum, AV56TFPrdNum_Sel, AV58TFPrdNom, AV59TFPrdNom_Sel, AV64TFPrdUcpDsc, AV65TFPrdUcpDsc_Sel, AV61TFPrdPreAct, AV62TFPrdPreAct_To, AV107TFPrdDisponible, AV108TFPrdDisponible_To, AV67TFPrvNif, AV68TFPrvNif_Sel, AV124Pgmname, AV14OrderedBy, AV15OrderedDsc, AV100AplicarConfirmar, A396EmprCod) ;
         }
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
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
      pa522( ) ;
      ws522( ) ;
      we522( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116111438", true, true);
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
      httpContext.AddJavascriptSource("webbcprod.js", "?202682116111439", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
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

   public void subsflControlProps_432( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_43_idx );
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_43_idx ;
      edtPrdNom_Internalname = "PRDNOM_"+sGXsfl_43_idx ;
      edtPrdUcpDsc_Internalname = "PRDUCPDSC_"+sGXsfl_43_idx ;
      edtPrdPreAct_Internalname = "PRDPREACT_"+sGXsfl_43_idx ;
      edtPrdCDsc_Internalname = "PRDCDSC_"+sGXsfl_43_idx ;
      edtPrdDisponi_Internalname = "PRDDISPONI_"+sGXsfl_43_idx ;
      edtPrvNif_Internalname = "PRVNIF_"+sGXsfl_43_idx ;
   }

   public void subsflControlProps_fel_432( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_43_fel_idx );
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_43_fel_idx ;
      edtPrdNom_Internalname = "PRDNOM_"+sGXsfl_43_fel_idx ;
      edtPrdUcpDsc_Internalname = "PRDUCPDSC_"+sGXsfl_43_fel_idx ;
      edtPrdPreAct_Internalname = "PRDPREACT_"+sGXsfl_43_fel_idx ;
      edtPrdCDsc_Internalname = "PRDCDSC_"+sGXsfl_43_fel_idx ;
      edtPrdDisponi_Internalname = "PRDDISPONI_"+sGXsfl_43_fel_idx ;
      edtPrvNif_Internalname = "PRVNIF_"+sGXsfl_43_fel_idx ;
   }

   public void sendrow_432( )
   {
      subsflControlProps_432( ) ;
      wb520( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_43_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_43_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_43_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 44,'',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_43_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV106GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV106GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV106GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV106GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(7),"'"+""+"'"+",false,"+"'"+"e22522_client"+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,44);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV106GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_43_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNom_Internalname,GXutil.rtrim( A718PrdNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdUcpDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdUcpDsc_Internalname,GXutil.rtrim( A737PrdUcpDsc),"","","'"+""+"'"+",false,"+"'"+""+"'",edtPrdUcpDsc_Link,"","","",edtPrdUcpDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdUcpDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdPreAct_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdPreAct_Internalname,GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A724PrdPreAct, "ZZZZZZZ9.999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdPreAct_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdPreAct_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdCDsc_Internalname,A13747PrdCDsc,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdCDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdDisponi_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdDisponi_Internalname,GXutil.ltrim( localUtil.ntoc( A13831PrdDisponi, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A13831PrdDisponi, "ZZZZZZ9.9999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdDisponi_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdDisponi_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrvNif_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvNif_Internalname,GXutil.rtrim( A793PrvNif),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrvNif_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrvNif_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes522( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_43_idx = ((subGrid_Islastpage==1)&&(nGXsfl_43_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_43_idx+1) ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_432( ) ;
      }
      /* End function sendrow_432 */
   }

   public void startgridcontrol43( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"43\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdUcpDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdPreAct_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Precio Actual", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdDisponi_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Disponible", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrvNif_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N.I.F.", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV106GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A719PrdNum));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A718PrdNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A737PrdUcpDsc));
         GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtPrdUcpDsc_Link));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdUcpDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdPreAct_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A13747PrdCDsc);
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13831PrdDisponi, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdDisponi_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A793PrvNif));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrvNif_Visible, (byte)(5), (byte)(0), ".", "")));
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
      bttBtnexport_Internalname = "BTNEXPORT" ;
      bttBtnexportreport_Internalname = "BTNEXPORTREPORT" ;
      bttBtnexportcsv_Internalname = "BTNEXPORTCSV" ;
      bttBtneditcolumns_Internalname = "BTNEDITCOLUMNS" ;
      divTableactions_Internalname = "TABLEACTIONS" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      divTableactionsconfirmar_Internalname = "TABLEACTIONSCONFIRMAR" ;
      divTableconfirmar_Internalname = "TABLECONFIRMAR" ;
      Dvpanel_tableconfirmar_Internalname = "DVPANEL_TABLECONFIRMAR" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtPrdNum_Internalname = "PRDNUM" ;
      edtPrdNom_Internalname = "PRDNOM" ;
      edtPrdUcpDsc_Internalname = "PRDUCPDSC" ;
      edtPrdPreAct_Internalname = "PRDPREACT" ;
      edtPrdCDsc_Internalname = "PRDCDSC" ;
      edtPrdDisponi_Internalname = "PRDDISPONI" ;
      edtPrvNif_Internalname = "PRVNIF" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Innewwindow1_Internalname = "INNEWWINDOW1" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
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
      edtPrvNif_Jsonclick = "" ;
      edtPrdDisponi_Jsonclick = "" ;
      edtPrdCDsc_Jsonclick = "" ;
      edtPrdPreAct_Jsonclick = "" ;
      edtPrdUcpDsc_Jsonclick = "" ;
      edtPrdUcpDsc_Link = "" ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNum_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtPrvNif_Visible = -1 ;
      edtPrdDisponi_Visible = -1 ;
      edtPrdPreAct_Visible = -1 ;
      edtPrdUcpDsc_Visible = -1 ;
      edtPrdNom_Visible = -1 ;
      edtPrdNum_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;" ;
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
      Ddo_grid_Datalistproc = "WebBCPRODGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic|Dynamic|Dynamic|||Dynamic" ;
      Ddo_grid_Includedatalist = "T|T|T|||T" ;
      Ddo_grid_Filterisrange = "|||T|T|" ;
      Ddo_grid_Filtertype = "Character|Character|Character|Numeric|Numeric|Character" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T|T|T||T" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4||5" ;
      Ddo_grid_Columnids = "1:PrdNum|2:PrdNom|3:PrdUcpDsc|4:PrdPreAct|6:PrdDisponible|7:PrvNif" ;
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
      Dvpanel_tableconfirmar_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableconfirmar_Iconposition = "Right" ;
      Dvpanel_tableconfirmar_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableconfirmar_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tableconfirmar_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tableconfirmar_Title = httpContext.getMessage( "Confirmar", "") ;
      Dvpanel_tableconfirmar_Cls = "PanelNoHeader" ;
      Dvpanel_tableconfirmar_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableconfirmar_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableconfirmar_Width = "100%" ;
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
      Form.setCaption( httpContext.getMessage( "Envío de datos de productos químicos de Datamon a BC", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_43_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV106GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV106GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV106GridActions), 4, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV100AplicarConfirmar',fld:'vAPLICARCONFIRMAR',pic:''},{av:'AV44ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV55TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV56TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV58TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV59TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV64TFPrdUcpDsc',fld:'vTFPRDUCPDSC',pic:''},{av:'AV65TFPrdUcpDsc_Sel',fld:'vTFPRDUCPDSC_SEL',pic:''},{av:'AV61TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV62TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV107TFPrdDisponible',fld:'vTFPRDDISPONIBLE',pic:'ZZZZZZ9.9999'},{av:'AV108TFPrdDisponible_To',fld:'vTFPRDDISPONIBLE_TO',pic:'ZZZZZZ9.9999'},{av:'AV67TFPrvNif',fld:'vTFPRVNIF',pic:''},{av:'AV68TFPrvNif_Sel',fld:'vTFPRVNIF_SEL',pic:''},{av:'AV124Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV44ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtPrdUcpDsc_Visible',ctrl:'PRDUCPDSC',prop:'Visible'},{av:'edtPrdPreAct_Visible',ctrl:'PRDPREACT',prop:'Visible'},{av:'edtPrdDisponi_Visible',ctrl:'PRDDISPONI',prop:'Visible'},{av:'edtPrvNif_Visible',ctrl:'PRVNIF',prop:'Visible'},{av:'AV72GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV73GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e11522',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV44ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV55TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV56TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV58TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV59TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV64TFPrdUcpDsc',fld:'vTFPRDUCPDSC',pic:''},{av:'AV65TFPrdUcpDsc_Sel',fld:'vTFPRDUCPDSC_SEL',pic:''},{av:'AV61TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV62TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV107TFPrdDisponible',fld:'vTFPRDDISPONIBLE',pic:'ZZZZZZ9.9999'},{av:'AV108TFPrdDisponible_To',fld:'vTFPRDDISPONIBLE_TO',pic:'ZZZZZZ9.9999'},{av:'AV67TFPrvNif',fld:'vTFPRVNIF',pic:''},{av:'AV68TFPrvNif_Sel',fld:'vTFPRVNIF_SEL',pic:''},{av:'AV124Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV100AplicarConfirmar',fld:'vAPLICARCONFIRMAR',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e12522',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV44ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV55TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV56TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV58TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV59TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV64TFPrdUcpDsc',fld:'vTFPRDUCPDSC',pic:''},{av:'AV65TFPrdUcpDsc_Sel',fld:'vTFPRDUCPDSC_SEL',pic:''},{av:'AV61TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV62TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV107TFPrdDisponible',fld:'vTFPRDDISPONIBLE',pic:'ZZZZZZ9.9999'},{av:'AV108TFPrdDisponible_To',fld:'vTFPRDDISPONIBLE_TO',pic:'ZZZZZZ9.9999'},{av:'AV67TFPrvNif',fld:'vTFPRVNIF',pic:''},{av:'AV68TFPrvNif_Sel',fld:'vTFPRVNIF_SEL',pic:''},{av:'AV124Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV100AplicarConfirmar',fld:'vAPLICARCONFIRMAR',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e13522',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV44ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV55TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV56TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV58TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV59TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV64TFPrdUcpDsc',fld:'vTFPRDUCPDSC',pic:''},{av:'AV65TFPrdUcpDsc_Sel',fld:'vTFPRDUCPDSC_SEL',pic:''},{av:'AV61TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV62TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV107TFPrdDisponible',fld:'vTFPRDDISPONIBLE',pic:'ZZZZZZ9.9999'},{av:'AV108TFPrdDisponible_To',fld:'vTFPRDDISPONIBLE_TO',pic:'ZZZZZZ9.9999'},{av:'AV67TFPrvNif',fld:'vTFPRVNIF',pic:''},{av:'AV68TFPrvNif_Sel',fld:'vTFPRVNIF_SEL',pic:''},{av:'AV124Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV100AplicarConfirmar',fld:'vAPLICARCONFIRMAR',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV67TFPrvNif',fld:'vTFPRVNIF',pic:''},{av:'AV68TFPrvNif_Sel',fld:'vTFPRVNIF_SEL',pic:''},{av:'AV107TFPrdDisponible',fld:'vTFPRDDISPONIBLE',pic:'ZZZZZZ9.9999'},{av:'AV108TFPrdDisponible_To',fld:'vTFPRDDISPONIBLE_TO',pic:'ZZZZZZ9.9999'},{av:'AV61TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV62TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV64TFPrdUcpDsc',fld:'vTFPRDUCPDSC',pic:''},{av:'AV65TFPrdUcpDsc_Sel',fld:'vTFPRDUCPDSC_SEL',pic:''},{av:'AV58TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV59TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV55TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV56TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e21522',iparms:[{av:'AV100AplicarConfirmar',fld:'vAPLICARCONFIRMAR',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A742PrdUniCom',fld:'PRDUNICOM',pic:'9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV44ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV55TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV56TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV58TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV59TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV64TFPrdUcpDsc',fld:'vTFPRDUCPDSC',pic:''},{av:'AV65TFPrdUcpDsc_Sel',fld:'vTFPRDUCPDSC_SEL',pic:''},{av:'AV61TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV62TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV107TFPrdDisponible',fld:'vTFPRDDISPONIBLE',pic:'ZZZZZZ9.9999'},{av:'AV108TFPrdDisponible_To',fld:'vTFPRDDISPONIBLE_TO',pic:'ZZZZZZ9.9999'},{av:'AV67TFPrvNif',fld:'vTFPRVNIF',pic:''},{av:'AV68TFPrvNif_Sel',fld:'vTFPRVNIF_SEL',pic:''},{av:'AV124Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A719PrdNum',fld:'PRDNUM',pic:''}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV106GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'edtPrdUcpDsc_Link',ctrl:'PRDUCPDSC',prop:'Link'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV100AplicarConfirmar',fld:'vAPLICARCONFIRMAR',pic:''},{av:'AV44ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtPrdUcpDsc_Visible',ctrl:'PRDUCPDSC',prop:'Visible'},{av:'edtPrdPreAct_Visible',ctrl:'PRDPREACT',prop:'Visible'},{av:'edtPrdDisponi_Visible',ctrl:'PRDDISPONI',prop:'Visible'},{av:'edtPrvNif_Visible',ctrl:'PRVNIF',prop:'Visible'},{av:'AV72GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV73GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e14522',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV44ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV55TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV56TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV58TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV59TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV64TFPrdUcpDsc',fld:'vTFPRDUCPDSC',pic:''},{av:'AV65TFPrdUcpDsc_Sel',fld:'vTFPRDUCPDSC_SEL',pic:''},{av:'AV61TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV62TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV107TFPrdDisponible',fld:'vTFPRDDISPONIBLE',pic:'ZZZZZZ9.9999'},{av:'AV108TFPrdDisponible_To',fld:'vTFPRDDISPONIBLE_TO',pic:'ZZZZZZ9.9999'},{av:'AV67TFPrvNif',fld:'vTFPRVNIF',pic:''},{av:'AV68TFPrvNif_Sel',fld:'vTFPRVNIF_SEL',pic:''},{av:'AV124Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV100AplicarConfirmar',fld:'vAPLICARCONFIRMAR',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV44ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtPrdUcpDsc_Visible',ctrl:'PRDUCPDSC',prop:'Visible'},{av:'edtPrdPreAct_Visible',ctrl:'PRDPREACT',prop:'Visible'},{av:'edtPrdDisponi_Visible',ctrl:'PRDDISPONI',prop:'Visible'},{av:'edtPrvNif_Visible',ctrl:'PRVNIF',prop:'Visible'},{av:'AV72GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV73GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e22522',iparms:[{av:'cmbavGridactions'},{av:'AV106GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A719PrdNum',fld:'PRDNUM',pic:''}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV106GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("ENTER","{handler:'e15522',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV44ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV55TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV56TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV58TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV59TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV64TFPrdUcpDsc',fld:'vTFPRDUCPDSC',pic:''},{av:'AV65TFPrdUcpDsc_Sel',fld:'vTFPRDUCPDSC_SEL',pic:''},{av:'AV61TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV62TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV107TFPrdDisponible',fld:'vTFPRDDISPONIBLE',pic:'ZZZZZZ9.9999'},{av:'AV108TFPrdDisponible_To',fld:'vTFPRDDISPONIBLE_TO',pic:'ZZZZZZ9.9999'},{av:'AV67TFPrvNif',fld:'vTFPRVNIF',pic:''},{av:'AV68TFPrvNif_Sel',fld:'vTFPRVNIF_SEL',pic:''},{av:'AV124Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV100AplicarConfirmar',fld:'vAPLICARCONFIRMAR',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A719PrdNum',fld:'PRDNUM',pic:''}]");
      setEventMetadata("ENTER",",oparms:[{av:'AV100AplicarConfirmar',fld:'vAPLICARCONFIRMAR',pic:''},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV44ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtPrdUcpDsc_Visible',ctrl:'PRDUCPDSC',prop:'Visible'},{av:'edtPrdPreAct_Visible',ctrl:'PRDPREACT',prop:'Visible'},{av:'edtPrdDisponi_Visible',ctrl:'PRDDISPONI',prop:'Visible'},{av:'edtPrvNif_Visible',ctrl:'PRVNIF',prop:'Visible'},{av:'AV72GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV73GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e16522',iparms:[{av:'AV124Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV56TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV59TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV65TFPrdUcpDsc_Sel',fld:'vTFPRDUCPDSC_SEL',pic:''},{av:'AV68TFPrvNif_Sel',fld:'vTFPRVNIF_SEL',pic:''},{av:'AV55TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV58TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV64TFPrdUcpDsc',fld:'vTFPRDUCPDSC',pic:''},{av:'AV61TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV107TFPrdDisponible',fld:'vTFPRDDISPONIBLE',pic:'ZZZZZZ9.9999'},{av:'AV67TFPrvNif',fld:'vTFPRVNIF',pic:''},{av:'AV62TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV108TFPrdDisponible_To',fld:'vTFPRDDISPONIBLE_TO',pic:'ZZZZZZ9.9999'},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV68TFPrvNif_Sel',fld:'vTFPRVNIF_SEL',pic:''},{av:'AV67TFPrvNif',fld:'vTFPRVNIF',pic:''},{av:'AV107TFPrdDisponible',fld:'vTFPRDDISPONIBLE',pic:'ZZZZZZ9.9999'},{av:'AV108TFPrdDisponible_To',fld:'vTFPRDDISPONIBLE_TO',pic:'ZZZZZZ9.9999'},{av:'AV61TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV62TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV65TFPrdUcpDsc_Sel',fld:'vTFPRDUCPDSC_SEL',pic:''},{av:'AV64TFPrdUcpDsc',fld:'vTFPRDUCPDSC',pic:''},{av:'AV59TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV58TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV56TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV55TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV44ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV124Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV100AplicarConfirmar',fld:'vAPLICARCONFIRMAR',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e17522',iparms:[{av:'AV124Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV56TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV59TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV65TFPrdUcpDsc_Sel',fld:'vTFPRDUCPDSC_SEL',pic:''},{av:'AV68TFPrvNif_Sel',fld:'vTFPRVNIF_SEL',pic:''},{av:'AV55TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV58TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV64TFPrdUcpDsc',fld:'vTFPRDUCPDSC',pic:''},{av:'AV61TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV107TFPrdDisponible',fld:'vTFPRDDISPONIBLE',pic:'ZZZZZZ9.9999'},{av:'AV67TFPrvNif',fld:'vTFPRVNIF',pic:''},{av:'AV62TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV108TFPrdDisponible_To',fld:'vTFPRDDISPONIBLE_TO',pic:'ZZZZZZ9.9999'},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV68TFPrvNif_Sel',fld:'vTFPRVNIF_SEL',pic:''},{av:'AV67TFPrvNif',fld:'vTFPRVNIF',pic:''},{av:'AV107TFPrdDisponible',fld:'vTFPRDDISPONIBLE',pic:'ZZZZZZ9.9999'},{av:'AV108TFPrdDisponible_To',fld:'vTFPRDDISPONIBLE_TO',pic:'ZZZZZZ9.9999'},{av:'AV61TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV62TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV65TFPrdUcpDsc_Sel',fld:'vTFPRDUCPDSC_SEL',pic:''},{av:'AV64TFPrdUcpDsc',fld:'vTFPRDUCPDSC',pic:''},{av:'AV59TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV58TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV56TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV55TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV44ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV124Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV100AplicarConfirmar',fld:'vAPLICARCONFIRMAR',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e18522',iparms:[{av:'AV124Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV56TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV59TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV65TFPrdUcpDsc_Sel',fld:'vTFPRDUCPDSC_SEL',pic:''},{av:'AV68TFPrvNif_Sel',fld:'vTFPRVNIF_SEL',pic:''},{av:'AV55TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV58TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV64TFPrdUcpDsc',fld:'vTFPRDUCPDSC',pic:''},{av:'AV61TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV107TFPrdDisponible',fld:'vTFPRDDISPONIBLE',pic:'ZZZZZZ9.9999'},{av:'AV67TFPrvNif',fld:'vTFPRVNIF',pic:''},{av:'AV62TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV108TFPrdDisponible_To',fld:'vTFPRDDISPONIBLE_TO',pic:'ZZZZZZ9.9999'},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV68TFPrvNif_Sel',fld:'vTFPRVNIF_SEL',pic:''},{av:'AV67TFPrvNif',fld:'vTFPRVNIF',pic:''},{av:'AV107TFPrdDisponible',fld:'vTFPRDDISPONIBLE',pic:'ZZZZZZ9.9999'},{av:'AV108TFPrdDisponible_To',fld:'vTFPRDDISPONIBLE_TO',pic:'ZZZZZZ9.9999'},{av:'AV61TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV62TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV65TFPrdUcpDsc_Sel',fld:'vTFPRDUCPDSC_SEL',pic:''},{av:'AV64TFPrdUcpDsc',fld:'vTFPRDUCPDSC',pic:''},{av:'AV59TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV58TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV56TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV55TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV44ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV124Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV100AplicarConfirmar',fld:'vAPLICARCONFIRMAR',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[]");
      setEventMetadata("VALID_PRDNUM",",oparms:[]}");
      setEventMetadata("VALID_PRDNOM","{handler:'valid_Prdnom',iparms:[]");
      setEventMetadata("VALID_PRDNOM",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Prvnif',iparms:[]");
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
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV5EmprCod = "" ;
      AV44ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV55TFPrdNum = "" ;
      AV56TFPrdNum_Sel = "" ;
      AV58TFPrdNom = "" ;
      AV59TFPrdNom_Sel = "" ;
      AV64TFPrdUcpDsc = "" ;
      AV65TFPrdUcpDsc_Sel = "" ;
      AV61TFPrdPreAct = DecimalUtil.ZERO ;
      AV62TFPrdPreAct_To = DecimalUtil.ZERO ;
      AV107TFPrdDisponible = DecimalUtil.ZERO ;
      AV108TFPrdDisponible_To = DecimalUtil.ZERO ;
      AV67TFPrvNif = "" ;
      AV68TFPrvNif_Sel = "" ;
      AV124Pgmname = "" ;
      A396EmprCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV70DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A3936PrdEqLP = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportreport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      ucDvpanel_tableconfirmar = new com.genexus.webpanels.GXUserControl();
      bttBtnenter_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucInnewwindow1 = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A737PrdUcpDsc = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A13747PrdCDsc = "" ;
      A13831PrdDisponi = DecimalUtil.ZERO ;
      A793PrvNif = "" ;
      AV112Webbcprodds_1_tfprdnum = "" ;
      AV113Webbcprodds_2_tfprdnum_sel = "" ;
      AV114Webbcprodds_3_tfprdnom = "" ;
      AV115Webbcprodds_4_tfprdnom_sel = "" ;
      AV116Webbcprodds_5_tfprducpdsc = "" ;
      AV117Webbcprodds_6_tfprducpdsc_sel = "" ;
      AV118Webbcprodds_7_tfprdpreact = DecimalUtil.ZERO ;
      AV119Webbcprodds_8_tfprdpreact_to = DecimalUtil.ZERO ;
      AV120Webbcprodds_9_tfprddisponible = DecimalUtil.ZERO ;
      AV121Webbcprodds_10_tfprddisponible_to = DecimalUtil.ZERO ;
      AV122Webbcprodds_11_tfprvnif = "" ;
      AV123Webbcprodds_12_tfprvnif_sel = "" ;
      scmdbuf = "" ;
      lV112Webbcprodds_1_tfprdnum = "" ;
      lV114Webbcprodds_3_tfprdnom = "" ;
      lV116Webbcprodds_5_tfprducpdsc = "" ;
      lV122Webbcprodds_11_tfprvnif = "" ;
      H00522_A795PrvNum = new int[1] ;
      H00522_A856ValCod = new byte[1] ;
      H00522_A3936PrdEqLP = new String[] {""} ;
      H00522_A742PrdUniCom = new byte[1] ;
      H00522_A396EmprCod = new String[] {""} ;
      H00522_A793PrvNif = new String[] {""} ;
      H00522_n793PrvNif = new boolean[] {false} ;
      H00522_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00522_A737PrdUcpDsc = new String[] {""} ;
      H00522_n737PrdUcpDsc = new boolean[] {false} ;
      H00522_A718PrdNom = new String[] {""} ;
      H00522_A719PrdNum = new String[] {""} ;
      H00522_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00522_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00523_A795PrvNum = new int[1] ;
      H00523_A856ValCod = new byte[1] ;
      H00523_A3936PrdEqLP = new String[] {""} ;
      H00523_A742PrdUniCom = new byte[1] ;
      H00523_A396EmprCod = new String[] {""} ;
      H00523_A793PrvNif = new String[] {""} ;
      H00523_n793PrvNif = new boolean[] {false} ;
      H00523_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00523_A737PrdUcpDsc = new String[] {""} ;
      H00523_n737PrdUcpDsc = new boolean[] {false} ;
      H00523_A718PrdNom = new String[] {""} ;
      H00523_A719PrdNum = new String[] {""} ;
      H00523_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00523_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV111Station = "" ;
      AV98EmprNom = "" ;
      AV99UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV7WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV50Session = httpContext.getWebSession();
      AV32ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV30ExcelFilename = "" ;
      AV31ErrorMessage = "" ;
      AV39UserCustomValue = "" ;
      AV45ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV11GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV12GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char12 = "" ;
      GXt_char11 = "" ;
      GXt_char10 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState14 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV9TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8HTTPRequest = httpContext.getHttpRequest();
      GXv_char13 = new String[1] ;
      GXv_char4 = new String[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webbcprod__default(),
         new Object[] {
             new Object[] {
            H00522_A795PrvNum, H00522_A856ValCod, H00522_A3936PrdEqLP, H00522_A742PrdUniCom, H00522_A396EmprCod, H00522_A793PrvNif, H00522_n793PrvNif, H00522_A724PrdPreAct, H00522_A737PrdUcpDsc, H00522_n737PrdUcpDsc,
            H00522_A718PrdNom, H00522_A719PrdNum, H00522_A685PrdCanRes, H00522_A704PrdExiAlm
            }
            , new Object[] {
            H00523_A795PrvNum, H00523_A856ValCod, H00523_A3936PrdEqLP, H00523_A742PrdUniCom, H00523_A396EmprCod, H00523_A793PrvNif, H00523_n793PrvNif, H00523_A724PrdPreAct, H00523_A737PrdUcpDsc, H00523_n737PrdUcpDsc,
            H00523_A718PrdNom, H00523_A719PrdNum, H00523_A685PrdCanRes, H00523_A704PrdExiAlm
            }
         }
      );
      AV124Pgmname = "WebBCPROD" ;
      /* GeneXus formulas. */
      AV124Pgmname = "WebBCPROD" ;
      Gx_err = (short)(0) ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte A742PrdUniCom ;
   private byte nDonePA ;
   private byte A856ValCod ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV14OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV106GridActions ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_43 ;
   private int nGXsfl_43_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int subGrid_Islastpage ;
   private int A795PrvNum ;
   private int edtPrdNum_Visible ;
   private int edtPrdNom_Visible ;
   private int edtPrdUcpDsc_Visible ;
   private int edtPrdPreAct_Visible ;
   private int edtPrdDisponi_Visible ;
   private int edtPrvNif_Visible ;
   private int AV71PageToGo ;
   private int AV125GXV1 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV72GridCurrentPage ;
   private long AV73GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV61TFPrdPreAct ;
   private java.math.BigDecimal AV62TFPrdPreAct_To ;
   private java.math.BigDecimal AV107TFPrdDisponible ;
   private java.math.BigDecimal AV108TFPrdDisponible_To ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A13831PrdDisponi ;
   private java.math.BigDecimal AV118Webbcprodds_7_tfprdpreact ;
   private java.math.BigDecimal AV119Webbcprodds_8_tfprdpreact_to ;
   private java.math.BigDecimal AV120Webbcprodds_9_tfprddisponible ;
   private java.math.BigDecimal AV121Webbcprodds_10_tfprddisponible_to ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_43_idx="0001" ;
   private String AV5EmprCod ;
   private String AV55TFPrdNum ;
   private String AV56TFPrdNum_Sel ;
   private String AV58TFPrdNom ;
   private String AV59TFPrdNom_Sel ;
   private String AV64TFPrdUcpDsc ;
   private String AV65TFPrdUcpDsc_Sel ;
   private String AV67TFPrvNif ;
   private String AV68TFPrvNif_Sel ;
   private String AV124Pgmname ;
   private String A396EmprCod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A3936PrdEqLP ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
   private String Dvpanel_tableconfirmar_Width ;
   private String Dvpanel_tableconfirmar_Cls ;
   private String Dvpanel_tableconfirmar_Title ;
   private String Dvpanel_tableconfirmar_Iconposition ;
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
   private String Grid_empowerer_Fixedcolumns ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableactions_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtnexport_Internalname ;
   private String bttBtnexport_Jsonclick ;
   private String bttBtnexportreport_Internalname ;
   private String bttBtnexportreport_Jsonclick ;
   private String bttBtnexportcsv_Internalname ;
   private String bttBtnexportcsv_Jsonclick ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String Dvpanel_tableconfirmar_Internalname ;
   private String divTableconfirmar_Internalname ;
   private String divTableactionsconfirmar_Internalname ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Innewwindow1_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String A719PrdNum ;
   private String edtPrdNum_Internalname ;
   private String A718PrdNom ;
   private String edtPrdNom_Internalname ;
   private String A737PrdUcpDsc ;
   private String edtPrdUcpDsc_Internalname ;
   private String edtPrdPreAct_Internalname ;
   private String edtPrdCDsc_Internalname ;
   private String edtPrdDisponi_Internalname ;
   private String A793PrvNif ;
   private String edtPrvNif_Internalname ;
   private String AV112Webbcprodds_1_tfprdnum ;
   private String AV113Webbcprodds_2_tfprdnum_sel ;
   private String AV114Webbcprodds_3_tfprdnom ;
   private String AV115Webbcprodds_4_tfprdnom_sel ;
   private String AV116Webbcprodds_5_tfprducpdsc ;
   private String AV117Webbcprodds_6_tfprducpdsc_sel ;
   private String AV122Webbcprodds_11_tfprvnif ;
   private String AV123Webbcprodds_12_tfprvnif_sel ;
   private String scmdbuf ;
   private String lV112Webbcprodds_1_tfprdnum ;
   private String lV114Webbcprodds_3_tfprdnom ;
   private String lV116Webbcprodds_5_tfprducpdsc ;
   private String lV122Webbcprodds_11_tfprvnif ;
   private String AV111Station ;
   private String AV98EmprNom ;
   private String AV99UsurCod ;
   private String edtPrdUcpDsc_Link ;
   private String GXt_char12 ;
   private String GXt_char11 ;
   private String GXt_char10 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char13[] ;
   private String GXv_char4[] ;
   private String sGXsfl_43_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdNom_Jsonclick ;
   private String edtPrdUcpDsc_Jsonclick ;
   private String edtPrdPreAct_Jsonclick ;
   private String edtPrdCDsc_Jsonclick ;
   private String edtPrdDisponi_Jsonclick ;
   private String edtPrvNif_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV15OrderedDsc ;
   private boolean AV100AplicarConfirmar ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean Dvpanel_tableconfirmar_Autowidth ;
   private boolean Dvpanel_tableconfirmar_Autoheight ;
   private boolean Dvpanel_tableconfirmar_Collapsible ;
   private boolean Dvpanel_tableconfirmar_Collapsed ;
   private boolean Dvpanel_tableconfirmar_Showcollapseicon ;
   private boolean Dvpanel_tableconfirmar_Autoscroll ;
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
   private boolean n737PrdUcpDsc ;
   private boolean n793PrvNif ;
   private boolean bGXsfl_43_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV32ColumnsSelectorXML ;
   private String AV39UserCustomValue ;
   private String A13747PrdCDsc ;
   private String AV30ExcelFilename ;
   private String AV31ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV8HTTPRequest ;
   private com.genexus.webpanels.WebSession AV50Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableconfirmar ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucInnewwindow1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private HTMLChoice cmbavGridactions ;
   private IDataStoreProvider pr_default ;
   private int[] H00522_A795PrvNum ;
   private byte[] H00522_A856ValCod ;
   private String[] H00522_A3936PrdEqLP ;
   private byte[] H00522_A742PrdUniCom ;
   private String[] H00522_A396EmprCod ;
   private String[] H00522_A793PrvNif ;
   private boolean[] H00522_n793PrvNif ;
   private java.math.BigDecimal[] H00522_A724PrdPreAct ;
   private String[] H00522_A737PrdUcpDsc ;
   private boolean[] H00522_n737PrdUcpDsc ;
   private String[] H00522_A718PrdNom ;
   private String[] H00522_A719PrdNum ;
   private java.math.BigDecimal[] H00522_A685PrdCanRes ;
   private java.math.BigDecimal[] H00522_A704PrdExiAlm ;
   private int[] H00523_A795PrvNum ;
   private byte[] H00523_A856ValCod ;
   private String[] H00523_A3936PrdEqLP ;
   private byte[] H00523_A742PrdUniCom ;
   private String[] H00523_A396EmprCod ;
   private String[] H00523_A793PrvNif ;
   private boolean[] H00523_n793PrvNif ;
   private java.math.BigDecimal[] H00523_A724PrdPreAct ;
   private String[] H00523_A737PrdUcpDsc ;
   private boolean[] H00523_n737PrdUcpDsc ;
   private String[] H00523_A718PrdNom ;
   private String[] H00523_A719PrdNum ;
   private java.math.BigDecimal[] H00523_A685PrdCanRes ;
   private java.math.BigDecimal[] H00523_A704PrdExiAlm ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV7WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV9TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV11GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState14[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV12GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV44ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV45ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV70DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class webbcprod__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00522( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV113Webbcprodds_2_tfprdnum_sel ,
                                          String AV112Webbcprodds_1_tfprdnum ,
                                          String AV115Webbcprodds_4_tfprdnom_sel ,
                                          String AV114Webbcprodds_3_tfprdnom ,
                                          String AV117Webbcprodds_6_tfprducpdsc_sel ,
                                          String AV116Webbcprodds_5_tfprducpdsc ,
                                          java.math.BigDecimal AV118Webbcprodds_7_tfprdpreact ,
                                          java.math.BigDecimal AV119Webbcprodds_8_tfprdpreact_to ,
                                          java.math.BigDecimal AV120Webbcprodds_9_tfprddisponible ,
                                          java.math.BigDecimal AV121Webbcprodds_10_tfprddisponible_to ,
                                          String AV123Webbcprodds_12_tfprvnif_sel ,
                                          String AV122Webbcprodds_11_tfprvnif ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          String A737PrdUcpDsc ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          String A793PrvNif ,
                                          short AV14OrderedBy ,
                                          boolean AV15OrderedDsc ,
                                          byte A856ValCod ,
                                          String A3936PrdEqLP ,
                                          String AV5EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int15 = new byte[13];
      Object[] GXv_Object16 = new Object[2];
      scmdbuf = "SELECT T1.PrvNum, T1.ValCod, T1.PrdEqLP, T1.PrdUniCom AS PrdUniCom, T1.EmprCod, T2.PrvNif, T1.PrdPreAct, T3.UniDsc AS PrdUcpDsc, T1.PrdNom, T1.PrdNum, T1.PrdCanRes," ;
      scmdbuf += " T1.PrdExiAlm FROM ((TXPPRODUC T1 INNER JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.PrvNum) INNER JOIN TXPTIPUNI T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.UniCod = T1.PrdUniCom)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ValCod = 1)");
      if ( (GXutil.strcmp("", AV113Webbcprodds_2_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV112Webbcprodds_1_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Webbcprodds_2_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int15[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Webbcprodds_4_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV114Webbcprodds_3_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Webbcprodds_4_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int15[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Webbcprodds_6_tfprducpdsc_sel)==0) && ( ! (GXutil.strcmp("", AV116Webbcprodds_5_tfprducpdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.UniDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Webbcprodds_6_tfprducpdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.UniDsc = ?)");
      }
      else
      {
         GXv_int15[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV118Webbcprodds_7_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int15[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV119Webbcprodds_8_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int15[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV120Webbcprodds_9_tfprddisponible)==0) )
      {
         addWhere(sWhereString, "(( T1.PrdExiAlm - T1.PrdCanRes) >= ?)");
      }
      else
      {
         GXv_int15[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Webbcprodds_10_tfprddisponible_to)==0) )
      {
         addWhere(sWhereString, "(( T1.PrdExiAlm - T1.PrdCanRes) <= ?)");
      }
      else
      {
         GXv_int15[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Webbcprodds_12_tfprvnif_sel)==0) && ( ! (GXutil.strcmp("", AV122Webbcprodds_11_tfprvnif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Webbcprodds_12_tfprvnif_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvNif = ?)");
      }
      else
      {
         GXv_int15[12] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV14OrderedBy == 1 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV14OrderedBy == 1 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV14OrderedBy == 2 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNom" ;
      }
      else if ( ( AV14OrderedBy == 2 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNom DESC" ;
      }
      else if ( ( AV14OrderedBy == 3 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.UniDsc" ;
      }
      else if ( ( AV14OrderedBy == 3 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.UniDsc DESC" ;
      }
      else if ( ( AV14OrderedBy == 4 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdPreAct" ;
      }
      else if ( ( AV14OrderedBy == 4 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdPreAct DESC" ;
      }
      else if ( ( AV14OrderedBy == 5 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrvNif" ;
      }
      else if ( ( AV14OrderedBy == 5 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrvNif DESC" ;
      }
      GXv_Object16[0] = scmdbuf ;
      GXv_Object16[1] = GXv_int15 ;
      return GXv_Object16 ;
   }

   protected Object[] conditional_H00523( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV113Webbcprodds_2_tfprdnum_sel ,
                                          String AV112Webbcprodds_1_tfprdnum ,
                                          String AV115Webbcprodds_4_tfprdnom_sel ,
                                          String AV114Webbcprodds_3_tfprdnom ,
                                          String AV117Webbcprodds_6_tfprducpdsc_sel ,
                                          String AV116Webbcprodds_5_tfprducpdsc ,
                                          java.math.BigDecimal AV118Webbcprodds_7_tfprdpreact ,
                                          java.math.BigDecimal AV119Webbcprodds_8_tfprdpreact_to ,
                                          java.math.BigDecimal AV120Webbcprodds_9_tfprddisponible ,
                                          java.math.BigDecimal AV121Webbcprodds_10_tfprddisponible_to ,
                                          String AV123Webbcprodds_12_tfprvnif_sel ,
                                          String AV122Webbcprodds_11_tfprvnif ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          String A737PrdUcpDsc ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          String A793PrvNif ,
                                          short AV14OrderedBy ,
                                          boolean AV15OrderedDsc ,
                                          byte A856ValCod ,
                                          String A3936PrdEqLP ,
                                          String AV5EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[13];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT T1.PrvNum, T1.ValCod, T1.PrdEqLP, T1.PrdUniCom AS PrdUniCom, T1.EmprCod, T2.PrvNif, T1.PrdPreAct, T3.UniDsc AS PrdUcpDsc, T1.PrdNom, T1.PrdNum, T1.PrdCanRes," ;
      scmdbuf += " T1.PrdExiAlm FROM ((TXPPRODUC T1 INNER JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.PrvNum) INNER JOIN TXPTIPUNI T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.UniCod = T1.PrdUniCom)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ValCod = 1)");
      if ( (GXutil.strcmp("", AV113Webbcprodds_2_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV112Webbcprodds_1_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Webbcprodds_2_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int17[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Webbcprodds_4_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV114Webbcprodds_3_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Webbcprodds_4_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int17[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Webbcprodds_6_tfprducpdsc_sel)==0) && ( ! (GXutil.strcmp("", AV116Webbcprodds_5_tfprducpdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.UniDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Webbcprodds_6_tfprducpdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.UniDsc = ?)");
      }
      else
      {
         GXv_int17[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV118Webbcprodds_7_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int17[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV119Webbcprodds_8_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int17[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV120Webbcprodds_9_tfprddisponible)==0) )
      {
         addWhere(sWhereString, "(( T1.PrdExiAlm - T1.PrdCanRes) >= ?)");
      }
      else
      {
         GXv_int17[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Webbcprodds_10_tfprddisponible_to)==0) )
      {
         addWhere(sWhereString, "(( T1.PrdExiAlm - T1.PrdCanRes) <= ?)");
      }
      else
      {
         GXv_int17[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Webbcprodds_12_tfprvnif_sel)==0) && ( ! (GXutil.strcmp("", AV122Webbcprodds_11_tfprvnif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Webbcprodds_12_tfprvnif_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvNif = ?)");
      }
      else
      {
         GXv_int17[12] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV14OrderedBy == 1 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV14OrderedBy == 1 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV14OrderedBy == 2 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNom" ;
      }
      else if ( ( AV14OrderedBy == 2 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNom DESC" ;
      }
      else if ( ( AV14OrderedBy == 3 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.UniDsc" ;
      }
      else if ( ( AV14OrderedBy == 3 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.UniDsc DESC" ;
      }
      else if ( ( AV14OrderedBy == 4 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdPreAct" ;
      }
      else if ( ( AV14OrderedBy == 4 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdPreAct DESC" ;
      }
      else if ( ( AV14OrderedBy == 5 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrvNif" ;
      }
      else if ( ( AV14OrderedBy == 5 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrvNif DESC" ;
      }
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
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
                  return conditional_H00522(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Boolean) dynConstraints[20]).booleanValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] );
            case 1 :
                  return conditional_H00523(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Boolean) dynConstraints[20]).booleanValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00522", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00523", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 26);
               ((String[]) buf[11])[0] = rslt.getString(10, 6);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,4);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,4);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 26);
               ((String[]) buf[11])[0] = rslt.getString(10, 6);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,4);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,4);
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
                  stmt.setString(sIdx, (String)parms[14], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[20], 5);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 5);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[23], 4);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 20);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 20);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[20], 5);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 5);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[23], 4);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 20);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 20);
               }
               return;
      }
   }

}

