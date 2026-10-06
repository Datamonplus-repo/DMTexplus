package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class consultadeproduccion_packinglist_impl extends GXWebComponent
{
   public consultadeproduccion_packinglist_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public consultadeproduccion_packinglist_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultadeproduccion_packinglist_impl.class ));
   }

   public consultadeproduccion_packinglist_impl( int remoteHandle ,
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
               AV47EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47EmprCod", AV47EmprCod);
               AV48BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48BarCod), 8, 0));
               AV49BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49BarCodReo", GXutil.str( AV49BarCodReo, 1, 0));
               AV50BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50BarCodPar", AV50BarCodPar);
               AV63CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63CliCod), 6, 0));
               AV64CliNom = httpContext.GetPar( "CliNom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64CliNom", AV64CliNom);
               AV65PedidoCliente = httpContext.GetPar( "PedidoCliente") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65PedidoCliente", AV65PedidoCliente);
               AV59BarSer = httpContext.GetPar( "BarSer") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59BarSer", AV59BarSer);
               AV60BarSerDsc = httpContext.GetPar( "BarSerDsc") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60BarSerDsc", AV60BarSerDsc);
               AV61BarColNom = httpContext.GetPar( "BarColNom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61BarColNom", AV61BarColNom);
               AV62BarColNum = (int)(GXutil.lval( httpContext.GetPar( "BarColNum"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62BarColNum), 6, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV47EmprCod,Integer.valueOf(AV48BarCod),Byte.valueOf(AV49BarCodReo),AV50BarCodPar,Integer.valueOf(AV63CliCod),AV64CliNom,AV65PedidoCliente,AV59BarSer,AV60BarSerDsc,AV61BarColNom,Integer.valueOf(AV62BarColNum)});
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
            if ( ! entryPointCalled && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
            {
               AV47EmprCod = gxfirstwebparm ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47EmprCod", AV47EmprCod);
               if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
               {
                  AV48BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48BarCod), 8, 0));
                  AV49BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49BarCodReo", GXutil.str( AV49BarCodReo, 1, 0));
                  AV50BarCodPar = httpContext.GetPar( "BarCodPar") ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50BarCodPar", AV50BarCodPar);
                  AV63CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63CliCod), 6, 0));
                  AV64CliNom = httpContext.GetPar( "CliNom") ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64CliNom", AV64CliNom);
                  AV65PedidoCliente = httpContext.GetPar( "PedidoCliente") ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65PedidoCliente", AV65PedidoCliente);
                  AV59BarSer = httpContext.GetPar( "BarSer") ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59BarSer", AV59BarSer);
                  AV60BarSerDsc = httpContext.GetPar( "BarSerDsc") ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60BarSerDsc", AV60BarSerDsc);
                  AV61BarColNom = httpContext.GetPar( "BarColNom") ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61BarColNom", AV61BarColNom);
                  AV62BarColNum = (int)(GXutil.lval( httpContext.GetPar( "BarColNum"))) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62BarColNum), 6, 0));
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
      nRC_GXsfl_105 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_105"))) ;
      nGXsfl_105_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_105_idx"))) ;
      sGXsfl_105_idx = httpContext.GetPar( "sGXsfl_105_idx") ;
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
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV20ColumnsSelector);
      AV47EmprCod = httpContext.GetPar( "EmprCod") ;
      AV48BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      AV49BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      AV50BarCodPar = httpContext.GetPar( "BarCodPar") ;
      AV26TFMetTerCod = httpContext.GetPar( "TFMetTerCod") ;
      AV27TFMetTerCod_Sel = httpContext.GetPar( "TFMetTerCod_Sel") ;
      AV28TFMetPieCod = httpContext.GetPar( "TFMetPieCod") ;
      AV29TFMetPieCod_Sel = httpContext.GetPar( "TFMetPieCod_Sel") ;
      AV37TFMetPieMet = CommonUtil.decimalVal( httpContext.GetPar( "TFMetPieMet"), ".") ;
      AV38TFMetPieMet_To = CommonUtil.decimalVal( httpContext.GetPar( "TFMetPieMet_To"), ".") ;
      AV39TFMetPieKil = CommonUtil.decimalVal( httpContext.GetPar( "TFMetPieKil"), ".") ;
      AV40TFMetPieKil_To = CommonUtil.decimalVal( httpContext.GetPar( "TFMetPieKil_To"), ".") ;
      AV41TFMetPieAnc = (short)(GXutil.lval( httpContext.GetPar( "TFMetPieAnc"))) ;
      AV42TFMetPieAnc_To = (short)(GXutil.lval( httpContext.GetPar( "TFMetPieAnc_To"))) ;
      AV57TFMetPieEst = (byte)(GXutil.lval( httpContext.GetPar( "TFMetPieEst"))) ;
      AV58TFMetPieEst_To = (byte)(GXutil.lval( httpContext.GetPar( "TFMetPieEst_To"))) ;
      AV73Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV63CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
      AV64CliNom = httpContext.GetPar( "CliNom") ;
      AV65PedidoCliente = httpContext.GetPar( "PedidoCliente") ;
      AV59BarSer = httpContext.GetPar( "BarSer") ;
      AV60BarSerDsc = httpContext.GetPar( "BarSerDsc") ;
      AV61BarColNom = httpContext.GetPar( "BarColNom") ;
      AV62BarColNum = (int)(GXutil.lval( httpContext.GetPar( "BarColNum"))) ;
      AV43TotMetPieMet = CommonUtil.decimalVal( httpContext.GetPar( "TotMetPieMet"), ".") ;
      AV45TotMetPieKil = CommonUtil.decimalVal( httpContext.GetPar( "TotMetPieKil"), ".") ;
      AV75Produccion_consultadeproduccion_packinglistds_1_emprcod = httpContext.GetPar( "Produccion_consultadeproduccion_packinglistds_1_emprcod") ;
      AV76Produccion_consultadeproduccion_packinglistds_2_barcod = (int)(GXutil.lval( httpContext.GetPar( "Produccion_consultadeproduccion_packinglistds_2_barcod"))) ;
      AV77Produccion_consultadeproduccion_packinglistds_3_barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Produccion_consultadeproduccion_packinglistds_3_barcodreo"))) ;
      AV78Produccion_consultadeproduccion_packinglistds_4_barcodpar = httpContext.GetPar( "Produccion_consultadeproduccion_packinglistds_4_barcodpar") ;
      AV66moda21 = (short)(GXutil.lval( httpContext.GetPar( "moda21"))) ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV20ColumnsSelector, AV47EmprCod, AV48BarCod, AV49BarCodReo, AV50BarCodPar, AV26TFMetTerCod, AV27TFMetTerCod_Sel, AV28TFMetPieCod, AV29TFMetPieCod_Sel, AV37TFMetPieMet, AV38TFMetPieMet_To, AV39TFMetPieKil, AV40TFMetPieKil_To, AV41TFMetPieAnc, AV42TFMetPieAnc_To, AV57TFMetPieEst, AV58TFMetPieEst_To, AV73Pgmname, AV12OrderedBy, AV13OrderedDsc, AV63CliCod, AV64CliNom, AV65PedidoCliente, AV59BarSer, AV60BarSerDsc, AV61BarColNom, AV62BarColNum, AV43TotMetPieMet, AV45TotMetPieKil, AV75Produccion_consultadeproduccion_packinglistds_1_emprcod, AV76Produccion_consultadeproduccion_packinglistds_2_barcod, AV77Produccion_consultadeproduccion_packinglistds_3_barcodreo, AV78Produccion_consultadeproduccion_packinglistds_4_barcodpar, AV66moda21, A396EmprCod, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1S02( ) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            validateSpaRequest();
         }
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( ! isAjaxCallMode( ) )
            {
            }
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            ws1S02( ) ;
            if ( ! isAjaxCallMode( ) )
            {
               if ( nDynComponent == 0 )
               {
                  we1S02( ) ;
               }
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
         httpContext.writeValue( httpContext.getMessage( " Packing List", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.produccion.consultadeproduccion_packinglist", new String[] {GXutil.URLEncode(GXutil.rtrim(AV47EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV48BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV49BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV50BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV63CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV64CliNom)),GXutil.URLEncode(GXutil.rtrim(AV65PedidoCliente)),GXutil.URLEncode(GXutil.rtrim(AV59BarSer)),GXutil.URLEncode(GXutil.rtrim(AV60BarSerDsc)),GXutil.URLEncode(GXutil.rtrim(AV61BarColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV62BarColNum,6,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","CliCod","CliNom","PedidoCliente","BarSer","BarSerDsc","BarColNom","BarColNum"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMETPIEMET", getSecureSignedToken( sPrefix, localUtil.format( AV43TotMetPieMet, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMETPIEKIL", getSecureSignedToken( sPrefix, localUtil.format( AV45TotMetPieKil, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV66moda21), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ConsultadeProduccion_PackingList");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV73Pgmname, "")));
      forbiddenHiddens.add("EmprCod", GXutil.rtrim( localUtil.format( A396EmprCod, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("produccion\\consultadeproduccion_packinglist:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_105", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_105, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV47EmprCod", GXutil.rtrim( wcpOAV47EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV48BarCod", GXutil.ltrim( localUtil.ntoc( wcpOAV48BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV49BarCodReo", GXutil.ltrim( localUtil.ntoc( wcpOAV49BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV50BarCodPar", GXutil.rtrim( wcpOAV50BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV63CliCod", GXutil.ltrim( localUtil.ntoc( wcpOAV63CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV64CliNom", GXutil.rtrim( wcpOAV64CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV65PedidoCliente", GXutil.rtrim( wcpOAV65PedidoCliente));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV59BarSer", GXutil.rtrim( wcpOAV59BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV60BarSerDsc", GXutil.rtrim( wcpOAV60BarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV61BarColNom", GXutil.rtrim( wcpOAV61BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV62BarColNum", GXutil.ltrim( localUtil.ntoc( wcpOAV62BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV47EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETTERCOD", GXutil.rtrim( AV26TFMetTerCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETTERCOD_SEL", GXutil.rtrim( AV27TFMetTerCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETPIECOD", GXutil.rtrim( AV28TFMetPieCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETPIECOD_SEL", GXutil.rtrim( AV29TFMetPieCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETPIEMET", GXutil.ltrim( localUtil.ntoc( AV37TFMetPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETPIEMET_TO", GXutil.ltrim( localUtil.ntoc( AV38TFMetPieMet_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETPIEKIL", GXutil.ltrim( localUtil.ntoc( AV39TFMetPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETPIEKIL_TO", GXutil.ltrim( localUtil.ntoc( AV40TFMetPieKil_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETPIEANC", GXutil.ltrim( localUtil.ntoc( AV41TFMetPieAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETPIEANC_TO", GXutil.ltrim( localUtil.ntoc( AV42TFMetPieAnc_To, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETPIEEST", GXutil.ltrim( localUtil.ntoc( AV57TFMetPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETPIEEST_TO", GXutil.ltrim( localUtil.ntoc( AV58TFMetPieEst_To, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTMETPIEMET", GXutil.ltrim( localUtil.ntoc( AV43TotMetPieMet, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMETPIEMET", getSecureSignedToken( sPrefix, localUtil.format( AV43TotMetPieMet, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTMETPIEKIL", GXutil.ltrim( localUtil.ntoc( AV45TotMetPieKil, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMETPIEKIL", getSecureSignedToken( sPrefix, localUtil.format( AV45TotMetPieKil, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"METPIEOBS", A4917MetPieObs);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMODA21", GXutil.ltrim( localUtil.ntoc( AV66moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV66moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRODUCCION_CONSULTADEPRODUCCION_PACKINGLISTDS_1_EMPRCOD", GXutil.rtrim( AV75Produccion_consultadeproduccion_packinglistds_1_emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRODUCCION_CONSULTADEPRODUCCION_PACKINGLISTDS_2_BARCOD", GXutil.ltrim( localUtil.ntoc( AV76Produccion_consultadeproduccion_packinglistds_2_barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRODUCCION_CONSULTADEPRODUCCION_PACKINGLISTDS_3_BARCODREO", GXutil.ltrim( localUtil.ntoc( AV77Produccion_consultadeproduccion_packinglistds_3_barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRODUCCION_CONSULTADEPRODUCCION_PACKINGLISTDS_4_BARCODPAR", GXutil.rtrim( AV78Produccion_consultadeproduccion_packinglistds_4_barcodpar));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
   }

   public void renderHtmlCloseForm1S02( )
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
      return "Produccion.ConsultadeProduccion_PackingList" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Packing List", "") ;
   }

   public void wb1S00( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.produccion.consultadeproduccion_packinglist");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, sPrefix, "false");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablacontent_Internalname, 1, 0, "px", 0, "px", "TableContent15", "left", "top", "", "", "div");
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
         ucDvpanel_unnamedtable1.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable1_Internalname, sPrefix+"DVPANEL_UNNAMEDTABLE1Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_UNNAMEDTABLE1Container"+"UnnamedTable1"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcod_Internalname, httpContext.getMessage( "Nº Hdr", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV48BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV48BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV48BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ConsultadeProduccion_PackingList.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodreo_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodreo_Internalname, httpContext.getMessage( "R", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodreo_Internalname, GXutil.ltrim( localUtil.ntoc( AV49BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV49BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(AV49BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodreo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodreo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ConsultadeProduccion_PackingList.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodpar_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodpar_Internalname, httpContext.getMessage( "P", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodpar_Internalname, GXutil.rtrim( AV50BarCodPar), GXutil.rtrim( localUtil.format( AV50BarCodPar, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodpar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodpar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ConsultadeProduccion_PackingList.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClicod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV63CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV63CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV63CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ConsultadeProduccion_PackingList.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClinom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClinom_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClinom_Internalname, GXutil.rtrim( AV64CliNom), GXutil.rtrim( localUtil.format( AV64CliNom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClinom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClinom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ConsultadeProduccion_PackingList.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPedidocliente_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPedidocliente_Internalname, httpContext.getMessage( "Pedido Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPedidocliente_Internalname, GXutil.rtrim( AV65PedidoCliente), GXutil.rtrim( localUtil.format( AV65PedidoCliente, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPedidocliente_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPedidocliente_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ConsultadeProduccion_PackingList.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarser_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarser_Internalname, httpContext.getMessage( "Articulo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarser_Internalname, GXutil.rtrim( AV59BarSer), GXutil.rtrim( localUtil.format( AV59BarSer, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarser_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarser_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ConsultadeProduccion_PackingList.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarserdsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarserdsc_Internalname, httpContext.getMessage( "Descripción", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarserdsc_Internalname, GXutil.rtrim( AV60BarSerDsc), GXutil.rtrim( localUtil.format( AV60BarSerDsc, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarserdsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarserdsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ConsultadeProduccion_PackingList.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnom_Internalname, httpContext.getMessage( "Color", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnom_Internalname, GXutil.rtrim( AV61BarColNom), GXutil.rtrim( localUtil.format( AV61BarColNom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ConsultadeProduccion_PackingList.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnum_Internalname, httpContext.getMessage( "Numero", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnum_Internalname, GXutil.ltrim( localUtil.ntoc( AV62BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV62BarColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV62BarColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ConsultadeProduccion_PackingList.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 105, 3, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\ConsultadeProduccion_PackingList.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 105, 3, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\ConsultadeProduccion_PackingList.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 105, 3, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\ConsultadeProduccion_PackingList.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_82_1S02( true) ;
      }
      else
      {
         wb_table1_82_1S02( false) ;
      }
      return  ;
   }

   public void wb_table1_82_1S02e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarnhdr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarnhdr_Internalname, httpContext.getMessage( "N Hdr", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'" + sPrefix + "',false,'" + sGXsfl_105_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarnhdr_Internalname, GXutil.rtrim( AV56BarNHdr), GXutil.rtrim( localUtil.format( AV56BarNHdr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,91);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarnhdr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarnhdr_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ConsultadeProduccion_PackingList.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarmtr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarmtr_Internalname, httpContext.getMessage( "Metros", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'" + sPrefix + "',false,'" + sGXsfl_105_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarmtr_Internalname, GXutil.ltrim( localUtil.ntoc( AV53BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarmtr_Enabled!=0) ? localUtil.format( AV53BarMtr, "ZZZZZ9.99") : localUtil.format( AV53BarMtr, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,95);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarmtr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarmtr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ConsultadeProduccion_PackingList.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarkgm_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarkgm_Internalname, httpContext.getMessage( "Kilos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'" + sPrefix + "',false,'" + sGXsfl_105_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarkgm_Internalname, GXutil.ltrim( localUtil.ntoc( AV55BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarkgm_Enabled!=0) ? localUtil.format( AV55BarKgm, "ZZZZZ9.99") : localUtil.format( AV55BarKgm, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,99);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarkgm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarkgm_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ConsultadeProduccion_PackingList.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol105( ) ;
      }
      if ( wbEnd == 105 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_105 = (int)(nGXsfl_105_idx-1) ;
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row Invisible", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table2_120_1S02( true) ;
      }
      else
      {
         wb_table2_120_1S02( false) ;
      }
      return  ;
   }

   public void wb_table2_120_1S02e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV73Pgmname), GXutil.rtrim( localUtil.format( AV73Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ConsultadeProduccion_PackingList.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV30DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, 0, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ConsultadeProduccion_PackingList.htm");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV30DDO_TitleSettingsIcons);
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
      if ( wbEnd == 105 )
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

   public void start1S02( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( " Packing List", ""), (short)(0)) ;
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
            strup1S00( ) ;
         }
      }
   }

   public void ws1S02( )
   {
      start1S02( ) ;
      evt1S02( ) ;
   }

   public void evt1S02( )
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
                              strup1S00( ) ;
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
                              strup1S00( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e111S02 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1S00( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e121S02 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1S00( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e131S02 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1S00( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e141S02 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1S00( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e151S02 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1S00( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e161S02 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1S00( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavBarnhdr_Internalname ;
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
                              strup1S00( ) ;
                           }
                           nGXsfl_105_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_105_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_105_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1052( ) ;
                           A2809MetTerCod = httpContext.cgiGet( edtMetTerCod_Internalname) ;
                           A2813MetPieCod = httpContext.cgiGet( edtMetPieCod_Internalname) ;
                           A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
                           A2815MetPieMet = localUtil.ctond( httpContext.cgiGet( edtMetPieMet_Internalname)) ;
                           A2814MetPieKil = localUtil.ctond( httpContext.cgiGet( edtMetPieKil_Internalname)) ;
                           A6635MetPieAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtMetPieAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A2816MetPieEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtMetPieEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           AV34MaqCod = httpContext.cgiGet( edtavMaqcod_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMaqcod_Internalname, AV34MaqCod);
                           AV35HisProFec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavHisprofec_Internalname), 0)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHisprofec_Internalname, localUtil.format(AV35HisProFec, "99/99/99"));
                           AV36BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtavBarordlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarordlin_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36BarOrdLin), 4, 0));
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
                                       GX_FocusControl = edtavBarnhdr_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e171S02 ();
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
                                       GX_FocusControl = edtavBarnhdr_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e181S02 ();
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
                                       GX_FocusControl = edtavBarnhdr_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e191S02 ();
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
                                    strup1S00( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavBarnhdr_Internalname ;
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

   public void we1S02( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1S02( ) ;
         }
      }
   }

   public void pa1S02( )
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
            GX_FocusControl = edtavBarnhdr_Internalname ;
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
      subsflControlProps_1052( ) ;
      while ( nGXsfl_105_idx <= nRC_GXsfl_105 )
      {
         sendrow_1052( ) ;
         nGXsfl_105_idx = ((subGrid_Islastpage==1)&&(nGXsfl_105_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_105_idx+1) ;
         sGXsfl_105_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_105_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1052( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ,
                                 String AV47EmprCod ,
                                 int AV48BarCod ,
                                 byte AV49BarCodReo ,
                                 String AV50BarCodPar ,
                                 String AV26TFMetTerCod ,
                                 String AV27TFMetTerCod_Sel ,
                                 String AV28TFMetPieCod ,
                                 String AV29TFMetPieCod_Sel ,
                                 java.math.BigDecimal AV37TFMetPieMet ,
                                 java.math.BigDecimal AV38TFMetPieMet_To ,
                                 java.math.BigDecimal AV39TFMetPieKil ,
                                 java.math.BigDecimal AV40TFMetPieKil_To ,
                                 short AV41TFMetPieAnc ,
                                 short AV42TFMetPieAnc_To ,
                                 byte AV57TFMetPieEst ,
                                 byte AV58TFMetPieEst_To ,
                                 String AV73Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 int AV63CliCod ,
                                 String AV64CliNom ,
                                 String AV65PedidoCliente ,
                                 String AV59BarSer ,
                                 String AV60BarSerDsc ,
                                 String AV61BarColNom ,
                                 int AV62BarColNum ,
                                 java.math.BigDecimal AV43TotMetPieMet ,
                                 java.math.BigDecimal AV45TotMetPieKil ,
                                 String AV75Produccion_consultadeproduccion_packinglistds_1_emprcod ,
                                 int AV76Produccion_consultadeproduccion_packinglistds_2_barcod ,
                                 byte AV77Produccion_consultadeproduccion_packinglistds_3_barcodreo ,
                                 String AV78Produccion_consultadeproduccion_packinglistds_4_barcodpar ,
                                 short AV66moda21 ,
                                 String A396EmprCod ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e181S02 ();
      GRID_nCurrentRecord = 0 ;
      rf1S02( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ConsultadeProduccion_PackingList");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV73Pgmname, "")));
      forbiddenHiddens.add("EmprCod", GXutil.rtrim( localUtil.format( A396EmprCod, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("produccion\\consultadeproduccion_packinglist:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf1S02( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV73Pgmname = "Produccion.ConsultadeProduccion_PackingList" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73Pgmname", AV73Pgmname);
      Gx_err = (short)(0) ;
      edtavBarcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcod_Enabled), 5, 0), true);
      edtavBarcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodreo_Enabled), 5, 0), true);
      edtavBarcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodpar_Enabled), 5, 0), true);
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavPedidocliente_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPedidocliente_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPedidocliente_Enabled), 5, 0), true);
      edtavBarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarser_Enabled), 5, 0), true);
      edtavBarserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarserdsc_Enabled), 5, 0), true);
      edtavBarcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnom_Enabled), 5, 0), true);
      edtavBarcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnum_Enabled), 5, 0), true);
      edtavBarnhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarnhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnhdr_Enabled), 5, 0), true);
      edtavBarmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmtr_Enabled), 5, 0), true);
      edtavBarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm_Enabled), 5, 0), true);
      edtavMaqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMaqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod_Enabled), 5, 0), !bGXsfl_105_Refreshing);
      edtavHisprofec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHisprofec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisprofec_Enabled), 5, 0), !bGXsfl_105_Refreshing);
      edtavBarordlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarordlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarordlin_Enabled), 5, 0), !bGXsfl_105_Refreshing);
      edtavTotvaluemetpiemet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluemetpiemet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluemetpiemet_Enabled), 5, 0), true);
      edtavTotvaluemetpiekil_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluemetpiekil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluemetpiekil_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1S02( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(105) ;
      /* Execute user event: Refresh */
      e181S02 ();
      nGXsfl_105_idx = 1 ;
      sGXsfl_105_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_105_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1052( ) ;
      bGXsfl_105_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith");
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
         subsflControlProps_1052( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV80Produccion_consultadeproduccion_packinglistds_6_tfmettercod_sel ,
                                              AV79Produccion_consultadeproduccion_packinglistds_5_tfmettercod ,
                                              AV82Produccion_consultadeproduccion_packinglistds_8_tfmetpiecod_sel ,
                                              AV81Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod ,
                                              AV83Produccion_consultadeproduccion_packinglistds_9_tfmetpiemet ,
                                              AV84Produccion_consultadeproduccion_packinglistds_10_tfmetpiemet_to ,
                                              AV85Produccion_consultadeproduccion_packinglistds_11_tfmetpiekil ,
                                              AV86Produccion_consultadeproduccion_packinglistds_12_tfmetpiekil_to ,
                                              Short.valueOf(AV87Produccion_consultadeproduccion_packinglistds_13_tfmetpieanc) ,
                                              Short.valueOf(AV88Produccion_consultadeproduccion_packinglistds_14_tfmetpieanc_to) ,
                                              Byte.valueOf(AV89Produccion_consultadeproduccion_packinglistds_15_tfmetpieest) ,
                                              Byte.valueOf(AV90Produccion_consultadeproduccion_packinglistds_16_tfmetpieest_to) ,
                                              A2809MetTerCod ,
                                              A2813MetPieCod ,
                                              A2815MetPieMet ,
                                              A2814MetPieKil ,
                                              Short.valueOf(A6635MetPieAnc) ,
                                              Byte.valueOf(A2816MetPieEst) ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV75Produccion_consultadeproduccion_packinglistds_1_emprcod ,
                                              Integer.valueOf(AV76Produccion_consultadeproduccion_packinglistds_2_barcod) ,
                                              Byte.valueOf(AV77Produccion_consultadeproduccion_packinglistds_3_barcodreo) ,
                                              AV78Produccion_consultadeproduccion_packinglistds_4_barcodpar ,
                                              A396EmprCod ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT,
                                              TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                              }
         });
         lV79Produccion_consultadeproduccion_packinglistds_5_tfmettercod = GXutil.padr( GXutil.rtrim( AV79Produccion_consultadeproduccion_packinglistds_5_tfmettercod), 10, "%") ;
         lV81Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod = GXutil.padr( GXutil.rtrim( AV81Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod), 9, "%") ;
         /* Using cursor H01S02 */
         pr_default.execute(0, new Object[] {AV75Produccion_consultadeproduccion_packinglistds_1_emprcod, Integer.valueOf(AV76Produccion_consultadeproduccion_packinglistds_2_barcod), Byte.valueOf(AV77Produccion_consultadeproduccion_packinglistds_3_barcodreo), AV78Produccion_consultadeproduccion_packinglistds_4_barcodpar, lV79Produccion_consultadeproduccion_packinglistds_5_tfmettercod, AV80Produccion_consultadeproduccion_packinglistds_6_tfmettercod_sel, lV81Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod, AV82Produccion_consultadeproduccion_packinglistds_8_tfmetpiecod_sel, AV83Produccion_consultadeproduccion_packinglistds_9_tfmetpiemet, AV84Produccion_consultadeproduccion_packinglistds_10_tfmetpiemet_to, AV85Produccion_consultadeproduccion_packinglistds_11_tfmetpiekil, AV86Produccion_consultadeproduccion_packinglistds_12_tfmetpiekil_to, Short.valueOf(AV87Produccion_consultadeproduccion_packinglistds_13_tfmetpieanc), Short.valueOf(AV88Produccion_consultadeproduccion_packinglistds_14_tfmetpieanc_to), Byte.valueOf(AV89Produccion_consultadeproduccion_packinglistds_15_tfmetpieest), Byte.valueOf(AV90Produccion_consultadeproduccion_packinglistds_16_tfmetpieest_to), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_105_idx = 1 ;
         sGXsfl_105_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_105_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1052( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A4917MetPieObs = H01S02_A4917MetPieObs[0] ;
            A396EmprCod = H01S02_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
            A2816MetPieEst = H01S02_A2816MetPieEst[0] ;
            A6635MetPieAnc = H01S02_A6635MetPieAnc[0] ;
            A2814MetPieKil = H01S02_A2814MetPieKil[0] ;
            A2815MetPieMet = H01S02_A2815MetPieMet[0] ;
            A130BarCodPar = H01S02_A130BarCodPar[0] ;
            A132BarCodReo = H01S02_A132BarCodReo[0] ;
            A129BarCod = H01S02_A129BarCod[0] ;
            A2813MetPieCod = H01S02_A2813MetPieCod[0] ;
            A2809MetTerCod = H01S02_A2809MetTerCod[0] ;
            e191S02 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(105) ;
         wb1S00( ) ;
      }
      bGXsfl_105_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1S02( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTMETPIEMET", GXutil.ltrim( localUtil.ntoc( AV43TotMetPieMet, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMETPIEMET", getSecureSignedToken( sPrefix, localUtil.format( AV43TotMetPieMet, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTMETPIEKIL", GXutil.ltrim( localUtil.ntoc( AV45TotMetPieKil, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMETPIEKIL", getSecureSignedToken( sPrefix, localUtil.format( AV45TotMetPieKil, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMODA21", GXutil.ltrim( localUtil.ntoc( AV66moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV66moda21), "ZZZ9")));
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
      AV75Produccion_consultadeproduccion_packinglistds_1_emprcod = AV47EmprCod ;
      AV76Produccion_consultadeproduccion_packinglistds_2_barcod = AV48BarCod ;
      AV77Produccion_consultadeproduccion_packinglistds_3_barcodreo = AV49BarCodReo ;
      AV78Produccion_consultadeproduccion_packinglistds_4_barcodpar = AV50BarCodPar ;
      AV79Produccion_consultadeproduccion_packinglistds_5_tfmettercod = AV26TFMetTerCod ;
      AV80Produccion_consultadeproduccion_packinglistds_6_tfmettercod_sel = AV27TFMetTerCod_Sel ;
      AV81Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod = AV28TFMetPieCod ;
      AV82Produccion_consultadeproduccion_packinglistds_8_tfmetpiecod_sel = AV29TFMetPieCod_Sel ;
      AV83Produccion_consultadeproduccion_packinglistds_9_tfmetpiemet = AV37TFMetPieMet ;
      AV84Produccion_consultadeproduccion_packinglistds_10_tfmetpiemet_to = AV38TFMetPieMet_To ;
      AV85Produccion_consultadeproduccion_packinglistds_11_tfmetpiekil = AV39TFMetPieKil ;
      AV86Produccion_consultadeproduccion_packinglistds_12_tfmetpiekil_to = AV40TFMetPieKil_To ;
      AV87Produccion_consultadeproduccion_packinglistds_13_tfmetpieanc = AV41TFMetPieAnc ;
      AV88Produccion_consultadeproduccion_packinglistds_14_tfmetpieanc_to = AV42TFMetPieAnc_To ;
      AV89Produccion_consultadeproduccion_packinglistds_15_tfmetpieest = AV57TFMetPieEst ;
      AV90Produccion_consultadeproduccion_packinglistds_16_tfmetpieest_to = AV58TFMetPieEst_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV80Produccion_consultadeproduccion_packinglistds_6_tfmettercod_sel ,
                                           AV79Produccion_consultadeproduccion_packinglistds_5_tfmettercod ,
                                           AV82Produccion_consultadeproduccion_packinglistds_8_tfmetpiecod_sel ,
                                           AV81Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod ,
                                           AV83Produccion_consultadeproduccion_packinglistds_9_tfmetpiemet ,
                                           AV84Produccion_consultadeproduccion_packinglistds_10_tfmetpiemet_to ,
                                           AV85Produccion_consultadeproduccion_packinglistds_11_tfmetpiekil ,
                                           AV86Produccion_consultadeproduccion_packinglistds_12_tfmetpiekil_to ,
                                           Short.valueOf(AV87Produccion_consultadeproduccion_packinglistds_13_tfmetpieanc) ,
                                           Short.valueOf(AV88Produccion_consultadeproduccion_packinglistds_14_tfmetpieanc_to) ,
                                           Byte.valueOf(AV89Produccion_consultadeproduccion_packinglistds_15_tfmetpieest) ,
                                           Byte.valueOf(AV90Produccion_consultadeproduccion_packinglistds_16_tfmetpieest_to) ,
                                           A2809MetTerCod ,
                                           A2813MetPieCod ,
                                           A2815MetPieMet ,
                                           A2814MetPieKil ,
                                           Short.valueOf(A6635MetPieAnc) ,
                                           Byte.valueOf(A2816MetPieEst) ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV75Produccion_consultadeproduccion_packinglistds_1_emprcod ,
                                           Integer.valueOf(AV76Produccion_consultadeproduccion_packinglistds_2_barcod) ,
                                           Byte.valueOf(AV77Produccion_consultadeproduccion_packinglistds_3_barcodreo) ,
                                           AV78Produccion_consultadeproduccion_packinglistds_4_barcodpar ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV79Produccion_consultadeproduccion_packinglistds_5_tfmettercod = GXutil.padr( GXutil.rtrim( AV79Produccion_consultadeproduccion_packinglistds_5_tfmettercod), 10, "%") ;
      lV81Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod = GXutil.padr( GXutil.rtrim( AV81Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod), 9, "%") ;
      /* Using cursor H01S03 */
      pr_default.execute(1, new Object[] {AV75Produccion_consultadeproduccion_packinglistds_1_emprcod, Integer.valueOf(AV76Produccion_consultadeproduccion_packinglistds_2_barcod), Byte.valueOf(AV77Produccion_consultadeproduccion_packinglistds_3_barcodreo), AV78Produccion_consultadeproduccion_packinglistds_4_barcodpar, lV79Produccion_consultadeproduccion_packinglistds_5_tfmettercod, AV80Produccion_consultadeproduccion_packinglistds_6_tfmettercod_sel, lV81Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod, AV82Produccion_consultadeproduccion_packinglistds_8_tfmetpiecod_sel, AV83Produccion_consultadeproduccion_packinglistds_9_tfmetpiemet, AV84Produccion_consultadeproduccion_packinglistds_10_tfmetpiemet_to, AV85Produccion_consultadeproduccion_packinglistds_11_tfmetpiekil, AV86Produccion_consultadeproduccion_packinglistds_12_tfmetpiekil_to, Short.valueOf(AV87Produccion_consultadeproduccion_packinglistds_13_tfmetpieanc), Short.valueOf(AV88Produccion_consultadeproduccion_packinglistds_14_tfmetpieanc_to), Byte.valueOf(AV89Produccion_consultadeproduccion_packinglistds_15_tfmetpieest), Byte.valueOf(AV90Produccion_consultadeproduccion_packinglistds_16_tfmetpieest_to)});
      GRID_nRecordCount = H01S03_AGRID_nRecordCount[0] ;
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
      AV75Produccion_consultadeproduccion_packinglistds_1_emprcod = AV47EmprCod ;
      AV76Produccion_consultadeproduccion_packinglistds_2_barcod = AV48BarCod ;
      AV77Produccion_consultadeproduccion_packinglistds_3_barcodreo = AV49BarCodReo ;
      AV78Produccion_consultadeproduccion_packinglistds_4_barcodpar = AV50BarCodPar ;
      AV79Produccion_consultadeproduccion_packinglistds_5_tfmettercod = AV26TFMetTerCod ;
      AV80Produccion_consultadeproduccion_packinglistds_6_tfmettercod_sel = AV27TFMetTerCod_Sel ;
      AV81Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod = AV28TFMetPieCod ;
      AV82Produccion_consultadeproduccion_packinglistds_8_tfmetpiecod_sel = AV29TFMetPieCod_Sel ;
      AV83Produccion_consultadeproduccion_packinglistds_9_tfmetpiemet = AV37TFMetPieMet ;
      AV84Produccion_consultadeproduccion_packinglistds_10_tfmetpiemet_to = AV38TFMetPieMet_To ;
      AV85Produccion_consultadeproduccion_packinglistds_11_tfmetpiekil = AV39TFMetPieKil ;
      AV86Produccion_consultadeproduccion_packinglistds_12_tfmetpiekil_to = AV40TFMetPieKil_To ;
      AV87Produccion_consultadeproduccion_packinglistds_13_tfmetpieanc = AV41TFMetPieAnc ;
      AV88Produccion_consultadeproduccion_packinglistds_14_tfmetpieanc_to = AV42TFMetPieAnc_To ;
      AV89Produccion_consultadeproduccion_packinglistds_15_tfmetpieest = AV57TFMetPieEst ;
      AV90Produccion_consultadeproduccion_packinglistds_16_tfmetpieest_to = AV58TFMetPieEst_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV20ColumnsSelector, AV47EmprCod, AV48BarCod, AV49BarCodReo, AV50BarCodPar, AV26TFMetTerCod, AV27TFMetTerCod_Sel, AV28TFMetPieCod, AV29TFMetPieCod_Sel, AV37TFMetPieMet, AV38TFMetPieMet_To, AV39TFMetPieKil, AV40TFMetPieKil_To, AV41TFMetPieAnc, AV42TFMetPieAnc_To, AV57TFMetPieEst, AV58TFMetPieEst_To, AV73Pgmname, AV12OrderedBy, AV13OrderedDsc, AV63CliCod, AV64CliNom, AV65PedidoCliente, AV59BarSer, AV60BarSerDsc, AV61BarColNom, AV62BarColNum, AV43TotMetPieMet, AV45TotMetPieKil, AV75Produccion_consultadeproduccion_packinglistds_1_emprcod, AV76Produccion_consultadeproduccion_packinglistds_2_barcod, AV77Produccion_consultadeproduccion_packinglistds_3_barcodreo, AV78Produccion_consultadeproduccion_packinglistds_4_barcodpar, AV66moda21, A396EmprCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV75Produccion_consultadeproduccion_packinglistds_1_emprcod = AV47EmprCod ;
      AV76Produccion_consultadeproduccion_packinglistds_2_barcod = AV48BarCod ;
      AV77Produccion_consultadeproduccion_packinglistds_3_barcodreo = AV49BarCodReo ;
      AV78Produccion_consultadeproduccion_packinglistds_4_barcodpar = AV50BarCodPar ;
      AV79Produccion_consultadeproduccion_packinglistds_5_tfmettercod = AV26TFMetTerCod ;
      AV80Produccion_consultadeproduccion_packinglistds_6_tfmettercod_sel = AV27TFMetTerCod_Sel ;
      AV81Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod = AV28TFMetPieCod ;
      AV82Produccion_consultadeproduccion_packinglistds_8_tfmetpiecod_sel = AV29TFMetPieCod_Sel ;
      AV83Produccion_consultadeproduccion_packinglistds_9_tfmetpiemet = AV37TFMetPieMet ;
      AV84Produccion_consultadeproduccion_packinglistds_10_tfmetpiemet_to = AV38TFMetPieMet_To ;
      AV85Produccion_consultadeproduccion_packinglistds_11_tfmetpiekil = AV39TFMetPieKil ;
      AV86Produccion_consultadeproduccion_packinglistds_12_tfmetpiekil_to = AV40TFMetPieKil_To ;
      AV87Produccion_consultadeproduccion_packinglistds_13_tfmetpieanc = AV41TFMetPieAnc ;
      AV88Produccion_consultadeproduccion_packinglistds_14_tfmetpieanc_to = AV42TFMetPieAnc_To ;
      AV89Produccion_consultadeproduccion_packinglistds_15_tfmetpieest = AV57TFMetPieEst ;
      AV90Produccion_consultadeproduccion_packinglistds_16_tfmetpieest_to = AV58TFMetPieEst_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV20ColumnsSelector, AV47EmprCod, AV48BarCod, AV49BarCodReo, AV50BarCodPar, AV26TFMetTerCod, AV27TFMetTerCod_Sel, AV28TFMetPieCod, AV29TFMetPieCod_Sel, AV37TFMetPieMet, AV38TFMetPieMet_To, AV39TFMetPieKil, AV40TFMetPieKil_To, AV41TFMetPieAnc, AV42TFMetPieAnc_To, AV57TFMetPieEst, AV58TFMetPieEst_To, AV73Pgmname, AV12OrderedBy, AV13OrderedDsc, AV63CliCod, AV64CliNom, AV65PedidoCliente, AV59BarSer, AV60BarSerDsc, AV61BarColNom, AV62BarColNum, AV43TotMetPieMet, AV45TotMetPieKil, AV75Produccion_consultadeproduccion_packinglistds_1_emprcod, AV76Produccion_consultadeproduccion_packinglistds_2_barcod, AV77Produccion_consultadeproduccion_packinglistds_3_barcodreo, AV78Produccion_consultadeproduccion_packinglistds_4_barcodpar, AV66moda21, A396EmprCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV75Produccion_consultadeproduccion_packinglistds_1_emprcod = AV47EmprCod ;
      AV76Produccion_consultadeproduccion_packinglistds_2_barcod = AV48BarCod ;
      AV77Produccion_consultadeproduccion_packinglistds_3_barcodreo = AV49BarCodReo ;
      AV78Produccion_consultadeproduccion_packinglistds_4_barcodpar = AV50BarCodPar ;
      AV79Produccion_consultadeproduccion_packinglistds_5_tfmettercod = AV26TFMetTerCod ;
      AV80Produccion_consultadeproduccion_packinglistds_6_tfmettercod_sel = AV27TFMetTerCod_Sel ;
      AV81Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod = AV28TFMetPieCod ;
      AV82Produccion_consultadeproduccion_packinglistds_8_tfmetpiecod_sel = AV29TFMetPieCod_Sel ;
      AV83Produccion_consultadeproduccion_packinglistds_9_tfmetpiemet = AV37TFMetPieMet ;
      AV84Produccion_consultadeproduccion_packinglistds_10_tfmetpiemet_to = AV38TFMetPieMet_To ;
      AV85Produccion_consultadeproduccion_packinglistds_11_tfmetpiekil = AV39TFMetPieKil ;
      AV86Produccion_consultadeproduccion_packinglistds_12_tfmetpiekil_to = AV40TFMetPieKil_To ;
      AV87Produccion_consultadeproduccion_packinglistds_13_tfmetpieanc = AV41TFMetPieAnc ;
      AV88Produccion_consultadeproduccion_packinglistds_14_tfmetpieanc_to = AV42TFMetPieAnc_To ;
      AV89Produccion_consultadeproduccion_packinglistds_15_tfmetpieest = AV57TFMetPieEst ;
      AV90Produccion_consultadeproduccion_packinglistds_16_tfmetpieest_to = AV58TFMetPieEst_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV20ColumnsSelector, AV47EmprCod, AV48BarCod, AV49BarCodReo, AV50BarCodPar, AV26TFMetTerCod, AV27TFMetTerCod_Sel, AV28TFMetPieCod, AV29TFMetPieCod_Sel, AV37TFMetPieMet, AV38TFMetPieMet_To, AV39TFMetPieKil, AV40TFMetPieKil_To, AV41TFMetPieAnc, AV42TFMetPieAnc_To, AV57TFMetPieEst, AV58TFMetPieEst_To, AV73Pgmname, AV12OrderedBy, AV13OrderedDsc, AV63CliCod, AV64CliNom, AV65PedidoCliente, AV59BarSer, AV60BarSerDsc, AV61BarColNom, AV62BarColNum, AV43TotMetPieMet, AV45TotMetPieKil, AV75Produccion_consultadeproduccion_packinglistds_1_emprcod, AV76Produccion_consultadeproduccion_packinglistds_2_barcod, AV77Produccion_consultadeproduccion_packinglistds_3_barcodreo, AV78Produccion_consultadeproduccion_packinglistds_4_barcodpar, AV66moda21, A396EmprCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV75Produccion_consultadeproduccion_packinglistds_1_emprcod = AV47EmprCod ;
      AV76Produccion_consultadeproduccion_packinglistds_2_barcod = AV48BarCod ;
      AV77Produccion_consultadeproduccion_packinglistds_3_barcodreo = AV49BarCodReo ;
      AV78Produccion_consultadeproduccion_packinglistds_4_barcodpar = AV50BarCodPar ;
      AV79Produccion_consultadeproduccion_packinglistds_5_tfmettercod = AV26TFMetTerCod ;
      AV80Produccion_consultadeproduccion_packinglistds_6_tfmettercod_sel = AV27TFMetTerCod_Sel ;
      AV81Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod = AV28TFMetPieCod ;
      AV82Produccion_consultadeproduccion_packinglistds_8_tfmetpiecod_sel = AV29TFMetPieCod_Sel ;
      AV83Produccion_consultadeproduccion_packinglistds_9_tfmetpiemet = AV37TFMetPieMet ;
      AV84Produccion_consultadeproduccion_packinglistds_10_tfmetpiemet_to = AV38TFMetPieMet_To ;
      AV85Produccion_consultadeproduccion_packinglistds_11_tfmetpiekil = AV39TFMetPieKil ;
      AV86Produccion_consultadeproduccion_packinglistds_12_tfmetpiekil_to = AV40TFMetPieKil_To ;
      AV87Produccion_consultadeproduccion_packinglistds_13_tfmetpieanc = AV41TFMetPieAnc ;
      AV88Produccion_consultadeproduccion_packinglistds_14_tfmetpieanc_to = AV42TFMetPieAnc_To ;
      AV89Produccion_consultadeproduccion_packinglistds_15_tfmetpieest = AV57TFMetPieEst ;
      AV90Produccion_consultadeproduccion_packinglistds_16_tfmetpieest_to = AV58TFMetPieEst_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV20ColumnsSelector, AV47EmprCod, AV48BarCod, AV49BarCodReo, AV50BarCodPar, AV26TFMetTerCod, AV27TFMetTerCod_Sel, AV28TFMetPieCod, AV29TFMetPieCod_Sel, AV37TFMetPieMet, AV38TFMetPieMet_To, AV39TFMetPieKil, AV40TFMetPieKil_To, AV41TFMetPieAnc, AV42TFMetPieAnc_To, AV57TFMetPieEst, AV58TFMetPieEst_To, AV73Pgmname, AV12OrderedBy, AV13OrderedDsc, AV63CliCod, AV64CliNom, AV65PedidoCliente, AV59BarSer, AV60BarSerDsc, AV61BarColNom, AV62BarColNum, AV43TotMetPieMet, AV45TotMetPieKil, AV75Produccion_consultadeproduccion_packinglistds_1_emprcod, AV76Produccion_consultadeproduccion_packinglistds_2_barcod, AV77Produccion_consultadeproduccion_packinglistds_3_barcodreo, AV78Produccion_consultadeproduccion_packinglistds_4_barcodpar, AV66moda21, A396EmprCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV75Produccion_consultadeproduccion_packinglistds_1_emprcod = AV47EmprCod ;
      AV76Produccion_consultadeproduccion_packinglistds_2_barcod = AV48BarCod ;
      AV77Produccion_consultadeproduccion_packinglistds_3_barcodreo = AV49BarCodReo ;
      AV78Produccion_consultadeproduccion_packinglistds_4_barcodpar = AV50BarCodPar ;
      AV79Produccion_consultadeproduccion_packinglistds_5_tfmettercod = AV26TFMetTerCod ;
      AV80Produccion_consultadeproduccion_packinglistds_6_tfmettercod_sel = AV27TFMetTerCod_Sel ;
      AV81Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod = AV28TFMetPieCod ;
      AV82Produccion_consultadeproduccion_packinglistds_8_tfmetpiecod_sel = AV29TFMetPieCod_Sel ;
      AV83Produccion_consultadeproduccion_packinglistds_9_tfmetpiemet = AV37TFMetPieMet ;
      AV84Produccion_consultadeproduccion_packinglistds_10_tfmetpiemet_to = AV38TFMetPieMet_To ;
      AV85Produccion_consultadeproduccion_packinglistds_11_tfmetpiekil = AV39TFMetPieKil ;
      AV86Produccion_consultadeproduccion_packinglistds_12_tfmetpiekil_to = AV40TFMetPieKil_To ;
      AV87Produccion_consultadeproduccion_packinglistds_13_tfmetpieanc = AV41TFMetPieAnc ;
      AV88Produccion_consultadeproduccion_packinglistds_14_tfmetpieanc_to = AV42TFMetPieAnc_To ;
      AV89Produccion_consultadeproduccion_packinglistds_15_tfmetpieest = AV57TFMetPieEst ;
      AV90Produccion_consultadeproduccion_packinglistds_16_tfmetpieest_to = AV58TFMetPieEst_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV20ColumnsSelector, AV47EmprCod, AV48BarCod, AV49BarCodReo, AV50BarCodPar, AV26TFMetTerCod, AV27TFMetTerCod_Sel, AV28TFMetPieCod, AV29TFMetPieCod_Sel, AV37TFMetPieMet, AV38TFMetPieMet_To, AV39TFMetPieKil, AV40TFMetPieKil_To, AV41TFMetPieAnc, AV42TFMetPieAnc_To, AV57TFMetPieEst, AV58TFMetPieEst_To, AV73Pgmname, AV12OrderedBy, AV13OrderedDsc, AV63CliCod, AV64CliNom, AV65PedidoCliente, AV59BarSer, AV60BarSerDsc, AV61BarColNom, AV62BarColNum, AV43TotMetPieMet, AV45TotMetPieKil, AV75Produccion_consultadeproduccion_packinglistds_1_emprcod, AV76Produccion_consultadeproduccion_packinglistds_2_barcod, AV77Produccion_consultadeproduccion_packinglistds_3_barcodreo, AV78Produccion_consultadeproduccion_packinglistds_4_barcodpar, AV66moda21, A396EmprCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV73Pgmname = "Produccion.ConsultadeProduccion_PackingList" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73Pgmname", AV73Pgmname);
      Gx_err = (short)(0) ;
      edtavBarcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcod_Enabled), 5, 0), true);
      edtavBarcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodreo_Enabled), 5, 0), true);
      edtavBarcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodpar_Enabled), 5, 0), true);
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavPedidocliente_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPedidocliente_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPedidocliente_Enabled), 5, 0), true);
      edtavBarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarser_Enabled), 5, 0), true);
      edtavBarserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarserdsc_Enabled), 5, 0), true);
      edtavBarcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnom_Enabled), 5, 0), true);
      edtavBarcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnum_Enabled), 5, 0), true);
      edtavBarnhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarnhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnhdr_Enabled), 5, 0), true);
      edtavBarmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmtr_Enabled), 5, 0), true);
      edtavBarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm_Enabled), 5, 0), true);
      edtavMaqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMaqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod_Enabled), 5, 0), !bGXsfl_105_Refreshing);
      edtavHisprofec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHisprofec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisprofec_Enabled), 5, 0), !bGXsfl_105_Refreshing);
      edtavBarordlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarordlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarordlin_Enabled), 5, 0), !bGXsfl_105_Refreshing);
      edtavTotvaluemetpiemet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluemetpiemet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluemetpiemet_Enabled), 5, 0), true);
      edtavTotvaluemetpiekil_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluemetpiekil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluemetpiekil_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1S00( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e171S02 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV30DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV20ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_105 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_105"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV32GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV33GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV47EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV47EmprCod") ;
         wcpOAV48BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV48BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV49BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV49BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV50BarCodPar = httpContext.cgiGet( sPrefix+"wcpOAV50BarCodPar") ;
         wcpOAV63CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV63CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV64CliNom = httpContext.cgiGet( sPrefix+"wcpOAV64CliNom") ;
         wcpOAV65PedidoCliente = httpContext.cgiGet( sPrefix+"wcpOAV65PedidoCliente") ;
         wcpOAV59BarSer = httpContext.cgiGet( sPrefix+"wcpOAV59BarSer") ;
         wcpOAV60BarSerDsc = httpContext.cgiGet( sPrefix+"wcpOAV60BarSerDsc") ;
         wcpOAV61BarColNom = httpContext.cgiGet( sPrefix+"wcpOAV61BarColNom") ;
         wcpOAV62BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV62BarColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         /* Read variables values. */
         AV56BarNHdr = httpContext.cgiGet( edtavBarnhdr_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56BarNHdr", AV56BarNHdr);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavBarmtr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavBarmtr_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARMTR");
            GX_FocusControl = edtavBarmtr_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV53BarMtr = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53BarMtr", GXutil.ltrimstr( AV53BarMtr, 9, 2));
         }
         else
         {
            AV53BarMtr = localUtil.ctond( httpContext.cgiGet( edtavBarmtr_Internalname)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53BarMtr", GXutil.ltrimstr( AV53BarMtr, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavBarkgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavBarkgm_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARKGM");
            GX_FocusControl = edtavBarkgm_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV55BarKgm = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55BarKgm", GXutil.ltrimstr( AV55BarKgm, 9, 2));
         }
         else
         {
            AV55BarKgm = localUtil.ctond( httpContext.cgiGet( edtavBarkgm_Internalname)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55BarKgm", GXutil.ltrimstr( AV55BarKgm, 9, 2));
         }
         AV44TotValueMetPieMet = httpContext.cgiGet( edtavTotvaluemetpiemet_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TotValueMetPieMet", AV44TotValueMetPieMet);
         AV46TotValueMetPieKil = httpContext.cgiGet( edtavTotvaluemetpiekil_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TotValueMetPieKil", AV46TotValueMetPieKil);
         AV73Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73Pgmname", AV73Pgmname);
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ConsultadeProduccion_PackingList");
         AV73Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73Pgmname", AV73Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV73Pgmname, "")));
         A396EmprCod = httpContext.cgiGet( edtEmprCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         forbiddenHiddens.add("EmprCod", GXutil.rtrim( localUtil.format( A396EmprCod, "@!")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("produccion\\consultadeproduccion_packinglist:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e171S02 ();
      if (returnInSub) return;
   }

   public void e171S02( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV68Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      consultadeproduccion_packinglist_impl.this.GXt_char1 = GXv_char2[0] ;
      AV68Station = GXt_char1 ;
      GXv_char2[0] = AV47EmprCod ;
      GXv_char3[0] = AV69EmprNom ;
      GXv_char4[0] = AV70UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV68Station, GXv_char2, GXv_char3, GXv_char4) ;
      consultadeproduccion_packinglist_impl.this.AV47EmprCod = GXv_char2[0] ;
      consultadeproduccion_packinglist_impl.this.AV69EmprNom = GXv_char3[0] ;
      consultadeproduccion_packinglist_impl.this.AV70UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47EmprCod", AV47EmprCod);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      if ( AV12OrderedBy < 1 )
      {
         AV12OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
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
      /* Using cursor H01S05 */
      pr_default.execute(2, new Object[] {AV47EmprCod, Integer.valueOf(AV48BarCod), Byte.valueOf(AV49BarCodReo), AV50BarCodPar});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A396EmprCod = H01S05_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         A184BarMtr = H01S05_A184BarMtr[0] ;
         A166BarKgm = H01S05_A166BarKgm[0] ;
         A130BarCodPar = H01S05_A130BarCodPar[0] ;
         A132BarCodReo = H01S05_A132BarCodReo[0] ;
         A129BarCod = H01S05_A129BarCod[0] ;
         A184BarMtr = H01S05_A184BarMtr[0] ;
         A166BarKgm = H01S05_A166BarKgm[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13696BarNHdr", A13696BarNHdr);
         AV53BarMtr = A184BarMtr ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53BarMtr", GXutil.ltrimstr( AV53BarMtr, 9, 2));
         AV55BarKgm = A166BarKgm ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55BarKgm", GXutil.ltrimstr( AV55BarKgm, 9, 2));
         AV56BarNHdr = A13696BarNHdr ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56BarNHdr", AV56BarNHdr);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      GXt_int7 = (byte)(AV66moda21) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV47EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int8) ;
      consultadeproduccion_packinglist_impl.this.GXt_int7 = GXv_int8[0] ;
      AV66moda21 = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66moda21), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV66moda21), "ZZZ9")));
   }

   public void e181S02( )
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
      if ( GXutil.strcmp(AV22Session.getValue("Produccion.ConsultadeProduccion_PackingListColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV22Session.getValue("Produccion.ConsultadeProduccion_PackingListColumnsSelector") ;
         AV20ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S152 ();
         if (returnInSub) return;
      }
      edtMetTerCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMetTerCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetTerCod_Visible), 5, 0), !bGXsfl_105_Refreshing);
      edtMetPieCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMetPieCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieCod_Visible), 5, 0), !bGXsfl_105_Refreshing);
      edtMetPieMet_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMetPieMet_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieMet_Visible), 5, 0), !bGXsfl_105_Refreshing);
      edtMetPieKil_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMetPieKil_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieKil_Visible), 5, 0), !bGXsfl_105_Refreshing);
      edtMetPieAnc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMetPieAnc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieAnc_Visible), 5, 0), !bGXsfl_105_Refreshing);
      edtMetPieEst_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMetPieEst_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieEst_Visible), 5, 0), !bGXsfl_105_Refreshing);
      edtavMaqcod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMaqcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod_Visible), 5, 0), !bGXsfl_105_Refreshing);
      edtavHisprofec_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHisprofec_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisprofec_Visible), 5, 0), !bGXsfl_105_Refreshing);
      edtavBarordlin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarordlin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarordlin_Visible), 5, 0), !bGXsfl_105_Refreshing);
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S162 ();
      if (returnInSub) return;
      AV32GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32GridCurrentPage), 10, 0));
      AV33GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33GridPageCount), 10, 0));
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S172 ();
      if (returnInSub) return;
      AV75Produccion_consultadeproduccion_packinglistds_1_emprcod = AV47EmprCod ;
      AV76Produccion_consultadeproduccion_packinglistds_2_barcod = AV48BarCod ;
      AV77Produccion_consultadeproduccion_packinglistds_3_barcodreo = AV49BarCodReo ;
      AV78Produccion_consultadeproduccion_packinglistds_4_barcodpar = AV50BarCodPar ;
      AV79Produccion_consultadeproduccion_packinglistds_5_tfmettercod = AV26TFMetTerCod ;
      AV80Produccion_consultadeproduccion_packinglistds_6_tfmettercod_sel = AV27TFMetTerCod_Sel ;
      AV81Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod = AV28TFMetPieCod ;
      AV82Produccion_consultadeproduccion_packinglistds_8_tfmetpiecod_sel = AV29TFMetPieCod_Sel ;
      AV83Produccion_consultadeproduccion_packinglistds_9_tfmetpiemet = AV37TFMetPieMet ;
      AV84Produccion_consultadeproduccion_packinglistds_10_tfmetpiemet_to = AV38TFMetPieMet_To ;
      AV85Produccion_consultadeproduccion_packinglistds_11_tfmetpiekil = AV39TFMetPieKil ;
      AV86Produccion_consultadeproduccion_packinglistds_12_tfmetpiekil_to = AV40TFMetPieKil_To ;
      AV87Produccion_consultadeproduccion_packinglistds_13_tfmetpieanc = AV41TFMetPieAnc ;
      AV88Produccion_consultadeproduccion_packinglistds_14_tfmetpieanc_to = AV42TFMetPieAnc_To ;
      AV89Produccion_consultadeproduccion_packinglistds_15_tfmetpieest = AV57TFMetPieEst ;
      AV90Produccion_consultadeproduccion_packinglistds_16_tfmetpieest_to = AV58TFMetPieEst_To ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
   }

   public void e111S02( )
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

   public void e121S02( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e131S02( )
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
         S132 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MetTerCod") == 0 )
         {
            AV26TFMetTerCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFMetTerCod", AV26TFMetTerCod);
            AV27TFMetTerCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFMetTerCod_Sel", AV27TFMetTerCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MetPieCod") == 0 )
         {
            AV28TFMetPieCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFMetPieCod", AV28TFMetPieCod);
            AV29TFMetPieCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFMetPieCod_Sel", AV29TFMetPieCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MetPieMet") == 0 )
         {
            AV37TFMetPieMet = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFMetPieMet", GXutil.ltrimstr( AV37TFMetPieMet, 9, 2));
            AV38TFMetPieMet_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFMetPieMet_To", GXutil.ltrimstr( AV38TFMetPieMet_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MetPieKil") == 0 )
         {
            AV39TFMetPieKil = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFMetPieKil", GXutil.ltrimstr( AV39TFMetPieKil, 9, 2));
            AV40TFMetPieKil_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFMetPieKil_To", GXutil.ltrimstr( AV40TFMetPieKil_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MetPieAnc") == 0 )
         {
            AV41TFMetPieAnc = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFMetPieAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFMetPieAnc), 3, 0));
            AV42TFMetPieAnc_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFMetPieAnc_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFMetPieAnc_To), 3, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MetPieEst") == 0 )
         {
            AV57TFMetPieEst = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFMetPieEst", GXutil.str( AV57TFMetPieEst, 1, 0));
            AV58TFMetPieEst_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFMetPieEst_To", GXutil.str( AV58TFMetPieEst_To, 1, 0));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e191S02( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV34MaqCod = GXutil.substring( A4917MetPieObs, 4, 6) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMaqcod_Internalname, AV34MaqCod);
      AV35HisProFec = localUtil.ctod( GXutil.substring( A4917MetPieObs, 10, 8), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHisprofec_Internalname, localUtil.format(AV35HisProFec, "99/99/99"));
      AV36BarOrdLin = (short)(GXutil.lval( GXutil.substring( A4917MetPieObs, 18, 8))) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarordlin_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36BarOrdLin), 4, 0));
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(105) ;
      }
      sendrow_1052( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_105_Refreshing )
      {
         httpContext.doAjaxLoad(105, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e141S02( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV18ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV20ColumnsSelector.fromJSonString(AV18ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "Produccion.ConsultadeProduccion_PackingListColumnsSelector", ((GXutil.strcmp("", AV18ColumnsSelectorXML)==0) ? "" : AV20ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
   }

   public void e151S02( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      AV52Var_Hdr = AV47EmprCod + GXutil.str( AV48BarCod, 8, 0) + GXutil.str( AV49BarCodReo, 1, 0) + AV50BarCodPar ;
      AV51WebSession.setValue("&Var_Hdr", AV52Var_Hdr);
      if ( (0==AV66moda21) )
      {
         GXv_char4[0] = AV16ExcelFilename ;
         GXv_char3[0] = AV17ErrorMessage ;
         new app.produccion.consultadeproduccion_packinglistexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
         consultadeproduccion_packinglist_impl.this.AV16ExcelFilename = GXv_char4[0] ;
         consultadeproduccion_packinglist_impl.this.AV17ErrorMessage = GXv_char3[0] ;
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
      else
      {
         GXv_char4[0] = AV16ExcelFilename ;
         GXv_char3[0] = AV17ErrorMessage ;
         GXv_int10[0] = AV67Silineas ;
         new app.produccion.packinglist_prc(remoteHandle, context).execute( AV47EmprCod, AV48BarCod, AV49BarCodReo, AV50BarCodPar, GXv_char4, GXv_char3, GXv_int10) ;
         consultadeproduccion_packinglist_impl.this.AV16ExcelFilename = GXv_char4[0] ;
         consultadeproduccion_packinglist_impl.this.AV17ErrorMessage = GXv_char3[0] ;
         consultadeproduccion_packinglist_impl.this.AV67Silineas = GXv_int10[0] ;
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
   }

   public void e161S02( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      AV52Var_Hdr = AV47EmprCod + GXutil.str( AV48BarCod, 8, 0) + GXutil.str( AV49BarCodReo, 1, 0) + AV50BarCodPar ;
      AV51WebSession.setValue("&Var_Hdr", AV52Var_Hdr);
      callWebObject(formatLink("app.produccion.consultadeproduccion_packinglistexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void S132( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV12OrderedBy, 4, 0))+":"+(AV13OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S152( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV20ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector11[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "MetTerCod", "", "Terminal", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "MetPieCod", "", "Pieza", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "MetPieMet", "", "Metros", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "MetPieKil", "", "Kilos", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "MetPieAnc", "", "Ancho", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "MetPieEst", "", "E", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "&MaqCod", "", "Maquina", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "&HisProFec", "", "Fecha", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "&BarOrdLin", "", "Orden", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXt_char1 = AV19UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Produccion.ConsultadeProduccion_PackingListColumnsSelector", GXv_char4) ;
      consultadeproduccion_packinglist_impl.this.GXt_char1 = GXv_char4[0] ;
      AV19UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV19UserCustomValue)==0) ) )
      {
         AV21ColumnsSelectorAux.fromxml(AV19UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector11[0] = AV21ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector12[0] = AV20ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, GXv_SdtWWPColumnsSelector12) ;
         AV21ColumnsSelectorAux = GXv_SdtWWPColumnsSelector11[0] ;
         AV20ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      }
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue(AV73Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV73Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV73Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S132 ();
      if (returnInSub) return;
      AV91GXV1 = 1 ;
      while ( AV91GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV91GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETTERCOD") == 0 )
         {
            AV26TFMetTerCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFMetTerCod", AV26TFMetTerCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETTERCOD_SEL") == 0 )
         {
            AV27TFMetTerCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFMetTerCod_Sel", AV27TFMetTerCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIECOD") == 0 )
         {
            AV28TFMetPieCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFMetPieCod", AV28TFMetPieCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIECOD_SEL") == 0 )
         {
            AV29TFMetPieCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFMetPieCod_Sel", AV29TFMetPieCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEMET") == 0 )
         {
            AV37TFMetPieMet = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFMetPieMet", GXutil.ltrimstr( AV37TFMetPieMet, 9, 2));
            AV38TFMetPieMet_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFMetPieMet_To", GXutil.ltrimstr( AV38TFMetPieMet_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEKIL") == 0 )
         {
            AV39TFMetPieKil = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFMetPieKil", GXutil.ltrimstr( AV39TFMetPieKil, 9, 2));
            AV40TFMetPieKil_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFMetPieKil_To", GXutil.ltrimstr( AV40TFMetPieKil_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEANC") == 0 )
         {
            AV41TFMetPieAnc = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFMetPieAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFMetPieAnc), 3, 0));
            AV42TFMetPieAnc_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFMetPieAnc_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFMetPieAnc_To), 3, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEEST") == 0 )
         {
            AV57TFMetPieEst = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFMetPieEst", GXutil.str( AV57TFMetPieEst, 1, 0));
            AV58TFMetPieEst_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFMetPieEst_To", GXutil.str( AV58TFMetPieEst_To, 1, 0));
         }
         AV91GXV1 = (int)(AV91GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV27TFMetTerCod_Sel)==0), AV27TFMetTerCod_Sel, GXv_char4) ;
      consultadeproduccion_packinglist_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char13 = "" ;
      GXv_char3[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV29TFMetPieCod_Sel)==0), AV29TFMetPieCod_Sel, GXv_char3) ;
      consultadeproduccion_packinglist_impl.this.GXt_char13 = GXv_char3[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|"+GXt_char13+"|||||||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV26TFMetTerCod)==0), AV26TFMetTerCod, GXv_char4) ;
      consultadeproduccion_packinglist_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char1 = "" ;
      GXv_char3[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV28TFMetPieCod)==0), AV28TFMetPieCod, GXv_char3) ;
      consultadeproduccion_packinglist_impl.this.GXt_char1 = GXv_char3[0] ;
      Ddo_grid_Filteredtext_set = GXt_char13+"|"+GXt_char1+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV37TFMetPieMet)==0) ? "" : GXutil.str( AV37TFMetPieMet, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFMetPieKil)==0) ? "" : GXutil.str( AV39TFMetPieKil, 9, 2))+"|"+((0==AV41TFMetPieAnc) ? "" : GXutil.str( AV41TFMetPieAnc, 3, 0))+"|"+((0==AV57TFMetPieEst) ? "" : GXutil.str( AV57TFMetPieEst, 1, 0))+"|||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV38TFMetPieMet_To)==0) ? "" : GXutil.str( AV38TFMetPieMet_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFMetPieKil_To)==0) ? "" : GXutil.str( AV40TFMetPieKil_To, 9, 2))+"|"+((0==AV42TFMetPieAnc_To) ? "" : GXutil.str( AV42TFMetPieAnc_To, 3, 0))+"|"+((0==AV58TFMetPieEst_To) ? "" : GXutil.str( AV58TFMetPieEst_To, 1, 0))+"|||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
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
      AV10GridState.fromxml(AV22Session.getValue(AV73Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFMETTERCOD", "", !(GXutil.strcmp("", AV26TFMetTerCod)==0), (short)(0), AV26TFMetTerCod, "", !(GXutil.strcmp("", AV27TFMetTerCod_Sel)==0), AV27TFMetTerCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFMETPIECOD", "", !(GXutil.strcmp("", AV28TFMetPieCod)==0), (short)(0), AV28TFMetPieCod, "", !(GXutil.strcmp("", AV29TFMetPieCod_Sel)==0), AV29TFMetPieCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFMETPIEMET", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV37TFMetPieMet)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV38TFMetPieMet_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV37TFMetPieMet, 9, 2)), GXutil.trim( GXutil.str( AV38TFMetPieMet_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFMETPIEKIL", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFMetPieKil)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFMetPieKil_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV39TFMetPieKil, 9, 2)), GXutil.trim( GXutil.str( AV40TFMetPieKil_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFMETPIEANC", "", !((0==AV41TFMetPieAnc)&&(0==AV42TFMetPieAnc_To)), (short)(0), GXutil.trim( GXutil.str( AV41TFMetPieAnc, 3, 0)), GXutil.trim( GXutil.str( AV42TFMetPieAnc_To, 3, 0))) ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFMETPIEEST", "", !((0==AV57TFMetPieEst)&&(0==AV58TFMetPieEst_To)), (short)(0), GXutil.trim( GXutil.str( AV57TFMetPieEst, 1, 0)), GXutil.trim( GXutil.str( AV58TFMetPieEst_To, 1, 0))) ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      if ( ! (GXutil.strcmp("", AV47EmprCod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV47EmprCod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV48BarCod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV48BarCod, 8, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV49BarCodReo) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODREO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV49BarCodReo, 1, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV50BarCodPar)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODPAR" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV50BarCodPar );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV63CliCod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV63CliCod, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV64CliNom)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLINOM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV64CliNom );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV65PedidoCliente)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PEDIDOCLIENTE" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV65PedidoCliente );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV59BarSer)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARSER" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV59BarSer );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV60BarSerDsc)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARSERDSC" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV60BarSerDsc );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV61BarColNom)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOLNOM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV61BarColNom );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV62BarColNum) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOLNUM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV62BarColNum, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV73Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV73Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "Produccion.PackingList" );
      AV9TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "EmprCod" );
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( AV47EmprCod );
      AV8TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV9TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "BarCod" );
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( GXutil.str( AV48BarCod, 8, 0) );
      AV8TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV9TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "BarCodReo" );
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( GXutil.str( AV49BarCodReo, 1, 0) );
      AV8TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV9TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "BarCodPar" );
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( AV50BarCodPar );
      AV8TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S162( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV43TotMetPieMet = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TotMetPieMet", GXutil.ltrimstr( AV43TotMetPieMet, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMETPIEMET", getSecureSignedToken( sPrefix, localUtil.format( AV43TotMetPieMet, "ZZZZZ9.99")));
      AV45TotMetPieKil = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TotMetPieKil", GXutil.ltrimstr( AV45TotMetPieKil, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMETPIEKIL", getSecureSignedToken( sPrefix, localUtil.format( AV45TotMetPieKil, "ZZZZZ9.99")));
   }

   public void S172( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      AV75Produccion_consultadeproduccion_packinglistds_1_emprcod = AV47EmprCod ;
      AV76Produccion_consultadeproduccion_packinglistds_2_barcod = AV48BarCod ;
      AV77Produccion_consultadeproduccion_packinglistds_3_barcodreo = AV49BarCodReo ;
      AV78Produccion_consultadeproduccion_packinglistds_4_barcodpar = AV50BarCodPar ;
      AV79Produccion_consultadeproduccion_packinglistds_5_tfmettercod = AV26TFMetTerCod ;
      AV80Produccion_consultadeproduccion_packinglistds_6_tfmettercod_sel = AV27TFMetTerCod_Sel ;
      AV81Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod = AV28TFMetPieCod ;
      AV82Produccion_consultadeproduccion_packinglistds_8_tfmetpiecod_sel = AV29TFMetPieCod_Sel ;
      AV83Produccion_consultadeproduccion_packinglistds_9_tfmetpiemet = AV37TFMetPieMet ;
      AV84Produccion_consultadeproduccion_packinglistds_10_tfmetpiemet_to = AV38TFMetPieMet_To ;
      AV85Produccion_consultadeproduccion_packinglistds_11_tfmetpiekil = AV39TFMetPieKil ;
      AV86Produccion_consultadeproduccion_packinglistds_12_tfmetpiekil_to = AV40TFMetPieKil_To ;
      AV87Produccion_consultadeproduccion_packinglistds_13_tfmetpieanc = AV41TFMetPieAnc ;
      AV88Produccion_consultadeproduccion_packinglistds_14_tfmetpieanc_to = AV42TFMetPieAnc_To ;
      AV89Produccion_consultadeproduccion_packinglistds_15_tfmetpieest = AV57TFMetPieEst ;
      AV90Produccion_consultadeproduccion_packinglistds_16_tfmetpieest_to = AV58TFMetPieEst_To ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV80Produccion_consultadeproduccion_packinglistds_6_tfmettercod_sel ,
                                           AV79Produccion_consultadeproduccion_packinglistds_5_tfmettercod ,
                                           AV82Produccion_consultadeproduccion_packinglistds_8_tfmetpiecod_sel ,
                                           AV81Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod ,
                                           AV83Produccion_consultadeproduccion_packinglistds_9_tfmetpiemet ,
                                           AV84Produccion_consultadeproduccion_packinglistds_10_tfmetpiemet_to ,
                                           AV85Produccion_consultadeproduccion_packinglistds_11_tfmetpiekil ,
                                           AV86Produccion_consultadeproduccion_packinglistds_12_tfmetpiekil_to ,
                                           Short.valueOf(AV87Produccion_consultadeproduccion_packinglistds_13_tfmetpieanc) ,
                                           Short.valueOf(AV88Produccion_consultadeproduccion_packinglistds_14_tfmetpieanc_to) ,
                                           Byte.valueOf(AV89Produccion_consultadeproduccion_packinglistds_15_tfmetpieest) ,
                                           Byte.valueOf(AV90Produccion_consultadeproduccion_packinglistds_16_tfmetpieest_to) ,
                                           A2809MetTerCod ,
                                           A2813MetPieCod ,
                                           A2815MetPieMet ,
                                           A2814MetPieKil ,
                                           Short.valueOf(A6635MetPieAnc) ,
                                           Byte.valueOf(A2816MetPieEst) ,
                                           AV75Produccion_consultadeproduccion_packinglistds_1_emprcod ,
                                           Integer.valueOf(AV76Produccion_consultadeproduccion_packinglistds_2_barcod) ,
                                           Byte.valueOf(AV77Produccion_consultadeproduccion_packinglistds_3_barcodreo) ,
                                           AV78Produccion_consultadeproduccion_packinglistds_4_barcodpar ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV79Produccion_consultadeproduccion_packinglistds_5_tfmettercod = GXutil.padr( GXutil.rtrim( AV79Produccion_consultadeproduccion_packinglistds_5_tfmettercod), 10, "%") ;
      lV81Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod = GXutil.padr( GXutil.rtrim( AV81Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod), 9, "%") ;
      /* Using cursor H01S06 */
      pr_default.execute(3, new Object[] {AV75Produccion_consultadeproduccion_packinglistds_1_emprcod, Integer.valueOf(AV76Produccion_consultadeproduccion_packinglistds_2_barcod), Byte.valueOf(AV77Produccion_consultadeproduccion_packinglistds_3_barcodreo), AV78Produccion_consultadeproduccion_packinglistds_4_barcodpar, lV79Produccion_consultadeproduccion_packinglistds_5_tfmettercod, AV80Produccion_consultadeproduccion_packinglistds_6_tfmettercod_sel, lV81Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod, AV82Produccion_consultadeproduccion_packinglistds_8_tfmetpiecod_sel, AV83Produccion_consultadeproduccion_packinglistds_9_tfmetpiemet, AV84Produccion_consultadeproduccion_packinglistds_10_tfmetpiemet_to, AV85Produccion_consultadeproduccion_packinglistds_11_tfmetpiekil, AV86Produccion_consultadeproduccion_packinglistds_12_tfmetpiekil_to, Short.valueOf(AV87Produccion_consultadeproduccion_packinglistds_13_tfmetpieanc), Short.valueOf(AV88Produccion_consultadeproduccion_packinglistds_14_tfmetpieanc_to), Byte.valueOf(AV89Produccion_consultadeproduccion_packinglistds_15_tfmetpieest), Byte.valueOf(AV90Produccion_consultadeproduccion_packinglistds_16_tfmetpieest_to)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A2816MetPieEst = H01S06_A2816MetPieEst[0] ;
         A6635MetPieAnc = H01S06_A6635MetPieAnc[0] ;
         A2814MetPieKil = H01S06_A2814MetPieKil[0] ;
         A2815MetPieMet = H01S06_A2815MetPieMet[0] ;
         A2813MetPieCod = H01S06_A2813MetPieCod[0] ;
         A2809MetTerCod = H01S06_A2809MetTerCod[0] ;
         A130BarCodPar = H01S06_A130BarCodPar[0] ;
         A132BarCodReo = H01S06_A132BarCodReo[0] ;
         A129BarCod = H01S06_A129BarCod[0] ;
         A396EmprCod = H01S06_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         AV43TotMetPieMet = A2815MetPieMet.add(AV43TotMetPieMet) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TotMetPieMet", GXutil.ltrimstr( AV43TotMetPieMet, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMETPIEMET", getSecureSignedToken( sPrefix, localUtil.format( AV43TotMetPieMet, "ZZZZZ9.99")));
         AV45TotMetPieKil = A2814MetPieKil.add(AV45TotMetPieKil) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TotMetPieKil", GXutil.ltrimstr( AV45TotMetPieKil, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMETPIEKIL", getSecureSignedToken( sPrefix, localUtil.format( AV45TotMetPieKil, "ZZZZZ9.99")));
         pr_default.readNext(3);
      }
      pr_default.close(3);
      AV44TotValueMetPieMet = localUtil.format( AV43TotMetPieMet, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TotValueMetPieMet", AV44TotValueMetPieMet);
      AV46TotValueMetPieKil = localUtil.format( AV45TotMetPieKil, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TotValueMetPieKil", AV46TotValueMetPieKil);
   }

   public void wb_table2_120_1S02( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblGridtabletotalizer_Internalname, tblGridtabletotalizer_Internalname, "", "TableTotalizerAl", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluemetpiemet_Internalname, httpContext.getMessage( "Tot Value Met Pie Met", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'" + sPrefix + "',false,'" + sGXsfl_105_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluemetpiemet_Internalname, AV44TotValueMetPieMet, GXutil.rtrim( localUtil.format( AV44TotValueMetPieMet, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,129);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluemetpiemet_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluemetpiemet_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ConsultadeProduccion_PackingList.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluemetpiekil_Internalname, httpContext.getMessage( "Tot Value Met Pie Kil", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 132,'" + sPrefix + "',false,'" + sGXsfl_105_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluemetpiekil_Internalname, AV46TotValueMetPieKil, GXutil.rtrim( localUtil.format( AV46TotValueMetPieKil, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,132);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluemetpiekil_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluemetpiekil_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ConsultadeProduccion_PackingList.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_120_1S02e( true) ;
      }
      else
      {
         wb_table2_120_1S02e( false) ;
      }
   }

   public void wb_table1_82_1S02( boolean wbgen )
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
         wb_table1_82_1S02e( true) ;
      }
      else
      {
         wb_table1_82_1S02e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV47EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47EmprCod", AV47EmprCod);
      AV48BarCod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48BarCod), 8, 0));
      AV49BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49BarCodReo", GXutil.str( AV49BarCodReo, 1, 0));
      AV50BarCodPar = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50BarCodPar", AV50BarCodPar);
      AV63CliCod = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63CliCod), 6, 0));
      AV64CliNom = (String)getParm(obj,5,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64CliNom", AV64CliNom);
      AV65PedidoCliente = (String)getParm(obj,6,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65PedidoCliente", AV65PedidoCliente);
      AV59BarSer = (String)getParm(obj,7,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59BarSer", AV59BarSer);
      AV60BarSerDsc = (String)getParm(obj,8,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60BarSerDsc", AV60BarSerDsc);
      AV61BarColNom = (String)getParm(obj,9,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61BarColNom", AV61BarColNom);
      AV62BarColNum = ((Number) GXutil.testNumericType( getParm(obj,10,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62BarColNum), 6, 0));
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
      pa1S02( ) ;
      ws1S02( ) ;
      we1S02( ) ;
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
      sCtrlAV47EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV48BarCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV49BarCodReo = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV50BarCodPar = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV63CliCod = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV64CliNom = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV65PedidoCliente = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV59BarSer = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV60BarSerDsc = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV61BarColNom = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV62BarColNum = (String)getParm(obj,10,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1S02( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "produccion\\consultadeproduccion_packinglist", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1S02( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV47EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47EmprCod", AV47EmprCod);
         AV48BarCod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48BarCod), 8, 0));
         AV49BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49BarCodReo", GXutil.str( AV49BarCodReo, 1, 0));
         AV50BarCodPar = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50BarCodPar", AV50BarCodPar);
         AV63CliCod = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63CliCod), 6, 0));
         AV64CliNom = (String)getParm(obj,7,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64CliNom", AV64CliNom);
         AV65PedidoCliente = (String)getParm(obj,8,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65PedidoCliente", AV65PedidoCliente);
         AV59BarSer = (String)getParm(obj,9,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59BarSer", AV59BarSer);
         AV60BarSerDsc = (String)getParm(obj,10,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60BarSerDsc", AV60BarSerDsc);
         AV61BarColNom = (String)getParm(obj,11,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61BarColNom", AV61BarColNom);
         AV62BarColNum = ((Number) GXutil.testNumericType( getParm(obj,12,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62BarColNum), 6, 0));
      }
      wcpOAV47EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV47EmprCod") ;
      wcpOAV48BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV48BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV49BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV49BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV50BarCodPar = httpContext.cgiGet( sPrefix+"wcpOAV50BarCodPar") ;
      wcpOAV63CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV63CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV64CliNom = httpContext.cgiGet( sPrefix+"wcpOAV64CliNom") ;
      wcpOAV65PedidoCliente = httpContext.cgiGet( sPrefix+"wcpOAV65PedidoCliente") ;
      wcpOAV59BarSer = httpContext.cgiGet( sPrefix+"wcpOAV59BarSer") ;
      wcpOAV60BarSerDsc = httpContext.cgiGet( sPrefix+"wcpOAV60BarSerDsc") ;
      wcpOAV61BarColNom = httpContext.cgiGet( sPrefix+"wcpOAV61BarColNom") ;
      wcpOAV62BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV62BarColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV47EmprCod, wcpOAV47EmprCod) != 0 ) || ( AV48BarCod != wcpOAV48BarCod ) || ( AV49BarCodReo != wcpOAV49BarCodReo ) || ( GXutil.strcmp(AV50BarCodPar, wcpOAV50BarCodPar) != 0 ) || ( AV63CliCod != wcpOAV63CliCod ) || ( GXutil.strcmp(AV64CliNom, wcpOAV64CliNom) != 0 ) || ( GXutil.strcmp(AV65PedidoCliente, wcpOAV65PedidoCliente) != 0 ) || ( GXutil.strcmp(AV59BarSer, wcpOAV59BarSer) != 0 ) || ( GXutil.strcmp(AV60BarSerDsc, wcpOAV60BarSerDsc) != 0 ) || ( GXutil.strcmp(AV61BarColNom, wcpOAV61BarColNom) != 0 ) || ( AV62BarColNum != wcpOAV62BarColNum ) ) )
      {
         setjustcreated();
      }
      wcpOAV47EmprCod = AV47EmprCod ;
      wcpOAV48BarCod = AV48BarCod ;
      wcpOAV49BarCodReo = AV49BarCodReo ;
      wcpOAV50BarCodPar = AV50BarCodPar ;
      wcpOAV63CliCod = AV63CliCod ;
      wcpOAV64CliNom = AV64CliNom ;
      wcpOAV65PedidoCliente = AV65PedidoCliente ;
      wcpOAV59BarSer = AV59BarSer ;
      wcpOAV60BarSerDsc = AV60BarSerDsc ;
      wcpOAV61BarColNom = AV61BarColNom ;
      wcpOAV62BarColNum = AV62BarColNum ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV47EmprCod = httpContext.cgiGet( sPrefix+"AV47EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV47EmprCod) > 0 )
      {
         AV47EmprCod = httpContext.cgiGet( sCtrlAV47EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47EmprCod", AV47EmprCod);
      }
      else
      {
         AV47EmprCod = httpContext.cgiGet( sPrefix+"AV47EmprCod_PARM") ;
      }
      sCtrlAV48BarCod = httpContext.cgiGet( sPrefix+"AV48BarCod_CTRL") ;
      if ( GXutil.len( sCtrlAV48BarCod) > 0 )
      {
         AV48BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV48BarCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48BarCod), 8, 0));
      }
      else
      {
         AV48BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV48BarCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV49BarCodReo = httpContext.cgiGet( sPrefix+"AV49BarCodReo_CTRL") ;
      if ( GXutil.len( sCtrlAV49BarCodReo) > 0 )
      {
         AV49BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV49BarCodReo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49BarCodReo", GXutil.str( AV49BarCodReo, 1, 0));
      }
      else
      {
         AV49BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV49BarCodReo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV50BarCodPar = httpContext.cgiGet( sPrefix+"AV50BarCodPar_CTRL") ;
      if ( GXutil.len( sCtrlAV50BarCodPar) > 0 )
      {
         AV50BarCodPar = httpContext.cgiGet( sCtrlAV50BarCodPar) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50BarCodPar", AV50BarCodPar);
      }
      else
      {
         AV50BarCodPar = httpContext.cgiGet( sPrefix+"AV50BarCodPar_PARM") ;
      }
      sCtrlAV63CliCod = httpContext.cgiGet( sPrefix+"AV63CliCod_CTRL") ;
      if ( GXutil.len( sCtrlAV63CliCod) > 0 )
      {
         AV63CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV63CliCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63CliCod), 6, 0));
      }
      else
      {
         AV63CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV63CliCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV64CliNom = httpContext.cgiGet( sPrefix+"AV64CliNom_CTRL") ;
      if ( GXutil.len( sCtrlAV64CliNom) > 0 )
      {
         AV64CliNom = httpContext.cgiGet( sCtrlAV64CliNom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64CliNom", AV64CliNom);
      }
      else
      {
         AV64CliNom = httpContext.cgiGet( sPrefix+"AV64CliNom_PARM") ;
      }
      sCtrlAV65PedidoCliente = httpContext.cgiGet( sPrefix+"AV65PedidoCliente_CTRL") ;
      if ( GXutil.len( sCtrlAV65PedidoCliente) > 0 )
      {
         AV65PedidoCliente = httpContext.cgiGet( sCtrlAV65PedidoCliente) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65PedidoCliente", AV65PedidoCliente);
      }
      else
      {
         AV65PedidoCliente = httpContext.cgiGet( sPrefix+"AV65PedidoCliente_PARM") ;
      }
      sCtrlAV59BarSer = httpContext.cgiGet( sPrefix+"AV59BarSer_CTRL") ;
      if ( GXutil.len( sCtrlAV59BarSer) > 0 )
      {
         AV59BarSer = httpContext.cgiGet( sCtrlAV59BarSer) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59BarSer", AV59BarSer);
      }
      else
      {
         AV59BarSer = httpContext.cgiGet( sPrefix+"AV59BarSer_PARM") ;
      }
      sCtrlAV60BarSerDsc = httpContext.cgiGet( sPrefix+"AV60BarSerDsc_CTRL") ;
      if ( GXutil.len( sCtrlAV60BarSerDsc) > 0 )
      {
         AV60BarSerDsc = httpContext.cgiGet( sCtrlAV60BarSerDsc) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60BarSerDsc", AV60BarSerDsc);
      }
      else
      {
         AV60BarSerDsc = httpContext.cgiGet( sPrefix+"AV60BarSerDsc_PARM") ;
      }
      sCtrlAV61BarColNom = httpContext.cgiGet( sPrefix+"AV61BarColNom_CTRL") ;
      if ( GXutil.len( sCtrlAV61BarColNom) > 0 )
      {
         AV61BarColNom = httpContext.cgiGet( sCtrlAV61BarColNom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61BarColNom", AV61BarColNom);
      }
      else
      {
         AV61BarColNom = httpContext.cgiGet( sPrefix+"AV61BarColNom_PARM") ;
      }
      sCtrlAV62BarColNum = httpContext.cgiGet( sPrefix+"AV62BarColNum_CTRL") ;
      if ( GXutil.len( sCtrlAV62BarColNum) > 0 )
      {
         AV62BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV62BarColNum), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62BarColNum), 6, 0));
      }
      else
      {
         AV62BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV62BarColNum_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa1S02( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1S02( ) ;
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
      ws1S02( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV47EmprCod_PARM", GXutil.rtrim( AV47EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV47EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV47EmprCod_CTRL", GXutil.rtrim( sCtrlAV47EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV48BarCod_PARM", GXutil.ltrim( localUtil.ntoc( AV48BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV48BarCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV48BarCod_CTRL", GXutil.rtrim( sCtrlAV48BarCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV49BarCodReo_PARM", GXutil.ltrim( localUtil.ntoc( AV49BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV49BarCodReo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV49BarCodReo_CTRL", GXutil.rtrim( sCtrlAV49BarCodReo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV50BarCodPar_PARM", GXutil.rtrim( AV50BarCodPar));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV50BarCodPar)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV50BarCodPar_CTRL", GXutil.rtrim( sCtrlAV50BarCodPar));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV63CliCod_PARM", GXutil.ltrim( localUtil.ntoc( AV63CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV63CliCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV63CliCod_CTRL", GXutil.rtrim( sCtrlAV63CliCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV64CliNom_PARM", GXutil.rtrim( AV64CliNom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV64CliNom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV64CliNom_CTRL", GXutil.rtrim( sCtrlAV64CliNom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV65PedidoCliente_PARM", GXutil.rtrim( AV65PedidoCliente));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV65PedidoCliente)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV65PedidoCliente_CTRL", GXutil.rtrim( sCtrlAV65PedidoCliente));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV59BarSer_PARM", GXutil.rtrim( AV59BarSer));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV59BarSer)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV59BarSer_CTRL", GXutil.rtrim( sCtrlAV59BarSer));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV60BarSerDsc_PARM", GXutil.rtrim( AV60BarSerDsc));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV60BarSerDsc)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV60BarSerDsc_CTRL", GXutil.rtrim( sCtrlAV60BarSerDsc));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV61BarColNom_PARM", GXutil.rtrim( AV61BarColNom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV61BarColNom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV61BarColNom_CTRL", GXutil.rtrim( sCtrlAV61BarColNom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV62BarColNum_PARM", GXutil.ltrim( localUtil.ntoc( AV62BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV62BarColNum)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV62BarColNum_CTRL", GXutil.rtrim( sCtrlAV62BarColNum));
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
      we1S02( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026821155630", true, true);
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
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("produccion/consultadeproduccion_packinglist.js", "?2026821155631", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_1052( )
   {
      edtMetTerCod_Internalname = sPrefix+"METTERCOD_"+sGXsfl_105_idx ;
      edtMetPieCod_Internalname = sPrefix+"METPIECOD_"+sGXsfl_105_idx ;
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_105_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_105_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_105_idx ;
      edtMetPieMet_Internalname = sPrefix+"METPIEMET_"+sGXsfl_105_idx ;
      edtMetPieKil_Internalname = sPrefix+"METPIEKIL_"+sGXsfl_105_idx ;
      edtMetPieAnc_Internalname = sPrefix+"METPIEANC_"+sGXsfl_105_idx ;
      edtMetPieEst_Internalname = sPrefix+"METPIEEST_"+sGXsfl_105_idx ;
      edtavMaqcod_Internalname = sPrefix+"vMAQCOD_"+sGXsfl_105_idx ;
      edtavHisprofec_Internalname = sPrefix+"vHISPROFEC_"+sGXsfl_105_idx ;
      edtavBarordlin_Internalname = sPrefix+"vBARORDLIN_"+sGXsfl_105_idx ;
   }

   public void subsflControlProps_fel_1052( )
   {
      edtMetTerCod_Internalname = sPrefix+"METTERCOD_"+sGXsfl_105_fel_idx ;
      edtMetPieCod_Internalname = sPrefix+"METPIECOD_"+sGXsfl_105_fel_idx ;
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_105_fel_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_105_fel_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_105_fel_idx ;
      edtMetPieMet_Internalname = sPrefix+"METPIEMET_"+sGXsfl_105_fel_idx ;
      edtMetPieKil_Internalname = sPrefix+"METPIEKIL_"+sGXsfl_105_fel_idx ;
      edtMetPieAnc_Internalname = sPrefix+"METPIEANC_"+sGXsfl_105_fel_idx ;
      edtMetPieEst_Internalname = sPrefix+"METPIEEST_"+sGXsfl_105_fel_idx ;
      edtavMaqcod_Internalname = sPrefix+"vMAQCOD_"+sGXsfl_105_fel_idx ;
      edtavHisprofec_Internalname = sPrefix+"vHISPROFEC_"+sGXsfl_105_fel_idx ;
      edtavBarordlin_Internalname = sPrefix+"vBARORDLIN_"+sGXsfl_105_fel_idx ;
   }

   public void sendrow_1052( )
   {
      subsflControlProps_1052( ) ;
      wb1S00( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_105_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_105_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_105_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMetTerCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetTerCod_Internalname,GXutil.rtrim( A2809MetTerCod),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMetTerCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtMetTerCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(105),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMetPieCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieCod_Internalname,GXutil.rtrim( A2813MetPieCod),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMetPieCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMetPieCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(105),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(105),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(105),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(105),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMetPieMet_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieMet_Internalname,GXutil.ltrim( localUtil.ntoc( A2815MetPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A2815MetPieMet, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMetPieMet_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMetPieMet_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(105),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMetPieKil_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieKil_Internalname,GXutil.ltrim( localUtil.ntoc( A2814MetPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A2814MetPieKil, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMetPieKil_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMetPieKil_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(105),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMetPieAnc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieAnc_Internalname,GXutil.ltrim( localUtil.ntoc( A6635MetPieAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6635MetPieAnc), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMetPieAnc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMetPieAnc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(105),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMetPieEst_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieEst_Internalname,GXutil.ltrim( localUtil.ntoc( A2816MetPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2816MetPieEst), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMetPieEst_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMetPieEst_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(105),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavMaqcod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod_Internalname,GXutil.rtrim( AV34MaqCod),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavMaqcod_Visible),Integer.valueOf(edtavMaqcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(105),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavHisprofec_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHisprofec_Internalname,localUtil.format(AV35HisProFec, "99/99/99"),localUtil.format( AV35HisProFec, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHisprofec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavHisprofec_Visible),Integer.valueOf(edtavHisprofec_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(105),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavBarordlin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarordlin_Internalname,GXutil.ltrim( localUtil.ntoc( AV36BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBarordlin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV36BarOrdLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV36BarOrdLin), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBarordlin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavBarordlin_Visible),Integer.valueOf(edtavBarordlin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(105),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1S02( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_105_idx = ((subGrid_Islastpage==1)&&(nGXsfl_105_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_105_idx+1) ;
         sGXsfl_105_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_105_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1052( ) ;
      }
      /* End function sendrow_1052 */
   }

   public void startgridcontrol105( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"105\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMetTerCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Terminal", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMetPieCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pieza", "")) ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMetPieMet_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMetPieKil_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMetPieAnc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ancho", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMetPieEst_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "E", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavMaqcod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHisprofec_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavBarordlin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Orden", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A2809MetTerCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMetTerCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A2813MetPieCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMetPieCod_Visible, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2815MetPieMet, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMetPieMet_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2814MetPieKil, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMetPieKil_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6635MetPieAnc, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMetPieAnc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2816MetPieEst, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMetPieEst_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV34MaqCod));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavMaqcod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(AV35HisProFec, "99/99/99"));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHisprofec_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHisprofec_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV36BarOrdLin, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarordlin_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavBarordlin_Visible, (byte)(5), (byte)(0), ".", "")));
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
      edtavBarcod_Internalname = sPrefix+"vBARCOD" ;
      edtavBarcodreo_Internalname = sPrefix+"vBARCODREO" ;
      edtavBarcodpar_Internalname = sPrefix+"vBARCODPAR" ;
      edtavClicod_Internalname = sPrefix+"vCLICOD" ;
      edtavClinom_Internalname = sPrefix+"vCLINOM" ;
      edtavPedidocliente_Internalname = sPrefix+"vPEDIDOCLIENTE" ;
      divUnnamedtable3_Internalname = sPrefix+"UNNAMEDTABLE3" ;
      edtavBarser_Internalname = sPrefix+"vBARSER" ;
      edtavBarserdsc_Internalname = sPrefix+"vBARSERDSC" ;
      edtavBarcolnom_Internalname = sPrefix+"vBARCOLNOM" ;
      edtavBarcolnum_Internalname = sPrefix+"vBARCOLNUM" ;
      divUnnamedtable4_Internalname = sPrefix+"UNNAMEDTABLE4" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE1" ;
      bttBtnexport_Internalname = sPrefix+"BTNEXPORT" ;
      bttBtnexportcsv_Internalname = sPrefix+"BTNEXPORTCSV" ;
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      edtavBarnhdr_Internalname = sPrefix+"vBARNHDR" ;
      edtavBarmtr_Internalname = sPrefix+"vBARMTR" ;
      edtavBarkgm_Internalname = sPrefix+"vBARKGM" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtMetTerCod_Internalname = sPrefix+"METTERCOD" ;
      edtMetPieCod_Internalname = sPrefix+"METPIECOD" ;
      edtBarCod_Internalname = sPrefix+"BARCOD" ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO" ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR" ;
      edtMetPieMet_Internalname = sPrefix+"METPIEMET" ;
      edtMetPieKil_Internalname = sPrefix+"METPIEKIL" ;
      edtMetPieAnc_Internalname = sPrefix+"METPIEANC" ;
      edtMetPieEst_Internalname = sPrefix+"METPIEEST" ;
      edtavMaqcod_Internalname = sPrefix+"vMAQCOD" ;
      edtavHisprofec_Internalname = sPrefix+"vHISPROFEC" ;
      edtavBarordlin_Internalname = sPrefix+"vBARORDLIN" ;
      edtavTotvaluemetpiemet_Internalname = sPrefix+"vTOTVALUEMETPIEMET" ;
      edtavTotvaluemetpiekil_Internalname = sPrefix+"vTOTVALUEMETPIEKIL" ;
      tblGridtabletotalizer_Internalname = sPrefix+"GRIDTABLETOTALIZER" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      divTablacontent_Internalname = sPrefix+"TABLACONTENT" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      edtEmprCod_Internalname = sPrefix+"EMPRCOD" ;
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
      edtavBarordlin_Jsonclick = "" ;
      edtavBarordlin_Enabled = 0 ;
      edtavHisprofec_Jsonclick = "" ;
      edtavHisprofec_Enabled = 0 ;
      edtavMaqcod_Jsonclick = "" ;
      edtavMaqcod_Enabled = 0 ;
      edtMetPieEst_Jsonclick = "" ;
      edtMetPieAnc_Jsonclick = "" ;
      edtMetPieKil_Jsonclick = "" ;
      edtMetPieMet_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      edtMetPieCod_Jsonclick = "" ;
      edtMetTerCod_Jsonclick = "" ;
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavTotvaluemetpiekil_Jsonclick = "" ;
      edtavTotvaluemetpiekil_Enabled = 1 ;
      edtavTotvaluemetpiemet_Jsonclick = "" ;
      edtavTotvaluemetpiemet_Enabled = 1 ;
      edtavBarordlin_Visible = -1 ;
      edtavHisprofec_Visible = -1 ;
      edtavMaqcod_Visible = -1 ;
      edtMetPieEst_Visible = -1 ;
      edtMetPieAnc_Visible = -1 ;
      edtMetPieKil_Visible = -1 ;
      edtMetPieMet_Visible = -1 ;
      edtMetPieCod_Visible = -1 ;
      edtMetTerCod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavBarkgm_Jsonclick = "" ;
      edtavBarkgm_Enabled = 1 ;
      edtavBarmtr_Jsonclick = "" ;
      edtavBarmtr_Enabled = 1 ;
      edtavBarnhdr_Jsonclick = "" ;
      edtavBarnhdr_Enabled = 1 ;
      edtavBarcolnum_Jsonclick = "" ;
      edtavBarcolnum_Enabled = 0 ;
      edtavBarcolnom_Jsonclick = "" ;
      edtavBarcolnom_Enabled = 0 ;
      edtavBarserdsc_Jsonclick = "" ;
      edtavBarserdsc_Enabled = 0 ;
      edtavBarser_Jsonclick = "" ;
      edtavBarser_Enabled = 0 ;
      edtavPedidocliente_Jsonclick = "" ;
      edtavPedidocliente_Enabled = 0 ;
      edtavClinom_Jsonclick = "" ;
      edtavClinom_Enabled = 0 ;
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Enabled = 0 ;
      edtavBarcodpar_Jsonclick = "" ;
      edtavBarcodpar_Enabled = 0 ;
      edtavBarcodreo_Jsonclick = "" ;
      edtavBarcodreo_Enabled = 0 ;
      edtavBarcod_Jsonclick = "" ;
      edtavBarcod_Enabled = 0 ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "Produccion.ConsultadeProduccion_PackingListGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic|Dynamic|||||||" ;
      Ddo_grid_Includedatalist = "T|T|||||||" ;
      Ddo_grid_Filterisrange = "||T|T|T|T|||" ;
      Ddo_grid_Filtertype = "Character|Character|Numeric|Numeric|Numeric|Numeric|||" ;
      Ddo_grid_Includefilter = "T|T|T|T|T|T|||" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T|T|T|T|T|||" ;
      Ddo_grid_Columnssortvalues = "2|1|3|4|5|6|||" ;
      Ddo_grid_Columnids = "0:MetTerCod|1:MetPieCod|5:MetPieMet|6:MetPieKil|7:MetPieAnc|8:MetPieEst|9:MaqCod|10:HisProFec|11:BarOrdLin" ;
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
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Informacion General", "") ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV75Produccion_consultadeproduccion_packinglistds_1_emprcod',fld:'vPRODUCCION_CONSULTADEPRODUCCION_PACKINGLISTDS_1_EMPRCOD',pic:'@!'},{av:'AV76Produccion_consultadeproduccion_packinglistds_2_barcod',fld:'vPRODUCCION_CONSULTADEPRODUCCION_PACKINGLISTDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV77Produccion_consultadeproduccion_packinglistds_3_barcodreo',fld:'vPRODUCCION_CONSULTADEPRODUCCION_PACKINGLISTDS_3_BARCODREO',pic:'9'},{av:'AV78Produccion_consultadeproduccion_packinglistds_4_barcodpar',fld:'vPRODUCCION_CONSULTADEPRODUCCION_PACKINGLISTDS_4_BARCODPAR',pic:''},{av:'sPrefix'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV47EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV48BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV49BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV50BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV26TFMetTerCod',fld:'vTFMETTERCOD',pic:''},{av:'AV27TFMetTerCod_Sel',fld:'vTFMETTERCOD_SEL',pic:''},{av:'AV28TFMetPieCod',fld:'vTFMETPIECOD',pic:''},{av:'AV29TFMetPieCod_Sel',fld:'vTFMETPIECOD_SEL',pic:''},{av:'AV37TFMetPieMet',fld:'vTFMETPIEMET',pic:'ZZZZZ9.99'},{av:'AV38TFMetPieMet_To',fld:'vTFMETPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV39TFMetPieKil',fld:'vTFMETPIEKIL',pic:'ZZZZZ9.99'},{av:'AV40TFMetPieKil_To',fld:'vTFMETPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV41TFMetPieAnc',fld:'vTFMETPIEANC',pic:'ZZ9'},{av:'AV42TFMetPieAnc_To',fld:'vTFMETPIEANC_TO',pic:'ZZ9'},{av:'AV57TFMetPieEst',fld:'vTFMETPIEEST',pic:'9'},{av:'AV58TFMetPieEst_To',fld:'vTFMETPIEEST_TO',pic:'9'},{av:'AV73Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV63CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV64CliNom',fld:'vCLINOM',pic:''},{av:'AV65PedidoCliente',fld:'vPEDIDOCLIENTE',pic:''},{av:'AV59BarSer',fld:'vBARSER',pic:''},{av:'AV60BarSerDsc',fld:'vBARSERDSC',pic:''},{av:'AV61BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV62BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV43TotMetPieMet',fld:'vTOTMETPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV45TotMetPieKil',fld:'vTOTMETPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV66moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2815MetPieMet',fld:'METPIEMET',pic:'ZZZZZ9.99'},{av:'A2814MetPieKil',fld:'METPIEKIL',pic:'ZZZZZ9.99'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtMetTerCod_Visible',ctrl:'METTERCOD',prop:'Visible'},{av:'edtMetPieCod_Visible',ctrl:'METPIECOD',prop:'Visible'},{av:'edtMetPieMet_Visible',ctrl:'METPIEMET',prop:'Visible'},{av:'edtMetPieKil_Visible',ctrl:'METPIEKIL',prop:'Visible'},{av:'edtMetPieAnc_Visible',ctrl:'METPIEANC',prop:'Visible'},{av:'edtMetPieEst_Visible',ctrl:'METPIEEST',prop:'Visible'},{av:'edtavMaqcod_Visible',ctrl:'vMAQCOD',prop:'Visible'},{av:'edtavHisprofec_Visible',ctrl:'vHISPROFEC',prop:'Visible'},{av:'edtavBarordlin_Visible',ctrl:'vBARORDLIN',prop:'Visible'},{av:'AV32GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV33GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV43TotMetPieMet',fld:'vTOTMETPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV45TotMetPieKil',fld:'vTOTMETPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV44TotValueMetPieMet',fld:'vTOTVALUEMETPIEMET',pic:''},{av:'AV46TotValueMetPieKil',fld:'vTOTVALUEMETPIEKIL',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e111S02',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV47EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV48BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV49BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV50BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV26TFMetTerCod',fld:'vTFMETTERCOD',pic:''},{av:'AV27TFMetTerCod_Sel',fld:'vTFMETTERCOD_SEL',pic:''},{av:'AV28TFMetPieCod',fld:'vTFMETPIECOD',pic:''},{av:'AV29TFMetPieCod_Sel',fld:'vTFMETPIECOD_SEL',pic:''},{av:'AV37TFMetPieMet',fld:'vTFMETPIEMET',pic:'ZZZZZ9.99'},{av:'AV38TFMetPieMet_To',fld:'vTFMETPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV39TFMetPieKil',fld:'vTFMETPIEKIL',pic:'ZZZZZ9.99'},{av:'AV40TFMetPieKil_To',fld:'vTFMETPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV41TFMetPieAnc',fld:'vTFMETPIEANC',pic:'ZZ9'},{av:'AV42TFMetPieAnc_To',fld:'vTFMETPIEANC_TO',pic:'ZZ9'},{av:'AV57TFMetPieEst',fld:'vTFMETPIEEST',pic:'9'},{av:'AV58TFMetPieEst_To',fld:'vTFMETPIEEST_TO',pic:'9'},{av:'AV73Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV63CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV64CliNom',fld:'vCLINOM',pic:''},{av:'AV65PedidoCliente',fld:'vPEDIDOCLIENTE',pic:''},{av:'AV59BarSer',fld:'vBARSER',pic:''},{av:'AV60BarSerDsc',fld:'vBARSERDSC',pic:''},{av:'AV61BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV62BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV43TotMetPieMet',fld:'vTOTMETPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV45TotMetPieKil',fld:'vTOTMETPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV75Produccion_consultadeproduccion_packinglistds_1_emprcod',fld:'vPRODUCCION_CONSULTADEPRODUCCION_PACKINGLISTDS_1_EMPRCOD',pic:'@!'},{av:'AV76Produccion_consultadeproduccion_packinglistds_2_barcod',fld:'vPRODUCCION_CONSULTADEPRODUCCION_PACKINGLISTDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV77Produccion_consultadeproduccion_packinglistds_3_barcodreo',fld:'vPRODUCCION_CONSULTADEPRODUCCION_PACKINGLISTDS_3_BARCODREO',pic:'9'},{av:'AV78Produccion_consultadeproduccion_packinglistds_4_barcodpar',fld:'vPRODUCCION_CONSULTADEPRODUCCION_PACKINGLISTDS_4_BARCODPAR',pic:''},{av:'AV66moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e121S02',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV47EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV48BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV49BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV50BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV26TFMetTerCod',fld:'vTFMETTERCOD',pic:''},{av:'AV27TFMetTerCod_Sel',fld:'vTFMETTERCOD_SEL',pic:''},{av:'AV28TFMetPieCod',fld:'vTFMETPIECOD',pic:''},{av:'AV29TFMetPieCod_Sel',fld:'vTFMETPIECOD_SEL',pic:''},{av:'AV37TFMetPieMet',fld:'vTFMETPIEMET',pic:'ZZZZZ9.99'},{av:'AV38TFMetPieMet_To',fld:'vTFMETPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV39TFMetPieKil',fld:'vTFMETPIEKIL',pic:'ZZZZZ9.99'},{av:'AV40TFMetPieKil_To',fld:'vTFMETPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV41TFMetPieAnc',fld:'vTFMETPIEANC',pic:'ZZ9'},{av:'AV42TFMetPieAnc_To',fld:'vTFMETPIEANC_TO',pic:'ZZ9'},{av:'AV57TFMetPieEst',fld:'vTFMETPIEEST',pic:'9'},{av:'AV58TFMetPieEst_To',fld:'vTFMETPIEEST_TO',pic:'9'},{av:'AV73Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV63CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV64CliNom',fld:'vCLINOM',pic:''},{av:'AV65PedidoCliente',fld:'vPEDIDOCLIENTE',pic:''},{av:'AV59BarSer',fld:'vBARSER',pic:''},{av:'AV60BarSerDsc',fld:'vBARSERDSC',pic:''},{av:'AV61BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV62BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV43TotMetPieMet',fld:'vTOTMETPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV45TotMetPieKil',fld:'vTOTMETPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV75Produccion_consultadeproduccion_packinglistds_1_emprcod',fld:'vPRODUCCION_CONSULTADEPRODUCCION_PACKINGLISTDS_1_EMPRCOD',pic:'@!'},{av:'AV76Produccion_consultadeproduccion_packinglistds_2_barcod',fld:'vPRODUCCION_CONSULTADEPRODUCCION_PACKINGLISTDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV77Produccion_consultadeproduccion_packinglistds_3_barcodreo',fld:'vPRODUCCION_CONSULTADEPRODUCCION_PACKINGLISTDS_3_BARCODREO',pic:'9'},{av:'AV78Produccion_consultadeproduccion_packinglistds_4_barcodpar',fld:'vPRODUCCION_CONSULTADEPRODUCCION_PACKINGLISTDS_4_BARCODPAR',pic:''},{av:'AV66moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e131S02',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV47EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV48BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV49BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV50BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV26TFMetTerCod',fld:'vTFMETTERCOD',pic:''},{av:'AV27TFMetTerCod_Sel',fld:'vTFMETTERCOD_SEL',pic:''},{av:'AV28TFMetPieCod',fld:'vTFMETPIECOD',pic:''},{av:'AV29TFMetPieCod_Sel',fld:'vTFMETPIECOD_SEL',pic:''},{av:'AV37TFMetPieMet',fld:'vTFMETPIEMET',pic:'ZZZZZ9.99'},{av:'AV38TFMetPieMet_To',fld:'vTFMETPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV39TFMetPieKil',fld:'vTFMETPIEKIL',pic:'ZZZZZ9.99'},{av:'AV40TFMetPieKil_To',fld:'vTFMETPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV41TFMetPieAnc',fld:'vTFMETPIEANC',pic:'ZZ9'},{av:'AV42TFMetPieAnc_To',fld:'vTFMETPIEANC_TO',pic:'ZZ9'},{av:'AV57TFMetPieEst',fld:'vTFMETPIEEST',pic:'9'},{av:'AV58TFMetPieEst_To',fld:'vTFMETPIEEST_TO',pic:'9'},{av:'AV73Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV63CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV64CliNom',fld:'vCLINOM',pic:''},{av:'AV65PedidoCliente',fld:'vPEDIDOCLIENTE',pic:''},{av:'AV59BarSer',fld:'vBARSER',pic:''},{av:'AV60BarSerDsc',fld:'vBARSERDSC',pic:''},{av:'AV61BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV62BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV43TotMetPieMet',fld:'vTOTMETPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV45TotMetPieKil',fld:'vTOTMETPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV75Produccion_consultadeproduccion_packinglistds_1_emprcod',fld:'vPRODUCCION_CONSULTADEPRODUCCION_PACKINGLISTDS_1_EMPRCOD',pic:'@!'},{av:'AV76Produccion_consultadeproduccion_packinglistds_2_barcod',fld:'vPRODUCCION_CONSULTADEPRODUCCION_PACKINGLISTDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV77Produccion_consultadeproduccion_packinglistds_3_barcodreo',fld:'vPRODUCCION_CONSULTADEPRODUCCION_PACKINGLISTDS_3_BARCODREO',pic:'9'},{av:'AV78Produccion_consultadeproduccion_packinglistds_4_barcodpar',fld:'vPRODUCCION_CONSULTADEPRODUCCION_PACKINGLISTDS_4_BARCODPAR',pic:''},{av:'AV66moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV57TFMetPieEst',fld:'vTFMETPIEEST',pic:'9'},{av:'AV58TFMetPieEst_To',fld:'vTFMETPIEEST_TO',pic:'9'},{av:'AV41TFMetPieAnc',fld:'vTFMETPIEANC',pic:'ZZ9'},{av:'AV42TFMetPieAnc_To',fld:'vTFMETPIEANC_TO',pic:'ZZ9'},{av:'AV39TFMetPieKil',fld:'vTFMETPIEKIL',pic:'ZZZZZ9.99'},{av:'AV40TFMetPieKil_To',fld:'vTFMETPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV37TFMetPieMet',fld:'vTFMETPIEMET',pic:'ZZZZZ9.99'},{av:'AV38TFMetPieMet_To',fld:'vTFMETPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV28TFMetPieCod',fld:'vTFMETPIECOD',pic:''},{av:'AV29TFMetPieCod_Sel',fld:'vTFMETPIECOD_SEL',pic:''},{av:'AV26TFMetTerCod',fld:'vTFMETTERCOD',pic:''},{av:'AV27TFMetTerCod_Sel',fld:'vTFMETTERCOD_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e191S02',iparms:[{av:'A4917MetPieObs',fld:'METPIEOBS',pic:''}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV34MaqCod',fld:'vMAQCOD',pic:''},{av:'AV35HisProFec',fld:'vHISPROFEC',pic:''},{av:'AV36BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e141S02',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV47EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV48BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV49BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV50BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV26TFMetTerCod',fld:'vTFMETTERCOD',pic:''},{av:'AV27TFMetTerCod_Sel',fld:'vTFMETTERCOD_SEL',pic:''},{av:'AV28TFMetPieCod',fld:'vTFMETPIECOD',pic:''},{av:'AV29TFMetPieCod_Sel',fld:'vTFMETPIECOD_SEL',pic:''},{av:'AV37TFMetPieMet',fld:'vTFMETPIEMET',pic:'ZZZZZ9.99'},{av:'AV38TFMetPieMet_To',fld:'vTFMETPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV39TFMetPieKil',fld:'vTFMETPIEKIL',pic:'ZZZZZ9.99'},{av:'AV40TFMetPieKil_To',fld:'vTFMETPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV41TFMetPieAnc',fld:'vTFMETPIEANC',pic:'ZZ9'},{av:'AV42TFMetPieAnc_To',fld:'vTFMETPIEANC_TO',pic:'ZZ9'},{av:'AV57TFMetPieEst',fld:'vTFMETPIEEST',pic:'9'},{av:'AV58TFMetPieEst_To',fld:'vTFMETPIEEST_TO',pic:'9'},{av:'AV73Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV63CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV64CliNom',fld:'vCLINOM',pic:''},{av:'AV65PedidoCliente',fld:'vPEDIDOCLIENTE',pic:''},{av:'AV59BarSer',fld:'vBARSER',pic:''},{av:'AV60BarSerDsc',fld:'vBARSERDSC',pic:''},{av:'AV61BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV62BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV43TotMetPieMet',fld:'vTOTMETPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV45TotMetPieKil',fld:'vTOTMETPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV75Produccion_consultadeproduccion_packinglistds_1_emprcod',fld:'vPRODUCCION_CONSULTADEPRODUCCION_PACKINGLISTDS_1_EMPRCOD',pic:'@!'},{av:'AV76Produccion_consultadeproduccion_packinglistds_2_barcod',fld:'vPRODUCCION_CONSULTADEPRODUCCION_PACKINGLISTDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV77Produccion_consultadeproduccion_packinglistds_3_barcodreo',fld:'vPRODUCCION_CONSULTADEPRODUCCION_PACKINGLISTDS_3_BARCODREO',pic:'9'},{av:'AV78Produccion_consultadeproduccion_packinglistds_4_barcodpar',fld:'vPRODUCCION_CONSULTADEPRODUCCION_PACKINGLISTDS_4_BARCODPAR',pic:''},{av:'AV66moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'},{av:'A2815MetPieMet',fld:'METPIEMET',pic:'ZZZZZ9.99'},{av:'A2814MetPieKil',fld:'METPIEKIL',pic:'ZZZZZ9.99'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtMetTerCod_Visible',ctrl:'METTERCOD',prop:'Visible'},{av:'edtMetPieCod_Visible',ctrl:'METPIECOD',prop:'Visible'},{av:'edtMetPieMet_Visible',ctrl:'METPIEMET',prop:'Visible'},{av:'edtMetPieKil_Visible',ctrl:'METPIEKIL',prop:'Visible'},{av:'edtMetPieAnc_Visible',ctrl:'METPIEANC',prop:'Visible'},{av:'edtMetPieEst_Visible',ctrl:'METPIEEST',prop:'Visible'},{av:'edtavMaqcod_Visible',ctrl:'vMAQCOD',prop:'Visible'},{av:'edtavHisprofec_Visible',ctrl:'vHISPROFEC',prop:'Visible'},{av:'edtavBarordlin_Visible',ctrl:'vBARORDLIN',prop:'Visible'},{av:'AV32GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV33GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV43TotMetPieMet',fld:'vTOTMETPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV45TotMetPieKil',fld:'vTOTMETPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV44TotValueMetPieMet',fld:'vTOTVALUEMETPIEMET',pic:''},{av:'AV46TotValueMetPieKil',fld:'vTOTVALUEMETPIEKIL',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e151S02',iparms:[{av:'AV47EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV48BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV49BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV50BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV66moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e161S02',iparms:[{av:'AV47EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV48BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV49BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV50BarCodPar',fld:'vBARCODPAR',pic:''}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VALIDV_BARCOD","{handler:'validv_Barcod',iparms:[]");
      setEventMetadata("VALIDV_BARCOD",",oparms:[]}");
      setEventMetadata("VALIDV_BARCODREO","{handler:'validv_Barcodreo',iparms:[]");
      setEventMetadata("VALIDV_BARCODREO",",oparms:[]}");
      setEventMetadata("VALIDV_BARCODPAR","{handler:'validv_Barcodpar',iparms:[]");
      setEventMetadata("VALIDV_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Barordlin',iparms:[]");
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
      wcpOAV47EmprCod = "" ;
      wcpOAV50BarCodPar = "" ;
      wcpOAV64CliNom = "" ;
      wcpOAV65PedidoCliente = "" ;
      wcpOAV59BarSer = "" ;
      wcpOAV60BarSerDsc = "" ;
      wcpOAV61BarColNom = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV47EmprCod = "" ;
      AV50BarCodPar = "" ;
      AV64CliNom = "" ;
      AV65PedidoCliente = "" ;
      AV59BarSer = "" ;
      AV60BarSerDsc = "" ;
      AV61BarColNom = "" ;
      AV20ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV26TFMetTerCod = "" ;
      AV27TFMetTerCod_Sel = "" ;
      AV28TFMetPieCod = "" ;
      AV29TFMetPieCod_Sel = "" ;
      AV37TFMetPieMet = DecimalUtil.ZERO ;
      AV38TFMetPieMet_To = DecimalUtil.ZERO ;
      AV39TFMetPieKil = DecimalUtil.ZERO ;
      AV40TFMetPieKil_To = DecimalUtil.ZERO ;
      AV73Pgmname = "" ;
      AV43TotMetPieMet = DecimalUtil.ZERO ;
      AV45TotMetPieKil = DecimalUtil.ZERO ;
      AV75Produccion_consultadeproduccion_packinglistds_1_emprcod = "" ;
      AV78Produccion_consultadeproduccion_packinglistds_4_barcodpar = "" ;
      A396EmprCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV30DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A4917MetPieObs = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      AV56BarNHdr = "" ;
      AV53BarMtr = DecimalUtil.ZERO ;
      AV55BarKgm = DecimalUtil.ZERO ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A2809MetTerCod = "" ;
      A2813MetPieCod = "" ;
      A130BarCodPar = "" ;
      A2815MetPieMet = DecimalUtil.ZERO ;
      A2814MetPieKil = DecimalUtil.ZERO ;
      AV34MaqCod = "" ;
      AV35HisProFec = GXutil.nullDate() ;
      scmdbuf = "" ;
      lV79Produccion_consultadeproduccion_packinglistds_5_tfmettercod = "" ;
      lV81Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod = "" ;
      AV80Produccion_consultadeproduccion_packinglistds_6_tfmettercod_sel = "" ;
      AV79Produccion_consultadeproduccion_packinglistds_5_tfmettercod = "" ;
      AV82Produccion_consultadeproduccion_packinglistds_8_tfmetpiecod_sel = "" ;
      AV81Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod = "" ;
      AV83Produccion_consultadeproduccion_packinglistds_9_tfmetpiemet = DecimalUtil.ZERO ;
      AV84Produccion_consultadeproduccion_packinglistds_10_tfmetpiemet_to = DecimalUtil.ZERO ;
      AV85Produccion_consultadeproduccion_packinglistds_11_tfmetpiekil = DecimalUtil.ZERO ;
      AV86Produccion_consultadeproduccion_packinglistds_12_tfmetpiekil_to = DecimalUtil.ZERO ;
      H01S02_A4917MetPieObs = new String[] {""} ;
      H01S02_A396EmprCod = new String[] {""} ;
      H01S02_A2816MetPieEst = new byte[1] ;
      H01S02_A6635MetPieAnc = new short[1] ;
      H01S02_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01S02_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01S02_A130BarCodPar = new String[] {""} ;
      H01S02_A132BarCodReo = new byte[1] ;
      H01S02_A129BarCod = new int[1] ;
      H01S02_A2813MetPieCod = new String[] {""} ;
      H01S02_A2809MetTerCod = new String[] {""} ;
      H01S03_AGRID_nRecordCount = new long[1] ;
      AV44TotValueMetPieMet = "" ;
      AV46TotValueMetPieKil = "" ;
      hsh = "" ;
      AV68Station = "" ;
      GXv_char2 = new String[1] ;
      AV69EmprNom = "" ;
      AV70UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      H01S05_A396EmprCod = new String[] {""} ;
      H01S05_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01S05_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01S05_A130BarCodPar = new String[] {""} ;
      H01S05_A132BarCodReo = new byte[1] ;
      H01S05_A129BarCod = new int[1] ;
      A184BarMtr = DecimalUtil.ZERO ;
      A166BarKgm = DecimalUtil.ZERO ;
      A13696BarNHdr = "" ;
      GXv_int8 = new byte[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV22Session = httpContext.getWebSession();
      AV18ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV52Var_Hdr = "" ;
      AV51WebSession = httpContext.getWebSession();
      AV16ExcelFilename = "" ;
      AV17ErrorMessage = "" ;
      GXv_int10 = new short[1] ;
      AV19UserCustomValue = "" ;
      AV21ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector11 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector12 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char13 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char3 = new String[1] ;
      GXv_SdtWWPGridState14 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      AV9TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      H01S06_A2816MetPieEst = new byte[1] ;
      H01S06_A6635MetPieAnc = new short[1] ;
      H01S06_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01S06_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01S06_A2813MetPieCod = new String[] {""} ;
      H01S06_A2809MetTerCod = new String[] {""} ;
      H01S06_A130BarCodPar = new String[] {""} ;
      H01S06_A132BarCodReo = new byte[1] ;
      H01S06_A129BarCod = new int[1] ;
      H01S06_A396EmprCod = new String[] {""} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV47EmprCod = "" ;
      sCtrlAV48BarCod = "" ;
      sCtrlAV49BarCodReo = "" ;
      sCtrlAV50BarCodPar = "" ;
      sCtrlAV63CliCod = "" ;
      sCtrlAV64CliNom = "" ;
      sCtrlAV65PedidoCliente = "" ;
      sCtrlAV59BarSer = "" ;
      sCtrlAV60BarSerDsc = "" ;
      sCtrlAV61BarColNom = "" ;
      sCtrlAV62BarColNum = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.consultadeproduccion_packinglist__default(),
         new Object[] {
             new Object[] {
            H01S02_A4917MetPieObs, H01S02_A396EmprCod, H01S02_A2816MetPieEst, H01S02_A6635MetPieAnc, H01S02_A2814MetPieKil, H01S02_A2815MetPieMet, H01S02_A130BarCodPar, H01S02_A132BarCodReo, H01S02_A129BarCod, H01S02_A2813MetPieCod,
            H01S02_A2809MetTerCod
            }
            , new Object[] {
            H01S03_AGRID_nRecordCount
            }
            , new Object[] {
            H01S05_A396EmprCod, H01S05_A184BarMtr, H01S05_A166BarKgm, H01S05_A130BarCodPar, H01S05_A132BarCodReo, H01S05_A129BarCod
            }
            , new Object[] {
            H01S06_A2816MetPieEst, H01S06_A6635MetPieAnc, H01S06_A2814MetPieKil, H01S06_A2815MetPieMet, H01S06_A2813MetPieCod, H01S06_A2809MetTerCod, H01S06_A130BarCodPar, H01S06_A132BarCodReo, H01S06_A129BarCod, H01S06_A396EmprCod
            }
         }
      );
      AV73Pgmname = "Produccion.ConsultadeProduccion_PackingList" ;
      /* GeneXus formulas. */
      AV73Pgmname = "Produccion.ConsultadeProduccion_PackingList" ;
      Gx_err = (short)(0) ;
      edtavBarcod_Enabled = 0 ;
      edtavBarcodreo_Enabled = 0 ;
      edtavBarcodpar_Enabled = 0 ;
      edtavClicod_Enabled = 0 ;
      edtavClinom_Enabled = 0 ;
      edtavPedidocliente_Enabled = 0 ;
      edtavBarser_Enabled = 0 ;
      edtavBarserdsc_Enabled = 0 ;
      edtavBarcolnom_Enabled = 0 ;
      edtavBarcolnum_Enabled = 0 ;
      edtavBarnhdr_Enabled = 0 ;
      edtavBarmtr_Enabled = 0 ;
      edtavBarkgm_Enabled = 0 ;
      edtavMaqcod_Enabled = 0 ;
      edtavHisprofec_Enabled = 0 ;
      edtavBarordlin_Enabled = 0 ;
      edtavTotvaluemetpiemet_Enabled = 0 ;
      edtavTotvaluemetpiekil_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV49BarCodReo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV49BarCodReo ;
   private byte AV57TFMetPieEst ;
   private byte AV58TFMetPieEst_To ;
   private byte AV77Produccion_consultadeproduccion_packinglistds_3_barcodreo ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A132BarCodReo ;
   private byte A2816MetPieEst ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV89Produccion_consultadeproduccion_packinglistds_15_tfmetpieest ;
   private byte AV90Produccion_consultadeproduccion_packinglistds_16_tfmetpieest_to ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV41TFMetPieAnc ;
   private short AV42TFMetPieAnc_To ;
   private short AV12OrderedBy ;
   private short AV66moda21 ;
   private short wbEnd ;
   private short wbStart ;
   private short A6635MetPieAnc ;
   private short AV36BarOrdLin ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV87Produccion_consultadeproduccion_packinglistds_13_tfmetpieanc ;
   private short AV88Produccion_consultadeproduccion_packinglistds_14_tfmetpieanc_to ;
   private short AV67Silineas ;
   private short GXv_int10[] ;
   private int wcpOAV48BarCod ;
   private int wcpOAV63CliCod ;
   private int wcpOAV62BarColNum ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_105 ;
   private int AV48BarCod ;
   private int AV63CliCod ;
   private int AV62BarColNum ;
   private int nGXsfl_105_idx=1 ;
   private int AV76Produccion_consultadeproduccion_packinglistds_2_barcod ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavBarcod_Enabled ;
   private int edtavBarcodreo_Enabled ;
   private int edtavBarcodpar_Enabled ;
   private int edtavClicod_Enabled ;
   private int edtavClinom_Enabled ;
   private int edtavPedidocliente_Enabled ;
   private int edtavBarser_Enabled ;
   private int edtavBarserdsc_Enabled ;
   private int edtavBarcolnom_Enabled ;
   private int edtavBarcolnum_Enabled ;
   private int edtavBarnhdr_Enabled ;
   private int edtavBarmtr_Enabled ;
   private int edtavBarkgm_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtEmprCod_Visible ;
   private int A129BarCod ;
   private int subGrid_Islastpage ;
   private int edtavMaqcod_Enabled ;
   private int edtavHisprofec_Enabled ;
   private int edtavBarordlin_Enabled ;
   private int edtavTotvaluemetpiemet_Enabled ;
   private int edtavTotvaluemetpiekil_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int edtMetTerCod_Visible ;
   private int edtMetPieCod_Visible ;
   private int edtMetPieMet_Visible ;
   private int edtMetPieKil_Visible ;
   private int edtMetPieAnc_Visible ;
   private int edtMetPieEst_Visible ;
   private int edtavMaqcod_Visible ;
   private int edtavHisprofec_Visible ;
   private int edtavBarordlin_Visible ;
   private int AV31PageToGo ;
   private int AV91GXV1 ;
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
   private java.math.BigDecimal AV37TFMetPieMet ;
   private java.math.BigDecimal AV38TFMetPieMet_To ;
   private java.math.BigDecimal AV39TFMetPieKil ;
   private java.math.BigDecimal AV40TFMetPieKil_To ;
   private java.math.BigDecimal AV43TotMetPieMet ;
   private java.math.BigDecimal AV45TotMetPieKil ;
   private java.math.BigDecimal AV53BarMtr ;
   private java.math.BigDecimal AV55BarKgm ;
   private java.math.BigDecimal A2815MetPieMet ;
   private java.math.BigDecimal A2814MetPieKil ;
   private java.math.BigDecimal AV83Produccion_consultadeproduccion_packinglistds_9_tfmetpiemet ;
   private java.math.BigDecimal AV84Produccion_consultadeproduccion_packinglistds_10_tfmetpiemet_to ;
   private java.math.BigDecimal AV85Produccion_consultadeproduccion_packinglistds_11_tfmetpiekil ;
   private java.math.BigDecimal AV86Produccion_consultadeproduccion_packinglistds_12_tfmetpiekil_to ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A166BarKgm ;
   private String wcpOAV47EmprCod ;
   private String wcpOAV50BarCodPar ;
   private String wcpOAV64CliNom ;
   private String wcpOAV65PedidoCliente ;
   private String wcpOAV59BarSer ;
   private String wcpOAV60BarSerDsc ;
   private String wcpOAV61BarColNom ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV47EmprCod ;
   private String AV50BarCodPar ;
   private String AV64CliNom ;
   private String AV65PedidoCliente ;
   private String AV59BarSer ;
   private String AV60BarSerDsc ;
   private String AV61BarColNom ;
   private String sGXsfl_105_idx="0001" ;
   private String AV26TFMetTerCod ;
   private String AV27TFMetTerCod_Sel ;
   private String AV28TFMetPieCod ;
   private String AV29TFMetPieCod_Sel ;
   private String AV73Pgmname ;
   private String AV75Produccion_consultadeproduccion_packinglistds_1_emprcod ;
   private String AV78Produccion_consultadeproduccion_packinglistds_4_barcodpar ;
   private String A396EmprCod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
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
   private String ClassString ;
   private String StyleString ;
   private String divTablacontent_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String edtavBarcod_Internalname ;
   private String edtavBarcod_Jsonclick ;
   private String edtavBarcodreo_Internalname ;
   private String edtavBarcodreo_Jsonclick ;
   private String edtavBarcodpar_Internalname ;
   private String edtavBarcodpar_Jsonclick ;
   private String edtavClicod_Internalname ;
   private String edtavClicod_Jsonclick ;
   private String edtavClinom_Internalname ;
   private String edtavClinom_Jsonclick ;
   private String edtavPedidocliente_Internalname ;
   private String edtavPedidocliente_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String edtavBarser_Internalname ;
   private String edtavBarser_Jsonclick ;
   private String edtavBarserdsc_Internalname ;
   private String edtavBarserdsc_Jsonclick ;
   private String edtavBarcolnom_Internalname ;
   private String edtavBarcolnom_Jsonclick ;
   private String edtavBarcolnum_Internalname ;
   private String edtavBarcolnum_Jsonclick ;
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
   private String divUnnamedtable2_Internalname ;
   private String edtavBarnhdr_Internalname ;
   private String AV56BarNHdr ;
   private String edtavBarnhdr_Jsonclick ;
   private String edtavBarmtr_Internalname ;
   private String edtavBarmtr_Jsonclick ;
   private String edtavBarkgm_Internalname ;
   private String edtavBarkgm_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String A2809MetTerCod ;
   private String edtMetTerCod_Internalname ;
   private String A2813MetPieCod ;
   private String edtMetPieCod_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String A130BarCodPar ;
   private String edtBarCodPar_Internalname ;
   private String edtMetPieMet_Internalname ;
   private String edtMetPieKil_Internalname ;
   private String edtMetPieAnc_Internalname ;
   private String edtMetPieEst_Internalname ;
   private String AV34MaqCod ;
   private String edtavMaqcod_Internalname ;
   private String edtavHisprofec_Internalname ;
   private String edtavBarordlin_Internalname ;
   private String edtavTotvaluemetpiemet_Internalname ;
   private String edtavTotvaluemetpiekil_Internalname ;
   private String scmdbuf ;
   private String lV79Produccion_consultadeproduccion_packinglistds_5_tfmettercod ;
   private String lV81Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod ;
   private String AV80Produccion_consultadeproduccion_packinglistds_6_tfmettercod_sel ;
   private String AV79Produccion_consultadeproduccion_packinglistds_5_tfmettercod ;
   private String AV82Produccion_consultadeproduccion_packinglistds_8_tfmetpiecod_sel ;
   private String AV81Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod ;
   private String hsh ;
   private String AV68Station ;
   private String GXv_char2[] ;
   private String AV69EmprNom ;
   private String AV70UsurCod ;
   private String A13696BarNHdr ;
   private String AV52Var_Hdr ;
   private String GXt_char13 ;
   private String GXv_char4[] ;
   private String GXt_char1 ;
   private String GXv_char3[] ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvaluemetpiemet_Jsonclick ;
   private String edtavTotvaluemetpiekil_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String sCtrlAV47EmprCod ;
   private String sCtrlAV48BarCod ;
   private String sCtrlAV49BarCodReo ;
   private String sCtrlAV50BarCodPar ;
   private String sCtrlAV63CliCod ;
   private String sCtrlAV64CliNom ;
   private String sCtrlAV65PedidoCliente ;
   private String sCtrlAV59BarSer ;
   private String sCtrlAV60BarSerDsc ;
   private String sCtrlAV61BarColNom ;
   private String sCtrlAV62BarColNum ;
   private String sGXsfl_105_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtMetTerCod_Jsonclick ;
   private String edtMetPieCod_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String edtMetPieMet_Jsonclick ;
   private String edtMetPieKil_Jsonclick ;
   private String edtMetPieAnc_Jsonclick ;
   private String edtMetPieEst_Jsonclick ;
   private String edtavMaqcod_Jsonclick ;
   private String edtavHisprofec_Jsonclick ;
   private String edtavBarordlin_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV35HisProFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV13OrderedDsc ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
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
   private boolean bGXsfl_105_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV18ColumnsSelectorXML ;
   private String AV19UserCustomValue ;
   private String A4917MetPieObs ;
   private String AV44TotValueMetPieMet ;
   private String AV46TotValueMetPieKil ;
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
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] H01S02_A4917MetPieObs ;
   private String[] H01S02_A396EmprCod ;
   private byte[] H01S02_A2816MetPieEst ;
   private short[] H01S02_A6635MetPieAnc ;
   private java.math.BigDecimal[] H01S02_A2814MetPieKil ;
   private java.math.BigDecimal[] H01S02_A2815MetPieMet ;
   private String[] H01S02_A130BarCodPar ;
   private byte[] H01S02_A132BarCodReo ;
   private int[] H01S02_A129BarCod ;
   private String[] H01S02_A2813MetPieCod ;
   private String[] H01S02_A2809MetTerCod ;
   private long[] H01S03_AGRID_nRecordCount ;
   private String[] H01S05_A396EmprCod ;
   private java.math.BigDecimal[] H01S05_A184BarMtr ;
   private java.math.BigDecimal[] H01S05_A166BarKgm ;
   private String[] H01S05_A130BarCodPar ;
   private byte[] H01S05_A132BarCodReo ;
   private int[] H01S05_A129BarCod ;
   private byte[] H01S06_A2816MetPieEst ;
   private short[] H01S06_A6635MetPieAnc ;
   private java.math.BigDecimal[] H01S06_A2814MetPieKil ;
   private java.math.BigDecimal[] H01S06_A2815MetPieMet ;
   private String[] H01S06_A2813MetPieCod ;
   private String[] H01S06_A2809MetTerCod ;
   private String[] H01S06_A130BarCodPar ;
   private byte[] H01S06_A132BarCodReo ;
   private int[] H01S06_A129BarCod ;
   private String[] H01S06_A396EmprCod ;
   private com.genexus.webpanels.WebSession AV51WebSession ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV9TrnContextAtt ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState14[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV21ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector11[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector12[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV30DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class consultadeproduccion_packinglist__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01S02( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV80Produccion_consultadeproduccion_packinglistds_6_tfmettercod_sel ,
                                          String AV79Produccion_consultadeproduccion_packinglistds_5_tfmettercod ,
                                          String AV82Produccion_consultadeproduccion_packinglistds_8_tfmetpiecod_sel ,
                                          String AV81Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod ,
                                          java.math.BigDecimal AV83Produccion_consultadeproduccion_packinglistds_9_tfmetpiemet ,
                                          java.math.BigDecimal AV84Produccion_consultadeproduccion_packinglistds_10_tfmetpiemet_to ,
                                          java.math.BigDecimal AV85Produccion_consultadeproduccion_packinglistds_11_tfmetpiekil ,
                                          java.math.BigDecimal AV86Produccion_consultadeproduccion_packinglistds_12_tfmetpiekil_to ,
                                          short AV87Produccion_consultadeproduccion_packinglistds_13_tfmetpieanc ,
                                          short AV88Produccion_consultadeproduccion_packinglistds_14_tfmetpieanc_to ,
                                          byte AV89Produccion_consultadeproduccion_packinglistds_15_tfmetpieest ,
                                          byte AV90Produccion_consultadeproduccion_packinglistds_16_tfmetpieest_to ,
                                          String A2809MetTerCod ,
                                          String A2813MetPieCod ,
                                          java.math.BigDecimal A2815MetPieMet ,
                                          java.math.BigDecimal A2814MetPieKil ,
                                          short A6635MetPieAnc ,
                                          byte A2816MetPieEst ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV75Produccion_consultadeproduccion_packinglistds_1_emprcod ,
                                          int AV76Produccion_consultadeproduccion_packinglistds_2_barcod ,
                                          byte AV77Produccion_consultadeproduccion_packinglistds_3_barcodreo ,
                                          String AV78Produccion_consultadeproduccion_packinglistds_4_barcodpar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int15 = new byte[21];
      Object[] GXv_Object16 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " MetPieObs, EmprCod, MetPieEst, MetPieAnc, MetPieKil, MetPieMet, BarCodPar, BarCodReo, BarCod, MetPieCod, MetTerCod" ;
      sFromString = " FROM TXPLMETPI" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV80Produccion_consultadeproduccion_packinglistds_6_tfmettercod_sel)==0) && ( ! (GXutil.strcmp("", AV79Produccion_consultadeproduccion_packinglistds_5_tfmettercod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MetTerCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Produccion_consultadeproduccion_packinglistds_6_tfmettercod_sel)==0) )
      {
         addWhere(sWhereString, "(MetTerCod = ?)");
      }
      else
      {
         GXv_int15[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Produccion_consultadeproduccion_packinglistds_8_tfmetpiecod_sel)==0) && ( ! (GXutil.strcmp("", AV81Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MetPieCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Produccion_consultadeproduccion_packinglistds_8_tfmetpiecod_sel)==0) )
      {
         addWhere(sWhereString, "(MetPieCod = ?)");
      }
      else
      {
         GXv_int15[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Produccion_consultadeproduccion_packinglistds_9_tfmetpiemet)==0) )
      {
         addWhere(sWhereString, "(MetPieMet >= ?)");
      }
      else
      {
         GXv_int15[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Produccion_consultadeproduccion_packinglistds_10_tfmetpiemet_to)==0) )
      {
         addWhere(sWhereString, "(MetPieMet <= ?)");
      }
      else
      {
         GXv_int15[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Produccion_consultadeproduccion_packinglistds_11_tfmetpiekil)==0) )
      {
         addWhere(sWhereString, "(MetPieKil >= ?)");
      }
      else
      {
         GXv_int15[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Produccion_consultadeproduccion_packinglistds_12_tfmetpiekil_to)==0) )
      {
         addWhere(sWhereString, "(MetPieKil <= ?)");
      }
      else
      {
         GXv_int15[11] = (byte)(1) ;
      }
      if ( ! (0==AV87Produccion_consultadeproduccion_packinglistds_13_tfmetpieanc) )
      {
         addWhere(sWhereString, "(MetPieAnc >= ?)");
      }
      else
      {
         GXv_int15[12] = (byte)(1) ;
      }
      if ( ! (0==AV88Produccion_consultadeproduccion_packinglistds_14_tfmetpieanc_to) )
      {
         addWhere(sWhereString, "(MetPieAnc <= ?)");
      }
      else
      {
         GXv_int15[13] = (byte)(1) ;
      }
      if ( ! (0==AV89Produccion_consultadeproduccion_packinglistds_15_tfmetpieest) )
      {
         addWhere(sWhereString, "(MetPieEst >= ?)");
      }
      else
      {
         GXv_int15[14] = (byte)(1) ;
      }
      if ( ! (0==AV90Produccion_consultadeproduccion_packinglistds_16_tfmetpieest_to) )
      {
         addWhere(sWhereString, "(MetPieEst <= ?)");
      }
      else
      {
         GXv_int15[15] = (byte)(1) ;
      }
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, MetPieCod" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, MetPieCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, MetTerCod" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, MetTerCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, MetPieMet" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, MetPieMet DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, MetPieKil" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, MetPieKil DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, MetPieAnc" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, MetPieAnc DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, MetPieEst" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, MetPieEst DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object16[0] = scmdbuf ;
      GXv_Object16[1] = GXv_int15 ;
      return GXv_Object16 ;
   }

   protected Object[] conditional_H01S03( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV80Produccion_consultadeproduccion_packinglistds_6_tfmettercod_sel ,
                                          String AV79Produccion_consultadeproduccion_packinglistds_5_tfmettercod ,
                                          String AV82Produccion_consultadeproduccion_packinglistds_8_tfmetpiecod_sel ,
                                          String AV81Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod ,
                                          java.math.BigDecimal AV83Produccion_consultadeproduccion_packinglistds_9_tfmetpiemet ,
                                          java.math.BigDecimal AV84Produccion_consultadeproduccion_packinglistds_10_tfmetpiemet_to ,
                                          java.math.BigDecimal AV85Produccion_consultadeproduccion_packinglistds_11_tfmetpiekil ,
                                          java.math.BigDecimal AV86Produccion_consultadeproduccion_packinglistds_12_tfmetpiekil_to ,
                                          short AV87Produccion_consultadeproduccion_packinglistds_13_tfmetpieanc ,
                                          short AV88Produccion_consultadeproduccion_packinglistds_14_tfmetpieanc_to ,
                                          byte AV89Produccion_consultadeproduccion_packinglistds_15_tfmetpieest ,
                                          byte AV90Produccion_consultadeproduccion_packinglistds_16_tfmetpieest_to ,
                                          String A2809MetTerCod ,
                                          String A2813MetPieCod ,
                                          java.math.BigDecimal A2815MetPieMet ,
                                          java.math.BigDecimal A2814MetPieKil ,
                                          short A6635MetPieAnc ,
                                          byte A2816MetPieEst ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV75Produccion_consultadeproduccion_packinglistds_1_emprcod ,
                                          int AV76Produccion_consultadeproduccion_packinglistds_2_barcod ,
                                          byte AV77Produccion_consultadeproduccion_packinglistds_3_barcodreo ,
                                          String AV78Produccion_consultadeproduccion_packinglistds_4_barcodpar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[16];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM TXPLMETPI" ;
      addWhere(sWhereString, "(EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV80Produccion_consultadeproduccion_packinglistds_6_tfmettercod_sel)==0) && ( ! (GXutil.strcmp("", AV79Produccion_consultadeproduccion_packinglistds_5_tfmettercod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MetTerCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Produccion_consultadeproduccion_packinglistds_6_tfmettercod_sel)==0) )
      {
         addWhere(sWhereString, "(MetTerCod = ?)");
      }
      else
      {
         GXv_int17[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Produccion_consultadeproduccion_packinglistds_8_tfmetpiecod_sel)==0) && ( ! (GXutil.strcmp("", AV81Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MetPieCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Produccion_consultadeproduccion_packinglistds_8_tfmetpiecod_sel)==0) )
      {
         addWhere(sWhereString, "(MetPieCod = ?)");
      }
      else
      {
         GXv_int17[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Produccion_consultadeproduccion_packinglistds_9_tfmetpiemet)==0) )
      {
         addWhere(sWhereString, "(MetPieMet >= ?)");
      }
      else
      {
         GXv_int17[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Produccion_consultadeproduccion_packinglistds_10_tfmetpiemet_to)==0) )
      {
         addWhere(sWhereString, "(MetPieMet <= ?)");
      }
      else
      {
         GXv_int17[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Produccion_consultadeproduccion_packinglistds_11_tfmetpiekil)==0) )
      {
         addWhere(sWhereString, "(MetPieKil >= ?)");
      }
      else
      {
         GXv_int17[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Produccion_consultadeproduccion_packinglistds_12_tfmetpiekil_to)==0) )
      {
         addWhere(sWhereString, "(MetPieKil <= ?)");
      }
      else
      {
         GXv_int17[11] = (byte)(1) ;
      }
      if ( ! (0==AV87Produccion_consultadeproduccion_packinglistds_13_tfmetpieanc) )
      {
         addWhere(sWhereString, "(MetPieAnc >= ?)");
      }
      else
      {
         GXv_int17[12] = (byte)(1) ;
      }
      if ( ! (0==AV88Produccion_consultadeproduccion_packinglistds_14_tfmetpieanc_to) )
      {
         addWhere(sWhereString, "(MetPieAnc <= ?)");
      }
      else
      {
         GXv_int17[13] = (byte)(1) ;
      }
      if ( ! (0==AV89Produccion_consultadeproduccion_packinglistds_15_tfmetpieest) )
      {
         addWhere(sWhereString, "(MetPieEst >= ?)");
      }
      else
      {
         GXv_int17[14] = (byte)(1) ;
      }
      if ( ! (0==AV90Produccion_consultadeproduccion_packinglistds_16_tfmetpieest_to) )
      {
         addWhere(sWhereString, "(MetPieEst <= ?)");
      }
      else
      {
         GXv_int17[15] = (byte)(1) ;
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
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
   }

   protected Object[] conditional_H01S06( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV80Produccion_consultadeproduccion_packinglistds_6_tfmettercod_sel ,
                                          String AV79Produccion_consultadeproduccion_packinglistds_5_tfmettercod ,
                                          String AV82Produccion_consultadeproduccion_packinglistds_8_tfmetpiecod_sel ,
                                          String AV81Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod ,
                                          java.math.BigDecimal AV83Produccion_consultadeproduccion_packinglistds_9_tfmetpiemet ,
                                          java.math.BigDecimal AV84Produccion_consultadeproduccion_packinglistds_10_tfmetpiemet_to ,
                                          java.math.BigDecimal AV85Produccion_consultadeproduccion_packinglistds_11_tfmetpiekil ,
                                          java.math.BigDecimal AV86Produccion_consultadeproduccion_packinglistds_12_tfmetpiekil_to ,
                                          short AV87Produccion_consultadeproduccion_packinglistds_13_tfmetpieanc ,
                                          short AV88Produccion_consultadeproduccion_packinglistds_14_tfmetpieanc_to ,
                                          byte AV89Produccion_consultadeproduccion_packinglistds_15_tfmetpieest ,
                                          byte AV90Produccion_consultadeproduccion_packinglistds_16_tfmetpieest_to ,
                                          String A2809MetTerCod ,
                                          String A2813MetPieCod ,
                                          java.math.BigDecimal A2815MetPieMet ,
                                          java.math.BigDecimal A2814MetPieKil ,
                                          short A6635MetPieAnc ,
                                          byte A2816MetPieEst ,
                                          String AV75Produccion_consultadeproduccion_packinglistds_1_emprcod ,
                                          int AV76Produccion_consultadeproduccion_packinglistds_2_barcod ,
                                          byte AV77Produccion_consultadeproduccion_packinglistds_3_barcodreo ,
                                          String AV78Produccion_consultadeproduccion_packinglistds_4_barcodpar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int19 = new byte[16];
      Object[] GXv_Object20 = new Object[2];
      scmdbuf = "SELECT MetPieEst, MetPieAnc, MetPieKil, MetPieMet, MetPieCod, MetTerCod, BarCodPar, BarCodReo, BarCod, EmprCod FROM TXPLMETPI" ;
      addWhere(sWhereString, "(EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV80Produccion_consultadeproduccion_packinglistds_6_tfmettercod_sel)==0) && ( ! (GXutil.strcmp("", AV79Produccion_consultadeproduccion_packinglistds_5_tfmettercod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MetTerCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Produccion_consultadeproduccion_packinglistds_6_tfmettercod_sel)==0) )
      {
         addWhere(sWhereString, "(MetTerCod = ?)");
      }
      else
      {
         GXv_int19[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Produccion_consultadeproduccion_packinglistds_8_tfmetpiecod_sel)==0) && ( ! (GXutil.strcmp("", AV81Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MetPieCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Produccion_consultadeproduccion_packinglistds_8_tfmetpiecod_sel)==0) )
      {
         addWhere(sWhereString, "(MetPieCod = ?)");
      }
      else
      {
         GXv_int19[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Produccion_consultadeproduccion_packinglistds_9_tfmetpiemet)==0) )
      {
         addWhere(sWhereString, "(MetPieMet >= ?)");
      }
      else
      {
         GXv_int19[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Produccion_consultadeproduccion_packinglistds_10_tfmetpiemet_to)==0) )
      {
         addWhere(sWhereString, "(MetPieMet <= ?)");
      }
      else
      {
         GXv_int19[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Produccion_consultadeproduccion_packinglistds_11_tfmetpiekil)==0) )
      {
         addWhere(sWhereString, "(MetPieKil >= ?)");
      }
      else
      {
         GXv_int19[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Produccion_consultadeproduccion_packinglistds_12_tfmetpiekil_to)==0) )
      {
         addWhere(sWhereString, "(MetPieKil <= ?)");
      }
      else
      {
         GXv_int19[11] = (byte)(1) ;
      }
      if ( ! (0==AV87Produccion_consultadeproduccion_packinglistds_13_tfmetpieanc) )
      {
         addWhere(sWhereString, "(MetPieAnc >= ?)");
      }
      else
      {
         GXv_int19[12] = (byte)(1) ;
      }
      if ( ! (0==AV88Produccion_consultadeproduccion_packinglistds_14_tfmetpieanc_to) )
      {
         addWhere(sWhereString, "(MetPieAnc <= ?)");
      }
      else
      {
         GXv_int19[13] = (byte)(1) ;
      }
      if ( ! (0==AV89Produccion_consultadeproduccion_packinglistds_15_tfmetpieest) )
      {
         addWhere(sWhereString, "(MetPieEst >= ?)");
      }
      else
      {
         GXv_int19[14] = (byte)(1) ;
      }
      if ( ! (0==AV90Produccion_consultadeproduccion_packinglistds_16_tfmetpieest_to) )
      {
         addWhere(sWhereString, "(MetPieEst <= ?)");
      }
      else
      {
         GXv_int19[15] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      GXv_Object20[0] = scmdbuf ;
      GXv_Object20[1] = GXv_int19 ;
      return GXv_Object20 ;
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
                  return conditional_H01S02(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).shortValue() , ((Boolean) dynConstraints[19]).booleanValue() , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] );
            case 1 :
                  return conditional_H01S03(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).shortValue() , ((Boolean) dynConstraints[19]).booleanValue() , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] );
            case 3 :
                  return conditional_H01S06(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01S02", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01S03", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01S05", "SELECT T1.EmprCod, COALESCE( T2.BarMtr, 0) AS BarMtr, COALESCE( T2.BarKgm, 0) AS BarKgm, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H01S06", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 9);
               ((String[]) buf[10])[0] = rslt.getString(11, 10);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 3);
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
                  stmt.setString(sIdx, (String)parms[21], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[23]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 10);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 10);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 9);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 9);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[35]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[18]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 10);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 10);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 9);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 9);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[26], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[30]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[18]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 10);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 10);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 9);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 9);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[26], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[30]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               return;
      }
   }

}

