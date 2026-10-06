package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class consultadeproduccion_partesproduccion_impl extends GXWebComponent
{
   public consultadeproduccion_partesproduccion_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public consultadeproduccion_partesproduccion_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultadeproduccion_partesproduccion_impl.class ));
   }

   public consultadeproduccion_partesproduccion_impl( int remoteHandle ,
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
               AV60EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60EmprCod", AV60EmprCod);
               AV61BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61BarCod), 8, 0));
               AV62BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62BarCodReo", GXutil.str( AV62BarCodReo, 1, 0));
               AV63BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63BarCodPar", AV63BarCodPar);
               AV66CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66CliCod), 6, 0));
               AV67CliNom = httpContext.GetPar( "CliNom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67CliNom", AV67CliNom);
               AV68PedidoCliente = httpContext.GetPar( "PedidoCliente") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68PedidoCliente", AV68PedidoCliente);
               AV69BarSer = httpContext.GetPar( "BarSer") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69BarSer", AV69BarSer);
               AV70BarSerDsc = httpContext.GetPar( "BarSerDsc") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70BarSerDsc", AV70BarSerDsc);
               AV71BarColNom = httpContext.GetPar( "BarColNom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71BarColNom", AV71BarColNom);
               AV72BarColNum = (int)(GXutil.lval( httpContext.GetPar( "BarColNum"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72BarColNum), 6, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV60EmprCod,Integer.valueOf(AV61BarCod),Byte.valueOf(AV62BarCodReo),AV63BarCodPar,Integer.valueOf(AV66CliCod),AV67CliNom,AV68PedidoCliente,AV69BarSer,AV70BarSerDsc,AV71BarColNom,Integer.valueOf(AV72BarColNum)});
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
      nRC_GXsfl_87 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_87"))) ;
      nGXsfl_87_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_87_idx"))) ;
      sGXsfl_87_idx = httpContext.GetPar( "sGXsfl_87_idx") ;
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
      AV60EmprCod = httpContext.GetPar( "EmprCod") ;
      AV61BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      AV62BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      AV63BarCodPar = httpContext.GetPar( "BarCodPar") ;
      AV26TFBarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "TFBarOrdLin"))) ;
      AV27TFBarOrdLin_To = (short)(GXutil.lval( httpContext.GetPar( "TFBarOrdLin_To"))) ;
      AV28TFFase = httpContext.GetPar( "TFFase") ;
      AV29TFFase_Sel = httpContext.GetPar( "TFFase_Sel") ;
      AV30TFFase_Dsc = httpContext.GetPar( "TFFase_Dsc") ;
      AV31TFFase_Dsc_Sel = httpContext.GetPar( "TFFase_Dsc_Sel") ;
      AV32TFMaqCod = httpContext.GetPar( "TFMaqCod") ;
      AV33TFMaqCod_Sel = httpContext.GetPar( "TFMaqCod_Sel") ;
      AV34TFMaqDsc = httpContext.GetPar( "TFMaqDsc") ;
      AV35TFMaqDsc_Sel = httpContext.GetPar( "TFMaqDsc_Sel") ;
      AV38TFGruOpeCod = (int)(GXutil.lval( httpContext.GetPar( "TFGruOpeCod"))) ;
      AV39TFGruOpeCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFGruOpeCod_To"))) ;
      AV36TFGruopecod_Nombre = httpContext.GetPar( "TFGruopecod_Nombre") ;
      AV37TFGruopecod_Nombre_Sel = httpContext.GetPar( "TFGruopecod_Nombre_Sel") ;
      AV40TFHisProKgr = CommonUtil.decimalVal( httpContext.GetPar( "TFHisProKgr"), ".") ;
      AV41TFHisProKgr_To = CommonUtil.decimalVal( httpContext.GetPar( "TFHisProKgr_To"), ".") ;
      AV42TFHisProMtr = CommonUtil.decimalVal( httpContext.GetPar( "TFHisProMtr"), ".") ;
      AV43TFHisProMtr_To = CommonUtil.decimalVal( httpContext.GetPar( "TFHisProMtr_To"), ".") ;
      AV44TFHisProDTI = localUtil.parseDTimeParm( httpContext.GetPar( "TFHisProDTI")) ;
      AV48TFHisProDTF = localUtil.parseDTimeParm( httpContext.GetPar( "TFHisProDTF")) ;
      AV52TFParCod = (short)(GXutil.lval( httpContext.GetPar( "TFParCod"))) ;
      AV53TFParCod_To = (short)(GXutil.lval( httpContext.GetPar( "TFParCod_To"))) ;
      AV54TFParCodNom = httpContext.GetPar( "TFParCodNom") ;
      AV55TFParCodNom_Sel = httpContext.GetPar( "TFParCodNom_Sel") ;
      AV75Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV66CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
      AV67CliNom = httpContext.GetPar( "CliNom") ;
      AV68PedidoCliente = httpContext.GetPar( "PedidoCliente") ;
      AV69BarSer = httpContext.GetPar( "BarSer") ;
      AV70BarSerDsc = httpContext.GetPar( "BarSerDsc") ;
      AV71BarColNom = httpContext.GetPar( "BarColNom") ;
      AV72BarColNum = (int)(GXutil.lval( httpContext.GetPar( "BarColNum"))) ;
      AV79Produccion_consultadeproduccion_partesproduccionds_1_emprcod = httpContext.GetPar( "Produccion_consultadeproduccion_partesproduccionds_1_emprcod") ;
      AV80Produccion_consultadeproduccion_partesproduccionds_2_barcod = (int)(GXutil.lval( httpContext.GetPar( "Produccion_consultadeproduccion_partesproduccionds_2_barcod"))) ;
      AV81Produccion_consultadeproduccion_partesproduccionds_3_barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Produccion_consultadeproduccion_partesproduccionds_3_barcodreo"))) ;
      AV82Produccion_consultadeproduccion_partesproduccionds_4_barcodpar = httpContext.GetPar( "Produccion_consultadeproduccion_partesproduccionds_4_barcodpar") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV20ColumnsSelector, AV60EmprCod, AV61BarCod, AV62BarCodReo, AV63BarCodPar, AV26TFBarOrdLin, AV27TFBarOrdLin_To, AV28TFFase, AV29TFFase_Sel, AV30TFFase_Dsc, AV31TFFase_Dsc_Sel, AV32TFMaqCod, AV33TFMaqCod_Sel, AV34TFMaqDsc, AV35TFMaqDsc_Sel, AV38TFGruOpeCod, AV39TFGruOpeCod_To, AV36TFGruopecod_Nombre, AV37TFGruopecod_Nombre_Sel, AV40TFHisProKgr, AV41TFHisProKgr_To, AV42TFHisProMtr, AV43TFHisProMtr_To, AV44TFHisProDTI, AV48TFHisProDTF, AV52TFParCod, AV53TFParCod_To, AV54TFParCodNom, AV55TFParCodNom_Sel, AV75Pgmname, AV12OrderedBy, AV13OrderedDsc, AV66CliCod, AV67CliNom, AV68PedidoCliente, AV69BarSer, AV70BarSerDsc, AV71BarColNom, AV72BarColNum, AV79Produccion_consultadeproduccion_partesproduccionds_1_emprcod, AV80Produccion_consultadeproduccion_partesproduccionds_2_barcod, AV81Produccion_consultadeproduccion_partesproduccionds_3_barcodreo, AV82Produccion_consultadeproduccion_partesproduccionds_4_barcodpar, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1RZ2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( " Parte Produccion", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.produccion.consultadeproduccion_partesproduccion", new String[] {GXutil.URLEncode(GXutil.rtrim(AV60EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV61BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV62BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV63BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV66CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV67CliNom)),GXutil.URLEncode(GXutil.rtrim(AV68PedidoCliente)),GXutil.URLEncode(GXutil.rtrim(AV69BarSer)),GXutil.URLEncode(GXutil.rtrim(AV70BarSerDsc)),GXutil.URLEncode(GXutil.rtrim(AV71BarColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV72BarColNum,6,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","CliCod","CliNom","PedidoCliente","BarSer","BarSerDsc","BarColNom","BarColNum"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ConsultadeProduccion_PartesProduccion");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV75Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("produccion\\consultadeproduccion_partesproduccion:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_87", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_87, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV58GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV59GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV56DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV56DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV20ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV20ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV60EmprCod", GXutil.rtrim( wcpOAV60EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV61BarCod", GXutil.ltrim( localUtil.ntoc( wcpOAV61BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV62BarCodReo", GXutil.ltrim( localUtil.ntoc( wcpOAV62BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV63BarCodPar", GXutil.rtrim( wcpOAV63BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV66CliCod", GXutil.ltrim( localUtil.ntoc( wcpOAV66CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV67CliNom", GXutil.rtrim( wcpOAV67CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV68PedidoCliente", GXutil.rtrim( wcpOAV68PedidoCliente));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV69BarSer", GXutil.rtrim( wcpOAV69BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV70BarSerDsc", GXutil.rtrim( wcpOAV70BarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV71BarColNom", GXutil.rtrim( wcpOAV71BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV72BarColNum", GXutil.ltrim( localUtil.ntoc( wcpOAV72BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV60EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARORDLIN", GXutil.ltrim( localUtil.ntoc( AV26TFBarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARORDLIN_TO", GXutil.ltrim( localUtil.ntoc( AV27TFBarOrdLin_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASE", GXutil.rtrim( AV28TFFase));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASE_SEL", GXutil.rtrim( AV29TFFase_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASE_DSC", GXutil.rtrim( AV30TFFase_Dsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASE_DSC_SEL", GXutil.rtrim( AV31TFFase_Dsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMAQCOD", GXutil.rtrim( AV32TFMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMAQCOD_SEL", GXutil.rtrim( AV33TFMaqCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMAQDSC", GXutil.rtrim( AV34TFMaqDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMAQDSC_SEL", GXutil.rtrim( AV35TFMaqDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFGRUOPECOD", GXutil.ltrim( localUtil.ntoc( AV38TFGruOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFGRUOPECOD_TO", GXutil.ltrim( localUtil.ntoc( AV39TFGruOpeCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFGRUOPECOD_NOMBRE", GXutil.rtrim( AV36TFGruopecod_Nombre));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFGRUOPECOD_NOMBRE_SEL", GXutil.rtrim( AV37TFGruopecod_Nombre_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROKGR", GXutil.ltrim( localUtil.ntoc( AV40TFHisProKgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROKGR_TO", GXutil.ltrim( localUtil.ntoc( AV41TFHisProKgr_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROMTR", GXutil.ltrim( localUtil.ntoc( AV42TFHisProMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROMTR_TO", GXutil.ltrim( localUtil.ntoc( AV43TFHisProMtr_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPRODTI", localUtil.ttoc( AV44TFHisProDTI, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPRODTF", localUtil.ttoc( AV48TFHisProDTF, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPARCOD", GXutil.ltrim( localUtil.ntoc( AV52TFParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPARCOD_TO", GXutil.ltrim( localUtil.ntoc( AV53TFParCod_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPARCODNOM", GXutil.rtrim( AV54TFParCodNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPARCODNOM_SEL", GXutil.rtrim( AV55TFParCodNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRODUCCION_CONSULTADEPRODUCCION_PARTESPRODUCCIONDS_1_EMPRCOD", GXutil.rtrim( AV79Produccion_consultadeproduccion_partesproduccionds_1_emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRODUCCION_CONSULTADEPRODUCCION_PARTESPRODUCCIONDS_2_BARCOD", GXutil.ltrim( localUtil.ntoc( AV80Produccion_consultadeproduccion_partesproduccionds_2_barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRODUCCION_CONSULTADEPRODUCCION_PARTESPRODUCCIONDS_3_BARCODREO", GXutil.ltrim( localUtil.ntoc( AV81Produccion_consultadeproduccion_partesproduccionds_3_barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRODUCCION_CONSULTADEPRODUCCION_PARTESPRODUCCIONDS_4_BARCODPAR", GXutil.rtrim( AV82Produccion_consultadeproduccion_partesproduccionds_4_barcodpar));
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

   public void renderHtmlCloseForm1RZ2( )
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
      return "Produccion.ConsultadeProduccion_PartesProduccion" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Parte Produccion", "") ;
   }

   public void wb1RZ0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.produccion.consultadeproduccion_partesproduccion");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV61BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV61BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV61BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ConsultadeProduccion_PartesProduccion.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodreo_Internalname, GXutil.ltrim( localUtil.ntoc( AV62BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV62BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(AV62BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodreo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodreo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ConsultadeProduccion_PartesProduccion.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodpar_Internalname, GXutil.rtrim( AV63BarCodPar), GXutil.rtrim( localUtil.format( AV63BarCodPar, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodpar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodpar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ConsultadeProduccion_PartesProduccion.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV66CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV66CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV66CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ConsultadeProduccion_PartesProduccion.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClinom_Internalname, GXutil.rtrim( AV67CliNom), GXutil.rtrim( localUtil.format( AV67CliNom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClinom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClinom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ConsultadeProduccion_PartesProduccion.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPedidocliente_Internalname, GXutil.rtrim( AV68PedidoCliente), GXutil.rtrim( localUtil.format( AV68PedidoCliente, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPedidocliente_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPedidocliente_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ConsultadeProduccion_PartesProduccion.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarser_Internalname, GXutil.rtrim( AV69BarSer), GXutil.rtrim( localUtil.format( AV69BarSer, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarser_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarser_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ConsultadeProduccion_PartesProduccion.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarserdsc_Internalname, GXutil.rtrim( AV70BarSerDsc), GXutil.rtrim( localUtil.format( AV70BarSerDsc, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarserdsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarserdsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ConsultadeProduccion_PartesProduccion.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnom_Internalname, GXutil.rtrim( AV71BarColNom), GXutil.rtrim( localUtil.format( AV71BarColNom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ConsultadeProduccion_PartesProduccion.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnum_Internalname, GXutil.ltrim( localUtil.ntoc( AV72BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV72BarColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV72BarColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ConsultadeProduccion_PartesProduccion.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 87, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\ConsultadeProduccion_PartesProduccion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 87, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\ConsultadeProduccion_PartesProduccion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 87, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\ConsultadeProduccion_PartesProduccion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_76_1RZ2( true) ;
      }
      else
      {
         wb_table1_76_1RZ2( false) ;
      }
      return  ;
   }

   public void wb_table1_76_1RZ2e( boolean wbgen )
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
         startgridcontrol87( ) ;
      }
      if ( wbEnd == 87 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_87 = (int)(nGXsfl_87_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV58GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV59GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV75Pgmname), GXutil.rtrim( localUtil.format( AV75Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ConsultadeProduccion_PartesProduccion.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV56DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, 0, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ConsultadeProduccion_PartesProduccion.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "Attribute", "", "", "", "", edtBarCod_Visible, 0, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ConsultadeProduccion_PartesProduccion.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "Attribute", "", "", "", "", edtBarCodReo_Visible, 0, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ConsultadeProduccion_PartesProduccion.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "Attribute", "", "", "", "", edtBarCodPar_Visible, 0, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ConsultadeProduccion_PartesProduccion.htm");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV56DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV20ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_hisprodtiauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'" + sPrefix + "',false,'" + sGXsfl_87_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_hisprodtiauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_hisprodtiauxdate_Internalname, localUtil.format(AV46DDO_HisProDTIAuxDate, "99/99/99"), localUtil.format( AV46DDO_HisProDTIAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,119);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_hisprodtiauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ConsultadeProduccion_PartesProduccion.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_hisprodtiauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\ConsultadeProduccion_PartesProduccion.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_hisprodtfauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'" + sPrefix + "',false,'" + sGXsfl_87_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_hisprodtfauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_hisprodtfauxdate_Internalname, localUtil.format(AV50DDO_HisProDTFAuxDate, "99/99/99"), localUtil.format( AV50DDO_HisProDTFAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,121);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_hisprodtfauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ConsultadeProduccion_PartesProduccion.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_hisprodtfauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\ConsultadeProduccion_PartesProduccion.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 87 )
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

   public void start1RZ2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( " Parte Produccion", ""), (short)(0)) ;
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
            strup1RZ0( ) ;
         }
      }
   }

   public void ws1RZ2( )
   {
      start1RZ2( ) ;
      evt1RZ2( ) ;
   }

   public void evt1RZ2( )
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
                              strup1RZ0( ) ;
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
                              strup1RZ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e111RZ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1RZ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e121RZ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1RZ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e131RZ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1RZ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e141RZ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1RZ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e151RZ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1RZ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e161RZ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1RZ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavDdo_hisprodtiauxdate_Internalname ;
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
                              strup1RZ0( ) ;
                           }
                           nGXsfl_87_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_87_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_87_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_872( ) ;
                           A194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A461Fase = httpContext.cgiGet( edtFase_Internalname) ;
                           A14027Fase_Dsc = httpContext.cgiGet( edtFase_Dsc_Internalname) ;
                           A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
                           A606MaqDsc = httpContext.cgiGet( edtMaqDsc_Internalname) ;
                           n606MaqDsc = false ;
                           A503GruOpeCod = (int)(localUtil.ctol( httpContext.cgiGet( edtGruOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A14028Gruopecod_ = httpContext.cgiGet( edtGruopecod__Internalname) ;
                           A1525HisProKgr = localUtil.ctond( httpContext.cgiGet( edtHisProKgr_Internalname)) ;
                           A1526HisProMtr = localUtil.ctond( httpContext.cgiGet( edtHisProMtr_Internalname)) ;
                           A4440HisProDTI = localUtil.ctot( httpContext.cgiGet( edtHisProDTI_Internalname), 0) ;
                           n4440HisProDTI = false ;
                           A4441HisProDTF = localUtil.ctot( httpContext.cgiGet( edtHisProDTF_Internalname), 0) ;
                           n4441HisProDTF = false ;
                           A656ParCod = (short)(localUtil.ctol( httpContext.cgiGet( edtParCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n656ParCod = false ;
                           A867ParCodNom = httpContext.cgiGet( edtParCodNom_Internalname) ;
                           n867ParCodNom = false ;
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
                                       GX_FocusControl = edtavDdo_hisprodtiauxdate_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e171RZ2 ();
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
                                       GX_FocusControl = edtavDdo_hisprodtiauxdate_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e181RZ2 ();
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
                                       GX_FocusControl = edtavDdo_hisprodtiauxdate_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e191RZ2 ();
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
                                    strup1RZ0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavDdo_hisprodtiauxdate_Internalname ;
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

   public void we1RZ2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1RZ2( ) ;
         }
      }
   }

   public void pa1RZ2( )
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
            GX_FocusControl = edtavDdo_hisprodtiauxdate_Internalname ;
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
      subsflControlProps_872( ) ;
      while ( nGXsfl_87_idx <= nRC_GXsfl_87 )
      {
         sendrow_872( ) ;
         nGXsfl_87_idx = ((subGrid_Islastpage==1)&&(nGXsfl_87_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_87_idx+1) ;
         sGXsfl_87_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_87_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_872( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ,
                                 String AV60EmprCod ,
                                 int AV61BarCod ,
                                 byte AV62BarCodReo ,
                                 String AV63BarCodPar ,
                                 short AV26TFBarOrdLin ,
                                 short AV27TFBarOrdLin_To ,
                                 String AV28TFFase ,
                                 String AV29TFFase_Sel ,
                                 String AV30TFFase_Dsc ,
                                 String AV31TFFase_Dsc_Sel ,
                                 String AV32TFMaqCod ,
                                 String AV33TFMaqCod_Sel ,
                                 String AV34TFMaqDsc ,
                                 String AV35TFMaqDsc_Sel ,
                                 int AV38TFGruOpeCod ,
                                 int AV39TFGruOpeCod_To ,
                                 String AV36TFGruopecod_Nombre ,
                                 String AV37TFGruopecod_Nombre_Sel ,
                                 java.math.BigDecimal AV40TFHisProKgr ,
                                 java.math.BigDecimal AV41TFHisProKgr_To ,
                                 java.math.BigDecimal AV42TFHisProMtr ,
                                 java.math.BigDecimal AV43TFHisProMtr_To ,
                                 java.util.Date AV44TFHisProDTI ,
                                 java.util.Date AV48TFHisProDTF ,
                                 short AV52TFParCod ,
                                 short AV53TFParCod_To ,
                                 String AV54TFParCodNom ,
                                 String AV55TFParCodNom_Sel ,
                                 String AV75Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 int AV66CliCod ,
                                 String AV67CliNom ,
                                 String AV68PedidoCliente ,
                                 String AV69BarSer ,
                                 String AV70BarSerDsc ,
                                 String AV71BarColNom ,
                                 int AV72BarColNum ,
                                 String AV79Produccion_consultadeproduccion_partesproduccionds_1_emprcod ,
                                 int AV80Produccion_consultadeproduccion_partesproduccionds_2_barcod ,
                                 byte AV81Produccion_consultadeproduccion_partesproduccionds_3_barcodreo ,
                                 String AV82Produccion_consultadeproduccion_partesproduccionds_4_barcodpar ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e181RZ2 ();
      GRID_nCurrentRecord = 0 ;
      rf1RZ2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ConsultadeProduccion_PartesProduccion");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV75Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("produccion\\consultadeproduccion_partesproduccion:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf1RZ2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV75Pgmname = "Produccion.ConsultadeProduccion_PartesProduccion" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75Pgmname", AV75Pgmname);
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
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV79Produccion_consultadeproduccion_partesproduccionds_1_emprcod = AV60EmprCod ;
      AV80Produccion_consultadeproduccion_partesproduccionds_2_barcod = AV61BarCod ;
      AV81Produccion_consultadeproduccion_partesproduccionds_3_barcodreo = AV62BarCodReo ;
      AV82Produccion_consultadeproduccion_partesproduccionds_4_barcodpar = AV63BarCodPar ;
      AV83Produccion_consultadeproduccion_partesproduccionds_5_tfbarordlin = AV26TFBarOrdLin ;
      AV84Produccion_consultadeproduccion_partesproduccionds_6_tfbarordlin_to = AV27TFBarOrdLin_To ;
      AV85Produccion_consultadeproduccion_partesproduccionds_7_tffase = AV28TFFase ;
      AV86Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel = AV29TFFase_Sel ;
      AV87Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc = AV30TFFase_Dsc ;
      AV88Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel = AV31TFFase_Dsc_Sel ;
      AV89Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod = AV32TFMaqCod ;
      AV90Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel = AV33TFMaqCod_Sel ;
      AV91Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc = AV34TFMaqDsc ;
      AV92Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel = AV35TFMaqDsc_Sel ;
      AV93Produccion_consultadeproduccion_partesproduccionds_15_tfgruopecod = AV38TFGruOpeCod ;
      AV94Produccion_consultadeproduccion_partesproduccionds_16_tfgruopecod_to = AV39TFGruOpeCod_To ;
      AV95Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre = AV36TFGruopecod_Nombre ;
      AV96Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel = AV37TFGruopecod_Nombre_Sel ;
      AV97Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr = AV40TFHisProKgr ;
      AV98Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to = AV41TFHisProKgr_To ;
      AV99Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr = AV42TFHisProMtr ;
      AV100Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to = AV43TFHisProMtr_To ;
      AV101Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti = AV44TFHisProDTI ;
      AV102Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf = AV48TFHisProDTF ;
      AV103Produccion_consultadeproduccion_partesproduccionds_25_tfparcod = AV52TFParCod ;
      AV104Produccion_consultadeproduccion_partesproduccionds_26_tfparcod_to = AV53TFParCod_To ;
      AV105Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom = AV54TFParCodNom ;
      AV106Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel = AV55TFParCodNom_Sel ;
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV83Produccion_consultadeproduccion_partesproduccionds_5_tfbarordlin) ,
                                           Short.valueOf(AV84Produccion_consultadeproduccion_partesproduccionds_6_tfbarordlin_to) ,
                                           AV86Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel ,
                                           AV85Produccion_consultadeproduccion_partesproduccionds_7_tffase ,
                                           AV90Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel ,
                                           AV89Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod ,
                                           AV92Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel ,
                                           AV91Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc ,
                                           Integer.valueOf(AV93Produccion_consultadeproduccion_partesproduccionds_15_tfgruopecod) ,
                                           Integer.valueOf(AV94Produccion_consultadeproduccion_partesproduccionds_16_tfgruopecod_to) ,
                                           AV97Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr ,
                                           AV98Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to ,
                                           AV99Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr ,
                                           AV100Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to ,
                                           AV101Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti ,
                                           AV102Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf ,
                                           Short.valueOf(AV103Produccion_consultadeproduccion_partesproduccionds_25_tfparcod) ,
                                           Short.valueOf(AV104Produccion_consultadeproduccion_partesproduccionds_26_tfparcod_to) ,
                                           AV106Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel ,
                                           AV105Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A461Fase ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF ,
                                           Short.valueOf(A656ParCod) ,
                                           A867ParCodNom ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV88Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel ,
                                           AV87Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc ,
                                           A14027Fase_Dsc ,
                                           AV96Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel ,
                                           AV95Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre ,
                                           A14028Gruopecod_ ,
                                           AV79Produccion_consultadeproduccion_partesproduccionds_1_emprcod ,
                                           Integer.valueOf(AV80Produccion_consultadeproduccion_partesproduccionds_2_barcod) ,
                                           Byte.valueOf(AV81Produccion_consultadeproduccion_partesproduccionds_3_barcodreo) ,
                                           AV82Produccion_consultadeproduccion_partesproduccionds_4_barcodpar ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV85Produccion_consultadeproduccion_partesproduccionds_7_tffase = GXutil.padr( GXutil.rtrim( AV85Produccion_consultadeproduccion_partesproduccionds_7_tffase), 8, "%") ;
      lV89Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod = GXutil.padr( GXutil.rtrim( AV89Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod), 6, "%") ;
      lV91Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV91Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc), 16, "%") ;
      lV105Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom = GXutil.padr( GXutil.rtrim( AV105Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom), 30, "%") ;
      /* Using cursor H01RZ2 */
      pr_default.execute(0, new Object[] {AV79Produccion_consultadeproduccion_partesproduccionds_1_emprcod, Integer.valueOf(AV80Produccion_consultadeproduccion_partesproduccionds_2_barcod), Byte.valueOf(AV81Produccion_consultadeproduccion_partesproduccionds_3_barcodreo), AV82Produccion_consultadeproduccion_partesproduccionds_4_barcodpar, Short.valueOf(AV83Produccion_consultadeproduccion_partesproduccionds_5_tfbarordlin), Short.valueOf(AV84Produccion_consultadeproduccion_partesproduccionds_6_tfbarordlin_to), lV85Produccion_consultadeproduccion_partesproduccionds_7_tffase, AV86Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel, lV89Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod, AV90Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel, lV91Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc, AV92Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel, Integer.valueOf(AV93Produccion_consultadeproduccion_partesproduccionds_15_tfgruopecod), Integer.valueOf(AV94Produccion_consultadeproduccion_partesproduccionds_16_tfgruopecod_to), AV97Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr, AV98Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to, AV99Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr, AV100Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to, AV101Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti, AV102Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf, Short.valueOf(AV103Produccion_consultadeproduccion_partesproduccionds_25_tfparcod), Short.valueOf(AV104Produccion_consultadeproduccion_partesproduccionds_26_tfparcod_to), lV105Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom, AV106Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A129BarCod = H01RZ2_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = H01RZ2_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = H01RZ2_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A130BarCodPar", A130BarCodPar);
         A867ParCodNom = H01RZ2_A867ParCodNom[0] ;
         n867ParCodNom = H01RZ2_n867ParCodNom[0] ;
         A656ParCod = H01RZ2_A656ParCod[0] ;
         n656ParCod = H01RZ2_n656ParCod[0] ;
         A4441HisProDTF = H01RZ2_A4441HisProDTF[0] ;
         n4441HisProDTF = H01RZ2_n4441HisProDTF[0] ;
         A4440HisProDTI = H01RZ2_A4440HisProDTI[0] ;
         n4440HisProDTI = H01RZ2_n4440HisProDTI[0] ;
         A1526HisProMtr = H01RZ2_A1526HisProMtr[0] ;
         A1525HisProKgr = H01RZ2_A1525HisProKgr[0] ;
         A606MaqDsc = H01RZ2_A606MaqDsc[0] ;
         n606MaqDsc = H01RZ2_n606MaqDsc[0] ;
         A602MaqCod = H01RZ2_A602MaqCod[0] ;
         A194BarOrdLin = H01RZ2_A194BarOrdLin[0] ;
         A461Fase = H01RZ2_A461Fase[0] ;
         A503GruOpeCod = H01RZ2_A503GruOpeCod[0] ;
         A396EmprCod = H01RZ2_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         A606MaqDsc = H01RZ2_A606MaqDsc[0] ;
         n606MaqDsc = H01RZ2_n606MaqDsc[0] ;
         A867ParCodNom = H01RZ2_A867ParCodNom[0] ;
         n867ParCodNom = H01RZ2_n867ParCodNom[0] ;
         GXt_char1 = A14027Fase_Dsc ;
         GXv_char2[0] = GXt_char1 ;
         new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char2) ;
         consultadeproduccion_partesproduccion_impl.this.GXt_char1 = GXv_char2[0] ;
         A14027Fase_Dsc = GXt_char1 ;
         if ( ! ( (GXutil.strcmp("", AV88Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel)==0) && ( ! (GXutil.strcmp("", AV87Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc)==0) ) ) || ( GXutil.like( GXutil.upper( A14027Fase_Dsc) , GXutil.padr( "%" + GXutil.upper( AV87Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV88Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel)==0) || ( ( GXutil.strcmp(A14027Fase_Dsc, AV88Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel) == 0 ) ) )
            {
               GXt_char1 = A14028Gruopecod_ ;
               GXv_char2[0] = GXt_char1 ;
               new app.popenom(remoteHandle, context).execute( A396EmprCod, A503GruOpeCod, GXv_char2) ;
               consultadeproduccion_partesproduccion_impl.this.GXt_char1 = GXv_char2[0] ;
               A14028Gruopecod_ = GXt_char1 ;
               if ( ! ( (GXutil.strcmp("", AV96Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel)==0) && ( ! (GXutil.strcmp("", AV95Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre)==0) ) ) || ( GXutil.like( GXutil.upper( A14028Gruopecod_) , GXutil.padr( "%" + GXutil.upper( AV95Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV96Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel)==0) || ( ( GXutil.strcmp(A14028Gruopecod_, AV96Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel) == 0 ) ) )
                  {
                     GRID_nRecordCount = (long)(GRID_nRecordCount+1) ;
                  }
               }
            }
         }
         pr_default.readNext(0);
      }
      GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      pr_default.close(0);
      return (int)(GRID_nRecordCount) ;
   }

   public void rf1RZ2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(87) ;
      /* Execute user event: Refresh */
      e181RZ2 ();
      nGXsfl_87_idx = 1 ;
      sGXsfl_87_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_87_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_872( ) ;
      bGXsfl_87_Refreshing = true ;
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
         subsflControlProps_872( ) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              Short.valueOf(AV83Produccion_consultadeproduccion_partesproduccionds_5_tfbarordlin) ,
                                              Short.valueOf(AV84Produccion_consultadeproduccion_partesproduccionds_6_tfbarordlin_to) ,
                                              AV86Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel ,
                                              AV85Produccion_consultadeproduccion_partesproduccionds_7_tffase ,
                                              AV90Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel ,
                                              AV89Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod ,
                                              AV92Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel ,
                                              AV91Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc ,
                                              Integer.valueOf(AV93Produccion_consultadeproduccion_partesproduccionds_15_tfgruopecod) ,
                                              Integer.valueOf(AV94Produccion_consultadeproduccion_partesproduccionds_16_tfgruopecod_to) ,
                                              AV97Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr ,
                                              AV98Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to ,
                                              AV99Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr ,
                                              AV100Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to ,
                                              AV101Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti ,
                                              AV102Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf ,
                                              Short.valueOf(AV103Produccion_consultadeproduccion_partesproduccionds_25_tfparcod) ,
                                              Short.valueOf(AV104Produccion_consultadeproduccion_partesproduccionds_26_tfparcod_to) ,
                                              AV106Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel ,
                                              AV105Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom ,
                                              Short.valueOf(A194BarOrdLin) ,
                                              A461Fase ,
                                              A602MaqCod ,
                                              A606MaqDsc ,
                                              Integer.valueOf(A503GruOpeCod) ,
                                              A1525HisProKgr ,
                                              A1526HisProMtr ,
                                              A4440HisProDTI ,
                                              A4441HisProDTF ,
                                              Short.valueOf(A656ParCod) ,
                                              A867ParCodNom ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV88Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel ,
                                              AV87Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc ,
                                              A14027Fase_Dsc ,
                                              AV96Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel ,
                                              AV95Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre ,
                                              A14028Gruopecod_ ,
                                              AV79Produccion_consultadeproduccion_partesproduccionds_1_emprcod ,
                                              Integer.valueOf(AV80Produccion_consultadeproduccion_partesproduccionds_2_barcod) ,
                                              Byte.valueOf(AV81Produccion_consultadeproduccion_partesproduccionds_3_barcodreo) ,
                                              AV82Produccion_consultadeproduccion_partesproduccionds_4_barcodpar ,
                                              A396EmprCod ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar } ,
                                              new int[]{
                                              TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                              TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.BYTE, TypeConstants.STRING
                                              }
         });
         lV85Produccion_consultadeproduccion_partesproduccionds_7_tffase = GXutil.padr( GXutil.rtrim( AV85Produccion_consultadeproduccion_partesproduccionds_7_tffase), 8, "%") ;
         lV89Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod = GXutil.padr( GXutil.rtrim( AV89Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod), 6, "%") ;
         lV91Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV91Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc), 16, "%") ;
         lV105Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom = GXutil.padr( GXutil.rtrim( AV105Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom), 30, "%") ;
         /* Using cursor H01RZ3 */
         pr_default.execute(1, new Object[] {AV79Produccion_consultadeproduccion_partesproduccionds_1_emprcod, Integer.valueOf(AV80Produccion_consultadeproduccion_partesproduccionds_2_barcod), Byte.valueOf(AV81Produccion_consultadeproduccion_partesproduccionds_3_barcodreo), AV82Produccion_consultadeproduccion_partesproduccionds_4_barcodpar, Short.valueOf(AV83Produccion_consultadeproduccion_partesproduccionds_5_tfbarordlin), Short.valueOf(AV84Produccion_consultadeproduccion_partesproduccionds_6_tfbarordlin_to), lV85Produccion_consultadeproduccion_partesproduccionds_7_tffase, AV86Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel, lV89Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod, AV90Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel, lV91Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc, AV92Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel, Integer.valueOf(AV93Produccion_consultadeproduccion_partesproduccionds_15_tfgruopecod), Integer.valueOf(AV94Produccion_consultadeproduccion_partesproduccionds_16_tfgruopecod_to), AV97Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr, AV98Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to, AV99Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr, AV100Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to, AV101Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti, AV102Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf, Short.valueOf(AV103Produccion_consultadeproduccion_partesproduccionds_25_tfparcod), Short.valueOf(AV104Produccion_consultadeproduccion_partesproduccionds_26_tfparcod_to), lV105Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom, AV106Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel});
         nGXsfl_87_idx = 1 ;
         sGXsfl_87_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_87_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_872( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A129BarCod = H01RZ3_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = H01RZ3_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = H01RZ3_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A130BarCodPar", A130BarCodPar);
            A867ParCodNom = H01RZ3_A867ParCodNom[0] ;
            n867ParCodNom = H01RZ3_n867ParCodNom[0] ;
            A656ParCod = H01RZ3_A656ParCod[0] ;
            n656ParCod = H01RZ3_n656ParCod[0] ;
            A4441HisProDTF = H01RZ3_A4441HisProDTF[0] ;
            n4441HisProDTF = H01RZ3_n4441HisProDTF[0] ;
            A4440HisProDTI = H01RZ3_A4440HisProDTI[0] ;
            n4440HisProDTI = H01RZ3_n4440HisProDTI[0] ;
            A1526HisProMtr = H01RZ3_A1526HisProMtr[0] ;
            A1525HisProKgr = H01RZ3_A1525HisProKgr[0] ;
            A606MaqDsc = H01RZ3_A606MaqDsc[0] ;
            n606MaqDsc = H01RZ3_n606MaqDsc[0] ;
            A602MaqCod = H01RZ3_A602MaqCod[0] ;
            A194BarOrdLin = H01RZ3_A194BarOrdLin[0] ;
            A461Fase = H01RZ3_A461Fase[0] ;
            A503GruOpeCod = H01RZ3_A503GruOpeCod[0] ;
            A396EmprCod = H01RZ3_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
            A606MaqDsc = H01RZ3_A606MaqDsc[0] ;
            n606MaqDsc = H01RZ3_n606MaqDsc[0] ;
            A867ParCodNom = H01RZ3_A867ParCodNom[0] ;
            n867ParCodNom = H01RZ3_n867ParCodNom[0] ;
            GXt_char1 = A14027Fase_Dsc ;
            GXv_char2[0] = GXt_char1 ;
            new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char2) ;
            consultadeproduccion_partesproduccion_impl.this.GXt_char1 = GXv_char2[0] ;
            A14027Fase_Dsc = GXt_char1 ;
            if ( ! ( (GXutil.strcmp("", AV88Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel)==0) && ( ! (GXutil.strcmp("", AV87Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc)==0) ) ) || ( GXutil.like( GXutil.upper( A14027Fase_Dsc) , GXutil.padr( "%" + GXutil.upper( AV87Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV88Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel)==0) || ( ( GXutil.strcmp(A14027Fase_Dsc, AV88Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel) == 0 ) ) )
               {
                  GXt_char1 = A14028Gruopecod_ ;
                  GXv_char2[0] = GXt_char1 ;
                  new app.popenom(remoteHandle, context).execute( A396EmprCod, A503GruOpeCod, GXv_char2) ;
                  consultadeproduccion_partesproduccion_impl.this.GXt_char1 = GXv_char2[0] ;
                  A14028Gruopecod_ = GXt_char1 ;
                  if ( ! ( (GXutil.strcmp("", AV96Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel)==0) && ( ! (GXutil.strcmp("", AV95Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre)==0) ) ) || ( GXutil.like( GXutil.upper( A14028Gruopecod_) , GXutil.padr( "%" + GXutil.upper( AV95Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre) , 255 , "%"),  ' ' ) ) )
                  {
                     if ( (GXutil.strcmp("", AV96Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel)==0) || ( ( GXutil.strcmp(A14028Gruopecod_, AV96Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel) == 0 ) ) )
                     {
                        e191RZ2 ();
                     }
                  }
               }
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(87) ;
         wb1RZ0( ) ;
      }
      bGXsfl_87_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1RZ2( )
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
      AV79Produccion_consultadeproduccion_partesproduccionds_1_emprcod = AV60EmprCod ;
      AV80Produccion_consultadeproduccion_partesproduccionds_2_barcod = AV61BarCod ;
      AV81Produccion_consultadeproduccion_partesproduccionds_3_barcodreo = AV62BarCodReo ;
      AV82Produccion_consultadeproduccion_partesproduccionds_4_barcodpar = AV63BarCodPar ;
      AV83Produccion_consultadeproduccion_partesproduccionds_5_tfbarordlin = AV26TFBarOrdLin ;
      AV84Produccion_consultadeproduccion_partesproduccionds_6_tfbarordlin_to = AV27TFBarOrdLin_To ;
      AV85Produccion_consultadeproduccion_partesproduccionds_7_tffase = AV28TFFase ;
      AV86Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel = AV29TFFase_Sel ;
      AV87Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc = AV30TFFase_Dsc ;
      AV88Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel = AV31TFFase_Dsc_Sel ;
      AV89Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod = AV32TFMaqCod ;
      AV90Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel = AV33TFMaqCod_Sel ;
      AV91Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc = AV34TFMaqDsc ;
      AV92Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel = AV35TFMaqDsc_Sel ;
      AV93Produccion_consultadeproduccion_partesproduccionds_15_tfgruopecod = AV38TFGruOpeCod ;
      AV94Produccion_consultadeproduccion_partesproduccionds_16_tfgruopecod_to = AV39TFGruOpeCod_To ;
      AV95Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre = AV36TFGruopecod_Nombre ;
      AV96Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel = AV37TFGruopecod_Nombre_Sel ;
      AV97Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr = AV40TFHisProKgr ;
      AV98Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to = AV41TFHisProKgr_To ;
      AV99Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr = AV42TFHisProMtr ;
      AV100Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to = AV43TFHisProMtr_To ;
      AV101Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti = AV44TFHisProDTI ;
      AV102Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf = AV48TFHisProDTF ;
      AV103Produccion_consultadeproduccion_partesproduccionds_25_tfparcod = AV52TFParCod ;
      AV104Produccion_consultadeproduccion_partesproduccionds_26_tfparcod_to = AV53TFParCod_To ;
      AV105Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom = AV54TFParCodNom ;
      AV106Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel = AV55TFParCodNom_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV20ColumnsSelector, AV60EmprCod, AV61BarCod, AV62BarCodReo, AV63BarCodPar, AV26TFBarOrdLin, AV27TFBarOrdLin_To, AV28TFFase, AV29TFFase_Sel, AV30TFFase_Dsc, AV31TFFase_Dsc_Sel, AV32TFMaqCod, AV33TFMaqCod_Sel, AV34TFMaqDsc, AV35TFMaqDsc_Sel, AV38TFGruOpeCod, AV39TFGruOpeCod_To, AV36TFGruopecod_Nombre, AV37TFGruopecod_Nombre_Sel, AV40TFHisProKgr, AV41TFHisProKgr_To, AV42TFHisProMtr, AV43TFHisProMtr_To, AV44TFHisProDTI, AV48TFHisProDTF, AV52TFParCod, AV53TFParCod_To, AV54TFParCodNom, AV55TFParCodNom_Sel, AV75Pgmname, AV12OrderedBy, AV13OrderedDsc, AV66CliCod, AV67CliNom, AV68PedidoCliente, AV69BarSer, AV70BarSerDsc, AV71BarColNom, AV72BarColNum, AV79Produccion_consultadeproduccion_partesproduccionds_1_emprcod, AV80Produccion_consultadeproduccion_partesproduccionds_2_barcod, AV81Produccion_consultadeproduccion_partesproduccionds_3_barcodreo, AV82Produccion_consultadeproduccion_partesproduccionds_4_barcodpar, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV79Produccion_consultadeproduccion_partesproduccionds_1_emprcod = AV60EmprCod ;
      AV80Produccion_consultadeproduccion_partesproduccionds_2_barcod = AV61BarCod ;
      AV81Produccion_consultadeproduccion_partesproduccionds_3_barcodreo = AV62BarCodReo ;
      AV82Produccion_consultadeproduccion_partesproduccionds_4_barcodpar = AV63BarCodPar ;
      AV83Produccion_consultadeproduccion_partesproduccionds_5_tfbarordlin = AV26TFBarOrdLin ;
      AV84Produccion_consultadeproduccion_partesproduccionds_6_tfbarordlin_to = AV27TFBarOrdLin_To ;
      AV85Produccion_consultadeproduccion_partesproduccionds_7_tffase = AV28TFFase ;
      AV86Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel = AV29TFFase_Sel ;
      AV87Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc = AV30TFFase_Dsc ;
      AV88Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel = AV31TFFase_Dsc_Sel ;
      AV89Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod = AV32TFMaqCod ;
      AV90Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel = AV33TFMaqCod_Sel ;
      AV91Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc = AV34TFMaqDsc ;
      AV92Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel = AV35TFMaqDsc_Sel ;
      AV93Produccion_consultadeproduccion_partesproduccionds_15_tfgruopecod = AV38TFGruOpeCod ;
      AV94Produccion_consultadeproduccion_partesproduccionds_16_tfgruopecod_to = AV39TFGruOpeCod_To ;
      AV95Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre = AV36TFGruopecod_Nombre ;
      AV96Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel = AV37TFGruopecod_Nombre_Sel ;
      AV97Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr = AV40TFHisProKgr ;
      AV98Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to = AV41TFHisProKgr_To ;
      AV99Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr = AV42TFHisProMtr ;
      AV100Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to = AV43TFHisProMtr_To ;
      AV101Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti = AV44TFHisProDTI ;
      AV102Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf = AV48TFHisProDTF ;
      AV103Produccion_consultadeproduccion_partesproduccionds_25_tfparcod = AV52TFParCod ;
      AV104Produccion_consultadeproduccion_partesproduccionds_26_tfparcod_to = AV53TFParCod_To ;
      AV105Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom = AV54TFParCodNom ;
      AV106Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel = AV55TFParCodNom_Sel ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV20ColumnsSelector, AV60EmprCod, AV61BarCod, AV62BarCodReo, AV63BarCodPar, AV26TFBarOrdLin, AV27TFBarOrdLin_To, AV28TFFase, AV29TFFase_Sel, AV30TFFase_Dsc, AV31TFFase_Dsc_Sel, AV32TFMaqCod, AV33TFMaqCod_Sel, AV34TFMaqDsc, AV35TFMaqDsc_Sel, AV38TFGruOpeCod, AV39TFGruOpeCod_To, AV36TFGruopecod_Nombre, AV37TFGruopecod_Nombre_Sel, AV40TFHisProKgr, AV41TFHisProKgr_To, AV42TFHisProMtr, AV43TFHisProMtr_To, AV44TFHisProDTI, AV48TFHisProDTF, AV52TFParCod, AV53TFParCod_To, AV54TFParCodNom, AV55TFParCodNom_Sel, AV75Pgmname, AV12OrderedBy, AV13OrderedDsc, AV66CliCod, AV67CliNom, AV68PedidoCliente, AV69BarSer, AV70BarSerDsc, AV71BarColNom, AV72BarColNum, AV79Produccion_consultadeproduccion_partesproduccionds_1_emprcod, AV80Produccion_consultadeproduccion_partesproduccionds_2_barcod, AV81Produccion_consultadeproduccion_partesproduccionds_3_barcodreo, AV82Produccion_consultadeproduccion_partesproduccionds_4_barcodpar, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV79Produccion_consultadeproduccion_partesproduccionds_1_emprcod = AV60EmprCod ;
      AV80Produccion_consultadeproduccion_partesproduccionds_2_barcod = AV61BarCod ;
      AV81Produccion_consultadeproduccion_partesproduccionds_3_barcodreo = AV62BarCodReo ;
      AV82Produccion_consultadeproduccion_partesproduccionds_4_barcodpar = AV63BarCodPar ;
      AV83Produccion_consultadeproduccion_partesproduccionds_5_tfbarordlin = AV26TFBarOrdLin ;
      AV84Produccion_consultadeproduccion_partesproduccionds_6_tfbarordlin_to = AV27TFBarOrdLin_To ;
      AV85Produccion_consultadeproduccion_partesproduccionds_7_tffase = AV28TFFase ;
      AV86Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel = AV29TFFase_Sel ;
      AV87Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc = AV30TFFase_Dsc ;
      AV88Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel = AV31TFFase_Dsc_Sel ;
      AV89Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod = AV32TFMaqCod ;
      AV90Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel = AV33TFMaqCod_Sel ;
      AV91Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc = AV34TFMaqDsc ;
      AV92Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel = AV35TFMaqDsc_Sel ;
      AV93Produccion_consultadeproduccion_partesproduccionds_15_tfgruopecod = AV38TFGruOpeCod ;
      AV94Produccion_consultadeproduccion_partesproduccionds_16_tfgruopecod_to = AV39TFGruOpeCod_To ;
      AV95Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre = AV36TFGruopecod_Nombre ;
      AV96Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel = AV37TFGruopecod_Nombre_Sel ;
      AV97Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr = AV40TFHisProKgr ;
      AV98Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to = AV41TFHisProKgr_To ;
      AV99Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr = AV42TFHisProMtr ;
      AV100Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to = AV43TFHisProMtr_To ;
      AV101Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti = AV44TFHisProDTI ;
      AV102Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf = AV48TFHisProDTF ;
      AV103Produccion_consultadeproduccion_partesproduccionds_25_tfparcod = AV52TFParCod ;
      AV104Produccion_consultadeproduccion_partesproduccionds_26_tfparcod_to = AV53TFParCod_To ;
      AV105Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom = AV54TFParCodNom ;
      AV106Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel = AV55TFParCodNom_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV20ColumnsSelector, AV60EmprCod, AV61BarCod, AV62BarCodReo, AV63BarCodPar, AV26TFBarOrdLin, AV27TFBarOrdLin_To, AV28TFFase, AV29TFFase_Sel, AV30TFFase_Dsc, AV31TFFase_Dsc_Sel, AV32TFMaqCod, AV33TFMaqCod_Sel, AV34TFMaqDsc, AV35TFMaqDsc_Sel, AV38TFGruOpeCod, AV39TFGruOpeCod_To, AV36TFGruopecod_Nombre, AV37TFGruopecod_Nombre_Sel, AV40TFHisProKgr, AV41TFHisProKgr_To, AV42TFHisProMtr, AV43TFHisProMtr_To, AV44TFHisProDTI, AV48TFHisProDTF, AV52TFParCod, AV53TFParCod_To, AV54TFParCodNom, AV55TFParCodNom_Sel, AV75Pgmname, AV12OrderedBy, AV13OrderedDsc, AV66CliCod, AV67CliNom, AV68PedidoCliente, AV69BarSer, AV70BarSerDsc, AV71BarColNom, AV72BarColNum, AV79Produccion_consultadeproduccion_partesproduccionds_1_emprcod, AV80Produccion_consultadeproduccion_partesproduccionds_2_barcod, AV81Produccion_consultadeproduccion_partesproduccionds_3_barcodreo, AV82Produccion_consultadeproduccion_partesproduccionds_4_barcodpar, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV79Produccion_consultadeproduccion_partesproduccionds_1_emprcod = AV60EmprCod ;
      AV80Produccion_consultadeproduccion_partesproduccionds_2_barcod = AV61BarCod ;
      AV81Produccion_consultadeproduccion_partesproduccionds_3_barcodreo = AV62BarCodReo ;
      AV82Produccion_consultadeproduccion_partesproduccionds_4_barcodpar = AV63BarCodPar ;
      AV83Produccion_consultadeproduccion_partesproduccionds_5_tfbarordlin = AV26TFBarOrdLin ;
      AV84Produccion_consultadeproduccion_partesproduccionds_6_tfbarordlin_to = AV27TFBarOrdLin_To ;
      AV85Produccion_consultadeproduccion_partesproduccionds_7_tffase = AV28TFFase ;
      AV86Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel = AV29TFFase_Sel ;
      AV87Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc = AV30TFFase_Dsc ;
      AV88Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel = AV31TFFase_Dsc_Sel ;
      AV89Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod = AV32TFMaqCod ;
      AV90Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel = AV33TFMaqCod_Sel ;
      AV91Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc = AV34TFMaqDsc ;
      AV92Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel = AV35TFMaqDsc_Sel ;
      AV93Produccion_consultadeproduccion_partesproduccionds_15_tfgruopecod = AV38TFGruOpeCod ;
      AV94Produccion_consultadeproduccion_partesproduccionds_16_tfgruopecod_to = AV39TFGruOpeCod_To ;
      AV95Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre = AV36TFGruopecod_Nombre ;
      AV96Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel = AV37TFGruopecod_Nombre_Sel ;
      AV97Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr = AV40TFHisProKgr ;
      AV98Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to = AV41TFHisProKgr_To ;
      AV99Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr = AV42TFHisProMtr ;
      AV100Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to = AV43TFHisProMtr_To ;
      AV101Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti = AV44TFHisProDTI ;
      AV102Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf = AV48TFHisProDTF ;
      AV103Produccion_consultadeproduccion_partesproduccionds_25_tfparcod = AV52TFParCod ;
      AV104Produccion_consultadeproduccion_partesproduccionds_26_tfparcod_to = AV53TFParCod_To ;
      AV105Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom = AV54TFParCodNom ;
      AV106Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel = AV55TFParCodNom_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV20ColumnsSelector, AV60EmprCod, AV61BarCod, AV62BarCodReo, AV63BarCodPar, AV26TFBarOrdLin, AV27TFBarOrdLin_To, AV28TFFase, AV29TFFase_Sel, AV30TFFase_Dsc, AV31TFFase_Dsc_Sel, AV32TFMaqCod, AV33TFMaqCod_Sel, AV34TFMaqDsc, AV35TFMaqDsc_Sel, AV38TFGruOpeCod, AV39TFGruOpeCod_To, AV36TFGruopecod_Nombre, AV37TFGruopecod_Nombre_Sel, AV40TFHisProKgr, AV41TFHisProKgr_To, AV42TFHisProMtr, AV43TFHisProMtr_To, AV44TFHisProDTI, AV48TFHisProDTF, AV52TFParCod, AV53TFParCod_To, AV54TFParCodNom, AV55TFParCodNom_Sel, AV75Pgmname, AV12OrderedBy, AV13OrderedDsc, AV66CliCod, AV67CliNom, AV68PedidoCliente, AV69BarSer, AV70BarSerDsc, AV71BarColNom, AV72BarColNum, AV79Produccion_consultadeproduccion_partesproduccionds_1_emprcod, AV80Produccion_consultadeproduccion_partesproduccionds_2_barcod, AV81Produccion_consultadeproduccion_partesproduccionds_3_barcodreo, AV82Produccion_consultadeproduccion_partesproduccionds_4_barcodpar, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV79Produccion_consultadeproduccion_partesproduccionds_1_emprcod = AV60EmprCod ;
      AV80Produccion_consultadeproduccion_partesproduccionds_2_barcod = AV61BarCod ;
      AV81Produccion_consultadeproduccion_partesproduccionds_3_barcodreo = AV62BarCodReo ;
      AV82Produccion_consultadeproduccion_partesproduccionds_4_barcodpar = AV63BarCodPar ;
      AV83Produccion_consultadeproduccion_partesproduccionds_5_tfbarordlin = AV26TFBarOrdLin ;
      AV84Produccion_consultadeproduccion_partesproduccionds_6_tfbarordlin_to = AV27TFBarOrdLin_To ;
      AV85Produccion_consultadeproduccion_partesproduccionds_7_tffase = AV28TFFase ;
      AV86Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel = AV29TFFase_Sel ;
      AV87Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc = AV30TFFase_Dsc ;
      AV88Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel = AV31TFFase_Dsc_Sel ;
      AV89Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod = AV32TFMaqCod ;
      AV90Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel = AV33TFMaqCod_Sel ;
      AV91Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc = AV34TFMaqDsc ;
      AV92Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel = AV35TFMaqDsc_Sel ;
      AV93Produccion_consultadeproduccion_partesproduccionds_15_tfgruopecod = AV38TFGruOpeCod ;
      AV94Produccion_consultadeproduccion_partesproduccionds_16_tfgruopecod_to = AV39TFGruOpeCod_To ;
      AV95Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre = AV36TFGruopecod_Nombre ;
      AV96Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel = AV37TFGruopecod_Nombre_Sel ;
      AV97Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr = AV40TFHisProKgr ;
      AV98Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to = AV41TFHisProKgr_To ;
      AV99Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr = AV42TFHisProMtr ;
      AV100Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to = AV43TFHisProMtr_To ;
      AV101Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti = AV44TFHisProDTI ;
      AV102Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf = AV48TFHisProDTF ;
      AV103Produccion_consultadeproduccion_partesproduccionds_25_tfparcod = AV52TFParCod ;
      AV104Produccion_consultadeproduccion_partesproduccionds_26_tfparcod_to = AV53TFParCod_To ;
      AV105Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom = AV54TFParCodNom ;
      AV106Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel = AV55TFParCodNom_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV20ColumnsSelector, AV60EmprCod, AV61BarCod, AV62BarCodReo, AV63BarCodPar, AV26TFBarOrdLin, AV27TFBarOrdLin_To, AV28TFFase, AV29TFFase_Sel, AV30TFFase_Dsc, AV31TFFase_Dsc_Sel, AV32TFMaqCod, AV33TFMaqCod_Sel, AV34TFMaqDsc, AV35TFMaqDsc_Sel, AV38TFGruOpeCod, AV39TFGruOpeCod_To, AV36TFGruopecod_Nombre, AV37TFGruopecod_Nombre_Sel, AV40TFHisProKgr, AV41TFHisProKgr_To, AV42TFHisProMtr, AV43TFHisProMtr_To, AV44TFHisProDTI, AV48TFHisProDTF, AV52TFParCod, AV53TFParCod_To, AV54TFParCodNom, AV55TFParCodNom_Sel, AV75Pgmname, AV12OrderedBy, AV13OrderedDsc, AV66CliCod, AV67CliNom, AV68PedidoCliente, AV69BarSer, AV70BarSerDsc, AV71BarColNom, AV72BarColNum, AV79Produccion_consultadeproduccion_partesproduccionds_1_emprcod, AV80Produccion_consultadeproduccion_partesproduccionds_2_barcod, AV81Produccion_consultadeproduccion_partesproduccionds_3_barcodreo, AV82Produccion_consultadeproduccion_partesproduccionds_4_barcodpar, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV75Pgmname = "Produccion.ConsultadeProduccion_PartesProduccion" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75Pgmname", AV75Pgmname);
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
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1RZ0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e171RZ2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV56DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV20ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_87 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_87"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV58GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV59GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV60EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV60EmprCod") ;
         wcpOAV61BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV61BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV62BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV62BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV63BarCodPar = httpContext.cgiGet( sPrefix+"wcpOAV63BarCodPar") ;
         wcpOAV66CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV66CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV67CliNom = httpContext.cgiGet( sPrefix+"wcpOAV67CliNom") ;
         wcpOAV68PedidoCliente = httpContext.cgiGet( sPrefix+"wcpOAV68PedidoCliente") ;
         wcpOAV69BarSer = httpContext.cgiGet( sPrefix+"wcpOAV69BarSer") ;
         wcpOAV70BarSerDsc = httpContext.cgiGet( sPrefix+"wcpOAV70BarSerDsc") ;
         wcpOAV71BarColNom = httpContext.cgiGet( sPrefix+"wcpOAV71BarColNom") ;
         wcpOAV72BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV72BarColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         AV75Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75Pgmname", AV75Pgmname);
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A130BarCodPar", A130BarCodPar);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_hisprodtiauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_HISPRODTIAUXDATE");
            GX_FocusControl = edtavDdo_hisprodtiauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV46DDO_HisProDTIAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46DDO_HisProDTIAuxDate", localUtil.format(AV46DDO_HisProDTIAuxDate, "99/99/99"));
         }
         else
         {
            AV46DDO_HisProDTIAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_hisprodtiauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46DDO_HisProDTIAuxDate", localUtil.format(AV46DDO_HisProDTIAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_hisprodtfauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_HISPRODTFAUXDATE");
            GX_FocusControl = edtavDdo_hisprodtfauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV50DDO_HisProDTFAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50DDO_HisProDTFAuxDate", localUtil.format(AV50DDO_HisProDTFAuxDate, "99/99/99"));
         }
         else
         {
            AV50DDO_HisProDTFAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_hisprodtfauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50DDO_HisProDTFAuxDate", localUtil.format(AV50DDO_HisProDTFAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ConsultadeProduccion_PartesProduccion");
         AV75Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75Pgmname", AV75Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV75Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("produccion\\consultadeproduccion_partesproduccion:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e171RZ2 ();
      if (returnInSub) return;
   }

   public void e171RZ2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV76Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      consultadeproduccion_partesproduccion_impl.this.GXt_char1 = GXv_char2[0] ;
      AV76Station = GXt_char1 ;
      GXv_char2[0] = AV60EmprCod ;
      GXv_char3[0] = AV77Emprnom ;
      GXv_char4[0] = AV78Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV76Station, GXv_char2, GXv_char3, GXv_char4) ;
      consultadeproduccion_partesproduccion_impl.this.AV60EmprCod = GXv_char2[0] ;
      consultadeproduccion_partesproduccion_impl.this.AV77Emprnom = GXv_char3[0] ;
      consultadeproduccion_partesproduccion_impl.this.AV78Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60EmprCod", AV60EmprCod);
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
      edtBarCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Visible), 5, 0), true);
      edtBarCodReo_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarCodReo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Visible), 5, 0), true);
      edtBarCodPar_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarCodPar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Visible), 5, 0), true);
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV56DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV56DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e181RZ2( )
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
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV22Session.getValue("Produccion.ConsultadeProduccion_PartesProduccionColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV22Session.getValue("Produccion.ConsultadeProduccion_PartesProduccionColumnsSelector") ;
         AV20ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S152 ();
         if (returnInSub) return;
      }
      edtBarOrdLin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarOrdLin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarOrdLin_Visible), 5, 0), !bGXsfl_87_Refreshing);
      edtFase_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFase_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFase_Visible), 5, 0), !bGXsfl_87_Refreshing);
      edtFase_Dsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFase_Dsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFase_Dsc_Visible), 5, 0), !bGXsfl_87_Refreshing);
      edtMaqCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMaqCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Visible), 5, 0), !bGXsfl_87_Refreshing);
      edtMaqDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMaqDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqDsc_Visible), 5, 0), !bGXsfl_87_Refreshing);
      edtGruOpeCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtGruOpeCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGruOpeCod_Visible), 5, 0), !bGXsfl_87_Refreshing);
      edtGruopecod__Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtGruopecod__Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGruopecod__Visible), 5, 0), !bGXsfl_87_Refreshing);
      edtHisProKgr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisProKgr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProKgr_Visible), 5, 0), !bGXsfl_87_Refreshing);
      edtHisProMtr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisProMtr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProMtr_Visible), 5, 0), !bGXsfl_87_Refreshing);
      edtHisProDTI_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisProDTI_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProDTI_Visible), 5, 0), !bGXsfl_87_Refreshing);
      edtHisProDTF_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisProDTF_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProDTF_Visible), 5, 0), !bGXsfl_87_Refreshing);
      edtParCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtParCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParCod_Visible), 5, 0), !bGXsfl_87_Refreshing);
      edtParCodNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtParCodNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParCodNom_Visible), 5, 0), !bGXsfl_87_Refreshing);
      AV58GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58GridCurrentPage), 10, 0));
      AV59GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59GridPageCount), 10, 0));
      AV79Produccion_consultadeproduccion_partesproduccionds_1_emprcod = AV60EmprCod ;
      AV80Produccion_consultadeproduccion_partesproduccionds_2_barcod = AV61BarCod ;
      AV81Produccion_consultadeproduccion_partesproduccionds_3_barcodreo = AV62BarCodReo ;
      AV82Produccion_consultadeproduccion_partesproduccionds_4_barcodpar = AV63BarCodPar ;
      AV83Produccion_consultadeproduccion_partesproduccionds_5_tfbarordlin = AV26TFBarOrdLin ;
      AV84Produccion_consultadeproduccion_partesproduccionds_6_tfbarordlin_to = AV27TFBarOrdLin_To ;
      AV85Produccion_consultadeproduccion_partesproduccionds_7_tffase = AV28TFFase ;
      AV86Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel = AV29TFFase_Sel ;
      AV87Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc = AV30TFFase_Dsc ;
      AV88Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel = AV31TFFase_Dsc_Sel ;
      AV89Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod = AV32TFMaqCod ;
      AV90Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel = AV33TFMaqCod_Sel ;
      AV91Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc = AV34TFMaqDsc ;
      AV92Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel = AV35TFMaqDsc_Sel ;
      AV93Produccion_consultadeproduccion_partesproduccionds_15_tfgruopecod = AV38TFGruOpeCod ;
      AV94Produccion_consultadeproduccion_partesproduccionds_16_tfgruopecod_to = AV39TFGruOpeCod_To ;
      AV95Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre = AV36TFGruopecod_Nombre ;
      AV96Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel = AV37TFGruopecod_Nombre_Sel ;
      AV97Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr = AV40TFHisProKgr ;
      AV98Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to = AV41TFHisProKgr_To ;
      AV99Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr = AV42TFHisProMtr ;
      AV100Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to = AV43TFHisProMtr_To ;
      AV101Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti = AV44TFHisProDTI ;
      AV102Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf = AV48TFHisProDTF ;
      AV103Produccion_consultadeproduccion_partesproduccionds_25_tfparcod = AV52TFParCod ;
      AV104Produccion_consultadeproduccion_partesproduccionds_26_tfparcod_to = AV53TFParCod_To ;
      AV105Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom = AV54TFParCodNom ;
      AV106Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel = AV55TFParCodNom_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
   }

   public void e111RZ2( )
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
         AV57PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV57PageToGo) ;
      }
   }

   public void e121RZ2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e131RZ2( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarOrdLin") == 0 )
         {
            AV26TFBarOrdLin = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFBarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFBarOrdLin), 4, 0));
            AV27TFBarOrdLin_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFBarOrdLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFBarOrdLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Fase") == 0 )
         {
            AV28TFFase = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFFase", AV28TFFase);
            AV29TFFase_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFFase_Sel", AV29TFFase_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Fase_Dsc") == 0 )
         {
            AV30TFFase_Dsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFFase_Dsc", AV30TFFase_Dsc);
            AV31TFFase_Dsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFFase_Dsc_Sel", AV31TFFase_Dsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MaqCod") == 0 )
         {
            AV32TFMaqCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFMaqCod", AV32TFMaqCod);
            AV33TFMaqCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFMaqCod_Sel", AV33TFMaqCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MaqDsc") == 0 )
         {
            AV34TFMaqDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFMaqDsc", AV34TFMaqDsc);
            AV35TFMaqDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFMaqDsc_Sel", AV35TFMaqDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "GruOpeCod") == 0 )
         {
            AV38TFGruOpeCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFGruOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TFGruOpeCod), 6, 0));
            AV39TFGruOpeCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFGruOpeCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39TFGruOpeCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Gruopecod_Nombre") == 0 )
         {
            AV36TFGruopecod_Nombre = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFGruopecod_Nombre", AV36TFGruopecod_Nombre);
            AV37TFGruopecod_Nombre_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFGruopecod_Nombre_Sel", AV37TFGruopecod_Nombre_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProKgr") == 0 )
         {
            AV40TFHisProKgr = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFHisProKgr", GXutil.ltrimstr( AV40TFHisProKgr, 9, 2));
            AV41TFHisProKgr_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFHisProKgr_To", GXutil.ltrimstr( AV41TFHisProKgr_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProMtr") == 0 )
         {
            AV42TFHisProMtr = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFHisProMtr", GXutil.ltrimstr( AV42TFHisProMtr, 9, 2));
            AV43TFHisProMtr_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFHisProMtr_To", GXutil.ltrimstr( AV43TFHisProMtr_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProDTI") == 0 )
         {
            AV44TFHisProDTI = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFHisProDTI", localUtil.ttoc( AV44TFHisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProDTF") == 0 )
         {
            AV48TFHisProDTF = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFHisProDTF", localUtil.ttoc( AV48TFHisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ParCod") == 0 )
         {
            AV52TFParCod = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52TFParCod), 4, 0));
            AV53TFParCod_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFParCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53TFParCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ParCodNom") == 0 )
         {
            AV54TFParCodNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFParCodNom", AV54TFParCodNom);
            AV55TFParCodNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFParCodNom_Sel", AV55TFParCodNom_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e191RZ2( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(87) ;
         }
         sendrow_872( ) ;
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
      if ( isFullAjaxMode( ) && ! bGXsfl_87_Refreshing )
      {
         httpContext.doAjaxLoad(87, GridRow);
      }
   }

   public void e141RZ2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV18ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV20ColumnsSelector.fromJSonString(AV18ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "Produccion.ConsultadeProduccion_PartesProduccionColumnsSelector", ((GXutil.strcmp("", AV18ColumnsSelectorXML)==0) ? "" : AV20ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
   }

   public void e151RZ2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      AV65Var_Hdr = AV60EmprCod + GXutil.str( AV61BarCod, 8, 0) + GXutil.str( AV62BarCodReo, 1, 0) + AV63BarCodPar ;
      AV64WebSession.setValue("&Var_Hdr", AV65Var_Hdr);
      GXv_char4[0] = AV16ExcelFilename ;
      GXv_char3[0] = AV17ErrorMessage ;
      new app.produccion.consultadeproduccion_partesproduccionexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      consultadeproduccion_partesproduccion_impl.this.AV16ExcelFilename = GXv_char4[0] ;
      consultadeproduccion_partesproduccion_impl.this.AV17ErrorMessage = GXv_char3[0] ;
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

   public void e161RZ2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      AV65Var_Hdr = AV60EmprCod + GXutil.str( AV61BarCod, 8, 0) + GXutil.str( AV62BarCodReo, 1, 0) + AV63BarCodPar ;
      AV64WebSession.setValue("&Var_Hdr", AV65Var_Hdr);
      callWebObject(formatLink("app.produccion.consultadeproduccion_partesproduccionexportcsv", new String[] {}, new String[] {}) );
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
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarOrdLin", "", "Orden", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Fase", "", "Fase", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Fase_Dsc", "", "Descripcion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MaqCod", "", "Código Máquina", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MaqDsc", "", "Descripcion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "GruOpeCod", "", "Operario", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Gruopecod_Nombre", "", "Nombre", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HisProKgr", "", "Kilos", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HisProMtr", "", "Metros", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HisProDTI", "", "Inicio", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HisProDTF", "", "Fin", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ParCod", "", "Paro", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ParCodNom", "", "Descripcion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV19UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Produccion.ConsultadeProduccion_PartesProduccionColumnsSelector", GXv_char4) ;
      consultadeproduccion_partesproduccion_impl.this.GXt_char1 = GXv_char4[0] ;
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

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue(AV75Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV75Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV75Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S132 ();
      if (returnInSub) return;
      AV107GXV1 = 1 ;
      while ( AV107GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV107GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARORDLIN") == 0 )
         {
            AV26TFBarOrdLin = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFBarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFBarOrdLin), 4, 0));
            AV27TFBarOrdLin_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFBarOrdLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFBarOrdLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE") == 0 )
         {
            AV28TFFase = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFFase", AV28TFFase);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE_SEL") == 0 )
         {
            AV29TFFase_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFFase_Sel", AV29TFFase_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE_DSC") == 0 )
         {
            AV30TFFase_Dsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFFase_Dsc", AV30TFFase_Dsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE_DSC_SEL") == 0 )
         {
            AV31TFFase_Dsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFFase_Dsc_Sel", AV31TFFase_Dsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV32TFMaqCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFMaqCod", AV32TFMaqCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV33TFMaqCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFMaqCod_Sel", AV33TFMaqCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC") == 0 )
         {
            AV34TFMaqDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFMaqDsc", AV34TFMaqDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC_SEL") == 0 )
         {
            AV35TFMaqDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFMaqDsc_Sel", AV35TFMaqDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGRUOPECOD") == 0 )
         {
            AV38TFGruOpeCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFGruOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TFGruOpeCod), 6, 0));
            AV39TFGruOpeCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFGruOpeCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39TFGruOpeCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGRUOPECOD_NOMBRE") == 0 )
         {
            AV36TFGruopecod_Nombre = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFGruopecod_Nombre", AV36TFGruopecod_Nombre);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGRUOPECOD_NOMBRE_SEL") == 0 )
         {
            AV37TFGruopecod_Nombre_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFGruopecod_Nombre_Sel", AV37TFGruopecod_Nombre_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROKGR") == 0 )
         {
            AV40TFHisProKgr = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFHisProKgr", GXutil.ltrimstr( AV40TFHisProKgr, 9, 2));
            AV41TFHisProKgr_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFHisProKgr_To", GXutil.ltrimstr( AV41TFHisProKgr_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROMTR") == 0 )
         {
            AV42TFHisProMtr = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFHisProMtr", GXutil.ltrimstr( AV42TFHisProMtr, 9, 2));
            AV43TFHisProMtr_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFHisProMtr_To", GXutil.ltrimstr( AV43TFHisProMtr_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTI") == 0 )
         {
            AV44TFHisProDTI = localUtil.ctot( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFHisProDTI", localUtil.ttoc( AV44TFHisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV46DDO_HisProDTIAuxDate = GXutil.resetTime(AV44TFHisProDTI) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46DDO_HisProDTIAuxDate", localUtil.format(AV46DDO_HisProDTIAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTF") == 0 )
         {
            AV48TFHisProDTF = localUtil.ctot( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFHisProDTF", localUtil.ttoc( AV48TFHisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV50DDO_HisProDTFAuxDate = GXutil.resetTime(AV48TFHisProDTF) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50DDO_HisProDTFAuxDate", localUtil.format(AV50DDO_HisProDTFAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCOD") == 0 )
         {
            AV52TFParCod = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52TFParCod), 4, 0));
            AV53TFParCod_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFParCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53TFParCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCODNOM") == 0 )
         {
            AV54TFParCodNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFParCodNom", AV54TFParCodNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCODNOM_SEL") == 0 )
         {
            AV55TFParCodNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFParCodNom_Sel", AV55TFParCodNom_Sel);
         }
         AV107GXV1 = (int)(AV107GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV29TFFase_Sel)==0), AV29TFFase_Sel, GXv_char4) ;
      consultadeproduccion_partesproduccion_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char10 = "" ;
      GXv_char3[0] = GXt_char10 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV31TFFase_Dsc_Sel)==0), AV31TFFase_Dsc_Sel, GXv_char3) ;
      consultadeproduccion_partesproduccion_impl.this.GXt_char10 = GXv_char3[0] ;
      GXt_char11 = "" ;
      GXv_char2[0] = GXt_char11 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV33TFMaqCod_Sel)==0), AV33TFMaqCod_Sel, GXv_char2) ;
      consultadeproduccion_partesproduccion_impl.this.GXt_char11 = GXv_char2[0] ;
      GXt_char12 = "" ;
      GXv_char13[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV35TFMaqDsc_Sel)==0), AV35TFMaqDsc_Sel, GXv_char13) ;
      consultadeproduccion_partesproduccion_impl.this.GXt_char12 = GXv_char13[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV37TFGruopecod_Nombre_Sel)==0), AV37TFGruopecod_Nombre_Sel, GXv_char15) ;
      consultadeproduccion_partesproduccion_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV55TFParCodNom_Sel)==0), AV55TFParCodNom_Sel, GXv_char17) ;
      consultadeproduccion_partesproduccion_impl.this.GXt_char16 = GXv_char17[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|"+GXt_char10+"|"+GXt_char11+"|"+GXt_char12+"||"+GXt_char14+"||||||"+GXt_char16 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV28TFFase)==0), AV28TFFase, GXv_char17) ;
      consultadeproduccion_partesproduccion_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV30TFFase_Dsc)==0), AV30TFFase_Dsc, GXv_char15) ;
      consultadeproduccion_partesproduccion_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char12 = "" ;
      GXv_char13[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV32TFMaqCod)==0), AV32TFMaqCod, GXv_char13) ;
      consultadeproduccion_partesproduccion_impl.this.GXt_char12 = GXv_char13[0] ;
      GXt_char11 = "" ;
      GXv_char4[0] = GXt_char11 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV34TFMaqDsc)==0), AV34TFMaqDsc, GXv_char4) ;
      consultadeproduccion_partesproduccion_impl.this.GXt_char11 = GXv_char4[0] ;
      GXt_char10 = "" ;
      GXv_char3[0] = GXt_char10 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV36TFGruopecod_Nombre)==0), AV36TFGruopecod_Nombre, GXv_char3) ;
      consultadeproduccion_partesproduccion_impl.this.GXt_char10 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV54TFParCodNom)==0), AV54TFParCodNom, GXv_char2) ;
      consultadeproduccion_partesproduccion_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV26TFBarOrdLin) ? "" : GXutil.str( AV26TFBarOrdLin, 4, 0))+"|"+GXt_char16+"|"+GXt_char14+"|"+GXt_char12+"|"+GXt_char11+"|"+((0==AV38TFGruOpeCod) ? "" : GXutil.str( AV38TFGruOpeCod, 6, 0))+"|"+GXt_char10+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFHisProKgr)==0) ? "" : GXutil.str( AV40TFHisProKgr, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFHisProMtr)==0) ? "" : GXutil.str( AV42TFHisProMtr, 9, 2))+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV44TFHisProDTI) ? "" : localUtil.dtoc( AV46DDO_HisProDTIAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV48TFHisProDTF) ? "" : localUtil.dtoc( AV50DDO_HisProDTFAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+((0==AV52TFParCod) ? "" : GXutil.str( AV52TFParCod, 4, 0))+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV27TFBarOrdLin_To) ? "" : GXutil.str( AV27TFBarOrdLin_To, 4, 0))+"|||||"+((0==AV39TFGruOpeCod_To) ? "" : GXutil.str( AV39TFGruOpeCod_To, 6, 0))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFHisProKgr_To)==0) ? "" : GXutil.str( AV41TFHisProKgr_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFHisProMtr_To)==0) ? "" : GXutil.str( AV43TFHisProMtr_To, 9, 2))+"|||"+((0==AV53TFParCod_To) ? "" : GXutil.str( AV53TFParCod_To, 4, 0))+"|" ;
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
      AV10GridState.fromxml(AV22Session.getValue(AV75Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFBARORDLIN", "", !((0==AV26TFBarOrdLin)&&(0==AV27TFBarOrdLin_To)), (short)(0), GXutil.trim( GXutil.str( AV26TFBarOrdLin, 4, 0)), GXutil.trim( GXutil.str( AV27TFBarOrdLin_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFFASE", "", !(GXutil.strcmp("", AV28TFFase)==0), (short)(0), AV28TFFase, "", !(GXutil.strcmp("", AV29TFFase_Sel)==0), AV29TFFase_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFFASE_DSC", "", !(GXutil.strcmp("", AV30TFFase_Dsc)==0), (short)(0), AV30TFFase_Dsc, "", !(GXutil.strcmp("", AV31TFFase_Dsc_Sel)==0), AV31TFFase_Dsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFMAQCOD", "", !(GXutil.strcmp("", AV32TFMaqCod)==0), (short)(0), AV32TFMaqCod, "", !(GXutil.strcmp("", AV33TFMaqCod_Sel)==0), AV33TFMaqCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFMAQDSC", "", !(GXutil.strcmp("", AV34TFMaqDsc)==0), (short)(0), AV34TFMaqDsc, "", !(GXutil.strcmp("", AV35TFMaqDsc_Sel)==0), AV35TFMaqDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFGRUOPECOD", "", !((0==AV38TFGruOpeCod)&&(0==AV39TFGruOpeCod_To)), (short)(0), GXutil.trim( GXutil.str( AV38TFGruOpeCod, 6, 0)), GXutil.trim( GXutil.str( AV39TFGruOpeCod_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFGRUOPECOD_NOMBRE", "", !(GXutil.strcmp("", AV36TFGruopecod_Nombre)==0), (short)(0), AV36TFGruopecod_Nombre, "", !(GXutil.strcmp("", AV37TFGruopecod_Nombre_Sel)==0), AV37TFGruopecod_Nombre_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFHISPROKGR", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFHisProKgr)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFHisProKgr_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV40TFHisProKgr, 9, 2)), GXutil.trim( GXutil.str( AV41TFHisProKgr_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFHISPROMTR", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFHisProMtr)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFHisProMtr_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV42TFHisProMtr, 9, 2)), GXutil.trim( GXutil.str( AV43TFHisProMtr_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFHISPRODTI", "", !GXutil.dateCompare(GXutil.nullDate(), AV44TFHisProDTI), (short)(0), GXutil.trim( localUtil.ttoc( AV44TFHisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFHISPRODTF", "", !GXutil.dateCompare(GXutil.nullDate(), AV48TFHisProDTF), (short)(0), GXutil.trim( localUtil.ttoc( AV48TFHisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFPARCOD", "", !((0==AV52TFParCod)&&(0==AV53TFParCod_To)), (short)(0), GXutil.trim( GXutil.str( AV52TFParCod, 4, 0)), GXutil.trim( GXutil.str( AV53TFParCod_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFPARCODNOM", "", !(GXutil.strcmp("", AV54TFParCodNom)==0), (short)(0), AV54TFParCodNom, "", !(GXutil.strcmp("", AV55TFParCodNom_Sel)==0), AV55TFParCodNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      if ( ! (GXutil.strcmp("", AV60EmprCod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV60EmprCod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV61BarCod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV61BarCod, 8, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV62BarCodReo) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODREO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV62BarCodReo, 1, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV63BarCodPar)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODPAR" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV63BarCodPar );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV66CliCod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV66CliCod, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV67CliNom)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLINOM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV67CliNom );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV68PedidoCliente)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PEDIDOCLIENTE" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV68PedidoCliente );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV69BarSer)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARSER" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV69BarSer );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV70BarSerDsc)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARSERDSC" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV70BarSerDsc );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV71BarColNom)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOLNOM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV71BarColNom );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV72BarColNum) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOLNUM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV72BarColNum, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV75Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV75Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "Produccion.ParteProduccion_TRN" );
      AV9TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "EmprCod" );
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( AV60EmprCod );
      AV8TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV9TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "BarCod" );
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( GXutil.str( AV61BarCod, 8, 0) );
      AV8TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV9TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "BarCodReo" );
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( GXutil.str( AV62BarCodReo, 1, 0) );
      AV8TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV9TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "BarCodPar" );
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( AV63BarCodPar );
      AV8TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_76_1RZ2( boolean wbgen )
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
         wb_table1_76_1RZ2e( true) ;
      }
      else
      {
         wb_table1_76_1RZ2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV60EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60EmprCod", AV60EmprCod);
      AV61BarCod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61BarCod), 8, 0));
      AV62BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62BarCodReo", GXutil.str( AV62BarCodReo, 1, 0));
      AV63BarCodPar = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63BarCodPar", AV63BarCodPar);
      AV66CliCod = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66CliCod), 6, 0));
      AV67CliNom = (String)getParm(obj,5,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67CliNom", AV67CliNom);
      AV68PedidoCliente = (String)getParm(obj,6,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68PedidoCliente", AV68PedidoCliente);
      AV69BarSer = (String)getParm(obj,7,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69BarSer", AV69BarSer);
      AV70BarSerDsc = (String)getParm(obj,8,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70BarSerDsc", AV70BarSerDsc);
      AV71BarColNom = (String)getParm(obj,9,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71BarColNom", AV71BarColNom);
      AV72BarColNum = ((Number) GXutil.testNumericType( getParm(obj,10,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72BarColNum), 6, 0));
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
      pa1RZ2( ) ;
      ws1RZ2( ) ;
      we1RZ2( ) ;
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
      sCtrlAV60EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV61BarCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV62BarCodReo = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV63BarCodPar = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV66CliCod = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV67CliNom = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV68PedidoCliente = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV69BarSer = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV70BarSerDsc = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV71BarColNom = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV72BarColNum = (String)getParm(obj,10,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1RZ2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "produccion\\consultadeproduccion_partesproduccion", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1RZ2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV60EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60EmprCod", AV60EmprCod);
         AV61BarCod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61BarCod), 8, 0));
         AV62BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62BarCodReo", GXutil.str( AV62BarCodReo, 1, 0));
         AV63BarCodPar = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63BarCodPar", AV63BarCodPar);
         AV66CliCod = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66CliCod), 6, 0));
         AV67CliNom = (String)getParm(obj,7,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67CliNom", AV67CliNom);
         AV68PedidoCliente = (String)getParm(obj,8,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68PedidoCliente", AV68PedidoCliente);
         AV69BarSer = (String)getParm(obj,9,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69BarSer", AV69BarSer);
         AV70BarSerDsc = (String)getParm(obj,10,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70BarSerDsc", AV70BarSerDsc);
         AV71BarColNom = (String)getParm(obj,11,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71BarColNom", AV71BarColNom);
         AV72BarColNum = ((Number) GXutil.testNumericType( getParm(obj,12,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72BarColNum), 6, 0));
      }
      wcpOAV60EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV60EmprCod") ;
      wcpOAV61BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV61BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV62BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV62BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV63BarCodPar = httpContext.cgiGet( sPrefix+"wcpOAV63BarCodPar") ;
      wcpOAV66CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV66CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV67CliNom = httpContext.cgiGet( sPrefix+"wcpOAV67CliNom") ;
      wcpOAV68PedidoCliente = httpContext.cgiGet( sPrefix+"wcpOAV68PedidoCliente") ;
      wcpOAV69BarSer = httpContext.cgiGet( sPrefix+"wcpOAV69BarSer") ;
      wcpOAV70BarSerDsc = httpContext.cgiGet( sPrefix+"wcpOAV70BarSerDsc") ;
      wcpOAV71BarColNom = httpContext.cgiGet( sPrefix+"wcpOAV71BarColNom") ;
      wcpOAV72BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV72BarColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV60EmprCod, wcpOAV60EmprCod) != 0 ) || ( AV61BarCod != wcpOAV61BarCod ) || ( AV62BarCodReo != wcpOAV62BarCodReo ) || ( GXutil.strcmp(AV63BarCodPar, wcpOAV63BarCodPar) != 0 ) || ( AV66CliCod != wcpOAV66CliCod ) || ( GXutil.strcmp(AV67CliNom, wcpOAV67CliNom) != 0 ) || ( GXutil.strcmp(AV68PedidoCliente, wcpOAV68PedidoCliente) != 0 ) || ( GXutil.strcmp(AV69BarSer, wcpOAV69BarSer) != 0 ) || ( GXutil.strcmp(AV70BarSerDsc, wcpOAV70BarSerDsc) != 0 ) || ( GXutil.strcmp(AV71BarColNom, wcpOAV71BarColNom) != 0 ) || ( AV72BarColNum != wcpOAV72BarColNum ) ) )
      {
         setjustcreated();
      }
      wcpOAV60EmprCod = AV60EmprCod ;
      wcpOAV61BarCod = AV61BarCod ;
      wcpOAV62BarCodReo = AV62BarCodReo ;
      wcpOAV63BarCodPar = AV63BarCodPar ;
      wcpOAV66CliCod = AV66CliCod ;
      wcpOAV67CliNom = AV67CliNom ;
      wcpOAV68PedidoCliente = AV68PedidoCliente ;
      wcpOAV69BarSer = AV69BarSer ;
      wcpOAV70BarSerDsc = AV70BarSerDsc ;
      wcpOAV71BarColNom = AV71BarColNom ;
      wcpOAV72BarColNum = AV72BarColNum ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV60EmprCod = httpContext.cgiGet( sPrefix+"AV60EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV60EmprCod) > 0 )
      {
         AV60EmprCod = httpContext.cgiGet( sCtrlAV60EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60EmprCod", AV60EmprCod);
      }
      else
      {
         AV60EmprCod = httpContext.cgiGet( sPrefix+"AV60EmprCod_PARM") ;
      }
      sCtrlAV61BarCod = httpContext.cgiGet( sPrefix+"AV61BarCod_CTRL") ;
      if ( GXutil.len( sCtrlAV61BarCod) > 0 )
      {
         AV61BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV61BarCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61BarCod), 8, 0));
      }
      else
      {
         AV61BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV61BarCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV62BarCodReo = httpContext.cgiGet( sPrefix+"AV62BarCodReo_CTRL") ;
      if ( GXutil.len( sCtrlAV62BarCodReo) > 0 )
      {
         AV62BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV62BarCodReo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62BarCodReo", GXutil.str( AV62BarCodReo, 1, 0));
      }
      else
      {
         AV62BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV62BarCodReo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV63BarCodPar = httpContext.cgiGet( sPrefix+"AV63BarCodPar_CTRL") ;
      if ( GXutil.len( sCtrlAV63BarCodPar) > 0 )
      {
         AV63BarCodPar = httpContext.cgiGet( sCtrlAV63BarCodPar) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63BarCodPar", AV63BarCodPar);
      }
      else
      {
         AV63BarCodPar = httpContext.cgiGet( sPrefix+"AV63BarCodPar_PARM") ;
      }
      sCtrlAV66CliCod = httpContext.cgiGet( sPrefix+"AV66CliCod_CTRL") ;
      if ( GXutil.len( sCtrlAV66CliCod) > 0 )
      {
         AV66CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV66CliCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66CliCod), 6, 0));
      }
      else
      {
         AV66CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV66CliCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV67CliNom = httpContext.cgiGet( sPrefix+"AV67CliNom_CTRL") ;
      if ( GXutil.len( sCtrlAV67CliNom) > 0 )
      {
         AV67CliNom = httpContext.cgiGet( sCtrlAV67CliNom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67CliNom", AV67CliNom);
      }
      else
      {
         AV67CliNom = httpContext.cgiGet( sPrefix+"AV67CliNom_PARM") ;
      }
      sCtrlAV68PedidoCliente = httpContext.cgiGet( sPrefix+"AV68PedidoCliente_CTRL") ;
      if ( GXutil.len( sCtrlAV68PedidoCliente) > 0 )
      {
         AV68PedidoCliente = httpContext.cgiGet( sCtrlAV68PedidoCliente) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68PedidoCliente", AV68PedidoCliente);
      }
      else
      {
         AV68PedidoCliente = httpContext.cgiGet( sPrefix+"AV68PedidoCliente_PARM") ;
      }
      sCtrlAV69BarSer = httpContext.cgiGet( sPrefix+"AV69BarSer_CTRL") ;
      if ( GXutil.len( sCtrlAV69BarSer) > 0 )
      {
         AV69BarSer = httpContext.cgiGet( sCtrlAV69BarSer) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69BarSer", AV69BarSer);
      }
      else
      {
         AV69BarSer = httpContext.cgiGet( sPrefix+"AV69BarSer_PARM") ;
      }
      sCtrlAV70BarSerDsc = httpContext.cgiGet( sPrefix+"AV70BarSerDsc_CTRL") ;
      if ( GXutil.len( sCtrlAV70BarSerDsc) > 0 )
      {
         AV70BarSerDsc = httpContext.cgiGet( sCtrlAV70BarSerDsc) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70BarSerDsc", AV70BarSerDsc);
      }
      else
      {
         AV70BarSerDsc = httpContext.cgiGet( sPrefix+"AV70BarSerDsc_PARM") ;
      }
      sCtrlAV71BarColNom = httpContext.cgiGet( sPrefix+"AV71BarColNom_CTRL") ;
      if ( GXutil.len( sCtrlAV71BarColNom) > 0 )
      {
         AV71BarColNom = httpContext.cgiGet( sCtrlAV71BarColNom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71BarColNom", AV71BarColNom);
      }
      else
      {
         AV71BarColNom = httpContext.cgiGet( sPrefix+"AV71BarColNom_PARM") ;
      }
      sCtrlAV72BarColNum = httpContext.cgiGet( sPrefix+"AV72BarColNum_CTRL") ;
      if ( GXutil.len( sCtrlAV72BarColNum) > 0 )
      {
         AV72BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV72BarColNum), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72BarColNum), 6, 0));
      }
      else
      {
         AV72BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV72BarColNum_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa1RZ2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1RZ2( ) ;
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
      ws1RZ2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV60EmprCod_PARM", GXutil.rtrim( AV60EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV60EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV60EmprCod_CTRL", GXutil.rtrim( sCtrlAV60EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV61BarCod_PARM", GXutil.ltrim( localUtil.ntoc( AV61BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV61BarCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV61BarCod_CTRL", GXutil.rtrim( sCtrlAV61BarCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV62BarCodReo_PARM", GXutil.ltrim( localUtil.ntoc( AV62BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV62BarCodReo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV62BarCodReo_CTRL", GXutil.rtrim( sCtrlAV62BarCodReo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV63BarCodPar_PARM", GXutil.rtrim( AV63BarCodPar));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV63BarCodPar)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV63BarCodPar_CTRL", GXutil.rtrim( sCtrlAV63BarCodPar));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV66CliCod_PARM", GXutil.ltrim( localUtil.ntoc( AV66CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV66CliCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV66CliCod_CTRL", GXutil.rtrim( sCtrlAV66CliCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV67CliNom_PARM", GXutil.rtrim( AV67CliNom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV67CliNom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV67CliNom_CTRL", GXutil.rtrim( sCtrlAV67CliNom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV68PedidoCliente_PARM", GXutil.rtrim( AV68PedidoCliente));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV68PedidoCliente)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV68PedidoCliente_CTRL", GXutil.rtrim( sCtrlAV68PedidoCliente));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV69BarSer_PARM", GXutil.rtrim( AV69BarSer));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV69BarSer)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV69BarSer_CTRL", GXutil.rtrim( sCtrlAV69BarSer));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV70BarSerDsc_PARM", GXutil.rtrim( AV70BarSerDsc));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV70BarSerDsc)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV70BarSerDsc_CTRL", GXutil.rtrim( sCtrlAV70BarSerDsc));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV71BarColNom_PARM", GXutil.rtrim( AV71BarColNom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV71BarColNom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV71BarColNom_CTRL", GXutil.rtrim( sCtrlAV71BarColNom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV72BarColNum_PARM", GXutil.ltrim( localUtil.ntoc( AV72BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV72BarColNum)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV72BarColNum_CTRL", GXutil.rtrim( sCtrlAV72BarColNum));
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
      we1RZ2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211556069", true, true);
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
      httpContext.AddJavascriptSource("produccion/consultadeproduccion_partesproduccion.js", "?20268211556070", false, true);
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

   public void subsflControlProps_872( )
   {
      edtBarOrdLin_Internalname = sPrefix+"BARORDLIN_"+sGXsfl_87_idx ;
      edtFase_Internalname = sPrefix+"FASE_"+sGXsfl_87_idx ;
      edtFase_Dsc_Internalname = sPrefix+"FASE_DSC_"+sGXsfl_87_idx ;
      edtMaqCod_Internalname = sPrefix+"MAQCOD_"+sGXsfl_87_idx ;
      edtMaqDsc_Internalname = sPrefix+"MAQDSC_"+sGXsfl_87_idx ;
      edtGruOpeCod_Internalname = sPrefix+"GRUOPECOD_"+sGXsfl_87_idx ;
      edtGruopecod__Internalname = sPrefix+"GRUOPECOD__"+sGXsfl_87_idx ;
      edtHisProKgr_Internalname = sPrefix+"HISPROKGR_"+sGXsfl_87_idx ;
      edtHisProMtr_Internalname = sPrefix+"HISPROMTR_"+sGXsfl_87_idx ;
      edtHisProDTI_Internalname = sPrefix+"HISPRODTI_"+sGXsfl_87_idx ;
      edtHisProDTF_Internalname = sPrefix+"HISPRODTF_"+sGXsfl_87_idx ;
      edtParCod_Internalname = sPrefix+"PARCOD_"+sGXsfl_87_idx ;
      edtParCodNom_Internalname = sPrefix+"PARCODNOM_"+sGXsfl_87_idx ;
   }

   public void subsflControlProps_fel_872( )
   {
      edtBarOrdLin_Internalname = sPrefix+"BARORDLIN_"+sGXsfl_87_fel_idx ;
      edtFase_Internalname = sPrefix+"FASE_"+sGXsfl_87_fel_idx ;
      edtFase_Dsc_Internalname = sPrefix+"FASE_DSC_"+sGXsfl_87_fel_idx ;
      edtMaqCod_Internalname = sPrefix+"MAQCOD_"+sGXsfl_87_fel_idx ;
      edtMaqDsc_Internalname = sPrefix+"MAQDSC_"+sGXsfl_87_fel_idx ;
      edtGruOpeCod_Internalname = sPrefix+"GRUOPECOD_"+sGXsfl_87_fel_idx ;
      edtGruopecod__Internalname = sPrefix+"GRUOPECOD__"+sGXsfl_87_fel_idx ;
      edtHisProKgr_Internalname = sPrefix+"HISPROKGR_"+sGXsfl_87_fel_idx ;
      edtHisProMtr_Internalname = sPrefix+"HISPROMTR_"+sGXsfl_87_fel_idx ;
      edtHisProDTI_Internalname = sPrefix+"HISPRODTI_"+sGXsfl_87_fel_idx ;
      edtHisProDTF_Internalname = sPrefix+"HISPRODTF_"+sGXsfl_87_fel_idx ;
      edtParCod_Internalname = sPrefix+"PARCOD_"+sGXsfl_87_fel_idx ;
      edtParCodNom_Internalname = sPrefix+"PARCODNOM_"+sGXsfl_87_fel_idx ;
   }

   public void sendrow_872( )
   {
      subsflControlProps_872( ) ;
      wb1RZ0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_87_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_87_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_87_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarOrdLin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarOrdLin_Internalname,GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarOrdLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarOrdLin_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(87),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtFase_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFase_Internalname,GXutil.rtrim( A461Fase),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtFase_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtFase_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(87),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtFase_Dsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFase_Dsc_Internalname,GXutil.rtrim( A14027Fase_Dsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtFase_Dsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtFase_Dsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(87),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMaqCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqCod_Internalname,GXutil.rtrim( A602MaqCod),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMaqCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMaqCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(87),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMaqDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqDsc_Internalname,GXutil.rtrim( A606MaqDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMaqDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMaqDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(87),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtGruOpeCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGruOpeCod_Internalname,GXutil.ltrim( localUtil.ntoc( A503GruOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A503GruOpeCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtGruOpeCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtGruOpeCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(87),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtGruopecod__Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGruopecod__Internalname,GXutil.rtrim( A14028Gruopecod_),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtGruopecod__Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtGruopecod__Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(87),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisProKgr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProKgr_Internalname,GXutil.ltrim( localUtil.ntoc( A1525HisProKgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1525HisProKgr, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisProKgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtHisProKgr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(87),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisProMtr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A1526HisProMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1526HisProMtr, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisProMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtHisProMtr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(87),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisProDTI_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProDTI_Internalname,localUtil.ttoc( A4440HisProDTI, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A4440HisProDTI, "99/99/99 99:99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisProDTI_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtHisProDTI_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(87),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisProDTF_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProDTF_Internalname,localUtil.ttoc( A4441HisProDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A4441HisProDTF, "99/99/99 99:99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisProDTF_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtHisProDTF_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(87),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtParCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParCod_Internalname,GXutil.ltrim( localUtil.ntoc( A656ParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A656ParCod), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtParCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtParCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(87),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtParCodNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParCodNom_Internalname,GXutil.rtrim( A867ParCodNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtParCodNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtParCodNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(87),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes1RZ2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_87_idx = ((subGrid_Islastpage==1)&&(nGXsfl_87_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_87_idx+1) ;
         sGXsfl_87_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_87_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_872( ) ;
      }
      /* End function sendrow_872 */
   }

   public void startgridcontrol87( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"87\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarOrdLin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Orden", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtFase_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtFase_Dsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMaqCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código Máquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMaqDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtGruOpeCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Operario", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtGruopecod__Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisProKgr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisProMtr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisProDTI_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Inicio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisProDTF_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fin", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtParCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Paro", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtParCodNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarOrdLin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A461Fase));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtFase_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14027Fase_Dsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtFase_Dsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A602MaqCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMaqCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A606MaqDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMaqDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A503GruOpeCod, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtGruOpeCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14028Gruopecod_));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtGruopecod__Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1525HisProKgr, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisProKgr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1526HisProMtr, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisProMtr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A4440HisProDTI, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisProDTI_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A4441HisProDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisProDTF_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A656ParCod, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtParCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A867ParCodNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtParCodNom_Visible, (byte)(5), (byte)(0), ".", "")));
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
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      edtavBarser_Internalname = sPrefix+"vBARSER" ;
      edtavBarserdsc_Internalname = sPrefix+"vBARSERDSC" ;
      edtavBarcolnom_Internalname = sPrefix+"vBARCOLNOM" ;
      edtavBarcolnum_Internalname = sPrefix+"vBARCOLNUM" ;
      divUnnamedtable3_Internalname = sPrefix+"UNNAMEDTABLE3" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE1" ;
      bttBtnexport_Internalname = sPrefix+"BTNEXPORT" ;
      bttBtnexportcsv_Internalname = sPrefix+"BTNEXPORTCSV" ;
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtBarOrdLin_Internalname = sPrefix+"BARORDLIN" ;
      edtFase_Internalname = sPrefix+"FASE" ;
      edtFase_Dsc_Internalname = sPrefix+"FASE_DSC" ;
      edtMaqCod_Internalname = sPrefix+"MAQCOD" ;
      edtMaqDsc_Internalname = sPrefix+"MAQDSC" ;
      edtGruOpeCod_Internalname = sPrefix+"GRUOPECOD" ;
      edtGruopecod__Internalname = sPrefix+"GRUOPECOD_" ;
      edtHisProKgr_Internalname = sPrefix+"HISPROKGR" ;
      edtHisProMtr_Internalname = sPrefix+"HISPROMTR" ;
      edtHisProDTI_Internalname = sPrefix+"HISPRODTI" ;
      edtHisProDTF_Internalname = sPrefix+"HISPRODTF" ;
      edtParCod_Internalname = sPrefix+"PARCOD" ;
      edtParCodNom_Internalname = sPrefix+"PARCODNOM" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      edtEmprCod_Internalname = sPrefix+"EMPRCOD" ;
      edtBarCod_Internalname = sPrefix+"BARCOD" ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO" ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      edtavDdo_hisprodtiauxdate_Internalname = sPrefix+"vDDO_HISPRODTIAUXDATE" ;
      divDdo_hisprodtiauxdates_Internalname = sPrefix+"DDO_HISPRODTIAUXDATES" ;
      edtavDdo_hisprodtfauxdate_Internalname = sPrefix+"vDDO_HISPRODTFAUXDATE" ;
      divDdo_hisprodtfauxdates_Internalname = sPrefix+"DDO_HISPRODTFAUXDATES" ;
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
      edtParCodNom_Jsonclick = "" ;
      edtParCod_Jsonclick = "" ;
      edtHisProDTF_Jsonclick = "" ;
      edtHisProDTI_Jsonclick = "" ;
      edtHisProMtr_Jsonclick = "" ;
      edtHisProKgr_Jsonclick = "" ;
      edtGruopecod__Jsonclick = "" ;
      edtGruOpeCod_Jsonclick = "" ;
      edtMaqDsc_Jsonclick = "" ;
      edtMaqCod_Jsonclick = "" ;
      edtFase_Dsc_Jsonclick = "" ;
      edtFase_Jsonclick = "" ;
      edtBarOrdLin_Jsonclick = "" ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtParCodNom_Visible = -1 ;
      edtParCod_Visible = -1 ;
      edtHisProDTF_Visible = -1 ;
      edtHisProDTI_Visible = -1 ;
      edtHisProMtr_Visible = -1 ;
      edtHisProKgr_Visible = -1 ;
      edtGruopecod__Visible = -1 ;
      edtGruOpeCod_Visible = -1 ;
      edtMaqDsc_Visible = -1 ;
      edtMaqCod_Visible = -1 ;
      edtFase_Dsc_Visible = -1 ;
      edtFase_Visible = -1 ;
      edtBarOrdLin_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_hisprodtfauxdate_Jsonclick = "" ;
      edtavDdo_hisprodtiauxdate_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Visible = 1 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Visible = 1 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Visible = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
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
      Ddo_grid_Datalistproc = "Produccion.ConsultadeProduccion_PartesProduccionGetFilterData" ;
      Ddo_grid_Datalisttype = "|Dynamic|Dynamic|Dynamic|Dynamic||Dynamic||||||Dynamic" ;
      Ddo_grid_Includedatalist = "|T|T|T|T||T||||||T" ;
      Ddo_grid_Filterisrange = "T|||||T||T|T|||T|" ;
      Ddo_grid_Filtertype = "Numeric|Character|Character|Character|Character|Numeric|Character|Numeric|Numeric|Date|Date|Numeric|Character" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T||T|T|T||T|T|T|T|T|T" ;
      Ddo_grid_Columnssortvalues = "1|2||3|4|5||6|7|8|9|10|11" ;
      Ddo_grid_Columnids = "0:BarOrdLin|1:Fase|2:Fase_Dsc|3:MaqCod|4:MaqDsc|5:GruOpeCod|6:Gruopecod_Nombre|7:HisProKgr|8:HisProMtr|9:HisProDTI|10:HisProDTF|11:ParCod|12:ParCodNom" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV79Produccion_consultadeproduccion_partesproduccionds_1_emprcod',fld:'vPRODUCCION_CONSULTADEPRODUCCION_PARTESPRODUCCIONDS_1_EMPRCOD',pic:'@!'},{av:'AV80Produccion_consultadeproduccion_partesproduccionds_2_barcod',fld:'vPRODUCCION_CONSULTADEPRODUCCION_PARTESPRODUCCIONDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV81Produccion_consultadeproduccion_partesproduccionds_3_barcodreo',fld:'vPRODUCCION_CONSULTADEPRODUCCION_PARTESPRODUCCIONDS_3_BARCODREO',pic:'9'},{av:'AV82Produccion_consultadeproduccion_partesproduccionds_4_barcodpar',fld:'vPRODUCCION_CONSULTADEPRODUCCION_PARTESPRODUCCIONDS_4_BARCODPAR',pic:''},{av:'sPrefix'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV60EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV61BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV62BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV63BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV26TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV27TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV28TFFase',fld:'vTFFASE',pic:''},{av:'AV29TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV30TFFase_Dsc',fld:'vTFFASE_DSC',pic:''},{av:'AV31TFFase_Dsc_Sel',fld:'vTFFASE_DSC_SEL',pic:''},{av:'AV32TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV33TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV34TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV35TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV38TFGruOpeCod',fld:'vTFGRUOPECOD',pic:'ZZZZZ9'},{av:'AV39TFGruOpeCod_To',fld:'vTFGRUOPECOD_TO',pic:'ZZZZZ9'},{av:'AV36TFGruopecod_Nombre',fld:'vTFGRUOPECOD_NOMBRE',pic:''},{av:'AV37TFGruopecod_Nombre_Sel',fld:'vTFGRUOPECOD_NOMBRE_SEL',pic:''},{av:'AV40TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV41TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV42TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV43TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV44TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV48TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV52TFParCod',fld:'vTFPARCOD',pic:'ZZZ9'},{av:'AV53TFParCod_To',fld:'vTFPARCOD_TO',pic:'ZZZ9'},{av:'AV54TFParCodNom',fld:'vTFPARCODNOM',pic:''},{av:'AV55TFParCodNom_Sel',fld:'vTFPARCODNOM_SEL',pic:''},{av:'AV75Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV66CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV67CliNom',fld:'vCLINOM',pic:''},{av:'AV68PedidoCliente',fld:'vPEDIDOCLIENTE',pic:''},{av:'AV69BarSer',fld:'vBARSER',pic:''},{av:'AV70BarSerDsc',fld:'vBARSERDSC',pic:''},{av:'AV71BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV72BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtBarOrdLin_Visible',ctrl:'BARORDLIN',prop:'Visible'},{av:'edtFase_Visible',ctrl:'FASE',prop:'Visible'},{av:'edtFase_Dsc_Visible',ctrl:'FASE_DSC',prop:'Visible'},{av:'edtMaqCod_Visible',ctrl:'MAQCOD',prop:'Visible'},{av:'edtMaqDsc_Visible',ctrl:'MAQDSC',prop:'Visible'},{av:'edtGruOpeCod_Visible',ctrl:'GRUOPECOD',prop:'Visible'},{av:'edtGruopecod__Visible',ctrl:'GRUOPECOD_',prop:'Visible'},{av:'edtHisProKgr_Visible',ctrl:'HISPROKGR',prop:'Visible'},{av:'edtHisProMtr_Visible',ctrl:'HISPROMTR',prop:'Visible'},{av:'edtHisProDTI_Visible',ctrl:'HISPRODTI',prop:'Visible'},{av:'edtHisProDTF_Visible',ctrl:'HISPRODTF',prop:'Visible'},{av:'edtParCod_Visible',ctrl:'PARCOD',prop:'Visible'},{av:'edtParCodNom_Visible',ctrl:'PARCODNOM',prop:'Visible'},{av:'AV58GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV59GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e111RZ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV60EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV61BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV62BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV63BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV26TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV27TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV28TFFase',fld:'vTFFASE',pic:''},{av:'AV29TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV30TFFase_Dsc',fld:'vTFFASE_DSC',pic:''},{av:'AV31TFFase_Dsc_Sel',fld:'vTFFASE_DSC_SEL',pic:''},{av:'AV32TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV33TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV34TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV35TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV38TFGruOpeCod',fld:'vTFGRUOPECOD',pic:'ZZZZZ9'},{av:'AV39TFGruOpeCod_To',fld:'vTFGRUOPECOD_TO',pic:'ZZZZZ9'},{av:'AV36TFGruopecod_Nombre',fld:'vTFGRUOPECOD_NOMBRE',pic:''},{av:'AV37TFGruopecod_Nombre_Sel',fld:'vTFGRUOPECOD_NOMBRE_SEL',pic:''},{av:'AV40TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV41TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV42TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV43TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV44TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV48TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV52TFParCod',fld:'vTFPARCOD',pic:'ZZZ9'},{av:'AV53TFParCod_To',fld:'vTFPARCOD_TO',pic:'ZZZ9'},{av:'AV54TFParCodNom',fld:'vTFPARCODNOM',pic:''},{av:'AV55TFParCodNom_Sel',fld:'vTFPARCODNOM_SEL',pic:''},{av:'AV75Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV66CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV67CliNom',fld:'vCLINOM',pic:''},{av:'AV68PedidoCliente',fld:'vPEDIDOCLIENTE',pic:''},{av:'AV69BarSer',fld:'vBARSER',pic:''},{av:'AV70BarSerDsc',fld:'vBARSERDSC',pic:''},{av:'AV71BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV72BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV79Produccion_consultadeproduccion_partesproduccionds_1_emprcod',fld:'vPRODUCCION_CONSULTADEPRODUCCION_PARTESPRODUCCIONDS_1_EMPRCOD',pic:'@!'},{av:'AV80Produccion_consultadeproduccion_partesproduccionds_2_barcod',fld:'vPRODUCCION_CONSULTADEPRODUCCION_PARTESPRODUCCIONDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV81Produccion_consultadeproduccion_partesproduccionds_3_barcodreo',fld:'vPRODUCCION_CONSULTADEPRODUCCION_PARTESPRODUCCIONDS_3_BARCODREO',pic:'9'},{av:'AV82Produccion_consultadeproduccion_partesproduccionds_4_barcodpar',fld:'vPRODUCCION_CONSULTADEPRODUCCION_PARTESPRODUCCIONDS_4_BARCODPAR',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e121RZ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV60EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV61BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV62BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV63BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV26TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV27TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV28TFFase',fld:'vTFFASE',pic:''},{av:'AV29TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV30TFFase_Dsc',fld:'vTFFASE_DSC',pic:''},{av:'AV31TFFase_Dsc_Sel',fld:'vTFFASE_DSC_SEL',pic:''},{av:'AV32TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV33TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV34TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV35TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV38TFGruOpeCod',fld:'vTFGRUOPECOD',pic:'ZZZZZ9'},{av:'AV39TFGruOpeCod_To',fld:'vTFGRUOPECOD_TO',pic:'ZZZZZ9'},{av:'AV36TFGruopecod_Nombre',fld:'vTFGRUOPECOD_NOMBRE',pic:''},{av:'AV37TFGruopecod_Nombre_Sel',fld:'vTFGRUOPECOD_NOMBRE_SEL',pic:''},{av:'AV40TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV41TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV42TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV43TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV44TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV48TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV52TFParCod',fld:'vTFPARCOD',pic:'ZZZ9'},{av:'AV53TFParCod_To',fld:'vTFPARCOD_TO',pic:'ZZZ9'},{av:'AV54TFParCodNom',fld:'vTFPARCODNOM',pic:''},{av:'AV55TFParCodNom_Sel',fld:'vTFPARCODNOM_SEL',pic:''},{av:'AV75Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV66CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV67CliNom',fld:'vCLINOM',pic:''},{av:'AV68PedidoCliente',fld:'vPEDIDOCLIENTE',pic:''},{av:'AV69BarSer',fld:'vBARSER',pic:''},{av:'AV70BarSerDsc',fld:'vBARSERDSC',pic:''},{av:'AV71BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV72BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV79Produccion_consultadeproduccion_partesproduccionds_1_emprcod',fld:'vPRODUCCION_CONSULTADEPRODUCCION_PARTESPRODUCCIONDS_1_EMPRCOD',pic:'@!'},{av:'AV80Produccion_consultadeproduccion_partesproduccionds_2_barcod',fld:'vPRODUCCION_CONSULTADEPRODUCCION_PARTESPRODUCCIONDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV81Produccion_consultadeproduccion_partesproduccionds_3_barcodreo',fld:'vPRODUCCION_CONSULTADEPRODUCCION_PARTESPRODUCCIONDS_3_BARCODREO',pic:'9'},{av:'AV82Produccion_consultadeproduccion_partesproduccionds_4_barcodpar',fld:'vPRODUCCION_CONSULTADEPRODUCCION_PARTESPRODUCCIONDS_4_BARCODPAR',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e131RZ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV60EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV61BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV62BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV63BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV26TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV27TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV28TFFase',fld:'vTFFASE',pic:''},{av:'AV29TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV30TFFase_Dsc',fld:'vTFFASE_DSC',pic:''},{av:'AV31TFFase_Dsc_Sel',fld:'vTFFASE_DSC_SEL',pic:''},{av:'AV32TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV33TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV34TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV35TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV38TFGruOpeCod',fld:'vTFGRUOPECOD',pic:'ZZZZZ9'},{av:'AV39TFGruOpeCod_To',fld:'vTFGRUOPECOD_TO',pic:'ZZZZZ9'},{av:'AV36TFGruopecod_Nombre',fld:'vTFGRUOPECOD_NOMBRE',pic:''},{av:'AV37TFGruopecod_Nombre_Sel',fld:'vTFGRUOPECOD_NOMBRE_SEL',pic:''},{av:'AV40TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV41TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV42TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV43TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV44TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV48TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV52TFParCod',fld:'vTFPARCOD',pic:'ZZZ9'},{av:'AV53TFParCod_To',fld:'vTFPARCOD_TO',pic:'ZZZ9'},{av:'AV54TFParCodNom',fld:'vTFPARCODNOM',pic:''},{av:'AV55TFParCodNom_Sel',fld:'vTFPARCODNOM_SEL',pic:''},{av:'AV75Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV66CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV67CliNom',fld:'vCLINOM',pic:''},{av:'AV68PedidoCliente',fld:'vPEDIDOCLIENTE',pic:''},{av:'AV69BarSer',fld:'vBARSER',pic:''},{av:'AV70BarSerDsc',fld:'vBARSERDSC',pic:''},{av:'AV71BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV72BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV79Produccion_consultadeproduccion_partesproduccionds_1_emprcod',fld:'vPRODUCCION_CONSULTADEPRODUCCION_PARTESPRODUCCIONDS_1_EMPRCOD',pic:'@!'},{av:'AV80Produccion_consultadeproduccion_partesproduccionds_2_barcod',fld:'vPRODUCCION_CONSULTADEPRODUCCION_PARTESPRODUCCIONDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV81Produccion_consultadeproduccion_partesproduccionds_3_barcodreo',fld:'vPRODUCCION_CONSULTADEPRODUCCION_PARTESPRODUCCIONDS_3_BARCODREO',pic:'9'},{av:'AV82Produccion_consultadeproduccion_partesproduccionds_4_barcodpar',fld:'vPRODUCCION_CONSULTADEPRODUCCION_PARTESPRODUCCIONDS_4_BARCODPAR',pic:''},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV54TFParCodNom',fld:'vTFPARCODNOM',pic:''},{av:'AV55TFParCodNom_Sel',fld:'vTFPARCODNOM_SEL',pic:''},{av:'AV52TFParCod',fld:'vTFPARCOD',pic:'ZZZ9'},{av:'AV53TFParCod_To',fld:'vTFPARCOD_TO',pic:'ZZZ9'},{av:'AV48TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV44TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV42TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV43TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV40TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV41TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV36TFGruopecod_Nombre',fld:'vTFGRUOPECOD_NOMBRE',pic:''},{av:'AV37TFGruopecod_Nombre_Sel',fld:'vTFGRUOPECOD_NOMBRE_SEL',pic:''},{av:'AV38TFGruOpeCod',fld:'vTFGRUOPECOD',pic:'ZZZZZ9'},{av:'AV39TFGruOpeCod_To',fld:'vTFGRUOPECOD_TO',pic:'ZZZZZ9'},{av:'AV34TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV35TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV32TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV33TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV30TFFase_Dsc',fld:'vTFFASE_DSC',pic:''},{av:'AV31TFFase_Dsc_Sel',fld:'vTFFASE_DSC_SEL',pic:''},{av:'AV28TFFase',fld:'vTFFASE',pic:''},{av:'AV29TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV26TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV27TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e191RZ2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e141RZ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV60EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV61BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV62BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV63BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV26TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV27TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV28TFFase',fld:'vTFFASE',pic:''},{av:'AV29TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV30TFFase_Dsc',fld:'vTFFASE_DSC',pic:''},{av:'AV31TFFase_Dsc_Sel',fld:'vTFFASE_DSC_SEL',pic:''},{av:'AV32TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV33TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV34TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV35TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV38TFGruOpeCod',fld:'vTFGRUOPECOD',pic:'ZZZZZ9'},{av:'AV39TFGruOpeCod_To',fld:'vTFGRUOPECOD_TO',pic:'ZZZZZ9'},{av:'AV36TFGruopecod_Nombre',fld:'vTFGRUOPECOD_NOMBRE',pic:''},{av:'AV37TFGruopecod_Nombre_Sel',fld:'vTFGRUOPECOD_NOMBRE_SEL',pic:''},{av:'AV40TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV41TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV42TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV43TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV44TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV48TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV52TFParCod',fld:'vTFPARCOD',pic:'ZZZ9'},{av:'AV53TFParCod_To',fld:'vTFPARCOD_TO',pic:'ZZZ9'},{av:'AV54TFParCodNom',fld:'vTFPARCODNOM',pic:''},{av:'AV55TFParCodNom_Sel',fld:'vTFPARCODNOM_SEL',pic:''},{av:'AV75Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV66CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV67CliNom',fld:'vCLINOM',pic:''},{av:'AV68PedidoCliente',fld:'vPEDIDOCLIENTE',pic:''},{av:'AV69BarSer',fld:'vBARSER',pic:''},{av:'AV70BarSerDsc',fld:'vBARSERDSC',pic:''},{av:'AV71BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV72BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV79Produccion_consultadeproduccion_partesproduccionds_1_emprcod',fld:'vPRODUCCION_CONSULTADEPRODUCCION_PARTESPRODUCCIONDS_1_EMPRCOD',pic:'@!'},{av:'AV80Produccion_consultadeproduccion_partesproduccionds_2_barcod',fld:'vPRODUCCION_CONSULTADEPRODUCCION_PARTESPRODUCCIONDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV81Produccion_consultadeproduccion_partesproduccionds_3_barcodreo',fld:'vPRODUCCION_CONSULTADEPRODUCCION_PARTESPRODUCCIONDS_3_BARCODREO',pic:'9'},{av:'AV82Produccion_consultadeproduccion_partesproduccionds_4_barcodpar',fld:'vPRODUCCION_CONSULTADEPRODUCCION_PARTESPRODUCCIONDS_4_BARCODPAR',pic:''},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtBarOrdLin_Visible',ctrl:'BARORDLIN',prop:'Visible'},{av:'edtFase_Visible',ctrl:'FASE',prop:'Visible'},{av:'edtFase_Dsc_Visible',ctrl:'FASE_DSC',prop:'Visible'},{av:'edtMaqCod_Visible',ctrl:'MAQCOD',prop:'Visible'},{av:'edtMaqDsc_Visible',ctrl:'MAQDSC',prop:'Visible'},{av:'edtGruOpeCod_Visible',ctrl:'GRUOPECOD',prop:'Visible'},{av:'edtGruopecod__Visible',ctrl:'GRUOPECOD_',prop:'Visible'},{av:'edtHisProKgr_Visible',ctrl:'HISPROKGR',prop:'Visible'},{av:'edtHisProMtr_Visible',ctrl:'HISPROMTR',prop:'Visible'},{av:'edtHisProDTI_Visible',ctrl:'HISPRODTI',prop:'Visible'},{av:'edtHisProDTF_Visible',ctrl:'HISPRODTF',prop:'Visible'},{av:'edtParCod_Visible',ctrl:'PARCOD',prop:'Visible'},{av:'edtParCodNom_Visible',ctrl:'PARCODNOM',prop:'Visible'},{av:'AV58GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV59GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e151RZ2',iparms:[{av:'AV60EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV61BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV62BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV63BarCodPar',fld:'vBARCODPAR',pic:''}]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e161RZ2',iparms:[{av:'AV60EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV61BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV62BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV63BarCodPar',fld:'vBARCODPAR',pic:''}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_FASE","{handler:'valid_Fase',iparms:[]");
      setEventMetadata("VALID_FASE",",oparms:[]}");
      setEventMetadata("VALID_FASE_DSC","{handler:'valid_Fase_dsc',iparms:[]");
      setEventMetadata("VALID_FASE_DSC",",oparms:[]}");
      setEventMetadata("VALID_MAQCOD","{handler:'valid_Maqcod',iparms:[]");
      setEventMetadata("VALID_MAQCOD",",oparms:[]}");
      setEventMetadata("VALID_GRUOPECOD","{handler:'valid_Gruopecod',iparms:[]");
      setEventMetadata("VALID_GRUOPECOD",",oparms:[]}");
      setEventMetadata("VALID_GRUOPECOD_","{handler:'valid_Gruopecod_',iparms:[]");
      setEventMetadata("VALID_GRUOPECOD_",",oparms:[]}");
      setEventMetadata("VALID_PARCOD","{handler:'valid_Parcod',iparms:[]");
      setEventMetadata("VALID_PARCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Parcodnom',iparms:[]");
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
      wcpOAV60EmprCod = "" ;
      wcpOAV63BarCodPar = "" ;
      wcpOAV67CliNom = "" ;
      wcpOAV68PedidoCliente = "" ;
      wcpOAV69BarSer = "" ;
      wcpOAV70BarSerDsc = "" ;
      wcpOAV71BarColNom = "" ;
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
      AV60EmprCod = "" ;
      AV63BarCodPar = "" ;
      AV67CliNom = "" ;
      AV68PedidoCliente = "" ;
      AV69BarSer = "" ;
      AV70BarSerDsc = "" ;
      AV71BarColNom = "" ;
      AV20ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV28TFFase = "" ;
      AV29TFFase_Sel = "" ;
      AV30TFFase_Dsc = "" ;
      AV31TFFase_Dsc_Sel = "" ;
      AV32TFMaqCod = "" ;
      AV33TFMaqCod_Sel = "" ;
      AV34TFMaqDsc = "" ;
      AV35TFMaqDsc_Sel = "" ;
      AV36TFGruopecod_Nombre = "" ;
      AV37TFGruopecod_Nombre_Sel = "" ;
      AV40TFHisProKgr = DecimalUtil.ZERO ;
      AV41TFHisProKgr_To = DecimalUtil.ZERO ;
      AV42TFHisProMtr = DecimalUtil.ZERO ;
      AV43TFHisProMtr_To = DecimalUtil.ZERO ;
      AV44TFHisProDTI = GXutil.resetTime( GXutil.nullDate() );
      AV48TFHisProDTF = GXutil.resetTime( GXutil.nullDate() );
      AV54TFParCodNom = "" ;
      AV55TFParCodNom_Sel = "" ;
      AV75Pgmname = "" ;
      AV79Produccion_consultadeproduccion_partesproduccionds_1_emprcod = "" ;
      AV82Produccion_consultadeproduccion_partesproduccionds_4_barcodpar = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV56DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
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
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV46DDO_HisProDTIAuxDate = GXutil.nullDate() ;
      AV50DDO_HisProDTFAuxDate = GXutil.nullDate() ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A461Fase = "" ;
      A14027Fase_Dsc = "" ;
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      A14028Gruopecod_ = "" ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A867ParCodNom = "" ;
      AV85Produccion_consultadeproduccion_partesproduccionds_7_tffase = "" ;
      AV86Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel = "" ;
      AV87Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc = "" ;
      AV88Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel = "" ;
      AV89Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod = "" ;
      AV90Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel = "" ;
      AV91Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc = "" ;
      AV92Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel = "" ;
      AV95Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre = "" ;
      AV96Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel = "" ;
      AV97Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr = DecimalUtil.ZERO ;
      AV98Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to = DecimalUtil.ZERO ;
      AV99Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr = DecimalUtil.ZERO ;
      AV100Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to = DecimalUtil.ZERO ;
      AV101Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti = GXutil.resetTime( GXutil.nullDate() );
      AV102Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf = GXutil.resetTime( GXutil.nullDate() );
      AV105Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom = "" ;
      AV106Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel = "" ;
      scmdbuf = "" ;
      lV85Produccion_consultadeproduccion_partesproduccionds_7_tffase = "" ;
      lV89Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod = "" ;
      lV91Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc = "" ;
      lV105Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom = "" ;
      H01RZ2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      H01RZ2_A561HisProLin = new int[1] ;
      H01RZ2_A129BarCod = new int[1] ;
      H01RZ2_A132BarCodReo = new byte[1] ;
      H01RZ2_A130BarCodPar = new String[] {""} ;
      H01RZ2_A867ParCodNom = new String[] {""} ;
      H01RZ2_n867ParCodNom = new boolean[] {false} ;
      H01RZ2_A656ParCod = new short[1] ;
      H01RZ2_n656ParCod = new boolean[] {false} ;
      H01RZ2_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      H01RZ2_n4441HisProDTF = new boolean[] {false} ;
      H01RZ2_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      H01RZ2_n4440HisProDTI = new boolean[] {false} ;
      H01RZ2_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01RZ2_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01RZ2_A606MaqDsc = new String[] {""} ;
      H01RZ2_n606MaqDsc = new boolean[] {false} ;
      H01RZ2_A602MaqCod = new String[] {""} ;
      H01RZ2_A194BarOrdLin = new short[1] ;
      H01RZ2_A461Fase = new String[] {""} ;
      H01RZ2_A503GruOpeCod = new int[1] ;
      H01RZ2_A396EmprCod = new String[] {""} ;
      H01RZ3_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      H01RZ3_A561HisProLin = new int[1] ;
      H01RZ3_A129BarCod = new int[1] ;
      H01RZ3_A132BarCodReo = new byte[1] ;
      H01RZ3_A130BarCodPar = new String[] {""} ;
      H01RZ3_A867ParCodNom = new String[] {""} ;
      H01RZ3_n867ParCodNom = new boolean[] {false} ;
      H01RZ3_A656ParCod = new short[1] ;
      H01RZ3_n656ParCod = new boolean[] {false} ;
      H01RZ3_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      H01RZ3_n4441HisProDTF = new boolean[] {false} ;
      H01RZ3_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      H01RZ3_n4440HisProDTI = new boolean[] {false} ;
      H01RZ3_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01RZ3_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01RZ3_A606MaqDsc = new String[] {""} ;
      H01RZ3_n606MaqDsc = new boolean[] {false} ;
      H01RZ3_A602MaqCod = new String[] {""} ;
      H01RZ3_A194BarOrdLin = new short[1] ;
      H01RZ3_A461Fase = new String[] {""} ;
      H01RZ3_A503GruOpeCod = new int[1] ;
      H01RZ3_A396EmprCod = new String[] {""} ;
      hsh = "" ;
      AV76Station = "" ;
      AV77Emprnom = "" ;
      AV78Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV22Session = httpContext.getWebSession();
      AV18ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV65Var_Hdr = "" ;
      AV64WebSession = httpContext.getWebSession();
      AV16ExcelFilename = "" ;
      AV17ErrorMessage = "" ;
      AV19UserCustomValue = "" ;
      AV21ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char16 = "" ;
      GXv_char17 = new String[1] ;
      GXt_char14 = "" ;
      GXv_char15 = new String[1] ;
      GXt_char12 = "" ;
      GXv_char13 = new String[1] ;
      GXt_char11 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char10 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState18 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      AV9TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV60EmprCod = "" ;
      sCtrlAV61BarCod = "" ;
      sCtrlAV62BarCodReo = "" ;
      sCtrlAV63BarCodPar = "" ;
      sCtrlAV66CliCod = "" ;
      sCtrlAV67CliNom = "" ;
      sCtrlAV68PedidoCliente = "" ;
      sCtrlAV69BarSer = "" ;
      sCtrlAV70BarSerDsc = "" ;
      sCtrlAV71BarColNom = "" ;
      sCtrlAV72BarColNum = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.consultadeproduccion_partesproduccion__default(),
         new Object[] {
             new Object[] {
            H01RZ2_A558HisProFec, H01RZ2_A561HisProLin, H01RZ2_A129BarCod, H01RZ2_A132BarCodReo, H01RZ2_A130BarCodPar, H01RZ2_A867ParCodNom, H01RZ2_n867ParCodNom, H01RZ2_A656ParCod, H01RZ2_n656ParCod, H01RZ2_A4441HisProDTF,
            H01RZ2_n4441HisProDTF, H01RZ2_A4440HisProDTI, H01RZ2_n4440HisProDTI, H01RZ2_A1526HisProMtr, H01RZ2_A1525HisProKgr, H01RZ2_A606MaqDsc, H01RZ2_n606MaqDsc, H01RZ2_A602MaqCod, H01RZ2_A194BarOrdLin, H01RZ2_A461Fase,
            H01RZ2_A503GruOpeCod, H01RZ2_A396EmprCod
            }
            , new Object[] {
            H01RZ3_A558HisProFec, H01RZ3_A561HisProLin, H01RZ3_A129BarCod, H01RZ3_A132BarCodReo, H01RZ3_A130BarCodPar, H01RZ3_A867ParCodNom, H01RZ3_n867ParCodNom, H01RZ3_A656ParCod, H01RZ3_n656ParCod, H01RZ3_A4441HisProDTF,
            H01RZ3_n4441HisProDTF, H01RZ3_A4440HisProDTI, H01RZ3_n4440HisProDTI, H01RZ3_A1526HisProMtr, H01RZ3_A1525HisProKgr, H01RZ3_A606MaqDsc, H01RZ3_n606MaqDsc, H01RZ3_A602MaqCod, H01RZ3_A194BarOrdLin, H01RZ3_A461Fase,
            H01RZ3_A503GruOpeCod, H01RZ3_A396EmprCod
            }
         }
      );
      AV75Pgmname = "Produccion.ConsultadeProduccion_PartesProduccion" ;
      /* GeneXus formulas. */
      AV75Pgmname = "Produccion.ConsultadeProduccion_PartesProduccion" ;
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
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV62BarCodReo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV62BarCodReo ;
   private byte AV81Produccion_consultadeproduccion_partesproduccionds_3_barcodreo ;
   private byte A132BarCodReo ;
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
   private short AV26TFBarOrdLin ;
   private short AV27TFBarOrdLin_To ;
   private short AV52TFParCod ;
   private short AV53TFParCod_To ;
   private short AV12OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short A194BarOrdLin ;
   private short A656ParCod ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV83Produccion_consultadeproduccion_partesproduccionds_5_tfbarordlin ;
   private short AV84Produccion_consultadeproduccion_partesproduccionds_6_tfbarordlin_to ;
   private short AV103Produccion_consultadeproduccion_partesproduccionds_25_tfparcod ;
   private short AV104Produccion_consultadeproduccion_partesproduccionds_26_tfparcod_to ;
   private int wcpOAV61BarCod ;
   private int wcpOAV66CliCod ;
   private int wcpOAV72BarColNum ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_87 ;
   private int AV61BarCod ;
   private int AV66CliCod ;
   private int AV72BarColNum ;
   private int nGXsfl_87_idx=1 ;
   private int AV38TFGruOpeCod ;
   private int AV39TFGruOpeCod_To ;
   private int AV80Produccion_consultadeproduccion_partesproduccionds_2_barcod ;
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
   private int edtavPgmname_Enabled ;
   private int edtEmprCod_Visible ;
   private int A129BarCod ;
   private int edtBarCod_Visible ;
   private int edtBarCodReo_Visible ;
   private int edtBarCodPar_Visible ;
   private int A503GruOpeCod ;
   private int subGrid_Islastpage ;
   private int AV93Produccion_consultadeproduccion_partesproduccionds_15_tfgruopecod ;
   private int AV94Produccion_consultadeproduccion_partesproduccionds_16_tfgruopecod_to ;
   private int edtBarOrdLin_Visible ;
   private int edtFase_Visible ;
   private int edtFase_Dsc_Visible ;
   private int edtMaqCod_Visible ;
   private int edtMaqDsc_Visible ;
   private int edtGruOpeCod_Visible ;
   private int edtGruopecod__Visible ;
   private int edtHisProKgr_Visible ;
   private int edtHisProMtr_Visible ;
   private int edtHisProDTI_Visible ;
   private int edtHisProDTF_Visible ;
   private int edtParCod_Visible ;
   private int edtParCodNom_Visible ;
   private int AV57PageToGo ;
   private int AV107GXV1 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV58GridCurrentPage ;
   private long AV59GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV40TFHisProKgr ;
   private java.math.BigDecimal AV41TFHisProKgr_To ;
   private java.math.BigDecimal AV42TFHisProMtr ;
   private java.math.BigDecimal AV43TFHisProMtr_To ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal AV97Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr ;
   private java.math.BigDecimal AV98Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to ;
   private java.math.BigDecimal AV99Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr ;
   private java.math.BigDecimal AV100Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to ;
   private String wcpOAV60EmprCod ;
   private String wcpOAV63BarCodPar ;
   private String wcpOAV67CliNom ;
   private String wcpOAV68PedidoCliente ;
   private String wcpOAV69BarSer ;
   private String wcpOAV70BarSerDsc ;
   private String wcpOAV71BarColNom ;
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
   private String AV60EmprCod ;
   private String AV63BarCodPar ;
   private String AV67CliNom ;
   private String AV68PedidoCliente ;
   private String AV69BarSer ;
   private String AV70BarSerDsc ;
   private String AV71BarColNom ;
   private String sGXsfl_87_idx="0001" ;
   private String AV28TFFase ;
   private String AV29TFFase_Sel ;
   private String AV30TFFase_Dsc ;
   private String AV31TFFase_Dsc_Sel ;
   private String AV32TFMaqCod ;
   private String AV33TFMaqCod_Sel ;
   private String AV34TFMaqDsc ;
   private String AV35TFMaqDsc_Sel ;
   private String AV36TFGruopecod_Nombre ;
   private String AV37TFGruopecod_Nombre_Sel ;
   private String AV54TFParCodNom ;
   private String AV55TFParCodNom_Sel ;
   private String AV75Pgmname ;
   private String AV79Produccion_consultadeproduccion_partesproduccionds_1_emprcod ;
   private String AV82Produccion_consultadeproduccion_partesproduccionds_4_barcodpar ;
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
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable2_Internalname ;
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
   private String divUnnamedtable3_Internalname ;
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
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String edtEmprCod_Internalname ;
   private String A396EmprCod ;
   private String edtEmprCod_Jsonclick ;
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String A130BarCodPar ;
   private String edtBarCodPar_Jsonclick ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_hisprodtiauxdates_Internalname ;
   private String edtavDdo_hisprodtiauxdate_Internalname ;
   private String edtavDdo_hisprodtiauxdate_Jsonclick ;
   private String divDdo_hisprodtfauxdates_Internalname ;
   private String edtavDdo_hisprodtfauxdate_Internalname ;
   private String edtavDdo_hisprodtfauxdate_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtBarOrdLin_Internalname ;
   private String A461Fase ;
   private String edtFase_Internalname ;
   private String A14027Fase_Dsc ;
   private String edtFase_Dsc_Internalname ;
   private String A602MaqCod ;
   private String edtMaqCod_Internalname ;
   private String A606MaqDsc ;
   private String edtMaqDsc_Internalname ;
   private String edtGruOpeCod_Internalname ;
   private String A14028Gruopecod_ ;
   private String edtGruopecod__Internalname ;
   private String edtHisProKgr_Internalname ;
   private String edtHisProMtr_Internalname ;
   private String edtHisProDTI_Internalname ;
   private String edtHisProDTF_Internalname ;
   private String edtParCod_Internalname ;
   private String A867ParCodNom ;
   private String edtParCodNom_Internalname ;
   private String AV85Produccion_consultadeproduccion_partesproduccionds_7_tffase ;
   private String AV86Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel ;
   private String AV87Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc ;
   private String AV88Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel ;
   private String AV89Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod ;
   private String AV90Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel ;
   private String AV91Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc ;
   private String AV92Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel ;
   private String AV95Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre ;
   private String AV96Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel ;
   private String AV105Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom ;
   private String AV106Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel ;
   private String scmdbuf ;
   private String lV85Produccion_consultadeproduccion_partesproduccionds_7_tffase ;
   private String lV89Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod ;
   private String lV91Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc ;
   private String lV105Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom ;
   private String hsh ;
   private String AV76Station ;
   private String AV77Emprnom ;
   private String AV78Usurcod ;
   private String AV65Var_Hdr ;
   private String GXt_char16 ;
   private String GXv_char17[] ;
   private String GXt_char14 ;
   private String GXv_char15[] ;
   private String GXt_char12 ;
   private String GXv_char13[] ;
   private String GXt_char11 ;
   private String GXv_char4[] ;
   private String GXt_char10 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblTablerightheader_Internalname ;
   private String sCtrlAV60EmprCod ;
   private String sCtrlAV61BarCod ;
   private String sCtrlAV62BarCodReo ;
   private String sCtrlAV63BarCodPar ;
   private String sCtrlAV66CliCod ;
   private String sCtrlAV67CliNom ;
   private String sCtrlAV68PedidoCliente ;
   private String sCtrlAV69BarSer ;
   private String sCtrlAV70BarSerDsc ;
   private String sCtrlAV71BarColNom ;
   private String sCtrlAV72BarColNum ;
   private String sGXsfl_87_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtBarOrdLin_Jsonclick ;
   private String edtFase_Jsonclick ;
   private String edtFase_Dsc_Jsonclick ;
   private String edtMaqCod_Jsonclick ;
   private String edtMaqDsc_Jsonclick ;
   private String edtGruOpeCod_Jsonclick ;
   private String edtGruopecod__Jsonclick ;
   private String edtHisProKgr_Jsonclick ;
   private String edtHisProMtr_Jsonclick ;
   private String edtHisProDTI_Jsonclick ;
   private String edtHisProDTF_Jsonclick ;
   private String edtParCod_Jsonclick ;
   private String edtParCodNom_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV44TFHisProDTI ;
   private java.util.Date AV48TFHisProDTF ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date AV101Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti ;
   private java.util.Date AV102Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf ;
   private java.util.Date AV46DDO_HisProDTIAuxDate ;
   private java.util.Date AV50DDO_HisProDTFAuxDate ;
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
   private boolean n606MaqDsc ;
   private boolean n4440HisProDTI ;
   private boolean n4441HisProDTF ;
   private boolean n656ParCod ;
   private boolean n867ParCodNom ;
   private boolean bGXsfl_87_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV18ColumnsSelectorXML ;
   private String AV19UserCustomValue ;
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
   private java.util.Date[] H01RZ2_A558HisProFec ;
   private int[] H01RZ2_A561HisProLin ;
   private int[] H01RZ2_A129BarCod ;
   private byte[] H01RZ2_A132BarCodReo ;
   private String[] H01RZ2_A130BarCodPar ;
   private String[] H01RZ2_A867ParCodNom ;
   private boolean[] H01RZ2_n867ParCodNom ;
   private short[] H01RZ2_A656ParCod ;
   private boolean[] H01RZ2_n656ParCod ;
   private java.util.Date[] H01RZ2_A4441HisProDTF ;
   private boolean[] H01RZ2_n4441HisProDTF ;
   private java.util.Date[] H01RZ2_A4440HisProDTI ;
   private boolean[] H01RZ2_n4440HisProDTI ;
   private java.math.BigDecimal[] H01RZ2_A1526HisProMtr ;
   private java.math.BigDecimal[] H01RZ2_A1525HisProKgr ;
   private String[] H01RZ2_A606MaqDsc ;
   private boolean[] H01RZ2_n606MaqDsc ;
   private String[] H01RZ2_A602MaqCod ;
   private short[] H01RZ2_A194BarOrdLin ;
   private String[] H01RZ2_A461Fase ;
   private int[] H01RZ2_A503GruOpeCod ;
   private String[] H01RZ2_A396EmprCod ;
   private java.util.Date[] H01RZ3_A558HisProFec ;
   private int[] H01RZ3_A561HisProLin ;
   private int[] H01RZ3_A129BarCod ;
   private byte[] H01RZ3_A132BarCodReo ;
   private String[] H01RZ3_A130BarCodPar ;
   private String[] H01RZ3_A867ParCodNom ;
   private boolean[] H01RZ3_n867ParCodNom ;
   private short[] H01RZ3_A656ParCod ;
   private boolean[] H01RZ3_n656ParCod ;
   private java.util.Date[] H01RZ3_A4441HisProDTF ;
   private boolean[] H01RZ3_n4441HisProDTF ;
   private java.util.Date[] H01RZ3_A4440HisProDTI ;
   private boolean[] H01RZ3_n4440HisProDTI ;
   private java.math.BigDecimal[] H01RZ3_A1526HisProMtr ;
   private java.math.BigDecimal[] H01RZ3_A1525HisProKgr ;
   private String[] H01RZ3_A606MaqDsc ;
   private boolean[] H01RZ3_n606MaqDsc ;
   private String[] H01RZ3_A602MaqCod ;
   private short[] H01RZ3_A194BarOrdLin ;
   private String[] H01RZ3_A461Fase ;
   private int[] H01RZ3_A503GruOpeCod ;
   private String[] H01RZ3_A396EmprCod ;
   private com.genexus.webpanels.WebSession AV64WebSession ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV9TrnContextAtt ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState18[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV21ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV56DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class consultadeproduccion_partesproduccion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01RZ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV83Produccion_consultadeproduccion_partesproduccionds_5_tfbarordlin ,
                                          short AV84Produccion_consultadeproduccion_partesproduccionds_6_tfbarordlin_to ,
                                          String AV86Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel ,
                                          String AV85Produccion_consultadeproduccion_partesproduccionds_7_tffase ,
                                          String AV90Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel ,
                                          String AV89Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod ,
                                          String AV92Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel ,
                                          String AV91Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc ,
                                          int AV93Produccion_consultadeproduccion_partesproduccionds_15_tfgruopecod ,
                                          int AV94Produccion_consultadeproduccion_partesproduccionds_16_tfgruopecod_to ,
                                          java.math.BigDecimal AV97Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr ,
                                          java.math.BigDecimal AV98Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to ,
                                          java.math.BigDecimal AV99Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr ,
                                          java.math.BigDecimal AV100Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to ,
                                          java.util.Date AV101Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti ,
                                          java.util.Date AV102Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf ,
                                          short AV103Produccion_consultadeproduccion_partesproduccionds_25_tfparcod ,
                                          short AV104Produccion_consultadeproduccion_partesproduccionds_26_tfparcod_to ,
                                          String AV106Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel ,
                                          String AV105Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom ,
                                          short A194BarOrdLin ,
                                          String A461Fase ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          int A503GruOpeCod ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF ,
                                          short A656ParCod ,
                                          String A867ParCodNom ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV88Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel ,
                                          String AV87Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc ,
                                          String A14027Fase_Dsc ,
                                          String AV96Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel ,
                                          String AV95Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre ,
                                          String A14028Gruopecod_ ,
                                          String AV79Produccion_consultadeproduccion_partesproduccionds_1_emprcod ,
                                          int AV80Produccion_consultadeproduccion_partesproduccionds_2_barcod ,
                                          byte AV81Produccion_consultadeproduccion_partesproduccionds_3_barcodreo ,
                                          String AV82Produccion_consultadeproduccion_partesproduccionds_4_barcodpar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int19 = new byte[24];
      Object[] GXv_Object20 = new Object[2];
      scmdbuf = "SELECT T1.HisProFec, T1.HisProLin, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T3.ParCodNom, T1.ParCod, T1.HisProDTF, T1.HisProDTI, T1.HisProMtr, T1.HisProKgr, T2.MaqDsc," ;
      scmdbuf += " T1.MaqCod, T1.BarOrdLin, T1.Fase, T1.GruOpeCod, T1.EmprCod FROM ((TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) LEFT" ;
      scmdbuf += " JOIN TXPCODPAR T3 ON T3.EmprCod = T1.EmprCod AND T3.ParCod = T1.ParCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      if ( ! (0==AV83Produccion_consultadeproduccion_partesproduccionds_5_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int19[4] = (byte)(1) ;
      }
      if ( ! (0==AV84Produccion_consultadeproduccion_partesproduccionds_6_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int19[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel)==0) && ( ! (GXutil.strcmp("", AV85Produccion_consultadeproduccion_partesproduccionds_7_tffase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Fase) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Fase = ?)");
      }
      else
      {
         GXv_int19[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV89Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int19[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV91Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int19[11] = (byte)(1) ;
      }
      if ( ! (0==AV93Produccion_consultadeproduccion_partesproduccionds_15_tfgruopecod) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod >= ?)");
      }
      else
      {
         GXv_int19[12] = (byte)(1) ;
      }
      if ( ! (0==AV94Produccion_consultadeproduccion_partesproduccionds_16_tfgruopecod_to) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod <= ?)");
      }
      else
      {
         GXv_int19[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int19[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int19[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV99Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int19[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV100Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int19[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV101Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      }
      else
      {
         GXv_int19[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV102Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int19[19] = (byte)(1) ;
      }
      if ( ! (0==AV103Produccion_consultadeproduccion_partesproduccionds_25_tfparcod) )
      {
         addWhere(sWhereString, "(T1.ParCod >= ?)");
      }
      else
      {
         GXv_int19[20] = (byte)(1) ;
      }
      if ( ! (0==AV104Produccion_consultadeproduccion_partesproduccionds_26_tfparcod_to) )
      {
         addWhere(sWhereString, "(T1.ParCod <= ?)");
      }
      else
      {
         GXv_int19[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel)==0) && ( ! (GXutil.strcmp("", AV105Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ParCodNom = ?)");
      }
      else
      {
         GXv_int19[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarOrdLin" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarOrdLin DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.Fase" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.Fase DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MaqCod" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.MaqCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.MaqDsc" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T2.MaqDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.GruOpeCod" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.GruOpeCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.HisProKgr" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.HisProKgr DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.HisProMtr" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.HisProMtr DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.HisProDTI" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.HisProDTI DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.HisProDTF" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.HisProDTF DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ParCod" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.ParCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T3.ParCodNom" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T3.ParCodNom DESC" ;
      }
      GXv_Object20[0] = scmdbuf ;
      GXv_Object20[1] = GXv_int19 ;
      return GXv_Object20 ;
   }

   protected Object[] conditional_H01RZ3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV83Produccion_consultadeproduccion_partesproduccionds_5_tfbarordlin ,
                                          short AV84Produccion_consultadeproduccion_partesproduccionds_6_tfbarordlin_to ,
                                          String AV86Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel ,
                                          String AV85Produccion_consultadeproduccion_partesproduccionds_7_tffase ,
                                          String AV90Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel ,
                                          String AV89Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod ,
                                          String AV92Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel ,
                                          String AV91Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc ,
                                          int AV93Produccion_consultadeproduccion_partesproduccionds_15_tfgruopecod ,
                                          int AV94Produccion_consultadeproduccion_partesproduccionds_16_tfgruopecod_to ,
                                          java.math.BigDecimal AV97Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr ,
                                          java.math.BigDecimal AV98Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to ,
                                          java.math.BigDecimal AV99Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr ,
                                          java.math.BigDecimal AV100Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to ,
                                          java.util.Date AV101Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti ,
                                          java.util.Date AV102Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf ,
                                          short AV103Produccion_consultadeproduccion_partesproduccionds_25_tfparcod ,
                                          short AV104Produccion_consultadeproduccion_partesproduccionds_26_tfparcod_to ,
                                          String AV106Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel ,
                                          String AV105Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom ,
                                          short A194BarOrdLin ,
                                          String A461Fase ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          int A503GruOpeCod ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF ,
                                          short A656ParCod ,
                                          String A867ParCodNom ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV88Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel ,
                                          String AV87Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc ,
                                          String A14027Fase_Dsc ,
                                          String AV96Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel ,
                                          String AV95Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre ,
                                          String A14028Gruopecod_ ,
                                          String AV79Produccion_consultadeproduccion_partesproduccionds_1_emprcod ,
                                          int AV80Produccion_consultadeproduccion_partesproduccionds_2_barcod ,
                                          byte AV81Produccion_consultadeproduccion_partesproduccionds_3_barcodreo ,
                                          String AV82Produccion_consultadeproduccion_partesproduccionds_4_barcodpar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int21 = new byte[24];
      Object[] GXv_Object22 = new Object[2];
      scmdbuf = "SELECT T1.HisProFec, T1.HisProLin, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T3.ParCodNom, T1.ParCod, T1.HisProDTF, T1.HisProDTI, T1.HisProMtr, T1.HisProKgr, T2.MaqDsc," ;
      scmdbuf += " T1.MaqCod, T1.BarOrdLin, T1.Fase, T1.GruOpeCod, T1.EmprCod FROM ((TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) LEFT" ;
      scmdbuf += " JOIN TXPCODPAR T3 ON T3.EmprCod = T1.EmprCod AND T3.ParCod = T1.ParCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      if ( ! (0==AV83Produccion_consultadeproduccion_partesproduccionds_5_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int21[4] = (byte)(1) ;
      }
      if ( ! (0==AV84Produccion_consultadeproduccion_partesproduccionds_6_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int21[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel)==0) && ( ! (GXutil.strcmp("", AV85Produccion_consultadeproduccion_partesproduccionds_7_tffase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Fase) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Fase = ?)");
      }
      else
      {
         GXv_int21[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV89Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int21[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV91Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int21[11] = (byte)(1) ;
      }
      if ( ! (0==AV93Produccion_consultadeproduccion_partesproduccionds_15_tfgruopecod) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod >= ?)");
      }
      else
      {
         GXv_int21[12] = (byte)(1) ;
      }
      if ( ! (0==AV94Produccion_consultadeproduccion_partesproduccionds_16_tfgruopecod_to) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod <= ?)");
      }
      else
      {
         GXv_int21[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int21[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int21[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV99Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int21[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV100Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int21[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV101Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      }
      else
      {
         GXv_int21[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV102Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int21[19] = (byte)(1) ;
      }
      if ( ! (0==AV103Produccion_consultadeproduccion_partesproduccionds_25_tfparcod) )
      {
         addWhere(sWhereString, "(T1.ParCod >= ?)");
      }
      else
      {
         GXv_int21[20] = (byte)(1) ;
      }
      if ( ! (0==AV104Produccion_consultadeproduccion_partesproduccionds_26_tfparcod_to) )
      {
         addWhere(sWhereString, "(T1.ParCod <= ?)");
      }
      else
      {
         GXv_int21[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel)==0) && ( ! (GXutil.strcmp("", AV105Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ParCodNom = ?)");
      }
      else
      {
         GXv_int21[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarOrdLin" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarOrdLin DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.Fase" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.Fase DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MaqCod" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.MaqCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.MaqDsc" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T2.MaqDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.GruOpeCod" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.GruOpeCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.HisProKgr" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.HisProKgr DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.HisProMtr" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.HisProMtr DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.HisProDTI" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.HisProDTI DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.HisProDTF" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.HisProDTF DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ParCod" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.ParCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T3.ParCodNom" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T3.ParCodNom DESC" ;
      }
      GXv_Object22[0] = scmdbuf ;
      GXv_Object22[1] = GXv_int21 ;
      return GXv_Object22 ;
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
                  return conditional_H01RZ2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (java.util.Date)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (java.util.Date)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , ((Number) dynConstraints[31]).shortValue() , ((Boolean) dynConstraints[32]).booleanValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() , ((Number) dynConstraints[45]).byteValue() , (String)dynConstraints[46] );
            case 1 :
                  return conditional_H01RZ3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (java.util.Date)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (java.util.Date)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , ((Number) dynConstraints[31]).shortValue() , ((Boolean) dynConstraints[32]).booleanValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() , ((Number) dynConstraints[45]).byteValue() , (String)dynConstraints[46] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01RZ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01RZ3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(11,2);
               ((String[]) buf[15])[0] = rslt.getString(12, 16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(13, 6);
               ((short[]) buf[18])[0] = rslt.getShort(14);
               ((String[]) buf[19])[0] = rslt.getString(15, 8);
               ((int[]) buf[20])[0] = rslt.getInt(16);
               ((String[]) buf[21])[0] = rslt.getString(17, 3);
               return;
            case 1 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(11,2);
               ((String[]) buf[15])[0] = rslt.getString(12, 16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(13, 6);
               ((short[]) buf[18])[0] = rslt.getShort(14);
               ((String[]) buf[19])[0] = rslt.getString(15, 8);
               ((int[]) buf[20])[0] = rslt.getInt(16);
               ((String[]) buf[21])[0] = rslt.getString(17, 3);
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
                  stmt.setString(sIdx, (String)parms[24], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[26]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 16);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[42], false);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[43], false);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[26]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 16);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[42], false);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[43], false);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               return;
      }
   }

}

