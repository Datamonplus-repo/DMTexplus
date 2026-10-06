package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class listadodeproductos_wc_impl extends GXWebComponent
{
   public listadodeproductos_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public listadodeproductos_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( listadodeproductos_wc_impl.class ));
   }

   public listadodeproductos_wc_impl( int remoteHandle ,
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
      cmbPrdZDHC = new HTMLChoice();
      cmbPrdList = new HTMLChoice();
      cmbPrdGRS = new HTMLChoice();
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( nGotPars == 0 )
         {
            entryPointCalled = false ;
            gxfirstwebparm = httpContext.GetFirstPar( "emprcod") ;
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
               AV34emprcod = httpContext.GetPar( "emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34emprcod", AV34emprcod);
               AV35PrdNumfrom = httpContext.GetPar( "PrdNumfrom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35PrdNumfrom", AV35PrdNumfrom);
               AV36PrdnumTo = httpContext.GetPar( "PrdnumTo") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36PrdnumTo", AV36PrdnumTo);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV34emprcod,AV35PrdNumfrom,AV36PrdnumTo});
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
               gxfirstwebparm = httpContext.GetFirstPar( "emprcod") ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
            {
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxfirstwebparm = httpContext.GetFirstPar( "emprcod") ;
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
      nRC_GXsfl_43 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_43"))) ;
      nGXsfl_43_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_43_idx"))) ;
      sGXsfl_43_idx = httpContext.GetPar( "sGXsfl_43_idx") ;
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
      AV34emprcod = httpContext.GetPar( "emprcod") ;
      AV35PrdNumfrom = httpContext.GetPar( "PrdNumfrom") ;
      AV36PrdnumTo = httpContext.GetPar( "PrdnumTo") ;
      AV25ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV20ColumnsSelector);
      AV15FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV26TFPrdNum = httpContext.GetPar( "TFPrdNum") ;
      AV27TFPrdNum_Sel = httpContext.GetPar( "TFPrdNum_Sel") ;
      AV28TFPrdNom = httpContext.GetPar( "TFPrdNom") ;
      AV29TFPrdNom_Sel = httpContext.GetPar( "TFPrdNom_Sel") ;
      AV37TFPrdExiAlm = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdExiAlm"), ".") ;
      AV38TFPrdExiAlm_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdExiAlm_To"), ".") ;
      AV39TFPrdCanRes = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdCanRes"), ".") ;
      AV40TFPrdCanRes_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdCanRes_To"), ".") ;
      AV91TFPrdDisponible = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdDisponible"), ".") ;
      AV92TFPrdDisponible_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdDisponible_To"), ".") ;
      AV41TFPrdCanPen = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdCanPen"), ".") ;
      AV42TFPrdCanPen_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdCanPen_To"), ".") ;
      AV43TFPrdPreAct = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdPreAct"), ".") ;
      AV44TFPrdPreAct_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdPreAct_To"), ".") ;
      AV45TFTipPrdDsc = httpContext.GetPar( "TFTipPrdDsc") ;
      AV46TFTipPrdDsc_Sel = httpContext.GetPar( "TFTipPrdDsc_Sel") ;
      AV47TFValDsc = httpContext.GetPar( "TFValDsc") ;
      AV48TFValDsc_Sel = httpContext.GetPar( "TFValDsc_Sel") ;
      AV49TFPrdRec = httpContext.GetPar( "TFPrdRec") ;
      AV50TFPrdRec_Sel = httpContext.GetPar( "TFPrdRec_Sel") ;
      AV51TFPrdAox = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdAox"), ".") ;
      AV52TFPrdAox_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdAox_To"), ".") ;
      AV53TFPrdGots = httpContext.GetPar( "TFPrdGots") ;
      AV54TFPrdGots_Sel = httpContext.GetPar( "TFPrdGots_Sel") ;
      AV55TFPrdReach = httpContext.GetPar( "TFPrdReach") ;
      AV56TFPrdReach_Sel = httpContext.GetPar( "TFPrdReach_Sel") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV58TFPrdOkotex_Sels);
      AV59TFPrdHm = httpContext.GetPar( "TFPrdHm") ;
      AV60TFPrdHm_Sel = httpContext.GetPar( "TFPrdHm_Sel") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV62TFPrdZDHC_Sels);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV64TFPrdList_Sels);
      AV65TFPrdTHELIST = httpContext.GetPar( "TFPrdTHELIST") ;
      AV66TFPrdTHELIST_Sel = httpContext.GetPar( "TFPrdTHELIST_Sel") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV68TFPrdGRS_Sels);
      AV69TFPrdHS = httpContext.GetPar( "TFPrdHS") ;
      AV70TFPrdHS_Sel = httpContext.GetPar( "TFPrdHS_Sel") ;
      AV71TFPrdFHS = localUtil.parseDateParm( httpContext.GetPar( "TFPrdFHS")) ;
      AV75TFPrdNum2 = httpContext.GetPar( "TFPrdNum2") ;
      AV76TFPrdNum2_Sel = httpContext.GetPar( "TFPrdNum2_Sel") ;
      AV77TFPrdNom2 = httpContext.GetPar( "TFPrdNom2") ;
      AV78TFPrdNom2_Sel = httpContext.GetPar( "TFPrdNom2_Sel") ;
      AV79TFPrdRefPrv = httpContext.GetPar( "TFPrdRefPrv") ;
      AV80TFPrdRefPrv_Sel = httpContext.GetPar( "TFPrdRefPrv_Sel") ;
      AV81TFPrdFuncion = httpContext.GetPar( "TFPrdFuncion") ;
      AV82TFPrdFuncion_Sel = httpContext.GetPar( "TFPrdFuncion_Sel") ;
      AV83TFPrdEINECS = httpContext.GetPar( "TFPrdEINECS") ;
      AV84TFPrdEINECS_Sel = httpContext.GetPar( "TFPrdEINECS_Sel") ;
      AV85TFPrdNCAS = httpContext.GetPar( "TFPrdNCAS") ;
      AV86TFPrdNCAS_Sel = httpContext.GetPar( "TFPrdNCAS_Sel") ;
      AV87TFPrvNum = (int)(GXutil.lval( httpContext.GetPar( "TFPrvNum"))) ;
      AV88TFPrvNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFPrvNum_To"))) ;
      AV89TFPrvNom = httpContext.GetPar( "TFPrvNom") ;
      AV90TFPrvNom_Sel = httpContext.GetPar( "TFPrvNom_Sel") ;
      AV95Pgmname = httpContext.GetPar( "Pgmname") ;
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
      gxgrgrid_refresh( subGrid_Rows, AV34emprcod, AV35PrdNumfrom, AV36PrdnumTo, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFPrdNum, AV27TFPrdNum_Sel, AV28TFPrdNom, AV29TFPrdNom_Sel, AV37TFPrdExiAlm, AV38TFPrdExiAlm_To, AV39TFPrdCanRes, AV40TFPrdCanRes_To, AV91TFPrdDisponible, AV92TFPrdDisponible_To, AV41TFPrdCanPen, AV42TFPrdCanPen_To, AV43TFPrdPreAct, AV44TFPrdPreAct_To, AV45TFTipPrdDsc, AV46TFTipPrdDsc_Sel, AV47TFValDsc, AV48TFValDsc_Sel, AV49TFPrdRec, AV50TFPrdRec_Sel, AV51TFPrdAox, AV52TFPrdAox_To, AV53TFPrdGots, AV54TFPrdGots_Sel, AV55TFPrdReach, AV56TFPrdReach_Sel, AV58TFPrdOkotex_Sels, AV59TFPrdHm, AV60TFPrdHm_Sel, AV62TFPrdZDHC_Sels, AV64TFPrdList_Sels, AV65TFPrdTHELIST, AV66TFPrdTHELIST_Sel, AV68TFPrdGRS_Sels, AV69TFPrdHS, AV70TFPrdHS_Sel, AV71TFPrdFHS, AV75TFPrdNum2, AV76TFPrdNum2_Sel, AV77TFPrdNom2, AV78TFPrdNom2_Sel, AV79TFPrdRefPrv, AV80TFPrdRefPrv_Sel, AV81TFPrdFuncion, AV82TFPrdFuncion_Sel, AV83TFPrdEINECS, AV84TFPrdEINECS_Sel, AV85TFPrdNCAS, AV86TFPrdNCAS_Sel, AV87TFPrvNum, AV88TFPrvNum_To, AV89TFPrvNom, AV90TFPrvNom_Sel, AV95Pgmname, AV12OrderedBy, AV13OrderedDsc, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1KX2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( " Mantenimiento de Productos Quimicos", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.stocksquimicos.listadodeproductos_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV34emprcod)),GXutil.URLEncode(GXutil.rtrim(AV35PrdNumfrom)),GXutil.URLEncode(GXutil.rtrim(AV36PrdnumTo))}, new String[] {"emprcod","PrdNumfrom","PrdnumTo"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ListadodeProductos_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV95Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("stocksquimicos\\listadodeproductos_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_43", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_43, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV32GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV33GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV30DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV30DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV20ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV20ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV34emprcod", GXutil.rtrim( wcpOAV34emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV35PrdNumfrom", GXutil.rtrim( wcpOAV35PrdNumfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV36PrdnumTo", GXutil.rtrim( wcpOAV36PrdnumTo));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV25ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNUM", GXutil.rtrim( AV26TFPrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNUM_SEL", GXutil.rtrim( AV27TFPrdNum_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNOM", GXutil.rtrim( AV28TFPrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNOM_SEL", GXutil.rtrim( AV29TFPrdNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDEXIALM", GXutil.ltrim( localUtil.ntoc( AV37TFPrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDEXIALM_TO", GXutil.ltrim( localUtil.ntoc( AV38TFPrdExiAlm_To, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDCANRES", GXutil.ltrim( localUtil.ntoc( AV39TFPrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDCANRES_TO", GXutil.ltrim( localUtil.ntoc( AV40TFPrdCanRes_To, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDDISPONIBLE", GXutil.ltrim( localUtil.ntoc( AV91TFPrdDisponible, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDDISPONIBLE_TO", GXutil.ltrim( localUtil.ntoc( AV92TFPrdDisponible_To, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDCANPEN", GXutil.ltrim( localUtil.ntoc( AV41TFPrdCanPen, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDCANPEN_TO", GXutil.ltrim( localUtil.ntoc( AV42TFPrdCanPen_To, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDPREACT", GXutil.ltrim( localUtil.ntoc( AV43TFPrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDPREACT_TO", GXutil.ltrim( localUtil.ntoc( AV44TFPrdPreAct_To, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFTIPPRDDSC", GXutil.rtrim( AV45TFTipPrdDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFTIPPRDDSC_SEL", GXutil.rtrim( AV46TFTipPrdDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFVALDSC", GXutil.rtrim( AV47TFValDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFVALDSC_SEL", GXutil.rtrim( AV48TFValDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDREC", GXutil.rtrim( AV49TFPrdRec));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDREC_SEL", GXutil.rtrim( AV50TFPrdRec_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDAOX", GXutil.ltrim( localUtil.ntoc( AV51TFPrdAox, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDAOX_TO", GXutil.ltrim( localUtil.ntoc( AV52TFPrdAox_To, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDGOTS", GXutil.rtrim( AV53TFPrdGots));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDGOTS_SEL", GXutil.rtrim( AV54TFPrdGots_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDREACH", GXutil.rtrim( AV55TFPrdReach));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDREACH_SEL", GXutil.rtrim( AV56TFPrdReach_Sel));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vTFPRDOKOTEX_SELS", AV58TFPrdOkotex_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vTFPRDOKOTEX_SELS", AV58TFPrdOkotex_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDHM", GXutil.rtrim( AV59TFPrdHm));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDHM_SEL", GXutil.rtrim( AV60TFPrdHm_Sel));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vTFPRDZDHC_SELS", AV62TFPrdZDHC_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vTFPRDZDHC_SELS", AV62TFPrdZDHC_Sels);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vTFPRDLIST_SELS", AV64TFPrdList_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vTFPRDLIST_SELS", AV64TFPrdList_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDTHELIST", GXutil.rtrim( AV65TFPrdTHELIST));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDTHELIST_SEL", GXutil.rtrim( AV66TFPrdTHELIST_Sel));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vTFPRDGRS_SELS", AV68TFPrdGRS_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vTFPRDGRS_SELS", AV68TFPrdGRS_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDHS", GXutil.rtrim( AV69TFPrdHS));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDHS_SEL", GXutil.rtrim( AV70TFPrdHS_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDFHS", localUtil.dtoc( AV71TFPrdFHS, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNUM2", GXutil.rtrim( AV75TFPrdNum2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNUM2_SEL", GXutil.rtrim( AV76TFPrdNum2_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNOM2", GXutil.rtrim( AV77TFPrdNom2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNOM2_SEL", GXutil.rtrim( AV78TFPrdNom2_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDREFPRV", GXutil.rtrim( AV79TFPrdRefPrv));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDREFPRV_SEL", GXutil.rtrim( AV80TFPrdRefPrv_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDFUNCION", GXutil.rtrim( AV81TFPrdFuncion));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDFUNCION_SEL", GXutil.rtrim( AV82TFPrdFuncion_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDEINECS", GXutil.rtrim( AV83TFPrdEINECS));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDEINECS_SEL", GXutil.rtrim( AV84TFPrdEINECS_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNCAS", GXutil.rtrim( AV85TFPrdNCAS));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNCAS_SEL", GXutil.rtrim( AV86TFPrdNCAS_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVNUM", GXutil.ltrim( localUtil.ntoc( AV87TFPrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVNUM_TO", GXutil.ltrim( localUtil.ntoc( AV88TFPrvNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVNOM", GXutil.rtrim( AV89TFPrvNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVNOM_SEL", GXutil.rtrim( AV90TFPrvNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV34emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRDNUMFROM", GXutil.rtrim( AV35PrdNumfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRDNUMTO", GXutil.rtrim( AV36PrdnumTo));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDOKOTEX_SELSJSON", AV57TFPrdOkotex_SelsJson);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDZDHC_SELSJSON", AV61TFPrdZDHC_SelsJson);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDLIST_SELSJSON", AV63TFPrdList_SelsJson);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDGRS_SELSJSON", AV67TFPrdGRS_SelsJson);
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Allowmultipleselection", GXutil.rtrim( Ddo_grid_Allowmultipleselection));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalistfixedvalues", GXutil.rtrim( Ddo_grid_Datalistfixedvalues));
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

   public void renderHtmlCloseForm1KX2( )
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
      return "StocksQuimicos.ListadodeProductos_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Mantenimiento de Productos Quimicos", "") ;
   }

   public void wb1KX0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.stocksquimicos.listadodeproductos_wc");
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\ListadodeProductos_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\ListadodeProductos_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTREPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\ListadodeProductos_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\ListadodeProductos_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_25_1KX2( true) ;
      }
      else
      {
         wb_table1_25_1KX2( false) ;
      }
      return  ;
   }

   public void wb_table1_25_1KX2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV32GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV33GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV95Pgmname), GXutil.rtrim( localUtil.format( AV95Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\ListadodeProductos_WC.htm");
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
         ucDdo_grid.setProperty("AllowMultipleSelection", Ddo_grid_Allowmultipleselection);
         ucDdo_grid.setProperty("DataListFixedValues", Ddo_grid_Datalistfixedvalues);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV30DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV30DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV20ColumnsSelector);
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
         app.GxWebStd.gx_div_start( httpContext, divDdo_prdfhsauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'" + sPrefix + "',false,'" + sGXsfl_43_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_prdfhsauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_prdfhsauxdate_Internalname, localUtil.format(AV73DDO_PrdFHSAuxDate, "99/99/99"), localUtil.format( AV73DDO_PrdFHSAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,88);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_prdfhsauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\ListadodeProductos_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_prdfhsauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_StocksQuimicos\\ListadodeProductos_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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

   public void start1KX2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( " Mantenimiento de Productos Quimicos", ""), (short)(0)) ;
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
            strup1KX0( ) ;
         }
      }
   }

   public void ws1KX2( )
   {
      start1KX2( ) ;
      evt1KX2( ) ;
   }

   public void evt1KX2( )
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
                              strup1KX0( ) ;
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
                              strup1KX0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e111KX2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1KX0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e121KX2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1KX0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e131KX2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1KX0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e141KX2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1KX0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e151KX2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1KX0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e161KX2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTREPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1KX0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportReport' */
                                 e171KX2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1KX0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e181KX2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1KX0( ) ;
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
                              strup1KX0( ) ;
                           }
                           nGXsfl_43_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_432( ) ;
                           A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
                           A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
                           A704PrdExiAlm = localUtil.ctond( httpContext.cgiGet( edtPrdExiAlm_Internalname)) ;
                           A685PrdCanRes = localUtil.ctond( httpContext.cgiGet( edtPrdCanRes_Internalname)) ;
                           A13831PrdDisponi = localUtil.ctond( httpContext.cgiGet( edtPrdDisponi_Internalname)) ;
                           A684PrdCanPen = localUtil.ctond( httpContext.cgiGet( edtPrdCanPen_Internalname)) ;
                           A724PrdPreAct = localUtil.ctond( httpContext.cgiGet( edtPrdPreAct_Internalname)) ;
                           A6302TipPrdDsc = httpContext.cgiGet( edtTipPrdDsc_Internalname) ;
                           n6302TipPrdDsc = false ;
                           A857ValDsc = httpContext.cgiGet( edtValDsc_Internalname) ;
                           n857ValDsc = false ;
                           A727PrdRec = httpContext.cgiGet( edtPrdRec_Internalname) ;
                           A9733PrdAox = localUtil.ctond( httpContext.cgiGet( edtPrdAox_Internalname)) ;
                           A11363PrdGots = httpContext.cgiGet( edtPrdGots_Internalname) ;
                           A5887PrdReach = httpContext.cgiGet( edtPrdReach_Internalname) ;
                           cmbPrdOkotex.setName( cmbPrdOkotex.getInternalname() );
                           cmbPrdOkotex.setValue( httpContext.cgiGet( cmbPrdOkotex.getInternalname()) );
                           A5888PrdOkotex = httpContext.cgiGet( cmbPrdOkotex.getInternalname()) ;
                           A11364PrdHm = httpContext.cgiGet( edtPrdHm_Internalname) ;
                           cmbPrdZDHC.setName( cmbPrdZDHC.getInternalname() );
                           cmbPrdZDHC.setValue( httpContext.cgiGet( cmbPrdZDHC.getInternalname()) );
                           A13301PrdZDHC = httpContext.cgiGet( cmbPrdZDHC.getInternalname()) ;
                           cmbPrdList.setName( cmbPrdList.getInternalname() );
                           cmbPrdList.setValue( httpContext.cgiGet( cmbPrdList.getInternalname()) );
                           A11687PrdList = httpContext.cgiGet( cmbPrdList.getInternalname()) ;
                           A13302PrdTHELIST = GXutil.upper( httpContext.cgiGet( edtPrdTHELIST_Internalname)) ;
                           n13302PrdTHELIST = false ;
                           cmbPrdGRS.setName( cmbPrdGRS.getInternalname() );
                           cmbPrdGRS.setValue( httpContext.cgiGet( cmbPrdGRS.getInternalname()) );
                           A13974PrdGRS = httpContext.cgiGet( cmbPrdGRS.getInternalname()) ;
                           n13974PrdGRS = false ;
                           A9741PrdHS = httpContext.cgiGet( edtPrdHS_Internalname) ;
                           A9742PrdFHS = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtPrdFHS_Internalname), 0)) ;
                           A4693PrdNum2 = httpContext.cgiGet( edtPrdNum2_Internalname) ;
                           A4692PrdNom2 = httpContext.cgiGet( edtPrdNom2_Internalname) ;
                           A728PrdRefPrv = httpContext.cgiGet( edtPrdRefPrv_Internalname) ;
                           A11615PrdFuncion = httpContext.cgiGet( edtPrdFuncion_Internalname) ;
                           A11614PrdEINECS = httpContext.cgiGet( edtPrdEINECS_Internalname) ;
                           A9734PrdNCAS = httpContext.cgiGet( edtPrdNCAS_Internalname) ;
                           A795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( edtPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A794PrvNom = httpContext.cgiGet( edtPrvNom_Internalname) ;
                           n794PrvNom = false ;
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
                                       e191KX2 ();
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
                                       e201KX2 ();
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
                                       e211KX2 ();
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
                                    strup1KX0( ) ;
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

   public void we1KX2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1KX2( ) ;
         }
      }
   }

   public void pa1KX2( )
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
                                 String AV34emprcod ,
                                 String AV35PrdNumfrom ,
                                 String AV36PrdnumTo ,
                                 byte AV25ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ,
                                 String AV15FilterFullText ,
                                 String AV26TFPrdNum ,
                                 String AV27TFPrdNum_Sel ,
                                 String AV28TFPrdNom ,
                                 String AV29TFPrdNom_Sel ,
                                 java.math.BigDecimal AV37TFPrdExiAlm ,
                                 java.math.BigDecimal AV38TFPrdExiAlm_To ,
                                 java.math.BigDecimal AV39TFPrdCanRes ,
                                 java.math.BigDecimal AV40TFPrdCanRes_To ,
                                 java.math.BigDecimal AV91TFPrdDisponible ,
                                 java.math.BigDecimal AV92TFPrdDisponible_To ,
                                 java.math.BigDecimal AV41TFPrdCanPen ,
                                 java.math.BigDecimal AV42TFPrdCanPen_To ,
                                 java.math.BigDecimal AV43TFPrdPreAct ,
                                 java.math.BigDecimal AV44TFPrdPreAct_To ,
                                 String AV45TFTipPrdDsc ,
                                 String AV46TFTipPrdDsc_Sel ,
                                 String AV47TFValDsc ,
                                 String AV48TFValDsc_Sel ,
                                 String AV49TFPrdRec ,
                                 String AV50TFPrdRec_Sel ,
                                 java.math.BigDecimal AV51TFPrdAox ,
                                 java.math.BigDecimal AV52TFPrdAox_To ,
                                 String AV53TFPrdGots ,
                                 String AV54TFPrdGots_Sel ,
                                 String AV55TFPrdReach ,
                                 String AV56TFPrdReach_Sel ,
                                 GXSimpleCollection<String> AV58TFPrdOkotex_Sels ,
                                 String AV59TFPrdHm ,
                                 String AV60TFPrdHm_Sel ,
                                 GXSimpleCollection<String> AV62TFPrdZDHC_Sels ,
                                 GXSimpleCollection<String> AV64TFPrdList_Sels ,
                                 String AV65TFPrdTHELIST ,
                                 String AV66TFPrdTHELIST_Sel ,
                                 GXSimpleCollection<String> AV68TFPrdGRS_Sels ,
                                 String AV69TFPrdHS ,
                                 String AV70TFPrdHS_Sel ,
                                 java.util.Date AV71TFPrdFHS ,
                                 String AV75TFPrdNum2 ,
                                 String AV76TFPrdNum2_Sel ,
                                 String AV77TFPrdNom2 ,
                                 String AV78TFPrdNom2_Sel ,
                                 String AV79TFPrdRefPrv ,
                                 String AV80TFPrdRefPrv_Sel ,
                                 String AV81TFPrdFuncion ,
                                 String AV82TFPrdFuncion_Sel ,
                                 String AV83TFPrdEINECS ,
                                 String AV84TFPrdEINECS_Sel ,
                                 String AV85TFPrdNCAS ,
                                 String AV86TFPrdNCAS_Sel ,
                                 int AV87TFPrvNum ,
                                 int AV88TFPrvNum_To ,
                                 String AV89TFPrvNom ,
                                 String AV90TFPrvNom_Sel ,
                                 String AV95Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e201KX2 ();
      GRID_nCurrentRecord = 0 ;
      rf1KX2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ListadodeProductos_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV95Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("stocksquimicos\\listadodeproductos_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf1KX2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV95Pgmname = "StocksQuimicos.ListadodeProductos_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95Pgmname", AV95Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext = AV15FilterFullText ;
      AV100Stocksquimicos_listadodeproductos_wcds_2_tfprdnum = AV26TFPrdNum ;
      AV101Stocksquimicos_listadodeproductos_wcds_3_tfprdnum_sel = AV27TFPrdNum_Sel ;
      AV102Stocksquimicos_listadodeproductos_wcds_4_tfprdnom = AV28TFPrdNom ;
      AV103Stocksquimicos_listadodeproductos_wcds_5_tfprdnom_sel = AV29TFPrdNom_Sel ;
      AV104Stocksquimicos_listadodeproductos_wcds_6_tfprdexialm = AV37TFPrdExiAlm ;
      AV105Stocksquimicos_listadodeproductos_wcds_7_tfprdexialm_to = AV38TFPrdExiAlm_To ;
      AV106Stocksquimicos_listadodeproductos_wcds_8_tfprdcanres = AV39TFPrdCanRes ;
      AV107Stocksquimicos_listadodeproductos_wcds_9_tfprdcanres_to = AV40TFPrdCanRes_To ;
      AV108Stocksquimicos_listadodeproductos_wcds_10_tfprddisponible = AV91TFPrdDisponible ;
      AV109Stocksquimicos_listadodeproductos_wcds_11_tfprddisponible_to = AV92TFPrdDisponible_To ;
      AV110Stocksquimicos_listadodeproductos_wcds_12_tfprdcanpen = AV41TFPrdCanPen ;
      AV111Stocksquimicos_listadodeproductos_wcds_13_tfprdcanpen_to = AV42TFPrdCanPen_To ;
      AV112Stocksquimicos_listadodeproductos_wcds_14_tfprdpreact = AV43TFPrdPreAct ;
      AV113Stocksquimicos_listadodeproductos_wcds_15_tfprdpreact_to = AV44TFPrdPreAct_To ;
      AV114Stocksquimicos_listadodeproductos_wcds_16_tftipprddsc = AV45TFTipPrdDsc ;
      AV115Stocksquimicos_listadodeproductos_wcds_17_tftipprddsc_sel = AV46TFTipPrdDsc_Sel ;
      AV116Stocksquimicos_listadodeproductos_wcds_18_tfvaldsc = AV47TFValDsc ;
      AV117Stocksquimicos_listadodeproductos_wcds_19_tfvaldsc_sel = AV48TFValDsc_Sel ;
      AV118Stocksquimicos_listadodeproductos_wcds_20_tfprdrec = AV49TFPrdRec ;
      AV119Stocksquimicos_listadodeproductos_wcds_21_tfprdrec_sel = AV50TFPrdRec_Sel ;
      AV120Stocksquimicos_listadodeproductos_wcds_22_tfprdaox = AV51TFPrdAox ;
      AV121Stocksquimicos_listadodeproductos_wcds_23_tfprdaox_to = AV52TFPrdAox_To ;
      AV122Stocksquimicos_listadodeproductos_wcds_24_tfprdgots = AV53TFPrdGots ;
      AV123Stocksquimicos_listadodeproductos_wcds_25_tfprdgots_sel = AV54TFPrdGots_Sel ;
      AV124Stocksquimicos_listadodeproductos_wcds_26_tfprdreach = AV55TFPrdReach ;
      AV125Stocksquimicos_listadodeproductos_wcds_27_tfprdreach_sel = AV56TFPrdReach_Sel ;
      AV126Stocksquimicos_listadodeproductos_wcds_28_tfprdokotex_sels = AV58TFPrdOkotex_Sels ;
      AV127Stocksquimicos_listadodeproductos_wcds_29_tfprdhm = AV59TFPrdHm ;
      AV128Stocksquimicos_listadodeproductos_wcds_30_tfprdhm_sel = AV60TFPrdHm_Sel ;
      AV129Stocksquimicos_listadodeproductos_wcds_31_tfprdzdhc_sels = AV62TFPrdZDHC_Sels ;
      AV130Stocksquimicos_listadodeproductos_wcds_32_tfprdlist_sels = AV64TFPrdList_Sels ;
      AV131Stocksquimicos_listadodeproductos_wcds_33_tfprdthelist = AV65TFPrdTHELIST ;
      AV132Stocksquimicos_listadodeproductos_wcds_34_tfprdthelist_sel = AV66TFPrdTHELIST_Sel ;
      AV133Stocksquimicos_listadodeproductos_wcds_35_tfprdgrs_sels = AV68TFPrdGRS_Sels ;
      AV134Stocksquimicos_listadodeproductos_wcds_36_tfprdhs = AV69TFPrdHS ;
      AV135Stocksquimicos_listadodeproductos_wcds_37_tfprdhs_sel = AV70TFPrdHS_Sel ;
      AV136Stocksquimicos_listadodeproductos_wcds_38_tfprdfhs = AV71TFPrdFHS ;
      AV137Stocksquimicos_listadodeproductos_wcds_39_tfprdnum2 = AV75TFPrdNum2 ;
      AV138Stocksquimicos_listadodeproductos_wcds_40_tfprdnum2_sel = AV76TFPrdNum2_Sel ;
      AV139Stocksquimicos_listadodeproductos_wcds_41_tfprdnom2 = AV77TFPrdNom2 ;
      AV140Stocksquimicos_listadodeproductos_wcds_42_tfprdnom2_sel = AV78TFPrdNom2_Sel ;
      AV141Stocksquimicos_listadodeproductos_wcds_43_tfprdrefprv = AV79TFPrdRefPrv ;
      AV142Stocksquimicos_listadodeproductos_wcds_44_tfprdrefprv_sel = AV80TFPrdRefPrv_Sel ;
      AV143Stocksquimicos_listadodeproductos_wcds_45_tfprdfuncion = AV81TFPrdFuncion ;
      AV144Stocksquimicos_listadodeproductos_wcds_46_tfprdfuncion_sel = AV82TFPrdFuncion_Sel ;
      AV145Stocksquimicos_listadodeproductos_wcds_47_tfprdeinecs = AV83TFPrdEINECS ;
      AV146Stocksquimicos_listadodeproductos_wcds_48_tfprdeinecs_sel = AV84TFPrdEINECS_Sel ;
      AV147Stocksquimicos_listadodeproductos_wcds_49_tfprdncas = AV85TFPrdNCAS ;
      AV148Stocksquimicos_listadodeproductos_wcds_50_tfprdncas_sel = AV86TFPrdNCAS_Sel ;
      AV149Stocksquimicos_listadodeproductos_wcds_51_tfprvnum = AV87TFPrvNum ;
      AV150Stocksquimicos_listadodeproductos_wcds_52_tfprvnum_to = AV88TFPrvNum_To ;
      AV151Stocksquimicos_listadodeproductos_wcds_53_tfprvnom = AV89TFPrvNom ;
      AV152Stocksquimicos_listadodeproductos_wcds_54_tfprvnom_sel = AV90TFPrvNom_Sel ;
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A5888PrdOkotex ,
                                           AV126Stocksquimicos_listadodeproductos_wcds_28_tfprdokotex_sels ,
                                           A13301PrdZDHC ,
                                           AV129Stocksquimicos_listadodeproductos_wcds_31_tfprdzdhc_sels ,
                                           A11687PrdList ,
                                           AV130Stocksquimicos_listadodeproductos_wcds_32_tfprdlist_sels ,
                                           A13974PrdGRS ,
                                           AV133Stocksquimicos_listadodeproductos_wcds_35_tfprdgrs_sels ,
                                           AV101Stocksquimicos_listadodeproductos_wcds_3_tfprdnum_sel ,
                                           AV100Stocksquimicos_listadodeproductos_wcds_2_tfprdnum ,
                                           AV103Stocksquimicos_listadodeproductos_wcds_5_tfprdnom_sel ,
                                           AV102Stocksquimicos_listadodeproductos_wcds_4_tfprdnom ,
                                           AV104Stocksquimicos_listadodeproductos_wcds_6_tfprdexialm ,
                                           AV105Stocksquimicos_listadodeproductos_wcds_7_tfprdexialm_to ,
                                           AV106Stocksquimicos_listadodeproductos_wcds_8_tfprdcanres ,
                                           AV107Stocksquimicos_listadodeproductos_wcds_9_tfprdcanres_to ,
                                           AV108Stocksquimicos_listadodeproductos_wcds_10_tfprddisponible ,
                                           AV109Stocksquimicos_listadodeproductos_wcds_11_tfprddisponible_to ,
                                           AV110Stocksquimicos_listadodeproductos_wcds_12_tfprdcanpen ,
                                           AV111Stocksquimicos_listadodeproductos_wcds_13_tfprdcanpen_to ,
                                           AV112Stocksquimicos_listadodeproductos_wcds_14_tfprdpreact ,
                                           AV113Stocksquimicos_listadodeproductos_wcds_15_tfprdpreact_to ,
                                           AV115Stocksquimicos_listadodeproductos_wcds_17_tftipprddsc_sel ,
                                           AV114Stocksquimicos_listadodeproductos_wcds_16_tftipprddsc ,
                                           AV117Stocksquimicos_listadodeproductos_wcds_19_tfvaldsc_sel ,
                                           AV116Stocksquimicos_listadodeproductos_wcds_18_tfvaldsc ,
                                           AV119Stocksquimicos_listadodeproductos_wcds_21_tfprdrec_sel ,
                                           AV118Stocksquimicos_listadodeproductos_wcds_20_tfprdrec ,
                                           AV120Stocksquimicos_listadodeproductos_wcds_22_tfprdaox ,
                                           AV121Stocksquimicos_listadodeproductos_wcds_23_tfprdaox_to ,
                                           AV123Stocksquimicos_listadodeproductos_wcds_25_tfprdgots_sel ,
                                           AV122Stocksquimicos_listadodeproductos_wcds_24_tfprdgots ,
                                           AV125Stocksquimicos_listadodeproductos_wcds_27_tfprdreach_sel ,
                                           AV124Stocksquimicos_listadodeproductos_wcds_26_tfprdreach ,
                                           Integer.valueOf(AV126Stocksquimicos_listadodeproductos_wcds_28_tfprdokotex_sels.size()) ,
                                           AV128Stocksquimicos_listadodeproductos_wcds_30_tfprdhm_sel ,
                                           AV127Stocksquimicos_listadodeproductos_wcds_29_tfprdhm ,
                                           Integer.valueOf(AV129Stocksquimicos_listadodeproductos_wcds_31_tfprdzdhc_sels.size()) ,
                                           Integer.valueOf(AV130Stocksquimicos_listadodeproductos_wcds_32_tfprdlist_sels.size()) ,
                                           AV132Stocksquimicos_listadodeproductos_wcds_34_tfprdthelist_sel ,
                                           AV131Stocksquimicos_listadodeproductos_wcds_33_tfprdthelist ,
                                           Integer.valueOf(AV133Stocksquimicos_listadodeproductos_wcds_35_tfprdgrs_sels.size()) ,
                                           AV135Stocksquimicos_listadodeproductos_wcds_37_tfprdhs_sel ,
                                           AV134Stocksquimicos_listadodeproductos_wcds_36_tfprdhs ,
                                           AV136Stocksquimicos_listadodeproductos_wcds_38_tfprdfhs ,
                                           AV138Stocksquimicos_listadodeproductos_wcds_40_tfprdnum2_sel ,
                                           AV137Stocksquimicos_listadodeproductos_wcds_39_tfprdnum2 ,
                                           AV140Stocksquimicos_listadodeproductos_wcds_42_tfprdnom2_sel ,
                                           AV139Stocksquimicos_listadodeproductos_wcds_41_tfprdnom2 ,
                                           AV142Stocksquimicos_listadodeproductos_wcds_44_tfprdrefprv_sel ,
                                           AV141Stocksquimicos_listadodeproductos_wcds_43_tfprdrefprv ,
                                           AV144Stocksquimicos_listadodeproductos_wcds_46_tfprdfuncion_sel ,
                                           AV143Stocksquimicos_listadodeproductos_wcds_45_tfprdfuncion ,
                                           AV146Stocksquimicos_listadodeproductos_wcds_48_tfprdeinecs_sel ,
                                           AV145Stocksquimicos_listadodeproductos_wcds_47_tfprdeinecs ,
                                           AV148Stocksquimicos_listadodeproductos_wcds_50_tfprdncas_sel ,
                                           AV147Stocksquimicos_listadodeproductos_wcds_49_tfprdncas ,
                                           Integer.valueOf(AV149Stocksquimicos_listadodeproductos_wcds_51_tfprvnum) ,
                                           Integer.valueOf(AV150Stocksquimicos_listadodeproductos_wcds_52_tfprvnum_to) ,
                                           AV152Stocksquimicos_listadodeproductos_wcds_54_tfprvnom_sel ,
                                           AV151Stocksquimicos_listadodeproductos_wcds_53_tfprvnom ,
                                           AV35PrdNumfrom ,
                                           AV36PrdnumTo ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A704PrdExiAlm ,
                                           A685PrdCanRes ,
                                           A684PrdCanPen ,
                                           A724PrdPreAct ,
                                           A6302TipPrdDsc ,
                                           A857ValDsc ,
                                           A727PrdRec ,
                                           A9733PrdAox ,
                                           A11363PrdGots ,
                                           A5887PrdReach ,
                                           A11364PrdHm ,
                                           A13302PrdTHELIST ,
                                           A9741PrdHS ,
                                           A9742PrdFHS ,
                                           A4693PrdNum2 ,
                                           A4692PrdNom2 ,
                                           A728PrdRefPrv ,
                                           A11615PrdFuncion ,
                                           A11614PrdEINECS ,
                                           A9734PrdNCAS ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext ,
                                           A13831PrdDisponi ,
                                           AV34emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV100Stocksquimicos_listadodeproductos_wcds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV100Stocksquimicos_listadodeproductos_wcds_2_tfprdnum), 6, "%") ;
      lV102Stocksquimicos_listadodeproductos_wcds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV102Stocksquimicos_listadodeproductos_wcds_4_tfprdnom), 26, "%") ;
      lV114Stocksquimicos_listadodeproductos_wcds_16_tftipprddsc = GXutil.padr( GXutil.rtrim( AV114Stocksquimicos_listadodeproductos_wcds_16_tftipprddsc), 40, "%") ;
      lV116Stocksquimicos_listadodeproductos_wcds_18_tfvaldsc = GXutil.padr( GXutil.rtrim( AV116Stocksquimicos_listadodeproductos_wcds_18_tfvaldsc), 16, "%") ;
      lV118Stocksquimicos_listadodeproductos_wcds_20_tfprdrec = GXutil.padr( GXutil.rtrim( AV118Stocksquimicos_listadodeproductos_wcds_20_tfprdrec), 1, "%") ;
      lV122Stocksquimicos_listadodeproductos_wcds_24_tfprdgots = GXutil.padr( GXutil.rtrim( AV122Stocksquimicos_listadodeproductos_wcds_24_tfprdgots), 1, "%") ;
      lV124Stocksquimicos_listadodeproductos_wcds_26_tfprdreach = GXutil.padr( GXutil.rtrim( AV124Stocksquimicos_listadodeproductos_wcds_26_tfprdreach), 1, "%") ;
      lV127Stocksquimicos_listadodeproductos_wcds_29_tfprdhm = GXutil.padr( GXutil.rtrim( AV127Stocksquimicos_listadodeproductos_wcds_29_tfprdhm), 1, "%") ;
      lV131Stocksquimicos_listadodeproductos_wcds_33_tfprdthelist = GXutil.padr( GXutil.rtrim( AV131Stocksquimicos_listadodeproductos_wcds_33_tfprdthelist), 4, "%") ;
      lV134Stocksquimicos_listadodeproductos_wcds_36_tfprdhs = GXutil.padr( GXutil.rtrim( AV134Stocksquimicos_listadodeproductos_wcds_36_tfprdhs), 1, "%") ;
      lV137Stocksquimicos_listadodeproductos_wcds_39_tfprdnum2 = GXutil.padr( GXutil.rtrim( AV137Stocksquimicos_listadodeproductos_wcds_39_tfprdnum2), 16, "%") ;
      lV139Stocksquimicos_listadodeproductos_wcds_41_tfprdnom2 = GXutil.padr( GXutil.rtrim( AV139Stocksquimicos_listadodeproductos_wcds_41_tfprdnom2), 40, "%") ;
      lV141Stocksquimicos_listadodeproductos_wcds_43_tfprdrefprv = GXutil.padr( GXutil.rtrim( AV141Stocksquimicos_listadodeproductos_wcds_43_tfprdrefprv), 30, "%") ;
      lV143Stocksquimicos_listadodeproductos_wcds_45_tfprdfuncion = GXutil.padr( GXutil.rtrim( AV143Stocksquimicos_listadodeproductos_wcds_45_tfprdfuncion), 50, "%") ;
      lV145Stocksquimicos_listadodeproductos_wcds_47_tfprdeinecs = GXutil.padr( GXutil.rtrim( AV145Stocksquimicos_listadodeproductos_wcds_47_tfprdeinecs), 40, "%") ;
      lV147Stocksquimicos_listadodeproductos_wcds_49_tfprdncas = GXutil.padr( GXutil.rtrim( AV147Stocksquimicos_listadodeproductos_wcds_49_tfprdncas), 30, "%") ;
      lV151Stocksquimicos_listadodeproductos_wcds_53_tfprvnom = GXutil.padr( GXutil.rtrim( AV151Stocksquimicos_listadodeproductos_wcds_53_tfprvnom), 30, "%") ;
      /* Using cursor H01KX2 */
      pr_default.execute(0, new Object[] {AV34emprcod, lV100Stocksquimicos_listadodeproductos_wcds_2_tfprdnum, AV101Stocksquimicos_listadodeproductos_wcds_3_tfprdnum_sel, lV102Stocksquimicos_listadodeproductos_wcds_4_tfprdnom, AV103Stocksquimicos_listadodeproductos_wcds_5_tfprdnom_sel, AV104Stocksquimicos_listadodeproductos_wcds_6_tfprdexialm, AV105Stocksquimicos_listadodeproductos_wcds_7_tfprdexialm_to, AV106Stocksquimicos_listadodeproductos_wcds_8_tfprdcanres, AV107Stocksquimicos_listadodeproductos_wcds_9_tfprdcanres_to, AV108Stocksquimicos_listadodeproductos_wcds_10_tfprddisponible, AV109Stocksquimicos_listadodeproductos_wcds_11_tfprddisponible_to, AV110Stocksquimicos_listadodeproductos_wcds_12_tfprdcanpen, AV111Stocksquimicos_listadodeproductos_wcds_13_tfprdcanpen_to, AV112Stocksquimicos_listadodeproductos_wcds_14_tfprdpreact, AV113Stocksquimicos_listadodeproductos_wcds_15_tfprdpreact_to, lV114Stocksquimicos_listadodeproductos_wcds_16_tftipprddsc, AV115Stocksquimicos_listadodeproductos_wcds_17_tftipprddsc_sel, lV116Stocksquimicos_listadodeproductos_wcds_18_tfvaldsc, AV117Stocksquimicos_listadodeproductos_wcds_19_tfvaldsc_sel, lV118Stocksquimicos_listadodeproductos_wcds_20_tfprdrec, AV119Stocksquimicos_listadodeproductos_wcds_21_tfprdrec_sel, AV120Stocksquimicos_listadodeproductos_wcds_22_tfprdaox, AV121Stocksquimicos_listadodeproductos_wcds_23_tfprdaox_to, lV122Stocksquimicos_listadodeproductos_wcds_24_tfprdgots, AV123Stocksquimicos_listadodeproductos_wcds_25_tfprdgots_sel, lV124Stocksquimicos_listadodeproductos_wcds_26_tfprdreach, AV125Stocksquimicos_listadodeproductos_wcds_27_tfprdreach_sel, lV127Stocksquimicos_listadodeproductos_wcds_29_tfprdhm, AV128Stocksquimicos_listadodeproductos_wcds_30_tfprdhm_sel, lV131Stocksquimicos_listadodeproductos_wcds_33_tfprdthelist, AV132Stocksquimicos_listadodeproductos_wcds_34_tfprdthelist_sel, lV134Stocksquimicos_listadodeproductos_wcds_36_tfprdhs, AV135Stocksquimicos_listadodeproductos_wcds_37_tfprdhs_sel, AV136Stocksquimicos_listadodeproductos_wcds_38_tfprdfhs, lV137Stocksquimicos_listadodeproductos_wcds_39_tfprdnum2, AV138Stocksquimicos_listadodeproductos_wcds_40_tfprdnum2_sel, lV139Stocksquimicos_listadodeproductos_wcds_41_tfprdnom2, AV140Stocksquimicos_listadodeproductos_wcds_42_tfprdnom2_sel, lV141Stocksquimicos_listadodeproductos_wcds_43_tfprdrefprv, AV142Stocksquimicos_listadodeproductos_wcds_44_tfprdrefprv_sel, lV143Stocksquimicos_listadodeproductos_wcds_45_tfprdfuncion, AV144Stocksquimicos_listadodeproductos_wcds_46_tfprdfuncion_sel, lV145Stocksquimicos_listadodeproductos_wcds_47_tfprdeinecs, AV146Stocksquimicos_listadodeproductos_wcds_48_tfprdeinecs_sel, lV147Stocksquimicos_listadodeproductos_wcds_49_tfprdncas, AV148Stocksquimicos_listadodeproductos_wcds_50_tfprdncas_sel, Integer.valueOf(AV149Stocksquimicos_listadodeproductos_wcds_51_tfprvnum), Integer.valueOf(AV150Stocksquimicos_listadodeproductos_wcds_52_tfprvnum_to), lV151Stocksquimicos_listadodeproductos_wcds_53_tfprvnom, AV152Stocksquimicos_listadodeproductos_wcds_54_tfprvnom_sel, AV35PrdNumfrom, AV36PrdnumTo});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A856ValCod = H01KX2_A856ValCod[0] ;
         A6301TipPrdCod = H01KX2_A6301TipPrdCod[0] ;
         n6301TipPrdCod = H01KX2_n6301TipPrdCod[0] ;
         A396EmprCod = H01KX2_A396EmprCod[0] ;
         A794PrvNom = H01KX2_A794PrvNom[0] ;
         n794PrvNom = H01KX2_n794PrvNom[0] ;
         A795PrvNum = H01KX2_A795PrvNum[0] ;
         A9734PrdNCAS = H01KX2_A9734PrdNCAS[0] ;
         A11614PrdEINECS = H01KX2_A11614PrdEINECS[0] ;
         A11615PrdFuncion = H01KX2_A11615PrdFuncion[0] ;
         A728PrdRefPrv = H01KX2_A728PrdRefPrv[0] ;
         A4692PrdNom2 = H01KX2_A4692PrdNom2[0] ;
         A4693PrdNum2 = H01KX2_A4693PrdNum2[0] ;
         A9742PrdFHS = H01KX2_A9742PrdFHS[0] ;
         A9741PrdHS = H01KX2_A9741PrdHS[0] ;
         A13974PrdGRS = H01KX2_A13974PrdGRS[0] ;
         n13974PrdGRS = H01KX2_n13974PrdGRS[0] ;
         A13302PrdTHELIST = H01KX2_A13302PrdTHELIST[0] ;
         n13302PrdTHELIST = H01KX2_n13302PrdTHELIST[0] ;
         A11687PrdList = H01KX2_A11687PrdList[0] ;
         A13301PrdZDHC = H01KX2_A13301PrdZDHC[0] ;
         A11364PrdHm = H01KX2_A11364PrdHm[0] ;
         A5888PrdOkotex = H01KX2_A5888PrdOkotex[0] ;
         A5887PrdReach = H01KX2_A5887PrdReach[0] ;
         A11363PrdGots = H01KX2_A11363PrdGots[0] ;
         A9733PrdAox = H01KX2_A9733PrdAox[0] ;
         A727PrdRec = H01KX2_A727PrdRec[0] ;
         A857ValDsc = H01KX2_A857ValDsc[0] ;
         n857ValDsc = H01KX2_n857ValDsc[0] ;
         A6302TipPrdDsc = H01KX2_A6302TipPrdDsc[0] ;
         n6302TipPrdDsc = H01KX2_n6302TipPrdDsc[0] ;
         A724PrdPreAct = H01KX2_A724PrdPreAct[0] ;
         A684PrdCanPen = H01KX2_A684PrdCanPen[0] ;
         A13831PrdDisponi = H01KX2_A13831PrdDisponi[0] ;
         A718PrdNom = H01KX2_A718PrdNom[0] ;
         A719PrdNum = H01KX2_A719PrdNum[0] ;
         A704PrdExiAlm = H01KX2_A704PrdExiAlm[0] ;
         A685PrdCanRes = H01KX2_A685PrdCanRes[0] ;
         A857ValDsc = H01KX2_A857ValDsc[0] ;
         n857ValDsc = H01KX2_n857ValDsc[0] ;
         A6302TipPrdDsc = H01KX2_A6302TipPrdDsc[0] ;
         n6302TipPrdDsc = H01KX2_n6302TipPrdDsc[0] ;
         A794PrvNom = H01KX2_A794PrvNom[0] ;
         n794PrvNom = H01KX2_n794PrvNom[0] ;
         if ( (GXutil.strcmp("", AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A719PrdNum) , GXutil.padr( "%" + GXutil.upper( AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A718PrdNom) , GXutil.padr( "%" + GXutil.upper( AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A704PrdExiAlm, 12, 4) , GXutil.padr( "%" + AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A685PrdCanRes, 12, 4) , GXutil.padr( "%" + AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13831PrdDisponi, 12, 4) , GXutil.padr( "%" + AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A684PrdCanPen, 12, 4) , GXutil.padr( "%" + AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A724PrdPreAct, 14, 5) , GXutil.padr( "%" + AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6302TipPrdDsc) , GXutil.padr( "%" + GXutil.upper( AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A857ValDsc) , GXutil.padr( "%" + GXutil.upper( AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A727PrdRec) , GXutil.padr( "%" + GXutil.upper( AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9733PrdAox, 6, 2) , GXutil.padr( "%" + AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11363PrdGots) , GXutil.padr( "%" + GXutil.upper( AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5887PrdReach) , GXutil.padr( "%" + GXutil.upper( AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "n", "") , GXutil.padr( "%" + GXutil.lower( AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5888PrdOkotex, "N") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "s", "") , GXutil.padr( "%" + GXutil.lower( AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5888PrdOkotex, "S") == 0 ) ) || ( GXutil.like( GXutil.upper( A11364PrdHm) , GXutil.padr( "%" + GXutil.upper( AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "n", "") , GXutil.padr( "%" + GXutil.lower( AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "N") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "nivel 1", "") , GXutil.padr( "%" + GXutil.lower( AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "1") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "nivel 2", "") , GXutil.padr( "%" + GXutil.lower( AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "2") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "nivel 3", "") , GXutil.padr( "%" + GXutil.lower( AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "3") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "s", "") , GXutil.padr( "%" + GXutil.lower( AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11687PrdList, "S") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "n", "") , GXutil.padr( "%" + GXutil.lower( AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11687PrdList, "N") == 0 ) ) || ( GXutil.like( GXutil.upper( A13302PrdTHELIST) , GXutil.padr( "%" + GXutil.upper( AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "n", "") , GXutil.padr( "%" + GXutil.lower( AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13974PrdGRS, "N") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "s", "") , GXutil.padr( "%" + GXutil.lower( AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13974PrdGRS, "S") == 0 ) ) || ( GXutil.like( GXutil.upper( A9741PrdHS) , GXutil.padr( "%" + GXutil.upper( AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4693PrdNum2) , GXutil.padr( "%" + GXutil.upper( AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4692PrdNom2) , GXutil.padr( "%" + GXutil.upper( AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A728PrdRefPrv) , GXutil.padr( "%" + GXutil.upper( AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11615PrdFuncion) , GXutil.padr( "%" + GXutil.upper( AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11614PrdEINECS) , GXutil.padr( "%" + GXutil.upper( AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9734PrdNCAS) , GXutil.padr( "%" + GXutil.upper( AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
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

   public void rf1KX2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(43) ;
      /* Execute user event: Refresh */
      e201KX2 ();
      nGXsfl_43_idx = 1 ;
      sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_432( ) ;
      bGXsfl_43_Refreshing = true ;
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
         subsflControlProps_432( ) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              A5888PrdOkotex ,
                                              AV126Stocksquimicos_listadodeproductos_wcds_28_tfprdokotex_sels ,
                                              A13301PrdZDHC ,
                                              AV129Stocksquimicos_listadodeproductos_wcds_31_tfprdzdhc_sels ,
                                              A11687PrdList ,
                                              AV130Stocksquimicos_listadodeproductos_wcds_32_tfprdlist_sels ,
                                              A13974PrdGRS ,
                                              AV133Stocksquimicos_listadodeproductos_wcds_35_tfprdgrs_sels ,
                                              AV101Stocksquimicos_listadodeproductos_wcds_3_tfprdnum_sel ,
                                              AV100Stocksquimicos_listadodeproductos_wcds_2_tfprdnum ,
                                              AV103Stocksquimicos_listadodeproductos_wcds_5_tfprdnom_sel ,
                                              AV102Stocksquimicos_listadodeproductos_wcds_4_tfprdnom ,
                                              AV104Stocksquimicos_listadodeproductos_wcds_6_tfprdexialm ,
                                              AV105Stocksquimicos_listadodeproductos_wcds_7_tfprdexialm_to ,
                                              AV106Stocksquimicos_listadodeproductos_wcds_8_tfprdcanres ,
                                              AV107Stocksquimicos_listadodeproductos_wcds_9_tfprdcanres_to ,
                                              AV108Stocksquimicos_listadodeproductos_wcds_10_tfprddisponible ,
                                              AV109Stocksquimicos_listadodeproductos_wcds_11_tfprddisponible_to ,
                                              AV110Stocksquimicos_listadodeproductos_wcds_12_tfprdcanpen ,
                                              AV111Stocksquimicos_listadodeproductos_wcds_13_tfprdcanpen_to ,
                                              AV112Stocksquimicos_listadodeproductos_wcds_14_tfprdpreact ,
                                              AV113Stocksquimicos_listadodeproductos_wcds_15_tfprdpreact_to ,
                                              AV115Stocksquimicos_listadodeproductos_wcds_17_tftipprddsc_sel ,
                                              AV114Stocksquimicos_listadodeproductos_wcds_16_tftipprddsc ,
                                              AV117Stocksquimicos_listadodeproductos_wcds_19_tfvaldsc_sel ,
                                              AV116Stocksquimicos_listadodeproductos_wcds_18_tfvaldsc ,
                                              AV119Stocksquimicos_listadodeproductos_wcds_21_tfprdrec_sel ,
                                              AV118Stocksquimicos_listadodeproductos_wcds_20_tfprdrec ,
                                              AV120Stocksquimicos_listadodeproductos_wcds_22_tfprdaox ,
                                              AV121Stocksquimicos_listadodeproductos_wcds_23_tfprdaox_to ,
                                              AV123Stocksquimicos_listadodeproductos_wcds_25_tfprdgots_sel ,
                                              AV122Stocksquimicos_listadodeproductos_wcds_24_tfprdgots ,
                                              AV125Stocksquimicos_listadodeproductos_wcds_27_tfprdreach_sel ,
                                              AV124Stocksquimicos_listadodeproductos_wcds_26_tfprdreach ,
                                              Integer.valueOf(AV126Stocksquimicos_listadodeproductos_wcds_28_tfprdokotex_sels.size()) ,
                                              AV128Stocksquimicos_listadodeproductos_wcds_30_tfprdhm_sel ,
                                              AV127Stocksquimicos_listadodeproductos_wcds_29_tfprdhm ,
                                              Integer.valueOf(AV129Stocksquimicos_listadodeproductos_wcds_31_tfprdzdhc_sels.size()) ,
                                              Integer.valueOf(AV130Stocksquimicos_listadodeproductos_wcds_32_tfprdlist_sels.size()) ,
                                              AV132Stocksquimicos_listadodeproductos_wcds_34_tfprdthelist_sel ,
                                              AV131Stocksquimicos_listadodeproductos_wcds_33_tfprdthelist ,
                                              Integer.valueOf(AV133Stocksquimicos_listadodeproductos_wcds_35_tfprdgrs_sels.size()) ,
                                              AV135Stocksquimicos_listadodeproductos_wcds_37_tfprdhs_sel ,
                                              AV134Stocksquimicos_listadodeproductos_wcds_36_tfprdhs ,
                                              AV136Stocksquimicos_listadodeproductos_wcds_38_tfprdfhs ,
                                              AV138Stocksquimicos_listadodeproductos_wcds_40_tfprdnum2_sel ,
                                              AV137Stocksquimicos_listadodeproductos_wcds_39_tfprdnum2 ,
                                              AV140Stocksquimicos_listadodeproductos_wcds_42_tfprdnom2_sel ,
                                              AV139Stocksquimicos_listadodeproductos_wcds_41_tfprdnom2 ,
                                              AV142Stocksquimicos_listadodeproductos_wcds_44_tfprdrefprv_sel ,
                                              AV141Stocksquimicos_listadodeproductos_wcds_43_tfprdrefprv ,
                                              AV144Stocksquimicos_listadodeproductos_wcds_46_tfprdfuncion_sel ,
                                              AV143Stocksquimicos_listadodeproductos_wcds_45_tfprdfuncion ,
                                              AV146Stocksquimicos_listadodeproductos_wcds_48_tfprdeinecs_sel ,
                                              AV145Stocksquimicos_listadodeproductos_wcds_47_tfprdeinecs ,
                                              AV148Stocksquimicos_listadodeproductos_wcds_50_tfprdncas_sel ,
                                              AV147Stocksquimicos_listadodeproductos_wcds_49_tfprdncas ,
                                              Integer.valueOf(AV149Stocksquimicos_listadodeproductos_wcds_51_tfprvnum) ,
                                              Integer.valueOf(AV150Stocksquimicos_listadodeproductos_wcds_52_tfprvnum_to) ,
                                              AV152Stocksquimicos_listadodeproductos_wcds_54_tfprvnom_sel ,
                                              AV151Stocksquimicos_listadodeproductos_wcds_53_tfprvnom ,
                                              AV35PrdNumfrom ,
                                              AV36PrdnumTo ,
                                              A719PrdNum ,
                                              A718PrdNom ,
                                              A704PrdExiAlm ,
                                              A685PrdCanRes ,
                                              A684PrdCanPen ,
                                              A724PrdPreAct ,
                                              A6302TipPrdDsc ,
                                              A857ValDsc ,
                                              A727PrdRec ,
                                              A9733PrdAox ,
                                              A11363PrdGots ,
                                              A5887PrdReach ,
                                              A11364PrdHm ,
                                              A13302PrdTHELIST ,
                                              A9741PrdHS ,
                                              A9742PrdFHS ,
                                              A4693PrdNum2 ,
                                              A4692PrdNom2 ,
                                              A728PrdRefPrv ,
                                              A11615PrdFuncion ,
                                              A11614PrdEINECS ,
                                              A9734PrdNCAS ,
                                              Integer.valueOf(A795PrvNum) ,
                                              A794PrvNom ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext ,
                                              A13831PrdDisponi ,
                                              AV34emprcod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV100Stocksquimicos_listadodeproductos_wcds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV100Stocksquimicos_listadodeproductos_wcds_2_tfprdnum), 6, "%") ;
         lV102Stocksquimicos_listadodeproductos_wcds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV102Stocksquimicos_listadodeproductos_wcds_4_tfprdnom), 26, "%") ;
         lV114Stocksquimicos_listadodeproductos_wcds_16_tftipprddsc = GXutil.padr( GXutil.rtrim( AV114Stocksquimicos_listadodeproductos_wcds_16_tftipprddsc), 40, "%") ;
         lV116Stocksquimicos_listadodeproductos_wcds_18_tfvaldsc = GXutil.padr( GXutil.rtrim( AV116Stocksquimicos_listadodeproductos_wcds_18_tfvaldsc), 16, "%") ;
         lV118Stocksquimicos_listadodeproductos_wcds_20_tfprdrec = GXutil.padr( GXutil.rtrim( AV118Stocksquimicos_listadodeproductos_wcds_20_tfprdrec), 1, "%") ;
         lV122Stocksquimicos_listadodeproductos_wcds_24_tfprdgots = GXutil.padr( GXutil.rtrim( AV122Stocksquimicos_listadodeproductos_wcds_24_tfprdgots), 1, "%") ;
         lV124Stocksquimicos_listadodeproductos_wcds_26_tfprdreach = GXutil.padr( GXutil.rtrim( AV124Stocksquimicos_listadodeproductos_wcds_26_tfprdreach), 1, "%") ;
         lV127Stocksquimicos_listadodeproductos_wcds_29_tfprdhm = GXutil.padr( GXutil.rtrim( AV127Stocksquimicos_listadodeproductos_wcds_29_tfprdhm), 1, "%") ;
         lV131Stocksquimicos_listadodeproductos_wcds_33_tfprdthelist = GXutil.padr( GXutil.rtrim( AV131Stocksquimicos_listadodeproductos_wcds_33_tfprdthelist), 4, "%") ;
         lV134Stocksquimicos_listadodeproductos_wcds_36_tfprdhs = GXutil.padr( GXutil.rtrim( AV134Stocksquimicos_listadodeproductos_wcds_36_tfprdhs), 1, "%") ;
         lV137Stocksquimicos_listadodeproductos_wcds_39_tfprdnum2 = GXutil.padr( GXutil.rtrim( AV137Stocksquimicos_listadodeproductos_wcds_39_tfprdnum2), 16, "%") ;
         lV139Stocksquimicos_listadodeproductos_wcds_41_tfprdnom2 = GXutil.padr( GXutil.rtrim( AV139Stocksquimicos_listadodeproductos_wcds_41_tfprdnom2), 40, "%") ;
         lV141Stocksquimicos_listadodeproductos_wcds_43_tfprdrefprv = GXutil.padr( GXutil.rtrim( AV141Stocksquimicos_listadodeproductos_wcds_43_tfprdrefprv), 30, "%") ;
         lV143Stocksquimicos_listadodeproductos_wcds_45_tfprdfuncion = GXutil.padr( GXutil.rtrim( AV143Stocksquimicos_listadodeproductos_wcds_45_tfprdfuncion), 50, "%") ;
         lV145Stocksquimicos_listadodeproductos_wcds_47_tfprdeinecs = GXutil.padr( GXutil.rtrim( AV145Stocksquimicos_listadodeproductos_wcds_47_tfprdeinecs), 40, "%") ;
         lV147Stocksquimicos_listadodeproductos_wcds_49_tfprdncas = GXutil.padr( GXutil.rtrim( AV147Stocksquimicos_listadodeproductos_wcds_49_tfprdncas), 30, "%") ;
         lV151Stocksquimicos_listadodeproductos_wcds_53_tfprvnom = GXutil.padr( GXutil.rtrim( AV151Stocksquimicos_listadodeproductos_wcds_53_tfprvnom), 30, "%") ;
         /* Using cursor H01KX3 */
         pr_default.execute(1, new Object[] {AV34emprcod, lV100Stocksquimicos_listadodeproductos_wcds_2_tfprdnum, AV101Stocksquimicos_listadodeproductos_wcds_3_tfprdnum_sel, lV102Stocksquimicos_listadodeproductos_wcds_4_tfprdnom, AV103Stocksquimicos_listadodeproductos_wcds_5_tfprdnom_sel, AV104Stocksquimicos_listadodeproductos_wcds_6_tfprdexialm, AV105Stocksquimicos_listadodeproductos_wcds_7_tfprdexialm_to, AV106Stocksquimicos_listadodeproductos_wcds_8_tfprdcanres, AV107Stocksquimicos_listadodeproductos_wcds_9_tfprdcanres_to, AV108Stocksquimicos_listadodeproductos_wcds_10_tfprddisponible, AV109Stocksquimicos_listadodeproductos_wcds_11_tfprddisponible_to, AV110Stocksquimicos_listadodeproductos_wcds_12_tfprdcanpen, AV111Stocksquimicos_listadodeproductos_wcds_13_tfprdcanpen_to, AV112Stocksquimicos_listadodeproductos_wcds_14_tfprdpreact, AV113Stocksquimicos_listadodeproductos_wcds_15_tfprdpreact_to, lV114Stocksquimicos_listadodeproductos_wcds_16_tftipprddsc, AV115Stocksquimicos_listadodeproductos_wcds_17_tftipprddsc_sel, lV116Stocksquimicos_listadodeproductos_wcds_18_tfvaldsc, AV117Stocksquimicos_listadodeproductos_wcds_19_tfvaldsc_sel, lV118Stocksquimicos_listadodeproductos_wcds_20_tfprdrec, AV119Stocksquimicos_listadodeproductos_wcds_21_tfprdrec_sel, AV120Stocksquimicos_listadodeproductos_wcds_22_tfprdaox, AV121Stocksquimicos_listadodeproductos_wcds_23_tfprdaox_to, lV122Stocksquimicos_listadodeproductos_wcds_24_tfprdgots, AV123Stocksquimicos_listadodeproductos_wcds_25_tfprdgots_sel, lV124Stocksquimicos_listadodeproductos_wcds_26_tfprdreach, AV125Stocksquimicos_listadodeproductos_wcds_27_tfprdreach_sel, lV127Stocksquimicos_listadodeproductos_wcds_29_tfprdhm, AV128Stocksquimicos_listadodeproductos_wcds_30_tfprdhm_sel, lV131Stocksquimicos_listadodeproductos_wcds_33_tfprdthelist, AV132Stocksquimicos_listadodeproductos_wcds_34_tfprdthelist_sel, lV134Stocksquimicos_listadodeproductos_wcds_36_tfprdhs, AV135Stocksquimicos_listadodeproductos_wcds_37_tfprdhs_sel, AV136Stocksquimicos_listadodeproductos_wcds_38_tfprdfhs, lV137Stocksquimicos_listadodeproductos_wcds_39_tfprdnum2, AV138Stocksquimicos_listadodeproductos_wcds_40_tfprdnum2_sel, lV139Stocksquimicos_listadodeproductos_wcds_41_tfprdnom2, AV140Stocksquimicos_listadodeproductos_wcds_42_tfprdnom2_sel, lV141Stocksquimicos_listadodeproductos_wcds_43_tfprdrefprv, AV142Stocksquimicos_listadodeproductos_wcds_44_tfprdrefprv_sel, lV143Stocksquimicos_listadodeproductos_wcds_45_tfprdfuncion, AV144Stocksquimicos_listadodeproductos_wcds_46_tfprdfuncion_sel, lV145Stocksquimicos_listadodeproductos_wcds_47_tfprdeinecs, AV146Stocksquimicos_listadodeproductos_wcds_48_tfprdeinecs_sel, lV147Stocksquimicos_listadodeproductos_wcds_49_tfprdncas, AV148Stocksquimicos_listadodeproductos_wcds_50_tfprdncas_sel, Integer.valueOf(AV149Stocksquimicos_listadodeproductos_wcds_51_tfprvnum), Integer.valueOf(AV150Stocksquimicos_listadodeproductos_wcds_52_tfprvnum_to), lV151Stocksquimicos_listadodeproductos_wcds_53_tfprvnom, AV152Stocksquimicos_listadodeproductos_wcds_54_tfprvnom_sel, AV35PrdNumfrom, AV36PrdnumTo});
         nGXsfl_43_idx = 1 ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_432( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A856ValCod = H01KX3_A856ValCod[0] ;
            A6301TipPrdCod = H01KX3_A6301TipPrdCod[0] ;
            n6301TipPrdCod = H01KX3_n6301TipPrdCod[0] ;
            A396EmprCod = H01KX3_A396EmprCod[0] ;
            A794PrvNom = H01KX3_A794PrvNom[0] ;
            n794PrvNom = H01KX3_n794PrvNom[0] ;
            A795PrvNum = H01KX3_A795PrvNum[0] ;
            A9734PrdNCAS = H01KX3_A9734PrdNCAS[0] ;
            A11614PrdEINECS = H01KX3_A11614PrdEINECS[0] ;
            A11615PrdFuncion = H01KX3_A11615PrdFuncion[0] ;
            A728PrdRefPrv = H01KX3_A728PrdRefPrv[0] ;
            A4692PrdNom2 = H01KX3_A4692PrdNom2[0] ;
            A4693PrdNum2 = H01KX3_A4693PrdNum2[0] ;
            A9742PrdFHS = H01KX3_A9742PrdFHS[0] ;
            A9741PrdHS = H01KX3_A9741PrdHS[0] ;
            A13974PrdGRS = H01KX3_A13974PrdGRS[0] ;
            n13974PrdGRS = H01KX3_n13974PrdGRS[0] ;
            A13302PrdTHELIST = H01KX3_A13302PrdTHELIST[0] ;
            n13302PrdTHELIST = H01KX3_n13302PrdTHELIST[0] ;
            A11687PrdList = H01KX3_A11687PrdList[0] ;
            A13301PrdZDHC = H01KX3_A13301PrdZDHC[0] ;
            A11364PrdHm = H01KX3_A11364PrdHm[0] ;
            A5888PrdOkotex = H01KX3_A5888PrdOkotex[0] ;
            A5887PrdReach = H01KX3_A5887PrdReach[0] ;
            A11363PrdGots = H01KX3_A11363PrdGots[0] ;
            A9733PrdAox = H01KX3_A9733PrdAox[0] ;
            A727PrdRec = H01KX3_A727PrdRec[0] ;
            A857ValDsc = H01KX3_A857ValDsc[0] ;
            n857ValDsc = H01KX3_n857ValDsc[0] ;
            A6302TipPrdDsc = H01KX3_A6302TipPrdDsc[0] ;
            n6302TipPrdDsc = H01KX3_n6302TipPrdDsc[0] ;
            A724PrdPreAct = H01KX3_A724PrdPreAct[0] ;
            A684PrdCanPen = H01KX3_A684PrdCanPen[0] ;
            A13831PrdDisponi = H01KX3_A13831PrdDisponi[0] ;
            A718PrdNom = H01KX3_A718PrdNom[0] ;
            A719PrdNum = H01KX3_A719PrdNum[0] ;
            A704PrdExiAlm = H01KX3_A704PrdExiAlm[0] ;
            A685PrdCanRes = H01KX3_A685PrdCanRes[0] ;
            A857ValDsc = H01KX3_A857ValDsc[0] ;
            n857ValDsc = H01KX3_n857ValDsc[0] ;
            A6302TipPrdDsc = H01KX3_A6302TipPrdDsc[0] ;
            n6302TipPrdDsc = H01KX3_n6302TipPrdDsc[0] ;
            A794PrvNom = H01KX3_A794PrvNom[0] ;
            n794PrvNom = H01KX3_n794PrvNom[0] ;
            if ( (GXutil.strcmp("", AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A719PrdNum) , GXutil.padr( "%" + GXutil.upper( AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A718PrdNom) , GXutil.padr( "%" + GXutil.upper( AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A704PrdExiAlm, 12, 4) , GXutil.padr( "%" + AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A685PrdCanRes, 12, 4) , GXutil.padr( "%" + AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13831PrdDisponi, 12, 4) , GXutil.padr( "%" + AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A684PrdCanPen, 12, 4) , GXutil.padr( "%" + AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A724PrdPreAct, 14, 5) , GXutil.padr( "%" + AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6302TipPrdDsc) , GXutil.padr( "%" + GXutil.upper( AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A857ValDsc) , GXutil.padr( "%" + GXutil.upper( AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A727PrdRec) , GXutil.padr( "%" + GXutil.upper( AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9733PrdAox, 6, 2) , GXutil.padr( "%" + AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11363PrdGots) , GXutil.padr( "%" + GXutil.upper( AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5887PrdReach) , GXutil.padr( "%" + GXutil.upper( AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "n", "") , GXutil.padr( "%" + GXutil.lower( AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5888PrdOkotex, "N") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "s", "") , GXutil.padr( "%" + GXutil.lower( AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5888PrdOkotex, "S") == 0 ) ) || ( GXutil.like( GXutil.upper( A11364PrdHm) , GXutil.padr( "%" + GXutil.upper( AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "n", "") , GXutil.padr( "%" + GXutil.lower( AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "N") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "nivel 1", "") , GXutil.padr( "%" + GXutil.lower( AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "1") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "nivel 2", "") , GXutil.padr( "%" + GXutil.lower( AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "2") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "nivel 3", "") , GXutil.padr( "%" + GXutil.lower( AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "3") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "s", "") , GXutil.padr( "%" + GXutil.lower( AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11687PrdList, "S") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "n", "") , GXutil.padr( "%" + GXutil.lower( AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11687PrdList, "N") == 0 ) ) || ( GXutil.like( GXutil.upper( A13302PrdTHELIST) , GXutil.padr( "%" + GXutil.upper( AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "n", "") , GXutil.padr( "%" + GXutil.lower( AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13974PrdGRS, "N") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "s", "") , GXutil.padr( "%" + GXutil.lower( AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13974PrdGRS, "S") == 0 ) ) || ( GXutil.like( GXutil.upper( A9741PrdHS) , GXutil.padr( "%" + GXutil.upper( AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4693PrdNum2) , GXutil.padr( "%" + GXutil.upper( AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4692PrdNom2) , GXutil.padr( "%" + GXutil.upper( AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A728PrdRefPrv) , GXutil.padr( "%" + GXutil.upper( AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11615PrdFuncion) , GXutil.padr( "%" + GXutil.upper( AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11614PrdEINECS) , GXutil.padr( "%" + GXutil.upper( AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9734PrdNCAS) , GXutil.padr( "%" + GXutil.upper( AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
            {
               e211KX2 ();
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(43) ;
         wb1KX0( ) ;
      }
      bGXsfl_43_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1KX2( )
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
      AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext = AV15FilterFullText ;
      AV100Stocksquimicos_listadodeproductos_wcds_2_tfprdnum = AV26TFPrdNum ;
      AV101Stocksquimicos_listadodeproductos_wcds_3_tfprdnum_sel = AV27TFPrdNum_Sel ;
      AV102Stocksquimicos_listadodeproductos_wcds_4_tfprdnom = AV28TFPrdNom ;
      AV103Stocksquimicos_listadodeproductos_wcds_5_tfprdnom_sel = AV29TFPrdNom_Sel ;
      AV104Stocksquimicos_listadodeproductos_wcds_6_tfprdexialm = AV37TFPrdExiAlm ;
      AV105Stocksquimicos_listadodeproductos_wcds_7_tfprdexialm_to = AV38TFPrdExiAlm_To ;
      AV106Stocksquimicos_listadodeproductos_wcds_8_tfprdcanres = AV39TFPrdCanRes ;
      AV107Stocksquimicos_listadodeproductos_wcds_9_tfprdcanres_to = AV40TFPrdCanRes_To ;
      AV108Stocksquimicos_listadodeproductos_wcds_10_tfprddisponible = AV91TFPrdDisponible ;
      AV109Stocksquimicos_listadodeproductos_wcds_11_tfprddisponible_to = AV92TFPrdDisponible_To ;
      AV110Stocksquimicos_listadodeproductos_wcds_12_tfprdcanpen = AV41TFPrdCanPen ;
      AV111Stocksquimicos_listadodeproductos_wcds_13_tfprdcanpen_to = AV42TFPrdCanPen_To ;
      AV112Stocksquimicos_listadodeproductos_wcds_14_tfprdpreact = AV43TFPrdPreAct ;
      AV113Stocksquimicos_listadodeproductos_wcds_15_tfprdpreact_to = AV44TFPrdPreAct_To ;
      AV114Stocksquimicos_listadodeproductos_wcds_16_tftipprddsc = AV45TFTipPrdDsc ;
      AV115Stocksquimicos_listadodeproductos_wcds_17_tftipprddsc_sel = AV46TFTipPrdDsc_Sel ;
      AV116Stocksquimicos_listadodeproductos_wcds_18_tfvaldsc = AV47TFValDsc ;
      AV117Stocksquimicos_listadodeproductos_wcds_19_tfvaldsc_sel = AV48TFValDsc_Sel ;
      AV118Stocksquimicos_listadodeproductos_wcds_20_tfprdrec = AV49TFPrdRec ;
      AV119Stocksquimicos_listadodeproductos_wcds_21_tfprdrec_sel = AV50TFPrdRec_Sel ;
      AV120Stocksquimicos_listadodeproductos_wcds_22_tfprdaox = AV51TFPrdAox ;
      AV121Stocksquimicos_listadodeproductos_wcds_23_tfprdaox_to = AV52TFPrdAox_To ;
      AV122Stocksquimicos_listadodeproductos_wcds_24_tfprdgots = AV53TFPrdGots ;
      AV123Stocksquimicos_listadodeproductos_wcds_25_tfprdgots_sel = AV54TFPrdGots_Sel ;
      AV124Stocksquimicos_listadodeproductos_wcds_26_tfprdreach = AV55TFPrdReach ;
      AV125Stocksquimicos_listadodeproductos_wcds_27_tfprdreach_sel = AV56TFPrdReach_Sel ;
      AV126Stocksquimicos_listadodeproductos_wcds_28_tfprdokotex_sels = AV58TFPrdOkotex_Sels ;
      AV127Stocksquimicos_listadodeproductos_wcds_29_tfprdhm = AV59TFPrdHm ;
      AV128Stocksquimicos_listadodeproductos_wcds_30_tfprdhm_sel = AV60TFPrdHm_Sel ;
      AV129Stocksquimicos_listadodeproductos_wcds_31_tfprdzdhc_sels = AV62TFPrdZDHC_Sels ;
      AV130Stocksquimicos_listadodeproductos_wcds_32_tfprdlist_sels = AV64TFPrdList_Sels ;
      AV131Stocksquimicos_listadodeproductos_wcds_33_tfprdthelist = AV65TFPrdTHELIST ;
      AV132Stocksquimicos_listadodeproductos_wcds_34_tfprdthelist_sel = AV66TFPrdTHELIST_Sel ;
      AV133Stocksquimicos_listadodeproductos_wcds_35_tfprdgrs_sels = AV68TFPrdGRS_Sels ;
      AV134Stocksquimicos_listadodeproductos_wcds_36_tfprdhs = AV69TFPrdHS ;
      AV135Stocksquimicos_listadodeproductos_wcds_37_tfprdhs_sel = AV70TFPrdHS_Sel ;
      AV136Stocksquimicos_listadodeproductos_wcds_38_tfprdfhs = AV71TFPrdFHS ;
      AV137Stocksquimicos_listadodeproductos_wcds_39_tfprdnum2 = AV75TFPrdNum2 ;
      AV138Stocksquimicos_listadodeproductos_wcds_40_tfprdnum2_sel = AV76TFPrdNum2_Sel ;
      AV139Stocksquimicos_listadodeproductos_wcds_41_tfprdnom2 = AV77TFPrdNom2 ;
      AV140Stocksquimicos_listadodeproductos_wcds_42_tfprdnom2_sel = AV78TFPrdNom2_Sel ;
      AV141Stocksquimicos_listadodeproductos_wcds_43_tfprdrefprv = AV79TFPrdRefPrv ;
      AV142Stocksquimicos_listadodeproductos_wcds_44_tfprdrefprv_sel = AV80TFPrdRefPrv_Sel ;
      AV143Stocksquimicos_listadodeproductos_wcds_45_tfprdfuncion = AV81TFPrdFuncion ;
      AV144Stocksquimicos_listadodeproductos_wcds_46_tfprdfuncion_sel = AV82TFPrdFuncion_Sel ;
      AV145Stocksquimicos_listadodeproductos_wcds_47_tfprdeinecs = AV83TFPrdEINECS ;
      AV146Stocksquimicos_listadodeproductos_wcds_48_tfprdeinecs_sel = AV84TFPrdEINECS_Sel ;
      AV147Stocksquimicos_listadodeproductos_wcds_49_tfprdncas = AV85TFPrdNCAS ;
      AV148Stocksquimicos_listadodeproductos_wcds_50_tfprdncas_sel = AV86TFPrdNCAS_Sel ;
      AV149Stocksquimicos_listadodeproductos_wcds_51_tfprvnum = AV87TFPrvNum ;
      AV150Stocksquimicos_listadodeproductos_wcds_52_tfprvnum_to = AV88TFPrvNum_To ;
      AV151Stocksquimicos_listadodeproductos_wcds_53_tfprvnom = AV89TFPrvNom ;
      AV152Stocksquimicos_listadodeproductos_wcds_54_tfprvnom_sel = AV90TFPrvNom_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV34emprcod, AV35PrdNumfrom, AV36PrdnumTo, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFPrdNum, AV27TFPrdNum_Sel, AV28TFPrdNom, AV29TFPrdNom_Sel, AV37TFPrdExiAlm, AV38TFPrdExiAlm_To, AV39TFPrdCanRes, AV40TFPrdCanRes_To, AV91TFPrdDisponible, AV92TFPrdDisponible_To, AV41TFPrdCanPen, AV42TFPrdCanPen_To, AV43TFPrdPreAct, AV44TFPrdPreAct_To, AV45TFTipPrdDsc, AV46TFTipPrdDsc_Sel, AV47TFValDsc, AV48TFValDsc_Sel, AV49TFPrdRec, AV50TFPrdRec_Sel, AV51TFPrdAox, AV52TFPrdAox_To, AV53TFPrdGots, AV54TFPrdGots_Sel, AV55TFPrdReach, AV56TFPrdReach_Sel, AV58TFPrdOkotex_Sels, AV59TFPrdHm, AV60TFPrdHm_Sel, AV62TFPrdZDHC_Sels, AV64TFPrdList_Sels, AV65TFPrdTHELIST, AV66TFPrdTHELIST_Sel, AV68TFPrdGRS_Sels, AV69TFPrdHS, AV70TFPrdHS_Sel, AV71TFPrdFHS, AV75TFPrdNum2, AV76TFPrdNum2_Sel, AV77TFPrdNom2, AV78TFPrdNom2_Sel, AV79TFPrdRefPrv, AV80TFPrdRefPrv_Sel, AV81TFPrdFuncion, AV82TFPrdFuncion_Sel, AV83TFPrdEINECS, AV84TFPrdEINECS_Sel, AV85TFPrdNCAS, AV86TFPrdNCAS_Sel, AV87TFPrvNum, AV88TFPrvNum_To, AV89TFPrvNom, AV90TFPrvNom_Sel, AV95Pgmname, AV12OrderedBy, AV13OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext = AV15FilterFullText ;
      AV100Stocksquimicos_listadodeproductos_wcds_2_tfprdnum = AV26TFPrdNum ;
      AV101Stocksquimicos_listadodeproductos_wcds_3_tfprdnum_sel = AV27TFPrdNum_Sel ;
      AV102Stocksquimicos_listadodeproductos_wcds_4_tfprdnom = AV28TFPrdNom ;
      AV103Stocksquimicos_listadodeproductos_wcds_5_tfprdnom_sel = AV29TFPrdNom_Sel ;
      AV104Stocksquimicos_listadodeproductos_wcds_6_tfprdexialm = AV37TFPrdExiAlm ;
      AV105Stocksquimicos_listadodeproductos_wcds_7_tfprdexialm_to = AV38TFPrdExiAlm_To ;
      AV106Stocksquimicos_listadodeproductos_wcds_8_tfprdcanres = AV39TFPrdCanRes ;
      AV107Stocksquimicos_listadodeproductos_wcds_9_tfprdcanres_to = AV40TFPrdCanRes_To ;
      AV108Stocksquimicos_listadodeproductos_wcds_10_tfprddisponible = AV91TFPrdDisponible ;
      AV109Stocksquimicos_listadodeproductos_wcds_11_tfprddisponible_to = AV92TFPrdDisponible_To ;
      AV110Stocksquimicos_listadodeproductos_wcds_12_tfprdcanpen = AV41TFPrdCanPen ;
      AV111Stocksquimicos_listadodeproductos_wcds_13_tfprdcanpen_to = AV42TFPrdCanPen_To ;
      AV112Stocksquimicos_listadodeproductos_wcds_14_tfprdpreact = AV43TFPrdPreAct ;
      AV113Stocksquimicos_listadodeproductos_wcds_15_tfprdpreact_to = AV44TFPrdPreAct_To ;
      AV114Stocksquimicos_listadodeproductos_wcds_16_tftipprddsc = AV45TFTipPrdDsc ;
      AV115Stocksquimicos_listadodeproductos_wcds_17_tftipprddsc_sel = AV46TFTipPrdDsc_Sel ;
      AV116Stocksquimicos_listadodeproductos_wcds_18_tfvaldsc = AV47TFValDsc ;
      AV117Stocksquimicos_listadodeproductos_wcds_19_tfvaldsc_sel = AV48TFValDsc_Sel ;
      AV118Stocksquimicos_listadodeproductos_wcds_20_tfprdrec = AV49TFPrdRec ;
      AV119Stocksquimicos_listadodeproductos_wcds_21_tfprdrec_sel = AV50TFPrdRec_Sel ;
      AV120Stocksquimicos_listadodeproductos_wcds_22_tfprdaox = AV51TFPrdAox ;
      AV121Stocksquimicos_listadodeproductos_wcds_23_tfprdaox_to = AV52TFPrdAox_To ;
      AV122Stocksquimicos_listadodeproductos_wcds_24_tfprdgots = AV53TFPrdGots ;
      AV123Stocksquimicos_listadodeproductos_wcds_25_tfprdgots_sel = AV54TFPrdGots_Sel ;
      AV124Stocksquimicos_listadodeproductos_wcds_26_tfprdreach = AV55TFPrdReach ;
      AV125Stocksquimicos_listadodeproductos_wcds_27_tfprdreach_sel = AV56TFPrdReach_Sel ;
      AV126Stocksquimicos_listadodeproductos_wcds_28_tfprdokotex_sels = AV58TFPrdOkotex_Sels ;
      AV127Stocksquimicos_listadodeproductos_wcds_29_tfprdhm = AV59TFPrdHm ;
      AV128Stocksquimicos_listadodeproductos_wcds_30_tfprdhm_sel = AV60TFPrdHm_Sel ;
      AV129Stocksquimicos_listadodeproductos_wcds_31_tfprdzdhc_sels = AV62TFPrdZDHC_Sels ;
      AV130Stocksquimicos_listadodeproductos_wcds_32_tfprdlist_sels = AV64TFPrdList_Sels ;
      AV131Stocksquimicos_listadodeproductos_wcds_33_tfprdthelist = AV65TFPrdTHELIST ;
      AV132Stocksquimicos_listadodeproductos_wcds_34_tfprdthelist_sel = AV66TFPrdTHELIST_Sel ;
      AV133Stocksquimicos_listadodeproductos_wcds_35_tfprdgrs_sels = AV68TFPrdGRS_Sels ;
      AV134Stocksquimicos_listadodeproductos_wcds_36_tfprdhs = AV69TFPrdHS ;
      AV135Stocksquimicos_listadodeproductos_wcds_37_tfprdhs_sel = AV70TFPrdHS_Sel ;
      AV136Stocksquimicos_listadodeproductos_wcds_38_tfprdfhs = AV71TFPrdFHS ;
      AV137Stocksquimicos_listadodeproductos_wcds_39_tfprdnum2 = AV75TFPrdNum2 ;
      AV138Stocksquimicos_listadodeproductos_wcds_40_tfprdnum2_sel = AV76TFPrdNum2_Sel ;
      AV139Stocksquimicos_listadodeproductos_wcds_41_tfprdnom2 = AV77TFPrdNom2 ;
      AV140Stocksquimicos_listadodeproductos_wcds_42_tfprdnom2_sel = AV78TFPrdNom2_Sel ;
      AV141Stocksquimicos_listadodeproductos_wcds_43_tfprdrefprv = AV79TFPrdRefPrv ;
      AV142Stocksquimicos_listadodeproductos_wcds_44_tfprdrefprv_sel = AV80TFPrdRefPrv_Sel ;
      AV143Stocksquimicos_listadodeproductos_wcds_45_tfprdfuncion = AV81TFPrdFuncion ;
      AV144Stocksquimicos_listadodeproductos_wcds_46_tfprdfuncion_sel = AV82TFPrdFuncion_Sel ;
      AV145Stocksquimicos_listadodeproductos_wcds_47_tfprdeinecs = AV83TFPrdEINECS ;
      AV146Stocksquimicos_listadodeproductos_wcds_48_tfprdeinecs_sel = AV84TFPrdEINECS_Sel ;
      AV147Stocksquimicos_listadodeproductos_wcds_49_tfprdncas = AV85TFPrdNCAS ;
      AV148Stocksquimicos_listadodeproductos_wcds_50_tfprdncas_sel = AV86TFPrdNCAS_Sel ;
      AV149Stocksquimicos_listadodeproductos_wcds_51_tfprvnum = AV87TFPrvNum ;
      AV150Stocksquimicos_listadodeproductos_wcds_52_tfprvnum_to = AV88TFPrvNum_To ;
      AV151Stocksquimicos_listadodeproductos_wcds_53_tfprvnom = AV89TFPrvNom ;
      AV152Stocksquimicos_listadodeproductos_wcds_54_tfprvnom_sel = AV90TFPrvNom_Sel ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV34emprcod, AV35PrdNumfrom, AV36PrdnumTo, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFPrdNum, AV27TFPrdNum_Sel, AV28TFPrdNom, AV29TFPrdNom_Sel, AV37TFPrdExiAlm, AV38TFPrdExiAlm_To, AV39TFPrdCanRes, AV40TFPrdCanRes_To, AV91TFPrdDisponible, AV92TFPrdDisponible_To, AV41TFPrdCanPen, AV42TFPrdCanPen_To, AV43TFPrdPreAct, AV44TFPrdPreAct_To, AV45TFTipPrdDsc, AV46TFTipPrdDsc_Sel, AV47TFValDsc, AV48TFValDsc_Sel, AV49TFPrdRec, AV50TFPrdRec_Sel, AV51TFPrdAox, AV52TFPrdAox_To, AV53TFPrdGots, AV54TFPrdGots_Sel, AV55TFPrdReach, AV56TFPrdReach_Sel, AV58TFPrdOkotex_Sels, AV59TFPrdHm, AV60TFPrdHm_Sel, AV62TFPrdZDHC_Sels, AV64TFPrdList_Sels, AV65TFPrdTHELIST, AV66TFPrdTHELIST_Sel, AV68TFPrdGRS_Sels, AV69TFPrdHS, AV70TFPrdHS_Sel, AV71TFPrdFHS, AV75TFPrdNum2, AV76TFPrdNum2_Sel, AV77TFPrdNom2, AV78TFPrdNom2_Sel, AV79TFPrdRefPrv, AV80TFPrdRefPrv_Sel, AV81TFPrdFuncion, AV82TFPrdFuncion_Sel, AV83TFPrdEINECS, AV84TFPrdEINECS_Sel, AV85TFPrdNCAS, AV86TFPrdNCAS_Sel, AV87TFPrvNum, AV88TFPrvNum_To, AV89TFPrvNom, AV90TFPrvNom_Sel, AV95Pgmname, AV12OrderedBy, AV13OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext = AV15FilterFullText ;
      AV100Stocksquimicos_listadodeproductos_wcds_2_tfprdnum = AV26TFPrdNum ;
      AV101Stocksquimicos_listadodeproductos_wcds_3_tfprdnum_sel = AV27TFPrdNum_Sel ;
      AV102Stocksquimicos_listadodeproductos_wcds_4_tfprdnom = AV28TFPrdNom ;
      AV103Stocksquimicos_listadodeproductos_wcds_5_tfprdnom_sel = AV29TFPrdNom_Sel ;
      AV104Stocksquimicos_listadodeproductos_wcds_6_tfprdexialm = AV37TFPrdExiAlm ;
      AV105Stocksquimicos_listadodeproductos_wcds_7_tfprdexialm_to = AV38TFPrdExiAlm_To ;
      AV106Stocksquimicos_listadodeproductos_wcds_8_tfprdcanres = AV39TFPrdCanRes ;
      AV107Stocksquimicos_listadodeproductos_wcds_9_tfprdcanres_to = AV40TFPrdCanRes_To ;
      AV108Stocksquimicos_listadodeproductos_wcds_10_tfprddisponible = AV91TFPrdDisponible ;
      AV109Stocksquimicos_listadodeproductos_wcds_11_tfprddisponible_to = AV92TFPrdDisponible_To ;
      AV110Stocksquimicos_listadodeproductos_wcds_12_tfprdcanpen = AV41TFPrdCanPen ;
      AV111Stocksquimicos_listadodeproductos_wcds_13_tfprdcanpen_to = AV42TFPrdCanPen_To ;
      AV112Stocksquimicos_listadodeproductos_wcds_14_tfprdpreact = AV43TFPrdPreAct ;
      AV113Stocksquimicos_listadodeproductos_wcds_15_tfprdpreact_to = AV44TFPrdPreAct_To ;
      AV114Stocksquimicos_listadodeproductos_wcds_16_tftipprddsc = AV45TFTipPrdDsc ;
      AV115Stocksquimicos_listadodeproductos_wcds_17_tftipprddsc_sel = AV46TFTipPrdDsc_Sel ;
      AV116Stocksquimicos_listadodeproductos_wcds_18_tfvaldsc = AV47TFValDsc ;
      AV117Stocksquimicos_listadodeproductos_wcds_19_tfvaldsc_sel = AV48TFValDsc_Sel ;
      AV118Stocksquimicos_listadodeproductos_wcds_20_tfprdrec = AV49TFPrdRec ;
      AV119Stocksquimicos_listadodeproductos_wcds_21_tfprdrec_sel = AV50TFPrdRec_Sel ;
      AV120Stocksquimicos_listadodeproductos_wcds_22_tfprdaox = AV51TFPrdAox ;
      AV121Stocksquimicos_listadodeproductos_wcds_23_tfprdaox_to = AV52TFPrdAox_To ;
      AV122Stocksquimicos_listadodeproductos_wcds_24_tfprdgots = AV53TFPrdGots ;
      AV123Stocksquimicos_listadodeproductos_wcds_25_tfprdgots_sel = AV54TFPrdGots_Sel ;
      AV124Stocksquimicos_listadodeproductos_wcds_26_tfprdreach = AV55TFPrdReach ;
      AV125Stocksquimicos_listadodeproductos_wcds_27_tfprdreach_sel = AV56TFPrdReach_Sel ;
      AV126Stocksquimicos_listadodeproductos_wcds_28_tfprdokotex_sels = AV58TFPrdOkotex_Sels ;
      AV127Stocksquimicos_listadodeproductos_wcds_29_tfprdhm = AV59TFPrdHm ;
      AV128Stocksquimicos_listadodeproductos_wcds_30_tfprdhm_sel = AV60TFPrdHm_Sel ;
      AV129Stocksquimicos_listadodeproductos_wcds_31_tfprdzdhc_sels = AV62TFPrdZDHC_Sels ;
      AV130Stocksquimicos_listadodeproductos_wcds_32_tfprdlist_sels = AV64TFPrdList_Sels ;
      AV131Stocksquimicos_listadodeproductos_wcds_33_tfprdthelist = AV65TFPrdTHELIST ;
      AV132Stocksquimicos_listadodeproductos_wcds_34_tfprdthelist_sel = AV66TFPrdTHELIST_Sel ;
      AV133Stocksquimicos_listadodeproductos_wcds_35_tfprdgrs_sels = AV68TFPrdGRS_Sels ;
      AV134Stocksquimicos_listadodeproductos_wcds_36_tfprdhs = AV69TFPrdHS ;
      AV135Stocksquimicos_listadodeproductos_wcds_37_tfprdhs_sel = AV70TFPrdHS_Sel ;
      AV136Stocksquimicos_listadodeproductos_wcds_38_tfprdfhs = AV71TFPrdFHS ;
      AV137Stocksquimicos_listadodeproductos_wcds_39_tfprdnum2 = AV75TFPrdNum2 ;
      AV138Stocksquimicos_listadodeproductos_wcds_40_tfprdnum2_sel = AV76TFPrdNum2_Sel ;
      AV139Stocksquimicos_listadodeproductos_wcds_41_tfprdnom2 = AV77TFPrdNom2 ;
      AV140Stocksquimicos_listadodeproductos_wcds_42_tfprdnom2_sel = AV78TFPrdNom2_Sel ;
      AV141Stocksquimicos_listadodeproductos_wcds_43_tfprdrefprv = AV79TFPrdRefPrv ;
      AV142Stocksquimicos_listadodeproductos_wcds_44_tfprdrefprv_sel = AV80TFPrdRefPrv_Sel ;
      AV143Stocksquimicos_listadodeproductos_wcds_45_tfprdfuncion = AV81TFPrdFuncion ;
      AV144Stocksquimicos_listadodeproductos_wcds_46_tfprdfuncion_sel = AV82TFPrdFuncion_Sel ;
      AV145Stocksquimicos_listadodeproductos_wcds_47_tfprdeinecs = AV83TFPrdEINECS ;
      AV146Stocksquimicos_listadodeproductos_wcds_48_tfprdeinecs_sel = AV84TFPrdEINECS_Sel ;
      AV147Stocksquimicos_listadodeproductos_wcds_49_tfprdncas = AV85TFPrdNCAS ;
      AV148Stocksquimicos_listadodeproductos_wcds_50_tfprdncas_sel = AV86TFPrdNCAS_Sel ;
      AV149Stocksquimicos_listadodeproductos_wcds_51_tfprvnum = AV87TFPrvNum ;
      AV150Stocksquimicos_listadodeproductos_wcds_52_tfprvnum_to = AV88TFPrvNum_To ;
      AV151Stocksquimicos_listadodeproductos_wcds_53_tfprvnom = AV89TFPrvNom ;
      AV152Stocksquimicos_listadodeproductos_wcds_54_tfprvnom_sel = AV90TFPrvNom_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV34emprcod, AV35PrdNumfrom, AV36PrdnumTo, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFPrdNum, AV27TFPrdNum_Sel, AV28TFPrdNom, AV29TFPrdNom_Sel, AV37TFPrdExiAlm, AV38TFPrdExiAlm_To, AV39TFPrdCanRes, AV40TFPrdCanRes_To, AV91TFPrdDisponible, AV92TFPrdDisponible_To, AV41TFPrdCanPen, AV42TFPrdCanPen_To, AV43TFPrdPreAct, AV44TFPrdPreAct_To, AV45TFTipPrdDsc, AV46TFTipPrdDsc_Sel, AV47TFValDsc, AV48TFValDsc_Sel, AV49TFPrdRec, AV50TFPrdRec_Sel, AV51TFPrdAox, AV52TFPrdAox_To, AV53TFPrdGots, AV54TFPrdGots_Sel, AV55TFPrdReach, AV56TFPrdReach_Sel, AV58TFPrdOkotex_Sels, AV59TFPrdHm, AV60TFPrdHm_Sel, AV62TFPrdZDHC_Sels, AV64TFPrdList_Sels, AV65TFPrdTHELIST, AV66TFPrdTHELIST_Sel, AV68TFPrdGRS_Sels, AV69TFPrdHS, AV70TFPrdHS_Sel, AV71TFPrdFHS, AV75TFPrdNum2, AV76TFPrdNum2_Sel, AV77TFPrdNom2, AV78TFPrdNom2_Sel, AV79TFPrdRefPrv, AV80TFPrdRefPrv_Sel, AV81TFPrdFuncion, AV82TFPrdFuncion_Sel, AV83TFPrdEINECS, AV84TFPrdEINECS_Sel, AV85TFPrdNCAS, AV86TFPrdNCAS_Sel, AV87TFPrvNum, AV88TFPrvNum_To, AV89TFPrvNom, AV90TFPrvNom_Sel, AV95Pgmname, AV12OrderedBy, AV13OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext = AV15FilterFullText ;
      AV100Stocksquimicos_listadodeproductos_wcds_2_tfprdnum = AV26TFPrdNum ;
      AV101Stocksquimicos_listadodeproductos_wcds_3_tfprdnum_sel = AV27TFPrdNum_Sel ;
      AV102Stocksquimicos_listadodeproductos_wcds_4_tfprdnom = AV28TFPrdNom ;
      AV103Stocksquimicos_listadodeproductos_wcds_5_tfprdnom_sel = AV29TFPrdNom_Sel ;
      AV104Stocksquimicos_listadodeproductos_wcds_6_tfprdexialm = AV37TFPrdExiAlm ;
      AV105Stocksquimicos_listadodeproductos_wcds_7_tfprdexialm_to = AV38TFPrdExiAlm_To ;
      AV106Stocksquimicos_listadodeproductos_wcds_8_tfprdcanres = AV39TFPrdCanRes ;
      AV107Stocksquimicos_listadodeproductos_wcds_9_tfprdcanres_to = AV40TFPrdCanRes_To ;
      AV108Stocksquimicos_listadodeproductos_wcds_10_tfprddisponible = AV91TFPrdDisponible ;
      AV109Stocksquimicos_listadodeproductos_wcds_11_tfprddisponible_to = AV92TFPrdDisponible_To ;
      AV110Stocksquimicos_listadodeproductos_wcds_12_tfprdcanpen = AV41TFPrdCanPen ;
      AV111Stocksquimicos_listadodeproductos_wcds_13_tfprdcanpen_to = AV42TFPrdCanPen_To ;
      AV112Stocksquimicos_listadodeproductos_wcds_14_tfprdpreact = AV43TFPrdPreAct ;
      AV113Stocksquimicos_listadodeproductos_wcds_15_tfprdpreact_to = AV44TFPrdPreAct_To ;
      AV114Stocksquimicos_listadodeproductos_wcds_16_tftipprddsc = AV45TFTipPrdDsc ;
      AV115Stocksquimicos_listadodeproductos_wcds_17_tftipprddsc_sel = AV46TFTipPrdDsc_Sel ;
      AV116Stocksquimicos_listadodeproductos_wcds_18_tfvaldsc = AV47TFValDsc ;
      AV117Stocksquimicos_listadodeproductos_wcds_19_tfvaldsc_sel = AV48TFValDsc_Sel ;
      AV118Stocksquimicos_listadodeproductos_wcds_20_tfprdrec = AV49TFPrdRec ;
      AV119Stocksquimicos_listadodeproductos_wcds_21_tfprdrec_sel = AV50TFPrdRec_Sel ;
      AV120Stocksquimicos_listadodeproductos_wcds_22_tfprdaox = AV51TFPrdAox ;
      AV121Stocksquimicos_listadodeproductos_wcds_23_tfprdaox_to = AV52TFPrdAox_To ;
      AV122Stocksquimicos_listadodeproductos_wcds_24_tfprdgots = AV53TFPrdGots ;
      AV123Stocksquimicos_listadodeproductos_wcds_25_tfprdgots_sel = AV54TFPrdGots_Sel ;
      AV124Stocksquimicos_listadodeproductos_wcds_26_tfprdreach = AV55TFPrdReach ;
      AV125Stocksquimicos_listadodeproductos_wcds_27_tfprdreach_sel = AV56TFPrdReach_Sel ;
      AV126Stocksquimicos_listadodeproductos_wcds_28_tfprdokotex_sels = AV58TFPrdOkotex_Sels ;
      AV127Stocksquimicos_listadodeproductos_wcds_29_tfprdhm = AV59TFPrdHm ;
      AV128Stocksquimicos_listadodeproductos_wcds_30_tfprdhm_sel = AV60TFPrdHm_Sel ;
      AV129Stocksquimicos_listadodeproductos_wcds_31_tfprdzdhc_sels = AV62TFPrdZDHC_Sels ;
      AV130Stocksquimicos_listadodeproductos_wcds_32_tfprdlist_sels = AV64TFPrdList_Sels ;
      AV131Stocksquimicos_listadodeproductos_wcds_33_tfprdthelist = AV65TFPrdTHELIST ;
      AV132Stocksquimicos_listadodeproductos_wcds_34_tfprdthelist_sel = AV66TFPrdTHELIST_Sel ;
      AV133Stocksquimicos_listadodeproductos_wcds_35_tfprdgrs_sels = AV68TFPrdGRS_Sels ;
      AV134Stocksquimicos_listadodeproductos_wcds_36_tfprdhs = AV69TFPrdHS ;
      AV135Stocksquimicos_listadodeproductos_wcds_37_tfprdhs_sel = AV70TFPrdHS_Sel ;
      AV136Stocksquimicos_listadodeproductos_wcds_38_tfprdfhs = AV71TFPrdFHS ;
      AV137Stocksquimicos_listadodeproductos_wcds_39_tfprdnum2 = AV75TFPrdNum2 ;
      AV138Stocksquimicos_listadodeproductos_wcds_40_tfprdnum2_sel = AV76TFPrdNum2_Sel ;
      AV139Stocksquimicos_listadodeproductos_wcds_41_tfprdnom2 = AV77TFPrdNom2 ;
      AV140Stocksquimicos_listadodeproductos_wcds_42_tfprdnom2_sel = AV78TFPrdNom2_Sel ;
      AV141Stocksquimicos_listadodeproductos_wcds_43_tfprdrefprv = AV79TFPrdRefPrv ;
      AV142Stocksquimicos_listadodeproductos_wcds_44_tfprdrefprv_sel = AV80TFPrdRefPrv_Sel ;
      AV143Stocksquimicos_listadodeproductos_wcds_45_tfprdfuncion = AV81TFPrdFuncion ;
      AV144Stocksquimicos_listadodeproductos_wcds_46_tfprdfuncion_sel = AV82TFPrdFuncion_Sel ;
      AV145Stocksquimicos_listadodeproductos_wcds_47_tfprdeinecs = AV83TFPrdEINECS ;
      AV146Stocksquimicos_listadodeproductos_wcds_48_tfprdeinecs_sel = AV84TFPrdEINECS_Sel ;
      AV147Stocksquimicos_listadodeproductos_wcds_49_tfprdncas = AV85TFPrdNCAS ;
      AV148Stocksquimicos_listadodeproductos_wcds_50_tfprdncas_sel = AV86TFPrdNCAS_Sel ;
      AV149Stocksquimicos_listadodeproductos_wcds_51_tfprvnum = AV87TFPrvNum ;
      AV150Stocksquimicos_listadodeproductos_wcds_52_tfprvnum_to = AV88TFPrvNum_To ;
      AV151Stocksquimicos_listadodeproductos_wcds_53_tfprvnom = AV89TFPrvNom ;
      AV152Stocksquimicos_listadodeproductos_wcds_54_tfprvnom_sel = AV90TFPrvNom_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV34emprcod, AV35PrdNumfrom, AV36PrdnumTo, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFPrdNum, AV27TFPrdNum_Sel, AV28TFPrdNom, AV29TFPrdNom_Sel, AV37TFPrdExiAlm, AV38TFPrdExiAlm_To, AV39TFPrdCanRes, AV40TFPrdCanRes_To, AV91TFPrdDisponible, AV92TFPrdDisponible_To, AV41TFPrdCanPen, AV42TFPrdCanPen_To, AV43TFPrdPreAct, AV44TFPrdPreAct_To, AV45TFTipPrdDsc, AV46TFTipPrdDsc_Sel, AV47TFValDsc, AV48TFValDsc_Sel, AV49TFPrdRec, AV50TFPrdRec_Sel, AV51TFPrdAox, AV52TFPrdAox_To, AV53TFPrdGots, AV54TFPrdGots_Sel, AV55TFPrdReach, AV56TFPrdReach_Sel, AV58TFPrdOkotex_Sels, AV59TFPrdHm, AV60TFPrdHm_Sel, AV62TFPrdZDHC_Sels, AV64TFPrdList_Sels, AV65TFPrdTHELIST, AV66TFPrdTHELIST_Sel, AV68TFPrdGRS_Sels, AV69TFPrdHS, AV70TFPrdHS_Sel, AV71TFPrdFHS, AV75TFPrdNum2, AV76TFPrdNum2_Sel, AV77TFPrdNom2, AV78TFPrdNom2_Sel, AV79TFPrdRefPrv, AV80TFPrdRefPrv_Sel, AV81TFPrdFuncion, AV82TFPrdFuncion_Sel, AV83TFPrdEINECS, AV84TFPrdEINECS_Sel, AV85TFPrdNCAS, AV86TFPrdNCAS_Sel, AV87TFPrvNum, AV88TFPrvNum_To, AV89TFPrvNom, AV90TFPrvNom_Sel, AV95Pgmname, AV12OrderedBy, AV13OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext = AV15FilterFullText ;
      AV100Stocksquimicos_listadodeproductos_wcds_2_tfprdnum = AV26TFPrdNum ;
      AV101Stocksquimicos_listadodeproductos_wcds_3_tfprdnum_sel = AV27TFPrdNum_Sel ;
      AV102Stocksquimicos_listadodeproductos_wcds_4_tfprdnom = AV28TFPrdNom ;
      AV103Stocksquimicos_listadodeproductos_wcds_5_tfprdnom_sel = AV29TFPrdNom_Sel ;
      AV104Stocksquimicos_listadodeproductos_wcds_6_tfprdexialm = AV37TFPrdExiAlm ;
      AV105Stocksquimicos_listadodeproductos_wcds_7_tfprdexialm_to = AV38TFPrdExiAlm_To ;
      AV106Stocksquimicos_listadodeproductos_wcds_8_tfprdcanres = AV39TFPrdCanRes ;
      AV107Stocksquimicos_listadodeproductos_wcds_9_tfprdcanres_to = AV40TFPrdCanRes_To ;
      AV108Stocksquimicos_listadodeproductos_wcds_10_tfprddisponible = AV91TFPrdDisponible ;
      AV109Stocksquimicos_listadodeproductos_wcds_11_tfprddisponible_to = AV92TFPrdDisponible_To ;
      AV110Stocksquimicos_listadodeproductos_wcds_12_tfprdcanpen = AV41TFPrdCanPen ;
      AV111Stocksquimicos_listadodeproductos_wcds_13_tfprdcanpen_to = AV42TFPrdCanPen_To ;
      AV112Stocksquimicos_listadodeproductos_wcds_14_tfprdpreact = AV43TFPrdPreAct ;
      AV113Stocksquimicos_listadodeproductos_wcds_15_tfprdpreact_to = AV44TFPrdPreAct_To ;
      AV114Stocksquimicos_listadodeproductos_wcds_16_tftipprddsc = AV45TFTipPrdDsc ;
      AV115Stocksquimicos_listadodeproductos_wcds_17_tftipprddsc_sel = AV46TFTipPrdDsc_Sel ;
      AV116Stocksquimicos_listadodeproductos_wcds_18_tfvaldsc = AV47TFValDsc ;
      AV117Stocksquimicos_listadodeproductos_wcds_19_tfvaldsc_sel = AV48TFValDsc_Sel ;
      AV118Stocksquimicos_listadodeproductos_wcds_20_tfprdrec = AV49TFPrdRec ;
      AV119Stocksquimicos_listadodeproductos_wcds_21_tfprdrec_sel = AV50TFPrdRec_Sel ;
      AV120Stocksquimicos_listadodeproductos_wcds_22_tfprdaox = AV51TFPrdAox ;
      AV121Stocksquimicos_listadodeproductos_wcds_23_tfprdaox_to = AV52TFPrdAox_To ;
      AV122Stocksquimicos_listadodeproductos_wcds_24_tfprdgots = AV53TFPrdGots ;
      AV123Stocksquimicos_listadodeproductos_wcds_25_tfprdgots_sel = AV54TFPrdGots_Sel ;
      AV124Stocksquimicos_listadodeproductos_wcds_26_tfprdreach = AV55TFPrdReach ;
      AV125Stocksquimicos_listadodeproductos_wcds_27_tfprdreach_sel = AV56TFPrdReach_Sel ;
      AV126Stocksquimicos_listadodeproductos_wcds_28_tfprdokotex_sels = AV58TFPrdOkotex_Sels ;
      AV127Stocksquimicos_listadodeproductos_wcds_29_tfprdhm = AV59TFPrdHm ;
      AV128Stocksquimicos_listadodeproductos_wcds_30_tfprdhm_sel = AV60TFPrdHm_Sel ;
      AV129Stocksquimicos_listadodeproductos_wcds_31_tfprdzdhc_sels = AV62TFPrdZDHC_Sels ;
      AV130Stocksquimicos_listadodeproductos_wcds_32_tfprdlist_sels = AV64TFPrdList_Sels ;
      AV131Stocksquimicos_listadodeproductos_wcds_33_tfprdthelist = AV65TFPrdTHELIST ;
      AV132Stocksquimicos_listadodeproductos_wcds_34_tfprdthelist_sel = AV66TFPrdTHELIST_Sel ;
      AV133Stocksquimicos_listadodeproductos_wcds_35_tfprdgrs_sels = AV68TFPrdGRS_Sels ;
      AV134Stocksquimicos_listadodeproductos_wcds_36_tfprdhs = AV69TFPrdHS ;
      AV135Stocksquimicos_listadodeproductos_wcds_37_tfprdhs_sel = AV70TFPrdHS_Sel ;
      AV136Stocksquimicos_listadodeproductos_wcds_38_tfprdfhs = AV71TFPrdFHS ;
      AV137Stocksquimicos_listadodeproductos_wcds_39_tfprdnum2 = AV75TFPrdNum2 ;
      AV138Stocksquimicos_listadodeproductos_wcds_40_tfprdnum2_sel = AV76TFPrdNum2_Sel ;
      AV139Stocksquimicos_listadodeproductos_wcds_41_tfprdnom2 = AV77TFPrdNom2 ;
      AV140Stocksquimicos_listadodeproductos_wcds_42_tfprdnom2_sel = AV78TFPrdNom2_Sel ;
      AV141Stocksquimicos_listadodeproductos_wcds_43_tfprdrefprv = AV79TFPrdRefPrv ;
      AV142Stocksquimicos_listadodeproductos_wcds_44_tfprdrefprv_sel = AV80TFPrdRefPrv_Sel ;
      AV143Stocksquimicos_listadodeproductos_wcds_45_tfprdfuncion = AV81TFPrdFuncion ;
      AV144Stocksquimicos_listadodeproductos_wcds_46_tfprdfuncion_sel = AV82TFPrdFuncion_Sel ;
      AV145Stocksquimicos_listadodeproductos_wcds_47_tfprdeinecs = AV83TFPrdEINECS ;
      AV146Stocksquimicos_listadodeproductos_wcds_48_tfprdeinecs_sel = AV84TFPrdEINECS_Sel ;
      AV147Stocksquimicos_listadodeproductos_wcds_49_tfprdncas = AV85TFPrdNCAS ;
      AV148Stocksquimicos_listadodeproductos_wcds_50_tfprdncas_sel = AV86TFPrdNCAS_Sel ;
      AV149Stocksquimicos_listadodeproductos_wcds_51_tfprvnum = AV87TFPrvNum ;
      AV150Stocksquimicos_listadodeproductos_wcds_52_tfprvnum_to = AV88TFPrvNum_To ;
      AV151Stocksquimicos_listadodeproductos_wcds_53_tfprvnom = AV89TFPrvNom ;
      AV152Stocksquimicos_listadodeproductos_wcds_54_tfprvnom_sel = AV90TFPrvNom_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV34emprcod, AV35PrdNumfrom, AV36PrdnumTo, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFPrdNum, AV27TFPrdNum_Sel, AV28TFPrdNom, AV29TFPrdNom_Sel, AV37TFPrdExiAlm, AV38TFPrdExiAlm_To, AV39TFPrdCanRes, AV40TFPrdCanRes_To, AV91TFPrdDisponible, AV92TFPrdDisponible_To, AV41TFPrdCanPen, AV42TFPrdCanPen_To, AV43TFPrdPreAct, AV44TFPrdPreAct_To, AV45TFTipPrdDsc, AV46TFTipPrdDsc_Sel, AV47TFValDsc, AV48TFValDsc_Sel, AV49TFPrdRec, AV50TFPrdRec_Sel, AV51TFPrdAox, AV52TFPrdAox_To, AV53TFPrdGots, AV54TFPrdGots_Sel, AV55TFPrdReach, AV56TFPrdReach_Sel, AV58TFPrdOkotex_Sels, AV59TFPrdHm, AV60TFPrdHm_Sel, AV62TFPrdZDHC_Sels, AV64TFPrdList_Sels, AV65TFPrdTHELIST, AV66TFPrdTHELIST_Sel, AV68TFPrdGRS_Sels, AV69TFPrdHS, AV70TFPrdHS_Sel, AV71TFPrdFHS, AV75TFPrdNum2, AV76TFPrdNum2_Sel, AV77TFPrdNom2, AV78TFPrdNom2_Sel, AV79TFPrdRefPrv, AV80TFPrdRefPrv_Sel, AV81TFPrdFuncion, AV82TFPrdFuncion_Sel, AV83TFPrdEINECS, AV84TFPrdEINECS_Sel, AV85TFPrdNCAS, AV86TFPrdNCAS_Sel, AV87TFPrvNum, AV88TFPrvNum_To, AV89TFPrvNom, AV90TFPrvNom_Sel, AV95Pgmname, AV12OrderedBy, AV13OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV95Pgmname = "StocksQuimicos.ListadodeProductos_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95Pgmname", AV95Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1KX0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e191KX2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV23ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV30DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV20ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_43 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_43"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV32GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV33GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV34emprcod = httpContext.cgiGet( sPrefix+"wcpOAV34emprcod") ;
         wcpOAV35PrdNumfrom = httpContext.cgiGet( sPrefix+"wcpOAV35PrdNumfrom") ;
         wcpOAV36PrdnumTo = httpContext.cgiGet( sPrefix+"wcpOAV36PrdnumTo") ;
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
         Ddo_grid_Allowmultipleselection = httpContext.cgiGet( sPrefix+"DDO_GRID_Allowmultipleselection") ;
         Ddo_grid_Datalistfixedvalues = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalistfixedvalues") ;
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
         AV15FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
         AV95Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95Pgmname", AV95Pgmname);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_prdfhsauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_PRDFHSAUXDATE");
            GX_FocusControl = edtavDdo_prdfhsauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV73DDO_PrdFHSAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73DDO_PrdFHSAuxDate", localUtil.format(AV73DDO_PrdFHSAuxDate, "99/99/99"));
         }
         else
         {
            AV73DDO_PrdFHSAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_prdfhsauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73DDO_PrdFHSAuxDate", localUtil.format(AV73DDO_PrdFHSAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ListadodeProductos_WC");
         AV95Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95Pgmname", AV95Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV95Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("stocksquimicos\\listadodeproductos_wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e191KX2 ();
      if (returnInSub) return;
   }

   public void e191KX2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV96Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      listadodeproductos_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV96Station = GXt_char1 ;
      GXv_char2[0] = AV34emprcod ;
      GXv_char3[0] = AV97Emprnom ;
      GXv_char4[0] = AV98Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV96Station, GXv_char2, GXv_char3, GXv_char4) ;
      listadodeproductos_wc_impl.this.AV34emprcod = GXv_char2[0] ;
      listadodeproductos_wc_impl.this.AV97Emprnom = GXv_char3[0] ;
      listadodeproductos_wc_impl.this.AV98Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34emprcod", AV34emprcod);
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV30DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV30DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e201KX2( )
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
      if ( GXutil.strcmp(AV22Session.getValue("StocksQuimicos.ListadodeProductos_WCColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV22Session.getValue("StocksQuimicos.ListadodeProductos_WCColumnsSelector") ;
         AV20ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtPrdNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrdNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrdExiAlm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdExiAlm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiAlm_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrdCanRes_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdCanRes_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCanRes_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrdDisponi_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdDisponi_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdDisponi_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrdCanPen_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdCanPen_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCanPen_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrdPreAct_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdPreAct_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPreAct_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtTipPrdDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtTipPrdDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipPrdDsc_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtValDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtValDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtValDsc_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrdRec_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdRec_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdRec_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrdAox_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdAox_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdAox_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrdGots_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdGots_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdGots_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrdReach_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdReach_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdReach_Visible), 5, 0), !bGXsfl_43_Refreshing);
      cmbPrdOkotex.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbPrdOkotex.getInternalname(), "Visible", GXutil.ltrimstr( cmbPrdOkotex.getVisible(), 5, 0), !bGXsfl_43_Refreshing);
      edtPrdHm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdHm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdHm_Visible), 5, 0), !bGXsfl_43_Refreshing);
      cmbPrdZDHC.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbPrdZDHC.getInternalname(), "Visible", GXutil.ltrimstr( cmbPrdZDHC.getVisible(), 5, 0), !bGXsfl_43_Refreshing);
      cmbPrdList.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbPrdList.getInternalname(), "Visible", GXutil.ltrimstr( cmbPrdList.getVisible(), 5, 0), !bGXsfl_43_Refreshing);
      edtPrdTHELIST_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdTHELIST_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdTHELIST_Visible), 5, 0), !bGXsfl_43_Refreshing);
      cmbPrdGRS.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbPrdGRS.getInternalname(), "Visible", GXutil.ltrimstr( cmbPrdGRS.getVisible(), 5, 0), !bGXsfl_43_Refreshing);
      edtPrdHS_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdHS_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdHS_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrdFHS_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdFHS_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdFHS_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrdNum2_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdNum2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum2_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrdNom2_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdNom2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom2_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrdRefPrv_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdRefPrv_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdRefPrv_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrdFuncion_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdFuncion_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdFuncion_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrdEINECS_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdEINECS_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdEINECS_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrdNCAS_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+27)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdNCAS_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNCAS_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrvNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+28)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrvNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNum_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrvNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+29)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrvNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNom_Visible), 5, 0), !bGXsfl_43_Refreshing);
      AV32GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32GridCurrentPage), 10, 0));
      AV33GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33GridPageCount), 10, 0));
      AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext = AV15FilterFullText ;
      AV100Stocksquimicos_listadodeproductos_wcds_2_tfprdnum = AV26TFPrdNum ;
      AV101Stocksquimicos_listadodeproductos_wcds_3_tfprdnum_sel = AV27TFPrdNum_Sel ;
      AV102Stocksquimicos_listadodeproductos_wcds_4_tfprdnom = AV28TFPrdNom ;
      AV103Stocksquimicos_listadodeproductos_wcds_5_tfprdnom_sel = AV29TFPrdNom_Sel ;
      AV104Stocksquimicos_listadodeproductos_wcds_6_tfprdexialm = AV37TFPrdExiAlm ;
      AV105Stocksquimicos_listadodeproductos_wcds_7_tfprdexialm_to = AV38TFPrdExiAlm_To ;
      AV106Stocksquimicos_listadodeproductos_wcds_8_tfprdcanres = AV39TFPrdCanRes ;
      AV107Stocksquimicos_listadodeproductos_wcds_9_tfprdcanres_to = AV40TFPrdCanRes_To ;
      AV108Stocksquimicos_listadodeproductos_wcds_10_tfprddisponible = AV91TFPrdDisponible ;
      AV109Stocksquimicos_listadodeproductos_wcds_11_tfprddisponible_to = AV92TFPrdDisponible_To ;
      AV110Stocksquimicos_listadodeproductos_wcds_12_tfprdcanpen = AV41TFPrdCanPen ;
      AV111Stocksquimicos_listadodeproductos_wcds_13_tfprdcanpen_to = AV42TFPrdCanPen_To ;
      AV112Stocksquimicos_listadodeproductos_wcds_14_tfprdpreact = AV43TFPrdPreAct ;
      AV113Stocksquimicos_listadodeproductos_wcds_15_tfprdpreact_to = AV44TFPrdPreAct_To ;
      AV114Stocksquimicos_listadodeproductos_wcds_16_tftipprddsc = AV45TFTipPrdDsc ;
      AV115Stocksquimicos_listadodeproductos_wcds_17_tftipprddsc_sel = AV46TFTipPrdDsc_Sel ;
      AV116Stocksquimicos_listadodeproductos_wcds_18_tfvaldsc = AV47TFValDsc ;
      AV117Stocksquimicos_listadodeproductos_wcds_19_tfvaldsc_sel = AV48TFValDsc_Sel ;
      AV118Stocksquimicos_listadodeproductos_wcds_20_tfprdrec = AV49TFPrdRec ;
      AV119Stocksquimicos_listadodeproductos_wcds_21_tfprdrec_sel = AV50TFPrdRec_Sel ;
      AV120Stocksquimicos_listadodeproductos_wcds_22_tfprdaox = AV51TFPrdAox ;
      AV121Stocksquimicos_listadodeproductos_wcds_23_tfprdaox_to = AV52TFPrdAox_To ;
      AV122Stocksquimicos_listadodeproductos_wcds_24_tfprdgots = AV53TFPrdGots ;
      AV123Stocksquimicos_listadodeproductos_wcds_25_tfprdgots_sel = AV54TFPrdGots_Sel ;
      AV124Stocksquimicos_listadodeproductos_wcds_26_tfprdreach = AV55TFPrdReach ;
      AV125Stocksquimicos_listadodeproductos_wcds_27_tfprdreach_sel = AV56TFPrdReach_Sel ;
      AV126Stocksquimicos_listadodeproductos_wcds_28_tfprdokotex_sels = AV58TFPrdOkotex_Sels ;
      AV127Stocksquimicos_listadodeproductos_wcds_29_tfprdhm = AV59TFPrdHm ;
      AV128Stocksquimicos_listadodeproductos_wcds_30_tfprdhm_sel = AV60TFPrdHm_Sel ;
      AV129Stocksquimicos_listadodeproductos_wcds_31_tfprdzdhc_sels = AV62TFPrdZDHC_Sels ;
      AV130Stocksquimicos_listadodeproductos_wcds_32_tfprdlist_sels = AV64TFPrdList_Sels ;
      AV131Stocksquimicos_listadodeproductos_wcds_33_tfprdthelist = AV65TFPrdTHELIST ;
      AV132Stocksquimicos_listadodeproductos_wcds_34_tfprdthelist_sel = AV66TFPrdTHELIST_Sel ;
      AV133Stocksquimicos_listadodeproductos_wcds_35_tfprdgrs_sels = AV68TFPrdGRS_Sels ;
      AV134Stocksquimicos_listadodeproductos_wcds_36_tfprdhs = AV69TFPrdHS ;
      AV135Stocksquimicos_listadodeproductos_wcds_37_tfprdhs_sel = AV70TFPrdHS_Sel ;
      AV136Stocksquimicos_listadodeproductos_wcds_38_tfprdfhs = AV71TFPrdFHS ;
      AV137Stocksquimicos_listadodeproductos_wcds_39_tfprdnum2 = AV75TFPrdNum2 ;
      AV138Stocksquimicos_listadodeproductos_wcds_40_tfprdnum2_sel = AV76TFPrdNum2_Sel ;
      AV139Stocksquimicos_listadodeproductos_wcds_41_tfprdnom2 = AV77TFPrdNom2 ;
      AV140Stocksquimicos_listadodeproductos_wcds_42_tfprdnom2_sel = AV78TFPrdNom2_Sel ;
      AV141Stocksquimicos_listadodeproductos_wcds_43_tfprdrefprv = AV79TFPrdRefPrv ;
      AV142Stocksquimicos_listadodeproductos_wcds_44_tfprdrefprv_sel = AV80TFPrdRefPrv_Sel ;
      AV143Stocksquimicos_listadodeproductos_wcds_45_tfprdfuncion = AV81TFPrdFuncion ;
      AV144Stocksquimicos_listadodeproductos_wcds_46_tfprdfuncion_sel = AV82TFPrdFuncion_Sel ;
      AV145Stocksquimicos_listadodeproductos_wcds_47_tfprdeinecs = AV83TFPrdEINECS ;
      AV146Stocksquimicos_listadodeproductos_wcds_48_tfprdeinecs_sel = AV84TFPrdEINECS_Sel ;
      AV147Stocksquimicos_listadodeproductos_wcds_49_tfprdncas = AV85TFPrdNCAS ;
      AV148Stocksquimicos_listadodeproductos_wcds_50_tfprdncas_sel = AV86TFPrdNCAS_Sel ;
      AV149Stocksquimicos_listadodeproductos_wcds_51_tfprvnum = AV87TFPrvNum ;
      AV150Stocksquimicos_listadodeproductos_wcds_52_tfprvnum_to = AV88TFPrvNum_To ;
      AV151Stocksquimicos_listadodeproductos_wcds_53_tfprvnom = AV89TFPrvNom ;
      AV152Stocksquimicos_listadodeproductos_wcds_54_tfprvnom_sel = AV90TFPrvNom_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e121KX2( )
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
         AV31PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV31PageToGo) ;
      }
   }

   public void e131KX2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e141KX2( )
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
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdExiAlm") == 0 )
         {
            AV37TFPrdExiAlm = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFPrdExiAlm", GXutil.ltrimstr( AV37TFPrdExiAlm, 12, 4));
            AV38TFPrdExiAlm_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFPrdExiAlm_To", GXutil.ltrimstr( AV38TFPrdExiAlm_To, 12, 4));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdCanRes") == 0 )
         {
            AV39TFPrdCanRes = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFPrdCanRes", GXutil.ltrimstr( AV39TFPrdCanRes, 12, 4));
            AV40TFPrdCanRes_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFPrdCanRes_To", GXutil.ltrimstr( AV40TFPrdCanRes_To, 12, 4));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdDisponible") == 0 )
         {
            AV91TFPrdDisponible = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91TFPrdDisponible", GXutil.ltrimstr( AV91TFPrdDisponible, 12, 4));
            AV92TFPrdDisponible_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92TFPrdDisponible_To", GXutil.ltrimstr( AV92TFPrdDisponible_To, 12, 4));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdCanPen") == 0 )
         {
            AV41TFPrdCanPen = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFPrdCanPen", GXutil.ltrimstr( AV41TFPrdCanPen, 12, 4));
            AV42TFPrdCanPen_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFPrdCanPen_To", GXutil.ltrimstr( AV42TFPrdCanPen_To, 12, 4));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdPreAct") == 0 )
         {
            AV43TFPrdPreAct = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFPrdPreAct", GXutil.ltrimstr( AV43TFPrdPreAct, 14, 5));
            AV44TFPrdPreAct_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFPrdPreAct_To", GXutil.ltrimstr( AV44TFPrdPreAct_To, 14, 5));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "TipPrdDsc") == 0 )
         {
            AV45TFTipPrdDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFTipPrdDsc", AV45TFTipPrdDsc);
            AV46TFTipPrdDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFTipPrdDsc_Sel", AV46TFTipPrdDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ValDsc") == 0 )
         {
            AV47TFValDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFValDsc", AV47TFValDsc);
            AV48TFValDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFValDsc_Sel", AV48TFValDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdRec") == 0 )
         {
            AV49TFPrdRec = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFPrdRec", AV49TFPrdRec);
            AV50TFPrdRec_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFPrdRec_Sel", AV50TFPrdRec_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdAox") == 0 )
         {
            AV51TFPrdAox = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFPrdAox", GXutil.ltrimstr( AV51TFPrdAox, 6, 2));
            AV52TFPrdAox_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFPrdAox_To", GXutil.ltrimstr( AV52TFPrdAox_To, 6, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdGots") == 0 )
         {
            AV53TFPrdGots = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFPrdGots", AV53TFPrdGots);
            AV54TFPrdGots_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFPrdGots_Sel", AV54TFPrdGots_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdReach") == 0 )
         {
            AV55TFPrdReach = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFPrdReach", AV55TFPrdReach);
            AV56TFPrdReach_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFPrdReach_Sel", AV56TFPrdReach_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdOkotex") == 0 )
         {
            AV57TFPrdOkotex_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFPrdOkotex_SelsJson", AV57TFPrdOkotex_SelsJson);
            AV58TFPrdOkotex_Sels.fromJSonString(AV57TFPrdOkotex_SelsJson, null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdHm") == 0 )
         {
            AV59TFPrdHm = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFPrdHm", AV59TFPrdHm);
            AV60TFPrdHm_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFPrdHm_Sel", AV60TFPrdHm_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdZDHC") == 0 )
         {
            AV61TFPrdZDHC_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFPrdZDHC_SelsJson", AV61TFPrdZDHC_SelsJson);
            AV62TFPrdZDHC_Sels.fromJSonString(AV61TFPrdZDHC_SelsJson, null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdList") == 0 )
         {
            AV63TFPrdList_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFPrdList_SelsJson", AV63TFPrdList_SelsJson);
            AV64TFPrdList_Sels.fromJSonString(AV63TFPrdList_SelsJson, null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdTHELIST") == 0 )
         {
            AV65TFPrdTHELIST = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFPrdTHELIST", AV65TFPrdTHELIST);
            AV66TFPrdTHELIST_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFPrdTHELIST_Sel", AV66TFPrdTHELIST_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdGRS") == 0 )
         {
            AV67TFPrdGRS_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TFPrdGRS_SelsJson", AV67TFPrdGRS_SelsJson);
            AV68TFPrdGRS_Sels.fromJSonString(AV67TFPrdGRS_SelsJson, null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdHS") == 0 )
         {
            AV69TFPrdHS = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TFPrdHS", AV69TFPrdHS);
            AV70TFPrdHS_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70TFPrdHS_Sel", AV70TFPrdHS_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdFHS") == 0 )
         {
            AV71TFPrdFHS = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TFPrdFHS", localUtil.format(AV71TFPrdFHS, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNum2") == 0 )
         {
            AV75TFPrdNum2 = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75TFPrdNum2", AV75TFPrdNum2);
            AV76TFPrdNum2_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76TFPrdNum2_Sel", AV76TFPrdNum2_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNom2") == 0 )
         {
            AV77TFPrdNom2 = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77TFPrdNom2", AV77TFPrdNom2);
            AV78TFPrdNom2_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78TFPrdNom2_Sel", AV78TFPrdNom2_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdRefPrv") == 0 )
         {
            AV79TFPrdRefPrv = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV79TFPrdRefPrv", AV79TFPrdRefPrv);
            AV80TFPrdRefPrv_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80TFPrdRefPrv_Sel", AV80TFPrdRefPrv_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdFuncion") == 0 )
         {
            AV81TFPrdFuncion = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81TFPrdFuncion", AV81TFPrdFuncion);
            AV82TFPrdFuncion_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82TFPrdFuncion_Sel", AV82TFPrdFuncion_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdEINECS") == 0 )
         {
            AV83TFPrdEINECS = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83TFPrdEINECS", AV83TFPrdEINECS);
            AV84TFPrdEINECS_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84TFPrdEINECS_Sel", AV84TFPrdEINECS_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNCAS") == 0 )
         {
            AV85TFPrdNCAS = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85TFPrdNCAS", AV85TFPrdNCAS);
            AV86TFPrdNCAS_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86TFPrdNCAS_Sel", AV86TFPrdNCAS_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvNum") == 0 )
         {
            AV87TFPrvNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV87TFPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV87TFPrvNum), 6, 0));
            AV88TFPrvNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88TFPrvNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV88TFPrvNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvNom") == 0 )
         {
            AV89TFPrvNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89TFPrvNom", AV89TFPrvNom);
            AV90TFPrvNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90TFPrvNom_Sel", AV90TFPrvNom_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV68TFPrdGRS_Sels", AV68TFPrdGRS_Sels);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV64TFPrdList_Sels", AV64TFPrdList_Sels);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV62TFPrdZDHC_Sels", AV62TFPrdZDHC_Sels);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV58TFPrdOkotex_Sels", AV58TFPrdOkotex_Sels);
   }

   private void e211KX2( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(43) ;
         }
         sendrow_432( ) ;
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
      if ( isFullAjaxMode( ) && ! bGXsfl_43_Refreshing )
      {
         httpContext.doAjaxLoad(43, GridRow);
      }
   }

   public void e151KX2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV18ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV20ColumnsSelector.fromJSonString(AV18ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "StocksQuimicos.ListadodeProductos_WCColumnsSelector", ((GXutil.strcmp("", AV18ColumnsSelectorXML)==0) ? "" : AV20ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e111KX2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("StocksQuimicos.ListadodeProductos_WCFilters")),GXutil.URLEncode(GXutil.rtrim(AV95Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("StocksQuimicos.ListadodeProductos_WCFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV24ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "StocksQuimicos.ListadodeProductos_WCFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         listadodeproductos_wc_impl.this.GXt_char1 = GXv_char4[0] ;
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
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV95Pgmname+"GridState", AV24ManageFiltersXml) ;
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
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV58TFPrdOkotex_Sels", AV58TFPrdOkotex_Sels);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV62TFPrdZDHC_Sels", AV62TFPrdZDHC_Sels);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV64TFPrdList_Sels", AV64TFPrdList_Sels);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV68TFPrdGRS_Sels", AV68TFPrdGRS_Sels);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
   }

   public void e161KX2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV16ExcelFilename ;
      GXv_char3[0] = AV17ErrorMessage ;
      new app.stocksquimicos.listadodeproductos_wcexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      listadodeproductos_wc_impl.this.AV16ExcelFilename = GXv_char4[0] ;
      listadodeproductos_wc_impl.this.AV17ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV16ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV16ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV17ErrorMessage);
      }
   }

   public void e171KX2( )
   {
      /* 'DoExportReport' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.stocksquimicos.listadodeproductos_wcexportreport", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void e181KX2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.stocksquimicos.listadodeproductos_wcexportcsv", new String[] {}, new String[] {}) );
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
      AV20ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdNum", "", "Producto", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdNom", "", "Descripcion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdExiAlm", "", "Existencias Almacen", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdCanRes", "", "Cantidad Reservada", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdDisponible", "", "Disponible", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdCanPen", "", "Pdte. Recibir", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdPreAct", "", "Precio Actual", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "TipPrdDsc", "", "Tipo Producto", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ValDsc", "", "Validez", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdRec", "", "R?", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdAox", "", "AOX", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdGots", "", "GOTS", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdReach", "", "REACH", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdOkotex", "", "Oeko Tex", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdHm", "", "HM", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdZDHC", "", "ZDHC", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdList", "", "List by Inditex ", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdTHELIST", "", "THELIST", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdGRS", "", "GRS", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdHS", "Seguridad", "Hoja?", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdFHS", "Seguridad", "Fecha", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdNum2", "Auxiliar", "Producto", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdNom2", "Auxiliar", "NOmbre", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdRefPrv", "", "Referencia Proveedor", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdFuncion", "", "Funcion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdEINECS", "", "N EINECS", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdNCAS", "", "Nº CAS", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrvNum", "", "Proveedor", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrvNom", "", "Nombre", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV19UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "StocksQuimicos.ListadodeProductos_WCColumnsSelector", GXv_char4) ;
      listadodeproductos_wc_impl.this.GXt_char1 = GXv_char4[0] ;
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
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "StocksQuimicos.ListadodeProductos_WCFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
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
      AV37TFPrdExiAlm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFPrdExiAlm", GXutil.ltrimstr( AV37TFPrdExiAlm, 12, 4));
      AV38TFPrdExiAlm_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFPrdExiAlm_To", GXutil.ltrimstr( AV38TFPrdExiAlm_To, 12, 4));
      AV39TFPrdCanRes = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFPrdCanRes", GXutil.ltrimstr( AV39TFPrdCanRes, 12, 4));
      AV40TFPrdCanRes_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFPrdCanRes_To", GXutil.ltrimstr( AV40TFPrdCanRes_To, 12, 4));
      AV91TFPrdDisponible = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91TFPrdDisponible", GXutil.ltrimstr( AV91TFPrdDisponible, 12, 4));
      AV92TFPrdDisponible_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92TFPrdDisponible_To", GXutil.ltrimstr( AV92TFPrdDisponible_To, 12, 4));
      AV41TFPrdCanPen = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFPrdCanPen", GXutil.ltrimstr( AV41TFPrdCanPen, 12, 4));
      AV42TFPrdCanPen_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFPrdCanPen_To", GXutil.ltrimstr( AV42TFPrdCanPen_To, 12, 4));
      AV43TFPrdPreAct = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFPrdPreAct", GXutil.ltrimstr( AV43TFPrdPreAct, 14, 5));
      AV44TFPrdPreAct_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFPrdPreAct_To", GXutil.ltrimstr( AV44TFPrdPreAct_To, 14, 5));
      AV45TFTipPrdDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFTipPrdDsc", AV45TFTipPrdDsc);
      AV46TFTipPrdDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFTipPrdDsc_Sel", AV46TFTipPrdDsc_Sel);
      AV47TFValDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFValDsc", AV47TFValDsc);
      AV48TFValDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFValDsc_Sel", AV48TFValDsc_Sel);
      AV49TFPrdRec = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFPrdRec", AV49TFPrdRec);
      AV50TFPrdRec_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFPrdRec_Sel", AV50TFPrdRec_Sel);
      AV51TFPrdAox = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFPrdAox", GXutil.ltrimstr( AV51TFPrdAox, 6, 2));
      AV52TFPrdAox_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFPrdAox_To", GXutil.ltrimstr( AV52TFPrdAox_To, 6, 2));
      AV53TFPrdGots = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFPrdGots", AV53TFPrdGots);
      AV54TFPrdGots_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFPrdGots_Sel", AV54TFPrdGots_Sel);
      AV55TFPrdReach = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFPrdReach", AV55TFPrdReach);
      AV56TFPrdReach_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFPrdReach_Sel", AV56TFPrdReach_Sel);
      AV58TFPrdOkotex_Sels = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV59TFPrdHm = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFPrdHm", AV59TFPrdHm);
      AV60TFPrdHm_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFPrdHm_Sel", AV60TFPrdHm_Sel);
      AV62TFPrdZDHC_Sels = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV64TFPrdList_Sels = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV65TFPrdTHELIST = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFPrdTHELIST", AV65TFPrdTHELIST);
      AV66TFPrdTHELIST_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFPrdTHELIST_Sel", AV66TFPrdTHELIST_Sel);
      AV68TFPrdGRS_Sels = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV69TFPrdHS = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TFPrdHS", AV69TFPrdHS);
      AV70TFPrdHS_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70TFPrdHS_Sel", AV70TFPrdHS_Sel);
      AV71TFPrdFHS = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TFPrdFHS", localUtil.format(AV71TFPrdFHS, "99/99/99"));
      AV75TFPrdNum2 = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75TFPrdNum2", AV75TFPrdNum2);
      AV76TFPrdNum2_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76TFPrdNum2_Sel", AV76TFPrdNum2_Sel);
      AV77TFPrdNom2 = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77TFPrdNom2", AV77TFPrdNom2);
      AV78TFPrdNom2_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78TFPrdNom2_Sel", AV78TFPrdNom2_Sel);
      AV79TFPrdRefPrv = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV79TFPrdRefPrv", AV79TFPrdRefPrv);
      AV80TFPrdRefPrv_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80TFPrdRefPrv_Sel", AV80TFPrdRefPrv_Sel);
      AV81TFPrdFuncion = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81TFPrdFuncion", AV81TFPrdFuncion);
      AV82TFPrdFuncion_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82TFPrdFuncion_Sel", AV82TFPrdFuncion_Sel);
      AV83TFPrdEINECS = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83TFPrdEINECS", AV83TFPrdEINECS);
      AV84TFPrdEINECS_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84TFPrdEINECS_Sel", AV84TFPrdEINECS_Sel);
      AV85TFPrdNCAS = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85TFPrdNCAS", AV85TFPrdNCAS);
      AV86TFPrdNCAS_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86TFPrdNCAS_Sel", AV86TFPrdNCAS_Sel);
      AV87TFPrvNum = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV87TFPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV87TFPrvNum), 6, 0));
      AV88TFPrvNum_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88TFPrvNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV88TFPrvNum_To), 6, 0));
      AV89TFPrvNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89TFPrvNom", AV89TFPrvNom);
      AV90TFPrvNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90TFPrvNom_Sel", AV90TFPrvNom_Sel);
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
      if ( GXutil.strcmp(AV22Session.getValue(AV95Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV95Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV95Pgmname+"GridState"), null, null);
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
      AV153GXV1 = 1 ;
      while ( AV153GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV153GXV1));
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
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDEXIALM") == 0 )
         {
            AV37TFPrdExiAlm = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFPrdExiAlm", GXutil.ltrimstr( AV37TFPrdExiAlm, 12, 4));
            AV38TFPrdExiAlm_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFPrdExiAlm_To", GXutil.ltrimstr( AV38TFPrdExiAlm_To, 12, 4));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANRES") == 0 )
         {
            AV39TFPrdCanRes = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFPrdCanRes", GXutil.ltrimstr( AV39TFPrdCanRes, 12, 4));
            AV40TFPrdCanRes_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFPrdCanRes_To", GXutil.ltrimstr( AV40TFPrdCanRes_To, 12, 4));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDDISPONIBLE") == 0 )
         {
            AV91TFPrdDisponible = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91TFPrdDisponible", GXutil.ltrimstr( AV91TFPrdDisponible, 12, 4));
            AV92TFPrdDisponible_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92TFPrdDisponible_To", GXutil.ltrimstr( AV92TFPrdDisponible_To, 12, 4));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANPEN") == 0 )
         {
            AV41TFPrdCanPen = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFPrdCanPen", GXutil.ltrimstr( AV41TFPrdCanPen, 12, 4));
            AV42TFPrdCanPen_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFPrdCanPen_To", GXutil.ltrimstr( AV42TFPrdCanPen_To, 12, 4));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDPREACT") == 0 )
         {
            AV43TFPrdPreAct = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFPrdPreAct", GXutil.ltrimstr( AV43TFPrdPreAct, 14, 5));
            AV44TFPrdPreAct_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFPrdPreAct_To", GXutil.ltrimstr( AV44TFPrdPreAct_To, 14, 5));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPPRDDSC") == 0 )
         {
            AV45TFTipPrdDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFTipPrdDsc", AV45TFTipPrdDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPPRDDSC_SEL") == 0 )
         {
            AV46TFTipPrdDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFTipPrdDsc_Sel", AV46TFTipPrdDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALDSC") == 0 )
         {
            AV47TFValDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFValDsc", AV47TFValDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALDSC_SEL") == 0 )
         {
            AV48TFValDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFValDsc_Sel", AV48TFValDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREC") == 0 )
         {
            AV49TFPrdRec = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFPrdRec", AV49TFPrdRec);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREC_SEL") == 0 )
         {
            AV50TFPrdRec_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFPrdRec_Sel", AV50TFPrdRec_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDAOX") == 0 )
         {
            AV51TFPrdAox = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFPrdAox", GXutil.ltrimstr( AV51TFPrdAox, 6, 2));
            AV52TFPrdAox_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFPrdAox_To", GXutil.ltrimstr( AV52TFPrdAox_To, 6, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDGOTS") == 0 )
         {
            AV53TFPrdGots = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFPrdGots", AV53TFPrdGots);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDGOTS_SEL") == 0 )
         {
            AV54TFPrdGots_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFPrdGots_Sel", AV54TFPrdGots_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREACH") == 0 )
         {
            AV55TFPrdReach = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFPrdReach", AV55TFPrdReach);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREACH_SEL") == 0 )
         {
            AV56TFPrdReach_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFPrdReach_Sel", AV56TFPrdReach_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDOKOTEX_SEL") == 0 )
         {
            AV57TFPrdOkotex_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFPrdOkotex_SelsJson", AV57TFPrdOkotex_SelsJson);
            AV58TFPrdOkotex_Sels.fromJSonString(AV57TFPrdOkotex_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDHM") == 0 )
         {
            AV59TFPrdHm = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFPrdHm", AV59TFPrdHm);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDHM_SEL") == 0 )
         {
            AV60TFPrdHm_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFPrdHm_Sel", AV60TFPrdHm_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDZDHC_SEL") == 0 )
         {
            AV61TFPrdZDHC_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFPrdZDHC_SelsJson", AV61TFPrdZDHC_SelsJson);
            AV62TFPrdZDHC_Sels.fromJSonString(AV61TFPrdZDHC_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDLIST_SEL") == 0 )
         {
            AV63TFPrdList_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFPrdList_SelsJson", AV63TFPrdList_SelsJson);
            AV64TFPrdList_Sels.fromJSonString(AV63TFPrdList_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDTHELIST") == 0 )
         {
            AV65TFPrdTHELIST = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFPrdTHELIST", AV65TFPrdTHELIST);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDTHELIST_SEL") == 0 )
         {
            AV66TFPrdTHELIST_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFPrdTHELIST_Sel", AV66TFPrdTHELIST_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDGRS_SEL") == 0 )
         {
            AV67TFPrdGRS_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TFPrdGRS_SelsJson", AV67TFPrdGRS_SelsJson);
            AV68TFPrdGRS_Sels.fromJSonString(AV67TFPrdGRS_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDHS") == 0 )
         {
            AV69TFPrdHS = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TFPrdHS", AV69TFPrdHS);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDHS_SEL") == 0 )
         {
            AV70TFPrdHS_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70TFPrdHS_Sel", AV70TFPrdHS_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDFHS") == 0 )
         {
            AV71TFPrdFHS = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TFPrdFHS", localUtil.format(AV71TFPrdFHS, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM2") == 0 )
         {
            AV75TFPrdNum2 = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75TFPrdNum2", AV75TFPrdNum2);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM2_SEL") == 0 )
         {
            AV76TFPrdNum2_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76TFPrdNum2_Sel", AV76TFPrdNum2_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM2") == 0 )
         {
            AV77TFPrdNom2 = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77TFPrdNom2", AV77TFPrdNom2);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM2_SEL") == 0 )
         {
            AV78TFPrdNom2_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78TFPrdNom2_Sel", AV78TFPrdNom2_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREFPRV") == 0 )
         {
            AV79TFPrdRefPrv = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV79TFPrdRefPrv", AV79TFPrdRefPrv);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREFPRV_SEL") == 0 )
         {
            AV80TFPrdRefPrv_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80TFPrdRefPrv_Sel", AV80TFPrdRefPrv_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDFUNCION") == 0 )
         {
            AV81TFPrdFuncion = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81TFPrdFuncion", AV81TFPrdFuncion);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDFUNCION_SEL") == 0 )
         {
            AV82TFPrdFuncion_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82TFPrdFuncion_Sel", AV82TFPrdFuncion_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDEINECS") == 0 )
         {
            AV83TFPrdEINECS = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83TFPrdEINECS", AV83TFPrdEINECS);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDEINECS_SEL") == 0 )
         {
            AV84TFPrdEINECS_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84TFPrdEINECS_Sel", AV84TFPrdEINECS_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNCAS") == 0 )
         {
            AV85TFPrdNCAS = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85TFPrdNCAS", AV85TFPrdNCAS);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNCAS_SEL") == 0 )
         {
            AV86TFPrdNCAS_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86TFPrdNCAS_Sel", AV86TFPrdNCAS_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNUM") == 0 )
         {
            AV87TFPrvNum = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV87TFPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV87TFPrvNum), 6, 0));
            AV88TFPrvNum_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88TFPrvNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV88TFPrvNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM") == 0 )
         {
            AV89TFPrvNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89TFPrvNom", AV89TFPrvNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM_SEL") == 0 )
         {
            AV90TFPrvNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90TFPrvNom_Sel", AV90TFPrvNom_Sel);
         }
         AV153GXV1 = (int)(AV153GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV27TFPrdNum_Sel)==0), AV27TFPrdNum_Sel, GXv_char4) ;
      listadodeproductos_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV29TFPrdNom_Sel)==0), AV29TFPrdNom_Sel, GXv_char3) ;
      listadodeproductos_wc_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char2[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV46TFTipPrdDsc_Sel)==0), AV46TFTipPrdDsc_Sel, GXv_char2) ;
      listadodeproductos_wc_impl.this.GXt_char13 = GXv_char2[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV48TFValDsc_Sel)==0), AV48TFValDsc_Sel, GXv_char15) ;
      listadodeproductos_wc_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV50TFPrdRec_Sel)==0), AV50TFPrdRec_Sel, GXv_char17) ;
      listadodeproductos_wc_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV54TFPrdGots_Sel)==0), AV54TFPrdGots_Sel, GXv_char19) ;
      listadodeproductos_wc_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV56TFPrdReach_Sel)==0), AV56TFPrdReach_Sel, GXv_char21) ;
      listadodeproductos_wc_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV58TFPrdOkotex_Sels.size()==0), AV57TFPrdOkotex_SelsJson, GXv_char23) ;
      listadodeproductos_wc_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV60TFPrdHm_Sel)==0), AV60TFPrdHm_Sel, GXv_char25) ;
      listadodeproductos_wc_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char26 = "" ;
      GXv_char27[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV62TFPrdZDHC_Sels.size()==0), AV61TFPrdZDHC_SelsJson, GXv_char27) ;
      listadodeproductos_wc_impl.this.GXt_char26 = GXv_char27[0] ;
      GXt_char28 = "" ;
      GXv_char29[0] = GXt_char28 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV64TFPrdList_Sels.size()==0), AV63TFPrdList_SelsJson, GXv_char29) ;
      listadodeproductos_wc_impl.this.GXt_char28 = GXv_char29[0] ;
      GXt_char30 = "" ;
      GXv_char31[0] = GXt_char30 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV66TFPrdTHELIST_Sel)==0), AV66TFPrdTHELIST_Sel, GXv_char31) ;
      listadodeproductos_wc_impl.this.GXt_char30 = GXv_char31[0] ;
      GXt_char32 = "" ;
      GXv_char33[0] = GXt_char32 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV68TFPrdGRS_Sels.size()==0), AV67TFPrdGRS_SelsJson, GXv_char33) ;
      listadodeproductos_wc_impl.this.GXt_char32 = GXv_char33[0] ;
      GXt_char34 = "" ;
      GXv_char35[0] = GXt_char34 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV70TFPrdHS_Sel)==0), AV70TFPrdHS_Sel, GXv_char35) ;
      listadodeproductos_wc_impl.this.GXt_char34 = GXv_char35[0] ;
      GXt_char36 = "" ;
      GXv_char37[0] = GXt_char36 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV76TFPrdNum2_Sel)==0), AV76TFPrdNum2_Sel, GXv_char37) ;
      listadodeproductos_wc_impl.this.GXt_char36 = GXv_char37[0] ;
      GXt_char38 = "" ;
      GXv_char39[0] = GXt_char38 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV78TFPrdNom2_Sel)==0), AV78TFPrdNom2_Sel, GXv_char39) ;
      listadodeproductos_wc_impl.this.GXt_char38 = GXv_char39[0] ;
      GXt_char40 = "" ;
      GXv_char41[0] = GXt_char40 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV80TFPrdRefPrv_Sel)==0), AV80TFPrdRefPrv_Sel, GXv_char41) ;
      listadodeproductos_wc_impl.this.GXt_char40 = GXv_char41[0] ;
      GXt_char42 = "" ;
      GXv_char43[0] = GXt_char42 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV82TFPrdFuncion_Sel)==0), AV82TFPrdFuncion_Sel, GXv_char43) ;
      listadodeproductos_wc_impl.this.GXt_char42 = GXv_char43[0] ;
      GXt_char44 = "" ;
      GXv_char45[0] = GXt_char44 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV84TFPrdEINECS_Sel)==0), AV84TFPrdEINECS_Sel, GXv_char45) ;
      listadodeproductos_wc_impl.this.GXt_char44 = GXv_char45[0] ;
      GXt_char46 = "" ;
      GXv_char47[0] = GXt_char46 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV86TFPrdNCAS_Sel)==0), AV86TFPrdNCAS_Sel, GXv_char47) ;
      listadodeproductos_wc_impl.this.GXt_char46 = GXv_char47[0] ;
      GXt_char48 = "" ;
      GXv_char49[0] = GXt_char48 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV90TFPrvNom_Sel)==0), AV90TFPrvNom_Sel, GXv_char49) ;
      listadodeproductos_wc_impl.this.GXt_char48 = GXv_char49[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|"+GXt_char12+"||||||"+GXt_char13+"|"+GXt_char14+"|"+GXt_char16+"||"+GXt_char18+"|"+GXt_char20+"|"+GXt_char22+"|"+GXt_char24+"|"+GXt_char26+"|"+GXt_char28+"|"+GXt_char30+"|"+GXt_char32+"|"+GXt_char34+"||"+GXt_char36+"|"+GXt_char38+"|"+GXt_char40+"|"+GXt_char42+"|"+GXt_char44+"|"+GXt_char46+"||"+GXt_char48 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char48 = "" ;
      GXv_char49[0] = GXt_char48 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV26TFPrdNum)==0), AV26TFPrdNum, GXv_char49) ;
      listadodeproductos_wc_impl.this.GXt_char48 = GXv_char49[0] ;
      GXt_char46 = "" ;
      GXv_char47[0] = GXt_char46 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV28TFPrdNom)==0), AV28TFPrdNom, GXv_char47) ;
      listadodeproductos_wc_impl.this.GXt_char46 = GXv_char47[0] ;
      GXt_char44 = "" ;
      GXv_char45[0] = GXt_char44 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV45TFTipPrdDsc)==0), AV45TFTipPrdDsc, GXv_char45) ;
      listadodeproductos_wc_impl.this.GXt_char44 = GXv_char45[0] ;
      GXt_char42 = "" ;
      GXv_char43[0] = GXt_char42 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV47TFValDsc)==0), AV47TFValDsc, GXv_char43) ;
      listadodeproductos_wc_impl.this.GXt_char42 = GXv_char43[0] ;
      GXt_char40 = "" ;
      GXv_char41[0] = GXt_char40 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV49TFPrdRec)==0), AV49TFPrdRec, GXv_char41) ;
      listadodeproductos_wc_impl.this.GXt_char40 = GXv_char41[0] ;
      GXt_char38 = "" ;
      GXv_char39[0] = GXt_char38 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV53TFPrdGots)==0), AV53TFPrdGots, GXv_char39) ;
      listadodeproductos_wc_impl.this.GXt_char38 = GXv_char39[0] ;
      GXt_char36 = "" ;
      GXv_char37[0] = GXt_char36 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV55TFPrdReach)==0), AV55TFPrdReach, GXv_char37) ;
      listadodeproductos_wc_impl.this.GXt_char36 = GXv_char37[0] ;
      GXt_char34 = "" ;
      GXv_char35[0] = GXt_char34 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV59TFPrdHm)==0), AV59TFPrdHm, GXv_char35) ;
      listadodeproductos_wc_impl.this.GXt_char34 = GXv_char35[0] ;
      GXt_char32 = "" ;
      GXv_char33[0] = GXt_char32 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV65TFPrdTHELIST)==0), AV65TFPrdTHELIST, GXv_char33) ;
      listadodeproductos_wc_impl.this.GXt_char32 = GXv_char33[0] ;
      GXt_char30 = "" ;
      GXv_char31[0] = GXt_char30 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV69TFPrdHS)==0), AV69TFPrdHS, GXv_char31) ;
      listadodeproductos_wc_impl.this.GXt_char30 = GXv_char31[0] ;
      GXt_char28 = "" ;
      GXv_char29[0] = GXt_char28 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV75TFPrdNum2)==0), AV75TFPrdNum2, GXv_char29) ;
      listadodeproductos_wc_impl.this.GXt_char28 = GXv_char29[0] ;
      GXt_char26 = "" ;
      GXv_char27[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV77TFPrdNom2)==0), AV77TFPrdNom2, GXv_char27) ;
      listadodeproductos_wc_impl.this.GXt_char26 = GXv_char27[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV79TFPrdRefPrv)==0), AV79TFPrdRefPrv, GXv_char25) ;
      listadodeproductos_wc_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV81TFPrdFuncion)==0), AV81TFPrdFuncion, GXv_char23) ;
      listadodeproductos_wc_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV83TFPrdEINECS)==0), AV83TFPrdEINECS, GXv_char21) ;
      listadodeproductos_wc_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV85TFPrdNCAS)==0), AV85TFPrdNCAS, GXv_char19) ;
      listadodeproductos_wc_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV89TFPrvNom)==0), AV89TFPrvNom, GXv_char17) ;
      listadodeproductos_wc_impl.this.GXt_char16 = GXv_char17[0] ;
      Ddo_grid_Filteredtext_set = GXt_char48+"|"+GXt_char46+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV37TFPrdExiAlm)==0) ? "" : GXutil.str( AV37TFPrdExiAlm, 12, 4))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFPrdCanRes)==0) ? "" : GXutil.str( AV39TFPrdCanRes, 12, 4))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV91TFPrdDisponible)==0) ? "" : GXutil.str( AV91TFPrdDisponible, 12, 4))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFPrdCanPen)==0) ? "" : GXutil.str( AV41TFPrdCanPen, 12, 4))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFPrdPreAct)==0) ? "" : GXutil.str( AV43TFPrdPreAct, 14, 5))+"|"+GXt_char44+"|"+GXt_char42+"|"+GXt_char40+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFPrdAox)==0) ? "" : GXutil.str( AV51TFPrdAox, 6, 2))+"|"+GXt_char38+"|"+GXt_char36+"||"+GXt_char34+"|||"+GXt_char32+"||"+GXt_char30+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV71TFPrdFHS)) ? "" : localUtil.dtoc( AV71TFPrdFHS, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char28+"|"+GXt_char26+"|"+GXt_char24+"|"+GXt_char22+"|"+GXt_char20+"|"+GXt_char18+"|"+((0==AV87TFPrvNum) ? "" : GXutil.str( AV87TFPrvNum, 6, 0))+"|"+GXt_char16 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV38TFPrdExiAlm_To)==0) ? "" : GXutil.str( AV38TFPrdExiAlm_To, 12, 4))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFPrdCanRes_To)==0) ? "" : GXutil.str( AV40TFPrdCanRes_To, 12, 4))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV92TFPrdDisponible_To)==0) ? "" : GXutil.str( AV92TFPrdDisponible_To, 12, 4))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFPrdCanPen_To)==0) ? "" : GXutil.str( AV42TFPrdCanPen_To, 12, 4))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV44TFPrdPreAct_To)==0) ? "" : GXutil.str( AV44TFPrdPreAct_To, 14, 5))+"||||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV52TFPrdAox_To)==0) ? "" : GXutil.str( AV52TFPrdAox_To, 6, 2))+"|||||||||||||||||"+((0==AV88TFPrvNum_To) ? "" : GXutil.str( AV88TFPrvNum_To, 6, 0))+"|" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV22Session.getValue(AV95Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState50[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState50, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV15FilterFullText)==0), (short)(0), AV15FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState50[0] ;
      GXv_SdtWWPGridState50[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState50, "TFPRDNUM", "", !(GXutil.strcmp("", AV26TFPrdNum)==0), (short)(0), AV26TFPrdNum, "", !(GXutil.strcmp("", AV27TFPrdNum_Sel)==0), AV27TFPrdNum_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState50[0] ;
      GXv_SdtWWPGridState50[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState50, "TFPRDNOM", "", !(GXutil.strcmp("", AV28TFPrdNom)==0), (short)(0), AV28TFPrdNom, "", !(GXutil.strcmp("", AV29TFPrdNom_Sel)==0), AV29TFPrdNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState50[0] ;
      GXv_SdtWWPGridState50[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState50, "TFPRDEXIALM", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV37TFPrdExiAlm)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV38TFPrdExiAlm_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV37TFPrdExiAlm, 12, 4)), GXutil.trim( GXutil.str( AV38TFPrdExiAlm_To, 12, 4))) ;
      AV10GridState = GXv_SdtWWPGridState50[0] ;
      GXv_SdtWWPGridState50[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState50, "TFPRDCANRES", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFPrdCanRes)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFPrdCanRes_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV39TFPrdCanRes, 12, 4)), GXutil.trim( GXutil.str( AV40TFPrdCanRes_To, 12, 4))) ;
      AV10GridState = GXv_SdtWWPGridState50[0] ;
      GXv_SdtWWPGridState50[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState50, "TFPRDDISPONIBLE", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV91TFPrdDisponible)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV92TFPrdDisponible_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV91TFPrdDisponible, 12, 4)), GXutil.trim( GXutil.str( AV92TFPrdDisponible_To, 12, 4))) ;
      AV10GridState = GXv_SdtWWPGridState50[0] ;
      GXv_SdtWWPGridState50[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState50, "TFPRDCANPEN", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFPrdCanPen)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFPrdCanPen_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV41TFPrdCanPen, 12, 4)), GXutil.trim( GXutil.str( AV42TFPrdCanPen_To, 12, 4))) ;
      AV10GridState = GXv_SdtWWPGridState50[0] ;
      GXv_SdtWWPGridState50[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState50, "TFPRDPREACT", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFPrdPreAct)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV44TFPrdPreAct_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV43TFPrdPreAct, 14, 5)), GXutil.trim( GXutil.str( AV44TFPrdPreAct_To, 14, 5))) ;
      AV10GridState = GXv_SdtWWPGridState50[0] ;
      GXv_SdtWWPGridState50[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState50, "TFTIPPRDDSC", "", !(GXutil.strcmp("", AV45TFTipPrdDsc)==0), (short)(0), AV45TFTipPrdDsc, "", !(GXutil.strcmp("", AV46TFTipPrdDsc_Sel)==0), AV46TFTipPrdDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState50[0] ;
      GXv_SdtWWPGridState50[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState50, "TFVALDSC", "", !(GXutil.strcmp("", AV47TFValDsc)==0), (short)(0), AV47TFValDsc, "", !(GXutil.strcmp("", AV48TFValDsc_Sel)==0), AV48TFValDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState50[0] ;
      GXv_SdtWWPGridState50[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState50, "TFPRDREC", "", !(GXutil.strcmp("", AV49TFPrdRec)==0), (short)(0), AV49TFPrdRec, "", !(GXutil.strcmp("", AV50TFPrdRec_Sel)==0), AV50TFPrdRec_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState50[0] ;
      GXv_SdtWWPGridState50[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState50, "TFPRDAOX", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFPrdAox)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV52TFPrdAox_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV51TFPrdAox, 6, 2)), GXutil.trim( GXutil.str( AV52TFPrdAox_To, 6, 2))) ;
      AV10GridState = GXv_SdtWWPGridState50[0] ;
      GXv_SdtWWPGridState50[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState50, "TFPRDGOTS", "", !(GXutil.strcmp("", AV53TFPrdGots)==0), (short)(0), AV53TFPrdGots, "", !(GXutil.strcmp("", AV54TFPrdGots_Sel)==0), AV54TFPrdGots_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState50[0] ;
      GXv_SdtWWPGridState50[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState50, "TFPRDREACH", "", !(GXutil.strcmp("", AV55TFPrdReach)==0), (short)(0), AV55TFPrdReach, "", !(GXutil.strcmp("", AV56TFPrdReach_Sel)==0), AV56TFPrdReach_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState50[0] ;
      GXv_SdtWWPGridState50[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState50, "TFPRDOKOTEX_SEL", "", !(AV58TFPrdOkotex_Sels.size()==0), (short)(0), AV58TFPrdOkotex_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState50[0] ;
      GXv_SdtWWPGridState50[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState50, "TFPRDHM", "", !(GXutil.strcmp("", AV59TFPrdHm)==0), (short)(0), AV59TFPrdHm, "", !(GXutil.strcmp("", AV60TFPrdHm_Sel)==0), AV60TFPrdHm_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState50[0] ;
      GXv_SdtWWPGridState50[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState50, "TFPRDZDHC_SEL", "", !(AV62TFPrdZDHC_Sels.size()==0), (short)(0), AV62TFPrdZDHC_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState50[0] ;
      GXv_SdtWWPGridState50[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState50, "TFPRDLIST_SEL", "", !(AV64TFPrdList_Sels.size()==0), (short)(0), AV64TFPrdList_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState50[0] ;
      GXv_SdtWWPGridState50[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState50, "TFPRDTHELIST", "", !(GXutil.strcmp("", AV65TFPrdTHELIST)==0), (short)(0), AV65TFPrdTHELIST, "", !(GXutil.strcmp("", AV66TFPrdTHELIST_Sel)==0), AV66TFPrdTHELIST_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState50[0] ;
      GXv_SdtWWPGridState50[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState50, "TFPRDGRS_SEL", "", !(AV68TFPrdGRS_Sels.size()==0), (short)(0), AV68TFPrdGRS_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState50[0] ;
      GXv_SdtWWPGridState50[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState50, "TFPRDHS", "", !(GXutil.strcmp("", AV69TFPrdHS)==0), (short)(0), AV69TFPrdHS, "", !(GXutil.strcmp("", AV70TFPrdHS_Sel)==0), AV70TFPrdHS_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState50[0] ;
      GXv_SdtWWPGridState50[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState50, "TFPRDFHS", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV71TFPrdFHS)), (short)(0), GXutil.trim( localUtil.dtoc( AV71TFPrdFHS, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState50[0] ;
      GXv_SdtWWPGridState50[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState50, "TFPRDNUM2", "", !(GXutil.strcmp("", AV75TFPrdNum2)==0), (short)(0), AV75TFPrdNum2, "", !(GXutil.strcmp("", AV76TFPrdNum2_Sel)==0), AV76TFPrdNum2_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState50[0] ;
      GXv_SdtWWPGridState50[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState50, "TFPRDNOM2", "", !(GXutil.strcmp("", AV77TFPrdNom2)==0), (short)(0), AV77TFPrdNom2, "", !(GXutil.strcmp("", AV78TFPrdNom2_Sel)==0), AV78TFPrdNom2_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState50[0] ;
      GXv_SdtWWPGridState50[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState50, "TFPRDREFPRV", "", !(GXutil.strcmp("", AV79TFPrdRefPrv)==0), (short)(0), AV79TFPrdRefPrv, "", !(GXutil.strcmp("", AV80TFPrdRefPrv_Sel)==0), AV80TFPrdRefPrv_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState50[0] ;
      GXv_SdtWWPGridState50[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState50, "TFPRDFUNCION", "", !(GXutil.strcmp("", AV81TFPrdFuncion)==0), (short)(0), AV81TFPrdFuncion, "", !(GXutil.strcmp("", AV82TFPrdFuncion_Sel)==0), AV82TFPrdFuncion_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState50[0] ;
      GXv_SdtWWPGridState50[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState50, "TFPRDEINECS", "", !(GXutil.strcmp("", AV83TFPrdEINECS)==0), (short)(0), AV83TFPrdEINECS, "", !(GXutil.strcmp("", AV84TFPrdEINECS_Sel)==0), AV84TFPrdEINECS_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState50[0] ;
      GXv_SdtWWPGridState50[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState50, "TFPRDNCAS", "", !(GXutil.strcmp("", AV85TFPrdNCAS)==0), (short)(0), AV85TFPrdNCAS, "", !(GXutil.strcmp("", AV86TFPrdNCAS_Sel)==0), AV86TFPrdNCAS_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState50[0] ;
      GXv_SdtWWPGridState50[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState50, "TFPRVNUM", "", !((0==AV87TFPrvNum)&&(0==AV88TFPrvNum_To)), (short)(0), GXutil.trim( GXutil.str( AV87TFPrvNum, 6, 0)), GXutil.trim( GXutil.str( AV88TFPrvNum_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState50[0] ;
      GXv_SdtWWPGridState50[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState50, "TFPRVNOM", "", !(GXutil.strcmp("", AV89TFPrvNom)==0), (short)(0), AV89TFPrvNom, "", !(GXutil.strcmp("", AV90TFPrvNom_Sel)==0), AV90TFPrvNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState50[0] ;
      if ( ! (GXutil.strcmp("", AV34emprcod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV34emprcod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV35PrdNumfrom)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PRDNUMFROM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV35PrdNumfrom );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV36PrdnumTo)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PRDNUMTO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV36PrdnumTo );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV95Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV95Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TTproduc" );
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_25_1KX2( boolean wbgen )
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
         wb_table2_30_1KX2( true) ;
      }
      else
      {
         wb_table2_30_1KX2( false) ;
      }
      return  ;
   }

   public void wb_table2_30_1KX2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_25_1KX2e( true) ;
      }
      else
      {
         wb_table1_25_1KX2e( false) ;
      }
   }

   public void wb_table2_30_1KX2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'" + sPrefix + "',false,'" + sGXsfl_43_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV15FilterFullText, GXutil.rtrim( localUtil.format( AV15FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_StocksQuimicos\\ListadodeProductos_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_30_1KX2e( true) ;
      }
      else
      {
         wb_table2_30_1KX2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV34emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34emprcod", AV34emprcod);
      AV35PrdNumfrom = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35PrdNumfrom", AV35PrdNumfrom);
      AV36PrdnumTo = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36PrdnumTo", AV36PrdnumTo);
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
      pa1KX2( ) ;
      ws1KX2( ) ;
      we1KX2( ) ;
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
      sCtrlAV34emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV35PrdNumfrom = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV36PrdnumTo = (String)getParm(obj,2,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1KX2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "stocksquimicos\\listadodeproductos_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1KX2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV34emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34emprcod", AV34emprcod);
         AV35PrdNumfrom = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35PrdNumfrom", AV35PrdNumfrom);
         AV36PrdnumTo = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36PrdnumTo", AV36PrdnumTo);
      }
      wcpOAV34emprcod = httpContext.cgiGet( sPrefix+"wcpOAV34emprcod") ;
      wcpOAV35PrdNumfrom = httpContext.cgiGet( sPrefix+"wcpOAV35PrdNumfrom") ;
      wcpOAV36PrdnumTo = httpContext.cgiGet( sPrefix+"wcpOAV36PrdnumTo") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV34emprcod, wcpOAV34emprcod) != 0 ) || ( GXutil.strcmp(AV35PrdNumfrom, wcpOAV35PrdNumfrom) != 0 ) || ( GXutil.strcmp(AV36PrdnumTo, wcpOAV36PrdnumTo) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV34emprcod = AV34emprcod ;
      wcpOAV35PrdNumfrom = AV35PrdNumfrom ;
      wcpOAV36PrdnumTo = AV36PrdnumTo ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV34emprcod = httpContext.cgiGet( sPrefix+"AV34emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV34emprcod) > 0 )
      {
         AV34emprcod = httpContext.cgiGet( sCtrlAV34emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34emprcod", AV34emprcod);
      }
      else
      {
         AV34emprcod = httpContext.cgiGet( sPrefix+"AV34emprcod_PARM") ;
      }
      sCtrlAV35PrdNumfrom = httpContext.cgiGet( sPrefix+"AV35PrdNumfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV35PrdNumfrom) > 0 )
      {
         AV35PrdNumfrom = httpContext.cgiGet( sCtrlAV35PrdNumfrom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35PrdNumfrom", AV35PrdNumfrom);
      }
      else
      {
         AV35PrdNumfrom = httpContext.cgiGet( sPrefix+"AV35PrdNumfrom_PARM") ;
      }
      sCtrlAV36PrdnumTo = httpContext.cgiGet( sPrefix+"AV36PrdnumTo_CTRL") ;
      if ( GXutil.len( sCtrlAV36PrdnumTo) > 0 )
      {
         AV36PrdnumTo = httpContext.cgiGet( sCtrlAV36PrdnumTo) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36PrdnumTo", AV36PrdnumTo);
      }
      else
      {
         AV36PrdnumTo = httpContext.cgiGet( sPrefix+"AV36PrdnumTo_PARM") ;
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
      pa1KX2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1KX2( ) ;
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
      ws1KX2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV34emprcod_PARM", GXutil.rtrim( AV34emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV34emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV34emprcod_CTRL", GXutil.rtrim( sCtrlAV34emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV35PrdNumfrom_PARM", GXutil.rtrim( AV35PrdNumfrom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV35PrdNumfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV35PrdNumfrom_CTRL", GXutil.rtrim( sCtrlAV35PrdNumfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV36PrdnumTo_PARM", GXutil.rtrim( AV36PrdnumTo));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV36PrdnumTo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV36PrdnumTo_CTRL", GXutil.rtrim( sCtrlAV36PrdnumTo));
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
      we1KX2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211673474", true, true);
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
      httpContext.AddJavascriptSource("stocksquimicos/listadodeproductos_wc.js", "?20268211673475", false, true);
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

   public void subsflControlProps_432( )
   {
      edtPrdNum_Internalname = sPrefix+"PRDNUM_"+sGXsfl_43_idx ;
      edtPrdNom_Internalname = sPrefix+"PRDNOM_"+sGXsfl_43_idx ;
      edtPrdExiAlm_Internalname = sPrefix+"PRDEXIALM_"+sGXsfl_43_idx ;
      edtPrdCanRes_Internalname = sPrefix+"PRDCANRES_"+sGXsfl_43_idx ;
      edtPrdDisponi_Internalname = sPrefix+"PRDDISPONI_"+sGXsfl_43_idx ;
      edtPrdCanPen_Internalname = sPrefix+"PRDCANPEN_"+sGXsfl_43_idx ;
      edtPrdPreAct_Internalname = sPrefix+"PRDPREACT_"+sGXsfl_43_idx ;
      edtTipPrdDsc_Internalname = sPrefix+"TIPPRDDSC_"+sGXsfl_43_idx ;
      edtValDsc_Internalname = sPrefix+"VALDSC_"+sGXsfl_43_idx ;
      edtPrdRec_Internalname = sPrefix+"PRDREC_"+sGXsfl_43_idx ;
      edtPrdAox_Internalname = sPrefix+"PRDAOX_"+sGXsfl_43_idx ;
      edtPrdGots_Internalname = sPrefix+"PRDGOTS_"+sGXsfl_43_idx ;
      edtPrdReach_Internalname = sPrefix+"PRDREACH_"+sGXsfl_43_idx ;
      cmbPrdOkotex.setInternalname( sPrefix+"PRDOKOTEX_"+sGXsfl_43_idx );
      edtPrdHm_Internalname = sPrefix+"PRDHM_"+sGXsfl_43_idx ;
      cmbPrdZDHC.setInternalname( sPrefix+"PRDZDHC_"+sGXsfl_43_idx );
      cmbPrdList.setInternalname( sPrefix+"PRDLIST_"+sGXsfl_43_idx );
      edtPrdTHELIST_Internalname = sPrefix+"PRDTHELIST_"+sGXsfl_43_idx ;
      cmbPrdGRS.setInternalname( sPrefix+"PRDGRS_"+sGXsfl_43_idx );
      edtPrdHS_Internalname = sPrefix+"PRDHS_"+sGXsfl_43_idx ;
      edtPrdFHS_Internalname = sPrefix+"PRDFHS_"+sGXsfl_43_idx ;
      edtPrdNum2_Internalname = sPrefix+"PRDNUM2_"+sGXsfl_43_idx ;
      edtPrdNom2_Internalname = sPrefix+"PRDNOM2_"+sGXsfl_43_idx ;
      edtPrdRefPrv_Internalname = sPrefix+"PRDREFPRV_"+sGXsfl_43_idx ;
      edtPrdFuncion_Internalname = sPrefix+"PRDFUNCION_"+sGXsfl_43_idx ;
      edtPrdEINECS_Internalname = sPrefix+"PRDEINECS_"+sGXsfl_43_idx ;
      edtPrdNCAS_Internalname = sPrefix+"PRDNCAS_"+sGXsfl_43_idx ;
      edtPrvNum_Internalname = sPrefix+"PRVNUM_"+sGXsfl_43_idx ;
      edtPrvNom_Internalname = sPrefix+"PRVNOM_"+sGXsfl_43_idx ;
   }

   public void subsflControlProps_fel_432( )
   {
      edtPrdNum_Internalname = sPrefix+"PRDNUM_"+sGXsfl_43_fel_idx ;
      edtPrdNom_Internalname = sPrefix+"PRDNOM_"+sGXsfl_43_fel_idx ;
      edtPrdExiAlm_Internalname = sPrefix+"PRDEXIALM_"+sGXsfl_43_fel_idx ;
      edtPrdCanRes_Internalname = sPrefix+"PRDCANRES_"+sGXsfl_43_fel_idx ;
      edtPrdDisponi_Internalname = sPrefix+"PRDDISPONI_"+sGXsfl_43_fel_idx ;
      edtPrdCanPen_Internalname = sPrefix+"PRDCANPEN_"+sGXsfl_43_fel_idx ;
      edtPrdPreAct_Internalname = sPrefix+"PRDPREACT_"+sGXsfl_43_fel_idx ;
      edtTipPrdDsc_Internalname = sPrefix+"TIPPRDDSC_"+sGXsfl_43_fel_idx ;
      edtValDsc_Internalname = sPrefix+"VALDSC_"+sGXsfl_43_fel_idx ;
      edtPrdRec_Internalname = sPrefix+"PRDREC_"+sGXsfl_43_fel_idx ;
      edtPrdAox_Internalname = sPrefix+"PRDAOX_"+sGXsfl_43_fel_idx ;
      edtPrdGots_Internalname = sPrefix+"PRDGOTS_"+sGXsfl_43_fel_idx ;
      edtPrdReach_Internalname = sPrefix+"PRDREACH_"+sGXsfl_43_fel_idx ;
      cmbPrdOkotex.setInternalname( sPrefix+"PRDOKOTEX_"+sGXsfl_43_fel_idx );
      edtPrdHm_Internalname = sPrefix+"PRDHM_"+sGXsfl_43_fel_idx ;
      cmbPrdZDHC.setInternalname( sPrefix+"PRDZDHC_"+sGXsfl_43_fel_idx );
      cmbPrdList.setInternalname( sPrefix+"PRDLIST_"+sGXsfl_43_fel_idx );
      edtPrdTHELIST_Internalname = sPrefix+"PRDTHELIST_"+sGXsfl_43_fel_idx ;
      cmbPrdGRS.setInternalname( sPrefix+"PRDGRS_"+sGXsfl_43_fel_idx );
      edtPrdHS_Internalname = sPrefix+"PRDHS_"+sGXsfl_43_fel_idx ;
      edtPrdFHS_Internalname = sPrefix+"PRDFHS_"+sGXsfl_43_fel_idx ;
      edtPrdNum2_Internalname = sPrefix+"PRDNUM2_"+sGXsfl_43_fel_idx ;
      edtPrdNom2_Internalname = sPrefix+"PRDNOM2_"+sGXsfl_43_fel_idx ;
      edtPrdRefPrv_Internalname = sPrefix+"PRDREFPRV_"+sGXsfl_43_fel_idx ;
      edtPrdFuncion_Internalname = sPrefix+"PRDFUNCION_"+sGXsfl_43_fel_idx ;
      edtPrdEINECS_Internalname = sPrefix+"PRDEINECS_"+sGXsfl_43_fel_idx ;
      edtPrdNCAS_Internalname = sPrefix+"PRDNCAS_"+sGXsfl_43_fel_idx ;
      edtPrvNum_Internalname = sPrefix+"PRVNUM_"+sGXsfl_43_fel_idx ;
      edtPrvNom_Internalname = sPrefix+"PRVNOM_"+sGXsfl_43_fel_idx ;
   }

   public void sendrow_432( )
   {
      subsflControlProps_432( ) ;
      wb1KX0( ) ;
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
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNom_Internalname,GXutil.rtrim( A718PrdNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdExiAlm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdExiAlm_Internalname,GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A704PrdExiAlm, "ZZZZZZ9.9999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdExiAlm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdExiAlm_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdCanRes_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdCanRes_Internalname,GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A685PrdCanRes, "ZZZZZZ9.9999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdCanRes_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdCanRes_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdDisponi_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdDisponi_Internalname,GXutil.ltrim( localUtil.ntoc( A13831PrdDisponi, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A13831PrdDisponi, "ZZZZZZ9.9999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdDisponi_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdDisponi_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdCanPen_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdCanPen_Internalname,GXutil.ltrim( localUtil.ntoc( A684PrdCanPen, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A684PrdCanPen, "ZZZZZZ9.9999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdCanPen_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdCanPen_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdPreAct_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdPreAct_Internalname,GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A724PrdPreAct, "ZZZZZZZ9.999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdPreAct_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdPreAct_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtTipPrdDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipPrdDsc_Internalname,GXutil.rtrim( A6302TipPrdDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTipPrdDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtTipPrdDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtValDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtValDsc_Internalname,GXutil.rtrim( A857ValDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtValDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtValDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdRec_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdRec_Internalname,GXutil.rtrim( A727PrdRec),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdRec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdRec_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdAox_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdAox_Internalname,GXutil.ltrim( localUtil.ntoc( A9733PrdAox, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A9733PrdAox, "ZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdAox_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdAox_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdGots_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdGots_Internalname,GXutil.rtrim( A11363PrdGots),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdGots_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdGots_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdReach_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdReach_Internalname,GXutil.rtrim( A5887PrdReach),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdReach_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdReach_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbPrdOkotex.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbPrdOkotex.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "PRDOKOTEX_" + sGXsfl_43_idx ;
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
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbPrdOkotex,cmbPrdOkotex.getInternalname(),GXutil.rtrim( A5888PrdOkotex),Integer.valueOf(1),cmbPrdOkotex.getJsonclick(),Integer.valueOf(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbPrdOkotex.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn hidden-xs","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbPrdOkotex.setValue( GXutil.rtrim( A5888PrdOkotex) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbPrdOkotex.getInternalname(), "Values", cmbPrdOkotex.ToJavascriptSource(), !bGXsfl_43_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdHm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdHm_Internalname,GXutil.rtrim( A11364PrdHm),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdHm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdHm_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbPrdZDHC.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbPrdZDHC.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "PRDZDHC_" + sGXsfl_43_idx ;
            cmbPrdZDHC.setName( GXCCtl );
            cmbPrdZDHC.setWebtags( "" );
            cmbPrdZDHC.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
            cmbPrdZDHC.addItem("1", httpContext.getMessage( "Nivel 1", ""), (short)(0));
            cmbPrdZDHC.addItem("2", httpContext.getMessage( "Nivel 2", ""), (short)(0));
            cmbPrdZDHC.addItem("3", httpContext.getMessage( "Nivel 3", ""), (short)(0));
            if ( cmbPrdZDHC.getItemCount() > 0 )
            {
               A13301PrdZDHC = cmbPrdZDHC.getValidValue(A13301PrdZDHC) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbPrdZDHC,cmbPrdZDHC.getInternalname(),GXutil.rtrim( A13301PrdZDHC),Integer.valueOf(1),cmbPrdZDHC.getJsonclick(),Integer.valueOf(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbPrdZDHC.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn hidden-xs","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbPrdZDHC.setValue( GXutil.rtrim( A13301PrdZDHC) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbPrdZDHC.getInternalname(), "Values", cmbPrdZDHC.ToJavascriptSource(), !bGXsfl_43_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbPrdList.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbPrdList.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "PRDLIST_" + sGXsfl_43_idx ;
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
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbPrdList,cmbPrdList.getInternalname(),GXutil.rtrim( A11687PrdList),Integer.valueOf(1),cmbPrdList.getJsonclick(),Integer.valueOf(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbPrdList.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn hidden-xs","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbPrdList.setValue( GXutil.rtrim( A11687PrdList) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbPrdList.getInternalname(), "Values", cmbPrdList.ToJavascriptSource(), !bGXsfl_43_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdTHELIST_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdTHELIST_Internalname,GXutil.rtrim( A13302PrdTHELIST),GXutil.rtrim( localUtil.format( A13302PrdTHELIST, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdTHELIST_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdTHELIST_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbPrdGRS.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbPrdGRS.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "PRDGRS_" + sGXsfl_43_idx ;
            cmbPrdGRS.setName( GXCCtl );
            cmbPrdGRS.setWebtags( "" );
            cmbPrdGRS.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
            cmbPrdGRS.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
            if ( cmbPrdGRS.getItemCount() > 0 )
            {
               A13974PrdGRS = cmbPrdGRS.getValidValue(A13974PrdGRS) ;
               n13974PrdGRS = false ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbPrdGRS,cmbPrdGRS.getInternalname(),GXutil.rtrim( A13974PrdGRS),Integer.valueOf(1),cmbPrdGRS.getJsonclick(),Integer.valueOf(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbPrdGRS.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbPrdGRS.setValue( GXutil.rtrim( A13974PrdGRS) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbPrdGRS.getInternalname(), "Values", cmbPrdGRS.ToJavascriptSource(), !bGXsfl_43_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdHS_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdHS_Internalname,GXutil.rtrim( A9741PrdHS),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdHS_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdHS_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdFHS_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdFHS_Internalname,localUtil.format(A9742PrdFHS, "99/99/99"),localUtil.format( A9742PrdFHS, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdFHS_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdFHS_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdNum2_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum2_Internalname,GXutil.rtrim( A4693PrdNum2),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdNum2_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdNom2_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNom2_Internalname,GXutil.rtrim( A4692PrdNom2),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdNom2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdNom2_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdRefPrv_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdRefPrv_Internalname,GXutil.rtrim( A728PrdRefPrv),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdRefPrv_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdRefPrv_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdFuncion_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdFuncion_Internalname,GXutil.rtrim( A11615PrdFuncion),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdFuncion_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdFuncion_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdEINECS_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdEINECS_Internalname,GXutil.rtrim( A11614PrdEINECS),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdEINECS_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdEINECS_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdNCAS_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNCAS_Internalname,GXutil.rtrim( A9734PrdNCAS),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdNCAS_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdNCAS_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrvNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvNum_Internalname,GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrvNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrvNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrvNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvNom_Internalname,GXutil.rtrim( A794PrvNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrvNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrvNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes1KX2( ) ;
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
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"43\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdExiAlm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Existencias Almacen", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdCanRes_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cantidad Reservada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdDisponi_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Disponible", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdCanPen_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pdte. Recibir", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdPreAct_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Precio Actual", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtTipPrdDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtValDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Validez", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdRec_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "R?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdAox_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "AOX", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdGots_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "GOTS", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdReach_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "REACH", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbPrdOkotex.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Oeko Tex", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdHm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "HM", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbPrdZDHC.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "ZDHC", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbPrdList.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "List by Inditex ", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdTHELIST_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "THELIST", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbPrdGRS.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "GRS", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdHS_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hoja?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdFHS_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdNum2_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdNom2_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "NOmbre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdRefPrv_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Referencia Proveedor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdFuncion_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Funcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdEINECS_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N EINECS", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdNCAS_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº CAS", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrvNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Proveedor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrvNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A719PrdNum));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A718PrdNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdExiAlm_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdCanRes_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13831PrdDisponi, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdDisponi_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A684PrdCanPen, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdCanPen_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdPreAct_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A6302TipPrdDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtTipPrdDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A857ValDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtValDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A727PrdRec));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdRec_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9733PrdAox, (byte)(6), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdAox_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11363PrdGots));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdGots_Visible, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11364PrdHm));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdHm_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13301PrdZDHC));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbPrdZDHC.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11687PrdList));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbPrdList.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13302PrdTHELIST));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdTHELIST_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13974PrdGRS));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbPrdGRS.getVisible(), (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4693PrdNum2));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdNum2_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4692PrdNom2));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdNom2_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A728PrdRefPrv));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdRefPrv_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11615PrdFuncion));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdFuncion_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11614PrdEINECS));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdEINECS_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A9734PrdNCAS));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdNCAS_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrvNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A794PrvNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrvNom_Visible, (byte)(5), (byte)(0), ".", "")));
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
      bttBtnexportreport_Internalname = sPrefix+"BTNEXPORTREPORT" ;
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtPrdNum_Internalname = sPrefix+"PRDNUM" ;
      edtPrdNom_Internalname = sPrefix+"PRDNOM" ;
      edtPrdExiAlm_Internalname = sPrefix+"PRDEXIALM" ;
      edtPrdCanRes_Internalname = sPrefix+"PRDCANRES" ;
      edtPrdDisponi_Internalname = sPrefix+"PRDDISPONI" ;
      edtPrdCanPen_Internalname = sPrefix+"PRDCANPEN" ;
      edtPrdPreAct_Internalname = sPrefix+"PRDPREACT" ;
      edtTipPrdDsc_Internalname = sPrefix+"TIPPRDDSC" ;
      edtValDsc_Internalname = sPrefix+"VALDSC" ;
      edtPrdRec_Internalname = sPrefix+"PRDREC" ;
      edtPrdAox_Internalname = sPrefix+"PRDAOX" ;
      edtPrdGots_Internalname = sPrefix+"PRDGOTS" ;
      edtPrdReach_Internalname = sPrefix+"PRDREACH" ;
      cmbPrdOkotex.setInternalname( sPrefix+"PRDOKOTEX" );
      edtPrdHm_Internalname = sPrefix+"PRDHM" ;
      cmbPrdZDHC.setInternalname( sPrefix+"PRDZDHC" );
      cmbPrdList.setInternalname( sPrefix+"PRDLIST" );
      edtPrdTHELIST_Internalname = sPrefix+"PRDTHELIST" ;
      cmbPrdGRS.setInternalname( sPrefix+"PRDGRS" );
      edtPrdHS_Internalname = sPrefix+"PRDHS" ;
      edtPrdFHS_Internalname = sPrefix+"PRDFHS" ;
      edtPrdNum2_Internalname = sPrefix+"PRDNUM2" ;
      edtPrdNom2_Internalname = sPrefix+"PRDNOM2" ;
      edtPrdRefPrv_Internalname = sPrefix+"PRDREFPRV" ;
      edtPrdFuncion_Internalname = sPrefix+"PRDFUNCION" ;
      edtPrdEINECS_Internalname = sPrefix+"PRDEINECS" ;
      edtPrdNCAS_Internalname = sPrefix+"PRDNCAS" ;
      edtPrvNum_Internalname = sPrefix+"PRVNUM" ;
      edtPrvNom_Internalname = sPrefix+"PRVNOM" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_titlescategories_Internalname = sPrefix+"GRID_TITLESCATEGORIES" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      edtavDdo_prdfhsauxdate_Internalname = sPrefix+"vDDO_PRDFHSAUXDATE" ;
      divDdo_prdfhsauxdates_Internalname = sPrefix+"DDO_PRDFHSAUXDATES" ;
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
      edtPrvNom_Jsonclick = "" ;
      edtPrvNum_Jsonclick = "" ;
      edtPrdNCAS_Jsonclick = "" ;
      edtPrdEINECS_Jsonclick = "" ;
      edtPrdFuncion_Jsonclick = "" ;
      edtPrdRefPrv_Jsonclick = "" ;
      edtPrdNom2_Jsonclick = "" ;
      edtPrdNum2_Jsonclick = "" ;
      edtPrdFHS_Jsonclick = "" ;
      edtPrdHS_Jsonclick = "" ;
      cmbPrdGRS.setJsonclick( "" );
      edtPrdTHELIST_Jsonclick = "" ;
      cmbPrdList.setJsonclick( "" );
      cmbPrdZDHC.setJsonclick( "" );
      edtPrdHm_Jsonclick = "" ;
      cmbPrdOkotex.setJsonclick( "" );
      edtPrdReach_Jsonclick = "" ;
      edtPrdGots_Jsonclick = "" ;
      edtPrdAox_Jsonclick = "" ;
      edtPrdRec_Jsonclick = "" ;
      edtValDsc_Jsonclick = "" ;
      edtTipPrdDsc_Jsonclick = "" ;
      edtPrdPreAct_Jsonclick = "" ;
      edtPrdCanPen_Jsonclick = "" ;
      edtPrdDisponi_Jsonclick = "" ;
      edtPrdCanRes_Jsonclick = "" ;
      edtPrdExiAlm_Jsonclick = "" ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNum_Jsonclick = "" ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtPrvNom_Visible = -1 ;
      edtPrvNum_Visible = -1 ;
      edtPrdNCAS_Visible = -1 ;
      edtPrdEINECS_Visible = -1 ;
      edtPrdFuncion_Visible = -1 ;
      edtPrdRefPrv_Visible = -1 ;
      edtPrdNom2_Visible = -1 ;
      edtPrdNum2_Visible = -1 ;
      edtPrdFHS_Visible = -1 ;
      edtPrdHS_Visible = -1 ;
      cmbPrdGRS.setVisible( -1 );
      edtPrdTHELIST_Visible = -1 ;
      cmbPrdList.setVisible( -1 );
      cmbPrdZDHC.setVisible( -1 );
      edtPrdHm_Visible = -1 ;
      cmbPrdOkotex.setVisible( -1 );
      edtPrdReach_Visible = -1 ;
      edtPrdGots_Visible = -1 ;
      edtPrdAox_Visible = -1 ;
      edtPrdRec_Visible = -1 ;
      edtValDsc_Visible = -1 ;
      edtTipPrdDsc_Visible = -1 ;
      edtPrdPreAct_Visible = -1 ;
      edtPrdCanPen_Visible = -1 ;
      edtPrdDisponi_Visible = -1 ;
      edtPrdCanRes_Visible = -1 ;
      edtPrdExiAlm_Visible = -1 ;
      edtPrdNom_Visible = -1 ;
      edtPrdNum_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_prdfhsauxdate_Jsonclick = "" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hascategories = GXutil.toBoolean( -1) ;
      Grid_titlescategories_Gridtitlescategories = ";;;;;;;;;;;;;;;;;;;Seguridad;Seguridad;Auxiliar;Auxiliar;;;;;;" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "StocksQuimicos.ListadodeProductos_WCGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "|||||||||||||N:N,S:S||N:N,1:Nivel 1,2:Nivel 2,3:Nivel 3|S:S,N:N||N:N,S:S||||||||||" ;
      Ddo_grid_Allowmultipleselection = "|||||||||||||T||T|T||T||||||||||" ;
      Ddo_grid_Datalisttype = "Dynamic|Dynamic||||||Dynamic|Dynamic|Dynamic||Dynamic|Dynamic|FixedValues|Dynamic|FixedValues|FixedValues|Dynamic|FixedValues|Dynamic||Dynamic|Dynamic|Dynamic|Dynamic|Dynamic|Dynamic||Dynamic" ;
      Ddo_grid_Includedatalist = "T|T||||||T|T|T||T|T|T|T|T|T|T|T|T||T|T|T|T|T|T||T" ;
      Ddo_grid_Filterisrange = "||T|T|T|T|T||||T|||||||||||||||||T|" ;
      Ddo_grid_Filtertype = "Character|Character|Numeric|Numeric|Numeric|Numeric|Numeric|Character|Character|Character|Numeric|Character|Character||Character|||Character||Character|Date|Character|Character|Character|Character|Character|Character|Numeric|Character" ;
      Ddo_grid_Includefilter = "T|T|T|T|T|T|T|T|T|T|T|T|T||T|||T||T|T|T|T|T|T|T|T|T|T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T|T|T||T|T|T|T|T||T|||||||T|||T|T|T|T|T|T|T|T" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4||5|6|7|8|9||10|||||||11|||12|13|14|15|16|17|18|19" ;
      Ddo_grid_Columnids = "0:PrdNum|1:PrdNom|2:PrdExiAlm|3:PrdCanRes|4:PrdDisponible|5:PrdCanPen|6:PrdPreAct|7:TipPrdDsc|8:ValDsc|9:PrdRec|10:PrdAox|11:PrdGots|12:PrdReach|13:PrdOkotex|14:PrdHm|15:PrdZDHC|16:PrdList|17:PrdTHELIST|18:PrdGRS|19:PrdHS|20:PrdFHS|21:PrdNum2|22:PrdNom2|23:PrdRefPrv|24:PrdFuncion|25:PrdEINECS|26:PrdNCAS|27:PrvNum|28:PrvNom" ;
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
      GXCCtl = "PRDOKOTEX_" + sGXsfl_43_idx ;
      cmbPrdOkotex.setName( GXCCtl );
      cmbPrdOkotex.setWebtags( "" );
      cmbPrdOkotex.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbPrdOkotex.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbPrdOkotex.getItemCount() > 0 )
      {
      }
      GXCCtl = "PRDZDHC_" + sGXsfl_43_idx ;
      cmbPrdZDHC.setName( GXCCtl );
      cmbPrdZDHC.setWebtags( "" );
      cmbPrdZDHC.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbPrdZDHC.addItem("1", httpContext.getMessage( "Nivel 1", ""), (short)(0));
      cmbPrdZDHC.addItem("2", httpContext.getMessage( "Nivel 2", ""), (short)(0));
      cmbPrdZDHC.addItem("3", httpContext.getMessage( "Nivel 3", ""), (short)(0));
      if ( cmbPrdZDHC.getItemCount() > 0 )
      {
      }
      GXCCtl = "PRDLIST_" + sGXsfl_43_idx ;
      cmbPrdList.setName( GXCCtl );
      cmbPrdList.setWebtags( "" );
      cmbPrdList.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      cmbPrdList.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      if ( cmbPrdList.getItemCount() > 0 )
      {
      }
      GXCCtl = "PRDGRS_" + sGXsfl_43_idx ;
      cmbPrdGRS.setName( GXCCtl );
      cmbPrdGRS.setWebtags( "" );
      cmbPrdGRS.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbPrdGRS.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbPrdGRS.getItemCount() > 0 )
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV34emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV35PrdNumfrom',fld:'vPRDNUMFROM',pic:''},{av:'AV36PrdnumTo',fld:'vPRDNUMTO',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV28TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV29TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV37TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV38TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV39TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV40TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV91TFPrdDisponible',fld:'vTFPRDDISPONIBLE',pic:'ZZZZZZ9.9999'},{av:'AV92TFPrdDisponible_To',fld:'vTFPRDDISPONIBLE_TO',pic:'ZZZZZZ9.9999'},{av:'AV41TFPrdCanPen',fld:'vTFPRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'AV42TFPrdCanPen_To',fld:'vTFPRDCANPEN_TO',pic:'ZZZZZZ9.9999'},{av:'AV43TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV44TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV45TFTipPrdDsc',fld:'vTFTIPPRDDSC',pic:''},{av:'AV46TFTipPrdDsc_Sel',fld:'vTFTIPPRDDSC_SEL',pic:''},{av:'AV47TFValDsc',fld:'vTFVALDSC',pic:''},{av:'AV48TFValDsc_Sel',fld:'vTFVALDSC_SEL',pic:''},{av:'AV49TFPrdRec',fld:'vTFPRDREC',pic:''},{av:'AV50TFPrdRec_Sel',fld:'vTFPRDREC_SEL',pic:''},{av:'AV51TFPrdAox',fld:'vTFPRDAOX',pic:'ZZ9.99'},{av:'AV52TFPrdAox_To',fld:'vTFPRDAOX_TO',pic:'ZZ9.99'},{av:'AV53TFPrdGots',fld:'vTFPRDGOTS',pic:''},{av:'AV54TFPrdGots_Sel',fld:'vTFPRDGOTS_SEL',pic:''},{av:'AV55TFPrdReach',fld:'vTFPRDREACH',pic:''},{av:'AV56TFPrdReach_Sel',fld:'vTFPRDREACH_SEL',pic:''},{av:'AV58TFPrdOkotex_Sels',fld:'vTFPRDOKOTEX_SELS',pic:''},{av:'AV59TFPrdHm',fld:'vTFPRDHM',pic:''},{av:'AV60TFPrdHm_Sel',fld:'vTFPRDHM_SEL',pic:''},{av:'AV62TFPrdZDHC_Sels',fld:'vTFPRDZDHC_SELS',pic:''},{av:'AV64TFPrdList_Sels',fld:'vTFPRDLIST_SELS',pic:''},{av:'AV65TFPrdTHELIST',fld:'vTFPRDTHELIST',pic:'@!'},{av:'AV66TFPrdTHELIST_Sel',fld:'vTFPRDTHELIST_SEL',pic:'@!'},{av:'AV68TFPrdGRS_Sels',fld:'vTFPRDGRS_SELS',pic:''},{av:'AV69TFPrdHS',fld:'vTFPRDHS',pic:''},{av:'AV70TFPrdHS_Sel',fld:'vTFPRDHS_SEL',pic:''},{av:'AV71TFPrdFHS',fld:'vTFPRDFHS',pic:''},{av:'AV75TFPrdNum2',fld:'vTFPRDNUM2',pic:''},{av:'AV76TFPrdNum2_Sel',fld:'vTFPRDNUM2_SEL',pic:''},{av:'AV77TFPrdNom2',fld:'vTFPRDNOM2',pic:''},{av:'AV78TFPrdNom2_Sel',fld:'vTFPRDNOM2_SEL',pic:''},{av:'AV79TFPrdRefPrv',fld:'vTFPRDREFPRV',pic:''},{av:'AV80TFPrdRefPrv_Sel',fld:'vTFPRDREFPRV_SEL',pic:''},{av:'AV81TFPrdFuncion',fld:'vTFPRDFUNCION',pic:''},{av:'AV82TFPrdFuncion_Sel',fld:'vTFPRDFUNCION_SEL',pic:''},{av:'AV83TFPrdEINECS',fld:'vTFPRDEINECS',pic:''},{av:'AV84TFPrdEINECS_Sel',fld:'vTFPRDEINECS_SEL',pic:''},{av:'AV85TFPrdNCAS',fld:'vTFPRDNCAS',pic:''},{av:'AV86TFPrdNCAS_Sel',fld:'vTFPRDNCAS_SEL',pic:''},{av:'AV87TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV88TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV89TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV90TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV95Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtPrdExiAlm_Visible',ctrl:'PRDEXIALM',prop:'Visible'},{av:'edtPrdCanRes_Visible',ctrl:'PRDCANRES',prop:'Visible'},{av:'edtPrdDisponi_Visible',ctrl:'PRDDISPONI',prop:'Visible'},{av:'edtPrdCanPen_Visible',ctrl:'PRDCANPEN',prop:'Visible'},{av:'edtPrdPreAct_Visible',ctrl:'PRDPREACT',prop:'Visible'},{av:'edtTipPrdDsc_Visible',ctrl:'TIPPRDDSC',prop:'Visible'},{av:'edtValDsc_Visible',ctrl:'VALDSC',prop:'Visible'},{av:'edtPrdRec_Visible',ctrl:'PRDREC',prop:'Visible'},{av:'edtPrdAox_Visible',ctrl:'PRDAOX',prop:'Visible'},{av:'edtPrdGots_Visible',ctrl:'PRDGOTS',prop:'Visible'},{av:'edtPrdReach_Visible',ctrl:'PRDREACH',prop:'Visible'},{av:'cmbPrdOkotex'},{av:'edtPrdHm_Visible',ctrl:'PRDHM',prop:'Visible'},{av:'cmbPrdZDHC'},{av:'cmbPrdList'},{av:'edtPrdTHELIST_Visible',ctrl:'PRDTHELIST',prop:'Visible'},{av:'cmbPrdGRS'},{av:'edtPrdHS_Visible',ctrl:'PRDHS',prop:'Visible'},{av:'edtPrdFHS_Visible',ctrl:'PRDFHS',prop:'Visible'},{av:'edtPrdNum2_Visible',ctrl:'PRDNUM2',prop:'Visible'},{av:'edtPrdNom2_Visible',ctrl:'PRDNOM2',prop:'Visible'},{av:'edtPrdRefPrv_Visible',ctrl:'PRDREFPRV',prop:'Visible'},{av:'edtPrdFuncion_Visible',ctrl:'PRDFUNCION',prop:'Visible'},{av:'edtPrdEINECS_Visible',ctrl:'PRDEINECS',prop:'Visible'},{av:'edtPrdNCAS_Visible',ctrl:'PRDNCAS',prop:'Visible'},{av:'edtPrvNum_Visible',ctrl:'PRVNUM',prop:'Visible'},{av:'edtPrvNom_Visible',ctrl:'PRVNOM',prop:'Visible'},{av:'AV32GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV33GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e121KX2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV34emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV35PrdNumfrom',fld:'vPRDNUMFROM',pic:''},{av:'AV36PrdnumTo',fld:'vPRDNUMTO',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV28TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV29TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV37TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV38TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV39TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV40TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV91TFPrdDisponible',fld:'vTFPRDDISPONIBLE',pic:'ZZZZZZ9.9999'},{av:'AV92TFPrdDisponible_To',fld:'vTFPRDDISPONIBLE_TO',pic:'ZZZZZZ9.9999'},{av:'AV41TFPrdCanPen',fld:'vTFPRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'AV42TFPrdCanPen_To',fld:'vTFPRDCANPEN_TO',pic:'ZZZZZZ9.9999'},{av:'AV43TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV44TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV45TFTipPrdDsc',fld:'vTFTIPPRDDSC',pic:''},{av:'AV46TFTipPrdDsc_Sel',fld:'vTFTIPPRDDSC_SEL',pic:''},{av:'AV47TFValDsc',fld:'vTFVALDSC',pic:''},{av:'AV48TFValDsc_Sel',fld:'vTFVALDSC_SEL',pic:''},{av:'AV49TFPrdRec',fld:'vTFPRDREC',pic:''},{av:'AV50TFPrdRec_Sel',fld:'vTFPRDREC_SEL',pic:''},{av:'AV51TFPrdAox',fld:'vTFPRDAOX',pic:'ZZ9.99'},{av:'AV52TFPrdAox_To',fld:'vTFPRDAOX_TO',pic:'ZZ9.99'},{av:'AV53TFPrdGots',fld:'vTFPRDGOTS',pic:''},{av:'AV54TFPrdGots_Sel',fld:'vTFPRDGOTS_SEL',pic:''},{av:'AV55TFPrdReach',fld:'vTFPRDREACH',pic:''},{av:'AV56TFPrdReach_Sel',fld:'vTFPRDREACH_SEL',pic:''},{av:'AV58TFPrdOkotex_Sels',fld:'vTFPRDOKOTEX_SELS',pic:''},{av:'AV59TFPrdHm',fld:'vTFPRDHM',pic:''},{av:'AV60TFPrdHm_Sel',fld:'vTFPRDHM_SEL',pic:''},{av:'AV62TFPrdZDHC_Sels',fld:'vTFPRDZDHC_SELS',pic:''},{av:'AV64TFPrdList_Sels',fld:'vTFPRDLIST_SELS',pic:''},{av:'AV65TFPrdTHELIST',fld:'vTFPRDTHELIST',pic:'@!'},{av:'AV66TFPrdTHELIST_Sel',fld:'vTFPRDTHELIST_SEL',pic:'@!'},{av:'AV68TFPrdGRS_Sels',fld:'vTFPRDGRS_SELS',pic:''},{av:'AV69TFPrdHS',fld:'vTFPRDHS',pic:''},{av:'AV70TFPrdHS_Sel',fld:'vTFPRDHS_SEL',pic:''},{av:'AV71TFPrdFHS',fld:'vTFPRDFHS',pic:''},{av:'AV75TFPrdNum2',fld:'vTFPRDNUM2',pic:''},{av:'AV76TFPrdNum2_Sel',fld:'vTFPRDNUM2_SEL',pic:''},{av:'AV77TFPrdNom2',fld:'vTFPRDNOM2',pic:''},{av:'AV78TFPrdNom2_Sel',fld:'vTFPRDNOM2_SEL',pic:''},{av:'AV79TFPrdRefPrv',fld:'vTFPRDREFPRV',pic:''},{av:'AV80TFPrdRefPrv_Sel',fld:'vTFPRDREFPRV_SEL',pic:''},{av:'AV81TFPrdFuncion',fld:'vTFPRDFUNCION',pic:''},{av:'AV82TFPrdFuncion_Sel',fld:'vTFPRDFUNCION_SEL',pic:''},{av:'AV83TFPrdEINECS',fld:'vTFPRDEINECS',pic:''},{av:'AV84TFPrdEINECS_Sel',fld:'vTFPRDEINECS_SEL',pic:''},{av:'AV85TFPrdNCAS',fld:'vTFPRDNCAS',pic:''},{av:'AV86TFPrdNCAS_Sel',fld:'vTFPRDNCAS_SEL',pic:''},{av:'AV87TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV88TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV89TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV90TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV95Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e131KX2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV34emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV35PrdNumfrom',fld:'vPRDNUMFROM',pic:''},{av:'AV36PrdnumTo',fld:'vPRDNUMTO',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV28TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV29TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV37TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV38TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV39TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV40TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV91TFPrdDisponible',fld:'vTFPRDDISPONIBLE',pic:'ZZZZZZ9.9999'},{av:'AV92TFPrdDisponible_To',fld:'vTFPRDDISPONIBLE_TO',pic:'ZZZZZZ9.9999'},{av:'AV41TFPrdCanPen',fld:'vTFPRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'AV42TFPrdCanPen_To',fld:'vTFPRDCANPEN_TO',pic:'ZZZZZZ9.9999'},{av:'AV43TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV44TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV45TFTipPrdDsc',fld:'vTFTIPPRDDSC',pic:''},{av:'AV46TFTipPrdDsc_Sel',fld:'vTFTIPPRDDSC_SEL',pic:''},{av:'AV47TFValDsc',fld:'vTFVALDSC',pic:''},{av:'AV48TFValDsc_Sel',fld:'vTFVALDSC_SEL',pic:''},{av:'AV49TFPrdRec',fld:'vTFPRDREC',pic:''},{av:'AV50TFPrdRec_Sel',fld:'vTFPRDREC_SEL',pic:''},{av:'AV51TFPrdAox',fld:'vTFPRDAOX',pic:'ZZ9.99'},{av:'AV52TFPrdAox_To',fld:'vTFPRDAOX_TO',pic:'ZZ9.99'},{av:'AV53TFPrdGots',fld:'vTFPRDGOTS',pic:''},{av:'AV54TFPrdGots_Sel',fld:'vTFPRDGOTS_SEL',pic:''},{av:'AV55TFPrdReach',fld:'vTFPRDREACH',pic:''},{av:'AV56TFPrdReach_Sel',fld:'vTFPRDREACH_SEL',pic:''},{av:'AV58TFPrdOkotex_Sels',fld:'vTFPRDOKOTEX_SELS',pic:''},{av:'AV59TFPrdHm',fld:'vTFPRDHM',pic:''},{av:'AV60TFPrdHm_Sel',fld:'vTFPRDHM_SEL',pic:''},{av:'AV62TFPrdZDHC_Sels',fld:'vTFPRDZDHC_SELS',pic:''},{av:'AV64TFPrdList_Sels',fld:'vTFPRDLIST_SELS',pic:''},{av:'AV65TFPrdTHELIST',fld:'vTFPRDTHELIST',pic:'@!'},{av:'AV66TFPrdTHELIST_Sel',fld:'vTFPRDTHELIST_SEL',pic:'@!'},{av:'AV68TFPrdGRS_Sels',fld:'vTFPRDGRS_SELS',pic:''},{av:'AV69TFPrdHS',fld:'vTFPRDHS',pic:''},{av:'AV70TFPrdHS_Sel',fld:'vTFPRDHS_SEL',pic:''},{av:'AV71TFPrdFHS',fld:'vTFPRDFHS',pic:''},{av:'AV75TFPrdNum2',fld:'vTFPRDNUM2',pic:''},{av:'AV76TFPrdNum2_Sel',fld:'vTFPRDNUM2_SEL',pic:''},{av:'AV77TFPrdNom2',fld:'vTFPRDNOM2',pic:''},{av:'AV78TFPrdNom2_Sel',fld:'vTFPRDNOM2_SEL',pic:''},{av:'AV79TFPrdRefPrv',fld:'vTFPRDREFPRV',pic:''},{av:'AV80TFPrdRefPrv_Sel',fld:'vTFPRDREFPRV_SEL',pic:''},{av:'AV81TFPrdFuncion',fld:'vTFPRDFUNCION',pic:''},{av:'AV82TFPrdFuncion_Sel',fld:'vTFPRDFUNCION_SEL',pic:''},{av:'AV83TFPrdEINECS',fld:'vTFPRDEINECS',pic:''},{av:'AV84TFPrdEINECS_Sel',fld:'vTFPRDEINECS_SEL',pic:''},{av:'AV85TFPrdNCAS',fld:'vTFPRDNCAS',pic:''},{av:'AV86TFPrdNCAS_Sel',fld:'vTFPRDNCAS_SEL',pic:''},{av:'AV87TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV88TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV89TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV90TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV95Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e141KX2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV34emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV35PrdNumfrom',fld:'vPRDNUMFROM',pic:''},{av:'AV36PrdnumTo',fld:'vPRDNUMTO',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV28TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV29TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV37TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV38TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV39TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV40TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV91TFPrdDisponible',fld:'vTFPRDDISPONIBLE',pic:'ZZZZZZ9.9999'},{av:'AV92TFPrdDisponible_To',fld:'vTFPRDDISPONIBLE_TO',pic:'ZZZZZZ9.9999'},{av:'AV41TFPrdCanPen',fld:'vTFPRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'AV42TFPrdCanPen_To',fld:'vTFPRDCANPEN_TO',pic:'ZZZZZZ9.9999'},{av:'AV43TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV44TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV45TFTipPrdDsc',fld:'vTFTIPPRDDSC',pic:''},{av:'AV46TFTipPrdDsc_Sel',fld:'vTFTIPPRDDSC_SEL',pic:''},{av:'AV47TFValDsc',fld:'vTFVALDSC',pic:''},{av:'AV48TFValDsc_Sel',fld:'vTFVALDSC_SEL',pic:''},{av:'AV49TFPrdRec',fld:'vTFPRDREC',pic:''},{av:'AV50TFPrdRec_Sel',fld:'vTFPRDREC_SEL',pic:''},{av:'AV51TFPrdAox',fld:'vTFPRDAOX',pic:'ZZ9.99'},{av:'AV52TFPrdAox_To',fld:'vTFPRDAOX_TO',pic:'ZZ9.99'},{av:'AV53TFPrdGots',fld:'vTFPRDGOTS',pic:''},{av:'AV54TFPrdGots_Sel',fld:'vTFPRDGOTS_SEL',pic:''},{av:'AV55TFPrdReach',fld:'vTFPRDREACH',pic:''},{av:'AV56TFPrdReach_Sel',fld:'vTFPRDREACH_SEL',pic:''},{av:'AV58TFPrdOkotex_Sels',fld:'vTFPRDOKOTEX_SELS',pic:''},{av:'AV59TFPrdHm',fld:'vTFPRDHM',pic:''},{av:'AV60TFPrdHm_Sel',fld:'vTFPRDHM_SEL',pic:''},{av:'AV62TFPrdZDHC_Sels',fld:'vTFPRDZDHC_SELS',pic:''},{av:'AV64TFPrdList_Sels',fld:'vTFPRDLIST_SELS',pic:''},{av:'AV65TFPrdTHELIST',fld:'vTFPRDTHELIST',pic:'@!'},{av:'AV66TFPrdTHELIST_Sel',fld:'vTFPRDTHELIST_SEL',pic:'@!'},{av:'AV68TFPrdGRS_Sels',fld:'vTFPRDGRS_SELS',pic:''},{av:'AV69TFPrdHS',fld:'vTFPRDHS',pic:''},{av:'AV70TFPrdHS_Sel',fld:'vTFPRDHS_SEL',pic:''},{av:'AV71TFPrdFHS',fld:'vTFPRDFHS',pic:''},{av:'AV75TFPrdNum2',fld:'vTFPRDNUM2',pic:''},{av:'AV76TFPrdNum2_Sel',fld:'vTFPRDNUM2_SEL',pic:''},{av:'AV77TFPrdNom2',fld:'vTFPRDNOM2',pic:''},{av:'AV78TFPrdNom2_Sel',fld:'vTFPRDNOM2_SEL',pic:''},{av:'AV79TFPrdRefPrv',fld:'vTFPRDREFPRV',pic:''},{av:'AV80TFPrdRefPrv_Sel',fld:'vTFPRDREFPRV_SEL',pic:''},{av:'AV81TFPrdFuncion',fld:'vTFPRDFUNCION',pic:''},{av:'AV82TFPrdFuncion_Sel',fld:'vTFPRDFUNCION_SEL',pic:''},{av:'AV83TFPrdEINECS',fld:'vTFPRDEINECS',pic:''},{av:'AV84TFPrdEINECS_Sel',fld:'vTFPRDEINECS_SEL',pic:''},{av:'AV85TFPrdNCAS',fld:'vTFPRDNCAS',pic:''},{av:'AV86TFPrdNCAS_Sel',fld:'vTFPRDNCAS_SEL',pic:''},{av:'AV87TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV88TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV89TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV90TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV95Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV89TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV90TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV87TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV88TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV85TFPrdNCAS',fld:'vTFPRDNCAS',pic:''},{av:'AV86TFPrdNCAS_Sel',fld:'vTFPRDNCAS_SEL',pic:''},{av:'AV83TFPrdEINECS',fld:'vTFPRDEINECS',pic:''},{av:'AV84TFPrdEINECS_Sel',fld:'vTFPRDEINECS_SEL',pic:''},{av:'AV81TFPrdFuncion',fld:'vTFPRDFUNCION',pic:''},{av:'AV82TFPrdFuncion_Sel',fld:'vTFPRDFUNCION_SEL',pic:''},{av:'AV79TFPrdRefPrv',fld:'vTFPRDREFPRV',pic:''},{av:'AV80TFPrdRefPrv_Sel',fld:'vTFPRDREFPRV_SEL',pic:''},{av:'AV77TFPrdNom2',fld:'vTFPRDNOM2',pic:''},{av:'AV78TFPrdNom2_Sel',fld:'vTFPRDNOM2_SEL',pic:''},{av:'AV75TFPrdNum2',fld:'vTFPRDNUM2',pic:''},{av:'AV76TFPrdNum2_Sel',fld:'vTFPRDNUM2_SEL',pic:''},{av:'AV71TFPrdFHS',fld:'vTFPRDFHS',pic:''},{av:'AV69TFPrdHS',fld:'vTFPRDHS',pic:''},{av:'AV70TFPrdHS_Sel',fld:'vTFPRDHS_SEL',pic:''},{av:'AV67TFPrdGRS_SelsJson',fld:'vTFPRDGRS_SELSJSON',pic:''},{av:'AV68TFPrdGRS_Sels',fld:'vTFPRDGRS_SELS',pic:''},{av:'AV65TFPrdTHELIST',fld:'vTFPRDTHELIST',pic:'@!'},{av:'AV66TFPrdTHELIST_Sel',fld:'vTFPRDTHELIST_SEL',pic:'@!'},{av:'AV63TFPrdList_SelsJson',fld:'vTFPRDLIST_SELSJSON',pic:''},{av:'AV64TFPrdList_Sels',fld:'vTFPRDLIST_SELS',pic:''},{av:'AV61TFPrdZDHC_SelsJson',fld:'vTFPRDZDHC_SELSJSON',pic:''},{av:'AV62TFPrdZDHC_Sels',fld:'vTFPRDZDHC_SELS',pic:''},{av:'AV59TFPrdHm',fld:'vTFPRDHM',pic:''},{av:'AV60TFPrdHm_Sel',fld:'vTFPRDHM_SEL',pic:''},{av:'AV57TFPrdOkotex_SelsJson',fld:'vTFPRDOKOTEX_SELSJSON',pic:''},{av:'AV58TFPrdOkotex_Sels',fld:'vTFPRDOKOTEX_SELS',pic:''},{av:'AV55TFPrdReach',fld:'vTFPRDREACH',pic:''},{av:'AV56TFPrdReach_Sel',fld:'vTFPRDREACH_SEL',pic:''},{av:'AV53TFPrdGots',fld:'vTFPRDGOTS',pic:''},{av:'AV54TFPrdGots_Sel',fld:'vTFPRDGOTS_SEL',pic:''},{av:'AV51TFPrdAox',fld:'vTFPRDAOX',pic:'ZZ9.99'},{av:'AV52TFPrdAox_To',fld:'vTFPRDAOX_TO',pic:'ZZ9.99'},{av:'AV49TFPrdRec',fld:'vTFPRDREC',pic:''},{av:'AV50TFPrdRec_Sel',fld:'vTFPRDREC_SEL',pic:''},{av:'AV47TFValDsc',fld:'vTFVALDSC',pic:''},{av:'AV48TFValDsc_Sel',fld:'vTFVALDSC_SEL',pic:''},{av:'AV45TFTipPrdDsc',fld:'vTFTIPPRDDSC',pic:''},{av:'AV46TFTipPrdDsc_Sel',fld:'vTFTIPPRDDSC_SEL',pic:''},{av:'AV43TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV44TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV41TFPrdCanPen',fld:'vTFPRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'AV42TFPrdCanPen_To',fld:'vTFPRDCANPEN_TO',pic:'ZZZZZZ9.9999'},{av:'AV91TFPrdDisponible',fld:'vTFPRDDISPONIBLE',pic:'ZZZZZZ9.9999'},{av:'AV92TFPrdDisponible_To',fld:'vTFPRDDISPONIBLE_TO',pic:'ZZZZZZ9.9999'},{av:'AV39TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV40TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV37TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV38TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV28TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV29TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e211KX2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e151KX2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV34emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV35PrdNumfrom',fld:'vPRDNUMFROM',pic:''},{av:'AV36PrdnumTo',fld:'vPRDNUMTO',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV28TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV29TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV37TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV38TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV39TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV40TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV91TFPrdDisponible',fld:'vTFPRDDISPONIBLE',pic:'ZZZZZZ9.9999'},{av:'AV92TFPrdDisponible_To',fld:'vTFPRDDISPONIBLE_TO',pic:'ZZZZZZ9.9999'},{av:'AV41TFPrdCanPen',fld:'vTFPRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'AV42TFPrdCanPen_To',fld:'vTFPRDCANPEN_TO',pic:'ZZZZZZ9.9999'},{av:'AV43TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV44TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV45TFTipPrdDsc',fld:'vTFTIPPRDDSC',pic:''},{av:'AV46TFTipPrdDsc_Sel',fld:'vTFTIPPRDDSC_SEL',pic:''},{av:'AV47TFValDsc',fld:'vTFVALDSC',pic:''},{av:'AV48TFValDsc_Sel',fld:'vTFVALDSC_SEL',pic:''},{av:'AV49TFPrdRec',fld:'vTFPRDREC',pic:''},{av:'AV50TFPrdRec_Sel',fld:'vTFPRDREC_SEL',pic:''},{av:'AV51TFPrdAox',fld:'vTFPRDAOX',pic:'ZZ9.99'},{av:'AV52TFPrdAox_To',fld:'vTFPRDAOX_TO',pic:'ZZ9.99'},{av:'AV53TFPrdGots',fld:'vTFPRDGOTS',pic:''},{av:'AV54TFPrdGots_Sel',fld:'vTFPRDGOTS_SEL',pic:''},{av:'AV55TFPrdReach',fld:'vTFPRDREACH',pic:''},{av:'AV56TFPrdReach_Sel',fld:'vTFPRDREACH_SEL',pic:''},{av:'AV58TFPrdOkotex_Sels',fld:'vTFPRDOKOTEX_SELS',pic:''},{av:'AV59TFPrdHm',fld:'vTFPRDHM',pic:''},{av:'AV60TFPrdHm_Sel',fld:'vTFPRDHM_SEL',pic:''},{av:'AV62TFPrdZDHC_Sels',fld:'vTFPRDZDHC_SELS',pic:''},{av:'AV64TFPrdList_Sels',fld:'vTFPRDLIST_SELS',pic:''},{av:'AV65TFPrdTHELIST',fld:'vTFPRDTHELIST',pic:'@!'},{av:'AV66TFPrdTHELIST_Sel',fld:'vTFPRDTHELIST_SEL',pic:'@!'},{av:'AV68TFPrdGRS_Sels',fld:'vTFPRDGRS_SELS',pic:''},{av:'AV69TFPrdHS',fld:'vTFPRDHS',pic:''},{av:'AV70TFPrdHS_Sel',fld:'vTFPRDHS_SEL',pic:''},{av:'AV71TFPrdFHS',fld:'vTFPRDFHS',pic:''},{av:'AV75TFPrdNum2',fld:'vTFPRDNUM2',pic:''},{av:'AV76TFPrdNum2_Sel',fld:'vTFPRDNUM2_SEL',pic:''},{av:'AV77TFPrdNom2',fld:'vTFPRDNOM2',pic:''},{av:'AV78TFPrdNom2_Sel',fld:'vTFPRDNOM2_SEL',pic:''},{av:'AV79TFPrdRefPrv',fld:'vTFPRDREFPRV',pic:''},{av:'AV80TFPrdRefPrv_Sel',fld:'vTFPRDREFPRV_SEL',pic:''},{av:'AV81TFPrdFuncion',fld:'vTFPRDFUNCION',pic:''},{av:'AV82TFPrdFuncion_Sel',fld:'vTFPRDFUNCION_SEL',pic:''},{av:'AV83TFPrdEINECS',fld:'vTFPRDEINECS',pic:''},{av:'AV84TFPrdEINECS_Sel',fld:'vTFPRDEINECS_SEL',pic:''},{av:'AV85TFPrdNCAS',fld:'vTFPRDNCAS',pic:''},{av:'AV86TFPrdNCAS_Sel',fld:'vTFPRDNCAS_SEL',pic:''},{av:'AV87TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV88TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV89TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV90TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV95Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtPrdExiAlm_Visible',ctrl:'PRDEXIALM',prop:'Visible'},{av:'edtPrdCanRes_Visible',ctrl:'PRDCANRES',prop:'Visible'},{av:'edtPrdDisponi_Visible',ctrl:'PRDDISPONI',prop:'Visible'},{av:'edtPrdCanPen_Visible',ctrl:'PRDCANPEN',prop:'Visible'},{av:'edtPrdPreAct_Visible',ctrl:'PRDPREACT',prop:'Visible'},{av:'edtTipPrdDsc_Visible',ctrl:'TIPPRDDSC',prop:'Visible'},{av:'edtValDsc_Visible',ctrl:'VALDSC',prop:'Visible'},{av:'edtPrdRec_Visible',ctrl:'PRDREC',prop:'Visible'},{av:'edtPrdAox_Visible',ctrl:'PRDAOX',prop:'Visible'},{av:'edtPrdGots_Visible',ctrl:'PRDGOTS',prop:'Visible'},{av:'edtPrdReach_Visible',ctrl:'PRDREACH',prop:'Visible'},{av:'cmbPrdOkotex'},{av:'edtPrdHm_Visible',ctrl:'PRDHM',prop:'Visible'},{av:'cmbPrdZDHC'},{av:'cmbPrdList'},{av:'edtPrdTHELIST_Visible',ctrl:'PRDTHELIST',prop:'Visible'},{av:'cmbPrdGRS'},{av:'edtPrdHS_Visible',ctrl:'PRDHS',prop:'Visible'},{av:'edtPrdFHS_Visible',ctrl:'PRDFHS',prop:'Visible'},{av:'edtPrdNum2_Visible',ctrl:'PRDNUM2',prop:'Visible'},{av:'edtPrdNom2_Visible',ctrl:'PRDNOM2',prop:'Visible'},{av:'edtPrdRefPrv_Visible',ctrl:'PRDREFPRV',prop:'Visible'},{av:'edtPrdFuncion_Visible',ctrl:'PRDFUNCION',prop:'Visible'},{av:'edtPrdEINECS_Visible',ctrl:'PRDEINECS',prop:'Visible'},{av:'edtPrdNCAS_Visible',ctrl:'PRDNCAS',prop:'Visible'},{av:'edtPrvNum_Visible',ctrl:'PRVNUM',prop:'Visible'},{av:'edtPrvNom_Visible',ctrl:'PRVNOM',prop:'Visible'},{av:'AV32GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV33GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e111KX2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV34emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV35PrdNumfrom',fld:'vPRDNUMFROM',pic:''},{av:'AV36PrdnumTo',fld:'vPRDNUMTO',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV28TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV29TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV37TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV38TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV39TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV40TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV91TFPrdDisponible',fld:'vTFPRDDISPONIBLE',pic:'ZZZZZZ9.9999'},{av:'AV92TFPrdDisponible_To',fld:'vTFPRDDISPONIBLE_TO',pic:'ZZZZZZ9.9999'},{av:'AV41TFPrdCanPen',fld:'vTFPRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'AV42TFPrdCanPen_To',fld:'vTFPRDCANPEN_TO',pic:'ZZZZZZ9.9999'},{av:'AV43TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV44TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV45TFTipPrdDsc',fld:'vTFTIPPRDDSC',pic:''},{av:'AV46TFTipPrdDsc_Sel',fld:'vTFTIPPRDDSC_SEL',pic:''},{av:'AV47TFValDsc',fld:'vTFVALDSC',pic:''},{av:'AV48TFValDsc_Sel',fld:'vTFVALDSC_SEL',pic:''},{av:'AV49TFPrdRec',fld:'vTFPRDREC',pic:''},{av:'AV50TFPrdRec_Sel',fld:'vTFPRDREC_SEL',pic:''},{av:'AV51TFPrdAox',fld:'vTFPRDAOX',pic:'ZZ9.99'},{av:'AV52TFPrdAox_To',fld:'vTFPRDAOX_TO',pic:'ZZ9.99'},{av:'AV53TFPrdGots',fld:'vTFPRDGOTS',pic:''},{av:'AV54TFPrdGots_Sel',fld:'vTFPRDGOTS_SEL',pic:''},{av:'AV55TFPrdReach',fld:'vTFPRDREACH',pic:''},{av:'AV56TFPrdReach_Sel',fld:'vTFPRDREACH_SEL',pic:''},{av:'AV58TFPrdOkotex_Sels',fld:'vTFPRDOKOTEX_SELS',pic:''},{av:'AV59TFPrdHm',fld:'vTFPRDHM',pic:''},{av:'AV60TFPrdHm_Sel',fld:'vTFPRDHM_SEL',pic:''},{av:'AV62TFPrdZDHC_Sels',fld:'vTFPRDZDHC_SELS',pic:''},{av:'AV64TFPrdList_Sels',fld:'vTFPRDLIST_SELS',pic:''},{av:'AV65TFPrdTHELIST',fld:'vTFPRDTHELIST',pic:'@!'},{av:'AV66TFPrdTHELIST_Sel',fld:'vTFPRDTHELIST_SEL',pic:'@!'},{av:'AV68TFPrdGRS_Sels',fld:'vTFPRDGRS_SELS',pic:''},{av:'AV69TFPrdHS',fld:'vTFPRDHS',pic:''},{av:'AV70TFPrdHS_Sel',fld:'vTFPRDHS_SEL',pic:''},{av:'AV71TFPrdFHS',fld:'vTFPRDFHS',pic:''},{av:'AV75TFPrdNum2',fld:'vTFPRDNUM2',pic:''},{av:'AV76TFPrdNum2_Sel',fld:'vTFPRDNUM2_SEL',pic:''},{av:'AV77TFPrdNom2',fld:'vTFPRDNOM2',pic:''},{av:'AV78TFPrdNom2_Sel',fld:'vTFPRDNOM2_SEL',pic:''},{av:'AV79TFPrdRefPrv',fld:'vTFPRDREFPRV',pic:''},{av:'AV80TFPrdRefPrv_Sel',fld:'vTFPRDREFPRV_SEL',pic:''},{av:'AV81TFPrdFuncion',fld:'vTFPRDFUNCION',pic:''},{av:'AV82TFPrdFuncion_Sel',fld:'vTFPRDFUNCION_SEL',pic:''},{av:'AV83TFPrdEINECS',fld:'vTFPRDEINECS',pic:''},{av:'AV84TFPrdEINECS_Sel',fld:'vTFPRDEINECS_SEL',pic:''},{av:'AV85TFPrdNCAS',fld:'vTFPRDNCAS',pic:''},{av:'AV86TFPrdNCAS_Sel',fld:'vTFPRDNCAS_SEL',pic:''},{av:'AV87TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV88TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV89TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV90TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV95Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV57TFPrdOkotex_SelsJson',fld:'vTFPRDOKOTEX_SELSJSON',pic:''},{av:'AV61TFPrdZDHC_SelsJson',fld:'vTFPRDZDHC_SELSJSON',pic:''},{av:'AV63TFPrdList_SelsJson',fld:'vTFPRDLIST_SELSJSON',pic:''},{av:'AV67TFPrdGRS_SelsJson',fld:'vTFPRDGRS_SELSJSON',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV28TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV29TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV37TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV38TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV39TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV40TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV91TFPrdDisponible',fld:'vTFPRDDISPONIBLE',pic:'ZZZZZZ9.9999'},{av:'AV92TFPrdDisponible_To',fld:'vTFPRDDISPONIBLE_TO',pic:'ZZZZZZ9.9999'},{av:'AV41TFPrdCanPen',fld:'vTFPRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'AV42TFPrdCanPen_To',fld:'vTFPRDCANPEN_TO',pic:'ZZZZZZ9.9999'},{av:'AV43TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV44TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV45TFTipPrdDsc',fld:'vTFTIPPRDDSC',pic:''},{av:'AV46TFTipPrdDsc_Sel',fld:'vTFTIPPRDDSC_SEL',pic:''},{av:'AV47TFValDsc',fld:'vTFVALDSC',pic:''},{av:'AV48TFValDsc_Sel',fld:'vTFVALDSC_SEL',pic:''},{av:'AV49TFPrdRec',fld:'vTFPRDREC',pic:''},{av:'AV50TFPrdRec_Sel',fld:'vTFPRDREC_SEL',pic:''},{av:'AV51TFPrdAox',fld:'vTFPRDAOX',pic:'ZZ9.99'},{av:'AV52TFPrdAox_To',fld:'vTFPRDAOX_TO',pic:'ZZ9.99'},{av:'AV53TFPrdGots',fld:'vTFPRDGOTS',pic:''},{av:'AV54TFPrdGots_Sel',fld:'vTFPRDGOTS_SEL',pic:''},{av:'AV55TFPrdReach',fld:'vTFPRDREACH',pic:''},{av:'AV56TFPrdReach_Sel',fld:'vTFPRDREACH_SEL',pic:''},{av:'AV58TFPrdOkotex_Sels',fld:'vTFPRDOKOTEX_SELS',pic:''},{av:'AV59TFPrdHm',fld:'vTFPRDHM',pic:''},{av:'AV60TFPrdHm_Sel',fld:'vTFPRDHM_SEL',pic:''},{av:'AV62TFPrdZDHC_Sels',fld:'vTFPRDZDHC_SELS',pic:''},{av:'AV64TFPrdList_Sels',fld:'vTFPRDLIST_SELS',pic:''},{av:'AV65TFPrdTHELIST',fld:'vTFPRDTHELIST',pic:'@!'},{av:'AV66TFPrdTHELIST_Sel',fld:'vTFPRDTHELIST_SEL',pic:'@!'},{av:'AV68TFPrdGRS_Sels',fld:'vTFPRDGRS_SELS',pic:''},{av:'AV69TFPrdHS',fld:'vTFPRDHS',pic:''},{av:'AV70TFPrdHS_Sel',fld:'vTFPRDHS_SEL',pic:''},{av:'AV71TFPrdFHS',fld:'vTFPRDFHS',pic:''},{av:'AV75TFPrdNum2',fld:'vTFPRDNUM2',pic:''},{av:'AV76TFPrdNum2_Sel',fld:'vTFPRDNUM2_SEL',pic:''},{av:'AV77TFPrdNom2',fld:'vTFPRDNOM2',pic:''},{av:'AV78TFPrdNom2_Sel',fld:'vTFPRDNOM2_SEL',pic:''},{av:'AV79TFPrdRefPrv',fld:'vTFPRDREFPRV',pic:''},{av:'AV80TFPrdRefPrv_Sel',fld:'vTFPRDREFPRV_SEL',pic:''},{av:'AV81TFPrdFuncion',fld:'vTFPRDFUNCION',pic:''},{av:'AV82TFPrdFuncion_Sel',fld:'vTFPRDFUNCION_SEL',pic:''},{av:'AV83TFPrdEINECS',fld:'vTFPRDEINECS',pic:''},{av:'AV84TFPrdEINECS_Sel',fld:'vTFPRDEINECS_SEL',pic:''},{av:'AV85TFPrdNCAS',fld:'vTFPRDNCAS',pic:''},{av:'AV86TFPrdNCAS_Sel',fld:'vTFPRDNCAS_SEL',pic:''},{av:'AV87TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV88TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV89TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV90TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV67TFPrdGRS_SelsJson',fld:'vTFPRDGRS_SELSJSON',pic:''},{av:'AV63TFPrdList_SelsJson',fld:'vTFPRDLIST_SELSJSON',pic:''},{av:'AV61TFPrdZDHC_SelsJson',fld:'vTFPRDZDHC_SELSJSON',pic:''},{av:'AV57TFPrdOkotex_SelsJson',fld:'vTFPRDOKOTEX_SELSJSON',pic:''},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtPrdExiAlm_Visible',ctrl:'PRDEXIALM',prop:'Visible'},{av:'edtPrdCanRes_Visible',ctrl:'PRDCANRES',prop:'Visible'},{av:'edtPrdDisponi_Visible',ctrl:'PRDDISPONI',prop:'Visible'},{av:'edtPrdCanPen_Visible',ctrl:'PRDCANPEN',prop:'Visible'},{av:'edtPrdPreAct_Visible',ctrl:'PRDPREACT',prop:'Visible'},{av:'edtTipPrdDsc_Visible',ctrl:'TIPPRDDSC',prop:'Visible'},{av:'edtValDsc_Visible',ctrl:'VALDSC',prop:'Visible'},{av:'edtPrdRec_Visible',ctrl:'PRDREC',prop:'Visible'},{av:'edtPrdAox_Visible',ctrl:'PRDAOX',prop:'Visible'},{av:'edtPrdGots_Visible',ctrl:'PRDGOTS',prop:'Visible'},{av:'edtPrdReach_Visible',ctrl:'PRDREACH',prop:'Visible'},{av:'cmbPrdOkotex'},{av:'edtPrdHm_Visible',ctrl:'PRDHM',prop:'Visible'},{av:'cmbPrdZDHC'},{av:'cmbPrdList'},{av:'edtPrdTHELIST_Visible',ctrl:'PRDTHELIST',prop:'Visible'},{av:'cmbPrdGRS'},{av:'edtPrdHS_Visible',ctrl:'PRDHS',prop:'Visible'},{av:'edtPrdFHS_Visible',ctrl:'PRDFHS',prop:'Visible'},{av:'edtPrdNum2_Visible',ctrl:'PRDNUM2',prop:'Visible'},{av:'edtPrdNom2_Visible',ctrl:'PRDNOM2',prop:'Visible'},{av:'edtPrdRefPrv_Visible',ctrl:'PRDREFPRV',prop:'Visible'},{av:'edtPrdFuncion_Visible',ctrl:'PRDFUNCION',prop:'Visible'},{av:'edtPrdEINECS_Visible',ctrl:'PRDEINECS',prop:'Visible'},{av:'edtPrdNCAS_Visible',ctrl:'PRDNCAS',prop:'Visible'},{av:'edtPrvNum_Visible',ctrl:'PRVNUM',prop:'Visible'},{av:'edtPrvNom_Visible',ctrl:'PRVNOM',prop:'Visible'},{av:'AV32GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV33GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e161KX2',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e171KX2',iparms:[]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e181KX2',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[]");
      setEventMetadata("VALID_PRDNUM",",oparms:[]}");
      setEventMetadata("VALID_PRDNOM","{handler:'valid_Prdnom',iparms:[]");
      setEventMetadata("VALID_PRDNOM",",oparms:[]}");
      setEventMetadata("VALID_PRDEXIALM","{handler:'valid_Prdexialm',iparms:[]");
      setEventMetadata("VALID_PRDEXIALM",",oparms:[]}");
      setEventMetadata("VALID_PRDCANRES","{handler:'valid_Prdcanres',iparms:[]");
      setEventMetadata("VALID_PRDCANRES",",oparms:[]}");
      setEventMetadata("VALID_PRDDISPONI","{handler:'valid_Prddisponi',iparms:[]");
      setEventMetadata("VALID_PRDDISPONI",",oparms:[]}");
      setEventMetadata("VALID_PRDCANPEN","{handler:'valid_Prdcanpen',iparms:[]");
      setEventMetadata("VALID_PRDCANPEN",",oparms:[]}");
      setEventMetadata("VALID_PRDPREACT","{handler:'valid_Prdpreact',iparms:[]");
      setEventMetadata("VALID_PRDPREACT",",oparms:[]}");
      setEventMetadata("VALID_TIPPRDDSC","{handler:'valid_Tipprddsc',iparms:[]");
      setEventMetadata("VALID_TIPPRDDSC",",oparms:[]}");
      setEventMetadata("VALID_VALDSC","{handler:'valid_Valdsc',iparms:[]");
      setEventMetadata("VALID_VALDSC",",oparms:[]}");
      setEventMetadata("VALID_PRDREC","{handler:'valid_Prdrec',iparms:[]");
      setEventMetadata("VALID_PRDREC",",oparms:[]}");
      setEventMetadata("VALID_PRDAOX","{handler:'valid_Prdaox',iparms:[]");
      setEventMetadata("VALID_PRDAOX",",oparms:[]}");
      setEventMetadata("VALID_PRDGOTS","{handler:'valid_Prdgots',iparms:[]");
      setEventMetadata("VALID_PRDGOTS",",oparms:[]}");
      setEventMetadata("VALID_PRDREACH","{handler:'valid_Prdreach',iparms:[]");
      setEventMetadata("VALID_PRDREACH",",oparms:[]}");
      setEventMetadata("VALID_PRDOKOTEX","{handler:'valid_Prdokotex',iparms:[]");
      setEventMetadata("VALID_PRDOKOTEX",",oparms:[]}");
      setEventMetadata("VALID_PRDHM","{handler:'valid_Prdhm',iparms:[]");
      setEventMetadata("VALID_PRDHM",",oparms:[]}");
      setEventMetadata("VALID_PRDZDHC","{handler:'valid_Prdzdhc',iparms:[]");
      setEventMetadata("VALID_PRDZDHC",",oparms:[]}");
      setEventMetadata("VALID_PRDLIST","{handler:'valid_Prdlist',iparms:[]");
      setEventMetadata("VALID_PRDLIST",",oparms:[]}");
      setEventMetadata("VALID_PRDTHELIST","{handler:'valid_Prdthelist',iparms:[]");
      setEventMetadata("VALID_PRDTHELIST",",oparms:[]}");
      setEventMetadata("VALID_PRDGRS","{handler:'valid_Prdgrs',iparms:[]");
      setEventMetadata("VALID_PRDGRS",",oparms:[]}");
      setEventMetadata("VALID_PRDHS","{handler:'valid_Prdhs',iparms:[]");
      setEventMetadata("VALID_PRDHS",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM2","{handler:'valid_Prdnum2',iparms:[]");
      setEventMetadata("VALID_PRDNUM2",",oparms:[]}");
      setEventMetadata("VALID_PRDNOM2","{handler:'valid_Prdnom2',iparms:[]");
      setEventMetadata("VALID_PRDNOM2",",oparms:[]}");
      setEventMetadata("VALID_PRDREFPRV","{handler:'valid_Prdrefprv',iparms:[]");
      setEventMetadata("VALID_PRDREFPRV",",oparms:[]}");
      setEventMetadata("VALID_PRDFUNCION","{handler:'valid_Prdfuncion',iparms:[]");
      setEventMetadata("VALID_PRDFUNCION",",oparms:[]}");
      setEventMetadata("VALID_PRDEINECS","{handler:'valid_Prdeinecs',iparms:[]");
      setEventMetadata("VALID_PRDEINECS",",oparms:[]}");
      setEventMetadata("VALID_PRDNCAS","{handler:'valid_Prdncas',iparms:[]");
      setEventMetadata("VALID_PRDNCAS",",oparms:[]}");
      setEventMetadata("VALID_PRVNUM","{handler:'valid_Prvnum',iparms:[]");
      setEventMetadata("VALID_PRVNUM",",oparms:[]}");
      setEventMetadata("VALID_PRVNOM","{handler:'valid_Prvnom',iparms:[]");
      setEventMetadata("VALID_PRVNOM",",oparms:[]}");
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
      wcpOAV34emprcod = "" ;
      wcpOAV35PrdNumfrom = "" ;
      wcpOAV36PrdnumTo = "" ;
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
      AV34emprcod = "" ;
      AV35PrdNumfrom = "" ;
      AV36PrdnumTo = "" ;
      AV20ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV15FilterFullText = "" ;
      AV26TFPrdNum = "" ;
      AV27TFPrdNum_Sel = "" ;
      AV28TFPrdNom = "" ;
      AV29TFPrdNom_Sel = "" ;
      AV37TFPrdExiAlm = DecimalUtil.ZERO ;
      AV38TFPrdExiAlm_To = DecimalUtil.ZERO ;
      AV39TFPrdCanRes = DecimalUtil.ZERO ;
      AV40TFPrdCanRes_To = DecimalUtil.ZERO ;
      AV91TFPrdDisponible = DecimalUtil.ZERO ;
      AV92TFPrdDisponible_To = DecimalUtil.ZERO ;
      AV41TFPrdCanPen = DecimalUtil.ZERO ;
      AV42TFPrdCanPen_To = DecimalUtil.ZERO ;
      AV43TFPrdPreAct = DecimalUtil.ZERO ;
      AV44TFPrdPreAct_To = DecimalUtil.ZERO ;
      AV45TFTipPrdDsc = "" ;
      AV46TFTipPrdDsc_Sel = "" ;
      AV47TFValDsc = "" ;
      AV48TFValDsc_Sel = "" ;
      AV49TFPrdRec = "" ;
      AV50TFPrdRec_Sel = "" ;
      AV51TFPrdAox = DecimalUtil.ZERO ;
      AV52TFPrdAox_To = DecimalUtil.ZERO ;
      AV53TFPrdGots = "" ;
      AV54TFPrdGots_Sel = "" ;
      AV55TFPrdReach = "" ;
      AV56TFPrdReach_Sel = "" ;
      AV58TFPrdOkotex_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV59TFPrdHm = "" ;
      AV60TFPrdHm_Sel = "" ;
      AV62TFPrdZDHC_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV64TFPrdList_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV65TFPrdTHELIST = "" ;
      AV66TFPrdTHELIST_Sel = "" ;
      AV68TFPrdGRS_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV69TFPrdHS = "" ;
      AV70TFPrdHS_Sel = "" ;
      AV71TFPrdFHS = GXutil.nullDate() ;
      AV75TFPrdNum2 = "" ;
      AV76TFPrdNum2_Sel = "" ;
      AV77TFPrdNom2 = "" ;
      AV78TFPrdNom2_Sel = "" ;
      AV79TFPrdRefPrv = "" ;
      AV80TFPrdRefPrv_Sel = "" ;
      AV81TFPrdFuncion = "" ;
      AV82TFPrdFuncion_Sel = "" ;
      AV83TFPrdEINECS = "" ;
      AV84TFPrdEINECS_Sel = "" ;
      AV85TFPrdNCAS = "" ;
      AV86TFPrdNCAS_Sel = "" ;
      AV89TFPrvNom = "" ;
      AV90TFPrvNom_Sel = "" ;
      AV95Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV23ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV30DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV57TFPrdOkotex_SelsJson = "" ;
      AV61TFPrdZDHC_SelsJson = "" ;
      AV63TFPrdList_SelsJson = "" ;
      AV67TFPrdGRS_SelsJson = "" ;
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
      bttBtnexportreport_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_titlescategories = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV73DDO_PrdFHSAuxDate = GXutil.nullDate() ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A13831PrdDisponi = DecimalUtil.ZERO ;
      A684PrdCanPen = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A6302TipPrdDsc = "" ;
      A857ValDsc = "" ;
      A727PrdRec = "" ;
      A9733PrdAox = DecimalUtil.ZERO ;
      A11363PrdGots = "" ;
      A5887PrdReach = "" ;
      A5888PrdOkotex = "" ;
      A11364PrdHm = "" ;
      A13301PrdZDHC = "" ;
      A11687PrdList = "" ;
      A13302PrdTHELIST = "" ;
      A13974PrdGRS = "" ;
      A9741PrdHS = "" ;
      A9742PrdFHS = GXutil.nullDate() ;
      A4693PrdNum2 = "" ;
      A4692PrdNom2 = "" ;
      A728PrdRefPrv = "" ;
      A11615PrdFuncion = "" ;
      A11614PrdEINECS = "" ;
      A9734PrdNCAS = "" ;
      A794PrvNom = "" ;
      AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext = "" ;
      AV100Stocksquimicos_listadodeproductos_wcds_2_tfprdnum = "" ;
      AV101Stocksquimicos_listadodeproductos_wcds_3_tfprdnum_sel = "" ;
      AV102Stocksquimicos_listadodeproductos_wcds_4_tfprdnom = "" ;
      AV103Stocksquimicos_listadodeproductos_wcds_5_tfprdnom_sel = "" ;
      AV104Stocksquimicos_listadodeproductos_wcds_6_tfprdexialm = DecimalUtil.ZERO ;
      AV105Stocksquimicos_listadodeproductos_wcds_7_tfprdexialm_to = DecimalUtil.ZERO ;
      AV106Stocksquimicos_listadodeproductos_wcds_8_tfprdcanres = DecimalUtil.ZERO ;
      AV107Stocksquimicos_listadodeproductos_wcds_9_tfprdcanres_to = DecimalUtil.ZERO ;
      AV108Stocksquimicos_listadodeproductos_wcds_10_tfprddisponible = DecimalUtil.ZERO ;
      AV109Stocksquimicos_listadodeproductos_wcds_11_tfprddisponible_to = DecimalUtil.ZERO ;
      AV110Stocksquimicos_listadodeproductos_wcds_12_tfprdcanpen = DecimalUtil.ZERO ;
      AV111Stocksquimicos_listadodeproductos_wcds_13_tfprdcanpen_to = DecimalUtil.ZERO ;
      AV112Stocksquimicos_listadodeproductos_wcds_14_tfprdpreact = DecimalUtil.ZERO ;
      AV113Stocksquimicos_listadodeproductos_wcds_15_tfprdpreact_to = DecimalUtil.ZERO ;
      AV114Stocksquimicos_listadodeproductos_wcds_16_tftipprddsc = "" ;
      AV115Stocksquimicos_listadodeproductos_wcds_17_tftipprddsc_sel = "" ;
      AV116Stocksquimicos_listadodeproductos_wcds_18_tfvaldsc = "" ;
      AV117Stocksquimicos_listadodeproductos_wcds_19_tfvaldsc_sel = "" ;
      AV118Stocksquimicos_listadodeproductos_wcds_20_tfprdrec = "" ;
      AV119Stocksquimicos_listadodeproductos_wcds_21_tfprdrec_sel = "" ;
      AV120Stocksquimicos_listadodeproductos_wcds_22_tfprdaox = DecimalUtil.ZERO ;
      AV121Stocksquimicos_listadodeproductos_wcds_23_tfprdaox_to = DecimalUtil.ZERO ;
      AV122Stocksquimicos_listadodeproductos_wcds_24_tfprdgots = "" ;
      AV123Stocksquimicos_listadodeproductos_wcds_25_tfprdgots_sel = "" ;
      AV124Stocksquimicos_listadodeproductos_wcds_26_tfprdreach = "" ;
      AV125Stocksquimicos_listadodeproductos_wcds_27_tfprdreach_sel = "" ;
      AV126Stocksquimicos_listadodeproductos_wcds_28_tfprdokotex_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV127Stocksquimicos_listadodeproductos_wcds_29_tfprdhm = "" ;
      AV128Stocksquimicos_listadodeproductos_wcds_30_tfprdhm_sel = "" ;
      AV129Stocksquimicos_listadodeproductos_wcds_31_tfprdzdhc_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV130Stocksquimicos_listadodeproductos_wcds_32_tfprdlist_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV131Stocksquimicos_listadodeproductos_wcds_33_tfprdthelist = "" ;
      AV132Stocksquimicos_listadodeproductos_wcds_34_tfprdthelist_sel = "" ;
      AV133Stocksquimicos_listadodeproductos_wcds_35_tfprdgrs_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV134Stocksquimicos_listadodeproductos_wcds_36_tfprdhs = "" ;
      AV135Stocksquimicos_listadodeproductos_wcds_37_tfprdhs_sel = "" ;
      AV136Stocksquimicos_listadodeproductos_wcds_38_tfprdfhs = GXutil.nullDate() ;
      AV137Stocksquimicos_listadodeproductos_wcds_39_tfprdnum2 = "" ;
      AV138Stocksquimicos_listadodeproductos_wcds_40_tfprdnum2_sel = "" ;
      AV139Stocksquimicos_listadodeproductos_wcds_41_tfprdnom2 = "" ;
      AV140Stocksquimicos_listadodeproductos_wcds_42_tfprdnom2_sel = "" ;
      AV141Stocksquimicos_listadodeproductos_wcds_43_tfprdrefprv = "" ;
      AV142Stocksquimicos_listadodeproductos_wcds_44_tfprdrefprv_sel = "" ;
      AV143Stocksquimicos_listadodeproductos_wcds_45_tfprdfuncion = "" ;
      AV144Stocksquimicos_listadodeproductos_wcds_46_tfprdfuncion_sel = "" ;
      AV145Stocksquimicos_listadodeproductos_wcds_47_tfprdeinecs = "" ;
      AV146Stocksquimicos_listadodeproductos_wcds_48_tfprdeinecs_sel = "" ;
      AV147Stocksquimicos_listadodeproductos_wcds_49_tfprdncas = "" ;
      AV148Stocksquimicos_listadodeproductos_wcds_50_tfprdncas_sel = "" ;
      AV151Stocksquimicos_listadodeproductos_wcds_53_tfprvnom = "" ;
      AV152Stocksquimicos_listadodeproductos_wcds_54_tfprvnom_sel = "" ;
      scmdbuf = "" ;
      lV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext = "" ;
      lV100Stocksquimicos_listadodeproductos_wcds_2_tfprdnum = "" ;
      lV102Stocksquimicos_listadodeproductos_wcds_4_tfprdnom = "" ;
      lV114Stocksquimicos_listadodeproductos_wcds_16_tftipprddsc = "" ;
      lV116Stocksquimicos_listadodeproductos_wcds_18_tfvaldsc = "" ;
      lV118Stocksquimicos_listadodeproductos_wcds_20_tfprdrec = "" ;
      lV122Stocksquimicos_listadodeproductos_wcds_24_tfprdgots = "" ;
      lV124Stocksquimicos_listadodeproductos_wcds_26_tfprdreach = "" ;
      lV127Stocksquimicos_listadodeproductos_wcds_29_tfprdhm = "" ;
      lV131Stocksquimicos_listadodeproductos_wcds_33_tfprdthelist = "" ;
      lV134Stocksquimicos_listadodeproductos_wcds_36_tfprdhs = "" ;
      lV137Stocksquimicos_listadodeproductos_wcds_39_tfprdnum2 = "" ;
      lV139Stocksquimicos_listadodeproductos_wcds_41_tfprdnom2 = "" ;
      lV141Stocksquimicos_listadodeproductos_wcds_43_tfprdrefprv = "" ;
      lV143Stocksquimicos_listadodeproductos_wcds_45_tfprdfuncion = "" ;
      lV145Stocksquimicos_listadodeproductos_wcds_47_tfprdeinecs = "" ;
      lV147Stocksquimicos_listadodeproductos_wcds_49_tfprdncas = "" ;
      lV151Stocksquimicos_listadodeproductos_wcds_53_tfprvnom = "" ;
      A396EmprCod = "" ;
      H01KX2_A856ValCod = new byte[1] ;
      H01KX2_A6301TipPrdCod = new short[1] ;
      H01KX2_n6301TipPrdCod = new boolean[] {false} ;
      H01KX2_A396EmprCod = new String[] {""} ;
      H01KX2_A794PrvNom = new String[] {""} ;
      H01KX2_n794PrvNom = new boolean[] {false} ;
      H01KX2_A795PrvNum = new int[1] ;
      H01KX2_A9734PrdNCAS = new String[] {""} ;
      H01KX2_A11614PrdEINECS = new String[] {""} ;
      H01KX2_A11615PrdFuncion = new String[] {""} ;
      H01KX2_A728PrdRefPrv = new String[] {""} ;
      H01KX2_A4692PrdNom2 = new String[] {""} ;
      H01KX2_A4693PrdNum2 = new String[] {""} ;
      H01KX2_A9742PrdFHS = new java.util.Date[] {GXutil.nullDate()} ;
      H01KX2_A9741PrdHS = new String[] {""} ;
      H01KX2_A13974PrdGRS = new String[] {""} ;
      H01KX2_n13974PrdGRS = new boolean[] {false} ;
      H01KX2_A13302PrdTHELIST = new String[] {""} ;
      H01KX2_n13302PrdTHELIST = new boolean[] {false} ;
      H01KX2_A11687PrdList = new String[] {""} ;
      H01KX2_A13301PrdZDHC = new String[] {""} ;
      H01KX2_A11364PrdHm = new String[] {""} ;
      H01KX2_A5888PrdOkotex = new String[] {""} ;
      H01KX2_A5887PrdReach = new String[] {""} ;
      H01KX2_A11363PrdGots = new String[] {""} ;
      H01KX2_A9733PrdAox = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01KX2_A727PrdRec = new String[] {""} ;
      H01KX2_A857ValDsc = new String[] {""} ;
      H01KX2_n857ValDsc = new boolean[] {false} ;
      H01KX2_A6302TipPrdDsc = new String[] {""} ;
      H01KX2_n6302TipPrdDsc = new boolean[] {false} ;
      H01KX2_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01KX2_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01KX2_A13831PrdDisponi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01KX2_A718PrdNom = new String[] {""} ;
      H01KX2_A719PrdNum = new String[] {""} ;
      H01KX2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01KX2_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01KX3_A856ValCod = new byte[1] ;
      H01KX3_A6301TipPrdCod = new short[1] ;
      H01KX3_n6301TipPrdCod = new boolean[] {false} ;
      H01KX3_A396EmprCod = new String[] {""} ;
      H01KX3_A794PrvNom = new String[] {""} ;
      H01KX3_n794PrvNom = new boolean[] {false} ;
      H01KX3_A795PrvNum = new int[1] ;
      H01KX3_A9734PrdNCAS = new String[] {""} ;
      H01KX3_A11614PrdEINECS = new String[] {""} ;
      H01KX3_A11615PrdFuncion = new String[] {""} ;
      H01KX3_A728PrdRefPrv = new String[] {""} ;
      H01KX3_A4692PrdNom2 = new String[] {""} ;
      H01KX3_A4693PrdNum2 = new String[] {""} ;
      H01KX3_A9742PrdFHS = new java.util.Date[] {GXutil.nullDate()} ;
      H01KX3_A9741PrdHS = new String[] {""} ;
      H01KX3_A13974PrdGRS = new String[] {""} ;
      H01KX3_n13974PrdGRS = new boolean[] {false} ;
      H01KX3_A13302PrdTHELIST = new String[] {""} ;
      H01KX3_n13302PrdTHELIST = new boolean[] {false} ;
      H01KX3_A11687PrdList = new String[] {""} ;
      H01KX3_A13301PrdZDHC = new String[] {""} ;
      H01KX3_A11364PrdHm = new String[] {""} ;
      H01KX3_A5888PrdOkotex = new String[] {""} ;
      H01KX3_A5887PrdReach = new String[] {""} ;
      H01KX3_A11363PrdGots = new String[] {""} ;
      H01KX3_A9733PrdAox = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01KX3_A727PrdRec = new String[] {""} ;
      H01KX3_A857ValDsc = new String[] {""} ;
      H01KX3_n857ValDsc = new boolean[] {false} ;
      H01KX3_A6302TipPrdDsc = new String[] {""} ;
      H01KX3_n6302TipPrdDsc = new boolean[] {false} ;
      H01KX3_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01KX3_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01KX3_A13831PrdDisponi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01KX3_A718PrdNom = new String[] {""} ;
      H01KX3_A719PrdNum = new String[] {""} ;
      H01KX3_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01KX3_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      hsh = "" ;
      AV96Station = "" ;
      AV97Emprnom = "" ;
      AV98Usurcod = "" ;
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
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char12 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char13 = "" ;
      GXv_char2 = new String[1] ;
      GXt_char14 = "" ;
      GXv_char15 = new String[1] ;
      GXt_char48 = "" ;
      GXv_char49 = new String[1] ;
      GXt_char46 = "" ;
      GXv_char47 = new String[1] ;
      GXt_char44 = "" ;
      GXv_char45 = new String[1] ;
      GXt_char42 = "" ;
      GXv_char43 = new String[1] ;
      GXt_char40 = "" ;
      GXv_char41 = new String[1] ;
      GXt_char38 = "" ;
      GXv_char39 = new String[1] ;
      GXt_char36 = "" ;
      GXv_char37 = new String[1] ;
      GXt_char34 = "" ;
      GXv_char35 = new String[1] ;
      GXt_char32 = "" ;
      GXv_char33 = new String[1] ;
      GXt_char30 = "" ;
      GXv_char31 = new String[1] ;
      GXt_char28 = "" ;
      GXv_char29 = new String[1] ;
      GXt_char26 = "" ;
      GXv_char27 = new String[1] ;
      GXt_char24 = "" ;
      GXv_char25 = new String[1] ;
      GXt_char22 = "" ;
      GXv_char23 = new String[1] ;
      GXt_char20 = "" ;
      GXv_char21 = new String[1] ;
      GXt_char18 = "" ;
      GXv_char19 = new String[1] ;
      GXt_char16 = "" ;
      GXv_char17 = new String[1] ;
      GXv_SdtWWPGridState50 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV34emprcod = "" ;
      sCtrlAV35PrdNumfrom = "" ;
      sCtrlAV36PrdnumTo = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.listadodeproductos_wc__default(),
         new Object[] {
             new Object[] {
            H01KX2_A856ValCod, H01KX2_A6301TipPrdCod, H01KX2_n6301TipPrdCod, H01KX2_A396EmprCod, H01KX2_A794PrvNom, H01KX2_n794PrvNom, H01KX2_A795PrvNum, H01KX2_A9734PrdNCAS, H01KX2_A11614PrdEINECS, H01KX2_A11615PrdFuncion,
            H01KX2_A728PrdRefPrv, H01KX2_A4692PrdNom2, H01KX2_A4693PrdNum2, H01KX2_A9742PrdFHS, H01KX2_A9741PrdHS, H01KX2_A13974PrdGRS, H01KX2_n13974PrdGRS, H01KX2_A13302PrdTHELIST, H01KX2_n13302PrdTHELIST, H01KX2_A11687PrdList,
            H01KX2_A13301PrdZDHC, H01KX2_A11364PrdHm, H01KX2_A5888PrdOkotex, H01KX2_A5887PrdReach, H01KX2_A11363PrdGots, H01KX2_A9733PrdAox, H01KX2_A727PrdRec, H01KX2_A857ValDsc, H01KX2_n857ValDsc, H01KX2_A6302TipPrdDsc,
            H01KX2_n6302TipPrdDsc, H01KX2_A724PrdPreAct, H01KX2_A684PrdCanPen, H01KX2_A13831PrdDisponi, H01KX2_A718PrdNom, H01KX2_A719PrdNum, H01KX2_A704PrdExiAlm, H01KX2_A685PrdCanRes
            }
            , new Object[] {
            H01KX3_A856ValCod, H01KX3_A6301TipPrdCod, H01KX3_n6301TipPrdCod, H01KX3_A396EmprCod, H01KX3_A794PrvNom, H01KX3_n794PrvNom, H01KX3_A795PrvNum, H01KX3_A9734PrdNCAS, H01KX3_A11614PrdEINECS, H01KX3_A11615PrdFuncion,
            H01KX3_A728PrdRefPrv, H01KX3_A4692PrdNom2, H01KX3_A4693PrdNum2, H01KX3_A9742PrdFHS, H01KX3_A9741PrdHS, H01KX3_A13974PrdGRS, H01KX3_n13974PrdGRS, H01KX3_A13302PrdTHELIST, H01KX3_n13302PrdTHELIST, H01KX3_A11687PrdList,
            H01KX3_A13301PrdZDHC, H01KX3_A11364PrdHm, H01KX3_A5888PrdOkotex, H01KX3_A5887PrdReach, H01KX3_A11363PrdGots, H01KX3_A9733PrdAox, H01KX3_A727PrdRec, H01KX3_A857ValDsc, H01KX3_n857ValDsc, H01KX3_A6302TipPrdDsc,
            H01KX3_n6302TipPrdDsc, H01KX3_A724PrdPreAct, H01KX3_A684PrdCanPen, H01KX3_A13831PrdDisponi, H01KX3_A718PrdNom, H01KX3_A719PrdNum, H01KX3_A704PrdExiAlm, H01KX3_A685PrdCanRes
            }
         }
      );
      AV95Pgmname = "StocksQuimicos.ListadodeProductos_WC" ;
      /* GeneXus formulas. */
      AV95Pgmname = "StocksQuimicos.ListadodeProductos_WC" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV25ManageFiltersExecutionStep ;
   private byte nDraw ;
   private byte nDoneStart ;
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
   private short AV12OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short A6301TipPrdCod ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_43 ;
   private int nGXsfl_43_idx=1 ;
   private int AV87TFPrvNum ;
   private int AV88TFPrvNum_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPgmname_Enabled ;
   private int A795PrvNum ;
   private int subGrid_Islastpage ;
   private int AV149Stocksquimicos_listadodeproductos_wcds_51_tfprvnum ;
   private int AV150Stocksquimicos_listadodeproductos_wcds_52_tfprvnum_to ;
   private int AV126Stocksquimicos_listadodeproductos_wcds_28_tfprdokotex_sels_size ;
   private int AV129Stocksquimicos_listadodeproductos_wcds_31_tfprdzdhc_sels_size ;
   private int AV130Stocksquimicos_listadodeproductos_wcds_32_tfprdlist_sels_size ;
   private int AV133Stocksquimicos_listadodeproductos_wcds_35_tfprdgrs_sels_size ;
   private int edtPrdNum_Visible ;
   private int edtPrdNom_Visible ;
   private int edtPrdExiAlm_Visible ;
   private int edtPrdCanRes_Visible ;
   private int edtPrdDisponi_Visible ;
   private int edtPrdCanPen_Visible ;
   private int edtPrdPreAct_Visible ;
   private int edtTipPrdDsc_Visible ;
   private int edtValDsc_Visible ;
   private int edtPrdRec_Visible ;
   private int edtPrdAox_Visible ;
   private int edtPrdGots_Visible ;
   private int edtPrdReach_Visible ;
   private int edtPrdHm_Visible ;
   private int edtPrdTHELIST_Visible ;
   private int edtPrdHS_Visible ;
   private int edtPrdFHS_Visible ;
   private int edtPrdNum2_Visible ;
   private int edtPrdNom2_Visible ;
   private int edtPrdRefPrv_Visible ;
   private int edtPrdFuncion_Visible ;
   private int edtPrdEINECS_Visible ;
   private int edtPrdNCAS_Visible ;
   private int edtPrvNum_Visible ;
   private int edtPrvNom_Visible ;
   private int AV31PageToGo ;
   private int AV153GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV32GridCurrentPage ;
   private long AV33GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV37TFPrdExiAlm ;
   private java.math.BigDecimal AV38TFPrdExiAlm_To ;
   private java.math.BigDecimal AV39TFPrdCanRes ;
   private java.math.BigDecimal AV40TFPrdCanRes_To ;
   private java.math.BigDecimal AV91TFPrdDisponible ;
   private java.math.BigDecimal AV92TFPrdDisponible_To ;
   private java.math.BigDecimal AV41TFPrdCanPen ;
   private java.math.BigDecimal AV42TFPrdCanPen_To ;
   private java.math.BigDecimal AV43TFPrdPreAct ;
   private java.math.BigDecimal AV44TFPrdPreAct_To ;
   private java.math.BigDecimal AV51TFPrdAox ;
   private java.math.BigDecimal AV52TFPrdAox_To ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A13831PrdDisponi ;
   private java.math.BigDecimal A684PrdCanPen ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A9733PrdAox ;
   private java.math.BigDecimal AV104Stocksquimicos_listadodeproductos_wcds_6_tfprdexialm ;
   private java.math.BigDecimal AV105Stocksquimicos_listadodeproductos_wcds_7_tfprdexialm_to ;
   private java.math.BigDecimal AV106Stocksquimicos_listadodeproductos_wcds_8_tfprdcanres ;
   private java.math.BigDecimal AV107Stocksquimicos_listadodeproductos_wcds_9_tfprdcanres_to ;
   private java.math.BigDecimal AV108Stocksquimicos_listadodeproductos_wcds_10_tfprddisponible ;
   private java.math.BigDecimal AV109Stocksquimicos_listadodeproductos_wcds_11_tfprddisponible_to ;
   private java.math.BigDecimal AV110Stocksquimicos_listadodeproductos_wcds_12_tfprdcanpen ;
   private java.math.BigDecimal AV111Stocksquimicos_listadodeproductos_wcds_13_tfprdcanpen_to ;
   private java.math.BigDecimal AV112Stocksquimicos_listadodeproductos_wcds_14_tfprdpreact ;
   private java.math.BigDecimal AV113Stocksquimicos_listadodeproductos_wcds_15_tfprdpreact_to ;
   private java.math.BigDecimal AV120Stocksquimicos_listadodeproductos_wcds_22_tfprdaox ;
   private java.math.BigDecimal AV121Stocksquimicos_listadodeproductos_wcds_23_tfprdaox_to ;
   private String wcpOAV34emprcod ;
   private String wcpOAV35PrdNumfrom ;
   private String wcpOAV36PrdnumTo ;
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
   private String AV34emprcod ;
   private String AV35PrdNumfrom ;
   private String AV36PrdnumTo ;
   private String sGXsfl_43_idx="0001" ;
   private String AV26TFPrdNum ;
   private String AV27TFPrdNum_Sel ;
   private String AV28TFPrdNom ;
   private String AV29TFPrdNom_Sel ;
   private String AV45TFTipPrdDsc ;
   private String AV46TFTipPrdDsc_Sel ;
   private String AV47TFValDsc ;
   private String AV48TFValDsc_Sel ;
   private String AV49TFPrdRec ;
   private String AV50TFPrdRec_Sel ;
   private String AV53TFPrdGots ;
   private String AV54TFPrdGots_Sel ;
   private String AV55TFPrdReach ;
   private String AV56TFPrdReach_Sel ;
   private String AV59TFPrdHm ;
   private String AV60TFPrdHm_Sel ;
   private String AV65TFPrdTHELIST ;
   private String AV66TFPrdTHELIST_Sel ;
   private String AV69TFPrdHS ;
   private String AV70TFPrdHS_Sel ;
   private String AV75TFPrdNum2 ;
   private String AV76TFPrdNum2_Sel ;
   private String AV77TFPrdNom2 ;
   private String AV78TFPrdNom2_Sel ;
   private String AV79TFPrdRefPrv ;
   private String AV80TFPrdRefPrv_Sel ;
   private String AV81TFPrdFuncion ;
   private String AV82TFPrdFuncion_Sel ;
   private String AV83TFPrdEINECS ;
   private String AV84TFPrdEINECS_Sel ;
   private String AV85TFPrdNCAS ;
   private String AV86TFPrdNCAS_Sel ;
   private String AV89TFPrvNom ;
   private String AV90TFPrvNom_Sel ;
   private String AV95Pgmname ;
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
   private String Ddo_grid_Allowmultipleselection ;
   private String Ddo_grid_Datalistfixedvalues ;
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
   private String bttBtnexportreport_Internalname ;
   private String bttBtnexportreport_Jsonclick ;
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
   private String divDdo_prdfhsauxdates_Internalname ;
   private String edtavDdo_prdfhsauxdate_Internalname ;
   private String edtavDdo_prdfhsauxdate_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavFilterfulltext_Internalname ;
   private String A719PrdNum ;
   private String edtPrdNum_Internalname ;
   private String A718PrdNom ;
   private String edtPrdNom_Internalname ;
   private String edtPrdExiAlm_Internalname ;
   private String edtPrdCanRes_Internalname ;
   private String edtPrdDisponi_Internalname ;
   private String edtPrdCanPen_Internalname ;
   private String edtPrdPreAct_Internalname ;
   private String A6302TipPrdDsc ;
   private String edtTipPrdDsc_Internalname ;
   private String A857ValDsc ;
   private String edtValDsc_Internalname ;
   private String A727PrdRec ;
   private String edtPrdRec_Internalname ;
   private String edtPrdAox_Internalname ;
   private String A11363PrdGots ;
   private String edtPrdGots_Internalname ;
   private String A5887PrdReach ;
   private String edtPrdReach_Internalname ;
   private String A5888PrdOkotex ;
   private String A11364PrdHm ;
   private String edtPrdHm_Internalname ;
   private String A13301PrdZDHC ;
   private String A11687PrdList ;
   private String A13302PrdTHELIST ;
   private String edtPrdTHELIST_Internalname ;
   private String A13974PrdGRS ;
   private String A9741PrdHS ;
   private String edtPrdHS_Internalname ;
   private String edtPrdFHS_Internalname ;
   private String A4693PrdNum2 ;
   private String edtPrdNum2_Internalname ;
   private String A4692PrdNom2 ;
   private String edtPrdNom2_Internalname ;
   private String A728PrdRefPrv ;
   private String edtPrdRefPrv_Internalname ;
   private String A11615PrdFuncion ;
   private String edtPrdFuncion_Internalname ;
   private String A11614PrdEINECS ;
   private String edtPrdEINECS_Internalname ;
   private String A9734PrdNCAS ;
   private String edtPrdNCAS_Internalname ;
   private String edtPrvNum_Internalname ;
   private String A794PrvNom ;
   private String edtPrvNom_Internalname ;
   private String AV100Stocksquimicos_listadodeproductos_wcds_2_tfprdnum ;
   private String AV101Stocksquimicos_listadodeproductos_wcds_3_tfprdnum_sel ;
   private String AV102Stocksquimicos_listadodeproductos_wcds_4_tfprdnom ;
   private String AV103Stocksquimicos_listadodeproductos_wcds_5_tfprdnom_sel ;
   private String AV114Stocksquimicos_listadodeproductos_wcds_16_tftipprddsc ;
   private String AV115Stocksquimicos_listadodeproductos_wcds_17_tftipprddsc_sel ;
   private String AV116Stocksquimicos_listadodeproductos_wcds_18_tfvaldsc ;
   private String AV117Stocksquimicos_listadodeproductos_wcds_19_tfvaldsc_sel ;
   private String AV118Stocksquimicos_listadodeproductos_wcds_20_tfprdrec ;
   private String AV119Stocksquimicos_listadodeproductos_wcds_21_tfprdrec_sel ;
   private String AV122Stocksquimicos_listadodeproductos_wcds_24_tfprdgots ;
   private String AV123Stocksquimicos_listadodeproductos_wcds_25_tfprdgots_sel ;
   private String AV124Stocksquimicos_listadodeproductos_wcds_26_tfprdreach ;
   private String AV125Stocksquimicos_listadodeproductos_wcds_27_tfprdreach_sel ;
   private String AV127Stocksquimicos_listadodeproductos_wcds_29_tfprdhm ;
   private String AV128Stocksquimicos_listadodeproductos_wcds_30_tfprdhm_sel ;
   private String AV131Stocksquimicos_listadodeproductos_wcds_33_tfprdthelist ;
   private String AV132Stocksquimicos_listadodeproductos_wcds_34_tfprdthelist_sel ;
   private String AV134Stocksquimicos_listadodeproductos_wcds_36_tfprdhs ;
   private String AV135Stocksquimicos_listadodeproductos_wcds_37_tfprdhs_sel ;
   private String AV137Stocksquimicos_listadodeproductos_wcds_39_tfprdnum2 ;
   private String AV138Stocksquimicos_listadodeproductos_wcds_40_tfprdnum2_sel ;
   private String AV139Stocksquimicos_listadodeproductos_wcds_41_tfprdnom2 ;
   private String AV140Stocksquimicos_listadodeproductos_wcds_42_tfprdnom2_sel ;
   private String AV141Stocksquimicos_listadodeproductos_wcds_43_tfprdrefprv ;
   private String AV142Stocksquimicos_listadodeproductos_wcds_44_tfprdrefprv_sel ;
   private String AV143Stocksquimicos_listadodeproductos_wcds_45_tfprdfuncion ;
   private String AV144Stocksquimicos_listadodeproductos_wcds_46_tfprdfuncion_sel ;
   private String AV145Stocksquimicos_listadodeproductos_wcds_47_tfprdeinecs ;
   private String AV146Stocksquimicos_listadodeproductos_wcds_48_tfprdeinecs_sel ;
   private String AV147Stocksquimicos_listadodeproductos_wcds_49_tfprdncas ;
   private String AV148Stocksquimicos_listadodeproductos_wcds_50_tfprdncas_sel ;
   private String AV151Stocksquimicos_listadodeproductos_wcds_53_tfprvnom ;
   private String AV152Stocksquimicos_listadodeproductos_wcds_54_tfprvnom_sel ;
   private String scmdbuf ;
   private String lV100Stocksquimicos_listadodeproductos_wcds_2_tfprdnum ;
   private String lV102Stocksquimicos_listadodeproductos_wcds_4_tfprdnom ;
   private String lV114Stocksquimicos_listadodeproductos_wcds_16_tftipprddsc ;
   private String lV116Stocksquimicos_listadodeproductos_wcds_18_tfvaldsc ;
   private String lV118Stocksquimicos_listadodeproductos_wcds_20_tfprdrec ;
   private String lV122Stocksquimicos_listadodeproductos_wcds_24_tfprdgots ;
   private String lV124Stocksquimicos_listadodeproductos_wcds_26_tfprdreach ;
   private String lV127Stocksquimicos_listadodeproductos_wcds_29_tfprdhm ;
   private String lV131Stocksquimicos_listadodeproductos_wcds_33_tfprdthelist ;
   private String lV134Stocksquimicos_listadodeproductos_wcds_36_tfprdhs ;
   private String lV137Stocksquimicos_listadodeproductos_wcds_39_tfprdnum2 ;
   private String lV139Stocksquimicos_listadodeproductos_wcds_41_tfprdnom2 ;
   private String lV141Stocksquimicos_listadodeproductos_wcds_43_tfprdrefprv ;
   private String lV143Stocksquimicos_listadodeproductos_wcds_45_tfprdfuncion ;
   private String lV145Stocksquimicos_listadodeproductos_wcds_47_tfprdeinecs ;
   private String lV147Stocksquimicos_listadodeproductos_wcds_49_tfprdncas ;
   private String lV151Stocksquimicos_listadodeproductos_wcds_53_tfprvnom ;
   private String A396EmprCod ;
   private String hsh ;
   private String AV96Station ;
   private String AV97Emprnom ;
   private String AV98Usurcod ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXt_char12 ;
   private String GXv_char3[] ;
   private String GXt_char13 ;
   private String GXv_char2[] ;
   private String GXt_char14 ;
   private String GXv_char15[] ;
   private String GXt_char48 ;
   private String GXv_char49[] ;
   private String GXt_char46 ;
   private String GXv_char47[] ;
   private String GXt_char44 ;
   private String GXv_char45[] ;
   private String GXt_char42 ;
   private String GXv_char43[] ;
   private String GXt_char40 ;
   private String GXv_char41[] ;
   private String GXt_char38 ;
   private String GXv_char39[] ;
   private String GXt_char36 ;
   private String GXv_char37[] ;
   private String GXt_char34 ;
   private String GXv_char35[] ;
   private String GXt_char32 ;
   private String GXv_char33[] ;
   private String GXt_char30 ;
   private String GXv_char31[] ;
   private String GXt_char28 ;
   private String GXv_char29[] ;
   private String GXt_char26 ;
   private String GXv_char27[] ;
   private String GXt_char24 ;
   private String GXv_char25[] ;
   private String GXt_char22 ;
   private String GXv_char23[] ;
   private String GXt_char20 ;
   private String GXv_char21[] ;
   private String GXt_char18 ;
   private String GXv_char19[] ;
   private String GXt_char16 ;
   private String GXv_char17[] ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV34emprcod ;
   private String sCtrlAV35PrdNumfrom ;
   private String sCtrlAV36PrdnumTo ;
   private String sGXsfl_43_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdNom_Jsonclick ;
   private String edtPrdExiAlm_Jsonclick ;
   private String edtPrdCanRes_Jsonclick ;
   private String edtPrdDisponi_Jsonclick ;
   private String edtPrdCanPen_Jsonclick ;
   private String edtPrdPreAct_Jsonclick ;
   private String edtTipPrdDsc_Jsonclick ;
   private String edtValDsc_Jsonclick ;
   private String edtPrdRec_Jsonclick ;
   private String edtPrdAox_Jsonclick ;
   private String edtPrdGots_Jsonclick ;
   private String edtPrdReach_Jsonclick ;
   private String GXCCtl ;
   private String edtPrdHm_Jsonclick ;
   private String edtPrdTHELIST_Jsonclick ;
   private String edtPrdHS_Jsonclick ;
   private String edtPrdFHS_Jsonclick ;
   private String edtPrdNum2_Jsonclick ;
   private String edtPrdNom2_Jsonclick ;
   private String edtPrdRefPrv_Jsonclick ;
   private String edtPrdFuncion_Jsonclick ;
   private String edtPrdEINECS_Jsonclick ;
   private String edtPrdNCAS_Jsonclick ;
   private String edtPrvNum_Jsonclick ;
   private String edtPrvNom_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV71TFPrdFHS ;
   private java.util.Date AV73DDO_PrdFHSAuxDate ;
   private java.util.Date A9742PrdFHS ;
   private java.util.Date AV136Stocksquimicos_listadodeproductos_wcds_38_tfprdfhs ;
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
   private boolean n6302TipPrdDsc ;
   private boolean n857ValDsc ;
   private boolean n13302PrdTHELIST ;
   private boolean n13974PrdGRS ;
   private boolean n794PrvNom ;
   private boolean n6301TipPrdCod ;
   private boolean bGXsfl_43_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV57TFPrdOkotex_SelsJson ;
   private String AV61TFPrdZDHC_SelsJson ;
   private String AV63TFPrdList_SelsJson ;
   private String AV67TFPrdGRS_SelsJson ;
   private String AV18ColumnsSelectorXML ;
   private String AV24ManageFiltersXml ;
   private String AV19UserCustomValue ;
   private String AV15FilterFullText ;
   private String AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext ;
   private String lV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext ;
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
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_titlescategories ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbPrdOkotex ;
   private HTMLChoice cmbPrdZDHC ;
   private HTMLChoice cmbPrdList ;
   private HTMLChoice cmbPrdGRS ;
   private IDataStoreProvider pr_default ;
   private byte[] H01KX2_A856ValCod ;
   private short[] H01KX2_A6301TipPrdCod ;
   private boolean[] H01KX2_n6301TipPrdCod ;
   private String[] H01KX2_A396EmprCod ;
   private String[] H01KX2_A794PrvNom ;
   private boolean[] H01KX2_n794PrvNom ;
   private int[] H01KX2_A795PrvNum ;
   private String[] H01KX2_A9734PrdNCAS ;
   private String[] H01KX2_A11614PrdEINECS ;
   private String[] H01KX2_A11615PrdFuncion ;
   private String[] H01KX2_A728PrdRefPrv ;
   private String[] H01KX2_A4692PrdNom2 ;
   private String[] H01KX2_A4693PrdNum2 ;
   private java.util.Date[] H01KX2_A9742PrdFHS ;
   private String[] H01KX2_A9741PrdHS ;
   private String[] H01KX2_A13974PrdGRS ;
   private boolean[] H01KX2_n13974PrdGRS ;
   private String[] H01KX2_A13302PrdTHELIST ;
   private boolean[] H01KX2_n13302PrdTHELIST ;
   private String[] H01KX2_A11687PrdList ;
   private String[] H01KX2_A13301PrdZDHC ;
   private String[] H01KX2_A11364PrdHm ;
   private String[] H01KX2_A5888PrdOkotex ;
   private String[] H01KX2_A5887PrdReach ;
   private String[] H01KX2_A11363PrdGots ;
   private java.math.BigDecimal[] H01KX2_A9733PrdAox ;
   private String[] H01KX2_A727PrdRec ;
   private String[] H01KX2_A857ValDsc ;
   private boolean[] H01KX2_n857ValDsc ;
   private String[] H01KX2_A6302TipPrdDsc ;
   private boolean[] H01KX2_n6302TipPrdDsc ;
   private java.math.BigDecimal[] H01KX2_A724PrdPreAct ;
   private java.math.BigDecimal[] H01KX2_A684PrdCanPen ;
   private java.math.BigDecimal[] H01KX2_A13831PrdDisponi ;
   private String[] H01KX2_A718PrdNom ;
   private String[] H01KX2_A719PrdNum ;
   private java.math.BigDecimal[] H01KX2_A704PrdExiAlm ;
   private java.math.BigDecimal[] H01KX2_A685PrdCanRes ;
   private byte[] H01KX3_A856ValCod ;
   private short[] H01KX3_A6301TipPrdCod ;
   private boolean[] H01KX3_n6301TipPrdCod ;
   private String[] H01KX3_A396EmprCod ;
   private String[] H01KX3_A794PrvNom ;
   private boolean[] H01KX3_n794PrvNom ;
   private int[] H01KX3_A795PrvNum ;
   private String[] H01KX3_A9734PrdNCAS ;
   private String[] H01KX3_A11614PrdEINECS ;
   private String[] H01KX3_A11615PrdFuncion ;
   private String[] H01KX3_A728PrdRefPrv ;
   private String[] H01KX3_A4692PrdNom2 ;
   private String[] H01KX3_A4693PrdNum2 ;
   private java.util.Date[] H01KX3_A9742PrdFHS ;
   private String[] H01KX3_A9741PrdHS ;
   private String[] H01KX3_A13974PrdGRS ;
   private boolean[] H01KX3_n13974PrdGRS ;
   private String[] H01KX3_A13302PrdTHELIST ;
   private boolean[] H01KX3_n13302PrdTHELIST ;
   private String[] H01KX3_A11687PrdList ;
   private String[] H01KX3_A13301PrdZDHC ;
   private String[] H01KX3_A11364PrdHm ;
   private String[] H01KX3_A5888PrdOkotex ;
   private String[] H01KX3_A5887PrdReach ;
   private String[] H01KX3_A11363PrdGots ;
   private java.math.BigDecimal[] H01KX3_A9733PrdAox ;
   private String[] H01KX3_A727PrdRec ;
   private String[] H01KX3_A857ValDsc ;
   private boolean[] H01KX3_n857ValDsc ;
   private String[] H01KX3_A6302TipPrdDsc ;
   private boolean[] H01KX3_n6302TipPrdDsc ;
   private java.math.BigDecimal[] H01KX3_A724PrdPreAct ;
   private java.math.BigDecimal[] H01KX3_A684PrdCanPen ;
   private java.math.BigDecimal[] H01KX3_A13831PrdDisponi ;
   private String[] H01KX3_A718PrdNom ;
   private String[] H01KX3_A719PrdNum ;
   private java.math.BigDecimal[] H01KX3_A704PrdExiAlm ;
   private java.math.BigDecimal[] H01KX3_A685PrdCanRes ;
   private GXSimpleCollection<String> AV58TFPrdOkotex_Sels ;
   private GXSimpleCollection<String> AV62TFPrdZDHC_Sels ;
   private GXSimpleCollection<String> AV64TFPrdList_Sels ;
   private GXSimpleCollection<String> AV68TFPrdGRS_Sels ;
   private GXSimpleCollection<String> AV126Stocksquimicos_listadodeproductos_wcds_28_tfprdokotex_sels ;
   private GXSimpleCollection<String> AV129Stocksquimicos_listadodeproductos_wcds_31_tfprdzdhc_sels ;
   private GXSimpleCollection<String> AV130Stocksquimicos_listadodeproductos_wcds_32_tfprdlist_sels ;
   private GXSimpleCollection<String> AV133Stocksquimicos_listadodeproductos_wcds_35_tfprdgrs_sels ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV23ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState50[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV21ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV30DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class listadodeproductos_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01KX2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A5888PrdOkotex ,
                                          GXSimpleCollection<String> AV126Stocksquimicos_listadodeproductos_wcds_28_tfprdokotex_sels ,
                                          String A13301PrdZDHC ,
                                          GXSimpleCollection<String> AV129Stocksquimicos_listadodeproductos_wcds_31_tfprdzdhc_sels ,
                                          String A11687PrdList ,
                                          GXSimpleCollection<String> AV130Stocksquimicos_listadodeproductos_wcds_32_tfprdlist_sels ,
                                          String A13974PrdGRS ,
                                          GXSimpleCollection<String> AV133Stocksquimicos_listadodeproductos_wcds_35_tfprdgrs_sels ,
                                          String AV101Stocksquimicos_listadodeproductos_wcds_3_tfprdnum_sel ,
                                          String AV100Stocksquimicos_listadodeproductos_wcds_2_tfprdnum ,
                                          String AV103Stocksquimicos_listadodeproductos_wcds_5_tfprdnom_sel ,
                                          String AV102Stocksquimicos_listadodeproductos_wcds_4_tfprdnom ,
                                          java.math.BigDecimal AV104Stocksquimicos_listadodeproductos_wcds_6_tfprdexialm ,
                                          java.math.BigDecimal AV105Stocksquimicos_listadodeproductos_wcds_7_tfprdexialm_to ,
                                          java.math.BigDecimal AV106Stocksquimicos_listadodeproductos_wcds_8_tfprdcanres ,
                                          java.math.BigDecimal AV107Stocksquimicos_listadodeproductos_wcds_9_tfprdcanres_to ,
                                          java.math.BigDecimal AV108Stocksquimicos_listadodeproductos_wcds_10_tfprddisponible ,
                                          java.math.BigDecimal AV109Stocksquimicos_listadodeproductos_wcds_11_tfprddisponible_to ,
                                          java.math.BigDecimal AV110Stocksquimicos_listadodeproductos_wcds_12_tfprdcanpen ,
                                          java.math.BigDecimal AV111Stocksquimicos_listadodeproductos_wcds_13_tfprdcanpen_to ,
                                          java.math.BigDecimal AV112Stocksquimicos_listadodeproductos_wcds_14_tfprdpreact ,
                                          java.math.BigDecimal AV113Stocksquimicos_listadodeproductos_wcds_15_tfprdpreact_to ,
                                          String AV115Stocksquimicos_listadodeproductos_wcds_17_tftipprddsc_sel ,
                                          String AV114Stocksquimicos_listadodeproductos_wcds_16_tftipprddsc ,
                                          String AV117Stocksquimicos_listadodeproductos_wcds_19_tfvaldsc_sel ,
                                          String AV116Stocksquimicos_listadodeproductos_wcds_18_tfvaldsc ,
                                          String AV119Stocksquimicos_listadodeproductos_wcds_21_tfprdrec_sel ,
                                          String AV118Stocksquimicos_listadodeproductos_wcds_20_tfprdrec ,
                                          java.math.BigDecimal AV120Stocksquimicos_listadodeproductos_wcds_22_tfprdaox ,
                                          java.math.BigDecimal AV121Stocksquimicos_listadodeproductos_wcds_23_tfprdaox_to ,
                                          String AV123Stocksquimicos_listadodeproductos_wcds_25_tfprdgots_sel ,
                                          String AV122Stocksquimicos_listadodeproductos_wcds_24_tfprdgots ,
                                          String AV125Stocksquimicos_listadodeproductos_wcds_27_tfprdreach_sel ,
                                          String AV124Stocksquimicos_listadodeproductos_wcds_26_tfprdreach ,
                                          int AV126Stocksquimicos_listadodeproductos_wcds_28_tfprdokotex_sels_size ,
                                          String AV128Stocksquimicos_listadodeproductos_wcds_30_tfprdhm_sel ,
                                          String AV127Stocksquimicos_listadodeproductos_wcds_29_tfprdhm ,
                                          int AV129Stocksquimicos_listadodeproductos_wcds_31_tfprdzdhc_sels_size ,
                                          int AV130Stocksquimicos_listadodeproductos_wcds_32_tfprdlist_sels_size ,
                                          String AV132Stocksquimicos_listadodeproductos_wcds_34_tfprdthelist_sel ,
                                          String AV131Stocksquimicos_listadodeproductos_wcds_33_tfprdthelist ,
                                          int AV133Stocksquimicos_listadodeproductos_wcds_35_tfprdgrs_sels_size ,
                                          String AV135Stocksquimicos_listadodeproductos_wcds_37_tfprdhs_sel ,
                                          String AV134Stocksquimicos_listadodeproductos_wcds_36_tfprdhs ,
                                          java.util.Date AV136Stocksquimicos_listadodeproductos_wcds_38_tfprdfhs ,
                                          String AV138Stocksquimicos_listadodeproductos_wcds_40_tfprdnum2_sel ,
                                          String AV137Stocksquimicos_listadodeproductos_wcds_39_tfprdnum2 ,
                                          String AV140Stocksquimicos_listadodeproductos_wcds_42_tfprdnom2_sel ,
                                          String AV139Stocksquimicos_listadodeproductos_wcds_41_tfprdnom2 ,
                                          String AV142Stocksquimicos_listadodeproductos_wcds_44_tfprdrefprv_sel ,
                                          String AV141Stocksquimicos_listadodeproductos_wcds_43_tfprdrefprv ,
                                          String AV144Stocksquimicos_listadodeproductos_wcds_46_tfprdfuncion_sel ,
                                          String AV143Stocksquimicos_listadodeproductos_wcds_45_tfprdfuncion ,
                                          String AV146Stocksquimicos_listadodeproductos_wcds_48_tfprdeinecs_sel ,
                                          String AV145Stocksquimicos_listadodeproductos_wcds_47_tfprdeinecs ,
                                          String AV148Stocksquimicos_listadodeproductos_wcds_50_tfprdncas_sel ,
                                          String AV147Stocksquimicos_listadodeproductos_wcds_49_tfprdncas ,
                                          int AV149Stocksquimicos_listadodeproductos_wcds_51_tfprvnum ,
                                          int AV150Stocksquimicos_listadodeproductos_wcds_52_tfprvnum_to ,
                                          String AV152Stocksquimicos_listadodeproductos_wcds_54_tfprvnom_sel ,
                                          String AV151Stocksquimicos_listadodeproductos_wcds_53_tfprvnom ,
                                          String AV35PrdNumfrom ,
                                          String AV36PrdnumTo ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          java.math.BigDecimal A684PrdCanPen ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          String A6302TipPrdDsc ,
                                          String A857ValDsc ,
                                          String A727PrdRec ,
                                          java.math.BigDecimal A9733PrdAox ,
                                          String A11363PrdGots ,
                                          String A5887PrdReach ,
                                          String A11364PrdHm ,
                                          String A13302PrdTHELIST ,
                                          String A9741PrdHS ,
                                          java.util.Date A9742PrdFHS ,
                                          String A4693PrdNum2 ,
                                          String A4692PrdNom2 ,
                                          String A728PrdRefPrv ,
                                          String A11615PrdFuncion ,
                                          String A11614PrdEINECS ,
                                          String A9734PrdNCAS ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext ,
                                          java.math.BigDecimal A13831PrdDisponi ,
                                          String AV34emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int51 = new byte[52];
      Object[] GXv_Object52 = new Object[2];
      scmdbuf = "SELECT T1.ValCod, T1.TipPrdCod, T1.EmprCod, T4.PrvNom, T1.PrvNum, T1.PrdNCAS, T1.PrdEINECS, T1.PrdFuncion, T1.PrdRefPrv, T1.PrdNom2, T1.PrdNum2, T1.PrdFHS, T1.PrdHS," ;
      scmdbuf += " T1.PrdGRS, T1.PrdTHELIST, T1.PrdList, T1.PrdZDHC, T1.PrdHm, T1.PrdOkotex, T1.PrdReach, T1.PrdGots, T1.PrdAox, T1.PrdRec, T2.ValDsc, T3.TipPrdDsc, T1.PrdPreAct," ;
      scmdbuf += " T1.PrdCanPen, T1.PrdExiAlm - T1.PrdCanRes AS PrdDisponi, T1.PrdNom, T1.PrdNum, T1.PrdExiAlm, T1.PrdCanRes FROM (((TXPPRODUC T1 INNER JOIN TXPTIPVAL T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.ValCod = T1.ValCod) LEFT JOIN TXPTIPPRD T3 ON T3.EmprCod = T1.EmprCod AND T3.TipPrdCod = T1.TipPrdCod) INNER JOIN TXPPRVGEN T4 ON T4.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T4.PrvNum = T1.PrvNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV101Stocksquimicos_listadodeproductos_wcds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV100Stocksquimicos_listadodeproductos_wcds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int51[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Stocksquimicos_listadodeproductos_wcds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int51[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Stocksquimicos_listadodeproductos_wcds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV102Stocksquimicos_listadodeproductos_wcds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int51[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Stocksquimicos_listadodeproductos_wcds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int51[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104Stocksquimicos_listadodeproductos_wcds_6_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int51[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Stocksquimicos_listadodeproductos_wcds_7_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int51[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Stocksquimicos_listadodeproductos_wcds_8_tfprdcanres)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes >= ?)");
      }
      else
      {
         GXv_int51[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV107Stocksquimicos_listadodeproductos_wcds_9_tfprdcanres_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes <= ?)");
      }
      else
      {
         GXv_int51[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV108Stocksquimicos_listadodeproductos_wcds_10_tfprddisponible)==0) )
      {
         addWhere(sWhereString, "(( T1.PrdExiAlm - T1.PrdCanRes) >= ?)");
      }
      else
      {
         GXv_int51[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV109Stocksquimicos_listadodeproductos_wcds_11_tfprddisponible_to)==0) )
      {
         addWhere(sWhereString, "(( T1.PrdExiAlm - T1.PrdCanRes) <= ?)");
      }
      else
      {
         GXv_int51[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV110Stocksquimicos_listadodeproductos_wcds_12_tfprdcanpen)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen >= ?)");
      }
      else
      {
         GXv_int51[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV111Stocksquimicos_listadodeproductos_wcds_13_tfprdcanpen_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen <= ?)");
      }
      else
      {
         GXv_int51[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Stocksquimicos_listadodeproductos_wcds_14_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int51[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Stocksquimicos_listadodeproductos_wcds_15_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int51[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Stocksquimicos_listadodeproductos_wcds_17_tftipprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV114Stocksquimicos_listadodeproductos_wcds_16_tftipprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int51[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Stocksquimicos_listadodeproductos_wcds_17_tftipprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipPrdDsc = ?)");
      }
      else
      {
         GXv_int51[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Stocksquimicos_listadodeproductos_wcds_19_tfvaldsc_sel)==0) && ( ! (GXutil.strcmp("", AV116Stocksquimicos_listadodeproductos_wcds_18_tfvaldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int51[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Stocksquimicos_listadodeproductos_wcds_19_tfvaldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ValDsc = ?)");
      }
      else
      {
         GXv_int51[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Stocksquimicos_listadodeproductos_wcds_21_tfprdrec_sel)==0) && ( ! (GXutil.strcmp("", AV118Stocksquimicos_listadodeproductos_wcds_20_tfprdrec)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdRec) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int51[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Stocksquimicos_listadodeproductos_wcds_21_tfprdrec_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdRec = ?)");
      }
      else
      {
         GXv_int51[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV120Stocksquimicos_listadodeproductos_wcds_22_tfprdaox)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAox >= ?)");
      }
      else
      {
         GXv_int51[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Stocksquimicos_listadodeproductos_wcds_23_tfprdaox_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAox <= ?)");
      }
      else
      {
         GXv_int51[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Stocksquimicos_listadodeproductos_wcds_25_tfprdgots_sel)==0) && ( ! (GXutil.strcmp("", AV122Stocksquimicos_listadodeproductos_wcds_24_tfprdgots)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdGots) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int51[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Stocksquimicos_listadodeproductos_wcds_25_tfprdgots_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdGots = ?)");
      }
      else
      {
         GXv_int51[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Stocksquimicos_listadodeproductos_wcds_27_tfprdreach_sel)==0) && ( ! (GXutil.strcmp("", AV124Stocksquimicos_listadodeproductos_wcds_26_tfprdreach)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdReach) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int51[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Stocksquimicos_listadodeproductos_wcds_27_tfprdreach_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdReach = ?)");
      }
      else
      {
         GXv_int51[26] = (byte)(1) ;
      }
      if ( AV126Stocksquimicos_listadodeproductos_wcds_28_tfprdokotex_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV126Stocksquimicos_listadodeproductos_wcds_28_tfprdokotex_sels, "T1.PrdOkotex IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV128Stocksquimicos_listadodeproductos_wcds_30_tfprdhm_sel)==0) && ( ! (GXutil.strcmp("", AV127Stocksquimicos_listadodeproductos_wcds_29_tfprdhm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdHm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int51[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV128Stocksquimicos_listadodeproductos_wcds_30_tfprdhm_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdHm = ?)");
      }
      else
      {
         GXv_int51[28] = (byte)(1) ;
      }
      if ( AV129Stocksquimicos_listadodeproductos_wcds_31_tfprdzdhc_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV129Stocksquimicos_listadodeproductos_wcds_31_tfprdzdhc_sels, "T1.PrdZDHC IN (", ")")+")");
      }
      if ( AV130Stocksquimicos_listadodeproductos_wcds_32_tfprdlist_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV130Stocksquimicos_listadodeproductos_wcds_32_tfprdlist_sels, "T1.PrdList IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV132Stocksquimicos_listadodeproductos_wcds_34_tfprdthelist_sel)==0) && ( ! (GXutil.strcmp("", AV131Stocksquimicos_listadodeproductos_wcds_33_tfprdthelist)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdTHELIST) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int51[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV132Stocksquimicos_listadodeproductos_wcds_34_tfprdthelist_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdTHELIST = ?)");
      }
      else
      {
         GXv_int51[30] = (byte)(1) ;
      }
      if ( AV133Stocksquimicos_listadodeproductos_wcds_35_tfprdgrs_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV133Stocksquimicos_listadodeproductos_wcds_35_tfprdgrs_sels, "T1.PrdGRS IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV135Stocksquimicos_listadodeproductos_wcds_37_tfprdhs_sel)==0) && ( ! (GXutil.strcmp("", AV134Stocksquimicos_listadodeproductos_wcds_36_tfprdhs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdHS) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int51[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Stocksquimicos_listadodeproductos_wcds_37_tfprdhs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdHS = ?)");
      }
      else
      {
         GXv_int51[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV136Stocksquimicos_listadodeproductos_wcds_38_tfprdfhs)) )
      {
         addWhere(sWhereString, "(T1.PrdFHS >= ?)");
      }
      else
      {
         GXv_int51[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV138Stocksquimicos_listadodeproductos_wcds_40_tfprdnum2_sel)==0) && ( ! (GXutil.strcmp("", AV137Stocksquimicos_listadodeproductos_wcds_39_tfprdnum2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int51[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV138Stocksquimicos_listadodeproductos_wcds_40_tfprdnum2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum2 = ?)");
      }
      else
      {
         GXv_int51[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV140Stocksquimicos_listadodeproductos_wcds_42_tfprdnom2_sel)==0) && ( ! (GXutil.strcmp("", AV139Stocksquimicos_listadodeproductos_wcds_41_tfprdnom2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int51[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV140Stocksquimicos_listadodeproductos_wcds_42_tfprdnom2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom2 = ?)");
      }
      else
      {
         GXv_int51[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV142Stocksquimicos_listadodeproductos_wcds_44_tfprdrefprv_sel)==0) && ( ! (GXutil.strcmp("", AV141Stocksquimicos_listadodeproductos_wcds_43_tfprdrefprv)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdRefPrv) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int51[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV142Stocksquimicos_listadodeproductos_wcds_44_tfprdrefprv_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdRefPrv = ?)");
      }
      else
      {
         GXv_int51[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV144Stocksquimicos_listadodeproductos_wcds_46_tfprdfuncion_sel)==0) && ( ! (GXutil.strcmp("", AV143Stocksquimicos_listadodeproductos_wcds_45_tfprdfuncion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdFuncion) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int51[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV144Stocksquimicos_listadodeproductos_wcds_46_tfprdfuncion_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdFuncion = ?)");
      }
      else
      {
         GXv_int51[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV146Stocksquimicos_listadodeproductos_wcds_48_tfprdeinecs_sel)==0) && ( ! (GXutil.strcmp("", AV145Stocksquimicos_listadodeproductos_wcds_47_tfprdeinecs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdEINECS) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int51[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV146Stocksquimicos_listadodeproductos_wcds_48_tfprdeinecs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdEINECS = ?)");
      }
      else
      {
         GXv_int51[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV148Stocksquimicos_listadodeproductos_wcds_50_tfprdncas_sel)==0) && ( ! (GXutil.strcmp("", AV147Stocksquimicos_listadodeproductos_wcds_49_tfprdncas)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNCAS) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int51[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV148Stocksquimicos_listadodeproductos_wcds_50_tfprdncas_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNCAS = ?)");
      }
      else
      {
         GXv_int51[45] = (byte)(1) ;
      }
      if ( ! (0==AV149Stocksquimicos_listadodeproductos_wcds_51_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int51[46] = (byte)(1) ;
      }
      if ( ! (0==AV150Stocksquimicos_listadodeproductos_wcds_52_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int51[47] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV152Stocksquimicos_listadodeproductos_wcds_54_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV151Stocksquimicos_listadodeproductos_wcds_53_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int51[48] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV152Stocksquimicos_listadodeproductos_wcds_54_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.PrvNom = ?)");
      }
      else
      {
         GXv_int51[49] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV35PrdNumfrom)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum >= ?)");
      }
      else
      {
         GXv_int51[50] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV36PrdnumTo)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum <= ?)");
      }
      else
      {
         GXv_int51[51] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNom" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdExiAlm" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdExiAlm DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdCanRes" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdCanRes DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdCanPen" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdCanPen DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdPreAct" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdPreAct DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.TipPrdDsc" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.TipPrdDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.ValDsc" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.ValDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdRec" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdRec DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdGots" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdGots DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdGRS" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdGRS DESC" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum2" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum2 DESC" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNom2" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNom2 DESC" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdRefPrv" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdRefPrv DESC" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdFuncion" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdFuncion DESC" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdEINECS" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdEINECS DESC" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNCAS" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNCAS DESC" ;
      }
      else if ( ( AV12OrderedBy == 18 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvNum" ;
      }
      else if ( ( AV12OrderedBy == 18 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 19 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.PrvNom" ;
      }
      else if ( ( AV12OrderedBy == 19 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.PrvNom DESC" ;
      }
      GXv_Object52[0] = scmdbuf ;
      GXv_Object52[1] = GXv_int51 ;
      return GXv_Object52 ;
   }

   protected Object[] conditional_H01KX3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A5888PrdOkotex ,
                                          GXSimpleCollection<String> AV126Stocksquimicos_listadodeproductos_wcds_28_tfprdokotex_sels ,
                                          String A13301PrdZDHC ,
                                          GXSimpleCollection<String> AV129Stocksquimicos_listadodeproductos_wcds_31_tfprdzdhc_sels ,
                                          String A11687PrdList ,
                                          GXSimpleCollection<String> AV130Stocksquimicos_listadodeproductos_wcds_32_tfprdlist_sels ,
                                          String A13974PrdGRS ,
                                          GXSimpleCollection<String> AV133Stocksquimicos_listadodeproductos_wcds_35_tfprdgrs_sels ,
                                          String AV101Stocksquimicos_listadodeproductos_wcds_3_tfprdnum_sel ,
                                          String AV100Stocksquimicos_listadodeproductos_wcds_2_tfprdnum ,
                                          String AV103Stocksquimicos_listadodeproductos_wcds_5_tfprdnom_sel ,
                                          String AV102Stocksquimicos_listadodeproductos_wcds_4_tfprdnom ,
                                          java.math.BigDecimal AV104Stocksquimicos_listadodeproductos_wcds_6_tfprdexialm ,
                                          java.math.BigDecimal AV105Stocksquimicos_listadodeproductos_wcds_7_tfprdexialm_to ,
                                          java.math.BigDecimal AV106Stocksquimicos_listadodeproductos_wcds_8_tfprdcanres ,
                                          java.math.BigDecimal AV107Stocksquimicos_listadodeproductos_wcds_9_tfprdcanres_to ,
                                          java.math.BigDecimal AV108Stocksquimicos_listadodeproductos_wcds_10_tfprddisponible ,
                                          java.math.BigDecimal AV109Stocksquimicos_listadodeproductos_wcds_11_tfprddisponible_to ,
                                          java.math.BigDecimal AV110Stocksquimicos_listadodeproductos_wcds_12_tfprdcanpen ,
                                          java.math.BigDecimal AV111Stocksquimicos_listadodeproductos_wcds_13_tfprdcanpen_to ,
                                          java.math.BigDecimal AV112Stocksquimicos_listadodeproductos_wcds_14_tfprdpreact ,
                                          java.math.BigDecimal AV113Stocksquimicos_listadodeproductos_wcds_15_tfprdpreact_to ,
                                          String AV115Stocksquimicos_listadodeproductos_wcds_17_tftipprddsc_sel ,
                                          String AV114Stocksquimicos_listadodeproductos_wcds_16_tftipprddsc ,
                                          String AV117Stocksquimicos_listadodeproductos_wcds_19_tfvaldsc_sel ,
                                          String AV116Stocksquimicos_listadodeproductos_wcds_18_tfvaldsc ,
                                          String AV119Stocksquimicos_listadodeproductos_wcds_21_tfprdrec_sel ,
                                          String AV118Stocksquimicos_listadodeproductos_wcds_20_tfprdrec ,
                                          java.math.BigDecimal AV120Stocksquimicos_listadodeproductos_wcds_22_tfprdaox ,
                                          java.math.BigDecimal AV121Stocksquimicos_listadodeproductos_wcds_23_tfprdaox_to ,
                                          String AV123Stocksquimicos_listadodeproductos_wcds_25_tfprdgots_sel ,
                                          String AV122Stocksquimicos_listadodeproductos_wcds_24_tfprdgots ,
                                          String AV125Stocksquimicos_listadodeproductos_wcds_27_tfprdreach_sel ,
                                          String AV124Stocksquimicos_listadodeproductos_wcds_26_tfprdreach ,
                                          int AV126Stocksquimicos_listadodeproductos_wcds_28_tfprdokotex_sels_size ,
                                          String AV128Stocksquimicos_listadodeproductos_wcds_30_tfprdhm_sel ,
                                          String AV127Stocksquimicos_listadodeproductos_wcds_29_tfprdhm ,
                                          int AV129Stocksquimicos_listadodeproductos_wcds_31_tfprdzdhc_sels_size ,
                                          int AV130Stocksquimicos_listadodeproductos_wcds_32_tfprdlist_sels_size ,
                                          String AV132Stocksquimicos_listadodeproductos_wcds_34_tfprdthelist_sel ,
                                          String AV131Stocksquimicos_listadodeproductos_wcds_33_tfprdthelist ,
                                          int AV133Stocksquimicos_listadodeproductos_wcds_35_tfprdgrs_sels_size ,
                                          String AV135Stocksquimicos_listadodeproductos_wcds_37_tfprdhs_sel ,
                                          String AV134Stocksquimicos_listadodeproductos_wcds_36_tfprdhs ,
                                          java.util.Date AV136Stocksquimicos_listadodeproductos_wcds_38_tfprdfhs ,
                                          String AV138Stocksquimicos_listadodeproductos_wcds_40_tfprdnum2_sel ,
                                          String AV137Stocksquimicos_listadodeproductos_wcds_39_tfprdnum2 ,
                                          String AV140Stocksquimicos_listadodeproductos_wcds_42_tfprdnom2_sel ,
                                          String AV139Stocksquimicos_listadodeproductos_wcds_41_tfprdnom2 ,
                                          String AV142Stocksquimicos_listadodeproductos_wcds_44_tfprdrefprv_sel ,
                                          String AV141Stocksquimicos_listadodeproductos_wcds_43_tfprdrefprv ,
                                          String AV144Stocksquimicos_listadodeproductos_wcds_46_tfprdfuncion_sel ,
                                          String AV143Stocksquimicos_listadodeproductos_wcds_45_tfprdfuncion ,
                                          String AV146Stocksquimicos_listadodeproductos_wcds_48_tfprdeinecs_sel ,
                                          String AV145Stocksquimicos_listadodeproductos_wcds_47_tfprdeinecs ,
                                          String AV148Stocksquimicos_listadodeproductos_wcds_50_tfprdncas_sel ,
                                          String AV147Stocksquimicos_listadodeproductos_wcds_49_tfprdncas ,
                                          int AV149Stocksquimicos_listadodeproductos_wcds_51_tfprvnum ,
                                          int AV150Stocksquimicos_listadodeproductos_wcds_52_tfprvnum_to ,
                                          String AV152Stocksquimicos_listadodeproductos_wcds_54_tfprvnom_sel ,
                                          String AV151Stocksquimicos_listadodeproductos_wcds_53_tfprvnom ,
                                          String AV35PrdNumfrom ,
                                          String AV36PrdnumTo ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          java.math.BigDecimal A684PrdCanPen ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          String A6302TipPrdDsc ,
                                          String A857ValDsc ,
                                          String A727PrdRec ,
                                          java.math.BigDecimal A9733PrdAox ,
                                          String A11363PrdGots ,
                                          String A5887PrdReach ,
                                          String A11364PrdHm ,
                                          String A13302PrdTHELIST ,
                                          String A9741PrdHS ,
                                          java.util.Date A9742PrdFHS ,
                                          String A4693PrdNum2 ,
                                          String A4692PrdNom2 ,
                                          String A728PrdRefPrv ,
                                          String A11615PrdFuncion ,
                                          String A11614PrdEINECS ,
                                          String A9734PrdNCAS ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV99Stocksquimicos_listadodeproductos_wcds_1_filterfulltext ,
                                          java.math.BigDecimal A13831PrdDisponi ,
                                          String AV34emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int54 = new byte[52];
      Object[] GXv_Object55 = new Object[2];
      scmdbuf = "SELECT T1.ValCod, T1.TipPrdCod, T1.EmprCod, T4.PrvNom, T1.PrvNum, T1.PrdNCAS, T1.PrdEINECS, T1.PrdFuncion, T1.PrdRefPrv, T1.PrdNom2, T1.PrdNum2, T1.PrdFHS, T1.PrdHS," ;
      scmdbuf += " T1.PrdGRS, T1.PrdTHELIST, T1.PrdList, T1.PrdZDHC, T1.PrdHm, T1.PrdOkotex, T1.PrdReach, T1.PrdGots, T1.PrdAox, T1.PrdRec, T2.ValDsc, T3.TipPrdDsc, T1.PrdPreAct," ;
      scmdbuf += " T1.PrdCanPen, T1.PrdExiAlm - T1.PrdCanRes AS PrdDisponi, T1.PrdNom, T1.PrdNum, T1.PrdExiAlm, T1.PrdCanRes FROM (((TXPPRODUC T1 INNER JOIN TXPTIPVAL T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.ValCod = T1.ValCod) LEFT JOIN TXPTIPPRD T3 ON T3.EmprCod = T1.EmprCod AND T3.TipPrdCod = T1.TipPrdCod) INNER JOIN TXPPRVGEN T4 ON T4.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T4.PrvNum = T1.PrvNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV101Stocksquimicos_listadodeproductos_wcds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV100Stocksquimicos_listadodeproductos_wcds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int54[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Stocksquimicos_listadodeproductos_wcds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int54[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Stocksquimicos_listadodeproductos_wcds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV102Stocksquimicos_listadodeproductos_wcds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int54[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Stocksquimicos_listadodeproductos_wcds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int54[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104Stocksquimicos_listadodeproductos_wcds_6_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int54[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Stocksquimicos_listadodeproductos_wcds_7_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int54[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Stocksquimicos_listadodeproductos_wcds_8_tfprdcanres)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes >= ?)");
      }
      else
      {
         GXv_int54[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV107Stocksquimicos_listadodeproductos_wcds_9_tfprdcanres_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes <= ?)");
      }
      else
      {
         GXv_int54[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV108Stocksquimicos_listadodeproductos_wcds_10_tfprddisponible)==0) )
      {
         addWhere(sWhereString, "(( T1.PrdExiAlm - T1.PrdCanRes) >= ?)");
      }
      else
      {
         GXv_int54[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV109Stocksquimicos_listadodeproductos_wcds_11_tfprddisponible_to)==0) )
      {
         addWhere(sWhereString, "(( T1.PrdExiAlm - T1.PrdCanRes) <= ?)");
      }
      else
      {
         GXv_int54[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV110Stocksquimicos_listadodeproductos_wcds_12_tfprdcanpen)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen >= ?)");
      }
      else
      {
         GXv_int54[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV111Stocksquimicos_listadodeproductos_wcds_13_tfprdcanpen_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen <= ?)");
      }
      else
      {
         GXv_int54[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Stocksquimicos_listadodeproductos_wcds_14_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int54[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Stocksquimicos_listadodeproductos_wcds_15_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int54[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Stocksquimicos_listadodeproductos_wcds_17_tftipprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV114Stocksquimicos_listadodeproductos_wcds_16_tftipprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int54[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Stocksquimicos_listadodeproductos_wcds_17_tftipprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipPrdDsc = ?)");
      }
      else
      {
         GXv_int54[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Stocksquimicos_listadodeproductos_wcds_19_tfvaldsc_sel)==0) && ( ! (GXutil.strcmp("", AV116Stocksquimicos_listadodeproductos_wcds_18_tfvaldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int54[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Stocksquimicos_listadodeproductos_wcds_19_tfvaldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ValDsc = ?)");
      }
      else
      {
         GXv_int54[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Stocksquimicos_listadodeproductos_wcds_21_tfprdrec_sel)==0) && ( ! (GXutil.strcmp("", AV118Stocksquimicos_listadodeproductos_wcds_20_tfprdrec)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdRec) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int54[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Stocksquimicos_listadodeproductos_wcds_21_tfprdrec_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdRec = ?)");
      }
      else
      {
         GXv_int54[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV120Stocksquimicos_listadodeproductos_wcds_22_tfprdaox)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAox >= ?)");
      }
      else
      {
         GXv_int54[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Stocksquimicos_listadodeproductos_wcds_23_tfprdaox_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAox <= ?)");
      }
      else
      {
         GXv_int54[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Stocksquimicos_listadodeproductos_wcds_25_tfprdgots_sel)==0) && ( ! (GXutil.strcmp("", AV122Stocksquimicos_listadodeproductos_wcds_24_tfprdgots)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdGots) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int54[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Stocksquimicos_listadodeproductos_wcds_25_tfprdgots_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdGots = ?)");
      }
      else
      {
         GXv_int54[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Stocksquimicos_listadodeproductos_wcds_27_tfprdreach_sel)==0) && ( ! (GXutil.strcmp("", AV124Stocksquimicos_listadodeproductos_wcds_26_tfprdreach)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdReach) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int54[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Stocksquimicos_listadodeproductos_wcds_27_tfprdreach_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdReach = ?)");
      }
      else
      {
         GXv_int54[26] = (byte)(1) ;
      }
      if ( AV126Stocksquimicos_listadodeproductos_wcds_28_tfprdokotex_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV126Stocksquimicos_listadodeproductos_wcds_28_tfprdokotex_sels, "T1.PrdOkotex IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV128Stocksquimicos_listadodeproductos_wcds_30_tfprdhm_sel)==0) && ( ! (GXutil.strcmp("", AV127Stocksquimicos_listadodeproductos_wcds_29_tfprdhm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdHm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int54[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV128Stocksquimicos_listadodeproductos_wcds_30_tfprdhm_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdHm = ?)");
      }
      else
      {
         GXv_int54[28] = (byte)(1) ;
      }
      if ( AV129Stocksquimicos_listadodeproductos_wcds_31_tfprdzdhc_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV129Stocksquimicos_listadodeproductos_wcds_31_tfprdzdhc_sels, "T1.PrdZDHC IN (", ")")+")");
      }
      if ( AV130Stocksquimicos_listadodeproductos_wcds_32_tfprdlist_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV130Stocksquimicos_listadodeproductos_wcds_32_tfprdlist_sels, "T1.PrdList IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV132Stocksquimicos_listadodeproductos_wcds_34_tfprdthelist_sel)==0) && ( ! (GXutil.strcmp("", AV131Stocksquimicos_listadodeproductos_wcds_33_tfprdthelist)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdTHELIST) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int54[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV132Stocksquimicos_listadodeproductos_wcds_34_tfprdthelist_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdTHELIST = ?)");
      }
      else
      {
         GXv_int54[30] = (byte)(1) ;
      }
      if ( AV133Stocksquimicos_listadodeproductos_wcds_35_tfprdgrs_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV133Stocksquimicos_listadodeproductos_wcds_35_tfprdgrs_sels, "T1.PrdGRS IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV135Stocksquimicos_listadodeproductos_wcds_37_tfprdhs_sel)==0) && ( ! (GXutil.strcmp("", AV134Stocksquimicos_listadodeproductos_wcds_36_tfprdhs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdHS) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int54[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Stocksquimicos_listadodeproductos_wcds_37_tfprdhs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdHS = ?)");
      }
      else
      {
         GXv_int54[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV136Stocksquimicos_listadodeproductos_wcds_38_tfprdfhs)) )
      {
         addWhere(sWhereString, "(T1.PrdFHS >= ?)");
      }
      else
      {
         GXv_int54[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV138Stocksquimicos_listadodeproductos_wcds_40_tfprdnum2_sel)==0) && ( ! (GXutil.strcmp("", AV137Stocksquimicos_listadodeproductos_wcds_39_tfprdnum2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int54[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV138Stocksquimicos_listadodeproductos_wcds_40_tfprdnum2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum2 = ?)");
      }
      else
      {
         GXv_int54[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV140Stocksquimicos_listadodeproductos_wcds_42_tfprdnom2_sel)==0) && ( ! (GXutil.strcmp("", AV139Stocksquimicos_listadodeproductos_wcds_41_tfprdnom2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int54[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV140Stocksquimicos_listadodeproductos_wcds_42_tfprdnom2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom2 = ?)");
      }
      else
      {
         GXv_int54[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV142Stocksquimicos_listadodeproductos_wcds_44_tfprdrefprv_sel)==0) && ( ! (GXutil.strcmp("", AV141Stocksquimicos_listadodeproductos_wcds_43_tfprdrefprv)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdRefPrv) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int54[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV142Stocksquimicos_listadodeproductos_wcds_44_tfprdrefprv_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdRefPrv = ?)");
      }
      else
      {
         GXv_int54[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV144Stocksquimicos_listadodeproductos_wcds_46_tfprdfuncion_sel)==0) && ( ! (GXutil.strcmp("", AV143Stocksquimicos_listadodeproductos_wcds_45_tfprdfuncion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdFuncion) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int54[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV144Stocksquimicos_listadodeproductos_wcds_46_tfprdfuncion_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdFuncion = ?)");
      }
      else
      {
         GXv_int54[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV146Stocksquimicos_listadodeproductos_wcds_48_tfprdeinecs_sel)==0) && ( ! (GXutil.strcmp("", AV145Stocksquimicos_listadodeproductos_wcds_47_tfprdeinecs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdEINECS) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int54[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV146Stocksquimicos_listadodeproductos_wcds_48_tfprdeinecs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdEINECS = ?)");
      }
      else
      {
         GXv_int54[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV148Stocksquimicos_listadodeproductos_wcds_50_tfprdncas_sel)==0) && ( ! (GXutil.strcmp("", AV147Stocksquimicos_listadodeproductos_wcds_49_tfprdncas)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNCAS) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int54[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV148Stocksquimicos_listadodeproductos_wcds_50_tfprdncas_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNCAS = ?)");
      }
      else
      {
         GXv_int54[45] = (byte)(1) ;
      }
      if ( ! (0==AV149Stocksquimicos_listadodeproductos_wcds_51_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int54[46] = (byte)(1) ;
      }
      if ( ! (0==AV150Stocksquimicos_listadodeproductos_wcds_52_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int54[47] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV152Stocksquimicos_listadodeproductos_wcds_54_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV151Stocksquimicos_listadodeproductos_wcds_53_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int54[48] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV152Stocksquimicos_listadodeproductos_wcds_54_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.PrvNom = ?)");
      }
      else
      {
         GXv_int54[49] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV35PrdNumfrom)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum >= ?)");
      }
      else
      {
         GXv_int54[50] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV36PrdnumTo)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum <= ?)");
      }
      else
      {
         GXv_int54[51] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNom" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdExiAlm" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdExiAlm DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdCanRes" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdCanRes DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdCanPen" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdCanPen DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdPreAct" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdPreAct DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.TipPrdDsc" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.TipPrdDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.ValDsc" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.ValDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdRec" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdRec DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdGots" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdGots DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdGRS" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdGRS DESC" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum2" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum2 DESC" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNom2" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNom2 DESC" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdRefPrv" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdRefPrv DESC" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdFuncion" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdFuncion DESC" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdEINECS" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdEINECS DESC" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNCAS" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNCAS DESC" ;
      }
      else if ( ( AV12OrderedBy == 18 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvNum" ;
      }
      else if ( ( AV12OrderedBy == 18 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 19 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.PrvNom" ;
      }
      else if ( ( AV12OrderedBy == 19 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.PrvNom DESC" ;
      }
      GXv_Object55[0] = scmdbuf ;
      GXv_Object55[1] = GXv_int54 ;
      return GXv_Object55 ;
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
                  return conditional_H01KX2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , (String)dynConstraints[6] , (GXSimpleCollection<String>)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (java.util.Date)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , ((Number) dynConstraints[57]).intValue() , ((Number) dynConstraints[58]).intValue() , (String)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] , (java.math.BigDecimal)dynConstraints[65] , (java.math.BigDecimal)dynConstraints[66] , (java.math.BigDecimal)dynConstraints[67] , (java.math.BigDecimal)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (java.math.BigDecimal)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] , (java.util.Date)dynConstraints[78] , (String)dynConstraints[79] , (String)dynConstraints[80] , (String)dynConstraints[81] , (String)dynConstraints[82] , (String)dynConstraints[83] , (String)dynConstraints[84] , ((Number) dynConstraints[85]).intValue() , (String)dynConstraints[86] , ((Number) dynConstraints[87]).shortValue() , ((Boolean) dynConstraints[88]).booleanValue() , (String)dynConstraints[89] , (java.math.BigDecimal)dynConstraints[90] , (String)dynConstraints[91] , (String)dynConstraints[92] );
            case 1 :
                  return conditional_H01KX3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , (String)dynConstraints[6] , (GXSimpleCollection<String>)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (java.util.Date)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , ((Number) dynConstraints[57]).intValue() , ((Number) dynConstraints[58]).intValue() , (String)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] , (java.math.BigDecimal)dynConstraints[65] , (java.math.BigDecimal)dynConstraints[66] , (java.math.BigDecimal)dynConstraints[67] , (java.math.BigDecimal)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (java.math.BigDecimal)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] , (java.util.Date)dynConstraints[78] , (String)dynConstraints[79] , (String)dynConstraints[80] , (String)dynConstraints[81] , (String)dynConstraints[82] , (String)dynConstraints[83] , (String)dynConstraints[84] , ((Number) dynConstraints[85]).intValue() , (String)dynConstraints[86] , ((Number) dynConstraints[87]).shortValue() , ((Boolean) dynConstraints[88]).booleanValue() , (String)dynConstraints[89] , (java.math.BigDecimal)dynConstraints[90] , (String)dynConstraints[91] , (String)dynConstraints[92] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01KX2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01KX3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((String[]) buf[7])[0] = rslt.getString(6, 30);
               ((String[]) buf[8])[0] = rslt.getString(7, 40);
               ((String[]) buf[9])[0] = rslt.getString(8, 50);
               ((String[]) buf[10])[0] = rslt.getString(9, 30);
               ((String[]) buf[11])[0] = rslt.getString(10, 40);
               ((String[]) buf[12])[0] = rslt.getString(11, 16);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(12);
               ((String[]) buf[14])[0] = rslt.getString(13, 1);
               ((String[]) buf[15])[0] = rslt.getString(14, 1);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(15, 4);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(16, 1);
               ((String[]) buf[20])[0] = rslt.getString(17, 1);
               ((String[]) buf[21])[0] = rslt.getString(18, 1);
               ((String[]) buf[22])[0] = rslt.getString(19, 1);
               ((String[]) buf[23])[0] = rslt.getString(20, 1);
               ((String[]) buf[24])[0] = rslt.getString(21, 1);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(22,2);
               ((String[]) buf[26])[0] = rslt.getString(23, 1);
               ((String[]) buf[27])[0] = rslt.getString(24, 16);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(25, 40);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(26,5);
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(27,4);
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(28,4);
               ((String[]) buf[34])[0] = rslt.getString(29, 26);
               ((String[]) buf[35])[0] = rslt.getString(30, 6);
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(31,4);
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(32,4);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((String[]) buf[7])[0] = rslt.getString(6, 30);
               ((String[]) buf[8])[0] = rslt.getString(7, 40);
               ((String[]) buf[9])[0] = rslt.getString(8, 50);
               ((String[]) buf[10])[0] = rslt.getString(9, 30);
               ((String[]) buf[11])[0] = rslt.getString(10, 40);
               ((String[]) buf[12])[0] = rslt.getString(11, 16);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(12);
               ((String[]) buf[14])[0] = rslt.getString(13, 1);
               ((String[]) buf[15])[0] = rslt.getString(14, 1);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(15, 4);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(16, 1);
               ((String[]) buf[20])[0] = rslt.getString(17, 1);
               ((String[]) buf[21])[0] = rslt.getString(18, 1);
               ((String[]) buf[22])[0] = rslt.getString(19, 1);
               ((String[]) buf[23])[0] = rslt.getString(20, 1);
               ((String[]) buf[24])[0] = rslt.getString(21, 1);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(22,2);
               ((String[]) buf[26])[0] = rslt.getString(23, 1);
               ((String[]) buf[27])[0] = rslt.getString(24, 16);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(25, 40);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(26,5);
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(27,4);
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(28,4);
               ((String[]) buf[34])[0] = rslt.getString(29, 26);
               ((String[]) buf[35])[0] = rslt.getString(30, 6);
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(31,4);
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(32,4);
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
                  stmt.setString(sIdx, (String)parms[52], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 4);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 4);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 4);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 4);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 4);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 4);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 4);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 40);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 40);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 1);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[74], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 4);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 4);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 1);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[85]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 16);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 16);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 40);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 40);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 30);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 30);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 50);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 50);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 40);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 40);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 30);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 30);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[98]).intValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[99]).intValue());
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 30);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 30);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 6);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 6);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 4);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 4);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 4);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 4);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 4);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 4);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 4);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 40);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 40);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 1);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[74], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 4);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 4);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 1);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[85]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 16);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 16);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 40);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 40);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 30);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 30);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 50);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 50);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 40);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 40);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 30);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 30);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[98]).intValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[99]).intValue());
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 30);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 30);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 6);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 6);
               }
               return;
      }
   }

}

