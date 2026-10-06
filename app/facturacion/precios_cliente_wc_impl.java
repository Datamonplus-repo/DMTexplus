package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class precios_cliente_wc_impl extends GXWebComponent
{
   public precios_cliente_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public precios_cliente_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( precios_cliente_wc_impl.class ));
   }

   public precios_cliente_wc_impl( int remoteHandle ,
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
      chkavSp = UIFactory.getCheckbox(this);
      chkavPrecios_cliente_sdt__seleccionar = UIFactory.getCheckbox(this);
      cmbavPrecios_cliente_sdt__clitipo = new HTMLChoice();
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
               AV28Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Emprcod", AV28Emprcod);
               AV29CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29CliCod), 6, 0));
               AV32CliNom = httpContext.GetPar( "CliNom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32CliNom", AV32CliNom);
               AV30ForColNum = (int)(GXutil.lval( httpContext.GetPar( "ForColNum"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30ForColNum), 6, 0));
               AV31SP = httpContext.GetPar( "SP") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31SP", AV31SP);
               AV83ForBlo = httpContext.GetPar( "ForBlo") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83ForBlo", AV83ForBlo);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV28Emprcod,Integer.valueOf(AV29CliCod),AV32CliNom,Integer.valueOf(AV30ForColNum),AV31SP,AV83ForBlo});
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
      nRC_GXsfl_89 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_89"))) ;
      nGXsfl_89_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_89_idx"))) ;
      sGXsfl_89_idx = httpContext.GetPar( "sGXsfl_89_idx") ;
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
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV18ColumnsSelector);
      AV123Pgmname = httpContext.GetPar( "Pgmname") ;
      AV80OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV78OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV28Emprcod = httpContext.GetPar( "Emprcod") ;
      AV29CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
      AV32CliNom = httpContext.GetPar( "CliNom") ;
      AV30ForColNum = (int)(GXutil.lval( httpContext.GetPar( "ForColNum"))) ;
      AV31SP = httpContext.GetPar( "SP") ;
      AV83ForBlo = httpContext.GetPar( "ForBlo") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV13Precios_cliente_SDT);
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV18ColumnsSelector, AV123Pgmname, AV80OrderedBy, AV78OrderedDsc, AV28Emprcod, AV29CliCod, AV32CliNom, AV30ForColNum, AV31SP, AV83ForBlo, AV13Precios_cliente_SDT, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa23Y2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Precios por cliente", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.facturacion.precios_cliente_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV28Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV29CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV32CliNom)),GXutil.URLEncode(GXutil.ltrimstr(AV30ForColNum,6,0)),GXutil.URLEncode(GXutil.rtrim(AV31SP)),GXutil.URLEncode(GXutil.rtrim(AV83ForBlo))}, new String[] {"Emprcod","CliCod","CliNom","ForColNum","SP","ForBlo"}) +"\">") ;
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
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"Precios_cliente_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV123Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\precios_cliente_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"Precios_cliente_sdt", AV13Precios_cliente_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"Precios_cliente_sdt", AV13Precios_cliente_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_89", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_89, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV26GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV27GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV24DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV24DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV18ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV18ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV28Emprcod", GXutil.rtrim( wcpOAV28Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV29CliCod", GXutil.ltrim( localUtil.ntoc( wcpOAV29CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV32CliNom", GXutil.rtrim( wcpOAV32CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV30ForColNum", GXutil.ltrim( localUtil.ntoc( wcpOAV30ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV31SP", GXutil.rtrim( wcpOAV31SP));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV83ForBlo", GXutil.rtrim( wcpOAV83ForBlo));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV80OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV78OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV28Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORBLO", GXutil.rtrim( AV83ForBlo));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vPRECIOS_CLIENTE_SDT", AV13Precios_cliente_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vPRECIOS_CLIENTE_SDT", AV13Precios_cliente_SDT);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vPRECIOS_CLIENTE_SDT_ITEM", AV45Precios_cliente_SDT_item);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vPRECIOS_CLIENTE_SDT_ITEM", AV45Precios_cliente_SDT_item);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSTATION", GXutil.rtrim( AV40Station));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vVALOR_COR", GXutil.ltrim( localUtil.ntoc( AV39Valor_cor, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSELFORCOLNUM", GXutil.ltrim( localUtil.ntoc( AV84SelForcolnum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSELNEWPREKGM", GXutil.ltrim( localUtil.ntoc( AV85SelNewPreKgm, (byte)(6), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Width", GXutil.rtrim( Dvpanel_unnamedtable1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable1_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable1_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Cls", GXutil.rtrim( Dvpanel_unnamedtable1_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Title", GXutil.rtrim( Dvpanel_unnamedtable1_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable1_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable1_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable1_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Width", GXutil.rtrim( Dvpanel_unnamedtable2_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable2_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable2_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Cls", GXutil.rtrim( Dvpanel_unnamedtable2_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Title", GXutil.rtrim( Dvpanel_unnamedtable2_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable2_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable2_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable2_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable2_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable2_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includesortasc", GXutil.rtrim( Ddo_grid_Includesortasc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Fixable", GXutil.rtrim( Ddo_grid_Fixable));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption", GXutil.rtrim( Ddo_gridcolumnsselector_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip", GXutil.rtrim( Ddo_gridcolumnsselector_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls", GXutil.rtrim( Ddo_gridcolumnsselector_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype", GXutil.rtrim( Ddo_gridcolumnsselector_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname", GXutil.rtrim( Ddo_gridcolumnsselector_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace", GXutil.rtrim( Ddo_gridcolumnsselector_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFORMEPRECIOS_Title", GXutil.rtrim( Dvelop_confirmpanel_btnconformeprecios_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFORMEPRECIOS_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_btnconformeprecios_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFORMEPRECIOS_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconformeprecios_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFORMEPRECIOS_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconformeprecios_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFORMEPRECIOS_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconformeprecios_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFORMEPRECIOS_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_btnconformeprecios_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFORMEPRECIOS_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_btnconformeprecios_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNRECALCULO_Title", GXutil.rtrim( Dvelop_confirmpanel_btnrecalculo_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNRECALCULO_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_btnrecalculo_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNRECALCULO_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnrecalculo_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNRECALCULO_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnrecalculo_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNRECALCULO_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnrecalculo_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNRECALCULO_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_btnrecalculo_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNRECALCULO_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_btnrecalculo_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFORMEPRECIOS_Result", GXutil.rtrim( Dvelop_confirmpanel_btnconformeprecios_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNRECALCULO_Result", GXutil.rtrim( Dvelop_confirmpanel_btnrecalculo_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFORMEPRECIOS_Result", GXutil.rtrim( Dvelop_confirmpanel_btnconformeprecios_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNRECALCULO_Result", GXutil.rtrim( Dvelop_confirmpanel_btnrecalculo_Result));
   }

   public void renderHtmlCloseForm23Y2( )
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
      return "Facturacion.Precios_cliente_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Precios por cliente", "") ;
   }

   public void wb23Y0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.facturacion.precios_cliente_wc");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
         app.GxWebStd.gx_div_start( httpContext, divDvpanel_unnamedtable1_cell_Internalname, 1, 0, "px", 0, "px", divDvpanel_unnamedtable1_cell_Class, "left", "top", "", "", "div");
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
         ucDvpanel_unnamedtable1.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable1_Internalname, sPrefix+"DVPANEL_UNNAMEDTABLE1Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_UNNAMEDTABLE1Container"+"UnnamedTable1"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV29CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV29CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV29CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\Precios_cliente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClinom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClinom_Internalname, httpContext.getMessage( "Nome", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClinom_Internalname, GXutil.rtrim( AV32CliNom), GXutil.rtrim( localUtil.format( AV32CliNom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClinom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClinom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\Precios_cliente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavForcolnum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavForcolnum_Internalname, httpContext.getMessage( "Numero da Cor", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavForcolnum_Internalname, GXutil.ltrim( localUtil.ntoc( AV30ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavForcolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV30ForColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV30ForColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavForcolnum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavForcolnum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\Precios_cliente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavSp.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavSp.getInternalname(), httpContext.getMessage( "Cores sem Preço", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavSp.getInternalname(), AV31SP, "", httpContext.getMessage( "Cores sem Preço", ""), 1, chkavSp.getEnabled(), "S", "", StyleString, ClassString, "", "", "");
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
         app.GxWebStd.gx_div_start( httpContext, divDvpanel_unnamedtable2_cell_Internalname, 1, 0, "px", 0, "px", divDvpanel_unnamedtable2_cell_Class, "left", "top", "", "", "div");
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
         ucDvpanel_unnamedtable2.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable2_Internalname, sPrefix+"DVPANEL_UNNAMEDTABLE2Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_UNNAMEDTABLE2Container"+"UnnamedTable2"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Cr - Custo Receita", ""), "", "", lblTextblock2_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Facturacion\\Precios_cliente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "MV - Margem sobre a Venda", ""), "", "", lblTextblock3_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Facturacion\\Precios_cliente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Cc - % Concentraçao do Corante", ""), "", "", lblTextblock1_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Facturacion\\Precios_cliente_WC.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "PC - Preço de Custo", ""), "", "", lblTextblock4_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Facturacion\\Precios_cliente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "PV - Preço de Venda", ""), "", "", lblTextblock5_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Facturacion\\Precios_cliente_WC.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell CellMarginTop", "left", "top", "", "", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 89, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\Precios_cliente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 89, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\Precios_cliente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 89, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\Precios_cliente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_71_23Y2( true) ;
      }
      else
      {
         wb_table1_71_23Y2( false) ;
      }
      return  ;
   }

   public void wb_table1_71_23Y2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconformeprecios_Internalname, "gx.evt.setGridEvt("+GXutil.str( 89, 2, 0)+","+"null"+");", httpContext.getMessage( "Conforme Preços", ""), bttBtnconformeprecios_Jsonclick, 7, httpContext.getMessage( "Conforme Preços", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e1123y1_client"+"'", TempTags, "", 2, "HLP_Facturacion\\Precios_cliente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnrecalculo_Internalname, "gx.evt.setGridEvt("+GXutil.str( 89, 2, 0)+","+"null"+");", httpContext.getMessage( "Re-Calculo Custo Côr (Cr)", ""), bttBtnrecalculo_Jsonclick, 5, httpContext.getMessage( "Re-Calculo Custo Côr (Cr)", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DORECALCULO\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\Precios_cliente_WC.htm");
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
         startgridcontrol89( ) ;
      }
      if ( wbEnd == 89 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_89 = (int)(nGXsfl_89_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV89GXV1 = nGXsfl_89_idx ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV26GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV27GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV123Pgmname), GXutil.rtrim( localUtil.format( AV123Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\Precios_cliente_WC.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV24DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV24DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV18ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         wb_table2_139_23Y2( true) ;
      }
      else
      {
         wb_table2_139_23Y2( false) ;
      }
      return  ;
   }

   public void wb_table2_139_23Y2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table3_144_23Y2( true) ;
      }
      else
      {
         wb_table3_144_23Y2( false) ;
      }
      return  ;
   }

   public void wb_table3_144_23Y2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 89 )
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
               AV89GXV1 = nGXsfl_89_idx ;
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

   public void start23Y2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Precios por cliente", ""), (short)(0)) ;
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
            strup23Y0( ) ;
         }
      }
   }

   public void ws23Y2( )
   {
      start23Y2( ) ;
      evt23Y2( ) ;
   }

   public void evt23Y2( )
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
                              strup23Y0( ) ;
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
                              strup23Y0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1223Y2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup23Y0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1323Y2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup23Y0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1423Y2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup23Y0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1523Y2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_BTNCONFORMEPRECIOS.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup23Y0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1623Y2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_BTNRECALCULO.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup23Y0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1723Y2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DORECALCULO'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup23Y0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoRecalculo' */
                                 e1823Y2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup23Y0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e1923Y2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup23Y0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e2023Y2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup23Y0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                              }
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 50), "PRECIOS_CLIENTE_SDT__NEWPREKGM.CONTROLVALUECHANGED") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 43), "PRECIOS_CLIENTE_SDT__MV.CONTROLVALUECHANGED") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup23Y0( ) ;
                           }
                           nGXsfl_89_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_89_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_89_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_892( ) ;
                           AV89GXV1 = (int)(nGXsfl_89_idx+GRID_nFirstRecordOnPage) ;
                           if ( ( AV13Precios_cliente_SDT.size() >= AV89GXV1 ) && ( AV89GXV1 > 0 ) )
                           {
                              AV13Precios_cliente_SDT.currentItem( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)) );
                              AV43Prompt = httpContext.cgiGet( edtavPrompt_Internalname) ;
                              httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrompt_Internalname, "Bitmap", ((GXutil.strcmp("", AV43Prompt)==0) ? AV126Prompt_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV43Prompt))), !bGXsfl_89_Refreshing);
                              httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrompt_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV43Prompt), true);
                           }
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
                                       /* Execute user event: Start */
                                       e2123Y2 ();
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
                                       /* Execute user event: Refresh */
                                       e2223Y2 ();
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
                                       e2323Y2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "PRECIOS_CLIENTE_SDT__NEWPREKGM.CONTROLVALUECHANGED") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       e2423Y2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "PRECIOS_CLIENTE_SDT__MV.CONTROLVALUECHANGED") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       e2523Y2 ();
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
                                    strup23Y0( ) ;
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

   public void we23Y2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm23Y2( ) ;
         }
      }
   }

   public void pa23Y2( )
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
      subsflControlProps_892( ) ;
      while ( nGXsfl_89_idx <= nRC_GXsfl_89 )
      {
         sendrow_892( ) ;
         nGXsfl_89_idx = ((subGrid_Islastpage==1)&&(nGXsfl_89_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_89_idx+1) ;
         sGXsfl_89_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_89_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_892( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV18ColumnsSelector ,
                                 String AV123Pgmname ,
                                 short AV80OrderedBy ,
                                 boolean AV78OrderedDsc ,
                                 String AV28Emprcod ,
                                 int AV29CliCod ,
                                 String AV32CliNom ,
                                 int AV30ForColNum ,
                                 String AV31SP ,
                                 String AV83ForBlo ,
                                 GXBaseCollection<app.facturacion.SdtPrecios_cliente_SDT_Item> AV13Precios_cliente_SDT ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e2223Y2 ();
      GRID_nCurrentRecord = 0 ;
      rf23Y2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"Precios_cliente_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV123Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\precios_cliente_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      AV31SP = ((GXutil.strcmp(GXutil.rtrim( AV31SP), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31SP", AV31SP);
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf23Y2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV123Pgmname = "Facturacion.Precios_cliente_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV123Pgmname", AV123Pgmname);
      Gx_err = (short)(0) ;
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavForcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavForcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavForcolnum_Enabled), 5, 0), true);
      chkavSp.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSp.getInternalname(), "Enabled", GXutil.ltrimstr( chkavSp.getEnabled(), 5, 0), true);
      edtavPrecios_cliente_sdt__forser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__forser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__forser_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__forserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__forserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__forserdsc_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__forcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__forcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__forcolnum_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__tipcolcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__tipcolcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__tipcolcod_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__forcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__forcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__forcolnom_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__fornomcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__fornomcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__fornomcli_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__intdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__intdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__intdsc_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__grdtipart_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__grdtipart_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__grdtipart_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__cr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__cr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__cr_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__forcan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__forcan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__forcan_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__pc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__pc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__pc_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__pv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__pv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__pv_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__forprefec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__forprefec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__forprefec_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__forfecant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__forfecant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__forfecant_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__c_m_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__c_m_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__c_m_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__cm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__cm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__cm_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__fi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__fi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__fi_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__ti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__ti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__ti_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__mc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__mc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__mc_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__f_i_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__f_i_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__f_i_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__tipartdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__tipartdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__tipartdsc_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__artdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__artdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__artdsc_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__fortonal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__fortonal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__fortonal_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__fam_cod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__fam_cod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__fam_cod_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__forcosuti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__forcosuti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__forcosuti_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__oldclasse_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__oldclasse_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__oldclasse_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__fornumcol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__fornumcol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__fornumcol_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      cmbavPrecios_cliente_sdt__clitipo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavPrecios_cliente_sdt__clitipo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavPrecios_cliente_sdt__clitipo.getEnabled(), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__forrelban_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__forrelban_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__forrelban_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf23Y2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(89) ;
      /* Execute user event: Refresh */
      e2223Y2 ();
      nGXsfl_89_idx = 1 ;
      sGXsfl_89_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_89_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_892( ) ;
      bGXsfl_89_Refreshing = true ;
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
         subsflControlProps_892( ) ;
         e2323Y2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_89_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e2323Y2 ();
         }
         wbEnd = (short)(89) ;
         wb23Y0( ) ;
      }
      bGXsfl_89_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes23Y2( )
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
      return AV13Precios_cliente_SDT.size() ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV18ColumnsSelector, AV123Pgmname, AV80OrderedBy, AV78OrderedDsc, AV28Emprcod, AV29CliCod, AV32CliNom, AV30ForColNum, AV31SP, AV83ForBlo, AV13Precios_cliente_SDT, sPrefix) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV18ColumnsSelector, AV123Pgmname, AV80OrderedBy, AV78OrderedDsc, AV28Emprcod, AV29CliCod, AV32CliNom, AV30ForColNum, AV31SP, AV83ForBlo, AV13Precios_cliente_SDT, sPrefix) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV18ColumnsSelector, AV123Pgmname, AV80OrderedBy, AV78OrderedDsc, AV28Emprcod, AV29CliCod, AV32CliNom, AV30ForColNum, AV31SP, AV83ForBlo, AV13Precios_cliente_SDT, sPrefix) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV18ColumnsSelector, AV123Pgmname, AV80OrderedBy, AV78OrderedDsc, AV28Emprcod, AV29CliCod, AV32CliNom, AV30ForColNum, AV31SP, AV83ForBlo, AV13Precios_cliente_SDT, sPrefix) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV18ColumnsSelector, AV123Pgmname, AV80OrderedBy, AV78OrderedDsc, AV28Emprcod, AV29CliCod, AV32CliNom, AV30ForColNum, AV31SP, AV83ForBlo, AV13Precios_cliente_SDT, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV123Pgmname = "Facturacion.Precios_cliente_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV123Pgmname", AV123Pgmname);
      Gx_err = (short)(0) ;
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavForcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavForcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavForcolnum_Enabled), 5, 0), true);
      chkavSp.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSp.getInternalname(), "Enabled", GXutil.ltrimstr( chkavSp.getEnabled(), 5, 0), true);
      edtavPrecios_cliente_sdt__forser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__forser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__forser_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__forserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__forserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__forserdsc_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__forcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__forcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__forcolnum_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__tipcolcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__tipcolcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__tipcolcod_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__forcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__forcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__forcolnom_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__fornomcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__fornomcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__fornomcli_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__intdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__intdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__intdsc_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__grdtipart_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__grdtipart_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__grdtipart_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__cr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__cr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__cr_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__forcan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__forcan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__forcan_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__pc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__pc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__pc_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__pv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__pv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__pv_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__forprefec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__forprefec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__forprefec_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__forfecant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__forfecant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__forfecant_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__c_m_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__c_m_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__c_m_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__cm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__cm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__cm_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__fi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__fi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__fi_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__ti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__ti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__ti_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__mc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__mc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__mc_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__f_i_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__f_i_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__f_i_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__tipartdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__tipartdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__tipartdsc_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__artdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__artdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__artdsc_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__fortonal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__fortonal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__fortonal_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__fam_cod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__fam_cod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__fam_cod_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__forcosuti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__forcosuti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__forcosuti_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__oldclasse_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__oldclasse_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__oldclasse_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__fornumcol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__fornumcol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__fornumcol_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      cmbavPrecios_cliente_sdt__clitipo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavPrecios_cliente_sdt__clitipo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavPrecios_cliente_sdt__clitipo.getEnabled(), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__forrelban_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__forrelban_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__forrelban_Enabled), 5, 0), !bGXsfl_89_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup23Y0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e2123Y2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"Precios_cliente_sdt"), AV13Precios_cliente_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV24DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV18ColumnsSelector);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vPRECIOS_CLIENTE_SDT"), AV13Precios_cliente_SDT);
         /* Read saved values. */
         nRC_GXsfl_89 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_89"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV26GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV27GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV28Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV28Emprcod") ;
         wcpOAV29CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV29CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV32CliNom = httpContext.cgiGet( sPrefix+"wcpOAV32CliNom") ;
         wcpOAV30ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV30ForColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV31SP = httpContext.cgiGet( sPrefix+"wcpOAV31SP") ;
         wcpOAV83ForBlo = httpContext.cgiGet( sPrefix+"wcpOAV83ForBlo") ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Dvpanel_unnamedtable1_Width = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Width") ;
         Dvpanel_unnamedtable1_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Autowidth")) ;
         Dvpanel_unnamedtable1_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoheight")) ;
         Dvpanel_unnamedtable1_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Cls") ;
         Dvpanel_unnamedtable1_Title = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Title") ;
         Dvpanel_unnamedtable1_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsible")) ;
         Dvpanel_unnamedtable1_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsed")) ;
         Dvpanel_unnamedtable1_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Showcollapseicon")) ;
         Dvpanel_unnamedtable1_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Iconposition") ;
         Dvpanel_unnamedtable1_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoscroll")) ;
         Dvpanel_unnamedtable2_Width = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Width") ;
         Dvpanel_unnamedtable2_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Autowidth")) ;
         Dvpanel_unnamedtable2_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Autoheight")) ;
         Dvpanel_unnamedtable2_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Cls") ;
         Dvpanel_unnamedtable2_Title = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Title") ;
         Dvpanel_unnamedtable2_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Collapsible")) ;
         Dvpanel_unnamedtable2_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Collapsed")) ;
         Dvpanel_unnamedtable2_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Showcollapseicon")) ;
         Dvpanel_unnamedtable2_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Iconposition") ;
         Dvpanel_unnamedtable2_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Autoscroll")) ;
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
         Ddo_grid_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Includesortasc = httpContext.cgiGet( sPrefix+"DDO_GRID_Includesortasc") ;
         Ddo_grid_Fixable = httpContext.cgiGet( sPrefix+"DDO_GRID_Fixable") ;
         Ddo_grid_Sortedstatus = httpContext.cgiGet( sPrefix+"DDO_GRID_Sortedstatus") ;
         Ddo_gridcolumnsselector_Caption = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption") ;
         Ddo_gridcolumnsselector_Tooltip = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip") ;
         Ddo_gridcolumnsselector_Cls = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls") ;
         Ddo_gridcolumnsselector_Dropdownoptionstype = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype") ;
         Ddo_gridcolumnsselector_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname") ;
         Ddo_gridcolumnsselector_Titlecontrolidtoreplace = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace") ;
         Dvelop_confirmpanel_btnconformeprecios_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFORMEPRECIOS_Title") ;
         Dvelop_confirmpanel_btnconformeprecios_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFORMEPRECIOS_Confirmationtext") ;
         Dvelop_confirmpanel_btnconformeprecios_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFORMEPRECIOS_Yesbuttoncaption") ;
         Dvelop_confirmpanel_btnconformeprecios_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFORMEPRECIOS_Nobuttoncaption") ;
         Dvelop_confirmpanel_btnconformeprecios_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFORMEPRECIOS_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_btnconformeprecios_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFORMEPRECIOS_Yesbuttonposition") ;
         Dvelop_confirmpanel_btnconformeprecios_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFORMEPRECIOS_Confirmtype") ;
         Dvelop_confirmpanel_btnrecalculo_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNRECALCULO_Title") ;
         Dvelop_confirmpanel_btnrecalculo_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNRECALCULO_Confirmationtext") ;
         Dvelop_confirmpanel_btnrecalculo_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNRECALCULO_Yesbuttoncaption") ;
         Dvelop_confirmpanel_btnrecalculo_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNRECALCULO_Nobuttoncaption") ;
         Dvelop_confirmpanel_btnrecalculo_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNRECALCULO_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_btnrecalculo_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNRECALCULO_Yesbuttonposition") ;
         Dvelop_confirmpanel_btnrecalculo_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNRECALCULO_Confirmtype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascolumnsselector")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_get") ;
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         Dvelop_confirmpanel_btnconformeprecios_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFORMEPRECIOS_Result") ;
         Dvelop_confirmpanel_btnrecalculo_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNRECALCULO_Result") ;
         nRC_GXsfl_89 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_89"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_89_fel_idx = 0 ;
         while ( nGXsfl_89_fel_idx < nRC_GXsfl_89 )
         {
            nGXsfl_89_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_89_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_89_fel_idx+1) ;
            sGXsfl_89_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_89_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_892( ) ;
            AV89GXV1 = (int)(nGXsfl_89_fel_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV13Precios_cliente_SDT.size() >= AV89GXV1 ) && ( AV89GXV1 > 0 ) )
            {
               AV13Precios_cliente_SDT.currentItem( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)) );
               AV43Prompt = httpContext.cgiGet( edtavPrompt_Internalname) ;
            }
         }
         if ( nGXsfl_89_fel_idx == 0 )
         {
            nGXsfl_89_idx = 1 ;
            sGXsfl_89_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_89_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_892( ) ;
         }
         nGXsfl_89_fel_idx = 1 ;
         /* Read variables values. */
         AV123Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV123Pgmname", AV123Pgmname);
         /* Read subfile selected row values. */
         nGXsfl_89_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_89_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_89_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_892( ) ;
         AV89GXV1 = (int)(nGXsfl_89_idx+GRID_nFirstRecordOnPage) ;
         if ( nGXsfl_89_idx > 0 )
         {
            AV89GXV1 = (int)(nGXsfl_89_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV13Precios_cliente_SDT.size() >= AV89GXV1 ) && ( AV89GXV1 > 0 ) )
            {
               AV13Precios_cliente_SDT.currentItem( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)) );
               AV43Prompt = httpContext.cgiGet( edtavPrompt_Internalname) ;
            }
            if ( ( AV89GXV1 > 0 ) && ( AV13Precios_cliente_SDT.size() >= AV89GXV1 ) )
            {
               AV13Precios_cliente_SDT.currentItem( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)) );
            }
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"Precios_cliente_WC");
         AV123Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV123Pgmname", AV123Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV123Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("facturacion\\precios_cliente_wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e2123Y2 ();
      if (returnInSub) return;
   }

   public void e2123Y2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV40Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      precios_cliente_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV40Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40Station", AV40Station);
      GXv_char2[0] = AV28Emprcod ;
      GXv_char3[0] = AV41EmprNom ;
      GXv_char4[0] = AV42UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV40Station, GXv_char2, GXv_char3, GXv_char4) ;
      precios_cliente_wc_impl.this.AV28Emprcod = GXv_char2[0] ;
      precios_cliente_wc_impl.this.AV41EmprNom = GXv_char3[0] ;
      precios_cliente_wc_impl.this.AV42UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Emprcod", AV28Emprcod);
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if (returnInSub) return;
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      if ( AV80OrderedBy < 1 )
      {
         AV80OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV24DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV24DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_objcol_SdtPrecios_cliente_SDT_Item7 = AV13Precios_cliente_SDT ;
      GXv_objcol_SdtPrecios_cliente_SDT_Item8[0] = GXt_objcol_SdtPrecios_cliente_SDT_Item7 ;
      new app.facturacion.precios_cliente_dp(remoteHandle, context).execute( AV28Emprcod, AV29CliCod, AV30ForColNum, AV31SP, AV83ForBlo, GXv_objcol_SdtPrecios_cliente_SDT_Item8) ;
      GXt_objcol_SdtPrecios_cliente_SDT_Item7 = GXv_objcol_SdtPrecios_cliente_SDT_Item8[0] ;
      AV13Precios_cliente_SDT = GXt_objcol_SdtPrecios_cliente_SDT_Item7 ;
      gx_BV89 = true ;
   }

   public void e2223Y2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext9[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV6WWPContext = GXv_SdtWWPContext9[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV20Session.getValue("Facturacion.Precios_cliente_WCColumnsSelector"), "") != 0 )
      {
         AV16ColumnsSelectorXML = AV20Session.getValue("Facturacion.Precios_cliente_WCColumnsSelector") ;
         AV18ColumnsSelector.fromxml(AV16ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S152 ();
         if (returnInSub) return;
      }
      chkavPrecios_cliente_sdt__seleccionar.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavPrecios_cliente_sdt__seleccionar.getInternalname(), "Visible", GXutil.ltrimstr( chkavPrecios_cliente_sdt__seleccionar.getVisible(), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__forser_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__forser_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__forser_Visible), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__forserdsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__forserdsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__forserdsc_Visible), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__forcolnum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__forcolnum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__forcolnum_Visible), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__tipcolcod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__tipcolcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__tipcolcod_Visible), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__forcolnom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__forcolnom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__forcolnom_Visible), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__fornomcli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__fornomcli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__fornomcli_Visible), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__intdsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__intdsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__intdsc_Visible), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__grdtipart_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__grdtipart_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__grdtipart_Visible), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__cr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__cr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__cr_Visible), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__forcan_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__forcan_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__forcan_Visible), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__pc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__pc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__pc_Visible), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__mv_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__mv_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__mv_Visible), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__pv_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__pv_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__pv_Visible), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__newprekgm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__newprekgm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__newprekgm_Visible), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__obs_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__obs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__obs_Visible), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__forprefec_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__forprefec_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__forprefec_Visible), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__forfecant_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__forfecant_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__forfecant_Visible), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__c_m_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__c_m_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__c_m_Visible), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__cm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__cm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__cm_Visible), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__fi_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__fi_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__fi_Visible), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__ti_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__ti_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__ti_Visible), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__mc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__mc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__mc_Visible), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__f_i_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__f_i_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__f_i_Visible), 5, 0), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__forrelban_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__forrelban_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_sdt__forrelban_Visible), 5, 0), !bGXsfl_89_Refreshing);
      /* Execute user subroutine: 'LOADGRIDSDT' */
      S162 ();
      if (returnInSub) return;
      AV26GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26GridCurrentPage), 10, 0));
      AV27GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27GridPageCount), 10, 0));
      chkavPrecios_cliente_sdt__seleccionar.setColumnHeaderClass( "WWColumn" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavPrecios_cliente_sdt__seleccionar.getInternalname(), "Columnheaderclass", chkavPrecios_cliente_sdt__seleccionar.getColumnHeaderClass(), !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__forser_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__forser_Internalname, "Columnheaderclass", edtavPrecios_cliente_sdt__forser_Columnheaderclass, !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__forserdsc_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__forserdsc_Internalname, "Columnheaderclass", edtavPrecios_cliente_sdt__forserdsc_Columnheaderclass, !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__forcolnum_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__forcolnum_Internalname, "Columnheaderclass", edtavPrecios_cliente_sdt__forcolnum_Columnheaderclass, !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__tipcolcod_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__tipcolcod_Internalname, "Columnheaderclass", edtavPrecios_cliente_sdt__tipcolcod_Columnheaderclass, !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__forcolnom_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__forcolnom_Internalname, "Columnheaderclass", edtavPrecios_cliente_sdt__forcolnom_Columnheaderclass, !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__fornomcli_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__fornomcli_Internalname, "Columnheaderclass", edtavPrecios_cliente_sdt__fornomcli_Columnheaderclass, !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__intdsc_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__intdsc_Internalname, "Columnheaderclass", edtavPrecios_cliente_sdt__intdsc_Columnheaderclass, !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__grdtipart_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__grdtipart_Internalname, "Columnheaderclass", edtavPrecios_cliente_sdt__grdtipart_Columnheaderclass, !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__cr_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__cr_Internalname, "Columnheaderclass", edtavPrecios_cliente_sdt__cr_Columnheaderclass, !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__forcan_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__forcan_Internalname, "Columnheaderclass", edtavPrecios_cliente_sdt__forcan_Columnheaderclass, !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__pc_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__pc_Internalname, "Columnheaderclass", edtavPrecios_cliente_sdt__pc_Columnheaderclass, !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__mv_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__mv_Internalname, "Columnheaderclass", edtavPrecios_cliente_sdt__mv_Columnheaderclass, !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__pv_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__pv_Internalname, "Columnheaderclass", edtavPrecios_cliente_sdt__pv_Columnheaderclass, !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__newprekgm_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__newprekgm_Internalname, "Columnheaderclass", edtavPrecios_cliente_sdt__newprekgm_Columnheaderclass, !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__obs_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__obs_Internalname, "Columnheaderclass", edtavPrecios_cliente_sdt__obs_Columnheaderclass, !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__forprefec_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__forprefec_Internalname, "Columnheaderclass", edtavPrecios_cliente_sdt__forprefec_Columnheaderclass, !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__forfecant_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__forfecant_Internalname, "Columnheaderclass", edtavPrecios_cliente_sdt__forfecant_Columnheaderclass, !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__c_m_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__c_m_Internalname, "Columnheaderclass", edtavPrecios_cliente_sdt__c_m_Columnheaderclass, !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__cm_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__cm_Internalname, "Columnheaderclass", edtavPrecios_cliente_sdt__cm_Columnheaderclass, !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__fi_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__fi_Internalname, "Columnheaderclass", edtavPrecios_cliente_sdt__fi_Columnheaderclass, !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__ti_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__ti_Internalname, "Columnheaderclass", edtavPrecios_cliente_sdt__ti_Columnheaderclass, !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__mc_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__mc_Internalname, "Columnheaderclass", edtavPrecios_cliente_sdt__mc_Columnheaderclass, !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__f_i_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__f_i_Internalname, "Columnheaderclass", edtavPrecios_cliente_sdt__f_i_Columnheaderclass, !bGXsfl_89_Refreshing);
      edtavPrecios_cliente_sdt__forrelban_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_sdt__forrelban_Internalname, "Columnheaderclass", edtavPrecios_cliente_sdt__forrelban_Columnheaderclass, !bGXsfl_89_Refreshing);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV18ColumnsSelector", AV18ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV13Precios_cliente_SDT", AV13Precios_cliente_SDT);
   }

   public void e1223Y2( )
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
         AV25PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV25PageToGo) ;
      }
   }

   public void e1323Y2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e1423Y2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV80OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80OrderedBy), 4, 0));
         AV78OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78OrderedDsc", AV78OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e2323Y2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV89GXV1 = 1 ;
      while ( AV89GXV1 <= AV13Precios_cliente_SDT.size() )
      {
         AV13Precios_cliente_SDT.currentItem( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)) );
         if ( ((app.facturacion.SdtPrecios_cliente_SDT_Item)(AV13Precios_cliente_SDT.currentItem())).getgxTv_SdtPrecios_cliente_SDT_Item_Seleccionar() )
         {
            chkavPrecios_cliente_sdt__seleccionar.setColumnClass( "WWColumn WWColumnSuccess WWColumnSuccessFirstColumn" );
            edtavPrecios_cliente_sdt__forser_Columnclass = "WWColumn WWColumnSuccess" ;
            edtavPrecios_cliente_sdt__forserdsc_Columnclass = "WWColumn WWColumnSuccess" ;
            edtavPrecios_cliente_sdt__forcolnum_Columnclass = "WWColumn WWColumnSuccess" ;
            edtavPrecios_cliente_sdt__tipcolcod_Columnclass = "WWColumn WWColumnSuccess" ;
            edtavPrecios_cliente_sdt__forcolnom_Columnclass = "WWColumn WWColumnSuccess" ;
            edtavPrecios_cliente_sdt__fornomcli_Columnclass = "WWColumn WWColumnSuccess" ;
            edtavPrecios_cliente_sdt__intdsc_Columnclass = "WWColumn WWColumnSuccess" ;
            edtavPrecios_cliente_sdt__grdtipart_Columnclass = "WWColumn WWColumnSuccess" ;
            edtavPrecios_cliente_sdt__cr_Columnclass = "WWColumn WWColumnSuccess" ;
            edtavPrecios_cliente_sdt__forcan_Columnclass = "WWColumn WWColumnSuccess" ;
            edtavPrecios_cliente_sdt__pc_Columnclass = "WWColumn WWColumnSuccess" ;
            edtavPrecios_cliente_sdt__mv_Columnclass = "WWColumn WWColumnSuccess" ;
            edtavPrecios_cliente_sdt__pv_Columnclass = "WWColumn WWColumnSuccess" ;
            edtavPrecios_cliente_sdt__newprekgm_Columnclass = "WWColumn WWColumnSuccess" ;
            edtavPrecios_cliente_sdt__obs_Columnclass = "WWColumn WWColumnSuccess" ;
            edtavPrecios_cliente_sdt__forprefec_Columnclass = "WWColumn WWColumnSuccess" ;
            edtavPrecios_cliente_sdt__forfecant_Columnclass = "WWColumn WWColumnSuccess" ;
            edtavPrecios_cliente_sdt__c_m_Columnclass = "WWColumn WWColumnSuccess" ;
            edtavPrecios_cliente_sdt__cm_Columnclass = "WWColumn WWColumnSuccess" ;
            edtavPrecios_cliente_sdt__fi_Columnclass = "WWColumn WWColumnSuccess" ;
            edtavPrecios_cliente_sdt__ti_Columnclass = "WWColumn WWColumnSuccess" ;
            edtavPrecios_cliente_sdt__mc_Columnclass = "WWColumn WWColumnSuccess" ;
            edtavPrecios_cliente_sdt__f_i_Columnclass = "WWColumn WWColumnSuccess" ;
            edtavPrecios_cliente_sdt__forrelban_Columnclass = "WWColumn WWColumnSuccess" ;
         }
         else
         {
            chkavPrecios_cliente_sdt__seleccionar.setColumnClass( httpContext.getMessage( "WWColumn", "") );
            edtavPrecios_cliente_sdt__forser_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtavPrecios_cliente_sdt__forserdsc_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtavPrecios_cliente_sdt__forcolnum_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtavPrecios_cliente_sdt__tipcolcod_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtavPrecios_cliente_sdt__forcolnom_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtavPrecios_cliente_sdt__fornomcli_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtavPrecios_cliente_sdt__intdsc_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtavPrecios_cliente_sdt__grdtipart_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtavPrecios_cliente_sdt__cr_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtavPrecios_cliente_sdt__forcan_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtavPrecios_cliente_sdt__pc_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtavPrecios_cliente_sdt__mv_Columnclass = ((((app.facturacion.SdtPrecios_cliente_SDT_Item)(AV13Precios_cliente_SDT.currentItem())).getgxTv_SdtPrecios_cliente_SDT_Item_Mv().doubleValue()>=0) ? "WWColumn WWColumnSuccess WWColumnSuccessSingleCell" : "WWColumn") ;
            edtavPrecios_cliente_sdt__pv_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtavPrecios_cliente_sdt__newprekgm_Columnclass = "WWColumn WWColumnSuccess WWColumnSuccessSingleCell" ;
            edtavPrecios_cliente_sdt__obs_Columnclass = "WWColumn WWColumnSuccess WWColumnSuccessSingleCell" ;
            edtavPrecios_cliente_sdt__forprefec_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtavPrecios_cliente_sdt__forfecant_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtavPrecios_cliente_sdt__c_m_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtavPrecios_cliente_sdt__cm_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtavPrecios_cliente_sdt__fi_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtavPrecios_cliente_sdt__ti_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtavPrecios_cliente_sdt__mc_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtavPrecios_cliente_sdt__f_i_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtavPrecios_cliente_sdt__forrelban_Columnclass = httpContext.getMessage( "WWColumn", "") ;
         }
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(89) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_892( ) ;
            GRID_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRID_nCurrentRecord + 1 >= subgrid_fnc_recordcount( ) )
            {
               GRID_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_89_Refreshing )
         {
            httpContext.doAjaxLoad(89, GridRow);
         }
         AV89GXV1 = (int)(AV89GXV1+1) ;
      }
      /*  Sending Event outputs  */
   }

   public void e1523Y2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV16ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV18ColumnsSelector.fromJSonString(AV16ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "Facturacion.Precios_cliente_WCColumnsSelector", ((GXutil.strcmp("", AV16ColumnsSelectorXML)==0) ? "" : AV18ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV18ColumnsSelector", AV18ColumnsSelector);
      if ( gx_BV89 )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV13Precios_cliente_SDT", AV13Precios_cliente_SDT);
         nGXsfl_89_bak_idx = nGXsfl_89_idx ;
         gxgrgrid_refresh( subGrid_Rows, AV18ColumnsSelector, AV123Pgmname, AV80OrderedBy, AV78OrderedDsc, AV28Emprcod, AV29CliCod, AV32CliNom, AV30ForColNum, AV31SP, AV83ForBlo, AV13Precios_cliente_SDT, sPrefix) ;
         nGXsfl_89_idx = nGXsfl_89_bak_idx ;
         sGXsfl_89_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_89_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_892( ) ;
      }
   }

   public void e1623Y2( )
   {
      AV89GXV1 = (int)(nGXsfl_89_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV89GXV1 > 0 ) && ( AV13Precios_cliente_SDT.size() >= AV89GXV1 ) )
      {
         AV13Precios_cliente_SDT.currentItem( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)) );
      }
      /* Dvelop_confirmpanel_btnconformeprecios_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_btnconformeprecios_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION CONFORMEPRECIOS' */
         S172 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV45Precios_cliente_SDT_item", AV45Precios_cliente_SDT_item);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV13Precios_cliente_SDT", AV13Precios_cliente_SDT);
      nGXsfl_89_bak_idx = nGXsfl_89_idx ;
      gxgrgrid_refresh( subGrid_Rows, AV18ColumnsSelector, AV123Pgmname, AV80OrderedBy, AV78OrderedDsc, AV28Emprcod, AV29CliCod, AV32CliNom, AV30ForColNum, AV31SP, AV83ForBlo, AV13Precios_cliente_SDT, sPrefix) ;
      nGXsfl_89_idx = nGXsfl_89_bak_idx ;
      sGXsfl_89_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_89_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_892( ) ;
   }

   public void e1823Y2( )
   {
      AV89GXV1 = (int)(nGXsfl_89_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV89GXV1 > 0 ) && ( AV13Precios_cliente_SDT.size() >= AV89GXV1 ) )
      {
         AV13Precios_cliente_SDT.currentItem( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)) );
      }
      /* 'DoRecalculo' Routine */
      returnInSub = false ;
      AV33ForSer = ((app.facturacion.SdtPrecios_cliente_SDT_Item)(AV13Precios_cliente_SDT.currentItem())).getgxTv_SdtPrecios_cliente_SDT_Item_Forser() ;
      AV34ForColNom = ((app.facturacion.SdtPrecios_cliente_SDT_Item)(AV13Precios_cliente_SDT.currentItem())).getgxTv_SdtPrecios_cliente_SDT_Item_Forcolnom() ;
      AV82INForcolnum = ((app.facturacion.SdtPrecios_cliente_SDT_Item)(AV13Precios_cliente_SDT.currentItem())).getgxTv_SdtPrecios_cliente_SDT_Item_Forcolnum() ;
      AV35TipColCod = ((app.facturacion.SdtPrecios_cliente_SDT_Item)(AV13Precios_cliente_SDT.currentItem())).getgxTv_SdtPrecios_cliente_SDT_Item_Tipcolcod() ;
      AV36ForRelBan = AV45Precios_cliente_SDT_item.getgxTv_SdtPrecios_cliente_SDT_Item_Forrelban() ;
      Dvelop_confirmpanel_btnrecalculo_Confirmationtext = httpContext.getMessage( "Deseja recalcular a cor:", "")+GXutil.newLine( ) ;
      ucDvelop_confirmpanel_btnrecalculo.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_btnrecalculo_Internalname, "ConfirmationText", Dvelop_confirmpanel_btnrecalculo_Confirmationtext);
      Dvelop_confirmpanel_btnrecalculo_Confirmationtext = Dvelop_confirmpanel_btnrecalculo_Confirmationtext+httpContext.getMessage( "Cliente= ", "")+localUtil.format( DecimalUtil.doubleToDec(AV29CliCod), "ZZZZZ9")+httpContext.getMessage( " Artigo= ", "")+GXutil.trim( AV33ForSer)+httpContext.getMessage( " Cor= ", "")+GXutil.trim( AV34ForColNom)+httpContext.getMessage( " Numero= ", "")+localUtil.format( DecimalUtil.doubleToDec(AV82INForcolnum), "ZZZZZ9")+httpContext.getMessage( " TC=", "")+GXutil.str( AV35TipColCod, 2, 0)+" ?" ;
      ucDvelop_confirmpanel_btnrecalculo.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_btnrecalculo_Internalname, "ConfirmationText", Dvelop_confirmpanel_btnrecalculo_Confirmationtext);
      this.executeUsercontrolMethod(sPrefix, false, "DVELOP_CONFIRMPANEL_BTNRECALCULOContainer", "Confirm", "", new Object[] {});
      /*  Sending Event outputs  */
   }

   public void e1723Y2( )
   {
      AV89GXV1 = (int)(nGXsfl_89_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV89GXV1 > 0 ) && ( AV13Precios_cliente_SDT.size() >= AV89GXV1 ) )
      {
         AV13Precios_cliente_SDT.currentItem( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)) );
      }
      /* Dvelop_confirmpanel_btnrecalculo_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_btnrecalculo_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'APLICARDORECALCULO' */
         S182 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV13Precios_cliente_SDT", AV13Precios_cliente_SDT);
      nGXsfl_89_bak_idx = nGXsfl_89_idx ;
      gxgrgrid_refresh( subGrid_Rows, AV18ColumnsSelector, AV123Pgmname, AV80OrderedBy, AV78OrderedDsc, AV28Emprcod, AV29CliCod, AV32CliNom, AV30ForColNum, AV31SP, AV83ForBlo, AV13Precios_cliente_SDT, sPrefix) ;
      nGXsfl_89_idx = nGXsfl_89_bak_idx ;
      sGXsfl_89_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_89_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_892( ) ;
   }

   public void e1923Y2( )
   {
      AV89GXV1 = (int)(nGXsfl_89_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV89GXV1 > 0 ) && ( AV13Precios_cliente_SDT.size() >= AV89GXV1 ) )
      {
         AV13Precios_cliente_SDT.currentItem( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)) );
      }
      /* 'DoExport' Routine */
      returnInSub = false ;
      AV37Precios_cliente_Json = AV13Precios_cliente_SDT.toJSonString(false) ;
      AV38WebSession.setValue("&Precios_cliente_Json", AV37Precios_cliente_Json);
      GXv_char4[0] = AV14ExcelFilename ;
      GXv_char3[0] = AV15ErrorMessage ;
      new app.facturacion.precios_cliente_wcexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      precios_cliente_wc_impl.this.AV14ExcelFilename = GXv_char4[0] ;
      precios_cliente_wc_impl.this.AV15ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV14ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV14ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV15ErrorMessage);
      }
   }

   public void e2023Y2( )
   {
      AV89GXV1 = (int)(nGXsfl_89_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV89GXV1 > 0 ) && ( AV13Precios_cliente_SDT.size() >= AV89GXV1 ) )
      {
         AV13Precios_cliente_SDT.currentItem( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)) );
      }
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      AV37Precios_cliente_Json = AV13Precios_cliente_SDT.toJSonString(false) ;
      AV38WebSession.setValue("&Precios_cliente_Json", AV37Precios_cliente_Json);
      callWebObject(formatLink("app.facturacion.precios_cliente_wcexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void S162( )
   {
      /* 'LOADGRIDSDT' Routine */
      returnInSub = false ;
      AV13Precios_cliente_SDT.sort((AV78OrderedDsc ? "[" : "")+GXutil.format( "%"+GXutil.trim( GXutil.str( AV80OrderedBy, 4, 0)), "Forser", "ForSerdsc", "Forcolnum", "Tipcolcod", "Forcolnom", "ForNomcli", "IntDsc", "", "")+(AV78OrderedDsc ? "]" : ""));
      gx_BV89 = true ;
   }

   public void S132( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV80OrderedBy, 4, 0))+":"+(AV78OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S152( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV18ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Precios_cliente_SDT__Seleccionar", "", "Op", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Precios_cliente_SDT__Forser", "", "Artigo", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Precios_cliente_SDT__ForSerdsc", "", "Descriçao", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Precios_cliente_SDT__Forcolnum", "", "Numero Côr", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Precios_cliente_SDT__Tipcolcod", "", "TC", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Precios_cliente_SDT__Forcolnom", "", "Côr", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Precios_cliente_SDT__ForNomcli", "", "Côr Cliente", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Precios_cliente_SDT__IntDsc", "", "Intensidade", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Precios_cliente_SDT__Grdtipart", "", "Classe", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Precios_cliente_SDT__Cr", "", "Custo da receita", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Precios_cliente_SDT__Forcan", "", "Concentração de corante", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Precios_cliente_SDT__PC", "", "Preço de custo", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Precios_cliente_SDT__MV", "", "Margem na venda", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Precios_cliente_SDT__PV", "", "Preço de venda", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Precios_cliente_SDT__NewPreKgm", "", "Preço", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Precios_cliente_SDT__Obs", "", "Obs", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Precios_cliente_SDT__ForPrefec", "", "Data Actual", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Precios_cliente_SDT__ForFecant", "", "Data Ultima", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Precios_cliente_SDT__C_M", "", "Custo por minuto com amortização", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Precios_cliente_SDT__Cm", "", "Custo por minuto sem amortização", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Precios_cliente_SDT__Fi", "", "Fator de ineficiência", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Precios_cliente_SDT__Ti", "", "Ti", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Precios_cliente_SDT__Mc", "", "Mc", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Precios_cliente_SDT__F_i", "", "Fi", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Precios_cliente_SDT__ForRelban", "", "Rb", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXt_char1 = AV17UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Facturacion.Precios_cliente_WCColumnsSelector", GXv_char4) ;
      precios_cliente_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      AV17UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV17UserCustomValue)==0) ) )
      {
         AV19ColumnsSelectorAux.fromxml(AV17UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector10[0] = AV19ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector11[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, GXv_SdtWWPColumnsSelector11) ;
         AV19ColumnsSelectorAux = GXv_SdtWWPColumnsSelector10[0] ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      }
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV20Session.getValue(AV123Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV123Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV20Session.getValue(AV123Pgmname+"GridState"), null, null);
      }
      AV80OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80OrderedBy), 4, 0));
      AV78OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78OrderedDsc", AV78OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S132 ();
      if (returnInSub) return;
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
      AV10GridState.fromxml(AV20Session.getValue(AV123Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV80OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV78OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      if ( ! (GXutil.strcmp("", AV28Emprcod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV28Emprcod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV29CliCod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV29CliCod, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV32CliNom)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLINOM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV32CliNom );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV30ForColNum) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FORCOLNUM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV30ForColNum, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV31SP)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&SP" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV31SP );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV83ForBlo)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FORBLO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV83ForBlo );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV123Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      if ( ! ( ( 1 == 0 ) ) )
      {
         divDvpanel_unnamedtable1_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divDvpanel_unnamedtable1_cell_Internalname, "Class", divDvpanel_unnamedtable1_cell_Class, true);
      }
      else
      {
         divDvpanel_unnamedtable1_cell_Class = "col-xs-12 CellMarginTop" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divDvpanel_unnamedtable1_cell_Internalname, "Class", divDvpanel_unnamedtable1_cell_Class, true);
      }
      if ( ! ( ( 1 == 0 ) ) )
      {
         divDvpanel_unnamedtable2_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divDvpanel_unnamedtable2_cell_Internalname, "Class", divDvpanel_unnamedtable2_cell_Class, true);
      }
      else
      {
         divDvpanel_unnamedtable2_cell_Class = "col-xs-12 CellMarginTop" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divDvpanel_unnamedtable2_cell_Internalname, "Class", divDvpanel_unnamedtable2_cell_Class, true);
      }
   }

   public void e2423Y2( )
   {
      AV89GXV1 = (int)(nGXsfl_89_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV89GXV1 > 0 ) && ( AV13Precios_cliente_SDT.size() >= AV89GXV1 ) )
      {
         AV13Precios_cliente_SDT.currentItem( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)) );
      }
      /* Precios_cliente_sdt__newprekgm_Controlvaluechanged Routine */
      returnInSub = false ;
      AV84SelForcolnum = ((app.facturacion.SdtPrecios_cliente_SDT_Item)(AV13Precios_cliente_SDT.currentItem())).getgxTv_SdtPrecios_cliente_SDT_Item_Forcolnum() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84SelForcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV84SelForcolnum), 6, 0));
      if ( DecimalUtil.compareTo(((app.facturacion.SdtPrecios_cliente_SDT_Item)(AV13Precios_cliente_SDT.currentItem())).getgxTv_SdtPrecios_cliente_SDT_Item_Newprekgm(), ((app.facturacion.SdtPrecios_cliente_SDT_Item)(AV13Precios_cliente_SDT.currentItem())).getgxTv_SdtPrecios_cliente_SDT_Item_Oldprekgm()) != 0 )
      {
         ((app.facturacion.SdtPrecios_cliente_SDT_Item)(AV13Precios_cliente_SDT.currentItem())).setgxTv_SdtPrecios_cliente_SDT_Item_Seleccionar( true );
         AV85SelNewPreKgm = ((app.facturacion.SdtPrecios_cliente_SDT_Item)(AV13Precios_cliente_SDT.currentItem())).getgxTv_SdtPrecios_cliente_SDT_Item_Newprekgm() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85SelNewPreKgm", GXutil.ltrimstr( AV85SelNewPreKgm, 6, 3));
      }
      if ( ((app.facturacion.SdtPrecios_cliente_SDT_Item)(AV13Precios_cliente_SDT.currentItem())).getgxTv_SdtPrecios_cliente_SDT_Item_Newprekgm().doubleValue() == 0 )
      {
         AV85SelNewPreKgm = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85SelNewPreKgm", GXutil.ltrimstr( AV85SelNewPreKgm, 6, 3));
         ((app.facturacion.SdtPrecios_cliente_SDT_Item)(AV13Precios_cliente_SDT.currentItem())).setgxTv_SdtPrecios_cliente_SDT_Item_Seleccionar( false );
      }
      /* Execute user subroutine: 'REPLICAPRECIOPORFORMULA' */
      S192 ();
      if (returnInSub) return;
      AV84SelForcolnum = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84SelForcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV84SelForcolnum), 6, 0));
      AV85SelNewPreKgm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85SelNewPreKgm", GXutil.ltrimstr( AV85SelNewPreKgm, 6, 3));
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV13Precios_cliente_SDT", AV13Precios_cliente_SDT);
      nGXsfl_89_bak_idx = nGXsfl_89_idx ;
      gxgrgrid_refresh( subGrid_Rows, AV18ColumnsSelector, AV123Pgmname, AV80OrderedBy, AV78OrderedDsc, AV28Emprcod, AV29CliCod, AV32CliNom, AV30ForColNum, AV31SP, AV83ForBlo, AV13Precios_cliente_SDT, sPrefix) ;
      nGXsfl_89_idx = nGXsfl_89_bak_idx ;
      sGXsfl_89_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_89_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_892( ) ;
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV45Precios_cliente_SDT_item", AV45Precios_cliente_SDT_item);
   }

   public void e2523Y2( )
   {
      AV89GXV1 = (int)(nGXsfl_89_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV89GXV1 > 0 ) && ( AV13Precios_cliente_SDT.size() >= AV89GXV1 ) )
      {
         AV13Precios_cliente_SDT.currentItem( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)) );
      }
      /* Precios_cliente_sdt__mv_Controlvaluechanged Routine */
      returnInSub = false ;
      ((app.facturacion.SdtPrecios_cliente_SDT_Item)(AV13Precios_cliente_SDT.currentItem())).setgxTv_SdtPrecios_cliente_SDT_Item_Pv( DecimalUtil.doubleToDec(0) );
      AV53MV = ((app.facturacion.SdtPrecios_cliente_SDT_Item)(AV13Precios_cliente_SDT.currentItem())).getgxTv_SdtPrecios_cliente_SDT_Item_Mv() ;
      AV55PC = ((app.facturacion.SdtPrecios_cliente_SDT_Item)(AV13Precios_cliente_SDT.currentItem())).getgxTv_SdtPrecios_cliente_SDT_Item_Pc() ;
      if ( DecimalUtil.doubleToDec(1).subtract((AV53MV.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))).doubleValue() > 0 )
      {
         if ( DecimalUtil.compareTo(GXutil.roundDecimal( AV55PC.divide((DecimalUtil.doubleToDec(1).subtract((AV53MV.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)))), 18, java.math.RoundingMode.DOWN), 2), DecimalUtil.stringToDec("999999.999")) > 0 )
         {
            ((app.facturacion.SdtPrecios_cliente_SDT_Item)(AV13Precios_cliente_SDT.currentItem())).setgxTv_SdtPrecios_cliente_SDT_Item_Pv( DecimalUtil.stringToDec("999999.999") );
         }
         else
         {
            ((app.facturacion.SdtPrecios_cliente_SDT_Item)(AV13Precios_cliente_SDT.currentItem())).setgxTv_SdtPrecios_cliente_SDT_Item_Pv( GXutil.roundDecimal( AV55PC.divide((DecimalUtil.doubleToDec(1).subtract((AV53MV.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)))), 18, java.math.RoundingMode.DOWN), 2) );
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV13Precios_cliente_SDT", AV13Precios_cliente_SDT);
      nGXsfl_89_bak_idx = nGXsfl_89_idx ;
      gxgrgrid_refresh( subGrid_Rows, AV18ColumnsSelector, AV123Pgmname, AV80OrderedBy, AV78OrderedDsc, AV28Emprcod, AV29CliCod, AV32CliNom, AV30ForColNum, AV31SP, AV83ForBlo, AV13Precios_cliente_SDT, sPrefix) ;
      nGXsfl_89_idx = nGXsfl_89_bak_idx ;
      sGXsfl_89_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_89_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_892( ) ;
   }

   public void S172( )
   {
      /* 'DO ACTION CONFORMEPRECIOS' Routine */
      returnInSub = false ;
      AV51Precios_cliente_mail_SDT.clear();
      AV54Precios_cliente_mail_Json = "" ;
      AV124GXV35 = 1 ;
      while ( AV124GXV35 <= AV13Precios_cliente_SDT.size() )
      {
         AV45Precios_cliente_SDT_item = (app.facturacion.SdtPrecios_cliente_SDT_Item)((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV124GXV35));
         AV50seleccionar = AV45Precios_cliente_SDT_item.getgxTv_SdtPrecios_cliente_SDT_Item_Seleccionar() ;
         if ( AV50seleccionar )
         {
            AV33ForSer = AV45Precios_cliente_SDT_item.getgxTv_SdtPrecios_cliente_SDT_Item_Forser() ;
            AV34ForColNom = AV45Precios_cliente_SDT_item.getgxTv_SdtPrecios_cliente_SDT_Item_Forcolnom() ;
            AV82INForcolnum = AV45Precios_cliente_SDT_item.getgxTv_SdtPrecios_cliente_SDT_Item_Forcolnum() ;
            AV35TipColCod = AV45Precios_cliente_SDT_item.getgxTv_SdtPrecios_cliente_SDT_Item_Tipcolcod() ;
            AV46NewPreKgm = AV45Precios_cliente_SDT_item.getgxTv_SdtPrecios_cliente_SDT_Item_Newprekgm() ;
            AV47Obs = AV45Precios_cliente_SDT_item.getgxTv_SdtPrecios_cliente_SDT_Item_Obs() ;
            AV48GrdTipARt = AV45Precios_cliente_SDT_item.getgxTv_SdtPrecios_cliente_SDT_Item_Grdtipart() ;
            AV53MV = AV45Precios_cliente_SDT_item.getgxTv_SdtPrecios_cliente_SDT_Item_Mv() ;
            new app.pprecli2(remoteHandle, context).execute( AV28Emprcod, AV29CliCod, AV33ForSer, AV34ForColNom, AV82INForcolnum, AV35TipColCod, AV46NewPreKgm, DecimalUtil.doubleToDec(0), AV47Obs, AV48GrdTipARt, AV53MV, httpContext.getMessage( "S", "")) ;
            AV52Precios_cliente_mail_SDT_item = (app.facturacion.SdtPrecios_cliente_mail_SDT_Item)new app.facturacion.SdtPrecios_cliente_mail_SDT_Item(remoteHandle, context);
            AV52Precios_cliente_mail_SDT_item.setgxTv_SdtPrecios_cliente_mail_SDT_Item_Fortonal( AV45Precios_cliente_SDT_item.getgxTv_SdtPrecios_cliente_SDT_Item_Fortonal() );
            AV52Precios_cliente_mail_SDT_item.setgxTv_SdtPrecios_cliente_mail_SDT_Item_Artdsc( AV45Precios_cliente_SDT_item.getgxTv_SdtPrecios_cliente_SDT_Item_Artdsc() );
            AV52Precios_cliente_mail_SDT_item.setgxTv_SdtPrecios_cliente_mail_SDT_Item_Tipartdsc( AV45Precios_cliente_SDT_item.getgxTv_SdtPrecios_cliente_SDT_Item_Tipartdsc() );
            AV52Precios_cliente_mail_SDT_item.setgxTv_SdtPrecios_cliente_mail_SDT_Item_Fornomcli( AV45Precios_cliente_SDT_item.getgxTv_SdtPrecios_cliente_SDT_Item_Fornomcli() );
            AV52Precios_cliente_mail_SDT_item.setgxTv_SdtPrecios_cliente_mail_SDT_Item_Forcolnom( AV45Precios_cliente_SDT_item.getgxTv_SdtPrecios_cliente_SDT_Item_Forcolnom() );
            AV52Precios_cliente_mail_SDT_item.setgxTv_SdtPrecios_cliente_mail_SDT_Item_Forcolnum( AV45Precios_cliente_SDT_item.getgxTv_SdtPrecios_cliente_SDT_Item_Forcolnum() );
            AV52Precios_cliente_mail_SDT_item.setgxTv_SdtPrecios_cliente_mail_SDT_Item_Forprekgm( AV45Precios_cliente_SDT_item.getgxTv_SdtPrecios_cliente_SDT_Item_Newprekgm() );
            AV52Precios_cliente_mail_SDT_item.setgxTv_SdtPrecios_cliente_mail_SDT_Item_Obs( AV45Precios_cliente_SDT_item.getgxTv_SdtPrecios_cliente_SDT_Item_Obs() );
            AV52Precios_cliente_mail_SDT_item.setgxTv_SdtPrecios_cliente_mail_SDT_Item_Seleccionar( false );
            AV51Precios_cliente_mail_SDT.add(AV52Precios_cliente_mail_SDT_item, 0);
         }
         AV124GXV35 = (int)(AV124GXV35+1) ;
      }
      AV54Precios_cliente_mail_Json = AV51Precios_cliente_mail_SDT.toJSonString(false) ;
      httpContext.popup(formatLink("app.facturacion.precios_cliente_mail_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV28Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV29CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV32CliNom)),GXutil.URLEncode(GXutil.rtrim(AV54Precios_cliente_mail_Json))}, new String[] {"Emprcod","CliCod","CliNom","Precios_cliente_mail_Json"}) , new Object[] {});
      GXt_objcol_SdtPrecios_cliente_SDT_Item7 = AV13Precios_cliente_SDT ;
      GXv_objcol_SdtPrecios_cliente_SDT_Item8[0] = GXt_objcol_SdtPrecios_cliente_SDT_Item7 ;
      new app.facturacion.precios_cliente_dp(remoteHandle, context).execute( AV28Emprcod, AV29CliCod, AV30ForColNum, AV31SP, AV83ForBlo, GXv_objcol_SdtPrecios_cliente_SDT_Item8) ;
      GXt_objcol_SdtPrecios_cliente_SDT_Item7 = GXv_objcol_SdtPrecios_cliente_SDT_Item8[0] ;
      AV13Precios_cliente_SDT = GXt_objcol_SdtPrecios_cliente_SDT_Item7 ;
      gx_BV89 = true ;
      if ( (0==AV29CliCod) && (0==AV30ForColNum) )
      {
         AV13Precios_cliente_SDT.sort(httpContext.getMessage( "EmprCod,CliCod,ForSer,ForColNom,ForColNum,TipColCod,ForNomCli,ForNumCli", ""));
         gx_BV89 = true ;
      }
   }

   public void S182( )
   {
      /* 'APLICARDORECALCULO' Routine */
      returnInSub = false ;
      AV33ForSer = ((app.facturacion.SdtPrecios_cliente_SDT_Item)(AV13Precios_cliente_SDT.currentItem())).getgxTv_SdtPrecios_cliente_SDT_Item_Forser() ;
      AV34ForColNom = ((app.facturacion.SdtPrecios_cliente_SDT_Item)(AV13Precios_cliente_SDT.currentItem())).getgxTv_SdtPrecios_cliente_SDT_Item_Forcolnom() ;
      AV82INForcolnum = ((app.facturacion.SdtPrecios_cliente_SDT_Item)(AV13Precios_cliente_SDT.currentItem())).getgxTv_SdtPrecios_cliente_SDT_Item_Forcolnum() ;
      AV35TipColCod = ((app.facturacion.SdtPrecios_cliente_SDT_Item)(AV13Precios_cliente_SDT.currentItem())).getgxTv_SdtPrecios_cliente_SDT_Item_Tipcolcod() ;
      AV36ForRelBan = ((app.facturacion.SdtPrecios_cliente_SDT_Item)(AV13Precios_cliente_SDT.currentItem())).getgxTv_SdtPrecios_cliente_SDT_Item_Forrelban() ;
      AV86volumen = (int)(DecimalUtil.decToDouble(AV36ForRelBan)) ;
      GXv_char4[0] = AV28Emprcod ;
      GXv_int12[0] = AV29CliCod ;
      GXv_char3[0] = AV33ForSer ;
      GXv_char2[0] = AV34ForColNom ;
      GXv_int13[0] = AV82INForcolnum ;
      GXv_int14[0] = AV35TipColCod ;
      GXv_decimal15[0] = DecimalUtil.doubleToDec(1) ;
      GXv_int16[0] = AV86volumen ;
      GXv_char17[0] = " " ;
      GXv_decimal18[0] = DecimalUtil.doubleToDec(0) ;
      new app.psimulax(remoteHandle, context).execute( GXv_char4, GXv_int12, GXv_char3, GXv_char2, GXv_int13, GXv_int14, GXv_decimal15, GXv_int16, GXv_char17, GXv_decimal18) ;
      precios_cliente_wc_impl.this.AV28Emprcod = GXv_char4[0] ;
      precios_cliente_wc_impl.this.AV29CliCod = GXv_int12[0] ;
      precios_cliente_wc_impl.this.AV33ForSer = GXv_char3[0] ;
      precios_cliente_wc_impl.this.AV34ForColNom = GXv_char2[0] ;
      precios_cliente_wc_impl.this.AV82INForcolnum = GXv_int13[0] ;
      precios_cliente_wc_impl.this.AV35TipColCod = GXv_int14[0] ;
      precios_cliente_wc_impl.this.AV86volumen = GXv_int16[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Emprcod", AV28Emprcod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29CliCod), 6, 0));
      GXv_char17[0] = AV28Emprcod ;
      GXv_char4[0] = AV40Station ;
      GXv_decimal18[0] = AV39Valor_cor ;
      new app.pvercoste(remoteHandle, context).execute( GXv_char17, GXv_char4, GXv_decimal18) ;
      precios_cliente_wc_impl.this.AV28Emprcod = GXv_char17[0] ;
      precios_cliente_wc_impl.this.AV40Station = GXv_char4[0] ;
      precios_cliente_wc_impl.this.AV39Valor_cor = GXv_decimal18[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Emprcod", AV28Emprcod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40Station", AV40Station);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39Valor_cor", GXutil.ltrimstr( AV39Valor_cor, 11, 5));
      GXv_char17[0] = AV28Emprcod ;
      GXv_int16[0] = AV29CliCod ;
      GXv_char4[0] = AV33ForSer ;
      GXv_char3[0] = AV34ForColNom ;
      GXv_int13[0] = AV82INForcolnum ;
      GXv_int14[0] = AV35TipColCod ;
      GXv_decimal18[0] = AV39Valor_cor ;
      new app.pupdcos(remoteHandle, context).execute( GXv_char17, GXv_int16, GXv_char4, GXv_char3, GXv_int13, GXv_int14, GXv_decimal18) ;
      precios_cliente_wc_impl.this.AV28Emprcod = GXv_char17[0] ;
      precios_cliente_wc_impl.this.AV29CliCod = GXv_int16[0] ;
      precios_cliente_wc_impl.this.AV33ForSer = GXv_char4[0] ;
      precios_cliente_wc_impl.this.AV34ForColNom = GXv_char3[0] ;
      precios_cliente_wc_impl.this.AV82INForcolnum = GXv_int13[0] ;
      precios_cliente_wc_impl.this.AV35TipColCod = GXv_int14[0] ;
      precios_cliente_wc_impl.this.AV39Valor_cor = GXv_decimal18[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Emprcod", AV28Emprcod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29CliCod), 6, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39Valor_cor", GXutil.ltrimstr( AV39Valor_cor, 11, 5));
      GXt_objcol_SdtPrecios_cliente_SDT_Item7 = AV13Precios_cliente_SDT ;
      GXv_objcol_SdtPrecios_cliente_SDT_Item8[0] = GXt_objcol_SdtPrecios_cliente_SDT_Item7 ;
      new app.facturacion.precios_cliente_dp(remoteHandle, context).execute( AV28Emprcod, AV29CliCod, AV30ForColNum, AV31SP, AV83ForBlo, GXv_objcol_SdtPrecios_cliente_SDT_Item8) ;
      GXt_objcol_SdtPrecios_cliente_SDT_Item7 = GXv_objcol_SdtPrecios_cliente_SDT_Item8[0] ;
      AV13Precios_cliente_SDT = GXt_objcol_SdtPrecios_cliente_SDT_Item7 ;
      gx_BV89 = true ;
   }

   public void S192( )
   {
      /* 'REPLICAPRECIOPORFORMULA' Routine */
      returnInSub = false ;
      if ( ! (0==AV84SelForcolnum) )
      {
         AV125GXV36 = 1 ;
         while ( AV125GXV36 <= AV13Precios_cliente_SDT.size() )
         {
            AV45Precios_cliente_SDT_item = (app.facturacion.SdtPrecios_cliente_SDT_Item)((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV125GXV36));
            if ( AV45Precios_cliente_SDT_item.getgxTv_SdtPrecios_cliente_SDT_Item_Forcolnum() == AV84SelForcolnum )
            {
               AV45Precios_cliente_SDT_item.setgxTv_SdtPrecios_cliente_SDT_Item_Newprekgm( AV85SelNewPreKgm );
               ((app.facturacion.SdtPrecios_cliente_SDT_Item)(AV13Precios_cliente_SDT.currentItem())).setgxTv_SdtPrecios_cliente_SDT_Item_Seleccionar( true );
            }
            AV125GXV36 = (int)(AV125GXV36+1) ;
         }
      }
   }

   public void wb_table3_144_23Y2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_btnrecalculo_Internalname, tblTabledvelop_confirmpanel_btnrecalculo_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_btnrecalculo.setProperty("Title", Dvelop_confirmpanel_btnrecalculo_Title);
         ucDvelop_confirmpanel_btnrecalculo.setProperty("ConfirmationText", Dvelop_confirmpanel_btnrecalculo_Confirmationtext);
         ucDvelop_confirmpanel_btnrecalculo.setProperty("YesButtonCaption", Dvelop_confirmpanel_btnrecalculo_Yesbuttoncaption);
         ucDvelop_confirmpanel_btnrecalculo.setProperty("NoButtonCaption", Dvelop_confirmpanel_btnrecalculo_Nobuttoncaption);
         ucDvelop_confirmpanel_btnrecalculo.setProperty("CancelButtonCaption", Dvelop_confirmpanel_btnrecalculo_Cancelbuttoncaption);
         ucDvelop_confirmpanel_btnrecalculo.setProperty("YesButtonPosition", Dvelop_confirmpanel_btnrecalculo_Yesbuttonposition);
         ucDvelop_confirmpanel_btnrecalculo.setProperty("ConfirmType", Dvelop_confirmpanel_btnrecalculo_Confirmtype);
         ucDvelop_confirmpanel_btnrecalculo.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_btnrecalculo_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_BTNRECALCULOContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_BTNRECALCULOContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_144_23Y2e( true) ;
      }
      else
      {
         wb_table3_144_23Y2e( false) ;
      }
   }

   public void wb_table2_139_23Y2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_btnconformeprecios_Internalname, tblTabledvelop_confirmpanel_btnconformeprecios_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_btnconformeprecios.setProperty("Title", Dvelop_confirmpanel_btnconformeprecios_Title);
         ucDvelop_confirmpanel_btnconformeprecios.setProperty("ConfirmationText", Dvelop_confirmpanel_btnconformeprecios_Confirmationtext);
         ucDvelop_confirmpanel_btnconformeprecios.setProperty("YesButtonCaption", Dvelop_confirmpanel_btnconformeprecios_Yesbuttoncaption);
         ucDvelop_confirmpanel_btnconformeprecios.setProperty("NoButtonCaption", Dvelop_confirmpanel_btnconformeprecios_Nobuttoncaption);
         ucDvelop_confirmpanel_btnconformeprecios.setProperty("CancelButtonCaption", Dvelop_confirmpanel_btnconformeprecios_Cancelbuttoncaption);
         ucDvelop_confirmpanel_btnconformeprecios.setProperty("YesButtonPosition", Dvelop_confirmpanel_btnconformeprecios_Yesbuttonposition);
         ucDvelop_confirmpanel_btnconformeprecios.setProperty("ConfirmType", Dvelop_confirmpanel_btnconformeprecios_Confirmtype);
         ucDvelop_confirmpanel_btnconformeprecios.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_btnconformeprecios_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFORMEPRECIOSContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFORMEPRECIOSContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_139_23Y2e( true) ;
      }
      else
      {
         wb_table2_139_23Y2e( false) ;
      }
   }

   public void wb_table1_71_23Y2( boolean wbgen )
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
         wb_table1_71_23Y2e( true) ;
      }
      else
      {
         wb_table1_71_23Y2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV28Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Emprcod", AV28Emprcod);
      AV29CliCod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29CliCod), 6, 0));
      AV32CliNom = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32CliNom", AV32CliNom);
      AV30ForColNum = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30ForColNum), 6, 0));
      AV31SP = (String)getParm(obj,4,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31SP", AV31SP);
      AV83ForBlo = (String)getParm(obj,5,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83ForBlo", AV83ForBlo);
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
      pa23Y2( ) ;
      ws23Y2( ) ;
      we23Y2( ) ;
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
      sCtrlAV28Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV29CliCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV32CliNom = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV30ForColNum = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV31SP = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV83ForBlo = (String)getParm(obj,5,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa23Y2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "facturacion\\precios_cliente_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa23Y2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV28Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Emprcod", AV28Emprcod);
         AV29CliCod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29CliCod), 6, 0));
         AV32CliNom = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32CliNom", AV32CliNom);
         AV30ForColNum = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30ForColNum), 6, 0));
         AV31SP = (String)getParm(obj,6,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31SP", AV31SP);
         AV83ForBlo = (String)getParm(obj,7,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83ForBlo", AV83ForBlo);
      }
      wcpOAV28Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV28Emprcod") ;
      wcpOAV29CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV29CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV32CliNom = httpContext.cgiGet( sPrefix+"wcpOAV32CliNom") ;
      wcpOAV30ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV30ForColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV31SP = httpContext.cgiGet( sPrefix+"wcpOAV31SP") ;
      wcpOAV83ForBlo = httpContext.cgiGet( sPrefix+"wcpOAV83ForBlo") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV28Emprcod, wcpOAV28Emprcod) != 0 ) || ( AV29CliCod != wcpOAV29CliCod ) || ( GXutil.strcmp(AV32CliNom, wcpOAV32CliNom) != 0 ) || ( AV30ForColNum != wcpOAV30ForColNum ) || ( GXutil.strcmp(AV31SP, wcpOAV31SP) != 0 ) || ( GXutil.strcmp(AV83ForBlo, wcpOAV83ForBlo) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV28Emprcod = AV28Emprcod ;
      wcpOAV29CliCod = AV29CliCod ;
      wcpOAV32CliNom = AV32CliNom ;
      wcpOAV30ForColNum = AV30ForColNum ;
      wcpOAV31SP = AV31SP ;
      wcpOAV83ForBlo = AV83ForBlo ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV28Emprcod = httpContext.cgiGet( sPrefix+"AV28Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV28Emprcod) > 0 )
      {
         AV28Emprcod = httpContext.cgiGet( sCtrlAV28Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Emprcod", AV28Emprcod);
      }
      else
      {
         AV28Emprcod = httpContext.cgiGet( sPrefix+"AV28Emprcod_PARM") ;
      }
      sCtrlAV29CliCod = httpContext.cgiGet( sPrefix+"AV29CliCod_CTRL") ;
      if ( GXutil.len( sCtrlAV29CliCod) > 0 )
      {
         AV29CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV29CliCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29CliCod), 6, 0));
      }
      else
      {
         AV29CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV29CliCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV32CliNom = httpContext.cgiGet( sPrefix+"AV32CliNom_CTRL") ;
      if ( GXutil.len( sCtrlAV32CliNom) > 0 )
      {
         AV32CliNom = httpContext.cgiGet( sCtrlAV32CliNom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32CliNom", AV32CliNom);
      }
      else
      {
         AV32CliNom = httpContext.cgiGet( sPrefix+"AV32CliNom_PARM") ;
      }
      sCtrlAV30ForColNum = httpContext.cgiGet( sPrefix+"AV30ForColNum_CTRL") ;
      if ( GXutil.len( sCtrlAV30ForColNum) > 0 )
      {
         AV30ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV30ForColNum), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30ForColNum), 6, 0));
      }
      else
      {
         AV30ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV30ForColNum_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV31SP = httpContext.cgiGet( sPrefix+"AV31SP_CTRL") ;
      if ( GXutil.len( sCtrlAV31SP) > 0 )
      {
         AV31SP = httpContext.cgiGet( sCtrlAV31SP) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31SP", AV31SP);
      }
      else
      {
         AV31SP = httpContext.cgiGet( sPrefix+"AV31SP_PARM") ;
      }
      sCtrlAV83ForBlo = httpContext.cgiGet( sPrefix+"AV83ForBlo_CTRL") ;
      if ( GXutil.len( sCtrlAV83ForBlo) > 0 )
      {
         AV83ForBlo = httpContext.cgiGet( sCtrlAV83ForBlo) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83ForBlo", AV83ForBlo);
      }
      else
      {
         AV83ForBlo = httpContext.cgiGet( sPrefix+"AV83ForBlo_PARM") ;
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
      pa23Y2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws23Y2( ) ;
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
      ws23Y2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV28Emprcod_PARM", GXutil.rtrim( AV28Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV28Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV28Emprcod_CTRL", GXutil.rtrim( sCtrlAV28Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV29CliCod_PARM", GXutil.ltrim( localUtil.ntoc( AV29CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV29CliCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV29CliCod_CTRL", GXutil.rtrim( sCtrlAV29CliCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV32CliNom_PARM", GXutil.rtrim( AV32CliNom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV32CliNom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV32CliNom_CTRL", GXutil.rtrim( sCtrlAV32CliNom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV30ForColNum_PARM", GXutil.ltrim( localUtil.ntoc( AV30ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV30ForColNum)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV30ForColNum_CTRL", GXutil.rtrim( sCtrlAV30ForColNum));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV31SP_PARM", GXutil.rtrim( AV31SP));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV31SP)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV31SP_CTRL", GXutil.rtrim( sCtrlAV31SP));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV83ForBlo_PARM", GXutil.rtrim( AV83ForBlo));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV83ForBlo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV83ForBlo_CTRL", GXutil.rtrim( sCtrlAV83ForBlo));
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
      we23Y2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20269210534778", true, true);
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
      httpContext.AddJavascriptSource("facturacion/precios_cliente_wc.js", "?20269210534778", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_892( )
   {
      chkavPrecios_cliente_sdt__seleccionar.setInternalname( sPrefix+"PRECIOS_CLIENTE_SDT__SELECCIONAR_"+sGXsfl_89_idx );
      edtavPrecios_cliente_sdt__forser_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__FORSER_"+sGXsfl_89_idx ;
      edtavPrecios_cliente_sdt__forserdsc_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__FORSERDSC_"+sGXsfl_89_idx ;
      edtavPrecios_cliente_sdt__forcolnum_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__FORCOLNUM_"+sGXsfl_89_idx ;
      edtavPrecios_cliente_sdt__tipcolcod_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__TIPCOLCOD_"+sGXsfl_89_idx ;
      edtavPrecios_cliente_sdt__forcolnom_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__FORCOLNOM_"+sGXsfl_89_idx ;
      edtavPrecios_cliente_sdt__fornomcli_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__FORNOMCLI_"+sGXsfl_89_idx ;
      edtavPrecios_cliente_sdt__intdsc_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__INTDSC_"+sGXsfl_89_idx ;
      edtavPrecios_cliente_sdt__grdtipart_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__GRDTIPART_"+sGXsfl_89_idx ;
      edtavPrompt_Internalname = sPrefix+"vPROMPT_"+sGXsfl_89_idx ;
      edtavPrecios_cliente_sdt__cr_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__CR_"+sGXsfl_89_idx ;
      edtavPrecios_cliente_sdt__forcan_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__FORCAN_"+sGXsfl_89_idx ;
      edtavPrecios_cliente_sdt__pc_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__PC_"+sGXsfl_89_idx ;
      edtavPrecios_cliente_sdt__mv_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__MV_"+sGXsfl_89_idx ;
      edtavPrecios_cliente_sdt__pv_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__PV_"+sGXsfl_89_idx ;
      edtavPrecios_cliente_sdt__newprekgm_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__NEWPREKGM_"+sGXsfl_89_idx ;
      edtavPrecios_cliente_sdt__obs_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__OBS_"+sGXsfl_89_idx ;
      edtavPrecios_cliente_sdt__forprefec_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__FORPREFEC_"+sGXsfl_89_idx ;
      edtavPrecios_cliente_sdt__forfecant_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__FORFECANT_"+sGXsfl_89_idx ;
      edtavPrecios_cliente_sdt__c_m_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__C_M_"+sGXsfl_89_idx ;
      edtavPrecios_cliente_sdt__cm_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__CM_"+sGXsfl_89_idx ;
      edtavPrecios_cliente_sdt__fi_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__FI_"+sGXsfl_89_idx ;
      edtavPrecios_cliente_sdt__ti_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__TI_"+sGXsfl_89_idx ;
      edtavPrecios_cliente_sdt__mc_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__MC_"+sGXsfl_89_idx ;
      edtavPrecios_cliente_sdt__f_i_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__F_I_"+sGXsfl_89_idx ;
      edtavPrecios_cliente_sdt__tipartdsc_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__TIPARTDSC_"+sGXsfl_89_idx ;
      edtavPrecios_cliente_sdt__artdsc_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__ARTDSC_"+sGXsfl_89_idx ;
      edtavPrecios_cliente_sdt__fortonal_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__FORTONAL_"+sGXsfl_89_idx ;
      edtavPrecios_cliente_sdt__fam_cod_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__FAM_COD_"+sGXsfl_89_idx ;
      edtavPrecios_cliente_sdt__forcosuti_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__FORCOSUTI_"+sGXsfl_89_idx ;
      edtavPrecios_cliente_sdt__oldclasse_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__OLDCLASSE_"+sGXsfl_89_idx ;
      edtavPrecios_cliente_sdt__fornumcol_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__FORNUMCOL_"+sGXsfl_89_idx ;
      cmbavPrecios_cliente_sdt__clitipo.setInternalname( sPrefix+"PRECIOS_CLIENTE_SDT__CLITIPO_"+sGXsfl_89_idx );
      edtavPrecios_cliente_sdt__forrelban_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__FORRELBAN_"+sGXsfl_89_idx ;
   }

   public void subsflControlProps_fel_892( )
   {
      chkavPrecios_cliente_sdt__seleccionar.setInternalname( sPrefix+"PRECIOS_CLIENTE_SDT__SELECCIONAR_"+sGXsfl_89_fel_idx );
      edtavPrecios_cliente_sdt__forser_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__FORSER_"+sGXsfl_89_fel_idx ;
      edtavPrecios_cliente_sdt__forserdsc_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__FORSERDSC_"+sGXsfl_89_fel_idx ;
      edtavPrecios_cliente_sdt__forcolnum_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__FORCOLNUM_"+sGXsfl_89_fel_idx ;
      edtavPrecios_cliente_sdt__tipcolcod_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__TIPCOLCOD_"+sGXsfl_89_fel_idx ;
      edtavPrecios_cliente_sdt__forcolnom_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__FORCOLNOM_"+sGXsfl_89_fel_idx ;
      edtavPrecios_cliente_sdt__fornomcli_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__FORNOMCLI_"+sGXsfl_89_fel_idx ;
      edtavPrecios_cliente_sdt__intdsc_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__INTDSC_"+sGXsfl_89_fel_idx ;
      edtavPrecios_cliente_sdt__grdtipart_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__GRDTIPART_"+sGXsfl_89_fel_idx ;
      edtavPrompt_Internalname = sPrefix+"vPROMPT_"+sGXsfl_89_fel_idx ;
      edtavPrecios_cliente_sdt__cr_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__CR_"+sGXsfl_89_fel_idx ;
      edtavPrecios_cliente_sdt__forcan_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__FORCAN_"+sGXsfl_89_fel_idx ;
      edtavPrecios_cliente_sdt__pc_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__PC_"+sGXsfl_89_fel_idx ;
      edtavPrecios_cliente_sdt__mv_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__MV_"+sGXsfl_89_fel_idx ;
      edtavPrecios_cliente_sdt__pv_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__PV_"+sGXsfl_89_fel_idx ;
      edtavPrecios_cliente_sdt__newprekgm_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__NEWPREKGM_"+sGXsfl_89_fel_idx ;
      edtavPrecios_cliente_sdt__obs_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__OBS_"+sGXsfl_89_fel_idx ;
      edtavPrecios_cliente_sdt__forprefec_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__FORPREFEC_"+sGXsfl_89_fel_idx ;
      edtavPrecios_cliente_sdt__forfecant_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__FORFECANT_"+sGXsfl_89_fel_idx ;
      edtavPrecios_cliente_sdt__c_m_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__C_M_"+sGXsfl_89_fel_idx ;
      edtavPrecios_cliente_sdt__cm_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__CM_"+sGXsfl_89_fel_idx ;
      edtavPrecios_cliente_sdt__fi_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__FI_"+sGXsfl_89_fel_idx ;
      edtavPrecios_cliente_sdt__ti_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__TI_"+sGXsfl_89_fel_idx ;
      edtavPrecios_cliente_sdt__mc_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__MC_"+sGXsfl_89_fel_idx ;
      edtavPrecios_cliente_sdt__f_i_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__F_I_"+sGXsfl_89_fel_idx ;
      edtavPrecios_cliente_sdt__tipartdsc_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__TIPARTDSC_"+sGXsfl_89_fel_idx ;
      edtavPrecios_cliente_sdt__artdsc_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__ARTDSC_"+sGXsfl_89_fel_idx ;
      edtavPrecios_cliente_sdt__fortonal_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__FORTONAL_"+sGXsfl_89_fel_idx ;
      edtavPrecios_cliente_sdt__fam_cod_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__FAM_COD_"+sGXsfl_89_fel_idx ;
      edtavPrecios_cliente_sdt__forcosuti_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__FORCOSUTI_"+sGXsfl_89_fel_idx ;
      edtavPrecios_cliente_sdt__oldclasse_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__OLDCLASSE_"+sGXsfl_89_fel_idx ;
      edtavPrecios_cliente_sdt__fornumcol_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__FORNUMCOL_"+sGXsfl_89_fel_idx ;
      cmbavPrecios_cliente_sdt__clitipo.setInternalname( sPrefix+"PRECIOS_CLIENTE_SDT__CLITIPO_"+sGXsfl_89_fel_idx );
      edtavPrecios_cliente_sdt__forrelban_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__FORRELBAN_"+sGXsfl_89_fel_idx ;
   }

   public void sendrow_892( )
   {
      subsflControlProps_892( ) ;
      wb23Y0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_89_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_89_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_89_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((chkavPrecios_cliente_sdt__seleccionar.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavPrecios_cliente_sdt__seleccionar.getEnabled()!=0)&&(chkavPrecios_cliente_sdt__seleccionar.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 90,'"+sPrefix+"',false,'"+sGXsfl_89_idx+"',89)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "PRECIOS_CLIENTE_SDT__SELECCIONAR_" + sGXsfl_89_idx ;
         chkavPrecios_cliente_sdt__seleccionar.setName( GXCCtl );
         chkavPrecios_cliente_sdt__seleccionar.setWebtags( "" );
         chkavPrecios_cliente_sdt__seleccionar.setCaption( "" );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavPrecios_cliente_sdt__seleccionar.getInternalname(), "TitleCaption", chkavPrecios_cliente_sdt__seleccionar.getCaption(), !bGXsfl_89_Refreshing);
         chkavPrecios_cliente_sdt__seleccionar.setCheckedValue( "false" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavPrecios_cliente_sdt__seleccionar.getInternalname(),GXutil.booltostr( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Seleccionar()),"","",Integer.valueOf(chkavPrecios_cliente_sdt__seleccionar.getVisible()),Integer.valueOf(1),"true","",StyleString,ClassString,chkavPrecios_cliente_sdt__seleccionar.getColumnClass(),chkavPrecios_cliente_sdt__seleccionar.getColumnHeaderClass(),TempTags+" onclick="+"\"gx.fn.checkboxClick(90, this, 'true', 'false',"+"'"+sPrefix+"'"+");"+"gx.evt.onchange(this, event);\""+((chkavPrecios_cliente_sdt__seleccionar.getEnabled()!=0)&&(chkavPrecios_cliente_sdt__seleccionar.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,90);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavPrecios_cliente_sdt__forser_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecios_cliente_sdt__forser_Internalname,GXutil.rtrim( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Forser()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPrecios_cliente_sdt__forser_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavPrecios_cliente_sdt__forser_Columnclass,edtavPrecios_cliente_sdt__forser_Columnheaderclass,Integer.valueOf(edtavPrecios_cliente_sdt__forser_Visible),Integer.valueOf(edtavPrecios_cliente_sdt__forser_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavPrecios_cliente_sdt__forserdsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecios_cliente_sdt__forserdsc_Internalname,GXutil.rtrim( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Forserdsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPrecios_cliente_sdt__forserdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavPrecios_cliente_sdt__forserdsc_Columnclass,edtavPrecios_cliente_sdt__forserdsc_Columnheaderclass,Integer.valueOf(edtavPrecios_cliente_sdt__forserdsc_Visible),Integer.valueOf(edtavPrecios_cliente_sdt__forserdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPrecios_cliente_sdt__forcolnum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecios_cliente_sdt__forcolnum_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Forcolnum(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPrecios_cliente_sdt__forcolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Forcolnum()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Forcolnum()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPrecios_cliente_sdt__forcolnum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavPrecios_cliente_sdt__forcolnum_Columnclass,edtavPrecios_cliente_sdt__forcolnum_Columnheaderclass,Integer.valueOf(edtavPrecios_cliente_sdt__forcolnum_Visible),Integer.valueOf(edtavPrecios_cliente_sdt__forcolnum_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPrecios_cliente_sdt__tipcolcod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecios_cliente_sdt__tipcolcod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Tipcolcod(), (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPrecios_cliente_sdt__tipcolcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Tipcolcod()), "Z9") : localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Tipcolcod()), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPrecios_cliente_sdt__tipcolcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavPrecios_cliente_sdt__tipcolcod_Columnclass,edtavPrecios_cliente_sdt__tipcolcod_Columnheaderclass,Integer.valueOf(edtavPrecios_cliente_sdt__tipcolcod_Visible),Integer.valueOf(edtavPrecios_cliente_sdt__tipcolcod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavPrecios_cliente_sdt__forcolnom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecios_cliente_sdt__forcolnom_Internalname,GXutil.rtrim( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Forcolnom()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPrecios_cliente_sdt__forcolnom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavPrecios_cliente_sdt__forcolnom_Columnclass,edtavPrecios_cliente_sdt__forcolnom_Columnheaderclass,Integer.valueOf(edtavPrecios_cliente_sdt__forcolnom_Visible),Integer.valueOf(edtavPrecios_cliente_sdt__forcolnom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavPrecios_cliente_sdt__fornomcli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecios_cliente_sdt__fornomcli_Internalname,GXutil.rtrim( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Fornomcli()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPrecios_cliente_sdt__fornomcli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavPrecios_cliente_sdt__fornomcli_Columnclass,edtavPrecios_cliente_sdt__fornomcli_Columnheaderclass,Integer.valueOf(edtavPrecios_cliente_sdt__fornomcli_Visible),Integer.valueOf(edtavPrecios_cliente_sdt__fornomcli_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavPrecios_cliente_sdt__intdsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecios_cliente_sdt__intdsc_Internalname,GXutil.rtrim( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Intdsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPrecios_cliente_sdt__intdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavPrecios_cliente_sdt__intdsc_Columnclass,edtavPrecios_cliente_sdt__intdsc_Columnheaderclass,Integer.valueOf(edtavPrecios_cliente_sdt__intdsc_Visible),Integer.valueOf(edtavPrecios_cliente_sdt__intdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPrecios_cliente_sdt__grdtipart_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecios_cliente_sdt__grdtipart_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Grdtipart(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPrecios_cliente_sdt__grdtipart_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Grdtipart()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Grdtipart()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPrecios_cliente_sdt__grdtipart_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavPrecios_cliente_sdt__grdtipart_Columnclass,edtavPrecios_cliente_sdt__grdtipart_Columnheaderclass,Integer.valueOf(edtavPrecios_cliente_sdt__grdtipart_Visible),Integer.valueOf(edtavPrecios_cliente_sdt__grdtipart_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Static Bitmap Variable */
         ClassString = "ImagePrompt" + " " + ((GXutil.strcmp(edtavPrompt_gximage, "")==0) ? "" : "GX_Image_"+edtavPrompt_gximage+"_Class") ;
         StyleString = "" ;
         AV43Prompt_IsBlob = (boolean)(((GXutil.strcmp("", AV43Prompt)==0)&&(GXutil.strcmp("", AV126Prompt_GXI)==0))||!(GXutil.strcmp("", AV43Prompt)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV43Prompt)==0) ? AV126Prompt_GXI : httpContext.getResourceRelative(AV43Prompt)) ;
         GridRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavPrompt_Internalname,sImgUrl,"","","",context.getHttpContext().getTheme( ),Integer.valueOf(0),Integer.valueOf(0),"","",Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),"px",Integer.valueOf(0),"px",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"","",StyleString,ClassString,"WWColumn","","","","","","",Integer.valueOf(1),Boolean.valueOf(AV43Prompt_IsBlob),Boolean.valueOf(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPrecios_cliente_sdt__cr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecios_cliente_sdt__cr_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Cr(), (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPrecios_cliente_sdt__cr_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Cr(), "ZZZZ9.99999") : localUtil.format( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Cr(), "ZZZZ9.99999"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPrecios_cliente_sdt__cr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavPrecios_cliente_sdt__cr_Columnclass,edtavPrecios_cliente_sdt__cr_Columnheaderclass,Integer.valueOf(edtavPrecios_cliente_sdt__cr_Visible),Integer.valueOf(edtavPrecios_cliente_sdt__cr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPrecios_cliente_sdt__forcan_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecios_cliente_sdt__forcan_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Forcan(), (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPrecios_cliente_sdt__forcan_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Forcan(), "ZZZZ9.99999") : localUtil.format( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Forcan(), "ZZZZ9.99999"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPrecios_cliente_sdt__forcan_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavPrecios_cliente_sdt__forcan_Columnclass,edtavPrecios_cliente_sdt__forcan_Columnheaderclass,Integer.valueOf(edtavPrecios_cliente_sdt__forcan_Visible),Integer.valueOf(edtavPrecios_cliente_sdt__forcan_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPrecios_cliente_sdt__pc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecios_cliente_sdt__pc_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Pc(), (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPrecios_cliente_sdt__pc_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Pc(), "ZZZZ9.99999") : localUtil.format( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Pc(), "ZZZZ9.99999"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPrecios_cliente_sdt__pc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavPrecios_cliente_sdt__pc_Columnclass,edtavPrecios_cliente_sdt__pc_Columnheaderclass,Integer.valueOf(edtavPrecios_cliente_sdt__pc_Visible),Integer.valueOf(edtavPrecios_cliente_sdt__pc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPrecios_cliente_sdt__mv_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavPrecios_cliente_sdt__mv_Enabled!=0)&&(edtavPrecios_cliente_sdt__mv_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 103,'"+sPrefix+"',false,'"+sGXsfl_89_idx+"',89)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecios_cliente_sdt__mv_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Mv(), (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Mv(), "ZZZZZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavPrecios_cliente_sdt__mv_Enabled!=0)&&(edtavPrecios_cliente_sdt__mv_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,103);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPrecios_cliente_sdt__mv_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavPrecios_cliente_sdt__mv_Columnclass,edtavPrecios_cliente_sdt__mv_Columnheaderclass,Integer.valueOf(edtavPrecios_cliente_sdt__mv_Visible),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPrecios_cliente_sdt__pv_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecios_cliente_sdt__pv_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Pv(), (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPrecios_cliente_sdt__pv_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Pv(), "ZZZZZ9.999") : localUtil.format( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Pv(), "ZZZZZ9.999"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPrecios_cliente_sdt__pv_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavPrecios_cliente_sdt__pv_Columnclass,edtavPrecios_cliente_sdt__pv_Columnheaderclass,Integer.valueOf(edtavPrecios_cliente_sdt__pv_Visible),Integer.valueOf(edtavPrecios_cliente_sdt__pv_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPrecios_cliente_sdt__newprekgm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavPrecios_cliente_sdt__newprekgm_Enabled!=0)&&(edtavPrecios_cliente_sdt__newprekgm_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 105,'"+sPrefix+"',false,'"+sGXsfl_89_idx+"',89)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecios_cliente_sdt__newprekgm_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Newprekgm(), (byte)(6), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Newprekgm(), "Z9.999")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+((edtavPrecios_cliente_sdt__newprekgm_Enabled!=0)&&(edtavPrecios_cliente_sdt__newprekgm_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,105);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPrecios_cliente_sdt__newprekgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavPrecios_cliente_sdt__newprekgm_Columnclass,edtavPrecios_cliente_sdt__newprekgm_Columnheaderclass,Integer.valueOf(edtavPrecios_cliente_sdt__newprekgm_Visible),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavPrecios_cliente_sdt__obs_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavPrecios_cliente_sdt__obs_Enabled!=0)&&(edtavPrecios_cliente_sdt__obs_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 106,'"+sPrefix+"',false,'"+sGXsfl_89_idx+"',89)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecios_cliente_sdt__obs_Internalname,GXutil.rtrim( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Obs()),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavPrecios_cliente_sdt__obs_Enabled!=0)&&(edtavPrecios_cliente_sdt__obs_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,106);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPrecios_cliente_sdt__obs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavPrecios_cliente_sdt__obs_Columnclass,edtavPrecios_cliente_sdt__obs_Columnheaderclass,Integer.valueOf(edtavPrecios_cliente_sdt__obs_Visible),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(1000),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPrecios_cliente_sdt__forprefec_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecios_cliente_sdt__forprefec_Internalname,localUtil.format(((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Forprefec(), "99/99/99"),localUtil.format( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Forprefec(), "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPrecios_cliente_sdt__forprefec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavPrecios_cliente_sdt__forprefec_Columnclass,edtavPrecios_cliente_sdt__forprefec_Columnheaderclass,Integer.valueOf(edtavPrecios_cliente_sdt__forprefec_Visible),Integer.valueOf(edtavPrecios_cliente_sdt__forprefec_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPrecios_cliente_sdt__forfecant_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecios_cliente_sdt__forfecant_Internalname,localUtil.format(((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Forfecant(), "99/99/99"),localUtil.format( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Forfecant(), "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPrecios_cliente_sdt__forfecant_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavPrecios_cliente_sdt__forfecant_Columnclass,edtavPrecios_cliente_sdt__forfecant_Columnheaderclass,Integer.valueOf(edtavPrecios_cliente_sdt__forfecant_Visible),Integer.valueOf(edtavPrecios_cliente_sdt__forfecant_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPrecios_cliente_sdt__c_m_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecios_cliente_sdt__c_m_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_C_m(), (byte)(11), (byte)(8), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPrecios_cliente_sdt__c_m_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_C_m(), "Z9.99999999") : localUtil.format( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_C_m(), "Z9.99999999"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPrecios_cliente_sdt__c_m_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavPrecios_cliente_sdt__c_m_Columnclass,edtavPrecios_cliente_sdt__c_m_Columnheaderclass,Integer.valueOf(edtavPrecios_cliente_sdt__c_m_Visible),Integer.valueOf(edtavPrecios_cliente_sdt__c_m_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPrecios_cliente_sdt__cm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecios_cliente_sdt__cm_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Cm(), (byte)(11), (byte)(8), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPrecios_cliente_sdt__cm_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Cm(), "Z9.99999999") : localUtil.format( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Cm(), "Z9.99999999"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPrecios_cliente_sdt__cm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavPrecios_cliente_sdt__cm_Columnclass,edtavPrecios_cliente_sdt__cm_Columnheaderclass,Integer.valueOf(edtavPrecios_cliente_sdt__cm_Visible),Integer.valueOf(edtavPrecios_cliente_sdt__cm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPrecios_cliente_sdt__fi_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecios_cliente_sdt__fi_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Fi(), (byte)(11), (byte)(8), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPrecios_cliente_sdt__fi_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Fi(), "Z9.99999999") : localUtil.format( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Fi(), "Z9.99999999"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPrecios_cliente_sdt__fi_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavPrecios_cliente_sdt__fi_Columnclass,edtavPrecios_cliente_sdt__fi_Columnheaderclass,Integer.valueOf(edtavPrecios_cliente_sdt__fi_Visible),Integer.valueOf(edtavPrecios_cliente_sdt__fi_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPrecios_cliente_sdt__ti_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecios_cliente_sdt__ti_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Ti(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPrecios_cliente_sdt__ti_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Ti()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Ti()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPrecios_cliente_sdt__ti_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavPrecios_cliente_sdt__ti_Columnclass,edtavPrecios_cliente_sdt__ti_Columnheaderclass,Integer.valueOf(edtavPrecios_cliente_sdt__ti_Visible),Integer.valueOf(edtavPrecios_cliente_sdt__ti_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPrecios_cliente_sdt__mc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecios_cliente_sdt__mc_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Mc(), (byte)(7), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPrecios_cliente_sdt__mc_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Mc(), "ZZ9.999") : localUtil.format( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Mc(), "ZZ9.999"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPrecios_cliente_sdt__mc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavPrecios_cliente_sdt__mc_Columnclass,edtavPrecios_cliente_sdt__mc_Columnheaderclass,Integer.valueOf(edtavPrecios_cliente_sdt__mc_Visible),Integer.valueOf(edtavPrecios_cliente_sdt__mc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPrecios_cliente_sdt__f_i_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecios_cliente_sdt__f_i_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_F_i(), (byte)(8), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPrecios_cliente_sdt__f_i_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_F_i(), "ZZ9.9999") : localUtil.format( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_F_i(), "ZZ9.9999"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPrecios_cliente_sdt__f_i_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavPrecios_cliente_sdt__f_i_Columnclass,edtavPrecios_cliente_sdt__f_i_Columnheaderclass,Integer.valueOf(edtavPrecios_cliente_sdt__f_i_Visible),Integer.valueOf(edtavPrecios_cliente_sdt__f_i_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecios_cliente_sdt__tipartdsc_Internalname,GXutil.rtrim( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Tipartdsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPrecios_cliente_sdt__tipartdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavPrecios_cliente_sdt__tipartdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecios_cliente_sdt__artdsc_Internalname,GXutil.rtrim( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Artdsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPrecios_cliente_sdt__artdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavPrecios_cliente_sdt__artdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecios_cliente_sdt__fortonal_Internalname,GXutil.rtrim( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Fortonal()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPrecios_cliente_sdt__fortonal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavPrecios_cliente_sdt__fortonal_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecios_cliente_sdt__fam_cod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Fam_cod(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPrecios_cliente_sdt__fam_cod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Fam_cod()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Fam_cod()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPrecios_cliente_sdt__fam_cod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavPrecios_cliente_sdt__fam_cod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecios_cliente_sdt__forcosuti_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Forcosuti(), (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPrecios_cliente_sdt__forcosuti_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Forcosuti(), "ZZZZZZZZZZ.ZZ") : localUtil.format( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Forcosuti(), "ZZZZZZZZZZ.ZZ"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPrecios_cliente_sdt__forcosuti_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavPrecios_cliente_sdt__forcosuti_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecios_cliente_sdt__oldclasse_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Oldclasse(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPrecios_cliente_sdt__oldclasse_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Oldclasse()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Oldclasse()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPrecios_cliente_sdt__oldclasse_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavPrecios_cliente_sdt__oldclasse_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecios_cliente_sdt__fornumcol_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Fornumcol(), (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPrecios_cliente_sdt__fornumcol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Fornumcol()), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Fornumcol()), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPrecios_cliente_sdt__fornumcol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavPrecios_cliente_sdt__fornumcol_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         if ( ( cmbavPrecios_cliente_sdt__clitipo.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "PRECIOS_CLIENTE_SDT__CLITIPO_" + sGXsfl_89_idx ;
            cmbavPrecios_cliente_sdt__clitipo.setName( GXCCtl );
            cmbavPrecios_cliente_sdt__clitipo.setWebtags( "" );
            cmbavPrecios_cliente_sdt__clitipo.addItem("I", httpContext.getMessage( "Interno", ""), (short)(0));
            cmbavPrecios_cliente_sdt__clitipo.addItem("E", httpContext.getMessage( "Externo", ""), (short)(0));
            if ( cmbavPrecios_cliente_sdt__clitipo.getItemCount() > 0 )
            {
               if ( ( AV89GXV1 > 0 ) && ( AV13Precios_cliente_SDT.size() >= AV89GXV1 ) && (GXutil.strcmp("", ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Clitipo())==0) )
               {
                  ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).setgxTv_SdtPrecios_cliente_SDT_Item_Clitipo( cmbavPrecios_cliente_sdt__clitipo.getValidValue(((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Clitipo()) );
               }
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavPrecios_cliente_sdt__clitipo,cmbavPrecios_cliente_sdt__clitipo.getInternalname(),GXutil.rtrim( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Clitipo()),Integer.valueOf(1),cmbavPrecios_cliente_sdt__clitipo.getJsonclick(),Integer.valueOf(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(0),Integer.valueOf(cmbavPrecios_cliente_sdt__clitipo.getEnabled()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavPrecios_cliente_sdt__clitipo.setValue( GXutil.rtrim( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Clitipo()) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavPrecios_cliente_sdt__clitipo.getInternalname(), "Values", cmbavPrecios_cliente_sdt__clitipo.ToJavascriptSource(), !bGXsfl_89_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPrecios_cliente_sdt__forrelban_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecios_cliente_sdt__forrelban_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Forrelban(), (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPrecios_cliente_sdt__forrelban_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Forrelban(), "ZZZ9.99") : localUtil.format( ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Forrelban(), "ZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPrecios_cliente_sdt__forrelban_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavPrecios_cliente_sdt__forrelban_Columnclass,edtavPrecios_cliente_sdt__forrelban_Columnheaderclass,Integer.valueOf(edtavPrecios_cliente_sdt__forrelban_Visible),Integer.valueOf(edtavPrecios_cliente_sdt__forrelban_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes23Y2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_89_idx = ((subGrid_Islastpage==1)&&(nGXsfl_89_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_89_idx+1) ;
         sGXsfl_89_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_89_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_892( ) ;
      }
      /* End function sendrow_892 */
   }

   public void startgridcontrol89( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"89\">") ;
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
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((chkavPrecios_cliente_sdt__seleccionar.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Op", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPrecios_cliente_sdt__forser_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Artigo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPrecios_cliente_sdt__forserdsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descriçao", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPrecios_cliente_sdt__forcolnum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero Côr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPrecios_cliente_sdt__tipcolcod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "TC", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPrecios_cliente_sdt__forcolnom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Côr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPrecios_cliente_sdt__fornomcli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Côr Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPrecios_cliente_sdt__intdsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Intensidade", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPrecios_cliente_sdt__grdtipart_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Classe", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ImagePrompt"+" "+((GXutil.strcmp(edtavPrompt_gximage, "")==0) ? "" : "GX_Image_"+edtavPrompt_gximage+"_Class")+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPrecios_cliente_sdt__cr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Custo da receita", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPrecios_cliente_sdt__forcan_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Concentração de corante", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPrecios_cliente_sdt__pc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Preço de custo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPrecios_cliente_sdt__mv_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Margem na venda", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPrecios_cliente_sdt__pv_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Preço de venda", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPrecios_cliente_sdt__newprekgm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Preço", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrimstr( DecimalUtil.doubleToDec(1000), 4, 0)+"px"+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPrecios_cliente_sdt__obs_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Obs", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPrecios_cliente_sdt__forprefec_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Data Actual", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPrecios_cliente_sdt__forfecant_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Data Ultima", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPrecios_cliente_sdt__c_m_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Custo por minuto com amortização", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPrecios_cliente_sdt__cm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Custo por minuto sem amortização", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPrecios_cliente_sdt__fi_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fator de ineficiência", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPrecios_cliente_sdt__ti_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ti", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPrecios_cliente_sdt__mc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Mc", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPrecios_cliente_sdt__f_i_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fi", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPrecios_cliente_sdt__forrelban_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Rb", "")) ;
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
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( chkavPrecios_cliente_sdt__seleccionar.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( chkavPrecios_cliente_sdt__seleccionar.getColumnHeaderClass()));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkavPrecios_cliente_sdt__seleccionar.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavPrecios_cliente_sdt__forser_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavPrecios_cliente_sdt__forser_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrecios_cliente_sdt__forser_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPrecios_cliente_sdt__forser_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavPrecios_cliente_sdt__forserdsc_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavPrecios_cliente_sdt__forserdsc_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrecios_cliente_sdt__forserdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPrecios_cliente_sdt__forserdsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavPrecios_cliente_sdt__forcolnum_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavPrecios_cliente_sdt__forcolnum_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrecios_cliente_sdt__forcolnum_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPrecios_cliente_sdt__forcolnum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavPrecios_cliente_sdt__tipcolcod_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavPrecios_cliente_sdt__tipcolcod_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrecios_cliente_sdt__tipcolcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPrecios_cliente_sdt__tipcolcod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavPrecios_cliente_sdt__forcolnom_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavPrecios_cliente_sdt__forcolnom_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrecios_cliente_sdt__forcolnom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPrecios_cliente_sdt__forcolnom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavPrecios_cliente_sdt__fornomcli_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavPrecios_cliente_sdt__fornomcli_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrecios_cliente_sdt__fornomcli_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPrecios_cliente_sdt__fornomcli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavPrecios_cliente_sdt__intdsc_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavPrecios_cliente_sdt__intdsc_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrecios_cliente_sdt__intdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPrecios_cliente_sdt__intdsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavPrecios_cliente_sdt__grdtipart_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavPrecios_cliente_sdt__grdtipart_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrecios_cliente_sdt__grdtipart_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPrecios_cliente_sdt__grdtipart_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", httpContext.convertURL( AV43Prompt));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavPrecios_cliente_sdt__cr_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavPrecios_cliente_sdt__cr_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrecios_cliente_sdt__cr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPrecios_cliente_sdt__cr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavPrecios_cliente_sdt__forcan_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavPrecios_cliente_sdt__forcan_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrecios_cliente_sdt__forcan_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPrecios_cliente_sdt__forcan_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavPrecios_cliente_sdt__pc_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavPrecios_cliente_sdt__pc_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrecios_cliente_sdt__pc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPrecios_cliente_sdt__pc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavPrecios_cliente_sdt__mv_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavPrecios_cliente_sdt__mv_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPrecios_cliente_sdt__mv_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavPrecios_cliente_sdt__pv_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavPrecios_cliente_sdt__pv_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrecios_cliente_sdt__pv_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPrecios_cliente_sdt__pv_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavPrecios_cliente_sdt__newprekgm_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavPrecios_cliente_sdt__newprekgm_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPrecios_cliente_sdt__newprekgm_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavPrecios_cliente_sdt__obs_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavPrecios_cliente_sdt__obs_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPrecios_cliente_sdt__obs_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavPrecios_cliente_sdt__forprefec_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavPrecios_cliente_sdt__forprefec_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrecios_cliente_sdt__forprefec_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPrecios_cliente_sdt__forprefec_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavPrecios_cliente_sdt__forfecant_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavPrecios_cliente_sdt__forfecant_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrecios_cliente_sdt__forfecant_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPrecios_cliente_sdt__forfecant_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavPrecios_cliente_sdt__c_m_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavPrecios_cliente_sdt__c_m_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrecios_cliente_sdt__c_m_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPrecios_cliente_sdt__c_m_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavPrecios_cliente_sdt__cm_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavPrecios_cliente_sdt__cm_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrecios_cliente_sdt__cm_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPrecios_cliente_sdt__cm_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavPrecios_cliente_sdt__fi_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavPrecios_cliente_sdt__fi_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrecios_cliente_sdt__fi_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPrecios_cliente_sdt__fi_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavPrecios_cliente_sdt__ti_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavPrecios_cliente_sdt__ti_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrecios_cliente_sdt__ti_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPrecios_cliente_sdt__ti_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavPrecios_cliente_sdt__mc_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavPrecios_cliente_sdt__mc_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrecios_cliente_sdt__mc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPrecios_cliente_sdt__mc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavPrecios_cliente_sdt__f_i_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavPrecios_cliente_sdt__f_i_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrecios_cliente_sdt__f_i_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPrecios_cliente_sdt__f_i_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrecios_cliente_sdt__tipartdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrecios_cliente_sdt__artdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrecios_cliente_sdt__fortonal_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrecios_cliente_sdt__fam_cod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrecios_cliente_sdt__forcosuti_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrecios_cliente_sdt__oldclasse_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrecios_cliente_sdt__fornumcol_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbavPrecios_cliente_sdt__clitipo.getEnabled(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavPrecios_cliente_sdt__forrelban_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavPrecios_cliente_sdt__forrelban_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrecios_cliente_sdt__forrelban_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPrecios_cliente_sdt__forrelban_Visible, (byte)(5), (byte)(0), ".", "")));
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
      edtavClicod_Internalname = sPrefix+"vCLICOD" ;
      edtavClinom_Internalname = sPrefix+"vCLINOM" ;
      edtavForcolnum_Internalname = sPrefix+"vFORCOLNUM" ;
      chkavSp.setInternalname( sPrefix+"vSP" );
      divUnnamedtable6_Internalname = sPrefix+"UNNAMEDTABLE6" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE1" ;
      divDvpanel_unnamedtable1_cell_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE1_CELL" ;
      lblTextblock2_Internalname = sPrefix+"TEXTBLOCK2" ;
      lblTextblock3_Internalname = sPrefix+"TEXTBLOCK3" ;
      lblTextblock1_Internalname = sPrefix+"TEXTBLOCK1" ;
      divUnnamedtable4_Internalname = sPrefix+"UNNAMEDTABLE4" ;
      lblTextblock4_Internalname = sPrefix+"TEXTBLOCK4" ;
      lblTextblock5_Internalname = sPrefix+"TEXTBLOCK5" ;
      divUnnamedtable5_Internalname = sPrefix+"UNNAMEDTABLE5" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE2" ;
      divDvpanel_unnamedtable2_cell_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE2_CELL" ;
      bttBtnexport_Internalname = sPrefix+"BTNEXPORT" ;
      bttBtnexportcsv_Internalname = sPrefix+"BTNEXPORTCSV" ;
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      bttBtnconformeprecios_Internalname = sPrefix+"BTNCONFORMEPRECIOS" ;
      bttBtnrecalculo_Internalname = sPrefix+"BTNRECALCULO" ;
      divUnnamedtable3_Internalname = sPrefix+"UNNAMEDTABLE3" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      chkavPrecios_cliente_sdt__seleccionar.setInternalname( sPrefix+"PRECIOS_CLIENTE_SDT__SELECCIONAR" );
      edtavPrecios_cliente_sdt__forser_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__FORSER" ;
      edtavPrecios_cliente_sdt__forserdsc_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__FORSERDSC" ;
      edtavPrecios_cliente_sdt__forcolnum_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__FORCOLNUM" ;
      edtavPrecios_cliente_sdt__tipcolcod_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__TIPCOLCOD" ;
      edtavPrecios_cliente_sdt__forcolnom_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__FORCOLNOM" ;
      edtavPrecios_cliente_sdt__fornomcli_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__FORNOMCLI" ;
      edtavPrecios_cliente_sdt__intdsc_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__INTDSC" ;
      edtavPrecios_cliente_sdt__grdtipart_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__GRDTIPART" ;
      edtavPrompt_Internalname = sPrefix+"vPROMPT" ;
      edtavPrecios_cliente_sdt__cr_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__CR" ;
      edtavPrecios_cliente_sdt__forcan_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__FORCAN" ;
      edtavPrecios_cliente_sdt__pc_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__PC" ;
      edtavPrecios_cliente_sdt__mv_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__MV" ;
      edtavPrecios_cliente_sdt__pv_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__PV" ;
      edtavPrecios_cliente_sdt__newprekgm_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__NEWPREKGM" ;
      edtavPrecios_cliente_sdt__obs_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__OBS" ;
      edtavPrecios_cliente_sdt__forprefec_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__FORPREFEC" ;
      edtavPrecios_cliente_sdt__forfecant_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__FORFECANT" ;
      edtavPrecios_cliente_sdt__c_m_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__C_M" ;
      edtavPrecios_cliente_sdt__cm_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__CM" ;
      edtavPrecios_cliente_sdt__fi_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__FI" ;
      edtavPrecios_cliente_sdt__ti_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__TI" ;
      edtavPrecios_cliente_sdt__mc_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__MC" ;
      edtavPrecios_cliente_sdt__f_i_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__F_I" ;
      edtavPrecios_cliente_sdt__tipartdsc_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__TIPARTDSC" ;
      edtavPrecios_cliente_sdt__artdsc_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__ARTDSC" ;
      edtavPrecios_cliente_sdt__fortonal_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__FORTONAL" ;
      edtavPrecios_cliente_sdt__fam_cod_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__FAM_COD" ;
      edtavPrecios_cliente_sdt__forcosuti_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__FORCOSUTI" ;
      edtavPrecios_cliente_sdt__oldclasse_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__OLDCLASSE" ;
      edtavPrecios_cliente_sdt__fornumcol_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__FORNUMCOL" ;
      cmbavPrecios_cliente_sdt__clitipo.setInternalname( sPrefix+"PRECIOS_CLIENTE_SDT__CLITIPO" );
      edtavPrecios_cliente_sdt__forrelban_Internalname = sPrefix+"PRECIOS_CLIENTE_SDT__FORRELBAN" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      Datamonjs_Internalname = sPrefix+"DATAMONJS" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Dvelop_confirmpanel_btnconformeprecios_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFORMEPRECIOS" ;
      tblTabledvelop_confirmpanel_btnconformeprecios_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_BTNCONFORMEPRECIOS" ;
      Dvelop_confirmpanel_btnrecalculo_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_BTNRECALCULO" ;
      tblTabledvelop_confirmpanel_btnrecalculo_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_BTNRECALCULO" ;
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
      edtavPrecios_cliente_sdt__forrelban_Jsonclick = "" ;
      edtavPrecios_cliente_sdt__forrelban_Columnheaderclass = "" ;
      edtavPrecios_cliente_sdt__forrelban_Columnclass = "WWColumn" ;
      edtavPrecios_cliente_sdt__forrelban_Enabled = 0 ;
      edtavPrecios_cliente_sdt__forrelban_Visible = -1 ;
      cmbavPrecios_cliente_sdt__clitipo.setJsonclick( "" );
      cmbavPrecios_cliente_sdt__clitipo.setEnabled( 0 );
      edtavPrecios_cliente_sdt__fornumcol_Jsonclick = "" ;
      edtavPrecios_cliente_sdt__fornumcol_Enabled = 0 ;
      edtavPrecios_cliente_sdt__oldclasse_Jsonclick = "" ;
      edtavPrecios_cliente_sdt__oldclasse_Enabled = 0 ;
      edtavPrecios_cliente_sdt__forcosuti_Jsonclick = "" ;
      edtavPrecios_cliente_sdt__forcosuti_Enabled = 0 ;
      edtavPrecios_cliente_sdt__fam_cod_Jsonclick = "" ;
      edtavPrecios_cliente_sdt__fam_cod_Enabled = 0 ;
      edtavPrecios_cliente_sdt__fortonal_Jsonclick = "" ;
      edtavPrecios_cliente_sdt__fortonal_Enabled = 0 ;
      edtavPrecios_cliente_sdt__artdsc_Jsonclick = "" ;
      edtavPrecios_cliente_sdt__artdsc_Enabled = 0 ;
      edtavPrecios_cliente_sdt__tipartdsc_Jsonclick = "" ;
      edtavPrecios_cliente_sdt__tipartdsc_Enabled = 0 ;
      edtavPrecios_cliente_sdt__f_i_Jsonclick = "" ;
      edtavPrecios_cliente_sdt__f_i_Columnheaderclass = "" ;
      edtavPrecios_cliente_sdt__f_i_Columnclass = "WWColumn" ;
      edtavPrecios_cliente_sdt__f_i_Enabled = 0 ;
      edtavPrecios_cliente_sdt__f_i_Visible = -1 ;
      edtavPrecios_cliente_sdt__mc_Jsonclick = "" ;
      edtavPrecios_cliente_sdt__mc_Columnheaderclass = "" ;
      edtavPrecios_cliente_sdt__mc_Columnclass = "WWColumn" ;
      edtavPrecios_cliente_sdt__mc_Enabled = 0 ;
      edtavPrecios_cliente_sdt__mc_Visible = -1 ;
      edtavPrecios_cliente_sdt__ti_Jsonclick = "" ;
      edtavPrecios_cliente_sdt__ti_Columnheaderclass = "" ;
      edtavPrecios_cliente_sdt__ti_Columnclass = "WWColumn" ;
      edtavPrecios_cliente_sdt__ti_Enabled = 0 ;
      edtavPrecios_cliente_sdt__ti_Visible = -1 ;
      edtavPrecios_cliente_sdt__fi_Jsonclick = "" ;
      edtavPrecios_cliente_sdt__fi_Columnheaderclass = "" ;
      edtavPrecios_cliente_sdt__fi_Columnclass = "WWColumn" ;
      edtavPrecios_cliente_sdt__fi_Enabled = 0 ;
      edtavPrecios_cliente_sdt__fi_Visible = -1 ;
      edtavPrecios_cliente_sdt__cm_Jsonclick = "" ;
      edtavPrecios_cliente_sdt__cm_Columnheaderclass = "" ;
      edtavPrecios_cliente_sdt__cm_Columnclass = "WWColumn" ;
      edtavPrecios_cliente_sdt__cm_Enabled = 0 ;
      edtavPrecios_cliente_sdt__cm_Visible = -1 ;
      edtavPrecios_cliente_sdt__c_m_Jsonclick = "" ;
      edtavPrecios_cliente_sdt__c_m_Columnheaderclass = "" ;
      edtavPrecios_cliente_sdt__c_m_Columnclass = "WWColumn" ;
      edtavPrecios_cliente_sdt__c_m_Enabled = 0 ;
      edtavPrecios_cliente_sdt__c_m_Visible = -1 ;
      edtavPrecios_cliente_sdt__forfecant_Jsonclick = "" ;
      edtavPrecios_cliente_sdt__forfecant_Columnheaderclass = "" ;
      edtavPrecios_cliente_sdt__forfecant_Columnclass = "WWColumn" ;
      edtavPrecios_cliente_sdt__forfecant_Enabled = 0 ;
      edtavPrecios_cliente_sdt__forfecant_Visible = -1 ;
      edtavPrecios_cliente_sdt__forprefec_Jsonclick = "" ;
      edtavPrecios_cliente_sdt__forprefec_Columnheaderclass = "" ;
      edtavPrecios_cliente_sdt__forprefec_Columnclass = "WWColumn" ;
      edtavPrecios_cliente_sdt__forprefec_Enabled = 0 ;
      edtavPrecios_cliente_sdt__forprefec_Visible = -1 ;
      edtavPrecios_cliente_sdt__obs_Jsonclick = "" ;
      edtavPrecios_cliente_sdt__obs_Columnheaderclass = "" ;
      edtavPrecios_cliente_sdt__obs_Columnclass = "WWColumn" ;
      edtavPrecios_cliente_sdt__obs_Enabled = 1 ;
      edtavPrecios_cliente_sdt__obs_Visible = -1 ;
      edtavPrecios_cliente_sdt__newprekgm_Jsonclick = "" ;
      edtavPrecios_cliente_sdt__newprekgm_Columnheaderclass = "" ;
      edtavPrecios_cliente_sdt__newprekgm_Columnclass = "WWColumn" ;
      edtavPrecios_cliente_sdt__newprekgm_Enabled = 1 ;
      edtavPrecios_cliente_sdt__newprekgm_Visible = -1 ;
      edtavPrecios_cliente_sdt__pv_Jsonclick = "" ;
      edtavPrecios_cliente_sdt__pv_Columnheaderclass = "" ;
      edtavPrecios_cliente_sdt__pv_Columnclass = "WWColumn" ;
      edtavPrecios_cliente_sdt__pv_Enabled = 0 ;
      edtavPrecios_cliente_sdt__pv_Visible = -1 ;
      edtavPrecios_cliente_sdt__mv_Jsonclick = "" ;
      edtavPrecios_cliente_sdt__mv_Columnheaderclass = "" ;
      edtavPrecios_cliente_sdt__mv_Columnclass = "WWColumn" ;
      edtavPrecios_cliente_sdt__mv_Enabled = 1 ;
      edtavPrecios_cliente_sdt__mv_Visible = -1 ;
      edtavPrecios_cliente_sdt__pc_Jsonclick = "" ;
      edtavPrecios_cliente_sdt__pc_Columnheaderclass = "" ;
      edtavPrecios_cliente_sdt__pc_Columnclass = "WWColumn" ;
      edtavPrecios_cliente_sdt__pc_Enabled = 0 ;
      edtavPrecios_cliente_sdt__pc_Visible = -1 ;
      edtavPrecios_cliente_sdt__forcan_Jsonclick = "" ;
      edtavPrecios_cliente_sdt__forcan_Columnheaderclass = "" ;
      edtavPrecios_cliente_sdt__forcan_Columnclass = "WWColumn" ;
      edtavPrecios_cliente_sdt__forcan_Enabled = 0 ;
      edtavPrecios_cliente_sdt__forcan_Visible = -1 ;
      edtavPrecios_cliente_sdt__cr_Jsonclick = "" ;
      edtavPrecios_cliente_sdt__cr_Columnheaderclass = "" ;
      edtavPrecios_cliente_sdt__cr_Columnclass = "WWColumn" ;
      edtavPrecios_cliente_sdt__cr_Enabled = 0 ;
      edtavPrecios_cliente_sdt__cr_Visible = -1 ;
      edtavPrompt_gximage = "" ;
      edtavPrecios_cliente_sdt__grdtipart_Jsonclick = "" ;
      edtavPrecios_cliente_sdt__grdtipart_Columnheaderclass = "" ;
      edtavPrecios_cliente_sdt__grdtipart_Columnclass = "WWColumn" ;
      edtavPrecios_cliente_sdt__grdtipart_Enabled = 0 ;
      edtavPrecios_cliente_sdt__grdtipart_Visible = -1 ;
      edtavPrecios_cliente_sdt__intdsc_Jsonclick = "" ;
      edtavPrecios_cliente_sdt__intdsc_Columnheaderclass = "" ;
      edtavPrecios_cliente_sdt__intdsc_Columnclass = "WWColumn" ;
      edtavPrecios_cliente_sdt__intdsc_Enabled = 0 ;
      edtavPrecios_cliente_sdt__intdsc_Visible = -1 ;
      edtavPrecios_cliente_sdt__fornomcli_Jsonclick = "" ;
      edtavPrecios_cliente_sdt__fornomcli_Columnheaderclass = "" ;
      edtavPrecios_cliente_sdt__fornomcli_Columnclass = "WWColumn" ;
      edtavPrecios_cliente_sdt__fornomcli_Enabled = 0 ;
      edtavPrecios_cliente_sdt__fornomcli_Visible = -1 ;
      edtavPrecios_cliente_sdt__forcolnom_Jsonclick = "" ;
      edtavPrecios_cliente_sdt__forcolnom_Columnheaderclass = "" ;
      edtavPrecios_cliente_sdt__forcolnom_Columnclass = "WWColumn" ;
      edtavPrecios_cliente_sdt__forcolnom_Enabled = 0 ;
      edtavPrecios_cliente_sdt__forcolnom_Visible = -1 ;
      edtavPrecios_cliente_sdt__tipcolcod_Jsonclick = "" ;
      edtavPrecios_cliente_sdt__tipcolcod_Columnheaderclass = "" ;
      edtavPrecios_cliente_sdt__tipcolcod_Columnclass = "WWColumn" ;
      edtavPrecios_cliente_sdt__tipcolcod_Enabled = 0 ;
      edtavPrecios_cliente_sdt__tipcolcod_Visible = -1 ;
      edtavPrecios_cliente_sdt__forcolnum_Jsonclick = "" ;
      edtavPrecios_cliente_sdt__forcolnum_Columnheaderclass = "" ;
      edtavPrecios_cliente_sdt__forcolnum_Columnclass = "WWColumn" ;
      edtavPrecios_cliente_sdt__forcolnum_Enabled = 0 ;
      edtavPrecios_cliente_sdt__forcolnum_Visible = -1 ;
      edtavPrecios_cliente_sdt__forserdsc_Jsonclick = "" ;
      edtavPrecios_cliente_sdt__forserdsc_Columnheaderclass = "" ;
      edtavPrecios_cliente_sdt__forserdsc_Columnclass = "WWColumn" ;
      edtavPrecios_cliente_sdt__forserdsc_Enabled = 0 ;
      edtavPrecios_cliente_sdt__forserdsc_Visible = -1 ;
      edtavPrecios_cliente_sdt__forser_Jsonclick = "" ;
      edtavPrecios_cliente_sdt__forser_Columnheaderclass = "" ;
      edtavPrecios_cliente_sdt__forser_Columnclass = "WWColumn" ;
      edtavPrecios_cliente_sdt__forser_Enabled = 0 ;
      edtavPrecios_cliente_sdt__forser_Visible = -1 ;
      chkavPrecios_cliente_sdt__seleccionar.setCaption( "" );
      chkavPrecios_cliente_sdt__seleccionar.setColumnHeaderClass( "" );
      chkavPrecios_cliente_sdt__seleccionar.setColumnClass( "WWColumn" );
      chkavPrecios_cliente_sdt__seleccionar.setEnabled( 1 );
      chkavPrecios_cliente_sdt__seleccionar.setVisible( -1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavPrecios_cliente_sdt__forrelban_Visible = -1 ;
      edtavPrecios_cliente_sdt__f_i_Visible = -1 ;
      edtavPrecios_cliente_sdt__mc_Visible = -1 ;
      edtavPrecios_cliente_sdt__ti_Visible = -1 ;
      edtavPrecios_cliente_sdt__fi_Visible = -1 ;
      edtavPrecios_cliente_sdt__cm_Visible = -1 ;
      edtavPrecios_cliente_sdt__c_m_Visible = -1 ;
      edtavPrecios_cliente_sdt__forfecant_Visible = -1 ;
      edtavPrecios_cliente_sdt__forprefec_Visible = -1 ;
      edtavPrecios_cliente_sdt__obs_Visible = -1 ;
      edtavPrecios_cliente_sdt__newprekgm_Visible = -1 ;
      edtavPrecios_cliente_sdt__pv_Visible = -1 ;
      edtavPrecios_cliente_sdt__mv_Visible = -1 ;
      edtavPrecios_cliente_sdt__pc_Visible = -1 ;
      edtavPrecios_cliente_sdt__forcan_Visible = -1 ;
      edtavPrecios_cliente_sdt__cr_Visible = -1 ;
      edtavPrecios_cliente_sdt__grdtipart_Visible = -1 ;
      edtavPrecios_cliente_sdt__intdsc_Visible = -1 ;
      edtavPrecios_cliente_sdt__fornomcli_Visible = -1 ;
      edtavPrecios_cliente_sdt__forcolnom_Visible = -1 ;
      edtavPrecios_cliente_sdt__tipcolcod_Visible = -1 ;
      edtavPrecios_cliente_sdt__forcolnum_Visible = -1 ;
      edtavPrecios_cliente_sdt__forserdsc_Visible = -1 ;
      edtavPrecios_cliente_sdt__forser_Visible = -1 ;
      chkavPrecios_cliente_sdt__seleccionar.setVisible( -1 );
      subGrid_Sortable = (byte)(0) ;
      edtavPrecios_cliente_sdt__forrelban_Enabled = -1 ;
      cmbavPrecios_cliente_sdt__clitipo.setEnabled( -1 );
      edtavPrecios_cliente_sdt__fornumcol_Enabled = -1 ;
      edtavPrecios_cliente_sdt__oldclasse_Enabled = -1 ;
      edtavPrecios_cliente_sdt__forcosuti_Enabled = -1 ;
      edtavPrecios_cliente_sdt__fam_cod_Enabled = -1 ;
      edtavPrecios_cliente_sdt__fortonal_Enabled = -1 ;
      edtavPrecios_cliente_sdt__artdsc_Enabled = -1 ;
      edtavPrecios_cliente_sdt__tipartdsc_Enabled = -1 ;
      edtavPrecios_cliente_sdt__f_i_Enabled = -1 ;
      edtavPrecios_cliente_sdt__mc_Enabled = -1 ;
      edtavPrecios_cliente_sdt__ti_Enabled = -1 ;
      edtavPrecios_cliente_sdt__fi_Enabled = -1 ;
      edtavPrecios_cliente_sdt__cm_Enabled = -1 ;
      edtavPrecios_cliente_sdt__c_m_Enabled = -1 ;
      edtavPrecios_cliente_sdt__forfecant_Enabled = -1 ;
      edtavPrecios_cliente_sdt__forprefec_Enabled = -1 ;
      edtavPrecios_cliente_sdt__pv_Enabled = -1 ;
      edtavPrecios_cliente_sdt__pc_Enabled = -1 ;
      edtavPrecios_cliente_sdt__forcan_Enabled = -1 ;
      edtavPrecios_cliente_sdt__cr_Enabled = -1 ;
      edtavPrecios_cliente_sdt__grdtipart_Enabled = -1 ;
      edtavPrecios_cliente_sdt__intdsc_Enabled = -1 ;
      edtavPrecios_cliente_sdt__fornomcli_Enabled = -1 ;
      edtavPrecios_cliente_sdt__forcolnom_Enabled = -1 ;
      edtavPrecios_cliente_sdt__tipcolcod_Enabled = -1 ;
      edtavPrecios_cliente_sdt__forcolnum_Enabled = -1 ;
      edtavPrecios_cliente_sdt__forserdsc_Enabled = -1 ;
      edtavPrecios_cliente_sdt__forser_Enabled = -1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      divDvpanel_unnamedtable2_cell_Class = "col-xs-12" ;
      chkavSp.setEnabled( 0 );
      edtavForcolnum_Jsonclick = "" ;
      edtavForcolnum_Enabled = 0 ;
      edtavClinom_Jsonclick = "" ;
      edtavClinom_Enabled = 0 ;
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Enabled = 0 ;
      divDvpanel_unnamedtable1_cell_Class = "col-xs-12" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_btnrecalculo_Confirmtype = "1" ;
      Dvelop_confirmpanel_btnrecalculo_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_btnrecalculo_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_btnrecalculo_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_btnrecalculo_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_btnrecalculo_Confirmationtext = "¿Deseja recalcular a cor?" ;
      Dvelop_confirmpanel_btnrecalculo_Title = "" ;
      Dvelop_confirmpanel_btnconformeprecios_Confirmtype = "1" ;
      Dvelop_confirmpanel_btnconformeprecios_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_btnconformeprecios_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_btnconformeprecios_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_btnconformeprecios_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_btnconformeprecios_Confirmationtext = "¿Confirma os dados?" ;
      Dvelop_confirmpanel_btnconformeprecios_Title = "" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "|T|T|T|T|T|T|T|||||||||||||||||" ;
      Ddo_grid_Columnssortvalues = "|1|2|3|4|5|6|7|||||||||||||||||" ;
      Ddo_grid_Columnids = "0:Precios_cliente_SDT__Seleccionar|1:Precios_cliente_SDT__Forser|2:Precios_cliente_SDT__ForSerdsc|3:Precios_cliente_SDT__Forcolnum|4:Precios_cliente_SDT__Tipcolcod|5:Precios_cliente_SDT__Forcolnom|6:Precios_cliente_SDT__ForNomcli|7:Precios_cliente_SDT__IntDsc|8:Precios_cliente_SDT__Grdtipart|10:Precios_cliente_SDT__Cr|11:Precios_cliente_SDT__Forcan|12:Precios_cliente_SDT__PC|13:Precios_cliente_SDT__MV|14:Precios_cliente_SDT__PV|15:Precios_cliente_SDT__NewPreKgm|16:Precios_cliente_SDT__Obs|17:Precios_cliente_SDT__ForPrefec|18:Precios_cliente_SDT__ForFecant|19:Precios_cliente_SDT__C_M|20:Precios_cliente_SDT__Cm|21:Precios_cliente_SDT__Fi|22:Precios_cliente_SDT__Ti|23:Precios_cliente_SDT__Mc|24:Precios_cliente_SDT__F_i|33:Precios_cliente_SDT__ForRelban" ;
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
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = httpContext.getMessage( "Mas datos", "") ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Informacion", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
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
      chkavSp.setName( "vSP" );
      chkavSp.setWebtags( "" );
      chkavSp.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSp.getInternalname(), "TitleCaption", chkavSp.getCaption(), true);
      chkavSp.setCheckedValue( "N" );
      GXCCtl = "PRECIOS_CLIENTE_SDT__SELECCIONAR_" + sGXsfl_89_idx ;
      chkavPrecios_cliente_sdt__seleccionar.setName( GXCCtl );
      chkavPrecios_cliente_sdt__seleccionar.setWebtags( "" );
      chkavPrecios_cliente_sdt__seleccionar.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavPrecios_cliente_sdt__seleccionar.getInternalname(), "TitleCaption", chkavPrecios_cliente_sdt__seleccionar.getCaption(), !bGXsfl_89_Refreshing);
      chkavPrecios_cliente_sdt__seleccionar.setCheckedValue( "false" );
      GXCCtl = "PRECIOS_CLIENTE_SDT__CLITIPO_" + sGXsfl_89_idx ;
      cmbavPrecios_cliente_sdt__clitipo.setName( GXCCtl );
      cmbavPrecios_cliente_sdt__clitipo.setWebtags( "" );
      cmbavPrecios_cliente_sdt__clitipo.addItem("I", httpContext.getMessage( "Interno", ""), (short)(0));
      cmbavPrecios_cliente_sdt__clitipo.addItem("E", httpContext.getMessage( "Externo", ""), (short)(0));
      if ( cmbavPrecios_cliente_sdt__clitipo.getItemCount() > 0 )
      {
         if ( ( AV89GXV1 > 0 ) && ( AV13Precios_cliente_SDT.size() >= AV89GXV1 ) && (GXutil.strcmp("", ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV13Precios_cliente_SDT.elementAt(-1+AV89GXV1)).getgxTv_SdtPrecios_cliente_SDT_Item_Clitipo())==0) )
         {
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV123Pgmname',fld:'vPGMNAME',pic:''},{av:'AV80OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV78OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV28Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV29CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV32CliNom',fld:'vCLINOM',pic:''},{av:'AV30ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV31SP',fld:'vSP',pic:''},{av:'AV83ForBlo',fld:'vFORBLO',pic:'@!'},{av:'AV13Precios_cliente_SDT',fld:'vPRECIOS_CLIENTE_SDT',grid:89,pic:''},{av:'nGXsfl_89_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:89},{av:'nRC_GXsfl_89',ctrl:'GRID',prop:'GridRC',grid:89}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'PRECIOS_CLIENTE_SDT__SELECCIONAR',prop:'Visible'},{ctrl:'PRECIOS_CLIENTE_SDT__FORSER',prop:'Visible'},{ctrl:'PRECIOS_CLIENTE_SDT__FORSERDSC',prop:'Visible'},{ctrl:'PRECIOS_CLIENTE_SDT__FORCOLNUM',prop:'Visible'},{ctrl:'PRECIOS_CLIENTE_SDT__TIPCOLCOD',prop:'Visible'},{ctrl:'PRECIOS_CLIENTE_SDT__FORCOLNOM',prop:'Visible'},{ctrl:'PRECIOS_CLIENTE_SDT__FORNOMCLI',prop:'Visible'},{ctrl:'PRECIOS_CLIENTE_SDT__INTDSC',prop:'Visible'},{ctrl:'PRECIOS_CLIENTE_SDT__GRDTIPART',prop:'Visible'},{ctrl:'PRECIOS_CLIENTE_SDT__CR',prop:'Visible'},{ctrl:'PRECIOS_CLIENTE_SDT__FORCAN',prop:'Visible'},{ctrl:'PRECIOS_CLIENTE_SDT__PC',prop:'Visible'},{ctrl:'PRECIOS_CLIENTE_SDT__MV',prop:'Visible'},{ctrl:'PRECIOS_CLIENTE_SDT__PV',prop:'Visible'},{ctrl:'PRECIOS_CLIENTE_SDT__NEWPREKGM',prop:'Visible'},{ctrl:'PRECIOS_CLIENTE_SDT__OBS',prop:'Visible'},{ctrl:'PRECIOS_CLIENTE_SDT__FORPREFEC',prop:'Visible'},{ctrl:'PRECIOS_CLIENTE_SDT__FORFECANT',prop:'Visible'},{ctrl:'PRECIOS_CLIENTE_SDT__C_M',prop:'Visible'},{ctrl:'PRECIOS_CLIENTE_SDT__CM',prop:'Visible'},{ctrl:'PRECIOS_CLIENTE_SDT__FI',prop:'Visible'},{ctrl:'PRECIOS_CLIENTE_SDT__TI',prop:'Visible'},{ctrl:'PRECIOS_CLIENTE_SDT__MC',prop:'Visible'},{ctrl:'PRECIOS_CLIENTE_SDT__F_I',prop:'Visible'},{ctrl:'PRECIOS_CLIENTE_SDT__FORRELBAN',prop:'Visible'},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'PRECIOS_CLIENTE_SDT__SELECCIONAR',prop:'Columnheaderclass'},{ctrl:'PRECIOS_CLIENTE_SDT__FORSER',prop:'Columnheaderclass'},{ctrl:'PRECIOS_CLIENTE_SDT__FORSERDSC',prop:'Columnheaderclass'},{ctrl:'PRECIOS_CLIENTE_SDT__FORCOLNUM',prop:'Columnheaderclass'},{ctrl:'PRECIOS_CLIENTE_SDT__TIPCOLCOD',prop:'Columnheaderclass'},{ctrl:'PRECIOS_CLIENTE_SDT__FORCOLNOM',prop:'Columnheaderclass'},{ctrl:'PRECIOS_CLIENTE_SDT__FORNOMCLI',prop:'Columnheaderclass'},{ctrl:'PRECIOS_CLIENTE_SDT__INTDSC',prop:'Columnheaderclass'},{ctrl:'PRECIOS_CLIENTE_SDT__GRDTIPART',prop:'Columnheaderclass'},{ctrl:'PRECIOS_CLIENTE_SDT__CR',prop:'Columnheaderclass'},{ctrl:'PRECIOS_CLIENTE_SDT__FORCAN',prop:'Columnheaderclass'},{ctrl:'PRECIOS_CLIENTE_SDT__PC',prop:'Columnheaderclass'},{ctrl:'PRECIOS_CLIENTE_SDT__MV',prop:'Columnheaderclass'},{ctrl:'PRECIOS_CLIENTE_SDT__PV',prop:'Columnheaderclass'},{ctrl:'PRECIOS_CLIENTE_SDT__NEWPREKGM',prop:'Columnheaderclass'},{ctrl:'PRECIOS_CLIENTE_SDT__OBS',prop:'Columnheaderclass'},{ctrl:'PRECIOS_CLIENTE_SDT__FORPREFEC',prop:'Columnheaderclass'},{ctrl:'PRECIOS_CLIENTE_SDT__FORFECANT',prop:'Columnheaderclass'},{ctrl:'PRECIOS_CLIENTE_SDT__C_M',prop:'Columnheaderclass'},{ctrl:'PRECIOS_CLIENTE_SDT__CM',prop:'Columnheaderclass'},{ctrl:'PRECIOS_CLIENTE_SDT__FI',prop:'Columnheaderclass'},{ctrl:'PRECIOS_CLIENTE_SDT__TI',prop:'Columnheaderclass'},{ctrl:'PRECIOS_CLIENTE_SDT__MC',prop:'Columnheaderclass'},{ctrl:'PRECIOS_CLIENTE_SDT__F_I',prop:'Columnheaderclass'},{ctrl:'PRECIOS_CLIENTE_SDT__FORRELBAN',prop:'Columnheaderclass'},{av:'AV13Precios_cliente_SDT',fld:'vPRECIOS_CLIENTE_SDT',grid:89,pic:''},{av:'nGXsfl_89_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:89},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_89',ctrl:'GRID',prop:'GridRC',grid:89}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1223Y2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV123Pgmname',fld:'vPGMNAME',pic:''},{av:'AV80OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV78OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV28Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV29CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV32CliNom',fld:'vCLINOM',pic:''},{av:'AV30ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV31SP',fld:'vSP',pic:''},{av:'AV83ForBlo',fld:'vFORBLO',pic:'@!'},{av:'AV13Precios_cliente_SDT',fld:'vPRECIOS_CLIENTE_SDT',grid:89,pic:''},{av:'nGXsfl_89_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:89},{av:'nRC_GXsfl_89',ctrl:'GRID',prop:'GridRC',grid:89},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1323Y2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV123Pgmname',fld:'vPGMNAME',pic:''},{av:'AV80OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV78OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV28Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV29CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV32CliNom',fld:'vCLINOM',pic:''},{av:'AV30ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV31SP',fld:'vSP',pic:''},{av:'AV83ForBlo',fld:'vFORBLO',pic:'@!'},{av:'AV13Precios_cliente_SDT',fld:'vPRECIOS_CLIENTE_SDT',grid:89,pic:''},{av:'nGXsfl_89_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:89},{av:'nRC_GXsfl_89',ctrl:'GRID',prop:'GridRC',grid:89},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e1423Y2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV123Pgmname',fld:'vPGMNAME',pic:''},{av:'AV80OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV78OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV28Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV29CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV32CliNom',fld:'vCLINOM',pic:''},{av:'AV30ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV31SP',fld:'vSP',pic:''},{av:'AV83ForBlo',fld:'vFORBLO',pic:'@!'},{av:'AV13Precios_cliente_SDT',fld:'vPRECIOS_CLIENTE_SDT',grid:89,pic:''},{av:'nGXsfl_89_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:89},{av:'nRC_GXsfl_89',ctrl:'GRID',prop:'GridRC',grid:89},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV80OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV78OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e2323Y2',iparms:[{av:'AV13Precios_cliente_SDT',fld:'vPRECIOS_CLIENTE_SDT',grid:89,pic:''},{av:'nGXsfl_89_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:89},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_89',ctrl:'GRID',prop:'GridRC',grid:89}]");
      setEventMetadata("GRID.LOAD",",oparms:[{ctrl:'PRECIOS_CLIENTE_SDT__SELECCIONAR',prop:'Columnclass'},{ctrl:'PRECIOS_CLIENTE_SDT__FORSER',prop:'Columnclass'},{ctrl:'PRECIOS_CLIENTE_SDT__FORSERDSC',prop:'Columnclass'},{ctrl:'PRECIOS_CLIENTE_SDT__FORCOLNUM',prop:'Columnclass'},{ctrl:'PRECIOS_CLIENTE_SDT__TIPCOLCOD',prop:'Columnclass'},{ctrl:'PRECIOS_CLIENTE_SDT__FORCOLNOM',prop:'Columnclass'},{ctrl:'PRECIOS_CLIENTE_SDT__FORNOMCLI',prop:'Columnclass'},{ctrl:'PRECIOS_CLIENTE_SDT__INTDSC',prop:'Columnclass'},{ctrl:'PRECIOS_CLIENTE_SDT__GRDTIPART',prop:'Columnclass'},{ctrl:'PRECIOS_CLIENTE_SDT__CR',prop:'Columnclass'},{ctrl:'PRECIOS_CLIENTE_SDT__FORCAN',prop:'Columnclass'},{ctrl:'PRECIOS_CLIENTE_SDT__PC',prop:'Columnclass'},{ctrl:'PRECIOS_CLIENTE_SDT__MV',prop:'Columnclass'},{ctrl:'PRECIOS_CLIENTE_SDT__PV',prop:'Columnclass'},{ctrl:'PRECIOS_CLIENTE_SDT__NEWPREKGM',prop:'Columnclass'},{ctrl:'PRECIOS_CLIENTE_SDT__OBS',prop:'Columnclass'},{ctrl:'PRECIOS_CLIENTE_SDT__FORPREFEC',prop:'Columnclass'},{ctrl:'PRECIOS_CLIENTE_SDT__FORFECANT',prop:'Columnclass'},{ctrl:'PRECIOS_CLIENTE_SDT__C_M',prop:'Columnclass'},{ctrl:'PRECIOS_CLIENTE_SDT__CM',prop:'Columnclass'},{ctrl:'PRECIOS_CLIENTE_SDT__FI',prop:'Columnclass'},{ctrl:'PRECIOS_CLIENTE_SDT__TI',prop:'Columnclass'},{ctrl:'PRECIOS_CLIENTE_SDT__MC',prop:'Columnclass'},{ctrl:'PRECIOS_CLIENTE_SDT__F_I',prop:'Columnclass'},{ctrl:'PRECIOS_CLIENTE_SDT__FORRELBAN',prop:'Columnclass'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e1523Y2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV123Pgmname',fld:'vPGMNAME',pic:''},{av:'AV80OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV78OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV28Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV29CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV32CliNom',fld:'vCLINOM',pic:''},{av:'AV30ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV31SP',fld:'vSP',pic:''},{av:'AV83ForBlo',fld:'vFORBLO',pic:'@!'},{av:'AV13Precios_cliente_SDT',fld:'vPRECIOS_CLIENTE_SDT',grid:89,pic:''},{av:'nGXsfl_89_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:89},{av:'nRC_GXsfl_89',ctrl:'GRID',prop:'GridRC',grid:89},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'PRECIOS_CLIENTE_SDT__SELECCIONAR',prop:'Visible'},{ctrl:'PRECIOS_CLIENTE_SDT__FORSER',prop:'Visible'},{ctrl:'PRECIOS_CLIENTE_SDT__FORSERDSC',prop:'Visible'},{ctrl:'PRECIOS_CLIENTE_SDT__FORCOLNUM',prop:'Visible'},{ctrl:'PRECIOS_CLIENTE_SDT__TIPCOLCOD',prop:'Visible'},{ctrl:'PRECIOS_CLIENTE_SDT__FORCOLNOM',prop:'Visible'},{ctrl:'PRECIOS_CLIENTE_SDT__FORNOMCLI',prop:'Visible'},{ctrl:'PRECIOS_CLIENTE_SDT__INTDSC',prop:'Visible'},{ctrl:'PRECIOS_CLIENTE_SDT__GRDTIPART',prop:'Visible'},{ctrl:'PRECIOS_CLIENTE_SDT__CR',prop:'Visible'},{ctrl:'PRECIOS_CLIENTE_SDT__FORCAN',prop:'Visible'},{ctrl:'PRECIOS_CLIENTE_SDT__PC',prop:'Visible'},{ctrl:'PRECIOS_CLIENTE_SDT__MV',prop:'Visible'},{ctrl:'PRECIOS_CLIENTE_SDT__PV',prop:'Visible'},{ctrl:'PRECIOS_CLIENTE_SDT__NEWPREKGM',prop:'Visible'},{ctrl:'PRECIOS_CLIENTE_SDT__OBS',prop:'Visible'},{ctrl:'PRECIOS_CLIENTE_SDT__FORPREFEC',prop:'Visible'},{ctrl:'PRECIOS_CLIENTE_SDT__FORFECANT',prop:'Visible'},{ctrl:'PRECIOS_CLIENTE_SDT__C_M',prop:'Visible'},{ctrl:'PRECIOS_CLIENTE_SDT__CM',prop:'Visible'},{ctrl:'PRECIOS_CLIENTE_SDT__FI',prop:'Visible'},{ctrl:'PRECIOS_CLIENTE_SDT__TI',prop:'Visible'},{ctrl:'PRECIOS_CLIENTE_SDT__MC',prop:'Visible'},{ctrl:'PRECIOS_CLIENTE_SDT__F_I',prop:'Visible'},{ctrl:'PRECIOS_CLIENTE_SDT__FORRELBAN',prop:'Visible'},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'PRECIOS_CLIENTE_SDT__SELECCIONAR',prop:'Columnheaderclass'},{ctrl:'PRECIOS_CLIENTE_SDT__FORSER',prop:'Columnheaderclass'},{ctrl:'PRECIOS_CLIENTE_SDT__FORSERDSC',prop:'Columnheaderclass'},{ctrl:'PRECIOS_CLIENTE_SDT__FORCOLNUM',prop:'Columnheaderclass'},{ctrl:'PRECIOS_CLIENTE_SDT__TIPCOLCOD',prop:'Columnheaderclass'},{ctrl:'PRECIOS_CLIENTE_SDT__FORCOLNOM',prop:'Columnheaderclass'},{ctrl:'PRECIOS_CLIENTE_SDT__FORNOMCLI',prop:'Columnheaderclass'},{ctrl:'PRECIOS_CLIENTE_SDT__INTDSC',prop:'Columnheaderclass'},{ctrl:'PRECIOS_CLIENTE_SDT__GRDTIPART',prop:'Columnheaderclass'},{ctrl:'PRECIOS_CLIENTE_SDT__CR',prop:'Columnheaderclass'},{ctrl:'PRECIOS_CLIENTE_SDT__FORCAN',prop:'Columnheaderclass'},{ctrl:'PRECIOS_CLIENTE_SDT__PC',prop:'Columnheaderclass'},{ctrl:'PRECIOS_CLIENTE_SDT__MV',prop:'Columnheaderclass'},{ctrl:'PRECIOS_CLIENTE_SDT__PV',prop:'Columnheaderclass'},{ctrl:'PRECIOS_CLIENTE_SDT__NEWPREKGM',prop:'Columnheaderclass'},{ctrl:'PRECIOS_CLIENTE_SDT__OBS',prop:'Columnheaderclass'},{ctrl:'PRECIOS_CLIENTE_SDT__FORPREFEC',prop:'Columnheaderclass'},{ctrl:'PRECIOS_CLIENTE_SDT__FORFECANT',prop:'Columnheaderclass'},{ctrl:'PRECIOS_CLIENTE_SDT__C_M',prop:'Columnheaderclass'},{ctrl:'PRECIOS_CLIENTE_SDT__CM',prop:'Columnheaderclass'},{ctrl:'PRECIOS_CLIENTE_SDT__FI',prop:'Columnheaderclass'},{ctrl:'PRECIOS_CLIENTE_SDT__TI',prop:'Columnheaderclass'},{ctrl:'PRECIOS_CLIENTE_SDT__MC',prop:'Columnheaderclass'},{ctrl:'PRECIOS_CLIENTE_SDT__F_I',prop:'Columnheaderclass'},{ctrl:'PRECIOS_CLIENTE_SDT__FORRELBAN',prop:'Columnheaderclass'},{av:'AV13Precios_cliente_SDT',fld:'vPRECIOS_CLIENTE_SDT',grid:89,pic:''},{av:'nGXsfl_89_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:89},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_89',ctrl:'GRID',prop:'GridRC',grid:89}]}");
      setEventMetadata("'DOCONFORMEPRECIOS'","{handler:'e1123Y1',iparms:[]");
      setEventMetadata("'DOCONFORMEPRECIOS'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNCONFORMEPRECIOS.CLOSE","{handler:'e1623Y2',iparms:[{av:'Dvelop_confirmpanel_btnconformeprecios_Result',ctrl:'DVELOP_CONFIRMPANEL_BTNCONFORMEPRECIOS',prop:'Result'},{av:'AV13Precios_cliente_SDT',fld:'vPRECIOS_CLIENTE_SDT',grid:89,pic:''},{av:'nGXsfl_89_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:89},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_89',ctrl:'GRID',prop:'GridRC',grid:89},{av:'AV28Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV29CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV32CliNom',fld:'vCLINOM',pic:''},{av:'AV30ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV31SP',fld:'vSP',pic:''},{av:'AV83ForBlo',fld:'vFORBLO',pic:'@!'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV123Pgmname',fld:'vPGMNAME',pic:''},{av:'AV80OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV78OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNCONFORMEPRECIOS.CLOSE",",oparms:[{av:'AV45Precios_cliente_SDT_item',fld:'vPRECIOS_CLIENTE_SDT_ITEM',pic:''},{av:'AV13Precios_cliente_SDT',fld:'vPRECIOS_CLIENTE_SDT',grid:89,pic:''},{av:'nGXsfl_89_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:89},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_89',ctrl:'GRID',prop:'GridRC',grid:89}]}");
      setEventMetadata("'DORECALCULO'","{handler:'e1823Y2',iparms:[{av:'AV13Precios_cliente_SDT',fld:'vPRECIOS_CLIENTE_SDT',grid:89,pic:''},{av:'nGXsfl_89_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:89},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_89',ctrl:'GRID',prop:'GridRC',grid:89},{av:'AV45Precios_cliente_SDT_item',fld:'vPRECIOS_CLIENTE_SDT_ITEM',pic:''},{av:'AV29CliCod',fld:'vCLICOD',pic:'ZZZZZ9'}]");
      setEventMetadata("'DORECALCULO'",",oparms:[{av:'Dvelop_confirmpanel_btnrecalculo_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_BTNRECALCULO',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNRECALCULO.CLOSE","{handler:'e1723Y2',iparms:[{av:'Dvelop_confirmpanel_btnrecalculo_Result',ctrl:'DVELOP_CONFIRMPANEL_BTNRECALCULO',prop:'Result'},{av:'AV13Precios_cliente_SDT',fld:'vPRECIOS_CLIENTE_SDT',grid:89,pic:''},{av:'nGXsfl_89_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:89},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_89',ctrl:'GRID',prop:'GridRC',grid:89},{av:'AV28Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV29CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV40Station',fld:'vSTATION',pic:''},{av:'AV39Valor_cor',fld:'vVALOR_COR',pic:'ZZZZ9.99999'},{av:'AV30ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV31SP',fld:'vSP',pic:''},{av:'AV83ForBlo',fld:'vFORBLO',pic:'@!'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV123Pgmname',fld:'vPGMNAME',pic:''},{av:'AV80OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV78OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV32CliNom',fld:'vCLINOM',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNRECALCULO.CLOSE",",oparms:[{av:'AV29CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV28Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV39Valor_cor',fld:'vVALOR_COR',pic:'ZZZZ9.99999'},{av:'AV40Station',fld:'vSTATION',pic:''},{av:'AV13Precios_cliente_SDT',fld:'vPRECIOS_CLIENTE_SDT',grid:89,pic:''},{av:'nGXsfl_89_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:89},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_89',ctrl:'GRID',prop:'GridRC',grid:89}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e1923Y2',iparms:[{av:'AV13Precios_cliente_SDT',fld:'vPRECIOS_CLIENTE_SDT',grid:89,pic:''},{av:'nGXsfl_89_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:89},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_89',ctrl:'GRID',prop:'GridRC',grid:89}]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e2023Y2',iparms:[{av:'AV13Precios_cliente_SDT',fld:'vPRECIOS_CLIENTE_SDT',grid:89,pic:''},{av:'nGXsfl_89_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:89},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_89',ctrl:'GRID',prop:'GridRC',grid:89}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("PRECIOS_CLIENTE_SDT__NEWPREKGM.CONTROLVALUECHANGED","{handler:'e2423Y2',iparms:[{av:'AV13Precios_cliente_SDT',fld:'vPRECIOS_CLIENTE_SDT',grid:89,pic:''},{av:'nGXsfl_89_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:89},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_89',ctrl:'GRID',prop:'GridRC',grid:89},{av:'AV84SelForcolnum',fld:'vSELFORCOLNUM',pic:'ZZZZZ9'},{av:'AV85SelNewPreKgm',fld:'vSELNEWPREKGM',pic:'Z9.999'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV123Pgmname',fld:'vPGMNAME',pic:''},{av:'AV80OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV78OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV28Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV29CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV32CliNom',fld:'vCLINOM',pic:''},{av:'AV30ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV31SP',fld:'vSP',pic:''},{av:'AV83ForBlo',fld:'vFORBLO',pic:'@!'}]");
      setEventMetadata("PRECIOS_CLIENTE_SDT__NEWPREKGM.CONTROLVALUECHANGED",",oparms:[{av:'AV84SelForcolnum',fld:'vSELFORCOLNUM',pic:'ZZZZZ9'},{av:'AV13Precios_cliente_SDT',fld:'vPRECIOS_CLIENTE_SDT',grid:89,pic:''},{av:'nGXsfl_89_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:89},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_89',ctrl:'GRID',prop:'GridRC',grid:89},{av:'AV85SelNewPreKgm',fld:'vSELNEWPREKGM',pic:'Z9.999'},{av:'AV45Precios_cliente_SDT_item',fld:'vPRECIOS_CLIENTE_SDT_ITEM',pic:''}]}");
      setEventMetadata("PRECIOS_CLIENTE_SDT__MV.CONTROLVALUECHANGED","{handler:'e2523Y2',iparms:[{av:'AV13Precios_cliente_SDT',fld:'vPRECIOS_CLIENTE_SDT',grid:89,pic:''},{av:'nGXsfl_89_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:89},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_89',ctrl:'GRID',prop:'GridRC',grid:89},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV123Pgmname',fld:'vPGMNAME',pic:''},{av:'AV80OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV78OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV28Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV29CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV32CliNom',fld:'vCLINOM',pic:''},{av:'AV30ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV31SP',fld:'vSP',pic:''},{av:'AV83ForBlo',fld:'vFORBLO',pic:'@!'}]");
      setEventMetadata("PRECIOS_CLIENTE_SDT__MV.CONTROLVALUECHANGED",",oparms:[{av:'AV13Precios_cliente_SDT',fld:'vPRECIOS_CLIENTE_SDT',grid:89,pic:''},{av:'nGXsfl_89_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:89},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_89',ctrl:'GRID',prop:'GridRC',grid:89}]}");
      setEventMetadata("VALIDV_GXV33","{handler:'validv_Gxv33',iparms:[]");
      setEventMetadata("VALIDV_GXV33",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Gxv34',iparms:[]");
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
      wcpOAV28Emprcod = "" ;
      wcpOAV32CliNom = "" ;
      wcpOAV31SP = "" ;
      wcpOAV83ForBlo = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Dvelop_confirmpanel_btnconformeprecios_Result = "" ;
      Dvelop_confirmpanel_btnrecalculo_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV28Emprcod = "" ;
      AV32CliNom = "" ;
      AV31SP = "" ;
      AV83ForBlo = "" ;
      AV18ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV123Pgmname = "" ;
      AV13Precios_cliente_SDT = new GXBaseCollection<app.facturacion.SdtPrecios_cliente_SDT_Item>(app.facturacion.SdtPrecios_cliente_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV24DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV45Precios_cliente_SDT_item = new app.facturacion.SdtPrecios_cliente_SDT_Item(remoteHandle, context);
      AV40Station = "" ;
      AV39Valor_cor = DecimalUtil.ZERO ;
      AV85SelNewPreKgm = DecimalUtil.ZERO ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      lblTextblock2_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      lblTextblock1_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      bttBtnconformeprecios_Jsonclick = "" ;
      bttBtnrecalculo_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV43Prompt = "" ;
      AV126Prompt_GXI = "" ;
      hsh = "" ;
      AV41EmprNom = "" ;
      AV42UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV20Session = httpContext.getWebSession();
      AV16ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV33ForSer = "" ;
      AV34ForColNom = "" ;
      AV36ForRelBan = DecimalUtil.ZERO ;
      ucDvelop_confirmpanel_btnrecalculo = new com.genexus.webpanels.GXUserControl();
      AV37Precios_cliente_Json = "" ;
      AV38WebSession = httpContext.getWebSession();
      AV14ExcelFilename = "" ;
      AV15ErrorMessage = "" ;
      AV17UserCustomValue = "" ;
      GXt_char1 = "" ;
      AV19ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector11 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV53MV = DecimalUtil.ZERO ;
      AV55PC = DecimalUtil.ZERO ;
      AV51Precios_cliente_mail_SDT = new GXBaseCollection<app.facturacion.SdtPrecios_cliente_mail_SDT_Item>(app.facturacion.SdtPrecios_cliente_mail_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      AV54Precios_cliente_mail_Json = "" ;
      AV46NewPreKgm = DecimalUtil.ZERO ;
      AV47Obs = "" ;
      AV52Precios_cliente_mail_SDT_item = new app.facturacion.SdtPrecios_cliente_mail_SDT_Item(remoteHandle, context);
      GXv_int12 = new int[1] ;
      GXv_char2 = new String[1] ;
      GXv_decimal15 = new java.math.BigDecimal[1] ;
      GXv_char17 = new String[1] ;
      GXv_int16 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int13 = new int[1] ;
      GXv_int14 = new byte[1] ;
      GXv_decimal18 = new java.math.BigDecimal[1] ;
      GXt_objcol_SdtPrecios_cliente_SDT_Item7 = new GXBaseCollection<app.facturacion.SdtPrecios_cliente_SDT_Item>(app.facturacion.SdtPrecios_cliente_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      GXv_objcol_SdtPrecios_cliente_SDT_Item8 = new GXBaseCollection[1] ;
      ucDvelop_confirmpanel_btnconformeprecios = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV28Emprcod = "" ;
      sCtrlAV29CliCod = "" ;
      sCtrlAV32CliNom = "" ;
      sCtrlAV30ForColNum = "" ;
      sCtrlAV31SP = "" ;
      sCtrlAV83ForBlo = "" ;
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      sImgUrl = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      AV123Pgmname = "Facturacion.Precios_cliente_WC" ;
      /* GeneXus formulas. */
      AV123Pgmname = "Facturacion.Precios_cliente_WC" ;
      Gx_err = (short)(0) ;
      edtavClicod_Enabled = 0 ;
      edtavClinom_Enabled = 0 ;
      edtavForcolnum_Enabled = 0 ;
      chkavSp.setEnabled( 0 );
      edtavPrecios_cliente_sdt__forser_Enabled = 0 ;
      edtavPrecios_cliente_sdt__forserdsc_Enabled = 0 ;
      edtavPrecios_cliente_sdt__forcolnum_Enabled = 0 ;
      edtavPrecios_cliente_sdt__tipcolcod_Enabled = 0 ;
      edtavPrecios_cliente_sdt__forcolnom_Enabled = 0 ;
      edtavPrecios_cliente_sdt__fornomcli_Enabled = 0 ;
      edtavPrecios_cliente_sdt__intdsc_Enabled = 0 ;
      edtavPrecios_cliente_sdt__grdtipart_Enabled = 0 ;
      edtavPrecios_cliente_sdt__cr_Enabled = 0 ;
      edtavPrecios_cliente_sdt__forcan_Enabled = 0 ;
      edtavPrecios_cliente_sdt__pc_Enabled = 0 ;
      edtavPrecios_cliente_sdt__pv_Enabled = 0 ;
      edtavPrecios_cliente_sdt__forprefec_Enabled = 0 ;
      edtavPrecios_cliente_sdt__forfecant_Enabled = 0 ;
      edtavPrecios_cliente_sdt__c_m_Enabled = 0 ;
      edtavPrecios_cliente_sdt__cm_Enabled = 0 ;
      edtavPrecios_cliente_sdt__fi_Enabled = 0 ;
      edtavPrecios_cliente_sdt__ti_Enabled = 0 ;
      edtavPrecios_cliente_sdt__mc_Enabled = 0 ;
      edtavPrecios_cliente_sdt__f_i_Enabled = 0 ;
      edtavPrecios_cliente_sdt__tipartdsc_Enabled = 0 ;
      edtavPrecios_cliente_sdt__artdsc_Enabled = 0 ;
      edtavPrecios_cliente_sdt__fortonal_Enabled = 0 ;
      edtavPrecios_cliente_sdt__fam_cod_Enabled = 0 ;
      edtavPrecios_cliente_sdt__forcosuti_Enabled = 0 ;
      edtavPrecios_cliente_sdt__oldclasse_Enabled = 0 ;
      edtavPrecios_cliente_sdt__fornumcol_Enabled = 0 ;
      cmbavPrecios_cliente_sdt__clitipo.setEnabled( 0 );
      edtavPrecios_cliente_sdt__forrelban_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV35TipColCod ;
   private byte GXv_int14[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV80OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV48GrdTipARt ;
   private int wcpOAV29CliCod ;
   private int wcpOAV30ForColNum ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_89 ;
   private int AV29CliCod ;
   private int AV30ForColNum ;
   private int nGXsfl_89_idx=1 ;
   private int AV84SelForcolnum ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavClicod_Enabled ;
   private int edtavClinom_Enabled ;
   private int edtavForcolnum_Enabled ;
   private int AV89GXV1 ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int edtavPrecios_cliente_sdt__forser_Enabled ;
   private int edtavPrecios_cliente_sdt__forserdsc_Enabled ;
   private int edtavPrecios_cliente_sdt__forcolnum_Enabled ;
   private int edtavPrecios_cliente_sdt__tipcolcod_Enabled ;
   private int edtavPrecios_cliente_sdt__forcolnom_Enabled ;
   private int edtavPrecios_cliente_sdt__fornomcli_Enabled ;
   private int edtavPrecios_cliente_sdt__intdsc_Enabled ;
   private int edtavPrecios_cliente_sdt__grdtipart_Enabled ;
   private int edtavPrecios_cliente_sdt__cr_Enabled ;
   private int edtavPrecios_cliente_sdt__forcan_Enabled ;
   private int edtavPrecios_cliente_sdt__pc_Enabled ;
   private int edtavPrecios_cliente_sdt__pv_Enabled ;
   private int edtavPrecios_cliente_sdt__forprefec_Enabled ;
   private int edtavPrecios_cliente_sdt__forfecant_Enabled ;
   private int edtavPrecios_cliente_sdt__c_m_Enabled ;
   private int edtavPrecios_cliente_sdt__cm_Enabled ;
   private int edtavPrecios_cliente_sdt__fi_Enabled ;
   private int edtavPrecios_cliente_sdt__ti_Enabled ;
   private int edtavPrecios_cliente_sdt__mc_Enabled ;
   private int edtavPrecios_cliente_sdt__f_i_Enabled ;
   private int edtavPrecios_cliente_sdt__tipartdsc_Enabled ;
   private int edtavPrecios_cliente_sdt__artdsc_Enabled ;
   private int edtavPrecios_cliente_sdt__fortonal_Enabled ;
   private int edtavPrecios_cliente_sdt__fam_cod_Enabled ;
   private int edtavPrecios_cliente_sdt__forcosuti_Enabled ;
   private int edtavPrecios_cliente_sdt__oldclasse_Enabled ;
   private int edtavPrecios_cliente_sdt__fornumcol_Enabled ;
   private int edtavPrecios_cliente_sdt__forrelban_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int nGXsfl_89_fel_idx=1 ;
   private int edtavPrecios_cliente_sdt__forser_Visible ;
   private int edtavPrecios_cliente_sdt__forserdsc_Visible ;
   private int edtavPrecios_cliente_sdt__forcolnum_Visible ;
   private int edtavPrecios_cliente_sdt__tipcolcod_Visible ;
   private int edtavPrecios_cliente_sdt__forcolnom_Visible ;
   private int edtavPrecios_cliente_sdt__fornomcli_Visible ;
   private int edtavPrecios_cliente_sdt__intdsc_Visible ;
   private int edtavPrecios_cliente_sdt__grdtipart_Visible ;
   private int edtavPrecios_cliente_sdt__cr_Visible ;
   private int edtavPrecios_cliente_sdt__forcan_Visible ;
   private int edtavPrecios_cliente_sdt__pc_Visible ;
   private int edtavPrecios_cliente_sdt__mv_Visible ;
   private int edtavPrecios_cliente_sdt__pv_Visible ;
   private int edtavPrecios_cliente_sdt__newprekgm_Visible ;
   private int edtavPrecios_cliente_sdt__obs_Visible ;
   private int edtavPrecios_cliente_sdt__forprefec_Visible ;
   private int edtavPrecios_cliente_sdt__forfecant_Visible ;
   private int edtavPrecios_cliente_sdt__c_m_Visible ;
   private int edtavPrecios_cliente_sdt__cm_Visible ;
   private int edtavPrecios_cliente_sdt__fi_Visible ;
   private int edtavPrecios_cliente_sdt__ti_Visible ;
   private int edtavPrecios_cliente_sdt__mc_Visible ;
   private int edtavPrecios_cliente_sdt__f_i_Visible ;
   private int edtavPrecios_cliente_sdt__forrelban_Visible ;
   private int AV25PageToGo ;
   private int nGXsfl_89_bak_idx=1 ;
   private int AV82INForcolnum ;
   private int AV124GXV35 ;
   private int AV86volumen ;
   private int GXv_int12[] ;
   private int GXv_int16[] ;
   private int GXv_int13[] ;
   private int AV125GXV36 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavPrecios_cliente_sdt__mv_Enabled ;
   private int edtavPrecios_cliente_sdt__newprekgm_Enabled ;
   private int edtavPrecios_cliente_sdt__obs_Enabled ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV26GridCurrentPage ;
   private long AV27GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV39Valor_cor ;
   private java.math.BigDecimal AV85SelNewPreKgm ;
   private java.math.BigDecimal AV36ForRelBan ;
   private java.math.BigDecimal AV53MV ;
   private java.math.BigDecimal AV55PC ;
   private java.math.BigDecimal AV46NewPreKgm ;
   private java.math.BigDecimal GXv_decimal15[] ;
   private java.math.BigDecimal GXv_decimal18[] ;
   private String wcpOAV28Emprcod ;
   private String wcpOAV32CliNom ;
   private String wcpOAV31SP ;
   private String wcpOAV83ForBlo ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Dvelop_confirmpanel_btnconformeprecios_Result ;
   private String Dvelop_confirmpanel_btnrecalculo_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV28Emprcod ;
   private String AV32CliNom ;
   private String AV31SP ;
   private String AV83ForBlo ;
   private String sGXsfl_89_idx="0001" ;
   private String AV123Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV40Station ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
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
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Includesortasc ;
   private String Ddo_grid_Fixable ;
   private String Ddo_grid_Sortedstatus ;
   private String Ddo_gridcolumnsselector_Caption ;
   private String Ddo_gridcolumnsselector_Tooltip ;
   private String Ddo_gridcolumnsselector_Cls ;
   private String Ddo_gridcolumnsselector_Dropdownoptionstype ;
   private String Ddo_gridcolumnsselector_Gridinternalname ;
   private String Ddo_gridcolumnsselector_Titlecontrolidtoreplace ;
   private String Dvelop_confirmpanel_btnconformeprecios_Title ;
   private String Dvelop_confirmpanel_btnconformeprecios_Confirmationtext ;
   private String Dvelop_confirmpanel_btnconformeprecios_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_btnconformeprecios_Nobuttoncaption ;
   private String Dvelop_confirmpanel_btnconformeprecios_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_btnconformeprecios_Yesbuttonposition ;
   private String Dvelop_confirmpanel_btnconformeprecios_Confirmtype ;
   private String Dvelop_confirmpanel_btnrecalculo_Title ;
   private String Dvelop_confirmpanel_btnrecalculo_Confirmationtext ;
   private String Dvelop_confirmpanel_btnrecalculo_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_btnrecalculo_Nobuttoncaption ;
   private String Dvelop_confirmpanel_btnrecalculo_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_btnrecalculo_Yesbuttonposition ;
   private String Dvelop_confirmpanel_btnrecalculo_Confirmtype ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String divDvpanel_unnamedtable1_cell_Internalname ;
   private String divDvpanel_unnamedtable1_cell_Class ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable6_Internalname ;
   private String edtavClicod_Internalname ;
   private String edtavClicod_Jsonclick ;
   private String edtavClinom_Internalname ;
   private String edtavClinom_Jsonclick ;
   private String edtavForcolnum_Internalname ;
   private String edtavForcolnum_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String divDvpanel_unnamedtable2_cell_Internalname ;
   private String divDvpanel_unnamedtable2_cell_Class ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String lblTextblock1_Internalname ;
   private String lblTextblock1_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableactions_Internalname ;
   private String TempTags ;
   private String bttBtnexport_Internalname ;
   private String bttBtnexport_Jsonclick ;
   private String bttBtnexportcsv_Internalname ;
   private String bttBtnexportcsv_Jsonclick ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String bttBtnconformeprecios_Internalname ;
   private String bttBtnconformeprecios_Jsonclick ;
   private String bttBtnrecalculo_Internalname ;
   private String bttBtnrecalculo_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavPrompt_Internalname ;
   private String edtavPrecios_cliente_sdt__forser_Internalname ;
   private String edtavPrecios_cliente_sdt__forserdsc_Internalname ;
   private String edtavPrecios_cliente_sdt__forcolnum_Internalname ;
   private String edtavPrecios_cliente_sdt__tipcolcod_Internalname ;
   private String edtavPrecios_cliente_sdt__forcolnom_Internalname ;
   private String edtavPrecios_cliente_sdt__fornomcli_Internalname ;
   private String edtavPrecios_cliente_sdt__intdsc_Internalname ;
   private String edtavPrecios_cliente_sdt__grdtipart_Internalname ;
   private String edtavPrecios_cliente_sdt__cr_Internalname ;
   private String edtavPrecios_cliente_sdt__forcan_Internalname ;
   private String edtavPrecios_cliente_sdt__pc_Internalname ;
   private String edtavPrecios_cliente_sdt__pv_Internalname ;
   private String edtavPrecios_cliente_sdt__forprefec_Internalname ;
   private String edtavPrecios_cliente_sdt__forfecant_Internalname ;
   private String edtavPrecios_cliente_sdt__c_m_Internalname ;
   private String edtavPrecios_cliente_sdt__cm_Internalname ;
   private String edtavPrecios_cliente_sdt__fi_Internalname ;
   private String edtavPrecios_cliente_sdt__ti_Internalname ;
   private String edtavPrecios_cliente_sdt__mc_Internalname ;
   private String edtavPrecios_cliente_sdt__f_i_Internalname ;
   private String edtavPrecios_cliente_sdt__tipartdsc_Internalname ;
   private String edtavPrecios_cliente_sdt__artdsc_Internalname ;
   private String edtavPrecios_cliente_sdt__fortonal_Internalname ;
   private String edtavPrecios_cliente_sdt__fam_cod_Internalname ;
   private String edtavPrecios_cliente_sdt__forcosuti_Internalname ;
   private String edtavPrecios_cliente_sdt__oldclasse_Internalname ;
   private String edtavPrecios_cliente_sdt__fornumcol_Internalname ;
   private String edtavPrecios_cliente_sdt__forrelban_Internalname ;
   private String sGXsfl_89_fel_idx="0001" ;
   private String hsh ;
   private String AV41EmprNom ;
   private String AV42UsurCod ;
   private String edtavPrecios_cliente_sdt__mv_Internalname ;
   private String edtavPrecios_cliente_sdt__newprekgm_Internalname ;
   private String edtavPrecios_cliente_sdt__obs_Internalname ;
   private String edtavPrecios_cliente_sdt__forser_Columnheaderclass ;
   private String edtavPrecios_cliente_sdt__forserdsc_Columnheaderclass ;
   private String edtavPrecios_cliente_sdt__forcolnum_Columnheaderclass ;
   private String edtavPrecios_cliente_sdt__tipcolcod_Columnheaderclass ;
   private String edtavPrecios_cliente_sdt__forcolnom_Columnheaderclass ;
   private String edtavPrecios_cliente_sdt__fornomcli_Columnheaderclass ;
   private String edtavPrecios_cliente_sdt__intdsc_Columnheaderclass ;
   private String edtavPrecios_cliente_sdt__grdtipart_Columnheaderclass ;
   private String edtavPrecios_cliente_sdt__cr_Columnheaderclass ;
   private String edtavPrecios_cliente_sdt__forcan_Columnheaderclass ;
   private String edtavPrecios_cliente_sdt__pc_Columnheaderclass ;
   private String edtavPrecios_cliente_sdt__mv_Columnheaderclass ;
   private String edtavPrecios_cliente_sdt__pv_Columnheaderclass ;
   private String edtavPrecios_cliente_sdt__newprekgm_Columnheaderclass ;
   private String edtavPrecios_cliente_sdt__obs_Columnheaderclass ;
   private String edtavPrecios_cliente_sdt__forprefec_Columnheaderclass ;
   private String edtavPrecios_cliente_sdt__forfecant_Columnheaderclass ;
   private String edtavPrecios_cliente_sdt__c_m_Columnheaderclass ;
   private String edtavPrecios_cliente_sdt__cm_Columnheaderclass ;
   private String edtavPrecios_cliente_sdt__fi_Columnheaderclass ;
   private String edtavPrecios_cliente_sdt__ti_Columnheaderclass ;
   private String edtavPrecios_cliente_sdt__mc_Columnheaderclass ;
   private String edtavPrecios_cliente_sdt__f_i_Columnheaderclass ;
   private String edtavPrecios_cliente_sdt__forrelban_Columnheaderclass ;
   private String edtavPrecios_cliente_sdt__forser_Columnclass ;
   private String edtavPrecios_cliente_sdt__forserdsc_Columnclass ;
   private String edtavPrecios_cliente_sdt__forcolnum_Columnclass ;
   private String edtavPrecios_cliente_sdt__tipcolcod_Columnclass ;
   private String edtavPrecios_cliente_sdt__forcolnom_Columnclass ;
   private String edtavPrecios_cliente_sdt__fornomcli_Columnclass ;
   private String edtavPrecios_cliente_sdt__intdsc_Columnclass ;
   private String edtavPrecios_cliente_sdt__grdtipart_Columnclass ;
   private String edtavPrecios_cliente_sdt__cr_Columnclass ;
   private String edtavPrecios_cliente_sdt__forcan_Columnclass ;
   private String edtavPrecios_cliente_sdt__pc_Columnclass ;
   private String edtavPrecios_cliente_sdt__mv_Columnclass ;
   private String edtavPrecios_cliente_sdt__pv_Columnclass ;
   private String edtavPrecios_cliente_sdt__newprekgm_Columnclass ;
   private String edtavPrecios_cliente_sdt__obs_Columnclass ;
   private String edtavPrecios_cliente_sdt__forprefec_Columnclass ;
   private String edtavPrecios_cliente_sdt__forfecant_Columnclass ;
   private String edtavPrecios_cliente_sdt__c_m_Columnclass ;
   private String edtavPrecios_cliente_sdt__cm_Columnclass ;
   private String edtavPrecios_cliente_sdt__fi_Columnclass ;
   private String edtavPrecios_cliente_sdt__ti_Columnclass ;
   private String edtavPrecios_cliente_sdt__mc_Columnclass ;
   private String edtavPrecios_cliente_sdt__f_i_Columnclass ;
   private String edtavPrecios_cliente_sdt__forrelban_Columnclass ;
   private String AV33ForSer ;
   private String AV34ForColNom ;
   private String Dvelop_confirmpanel_btnrecalculo_Internalname ;
   private String GXt_char1 ;
   private String AV47Obs ;
   private String GXv_char2[] ;
   private String GXv_char17[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String tblTabledvelop_confirmpanel_btnrecalculo_Internalname ;
   private String tblTabledvelop_confirmpanel_btnconformeprecios_Internalname ;
   private String Dvelop_confirmpanel_btnconformeprecios_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String sCtrlAV28Emprcod ;
   private String sCtrlAV29CliCod ;
   private String sCtrlAV32CliNom ;
   private String sCtrlAV30ForColNum ;
   private String sCtrlAV31SP ;
   private String sCtrlAV83ForBlo ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtavPrecios_cliente_sdt__forser_Jsonclick ;
   private String edtavPrecios_cliente_sdt__forserdsc_Jsonclick ;
   private String edtavPrecios_cliente_sdt__forcolnum_Jsonclick ;
   private String edtavPrecios_cliente_sdt__tipcolcod_Jsonclick ;
   private String edtavPrecios_cliente_sdt__forcolnom_Jsonclick ;
   private String edtavPrecios_cliente_sdt__fornomcli_Jsonclick ;
   private String edtavPrecios_cliente_sdt__intdsc_Jsonclick ;
   private String edtavPrecios_cliente_sdt__grdtipart_Jsonclick ;
   private String edtavPrompt_gximage ;
   private String sImgUrl ;
   private String edtavPrecios_cliente_sdt__cr_Jsonclick ;
   private String edtavPrecios_cliente_sdt__forcan_Jsonclick ;
   private String edtavPrecios_cliente_sdt__pc_Jsonclick ;
   private String edtavPrecios_cliente_sdt__mv_Jsonclick ;
   private String edtavPrecios_cliente_sdt__pv_Jsonclick ;
   private String edtavPrecios_cliente_sdt__newprekgm_Jsonclick ;
   private String edtavPrecios_cliente_sdt__obs_Jsonclick ;
   private String edtavPrecios_cliente_sdt__forprefec_Jsonclick ;
   private String edtavPrecios_cliente_sdt__forfecant_Jsonclick ;
   private String edtavPrecios_cliente_sdt__c_m_Jsonclick ;
   private String edtavPrecios_cliente_sdt__cm_Jsonclick ;
   private String edtavPrecios_cliente_sdt__fi_Jsonclick ;
   private String edtavPrecios_cliente_sdt__ti_Jsonclick ;
   private String edtavPrecios_cliente_sdt__mc_Jsonclick ;
   private String edtavPrecios_cliente_sdt__f_i_Jsonclick ;
   private String edtavPrecios_cliente_sdt__tipartdsc_Jsonclick ;
   private String edtavPrecios_cliente_sdt__artdsc_Jsonclick ;
   private String edtavPrecios_cliente_sdt__fortonal_Jsonclick ;
   private String edtavPrecios_cliente_sdt__fam_cod_Jsonclick ;
   private String edtavPrecios_cliente_sdt__forcosuti_Jsonclick ;
   private String edtavPrecios_cliente_sdt__oldclasse_Jsonclick ;
   private String edtavPrecios_cliente_sdt__fornumcol_Jsonclick ;
   private String edtavPrecios_cliente_sdt__forrelban_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV78OrderedDsc ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Dvpanel_unnamedtable2_Autowidth ;
   private boolean Dvpanel_unnamedtable2_Autoheight ;
   private boolean Dvpanel_unnamedtable2_Collapsible ;
   private boolean Dvpanel_unnamedtable2_Collapsed ;
   private boolean Dvpanel_unnamedtable2_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable2_Autoscroll ;
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
   private boolean bGXsfl_89_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_BV89 ;
   private boolean gx_refresh_fired ;
   private boolean AV50seleccionar ;
   private boolean AV43Prompt_IsBlob ;
   private String AV16ColumnsSelectorXML ;
   private String AV37Precios_cliente_Json ;
   private String AV17UserCustomValue ;
   private String AV54Precios_cliente_mail_Json ;
   private String AV126Prompt_GXI ;
   private String AV14ExcelFilename ;
   private String AV15ErrorMessage ;
   private String AV43Prompt ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV20Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_btnrecalculo ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_btnconformeprecios ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkavSp ;
   private ICheckbox chkavPrecios_cliente_sdt__seleccionar ;
   private HTMLChoice cmbavPrecios_cliente_sdt__clitipo ;
   private com.genexus.webpanels.WebSession AV38WebSession ;
   private GXBaseCollection<app.facturacion.SdtPrecios_cliente_mail_SDT_Item> AV51Precios_cliente_mail_SDT ;
   private GXBaseCollection<app.facturacion.SdtPrecios_cliente_SDT_Item> AV13Precios_cliente_SDT ;
   private GXBaseCollection<app.facturacion.SdtPrecios_cliente_SDT_Item> GXt_objcol_SdtPrecios_cliente_SDT_Item7 ;
   private GXBaseCollection<app.facturacion.SdtPrecios_cliente_SDT_Item> GXv_objcol_SdtPrecios_cliente_SDT_Item8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV18ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV19ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector10[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector11[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV24DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.facturacion.SdtPrecios_cliente_mail_SDT_Item AV52Precios_cliente_mail_SDT_item ;
   private app.facturacion.SdtPrecios_cliente_SDT_Item AV45Precios_cliente_SDT_item ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
}

