package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class listaprd_wc_impl extends GXWebComponent
{
   public listaprd_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public listaprd_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( listaprd_wc_impl.class ));
   }

   public listaprd_wc_impl( int remoteHandle ,
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
      cmbPrdOkotex = new HTMLChoice();
      cmbPrdList = new HTMLChoice();
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
               AV282EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV282EmprCod", AV282EmprCod);
               AV283PrdNumFrom = httpContext.GetPar( "PrdNumFrom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV283PrdNumFrom", AV283PrdNumFrom);
               AV284PrdNumTo = httpContext.GetPar( "PrdNumTo") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV284PrdNumTo", AV284PrdNumTo);
               AV285PrvNumFrom = (int)(GXutil.lval( httpContext.GetPar( "PrvNumFrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV285PrvNumFrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV285PrvNumFrom), 6, 0));
               AV286PrvNumTo = (int)(GXutil.lval( httpContext.GetPar( "PrvNumTo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV286PrvNumTo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV286PrvNumTo), 6, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV282EmprCod,AV283PrdNumFrom,AV284PrdNumTo,Integer.valueOf(AV285PrvNumFrom),Integer.valueOf(AV286PrvNumTo)});
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
      nRC_GXsfl_45 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_45"))) ;
      nGXsfl_45_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_45_idx"))) ;
      sGXsfl_45_idx = httpContext.GetPar( "sGXsfl_45_idx") ;
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
      AV282EmprCod = httpContext.GetPar( "EmprCod") ;
      AV283PrdNumFrom = httpContext.GetPar( "PrdNumFrom") ;
      AV284PrdNumTo = httpContext.GetPar( "PrdNumTo") ;
      AV285PrvNumFrom = (int)(GXutil.lval( httpContext.GetPar( "PrvNumFrom"))) ;
      AV286PrvNumTo = (int)(GXutil.lval( httpContext.GetPar( "PrvNumTo"))) ;
      AV25ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV20ColumnsSelector);
      AV15FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV26TFPrdNum = httpContext.GetPar( "TFPrdNum") ;
      AV27TFPrdNum_Sel = httpContext.GetPar( "TFPrdNum_Sel") ;
      AV28TFPrdNom = httpContext.GetPar( "TFPrdNom") ;
      AV29TFPrdNom_Sel = httpContext.GetPar( "TFPrdNom_Sel") ;
      AV30TFPrvNum = (int)(GXutil.lval( httpContext.GetPar( "TFPrvNum"))) ;
      AV31TFPrvNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFPrvNum_To"))) ;
      AV32TFPrvNom = httpContext.GetPar( "TFPrvNom") ;
      AV33TFPrvNom_Sel = httpContext.GetPar( "TFPrvNom_Sel") ;
      AV301Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV282EmprCod, AV283PrdNumFrom, AV284PrdNumTo, AV285PrvNumFrom, AV286PrvNumTo, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFPrdNum, AV27TFPrdNum_Sel, AV28TFPrdNom, AV29TFPrdNom_Sel, AV30TFPrvNum, AV31TFPrvNum_To, AV32TFPrvNom, AV33TFPrvNom_Sel, AV301Pgmname, AV12OrderedBy, AV13OrderedDsc, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1M02( ) ;
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
         httpContext.writeValue( httpContext.getMessage( " Mantenimiento Productos Quimicos", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.listaprd_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV282EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV283PrdNumFrom)),GXutil.URLEncode(GXutil.rtrim(AV284PrdNumTo)),GXutil.URLEncode(GXutil.ltrimstr(AV285PrvNumFrom,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV286PrvNumTo,6,0))}, new String[] {"EmprCod","PrdNumFrom","PrdNumTo","PrvNumFrom","PrvNumTo"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV301Pgmname, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_45", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_45, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV279GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV280GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV277DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV277DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV20ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV20ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV282EmprCod", GXutil.rtrim( wcpOAV282EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV283PrdNumFrom", GXutil.rtrim( wcpOAV283PrdNumFrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV284PrdNumTo", GXutil.rtrim( wcpOAV284PrdNumTo));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV285PrvNumFrom", GXutil.ltrim( localUtil.ntoc( wcpOAV285PrvNumFrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV286PrvNumTo", GXutil.ltrim( localUtil.ntoc( wcpOAV286PrvNumTo, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV25ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNUM", GXutil.rtrim( AV26TFPrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNUM_SEL", GXutil.rtrim( AV27TFPrdNum_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNOM", GXutil.rtrim( AV28TFPrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNOM_SEL", GXutil.rtrim( AV29TFPrdNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVNUM", GXutil.ltrim( localUtil.ntoc( AV30TFPrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVNUM_TO", GXutil.ltrim( localUtil.ntoc( AV31TFPrvNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVNOM", GXutil.rtrim( AV32TFPrvNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVNOM_SEL", GXutil.rtrim( AV33TFPrvNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV301Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV301Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PRDUNICOM", GXutil.ltrim( localUtil.ntoc( A742PrdUniCom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PRDUNICON", GXutil.ltrim( localUtil.ntoc( A743PrdUniCon, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"VALCOD", GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV282EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRDNUMFROM", GXutil.rtrim( AV283PrdNumFrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRDNUMTO", GXutil.rtrim( AV284PrdNumTo));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRVNUMFROM", GXutil.ltrim( localUtil.ntoc( AV285PrvNumFrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRVNUMTO", GXutil.ltrim( localUtil.ntoc( AV286PrvNumTo, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
   }

   public void renderHtmlCloseForm1M02( )
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
      return "ListaPrd_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Mantenimiento Productos Quimicos", "") ;
   }

   public void wb1M00( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.listaprd_wc");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ListaPrd_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ListaPrd_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTREPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ListaPrd_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ListaPrd_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ListaPrd_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_27_1M02( true) ;
      }
      else
      {
         wb_table1_27_1M02( false) ;
      }
      return  ;
   }

   public void wb_table1_27_1M02e( boolean wbgen )
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
         startgridcontrol45( ) ;
      }
      if ( wbEnd == 45 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_45 = (int)(nGXsfl_45_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV279GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV280GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, sPrefix+"GRIDPAGINATIONBARContainer");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV277DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, sPrefix+"INNEWWINDOW1Container");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV277DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV20ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
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
      if ( wbEnd == 45 )
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

   public void start1M02( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( " Mantenimiento Productos Quimicos", ""), (short)(0)) ;
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
            strup1M00( ) ;
         }
      }
   }

   public void ws1M02( )
   {
      start1M02( ) ;
      evt1M02( ) ;
   }

   public void evt1M02( )
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
                              strup1M00( ) ;
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
                              strup1M00( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e111M02 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1M00( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e121M02 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1M00( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e131M02 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1M00( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e141M02 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1M00( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e151M02 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1M00( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoInsert' */
                                 e161M02 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1M00( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e171M02 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTREPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1M00( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportReport' */
                                 e181M02 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1M00( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e191M02 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1M00( ) ;
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
                              strup1M00( ) ;
                           }
                           nGXsfl_45_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_452( ) ;
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
                           n407EmprNom = false ;
                           A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
                           A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
                           A795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( edtPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A794PrvNom = httpContext.cgiGet( edtPrvNom_Internalname) ;
                           n794PrvNom = false ;
                           A704PrdExiAlm = localUtil.ctond( httpContext.cgiGet( edtPrdExiAlm_Internalname)) ;
                           A705PrdExiCC = localUtil.ctond( httpContext.cgiGet( edtPrdExiCC_Internalname)) ;
                           A728PrdRefPrv = httpContext.cgiGet( edtPrdRefPrv_Internalname) ;
                           A685PrdCanRes = localUtil.ctond( httpContext.cgiGet( edtPrdCanRes_Internalname)) ;
                           A4338PrdUMeFo = (byte)(localUtil.ctol( httpContext.cgiGet( edtPrdUMeFo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A737PrdUcpDsc = httpContext.cgiGet( edtPrdUcpDsc_Internalname) ;
                           n737PrdUcpDsc = false ;
                           A736PrdUcoDsc = httpContext.cgiGet( edtPrdUcoDsc_Internalname) ;
                           n736PrdUcoDsc = false ;
                           A707PrdFacCon = localUtil.ctond( httpContext.cgiGet( edtPrdFacCon_Internalname)) ;
                           A857ValDsc = httpContext.cgiGet( edtValDsc_Internalname) ;
                           n857ValDsc = false ;
                           A4693PrdNum2 = httpContext.cgiGet( edtPrdNum2_Internalname) ;
                           A724PrdPreAct = localUtil.ctond( httpContext.cgiGet( edtPrdPreAct_Internalname)) ;
                           A9739PrdFT = httpContext.cgiGet( edtPrdFT_Internalname) ;
                           A9740PrdFFT = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtPrdFFT_Internalname), 0)) ;
                           A9741PrdHS = httpContext.cgiGet( edtPrdHS_Internalname) ;
                           A9742PrdFHS = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtPrdFHS_Internalname), 0)) ;
                           A5887PrdReach = httpContext.cgiGet( edtPrdReach_Internalname) ;
                           cmbPrdOkotex.setName( cmbPrdOkotex.getInternalname() );
                           cmbPrdOkotex.setValue( httpContext.cgiGet( cmbPrdOkotex.getInternalname()) );
                           A5888PrdOkotex = httpContext.cgiGet( cmbPrdOkotex.getInternalname()) ;
                           A11363PrdGots = httpContext.cgiGet( edtPrdGots_Internalname) ;
                           A11364PrdHm = httpContext.cgiGet( edtPrdHm_Internalname) ;
                           A1644PrdDqo = (short)(localUtil.ctol( httpContext.cgiGet( edtPrdDqo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A9733PrdAox = localUtil.ctond( httpContext.cgiGet( edtPrdAox_Internalname)) ;
                           A10119PrdColIdx = httpContext.cgiGet( edtPrdColIdx_Internalname) ;
                           A6301TipPrdCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTipPrdCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n6301TipPrdCod = false ;
                           A6302TipPrdDsc = httpContext.cgiGet( edtTipPrdDsc_Internalname) ;
                           n6302TipPrdDsc = false ;
                           A11196PrdNroCAS = httpContext.cgiGet( edtPrdNroCAS_Internalname) ;
                           A10935PrdRTM = httpContext.cgiGet( edtPrdRTM_Internalname) ;
                           A10936PrdCtw1 = httpContext.cgiGet( edtPrdCtw1_Internalname) ;
                           A10937PrdCtw2 = httpContext.cgiGet( edtPrdCtw2_Internalname) ;
                           A10938PrdCtw3 = httpContext.cgiGet( edtPrdCtw3_Internalname) ;
                           A11663PrdCtw4 = httpContext.cgiGet( edtPrdCtw4_Internalname) ;
                           cmbPrdList.setName( cmbPrdList.getInternalname() );
                           cmbPrdList.setValue( httpContext.cgiGet( cmbPrdList.getInternalname()) );
                           A11687PrdList = httpContext.cgiGet( cmbPrdList.getInternalname()) ;
                           A11614PrdEINECS = httpContext.cgiGet( edtPrdEINECS_Internalname) ;
                           A11615PrdFuncion = httpContext.cgiGet( edtPrdFuncion_Internalname) ;
                           A11616PrdNmQu = httpContext.cgiGet( edtPrdNmQu_Internalname) ;
                           A5416PrdDensS = localUtil.ctond( httpContext.cgiGet( edtPrdDensS_Internalname)) ;
                           A3273PrdTnq = (byte)(localUtil.ctol( httpContext.cgiGet( edtPrdTnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
                                       e201M02 ();
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
                                       e211M02 ();
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
                                       e221M02 ();
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
                                    strup1M00( ) ;
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

   public void we1M02( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1M02( ) ;
         }
      }
   }

   public void pa1M02( )
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
      subsflControlProps_452( ) ;
      while ( nGXsfl_45_idx <= nRC_GXsfl_45 )
      {
         sendrow_452( ) ;
         nGXsfl_45_idx = ((subGrid_Islastpage==1)&&(nGXsfl_45_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_452( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV282EmprCod ,
                                 String AV283PrdNumFrom ,
                                 String AV284PrdNumTo ,
                                 int AV285PrvNumFrom ,
                                 int AV286PrvNumTo ,
                                 byte AV25ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ,
                                 String AV15FilterFullText ,
                                 String AV26TFPrdNum ,
                                 String AV27TFPrdNum_Sel ,
                                 String AV28TFPrdNom ,
                                 String AV29TFPrdNom_Sel ,
                                 int AV30TFPrvNum ,
                                 int AV31TFPrvNum_To ,
                                 String AV32TFPrvNom ,
                                 String AV33TFPrvNom_Sel ,
                                 String AV301Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e211M02 ();
      GRID_nCurrentRecord = 0 ;
      rf1M02( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_PRDNUM", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A719PrdNum, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PRDNUM", GXutil.rtrim( A719PrdNum));
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
      rf1M02( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV301Pgmname = "ListaPrd_WC" ;
      Gx_err = (short)(0) ;
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV292Listaprd_wcds_1_filterfulltext = AV15FilterFullText ;
      AV293Listaprd_wcds_2_tfprdnum = AV26TFPrdNum ;
      AV294Listaprd_wcds_3_tfprdnum_sel = AV27TFPrdNum_Sel ;
      AV295Listaprd_wcds_4_tfprdnom = AV28TFPrdNom ;
      AV296Listaprd_wcds_5_tfprdnom_sel = AV29TFPrdNom_Sel ;
      AV297Listaprd_wcds_6_tfprvnum = AV30TFPrvNum ;
      AV298Listaprd_wcds_7_tfprvnum_to = AV31TFPrvNum_To ;
      AV299Listaprd_wcds_8_tfprvnom = AV32TFPrvNom ;
      AV300Listaprd_wcds_9_tfprvnom_sel = AV33TFPrvNom_Sel ;
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV294Listaprd_wcds_3_tfprdnum_sel ,
                                           AV293Listaprd_wcds_2_tfprdnum ,
                                           AV296Listaprd_wcds_5_tfprdnom_sel ,
                                           AV295Listaprd_wcds_4_tfprdnom ,
                                           Integer.valueOf(AV297Listaprd_wcds_6_tfprvnum) ,
                                           Integer.valueOf(AV298Listaprd_wcds_7_tfprvnum_to) ,
                                           AV300Listaprd_wcds_9_tfprvnom_sel ,
                                           AV299Listaprd_wcds_8_tfprvnom ,
                                           AV282EmprCod ,
                                           AV283PrdNumFrom ,
                                           AV284PrdNumTo ,
                                           Integer.valueOf(AV285PrvNumFrom) ,
                                           Integer.valueOf(AV286PrvNumTo) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A396EmprCod ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV292Listaprd_wcds_1_filterfulltext ,
                                           A704PrdExiAlm ,
                                           A705PrdExiCC ,
                                           A728PrdRefPrv ,
                                           A685PrdCanRes ,
                                           Byte.valueOf(A4338PrdUMeFo) ,
                                           A737PrdUcpDsc ,
                                           A736PrdUcoDsc ,
                                           A707PrdFacCon ,
                                           A857ValDsc ,
                                           A4693PrdNum2 ,
                                           A724PrdPreAct ,
                                           A9739PrdFT ,
                                           A9741PrdHS ,
                                           A5887PrdReach ,
                                           A5888PrdOkotex ,
                                           A11363PrdGots ,
                                           A11364PrdHm ,
                                           Short.valueOf(A1644PrdDqo) ,
                                           A9733PrdAox ,
                                           A10119PrdColIdx ,
                                           Short.valueOf(A6301TipPrdCod) ,
                                           A6302TipPrdDsc ,
                                           A11196PrdNroCAS ,
                                           A10935PrdRTM ,
                                           A10936PrdCtw1 ,
                                           A10937PrdCtw2 ,
                                           A10938PrdCtw3 ,
                                           A11663PrdCtw4 ,
                                           A11687PrdList ,
                                           A11614PrdEINECS ,
                                           A11615PrdFuncion ,
                                           A11616PrdNmQu ,
                                           A5416PrdDensS ,
                                           Byte.valueOf(A3273PrdTnq) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.BYTE
                                           }
      });
      lV293Listaprd_wcds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV293Listaprd_wcds_2_tfprdnum), 6, "%") ;
      lV295Listaprd_wcds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV295Listaprd_wcds_4_tfprdnom), 26, "%") ;
      lV299Listaprd_wcds_8_tfprvnom = GXutil.padr( GXutil.rtrim( AV299Listaprd_wcds_8_tfprvnom), 30, "%") ;
      /* Using cursor H01M02 */
      pr_default.execute(0, new Object[] {lV293Listaprd_wcds_2_tfprdnum, AV294Listaprd_wcds_3_tfprdnum_sel, lV295Listaprd_wcds_4_tfprdnom, AV296Listaprd_wcds_5_tfprdnom_sel, Integer.valueOf(AV297Listaprd_wcds_6_tfprvnum), Integer.valueOf(AV298Listaprd_wcds_7_tfprvnum_to), lV299Listaprd_wcds_8_tfprvnom, AV300Listaprd_wcds_9_tfprvnom_sel, AV282EmprCod, AV283PrdNumFrom, AV284PrdNumTo, Integer.valueOf(AV285PrvNumFrom), Integer.valueOf(AV286PrvNumTo)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A742PrdUniCom = H01M02_A742PrdUniCom[0] ;
         A743PrdUniCon = H01M02_A743PrdUniCon[0] ;
         A856ValCod = H01M02_A856ValCod[0] ;
         A3273PrdTnq = H01M02_A3273PrdTnq[0] ;
         A5416PrdDensS = H01M02_A5416PrdDensS[0] ;
         A11616PrdNmQu = H01M02_A11616PrdNmQu[0] ;
         A11615PrdFuncion = H01M02_A11615PrdFuncion[0] ;
         A11614PrdEINECS = H01M02_A11614PrdEINECS[0] ;
         A11687PrdList = H01M02_A11687PrdList[0] ;
         A11663PrdCtw4 = H01M02_A11663PrdCtw4[0] ;
         A10938PrdCtw3 = H01M02_A10938PrdCtw3[0] ;
         A10937PrdCtw2 = H01M02_A10937PrdCtw2[0] ;
         A10936PrdCtw1 = H01M02_A10936PrdCtw1[0] ;
         A10935PrdRTM = H01M02_A10935PrdRTM[0] ;
         A11196PrdNroCAS = H01M02_A11196PrdNroCAS[0] ;
         A6302TipPrdDsc = H01M02_A6302TipPrdDsc[0] ;
         n6302TipPrdDsc = H01M02_n6302TipPrdDsc[0] ;
         A6301TipPrdCod = H01M02_A6301TipPrdCod[0] ;
         n6301TipPrdCod = H01M02_n6301TipPrdCod[0] ;
         A10119PrdColIdx = H01M02_A10119PrdColIdx[0] ;
         A9733PrdAox = H01M02_A9733PrdAox[0] ;
         A1644PrdDqo = H01M02_A1644PrdDqo[0] ;
         A11364PrdHm = H01M02_A11364PrdHm[0] ;
         A11363PrdGots = H01M02_A11363PrdGots[0] ;
         A5888PrdOkotex = H01M02_A5888PrdOkotex[0] ;
         A5887PrdReach = H01M02_A5887PrdReach[0] ;
         A9742PrdFHS = H01M02_A9742PrdFHS[0] ;
         A9741PrdHS = H01M02_A9741PrdHS[0] ;
         A9740PrdFFT = H01M02_A9740PrdFFT[0] ;
         A9739PrdFT = H01M02_A9739PrdFT[0] ;
         A724PrdPreAct = H01M02_A724PrdPreAct[0] ;
         A4693PrdNum2 = H01M02_A4693PrdNum2[0] ;
         A857ValDsc = H01M02_A857ValDsc[0] ;
         n857ValDsc = H01M02_n857ValDsc[0] ;
         A707PrdFacCon = H01M02_A707PrdFacCon[0] ;
         A736PrdUcoDsc = H01M02_A736PrdUcoDsc[0] ;
         n736PrdUcoDsc = H01M02_n736PrdUcoDsc[0] ;
         A737PrdUcpDsc = H01M02_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = H01M02_n737PrdUcpDsc[0] ;
         A4338PrdUMeFo = H01M02_A4338PrdUMeFo[0] ;
         A685PrdCanRes = H01M02_A685PrdCanRes[0] ;
         A728PrdRefPrv = H01M02_A728PrdRefPrv[0] ;
         A705PrdExiCC = H01M02_A705PrdExiCC[0] ;
         A704PrdExiAlm = H01M02_A704PrdExiAlm[0] ;
         A794PrvNom = H01M02_A794PrvNom[0] ;
         n794PrvNom = H01M02_n794PrvNom[0] ;
         A795PrvNum = H01M02_A795PrvNum[0] ;
         A718PrdNom = H01M02_A718PrdNom[0] ;
         A719PrdNum = H01M02_A719PrdNum[0] ;
         A407EmprNom = H01M02_A407EmprNom[0] ;
         n407EmprNom = H01M02_n407EmprNom[0] ;
         A396EmprCod = H01M02_A396EmprCod[0] ;
         A407EmprNom = H01M02_A407EmprNom[0] ;
         n407EmprNom = H01M02_n407EmprNom[0] ;
         A794PrvNom = H01M02_A794PrvNom[0] ;
         n794PrvNom = H01M02_n794PrvNom[0] ;
         A737PrdUcpDsc = H01M02_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = H01M02_n737PrdUcpDsc[0] ;
         A736PrdUcoDsc = H01M02_A736PrdUcoDsc[0] ;
         n736PrdUcoDsc = H01M02_n736PrdUcoDsc[0] ;
         A857ValDsc = H01M02_A857ValDsc[0] ;
         n857ValDsc = H01M02_n857ValDsc[0] ;
         A6302TipPrdDsc = H01M02_A6302TipPrdDsc[0] ;
         n6302TipPrdDsc = H01M02_n6302TipPrdDsc[0] ;
         if ( (GXutil.strcmp("", AV292Listaprd_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A719PrdNum) , GXutil.padr( "%" + GXutil.upper( AV292Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A718PrdNom) , GXutil.padr( "%" + GXutil.upper( AV292Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV292Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV292Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A704PrdExiAlm, 12, 4) , GXutil.padr( "%" + AV292Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A705PrdExiCC, 12, 4) , GXutil.padr( "%" + AV292Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A728PrdRefPrv) , GXutil.padr( "%" + GXutil.upper( AV292Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A685PrdCanRes, 12, 4) , GXutil.padr( "%" + AV292Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A4338PrdUMeFo, 1, 0) , GXutil.padr( "%" + AV292Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A737PrdUcpDsc) , GXutil.padr( "%" + GXutil.upper( AV292Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A736PrdUcoDsc) , GXutil.padr( "%" + GXutil.upper( AV292Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A707PrdFacCon, 7, 4) , GXutil.padr( "%" + AV292Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A857ValDsc) , GXutil.padr( "%" + GXutil.upper( AV292Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4693PrdNum2) , GXutil.padr( "%" + GXutil.upper( AV292Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A724PrdPreAct, 14, 5) , GXutil.padr( "%" + AV292Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9739PrdFT) , GXutil.padr( "%" + GXutil.upper( AV292Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9741PrdHS) , GXutil.padr( "%" + GXutil.upper( AV292Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5887PrdReach) , GXutil.padr( "%" + GXutil.upper( AV292Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "n", "") , GXutil.padr( "%" + GXutil.lower( AV292Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5888PrdOkotex, "N") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "s", "") , GXutil.padr( "%" + GXutil.lower( AV292Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5888PrdOkotex, "S") == 0 ) ) || ( GXutil.like( GXutil.upper( A11363PrdGots) , GXutil.padr( "%" + GXutil.upper( AV292Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11364PrdHm) , GXutil.padr( "%" + GXutil.upper( AV292Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1644PrdDqo, 4, 0) , GXutil.padr( "%" + AV292Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9733PrdAox, 6, 2) , GXutil.padr( "%" + AV292Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10119PrdColIdx) , GXutil.padr( "%" + GXutil.upper( AV292Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A6301TipPrdCod, 4, 0) , GXutil.padr( "%" + AV292Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6302TipPrdDsc) , GXutil.padr( "%" + GXutil.upper( AV292Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11196PrdNroCAS) , GXutil.padr( "%" + GXutil.upper( AV292Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10935PrdRTM) , GXutil.padr( "%" + GXutil.upper( AV292Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10936PrdCtw1) , GXutil.padr( "%" + GXutil.upper( AV292Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10937PrdCtw2) , GXutil.padr( "%" + GXutil.upper( AV292Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10938PrdCtw3) , GXutil.padr( "%" + GXutil.upper( AV292Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11663PrdCtw4) , GXutil.padr( "%" + GXutil.upper( AV292Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "s", "") , GXutil.padr( "%" + GXutil.lower( AV292Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11687PrdList, "S") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "n", "") , GXutil.padr( "%" + GXutil.lower( AV292Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11687PrdList, "N") == 0 ) ) || ( GXutil.like( GXutil.upper( A11614PrdEINECS) , GXutil.padr( "%" + GXutil.upper( AV292Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11615PrdFuncion) , GXutil.padr( "%" + GXutil.upper( AV292Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11616PrdNmQu) , GXutil.padr( "%" + GXutil.upper( AV292Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A5416PrdDensS, 7, 3) , GXutil.padr( "%" + AV292Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A3273PrdTnq, 2, 0) , GXutil.padr( "%" + AV292Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            GRID_nRecordCount = (long)(GRID_nRecordCount+1) ;
         }
         pr_default.readNext(0);
      }
      GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      pr_default.close(0);
      return (int)(GRID_nRecordCount) ;
   }

   public void rf1M02( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(45) ;
      /* Execute user event: Refresh */
      e211M02 ();
      nGXsfl_45_idx = 1 ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_452( ) ;
      bGXsfl_45_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
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
         subsflControlProps_452( ) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              AV294Listaprd_wcds_3_tfprdnum_sel ,
                                              AV293Listaprd_wcds_2_tfprdnum ,
                                              AV296Listaprd_wcds_5_tfprdnom_sel ,
                                              AV295Listaprd_wcds_4_tfprdnom ,
                                              Integer.valueOf(AV297Listaprd_wcds_6_tfprvnum) ,
                                              Integer.valueOf(AV298Listaprd_wcds_7_tfprvnum_to) ,
                                              AV300Listaprd_wcds_9_tfprvnom_sel ,
                                              AV299Listaprd_wcds_8_tfprvnom ,
                                              AV282EmprCod ,
                                              AV283PrdNumFrom ,
                                              AV284PrdNumTo ,
                                              Integer.valueOf(AV285PrvNumFrom) ,
                                              Integer.valueOf(AV286PrvNumTo) ,
                                              A719PrdNum ,
                                              A718PrdNom ,
                                              Integer.valueOf(A795PrvNum) ,
                                              A794PrvNom ,
                                              A396EmprCod ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV292Listaprd_wcds_1_filterfulltext ,
                                              A704PrdExiAlm ,
                                              A705PrdExiCC ,
                                              A728PrdRefPrv ,
                                              A685PrdCanRes ,
                                              Byte.valueOf(A4338PrdUMeFo) ,
                                              A737PrdUcpDsc ,
                                              A736PrdUcoDsc ,
                                              A707PrdFacCon ,
                                              A857ValDsc ,
                                              A4693PrdNum2 ,
                                              A724PrdPreAct ,
                                              A9739PrdFT ,
                                              A9741PrdHS ,
                                              A5887PrdReach ,
                                              A5888PrdOkotex ,
                                              A11363PrdGots ,
                                              A11364PrdHm ,
                                              Short.valueOf(A1644PrdDqo) ,
                                              A9733PrdAox ,
                                              A10119PrdColIdx ,
                                              Short.valueOf(A6301TipPrdCod) ,
                                              A6302TipPrdDsc ,
                                              A11196PrdNroCAS ,
                                              A10935PrdRTM ,
                                              A10936PrdCtw1 ,
                                              A10937PrdCtw2 ,
                                              A10938PrdCtw3 ,
                                              A11663PrdCtw4 ,
                                              A11687PrdList ,
                                              A11614PrdEINECS ,
                                              A11615PrdFuncion ,
                                              A11616PrdNmQu ,
                                              A5416PrdDensS ,
                                              Byte.valueOf(A3273PrdTnq) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT,
                                              TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                              TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                              TypeConstants.BYTE
                                              }
         });
         lV293Listaprd_wcds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV293Listaprd_wcds_2_tfprdnum), 6, "%") ;
         lV295Listaprd_wcds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV295Listaprd_wcds_4_tfprdnom), 26, "%") ;
         lV299Listaprd_wcds_8_tfprvnom = GXutil.padr( GXutil.rtrim( AV299Listaprd_wcds_8_tfprvnom), 30, "%") ;
         /* Using cursor H01M03 */
         pr_default.execute(1, new Object[] {lV293Listaprd_wcds_2_tfprdnum, AV294Listaprd_wcds_3_tfprdnum_sel, lV295Listaprd_wcds_4_tfprdnom, AV296Listaprd_wcds_5_tfprdnom_sel, Integer.valueOf(AV297Listaprd_wcds_6_tfprvnum), Integer.valueOf(AV298Listaprd_wcds_7_tfprvnum_to), lV299Listaprd_wcds_8_tfprvnom, AV300Listaprd_wcds_9_tfprvnom_sel, AV282EmprCod, AV283PrdNumFrom, AV284PrdNumTo, Integer.valueOf(AV285PrvNumFrom), Integer.valueOf(AV286PrvNumTo)});
         nGXsfl_45_idx = 1 ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_452( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A742PrdUniCom = H01M03_A742PrdUniCom[0] ;
            A743PrdUniCon = H01M03_A743PrdUniCon[0] ;
            A856ValCod = H01M03_A856ValCod[0] ;
            A3273PrdTnq = H01M03_A3273PrdTnq[0] ;
            A5416PrdDensS = H01M03_A5416PrdDensS[0] ;
            A11616PrdNmQu = H01M03_A11616PrdNmQu[0] ;
            A11615PrdFuncion = H01M03_A11615PrdFuncion[0] ;
            A11614PrdEINECS = H01M03_A11614PrdEINECS[0] ;
            A11687PrdList = H01M03_A11687PrdList[0] ;
            A11663PrdCtw4 = H01M03_A11663PrdCtw4[0] ;
            A10938PrdCtw3 = H01M03_A10938PrdCtw3[0] ;
            A10937PrdCtw2 = H01M03_A10937PrdCtw2[0] ;
            A10936PrdCtw1 = H01M03_A10936PrdCtw1[0] ;
            A10935PrdRTM = H01M03_A10935PrdRTM[0] ;
            A11196PrdNroCAS = H01M03_A11196PrdNroCAS[0] ;
            A6302TipPrdDsc = H01M03_A6302TipPrdDsc[0] ;
            n6302TipPrdDsc = H01M03_n6302TipPrdDsc[0] ;
            A6301TipPrdCod = H01M03_A6301TipPrdCod[0] ;
            n6301TipPrdCod = H01M03_n6301TipPrdCod[0] ;
            A10119PrdColIdx = H01M03_A10119PrdColIdx[0] ;
            A9733PrdAox = H01M03_A9733PrdAox[0] ;
            A1644PrdDqo = H01M03_A1644PrdDqo[0] ;
            A11364PrdHm = H01M03_A11364PrdHm[0] ;
            A11363PrdGots = H01M03_A11363PrdGots[0] ;
            A5888PrdOkotex = H01M03_A5888PrdOkotex[0] ;
            A5887PrdReach = H01M03_A5887PrdReach[0] ;
            A9742PrdFHS = H01M03_A9742PrdFHS[0] ;
            A9741PrdHS = H01M03_A9741PrdHS[0] ;
            A9740PrdFFT = H01M03_A9740PrdFFT[0] ;
            A9739PrdFT = H01M03_A9739PrdFT[0] ;
            A724PrdPreAct = H01M03_A724PrdPreAct[0] ;
            A4693PrdNum2 = H01M03_A4693PrdNum2[0] ;
            A857ValDsc = H01M03_A857ValDsc[0] ;
            n857ValDsc = H01M03_n857ValDsc[0] ;
            A707PrdFacCon = H01M03_A707PrdFacCon[0] ;
            A736PrdUcoDsc = H01M03_A736PrdUcoDsc[0] ;
            n736PrdUcoDsc = H01M03_n736PrdUcoDsc[0] ;
            A737PrdUcpDsc = H01M03_A737PrdUcpDsc[0] ;
            n737PrdUcpDsc = H01M03_n737PrdUcpDsc[0] ;
            A4338PrdUMeFo = H01M03_A4338PrdUMeFo[0] ;
            A685PrdCanRes = H01M03_A685PrdCanRes[0] ;
            A728PrdRefPrv = H01M03_A728PrdRefPrv[0] ;
            A705PrdExiCC = H01M03_A705PrdExiCC[0] ;
            A704PrdExiAlm = H01M03_A704PrdExiAlm[0] ;
            A794PrvNom = H01M03_A794PrvNom[0] ;
            n794PrvNom = H01M03_n794PrvNom[0] ;
            A795PrvNum = H01M03_A795PrvNum[0] ;
            A718PrdNom = H01M03_A718PrdNom[0] ;
            A719PrdNum = H01M03_A719PrdNum[0] ;
            A407EmprNom = H01M03_A407EmprNom[0] ;
            n407EmprNom = H01M03_n407EmprNom[0] ;
            A396EmprCod = H01M03_A396EmprCod[0] ;
            A407EmprNom = H01M03_A407EmprNom[0] ;
            n407EmprNom = H01M03_n407EmprNom[0] ;
            A794PrvNom = H01M03_A794PrvNom[0] ;
            n794PrvNom = H01M03_n794PrvNom[0] ;
            A737PrdUcpDsc = H01M03_A737PrdUcpDsc[0] ;
            n737PrdUcpDsc = H01M03_n737PrdUcpDsc[0] ;
            A736PrdUcoDsc = H01M03_A736PrdUcoDsc[0] ;
            n736PrdUcoDsc = H01M03_n736PrdUcoDsc[0] ;
            A857ValDsc = H01M03_A857ValDsc[0] ;
            n857ValDsc = H01M03_n857ValDsc[0] ;
            A6302TipPrdDsc = H01M03_A6302TipPrdDsc[0] ;
            n6302TipPrdDsc = H01M03_n6302TipPrdDsc[0] ;
            if ( (GXutil.strcmp("", AV292Listaprd_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A719PrdNum) , GXutil.padr( "%" + GXutil.upper( AV292Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A718PrdNom) , GXutil.padr( "%" + GXutil.upper( AV292Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV292Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV292Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A704PrdExiAlm, 12, 4) , GXutil.padr( "%" + AV292Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A705PrdExiCC, 12, 4) , GXutil.padr( "%" + AV292Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A728PrdRefPrv) , GXutil.padr( "%" + GXutil.upper( AV292Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A685PrdCanRes, 12, 4) , GXutil.padr( "%" + AV292Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A4338PrdUMeFo, 1, 0) , GXutil.padr( "%" + AV292Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A737PrdUcpDsc) , GXutil.padr( "%" + GXutil.upper( AV292Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A736PrdUcoDsc) , GXutil.padr( "%" + GXutil.upper( AV292Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A707PrdFacCon, 7, 4) , GXutil.padr( "%" + AV292Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A857ValDsc) , GXutil.padr( "%" + GXutil.upper( AV292Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4693PrdNum2) , GXutil.padr( "%" + GXutil.upper( AV292Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A724PrdPreAct, 14, 5) , GXutil.padr( "%" + AV292Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9739PrdFT) , GXutil.padr( "%" + GXutil.upper( AV292Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9741PrdHS) , GXutil.padr( "%" + GXutil.upper( AV292Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5887PrdReach) , GXutil.padr( "%" + GXutil.upper( AV292Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "n", "") , GXutil.padr( "%" + GXutil.lower( AV292Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5888PrdOkotex, "N") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "s", "") , GXutil.padr( "%" + GXutil.lower( AV292Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5888PrdOkotex, "S") == 0 ) ) || ( GXutil.like( GXutil.upper( A11363PrdGots) , GXutil.padr( "%" + GXutil.upper( AV292Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11364PrdHm) , GXutil.padr( "%" + GXutil.upper( AV292Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1644PrdDqo, 4, 0) , GXutil.padr( "%" + AV292Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9733PrdAox, 6, 2) , GXutil.padr( "%" + AV292Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10119PrdColIdx) , GXutil.padr( "%" + GXutil.upper( AV292Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A6301TipPrdCod, 4, 0) , GXutil.padr( "%" + AV292Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6302TipPrdDsc) , GXutil.padr( "%" + GXutil.upper( AV292Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11196PrdNroCAS) , GXutil.padr( "%" + GXutil.upper( AV292Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10935PrdRTM) , GXutil.padr( "%" + GXutil.upper( AV292Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10936PrdCtw1) , GXutil.padr( "%" + GXutil.upper( AV292Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10937PrdCtw2) , GXutil.padr( "%" + GXutil.upper( AV292Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10938PrdCtw3) , GXutil.padr( "%" + GXutil.upper( AV292Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11663PrdCtw4) , GXutil.padr( "%" + GXutil.upper( AV292Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "s", "") , GXutil.padr( "%" + GXutil.lower( AV292Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11687PrdList, "S") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "n", "") , GXutil.padr( "%" + GXutil.lower( AV292Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11687PrdList, "N") == 0 ) ) || ( GXutil.like( GXutil.upper( A11614PrdEINECS) , GXutil.padr( "%" + GXutil.upper( AV292Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11615PrdFuncion) , GXutil.padr( "%" + GXutil.upper( AV292Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11616PrdNmQu) , GXutil.padr( "%" + GXutil.upper( AV292Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A5416PrdDensS, 7, 3) , GXutil.padr( "%" + AV292Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A3273PrdTnq, 2, 0) , GXutil.padr( "%" + AV292Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
            {
               e221M02 ();
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(45) ;
         wb1M00( ) ;
      }
      bGXsfl_45_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1M02( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV301Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV301Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD"+"_"+sGXsfl_45_idx, getSecureSignedToken( sPrefix+sGXsfl_45_idx, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_PRDNUM"+"_"+sGXsfl_45_idx, getSecureSignedToken( sPrefix+sGXsfl_45_idx, GXutil.rtrim( localUtil.format( A719PrdNum, ""))));
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
      AV292Listaprd_wcds_1_filterfulltext = AV15FilterFullText ;
      AV293Listaprd_wcds_2_tfprdnum = AV26TFPrdNum ;
      AV294Listaprd_wcds_3_tfprdnum_sel = AV27TFPrdNum_Sel ;
      AV295Listaprd_wcds_4_tfprdnom = AV28TFPrdNom ;
      AV296Listaprd_wcds_5_tfprdnom_sel = AV29TFPrdNom_Sel ;
      AV297Listaprd_wcds_6_tfprvnum = AV30TFPrvNum ;
      AV298Listaprd_wcds_7_tfprvnum_to = AV31TFPrvNum_To ;
      AV299Listaprd_wcds_8_tfprvnom = AV32TFPrvNom ;
      AV300Listaprd_wcds_9_tfprvnom_sel = AV33TFPrvNom_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV282EmprCod, AV283PrdNumFrom, AV284PrdNumTo, AV285PrvNumFrom, AV286PrvNumTo, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFPrdNum, AV27TFPrdNum_Sel, AV28TFPrdNom, AV29TFPrdNom_Sel, AV30TFPrvNum, AV31TFPrvNum_To, AV32TFPrvNom, AV33TFPrvNom_Sel, AV301Pgmname, AV12OrderedBy, AV13OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV292Listaprd_wcds_1_filterfulltext = AV15FilterFullText ;
      AV293Listaprd_wcds_2_tfprdnum = AV26TFPrdNum ;
      AV294Listaprd_wcds_3_tfprdnum_sel = AV27TFPrdNum_Sel ;
      AV295Listaprd_wcds_4_tfprdnom = AV28TFPrdNom ;
      AV296Listaprd_wcds_5_tfprdnom_sel = AV29TFPrdNom_Sel ;
      AV297Listaprd_wcds_6_tfprvnum = AV30TFPrvNum ;
      AV298Listaprd_wcds_7_tfprvnum_to = AV31TFPrvNum_To ;
      AV299Listaprd_wcds_8_tfprvnom = AV32TFPrvNom ;
      AV300Listaprd_wcds_9_tfprvnom_sel = AV33TFPrvNom_Sel ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV282EmprCod, AV283PrdNumFrom, AV284PrdNumTo, AV285PrvNumFrom, AV286PrvNumTo, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFPrdNum, AV27TFPrdNum_Sel, AV28TFPrdNom, AV29TFPrdNom_Sel, AV30TFPrvNum, AV31TFPrvNum_To, AV32TFPrvNom, AV33TFPrvNom_Sel, AV301Pgmname, AV12OrderedBy, AV13OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV292Listaprd_wcds_1_filterfulltext = AV15FilterFullText ;
      AV293Listaprd_wcds_2_tfprdnum = AV26TFPrdNum ;
      AV294Listaprd_wcds_3_tfprdnum_sel = AV27TFPrdNum_Sel ;
      AV295Listaprd_wcds_4_tfprdnom = AV28TFPrdNom ;
      AV296Listaprd_wcds_5_tfprdnom_sel = AV29TFPrdNom_Sel ;
      AV297Listaprd_wcds_6_tfprvnum = AV30TFPrvNum ;
      AV298Listaprd_wcds_7_tfprvnum_to = AV31TFPrvNum_To ;
      AV299Listaprd_wcds_8_tfprvnom = AV32TFPrvNom ;
      AV300Listaprd_wcds_9_tfprvnom_sel = AV33TFPrvNom_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV282EmprCod, AV283PrdNumFrom, AV284PrdNumTo, AV285PrvNumFrom, AV286PrvNumTo, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFPrdNum, AV27TFPrdNum_Sel, AV28TFPrdNom, AV29TFPrdNom_Sel, AV30TFPrvNum, AV31TFPrvNum_To, AV32TFPrvNom, AV33TFPrvNom_Sel, AV301Pgmname, AV12OrderedBy, AV13OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV292Listaprd_wcds_1_filterfulltext = AV15FilterFullText ;
      AV293Listaprd_wcds_2_tfprdnum = AV26TFPrdNum ;
      AV294Listaprd_wcds_3_tfprdnum_sel = AV27TFPrdNum_Sel ;
      AV295Listaprd_wcds_4_tfprdnom = AV28TFPrdNom ;
      AV296Listaprd_wcds_5_tfprdnom_sel = AV29TFPrdNom_Sel ;
      AV297Listaprd_wcds_6_tfprvnum = AV30TFPrvNum ;
      AV298Listaprd_wcds_7_tfprvnum_to = AV31TFPrvNum_To ;
      AV299Listaprd_wcds_8_tfprvnom = AV32TFPrvNom ;
      AV300Listaprd_wcds_9_tfprvnom_sel = AV33TFPrvNom_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV282EmprCod, AV283PrdNumFrom, AV284PrdNumTo, AV285PrvNumFrom, AV286PrvNumTo, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFPrdNum, AV27TFPrdNum_Sel, AV28TFPrdNom, AV29TFPrdNom_Sel, AV30TFPrvNum, AV31TFPrvNum_To, AV32TFPrvNom, AV33TFPrvNom_Sel, AV301Pgmname, AV12OrderedBy, AV13OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV292Listaprd_wcds_1_filterfulltext = AV15FilterFullText ;
      AV293Listaprd_wcds_2_tfprdnum = AV26TFPrdNum ;
      AV294Listaprd_wcds_3_tfprdnum_sel = AV27TFPrdNum_Sel ;
      AV295Listaprd_wcds_4_tfprdnom = AV28TFPrdNom ;
      AV296Listaprd_wcds_5_tfprdnom_sel = AV29TFPrdNom_Sel ;
      AV297Listaprd_wcds_6_tfprvnum = AV30TFPrvNum ;
      AV298Listaprd_wcds_7_tfprvnum_to = AV31TFPrvNum_To ;
      AV299Listaprd_wcds_8_tfprvnom = AV32TFPrvNom ;
      AV300Listaprd_wcds_9_tfprvnom_sel = AV33TFPrvNom_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV282EmprCod, AV283PrdNumFrom, AV284PrdNumTo, AV285PrvNumFrom, AV286PrvNumTo, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFPrdNum, AV27TFPrdNum_Sel, AV28TFPrdNom, AV29TFPrdNom_Sel, AV30TFPrvNum, AV31TFPrvNum_To, AV32TFPrvNom, AV33TFPrvNom_Sel, AV301Pgmname, AV12OrderedBy, AV13OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV301Pgmname = "ListaPrd_WC" ;
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup1M00( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e201M02 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV23ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV277DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV20ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_45 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_45"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV279GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV280GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV282EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV282EmprCod") ;
         wcpOAV283PrdNumFrom = httpContext.cgiGet( sPrefix+"wcpOAV283PrdNumFrom") ;
         wcpOAV284PrdNumTo = httpContext.cgiGet( sPrefix+"wcpOAV284PrdNumTo") ;
         wcpOAV285PrvNumFrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV285PrvNumFrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV286PrvNumTo = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV286PrvNumTo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedcolumn") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_get") ;
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Activeeventkey") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         /* Read variables values. */
         AV15FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
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
      e201M02 ();
      if (returnInSub) return;
   }

   public void e201M02( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV289Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      listaprd_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV289Station = GXt_char1 ;
      GXv_char2[0] = AV282EmprCod ;
      GXv_char3[0] = AV290Emprnom ;
      GXv_char4[0] = AV291Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV289Station, GXv_char2, GXv_char3, GXv_char4) ;
      listaprd_wc_impl.this.AV282EmprCod = GXv_char2[0] ;
      listaprd_wc_impl.this.AV290Emprnom = GXv_char3[0] ;
      listaprd_wc_impl.this.AV291Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV282EmprCod", AV282EmprCod);
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
      if ( AV12OrderedBy < 1 )
      {
         AV12OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV277DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV277DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e211M02( )
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
      if ( AV25ManageFiltersExecutionStep == 1 )
      {
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV25ManageFiltersExecutionStep == 2 )
      {
         AV25ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV22Session.getValue("ListaPrd_WCColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV22Session.getValue("ListaPrd_WCColumnsSelector") ;
         AV20ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtPrdNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrdNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrvNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrvNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNum_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrvNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrvNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNom_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrdExiAlm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdExiAlm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiAlm_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrdExiCC_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdExiCC_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiCC_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrdRefPrv_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdRefPrv_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdRefPrv_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrdCanRes_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdCanRes_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCanRes_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrdUMeFo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdUMeFo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdUMeFo_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrdUcpDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdUcpDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdUcpDsc_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrdUcoDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdUcoDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdUcoDsc_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrdFacCon_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdFacCon_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdFacCon_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtValDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtValDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtValDsc_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrdNum2_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdNum2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum2_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrdPreAct_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdPreAct_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPreAct_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrdFT_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdFT_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdFT_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrdFFT_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdFFT_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdFFT_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrdHS_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdHS_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdHS_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrdFHS_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdFHS_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdFHS_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrdReach_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdReach_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdReach_Visible), 5, 0), !bGXsfl_45_Refreshing);
      cmbPrdOkotex.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbPrdOkotex.getInternalname(), "Visible", GXutil.ltrimstr( cmbPrdOkotex.getVisible(), 5, 0), !bGXsfl_45_Refreshing);
      edtPrdGots_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdGots_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdGots_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrdHm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdHm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdHm_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrdDqo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdDqo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdDqo_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrdAox_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdAox_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdAox_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrdColIdx_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdColIdx_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdColIdx_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtTipPrdCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+27)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtTipPrdCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipPrdCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtTipPrdDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+28)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtTipPrdDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipPrdDsc_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrdNroCAS_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+29)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdNroCAS_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNroCAS_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrdRTM_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+30)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdRTM_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdRTM_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrdCtw1_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+31)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdCtw1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCtw1_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrdCtw2_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+32)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdCtw2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCtw2_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrdCtw3_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+33)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdCtw3_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCtw3_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrdCtw4_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+34)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdCtw4_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCtw4_Visible), 5, 0), !bGXsfl_45_Refreshing);
      cmbPrdList.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+35)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbPrdList.getInternalname(), "Visible", GXutil.ltrimstr( cmbPrdList.getVisible(), 5, 0), !bGXsfl_45_Refreshing);
      edtPrdEINECS_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+36)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdEINECS_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdEINECS_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrdFuncion_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+37)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdFuncion_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdFuncion_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrdNmQu_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+38)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdNmQu_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNmQu_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrdDensS_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+39)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdDensS_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdDensS_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrdTnq_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+40)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdTnq_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdTnq_Visible), 5, 0), !bGXsfl_45_Refreshing);
      AV279GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV279GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV279GridCurrentPage), 10, 0));
      AV280GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV280GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV280GridPageCount), 10, 0));
      AV292Listaprd_wcds_1_filterfulltext = AV15FilterFullText ;
      AV293Listaprd_wcds_2_tfprdnum = AV26TFPrdNum ;
      AV294Listaprd_wcds_3_tfprdnum_sel = AV27TFPrdNum_Sel ;
      AV295Listaprd_wcds_4_tfprdnom = AV28TFPrdNom ;
      AV296Listaprd_wcds_5_tfprdnom_sel = AV29TFPrdNom_Sel ;
      AV297Listaprd_wcds_6_tfprvnum = AV30TFPrvNum ;
      AV298Listaprd_wcds_7_tfprvnum_to = AV31TFPrvNum_To ;
      AV299Listaprd_wcds_8_tfprvnom = AV32TFPrvNom ;
      AV300Listaprd_wcds_9_tfprvnom_sel = AV33TFPrvNom_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e121M02( )
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
         AV278PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV278PageToGo) ;
      }
   }

   public void e131M02( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e141M02( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNum") == 0 )
         {
            AV26TFPrdNum = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFPrdNum", AV26TFPrdNum);
            AV27TFPrdNum_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFPrdNum_Sel", AV27TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNom") == 0 )
         {
            AV28TFPrdNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFPrdNom", AV28TFPrdNom);
            AV29TFPrdNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFPrdNom_Sel", AV29TFPrdNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvNum") == 0 )
         {
            AV30TFPrvNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFPrvNum), 6, 0));
            AV31TFPrvNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFPrvNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TFPrvNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvNom") == 0 )
         {
            AV32TFPrvNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFPrvNom", AV32TFPrvNom);
            AV33TFPrvNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFPrvNom_Sel", AV33TFPrvNom_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e221M02( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         edtPrdNom_Link = formatLink("app.tnprovprdview", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A719PrdNum)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","PrdNum","TabCode"})  ;
         edtPrdUcpDsc_Link = formatLink("app.stocksquimicos.ttipuniview", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A742PrdUniCom,1,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","UniCod","TabCode"})  ;
         edtPrdUcoDsc_Link = formatLink("app.stocksquimicos.ttipuniview", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A743PrdUniCon,1,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","UniCod","TabCode"})  ;
         edtValDsc_Link = formatLink("app.stocksquimicos.ttipvalview", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A856ValCod,1,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","ValCod","TabCode"})  ;
         edtTipPrdDsc_Link = formatLink("app.stocksquimicos.ttipprdview", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A6301TipPrdCod,4,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","TipPrdCod","TabCode"})  ;
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(45) ;
         }
         sendrow_452( ) ;
         GRID_nEOF = (byte)(1) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         if ( ( subGrid_Islastpage == 1 ) && ( ((int)((GRID_nCurrentRecord) % (subgrid_fnc_recordsperpage( )))) == 0 ) )
         {
            GRID_nFirstRecordOnPage = GRID_nCurrentRecord ;
         }
      }
      if ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) )
      {
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      }
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_45_Refreshing )
      {
         httpContext.doAjaxLoad(45, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e151M02( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV18ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV20ColumnsSelector.fromJSonString(AV18ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "ListaPrd_WCColumnsSelector", ((GXutil.strcmp("", AV18ColumnsSelectorXML)==0) ? "" : AV20ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e111M02( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S172 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S152 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("ListaPrd_WCFilters")),GXutil.URLEncode(GXutil.rtrim(AV301Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("ListaPrd_WCFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV24ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "ListaPrd_WCFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         listaprd_wc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV24ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV24ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV301Pgmname+"GridState", AV24ManageFiltersXml) ;
            AV10GridState.fromxml(AV24ManageFiltersXml, null, null);
            AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
            AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
            /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
            S142 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S182 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefreshCmp(sPrefix);
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
   }

   public void e161M02( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.stocksquimicos.produc", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"Mode","EmprCod","PrdNum"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void e171M02( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char4[0] = AV16ExcelFilename ;
      GXv_char3[0] = AV17ErrorMessage ;
      new app.listaprd_wcexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      listaprd_wc_impl.this.AV16ExcelFilename = GXv_char4[0] ;
      listaprd_wc_impl.this.AV17ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV16ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV16ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV17ErrorMessage);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e181M02( )
   {
      /* 'DoExportReport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      Innewwindow1_Target = formatLink("app.listaprd_wcexportreport", new String[] {}, new String[] {})  ;
      ucInnewwindow1.sendProperty(context, sPrefix, false, Innewwindow1_Internalname, "Target", Innewwindow1_Target);
      Innewwindow1_Height = "600" ;
      ucInnewwindow1.sendProperty(context, sPrefix, false, Innewwindow1_Internalname, "Height", Innewwindow1_Height);
      Innewwindow1_Width = "800" ;
      ucInnewwindow1.sendProperty(context, sPrefix, false, Innewwindow1_Internalname, "Width", Innewwindow1_Width);
      this.executeUsercontrolMethod(sPrefix, false, "INNEWWINDOW1Container", "OpenWindow", "", new Object[] {});
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e191M02( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.listaprd_wcexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
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
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV20ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdNum", "", "Producto", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdNom", "", "Descripcion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrvNum", "", "Codigo Proveedor", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrvNom", "", "Nombre Proveedor", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdExiAlm", "", "Existencias Almacen", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdExiCC", "", "Existencia Cuarto Color", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdRefPrv", "", "Referencia Proveedor", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdCanRes", "", "Cantidad Reservada", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdUMeFo", "", "Unid.Medida Prod. en Formula", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdUcpDsc", "", "Descripcion Unidad de Compra", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdUcoDsc", "", "Descripcion Unidad Consumo", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdFacCon", "", "Factor de Conversion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ValDsc", "", "Validez", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdNum2", "", "Codigo Producto Auxiliar", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdPreAct", "", "Precio Actual", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdFT", "", "Ficha Tecnica?", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdFFT", "", "Fecha Ficha Tecnica", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdHS", "", "Hoja Seguridad?", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdFHS", "", "Fecha Hoja Seguridad", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdReach", "", "REACH", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdOkotex", "", "OEKO-TEX", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdGots", "", "GOTS", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdHm", "", "H&M", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdDqo", "", "Demanda Quimica Oxigeno", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdAox", "", "AOX (adsorbable organic halogens)", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdColIdx", "", "Color Index", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "TipPrdCod", "", "Tipo Producto", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "TipPrdDsc", "", "Descripcion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdNroCAS", "", "Numero de CAS (Chemical Abstracts Service)", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdRTM", "", "Manual RTM (Requirement Tracability Matrix)", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdCtw1", "", "Formaldeido", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdCtw2", "", "Airlaminas", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdCtw3", "", "Apeo", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdCtw4", "", "PFC", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdList", "", "List by Inditex ", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdEINECS", "", "N EINECS", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdFuncion", "", "Funcion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdNmQu", "", "Nombre Substancia Quimica", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdDensS", "", "Densidad Sal Muera (g/l)", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdTnq", "", "Tanque", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV19UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "ListaPrd_WCColumnsSelector", GXv_char4) ;
      listaprd_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      AV19UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV19UserCustomValue)==0) ) )
      {
         AV21ColumnsSelectorAux.fromxml(AV19UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector8[0] = AV21ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector9[0] = AV20ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, GXv_SdtWWPColumnsSelector9) ;
         AV21ColumnsSelectorAux = GXv_SdtWWPColumnsSelector8[0] ;
         AV20ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = AV23ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "ListaPrd_WCFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV23ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV15FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
      AV26TFPrdNum = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFPrdNum", AV26TFPrdNum);
      AV27TFPrdNum_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFPrdNum_Sel", AV27TFPrdNum_Sel);
      AV28TFPrdNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFPrdNom", AV28TFPrdNom);
      AV29TFPrdNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFPrdNom_Sel", AV29TFPrdNom_Sel);
      AV30TFPrvNum = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFPrvNum), 6, 0));
      AV31TFPrvNum_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFPrvNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TFPrvNum_To), 6, 0));
      AV32TFPrvNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFPrvNom", AV32TFPrvNom);
      AV33TFPrvNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFPrvNom_Sel", AV33TFPrvNom_Sel);
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
      if ( GXutil.strcmp(AV22Session.getValue(AV301Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV301Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV301Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S182 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S182( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV302GXV1 = 1 ;
      while ( AV302GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV302GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV15FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV26TFPrdNum = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFPrdNum", AV26TFPrdNum);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV27TFPrdNum_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFPrdNum_Sel", AV27TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV28TFPrdNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFPrdNom", AV28TFPrdNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV29TFPrdNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFPrdNom_Sel", AV29TFPrdNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNUM") == 0 )
         {
            AV30TFPrvNum = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFPrvNum), 6, 0));
            AV31TFPrvNum_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFPrvNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TFPrvNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM") == 0 )
         {
            AV32TFPrvNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFPrvNom", AV32TFPrvNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM_SEL") == 0 )
         {
            AV33TFPrvNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFPrvNom_Sel", AV33TFPrvNom_Sel);
         }
         AV302GXV1 = (int)(AV302GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV27TFPrdNum_Sel)==0), AV27TFPrdNum_Sel, GXv_char4) ;
      listaprd_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV29TFPrdNom_Sel)==0), AV29TFPrdNom_Sel, GXv_char3) ;
      listaprd_wc_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char2[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV33TFPrvNom_Sel)==0), AV33TFPrvNom_Sel, GXv_char2) ;
      listaprd_wc_impl.this.GXt_char13 = GXv_char2[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|"+GXt_char12+"||"+GXt_char13+"||||||||||||||||||||||||||||||||||||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV26TFPrdNum)==0), AV26TFPrdNum, GXv_char4) ;
      listaprd_wc_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV28TFPrdNom)==0), AV28TFPrdNom, GXv_char3) ;
      listaprd_wc_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV32TFPrvNom)==0), AV32TFPrvNom, GXv_char2) ;
      listaprd_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = GXt_char13+"|"+GXt_char12+"|"+((0==AV30TFPrvNum) ? "" : GXutil.str( AV30TFPrvNum, 6, 0))+"|"+GXt_char1+"||||||||||||||||||||||||||||||||||||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "||"+((0==AV31TFPrvNum_To) ? "" : GXutil.str( AV31TFPrvNum_To, 6, 0))+"|||||||||||||||||||||||||||||||||||||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV22Session.getValue(AV301Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV15FilterFullText)==0), (short)(0), AV15FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFPRDNUM", "", !(GXutil.strcmp("", AV26TFPrdNum)==0), (short)(0), AV26TFPrdNum, "", !(GXutil.strcmp("", AV27TFPrdNum_Sel)==0), AV27TFPrdNum_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFPRDNOM", "", !(GXutil.strcmp("", AV28TFPrdNom)==0), (short)(0), AV28TFPrdNom, "", !(GXutil.strcmp("", AV29TFPrdNom_Sel)==0), AV29TFPrdNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFPRVNUM", "", !((0==AV30TFPrvNum)&&(0==AV31TFPrvNum_To)), (short)(0), GXutil.trim( GXutil.str( AV30TFPrvNum, 6, 0)), GXutil.trim( GXutil.str( AV31TFPrvNum_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFPRVNOM", "", !(GXutil.strcmp("", AV32TFPrvNom)==0), (short)(0), AV32TFPrvNom, "", !(GXutil.strcmp("", AV33TFPrvNom_Sel)==0), AV33TFPrvNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV301Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV301Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "StocksQuimicos.PRODUC" );
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_27_1M02( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV23ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_32_1M02( true) ;
      }
      else
      {
         wb_table2_32_1M02( false) ;
      }
      return  ;
   }

   public void wb_table2_32_1M02e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_27_1M02e( true) ;
      }
      else
      {
         wb_table1_27_1M02e( false) ;
      }
   }

   public void wb_table2_32_1M02( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'" + sPrefix + "',false,'" + sGXsfl_45_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV15FilterFullText, GXutil.rtrim( localUtil.format( AV15FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_ListaPrd_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_32_1M02e( true) ;
      }
      else
      {
         wb_table2_32_1M02e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV282EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV282EmprCod", AV282EmprCod);
      AV283PrdNumFrom = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV283PrdNumFrom", AV283PrdNumFrom);
      AV284PrdNumTo = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV284PrdNumTo", AV284PrdNumTo);
      AV285PrvNumFrom = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV285PrvNumFrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV285PrvNumFrom), 6, 0));
      AV286PrvNumTo = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV286PrvNumTo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV286PrvNumTo), 6, 0));
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
      pa1M02( ) ;
      ws1M02( ) ;
      we1M02( ) ;
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
      sCtrlAV282EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV283PrdNumFrom = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV284PrdNumTo = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV285PrvNumFrom = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV286PrvNumTo = (String)getParm(obj,4,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1M02( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "listaprd_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1M02( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV282EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV282EmprCod", AV282EmprCod);
         AV283PrdNumFrom = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV283PrdNumFrom", AV283PrdNumFrom);
         AV284PrdNumTo = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV284PrdNumTo", AV284PrdNumTo);
         AV285PrvNumFrom = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV285PrvNumFrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV285PrvNumFrom), 6, 0));
         AV286PrvNumTo = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV286PrvNumTo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV286PrvNumTo), 6, 0));
      }
      wcpOAV282EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV282EmprCod") ;
      wcpOAV283PrdNumFrom = httpContext.cgiGet( sPrefix+"wcpOAV283PrdNumFrom") ;
      wcpOAV284PrdNumTo = httpContext.cgiGet( sPrefix+"wcpOAV284PrdNumTo") ;
      wcpOAV285PrvNumFrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV285PrvNumFrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV286PrvNumTo = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV286PrvNumTo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV282EmprCod, wcpOAV282EmprCod) != 0 ) || ( GXutil.strcmp(AV283PrdNumFrom, wcpOAV283PrdNumFrom) != 0 ) || ( GXutil.strcmp(AV284PrdNumTo, wcpOAV284PrdNumTo) != 0 ) || ( AV285PrvNumFrom != wcpOAV285PrvNumFrom ) || ( AV286PrvNumTo != wcpOAV286PrvNumTo ) ) )
      {
         setjustcreated();
      }
      wcpOAV282EmprCod = AV282EmprCod ;
      wcpOAV283PrdNumFrom = AV283PrdNumFrom ;
      wcpOAV284PrdNumTo = AV284PrdNumTo ;
      wcpOAV285PrvNumFrom = AV285PrvNumFrom ;
      wcpOAV286PrvNumTo = AV286PrvNumTo ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV282EmprCod = httpContext.cgiGet( sPrefix+"AV282EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV282EmprCod) > 0 )
      {
         AV282EmprCod = httpContext.cgiGet( sCtrlAV282EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV282EmprCod", AV282EmprCod);
      }
      else
      {
         AV282EmprCod = httpContext.cgiGet( sPrefix+"AV282EmprCod_PARM") ;
      }
      sCtrlAV283PrdNumFrom = httpContext.cgiGet( sPrefix+"AV283PrdNumFrom_CTRL") ;
      if ( GXutil.len( sCtrlAV283PrdNumFrom) > 0 )
      {
         AV283PrdNumFrom = httpContext.cgiGet( sCtrlAV283PrdNumFrom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV283PrdNumFrom", AV283PrdNumFrom);
      }
      else
      {
         AV283PrdNumFrom = httpContext.cgiGet( sPrefix+"AV283PrdNumFrom_PARM") ;
      }
      sCtrlAV284PrdNumTo = httpContext.cgiGet( sPrefix+"AV284PrdNumTo_CTRL") ;
      if ( GXutil.len( sCtrlAV284PrdNumTo) > 0 )
      {
         AV284PrdNumTo = httpContext.cgiGet( sCtrlAV284PrdNumTo) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV284PrdNumTo", AV284PrdNumTo);
      }
      else
      {
         AV284PrdNumTo = httpContext.cgiGet( sPrefix+"AV284PrdNumTo_PARM") ;
      }
      sCtrlAV285PrvNumFrom = httpContext.cgiGet( sPrefix+"AV285PrvNumFrom_CTRL") ;
      if ( GXutil.len( sCtrlAV285PrvNumFrom) > 0 )
      {
         AV285PrvNumFrom = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV285PrvNumFrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV285PrvNumFrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV285PrvNumFrom), 6, 0));
      }
      else
      {
         AV285PrvNumFrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV285PrvNumFrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV286PrvNumTo = httpContext.cgiGet( sPrefix+"AV286PrvNumTo_CTRL") ;
      if ( GXutil.len( sCtrlAV286PrvNumTo) > 0 )
      {
         AV286PrvNumTo = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV286PrvNumTo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV286PrvNumTo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV286PrvNumTo), 6, 0));
      }
      else
      {
         AV286PrvNumTo = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV286PrvNumTo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa1M02( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1M02( ) ;
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
      ws1M02( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV282EmprCod_PARM", GXutil.rtrim( AV282EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV282EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV282EmprCod_CTRL", GXutil.rtrim( sCtrlAV282EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV283PrdNumFrom_PARM", GXutil.rtrim( AV283PrdNumFrom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV283PrdNumFrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV283PrdNumFrom_CTRL", GXutil.rtrim( sCtrlAV283PrdNumFrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV284PrdNumTo_PARM", GXutil.rtrim( AV284PrdNumTo));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV284PrdNumTo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV284PrdNumTo_CTRL", GXutil.rtrim( sCtrlAV284PrdNumTo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV285PrvNumFrom_PARM", GXutil.ltrim( localUtil.ntoc( AV285PrvNumFrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV285PrvNumFrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV285PrvNumFrom_CTRL", GXutil.rtrim( sCtrlAV285PrvNumFrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV286PrvNumTo_PARM", GXutil.ltrim( localUtil.ntoc( AV286PrvNumTo, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV286PrvNumTo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV286PrvNumTo_CTRL", GXutil.rtrim( sCtrlAV286PrvNumTo));
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
      we1M02( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026821168627", true, true);
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
      httpContext.AddJavascriptSource("listaprd_wc.js", "?2026821168627", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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

   public void subsflControlProps_452( )
   {
      edtEmprCod_Internalname = sPrefix+"EMPRCOD_"+sGXsfl_45_idx ;
      edtEmprNom_Internalname = sPrefix+"EMPRNOM_"+sGXsfl_45_idx ;
      edtPrdNum_Internalname = sPrefix+"PRDNUM_"+sGXsfl_45_idx ;
      edtPrdNom_Internalname = sPrefix+"PRDNOM_"+sGXsfl_45_idx ;
      edtPrvNum_Internalname = sPrefix+"PRVNUM_"+sGXsfl_45_idx ;
      edtPrvNom_Internalname = sPrefix+"PRVNOM_"+sGXsfl_45_idx ;
      edtPrdExiAlm_Internalname = sPrefix+"PRDEXIALM_"+sGXsfl_45_idx ;
      edtPrdExiCC_Internalname = sPrefix+"PRDEXICC_"+sGXsfl_45_idx ;
      edtPrdRefPrv_Internalname = sPrefix+"PRDREFPRV_"+sGXsfl_45_idx ;
      edtPrdCanRes_Internalname = sPrefix+"PRDCANRES_"+sGXsfl_45_idx ;
      edtPrdUMeFo_Internalname = sPrefix+"PRDUMEFO_"+sGXsfl_45_idx ;
      edtPrdUcpDsc_Internalname = sPrefix+"PRDUCPDSC_"+sGXsfl_45_idx ;
      edtPrdUcoDsc_Internalname = sPrefix+"PRDUCODSC_"+sGXsfl_45_idx ;
      edtPrdFacCon_Internalname = sPrefix+"PRDFACCON_"+sGXsfl_45_idx ;
      edtValDsc_Internalname = sPrefix+"VALDSC_"+sGXsfl_45_idx ;
      edtPrdNum2_Internalname = sPrefix+"PRDNUM2_"+sGXsfl_45_idx ;
      edtPrdPreAct_Internalname = sPrefix+"PRDPREACT_"+sGXsfl_45_idx ;
      edtPrdFT_Internalname = sPrefix+"PRDFT_"+sGXsfl_45_idx ;
      edtPrdFFT_Internalname = sPrefix+"PRDFFT_"+sGXsfl_45_idx ;
      edtPrdHS_Internalname = sPrefix+"PRDHS_"+sGXsfl_45_idx ;
      edtPrdFHS_Internalname = sPrefix+"PRDFHS_"+sGXsfl_45_idx ;
      edtPrdReach_Internalname = sPrefix+"PRDREACH_"+sGXsfl_45_idx ;
      cmbPrdOkotex.setInternalname( sPrefix+"PRDOKOTEX_"+sGXsfl_45_idx );
      edtPrdGots_Internalname = sPrefix+"PRDGOTS_"+sGXsfl_45_idx ;
      edtPrdHm_Internalname = sPrefix+"PRDHM_"+sGXsfl_45_idx ;
      edtPrdDqo_Internalname = sPrefix+"PRDDQO_"+sGXsfl_45_idx ;
      edtPrdAox_Internalname = sPrefix+"PRDAOX_"+sGXsfl_45_idx ;
      edtPrdColIdx_Internalname = sPrefix+"PRDCOLIDX_"+sGXsfl_45_idx ;
      edtTipPrdCod_Internalname = sPrefix+"TIPPRDCOD_"+sGXsfl_45_idx ;
      edtTipPrdDsc_Internalname = sPrefix+"TIPPRDDSC_"+sGXsfl_45_idx ;
      edtPrdNroCAS_Internalname = sPrefix+"PRDNROCAS_"+sGXsfl_45_idx ;
      edtPrdRTM_Internalname = sPrefix+"PRDRTM_"+sGXsfl_45_idx ;
      edtPrdCtw1_Internalname = sPrefix+"PRDCTW1_"+sGXsfl_45_idx ;
      edtPrdCtw2_Internalname = sPrefix+"PRDCTW2_"+sGXsfl_45_idx ;
      edtPrdCtw3_Internalname = sPrefix+"PRDCTW3_"+sGXsfl_45_idx ;
      edtPrdCtw4_Internalname = sPrefix+"PRDCTW4_"+sGXsfl_45_idx ;
      cmbPrdList.setInternalname( sPrefix+"PRDLIST_"+sGXsfl_45_idx );
      edtPrdEINECS_Internalname = sPrefix+"PRDEINECS_"+sGXsfl_45_idx ;
      edtPrdFuncion_Internalname = sPrefix+"PRDFUNCION_"+sGXsfl_45_idx ;
      edtPrdNmQu_Internalname = sPrefix+"PRDNMQU_"+sGXsfl_45_idx ;
      edtPrdDensS_Internalname = sPrefix+"PRDDENSS_"+sGXsfl_45_idx ;
      edtPrdTnq_Internalname = sPrefix+"PRDTNQ_"+sGXsfl_45_idx ;
   }

   public void subsflControlProps_fel_452( )
   {
      edtEmprCod_Internalname = sPrefix+"EMPRCOD_"+sGXsfl_45_fel_idx ;
      edtEmprNom_Internalname = sPrefix+"EMPRNOM_"+sGXsfl_45_fel_idx ;
      edtPrdNum_Internalname = sPrefix+"PRDNUM_"+sGXsfl_45_fel_idx ;
      edtPrdNom_Internalname = sPrefix+"PRDNOM_"+sGXsfl_45_fel_idx ;
      edtPrvNum_Internalname = sPrefix+"PRVNUM_"+sGXsfl_45_fel_idx ;
      edtPrvNom_Internalname = sPrefix+"PRVNOM_"+sGXsfl_45_fel_idx ;
      edtPrdExiAlm_Internalname = sPrefix+"PRDEXIALM_"+sGXsfl_45_fel_idx ;
      edtPrdExiCC_Internalname = sPrefix+"PRDEXICC_"+sGXsfl_45_fel_idx ;
      edtPrdRefPrv_Internalname = sPrefix+"PRDREFPRV_"+sGXsfl_45_fel_idx ;
      edtPrdCanRes_Internalname = sPrefix+"PRDCANRES_"+sGXsfl_45_fel_idx ;
      edtPrdUMeFo_Internalname = sPrefix+"PRDUMEFO_"+sGXsfl_45_fel_idx ;
      edtPrdUcpDsc_Internalname = sPrefix+"PRDUCPDSC_"+sGXsfl_45_fel_idx ;
      edtPrdUcoDsc_Internalname = sPrefix+"PRDUCODSC_"+sGXsfl_45_fel_idx ;
      edtPrdFacCon_Internalname = sPrefix+"PRDFACCON_"+sGXsfl_45_fel_idx ;
      edtValDsc_Internalname = sPrefix+"VALDSC_"+sGXsfl_45_fel_idx ;
      edtPrdNum2_Internalname = sPrefix+"PRDNUM2_"+sGXsfl_45_fel_idx ;
      edtPrdPreAct_Internalname = sPrefix+"PRDPREACT_"+sGXsfl_45_fel_idx ;
      edtPrdFT_Internalname = sPrefix+"PRDFT_"+sGXsfl_45_fel_idx ;
      edtPrdFFT_Internalname = sPrefix+"PRDFFT_"+sGXsfl_45_fel_idx ;
      edtPrdHS_Internalname = sPrefix+"PRDHS_"+sGXsfl_45_fel_idx ;
      edtPrdFHS_Internalname = sPrefix+"PRDFHS_"+sGXsfl_45_fel_idx ;
      edtPrdReach_Internalname = sPrefix+"PRDREACH_"+sGXsfl_45_fel_idx ;
      cmbPrdOkotex.setInternalname( sPrefix+"PRDOKOTEX_"+sGXsfl_45_fel_idx );
      edtPrdGots_Internalname = sPrefix+"PRDGOTS_"+sGXsfl_45_fel_idx ;
      edtPrdHm_Internalname = sPrefix+"PRDHM_"+sGXsfl_45_fel_idx ;
      edtPrdDqo_Internalname = sPrefix+"PRDDQO_"+sGXsfl_45_fel_idx ;
      edtPrdAox_Internalname = sPrefix+"PRDAOX_"+sGXsfl_45_fel_idx ;
      edtPrdColIdx_Internalname = sPrefix+"PRDCOLIDX_"+sGXsfl_45_fel_idx ;
      edtTipPrdCod_Internalname = sPrefix+"TIPPRDCOD_"+sGXsfl_45_fel_idx ;
      edtTipPrdDsc_Internalname = sPrefix+"TIPPRDDSC_"+sGXsfl_45_fel_idx ;
      edtPrdNroCAS_Internalname = sPrefix+"PRDNROCAS_"+sGXsfl_45_fel_idx ;
      edtPrdRTM_Internalname = sPrefix+"PRDRTM_"+sGXsfl_45_fel_idx ;
      edtPrdCtw1_Internalname = sPrefix+"PRDCTW1_"+sGXsfl_45_fel_idx ;
      edtPrdCtw2_Internalname = sPrefix+"PRDCTW2_"+sGXsfl_45_fel_idx ;
      edtPrdCtw3_Internalname = sPrefix+"PRDCTW3_"+sGXsfl_45_fel_idx ;
      edtPrdCtw4_Internalname = sPrefix+"PRDCTW4_"+sGXsfl_45_fel_idx ;
      cmbPrdList.setInternalname( sPrefix+"PRDLIST_"+sGXsfl_45_fel_idx );
      edtPrdEINECS_Internalname = sPrefix+"PRDEINECS_"+sGXsfl_45_fel_idx ;
      edtPrdFuncion_Internalname = sPrefix+"PRDFUNCION_"+sGXsfl_45_fel_idx ;
      edtPrdNmQu_Internalname = sPrefix+"PRDNMQU_"+sGXsfl_45_fel_idx ;
      edtPrdDensS_Internalname = sPrefix+"PRDDENSS_"+sGXsfl_45_fel_idx ;
      edtPrdTnq_Internalname = sPrefix+"PRDTNQ_"+sGXsfl_45_fel_idx ;
   }

   public void sendrow_452( )
   {
      subsflControlProps_452( ) ;
      wb1M00( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_45_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_45_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_45_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprNom_Internalname,GXutil.rtrim( A407EmprNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtEmprNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNom_Internalname,GXutil.rtrim( A718PrdNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'",edtPrdNom_Link,"","","",edtPrdNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrvNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvNum_Internalname,GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrvNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrvNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrvNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvNom_Internalname,GXutil.rtrim( A794PrvNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrvNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrvNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdExiAlm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdExiAlm_Internalname,GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A704PrdExiAlm, "ZZZZZZ9.9999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdExiAlm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdExiAlm_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdExiCC_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdExiCC_Internalname,GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A705PrdExiCC, "ZZZZZZ9.9999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdExiCC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdExiCC_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdRefPrv_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdRefPrv_Internalname,GXutil.rtrim( A728PrdRefPrv),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdRefPrv_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdRefPrv_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdCanRes_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdCanRes_Internalname,GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A685PrdCanRes, "ZZZZZZ9.9999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdCanRes_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdCanRes_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdUMeFo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdUMeFo_Internalname,GXutil.ltrim( localUtil.ntoc( A4338PrdUMeFo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4338PrdUMeFo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdUMeFo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdUMeFo_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdUcpDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdUcpDsc_Internalname,GXutil.rtrim( A737PrdUcpDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'",edtPrdUcpDsc_Link,"","","",edtPrdUcpDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdUcpDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdUcoDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdUcoDsc_Internalname,GXutil.rtrim( A736PrdUcoDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'",edtPrdUcoDsc_Link,"","","",edtPrdUcoDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdUcoDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdFacCon_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdFacCon_Internalname,GXutil.ltrim( localUtil.ntoc( A707PrdFacCon, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A707PrdFacCon, "Z9.9999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdFacCon_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdFacCon_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtValDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtValDsc_Internalname,GXutil.rtrim( A857ValDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'",edtValDsc_Link,"","","",edtValDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtValDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdNum2_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum2_Internalname,GXutil.rtrim( A4693PrdNum2),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdNum2_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdPreAct_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdPreAct_Internalname,GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A724PrdPreAct, "ZZZZZZZ9.999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdPreAct_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdPreAct_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdFT_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdFT_Internalname,GXutil.rtrim( A9739PrdFT),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdFT_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdFT_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdFFT_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdFFT_Internalname,localUtil.format(A9740PrdFFT, "99/99/99"),localUtil.format( A9740PrdFFT, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdFFT_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdFFT_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdHS_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdHS_Internalname,GXutil.rtrim( A9741PrdHS),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdHS_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdHS_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdFHS_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdFHS_Internalname,localUtil.format(A9742PrdFHS, "99/99/99"),localUtil.format( A9742PrdFHS, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdFHS_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdFHS_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdReach_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdReach_Internalname,GXutil.rtrim( A5887PrdReach),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdReach_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdReach_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbPrdOkotex.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbPrdOkotex.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "PRDOKOTEX_" + sGXsfl_45_idx ;
            cmbPrdOkotex.setName( GXCCtl );
            cmbPrdOkotex.setWebtags( "" );
            cmbPrdOkotex.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
            cmbPrdOkotex.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
            if ( cmbPrdOkotex.getItemCount() > 0 )
            {
               A5888PrdOkotex = cmbPrdOkotex.getValidValue(A5888PrdOkotex) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbPrdOkotex,cmbPrdOkotex.getInternalname(),GXutil.rtrim( A5888PrdOkotex),Integer.valueOf(1),cmbPrdOkotex.getJsonclick(),Integer.valueOf(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbPrdOkotex.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbPrdOkotex.setValue( GXutil.rtrim( A5888PrdOkotex) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbPrdOkotex.getInternalname(), "Values", cmbPrdOkotex.ToJavascriptSource(), !bGXsfl_45_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdGots_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdGots_Internalname,GXutil.rtrim( A11363PrdGots),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdGots_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdGots_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdHm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdHm_Internalname,GXutil.rtrim( A11364PrdHm),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdHm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdHm_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdDqo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdDqo_Internalname,GXutil.ltrim( localUtil.ntoc( A1644PrdDqo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1644PrdDqo), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdDqo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdDqo_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdAox_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdAox_Internalname,GXutil.ltrim( localUtil.ntoc( A9733PrdAox, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A9733PrdAox, "ZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdAox_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdAox_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdColIdx_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdColIdx_Internalname,GXutil.rtrim( A10119PrdColIdx),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdColIdx_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdColIdx_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtTipPrdCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipPrdCod_Internalname,GXutil.ltrim( localUtil.ntoc( A6301TipPrdCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6301TipPrdCod), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTipPrdCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtTipPrdCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtTipPrdDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipPrdDsc_Internalname,GXutil.rtrim( A6302TipPrdDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'",edtTipPrdDsc_Link,"","","",edtTipPrdDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtTipPrdDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdNroCAS_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNroCAS_Internalname,GXutil.rtrim( A11196PrdNroCAS),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdNroCAS_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdNroCAS_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdRTM_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdRTM_Internalname,GXutil.rtrim( A10935PrdRTM),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdRTM_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdRTM_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdCtw1_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdCtw1_Internalname,GXutil.rtrim( A10936PrdCtw1),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdCtw1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdCtw1_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdCtw2_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdCtw2_Internalname,GXutil.rtrim( A10937PrdCtw2),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdCtw2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdCtw2_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdCtw3_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdCtw3_Internalname,GXutil.rtrim( A10938PrdCtw3),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdCtw3_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdCtw3_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdCtw4_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdCtw4_Internalname,GXutil.rtrim( A11663PrdCtw4),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdCtw4_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdCtw4_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbPrdList.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbPrdList.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "PRDLIST_" + sGXsfl_45_idx ;
            cmbPrdList.setName( GXCCtl );
            cmbPrdList.setWebtags( "" );
            cmbPrdList.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
            cmbPrdList.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
            if ( cmbPrdList.getItemCount() > 0 )
            {
               A11687PrdList = cmbPrdList.getValidValue(A11687PrdList) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbPrdList,cmbPrdList.getInternalname(),GXutil.rtrim( A11687PrdList),Integer.valueOf(1),cmbPrdList.getJsonclick(),Integer.valueOf(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbPrdList.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbPrdList.setValue( GXutil.rtrim( A11687PrdList) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbPrdList.getInternalname(), "Values", cmbPrdList.ToJavascriptSource(), !bGXsfl_45_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdEINECS_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdEINECS_Internalname,GXutil.rtrim( A11614PrdEINECS),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdEINECS_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdEINECS_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdFuncion_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdFuncion_Internalname,GXutil.rtrim( A11615PrdFuncion),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdFuncion_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdFuncion_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdNmQu_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNmQu_Internalname,A11616PrdNmQu,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdNmQu_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdNmQu_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(200),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdDensS_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdDensS_Internalname,GXutil.ltrim( localUtil.ntoc( A5416PrdDensS, (byte)(7), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A5416PrdDensS, "ZZ9.999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdDensS_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdDensS_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdTnq_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdTnq_Internalname,GXutil.ltrim( localUtil.ntoc( A3273PrdTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3273PrdTnq), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdTnq_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdTnq_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1M02( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_45_idx = ((subGrid_Islastpage==1)&&(nGXsfl_45_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_452( ) ;
      }
      /* End function sendrow_452 */
   }

   public void startgridcontrol45( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"45\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrvNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Proveedor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrvNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre Proveedor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdExiAlm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Existencias Almacen", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdExiCC_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Existencia Cuarto Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdRefPrv_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Referencia Proveedor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdCanRes_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cantidad Reservada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdUMeFo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unid.Medida Prod. en Formula", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdUcpDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion Unidad de Compra", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdUcoDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion Unidad Consumo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdFacCon_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Factor de Conversion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtValDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Validez", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdNum2_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Producto Auxiliar", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdPreAct_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Precio Actual", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdFT_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ficha Tecnica?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdFFT_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Ficha Tecnica", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdHS_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hoja Seguridad?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdFHS_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Hoja Seguridad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdReach_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "REACH", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbPrdOkotex.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "OEKO-TEX", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdGots_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "GOTS", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdHm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "H&M", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdDqo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Demanda Quimica Oxigeno", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdAox_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "AOX (adsorbable organic halogens)", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdColIdx_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color Index", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtTipPrdCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtTipPrdDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdNroCAS_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero de CAS (Chemical Abstracts Service)", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdRTM_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Manual RTM (Requirement Tracability Matrix)", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdCtw1_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Formaldeido", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdCtw2_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Airlaminas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdCtw3_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Apeo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdCtw4_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "PFC", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbPrdList.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "List by Inditex ", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdEINECS_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N EINECS", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdFuncion_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Funcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdNmQu_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre Substancia Quimica", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdDensS_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Densidad Sal Muera (g/l)", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdTnq_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tanque", "")) ;
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
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A407EmprNom));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A719PrdNum));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A718PrdNom));
         GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtPrdNom_Link));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrvNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A794PrvNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrvNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdExiAlm_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdExiCC_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A728PrdRefPrv));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdRefPrv_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdCanRes_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4338PrdUMeFo, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdUMeFo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A737PrdUcpDsc));
         GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtPrdUcpDsc_Link));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdUcpDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A736PrdUcoDsc));
         GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtPrdUcoDsc_Link));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdUcoDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A707PrdFacCon, (byte)(7), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdFacCon_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A857ValDsc));
         GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtValDsc_Link));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtValDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4693PrdNum2));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdNum2_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdPreAct_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A9739PrdFT));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdFT_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A9740PrdFFT, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdFFT_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A9741PrdHS));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdHS_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A9742PrdFHS, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdFHS_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5887PrdReach));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdReach_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5888PrdOkotex));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbPrdOkotex.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11363PrdGots));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdGots_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11364PrdHm));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdHm_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1644PrdDqo, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdDqo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9733PrdAox, (byte)(6), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdAox_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A10119PrdColIdx));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdColIdx_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6301TipPrdCod, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtTipPrdCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A6302TipPrdDsc));
         GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtTipPrdDsc_Link));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtTipPrdDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11196PrdNroCAS));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdNroCAS_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A10935PrdRTM));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdRTM_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A10936PrdCtw1));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdCtw1_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A10937PrdCtw2));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdCtw2_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A10938PrdCtw3));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdCtw3_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11663PrdCtw4));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdCtw4_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11687PrdList));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbPrdList.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11614PrdEINECS));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdEINECS_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11615PrdFuncion));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdFuncion_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A11616PrdNmQu);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdNmQu_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5416PrdDensS, (byte)(7), (byte)(3), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdDensS_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3273PrdTnq, (byte)(2), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdTnq_Visible, (byte)(5), (byte)(0), ".", "")));
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
      bttBtninsert_Internalname = sPrefix+"BTNINSERT" ;
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
      edtEmprNom_Internalname = sPrefix+"EMPRNOM" ;
      edtPrdNum_Internalname = sPrefix+"PRDNUM" ;
      edtPrdNom_Internalname = sPrefix+"PRDNOM" ;
      edtPrvNum_Internalname = sPrefix+"PRVNUM" ;
      edtPrvNom_Internalname = sPrefix+"PRVNOM" ;
      edtPrdExiAlm_Internalname = sPrefix+"PRDEXIALM" ;
      edtPrdExiCC_Internalname = sPrefix+"PRDEXICC" ;
      edtPrdRefPrv_Internalname = sPrefix+"PRDREFPRV" ;
      edtPrdCanRes_Internalname = sPrefix+"PRDCANRES" ;
      edtPrdUMeFo_Internalname = sPrefix+"PRDUMEFO" ;
      edtPrdUcpDsc_Internalname = sPrefix+"PRDUCPDSC" ;
      edtPrdUcoDsc_Internalname = sPrefix+"PRDUCODSC" ;
      edtPrdFacCon_Internalname = sPrefix+"PRDFACCON" ;
      edtValDsc_Internalname = sPrefix+"VALDSC" ;
      edtPrdNum2_Internalname = sPrefix+"PRDNUM2" ;
      edtPrdPreAct_Internalname = sPrefix+"PRDPREACT" ;
      edtPrdFT_Internalname = sPrefix+"PRDFT" ;
      edtPrdFFT_Internalname = sPrefix+"PRDFFT" ;
      edtPrdHS_Internalname = sPrefix+"PRDHS" ;
      edtPrdFHS_Internalname = sPrefix+"PRDFHS" ;
      edtPrdReach_Internalname = sPrefix+"PRDREACH" ;
      cmbPrdOkotex.setInternalname( sPrefix+"PRDOKOTEX" );
      edtPrdGots_Internalname = sPrefix+"PRDGOTS" ;
      edtPrdHm_Internalname = sPrefix+"PRDHM" ;
      edtPrdDqo_Internalname = sPrefix+"PRDDQO" ;
      edtPrdAox_Internalname = sPrefix+"PRDAOX" ;
      edtPrdColIdx_Internalname = sPrefix+"PRDCOLIDX" ;
      edtTipPrdCod_Internalname = sPrefix+"TIPPRDCOD" ;
      edtTipPrdDsc_Internalname = sPrefix+"TIPPRDDSC" ;
      edtPrdNroCAS_Internalname = sPrefix+"PRDNROCAS" ;
      edtPrdRTM_Internalname = sPrefix+"PRDRTM" ;
      edtPrdCtw1_Internalname = sPrefix+"PRDCTW1" ;
      edtPrdCtw2_Internalname = sPrefix+"PRDCTW2" ;
      edtPrdCtw3_Internalname = sPrefix+"PRDCTW3" ;
      edtPrdCtw4_Internalname = sPrefix+"PRDCTW4" ;
      cmbPrdList.setInternalname( sPrefix+"PRDLIST" );
      edtPrdEINECS_Internalname = sPrefix+"PRDEINECS" ;
      edtPrdFuncion_Internalname = sPrefix+"PRDFUNCION" ;
      edtPrdNmQu_Internalname = sPrefix+"PRDNMQU" ;
      edtPrdDensS_Internalname = sPrefix+"PRDDENSS" ;
      edtPrdTnq_Internalname = sPrefix+"PRDTNQ" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
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
      edtPrdTnq_Jsonclick = "" ;
      edtPrdDensS_Jsonclick = "" ;
      edtPrdNmQu_Jsonclick = "" ;
      edtPrdFuncion_Jsonclick = "" ;
      edtPrdEINECS_Jsonclick = "" ;
      cmbPrdList.setJsonclick( "" );
      edtPrdCtw4_Jsonclick = "" ;
      edtPrdCtw3_Jsonclick = "" ;
      edtPrdCtw2_Jsonclick = "" ;
      edtPrdCtw1_Jsonclick = "" ;
      edtPrdRTM_Jsonclick = "" ;
      edtPrdNroCAS_Jsonclick = "" ;
      edtTipPrdDsc_Jsonclick = "" ;
      edtTipPrdDsc_Link = "" ;
      edtTipPrdCod_Jsonclick = "" ;
      edtPrdColIdx_Jsonclick = "" ;
      edtPrdAox_Jsonclick = "" ;
      edtPrdDqo_Jsonclick = "" ;
      edtPrdHm_Jsonclick = "" ;
      edtPrdGots_Jsonclick = "" ;
      cmbPrdOkotex.setJsonclick( "" );
      edtPrdReach_Jsonclick = "" ;
      edtPrdFHS_Jsonclick = "" ;
      edtPrdHS_Jsonclick = "" ;
      edtPrdFFT_Jsonclick = "" ;
      edtPrdFT_Jsonclick = "" ;
      edtPrdPreAct_Jsonclick = "" ;
      edtPrdNum2_Jsonclick = "" ;
      edtValDsc_Jsonclick = "" ;
      edtValDsc_Link = "" ;
      edtPrdFacCon_Jsonclick = "" ;
      edtPrdUcoDsc_Jsonclick = "" ;
      edtPrdUcoDsc_Link = "" ;
      edtPrdUcpDsc_Jsonclick = "" ;
      edtPrdUcpDsc_Link = "" ;
      edtPrdUMeFo_Jsonclick = "" ;
      edtPrdCanRes_Jsonclick = "" ;
      edtPrdRefPrv_Jsonclick = "" ;
      edtPrdExiCC_Jsonclick = "" ;
      edtPrdExiAlm_Jsonclick = "" ;
      edtPrvNom_Jsonclick = "" ;
      edtPrvNum_Jsonclick = "" ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNom_Link = "" ;
      edtPrdNum_Jsonclick = "" ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtPrdTnq_Visible = -1 ;
      edtPrdDensS_Visible = -1 ;
      edtPrdNmQu_Visible = -1 ;
      edtPrdFuncion_Visible = -1 ;
      edtPrdEINECS_Visible = -1 ;
      cmbPrdList.setVisible( -1 );
      edtPrdCtw4_Visible = -1 ;
      edtPrdCtw3_Visible = -1 ;
      edtPrdCtw2_Visible = -1 ;
      edtPrdCtw1_Visible = -1 ;
      edtPrdRTM_Visible = -1 ;
      edtPrdNroCAS_Visible = -1 ;
      edtTipPrdDsc_Visible = -1 ;
      edtTipPrdCod_Visible = -1 ;
      edtPrdColIdx_Visible = -1 ;
      edtPrdAox_Visible = -1 ;
      edtPrdDqo_Visible = -1 ;
      edtPrdHm_Visible = -1 ;
      edtPrdGots_Visible = -1 ;
      cmbPrdOkotex.setVisible( -1 );
      edtPrdReach_Visible = -1 ;
      edtPrdFHS_Visible = -1 ;
      edtPrdHS_Visible = -1 ;
      edtPrdFFT_Visible = -1 ;
      edtPrdFT_Visible = -1 ;
      edtPrdPreAct_Visible = -1 ;
      edtPrdNum2_Visible = -1 ;
      edtValDsc_Visible = -1 ;
      edtPrdFacCon_Visible = -1 ;
      edtPrdUcoDsc_Visible = -1 ;
      edtPrdUcpDsc_Visible = -1 ;
      edtPrdUMeFo_Visible = -1 ;
      edtPrdCanRes_Visible = -1 ;
      edtPrdRefPrv_Visible = -1 ;
      edtPrdExiCC_Visible = -1 ;
      edtPrdExiAlm_Visible = -1 ;
      edtPrvNom_Visible = -1 ;
      edtPrvNum_Visible = -1 ;
      edtPrdNom_Visible = -1 ;
      edtPrdNum_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
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
      Ddo_grid_Datalistproc = "ListaPrd_WCGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic|Dynamic||Dynamic||||||||||||||||||||||||||||||||||||" ;
      Ddo_grid_Includedatalist = "T|T||T||||||||||||||||||||||||||||||||||||" ;
      Ddo_grid_Filterisrange = "||T|||||||||||||||||||||||||||||||||||||" ;
      Ddo_grid_Filtertype = "Character|Character|Numeric|Character||||||||||||||||||||||||||||||||||||" ;
      Ddo_grid_Includefilter = "T|T|T|T||||||||||||||||||||||||||||||||||||" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|1|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40" ;
      Ddo_grid_Columnids = "2:PrdNum|3:PrdNom|4:PrvNum|5:PrvNom|6:PrdExiAlm|7:PrdExiCC|8:PrdRefPrv|9:PrdCanRes|10:PrdUMeFo|11:PrdUcpDsc|12:PrdUcoDsc|13:PrdFacCon|14:ValDsc|15:PrdNum2|16:PrdPreAct|17:PrdFT|18:PrdFFT|19:PrdHS|20:PrdFHS|21:PrdReach|22:PrdOkotex|23:PrdGots|24:PrdHm|25:PrdDqo|26:PrdAox|27:PrdColIdx|28:TipPrdCod|29:TipPrdDsc|30:PrdNroCAS|31:PrdRTM|32:PrdCtw1|33:PrdCtw2|34:PrdCtw3|35:PrdCtw4|36:PrdList|37:PrdEINECS|38:PrdFuncion|39:PrdNmQu|40:PrdDensS|41:PrdTnq" ;
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
      Ddo_managefilters_Cls = "ManageFilters" ;
      Ddo_managefilters_Tooltip = "WWP_ManageFiltersTooltip" ;
      Ddo_managefilters_Icon = "fas fa-filter" ;
      Ddo_managefilters_Icontype = "FontIcon" ;
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
      GXCCtl = "PRDOKOTEX_" + sGXsfl_45_idx ;
      cmbPrdOkotex.setName( GXCCtl );
      cmbPrdOkotex.setWebtags( "" );
      cmbPrdOkotex.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbPrdOkotex.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbPrdOkotex.getItemCount() > 0 )
      {
      }
      GXCCtl = "PRDLIST_" + sGXsfl_45_idx ;
      cmbPrdList.setName( GXCCtl );
      cmbPrdList.setWebtags( "" );
      cmbPrdList.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      cmbPrdList.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      if ( cmbPrdList.getItemCount() > 0 )
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV282EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV283PrdNumFrom',fld:'vPRDNUMFROM',pic:''},{av:'AV284PrdNumTo',fld:'vPRDNUMTO',pic:''},{av:'AV285PrvNumFrom',fld:'vPRVNUMFROM',pic:'ZZZZZ9'},{av:'AV286PrvNumTo',fld:'vPRVNUMTO',pic:'ZZZZZ9'},{av:'sPrefix'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV28TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV29TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV30TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV31TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV32TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV33TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV301Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtPrvNum_Visible',ctrl:'PRVNUM',prop:'Visible'},{av:'edtPrvNom_Visible',ctrl:'PRVNOM',prop:'Visible'},{av:'edtPrdExiAlm_Visible',ctrl:'PRDEXIALM',prop:'Visible'},{av:'edtPrdExiCC_Visible',ctrl:'PRDEXICC',prop:'Visible'},{av:'edtPrdRefPrv_Visible',ctrl:'PRDREFPRV',prop:'Visible'},{av:'edtPrdCanRes_Visible',ctrl:'PRDCANRES',prop:'Visible'},{av:'edtPrdUMeFo_Visible',ctrl:'PRDUMEFO',prop:'Visible'},{av:'edtPrdUcpDsc_Visible',ctrl:'PRDUCPDSC',prop:'Visible'},{av:'edtPrdUcoDsc_Visible',ctrl:'PRDUCODSC',prop:'Visible'},{av:'edtPrdFacCon_Visible',ctrl:'PRDFACCON',prop:'Visible'},{av:'edtValDsc_Visible',ctrl:'VALDSC',prop:'Visible'},{av:'edtPrdNum2_Visible',ctrl:'PRDNUM2',prop:'Visible'},{av:'edtPrdPreAct_Visible',ctrl:'PRDPREACT',prop:'Visible'},{av:'edtPrdFT_Visible',ctrl:'PRDFT',prop:'Visible'},{av:'edtPrdFFT_Visible',ctrl:'PRDFFT',prop:'Visible'},{av:'edtPrdHS_Visible',ctrl:'PRDHS',prop:'Visible'},{av:'edtPrdFHS_Visible',ctrl:'PRDFHS',prop:'Visible'},{av:'edtPrdReach_Visible',ctrl:'PRDREACH',prop:'Visible'},{av:'cmbPrdOkotex'},{av:'edtPrdGots_Visible',ctrl:'PRDGOTS',prop:'Visible'},{av:'edtPrdHm_Visible',ctrl:'PRDHM',prop:'Visible'},{av:'edtPrdDqo_Visible',ctrl:'PRDDQO',prop:'Visible'},{av:'edtPrdAox_Visible',ctrl:'PRDAOX',prop:'Visible'},{av:'edtPrdColIdx_Visible',ctrl:'PRDCOLIDX',prop:'Visible'},{av:'edtTipPrdCod_Visible',ctrl:'TIPPRDCOD',prop:'Visible'},{av:'edtTipPrdDsc_Visible',ctrl:'TIPPRDDSC',prop:'Visible'},{av:'edtPrdNroCAS_Visible',ctrl:'PRDNROCAS',prop:'Visible'},{av:'edtPrdRTM_Visible',ctrl:'PRDRTM',prop:'Visible'},{av:'edtPrdCtw1_Visible',ctrl:'PRDCTW1',prop:'Visible'},{av:'edtPrdCtw2_Visible',ctrl:'PRDCTW2',prop:'Visible'},{av:'edtPrdCtw3_Visible',ctrl:'PRDCTW3',prop:'Visible'},{av:'edtPrdCtw4_Visible',ctrl:'PRDCTW4',prop:'Visible'},{av:'cmbPrdList'},{av:'edtPrdEINECS_Visible',ctrl:'PRDEINECS',prop:'Visible'},{av:'edtPrdFuncion_Visible',ctrl:'PRDFUNCION',prop:'Visible'},{av:'edtPrdNmQu_Visible',ctrl:'PRDNMQU',prop:'Visible'},{av:'edtPrdDensS_Visible',ctrl:'PRDDENSS',prop:'Visible'},{av:'edtPrdTnq_Visible',ctrl:'PRDTNQ',prop:'Visible'},{av:'AV279GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV280GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e121M02',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV282EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV283PrdNumFrom',fld:'vPRDNUMFROM',pic:''},{av:'AV284PrdNumTo',fld:'vPRDNUMTO',pic:''},{av:'AV285PrvNumFrom',fld:'vPRVNUMFROM',pic:'ZZZZZ9'},{av:'AV286PrvNumTo',fld:'vPRVNUMTO',pic:'ZZZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV28TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV29TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV30TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV31TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV32TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV33TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV301Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e131M02',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV282EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV283PrdNumFrom',fld:'vPRDNUMFROM',pic:''},{av:'AV284PrdNumTo',fld:'vPRDNUMTO',pic:''},{av:'AV285PrvNumFrom',fld:'vPRVNUMFROM',pic:'ZZZZZ9'},{av:'AV286PrvNumTo',fld:'vPRVNUMTO',pic:'ZZZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV28TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV29TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV30TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV31TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV32TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV33TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV301Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e141M02',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV282EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV283PrdNumFrom',fld:'vPRDNUMFROM',pic:''},{av:'AV284PrdNumTo',fld:'vPRDNUMTO',pic:''},{av:'AV285PrvNumFrom',fld:'vPRVNUMFROM',pic:'ZZZZZ9'},{av:'AV286PrvNumTo',fld:'vPRVNUMTO',pic:'ZZZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV28TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV29TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV30TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV31TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV32TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV33TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV301Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV28TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV29TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV30TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV31TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV32TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV33TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e221M02',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A719PrdNum',fld:'PRDNUM',pic:'',hsh:true},{av:'A742PrdUniCom',fld:'PRDUNICOM',pic:'9'},{av:'A743PrdUniCon',fld:'PRDUNICON',pic:'9'},{av:'A856ValCod',fld:'VALCOD',pic:'9'},{av:'A6301TipPrdCod',fld:'TIPPRDCOD',pic:'ZZZ9'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'edtPrdNom_Link',ctrl:'PRDNOM',prop:'Link'},{av:'edtPrdUcpDsc_Link',ctrl:'PRDUCPDSC',prop:'Link'},{av:'edtPrdUcoDsc_Link',ctrl:'PRDUCODSC',prop:'Link'},{av:'edtValDsc_Link',ctrl:'VALDSC',prop:'Link'},{av:'edtTipPrdDsc_Link',ctrl:'TIPPRDDSC',prop:'Link'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e151M02',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV282EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV283PrdNumFrom',fld:'vPRDNUMFROM',pic:''},{av:'AV284PrdNumTo',fld:'vPRDNUMTO',pic:''},{av:'AV285PrvNumFrom',fld:'vPRVNUMFROM',pic:'ZZZZZ9'},{av:'AV286PrvNumTo',fld:'vPRVNUMTO',pic:'ZZZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV28TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV29TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV30TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV31TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV32TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV33TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV301Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtPrvNum_Visible',ctrl:'PRVNUM',prop:'Visible'},{av:'edtPrvNom_Visible',ctrl:'PRVNOM',prop:'Visible'},{av:'edtPrdExiAlm_Visible',ctrl:'PRDEXIALM',prop:'Visible'},{av:'edtPrdExiCC_Visible',ctrl:'PRDEXICC',prop:'Visible'},{av:'edtPrdRefPrv_Visible',ctrl:'PRDREFPRV',prop:'Visible'},{av:'edtPrdCanRes_Visible',ctrl:'PRDCANRES',prop:'Visible'},{av:'edtPrdUMeFo_Visible',ctrl:'PRDUMEFO',prop:'Visible'},{av:'edtPrdUcpDsc_Visible',ctrl:'PRDUCPDSC',prop:'Visible'},{av:'edtPrdUcoDsc_Visible',ctrl:'PRDUCODSC',prop:'Visible'},{av:'edtPrdFacCon_Visible',ctrl:'PRDFACCON',prop:'Visible'},{av:'edtValDsc_Visible',ctrl:'VALDSC',prop:'Visible'},{av:'edtPrdNum2_Visible',ctrl:'PRDNUM2',prop:'Visible'},{av:'edtPrdPreAct_Visible',ctrl:'PRDPREACT',prop:'Visible'},{av:'edtPrdFT_Visible',ctrl:'PRDFT',prop:'Visible'},{av:'edtPrdFFT_Visible',ctrl:'PRDFFT',prop:'Visible'},{av:'edtPrdHS_Visible',ctrl:'PRDHS',prop:'Visible'},{av:'edtPrdFHS_Visible',ctrl:'PRDFHS',prop:'Visible'},{av:'edtPrdReach_Visible',ctrl:'PRDREACH',prop:'Visible'},{av:'cmbPrdOkotex'},{av:'edtPrdGots_Visible',ctrl:'PRDGOTS',prop:'Visible'},{av:'edtPrdHm_Visible',ctrl:'PRDHM',prop:'Visible'},{av:'edtPrdDqo_Visible',ctrl:'PRDDQO',prop:'Visible'},{av:'edtPrdAox_Visible',ctrl:'PRDAOX',prop:'Visible'},{av:'edtPrdColIdx_Visible',ctrl:'PRDCOLIDX',prop:'Visible'},{av:'edtTipPrdCod_Visible',ctrl:'TIPPRDCOD',prop:'Visible'},{av:'edtTipPrdDsc_Visible',ctrl:'TIPPRDDSC',prop:'Visible'},{av:'edtPrdNroCAS_Visible',ctrl:'PRDNROCAS',prop:'Visible'},{av:'edtPrdRTM_Visible',ctrl:'PRDRTM',prop:'Visible'},{av:'edtPrdCtw1_Visible',ctrl:'PRDCTW1',prop:'Visible'},{av:'edtPrdCtw2_Visible',ctrl:'PRDCTW2',prop:'Visible'},{av:'edtPrdCtw3_Visible',ctrl:'PRDCTW3',prop:'Visible'},{av:'edtPrdCtw4_Visible',ctrl:'PRDCTW4',prop:'Visible'},{av:'cmbPrdList'},{av:'edtPrdEINECS_Visible',ctrl:'PRDEINECS',prop:'Visible'},{av:'edtPrdFuncion_Visible',ctrl:'PRDFUNCION',prop:'Visible'},{av:'edtPrdNmQu_Visible',ctrl:'PRDNMQU',prop:'Visible'},{av:'edtPrdDensS_Visible',ctrl:'PRDDENSS',prop:'Visible'},{av:'edtPrdTnq_Visible',ctrl:'PRDTNQ',prop:'Visible'},{av:'AV279GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV280GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e111M02',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV282EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV283PrdNumFrom',fld:'vPRDNUMFROM',pic:''},{av:'AV284PrdNumTo',fld:'vPRDNUMTO',pic:''},{av:'AV285PrvNumFrom',fld:'vPRVNUMFROM',pic:'ZZZZZ9'},{av:'AV286PrvNumTo',fld:'vPRVNUMTO',pic:'ZZZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV28TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV29TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV30TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV31TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV32TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV33TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV301Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV28TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV29TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV30TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV31TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV32TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV33TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtPrvNum_Visible',ctrl:'PRVNUM',prop:'Visible'},{av:'edtPrvNom_Visible',ctrl:'PRVNOM',prop:'Visible'},{av:'edtPrdExiAlm_Visible',ctrl:'PRDEXIALM',prop:'Visible'},{av:'edtPrdExiCC_Visible',ctrl:'PRDEXICC',prop:'Visible'},{av:'edtPrdRefPrv_Visible',ctrl:'PRDREFPRV',prop:'Visible'},{av:'edtPrdCanRes_Visible',ctrl:'PRDCANRES',prop:'Visible'},{av:'edtPrdUMeFo_Visible',ctrl:'PRDUMEFO',prop:'Visible'},{av:'edtPrdUcpDsc_Visible',ctrl:'PRDUCPDSC',prop:'Visible'},{av:'edtPrdUcoDsc_Visible',ctrl:'PRDUCODSC',prop:'Visible'},{av:'edtPrdFacCon_Visible',ctrl:'PRDFACCON',prop:'Visible'},{av:'edtValDsc_Visible',ctrl:'VALDSC',prop:'Visible'},{av:'edtPrdNum2_Visible',ctrl:'PRDNUM2',prop:'Visible'},{av:'edtPrdPreAct_Visible',ctrl:'PRDPREACT',prop:'Visible'},{av:'edtPrdFT_Visible',ctrl:'PRDFT',prop:'Visible'},{av:'edtPrdFFT_Visible',ctrl:'PRDFFT',prop:'Visible'},{av:'edtPrdHS_Visible',ctrl:'PRDHS',prop:'Visible'},{av:'edtPrdFHS_Visible',ctrl:'PRDFHS',prop:'Visible'},{av:'edtPrdReach_Visible',ctrl:'PRDREACH',prop:'Visible'},{av:'cmbPrdOkotex'},{av:'edtPrdGots_Visible',ctrl:'PRDGOTS',prop:'Visible'},{av:'edtPrdHm_Visible',ctrl:'PRDHM',prop:'Visible'},{av:'edtPrdDqo_Visible',ctrl:'PRDDQO',prop:'Visible'},{av:'edtPrdAox_Visible',ctrl:'PRDAOX',prop:'Visible'},{av:'edtPrdColIdx_Visible',ctrl:'PRDCOLIDX',prop:'Visible'},{av:'edtTipPrdCod_Visible',ctrl:'TIPPRDCOD',prop:'Visible'},{av:'edtTipPrdDsc_Visible',ctrl:'TIPPRDDSC',prop:'Visible'},{av:'edtPrdNroCAS_Visible',ctrl:'PRDNROCAS',prop:'Visible'},{av:'edtPrdRTM_Visible',ctrl:'PRDRTM',prop:'Visible'},{av:'edtPrdCtw1_Visible',ctrl:'PRDCTW1',prop:'Visible'},{av:'edtPrdCtw2_Visible',ctrl:'PRDCTW2',prop:'Visible'},{av:'edtPrdCtw3_Visible',ctrl:'PRDCTW3',prop:'Visible'},{av:'edtPrdCtw4_Visible',ctrl:'PRDCTW4',prop:'Visible'},{av:'cmbPrdList'},{av:'edtPrdEINECS_Visible',ctrl:'PRDEINECS',prop:'Visible'},{av:'edtPrdFuncion_Visible',ctrl:'PRDFUNCION',prop:'Visible'},{av:'edtPrdNmQu_Visible',ctrl:'PRDNMQU',prop:'Visible'},{av:'edtPrdDensS_Visible',ctrl:'PRDDENSS',prop:'Visible'},{av:'edtPrdTnq_Visible',ctrl:'PRDTNQ',prop:'Visible'},{av:'AV279GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV280GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DOINSERT'","{handler:'e161M02',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A719PrdNum',fld:'PRDNUM',pic:'',hsh:true}]");
      setEventMetadata("'DOINSERT'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e171M02',iparms:[{av:'AV301Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV29TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV33TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV28TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV30TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV32TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV31TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV282EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV283PrdNumFrom',fld:'vPRDNUMFROM',pic:''},{av:'AV284PrdNumTo',fld:'vPRDNUMTO',pic:''},{av:'AV285PrvNumFrom',fld:'vPRVNUMFROM',pic:'ZZZZZ9'},{av:'AV286PrvNumTo',fld:'vPRVNUMTO',pic:'ZZZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV28TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV29TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV30TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV31TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV32TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV33TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV301Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e181M02',iparms:[{av:'AV301Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV29TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV33TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV28TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV30TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV32TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV31TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'}]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV282EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV283PrdNumFrom',fld:'vPRDNUMFROM',pic:''},{av:'AV284PrdNumTo',fld:'vPRDNUMTO',pic:''},{av:'AV285PrvNumFrom',fld:'vPRVNUMFROM',pic:'ZZZZZ9'},{av:'AV286PrvNumTo',fld:'vPRVNUMTO',pic:'ZZZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV28TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV29TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV30TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV31TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV32TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV33TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV301Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e191M02',iparms:[{av:'AV301Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV29TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV33TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV28TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV30TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV32TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV31TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV282EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV283PrdNumFrom',fld:'vPRDNUMFROM',pic:''},{av:'AV284PrdNumTo',fld:'vPRDNUMTO',pic:''},{av:'AV285PrvNumFrom',fld:'vPRVNUMFROM',pic:'ZZZZZ9'},{av:'AV286PrvNumTo',fld:'vPRVNUMTO',pic:'ZZZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV28TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV29TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV30TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV31TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV32TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV33TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV301Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[]");
      setEventMetadata("VALID_PRDNUM",",oparms:[]}");
      setEventMetadata("VALID_PRDNOM","{handler:'valid_Prdnom',iparms:[]");
      setEventMetadata("VALID_PRDNOM",",oparms:[]}");
      setEventMetadata("VALID_PRVNUM","{handler:'valid_Prvnum',iparms:[]");
      setEventMetadata("VALID_PRVNUM",",oparms:[]}");
      setEventMetadata("VALID_PRVNOM","{handler:'valid_Prvnom',iparms:[]");
      setEventMetadata("VALID_PRVNOM",",oparms:[]}");
      setEventMetadata("VALID_PRDEXIALM","{handler:'valid_Prdexialm',iparms:[]");
      setEventMetadata("VALID_PRDEXIALM",",oparms:[]}");
      setEventMetadata("VALID_PRDEXICC","{handler:'valid_Prdexicc',iparms:[]");
      setEventMetadata("VALID_PRDEXICC",",oparms:[]}");
      setEventMetadata("VALID_PRDREFPRV","{handler:'valid_Prdrefprv',iparms:[]");
      setEventMetadata("VALID_PRDREFPRV",",oparms:[]}");
      setEventMetadata("VALID_PRDCANRES","{handler:'valid_Prdcanres',iparms:[]");
      setEventMetadata("VALID_PRDCANRES",",oparms:[]}");
      setEventMetadata("VALID_PRDUMEFO","{handler:'valid_Prdumefo',iparms:[]");
      setEventMetadata("VALID_PRDUMEFO",",oparms:[]}");
      setEventMetadata("VALID_PRDUCPDSC","{handler:'valid_Prducpdsc',iparms:[]");
      setEventMetadata("VALID_PRDUCPDSC",",oparms:[]}");
      setEventMetadata("VALID_PRDUCODSC","{handler:'valid_Prducodsc',iparms:[]");
      setEventMetadata("VALID_PRDUCODSC",",oparms:[]}");
      setEventMetadata("VALID_PRDFACCON","{handler:'valid_Prdfaccon',iparms:[]");
      setEventMetadata("VALID_PRDFACCON",",oparms:[]}");
      setEventMetadata("VALID_VALDSC","{handler:'valid_Valdsc',iparms:[]");
      setEventMetadata("VALID_VALDSC",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM2","{handler:'valid_Prdnum2',iparms:[]");
      setEventMetadata("VALID_PRDNUM2",",oparms:[]}");
      setEventMetadata("VALID_PRDPREACT","{handler:'valid_Prdpreact',iparms:[]");
      setEventMetadata("VALID_PRDPREACT",",oparms:[]}");
      setEventMetadata("VALID_PRDFT","{handler:'valid_Prdft',iparms:[]");
      setEventMetadata("VALID_PRDFT",",oparms:[]}");
      setEventMetadata("VALID_PRDHS","{handler:'valid_Prdhs',iparms:[]");
      setEventMetadata("VALID_PRDHS",",oparms:[]}");
      setEventMetadata("VALID_PRDREACH","{handler:'valid_Prdreach',iparms:[]");
      setEventMetadata("VALID_PRDREACH",",oparms:[]}");
      setEventMetadata("VALID_PRDOKOTEX","{handler:'valid_Prdokotex',iparms:[]");
      setEventMetadata("VALID_PRDOKOTEX",",oparms:[]}");
      setEventMetadata("VALID_PRDGOTS","{handler:'valid_Prdgots',iparms:[]");
      setEventMetadata("VALID_PRDGOTS",",oparms:[]}");
      setEventMetadata("VALID_PRDHM","{handler:'valid_Prdhm',iparms:[]");
      setEventMetadata("VALID_PRDHM",",oparms:[]}");
      setEventMetadata("VALID_PRDDQO","{handler:'valid_Prddqo',iparms:[]");
      setEventMetadata("VALID_PRDDQO",",oparms:[]}");
      setEventMetadata("VALID_PRDAOX","{handler:'valid_Prdaox',iparms:[]");
      setEventMetadata("VALID_PRDAOX",",oparms:[]}");
      setEventMetadata("VALID_PRDCOLIDX","{handler:'valid_Prdcolidx',iparms:[]");
      setEventMetadata("VALID_PRDCOLIDX",",oparms:[]}");
      setEventMetadata("VALID_TIPPRDCOD","{handler:'valid_Tipprdcod',iparms:[]");
      setEventMetadata("VALID_TIPPRDCOD",",oparms:[]}");
      setEventMetadata("VALID_TIPPRDDSC","{handler:'valid_Tipprddsc',iparms:[]");
      setEventMetadata("VALID_TIPPRDDSC",",oparms:[]}");
      setEventMetadata("VALID_PRDNROCAS","{handler:'valid_Prdnrocas',iparms:[]");
      setEventMetadata("VALID_PRDNROCAS",",oparms:[]}");
      setEventMetadata("VALID_PRDRTM","{handler:'valid_Prdrtm',iparms:[]");
      setEventMetadata("VALID_PRDRTM",",oparms:[]}");
      setEventMetadata("VALID_PRDCTW1","{handler:'valid_Prdctw1',iparms:[]");
      setEventMetadata("VALID_PRDCTW1",",oparms:[]}");
      setEventMetadata("VALID_PRDCTW2","{handler:'valid_Prdctw2',iparms:[]");
      setEventMetadata("VALID_PRDCTW2",",oparms:[]}");
      setEventMetadata("VALID_PRDCTW3","{handler:'valid_Prdctw3',iparms:[]");
      setEventMetadata("VALID_PRDCTW3",",oparms:[]}");
      setEventMetadata("VALID_PRDCTW4","{handler:'valid_Prdctw4',iparms:[]");
      setEventMetadata("VALID_PRDCTW4",",oparms:[]}");
      setEventMetadata("VALID_PRDLIST","{handler:'valid_Prdlist',iparms:[]");
      setEventMetadata("VALID_PRDLIST",",oparms:[]}");
      setEventMetadata("VALID_PRDEINECS","{handler:'valid_Prdeinecs',iparms:[]");
      setEventMetadata("VALID_PRDEINECS",",oparms:[]}");
      setEventMetadata("VALID_PRDFUNCION","{handler:'valid_Prdfuncion',iparms:[]");
      setEventMetadata("VALID_PRDFUNCION",",oparms:[]}");
      setEventMetadata("VALID_PRDNMQU","{handler:'valid_Prdnmqu',iparms:[]");
      setEventMetadata("VALID_PRDNMQU",",oparms:[]}");
      setEventMetadata("VALID_PRDDENSS","{handler:'valid_Prddenss',iparms:[]");
      setEventMetadata("VALID_PRDDENSS",",oparms:[]}");
      setEventMetadata("VALID_PRDTNQ","{handler:'valid_Prdtnq',iparms:[]");
      setEventMetadata("VALID_PRDTNQ",",oparms:[]}");
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
      wcpOAV282EmprCod = "" ;
      wcpOAV283PrdNumFrom = "" ;
      wcpOAV284PrdNumTo = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV282EmprCod = "" ;
      AV283PrdNumFrom = "" ;
      AV284PrdNumTo = "" ;
      AV20ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV15FilterFullText = "" ;
      AV26TFPrdNum = "" ;
      AV27TFPrdNum_Sel = "" ;
      AV28TFPrdNom = "" ;
      AV29TFPrdNom_Sel = "" ;
      AV32TFPrvNom = "" ;
      AV33TFPrvNom_Sel = "" ;
      AV301Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV23ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV277DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
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
      bttBtninsert_Jsonclick = "" ;
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportreport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucInnewwindow1 = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A396EmprCod = "" ;
      A407EmprNom = "" ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A794PrvNom = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A728PrdRefPrv = "" ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A737PrdUcpDsc = "" ;
      A736PrdUcoDsc = "" ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A857ValDsc = "" ;
      A4693PrdNum2 = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A9739PrdFT = "" ;
      A9740PrdFFT = GXutil.nullDate() ;
      A9741PrdHS = "" ;
      A9742PrdFHS = GXutil.nullDate() ;
      A5887PrdReach = "" ;
      A5888PrdOkotex = "" ;
      A11363PrdGots = "" ;
      A11364PrdHm = "" ;
      A9733PrdAox = DecimalUtil.ZERO ;
      A10119PrdColIdx = "" ;
      A6302TipPrdDsc = "" ;
      A11196PrdNroCAS = "" ;
      A10935PrdRTM = "" ;
      A10936PrdCtw1 = "" ;
      A10937PrdCtw2 = "" ;
      A10938PrdCtw3 = "" ;
      A11663PrdCtw4 = "" ;
      A11687PrdList = "" ;
      A11614PrdEINECS = "" ;
      A11615PrdFuncion = "" ;
      A11616PrdNmQu = "" ;
      A5416PrdDensS = DecimalUtil.ZERO ;
      AV292Listaprd_wcds_1_filterfulltext = "" ;
      AV293Listaprd_wcds_2_tfprdnum = "" ;
      AV294Listaprd_wcds_3_tfprdnum_sel = "" ;
      AV295Listaprd_wcds_4_tfprdnom = "" ;
      AV296Listaprd_wcds_5_tfprdnom_sel = "" ;
      AV299Listaprd_wcds_8_tfprvnom = "" ;
      AV300Listaprd_wcds_9_tfprvnom_sel = "" ;
      scmdbuf = "" ;
      lV292Listaprd_wcds_1_filterfulltext = "" ;
      lV293Listaprd_wcds_2_tfprdnum = "" ;
      lV295Listaprd_wcds_4_tfprdnom = "" ;
      lV299Listaprd_wcds_8_tfprvnom = "" ;
      H01M02_A742PrdUniCom = new byte[1] ;
      H01M02_A743PrdUniCon = new byte[1] ;
      H01M02_A856ValCod = new byte[1] ;
      H01M02_A3273PrdTnq = new byte[1] ;
      H01M02_A5416PrdDensS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01M02_A11616PrdNmQu = new String[] {""} ;
      H01M02_A11615PrdFuncion = new String[] {""} ;
      H01M02_A11614PrdEINECS = new String[] {""} ;
      H01M02_A11687PrdList = new String[] {""} ;
      H01M02_A11663PrdCtw4 = new String[] {""} ;
      H01M02_A10938PrdCtw3 = new String[] {""} ;
      H01M02_A10937PrdCtw2 = new String[] {""} ;
      H01M02_A10936PrdCtw1 = new String[] {""} ;
      H01M02_A10935PrdRTM = new String[] {""} ;
      H01M02_A11196PrdNroCAS = new String[] {""} ;
      H01M02_A6302TipPrdDsc = new String[] {""} ;
      H01M02_n6302TipPrdDsc = new boolean[] {false} ;
      H01M02_A6301TipPrdCod = new short[1] ;
      H01M02_n6301TipPrdCod = new boolean[] {false} ;
      H01M02_A10119PrdColIdx = new String[] {""} ;
      H01M02_A9733PrdAox = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01M02_A1644PrdDqo = new short[1] ;
      H01M02_A11364PrdHm = new String[] {""} ;
      H01M02_A11363PrdGots = new String[] {""} ;
      H01M02_A5888PrdOkotex = new String[] {""} ;
      H01M02_A5887PrdReach = new String[] {""} ;
      H01M02_A9742PrdFHS = new java.util.Date[] {GXutil.nullDate()} ;
      H01M02_A9741PrdHS = new String[] {""} ;
      H01M02_A9740PrdFFT = new java.util.Date[] {GXutil.nullDate()} ;
      H01M02_A9739PrdFT = new String[] {""} ;
      H01M02_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01M02_A4693PrdNum2 = new String[] {""} ;
      H01M02_A857ValDsc = new String[] {""} ;
      H01M02_n857ValDsc = new boolean[] {false} ;
      H01M02_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01M02_A736PrdUcoDsc = new String[] {""} ;
      H01M02_n736PrdUcoDsc = new boolean[] {false} ;
      H01M02_A737PrdUcpDsc = new String[] {""} ;
      H01M02_n737PrdUcpDsc = new boolean[] {false} ;
      H01M02_A4338PrdUMeFo = new byte[1] ;
      H01M02_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01M02_A728PrdRefPrv = new String[] {""} ;
      H01M02_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01M02_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01M02_A794PrvNom = new String[] {""} ;
      H01M02_n794PrvNom = new boolean[] {false} ;
      H01M02_A795PrvNum = new int[1] ;
      H01M02_A718PrdNom = new String[] {""} ;
      H01M02_A719PrdNum = new String[] {""} ;
      H01M02_A407EmprNom = new String[] {""} ;
      H01M02_n407EmprNom = new boolean[] {false} ;
      H01M02_A396EmprCod = new String[] {""} ;
      H01M03_A742PrdUniCom = new byte[1] ;
      H01M03_A743PrdUniCon = new byte[1] ;
      H01M03_A856ValCod = new byte[1] ;
      H01M03_A3273PrdTnq = new byte[1] ;
      H01M03_A5416PrdDensS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01M03_A11616PrdNmQu = new String[] {""} ;
      H01M03_A11615PrdFuncion = new String[] {""} ;
      H01M03_A11614PrdEINECS = new String[] {""} ;
      H01M03_A11687PrdList = new String[] {""} ;
      H01M03_A11663PrdCtw4 = new String[] {""} ;
      H01M03_A10938PrdCtw3 = new String[] {""} ;
      H01M03_A10937PrdCtw2 = new String[] {""} ;
      H01M03_A10936PrdCtw1 = new String[] {""} ;
      H01M03_A10935PrdRTM = new String[] {""} ;
      H01M03_A11196PrdNroCAS = new String[] {""} ;
      H01M03_A6302TipPrdDsc = new String[] {""} ;
      H01M03_n6302TipPrdDsc = new boolean[] {false} ;
      H01M03_A6301TipPrdCod = new short[1] ;
      H01M03_n6301TipPrdCod = new boolean[] {false} ;
      H01M03_A10119PrdColIdx = new String[] {""} ;
      H01M03_A9733PrdAox = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01M03_A1644PrdDqo = new short[1] ;
      H01M03_A11364PrdHm = new String[] {""} ;
      H01M03_A11363PrdGots = new String[] {""} ;
      H01M03_A5888PrdOkotex = new String[] {""} ;
      H01M03_A5887PrdReach = new String[] {""} ;
      H01M03_A9742PrdFHS = new java.util.Date[] {GXutil.nullDate()} ;
      H01M03_A9741PrdHS = new String[] {""} ;
      H01M03_A9740PrdFFT = new java.util.Date[] {GXutil.nullDate()} ;
      H01M03_A9739PrdFT = new String[] {""} ;
      H01M03_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01M03_A4693PrdNum2 = new String[] {""} ;
      H01M03_A857ValDsc = new String[] {""} ;
      H01M03_n857ValDsc = new boolean[] {false} ;
      H01M03_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01M03_A736PrdUcoDsc = new String[] {""} ;
      H01M03_n736PrdUcoDsc = new boolean[] {false} ;
      H01M03_A737PrdUcpDsc = new String[] {""} ;
      H01M03_n737PrdUcpDsc = new boolean[] {false} ;
      H01M03_A4338PrdUMeFo = new byte[1] ;
      H01M03_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01M03_A728PrdRefPrv = new String[] {""} ;
      H01M03_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01M03_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01M03_A794PrvNom = new String[] {""} ;
      H01M03_n794PrvNom = new boolean[] {false} ;
      H01M03_A795PrvNum = new int[1] ;
      H01M03_A718PrdNom = new String[] {""} ;
      H01M03_A719PrdNum = new String[] {""} ;
      H01M03_A407EmprNom = new String[] {""} ;
      H01M03_n407EmprNom = new boolean[] {false} ;
      H01M03_A396EmprCod = new String[] {""} ;
      AV289Station = "" ;
      AV290Emprnom = "" ;
      AV291Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV22Session = httpContext.getWebSession();
      AV18ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV24ManageFiltersXml = "" ;
      AV16ExcelFilename = "" ;
      AV17ErrorMessage = "" ;
      AV19UserCustomValue = "" ;
      AV21ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = new GXBaseCollection[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char13 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char12 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState14 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV282EmprCod = "" ;
      sCtrlAV283PrdNumFrom = "" ;
      sCtrlAV284PrdNumTo = "" ;
      sCtrlAV285PrvNumFrom = "" ;
      sCtrlAV286PrvNumTo = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.listaprd_wc__default(),
         new Object[] {
             new Object[] {
            H01M02_A742PrdUniCom, H01M02_A743PrdUniCon, H01M02_A856ValCod, H01M02_A3273PrdTnq, H01M02_A5416PrdDensS, H01M02_A11616PrdNmQu, H01M02_A11615PrdFuncion, H01M02_A11614PrdEINECS, H01M02_A11687PrdList, H01M02_A11663PrdCtw4,
            H01M02_A10938PrdCtw3, H01M02_A10937PrdCtw2, H01M02_A10936PrdCtw1, H01M02_A10935PrdRTM, H01M02_A11196PrdNroCAS, H01M02_A6302TipPrdDsc, H01M02_n6302TipPrdDsc, H01M02_A6301TipPrdCod, H01M02_n6301TipPrdCod, H01M02_A10119PrdColIdx,
            H01M02_A9733PrdAox, H01M02_A1644PrdDqo, H01M02_A11364PrdHm, H01M02_A11363PrdGots, H01M02_A5888PrdOkotex, H01M02_A5887PrdReach, H01M02_A9742PrdFHS, H01M02_A9741PrdHS, H01M02_A9740PrdFFT, H01M02_A9739PrdFT,
            H01M02_A724PrdPreAct, H01M02_A4693PrdNum2, H01M02_A857ValDsc, H01M02_n857ValDsc, H01M02_A707PrdFacCon, H01M02_A736PrdUcoDsc, H01M02_n736PrdUcoDsc, H01M02_A737PrdUcpDsc, H01M02_n737PrdUcpDsc, H01M02_A4338PrdUMeFo,
            H01M02_A685PrdCanRes, H01M02_A728PrdRefPrv, H01M02_A705PrdExiCC, H01M02_A704PrdExiAlm, H01M02_A794PrvNom, H01M02_n794PrvNom, H01M02_A795PrvNum, H01M02_A718PrdNom, H01M02_A719PrdNum, H01M02_A407EmprNom,
            H01M02_n407EmprNom, H01M02_A396EmprCod
            }
            , new Object[] {
            H01M03_A742PrdUniCom, H01M03_A743PrdUniCon, H01M03_A856ValCod, H01M03_A3273PrdTnq, H01M03_A5416PrdDensS, H01M03_A11616PrdNmQu, H01M03_A11615PrdFuncion, H01M03_A11614PrdEINECS, H01M03_A11687PrdList, H01M03_A11663PrdCtw4,
            H01M03_A10938PrdCtw3, H01M03_A10937PrdCtw2, H01M03_A10936PrdCtw1, H01M03_A10935PrdRTM, H01M03_A11196PrdNroCAS, H01M03_A6302TipPrdDsc, H01M03_n6302TipPrdDsc, H01M03_A6301TipPrdCod, H01M03_n6301TipPrdCod, H01M03_A10119PrdColIdx,
            H01M03_A9733PrdAox, H01M03_A1644PrdDqo, H01M03_A11364PrdHm, H01M03_A11363PrdGots, H01M03_A5888PrdOkotex, H01M03_A5887PrdReach, H01M03_A9742PrdFHS, H01M03_A9741PrdHS, H01M03_A9740PrdFFT, H01M03_A9739PrdFT,
            H01M03_A724PrdPreAct, H01M03_A4693PrdNum2, H01M03_A857ValDsc, H01M03_n857ValDsc, H01M03_A707PrdFacCon, H01M03_A736PrdUcoDsc, H01M03_n736PrdUcoDsc, H01M03_A737PrdUcpDsc, H01M03_n737PrdUcpDsc, H01M03_A4338PrdUMeFo,
            H01M03_A685PrdCanRes, H01M03_A728PrdRefPrv, H01M03_A705PrdExiCC, H01M03_A704PrdExiAlm, H01M03_A794PrvNom, H01M03_n794PrvNom, H01M03_A795PrvNum, H01M03_A718PrdNom, H01M03_A719PrdNum, H01M03_A407EmprNom,
            H01M03_n407EmprNom, H01M03_A396EmprCod
            }
         }
      );
      AV301Pgmname = "ListaPrd_WC" ;
      /* GeneXus formulas. */
      AV301Pgmname = "ListaPrd_WC" ;
      Gx_err = (short)(0) ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV25ManageFiltersExecutionStep ;
   private byte A742PrdUniCom ;
   private byte A743PrdUniCon ;
   private byte A856ValCod ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A4338PrdUMeFo ;
   private byte A3273PrdTnq ;
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
   private short AV12OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short A1644PrdDqo ;
   private short A6301TipPrdCod ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV285PrvNumFrom ;
   private int wcpOAV286PrvNumTo ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_45 ;
   private int AV285PrvNumFrom ;
   private int AV286PrvNumTo ;
   private int nGXsfl_45_idx=1 ;
   private int AV30TFPrvNum ;
   private int AV31TFPrvNum_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int A795PrvNum ;
   private int subGrid_Islastpage ;
   private int AV297Listaprd_wcds_6_tfprvnum ;
   private int AV298Listaprd_wcds_7_tfprvnum_to ;
   private int edtPrdNum_Visible ;
   private int edtPrdNom_Visible ;
   private int edtPrvNum_Visible ;
   private int edtPrvNom_Visible ;
   private int edtPrdExiAlm_Visible ;
   private int edtPrdExiCC_Visible ;
   private int edtPrdRefPrv_Visible ;
   private int edtPrdCanRes_Visible ;
   private int edtPrdUMeFo_Visible ;
   private int edtPrdUcpDsc_Visible ;
   private int edtPrdUcoDsc_Visible ;
   private int edtPrdFacCon_Visible ;
   private int edtValDsc_Visible ;
   private int edtPrdNum2_Visible ;
   private int edtPrdPreAct_Visible ;
   private int edtPrdFT_Visible ;
   private int edtPrdFFT_Visible ;
   private int edtPrdHS_Visible ;
   private int edtPrdFHS_Visible ;
   private int edtPrdReach_Visible ;
   private int edtPrdGots_Visible ;
   private int edtPrdHm_Visible ;
   private int edtPrdDqo_Visible ;
   private int edtPrdAox_Visible ;
   private int edtPrdColIdx_Visible ;
   private int edtTipPrdCod_Visible ;
   private int edtTipPrdDsc_Visible ;
   private int edtPrdNroCAS_Visible ;
   private int edtPrdRTM_Visible ;
   private int edtPrdCtw1_Visible ;
   private int edtPrdCtw2_Visible ;
   private int edtPrdCtw3_Visible ;
   private int edtPrdCtw4_Visible ;
   private int edtPrdEINECS_Visible ;
   private int edtPrdFuncion_Visible ;
   private int edtPrdNmQu_Visible ;
   private int edtPrdDensS_Visible ;
   private int edtPrdTnq_Visible ;
   private int AV278PageToGo ;
   private int AV302GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV279GridCurrentPage ;
   private long AV280GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A9733PrdAox ;
   private java.math.BigDecimal A5416PrdDensS ;
   private String wcpOAV282EmprCod ;
   private String wcpOAV283PrdNumFrom ;
   private String wcpOAV284PrdNumTo ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV282EmprCod ;
   private String AV283PrdNumFrom ;
   private String AV284PrdNumTo ;
   private String sGXsfl_45_idx="0001" ;
   private String AV26TFPrdNum ;
   private String AV27TFPrdNum_Sel ;
   private String AV28TFPrdNom ;
   private String AV29TFPrdNom_Sel ;
   private String AV32TFPrvNom ;
   private String AV33TFPrvNom_Sel ;
   private String AV301Pgmname ;
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
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableactions_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtninsert_Internalname ;
   private String bttBtninsert_Jsonclick ;
   private String bttBtnexport_Internalname ;
   private String bttBtnexport_Jsonclick ;
   private String bttBtnexportreport_Internalname ;
   private String bttBtnexportreport_Jsonclick ;
   private String bttBtnexportcsv_Internalname ;
   private String bttBtnexportcsv_Jsonclick ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
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
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Internalname ;
   private String A719PrdNum ;
   private String edtPrdNum_Internalname ;
   private String A718PrdNom ;
   private String edtPrdNom_Internalname ;
   private String edtPrvNum_Internalname ;
   private String A794PrvNom ;
   private String edtPrvNom_Internalname ;
   private String edtPrdExiAlm_Internalname ;
   private String edtPrdExiCC_Internalname ;
   private String A728PrdRefPrv ;
   private String edtPrdRefPrv_Internalname ;
   private String edtPrdCanRes_Internalname ;
   private String edtPrdUMeFo_Internalname ;
   private String A737PrdUcpDsc ;
   private String edtPrdUcpDsc_Internalname ;
   private String A736PrdUcoDsc ;
   private String edtPrdUcoDsc_Internalname ;
   private String edtPrdFacCon_Internalname ;
   private String A857ValDsc ;
   private String edtValDsc_Internalname ;
   private String A4693PrdNum2 ;
   private String edtPrdNum2_Internalname ;
   private String edtPrdPreAct_Internalname ;
   private String A9739PrdFT ;
   private String edtPrdFT_Internalname ;
   private String edtPrdFFT_Internalname ;
   private String A9741PrdHS ;
   private String edtPrdHS_Internalname ;
   private String edtPrdFHS_Internalname ;
   private String A5887PrdReach ;
   private String edtPrdReach_Internalname ;
   private String A5888PrdOkotex ;
   private String A11363PrdGots ;
   private String edtPrdGots_Internalname ;
   private String A11364PrdHm ;
   private String edtPrdHm_Internalname ;
   private String edtPrdDqo_Internalname ;
   private String edtPrdAox_Internalname ;
   private String A10119PrdColIdx ;
   private String edtPrdColIdx_Internalname ;
   private String edtTipPrdCod_Internalname ;
   private String A6302TipPrdDsc ;
   private String edtTipPrdDsc_Internalname ;
   private String A11196PrdNroCAS ;
   private String edtPrdNroCAS_Internalname ;
   private String A10935PrdRTM ;
   private String edtPrdRTM_Internalname ;
   private String A10936PrdCtw1 ;
   private String edtPrdCtw1_Internalname ;
   private String A10937PrdCtw2 ;
   private String edtPrdCtw2_Internalname ;
   private String A10938PrdCtw3 ;
   private String edtPrdCtw3_Internalname ;
   private String A11663PrdCtw4 ;
   private String edtPrdCtw4_Internalname ;
   private String A11687PrdList ;
   private String A11614PrdEINECS ;
   private String edtPrdEINECS_Internalname ;
   private String A11615PrdFuncion ;
   private String edtPrdFuncion_Internalname ;
   private String edtPrdNmQu_Internalname ;
   private String edtPrdDensS_Internalname ;
   private String edtPrdTnq_Internalname ;
   private String AV293Listaprd_wcds_2_tfprdnum ;
   private String AV294Listaprd_wcds_3_tfprdnum_sel ;
   private String AV295Listaprd_wcds_4_tfprdnom ;
   private String AV296Listaprd_wcds_5_tfprdnom_sel ;
   private String AV299Listaprd_wcds_8_tfprvnom ;
   private String AV300Listaprd_wcds_9_tfprvnom_sel ;
   private String scmdbuf ;
   private String lV293Listaprd_wcds_2_tfprdnum ;
   private String lV295Listaprd_wcds_4_tfprdnom ;
   private String lV299Listaprd_wcds_8_tfprvnom ;
   private String AV289Station ;
   private String AV290Emprnom ;
   private String AV291Usurcod ;
   private String edtPrdNom_Link ;
   private String edtPrdUcpDsc_Link ;
   private String edtPrdUcoDsc_Link ;
   private String edtValDsc_Link ;
   private String edtTipPrdDsc_Link ;
   private String GXt_char13 ;
   private String GXv_char4[] ;
   private String GXt_char12 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV282EmprCod ;
   private String sCtrlAV283PrdNumFrom ;
   private String sCtrlAV284PrdNumTo ;
   private String sCtrlAV285PrvNumFrom ;
   private String sCtrlAV286PrvNumTo ;
   private String sGXsfl_45_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtEmprCod_Jsonclick ;
   private String edtEmprNom_Jsonclick ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdNom_Jsonclick ;
   private String edtPrvNum_Jsonclick ;
   private String edtPrvNom_Jsonclick ;
   private String edtPrdExiAlm_Jsonclick ;
   private String edtPrdExiCC_Jsonclick ;
   private String edtPrdRefPrv_Jsonclick ;
   private String edtPrdCanRes_Jsonclick ;
   private String edtPrdUMeFo_Jsonclick ;
   private String edtPrdUcpDsc_Jsonclick ;
   private String edtPrdUcoDsc_Jsonclick ;
   private String edtPrdFacCon_Jsonclick ;
   private String edtValDsc_Jsonclick ;
   private String edtPrdNum2_Jsonclick ;
   private String edtPrdPreAct_Jsonclick ;
   private String edtPrdFT_Jsonclick ;
   private String edtPrdFFT_Jsonclick ;
   private String edtPrdHS_Jsonclick ;
   private String edtPrdFHS_Jsonclick ;
   private String edtPrdReach_Jsonclick ;
   private String GXCCtl ;
   private String edtPrdGots_Jsonclick ;
   private String edtPrdHm_Jsonclick ;
   private String edtPrdDqo_Jsonclick ;
   private String edtPrdAox_Jsonclick ;
   private String edtPrdColIdx_Jsonclick ;
   private String edtTipPrdCod_Jsonclick ;
   private String edtTipPrdDsc_Jsonclick ;
   private String edtPrdNroCAS_Jsonclick ;
   private String edtPrdRTM_Jsonclick ;
   private String edtPrdCtw1_Jsonclick ;
   private String edtPrdCtw2_Jsonclick ;
   private String edtPrdCtw3_Jsonclick ;
   private String edtPrdCtw4_Jsonclick ;
   private String edtPrdEINECS_Jsonclick ;
   private String edtPrdFuncion_Jsonclick ;
   private String edtPrdNmQu_Jsonclick ;
   private String edtPrdDensS_Jsonclick ;
   private String edtPrdTnq_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date A9740PrdFFT ;
   private java.util.Date A9742PrdFHS ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV13OrderedDsc ;
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
   private boolean n407EmprNom ;
   private boolean n794PrvNom ;
   private boolean n737PrdUcpDsc ;
   private boolean n736PrdUcoDsc ;
   private boolean n857ValDsc ;
   private boolean n6301TipPrdCod ;
   private boolean n6302TipPrdDsc ;
   private boolean bGXsfl_45_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV18ColumnsSelectorXML ;
   private String AV24ManageFiltersXml ;
   private String AV19UserCustomValue ;
   private String AV15FilterFullText ;
   private String A11616PrdNmQu ;
   private String AV292Listaprd_wcds_1_filterfulltext ;
   private String lV292Listaprd_wcds_1_filterfulltext ;
   private String AV16ExcelFilename ;
   private String AV17ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV22Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucInnewwindow1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private HTMLChoice cmbPrdOkotex ;
   private HTMLChoice cmbPrdList ;
   private IDataStoreProvider pr_default ;
   private byte[] H01M02_A742PrdUniCom ;
   private byte[] H01M02_A743PrdUniCon ;
   private byte[] H01M02_A856ValCod ;
   private byte[] H01M02_A3273PrdTnq ;
   private java.math.BigDecimal[] H01M02_A5416PrdDensS ;
   private String[] H01M02_A11616PrdNmQu ;
   private String[] H01M02_A11615PrdFuncion ;
   private String[] H01M02_A11614PrdEINECS ;
   private String[] H01M02_A11687PrdList ;
   private String[] H01M02_A11663PrdCtw4 ;
   private String[] H01M02_A10938PrdCtw3 ;
   private String[] H01M02_A10937PrdCtw2 ;
   private String[] H01M02_A10936PrdCtw1 ;
   private String[] H01M02_A10935PrdRTM ;
   private String[] H01M02_A11196PrdNroCAS ;
   private String[] H01M02_A6302TipPrdDsc ;
   private boolean[] H01M02_n6302TipPrdDsc ;
   private short[] H01M02_A6301TipPrdCod ;
   private boolean[] H01M02_n6301TipPrdCod ;
   private String[] H01M02_A10119PrdColIdx ;
   private java.math.BigDecimal[] H01M02_A9733PrdAox ;
   private short[] H01M02_A1644PrdDqo ;
   private String[] H01M02_A11364PrdHm ;
   private String[] H01M02_A11363PrdGots ;
   private String[] H01M02_A5888PrdOkotex ;
   private String[] H01M02_A5887PrdReach ;
   private java.util.Date[] H01M02_A9742PrdFHS ;
   private String[] H01M02_A9741PrdHS ;
   private java.util.Date[] H01M02_A9740PrdFFT ;
   private String[] H01M02_A9739PrdFT ;
   private java.math.BigDecimal[] H01M02_A724PrdPreAct ;
   private String[] H01M02_A4693PrdNum2 ;
   private String[] H01M02_A857ValDsc ;
   private boolean[] H01M02_n857ValDsc ;
   private java.math.BigDecimal[] H01M02_A707PrdFacCon ;
   private String[] H01M02_A736PrdUcoDsc ;
   private boolean[] H01M02_n736PrdUcoDsc ;
   private String[] H01M02_A737PrdUcpDsc ;
   private boolean[] H01M02_n737PrdUcpDsc ;
   private byte[] H01M02_A4338PrdUMeFo ;
   private java.math.BigDecimal[] H01M02_A685PrdCanRes ;
   private String[] H01M02_A728PrdRefPrv ;
   private java.math.BigDecimal[] H01M02_A705PrdExiCC ;
   private java.math.BigDecimal[] H01M02_A704PrdExiAlm ;
   private String[] H01M02_A794PrvNom ;
   private boolean[] H01M02_n794PrvNom ;
   private int[] H01M02_A795PrvNum ;
   private String[] H01M02_A718PrdNom ;
   private String[] H01M02_A719PrdNum ;
   private String[] H01M02_A407EmprNom ;
   private boolean[] H01M02_n407EmprNom ;
   private String[] H01M02_A396EmprCod ;
   private byte[] H01M03_A742PrdUniCom ;
   private byte[] H01M03_A743PrdUniCon ;
   private byte[] H01M03_A856ValCod ;
   private byte[] H01M03_A3273PrdTnq ;
   private java.math.BigDecimal[] H01M03_A5416PrdDensS ;
   private String[] H01M03_A11616PrdNmQu ;
   private String[] H01M03_A11615PrdFuncion ;
   private String[] H01M03_A11614PrdEINECS ;
   private String[] H01M03_A11687PrdList ;
   private String[] H01M03_A11663PrdCtw4 ;
   private String[] H01M03_A10938PrdCtw3 ;
   private String[] H01M03_A10937PrdCtw2 ;
   private String[] H01M03_A10936PrdCtw1 ;
   private String[] H01M03_A10935PrdRTM ;
   private String[] H01M03_A11196PrdNroCAS ;
   private String[] H01M03_A6302TipPrdDsc ;
   private boolean[] H01M03_n6302TipPrdDsc ;
   private short[] H01M03_A6301TipPrdCod ;
   private boolean[] H01M03_n6301TipPrdCod ;
   private String[] H01M03_A10119PrdColIdx ;
   private java.math.BigDecimal[] H01M03_A9733PrdAox ;
   private short[] H01M03_A1644PrdDqo ;
   private String[] H01M03_A11364PrdHm ;
   private String[] H01M03_A11363PrdGots ;
   private String[] H01M03_A5888PrdOkotex ;
   private String[] H01M03_A5887PrdReach ;
   private java.util.Date[] H01M03_A9742PrdFHS ;
   private String[] H01M03_A9741PrdHS ;
   private java.util.Date[] H01M03_A9740PrdFFT ;
   private String[] H01M03_A9739PrdFT ;
   private java.math.BigDecimal[] H01M03_A724PrdPreAct ;
   private String[] H01M03_A4693PrdNum2 ;
   private String[] H01M03_A857ValDsc ;
   private boolean[] H01M03_n857ValDsc ;
   private java.math.BigDecimal[] H01M03_A707PrdFacCon ;
   private String[] H01M03_A736PrdUcoDsc ;
   private boolean[] H01M03_n736PrdUcoDsc ;
   private String[] H01M03_A737PrdUcpDsc ;
   private boolean[] H01M03_n737PrdUcpDsc ;
   private byte[] H01M03_A4338PrdUMeFo ;
   private java.math.BigDecimal[] H01M03_A685PrdCanRes ;
   private String[] H01M03_A728PrdRefPrv ;
   private java.math.BigDecimal[] H01M03_A705PrdExiCC ;
   private java.math.BigDecimal[] H01M03_A704PrdExiAlm ;
   private String[] H01M03_A794PrvNom ;
   private boolean[] H01M03_n794PrvNom ;
   private int[] H01M03_A795PrvNum ;
   private String[] H01M03_A718PrdNom ;
   private String[] H01M03_A719PrdNum ;
   private String[] H01M03_A407EmprNom ;
   private boolean[] H01M03_n407EmprNom ;
   private String[] H01M03_A396EmprCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV23ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState14[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV21ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV277DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class listaprd_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01M02( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV294Listaprd_wcds_3_tfprdnum_sel ,
                                          String AV293Listaprd_wcds_2_tfprdnum ,
                                          String AV296Listaprd_wcds_5_tfprdnom_sel ,
                                          String AV295Listaprd_wcds_4_tfprdnom ,
                                          int AV297Listaprd_wcds_6_tfprvnum ,
                                          int AV298Listaprd_wcds_7_tfprvnum_to ,
                                          String AV300Listaprd_wcds_9_tfprvnom_sel ,
                                          String AV299Listaprd_wcds_8_tfprvnom ,
                                          String AV282EmprCod ,
                                          String AV283PrdNumFrom ,
                                          String AV284PrdNumTo ,
                                          int AV285PrvNumFrom ,
                                          int AV286PrvNumTo ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          String A396EmprCod ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV292Listaprd_wcds_1_filterfulltext ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A705PrdExiCC ,
                                          String A728PrdRefPrv ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          byte A4338PrdUMeFo ,
                                          String A737PrdUcpDsc ,
                                          String A736PrdUcoDsc ,
                                          java.math.BigDecimal A707PrdFacCon ,
                                          String A857ValDsc ,
                                          String A4693PrdNum2 ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          String A9739PrdFT ,
                                          String A9741PrdHS ,
                                          String A5887PrdReach ,
                                          String A5888PrdOkotex ,
                                          String A11363PrdGots ,
                                          String A11364PrdHm ,
                                          short A1644PrdDqo ,
                                          java.math.BigDecimal A9733PrdAox ,
                                          String A10119PrdColIdx ,
                                          short A6301TipPrdCod ,
                                          String A6302TipPrdDsc ,
                                          String A11196PrdNroCAS ,
                                          String A10935PrdRTM ,
                                          String A10936PrdCtw1 ,
                                          String A10937PrdCtw2 ,
                                          String A10938PrdCtw3 ,
                                          String A11663PrdCtw4 ,
                                          String A11687PrdList ,
                                          String A11614PrdEINECS ,
                                          String A11615PrdFuncion ,
                                          String A11616PrdNmQu ,
                                          java.math.BigDecimal A5416PrdDensS ,
                                          byte A3273PrdTnq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int15 = new byte[13];
      Object[] GXv_Object16 = new Object[2];
      scmdbuf = "SELECT T1.PrdUniCom AS PrdUniCom, T1.PrdUniCon AS PrdUniCon, T1.ValCod, T1.PrdTnq, T1.PrdDensS, T1.PrdNmQu, T1.PrdFuncion, T1.PrdEINECS, T1.PrdList, T1.PrdCtw4," ;
      scmdbuf += " T1.PrdCtw3, T1.PrdCtw2, T1.PrdCtw1, T1.PrdRTM, T1.PrdNroCAS, T7.TipPrdDsc, T1.TipPrdCod, T1.PrdColIdx, T1.PrdAox, T1.PrdDqo, T1.PrdHm, T1.PrdGots, T1.PrdOkotex," ;
      scmdbuf += " T1.PrdReach, T1.PrdFHS, T1.PrdHS, T1.PrdFFT, T1.PrdFT, T1.PrdPreAct, T1.PrdNum2, T6.ValDsc, T1.PrdFacCon, T5.UniDsc AS PrdUcoDsc, T4.UniDsc AS PrdUcpDsc, T1.PrdUMeFo," ;
      scmdbuf += " T1.PrdCanRes, T1.PrdRefPrv, T1.PrdExiCC, T1.PrdExiAlm, T3.PrvNom, T1.PrvNum, T1.PrdNom, T1.PrdNum, T2.EmprNom, T1.EmprCod FROM ((((((TXPPRODUC T1 INNER JOIN TXPEMPRES" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPPRVGEN T3 ON T3.EmprCod = T1.EmprCod AND T3.PrvNum = T1.PrvNum) INNER JOIN TXPTIPUNI T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.UniCod = T1.PrdUniCom) INNER JOIN TXPTIPUNI T5 ON T5.EmprCod = T1.EmprCod AND T5.UniCod = T1.PrdUniCon) INNER JOIN TXPTIPVAL T6 ON T6.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T6.ValCod = T1.ValCod) LEFT JOIN TXPTIPPRD T7 ON T7.EmprCod = T1.EmprCod AND T7.TipPrdCod = T1.TipPrdCod)" ;
      if ( (GXutil.strcmp("", AV294Listaprd_wcds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV293Listaprd_wcds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV294Listaprd_wcds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int15[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV296Listaprd_wcds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV295Listaprd_wcds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV296Listaprd_wcds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int15[3] = (byte)(1) ;
      }
      if ( ! (0==AV297Listaprd_wcds_6_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int15[4] = (byte)(1) ;
      }
      if ( ! (0==AV298Listaprd_wcds_7_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int15[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV300Listaprd_wcds_9_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV299Listaprd_wcds_8_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV300Listaprd_wcds_9_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PrvNom = ?)");
      }
      else
      {
         GXv_int15[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV282EmprCod)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int15[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV283PrdNumFrom)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum >= ?)");
      }
      else
      {
         GXv_int15[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV284PrdNumTo)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum <= ?)");
      }
      else
      {
         GXv_int15[10] = (byte)(1) ;
      }
      if ( ! (0==AV285PrvNumFrom) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int15[11] = (byte)(1) ;
      }
      if ( ! (0==AV286PrvNumTo) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int15[12] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNom" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvNum" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.PrvNom" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.PrvNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdExiAlm" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdExiAlm DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdExiCC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdExiCC DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdRefPrv" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdRefPrv DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdCanRes" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdCanRes DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdUMeFo" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdUMeFo DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.UniDsc" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.UniDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T5.UniDsc" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T5.UniDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdFacCon" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdFacCon DESC" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T6.ValDsc" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T6.ValDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum2" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum2 DESC" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdPreAct" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdPreAct DESC" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdFT" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdFT DESC" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdFFT" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdFFT DESC" ;
      }
      else if ( ( AV12OrderedBy == 18 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdHS" ;
      }
      else if ( ( AV12OrderedBy == 18 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdHS DESC" ;
      }
      else if ( ( AV12OrderedBy == 19 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdFHS" ;
      }
      else if ( ( AV12OrderedBy == 19 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdFHS DESC" ;
      }
      else if ( ( AV12OrderedBy == 20 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdReach" ;
      }
      else if ( ( AV12OrderedBy == 20 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdReach DESC" ;
      }
      else if ( ( AV12OrderedBy == 21 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdOkotex" ;
      }
      else if ( ( AV12OrderedBy == 21 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdOkotex DESC" ;
      }
      else if ( ( AV12OrderedBy == 22 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdGots" ;
      }
      else if ( ( AV12OrderedBy == 22 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdGots DESC" ;
      }
      else if ( ( AV12OrderedBy == 23 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdHm" ;
      }
      else if ( ( AV12OrderedBy == 23 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdHm DESC" ;
      }
      else if ( ( AV12OrderedBy == 24 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdDqo" ;
      }
      else if ( ( AV12OrderedBy == 24 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdDqo DESC" ;
      }
      else if ( ( AV12OrderedBy == 25 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdAox" ;
      }
      else if ( ( AV12OrderedBy == 25 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdAox DESC" ;
      }
      else if ( ( AV12OrderedBy == 26 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdColIdx" ;
      }
      else if ( ( AV12OrderedBy == 26 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdColIdx DESC" ;
      }
      else if ( ( AV12OrderedBy == 27 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TipPrdCod" ;
      }
      else if ( ( AV12OrderedBy == 27 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TipPrdCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 28 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T7.TipPrdDsc" ;
      }
      else if ( ( AV12OrderedBy == 28 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T7.TipPrdDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 29 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNroCAS" ;
      }
      else if ( ( AV12OrderedBy == 29 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNroCAS DESC" ;
      }
      else if ( ( AV12OrderedBy == 30 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdRTM" ;
      }
      else if ( ( AV12OrderedBy == 30 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdRTM DESC" ;
      }
      else if ( ( AV12OrderedBy == 31 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdCtw1" ;
      }
      else if ( ( AV12OrderedBy == 31 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdCtw1 DESC" ;
      }
      else if ( ( AV12OrderedBy == 32 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdCtw2" ;
      }
      else if ( ( AV12OrderedBy == 32 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdCtw2 DESC" ;
      }
      else if ( ( AV12OrderedBy == 33 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdCtw3" ;
      }
      else if ( ( AV12OrderedBy == 33 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdCtw3 DESC" ;
      }
      else if ( ( AV12OrderedBy == 34 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdCtw4" ;
      }
      else if ( ( AV12OrderedBy == 34 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdCtw4 DESC" ;
      }
      else if ( ( AV12OrderedBy == 35 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdList" ;
      }
      else if ( ( AV12OrderedBy == 35 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdList DESC" ;
      }
      else if ( ( AV12OrderedBy == 36 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdEINECS" ;
      }
      else if ( ( AV12OrderedBy == 36 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdEINECS DESC" ;
      }
      else if ( ( AV12OrderedBy == 37 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdFuncion" ;
      }
      else if ( ( AV12OrderedBy == 37 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdFuncion DESC" ;
      }
      else if ( ( AV12OrderedBy == 38 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNmQu" ;
      }
      else if ( ( AV12OrderedBy == 38 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNmQu DESC" ;
      }
      else if ( ( AV12OrderedBy == 39 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdDensS" ;
      }
      else if ( ( AV12OrderedBy == 39 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdDensS DESC" ;
      }
      else if ( ( AV12OrderedBy == 40 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdTnq" ;
      }
      else if ( ( AV12OrderedBy == 40 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdTnq DESC" ;
      }
      GXv_Object16[0] = scmdbuf ;
      GXv_Object16[1] = GXv_int15 ;
      return GXv_Object16 ;
   }

   protected Object[] conditional_H01M03( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV294Listaprd_wcds_3_tfprdnum_sel ,
                                          String AV293Listaprd_wcds_2_tfprdnum ,
                                          String AV296Listaprd_wcds_5_tfprdnom_sel ,
                                          String AV295Listaprd_wcds_4_tfprdnom ,
                                          int AV297Listaprd_wcds_6_tfprvnum ,
                                          int AV298Listaprd_wcds_7_tfprvnum_to ,
                                          String AV300Listaprd_wcds_9_tfprvnom_sel ,
                                          String AV299Listaprd_wcds_8_tfprvnom ,
                                          String AV282EmprCod ,
                                          String AV283PrdNumFrom ,
                                          String AV284PrdNumTo ,
                                          int AV285PrvNumFrom ,
                                          int AV286PrvNumTo ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          String A396EmprCod ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV292Listaprd_wcds_1_filterfulltext ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A705PrdExiCC ,
                                          String A728PrdRefPrv ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          byte A4338PrdUMeFo ,
                                          String A737PrdUcpDsc ,
                                          String A736PrdUcoDsc ,
                                          java.math.BigDecimal A707PrdFacCon ,
                                          String A857ValDsc ,
                                          String A4693PrdNum2 ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          String A9739PrdFT ,
                                          String A9741PrdHS ,
                                          String A5887PrdReach ,
                                          String A5888PrdOkotex ,
                                          String A11363PrdGots ,
                                          String A11364PrdHm ,
                                          short A1644PrdDqo ,
                                          java.math.BigDecimal A9733PrdAox ,
                                          String A10119PrdColIdx ,
                                          short A6301TipPrdCod ,
                                          String A6302TipPrdDsc ,
                                          String A11196PrdNroCAS ,
                                          String A10935PrdRTM ,
                                          String A10936PrdCtw1 ,
                                          String A10937PrdCtw2 ,
                                          String A10938PrdCtw3 ,
                                          String A11663PrdCtw4 ,
                                          String A11687PrdList ,
                                          String A11614PrdEINECS ,
                                          String A11615PrdFuncion ,
                                          String A11616PrdNmQu ,
                                          java.math.BigDecimal A5416PrdDensS ,
                                          byte A3273PrdTnq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[13];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT T1.PrdUniCom AS PrdUniCom, T1.PrdUniCon AS PrdUniCon, T1.ValCod, T1.PrdTnq, T1.PrdDensS, T1.PrdNmQu, T1.PrdFuncion, T1.PrdEINECS, T1.PrdList, T1.PrdCtw4," ;
      scmdbuf += " T1.PrdCtw3, T1.PrdCtw2, T1.PrdCtw1, T1.PrdRTM, T1.PrdNroCAS, T7.TipPrdDsc, T1.TipPrdCod, T1.PrdColIdx, T1.PrdAox, T1.PrdDqo, T1.PrdHm, T1.PrdGots, T1.PrdOkotex," ;
      scmdbuf += " T1.PrdReach, T1.PrdFHS, T1.PrdHS, T1.PrdFFT, T1.PrdFT, T1.PrdPreAct, T1.PrdNum2, T6.ValDsc, T1.PrdFacCon, T5.UniDsc AS PrdUcoDsc, T4.UniDsc AS PrdUcpDsc, T1.PrdUMeFo," ;
      scmdbuf += " T1.PrdCanRes, T1.PrdRefPrv, T1.PrdExiCC, T1.PrdExiAlm, T3.PrvNom, T1.PrvNum, T1.PrdNom, T1.PrdNum, T2.EmprNom, T1.EmprCod FROM ((((((TXPPRODUC T1 INNER JOIN TXPEMPRES" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPPRVGEN T3 ON T3.EmprCod = T1.EmprCod AND T3.PrvNum = T1.PrvNum) INNER JOIN TXPTIPUNI T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.UniCod = T1.PrdUniCom) INNER JOIN TXPTIPUNI T5 ON T5.EmprCod = T1.EmprCod AND T5.UniCod = T1.PrdUniCon) INNER JOIN TXPTIPVAL T6 ON T6.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T6.ValCod = T1.ValCod) LEFT JOIN TXPTIPPRD T7 ON T7.EmprCod = T1.EmprCod AND T7.TipPrdCod = T1.TipPrdCod)" ;
      if ( (GXutil.strcmp("", AV294Listaprd_wcds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV293Listaprd_wcds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV294Listaprd_wcds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int17[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV296Listaprd_wcds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV295Listaprd_wcds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV296Listaprd_wcds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int17[3] = (byte)(1) ;
      }
      if ( ! (0==AV297Listaprd_wcds_6_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int17[4] = (byte)(1) ;
      }
      if ( ! (0==AV298Listaprd_wcds_7_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int17[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV300Listaprd_wcds_9_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV299Listaprd_wcds_8_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV300Listaprd_wcds_9_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PrvNom = ?)");
      }
      else
      {
         GXv_int17[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV282EmprCod)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int17[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV283PrdNumFrom)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum >= ?)");
      }
      else
      {
         GXv_int17[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV284PrdNumTo)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum <= ?)");
      }
      else
      {
         GXv_int17[10] = (byte)(1) ;
      }
      if ( ! (0==AV285PrvNumFrom) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int17[11] = (byte)(1) ;
      }
      if ( ! (0==AV286PrvNumTo) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int17[12] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNom" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvNum" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.PrvNom" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.PrvNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdExiAlm" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdExiAlm DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdExiCC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdExiCC DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdRefPrv" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdRefPrv DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdCanRes" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdCanRes DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdUMeFo" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdUMeFo DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.UniDsc" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.UniDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T5.UniDsc" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T5.UniDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdFacCon" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdFacCon DESC" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T6.ValDsc" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T6.ValDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum2" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum2 DESC" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdPreAct" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdPreAct DESC" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdFT" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdFT DESC" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdFFT" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdFFT DESC" ;
      }
      else if ( ( AV12OrderedBy == 18 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdHS" ;
      }
      else if ( ( AV12OrderedBy == 18 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdHS DESC" ;
      }
      else if ( ( AV12OrderedBy == 19 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdFHS" ;
      }
      else if ( ( AV12OrderedBy == 19 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdFHS DESC" ;
      }
      else if ( ( AV12OrderedBy == 20 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdReach" ;
      }
      else if ( ( AV12OrderedBy == 20 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdReach DESC" ;
      }
      else if ( ( AV12OrderedBy == 21 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdOkotex" ;
      }
      else if ( ( AV12OrderedBy == 21 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdOkotex DESC" ;
      }
      else if ( ( AV12OrderedBy == 22 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdGots" ;
      }
      else if ( ( AV12OrderedBy == 22 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdGots DESC" ;
      }
      else if ( ( AV12OrderedBy == 23 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdHm" ;
      }
      else if ( ( AV12OrderedBy == 23 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdHm DESC" ;
      }
      else if ( ( AV12OrderedBy == 24 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdDqo" ;
      }
      else if ( ( AV12OrderedBy == 24 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdDqo DESC" ;
      }
      else if ( ( AV12OrderedBy == 25 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdAox" ;
      }
      else if ( ( AV12OrderedBy == 25 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdAox DESC" ;
      }
      else if ( ( AV12OrderedBy == 26 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdColIdx" ;
      }
      else if ( ( AV12OrderedBy == 26 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdColIdx DESC" ;
      }
      else if ( ( AV12OrderedBy == 27 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TipPrdCod" ;
      }
      else if ( ( AV12OrderedBy == 27 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TipPrdCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 28 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T7.TipPrdDsc" ;
      }
      else if ( ( AV12OrderedBy == 28 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T7.TipPrdDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 29 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNroCAS" ;
      }
      else if ( ( AV12OrderedBy == 29 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNroCAS DESC" ;
      }
      else if ( ( AV12OrderedBy == 30 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdRTM" ;
      }
      else if ( ( AV12OrderedBy == 30 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdRTM DESC" ;
      }
      else if ( ( AV12OrderedBy == 31 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdCtw1" ;
      }
      else if ( ( AV12OrderedBy == 31 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdCtw1 DESC" ;
      }
      else if ( ( AV12OrderedBy == 32 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdCtw2" ;
      }
      else if ( ( AV12OrderedBy == 32 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdCtw2 DESC" ;
      }
      else if ( ( AV12OrderedBy == 33 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdCtw3" ;
      }
      else if ( ( AV12OrderedBy == 33 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdCtw3 DESC" ;
      }
      else if ( ( AV12OrderedBy == 34 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdCtw4" ;
      }
      else if ( ( AV12OrderedBy == 34 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdCtw4 DESC" ;
      }
      else if ( ( AV12OrderedBy == 35 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdList" ;
      }
      else if ( ( AV12OrderedBy == 35 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdList DESC" ;
      }
      else if ( ( AV12OrderedBy == 36 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdEINECS" ;
      }
      else if ( ( AV12OrderedBy == 36 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdEINECS DESC" ;
      }
      else if ( ( AV12OrderedBy == 37 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdFuncion" ;
      }
      else if ( ( AV12OrderedBy == 37 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdFuncion DESC" ;
      }
      else if ( ( AV12OrderedBy == 38 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNmQu" ;
      }
      else if ( ( AV12OrderedBy == 38 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNmQu DESC" ;
      }
      else if ( ( AV12OrderedBy == 39 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdDensS" ;
      }
      else if ( ( AV12OrderedBy == 39 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdDensS DESC" ;
      }
      else if ( ( AV12OrderedBy == 40 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdTnq" ;
      }
      else if ( ( AV12OrderedBy == 40 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdTnq DESC" ;
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
                  return conditional_H01M02(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Boolean) dynConstraints[19]).booleanValue() , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (String)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).shortValue() , (java.math.BigDecimal)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).shortValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (java.math.BigDecimal)dynConstraints[53] , ((Number) dynConstraints[54]).byteValue() );
            case 1 :
                  return conditional_H01M03(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Boolean) dynConstraints[19]).booleanValue() , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (String)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).shortValue() , (java.math.BigDecimal)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).shortValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (java.math.BigDecimal)dynConstraints[53] , ((Number) dynConstraints[54]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01M02", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01M03", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,3);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 50);
               ((String[]) buf[7])[0] = rslt.getString(8, 40);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((String[]) buf[9])[0] = rslt.getString(10, 3);
               ((String[]) buf[10])[0] = rslt.getString(11, 3);
               ((String[]) buf[11])[0] = rslt.getString(12, 20);
               ((String[]) buf[12])[0] = rslt.getString(13, 3);
               ((String[]) buf[13])[0] = rslt.getString(14, 10);
               ((String[]) buf[14])[0] = rslt.getString(15, 40);
               ((String[]) buf[15])[0] = rslt.getString(16, 40);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(17);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(18, 10);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(19,2);
               ((short[]) buf[21])[0] = rslt.getShort(20);
               ((String[]) buf[22])[0] = rslt.getString(21, 1);
               ((String[]) buf[23])[0] = rslt.getString(22, 1);
               ((String[]) buf[24])[0] = rslt.getString(23, 1);
               ((String[]) buf[25])[0] = rslt.getString(24, 1);
               ((java.util.Date[]) buf[26])[0] = rslt.getGXDate(25);
               ((String[]) buf[27])[0] = rslt.getString(26, 1);
               ((java.util.Date[]) buf[28])[0] = rslt.getGXDate(27);
               ((String[]) buf[29])[0] = rslt.getString(28, 1);
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(29,5);
               ((String[]) buf[31])[0] = rslt.getString(30, 16);
               ((String[]) buf[32])[0] = rslt.getString(31, 16);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(32,4);
               ((String[]) buf[35])[0] = rslt.getString(33, 8);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(34, 8);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((byte[]) buf[39])[0] = rslt.getByte(35);
               ((java.math.BigDecimal[]) buf[40])[0] = rslt.getBigDecimal(36,4);
               ((String[]) buf[41])[0] = rslt.getString(37, 30);
               ((java.math.BigDecimal[]) buf[42])[0] = rslt.getBigDecimal(38,4);
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(39,4);
               ((String[]) buf[44])[0] = rslt.getString(40, 30);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((int[]) buf[46])[0] = rslt.getInt(41);
               ((String[]) buf[47])[0] = rslt.getString(42, 26);
               ((String[]) buf[48])[0] = rslt.getString(43, 6);
               ((String[]) buf[49])[0] = rslt.getString(44, 30);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(45, 3);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,3);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 50);
               ((String[]) buf[7])[0] = rslt.getString(8, 40);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((String[]) buf[9])[0] = rslt.getString(10, 3);
               ((String[]) buf[10])[0] = rslt.getString(11, 3);
               ((String[]) buf[11])[0] = rslt.getString(12, 20);
               ((String[]) buf[12])[0] = rslt.getString(13, 3);
               ((String[]) buf[13])[0] = rslt.getString(14, 10);
               ((String[]) buf[14])[0] = rslt.getString(15, 40);
               ((String[]) buf[15])[0] = rslt.getString(16, 40);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(17);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(18, 10);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(19,2);
               ((short[]) buf[21])[0] = rslt.getShort(20);
               ((String[]) buf[22])[0] = rslt.getString(21, 1);
               ((String[]) buf[23])[0] = rslt.getString(22, 1);
               ((String[]) buf[24])[0] = rslt.getString(23, 1);
               ((String[]) buf[25])[0] = rslt.getString(24, 1);
               ((java.util.Date[]) buf[26])[0] = rslt.getGXDate(25);
               ((String[]) buf[27])[0] = rslt.getString(26, 1);
               ((java.util.Date[]) buf[28])[0] = rslt.getGXDate(27);
               ((String[]) buf[29])[0] = rslt.getString(28, 1);
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(29,5);
               ((String[]) buf[31])[0] = rslt.getString(30, 16);
               ((String[]) buf[32])[0] = rslt.getString(31, 16);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(32,4);
               ((String[]) buf[35])[0] = rslt.getString(33, 8);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(34, 8);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((byte[]) buf[39])[0] = rslt.getByte(35);
               ((java.math.BigDecimal[]) buf[40])[0] = rslt.getBigDecimal(36,4);
               ((String[]) buf[41])[0] = rslt.getString(37, 30);
               ((java.math.BigDecimal[]) buf[42])[0] = rslt.getBigDecimal(38,4);
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(39,4);
               ((String[]) buf[44])[0] = rslt.getString(40, 30);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((int[]) buf[46])[0] = rslt.getInt(41);
               ((String[]) buf[47])[0] = rslt.getString(42, 26);
               ((String[]) buf[48])[0] = rslt.getString(43, 6);
               ((String[]) buf[49])[0] = rslt.getString(44, 30);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(45, 3);
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
                  stmt.setString(sIdx, (String)parms[13], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 26);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 3);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 26);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 3);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               return;
      }
   }

}

