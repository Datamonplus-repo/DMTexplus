package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class consultadeproduccion_albaranesproduccion_impl extends GXWebComponent
{
   public consultadeproduccion_albaranesproduccion_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public consultadeproduccion_albaranesproduccion_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultadeproduccion_albaranesproduccion_impl.class ));
   }

   public consultadeproduccion_albaranesproduccion_impl( int remoteHandle ,
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
               AV50EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50EmprCod", AV50EmprCod);
               AV51BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51BarCod), 8, 0));
               AV52BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52BarCodReo", GXutil.str( AV52BarCodReo, 1, 0));
               AV53BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53BarCodPar", AV53BarCodPar);
               AV60CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60CliCod), 6, 0));
               AV61CliNom = httpContext.GetPar( "CliNom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61CliNom", AV61CliNom);
               AV62PedidoCliente = httpContext.GetPar( "PedidoCliente") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62PedidoCliente", AV62PedidoCliente);
               AV63BarSer = httpContext.GetPar( "BarSer") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63BarSer", AV63BarSer);
               AV64BarSerDsc = httpContext.GetPar( "BarSerDsc") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64BarSerDsc", AV64BarSerDsc);
               AV65BarColNom = httpContext.GetPar( "BarColNom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65BarColNom", AV65BarColNom);
               AV66BarColNum = (int)(GXutil.lval( httpContext.GetPar( "BarColNum"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66BarColNum), 6, 0));
               AV54BarKgm = CommonUtil.decimalVal( httpContext.GetPar( "BarKgm"), ".") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54BarKgm", GXutil.ltrimstr( AV54BarKgm, 9, 2));
               AV55BarMtr = CommonUtil.decimalVal( httpContext.GetPar( "BarMtr"), ".") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55BarMtr", GXutil.ltrimstr( AV55BarMtr, 9, 2));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV50EmprCod,Integer.valueOf(AV51BarCod),Byte.valueOf(AV52BarCodReo),AV53BarCodPar,Integer.valueOf(AV60CliCod),AV61CliNom,AV62PedidoCliente,AV63BarSer,AV64BarSerDsc,AV65BarColNom,Integer.valueOf(AV66BarColNum),AV54BarKgm,AV55BarMtr});
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
      AV50EmprCod = httpContext.GetPar( "EmprCod") ;
      AV51BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      AV52BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      AV53BarCodPar = httpContext.GetPar( "BarCodPar") ;
      AV24TFAlbProCod = GXutil.lval( httpContext.GetPar( "TFAlbProCod")) ;
      AV25TFAlbProCod_To = GXutil.lval( httpContext.GetPar( "TFAlbProCod_To")) ;
      AV26TFAlbProfch = localUtil.parseDateParm( httpContext.GetPar( "TFAlbProfch")) ;
      AV32TFBarAlbKgmE = CommonUtil.decimalVal( httpContext.GetPar( "TFBarAlbKgmE"), ".") ;
      AV33TFBarAlbKgmE_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarAlbKgmE_To"), ".") ;
      AV34TFBarAlbMtrE = CommonUtil.decimalVal( httpContext.GetPar( "TFBarAlbMtrE"), ".") ;
      AV35TFBarAlbMtrE_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarAlbMtrE_To"), ".") ;
      AV36TFBarAlbPie = (int)(GXutil.lval( httpContext.GetPar( "TFBarAlbPie"))) ;
      AV37TFBarAlbPie_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarAlbPie_To"))) ;
      AV85Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV60CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
      AV61CliNom = httpContext.GetPar( "CliNom") ;
      AV62PedidoCliente = httpContext.GetPar( "PedidoCliente") ;
      AV63BarSer = httpContext.GetPar( "BarSer") ;
      AV64BarSerDsc = httpContext.GetPar( "BarSerDsc") ;
      AV65BarColNom = httpContext.GetPar( "BarColNom") ;
      AV66BarColNum = (int)(GXutil.lval( httpContext.GetPar( "BarColNum"))) ;
      AV54BarKgm = CommonUtil.decimalVal( httpContext.GetPar( "BarKgm"), ".") ;
      AV55BarMtr = CommonUtil.decimalVal( httpContext.GetPar( "BarMtr"), ".") ;
      AV44TotBarAlbKgmE = CommonUtil.decimalVal( httpContext.GetPar( "TotBarAlbKgmE"), ".") ;
      AV46TotBarAlbMtrE = CommonUtil.decimalVal( httpContext.GetPar( "TotBarAlbMtrE"), ".") ;
      AV48TotBarAlbPie = GXutil.lval( httpContext.GetPar( "TotBarAlbPie")) ;
      AV72Consultadeproduccion_albaranesproduccionds_1_emprcod = httpContext.GetPar( "Consultadeproduccion_albaranesproduccionds_1_emprcod") ;
      AV73Consultadeproduccion_albaranesproduccionds_2_barcod = (int)(GXutil.lval( httpContext.GetPar( "Consultadeproduccion_albaranesproduccionds_2_barcod"))) ;
      AV74Consultadeproduccion_albaranesproduccionds_3_barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Consultadeproduccion_albaranesproduccionds_3_barcodreo"))) ;
      AV75Consultadeproduccion_albaranesproduccionds_4_barcodpar = httpContext.GetPar( "Consultadeproduccion_albaranesproduccionds_4_barcodpar") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV50EmprCod, AV51BarCod, AV52BarCodReo, AV53BarCodPar, AV24TFAlbProCod, AV25TFAlbProCod_To, AV26TFAlbProfch, AV32TFBarAlbKgmE, AV33TFBarAlbKgmE_To, AV34TFBarAlbMtrE, AV35TFBarAlbMtrE_To, AV36TFBarAlbPie, AV37TFBarAlbPie_To, AV85Pgmname, AV12OrderedBy, AV13OrderedDsc, AV60CliCod, AV61CliNom, AV62PedidoCliente, AV63BarSer, AV64BarSerDsc, AV65BarColNom, AV66BarColNum, AV54BarKgm, AV55BarMtr, AV44TotBarAlbKgmE, AV46TotBarAlbMtrE, AV48TotBarAlbPie, AV72Consultadeproduccion_albaranesproduccionds_1_emprcod, AV73Consultadeproduccion_albaranesproduccionds_2_barcod, AV74Consultadeproduccion_albaranesproduccionds_3_barcodreo, AV75Consultadeproduccion_albaranesproduccionds_4_barcodpar, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1992( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Albaran de Entrega", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.consultadeproduccion_albaranesproduccion", new String[] {GXutil.URLEncode(GXutil.rtrim(AV50EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV51BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV52BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV53BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV60CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV61CliNom)),GXutil.URLEncode(GXutil.rtrim(AV62PedidoCliente)),GXutil.URLEncode(GXutil.rtrim(AV63BarSer)),GXutil.URLEncode(GXutil.rtrim(AV64BarSerDsc)),GXutil.URLEncode(GXutil.rtrim(AV65BarColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV66BarColNum,6,0)),GXutil.URLEncode(DecimalUtil.decToString(AV54BarKgm)),GXutil.URLEncode(DecimalUtil.decToString(AV55BarMtr))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","CliCod","CliNom","PedidoCliente","BarSer","BarSerDsc","BarColNom","BarColNum","BarKgm","BarMtr"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV85Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARALBKGME", getSecureSignedToken( sPrefix, localUtil.format( AV44TotBarAlbKgmE, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARALBMTRE", getSecureSignedToken( sPrefix, localUtil.format( AV46TotBarAlbMtrE, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARALBPIE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV48TotBarAlbPie), "ZZZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ConsultadeProduccion_AlbaranesProduccion");
      forbiddenHiddens.add("EmprCod", GXutil.rtrim( localUtil.format( A396EmprCod, "@!")));
      forbiddenHiddens.add("BarCod", localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"));
      forbiddenHiddens.add("BarCodReo", localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"));
      forbiddenHiddens.add("BarCodPar", GXutil.rtrim( localUtil.format( A130BarCodPar, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("consultadeproduccion_albaranesproduccion:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_105", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_105, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV40GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV41GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV38DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV38DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV50EmprCod", GXutil.rtrim( wcpOAV50EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV51BarCod", GXutil.ltrim( localUtil.ntoc( wcpOAV51BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV52BarCodReo", GXutil.ltrim( localUtil.ntoc( wcpOAV52BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV53BarCodPar", GXutil.rtrim( wcpOAV53BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV60CliCod", GXutil.ltrim( localUtil.ntoc( wcpOAV60CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV61CliNom", GXutil.rtrim( wcpOAV61CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV62PedidoCliente", GXutil.rtrim( wcpOAV62PedidoCliente));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV63BarSer", GXutil.rtrim( wcpOAV63BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV64BarSerDsc", GXutil.rtrim( wcpOAV64BarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV65BarColNom", GXutil.rtrim( wcpOAV65BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV66BarColNum", GXutil.ltrim( localUtil.ntoc( wcpOAV66BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV54BarKgm", GXutil.ltrim( localUtil.ntoc( wcpOAV54BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV55BarMtr", GXutil.ltrim( localUtil.ntoc( wcpOAV55BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV50EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBPROCOD", GXutil.ltrim( localUtil.ntoc( AV24TFAlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBPROCOD_TO", GXutil.ltrim( localUtil.ntoc( AV25TFAlbProCod_To, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBPROFCH", localUtil.dtoc( AV26TFAlbProfch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARALBKGME", GXutil.ltrim( localUtil.ntoc( AV32TFBarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARALBKGME_TO", GXutil.ltrim( localUtil.ntoc( AV33TFBarAlbKgmE_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARALBMTRE", GXutil.ltrim( localUtil.ntoc( AV34TFBarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARALBMTRE_TO", GXutil.ltrim( localUtil.ntoc( AV35TFBarAlbMtrE_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARALBPIE", GXutil.ltrim( localUtil.ntoc( AV36TFBarAlbPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARALBPIE_TO", GXutil.ltrim( localUtil.ntoc( AV37TFBarAlbPie_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV85Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV85Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTBARALBKGME", GXutil.ltrim( localUtil.ntoc( AV44TotBarAlbKgmE, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARALBKGME", getSecureSignedToken( sPrefix, localUtil.format( AV44TotBarAlbKgmE, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTBARALBMTRE", GXutil.ltrim( localUtil.ntoc( AV46TotBarAlbMtrE, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARALBMTRE", getSecureSignedToken( sPrefix, localUtil.format( AV46TotBarAlbMtrE, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTBARALBPIE", GXutil.ltrim( localUtil.ntoc( AV48TotBarAlbPie, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARALBPIE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV48TotBarAlbPie), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCONSULTADEPRODUCCION_ALBARANESPRODUCCIONDS_1_EMPRCOD", GXutil.rtrim( AV72Consultadeproduccion_albaranesproduccionds_1_emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCONSULTADEPRODUCCION_ALBARANESPRODUCCIONDS_2_BARCOD", GXutil.ltrim( localUtil.ntoc( AV73Consultadeproduccion_albaranesproduccionds_2_barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCONSULTADEPRODUCCION_ALBARANESPRODUCCIONDS_3_BARCODREO", GXutil.ltrim( localUtil.ntoc( AV74Consultadeproduccion_albaranesproduccionds_3_barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCONSULTADEPRODUCCION_ALBARANESPRODUCCIONDS_4_BARCODPAR", GXutil.rtrim( AV75Consultadeproduccion_albaranesproduccionds_4_barcodpar));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includesortasc", GXutil.rtrim( Ddo_grid_Includesortasc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filterisrange", GXutil.rtrim( Ddo_grid_Filterisrange));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
   }

   public void renderHtmlCloseForm1992( )
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
      return "ConsultadeProduccion_AlbaranesProduccion" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Albaran de Entrega", "") ;
   }

   public void wb1990( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.consultadeproduccion_albaranesproduccion");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV51BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV51BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV51BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ConsultadeProduccion_AlbaranesProduccion.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodreo_Internalname, GXutil.ltrim( localUtil.ntoc( AV52BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV52BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(AV52BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodreo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodreo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ConsultadeProduccion_AlbaranesProduccion.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodpar_Internalname, GXutil.rtrim( AV53BarCodPar), GXutil.rtrim( localUtil.format( AV53BarCodPar, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodpar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodpar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ConsultadeProduccion_AlbaranesProduccion.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV60CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV60CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV60CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ConsultadeProduccion_AlbaranesProduccion.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClinom_Internalname, GXutil.rtrim( AV61CliNom), GXutil.rtrim( localUtil.format( AV61CliNom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClinom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClinom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ConsultadeProduccion_AlbaranesProduccion.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPedidocliente_Internalname, GXutil.rtrim( AV62PedidoCliente), GXutil.rtrim( localUtil.format( AV62PedidoCliente, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPedidocliente_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPedidocliente_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ConsultadeProduccion_AlbaranesProduccion.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarser_Internalname, GXutil.rtrim( AV63BarSer), GXutil.rtrim( localUtil.format( AV63BarSer, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarser_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarser_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ConsultadeProduccion_AlbaranesProduccion.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarserdsc_Internalname, GXutil.rtrim( AV64BarSerDsc), GXutil.rtrim( localUtil.format( AV64BarSerDsc, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarserdsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarserdsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ConsultadeProduccion_AlbaranesProduccion.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnom_Internalname, GXutil.rtrim( AV65BarColNom), GXutil.rtrim( localUtil.format( AV65BarColNom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ConsultadeProduccion_AlbaranesProduccion.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnum_Internalname, GXutil.ltrim( localUtil.ntoc( AV66BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV66BarColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV66BarColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ConsultadeProduccion_AlbaranesProduccion.htm");
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 105, 3, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ConsultadeProduccion_AlbaranesProduccion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 105, 3, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ConsultadeProduccion_AlbaranesProduccion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_74_1992( true) ;
      }
      else
      {
         wb_table1_74_1992( false) ;
      }
      return  ;
   }

   public void wb_table1_74_1992e( boolean wbgen )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarkgm_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarkgm_Internalname, httpContext.getMessage( "Kilos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarkgm_Internalname, GXutil.ltrim( localUtil.ntoc( AV54BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarkgm_Enabled!=0) ? localUtil.format( AV54BarKgm, "ZZZZZ9.99") : localUtil.format( AV54BarKgm, "ZZZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarkgm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarkgm_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ConsultadeProduccion_AlbaranesProduccion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMermak_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMermak_Internalname, httpContext.getMessage( "% Merma Kg", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'" + sPrefix + "',false,'" + sGXsfl_105_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMermak_Internalname, GXutil.ltrim( localUtil.ntoc( AV56MermaK, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavMermak_Enabled!=0) ? localUtil.format( AV56MermaK, "ZZ9.99") : localUtil.format( AV56MermaK, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,88);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMermak_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMermak_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ConsultadeProduccion_AlbaranesProduccion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarmtr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarmtr_Internalname, httpContext.getMessage( "Metros", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarmtr_Internalname, GXutil.ltrim( localUtil.ntoc( AV55BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarmtr_Enabled!=0) ? localUtil.format( AV55BarMtr, "ZZZZZ9.99") : localUtil.format( AV55BarMtr, "ZZZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarmtr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarmtr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ConsultadeProduccion_AlbaranesProduccion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMermam_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMermam_Internalname, httpContext.getMessage( "% Merma Mt", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'" + sPrefix + "',false,'" + sGXsfl_105_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMermam_Internalname, GXutil.ltrim( localUtil.ntoc( AV57MermaM, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavMermam_Enabled!=0) ? localUtil.format( AV57MermaM, "ZZ9.99") : localUtil.format( AV57MermaM, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,96);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMermam_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMermam_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ConsultadeProduccion_AlbaranesProduccion.htm");
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
         wb_table2_113_1992( true) ;
      }
      else
      {
         wb_table2_113_1992( false) ;
      }
      return  ;
   }

   public void wb_table2_113_1992e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV40GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV41GridPageCount);
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
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("FilterIsRange", Ddo_grid_Filterisrange);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV38DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, 0, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ConsultadeProduccion_AlbaranesProduccion.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "Attribute", "", "", "", "", edtBarCod_Visible, 0, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ConsultadeProduccion_AlbaranesProduccion.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "Attribute", "", "", "", "", edtBarCodReo_Visible, 0, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ConsultadeProduccion_AlbaranesProduccion.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "Attribute", "", "", "", "", edtBarCodPar_Visible, 0, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ConsultadeProduccion_AlbaranesProduccion.htm");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_albprofchauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'" + sPrefix + "',false,'" + sGXsfl_105_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_albprofchauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_albprofchauxdate_Internalname, localUtil.format(AV28DDO_AlbProfchAuxDate, "99/99/99"), localUtil.format( AV28DDO_AlbProfchAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,139);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_albprofchauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ConsultadeProduccion_AlbaranesProduccion.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_albprofchauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ConsultadeProduccion_AlbaranesProduccion.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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

   public void start1992( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Albaran de Entrega", ""), (short)(0)) ;
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
            strup1990( ) ;
         }
      }
   }

   public void ws1992( )
   {
      start1992( ) ;
      evt1992( ) ;
   }

   public void evt1992( )
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
                              strup1990( ) ;
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
                              strup1990( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e111992 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1990( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e121992 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1990( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e131992 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1990( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e141992 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1990( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e151992 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1990( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavMermak_Internalname ;
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
                              strup1990( ) ;
                           }
                           nGXsfl_105_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_105_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_105_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1052( ) ;
                           A30AlbProCod = localUtil.ctol( httpContext.cgiGet( edtAlbProCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           A34AlbProfch = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtAlbProfch_Internalname), 0)) ;
                           A1261BarAlbKgmE = localUtil.ctond( httpContext.cgiGet( edtBarAlbKgmE_Internalname)) ;
                           A1263BarAlbMtrE = localUtil.ctond( httpContext.cgiGet( edtBarAlbMtrE_Internalname)) ;
                           A1265BarAlbPie = (int)(localUtil.ctol( httpContext.cgiGet( edtBarAlbPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
                                       GX_FocusControl = edtavMermak_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e161992 ();
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
                                       GX_FocusControl = edtavMermak_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e171992 ();
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
                                       GX_FocusControl = edtavMermak_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e181992 ();
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
                                    strup1990( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavMermak_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                    }
                                 }
                              }
                           }
                           else
                           {
                           }
                        }
                        else if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1990( ) ;
                           }
                           nGXsfl_105_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_105_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_105_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1052( ) ;
                           A30AlbProCod = localUtil.ctol( httpContext.cgiGet( edtAlbProCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           A34AlbProfch = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtAlbProfch_Internalname), 0)) ;
                           A1261BarAlbKgmE = localUtil.ctond( httpContext.cgiGet( edtBarAlbKgmE_Internalname)) ;
                           A1263BarAlbMtrE = localUtil.ctond( httpContext.cgiGet( edtBarAlbMtrE_Internalname)) ;
                           A1265BarAlbPie = (int)(localUtil.ctol( httpContext.cgiGet( edtBarAlbPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
                                       GX_FocusControl = edtavMermak_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e161992 ();
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
                                       GX_FocusControl = edtavMermak_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e171992 ();
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
                                       GX_FocusControl = edtavMermak_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e181992 ();
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
                                    strup1990( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavMermak_Internalname ;
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

   public void we1992( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1992( ) ;
         }
      }
   }

   public void pa1992( )
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
            GX_FocusControl = edtavMermak_Internalname ;
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
                                 String AV50EmprCod ,
                                 int AV51BarCod ,
                                 byte AV52BarCodReo ,
                                 String AV53BarCodPar ,
                                 long AV24TFAlbProCod ,
                                 long AV25TFAlbProCod_To ,
                                 java.util.Date AV26TFAlbProfch ,
                                 java.math.BigDecimal AV32TFBarAlbKgmE ,
                                 java.math.BigDecimal AV33TFBarAlbKgmE_To ,
                                 java.math.BigDecimal AV34TFBarAlbMtrE ,
                                 java.math.BigDecimal AV35TFBarAlbMtrE_To ,
                                 int AV36TFBarAlbPie ,
                                 int AV37TFBarAlbPie_To ,
                                 String AV85Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 int AV60CliCod ,
                                 String AV61CliNom ,
                                 String AV62PedidoCliente ,
                                 String AV63BarSer ,
                                 String AV64BarSerDsc ,
                                 String AV65BarColNom ,
                                 int AV66BarColNum ,
                                 java.math.BigDecimal AV54BarKgm ,
                                 java.math.BigDecimal AV55BarMtr ,
                                 java.math.BigDecimal AV44TotBarAlbKgmE ,
                                 java.math.BigDecimal AV46TotBarAlbMtrE ,
                                 long AV48TotBarAlbPie ,
                                 String AV72Consultadeproduccion_albaranesproduccionds_1_emprcod ,
                                 int AV73Consultadeproduccion_albaranesproduccionds_2_barcod ,
                                 byte AV74Consultadeproduccion_albaranesproduccionds_3_barcodreo ,
                                 String AV75Consultadeproduccion_albaranesproduccionds_4_barcodpar ,
                                 String A396EmprCod ,
                                 int A129BarCod ,
                                 byte A132BarCodReo ,
                                 String A130BarCodPar ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e171992 ();
      GRID_nCurrentRecord = 0 ;
      rf1992( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ConsultadeProduccion_AlbaranesProduccion");
      forbiddenHiddens.add("EmprCod", GXutil.rtrim( localUtil.format( A396EmprCod, "@!")));
      forbiddenHiddens.add("BarCod", localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"));
      forbiddenHiddens.add("BarCodReo", localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"));
      forbiddenHiddens.add("BarCodPar", GXutil.rtrim( localUtil.format( A130BarCodPar, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("consultadeproduccion_albaranesproduccion:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf1992( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV85Pgmname = "ConsultadeProduccion_AlbaranesProduccion" ;
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
      edtavBarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm_Enabled), 5, 0), true);
      edtavMermak_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMermak_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMermak_Enabled), 5, 0), true);
      edtavBarmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmtr_Enabled), 5, 0), true);
      edtavMermam_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMermam_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMermam_Enabled), 5, 0), true);
      edtavTotvaluebaralbkgme_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebaralbkgme_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebaralbkgme_Enabled), 5, 0), true);
      edtavTotvaluebaralbmtre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebaralbmtre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebaralbmtre_Enabled), 5, 0), true);
      edtavTotvaluebaralbpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebaralbpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebaralbpie_Enabled), 5, 0), true);
   }

   public void rf1992( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(105) ;
      /* Execute user event: Refresh */
      e171992 ();
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
                                              Long.valueOf(AV76Consultadeproduccion_albaranesproduccionds_5_tfalbprocod) ,
                                              Long.valueOf(AV77Consultadeproduccion_albaranesproduccionds_6_tfalbprocod_to) ,
                                              AV78Consultadeproduccion_albaranesproduccionds_7_tfalbprofch ,
                                              AV79Consultadeproduccion_albaranesproduccionds_8_tfbaralbkgme ,
                                              AV80Consultadeproduccion_albaranesproduccionds_9_tfbaralbkgme_to ,
                                              AV81Consultadeproduccion_albaranesproduccionds_10_tfbaralbmtre ,
                                              AV82Consultadeproduccion_albaranesproduccionds_11_tfbaralbmtre_to ,
                                              Integer.valueOf(AV83Consultadeproduccion_albaranesproduccionds_12_tfbaralbpie) ,
                                              Integer.valueOf(AV84Consultadeproduccion_albaranesproduccionds_13_tfbaralbpie_to) ,
                                              Long.valueOf(A30AlbProCod) ,
                                              A34AlbProfch ,
                                              A1261BarAlbKgmE ,
                                              A1263BarAlbMtrE ,
                                              Integer.valueOf(A1265BarAlbPie) ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              A396EmprCod ,
                                              AV50EmprCod ,
                                              Integer.valueOf(A129BarCod) ,
                                              Integer.valueOf(AV51BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              Byte.valueOf(AV52BarCodReo) ,
                                              A130BarCodPar ,
                                              AV53BarCodPar ,
                                              AV72Consultadeproduccion_albaranesproduccionds_1_emprcod ,
                                              Integer.valueOf(AV73Consultadeproduccion_albaranesproduccionds_2_barcod) ,
                                              Byte.valueOf(AV74Consultadeproduccion_albaranesproduccionds_3_barcodreo) ,
                                              AV75Consultadeproduccion_albaranesproduccionds_4_barcodpar } ,
                                              new int[]{
                                              TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.LONG,
                                              TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                              }
         });
         /* Using cursor H01992 */
         pr_default.execute(0, new Object[] {AV72Consultadeproduccion_albaranesproduccionds_1_emprcod, Integer.valueOf(AV73Consultadeproduccion_albaranesproduccionds_2_barcod), Byte.valueOf(AV74Consultadeproduccion_albaranesproduccionds_3_barcodreo), AV75Consultadeproduccion_albaranesproduccionds_4_barcodpar, AV50EmprCod, Integer.valueOf(AV51BarCod), Byte.valueOf(AV52BarCodReo), AV53BarCodPar, Long.valueOf(AV76Consultadeproduccion_albaranesproduccionds_5_tfalbprocod), Long.valueOf(AV77Consultadeproduccion_albaranesproduccionds_6_tfalbprocod_to), AV78Consultadeproduccion_albaranesproduccionds_7_tfalbprofch, AV79Consultadeproduccion_albaranesproduccionds_8_tfbaralbkgme, AV80Consultadeproduccion_albaranesproduccionds_9_tfbaralbkgme_to, AV81Consultadeproduccion_albaranesproduccionds_10_tfbaralbmtre, AV82Consultadeproduccion_albaranesproduccionds_11_tfbaralbmtre_to, Integer.valueOf(AV83Consultadeproduccion_albaranesproduccionds_12_tfbaralbpie), Integer.valueOf(AV84Consultadeproduccion_albaranesproduccionds_13_tfbaralbpie_to), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_105_idx = 1 ;
         sGXsfl_105_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_105_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1052( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H01992_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
            A129BarCod = H01992_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = H01992_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = H01992_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A130BarCodPar", A130BarCodPar);
            A1265BarAlbPie = H01992_A1265BarAlbPie[0] ;
            A1263BarAlbMtrE = H01992_A1263BarAlbMtrE[0] ;
            A1261BarAlbKgmE = H01992_A1261BarAlbKgmE[0] ;
            A34AlbProfch = H01992_A34AlbProfch[0] ;
            A30AlbProCod = H01992_A30AlbProCod[0] ;
            A34AlbProfch = H01992_A34AlbProfch[0] ;
            e181992 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(105) ;
         wb1990( ) ;
      }
      bGXsfl_105_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1992( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV85Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV85Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTBARALBKGME", GXutil.ltrim( localUtil.ntoc( AV44TotBarAlbKgmE, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARALBKGME", getSecureSignedToken( sPrefix, localUtil.format( AV44TotBarAlbKgmE, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTBARALBMTRE", GXutil.ltrim( localUtil.ntoc( AV46TotBarAlbMtrE, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARALBMTRE", getSecureSignedToken( sPrefix, localUtil.format( AV46TotBarAlbMtrE, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTBARALBPIE", GXutil.ltrim( localUtil.ntoc( AV48TotBarAlbPie, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARALBPIE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV48TotBarAlbPie), "ZZZZZ9")));
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
      AV72Consultadeproduccion_albaranesproduccionds_1_emprcod = AV50EmprCod ;
      AV73Consultadeproduccion_albaranesproduccionds_2_barcod = AV51BarCod ;
      AV74Consultadeproduccion_albaranesproduccionds_3_barcodreo = AV52BarCodReo ;
      AV75Consultadeproduccion_albaranesproduccionds_4_barcodpar = AV53BarCodPar ;
      AV76Consultadeproduccion_albaranesproduccionds_5_tfalbprocod = AV24TFAlbProCod ;
      AV77Consultadeproduccion_albaranesproduccionds_6_tfalbprocod_to = AV25TFAlbProCod_To ;
      AV78Consultadeproduccion_albaranesproduccionds_7_tfalbprofch = AV26TFAlbProfch ;
      AV79Consultadeproduccion_albaranesproduccionds_8_tfbaralbkgme = AV32TFBarAlbKgmE ;
      AV80Consultadeproduccion_albaranesproduccionds_9_tfbaralbkgme_to = AV33TFBarAlbKgmE_To ;
      AV81Consultadeproduccion_albaranesproduccionds_10_tfbaralbmtre = AV34TFBarAlbMtrE ;
      AV82Consultadeproduccion_albaranesproduccionds_11_tfbaralbmtre_to = AV35TFBarAlbMtrE_To ;
      AV83Consultadeproduccion_albaranesproduccionds_12_tfbaralbpie = AV36TFBarAlbPie ;
      AV84Consultadeproduccion_albaranesproduccionds_13_tfbaralbpie_to = AV37TFBarAlbPie_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Long.valueOf(AV76Consultadeproduccion_albaranesproduccionds_5_tfalbprocod) ,
                                           Long.valueOf(AV77Consultadeproduccion_albaranesproduccionds_6_tfalbprocod_to) ,
                                           AV78Consultadeproduccion_albaranesproduccionds_7_tfalbprofch ,
                                           AV79Consultadeproduccion_albaranesproduccionds_8_tfbaralbkgme ,
                                           AV80Consultadeproduccion_albaranesproduccionds_9_tfbaralbkgme_to ,
                                           AV81Consultadeproduccion_albaranesproduccionds_10_tfbaralbmtre ,
                                           AV82Consultadeproduccion_albaranesproduccionds_11_tfbaralbmtre_to ,
                                           Integer.valueOf(AV83Consultadeproduccion_albaranesproduccionds_12_tfbaralbpie) ,
                                           Integer.valueOf(AV84Consultadeproduccion_albaranesproduccionds_13_tfbaralbpie_to) ,
                                           Long.valueOf(A30AlbProCod) ,
                                           A34AlbProfch ,
                                           A1261BarAlbKgmE ,
                                           A1263BarAlbMtrE ,
                                           Integer.valueOf(A1265BarAlbPie) ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           A396EmprCod ,
                                           AV50EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV51BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV52BarCodReo) ,
                                           A130BarCodPar ,
                                           AV53BarCodPar ,
                                           AV72Consultadeproduccion_albaranesproduccionds_1_emprcod ,
                                           Integer.valueOf(AV73Consultadeproduccion_albaranesproduccionds_2_barcod) ,
                                           Byte.valueOf(AV74Consultadeproduccion_albaranesproduccionds_3_barcodreo) ,
                                           AV75Consultadeproduccion_albaranesproduccionds_4_barcodpar } ,
                                           new int[]{
                                           TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.LONG,
                                           TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      /* Using cursor H01993 */
      pr_default.execute(1, new Object[] {AV72Consultadeproduccion_albaranesproduccionds_1_emprcod, Integer.valueOf(AV73Consultadeproduccion_albaranesproduccionds_2_barcod), Byte.valueOf(AV74Consultadeproduccion_albaranesproduccionds_3_barcodreo), AV75Consultadeproduccion_albaranesproduccionds_4_barcodpar, AV50EmprCod, Integer.valueOf(AV51BarCod), Byte.valueOf(AV52BarCodReo), AV53BarCodPar, Long.valueOf(AV76Consultadeproduccion_albaranesproduccionds_5_tfalbprocod), Long.valueOf(AV77Consultadeproduccion_albaranesproduccionds_6_tfalbprocod_to), AV78Consultadeproduccion_albaranesproduccionds_7_tfalbprofch, AV79Consultadeproduccion_albaranesproduccionds_8_tfbaralbkgme, AV80Consultadeproduccion_albaranesproduccionds_9_tfbaralbkgme_to, AV81Consultadeproduccion_albaranesproduccionds_10_tfbaralbmtre, AV82Consultadeproduccion_albaranesproduccionds_11_tfbaralbmtre_to, Integer.valueOf(AV83Consultadeproduccion_albaranesproduccionds_12_tfbaralbpie), Integer.valueOf(AV84Consultadeproduccion_albaranesproduccionds_13_tfbaralbpie_to)});
      GRID_nRecordCount = H01993_AGRID_nRecordCount[0] ;
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
      AV72Consultadeproduccion_albaranesproduccionds_1_emprcod = AV50EmprCod ;
      AV73Consultadeproduccion_albaranesproduccionds_2_barcod = AV51BarCod ;
      AV74Consultadeproduccion_albaranesproduccionds_3_barcodreo = AV52BarCodReo ;
      AV75Consultadeproduccion_albaranesproduccionds_4_barcodpar = AV53BarCodPar ;
      AV76Consultadeproduccion_albaranesproduccionds_5_tfalbprocod = AV24TFAlbProCod ;
      AV77Consultadeproduccion_albaranesproduccionds_6_tfalbprocod_to = AV25TFAlbProCod_To ;
      AV78Consultadeproduccion_albaranesproduccionds_7_tfalbprofch = AV26TFAlbProfch ;
      AV79Consultadeproduccion_albaranesproduccionds_8_tfbaralbkgme = AV32TFBarAlbKgmE ;
      AV80Consultadeproduccion_albaranesproduccionds_9_tfbaralbkgme_to = AV33TFBarAlbKgmE_To ;
      AV81Consultadeproduccion_albaranesproduccionds_10_tfbaralbmtre = AV34TFBarAlbMtrE ;
      AV82Consultadeproduccion_albaranesproduccionds_11_tfbaralbmtre_to = AV35TFBarAlbMtrE_To ;
      AV83Consultadeproduccion_albaranesproduccionds_12_tfbaralbpie = AV36TFBarAlbPie ;
      AV84Consultadeproduccion_albaranesproduccionds_13_tfbaralbpie_to = AV37TFBarAlbPie_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV50EmprCod, AV51BarCod, AV52BarCodReo, AV53BarCodPar, AV24TFAlbProCod, AV25TFAlbProCod_To, AV26TFAlbProfch, AV32TFBarAlbKgmE, AV33TFBarAlbKgmE_To, AV34TFBarAlbMtrE, AV35TFBarAlbMtrE_To, AV36TFBarAlbPie, AV37TFBarAlbPie_To, AV85Pgmname, AV12OrderedBy, AV13OrderedDsc, AV60CliCod, AV61CliNom, AV62PedidoCliente, AV63BarSer, AV64BarSerDsc, AV65BarColNom, AV66BarColNum, AV54BarKgm, AV55BarMtr, AV44TotBarAlbKgmE, AV46TotBarAlbMtrE, AV48TotBarAlbPie, AV72Consultadeproduccion_albaranesproduccionds_1_emprcod, AV73Consultadeproduccion_albaranesproduccionds_2_barcod, AV74Consultadeproduccion_albaranesproduccionds_3_barcodreo, AV75Consultadeproduccion_albaranesproduccionds_4_barcodpar, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV72Consultadeproduccion_albaranesproduccionds_1_emprcod = AV50EmprCod ;
      AV73Consultadeproduccion_albaranesproduccionds_2_barcod = AV51BarCod ;
      AV74Consultadeproduccion_albaranesproduccionds_3_barcodreo = AV52BarCodReo ;
      AV75Consultadeproduccion_albaranesproduccionds_4_barcodpar = AV53BarCodPar ;
      AV76Consultadeproduccion_albaranesproduccionds_5_tfalbprocod = AV24TFAlbProCod ;
      AV77Consultadeproduccion_albaranesproduccionds_6_tfalbprocod_to = AV25TFAlbProCod_To ;
      AV78Consultadeproduccion_albaranesproduccionds_7_tfalbprofch = AV26TFAlbProfch ;
      AV79Consultadeproduccion_albaranesproduccionds_8_tfbaralbkgme = AV32TFBarAlbKgmE ;
      AV80Consultadeproduccion_albaranesproduccionds_9_tfbaralbkgme_to = AV33TFBarAlbKgmE_To ;
      AV81Consultadeproduccion_albaranesproduccionds_10_tfbaralbmtre = AV34TFBarAlbMtrE ;
      AV82Consultadeproduccion_albaranesproduccionds_11_tfbaralbmtre_to = AV35TFBarAlbMtrE_To ;
      AV83Consultadeproduccion_albaranesproduccionds_12_tfbaralbpie = AV36TFBarAlbPie ;
      AV84Consultadeproduccion_albaranesproduccionds_13_tfbaralbpie_to = AV37TFBarAlbPie_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV50EmprCod, AV51BarCod, AV52BarCodReo, AV53BarCodPar, AV24TFAlbProCod, AV25TFAlbProCod_To, AV26TFAlbProfch, AV32TFBarAlbKgmE, AV33TFBarAlbKgmE_To, AV34TFBarAlbMtrE, AV35TFBarAlbMtrE_To, AV36TFBarAlbPie, AV37TFBarAlbPie_To, AV85Pgmname, AV12OrderedBy, AV13OrderedDsc, AV60CliCod, AV61CliNom, AV62PedidoCliente, AV63BarSer, AV64BarSerDsc, AV65BarColNom, AV66BarColNum, AV54BarKgm, AV55BarMtr, AV44TotBarAlbKgmE, AV46TotBarAlbMtrE, AV48TotBarAlbPie, AV72Consultadeproduccion_albaranesproduccionds_1_emprcod, AV73Consultadeproduccion_albaranesproduccionds_2_barcod, AV74Consultadeproduccion_albaranesproduccionds_3_barcodreo, AV75Consultadeproduccion_albaranesproduccionds_4_barcodpar, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV72Consultadeproduccion_albaranesproduccionds_1_emprcod = AV50EmprCod ;
      AV73Consultadeproduccion_albaranesproduccionds_2_barcod = AV51BarCod ;
      AV74Consultadeproduccion_albaranesproduccionds_3_barcodreo = AV52BarCodReo ;
      AV75Consultadeproduccion_albaranesproduccionds_4_barcodpar = AV53BarCodPar ;
      AV76Consultadeproduccion_albaranesproduccionds_5_tfalbprocod = AV24TFAlbProCod ;
      AV77Consultadeproduccion_albaranesproduccionds_6_tfalbprocod_to = AV25TFAlbProCod_To ;
      AV78Consultadeproduccion_albaranesproduccionds_7_tfalbprofch = AV26TFAlbProfch ;
      AV79Consultadeproduccion_albaranesproduccionds_8_tfbaralbkgme = AV32TFBarAlbKgmE ;
      AV80Consultadeproduccion_albaranesproduccionds_9_tfbaralbkgme_to = AV33TFBarAlbKgmE_To ;
      AV81Consultadeproduccion_albaranesproduccionds_10_tfbaralbmtre = AV34TFBarAlbMtrE ;
      AV82Consultadeproduccion_albaranesproduccionds_11_tfbaralbmtre_to = AV35TFBarAlbMtrE_To ;
      AV83Consultadeproduccion_albaranesproduccionds_12_tfbaralbpie = AV36TFBarAlbPie ;
      AV84Consultadeproduccion_albaranesproduccionds_13_tfbaralbpie_to = AV37TFBarAlbPie_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV50EmprCod, AV51BarCod, AV52BarCodReo, AV53BarCodPar, AV24TFAlbProCod, AV25TFAlbProCod_To, AV26TFAlbProfch, AV32TFBarAlbKgmE, AV33TFBarAlbKgmE_To, AV34TFBarAlbMtrE, AV35TFBarAlbMtrE_To, AV36TFBarAlbPie, AV37TFBarAlbPie_To, AV85Pgmname, AV12OrderedBy, AV13OrderedDsc, AV60CliCod, AV61CliNom, AV62PedidoCliente, AV63BarSer, AV64BarSerDsc, AV65BarColNom, AV66BarColNum, AV54BarKgm, AV55BarMtr, AV44TotBarAlbKgmE, AV46TotBarAlbMtrE, AV48TotBarAlbPie, AV72Consultadeproduccion_albaranesproduccionds_1_emprcod, AV73Consultadeproduccion_albaranesproduccionds_2_barcod, AV74Consultadeproduccion_albaranesproduccionds_3_barcodreo, AV75Consultadeproduccion_albaranesproduccionds_4_barcodpar, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV72Consultadeproduccion_albaranesproduccionds_1_emprcod = AV50EmprCod ;
      AV73Consultadeproduccion_albaranesproduccionds_2_barcod = AV51BarCod ;
      AV74Consultadeproduccion_albaranesproduccionds_3_barcodreo = AV52BarCodReo ;
      AV75Consultadeproduccion_albaranesproduccionds_4_barcodpar = AV53BarCodPar ;
      AV76Consultadeproduccion_albaranesproduccionds_5_tfalbprocod = AV24TFAlbProCod ;
      AV77Consultadeproduccion_albaranesproduccionds_6_tfalbprocod_to = AV25TFAlbProCod_To ;
      AV78Consultadeproduccion_albaranesproduccionds_7_tfalbprofch = AV26TFAlbProfch ;
      AV79Consultadeproduccion_albaranesproduccionds_8_tfbaralbkgme = AV32TFBarAlbKgmE ;
      AV80Consultadeproduccion_albaranesproduccionds_9_tfbaralbkgme_to = AV33TFBarAlbKgmE_To ;
      AV81Consultadeproduccion_albaranesproduccionds_10_tfbaralbmtre = AV34TFBarAlbMtrE ;
      AV82Consultadeproduccion_albaranesproduccionds_11_tfbaralbmtre_to = AV35TFBarAlbMtrE_To ;
      AV83Consultadeproduccion_albaranesproduccionds_12_tfbaralbpie = AV36TFBarAlbPie ;
      AV84Consultadeproduccion_albaranesproduccionds_13_tfbaralbpie_to = AV37TFBarAlbPie_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV50EmprCod, AV51BarCod, AV52BarCodReo, AV53BarCodPar, AV24TFAlbProCod, AV25TFAlbProCod_To, AV26TFAlbProfch, AV32TFBarAlbKgmE, AV33TFBarAlbKgmE_To, AV34TFBarAlbMtrE, AV35TFBarAlbMtrE_To, AV36TFBarAlbPie, AV37TFBarAlbPie_To, AV85Pgmname, AV12OrderedBy, AV13OrderedDsc, AV60CliCod, AV61CliNom, AV62PedidoCliente, AV63BarSer, AV64BarSerDsc, AV65BarColNom, AV66BarColNum, AV54BarKgm, AV55BarMtr, AV44TotBarAlbKgmE, AV46TotBarAlbMtrE, AV48TotBarAlbPie, AV72Consultadeproduccion_albaranesproduccionds_1_emprcod, AV73Consultadeproduccion_albaranesproduccionds_2_barcod, AV74Consultadeproduccion_albaranesproduccionds_3_barcodreo, AV75Consultadeproduccion_albaranesproduccionds_4_barcodpar, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV72Consultadeproduccion_albaranesproduccionds_1_emprcod = AV50EmprCod ;
      AV73Consultadeproduccion_albaranesproduccionds_2_barcod = AV51BarCod ;
      AV74Consultadeproduccion_albaranesproduccionds_3_barcodreo = AV52BarCodReo ;
      AV75Consultadeproduccion_albaranesproduccionds_4_barcodpar = AV53BarCodPar ;
      AV76Consultadeproduccion_albaranesproduccionds_5_tfalbprocod = AV24TFAlbProCod ;
      AV77Consultadeproduccion_albaranesproduccionds_6_tfalbprocod_to = AV25TFAlbProCod_To ;
      AV78Consultadeproduccion_albaranesproduccionds_7_tfalbprofch = AV26TFAlbProfch ;
      AV79Consultadeproduccion_albaranesproduccionds_8_tfbaralbkgme = AV32TFBarAlbKgmE ;
      AV80Consultadeproduccion_albaranesproduccionds_9_tfbaralbkgme_to = AV33TFBarAlbKgmE_To ;
      AV81Consultadeproduccion_albaranesproduccionds_10_tfbaralbmtre = AV34TFBarAlbMtrE ;
      AV82Consultadeproduccion_albaranesproduccionds_11_tfbaralbmtre_to = AV35TFBarAlbMtrE_To ;
      AV83Consultadeproduccion_albaranesproduccionds_12_tfbaralbpie = AV36TFBarAlbPie ;
      AV84Consultadeproduccion_albaranesproduccionds_13_tfbaralbpie_to = AV37TFBarAlbPie_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV50EmprCod, AV51BarCod, AV52BarCodReo, AV53BarCodPar, AV24TFAlbProCod, AV25TFAlbProCod_To, AV26TFAlbProfch, AV32TFBarAlbKgmE, AV33TFBarAlbKgmE_To, AV34TFBarAlbMtrE, AV35TFBarAlbMtrE_To, AV36TFBarAlbPie, AV37TFBarAlbPie_To, AV85Pgmname, AV12OrderedBy, AV13OrderedDsc, AV60CliCod, AV61CliNom, AV62PedidoCliente, AV63BarSer, AV64BarSerDsc, AV65BarColNom, AV66BarColNum, AV54BarKgm, AV55BarMtr, AV44TotBarAlbKgmE, AV46TotBarAlbMtrE, AV48TotBarAlbPie, AV72Consultadeproduccion_albaranesproduccionds_1_emprcod, AV73Consultadeproduccion_albaranesproduccionds_2_barcod, AV74Consultadeproduccion_albaranesproduccionds_3_barcodreo, AV75Consultadeproduccion_albaranesproduccionds_4_barcodpar, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV85Pgmname = "ConsultadeProduccion_AlbaranesProduccion" ;
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
      edtavBarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm_Enabled), 5, 0), true);
      edtavMermak_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMermak_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMermak_Enabled), 5, 0), true);
      edtavBarmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmtr_Enabled), 5, 0), true);
      edtavMermam_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMermam_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMermam_Enabled), 5, 0), true);
      edtavTotvaluebaralbkgme_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebaralbkgme_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebaralbkgme_Enabled), 5, 0), true);
      edtavTotvaluebaralbmtre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebaralbmtre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebaralbmtre_Enabled), 5, 0), true);
      edtavTotvaluebaralbpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebaralbpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebaralbpie_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1990( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e161992 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV38DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_105 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_105"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV40GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV41GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV50EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV50EmprCod") ;
         wcpOAV51BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV51BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV52BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV52BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV53BarCodPar = httpContext.cgiGet( sPrefix+"wcpOAV53BarCodPar") ;
         wcpOAV60CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV60CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV61CliNom = httpContext.cgiGet( sPrefix+"wcpOAV61CliNom") ;
         wcpOAV62PedidoCliente = httpContext.cgiGet( sPrefix+"wcpOAV62PedidoCliente") ;
         wcpOAV63BarSer = httpContext.cgiGet( sPrefix+"wcpOAV63BarSer") ;
         wcpOAV64BarSerDsc = httpContext.cgiGet( sPrefix+"wcpOAV64BarSerDsc") ;
         wcpOAV65BarColNom = httpContext.cgiGet( sPrefix+"wcpOAV65BarColNom") ;
         wcpOAV66BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV66BarColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV54BarKgm = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV54BarKgm")) ;
         wcpOAV55BarMtr = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV55BarMtr")) ;
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
         Ddo_grid_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Includesortasc = httpContext.cgiGet( sPrefix+"DDO_GRID_Includesortasc") ;
         Ddo_grid_Sortedstatus = httpContext.cgiGet( sPrefix+"DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( sPrefix+"DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( sPrefix+"DDO_GRID_Filtertype") ;
         Ddo_grid_Filterisrange = httpContext.cgiGet( sPrefix+"DDO_GRID_Filterisrange") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedcolumn") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_get") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavMermak_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavMermak_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMERMAK");
            GX_FocusControl = edtavMermak_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV56MermaK = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56MermaK", GXutil.ltrimstr( AV56MermaK, 6, 2));
         }
         else
         {
            AV56MermaK = localUtil.ctond( httpContext.cgiGet( edtavMermak_Internalname)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56MermaK", GXutil.ltrimstr( AV56MermaK, 6, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavMermam_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavMermam_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMERMAM");
            GX_FocusControl = edtavMermam_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV57MermaM = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57MermaM", GXutil.ltrimstr( AV57MermaM, 6, 2));
         }
         else
         {
            AV57MermaM = localUtil.ctond( httpContext.cgiGet( edtavMermam_Internalname)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57MermaM", GXutil.ltrimstr( AV57MermaM, 6, 2));
         }
         AV45TotValueBarAlbKgmE = httpContext.cgiGet( edtavTotvaluebaralbkgme_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TotValueBarAlbKgmE", AV45TotValueBarAlbKgmE);
         AV47TotValueBarAlbMtrE = httpContext.cgiGet( edtavTotvaluebaralbmtre_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TotValueBarAlbMtrE", AV47TotValueBarAlbMtrE);
         AV49TotValueBarAlbPie = httpContext.cgiGet( edtavTotvaluebaralbpie_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TotValueBarAlbPie", AV49TotValueBarAlbPie);
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A130BarCodPar", A130BarCodPar);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_albprofchauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_ALBPROFCHAUXDATE");
            GX_FocusControl = edtavDdo_albprofchauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV28DDO_AlbProfchAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28DDO_AlbProfchAuxDate", localUtil.format(AV28DDO_AlbProfchAuxDate, "99/99/99"));
         }
         else
         {
            AV28DDO_AlbProfchAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_albprofchauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28DDO_AlbProfchAuxDate", localUtil.format(AV28DDO_AlbProfchAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ConsultadeProduccion_AlbaranesProduccion");
         A396EmprCod = httpContext.cgiGet( edtEmprCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         forbiddenHiddens.add("EmprCod", GXutil.rtrim( localUtil.format( A396EmprCod, "@!")));
         A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         forbiddenHiddens.add("BarCod", localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"));
         A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         forbiddenHiddens.add("BarCodReo", localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"));
         A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A130BarCodPar", A130BarCodPar);
         forbiddenHiddens.add("BarCodPar", GXutil.rtrim( localUtil.format( A130BarCodPar, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("consultadeproduccion_albaranesproduccion:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
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
      e161992 ();
      if (returnInSub) return;
   }

   public void e161992( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV69Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      consultadeproduccion_albaranesproduccion_impl.this.GXt_char1 = GXv_char2[0] ;
      AV69Station = GXt_char1 ;
      GXv_char2[0] = AV50EmprCod ;
      GXv_char3[0] = AV70Emprnom ;
      GXv_char4[0] = AV71Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV69Station, GXv_char2, GXv_char3, GXv_char4) ;
      consultadeproduccion_albaranesproduccion_impl.this.AV50EmprCod = GXv_char2[0] ;
      consultadeproduccion_albaranesproduccion_impl.this.AV70Emprnom = GXv_char3[0] ;
      consultadeproduccion_albaranesproduccion_impl.this.AV71Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50EmprCod", AV50EmprCod);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV38DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV38DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e171992( )
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
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S152 ();
      if (returnInSub) return;
      AV40GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40GridCurrentPage), 10, 0));
      AV41GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41GridPageCount), 10, 0));
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S162 ();
      if (returnInSub) return;
      AV72Consultadeproduccion_albaranesproduccionds_1_emprcod = AV50EmprCod ;
      AV73Consultadeproduccion_albaranesproduccionds_2_barcod = AV51BarCod ;
      AV74Consultadeproduccion_albaranesproduccionds_3_barcodreo = AV52BarCodReo ;
      AV75Consultadeproduccion_albaranesproduccionds_4_barcodpar = AV53BarCodPar ;
      AV76Consultadeproduccion_albaranesproduccionds_5_tfalbprocod = AV24TFAlbProCod ;
      AV77Consultadeproduccion_albaranesproduccionds_6_tfalbprocod_to = AV25TFAlbProCod_To ;
      AV78Consultadeproduccion_albaranesproduccionds_7_tfalbprofch = AV26TFAlbProfch ;
      AV79Consultadeproduccion_albaranesproduccionds_8_tfbaralbkgme = AV32TFBarAlbKgmE ;
      AV80Consultadeproduccion_albaranesproduccionds_9_tfbaralbkgme_to = AV33TFBarAlbKgmE_To ;
      AV81Consultadeproduccion_albaranesproduccionds_10_tfbaralbmtre = AV34TFBarAlbMtrE ;
      AV82Consultadeproduccion_albaranesproduccionds_11_tfbaralbmtre_to = AV35TFBarAlbMtrE_To ;
      AV83Consultadeproduccion_albaranesproduccionds_12_tfbaralbpie = AV36TFBarAlbPie ;
      AV84Consultadeproduccion_albaranesproduccionds_13_tfbaralbpie_to = AV37TFBarAlbPie_To ;
      /*  Sending Event outputs  */
   }

   public void e111992( )
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
         AV39PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV39PageToGo) ;
      }
   }

   public void e121992( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e131992( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProCod") == 0 )
         {
            AV24TFAlbProCod = GXutil.lval( Ddo_grid_Filteredtext_get) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24TFAlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24TFAlbProCod), 10, 0));
            AV25TFAlbProCod_To = GXutil.lval( Ddo_grid_Filteredtextto_get) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25TFAlbProCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25TFAlbProCod_To), 10, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProfch") == 0 )
         {
            AV26TFAlbProfch = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFAlbProfch", localUtil.format(AV26TFAlbProfch, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAlbKgmE") == 0 )
         {
            AV32TFBarAlbKgmE = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFBarAlbKgmE", GXutil.ltrimstr( AV32TFBarAlbKgmE, 9, 2));
            AV33TFBarAlbKgmE_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFBarAlbKgmE_To", GXutil.ltrimstr( AV33TFBarAlbKgmE_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAlbMtrE") == 0 )
         {
            AV34TFBarAlbMtrE = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFBarAlbMtrE", GXutil.ltrimstr( AV34TFBarAlbMtrE, 9, 2));
            AV35TFBarAlbMtrE_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFBarAlbMtrE_To", GXutil.ltrimstr( AV35TFBarAlbMtrE_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAlbPie") == 0 )
         {
            AV36TFBarAlbPie = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFBarAlbPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFBarAlbPie), 6, 0));
            AV37TFBarAlbPie_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFBarAlbPie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFBarAlbPie_To), 6, 0));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e181992( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
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
   }

   public void e141992( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      AV58Var_Hdr = AV50EmprCod + GXutil.str( AV51BarCod, 8, 0) + GXutil.str( AV52BarCodReo, 1, 0) + AV53BarCodPar ;
      AV59WebSession.setValue("&Var_Hdr", AV58Var_Hdr);
      GXv_char4[0] = AV42ExcelFilename ;
      GXv_char3[0] = AV43ErrorMessage ;
      new app.consultadeproduccion_albaranesproduccionexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      consultadeproduccion_albaranesproduccion_impl.this.AV42ExcelFilename = GXv_char4[0] ;
      consultadeproduccion_albaranesproduccion_impl.this.AV43ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV42ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV42ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV43ErrorMessage);
      }
   }

   public void e151992( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      AV58Var_Hdr = AV50EmprCod + GXutil.str( AV51BarCod, 8, 0) + GXutil.str( AV52BarCodReo, 1, 0) + AV53BarCodPar ;
      AV59WebSession.setValue("&Var_Hdr", AV58Var_Hdr);
      callWebObject(formatLink("app.consultadeproduccion_albaranesproduccionexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void S132( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV12OrderedBy, 4, 0))+":"+(AV13OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV20Session.getValue(AV85Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV85Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV20Session.getValue(AV85Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S132 ();
      if (returnInSub) return;
      AV86GXV1 = 1 ;
      while ( AV86GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV86GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROCOD") == 0 )
         {
            AV24TFAlbProCod = GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24TFAlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24TFAlbProCod), 10, 0));
            AV25TFAlbProCod_To = GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25TFAlbProCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25TFAlbProCod_To), 10, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROFCH") == 0 )
         {
            AV26TFAlbProfch = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFAlbProfch", localUtil.format(AV26TFAlbProfch, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBKGME") == 0 )
         {
            AV32TFBarAlbKgmE = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFBarAlbKgmE", GXutil.ltrimstr( AV32TFBarAlbKgmE, 9, 2));
            AV33TFBarAlbKgmE_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFBarAlbKgmE_To", GXutil.ltrimstr( AV33TFBarAlbKgmE_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBMTRE") == 0 )
         {
            AV34TFBarAlbMtrE = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFBarAlbMtrE", GXutil.ltrimstr( AV34TFBarAlbMtrE, 9, 2));
            AV35TFBarAlbMtrE_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFBarAlbMtrE_To", GXutil.ltrimstr( AV35TFBarAlbMtrE_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBPIE") == 0 )
         {
            AV36TFBarAlbPie = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFBarAlbPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFBarAlbPie), 6, 0));
            AV37TFBarAlbPie_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFBarAlbPie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFBarAlbPie_To), 6, 0));
         }
         AV86GXV1 = (int)(AV86GXV1+1) ;
      }
      Ddo_grid_Filteredtext_set = ((0==AV24TFAlbProCod) ? "" : GXutil.str( AV24TFAlbProCod, 10, 0))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV26TFAlbProfch)) ? "" : localUtil.dtoc( AV26TFAlbProfch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV32TFBarAlbKgmE)==0) ? "" : GXutil.str( AV32TFBarAlbKgmE, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV34TFBarAlbMtrE)==0) ? "" : GXutil.str( AV34TFBarAlbMtrE, 9, 2))+"|"+((0==AV36TFBarAlbPie) ? "" : GXutil.str( AV36TFBarAlbPie, 6, 0)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV25TFAlbProCod_To) ? "" : GXutil.str( AV25TFAlbProCod_To, 10, 0))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV33TFBarAlbKgmE_To)==0) ? "" : GXutil.str( AV33TFBarAlbKgmE_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV35TFBarAlbMtrE_To)==0) ? "" : GXutil.str( AV35TFBarAlbMtrE_To, 9, 2))+"|"+((0==AV37TFBarAlbPie_To) ? "" : GXutil.str( AV37TFBarAlbPie_To, 6, 0)) ;
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
      AV10GridState.fromxml(AV20Session.getValue(AV85Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState8[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState8, "TFALBPROCOD", "", !((0==AV24TFAlbProCod)&&(0==AV25TFAlbProCod_To)), (short)(0), GXutil.trim( GXutil.str( AV24TFAlbProCod, 10, 0)), GXutil.trim( GXutil.str( AV25TFAlbProCod_To, 10, 0))) ;
      AV10GridState = GXv_SdtWWPGridState8[0] ;
      GXv_SdtWWPGridState8[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState8, "TFALBPROFCH", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV26TFAlbProfch)), (short)(0), GXutil.trim( localUtil.dtoc( AV26TFAlbProfch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState8[0] ;
      GXv_SdtWWPGridState8[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState8, "TFBARALBKGME", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV32TFBarAlbKgmE)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV33TFBarAlbKgmE_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV32TFBarAlbKgmE, 9, 2)), GXutil.trim( GXutil.str( AV33TFBarAlbKgmE_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState8[0] ;
      GXv_SdtWWPGridState8[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState8, "TFBARALBMTRE", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV34TFBarAlbMtrE)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV35TFBarAlbMtrE_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV34TFBarAlbMtrE, 9, 2)), GXutil.trim( GXutil.str( AV35TFBarAlbMtrE_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState8[0] ;
      GXv_SdtWWPGridState8[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState8, "TFBARALBPIE", "", !((0==AV36TFBarAlbPie)&&(0==AV37TFBarAlbPie_To)), (short)(0), GXutil.trim( GXutil.str( AV36TFBarAlbPie, 6, 0)), GXutil.trim( GXutil.str( AV37TFBarAlbPie_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState8[0] ;
      if ( ! (GXutil.strcmp("", AV50EmprCod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV50EmprCod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV51BarCod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV51BarCod, 8, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV52BarCodReo) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODREO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV52BarCodReo, 1, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV53BarCodPar)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODPAR" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV53BarCodPar );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV60CliCod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV60CliCod, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV61CliNom)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLINOM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV61CliNom );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV62PedidoCliente)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PEDIDOCLIENTE" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV62PedidoCliente );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV63BarSer)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARSER" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV63BarSer );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV64BarSerDsc)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARSERDSC" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV64BarSerDsc );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV65BarColNom)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOLNOM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV65BarColNom );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV66BarColNum) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOLNUM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV66BarColNum, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54BarKgm)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARKGM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV54BarKgm, 9, 2) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55BarMtr)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARMTR" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV55BarMtr, 9, 2) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV85Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV85Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "ALBBAR" );
      AV9TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "EmprCod" );
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( AV50EmprCod );
      AV8TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV9TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "BarCod" );
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( GXutil.str( AV51BarCod, 8, 0) );
      AV8TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV9TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "BarCodReo" );
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( GXutil.str( AV52BarCodReo, 1, 0) );
      AV8TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV9TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "BarCodPar" );
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( AV53BarCodPar );
      AV8TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV20Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S152( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV44TotBarAlbKgmE = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TotBarAlbKgmE", GXutil.ltrimstr( AV44TotBarAlbKgmE, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARALBKGME", getSecureSignedToken( sPrefix, localUtil.format( AV44TotBarAlbKgmE, "ZZZZZ9.99")));
      AV46TotBarAlbMtrE = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TotBarAlbMtrE", GXutil.ltrimstr( AV46TotBarAlbMtrE, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARALBMTRE", getSecureSignedToken( sPrefix, localUtil.format( AV46TotBarAlbMtrE, "ZZZZZ9.99")));
      AV48TotBarAlbPie = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TotBarAlbPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TotBarAlbPie), 18, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARALBPIE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV48TotBarAlbPie), "ZZZZZ9")));
      AV56MermaK = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56MermaK", GXutil.ltrimstr( AV56MermaK, 6, 2));
      AV57MermaM = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57MermaM", GXutil.ltrimstr( AV57MermaM, 6, 2));
   }

   public void S162( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      AV72Consultadeproduccion_albaranesproduccionds_1_emprcod = AV50EmprCod ;
      AV73Consultadeproduccion_albaranesproduccionds_2_barcod = AV51BarCod ;
      AV74Consultadeproduccion_albaranesproduccionds_3_barcodreo = AV52BarCodReo ;
      AV75Consultadeproduccion_albaranesproduccionds_4_barcodpar = AV53BarCodPar ;
      AV76Consultadeproduccion_albaranesproduccionds_5_tfalbprocod = AV24TFAlbProCod ;
      AV77Consultadeproduccion_albaranesproduccionds_6_tfalbprocod_to = AV25TFAlbProCod_To ;
      AV78Consultadeproduccion_albaranesproduccionds_7_tfalbprofch = AV26TFAlbProfch ;
      AV79Consultadeproduccion_albaranesproduccionds_8_tfbaralbkgme = AV32TFBarAlbKgmE ;
      AV80Consultadeproduccion_albaranesproduccionds_9_tfbaralbkgme_to = AV33TFBarAlbKgmE_To ;
      AV81Consultadeproduccion_albaranesproduccionds_10_tfbaralbmtre = AV34TFBarAlbMtrE ;
      AV82Consultadeproduccion_albaranesproduccionds_11_tfbaralbmtre_to = AV35TFBarAlbMtrE_To ;
      AV83Consultadeproduccion_albaranesproduccionds_12_tfbaralbpie = AV36TFBarAlbPie ;
      AV84Consultadeproduccion_albaranesproduccionds_13_tfbaralbpie_to = AV37TFBarAlbPie_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Long.valueOf(AV76Consultadeproduccion_albaranesproduccionds_5_tfalbprocod) ,
                                           Long.valueOf(AV77Consultadeproduccion_albaranesproduccionds_6_tfalbprocod_to) ,
                                           AV78Consultadeproduccion_albaranesproduccionds_7_tfalbprofch ,
                                           AV79Consultadeproduccion_albaranesproduccionds_8_tfbaralbkgme ,
                                           AV80Consultadeproduccion_albaranesproduccionds_9_tfbaralbkgme_to ,
                                           AV81Consultadeproduccion_albaranesproduccionds_10_tfbaralbmtre ,
                                           AV82Consultadeproduccion_albaranesproduccionds_11_tfbaralbmtre_to ,
                                           Integer.valueOf(AV83Consultadeproduccion_albaranesproduccionds_12_tfbaralbpie) ,
                                           Integer.valueOf(AV84Consultadeproduccion_albaranesproduccionds_13_tfbaralbpie_to) ,
                                           Long.valueOf(A30AlbProCod) ,
                                           A34AlbProfch ,
                                           A1261BarAlbKgmE ,
                                           A1263BarAlbMtrE ,
                                           Integer.valueOf(A1265BarAlbPie) ,
                                           A396EmprCod ,
                                           AV50EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV51BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV52BarCodReo) ,
                                           A130BarCodPar ,
                                           AV53BarCodPar ,
                                           AV72Consultadeproduccion_albaranesproduccionds_1_emprcod ,
                                           Integer.valueOf(AV73Consultadeproduccion_albaranesproduccionds_2_barcod) ,
                                           Byte.valueOf(AV74Consultadeproduccion_albaranesproduccionds_3_barcodreo) ,
                                           AV75Consultadeproduccion_albaranesproduccionds_4_barcodpar } ,
                                           new int[]{
                                           TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.LONG,
                                           TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      /* Using cursor H01994 */
      pr_default.execute(2, new Object[] {AV72Consultadeproduccion_albaranesproduccionds_1_emprcod, Integer.valueOf(AV73Consultadeproduccion_albaranesproduccionds_2_barcod), Byte.valueOf(AV74Consultadeproduccion_albaranesproduccionds_3_barcodreo), AV75Consultadeproduccion_albaranesproduccionds_4_barcodpar, AV50EmprCod, Integer.valueOf(AV51BarCod), Byte.valueOf(AV52BarCodReo), AV53BarCodPar, Long.valueOf(AV76Consultadeproduccion_albaranesproduccionds_5_tfalbprocod), Long.valueOf(AV77Consultadeproduccion_albaranesproduccionds_6_tfalbprocod_to), AV78Consultadeproduccion_albaranesproduccionds_7_tfalbprofch, AV79Consultadeproduccion_albaranesproduccionds_8_tfbaralbkgme, AV80Consultadeproduccion_albaranesproduccionds_9_tfbaralbkgme_to, AV81Consultadeproduccion_albaranesproduccionds_10_tfbaralbmtre, AV82Consultadeproduccion_albaranesproduccionds_11_tfbaralbmtre_to, Integer.valueOf(AV83Consultadeproduccion_albaranesproduccionds_12_tfbaralbpie), Integer.valueOf(AV84Consultadeproduccion_albaranesproduccionds_13_tfbaralbpie_to)});
      nGXsfl_105_idx = 1 ;
      sGXsfl_105_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_105_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1052( ) ;
      GRID_nEOF = (byte)(0) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      while ( ( (pr_default.getStatus(2) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
      {
         A1265BarAlbPie = H01994_A1265BarAlbPie[0] ;
         A1263BarAlbMtrE = H01994_A1263BarAlbMtrE[0] ;
         A1261BarAlbKgmE = H01994_A1261BarAlbKgmE[0] ;
         A34AlbProfch = H01994_A34AlbProfch[0] ;
         A30AlbProCod = H01994_A30AlbProCod[0] ;
         A130BarCodPar = H01994_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A130BarCodPar", A130BarCodPar);
         A132BarCodReo = H01994_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A129BarCod = H01994_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A396EmprCod = H01994_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         A34AlbProfch = H01994_A34AlbProfch[0] ;
         AV44TotBarAlbKgmE = A1261BarAlbKgmE.add(AV44TotBarAlbKgmE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TotBarAlbKgmE", GXutil.ltrimstr( AV44TotBarAlbKgmE, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARALBKGME", getSecureSignedToken( sPrefix, localUtil.format( AV44TotBarAlbKgmE, "ZZZZZ9.99")));
         AV46TotBarAlbMtrE = A1263BarAlbMtrE.add(AV46TotBarAlbMtrE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TotBarAlbMtrE", GXutil.ltrimstr( AV46TotBarAlbMtrE, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARALBMTRE", getSecureSignedToken( sPrefix, localUtil.format( AV46TotBarAlbMtrE, "ZZZZZ9.99")));
         AV48TotBarAlbPie = (long)(A1265BarAlbPie+AV48TotBarAlbPie) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TotBarAlbPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TotBarAlbPie), 18, 0));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARALBPIE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV48TotBarAlbPie), "ZZZZZ9")));
         pr_default.readNext(2);
      }
      GRID_nEOF = (byte)(((pr_default.getStatus(2) == 101) ? 1 : 0)) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      pr_default.close(2);
      AV45TotValueBarAlbKgmE = localUtil.format( AV44TotBarAlbKgmE, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TotValueBarAlbKgmE", AV45TotValueBarAlbKgmE);
      AV47TotValueBarAlbMtrE = localUtil.format( AV46TotBarAlbMtrE, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TotValueBarAlbMtrE", AV47TotValueBarAlbMtrE);
      AV49TotValueBarAlbPie = localUtil.format( DecimalUtil.doubleToDec(AV48TotBarAlbPie), "ZZZZZ9") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TotValueBarAlbPie", AV49TotValueBarAlbPie);
      AV56MermaK = ((AV54BarKgm.doubleValue()>0) ? ((AV54BarKgm.subtract(AV44TotBarAlbKgmE)).divide(AV54BarKgm, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56MermaK", GXutil.ltrimstr( AV56MermaK, 6, 2));
      AV57MermaM = ((AV55BarMtr.doubleValue()>0) ? ((AV55BarMtr.subtract(AV46TotBarAlbMtrE)).divide(AV55BarMtr, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57MermaM", GXutil.ltrimstr( AV57MermaM, 6, 2));
   }

   public void wb_table2_113_1992( boolean wbgen )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluebaralbkgme_Internalname, httpContext.getMessage( "Tot Value Bar Alb Kgm E", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'" + sPrefix + "',false,'" + sGXsfl_105_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluebaralbkgme_Internalname, AV45TotValueBarAlbKgmE, GXutil.rtrim( localUtil.format( AV45TotValueBarAlbKgmE, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,119);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluebaralbkgme_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluebaralbkgme_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ConsultadeProduccion_AlbaranesProduccion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluebaralbmtre_Internalname, httpContext.getMessage( "Tot Value Bar Alb Mtr E", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 122,'" + sPrefix + "',false,'" + sGXsfl_105_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluebaralbmtre_Internalname, AV47TotValueBarAlbMtrE, GXutil.rtrim( localUtil.format( AV47TotValueBarAlbMtrE, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,122);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluebaralbmtre_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluebaralbmtre_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ConsultadeProduccion_AlbaranesProduccion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluebaralbpie_Internalname, httpContext.getMessage( "Tot Value Bar Alb Pie", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 125,'" + sPrefix + "',false,'" + sGXsfl_105_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluebaralbpie_Internalname, AV49TotValueBarAlbPie, GXutil.rtrim( localUtil.format( AV49TotValueBarAlbPie, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,125);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluebaralbpie_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluebaralbpie_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ConsultadeProduccion_AlbaranesProduccion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_113_1992e( true) ;
      }
      else
      {
         wb_table2_113_1992e( false) ;
      }
   }

   public void wb_table1_74_1992( boolean wbgen )
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
         wb_table1_74_1992e( true) ;
      }
      else
      {
         wb_table1_74_1992e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV50EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50EmprCod", AV50EmprCod);
      AV51BarCod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51BarCod), 8, 0));
      AV52BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52BarCodReo", GXutil.str( AV52BarCodReo, 1, 0));
      AV53BarCodPar = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53BarCodPar", AV53BarCodPar);
      AV60CliCod = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60CliCod), 6, 0));
      AV61CliNom = (String)getParm(obj,5,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61CliNom", AV61CliNom);
      AV62PedidoCliente = (String)getParm(obj,6,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62PedidoCliente", AV62PedidoCliente);
      AV63BarSer = (String)getParm(obj,7,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63BarSer", AV63BarSer);
      AV64BarSerDsc = (String)getParm(obj,8,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64BarSerDsc", AV64BarSerDsc);
      AV65BarColNom = (String)getParm(obj,9,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65BarColNom", AV65BarColNom);
      AV66BarColNum = ((Number) GXutil.testNumericType( getParm(obj,10,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66BarColNum), 6, 0));
      AV54BarKgm = (java.math.BigDecimal)getParm(obj,11,TypeConstants.DECIMAL) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54BarKgm", GXutil.ltrimstr( AV54BarKgm, 9, 2));
      AV55BarMtr = (java.math.BigDecimal)getParm(obj,12,TypeConstants.DECIMAL) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55BarMtr", GXutil.ltrimstr( AV55BarMtr, 9, 2));
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
      pa1992( ) ;
      ws1992( ) ;
      we1992( ) ;
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
      sCtrlAV50EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV51BarCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV52BarCodReo = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV53BarCodPar = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV60CliCod = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV61CliNom = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV62PedidoCliente = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV63BarSer = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV64BarSerDsc = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV65BarColNom = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV66BarColNum = (String)getParm(obj,10,TypeConstants.STRING) ;
      sCtrlAV54BarKgm = (String)getParm(obj,11,TypeConstants.STRING) ;
      sCtrlAV55BarMtr = (String)getParm(obj,12,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1992( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "consultadeproduccion_albaranesproduccion", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1992( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV50EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50EmprCod", AV50EmprCod);
         AV51BarCod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51BarCod), 8, 0));
         AV52BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52BarCodReo", GXutil.str( AV52BarCodReo, 1, 0));
         AV53BarCodPar = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53BarCodPar", AV53BarCodPar);
         AV60CliCod = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60CliCod), 6, 0));
         AV61CliNom = (String)getParm(obj,7,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61CliNom", AV61CliNom);
         AV62PedidoCliente = (String)getParm(obj,8,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62PedidoCliente", AV62PedidoCliente);
         AV63BarSer = (String)getParm(obj,9,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63BarSer", AV63BarSer);
         AV64BarSerDsc = (String)getParm(obj,10,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64BarSerDsc", AV64BarSerDsc);
         AV65BarColNom = (String)getParm(obj,11,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65BarColNom", AV65BarColNom);
         AV66BarColNum = ((Number) GXutil.testNumericType( getParm(obj,12,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66BarColNum), 6, 0));
         AV54BarKgm = (java.math.BigDecimal)getParm(obj,13,TypeConstants.DECIMAL) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54BarKgm", GXutil.ltrimstr( AV54BarKgm, 9, 2));
         AV55BarMtr = (java.math.BigDecimal)getParm(obj,14,TypeConstants.DECIMAL) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55BarMtr", GXutil.ltrimstr( AV55BarMtr, 9, 2));
      }
      wcpOAV50EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV50EmprCod") ;
      wcpOAV51BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV51BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV52BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV52BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV53BarCodPar = httpContext.cgiGet( sPrefix+"wcpOAV53BarCodPar") ;
      wcpOAV60CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV60CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV61CliNom = httpContext.cgiGet( sPrefix+"wcpOAV61CliNom") ;
      wcpOAV62PedidoCliente = httpContext.cgiGet( sPrefix+"wcpOAV62PedidoCliente") ;
      wcpOAV63BarSer = httpContext.cgiGet( sPrefix+"wcpOAV63BarSer") ;
      wcpOAV64BarSerDsc = httpContext.cgiGet( sPrefix+"wcpOAV64BarSerDsc") ;
      wcpOAV65BarColNom = httpContext.cgiGet( sPrefix+"wcpOAV65BarColNom") ;
      wcpOAV66BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV66BarColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV54BarKgm = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV54BarKgm")) ;
      wcpOAV55BarMtr = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV55BarMtr")) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV50EmprCod, wcpOAV50EmprCod) != 0 ) || ( AV51BarCod != wcpOAV51BarCod ) || ( AV52BarCodReo != wcpOAV52BarCodReo ) || ( GXutil.strcmp(AV53BarCodPar, wcpOAV53BarCodPar) != 0 ) || ( AV60CliCod != wcpOAV60CliCod ) || ( GXutil.strcmp(AV61CliNom, wcpOAV61CliNom) != 0 ) || ( GXutil.strcmp(AV62PedidoCliente, wcpOAV62PedidoCliente) != 0 ) || ( GXutil.strcmp(AV63BarSer, wcpOAV63BarSer) != 0 ) || ( GXutil.strcmp(AV64BarSerDsc, wcpOAV64BarSerDsc) != 0 ) || ( GXutil.strcmp(AV65BarColNom, wcpOAV65BarColNom) != 0 ) || ( AV66BarColNum != wcpOAV66BarColNum ) || ( DecimalUtil.compareTo(AV54BarKgm, wcpOAV54BarKgm) != 0 ) || ( DecimalUtil.compareTo(AV55BarMtr, wcpOAV55BarMtr) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV50EmprCod = AV50EmprCod ;
      wcpOAV51BarCod = AV51BarCod ;
      wcpOAV52BarCodReo = AV52BarCodReo ;
      wcpOAV53BarCodPar = AV53BarCodPar ;
      wcpOAV60CliCod = AV60CliCod ;
      wcpOAV61CliNom = AV61CliNom ;
      wcpOAV62PedidoCliente = AV62PedidoCliente ;
      wcpOAV63BarSer = AV63BarSer ;
      wcpOAV64BarSerDsc = AV64BarSerDsc ;
      wcpOAV65BarColNom = AV65BarColNom ;
      wcpOAV66BarColNum = AV66BarColNum ;
      wcpOAV54BarKgm = AV54BarKgm ;
      wcpOAV55BarMtr = AV55BarMtr ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV50EmprCod = httpContext.cgiGet( sPrefix+"AV50EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV50EmprCod) > 0 )
      {
         AV50EmprCod = httpContext.cgiGet( sCtrlAV50EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50EmprCod", AV50EmprCod);
      }
      else
      {
         AV50EmprCod = httpContext.cgiGet( sPrefix+"AV50EmprCod_PARM") ;
      }
      sCtrlAV51BarCod = httpContext.cgiGet( sPrefix+"AV51BarCod_CTRL") ;
      if ( GXutil.len( sCtrlAV51BarCod) > 0 )
      {
         AV51BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV51BarCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51BarCod), 8, 0));
      }
      else
      {
         AV51BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV51BarCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV52BarCodReo = httpContext.cgiGet( sPrefix+"AV52BarCodReo_CTRL") ;
      if ( GXutil.len( sCtrlAV52BarCodReo) > 0 )
      {
         AV52BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV52BarCodReo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52BarCodReo", GXutil.str( AV52BarCodReo, 1, 0));
      }
      else
      {
         AV52BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV52BarCodReo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV53BarCodPar = httpContext.cgiGet( sPrefix+"AV53BarCodPar_CTRL") ;
      if ( GXutil.len( sCtrlAV53BarCodPar) > 0 )
      {
         AV53BarCodPar = httpContext.cgiGet( sCtrlAV53BarCodPar) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53BarCodPar", AV53BarCodPar);
      }
      else
      {
         AV53BarCodPar = httpContext.cgiGet( sPrefix+"AV53BarCodPar_PARM") ;
      }
      sCtrlAV60CliCod = httpContext.cgiGet( sPrefix+"AV60CliCod_CTRL") ;
      if ( GXutil.len( sCtrlAV60CliCod) > 0 )
      {
         AV60CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV60CliCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60CliCod), 6, 0));
      }
      else
      {
         AV60CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV60CliCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV61CliNom = httpContext.cgiGet( sPrefix+"AV61CliNom_CTRL") ;
      if ( GXutil.len( sCtrlAV61CliNom) > 0 )
      {
         AV61CliNom = httpContext.cgiGet( sCtrlAV61CliNom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61CliNom", AV61CliNom);
      }
      else
      {
         AV61CliNom = httpContext.cgiGet( sPrefix+"AV61CliNom_PARM") ;
      }
      sCtrlAV62PedidoCliente = httpContext.cgiGet( sPrefix+"AV62PedidoCliente_CTRL") ;
      if ( GXutil.len( sCtrlAV62PedidoCliente) > 0 )
      {
         AV62PedidoCliente = httpContext.cgiGet( sCtrlAV62PedidoCliente) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62PedidoCliente", AV62PedidoCliente);
      }
      else
      {
         AV62PedidoCliente = httpContext.cgiGet( sPrefix+"AV62PedidoCliente_PARM") ;
      }
      sCtrlAV63BarSer = httpContext.cgiGet( sPrefix+"AV63BarSer_CTRL") ;
      if ( GXutil.len( sCtrlAV63BarSer) > 0 )
      {
         AV63BarSer = httpContext.cgiGet( sCtrlAV63BarSer) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63BarSer", AV63BarSer);
      }
      else
      {
         AV63BarSer = httpContext.cgiGet( sPrefix+"AV63BarSer_PARM") ;
      }
      sCtrlAV64BarSerDsc = httpContext.cgiGet( sPrefix+"AV64BarSerDsc_CTRL") ;
      if ( GXutil.len( sCtrlAV64BarSerDsc) > 0 )
      {
         AV64BarSerDsc = httpContext.cgiGet( sCtrlAV64BarSerDsc) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64BarSerDsc", AV64BarSerDsc);
      }
      else
      {
         AV64BarSerDsc = httpContext.cgiGet( sPrefix+"AV64BarSerDsc_PARM") ;
      }
      sCtrlAV65BarColNom = httpContext.cgiGet( sPrefix+"AV65BarColNom_CTRL") ;
      if ( GXutil.len( sCtrlAV65BarColNom) > 0 )
      {
         AV65BarColNom = httpContext.cgiGet( sCtrlAV65BarColNom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65BarColNom", AV65BarColNom);
      }
      else
      {
         AV65BarColNom = httpContext.cgiGet( sPrefix+"AV65BarColNom_PARM") ;
      }
      sCtrlAV66BarColNum = httpContext.cgiGet( sPrefix+"AV66BarColNum_CTRL") ;
      if ( GXutil.len( sCtrlAV66BarColNum) > 0 )
      {
         AV66BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV66BarColNum), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66BarColNum), 6, 0));
      }
      else
      {
         AV66BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV66BarColNum_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV54BarKgm = httpContext.cgiGet( sPrefix+"AV54BarKgm_CTRL") ;
      if ( GXutil.len( sCtrlAV54BarKgm) > 0 )
      {
         AV54BarKgm = localUtil.ctond( httpContext.cgiGet( sCtrlAV54BarKgm)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54BarKgm", GXutil.ltrimstr( AV54BarKgm, 9, 2));
      }
      else
      {
         AV54BarKgm = localUtil.ctond( httpContext.cgiGet( sPrefix+"AV54BarKgm_PARM")) ;
      }
      sCtrlAV55BarMtr = httpContext.cgiGet( sPrefix+"AV55BarMtr_CTRL") ;
      if ( GXutil.len( sCtrlAV55BarMtr) > 0 )
      {
         AV55BarMtr = localUtil.ctond( httpContext.cgiGet( sCtrlAV55BarMtr)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55BarMtr", GXutil.ltrimstr( AV55BarMtr, 9, 2));
      }
      else
      {
         AV55BarMtr = localUtil.ctond( httpContext.cgiGet( sPrefix+"AV55BarMtr_PARM")) ;
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
      pa1992( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1992( ) ;
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
      ws1992( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV50EmprCod_PARM", GXutil.rtrim( AV50EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV50EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV50EmprCod_CTRL", GXutil.rtrim( sCtrlAV50EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV51BarCod_PARM", GXutil.ltrim( localUtil.ntoc( AV51BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV51BarCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV51BarCod_CTRL", GXutil.rtrim( sCtrlAV51BarCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV52BarCodReo_PARM", GXutil.ltrim( localUtil.ntoc( AV52BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV52BarCodReo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV52BarCodReo_CTRL", GXutil.rtrim( sCtrlAV52BarCodReo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV53BarCodPar_PARM", GXutil.rtrim( AV53BarCodPar));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV53BarCodPar)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV53BarCodPar_CTRL", GXutil.rtrim( sCtrlAV53BarCodPar));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV60CliCod_PARM", GXutil.ltrim( localUtil.ntoc( AV60CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV60CliCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV60CliCod_CTRL", GXutil.rtrim( sCtrlAV60CliCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV61CliNom_PARM", GXutil.rtrim( AV61CliNom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV61CliNom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV61CliNom_CTRL", GXutil.rtrim( sCtrlAV61CliNom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV62PedidoCliente_PARM", GXutil.rtrim( AV62PedidoCliente));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV62PedidoCliente)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV62PedidoCliente_CTRL", GXutil.rtrim( sCtrlAV62PedidoCliente));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV63BarSer_PARM", GXutil.rtrim( AV63BarSer));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV63BarSer)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV63BarSer_CTRL", GXutil.rtrim( sCtrlAV63BarSer));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV64BarSerDsc_PARM", GXutil.rtrim( AV64BarSerDsc));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV64BarSerDsc)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV64BarSerDsc_CTRL", GXutil.rtrim( sCtrlAV64BarSerDsc));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV65BarColNom_PARM", GXutil.rtrim( AV65BarColNom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV65BarColNom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV65BarColNom_CTRL", GXutil.rtrim( sCtrlAV65BarColNom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV66BarColNum_PARM", GXutil.ltrim( localUtil.ntoc( AV66BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV66BarColNum)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV66BarColNum_CTRL", GXutil.rtrim( sCtrlAV66BarColNum));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV54BarKgm_PARM", GXutil.ltrim( localUtil.ntoc( AV54BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV54BarKgm)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV54BarKgm_CTRL", GXutil.rtrim( sCtrlAV54BarKgm));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV55BarMtr_PARM", GXutil.ltrim( localUtil.ntoc( AV55BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV55BarMtr)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV55BarMtr_CTRL", GXutil.rtrim( sCtrlAV55BarMtr));
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
      we1992( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115562543", true, true);
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
      httpContext.AddJavascriptSource("consultadeproduccion_albaranesproduccion.js", "?202682115562544", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_1052( )
   {
      edtAlbProCod_Internalname = sPrefix+"ALBPROCOD_"+sGXsfl_105_idx ;
      edtAlbProfch_Internalname = sPrefix+"ALBPROFCH_"+sGXsfl_105_idx ;
      edtBarAlbKgmE_Internalname = sPrefix+"BARALBKGME_"+sGXsfl_105_idx ;
      edtBarAlbMtrE_Internalname = sPrefix+"BARALBMTRE_"+sGXsfl_105_idx ;
      edtBarAlbPie_Internalname = sPrefix+"BARALBPIE_"+sGXsfl_105_idx ;
   }

   public void subsflControlProps_fel_1052( )
   {
      edtAlbProCod_Internalname = sPrefix+"ALBPROCOD_"+sGXsfl_105_fel_idx ;
      edtAlbProfch_Internalname = sPrefix+"ALBPROFCH_"+sGXsfl_105_fel_idx ;
      edtBarAlbKgmE_Internalname = sPrefix+"BARALBKGME_"+sGXsfl_105_fel_idx ;
      edtBarAlbMtrE_Internalname = sPrefix+"BARALBMTRE_"+sGXsfl_105_fel_idx ;
      edtBarAlbPie_Internalname = sPrefix+"BARALBPIE_"+sGXsfl_105_fel_idx ;
   }

   public void sendrow_1052( )
   {
      subsflControlProps_1052( ) ;
      wb1990( ) ;
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
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProCod_Internalname,GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbProCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(105),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProfch_Internalname,localUtil.format(A34AlbProfch, "99/99/99"),localUtil.format( A34AlbProfch, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbProfch_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(105),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbKgmE_Internalname,GXutil.ltrim( localUtil.ntoc( A1261BarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1261BarAlbKgmE, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbKgmE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(105),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbMtrE_Internalname,GXutil.ltrim( localUtil.ntoc( A1263BarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1263BarAlbMtrE, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbMtrE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(105),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbPie_Internalname,GXutil.ltrim( localUtil.ntoc( A1265BarAlbPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1265BarAlbPie), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbPie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(105),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1992( ) ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Documento", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos Ent", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros Ent", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Piezas Ent", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A34AlbProfch, "99/99/99"));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1261BarAlbKgmE, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1263BarAlbMtrE, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1265BarAlbPie, (byte)(6), (byte)(0), ".", "")));
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
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtavBarkgm_Internalname = sPrefix+"vBARKGM" ;
      edtavMermak_Internalname = sPrefix+"vMERMAK" ;
      edtavBarmtr_Internalname = sPrefix+"vBARMTR" ;
      edtavMermam_Internalname = sPrefix+"vMERMAM" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      edtAlbProCod_Internalname = sPrefix+"ALBPROCOD" ;
      edtAlbProfch_Internalname = sPrefix+"ALBPROFCH" ;
      edtBarAlbKgmE_Internalname = sPrefix+"BARALBKGME" ;
      edtBarAlbMtrE_Internalname = sPrefix+"BARALBMTRE" ;
      edtBarAlbPie_Internalname = sPrefix+"BARALBPIE" ;
      edtavTotvaluebaralbkgme_Internalname = sPrefix+"vTOTVALUEBARALBKGME" ;
      edtavTotvaluebaralbmtre_Internalname = sPrefix+"vTOTVALUEBARALBMTRE" ;
      edtavTotvaluebaralbpie_Internalname = sPrefix+"vTOTVALUEBARALBPIE" ;
      tblGridtabletotalizer_Internalname = sPrefix+"GRIDTABLETOTALIZER" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      edtEmprCod_Internalname = sPrefix+"EMPRCOD" ;
      edtBarCod_Internalname = sPrefix+"BARCOD" ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO" ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      edtavDdo_albprofchauxdate_Internalname = sPrefix+"vDDO_ALBPROFCHAUXDATE" ;
      divDdo_albprofchauxdates_Internalname = sPrefix+"DDO_ALBPROFCHAUXDATES" ;
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
      edtBarAlbPie_Jsonclick = "" ;
      edtBarAlbMtrE_Jsonclick = "" ;
      edtBarAlbKgmE_Jsonclick = "" ;
      edtAlbProfch_Jsonclick = "" ;
      edtAlbProCod_Jsonclick = "" ;
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavTotvaluebaralbpie_Jsonclick = "" ;
      edtavTotvaluebaralbpie_Enabled = 1 ;
      edtavTotvaluebaralbmtre_Jsonclick = "" ;
      edtavTotvaluebaralbmtre_Enabled = 1 ;
      edtavTotvaluebaralbkgme_Jsonclick = "" ;
      edtavTotvaluebaralbkgme_Enabled = 1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_albprofchauxdate_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Visible = 1 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Visible = 1 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Visible = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Visible = 1 ;
      edtavMermam_Jsonclick = "" ;
      edtavMermam_Enabled = 1 ;
      edtavBarmtr_Jsonclick = "" ;
      edtavBarmtr_Enabled = 0 ;
      edtavMermak_Jsonclick = "" ;
      edtavMermak_Enabled = 1 ;
      edtavBarkgm_Jsonclick = "" ;
      edtavBarkgm_Enabled = 0 ;
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
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_grid_Filterisrange = "T||T|T|T" ;
      Ddo_grid_Filtertype = "Numeric|Date|Numeric|Numeric|Numeric" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6" ;
      Ddo_grid_Columnids = "0:AlbProCod|1:AlbProfch|2:BarAlbKgmE|3:BarAlbMtrE|4:BarAlbPie" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV72Consultadeproduccion_albaranesproduccionds_1_emprcod',fld:'vCONSULTADEPRODUCCION_ALBARANESPRODUCCIONDS_1_EMPRCOD',pic:'@!'},{av:'AV73Consultadeproduccion_albaranesproduccionds_2_barcod',fld:'vCONSULTADEPRODUCCION_ALBARANESPRODUCCIONDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV74Consultadeproduccion_albaranesproduccionds_3_barcodreo',fld:'vCONSULTADEPRODUCCION_ALBARANESPRODUCCIONDS_3_BARCODREO',pic:'9'},{av:'AV75Consultadeproduccion_albaranesproduccionds_4_barcodpar',fld:'vCONSULTADEPRODUCCION_ALBARANESPRODUCCIONDS_4_BARCODPAR',pic:''},{av:'sPrefix'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV50EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV51BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV52BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV53BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV24TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV25TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV26TFAlbProfch',fld:'vTFALBPROFCH',pic:''},{av:'AV32TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV33TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV34TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV35TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV36TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV37TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV85Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV60CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV61CliNom',fld:'vCLINOM',pic:''},{av:'AV62PedidoCliente',fld:'vPEDIDOCLIENTE',pic:''},{av:'AV63BarSer',fld:'vBARSER',pic:''},{av:'AV64BarSerDsc',fld:'vBARSERDSC',pic:''},{av:'AV65BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV66BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV54BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV55BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'AV44TotBarAlbKgmE',fld:'vTOTBARALBKGME',pic:'ZZZZZ9.99',hsh:true},{av:'AV46TotBarAlbMtrE',fld:'vTOTBARALBMTRE',pic:'ZZZZZ9.99',hsh:true},{av:'AV48TotBarAlbPie',fld:'vTOTBARALBPIE',pic:'ZZZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A1261BarAlbKgmE',fld:'BARALBKGME',pic:'ZZZZZ9.99'},{av:'A1263BarAlbMtrE',fld:'BARALBMTRE',pic:'ZZZZZ9.99'},{av:'A1265BarAlbPie',fld:'BARALBPIE',pic:'ZZZZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV40GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV41GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV44TotBarAlbKgmE',fld:'vTOTBARALBKGME',pic:'ZZZZZ9.99',hsh:true},{av:'AV46TotBarAlbMtrE',fld:'vTOTBARALBMTRE',pic:'ZZZZZ9.99',hsh:true},{av:'AV48TotBarAlbPie',fld:'vTOTBARALBPIE',pic:'ZZZZZ9',hsh:true},{av:'AV56MermaK',fld:'vMERMAK',pic:'ZZ9.99'},{av:'AV57MermaM',fld:'vMERMAM',pic:'ZZ9.99'},{av:'AV45TotValueBarAlbKgmE',fld:'vTOTVALUEBARALBKGME',pic:''},{av:'AV47TotValueBarAlbMtrE',fld:'vTOTVALUEBARALBMTRE',pic:''},{av:'AV49TotValueBarAlbPie',fld:'vTOTVALUEBARALBPIE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e111992',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV50EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV51BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV52BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV53BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV24TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV25TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV26TFAlbProfch',fld:'vTFALBPROFCH',pic:''},{av:'AV32TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV33TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV34TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV35TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV36TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV37TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV85Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV60CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV61CliNom',fld:'vCLINOM',pic:''},{av:'AV62PedidoCliente',fld:'vPEDIDOCLIENTE',pic:''},{av:'AV63BarSer',fld:'vBARSER',pic:''},{av:'AV64BarSerDsc',fld:'vBARSERDSC',pic:''},{av:'AV65BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV66BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV54BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV55BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'AV44TotBarAlbKgmE',fld:'vTOTBARALBKGME',pic:'ZZZZZ9.99',hsh:true},{av:'AV46TotBarAlbMtrE',fld:'vTOTBARALBMTRE',pic:'ZZZZZ9.99',hsh:true},{av:'AV48TotBarAlbPie',fld:'vTOTBARALBPIE',pic:'ZZZZZ9',hsh:true},{av:'AV72Consultadeproduccion_albaranesproduccionds_1_emprcod',fld:'vCONSULTADEPRODUCCION_ALBARANESPRODUCCIONDS_1_EMPRCOD',pic:'@!'},{av:'AV73Consultadeproduccion_albaranesproduccionds_2_barcod',fld:'vCONSULTADEPRODUCCION_ALBARANESPRODUCCIONDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV74Consultadeproduccion_albaranesproduccionds_3_barcodreo',fld:'vCONSULTADEPRODUCCION_ALBARANESPRODUCCIONDS_3_BARCODREO',pic:'9'},{av:'AV75Consultadeproduccion_albaranesproduccionds_4_barcodpar',fld:'vCONSULTADEPRODUCCION_ALBARANESPRODUCCIONDS_4_BARCODPAR',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e121992',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV50EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV51BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV52BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV53BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV24TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV25TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV26TFAlbProfch',fld:'vTFALBPROFCH',pic:''},{av:'AV32TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV33TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV34TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV35TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV36TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV37TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV85Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV60CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV61CliNom',fld:'vCLINOM',pic:''},{av:'AV62PedidoCliente',fld:'vPEDIDOCLIENTE',pic:''},{av:'AV63BarSer',fld:'vBARSER',pic:''},{av:'AV64BarSerDsc',fld:'vBARSERDSC',pic:''},{av:'AV65BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV66BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV54BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV55BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'AV44TotBarAlbKgmE',fld:'vTOTBARALBKGME',pic:'ZZZZZ9.99',hsh:true},{av:'AV46TotBarAlbMtrE',fld:'vTOTBARALBMTRE',pic:'ZZZZZ9.99',hsh:true},{av:'AV48TotBarAlbPie',fld:'vTOTBARALBPIE',pic:'ZZZZZ9',hsh:true},{av:'AV72Consultadeproduccion_albaranesproduccionds_1_emprcod',fld:'vCONSULTADEPRODUCCION_ALBARANESPRODUCCIONDS_1_EMPRCOD',pic:'@!'},{av:'AV73Consultadeproduccion_albaranesproduccionds_2_barcod',fld:'vCONSULTADEPRODUCCION_ALBARANESPRODUCCIONDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV74Consultadeproduccion_albaranesproduccionds_3_barcodreo',fld:'vCONSULTADEPRODUCCION_ALBARANESPRODUCCIONDS_3_BARCODREO',pic:'9'},{av:'AV75Consultadeproduccion_albaranesproduccionds_4_barcodpar',fld:'vCONSULTADEPRODUCCION_ALBARANESPRODUCCIONDS_4_BARCODPAR',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e131992',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV50EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV51BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV52BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV53BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV24TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV25TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV26TFAlbProfch',fld:'vTFALBPROFCH',pic:''},{av:'AV32TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV33TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV34TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV35TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV36TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV37TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV85Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV60CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV61CliNom',fld:'vCLINOM',pic:''},{av:'AV62PedidoCliente',fld:'vPEDIDOCLIENTE',pic:''},{av:'AV63BarSer',fld:'vBARSER',pic:''},{av:'AV64BarSerDsc',fld:'vBARSERDSC',pic:''},{av:'AV65BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV66BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV54BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV55BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'AV44TotBarAlbKgmE',fld:'vTOTBARALBKGME',pic:'ZZZZZ9.99',hsh:true},{av:'AV46TotBarAlbMtrE',fld:'vTOTBARALBMTRE',pic:'ZZZZZ9.99',hsh:true},{av:'AV48TotBarAlbPie',fld:'vTOTBARALBPIE',pic:'ZZZZZ9',hsh:true},{av:'AV72Consultadeproduccion_albaranesproduccionds_1_emprcod',fld:'vCONSULTADEPRODUCCION_ALBARANESPRODUCCIONDS_1_EMPRCOD',pic:'@!'},{av:'AV73Consultadeproduccion_albaranesproduccionds_2_barcod',fld:'vCONSULTADEPRODUCCION_ALBARANESPRODUCCIONDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV74Consultadeproduccion_albaranesproduccionds_3_barcodreo',fld:'vCONSULTADEPRODUCCION_ALBARANESPRODUCCIONDS_3_BARCODREO',pic:'9'},{av:'AV75Consultadeproduccion_albaranesproduccionds_4_barcodpar',fld:'vCONSULTADEPRODUCCION_ALBARANESPRODUCCIONDS_4_BARCODPAR',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV24TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV25TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV26TFAlbProfch',fld:'vTFALBPROFCH',pic:''},{av:'AV32TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV33TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV34TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV35TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV36TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV37TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e181992',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e141992',iparms:[{av:'AV50EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV51BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV52BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV53BarCodPar',fld:'vBARCODPAR',pic:''}]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e151992',iparms:[{av:'AV50EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV51BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV52BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV53BarCodPar',fld:'vBARCODPAR',pic:''}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_ALBPROCOD","{handler:'valid_Albprocod',iparms:[]");
      setEventMetadata("VALID_ALBPROCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Baralbpie',iparms:[]");
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
      wcpOAV50EmprCod = "" ;
      wcpOAV53BarCodPar = "" ;
      wcpOAV61CliNom = "" ;
      wcpOAV62PedidoCliente = "" ;
      wcpOAV63BarSer = "" ;
      wcpOAV64BarSerDsc = "" ;
      wcpOAV65BarColNom = "" ;
      wcpOAV54BarKgm = DecimalUtil.ZERO ;
      wcpOAV55BarMtr = DecimalUtil.ZERO ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV50EmprCod = "" ;
      AV53BarCodPar = "" ;
      AV61CliNom = "" ;
      AV62PedidoCliente = "" ;
      AV63BarSer = "" ;
      AV64BarSerDsc = "" ;
      AV65BarColNom = "" ;
      AV54BarKgm = DecimalUtil.ZERO ;
      AV55BarMtr = DecimalUtil.ZERO ;
      AV26TFAlbProfch = GXutil.nullDate() ;
      AV32TFBarAlbKgmE = DecimalUtil.ZERO ;
      AV33TFBarAlbKgmE_To = DecimalUtil.ZERO ;
      AV34TFBarAlbMtrE = DecimalUtil.ZERO ;
      AV35TFBarAlbMtrE_To = DecimalUtil.ZERO ;
      AV85Pgmname = "" ;
      AV44TotBarAlbKgmE = DecimalUtil.ZERO ;
      AV46TotBarAlbMtrE = DecimalUtil.ZERO ;
      AV72Consultadeproduccion_albaranesproduccionds_1_emprcod = "" ;
      AV75Consultadeproduccion_albaranesproduccionds_4_barcodpar = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV38DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      AV56MermaK = DecimalUtil.ZERO ;
      AV57MermaM = DecimalUtil.ZERO ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV28DDO_AlbProfchAuxDate = GXutil.nullDate() ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      AV78Consultadeproduccion_albaranesproduccionds_7_tfalbprofch = GXutil.nullDate() ;
      AV79Consultadeproduccion_albaranesproduccionds_8_tfbaralbkgme = DecimalUtil.ZERO ;
      AV80Consultadeproduccion_albaranesproduccionds_9_tfbaralbkgme_to = DecimalUtil.ZERO ;
      AV81Consultadeproduccion_albaranesproduccionds_10_tfbaralbmtre = DecimalUtil.ZERO ;
      AV82Consultadeproduccion_albaranesproduccionds_11_tfbaralbmtre_to = DecimalUtil.ZERO ;
      H01992_A396EmprCod = new String[] {""} ;
      H01992_A129BarCod = new int[1] ;
      H01992_A132BarCodReo = new byte[1] ;
      H01992_A130BarCodPar = new String[] {""} ;
      H01992_A1265BarAlbPie = new int[1] ;
      H01992_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01992_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01992_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      H01992_A30AlbProCod = new long[1] ;
      H01993_AGRID_nRecordCount = new long[1] ;
      AV45TotValueBarAlbKgmE = "" ;
      AV47TotValueBarAlbMtrE = "" ;
      AV49TotValueBarAlbPie = "" ;
      hsh = "" ;
      AV69Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV70Emprnom = "" ;
      AV71Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV58Var_Hdr = "" ;
      AV59WebSession = httpContext.getWebSession();
      AV42ExcelFilename = "" ;
      GXv_char4 = new String[1] ;
      AV43ErrorMessage = "" ;
      GXv_char3 = new String[1] ;
      AV20Session = httpContext.getWebSession();
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXv_SdtWWPGridState8 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      AV9TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      H01994_A1265BarAlbPie = new int[1] ;
      H01994_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01994_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01994_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      H01994_A30AlbProCod = new long[1] ;
      H01994_A130BarCodPar = new String[] {""} ;
      H01994_A132BarCodReo = new byte[1] ;
      H01994_A129BarCod = new int[1] ;
      H01994_A396EmprCod = new String[] {""} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV50EmprCod = "" ;
      sCtrlAV51BarCod = "" ;
      sCtrlAV52BarCodReo = "" ;
      sCtrlAV53BarCodPar = "" ;
      sCtrlAV60CliCod = "" ;
      sCtrlAV61CliNom = "" ;
      sCtrlAV62PedidoCliente = "" ;
      sCtrlAV63BarSer = "" ;
      sCtrlAV64BarSerDsc = "" ;
      sCtrlAV65BarColNom = "" ;
      sCtrlAV66BarColNum = "" ;
      sCtrlAV54BarKgm = "" ;
      sCtrlAV55BarMtr = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.consultadeproduccion_albaranesproduccion__default(),
         new Object[] {
             new Object[] {
            H01992_A396EmprCod, H01992_A129BarCod, H01992_A132BarCodReo, H01992_A130BarCodPar, H01992_A1265BarAlbPie, H01992_A1263BarAlbMtrE, H01992_A1261BarAlbKgmE, H01992_A34AlbProfch, H01992_A30AlbProCod
            }
            , new Object[] {
            H01993_AGRID_nRecordCount
            }
            , new Object[] {
            H01994_A1265BarAlbPie, H01994_A1263BarAlbMtrE, H01994_A1261BarAlbKgmE, H01994_A34AlbProfch, H01994_A30AlbProCod, H01994_A130BarCodPar, H01994_A132BarCodReo, H01994_A129BarCod, H01994_A396EmprCod
            }
         }
      );
      AV85Pgmname = "ConsultadeProduccion_AlbaranesProduccion" ;
      /* GeneXus formulas. */
      AV85Pgmname = "ConsultadeProduccion_AlbaranesProduccion" ;
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
      edtavBarkgm_Enabled = 0 ;
      edtavMermak_Enabled = 0 ;
      edtavBarmtr_Enabled = 0 ;
      edtavMermam_Enabled = 0 ;
      edtavTotvaluebaralbkgme_Enabled = 0 ;
      edtavTotvaluebaralbmtre_Enabled = 0 ;
      edtavTotvaluebaralbpie_Enabled = 0 ;
   }

   private byte wcpOAV52BarCodReo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV52BarCodReo ;
   private byte AV74Consultadeproduccion_albaranesproduccionds_3_barcodreo ;
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
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV12OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV51BarCod ;
   private int wcpOAV60CliCod ;
   private int wcpOAV66BarColNum ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_105 ;
   private int AV51BarCod ;
   private int AV60CliCod ;
   private int AV66BarColNum ;
   private int nGXsfl_105_idx=1 ;
   private int AV36TFBarAlbPie ;
   private int AV37TFBarAlbPie_To ;
   private int AV73Consultadeproduccion_albaranesproduccionds_2_barcod ;
   private int A129BarCod ;
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
   private int edtavBarkgm_Enabled ;
   private int edtavMermak_Enabled ;
   private int edtavBarmtr_Enabled ;
   private int edtavMermam_Enabled ;
   private int edtEmprCod_Visible ;
   private int edtBarCod_Visible ;
   private int edtBarCodReo_Visible ;
   private int edtBarCodPar_Visible ;
   private int A1265BarAlbPie ;
   private int subGrid_Islastpage ;
   private int edtavTotvaluebaralbkgme_Enabled ;
   private int edtavTotvaluebaralbmtre_Enabled ;
   private int edtavTotvaluebaralbpie_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV83Consultadeproduccion_albaranesproduccionds_12_tfbaralbpie ;
   private int AV84Consultadeproduccion_albaranesproduccionds_13_tfbaralbpie_to ;
   private int AV39PageToGo ;
   private int AV86GXV1 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV24TFAlbProCod ;
   private long AV25TFAlbProCod_To ;
   private long AV48TotBarAlbPie ;
   private long AV40GridCurrentPage ;
   private long AV41GridPageCount ;
   private long A30AlbProCod ;
   private long GRID_nCurrentRecord ;
   private long AV76Consultadeproduccion_albaranesproduccionds_5_tfalbprocod ;
   private long AV77Consultadeproduccion_albaranesproduccionds_6_tfalbprocod_to ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal wcpOAV54BarKgm ;
   private java.math.BigDecimal wcpOAV55BarMtr ;
   private java.math.BigDecimal AV54BarKgm ;
   private java.math.BigDecimal AV55BarMtr ;
   private java.math.BigDecimal AV32TFBarAlbKgmE ;
   private java.math.BigDecimal AV33TFBarAlbKgmE_To ;
   private java.math.BigDecimal AV34TFBarAlbMtrE ;
   private java.math.BigDecimal AV35TFBarAlbMtrE_To ;
   private java.math.BigDecimal AV44TotBarAlbKgmE ;
   private java.math.BigDecimal AV46TotBarAlbMtrE ;
   private java.math.BigDecimal AV56MermaK ;
   private java.math.BigDecimal AV57MermaM ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal AV79Consultadeproduccion_albaranesproduccionds_8_tfbaralbkgme ;
   private java.math.BigDecimal AV80Consultadeproduccion_albaranesproduccionds_9_tfbaralbkgme_to ;
   private java.math.BigDecimal AV81Consultadeproduccion_albaranesproduccionds_10_tfbaralbmtre ;
   private java.math.BigDecimal AV82Consultadeproduccion_albaranesproduccionds_11_tfbaralbmtre_to ;
   private String wcpOAV50EmprCod ;
   private String wcpOAV53BarCodPar ;
   private String wcpOAV61CliNom ;
   private String wcpOAV62PedidoCliente ;
   private String wcpOAV63BarSer ;
   private String wcpOAV64BarSerDsc ;
   private String wcpOAV65BarColNom ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV50EmprCod ;
   private String AV53BarCodPar ;
   private String AV61CliNom ;
   private String AV62PedidoCliente ;
   private String AV63BarSer ;
   private String AV64BarSerDsc ;
   private String AV65BarColNom ;
   private String sGXsfl_105_idx="0001" ;
   private String AV85Pgmname ;
   private String AV72Consultadeproduccion_albaranesproduccionds_1_emprcod ;
   private String AV75Consultadeproduccion_albaranesproduccionds_4_barcodpar ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
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
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Includesortasc ;
   private String Ddo_grid_Sortedstatus ;
   private String Ddo_grid_Includefilter ;
   private String Ddo_grid_Filtertype ;
   private String Ddo_grid_Filterisrange ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
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
   private String ClassString ;
   private String StyleString ;
   private String bttBtnexport_Internalname ;
   private String bttBtnexport_Jsonclick ;
   private String bttBtnexportcsv_Internalname ;
   private String bttBtnexportcsv_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String edtavBarkgm_Internalname ;
   private String edtavBarkgm_Jsonclick ;
   private String edtavMermak_Internalname ;
   private String edtavMermak_Jsonclick ;
   private String edtavBarmtr_Internalname ;
   private String edtavBarmtr_Jsonclick ;
   private String edtavMermam_Internalname ;
   private String edtavMermam_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_albprofchauxdates_Internalname ;
   private String edtavDdo_albprofchauxdate_Internalname ;
   private String edtavDdo_albprofchauxdate_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtAlbProCod_Internalname ;
   private String edtAlbProfch_Internalname ;
   private String edtBarAlbKgmE_Internalname ;
   private String edtBarAlbMtrE_Internalname ;
   private String edtBarAlbPie_Internalname ;
   private String edtavTotvaluebaralbkgme_Internalname ;
   private String edtavTotvaluebaralbmtre_Internalname ;
   private String edtavTotvaluebaralbpie_Internalname ;
   private String scmdbuf ;
   private String hsh ;
   private String AV69Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV70Emprnom ;
   private String AV71Usurcod ;
   private String AV58Var_Hdr ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvaluebaralbkgme_Jsonclick ;
   private String edtavTotvaluebaralbmtre_Jsonclick ;
   private String edtavTotvaluebaralbpie_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String sCtrlAV50EmprCod ;
   private String sCtrlAV51BarCod ;
   private String sCtrlAV52BarCodReo ;
   private String sCtrlAV53BarCodPar ;
   private String sCtrlAV60CliCod ;
   private String sCtrlAV61CliNom ;
   private String sCtrlAV62PedidoCliente ;
   private String sCtrlAV63BarSer ;
   private String sCtrlAV64BarSerDsc ;
   private String sCtrlAV65BarColNom ;
   private String sCtrlAV66BarColNum ;
   private String sCtrlAV54BarKgm ;
   private String sCtrlAV55BarMtr ;
   private String sGXsfl_105_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtAlbProCod_Jsonclick ;
   private String edtAlbProfch_Jsonclick ;
   private String edtBarAlbKgmE_Jsonclick ;
   private String edtBarAlbMtrE_Jsonclick ;
   private String edtBarAlbPie_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV26TFAlbProfch ;
   private java.util.Date AV28DDO_AlbProfchAuxDate ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date AV78Consultadeproduccion_albaranesproduccionds_7_tfalbprofch ;
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
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_105_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV45TotValueBarAlbKgmE ;
   private String AV47TotValueBarAlbMtrE ;
   private String AV49TotValueBarAlbPie ;
   private String AV42ExcelFilename ;
   private String AV43ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV20Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] H01992_A396EmprCod ;
   private int[] H01992_A129BarCod ;
   private byte[] H01992_A132BarCodReo ;
   private String[] H01992_A130BarCodPar ;
   private int[] H01992_A1265BarAlbPie ;
   private java.math.BigDecimal[] H01992_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] H01992_A1261BarAlbKgmE ;
   private java.util.Date[] H01992_A34AlbProfch ;
   private long[] H01992_A30AlbProCod ;
   private long[] H01993_AGRID_nRecordCount ;
   private int[] H01994_A1265BarAlbPie ;
   private java.math.BigDecimal[] H01994_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] H01994_A1261BarAlbKgmE ;
   private java.util.Date[] H01994_A34AlbProfch ;
   private long[] H01994_A30AlbProCod ;
   private String[] H01994_A130BarCodPar ;
   private byte[] H01994_A132BarCodReo ;
   private int[] H01994_A129BarCod ;
   private String[] H01994_A396EmprCod ;
   private com.genexus.webpanels.WebSession AV59WebSession ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV9TrnContextAtt ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState8[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV38DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class consultadeproduccion_albaranesproduccion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01992( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          long AV76Consultadeproduccion_albaranesproduccionds_5_tfalbprocod ,
                                          long AV77Consultadeproduccion_albaranesproduccionds_6_tfalbprocod_to ,
                                          java.util.Date AV78Consultadeproduccion_albaranesproduccionds_7_tfalbprofch ,
                                          java.math.BigDecimal AV79Consultadeproduccion_albaranesproduccionds_8_tfbaralbkgme ,
                                          java.math.BigDecimal AV80Consultadeproduccion_albaranesproduccionds_9_tfbaralbkgme_to ,
                                          java.math.BigDecimal AV81Consultadeproduccion_albaranesproduccionds_10_tfbaralbmtre ,
                                          java.math.BigDecimal AV82Consultadeproduccion_albaranesproduccionds_11_tfbaralbmtre_to ,
                                          int AV83Consultadeproduccion_albaranesproduccionds_12_tfbaralbpie ,
                                          int AV84Consultadeproduccion_albaranesproduccionds_13_tfbaralbpie_to ,
                                          long A30AlbProCod ,
                                          java.util.Date A34AlbProfch ,
                                          java.math.BigDecimal A1261BarAlbKgmE ,
                                          java.math.BigDecimal A1263BarAlbMtrE ,
                                          int A1265BarAlbPie ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String A396EmprCod ,
                                          String AV50EmprCod ,
                                          int A129BarCod ,
                                          int AV51BarCod ,
                                          byte A132BarCodReo ,
                                          byte AV52BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV53BarCodPar ,
                                          String AV72Consultadeproduccion_albaranesproduccionds_1_emprcod ,
                                          int AV73Consultadeproduccion_albaranesproduccionds_2_barcod ,
                                          byte AV74Consultadeproduccion_albaranesproduccionds_3_barcodreo ,
                                          String AV75Consultadeproduccion_albaranesproduccionds_4_barcodpar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[22];
      Object[] GXv_Object10 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarAlbPie, T1.BarAlbMtrE, T1.BarAlbKgmE, T2.AlbProfch, T1.AlbProCod" ;
      sFromString = " FROM (TXPALBBAR T1 INNER JOIN TXPCALPRD T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      if ( ! (0==AV76Consultadeproduccion_albaranesproduccionds_5_tfalbprocod) )
      {
         addWhere(sWhereString, "(T1.AlbProCod >= ?)");
      }
      else
      {
         GXv_int9[8] = (byte)(1) ;
      }
      if ( ! (0==AV77Consultadeproduccion_albaranesproduccionds_6_tfalbprocod_to) )
      {
         addWhere(sWhereString, "(T1.AlbProCod <= ?)");
      }
      else
      {
         GXv_int9[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV78Consultadeproduccion_albaranesproduccionds_7_tfalbprofch)) )
      {
         addWhere(sWhereString, "(T2.AlbProfch >= ?)");
      }
      else
      {
         GXv_int9[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Consultadeproduccion_albaranesproduccionds_8_tfbaralbkgme)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE >= ?)");
      }
      else
      {
         GXv_int9[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Consultadeproduccion_albaranesproduccionds_9_tfbaralbkgme_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE <= ?)");
      }
      else
      {
         GXv_int9[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Consultadeproduccion_albaranesproduccionds_10_tfbaralbmtre)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE >= ?)");
      }
      else
      {
         GXv_int9[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Consultadeproduccion_albaranesproduccionds_11_tfbaralbmtre_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE <= ?)");
      }
      else
      {
         GXv_int9[14] = (byte)(1) ;
      }
      if ( ! (0==AV83Consultadeproduccion_albaranesproduccionds_12_tfbaralbpie) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie >= ?)");
      }
      else
      {
         GXv_int9[15] = (byte)(1) ;
      }
      if ( ! (0==AV84Consultadeproduccion_albaranesproduccionds_13_tfbaralbpie_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie <= ?)");
      }
      else
      {
         GXv_int9[16] = (byte)(1) ;
      }
      if ( AV12OrderedBy == 1 )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.AlbProCod" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.AlbProCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.AlbProfch" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T2.AlbProfch DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarAlbKgmE" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarAlbKgmE DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarAlbMtrE" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarAlbMtrE DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarAlbPie" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarAlbPie DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object10[0] = scmdbuf ;
      GXv_Object10[1] = GXv_int9 ;
      return GXv_Object10 ;
   }

   protected Object[] conditional_H01993( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          long AV76Consultadeproduccion_albaranesproduccionds_5_tfalbprocod ,
                                          long AV77Consultadeproduccion_albaranesproduccionds_6_tfalbprocod_to ,
                                          java.util.Date AV78Consultadeproduccion_albaranesproduccionds_7_tfalbprofch ,
                                          java.math.BigDecimal AV79Consultadeproduccion_albaranesproduccionds_8_tfbaralbkgme ,
                                          java.math.BigDecimal AV80Consultadeproduccion_albaranesproduccionds_9_tfbaralbkgme_to ,
                                          java.math.BigDecimal AV81Consultadeproduccion_albaranesproduccionds_10_tfbaralbmtre ,
                                          java.math.BigDecimal AV82Consultadeproduccion_albaranesproduccionds_11_tfbaralbmtre_to ,
                                          int AV83Consultadeproduccion_albaranesproduccionds_12_tfbaralbpie ,
                                          int AV84Consultadeproduccion_albaranesproduccionds_13_tfbaralbpie_to ,
                                          long A30AlbProCod ,
                                          java.util.Date A34AlbProfch ,
                                          java.math.BigDecimal A1261BarAlbKgmE ,
                                          java.math.BigDecimal A1263BarAlbMtrE ,
                                          int A1265BarAlbPie ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String A396EmprCod ,
                                          String AV50EmprCod ,
                                          int A129BarCod ,
                                          int AV51BarCod ,
                                          byte A132BarCodReo ,
                                          byte AV52BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV53BarCodPar ,
                                          String AV72Consultadeproduccion_albaranesproduccionds_1_emprcod ,
                                          int AV73Consultadeproduccion_albaranesproduccionds_2_barcod ,
                                          byte AV74Consultadeproduccion_albaranesproduccionds_3_barcodreo ,
                                          String AV75Consultadeproduccion_albaranesproduccionds_4_barcodpar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[17];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPALBBAR T1 INNER JOIN TXPCALPRD T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      if ( ! (0==AV76Consultadeproduccion_albaranesproduccionds_5_tfalbprocod) )
      {
         addWhere(sWhereString, "(T1.AlbProCod >= ?)");
      }
      else
      {
         GXv_int11[8] = (byte)(1) ;
      }
      if ( ! (0==AV77Consultadeproduccion_albaranesproduccionds_6_tfalbprocod_to) )
      {
         addWhere(sWhereString, "(T1.AlbProCod <= ?)");
      }
      else
      {
         GXv_int11[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV78Consultadeproduccion_albaranesproduccionds_7_tfalbprofch)) )
      {
         addWhere(sWhereString, "(T2.AlbProfch >= ?)");
      }
      else
      {
         GXv_int11[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Consultadeproduccion_albaranesproduccionds_8_tfbaralbkgme)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE >= ?)");
      }
      else
      {
         GXv_int11[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Consultadeproduccion_albaranesproduccionds_9_tfbaralbkgme_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE <= ?)");
      }
      else
      {
         GXv_int11[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Consultadeproduccion_albaranesproduccionds_10_tfbaralbmtre)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE >= ?)");
      }
      else
      {
         GXv_int11[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Consultadeproduccion_albaranesproduccionds_11_tfbaralbmtre_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE <= ?)");
      }
      else
      {
         GXv_int11[14] = (byte)(1) ;
      }
      if ( ! (0==AV83Consultadeproduccion_albaranesproduccionds_12_tfbaralbpie) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie >= ?)");
      }
      else
      {
         GXv_int11[15] = (byte)(1) ;
      }
      if ( ! (0==AV84Consultadeproduccion_albaranesproduccionds_13_tfbaralbpie_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie <= ?)");
      }
      else
      {
         GXv_int11[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV12OrderedBy == 1 )
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
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   protected Object[] conditional_H01994( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          long AV76Consultadeproduccion_albaranesproduccionds_5_tfalbprocod ,
                                          long AV77Consultadeproduccion_albaranesproduccionds_6_tfalbprocod_to ,
                                          java.util.Date AV78Consultadeproduccion_albaranesproduccionds_7_tfalbprofch ,
                                          java.math.BigDecimal AV79Consultadeproduccion_albaranesproduccionds_8_tfbaralbkgme ,
                                          java.math.BigDecimal AV80Consultadeproduccion_albaranesproduccionds_9_tfbaralbkgme_to ,
                                          java.math.BigDecimal AV81Consultadeproduccion_albaranesproduccionds_10_tfbaralbmtre ,
                                          java.math.BigDecimal AV82Consultadeproduccion_albaranesproduccionds_11_tfbaralbmtre_to ,
                                          int AV83Consultadeproduccion_albaranesproduccionds_12_tfbaralbpie ,
                                          int AV84Consultadeproduccion_albaranesproduccionds_13_tfbaralbpie_to ,
                                          long A30AlbProCod ,
                                          java.util.Date A34AlbProfch ,
                                          java.math.BigDecimal A1261BarAlbKgmE ,
                                          java.math.BigDecimal A1263BarAlbMtrE ,
                                          int A1265BarAlbPie ,
                                          String A396EmprCod ,
                                          String AV50EmprCod ,
                                          int A129BarCod ,
                                          int AV51BarCod ,
                                          byte A132BarCodReo ,
                                          byte AV52BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV53BarCodPar ,
                                          String AV72Consultadeproduccion_albaranesproduccionds_1_emprcod ,
                                          int AV73Consultadeproduccion_albaranesproduccionds_2_barcod ,
                                          byte AV74Consultadeproduccion_albaranesproduccionds_3_barcodreo ,
                                          String AV75Consultadeproduccion_albaranesproduccionds_4_barcodpar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int13 = new byte[17];
      Object[] GXv_Object14 = new Object[2];
      scmdbuf = "SELECT T1.BarAlbPie, T1.BarAlbMtrE, T1.BarAlbKgmE, T2.AlbProfch, T1.AlbProCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM (TXPALBBAR T1 INNER JOIN TXPCALPRD" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      if ( ! (0==AV76Consultadeproduccion_albaranesproduccionds_5_tfalbprocod) )
      {
         addWhere(sWhereString, "(T1.AlbProCod >= ?)");
      }
      else
      {
         GXv_int13[8] = (byte)(1) ;
      }
      if ( ! (0==AV77Consultadeproduccion_albaranesproduccionds_6_tfalbprocod_to) )
      {
         addWhere(sWhereString, "(T1.AlbProCod <= ?)");
      }
      else
      {
         GXv_int13[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV78Consultadeproduccion_albaranesproduccionds_7_tfalbprofch)) )
      {
         addWhere(sWhereString, "(T2.AlbProfch >= ?)");
      }
      else
      {
         GXv_int13[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Consultadeproduccion_albaranesproduccionds_8_tfbaralbkgme)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE >= ?)");
      }
      else
      {
         GXv_int13[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Consultadeproduccion_albaranesproduccionds_9_tfbaralbkgme_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE <= ?)");
      }
      else
      {
         GXv_int13[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Consultadeproduccion_albaranesproduccionds_10_tfbaralbmtre)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE >= ?)");
      }
      else
      {
         GXv_int13[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Consultadeproduccion_albaranesproduccionds_11_tfbaralbmtre_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE <= ?)");
      }
      else
      {
         GXv_int13[14] = (byte)(1) ;
      }
      if ( ! (0==AV83Consultadeproduccion_albaranesproduccionds_12_tfbaralbpie) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie >= ?)");
      }
      else
      {
         GXv_int13[15] = (byte)(1) ;
      }
      if ( ! (0==AV84Consultadeproduccion_albaranesproduccionds_13_tfbaralbpie_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie <= ?)");
      }
      else
      {
         GXv_int13[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
      GXv_Object14[0] = scmdbuf ;
      GXv_Object14[1] = GXv_int13 ;
      return GXv_Object14 ;
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
                  return conditional_H01992(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).longValue() , ((Number) dynConstraints[1]).longValue() , (java.util.Date)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).longValue() , (java.util.Date)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).shortValue() , ((Boolean) dynConstraints[15]).booleanValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] );
            case 1 :
                  return conditional_H01993(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).longValue() , ((Number) dynConstraints[1]).longValue() , (java.util.Date)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).longValue() , (java.util.Date)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).shortValue() , ((Boolean) dynConstraints[15]).booleanValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] );
            case 2 :
                  return conditional_H01994(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).longValue() , ((Number) dynConstraints[1]).longValue() , (java.util.Date)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).longValue() , (java.util.Date)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01992", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01993", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01994", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((long[]) buf[8])[0] = rslt.getLong(9);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 3);
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
                  stmt.setString(sIdx, (String)parms[22], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[24]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[28]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[30]).longValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[31]).longValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[32]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[19]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[23]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[25]).longValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[26]).longValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[27]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[19]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[23]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[25]).longValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[26]).longValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[27]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               return;
      }
   }

}

