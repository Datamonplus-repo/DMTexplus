package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class consultadeproduccion_agrupadas_impl extends GXWebComponent
{
   public consultadeproduccion_agrupadas_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public consultadeproduccion_agrupadas_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultadeproduccion_agrupadas_impl.class ));
   }

   public consultadeproduccion_agrupadas_impl( int remoteHandle ,
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
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A130BarCodPar", A130BarCodPar);
               AV66CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66CliCod), 6, 0));
               AV67CliNom = httpContext.GetPar( "CliNom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67CliNom", AV67CliNom);
               AV68PedidoCliente = httpContext.GetPar( "PedidoCliente") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68PedidoCliente", AV68PedidoCliente);
               AV62BarSer = httpContext.GetPar( "BarSer") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62BarSer", AV62BarSer);
               AV63BarSerDsc = httpContext.GetPar( "BarSerDsc") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63BarSerDsc", AV63BarSerDsc);
               AV64BarColNom = httpContext.GetPar( "BarColNom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64BarColNom", AV64BarColNom);
               AV65BarColNum = (int)(GXutil.lval( httpContext.GetPar( "BarColNum"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65BarColNum), 6, 0));
               AV73MacCod = (int)(GXutil.lval( httpContext.GetPar( "MacCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73MacCod), 8, 0));
               AV74BarKgm = CommonUtil.decimalVal( httpContext.GetPar( "BarKgm"), ".") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74BarKgm", GXutil.ltrimstr( AV74BarKgm, 9, 2));
               AV75BarMtr = CommonUtil.decimalVal( httpContext.GetPar( "BarMtr"), ".") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75BarMtr", GXutil.ltrimstr( AV75BarMtr, 9, 2));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,A396EmprCod,Integer.valueOf(A129BarCod),Byte.valueOf(A132BarCodReo),A130BarCodPar,Integer.valueOf(AV66CliCod),AV67CliNom,AV68PedidoCliente,AV62BarSer,AV63BarSerDsc,AV64BarColNom,Integer.valueOf(AV65BarColNum),Integer.valueOf(AV73MacCod),AV74BarKgm,AV75BarMtr});
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
      nRC_GXsfl_102 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_102"))) ;
      nGXsfl_102_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_102_idx"))) ;
      sGXsfl_102_idx = httpContext.GetPar( "sGXsfl_102_idx") ;
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
      AV12FilterFullText = httpContext.GetPar( "FilterFullText") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
      AV20ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV15ColumnsSelector);
      AV21TFBarAgrNhdr = httpContext.GetPar( "TFBarAgrNhdr") ;
      AV22TFBarAgrNhdr_Sel = httpContext.GetPar( "TFBarAgrNhdr_Sel") ;
      AV50TFKgmAgr = CommonUtil.decimalVal( httpContext.GetPar( "TFKgmAgr"), ".") ;
      AV51TFKgmAgr_To = CommonUtil.decimalVal( httpContext.GetPar( "TFKgmAgr_To"), ".") ;
      AV52TFMtrAgr = CommonUtil.decimalVal( httpContext.GetPar( "TFMtrAgr"), ".") ;
      AV53TFMtrAgr_To = CommonUtil.decimalVal( httpContext.GetPar( "TFMtrAgr_To"), ".") ;
      AV54TFPieAgr = (short)(GXutil.lval( httpContext.GetPar( "TFPieAgr"))) ;
      AV55TFPieAgr_To = (short)(GXutil.lval( httpContext.GetPar( "TFPieAgr_To"))) ;
      AV36TFBarAgrSer = httpContext.GetPar( "TFBarAgrSer") ;
      AV37TFBarAgrSer_Sel = httpContext.GetPar( "TFBarAgrSer_Sel") ;
      AV38TFBarAgrDsc = httpContext.GetPar( "TFBarAgrDsc") ;
      AV39TFBarAgrDsc_Sel = httpContext.GetPar( "TFBarAgrDsc_Sel") ;
      AV40TFCliCodAgr = (int)(GXutil.lval( httpContext.GetPar( "TFCliCodAgr"))) ;
      AV41TFCliCodAgr_To = (int)(GXutil.lval( httpContext.GetPar( "TFCliCodAgr_To"))) ;
      AV42TFColNomAgr = httpContext.GetPar( "TFColNomAgr") ;
      AV43TFColNomAgr_Sel = httpContext.GetPar( "TFColNomAgr_Sel") ;
      AV44TFColNumAgr = (int)(GXutil.lval( httpContext.GetPar( "TFColNumAgr"))) ;
      AV45TFColNumAgr_To = (int)(GXutil.lval( httpContext.GetPar( "TFColNumAgr_To"))) ;
      AV46TFColNoCAgr = httpContext.GetPar( "TFColNoCAgr") ;
      AV47TFColNoCAgr_Sel = httpContext.GetPar( "TFColNoCAgr_Sel") ;
      AV48TFColNuCAgr = (int)(GXutil.lval( httpContext.GetPar( "TFColNuCAgr"))) ;
      AV49TFColNuCAgr_To = (int)(GXutil.lval( httpContext.GetPar( "TFColNuCAgr_To"))) ;
      AV82Pgmname = httpContext.GetPar( "Pgmname") ;
      AV27OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV28OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV56TotKgmAgr = CommonUtil.decimalVal( httpContext.GetPar( "TotKgmAgr"), ".") ;
      AV58TotMtrAgr = CommonUtil.decimalVal( httpContext.GetPar( "TotMtrAgr"), ".") ;
      AV60TotPieAgr = GXutil.lval( httpContext.GetPar( "TotPieAgr")) ;
      AV74BarKgm = CommonUtil.decimalVal( httpContext.GetPar( "BarKgm"), ".") ;
      AV75BarMtr = CommonUtil.decimalVal( httpContext.GetPar( "BarMtr"), ".") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV12FilterFullText, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV20ManageFiltersExecutionStep, AV15ColumnsSelector, AV21TFBarAgrNhdr, AV22TFBarAgrNhdr_Sel, AV50TFKgmAgr, AV51TFKgmAgr_To, AV52TFMtrAgr, AV53TFMtrAgr_To, AV54TFPieAgr, AV55TFPieAgr_To, AV36TFBarAgrSer, AV37TFBarAgrSer_Sel, AV38TFBarAgrDsc, AV39TFBarAgrDsc_Sel, AV40TFCliCodAgr, AV41TFCliCodAgr_To, AV42TFColNomAgr, AV43TFColNomAgr_Sel, AV44TFColNumAgr, AV45TFColNumAgr_To, AV46TFColNoCAgr, AV47TFColNoCAgr_Sel, AV48TFColNuCAgr, AV49TFColNuCAgr_To, AV82Pgmname, AV27OrderedBy, AV28OrderedDsc, AV56TotKgmAgr, AV58TotMtrAgr, AV60TotPieAgr, AV74BarKgm, AV75BarMtr, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1972( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Producciones Agrupadas Tinte", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.consultadeproduccion_agrupadas", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV66CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV67CliNom)),GXutil.URLEncode(GXutil.rtrim(AV68PedidoCliente)),GXutil.URLEncode(GXutil.rtrim(AV62BarSer)),GXutil.URLEncode(GXutil.rtrim(AV63BarSerDsc)),GXutil.URLEncode(GXutil.rtrim(AV64BarColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV65BarColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV73MacCod,8,0)),GXutil.URLEncode(DecimalUtil.decToString(AV74BarKgm)),GXutil.URLEncode(DecimalUtil.decToString(AV75BarMtr))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","CliCod","CliNom","PedidoCliente","BarSer","BarSerDsc","BarColNom","BarColNum","MacCod","BarKgm","BarMtr"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTKGMAGR", getSecureSignedToken( sPrefix, localUtil.format( AV56TotKgmAgr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMTRAGR", getSecureSignedToken( sPrefix, localUtil.format( AV58TotMtrAgr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTPIEAGR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV60TotPieAgr), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ConsultadeProduccion_Agrupadas");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV82Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("consultadeproduccion_agrupadas:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vFILTERFULLTEXT", AV12FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_102", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_102, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV18ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV18ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV25GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV26GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV23DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV23DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV15ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV15ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA396EmprCod", GXutil.rtrim( wcpOA396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA129BarCod", GXutil.ltrim( localUtil.ntoc( wcpOA129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA132BarCodReo", GXutil.ltrim( localUtil.ntoc( wcpOA132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA130BarCodPar", GXutil.rtrim( wcpOA130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV66CliCod", GXutil.ltrim( localUtil.ntoc( wcpOAV66CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV67CliNom", GXutil.rtrim( wcpOAV67CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV68PedidoCliente", GXutil.rtrim( wcpOAV68PedidoCliente));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV62BarSer", GXutil.rtrim( wcpOAV62BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV63BarSerDsc", GXutil.rtrim( wcpOAV63BarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV64BarColNom", GXutil.rtrim( wcpOAV64BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV65BarColNum", GXutil.ltrim( localUtil.ntoc( wcpOAV65BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV73MacCod", GXutil.ltrim( localUtil.ntoc( wcpOAV73MacCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV74BarKgm", GXutil.ltrim( localUtil.ntoc( wcpOAV74BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV75BarMtr", GXutil.ltrim( localUtil.ntoc( wcpOAV75BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV20ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARAGRNHDR", GXutil.rtrim( AV21TFBarAgrNhdr));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARAGRNHDR_SEL", GXutil.rtrim( AV22TFBarAgrNhdr_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFKGMAGR", GXutil.ltrim( localUtil.ntoc( AV50TFKgmAgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFKGMAGR_TO", GXutil.ltrim( localUtil.ntoc( AV51TFKgmAgr_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMTRAGR", GXutil.ltrim( localUtil.ntoc( AV52TFMtrAgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMTRAGR_TO", GXutil.ltrim( localUtil.ntoc( AV53TFMtrAgr_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPIEAGR", GXutil.ltrim( localUtil.ntoc( AV54TFPieAgr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPIEAGR_TO", GXutil.ltrim( localUtil.ntoc( AV55TFPieAgr_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARAGRSER", GXutil.rtrim( AV36TFBarAgrSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARAGRSER_SEL", GXutil.rtrim( AV37TFBarAgrSer_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARAGRDSC", GXutil.rtrim( AV38TFBarAgrDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARAGRDSC_SEL", GXutil.rtrim( AV39TFBarAgrDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICODAGR", GXutil.ltrim( localUtil.ntoc( AV40TFCliCodAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICODAGR_TO", GXutil.ltrim( localUtil.ntoc( AV41TFCliCodAgr_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCOLNOMAGR", GXutil.rtrim( AV42TFColNomAgr));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCOLNOMAGR_SEL", GXutil.rtrim( AV43TFColNomAgr_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCOLNUMAGR", GXutil.ltrim( localUtil.ntoc( AV44TFColNumAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCOLNUMAGR_TO", GXutil.ltrim( localUtil.ntoc( AV45TFColNumAgr_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCOLNOCAGR", GXutil.rtrim( AV46TFColNoCAgr));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCOLNOCAGR_SEL", GXutil.rtrim( AV47TFColNoCAgr_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCOLNUCAGR", GXutil.ltrim( localUtil.ntoc( AV48TFColNuCAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCOLNUCAGR_TO", GXutil.ltrim( localUtil.ntoc( AV49TFColNuCAgr_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV27OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV28OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTKGMAGR", GXutil.ltrim( localUtil.ntoc( AV56TotKgmAgr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTKGMAGR", getSecureSignedToken( sPrefix, localUtil.format( AV56TotKgmAgr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTMTRAGR", GXutil.ltrim( localUtil.ntoc( AV58TotMtrAgr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMTRAGR", getSecureSignedToken( sPrefix, localUtil.format( AV58TotMtrAgr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTPIEAGR", GXutil.ltrim( localUtil.ntoc( AV60TotPieAgr, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTPIEAGR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV60TotPieAgr), "ZZZ9")));
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

   public void renderHtmlCloseForm1972( )
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
      return "ConsultadeProduccion_Agrupadas" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Producciones Agrupadas Tinte", "") ;
   }

   public void wb1970( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.consultadeproduccion_agrupadas");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtBarCod_Internalname, httpContext.getMessage( "Nº Hdr", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ConsultadeProduccion_Agrupadas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCodReo_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtBarCodReo_Internalname, httpContext.getMessage( "R", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ConsultadeProduccion_Agrupadas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCodPar_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtBarCodPar_Internalname, httpContext.getMessage( "P", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ConsultadeProduccion_Agrupadas.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV66CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV66CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV66CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ConsultadeProduccion_Agrupadas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClinom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClinom_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClinom_Internalname, GXutil.rtrim( AV67CliNom), GXutil.rtrim( localUtil.format( AV67CliNom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClinom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClinom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ConsultadeProduccion_Agrupadas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPedidocliente_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPedidocliente_Internalname, httpContext.getMessage( "Pedido Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPedidocliente_Internalname, GXutil.rtrim( AV68PedidoCliente), GXutil.rtrim( localUtil.format( AV68PedidoCliente, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPedidocliente_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPedidocliente_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ConsultadeProduccion_Agrupadas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMaccod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMaccod_Internalname, httpContext.getMessage( "Nº Macro", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaccod_Internalname, GXutil.ltrim( localUtil.ntoc( AV73MacCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavMaccod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV73MacCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV73MacCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaccod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMaccod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ConsultadeProduccion_Agrupadas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarkgm_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarkgm_Internalname, httpContext.getMessage( "Kilos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarkgm_Internalname, GXutil.ltrim( localUtil.ntoc( AV74BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarkgm_Enabled!=0) ? localUtil.format( AV74BarKgm, "ZZZZZ9.99") : localUtil.format( AV74BarKgm, "ZZZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarkgm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarkgm_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ConsultadeProduccion_Agrupadas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarmtr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarmtr_Internalname, httpContext.getMessage( "Metros", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarmtr_Internalname, GXutil.ltrim( localUtil.ntoc( AV75BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarmtr_Enabled!=0) ? localUtil.format( AV75BarMtr, "ZZZZZ9.99") : localUtil.format( AV75BarMtr, "ZZZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarmtr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarmtr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ConsultadeProduccion_Agrupadas.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarser_Internalname, GXutil.rtrim( AV62BarSer), GXutil.rtrim( localUtil.format( AV62BarSer, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarser_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarser_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ConsultadeProduccion_Agrupadas.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarserdsc_Internalname, GXutil.rtrim( AV63BarSerDsc), GXutil.rtrim( localUtil.format( AV63BarSerDsc, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarserdsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarserdsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ConsultadeProduccion_Agrupadas.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnom_Internalname, GXutil.rtrim( AV64BarColNom), GXutil.rtrim( localUtil.format( AV64BarColNom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ConsultadeProduccion_Agrupadas.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnum_Internalname, GXutil.ltrim( localUtil.ntoc( AV65BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV65BarColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV65BarColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ConsultadeProduccion_Agrupadas.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 102, 3, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ConsultadeProduccion_Agrupadas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_84_1972( true) ;
      }
      else
      {
         wb_table1_84_1972( false) ;
      }
      return  ;
   }

   public void wb_table1_84_1972e( boolean wbgen )
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
         startgridcontrol102( ) ;
      }
      if ( wbEnd == 102 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_102 = (int)(nGXsfl_102_idx-1) ;
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
         wb_table2_121_1972( true) ;
      }
      else
      {
         wb_table2_121_1972( false) ;
      }
      return  ;
   }

   public void wb_table2_121_1972e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV25GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV26GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV82Pgmname), GXutil.rtrim( localUtil.format( AV82Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ConsultadeProduccion_Agrupadas.htm");
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
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("FilterIsRange", Ddo_grid_Filterisrange);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV23DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV23DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV15ColumnsSelector);
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
      if ( wbEnd == 102 )
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

   public void start1972( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Producciones Agrupadas Tinte", ""), (short)(0)) ;
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
            strup1970( ) ;
         }
      }
   }

   public void ws1972( )
   {
      start1972( ) ;
      evt1972( ) ;
   }

   public void evt1972( )
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
                              strup1970( ) ;
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
                              strup1970( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e111972 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1970( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e121972 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1970( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e131972 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1970( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e141972 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1970( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e151972 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1970( ) ;
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
                              strup1970( ) ;
                           }
                           nGXsfl_102_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_102_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_102_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1022( ) ;
                           A13792BarAgrNhdr = httpContext.cgiGet( edtBarAgrNhdr_Internalname) ;
                           A590KgmAgr = localUtil.ctond( httpContext.cgiGet( edtKgmAgr_Internalname)) ;
                           A869MtrAgr = localUtil.ctond( httpContext.cgiGet( edtMtrAgr_Internalname)) ;
                           A671PieAgr = (short)(localUtil.ctol( httpContext.cgiGet( edtPieAgr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           AV72MacCodAgr = (int)(localUtil.ctol( httpContext.cgiGet( edtavMaccodagr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMaccodagr_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72MacCodAgr), 8, 0));
                           A1245BarAgrSer = httpContext.cgiGet( edtBarAgrSer_Internalname) ;
                           A1507BarAgrDsc = httpContext.cgiGet( edtBarAgrDsc_Internalname) ;
                           A1508CliCodAgr = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCodAgr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1510ColNomAgr = httpContext.cgiGet( edtColNomAgr_Internalname) ;
                           A1512ColNumAgr = (int)(localUtil.ctol( httpContext.cgiGet( edtColNumAgr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1509ColNoCAgr = httpContext.cgiGet( edtColNoCAgr_Internalname) ;
                           A1511ColNuCAgr = (int)(localUtil.ctol( httpContext.cgiGet( edtColNuCAgr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           if ( GXutil.len( sPrefix) == 0 )
                           {
                              A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           }
                           A119BarAgrCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarAgrCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A124BarAgrReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarAgrReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A122BarAgrPar = httpContext.cgiGet( edtBarAgrPar_Internalname) ;
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
                                       e161972 ();
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
                                       e171972 ();
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
                                       e181972 ();
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
                                          if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV12FilterFullText) != 0 )
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
                                    strup1970( ) ;
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

   public void we1972( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1972( ) ;
         }
      }
   }

   public void pa1972( )
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
      subsflControlProps_1022( ) ;
      while ( nGXsfl_102_idx <= nRC_GXsfl_102 )
      {
         sendrow_1022( ) ;
         nGXsfl_102_idx = ((subGrid_Islastpage==1)&&(nGXsfl_102_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_102_idx+1) ;
         sGXsfl_102_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_102_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1022( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV12FilterFullText ,
                                 String A396EmprCod ,
                                 int A129BarCod ,
                                 byte A132BarCodReo ,
                                 String A130BarCodPar ,
                                 byte AV20ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ,
                                 String AV21TFBarAgrNhdr ,
                                 String AV22TFBarAgrNhdr_Sel ,
                                 java.math.BigDecimal AV50TFKgmAgr ,
                                 java.math.BigDecimal AV51TFKgmAgr_To ,
                                 java.math.BigDecimal AV52TFMtrAgr ,
                                 java.math.BigDecimal AV53TFMtrAgr_To ,
                                 short AV54TFPieAgr ,
                                 short AV55TFPieAgr_To ,
                                 String AV36TFBarAgrSer ,
                                 String AV37TFBarAgrSer_Sel ,
                                 String AV38TFBarAgrDsc ,
                                 String AV39TFBarAgrDsc_Sel ,
                                 int AV40TFCliCodAgr ,
                                 int AV41TFCliCodAgr_To ,
                                 String AV42TFColNomAgr ,
                                 String AV43TFColNomAgr_Sel ,
                                 int AV44TFColNumAgr ,
                                 int AV45TFColNumAgr_To ,
                                 String AV46TFColNoCAgr ,
                                 String AV47TFColNoCAgr_Sel ,
                                 int AV48TFColNuCAgr ,
                                 int AV49TFColNuCAgr_To ,
                                 String AV82Pgmname ,
                                 short AV27OrderedBy ,
                                 boolean AV28OrderedDsc ,
                                 java.math.BigDecimal AV56TotKgmAgr ,
                                 java.math.BigDecimal AV58TotMtrAgr ,
                                 long AV60TotPieAgr ,
                                 java.math.BigDecimal AV74BarKgm ,
                                 java.math.BigDecimal AV75BarMtr ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e171972 ();
      GRID_nCurrentRecord = 0 ;
      rf1972( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ConsultadeProduccion_Agrupadas");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV82Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("consultadeproduccion_agrupadas:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf1972( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV82Pgmname = "ConsultadeProduccion_Agrupadas" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82Pgmname", AV82Pgmname);
      Gx_err = (short)(0) ;
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavPedidocliente_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPedidocliente_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPedidocliente_Enabled), 5, 0), true);
      edtavMaccod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMaccod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaccod_Enabled), 5, 0), true);
      edtavBarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm_Enabled), 5, 0), true);
      edtavBarmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmtr_Enabled), 5, 0), true);
      edtavBarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarser_Enabled), 5, 0), true);
      edtavBarserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarserdsc_Enabled), 5, 0), true);
      edtavBarcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnom_Enabled), 5, 0), true);
      edtavBarcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnum_Enabled), 5, 0), true);
      edtavMaccodagr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMaccodagr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaccodagr_Enabled), 5, 0), !bGXsfl_102_Refreshing);
      edtavTotvaluekgmagr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluekgmagr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluekgmagr_Enabled), 5, 0), true);
      edtavTotvaluemtragr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluemtragr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluemtragr_Enabled), 5, 0), true);
      edtavTotvaluepieagr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluepieagr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluepieagr_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1972( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(102) ;
      /* Execute user event: Refresh */
      e171972 ();
      nGXsfl_102_idx = 1 ;
      sGXsfl_102_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_102_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1022( ) ;
      bGXsfl_102_Refreshing = true ;
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
         subsflControlProps_1022( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV83Consultadeproduccion_agrupadasds_1_filterfulltext ,
                                              AV85Consultadeproduccion_agrupadasds_3_tfbaragrnhdr_sel ,
                                              AV84Consultadeproduccion_agrupadasds_2_tfbaragrnhdr ,
                                              AV86Consultadeproduccion_agrupadasds_4_tfkgmagr ,
                                              AV87Consultadeproduccion_agrupadasds_5_tfkgmagr_to ,
                                              AV88Consultadeproduccion_agrupadasds_6_tfmtragr ,
                                              AV89Consultadeproduccion_agrupadasds_7_tfmtragr_to ,
                                              Short.valueOf(AV90Consultadeproduccion_agrupadasds_8_tfpieagr) ,
                                              Short.valueOf(AV91Consultadeproduccion_agrupadasds_9_tfpieagr_to) ,
                                              AV93Consultadeproduccion_agrupadasds_11_tfbaragrser_sel ,
                                              AV92Consultadeproduccion_agrupadasds_10_tfbaragrser ,
                                              AV95Consultadeproduccion_agrupadasds_13_tfbaragrdsc_sel ,
                                              AV94Consultadeproduccion_agrupadasds_12_tfbaragrdsc ,
                                              Integer.valueOf(AV96Consultadeproduccion_agrupadasds_14_tfclicodagr) ,
                                              Integer.valueOf(AV97Consultadeproduccion_agrupadasds_15_tfclicodagr_to) ,
                                              AV99Consultadeproduccion_agrupadasds_17_tfcolnomagr_sel ,
                                              AV98Consultadeproduccion_agrupadasds_16_tfcolnomagr ,
                                              Integer.valueOf(AV100Consultadeproduccion_agrupadasds_18_tfcolnumagr) ,
                                              Integer.valueOf(AV101Consultadeproduccion_agrupadasds_19_tfcolnumagr_to) ,
                                              AV103Consultadeproduccion_agrupadasds_21_tfcolnocagr_sel ,
                                              AV102Consultadeproduccion_agrupadasds_20_tfcolnocagr ,
                                              Integer.valueOf(AV104Consultadeproduccion_agrupadasds_22_tfcolnucagr) ,
                                              Integer.valueOf(AV105Consultadeproduccion_agrupadasds_23_tfcolnucagr_to) ,
                                              Integer.valueOf(A119BarAgrCod) ,
                                              Byte.valueOf(A124BarAgrReo) ,
                                              A122BarAgrPar ,
                                              A590KgmAgr ,
                                              A869MtrAgr ,
                                              Short.valueOf(A671PieAgr) ,
                                              A1245BarAgrSer ,
                                              A1507BarAgrDsc ,
                                              Integer.valueOf(A1508CliCodAgr) ,
                                              A1510ColNomAgr ,
                                              Integer.valueOf(A1512ColNumAgr) ,
                                              A1509ColNoCAgr ,
                                              Integer.valueOf(A1511ColNuCAgr) ,
                                              Short.valueOf(AV27OrderedBy) ,
                                              Boolean.valueOf(AV28OrderedDsc) ,
                                              A396EmprCod ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.BYTE, TypeConstants.STRING
                                              }
         });
         lV83Consultadeproduccion_agrupadasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Consultadeproduccion_agrupadasds_1_filterfulltext), "%", "") ;
         lV83Consultadeproduccion_agrupadasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Consultadeproduccion_agrupadasds_1_filterfulltext), "%", "") ;
         lV83Consultadeproduccion_agrupadasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Consultadeproduccion_agrupadasds_1_filterfulltext), "%", "") ;
         lV83Consultadeproduccion_agrupadasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Consultadeproduccion_agrupadasds_1_filterfulltext), "%", "") ;
         lV83Consultadeproduccion_agrupadasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Consultadeproduccion_agrupadasds_1_filterfulltext), "%", "") ;
         lV83Consultadeproduccion_agrupadasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Consultadeproduccion_agrupadasds_1_filterfulltext), "%", "") ;
         lV83Consultadeproduccion_agrupadasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Consultadeproduccion_agrupadasds_1_filterfulltext), "%", "") ;
         lV83Consultadeproduccion_agrupadasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Consultadeproduccion_agrupadasds_1_filterfulltext), "%", "") ;
         lV83Consultadeproduccion_agrupadasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Consultadeproduccion_agrupadasds_1_filterfulltext), "%", "") ;
         lV83Consultadeproduccion_agrupadasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Consultadeproduccion_agrupadasds_1_filterfulltext), "%", "") ;
         lV83Consultadeproduccion_agrupadasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Consultadeproduccion_agrupadasds_1_filterfulltext), "%", "") ;
         lV84Consultadeproduccion_agrupadasds_2_tfbaragrnhdr = GXutil.padr( GXutil.rtrim( AV84Consultadeproduccion_agrupadasds_2_tfbaragrnhdr), 11, "%") ;
         lV92Consultadeproduccion_agrupadasds_10_tfbaragrser = GXutil.padr( GXutil.rtrim( AV92Consultadeproduccion_agrupadasds_10_tfbaragrser), 16, "%") ;
         lV94Consultadeproduccion_agrupadasds_12_tfbaragrdsc = GXutil.padr( GXutil.rtrim( AV94Consultadeproduccion_agrupadasds_12_tfbaragrdsc), 26, "%") ;
         lV98Consultadeproduccion_agrupadasds_16_tfcolnomagr = GXutil.padr( GXutil.rtrim( AV98Consultadeproduccion_agrupadasds_16_tfcolnomagr), 13, "%") ;
         lV102Consultadeproduccion_agrupadasds_20_tfcolnocagr = GXutil.padr( GXutil.rtrim( AV102Consultadeproduccion_agrupadasds_20_tfcolnocagr), 13, "%") ;
         /* Using cursor H01972 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, lV83Consultadeproduccion_agrupadasds_1_filterfulltext, lV83Consultadeproduccion_agrupadasds_1_filterfulltext, lV83Consultadeproduccion_agrupadasds_1_filterfulltext, lV83Consultadeproduccion_agrupadasds_1_filterfulltext, lV83Consultadeproduccion_agrupadasds_1_filterfulltext, lV83Consultadeproduccion_agrupadasds_1_filterfulltext, lV83Consultadeproduccion_agrupadasds_1_filterfulltext, lV83Consultadeproduccion_agrupadasds_1_filterfulltext, lV83Consultadeproduccion_agrupadasds_1_filterfulltext, lV83Consultadeproduccion_agrupadasds_1_filterfulltext, lV83Consultadeproduccion_agrupadasds_1_filterfulltext, lV84Consultadeproduccion_agrupadasds_2_tfbaragrnhdr, AV85Consultadeproduccion_agrupadasds_3_tfbaragrnhdr_sel, AV86Consultadeproduccion_agrupadasds_4_tfkgmagr, AV87Consultadeproduccion_agrupadasds_5_tfkgmagr_to, AV88Consultadeproduccion_agrupadasds_6_tfmtragr, AV89Consultadeproduccion_agrupadasds_7_tfmtragr_to, Short.valueOf(AV90Consultadeproduccion_agrupadasds_8_tfpieagr), Short.valueOf(AV91Consultadeproduccion_agrupadasds_9_tfpieagr_to), lV92Consultadeproduccion_agrupadasds_10_tfbaragrser, AV93Consultadeproduccion_agrupadasds_11_tfbaragrser_sel, lV94Consultadeproduccion_agrupadasds_12_tfbaragrdsc, AV95Consultadeproduccion_agrupadasds_13_tfbaragrdsc_sel, Integer.valueOf(AV96Consultadeproduccion_agrupadasds_14_tfclicodagr), Integer.valueOf(AV97Consultadeproduccion_agrupadasds_15_tfclicodagr_to), lV98Consultadeproduccion_agrupadasds_16_tfcolnomagr, AV99Consultadeproduccion_agrupadasds_17_tfcolnomagr_sel, Integer.valueOf(AV100Consultadeproduccion_agrupadasds_18_tfcolnumagr), Integer.valueOf(AV101Consultadeproduccion_agrupadasds_19_tfcolnumagr_to), lV102Consultadeproduccion_agrupadasds_20_tfcolnocagr, AV103Consultadeproduccion_agrupadasds_21_tfcolnocagr_sel, Integer.valueOf(AV104Consultadeproduccion_agrupadasds_22_tfcolnucagr), Integer.valueOf(AV105Consultadeproduccion_agrupadasds_23_tfcolnucagr_to), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_102_idx = 1 ;
         sGXsfl_102_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_102_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1022( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A1511ColNuCAgr = H01972_A1511ColNuCAgr[0] ;
            A1509ColNoCAgr = H01972_A1509ColNoCAgr[0] ;
            A1512ColNumAgr = H01972_A1512ColNumAgr[0] ;
            A1510ColNomAgr = H01972_A1510ColNomAgr[0] ;
            A1508CliCodAgr = H01972_A1508CliCodAgr[0] ;
            A1507BarAgrDsc = H01972_A1507BarAgrDsc[0] ;
            A1245BarAgrSer = H01972_A1245BarAgrSer[0] ;
            A671PieAgr = H01972_A671PieAgr[0] ;
            A869MtrAgr = H01972_A869MtrAgr[0] ;
            A590KgmAgr = H01972_A590KgmAgr[0] ;
            A122BarAgrPar = H01972_A122BarAgrPar[0] ;
            A124BarAgrReo = H01972_A124BarAgrReo[0] ;
            A119BarAgrCod = H01972_A119BarAgrCod[0] ;
            A13792BarAgrNhdr = GXutil.str( A119BarAgrCod, 8, 0) + "-" + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar ;
            e181972 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(102) ;
         wb1970( ) ;
      }
      bGXsfl_102_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1972( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTKGMAGR", GXutil.ltrim( localUtil.ntoc( AV56TotKgmAgr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTKGMAGR", getSecureSignedToken( sPrefix, localUtil.format( AV56TotKgmAgr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTMTRAGR", GXutil.ltrim( localUtil.ntoc( AV58TotMtrAgr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMTRAGR", getSecureSignedToken( sPrefix, localUtil.format( AV58TotMtrAgr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTPIEAGR", GXutil.ltrim( localUtil.ntoc( AV60TotPieAgr, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTPIEAGR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV60TotPieAgr), "ZZZ9")));
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
      AV83Consultadeproduccion_agrupadasds_1_filterfulltext = AV12FilterFullText ;
      AV84Consultadeproduccion_agrupadasds_2_tfbaragrnhdr = AV21TFBarAgrNhdr ;
      AV85Consultadeproduccion_agrupadasds_3_tfbaragrnhdr_sel = AV22TFBarAgrNhdr_Sel ;
      AV86Consultadeproduccion_agrupadasds_4_tfkgmagr = AV50TFKgmAgr ;
      AV87Consultadeproduccion_agrupadasds_5_tfkgmagr_to = AV51TFKgmAgr_To ;
      AV88Consultadeproduccion_agrupadasds_6_tfmtragr = AV52TFMtrAgr ;
      AV89Consultadeproduccion_agrupadasds_7_tfmtragr_to = AV53TFMtrAgr_To ;
      AV90Consultadeproduccion_agrupadasds_8_tfpieagr = AV54TFPieAgr ;
      AV91Consultadeproduccion_agrupadasds_9_tfpieagr_to = AV55TFPieAgr_To ;
      AV92Consultadeproduccion_agrupadasds_10_tfbaragrser = AV36TFBarAgrSer ;
      AV93Consultadeproduccion_agrupadasds_11_tfbaragrser_sel = AV37TFBarAgrSer_Sel ;
      AV94Consultadeproduccion_agrupadasds_12_tfbaragrdsc = AV38TFBarAgrDsc ;
      AV95Consultadeproduccion_agrupadasds_13_tfbaragrdsc_sel = AV39TFBarAgrDsc_Sel ;
      AV96Consultadeproduccion_agrupadasds_14_tfclicodagr = AV40TFCliCodAgr ;
      AV97Consultadeproduccion_agrupadasds_15_tfclicodagr_to = AV41TFCliCodAgr_To ;
      AV98Consultadeproduccion_agrupadasds_16_tfcolnomagr = AV42TFColNomAgr ;
      AV99Consultadeproduccion_agrupadasds_17_tfcolnomagr_sel = AV43TFColNomAgr_Sel ;
      AV100Consultadeproduccion_agrupadasds_18_tfcolnumagr = AV44TFColNumAgr ;
      AV101Consultadeproduccion_agrupadasds_19_tfcolnumagr_to = AV45TFColNumAgr_To ;
      AV102Consultadeproduccion_agrupadasds_20_tfcolnocagr = AV46TFColNoCAgr ;
      AV103Consultadeproduccion_agrupadasds_21_tfcolnocagr_sel = AV47TFColNoCAgr_Sel ;
      AV104Consultadeproduccion_agrupadasds_22_tfcolnucagr = AV48TFColNuCAgr ;
      AV105Consultadeproduccion_agrupadasds_23_tfcolnucagr_to = AV49TFColNuCAgr_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV83Consultadeproduccion_agrupadasds_1_filterfulltext ,
                                           AV85Consultadeproduccion_agrupadasds_3_tfbaragrnhdr_sel ,
                                           AV84Consultadeproduccion_agrupadasds_2_tfbaragrnhdr ,
                                           AV86Consultadeproduccion_agrupadasds_4_tfkgmagr ,
                                           AV87Consultadeproduccion_agrupadasds_5_tfkgmagr_to ,
                                           AV88Consultadeproduccion_agrupadasds_6_tfmtragr ,
                                           AV89Consultadeproduccion_agrupadasds_7_tfmtragr_to ,
                                           Short.valueOf(AV90Consultadeproduccion_agrupadasds_8_tfpieagr) ,
                                           Short.valueOf(AV91Consultadeproduccion_agrupadasds_9_tfpieagr_to) ,
                                           AV93Consultadeproduccion_agrupadasds_11_tfbaragrser_sel ,
                                           AV92Consultadeproduccion_agrupadasds_10_tfbaragrser ,
                                           AV95Consultadeproduccion_agrupadasds_13_tfbaragrdsc_sel ,
                                           AV94Consultadeproduccion_agrupadasds_12_tfbaragrdsc ,
                                           Integer.valueOf(AV96Consultadeproduccion_agrupadasds_14_tfclicodagr) ,
                                           Integer.valueOf(AV97Consultadeproduccion_agrupadasds_15_tfclicodagr_to) ,
                                           AV99Consultadeproduccion_agrupadasds_17_tfcolnomagr_sel ,
                                           AV98Consultadeproduccion_agrupadasds_16_tfcolnomagr ,
                                           Integer.valueOf(AV100Consultadeproduccion_agrupadasds_18_tfcolnumagr) ,
                                           Integer.valueOf(AV101Consultadeproduccion_agrupadasds_19_tfcolnumagr_to) ,
                                           AV103Consultadeproduccion_agrupadasds_21_tfcolnocagr_sel ,
                                           AV102Consultadeproduccion_agrupadasds_20_tfcolnocagr ,
                                           Integer.valueOf(AV104Consultadeproduccion_agrupadasds_22_tfcolnucagr) ,
                                           Integer.valueOf(AV105Consultadeproduccion_agrupadasds_23_tfcolnucagr_to) ,
                                           Integer.valueOf(A119BarAgrCod) ,
                                           Byte.valueOf(A124BarAgrReo) ,
                                           A122BarAgrPar ,
                                           A590KgmAgr ,
                                           A869MtrAgr ,
                                           Short.valueOf(A671PieAgr) ,
                                           A1245BarAgrSer ,
                                           A1507BarAgrDsc ,
                                           Integer.valueOf(A1508CliCodAgr) ,
                                           A1510ColNomAgr ,
                                           Integer.valueOf(A1512ColNumAgr) ,
                                           A1509ColNoCAgr ,
                                           Integer.valueOf(A1511ColNuCAgr) ,
                                           Short.valueOf(AV27OrderedBy) ,
                                           Boolean.valueOf(AV28OrderedDsc) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV83Consultadeproduccion_agrupadasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Consultadeproduccion_agrupadasds_1_filterfulltext), "%", "") ;
      lV83Consultadeproduccion_agrupadasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Consultadeproduccion_agrupadasds_1_filterfulltext), "%", "") ;
      lV83Consultadeproduccion_agrupadasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Consultadeproduccion_agrupadasds_1_filterfulltext), "%", "") ;
      lV83Consultadeproduccion_agrupadasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Consultadeproduccion_agrupadasds_1_filterfulltext), "%", "") ;
      lV83Consultadeproduccion_agrupadasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Consultadeproduccion_agrupadasds_1_filterfulltext), "%", "") ;
      lV83Consultadeproduccion_agrupadasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Consultadeproduccion_agrupadasds_1_filterfulltext), "%", "") ;
      lV83Consultadeproduccion_agrupadasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Consultadeproduccion_agrupadasds_1_filterfulltext), "%", "") ;
      lV83Consultadeproduccion_agrupadasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Consultadeproduccion_agrupadasds_1_filterfulltext), "%", "") ;
      lV83Consultadeproduccion_agrupadasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Consultadeproduccion_agrupadasds_1_filterfulltext), "%", "") ;
      lV83Consultadeproduccion_agrupadasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Consultadeproduccion_agrupadasds_1_filterfulltext), "%", "") ;
      lV83Consultadeproduccion_agrupadasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Consultadeproduccion_agrupadasds_1_filterfulltext), "%", "") ;
      lV84Consultadeproduccion_agrupadasds_2_tfbaragrnhdr = GXutil.padr( GXutil.rtrim( AV84Consultadeproduccion_agrupadasds_2_tfbaragrnhdr), 11, "%") ;
      lV92Consultadeproduccion_agrupadasds_10_tfbaragrser = GXutil.padr( GXutil.rtrim( AV92Consultadeproduccion_agrupadasds_10_tfbaragrser), 16, "%") ;
      lV94Consultadeproduccion_agrupadasds_12_tfbaragrdsc = GXutil.padr( GXutil.rtrim( AV94Consultadeproduccion_agrupadasds_12_tfbaragrdsc), 26, "%") ;
      lV98Consultadeproduccion_agrupadasds_16_tfcolnomagr = GXutil.padr( GXutil.rtrim( AV98Consultadeproduccion_agrupadasds_16_tfcolnomagr), 13, "%") ;
      lV102Consultadeproduccion_agrupadasds_20_tfcolnocagr = GXutil.padr( GXutil.rtrim( AV102Consultadeproduccion_agrupadasds_20_tfcolnocagr), 13, "%") ;
      /* Using cursor H01973 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, lV83Consultadeproduccion_agrupadasds_1_filterfulltext, lV83Consultadeproduccion_agrupadasds_1_filterfulltext, lV83Consultadeproduccion_agrupadasds_1_filterfulltext, lV83Consultadeproduccion_agrupadasds_1_filterfulltext, lV83Consultadeproduccion_agrupadasds_1_filterfulltext, lV83Consultadeproduccion_agrupadasds_1_filterfulltext, lV83Consultadeproduccion_agrupadasds_1_filterfulltext, lV83Consultadeproduccion_agrupadasds_1_filterfulltext, lV83Consultadeproduccion_agrupadasds_1_filterfulltext, lV83Consultadeproduccion_agrupadasds_1_filterfulltext, lV83Consultadeproduccion_agrupadasds_1_filterfulltext, lV84Consultadeproduccion_agrupadasds_2_tfbaragrnhdr, AV85Consultadeproduccion_agrupadasds_3_tfbaragrnhdr_sel, AV86Consultadeproduccion_agrupadasds_4_tfkgmagr, AV87Consultadeproduccion_agrupadasds_5_tfkgmagr_to, AV88Consultadeproduccion_agrupadasds_6_tfmtragr, AV89Consultadeproduccion_agrupadasds_7_tfmtragr_to, Short.valueOf(AV90Consultadeproduccion_agrupadasds_8_tfpieagr), Short.valueOf(AV91Consultadeproduccion_agrupadasds_9_tfpieagr_to), lV92Consultadeproduccion_agrupadasds_10_tfbaragrser, AV93Consultadeproduccion_agrupadasds_11_tfbaragrser_sel, lV94Consultadeproduccion_agrupadasds_12_tfbaragrdsc, AV95Consultadeproduccion_agrupadasds_13_tfbaragrdsc_sel, Integer.valueOf(AV96Consultadeproduccion_agrupadasds_14_tfclicodagr), Integer.valueOf(AV97Consultadeproduccion_agrupadasds_15_tfclicodagr_to), lV98Consultadeproduccion_agrupadasds_16_tfcolnomagr, AV99Consultadeproduccion_agrupadasds_17_tfcolnomagr_sel, Integer.valueOf(AV100Consultadeproduccion_agrupadasds_18_tfcolnumagr), Integer.valueOf(AV101Consultadeproduccion_agrupadasds_19_tfcolnumagr_to), lV102Consultadeproduccion_agrupadasds_20_tfcolnocagr, AV103Consultadeproduccion_agrupadasds_21_tfcolnocagr_sel, Integer.valueOf(AV104Consultadeproduccion_agrupadasds_22_tfcolnucagr), Integer.valueOf(AV105Consultadeproduccion_agrupadasds_23_tfcolnucagr_to)});
      GRID_nRecordCount = H01973_AGRID_nRecordCount[0] ;
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
      AV83Consultadeproduccion_agrupadasds_1_filterfulltext = AV12FilterFullText ;
      AV84Consultadeproduccion_agrupadasds_2_tfbaragrnhdr = AV21TFBarAgrNhdr ;
      AV85Consultadeproduccion_agrupadasds_3_tfbaragrnhdr_sel = AV22TFBarAgrNhdr_Sel ;
      AV86Consultadeproduccion_agrupadasds_4_tfkgmagr = AV50TFKgmAgr ;
      AV87Consultadeproduccion_agrupadasds_5_tfkgmagr_to = AV51TFKgmAgr_To ;
      AV88Consultadeproduccion_agrupadasds_6_tfmtragr = AV52TFMtrAgr ;
      AV89Consultadeproduccion_agrupadasds_7_tfmtragr_to = AV53TFMtrAgr_To ;
      AV90Consultadeproduccion_agrupadasds_8_tfpieagr = AV54TFPieAgr ;
      AV91Consultadeproduccion_agrupadasds_9_tfpieagr_to = AV55TFPieAgr_To ;
      AV92Consultadeproduccion_agrupadasds_10_tfbaragrser = AV36TFBarAgrSer ;
      AV93Consultadeproduccion_agrupadasds_11_tfbaragrser_sel = AV37TFBarAgrSer_Sel ;
      AV94Consultadeproduccion_agrupadasds_12_tfbaragrdsc = AV38TFBarAgrDsc ;
      AV95Consultadeproduccion_agrupadasds_13_tfbaragrdsc_sel = AV39TFBarAgrDsc_Sel ;
      AV96Consultadeproduccion_agrupadasds_14_tfclicodagr = AV40TFCliCodAgr ;
      AV97Consultadeproduccion_agrupadasds_15_tfclicodagr_to = AV41TFCliCodAgr_To ;
      AV98Consultadeproduccion_agrupadasds_16_tfcolnomagr = AV42TFColNomAgr ;
      AV99Consultadeproduccion_agrupadasds_17_tfcolnomagr_sel = AV43TFColNomAgr_Sel ;
      AV100Consultadeproduccion_agrupadasds_18_tfcolnumagr = AV44TFColNumAgr ;
      AV101Consultadeproduccion_agrupadasds_19_tfcolnumagr_to = AV45TFColNumAgr_To ;
      AV102Consultadeproduccion_agrupadasds_20_tfcolnocagr = AV46TFColNoCAgr ;
      AV103Consultadeproduccion_agrupadasds_21_tfcolnocagr_sel = AV47TFColNoCAgr_Sel ;
      AV104Consultadeproduccion_agrupadasds_22_tfcolnucagr = AV48TFColNuCAgr ;
      AV105Consultadeproduccion_agrupadasds_23_tfcolnucagr_to = AV49TFColNuCAgr_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV12FilterFullText, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV20ManageFiltersExecutionStep, AV15ColumnsSelector, AV21TFBarAgrNhdr, AV22TFBarAgrNhdr_Sel, AV50TFKgmAgr, AV51TFKgmAgr_To, AV52TFMtrAgr, AV53TFMtrAgr_To, AV54TFPieAgr, AV55TFPieAgr_To, AV36TFBarAgrSer, AV37TFBarAgrSer_Sel, AV38TFBarAgrDsc, AV39TFBarAgrDsc_Sel, AV40TFCliCodAgr, AV41TFCliCodAgr_To, AV42TFColNomAgr, AV43TFColNomAgr_Sel, AV44TFColNumAgr, AV45TFColNumAgr_To, AV46TFColNoCAgr, AV47TFColNoCAgr_Sel, AV48TFColNuCAgr, AV49TFColNuCAgr_To, AV82Pgmname, AV27OrderedBy, AV28OrderedDsc, AV56TotKgmAgr, AV58TotMtrAgr, AV60TotPieAgr, AV74BarKgm, AV75BarMtr, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV83Consultadeproduccion_agrupadasds_1_filterfulltext = AV12FilterFullText ;
      AV84Consultadeproduccion_agrupadasds_2_tfbaragrnhdr = AV21TFBarAgrNhdr ;
      AV85Consultadeproduccion_agrupadasds_3_tfbaragrnhdr_sel = AV22TFBarAgrNhdr_Sel ;
      AV86Consultadeproduccion_agrupadasds_4_tfkgmagr = AV50TFKgmAgr ;
      AV87Consultadeproduccion_agrupadasds_5_tfkgmagr_to = AV51TFKgmAgr_To ;
      AV88Consultadeproduccion_agrupadasds_6_tfmtragr = AV52TFMtrAgr ;
      AV89Consultadeproduccion_agrupadasds_7_tfmtragr_to = AV53TFMtrAgr_To ;
      AV90Consultadeproduccion_agrupadasds_8_tfpieagr = AV54TFPieAgr ;
      AV91Consultadeproduccion_agrupadasds_9_tfpieagr_to = AV55TFPieAgr_To ;
      AV92Consultadeproduccion_agrupadasds_10_tfbaragrser = AV36TFBarAgrSer ;
      AV93Consultadeproduccion_agrupadasds_11_tfbaragrser_sel = AV37TFBarAgrSer_Sel ;
      AV94Consultadeproduccion_agrupadasds_12_tfbaragrdsc = AV38TFBarAgrDsc ;
      AV95Consultadeproduccion_agrupadasds_13_tfbaragrdsc_sel = AV39TFBarAgrDsc_Sel ;
      AV96Consultadeproduccion_agrupadasds_14_tfclicodagr = AV40TFCliCodAgr ;
      AV97Consultadeproduccion_agrupadasds_15_tfclicodagr_to = AV41TFCliCodAgr_To ;
      AV98Consultadeproduccion_agrupadasds_16_tfcolnomagr = AV42TFColNomAgr ;
      AV99Consultadeproduccion_agrupadasds_17_tfcolnomagr_sel = AV43TFColNomAgr_Sel ;
      AV100Consultadeproduccion_agrupadasds_18_tfcolnumagr = AV44TFColNumAgr ;
      AV101Consultadeproduccion_agrupadasds_19_tfcolnumagr_to = AV45TFColNumAgr_To ;
      AV102Consultadeproduccion_agrupadasds_20_tfcolnocagr = AV46TFColNoCAgr ;
      AV103Consultadeproduccion_agrupadasds_21_tfcolnocagr_sel = AV47TFColNoCAgr_Sel ;
      AV104Consultadeproduccion_agrupadasds_22_tfcolnucagr = AV48TFColNuCAgr ;
      AV105Consultadeproduccion_agrupadasds_23_tfcolnucagr_to = AV49TFColNuCAgr_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV12FilterFullText, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV20ManageFiltersExecutionStep, AV15ColumnsSelector, AV21TFBarAgrNhdr, AV22TFBarAgrNhdr_Sel, AV50TFKgmAgr, AV51TFKgmAgr_To, AV52TFMtrAgr, AV53TFMtrAgr_To, AV54TFPieAgr, AV55TFPieAgr_To, AV36TFBarAgrSer, AV37TFBarAgrSer_Sel, AV38TFBarAgrDsc, AV39TFBarAgrDsc_Sel, AV40TFCliCodAgr, AV41TFCliCodAgr_To, AV42TFColNomAgr, AV43TFColNomAgr_Sel, AV44TFColNumAgr, AV45TFColNumAgr_To, AV46TFColNoCAgr, AV47TFColNoCAgr_Sel, AV48TFColNuCAgr, AV49TFColNuCAgr_To, AV82Pgmname, AV27OrderedBy, AV28OrderedDsc, AV56TotKgmAgr, AV58TotMtrAgr, AV60TotPieAgr, AV74BarKgm, AV75BarMtr, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV83Consultadeproduccion_agrupadasds_1_filterfulltext = AV12FilterFullText ;
      AV84Consultadeproduccion_agrupadasds_2_tfbaragrnhdr = AV21TFBarAgrNhdr ;
      AV85Consultadeproduccion_agrupadasds_3_tfbaragrnhdr_sel = AV22TFBarAgrNhdr_Sel ;
      AV86Consultadeproduccion_agrupadasds_4_tfkgmagr = AV50TFKgmAgr ;
      AV87Consultadeproduccion_agrupadasds_5_tfkgmagr_to = AV51TFKgmAgr_To ;
      AV88Consultadeproduccion_agrupadasds_6_tfmtragr = AV52TFMtrAgr ;
      AV89Consultadeproduccion_agrupadasds_7_tfmtragr_to = AV53TFMtrAgr_To ;
      AV90Consultadeproduccion_agrupadasds_8_tfpieagr = AV54TFPieAgr ;
      AV91Consultadeproduccion_agrupadasds_9_tfpieagr_to = AV55TFPieAgr_To ;
      AV92Consultadeproduccion_agrupadasds_10_tfbaragrser = AV36TFBarAgrSer ;
      AV93Consultadeproduccion_agrupadasds_11_tfbaragrser_sel = AV37TFBarAgrSer_Sel ;
      AV94Consultadeproduccion_agrupadasds_12_tfbaragrdsc = AV38TFBarAgrDsc ;
      AV95Consultadeproduccion_agrupadasds_13_tfbaragrdsc_sel = AV39TFBarAgrDsc_Sel ;
      AV96Consultadeproduccion_agrupadasds_14_tfclicodagr = AV40TFCliCodAgr ;
      AV97Consultadeproduccion_agrupadasds_15_tfclicodagr_to = AV41TFCliCodAgr_To ;
      AV98Consultadeproduccion_agrupadasds_16_tfcolnomagr = AV42TFColNomAgr ;
      AV99Consultadeproduccion_agrupadasds_17_tfcolnomagr_sel = AV43TFColNomAgr_Sel ;
      AV100Consultadeproduccion_agrupadasds_18_tfcolnumagr = AV44TFColNumAgr ;
      AV101Consultadeproduccion_agrupadasds_19_tfcolnumagr_to = AV45TFColNumAgr_To ;
      AV102Consultadeproduccion_agrupadasds_20_tfcolnocagr = AV46TFColNoCAgr ;
      AV103Consultadeproduccion_agrupadasds_21_tfcolnocagr_sel = AV47TFColNoCAgr_Sel ;
      AV104Consultadeproduccion_agrupadasds_22_tfcolnucagr = AV48TFColNuCAgr ;
      AV105Consultadeproduccion_agrupadasds_23_tfcolnucagr_to = AV49TFColNuCAgr_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV12FilterFullText, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV20ManageFiltersExecutionStep, AV15ColumnsSelector, AV21TFBarAgrNhdr, AV22TFBarAgrNhdr_Sel, AV50TFKgmAgr, AV51TFKgmAgr_To, AV52TFMtrAgr, AV53TFMtrAgr_To, AV54TFPieAgr, AV55TFPieAgr_To, AV36TFBarAgrSer, AV37TFBarAgrSer_Sel, AV38TFBarAgrDsc, AV39TFBarAgrDsc_Sel, AV40TFCliCodAgr, AV41TFCliCodAgr_To, AV42TFColNomAgr, AV43TFColNomAgr_Sel, AV44TFColNumAgr, AV45TFColNumAgr_To, AV46TFColNoCAgr, AV47TFColNoCAgr_Sel, AV48TFColNuCAgr, AV49TFColNuCAgr_To, AV82Pgmname, AV27OrderedBy, AV28OrderedDsc, AV56TotKgmAgr, AV58TotMtrAgr, AV60TotPieAgr, AV74BarKgm, AV75BarMtr, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV83Consultadeproduccion_agrupadasds_1_filterfulltext = AV12FilterFullText ;
      AV84Consultadeproduccion_agrupadasds_2_tfbaragrnhdr = AV21TFBarAgrNhdr ;
      AV85Consultadeproduccion_agrupadasds_3_tfbaragrnhdr_sel = AV22TFBarAgrNhdr_Sel ;
      AV86Consultadeproduccion_agrupadasds_4_tfkgmagr = AV50TFKgmAgr ;
      AV87Consultadeproduccion_agrupadasds_5_tfkgmagr_to = AV51TFKgmAgr_To ;
      AV88Consultadeproduccion_agrupadasds_6_tfmtragr = AV52TFMtrAgr ;
      AV89Consultadeproduccion_agrupadasds_7_tfmtragr_to = AV53TFMtrAgr_To ;
      AV90Consultadeproduccion_agrupadasds_8_tfpieagr = AV54TFPieAgr ;
      AV91Consultadeproduccion_agrupadasds_9_tfpieagr_to = AV55TFPieAgr_To ;
      AV92Consultadeproduccion_agrupadasds_10_tfbaragrser = AV36TFBarAgrSer ;
      AV93Consultadeproduccion_agrupadasds_11_tfbaragrser_sel = AV37TFBarAgrSer_Sel ;
      AV94Consultadeproduccion_agrupadasds_12_tfbaragrdsc = AV38TFBarAgrDsc ;
      AV95Consultadeproduccion_agrupadasds_13_tfbaragrdsc_sel = AV39TFBarAgrDsc_Sel ;
      AV96Consultadeproduccion_agrupadasds_14_tfclicodagr = AV40TFCliCodAgr ;
      AV97Consultadeproduccion_agrupadasds_15_tfclicodagr_to = AV41TFCliCodAgr_To ;
      AV98Consultadeproduccion_agrupadasds_16_tfcolnomagr = AV42TFColNomAgr ;
      AV99Consultadeproduccion_agrupadasds_17_tfcolnomagr_sel = AV43TFColNomAgr_Sel ;
      AV100Consultadeproduccion_agrupadasds_18_tfcolnumagr = AV44TFColNumAgr ;
      AV101Consultadeproduccion_agrupadasds_19_tfcolnumagr_to = AV45TFColNumAgr_To ;
      AV102Consultadeproduccion_agrupadasds_20_tfcolnocagr = AV46TFColNoCAgr ;
      AV103Consultadeproduccion_agrupadasds_21_tfcolnocagr_sel = AV47TFColNoCAgr_Sel ;
      AV104Consultadeproduccion_agrupadasds_22_tfcolnucagr = AV48TFColNuCAgr ;
      AV105Consultadeproduccion_agrupadasds_23_tfcolnucagr_to = AV49TFColNuCAgr_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV12FilterFullText, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV20ManageFiltersExecutionStep, AV15ColumnsSelector, AV21TFBarAgrNhdr, AV22TFBarAgrNhdr_Sel, AV50TFKgmAgr, AV51TFKgmAgr_To, AV52TFMtrAgr, AV53TFMtrAgr_To, AV54TFPieAgr, AV55TFPieAgr_To, AV36TFBarAgrSer, AV37TFBarAgrSer_Sel, AV38TFBarAgrDsc, AV39TFBarAgrDsc_Sel, AV40TFCliCodAgr, AV41TFCliCodAgr_To, AV42TFColNomAgr, AV43TFColNomAgr_Sel, AV44TFColNumAgr, AV45TFColNumAgr_To, AV46TFColNoCAgr, AV47TFColNoCAgr_Sel, AV48TFColNuCAgr, AV49TFColNuCAgr_To, AV82Pgmname, AV27OrderedBy, AV28OrderedDsc, AV56TotKgmAgr, AV58TotMtrAgr, AV60TotPieAgr, AV74BarKgm, AV75BarMtr, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV83Consultadeproduccion_agrupadasds_1_filterfulltext = AV12FilterFullText ;
      AV84Consultadeproduccion_agrupadasds_2_tfbaragrnhdr = AV21TFBarAgrNhdr ;
      AV85Consultadeproduccion_agrupadasds_3_tfbaragrnhdr_sel = AV22TFBarAgrNhdr_Sel ;
      AV86Consultadeproduccion_agrupadasds_4_tfkgmagr = AV50TFKgmAgr ;
      AV87Consultadeproduccion_agrupadasds_5_tfkgmagr_to = AV51TFKgmAgr_To ;
      AV88Consultadeproduccion_agrupadasds_6_tfmtragr = AV52TFMtrAgr ;
      AV89Consultadeproduccion_agrupadasds_7_tfmtragr_to = AV53TFMtrAgr_To ;
      AV90Consultadeproduccion_agrupadasds_8_tfpieagr = AV54TFPieAgr ;
      AV91Consultadeproduccion_agrupadasds_9_tfpieagr_to = AV55TFPieAgr_To ;
      AV92Consultadeproduccion_agrupadasds_10_tfbaragrser = AV36TFBarAgrSer ;
      AV93Consultadeproduccion_agrupadasds_11_tfbaragrser_sel = AV37TFBarAgrSer_Sel ;
      AV94Consultadeproduccion_agrupadasds_12_tfbaragrdsc = AV38TFBarAgrDsc ;
      AV95Consultadeproduccion_agrupadasds_13_tfbaragrdsc_sel = AV39TFBarAgrDsc_Sel ;
      AV96Consultadeproduccion_agrupadasds_14_tfclicodagr = AV40TFCliCodAgr ;
      AV97Consultadeproduccion_agrupadasds_15_tfclicodagr_to = AV41TFCliCodAgr_To ;
      AV98Consultadeproduccion_agrupadasds_16_tfcolnomagr = AV42TFColNomAgr ;
      AV99Consultadeproduccion_agrupadasds_17_tfcolnomagr_sel = AV43TFColNomAgr_Sel ;
      AV100Consultadeproduccion_agrupadasds_18_tfcolnumagr = AV44TFColNumAgr ;
      AV101Consultadeproduccion_agrupadasds_19_tfcolnumagr_to = AV45TFColNumAgr_To ;
      AV102Consultadeproduccion_agrupadasds_20_tfcolnocagr = AV46TFColNoCAgr ;
      AV103Consultadeproduccion_agrupadasds_21_tfcolnocagr_sel = AV47TFColNoCAgr_Sel ;
      AV104Consultadeproduccion_agrupadasds_22_tfcolnucagr = AV48TFColNuCAgr ;
      AV105Consultadeproduccion_agrupadasds_23_tfcolnucagr_to = AV49TFColNuCAgr_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV12FilterFullText, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV20ManageFiltersExecutionStep, AV15ColumnsSelector, AV21TFBarAgrNhdr, AV22TFBarAgrNhdr_Sel, AV50TFKgmAgr, AV51TFKgmAgr_To, AV52TFMtrAgr, AV53TFMtrAgr_To, AV54TFPieAgr, AV55TFPieAgr_To, AV36TFBarAgrSer, AV37TFBarAgrSer_Sel, AV38TFBarAgrDsc, AV39TFBarAgrDsc_Sel, AV40TFCliCodAgr, AV41TFCliCodAgr_To, AV42TFColNomAgr, AV43TFColNomAgr_Sel, AV44TFColNumAgr, AV45TFColNumAgr_To, AV46TFColNoCAgr, AV47TFColNoCAgr_Sel, AV48TFColNuCAgr, AV49TFColNuCAgr_To, AV82Pgmname, AV27OrderedBy, AV28OrderedDsc, AV56TotKgmAgr, AV58TotMtrAgr, AV60TotPieAgr, AV74BarKgm, AV75BarMtr, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV82Pgmname = "ConsultadeProduccion_Agrupadas" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82Pgmname", AV82Pgmname);
      Gx_err = (short)(0) ;
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavPedidocliente_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPedidocliente_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPedidocliente_Enabled), 5, 0), true);
      edtavMaccod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMaccod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaccod_Enabled), 5, 0), true);
      edtavBarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm_Enabled), 5, 0), true);
      edtavBarmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmtr_Enabled), 5, 0), true);
      edtavBarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarser_Enabled), 5, 0), true);
      edtavBarserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarserdsc_Enabled), 5, 0), true);
      edtavBarcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnom_Enabled), 5, 0), true);
      edtavBarcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnum_Enabled), 5, 0), true);
      edtavMaccodagr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMaccodagr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaccodagr_Enabled), 5, 0), !bGXsfl_102_Refreshing);
      edtavTotvaluekgmagr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluekgmagr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluekgmagr_Enabled), 5, 0), true);
      edtavTotvaluemtragr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluemtragr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluemtragr_Enabled), 5, 0), true);
      edtavTotvaluepieagr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluepieagr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluepieagr_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1970( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e161972 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV18ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV23DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV15ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_102 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_102"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV25GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV26GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
         wcpOA129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOA132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOA130BarCodPar = httpContext.cgiGet( sPrefix+"wcpOA130BarCodPar") ;
         wcpOAV66CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV66CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV67CliNom = httpContext.cgiGet( sPrefix+"wcpOAV67CliNom") ;
         wcpOAV68PedidoCliente = httpContext.cgiGet( sPrefix+"wcpOAV68PedidoCliente") ;
         wcpOAV62BarSer = httpContext.cgiGet( sPrefix+"wcpOAV62BarSer") ;
         wcpOAV63BarSerDsc = httpContext.cgiGet( sPrefix+"wcpOAV63BarSerDsc") ;
         wcpOAV64BarColNom = httpContext.cgiGet( sPrefix+"wcpOAV64BarColNom") ;
         wcpOAV65BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV65BarColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV73MacCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV73MacCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV74BarKgm = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV74BarKgm")) ;
         wcpOAV75BarMtr = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV75BarMtr")) ;
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
         AV12FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12FilterFullText", AV12FilterFullText);
         AV57TotValueKgmAgr = httpContext.cgiGet( edtavTotvaluekgmagr_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TotValueKgmAgr", AV57TotValueKgmAgr);
         AV59TotValueMtrAgr = httpContext.cgiGet( edtavTotvaluemtragr_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TotValueMtrAgr", AV59TotValueMtrAgr);
         AV61TotValuePieAgr = httpContext.cgiGet( edtavTotvaluepieagr_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TotValuePieAgr", AV61TotValuePieAgr);
         AV82Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82Pgmname", AV82Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ConsultadeProduccion_Agrupadas");
         AV82Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82Pgmname", AV82Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV82Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("consultadeproduccion_agrupadas:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV12FilterFullText) != 0 )
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
      e161972 ();
      if (returnInSub) return;
   }

   public void e161972( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV76Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      consultadeproduccion_agrupadas_impl.this.GXt_char1 = GXv_char2[0] ;
      AV76Station = GXt_char1 ;
      GXv_char2[0] = AV77EmprCod ;
      GXv_char3[0] = AV78EmprNom ;
      GXv_char4[0] = AV79UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV76Station, GXv_char2, GXv_char3, GXv_char4) ;
      consultadeproduccion_agrupadas_impl.this.AV77EmprCod = GXv_char2[0] ;
      consultadeproduccion_agrupadas_impl.this.AV78EmprNom = GXv_char3[0] ;
      consultadeproduccion_agrupadas_impl.this.AV79UsurCod = GXv_char4[0] ;
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
      if ( AV27OrderedBy < 1 )
      {
         AV27OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV23DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV23DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e171972( )
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
      if ( AV20ManageFiltersExecutionStep == 1 )
      {
         AV20ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20ManageFiltersExecutionStep", GXutil.str( AV20ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV20ManageFiltersExecutionStep == 2 )
      {
         AV20ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20ManageFiltersExecutionStep", GXutil.str( AV20ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV17Session.getValue("ConsultadeProduccion_AgrupadasColumnsSelector"), "") != 0 )
      {
         AV13ColumnsSelectorXML = AV17Session.getValue("ConsultadeProduccion_AgrupadasColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV13ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtBarAgrNhdr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarAgrNhdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrNhdr_Visible), 5, 0), !bGXsfl_102_Refreshing);
      edtKgmAgr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtKgmAgr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtKgmAgr_Visible), 5, 0), !bGXsfl_102_Refreshing);
      edtMtrAgr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMtrAgr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMtrAgr_Visible), 5, 0), !bGXsfl_102_Refreshing);
      edtPieAgr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPieAgr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPieAgr_Visible), 5, 0), !bGXsfl_102_Refreshing);
      edtavMaccodagr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMaccodagr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaccodagr_Visible), 5, 0), !bGXsfl_102_Refreshing);
      edtBarAgrSer_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarAgrSer_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrSer_Visible), 5, 0), !bGXsfl_102_Refreshing);
      edtBarAgrDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarAgrDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrDsc_Visible), 5, 0), !bGXsfl_102_Refreshing);
      edtCliCodAgr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliCodAgr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCodAgr_Visible), 5, 0), !bGXsfl_102_Refreshing);
      edtColNomAgr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtColNomAgr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColNomAgr_Visible), 5, 0), !bGXsfl_102_Refreshing);
      edtColNumAgr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtColNumAgr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColNumAgr_Visible), 5, 0), !bGXsfl_102_Refreshing);
      edtColNoCAgr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtColNoCAgr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColNoCAgr_Visible), 5, 0), !bGXsfl_102_Refreshing);
      edtColNuCAgr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtColNuCAgr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColNuCAgr_Visible), 5, 0), !bGXsfl_102_Refreshing);
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S172 ();
      if (returnInSub) return;
      AV25GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25GridCurrentPage), 10, 0));
      AV26GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26GridPageCount), 10, 0));
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S182 ();
      if (returnInSub) return;
      AV83Consultadeproduccion_agrupadasds_1_filterfulltext = AV12FilterFullText ;
      AV84Consultadeproduccion_agrupadasds_2_tfbaragrnhdr = AV21TFBarAgrNhdr ;
      AV85Consultadeproduccion_agrupadasds_3_tfbaragrnhdr_sel = AV22TFBarAgrNhdr_Sel ;
      AV86Consultadeproduccion_agrupadasds_4_tfkgmagr = AV50TFKgmAgr ;
      AV87Consultadeproduccion_agrupadasds_5_tfkgmagr_to = AV51TFKgmAgr_To ;
      AV88Consultadeproduccion_agrupadasds_6_tfmtragr = AV52TFMtrAgr ;
      AV89Consultadeproduccion_agrupadasds_7_tfmtragr_to = AV53TFMtrAgr_To ;
      AV90Consultadeproduccion_agrupadasds_8_tfpieagr = AV54TFPieAgr ;
      AV91Consultadeproduccion_agrupadasds_9_tfpieagr_to = AV55TFPieAgr_To ;
      AV92Consultadeproduccion_agrupadasds_10_tfbaragrser = AV36TFBarAgrSer ;
      AV93Consultadeproduccion_agrupadasds_11_tfbaragrser_sel = AV37TFBarAgrSer_Sel ;
      AV94Consultadeproduccion_agrupadasds_12_tfbaragrdsc = AV38TFBarAgrDsc ;
      AV95Consultadeproduccion_agrupadasds_13_tfbaragrdsc_sel = AV39TFBarAgrDsc_Sel ;
      AV96Consultadeproduccion_agrupadasds_14_tfclicodagr = AV40TFCliCodAgr ;
      AV97Consultadeproduccion_agrupadasds_15_tfclicodagr_to = AV41TFCliCodAgr_To ;
      AV98Consultadeproduccion_agrupadasds_16_tfcolnomagr = AV42TFColNomAgr ;
      AV99Consultadeproduccion_agrupadasds_17_tfcolnomagr_sel = AV43TFColNomAgr_Sel ;
      AV100Consultadeproduccion_agrupadasds_18_tfcolnumagr = AV44TFColNumAgr ;
      AV101Consultadeproduccion_agrupadasds_19_tfcolnumagr_to = AV45TFColNumAgr_To ;
      AV102Consultadeproduccion_agrupadasds_20_tfcolnocagr = AV46TFColNoCAgr ;
      AV103Consultadeproduccion_agrupadasds_21_tfcolnocagr_sel = AV47TFColNoCAgr_Sel ;
      AV104Consultadeproduccion_agrupadasds_22_tfcolnucagr = AV48TFColNuCAgr ;
      AV105Consultadeproduccion_agrupadasds_23_tfcolnucagr_to = AV49TFColNuCAgr_To ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV15ColumnsSelector", AV15ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV18ManageFiltersData", AV18ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e121972( )
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
         AV24PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV24PageToGo) ;
      }
   }

   public void e131972( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e141972( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV27OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27OrderedBy), 4, 0));
         AV28OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28OrderedDsc", AV28OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAgrNhdr") == 0 )
         {
            AV21TFBarAgrNhdr = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21TFBarAgrNhdr", AV21TFBarAgrNhdr);
            AV22TFBarAgrNhdr_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22TFBarAgrNhdr_Sel", AV22TFBarAgrNhdr_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "KgmAgr") == 0 )
         {
            AV50TFKgmAgr = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFKgmAgr", GXutil.ltrimstr( AV50TFKgmAgr, 9, 2));
            AV51TFKgmAgr_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFKgmAgr_To", GXutil.ltrimstr( AV51TFKgmAgr_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MtrAgr") == 0 )
         {
            AV52TFMtrAgr = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFMtrAgr", GXutil.ltrimstr( AV52TFMtrAgr, 9, 2));
            AV53TFMtrAgr_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFMtrAgr_To", GXutil.ltrimstr( AV53TFMtrAgr_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PieAgr") == 0 )
         {
            AV54TFPieAgr = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFPieAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFPieAgr), 4, 0));
            AV55TFPieAgr_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFPieAgr_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFPieAgr_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAgrSer") == 0 )
         {
            AV36TFBarAgrSer = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFBarAgrSer", AV36TFBarAgrSer);
            AV37TFBarAgrSer_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFBarAgrSer_Sel", AV37TFBarAgrSer_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAgrDsc") == 0 )
         {
            AV38TFBarAgrDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFBarAgrDsc", AV38TFBarAgrDsc);
            AV39TFBarAgrDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFBarAgrDsc_Sel", AV39TFBarAgrDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliCodAgr") == 0 )
         {
            AV40TFCliCodAgr = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFCliCodAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TFCliCodAgr), 6, 0));
            AV41TFCliCodAgr_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFCliCodAgr_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFCliCodAgr_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ColNomAgr") == 0 )
         {
            AV42TFColNomAgr = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFColNomAgr", AV42TFColNomAgr);
            AV43TFColNomAgr_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFColNomAgr_Sel", AV43TFColNomAgr_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ColNumAgr") == 0 )
         {
            AV44TFColNumAgr = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFColNumAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFColNumAgr), 6, 0));
            AV45TFColNumAgr_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFColNumAgr_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFColNumAgr_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ColNoCAgr") == 0 )
         {
            AV46TFColNoCAgr = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFColNoCAgr", AV46TFColNoCAgr);
            AV47TFColNoCAgr_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFColNoCAgr_Sel", AV47TFColNoCAgr_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ColNuCAgr") == 0 )
         {
            AV48TFColNuCAgr = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFColNuCAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFColNuCAgr), 6, 0));
            AV49TFColNuCAgr_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFColNuCAgr_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFColNuCAgr_To), 6, 0));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e181972( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      GXt_int8 = AV72MacCodAgr ;
      GXv_int9[0] = GXt_int8 ;
      new app.pbusmace(remoteHandle, context).execute( A396EmprCod, A119BarAgrCod, A124BarAgrReo, A122BarAgrPar, GXv_int9) ;
      consultadeproduccion_agrupadas_impl.this.GXt_int8 = GXv_int9[0] ;
      AV72MacCodAgr = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMaccodagr_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72MacCodAgr), 8, 0));
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(102) ;
      }
      sendrow_1022( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_102_Refreshing )
      {
         httpContext.doAjaxLoad(102, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e151972( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV13ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV15ColumnsSelector.fromJSonString(AV13ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "ConsultadeProduccion_AgrupadasColumnsSelector", ((GXutil.strcmp("", AV13ColumnsSelectorXML)==0) ? "" : AV15ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV15ColumnsSelector", AV15ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV18ManageFiltersData", AV18ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e111972( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S192 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S152 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("ConsultadeProduccion_AgrupadasFilters")),GXutil.URLEncode(GXutil.rtrim(AV82Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV20ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20ManageFiltersExecutionStep", GXutil.str( AV20ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("ConsultadeProduccion_AgrupadasFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV20ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20ManageFiltersExecutionStep", GXutil.str( AV20ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV19ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "ConsultadeProduccion_AgrupadasFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         consultadeproduccion_agrupadas_impl.this.GXt_char1 = GXv_char4[0] ;
         AV19ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV19ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S192 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV82Pgmname+"GridState", AV19ManageFiltersXml) ;
            AV10GridState.fromxml(AV19ManageFiltersXml, null, null);
            AV27OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27OrderedBy), 4, 0));
            AV28OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28OrderedDsc", AV28OrderedDsc);
            /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
            S142 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S202 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefreshCmp(sPrefix);
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV15ColumnsSelector", AV15ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV18ManageFiltersData", AV18ManageFiltersData);
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV27OrderedBy, 4, 0))+":"+(AV28OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV15ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "BarAgrNhdr", "", "Nº HDR", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "KgmAgr", "", "Kilos", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "MtrAgr", "", "Metros", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "PieAgr", "", "Piezas", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "&MacCodAgr", "", "Nº Macro", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "BarAgrSer", "", "Articulo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "BarAgrDsc", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CliCodAgr", "", "Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "ColNomAgr", "", "Color", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "ColNumAgr", "", "Numero", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "ColNoCAgr", "", "Color Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "ColNuCAgr", "", "N° Color Cliente", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXt_char1 = AV14UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "ConsultadeProduccion_AgrupadasColumnsSelector", GXv_char4) ;
      consultadeproduccion_agrupadas_impl.this.GXt_char1 = GXv_char4[0] ;
      AV14UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV14UserCustomValue)==0) ) )
      {
         AV16ColumnsSelectorAux.fromxml(AV14UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector10[0] = AV16ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector11[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, GXv_SdtWWPColumnsSelector11) ;
         AV16ColumnsSelectorAux = GXv_SdtWWPColumnsSelector10[0] ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = AV18ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "ConsultadeProduccion_AgrupadasFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[0] ;
      AV18ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
   }

   public void S192( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV12FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12FilterFullText", AV12FilterFullText);
      AV21TFBarAgrNhdr = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21TFBarAgrNhdr", AV21TFBarAgrNhdr);
      AV22TFBarAgrNhdr_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22TFBarAgrNhdr_Sel", AV22TFBarAgrNhdr_Sel);
      AV50TFKgmAgr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFKgmAgr", GXutil.ltrimstr( AV50TFKgmAgr, 9, 2));
      AV51TFKgmAgr_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFKgmAgr_To", GXutil.ltrimstr( AV51TFKgmAgr_To, 9, 2));
      AV52TFMtrAgr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFMtrAgr", GXutil.ltrimstr( AV52TFMtrAgr, 9, 2));
      AV53TFMtrAgr_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFMtrAgr_To", GXutil.ltrimstr( AV53TFMtrAgr_To, 9, 2));
      AV54TFPieAgr = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFPieAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFPieAgr), 4, 0));
      AV55TFPieAgr_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFPieAgr_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFPieAgr_To), 4, 0));
      AV36TFBarAgrSer = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFBarAgrSer", AV36TFBarAgrSer);
      AV37TFBarAgrSer_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFBarAgrSer_Sel", AV37TFBarAgrSer_Sel);
      AV38TFBarAgrDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFBarAgrDsc", AV38TFBarAgrDsc);
      AV39TFBarAgrDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFBarAgrDsc_Sel", AV39TFBarAgrDsc_Sel);
      AV40TFCliCodAgr = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFCliCodAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TFCliCodAgr), 6, 0));
      AV41TFCliCodAgr_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFCliCodAgr_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFCliCodAgr_To), 6, 0));
      AV42TFColNomAgr = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFColNomAgr", AV42TFColNomAgr);
      AV43TFColNomAgr_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFColNomAgr_Sel", AV43TFColNomAgr_Sel);
      AV44TFColNumAgr = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFColNumAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFColNumAgr), 6, 0));
      AV45TFColNumAgr_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFColNumAgr_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFColNumAgr_To), 6, 0));
      AV46TFColNoCAgr = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFColNoCAgr", AV46TFColNoCAgr);
      AV47TFColNoCAgr_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFColNoCAgr_Sel", AV47TFColNoCAgr_Sel);
      AV48TFColNuCAgr = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFColNuCAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFColNuCAgr), 6, 0));
      AV49TFColNuCAgr_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFColNuCAgr_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFColNuCAgr_To), 6, 0));
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
      if ( GXutil.strcmp(AV17Session.getValue(AV82Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV82Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV17Session.getValue(AV82Pgmname+"GridState"), null, null);
      }
      AV27OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27OrderedBy), 4, 0));
      AV28OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28OrderedDsc", AV28OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S202 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S202( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV106GXV1 = 1 ;
      while ( AV106GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV106GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12FilterFullText", AV12FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRNHDR") == 0 )
         {
            AV21TFBarAgrNhdr = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21TFBarAgrNhdr", AV21TFBarAgrNhdr);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRNHDR_SEL") == 0 )
         {
            AV22TFBarAgrNhdr_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22TFBarAgrNhdr_Sel", AV22TFBarAgrNhdr_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFKGMAGR") == 0 )
         {
            AV50TFKgmAgr = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFKgmAgr", GXutil.ltrimstr( AV50TFKgmAgr, 9, 2));
            AV51TFKgmAgr_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFKgmAgr_To", GXutil.ltrimstr( AV51TFKgmAgr_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMTRAGR") == 0 )
         {
            AV52TFMtrAgr = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFMtrAgr", GXutil.ltrimstr( AV52TFMtrAgr, 9, 2));
            AV53TFMtrAgr_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFMtrAgr_To", GXutil.ltrimstr( AV53TFMtrAgr_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPIEAGR") == 0 )
         {
            AV54TFPieAgr = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFPieAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFPieAgr), 4, 0));
            AV55TFPieAgr_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFPieAgr_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFPieAgr_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRSER") == 0 )
         {
            AV36TFBarAgrSer = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFBarAgrSer", AV36TFBarAgrSer);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRSER_SEL") == 0 )
         {
            AV37TFBarAgrSer_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFBarAgrSer_Sel", AV37TFBarAgrSer_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRDSC") == 0 )
         {
            AV38TFBarAgrDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFBarAgrDsc", AV38TFBarAgrDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRDSC_SEL") == 0 )
         {
            AV39TFBarAgrDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFBarAgrDsc_Sel", AV39TFBarAgrDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICODAGR") == 0 )
         {
            AV40TFCliCodAgr = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFCliCodAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TFCliCodAgr), 6, 0));
            AV41TFCliCodAgr_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFCliCodAgr_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFCliCodAgr_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOLNOMAGR") == 0 )
         {
            AV42TFColNomAgr = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFColNomAgr", AV42TFColNomAgr);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOLNOMAGR_SEL") == 0 )
         {
            AV43TFColNomAgr_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFColNomAgr_Sel", AV43TFColNomAgr_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOLNUMAGR") == 0 )
         {
            AV44TFColNumAgr = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFColNumAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFColNumAgr), 6, 0));
            AV45TFColNumAgr_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFColNumAgr_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFColNumAgr_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOLNOCAGR") == 0 )
         {
            AV46TFColNoCAgr = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFColNoCAgr", AV46TFColNoCAgr);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOLNOCAGR_SEL") == 0 )
         {
            AV47TFColNoCAgr_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFColNoCAgr_Sel", AV47TFColNoCAgr_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOLNUCAGR") == 0 )
         {
            AV48TFColNuCAgr = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFColNuCAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFColNuCAgr), 6, 0));
            AV49TFColNuCAgr_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFColNuCAgr_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFColNuCAgr_To), 6, 0));
         }
         AV106GXV1 = (int)(AV106GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV22TFBarAgrNhdr_Sel)==0), AV22TFBarAgrNhdr_Sel, GXv_char4) ;
      consultadeproduccion_agrupadas_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char14 = "" ;
      GXv_char3[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV37TFBarAgrSer_Sel)==0), AV37TFBarAgrSer_Sel, GXv_char3) ;
      consultadeproduccion_agrupadas_impl.this.GXt_char14 = GXv_char3[0] ;
      GXt_char15 = "" ;
      GXv_char2[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV39TFBarAgrDsc_Sel)==0), AV39TFBarAgrDsc_Sel, GXv_char2) ;
      consultadeproduccion_agrupadas_impl.this.GXt_char15 = GXv_char2[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV43TFColNomAgr_Sel)==0), AV43TFColNomAgr_Sel, GXv_char17) ;
      consultadeproduccion_agrupadas_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV47TFColNoCAgr_Sel)==0), AV47TFColNoCAgr_Sel, GXv_char19) ;
      consultadeproduccion_agrupadas_impl.this.GXt_char18 = GXv_char19[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|||||"+GXt_char14+"|"+GXt_char15+"||"+GXt_char16+"||"+GXt_char18+"|" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV21TFBarAgrNhdr)==0), AV21TFBarAgrNhdr, GXv_char19) ;
      consultadeproduccion_agrupadas_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV36TFBarAgrSer)==0), AV36TFBarAgrSer, GXv_char17) ;
      consultadeproduccion_agrupadas_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char15 = "" ;
      GXv_char4[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV38TFBarAgrDsc)==0), AV38TFBarAgrDsc, GXv_char4) ;
      consultadeproduccion_agrupadas_impl.this.GXt_char15 = GXv_char4[0] ;
      GXt_char14 = "" ;
      GXv_char3[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV42TFColNomAgr)==0), AV42TFColNomAgr, GXv_char3) ;
      consultadeproduccion_agrupadas_impl.this.GXt_char14 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV46TFColNoCAgr)==0), AV46TFColNoCAgr, GXv_char2) ;
      consultadeproduccion_agrupadas_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = GXt_char18+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFKgmAgr)==0) ? "" : GXutil.str( AV50TFKgmAgr, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV52TFMtrAgr)==0) ? "" : GXutil.str( AV52TFMtrAgr, 9, 2))+"|"+((0==AV54TFPieAgr) ? "" : GXutil.str( AV54TFPieAgr, 4, 0))+"||"+GXt_char16+"|"+GXt_char15+"|"+((0==AV40TFCliCodAgr) ? "" : GXutil.str( AV40TFCliCodAgr, 6, 0))+"|"+GXt_char14+"|"+((0==AV44TFColNumAgr) ? "" : GXutil.str( AV44TFColNumAgr, 6, 0))+"|"+GXt_char1+"|"+((0==AV48TFColNuCAgr) ? "" : GXutil.str( AV48TFColNuCAgr, 6, 0)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFKgmAgr_To)==0) ? "" : GXutil.str( AV51TFKgmAgr_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFMtrAgr_To)==0) ? "" : GXutil.str( AV53TFMtrAgr_To, 9, 2))+"|"+((0==AV55TFPieAgr_To) ? "" : GXutil.str( AV55TFPieAgr_To, 4, 0))+"||||"+((0==AV41TFCliCodAgr_To) ? "" : GXutil.str( AV41TFCliCodAgr_To, 6, 0))+"||"+((0==AV45TFColNumAgr_To) ? "" : GXutil.str( AV45TFColNumAgr_To, 6, 0))+"||"+((0==AV49TFColNuCAgr_To) ? "" : GXutil.str( AV49TFColNuCAgr_To, 6, 0)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV17Session.getValue(AV82Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV27OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV28OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV12FilterFullText)==0), (short)(0), AV12FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFBARAGRNHDR", "", !(GXutil.strcmp("", AV21TFBarAgrNhdr)==0), (short)(0), AV21TFBarAgrNhdr, "", !(GXutil.strcmp("", AV22TFBarAgrNhdr_Sel)==0), AV22TFBarAgrNhdr_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFKGMAGR", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFKgmAgr)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFKgmAgr_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV50TFKgmAgr, 9, 2)), GXutil.trim( GXutil.str( AV51TFKgmAgr_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFMTRAGR", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV52TFMtrAgr)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFMtrAgr_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV52TFMtrAgr, 9, 2)), GXutil.trim( GXutil.str( AV53TFMtrAgr_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFPIEAGR", "", !((0==AV54TFPieAgr)&&(0==AV55TFPieAgr_To)), (short)(0), GXutil.trim( GXutil.str( AV54TFPieAgr, 4, 0)), GXutil.trim( GXutil.str( AV55TFPieAgr_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFBARAGRSER", "", !(GXutil.strcmp("", AV36TFBarAgrSer)==0), (short)(0), AV36TFBarAgrSer, "", !(GXutil.strcmp("", AV37TFBarAgrSer_Sel)==0), AV37TFBarAgrSer_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFBARAGRDSC", "", !(GXutil.strcmp("", AV38TFBarAgrDsc)==0), (short)(0), AV38TFBarAgrDsc, "", !(GXutil.strcmp("", AV39TFBarAgrDsc_Sel)==0), AV39TFBarAgrDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFCLICODAGR", "", !((0==AV40TFCliCodAgr)&&(0==AV41TFCliCodAgr_To)), (short)(0), GXutil.trim( GXutil.str( AV40TFCliCodAgr, 6, 0)), GXutil.trim( GXutil.str( AV41TFCliCodAgr_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFCOLNOMAGR", "", !(GXutil.strcmp("", AV42TFColNomAgr)==0), (short)(0), AV42TFColNomAgr, "", !(GXutil.strcmp("", AV43TFColNomAgr_Sel)==0), AV43TFColNomAgr_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFCOLNUMAGR", "", !((0==AV44TFColNumAgr)&&(0==AV45TFColNumAgr_To)), (short)(0), GXutil.trim( GXutil.str( AV44TFColNumAgr, 6, 0)), GXutil.trim( GXutil.str( AV45TFColNumAgr_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFCOLNOCAGR", "", !(GXutil.strcmp("", AV46TFColNoCAgr)==0), (short)(0), AV46TFColNoCAgr, "", !(GXutil.strcmp("", AV47TFColNoCAgr_Sel)==0), AV47TFColNoCAgr_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFCOLNUCAGR", "", !((0==AV48TFColNuCAgr)&&(0==AV49TFColNuCAgr_To)), (short)(0), GXutil.trim( GXutil.str( AV48TFColNuCAgr, 6, 0)), GXutil.trim( GXutil.str( AV49TFColNuCAgr_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV82Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV82Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "BARAGR" );
      AV17Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S172( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV56TotKgmAgr = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TotKgmAgr", GXutil.ltrimstr( AV56TotKgmAgr, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTKGMAGR", getSecureSignedToken( sPrefix, localUtil.format( AV56TotKgmAgr, "ZZZZZ9.99")));
      AV58TotMtrAgr = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TotMtrAgr", GXutil.ltrimstr( AV58TotMtrAgr, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMTRAGR", getSecureSignedToken( sPrefix, localUtil.format( AV58TotMtrAgr, "ZZZZZ9.99")));
      AV60TotPieAgr = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TotPieAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60TotPieAgr), 18, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTPIEAGR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV60TotPieAgr), "ZZZ9")));
   }

   public void S182( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      if ( 1 == 0 )
      {
         AV83Consultadeproduccion_agrupadasds_1_filterfulltext = AV12FilterFullText ;
         AV84Consultadeproduccion_agrupadasds_2_tfbaragrnhdr = AV21TFBarAgrNhdr ;
         AV85Consultadeproduccion_agrupadasds_3_tfbaragrnhdr_sel = AV22TFBarAgrNhdr_Sel ;
         AV86Consultadeproduccion_agrupadasds_4_tfkgmagr = AV50TFKgmAgr ;
         AV87Consultadeproduccion_agrupadasds_5_tfkgmagr_to = AV51TFKgmAgr_To ;
         AV88Consultadeproduccion_agrupadasds_6_tfmtragr = AV52TFMtrAgr ;
         AV89Consultadeproduccion_agrupadasds_7_tfmtragr_to = AV53TFMtrAgr_To ;
         AV90Consultadeproduccion_agrupadasds_8_tfpieagr = AV54TFPieAgr ;
         AV91Consultadeproduccion_agrupadasds_9_tfpieagr_to = AV55TFPieAgr_To ;
         AV92Consultadeproduccion_agrupadasds_10_tfbaragrser = AV36TFBarAgrSer ;
         AV93Consultadeproduccion_agrupadasds_11_tfbaragrser_sel = AV37TFBarAgrSer_Sel ;
         AV94Consultadeproduccion_agrupadasds_12_tfbaragrdsc = AV38TFBarAgrDsc ;
         AV95Consultadeproduccion_agrupadasds_13_tfbaragrdsc_sel = AV39TFBarAgrDsc_Sel ;
         AV96Consultadeproduccion_agrupadasds_14_tfclicodagr = AV40TFCliCodAgr ;
         AV97Consultadeproduccion_agrupadasds_15_tfclicodagr_to = AV41TFCliCodAgr_To ;
         AV98Consultadeproduccion_agrupadasds_16_tfcolnomagr = AV42TFColNomAgr ;
         AV99Consultadeproduccion_agrupadasds_17_tfcolnomagr_sel = AV43TFColNomAgr_Sel ;
         AV100Consultadeproduccion_agrupadasds_18_tfcolnumagr = AV44TFColNumAgr ;
         AV101Consultadeproduccion_agrupadasds_19_tfcolnumagr_to = AV45TFColNumAgr_To ;
         AV102Consultadeproduccion_agrupadasds_20_tfcolnocagr = AV46TFColNoCAgr ;
         AV103Consultadeproduccion_agrupadasds_21_tfcolnocagr_sel = AV47TFColNoCAgr_Sel ;
         AV104Consultadeproduccion_agrupadasds_22_tfcolnucagr = AV48TFColNuCAgr ;
         AV105Consultadeproduccion_agrupadasds_23_tfcolnucagr_to = AV49TFColNuCAgr_To ;
         pr_default.dynParam(2, new Object[]{ new Object[]{
                                              AV83Consultadeproduccion_agrupadasds_1_filterfulltext ,
                                              AV85Consultadeproduccion_agrupadasds_3_tfbaragrnhdr_sel ,
                                              AV84Consultadeproduccion_agrupadasds_2_tfbaragrnhdr ,
                                              AV86Consultadeproduccion_agrupadasds_4_tfkgmagr ,
                                              AV87Consultadeproduccion_agrupadasds_5_tfkgmagr_to ,
                                              AV88Consultadeproduccion_agrupadasds_6_tfmtragr ,
                                              AV89Consultadeproduccion_agrupadasds_7_tfmtragr_to ,
                                              Short.valueOf(AV90Consultadeproduccion_agrupadasds_8_tfpieagr) ,
                                              Short.valueOf(AV91Consultadeproduccion_agrupadasds_9_tfpieagr_to) ,
                                              AV93Consultadeproduccion_agrupadasds_11_tfbaragrser_sel ,
                                              AV92Consultadeproduccion_agrupadasds_10_tfbaragrser ,
                                              AV95Consultadeproduccion_agrupadasds_13_tfbaragrdsc_sel ,
                                              AV94Consultadeproduccion_agrupadasds_12_tfbaragrdsc ,
                                              Integer.valueOf(AV96Consultadeproduccion_agrupadasds_14_tfclicodagr) ,
                                              Integer.valueOf(AV97Consultadeproduccion_agrupadasds_15_tfclicodagr_to) ,
                                              AV99Consultadeproduccion_agrupadasds_17_tfcolnomagr_sel ,
                                              AV98Consultadeproduccion_agrupadasds_16_tfcolnomagr ,
                                              Integer.valueOf(AV100Consultadeproduccion_agrupadasds_18_tfcolnumagr) ,
                                              Integer.valueOf(AV101Consultadeproduccion_agrupadasds_19_tfcolnumagr_to) ,
                                              AV103Consultadeproduccion_agrupadasds_21_tfcolnocagr_sel ,
                                              AV102Consultadeproduccion_agrupadasds_20_tfcolnocagr ,
                                              Integer.valueOf(AV104Consultadeproduccion_agrupadasds_22_tfcolnucagr) ,
                                              Integer.valueOf(AV105Consultadeproduccion_agrupadasds_23_tfcolnucagr_to) ,
                                              Integer.valueOf(A119BarAgrCod) ,
                                              Byte.valueOf(A124BarAgrReo) ,
                                              A122BarAgrPar ,
                                              A590KgmAgr ,
                                              A869MtrAgr ,
                                              Short.valueOf(A671PieAgr) ,
                                              A1245BarAgrSer ,
                                              A1507BarAgrDsc ,
                                              Integer.valueOf(A1508CliCodAgr) ,
                                              A1510ColNomAgr ,
                                              Integer.valueOf(A1512ColNumAgr) ,
                                              A1509ColNoCAgr ,
                                              Integer.valueOf(A1511ColNuCAgr) ,
                                              A396EmprCod ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                              }
         });
         lV83Consultadeproduccion_agrupadasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Consultadeproduccion_agrupadasds_1_filterfulltext), "%", "") ;
         lV83Consultadeproduccion_agrupadasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Consultadeproduccion_agrupadasds_1_filterfulltext), "%", "") ;
         lV83Consultadeproduccion_agrupadasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Consultadeproduccion_agrupadasds_1_filterfulltext), "%", "") ;
         lV83Consultadeproduccion_agrupadasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Consultadeproduccion_agrupadasds_1_filterfulltext), "%", "") ;
         lV83Consultadeproduccion_agrupadasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Consultadeproduccion_agrupadasds_1_filterfulltext), "%", "") ;
         lV83Consultadeproduccion_agrupadasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Consultadeproduccion_agrupadasds_1_filterfulltext), "%", "") ;
         lV83Consultadeproduccion_agrupadasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Consultadeproduccion_agrupadasds_1_filterfulltext), "%", "") ;
         lV83Consultadeproduccion_agrupadasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Consultadeproduccion_agrupadasds_1_filterfulltext), "%", "") ;
         lV83Consultadeproduccion_agrupadasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Consultadeproduccion_agrupadasds_1_filterfulltext), "%", "") ;
         lV83Consultadeproduccion_agrupadasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Consultadeproduccion_agrupadasds_1_filterfulltext), "%", "") ;
         lV83Consultadeproduccion_agrupadasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Consultadeproduccion_agrupadasds_1_filterfulltext), "%", "") ;
         lV84Consultadeproduccion_agrupadasds_2_tfbaragrnhdr = GXutil.padr( GXutil.rtrim( AV84Consultadeproduccion_agrupadasds_2_tfbaragrnhdr), 11, "%") ;
         lV92Consultadeproduccion_agrupadasds_10_tfbaragrser = GXutil.padr( GXutil.rtrim( AV92Consultadeproduccion_agrupadasds_10_tfbaragrser), 16, "%") ;
         lV94Consultadeproduccion_agrupadasds_12_tfbaragrdsc = GXutil.padr( GXutil.rtrim( AV94Consultadeproduccion_agrupadasds_12_tfbaragrdsc), 26, "%") ;
         lV98Consultadeproduccion_agrupadasds_16_tfcolnomagr = GXutil.padr( GXutil.rtrim( AV98Consultadeproduccion_agrupadasds_16_tfcolnomagr), 13, "%") ;
         lV102Consultadeproduccion_agrupadasds_20_tfcolnocagr = GXutil.padr( GXutil.rtrim( AV102Consultadeproduccion_agrupadasds_20_tfcolnocagr), 13, "%") ;
         /* Using cursor H01974 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, lV83Consultadeproduccion_agrupadasds_1_filterfulltext, lV83Consultadeproduccion_agrupadasds_1_filterfulltext, lV83Consultadeproduccion_agrupadasds_1_filterfulltext, lV83Consultadeproduccion_agrupadasds_1_filterfulltext, lV83Consultadeproduccion_agrupadasds_1_filterfulltext, lV83Consultadeproduccion_agrupadasds_1_filterfulltext, lV83Consultadeproduccion_agrupadasds_1_filterfulltext, lV83Consultadeproduccion_agrupadasds_1_filterfulltext, lV83Consultadeproduccion_agrupadasds_1_filterfulltext, lV83Consultadeproduccion_agrupadasds_1_filterfulltext, lV83Consultadeproduccion_agrupadasds_1_filterfulltext, lV84Consultadeproduccion_agrupadasds_2_tfbaragrnhdr, AV85Consultadeproduccion_agrupadasds_3_tfbaragrnhdr_sel, AV86Consultadeproduccion_agrupadasds_4_tfkgmagr, AV87Consultadeproduccion_agrupadasds_5_tfkgmagr_to, AV88Consultadeproduccion_agrupadasds_6_tfmtragr, AV89Consultadeproduccion_agrupadasds_7_tfmtragr_to, Short.valueOf(AV90Consultadeproduccion_agrupadasds_8_tfpieagr), Short.valueOf(AV91Consultadeproduccion_agrupadasds_9_tfpieagr_to), lV92Consultadeproduccion_agrupadasds_10_tfbaragrser, AV93Consultadeproduccion_agrupadasds_11_tfbaragrser_sel, lV94Consultadeproduccion_agrupadasds_12_tfbaragrdsc, AV95Consultadeproduccion_agrupadasds_13_tfbaragrdsc_sel, Integer.valueOf(AV96Consultadeproduccion_agrupadasds_14_tfclicodagr), Integer.valueOf(AV97Consultadeproduccion_agrupadasds_15_tfclicodagr_to), lV98Consultadeproduccion_agrupadasds_16_tfcolnomagr, AV99Consultadeproduccion_agrupadasds_17_tfcolnomagr_sel, Integer.valueOf(AV100Consultadeproduccion_agrupadasds_18_tfcolnumagr), Integer.valueOf(AV101Consultadeproduccion_agrupadasds_19_tfcolnumagr_to), lV102Consultadeproduccion_agrupadasds_20_tfcolnocagr, AV103Consultadeproduccion_agrupadasds_21_tfcolnocagr_sel, Integer.valueOf(AV104Consultadeproduccion_agrupadasds_22_tfcolnucagr), Integer.valueOf(AV105Consultadeproduccion_agrupadasds_23_tfcolnucagr_to)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A1511ColNuCAgr = H01974_A1511ColNuCAgr[0] ;
            A1509ColNoCAgr = H01974_A1509ColNoCAgr[0] ;
            A1512ColNumAgr = H01974_A1512ColNumAgr[0] ;
            A1510ColNomAgr = H01974_A1510ColNomAgr[0] ;
            A1508CliCodAgr = H01974_A1508CliCodAgr[0] ;
            A1507BarAgrDsc = H01974_A1507BarAgrDsc[0] ;
            A1245BarAgrSer = H01974_A1245BarAgrSer[0] ;
            A671PieAgr = H01974_A671PieAgr[0] ;
            A869MtrAgr = H01974_A869MtrAgr[0] ;
            A590KgmAgr = H01974_A590KgmAgr[0] ;
            A122BarAgrPar = H01974_A122BarAgrPar[0] ;
            A124BarAgrReo = H01974_A124BarAgrReo[0] ;
            A119BarAgrCod = H01974_A119BarAgrCod[0] ;
            A13792BarAgrNhdr = GXutil.str( A119BarAgrCod, 8, 0) + "-" + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar ;
            AV56TotKgmAgr = A590KgmAgr.add(AV56TotKgmAgr) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TotKgmAgr", GXutil.ltrimstr( AV56TotKgmAgr, 18, 2));
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTKGMAGR", getSecureSignedToken( sPrefix, localUtil.format( AV56TotKgmAgr, "ZZZZZ9.99")));
            AV58TotMtrAgr = A869MtrAgr.add(AV58TotMtrAgr) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TotMtrAgr", GXutil.ltrimstr( AV58TotMtrAgr, 18, 2));
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMTRAGR", getSecureSignedToken( sPrefix, localUtil.format( AV58TotMtrAgr, "ZZZZZ9.99")));
            AV60TotPieAgr = (long)(A671PieAgr+AV60TotPieAgr) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TotPieAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60TotPieAgr), 18, 0));
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTPIEAGR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV60TotPieAgr), "ZZZ9")));
            pr_default.readNext(2);
         }
         pr_default.close(2);
         AV57TotValueKgmAgr = localUtil.format( AV56TotKgmAgr, "ZZZZZ9.99") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TotValueKgmAgr", AV57TotValueKgmAgr);
         AV59TotValueMtrAgr = localUtil.format( AV58TotMtrAgr, "ZZZZZ9.99") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TotValueMtrAgr", AV59TotValueMtrAgr);
         AV61TotValuePieAgr = localUtil.format( DecimalUtil.doubleToDec(AV60TotPieAgr), "ZZZ9") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TotValuePieAgr", AV61TotValuePieAgr);
      }
      AV83Consultadeproduccion_agrupadasds_1_filterfulltext = AV12FilterFullText ;
      AV84Consultadeproduccion_agrupadasds_2_tfbaragrnhdr = AV21TFBarAgrNhdr ;
      AV85Consultadeproduccion_agrupadasds_3_tfbaragrnhdr_sel = AV22TFBarAgrNhdr_Sel ;
      AV86Consultadeproduccion_agrupadasds_4_tfkgmagr = AV50TFKgmAgr ;
      AV87Consultadeproduccion_agrupadasds_5_tfkgmagr_to = AV51TFKgmAgr_To ;
      AV88Consultadeproduccion_agrupadasds_6_tfmtragr = AV52TFMtrAgr ;
      AV89Consultadeproduccion_agrupadasds_7_tfmtragr_to = AV53TFMtrAgr_To ;
      AV90Consultadeproduccion_agrupadasds_8_tfpieagr = AV54TFPieAgr ;
      AV91Consultadeproduccion_agrupadasds_9_tfpieagr_to = AV55TFPieAgr_To ;
      AV92Consultadeproduccion_agrupadasds_10_tfbaragrser = AV36TFBarAgrSer ;
      AV93Consultadeproduccion_agrupadasds_11_tfbaragrser_sel = AV37TFBarAgrSer_Sel ;
      AV94Consultadeproduccion_agrupadasds_12_tfbaragrdsc = AV38TFBarAgrDsc ;
      AV95Consultadeproduccion_agrupadasds_13_tfbaragrdsc_sel = AV39TFBarAgrDsc_Sel ;
      AV96Consultadeproduccion_agrupadasds_14_tfclicodagr = AV40TFCliCodAgr ;
      AV97Consultadeproduccion_agrupadasds_15_tfclicodagr_to = AV41TFCliCodAgr_To ;
      AV98Consultadeproduccion_agrupadasds_16_tfcolnomagr = AV42TFColNomAgr ;
      AV99Consultadeproduccion_agrupadasds_17_tfcolnomagr_sel = AV43TFColNomAgr_Sel ;
      AV100Consultadeproduccion_agrupadasds_18_tfcolnumagr = AV44TFColNumAgr ;
      AV101Consultadeproduccion_agrupadasds_19_tfcolnumagr_to = AV45TFColNumAgr_To ;
      AV102Consultadeproduccion_agrupadasds_20_tfcolnocagr = AV46TFColNoCAgr ;
      AV103Consultadeproduccion_agrupadasds_21_tfcolnocagr_sel = AV47TFColNoCAgr_Sel ;
      AV104Consultadeproduccion_agrupadasds_22_tfcolnucagr = AV48TFColNuCAgr ;
      AV105Consultadeproduccion_agrupadasds_23_tfcolnucagr_to = AV49TFColNuCAgr_To ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV83Consultadeproduccion_agrupadasds_1_filterfulltext ,
                                           AV85Consultadeproduccion_agrupadasds_3_tfbaragrnhdr_sel ,
                                           AV84Consultadeproduccion_agrupadasds_2_tfbaragrnhdr ,
                                           AV86Consultadeproduccion_agrupadasds_4_tfkgmagr ,
                                           AV87Consultadeproduccion_agrupadasds_5_tfkgmagr_to ,
                                           AV88Consultadeproduccion_agrupadasds_6_tfmtragr ,
                                           AV89Consultadeproduccion_agrupadasds_7_tfmtragr_to ,
                                           Short.valueOf(AV90Consultadeproduccion_agrupadasds_8_tfpieagr) ,
                                           Short.valueOf(AV91Consultadeproduccion_agrupadasds_9_tfpieagr_to) ,
                                           AV93Consultadeproduccion_agrupadasds_11_tfbaragrser_sel ,
                                           AV92Consultadeproduccion_agrupadasds_10_tfbaragrser ,
                                           AV95Consultadeproduccion_agrupadasds_13_tfbaragrdsc_sel ,
                                           AV94Consultadeproduccion_agrupadasds_12_tfbaragrdsc ,
                                           Integer.valueOf(AV96Consultadeproduccion_agrupadasds_14_tfclicodagr) ,
                                           Integer.valueOf(AV97Consultadeproduccion_agrupadasds_15_tfclicodagr_to) ,
                                           AV99Consultadeproduccion_agrupadasds_17_tfcolnomagr_sel ,
                                           AV98Consultadeproduccion_agrupadasds_16_tfcolnomagr ,
                                           Integer.valueOf(AV100Consultadeproduccion_agrupadasds_18_tfcolnumagr) ,
                                           Integer.valueOf(AV101Consultadeproduccion_agrupadasds_19_tfcolnumagr_to) ,
                                           AV103Consultadeproduccion_agrupadasds_21_tfcolnocagr_sel ,
                                           AV102Consultadeproduccion_agrupadasds_20_tfcolnocagr ,
                                           Integer.valueOf(AV104Consultadeproduccion_agrupadasds_22_tfcolnucagr) ,
                                           Integer.valueOf(AV105Consultadeproduccion_agrupadasds_23_tfcolnucagr_to) ,
                                           Integer.valueOf(A119BarAgrCod) ,
                                           Byte.valueOf(A124BarAgrReo) ,
                                           A122BarAgrPar ,
                                           A590KgmAgr ,
                                           A869MtrAgr ,
                                           Short.valueOf(A671PieAgr) ,
                                           A1245BarAgrSer ,
                                           A1507BarAgrDsc ,
                                           Integer.valueOf(A1508CliCodAgr) ,
                                           A1510ColNomAgr ,
                                           Integer.valueOf(A1512ColNumAgr) ,
                                           A1509ColNoCAgr ,
                                           Integer.valueOf(A1511ColNuCAgr) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV83Consultadeproduccion_agrupadasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Consultadeproduccion_agrupadasds_1_filterfulltext), "%", "") ;
      lV83Consultadeproduccion_agrupadasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Consultadeproduccion_agrupadasds_1_filterfulltext), "%", "") ;
      lV83Consultadeproduccion_agrupadasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Consultadeproduccion_agrupadasds_1_filterfulltext), "%", "") ;
      lV83Consultadeproduccion_agrupadasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Consultadeproduccion_agrupadasds_1_filterfulltext), "%", "") ;
      lV83Consultadeproduccion_agrupadasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Consultadeproduccion_agrupadasds_1_filterfulltext), "%", "") ;
      lV83Consultadeproduccion_agrupadasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Consultadeproduccion_agrupadasds_1_filterfulltext), "%", "") ;
      lV83Consultadeproduccion_agrupadasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Consultadeproduccion_agrupadasds_1_filterfulltext), "%", "") ;
      lV83Consultadeproduccion_agrupadasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Consultadeproduccion_agrupadasds_1_filterfulltext), "%", "") ;
      lV83Consultadeproduccion_agrupadasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Consultadeproduccion_agrupadasds_1_filterfulltext), "%", "") ;
      lV83Consultadeproduccion_agrupadasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Consultadeproduccion_agrupadasds_1_filterfulltext), "%", "") ;
      lV83Consultadeproduccion_agrupadasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Consultadeproduccion_agrupadasds_1_filterfulltext), "%", "") ;
      lV84Consultadeproduccion_agrupadasds_2_tfbaragrnhdr = GXutil.padr( GXutil.rtrim( AV84Consultadeproduccion_agrupadasds_2_tfbaragrnhdr), 11, "%") ;
      lV92Consultadeproduccion_agrupadasds_10_tfbaragrser = GXutil.padr( GXutil.rtrim( AV92Consultadeproduccion_agrupadasds_10_tfbaragrser), 16, "%") ;
      lV94Consultadeproduccion_agrupadasds_12_tfbaragrdsc = GXutil.padr( GXutil.rtrim( AV94Consultadeproduccion_agrupadasds_12_tfbaragrdsc), 26, "%") ;
      lV98Consultadeproduccion_agrupadasds_16_tfcolnomagr = GXutil.padr( GXutil.rtrim( AV98Consultadeproduccion_agrupadasds_16_tfcolnomagr), 13, "%") ;
      lV102Consultadeproduccion_agrupadasds_20_tfcolnocagr = GXutil.padr( GXutil.rtrim( AV102Consultadeproduccion_agrupadasds_20_tfcolnocagr), 13, "%") ;
      /* Using cursor H01975 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, lV83Consultadeproduccion_agrupadasds_1_filterfulltext, lV83Consultadeproduccion_agrupadasds_1_filterfulltext, lV83Consultadeproduccion_agrupadasds_1_filterfulltext, lV83Consultadeproduccion_agrupadasds_1_filterfulltext, lV83Consultadeproduccion_agrupadasds_1_filterfulltext, lV83Consultadeproduccion_agrupadasds_1_filterfulltext, lV83Consultadeproduccion_agrupadasds_1_filterfulltext, lV83Consultadeproduccion_agrupadasds_1_filterfulltext, lV83Consultadeproduccion_agrupadasds_1_filterfulltext, lV83Consultadeproduccion_agrupadasds_1_filterfulltext, lV83Consultadeproduccion_agrupadasds_1_filterfulltext, lV84Consultadeproduccion_agrupadasds_2_tfbaragrnhdr, AV85Consultadeproduccion_agrupadasds_3_tfbaragrnhdr_sel, AV86Consultadeproduccion_agrupadasds_4_tfkgmagr, AV87Consultadeproduccion_agrupadasds_5_tfkgmagr_to, AV88Consultadeproduccion_agrupadasds_6_tfmtragr, AV89Consultadeproduccion_agrupadasds_7_tfmtragr_to, Short.valueOf(AV90Consultadeproduccion_agrupadasds_8_tfpieagr), Short.valueOf(AV91Consultadeproduccion_agrupadasds_9_tfpieagr_to), lV92Consultadeproduccion_agrupadasds_10_tfbaragrser, AV93Consultadeproduccion_agrupadasds_11_tfbaragrser_sel, lV94Consultadeproduccion_agrupadasds_12_tfbaragrdsc, AV95Consultadeproduccion_agrupadasds_13_tfbaragrdsc_sel, Integer.valueOf(AV96Consultadeproduccion_agrupadasds_14_tfclicodagr), Integer.valueOf(AV97Consultadeproduccion_agrupadasds_15_tfclicodagr_to), lV98Consultadeproduccion_agrupadasds_16_tfcolnomagr, AV99Consultadeproduccion_agrupadasds_17_tfcolnomagr_sel, Integer.valueOf(AV100Consultadeproduccion_agrupadasds_18_tfcolnumagr), Integer.valueOf(AV101Consultadeproduccion_agrupadasds_19_tfcolnumagr_to), lV102Consultadeproduccion_agrupadasds_20_tfcolnocagr, AV103Consultadeproduccion_agrupadasds_21_tfcolnocagr_sel, Integer.valueOf(AV104Consultadeproduccion_agrupadasds_22_tfcolnucagr), Integer.valueOf(AV105Consultadeproduccion_agrupadasds_23_tfcolnucagr_to)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A1511ColNuCAgr = H01975_A1511ColNuCAgr[0] ;
         A1509ColNoCAgr = H01975_A1509ColNoCAgr[0] ;
         A1512ColNumAgr = H01975_A1512ColNumAgr[0] ;
         A1510ColNomAgr = H01975_A1510ColNomAgr[0] ;
         A1508CliCodAgr = H01975_A1508CliCodAgr[0] ;
         A1507BarAgrDsc = H01975_A1507BarAgrDsc[0] ;
         A1245BarAgrSer = H01975_A1245BarAgrSer[0] ;
         A671PieAgr = H01975_A671PieAgr[0] ;
         A869MtrAgr = H01975_A869MtrAgr[0] ;
         A590KgmAgr = H01975_A590KgmAgr[0] ;
         A122BarAgrPar = H01975_A122BarAgrPar[0] ;
         A124BarAgrReo = H01975_A124BarAgrReo[0] ;
         A119BarAgrCod = H01975_A119BarAgrCod[0] ;
         A13792BarAgrNhdr = GXutil.str( A119BarAgrCod, 8, 0) + "-" + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar ;
         AV56TotKgmAgr = A590KgmAgr.add(AV56TotKgmAgr) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TotKgmAgr", GXutil.ltrimstr( AV56TotKgmAgr, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTKGMAGR", getSecureSignedToken( sPrefix, localUtil.format( AV56TotKgmAgr, "ZZZZZ9.99")));
         AV58TotMtrAgr = A869MtrAgr.add(AV58TotMtrAgr) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TotMtrAgr", GXutil.ltrimstr( AV58TotMtrAgr, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMTRAGR", getSecureSignedToken( sPrefix, localUtil.format( AV58TotMtrAgr, "ZZZZZ9.99")));
         AV60TotPieAgr = (long)(A671PieAgr+AV60TotPieAgr) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TotPieAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60TotPieAgr), 18, 0));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTPIEAGR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV60TotPieAgr), "ZZZ9")));
         pr_default.readNext(3);
      }
      pr_default.close(3);
      AV56TotKgmAgr = AV74BarKgm.add(AV56TotKgmAgr) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TotKgmAgr", GXutil.ltrimstr( AV56TotKgmAgr, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTKGMAGR", getSecureSignedToken( sPrefix, localUtil.format( AV56TotKgmAgr, "ZZZZZ9.99")));
      AV58TotMtrAgr = AV75BarMtr.add(AV58TotMtrAgr) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TotMtrAgr", GXutil.ltrimstr( AV58TotMtrAgr, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMTRAGR", getSecureSignedToken( sPrefix, localUtil.format( AV58TotMtrAgr, "ZZZZZ9.99")));
      AV57TotValueKgmAgr = localUtil.format( AV56TotKgmAgr, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TotValueKgmAgr", AV57TotValueKgmAgr);
      AV59TotValueMtrAgr = localUtil.format( AV58TotMtrAgr, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TotValueMtrAgr", AV59TotValueMtrAgr);
      AV61TotValuePieAgr = localUtil.format( DecimalUtil.doubleToDec(AV60TotPieAgr), "ZZZ9") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TotValuePieAgr", AV61TotValuePieAgr);
   }

   public void wb_table2_121_1972( boolean wbgen )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluekgmagr_Internalname, httpContext.getMessage( "Tot Value Kgm Agr", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'" + sPrefix + "',false,'" + sGXsfl_102_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluekgmagr_Internalname, AV57TotValueKgmAgr, GXutil.rtrim( localUtil.format( AV57TotValueKgmAgr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,126);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluekgmagr_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluekgmagr_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ConsultadeProduccion_Agrupadas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluemtragr_Internalname, httpContext.getMessage( "Tot Value Mtr Agr", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'" + sPrefix + "',false,'" + sGXsfl_102_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluemtragr_Internalname, AV59TotValueMtrAgr, GXutil.rtrim( localUtil.format( AV59TotValueMtrAgr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,129);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluemtragr_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluemtragr_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ConsultadeProduccion_Agrupadas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluepieagr_Internalname, httpContext.getMessage( "Tot Value Pie Agr", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 132,'" + sPrefix + "',false,'" + sGXsfl_102_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluepieagr_Internalname, AV61TotValuePieAgr, GXutil.rtrim( localUtil.format( AV61TotValuePieAgr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,132);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluepieagr_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluepieagr_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ConsultadeProduccion_Agrupadas.htm");
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
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_121_1972e( true) ;
      }
      else
      {
         wb_table2_121_1972e( false) ;
      }
   }

   public void wb_table1_84_1972( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV18ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table3_89_1972( true) ;
      }
      else
      {
         wb_table3_89_1972( false) ;
      }
      return  ;
   }

   public void wb_table3_89_1972e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_84_1972e( true) ;
      }
      else
      {
         wb_table1_84_1972e( false) ;
      }
   }

   public void wb_table3_89_1972( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'" + sPrefix + "',false,'" + sGXsfl_102_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV12FilterFullText, GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,93);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_ConsultadeProduccion_Agrupadas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_89_1972e( true) ;
      }
      else
      {
         wb_table3_89_1972e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      A396EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      A129BarCod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A130BarCodPar", A130BarCodPar);
      AV66CliCod = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66CliCod), 6, 0));
      AV67CliNom = (String)getParm(obj,5,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67CliNom", AV67CliNom);
      AV68PedidoCliente = (String)getParm(obj,6,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68PedidoCliente", AV68PedidoCliente);
      AV62BarSer = (String)getParm(obj,7,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62BarSer", AV62BarSer);
      AV63BarSerDsc = (String)getParm(obj,8,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63BarSerDsc", AV63BarSerDsc);
      AV64BarColNom = (String)getParm(obj,9,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64BarColNom", AV64BarColNom);
      AV65BarColNum = ((Number) GXutil.testNumericType( getParm(obj,10,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65BarColNum), 6, 0));
      AV73MacCod = ((Number) GXutil.testNumericType( getParm(obj,11,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73MacCod), 8, 0));
      AV74BarKgm = (java.math.BigDecimal)getParm(obj,12,TypeConstants.DECIMAL) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74BarKgm", GXutil.ltrimstr( AV74BarKgm, 9, 2));
      AV75BarMtr = (java.math.BigDecimal)getParm(obj,13,TypeConstants.DECIMAL) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75BarMtr", GXutil.ltrimstr( AV75BarMtr, 9, 2));
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
      pa1972( ) ;
      ws1972( ) ;
      we1972( ) ;
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
      sCtrlA396EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlA129BarCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlA132BarCodReo = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlA130BarCodPar = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV66CliCod = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV67CliNom = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV68PedidoCliente = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV62BarSer = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV63BarSerDsc = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV64BarColNom = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV65BarColNum = (String)getParm(obj,10,TypeConstants.STRING) ;
      sCtrlAV73MacCod = (String)getParm(obj,11,TypeConstants.STRING) ;
      sCtrlAV74BarKgm = (String)getParm(obj,12,TypeConstants.STRING) ;
      sCtrlAV75BarMtr = (String)getParm(obj,13,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1972( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "consultadeproduccion_agrupadas", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1972( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A396EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         A129BarCod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A130BarCodPar", A130BarCodPar);
         AV66CliCod = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66CliCod), 6, 0));
         AV67CliNom = (String)getParm(obj,7,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67CliNom", AV67CliNom);
         AV68PedidoCliente = (String)getParm(obj,8,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68PedidoCliente", AV68PedidoCliente);
         AV62BarSer = (String)getParm(obj,9,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62BarSer", AV62BarSer);
         AV63BarSerDsc = (String)getParm(obj,10,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63BarSerDsc", AV63BarSerDsc);
         AV64BarColNom = (String)getParm(obj,11,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64BarColNom", AV64BarColNom);
         AV65BarColNum = ((Number) GXutil.testNumericType( getParm(obj,12,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65BarColNum), 6, 0));
         AV73MacCod = ((Number) GXutil.testNumericType( getParm(obj,13,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73MacCod), 8, 0));
         AV74BarKgm = (java.math.BigDecimal)getParm(obj,14,TypeConstants.DECIMAL) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74BarKgm", GXutil.ltrimstr( AV74BarKgm, 9, 2));
         AV75BarMtr = (java.math.BigDecimal)getParm(obj,15,TypeConstants.DECIMAL) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75BarMtr", GXutil.ltrimstr( AV75BarMtr, 9, 2));
      }
      wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
      wcpOA129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOA132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOA130BarCodPar = httpContext.cgiGet( sPrefix+"wcpOA130BarCodPar") ;
      wcpOAV66CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV66CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV67CliNom = httpContext.cgiGet( sPrefix+"wcpOAV67CliNom") ;
      wcpOAV68PedidoCliente = httpContext.cgiGet( sPrefix+"wcpOAV68PedidoCliente") ;
      wcpOAV62BarSer = httpContext.cgiGet( sPrefix+"wcpOAV62BarSer") ;
      wcpOAV63BarSerDsc = httpContext.cgiGet( sPrefix+"wcpOAV63BarSerDsc") ;
      wcpOAV64BarColNom = httpContext.cgiGet( sPrefix+"wcpOAV64BarColNom") ;
      wcpOAV65BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV65BarColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV73MacCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV73MacCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV74BarKgm = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV74BarKgm")) ;
      wcpOAV75BarMtr = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV75BarMtr")) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(A396EmprCod, wcpOA396EmprCod) != 0 ) || ( A129BarCod != wcpOA129BarCod ) || ( A132BarCodReo != wcpOA132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, wcpOA130BarCodPar) != 0 ) || ( AV66CliCod != wcpOAV66CliCod ) || ( GXutil.strcmp(AV67CliNom, wcpOAV67CliNom) != 0 ) || ( GXutil.strcmp(AV68PedidoCliente, wcpOAV68PedidoCliente) != 0 ) || ( GXutil.strcmp(AV62BarSer, wcpOAV62BarSer) != 0 ) || ( GXutil.strcmp(AV63BarSerDsc, wcpOAV63BarSerDsc) != 0 ) || ( GXutil.strcmp(AV64BarColNom, wcpOAV64BarColNom) != 0 ) || ( AV65BarColNum != wcpOAV65BarColNum ) || ( AV73MacCod != wcpOAV73MacCod ) || ( DecimalUtil.compareTo(AV74BarKgm, wcpOAV74BarKgm) != 0 ) || ( DecimalUtil.compareTo(AV75BarMtr, wcpOAV75BarMtr) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOA396EmprCod = A396EmprCod ;
      wcpOA129BarCod = A129BarCod ;
      wcpOA132BarCodReo = A132BarCodReo ;
      wcpOA130BarCodPar = A130BarCodPar ;
      wcpOAV66CliCod = AV66CliCod ;
      wcpOAV67CliNom = AV67CliNom ;
      wcpOAV68PedidoCliente = AV68PedidoCliente ;
      wcpOAV62BarSer = AV62BarSer ;
      wcpOAV63BarSerDsc = AV63BarSerDsc ;
      wcpOAV64BarColNom = AV64BarColNom ;
      wcpOAV65BarColNum = AV65BarColNum ;
      wcpOAV73MacCod = AV73MacCod ;
      wcpOAV74BarKgm = AV74BarKgm ;
      wcpOAV75BarMtr = AV75BarMtr ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlA396EmprCod = httpContext.cgiGet( sPrefix+"A396EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlA396EmprCod) > 0 )
      {
         A396EmprCod = httpContext.cgiGet( sCtrlA396EmprCod) ;
      }
      else
      {
         A396EmprCod = httpContext.cgiGet( sPrefix+"A396EmprCod_PARM") ;
      }
      sCtrlA129BarCod = httpContext.cgiGet( sPrefix+"A129BarCod_CTRL") ;
      if ( GXutil.len( sCtrlA129BarCod) > 0 )
      {
         A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlA129BarCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      }
      else
      {
         A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"A129BarCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlA132BarCodReo = httpContext.cgiGet( sPrefix+"A132BarCodReo_CTRL") ;
      if ( GXutil.len( sCtrlA132BarCodReo) > 0 )
      {
         A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlA132BarCodReo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      }
      else
      {
         A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"A132BarCodReo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlA130BarCodPar = httpContext.cgiGet( sPrefix+"A130BarCodPar_CTRL") ;
      if ( GXutil.len( sCtrlA130BarCodPar) > 0 )
      {
         A130BarCodPar = httpContext.cgiGet( sCtrlA130BarCodPar) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A130BarCodPar", A130BarCodPar);
      }
      else
      {
         A130BarCodPar = httpContext.cgiGet( sPrefix+"A130BarCodPar_PARM") ;
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
      sCtrlAV62BarSer = httpContext.cgiGet( sPrefix+"AV62BarSer_CTRL") ;
      if ( GXutil.len( sCtrlAV62BarSer) > 0 )
      {
         AV62BarSer = httpContext.cgiGet( sCtrlAV62BarSer) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62BarSer", AV62BarSer);
      }
      else
      {
         AV62BarSer = httpContext.cgiGet( sPrefix+"AV62BarSer_PARM") ;
      }
      sCtrlAV63BarSerDsc = httpContext.cgiGet( sPrefix+"AV63BarSerDsc_CTRL") ;
      if ( GXutil.len( sCtrlAV63BarSerDsc) > 0 )
      {
         AV63BarSerDsc = httpContext.cgiGet( sCtrlAV63BarSerDsc) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63BarSerDsc", AV63BarSerDsc);
      }
      else
      {
         AV63BarSerDsc = httpContext.cgiGet( sPrefix+"AV63BarSerDsc_PARM") ;
      }
      sCtrlAV64BarColNom = httpContext.cgiGet( sPrefix+"AV64BarColNom_CTRL") ;
      if ( GXutil.len( sCtrlAV64BarColNom) > 0 )
      {
         AV64BarColNom = httpContext.cgiGet( sCtrlAV64BarColNom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64BarColNom", AV64BarColNom);
      }
      else
      {
         AV64BarColNom = httpContext.cgiGet( sPrefix+"AV64BarColNom_PARM") ;
      }
      sCtrlAV65BarColNum = httpContext.cgiGet( sPrefix+"AV65BarColNum_CTRL") ;
      if ( GXutil.len( sCtrlAV65BarColNum) > 0 )
      {
         AV65BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV65BarColNum), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65BarColNum), 6, 0));
      }
      else
      {
         AV65BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV65BarColNum_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV73MacCod = httpContext.cgiGet( sPrefix+"AV73MacCod_CTRL") ;
      if ( GXutil.len( sCtrlAV73MacCod) > 0 )
      {
         AV73MacCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV73MacCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73MacCod), 8, 0));
      }
      else
      {
         AV73MacCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV73MacCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV74BarKgm = httpContext.cgiGet( sPrefix+"AV74BarKgm_CTRL") ;
      if ( GXutil.len( sCtrlAV74BarKgm) > 0 )
      {
         AV74BarKgm = localUtil.ctond( httpContext.cgiGet( sCtrlAV74BarKgm)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74BarKgm", GXutil.ltrimstr( AV74BarKgm, 9, 2));
      }
      else
      {
         AV74BarKgm = localUtil.ctond( httpContext.cgiGet( sPrefix+"AV74BarKgm_PARM")) ;
      }
      sCtrlAV75BarMtr = httpContext.cgiGet( sPrefix+"AV75BarMtr_CTRL") ;
      if ( GXutil.len( sCtrlAV75BarMtr) > 0 )
      {
         AV75BarMtr = localUtil.ctond( httpContext.cgiGet( sCtrlAV75BarMtr)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75BarMtr", GXutil.ltrimstr( AV75BarMtr, 9, 2));
      }
      else
      {
         AV75BarMtr = localUtil.ctond( httpContext.cgiGet( sPrefix+"AV75BarMtr_PARM")) ;
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
      pa1972( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1972( ) ;
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
      ws1972( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A396EmprCod_PARM", GXutil.rtrim( A396EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlA396EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A396EmprCod_CTRL", GXutil.rtrim( sCtrlA396EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A129BarCod_PARM", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA129BarCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A129BarCod_CTRL", GXutil.rtrim( sCtrlA129BarCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A132BarCodReo_PARM", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA132BarCodReo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A132BarCodReo_CTRL", GXutil.rtrim( sCtrlA132BarCodReo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A130BarCodPar_PARM", GXutil.rtrim( A130BarCodPar));
      if ( GXutil.len( GXutil.rtrim( sCtrlA130BarCodPar)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A130BarCodPar_CTRL", GXutil.rtrim( sCtrlA130BarCodPar));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV62BarSer_PARM", GXutil.rtrim( AV62BarSer));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV62BarSer)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV62BarSer_CTRL", GXutil.rtrim( sCtrlAV62BarSer));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV63BarSerDsc_PARM", GXutil.rtrim( AV63BarSerDsc));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV63BarSerDsc)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV63BarSerDsc_CTRL", GXutil.rtrim( sCtrlAV63BarSerDsc));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV64BarColNom_PARM", GXutil.rtrim( AV64BarColNom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV64BarColNom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV64BarColNom_CTRL", GXutil.rtrim( sCtrlAV64BarColNom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV65BarColNum_PARM", GXutil.ltrim( localUtil.ntoc( AV65BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV65BarColNum)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV65BarColNum_CTRL", GXutil.rtrim( sCtrlAV65BarColNum));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV73MacCod_PARM", GXutil.ltrim( localUtil.ntoc( AV73MacCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV73MacCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV73MacCod_CTRL", GXutil.rtrim( sCtrlAV73MacCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV74BarKgm_PARM", GXutil.ltrim( localUtil.ntoc( AV74BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV74BarKgm)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV74BarKgm_CTRL", GXutil.rtrim( sCtrlAV74BarKgm));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV75BarMtr_PARM", GXutil.ltrim( localUtil.ntoc( AV75BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV75BarMtr)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV75BarMtr_CTRL", GXutil.rtrim( sCtrlAV75BarMtr));
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
      we1972( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115562939", true, true);
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
      httpContext.AddJavascriptSource("consultadeproduccion_agrupadas.js", "?202682115562939", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_1022( )
   {
      edtBarAgrNhdr_Internalname = sPrefix+"BARAGRNHDR_"+sGXsfl_102_idx ;
      edtKgmAgr_Internalname = sPrefix+"KGMAGR_"+sGXsfl_102_idx ;
      edtMtrAgr_Internalname = sPrefix+"MTRAGR_"+sGXsfl_102_idx ;
      edtPieAgr_Internalname = sPrefix+"PIEAGR_"+sGXsfl_102_idx ;
      edtavMaccodagr_Internalname = sPrefix+"vMACCODAGR_"+sGXsfl_102_idx ;
      edtBarAgrSer_Internalname = sPrefix+"BARAGRSER_"+sGXsfl_102_idx ;
      edtBarAgrDsc_Internalname = sPrefix+"BARAGRDSC_"+sGXsfl_102_idx ;
      edtCliCodAgr_Internalname = sPrefix+"CLICODAGR_"+sGXsfl_102_idx ;
      edtColNomAgr_Internalname = sPrefix+"COLNOMAGR_"+sGXsfl_102_idx ;
      edtColNumAgr_Internalname = sPrefix+"COLNUMAGR_"+sGXsfl_102_idx ;
      edtColNoCAgr_Internalname = sPrefix+"COLNOCAGR_"+sGXsfl_102_idx ;
      edtColNuCAgr_Internalname = sPrefix+"COLNUCAGR_"+sGXsfl_102_idx ;
      edtEmprCod_Internalname = sPrefix+"EMPRCOD_"+sGXsfl_102_idx ;
      edtBarAgrCod_Internalname = sPrefix+"BARAGRCOD_"+sGXsfl_102_idx ;
      edtBarAgrReo_Internalname = sPrefix+"BARAGRREO_"+sGXsfl_102_idx ;
      edtBarAgrPar_Internalname = sPrefix+"BARAGRPAR_"+sGXsfl_102_idx ;
   }

   public void subsflControlProps_fel_1022( )
   {
      edtBarAgrNhdr_Internalname = sPrefix+"BARAGRNHDR_"+sGXsfl_102_fel_idx ;
      edtKgmAgr_Internalname = sPrefix+"KGMAGR_"+sGXsfl_102_fel_idx ;
      edtMtrAgr_Internalname = sPrefix+"MTRAGR_"+sGXsfl_102_fel_idx ;
      edtPieAgr_Internalname = sPrefix+"PIEAGR_"+sGXsfl_102_fel_idx ;
      edtavMaccodagr_Internalname = sPrefix+"vMACCODAGR_"+sGXsfl_102_fel_idx ;
      edtBarAgrSer_Internalname = sPrefix+"BARAGRSER_"+sGXsfl_102_fel_idx ;
      edtBarAgrDsc_Internalname = sPrefix+"BARAGRDSC_"+sGXsfl_102_fel_idx ;
      edtCliCodAgr_Internalname = sPrefix+"CLICODAGR_"+sGXsfl_102_fel_idx ;
      edtColNomAgr_Internalname = sPrefix+"COLNOMAGR_"+sGXsfl_102_fel_idx ;
      edtColNumAgr_Internalname = sPrefix+"COLNUMAGR_"+sGXsfl_102_fel_idx ;
      edtColNoCAgr_Internalname = sPrefix+"COLNOCAGR_"+sGXsfl_102_fel_idx ;
      edtColNuCAgr_Internalname = sPrefix+"COLNUCAGR_"+sGXsfl_102_fel_idx ;
      edtEmprCod_Internalname = sPrefix+"EMPRCOD_"+sGXsfl_102_fel_idx ;
      edtBarAgrCod_Internalname = sPrefix+"BARAGRCOD_"+sGXsfl_102_fel_idx ;
      edtBarAgrReo_Internalname = sPrefix+"BARAGRREO_"+sGXsfl_102_fel_idx ;
      edtBarAgrPar_Internalname = sPrefix+"BARAGRPAR_"+sGXsfl_102_fel_idx ;
   }

   public void sendrow_1022( )
   {
      subsflControlProps_1022( ) ;
      wb1970( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_102_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_102_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_102_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarAgrNhdr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAgrNhdr_Internalname,GXutil.rtrim( A13792BarAgrNhdr),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarAgrNhdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarAgrNhdr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(102),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtKgmAgr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtKgmAgr_Internalname,GXutil.ltrim( localUtil.ntoc( A590KgmAgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A590KgmAgr, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtKgmAgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtKgmAgr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(102),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMtrAgr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMtrAgr_Internalname,GXutil.ltrim( localUtil.ntoc( A869MtrAgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A869MtrAgr, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMtrAgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtMtrAgr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(102),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPieAgr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPieAgr_Internalname,GXutil.ltrim( localUtil.ntoc( A671PieAgr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A671PieAgr), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPieAgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPieAgr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(102),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavMaccodagr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaccodagr_Internalname,GXutil.ltrim( localUtil.ntoc( AV72MacCodAgr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavMaccodagr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV72MacCodAgr), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV72MacCodAgr), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavMaccodagr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavMaccodagr_Visible),Integer.valueOf(edtavMaccodagr_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(102),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarAgrSer_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAgrSer_Internalname,GXutil.rtrim( A1245BarAgrSer),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarAgrSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarAgrSer_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(102),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarAgrDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAgrDsc_Internalname,GXutil.rtrim( A1507BarAgrDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarAgrDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarAgrDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(102),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCliCodAgr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCodAgr_Internalname,GXutil.ltrim( localUtil.ntoc( A1508CliCodAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1508CliCodAgr), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliCodAgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliCodAgr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(102),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtColNomAgr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtColNomAgr_Internalname,GXutil.rtrim( A1510ColNomAgr),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtColNomAgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtColNomAgr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(102),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtColNumAgr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtColNumAgr_Internalname,GXutil.ltrim( localUtil.ntoc( A1512ColNumAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1512ColNumAgr), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtColNumAgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtColNumAgr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(102),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtColNoCAgr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtColNoCAgr_Internalname,GXutil.rtrim( A1509ColNoCAgr),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtColNoCAgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtColNoCAgr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(102),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtColNuCAgr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtColNuCAgr_Internalname,GXutil.ltrim( localUtil.ntoc( A1511ColNuCAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1511ColNuCAgr), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtColNuCAgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtColNuCAgr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(102),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(102),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAgrCod_Internalname,GXutil.ltrim( localUtil.ntoc( A119BarAgrCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A119BarAgrCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarAgrCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(102),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAgrReo_Internalname,GXutil.ltrim( localUtil.ntoc( A124BarAgrReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A124BarAgrReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarAgrReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(102),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAgrPar_Internalname,GXutil.rtrim( A122BarAgrPar),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarAgrPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(102),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes1972( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_102_idx = ((subGrid_Islastpage==1)&&(nGXsfl_102_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_102_idx+1) ;
         sGXsfl_102_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_102_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1022( ) ;
      }
      /* End function sendrow_1022 */
   }

   public void startgridcontrol102( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"102\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarAgrNhdr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº HDR", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtKgmAgr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMtrAgr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPieAgr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Piezas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavMaccodagr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Macro", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarAgrSer_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarAgrDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliCodAgr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtColNomAgr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtColNumAgr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtColNoCAgr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtColNuCAgr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N° Color Cliente", "")) ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
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
         GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13792BarAgrNhdr));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarAgrNhdr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A590KgmAgr, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtKgmAgr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A869MtrAgr, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMtrAgr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A671PieAgr, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPieAgr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV72MacCodAgr, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaccodagr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavMaccodagr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1245BarAgrSer));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarAgrSer_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1507BarAgrDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarAgrDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1508CliCodAgr, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliCodAgr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1510ColNomAgr));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtColNomAgr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1512ColNumAgr, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtColNumAgr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1509ColNoCAgr));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtColNoCAgr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1511ColNuCAgr, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtColNuCAgr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A119BarAgrCod, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A124BarAgrReo, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A122BarAgrPar));
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
      edtBarCod_Internalname = sPrefix+"BARCOD" ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO" ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR" ;
      edtavClicod_Internalname = sPrefix+"vCLICOD" ;
      edtavClinom_Internalname = sPrefix+"vCLINOM" ;
      edtavPedidocliente_Internalname = sPrefix+"vPEDIDOCLIENTE" ;
      edtavMaccod_Internalname = sPrefix+"vMACCOD" ;
      edtavBarkgm_Internalname = sPrefix+"vBARKGM" ;
      edtavBarmtr_Internalname = sPrefix+"vBARMTR" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      edtavBarser_Internalname = sPrefix+"vBARSER" ;
      edtavBarserdsc_Internalname = sPrefix+"vBARSERDSC" ;
      edtavBarcolnom_Internalname = sPrefix+"vBARCOLNOM" ;
      edtavBarcolnum_Internalname = sPrefix+"vBARCOLNUM" ;
      divUnnamedtable3_Internalname = sPrefix+"UNNAMEDTABLE3" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE1" ;
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtBarAgrNhdr_Internalname = sPrefix+"BARAGRNHDR" ;
      edtKgmAgr_Internalname = sPrefix+"KGMAGR" ;
      edtMtrAgr_Internalname = sPrefix+"MTRAGR" ;
      edtPieAgr_Internalname = sPrefix+"PIEAGR" ;
      edtavMaccodagr_Internalname = sPrefix+"vMACCODAGR" ;
      edtBarAgrSer_Internalname = sPrefix+"BARAGRSER" ;
      edtBarAgrDsc_Internalname = sPrefix+"BARAGRDSC" ;
      edtCliCodAgr_Internalname = sPrefix+"CLICODAGR" ;
      edtColNomAgr_Internalname = sPrefix+"COLNOMAGR" ;
      edtColNumAgr_Internalname = sPrefix+"COLNUMAGR" ;
      edtColNoCAgr_Internalname = sPrefix+"COLNOCAGR" ;
      edtColNuCAgr_Internalname = sPrefix+"COLNUCAGR" ;
      edtEmprCod_Internalname = sPrefix+"EMPRCOD" ;
      edtBarAgrCod_Internalname = sPrefix+"BARAGRCOD" ;
      edtBarAgrReo_Internalname = sPrefix+"BARAGRREO" ;
      edtBarAgrPar_Internalname = sPrefix+"BARAGRPAR" ;
      edtavTotvaluekgmagr_Internalname = sPrefix+"vTOTVALUEKGMAGR" ;
      edtavTotvaluemtragr_Internalname = sPrefix+"vTOTVALUEMTRAGR" ;
      edtavTotvaluepieagr_Internalname = sPrefix+"vTOTVALUEPIEAGR" ;
      tblGridtabletotalizer_Internalname = sPrefix+"GRIDTABLETOTALIZER" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      Datamonjs_Internalname = sPrefix+"DATAMONJS" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
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
      edtBarAgrPar_Jsonclick = "" ;
      edtBarAgrReo_Jsonclick = "" ;
      edtBarAgrCod_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      edtColNuCAgr_Jsonclick = "" ;
      edtColNoCAgr_Jsonclick = "" ;
      edtColNumAgr_Jsonclick = "" ;
      edtColNomAgr_Jsonclick = "" ;
      edtCliCodAgr_Jsonclick = "" ;
      edtBarAgrDsc_Jsonclick = "" ;
      edtBarAgrSer_Jsonclick = "" ;
      edtavMaccodagr_Jsonclick = "" ;
      edtavMaccodagr_Enabled = 0 ;
      edtPieAgr_Jsonclick = "" ;
      edtMtrAgr_Jsonclick = "" ;
      edtKgmAgr_Jsonclick = "" ;
      edtBarAgrNhdr_Jsonclick = "" ;
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavTotvaluepieagr_Jsonclick = "" ;
      edtavTotvaluepieagr_Enabled = 1 ;
      edtavTotvaluemtragr_Jsonclick = "" ;
      edtavTotvaluemtragr_Enabled = 1 ;
      edtavTotvaluekgmagr_Jsonclick = "" ;
      edtavTotvaluekgmagr_Enabled = 1 ;
      edtColNuCAgr_Visible = -1 ;
      edtColNoCAgr_Visible = -1 ;
      edtColNumAgr_Visible = -1 ;
      edtColNomAgr_Visible = -1 ;
      edtCliCodAgr_Visible = -1 ;
      edtBarAgrDsc_Visible = -1 ;
      edtBarAgrSer_Visible = -1 ;
      edtavMaccodagr_Visible = -1 ;
      edtPieAgr_Visible = -1 ;
      edtMtrAgr_Visible = -1 ;
      edtKgmAgr_Visible = -1 ;
      edtBarAgrNhdr_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
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
      edtavBarmtr_Jsonclick = "" ;
      edtavBarmtr_Enabled = 0 ;
      edtavBarkgm_Jsonclick = "" ;
      edtavBarkgm_Enabled = 0 ;
      edtavMaccod_Jsonclick = "" ;
      edtavMaccod_Enabled = 0 ;
      edtavPedidocliente_Jsonclick = "" ;
      edtavPedidocliente_Enabled = 0 ;
      edtavClinom_Jsonclick = "" ;
      edtavClinom_Enabled = 0 ;
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Enabled = 0 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Enabled = 0 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Enabled = 0 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Enabled = 0 ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "ConsultadeProduccion_AgrupadasGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic|||||Dynamic|Dynamic||Dynamic||Dynamic|" ;
      Ddo_grid_Includedatalist = "T|||||T|T||T||T|" ;
      Ddo_grid_Filterisrange = "|T|T|T||||T||T||T" ;
      Ddo_grid_Filtertype = "Character|Numeric|Numeric|Numeric||Character|Character|Numeric|Character|Numeric|Character|Numeric" ;
      Ddo_grid_Includefilter = "T|T|T|T||T|T|T|T|T|T|T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "|T|T|T||T|T|T|T|T|T|T" ;
      Ddo_grid_Columnssortvalues = "|1|2|3||4|5|6|7|8|9|10" ;
      Ddo_grid_Columnids = "0:BarAgrNhdr|1:KgmAgr|2:MtrAgr|3:PieAgr|4:MacCodAgr|5:BarAgrSer|6:BarAgrDsc|7:CliCodAgr|8:ColNomAgr|9:ColNumAgr|10:ColNoCAgr|11:ColNuCAgr" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'sPrefix'},{av:'AV20ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV15ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV21TFBarAgrNhdr',fld:'vTFBARAGRNHDR',pic:''},{av:'AV22TFBarAgrNhdr_Sel',fld:'vTFBARAGRNHDR_SEL',pic:''},{av:'AV50TFKgmAgr',fld:'vTFKGMAGR',pic:'ZZZZZ9.99'},{av:'AV51TFKgmAgr_To',fld:'vTFKGMAGR_TO',pic:'ZZZZZ9.99'},{av:'AV52TFMtrAgr',fld:'vTFMTRAGR',pic:'ZZZZZ9.99'},{av:'AV53TFMtrAgr_To',fld:'vTFMTRAGR_TO',pic:'ZZZZZ9.99'},{av:'AV54TFPieAgr',fld:'vTFPIEAGR',pic:'ZZZ9'},{av:'AV55TFPieAgr_To',fld:'vTFPIEAGR_TO',pic:'ZZZ9'},{av:'AV36TFBarAgrSer',fld:'vTFBARAGRSER',pic:''},{av:'AV37TFBarAgrSer_Sel',fld:'vTFBARAGRSER_SEL',pic:''},{av:'AV38TFBarAgrDsc',fld:'vTFBARAGRDSC',pic:''},{av:'AV39TFBarAgrDsc_Sel',fld:'vTFBARAGRDSC_SEL',pic:''},{av:'AV40TFCliCodAgr',fld:'vTFCLICODAGR',pic:'ZZZZZ9'},{av:'AV41TFCliCodAgr_To',fld:'vTFCLICODAGR_TO',pic:'ZZZZZ9'},{av:'AV42TFColNomAgr',fld:'vTFCOLNOMAGR',pic:''},{av:'AV43TFColNomAgr_Sel',fld:'vTFCOLNOMAGR_SEL',pic:''},{av:'AV44TFColNumAgr',fld:'vTFCOLNUMAGR',pic:'ZZZZZ9'},{av:'AV45TFColNumAgr_To',fld:'vTFCOLNUMAGR_TO',pic:'ZZZZZ9'},{av:'AV46TFColNoCAgr',fld:'vTFCOLNOCAGR',pic:''},{av:'AV47TFColNoCAgr_Sel',fld:'vTFCOLNOCAGR_SEL',pic:''},{av:'AV48TFColNuCAgr',fld:'vTFCOLNUCAGR',pic:'ZZZZZ9'},{av:'AV49TFColNuCAgr_To',fld:'vTFCOLNUCAGR_TO',pic:'ZZZZZ9'},{av:'AV82Pgmname',fld:'vPGMNAME',pic:''},{av:'AV27OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV28OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV56TotKgmAgr',fld:'vTOTKGMAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV58TotMtrAgr',fld:'vTOTMTRAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV60TotPieAgr',fld:'vTOTPIEAGR',pic:'ZZZ9',hsh:true},{av:'AV74BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV75BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'A590KgmAgr',fld:'KGMAGR',pic:'ZZZZZ9.99'},{av:'A869MtrAgr',fld:'MTRAGR',pic:'ZZZZZ9.99'},{av:'A671PieAgr',fld:'PIEAGR',pic:'ZZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV20ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV15ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtBarAgrNhdr_Visible',ctrl:'BARAGRNHDR',prop:'Visible'},{av:'edtKgmAgr_Visible',ctrl:'KGMAGR',prop:'Visible'},{av:'edtMtrAgr_Visible',ctrl:'MTRAGR',prop:'Visible'},{av:'edtPieAgr_Visible',ctrl:'PIEAGR',prop:'Visible'},{av:'edtavMaccodagr_Visible',ctrl:'vMACCODAGR',prop:'Visible'},{av:'edtBarAgrSer_Visible',ctrl:'BARAGRSER',prop:'Visible'},{av:'edtBarAgrDsc_Visible',ctrl:'BARAGRDSC',prop:'Visible'},{av:'edtCliCodAgr_Visible',ctrl:'CLICODAGR',prop:'Visible'},{av:'edtColNomAgr_Visible',ctrl:'COLNOMAGR',prop:'Visible'},{av:'edtColNumAgr_Visible',ctrl:'COLNUMAGR',prop:'Visible'},{av:'edtColNoCAgr_Visible',ctrl:'COLNOCAGR',prop:'Visible'},{av:'edtColNuCAgr_Visible',ctrl:'COLNUCAGR',prop:'Visible'},{av:'AV25GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV26GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV18ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV56TotKgmAgr',fld:'vTOTKGMAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV58TotMtrAgr',fld:'vTOTMTRAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV60TotPieAgr',fld:'vTOTPIEAGR',pic:'ZZZ9',hsh:true},{av:'AV57TotValueKgmAgr',fld:'vTOTVALUEKGMAGR',pic:''},{av:'AV59TotValueMtrAgr',fld:'vTOTVALUEMTRAGR',pic:''},{av:'AV61TotValuePieAgr',fld:'vTOTVALUEPIEAGR',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e121972',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV20ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV15ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV21TFBarAgrNhdr',fld:'vTFBARAGRNHDR',pic:''},{av:'AV22TFBarAgrNhdr_Sel',fld:'vTFBARAGRNHDR_SEL',pic:''},{av:'AV50TFKgmAgr',fld:'vTFKGMAGR',pic:'ZZZZZ9.99'},{av:'AV51TFKgmAgr_To',fld:'vTFKGMAGR_TO',pic:'ZZZZZ9.99'},{av:'AV52TFMtrAgr',fld:'vTFMTRAGR',pic:'ZZZZZ9.99'},{av:'AV53TFMtrAgr_To',fld:'vTFMTRAGR_TO',pic:'ZZZZZ9.99'},{av:'AV54TFPieAgr',fld:'vTFPIEAGR',pic:'ZZZ9'},{av:'AV55TFPieAgr_To',fld:'vTFPIEAGR_TO',pic:'ZZZ9'},{av:'AV36TFBarAgrSer',fld:'vTFBARAGRSER',pic:''},{av:'AV37TFBarAgrSer_Sel',fld:'vTFBARAGRSER_SEL',pic:''},{av:'AV38TFBarAgrDsc',fld:'vTFBARAGRDSC',pic:''},{av:'AV39TFBarAgrDsc_Sel',fld:'vTFBARAGRDSC_SEL',pic:''},{av:'AV40TFCliCodAgr',fld:'vTFCLICODAGR',pic:'ZZZZZ9'},{av:'AV41TFCliCodAgr_To',fld:'vTFCLICODAGR_TO',pic:'ZZZZZ9'},{av:'AV42TFColNomAgr',fld:'vTFCOLNOMAGR',pic:''},{av:'AV43TFColNomAgr_Sel',fld:'vTFCOLNOMAGR_SEL',pic:''},{av:'AV44TFColNumAgr',fld:'vTFCOLNUMAGR',pic:'ZZZZZ9'},{av:'AV45TFColNumAgr_To',fld:'vTFCOLNUMAGR_TO',pic:'ZZZZZ9'},{av:'AV46TFColNoCAgr',fld:'vTFCOLNOCAGR',pic:''},{av:'AV47TFColNoCAgr_Sel',fld:'vTFCOLNOCAGR_SEL',pic:''},{av:'AV48TFColNuCAgr',fld:'vTFCOLNUCAGR',pic:'ZZZZZ9'},{av:'AV49TFColNuCAgr_To',fld:'vTFCOLNUCAGR_TO',pic:'ZZZZZ9'},{av:'AV82Pgmname',fld:'vPGMNAME',pic:''},{av:'AV27OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV28OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV56TotKgmAgr',fld:'vTOTKGMAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV58TotMtrAgr',fld:'vTOTMTRAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV60TotPieAgr',fld:'vTOTPIEAGR',pic:'ZZZ9',hsh:true},{av:'AV74BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV75BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e131972',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV20ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV15ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV21TFBarAgrNhdr',fld:'vTFBARAGRNHDR',pic:''},{av:'AV22TFBarAgrNhdr_Sel',fld:'vTFBARAGRNHDR_SEL',pic:''},{av:'AV50TFKgmAgr',fld:'vTFKGMAGR',pic:'ZZZZZ9.99'},{av:'AV51TFKgmAgr_To',fld:'vTFKGMAGR_TO',pic:'ZZZZZ9.99'},{av:'AV52TFMtrAgr',fld:'vTFMTRAGR',pic:'ZZZZZ9.99'},{av:'AV53TFMtrAgr_To',fld:'vTFMTRAGR_TO',pic:'ZZZZZ9.99'},{av:'AV54TFPieAgr',fld:'vTFPIEAGR',pic:'ZZZ9'},{av:'AV55TFPieAgr_To',fld:'vTFPIEAGR_TO',pic:'ZZZ9'},{av:'AV36TFBarAgrSer',fld:'vTFBARAGRSER',pic:''},{av:'AV37TFBarAgrSer_Sel',fld:'vTFBARAGRSER_SEL',pic:''},{av:'AV38TFBarAgrDsc',fld:'vTFBARAGRDSC',pic:''},{av:'AV39TFBarAgrDsc_Sel',fld:'vTFBARAGRDSC_SEL',pic:''},{av:'AV40TFCliCodAgr',fld:'vTFCLICODAGR',pic:'ZZZZZ9'},{av:'AV41TFCliCodAgr_To',fld:'vTFCLICODAGR_TO',pic:'ZZZZZ9'},{av:'AV42TFColNomAgr',fld:'vTFCOLNOMAGR',pic:''},{av:'AV43TFColNomAgr_Sel',fld:'vTFCOLNOMAGR_SEL',pic:''},{av:'AV44TFColNumAgr',fld:'vTFCOLNUMAGR',pic:'ZZZZZ9'},{av:'AV45TFColNumAgr_To',fld:'vTFCOLNUMAGR_TO',pic:'ZZZZZ9'},{av:'AV46TFColNoCAgr',fld:'vTFCOLNOCAGR',pic:''},{av:'AV47TFColNoCAgr_Sel',fld:'vTFCOLNOCAGR_SEL',pic:''},{av:'AV48TFColNuCAgr',fld:'vTFCOLNUCAGR',pic:'ZZZZZ9'},{av:'AV49TFColNuCAgr_To',fld:'vTFCOLNUCAGR_TO',pic:'ZZZZZ9'},{av:'AV82Pgmname',fld:'vPGMNAME',pic:''},{av:'AV27OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV28OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV56TotKgmAgr',fld:'vTOTKGMAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV58TotMtrAgr',fld:'vTOTMTRAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV60TotPieAgr',fld:'vTOTPIEAGR',pic:'ZZZ9',hsh:true},{av:'AV74BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV75BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e141972',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV20ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV15ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV21TFBarAgrNhdr',fld:'vTFBARAGRNHDR',pic:''},{av:'AV22TFBarAgrNhdr_Sel',fld:'vTFBARAGRNHDR_SEL',pic:''},{av:'AV50TFKgmAgr',fld:'vTFKGMAGR',pic:'ZZZZZ9.99'},{av:'AV51TFKgmAgr_To',fld:'vTFKGMAGR_TO',pic:'ZZZZZ9.99'},{av:'AV52TFMtrAgr',fld:'vTFMTRAGR',pic:'ZZZZZ9.99'},{av:'AV53TFMtrAgr_To',fld:'vTFMTRAGR_TO',pic:'ZZZZZ9.99'},{av:'AV54TFPieAgr',fld:'vTFPIEAGR',pic:'ZZZ9'},{av:'AV55TFPieAgr_To',fld:'vTFPIEAGR_TO',pic:'ZZZ9'},{av:'AV36TFBarAgrSer',fld:'vTFBARAGRSER',pic:''},{av:'AV37TFBarAgrSer_Sel',fld:'vTFBARAGRSER_SEL',pic:''},{av:'AV38TFBarAgrDsc',fld:'vTFBARAGRDSC',pic:''},{av:'AV39TFBarAgrDsc_Sel',fld:'vTFBARAGRDSC_SEL',pic:''},{av:'AV40TFCliCodAgr',fld:'vTFCLICODAGR',pic:'ZZZZZ9'},{av:'AV41TFCliCodAgr_To',fld:'vTFCLICODAGR_TO',pic:'ZZZZZ9'},{av:'AV42TFColNomAgr',fld:'vTFCOLNOMAGR',pic:''},{av:'AV43TFColNomAgr_Sel',fld:'vTFCOLNOMAGR_SEL',pic:''},{av:'AV44TFColNumAgr',fld:'vTFCOLNUMAGR',pic:'ZZZZZ9'},{av:'AV45TFColNumAgr_To',fld:'vTFCOLNUMAGR_TO',pic:'ZZZZZ9'},{av:'AV46TFColNoCAgr',fld:'vTFCOLNOCAGR',pic:''},{av:'AV47TFColNoCAgr_Sel',fld:'vTFCOLNOCAGR_SEL',pic:''},{av:'AV48TFColNuCAgr',fld:'vTFCOLNUCAGR',pic:'ZZZZZ9'},{av:'AV49TFColNuCAgr_To',fld:'vTFCOLNUCAGR_TO',pic:'ZZZZZ9'},{av:'AV82Pgmname',fld:'vPGMNAME',pic:''},{av:'AV27OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV28OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV56TotKgmAgr',fld:'vTOTKGMAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV58TotMtrAgr',fld:'vTOTMTRAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV60TotPieAgr',fld:'vTOTPIEAGR',pic:'ZZZ9',hsh:true},{av:'AV74BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV75BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV27OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV28OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV48TFColNuCAgr',fld:'vTFCOLNUCAGR',pic:'ZZZZZ9'},{av:'AV49TFColNuCAgr_To',fld:'vTFCOLNUCAGR_TO',pic:'ZZZZZ9'},{av:'AV46TFColNoCAgr',fld:'vTFCOLNOCAGR',pic:''},{av:'AV47TFColNoCAgr_Sel',fld:'vTFCOLNOCAGR_SEL',pic:''},{av:'AV44TFColNumAgr',fld:'vTFCOLNUMAGR',pic:'ZZZZZ9'},{av:'AV45TFColNumAgr_To',fld:'vTFCOLNUMAGR_TO',pic:'ZZZZZ9'},{av:'AV42TFColNomAgr',fld:'vTFCOLNOMAGR',pic:''},{av:'AV43TFColNomAgr_Sel',fld:'vTFCOLNOMAGR_SEL',pic:''},{av:'AV40TFCliCodAgr',fld:'vTFCLICODAGR',pic:'ZZZZZ9'},{av:'AV41TFCliCodAgr_To',fld:'vTFCLICODAGR_TO',pic:'ZZZZZ9'},{av:'AV38TFBarAgrDsc',fld:'vTFBARAGRDSC',pic:''},{av:'AV39TFBarAgrDsc_Sel',fld:'vTFBARAGRDSC_SEL',pic:''},{av:'AV36TFBarAgrSer',fld:'vTFBARAGRSER',pic:''},{av:'AV37TFBarAgrSer_Sel',fld:'vTFBARAGRSER_SEL',pic:''},{av:'AV54TFPieAgr',fld:'vTFPIEAGR',pic:'ZZZ9'},{av:'AV55TFPieAgr_To',fld:'vTFPIEAGR_TO',pic:'ZZZ9'},{av:'AV52TFMtrAgr',fld:'vTFMTRAGR',pic:'ZZZZZ9.99'},{av:'AV53TFMtrAgr_To',fld:'vTFMTRAGR_TO',pic:'ZZZZZ9.99'},{av:'AV50TFKgmAgr',fld:'vTFKGMAGR',pic:'ZZZZZ9.99'},{av:'AV51TFKgmAgr_To',fld:'vTFKGMAGR_TO',pic:'ZZZZZ9.99'},{av:'AV21TFBarAgrNhdr',fld:'vTFBARAGRNHDR',pic:''},{av:'AV22TFBarAgrNhdr_Sel',fld:'vTFBARAGRNHDR_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e181972',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A119BarAgrCod',fld:'BARAGRCOD',pic:'ZZZZZZZ9'},{av:'A124BarAgrReo',fld:'BARAGRREO',pic:'9'},{av:'A122BarAgrPar',fld:'BARAGRPAR',pic:''}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV72MacCodAgr',fld:'vMACCODAGR',pic:'ZZZZZZZ9'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e151972',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV20ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV15ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV21TFBarAgrNhdr',fld:'vTFBARAGRNHDR',pic:''},{av:'AV22TFBarAgrNhdr_Sel',fld:'vTFBARAGRNHDR_SEL',pic:''},{av:'AV50TFKgmAgr',fld:'vTFKGMAGR',pic:'ZZZZZ9.99'},{av:'AV51TFKgmAgr_To',fld:'vTFKGMAGR_TO',pic:'ZZZZZ9.99'},{av:'AV52TFMtrAgr',fld:'vTFMTRAGR',pic:'ZZZZZ9.99'},{av:'AV53TFMtrAgr_To',fld:'vTFMTRAGR_TO',pic:'ZZZZZ9.99'},{av:'AV54TFPieAgr',fld:'vTFPIEAGR',pic:'ZZZ9'},{av:'AV55TFPieAgr_To',fld:'vTFPIEAGR_TO',pic:'ZZZ9'},{av:'AV36TFBarAgrSer',fld:'vTFBARAGRSER',pic:''},{av:'AV37TFBarAgrSer_Sel',fld:'vTFBARAGRSER_SEL',pic:''},{av:'AV38TFBarAgrDsc',fld:'vTFBARAGRDSC',pic:''},{av:'AV39TFBarAgrDsc_Sel',fld:'vTFBARAGRDSC_SEL',pic:''},{av:'AV40TFCliCodAgr',fld:'vTFCLICODAGR',pic:'ZZZZZ9'},{av:'AV41TFCliCodAgr_To',fld:'vTFCLICODAGR_TO',pic:'ZZZZZ9'},{av:'AV42TFColNomAgr',fld:'vTFCOLNOMAGR',pic:''},{av:'AV43TFColNomAgr_Sel',fld:'vTFCOLNOMAGR_SEL',pic:''},{av:'AV44TFColNumAgr',fld:'vTFCOLNUMAGR',pic:'ZZZZZ9'},{av:'AV45TFColNumAgr_To',fld:'vTFCOLNUMAGR_TO',pic:'ZZZZZ9'},{av:'AV46TFColNoCAgr',fld:'vTFCOLNOCAGR',pic:''},{av:'AV47TFColNoCAgr_Sel',fld:'vTFCOLNOCAGR_SEL',pic:''},{av:'AV48TFColNuCAgr',fld:'vTFCOLNUCAGR',pic:'ZZZZZ9'},{av:'AV49TFColNuCAgr_To',fld:'vTFCOLNUCAGR_TO',pic:'ZZZZZ9'},{av:'AV82Pgmname',fld:'vPGMNAME',pic:''},{av:'AV27OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV28OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV56TotKgmAgr',fld:'vTOTKGMAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV58TotMtrAgr',fld:'vTOTMTRAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV60TotPieAgr',fld:'vTOTPIEAGR',pic:'ZZZ9',hsh:true},{av:'AV74BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV75BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'},{av:'A590KgmAgr',fld:'KGMAGR',pic:'ZZZZZ9.99'},{av:'A869MtrAgr',fld:'MTRAGR',pic:'ZZZZZ9.99'},{av:'A671PieAgr',fld:'PIEAGR',pic:'ZZZ9'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV15ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV20ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtBarAgrNhdr_Visible',ctrl:'BARAGRNHDR',prop:'Visible'},{av:'edtKgmAgr_Visible',ctrl:'KGMAGR',prop:'Visible'},{av:'edtMtrAgr_Visible',ctrl:'MTRAGR',prop:'Visible'},{av:'edtPieAgr_Visible',ctrl:'PIEAGR',prop:'Visible'},{av:'edtavMaccodagr_Visible',ctrl:'vMACCODAGR',prop:'Visible'},{av:'edtBarAgrSer_Visible',ctrl:'BARAGRSER',prop:'Visible'},{av:'edtBarAgrDsc_Visible',ctrl:'BARAGRDSC',prop:'Visible'},{av:'edtCliCodAgr_Visible',ctrl:'CLICODAGR',prop:'Visible'},{av:'edtColNomAgr_Visible',ctrl:'COLNOMAGR',prop:'Visible'},{av:'edtColNumAgr_Visible',ctrl:'COLNUMAGR',prop:'Visible'},{av:'edtColNoCAgr_Visible',ctrl:'COLNOCAGR',prop:'Visible'},{av:'edtColNuCAgr_Visible',ctrl:'COLNUCAGR',prop:'Visible'},{av:'AV25GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV26GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV18ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV56TotKgmAgr',fld:'vTOTKGMAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV58TotMtrAgr',fld:'vTOTMTRAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV60TotPieAgr',fld:'vTOTPIEAGR',pic:'ZZZ9',hsh:true},{av:'AV57TotValueKgmAgr',fld:'vTOTVALUEKGMAGR',pic:''},{av:'AV59TotValueMtrAgr',fld:'vTOTVALUEMTRAGR',pic:''},{av:'AV61TotValuePieAgr',fld:'vTOTVALUEPIEAGR',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e111972',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV20ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV15ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV21TFBarAgrNhdr',fld:'vTFBARAGRNHDR',pic:''},{av:'AV22TFBarAgrNhdr_Sel',fld:'vTFBARAGRNHDR_SEL',pic:''},{av:'AV50TFKgmAgr',fld:'vTFKGMAGR',pic:'ZZZZZ9.99'},{av:'AV51TFKgmAgr_To',fld:'vTFKGMAGR_TO',pic:'ZZZZZ9.99'},{av:'AV52TFMtrAgr',fld:'vTFMTRAGR',pic:'ZZZZZ9.99'},{av:'AV53TFMtrAgr_To',fld:'vTFMTRAGR_TO',pic:'ZZZZZ9.99'},{av:'AV54TFPieAgr',fld:'vTFPIEAGR',pic:'ZZZ9'},{av:'AV55TFPieAgr_To',fld:'vTFPIEAGR_TO',pic:'ZZZ9'},{av:'AV36TFBarAgrSer',fld:'vTFBARAGRSER',pic:''},{av:'AV37TFBarAgrSer_Sel',fld:'vTFBARAGRSER_SEL',pic:''},{av:'AV38TFBarAgrDsc',fld:'vTFBARAGRDSC',pic:''},{av:'AV39TFBarAgrDsc_Sel',fld:'vTFBARAGRDSC_SEL',pic:''},{av:'AV40TFCliCodAgr',fld:'vTFCLICODAGR',pic:'ZZZZZ9'},{av:'AV41TFCliCodAgr_To',fld:'vTFCLICODAGR_TO',pic:'ZZZZZ9'},{av:'AV42TFColNomAgr',fld:'vTFCOLNOMAGR',pic:''},{av:'AV43TFColNomAgr_Sel',fld:'vTFCOLNOMAGR_SEL',pic:''},{av:'AV44TFColNumAgr',fld:'vTFCOLNUMAGR',pic:'ZZZZZ9'},{av:'AV45TFColNumAgr_To',fld:'vTFCOLNUMAGR_TO',pic:'ZZZZZ9'},{av:'AV46TFColNoCAgr',fld:'vTFCOLNOCAGR',pic:''},{av:'AV47TFColNoCAgr_Sel',fld:'vTFCOLNOCAGR_SEL',pic:''},{av:'AV48TFColNuCAgr',fld:'vTFCOLNUCAGR',pic:'ZZZZZ9'},{av:'AV49TFColNuCAgr_To',fld:'vTFCOLNUCAGR_TO',pic:'ZZZZZ9'},{av:'AV82Pgmname',fld:'vPGMNAME',pic:''},{av:'AV27OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV28OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV56TotKgmAgr',fld:'vTOTKGMAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV58TotMtrAgr',fld:'vTOTMTRAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV60TotPieAgr',fld:'vTOTPIEAGR',pic:'ZZZ9',hsh:true},{av:'AV74BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV75BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'A590KgmAgr',fld:'KGMAGR',pic:'ZZZZZ9.99'},{av:'A869MtrAgr',fld:'MTRAGR',pic:'ZZZZZ9.99'},{av:'A671PieAgr',fld:'PIEAGR',pic:'ZZZ9'}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV20ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV27OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV28OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV21TFBarAgrNhdr',fld:'vTFBARAGRNHDR',pic:''},{av:'AV22TFBarAgrNhdr_Sel',fld:'vTFBARAGRNHDR_SEL',pic:''},{av:'AV50TFKgmAgr',fld:'vTFKGMAGR',pic:'ZZZZZ9.99'},{av:'AV51TFKgmAgr_To',fld:'vTFKGMAGR_TO',pic:'ZZZZZ9.99'},{av:'AV52TFMtrAgr',fld:'vTFMTRAGR',pic:'ZZZZZ9.99'},{av:'AV53TFMtrAgr_To',fld:'vTFMTRAGR_TO',pic:'ZZZZZ9.99'},{av:'AV54TFPieAgr',fld:'vTFPIEAGR',pic:'ZZZ9'},{av:'AV55TFPieAgr_To',fld:'vTFPIEAGR_TO',pic:'ZZZ9'},{av:'AV36TFBarAgrSer',fld:'vTFBARAGRSER',pic:''},{av:'AV37TFBarAgrSer_Sel',fld:'vTFBARAGRSER_SEL',pic:''},{av:'AV38TFBarAgrDsc',fld:'vTFBARAGRDSC',pic:''},{av:'AV39TFBarAgrDsc_Sel',fld:'vTFBARAGRDSC_SEL',pic:''},{av:'AV40TFCliCodAgr',fld:'vTFCLICODAGR',pic:'ZZZZZ9'},{av:'AV41TFCliCodAgr_To',fld:'vTFCLICODAGR_TO',pic:'ZZZZZ9'},{av:'AV42TFColNomAgr',fld:'vTFCOLNOMAGR',pic:''},{av:'AV43TFColNomAgr_Sel',fld:'vTFCOLNOMAGR_SEL',pic:''},{av:'AV44TFColNumAgr',fld:'vTFCOLNUMAGR',pic:'ZZZZZ9'},{av:'AV45TFColNumAgr_To',fld:'vTFCOLNUMAGR_TO',pic:'ZZZZZ9'},{av:'AV46TFColNoCAgr',fld:'vTFCOLNOCAGR',pic:''},{av:'AV47TFColNoCAgr_Sel',fld:'vTFCOLNOCAGR_SEL',pic:''},{av:'AV48TFColNuCAgr',fld:'vTFCOLNUCAGR',pic:'ZZZZZ9'},{av:'AV49TFColNuCAgr_To',fld:'vTFCOLNUCAGR_TO',pic:'ZZZZZ9'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV15ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtBarAgrNhdr_Visible',ctrl:'BARAGRNHDR',prop:'Visible'},{av:'edtKgmAgr_Visible',ctrl:'KGMAGR',prop:'Visible'},{av:'edtMtrAgr_Visible',ctrl:'MTRAGR',prop:'Visible'},{av:'edtPieAgr_Visible',ctrl:'PIEAGR',prop:'Visible'},{av:'edtavMaccodagr_Visible',ctrl:'vMACCODAGR',prop:'Visible'},{av:'edtBarAgrSer_Visible',ctrl:'BARAGRSER',prop:'Visible'},{av:'edtBarAgrDsc_Visible',ctrl:'BARAGRDSC',prop:'Visible'},{av:'edtCliCodAgr_Visible',ctrl:'CLICODAGR',prop:'Visible'},{av:'edtColNomAgr_Visible',ctrl:'COLNOMAGR',prop:'Visible'},{av:'edtColNumAgr_Visible',ctrl:'COLNUMAGR',prop:'Visible'},{av:'edtColNoCAgr_Visible',ctrl:'COLNOCAGR',prop:'Visible'},{av:'edtColNuCAgr_Visible',ctrl:'COLNUCAGR',prop:'Visible'},{av:'AV25GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV26GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV18ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV56TotKgmAgr',fld:'vTOTKGMAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV58TotMtrAgr',fld:'vTOTMTRAGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV60TotPieAgr',fld:'vTOTPIEAGR',pic:'ZZZ9',hsh:true},{av:'AV57TotValueKgmAgr',fld:'vTOTVALUEKGMAGR',pic:''},{av:'AV59TotValueMtrAgr',fld:'vTOTVALUEMTRAGR',pic:''},{av:'AV61TotValuePieAgr',fld:'vTOTVALUEPIEAGR',pic:''}]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARAGRCOD","{handler:'valid_Baragrcod',iparms:[]");
      setEventMetadata("VALID_BARAGRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARAGRREO","{handler:'valid_Baragrreo',iparms:[]");
      setEventMetadata("VALID_BARAGRREO",",oparms:[]}");
      setEventMetadata("VALID_BARAGRPAR","{handler:'valid_Baragrpar',iparms:[]");
      setEventMetadata("VALID_BARAGRPAR",",oparms:[]}");
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
      wcpOA396EmprCod = "" ;
      wcpOA130BarCodPar = "" ;
      wcpOAV67CliNom = "" ;
      wcpOAV68PedidoCliente = "" ;
      wcpOAV62BarSer = "" ;
      wcpOAV63BarSerDsc = "" ;
      wcpOAV64BarColNom = "" ;
      wcpOAV74BarKgm = DecimalUtil.ZERO ;
      wcpOAV75BarMtr = DecimalUtil.ZERO ;
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
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      AV67CliNom = "" ;
      AV68PedidoCliente = "" ;
      AV62BarSer = "" ;
      AV63BarSerDsc = "" ;
      AV64BarColNom = "" ;
      AV74BarKgm = DecimalUtil.ZERO ;
      AV75BarMtr = DecimalUtil.ZERO ;
      AV12FilterFullText = "" ;
      AV15ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV21TFBarAgrNhdr = "" ;
      AV22TFBarAgrNhdr_Sel = "" ;
      AV50TFKgmAgr = DecimalUtil.ZERO ;
      AV51TFKgmAgr_To = DecimalUtil.ZERO ;
      AV52TFMtrAgr = DecimalUtil.ZERO ;
      AV53TFMtrAgr_To = DecimalUtil.ZERO ;
      AV36TFBarAgrSer = "" ;
      AV37TFBarAgrSer_Sel = "" ;
      AV38TFBarAgrDsc = "" ;
      AV39TFBarAgrDsc_Sel = "" ;
      AV42TFColNomAgr = "" ;
      AV43TFColNomAgr_Sel = "" ;
      AV46TFColNoCAgr = "" ;
      AV47TFColNoCAgr_Sel = "" ;
      AV82Pgmname = "" ;
      AV56TotKgmAgr = DecimalUtil.ZERO ;
      AV58TotMtrAgr = DecimalUtil.ZERO ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV18ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV23DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
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
      bttBtneditcolumns_Jsonclick = "" ;
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
      A13792BarAgrNhdr = "" ;
      A590KgmAgr = DecimalUtil.ZERO ;
      A869MtrAgr = DecimalUtil.ZERO ;
      A1245BarAgrSer = "" ;
      A1507BarAgrDsc = "" ;
      A1510ColNomAgr = "" ;
      A1509ColNoCAgr = "" ;
      A122BarAgrPar = "" ;
      scmdbuf = "" ;
      lV83Consultadeproduccion_agrupadasds_1_filterfulltext = "" ;
      lV84Consultadeproduccion_agrupadasds_2_tfbaragrnhdr = "" ;
      lV92Consultadeproduccion_agrupadasds_10_tfbaragrser = "" ;
      lV94Consultadeproduccion_agrupadasds_12_tfbaragrdsc = "" ;
      lV98Consultadeproduccion_agrupadasds_16_tfcolnomagr = "" ;
      lV102Consultadeproduccion_agrupadasds_20_tfcolnocagr = "" ;
      AV83Consultadeproduccion_agrupadasds_1_filterfulltext = "" ;
      AV85Consultadeproduccion_agrupadasds_3_tfbaragrnhdr_sel = "" ;
      AV84Consultadeproduccion_agrupadasds_2_tfbaragrnhdr = "" ;
      AV86Consultadeproduccion_agrupadasds_4_tfkgmagr = DecimalUtil.ZERO ;
      AV87Consultadeproduccion_agrupadasds_5_tfkgmagr_to = DecimalUtil.ZERO ;
      AV88Consultadeproduccion_agrupadasds_6_tfmtragr = DecimalUtil.ZERO ;
      AV89Consultadeproduccion_agrupadasds_7_tfmtragr_to = DecimalUtil.ZERO ;
      AV93Consultadeproduccion_agrupadasds_11_tfbaragrser_sel = "" ;
      AV92Consultadeproduccion_agrupadasds_10_tfbaragrser = "" ;
      AV95Consultadeproduccion_agrupadasds_13_tfbaragrdsc_sel = "" ;
      AV94Consultadeproduccion_agrupadasds_12_tfbaragrdsc = "" ;
      AV99Consultadeproduccion_agrupadasds_17_tfcolnomagr_sel = "" ;
      AV98Consultadeproduccion_agrupadasds_16_tfcolnomagr = "" ;
      AV103Consultadeproduccion_agrupadasds_21_tfcolnocagr_sel = "" ;
      AV102Consultadeproduccion_agrupadasds_20_tfcolnocagr = "" ;
      H01972_A396EmprCod = new String[] {""} ;
      H01972_A129BarCod = new int[1] ;
      H01972_A132BarCodReo = new byte[1] ;
      H01972_A130BarCodPar = new String[] {""} ;
      H01972_A1511ColNuCAgr = new int[1] ;
      H01972_A1509ColNoCAgr = new String[] {""} ;
      H01972_A1512ColNumAgr = new int[1] ;
      H01972_A1510ColNomAgr = new String[] {""} ;
      H01972_A1508CliCodAgr = new int[1] ;
      H01972_A1507BarAgrDsc = new String[] {""} ;
      H01972_A1245BarAgrSer = new String[] {""} ;
      H01972_A671PieAgr = new short[1] ;
      H01972_A869MtrAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01972_A590KgmAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01972_A122BarAgrPar = new String[] {""} ;
      H01972_A124BarAgrReo = new byte[1] ;
      H01972_A119BarAgrCod = new int[1] ;
      H01973_AGRID_nRecordCount = new long[1] ;
      AV57TotValueKgmAgr = "" ;
      AV59TotValueMtrAgr = "" ;
      AV61TotValuePieAgr = "" ;
      hsh = "" ;
      AV76Station = "" ;
      AV77EmprCod = "" ;
      AV78EmprNom = "" ;
      AV79UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV17Session = httpContext.getWebSession();
      AV13ColumnsSelectorXML = "" ;
      GXv_int9 = new int[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV19ManageFiltersXml = "" ;
      AV14UserCustomValue = "" ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector11 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13 = new GXBaseCollection[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char18 = "" ;
      GXv_char19 = new String[1] ;
      GXt_char16 = "" ;
      GXv_char17 = new String[1] ;
      GXt_char15 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char14 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState20 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      H01974_A396EmprCod = new String[] {""} ;
      H01974_A129BarCod = new int[1] ;
      H01974_A132BarCodReo = new byte[1] ;
      H01974_A130BarCodPar = new String[] {""} ;
      H01974_A1511ColNuCAgr = new int[1] ;
      H01974_A1509ColNoCAgr = new String[] {""} ;
      H01974_A1512ColNumAgr = new int[1] ;
      H01974_A1510ColNomAgr = new String[] {""} ;
      H01974_A1508CliCodAgr = new int[1] ;
      H01974_A1507BarAgrDsc = new String[] {""} ;
      H01974_A1245BarAgrSer = new String[] {""} ;
      H01974_A671PieAgr = new short[1] ;
      H01974_A869MtrAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01974_A590KgmAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01974_A122BarAgrPar = new String[] {""} ;
      H01974_A124BarAgrReo = new byte[1] ;
      H01974_A119BarAgrCod = new int[1] ;
      H01975_A396EmprCod = new String[] {""} ;
      H01975_A129BarCod = new int[1] ;
      H01975_A132BarCodReo = new byte[1] ;
      H01975_A130BarCodPar = new String[] {""} ;
      H01975_A1511ColNuCAgr = new int[1] ;
      H01975_A1509ColNoCAgr = new String[] {""} ;
      H01975_A1512ColNumAgr = new int[1] ;
      H01975_A1510ColNomAgr = new String[] {""} ;
      H01975_A1508CliCodAgr = new int[1] ;
      H01975_A1507BarAgrDsc = new String[] {""} ;
      H01975_A1245BarAgrSer = new String[] {""} ;
      H01975_A671PieAgr = new short[1] ;
      H01975_A869MtrAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01975_A590KgmAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01975_A122BarAgrPar = new String[] {""} ;
      H01975_A124BarAgrReo = new byte[1] ;
      H01975_A119BarAgrCod = new int[1] ;
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlA396EmprCod = "" ;
      sCtrlA129BarCod = "" ;
      sCtrlA132BarCodReo = "" ;
      sCtrlA130BarCodPar = "" ;
      sCtrlAV66CliCod = "" ;
      sCtrlAV67CliNom = "" ;
      sCtrlAV68PedidoCliente = "" ;
      sCtrlAV62BarSer = "" ;
      sCtrlAV63BarSerDsc = "" ;
      sCtrlAV64BarColNom = "" ;
      sCtrlAV65BarColNum = "" ;
      sCtrlAV73MacCod = "" ;
      sCtrlAV74BarKgm = "" ;
      sCtrlAV75BarMtr = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.consultadeproduccion_agrupadas__default(),
         new Object[] {
             new Object[] {
            H01972_A396EmprCod, H01972_A129BarCod, H01972_A132BarCodReo, H01972_A130BarCodPar, H01972_A1511ColNuCAgr, H01972_A1509ColNoCAgr, H01972_A1512ColNumAgr, H01972_A1510ColNomAgr, H01972_A1508CliCodAgr, H01972_A1507BarAgrDsc,
            H01972_A1245BarAgrSer, H01972_A671PieAgr, H01972_A869MtrAgr, H01972_A590KgmAgr, H01972_A122BarAgrPar, H01972_A124BarAgrReo, H01972_A119BarAgrCod
            }
            , new Object[] {
            H01973_AGRID_nRecordCount
            }
            , new Object[] {
            H01974_A396EmprCod, H01974_A129BarCod, H01974_A132BarCodReo, H01974_A130BarCodPar, H01974_A1511ColNuCAgr, H01974_A1509ColNoCAgr, H01974_A1512ColNumAgr, H01974_A1510ColNomAgr, H01974_A1508CliCodAgr, H01974_A1507BarAgrDsc,
            H01974_A1245BarAgrSer, H01974_A671PieAgr, H01974_A869MtrAgr, H01974_A590KgmAgr, H01974_A122BarAgrPar, H01974_A124BarAgrReo, H01974_A119BarAgrCod
            }
            , new Object[] {
            H01975_A396EmprCod, H01975_A129BarCod, H01975_A132BarCodReo, H01975_A130BarCodPar, H01975_A1511ColNuCAgr, H01975_A1509ColNoCAgr, H01975_A1512ColNumAgr, H01975_A1510ColNomAgr, H01975_A1508CliCodAgr, H01975_A1507BarAgrDsc,
            H01975_A1245BarAgrSer, H01975_A671PieAgr, H01975_A869MtrAgr, H01975_A590KgmAgr, H01975_A122BarAgrPar, H01975_A124BarAgrReo, H01975_A119BarAgrCod
            }
         }
      );
      AV82Pgmname = "ConsultadeProduccion_Agrupadas" ;
      /* GeneXus formulas. */
      AV82Pgmname = "ConsultadeProduccion_Agrupadas" ;
      Gx_err = (short)(0) ;
      edtavClicod_Enabled = 0 ;
      edtavClinom_Enabled = 0 ;
      edtavPedidocliente_Enabled = 0 ;
      edtavMaccod_Enabled = 0 ;
      edtavBarkgm_Enabled = 0 ;
      edtavBarmtr_Enabled = 0 ;
      edtavBarser_Enabled = 0 ;
      edtavBarserdsc_Enabled = 0 ;
      edtavBarcolnom_Enabled = 0 ;
      edtavBarcolnum_Enabled = 0 ;
      edtavMaccodagr_Enabled = 0 ;
      edtavTotvaluekgmagr_Enabled = 0 ;
      edtavTotvaluemtragr_Enabled = 0 ;
      edtavTotvaluepieagr_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOA132BarCodReo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte A132BarCodReo ;
   private byte AV20ManageFiltersExecutionStep ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A124BarAgrReo ;
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
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV54TFPieAgr ;
   private short AV55TFPieAgr_To ;
   private short AV27OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short A671PieAgr ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV90Consultadeproduccion_agrupadasds_8_tfpieagr ;
   private short AV91Consultadeproduccion_agrupadasds_9_tfpieagr_to ;
   private int wcpOA129BarCod ;
   private int wcpOAV66CliCod ;
   private int wcpOAV65BarColNum ;
   private int wcpOAV73MacCod ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_102 ;
   private int A129BarCod ;
   private int AV66CliCod ;
   private int AV65BarColNum ;
   private int AV73MacCod ;
   private int nGXsfl_102_idx=1 ;
   private int AV40TFCliCodAgr ;
   private int AV41TFCliCodAgr_To ;
   private int AV44TFColNumAgr ;
   private int AV45TFColNumAgr_To ;
   private int AV48TFColNuCAgr ;
   private int AV49TFColNuCAgr_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtavClicod_Enabled ;
   private int edtavClinom_Enabled ;
   private int edtavPedidocliente_Enabled ;
   private int edtavMaccod_Enabled ;
   private int edtavBarkgm_Enabled ;
   private int edtavBarmtr_Enabled ;
   private int edtavBarser_Enabled ;
   private int edtavBarserdsc_Enabled ;
   private int edtavBarcolnom_Enabled ;
   private int edtavBarcolnum_Enabled ;
   private int edtavPgmname_Enabled ;
   private int AV72MacCodAgr ;
   private int A1508CliCodAgr ;
   private int A1512ColNumAgr ;
   private int A1511ColNuCAgr ;
   private int A119BarAgrCod ;
   private int subGrid_Islastpage ;
   private int edtavMaccodagr_Enabled ;
   private int edtavTotvaluekgmagr_Enabled ;
   private int edtavTotvaluemtragr_Enabled ;
   private int edtavTotvaluepieagr_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV96Consultadeproduccion_agrupadasds_14_tfclicodagr ;
   private int AV97Consultadeproduccion_agrupadasds_15_tfclicodagr_to ;
   private int AV100Consultadeproduccion_agrupadasds_18_tfcolnumagr ;
   private int AV101Consultadeproduccion_agrupadasds_19_tfcolnumagr_to ;
   private int AV104Consultadeproduccion_agrupadasds_22_tfcolnucagr ;
   private int AV105Consultadeproduccion_agrupadasds_23_tfcolnucagr_to ;
   private int edtBarAgrNhdr_Visible ;
   private int edtKgmAgr_Visible ;
   private int edtMtrAgr_Visible ;
   private int edtPieAgr_Visible ;
   private int edtavMaccodagr_Visible ;
   private int edtBarAgrSer_Visible ;
   private int edtBarAgrDsc_Visible ;
   private int edtCliCodAgr_Visible ;
   private int edtColNomAgr_Visible ;
   private int edtColNumAgr_Visible ;
   private int edtColNoCAgr_Visible ;
   private int edtColNuCAgr_Visible ;
   private int AV24PageToGo ;
   private int GXt_int8 ;
   private int GXv_int9[] ;
   private int AV106GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV60TotPieAgr ;
   private long AV25GridCurrentPage ;
   private long AV26GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal wcpOAV74BarKgm ;
   private java.math.BigDecimal wcpOAV75BarMtr ;
   private java.math.BigDecimal AV74BarKgm ;
   private java.math.BigDecimal AV75BarMtr ;
   private java.math.BigDecimal AV50TFKgmAgr ;
   private java.math.BigDecimal AV51TFKgmAgr_To ;
   private java.math.BigDecimal AV52TFMtrAgr ;
   private java.math.BigDecimal AV53TFMtrAgr_To ;
   private java.math.BigDecimal AV56TotKgmAgr ;
   private java.math.BigDecimal AV58TotMtrAgr ;
   private java.math.BigDecimal A590KgmAgr ;
   private java.math.BigDecimal A869MtrAgr ;
   private java.math.BigDecimal AV86Consultadeproduccion_agrupadasds_4_tfkgmagr ;
   private java.math.BigDecimal AV87Consultadeproduccion_agrupadasds_5_tfkgmagr_to ;
   private java.math.BigDecimal AV88Consultadeproduccion_agrupadasds_6_tfmtragr ;
   private java.math.BigDecimal AV89Consultadeproduccion_agrupadasds_7_tfmtragr_to ;
   private String wcpOA396EmprCod ;
   private String wcpOA130BarCodPar ;
   private String wcpOAV67CliNom ;
   private String wcpOAV68PedidoCliente ;
   private String wcpOAV62BarSer ;
   private String wcpOAV63BarSerDsc ;
   private String wcpOAV64BarColNom ;
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
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV67CliNom ;
   private String AV68PedidoCliente ;
   private String AV62BarSer ;
   private String AV63BarSerDsc ;
   private String AV64BarColNom ;
   private String sGXsfl_102_idx="0001" ;
   private String AV21TFBarAgrNhdr ;
   private String AV22TFBarAgrNhdr_Sel ;
   private String AV36TFBarAgrSer ;
   private String AV37TFBarAgrSer_Sel ;
   private String AV38TFBarAgrDsc ;
   private String AV39TFBarAgrDsc_Sel ;
   private String AV42TFColNomAgr ;
   private String AV43TFColNomAgr_Sel ;
   private String AV46TFColNoCAgr ;
   private String AV47TFColNoCAgr_Sel ;
   private String AV82Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
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
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String edtavClicod_Internalname ;
   private String edtavClicod_Jsonclick ;
   private String edtavClinom_Internalname ;
   private String edtavClinom_Jsonclick ;
   private String edtavPedidocliente_Internalname ;
   private String edtavPedidocliente_Jsonclick ;
   private String edtavMaccod_Internalname ;
   private String edtavMaccod_Jsonclick ;
   private String edtavBarkgm_Internalname ;
   private String edtavBarkgm_Jsonclick ;
   private String edtavBarmtr_Internalname ;
   private String edtavBarmtr_Jsonclick ;
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
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
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
   private String edtavFilterfulltext_Internalname ;
   private String A13792BarAgrNhdr ;
   private String edtBarAgrNhdr_Internalname ;
   private String edtKgmAgr_Internalname ;
   private String edtMtrAgr_Internalname ;
   private String edtPieAgr_Internalname ;
   private String edtavMaccodagr_Internalname ;
   private String A1245BarAgrSer ;
   private String edtBarAgrSer_Internalname ;
   private String A1507BarAgrDsc ;
   private String edtBarAgrDsc_Internalname ;
   private String edtCliCodAgr_Internalname ;
   private String A1510ColNomAgr ;
   private String edtColNomAgr_Internalname ;
   private String edtColNumAgr_Internalname ;
   private String A1509ColNoCAgr ;
   private String edtColNoCAgr_Internalname ;
   private String edtColNuCAgr_Internalname ;
   private String edtEmprCod_Internalname ;
   private String edtBarAgrCod_Internalname ;
   private String edtBarAgrReo_Internalname ;
   private String A122BarAgrPar ;
   private String edtBarAgrPar_Internalname ;
   private String edtavTotvaluekgmagr_Internalname ;
   private String edtavTotvaluemtragr_Internalname ;
   private String edtavTotvaluepieagr_Internalname ;
   private String scmdbuf ;
   private String lV84Consultadeproduccion_agrupadasds_2_tfbaragrnhdr ;
   private String lV92Consultadeproduccion_agrupadasds_10_tfbaragrser ;
   private String lV94Consultadeproduccion_agrupadasds_12_tfbaragrdsc ;
   private String lV98Consultadeproduccion_agrupadasds_16_tfcolnomagr ;
   private String lV102Consultadeproduccion_agrupadasds_20_tfcolnocagr ;
   private String AV85Consultadeproduccion_agrupadasds_3_tfbaragrnhdr_sel ;
   private String AV84Consultadeproduccion_agrupadasds_2_tfbaragrnhdr ;
   private String AV93Consultadeproduccion_agrupadasds_11_tfbaragrser_sel ;
   private String AV92Consultadeproduccion_agrupadasds_10_tfbaragrser ;
   private String AV95Consultadeproduccion_agrupadasds_13_tfbaragrdsc_sel ;
   private String AV94Consultadeproduccion_agrupadasds_12_tfbaragrdsc ;
   private String AV99Consultadeproduccion_agrupadasds_17_tfcolnomagr_sel ;
   private String AV98Consultadeproduccion_agrupadasds_16_tfcolnomagr ;
   private String AV103Consultadeproduccion_agrupadasds_21_tfcolnocagr_sel ;
   private String AV102Consultadeproduccion_agrupadasds_20_tfcolnocagr ;
   private String hsh ;
   private String AV76Station ;
   private String AV77EmprCod ;
   private String AV78EmprNom ;
   private String AV79UsurCod ;
   private String GXt_char18 ;
   private String GXv_char19[] ;
   private String GXt_char16 ;
   private String GXv_char17[] ;
   private String GXt_char15 ;
   private String GXv_char4[] ;
   private String GXt_char14 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvaluekgmagr_Jsonclick ;
   private String edtavTotvaluemtragr_Jsonclick ;
   private String edtavTotvaluepieagr_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlA396EmprCod ;
   private String sCtrlA129BarCod ;
   private String sCtrlA132BarCodReo ;
   private String sCtrlA130BarCodPar ;
   private String sCtrlAV66CliCod ;
   private String sCtrlAV67CliNom ;
   private String sCtrlAV68PedidoCliente ;
   private String sCtrlAV62BarSer ;
   private String sCtrlAV63BarSerDsc ;
   private String sCtrlAV64BarColNom ;
   private String sCtrlAV65BarColNum ;
   private String sCtrlAV73MacCod ;
   private String sCtrlAV74BarKgm ;
   private String sCtrlAV75BarMtr ;
   private String sGXsfl_102_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtBarAgrNhdr_Jsonclick ;
   private String edtKgmAgr_Jsonclick ;
   private String edtMtrAgr_Jsonclick ;
   private String edtPieAgr_Jsonclick ;
   private String edtavMaccodagr_Jsonclick ;
   private String edtBarAgrSer_Jsonclick ;
   private String edtBarAgrDsc_Jsonclick ;
   private String edtCliCodAgr_Jsonclick ;
   private String edtColNomAgr_Jsonclick ;
   private String edtColNumAgr_Jsonclick ;
   private String edtColNoCAgr_Jsonclick ;
   private String edtColNuCAgr_Jsonclick ;
   private String edtEmprCod_Jsonclick ;
   private String edtBarAgrCod_Jsonclick ;
   private String edtBarAgrReo_Jsonclick ;
   private String edtBarAgrPar_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV28OrderedDsc ;
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
   private boolean bGXsfl_102_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV13ColumnsSelectorXML ;
   private String AV19ManageFiltersXml ;
   private String AV14UserCustomValue ;
   private String AV12FilterFullText ;
   private String lV83Consultadeproduccion_agrupadasds_1_filterfulltext ;
   private String AV83Consultadeproduccion_agrupadasds_1_filterfulltext ;
   private String AV57TotValueKgmAgr ;
   private String AV59TotValueMtrAgr ;
   private String AV61TotValuePieAgr ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV17Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] H01972_A396EmprCod ;
   private int[] H01972_A129BarCod ;
   private byte[] H01972_A132BarCodReo ;
   private String[] H01972_A130BarCodPar ;
   private int[] H01972_A1511ColNuCAgr ;
   private String[] H01972_A1509ColNoCAgr ;
   private int[] H01972_A1512ColNumAgr ;
   private String[] H01972_A1510ColNomAgr ;
   private int[] H01972_A1508CliCodAgr ;
   private String[] H01972_A1507BarAgrDsc ;
   private String[] H01972_A1245BarAgrSer ;
   private short[] H01972_A671PieAgr ;
   private java.math.BigDecimal[] H01972_A869MtrAgr ;
   private java.math.BigDecimal[] H01972_A590KgmAgr ;
   private String[] H01972_A122BarAgrPar ;
   private byte[] H01972_A124BarAgrReo ;
   private int[] H01972_A119BarAgrCod ;
   private long[] H01973_AGRID_nRecordCount ;
   private String[] H01974_A396EmprCod ;
   private int[] H01974_A129BarCod ;
   private byte[] H01974_A132BarCodReo ;
   private String[] H01974_A130BarCodPar ;
   private int[] H01974_A1511ColNuCAgr ;
   private String[] H01974_A1509ColNoCAgr ;
   private int[] H01974_A1512ColNumAgr ;
   private String[] H01974_A1510ColNomAgr ;
   private int[] H01974_A1508CliCodAgr ;
   private String[] H01974_A1507BarAgrDsc ;
   private String[] H01974_A1245BarAgrSer ;
   private short[] H01974_A671PieAgr ;
   private java.math.BigDecimal[] H01974_A869MtrAgr ;
   private java.math.BigDecimal[] H01974_A590KgmAgr ;
   private String[] H01974_A122BarAgrPar ;
   private byte[] H01974_A124BarAgrReo ;
   private int[] H01974_A119BarAgrCod ;
   private String[] H01975_A396EmprCod ;
   private int[] H01975_A129BarCod ;
   private byte[] H01975_A132BarCodReo ;
   private String[] H01975_A130BarCodPar ;
   private int[] H01975_A1511ColNuCAgr ;
   private String[] H01975_A1509ColNoCAgr ;
   private int[] H01975_A1512ColNumAgr ;
   private String[] H01975_A1510ColNomAgr ;
   private int[] H01975_A1508CliCodAgr ;
   private String[] H01975_A1507BarAgrDsc ;
   private String[] H01975_A1245BarAgrSer ;
   private short[] H01975_A671PieAgr ;
   private java.math.BigDecimal[] H01975_A869MtrAgr ;
   private java.math.BigDecimal[] H01975_A590KgmAgr ;
   private String[] H01975_A122BarAgrPar ;
   private byte[] H01975_A124BarAgrReo ;
   private int[] H01975_A119BarAgrCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV18ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState20[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector10[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector11[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV23DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class consultadeproduccion_agrupadas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01972( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV83Consultadeproduccion_agrupadasds_1_filterfulltext ,
                                          String AV85Consultadeproduccion_agrupadasds_3_tfbaragrnhdr_sel ,
                                          String AV84Consultadeproduccion_agrupadasds_2_tfbaragrnhdr ,
                                          java.math.BigDecimal AV86Consultadeproduccion_agrupadasds_4_tfkgmagr ,
                                          java.math.BigDecimal AV87Consultadeproduccion_agrupadasds_5_tfkgmagr_to ,
                                          java.math.BigDecimal AV88Consultadeproduccion_agrupadasds_6_tfmtragr ,
                                          java.math.BigDecimal AV89Consultadeproduccion_agrupadasds_7_tfmtragr_to ,
                                          short AV90Consultadeproduccion_agrupadasds_8_tfpieagr ,
                                          short AV91Consultadeproduccion_agrupadasds_9_tfpieagr_to ,
                                          String AV93Consultadeproduccion_agrupadasds_11_tfbaragrser_sel ,
                                          String AV92Consultadeproduccion_agrupadasds_10_tfbaragrser ,
                                          String AV95Consultadeproduccion_agrupadasds_13_tfbaragrdsc_sel ,
                                          String AV94Consultadeproduccion_agrupadasds_12_tfbaragrdsc ,
                                          int AV96Consultadeproduccion_agrupadasds_14_tfclicodagr ,
                                          int AV97Consultadeproduccion_agrupadasds_15_tfclicodagr_to ,
                                          String AV99Consultadeproduccion_agrupadasds_17_tfcolnomagr_sel ,
                                          String AV98Consultadeproduccion_agrupadasds_16_tfcolnomagr ,
                                          int AV100Consultadeproduccion_agrupadasds_18_tfcolnumagr ,
                                          int AV101Consultadeproduccion_agrupadasds_19_tfcolnumagr_to ,
                                          String AV103Consultadeproduccion_agrupadasds_21_tfcolnocagr_sel ,
                                          String AV102Consultadeproduccion_agrupadasds_20_tfcolnocagr ,
                                          int AV104Consultadeproduccion_agrupadasds_22_tfcolnucagr ,
                                          int AV105Consultadeproduccion_agrupadasds_23_tfcolnucagr_to ,
                                          int A119BarAgrCod ,
                                          byte A124BarAgrReo ,
                                          String A122BarAgrPar ,
                                          java.math.BigDecimal A590KgmAgr ,
                                          java.math.BigDecimal A869MtrAgr ,
                                          short A671PieAgr ,
                                          String A1245BarAgrSer ,
                                          String A1507BarAgrDsc ,
                                          int A1508CliCodAgr ,
                                          String A1510ColNomAgr ,
                                          int A1512ColNumAgr ,
                                          String A1509ColNoCAgr ,
                                          int A1511ColNuCAgr ,
                                          short AV27OrderedBy ,
                                          boolean AV28OrderedDsc ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int21 = new byte[42];
      Object[] GXv_Object22 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " EmprCod, BarCod, BarCodReo, BarCodPar, ColNuCAgr, ColNoCAgr, ColNumAgr, ColNomAgr, CliCodAgr, BarAgrDsc, BarAgrSer, PieAgr, MtrAgr, KgmAgr, BarAgrPar, BarAgrReo," ;
      sSelectString += " BarAgrCod" ;
      sFromString = " FROM TXPBARAGR" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)");
      if ( ! (GXutil.strcmp("", AV83Consultadeproduccion_agrupadasds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(KgmAgr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MtrAgr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(PieAgr,'9990'), 2) like '%' || ?) or ( UPPER(BarAgrSer) like '%' || UPPER(?)) or ( UPPER(BarAgrDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(CliCodAgr,'999990'), 2) like '%' || ?) or ( UPPER(ColNomAgr) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(ColNumAgr,'999990'), 2) like '%' || ?) or ( UPPER(ColNoCAgr) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(ColNuCAgr,'999990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int21[4] = (byte)(1) ;
         GXv_int21[5] = (byte)(1) ;
         GXv_int21[6] = (byte)(1) ;
         GXv_int21[7] = (byte)(1) ;
         GXv_int21[8] = (byte)(1) ;
         GXv_int21[9] = (byte)(1) ;
         GXv_int21[10] = (byte)(1) ;
         GXv_int21[11] = (byte)(1) ;
         GXv_int21[12] = (byte)(1) ;
         GXv_int21[13] = (byte)(1) ;
         GXv_int21[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Consultadeproduccion_agrupadasds_3_tfbaragrnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV84Consultadeproduccion_agrupadasds_2_tfbaragrnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Consultadeproduccion_agrupadasds_3_tfbaragrnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar = ?)");
      }
      else
      {
         GXv_int21[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Consultadeproduccion_agrupadasds_4_tfkgmagr)==0) )
      {
         addWhere(sWhereString, "(KgmAgr >= ?)");
      }
      else
      {
         GXv_int21[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Consultadeproduccion_agrupadasds_5_tfkgmagr_to)==0) )
      {
         addWhere(sWhereString, "(KgmAgr <= ?)");
      }
      else
      {
         GXv_int21[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Consultadeproduccion_agrupadasds_6_tfmtragr)==0) )
      {
         addWhere(sWhereString, "(MtrAgr >= ?)");
      }
      else
      {
         GXv_int21[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Consultadeproduccion_agrupadasds_7_tfmtragr_to)==0) )
      {
         addWhere(sWhereString, "(MtrAgr <= ?)");
      }
      else
      {
         GXv_int21[20] = (byte)(1) ;
      }
      if ( ! (0==AV90Consultadeproduccion_agrupadasds_8_tfpieagr) )
      {
         addWhere(sWhereString, "(PieAgr >= ?)");
      }
      else
      {
         GXv_int21[21] = (byte)(1) ;
      }
      if ( ! (0==AV91Consultadeproduccion_agrupadasds_9_tfpieagr_to) )
      {
         addWhere(sWhereString, "(PieAgr <= ?)");
      }
      else
      {
         GXv_int21[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Consultadeproduccion_agrupadasds_11_tfbaragrser_sel)==0) && ( ! (GXutil.strcmp("", AV92Consultadeproduccion_agrupadasds_10_tfbaragrser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarAgrSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Consultadeproduccion_agrupadasds_11_tfbaragrser_sel)==0) )
      {
         addWhere(sWhereString, "(BarAgrSer = ?)");
      }
      else
      {
         GXv_int21[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Consultadeproduccion_agrupadasds_13_tfbaragrdsc_sel)==0) && ( ! (GXutil.strcmp("", AV94Consultadeproduccion_agrupadasds_12_tfbaragrdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarAgrDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Consultadeproduccion_agrupadasds_13_tfbaragrdsc_sel)==0) )
      {
         addWhere(sWhereString, "(BarAgrDsc = ?)");
      }
      else
      {
         GXv_int21[26] = (byte)(1) ;
      }
      if ( ! (0==AV96Consultadeproduccion_agrupadasds_14_tfclicodagr) )
      {
         addWhere(sWhereString, "(CliCodAgr >= ?)");
      }
      else
      {
         GXv_int21[27] = (byte)(1) ;
      }
      if ( ! (0==AV97Consultadeproduccion_agrupadasds_15_tfclicodagr_to) )
      {
         addWhere(sWhereString, "(CliCodAgr <= ?)");
      }
      else
      {
         GXv_int21[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Consultadeproduccion_agrupadasds_17_tfcolnomagr_sel)==0) && ( ! (GXutil.strcmp("", AV98Consultadeproduccion_agrupadasds_16_tfcolnomagr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ColNomAgr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Consultadeproduccion_agrupadasds_17_tfcolnomagr_sel)==0) )
      {
         addWhere(sWhereString, "(ColNomAgr = ?)");
      }
      else
      {
         GXv_int21[30] = (byte)(1) ;
      }
      if ( ! (0==AV100Consultadeproduccion_agrupadasds_18_tfcolnumagr) )
      {
         addWhere(sWhereString, "(ColNumAgr >= ?)");
      }
      else
      {
         GXv_int21[31] = (byte)(1) ;
      }
      if ( ! (0==AV101Consultadeproduccion_agrupadasds_19_tfcolnumagr_to) )
      {
         addWhere(sWhereString, "(ColNumAgr <= ?)");
      }
      else
      {
         GXv_int21[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Consultadeproduccion_agrupadasds_21_tfcolnocagr_sel)==0) && ( ! (GXutil.strcmp("", AV102Consultadeproduccion_agrupadasds_20_tfcolnocagr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ColNoCAgr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Consultadeproduccion_agrupadasds_21_tfcolnocagr_sel)==0) )
      {
         addWhere(sWhereString, "(ColNoCAgr = ?)");
      }
      else
      {
         GXv_int21[34] = (byte)(1) ;
      }
      if ( ! (0==AV104Consultadeproduccion_agrupadasds_22_tfcolnucagr) )
      {
         addWhere(sWhereString, "(ColNuCAgr >= ?)");
      }
      else
      {
         GXv_int21[35] = (byte)(1) ;
      }
      if ( ! (0==AV105Consultadeproduccion_agrupadasds_23_tfcolnucagr_to) )
      {
         addWhere(sWhereString, "(ColNuCAgr <= ?)");
      }
      else
      {
         GXv_int21[36] = (byte)(1) ;
      }
      if ( ( AV27OrderedBy == 1 ) && ! AV28OrderedDsc )
      {
         sOrderString += " ORDER BY KgmAgr" ;
      }
      else if ( ( AV27OrderedBy == 1 ) && ( AV28OrderedDsc ) )
      {
         sOrderString += " ORDER BY KgmAgr DESC" ;
      }
      else if ( ( AV27OrderedBy == 2 ) && ! AV28OrderedDsc )
      {
         sOrderString += " ORDER BY MtrAgr" ;
      }
      else if ( ( AV27OrderedBy == 2 ) && ( AV28OrderedDsc ) )
      {
         sOrderString += " ORDER BY MtrAgr DESC" ;
      }
      else if ( ( AV27OrderedBy == 3 ) && ! AV28OrderedDsc )
      {
         sOrderString += " ORDER BY PieAgr" ;
      }
      else if ( ( AV27OrderedBy == 3 ) && ( AV28OrderedDsc ) )
      {
         sOrderString += " ORDER BY PieAgr DESC" ;
      }
      else if ( ( AV27OrderedBy == 4 ) && ! AV28OrderedDsc )
      {
         sOrderString += " ORDER BY BarAgrSer" ;
      }
      else if ( ( AV27OrderedBy == 4 ) && ( AV28OrderedDsc ) )
      {
         sOrderString += " ORDER BY BarAgrSer DESC" ;
      }
      else if ( ( AV27OrderedBy == 5 ) && ! AV28OrderedDsc )
      {
         sOrderString += " ORDER BY BarAgrDsc" ;
      }
      else if ( ( AV27OrderedBy == 5 ) && ( AV28OrderedDsc ) )
      {
         sOrderString += " ORDER BY BarAgrDsc DESC" ;
      }
      else if ( ( AV27OrderedBy == 6 ) && ! AV28OrderedDsc )
      {
         sOrderString += " ORDER BY CliCodAgr" ;
      }
      else if ( ( AV27OrderedBy == 6 ) && ( AV28OrderedDsc ) )
      {
         sOrderString += " ORDER BY CliCodAgr DESC" ;
      }
      else if ( ( AV27OrderedBy == 7 ) && ! AV28OrderedDsc )
      {
         sOrderString += " ORDER BY ColNomAgr" ;
      }
      else if ( ( AV27OrderedBy == 7 ) && ( AV28OrderedDsc ) )
      {
         sOrderString += " ORDER BY ColNomAgr DESC" ;
      }
      else if ( ( AV27OrderedBy == 8 ) && ! AV28OrderedDsc )
      {
         sOrderString += " ORDER BY ColNumAgr" ;
      }
      else if ( ( AV27OrderedBy == 8 ) && ( AV28OrderedDsc ) )
      {
         sOrderString += " ORDER BY ColNumAgr DESC" ;
      }
      else if ( ( AV27OrderedBy == 9 ) && ! AV28OrderedDsc )
      {
         sOrderString += " ORDER BY ColNoCAgr" ;
      }
      else if ( ( AV27OrderedBy == 9 ) && ( AV28OrderedDsc ) )
      {
         sOrderString += " ORDER BY ColNoCAgr DESC" ;
      }
      else if ( ( AV27OrderedBy == 10 ) && ! AV28OrderedDsc )
      {
         sOrderString += " ORDER BY ColNuCAgr" ;
      }
      else if ( ( AV27OrderedBy == 10 ) && ( AV28OrderedDsc ) )
      {
         sOrderString += " ORDER BY ColNuCAgr DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object22[0] = scmdbuf ;
      GXv_Object22[1] = GXv_int21 ;
      return GXv_Object22 ;
   }

   protected Object[] conditional_H01973( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV83Consultadeproduccion_agrupadasds_1_filterfulltext ,
                                          String AV85Consultadeproduccion_agrupadasds_3_tfbaragrnhdr_sel ,
                                          String AV84Consultadeproduccion_agrupadasds_2_tfbaragrnhdr ,
                                          java.math.BigDecimal AV86Consultadeproduccion_agrupadasds_4_tfkgmagr ,
                                          java.math.BigDecimal AV87Consultadeproduccion_agrupadasds_5_tfkgmagr_to ,
                                          java.math.BigDecimal AV88Consultadeproduccion_agrupadasds_6_tfmtragr ,
                                          java.math.BigDecimal AV89Consultadeproduccion_agrupadasds_7_tfmtragr_to ,
                                          short AV90Consultadeproduccion_agrupadasds_8_tfpieagr ,
                                          short AV91Consultadeproduccion_agrupadasds_9_tfpieagr_to ,
                                          String AV93Consultadeproduccion_agrupadasds_11_tfbaragrser_sel ,
                                          String AV92Consultadeproduccion_agrupadasds_10_tfbaragrser ,
                                          String AV95Consultadeproduccion_agrupadasds_13_tfbaragrdsc_sel ,
                                          String AV94Consultadeproduccion_agrupadasds_12_tfbaragrdsc ,
                                          int AV96Consultadeproduccion_agrupadasds_14_tfclicodagr ,
                                          int AV97Consultadeproduccion_agrupadasds_15_tfclicodagr_to ,
                                          String AV99Consultadeproduccion_agrupadasds_17_tfcolnomagr_sel ,
                                          String AV98Consultadeproduccion_agrupadasds_16_tfcolnomagr ,
                                          int AV100Consultadeproduccion_agrupadasds_18_tfcolnumagr ,
                                          int AV101Consultadeproduccion_agrupadasds_19_tfcolnumagr_to ,
                                          String AV103Consultadeproduccion_agrupadasds_21_tfcolnocagr_sel ,
                                          String AV102Consultadeproduccion_agrupadasds_20_tfcolnocagr ,
                                          int AV104Consultadeproduccion_agrupadasds_22_tfcolnucagr ,
                                          int AV105Consultadeproduccion_agrupadasds_23_tfcolnucagr_to ,
                                          int A119BarAgrCod ,
                                          byte A124BarAgrReo ,
                                          String A122BarAgrPar ,
                                          java.math.BigDecimal A590KgmAgr ,
                                          java.math.BigDecimal A869MtrAgr ,
                                          short A671PieAgr ,
                                          String A1245BarAgrSer ,
                                          String A1507BarAgrDsc ,
                                          int A1508CliCodAgr ,
                                          String A1510ColNomAgr ,
                                          int A1512ColNumAgr ,
                                          String A1509ColNoCAgr ,
                                          int A1511ColNuCAgr ,
                                          short AV27OrderedBy ,
                                          boolean AV28OrderedDsc ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int23 = new byte[37];
      Object[] GXv_Object24 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM TXPBARAGR" ;
      addWhere(sWhereString, "(EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)");
      if ( ! (GXutil.strcmp("", AV83Consultadeproduccion_agrupadasds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(KgmAgr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MtrAgr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(PieAgr,'9990'), 2) like '%' || ?) or ( UPPER(BarAgrSer) like '%' || UPPER(?)) or ( UPPER(BarAgrDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(CliCodAgr,'999990'), 2) like '%' || ?) or ( UPPER(ColNomAgr) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(ColNumAgr,'999990'), 2) like '%' || ?) or ( UPPER(ColNoCAgr) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(ColNuCAgr,'999990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int23[4] = (byte)(1) ;
         GXv_int23[5] = (byte)(1) ;
         GXv_int23[6] = (byte)(1) ;
         GXv_int23[7] = (byte)(1) ;
         GXv_int23[8] = (byte)(1) ;
         GXv_int23[9] = (byte)(1) ;
         GXv_int23[10] = (byte)(1) ;
         GXv_int23[11] = (byte)(1) ;
         GXv_int23[12] = (byte)(1) ;
         GXv_int23[13] = (byte)(1) ;
         GXv_int23[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Consultadeproduccion_agrupadasds_3_tfbaragrnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV84Consultadeproduccion_agrupadasds_2_tfbaragrnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Consultadeproduccion_agrupadasds_3_tfbaragrnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar = ?)");
      }
      else
      {
         GXv_int23[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Consultadeproduccion_agrupadasds_4_tfkgmagr)==0) )
      {
         addWhere(sWhereString, "(KgmAgr >= ?)");
      }
      else
      {
         GXv_int23[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Consultadeproduccion_agrupadasds_5_tfkgmagr_to)==0) )
      {
         addWhere(sWhereString, "(KgmAgr <= ?)");
      }
      else
      {
         GXv_int23[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Consultadeproduccion_agrupadasds_6_tfmtragr)==0) )
      {
         addWhere(sWhereString, "(MtrAgr >= ?)");
      }
      else
      {
         GXv_int23[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Consultadeproduccion_agrupadasds_7_tfmtragr_to)==0) )
      {
         addWhere(sWhereString, "(MtrAgr <= ?)");
      }
      else
      {
         GXv_int23[20] = (byte)(1) ;
      }
      if ( ! (0==AV90Consultadeproduccion_agrupadasds_8_tfpieagr) )
      {
         addWhere(sWhereString, "(PieAgr >= ?)");
      }
      else
      {
         GXv_int23[21] = (byte)(1) ;
      }
      if ( ! (0==AV91Consultadeproduccion_agrupadasds_9_tfpieagr_to) )
      {
         addWhere(sWhereString, "(PieAgr <= ?)");
      }
      else
      {
         GXv_int23[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Consultadeproduccion_agrupadasds_11_tfbaragrser_sel)==0) && ( ! (GXutil.strcmp("", AV92Consultadeproduccion_agrupadasds_10_tfbaragrser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarAgrSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Consultadeproduccion_agrupadasds_11_tfbaragrser_sel)==0) )
      {
         addWhere(sWhereString, "(BarAgrSer = ?)");
      }
      else
      {
         GXv_int23[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Consultadeproduccion_agrupadasds_13_tfbaragrdsc_sel)==0) && ( ! (GXutil.strcmp("", AV94Consultadeproduccion_agrupadasds_12_tfbaragrdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarAgrDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Consultadeproduccion_agrupadasds_13_tfbaragrdsc_sel)==0) )
      {
         addWhere(sWhereString, "(BarAgrDsc = ?)");
      }
      else
      {
         GXv_int23[26] = (byte)(1) ;
      }
      if ( ! (0==AV96Consultadeproduccion_agrupadasds_14_tfclicodagr) )
      {
         addWhere(sWhereString, "(CliCodAgr >= ?)");
      }
      else
      {
         GXv_int23[27] = (byte)(1) ;
      }
      if ( ! (0==AV97Consultadeproduccion_agrupadasds_15_tfclicodagr_to) )
      {
         addWhere(sWhereString, "(CliCodAgr <= ?)");
      }
      else
      {
         GXv_int23[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Consultadeproduccion_agrupadasds_17_tfcolnomagr_sel)==0) && ( ! (GXutil.strcmp("", AV98Consultadeproduccion_agrupadasds_16_tfcolnomagr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ColNomAgr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Consultadeproduccion_agrupadasds_17_tfcolnomagr_sel)==0) )
      {
         addWhere(sWhereString, "(ColNomAgr = ?)");
      }
      else
      {
         GXv_int23[30] = (byte)(1) ;
      }
      if ( ! (0==AV100Consultadeproduccion_agrupadasds_18_tfcolnumagr) )
      {
         addWhere(sWhereString, "(ColNumAgr >= ?)");
      }
      else
      {
         GXv_int23[31] = (byte)(1) ;
      }
      if ( ! (0==AV101Consultadeproduccion_agrupadasds_19_tfcolnumagr_to) )
      {
         addWhere(sWhereString, "(ColNumAgr <= ?)");
      }
      else
      {
         GXv_int23[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Consultadeproduccion_agrupadasds_21_tfcolnocagr_sel)==0) && ( ! (GXutil.strcmp("", AV102Consultadeproduccion_agrupadasds_20_tfcolnocagr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ColNoCAgr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Consultadeproduccion_agrupadasds_21_tfcolnocagr_sel)==0) )
      {
         addWhere(sWhereString, "(ColNoCAgr = ?)");
      }
      else
      {
         GXv_int23[34] = (byte)(1) ;
      }
      if ( ! (0==AV104Consultadeproduccion_agrupadasds_22_tfcolnucagr) )
      {
         addWhere(sWhereString, "(ColNuCAgr >= ?)");
      }
      else
      {
         GXv_int23[35] = (byte)(1) ;
      }
      if ( ! (0==AV105Consultadeproduccion_agrupadasds_23_tfcolnucagr_to) )
      {
         addWhere(sWhereString, "(ColNuCAgr <= ?)");
      }
      else
      {
         GXv_int23[36] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV27OrderedBy == 1 ) && ! AV28OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV27OrderedBy == 1 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV27OrderedBy == 2 ) && ! AV28OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV27OrderedBy == 2 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV27OrderedBy == 3 ) && ! AV28OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV27OrderedBy == 3 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV27OrderedBy == 4 ) && ! AV28OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV27OrderedBy == 4 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV27OrderedBy == 5 ) && ! AV28OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV27OrderedBy == 5 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV27OrderedBy == 6 ) && ! AV28OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV27OrderedBy == 6 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV27OrderedBy == 7 ) && ! AV28OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV27OrderedBy == 7 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV27OrderedBy == 8 ) && ! AV28OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV27OrderedBy == 8 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV27OrderedBy == 9 ) && ! AV28OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV27OrderedBy == 9 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV27OrderedBy == 10 ) && ! AV28OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV27OrderedBy == 10 ) && ( AV28OrderedDsc ) )
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

   protected Object[] conditional_H01974( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV83Consultadeproduccion_agrupadasds_1_filterfulltext ,
                                          String AV85Consultadeproduccion_agrupadasds_3_tfbaragrnhdr_sel ,
                                          String AV84Consultadeproduccion_agrupadasds_2_tfbaragrnhdr ,
                                          java.math.BigDecimal AV86Consultadeproduccion_agrupadasds_4_tfkgmagr ,
                                          java.math.BigDecimal AV87Consultadeproduccion_agrupadasds_5_tfkgmagr_to ,
                                          java.math.BigDecimal AV88Consultadeproduccion_agrupadasds_6_tfmtragr ,
                                          java.math.BigDecimal AV89Consultadeproduccion_agrupadasds_7_tfmtragr_to ,
                                          short AV90Consultadeproduccion_agrupadasds_8_tfpieagr ,
                                          short AV91Consultadeproduccion_agrupadasds_9_tfpieagr_to ,
                                          String AV93Consultadeproduccion_agrupadasds_11_tfbaragrser_sel ,
                                          String AV92Consultadeproduccion_agrupadasds_10_tfbaragrser ,
                                          String AV95Consultadeproduccion_agrupadasds_13_tfbaragrdsc_sel ,
                                          String AV94Consultadeproduccion_agrupadasds_12_tfbaragrdsc ,
                                          int AV96Consultadeproduccion_agrupadasds_14_tfclicodagr ,
                                          int AV97Consultadeproduccion_agrupadasds_15_tfclicodagr_to ,
                                          String AV99Consultadeproduccion_agrupadasds_17_tfcolnomagr_sel ,
                                          String AV98Consultadeproduccion_agrupadasds_16_tfcolnomagr ,
                                          int AV100Consultadeproduccion_agrupadasds_18_tfcolnumagr ,
                                          int AV101Consultadeproduccion_agrupadasds_19_tfcolnumagr_to ,
                                          String AV103Consultadeproduccion_agrupadasds_21_tfcolnocagr_sel ,
                                          String AV102Consultadeproduccion_agrupadasds_20_tfcolnocagr ,
                                          int AV104Consultadeproduccion_agrupadasds_22_tfcolnucagr ,
                                          int AV105Consultadeproduccion_agrupadasds_23_tfcolnucagr_to ,
                                          int A119BarAgrCod ,
                                          byte A124BarAgrReo ,
                                          String A122BarAgrPar ,
                                          java.math.BigDecimal A590KgmAgr ,
                                          java.math.BigDecimal A869MtrAgr ,
                                          short A671PieAgr ,
                                          String A1245BarAgrSer ,
                                          String A1507BarAgrDsc ,
                                          int A1508CliCodAgr ,
                                          String A1510ColNomAgr ,
                                          int A1512ColNumAgr ,
                                          String A1509ColNoCAgr ,
                                          int A1511ColNuCAgr ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int25 = new byte[37];
      Object[] GXv_Object26 = new Object[2];
      scmdbuf = "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ColNuCAgr, ColNoCAgr, ColNumAgr, ColNomAgr, CliCodAgr, BarAgrDsc, BarAgrSer, PieAgr, MtrAgr, KgmAgr, BarAgrPar, BarAgrReo," ;
      scmdbuf += " BarAgrCod FROM TXPBARAGR" ;
      addWhere(sWhereString, "(EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)");
      if ( ! (GXutil.strcmp("", AV83Consultadeproduccion_agrupadasds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(KgmAgr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MtrAgr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(PieAgr,'9990'), 2) like '%' || ?) or ( UPPER(BarAgrSer) like '%' || UPPER(?)) or ( UPPER(BarAgrDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(CliCodAgr,'999990'), 2) like '%' || ?) or ( UPPER(ColNomAgr) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(ColNumAgr,'999990'), 2) like '%' || ?) or ( UPPER(ColNoCAgr) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(ColNuCAgr,'999990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int25[4] = (byte)(1) ;
         GXv_int25[5] = (byte)(1) ;
         GXv_int25[6] = (byte)(1) ;
         GXv_int25[7] = (byte)(1) ;
         GXv_int25[8] = (byte)(1) ;
         GXv_int25[9] = (byte)(1) ;
         GXv_int25[10] = (byte)(1) ;
         GXv_int25[11] = (byte)(1) ;
         GXv_int25[12] = (byte)(1) ;
         GXv_int25[13] = (byte)(1) ;
         GXv_int25[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Consultadeproduccion_agrupadasds_3_tfbaragrnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV84Consultadeproduccion_agrupadasds_2_tfbaragrnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Consultadeproduccion_agrupadasds_3_tfbaragrnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar = ?)");
      }
      else
      {
         GXv_int25[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Consultadeproduccion_agrupadasds_4_tfkgmagr)==0) )
      {
         addWhere(sWhereString, "(KgmAgr >= ?)");
      }
      else
      {
         GXv_int25[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Consultadeproduccion_agrupadasds_5_tfkgmagr_to)==0) )
      {
         addWhere(sWhereString, "(KgmAgr <= ?)");
      }
      else
      {
         GXv_int25[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Consultadeproduccion_agrupadasds_6_tfmtragr)==0) )
      {
         addWhere(sWhereString, "(MtrAgr >= ?)");
      }
      else
      {
         GXv_int25[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Consultadeproduccion_agrupadasds_7_tfmtragr_to)==0) )
      {
         addWhere(sWhereString, "(MtrAgr <= ?)");
      }
      else
      {
         GXv_int25[20] = (byte)(1) ;
      }
      if ( ! (0==AV90Consultadeproduccion_agrupadasds_8_tfpieagr) )
      {
         addWhere(sWhereString, "(PieAgr >= ?)");
      }
      else
      {
         GXv_int25[21] = (byte)(1) ;
      }
      if ( ! (0==AV91Consultadeproduccion_agrupadasds_9_tfpieagr_to) )
      {
         addWhere(sWhereString, "(PieAgr <= ?)");
      }
      else
      {
         GXv_int25[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Consultadeproduccion_agrupadasds_11_tfbaragrser_sel)==0) && ( ! (GXutil.strcmp("", AV92Consultadeproduccion_agrupadasds_10_tfbaragrser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarAgrSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Consultadeproduccion_agrupadasds_11_tfbaragrser_sel)==0) )
      {
         addWhere(sWhereString, "(BarAgrSer = ?)");
      }
      else
      {
         GXv_int25[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Consultadeproduccion_agrupadasds_13_tfbaragrdsc_sel)==0) && ( ! (GXutil.strcmp("", AV94Consultadeproduccion_agrupadasds_12_tfbaragrdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarAgrDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Consultadeproduccion_agrupadasds_13_tfbaragrdsc_sel)==0) )
      {
         addWhere(sWhereString, "(BarAgrDsc = ?)");
      }
      else
      {
         GXv_int25[26] = (byte)(1) ;
      }
      if ( ! (0==AV96Consultadeproduccion_agrupadasds_14_tfclicodagr) )
      {
         addWhere(sWhereString, "(CliCodAgr >= ?)");
      }
      else
      {
         GXv_int25[27] = (byte)(1) ;
      }
      if ( ! (0==AV97Consultadeproduccion_agrupadasds_15_tfclicodagr_to) )
      {
         addWhere(sWhereString, "(CliCodAgr <= ?)");
      }
      else
      {
         GXv_int25[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Consultadeproduccion_agrupadasds_17_tfcolnomagr_sel)==0) && ( ! (GXutil.strcmp("", AV98Consultadeproduccion_agrupadasds_16_tfcolnomagr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ColNomAgr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Consultadeproduccion_agrupadasds_17_tfcolnomagr_sel)==0) )
      {
         addWhere(sWhereString, "(ColNomAgr = ?)");
      }
      else
      {
         GXv_int25[30] = (byte)(1) ;
      }
      if ( ! (0==AV100Consultadeproduccion_agrupadasds_18_tfcolnumagr) )
      {
         addWhere(sWhereString, "(ColNumAgr >= ?)");
      }
      else
      {
         GXv_int25[31] = (byte)(1) ;
      }
      if ( ! (0==AV101Consultadeproduccion_agrupadasds_19_tfcolnumagr_to) )
      {
         addWhere(sWhereString, "(ColNumAgr <= ?)");
      }
      else
      {
         GXv_int25[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Consultadeproduccion_agrupadasds_21_tfcolnocagr_sel)==0) && ( ! (GXutil.strcmp("", AV102Consultadeproduccion_agrupadasds_20_tfcolnocagr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ColNoCAgr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Consultadeproduccion_agrupadasds_21_tfcolnocagr_sel)==0) )
      {
         addWhere(sWhereString, "(ColNoCAgr = ?)");
      }
      else
      {
         GXv_int25[34] = (byte)(1) ;
      }
      if ( ! (0==AV104Consultadeproduccion_agrupadasds_22_tfcolnucagr) )
      {
         addWhere(sWhereString, "(ColNuCAgr >= ?)");
      }
      else
      {
         GXv_int25[35] = (byte)(1) ;
      }
      if ( ! (0==AV105Consultadeproduccion_agrupadasds_23_tfcolnucagr_to) )
      {
         addWhere(sWhereString, "(ColNuCAgr <= ?)");
      }
      else
      {
         GXv_int25[36] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      GXv_Object26[0] = scmdbuf ;
      GXv_Object26[1] = GXv_int25 ;
      return GXv_Object26 ;
   }

   protected Object[] conditional_H01975( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV83Consultadeproduccion_agrupadasds_1_filterfulltext ,
                                          String AV85Consultadeproduccion_agrupadasds_3_tfbaragrnhdr_sel ,
                                          String AV84Consultadeproduccion_agrupadasds_2_tfbaragrnhdr ,
                                          java.math.BigDecimal AV86Consultadeproduccion_agrupadasds_4_tfkgmagr ,
                                          java.math.BigDecimal AV87Consultadeproduccion_agrupadasds_5_tfkgmagr_to ,
                                          java.math.BigDecimal AV88Consultadeproduccion_agrupadasds_6_tfmtragr ,
                                          java.math.BigDecimal AV89Consultadeproduccion_agrupadasds_7_tfmtragr_to ,
                                          short AV90Consultadeproduccion_agrupadasds_8_tfpieagr ,
                                          short AV91Consultadeproduccion_agrupadasds_9_tfpieagr_to ,
                                          String AV93Consultadeproduccion_agrupadasds_11_tfbaragrser_sel ,
                                          String AV92Consultadeproduccion_agrupadasds_10_tfbaragrser ,
                                          String AV95Consultadeproduccion_agrupadasds_13_tfbaragrdsc_sel ,
                                          String AV94Consultadeproduccion_agrupadasds_12_tfbaragrdsc ,
                                          int AV96Consultadeproduccion_agrupadasds_14_tfclicodagr ,
                                          int AV97Consultadeproduccion_agrupadasds_15_tfclicodagr_to ,
                                          String AV99Consultadeproduccion_agrupadasds_17_tfcolnomagr_sel ,
                                          String AV98Consultadeproduccion_agrupadasds_16_tfcolnomagr ,
                                          int AV100Consultadeproduccion_agrupadasds_18_tfcolnumagr ,
                                          int AV101Consultadeproduccion_agrupadasds_19_tfcolnumagr_to ,
                                          String AV103Consultadeproduccion_agrupadasds_21_tfcolnocagr_sel ,
                                          String AV102Consultadeproduccion_agrupadasds_20_tfcolnocagr ,
                                          int AV104Consultadeproduccion_agrupadasds_22_tfcolnucagr ,
                                          int AV105Consultadeproduccion_agrupadasds_23_tfcolnucagr_to ,
                                          int A119BarAgrCod ,
                                          byte A124BarAgrReo ,
                                          String A122BarAgrPar ,
                                          java.math.BigDecimal A590KgmAgr ,
                                          java.math.BigDecimal A869MtrAgr ,
                                          short A671PieAgr ,
                                          String A1245BarAgrSer ,
                                          String A1507BarAgrDsc ,
                                          int A1508CliCodAgr ,
                                          String A1510ColNomAgr ,
                                          int A1512ColNumAgr ,
                                          String A1509ColNoCAgr ,
                                          int A1511ColNuCAgr ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int27 = new byte[37];
      Object[] GXv_Object28 = new Object[2];
      scmdbuf = "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ColNuCAgr, ColNoCAgr, ColNumAgr, ColNomAgr, CliCodAgr, BarAgrDsc, BarAgrSer, PieAgr, MtrAgr, KgmAgr, BarAgrPar, BarAgrReo," ;
      scmdbuf += " BarAgrCod FROM TXPBARAGR" ;
      addWhere(sWhereString, "(EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)");
      if ( ! (GXutil.strcmp("", AV83Consultadeproduccion_agrupadasds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(KgmAgr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MtrAgr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(PieAgr,'9990'), 2) like '%' || ?) or ( UPPER(BarAgrSer) like '%' || UPPER(?)) or ( UPPER(BarAgrDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(CliCodAgr,'999990'), 2) like '%' || ?) or ( UPPER(ColNomAgr) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(ColNumAgr,'999990'), 2) like '%' || ?) or ( UPPER(ColNoCAgr) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(ColNuCAgr,'999990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int27[4] = (byte)(1) ;
         GXv_int27[5] = (byte)(1) ;
         GXv_int27[6] = (byte)(1) ;
         GXv_int27[7] = (byte)(1) ;
         GXv_int27[8] = (byte)(1) ;
         GXv_int27[9] = (byte)(1) ;
         GXv_int27[10] = (byte)(1) ;
         GXv_int27[11] = (byte)(1) ;
         GXv_int27[12] = (byte)(1) ;
         GXv_int27[13] = (byte)(1) ;
         GXv_int27[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Consultadeproduccion_agrupadasds_3_tfbaragrnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV84Consultadeproduccion_agrupadasds_2_tfbaragrnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Consultadeproduccion_agrupadasds_3_tfbaragrnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar = ?)");
      }
      else
      {
         GXv_int27[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Consultadeproduccion_agrupadasds_4_tfkgmagr)==0) )
      {
         addWhere(sWhereString, "(KgmAgr >= ?)");
      }
      else
      {
         GXv_int27[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Consultadeproduccion_agrupadasds_5_tfkgmagr_to)==0) )
      {
         addWhere(sWhereString, "(KgmAgr <= ?)");
      }
      else
      {
         GXv_int27[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Consultadeproduccion_agrupadasds_6_tfmtragr)==0) )
      {
         addWhere(sWhereString, "(MtrAgr >= ?)");
      }
      else
      {
         GXv_int27[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Consultadeproduccion_agrupadasds_7_tfmtragr_to)==0) )
      {
         addWhere(sWhereString, "(MtrAgr <= ?)");
      }
      else
      {
         GXv_int27[20] = (byte)(1) ;
      }
      if ( ! (0==AV90Consultadeproduccion_agrupadasds_8_tfpieagr) )
      {
         addWhere(sWhereString, "(PieAgr >= ?)");
      }
      else
      {
         GXv_int27[21] = (byte)(1) ;
      }
      if ( ! (0==AV91Consultadeproduccion_agrupadasds_9_tfpieagr_to) )
      {
         addWhere(sWhereString, "(PieAgr <= ?)");
      }
      else
      {
         GXv_int27[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Consultadeproduccion_agrupadasds_11_tfbaragrser_sel)==0) && ( ! (GXutil.strcmp("", AV92Consultadeproduccion_agrupadasds_10_tfbaragrser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarAgrSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Consultadeproduccion_agrupadasds_11_tfbaragrser_sel)==0) )
      {
         addWhere(sWhereString, "(BarAgrSer = ?)");
      }
      else
      {
         GXv_int27[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Consultadeproduccion_agrupadasds_13_tfbaragrdsc_sel)==0) && ( ! (GXutil.strcmp("", AV94Consultadeproduccion_agrupadasds_12_tfbaragrdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarAgrDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Consultadeproduccion_agrupadasds_13_tfbaragrdsc_sel)==0) )
      {
         addWhere(sWhereString, "(BarAgrDsc = ?)");
      }
      else
      {
         GXv_int27[26] = (byte)(1) ;
      }
      if ( ! (0==AV96Consultadeproduccion_agrupadasds_14_tfclicodagr) )
      {
         addWhere(sWhereString, "(CliCodAgr >= ?)");
      }
      else
      {
         GXv_int27[27] = (byte)(1) ;
      }
      if ( ! (0==AV97Consultadeproduccion_agrupadasds_15_tfclicodagr_to) )
      {
         addWhere(sWhereString, "(CliCodAgr <= ?)");
      }
      else
      {
         GXv_int27[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Consultadeproduccion_agrupadasds_17_tfcolnomagr_sel)==0) && ( ! (GXutil.strcmp("", AV98Consultadeproduccion_agrupadasds_16_tfcolnomagr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ColNomAgr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Consultadeproduccion_agrupadasds_17_tfcolnomagr_sel)==0) )
      {
         addWhere(sWhereString, "(ColNomAgr = ?)");
      }
      else
      {
         GXv_int27[30] = (byte)(1) ;
      }
      if ( ! (0==AV100Consultadeproduccion_agrupadasds_18_tfcolnumagr) )
      {
         addWhere(sWhereString, "(ColNumAgr >= ?)");
      }
      else
      {
         GXv_int27[31] = (byte)(1) ;
      }
      if ( ! (0==AV101Consultadeproduccion_agrupadasds_19_tfcolnumagr_to) )
      {
         addWhere(sWhereString, "(ColNumAgr <= ?)");
      }
      else
      {
         GXv_int27[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Consultadeproduccion_agrupadasds_21_tfcolnocagr_sel)==0) && ( ! (GXutil.strcmp("", AV102Consultadeproduccion_agrupadasds_20_tfcolnocagr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ColNoCAgr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Consultadeproduccion_agrupadasds_21_tfcolnocagr_sel)==0) )
      {
         addWhere(sWhereString, "(ColNoCAgr = ?)");
      }
      else
      {
         GXv_int27[34] = (byte)(1) ;
      }
      if ( ! (0==AV104Consultadeproduccion_agrupadasds_22_tfcolnucagr) )
      {
         addWhere(sWhereString, "(ColNuCAgr >= ?)");
      }
      else
      {
         GXv_int27[35] = (byte)(1) ;
      }
      if ( ! (0==AV105Consultadeproduccion_agrupadasds_23_tfcolnucagr_to) )
      {
         addWhere(sWhereString, "(ColNuCAgr <= ?)");
      }
      else
      {
         GXv_int27[36] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      GXv_Object28[0] = scmdbuf ;
      GXv_Object28[1] = GXv_int27 ;
      return GXv_Object28 ;
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
                  return conditional_H01972(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).shortValue() , ((Boolean) dynConstraints[37]).booleanValue() , (String)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] );
            case 1 :
                  return conditional_H01973(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).shortValue() , ((Boolean) dynConstraints[37]).booleanValue() , (String)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] );
            case 2 :
                  return conditional_H01974(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] );
            case 3 :
                  return conditional_H01975(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01972", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01973", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01974", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01975", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 26);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
               ((String[]) buf[14])[0] = rslt.getString(15, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(16);
               ((int[]) buf[16])[0] = rslt.getInt(17);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 26);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
               ((String[]) buf[14])[0] = rslt.getString(15, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(16);
               ((int[]) buf[16])[0] = rslt.getInt(17);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 26);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
               ((String[]) buf[14])[0] = rslt.getString(15, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(16);
               ((int[]) buf[16])[0] = rslt.getInt(17);
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
                  stmt.setString(sIdx, (String)parms[42], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 11);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 11);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 16);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 13);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 11);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 11);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 13);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 11);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 11);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 13);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 11);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 11);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 13);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               return;
      }
   }

}

