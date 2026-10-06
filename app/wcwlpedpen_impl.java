package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcwlpedpen_impl extends GXWebComponent
{
   public wcwlpedpen_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wcwlpedpen_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcwlpedpen_impl.class ));
   }

   public wcwlpedpen_impl( int remoteHandle ,
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
               AV66Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66Emprcod", AV66Emprcod);
               AV67PedFec = localUtil.parseDateParm( httpContext.GetPar( "PedFec")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67PedFec", localUtil.format(AV67PedFec, "99/99/99"));
               AV68PedFec_to = localUtil.parseDateParm( httpContext.GetPar( "PedFec_to")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68PedFec_to", localUtil.format(AV68PedFec_to, "99/99/99"));
               AV69PrvNum = (int)(GXutil.lval( httpContext.GetPar( "PrvNum"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69PrvNum), 6, 0));
               AV70PrvNum_to = (int)(GXutil.lval( httpContext.GetPar( "PrvNum_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70PrvNum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70PrvNum_to), 6, 0));
               AV71Lindsdo0 = httpContext.GetPar( "Lindsdo0") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71Lindsdo0", AV71Lindsdo0);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV66Emprcod,AV67PedFec,AV68PedFec_to,Integer.valueOf(AV69PrvNum),Integer.valueOf(AV70PrvNum_to),AV71Lindsdo0});
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
      nRC_GXsfl_63 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_63"))) ;
      nGXsfl_63_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_63_idx"))) ;
      sGXsfl_63_idx = httpContext.GetPar( "sGXsfl_63_idx") ;
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
      AV72FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV66Emprcod = httpContext.GetPar( "Emprcod") ;
      AV67PedFec = localUtil.parseDateParm( httpContext.GetPar( "PedFec")) ;
      AV68PedFec_to = localUtil.parseDateParm( httpContext.GetPar( "PedFec_to")) ;
      AV69PrvNum = (int)(GXutil.lval( httpContext.GetPar( "PrvNum"))) ;
      AV70PrvNum_to = (int)(GXutil.lval( httpContext.GetPar( "PrvNum_to"))) ;
      AV26ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV21ColumnsSelector);
      AV28TFPrvNum = (int)(GXutil.lval( httpContext.GetPar( "TFPrvNum"))) ;
      AV29TFPrvNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFPrvNum_To"))) ;
      AV31TFPrvNom = httpContext.GetPar( "TFPrvNom") ;
      AV32TFPrvNom_Sel = httpContext.GetPar( "TFPrvNom_Sel") ;
      AV34TFPedCod = (int)(GXutil.lval( httpContext.GetPar( "TFPedCod"))) ;
      AV35TFPedCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFPedCod_To"))) ;
      AV37TFPedFec = localUtil.parseDateParm( httpContext.GetPar( "TFPedFec")) ;
      AV42TFPedFecEnt = localUtil.parseDateParm( httpContext.GetPar( "TFPedFecEnt")) ;
      AV47TFPrdNum = httpContext.GetPar( "TFPrdNum") ;
      AV48TFPrdNum_Sel = httpContext.GetPar( "TFPrdNum_Sel") ;
      AV50TFPrdNom = httpContext.GetPar( "TFPrdNom") ;
      AV51TFPrdNom_Sel = httpContext.GetPar( "TFPrdNom_Sel") ;
      AV53TFPedUni = CommonUtil.decimalVal( httpContext.GetPar( "TFPedUni"), ".") ;
      AV54TFPedUni_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPedUni_To"), ".") ;
      AV56TFPedCanEnt = CommonUtil.decimalVal( httpContext.GetPar( "TFPedCanEnt"), ".") ;
      AV57TFPedCanEnt_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPedCanEnt_To"), ".") ;
      AV74TFCantPdte = CommonUtil.decimalVal( httpContext.GetPar( "TFCantPdte"), ".") ;
      AV75TFCantPdte_To = CommonUtil.decimalVal( httpContext.GetPar( "TFCantPdte_To"), ".") ;
      AV59TFPedPre = CommonUtil.decimalVal( httpContext.GetPar( "TFPedPre"), ".") ;
      AV60TFPedPre_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPedPre_To"), ".") ;
      AV80Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV71Lindsdo0 = httpContext.GetPar( "Lindsdo0") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV72FilterFullText, AV66Emprcod, AV67PedFec, AV68PedFec_to, AV69PrvNum, AV70PrvNum_to, AV26ManageFiltersExecutionStep, AV21ColumnsSelector, AV28TFPrvNum, AV29TFPrvNum_To, AV31TFPrvNom, AV32TFPrvNom_Sel, AV34TFPedCod, AV35TFPedCod_To, AV37TFPedFec, AV42TFPedFecEnt, AV47TFPrdNum, AV48TFPrdNum_Sel, AV50TFPrdNom, AV51TFPrdNom_Sel, AV53TFPedUni, AV54TFPedUni_To, AV56TFPedCanEnt, AV57TFPedCanEnt_To, AV74TFCantPdte, AV75TFCantPdte_To, AV59TFPedPre, AV60TFPedPre_To, AV80Pgmname, AV12OrderedBy, AV13OrderedDsc, AV71Lindsdo0, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         paYX2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( " Tabla LPEDID", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wcwlpedpen", new String[] {GXutil.URLEncode(GXutil.rtrim(AV66Emprcod)),GXutil.URLEncode(GXutil.formatDateParm(AV67PedFec)),GXutil.URLEncode(GXutil.formatDateParm(AV68PedFec_to)),GXutil.URLEncode(GXutil.ltrimstr(AV69PrvNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV70PrvNum_to,6,0)),GXutil.URLEncode(GXutil.rtrim(AV71Lindsdo0))}, new String[] {"Emprcod","PedFec","PedFec_to","PrvNum","PrvNum_to","Lindsdo0"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"WCWLPEDPEN");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV80Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("wcwlpedpen:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vFILTERFULLTEXT", AV72FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_63", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_63, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV24ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV24ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV64GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV65GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV62DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV62DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV21ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV21ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV66Emprcod", GXutil.rtrim( wcpOAV66Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV67PedFec", localUtil.dtoc( wcpOAV67PedFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV68PedFec_to", localUtil.dtoc( wcpOAV68PedFec_to, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV69PrvNum", GXutil.ltrim( localUtil.ntoc( wcpOAV69PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV70PrvNum_to", GXutil.ltrim( localUtil.ntoc( wcpOAV70PrvNum_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV71Lindsdo0", GXutil.rtrim( wcpOAV71Lindsdo0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV26ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVNUM", GXutil.ltrim( localUtil.ntoc( AV28TFPrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVNUM_TO", GXutil.ltrim( localUtil.ntoc( AV29TFPrvNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVNOM", GXutil.rtrim( AV31TFPrvNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVNOM_SEL", GXutil.rtrim( AV32TFPrvNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPEDCOD", GXutil.ltrim( localUtil.ntoc( AV34TFPedCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPEDCOD_TO", GXutil.ltrim( localUtil.ntoc( AV35TFPedCod_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPEDFEC", localUtil.dtoc( AV37TFPedFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPEDFECENT", localUtil.dtoc( AV42TFPedFecEnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNUM", GXutil.rtrim( AV47TFPrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNUM_SEL", GXutil.rtrim( AV48TFPrdNum_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNOM", GXutil.rtrim( AV50TFPrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNOM_SEL", GXutil.rtrim( AV51TFPrdNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPEDUNI", GXutil.ltrim( localUtil.ntoc( AV53TFPedUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPEDUNI_TO", GXutil.ltrim( localUtil.ntoc( AV54TFPedUni_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPEDCANENT", GXutil.ltrim( localUtil.ntoc( AV56TFPedCanEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPEDCANENT_TO", GXutil.ltrim( localUtil.ntoc( AV57TFPedCanEnt_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCANTPDTE", GXutil.ltrim( localUtil.ntoc( AV74TFCantPdte, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCANTPDTE_TO", GXutil.ltrim( localUtil.ntoc( AV75TFCantPdte_To, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPEDPRE", GXutil.ltrim( localUtil.ntoc( AV59TFPedPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPEDPRE_TO", GXutil.ltrim( localUtil.ntoc( AV60TFPedPre_To, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV66Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLINDSDO0", GXutil.rtrim( AV71Lindsdo0));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV10GridState);
      }
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_TITLESCATEGORIES_Gridinternalname", GXutil.rtrim( Grid_titlescategories_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_TITLESCATEGORIES_Gridtitlescategories", GXutil.rtrim( Grid_titlescategories_Gridtitlescategories));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascategories", GXutil.booltostr( Grid_empowerer_Hascategories));
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

   public void renderHtmlCloseFormYX2( )
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
      return "WCWLPEDPEN" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Tabla LPEDID", "") ;
   }

   public void wbYX0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.wcwlpedpen");
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
            httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPedfec_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPedfec_Internalname, httpContext.getMessage( "Fecha Pedido", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtavPedfec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPedfec_Internalname, localUtil.format(AV67PedFec, "99/99/99"), localUtil.format( AV67PedFec, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPedfec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPedfec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WCWLPEDPEN.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavPedfec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavPedfec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WCWLPEDPEN.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPedfec_to_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPedfec_to_Internalname, httpContext.getMessage( "Fecha Pedido", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtavPedfec_to_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPedfec_to_Internalname, localUtil.format(AV68PedFec_to, "99/99/99"), localUtil.format( AV68PedFec_to, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPedfec_to_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPedfec_to_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WCWLPEDPEN.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavPedfec_to_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavPedfec_to_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WCWLPEDPEN.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPrvnum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPrvnum_Internalname, httpContext.getMessage( "Codigo Proveedor", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPrvnum_Internalname, GXutil.ltrim( localUtil.ntoc( AV69PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPrvnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV69PrvNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV69PrvNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPrvnum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPrvnum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WCWLPEDPEN.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPrvnum_to_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPrvnum_to_Internalname, httpContext.getMessage( "Codigo Proveedor", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPrvnum_to_Internalname, GXutil.ltrim( localUtil.ntoc( AV70PrvNum_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPrvnum_to_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV70PrvNum_to), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV70PrvNum_to), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPrvnum_to_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPrvnum_to_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WCWLPEDPEN.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 63, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCWLPEDPEN.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 63, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCWLPEDPEN.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnpdf_Internalname, "gx.evt.setGridEvt("+GXutil.str( 63, 2, 0)+","+"null"+");", httpContext.getMessage( "PDF", ""), bttBtnpdf_Jsonclick, 5, httpContext.getMessage( "PDF", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOPDF\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCWLPEDPEN.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 63, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCWLPEDPEN.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_45_YX2( true) ;
      }
      else
      {
         wb_table1_45_YX2( false) ;
      }
      return  ;
   }

   public void wb_table1_45_YX2e( boolean wbgen )
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
         startgridcontrol63( ) ;
      }
      if ( wbEnd == 63 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_63 = (int)(nGXsfl_63_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV64GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV65GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV80Pgmname), GXutil.rtrim( localUtil.format( AV80Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WCWLPEDPEN.htm");
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
         ucDdo_grid.setProperty("Fixable", Ddo_grid_Fixable);
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("FilterIsRange", Ddo_grid_Filterisrange);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV62DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV62DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV21ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_titlescategories.setProperty("GridTitlesCategories", Grid_titlescategories_Gridtitlescategories);
         ucGrid_titlescategories.render(context, "dvelop.gridtitlescategories", Grid_titlescategories_Internalname, sPrefix+"GRID_TITLESCATEGORIESContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasCategories", Grid_empowerer_Hascategories);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_pedfecauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'" + sPrefix + "',false,'" + sGXsfl_63_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_pedfecauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_pedfecauxdate_Internalname, localUtil.format(AV39DDO_PedFecAuxDate, "99/99/99"), localUtil.format( AV39DDO_PedFecAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,91);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_pedfecauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WCWLPEDPEN.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_pedfecauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WCWLPEDPEN.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_pedfecentauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'" + sPrefix + "',false,'" + sGXsfl_63_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_pedfecentauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_pedfecentauxdate_Internalname, localUtil.format(AV44DDO_PedFecEntAuxDate, "99/99/99"), localUtil.format( AV44DDO_PedFecEntAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,93);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_pedfecentauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WCWLPEDPEN.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_pedfecentauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WCWLPEDPEN.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 63 )
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

   public void startYX2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( " Tabla LPEDID", ""), (short)(0)) ;
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
            strupYX0( ) ;
         }
      }
   }

   public void wsYX2( )
   {
      startYX2( ) ;
      evtYX2( ) ;
   }

   public void evtYX2( )
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
                              strupYX0( ) ;
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
                              strupYX0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e11YX2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupYX0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e12YX2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupYX0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e13YX2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupYX0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e14YX2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupYX0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e15YX2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOPDF'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupYX0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoPDF' */
                                 e16YX2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupYX0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e17YX2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupYX0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e18YX2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupYX0( ) ;
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
                              strupYX0( ) ;
                           }
                           nGXsfl_63_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_63_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_63_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_632( ) ;
                           A795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( edtPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A794PrvNom = httpContext.cgiGet( edtPrvNom_Internalname) ;
                           n794PrvNom = false ;
                           A658PedCod = (int)(localUtil.ctol( httpContext.cgiGet( edtPedCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A661PedFec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtPedFec_Internalname), 0)) ;
                           A662PedFecEnt = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtPedFecEnt_Internalname), 0)) ;
                           A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
                           A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
                           A669PedUni = localUtil.ctond( httpContext.cgiGet( edtPedUni_Internalname)) ;
                           A657PedCanEnt = localUtil.ctond( httpContext.cgiGet( edtPedCanEnt_Internalname)) ;
                           A13833CantPdte = localUtil.ctond( httpContext.cgiGet( edtCantPdte_Internalname)) ;
                           A665PedPre = localUtil.ctond( httpContext.cgiGet( edtPedPre_Internalname)) ;
                           AV16Valor = localUtil.ctond( httpContext.cgiGet( edtavValor_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavValor_Internalname, GXutil.ltrimstr( AV16Valor, 11, 2));
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
                                       e19YX2 ();
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
                                       e20YX2 ();
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
                                       e21YX2 ();
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
                                          if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV72FilterFullText) != 0 )
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
                                    strupYX0( ) ;
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

   public void weYX2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseFormYX2( ) ;
         }
      }
   }

   public void paYX2( )
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
      subsflControlProps_632( ) ;
      while ( nGXsfl_63_idx <= nRC_GXsfl_63 )
      {
         sendrow_632( ) ;
         nGXsfl_63_idx = ((subGrid_Islastpage==1)&&(nGXsfl_63_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_63_idx+1) ;
         sGXsfl_63_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_63_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_632( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV72FilterFullText ,
                                 String AV66Emprcod ,
                                 java.util.Date AV67PedFec ,
                                 java.util.Date AV68PedFec_to ,
                                 int AV69PrvNum ,
                                 int AV70PrvNum_to ,
                                 byte AV26ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV21ColumnsSelector ,
                                 int AV28TFPrvNum ,
                                 int AV29TFPrvNum_To ,
                                 String AV31TFPrvNom ,
                                 String AV32TFPrvNom_Sel ,
                                 int AV34TFPedCod ,
                                 int AV35TFPedCod_To ,
                                 java.util.Date AV37TFPedFec ,
                                 java.util.Date AV42TFPedFecEnt ,
                                 String AV47TFPrdNum ,
                                 String AV48TFPrdNum_Sel ,
                                 String AV50TFPrdNom ,
                                 String AV51TFPrdNom_Sel ,
                                 java.math.BigDecimal AV53TFPedUni ,
                                 java.math.BigDecimal AV54TFPedUni_To ,
                                 java.math.BigDecimal AV56TFPedCanEnt ,
                                 java.math.BigDecimal AV57TFPedCanEnt_To ,
                                 java.math.BigDecimal AV74TFCantPdte ,
                                 java.math.BigDecimal AV75TFCantPdte_To ,
                                 java.math.BigDecimal AV59TFPedPre ,
                                 java.math.BigDecimal AV60TFPedPre_To ,
                                 String AV80Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 String AV71Lindsdo0 ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e20YX2 ();
      GRID_nCurrentRecord = 0 ;
      rfYX2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"WCWLPEDPEN");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV80Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("wcwlpedpen:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rfYX2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV80Pgmname = "WCWLPEDPEN" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80Pgmname", AV80Pgmname);
      Gx_err = (short)(0) ;
      edtavPedfec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPedfec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPedfec_Enabled), 5, 0), true);
      edtavPedfec_to_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPedfec_to_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPedfec_to_Enabled), 5, 0), true);
      edtavPrvnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrvnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrvnum_Enabled), 5, 0), true);
      edtavPrvnum_to_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrvnum_to_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrvnum_to_Enabled), 5, 0), true);
      edtavValor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavValor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavValor_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rfYX2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(63) ;
      /* Execute user event: Refresh */
      e20YX2 ();
      nGXsfl_63_idx = 1 ;
      sGXsfl_63_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_63_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_632( ) ;
      bGXsfl_63_Refreshing = true ;
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
         subsflControlProps_632( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV84Wcwlpedpends_1_filterfulltext ,
                                              Integer.valueOf(AV85Wcwlpedpends_2_tfprvnum) ,
                                              Integer.valueOf(AV86Wcwlpedpends_3_tfprvnum_to) ,
                                              AV88Wcwlpedpends_5_tfprvnom_sel ,
                                              AV87Wcwlpedpends_4_tfprvnom ,
                                              Integer.valueOf(AV89Wcwlpedpends_6_tfpedcod) ,
                                              Integer.valueOf(AV90Wcwlpedpends_7_tfpedcod_to) ,
                                              AV91Wcwlpedpends_8_tfpedfec ,
                                              AV92Wcwlpedpends_9_tfpedfecent ,
                                              AV94Wcwlpedpends_11_tfprdnum_sel ,
                                              AV93Wcwlpedpends_10_tfprdnum ,
                                              AV96Wcwlpedpends_13_tfprdnom_sel ,
                                              AV95Wcwlpedpends_12_tfprdnom ,
                                              AV97Wcwlpedpends_14_tfpeduni ,
                                              AV98Wcwlpedpends_15_tfpeduni_to ,
                                              AV99Wcwlpedpends_16_tfpedcanent ,
                                              AV100Wcwlpedpends_17_tfpedcanent_to ,
                                              AV101Wcwlpedpends_18_tfcantpdte ,
                                              AV102Wcwlpedpends_19_tfcantpdte_to ,
                                              AV103Wcwlpedpends_20_tfpedpre ,
                                              AV104Wcwlpedpends_21_tfpedpre_to ,
                                              Integer.valueOf(A795PrvNum) ,
                                              A794PrvNom ,
                                              Integer.valueOf(A658PedCod) ,
                                              A719PrdNum ,
                                              A718PrdNom ,
                                              A669PedUni ,
                                              A657PedCanEnt ,
                                              A665PedPre ,
                                              A661PedFec ,
                                              A662PedFecEnt ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV67PedFec ,
                                              AV68PedFec_to ,
                                              Integer.valueOf(AV69PrvNum) ,
                                              Integer.valueOf(AV70PrvNum_to) ,
                                              AV66Emprcod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV84Wcwlpedpends_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV84Wcwlpedpends_1_filterfulltext), "%", "") ;
         lV84Wcwlpedpends_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV84Wcwlpedpends_1_filterfulltext), "%", "") ;
         lV84Wcwlpedpends_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV84Wcwlpedpends_1_filterfulltext), "%", "") ;
         lV84Wcwlpedpends_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV84Wcwlpedpends_1_filterfulltext), "%", "") ;
         lV84Wcwlpedpends_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV84Wcwlpedpends_1_filterfulltext), "%", "") ;
         lV84Wcwlpedpends_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV84Wcwlpedpends_1_filterfulltext), "%", "") ;
         lV84Wcwlpedpends_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV84Wcwlpedpends_1_filterfulltext), "%", "") ;
         lV84Wcwlpedpends_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV84Wcwlpedpends_1_filterfulltext), "%", "") ;
         lV84Wcwlpedpends_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV84Wcwlpedpends_1_filterfulltext), "%", "") ;
         lV87Wcwlpedpends_4_tfprvnom = GXutil.padr( GXutil.rtrim( AV87Wcwlpedpends_4_tfprvnom), 30, "%") ;
         lV93Wcwlpedpends_10_tfprdnum = GXutil.padr( GXutil.rtrim( AV93Wcwlpedpends_10_tfprdnum), 6, "%") ;
         lV95Wcwlpedpends_12_tfprdnom = GXutil.padr( GXutil.rtrim( AV95Wcwlpedpends_12_tfprdnom), 26, "%") ;
         /* Using cursor H00YX2 */
         pr_default.execute(0, new Object[] {AV66Emprcod, AV67PedFec, AV68PedFec_to, Integer.valueOf(AV69PrvNum), Integer.valueOf(AV70PrvNum_to), lV84Wcwlpedpends_1_filterfulltext, lV84Wcwlpedpends_1_filterfulltext, lV84Wcwlpedpends_1_filterfulltext, lV84Wcwlpedpends_1_filterfulltext, lV84Wcwlpedpends_1_filterfulltext, lV84Wcwlpedpends_1_filterfulltext, lV84Wcwlpedpends_1_filterfulltext, lV84Wcwlpedpends_1_filterfulltext, lV84Wcwlpedpends_1_filterfulltext, Integer.valueOf(AV85Wcwlpedpends_2_tfprvnum), Integer.valueOf(AV86Wcwlpedpends_3_tfprvnum_to), lV87Wcwlpedpends_4_tfprvnom, AV88Wcwlpedpends_5_tfprvnom_sel, Integer.valueOf(AV89Wcwlpedpends_6_tfpedcod), Integer.valueOf(AV90Wcwlpedpends_7_tfpedcod_to), AV91Wcwlpedpends_8_tfpedfec, AV92Wcwlpedpends_9_tfpedfecent, lV93Wcwlpedpends_10_tfprdnum, AV94Wcwlpedpends_11_tfprdnum_sel, lV95Wcwlpedpends_12_tfprdnom, AV96Wcwlpedpends_13_tfprdnom_sel, AV97Wcwlpedpends_14_tfpeduni, AV98Wcwlpedpends_15_tfpeduni_to, AV99Wcwlpedpends_16_tfpedcanent, AV100Wcwlpedpends_17_tfpedcanent_to, AV101Wcwlpedpends_18_tfcantpdte, AV102Wcwlpedpends_19_tfcantpdte_to, AV103Wcwlpedpends_20_tfpedpre, AV104Wcwlpedpends_21_tfpedpre_to, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_63_idx = 1 ;
         sGXsfl_63_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_63_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_632( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H00YX2_A396EmprCod[0] ;
            A665PedPre = H00YX2_A665PedPre[0] ;
            A718PrdNom = H00YX2_A718PrdNom[0] ;
            A719PrdNum = H00YX2_A719PrdNum[0] ;
            A662PedFecEnt = H00YX2_A662PedFecEnt[0] ;
            A661PedFec = H00YX2_A661PedFec[0] ;
            A658PedCod = H00YX2_A658PedCod[0] ;
            A794PrvNom = H00YX2_A794PrvNom[0] ;
            n794PrvNom = H00YX2_n794PrvNom[0] ;
            A795PrvNum = H00YX2_A795PrvNum[0] ;
            A657PedCanEnt = H00YX2_A657PedCanEnt[0] ;
            A669PedUni = H00YX2_A669PedUni[0] ;
            A718PrdNom = H00YX2_A718PrdNom[0] ;
            A795PrvNum = H00YX2_A795PrvNum[0] ;
            A794PrvNom = H00YX2_A794PrvNom[0] ;
            n794PrvNom = H00YX2_n794PrvNom[0] ;
            A662PedFecEnt = H00YX2_A662PedFecEnt[0] ;
            A661PedFec = H00YX2_A661PedFec[0] ;
            A13833CantPdte = (A669PedUni.subtract(A657PedCanEnt)) ;
            e21YX2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(63) ;
         wbYX0( ) ;
      }
      bGXsfl_63_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesYX2( )
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
      AV84Wcwlpedpends_1_filterfulltext = AV72FilterFullText ;
      AV85Wcwlpedpends_2_tfprvnum = AV28TFPrvNum ;
      AV86Wcwlpedpends_3_tfprvnum_to = AV29TFPrvNum_To ;
      AV87Wcwlpedpends_4_tfprvnom = AV31TFPrvNom ;
      AV88Wcwlpedpends_5_tfprvnom_sel = AV32TFPrvNom_Sel ;
      AV89Wcwlpedpends_6_tfpedcod = AV34TFPedCod ;
      AV90Wcwlpedpends_7_tfpedcod_to = AV35TFPedCod_To ;
      AV91Wcwlpedpends_8_tfpedfec = AV37TFPedFec ;
      AV92Wcwlpedpends_9_tfpedfecent = AV42TFPedFecEnt ;
      AV93Wcwlpedpends_10_tfprdnum = AV47TFPrdNum ;
      AV94Wcwlpedpends_11_tfprdnum_sel = AV48TFPrdNum_Sel ;
      AV95Wcwlpedpends_12_tfprdnom = AV50TFPrdNom ;
      AV96Wcwlpedpends_13_tfprdnom_sel = AV51TFPrdNom_Sel ;
      AV97Wcwlpedpends_14_tfpeduni = AV53TFPedUni ;
      AV98Wcwlpedpends_15_tfpeduni_to = AV54TFPedUni_To ;
      AV99Wcwlpedpends_16_tfpedcanent = AV56TFPedCanEnt ;
      AV100Wcwlpedpends_17_tfpedcanent_to = AV57TFPedCanEnt_To ;
      AV101Wcwlpedpends_18_tfcantpdte = AV74TFCantPdte ;
      AV102Wcwlpedpends_19_tfcantpdte_to = AV75TFCantPdte_To ;
      AV103Wcwlpedpends_20_tfpedpre = AV59TFPedPre ;
      AV104Wcwlpedpends_21_tfpedpre_to = AV60TFPedPre_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV84Wcwlpedpends_1_filterfulltext ,
                                           Integer.valueOf(AV85Wcwlpedpends_2_tfprvnum) ,
                                           Integer.valueOf(AV86Wcwlpedpends_3_tfprvnum_to) ,
                                           AV88Wcwlpedpends_5_tfprvnom_sel ,
                                           AV87Wcwlpedpends_4_tfprvnom ,
                                           Integer.valueOf(AV89Wcwlpedpends_6_tfpedcod) ,
                                           Integer.valueOf(AV90Wcwlpedpends_7_tfpedcod_to) ,
                                           AV91Wcwlpedpends_8_tfpedfec ,
                                           AV92Wcwlpedpends_9_tfpedfecent ,
                                           AV94Wcwlpedpends_11_tfprdnum_sel ,
                                           AV93Wcwlpedpends_10_tfprdnum ,
                                           AV96Wcwlpedpends_13_tfprdnom_sel ,
                                           AV95Wcwlpedpends_12_tfprdnom ,
                                           AV97Wcwlpedpends_14_tfpeduni ,
                                           AV98Wcwlpedpends_15_tfpeduni_to ,
                                           AV99Wcwlpedpends_16_tfpedcanent ,
                                           AV100Wcwlpedpends_17_tfpedcanent_to ,
                                           AV101Wcwlpedpends_18_tfcantpdte ,
                                           AV102Wcwlpedpends_19_tfcantpdte_to ,
                                           AV103Wcwlpedpends_20_tfpedpre ,
                                           AV104Wcwlpedpends_21_tfpedpre_to ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           Integer.valueOf(A658PedCod) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A669PedUni ,
                                           A657PedCanEnt ,
                                           A665PedPre ,
                                           A661PedFec ,
                                           A662PedFecEnt ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV67PedFec ,
                                           AV68PedFec_to ,
                                           Integer.valueOf(AV69PrvNum) ,
                                           Integer.valueOf(AV70PrvNum_to) ,
                                           AV66Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV84Wcwlpedpends_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV84Wcwlpedpends_1_filterfulltext), "%", "") ;
      lV84Wcwlpedpends_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV84Wcwlpedpends_1_filterfulltext), "%", "") ;
      lV84Wcwlpedpends_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV84Wcwlpedpends_1_filterfulltext), "%", "") ;
      lV84Wcwlpedpends_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV84Wcwlpedpends_1_filterfulltext), "%", "") ;
      lV84Wcwlpedpends_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV84Wcwlpedpends_1_filterfulltext), "%", "") ;
      lV84Wcwlpedpends_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV84Wcwlpedpends_1_filterfulltext), "%", "") ;
      lV84Wcwlpedpends_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV84Wcwlpedpends_1_filterfulltext), "%", "") ;
      lV84Wcwlpedpends_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV84Wcwlpedpends_1_filterfulltext), "%", "") ;
      lV84Wcwlpedpends_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV84Wcwlpedpends_1_filterfulltext), "%", "") ;
      lV87Wcwlpedpends_4_tfprvnom = GXutil.padr( GXutil.rtrim( AV87Wcwlpedpends_4_tfprvnom), 30, "%") ;
      lV93Wcwlpedpends_10_tfprdnum = GXutil.padr( GXutil.rtrim( AV93Wcwlpedpends_10_tfprdnum), 6, "%") ;
      lV95Wcwlpedpends_12_tfprdnom = GXutil.padr( GXutil.rtrim( AV95Wcwlpedpends_12_tfprdnom), 26, "%") ;
      /* Using cursor H00YX3 */
      pr_default.execute(1, new Object[] {AV66Emprcod, AV67PedFec, AV68PedFec_to, Integer.valueOf(AV69PrvNum), Integer.valueOf(AV70PrvNum_to), lV84Wcwlpedpends_1_filterfulltext, lV84Wcwlpedpends_1_filterfulltext, lV84Wcwlpedpends_1_filterfulltext, lV84Wcwlpedpends_1_filterfulltext, lV84Wcwlpedpends_1_filterfulltext, lV84Wcwlpedpends_1_filterfulltext, lV84Wcwlpedpends_1_filterfulltext, lV84Wcwlpedpends_1_filterfulltext, lV84Wcwlpedpends_1_filterfulltext, Integer.valueOf(AV85Wcwlpedpends_2_tfprvnum), Integer.valueOf(AV86Wcwlpedpends_3_tfprvnum_to), lV87Wcwlpedpends_4_tfprvnom, AV88Wcwlpedpends_5_tfprvnom_sel, Integer.valueOf(AV89Wcwlpedpends_6_tfpedcod), Integer.valueOf(AV90Wcwlpedpends_7_tfpedcod_to), AV91Wcwlpedpends_8_tfpedfec, AV92Wcwlpedpends_9_tfpedfecent, lV93Wcwlpedpends_10_tfprdnum, AV94Wcwlpedpends_11_tfprdnum_sel, lV95Wcwlpedpends_12_tfprdnom, AV96Wcwlpedpends_13_tfprdnom_sel, AV97Wcwlpedpends_14_tfpeduni, AV98Wcwlpedpends_15_tfpeduni_to, AV99Wcwlpedpends_16_tfpedcanent, AV100Wcwlpedpends_17_tfpedcanent_to, AV101Wcwlpedpends_18_tfcantpdte, AV102Wcwlpedpends_19_tfcantpdte_to, AV103Wcwlpedpends_20_tfpedpre, AV104Wcwlpedpends_21_tfpedpre_to});
      GRID_nRecordCount = H00YX3_AGRID_nRecordCount[0] ;
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
      AV84Wcwlpedpends_1_filterfulltext = AV72FilterFullText ;
      AV85Wcwlpedpends_2_tfprvnum = AV28TFPrvNum ;
      AV86Wcwlpedpends_3_tfprvnum_to = AV29TFPrvNum_To ;
      AV87Wcwlpedpends_4_tfprvnom = AV31TFPrvNom ;
      AV88Wcwlpedpends_5_tfprvnom_sel = AV32TFPrvNom_Sel ;
      AV89Wcwlpedpends_6_tfpedcod = AV34TFPedCod ;
      AV90Wcwlpedpends_7_tfpedcod_to = AV35TFPedCod_To ;
      AV91Wcwlpedpends_8_tfpedfec = AV37TFPedFec ;
      AV92Wcwlpedpends_9_tfpedfecent = AV42TFPedFecEnt ;
      AV93Wcwlpedpends_10_tfprdnum = AV47TFPrdNum ;
      AV94Wcwlpedpends_11_tfprdnum_sel = AV48TFPrdNum_Sel ;
      AV95Wcwlpedpends_12_tfprdnom = AV50TFPrdNom ;
      AV96Wcwlpedpends_13_tfprdnom_sel = AV51TFPrdNom_Sel ;
      AV97Wcwlpedpends_14_tfpeduni = AV53TFPedUni ;
      AV98Wcwlpedpends_15_tfpeduni_to = AV54TFPedUni_To ;
      AV99Wcwlpedpends_16_tfpedcanent = AV56TFPedCanEnt ;
      AV100Wcwlpedpends_17_tfpedcanent_to = AV57TFPedCanEnt_To ;
      AV101Wcwlpedpends_18_tfcantpdte = AV74TFCantPdte ;
      AV102Wcwlpedpends_19_tfcantpdte_to = AV75TFCantPdte_To ;
      AV103Wcwlpedpends_20_tfpedpre = AV59TFPedPre ;
      AV104Wcwlpedpends_21_tfpedpre_to = AV60TFPedPre_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV72FilterFullText, AV66Emprcod, AV67PedFec, AV68PedFec_to, AV69PrvNum, AV70PrvNum_to, AV26ManageFiltersExecutionStep, AV21ColumnsSelector, AV28TFPrvNum, AV29TFPrvNum_To, AV31TFPrvNom, AV32TFPrvNom_Sel, AV34TFPedCod, AV35TFPedCod_To, AV37TFPedFec, AV42TFPedFecEnt, AV47TFPrdNum, AV48TFPrdNum_Sel, AV50TFPrdNom, AV51TFPrdNom_Sel, AV53TFPedUni, AV54TFPedUni_To, AV56TFPedCanEnt, AV57TFPedCanEnt_To, AV74TFCantPdte, AV75TFCantPdte_To, AV59TFPedPre, AV60TFPedPre_To, AV80Pgmname, AV12OrderedBy, AV13OrderedDsc, AV71Lindsdo0, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV84Wcwlpedpends_1_filterfulltext = AV72FilterFullText ;
      AV85Wcwlpedpends_2_tfprvnum = AV28TFPrvNum ;
      AV86Wcwlpedpends_3_tfprvnum_to = AV29TFPrvNum_To ;
      AV87Wcwlpedpends_4_tfprvnom = AV31TFPrvNom ;
      AV88Wcwlpedpends_5_tfprvnom_sel = AV32TFPrvNom_Sel ;
      AV89Wcwlpedpends_6_tfpedcod = AV34TFPedCod ;
      AV90Wcwlpedpends_7_tfpedcod_to = AV35TFPedCod_To ;
      AV91Wcwlpedpends_8_tfpedfec = AV37TFPedFec ;
      AV92Wcwlpedpends_9_tfpedfecent = AV42TFPedFecEnt ;
      AV93Wcwlpedpends_10_tfprdnum = AV47TFPrdNum ;
      AV94Wcwlpedpends_11_tfprdnum_sel = AV48TFPrdNum_Sel ;
      AV95Wcwlpedpends_12_tfprdnom = AV50TFPrdNom ;
      AV96Wcwlpedpends_13_tfprdnom_sel = AV51TFPrdNom_Sel ;
      AV97Wcwlpedpends_14_tfpeduni = AV53TFPedUni ;
      AV98Wcwlpedpends_15_tfpeduni_to = AV54TFPedUni_To ;
      AV99Wcwlpedpends_16_tfpedcanent = AV56TFPedCanEnt ;
      AV100Wcwlpedpends_17_tfpedcanent_to = AV57TFPedCanEnt_To ;
      AV101Wcwlpedpends_18_tfcantpdte = AV74TFCantPdte ;
      AV102Wcwlpedpends_19_tfcantpdte_to = AV75TFCantPdte_To ;
      AV103Wcwlpedpends_20_tfpedpre = AV59TFPedPre ;
      AV104Wcwlpedpends_21_tfpedpre_to = AV60TFPedPre_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV72FilterFullText, AV66Emprcod, AV67PedFec, AV68PedFec_to, AV69PrvNum, AV70PrvNum_to, AV26ManageFiltersExecutionStep, AV21ColumnsSelector, AV28TFPrvNum, AV29TFPrvNum_To, AV31TFPrvNom, AV32TFPrvNom_Sel, AV34TFPedCod, AV35TFPedCod_To, AV37TFPedFec, AV42TFPedFecEnt, AV47TFPrdNum, AV48TFPrdNum_Sel, AV50TFPrdNom, AV51TFPrdNom_Sel, AV53TFPedUni, AV54TFPedUni_To, AV56TFPedCanEnt, AV57TFPedCanEnt_To, AV74TFCantPdte, AV75TFCantPdte_To, AV59TFPedPre, AV60TFPedPre_To, AV80Pgmname, AV12OrderedBy, AV13OrderedDsc, AV71Lindsdo0, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV84Wcwlpedpends_1_filterfulltext = AV72FilterFullText ;
      AV85Wcwlpedpends_2_tfprvnum = AV28TFPrvNum ;
      AV86Wcwlpedpends_3_tfprvnum_to = AV29TFPrvNum_To ;
      AV87Wcwlpedpends_4_tfprvnom = AV31TFPrvNom ;
      AV88Wcwlpedpends_5_tfprvnom_sel = AV32TFPrvNom_Sel ;
      AV89Wcwlpedpends_6_tfpedcod = AV34TFPedCod ;
      AV90Wcwlpedpends_7_tfpedcod_to = AV35TFPedCod_To ;
      AV91Wcwlpedpends_8_tfpedfec = AV37TFPedFec ;
      AV92Wcwlpedpends_9_tfpedfecent = AV42TFPedFecEnt ;
      AV93Wcwlpedpends_10_tfprdnum = AV47TFPrdNum ;
      AV94Wcwlpedpends_11_tfprdnum_sel = AV48TFPrdNum_Sel ;
      AV95Wcwlpedpends_12_tfprdnom = AV50TFPrdNom ;
      AV96Wcwlpedpends_13_tfprdnom_sel = AV51TFPrdNom_Sel ;
      AV97Wcwlpedpends_14_tfpeduni = AV53TFPedUni ;
      AV98Wcwlpedpends_15_tfpeduni_to = AV54TFPedUni_To ;
      AV99Wcwlpedpends_16_tfpedcanent = AV56TFPedCanEnt ;
      AV100Wcwlpedpends_17_tfpedcanent_to = AV57TFPedCanEnt_To ;
      AV101Wcwlpedpends_18_tfcantpdte = AV74TFCantPdte ;
      AV102Wcwlpedpends_19_tfcantpdte_to = AV75TFCantPdte_To ;
      AV103Wcwlpedpends_20_tfpedpre = AV59TFPedPre ;
      AV104Wcwlpedpends_21_tfpedpre_to = AV60TFPedPre_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV72FilterFullText, AV66Emprcod, AV67PedFec, AV68PedFec_to, AV69PrvNum, AV70PrvNum_to, AV26ManageFiltersExecutionStep, AV21ColumnsSelector, AV28TFPrvNum, AV29TFPrvNum_To, AV31TFPrvNom, AV32TFPrvNom_Sel, AV34TFPedCod, AV35TFPedCod_To, AV37TFPedFec, AV42TFPedFecEnt, AV47TFPrdNum, AV48TFPrdNum_Sel, AV50TFPrdNom, AV51TFPrdNom_Sel, AV53TFPedUni, AV54TFPedUni_To, AV56TFPedCanEnt, AV57TFPedCanEnt_To, AV74TFCantPdte, AV75TFCantPdte_To, AV59TFPedPre, AV60TFPedPre_To, AV80Pgmname, AV12OrderedBy, AV13OrderedDsc, AV71Lindsdo0, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV84Wcwlpedpends_1_filterfulltext = AV72FilterFullText ;
      AV85Wcwlpedpends_2_tfprvnum = AV28TFPrvNum ;
      AV86Wcwlpedpends_3_tfprvnum_to = AV29TFPrvNum_To ;
      AV87Wcwlpedpends_4_tfprvnom = AV31TFPrvNom ;
      AV88Wcwlpedpends_5_tfprvnom_sel = AV32TFPrvNom_Sel ;
      AV89Wcwlpedpends_6_tfpedcod = AV34TFPedCod ;
      AV90Wcwlpedpends_7_tfpedcod_to = AV35TFPedCod_To ;
      AV91Wcwlpedpends_8_tfpedfec = AV37TFPedFec ;
      AV92Wcwlpedpends_9_tfpedfecent = AV42TFPedFecEnt ;
      AV93Wcwlpedpends_10_tfprdnum = AV47TFPrdNum ;
      AV94Wcwlpedpends_11_tfprdnum_sel = AV48TFPrdNum_Sel ;
      AV95Wcwlpedpends_12_tfprdnom = AV50TFPrdNom ;
      AV96Wcwlpedpends_13_tfprdnom_sel = AV51TFPrdNom_Sel ;
      AV97Wcwlpedpends_14_tfpeduni = AV53TFPedUni ;
      AV98Wcwlpedpends_15_tfpeduni_to = AV54TFPedUni_To ;
      AV99Wcwlpedpends_16_tfpedcanent = AV56TFPedCanEnt ;
      AV100Wcwlpedpends_17_tfpedcanent_to = AV57TFPedCanEnt_To ;
      AV101Wcwlpedpends_18_tfcantpdte = AV74TFCantPdte ;
      AV102Wcwlpedpends_19_tfcantpdte_to = AV75TFCantPdte_To ;
      AV103Wcwlpedpends_20_tfpedpre = AV59TFPedPre ;
      AV104Wcwlpedpends_21_tfpedpre_to = AV60TFPedPre_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV72FilterFullText, AV66Emprcod, AV67PedFec, AV68PedFec_to, AV69PrvNum, AV70PrvNum_to, AV26ManageFiltersExecutionStep, AV21ColumnsSelector, AV28TFPrvNum, AV29TFPrvNum_To, AV31TFPrvNom, AV32TFPrvNom_Sel, AV34TFPedCod, AV35TFPedCod_To, AV37TFPedFec, AV42TFPedFecEnt, AV47TFPrdNum, AV48TFPrdNum_Sel, AV50TFPrdNom, AV51TFPrdNom_Sel, AV53TFPedUni, AV54TFPedUni_To, AV56TFPedCanEnt, AV57TFPedCanEnt_To, AV74TFCantPdte, AV75TFCantPdte_To, AV59TFPedPre, AV60TFPedPre_To, AV80Pgmname, AV12OrderedBy, AV13OrderedDsc, AV71Lindsdo0, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV84Wcwlpedpends_1_filterfulltext = AV72FilterFullText ;
      AV85Wcwlpedpends_2_tfprvnum = AV28TFPrvNum ;
      AV86Wcwlpedpends_3_tfprvnum_to = AV29TFPrvNum_To ;
      AV87Wcwlpedpends_4_tfprvnom = AV31TFPrvNom ;
      AV88Wcwlpedpends_5_tfprvnom_sel = AV32TFPrvNom_Sel ;
      AV89Wcwlpedpends_6_tfpedcod = AV34TFPedCod ;
      AV90Wcwlpedpends_7_tfpedcod_to = AV35TFPedCod_To ;
      AV91Wcwlpedpends_8_tfpedfec = AV37TFPedFec ;
      AV92Wcwlpedpends_9_tfpedfecent = AV42TFPedFecEnt ;
      AV93Wcwlpedpends_10_tfprdnum = AV47TFPrdNum ;
      AV94Wcwlpedpends_11_tfprdnum_sel = AV48TFPrdNum_Sel ;
      AV95Wcwlpedpends_12_tfprdnom = AV50TFPrdNom ;
      AV96Wcwlpedpends_13_tfprdnom_sel = AV51TFPrdNom_Sel ;
      AV97Wcwlpedpends_14_tfpeduni = AV53TFPedUni ;
      AV98Wcwlpedpends_15_tfpeduni_to = AV54TFPedUni_To ;
      AV99Wcwlpedpends_16_tfpedcanent = AV56TFPedCanEnt ;
      AV100Wcwlpedpends_17_tfpedcanent_to = AV57TFPedCanEnt_To ;
      AV101Wcwlpedpends_18_tfcantpdte = AV74TFCantPdte ;
      AV102Wcwlpedpends_19_tfcantpdte_to = AV75TFCantPdte_To ;
      AV103Wcwlpedpends_20_tfpedpre = AV59TFPedPre ;
      AV104Wcwlpedpends_21_tfpedpre_to = AV60TFPedPre_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV72FilterFullText, AV66Emprcod, AV67PedFec, AV68PedFec_to, AV69PrvNum, AV70PrvNum_to, AV26ManageFiltersExecutionStep, AV21ColumnsSelector, AV28TFPrvNum, AV29TFPrvNum_To, AV31TFPrvNom, AV32TFPrvNom_Sel, AV34TFPedCod, AV35TFPedCod_To, AV37TFPedFec, AV42TFPedFecEnt, AV47TFPrdNum, AV48TFPrdNum_Sel, AV50TFPrdNom, AV51TFPrdNom_Sel, AV53TFPedUni, AV54TFPedUni_To, AV56TFPedCanEnt, AV57TFPedCanEnt_To, AV74TFCantPdte, AV75TFCantPdte_To, AV59TFPedPre, AV60TFPedPre_To, AV80Pgmname, AV12OrderedBy, AV13OrderedDsc, AV71Lindsdo0, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV80Pgmname = "WCWLPEDPEN" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80Pgmname", AV80Pgmname);
      Gx_err = (short)(0) ;
      edtavPedfec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPedfec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPedfec_Enabled), 5, 0), true);
      edtavPedfec_to_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPedfec_to_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPedfec_to_Enabled), 5, 0), true);
      edtavPrvnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrvnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrvnum_Enabled), 5, 0), true);
      edtavPrvnum_to_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrvnum_to_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrvnum_to_Enabled), 5, 0), true);
      edtavValor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavValor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavValor_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strupYX0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e19YX2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV24ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV62DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV21ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_63 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_63"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV64GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV65GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV66Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV66Emprcod") ;
         wcpOAV67PedFec = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV67PedFec"), 0) ;
         wcpOAV68PedFec_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV68PedFec_to"), 0) ;
         wcpOAV69PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV69PrvNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV70PrvNum_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV70PrvNum_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV71Lindsdo0 = httpContext.cgiGet( sPrefix+"wcpOAV71Lindsdo0") ;
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
         Grid_titlescategories_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_TITLESCATEGORIES_Gridinternalname") ;
         Grid_titlescategories_Gridtitlescategories = httpContext.cgiGet( sPrefix+"GRID_TITLESCATEGORIES_Gridtitlescategories") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hascategories = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascategories")) ;
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
         AV72FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72FilterFullText", AV72FilterFullText);
         AV80Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80Pgmname", AV80Pgmname);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_pedfecauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_PEDFECAUXDATE");
            GX_FocusControl = edtavDdo_pedfecauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV39DDO_PedFecAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39DDO_PedFecAuxDate", localUtil.format(AV39DDO_PedFecAuxDate, "99/99/99"));
         }
         else
         {
            AV39DDO_PedFecAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_pedfecauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39DDO_PedFecAuxDate", localUtil.format(AV39DDO_PedFecAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_pedfecentauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_PEDFECENTAUXDATE");
            GX_FocusControl = edtavDdo_pedfecentauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV44DDO_PedFecEntAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44DDO_PedFecEntAuxDate", localUtil.format(AV44DDO_PedFecEntAuxDate, "99/99/99"));
         }
         else
         {
            AV44DDO_PedFecEntAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_pedfecentauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44DDO_PedFecEntAuxDate", localUtil.format(AV44DDO_PedFecEntAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"WCWLPEDPEN");
         AV80Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80Pgmname", AV80Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV80Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("wcwlpedpen:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV72FilterFullText) != 0 )
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
      e19YX2 ();
      if (returnInSub) return;
   }

   public void e19YX2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV81Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wcwlpedpen_impl.this.GXt_char1 = GXv_char2[0] ;
      AV81Station = GXt_char1 ;
      GXv_char2[0] = AV66Emprcod ;
      GXv_char3[0] = AV82Emprnom ;
      GXv_char4[0] = AV83Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV81Station, GXv_char2, GXv_char3, GXv_char4) ;
      wcwlpedpen_impl.this.AV66Emprcod = GXv_char2[0] ;
      wcwlpedpen_impl.this.AV82Emprnom = GXv_char3[0] ;
      wcwlpedpen_impl.this.AV83Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66Emprcod", AV66Emprcod);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      Grid_titlescategories_Gridinternalname = subGrid_Internalname ;
      ucGrid_titlescategories.sendProperty(context, sPrefix, false, Grid_titlescategories_Internalname, "GridInternalName", Grid_titlescategories_Gridinternalname);
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV62DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV62DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e20YX2( )
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
      if ( AV26ManageFiltersExecutionStep == 1 )
      {
         AV26ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26ManageFiltersExecutionStep", GXutil.str( AV26ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV26ManageFiltersExecutionStep == 2 )
      {
         AV26ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26ManageFiltersExecutionStep", GXutil.str( AV26ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV23Session.getValue("WCWLPEDPENColumnsSelector"), "") != 0 )
      {
         AV19ColumnsSelectorXML = AV23Session.getValue("WCWLPEDPENColumnsSelector") ;
         AV21ColumnsSelector.fromxml(AV19ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtPrvNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrvNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNum_Visible), 5, 0), !bGXsfl_63_Refreshing);
      edtPrvNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrvNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNom_Visible), 5, 0), !bGXsfl_63_Refreshing);
      edtPedCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPedCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedCod_Visible), 5, 0), !bGXsfl_63_Refreshing);
      edtPedFec_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPedFec_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedFec_Visible), 5, 0), !bGXsfl_63_Refreshing);
      edtPedFecEnt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPedFecEnt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedFecEnt_Visible), 5, 0), !bGXsfl_63_Refreshing);
      edtPrdNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Visible), 5, 0), !bGXsfl_63_Refreshing);
      edtPrdNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Visible), 5, 0), !bGXsfl_63_Refreshing);
      edtPedUni_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPedUni_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedUni_Visible), 5, 0), !bGXsfl_63_Refreshing);
      edtPedCanEnt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPedCanEnt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedCanEnt_Visible), 5, 0), !bGXsfl_63_Refreshing);
      edtCantPdte_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCantPdte_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCantPdte_Visible), 5, 0), !bGXsfl_63_Refreshing);
      edtPedPre_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPedPre_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedPre_Visible), 5, 0), !bGXsfl_63_Refreshing);
      edtavValor_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavValor_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavValor_Visible), 5, 0), !bGXsfl_63_Refreshing);
      AV64GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64GridCurrentPage), 10, 0));
      AV65GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65GridPageCount), 10, 0));
      AV84Wcwlpedpends_1_filterfulltext = AV72FilterFullText ;
      AV85Wcwlpedpends_2_tfprvnum = AV28TFPrvNum ;
      AV86Wcwlpedpends_3_tfprvnum_to = AV29TFPrvNum_To ;
      AV87Wcwlpedpends_4_tfprvnom = AV31TFPrvNom ;
      AV88Wcwlpedpends_5_tfprvnom_sel = AV32TFPrvNom_Sel ;
      AV89Wcwlpedpends_6_tfpedcod = AV34TFPedCod ;
      AV90Wcwlpedpends_7_tfpedcod_to = AV35TFPedCod_To ;
      AV91Wcwlpedpends_8_tfpedfec = AV37TFPedFec ;
      AV92Wcwlpedpends_9_tfpedfecent = AV42TFPedFecEnt ;
      AV93Wcwlpedpends_10_tfprdnum = AV47TFPrdNum ;
      AV94Wcwlpedpends_11_tfprdnum_sel = AV48TFPrdNum_Sel ;
      AV95Wcwlpedpends_12_tfprdnom = AV50TFPrdNom ;
      AV96Wcwlpedpends_13_tfprdnom_sel = AV51TFPrdNom_Sel ;
      AV97Wcwlpedpends_14_tfpeduni = AV53TFPedUni ;
      AV98Wcwlpedpends_15_tfpeduni_to = AV54TFPedUni_To ;
      AV99Wcwlpedpends_16_tfpedcanent = AV56TFPedCanEnt ;
      AV100Wcwlpedpends_17_tfpedcanent_to = AV57TFPedCanEnt_To ;
      AV101Wcwlpedpends_18_tfcantpdte = AV74TFCantPdte ;
      AV102Wcwlpedpends_19_tfcantpdte_to = AV75TFCantPdte_To ;
      AV103Wcwlpedpends_20_tfpedpre = AV59TFPedPre ;
      AV104Wcwlpedpends_21_tfpedpre_to = AV60TFPedPre_To ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV21ColumnsSelector", AV21ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV24ManageFiltersData", AV24ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e12YX2( )
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
         AV63PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV63PageToGo) ;
      }
   }

   public void e13YX2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e14YX2( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvNum") == 0 )
         {
            AV28TFPrvNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFPrvNum), 6, 0));
            AV29TFPrvNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFPrvNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFPrvNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvNom") == 0 )
         {
            AV31TFPrvNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFPrvNom", AV31TFPrvNom);
            AV32TFPrvNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFPrvNom_Sel", AV32TFPrvNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PedCod") == 0 )
         {
            AV34TFPedCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFPedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFPedCod), 8, 0));
            AV35TFPedCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFPedCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFPedCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PedFec") == 0 )
         {
            AV37TFPedFec = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFPedFec", localUtil.format(AV37TFPedFec, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PedFecEnt") == 0 )
         {
            AV42TFPedFecEnt = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFPedFecEnt", localUtil.format(AV42TFPedFecEnt, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNum") == 0 )
         {
            AV47TFPrdNum = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFPrdNum", AV47TFPrdNum);
            AV48TFPrdNum_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFPrdNum_Sel", AV48TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNom") == 0 )
         {
            AV50TFPrdNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFPrdNom", AV50TFPrdNom);
            AV51TFPrdNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFPrdNom_Sel", AV51TFPrdNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PedUni") == 0 )
         {
            AV53TFPedUni = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFPedUni", GXutil.ltrimstr( AV53TFPedUni, 9, 2));
            AV54TFPedUni_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFPedUni_To", GXutil.ltrimstr( AV54TFPedUni_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PedCanEnt") == 0 )
         {
            AV56TFPedCanEnt = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFPedCanEnt", GXutil.ltrimstr( AV56TFPedCanEnt, 9, 2));
            AV57TFPedCanEnt_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFPedCanEnt_To", GXutil.ltrimstr( AV57TFPedCanEnt_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CantPdte") == 0 )
         {
            AV74TFCantPdte = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74TFCantPdte", GXutil.ltrimstr( AV74TFCantPdte, 12, 2));
            AV75TFCantPdte_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75TFCantPdte_To", GXutil.ltrimstr( AV75TFCantPdte_To, 12, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PedPre") == 0 )
         {
            AV59TFPedPre = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFPedPre", GXutil.ltrimstr( AV59TFPedPre, 14, 5));
            AV60TFPedPre_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFPedPre_To", GXutil.ltrimstr( AV60TFPedPre_To, 14, 5));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e21YX2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV16Valor = GXutil.roundDecimal( (A669PedUni.subtract(A657PedCanEnt)).multiply(A665PedPre), 2) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavValor_Internalname, GXutil.ltrimstr( AV16Valor, 11, 2));
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(63) ;
      }
      sendrow_632( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_63_Refreshing )
      {
         httpContext.doAjaxLoad(63, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e15YX2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV19ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV21ColumnsSelector.fromJSonString(AV19ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "WCWLPEDPENColumnsSelector", ((GXutil.strcmp("", AV19ColumnsSelectorXML)==0) ? "" : AV21ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV21ColumnsSelector", AV21ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV24ManageFiltersData", AV24ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e11YX2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("WCWLPEDPENFilters")),GXutil.URLEncode(GXutil.rtrim(AV80Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV26ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26ManageFiltersExecutionStep", GXutil.str( AV26ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("WCWLPEDPENFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV26ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26ManageFiltersExecutionStep", GXutil.str( AV26ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV25ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "WCWLPEDPENFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         wcwlpedpen_impl.this.GXt_char1 = GXv_char4[0] ;
         AV25ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV25ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV80Pgmname+"GridState", AV25ManageFiltersXml) ;
            AV10GridState.fromxml(AV25ManageFiltersXml, null, null);
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
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV21ColumnsSelector", AV21ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV24ManageFiltersData", AV24ManageFiltersData);
   }

   public void e16YX2( )
   {
      /* 'DoPDF' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.rco0008", new String[] {GXutil.URLEncode(GXutil.rtrim(AV66Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV69PrvNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV70PrvNum_to,6,0)),GXutil.URLEncode(GXutil.formatDateParm(AV67PedFec)),GXutil.URLEncode(GXutil.formatDateParm(AV68PedFec_to)),GXutil.URLEncode(GXutil.rtrim(AV71Lindsdo0))}, new String[] {"EmprCod","PProv","UProv","Fec1","Fec2","LinSdo0"}) , new Object[] {"AV66Emprcod","AV69PrvNum","AV70PrvNum_to","AV67PedFec","AV68PedFec_to","AV71Lindsdo0"});
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV21ColumnsSelector", AV21ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV24ManageFiltersData", AV24ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e17YX2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV17ExcelFilename ;
      GXv_char3[0] = AV18ErrorMessage ;
      new app.wcwlpedpenexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      wcwlpedpen_impl.this.AV17ExcelFilename = GXv_char4[0] ;
      wcwlpedpen_impl.this.AV18ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV17ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV17ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV18ErrorMessage);
      }
   }

   public void e18YX2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.wcwlpedpenexportcsv", new String[] {}, new String[] {}) );
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
      AV21ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrvNum", "", "Proveedor", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrvNom", "", "Nombre", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PedCod", "", "Nº Pedido", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PedFec", "Fecha", "Pedido", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PedFecEnt", "Fecha", "Entrega Prevista", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdNum", "", "Producto", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdNom", "", "Descripcion", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PedUni", "Cantidad", "Pedida", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PedCanEnt", "Cantidad", "Entregada", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CantPdte", "", "Cant Pdte", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PedPre", "", "Precio", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&Valor", "", "Valor Pdte", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV20UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCWLPEDPENColumnsSelector", GXv_char4) ;
      wcwlpedpen_impl.this.GXt_char1 = GXv_char4[0] ;
      AV20UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV20UserCustomValue)==0) ) )
      {
         AV22ColumnsSelectorAux.fromxml(AV20UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector8[0] = AV22ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector9[0] = AV21ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, GXv_SdtWWPColumnsSelector9) ;
         AV22ColumnsSelectorAux = GXv_SdtWWPColumnsSelector8[0] ;
         AV21ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = AV24ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "WCWLPEDPENFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV24ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV72FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72FilterFullText", AV72FilterFullText);
      AV28TFPrvNum = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFPrvNum), 6, 0));
      AV29TFPrvNum_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFPrvNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFPrvNum_To), 6, 0));
      AV31TFPrvNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFPrvNom", AV31TFPrvNom);
      AV32TFPrvNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFPrvNom_Sel", AV32TFPrvNom_Sel);
      AV34TFPedCod = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFPedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFPedCod), 8, 0));
      AV35TFPedCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFPedCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFPedCod_To), 8, 0));
      AV37TFPedFec = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFPedFec", localUtil.format(AV37TFPedFec, "99/99/99"));
      AV42TFPedFecEnt = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFPedFecEnt", localUtil.format(AV42TFPedFecEnt, "99/99/99"));
      AV47TFPrdNum = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFPrdNum", AV47TFPrdNum);
      AV48TFPrdNum_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFPrdNum_Sel", AV48TFPrdNum_Sel);
      AV50TFPrdNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFPrdNom", AV50TFPrdNom);
      AV51TFPrdNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFPrdNom_Sel", AV51TFPrdNom_Sel);
      AV53TFPedUni = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFPedUni", GXutil.ltrimstr( AV53TFPedUni, 9, 2));
      AV54TFPedUni_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFPedUni_To", GXutil.ltrimstr( AV54TFPedUni_To, 9, 2));
      AV56TFPedCanEnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFPedCanEnt", GXutil.ltrimstr( AV56TFPedCanEnt, 9, 2));
      AV57TFPedCanEnt_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFPedCanEnt_To", GXutil.ltrimstr( AV57TFPedCanEnt_To, 9, 2));
      AV74TFCantPdte = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74TFCantPdte", GXutil.ltrimstr( AV74TFCantPdte, 12, 2));
      AV75TFCantPdte_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75TFCantPdte_To", GXutil.ltrimstr( AV75TFCantPdte_To, 12, 2));
      AV59TFPedPre = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFPedPre", GXutil.ltrimstr( AV59TFPedPre, 14, 5));
      AV60TFPedPre_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFPedPre_To", GXutil.ltrimstr( AV60TFPedPre_To, 14, 5));
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
      if ( GXutil.strcmp(AV23Session.getValue(AV80Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV80Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV23Session.getValue(AV80Pgmname+"GridState"), null, null);
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
      AV105GXV1 = 1 ;
      while ( AV105GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV105GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV72FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72FilterFullText", AV72FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNUM") == 0 )
         {
            AV28TFPrvNum = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFPrvNum), 6, 0));
            AV29TFPrvNum_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFPrvNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFPrvNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM") == 0 )
         {
            AV31TFPrvNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFPrvNom", AV31TFPrvNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM_SEL") == 0 )
         {
            AV32TFPrvNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFPrvNom_Sel", AV32TFPrvNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDCOD") == 0 )
         {
            AV34TFPedCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFPedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFPedCod), 8, 0));
            AV35TFPedCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFPedCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFPedCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDFEC") == 0 )
         {
            AV37TFPedFec = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFPedFec", localUtil.format(AV37TFPedFec, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDFECENT") == 0 )
         {
            AV42TFPedFecEnt = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFPedFecEnt", localUtil.format(AV42TFPedFecEnt, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV47TFPrdNum = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFPrdNum", AV47TFPrdNum);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV48TFPrdNum_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFPrdNum_Sel", AV48TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV50TFPrdNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFPrdNom", AV50TFPrdNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV51TFPrdNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFPrdNom_Sel", AV51TFPrdNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDUNI") == 0 )
         {
            AV53TFPedUni = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFPedUni", GXutil.ltrimstr( AV53TFPedUni, 9, 2));
            AV54TFPedUni_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFPedUni_To", GXutil.ltrimstr( AV54TFPedUni_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDCANENT") == 0 )
         {
            AV56TFPedCanEnt = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFPedCanEnt", GXutil.ltrimstr( AV56TFPedCanEnt, 9, 2));
            AV57TFPedCanEnt_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFPedCanEnt_To", GXutil.ltrimstr( AV57TFPedCanEnt_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCANTPDTE") == 0 )
         {
            AV74TFCantPdte = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74TFCantPdte", GXutil.ltrimstr( AV74TFCantPdte, 12, 2));
            AV75TFCantPdte_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75TFCantPdte_To", GXutil.ltrimstr( AV75TFCantPdte_To, 12, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDPRE") == 0 )
         {
            AV59TFPedPre = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFPedPre", GXutil.ltrimstr( AV59TFPedPre, 14, 5));
            AV60TFPedPre_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFPedPre_To", GXutil.ltrimstr( AV60TFPedPre_To, 14, 5));
         }
         AV105GXV1 = (int)(AV105GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV32TFPrvNom_Sel)==0), AV32TFPrvNom_Sel, GXv_char4) ;
      wcwlpedpen_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV48TFPrdNum_Sel)==0), AV48TFPrdNum_Sel, GXv_char3) ;
      wcwlpedpen_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char2[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV51TFPrdNom_Sel)==0), AV51TFPrdNom_Sel, GXv_char2) ;
      wcwlpedpen_impl.this.GXt_char13 = GXv_char2[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"||||"+GXt_char12+"|"+GXt_char13+"|||||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV31TFPrvNom)==0), AV31TFPrvNom, GXv_char4) ;
      wcwlpedpen_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV47TFPrdNum)==0), AV47TFPrdNum, GXv_char3) ;
      wcwlpedpen_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV50TFPrdNom)==0), AV50TFPrdNom, GXv_char2) ;
      wcwlpedpen_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV28TFPrvNum) ? "" : GXutil.str( AV28TFPrvNum, 6, 0))+"|"+GXt_char13+"|"+((0==AV34TFPedCod) ? "" : GXutil.str( AV34TFPedCod, 8, 0))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV37TFPedFec)) ? "" : localUtil.dtoc( AV37TFPedFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV42TFPedFecEnt)) ? "" : localUtil.dtoc( AV42TFPedFecEnt, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char12+"|"+GXt_char1+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFPedUni)==0) ? "" : GXutil.str( AV53TFPedUni, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV56TFPedCanEnt)==0) ? "" : GXutil.str( AV56TFPedCanEnt, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV74TFCantPdte)==0) ? "" : GXutil.str( AV74TFCantPdte, 12, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV59TFPedPre)==0) ? "" : GXutil.str( AV59TFPedPre, 14, 5))+"|" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV29TFPrvNum_To) ? "" : GXutil.str( AV29TFPrvNum_To, 6, 0))+"||"+((0==AV35TFPedCod_To) ? "" : GXutil.str( AV35TFPedCod_To, 8, 0))+"|||||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV54TFPedUni_To)==0) ? "" : GXutil.str( AV54TFPedUni_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV57TFPedCanEnt_To)==0) ? "" : GXutil.str( AV57TFPedCanEnt_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV75TFCantPdte_To)==0) ? "" : GXutil.str( AV75TFCantPdte_To, 12, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV60TFPedPre_To)==0) ? "" : GXutil.str( AV60TFPedPre_To, 14, 5))+"|" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV23Session.getValue(AV80Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV72FilterFullText)==0), (short)(0), AV72FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFPRVNUM", "", !((0==AV28TFPrvNum)&&(0==AV29TFPrvNum_To)), (short)(0), GXutil.trim( GXutil.str( AV28TFPrvNum, 6, 0)), GXutil.trim( GXutil.str( AV29TFPrvNum_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFPRVNOM", "", !(GXutil.strcmp("", AV31TFPrvNom)==0), (short)(0), AV31TFPrvNom, "", !(GXutil.strcmp("", AV32TFPrvNom_Sel)==0), AV32TFPrvNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFPEDCOD", "", !((0==AV34TFPedCod)&&(0==AV35TFPedCod_To)), (short)(0), GXutil.trim( GXutil.str( AV34TFPedCod, 8, 0)), GXutil.trim( GXutil.str( AV35TFPedCod_To, 8, 0))) ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFPEDFEC", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV37TFPedFec)), (short)(0), GXutil.trim( localUtil.dtoc( AV37TFPedFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFPEDFECENT", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV42TFPedFecEnt)), (short)(0), GXutil.trim( localUtil.dtoc( AV42TFPedFecEnt, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFPRDNUM", "", !(GXutil.strcmp("", AV47TFPrdNum)==0), (short)(0), AV47TFPrdNum, "", !(GXutil.strcmp("", AV48TFPrdNum_Sel)==0), AV48TFPrdNum_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFPRDNOM", "", !(GXutil.strcmp("", AV50TFPrdNom)==0), (short)(0), AV50TFPrdNom, "", !(GXutil.strcmp("", AV51TFPrdNom_Sel)==0), AV51TFPrdNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFPEDUNI", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFPedUni)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV54TFPedUni_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV53TFPedUni, 9, 2)), GXutil.trim( GXutil.str( AV54TFPedUni_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFPEDCANENT", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV56TFPedCanEnt)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV57TFPedCanEnt_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV56TFPedCanEnt, 9, 2)), GXutil.trim( GXutil.str( AV57TFPedCanEnt_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFCANTPDTE", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV74TFCantPdte)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV75TFCantPdte_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV74TFCantPdte, 12, 2)), GXutil.trim( GXutil.str( AV75TFCantPdte_To, 12, 2))) ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFPEDPRE", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV59TFPedPre)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV60TFPedPre_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV59TFPedPre, 14, 5)), GXutil.trim( GXutil.str( AV60TFPedPre_To, 14, 5))) ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      if ( ! (GXutil.strcmp("", AV66Emprcod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV66Emprcod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV67PedFec)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PEDFEC" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV67PedFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV68PedFec_to)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PEDFEC_TO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV68PedFec_to, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV69PrvNum) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PRVNUM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV69PrvNum, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV70PrvNum_to) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PRVNUM_TO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV70PrvNum_to, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV71Lindsdo0)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LINDSDO0" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV71Lindsdo0 );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV80Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV80Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "LPEDID" );
      AV23Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_45_YX2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV24ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_50_YX2( true) ;
      }
      else
      {
         wb_table2_50_YX2( false) ;
      }
      return  ;
   }

   public void wb_table2_50_YX2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_45_YX2e( true) ;
      }
      else
      {
         wb_table1_45_YX2e( false) ;
      }
   }

   public void wb_table2_50_YX2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'" + sPrefix + "',false,'" + sGXsfl_63_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV72FilterFullText, GXutil.rtrim( localUtil.format( AV72FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_WCWLPEDPEN.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_50_YX2e( true) ;
      }
      else
      {
         wb_table2_50_YX2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV66Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66Emprcod", AV66Emprcod);
      AV67PedFec = (java.util.Date)getParm(obj,1,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67PedFec", localUtil.format(AV67PedFec, "99/99/99"));
      AV68PedFec_to = (java.util.Date)getParm(obj,2,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68PedFec_to", localUtil.format(AV68PedFec_to, "99/99/99"));
      AV69PrvNum = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69PrvNum), 6, 0));
      AV70PrvNum_to = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70PrvNum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70PrvNum_to), 6, 0));
      AV71Lindsdo0 = (String)getParm(obj,5,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71Lindsdo0", AV71Lindsdo0);
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
      paYX2( ) ;
      wsYX2( ) ;
      weYX2( ) ;
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
      sCtrlAV66Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV67PedFec = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV68PedFec_to = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV69PrvNum = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV70PrvNum_to = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV71Lindsdo0 = (String)getParm(obj,5,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      paYX2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "wcwlpedpen", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      paYX2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV66Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66Emprcod", AV66Emprcod);
         AV67PedFec = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67PedFec", localUtil.format(AV67PedFec, "99/99/99"));
         AV68PedFec_to = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68PedFec_to", localUtil.format(AV68PedFec_to, "99/99/99"));
         AV69PrvNum = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69PrvNum), 6, 0));
         AV70PrvNum_to = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70PrvNum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70PrvNum_to), 6, 0));
         AV71Lindsdo0 = (String)getParm(obj,7,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71Lindsdo0", AV71Lindsdo0);
      }
      wcpOAV66Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV66Emprcod") ;
      wcpOAV67PedFec = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV67PedFec"), 0) ;
      wcpOAV68PedFec_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV68PedFec_to"), 0) ;
      wcpOAV69PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV69PrvNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV70PrvNum_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV70PrvNum_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV71Lindsdo0 = httpContext.cgiGet( sPrefix+"wcpOAV71Lindsdo0") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV66Emprcod, wcpOAV66Emprcod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV67PedFec), GXutil.resetTime(wcpOAV67PedFec)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV68PedFec_to), GXutil.resetTime(wcpOAV68PedFec_to)) ) || ( AV69PrvNum != wcpOAV69PrvNum ) || ( AV70PrvNum_to != wcpOAV70PrvNum_to ) || ( GXutil.strcmp(AV71Lindsdo0, wcpOAV71Lindsdo0) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV66Emprcod = AV66Emprcod ;
      wcpOAV67PedFec = AV67PedFec ;
      wcpOAV68PedFec_to = AV68PedFec_to ;
      wcpOAV69PrvNum = AV69PrvNum ;
      wcpOAV70PrvNum_to = AV70PrvNum_to ;
      wcpOAV71Lindsdo0 = AV71Lindsdo0 ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV66Emprcod = httpContext.cgiGet( sPrefix+"AV66Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV66Emprcod) > 0 )
      {
         AV66Emprcod = httpContext.cgiGet( sCtrlAV66Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66Emprcod", AV66Emprcod);
      }
      else
      {
         AV66Emprcod = httpContext.cgiGet( sPrefix+"AV66Emprcod_PARM") ;
      }
      sCtrlAV67PedFec = httpContext.cgiGet( sPrefix+"AV67PedFec_CTRL") ;
      if ( GXutil.len( sCtrlAV67PedFec) > 0 )
      {
         AV67PedFec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV67PedFec), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67PedFec", localUtil.format(AV67PedFec, "99/99/99"));
      }
      else
      {
         AV67PedFec = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV67PedFec_PARM"), 0) ;
      }
      sCtrlAV68PedFec_to = httpContext.cgiGet( sPrefix+"AV68PedFec_to_CTRL") ;
      if ( GXutil.len( sCtrlAV68PedFec_to) > 0 )
      {
         AV68PedFec_to = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV68PedFec_to), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68PedFec_to", localUtil.format(AV68PedFec_to, "99/99/99"));
      }
      else
      {
         AV68PedFec_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV68PedFec_to_PARM"), 0) ;
      }
      sCtrlAV69PrvNum = httpContext.cgiGet( sPrefix+"AV69PrvNum_CTRL") ;
      if ( GXutil.len( sCtrlAV69PrvNum) > 0 )
      {
         AV69PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV69PrvNum), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69PrvNum), 6, 0));
      }
      else
      {
         AV69PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV69PrvNum_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV70PrvNum_to = httpContext.cgiGet( sPrefix+"AV70PrvNum_to_CTRL") ;
      if ( GXutil.len( sCtrlAV70PrvNum_to) > 0 )
      {
         AV70PrvNum_to = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV70PrvNum_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70PrvNum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70PrvNum_to), 6, 0));
      }
      else
      {
         AV70PrvNum_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV70PrvNum_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV71Lindsdo0 = httpContext.cgiGet( sPrefix+"AV71Lindsdo0_CTRL") ;
      if ( GXutil.len( sCtrlAV71Lindsdo0) > 0 )
      {
         AV71Lindsdo0 = httpContext.cgiGet( sCtrlAV71Lindsdo0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71Lindsdo0", AV71Lindsdo0);
      }
      else
      {
         AV71Lindsdo0 = httpContext.cgiGet( sPrefix+"AV71Lindsdo0_PARM") ;
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
      paYX2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      wsYX2( ) ;
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
      wsYX2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV66Emprcod_PARM", GXutil.rtrim( AV66Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV66Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV66Emprcod_CTRL", GXutil.rtrim( sCtrlAV66Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV67PedFec_PARM", localUtil.dtoc( AV67PedFec, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV67PedFec)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV67PedFec_CTRL", GXutil.rtrim( sCtrlAV67PedFec));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV68PedFec_to_PARM", localUtil.dtoc( AV68PedFec_to, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV68PedFec_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV68PedFec_to_CTRL", GXutil.rtrim( sCtrlAV68PedFec_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV69PrvNum_PARM", GXutil.ltrim( localUtil.ntoc( AV69PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV69PrvNum)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV69PrvNum_CTRL", GXutil.rtrim( sCtrlAV69PrvNum));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV70PrvNum_to_PARM", GXutil.ltrim( localUtil.ntoc( AV70PrvNum_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV70PrvNum_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV70PrvNum_to_CTRL", GXutil.rtrim( sCtrlAV70PrvNum_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV71Lindsdo0_PARM", GXutil.rtrim( AV71Lindsdo0));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV71Lindsdo0)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV71Lindsdo0_CTRL", GXutil.rtrim( sCtrlAV71Lindsdo0));
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
      weYX2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115564212", true, true);
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
      httpContext.AddJavascriptSource("wcwlpedpen.js", "?202682115564212", false, true);
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
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_632( )
   {
      edtPrvNum_Internalname = sPrefix+"PRVNUM_"+sGXsfl_63_idx ;
      edtPrvNom_Internalname = sPrefix+"PRVNOM_"+sGXsfl_63_idx ;
      edtPedCod_Internalname = sPrefix+"PEDCOD_"+sGXsfl_63_idx ;
      edtPedFec_Internalname = sPrefix+"PEDFEC_"+sGXsfl_63_idx ;
      edtPedFecEnt_Internalname = sPrefix+"PEDFECENT_"+sGXsfl_63_idx ;
      edtPrdNum_Internalname = sPrefix+"PRDNUM_"+sGXsfl_63_idx ;
      edtPrdNom_Internalname = sPrefix+"PRDNOM_"+sGXsfl_63_idx ;
      edtPedUni_Internalname = sPrefix+"PEDUNI_"+sGXsfl_63_idx ;
      edtPedCanEnt_Internalname = sPrefix+"PEDCANENT_"+sGXsfl_63_idx ;
      edtCantPdte_Internalname = sPrefix+"CANTPDTE_"+sGXsfl_63_idx ;
      edtPedPre_Internalname = sPrefix+"PEDPRE_"+sGXsfl_63_idx ;
      edtavValor_Internalname = sPrefix+"vVALOR_"+sGXsfl_63_idx ;
   }

   public void subsflControlProps_fel_632( )
   {
      edtPrvNum_Internalname = sPrefix+"PRVNUM_"+sGXsfl_63_fel_idx ;
      edtPrvNom_Internalname = sPrefix+"PRVNOM_"+sGXsfl_63_fel_idx ;
      edtPedCod_Internalname = sPrefix+"PEDCOD_"+sGXsfl_63_fel_idx ;
      edtPedFec_Internalname = sPrefix+"PEDFEC_"+sGXsfl_63_fel_idx ;
      edtPedFecEnt_Internalname = sPrefix+"PEDFECENT_"+sGXsfl_63_fel_idx ;
      edtPrdNum_Internalname = sPrefix+"PRDNUM_"+sGXsfl_63_fel_idx ;
      edtPrdNom_Internalname = sPrefix+"PRDNOM_"+sGXsfl_63_fel_idx ;
      edtPedUni_Internalname = sPrefix+"PEDUNI_"+sGXsfl_63_fel_idx ;
      edtPedCanEnt_Internalname = sPrefix+"PEDCANENT_"+sGXsfl_63_fel_idx ;
      edtCantPdte_Internalname = sPrefix+"CANTPDTE_"+sGXsfl_63_fel_idx ;
      edtPedPre_Internalname = sPrefix+"PEDPRE_"+sGXsfl_63_fel_idx ;
      edtavValor_Internalname = sPrefix+"vVALOR_"+sGXsfl_63_fel_idx ;
   }

   public void sendrow_632( )
   {
      subsflControlProps_632( ) ;
      wbYX0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_63_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_63_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_63_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrvNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvNum_Internalname,GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrvNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrvNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrvNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvNom_Internalname,GXutil.rtrim( A794PrvNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrvNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrvNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPedCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPedCod_Internalname,GXutil.ltrim( localUtil.ntoc( A658PedCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A658PedCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPedCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPedCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPedFec_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPedFec_Internalname,localUtil.format(A661PedFec, "99/99/99"),localUtil.format( A661PedFec, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPedFec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPedFec_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPedFecEnt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPedFecEnt_Internalname,localUtil.format(A662PedFecEnt, "99/99/99"),localUtil.format( A662PedFecEnt, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPedFecEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPedFecEnt_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNom_Internalname,GXutil.rtrim( A718PrdNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPedUni_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPedUni_Internalname,GXutil.ltrim( localUtil.ntoc( A669PedUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A669PedUni, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPedUni_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPedUni_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPedCanEnt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPedCanEnt_Internalname,GXutil.ltrim( localUtil.ntoc( A657PedCanEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A657PedCanEnt, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPedCanEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPedCanEnt_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCantPdte_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCantPdte_Internalname,GXutil.ltrim( localUtil.ntoc( A13833CantPdte, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A13833CantPdte, "ZZZZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCantPdte_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCantPdte_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPedPre_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPedPre_Internalname,GXutil.ltrim( localUtil.ntoc( A665PedPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A665PedPre, "ZZZZZZZ9.999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPedPre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPedPre_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavValor_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavValor_Internalname,GXutil.ltrim( localUtil.ntoc( AV16Valor, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavValor_Enabled!=0) ? localUtil.format( AV16Valor, "ZZZZZZZ9.99") : localUtil.format( AV16Valor, "ZZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavValor_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavValor_Visible),Integer.valueOf(edtavValor_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashesYX2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_63_idx = ((subGrid_Islastpage==1)&&(nGXsfl_63_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_63_idx+1) ;
         sGXsfl_63_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_63_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_632( ) ;
      }
      /* End function sendrow_632 */
   }

   public void startgridcontrol63( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"63\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrvNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Proveedor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrvNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPedCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Pedido", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPedFec_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pedido", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPedFecEnt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Entrega Prevista", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPedUni_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pedida", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPedCanEnt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Entregada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCantPdte_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cant Pdte", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPedPre_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Precio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavValor_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Valor Pdte", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrvNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A794PrvNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrvNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A658PedCod, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPedCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A661PedFec, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPedFec_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A662PedFecEnt, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPedFecEnt_Visible, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A669PedUni, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPedUni_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A657PedCanEnt, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPedCanEnt_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13833CantPdte, (byte)(12), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCantPdte_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A665PedPre, (byte)(14), (byte)(5), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPedPre_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV16Valor, (byte)(11), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavValor_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavValor_Visible, (byte)(5), (byte)(0), ".", "")));
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
      edtavPedfec_Internalname = sPrefix+"vPEDFEC" ;
      edtavPedfec_to_Internalname = sPrefix+"vPEDFEC_TO" ;
      edtavPrvnum_Internalname = sPrefix+"vPRVNUM" ;
      edtavPrvnum_to_Internalname = sPrefix+"vPRVNUM_TO" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      bttBtnexport_Internalname = sPrefix+"BTNEXPORT" ;
      bttBtnexportcsv_Internalname = sPrefix+"BTNEXPORTCSV" ;
      bttBtnpdf_Internalname = sPrefix+"BTNPDF" ;
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtPrvNum_Internalname = sPrefix+"PRVNUM" ;
      edtPrvNom_Internalname = sPrefix+"PRVNOM" ;
      edtPedCod_Internalname = sPrefix+"PEDCOD" ;
      edtPedFec_Internalname = sPrefix+"PEDFEC" ;
      edtPedFecEnt_Internalname = sPrefix+"PEDFECENT" ;
      edtPrdNum_Internalname = sPrefix+"PRDNUM" ;
      edtPrdNom_Internalname = sPrefix+"PRDNOM" ;
      edtPedUni_Internalname = sPrefix+"PEDUNI" ;
      edtPedCanEnt_Internalname = sPrefix+"PEDCANENT" ;
      edtCantPdte_Internalname = sPrefix+"CANTPDTE" ;
      edtPedPre_Internalname = sPrefix+"PEDPRE" ;
      edtavValor_Internalname = sPrefix+"vVALOR" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_titlescategories_Internalname = sPrefix+"GRID_TITLESCATEGORIES" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      edtavDdo_pedfecauxdate_Internalname = sPrefix+"vDDO_PEDFECAUXDATE" ;
      divDdo_pedfecauxdates_Internalname = sPrefix+"DDO_PEDFECAUXDATES" ;
      edtavDdo_pedfecentauxdate_Internalname = sPrefix+"vDDO_PEDFECENTAUXDATE" ;
      divDdo_pedfecentauxdates_Internalname = sPrefix+"DDO_PEDFECENTAUXDATES" ;
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
      edtavValor_Jsonclick = "" ;
      edtavValor_Enabled = 0 ;
      edtPedPre_Jsonclick = "" ;
      edtCantPdte_Jsonclick = "" ;
      edtPedCanEnt_Jsonclick = "" ;
      edtPedUni_Jsonclick = "" ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNum_Jsonclick = "" ;
      edtPedFecEnt_Jsonclick = "" ;
      edtPedFec_Jsonclick = "" ;
      edtPedCod_Jsonclick = "" ;
      edtPrvNom_Jsonclick = "" ;
      edtPrvNum_Jsonclick = "" ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavValor_Visible = -1 ;
      edtPedPre_Visible = -1 ;
      edtCantPdte_Visible = -1 ;
      edtPedCanEnt_Visible = -1 ;
      edtPedUni_Visible = -1 ;
      edtPrdNom_Visible = -1 ;
      edtPrdNum_Visible = -1 ;
      edtPedFecEnt_Visible = -1 ;
      edtPedFec_Visible = -1 ;
      edtPedCod_Visible = -1 ;
      edtPrvNom_Visible = -1 ;
      edtPrvNum_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_pedfecentauxdate_Jsonclick = "" ;
      edtavDdo_pedfecauxdate_Jsonclick = "" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavPrvnum_to_Jsonclick = "" ;
      edtavPrvnum_to_Enabled = 0 ;
      edtavPrvnum_Jsonclick = "" ;
      edtavPrvnum_Enabled = 0 ;
      edtavPedfec_to_Jsonclick = "" ;
      edtavPedfec_to_Enabled = 0 ;
      edtavPedfec_Jsonclick = "" ;
      edtavPedfec_Enabled = 0 ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hascategories = GXutil.toBoolean( -1) ;
      Grid_titlescategories_Gridtitlescategories = ";;;Fecha;Fecha;;;Cantidad;Cantidad;;;" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "WCWLPEDPENGetFilterData" ;
      Ddo_grid_Datalisttype = "|Dynamic||||Dynamic|Dynamic|||||" ;
      Ddo_grid_Includedatalist = "|T||||T|T|||||" ;
      Ddo_grid_Filterisrange = "T||T|||||T|T|T|T|" ;
      Ddo_grid_Filtertype = "Numeric|Character|Numeric|Date|Date|Character|Character|Numeric|Numeric|Numeric|Numeric|" ;
      Ddo_grid_Includefilter = "T|T|T|T|T|T|T|T|T|T|T|" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T|T|T|T|T|T|T|T||T|" ;
      Ddo_grid_Columnssortvalues = "2|4|5|3|6|7|8|1|9||10|" ;
      Ddo_grid_Columnids = "0:PrvNum|1:PrvNom|2:PedCod|3:PedFec|4:PedFecEnt|5:PrdNum|6:PrdNom|7:PedUni|8:PedCanEnt|9:CantPdte|10:PedPre|11:Valor" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV26ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV21ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV72FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV66Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV67PedFec',fld:'vPEDFEC',pic:''},{av:'AV68PedFec_to',fld:'vPEDFEC_TO',pic:''},{av:'AV69PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV70PrvNum_to',fld:'vPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV28TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV29TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV31TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV32TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV34TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV35TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV37TFPedFec',fld:'vTFPEDFEC',pic:''},{av:'AV42TFPedFecEnt',fld:'vTFPEDFECENT',pic:''},{av:'AV47TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV48TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV50TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV51TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV53TFPedUni',fld:'vTFPEDUNI',pic:'ZZZZZ9.99'},{av:'AV54TFPedUni_To',fld:'vTFPEDUNI_TO',pic:'ZZZZZ9.99'},{av:'AV56TFPedCanEnt',fld:'vTFPEDCANENT',pic:'ZZZZZ9.99'},{av:'AV57TFPedCanEnt_To',fld:'vTFPEDCANENT_TO',pic:'ZZZZZ9.99'},{av:'AV74TFCantPdte',fld:'vTFCANTPDTE',pic:'ZZZZZZZZ9.99'},{av:'AV75TFCantPdte_To',fld:'vTFCANTPDTE_TO',pic:'ZZZZZZZZ9.99'},{av:'AV59TFPedPre',fld:'vTFPEDPRE',pic:'ZZZZZZZ9.999'},{av:'AV60TFPedPre_To',fld:'vTFPEDPRE_TO',pic:'ZZZZZZZ9.999'},{av:'AV80Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV71Lindsdo0',fld:'vLINDSDO0',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV26ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV21ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtPrvNum_Visible',ctrl:'PRVNUM',prop:'Visible'},{av:'edtPrvNom_Visible',ctrl:'PRVNOM',prop:'Visible'},{av:'edtPedCod_Visible',ctrl:'PEDCOD',prop:'Visible'},{av:'edtPedFec_Visible',ctrl:'PEDFEC',prop:'Visible'},{av:'edtPedFecEnt_Visible',ctrl:'PEDFECENT',prop:'Visible'},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtPedUni_Visible',ctrl:'PEDUNI',prop:'Visible'},{av:'edtPedCanEnt_Visible',ctrl:'PEDCANENT',prop:'Visible'},{av:'edtCantPdte_Visible',ctrl:'CANTPDTE',prop:'Visible'},{av:'edtPedPre_Visible',ctrl:'PEDPRE',prop:'Visible'},{av:'edtavValor_Visible',ctrl:'vVALOR',prop:'Visible'},{av:'AV64GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV65GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV24ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e12YX2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV72FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV66Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV67PedFec',fld:'vPEDFEC',pic:''},{av:'AV68PedFec_to',fld:'vPEDFEC_TO',pic:''},{av:'AV69PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV70PrvNum_to',fld:'vPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV26ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV21ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV28TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV29TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV31TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV32TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV34TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV35TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV37TFPedFec',fld:'vTFPEDFEC',pic:''},{av:'AV42TFPedFecEnt',fld:'vTFPEDFECENT',pic:''},{av:'AV47TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV48TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV50TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV51TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV53TFPedUni',fld:'vTFPEDUNI',pic:'ZZZZZ9.99'},{av:'AV54TFPedUni_To',fld:'vTFPEDUNI_TO',pic:'ZZZZZ9.99'},{av:'AV56TFPedCanEnt',fld:'vTFPEDCANENT',pic:'ZZZZZ9.99'},{av:'AV57TFPedCanEnt_To',fld:'vTFPEDCANENT_TO',pic:'ZZZZZ9.99'},{av:'AV74TFCantPdte',fld:'vTFCANTPDTE',pic:'ZZZZZZZZ9.99'},{av:'AV75TFCantPdte_To',fld:'vTFCANTPDTE_TO',pic:'ZZZZZZZZ9.99'},{av:'AV59TFPedPre',fld:'vTFPEDPRE',pic:'ZZZZZZZ9.999'},{av:'AV60TFPedPre_To',fld:'vTFPEDPRE_TO',pic:'ZZZZZZZ9.999'},{av:'AV80Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV71Lindsdo0',fld:'vLINDSDO0',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e13YX2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV72FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV66Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV67PedFec',fld:'vPEDFEC',pic:''},{av:'AV68PedFec_to',fld:'vPEDFEC_TO',pic:''},{av:'AV69PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV70PrvNum_to',fld:'vPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV26ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV21ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV28TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV29TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV31TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV32TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV34TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV35TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV37TFPedFec',fld:'vTFPEDFEC',pic:''},{av:'AV42TFPedFecEnt',fld:'vTFPEDFECENT',pic:''},{av:'AV47TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV48TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV50TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV51TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV53TFPedUni',fld:'vTFPEDUNI',pic:'ZZZZZ9.99'},{av:'AV54TFPedUni_To',fld:'vTFPEDUNI_TO',pic:'ZZZZZ9.99'},{av:'AV56TFPedCanEnt',fld:'vTFPEDCANENT',pic:'ZZZZZ9.99'},{av:'AV57TFPedCanEnt_To',fld:'vTFPEDCANENT_TO',pic:'ZZZZZ9.99'},{av:'AV74TFCantPdte',fld:'vTFCANTPDTE',pic:'ZZZZZZZZ9.99'},{av:'AV75TFCantPdte_To',fld:'vTFCANTPDTE_TO',pic:'ZZZZZZZZ9.99'},{av:'AV59TFPedPre',fld:'vTFPEDPRE',pic:'ZZZZZZZ9.999'},{av:'AV60TFPedPre_To',fld:'vTFPEDPRE_TO',pic:'ZZZZZZZ9.999'},{av:'AV80Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV71Lindsdo0',fld:'vLINDSDO0',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e14YX2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV72FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV66Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV67PedFec',fld:'vPEDFEC',pic:''},{av:'AV68PedFec_to',fld:'vPEDFEC_TO',pic:''},{av:'AV69PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV70PrvNum_to',fld:'vPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV26ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV21ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV28TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV29TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV31TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV32TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV34TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV35TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV37TFPedFec',fld:'vTFPEDFEC',pic:''},{av:'AV42TFPedFecEnt',fld:'vTFPEDFECENT',pic:''},{av:'AV47TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV48TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV50TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV51TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV53TFPedUni',fld:'vTFPEDUNI',pic:'ZZZZZ9.99'},{av:'AV54TFPedUni_To',fld:'vTFPEDUNI_TO',pic:'ZZZZZ9.99'},{av:'AV56TFPedCanEnt',fld:'vTFPEDCANENT',pic:'ZZZZZ9.99'},{av:'AV57TFPedCanEnt_To',fld:'vTFPEDCANENT_TO',pic:'ZZZZZ9.99'},{av:'AV74TFCantPdte',fld:'vTFCANTPDTE',pic:'ZZZZZZZZ9.99'},{av:'AV75TFCantPdte_To',fld:'vTFCANTPDTE_TO',pic:'ZZZZZZZZ9.99'},{av:'AV59TFPedPre',fld:'vTFPEDPRE',pic:'ZZZZZZZ9.999'},{av:'AV60TFPedPre_To',fld:'vTFPEDPRE_TO',pic:'ZZZZZZZ9.999'},{av:'AV80Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV71Lindsdo0',fld:'vLINDSDO0',pic:''},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV59TFPedPre',fld:'vTFPEDPRE',pic:'ZZZZZZZ9.999'},{av:'AV60TFPedPre_To',fld:'vTFPEDPRE_TO',pic:'ZZZZZZZ9.999'},{av:'AV74TFCantPdte',fld:'vTFCANTPDTE',pic:'ZZZZZZZZ9.99'},{av:'AV75TFCantPdte_To',fld:'vTFCANTPDTE_TO',pic:'ZZZZZZZZ9.99'},{av:'AV56TFPedCanEnt',fld:'vTFPEDCANENT',pic:'ZZZZZ9.99'},{av:'AV57TFPedCanEnt_To',fld:'vTFPEDCANENT_TO',pic:'ZZZZZ9.99'},{av:'AV53TFPedUni',fld:'vTFPEDUNI',pic:'ZZZZZ9.99'},{av:'AV54TFPedUni_To',fld:'vTFPEDUNI_TO',pic:'ZZZZZ9.99'},{av:'AV50TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV51TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV47TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV48TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV42TFPedFecEnt',fld:'vTFPEDFECENT',pic:''},{av:'AV37TFPedFec',fld:'vTFPEDFEC',pic:''},{av:'AV34TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV35TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV31TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV32TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV28TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV29TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e21YX2',iparms:[{av:'A669PedUni',fld:'PEDUNI',pic:'ZZZZZ9.99'},{av:'A657PedCanEnt',fld:'PEDCANENT',pic:'ZZZZZ9.99'},{av:'A665PedPre',fld:'PEDPRE',pic:'ZZZZZZZ9.999'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV16Valor',fld:'vVALOR',pic:'ZZZZZZZ9.99'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e15YX2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV72FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV66Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV67PedFec',fld:'vPEDFEC',pic:''},{av:'AV68PedFec_to',fld:'vPEDFEC_TO',pic:''},{av:'AV69PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV70PrvNum_to',fld:'vPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV26ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV21ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV28TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV29TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV31TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV32TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV34TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV35TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV37TFPedFec',fld:'vTFPEDFEC',pic:''},{av:'AV42TFPedFecEnt',fld:'vTFPEDFECENT',pic:''},{av:'AV47TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV48TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV50TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV51TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV53TFPedUni',fld:'vTFPEDUNI',pic:'ZZZZZ9.99'},{av:'AV54TFPedUni_To',fld:'vTFPEDUNI_TO',pic:'ZZZZZ9.99'},{av:'AV56TFPedCanEnt',fld:'vTFPEDCANENT',pic:'ZZZZZ9.99'},{av:'AV57TFPedCanEnt_To',fld:'vTFPEDCANENT_TO',pic:'ZZZZZ9.99'},{av:'AV74TFCantPdte',fld:'vTFCANTPDTE',pic:'ZZZZZZZZ9.99'},{av:'AV75TFCantPdte_To',fld:'vTFCANTPDTE_TO',pic:'ZZZZZZZZ9.99'},{av:'AV59TFPedPre',fld:'vTFPEDPRE',pic:'ZZZZZZZ9.999'},{av:'AV60TFPedPre_To',fld:'vTFPEDPRE_TO',pic:'ZZZZZZZ9.999'},{av:'AV80Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV71Lindsdo0',fld:'vLINDSDO0',pic:''},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV21ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtPrvNum_Visible',ctrl:'PRVNUM',prop:'Visible'},{av:'edtPrvNom_Visible',ctrl:'PRVNOM',prop:'Visible'},{av:'edtPedCod_Visible',ctrl:'PEDCOD',prop:'Visible'},{av:'edtPedFec_Visible',ctrl:'PEDFEC',prop:'Visible'},{av:'edtPedFecEnt_Visible',ctrl:'PEDFECENT',prop:'Visible'},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtPedUni_Visible',ctrl:'PEDUNI',prop:'Visible'},{av:'edtPedCanEnt_Visible',ctrl:'PEDCANENT',prop:'Visible'},{av:'edtCantPdte_Visible',ctrl:'CANTPDTE',prop:'Visible'},{av:'edtPedPre_Visible',ctrl:'PEDPRE',prop:'Visible'},{av:'edtavValor_Visible',ctrl:'vVALOR',prop:'Visible'},{av:'AV64GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV65GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV24ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e11YX2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV72FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV66Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV67PedFec',fld:'vPEDFEC',pic:''},{av:'AV68PedFec_to',fld:'vPEDFEC_TO',pic:''},{av:'AV69PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV70PrvNum_to',fld:'vPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV26ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV21ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV28TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV29TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV31TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV32TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV34TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV35TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV37TFPedFec',fld:'vTFPEDFEC',pic:''},{av:'AV42TFPedFecEnt',fld:'vTFPEDFECENT',pic:''},{av:'AV47TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV48TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV50TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV51TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV53TFPedUni',fld:'vTFPEDUNI',pic:'ZZZZZ9.99'},{av:'AV54TFPedUni_To',fld:'vTFPEDUNI_TO',pic:'ZZZZZ9.99'},{av:'AV56TFPedCanEnt',fld:'vTFPEDCANENT',pic:'ZZZZZ9.99'},{av:'AV57TFPedCanEnt_To',fld:'vTFPEDCANENT_TO',pic:'ZZZZZ9.99'},{av:'AV74TFCantPdte',fld:'vTFCANTPDTE',pic:'ZZZZZZZZ9.99'},{av:'AV75TFCantPdte_To',fld:'vTFCANTPDTE_TO',pic:'ZZZZZZZZ9.99'},{av:'AV59TFPedPre',fld:'vTFPEDPRE',pic:'ZZZZZZZ9.999'},{av:'AV60TFPedPre_To',fld:'vTFPEDPRE_TO',pic:'ZZZZZZZ9.999'},{av:'AV80Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV71Lindsdo0',fld:'vLINDSDO0',pic:''},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV26ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV72FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV29TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV31TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV32TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV34TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV35TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV37TFPedFec',fld:'vTFPEDFEC',pic:''},{av:'AV42TFPedFecEnt',fld:'vTFPEDFECENT',pic:''},{av:'AV47TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV48TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV50TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV51TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV53TFPedUni',fld:'vTFPEDUNI',pic:'ZZZZZ9.99'},{av:'AV54TFPedUni_To',fld:'vTFPEDUNI_TO',pic:'ZZZZZ9.99'},{av:'AV56TFPedCanEnt',fld:'vTFPEDCANENT',pic:'ZZZZZ9.99'},{av:'AV57TFPedCanEnt_To',fld:'vTFPEDCANENT_TO',pic:'ZZZZZ9.99'},{av:'AV74TFCantPdte',fld:'vTFCANTPDTE',pic:'ZZZZZZZZ9.99'},{av:'AV75TFCantPdte_To',fld:'vTFCANTPDTE_TO',pic:'ZZZZZZZZ9.99'},{av:'AV59TFPedPre',fld:'vTFPEDPRE',pic:'ZZZZZZZ9.999'},{av:'AV60TFPedPre_To',fld:'vTFPEDPRE_TO',pic:'ZZZZZZZ9.999'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV21ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtPrvNum_Visible',ctrl:'PRVNUM',prop:'Visible'},{av:'edtPrvNom_Visible',ctrl:'PRVNOM',prop:'Visible'},{av:'edtPedCod_Visible',ctrl:'PEDCOD',prop:'Visible'},{av:'edtPedFec_Visible',ctrl:'PEDFEC',prop:'Visible'},{av:'edtPedFecEnt_Visible',ctrl:'PEDFECENT',prop:'Visible'},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtPedUni_Visible',ctrl:'PEDUNI',prop:'Visible'},{av:'edtPedCanEnt_Visible',ctrl:'PEDCANENT',prop:'Visible'},{av:'edtCantPdte_Visible',ctrl:'CANTPDTE',prop:'Visible'},{av:'edtPedPre_Visible',ctrl:'PEDPRE',prop:'Visible'},{av:'edtavValor_Visible',ctrl:'vVALOR',prop:'Visible'},{av:'AV64GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV65GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV24ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DOPDF'","{handler:'e16YX2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV72FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV66Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV67PedFec',fld:'vPEDFEC',pic:''},{av:'AV68PedFec_to',fld:'vPEDFEC_TO',pic:''},{av:'AV69PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV70PrvNum_to',fld:'vPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV26ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV21ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV28TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV29TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV31TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV32TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV34TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV35TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV37TFPedFec',fld:'vTFPEDFEC',pic:''},{av:'AV42TFPedFecEnt',fld:'vTFPEDFECENT',pic:''},{av:'AV47TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV48TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV50TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV51TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV53TFPedUni',fld:'vTFPEDUNI',pic:'ZZZZZ9.99'},{av:'AV54TFPedUni_To',fld:'vTFPEDUNI_TO',pic:'ZZZZZ9.99'},{av:'AV56TFPedCanEnt',fld:'vTFPEDCANENT',pic:'ZZZZZ9.99'},{av:'AV57TFPedCanEnt_To',fld:'vTFPEDCANENT_TO',pic:'ZZZZZ9.99'},{av:'AV74TFCantPdte',fld:'vTFCANTPDTE',pic:'ZZZZZZZZ9.99'},{av:'AV75TFCantPdte_To',fld:'vTFCANTPDTE_TO',pic:'ZZZZZZZZ9.99'},{av:'AV59TFPedPre',fld:'vTFPEDPRE',pic:'ZZZZZZZ9.999'},{av:'AV60TFPedPre_To',fld:'vTFPEDPRE_TO',pic:'ZZZZZZZ9.999'},{av:'AV80Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV71Lindsdo0',fld:'vLINDSDO0',pic:''},{av:'sPrefix'}]");
      setEventMetadata("'DOPDF'",",oparms:[{av:'AV71Lindsdo0',fld:'vLINDSDO0',pic:''},{av:'AV68PedFec_to',fld:'vPEDFEC_TO',pic:''},{av:'AV67PedFec',fld:'vPEDFEC',pic:''},{av:'AV70PrvNum_to',fld:'vPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV69PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV66Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV26ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV21ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtPrvNum_Visible',ctrl:'PRVNUM',prop:'Visible'},{av:'edtPrvNom_Visible',ctrl:'PRVNOM',prop:'Visible'},{av:'edtPedCod_Visible',ctrl:'PEDCOD',prop:'Visible'},{av:'edtPedFec_Visible',ctrl:'PEDFEC',prop:'Visible'},{av:'edtPedFecEnt_Visible',ctrl:'PEDFECENT',prop:'Visible'},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtPedUni_Visible',ctrl:'PEDUNI',prop:'Visible'},{av:'edtPedCanEnt_Visible',ctrl:'PEDCANENT',prop:'Visible'},{av:'edtCantPdte_Visible',ctrl:'CANTPDTE',prop:'Visible'},{av:'edtPedPre_Visible',ctrl:'PEDPRE',prop:'Visible'},{av:'edtavValor_Visible',ctrl:'vVALOR',prop:'Visible'},{av:'AV64GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV65GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV24ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e17YX2',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e18YX2',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VALID_PRVNUM","{handler:'valid_Prvnum',iparms:[]");
      setEventMetadata("VALID_PRVNUM",",oparms:[]}");
      setEventMetadata("VALID_PEDCOD","{handler:'valid_Pedcod',iparms:[]");
      setEventMetadata("VALID_PEDCOD",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[]");
      setEventMetadata("VALID_PRDNUM",",oparms:[]}");
      setEventMetadata("VALID_PEDUNI","{handler:'valid_Peduni',iparms:[]");
      setEventMetadata("VALID_PEDUNI",",oparms:[]}");
      setEventMetadata("VALID_PEDCANENT","{handler:'valid_Pedcanent',iparms:[]");
      setEventMetadata("VALID_PEDCANENT",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Valor',iparms:[]");
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
      wcpOAV66Emprcod = "" ;
      wcpOAV67PedFec = GXutil.nullDate() ;
      wcpOAV68PedFec_to = GXutil.nullDate() ;
      wcpOAV71Lindsdo0 = "" ;
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
      AV66Emprcod = "" ;
      AV67PedFec = GXutil.nullDate() ;
      AV68PedFec_to = GXutil.nullDate() ;
      AV71Lindsdo0 = "" ;
      AV72FilterFullText = "" ;
      AV21ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV31TFPrvNom = "" ;
      AV32TFPrvNom_Sel = "" ;
      AV37TFPedFec = GXutil.nullDate() ;
      AV42TFPedFecEnt = GXutil.nullDate() ;
      AV47TFPrdNum = "" ;
      AV48TFPrdNum_Sel = "" ;
      AV50TFPrdNom = "" ;
      AV51TFPrdNom_Sel = "" ;
      AV53TFPedUni = DecimalUtil.ZERO ;
      AV54TFPedUni_To = DecimalUtil.ZERO ;
      AV56TFPedCanEnt = DecimalUtil.ZERO ;
      AV57TFPedCanEnt_To = DecimalUtil.ZERO ;
      AV74TFCantPdte = DecimalUtil.ZERO ;
      AV75TFCantPdte_To = DecimalUtil.ZERO ;
      AV59TFPedPre = DecimalUtil.ZERO ;
      AV60TFPedPre_To = DecimalUtil.ZERO ;
      AV80Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV24ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV62DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_titlescategories_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtnpdf_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_titlescategories = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV39DDO_PedFecAuxDate = GXutil.nullDate() ;
      AV44DDO_PedFecEntAuxDate = GXutil.nullDate() ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A794PrvNom = "" ;
      A661PedFec = GXutil.nullDate() ;
      A662PedFecEnt = GXutil.nullDate() ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A669PedUni = DecimalUtil.ZERO ;
      A657PedCanEnt = DecimalUtil.ZERO ;
      A13833CantPdte = DecimalUtil.ZERO ;
      A665PedPre = DecimalUtil.ZERO ;
      AV16Valor = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV84Wcwlpedpends_1_filterfulltext = "" ;
      lV87Wcwlpedpends_4_tfprvnom = "" ;
      lV93Wcwlpedpends_10_tfprdnum = "" ;
      lV95Wcwlpedpends_12_tfprdnom = "" ;
      AV84Wcwlpedpends_1_filterfulltext = "" ;
      AV88Wcwlpedpends_5_tfprvnom_sel = "" ;
      AV87Wcwlpedpends_4_tfprvnom = "" ;
      AV91Wcwlpedpends_8_tfpedfec = GXutil.nullDate() ;
      AV92Wcwlpedpends_9_tfpedfecent = GXutil.nullDate() ;
      AV94Wcwlpedpends_11_tfprdnum_sel = "" ;
      AV93Wcwlpedpends_10_tfprdnum = "" ;
      AV96Wcwlpedpends_13_tfprdnom_sel = "" ;
      AV95Wcwlpedpends_12_tfprdnom = "" ;
      AV97Wcwlpedpends_14_tfpeduni = DecimalUtil.ZERO ;
      AV98Wcwlpedpends_15_tfpeduni_to = DecimalUtil.ZERO ;
      AV99Wcwlpedpends_16_tfpedcanent = DecimalUtil.ZERO ;
      AV100Wcwlpedpends_17_tfpedcanent_to = DecimalUtil.ZERO ;
      AV101Wcwlpedpends_18_tfcantpdte = DecimalUtil.ZERO ;
      AV102Wcwlpedpends_19_tfcantpdte_to = DecimalUtil.ZERO ;
      AV103Wcwlpedpends_20_tfpedpre = DecimalUtil.ZERO ;
      AV104Wcwlpedpends_21_tfpedpre_to = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      H00YX2_A396EmprCod = new String[] {""} ;
      H00YX2_A665PedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00YX2_A718PrdNom = new String[] {""} ;
      H00YX2_A719PrdNum = new String[] {""} ;
      H00YX2_A662PedFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      H00YX2_A661PedFec = new java.util.Date[] {GXutil.nullDate()} ;
      H00YX2_A658PedCod = new int[1] ;
      H00YX2_A794PrvNom = new String[] {""} ;
      H00YX2_n794PrvNom = new boolean[] {false} ;
      H00YX2_A795PrvNum = new int[1] ;
      H00YX2_A657PedCanEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00YX2_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00YX3_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV81Station = "" ;
      AV82Emprnom = "" ;
      AV83Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV23Session = httpContext.getWebSession();
      AV19ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV25ManageFiltersXml = "" ;
      AV17ExcelFilename = "" ;
      AV18ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      AV22ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
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
      sCtrlAV66Emprcod = "" ;
      sCtrlAV67PedFec = "" ;
      sCtrlAV68PedFec_to = "" ;
      sCtrlAV69PrvNum = "" ;
      sCtrlAV70PrvNum_to = "" ;
      sCtrlAV71Lindsdo0 = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcwlpedpen__default(),
         new Object[] {
             new Object[] {
            H00YX2_A396EmprCod, H00YX2_A665PedPre, H00YX2_A718PrdNom, H00YX2_A719PrdNum, H00YX2_A662PedFecEnt, H00YX2_A661PedFec, H00YX2_A658PedCod, H00YX2_A794PrvNom, H00YX2_n794PrvNom, H00YX2_A795PrvNum,
            H00YX2_A657PedCanEnt, H00YX2_A669PedUni
            }
            , new Object[] {
            H00YX3_AGRID_nRecordCount
            }
         }
      );
      AV80Pgmname = "WCWLPEDPEN" ;
      /* GeneXus formulas. */
      AV80Pgmname = "WCWLPEDPEN" ;
      Gx_err = (short)(0) ;
      edtavPedfec_Enabled = 0 ;
      edtavPedfec_to_Enabled = 0 ;
      edtavPrvnum_Enabled = 0 ;
      edtavPrvnum_to_Enabled = 0 ;
      edtavValor_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV26ManageFiltersExecutionStep ;
   private byte nDraw ;
   private byte nDoneStart ;
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
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV69PrvNum ;
   private int wcpOAV70PrvNum_to ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_63 ;
   private int AV69PrvNum ;
   private int AV70PrvNum_to ;
   private int nGXsfl_63_idx=1 ;
   private int AV28TFPrvNum ;
   private int AV29TFPrvNum_To ;
   private int AV34TFPedCod ;
   private int AV35TFPedCod_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPedfec_Enabled ;
   private int edtavPedfec_to_Enabled ;
   private int edtavPrvnum_Enabled ;
   private int edtavPrvnum_to_Enabled ;
   private int edtavPgmname_Enabled ;
   private int A795PrvNum ;
   private int A658PedCod ;
   private int subGrid_Islastpage ;
   private int edtavValor_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV85Wcwlpedpends_2_tfprvnum ;
   private int AV86Wcwlpedpends_3_tfprvnum_to ;
   private int AV89Wcwlpedpends_6_tfpedcod ;
   private int AV90Wcwlpedpends_7_tfpedcod_to ;
   private int edtPrvNum_Visible ;
   private int edtPrvNom_Visible ;
   private int edtPedCod_Visible ;
   private int edtPedFec_Visible ;
   private int edtPedFecEnt_Visible ;
   private int edtPrdNum_Visible ;
   private int edtPrdNom_Visible ;
   private int edtPedUni_Visible ;
   private int edtPedCanEnt_Visible ;
   private int edtCantPdte_Visible ;
   private int edtPedPre_Visible ;
   private int edtavValor_Visible ;
   private int AV63PageToGo ;
   private int AV105GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV64GridCurrentPage ;
   private long AV65GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV53TFPedUni ;
   private java.math.BigDecimal AV54TFPedUni_To ;
   private java.math.BigDecimal AV56TFPedCanEnt ;
   private java.math.BigDecimal AV57TFPedCanEnt_To ;
   private java.math.BigDecimal AV74TFCantPdte ;
   private java.math.BigDecimal AV75TFCantPdte_To ;
   private java.math.BigDecimal AV59TFPedPre ;
   private java.math.BigDecimal AV60TFPedPre_To ;
   private java.math.BigDecimal A669PedUni ;
   private java.math.BigDecimal A657PedCanEnt ;
   private java.math.BigDecimal A13833CantPdte ;
   private java.math.BigDecimal A665PedPre ;
   private java.math.BigDecimal AV16Valor ;
   private java.math.BigDecimal AV97Wcwlpedpends_14_tfpeduni ;
   private java.math.BigDecimal AV98Wcwlpedpends_15_tfpeduni_to ;
   private java.math.BigDecimal AV99Wcwlpedpends_16_tfpedcanent ;
   private java.math.BigDecimal AV100Wcwlpedpends_17_tfpedcanent_to ;
   private java.math.BigDecimal AV101Wcwlpedpends_18_tfcantpdte ;
   private java.math.BigDecimal AV102Wcwlpedpends_19_tfcantpdte_to ;
   private java.math.BigDecimal AV103Wcwlpedpends_20_tfpedpre ;
   private java.math.BigDecimal AV104Wcwlpedpends_21_tfpedpre_to ;
   private String wcpOAV66Emprcod ;
   private String wcpOAV71Lindsdo0 ;
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
   private String AV66Emprcod ;
   private String AV71Lindsdo0 ;
   private String sGXsfl_63_idx="0001" ;
   private String AV31TFPrvNom ;
   private String AV32TFPrvNom_Sel ;
   private String AV47TFPrdNum ;
   private String AV48TFPrdNum_Sel ;
   private String AV50TFPrdNom ;
   private String AV51TFPrdNom_Sel ;
   private String AV80Pgmname ;
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
   private String Ddo_gridcolumnsselector_Caption ;
   private String Ddo_gridcolumnsselector_Tooltip ;
   private String Ddo_gridcolumnsselector_Cls ;
   private String Ddo_gridcolumnsselector_Dropdownoptionstype ;
   private String Ddo_gridcolumnsselector_Gridinternalname ;
   private String Ddo_gridcolumnsselector_Titlecontrolidtoreplace ;
   private String Grid_titlescategories_Gridinternalname ;
   private String Grid_titlescategories_Gridtitlescategories ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String edtavPedfec_Internalname ;
   private String edtavPedfec_Jsonclick ;
   private String edtavPedfec_to_Internalname ;
   private String edtavPedfec_to_Jsonclick ;
   private String edtavPrvnum_Internalname ;
   private String edtavPrvnum_Jsonclick ;
   private String edtavPrvnum_to_Internalname ;
   private String edtavPrvnum_to_Jsonclick ;
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
   private String bttBtnpdf_Internalname ;
   private String bttBtnpdf_Jsonclick ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_titlescategories_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_pedfecauxdates_Internalname ;
   private String edtavDdo_pedfecauxdate_Internalname ;
   private String edtavDdo_pedfecauxdate_Jsonclick ;
   private String divDdo_pedfecentauxdates_Internalname ;
   private String edtavDdo_pedfecentauxdate_Internalname ;
   private String edtavDdo_pedfecentauxdate_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavFilterfulltext_Internalname ;
   private String edtPrvNum_Internalname ;
   private String A794PrvNom ;
   private String edtPrvNom_Internalname ;
   private String edtPedCod_Internalname ;
   private String edtPedFec_Internalname ;
   private String edtPedFecEnt_Internalname ;
   private String A719PrdNum ;
   private String edtPrdNum_Internalname ;
   private String A718PrdNom ;
   private String edtPrdNom_Internalname ;
   private String edtPedUni_Internalname ;
   private String edtPedCanEnt_Internalname ;
   private String edtCantPdte_Internalname ;
   private String edtPedPre_Internalname ;
   private String edtavValor_Internalname ;
   private String scmdbuf ;
   private String lV87Wcwlpedpends_4_tfprvnom ;
   private String lV93Wcwlpedpends_10_tfprdnum ;
   private String lV95Wcwlpedpends_12_tfprdnom ;
   private String AV88Wcwlpedpends_5_tfprvnom_sel ;
   private String AV87Wcwlpedpends_4_tfprvnom ;
   private String AV94Wcwlpedpends_11_tfprdnum_sel ;
   private String AV93Wcwlpedpends_10_tfprdnum ;
   private String AV96Wcwlpedpends_13_tfprdnom_sel ;
   private String AV95Wcwlpedpends_12_tfprdnom ;
   private String A396EmprCod ;
   private String hsh ;
   private String AV81Station ;
   private String AV82Emprnom ;
   private String AV83Usurcod ;
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
   private String sCtrlAV66Emprcod ;
   private String sCtrlAV67PedFec ;
   private String sCtrlAV68PedFec_to ;
   private String sCtrlAV69PrvNum ;
   private String sCtrlAV70PrvNum_to ;
   private String sCtrlAV71Lindsdo0 ;
   private String sGXsfl_63_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtPrvNum_Jsonclick ;
   private String edtPrvNom_Jsonclick ;
   private String edtPedCod_Jsonclick ;
   private String edtPedFec_Jsonclick ;
   private String edtPedFecEnt_Jsonclick ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdNom_Jsonclick ;
   private String edtPedUni_Jsonclick ;
   private String edtPedCanEnt_Jsonclick ;
   private String edtCantPdte_Jsonclick ;
   private String edtPedPre_Jsonclick ;
   private String edtavValor_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV67PedFec ;
   private java.util.Date wcpOAV68PedFec_to ;
   private java.util.Date AV67PedFec ;
   private java.util.Date AV68PedFec_to ;
   private java.util.Date AV37TFPedFec ;
   private java.util.Date AV42TFPedFecEnt ;
   private java.util.Date AV39DDO_PedFecAuxDate ;
   private java.util.Date AV44DDO_PedFecEntAuxDate ;
   private java.util.Date A661PedFec ;
   private java.util.Date A662PedFecEnt ;
   private java.util.Date AV91Wcwlpedpends_8_tfpedfec ;
   private java.util.Date AV92Wcwlpedpends_9_tfpedfecent ;
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
   private boolean Grid_empowerer_Hascategories ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n794PrvNom ;
   private boolean bGXsfl_63_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV19ColumnsSelectorXML ;
   private String AV25ManageFiltersXml ;
   private String AV20UserCustomValue ;
   private String AV72FilterFullText ;
   private String lV84Wcwlpedpends_1_filterfulltext ;
   private String AV84Wcwlpedpends_1_filterfulltext ;
   private String AV17ExcelFilename ;
   private String AV18ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV23Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_titlescategories ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] H00YX2_A396EmprCod ;
   private java.math.BigDecimal[] H00YX2_A665PedPre ;
   private String[] H00YX2_A718PrdNom ;
   private String[] H00YX2_A719PrdNum ;
   private java.util.Date[] H00YX2_A662PedFecEnt ;
   private java.util.Date[] H00YX2_A661PedFec ;
   private int[] H00YX2_A658PedCod ;
   private String[] H00YX2_A794PrvNom ;
   private boolean[] H00YX2_n794PrvNom ;
   private int[] H00YX2_A795PrvNum ;
   private java.math.BigDecimal[] H00YX2_A657PedCanEnt ;
   private java.math.BigDecimal[] H00YX2_A669PedUni ;
   private long[] H00YX3_AGRID_nRecordCount ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV24ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV21ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV22ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV62DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState14[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

final  class wcwlpedpen__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00YX2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV84Wcwlpedpends_1_filterfulltext ,
                                          int AV85Wcwlpedpends_2_tfprvnum ,
                                          int AV86Wcwlpedpends_3_tfprvnum_to ,
                                          String AV88Wcwlpedpends_5_tfprvnom_sel ,
                                          String AV87Wcwlpedpends_4_tfprvnom ,
                                          int AV89Wcwlpedpends_6_tfpedcod ,
                                          int AV90Wcwlpedpends_7_tfpedcod_to ,
                                          java.util.Date AV91Wcwlpedpends_8_tfpedfec ,
                                          java.util.Date AV92Wcwlpedpends_9_tfpedfecent ,
                                          String AV94Wcwlpedpends_11_tfprdnum_sel ,
                                          String AV93Wcwlpedpends_10_tfprdnum ,
                                          String AV96Wcwlpedpends_13_tfprdnom_sel ,
                                          String AV95Wcwlpedpends_12_tfprdnom ,
                                          java.math.BigDecimal AV97Wcwlpedpends_14_tfpeduni ,
                                          java.math.BigDecimal AV98Wcwlpedpends_15_tfpeduni_to ,
                                          java.math.BigDecimal AV99Wcwlpedpends_16_tfpedcanent ,
                                          java.math.BigDecimal AV100Wcwlpedpends_17_tfpedcanent_to ,
                                          java.math.BigDecimal AV101Wcwlpedpends_18_tfcantpdte ,
                                          java.math.BigDecimal AV102Wcwlpedpends_19_tfcantpdte_to ,
                                          java.math.BigDecimal AV103Wcwlpedpends_20_tfpedpre ,
                                          java.math.BigDecimal AV104Wcwlpedpends_21_tfpedpre_to ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          int A658PedCod ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A669PedUni ,
                                          java.math.BigDecimal A657PedCanEnt ,
                                          java.math.BigDecimal A665PedPre ,
                                          java.util.Date A661PedFec ,
                                          java.util.Date A662PedFecEnt ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          java.util.Date AV67PedFec ,
                                          java.util.Date AV68PedFec_to ,
                                          int AV69PrvNum ,
                                          int AV70PrvNum_to ,
                                          String AV66Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int15 = new byte[39];
      Object[] GXv_Object16 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.EmprCod, T1.PedPre, T2.PrdNom, T1.PrdNum, T4.PedFecEnt, T4.PedFec, T1.PedCod, T3.PrvNom, T2.PrvNum, T1.PedCanEnt, T1.PedUni" ;
      sFromString = " FROM (((TXPLPEDID T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPPRVGEN T3 ON T3.EmprCod = T1.EmprCod AND T3.PrvNum" ;
      sFromString += " = T2.PrvNum) INNER JOIN TXPCPEDID T4 ON T4.EmprCod = T1.EmprCod AND T4.PedCod = T1.PedCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T4.PedFec >= ?)");
      addWhere(sWhereString, "(T4.PedFec <= ?)");
      addWhere(sWhereString, "(T2.PrvNum >= ?)");
      addWhere(sWhereString, "(T2.PrvNum <= ?)");
      if ( ! (GXutil.strcmp("", AV84Wcwlpedpends_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T2.PrvNum,'999990'), 2) like '%' || ?) or ( UPPER(T3.PrvNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PedCod,'99999990'), 2) like '%' || ?) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PedUni,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PedCanEnt,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(( T1.PedUni - T1.PedCanEnt),'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PedPre,'99999990.99999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int15[5] = (byte)(1) ;
         GXv_int15[6] = (byte)(1) ;
         GXv_int15[7] = (byte)(1) ;
         GXv_int15[8] = (byte)(1) ;
         GXv_int15[9] = (byte)(1) ;
         GXv_int15[10] = (byte)(1) ;
         GXv_int15[11] = (byte)(1) ;
         GXv_int15[12] = (byte)(1) ;
         GXv_int15[13] = (byte)(1) ;
      }
      if ( ! (0==AV85Wcwlpedpends_2_tfprvnum) )
      {
         addWhere(sWhereString, "(T2.PrvNum >= ?)");
      }
      else
      {
         GXv_int15[14] = (byte)(1) ;
      }
      if ( ! (0==AV86Wcwlpedpends_3_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T2.PrvNum <= ?)");
      }
      else
      {
         GXv_int15[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Wcwlpedpends_5_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV87Wcwlpedpends_4_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Wcwlpedpends_5_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PrvNom = ?)");
      }
      else
      {
         GXv_int15[17] = (byte)(1) ;
      }
      if ( ! (0==AV89Wcwlpedpends_6_tfpedcod) )
      {
         addWhere(sWhereString, "(T1.PedCod >= ?)");
      }
      else
      {
         GXv_int15[18] = (byte)(1) ;
      }
      if ( ! (0==AV90Wcwlpedpends_7_tfpedcod_to) )
      {
         addWhere(sWhereString, "(T1.PedCod <= ?)");
      }
      else
      {
         GXv_int15[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Wcwlpedpends_8_tfpedfec)) )
      {
         addWhere(sWhereString, "(T4.PedFec >= ?)");
      }
      else
      {
         GXv_int15[20] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV92Wcwlpedpends_9_tfpedfecent)) )
      {
         addWhere(sWhereString, "(T4.PedFecEnt >= ?)");
      }
      else
      {
         GXv_int15[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Wcwlpedpends_11_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV93Wcwlpedpends_10_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Wcwlpedpends_11_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int15[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Wcwlpedpends_13_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV95Wcwlpedpends_12_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Wcwlpedpends_13_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int15[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Wcwlpedpends_14_tfpeduni)==0) )
      {
         addWhere(sWhereString, "(T1.PedUni >= ?)");
      }
      else
      {
         GXv_int15[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Wcwlpedpends_15_tfpeduni_to)==0) )
      {
         addWhere(sWhereString, "(T1.PedUni <= ?)");
      }
      else
      {
         GXv_int15[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV99Wcwlpedpends_16_tfpedcanent)==0) )
      {
         addWhere(sWhereString, "(T1.PedCanEnt >= ?)");
      }
      else
      {
         GXv_int15[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV100Wcwlpedpends_17_tfpedcanent_to)==0) )
      {
         addWhere(sWhereString, "(T1.PedCanEnt <= ?)");
      }
      else
      {
         GXv_int15[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV101Wcwlpedpends_18_tfcantpdte)==0) )
      {
         addWhere(sWhereString, "(( T1.PedUni - T1.PedCanEnt) >= ?)");
      }
      else
      {
         GXv_int15[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV102Wcwlpedpends_19_tfcantpdte_to)==0) )
      {
         addWhere(sWhereString, "(( T1.PedUni - T1.PedCanEnt) <= ?)");
      }
      else
      {
         GXv_int15[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV103Wcwlpedpends_20_tfpedpre)==0) )
      {
         addWhere(sWhereString, "(T1.PedPre >= ?)");
      }
      else
      {
         GXv_int15[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104Wcwlpedpends_21_tfpedpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.PedPre <= ?)");
      }
      else
      {
         GXv_int15[33] = (byte)(1) ;
      }
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PedUni" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PedUni DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.PrvNum" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.PrvNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T4.PedFec" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T4.PedFec DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T3.PrvNom" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T3.PrvNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PedCod" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PedCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T4.PedFecEnt" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T4.PedFecEnt DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.PrdNom" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.PrdNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PedCanEnt" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PedCanEnt DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PedPre" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PedPre DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.PedCod, T1.PrdNum" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object16[0] = scmdbuf ;
      GXv_Object16[1] = GXv_int15 ;
      return GXv_Object16 ;
   }

   protected Object[] conditional_H00YX3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV84Wcwlpedpends_1_filterfulltext ,
                                          int AV85Wcwlpedpends_2_tfprvnum ,
                                          int AV86Wcwlpedpends_3_tfprvnum_to ,
                                          String AV88Wcwlpedpends_5_tfprvnom_sel ,
                                          String AV87Wcwlpedpends_4_tfprvnom ,
                                          int AV89Wcwlpedpends_6_tfpedcod ,
                                          int AV90Wcwlpedpends_7_tfpedcod_to ,
                                          java.util.Date AV91Wcwlpedpends_8_tfpedfec ,
                                          java.util.Date AV92Wcwlpedpends_9_tfpedfecent ,
                                          String AV94Wcwlpedpends_11_tfprdnum_sel ,
                                          String AV93Wcwlpedpends_10_tfprdnum ,
                                          String AV96Wcwlpedpends_13_tfprdnom_sel ,
                                          String AV95Wcwlpedpends_12_tfprdnom ,
                                          java.math.BigDecimal AV97Wcwlpedpends_14_tfpeduni ,
                                          java.math.BigDecimal AV98Wcwlpedpends_15_tfpeduni_to ,
                                          java.math.BigDecimal AV99Wcwlpedpends_16_tfpedcanent ,
                                          java.math.BigDecimal AV100Wcwlpedpends_17_tfpedcanent_to ,
                                          java.math.BigDecimal AV101Wcwlpedpends_18_tfcantpdte ,
                                          java.math.BigDecimal AV102Wcwlpedpends_19_tfcantpdte_to ,
                                          java.math.BigDecimal AV103Wcwlpedpends_20_tfpedpre ,
                                          java.math.BigDecimal AV104Wcwlpedpends_21_tfpedpre_to ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          int A658PedCod ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A669PedUni ,
                                          java.math.BigDecimal A657PedCanEnt ,
                                          java.math.BigDecimal A665PedPre ,
                                          java.util.Date A661PedFec ,
                                          java.util.Date A662PedFecEnt ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          java.util.Date AV67PedFec ,
                                          java.util.Date AV68PedFec_to ,
                                          int AV69PrvNum ,
                                          int AV70PrvNum_to ,
                                          String AV66Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[34];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (((TXPLPEDID T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPPRVGEN T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.PrvNum = T2.PrvNum) INNER JOIN TXPCPEDID T4 ON T4.EmprCod = T1.EmprCod AND T4.PedCod = T1.PedCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T4.PedFec >= ?)");
      addWhere(sWhereString, "(T4.PedFec <= ?)");
      addWhere(sWhereString, "(T2.PrvNum >= ?)");
      addWhere(sWhereString, "(T2.PrvNum <= ?)");
      if ( ! (GXutil.strcmp("", AV84Wcwlpedpends_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T2.PrvNum,'999990'), 2) like '%' || ?) or ( UPPER(T3.PrvNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PedCod,'99999990'), 2) like '%' || ?) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PedUni,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PedCanEnt,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(( T1.PedUni - T1.PedCanEnt),'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PedPre,'99999990.99999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int17[5] = (byte)(1) ;
         GXv_int17[6] = (byte)(1) ;
         GXv_int17[7] = (byte)(1) ;
         GXv_int17[8] = (byte)(1) ;
         GXv_int17[9] = (byte)(1) ;
         GXv_int17[10] = (byte)(1) ;
         GXv_int17[11] = (byte)(1) ;
         GXv_int17[12] = (byte)(1) ;
         GXv_int17[13] = (byte)(1) ;
      }
      if ( ! (0==AV85Wcwlpedpends_2_tfprvnum) )
      {
         addWhere(sWhereString, "(T2.PrvNum >= ?)");
      }
      else
      {
         GXv_int17[14] = (byte)(1) ;
      }
      if ( ! (0==AV86Wcwlpedpends_3_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T2.PrvNum <= ?)");
      }
      else
      {
         GXv_int17[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Wcwlpedpends_5_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV87Wcwlpedpends_4_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Wcwlpedpends_5_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PrvNom = ?)");
      }
      else
      {
         GXv_int17[17] = (byte)(1) ;
      }
      if ( ! (0==AV89Wcwlpedpends_6_tfpedcod) )
      {
         addWhere(sWhereString, "(T1.PedCod >= ?)");
      }
      else
      {
         GXv_int17[18] = (byte)(1) ;
      }
      if ( ! (0==AV90Wcwlpedpends_7_tfpedcod_to) )
      {
         addWhere(sWhereString, "(T1.PedCod <= ?)");
      }
      else
      {
         GXv_int17[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Wcwlpedpends_8_tfpedfec)) )
      {
         addWhere(sWhereString, "(T4.PedFec >= ?)");
      }
      else
      {
         GXv_int17[20] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV92Wcwlpedpends_9_tfpedfecent)) )
      {
         addWhere(sWhereString, "(T4.PedFecEnt >= ?)");
      }
      else
      {
         GXv_int17[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Wcwlpedpends_11_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV93Wcwlpedpends_10_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Wcwlpedpends_11_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int17[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Wcwlpedpends_13_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV95Wcwlpedpends_12_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Wcwlpedpends_13_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int17[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Wcwlpedpends_14_tfpeduni)==0) )
      {
         addWhere(sWhereString, "(T1.PedUni >= ?)");
      }
      else
      {
         GXv_int17[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Wcwlpedpends_15_tfpeduni_to)==0) )
      {
         addWhere(sWhereString, "(T1.PedUni <= ?)");
      }
      else
      {
         GXv_int17[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV99Wcwlpedpends_16_tfpedcanent)==0) )
      {
         addWhere(sWhereString, "(T1.PedCanEnt >= ?)");
      }
      else
      {
         GXv_int17[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV100Wcwlpedpends_17_tfpedcanent_to)==0) )
      {
         addWhere(sWhereString, "(T1.PedCanEnt <= ?)");
      }
      else
      {
         GXv_int17[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV101Wcwlpedpends_18_tfcantpdte)==0) )
      {
         addWhere(sWhereString, "(( T1.PedUni - T1.PedCanEnt) >= ?)");
      }
      else
      {
         GXv_int17[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV102Wcwlpedpends_19_tfcantpdte_to)==0) )
      {
         addWhere(sWhereString, "(( T1.PedUni - T1.PedCanEnt) <= ?)");
      }
      else
      {
         GXv_int17[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV103Wcwlpedpends_20_tfpedpre)==0) )
      {
         addWhere(sWhereString, "(T1.PedPre >= ?)");
      }
      else
      {
         GXv_int17[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104Wcwlpedpends_21_tfpedpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.PedPre <= ?)");
      }
      else
      {
         GXv_int17[33] = (byte)(1) ;
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
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
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
                  return conditional_H00YX2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.util.Date)dynConstraints[29] , (java.util.Date)dynConstraints[30] , ((Number) dynConstraints[31]).shortValue() , ((Boolean) dynConstraints[32]).booleanValue() , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] , (String)dynConstraints[38] );
            case 1 :
                  return conditional_H00YX3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.util.Date)dynConstraints[29] , (java.util.Date)dynConstraints[30] , ((Number) dynConstraints[31]).shortValue() , ((Boolean) dynConstraints[32]).booleanValue() , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] , (String)dynConstraints[38] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00YX2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00YX3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
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
                  stmt.setString(sIdx, (String)parms[39], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[40]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[41]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[59]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[60]);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 6);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 6);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 5);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 5);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[35]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[36]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[54]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[55]);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 6);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 6);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 5);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 5);
               }
               return;
      }
   }

}

