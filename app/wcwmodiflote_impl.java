package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcwmodiflote_impl extends GXWebComponent
{
   public wcwmodiflote_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wcwmodiflote_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcwmodiflote_impl.class ));
   }

   public wcwmodiflote_impl( int remoteHandle ,
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
               AV59EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59EmprCod", AV59EmprCod);
               AV65Fec1 = localUtil.parseDateParm( httpContext.GetPar( "Fec1")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65Fec1", localUtil.format(AV65Fec1, "99/99/99"));
               AV66Fec2 = localUtil.parseDateParm( httpContext.GetPar( "Fec2")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66Fec2", localUtil.format(AV66Fec2, "99/99/99"));
               AV67Prdnum1 = httpContext.GetPar( "Prdnum1") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67Prdnum1", AV67Prdnum1);
               AV68Prdnum2 = httpContext.GetPar( "Prdnum2") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68Prdnum2", AV68Prdnum2);
               AV69Prvnum = (int)(GXutil.lval( httpContext.GetPar( "Prvnum"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69Prvnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69Prvnum), 6, 0));
               AV64Entcon = (byte)(GXutil.lval( httpContext.GetPar( "Entcon"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64Entcon", GXutil.str( AV64Entcon, 1, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV59EmprCod,AV65Fec1,AV66Fec2,AV67Prdnum1,AV68Prdnum2,Integer.valueOf(AV69Prvnum),Byte.valueOf(AV64Entcon)});
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
      nRC_GXsfl_41 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_41"))) ;
      nGXsfl_41_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_41_idx"))) ;
      sGXsfl_41_idx = httpContext.GetPar( "sGXsfl_41_idx") ;
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
      AV77FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV59EmprCod = httpContext.GetPar( "EmprCod") ;
      AV65Fec1 = localUtil.parseDateParm( httpContext.GetPar( "Fec1")) ;
      AV66Fec2 = localUtil.parseDateParm( httpContext.GetPar( "Fec2")) ;
      AV67Prdnum1 = httpContext.GetPar( "Prdnum1") ;
      AV68Prdnum2 = httpContext.GetPar( "Prdnum2") ;
      AV69Prvnum = (int)(GXutil.lval( httpContext.GetPar( "Prvnum"))) ;
      AV64Entcon = (byte)(GXutil.lval( httpContext.GetPar( "Entcon"))) ;
      AV27ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV22ColumnsSelector);
      AV73TFEntFecEnt = localUtil.parseDateParm( httpContext.GetPar( "TFEntFecEnt")) ;
      AV29TFPrdNum = httpContext.GetPar( "TFPrdNum") ;
      AV30TFPrdNum_Sel = httpContext.GetPar( "TFPrdNum_Sel") ;
      AV32TFPrdNom = httpContext.GetPar( "TFPrdNom") ;
      AV33TFPrdNom_Sel = httpContext.GetPar( "TFPrdNom_Sel") ;
      AV35TFEntPrvNum = (int)(GXutil.lval( httpContext.GetPar( "TFEntPrvNum"))) ;
      AV36TFEntPrvNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFEntPrvNum_To"))) ;
      AV38TFEntUniEnt = CommonUtil.decimalVal( httpContext.GetPar( "TFEntUniEnt"), ".") ;
      AV39TFEntUniEnt_To = CommonUtil.decimalVal( httpContext.GetPar( "TFEntUniEnt_To"), ".") ;
      AV41TFEntUniRem = CommonUtil.decimalVal( httpContext.GetPar( "TFEntUniRem"), ".") ;
      AV42TFEntUniRem_To = CommonUtil.decimalVal( httpContext.GetPar( "TFEntUniRem_To"), ".") ;
      AV44TFEntPre = CommonUtil.decimalVal( httpContext.GetPar( "TFEntPre"), ".") ;
      AV45TFEntPre_To = CommonUtil.decimalVal( httpContext.GetPar( "TFEntPre_To"), ".") ;
      AV47TFPedCod = (int)(GXutil.lval( httpContext.GetPar( "TFPedCod"))) ;
      AV48TFPedCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFPedCod_To"))) ;
      AV138Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV54Tintutex = (short)(GXutil.lval( httpContext.GetPar( "Tintutex"))) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV77FilterFullText, AV59EmprCod, AV65Fec1, AV66Fec2, AV67Prdnum1, AV68Prdnum2, AV69Prvnum, AV64Entcon, AV27ManageFiltersExecutionStep, AV22ColumnsSelector, AV73TFEntFecEnt, AV29TFPrdNum, AV30TFPrdNum_Sel, AV32TFPrdNom, AV33TFPrdNom_Sel, AV35TFEntPrvNum, AV36TFEntPrvNum_To, AV38TFEntUniEnt, AV39TFEntUniEnt_To, AV41TFEntUniRem, AV42TFEntUniRem_To, AV44TFEntPre, AV45TFEntPre_To, AV47TFPedCod, AV48TFPedCod_To, AV138Pgmname, AV12OrderedBy, AV13OrderedDsc, AV54Tintutex, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         paXR2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Entradas en Almacen, Modificacion LOte, Albaran Nº", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wcwmodiflote", new String[] {GXutil.URLEncode(GXutil.rtrim(AV59EmprCod)),GXutil.URLEncode(GXutil.formatDateParm(AV65Fec1)),GXutil.URLEncode(GXutil.formatDateParm(AV66Fec2)),GXutil.URLEncode(GXutil.rtrim(AV67Prdnum1)),GXutil.URLEncode(GXutil.rtrim(AV68Prdnum2)),GXutil.URLEncode(GXutil.ltrimstr(AV69Prvnum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV64Entcon,1,0))}, new String[] {"EmprCod","Fec1","Fec2","Prdnum1","Prdnum2","Prvnum","Entcon"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV138Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTINTUTEX", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV54Tintutex), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vFILTERFULLTEXT", AV77FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_41", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_41, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV25ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV25ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV52GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV53GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV50DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV50DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV22ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV22ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV59EmprCod", GXutil.rtrim( wcpOAV59EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV65Fec1", localUtil.dtoc( wcpOAV65Fec1, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV66Fec2", localUtil.dtoc( wcpOAV66Fec2, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV67Prdnum1", GXutil.rtrim( wcpOAV67Prdnum1));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV68Prdnum2", GXutil.rtrim( wcpOAV68Prdnum2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV69Prvnum", GXutil.ltrim( localUtil.ntoc( wcpOAV69Prvnum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV64Entcon", GXutil.ltrim( localUtil.ntoc( wcpOAV64Entcon, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV27ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFENTFECENT", localUtil.dtoc( AV73TFEntFecEnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNUM", GXutil.rtrim( AV29TFPrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNUM_SEL", GXutil.rtrim( AV30TFPrdNum_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNOM", GXutil.rtrim( AV32TFPrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNOM_SEL", GXutil.rtrim( AV33TFPrdNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFENTPRVNUM", GXutil.ltrim( localUtil.ntoc( AV35TFEntPrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFENTPRVNUM_TO", GXutil.ltrim( localUtil.ntoc( AV36TFEntPrvNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFENTUNIENT", GXutil.ltrim( localUtil.ntoc( AV38TFEntUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFENTUNIENT_TO", GXutil.ltrim( localUtil.ntoc( AV39TFEntUniEnt_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFENTUNIREM", GXutil.ltrim( localUtil.ntoc( AV41TFEntUniRem, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFENTUNIREM_TO", GXutil.ltrim( localUtil.ntoc( AV42TFEntUniRem_To, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFENTPRE", GXutil.ltrim( localUtil.ntoc( AV44TFEntPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFENTPRE_TO", GXutil.ltrim( localUtil.ntoc( AV45TFEntPre_To, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPEDCOD", GXutil.ltrim( localUtil.ntoc( AV47TFPedCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPEDCOD_TO", GXutil.ltrim( localUtil.ntoc( AV48TFPedCod_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV138Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV138Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV59EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFEC1", localUtil.dtoc( AV65Fec1, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFEC2", localUtil.dtoc( AV66Fec2, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRDNUM1", GXutil.rtrim( AV67Prdnum1));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRDNUM2", GXutil.rtrim( AV68Prdnum2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRVNUM", GXutil.ltrim( localUtil.ntoc( AV69Prvnum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vENTCON", GXutil.ltrim( localUtil.ntoc( AV64Entcon, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"ENTNALBAR", GXutil.rtrim( A12857EntNAlbar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"ENTLOTN", GXutil.rtrim( A5686EntLotN));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTINTUTEX", GXutil.ltrim( localUtil.ntoc( AV54Tintutex, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTINTUTEX", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV54Tintutex), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUSURCOD", GXutil.rtrim( AV62UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSTATION", GXutil.rtrim( AV63Station));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
   }

   public void renderHtmlCloseFormXR2( )
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
      return "WCwModifLote" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Entradas en Almacen, Modificacion LOte, Albaran Nº", "") ;
   }

   public void wbXR0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.wcwmodiflote");
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCwModifLote.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCwModifLote.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCwModifLote.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_23_XR2( true) ;
      }
      else
      {
         wb_table1_23_XR2( false) ;
      }
      return  ;
   }

   public void wb_table1_23_XR2e( boolean wbgen )
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
         startgridcontrol41( ) ;
      }
      if ( wbEnd == 41 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_41 = (int)(nGXsfl_41_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV52GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV53GridPageCount);
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV50DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV50DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV22ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_entfecentauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'" + sPrefix + "',false,'" + sGXsfl_41_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_entfecentauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_entfecentauxdate_Internalname, localUtil.format(AV75DDO_EntFecEntAuxDate, "99/99/99"), localUtil.format( AV75DDO_EntFecEntAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,65);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_entfecentauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WCwModifLote.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_entfecentauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WCwModifLote.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 41 )
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

   public void startXR2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Entradas en Almacen, Modificacion LOte, Albaran Nº", ""), (short)(0)) ;
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
            strupXR0( ) ;
         }
      }
   }

   public void wsXR2( )
   {
      startXR2( ) ;
      evtXR2( ) ;
   }

   public void evtXR2( )
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
                              strupXR0( ) ;
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
                              strupXR0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e11XR2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupXR0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e12XR2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupXR0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e13XR2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupXR0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e14XR2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupXR0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e15XR2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupXR0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e16XR2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupXR0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e17XR2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupXR0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavPrvnom_Internalname ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 16), "VCONFIRMAR.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 16), "VCONFIRMAR.CLICK") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupXR0( ) ;
                           }
                           nGXsfl_41_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_412( ) ;
                           AV70Confirmar = httpContext.cgiGet( edtavConfirmar_Internalname) ;
                           httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConfirmar_Internalname, "Bitmap", ((GXutil.strcmp("", AV70Confirmar)==0) ? AV137Confirmar_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV70Confirmar))), !bGXsfl_41_Refreshing);
                           httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConfirmar_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV70Confirmar), true);
                           A415EntFecEnt = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtEntFecEnt_Internalname), 0)) ;
                           A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
                           A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
                           A6156EntPrvNum = (int)(localUtil.ctol( httpContext.cgiGet( edtEntPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n6156EntPrvNum = false ;
                           AV15PrvNom = httpContext.cgiGet( edtavPrvnom_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPrvnom_Internalname, AV15PrvNom);
                           A418EntUniEnt = localUtil.ctond( httpContext.cgiGet( edtEntUniEnt_Internalname)) ;
                           A419EntUniRem = localUtil.ctond( httpContext.cgiGet( edtEntUniRem_Internalname)) ;
                           A417EntPre = localUtil.ctond( httpContext.cgiGet( edtEntPre_Internalname)) ;
                           AV16EntNAlbar = httpContext.cgiGet( edtavEntnalbar_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavEntnalbar_Internalname, AV16EntNAlbar);
                           AV17EntLotN = httpContext.cgiGet( edtavEntlotn_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavEntlotn_Internalname, AV17EntLotN);
                           A658PedCod = (int)(localUtil.ctol( httpContext.cgiGet( edtPedCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n658PedCod = false ;
                           A597LinEnt = (short)(localUtil.ctol( httpContext.cgiGet( edtLinEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
                                       GX_FocusControl = edtavPrvnom_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e18XR2 ();
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
                                       GX_FocusControl = edtavPrvnom_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e19XR2 ();
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
                                       GX_FocusControl = edtavPrvnom_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e20XR2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "VCONFIRMAR.CLICK") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavPrvnom_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e21XR2 ();
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
                                          if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV77FilterFullText) != 0 )
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
                                    strupXR0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavPrvnom_Internalname ;
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

   public void weXR2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseFormXR2( ) ;
         }
      }
   }

   public void paXR2( )
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
      subsflControlProps_412( ) ;
      while ( nGXsfl_41_idx <= nRC_GXsfl_41 )
      {
         sendrow_412( ) ;
         nGXsfl_41_idx = ((subGrid_Islastpage==1)&&(nGXsfl_41_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_41_idx+1) ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_412( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV77FilterFullText ,
                                 String AV59EmprCod ,
                                 java.util.Date AV65Fec1 ,
                                 java.util.Date AV66Fec2 ,
                                 String AV67Prdnum1 ,
                                 String AV68Prdnum2 ,
                                 int AV69Prvnum ,
                                 byte AV64Entcon ,
                                 byte AV27ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV22ColumnsSelector ,
                                 java.util.Date AV73TFEntFecEnt ,
                                 String AV29TFPrdNum ,
                                 String AV30TFPrdNum_Sel ,
                                 String AV32TFPrdNom ,
                                 String AV33TFPrdNom_Sel ,
                                 int AV35TFEntPrvNum ,
                                 int AV36TFEntPrvNum_To ,
                                 java.math.BigDecimal AV38TFEntUniEnt ,
                                 java.math.BigDecimal AV39TFEntUniEnt_To ,
                                 java.math.BigDecimal AV41TFEntUniRem ,
                                 java.math.BigDecimal AV42TFEntUniRem_To ,
                                 java.math.BigDecimal AV44TFEntPre ,
                                 java.math.BigDecimal AV45TFEntPre_To ,
                                 int AV47TFPedCod ,
                                 int AV48TFPedCod_To ,
                                 String AV138Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 short AV54Tintutex ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e19XR2 ();
      GRID_nCurrentRecord = 0 ;
      rfXR2( ) ;
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
      rfXR2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV138Pgmname = "WCwModifLote" ;
      Gx_err = (short)(0) ;
      edtavPrvnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrvnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrvnom_Enabled), 5, 0), !bGXsfl_41_Refreshing);
   }

   public void rfXR2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(41) ;
      /* Execute user event: Refresh */
      e19XR2 ();
      nGXsfl_41_idx = 1 ;
      sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_412( ) ;
      bGXsfl_41_Refreshing = true ;
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
         subsflControlProps_412( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV121Wcwmodifloteds_1_filterfulltext ,
                                              AV122Wcwmodifloteds_2_tfentfecent ,
                                              AV124Wcwmodifloteds_4_tfprdnum_sel ,
                                              AV123Wcwmodifloteds_3_tfprdnum ,
                                              AV126Wcwmodifloteds_6_tfprdnom_sel ,
                                              AV125Wcwmodifloteds_5_tfprdnom ,
                                              Integer.valueOf(AV127Wcwmodifloteds_7_tfentprvnum) ,
                                              Integer.valueOf(AV128Wcwmodifloteds_8_tfentprvnum_to) ,
                                              AV129Wcwmodifloteds_9_tfentunient ,
                                              AV130Wcwmodifloteds_10_tfentunient_to ,
                                              AV131Wcwmodifloteds_11_tfentunirem ,
                                              AV132Wcwmodifloteds_12_tfentunirem_to ,
                                              AV133Wcwmodifloteds_13_tfentpre ,
                                              AV134Wcwmodifloteds_14_tfentpre_to ,
                                              Integer.valueOf(AV135Wcwmodifloteds_15_tfpedcod) ,
                                              Integer.valueOf(AV136Wcwmodifloteds_16_tfpedcod_to) ,
                                              A719PrdNum ,
                                              A718PrdNom ,
                                              Integer.valueOf(A6156EntPrvNum) ,
                                              A418EntUniEnt ,
                                              A419EntUniRem ,
                                              A417EntPre ,
                                              Integer.valueOf(A658PedCod) ,
                                              A415EntFecEnt ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV65Fec1 ,
                                              AV66Fec2 ,
                                              AV67Prdnum1 ,
                                              AV68Prdnum2 ,
                                              Integer.valueOf(AV69Prvnum) ,
                                              Byte.valueOf(A411EntCon) ,
                                              Byte.valueOf(AV64Entcon) ,
                                              AV59EmprCod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV121Wcwmodifloteds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Wcwmodifloteds_1_filterfulltext), "%", "") ;
         lV121Wcwmodifloteds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Wcwmodifloteds_1_filterfulltext), "%", "") ;
         lV121Wcwmodifloteds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Wcwmodifloteds_1_filterfulltext), "%", "") ;
         lV121Wcwmodifloteds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Wcwmodifloteds_1_filterfulltext), "%", "") ;
         lV121Wcwmodifloteds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Wcwmodifloteds_1_filterfulltext), "%", "") ;
         lV121Wcwmodifloteds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Wcwmodifloteds_1_filterfulltext), "%", "") ;
         lV121Wcwmodifloteds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Wcwmodifloteds_1_filterfulltext), "%", "") ;
         lV123Wcwmodifloteds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV123Wcwmodifloteds_3_tfprdnum), 6, "%") ;
         lV125Wcwmodifloteds_5_tfprdnom = GXutil.padr( GXutil.rtrim( AV125Wcwmodifloteds_5_tfprdnom), 26, "%") ;
         /* Using cursor H00XR2 */
         pr_default.execute(0, new Object[] {AV59EmprCod, AV65Fec1, AV66Fec2, AV67Prdnum1, AV67Prdnum1, AV68Prdnum2, AV68Prdnum2, Integer.valueOf(AV69Prvnum), Integer.valueOf(AV69Prvnum), Byte.valueOf(AV64Entcon), Byte.valueOf(AV64Entcon), lV121Wcwmodifloteds_1_filterfulltext, lV121Wcwmodifloteds_1_filterfulltext, lV121Wcwmodifloteds_1_filterfulltext, lV121Wcwmodifloteds_1_filterfulltext, lV121Wcwmodifloteds_1_filterfulltext, lV121Wcwmodifloteds_1_filterfulltext, lV121Wcwmodifloteds_1_filterfulltext, AV122Wcwmodifloteds_2_tfentfecent, lV123Wcwmodifloteds_3_tfprdnum, AV124Wcwmodifloteds_4_tfprdnum_sel, lV125Wcwmodifloteds_5_tfprdnom, AV126Wcwmodifloteds_6_tfprdnom_sel, Integer.valueOf(AV127Wcwmodifloteds_7_tfentprvnum), Integer.valueOf(AV128Wcwmodifloteds_8_tfentprvnum_to), AV129Wcwmodifloteds_9_tfentunient, AV130Wcwmodifloteds_10_tfentunient_to, AV131Wcwmodifloteds_11_tfentunirem, AV132Wcwmodifloteds_12_tfentunirem_to, AV133Wcwmodifloteds_13_tfentpre, AV134Wcwmodifloteds_14_tfentpre_to, Integer.valueOf(AV135Wcwmodifloteds_15_tfpedcod), Integer.valueOf(AV136Wcwmodifloteds_16_tfpedcod_to), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_41_idx = 1 ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_412( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A411EntCon = H00XR2_A411EntCon[0] ;
            A396EmprCod = H00XR2_A396EmprCod[0] ;
            A12857EntNAlbar = H00XR2_A12857EntNAlbar[0] ;
            A5686EntLotN = H00XR2_A5686EntLotN[0] ;
            A597LinEnt = H00XR2_A597LinEnt[0] ;
            A658PedCod = H00XR2_A658PedCod[0] ;
            n658PedCod = H00XR2_n658PedCod[0] ;
            A417EntPre = H00XR2_A417EntPre[0] ;
            A419EntUniRem = H00XR2_A419EntUniRem[0] ;
            A418EntUniEnt = H00XR2_A418EntUniEnt[0] ;
            A6156EntPrvNum = H00XR2_A6156EntPrvNum[0] ;
            n6156EntPrvNum = H00XR2_n6156EntPrvNum[0] ;
            A718PrdNom = H00XR2_A718PrdNom[0] ;
            A719PrdNum = H00XR2_A719PrdNum[0] ;
            A415EntFecEnt = H00XR2_A415EntFecEnt[0] ;
            A718PrdNom = H00XR2_A718PrdNom[0] ;
            e20XR2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(41) ;
         wbXR0( ) ;
      }
      bGXsfl_41_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesXR2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV138Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV138Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTINTUTEX", GXutil.ltrim( localUtil.ntoc( AV54Tintutex, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTINTUTEX", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV54Tintutex), "ZZZ9")));
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
      AV121Wcwmodifloteds_1_filterfulltext = AV77FilterFullText ;
      AV122Wcwmodifloteds_2_tfentfecent = AV73TFEntFecEnt ;
      AV123Wcwmodifloteds_3_tfprdnum = AV29TFPrdNum ;
      AV124Wcwmodifloteds_4_tfprdnum_sel = AV30TFPrdNum_Sel ;
      AV125Wcwmodifloteds_5_tfprdnom = AV32TFPrdNom ;
      AV126Wcwmodifloteds_6_tfprdnom_sel = AV33TFPrdNom_Sel ;
      AV127Wcwmodifloteds_7_tfentprvnum = AV35TFEntPrvNum ;
      AV128Wcwmodifloteds_8_tfentprvnum_to = AV36TFEntPrvNum_To ;
      AV129Wcwmodifloteds_9_tfentunient = AV38TFEntUniEnt ;
      AV130Wcwmodifloteds_10_tfentunient_to = AV39TFEntUniEnt_To ;
      AV131Wcwmodifloteds_11_tfentunirem = AV41TFEntUniRem ;
      AV132Wcwmodifloteds_12_tfentunirem_to = AV42TFEntUniRem_To ;
      AV133Wcwmodifloteds_13_tfentpre = AV44TFEntPre ;
      AV134Wcwmodifloteds_14_tfentpre_to = AV45TFEntPre_To ;
      AV135Wcwmodifloteds_15_tfpedcod = AV47TFPedCod ;
      AV136Wcwmodifloteds_16_tfpedcod_to = AV48TFPedCod_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV121Wcwmodifloteds_1_filterfulltext ,
                                           AV122Wcwmodifloteds_2_tfentfecent ,
                                           AV124Wcwmodifloteds_4_tfprdnum_sel ,
                                           AV123Wcwmodifloteds_3_tfprdnum ,
                                           AV126Wcwmodifloteds_6_tfprdnom_sel ,
                                           AV125Wcwmodifloteds_5_tfprdnom ,
                                           Integer.valueOf(AV127Wcwmodifloteds_7_tfentprvnum) ,
                                           Integer.valueOf(AV128Wcwmodifloteds_8_tfentprvnum_to) ,
                                           AV129Wcwmodifloteds_9_tfentunient ,
                                           AV130Wcwmodifloteds_10_tfentunient_to ,
                                           AV131Wcwmodifloteds_11_tfentunirem ,
                                           AV132Wcwmodifloteds_12_tfentunirem_to ,
                                           AV133Wcwmodifloteds_13_tfentpre ,
                                           AV134Wcwmodifloteds_14_tfentpre_to ,
                                           Integer.valueOf(AV135Wcwmodifloteds_15_tfpedcod) ,
                                           Integer.valueOf(AV136Wcwmodifloteds_16_tfpedcod_to) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           Integer.valueOf(A6156EntPrvNum) ,
                                           A418EntUniEnt ,
                                           A419EntUniRem ,
                                           A417EntPre ,
                                           Integer.valueOf(A658PedCod) ,
                                           A415EntFecEnt ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV65Fec1 ,
                                           AV66Fec2 ,
                                           AV67Prdnum1 ,
                                           AV68Prdnum2 ,
                                           Integer.valueOf(AV69Prvnum) ,
                                           Byte.valueOf(A411EntCon) ,
                                           Byte.valueOf(AV64Entcon) ,
                                           AV59EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV121Wcwmodifloteds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Wcwmodifloteds_1_filterfulltext), "%", "") ;
      lV121Wcwmodifloteds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Wcwmodifloteds_1_filterfulltext), "%", "") ;
      lV121Wcwmodifloteds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Wcwmodifloteds_1_filterfulltext), "%", "") ;
      lV121Wcwmodifloteds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Wcwmodifloteds_1_filterfulltext), "%", "") ;
      lV121Wcwmodifloteds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Wcwmodifloteds_1_filterfulltext), "%", "") ;
      lV121Wcwmodifloteds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Wcwmodifloteds_1_filterfulltext), "%", "") ;
      lV121Wcwmodifloteds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Wcwmodifloteds_1_filterfulltext), "%", "") ;
      lV123Wcwmodifloteds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV123Wcwmodifloteds_3_tfprdnum), 6, "%") ;
      lV125Wcwmodifloteds_5_tfprdnom = GXutil.padr( GXutil.rtrim( AV125Wcwmodifloteds_5_tfprdnom), 26, "%") ;
      /* Using cursor H00XR3 */
      pr_default.execute(1, new Object[] {AV59EmprCod, AV65Fec1, AV66Fec2, AV67Prdnum1, AV67Prdnum1, AV68Prdnum2, AV68Prdnum2, Integer.valueOf(AV69Prvnum), Integer.valueOf(AV69Prvnum), Byte.valueOf(AV64Entcon), Byte.valueOf(AV64Entcon), lV121Wcwmodifloteds_1_filterfulltext, lV121Wcwmodifloteds_1_filterfulltext, lV121Wcwmodifloteds_1_filterfulltext, lV121Wcwmodifloteds_1_filterfulltext, lV121Wcwmodifloteds_1_filterfulltext, lV121Wcwmodifloteds_1_filterfulltext, lV121Wcwmodifloteds_1_filterfulltext, AV122Wcwmodifloteds_2_tfentfecent, lV123Wcwmodifloteds_3_tfprdnum, AV124Wcwmodifloteds_4_tfprdnum_sel, lV125Wcwmodifloteds_5_tfprdnom, AV126Wcwmodifloteds_6_tfprdnom_sel, Integer.valueOf(AV127Wcwmodifloteds_7_tfentprvnum), Integer.valueOf(AV128Wcwmodifloteds_8_tfentprvnum_to), AV129Wcwmodifloteds_9_tfentunient, AV130Wcwmodifloteds_10_tfentunient_to, AV131Wcwmodifloteds_11_tfentunirem, AV132Wcwmodifloteds_12_tfentunirem_to, AV133Wcwmodifloteds_13_tfentpre, AV134Wcwmodifloteds_14_tfentpre_to, Integer.valueOf(AV135Wcwmodifloteds_15_tfpedcod), Integer.valueOf(AV136Wcwmodifloteds_16_tfpedcod_to)});
      GRID_nRecordCount = H00XR3_AGRID_nRecordCount[0] ;
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
      AV121Wcwmodifloteds_1_filterfulltext = AV77FilterFullText ;
      AV122Wcwmodifloteds_2_tfentfecent = AV73TFEntFecEnt ;
      AV123Wcwmodifloteds_3_tfprdnum = AV29TFPrdNum ;
      AV124Wcwmodifloteds_4_tfprdnum_sel = AV30TFPrdNum_Sel ;
      AV125Wcwmodifloteds_5_tfprdnom = AV32TFPrdNom ;
      AV126Wcwmodifloteds_6_tfprdnom_sel = AV33TFPrdNom_Sel ;
      AV127Wcwmodifloteds_7_tfentprvnum = AV35TFEntPrvNum ;
      AV128Wcwmodifloteds_8_tfentprvnum_to = AV36TFEntPrvNum_To ;
      AV129Wcwmodifloteds_9_tfentunient = AV38TFEntUniEnt ;
      AV130Wcwmodifloteds_10_tfentunient_to = AV39TFEntUniEnt_To ;
      AV131Wcwmodifloteds_11_tfentunirem = AV41TFEntUniRem ;
      AV132Wcwmodifloteds_12_tfentunirem_to = AV42TFEntUniRem_To ;
      AV133Wcwmodifloteds_13_tfentpre = AV44TFEntPre ;
      AV134Wcwmodifloteds_14_tfentpre_to = AV45TFEntPre_To ;
      AV135Wcwmodifloteds_15_tfpedcod = AV47TFPedCod ;
      AV136Wcwmodifloteds_16_tfpedcod_to = AV48TFPedCod_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV77FilterFullText, AV59EmprCod, AV65Fec1, AV66Fec2, AV67Prdnum1, AV68Prdnum2, AV69Prvnum, AV64Entcon, AV27ManageFiltersExecutionStep, AV22ColumnsSelector, AV73TFEntFecEnt, AV29TFPrdNum, AV30TFPrdNum_Sel, AV32TFPrdNom, AV33TFPrdNom_Sel, AV35TFEntPrvNum, AV36TFEntPrvNum_To, AV38TFEntUniEnt, AV39TFEntUniEnt_To, AV41TFEntUniRem, AV42TFEntUniRem_To, AV44TFEntPre, AV45TFEntPre_To, AV47TFPedCod, AV48TFPedCod_To, AV138Pgmname, AV12OrderedBy, AV13OrderedDsc, AV54Tintutex, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV121Wcwmodifloteds_1_filterfulltext = AV77FilterFullText ;
      AV122Wcwmodifloteds_2_tfentfecent = AV73TFEntFecEnt ;
      AV123Wcwmodifloteds_3_tfprdnum = AV29TFPrdNum ;
      AV124Wcwmodifloteds_4_tfprdnum_sel = AV30TFPrdNum_Sel ;
      AV125Wcwmodifloteds_5_tfprdnom = AV32TFPrdNom ;
      AV126Wcwmodifloteds_6_tfprdnom_sel = AV33TFPrdNom_Sel ;
      AV127Wcwmodifloteds_7_tfentprvnum = AV35TFEntPrvNum ;
      AV128Wcwmodifloteds_8_tfentprvnum_to = AV36TFEntPrvNum_To ;
      AV129Wcwmodifloteds_9_tfentunient = AV38TFEntUniEnt ;
      AV130Wcwmodifloteds_10_tfentunient_to = AV39TFEntUniEnt_To ;
      AV131Wcwmodifloteds_11_tfentunirem = AV41TFEntUniRem ;
      AV132Wcwmodifloteds_12_tfentunirem_to = AV42TFEntUniRem_To ;
      AV133Wcwmodifloteds_13_tfentpre = AV44TFEntPre ;
      AV134Wcwmodifloteds_14_tfentpre_to = AV45TFEntPre_To ;
      AV135Wcwmodifloteds_15_tfpedcod = AV47TFPedCod ;
      AV136Wcwmodifloteds_16_tfpedcod_to = AV48TFPedCod_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV77FilterFullText, AV59EmprCod, AV65Fec1, AV66Fec2, AV67Prdnum1, AV68Prdnum2, AV69Prvnum, AV64Entcon, AV27ManageFiltersExecutionStep, AV22ColumnsSelector, AV73TFEntFecEnt, AV29TFPrdNum, AV30TFPrdNum_Sel, AV32TFPrdNom, AV33TFPrdNom_Sel, AV35TFEntPrvNum, AV36TFEntPrvNum_To, AV38TFEntUniEnt, AV39TFEntUniEnt_To, AV41TFEntUniRem, AV42TFEntUniRem_To, AV44TFEntPre, AV45TFEntPre_To, AV47TFPedCod, AV48TFPedCod_To, AV138Pgmname, AV12OrderedBy, AV13OrderedDsc, AV54Tintutex, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV121Wcwmodifloteds_1_filterfulltext = AV77FilterFullText ;
      AV122Wcwmodifloteds_2_tfentfecent = AV73TFEntFecEnt ;
      AV123Wcwmodifloteds_3_tfprdnum = AV29TFPrdNum ;
      AV124Wcwmodifloteds_4_tfprdnum_sel = AV30TFPrdNum_Sel ;
      AV125Wcwmodifloteds_5_tfprdnom = AV32TFPrdNom ;
      AV126Wcwmodifloteds_6_tfprdnom_sel = AV33TFPrdNom_Sel ;
      AV127Wcwmodifloteds_7_tfentprvnum = AV35TFEntPrvNum ;
      AV128Wcwmodifloteds_8_tfentprvnum_to = AV36TFEntPrvNum_To ;
      AV129Wcwmodifloteds_9_tfentunient = AV38TFEntUniEnt ;
      AV130Wcwmodifloteds_10_tfentunient_to = AV39TFEntUniEnt_To ;
      AV131Wcwmodifloteds_11_tfentunirem = AV41TFEntUniRem ;
      AV132Wcwmodifloteds_12_tfentunirem_to = AV42TFEntUniRem_To ;
      AV133Wcwmodifloteds_13_tfentpre = AV44TFEntPre ;
      AV134Wcwmodifloteds_14_tfentpre_to = AV45TFEntPre_To ;
      AV135Wcwmodifloteds_15_tfpedcod = AV47TFPedCod ;
      AV136Wcwmodifloteds_16_tfpedcod_to = AV48TFPedCod_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV77FilterFullText, AV59EmprCod, AV65Fec1, AV66Fec2, AV67Prdnum1, AV68Prdnum2, AV69Prvnum, AV64Entcon, AV27ManageFiltersExecutionStep, AV22ColumnsSelector, AV73TFEntFecEnt, AV29TFPrdNum, AV30TFPrdNum_Sel, AV32TFPrdNom, AV33TFPrdNom_Sel, AV35TFEntPrvNum, AV36TFEntPrvNum_To, AV38TFEntUniEnt, AV39TFEntUniEnt_To, AV41TFEntUniRem, AV42TFEntUniRem_To, AV44TFEntPre, AV45TFEntPre_To, AV47TFPedCod, AV48TFPedCod_To, AV138Pgmname, AV12OrderedBy, AV13OrderedDsc, AV54Tintutex, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV121Wcwmodifloteds_1_filterfulltext = AV77FilterFullText ;
      AV122Wcwmodifloteds_2_tfentfecent = AV73TFEntFecEnt ;
      AV123Wcwmodifloteds_3_tfprdnum = AV29TFPrdNum ;
      AV124Wcwmodifloteds_4_tfprdnum_sel = AV30TFPrdNum_Sel ;
      AV125Wcwmodifloteds_5_tfprdnom = AV32TFPrdNom ;
      AV126Wcwmodifloteds_6_tfprdnom_sel = AV33TFPrdNom_Sel ;
      AV127Wcwmodifloteds_7_tfentprvnum = AV35TFEntPrvNum ;
      AV128Wcwmodifloteds_8_tfentprvnum_to = AV36TFEntPrvNum_To ;
      AV129Wcwmodifloteds_9_tfentunient = AV38TFEntUniEnt ;
      AV130Wcwmodifloteds_10_tfentunient_to = AV39TFEntUniEnt_To ;
      AV131Wcwmodifloteds_11_tfentunirem = AV41TFEntUniRem ;
      AV132Wcwmodifloteds_12_tfentunirem_to = AV42TFEntUniRem_To ;
      AV133Wcwmodifloteds_13_tfentpre = AV44TFEntPre ;
      AV134Wcwmodifloteds_14_tfentpre_to = AV45TFEntPre_To ;
      AV135Wcwmodifloteds_15_tfpedcod = AV47TFPedCod ;
      AV136Wcwmodifloteds_16_tfpedcod_to = AV48TFPedCod_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV77FilterFullText, AV59EmprCod, AV65Fec1, AV66Fec2, AV67Prdnum1, AV68Prdnum2, AV69Prvnum, AV64Entcon, AV27ManageFiltersExecutionStep, AV22ColumnsSelector, AV73TFEntFecEnt, AV29TFPrdNum, AV30TFPrdNum_Sel, AV32TFPrdNom, AV33TFPrdNom_Sel, AV35TFEntPrvNum, AV36TFEntPrvNum_To, AV38TFEntUniEnt, AV39TFEntUniEnt_To, AV41TFEntUniRem, AV42TFEntUniRem_To, AV44TFEntPre, AV45TFEntPre_To, AV47TFPedCod, AV48TFPedCod_To, AV138Pgmname, AV12OrderedBy, AV13OrderedDsc, AV54Tintutex, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV121Wcwmodifloteds_1_filterfulltext = AV77FilterFullText ;
      AV122Wcwmodifloteds_2_tfentfecent = AV73TFEntFecEnt ;
      AV123Wcwmodifloteds_3_tfprdnum = AV29TFPrdNum ;
      AV124Wcwmodifloteds_4_tfprdnum_sel = AV30TFPrdNum_Sel ;
      AV125Wcwmodifloteds_5_tfprdnom = AV32TFPrdNom ;
      AV126Wcwmodifloteds_6_tfprdnom_sel = AV33TFPrdNom_Sel ;
      AV127Wcwmodifloteds_7_tfentprvnum = AV35TFEntPrvNum ;
      AV128Wcwmodifloteds_8_tfentprvnum_to = AV36TFEntPrvNum_To ;
      AV129Wcwmodifloteds_9_tfentunient = AV38TFEntUniEnt ;
      AV130Wcwmodifloteds_10_tfentunient_to = AV39TFEntUniEnt_To ;
      AV131Wcwmodifloteds_11_tfentunirem = AV41TFEntUniRem ;
      AV132Wcwmodifloteds_12_tfentunirem_to = AV42TFEntUniRem_To ;
      AV133Wcwmodifloteds_13_tfentpre = AV44TFEntPre ;
      AV134Wcwmodifloteds_14_tfentpre_to = AV45TFEntPre_To ;
      AV135Wcwmodifloteds_15_tfpedcod = AV47TFPedCod ;
      AV136Wcwmodifloteds_16_tfpedcod_to = AV48TFPedCod_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV77FilterFullText, AV59EmprCod, AV65Fec1, AV66Fec2, AV67Prdnum1, AV68Prdnum2, AV69Prvnum, AV64Entcon, AV27ManageFiltersExecutionStep, AV22ColumnsSelector, AV73TFEntFecEnt, AV29TFPrdNum, AV30TFPrdNum_Sel, AV32TFPrdNom, AV33TFPrdNom_Sel, AV35TFEntPrvNum, AV36TFEntPrvNum_To, AV38TFEntUniEnt, AV39TFEntUniEnt_To, AV41TFEntUniRem, AV42TFEntUniRem_To, AV44TFEntPre, AV45TFEntPre_To, AV47TFPedCod, AV48TFPedCod_To, AV138Pgmname, AV12OrderedBy, AV13OrderedDsc, AV54Tintutex, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV138Pgmname = "WCwModifLote" ;
      Gx_err = (short)(0) ;
      edtavPrvnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrvnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrvnom_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strupXR0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e18XR2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV25ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV50DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV22ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_41 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_41"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV52GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV53GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV59EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV59EmprCod") ;
         wcpOAV65Fec1 = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV65Fec1"), 0) ;
         wcpOAV66Fec2 = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV66Fec2"), 0) ;
         wcpOAV67Prdnum1 = httpContext.cgiGet( sPrefix+"wcpOAV67Prdnum1") ;
         wcpOAV68Prdnum2 = httpContext.cgiGet( sPrefix+"wcpOAV68Prdnum2") ;
         wcpOAV69Prvnum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV69Prvnum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV64Entcon = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV64Entcon"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedcolumn") ;
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Activeeventkey") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         /* Read variables values. */
         AV77FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77FilterFullText", AV77FilterFullText);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_entfecentauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_ENTFECENTAUXDATE");
            GX_FocusControl = edtavDdo_entfecentauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV75DDO_EntFecEntAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75DDO_EntFecEntAuxDate", localUtil.format(AV75DDO_EntFecEntAuxDate, "99/99/99"));
         }
         else
         {
            AV75DDO_EntFecEntAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_entfecentauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75DDO_EntFecEntAuxDate", localUtil.format(AV75DDO_EntFecEntAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV77FilterFullText) != 0 )
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
      e18XR2 ();
      if (returnInSub) return;
   }

   public void e18XR2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV63Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wcwmodiflote_impl.this.GXt_char1 = GXv_char2[0] ;
      AV63Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63Station", AV63Station);
      GXv_char2[0] = AV59EmprCod ;
      GXv_char3[0] = AV71EmprNom ;
      GXv_char4[0] = AV62UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV63Station, GXv_char2, GXv_char3, GXv_char4) ;
      wcwmodiflote_impl.this.AV59EmprCod = GXv_char2[0] ;
      wcwmodiflote_impl.this.AV71EmprNom = GXv_char3[0] ;
      wcwmodiflote_impl.this.AV62UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59EmprCod", AV59EmprCod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62UsurCod", AV62UsurCod);
      GXt_int5 = (byte)(AV57UpdLote) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV59EmprCod, httpContext.getMessage( "UPDLOT", ""), GXv_int6) ;
      wcwmodiflote_impl.this.GXt_int5 = GXv_int6[0] ;
      AV57UpdLote = GXt_int5 ;
      GXt_int5 = (byte)(AV58Nalbaran20) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV59EmprCod, httpContext.getMessage( "ALBA20", ""), GXv_int6) ;
      wcwmodiflote_impl.this.GXt_int5 = GXv_int6[0] ;
      AV58Nalbaran20 = GXt_int5 ;
      GXt_int5 = (byte)(AV54Tintutex) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV59EmprCod, httpContext.getMessage( "TINTUT", ""), GXv_int6) ;
      wcwmodiflote_impl.this.GXt_int5 = GXv_int6[0] ;
      AV54Tintutex = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54Tintutex", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54Tintutex), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTINTUTEX", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV54Tintutex), "ZZZ9")));
      GXt_char1 = AV63Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      wcwmodiflote_impl.this.GXt_char1 = GXv_char4[0] ;
      AV63Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63Station", AV63Station);
      GXv_char4[0] = AV59EmprCod ;
      GXv_char3[0] = AV71EmprNom ;
      GXv_char2[0] = AV62UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV63Station, GXv_char4, GXv_char3, GXv_char2) ;
      wcwmodiflote_impl.this.AV59EmprCod = GXv_char4[0] ;
      wcwmodiflote_impl.this.AV71EmprNom = GXv_char3[0] ;
      wcwmodiflote_impl.this.AV62UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59EmprCod", AV59EmprCod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62UsurCod", AV62UsurCod);
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = AV50DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] ;
      AV50DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e19XR2( )
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
      if ( AV27ManageFiltersExecutionStep == 1 )
      {
         AV27ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27ManageFiltersExecutionStep", GXutil.str( AV27ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV27ManageFiltersExecutionStep == 2 )
      {
         AV27ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27ManageFiltersExecutionStep", GXutil.str( AV27ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV24Session.getValue("WCwModifLoteColumnsSelector"), "") != 0 )
      {
         AV20ColumnsSelectorXML = AV24Session.getValue("WCwModifLoteColumnsSelector") ;
         AV22ColumnsSelector.fromxml(AV20ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtEntFecEnt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEntFecEnt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntFecEnt_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtPrdNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtPrdNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtEntPrvNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEntPrvNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntPrvNum_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavPrvnom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrvnom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrvnom_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtEntUniEnt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEntUniEnt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntUniEnt_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtEntUniRem_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEntUniRem_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntUniRem_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtEntPre_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEntPre_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntPre_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavEntnalbar_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEntnalbar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEntnalbar_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavEntlotn_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEntlotn_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEntlotn_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtPedCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPedCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedCod_Visible), 5, 0), !bGXsfl_41_Refreshing);
      AV52GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52GridCurrentPage), 10, 0));
      AV53GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53GridPageCount), 10, 0));
      AV121Wcwmodifloteds_1_filterfulltext = AV77FilterFullText ;
      AV122Wcwmodifloteds_2_tfentfecent = AV73TFEntFecEnt ;
      AV123Wcwmodifloteds_3_tfprdnum = AV29TFPrdNum ;
      AV124Wcwmodifloteds_4_tfprdnum_sel = AV30TFPrdNum_Sel ;
      AV125Wcwmodifloteds_5_tfprdnom = AV32TFPrdNom ;
      AV126Wcwmodifloteds_6_tfprdnom_sel = AV33TFPrdNom_Sel ;
      AV127Wcwmodifloteds_7_tfentprvnum = AV35TFEntPrvNum ;
      AV128Wcwmodifloteds_8_tfentprvnum_to = AV36TFEntPrvNum_To ;
      AV129Wcwmodifloteds_9_tfentunient = AV38TFEntUniEnt ;
      AV130Wcwmodifloteds_10_tfentunient_to = AV39TFEntUniEnt_To ;
      AV131Wcwmodifloteds_11_tfentunirem = AV41TFEntUniRem ;
      AV132Wcwmodifloteds_12_tfentunirem_to = AV42TFEntUniRem_To ;
      AV133Wcwmodifloteds_13_tfentpre = AV44TFEntPre ;
      AV134Wcwmodifloteds_14_tfentpre_to = AV45TFEntPre_To ;
      AV135Wcwmodifloteds_15_tfpedcod = AV47TFPedCod ;
      AV136Wcwmodifloteds_16_tfpedcod_to = AV48TFPedCod_To ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV22ColumnsSelector", AV22ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV25ManageFiltersData", AV25ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e12XR2( )
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
         AV51PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV51PageToGo) ;
      }
   }

   public void e13XR2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e14XR2( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "EntFecEnt") == 0 )
         {
            AV73TFEntFecEnt = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73TFEntFecEnt", localUtil.format(AV73TFEntFecEnt, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNum") == 0 )
         {
            AV29TFPrdNum = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFPrdNum", AV29TFPrdNum);
            AV30TFPrdNum_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFPrdNum_Sel", AV30TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNom") == 0 )
         {
            AV32TFPrdNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFPrdNom", AV32TFPrdNom);
            AV33TFPrdNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFPrdNom_Sel", AV33TFPrdNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "EntPrvNum") == 0 )
         {
            AV35TFEntPrvNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFEntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFEntPrvNum), 6, 0));
            AV36TFEntPrvNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFEntPrvNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFEntPrvNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "EntUniEnt") == 0 )
         {
            AV38TFEntUniEnt = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFEntUniEnt", GXutil.ltrimstr( AV38TFEntUniEnt, 9, 2));
            AV39TFEntUniEnt_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFEntUniEnt_To", GXutil.ltrimstr( AV39TFEntUniEnt_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "EntUniRem") == 0 )
         {
            AV41TFEntUniRem = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFEntUniRem", GXutil.ltrimstr( AV41TFEntUniRem, 11, 4));
            AV42TFEntUniRem_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFEntUniRem_To", GXutil.ltrimstr( AV42TFEntUniRem_To, 11, 4));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "EntPre") == 0 )
         {
            AV44TFEntPre = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFEntPre", GXutil.ltrimstr( AV44TFEntPre, 14, 5));
            AV45TFEntPre_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFEntPre_To", GXutil.ltrimstr( AV45TFEntPre_To, 14, 5));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PedCod") == 0 )
         {
            AV47TFPedCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFPedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFPedCod), 8, 0));
            AV48TFPedCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFPedCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFPedCod_To), 8, 0));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e20XR2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      edtavConfirmar_gximage = "ActionUpdate" ;
      AV70Confirmar = context.getHttpContext().getImagePath( "7c63c2b9-483e-4035-b512-febf9186a274", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavConfirmar_Internalname, AV70Confirmar);
      AV137Confirmar_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "7c63c2b9-483e-4035-b512-febf9186a274", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      edtavConfirmar_Tooltiptext = "" ;
      GXt_char1 = AV15PrvNom ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int10[0] = A6156EntPrvNum ;
      GXv_char3[0] = GXt_char1 ;
      new app.pprvnom(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_char3) ;
      wcwmodiflote_impl.this.A396EmprCod = GXv_char4[0] ;
      wcwmodiflote_impl.this.A6156EntPrvNum = GXv_int10[0] ;
      wcwmodiflote_impl.this.GXt_char1 = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      AV15PrvNom = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPrvnom_Internalname, AV15PrvNom);
      AV16EntNAlbar = A12857EntNAlbar ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavEntnalbar_Internalname, AV16EntNAlbar);
      edtavEntnalbar_Backcolor = GXutil.getColor( 0, 0, 255) ;
      edtavEntnalbar_Forecolor = GXutil.getColor( 255, 255, 255) ;
      AV17EntLotN = A5686EntLotN ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavEntlotn_Internalname, AV17EntLotN);
      edtavEntlotn_Backcolor = GXutil.getColor( 0, 0, 255) ;
      edtavEntlotn_Forecolor = GXutil.getColor( 255, 255, 255) ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(41) ;
      }
      sendrow_412( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_41_Refreshing )
      {
         httpContext.doAjaxLoad(41, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e15XR2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV20ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV22ColumnsSelector.fromJSonString(AV20ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "WCwModifLoteColumnsSelector", ((GXutil.strcmp("", AV20ColumnsSelectorXML)==0) ? "" : AV22ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV22ColumnsSelector", AV22ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV25ManageFiltersData", AV25ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e11XR2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("WCwModifLoteFilters")),GXutil.URLEncode(GXutil.rtrim(AV138Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV27ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27ManageFiltersExecutionStep", GXutil.str( AV27ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("WCwModifLoteFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV27ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27ManageFiltersExecutionStep", GXutil.str( AV27ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV26ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "WCwModifLoteFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         wcwmodiflote_impl.this.GXt_char1 = GXv_char4[0] ;
         AV26ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV26ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV138Pgmname+"GridState", AV26ManageFiltersXml) ;
            AV10GridState.fromxml(AV26ManageFiltersXml, null, null);
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
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV22ColumnsSelector", AV22ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV25ManageFiltersData", AV25ManageFiltersData);
   }

   public void e16XR2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV18ExcelFilename ;
      GXv_char3[0] = AV19ErrorMessage ;
      new app.wcwmodifloteexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      wcwmodiflote_impl.this.AV18ExcelFilename = GXv_char4[0] ;
      wcwmodiflote_impl.this.AV19ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV18ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV18ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV19ErrorMessage);
      }
   }

   public void e17XR2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.wcwmodifloteexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
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
      AV22ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector11[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "EntFecEnt", "", "Fecha", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "PrdNum", "", "Producto", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "PrdNom", "", "Descripcion", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "EntPrvNum", "", "Proveedor", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "&PrvNom", "", "Nombre", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "EntUniEnt", "", "Cant Ent", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "EntUniRem", "", "Cant Disp", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "EntPre", "", "Precio", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "&EntNAlbar", "", "Nº Doc", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "&EntLotN", "", "Lote", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "PedCod", "", "Nº Pedido", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXt_char1 = AV21UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCwModifLoteColumnsSelector", GXv_char4) ;
      wcwmodiflote_impl.this.GXt_char1 = GXv_char4[0] ;
      AV21UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV21UserCustomValue)==0) ) )
      {
         AV23ColumnsSelectorAux.fromxml(AV21UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector11[0] = AV23ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector12[0] = AV22ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, GXv_SdtWWPColumnsSelector12) ;
         AV23ColumnsSelectorAux = GXv_SdtWWPColumnsSelector11[0] ;
         AV22ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item13 = AV25ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item14[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item13 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "WCwModifLoteFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item14) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item13 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item14[0] ;
      AV25ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item13 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV77FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77FilterFullText", AV77FilterFullText);
      AV73TFEntFecEnt = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73TFEntFecEnt", localUtil.format(AV73TFEntFecEnt, "99/99/99"));
      AV29TFPrdNum = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFPrdNum", AV29TFPrdNum);
      AV30TFPrdNum_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFPrdNum_Sel", AV30TFPrdNum_Sel);
      AV32TFPrdNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFPrdNom", AV32TFPrdNom);
      AV33TFPrdNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFPrdNom_Sel", AV33TFPrdNom_Sel);
      AV35TFEntPrvNum = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFEntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFEntPrvNum), 6, 0));
      AV36TFEntPrvNum_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFEntPrvNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFEntPrvNum_To), 6, 0));
      AV38TFEntUniEnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFEntUniEnt", GXutil.ltrimstr( AV38TFEntUniEnt, 9, 2));
      AV39TFEntUniEnt_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFEntUniEnt_To", GXutil.ltrimstr( AV39TFEntUniEnt_To, 9, 2));
      AV41TFEntUniRem = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFEntUniRem", GXutil.ltrimstr( AV41TFEntUniRem, 11, 4));
      AV42TFEntUniRem_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFEntUniRem_To", GXutil.ltrimstr( AV42TFEntUniRem_To, 11, 4));
      AV44TFEntPre = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFEntPre", GXutil.ltrimstr( AV44TFEntPre, 14, 5));
      AV45TFEntPre_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFEntPre_To", GXutil.ltrimstr( AV45TFEntPre_To, 14, 5));
      AV47TFPedCod = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFPedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFPedCod), 8, 0));
      AV48TFPedCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFPedCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFPedCod_To), 8, 0));
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
      if ( GXutil.strcmp(AV24Session.getValue(AV138Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV138Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV24Session.getValue(AV138Pgmname+"GridState"), null, null);
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
      AV139GXV1 = 1 ;
      while ( AV139GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV139GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV77FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77FilterFullText", AV77FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTFECENT") == 0 )
         {
            AV73TFEntFecEnt = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73TFEntFecEnt", localUtil.format(AV73TFEntFecEnt, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV29TFPrdNum = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFPrdNum", AV29TFPrdNum);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV30TFPrdNum_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFPrdNum_Sel", AV30TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV32TFPrdNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFPrdNom", AV32TFPrdNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV33TFPrdNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFPrdNom_Sel", AV33TFPrdNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTPRVNUM") == 0 )
         {
            AV35TFEntPrvNum = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFEntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFEntPrvNum), 6, 0));
            AV36TFEntPrvNum_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFEntPrvNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFEntPrvNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTUNIENT") == 0 )
         {
            AV38TFEntUniEnt = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFEntUniEnt", GXutil.ltrimstr( AV38TFEntUniEnt, 9, 2));
            AV39TFEntUniEnt_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFEntUniEnt_To", GXutil.ltrimstr( AV39TFEntUniEnt_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTUNIREM") == 0 )
         {
            AV41TFEntUniRem = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFEntUniRem", GXutil.ltrimstr( AV41TFEntUniRem, 11, 4));
            AV42TFEntUniRem_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFEntUniRem_To", GXutil.ltrimstr( AV42TFEntUniRem_To, 11, 4));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTPRE") == 0 )
         {
            AV44TFEntPre = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFEntPre", GXutil.ltrimstr( AV44TFEntPre, 14, 5));
            AV45TFEntPre_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFEntPre_To", GXutil.ltrimstr( AV45TFEntPre_To, 14, 5));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDCOD") == 0 )
         {
            AV47TFPedCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFPedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFPedCod), 8, 0));
            AV48TFPedCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFPedCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFPedCod_To), 8, 0));
         }
         AV139GXV1 = (int)(AV139GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV30TFPrdNum_Sel)==0), AV30TFPrdNum_Sel, GXv_char4) ;
      wcwmodiflote_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char15 = "" ;
      GXv_char3[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV33TFPrdNom_Sel)==0), AV33TFPrdNom_Sel, GXv_char3) ;
      wcwmodiflote_impl.this.GXt_char15 = GXv_char3[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|"+GXt_char15+"||||||||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char15 = "" ;
      GXv_char4[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV29TFPrdNum)==0), AV29TFPrdNum, GXv_char4) ;
      wcwmodiflote_impl.this.GXt_char15 = GXv_char4[0] ;
      GXt_char1 = "" ;
      GXv_char3[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV32TFPrdNom)==0), AV32TFPrdNom, GXv_char3) ;
      wcwmodiflote_impl.this.GXt_char1 = GXv_char3[0] ;
      Ddo_grid_Filteredtext_set = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV73TFEntFecEnt)) ? "" : localUtil.dtoc( AV73TFEntFecEnt, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char15+"|"+GXt_char1+"|"+((0==AV35TFEntPrvNum) ? "" : GXutil.str( AV35TFEntPrvNum, 6, 0))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV38TFEntUniEnt)==0) ? "" : GXutil.str( AV38TFEntUniEnt, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFEntUniRem)==0) ? "" : GXutil.str( AV41TFEntUniRem, 11, 4))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV44TFEntPre)==0) ? "" : GXutil.str( AV44TFEntPre, 14, 5))+"|||"+((0==AV47TFPedCod) ? "" : GXutil.str( AV47TFPedCod, 8, 0)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|||"+((0==AV36TFEntPrvNum_To) ? "" : GXutil.str( AV36TFEntPrvNum_To, 6, 0))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFEntUniEnt_To)==0) ? "" : GXutil.str( AV39TFEntUniEnt_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFEntUniRem_To)==0) ? "" : GXutil.str( AV42TFEntUniRem_To, 11, 4))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV45TFEntPre_To)==0) ? "" : GXutil.str( AV45TFEntPre_To, 14, 5))+"|||"+((0==AV48TFPedCod_To) ? "" : GXutil.str( AV48TFPedCod_To, 8, 0)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV24Session.getValue(AV138Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV77FilterFullText)==0), (short)(0), AV77FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFENTFECENT", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV73TFEntFecEnt)), (short)(0), GXutil.trim( localUtil.dtoc( AV73TFEntFecEnt, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFPRDNUM", "", !(GXutil.strcmp("", AV29TFPrdNum)==0), (short)(0), AV29TFPrdNum, "", !(GXutil.strcmp("", AV30TFPrdNum_Sel)==0), AV30TFPrdNum_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFPRDNOM", "", !(GXutil.strcmp("", AV32TFPrdNom)==0), (short)(0), AV32TFPrdNom, "", !(GXutil.strcmp("", AV33TFPrdNom_Sel)==0), AV33TFPrdNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFENTPRVNUM", "", !((0==AV35TFEntPrvNum)&&(0==AV36TFEntPrvNum_To)), (short)(0), GXutil.trim( GXutil.str( AV35TFEntPrvNum, 6, 0)), GXutil.trim( GXutil.str( AV36TFEntPrvNum_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFENTUNIENT", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV38TFEntUniEnt)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFEntUniEnt_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV38TFEntUniEnt, 9, 2)), GXutil.trim( GXutil.str( AV39TFEntUniEnt_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFENTUNIREM", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFEntUniRem)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFEntUniRem_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV41TFEntUniRem, 11, 4)), GXutil.trim( GXutil.str( AV42TFEntUniRem_To, 11, 4))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFENTPRE", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV44TFEntPre)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV45TFEntPre_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV44TFEntPre, 14, 5)), GXutil.trim( GXutil.str( AV45TFEntPre_To, 14, 5))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFPEDCOD", "", !((0==AV47TFPedCod)&&(0==AV48TFPedCod_To)), (short)(0), GXutil.trim( GXutil.str( AV47TFPedCod, 8, 0)), GXutil.trim( GXutil.str( AV48TFPedCod_To, 8, 0))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      if ( ! (GXutil.strcmp("", AV59EmprCod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV59EmprCod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV65Fec1)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FEC1" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV65Fec1, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV66Fec2)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FEC2" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV66Fec2, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV67Prdnum1)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PRDNUM1" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV67Prdnum1 );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV68Prdnum2)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PRDNUM2" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV68Prdnum2 );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV69Prvnum) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PRVNUM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV69Prvnum, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV64Entcon) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ENTCON" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV64Entcon, 1, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV138Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV138Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "ENTALM" );
      AV24Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void e21XR2( )
   {
      /* Confirmar_Click Routine */
      returnInSub = false ;
      if ( ( AV54Tintutex == 1 ) && (GXutil.strcmp("", AV16EntNAlbar)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta Documento", ""));
         GX_FocusControl = edtavEntnalbar_Internalname ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         if ( ( AV54Tintutex == 1 ) && (GXutil.strcmp("", AV17EntLotN)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta LOTE", ""));
            GX_FocusControl = edtavEntlotn_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            GXv_char4[0] = AV59EmprCod ;
            GXv_char3[0] = A719PrdNum ;
            GXv_int17[0] = A597LinEnt ;
            GXv_char2[0] = AV17EntLotN ;
            GXv_char18[0] = AV16EntNAlbar ;
            GXv_char19[0] = AV62UsurCod ;
            GXv_char20[0] = AV63Station ;
            new app.ploteupd(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int17, GXv_char2, GXv_char18, GXv_char19, GXv_char20) ;
            wcwmodiflote_impl.this.AV59EmprCod = GXv_char4[0] ;
            wcwmodiflote_impl.this.A719PrdNum = GXv_char3[0] ;
            wcwmodiflote_impl.this.A597LinEnt = GXv_int17[0] ;
            wcwmodiflote_impl.this.AV17EntLotN = GXv_char2[0] ;
            wcwmodiflote_impl.this.AV16EntNAlbar = GXv_char18[0] ;
            wcwmodiflote_impl.this.AV62UsurCod = GXv_char19[0] ;
            wcwmodiflote_impl.this.AV63Station = GXv_char20[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59EmprCod", AV59EmprCod);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavEntlotn_Internalname, AV17EntLotN);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavEntnalbar_Internalname, AV16EntNAlbar);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62UsurCod", AV62UsurCod);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63Station", AV63Station);
            gxgrgrid_refresh( subGrid_Rows, AV77FilterFullText, AV59EmprCod, AV65Fec1, AV66Fec2, AV67Prdnum1, AV68Prdnum2, AV69Prvnum, AV64Entcon, AV27ManageFiltersExecutionStep, AV22ColumnsSelector, AV73TFEntFecEnt, AV29TFPrdNum, AV30TFPrdNum_Sel, AV32TFPrdNom, AV33TFPrdNom_Sel, AV35TFEntPrvNum, AV36TFEntPrvNum_To, AV38TFEntUniEnt, AV39TFEntUniEnt_To, AV41TFEntUniRem, AV42TFEntUniRem_To, AV44TFEntPre, AV45TFEntPre_To, AV47TFPedCod, AV48TFPedCod_To, AV138Pgmname, AV12OrderedBy, AV13OrderedDsc, AV54Tintutex, sPrefix) ;
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV22ColumnsSelector", AV22ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV25ManageFiltersData", AV25ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void wb_table1_23_XR2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV25ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_28_XR2( true) ;
      }
      else
      {
         wb_table2_28_XR2( false) ;
      }
      return  ;
   }

   public void wb_table2_28_XR2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_23_XR2e( true) ;
      }
      else
      {
         wb_table1_23_XR2e( false) ;
      }
   }

   public void wb_table2_28_XR2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'" + sPrefix + "',false,'" + sGXsfl_41_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV77FilterFullText, GXutil.rtrim( localUtil.format( AV77FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_WCwModifLote.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_28_XR2e( true) ;
      }
      else
      {
         wb_table2_28_XR2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV59EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59EmprCod", AV59EmprCod);
      AV65Fec1 = (java.util.Date)getParm(obj,1,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65Fec1", localUtil.format(AV65Fec1, "99/99/99"));
      AV66Fec2 = (java.util.Date)getParm(obj,2,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66Fec2", localUtil.format(AV66Fec2, "99/99/99"));
      AV67Prdnum1 = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67Prdnum1", AV67Prdnum1);
      AV68Prdnum2 = (String)getParm(obj,4,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68Prdnum2", AV68Prdnum2);
      AV69Prvnum = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69Prvnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69Prvnum), 6, 0));
      AV64Entcon = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64Entcon", GXutil.str( AV64Entcon, 1, 0));
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
      paXR2( ) ;
      wsXR2( ) ;
      weXR2( ) ;
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
      sCtrlAV59EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV65Fec1 = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV66Fec2 = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV67Prdnum1 = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV68Prdnum2 = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV69Prvnum = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV64Entcon = (String)getParm(obj,6,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      paXR2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "wcwmodiflote", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      paXR2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV59EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59EmprCod", AV59EmprCod);
         AV65Fec1 = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65Fec1", localUtil.format(AV65Fec1, "99/99/99"));
         AV66Fec2 = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66Fec2", localUtil.format(AV66Fec2, "99/99/99"));
         AV67Prdnum1 = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67Prdnum1", AV67Prdnum1);
         AV68Prdnum2 = (String)getParm(obj,6,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68Prdnum2", AV68Prdnum2);
         AV69Prvnum = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69Prvnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69Prvnum), 6, 0));
         AV64Entcon = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64Entcon", GXutil.str( AV64Entcon, 1, 0));
      }
      wcpOAV59EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV59EmprCod") ;
      wcpOAV65Fec1 = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV65Fec1"), 0) ;
      wcpOAV66Fec2 = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV66Fec2"), 0) ;
      wcpOAV67Prdnum1 = httpContext.cgiGet( sPrefix+"wcpOAV67Prdnum1") ;
      wcpOAV68Prdnum2 = httpContext.cgiGet( sPrefix+"wcpOAV68Prdnum2") ;
      wcpOAV69Prvnum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV69Prvnum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV64Entcon = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV64Entcon"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV59EmprCod, wcpOAV59EmprCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV65Fec1), GXutil.resetTime(wcpOAV65Fec1)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV66Fec2), GXutil.resetTime(wcpOAV66Fec2)) ) || ( GXutil.strcmp(AV67Prdnum1, wcpOAV67Prdnum1) != 0 ) || ( GXutil.strcmp(AV68Prdnum2, wcpOAV68Prdnum2) != 0 ) || ( AV69Prvnum != wcpOAV69Prvnum ) || ( AV64Entcon != wcpOAV64Entcon ) ) )
      {
         setjustcreated();
      }
      wcpOAV59EmprCod = AV59EmprCod ;
      wcpOAV65Fec1 = AV65Fec1 ;
      wcpOAV66Fec2 = AV66Fec2 ;
      wcpOAV67Prdnum1 = AV67Prdnum1 ;
      wcpOAV68Prdnum2 = AV68Prdnum2 ;
      wcpOAV69Prvnum = AV69Prvnum ;
      wcpOAV64Entcon = AV64Entcon ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV59EmprCod = httpContext.cgiGet( sPrefix+"AV59EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV59EmprCod) > 0 )
      {
         AV59EmprCod = httpContext.cgiGet( sCtrlAV59EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59EmprCod", AV59EmprCod);
      }
      else
      {
         AV59EmprCod = httpContext.cgiGet( sPrefix+"AV59EmprCod_PARM") ;
      }
      sCtrlAV65Fec1 = httpContext.cgiGet( sPrefix+"AV65Fec1_CTRL") ;
      if ( GXutil.len( sCtrlAV65Fec1) > 0 )
      {
         AV65Fec1 = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV65Fec1), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65Fec1", localUtil.format(AV65Fec1, "99/99/99"));
      }
      else
      {
         AV65Fec1 = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV65Fec1_PARM"), 0) ;
      }
      sCtrlAV66Fec2 = httpContext.cgiGet( sPrefix+"AV66Fec2_CTRL") ;
      if ( GXutil.len( sCtrlAV66Fec2) > 0 )
      {
         AV66Fec2 = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV66Fec2), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66Fec2", localUtil.format(AV66Fec2, "99/99/99"));
      }
      else
      {
         AV66Fec2 = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV66Fec2_PARM"), 0) ;
      }
      sCtrlAV67Prdnum1 = httpContext.cgiGet( sPrefix+"AV67Prdnum1_CTRL") ;
      if ( GXutil.len( sCtrlAV67Prdnum1) > 0 )
      {
         AV67Prdnum1 = httpContext.cgiGet( sCtrlAV67Prdnum1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67Prdnum1", AV67Prdnum1);
      }
      else
      {
         AV67Prdnum1 = httpContext.cgiGet( sPrefix+"AV67Prdnum1_PARM") ;
      }
      sCtrlAV68Prdnum2 = httpContext.cgiGet( sPrefix+"AV68Prdnum2_CTRL") ;
      if ( GXutil.len( sCtrlAV68Prdnum2) > 0 )
      {
         AV68Prdnum2 = httpContext.cgiGet( sCtrlAV68Prdnum2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68Prdnum2", AV68Prdnum2);
      }
      else
      {
         AV68Prdnum2 = httpContext.cgiGet( sPrefix+"AV68Prdnum2_PARM") ;
      }
      sCtrlAV69Prvnum = httpContext.cgiGet( sPrefix+"AV69Prvnum_CTRL") ;
      if ( GXutil.len( sCtrlAV69Prvnum) > 0 )
      {
         AV69Prvnum = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV69Prvnum), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69Prvnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69Prvnum), 6, 0));
      }
      else
      {
         AV69Prvnum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV69Prvnum_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV64Entcon = httpContext.cgiGet( sPrefix+"AV64Entcon_CTRL") ;
      if ( GXutil.len( sCtrlAV64Entcon) > 0 )
      {
         AV64Entcon = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV64Entcon), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64Entcon", GXutil.str( AV64Entcon, 1, 0));
      }
      else
      {
         AV64Entcon = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV64Entcon_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      paXR2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      wsXR2( ) ;
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
      wsXR2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV59EmprCod_PARM", GXutil.rtrim( AV59EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV59EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV59EmprCod_CTRL", GXutil.rtrim( sCtrlAV59EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV65Fec1_PARM", localUtil.dtoc( AV65Fec1, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV65Fec1)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV65Fec1_CTRL", GXutil.rtrim( sCtrlAV65Fec1));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV66Fec2_PARM", localUtil.dtoc( AV66Fec2, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV66Fec2)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV66Fec2_CTRL", GXutil.rtrim( sCtrlAV66Fec2));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV67Prdnum1_PARM", GXutil.rtrim( AV67Prdnum1));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV67Prdnum1)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV67Prdnum1_CTRL", GXutil.rtrim( sCtrlAV67Prdnum1));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV68Prdnum2_PARM", GXutil.rtrim( AV68Prdnum2));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV68Prdnum2)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV68Prdnum2_CTRL", GXutil.rtrim( sCtrlAV68Prdnum2));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV69Prvnum_PARM", GXutil.ltrim( localUtil.ntoc( AV69Prvnum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV69Prvnum)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV69Prvnum_CTRL", GXutil.rtrim( sCtrlAV69Prvnum));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV64Entcon_PARM", GXutil.ltrim( localUtil.ntoc( AV64Entcon, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV64Entcon)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV64Entcon_CTRL", GXutil.rtrim( sCtrlAV64Entcon));
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
      weXR2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115564688", true, true);
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
      httpContext.AddJavascriptSource("wcwmodiflote.js", "?202682115564689", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_412( )
   {
      edtavConfirmar_Internalname = sPrefix+"vCONFIRMAR_"+sGXsfl_41_idx ;
      edtEntFecEnt_Internalname = sPrefix+"ENTFECENT_"+sGXsfl_41_idx ;
      edtPrdNum_Internalname = sPrefix+"PRDNUM_"+sGXsfl_41_idx ;
      edtPrdNom_Internalname = sPrefix+"PRDNOM_"+sGXsfl_41_idx ;
      edtEntPrvNum_Internalname = sPrefix+"ENTPRVNUM_"+sGXsfl_41_idx ;
      edtavPrvnom_Internalname = sPrefix+"vPRVNOM_"+sGXsfl_41_idx ;
      edtEntUniEnt_Internalname = sPrefix+"ENTUNIENT_"+sGXsfl_41_idx ;
      edtEntUniRem_Internalname = sPrefix+"ENTUNIREM_"+sGXsfl_41_idx ;
      edtEntPre_Internalname = sPrefix+"ENTPRE_"+sGXsfl_41_idx ;
      edtavEntnalbar_Internalname = sPrefix+"vENTNALBAR_"+sGXsfl_41_idx ;
      edtavEntlotn_Internalname = sPrefix+"vENTLOTN_"+sGXsfl_41_idx ;
      edtPedCod_Internalname = sPrefix+"PEDCOD_"+sGXsfl_41_idx ;
      edtLinEnt_Internalname = sPrefix+"LINENT_"+sGXsfl_41_idx ;
   }

   public void subsflControlProps_fel_412( )
   {
      edtavConfirmar_Internalname = sPrefix+"vCONFIRMAR_"+sGXsfl_41_fel_idx ;
      edtEntFecEnt_Internalname = sPrefix+"ENTFECENT_"+sGXsfl_41_fel_idx ;
      edtPrdNum_Internalname = sPrefix+"PRDNUM_"+sGXsfl_41_fel_idx ;
      edtPrdNom_Internalname = sPrefix+"PRDNOM_"+sGXsfl_41_fel_idx ;
      edtEntPrvNum_Internalname = sPrefix+"ENTPRVNUM_"+sGXsfl_41_fel_idx ;
      edtavPrvnom_Internalname = sPrefix+"vPRVNOM_"+sGXsfl_41_fel_idx ;
      edtEntUniEnt_Internalname = sPrefix+"ENTUNIENT_"+sGXsfl_41_fel_idx ;
      edtEntUniRem_Internalname = sPrefix+"ENTUNIREM_"+sGXsfl_41_fel_idx ;
      edtEntPre_Internalname = sPrefix+"ENTPRE_"+sGXsfl_41_fel_idx ;
      edtavEntnalbar_Internalname = sPrefix+"vENTNALBAR_"+sGXsfl_41_fel_idx ;
      edtavEntlotn_Internalname = sPrefix+"vENTLOTN_"+sGXsfl_41_fel_idx ;
      edtPedCod_Internalname = sPrefix+"PEDCOD_"+sGXsfl_41_fel_idx ;
      edtLinEnt_Internalname = sPrefix+"LINENT_"+sGXsfl_41_fel_idx ;
   }

   public void sendrow_412( )
   {
      subsflControlProps_412( ) ;
      wbXR0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_41_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_41_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_41_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Active Bitmap Variable */
         TempTags = " " + ((edtavConfirmar_Enabled!=0)&&(edtavConfirmar_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 42,'"+sPrefix+"',false,'',41)\"" : " ") ;
         ClassString = "ActionBaseColorAttribute" + " " + ((GXutil.strcmp(edtavConfirmar_gximage, "")==0) ? "" : "GX_Image_"+edtavConfirmar_gximage+"_Class") ;
         StyleString = "" ;
         AV70Confirmar_IsBlob = (boolean)(((GXutil.strcmp("", AV70Confirmar)==0)&&(GXutil.strcmp("", AV137Confirmar_GXI)==0))||!(GXutil.strcmp("", AV70Confirmar)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV70Confirmar)==0) ? AV137Confirmar_GXI : httpContext.getResourceRelative(AV70Confirmar)) ;
         GridRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavConfirmar_Internalname,sImgUrl,"","","",context.getHttpContext().getTheme( ),Integer.valueOf(-1),Integer.valueOf(1),"",edtavConfirmar_Tooltiptext,Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),"px",Integer.valueOf(0),"px",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(5),edtavConfirmar_Jsonclick,"'"+sPrefix+"'"+",false,"+"'"+sPrefix+"EVCONFIRMAR.CLICK."+sGXsfl_41_idx+"'",StyleString,ClassString,"WWActionColumn","","","",""+TempTags,"","",Integer.valueOf(1),Boolean.valueOf(AV70Confirmar_IsBlob),Boolean.valueOf(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtEntFecEnt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEntFecEnt_Internalname,localUtil.format(A415EntFecEnt, "99/99/99"),localUtil.format( A415EntFecEnt, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtEntFecEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtEntFecEnt_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNom_Internalname,GXutil.rtrim( A718PrdNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtEntPrvNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEntPrvNum_Internalname,GXutil.ltrim( localUtil.ntoc( A6156EntPrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6156EntPrvNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtEntPrvNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtEntPrvNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavPrvnom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavPrvnom_Enabled!=0)&&(edtavPrvnom_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 47,'"+sPrefix+"',false,'"+sGXsfl_41_idx+"',41)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrvnom_Internalname,GXutil.rtrim( AV15PrvNom),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavPrvnom_Enabled!=0)&&(edtavPrvnom_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,47);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPrvnom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPrvnom_Visible),Integer.valueOf(edtavPrvnom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtEntUniEnt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEntUniEnt_Internalname,GXutil.ltrim( localUtil.ntoc( A418EntUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A418EntUniEnt, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtEntUniEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtEntUniEnt_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtEntUniRem_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEntUniRem_Internalname,GXutil.ltrim( localUtil.ntoc( A419EntUniRem, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A419EntUniRem, "ZZZZZ9.9999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtEntUniRem_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtEntUniRem_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtEntPre_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEntPre_Internalname,GXutil.ltrim( localUtil.ntoc( A417EntPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A417EntPre, "ZZZZZZZ9.999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtEntPre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtEntPre_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavEntnalbar_Visible==0) ? "display:none;" : "")+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavEntnalbar_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavEntnalbar_Enabled!=0)&&(edtavEntnalbar_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 51,'"+sPrefix+"',false,'"+sGXsfl_41_idx+"',41)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEntnalbar_Internalname,GXutil.rtrim( AV16EntNAlbar),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavEntnalbar_Enabled!=0)&&(edtavEntnalbar_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,51);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavEntnalbar_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavEntnalbar_Forecolor)+";"+((edtavEntnalbar_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavEntnalbar_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(edtavEntnalbar_Visible),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavEntlotn_Visible==0) ? "display:none;" : "")+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavEntlotn_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavEntlotn_Enabled!=0)&&(edtavEntlotn_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 52,'"+sPrefix+"',false,'"+sGXsfl_41_idx+"',41)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEntlotn_Internalname,GXutil.rtrim( AV17EntLotN),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavEntlotn_Enabled!=0)&&(edtavEntlotn_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,52);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavEntlotn_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavEntlotn_Forecolor)+";"+((edtavEntlotn_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavEntlotn_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(edtavEntlotn_Visible),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPedCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPedCod_Internalname,GXutil.ltrim( localUtil.ntoc( A658PedCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A658PedCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPedCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPedCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLinEnt_Internalname,GXutil.ltrim( localUtil.ntoc( A597LinEnt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A597LinEnt), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLinEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashesXR2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_41_idx = ((subGrid_Islastpage==1)&&(nGXsfl_41_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_41_idx+1) ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_412( ) ;
      }
      /* End function sendrow_412 */
   }

   public void startgridcontrol41( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"41\">") ;
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
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ActionBaseColorAttribute"+" "+((GXutil.strcmp(edtavConfirmar_gximage, "")==0) ? "" : "GX_Image_"+edtavConfirmar_gximage+"_Class")+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtEntFecEnt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtEntPrvNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Proveedor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPrvnom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtEntUniEnt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cant Ent", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtEntUniRem_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cant Disp", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtEntPre_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Precio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavEntnalbar_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Doc", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavEntlotn_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Lote", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPedCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Pedido", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", httpContext.convertURL( AV70Confirmar));
         GridColumn.AddObjectProperty("Tooltiptext", GXutil.rtrim( edtavConfirmar_Tooltiptext));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A415EntFecEnt, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtEntFecEnt_Visible, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6156EntPrvNum, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtEntPrvNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV15PrvNom));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrvnom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPrvnom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A418EntUniEnt, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtEntUniEnt_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A419EntUniRem, (byte)(11), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtEntUniRem_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A417EntPre, (byte)(14), (byte)(5), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtEntPre_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV16EntNAlbar));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavEntnalbar_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavEntnalbar_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavEntnalbar_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV17EntLotN));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavEntlotn_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavEntlotn_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavEntlotn_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A658PedCod, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPedCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A597LinEnt, (byte)(4), (byte)(0), ".", "")));
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
      bttBtnexportcsv_Internalname = sPrefix+"BTNEXPORTCSV" ;
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtavConfirmar_Internalname = sPrefix+"vCONFIRMAR" ;
      edtEntFecEnt_Internalname = sPrefix+"ENTFECENT" ;
      edtPrdNum_Internalname = sPrefix+"PRDNUM" ;
      edtPrdNom_Internalname = sPrefix+"PRDNOM" ;
      edtEntPrvNum_Internalname = sPrefix+"ENTPRVNUM" ;
      edtavPrvnom_Internalname = sPrefix+"vPRVNOM" ;
      edtEntUniEnt_Internalname = sPrefix+"ENTUNIENT" ;
      edtEntUniRem_Internalname = sPrefix+"ENTUNIREM" ;
      edtEntPre_Internalname = sPrefix+"ENTPRE" ;
      edtavEntnalbar_Internalname = sPrefix+"vENTNALBAR" ;
      edtavEntlotn_Internalname = sPrefix+"vENTLOTN" ;
      edtPedCod_Internalname = sPrefix+"PEDCOD" ;
      edtLinEnt_Internalname = sPrefix+"LINENT" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      edtavDdo_entfecentauxdate_Internalname = sPrefix+"vDDO_ENTFECENTAUXDATE" ;
      divDdo_entfecentauxdates_Internalname = sPrefix+"DDO_ENTFECENTAUXDATES" ;
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
      edtLinEnt_Jsonclick = "" ;
      edtPedCod_Jsonclick = "" ;
      edtavEntlotn_Jsonclick = "" ;
      edtavEntlotn_Forecolor = (int)(0x000000) ;
      edtavEntlotn_Enabled = 1 ;
      edtavEntlotn_Backcolor = -1 ;
      edtavEntnalbar_Jsonclick = "" ;
      edtavEntnalbar_Forecolor = (int)(0x000000) ;
      edtavEntnalbar_Enabled = 1 ;
      edtavEntnalbar_Backcolor = -1 ;
      edtEntPre_Jsonclick = "" ;
      edtEntUniRem_Jsonclick = "" ;
      edtEntUniEnt_Jsonclick = "" ;
      edtavPrvnom_Jsonclick = "" ;
      edtavPrvnom_Enabled = 1 ;
      edtEntPrvNum_Jsonclick = "" ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNum_Jsonclick = "" ;
      edtEntFecEnt_Jsonclick = "" ;
      edtavConfirmar_Jsonclick = "" ;
      edtavConfirmar_gximage = "" ;
      edtavConfirmar_Visible = -1 ;
      edtavConfirmar_Enabled = 1 ;
      edtavConfirmar_Tooltiptext = "" ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtPedCod_Visible = -1 ;
      edtavEntlotn_Visible = -1 ;
      edtavEntnalbar_Visible = -1 ;
      edtEntPre_Visible = -1 ;
      edtEntUniRem_Visible = -1 ;
      edtEntUniEnt_Visible = -1 ;
      edtavPrvnom_Visible = -1 ;
      edtEntPrvNum_Visible = -1 ;
      edtPrdNom_Visible = -1 ;
      edtPrdNum_Visible = -1 ;
      edtEntFecEnt_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_entfecentauxdate_Jsonclick = "" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "WCwModifLoteGetFilterData" ;
      Ddo_grid_Datalisttype = "|Dynamic|Dynamic||||||||" ;
      Ddo_grid_Includedatalist = "|T|T||||||||" ;
      Ddo_grid_Filterisrange = "|||T||T|T|T|||T" ;
      Ddo_grid_Filtertype = "Date|Character|Character|Numeric||Numeric|Numeric|Numeric|||Numeric" ;
      Ddo_grid_Includefilter = "T|T|T|T||T|T|T|||T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T|T|T||T|T|T|||T" ;
      Ddo_grid_Columnssortvalues = "2|1|3|4||5|6|7|||8" ;
      Ddo_grid_Columnids = "1:EntFecEnt|2:PrdNum|3:PrdNom|4:EntPrvNum|5:PrvNom|6:EntUniEnt|7:EntUniRem|8:EntPre|9:EntNAlbar|10:EntLotN|11:PedCod" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV77FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV59EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV65Fec1',fld:'vFEC1',pic:''},{av:'AV66Fec2',fld:'vFEC2',pic:''},{av:'AV67Prdnum1',fld:'vPRDNUM1',pic:''},{av:'AV68Prdnum2',fld:'vPRDNUM2',pic:''},{av:'AV69Prvnum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV64Entcon',fld:'vENTCON',pic:'9'},{av:'AV73TFEntFecEnt',fld:'vTFENTFECENT',pic:''},{av:'AV29TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV30TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV32TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV33TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV35TFEntPrvNum',fld:'vTFENTPRVNUM',pic:'ZZZZZ9'},{av:'AV36TFEntPrvNum_To',fld:'vTFENTPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV38TFEntUniEnt',fld:'vTFENTUNIENT',pic:'ZZZZZ9.99'},{av:'AV39TFEntUniEnt_To',fld:'vTFENTUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV41TFEntUniRem',fld:'vTFENTUNIREM',pic:'ZZZZZ9.9999'},{av:'AV42TFEntUniRem_To',fld:'vTFENTUNIREM_TO',pic:'ZZZZZ9.9999'},{av:'AV44TFEntPre',fld:'vTFENTPRE',pic:'ZZZZZZZ9.999'},{av:'AV45TFEntPre_To',fld:'vTFENTPRE_TO',pic:'ZZZZZZZ9.999'},{av:'AV47TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV48TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV138Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV54Tintutex',fld:'vTINTUTEX',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtEntFecEnt_Visible',ctrl:'ENTFECENT',prop:'Visible'},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtEntPrvNum_Visible',ctrl:'ENTPRVNUM',prop:'Visible'},{av:'edtavPrvnom_Visible',ctrl:'vPRVNOM',prop:'Visible'},{av:'edtEntUniEnt_Visible',ctrl:'ENTUNIENT',prop:'Visible'},{av:'edtEntUniRem_Visible',ctrl:'ENTUNIREM',prop:'Visible'},{av:'edtEntPre_Visible',ctrl:'ENTPRE',prop:'Visible'},{av:'edtavEntnalbar_Visible',ctrl:'vENTNALBAR',prop:'Visible'},{av:'edtavEntlotn_Visible',ctrl:'vENTLOTN',prop:'Visible'},{av:'edtPedCod_Visible',ctrl:'PEDCOD',prop:'Visible'},{av:'AV52GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV53GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV25ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e12XR2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV77FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV59EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV65Fec1',fld:'vFEC1',pic:''},{av:'AV66Fec2',fld:'vFEC2',pic:''},{av:'AV67Prdnum1',fld:'vPRDNUM1',pic:''},{av:'AV68Prdnum2',fld:'vPRDNUM2',pic:''},{av:'AV69Prvnum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV64Entcon',fld:'vENTCON',pic:'9'},{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV73TFEntFecEnt',fld:'vTFENTFECENT',pic:''},{av:'AV29TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV30TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV32TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV33TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV35TFEntPrvNum',fld:'vTFENTPRVNUM',pic:'ZZZZZ9'},{av:'AV36TFEntPrvNum_To',fld:'vTFENTPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV38TFEntUniEnt',fld:'vTFENTUNIENT',pic:'ZZZZZ9.99'},{av:'AV39TFEntUniEnt_To',fld:'vTFENTUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV41TFEntUniRem',fld:'vTFENTUNIREM',pic:'ZZZZZ9.9999'},{av:'AV42TFEntUniRem_To',fld:'vTFENTUNIREM_TO',pic:'ZZZZZ9.9999'},{av:'AV44TFEntPre',fld:'vTFENTPRE',pic:'ZZZZZZZ9.999'},{av:'AV45TFEntPre_To',fld:'vTFENTPRE_TO',pic:'ZZZZZZZ9.999'},{av:'AV47TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV48TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV138Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV54Tintutex',fld:'vTINTUTEX',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e13XR2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV77FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV59EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV65Fec1',fld:'vFEC1',pic:''},{av:'AV66Fec2',fld:'vFEC2',pic:''},{av:'AV67Prdnum1',fld:'vPRDNUM1',pic:''},{av:'AV68Prdnum2',fld:'vPRDNUM2',pic:''},{av:'AV69Prvnum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV64Entcon',fld:'vENTCON',pic:'9'},{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV73TFEntFecEnt',fld:'vTFENTFECENT',pic:''},{av:'AV29TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV30TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV32TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV33TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV35TFEntPrvNum',fld:'vTFENTPRVNUM',pic:'ZZZZZ9'},{av:'AV36TFEntPrvNum_To',fld:'vTFENTPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV38TFEntUniEnt',fld:'vTFENTUNIENT',pic:'ZZZZZ9.99'},{av:'AV39TFEntUniEnt_To',fld:'vTFENTUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV41TFEntUniRem',fld:'vTFENTUNIREM',pic:'ZZZZZ9.9999'},{av:'AV42TFEntUniRem_To',fld:'vTFENTUNIREM_TO',pic:'ZZZZZ9.9999'},{av:'AV44TFEntPre',fld:'vTFENTPRE',pic:'ZZZZZZZ9.999'},{av:'AV45TFEntPre_To',fld:'vTFENTPRE_TO',pic:'ZZZZZZZ9.999'},{av:'AV47TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV48TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV138Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV54Tintutex',fld:'vTINTUTEX',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e14XR2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV77FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV59EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV65Fec1',fld:'vFEC1',pic:''},{av:'AV66Fec2',fld:'vFEC2',pic:''},{av:'AV67Prdnum1',fld:'vPRDNUM1',pic:''},{av:'AV68Prdnum2',fld:'vPRDNUM2',pic:''},{av:'AV69Prvnum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV64Entcon',fld:'vENTCON',pic:'9'},{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV73TFEntFecEnt',fld:'vTFENTFECENT',pic:''},{av:'AV29TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV30TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV32TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV33TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV35TFEntPrvNum',fld:'vTFENTPRVNUM',pic:'ZZZZZ9'},{av:'AV36TFEntPrvNum_To',fld:'vTFENTPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV38TFEntUniEnt',fld:'vTFENTUNIENT',pic:'ZZZZZ9.99'},{av:'AV39TFEntUniEnt_To',fld:'vTFENTUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV41TFEntUniRem',fld:'vTFENTUNIREM',pic:'ZZZZZ9.9999'},{av:'AV42TFEntUniRem_To',fld:'vTFENTUNIREM_TO',pic:'ZZZZZ9.9999'},{av:'AV44TFEntPre',fld:'vTFENTPRE',pic:'ZZZZZZZ9.999'},{av:'AV45TFEntPre_To',fld:'vTFENTPRE_TO',pic:'ZZZZZZZ9.999'},{av:'AV47TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV48TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV138Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV54Tintutex',fld:'vTINTUTEX',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV47TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV48TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV44TFEntPre',fld:'vTFENTPRE',pic:'ZZZZZZZ9.999'},{av:'AV45TFEntPre_To',fld:'vTFENTPRE_TO',pic:'ZZZZZZZ9.999'},{av:'AV41TFEntUniRem',fld:'vTFENTUNIREM',pic:'ZZZZZ9.9999'},{av:'AV42TFEntUniRem_To',fld:'vTFENTUNIREM_TO',pic:'ZZZZZ9.9999'},{av:'AV38TFEntUniEnt',fld:'vTFENTUNIENT',pic:'ZZZZZ9.99'},{av:'AV39TFEntUniEnt_To',fld:'vTFENTUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV35TFEntPrvNum',fld:'vTFENTPRVNUM',pic:'ZZZZZ9'},{av:'AV36TFEntPrvNum_To',fld:'vTFENTPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV32TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV33TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV29TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV30TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV73TFEntFecEnt',fld:'vTFENTFECENT',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e20XR2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A6156EntPrvNum',fld:'ENTPRVNUM',pic:'ZZZZZ9'},{av:'A12857EntNAlbar',fld:'ENTNALBAR',pic:''},{av:'A5686EntLotN',fld:'ENTLOTN',pic:''}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV70Confirmar',fld:'vCONFIRMAR',pic:''},{av:'edtavConfirmar_Tooltiptext',ctrl:'vCONFIRMAR',prop:'Tooltiptext'},{av:'AV15PrvNom',fld:'vPRVNOM',pic:''},{av:'AV16EntNAlbar',fld:'vENTNALBAR',pic:''},{av:'edtavEntnalbar_Backcolor',ctrl:'vENTNALBAR',prop:'Backcolor'},{av:'edtavEntnalbar_Forecolor',ctrl:'vENTNALBAR',prop:'Forecolor'},{av:'AV17EntLotN',fld:'vENTLOTN',pic:''},{av:'edtavEntlotn_Backcolor',ctrl:'vENTLOTN',prop:'Backcolor'},{av:'edtavEntlotn_Forecolor',ctrl:'vENTLOTN',prop:'Forecolor'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e15XR2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV77FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV59EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV65Fec1',fld:'vFEC1',pic:''},{av:'AV66Fec2',fld:'vFEC2',pic:''},{av:'AV67Prdnum1',fld:'vPRDNUM1',pic:''},{av:'AV68Prdnum2',fld:'vPRDNUM2',pic:''},{av:'AV69Prvnum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV64Entcon',fld:'vENTCON',pic:'9'},{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV73TFEntFecEnt',fld:'vTFENTFECENT',pic:''},{av:'AV29TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV30TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV32TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV33TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV35TFEntPrvNum',fld:'vTFENTPRVNUM',pic:'ZZZZZ9'},{av:'AV36TFEntPrvNum_To',fld:'vTFENTPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV38TFEntUniEnt',fld:'vTFENTUNIENT',pic:'ZZZZZ9.99'},{av:'AV39TFEntUniEnt_To',fld:'vTFENTUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV41TFEntUniRem',fld:'vTFENTUNIREM',pic:'ZZZZZ9.9999'},{av:'AV42TFEntUniRem_To',fld:'vTFENTUNIREM_TO',pic:'ZZZZZ9.9999'},{av:'AV44TFEntPre',fld:'vTFENTPRE',pic:'ZZZZZZZ9.999'},{av:'AV45TFEntPre_To',fld:'vTFENTPRE_TO',pic:'ZZZZZZZ9.999'},{av:'AV47TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV48TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV138Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV54Tintutex',fld:'vTINTUTEX',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtEntFecEnt_Visible',ctrl:'ENTFECENT',prop:'Visible'},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtEntPrvNum_Visible',ctrl:'ENTPRVNUM',prop:'Visible'},{av:'edtavPrvnom_Visible',ctrl:'vPRVNOM',prop:'Visible'},{av:'edtEntUniEnt_Visible',ctrl:'ENTUNIENT',prop:'Visible'},{av:'edtEntUniRem_Visible',ctrl:'ENTUNIREM',prop:'Visible'},{av:'edtEntPre_Visible',ctrl:'ENTPRE',prop:'Visible'},{av:'edtavEntnalbar_Visible',ctrl:'vENTNALBAR',prop:'Visible'},{av:'edtavEntlotn_Visible',ctrl:'vENTLOTN',prop:'Visible'},{av:'edtPedCod_Visible',ctrl:'PEDCOD',prop:'Visible'},{av:'AV52GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV53GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV25ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e11XR2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV77FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV59EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV65Fec1',fld:'vFEC1',pic:''},{av:'AV66Fec2',fld:'vFEC2',pic:''},{av:'AV67Prdnum1',fld:'vPRDNUM1',pic:''},{av:'AV68Prdnum2',fld:'vPRDNUM2',pic:''},{av:'AV69Prvnum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV64Entcon',fld:'vENTCON',pic:'9'},{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV73TFEntFecEnt',fld:'vTFENTFECENT',pic:''},{av:'AV29TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV30TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV32TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV33TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV35TFEntPrvNum',fld:'vTFENTPRVNUM',pic:'ZZZZZ9'},{av:'AV36TFEntPrvNum_To',fld:'vTFENTPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV38TFEntUniEnt',fld:'vTFENTUNIENT',pic:'ZZZZZ9.99'},{av:'AV39TFEntUniEnt_To',fld:'vTFENTUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV41TFEntUniRem',fld:'vTFENTUNIREM',pic:'ZZZZZ9.9999'},{av:'AV42TFEntUniRem_To',fld:'vTFENTUNIREM_TO',pic:'ZZZZZ9.9999'},{av:'AV44TFEntPre',fld:'vTFENTPRE',pic:'ZZZZZZZ9.999'},{av:'AV45TFEntPre_To',fld:'vTFENTPRE_TO',pic:'ZZZZZZZ9.999'},{av:'AV47TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV48TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV138Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV54Tintutex',fld:'vTINTUTEX',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV77FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV73TFEntFecEnt',fld:'vTFENTFECENT',pic:''},{av:'AV29TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV30TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV32TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV33TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV35TFEntPrvNum',fld:'vTFENTPRVNUM',pic:'ZZZZZ9'},{av:'AV36TFEntPrvNum_To',fld:'vTFENTPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV38TFEntUniEnt',fld:'vTFENTUNIENT',pic:'ZZZZZ9.99'},{av:'AV39TFEntUniEnt_To',fld:'vTFENTUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV41TFEntUniRem',fld:'vTFENTUNIREM',pic:'ZZZZZ9.9999'},{av:'AV42TFEntUniRem_To',fld:'vTFENTUNIREM_TO',pic:'ZZZZZ9.9999'},{av:'AV44TFEntPre',fld:'vTFENTPRE',pic:'ZZZZZZZ9.999'},{av:'AV45TFEntPre_To',fld:'vTFENTPRE_TO',pic:'ZZZZZZZ9.999'},{av:'AV47TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV48TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtEntFecEnt_Visible',ctrl:'ENTFECENT',prop:'Visible'},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtEntPrvNum_Visible',ctrl:'ENTPRVNUM',prop:'Visible'},{av:'edtavPrvnom_Visible',ctrl:'vPRVNOM',prop:'Visible'},{av:'edtEntUniEnt_Visible',ctrl:'ENTUNIENT',prop:'Visible'},{av:'edtEntUniRem_Visible',ctrl:'ENTUNIREM',prop:'Visible'},{av:'edtEntPre_Visible',ctrl:'ENTPRE',prop:'Visible'},{av:'edtavEntnalbar_Visible',ctrl:'vENTNALBAR',prop:'Visible'},{av:'edtavEntlotn_Visible',ctrl:'vENTLOTN',prop:'Visible'},{av:'edtPedCod_Visible',ctrl:'PEDCOD',prop:'Visible'},{av:'AV52GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV53GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV25ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e16XR2',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e17XR2',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VCONFIRMAR.CLICK","{handler:'e21XR2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV77FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV59EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV65Fec1',fld:'vFEC1',pic:''},{av:'AV66Fec2',fld:'vFEC2',pic:''},{av:'AV67Prdnum1',fld:'vPRDNUM1',pic:''},{av:'AV68Prdnum2',fld:'vPRDNUM2',pic:''},{av:'AV69Prvnum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV64Entcon',fld:'vENTCON',pic:'9'},{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV73TFEntFecEnt',fld:'vTFENTFECENT',pic:''},{av:'AV29TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV30TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV32TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV33TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV35TFEntPrvNum',fld:'vTFENTPRVNUM',pic:'ZZZZZ9'},{av:'AV36TFEntPrvNum_To',fld:'vTFENTPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV38TFEntUniEnt',fld:'vTFENTUNIENT',pic:'ZZZZZ9.99'},{av:'AV39TFEntUniEnt_To',fld:'vTFENTUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV41TFEntUniRem',fld:'vTFENTUNIREM',pic:'ZZZZZ9.9999'},{av:'AV42TFEntUniRem_To',fld:'vTFENTUNIREM_TO',pic:'ZZZZZ9.9999'},{av:'AV44TFEntPre',fld:'vTFENTPRE',pic:'ZZZZZZZ9.999'},{av:'AV45TFEntPre_To',fld:'vTFENTPRE_TO',pic:'ZZZZZZZ9.999'},{av:'AV47TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV48TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV138Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV54Tintutex',fld:'vTINTUTEX',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'AV16EntNAlbar',fld:'vENTNALBAR',pic:''},{av:'AV17EntLotN',fld:'vENTLOTN',pic:''},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A597LinEnt',fld:'LINENT',pic:'ZZZ9'},{av:'AV62UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV63Station',fld:'vSTATION',pic:''}]");
      setEventMetadata("VCONFIRMAR.CLICK",",oparms:[{av:'AV63Station',fld:'vSTATION',pic:''},{av:'AV62UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV16EntNAlbar',fld:'vENTNALBAR',pic:''},{av:'AV17EntLotN',fld:'vENTLOTN',pic:''},{av:'A597LinEnt',fld:'LINENT',pic:'ZZZ9'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'AV59EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtEntFecEnt_Visible',ctrl:'ENTFECENT',prop:'Visible'},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtEntPrvNum_Visible',ctrl:'ENTPRVNUM',prop:'Visible'},{av:'edtavPrvnom_Visible',ctrl:'vPRVNOM',prop:'Visible'},{av:'edtEntUniEnt_Visible',ctrl:'ENTUNIENT',prop:'Visible'},{av:'edtEntUniRem_Visible',ctrl:'ENTUNIREM',prop:'Visible'},{av:'edtEntPre_Visible',ctrl:'ENTPRE',prop:'Visible'},{av:'edtavEntnalbar_Visible',ctrl:'vENTNALBAR',prop:'Visible'},{av:'edtavEntlotn_Visible',ctrl:'vENTLOTN',prop:'Visible'},{av:'edtPedCod_Visible',ctrl:'PEDCOD',prop:'Visible'},{av:'AV52GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV53GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV25ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[]");
      setEventMetadata("VALID_PRDNUM",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Linent',iparms:[]");
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
      wcpOAV59EmprCod = "" ;
      wcpOAV65Fec1 = GXutil.nullDate() ;
      wcpOAV66Fec2 = GXutil.nullDate() ;
      wcpOAV67Prdnum1 = "" ;
      wcpOAV68Prdnum2 = "" ;
      Gridpaginationbar_Selectedpage = "" ;
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
      AV59EmprCod = "" ;
      AV65Fec1 = GXutil.nullDate() ;
      AV66Fec2 = GXutil.nullDate() ;
      AV67Prdnum1 = "" ;
      AV68Prdnum2 = "" ;
      AV77FilterFullText = "" ;
      AV22ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV73TFEntFecEnt = GXutil.nullDate() ;
      AV29TFPrdNum = "" ;
      AV30TFPrdNum_Sel = "" ;
      AV32TFPrdNom = "" ;
      AV33TFPrdNom_Sel = "" ;
      AV38TFEntUniEnt = DecimalUtil.ZERO ;
      AV39TFEntUniEnt_To = DecimalUtil.ZERO ;
      AV41TFEntUniRem = DecimalUtil.ZERO ;
      AV42TFEntUniRem_To = DecimalUtil.ZERO ;
      AV44TFEntPre = DecimalUtil.ZERO ;
      AV45TFEntPre_To = DecimalUtil.ZERO ;
      AV138Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV25ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV50DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A396EmprCod = "" ;
      A12857EntNAlbar = "" ;
      A5686EntLotN = "" ;
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV62UsurCod = "" ;
      AV63Station = "" ;
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
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV75DDO_EntFecEntAuxDate = GXutil.nullDate() ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV70Confirmar = "" ;
      AV137Confirmar_GXI = "" ;
      A415EntFecEnt = GXutil.nullDate() ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      AV15PrvNom = "" ;
      A418EntUniEnt = DecimalUtil.ZERO ;
      A419EntUniRem = DecimalUtil.ZERO ;
      A417EntPre = DecimalUtil.ZERO ;
      AV16EntNAlbar = "" ;
      AV17EntLotN = "" ;
      scmdbuf = "" ;
      lV121Wcwmodifloteds_1_filterfulltext = "" ;
      lV123Wcwmodifloteds_3_tfprdnum = "" ;
      lV125Wcwmodifloteds_5_tfprdnom = "" ;
      AV121Wcwmodifloteds_1_filterfulltext = "" ;
      AV122Wcwmodifloteds_2_tfentfecent = GXutil.nullDate() ;
      AV124Wcwmodifloteds_4_tfprdnum_sel = "" ;
      AV123Wcwmodifloteds_3_tfprdnum = "" ;
      AV126Wcwmodifloteds_6_tfprdnom_sel = "" ;
      AV125Wcwmodifloteds_5_tfprdnom = "" ;
      AV129Wcwmodifloteds_9_tfentunient = DecimalUtil.ZERO ;
      AV130Wcwmodifloteds_10_tfentunient_to = DecimalUtil.ZERO ;
      AV131Wcwmodifloteds_11_tfentunirem = DecimalUtil.ZERO ;
      AV132Wcwmodifloteds_12_tfentunirem_to = DecimalUtil.ZERO ;
      AV133Wcwmodifloteds_13_tfentpre = DecimalUtil.ZERO ;
      AV134Wcwmodifloteds_14_tfentpre_to = DecimalUtil.ZERO ;
      H00XR2_A411EntCon = new byte[1] ;
      H00XR2_A396EmprCod = new String[] {""} ;
      H00XR2_A12857EntNAlbar = new String[] {""} ;
      H00XR2_A5686EntLotN = new String[] {""} ;
      H00XR2_A597LinEnt = new short[1] ;
      H00XR2_A658PedCod = new int[1] ;
      H00XR2_n658PedCod = new boolean[] {false} ;
      H00XR2_A417EntPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00XR2_A419EntUniRem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00XR2_A418EntUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00XR2_A6156EntPrvNum = new int[1] ;
      H00XR2_n6156EntPrvNum = new boolean[] {false} ;
      H00XR2_A718PrdNom = new String[] {""} ;
      H00XR2_A719PrdNum = new String[] {""} ;
      H00XR2_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      H00XR3_AGRID_nRecordCount = new long[1] ;
      AV71EmprNom = "" ;
      GXv_int6 = new byte[1] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV24Session = httpContext.getWebSession();
      AV20ColumnsSelectorXML = "" ;
      GXv_int10 = new int[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV26ManageFiltersXml = "" ;
      AV18ExcelFilename = "" ;
      AV19ErrorMessage = "" ;
      AV21UserCustomValue = "" ;
      AV23ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector11 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector12 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item13 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item14 = new GXBaseCollection[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char15 = "" ;
      GXt_char1 = "" ;
      GXv_SdtWWPGridState16 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int17 = new short[1] ;
      GXv_char2 = new String[1] ;
      GXv_char18 = new String[1] ;
      GXv_char19 = new String[1] ;
      GXv_char20 = new String[1] ;
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV59EmprCod = "" ;
      sCtrlAV65Fec1 = "" ;
      sCtrlAV66Fec2 = "" ;
      sCtrlAV67Prdnum1 = "" ;
      sCtrlAV68Prdnum2 = "" ;
      sCtrlAV69Prvnum = "" ;
      sCtrlAV64Entcon = "" ;
      subGrid_Linesclass = "" ;
      sImgUrl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcwmodiflote__default(),
         new Object[] {
             new Object[] {
            H00XR2_A411EntCon, H00XR2_A396EmprCod, H00XR2_A12857EntNAlbar, H00XR2_A5686EntLotN, H00XR2_A597LinEnt, H00XR2_A658PedCod, H00XR2_n658PedCod, H00XR2_A417EntPre, H00XR2_A419EntUniRem, H00XR2_A418EntUniEnt,
            H00XR2_A6156EntPrvNum, H00XR2_n6156EntPrvNum, H00XR2_A718PrdNom, H00XR2_A719PrdNum, H00XR2_A415EntFecEnt
            }
            , new Object[] {
            H00XR3_AGRID_nRecordCount
            }
         }
      );
      AV138Pgmname = "WCwModifLote" ;
      /* GeneXus formulas. */
      AV138Pgmname = "WCwModifLote" ;
      Gx_err = (short)(0) ;
      edtavPrvnom_Enabled = 0 ;
   }

   private byte wcpOAV64Entcon ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV64Entcon ;
   private byte AV27ManageFiltersExecutionStep ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte A411EntCon ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV12OrderedBy ;
   private short AV54Tintutex ;
   private short wbEnd ;
   private short wbStart ;
   private short A597LinEnt ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV57UpdLote ;
   private short AV58Nalbaran20 ;
   private short GXv_int17[] ;
   private int wcpOAV69Prvnum ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_41 ;
   private int AV69Prvnum ;
   private int nGXsfl_41_idx=1 ;
   private int AV35TFEntPrvNum ;
   private int AV36TFEntPrvNum_To ;
   private int AV47TFPedCod ;
   private int AV48TFPedCod_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int A6156EntPrvNum ;
   private int A658PedCod ;
   private int subGrid_Islastpage ;
   private int edtavPrvnom_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV127Wcwmodifloteds_7_tfentprvnum ;
   private int AV128Wcwmodifloteds_8_tfentprvnum_to ;
   private int AV135Wcwmodifloteds_15_tfpedcod ;
   private int AV136Wcwmodifloteds_16_tfpedcod_to ;
   private int edtEntFecEnt_Visible ;
   private int edtPrdNum_Visible ;
   private int edtPrdNom_Visible ;
   private int edtEntPrvNum_Visible ;
   private int edtavPrvnom_Visible ;
   private int edtEntUniEnt_Visible ;
   private int edtEntUniRem_Visible ;
   private int edtEntPre_Visible ;
   private int edtavEntnalbar_Visible ;
   private int edtavEntlotn_Visible ;
   private int edtPedCod_Visible ;
   private int AV51PageToGo ;
   private int GXv_int10[] ;
   private int edtavEntnalbar_Backcolor ;
   private int edtavEntnalbar_Forecolor ;
   private int edtavEntlotn_Backcolor ;
   private int edtavEntlotn_Forecolor ;
   private int AV139GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavConfirmar_Enabled ;
   private int edtavConfirmar_Visible ;
   private int edtavEntnalbar_Enabled ;
   private int edtavEntlotn_Enabled ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV52GridCurrentPage ;
   private long AV53GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV38TFEntUniEnt ;
   private java.math.BigDecimal AV39TFEntUniEnt_To ;
   private java.math.BigDecimal AV41TFEntUniRem ;
   private java.math.BigDecimal AV42TFEntUniRem_To ;
   private java.math.BigDecimal AV44TFEntPre ;
   private java.math.BigDecimal AV45TFEntPre_To ;
   private java.math.BigDecimal A418EntUniEnt ;
   private java.math.BigDecimal A419EntUniRem ;
   private java.math.BigDecimal A417EntPre ;
   private java.math.BigDecimal AV129Wcwmodifloteds_9_tfentunient ;
   private java.math.BigDecimal AV130Wcwmodifloteds_10_tfentunient_to ;
   private java.math.BigDecimal AV131Wcwmodifloteds_11_tfentunirem ;
   private java.math.BigDecimal AV132Wcwmodifloteds_12_tfentunirem_to ;
   private java.math.BigDecimal AV133Wcwmodifloteds_13_tfentpre ;
   private java.math.BigDecimal AV134Wcwmodifloteds_14_tfentpre_to ;
   private String wcpOAV59EmprCod ;
   private String wcpOAV67Prdnum1 ;
   private String wcpOAV68Prdnum2 ;
   private String Gridpaginationbar_Selectedpage ;
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
   private String AV59EmprCod ;
   private String AV67Prdnum1 ;
   private String AV68Prdnum2 ;
   private String sGXsfl_41_idx="0001" ;
   private String AV29TFPrdNum ;
   private String AV30TFPrdNum_Sel ;
   private String AV32TFPrdNom ;
   private String AV33TFPrdNom_Sel ;
   private String AV138Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
   private String A12857EntNAlbar ;
   private String A5686EntLotN ;
   private String AV62UsurCod ;
   private String AV63Station ;
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
   private String bttBtnexport_Internalname ;
   private String bttBtnexport_Jsonclick ;
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
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_entfecentauxdates_Internalname ;
   private String edtavDdo_entfecentauxdate_Internalname ;
   private String edtavDdo_entfecentauxdate_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavPrvnom_Internalname ;
   private String edtavConfirmar_Internalname ;
   private String edtEntFecEnt_Internalname ;
   private String A719PrdNum ;
   private String edtPrdNum_Internalname ;
   private String A718PrdNom ;
   private String edtPrdNom_Internalname ;
   private String edtEntPrvNum_Internalname ;
   private String AV15PrvNom ;
   private String edtEntUniEnt_Internalname ;
   private String edtEntUniRem_Internalname ;
   private String edtEntPre_Internalname ;
   private String AV16EntNAlbar ;
   private String edtavEntnalbar_Internalname ;
   private String AV17EntLotN ;
   private String edtavEntlotn_Internalname ;
   private String edtPedCod_Internalname ;
   private String edtLinEnt_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String scmdbuf ;
   private String lV123Wcwmodifloteds_3_tfprdnum ;
   private String lV125Wcwmodifloteds_5_tfprdnom ;
   private String AV124Wcwmodifloteds_4_tfprdnum_sel ;
   private String AV123Wcwmodifloteds_3_tfprdnum ;
   private String AV126Wcwmodifloteds_6_tfprdnom_sel ;
   private String AV125Wcwmodifloteds_5_tfprdnom ;
   private String AV71EmprNom ;
   private String edtavConfirmar_gximage ;
   private String edtavConfirmar_Tooltiptext ;
   private String GXt_char15 ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char18[] ;
   private String GXv_char19[] ;
   private String GXv_char20[] ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV59EmprCod ;
   private String sCtrlAV65Fec1 ;
   private String sCtrlAV66Fec2 ;
   private String sCtrlAV67Prdnum1 ;
   private String sCtrlAV68Prdnum2 ;
   private String sCtrlAV69Prvnum ;
   private String sCtrlAV64Entcon ;
   private String sGXsfl_41_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String sImgUrl ;
   private String edtavConfirmar_Jsonclick ;
   private String ROClassString ;
   private String edtEntFecEnt_Jsonclick ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdNom_Jsonclick ;
   private String edtEntPrvNum_Jsonclick ;
   private String edtavPrvnom_Jsonclick ;
   private String edtEntUniEnt_Jsonclick ;
   private String edtEntUniRem_Jsonclick ;
   private String edtEntPre_Jsonclick ;
   private String edtavEntnalbar_Jsonclick ;
   private String edtavEntlotn_Jsonclick ;
   private String edtPedCod_Jsonclick ;
   private String edtLinEnt_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV65Fec1 ;
   private java.util.Date wcpOAV66Fec2 ;
   private java.util.Date AV65Fec1 ;
   private java.util.Date AV66Fec2 ;
   private java.util.Date AV73TFEntFecEnt ;
   private java.util.Date AV75DDO_EntFecEntAuxDate ;
   private java.util.Date A415EntFecEnt ;
   private java.util.Date AV122Wcwmodifloteds_2_tfentfecent ;
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
   private boolean bGXsfl_41_Refreshing=false ;
   private boolean n6156EntPrvNum ;
   private boolean n658PedCod ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean AV70Confirmar_IsBlob ;
   private String AV20ColumnsSelectorXML ;
   private String AV26ManageFiltersXml ;
   private String AV21UserCustomValue ;
   private String AV77FilterFullText ;
   private String AV137Confirmar_GXI ;
   private String lV121Wcwmodifloteds_1_filterfulltext ;
   private String AV121Wcwmodifloteds_1_filterfulltext ;
   private String AV18ExcelFilename ;
   private String AV19ErrorMessage ;
   private String AV70Confirmar ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV24Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private IDataStoreProvider pr_default ;
   private byte[] H00XR2_A411EntCon ;
   private String[] H00XR2_A396EmprCod ;
   private String[] H00XR2_A12857EntNAlbar ;
   private String[] H00XR2_A5686EntLotN ;
   private short[] H00XR2_A597LinEnt ;
   private int[] H00XR2_A658PedCod ;
   private boolean[] H00XR2_n658PedCod ;
   private java.math.BigDecimal[] H00XR2_A417EntPre ;
   private java.math.BigDecimal[] H00XR2_A419EntUniRem ;
   private java.math.BigDecimal[] H00XR2_A418EntUniEnt ;
   private int[] H00XR2_A6156EntPrvNum ;
   private boolean[] H00XR2_n6156EntPrvNum ;
   private String[] H00XR2_A718PrdNom ;
   private String[] H00XR2_A719PrdNum ;
   private java.util.Date[] H00XR2_A415EntFecEnt ;
   private long[] H00XR3_AGRID_nRecordCount ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV25ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item13 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item14[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV22ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector11[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector12[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV50DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState16[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
}

final  class wcwmodiflote__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00XR2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV121Wcwmodifloteds_1_filterfulltext ,
                                          java.util.Date AV122Wcwmodifloteds_2_tfentfecent ,
                                          String AV124Wcwmodifloteds_4_tfprdnum_sel ,
                                          String AV123Wcwmodifloteds_3_tfprdnum ,
                                          String AV126Wcwmodifloteds_6_tfprdnom_sel ,
                                          String AV125Wcwmodifloteds_5_tfprdnom ,
                                          int AV127Wcwmodifloteds_7_tfentprvnum ,
                                          int AV128Wcwmodifloteds_8_tfentprvnum_to ,
                                          java.math.BigDecimal AV129Wcwmodifloteds_9_tfentunient ,
                                          java.math.BigDecimal AV130Wcwmodifloteds_10_tfentunient_to ,
                                          java.math.BigDecimal AV131Wcwmodifloteds_11_tfentunirem ,
                                          java.math.BigDecimal AV132Wcwmodifloteds_12_tfentunirem_to ,
                                          java.math.BigDecimal AV133Wcwmodifloteds_13_tfentpre ,
                                          java.math.BigDecimal AV134Wcwmodifloteds_14_tfentpre_to ,
                                          int AV135Wcwmodifloteds_15_tfpedcod ,
                                          int AV136Wcwmodifloteds_16_tfpedcod_to ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          int A6156EntPrvNum ,
                                          java.math.BigDecimal A418EntUniEnt ,
                                          java.math.BigDecimal A419EntUniRem ,
                                          java.math.BigDecimal A417EntPre ,
                                          int A658PedCod ,
                                          java.util.Date A415EntFecEnt ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          java.util.Date AV65Fec1 ,
                                          java.util.Date AV66Fec2 ,
                                          String AV67Prdnum1 ,
                                          String AV68Prdnum2 ,
                                          int AV69Prvnum ,
                                          byte A411EntCon ,
                                          byte AV64Entcon ,
                                          String AV59EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int21 = new byte[38];
      Object[] GXv_Object22 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.EntCon, T1.EmprCod, T1.EntNAlbar, T1.EntLotN, T1.LinEnt, T1.PedCod, T1.EntPre, T1.EntUniRem, T1.EntUniEnt, T1.EntPrvNum, T2.PrdNom, T1.PrdNum, T1.EntFecEnt" ;
      sFromString = " FROM (TXPENTALM T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.EntFecEnt >= ?)");
      addWhere(sWhereString, "(T1.EntFecEnt <= ?)");
      addWhere(sWhereString, "(T1.PrdNum >= ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.PrdNum <= ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.EntPrvNum = ? or (? = 0))");
      addWhere(sWhereString, "(T1.EntCon = ? or ? = 9)");
      if ( ! (GXutil.strcmp("", AV121Wcwmodifloteds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.EntPrvNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.EntUniEnt,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.EntUniRem,'999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.EntPre,'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PedCod,'99999990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int21[11] = (byte)(1) ;
         GXv_int21[12] = (byte)(1) ;
         GXv_int21[13] = (byte)(1) ;
         GXv_int21[14] = (byte)(1) ;
         GXv_int21[15] = (byte)(1) ;
         GXv_int21[16] = (byte)(1) ;
         GXv_int21[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV122Wcwmodifloteds_2_tfentfecent)) )
      {
         addWhere(sWhereString, "(T1.EntFecEnt >= ?)");
      }
      else
      {
         GXv_int21[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Wcwmodifloteds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV123Wcwmodifloteds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Wcwmodifloteds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int21[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV126Wcwmodifloteds_6_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV125Wcwmodifloteds_5_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Wcwmodifloteds_6_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int21[22] = (byte)(1) ;
      }
      if ( ! (0==AV127Wcwmodifloteds_7_tfentprvnum) )
      {
         addWhere(sWhereString, "(T1.EntPrvNum >= ?)");
      }
      else
      {
         GXv_int21[23] = (byte)(1) ;
      }
      if ( ! (0==AV128Wcwmodifloteds_8_tfentprvnum_to) )
      {
         addWhere(sWhereString, "(T1.EntPrvNum <= ?)");
      }
      else
      {
         GXv_int21[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Wcwmodifloteds_9_tfentunient)==0) )
      {
         addWhere(sWhereString, "(T1.EntUniEnt >= ?)");
      }
      else
      {
         GXv_int21[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV130Wcwmodifloteds_10_tfentunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.EntUniEnt <= ?)");
      }
      else
      {
         GXv_int21[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV131Wcwmodifloteds_11_tfentunirem)==0) )
      {
         addWhere(sWhereString, "(T1.EntUniRem >= ?)");
      }
      else
      {
         GXv_int21[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV132Wcwmodifloteds_12_tfentunirem_to)==0) )
      {
         addWhere(sWhereString, "(T1.EntUniRem <= ?)");
      }
      else
      {
         GXv_int21[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV133Wcwmodifloteds_13_tfentpre)==0) )
      {
         addWhere(sWhereString, "(T1.EntPre >= ?)");
      }
      else
      {
         GXv_int21[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV134Wcwmodifloteds_14_tfentpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.EntPre <= ?)");
      }
      else
      {
         GXv_int21[30] = (byte)(1) ;
      }
      if ( ! (0==AV135Wcwmodifloteds_15_tfpedcod) )
      {
         addWhere(sWhereString, "(T1.PedCod >= ?)");
      }
      else
      {
         GXv_int21[31] = (byte)(1) ;
      }
      if ( ! (0==AV136Wcwmodifloteds_16_tfpedcod_to) )
      {
         addWhere(sWhereString, "(T1.PedCod <= ?)");
      }
      else
      {
         GXv_int21[32] = (byte)(1) ;
      }
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EntFecEnt" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EntFecEnt DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.PrdNom" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.PrdNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EntPrvNum" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EntPrvNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EntUniEnt" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EntUniEnt DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EntUniRem" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EntUniRem DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EntPre" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EntPre DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PedCod" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PedCod DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.PrdNum, T1.LinEnt" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object22[0] = scmdbuf ;
      GXv_Object22[1] = GXv_int21 ;
      return GXv_Object22 ;
   }

   protected Object[] conditional_H00XR3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV121Wcwmodifloteds_1_filterfulltext ,
                                          java.util.Date AV122Wcwmodifloteds_2_tfentfecent ,
                                          String AV124Wcwmodifloteds_4_tfprdnum_sel ,
                                          String AV123Wcwmodifloteds_3_tfprdnum ,
                                          String AV126Wcwmodifloteds_6_tfprdnom_sel ,
                                          String AV125Wcwmodifloteds_5_tfprdnom ,
                                          int AV127Wcwmodifloteds_7_tfentprvnum ,
                                          int AV128Wcwmodifloteds_8_tfentprvnum_to ,
                                          java.math.BigDecimal AV129Wcwmodifloteds_9_tfentunient ,
                                          java.math.BigDecimal AV130Wcwmodifloteds_10_tfentunient_to ,
                                          java.math.BigDecimal AV131Wcwmodifloteds_11_tfentunirem ,
                                          java.math.BigDecimal AV132Wcwmodifloteds_12_tfentunirem_to ,
                                          java.math.BigDecimal AV133Wcwmodifloteds_13_tfentpre ,
                                          java.math.BigDecimal AV134Wcwmodifloteds_14_tfentpre_to ,
                                          int AV135Wcwmodifloteds_15_tfpedcod ,
                                          int AV136Wcwmodifloteds_16_tfpedcod_to ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          int A6156EntPrvNum ,
                                          java.math.BigDecimal A418EntUniEnt ,
                                          java.math.BigDecimal A419EntUniRem ,
                                          java.math.BigDecimal A417EntPre ,
                                          int A658PedCod ,
                                          java.util.Date A415EntFecEnt ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          java.util.Date AV65Fec1 ,
                                          java.util.Date AV66Fec2 ,
                                          String AV67Prdnum1 ,
                                          String AV68Prdnum2 ,
                                          int AV69Prvnum ,
                                          byte A411EntCon ,
                                          byte AV64Entcon ,
                                          String AV59EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int23 = new byte[33];
      Object[] GXv_Object24 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPENTALM T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.EntFecEnt >= ?)");
      addWhere(sWhereString, "(T1.EntFecEnt <= ?)");
      addWhere(sWhereString, "(T1.PrdNum >= ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.PrdNum <= ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.EntPrvNum = ? or (? = 0))");
      addWhere(sWhereString, "(T1.EntCon = ? or ? = 9)");
      if ( ! (GXutil.strcmp("", AV121Wcwmodifloteds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.EntPrvNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.EntUniEnt,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.EntUniRem,'999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.EntPre,'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PedCod,'99999990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int23[11] = (byte)(1) ;
         GXv_int23[12] = (byte)(1) ;
         GXv_int23[13] = (byte)(1) ;
         GXv_int23[14] = (byte)(1) ;
         GXv_int23[15] = (byte)(1) ;
         GXv_int23[16] = (byte)(1) ;
         GXv_int23[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV122Wcwmodifloteds_2_tfentfecent)) )
      {
         addWhere(sWhereString, "(T1.EntFecEnt >= ?)");
      }
      else
      {
         GXv_int23[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Wcwmodifloteds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV123Wcwmodifloteds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Wcwmodifloteds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int23[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV126Wcwmodifloteds_6_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV125Wcwmodifloteds_5_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Wcwmodifloteds_6_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int23[22] = (byte)(1) ;
      }
      if ( ! (0==AV127Wcwmodifloteds_7_tfentprvnum) )
      {
         addWhere(sWhereString, "(T1.EntPrvNum >= ?)");
      }
      else
      {
         GXv_int23[23] = (byte)(1) ;
      }
      if ( ! (0==AV128Wcwmodifloteds_8_tfentprvnum_to) )
      {
         addWhere(sWhereString, "(T1.EntPrvNum <= ?)");
      }
      else
      {
         GXv_int23[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Wcwmodifloteds_9_tfentunient)==0) )
      {
         addWhere(sWhereString, "(T1.EntUniEnt >= ?)");
      }
      else
      {
         GXv_int23[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV130Wcwmodifloteds_10_tfentunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.EntUniEnt <= ?)");
      }
      else
      {
         GXv_int23[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV131Wcwmodifloteds_11_tfentunirem)==0) )
      {
         addWhere(sWhereString, "(T1.EntUniRem >= ?)");
      }
      else
      {
         GXv_int23[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV132Wcwmodifloteds_12_tfentunirem_to)==0) )
      {
         addWhere(sWhereString, "(T1.EntUniRem <= ?)");
      }
      else
      {
         GXv_int23[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV133Wcwmodifloteds_13_tfentpre)==0) )
      {
         addWhere(sWhereString, "(T1.EntPre >= ?)");
      }
      else
      {
         GXv_int23[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV134Wcwmodifloteds_14_tfentpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.EntPre <= ?)");
      }
      else
      {
         GXv_int23[30] = (byte)(1) ;
      }
      if ( ! (0==AV135Wcwmodifloteds_15_tfpedcod) )
      {
         addWhere(sWhereString, "(T1.PedCod >= ?)");
      }
      else
      {
         GXv_int23[31] = (byte)(1) ;
      }
      if ( ! (0==AV136Wcwmodifloteds_16_tfpedcod_to) )
      {
         addWhere(sWhereString, "(T1.PedCod <= ?)");
      }
      else
      {
         GXv_int23[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
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
      GXv_Object24[0] = scmdbuf ;
      GXv_Object24[1] = GXv_int23 ;
      return GXv_Object24 ;
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
                  return conditional_H00XR2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (java.util.Date)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Boolean) dynConstraints[25]).booleanValue() , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , (String)dynConstraints[34] );
            case 1 :
                  return conditional_H00XR3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (java.util.Date)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Boolean) dynConstraints[25]).booleanValue() , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , (String)dynConstraints[34] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00XR2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00XR3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,4);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(11, 26);
               ((String[]) buf[13])[0] = rslt.getString(12, 6);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(13);
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
                  stmt.setString(sIdx, (String)parms[38], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[39]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[40]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[47]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[56]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 6);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 26);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 4);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 4);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 5);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 5);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[34]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[35]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[43]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[51]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 4);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 4);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 5);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 5);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               return;
      }
   }

}

