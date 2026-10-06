package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class consumoprdquimicos_wc_impl extends GXWebComponent
{
   public consumoprdquimicos_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public consumoprdquimicos_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consumoprdquimicos_wc_impl.class ));
   }

   public consumoprdquimicos_wc_impl( int remoteHandle ,
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
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( nGotPars == 0 )
         {
            entryPointCalled = false ;
            gxfirstwebparm = httpContext.GetFirstPar( "Anyo") ;
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
               AV5Anyo = (short)(GXutil.lval( httpContext.GetPar( "Anyo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Anyo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5Anyo), 4, 0));
               AV6MesI = (byte)(GXutil.lval( httpContext.GetPar( "MesI"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6MesI", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6MesI), 2, 0));
               AV7MesF = (byte)(GXutil.lval( httpContext.GetPar( "MesF"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7MesF", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7MesF), 2, 0));
               AV51Opcion = (byte)(GXutil.lval( httpContext.GetPar( "Opcion"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51Opcion", GXutil.str( AV51Opcion, 1, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,Short.valueOf(AV5Anyo),Byte.valueOf(AV6MesI),Byte.valueOf(AV7MesF),Byte.valueOf(AV51Opcion)});
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
               gxfirstwebparm = httpContext.GetFirstPar( "Anyo") ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
            {
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxfirstwebparm = httpContext.GetFirstPar( "Anyo") ;
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
      nRC_GXsfl_40 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_40"))) ;
      nGXsfl_40_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_40_idx"))) ;
      sGXsfl_40_idx = httpContext.GetPar( "sGXsfl_40_idx") ;
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
      AV18FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV54PrdNumFrom = httpContext.GetPar( "PrdNumFrom") ;
      AV55PrdNumTo = httpContext.GetPar( "PrdNumTo") ;
      AV51Opcion = (byte)(GXutil.lval( httpContext.GetPar( "Opcion"))) ;
      AV28ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV23ColumnsSelector);
      AV29TFEmprCod = httpContext.GetPar( "TFEmprCod") ;
      AV30TFEmprCod_Sel = httpContext.GetPar( "TFEmprCod_Sel") ;
      AV31TFPrdNum = httpContext.GetPar( "TFPrdNum") ;
      AV32TFPrdNum_Sel = httpContext.GetPar( "TFPrdNum_Sel") ;
      AV33TFPrdAny = (short)(GXutil.lval( httpContext.GetPar( "TFPrdAny"))) ;
      AV34TFPrdAny_To = (short)(GXutil.lval( httpContext.GetPar( "TFPrdAny_To"))) ;
      AV35TFPrdNumMes = (byte)(GXutil.lval( httpContext.GetPar( "TFPrdNumMes"))) ;
      AV36TFPrdNumMes_To = (byte)(GXutil.lval( httpContext.GetPar( "TFPrdNumMes_To"))) ;
      AV37TFPrdAcuCprA = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdAcuCprA"), ".") ;
      AV38TFPrdAcuCprA_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdAcuCprA_To"), ".") ;
      AV39TFPrdAcuConA = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdAcuConA"), ".") ;
      AV40TFPrdAcuConA_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdAcuConA_To"), ".") ;
      AV41TFPrdValCprA = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdValCprA"), ".") ;
      AV42TFPrdValCprA_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdValCprA_To"), ".") ;
      AV43TFPrdValConA = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdValConA"), ".") ;
      AV44TFPrdValConA_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdValConA_To"), ".") ;
      AV45TFDifValConA = CommonUtil.decimalVal( httpContext.GetPar( "TFDifValConA"), ".") ;
      AV46TFDifValConA_To = CommonUtil.decimalVal( httpContext.GetPar( "TFDifValConA_To"), ".") ;
      AV81Pgmname = httpContext.GetPar( "Pgmname") ;
      AV15OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV16OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV18FilterFullText, AV54PrdNumFrom, AV55PrdNumTo, AV51Opcion, AV28ManageFiltersExecutionStep, AV23ColumnsSelector, AV29TFEmprCod, AV30TFEmprCod_Sel, AV31TFPrdNum, AV32TFPrdNum_Sel, AV33TFPrdAny, AV34TFPrdAny_To, AV35TFPrdNumMes, AV36TFPrdNumMes_To, AV37TFPrdAcuCprA, AV38TFPrdAcuCprA_To, AV39TFPrdAcuConA, AV40TFPrdAcuConA_To, AV41TFPrdValCprA, AV42TFPrdValCprA_To, AV43TFPrdValConA, AV44TFPrdValConA_To, AV45TFDifValConA, AV46TFDifValConA_To, AV81Pgmname, AV15OrderedBy, AV16OrderedDsc, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1MM2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( " ESTADISTICA DE PRODUCTOS", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.consumoprdquimicos_wc", new String[] {GXutil.URLEncode(GXutil.ltrimstr(AV5Anyo,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV6MesI,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7MesF,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV51Opcion,1,0))}, new String[] {"Anyo","MesI","MesF","Opcion"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV81Pgmname, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vFILTERFULLTEXT", AV18FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_40", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_40, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV26ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV26ManageFiltersData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV47DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV47DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV23ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV23ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV5Anyo", GXutil.ltrim( localUtil.ntoc( wcpOAV5Anyo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV6MesI", GXutil.ltrim( localUtil.ntoc( wcpOAV6MesI, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7MesF", GXutil.ltrim( localUtil.ntoc( wcpOAV7MesF, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV51Opcion", GXutil.ltrim( localUtil.ntoc( wcpOAV51Opcion, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV28ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFEMPRCOD", GXutil.rtrim( AV29TFEmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFEMPRCOD_SEL", GXutil.rtrim( AV30TFEmprCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNUM", GXutil.rtrim( AV31TFPrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNUM_SEL", GXutil.rtrim( AV32TFPrdNum_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDANY", GXutil.ltrim( localUtil.ntoc( AV33TFPrdAny, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDANY_TO", GXutil.ltrim( localUtil.ntoc( AV34TFPrdAny_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNUMMES", GXutil.ltrim( localUtil.ntoc( AV35TFPrdNumMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNUMMES_TO", GXutil.ltrim( localUtil.ntoc( AV36TFPrdNumMes_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDACUCPRA", GXutil.ltrim( localUtil.ntoc( AV37TFPrdAcuCprA, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDACUCPRA_TO", GXutil.ltrim( localUtil.ntoc( AV38TFPrdAcuCprA_To, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDACUCONA", GXutil.ltrim( localUtil.ntoc( AV39TFPrdAcuConA, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDACUCONA_TO", GXutil.ltrim( localUtil.ntoc( AV40TFPrdAcuConA_To, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDVALCPRA", GXutil.ltrim( localUtil.ntoc( AV41TFPrdValCprA, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDVALCPRA_TO", GXutil.ltrim( localUtil.ntoc( AV42TFPrdValCprA_To, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDVALCONA", GXutil.ltrim( localUtil.ntoc( AV43TFPrdValConA, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDVALCONA_TO", GXutil.ltrim( localUtil.ntoc( AV44TFPrdValConA_To, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDIFVALCONA", GXutil.ltrim( localUtil.ntoc( AV45TFDifValConA, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDIFVALCONA_TO", GXutil.ltrim( localUtil.ntoc( AV46TFDifValConA_To, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV81Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV81Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV15OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV16OrderedDsc);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV13GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV13GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vANYO", GXutil.ltrim( localUtil.ntoc( AV5Anyo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMESI", GXutil.ltrim( localUtil.ntoc( AV6MesI, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMESF", GXutil.ltrim( localUtil.ntoc( AV7MesF, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vOPCION", GXutil.ltrim( localUtil.ntoc( AV51Opcion, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRDNUMFROM", GXutil.rtrim( AV54PrdNumFrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRDNUMTO", GXutil.rtrim( AV55PrdNumTo));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Icontype", GXutil.rtrim( Ddo_managefilters_Icontype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Icon", GXutil.rtrim( Ddo_managefilters_Icon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Tooltip", GXutil.rtrim( Ddo_managefilters_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Cls", GXutil.rtrim( Ddo_managefilters_Cls));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Infinitescrolling", GXutil.rtrim( Grid_empowerer_Infinitescrolling));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
   }

   public void renderHtmlCloseForm1MM2( )
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
      return "ConsumoPrdQuimicos_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " ESTADISTICA DE PRODUCTOS", "") ;
   }

   public void wb1MM0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.consumoprdquimicos_wc");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 40, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ConsumoPrdQuimicos_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 40, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTREPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ConsumoPrdQuimicos_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 40, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ConsumoPrdQuimicos_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 40, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ConsumoPrdQuimicos_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_25_1MM2( true) ;
      }
      else
      {
         wb_table1_25_1MM2( false) ;
      }
      return  ;
   }

   public void wb_table1_25_1MM2e( boolean wbgen )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 HasGridEmpowerer", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol40( ) ;
      }
      if ( wbEnd == 40 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_40 = (int)(nGXsfl_40_idx-1) ;
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV47DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, sPrefix+"INNEWWINDOW1Container");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV47DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV23ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("InfiniteScrolling", Grid_empowerer_Infinitescrolling);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 40 )
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

   public void start1MM2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( " ESTADISTICA DE PRODUCTOS", ""), (short)(0)) ;
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
            strup1MM0( ) ;
         }
      }
   }

   public void ws1MM2( )
   {
      start1MM2( ) ;
      evt1MM2( ) ;
   }

   public void evt1MM2( )
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
                              strup1MM0( ) ;
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
                        else if ( GXutil.strcmp(sEvt, "DDO_MANAGEFILTERS.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1MM0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e111MM2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1MM0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e121MM2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1MM0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e131MM2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1MM0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e141MM2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTREPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1MM0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportReport' */
                                 e151MM2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1MM0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e161MM2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1MM0( ) ;
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
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1MM0( ) ;
                           }
                           AV62Consumoprdquimicos_wcds_1_filterfulltext = AV18FilterFullText ;
                           AV63Consumoprdquimicos_wcds_2_tfemprcod = AV29TFEmprCod ;
                           AV64Consumoprdquimicos_wcds_3_tfemprcod_sel = AV30TFEmprCod_Sel ;
                           AV65Consumoprdquimicos_wcds_4_tfprdnum = AV31TFPrdNum ;
                           AV66Consumoprdquimicos_wcds_5_tfprdnum_sel = AV32TFPrdNum_Sel ;
                           AV67Consumoprdquimicos_wcds_6_tfprdany = AV33TFPrdAny ;
                           AV68Consumoprdquimicos_wcds_7_tfprdany_to = AV34TFPrdAny_To ;
                           AV69Consumoprdquimicos_wcds_8_tfprdnummes = AV35TFPrdNumMes ;
                           AV70Consumoprdquimicos_wcds_9_tfprdnummes_to = AV36TFPrdNumMes_To ;
                           AV71Consumoprdquimicos_wcds_10_tfprdacucpra = AV37TFPrdAcuCprA ;
                           AV72Consumoprdquimicos_wcds_11_tfprdacucpra_to = AV38TFPrdAcuCprA_To ;
                           AV73Consumoprdquimicos_wcds_12_tfprdacucona = AV39TFPrdAcuConA ;
                           AV74Consumoprdquimicos_wcds_13_tfprdacucona_to = AV40TFPrdAcuConA_To ;
                           AV75Consumoprdquimicos_wcds_14_tfprdvalcpra = AV41TFPrdValCprA ;
                           AV76Consumoprdquimicos_wcds_15_tfprdvalcpra_to = AV42TFPrdValCprA_To ;
                           AV77Consumoprdquimicos_wcds_16_tfprdvalcona = AV43TFPrdValConA ;
                           AV78Consumoprdquimicos_wcds_17_tfprdvalcona_to = AV44TFPrdValConA_To ;
                           AV79Consumoprdquimicos_wcds_18_tfdifvalcona = AV45TFDifValConA ;
                           AV80Consumoprdquimicos_wcds_19_tfdifvalcona_to = AV46TFDifValConA_To ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1MM0( ) ;
                           }
                           nGXsfl_40_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_402( ) ;
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
                           A681PrdAny = (short)(localUtil.ctol( httpContext.cgiGet( edtPrdAny_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A720PrdNumMes = (byte)(localUtil.ctol( httpContext.cgiGet( edtPrdNumMes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A677PrdAcuCprA = localUtil.ctond( httpContext.cgiGet( edtPrdAcuCprA_Internalname)) ;
                           A676PrdAcuConA = localUtil.ctond( httpContext.cgiGet( edtPrdAcuConA_Internalname)) ;
                           A748PrdValCprA = localUtil.ctond( httpContext.cgiGet( edtPrdValCprA_Internalname)) ;
                           A746PrdValConA = localUtil.ctond( httpContext.cgiGet( edtPrdValConA_Internalname)) ;
                           A331DifValConA = localUtil.ctond( httpContext.cgiGet( edtDifValConA_Internalname)) ;
                           n331DifValConA = false ;
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
                                       e171MM2 ();
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
                                       e181MM2 ();
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
                                       e191MM2 ();
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
                                          if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV18FilterFullText) != 0 )
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
                                    strup1MM0( ) ;
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
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we1MM2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1MM2( ) ;
         }
      }
   }

   public void pa1MM2( )
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
      subsflControlProps_402( ) ;
      while ( nGXsfl_40_idx <= nRC_GXsfl_40 )
      {
         sendrow_402( ) ;
         nGXsfl_40_idx = ((subGrid_Islastpage==1)&&(nGXsfl_40_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_40_idx+1) ;
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_402( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV18FilterFullText ,
                                 String AV54PrdNumFrom ,
                                 String AV55PrdNumTo ,
                                 byte AV51Opcion ,
                                 byte AV28ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelector ,
                                 String AV29TFEmprCod ,
                                 String AV30TFEmprCod_Sel ,
                                 String AV31TFPrdNum ,
                                 String AV32TFPrdNum_Sel ,
                                 short AV33TFPrdAny ,
                                 short AV34TFPrdAny_To ,
                                 byte AV35TFPrdNumMes ,
                                 byte AV36TFPrdNumMes_To ,
                                 java.math.BigDecimal AV37TFPrdAcuCprA ,
                                 java.math.BigDecimal AV38TFPrdAcuCprA_To ,
                                 java.math.BigDecimal AV39TFPrdAcuConA ,
                                 java.math.BigDecimal AV40TFPrdAcuConA_To ,
                                 java.math.BigDecimal AV41TFPrdValCprA ,
                                 java.math.BigDecimal AV42TFPrdValCprA_To ,
                                 java.math.BigDecimal AV43TFPrdValConA ,
                                 java.math.BigDecimal AV44TFPrdValConA_To ,
                                 java.math.BigDecimal AV45TFDifValConA ,
                                 java.math.BigDecimal AV46TFDifValConA_To ,
                                 String AV81Pgmname ,
                                 short AV15OrderedBy ,
                                 boolean AV16OrderedDsc ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e181MM2 ();
      GRID_nCurrentRecord = 0 ;
      rf1MM2( ) ;
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
      GRID_nFirstRecordOnPage = 0 ;
      GRID_nCurrentRecord = 0 ;
      GXCCtl = "GRID_nFirstRecordOnPage_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      send_integrity_hashes( ) ;
      rf1MM2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV81Pgmname = "ConsumoPrdQuimicos_WC" ;
      Gx_err = (short)(0) ;
   }

   public void rf1MM2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(40) ;
      /* Execute user event: Refresh */
      e181MM2 ();
      nGXsfl_40_idx = (int)(1+GRID_nFirstRecordOnPage) ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_402( ) ;
      bGXsfl_40_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
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
         subsflControlProps_402( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV62Consumoprdquimicos_wcds_1_filterfulltext ,
                                              AV64Consumoprdquimicos_wcds_3_tfemprcod_sel ,
                                              AV63Consumoprdquimicos_wcds_2_tfemprcod ,
                                              AV66Consumoprdquimicos_wcds_5_tfprdnum_sel ,
                                              AV65Consumoprdquimicos_wcds_4_tfprdnum ,
                                              Short.valueOf(AV67Consumoprdquimicos_wcds_6_tfprdany) ,
                                              Short.valueOf(AV68Consumoprdquimicos_wcds_7_tfprdany_to) ,
                                              Byte.valueOf(AV69Consumoprdquimicos_wcds_8_tfprdnummes) ,
                                              Byte.valueOf(AV70Consumoprdquimicos_wcds_9_tfprdnummes_to) ,
                                              AV71Consumoprdquimicos_wcds_10_tfprdacucpra ,
                                              AV72Consumoprdquimicos_wcds_11_tfprdacucpra_to ,
                                              AV73Consumoprdquimicos_wcds_12_tfprdacucona ,
                                              AV74Consumoprdquimicos_wcds_13_tfprdacucona_to ,
                                              AV75Consumoprdquimicos_wcds_14_tfprdvalcpra ,
                                              AV76Consumoprdquimicos_wcds_15_tfprdvalcpra_to ,
                                              AV77Consumoprdquimicos_wcds_16_tfprdvalcona ,
                                              AV78Consumoprdquimicos_wcds_17_tfprdvalcona_to ,
                                              AV79Consumoprdquimicos_wcds_18_tfdifvalcona ,
                                              AV80Consumoprdquimicos_wcds_19_tfdifvalcona_to ,
                                              Byte.valueOf(AV51Opcion) ,
                                              A396EmprCod ,
                                              A719PrdNum ,
                                              Short.valueOf(A681PrdAny) ,
                                              Byte.valueOf(A720PrdNumMes) ,
                                              A677PrdAcuCprA ,
                                              A676PrdAcuConA ,
                                              A748PrdValCprA ,
                                              A746PrdValConA ,
                                              A331DifValConA ,
                                              AV54PrdNumFrom ,
                                              AV55PrdNumTo ,
                                              Short.valueOf(AV15OrderedBy) ,
                                              Boolean.valueOf(AV16OrderedDsc) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                              }
         });
         lV63Consumoprdquimicos_wcds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV63Consumoprdquimicos_wcds_2_tfemprcod), 3, "%") ;
         lV65Consumoprdquimicos_wcds_4_tfprdnum = GXutil.padr( GXutil.rtrim( AV65Consumoprdquimicos_wcds_4_tfprdnum), 6, "%") ;
         /* Using cursor H01MM3 */
         pr_default.execute(0, new Object[] {lV63Consumoprdquimicos_wcds_2_tfemprcod, AV64Consumoprdquimicos_wcds_3_tfemprcod_sel, lV65Consumoprdquimicos_wcds_4_tfprdnum, AV66Consumoprdquimicos_wcds_5_tfprdnum_sel, Short.valueOf(AV67Consumoprdquimicos_wcds_6_tfprdany), Short.valueOf(AV68Consumoprdquimicos_wcds_7_tfprdany_to), AV71Consumoprdquimicos_wcds_10_tfprdacucpra, AV72Consumoprdquimicos_wcds_11_tfprdacucpra_to, AV73Consumoprdquimicos_wcds_12_tfprdacucona, AV74Consumoprdquimicos_wcds_13_tfprdacucona_to, AV75Consumoprdquimicos_wcds_14_tfprdvalcpra, AV76Consumoprdquimicos_wcds_15_tfprdvalcpra_to, AV77Consumoprdquimicos_wcds_16_tfprdvalcona, AV78Consumoprdquimicos_wcds_17_tfprdvalcona_to, AV79Consumoprdquimicos_wcds_18_tfdifvalcona, AV80Consumoprdquimicos_wcds_19_tfdifvalcona_to, AV54PrdNumFrom, AV55PrdNumTo, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_40_idx = (int)(1+GRID_nFirstRecordOnPage) ;
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_402( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A331DifValConA = H01MM3_A331DifValConA[0] ;
            n331DifValConA = H01MM3_n331DifValConA[0] ;
            A676PrdAcuConA = H01MM3_A676PrdAcuConA[0] ;
            A681PrdAny = H01MM3_A681PrdAny[0] ;
            A719PrdNum = H01MM3_A719PrdNum[0] ;
            A396EmprCod = H01MM3_A396EmprCod[0] ;
            A746PrdValConA = H01MM3_A746PrdValConA[0] ;
            A748PrdValCprA = H01MM3_A748PrdValCprA[0] ;
            A677PrdAcuCprA = H01MM3_A677PrdAcuCprA[0] ;
            A746PrdValConA = H01MM3_A746PrdValConA[0] ;
            A748PrdValCprA = H01MM3_A748PrdValCprA[0] ;
            A677PrdAcuCprA = H01MM3_A677PrdAcuCprA[0] ;
            e191MM2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(40) ;
         wb1MM0( ) ;
      }
      bGXsfl_40_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1MM2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV81Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV81Pgmname, ""))));
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
      AV62Consumoprdquimicos_wcds_1_filterfulltext = AV18FilterFullText ;
      AV63Consumoprdquimicos_wcds_2_tfemprcod = AV29TFEmprCod ;
      AV64Consumoprdquimicos_wcds_3_tfemprcod_sel = AV30TFEmprCod_Sel ;
      AV65Consumoprdquimicos_wcds_4_tfprdnum = AV31TFPrdNum ;
      AV66Consumoprdquimicos_wcds_5_tfprdnum_sel = AV32TFPrdNum_Sel ;
      AV67Consumoprdquimicos_wcds_6_tfprdany = AV33TFPrdAny ;
      AV68Consumoprdquimicos_wcds_7_tfprdany_to = AV34TFPrdAny_To ;
      AV69Consumoprdquimicos_wcds_8_tfprdnummes = AV35TFPrdNumMes ;
      AV70Consumoprdquimicos_wcds_9_tfprdnummes_to = AV36TFPrdNumMes_To ;
      AV71Consumoprdquimicos_wcds_10_tfprdacucpra = AV37TFPrdAcuCprA ;
      AV72Consumoprdquimicos_wcds_11_tfprdacucpra_to = AV38TFPrdAcuCprA_To ;
      AV73Consumoprdquimicos_wcds_12_tfprdacucona = AV39TFPrdAcuConA ;
      AV74Consumoprdquimicos_wcds_13_tfprdacucona_to = AV40TFPrdAcuConA_To ;
      AV75Consumoprdquimicos_wcds_14_tfprdvalcpra = AV41TFPrdValCprA ;
      AV76Consumoprdquimicos_wcds_15_tfprdvalcpra_to = AV42TFPrdValCprA_To ;
      AV77Consumoprdquimicos_wcds_16_tfprdvalcona = AV43TFPrdValConA ;
      AV78Consumoprdquimicos_wcds_17_tfprdvalcona_to = AV44TFPrdValConA_To ;
      AV79Consumoprdquimicos_wcds_18_tfdifvalcona = AV45TFDifValConA ;
      AV80Consumoprdquimicos_wcds_19_tfdifvalcona_to = AV46TFDifValConA_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV62Consumoprdquimicos_wcds_1_filterfulltext ,
                                           AV64Consumoprdquimicos_wcds_3_tfemprcod_sel ,
                                           AV63Consumoprdquimicos_wcds_2_tfemprcod ,
                                           AV66Consumoprdquimicos_wcds_5_tfprdnum_sel ,
                                           AV65Consumoprdquimicos_wcds_4_tfprdnum ,
                                           Short.valueOf(AV67Consumoprdquimicos_wcds_6_tfprdany) ,
                                           Short.valueOf(AV68Consumoprdquimicos_wcds_7_tfprdany_to) ,
                                           Byte.valueOf(AV69Consumoprdquimicos_wcds_8_tfprdnummes) ,
                                           Byte.valueOf(AV70Consumoprdquimicos_wcds_9_tfprdnummes_to) ,
                                           AV71Consumoprdquimicos_wcds_10_tfprdacucpra ,
                                           AV72Consumoprdquimicos_wcds_11_tfprdacucpra_to ,
                                           AV73Consumoprdquimicos_wcds_12_tfprdacucona ,
                                           AV74Consumoprdquimicos_wcds_13_tfprdacucona_to ,
                                           AV75Consumoprdquimicos_wcds_14_tfprdvalcpra ,
                                           AV76Consumoprdquimicos_wcds_15_tfprdvalcpra_to ,
                                           AV77Consumoprdquimicos_wcds_16_tfprdvalcona ,
                                           AV78Consumoprdquimicos_wcds_17_tfprdvalcona_to ,
                                           AV79Consumoprdquimicos_wcds_18_tfdifvalcona ,
                                           AV80Consumoprdquimicos_wcds_19_tfdifvalcona_to ,
                                           Byte.valueOf(AV51Opcion) ,
                                           A396EmprCod ,
                                           A719PrdNum ,
                                           Short.valueOf(A681PrdAny) ,
                                           Byte.valueOf(A720PrdNumMes) ,
                                           A677PrdAcuCprA ,
                                           A676PrdAcuConA ,
                                           A748PrdValCprA ,
                                           A746PrdValConA ,
                                           A331DifValConA ,
                                           AV54PrdNumFrom ,
                                           AV55PrdNumTo ,
                                           Short.valueOf(AV15OrderedBy) ,
                                           Boolean.valueOf(AV16OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV63Consumoprdquimicos_wcds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV63Consumoprdquimicos_wcds_2_tfemprcod), 3, "%") ;
      lV65Consumoprdquimicos_wcds_4_tfprdnum = GXutil.padr( GXutil.rtrim( AV65Consumoprdquimicos_wcds_4_tfprdnum), 6, "%") ;
      /* Using cursor H01MM5 */
      pr_default.execute(1, new Object[] {lV63Consumoprdquimicos_wcds_2_tfemprcod, AV64Consumoprdquimicos_wcds_3_tfemprcod_sel, lV65Consumoprdquimicos_wcds_4_tfprdnum, AV66Consumoprdquimicos_wcds_5_tfprdnum_sel, Short.valueOf(AV67Consumoprdquimicos_wcds_6_tfprdany), Short.valueOf(AV68Consumoprdquimicos_wcds_7_tfprdany_to), AV71Consumoprdquimicos_wcds_10_tfprdacucpra, AV72Consumoprdquimicos_wcds_11_tfprdacucpra_to, AV73Consumoprdquimicos_wcds_12_tfprdacucona, AV74Consumoprdquimicos_wcds_13_tfprdacucona_to, AV75Consumoprdquimicos_wcds_14_tfprdvalcpra, AV76Consumoprdquimicos_wcds_15_tfprdvalcpra_to, AV77Consumoprdquimicos_wcds_16_tfprdvalcona, AV78Consumoprdquimicos_wcds_17_tfprdvalcona_to, AV79Consumoprdquimicos_wcds_18_tfdifvalcona, AV80Consumoprdquimicos_wcds_19_tfdifvalcona_to, AV54PrdNumFrom, AV55PrdNumTo});
      GRID_nRecordCount = H01MM5_AGRID_nRecordCount[0] ;
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
      AV62Consumoprdquimicos_wcds_1_filterfulltext = AV18FilterFullText ;
      AV63Consumoprdquimicos_wcds_2_tfemprcod = AV29TFEmprCod ;
      AV64Consumoprdquimicos_wcds_3_tfemprcod_sel = AV30TFEmprCod_Sel ;
      AV65Consumoprdquimicos_wcds_4_tfprdnum = AV31TFPrdNum ;
      AV66Consumoprdquimicos_wcds_5_tfprdnum_sel = AV32TFPrdNum_Sel ;
      AV67Consumoprdquimicos_wcds_6_tfprdany = AV33TFPrdAny ;
      AV68Consumoprdquimicos_wcds_7_tfprdany_to = AV34TFPrdAny_To ;
      AV69Consumoprdquimicos_wcds_8_tfprdnummes = AV35TFPrdNumMes ;
      AV70Consumoprdquimicos_wcds_9_tfprdnummes_to = AV36TFPrdNumMes_To ;
      AV71Consumoprdquimicos_wcds_10_tfprdacucpra = AV37TFPrdAcuCprA ;
      AV72Consumoprdquimicos_wcds_11_tfprdacucpra_to = AV38TFPrdAcuCprA_To ;
      AV73Consumoprdquimicos_wcds_12_tfprdacucona = AV39TFPrdAcuConA ;
      AV74Consumoprdquimicos_wcds_13_tfprdacucona_to = AV40TFPrdAcuConA_To ;
      AV75Consumoprdquimicos_wcds_14_tfprdvalcpra = AV41TFPrdValCprA ;
      AV76Consumoprdquimicos_wcds_15_tfprdvalcpra_to = AV42TFPrdValCprA_To ;
      AV77Consumoprdquimicos_wcds_16_tfprdvalcona = AV43TFPrdValConA ;
      AV78Consumoprdquimicos_wcds_17_tfprdvalcona_to = AV44TFPrdValConA_To ;
      AV79Consumoprdquimicos_wcds_18_tfdifvalcona = AV45TFDifValConA ;
      AV80Consumoprdquimicos_wcds_19_tfdifvalcona_to = AV46TFDifValConA_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV18FilterFullText, AV54PrdNumFrom, AV55PrdNumTo, AV51Opcion, AV28ManageFiltersExecutionStep, AV23ColumnsSelector, AV29TFEmprCod, AV30TFEmprCod_Sel, AV31TFPrdNum, AV32TFPrdNum_Sel, AV33TFPrdAny, AV34TFPrdAny_To, AV35TFPrdNumMes, AV36TFPrdNumMes_To, AV37TFPrdAcuCprA, AV38TFPrdAcuCprA_To, AV39TFPrdAcuConA, AV40TFPrdAcuConA_To, AV41TFPrdValCprA, AV42TFPrdValCprA_To, AV43TFPrdValConA, AV44TFPrdValConA_To, AV45TFDifValConA, AV46TFDifValConA_To, AV81Pgmname, AV15OrderedBy, AV16OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV62Consumoprdquimicos_wcds_1_filterfulltext = AV18FilterFullText ;
      AV63Consumoprdquimicos_wcds_2_tfemprcod = AV29TFEmprCod ;
      AV64Consumoprdquimicos_wcds_3_tfemprcod_sel = AV30TFEmprCod_Sel ;
      AV65Consumoprdquimicos_wcds_4_tfprdnum = AV31TFPrdNum ;
      AV66Consumoprdquimicos_wcds_5_tfprdnum_sel = AV32TFPrdNum_Sel ;
      AV67Consumoprdquimicos_wcds_6_tfprdany = AV33TFPrdAny ;
      AV68Consumoprdquimicos_wcds_7_tfprdany_to = AV34TFPrdAny_To ;
      AV69Consumoprdquimicos_wcds_8_tfprdnummes = AV35TFPrdNumMes ;
      AV70Consumoprdquimicos_wcds_9_tfprdnummes_to = AV36TFPrdNumMes_To ;
      AV71Consumoprdquimicos_wcds_10_tfprdacucpra = AV37TFPrdAcuCprA ;
      AV72Consumoprdquimicos_wcds_11_tfprdacucpra_to = AV38TFPrdAcuCprA_To ;
      AV73Consumoprdquimicos_wcds_12_tfprdacucona = AV39TFPrdAcuConA ;
      AV74Consumoprdquimicos_wcds_13_tfprdacucona_to = AV40TFPrdAcuConA_To ;
      AV75Consumoprdquimicos_wcds_14_tfprdvalcpra = AV41TFPrdValCprA ;
      AV76Consumoprdquimicos_wcds_15_tfprdvalcpra_to = AV42TFPrdValCprA_To ;
      AV77Consumoprdquimicos_wcds_16_tfprdvalcona = AV43TFPrdValConA ;
      AV78Consumoprdquimicos_wcds_17_tfprdvalcona_to = AV44TFPrdValConA_To ;
      AV79Consumoprdquimicos_wcds_18_tfdifvalcona = AV45TFDifValConA ;
      AV80Consumoprdquimicos_wcds_19_tfdifvalcona_to = AV46TFDifValConA_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV18FilterFullText, AV54PrdNumFrom, AV55PrdNumTo, AV51Opcion, AV28ManageFiltersExecutionStep, AV23ColumnsSelector, AV29TFEmprCod, AV30TFEmprCod_Sel, AV31TFPrdNum, AV32TFPrdNum_Sel, AV33TFPrdAny, AV34TFPrdAny_To, AV35TFPrdNumMes, AV36TFPrdNumMes_To, AV37TFPrdAcuCprA, AV38TFPrdAcuCprA_To, AV39TFPrdAcuConA, AV40TFPrdAcuConA_To, AV41TFPrdValCprA, AV42TFPrdValCprA_To, AV43TFPrdValConA, AV44TFPrdValConA_To, AV45TFDifValConA, AV46TFDifValConA_To, AV81Pgmname, AV15OrderedBy, AV16OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV62Consumoprdquimicos_wcds_1_filterfulltext = AV18FilterFullText ;
      AV63Consumoprdquimicos_wcds_2_tfemprcod = AV29TFEmprCod ;
      AV64Consumoprdquimicos_wcds_3_tfemprcod_sel = AV30TFEmprCod_Sel ;
      AV65Consumoprdquimicos_wcds_4_tfprdnum = AV31TFPrdNum ;
      AV66Consumoprdquimicos_wcds_5_tfprdnum_sel = AV32TFPrdNum_Sel ;
      AV67Consumoprdquimicos_wcds_6_tfprdany = AV33TFPrdAny ;
      AV68Consumoprdquimicos_wcds_7_tfprdany_to = AV34TFPrdAny_To ;
      AV69Consumoprdquimicos_wcds_8_tfprdnummes = AV35TFPrdNumMes ;
      AV70Consumoprdquimicos_wcds_9_tfprdnummes_to = AV36TFPrdNumMes_To ;
      AV71Consumoprdquimicos_wcds_10_tfprdacucpra = AV37TFPrdAcuCprA ;
      AV72Consumoprdquimicos_wcds_11_tfprdacucpra_to = AV38TFPrdAcuCprA_To ;
      AV73Consumoprdquimicos_wcds_12_tfprdacucona = AV39TFPrdAcuConA ;
      AV74Consumoprdquimicos_wcds_13_tfprdacucona_to = AV40TFPrdAcuConA_To ;
      AV75Consumoprdquimicos_wcds_14_tfprdvalcpra = AV41TFPrdValCprA ;
      AV76Consumoprdquimicos_wcds_15_tfprdvalcpra_to = AV42TFPrdValCprA_To ;
      AV77Consumoprdquimicos_wcds_16_tfprdvalcona = AV43TFPrdValConA ;
      AV78Consumoprdquimicos_wcds_17_tfprdvalcona_to = AV44TFPrdValConA_To ;
      AV79Consumoprdquimicos_wcds_18_tfdifvalcona = AV45TFDifValConA ;
      AV80Consumoprdquimicos_wcds_19_tfdifvalcona_to = AV46TFDifValConA_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV18FilterFullText, AV54PrdNumFrom, AV55PrdNumTo, AV51Opcion, AV28ManageFiltersExecutionStep, AV23ColumnsSelector, AV29TFEmprCod, AV30TFEmprCod_Sel, AV31TFPrdNum, AV32TFPrdNum_Sel, AV33TFPrdAny, AV34TFPrdAny_To, AV35TFPrdNumMes, AV36TFPrdNumMes_To, AV37TFPrdAcuCprA, AV38TFPrdAcuCprA_To, AV39TFPrdAcuConA, AV40TFPrdAcuConA_To, AV41TFPrdValCprA, AV42TFPrdValCprA_To, AV43TFPrdValConA, AV44TFPrdValConA_To, AV45TFDifValConA, AV46TFDifValConA_To, AV81Pgmname, AV15OrderedBy, AV16OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV62Consumoprdquimicos_wcds_1_filterfulltext = AV18FilterFullText ;
      AV63Consumoprdquimicos_wcds_2_tfemprcod = AV29TFEmprCod ;
      AV64Consumoprdquimicos_wcds_3_tfemprcod_sel = AV30TFEmprCod_Sel ;
      AV65Consumoprdquimicos_wcds_4_tfprdnum = AV31TFPrdNum ;
      AV66Consumoprdquimicos_wcds_5_tfprdnum_sel = AV32TFPrdNum_Sel ;
      AV67Consumoprdquimicos_wcds_6_tfprdany = AV33TFPrdAny ;
      AV68Consumoprdquimicos_wcds_7_tfprdany_to = AV34TFPrdAny_To ;
      AV69Consumoprdquimicos_wcds_8_tfprdnummes = AV35TFPrdNumMes ;
      AV70Consumoprdquimicos_wcds_9_tfprdnummes_to = AV36TFPrdNumMes_To ;
      AV71Consumoprdquimicos_wcds_10_tfprdacucpra = AV37TFPrdAcuCprA ;
      AV72Consumoprdquimicos_wcds_11_tfprdacucpra_to = AV38TFPrdAcuCprA_To ;
      AV73Consumoprdquimicos_wcds_12_tfprdacucona = AV39TFPrdAcuConA ;
      AV74Consumoprdquimicos_wcds_13_tfprdacucona_to = AV40TFPrdAcuConA_To ;
      AV75Consumoprdquimicos_wcds_14_tfprdvalcpra = AV41TFPrdValCprA ;
      AV76Consumoprdquimicos_wcds_15_tfprdvalcpra_to = AV42TFPrdValCprA_To ;
      AV77Consumoprdquimicos_wcds_16_tfprdvalcona = AV43TFPrdValConA ;
      AV78Consumoprdquimicos_wcds_17_tfprdvalcona_to = AV44TFPrdValConA_To ;
      AV79Consumoprdquimicos_wcds_18_tfdifvalcona = AV45TFDifValConA ;
      AV80Consumoprdquimicos_wcds_19_tfdifvalcona_to = AV46TFDifValConA_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV18FilterFullText, AV54PrdNumFrom, AV55PrdNumTo, AV51Opcion, AV28ManageFiltersExecutionStep, AV23ColumnsSelector, AV29TFEmprCod, AV30TFEmprCod_Sel, AV31TFPrdNum, AV32TFPrdNum_Sel, AV33TFPrdAny, AV34TFPrdAny_To, AV35TFPrdNumMes, AV36TFPrdNumMes_To, AV37TFPrdAcuCprA, AV38TFPrdAcuCprA_To, AV39TFPrdAcuConA, AV40TFPrdAcuConA_To, AV41TFPrdValCprA, AV42TFPrdValCprA_To, AV43TFPrdValConA, AV44TFPrdValConA_To, AV45TFDifValConA, AV46TFDifValConA_To, AV81Pgmname, AV15OrderedBy, AV16OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV62Consumoprdquimicos_wcds_1_filterfulltext = AV18FilterFullText ;
      AV63Consumoprdquimicos_wcds_2_tfemprcod = AV29TFEmprCod ;
      AV64Consumoprdquimicos_wcds_3_tfemprcod_sel = AV30TFEmprCod_Sel ;
      AV65Consumoprdquimicos_wcds_4_tfprdnum = AV31TFPrdNum ;
      AV66Consumoprdquimicos_wcds_5_tfprdnum_sel = AV32TFPrdNum_Sel ;
      AV67Consumoprdquimicos_wcds_6_tfprdany = AV33TFPrdAny ;
      AV68Consumoprdquimicos_wcds_7_tfprdany_to = AV34TFPrdAny_To ;
      AV69Consumoprdquimicos_wcds_8_tfprdnummes = AV35TFPrdNumMes ;
      AV70Consumoprdquimicos_wcds_9_tfprdnummes_to = AV36TFPrdNumMes_To ;
      AV71Consumoprdquimicos_wcds_10_tfprdacucpra = AV37TFPrdAcuCprA ;
      AV72Consumoprdquimicos_wcds_11_tfprdacucpra_to = AV38TFPrdAcuCprA_To ;
      AV73Consumoprdquimicos_wcds_12_tfprdacucona = AV39TFPrdAcuConA ;
      AV74Consumoprdquimicos_wcds_13_tfprdacucona_to = AV40TFPrdAcuConA_To ;
      AV75Consumoprdquimicos_wcds_14_tfprdvalcpra = AV41TFPrdValCprA ;
      AV76Consumoprdquimicos_wcds_15_tfprdvalcpra_to = AV42TFPrdValCprA_To ;
      AV77Consumoprdquimicos_wcds_16_tfprdvalcona = AV43TFPrdValConA ;
      AV78Consumoprdquimicos_wcds_17_tfprdvalcona_to = AV44TFPrdValConA_To ;
      AV79Consumoprdquimicos_wcds_18_tfdifvalcona = AV45TFDifValConA ;
      AV80Consumoprdquimicos_wcds_19_tfdifvalcona_to = AV46TFDifValConA_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV18FilterFullText, AV54PrdNumFrom, AV55PrdNumTo, AV51Opcion, AV28ManageFiltersExecutionStep, AV23ColumnsSelector, AV29TFEmprCod, AV30TFEmprCod_Sel, AV31TFPrdNum, AV32TFPrdNum_Sel, AV33TFPrdAny, AV34TFPrdAny_To, AV35TFPrdNumMes, AV36TFPrdNumMes_To, AV37TFPrdAcuCprA, AV38TFPrdAcuCprA_To, AV39TFPrdAcuConA, AV40TFPrdAcuConA_To, AV41TFPrdValCprA, AV42TFPrdValCprA_To, AV43TFPrdValConA, AV44TFPrdValConA_To, AV45TFDifValConA, AV46TFDifValConA_To, AV81Pgmname, AV15OrderedBy, AV16OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV81Pgmname = "ConsumoPrdQuimicos_WC" ;
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup1MM0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e171MM2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV26ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV47DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV23ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_40 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_40"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV5Anyo = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV5Anyo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV6MesI = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV6MesI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV7MesF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV7MesF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV51Opcion = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV51Opcion"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Ddo_managefilters_Icontype = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Icontype") ;
         Ddo_managefilters_Icon = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Icon") ;
         Ddo_managefilters_Tooltip = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Tooltip") ;
         Ddo_managefilters_Cls = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Cls") ;
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
         Grid_empowerer_Infinitescrolling = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Infinitescrolling") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascolumnsselector")) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedcolumn") ;
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Activeeventkey") ;
         /* Read variables values. */
         AV18FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18FilterFullText", AV18FilterFullText);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV18FilterFullText) != 0 )
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
      e171MM2 ();
      if (returnInSub) return;
   }

   public void e171MM2( )
   {
      /* Start Routine */
      returnInSub = false ;
      if ( AV51Opcion == 2 )
      {
         AV54PrdNumFrom = "100000" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54PrdNumFrom", AV54PrdNumFrom);
         AV55PrdNumTo = "799999" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55PrdNumTo", AV55PrdNumTo);
      }
      else if ( AV51Opcion == 3 )
      {
         AV54PrdNumFrom = "800000" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54PrdNumFrom", AV54PrdNumFrom);
         AV55PrdNumTo = "899999" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55PrdNumTo", AV55PrdNumTo);
      }
      else if ( AV51Opcion == 4 )
      {
         AV54PrdNumFrom = "900000" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54PrdNumFrom", AV54PrdNumFrom);
         AV55PrdNumTo = "999999" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55PrdNumTo", AV55PrdNumTo);
      }
      GXt_char1 = AV58Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      consumoprdquimicos_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV58Station = GXt_char1 ;
      GXv_char2[0] = AV59Emprcod ;
      GXv_char3[0] = AV60Emprnom ;
      GXv_char4[0] = AV61Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV58Station, GXv_char2, GXv_char3, GXv_char4) ;
      consumoprdquimicos_wc_impl.this.AV59Emprcod = GXv_char2[0] ;
      consumoprdquimicos_wc_impl.this.AV60Emprnom = GXv_char3[0] ;
      consumoprdquimicos_wc_impl.this.AV61Usurcod = GXv_char4[0] ;
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      /* Execute user subroutine: 'LOADSAVEDFILTERS' */
      S112 ();
      if (returnInSub) return;
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( AV15OrderedBy < 1 )
      {
         AV15OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV47DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV47DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
   }

   public void e181MM2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV9WWPContext = GXv_SdtWWPContext7[0] ;
      if ( AV28ManageFiltersExecutionStep == 1 )
      {
         AV28ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28ManageFiltersExecutionStep", GXutil.str( AV28ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV28ManageFiltersExecutionStep == 2 )
      {
         AV28ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28ManageFiltersExecutionStep", GXutil.str( AV28ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV25Session.getValue("ConsumoPrdQuimicos_WCColumnsSelector"), "") != 0 )
      {
         AV21ColumnsSelectorXML = AV25Session.getValue("ConsumoPrdQuimicos_WCColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV21ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtEmprCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), !bGXsfl_40_Refreshing);
      edtPrdNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Visible), 5, 0), !bGXsfl_40_Refreshing);
      edtPrdAny_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdAny_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdAny_Visible), 5, 0), !bGXsfl_40_Refreshing);
      edtPrdNumMes_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdNumMes_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNumMes_Visible), 5, 0), !bGXsfl_40_Refreshing);
      edtPrdAcuCprA_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdAcuCprA_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdAcuCprA_Visible), 5, 0), !bGXsfl_40_Refreshing);
      edtPrdAcuConA_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdAcuConA_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdAcuConA_Visible), 5, 0), !bGXsfl_40_Refreshing);
      edtPrdValCprA_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdValCprA_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdValCprA_Visible), 5, 0), !bGXsfl_40_Refreshing);
      edtPrdValConA_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdValConA_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdValConA_Visible), 5, 0), !bGXsfl_40_Refreshing);
      edtDifValConA_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDifValConA_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDifValConA_Visible), 5, 0), !bGXsfl_40_Refreshing);
      AV62Consumoprdquimicos_wcds_1_filterfulltext = AV18FilterFullText ;
      AV63Consumoprdquimicos_wcds_2_tfemprcod = AV29TFEmprCod ;
      AV64Consumoprdquimicos_wcds_3_tfemprcod_sel = AV30TFEmprCod_Sel ;
      AV65Consumoprdquimicos_wcds_4_tfprdnum = AV31TFPrdNum ;
      AV66Consumoprdquimicos_wcds_5_tfprdnum_sel = AV32TFPrdNum_Sel ;
      AV67Consumoprdquimicos_wcds_6_tfprdany = AV33TFPrdAny ;
      AV68Consumoprdquimicos_wcds_7_tfprdany_to = AV34TFPrdAny_To ;
      AV69Consumoprdquimicos_wcds_8_tfprdnummes = AV35TFPrdNumMes ;
      AV70Consumoprdquimicos_wcds_9_tfprdnummes_to = AV36TFPrdNumMes_To ;
      AV71Consumoprdquimicos_wcds_10_tfprdacucpra = AV37TFPrdAcuCprA ;
      AV72Consumoprdquimicos_wcds_11_tfprdacucpra_to = AV38TFPrdAcuCprA_To ;
      AV73Consumoprdquimicos_wcds_12_tfprdacucona = AV39TFPrdAcuConA ;
      AV74Consumoprdquimicos_wcds_13_tfprdacucona_to = AV40TFPrdAcuConA_To ;
      AV75Consumoprdquimicos_wcds_14_tfprdvalcpra = AV41TFPrdValCprA ;
      AV76Consumoprdquimicos_wcds_15_tfprdvalcpra_to = AV42TFPrdValCprA_To ;
      AV77Consumoprdquimicos_wcds_16_tfprdvalcona = AV43TFPrdValConA ;
      AV78Consumoprdquimicos_wcds_17_tfprdvalcona_to = AV44TFPrdValConA_To ;
      AV79Consumoprdquimicos_wcds_18_tfdifvalcona = AV45TFDifValConA ;
      AV80Consumoprdquimicos_wcds_19_tfdifvalcona_to = AV46TFDifValConA_To ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ColumnsSelector", AV23ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV26ManageFiltersData", AV26ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV13GridState", AV13GridState);
   }

   public void e121MM2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV15OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15OrderedBy), 4, 0));
         AV16OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16OrderedDsc", AV16OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "EmprCod") == 0 )
         {
            AV29TFEmprCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFEmprCod", AV29TFEmprCod);
            AV30TFEmprCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFEmprCod_Sel", AV30TFEmprCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNum") == 0 )
         {
            AV31TFPrdNum = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFPrdNum", AV31TFPrdNum);
            AV32TFPrdNum_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFPrdNum_Sel", AV32TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdAny") == 0 )
         {
            AV33TFPrdAny = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFPrdAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33TFPrdAny), 4, 0));
            AV34TFPrdAny_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFPrdAny_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFPrdAny_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNumMes") == 0 )
         {
            AV35TFPrdNumMes = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFPrdNumMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFPrdNumMes), 2, 0));
            AV36TFPrdNumMes_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFPrdNumMes_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFPrdNumMes_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdAcuCprA") == 0 )
         {
            AV37TFPrdAcuCprA = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFPrdAcuCprA", GXutil.ltrimstr( AV37TFPrdAcuCprA, 10, 2));
            AV38TFPrdAcuCprA_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFPrdAcuCprA_To", GXutil.ltrimstr( AV38TFPrdAcuCprA_To, 10, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdAcuConA") == 0 )
         {
            AV39TFPrdAcuConA = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFPrdAcuConA", GXutil.ltrimstr( AV39TFPrdAcuConA, 12, 4));
            AV40TFPrdAcuConA_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFPrdAcuConA_To", GXutil.ltrimstr( AV40TFPrdAcuConA_To, 12, 4));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdValCprA") == 0 )
         {
            AV41TFPrdValCprA = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFPrdValCprA", GXutil.ltrimstr( AV41TFPrdValCprA, 12, 2));
            AV42TFPrdValCprA_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFPrdValCprA_To", GXutil.ltrimstr( AV42TFPrdValCprA_To, 12, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdValConA") == 0 )
         {
            AV43TFPrdValConA = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFPrdValConA", GXutil.ltrimstr( AV43TFPrdValConA, 12, 2));
            AV44TFPrdValConA_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFPrdValConA_To", GXutil.ltrimstr( AV44TFPrdValConA_To, 12, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DifValConA") == 0 )
         {
            AV45TFDifValConA = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFDifValConA", GXutil.ltrimstr( AV45TFDifValConA, 12, 2));
            AV46TFDifValConA_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFDifValConA_To", GXutil.ltrimstr( AV46TFDifValConA_To, 12, 2));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e191MM2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(40) ;
      }
      sendrow_402( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_40_Refreshing )
      {
         httpContext.doAjaxLoad(40, GridRow);
      }
   }

   public void e131MM2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV21ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV23ColumnsSelector.fromJSonString(AV21ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "ConsumoPrdQuimicos_WCColumnsSelector", ((GXutil.strcmp("", AV21ColumnsSelectorXML)==0) ? "" : AV23ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ColumnsSelector", AV23ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV26ManageFiltersData", AV26ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV13GridState", AV13GridState);
   }

   public void e111MM2( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S172 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S152 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("ConsumoPrdQuimicos_WCFilters")),GXutil.URLEncode(GXutil.rtrim(AV81Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV28ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28ManageFiltersExecutionStep", GXutil.str( AV28ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("ConsumoPrdQuimicos_WCFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV28ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28ManageFiltersExecutionStep", GXutil.str( AV28ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV27ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "ConsumoPrdQuimicos_WCFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         consumoprdquimicos_wc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV27ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV27ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV81Pgmname+"GridState", AV27ManageFiltersXml) ;
            AV13GridState.fromxml(AV27ManageFiltersXml, null, null);
            AV15OrderedBy = AV13GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15OrderedBy), 4, 0));
            AV16OrderedDsc = AV13GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16OrderedDsc", AV16OrderedDsc);
            /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
            S142 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S182 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV13GridState", AV13GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ColumnsSelector", AV23ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV26ManageFiltersData", AV26ManageFiltersData);
   }

   public void e141MM2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char4[0] = AV19ExcelFilename ;
      GXv_char3[0] = AV20ErrorMessage ;
      new app.consumoprdquimicos_wcexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      consumoprdquimicos_wc_impl.this.AV19ExcelFilename = GXv_char4[0] ;
      consumoprdquimicos_wc_impl.this.AV20ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV19ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV19ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV20ErrorMessage);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV13GridState", AV13GridState);
   }

   public void e151MM2( )
   {
      /* 'DoExportReport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      Innewwindow1_Target = formatLink("app.consumoprdquimicos_wcexportreport", new String[] {}, new String[] {})  ;
      ucInnewwindow1.sendProperty(context, sPrefix, false, Innewwindow1_Internalname, "Target", Innewwindow1_Target);
      Innewwindow1_Height = "600" ;
      ucInnewwindow1.sendProperty(context, sPrefix, false, Innewwindow1_Internalname, "Height", Innewwindow1_Height);
      Innewwindow1_Width = "800" ;
      ucInnewwindow1.sendProperty(context, sPrefix, false, Innewwindow1_Internalname, "Width", Innewwindow1_Width);
      this.executeUsercontrolMethod(sPrefix, false, "INNEWWINDOW1Container", "OpenWindow", "", new Object[] {});
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV13GridState", AV13GridState);
   }

   public void e161MM2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.consumoprdquimicos_wcexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV13GridState", AV13GridState);
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV15OrderedBy, 4, 0))+":"+(AV16OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV23ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "EmprCod", "", "Código Empresa", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdNum", "", "Producto", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdAny", "", "Año estadistica Productos", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdNumMes", "", "Mes de la Estadistica de Prod.", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdAcuCprA", "", "Acumulado Unidades Compra Año", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdAcuConA", "", "Acumulado Unidades Consumo Año", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdValCprA", "", "Valor Compra Productos Año", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdValConA", "", "Valor Consumo Productos Año", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "DifValConA", "", "orden ascendente val. con. año", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV22UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "ConsumoPrdQuimicos_WCColumnsSelector", GXv_char4) ;
      consumoprdquimicos_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      AV22UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV22UserCustomValue)==0) ) )
      {
         AV24ColumnsSelectorAux.fromxml(AV22UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector8[0] = AV24ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector9[0] = AV23ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, GXv_SdtWWPColumnsSelector9) ;
         AV24ColumnsSelectorAux = GXv_SdtWWPColumnsSelector8[0] ;
         AV23ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = AV26ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "ConsumoPrdQuimicos_WCFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV26ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV18FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18FilterFullText", AV18FilterFullText);
      AV29TFEmprCod = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFEmprCod", AV29TFEmprCod);
      AV30TFEmprCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFEmprCod_Sel", AV30TFEmprCod_Sel);
      AV31TFPrdNum = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFPrdNum", AV31TFPrdNum);
      AV32TFPrdNum_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFPrdNum_Sel", AV32TFPrdNum_Sel);
      AV33TFPrdAny = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFPrdAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33TFPrdAny), 4, 0));
      AV34TFPrdAny_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFPrdAny_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFPrdAny_To), 4, 0));
      AV35TFPrdNumMes = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFPrdNumMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFPrdNumMes), 2, 0));
      AV36TFPrdNumMes_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFPrdNumMes_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFPrdNumMes_To), 2, 0));
      AV37TFPrdAcuCprA = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFPrdAcuCprA", GXutil.ltrimstr( AV37TFPrdAcuCprA, 10, 2));
      AV38TFPrdAcuCprA_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFPrdAcuCprA_To", GXutil.ltrimstr( AV38TFPrdAcuCprA_To, 10, 2));
      AV39TFPrdAcuConA = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFPrdAcuConA", GXutil.ltrimstr( AV39TFPrdAcuConA, 12, 4));
      AV40TFPrdAcuConA_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFPrdAcuConA_To", GXutil.ltrimstr( AV40TFPrdAcuConA_To, 12, 4));
      AV41TFPrdValCprA = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFPrdValCprA", GXutil.ltrimstr( AV41TFPrdValCprA, 12, 2));
      AV42TFPrdValCprA_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFPrdValCprA_To", GXutil.ltrimstr( AV42TFPrdValCprA_To, 12, 2));
      AV43TFPrdValConA = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFPrdValConA", GXutil.ltrimstr( AV43TFPrdValConA, 12, 2));
      AV44TFPrdValConA_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFPrdValConA_To", GXutil.ltrimstr( AV44TFPrdValConA_To, 12, 2));
      AV45TFDifValConA = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFDifValConA", GXutil.ltrimstr( AV45TFDifValConA, 12, 2));
      AV46TFDifValConA_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFDifValConA_To", GXutil.ltrimstr( AV46TFDifValConA_To, 12, 2));
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV25Session.getValue(AV81Pgmname+"GridState"), "") == 0 )
      {
         AV13GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV81Pgmname+"GridState"), null, null);
      }
      else
      {
         AV13GridState.fromxml(AV25Session.getValue(AV81Pgmname+"GridState"), null, null);
      }
      AV15OrderedBy = AV13GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15OrderedBy), 4, 0));
      AV16OrderedDsc = AV13GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16OrderedDsc", AV16OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S182 ();
      if (returnInSub) return;
   }

   public void S182( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV82GXV1 = 1 ;
      while ( AV82GXV1 <= AV13GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV14GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV13GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV82GXV1));
         if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18FilterFullText", AV18FilterFullText);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD") == 0 )
         {
            AV29TFEmprCod = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFEmprCod", AV29TFEmprCod);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD_SEL") == 0 )
         {
            AV30TFEmprCod_Sel = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFEmprCod_Sel", AV30TFEmprCod_Sel);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV31TFPrdNum = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFPrdNum", AV31TFPrdNum);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV32TFPrdNum_Sel = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFPrdNum_Sel", AV32TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDANY") == 0 )
         {
            AV33TFPrdAny = (short)(GXutil.lval( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFPrdAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33TFPrdAny), 4, 0));
            AV34TFPrdAny_To = (short)(GXutil.lval( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFPrdAny_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFPrdAny_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUMMES") == 0 )
         {
            AV35TFPrdNumMes = (byte)(GXutil.lval( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFPrdNumMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFPrdNumMes), 2, 0));
            AV36TFPrdNumMes_To = (byte)(GXutil.lval( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFPrdNumMes_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFPrdNumMes_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDACUCPRA") == 0 )
         {
            AV37TFPrdAcuCprA = CommonUtil.decimalVal( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFPrdAcuCprA", GXutil.ltrimstr( AV37TFPrdAcuCprA, 10, 2));
            AV38TFPrdAcuCprA_To = CommonUtil.decimalVal( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFPrdAcuCprA_To", GXutil.ltrimstr( AV38TFPrdAcuCprA_To, 10, 2));
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDACUCONA") == 0 )
         {
            AV39TFPrdAcuConA = CommonUtil.decimalVal( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFPrdAcuConA", GXutil.ltrimstr( AV39TFPrdAcuConA, 12, 4));
            AV40TFPrdAcuConA_To = CommonUtil.decimalVal( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFPrdAcuConA_To", GXutil.ltrimstr( AV40TFPrdAcuConA_To, 12, 4));
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDVALCPRA") == 0 )
         {
            AV41TFPrdValCprA = CommonUtil.decimalVal( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFPrdValCprA", GXutil.ltrimstr( AV41TFPrdValCprA, 12, 2));
            AV42TFPrdValCprA_To = CommonUtil.decimalVal( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFPrdValCprA_To", GXutil.ltrimstr( AV42TFPrdValCprA_To, 12, 2));
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDVALCONA") == 0 )
         {
            AV43TFPrdValConA = CommonUtil.decimalVal( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFPrdValConA", GXutil.ltrimstr( AV43TFPrdValConA, 12, 2));
            AV44TFPrdValConA_To = CommonUtil.decimalVal( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFPrdValConA_To", GXutil.ltrimstr( AV44TFPrdValConA_To, 12, 2));
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDIFVALCONA") == 0 )
         {
            AV45TFDifValConA = CommonUtil.decimalVal( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFDifValConA", GXutil.ltrimstr( AV45TFDifValConA, 12, 2));
            AV46TFDifValConA_To = CommonUtil.decimalVal( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFDifValConA_To", GXutil.ltrimstr( AV46TFDifValConA_To, 12, 2));
         }
         AV82GXV1 = (int)(AV82GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV30TFEmprCod_Sel)==0), AV30TFEmprCod_Sel, GXv_char4) ;
      consumoprdquimicos_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV32TFPrdNum_Sel)==0), AV32TFPrdNum_Sel, GXv_char3) ;
      consumoprdquimicos_wc_impl.this.GXt_char12 = GXv_char3[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|"+GXt_char12+"|||||||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char12 = "" ;
      GXv_char4[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV29TFEmprCod)==0), AV29TFEmprCod, GXv_char4) ;
      consumoprdquimicos_wc_impl.this.GXt_char12 = GXv_char4[0] ;
      GXt_char1 = "" ;
      GXv_char3[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV31TFPrdNum)==0), AV31TFPrdNum, GXv_char3) ;
      consumoprdquimicos_wc_impl.this.GXt_char1 = GXv_char3[0] ;
      Ddo_grid_Filteredtext_set = GXt_char12+"|"+GXt_char1+"|"+((0==AV33TFPrdAny) ? "" : GXutil.str( AV33TFPrdAny, 4, 0))+"|"+((0==AV35TFPrdNumMes) ? "" : GXutil.str( AV35TFPrdNumMes, 2, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV37TFPrdAcuCprA)==0) ? "" : GXutil.str( AV37TFPrdAcuCprA, 10, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFPrdAcuConA)==0) ? "" : GXutil.str( AV39TFPrdAcuConA, 12, 4))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFPrdValCprA)==0) ? "" : GXutil.str( AV41TFPrdValCprA, 12, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFPrdValConA)==0) ? "" : GXutil.str( AV43TFPrdValConA, 12, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV45TFDifValConA)==0) ? "" : GXutil.str( AV45TFDifValConA, 12, 2)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "||"+((0==AV34TFPrdAny_To) ? "" : GXutil.str( AV34TFPrdAny_To, 4, 0))+"|"+((0==AV36TFPrdNumMes_To) ? "" : GXutil.str( AV36TFPrdNumMes_To, 2, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV38TFPrdAcuCprA_To)==0) ? "" : GXutil.str( AV38TFPrdAcuCprA_To, 10, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFPrdAcuConA_To)==0) ? "" : GXutil.str( AV40TFPrdAcuConA_To, 12, 4))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFPrdValCprA_To)==0) ? "" : GXutil.str( AV42TFPrdValCprA_To, 12, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV44TFPrdValConA_To)==0) ? "" : GXutil.str( AV44TFPrdValConA_To, 12, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV46TFDifValConA_To)==0) ? "" : GXutil.str( AV46TFDifValConA_To, 12, 2)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV13GridState.fromxml(AV25Session.getValue(AV81Pgmname+"GridState"), null, null);
      AV13GridState.setgxTv_SdtWWPGridState_Orderedby( AV15OrderedBy );
      AV13GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV16OrderedDsc );
      AV13GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState13[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState13, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV18FilterFullText)==0), (short)(0), AV18FilterFullText, "") ;
      AV13GridState = GXv_SdtWWPGridState13[0] ;
      GXv_SdtWWPGridState13[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState13, "TFEMPRCOD", "", !(GXutil.strcmp("", AV29TFEmprCod)==0), (short)(0), AV29TFEmprCod, "", !(GXutil.strcmp("", AV30TFEmprCod_Sel)==0), AV30TFEmprCod_Sel, "") ;
      AV13GridState = GXv_SdtWWPGridState13[0] ;
      GXv_SdtWWPGridState13[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState13, "TFPRDNUM", "", !(GXutil.strcmp("", AV31TFPrdNum)==0), (short)(0), AV31TFPrdNum, "", !(GXutil.strcmp("", AV32TFPrdNum_Sel)==0), AV32TFPrdNum_Sel, "") ;
      AV13GridState = GXv_SdtWWPGridState13[0] ;
      GXv_SdtWWPGridState13[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState13, "TFPRDANY", "", !((0==AV33TFPrdAny)&&(0==AV34TFPrdAny_To)), (short)(0), GXutil.trim( GXutil.str( AV33TFPrdAny, 4, 0)), GXutil.trim( GXutil.str( AV34TFPrdAny_To, 4, 0))) ;
      AV13GridState = GXv_SdtWWPGridState13[0] ;
      GXv_SdtWWPGridState13[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState13, "TFPRDNUMMES", "", !((0==AV35TFPrdNumMes)&&(0==AV36TFPrdNumMes_To)), (short)(0), GXutil.trim( GXutil.str( AV35TFPrdNumMes, 2, 0)), GXutil.trim( GXutil.str( AV36TFPrdNumMes_To, 2, 0))) ;
      AV13GridState = GXv_SdtWWPGridState13[0] ;
      GXv_SdtWWPGridState13[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState13, "TFPRDACUCPRA", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV37TFPrdAcuCprA)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV38TFPrdAcuCprA_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV37TFPrdAcuCprA, 10, 2)), GXutil.trim( GXutil.str( AV38TFPrdAcuCprA_To, 10, 2))) ;
      AV13GridState = GXv_SdtWWPGridState13[0] ;
      GXv_SdtWWPGridState13[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState13, "TFPRDACUCONA", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFPrdAcuConA)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFPrdAcuConA_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV39TFPrdAcuConA, 12, 4)), GXutil.trim( GXutil.str( AV40TFPrdAcuConA_To, 12, 4))) ;
      AV13GridState = GXv_SdtWWPGridState13[0] ;
      GXv_SdtWWPGridState13[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState13, "TFPRDVALCPRA", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFPrdValCprA)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFPrdValCprA_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV41TFPrdValCprA, 12, 2)), GXutil.trim( GXutil.str( AV42TFPrdValCprA_To, 12, 2))) ;
      AV13GridState = GXv_SdtWWPGridState13[0] ;
      GXv_SdtWWPGridState13[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState13, "TFPRDVALCONA", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFPrdValConA)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV44TFPrdValConA_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV43TFPrdValConA, 12, 2)), GXutil.trim( GXutil.str( AV44TFPrdValConA_To, 12, 2))) ;
      AV13GridState = GXv_SdtWWPGridState13[0] ;
      GXv_SdtWWPGridState13[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState13, "TFDIFVALCONA", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV45TFDifValConA)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV46TFDifValConA_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV45TFDifValConA, 12, 2)), GXutil.trim( GXutil.str( AV46TFDifValConA_To, 12, 2))) ;
      AV13GridState = GXv_SdtWWPGridState13[0] ;
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV81Pgmname+"GridState", AV13GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV11TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV11TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV81Pgmname );
      AV11TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV11TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV10HTTPRequest.getScriptName()+"?"+AV10HTTPRequest.getQuerystring() );
      AV11TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TPRDEST" );
      AV25Session.setValue("TrnContext", AV11TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_25_1MM2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablerightheader_Internalname, tblTablerightheader_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* User Defined Control */
         ucDdo_managefilters.setProperty("IconType", Ddo_managefilters_Icontype);
         ucDdo_managefilters.setProperty("Icon", Ddo_managefilters_Icon);
         ucDdo_managefilters.setProperty("Caption", Ddo_managefilters_Caption);
         ucDdo_managefilters.setProperty("Tooltip", Ddo_managefilters_Tooltip);
         ucDdo_managefilters.setProperty("Cls", Ddo_managefilters_Cls);
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV26ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_30_1MM2( true) ;
      }
      else
      {
         wb_table2_30_1MM2( false) ;
      }
      return  ;
   }

   public void wb_table2_30_1MM2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_25_1MM2e( true) ;
      }
      else
      {
         wb_table1_25_1MM2e( false) ;
      }
   }

   public void wb_table2_30_1MM2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'" + sPrefix + "',false,'" + sGXsfl_40_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV18FilterFullText, GXutil.rtrim( localUtil.format( AV18FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_ConsumoPrdQuimicos_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_30_1MM2e( true) ;
      }
      else
      {
         wb_table2_30_1MM2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV5Anyo = ((Number) GXutil.testNumericType( getParm(obj,0,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Anyo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5Anyo), 4, 0));
      AV6MesI = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6MesI", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6MesI), 2, 0));
      AV7MesF = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7MesF", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7MesF), 2, 0));
      AV51Opcion = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51Opcion", GXutil.str( AV51Opcion, 1, 0));
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
      pa1MM2( ) ;
      ws1MM2( ) ;
      we1MM2( ) ;
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
      sCtrlAV5Anyo = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV6MesI = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV7MesF = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV51Opcion = (String)getParm(obj,3,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1MM2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "consumoprdquimicos_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1MM2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV5Anyo = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Anyo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5Anyo), 4, 0));
         AV6MesI = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6MesI", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6MesI), 2, 0));
         AV7MesF = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7MesF", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7MesF), 2, 0));
         AV51Opcion = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51Opcion", GXutil.str( AV51Opcion, 1, 0));
      }
      wcpOAV5Anyo = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV5Anyo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV6MesI = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV6MesI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV7MesF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV7MesF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV51Opcion = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV51Opcion"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( AV5Anyo != wcpOAV5Anyo ) || ( AV6MesI != wcpOAV6MesI ) || ( AV7MesF != wcpOAV7MesF ) || ( AV51Opcion != wcpOAV51Opcion ) ) )
      {
         setjustcreated();
      }
      wcpOAV5Anyo = AV5Anyo ;
      wcpOAV6MesI = AV6MesI ;
      wcpOAV7MesF = AV7MesF ;
      wcpOAV51Opcion = AV51Opcion ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV5Anyo = httpContext.cgiGet( sPrefix+"AV5Anyo_CTRL") ;
      if ( GXutil.len( sCtrlAV5Anyo) > 0 )
      {
         AV5Anyo = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV5Anyo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Anyo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5Anyo), 4, 0));
      }
      else
      {
         AV5Anyo = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV5Anyo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV6MesI = httpContext.cgiGet( sPrefix+"AV6MesI_CTRL") ;
      if ( GXutil.len( sCtrlAV6MesI) > 0 )
      {
         AV6MesI = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV6MesI), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6MesI", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6MesI), 2, 0));
      }
      else
      {
         AV6MesI = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV6MesI_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV7MesF = httpContext.cgiGet( sPrefix+"AV7MesF_CTRL") ;
      if ( GXutil.len( sCtrlAV7MesF) > 0 )
      {
         AV7MesF = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV7MesF), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7MesF", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7MesF), 2, 0));
      }
      else
      {
         AV7MesF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV7MesF_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV51Opcion = httpContext.cgiGet( sPrefix+"AV51Opcion_CTRL") ;
      if ( GXutil.len( sCtrlAV51Opcion) > 0 )
      {
         AV51Opcion = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV51Opcion), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51Opcion", GXutil.str( AV51Opcion, 1, 0));
      }
      else
      {
         AV51Opcion = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV51Opcion_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa1MM2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1MM2( ) ;
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
      ws1MM2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5Anyo_PARM", GXutil.ltrim( localUtil.ntoc( AV5Anyo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV5Anyo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5Anyo_CTRL", GXutil.rtrim( sCtrlAV5Anyo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6MesI_PARM", GXutil.ltrim( localUtil.ntoc( AV6MesI, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV6MesI)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6MesI_CTRL", GXutil.rtrim( sCtrlAV6MesI));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7MesF_PARM", GXutil.ltrim( localUtil.ntoc( AV7MesF, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7MesF)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7MesF_CTRL", GXutil.rtrim( sCtrlAV7MesF));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV51Opcion_PARM", GXutil.ltrim( localUtil.ntoc( AV51Opcion, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV51Opcion)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV51Opcion_CTRL", GXutil.rtrim( sCtrlAV51Opcion));
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
      we1MM2( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211556715", true, true);
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
      httpContext.AddJavascriptSource("consumoprdquimicos_wc.js", "?20268211556716", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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

   public void subsflControlProps_402( )
   {
      edtEmprCod_Internalname = sPrefix+"EMPRCOD_"+sGXsfl_40_idx ;
      edtPrdNum_Internalname = sPrefix+"PRDNUM_"+sGXsfl_40_idx ;
      edtPrdAny_Internalname = sPrefix+"PRDANY_"+sGXsfl_40_idx ;
      edtPrdNumMes_Internalname = sPrefix+"PRDNUMMES_"+sGXsfl_40_idx ;
      edtPrdAcuCprA_Internalname = sPrefix+"PRDACUCPRA_"+sGXsfl_40_idx ;
      edtPrdAcuConA_Internalname = sPrefix+"PRDACUCONA_"+sGXsfl_40_idx ;
      edtPrdValCprA_Internalname = sPrefix+"PRDVALCPRA_"+sGXsfl_40_idx ;
      edtPrdValConA_Internalname = sPrefix+"PRDVALCONA_"+sGXsfl_40_idx ;
      edtDifValConA_Internalname = sPrefix+"DIFVALCONA_"+sGXsfl_40_idx ;
   }

   public void subsflControlProps_fel_402( )
   {
      edtEmprCod_Internalname = sPrefix+"EMPRCOD_"+sGXsfl_40_fel_idx ;
      edtPrdNum_Internalname = sPrefix+"PRDNUM_"+sGXsfl_40_fel_idx ;
      edtPrdAny_Internalname = sPrefix+"PRDANY_"+sGXsfl_40_fel_idx ;
      edtPrdNumMes_Internalname = sPrefix+"PRDNUMMES_"+sGXsfl_40_fel_idx ;
      edtPrdAcuCprA_Internalname = sPrefix+"PRDACUCPRA_"+sGXsfl_40_fel_idx ;
      edtPrdAcuConA_Internalname = sPrefix+"PRDACUCONA_"+sGXsfl_40_fel_idx ;
      edtPrdValCprA_Internalname = sPrefix+"PRDVALCPRA_"+sGXsfl_40_fel_idx ;
      edtPrdValConA_Internalname = sPrefix+"PRDVALCONA_"+sGXsfl_40_fel_idx ;
      edtDifValConA_Internalname = sPrefix+"DIFVALCONA_"+sGXsfl_40_fel_idx ;
   }

   public void sendrow_402( )
   {
      subsflControlProps_402( ) ;
      wb1MM0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_40_idx - GRID_nFirstRecordOnPage <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_40_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_40_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtEmprCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtEmprCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdAny_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdAny_Internalname,GXutil.ltrim( localUtil.ntoc( A681PrdAny, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A681PrdAny), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdAny_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdAny_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdNumMes_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNumMes_Internalname,GXutil.ltrim( localUtil.ntoc( A720PrdNumMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A720PrdNumMes), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdNumMes_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdNumMes_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdAcuCprA_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdAcuCprA_Internalname,GXutil.ltrim( localUtil.ntoc( A677PrdAcuCprA, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A677PrdAcuCprA, "ZZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdAcuCprA_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdAcuCprA_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdAcuConA_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdAcuConA_Internalname,GXutil.ltrim( localUtil.ntoc( A676PrdAcuConA, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A676PrdAcuConA, "ZZZZZZ9.9999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdAcuConA_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdAcuConA_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdValCprA_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdValCprA_Internalname,GXutil.ltrim( localUtil.ntoc( A748PrdValCprA, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A748PrdValCprA, "ZZZZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdValCprA_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdValCprA_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdValConA_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdValConA_Internalname,GXutil.ltrim( localUtil.ntoc( A746PrdValConA, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A746PrdValConA, "ZZZZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdValConA_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdValConA_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtDifValConA_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDifValConA_Internalname,GXutil.ltrim( localUtil.ntoc( A331DifValConA, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A331DifValConA, "ZZZZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDifValConA_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtDifValConA_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1MM2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_40_idx = ((subGrid_Islastpage==1)&&(nGXsfl_40_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_40_idx+1) ;
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_402( ) ;
      }
      /* End function sendrow_402 */
   }

   public void startgridcontrol40( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"40\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtEmprCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código Empresa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdAny_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Año estadistica Productos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdNumMes_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Mes de la Estadistica de Prod.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdAcuCprA_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Acumulado Unidades Compra Año", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdAcuConA_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Acumulado Unidades Consumo Año", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdValCprA_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Valor Compra Productos Año", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdValConA_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Valor Consumo Productos Año", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDifValConA_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "orden ascendente val. con. año", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtEmprCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A719PrdNum));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A681PrdAny, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdAny_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A720PrdNumMes, (byte)(2), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdNumMes_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A677PrdAcuCprA, (byte)(10), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdAcuCprA_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A676PrdAcuConA, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdAcuConA_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A748PrdValCprA, (byte)(12), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdValCprA_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A746PrdValConA, (byte)(12), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdValConA_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A331DifValConA, (byte)(12), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDifValConA_Visible, (byte)(5), (byte)(0), ".", "")));
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
      bttBtnexport_Internalname = sPrefix+"BTNEXPORT" ;
      bttBtnexportreport_Internalname = sPrefix+"BTNEXPORTREPORT" ;
      bttBtnexportcsv_Internalname = sPrefix+"BTNEXPORTCSV" ;
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtEmprCod_Internalname = sPrefix+"EMPRCOD" ;
      edtPrdNum_Internalname = sPrefix+"PRDNUM" ;
      edtPrdAny_Internalname = sPrefix+"PRDANY" ;
      edtPrdNumMes_Internalname = sPrefix+"PRDNUMMES" ;
      edtPrdAcuCprA_Internalname = sPrefix+"PRDACUCPRA" ;
      edtPrdAcuConA_Internalname = sPrefix+"PRDACUCONA" ;
      edtPrdValCprA_Internalname = sPrefix+"PRDVALCPRA" ;
      edtPrdValConA_Internalname = sPrefix+"PRDVALCONA" ;
      edtDifValConA_Internalname = sPrefix+"DIFVALCONA" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Innewwindow1_Internalname = sPrefix+"INNEWWINDOW1" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
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
      subGrid_Allowselection = (byte)(0) ;
      subGrid_Header = "" ;
      edtDifValConA_Jsonclick = "" ;
      edtPrdValConA_Jsonclick = "" ;
      edtPrdValCprA_Jsonclick = "" ;
      edtPrdAcuConA_Jsonclick = "" ;
      edtPrdAcuCprA_Jsonclick = "" ;
      edtPrdNumMes_Jsonclick = "" ;
      edtPrdAny_Jsonclick = "" ;
      edtPrdNum_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      subGrid_Class = "GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtDifValConA_Visible = -1 ;
      edtPrdValConA_Visible = -1 ;
      edtPrdValCprA_Visible = -1 ;
      edtPrdAcuConA_Visible = -1 ;
      edtPrdAcuCprA_Visible = -1 ;
      edtPrdNumMes_Visible = -1 ;
      edtPrdAny_Visible = -1 ;
      edtPrdNum_Visible = -1 ;
      edtEmprCod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Infinitescrolling = "Form" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Innewwindow1_Target = "" ;
      Innewwindow1_Height = "50" ;
      Innewwindow1_Width = "50" ;
      Ddo_grid_Datalistproc = "ConsumoPrdQuimicos_WCGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic|Dynamic|||||||" ;
      Ddo_grid_Includedatalist = "T|T|||||||" ;
      Ddo_grid_Filterisrange = "||T|T|T|T|T|T|T" ;
      Ddo_grid_Filtertype = "Character|Character|Numeric|Numeric|Numeric|Numeric|Numeric|Numeric|Numeric" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T|T|T||T|||T" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4||5|||6" ;
      Ddo_grid_Columnids = "0:EmprCod|1:PrdNum|2:PrdAny|3:PrdNumMes|4:PrdAcuCprA|5:PrdAcuConA|6:PrdValCprA|7:PrdValConA|8:DifValConA" ;
      Ddo_grid_Gridinternalname = "" ;
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
      Ddo_managefilters_Cls = "ManageFilters" ;
      Ddo_managefilters_Tooltip = "WWP_ManageFiltersTooltip" ;
      Ddo_managefilters_Icon = "fas fa-filter" ;
      Ddo_managefilters_Icontype = "FontIcon" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV54PrdNumFrom',fld:'vPRDNUMFROM',pic:''},{av:'AV55PrdNumTo',fld:'vPRDNUMTO',pic:''},{av:'AV51Opcion',fld:'vOPCION',pic:'9'},{av:'sPrefix'},{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV18FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV29TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV30TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV31TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV32TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV33TFPrdAny',fld:'vTFPRDANY',pic:'ZZZ9'},{av:'AV34TFPrdAny_To',fld:'vTFPRDANY_TO',pic:'ZZZ9'},{av:'AV35TFPrdNumMes',fld:'vTFPRDNUMMES',pic:'Z9'},{av:'AV36TFPrdNumMes_To',fld:'vTFPRDNUMMES_TO',pic:'Z9'},{av:'AV37TFPrdAcuCprA',fld:'vTFPRDACUCPRA',pic:'ZZZZZZ9.99'},{av:'AV38TFPrdAcuCprA_To',fld:'vTFPRDACUCPRA_TO',pic:'ZZZZZZ9.99'},{av:'AV39TFPrdAcuConA',fld:'vTFPRDACUCONA',pic:'ZZZZZZ9.9999'},{av:'AV40TFPrdAcuConA_To',fld:'vTFPRDACUCONA_TO',pic:'ZZZZZZ9.9999'},{av:'AV41TFPrdValCprA',fld:'vTFPRDVALCPRA',pic:'ZZZZZZZZ9.99'},{av:'AV42TFPrdValCprA_To',fld:'vTFPRDVALCPRA_TO',pic:'ZZZZZZZZ9.99'},{av:'AV43TFPrdValConA',fld:'vTFPRDVALCONA',pic:'ZZZZZZZZ9.99'},{av:'AV44TFPrdValConA_To',fld:'vTFPRDVALCONA_TO',pic:'ZZZZZZZZ9.99'},{av:'AV45TFDifValConA',fld:'vTFDIFVALCONA',pic:'ZZZZZZZZ9.99'},{av:'AV46TFDifValConA_To',fld:'vTFDIFVALCONA_TO',pic:'ZZZZZZZZ9.99'},{av:'AV15OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV16OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV81Pgmname',fld:'vPGMNAME',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtEmprCod_Visible',ctrl:'EMPRCOD',prop:'Visible'},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdAny_Visible',ctrl:'PRDANY',prop:'Visible'},{av:'edtPrdNumMes_Visible',ctrl:'PRDNUMMES',prop:'Visible'},{av:'edtPrdAcuCprA_Visible',ctrl:'PRDACUCPRA',prop:'Visible'},{av:'edtPrdAcuConA_Visible',ctrl:'PRDACUCONA',prop:'Visible'},{av:'edtPrdValCprA_Visible',ctrl:'PRDVALCPRA',prop:'Visible'},{av:'edtPrdValConA_Visible',ctrl:'PRDVALCONA',prop:'Visible'},{av:'edtDifValConA_Visible',ctrl:'DIFVALCONA',prop:'Visible'},{av:'AV26ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV13GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e121MM2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV18FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV54PrdNumFrom',fld:'vPRDNUMFROM',pic:''},{av:'AV55PrdNumTo',fld:'vPRDNUMTO',pic:''},{av:'AV51Opcion',fld:'vOPCION',pic:'9'},{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV29TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV30TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV31TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV32TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV33TFPrdAny',fld:'vTFPRDANY',pic:'ZZZ9'},{av:'AV34TFPrdAny_To',fld:'vTFPRDANY_TO',pic:'ZZZ9'},{av:'AV35TFPrdNumMes',fld:'vTFPRDNUMMES',pic:'Z9'},{av:'AV36TFPrdNumMes_To',fld:'vTFPRDNUMMES_TO',pic:'Z9'},{av:'AV37TFPrdAcuCprA',fld:'vTFPRDACUCPRA',pic:'ZZZZZZ9.99'},{av:'AV38TFPrdAcuCprA_To',fld:'vTFPRDACUCPRA_TO',pic:'ZZZZZZ9.99'},{av:'AV39TFPrdAcuConA',fld:'vTFPRDACUCONA',pic:'ZZZZZZ9.9999'},{av:'AV40TFPrdAcuConA_To',fld:'vTFPRDACUCONA_TO',pic:'ZZZZZZ9.9999'},{av:'AV41TFPrdValCprA',fld:'vTFPRDVALCPRA',pic:'ZZZZZZZZ9.99'},{av:'AV42TFPrdValCprA_To',fld:'vTFPRDVALCPRA_TO',pic:'ZZZZZZZZ9.99'},{av:'AV43TFPrdValConA',fld:'vTFPRDVALCONA',pic:'ZZZZZZZZ9.99'},{av:'AV44TFPrdValConA_To',fld:'vTFPRDVALCONA_TO',pic:'ZZZZZZZZ9.99'},{av:'AV45TFDifValConA',fld:'vTFDIFVALCONA',pic:'ZZZZZZZZ9.99'},{av:'AV46TFDifValConA_To',fld:'vTFDIFVALCONA_TO',pic:'ZZZZZZZZ9.99'},{av:'AV81Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV15OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV16OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV15OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV16OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV45TFDifValConA',fld:'vTFDIFVALCONA',pic:'ZZZZZZZZ9.99'},{av:'AV46TFDifValConA_To',fld:'vTFDIFVALCONA_TO',pic:'ZZZZZZZZ9.99'},{av:'AV43TFPrdValConA',fld:'vTFPRDVALCONA',pic:'ZZZZZZZZ9.99'},{av:'AV44TFPrdValConA_To',fld:'vTFPRDVALCONA_TO',pic:'ZZZZZZZZ9.99'},{av:'AV41TFPrdValCprA',fld:'vTFPRDVALCPRA',pic:'ZZZZZZZZ9.99'},{av:'AV42TFPrdValCprA_To',fld:'vTFPRDVALCPRA_TO',pic:'ZZZZZZZZ9.99'},{av:'AV39TFPrdAcuConA',fld:'vTFPRDACUCONA',pic:'ZZZZZZ9.9999'},{av:'AV40TFPrdAcuConA_To',fld:'vTFPRDACUCONA_TO',pic:'ZZZZZZ9.9999'},{av:'AV37TFPrdAcuCprA',fld:'vTFPRDACUCPRA',pic:'ZZZZZZ9.99'},{av:'AV38TFPrdAcuCprA_To',fld:'vTFPRDACUCPRA_TO',pic:'ZZZZZZ9.99'},{av:'AV35TFPrdNumMes',fld:'vTFPRDNUMMES',pic:'Z9'},{av:'AV36TFPrdNumMes_To',fld:'vTFPRDNUMMES_TO',pic:'Z9'},{av:'AV33TFPrdAny',fld:'vTFPRDANY',pic:'ZZZ9'},{av:'AV34TFPrdAny_To',fld:'vTFPRDANY_TO',pic:'ZZZ9'},{av:'AV31TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV32TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV29TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV30TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e191MM2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e131MM2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV18FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV54PrdNumFrom',fld:'vPRDNUMFROM',pic:''},{av:'AV55PrdNumTo',fld:'vPRDNUMTO',pic:''},{av:'AV51Opcion',fld:'vOPCION',pic:'9'},{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV29TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV30TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV31TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV32TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV33TFPrdAny',fld:'vTFPRDANY',pic:'ZZZ9'},{av:'AV34TFPrdAny_To',fld:'vTFPRDANY_TO',pic:'ZZZ9'},{av:'AV35TFPrdNumMes',fld:'vTFPRDNUMMES',pic:'Z9'},{av:'AV36TFPrdNumMes_To',fld:'vTFPRDNUMMES_TO',pic:'Z9'},{av:'AV37TFPrdAcuCprA',fld:'vTFPRDACUCPRA',pic:'ZZZZZZ9.99'},{av:'AV38TFPrdAcuCprA_To',fld:'vTFPRDACUCPRA_TO',pic:'ZZZZZZ9.99'},{av:'AV39TFPrdAcuConA',fld:'vTFPRDACUCONA',pic:'ZZZZZZ9.9999'},{av:'AV40TFPrdAcuConA_To',fld:'vTFPRDACUCONA_TO',pic:'ZZZZZZ9.9999'},{av:'AV41TFPrdValCprA',fld:'vTFPRDVALCPRA',pic:'ZZZZZZZZ9.99'},{av:'AV42TFPrdValCprA_To',fld:'vTFPRDVALCPRA_TO',pic:'ZZZZZZZZ9.99'},{av:'AV43TFPrdValConA',fld:'vTFPRDVALCONA',pic:'ZZZZZZZZ9.99'},{av:'AV44TFPrdValConA_To',fld:'vTFPRDVALCONA_TO',pic:'ZZZZZZZZ9.99'},{av:'AV45TFDifValConA',fld:'vTFDIFVALCONA',pic:'ZZZZZZZZ9.99'},{av:'AV46TFDifValConA_To',fld:'vTFDIFVALCONA_TO',pic:'ZZZZZZZZ9.99'},{av:'AV81Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV15OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV16OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtEmprCod_Visible',ctrl:'EMPRCOD',prop:'Visible'},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdAny_Visible',ctrl:'PRDANY',prop:'Visible'},{av:'edtPrdNumMes_Visible',ctrl:'PRDNUMMES',prop:'Visible'},{av:'edtPrdAcuCprA_Visible',ctrl:'PRDACUCPRA',prop:'Visible'},{av:'edtPrdAcuConA_Visible',ctrl:'PRDACUCONA',prop:'Visible'},{av:'edtPrdValCprA_Visible',ctrl:'PRDVALCPRA',prop:'Visible'},{av:'edtPrdValConA_Visible',ctrl:'PRDVALCONA',prop:'Visible'},{av:'edtDifValConA_Visible',ctrl:'DIFVALCONA',prop:'Visible'},{av:'AV26ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV13GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e111MM2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV18FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV54PrdNumFrom',fld:'vPRDNUMFROM',pic:''},{av:'AV55PrdNumTo',fld:'vPRDNUMTO',pic:''},{av:'AV51Opcion',fld:'vOPCION',pic:'9'},{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV29TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV30TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV31TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV32TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV33TFPrdAny',fld:'vTFPRDANY',pic:'ZZZ9'},{av:'AV34TFPrdAny_To',fld:'vTFPRDANY_TO',pic:'ZZZ9'},{av:'AV35TFPrdNumMes',fld:'vTFPRDNUMMES',pic:'Z9'},{av:'AV36TFPrdNumMes_To',fld:'vTFPRDNUMMES_TO',pic:'Z9'},{av:'AV37TFPrdAcuCprA',fld:'vTFPRDACUCPRA',pic:'ZZZZZZ9.99'},{av:'AV38TFPrdAcuCprA_To',fld:'vTFPRDACUCPRA_TO',pic:'ZZZZZZ9.99'},{av:'AV39TFPrdAcuConA',fld:'vTFPRDACUCONA',pic:'ZZZZZZ9.9999'},{av:'AV40TFPrdAcuConA_To',fld:'vTFPRDACUCONA_TO',pic:'ZZZZZZ9.9999'},{av:'AV41TFPrdValCprA',fld:'vTFPRDVALCPRA',pic:'ZZZZZZZZ9.99'},{av:'AV42TFPrdValCprA_To',fld:'vTFPRDVALCPRA_TO',pic:'ZZZZZZZZ9.99'},{av:'AV43TFPrdValConA',fld:'vTFPRDVALCONA',pic:'ZZZZZZZZ9.99'},{av:'AV44TFPrdValConA_To',fld:'vTFPRDVALCONA_TO',pic:'ZZZZZZZZ9.99'},{av:'AV45TFDifValConA',fld:'vTFDIFVALCONA',pic:'ZZZZZZZZ9.99'},{av:'AV46TFDifValConA_To',fld:'vTFDIFVALCONA_TO',pic:'ZZZZZZZZ9.99'},{av:'AV81Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV15OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV16OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV13GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV13GridState',fld:'vGRIDSTATE',pic:''},{av:'AV15OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV16OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV18FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV29TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV30TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV31TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV32TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV33TFPrdAny',fld:'vTFPRDANY',pic:'ZZZ9'},{av:'AV34TFPrdAny_To',fld:'vTFPRDANY_TO',pic:'ZZZ9'},{av:'AV35TFPrdNumMes',fld:'vTFPRDNUMMES',pic:'Z9'},{av:'AV36TFPrdNumMes_To',fld:'vTFPRDNUMMES_TO',pic:'Z9'},{av:'AV37TFPrdAcuCprA',fld:'vTFPRDACUCPRA',pic:'ZZZZZZ9.99'},{av:'AV38TFPrdAcuCprA_To',fld:'vTFPRDACUCPRA_TO',pic:'ZZZZZZ9.99'},{av:'AV39TFPrdAcuConA',fld:'vTFPRDACUCONA',pic:'ZZZZZZ9.9999'},{av:'AV40TFPrdAcuConA_To',fld:'vTFPRDACUCONA_TO',pic:'ZZZZZZ9.9999'},{av:'AV41TFPrdValCprA',fld:'vTFPRDVALCPRA',pic:'ZZZZZZZZ9.99'},{av:'AV42TFPrdValCprA_To',fld:'vTFPRDVALCPRA_TO',pic:'ZZZZZZZZ9.99'},{av:'AV43TFPrdValConA',fld:'vTFPRDVALCONA',pic:'ZZZZZZZZ9.99'},{av:'AV44TFPrdValConA_To',fld:'vTFPRDVALCONA_TO',pic:'ZZZZZZZZ9.99'},{av:'AV45TFDifValConA',fld:'vTFDIFVALCONA',pic:'ZZZZZZZZ9.99'},{av:'AV46TFDifValConA_To',fld:'vTFDIFVALCONA_TO',pic:'ZZZZZZZZ9.99'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtEmprCod_Visible',ctrl:'EMPRCOD',prop:'Visible'},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdAny_Visible',ctrl:'PRDANY',prop:'Visible'},{av:'edtPrdNumMes_Visible',ctrl:'PRDNUMMES',prop:'Visible'},{av:'edtPrdAcuCprA_Visible',ctrl:'PRDACUCPRA',prop:'Visible'},{av:'edtPrdAcuConA_Visible',ctrl:'PRDACUCONA',prop:'Visible'},{av:'edtPrdValCprA_Visible',ctrl:'PRDVALCPRA',prop:'Visible'},{av:'edtPrdValConA_Visible',ctrl:'PRDVALCONA',prop:'Visible'},{av:'edtDifValConA_Visible',ctrl:'DIFVALCONA',prop:'Visible'},{av:'AV26ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e141MM2',iparms:[{av:'AV81Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV15OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV16OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV13GridState',fld:'vGRIDSTATE',pic:''},{av:'AV30TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV32TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV29TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV31TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV33TFPrdAny',fld:'vTFPRDANY',pic:'ZZZ9'},{av:'AV35TFPrdNumMes',fld:'vTFPRDNUMMES',pic:'Z9'},{av:'AV37TFPrdAcuCprA',fld:'vTFPRDACUCPRA',pic:'ZZZZZZ9.99'},{av:'AV39TFPrdAcuConA',fld:'vTFPRDACUCONA',pic:'ZZZZZZ9.9999'},{av:'AV41TFPrdValCprA',fld:'vTFPRDVALCPRA',pic:'ZZZZZZZZ9.99'},{av:'AV43TFPrdValConA',fld:'vTFPRDVALCONA',pic:'ZZZZZZZZ9.99'},{av:'AV45TFDifValConA',fld:'vTFDIFVALCONA',pic:'ZZZZZZZZ9.99'},{av:'AV34TFPrdAny_To',fld:'vTFPRDANY_TO',pic:'ZZZ9'},{av:'AV36TFPrdNumMes_To',fld:'vTFPRDNUMMES_TO',pic:'Z9'},{av:'AV38TFPrdAcuCprA_To',fld:'vTFPRDACUCPRA_TO',pic:'ZZZZZZ9.99'},{av:'AV40TFPrdAcuConA_To',fld:'vTFPRDACUCONA_TO',pic:'ZZZZZZ9.9999'},{av:'AV42TFPrdValCprA_To',fld:'vTFPRDVALCPRA_TO',pic:'ZZZZZZZZ9.99'},{av:'AV44TFPrdValConA_To',fld:'vTFPRDVALCONA_TO',pic:'ZZZZZZZZ9.99'},{av:'AV46TFDifValConA_To',fld:'vTFDIFVALCONA_TO',pic:'ZZZZZZZZ9.99'}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV13GridState',fld:'vGRIDSTATE',pic:''},{av:'AV15OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV16OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV45TFDifValConA',fld:'vTFDIFVALCONA',pic:'ZZZZZZZZ9.99'},{av:'AV46TFDifValConA_To',fld:'vTFDIFVALCONA_TO',pic:'ZZZZZZZZ9.99'},{av:'AV43TFPrdValConA',fld:'vTFPRDVALCONA',pic:'ZZZZZZZZ9.99'},{av:'AV44TFPrdValConA_To',fld:'vTFPRDVALCONA_TO',pic:'ZZZZZZZZ9.99'},{av:'AV41TFPrdValCprA',fld:'vTFPRDVALCPRA',pic:'ZZZZZZZZ9.99'},{av:'AV42TFPrdValCprA_To',fld:'vTFPRDVALCPRA_TO',pic:'ZZZZZZZZ9.99'},{av:'AV39TFPrdAcuConA',fld:'vTFPRDACUCONA',pic:'ZZZZZZ9.9999'},{av:'AV40TFPrdAcuConA_To',fld:'vTFPRDACUCONA_TO',pic:'ZZZZZZ9.9999'},{av:'AV37TFPrdAcuCprA',fld:'vTFPRDACUCPRA',pic:'ZZZZZZ9.99'},{av:'AV38TFPrdAcuCprA_To',fld:'vTFPRDACUCPRA_TO',pic:'ZZZZZZ9.99'},{av:'AV35TFPrdNumMes',fld:'vTFPRDNUMMES',pic:'Z9'},{av:'AV36TFPrdNumMes_To',fld:'vTFPRDNUMMES_TO',pic:'Z9'},{av:'AV33TFPrdAny',fld:'vTFPRDANY',pic:'ZZZ9'},{av:'AV34TFPrdAny_To',fld:'vTFPRDANY_TO',pic:'ZZZ9'},{av:'AV32TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV31TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV30TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV29TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV18FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e151MM2',iparms:[{av:'AV81Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV15OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV16OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV13GridState',fld:'vGRIDSTATE',pic:''},{av:'AV30TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV32TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV29TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV31TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV33TFPrdAny',fld:'vTFPRDANY',pic:'ZZZ9'},{av:'AV35TFPrdNumMes',fld:'vTFPRDNUMMES',pic:'Z9'},{av:'AV37TFPrdAcuCprA',fld:'vTFPRDACUCPRA',pic:'ZZZZZZ9.99'},{av:'AV39TFPrdAcuConA',fld:'vTFPRDACUCONA',pic:'ZZZZZZ9.9999'},{av:'AV41TFPrdValCprA',fld:'vTFPRDVALCPRA',pic:'ZZZZZZZZ9.99'},{av:'AV43TFPrdValConA',fld:'vTFPRDVALCONA',pic:'ZZZZZZZZ9.99'},{av:'AV45TFDifValConA',fld:'vTFDIFVALCONA',pic:'ZZZZZZZZ9.99'},{av:'AV34TFPrdAny_To',fld:'vTFPRDANY_TO',pic:'ZZZ9'},{av:'AV36TFPrdNumMes_To',fld:'vTFPRDNUMMES_TO',pic:'Z9'},{av:'AV38TFPrdAcuCprA_To',fld:'vTFPRDACUCPRA_TO',pic:'ZZZZZZ9.99'},{av:'AV40TFPrdAcuConA_To',fld:'vTFPRDACUCONA_TO',pic:'ZZZZZZ9.9999'},{av:'AV42TFPrdValCprA_To',fld:'vTFPRDVALCPRA_TO',pic:'ZZZZZZZZ9.99'},{av:'AV44TFPrdValConA_To',fld:'vTFPRDVALCONA_TO',pic:'ZZZZZZZZ9.99'},{av:'AV46TFDifValConA_To',fld:'vTFDIFVALCONA_TO',pic:'ZZZZZZZZ9.99'}]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'},{av:'AV13GridState',fld:'vGRIDSTATE',pic:''},{av:'AV15OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV16OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV45TFDifValConA',fld:'vTFDIFVALCONA',pic:'ZZZZZZZZ9.99'},{av:'AV46TFDifValConA_To',fld:'vTFDIFVALCONA_TO',pic:'ZZZZZZZZ9.99'},{av:'AV43TFPrdValConA',fld:'vTFPRDVALCONA',pic:'ZZZZZZZZ9.99'},{av:'AV44TFPrdValConA_To',fld:'vTFPRDVALCONA_TO',pic:'ZZZZZZZZ9.99'},{av:'AV41TFPrdValCprA',fld:'vTFPRDVALCPRA',pic:'ZZZZZZZZ9.99'},{av:'AV42TFPrdValCprA_To',fld:'vTFPRDVALCPRA_TO',pic:'ZZZZZZZZ9.99'},{av:'AV39TFPrdAcuConA',fld:'vTFPRDACUCONA',pic:'ZZZZZZ9.9999'},{av:'AV40TFPrdAcuConA_To',fld:'vTFPRDACUCONA_TO',pic:'ZZZZZZ9.9999'},{av:'AV37TFPrdAcuCprA',fld:'vTFPRDACUCPRA',pic:'ZZZZZZ9.99'},{av:'AV38TFPrdAcuCprA_To',fld:'vTFPRDACUCPRA_TO',pic:'ZZZZZZ9.99'},{av:'AV35TFPrdNumMes',fld:'vTFPRDNUMMES',pic:'Z9'},{av:'AV36TFPrdNumMes_To',fld:'vTFPRDNUMMES_TO',pic:'Z9'},{av:'AV33TFPrdAny',fld:'vTFPRDANY',pic:'ZZZ9'},{av:'AV34TFPrdAny_To',fld:'vTFPRDANY_TO',pic:'ZZZ9'},{av:'AV32TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV31TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV30TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV29TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV18FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e161MM2',iparms:[{av:'AV81Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV15OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV16OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV13GridState',fld:'vGRIDSTATE',pic:''},{av:'AV30TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV32TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV29TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV31TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV33TFPrdAny',fld:'vTFPRDANY',pic:'ZZZ9'},{av:'AV35TFPrdNumMes',fld:'vTFPRDNUMMES',pic:'Z9'},{av:'AV37TFPrdAcuCprA',fld:'vTFPRDACUCPRA',pic:'ZZZZZZ9.99'},{av:'AV39TFPrdAcuConA',fld:'vTFPRDACUCONA',pic:'ZZZZZZ9.9999'},{av:'AV41TFPrdValCprA',fld:'vTFPRDVALCPRA',pic:'ZZZZZZZZ9.99'},{av:'AV43TFPrdValConA',fld:'vTFPRDVALCONA',pic:'ZZZZZZZZ9.99'},{av:'AV45TFDifValConA',fld:'vTFDIFVALCONA',pic:'ZZZZZZZZ9.99'},{av:'AV34TFPrdAny_To',fld:'vTFPRDANY_TO',pic:'ZZZ9'},{av:'AV36TFPrdNumMes_To',fld:'vTFPRDNUMMES_TO',pic:'Z9'},{av:'AV38TFPrdAcuCprA_To',fld:'vTFPRDACUCPRA_TO',pic:'ZZZZZZ9.99'},{av:'AV40TFPrdAcuConA_To',fld:'vTFPRDACUCONA_TO',pic:'ZZZZZZ9.9999'},{av:'AV42TFPrdValCprA_To',fld:'vTFPRDVALCPRA_TO',pic:'ZZZZZZZZ9.99'},{av:'AV44TFPrdValConA_To',fld:'vTFPRDVALCONA_TO',pic:'ZZZZZZZZ9.99'},{av:'AV46TFDifValConA_To',fld:'vTFDIFVALCONA_TO',pic:'ZZZZZZZZ9.99'}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV13GridState',fld:'vGRIDSTATE',pic:''},{av:'AV15OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV16OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV45TFDifValConA',fld:'vTFDIFVALCONA',pic:'ZZZZZZZZ9.99'},{av:'AV46TFDifValConA_To',fld:'vTFDIFVALCONA_TO',pic:'ZZZZZZZZ9.99'},{av:'AV43TFPrdValConA',fld:'vTFPRDVALCONA',pic:'ZZZZZZZZ9.99'},{av:'AV44TFPrdValConA_To',fld:'vTFPRDVALCONA_TO',pic:'ZZZZZZZZ9.99'},{av:'AV41TFPrdValCprA',fld:'vTFPRDVALCPRA',pic:'ZZZZZZZZ9.99'},{av:'AV42TFPrdValCprA_To',fld:'vTFPRDVALCPRA_TO',pic:'ZZZZZZZZ9.99'},{av:'AV39TFPrdAcuConA',fld:'vTFPRDACUCONA',pic:'ZZZZZZ9.9999'},{av:'AV40TFPrdAcuConA_To',fld:'vTFPRDACUCONA_TO',pic:'ZZZZZZ9.9999'},{av:'AV37TFPrdAcuCprA',fld:'vTFPRDACUCPRA',pic:'ZZZZZZ9.99'},{av:'AV38TFPrdAcuCprA_To',fld:'vTFPRDACUCPRA_TO',pic:'ZZZZZZ9.99'},{av:'AV35TFPrdNumMes',fld:'vTFPRDNUMMES',pic:'Z9'},{av:'AV36TFPrdNumMes_To',fld:'vTFPRDNUMMES_TO',pic:'Z9'},{av:'AV33TFPrdAny',fld:'vTFPRDANY',pic:'ZZZ9'},{av:'AV34TFPrdAny_To',fld:'vTFPRDANY_TO',pic:'ZZZ9'},{av:'AV32TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV31TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV30TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV29TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV18FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV54PrdNumFrom',fld:'vPRDNUMFROM',pic:''},{av:'AV55PrdNumTo',fld:'vPRDNUMTO',pic:''},{av:'AV51Opcion',fld:'vOPCION',pic:'9'},{av:'sPrefix'},{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV18FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV29TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV30TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV31TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV32TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV33TFPrdAny',fld:'vTFPRDANY',pic:'ZZZ9'},{av:'AV34TFPrdAny_To',fld:'vTFPRDANY_TO',pic:'ZZZ9'},{av:'AV35TFPrdNumMes',fld:'vTFPRDNUMMES',pic:'Z9'},{av:'AV36TFPrdNumMes_To',fld:'vTFPRDNUMMES_TO',pic:'Z9'},{av:'AV37TFPrdAcuCprA',fld:'vTFPRDACUCPRA',pic:'ZZZZZZ9.99'},{av:'AV38TFPrdAcuCprA_To',fld:'vTFPRDACUCPRA_TO',pic:'ZZZZZZ9.99'},{av:'AV39TFPrdAcuConA',fld:'vTFPRDACUCONA',pic:'ZZZZZZ9.9999'},{av:'AV40TFPrdAcuConA_To',fld:'vTFPRDACUCONA_TO',pic:'ZZZZZZ9.9999'},{av:'AV41TFPrdValCprA',fld:'vTFPRDVALCPRA',pic:'ZZZZZZZZ9.99'},{av:'AV42TFPrdValCprA_To',fld:'vTFPRDVALCPRA_TO',pic:'ZZZZZZZZ9.99'},{av:'AV43TFPrdValConA',fld:'vTFPRDVALCONA',pic:'ZZZZZZZZ9.99'},{av:'AV44TFPrdValConA_To',fld:'vTFPRDVALCONA_TO',pic:'ZZZZZZZZ9.99'},{av:'AV45TFDifValConA',fld:'vTFDIFVALCONA',pic:'ZZZZZZZZ9.99'},{av:'AV46TFDifValConA_To',fld:'vTFDIFVALCONA_TO',pic:'ZZZZZZZZ9.99'},{av:'AV81Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV15OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV16OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtEmprCod_Visible',ctrl:'EMPRCOD',prop:'Visible'},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdAny_Visible',ctrl:'PRDANY',prop:'Visible'},{av:'edtPrdNumMes_Visible',ctrl:'PRDNUMMES',prop:'Visible'},{av:'edtPrdAcuCprA_Visible',ctrl:'PRDACUCPRA',prop:'Visible'},{av:'edtPrdAcuConA_Visible',ctrl:'PRDACUCONA',prop:'Visible'},{av:'edtPrdValCprA_Visible',ctrl:'PRDVALCPRA',prop:'Visible'},{av:'edtPrdValConA_Visible',ctrl:'PRDVALCONA',prop:'Visible'},{av:'edtDifValConA_Visible',ctrl:'DIFVALCONA',prop:'Visible'},{av:'AV26ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV13GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV54PrdNumFrom',fld:'vPRDNUMFROM',pic:''},{av:'AV55PrdNumTo',fld:'vPRDNUMTO',pic:''},{av:'AV51Opcion',fld:'vOPCION',pic:'9'},{av:'sPrefix'},{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV18FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV29TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV30TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV31TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV32TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV33TFPrdAny',fld:'vTFPRDANY',pic:'ZZZ9'},{av:'AV34TFPrdAny_To',fld:'vTFPRDANY_TO',pic:'ZZZ9'},{av:'AV35TFPrdNumMes',fld:'vTFPRDNUMMES',pic:'Z9'},{av:'AV36TFPrdNumMes_To',fld:'vTFPRDNUMMES_TO',pic:'Z9'},{av:'AV37TFPrdAcuCprA',fld:'vTFPRDACUCPRA',pic:'ZZZZZZ9.99'},{av:'AV38TFPrdAcuCprA_To',fld:'vTFPRDACUCPRA_TO',pic:'ZZZZZZ9.99'},{av:'AV39TFPrdAcuConA',fld:'vTFPRDACUCONA',pic:'ZZZZZZ9.9999'},{av:'AV40TFPrdAcuConA_To',fld:'vTFPRDACUCONA_TO',pic:'ZZZZZZ9.9999'},{av:'AV41TFPrdValCprA',fld:'vTFPRDVALCPRA',pic:'ZZZZZZZZ9.99'},{av:'AV42TFPrdValCprA_To',fld:'vTFPRDVALCPRA_TO',pic:'ZZZZZZZZ9.99'},{av:'AV43TFPrdValConA',fld:'vTFPRDVALCONA',pic:'ZZZZZZZZ9.99'},{av:'AV44TFPrdValConA_To',fld:'vTFPRDVALCONA_TO',pic:'ZZZZZZZZ9.99'},{av:'AV45TFDifValConA',fld:'vTFDIFVALCONA',pic:'ZZZZZZZZ9.99'},{av:'AV46TFDifValConA_To',fld:'vTFDIFVALCONA_TO',pic:'ZZZZZZZZ9.99'},{av:'AV81Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV15OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV16OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtEmprCod_Visible',ctrl:'EMPRCOD',prop:'Visible'},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdAny_Visible',ctrl:'PRDANY',prop:'Visible'},{av:'edtPrdNumMes_Visible',ctrl:'PRDNUMMES',prop:'Visible'},{av:'edtPrdAcuCprA_Visible',ctrl:'PRDACUCPRA',prop:'Visible'},{av:'edtPrdAcuConA_Visible',ctrl:'PRDACUCONA',prop:'Visible'},{av:'edtPrdValCprA_Visible',ctrl:'PRDVALCPRA',prop:'Visible'},{av:'edtPrdValConA_Visible',ctrl:'PRDVALCONA',prop:'Visible'},{av:'edtDifValConA_Visible',ctrl:'DIFVALCONA',prop:'Visible'},{av:'AV26ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV13GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV54PrdNumFrom',fld:'vPRDNUMFROM',pic:''},{av:'AV55PrdNumTo',fld:'vPRDNUMTO',pic:''},{av:'AV51Opcion',fld:'vOPCION',pic:'9'},{av:'sPrefix'},{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV18FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV29TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV30TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV31TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV32TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV33TFPrdAny',fld:'vTFPRDANY',pic:'ZZZ9'},{av:'AV34TFPrdAny_To',fld:'vTFPRDANY_TO',pic:'ZZZ9'},{av:'AV35TFPrdNumMes',fld:'vTFPRDNUMMES',pic:'Z9'},{av:'AV36TFPrdNumMes_To',fld:'vTFPRDNUMMES_TO',pic:'Z9'},{av:'AV37TFPrdAcuCprA',fld:'vTFPRDACUCPRA',pic:'ZZZZZZ9.99'},{av:'AV38TFPrdAcuCprA_To',fld:'vTFPRDACUCPRA_TO',pic:'ZZZZZZ9.99'},{av:'AV39TFPrdAcuConA',fld:'vTFPRDACUCONA',pic:'ZZZZZZ9.9999'},{av:'AV40TFPrdAcuConA_To',fld:'vTFPRDACUCONA_TO',pic:'ZZZZZZ9.9999'},{av:'AV41TFPrdValCprA',fld:'vTFPRDVALCPRA',pic:'ZZZZZZZZ9.99'},{av:'AV42TFPrdValCprA_To',fld:'vTFPRDVALCPRA_TO',pic:'ZZZZZZZZ9.99'},{av:'AV43TFPrdValConA',fld:'vTFPRDVALCONA',pic:'ZZZZZZZZ9.99'},{av:'AV44TFPrdValConA_To',fld:'vTFPRDVALCONA_TO',pic:'ZZZZZZZZ9.99'},{av:'AV45TFDifValConA',fld:'vTFDIFVALCONA',pic:'ZZZZZZZZ9.99'},{av:'AV46TFDifValConA_To',fld:'vTFDIFVALCONA_TO',pic:'ZZZZZZZZ9.99'},{av:'AV81Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV15OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV16OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtEmprCod_Visible',ctrl:'EMPRCOD',prop:'Visible'},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdAny_Visible',ctrl:'PRDANY',prop:'Visible'},{av:'edtPrdNumMes_Visible',ctrl:'PRDNUMMES',prop:'Visible'},{av:'edtPrdAcuCprA_Visible',ctrl:'PRDACUCPRA',prop:'Visible'},{av:'edtPrdAcuConA_Visible',ctrl:'PRDACUCONA',prop:'Visible'},{av:'edtPrdValCprA_Visible',ctrl:'PRDVALCPRA',prop:'Visible'},{av:'edtPrdValConA_Visible',ctrl:'PRDVALCONA',prop:'Visible'},{av:'edtDifValConA_Visible',ctrl:'DIFVALCONA',prop:'Visible'},{av:'AV26ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV13GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV54PrdNumFrom',fld:'vPRDNUMFROM',pic:''},{av:'AV55PrdNumTo',fld:'vPRDNUMTO',pic:''},{av:'AV51Opcion',fld:'vOPCION',pic:'9'},{av:'sPrefix'},{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV18FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV29TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV30TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV31TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV32TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV33TFPrdAny',fld:'vTFPRDANY',pic:'ZZZ9'},{av:'AV34TFPrdAny_To',fld:'vTFPRDANY_TO',pic:'ZZZ9'},{av:'AV35TFPrdNumMes',fld:'vTFPRDNUMMES',pic:'Z9'},{av:'AV36TFPrdNumMes_To',fld:'vTFPRDNUMMES_TO',pic:'Z9'},{av:'AV37TFPrdAcuCprA',fld:'vTFPRDACUCPRA',pic:'ZZZZZZ9.99'},{av:'AV38TFPrdAcuCprA_To',fld:'vTFPRDACUCPRA_TO',pic:'ZZZZZZ9.99'},{av:'AV39TFPrdAcuConA',fld:'vTFPRDACUCONA',pic:'ZZZZZZ9.9999'},{av:'AV40TFPrdAcuConA_To',fld:'vTFPRDACUCONA_TO',pic:'ZZZZZZ9.9999'},{av:'AV41TFPrdValCprA',fld:'vTFPRDVALCPRA',pic:'ZZZZZZZZ9.99'},{av:'AV42TFPrdValCprA_To',fld:'vTFPRDVALCPRA_TO',pic:'ZZZZZZZZ9.99'},{av:'AV43TFPrdValConA',fld:'vTFPRDVALCONA',pic:'ZZZZZZZZ9.99'},{av:'AV44TFPrdValConA_To',fld:'vTFPRDVALCONA_TO',pic:'ZZZZZZZZ9.99'},{av:'AV45TFDifValConA',fld:'vTFDIFVALCONA',pic:'ZZZZZZZZ9.99'},{av:'AV46TFDifValConA_To',fld:'vTFDIFVALCONA_TO',pic:'ZZZZZZZZ9.99'},{av:'AV81Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV15OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV16OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtEmprCod_Visible',ctrl:'EMPRCOD',prop:'Visible'},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdAny_Visible',ctrl:'PRDANY',prop:'Visible'},{av:'edtPrdNumMes_Visible',ctrl:'PRDNUMMES',prop:'Visible'},{av:'edtPrdAcuCprA_Visible',ctrl:'PRDACUCPRA',prop:'Visible'},{av:'edtPrdAcuConA_Visible',ctrl:'PRDACUCONA',prop:'Visible'},{av:'edtPrdValCprA_Visible',ctrl:'PRDVALCPRA',prop:'Visible'},{av:'edtPrdValConA_Visible',ctrl:'PRDVALCONA',prop:'Visible'},{av:'edtDifValConA_Visible',ctrl:'DIFVALCONA',prop:'Visible'},{av:'AV26ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV13GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[]");
      setEventMetadata("VALID_PRDNUM",",oparms:[]}");
      setEventMetadata("VALID_PRDANY","{handler:'valid_Prdany',iparms:[]");
      setEventMetadata("VALID_PRDANY",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Difvalcona',iparms:[]");
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
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV18FilterFullText = "" ;
      AV54PrdNumFrom = "" ;
      AV55PrdNumTo = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV29TFEmprCod = "" ;
      AV30TFEmprCod_Sel = "" ;
      AV31TFPrdNum = "" ;
      AV32TFPrdNum_Sel = "" ;
      AV37TFPrdAcuCprA = DecimalUtil.ZERO ;
      AV38TFPrdAcuCprA_To = DecimalUtil.ZERO ;
      AV39TFPrdAcuConA = DecimalUtil.ZERO ;
      AV40TFPrdAcuConA_To = DecimalUtil.ZERO ;
      AV41TFPrdValCprA = DecimalUtil.ZERO ;
      AV42TFPrdValCprA_To = DecimalUtil.ZERO ;
      AV43TFPrdValConA = DecimalUtil.ZERO ;
      AV44TFPrdValConA_To = DecimalUtil.ZERO ;
      AV45TFDifValConA = DecimalUtil.ZERO ;
      AV46TFDifValConA_To = DecimalUtil.ZERO ;
      AV81Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV26ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV47DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV13GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
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
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportreport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucInnewwindow1 = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV62Consumoprdquimicos_wcds_1_filterfulltext = "" ;
      AV63Consumoprdquimicos_wcds_2_tfemprcod = "" ;
      AV64Consumoprdquimicos_wcds_3_tfemprcod_sel = "" ;
      AV65Consumoprdquimicos_wcds_4_tfprdnum = "" ;
      AV66Consumoprdquimicos_wcds_5_tfprdnum_sel = "" ;
      AV71Consumoprdquimicos_wcds_10_tfprdacucpra = DecimalUtil.ZERO ;
      AV72Consumoprdquimicos_wcds_11_tfprdacucpra_to = DecimalUtil.ZERO ;
      AV73Consumoprdquimicos_wcds_12_tfprdacucona = DecimalUtil.ZERO ;
      AV74Consumoprdquimicos_wcds_13_tfprdacucona_to = DecimalUtil.ZERO ;
      AV75Consumoprdquimicos_wcds_14_tfprdvalcpra = DecimalUtil.ZERO ;
      AV76Consumoprdquimicos_wcds_15_tfprdvalcpra_to = DecimalUtil.ZERO ;
      AV77Consumoprdquimicos_wcds_16_tfprdvalcona = DecimalUtil.ZERO ;
      AV78Consumoprdquimicos_wcds_17_tfprdvalcona_to = DecimalUtil.ZERO ;
      AV79Consumoprdquimicos_wcds_18_tfdifvalcona = DecimalUtil.ZERO ;
      AV80Consumoprdquimicos_wcds_19_tfdifvalcona_to = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      A677PrdAcuCprA = DecimalUtil.ZERO ;
      A676PrdAcuConA = DecimalUtil.ZERO ;
      A748PrdValCprA = DecimalUtil.ZERO ;
      A746PrdValConA = DecimalUtil.ZERO ;
      A331DifValConA = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      lV62Consumoprdquimicos_wcds_1_filterfulltext = "" ;
      lV63Consumoprdquimicos_wcds_2_tfemprcod = "" ;
      lV65Consumoprdquimicos_wcds_4_tfprdnum = "" ;
      H01MM3_A331DifValConA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01MM3_n331DifValConA = new boolean[] {false} ;
      H01MM3_A676PrdAcuConA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01MM3_A681PrdAny = new short[1] ;
      H01MM3_A719PrdNum = new String[] {""} ;
      H01MM3_A396EmprCod = new String[] {""} ;
      H01MM3_A746PrdValConA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01MM3_A748PrdValCprA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01MM3_A677PrdAcuCprA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01MM5_AGRID_nRecordCount = new long[1] ;
      AV58Station = "" ;
      AV59Emprcod = "" ;
      GXv_char2 = new String[1] ;
      AV60Emprnom = "" ;
      AV61Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV25Session = httpContext.getWebSession();
      AV21ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV27ManageFiltersXml = "" ;
      AV19ExcelFilename = "" ;
      AV20ErrorMessage = "" ;
      AV22UserCustomValue = "" ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = new GXBaseCollection[1] ;
      AV14GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char12 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char3 = new String[1] ;
      GXv_SdtWWPGridState13 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV11TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV10HTTPRequest = httpContext.getHttpRequest();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV5Anyo = "" ;
      sCtrlAV6MesI = "" ;
      sCtrlAV7MesF = "" ;
      sCtrlAV51Opcion = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.consumoprdquimicos_wc__default(),
         new Object[] {
             new Object[] {
            H01MM3_A331DifValConA, H01MM3_n331DifValConA, H01MM3_A676PrdAcuConA, H01MM3_A681PrdAny, H01MM3_A719PrdNum, H01MM3_A396EmprCod, H01MM3_A746PrdValConA, H01MM3_A748PrdValCprA, H01MM3_A677PrdAcuCprA
            }
            , new Object[] {
            H01MM5_AGRID_nRecordCount
            }
         }
      );
      AV81Pgmname = "ConsumoPrdQuimicos_WC" ;
      /* GeneXus formulas. */
      AV81Pgmname = "ConsumoPrdQuimicos_WC" ;
      Gx_err = (short)(0) ;
   }

   private byte wcpOAV6MesI ;
   private byte wcpOAV7MesF ;
   private byte wcpOAV51Opcion ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV6MesI ;
   private byte AV7MesF ;
   private byte AV51Opcion ;
   private byte AV28ManageFiltersExecutionStep ;
   private byte AV35TFPrdNumMes ;
   private byte AV36TFPrdNumMes_To ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte AV69Consumoprdquimicos_wcds_8_tfprdnummes ;
   private byte AV70Consumoprdquimicos_wcds_9_tfprdnummes_to ;
   private byte A720PrdNumMes ;
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
   private short wcpOAV5Anyo ;
   private short AV5Anyo ;
   private short AV33TFPrdAny ;
   private short AV34TFPrdAny_To ;
   private short AV15OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV67Consumoprdquimicos_wcds_6_tfprdany ;
   private short AV68Consumoprdquimicos_wcds_7_tfprdany_to ;
   private short A681PrdAny ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int nRC_GXsfl_40 ;
   private int subGrid_Rows ;
   private int nGXsfl_40_idx=1 ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int edtEmprCod_Visible ;
   private int edtPrdNum_Visible ;
   private int edtPrdAny_Visible ;
   private int edtPrdNumMes_Visible ;
   private int edtPrdAcuCprA_Visible ;
   private int edtPrdAcuConA_Visible ;
   private int edtPrdValCprA_Visible ;
   private int edtPrdValConA_Visible ;
   private int edtDifValConA_Visible ;
   private int AV82GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV37TFPrdAcuCprA ;
   private java.math.BigDecimal AV38TFPrdAcuCprA_To ;
   private java.math.BigDecimal AV39TFPrdAcuConA ;
   private java.math.BigDecimal AV40TFPrdAcuConA_To ;
   private java.math.BigDecimal AV41TFPrdValCprA ;
   private java.math.BigDecimal AV42TFPrdValCprA_To ;
   private java.math.BigDecimal AV43TFPrdValConA ;
   private java.math.BigDecimal AV44TFPrdValConA_To ;
   private java.math.BigDecimal AV45TFDifValConA ;
   private java.math.BigDecimal AV46TFDifValConA_To ;
   private java.math.BigDecimal AV71Consumoprdquimicos_wcds_10_tfprdacucpra ;
   private java.math.BigDecimal AV72Consumoprdquimicos_wcds_11_tfprdacucpra_to ;
   private java.math.BigDecimal AV73Consumoprdquimicos_wcds_12_tfprdacucona ;
   private java.math.BigDecimal AV74Consumoprdquimicos_wcds_13_tfprdacucona_to ;
   private java.math.BigDecimal AV75Consumoprdquimicos_wcds_14_tfprdvalcpra ;
   private java.math.BigDecimal AV76Consumoprdquimicos_wcds_15_tfprdvalcpra_to ;
   private java.math.BigDecimal AV77Consumoprdquimicos_wcds_16_tfprdvalcona ;
   private java.math.BigDecimal AV78Consumoprdquimicos_wcds_17_tfprdvalcona_to ;
   private java.math.BigDecimal AV79Consumoprdquimicos_wcds_18_tfdifvalcona ;
   private java.math.BigDecimal AV80Consumoprdquimicos_wcds_19_tfdifvalcona_to ;
   private java.math.BigDecimal A677PrdAcuCprA ;
   private java.math.BigDecimal A676PrdAcuConA ;
   private java.math.BigDecimal A748PrdValCprA ;
   private java.math.BigDecimal A746PrdValConA ;
   private java.math.BigDecimal A331DifValConA ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String sGXsfl_40_idx="0001" ;
   private String AV54PrdNumFrom ;
   private String AV55PrdNumTo ;
   private String AV29TFEmprCod ;
   private String AV30TFEmprCod_Sel ;
   private String AV31TFPrdNum ;
   private String AV32TFPrdNum_Sel ;
   private String AV81Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Ddo_managefilters_Icontype ;
   private String Ddo_managefilters_Icon ;
   private String Ddo_managefilters_Tooltip ;
   private String Ddo_managefilters_Cls ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
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
   private String Grid_empowerer_Infinitescrolling ;
   private String GX_FocusControl ;
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
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Innewwindow1_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavFilterfulltext_Internalname ;
   private String AV63Consumoprdquimicos_wcds_2_tfemprcod ;
   private String AV64Consumoprdquimicos_wcds_3_tfemprcod_sel ;
   private String AV65Consumoprdquimicos_wcds_4_tfprdnum ;
   private String AV66Consumoprdquimicos_wcds_5_tfprdnum_sel ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String A719PrdNum ;
   private String edtPrdNum_Internalname ;
   private String edtPrdAny_Internalname ;
   private String edtPrdNumMes_Internalname ;
   private String edtPrdAcuCprA_Internalname ;
   private String edtPrdAcuConA_Internalname ;
   private String edtPrdValCprA_Internalname ;
   private String edtPrdValConA_Internalname ;
   private String edtDifValConA_Internalname ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String lV63Consumoprdquimicos_wcds_2_tfemprcod ;
   private String lV65Consumoprdquimicos_wcds_4_tfprdnum ;
   private String AV58Station ;
   private String AV59Emprcod ;
   private String GXv_char2[] ;
   private String AV60Emprnom ;
   private String AV61Usurcod ;
   private String GXt_char12 ;
   private String GXv_char4[] ;
   private String GXt_char1 ;
   private String GXv_char3[] ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV5Anyo ;
   private String sCtrlAV6MesI ;
   private String sCtrlAV7MesF ;
   private String sCtrlAV51Opcion ;
   private String sGXsfl_40_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtEmprCod_Jsonclick ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdAny_Jsonclick ;
   private String edtPrdNumMes_Jsonclick ;
   private String edtPrdAcuCprA_Jsonclick ;
   private String edtPrdAcuConA_Jsonclick ;
   private String edtPrdValCprA_Jsonclick ;
   private String edtPrdValConA_Jsonclick ;
   private String edtDifValConA_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV16OrderedDsc ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n331DifValConA ;
   private boolean bGXsfl_40_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV21ColumnsSelectorXML ;
   private String AV27ManageFiltersXml ;
   private String AV22UserCustomValue ;
   private String AV18FilterFullText ;
   private String AV62Consumoprdquimicos_wcds_1_filterfulltext ;
   private String lV62Consumoprdquimicos_wcds_1_filterfulltext ;
   private String AV19ExcelFilename ;
   private String AV20ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV10HTTPRequest ;
   private com.genexus.webpanels.WebSession AV25Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucInnewwindow1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] H01MM3_A331DifValConA ;
   private boolean[] H01MM3_n331DifValConA ;
   private java.math.BigDecimal[] H01MM3_A676PrdAcuConA ;
   private short[] H01MM3_A681PrdAny ;
   private String[] H01MM3_A719PrdNum ;
   private String[] H01MM3_A396EmprCod ;
   private java.math.BigDecimal[] H01MM3_A746PrdValConA ;
   private java.math.BigDecimal[] H01MM3_A748PrdValCprA ;
   private java.math.BigDecimal[] H01MM3_A677PrdAcuCprA ;
   private long[] H01MM5_AGRID_nRecordCount ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV26ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV11TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV13GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState13[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV14GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV47DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class consumoprdquimicos_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01MM3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV62Consumoprdquimicos_wcds_1_filterfulltext ,
                                          String AV64Consumoprdquimicos_wcds_3_tfemprcod_sel ,
                                          String AV63Consumoprdquimicos_wcds_2_tfemprcod ,
                                          String AV66Consumoprdquimicos_wcds_5_tfprdnum_sel ,
                                          String AV65Consumoprdquimicos_wcds_4_tfprdnum ,
                                          short AV67Consumoprdquimicos_wcds_6_tfprdany ,
                                          short AV68Consumoprdquimicos_wcds_7_tfprdany_to ,
                                          byte AV69Consumoprdquimicos_wcds_8_tfprdnummes ,
                                          byte AV70Consumoprdquimicos_wcds_9_tfprdnummes_to ,
                                          java.math.BigDecimal AV71Consumoprdquimicos_wcds_10_tfprdacucpra ,
                                          java.math.BigDecimal AV72Consumoprdquimicos_wcds_11_tfprdacucpra_to ,
                                          java.math.BigDecimal AV73Consumoprdquimicos_wcds_12_tfprdacucona ,
                                          java.math.BigDecimal AV74Consumoprdquimicos_wcds_13_tfprdacucona_to ,
                                          java.math.BigDecimal AV75Consumoprdquimicos_wcds_14_tfprdvalcpra ,
                                          java.math.BigDecimal AV76Consumoprdquimicos_wcds_15_tfprdvalcpra_to ,
                                          java.math.BigDecimal AV77Consumoprdquimicos_wcds_16_tfprdvalcona ,
                                          java.math.BigDecimal AV78Consumoprdquimicos_wcds_17_tfprdvalcona_to ,
                                          java.math.BigDecimal AV79Consumoprdquimicos_wcds_18_tfdifvalcona ,
                                          java.math.BigDecimal AV80Consumoprdquimicos_wcds_19_tfdifvalcona_to ,
                                          byte AV51Opcion ,
                                          String A396EmprCod ,
                                          String A719PrdNum ,
                                          short A681PrdAny ,
                                          byte A720PrdNumMes ,
                                          java.math.BigDecimal A677PrdAcuCprA ,
                                          java.math.BigDecimal A676PrdAcuConA ,
                                          java.math.BigDecimal A748PrdValCprA ,
                                          java.math.BigDecimal A746PrdValConA ,
                                          java.math.BigDecimal A331DifValConA ,
                                          String AV54PrdNumFrom ,
                                          String AV55PrdNumTo ,
                                          short AV15OrderedBy ,
                                          boolean AV16OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[23];
      Object[] GXv_Object15 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " /*+ FIRST_ROWS(51) */ T1.DifValConA, T1.PrdAcuConA, T1.PrdAny, T1.PrdNum, T1.EmprCod, COALESCE( T2.PrdValConA, 0) AS PrdValConA, COALESCE( T2.PrdValCprA, 0) AS" ;
      sSelectString += " PrdValCprA, COALESCE( T2.PrdAcuCprA, 0) AS PrdAcuCprA" ;
      sFromString = " FROM (TXPCPRDES T1 LEFT JOIN (SELECT SUM(PrdValConM) AS PrdValConA, EmprCod, PrdNum, PrdAny, SUM(PrdValCprM) AS PrdValCprA, SUM(PrdUniCprM) AS PrdAcuCprA FROM TXPLPRDES" ;
      sFromString += " GROUP BY EmprCod, PrdNum, PrdAny ) T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum AND T2.PrdAny = T1.PrdAny)" ;
      sOrderString = "" ;
      if ( (GXutil.strcmp("", AV64Consumoprdquimicos_wcds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV63Consumoprdquimicos_wcds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Consumoprdquimicos_wcds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int14[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Consumoprdquimicos_wcds_5_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV65Consumoprdquimicos_wcds_4_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Consumoprdquimicos_wcds_5_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int14[3] = (byte)(1) ;
      }
      if ( ! (0==AV67Consumoprdquimicos_wcds_6_tfprdany) )
      {
         addWhere(sWhereString, "(T1.PrdAny >= ?)");
      }
      else
      {
         GXv_int14[4] = (byte)(1) ;
      }
      if ( ! (0==AV68Consumoprdquimicos_wcds_7_tfprdany_to) )
      {
         addWhere(sWhereString, "(T1.PrdAny <= ?)");
      }
      else
      {
         GXv_int14[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Consumoprdquimicos_wcds_10_tfprdacucpra)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.PrdAcuCprA, 0) >= ?)");
      }
      else
      {
         GXv_int14[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Consumoprdquimicos_wcds_11_tfprdacucpra_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.PrdAcuCprA, 0) <= ?)");
      }
      else
      {
         GXv_int14[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Consumoprdquimicos_wcds_12_tfprdacucona)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAcuConA >= ?)");
      }
      else
      {
         GXv_int14[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Consumoprdquimicos_wcds_13_tfprdacucona_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAcuConA <= ?)");
      }
      else
      {
         GXv_int14[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Consumoprdquimicos_wcds_14_tfprdvalcpra)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.PrdValCprA, 0) >= ?)");
      }
      else
      {
         GXv_int14[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Consumoprdquimicos_wcds_15_tfprdvalcpra_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.PrdValCprA, 0) <= ?)");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Consumoprdquimicos_wcds_16_tfprdvalcona)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.PrdValConA, 0) >= ?)");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Consumoprdquimicos_wcds_17_tfprdvalcona_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.PrdValConA, 0) <= ?)");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Consumoprdquimicos_wcds_18_tfdifvalcona)==0) )
      {
         addWhere(sWhereString, "(T1.DifValConA >= ?)");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Consumoprdquimicos_wcds_19_tfdifvalcona_to)==0) )
      {
         addWhere(sWhereString, "(T1.DifValConA <= ?)");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( AV51Opcion > 1 )
      {
         addWhere(sWhereString, "(T1.PrdNum >= ? and T1.PrdNum <= ?)");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
         GXv_int14[17] = (byte)(1) ;
      }
      if ( ( AV15OrderedBy == 1 ) && ! AV16OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod" ;
      }
      else if ( ( AV15OrderedBy == 1 ) && ( AV16OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC" ;
      }
      else if ( ( AV15OrderedBy == 2 ) && ! AV16OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV15OrderedBy == 2 ) && ( AV16OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV15OrderedBy == 3 ) && ! AV16OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PrdAny" ;
      }
      else if ( ( AV15OrderedBy == 3 ) && ( AV16OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PrdAny DESC" ;
      }
      else if ( ( AV15OrderedBy == 4 ) && ! AV16OrderedDsc )
      {
         sOrderString += "" ;
      }
      else if ( ( AV15OrderedBy == 4 ) && ( AV16OrderedDsc ) )
      {
         sOrderString += "" ;
      }
      else if ( ( AV15OrderedBy == 5 ) && ! AV16OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PrdAcuConA" ;
      }
      else if ( ( AV15OrderedBy == 5 ) && ( AV16OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PrdAcuConA DESC" ;
      }
      else if ( ( AV15OrderedBy == 6 ) && ! AV16OrderedDsc )
      {
         sOrderString += " ORDER BY T1.DifValConA" ;
      }
      else if ( ( AV15OrderedBy == 6 ) && ( AV16OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.DifValConA DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.PrdNum, T1.PrdAny" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_H01MM5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV62Consumoprdquimicos_wcds_1_filterfulltext ,
                                          String AV64Consumoprdquimicos_wcds_3_tfemprcod_sel ,
                                          String AV63Consumoprdquimicos_wcds_2_tfemprcod ,
                                          String AV66Consumoprdquimicos_wcds_5_tfprdnum_sel ,
                                          String AV65Consumoprdquimicos_wcds_4_tfprdnum ,
                                          short AV67Consumoprdquimicos_wcds_6_tfprdany ,
                                          short AV68Consumoprdquimicos_wcds_7_tfprdany_to ,
                                          byte AV69Consumoprdquimicos_wcds_8_tfprdnummes ,
                                          byte AV70Consumoprdquimicos_wcds_9_tfprdnummes_to ,
                                          java.math.BigDecimal AV71Consumoprdquimicos_wcds_10_tfprdacucpra ,
                                          java.math.BigDecimal AV72Consumoprdquimicos_wcds_11_tfprdacucpra_to ,
                                          java.math.BigDecimal AV73Consumoprdquimicos_wcds_12_tfprdacucona ,
                                          java.math.BigDecimal AV74Consumoprdquimicos_wcds_13_tfprdacucona_to ,
                                          java.math.BigDecimal AV75Consumoprdquimicos_wcds_14_tfprdvalcpra ,
                                          java.math.BigDecimal AV76Consumoprdquimicos_wcds_15_tfprdvalcpra_to ,
                                          java.math.BigDecimal AV77Consumoprdquimicos_wcds_16_tfprdvalcona ,
                                          java.math.BigDecimal AV78Consumoprdquimicos_wcds_17_tfprdvalcona_to ,
                                          java.math.BigDecimal AV79Consumoprdquimicos_wcds_18_tfdifvalcona ,
                                          java.math.BigDecimal AV80Consumoprdquimicos_wcds_19_tfdifvalcona_to ,
                                          byte AV51Opcion ,
                                          String A396EmprCod ,
                                          String A719PrdNum ,
                                          short A681PrdAny ,
                                          byte A720PrdNumMes ,
                                          java.math.BigDecimal A677PrdAcuCprA ,
                                          java.math.BigDecimal A676PrdAcuConA ,
                                          java.math.BigDecimal A748PrdValCprA ,
                                          java.math.BigDecimal A746PrdValConA ,
                                          java.math.BigDecimal A331DifValConA ,
                                          String AV54PrdNumFrom ,
                                          String AV55PrdNumTo ,
                                          short AV15OrderedBy ,
                                          boolean AV16OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[18];
      Object[] GXv_Object17 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPCPRDES T1 LEFT JOIN (SELECT SUM(PrdValConM) AS PrdValConA, EmprCod, PrdNum, PrdAny, SUM(PrdValCprM) AS PrdValCprA, SUM(PrdUniCprM) AS PrdAcuCprA" ;
      scmdbuf += " FROM TXPLPRDES GROUP BY EmprCod, PrdNum, PrdAny ) T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum AND T2.PrdAny = T1.PrdAny)" ;
      if ( (GXutil.strcmp("", AV64Consumoprdquimicos_wcds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV63Consumoprdquimicos_wcds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Consumoprdquimicos_wcds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int16[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Consumoprdquimicos_wcds_5_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV65Consumoprdquimicos_wcds_4_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Consumoprdquimicos_wcds_5_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int16[3] = (byte)(1) ;
      }
      if ( ! (0==AV67Consumoprdquimicos_wcds_6_tfprdany) )
      {
         addWhere(sWhereString, "(T1.PrdAny >= ?)");
      }
      else
      {
         GXv_int16[4] = (byte)(1) ;
      }
      if ( ! (0==AV68Consumoprdquimicos_wcds_7_tfprdany_to) )
      {
         addWhere(sWhereString, "(T1.PrdAny <= ?)");
      }
      else
      {
         GXv_int16[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Consumoprdquimicos_wcds_12_tfprdacucona)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAcuConA >= ?)");
      }
      else
      {
         GXv_int16[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Consumoprdquimicos_wcds_13_tfprdacucona_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAcuConA <= ?)");
      }
      else
      {
         GXv_int16[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Consumoprdquimicos_wcds_18_tfdifvalcona)==0) )
      {
         addWhere(sWhereString, "(T1.DifValConA >= ?)");
      }
      else
      {
         GXv_int16[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Consumoprdquimicos_wcds_19_tfdifvalcona_to)==0) )
      {
         addWhere(sWhereString, "(T1.DifValConA <= ?)");
      }
      else
      {
         GXv_int16[9] = (byte)(1) ;
      }
      if ( AV51Opcion > 1 )
      {
         addWhere(sWhereString, "(T1.PrdNum >= ? and T1.PrdNum <= ?)");
      }
      else
      {
         GXv_int16[10] = (byte)(1) ;
         GXv_int16[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV15OrderedBy == 1 ) && ! AV16OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV15OrderedBy == 1 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV15OrderedBy == 2 ) && ! AV16OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV15OrderedBy == 2 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV15OrderedBy == 3 ) && ! AV16OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV15OrderedBy == 3 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV15OrderedBy == 4 ) && ! AV16OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV15OrderedBy == 4 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV15OrderedBy == 5 ) && ! AV16OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV15OrderedBy == 5 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV15OrderedBy == 6 ) && ! AV16OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV15OrderedBy == 6 ) && ( AV16OrderedDsc ) )
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
                  return conditional_H01MM3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).byteValue() , ((Number) dynConstraints[8]).byteValue() , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).byteValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , ((Number) dynConstraints[23]).byteValue() , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).shortValue() , ((Boolean) dynConstraints[32]).booleanValue() );
            case 1 :
                  return conditional_H01MM5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).byteValue() , ((Number) dynConstraints[8]).byteValue() , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).byteValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , ((Number) dynConstraints[23]).byteValue() , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).shortValue() , ((Boolean) dynConstraints[32]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01MM3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,51, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01MM5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,4);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
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
                  stmt.setString(sIdx, (String)parms[23], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 2);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 2);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 4);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 6);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[22]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 2);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[26], 4);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 6);
               }
               return;
      }
   }

}

