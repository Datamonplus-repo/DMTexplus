package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class consultadeproduccion_almacentejido_impl extends GXWebComponent
{
   public consultadeproduccion_almacentejido_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public consultadeproduccion_almacentejido_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultadeproduccion_almacentejido_impl.class ));
   }

   public consultadeproduccion_almacentejido_impl( int remoteHandle ,
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
               AV56Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56Emprcod", AV56Emprcod);
               AV57BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57BarCod), 8, 0));
               AV58BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58BarCodReo", GXutil.str( AV58BarCodReo, 1, 0));
               AV59BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59BarCodPar", AV59BarCodPar);
               AV69CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69CliCod), 6, 0));
               AV70CliNom = httpContext.GetPar( "CliNom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70CliNom", AV70CliNom);
               AV71PedidoCliente = httpContext.GetPar( "PedidoCliente") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71PedidoCliente", AV71PedidoCliente);
               AV72BarSer = httpContext.GetPar( "BarSer") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72BarSer", AV72BarSer);
               AV73BarSerDsc = httpContext.GetPar( "BarSerDsc") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73BarSerDsc", AV73BarSerDsc);
               AV74BarColNom = httpContext.GetPar( "BarColNom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74BarColNom", AV74BarColNom);
               AV75BarColNum = (int)(GXutil.lval( httpContext.GetPar( "BarColNum"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75BarColNum), 6, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV56Emprcod,Integer.valueOf(AV57BarCod),Byte.valueOf(AV58BarCodReo),AV59BarCodPar,Integer.valueOf(AV69CliCod),AV70CliNom,AV71PedidoCliente,AV72BarSer,AV73BarSerDsc,AV74BarColNom,Integer.valueOf(AV75BarColNum)});
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
      AV56Emprcod = httpContext.GetPar( "Emprcod") ;
      AV57BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      AV58BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      AV59BarCodPar = httpContext.GetPar( "BarCodPar") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV19ColumnsSelector);
      AV22TFBarPieCod = httpContext.GetPar( "TFBarPieCod") ;
      AV23TFBarPieCod_Sel = httpContext.GetPar( "TFBarPieCod_Sel") ;
      AV24TFAlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "TFAlbRecCod"))) ;
      AV25TFAlbRecCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFAlbRecCod_To"))) ;
      AV26TFBarKilLan = CommonUtil.decimalVal( httpContext.GetPar( "TFBarKilLan"), ".") ;
      AV27TFBarKilLan_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarKilLan_To"), ".") ;
      AV28TFBarMetLan = CommonUtil.decimalVal( httpContext.GetPar( "TFBarMetLan"), ".") ;
      AV29TFBarMetLan_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarMetLan_To"), ".") ;
      AV30TFBarPieKil = CommonUtil.decimalVal( httpContext.GetPar( "TFBarPieKil"), ".") ;
      AV31TFBarPieKil_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarPieKil_To"), ".") ;
      AV32TFBarPieMet = CommonUtil.decimalVal( httpContext.GetPar( "TFBarPieMet"), ".") ;
      AV33TFBarPieMet_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarPieMet_To"), ".") ;
      AV34TFBarPieLoc = httpContext.GetPar( "TFBarPieLoc") ;
      AV35TFBarPieLoc_Sel = httpContext.GetPar( "TFBarPieLoc_Sel") ;
      AV36TFBarPieEst = (byte)(GXutil.lval( httpContext.GetPar( "TFBarPieEst"))) ;
      AV37TFBarPieEst_To = (byte)(GXutil.lval( httpContext.GetPar( "TFBarPieEst_To"))) ;
      AV38TFAlbREnt = httpContext.GetPar( "TFAlbREnt") ;
      AV39TFAlbREnt_Sel = httpContext.GetPar( "TFAlbREnt_Sel") ;
      AV40TFAlbRLote = httpContext.GetPar( "TFAlbRLote") ;
      AV41TFAlbRLote_Sel = httpContext.GetPar( "TFAlbRLote_Sel") ;
      AV42TFAlbRTelar = httpContext.GetPar( "TFAlbRTelar") ;
      AV43TFAlbRTelar_Sel = httpContext.GetPar( "TFAlbRTelar_Sel") ;
      AV44TFAlbRMdlCod = httpContext.GetPar( "TFAlbRMdlCod") ;
      AV45TFAlbRMdlCod_Sel = httpContext.GetPar( "TFAlbRMdlCod_Sel") ;
      AV46TFAlbRLu = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbRLu"), ".") ;
      AV47TFAlbRLu_To = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbRLu_To"), ".") ;
      AV48TFAlbRTara = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbRTara"), ".") ;
      AV49TFAlbRTara_To = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbRTara_To"), ".") ;
      AV50TFAlbMaqTej = httpContext.GetPar( "TFAlbMaqTej") ;
      AV51TFAlbMaqTej_Sel = httpContext.GetPar( "TFAlbMaqTej_Sel") ;
      AV78Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV69CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
      AV70CliNom = httpContext.GetPar( "CliNom") ;
      AV71PedidoCliente = httpContext.GetPar( "PedidoCliente") ;
      AV72BarSer = httpContext.GetPar( "BarSer") ;
      AV73BarSerDsc = httpContext.GetPar( "BarSerDsc") ;
      AV74BarColNom = httpContext.GetPar( "BarColNom") ;
      AV75BarColNum = (int)(GXutil.lval( httpContext.GetPar( "BarColNum"))) ;
      AV60Moda21 = (short)(GXutil.lval( httpContext.GetPar( "Moda21"))) ;
      AV61TotBarKilLan = CommonUtil.decimalVal( httpContext.GetPar( "TotBarKilLan"), ".") ;
      AV63TotBarMetLan = CommonUtil.decimalVal( httpContext.GetPar( "TotBarMetLan"), ".") ;
      AV65TotBarPieKil = CommonUtil.decimalVal( httpContext.GetPar( "TotBarPieKil"), ".") ;
      AV67TotBarPieMet = CommonUtil.decimalVal( httpContext.GetPar( "TotBarPieMet"), ".") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV56Emprcod, AV57BarCod, AV58BarCodReo, AV59BarCodPar, AV19ColumnsSelector, AV22TFBarPieCod, AV23TFBarPieCod_Sel, AV24TFAlbRecCod, AV25TFAlbRecCod_To, AV26TFBarKilLan, AV27TFBarKilLan_To, AV28TFBarMetLan, AV29TFBarMetLan_To, AV30TFBarPieKil, AV31TFBarPieKil_To, AV32TFBarPieMet, AV33TFBarPieMet_To, AV34TFBarPieLoc, AV35TFBarPieLoc_Sel, AV36TFBarPieEst, AV37TFBarPieEst_To, AV38TFAlbREnt, AV39TFAlbREnt_Sel, AV40TFAlbRLote, AV41TFAlbRLote_Sel, AV42TFAlbRTelar, AV43TFAlbRTelar_Sel, AV44TFAlbRMdlCod, AV45TFAlbRMdlCod_Sel, AV46TFAlbRLu, AV47TFAlbRLu_To, AV48TFAlbRTara, AV49TFAlbRTara_To, AV50TFAlbMaqTej, AV51TFAlbMaqTej_Sel, AV78Pgmname, AV12OrderedBy, AV13OrderedDsc, AV69CliCod, AV70CliNom, AV71PedidoCliente, AV72BarSer, AV73BarSerDsc, AV74BarColNom, AV75BarColNum, AV60Moda21, AV61TotBarKilLan, AV63TotBarMetLan, AV65TotBarPieKil, AV67TotBarPieMet, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1YN2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Detalle Entradas Almacen Tejido", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.produccion.consultadeproduccion_almacentejido", new String[] {GXutil.URLEncode(GXutil.rtrim(AV56Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV57BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV58BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV59BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV69CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV70CliNom)),GXutil.URLEncode(GXutil.rtrim(AV71PedidoCliente)),GXutil.URLEncode(GXutil.rtrim(AV72BarSer)),GXutil.URLEncode(GXutil.rtrim(AV73BarSerDsc)),GXutil.URLEncode(GXutil.rtrim(AV74BarColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV75BarColNum,6,0))}, new String[] {"Emprcod","BarCod","BarCodReo","BarCodPar","CliCod","CliNom","PedidoCliente","BarSer","BarSerDsc","BarColNom","BarColNum"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV60Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARKILLAN", getSecureSignedToken( sPrefix, localUtil.format( AV61TotBarKilLan, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARMETLAN", getSecureSignedToken( sPrefix, localUtil.format( AV63TotBarMetLan, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARPIEKIL", getSecureSignedToken( sPrefix, localUtil.format( AV65TotBarPieKil, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARPIEMET", getSecureSignedToken( sPrefix, localUtil.format( AV67TotBarPieMet, "ZZZZZ9.99")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ConsultadeProduccion_AlmacenTejido");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV78Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("produccion\\consultadeproduccion_almacentejido:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_87", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_87, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV54GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV55GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV52DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV52DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV19ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV19ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV56Emprcod", GXutil.rtrim( wcpOAV56Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV57BarCod", GXutil.ltrim( localUtil.ntoc( wcpOAV57BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV58BarCodReo", GXutil.ltrim( localUtil.ntoc( wcpOAV58BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV59BarCodPar", GXutil.rtrim( wcpOAV59BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV69CliCod", GXutil.ltrim( localUtil.ntoc( wcpOAV69CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV70CliNom", GXutil.rtrim( wcpOAV70CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV71PedidoCliente", GXutil.rtrim( wcpOAV71PedidoCliente));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV72BarSer", GXutil.rtrim( wcpOAV72BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV73BarSerDsc", GXutil.rtrim( wcpOAV73BarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV74BarColNom", GXutil.rtrim( wcpOAV74BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV75BarColNum", GXutil.ltrim( localUtil.ntoc( wcpOAV75BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARPIECOD", GXutil.rtrim( AV22TFBarPieCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARPIECOD_SEL", GXutil.rtrim( AV23TFBarPieCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBRECCOD", GXutil.ltrim( localUtil.ntoc( AV24TFAlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBRECCOD_TO", GXutil.ltrim( localUtil.ntoc( AV25TFAlbRecCod_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARKILLAN", GXutil.ltrim( localUtil.ntoc( AV26TFBarKilLan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARKILLAN_TO", GXutil.ltrim( localUtil.ntoc( AV27TFBarKilLan_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARMETLAN", GXutil.ltrim( localUtil.ntoc( AV28TFBarMetLan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARMETLAN_TO", GXutil.ltrim( localUtil.ntoc( AV29TFBarMetLan_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARPIEKIL", GXutil.ltrim( localUtil.ntoc( AV30TFBarPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARPIEKIL_TO", GXutil.ltrim( localUtil.ntoc( AV31TFBarPieKil_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARPIEMET", GXutil.ltrim( localUtil.ntoc( AV32TFBarPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARPIEMET_TO", GXutil.ltrim( localUtil.ntoc( AV33TFBarPieMet_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARPIELOC", GXutil.rtrim( AV34TFBarPieLoc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARPIELOC_SEL", GXutil.rtrim( AV35TFBarPieLoc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARPIEEST", GXutil.ltrim( localUtil.ntoc( AV36TFBarPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARPIEEST_TO", GXutil.ltrim( localUtil.ntoc( AV37TFBarPieEst_To, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBRENT", GXutil.rtrim( AV38TFAlbREnt));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBRENT_SEL", GXutil.rtrim( AV39TFAlbREnt_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBRLOTE", GXutil.rtrim( AV40TFAlbRLote));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBRLOTE_SEL", GXutil.rtrim( AV41TFAlbRLote_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBRTELAR", GXutil.rtrim( AV42TFAlbRTelar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBRTELAR_SEL", GXutil.rtrim( AV43TFAlbRTelar_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBRMDLCOD", GXutil.rtrim( AV44TFAlbRMdlCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBRMDLCOD_SEL", GXutil.rtrim( AV45TFAlbRMdlCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBRLU", GXutil.ltrim( localUtil.ntoc( AV46TFAlbRLu, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBRLU_TO", GXutil.ltrim( localUtil.ntoc( AV47TFAlbRLu_To, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBRTARA", GXutil.ltrim( localUtil.ntoc( AV48TFAlbRTara, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBRTARA_TO", GXutil.ltrim( localUtil.ntoc( AV49TFAlbRTara_To, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBMAQTEJ", GXutil.rtrim( AV50TFAlbMaqTej));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBMAQTEJ_SEL", GXutil.rtrim( AV51TFAlbMaqTej_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV56Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMODA21", GXutil.ltrim( localUtil.ntoc( AV60Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV60Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTBARKILLAN", GXutil.ltrim( localUtil.ntoc( AV61TotBarKilLan, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARKILLAN", getSecureSignedToken( sPrefix, localUtil.format( AV61TotBarKilLan, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTBARMETLAN", GXutil.ltrim( localUtil.ntoc( AV63TotBarMetLan, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARMETLAN", getSecureSignedToken( sPrefix, localUtil.format( AV63TotBarMetLan, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTBARPIEKIL", GXutil.ltrim( localUtil.ntoc( AV65TotBarPieKil, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARPIEKIL", getSecureSignedToken( sPrefix, localUtil.format( AV65TotBarPieKil, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTBARPIEMET", GXutil.ltrim( localUtil.ntoc( AV67TotBarPieMet, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARPIEMET", getSecureSignedToken( sPrefix, localUtil.format( AV67TotBarPieMet, "ZZZZZ9.99")));
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

   public void renderHtmlCloseForm1YN2( )
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
      return "Produccion.ConsultadeProduccion_AlmacenTejido" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Detalle Entradas Almacen Tejido", "") ;
   }

   public void wb1YN0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.produccion.consultadeproduccion_almacentejido");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV57BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV57BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV57BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ConsultadeProduccion_AlmacenTejido.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodreo_Internalname, GXutil.ltrim( localUtil.ntoc( AV58BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV58BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(AV58BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodreo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodreo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ConsultadeProduccion_AlmacenTejido.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodpar_Internalname, GXutil.rtrim( AV59BarCodPar), GXutil.rtrim( localUtil.format( AV59BarCodPar, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodpar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodpar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ConsultadeProduccion_AlmacenTejido.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV69CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV69CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV69CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ConsultadeProduccion_AlmacenTejido.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClinom_Internalname, GXutil.rtrim( AV70CliNom), GXutil.rtrim( localUtil.format( AV70CliNom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClinom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClinom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ConsultadeProduccion_AlmacenTejido.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPedidocliente_Internalname, GXutil.rtrim( AV71PedidoCliente), GXutil.rtrim( localUtil.format( AV71PedidoCliente, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPedidocliente_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPedidocliente_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ConsultadeProduccion_AlmacenTejido.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarser_Internalname, GXutil.rtrim( AV72BarSer), GXutil.rtrim( localUtil.format( AV72BarSer, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarser_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarser_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ConsultadeProduccion_AlmacenTejido.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarserdsc_Internalname, GXutil.rtrim( AV73BarSerDsc), GXutil.rtrim( localUtil.format( AV73BarSerDsc, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarserdsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarserdsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ConsultadeProduccion_AlmacenTejido.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnom_Internalname, GXutil.rtrim( AV74BarColNom), GXutil.rtrim( localUtil.format( AV74BarColNom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ConsultadeProduccion_AlmacenTejido.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnum_Internalname, GXutil.ltrim( localUtil.ntoc( AV75BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV75BarColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV75BarColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ConsultadeProduccion_AlmacenTejido.htm");
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 87, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\ConsultadeProduccion_AlmacenTejido.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 87, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\ConsultadeProduccion_AlmacenTejido.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 87, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\ConsultadeProduccion_AlmacenTejido.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_76_1YN2( true) ;
      }
      else
      {
         wb_table1_76_1YN2( false) ;
      }
      return  ;
   }

   public void wb_table1_76_1YN2e( boolean wbgen )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row Invisible", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table2_105_1YN2( true) ;
      }
      else
      {
         wb_table2_105_1YN2( false) ;
      }
      return  ;
   }

   public void wb_table2_105_1YN2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV54GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV55GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV78Pgmname), GXutil.rtrim( localUtil.format( AV78Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ConsultadeProduccion_AlmacenTejido.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV52DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV52DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV19ColumnsSelector);
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

   public void start1YN2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Detalle Entradas Almacen Tejido", ""), (short)(0)) ;
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
            strup1YN0( ) ;
         }
      }
   }

   public void ws1YN2( )
   {
      start1YN2( ) ;
      evt1YN2( ) ;
   }

   public void evt1YN2( )
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
                              strup1YN0( ) ;
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
                              strup1YN0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e111YN2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1YN0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e121YN2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1YN0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e131YN2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1YN0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e141YN2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1YN0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e151YN2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1YN0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e161YN2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1YN0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavTotvaluebarkillan_Internalname ;
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
                              strup1YN0( ) ;
                           }
                           nGXsfl_87_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_87_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_87_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_872( ) ;
                           A200BarPieCod = httpContext.cgiGet( edtBarPieCod_Internalname) ;
                           A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A170BarKilLan = localUtil.ctond( httpContext.cgiGet( edtBarKilLan_Internalname)) ;
                           A183BarMetLan = localUtil.ctond( httpContext.cgiGet( edtBarMetLan_Internalname)) ;
                           A203BarPieKil = localUtil.ctond( httpContext.cgiGet( edtBarPieKil_Internalname)) ;
                           A205BarPieMet = localUtil.ctond( httpContext.cgiGet( edtBarPieMet_Internalname)) ;
                           A2186BarPieLoc = httpContext.cgiGet( edtBarPieLoc_Internalname) ;
                           n2186BarPieLoc = false ;
                           A201BarPieEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarPieEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A46AlbREnt = httpContext.cgiGet( edtAlbREnt_Internalname) ;
                           A6463AlbRLote = httpContext.cgiGet( edtAlbRLote_Internalname) ;
                           A6464AlbRTelar = httpContext.cgiGet( edtAlbRTelar_Internalname) ;
                           A4602AlbRMdlCod = httpContext.cgiGet( edtAlbRMdlCod_Internalname) ;
                           A6465AlbRLu = localUtil.ctond( httpContext.cgiGet( edtAlbRLu_Internalname)) ;
                           A6470AlbRTara = localUtil.ctond( httpContext.cgiGet( edtAlbRTara_Internalname)) ;
                           A8035AlbMaqTej = httpContext.cgiGet( edtAlbMaqTej_Internalname) ;
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
                                       GX_FocusControl = edtavTotvaluebarkillan_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e171YN2 ();
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
                                       GX_FocusControl = edtavTotvaluebarkillan_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e181YN2 ();
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
                                       GX_FocusControl = edtavTotvaluebarkillan_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e191YN2 ();
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
                                    strup1YN0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavTotvaluebarkillan_Internalname ;
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
                              strup1YN0( ) ;
                           }
                           nGXsfl_87_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_87_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_87_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_872( ) ;
                           A200BarPieCod = httpContext.cgiGet( edtBarPieCod_Internalname) ;
                           A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A170BarKilLan = localUtil.ctond( httpContext.cgiGet( edtBarKilLan_Internalname)) ;
                           A183BarMetLan = localUtil.ctond( httpContext.cgiGet( edtBarMetLan_Internalname)) ;
                           A203BarPieKil = localUtil.ctond( httpContext.cgiGet( edtBarPieKil_Internalname)) ;
                           A205BarPieMet = localUtil.ctond( httpContext.cgiGet( edtBarPieMet_Internalname)) ;
                           A2186BarPieLoc = httpContext.cgiGet( edtBarPieLoc_Internalname) ;
                           n2186BarPieLoc = false ;
                           A201BarPieEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarPieEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A46AlbREnt = httpContext.cgiGet( edtAlbREnt_Internalname) ;
                           A6463AlbRLote = httpContext.cgiGet( edtAlbRLote_Internalname) ;
                           A6464AlbRTelar = httpContext.cgiGet( edtAlbRTelar_Internalname) ;
                           A4602AlbRMdlCod = httpContext.cgiGet( edtAlbRMdlCod_Internalname) ;
                           A6465AlbRLu = localUtil.ctond( httpContext.cgiGet( edtAlbRLu_Internalname)) ;
                           A6470AlbRTara = localUtil.ctond( httpContext.cgiGet( edtAlbRTara_Internalname)) ;
                           A8035AlbMaqTej = httpContext.cgiGet( edtAlbMaqTej_Internalname) ;
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
                                       GX_FocusControl = edtavTotvaluebarkillan_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e171YN2 ();
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
                                       GX_FocusControl = edtavTotvaluebarkillan_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e181YN2 ();
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
                                       GX_FocusControl = edtavTotvaluebarkillan_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e191YN2 ();
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
                                    strup1YN0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavTotvaluebarkillan_Internalname ;
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

   public void we1YN2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1YN2( ) ;
         }
      }
   }

   public void pa1YN2( )
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
            GX_FocusControl = edtavTotvaluebarkillan_Internalname ;
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
                                 String AV56Emprcod ,
                                 int AV57BarCod ,
                                 byte AV58BarCodReo ,
                                 String AV59BarCodPar ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV19ColumnsSelector ,
                                 String AV22TFBarPieCod ,
                                 String AV23TFBarPieCod_Sel ,
                                 int AV24TFAlbRecCod ,
                                 int AV25TFAlbRecCod_To ,
                                 java.math.BigDecimal AV26TFBarKilLan ,
                                 java.math.BigDecimal AV27TFBarKilLan_To ,
                                 java.math.BigDecimal AV28TFBarMetLan ,
                                 java.math.BigDecimal AV29TFBarMetLan_To ,
                                 java.math.BigDecimal AV30TFBarPieKil ,
                                 java.math.BigDecimal AV31TFBarPieKil_To ,
                                 java.math.BigDecimal AV32TFBarPieMet ,
                                 java.math.BigDecimal AV33TFBarPieMet_To ,
                                 String AV34TFBarPieLoc ,
                                 String AV35TFBarPieLoc_Sel ,
                                 byte AV36TFBarPieEst ,
                                 byte AV37TFBarPieEst_To ,
                                 String AV38TFAlbREnt ,
                                 String AV39TFAlbREnt_Sel ,
                                 String AV40TFAlbRLote ,
                                 String AV41TFAlbRLote_Sel ,
                                 String AV42TFAlbRTelar ,
                                 String AV43TFAlbRTelar_Sel ,
                                 String AV44TFAlbRMdlCod ,
                                 String AV45TFAlbRMdlCod_Sel ,
                                 java.math.BigDecimal AV46TFAlbRLu ,
                                 java.math.BigDecimal AV47TFAlbRLu_To ,
                                 java.math.BigDecimal AV48TFAlbRTara ,
                                 java.math.BigDecimal AV49TFAlbRTara_To ,
                                 String AV50TFAlbMaqTej ,
                                 String AV51TFAlbMaqTej_Sel ,
                                 String AV78Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 int AV69CliCod ,
                                 String AV70CliNom ,
                                 String AV71PedidoCliente ,
                                 String AV72BarSer ,
                                 String AV73BarSerDsc ,
                                 String AV74BarColNom ,
                                 int AV75BarColNum ,
                                 short AV60Moda21 ,
                                 java.math.BigDecimal AV61TotBarKilLan ,
                                 java.math.BigDecimal AV63TotBarMetLan ,
                                 java.math.BigDecimal AV65TotBarPieKil ,
                                 java.math.BigDecimal AV67TotBarPieMet ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e181YN2 ();
      GRID_nCurrentRecord = 0 ;
      rf1YN2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ConsultadeProduccion_AlmacenTejido");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV78Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("produccion\\consultadeproduccion_almacentejido:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf1YN2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV78Pgmname = "Produccion.ConsultadeProduccion_AlmacenTejido" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78Pgmname", AV78Pgmname);
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
      edtavTotvaluebarkillan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebarkillan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarkillan_Enabled), 5, 0), true);
      edtavTotvaluebarmetlan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebarmetlan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarmetlan_Enabled), 5, 0), true);
      edtavTotvaluebarpiekil_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebarpiekil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarpiekil_Enabled), 5, 0), true);
      edtavTotvaluebarpiemet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebarpiemet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarpiemet_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1YN2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(87) ;
      /* Execute user event: Refresh */
      e181YN2 ();
      nGXsfl_87_idx = 1 ;
      sGXsfl_87_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_87_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_872( ) ;
      bGXsfl_87_Refreshing = true ;
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
         subsflControlProps_872( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV83Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel ,
                                              AV82Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod ,
                                              Integer.valueOf(AV84Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod) ,
                                              Integer.valueOf(AV85Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to) ,
                                              AV86Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan ,
                                              AV87Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to ,
                                              AV88Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan ,
                                              AV89Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to ,
                                              AV90Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil ,
                                              AV91Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to ,
                                              AV92Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet ,
                                              AV93Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to ,
                                              AV95Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel ,
                                              AV94Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc ,
                                              Byte.valueOf(AV96Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest) ,
                                              Byte.valueOf(AV97Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to) ,
                                              AV99Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel ,
                                              AV98Produccion_consultadeproduccion_almacentejidods_17_tfalbrent ,
                                              AV101Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel ,
                                              AV100Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote ,
                                              AV103Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel ,
                                              AV102Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar ,
                                              AV105Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel ,
                                              AV104Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod ,
                                              AV106Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu ,
                                              AV107Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to ,
                                              AV108Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara ,
                                              AV109Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to ,
                                              AV111Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel ,
                                              AV110Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej ,
                                              A200BarPieCod ,
                                              Integer.valueOf(A44AlbRecCod) ,
                                              A170BarKilLan ,
                                              A183BarMetLan ,
                                              A203BarPieKil ,
                                              A205BarPieMet ,
                                              A2186BarPieLoc ,
                                              Byte.valueOf(A201BarPieEst) ,
                                              A46AlbREnt ,
                                              A6463AlbRLote ,
                                              A6464AlbRTelar ,
                                              A4602AlbRMdlCod ,
                                              A6465AlbRLu ,
                                              A6470AlbRTara ,
                                              A8035AlbMaqTej ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV56Emprcod ,
                                              Integer.valueOf(AV57BarCod) ,
                                              Byte.valueOf(AV58BarCodReo) ,
                                              AV59BarCodPar ,
                                              A396EmprCod ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                              }
         });
         lV82Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod = GXutil.padr( GXutil.rtrim( AV82Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod), 9, "%") ;
         lV94Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc = GXutil.padr( GXutil.rtrim( AV94Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc), 10, "%") ;
         lV98Produccion_consultadeproduccion_almacentejidods_17_tfalbrent = GXutil.padr( GXutil.rtrim( AV98Produccion_consultadeproduccion_almacentejidods_17_tfalbrent), 8, "%") ;
         lV100Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote = GXutil.padr( GXutil.rtrim( AV100Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote), 20, "%") ;
         lV102Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar = GXutil.padr( GXutil.rtrim( AV102Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar), 20, "%") ;
         lV104Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod = GXutil.padr( GXutil.rtrim( AV104Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod), 13, "%") ;
         lV110Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej = GXutil.padr( GXutil.rtrim( AV110Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej), 12, "%") ;
         /* Using cursor H01YN2 */
         pr_default.execute(0, new Object[] {AV56Emprcod, Integer.valueOf(AV57BarCod), Byte.valueOf(AV58BarCodReo), AV59BarCodPar, lV82Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod, AV83Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel, Integer.valueOf(AV84Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod), Integer.valueOf(AV85Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to), AV86Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan, AV87Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to, AV88Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan, AV89Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to, AV90Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil, AV91Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to, AV92Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet, AV93Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to, lV94Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc, AV95Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel, Byte.valueOf(AV96Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest), Byte.valueOf(AV97Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to), lV98Produccion_consultadeproduccion_almacentejidods_17_tfalbrent, AV99Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel, lV100Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote, AV101Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel, lV102Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar, AV103Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel, lV104Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod, AV105Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel, AV106Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu, AV107Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to, AV108Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara, AV109Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to, lV110Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej, AV111Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_87_idx = 1 ;
         sGXsfl_87_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_87_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_872( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A130BarCodPar = H01YN2_A130BarCodPar[0] ;
            A132BarCodReo = H01YN2_A132BarCodReo[0] ;
            A129BarCod = H01YN2_A129BarCod[0] ;
            A396EmprCod = H01YN2_A396EmprCod[0] ;
            A8035AlbMaqTej = H01YN2_A8035AlbMaqTej[0] ;
            A6470AlbRTara = H01YN2_A6470AlbRTara[0] ;
            A6465AlbRLu = H01YN2_A6465AlbRLu[0] ;
            A4602AlbRMdlCod = H01YN2_A4602AlbRMdlCod[0] ;
            A6464AlbRTelar = H01YN2_A6464AlbRTelar[0] ;
            A6463AlbRLote = H01YN2_A6463AlbRLote[0] ;
            A46AlbREnt = H01YN2_A46AlbREnt[0] ;
            A201BarPieEst = H01YN2_A201BarPieEst[0] ;
            A2186BarPieLoc = H01YN2_A2186BarPieLoc[0] ;
            n2186BarPieLoc = H01YN2_n2186BarPieLoc[0] ;
            A205BarPieMet = H01YN2_A205BarPieMet[0] ;
            A203BarPieKil = H01YN2_A203BarPieKil[0] ;
            A183BarMetLan = H01YN2_A183BarMetLan[0] ;
            A170BarKilLan = H01YN2_A170BarKilLan[0] ;
            A44AlbRecCod = H01YN2_A44AlbRecCod[0] ;
            A200BarPieCod = H01YN2_A200BarPieCod[0] ;
            A8035AlbMaqTej = H01YN2_A8035AlbMaqTej[0] ;
            A6470AlbRTara = H01YN2_A6470AlbRTara[0] ;
            A6465AlbRLu = H01YN2_A6465AlbRLu[0] ;
            A4602AlbRMdlCod = H01YN2_A4602AlbRMdlCod[0] ;
            A6464AlbRTelar = H01YN2_A6464AlbRTelar[0] ;
            A6463AlbRLote = H01YN2_A6463AlbRLote[0] ;
            A46AlbREnt = H01YN2_A46AlbREnt[0] ;
            e191YN2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(87) ;
         wb1YN0( ) ;
      }
      bGXsfl_87_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1YN2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMODA21", GXutil.ltrim( localUtil.ntoc( AV60Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV60Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTBARKILLAN", GXutil.ltrim( localUtil.ntoc( AV61TotBarKilLan, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARKILLAN", getSecureSignedToken( sPrefix, localUtil.format( AV61TotBarKilLan, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTBARMETLAN", GXutil.ltrim( localUtil.ntoc( AV63TotBarMetLan, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARMETLAN", getSecureSignedToken( sPrefix, localUtil.format( AV63TotBarMetLan, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTBARPIEKIL", GXutil.ltrim( localUtil.ntoc( AV65TotBarPieKil, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARPIEKIL", getSecureSignedToken( sPrefix, localUtil.format( AV65TotBarPieKil, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTBARPIEMET", GXutil.ltrim( localUtil.ntoc( AV67TotBarPieMet, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARPIEMET", getSecureSignedToken( sPrefix, localUtil.format( AV67TotBarPieMet, "ZZZZZ9.99")));
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
      AV82Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod = AV22TFBarPieCod ;
      AV83Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel = AV23TFBarPieCod_Sel ;
      AV84Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod = AV24TFAlbRecCod ;
      AV85Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to = AV25TFAlbRecCod_To ;
      AV86Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan = AV26TFBarKilLan ;
      AV87Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to = AV27TFBarKilLan_To ;
      AV88Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan = AV28TFBarMetLan ;
      AV89Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to = AV29TFBarMetLan_To ;
      AV90Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil = AV30TFBarPieKil ;
      AV91Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to = AV31TFBarPieKil_To ;
      AV92Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet = AV32TFBarPieMet ;
      AV93Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to = AV33TFBarPieMet_To ;
      AV94Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc = AV34TFBarPieLoc ;
      AV95Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel = AV35TFBarPieLoc_Sel ;
      AV96Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest = AV36TFBarPieEst ;
      AV97Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to = AV37TFBarPieEst_To ;
      AV98Produccion_consultadeproduccion_almacentejidods_17_tfalbrent = AV38TFAlbREnt ;
      AV99Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel = AV39TFAlbREnt_Sel ;
      AV100Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote = AV40TFAlbRLote ;
      AV101Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel = AV41TFAlbRLote_Sel ;
      AV102Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar = AV42TFAlbRTelar ;
      AV103Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel = AV43TFAlbRTelar_Sel ;
      AV104Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod = AV44TFAlbRMdlCod ;
      AV105Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel = AV45TFAlbRMdlCod_Sel ;
      AV106Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu = AV46TFAlbRLu ;
      AV107Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to = AV47TFAlbRLu_To ;
      AV108Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara = AV48TFAlbRTara ;
      AV109Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to = AV49TFAlbRTara_To ;
      AV110Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej = AV50TFAlbMaqTej ;
      AV111Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel = AV51TFAlbMaqTej_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV83Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel ,
                                           AV82Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod ,
                                           Integer.valueOf(AV84Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod) ,
                                           Integer.valueOf(AV85Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to) ,
                                           AV86Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan ,
                                           AV87Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to ,
                                           AV88Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan ,
                                           AV89Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to ,
                                           AV90Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil ,
                                           AV91Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to ,
                                           AV92Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet ,
                                           AV93Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to ,
                                           AV95Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel ,
                                           AV94Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc ,
                                           Byte.valueOf(AV96Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest) ,
                                           Byte.valueOf(AV97Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to) ,
                                           AV99Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel ,
                                           AV98Produccion_consultadeproduccion_almacentejidods_17_tfalbrent ,
                                           AV101Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel ,
                                           AV100Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote ,
                                           AV103Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel ,
                                           AV102Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar ,
                                           AV105Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel ,
                                           AV104Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod ,
                                           AV106Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu ,
                                           AV107Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to ,
                                           AV108Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara ,
                                           AV109Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to ,
                                           AV111Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel ,
                                           AV110Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej ,
                                           A200BarPieCod ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A170BarKilLan ,
                                           A183BarMetLan ,
                                           A203BarPieKil ,
                                           A205BarPieMet ,
                                           A2186BarPieLoc ,
                                           Byte.valueOf(A201BarPieEst) ,
                                           A46AlbREnt ,
                                           A6463AlbRLote ,
                                           A6464AlbRTelar ,
                                           A4602AlbRMdlCod ,
                                           A6465AlbRLu ,
                                           A6470AlbRTara ,
                                           A8035AlbMaqTej ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV56Emprcod ,
                                           Integer.valueOf(AV57BarCod) ,
                                           Byte.valueOf(AV58BarCodReo) ,
                                           AV59BarCodPar ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV82Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod = GXutil.padr( GXutil.rtrim( AV82Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod), 9, "%") ;
      lV94Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc = GXutil.padr( GXutil.rtrim( AV94Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc), 10, "%") ;
      lV98Produccion_consultadeproduccion_almacentejidods_17_tfalbrent = GXutil.padr( GXutil.rtrim( AV98Produccion_consultadeproduccion_almacentejidods_17_tfalbrent), 8, "%") ;
      lV100Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote = GXutil.padr( GXutil.rtrim( AV100Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote), 20, "%") ;
      lV102Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar = GXutil.padr( GXutil.rtrim( AV102Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar), 20, "%") ;
      lV104Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod = GXutil.padr( GXutil.rtrim( AV104Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod), 13, "%") ;
      lV110Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej = GXutil.padr( GXutil.rtrim( AV110Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej), 12, "%") ;
      /* Using cursor H01YN3 */
      pr_default.execute(1, new Object[] {AV56Emprcod, Integer.valueOf(AV57BarCod), Byte.valueOf(AV58BarCodReo), AV59BarCodPar, lV82Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod, AV83Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel, Integer.valueOf(AV84Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod), Integer.valueOf(AV85Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to), AV86Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan, AV87Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to, AV88Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan, AV89Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to, AV90Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil, AV91Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to, AV92Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet, AV93Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to, lV94Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc, AV95Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel, Byte.valueOf(AV96Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest), Byte.valueOf(AV97Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to), lV98Produccion_consultadeproduccion_almacentejidods_17_tfalbrent, AV99Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel, lV100Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote, AV101Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel, lV102Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar, AV103Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel, lV104Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod, AV105Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel, AV106Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu, AV107Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to, AV108Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara, AV109Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to, lV110Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej, AV111Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel});
      GRID_nRecordCount = H01YN3_AGRID_nRecordCount[0] ;
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
      AV82Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod = AV22TFBarPieCod ;
      AV83Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel = AV23TFBarPieCod_Sel ;
      AV84Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod = AV24TFAlbRecCod ;
      AV85Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to = AV25TFAlbRecCod_To ;
      AV86Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan = AV26TFBarKilLan ;
      AV87Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to = AV27TFBarKilLan_To ;
      AV88Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan = AV28TFBarMetLan ;
      AV89Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to = AV29TFBarMetLan_To ;
      AV90Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil = AV30TFBarPieKil ;
      AV91Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to = AV31TFBarPieKil_To ;
      AV92Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet = AV32TFBarPieMet ;
      AV93Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to = AV33TFBarPieMet_To ;
      AV94Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc = AV34TFBarPieLoc ;
      AV95Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel = AV35TFBarPieLoc_Sel ;
      AV96Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest = AV36TFBarPieEst ;
      AV97Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to = AV37TFBarPieEst_To ;
      AV98Produccion_consultadeproduccion_almacentejidods_17_tfalbrent = AV38TFAlbREnt ;
      AV99Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel = AV39TFAlbREnt_Sel ;
      AV100Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote = AV40TFAlbRLote ;
      AV101Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel = AV41TFAlbRLote_Sel ;
      AV102Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar = AV42TFAlbRTelar ;
      AV103Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel = AV43TFAlbRTelar_Sel ;
      AV104Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod = AV44TFAlbRMdlCod ;
      AV105Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel = AV45TFAlbRMdlCod_Sel ;
      AV106Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu = AV46TFAlbRLu ;
      AV107Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to = AV47TFAlbRLu_To ;
      AV108Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara = AV48TFAlbRTara ;
      AV109Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to = AV49TFAlbRTara_To ;
      AV110Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej = AV50TFAlbMaqTej ;
      AV111Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel = AV51TFAlbMaqTej_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV56Emprcod, AV57BarCod, AV58BarCodReo, AV59BarCodPar, AV19ColumnsSelector, AV22TFBarPieCod, AV23TFBarPieCod_Sel, AV24TFAlbRecCod, AV25TFAlbRecCod_To, AV26TFBarKilLan, AV27TFBarKilLan_To, AV28TFBarMetLan, AV29TFBarMetLan_To, AV30TFBarPieKil, AV31TFBarPieKil_To, AV32TFBarPieMet, AV33TFBarPieMet_To, AV34TFBarPieLoc, AV35TFBarPieLoc_Sel, AV36TFBarPieEst, AV37TFBarPieEst_To, AV38TFAlbREnt, AV39TFAlbREnt_Sel, AV40TFAlbRLote, AV41TFAlbRLote_Sel, AV42TFAlbRTelar, AV43TFAlbRTelar_Sel, AV44TFAlbRMdlCod, AV45TFAlbRMdlCod_Sel, AV46TFAlbRLu, AV47TFAlbRLu_To, AV48TFAlbRTara, AV49TFAlbRTara_To, AV50TFAlbMaqTej, AV51TFAlbMaqTej_Sel, AV78Pgmname, AV12OrderedBy, AV13OrderedDsc, AV69CliCod, AV70CliNom, AV71PedidoCliente, AV72BarSer, AV73BarSerDsc, AV74BarColNom, AV75BarColNum, AV60Moda21, AV61TotBarKilLan, AV63TotBarMetLan, AV65TotBarPieKil, AV67TotBarPieMet, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV82Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod = AV22TFBarPieCod ;
      AV83Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel = AV23TFBarPieCod_Sel ;
      AV84Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod = AV24TFAlbRecCod ;
      AV85Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to = AV25TFAlbRecCod_To ;
      AV86Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan = AV26TFBarKilLan ;
      AV87Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to = AV27TFBarKilLan_To ;
      AV88Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan = AV28TFBarMetLan ;
      AV89Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to = AV29TFBarMetLan_To ;
      AV90Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil = AV30TFBarPieKil ;
      AV91Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to = AV31TFBarPieKil_To ;
      AV92Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet = AV32TFBarPieMet ;
      AV93Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to = AV33TFBarPieMet_To ;
      AV94Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc = AV34TFBarPieLoc ;
      AV95Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel = AV35TFBarPieLoc_Sel ;
      AV96Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest = AV36TFBarPieEst ;
      AV97Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to = AV37TFBarPieEst_To ;
      AV98Produccion_consultadeproduccion_almacentejidods_17_tfalbrent = AV38TFAlbREnt ;
      AV99Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel = AV39TFAlbREnt_Sel ;
      AV100Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote = AV40TFAlbRLote ;
      AV101Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel = AV41TFAlbRLote_Sel ;
      AV102Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar = AV42TFAlbRTelar ;
      AV103Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel = AV43TFAlbRTelar_Sel ;
      AV104Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod = AV44TFAlbRMdlCod ;
      AV105Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel = AV45TFAlbRMdlCod_Sel ;
      AV106Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu = AV46TFAlbRLu ;
      AV107Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to = AV47TFAlbRLu_To ;
      AV108Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara = AV48TFAlbRTara ;
      AV109Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to = AV49TFAlbRTara_To ;
      AV110Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej = AV50TFAlbMaqTej ;
      AV111Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel = AV51TFAlbMaqTej_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV56Emprcod, AV57BarCod, AV58BarCodReo, AV59BarCodPar, AV19ColumnsSelector, AV22TFBarPieCod, AV23TFBarPieCod_Sel, AV24TFAlbRecCod, AV25TFAlbRecCod_To, AV26TFBarKilLan, AV27TFBarKilLan_To, AV28TFBarMetLan, AV29TFBarMetLan_To, AV30TFBarPieKil, AV31TFBarPieKil_To, AV32TFBarPieMet, AV33TFBarPieMet_To, AV34TFBarPieLoc, AV35TFBarPieLoc_Sel, AV36TFBarPieEst, AV37TFBarPieEst_To, AV38TFAlbREnt, AV39TFAlbREnt_Sel, AV40TFAlbRLote, AV41TFAlbRLote_Sel, AV42TFAlbRTelar, AV43TFAlbRTelar_Sel, AV44TFAlbRMdlCod, AV45TFAlbRMdlCod_Sel, AV46TFAlbRLu, AV47TFAlbRLu_To, AV48TFAlbRTara, AV49TFAlbRTara_To, AV50TFAlbMaqTej, AV51TFAlbMaqTej_Sel, AV78Pgmname, AV12OrderedBy, AV13OrderedDsc, AV69CliCod, AV70CliNom, AV71PedidoCliente, AV72BarSer, AV73BarSerDsc, AV74BarColNom, AV75BarColNum, AV60Moda21, AV61TotBarKilLan, AV63TotBarMetLan, AV65TotBarPieKil, AV67TotBarPieMet, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV82Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod = AV22TFBarPieCod ;
      AV83Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel = AV23TFBarPieCod_Sel ;
      AV84Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod = AV24TFAlbRecCod ;
      AV85Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to = AV25TFAlbRecCod_To ;
      AV86Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan = AV26TFBarKilLan ;
      AV87Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to = AV27TFBarKilLan_To ;
      AV88Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan = AV28TFBarMetLan ;
      AV89Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to = AV29TFBarMetLan_To ;
      AV90Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil = AV30TFBarPieKil ;
      AV91Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to = AV31TFBarPieKil_To ;
      AV92Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet = AV32TFBarPieMet ;
      AV93Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to = AV33TFBarPieMet_To ;
      AV94Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc = AV34TFBarPieLoc ;
      AV95Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel = AV35TFBarPieLoc_Sel ;
      AV96Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest = AV36TFBarPieEst ;
      AV97Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to = AV37TFBarPieEst_To ;
      AV98Produccion_consultadeproduccion_almacentejidods_17_tfalbrent = AV38TFAlbREnt ;
      AV99Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel = AV39TFAlbREnt_Sel ;
      AV100Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote = AV40TFAlbRLote ;
      AV101Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel = AV41TFAlbRLote_Sel ;
      AV102Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar = AV42TFAlbRTelar ;
      AV103Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel = AV43TFAlbRTelar_Sel ;
      AV104Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod = AV44TFAlbRMdlCod ;
      AV105Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel = AV45TFAlbRMdlCod_Sel ;
      AV106Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu = AV46TFAlbRLu ;
      AV107Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to = AV47TFAlbRLu_To ;
      AV108Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara = AV48TFAlbRTara ;
      AV109Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to = AV49TFAlbRTara_To ;
      AV110Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej = AV50TFAlbMaqTej ;
      AV111Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel = AV51TFAlbMaqTej_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV56Emprcod, AV57BarCod, AV58BarCodReo, AV59BarCodPar, AV19ColumnsSelector, AV22TFBarPieCod, AV23TFBarPieCod_Sel, AV24TFAlbRecCod, AV25TFAlbRecCod_To, AV26TFBarKilLan, AV27TFBarKilLan_To, AV28TFBarMetLan, AV29TFBarMetLan_To, AV30TFBarPieKil, AV31TFBarPieKil_To, AV32TFBarPieMet, AV33TFBarPieMet_To, AV34TFBarPieLoc, AV35TFBarPieLoc_Sel, AV36TFBarPieEst, AV37TFBarPieEst_To, AV38TFAlbREnt, AV39TFAlbREnt_Sel, AV40TFAlbRLote, AV41TFAlbRLote_Sel, AV42TFAlbRTelar, AV43TFAlbRTelar_Sel, AV44TFAlbRMdlCod, AV45TFAlbRMdlCod_Sel, AV46TFAlbRLu, AV47TFAlbRLu_To, AV48TFAlbRTara, AV49TFAlbRTara_To, AV50TFAlbMaqTej, AV51TFAlbMaqTej_Sel, AV78Pgmname, AV12OrderedBy, AV13OrderedDsc, AV69CliCod, AV70CliNom, AV71PedidoCliente, AV72BarSer, AV73BarSerDsc, AV74BarColNom, AV75BarColNum, AV60Moda21, AV61TotBarKilLan, AV63TotBarMetLan, AV65TotBarPieKil, AV67TotBarPieMet, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV82Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod = AV22TFBarPieCod ;
      AV83Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel = AV23TFBarPieCod_Sel ;
      AV84Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod = AV24TFAlbRecCod ;
      AV85Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to = AV25TFAlbRecCod_To ;
      AV86Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan = AV26TFBarKilLan ;
      AV87Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to = AV27TFBarKilLan_To ;
      AV88Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan = AV28TFBarMetLan ;
      AV89Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to = AV29TFBarMetLan_To ;
      AV90Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil = AV30TFBarPieKil ;
      AV91Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to = AV31TFBarPieKil_To ;
      AV92Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet = AV32TFBarPieMet ;
      AV93Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to = AV33TFBarPieMet_To ;
      AV94Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc = AV34TFBarPieLoc ;
      AV95Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel = AV35TFBarPieLoc_Sel ;
      AV96Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest = AV36TFBarPieEst ;
      AV97Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to = AV37TFBarPieEst_To ;
      AV98Produccion_consultadeproduccion_almacentejidods_17_tfalbrent = AV38TFAlbREnt ;
      AV99Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel = AV39TFAlbREnt_Sel ;
      AV100Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote = AV40TFAlbRLote ;
      AV101Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel = AV41TFAlbRLote_Sel ;
      AV102Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar = AV42TFAlbRTelar ;
      AV103Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel = AV43TFAlbRTelar_Sel ;
      AV104Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod = AV44TFAlbRMdlCod ;
      AV105Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel = AV45TFAlbRMdlCod_Sel ;
      AV106Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu = AV46TFAlbRLu ;
      AV107Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to = AV47TFAlbRLu_To ;
      AV108Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara = AV48TFAlbRTara ;
      AV109Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to = AV49TFAlbRTara_To ;
      AV110Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej = AV50TFAlbMaqTej ;
      AV111Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel = AV51TFAlbMaqTej_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV56Emprcod, AV57BarCod, AV58BarCodReo, AV59BarCodPar, AV19ColumnsSelector, AV22TFBarPieCod, AV23TFBarPieCod_Sel, AV24TFAlbRecCod, AV25TFAlbRecCod_To, AV26TFBarKilLan, AV27TFBarKilLan_To, AV28TFBarMetLan, AV29TFBarMetLan_To, AV30TFBarPieKil, AV31TFBarPieKil_To, AV32TFBarPieMet, AV33TFBarPieMet_To, AV34TFBarPieLoc, AV35TFBarPieLoc_Sel, AV36TFBarPieEst, AV37TFBarPieEst_To, AV38TFAlbREnt, AV39TFAlbREnt_Sel, AV40TFAlbRLote, AV41TFAlbRLote_Sel, AV42TFAlbRTelar, AV43TFAlbRTelar_Sel, AV44TFAlbRMdlCod, AV45TFAlbRMdlCod_Sel, AV46TFAlbRLu, AV47TFAlbRLu_To, AV48TFAlbRTara, AV49TFAlbRTara_To, AV50TFAlbMaqTej, AV51TFAlbMaqTej_Sel, AV78Pgmname, AV12OrderedBy, AV13OrderedDsc, AV69CliCod, AV70CliNom, AV71PedidoCliente, AV72BarSer, AV73BarSerDsc, AV74BarColNom, AV75BarColNum, AV60Moda21, AV61TotBarKilLan, AV63TotBarMetLan, AV65TotBarPieKil, AV67TotBarPieMet, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV82Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod = AV22TFBarPieCod ;
      AV83Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel = AV23TFBarPieCod_Sel ;
      AV84Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod = AV24TFAlbRecCod ;
      AV85Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to = AV25TFAlbRecCod_To ;
      AV86Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan = AV26TFBarKilLan ;
      AV87Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to = AV27TFBarKilLan_To ;
      AV88Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan = AV28TFBarMetLan ;
      AV89Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to = AV29TFBarMetLan_To ;
      AV90Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil = AV30TFBarPieKil ;
      AV91Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to = AV31TFBarPieKil_To ;
      AV92Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet = AV32TFBarPieMet ;
      AV93Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to = AV33TFBarPieMet_To ;
      AV94Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc = AV34TFBarPieLoc ;
      AV95Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel = AV35TFBarPieLoc_Sel ;
      AV96Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest = AV36TFBarPieEst ;
      AV97Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to = AV37TFBarPieEst_To ;
      AV98Produccion_consultadeproduccion_almacentejidods_17_tfalbrent = AV38TFAlbREnt ;
      AV99Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel = AV39TFAlbREnt_Sel ;
      AV100Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote = AV40TFAlbRLote ;
      AV101Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel = AV41TFAlbRLote_Sel ;
      AV102Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar = AV42TFAlbRTelar ;
      AV103Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel = AV43TFAlbRTelar_Sel ;
      AV104Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod = AV44TFAlbRMdlCod ;
      AV105Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel = AV45TFAlbRMdlCod_Sel ;
      AV106Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu = AV46TFAlbRLu ;
      AV107Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to = AV47TFAlbRLu_To ;
      AV108Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara = AV48TFAlbRTara ;
      AV109Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to = AV49TFAlbRTara_To ;
      AV110Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej = AV50TFAlbMaqTej ;
      AV111Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel = AV51TFAlbMaqTej_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV56Emprcod, AV57BarCod, AV58BarCodReo, AV59BarCodPar, AV19ColumnsSelector, AV22TFBarPieCod, AV23TFBarPieCod_Sel, AV24TFAlbRecCod, AV25TFAlbRecCod_To, AV26TFBarKilLan, AV27TFBarKilLan_To, AV28TFBarMetLan, AV29TFBarMetLan_To, AV30TFBarPieKil, AV31TFBarPieKil_To, AV32TFBarPieMet, AV33TFBarPieMet_To, AV34TFBarPieLoc, AV35TFBarPieLoc_Sel, AV36TFBarPieEst, AV37TFBarPieEst_To, AV38TFAlbREnt, AV39TFAlbREnt_Sel, AV40TFAlbRLote, AV41TFAlbRLote_Sel, AV42TFAlbRTelar, AV43TFAlbRTelar_Sel, AV44TFAlbRMdlCod, AV45TFAlbRMdlCod_Sel, AV46TFAlbRLu, AV47TFAlbRLu_To, AV48TFAlbRTara, AV49TFAlbRTara_To, AV50TFAlbMaqTej, AV51TFAlbMaqTej_Sel, AV78Pgmname, AV12OrderedBy, AV13OrderedDsc, AV69CliCod, AV70CliNom, AV71PedidoCliente, AV72BarSer, AV73BarSerDsc, AV74BarColNom, AV75BarColNum, AV60Moda21, AV61TotBarKilLan, AV63TotBarMetLan, AV65TotBarPieKil, AV67TotBarPieMet, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV78Pgmname = "Produccion.ConsultadeProduccion_AlmacenTejido" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78Pgmname", AV78Pgmname);
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
      edtavTotvaluebarkillan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebarkillan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarkillan_Enabled), 5, 0), true);
      edtavTotvaluebarmetlan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebarmetlan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarmetlan_Enabled), 5, 0), true);
      edtavTotvaluebarpiekil_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebarpiekil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarpiekil_Enabled), 5, 0), true);
      edtavTotvaluebarpiemet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebarpiemet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarpiemet_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1YN0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e171YN2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV52DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV19ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_87 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_87"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV54GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV55GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV56Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV56Emprcod") ;
         wcpOAV57BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV57BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV58BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV58BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV59BarCodPar = httpContext.cgiGet( sPrefix+"wcpOAV59BarCodPar") ;
         wcpOAV69CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV69CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV70CliNom = httpContext.cgiGet( sPrefix+"wcpOAV70CliNom") ;
         wcpOAV71PedidoCliente = httpContext.cgiGet( sPrefix+"wcpOAV71PedidoCliente") ;
         wcpOAV72BarSer = httpContext.cgiGet( sPrefix+"wcpOAV72BarSer") ;
         wcpOAV73BarSerDsc = httpContext.cgiGet( sPrefix+"wcpOAV73BarSerDsc") ;
         wcpOAV74BarColNom = httpContext.cgiGet( sPrefix+"wcpOAV74BarColNom") ;
         wcpOAV75BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV75BarColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         AV62TotValueBarKilLan = httpContext.cgiGet( edtavTotvaluebarkillan_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TotValueBarKilLan", AV62TotValueBarKilLan);
         AV64TotValueBarMetLan = httpContext.cgiGet( edtavTotvaluebarmetlan_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TotValueBarMetLan", AV64TotValueBarMetLan);
         AV66TotValueBarPieKil = httpContext.cgiGet( edtavTotvaluebarpiekil_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TotValueBarPieKil", AV66TotValueBarPieKil);
         AV68TotValueBarPieMet = httpContext.cgiGet( edtavTotvaluebarpiemet_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TotValueBarPieMet", AV68TotValueBarPieMet);
         AV78Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78Pgmname", AV78Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ConsultadeProduccion_AlmacenTejido");
         AV78Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78Pgmname", AV78Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV78Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("produccion\\consultadeproduccion_almacentejido:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e171YN2 ();
      if (returnInSub) return;
   }

   public void e171YN2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_int1 = (byte)(AV60Moda21) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV56Emprcod, httpContext.getMessage( "MODA21", ""), GXv_int2) ;
      consultadeproduccion_almacentejido_impl.this.GXt_int1 = GXv_int2[0] ;
      AV60Moda21 = GXt_int1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60Moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60Moda21), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV60Moda21), "ZZZ9")));
      GXt_char3 = AV79Station ;
      GXv_char4[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      consultadeproduccion_almacentejido_impl.this.GXt_char3 = GXv_char4[0] ;
      AV79Station = GXt_char3 ;
      GXv_char4[0] = AV56Emprcod ;
      GXv_char5[0] = AV80Emprnom ;
      GXv_char6[0] = AV81Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV79Station, GXv_char4, GXv_char5, GXv_char6) ;
      consultadeproduccion_almacentejido_impl.this.AV56Emprcod = GXv_char4[0] ;
      consultadeproduccion_almacentejido_impl.this.AV80Emprnom = GXv_char5[0] ;
      consultadeproduccion_almacentejido_impl.this.AV81Usurcod = GXv_char6[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56Emprcod", AV56Emprcod);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = AV52DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] ;
      AV52DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e181YN2( )
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
      if ( GXutil.strcmp(AV21Session.getValue("Produccion.ConsultadeProduccion_AlmacenTejidoColumnsSelector"), "") != 0 )
      {
         AV17ColumnsSelectorXML = AV21Session.getValue("Produccion.ConsultadeProduccion_AlmacenTejidoColumnsSelector") ;
         AV19ColumnsSelector.fromxml(AV17ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S152 ();
         if (returnInSub) return;
      }
      edtBarPieCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarPieCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieCod_Visible), 5, 0), !bGXsfl_87_Refreshing);
      edtAlbRecCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRecCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Visible), 5, 0), !bGXsfl_87_Refreshing);
      edtBarKilLan_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarKilLan_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarKilLan_Visible), 5, 0), !bGXsfl_87_Refreshing);
      edtBarMetLan_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarMetLan_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMetLan_Visible), 5, 0), !bGXsfl_87_Refreshing);
      edtBarPieKil_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarPieKil_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieKil_Visible), 5, 0), !bGXsfl_87_Refreshing);
      edtBarPieMet_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarPieMet_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieMet_Visible), 5, 0), !bGXsfl_87_Refreshing);
      edtBarPieLoc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarPieLoc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieLoc_Visible), 5, 0), !bGXsfl_87_Refreshing);
      edtBarPieEst_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarPieEst_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieEst_Visible), 5, 0), !bGXsfl_87_Refreshing);
      edtAlbREnt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbREnt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt_Visible), 5, 0), !bGXsfl_87_Refreshing);
      edtAlbRLote_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRLote_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLote_Visible), 5, 0), !bGXsfl_87_Refreshing);
      edtAlbRTelar_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRTelar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRTelar_Visible), 5, 0), !bGXsfl_87_Refreshing);
      edtAlbRMdlCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRMdlCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRMdlCod_Visible), 5, 0), !bGXsfl_87_Refreshing);
      edtAlbRLu_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRLu_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLu_Visible), 5, 0), !bGXsfl_87_Refreshing);
      edtAlbRTara_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRTara_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRTara_Visible), 5, 0), !bGXsfl_87_Refreshing);
      edtAlbMaqTej_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbMaqTej_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbMaqTej_Visible), 5, 0), !bGXsfl_87_Refreshing);
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S162 ();
      if (returnInSub) return;
      AV54GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54GridCurrentPage), 10, 0));
      AV55GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55GridPageCount), 10, 0));
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S172 ();
      if (returnInSub) return;
      AV82Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod = AV22TFBarPieCod ;
      AV83Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel = AV23TFBarPieCod_Sel ;
      AV84Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod = AV24TFAlbRecCod ;
      AV85Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to = AV25TFAlbRecCod_To ;
      AV86Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan = AV26TFBarKilLan ;
      AV87Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to = AV27TFBarKilLan_To ;
      AV88Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan = AV28TFBarMetLan ;
      AV89Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to = AV29TFBarMetLan_To ;
      AV90Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil = AV30TFBarPieKil ;
      AV91Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to = AV31TFBarPieKil_To ;
      AV92Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet = AV32TFBarPieMet ;
      AV93Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to = AV33TFBarPieMet_To ;
      AV94Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc = AV34TFBarPieLoc ;
      AV95Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel = AV35TFBarPieLoc_Sel ;
      AV96Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest = AV36TFBarPieEst ;
      AV97Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to = AV37TFBarPieEst_To ;
      AV98Produccion_consultadeproduccion_almacentejidods_17_tfalbrent = AV38TFAlbREnt ;
      AV99Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel = AV39TFAlbREnt_Sel ;
      AV100Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote = AV40TFAlbRLote ;
      AV101Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel = AV41TFAlbRLote_Sel ;
      AV102Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar = AV42TFAlbRTelar ;
      AV103Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel = AV43TFAlbRTelar_Sel ;
      AV104Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod = AV44TFAlbRMdlCod ;
      AV105Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel = AV45TFAlbRMdlCod_Sel ;
      AV106Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu = AV46TFAlbRLu ;
      AV107Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to = AV47TFAlbRLu_To ;
      AV108Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara = AV48TFAlbRTara ;
      AV109Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to = AV49TFAlbRTara_To ;
      AV110Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej = AV50TFAlbMaqTej ;
      AV111Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel = AV51TFAlbMaqTej_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV19ColumnsSelector", AV19ColumnsSelector);
   }

   public void e111YN2( )
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
         AV53PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV53PageToGo) ;
      }
   }

   public void e121YN2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e131YN2( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarPieCod") == 0 )
         {
            AV22TFBarPieCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22TFBarPieCod", AV22TFBarPieCod);
            AV23TFBarPieCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23TFBarPieCod_Sel", AV23TFBarPieCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRecCod") == 0 )
         {
            AV24TFAlbRecCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24TFAlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24TFAlbRecCod), 8, 0));
            AV25TFAlbRecCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25TFAlbRecCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25TFAlbRecCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarKilLan") == 0 )
         {
            AV26TFBarKilLan = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFBarKilLan", GXutil.ltrimstr( AV26TFBarKilLan, 9, 2));
            AV27TFBarKilLan_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFBarKilLan_To", GXutil.ltrimstr( AV27TFBarKilLan_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarMetLan") == 0 )
         {
            AV28TFBarMetLan = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFBarMetLan", GXutil.ltrimstr( AV28TFBarMetLan, 9, 2));
            AV29TFBarMetLan_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFBarMetLan_To", GXutil.ltrimstr( AV29TFBarMetLan_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarPieKil") == 0 )
         {
            AV30TFBarPieKil = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFBarPieKil", GXutil.ltrimstr( AV30TFBarPieKil, 9, 2));
            AV31TFBarPieKil_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFBarPieKil_To", GXutil.ltrimstr( AV31TFBarPieKil_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarPieMet") == 0 )
         {
            AV32TFBarPieMet = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFBarPieMet", GXutil.ltrimstr( AV32TFBarPieMet, 9, 2));
            AV33TFBarPieMet_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFBarPieMet_To", GXutil.ltrimstr( AV33TFBarPieMet_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarPieLoc") == 0 )
         {
            AV34TFBarPieLoc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFBarPieLoc", AV34TFBarPieLoc);
            AV35TFBarPieLoc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFBarPieLoc_Sel", AV35TFBarPieLoc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarPieEst") == 0 )
         {
            AV36TFBarPieEst = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFBarPieEst", GXutil.str( AV36TFBarPieEst, 1, 0));
            AV37TFBarPieEst_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFBarPieEst_To", GXutil.str( AV37TFBarPieEst_To, 1, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbREnt") == 0 )
         {
            AV38TFAlbREnt = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFAlbREnt", AV38TFAlbREnt);
            AV39TFAlbREnt_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFAlbREnt_Sel", AV39TFAlbREnt_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRLote") == 0 )
         {
            AV40TFAlbRLote = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFAlbRLote", AV40TFAlbRLote);
            AV41TFAlbRLote_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFAlbRLote_Sel", AV41TFAlbRLote_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRTelar") == 0 )
         {
            AV42TFAlbRTelar = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFAlbRTelar", AV42TFAlbRTelar);
            AV43TFAlbRTelar_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFAlbRTelar_Sel", AV43TFAlbRTelar_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRMdlCod") == 0 )
         {
            AV44TFAlbRMdlCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFAlbRMdlCod", AV44TFAlbRMdlCod);
            AV45TFAlbRMdlCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFAlbRMdlCod_Sel", AV45TFAlbRMdlCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRLu") == 0 )
         {
            AV46TFAlbRLu = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFAlbRLu", GXutil.ltrimstr( AV46TFAlbRLu, 6, 2));
            AV47TFAlbRLu_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFAlbRLu_To", GXutil.ltrimstr( AV47TFAlbRLu_To, 6, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRTara") == 0 )
         {
            AV48TFAlbRTara = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFAlbRTara", GXutil.ltrimstr( AV48TFAlbRTara, 6, 2));
            AV49TFAlbRTara_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFAlbRTara_To", GXutil.ltrimstr( AV49TFAlbRTara_To, 6, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbMaqTej") == 0 )
         {
            AV50TFAlbMaqTej = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFAlbMaqTej", AV50TFAlbMaqTej);
            AV51TFAlbMaqTej_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFAlbMaqTej_Sel", AV51TFAlbMaqTej_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e191YN2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(87) ;
      }
      sendrow_872( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_87_Refreshing )
      {
         httpContext.doAjaxLoad(87, GridRow);
      }
   }

   public void e141YN2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV17ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV19ColumnsSelector.fromJSonString(AV17ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "Produccion.ConsultadeProduccion_AlmacenTejidoColumnsSelector", ((GXutil.strcmp("", AV17ColumnsSelectorXML)==0) ? "" : AV19ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV19ColumnsSelector", AV19ColumnsSelector);
   }

   public void e151YN2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char6[0] = AV15ExcelFilename ;
      GXv_char5[0] = AV16ErrorMessage ;
      new app.produccion.consultadeproduccion_almacentejidoexport(remoteHandle, context).execute( GXv_char6, GXv_char5) ;
      consultadeproduccion_almacentejido_impl.this.AV15ExcelFilename = GXv_char6[0] ;
      consultadeproduccion_almacentejido_impl.this.AV16ErrorMessage = GXv_char5[0] ;
      if ( GXutil.strcmp(AV15ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV15ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV16ErrorMessage);
      }
   }

   public void e161YN2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.produccion.consultadeproduccion_almacentejidoexportcsv", new String[] {}, new String[] {}) );
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
      AV19ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "BarPieCod", "", "Nº Pieza", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "AlbRecCod", "", "N Recepcion", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "BarKilLan", "", "Kgs. Lanz.", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "BarMetLan", "", "Mts. Lanz.", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "BarPieKil", "", "Kgs", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "BarPieMet", "", "Mts", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "BarPieLoc", "", "Localizacion", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "BarPieEst", "", "E", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "AlbREnt", "", "Nº Doc. Entr.", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      if ( AV60Moda21 == 1 )
      {
         GXv_SdtWWPColumnsSelector10[0] = AV19ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "AlbRLote", "", "Lote", true, "") ;
         AV19ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector10[0] = AV19ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "", "", "", false, "") ;
         AV19ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
         AV40TFAlbRLote = "" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFAlbRLote", AV40TFAlbRLote);
         AV41TFAlbRLote_Sel = "" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFAlbRLote_Sel", AV41TFAlbRLote_Sel);
      }
      if ( AV60Moda21 == 1 )
      {
         GXv_SdtWWPColumnsSelector10[0] = AV19ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "AlbRTelar", "", "Fio", true, "") ;
         AV19ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector10[0] = AV19ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "", "", "", false, "") ;
         AV19ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
         AV42TFAlbRTelar = "" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFAlbRTelar", AV42TFAlbRTelar);
         AV43TFAlbRTelar_Sel = "" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFAlbRTelar_Sel", AV43TFAlbRTelar_Sel);
      }
      if ( AV60Moda21 == 1 )
      {
         GXv_SdtWWPColumnsSelector10[0] = AV19ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "AlbRMdlCod", "", "Jogo", true, "") ;
         AV19ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector10[0] = AV19ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "", "", "", false, "") ;
         AV19ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
         AV44TFAlbRMdlCod = "" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFAlbRMdlCod", AV44TFAlbRMdlCod);
         AV45TFAlbRMdlCod_Sel = "" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFAlbRMdlCod_Sel", AV45TFAlbRMdlCod_Sel);
      }
      if ( AV60Moda21 == 1 )
      {
         GXv_SdtWWPColumnsSelector10[0] = AV19ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "AlbRLu", "", "Pgadas", true, "") ;
         AV19ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector10[0] = AV19ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "", "", "", false, "") ;
         AV19ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
         AV46TFAlbRLu = DecimalUtil.ZERO ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFAlbRLu", GXutil.ltrimstr( AV46TFAlbRLu, 6, 2));
         AV47TFAlbRLu_To = DecimalUtil.ZERO ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFAlbRLu_To", GXutil.ltrimstr( AV47TFAlbRLu_To, 6, 2));
      }
      if ( AV60Moda21 == 1 )
      {
         GXv_SdtWWPColumnsSelector10[0] = AV19ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "AlbRTara", "", "LFA", true, "") ;
         AV19ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector10[0] = AV19ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "", "", "", false, "") ;
         AV19ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
         AV48TFAlbRTara = DecimalUtil.ZERO ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFAlbRTara", GXutil.ltrimstr( AV48TFAlbRTara, 6, 2));
         AV49TFAlbRTara_To = DecimalUtil.ZERO ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFAlbRTara_To", GXutil.ltrimstr( AV49TFAlbRTara_To, 6, 2));
      }
      if ( AV60Moda21 == 1 )
      {
         GXv_SdtWWPColumnsSelector10[0] = AV19ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "AlbMaqTej", "", "Maq", true, "") ;
         AV19ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector10[0] = AV19ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "", "", "", false, "") ;
         AV19ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
         AV50TFAlbMaqTej = "" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFAlbMaqTej", AV50TFAlbMaqTej);
         AV51TFAlbMaqTej_Sel = "" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFAlbMaqTej_Sel", AV51TFAlbMaqTej_Sel);
      }
      GXt_char3 = AV18UserCustomValue ;
      GXv_char6[0] = GXt_char3 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Produccion.ConsultadeProduccion_AlmacenTejidoColumnsSelector", GXv_char6) ;
      consultadeproduccion_almacentejido_impl.this.GXt_char3 = GXv_char6[0] ;
      AV18UserCustomValue = GXt_char3 ;
      if ( ! ( (GXutil.strcmp("", AV18UserCustomValue)==0) ) )
      {
         AV20ColumnsSelectorAux.fromxml(AV18UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector11[0] = AV19ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, GXv_SdtWWPColumnsSelector11) ;
         AV20ColumnsSelectorAux = GXv_SdtWWPColumnsSelector10[0] ;
         AV19ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      }
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV21Session.getValue(AV78Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV78Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV21Session.getValue(AV78Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S132 ();
      if (returnInSub) return;
      AV112GXV1 = 1 ;
      while ( AV112GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV112GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIECOD") == 0 )
         {
            AV22TFBarPieCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22TFBarPieCod", AV22TFBarPieCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIECOD_SEL") == 0 )
         {
            AV23TFBarPieCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23TFBarPieCod_Sel", AV23TFBarPieCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECCOD") == 0 )
         {
            AV24TFAlbRecCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24TFAlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24TFAlbRecCod), 8, 0));
            AV25TFAlbRecCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25TFAlbRecCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25TFAlbRecCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARKILLAN") == 0 )
         {
            AV26TFBarKilLan = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFBarKilLan", GXutil.ltrimstr( AV26TFBarKilLan, 9, 2));
            AV27TFBarKilLan_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFBarKilLan_To", GXutil.ltrimstr( AV27TFBarKilLan_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMETLAN") == 0 )
         {
            AV28TFBarMetLan = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFBarMetLan", GXutil.ltrimstr( AV28TFBarMetLan, 9, 2));
            AV29TFBarMetLan_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFBarMetLan_To", GXutil.ltrimstr( AV29TFBarMetLan_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIEKIL") == 0 )
         {
            AV30TFBarPieKil = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFBarPieKil", GXutil.ltrimstr( AV30TFBarPieKil, 9, 2));
            AV31TFBarPieKil_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFBarPieKil_To", GXutil.ltrimstr( AV31TFBarPieKil_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIEMET") == 0 )
         {
            AV32TFBarPieMet = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFBarPieMet", GXutil.ltrimstr( AV32TFBarPieMet, 9, 2));
            AV33TFBarPieMet_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFBarPieMet_To", GXutil.ltrimstr( AV33TFBarPieMet_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIELOC") == 0 )
         {
            AV34TFBarPieLoc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFBarPieLoc", AV34TFBarPieLoc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIELOC_SEL") == 0 )
         {
            AV35TFBarPieLoc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFBarPieLoc_Sel", AV35TFBarPieLoc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIEEST") == 0 )
         {
            AV36TFBarPieEst = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFBarPieEst", GXutil.str( AV36TFBarPieEst, 1, 0));
            AV37TFBarPieEst_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFBarPieEst_To", GXutil.str( AV37TFBarPieEst_To, 1, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRENT") == 0 )
         {
            AV38TFAlbREnt = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFAlbREnt", AV38TFAlbREnt);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRENT_SEL") == 0 )
         {
            AV39TFAlbREnt_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFAlbREnt_Sel", AV39TFAlbREnt_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRLOTE") == 0 )
         {
            AV40TFAlbRLote = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFAlbRLote", AV40TFAlbRLote);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRLOTE_SEL") == 0 )
         {
            AV41TFAlbRLote_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFAlbRLote_Sel", AV41TFAlbRLote_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRTELAR") == 0 )
         {
            AV42TFAlbRTelar = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFAlbRTelar", AV42TFAlbRTelar);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRTELAR_SEL") == 0 )
         {
            AV43TFAlbRTelar_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFAlbRTelar_Sel", AV43TFAlbRTelar_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRMDLCOD") == 0 )
         {
            AV44TFAlbRMdlCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFAlbRMdlCod", AV44TFAlbRMdlCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRMDLCOD_SEL") == 0 )
         {
            AV45TFAlbRMdlCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFAlbRMdlCod_Sel", AV45TFAlbRMdlCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRLU") == 0 )
         {
            AV46TFAlbRLu = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFAlbRLu", GXutil.ltrimstr( AV46TFAlbRLu, 6, 2));
            AV47TFAlbRLu_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFAlbRLu_To", GXutil.ltrimstr( AV47TFAlbRLu_To, 6, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRTARA") == 0 )
         {
            AV48TFAlbRTara = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFAlbRTara", GXutil.ltrimstr( AV48TFAlbRTara, 6, 2));
            AV49TFAlbRTara_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFAlbRTara_To", GXutil.ltrimstr( AV49TFAlbRTara_To, 6, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBMAQTEJ") == 0 )
         {
            AV50TFAlbMaqTej = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFAlbMaqTej", AV50TFAlbMaqTej);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBMAQTEJ_SEL") == 0 )
         {
            AV51TFAlbMaqTej_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFAlbMaqTej_Sel", AV51TFAlbMaqTej_Sel);
         }
         AV112GXV1 = (int)(AV112GXV1+1) ;
      }
      GXt_char3 = "" ;
      GXv_char6[0] = GXt_char3 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV23TFBarPieCod_Sel)==0), AV23TFBarPieCod_Sel, GXv_char6) ;
      consultadeproduccion_almacentejido_impl.this.GXt_char3 = GXv_char6[0] ;
      GXt_char12 = "" ;
      GXv_char5[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV35TFBarPieLoc_Sel)==0), AV35TFBarPieLoc_Sel, GXv_char5) ;
      consultadeproduccion_almacentejido_impl.this.GXt_char12 = GXv_char5[0] ;
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV39TFAlbREnt_Sel)==0), AV39TFAlbREnt_Sel, GXv_char4) ;
      consultadeproduccion_almacentejido_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV41TFAlbRLote_Sel)==0), AV41TFAlbRLote_Sel, GXv_char15) ;
      consultadeproduccion_almacentejido_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV43TFAlbRTelar_Sel)==0), AV43TFAlbRTelar_Sel, GXv_char17) ;
      consultadeproduccion_almacentejido_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV45TFAlbRMdlCod_Sel)==0), AV45TFAlbRMdlCod_Sel, GXv_char19) ;
      consultadeproduccion_almacentejido_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV51TFAlbMaqTej_Sel)==0), AV51TFAlbMaqTej_Sel, GXv_char21) ;
      consultadeproduccion_almacentejido_impl.this.GXt_char20 = GXv_char21[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char3+"||||||"+GXt_char12+"||"+GXt_char13+"|"+GXt_char14+"|"+GXt_char16+"|"+GXt_char18+"|||"+GXt_char20 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV22TFBarPieCod)==0), AV22TFBarPieCod, GXv_char21) ;
      consultadeproduccion_almacentejido_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV34TFBarPieLoc)==0), AV34TFBarPieLoc, GXv_char19) ;
      consultadeproduccion_almacentejido_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV38TFAlbREnt)==0), AV38TFAlbREnt, GXv_char17) ;
      consultadeproduccion_almacentejido_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV40TFAlbRLote)==0), AV40TFAlbRLote, GXv_char15) ;
      consultadeproduccion_almacentejido_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char13 = "" ;
      GXv_char6[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV42TFAlbRTelar)==0), AV42TFAlbRTelar, GXv_char6) ;
      consultadeproduccion_almacentejido_impl.this.GXt_char13 = GXv_char6[0] ;
      GXt_char12 = "" ;
      GXv_char5[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV44TFAlbRMdlCod)==0), AV44TFAlbRMdlCod, GXv_char5) ;
      consultadeproduccion_almacentejido_impl.this.GXt_char12 = GXv_char5[0] ;
      GXt_char3 = "" ;
      GXv_char4[0] = GXt_char3 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV50TFAlbMaqTej)==0), AV50TFAlbMaqTej, GXv_char4) ;
      consultadeproduccion_almacentejido_impl.this.GXt_char3 = GXv_char4[0] ;
      Ddo_grid_Filteredtext_set = GXt_char20+"|"+((0==AV24TFAlbRecCod) ? "" : GXutil.str( AV24TFAlbRecCod, 8, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV26TFBarKilLan)==0) ? "" : GXutil.str( AV26TFBarKilLan, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV28TFBarMetLan)==0) ? "" : GXutil.str( AV28TFBarMetLan, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV30TFBarPieKil)==0) ? "" : GXutil.str( AV30TFBarPieKil, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV32TFBarPieMet)==0) ? "" : GXutil.str( AV32TFBarPieMet, 9, 2))+"|"+GXt_char18+"|"+((0==AV36TFBarPieEst) ? "" : GXutil.str( AV36TFBarPieEst, 1, 0))+"|"+GXt_char16+"|"+GXt_char14+"|"+GXt_char13+"|"+GXt_char12+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV46TFAlbRLu)==0) ? "" : GXutil.str( AV46TFAlbRLu, 6, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV48TFAlbRTara)==0) ? "" : GXutil.str( AV48TFAlbRTara, 6, 2))+"|"+GXt_char3 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|"+((0==AV25TFAlbRecCod_To) ? "" : GXutil.str( AV25TFAlbRecCod_To, 8, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV27TFBarKilLan_To)==0) ? "" : GXutil.str( AV27TFBarKilLan_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV29TFBarMetLan_To)==0) ? "" : GXutil.str( AV29TFBarMetLan_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV31TFBarPieKil_To)==0) ? "" : GXutil.str( AV31TFBarPieKil_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV33TFBarPieMet_To)==0) ? "" : GXutil.str( AV33TFBarPieMet_To, 9, 2))+"||"+((0==AV37TFBarPieEst_To) ? "" : GXutil.str( AV37TFBarPieEst_To, 1, 0))+"|||||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV47TFAlbRLu_To)==0) ? "" : GXutil.str( AV47TFAlbRLu_To, 6, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV49TFAlbRTara_To)==0) ? "" : GXutil.str( AV49TFAlbRTara_To, 6, 2))+"|" ;
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
      AV10GridState.fromxml(AV21Session.getValue(AV78Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFBARPIECOD", "", !(GXutil.strcmp("", AV22TFBarPieCod)==0), (short)(0), AV22TFBarPieCod, "", !(GXutil.strcmp("", AV23TFBarPieCod_Sel)==0), AV23TFBarPieCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFALBRECCOD", "", !((0==AV24TFAlbRecCod)&&(0==AV25TFAlbRecCod_To)), (short)(0), GXutil.trim( GXutil.str( AV24TFAlbRecCod, 8, 0)), GXutil.trim( GXutil.str( AV25TFAlbRecCod_To, 8, 0))) ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFBARKILLAN", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV26TFBarKilLan)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV27TFBarKilLan_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV26TFBarKilLan, 9, 2)), GXutil.trim( GXutil.str( AV27TFBarKilLan_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFBARMETLAN", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV28TFBarMetLan)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV29TFBarMetLan_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV28TFBarMetLan, 9, 2)), GXutil.trim( GXutil.str( AV29TFBarMetLan_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFBARPIEKIL", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV30TFBarPieKil)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV31TFBarPieKil_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV30TFBarPieKil, 9, 2)), GXutil.trim( GXutil.str( AV31TFBarPieKil_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFBARPIEMET", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV32TFBarPieMet)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV33TFBarPieMet_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV32TFBarPieMet, 9, 2)), GXutil.trim( GXutil.str( AV33TFBarPieMet_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFBARPIELOC", "", !(GXutil.strcmp("", AV34TFBarPieLoc)==0), (short)(0), AV34TFBarPieLoc, "", !(GXutil.strcmp("", AV35TFBarPieLoc_Sel)==0), AV35TFBarPieLoc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFBARPIEEST", "", !((0==AV36TFBarPieEst)&&(0==AV37TFBarPieEst_To)), (short)(0), GXutil.trim( GXutil.str( AV36TFBarPieEst, 1, 0)), GXutil.trim( GXutil.str( AV37TFBarPieEst_To, 1, 0))) ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFALBRENT", "", !(GXutil.strcmp("", AV38TFAlbREnt)==0), (short)(0), AV38TFAlbREnt, "", !(GXutil.strcmp("", AV39TFAlbREnt_Sel)==0), AV39TFAlbREnt_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFALBRLOTE", "", !(GXutil.strcmp("", AV40TFAlbRLote)==0), (short)(0), AV40TFAlbRLote, "", !(GXutil.strcmp("", AV41TFAlbRLote_Sel)==0), AV41TFAlbRLote_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFALBRTELAR", "", !(GXutil.strcmp("", AV42TFAlbRTelar)==0), (short)(0), AV42TFAlbRTelar, "", !(GXutil.strcmp("", AV43TFAlbRTelar_Sel)==0), AV43TFAlbRTelar_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFALBRMDLCOD", "", !(GXutil.strcmp("", AV44TFAlbRMdlCod)==0), (short)(0), AV44TFAlbRMdlCod, "", !(GXutil.strcmp("", AV45TFAlbRMdlCod_Sel)==0), AV45TFAlbRMdlCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFALBRLU", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV46TFAlbRLu)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV47TFAlbRLu_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV46TFAlbRLu, 6, 2)), GXutil.trim( GXutil.str( AV47TFAlbRLu_To, 6, 2))) ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFALBRTARA", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV48TFAlbRTara)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV49TFAlbRTara_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV48TFAlbRTara, 6, 2)), GXutil.trim( GXutil.str( AV49TFAlbRTara_To, 6, 2))) ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFALBMAQTEJ", "", !(GXutil.strcmp("", AV50TFAlbMaqTej)==0), (short)(0), AV50TFAlbMaqTej, "", !(GXutil.strcmp("", AV51TFAlbMaqTej_Sel)==0), AV51TFAlbMaqTej_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      if ( ! (GXutil.strcmp("", AV56Emprcod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV56Emprcod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV57BarCod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV57BarCod, 8, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV58BarCodReo) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODREO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV58BarCodReo, 1, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV59BarCodPar)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODPAR" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV59BarCodPar );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV69CliCod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV69CliCod, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV70CliNom)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLINOM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV70CliNom );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV71PedidoCliente)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PEDIDOCLIENTE" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV71PedidoCliente );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV72BarSer)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARSER" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV72BarSer );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV73BarSerDsc)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARSERDSC" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV73BarSerDsc );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV74BarColNom)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOLNOM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV74BarColNom );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV75BarColNum) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOLNUM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV75BarColNum, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV78Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV78Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "BARPIE" );
      AV21Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S162( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV61TotBarKilLan = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TotBarKilLan", GXutil.ltrimstr( AV61TotBarKilLan, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARKILLAN", getSecureSignedToken( sPrefix, localUtil.format( AV61TotBarKilLan, "ZZZZZ9.99")));
      AV63TotBarMetLan = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TotBarMetLan", GXutil.ltrimstr( AV63TotBarMetLan, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARMETLAN", getSecureSignedToken( sPrefix, localUtil.format( AV63TotBarMetLan, "ZZZZZ9.99")));
      AV65TotBarPieKil = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TotBarPieKil", GXutil.ltrimstr( AV65TotBarPieKil, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARPIEKIL", getSecureSignedToken( sPrefix, localUtil.format( AV65TotBarPieKil, "ZZZZZ9.99")));
      AV67TotBarPieMet = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TotBarPieMet", GXutil.ltrimstr( AV67TotBarPieMet, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARPIEMET", getSecureSignedToken( sPrefix, localUtil.format( AV67TotBarPieMet, "ZZZZZ9.99")));
   }

   public void S172( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      AV82Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod = AV22TFBarPieCod ;
      AV83Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel = AV23TFBarPieCod_Sel ;
      AV84Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod = AV24TFAlbRecCod ;
      AV85Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to = AV25TFAlbRecCod_To ;
      AV86Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan = AV26TFBarKilLan ;
      AV87Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to = AV27TFBarKilLan_To ;
      AV88Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan = AV28TFBarMetLan ;
      AV89Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to = AV29TFBarMetLan_To ;
      AV90Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil = AV30TFBarPieKil ;
      AV91Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to = AV31TFBarPieKil_To ;
      AV92Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet = AV32TFBarPieMet ;
      AV93Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to = AV33TFBarPieMet_To ;
      AV94Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc = AV34TFBarPieLoc ;
      AV95Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel = AV35TFBarPieLoc_Sel ;
      AV96Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest = AV36TFBarPieEst ;
      AV97Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to = AV37TFBarPieEst_To ;
      AV98Produccion_consultadeproduccion_almacentejidods_17_tfalbrent = AV38TFAlbREnt ;
      AV99Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel = AV39TFAlbREnt_Sel ;
      AV100Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote = AV40TFAlbRLote ;
      AV101Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel = AV41TFAlbRLote_Sel ;
      AV102Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar = AV42TFAlbRTelar ;
      AV103Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel = AV43TFAlbRTelar_Sel ;
      AV104Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod = AV44TFAlbRMdlCod ;
      AV105Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel = AV45TFAlbRMdlCod_Sel ;
      AV106Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu = AV46TFAlbRLu ;
      AV107Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to = AV47TFAlbRLu_To ;
      AV108Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara = AV48TFAlbRTara ;
      AV109Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to = AV49TFAlbRTara_To ;
      AV110Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej = AV50TFAlbMaqTej ;
      AV111Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel = AV51TFAlbMaqTej_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV83Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel ,
                                           AV82Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod ,
                                           Integer.valueOf(AV84Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod) ,
                                           Integer.valueOf(AV85Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to) ,
                                           AV86Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan ,
                                           AV87Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to ,
                                           AV88Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan ,
                                           AV89Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to ,
                                           AV90Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil ,
                                           AV91Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to ,
                                           AV92Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet ,
                                           AV93Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to ,
                                           AV95Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel ,
                                           AV94Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc ,
                                           Byte.valueOf(AV96Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest) ,
                                           Byte.valueOf(AV97Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to) ,
                                           AV99Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel ,
                                           AV98Produccion_consultadeproduccion_almacentejidods_17_tfalbrent ,
                                           AV101Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel ,
                                           AV100Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote ,
                                           AV103Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel ,
                                           AV102Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar ,
                                           AV105Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel ,
                                           AV104Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod ,
                                           AV106Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu ,
                                           AV107Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to ,
                                           AV108Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara ,
                                           AV109Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to ,
                                           AV111Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel ,
                                           AV110Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej ,
                                           A200BarPieCod ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A170BarKilLan ,
                                           A183BarMetLan ,
                                           A203BarPieKil ,
                                           A205BarPieMet ,
                                           A2186BarPieLoc ,
                                           Byte.valueOf(A201BarPieEst) ,
                                           A46AlbREnt ,
                                           A6463AlbRLote ,
                                           A6464AlbRTelar ,
                                           A4602AlbRMdlCod ,
                                           A6465AlbRLu ,
                                           A6470AlbRTara ,
                                           A8035AlbMaqTej ,
                                           AV56Emprcod ,
                                           Integer.valueOf(AV57BarCod) ,
                                           Byte.valueOf(AV58BarCodReo) ,
                                           AV59BarCodPar ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV82Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod = GXutil.padr( GXutil.rtrim( AV82Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod), 9, "%") ;
      lV94Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc = GXutil.padr( GXutil.rtrim( AV94Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc), 10, "%") ;
      lV98Produccion_consultadeproduccion_almacentejidods_17_tfalbrent = GXutil.padr( GXutil.rtrim( AV98Produccion_consultadeproduccion_almacentejidods_17_tfalbrent), 8, "%") ;
      lV100Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote = GXutil.padr( GXutil.rtrim( AV100Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote), 20, "%") ;
      lV102Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar = GXutil.padr( GXutil.rtrim( AV102Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar), 20, "%") ;
      lV104Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod = GXutil.padr( GXutil.rtrim( AV104Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod), 13, "%") ;
      lV110Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej = GXutil.padr( GXutil.rtrim( AV110Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej), 12, "%") ;
      /* Using cursor H01YN4 */
      pr_default.execute(2, new Object[] {AV56Emprcod, Integer.valueOf(AV57BarCod), Byte.valueOf(AV58BarCodReo), AV59BarCodPar, lV82Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod, AV83Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel, Integer.valueOf(AV84Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod), Integer.valueOf(AV85Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to), AV86Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan, AV87Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to, AV88Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan, AV89Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to, AV90Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil, AV91Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to, AV92Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet, AV93Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to, lV94Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc, AV95Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel, Byte.valueOf(AV96Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest), Byte.valueOf(AV97Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to), lV98Produccion_consultadeproduccion_almacentejidods_17_tfalbrent, AV99Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel, lV100Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote, AV101Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel, lV102Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar, AV103Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel, lV104Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod, AV105Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel, AV106Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu, AV107Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to, AV108Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara, AV109Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to, lV110Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej, AV111Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel});
      nGXsfl_87_idx = 1 ;
      sGXsfl_87_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_87_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_872( ) ;
      GRID_nEOF = (byte)(0) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      while ( ( (pr_default.getStatus(2) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
      {
         A130BarCodPar = H01YN4_A130BarCodPar[0] ;
         A132BarCodReo = H01YN4_A132BarCodReo[0] ;
         A129BarCod = H01YN4_A129BarCod[0] ;
         A396EmprCod = H01YN4_A396EmprCod[0] ;
         A8035AlbMaqTej = H01YN4_A8035AlbMaqTej[0] ;
         A6470AlbRTara = H01YN4_A6470AlbRTara[0] ;
         A6465AlbRLu = H01YN4_A6465AlbRLu[0] ;
         A4602AlbRMdlCod = H01YN4_A4602AlbRMdlCod[0] ;
         A6464AlbRTelar = H01YN4_A6464AlbRTelar[0] ;
         A6463AlbRLote = H01YN4_A6463AlbRLote[0] ;
         A46AlbREnt = H01YN4_A46AlbREnt[0] ;
         A201BarPieEst = H01YN4_A201BarPieEst[0] ;
         A2186BarPieLoc = H01YN4_A2186BarPieLoc[0] ;
         n2186BarPieLoc = H01YN4_n2186BarPieLoc[0] ;
         A205BarPieMet = H01YN4_A205BarPieMet[0] ;
         A203BarPieKil = H01YN4_A203BarPieKil[0] ;
         A183BarMetLan = H01YN4_A183BarMetLan[0] ;
         A170BarKilLan = H01YN4_A170BarKilLan[0] ;
         A44AlbRecCod = H01YN4_A44AlbRecCod[0] ;
         A200BarPieCod = H01YN4_A200BarPieCod[0] ;
         A8035AlbMaqTej = H01YN4_A8035AlbMaqTej[0] ;
         A6470AlbRTara = H01YN4_A6470AlbRTara[0] ;
         A6465AlbRLu = H01YN4_A6465AlbRLu[0] ;
         A4602AlbRMdlCod = H01YN4_A4602AlbRMdlCod[0] ;
         A6464AlbRTelar = H01YN4_A6464AlbRTelar[0] ;
         A6463AlbRLote = H01YN4_A6463AlbRLote[0] ;
         A46AlbREnt = H01YN4_A46AlbREnt[0] ;
         AV61TotBarKilLan = A170BarKilLan.add(AV61TotBarKilLan) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TotBarKilLan", GXutil.ltrimstr( AV61TotBarKilLan, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARKILLAN", getSecureSignedToken( sPrefix, localUtil.format( AV61TotBarKilLan, "ZZZZZ9.99")));
         AV63TotBarMetLan = A183BarMetLan.add(AV63TotBarMetLan) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TotBarMetLan", GXutil.ltrimstr( AV63TotBarMetLan, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARMETLAN", getSecureSignedToken( sPrefix, localUtil.format( AV63TotBarMetLan, "ZZZZZ9.99")));
         AV65TotBarPieKil = A203BarPieKil.add(AV65TotBarPieKil) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TotBarPieKil", GXutil.ltrimstr( AV65TotBarPieKil, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARPIEKIL", getSecureSignedToken( sPrefix, localUtil.format( AV65TotBarPieKil, "ZZZZZ9.99")));
         AV67TotBarPieMet = A205BarPieMet.add(AV67TotBarPieMet) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TotBarPieMet", GXutil.ltrimstr( AV67TotBarPieMet, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARPIEMET", getSecureSignedToken( sPrefix, localUtil.format( AV67TotBarPieMet, "ZZZZZ9.99")));
         pr_default.readNext(2);
      }
      GRID_nEOF = (byte)(((pr_default.getStatus(2) == 101) ? 1 : 0)) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      pr_default.close(2);
      AV62TotValueBarKilLan = localUtil.format( AV61TotBarKilLan, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TotValueBarKilLan", AV62TotValueBarKilLan);
      AV64TotValueBarMetLan = localUtil.format( AV63TotBarMetLan, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TotValueBarMetLan", AV64TotValueBarMetLan);
      AV66TotValueBarPieKil = localUtil.format( AV65TotBarPieKil, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TotValueBarPieKil", AV66TotValueBarPieKil);
      AV68TotValueBarPieMet = localUtil.format( AV67TotBarPieMet, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TotValueBarPieMet", AV68TotValueBarPieMet);
   }

   public void wb_table2_105_1YN2( boolean wbgen )
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
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluebarkillan_Internalname, httpContext.getMessage( "Tot Value Bar Kil Lan", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'" + sPrefix + "',false,'" + sGXsfl_87_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluebarkillan_Internalname, AV62TotValueBarKilLan, GXutil.rtrim( localUtil.format( AV62TotValueBarKilLan, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,111);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluebarkillan_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluebarkillan_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ConsultadeProduccion_AlmacenTejido.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluebarmetlan_Internalname, httpContext.getMessage( "Tot Value Bar Met Lan", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'" + sPrefix + "',false,'" + sGXsfl_87_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluebarmetlan_Internalname, AV64TotValueBarMetLan, GXutil.rtrim( localUtil.format( AV64TotValueBarMetLan, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,114);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluebarmetlan_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluebarmetlan_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ConsultadeProduccion_AlmacenTejido.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluebarpiekil_Internalname, httpContext.getMessage( "Tot Value Bar Pie Kil", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 117,'" + sPrefix + "',false,'" + sGXsfl_87_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluebarpiekil_Internalname, AV66TotValueBarPieKil, GXutil.rtrim( localUtil.format( AV66TotValueBarPieKil, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,117);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluebarpiekil_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluebarpiekil_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ConsultadeProduccion_AlmacenTejido.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluebarpiemet_Internalname, httpContext.getMessage( "Tot Value Bar Pie Met", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 120,'" + sPrefix + "',false,'" + sGXsfl_87_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluebarpiemet_Internalname, AV68TotValueBarPieMet, GXutil.rtrim( localUtil.format( AV68TotValueBarPieMet, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,120);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluebarpiemet_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluebarpiemet_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ConsultadeProduccion_AlmacenTejido.htm");
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
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_105_1YN2e( true) ;
      }
      else
      {
         wb_table2_105_1YN2e( false) ;
      }
   }

   public void wb_table1_76_1YN2( boolean wbgen )
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
         wb_table1_76_1YN2e( true) ;
      }
      else
      {
         wb_table1_76_1YN2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV56Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56Emprcod", AV56Emprcod);
      AV57BarCod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57BarCod), 8, 0));
      AV58BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58BarCodReo", GXutil.str( AV58BarCodReo, 1, 0));
      AV59BarCodPar = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59BarCodPar", AV59BarCodPar);
      AV69CliCod = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69CliCod), 6, 0));
      AV70CliNom = (String)getParm(obj,5,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70CliNom", AV70CliNom);
      AV71PedidoCliente = (String)getParm(obj,6,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71PedidoCliente", AV71PedidoCliente);
      AV72BarSer = (String)getParm(obj,7,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72BarSer", AV72BarSer);
      AV73BarSerDsc = (String)getParm(obj,8,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73BarSerDsc", AV73BarSerDsc);
      AV74BarColNom = (String)getParm(obj,9,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74BarColNom", AV74BarColNom);
      AV75BarColNum = ((Number) GXutil.testNumericType( getParm(obj,10,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75BarColNum), 6, 0));
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
      pa1YN2( ) ;
      ws1YN2( ) ;
      we1YN2( ) ;
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
      sCtrlAV56Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV57BarCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV58BarCodReo = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV59BarCodPar = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV69CliCod = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV70CliNom = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV71PedidoCliente = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV72BarSer = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV73BarSerDsc = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV74BarColNom = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV75BarColNum = (String)getParm(obj,10,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1YN2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "produccion\\consultadeproduccion_almacentejido", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1YN2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV56Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56Emprcod", AV56Emprcod);
         AV57BarCod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57BarCod), 8, 0));
         AV58BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58BarCodReo", GXutil.str( AV58BarCodReo, 1, 0));
         AV59BarCodPar = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59BarCodPar", AV59BarCodPar);
         AV69CliCod = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69CliCod), 6, 0));
         AV70CliNom = (String)getParm(obj,7,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70CliNom", AV70CliNom);
         AV71PedidoCliente = (String)getParm(obj,8,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71PedidoCliente", AV71PedidoCliente);
         AV72BarSer = (String)getParm(obj,9,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72BarSer", AV72BarSer);
         AV73BarSerDsc = (String)getParm(obj,10,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73BarSerDsc", AV73BarSerDsc);
         AV74BarColNom = (String)getParm(obj,11,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74BarColNom", AV74BarColNom);
         AV75BarColNum = ((Number) GXutil.testNumericType( getParm(obj,12,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75BarColNum), 6, 0));
      }
      wcpOAV56Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV56Emprcod") ;
      wcpOAV57BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV57BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV58BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV58BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV59BarCodPar = httpContext.cgiGet( sPrefix+"wcpOAV59BarCodPar") ;
      wcpOAV69CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV69CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV70CliNom = httpContext.cgiGet( sPrefix+"wcpOAV70CliNom") ;
      wcpOAV71PedidoCliente = httpContext.cgiGet( sPrefix+"wcpOAV71PedidoCliente") ;
      wcpOAV72BarSer = httpContext.cgiGet( sPrefix+"wcpOAV72BarSer") ;
      wcpOAV73BarSerDsc = httpContext.cgiGet( sPrefix+"wcpOAV73BarSerDsc") ;
      wcpOAV74BarColNom = httpContext.cgiGet( sPrefix+"wcpOAV74BarColNom") ;
      wcpOAV75BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV75BarColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV56Emprcod, wcpOAV56Emprcod) != 0 ) || ( AV57BarCod != wcpOAV57BarCod ) || ( AV58BarCodReo != wcpOAV58BarCodReo ) || ( GXutil.strcmp(AV59BarCodPar, wcpOAV59BarCodPar) != 0 ) || ( AV69CliCod != wcpOAV69CliCod ) || ( GXutil.strcmp(AV70CliNom, wcpOAV70CliNom) != 0 ) || ( GXutil.strcmp(AV71PedidoCliente, wcpOAV71PedidoCliente) != 0 ) || ( GXutil.strcmp(AV72BarSer, wcpOAV72BarSer) != 0 ) || ( GXutil.strcmp(AV73BarSerDsc, wcpOAV73BarSerDsc) != 0 ) || ( GXutil.strcmp(AV74BarColNom, wcpOAV74BarColNom) != 0 ) || ( AV75BarColNum != wcpOAV75BarColNum ) ) )
      {
         setjustcreated();
      }
      wcpOAV56Emprcod = AV56Emprcod ;
      wcpOAV57BarCod = AV57BarCod ;
      wcpOAV58BarCodReo = AV58BarCodReo ;
      wcpOAV59BarCodPar = AV59BarCodPar ;
      wcpOAV69CliCod = AV69CliCod ;
      wcpOAV70CliNom = AV70CliNom ;
      wcpOAV71PedidoCliente = AV71PedidoCliente ;
      wcpOAV72BarSer = AV72BarSer ;
      wcpOAV73BarSerDsc = AV73BarSerDsc ;
      wcpOAV74BarColNom = AV74BarColNom ;
      wcpOAV75BarColNum = AV75BarColNum ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV56Emprcod = httpContext.cgiGet( sPrefix+"AV56Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV56Emprcod) > 0 )
      {
         AV56Emprcod = httpContext.cgiGet( sCtrlAV56Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56Emprcod", AV56Emprcod);
      }
      else
      {
         AV56Emprcod = httpContext.cgiGet( sPrefix+"AV56Emprcod_PARM") ;
      }
      sCtrlAV57BarCod = httpContext.cgiGet( sPrefix+"AV57BarCod_CTRL") ;
      if ( GXutil.len( sCtrlAV57BarCod) > 0 )
      {
         AV57BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV57BarCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57BarCod), 8, 0));
      }
      else
      {
         AV57BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV57BarCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV58BarCodReo = httpContext.cgiGet( sPrefix+"AV58BarCodReo_CTRL") ;
      if ( GXutil.len( sCtrlAV58BarCodReo) > 0 )
      {
         AV58BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV58BarCodReo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58BarCodReo", GXutil.str( AV58BarCodReo, 1, 0));
      }
      else
      {
         AV58BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV58BarCodReo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV59BarCodPar = httpContext.cgiGet( sPrefix+"AV59BarCodPar_CTRL") ;
      if ( GXutil.len( sCtrlAV59BarCodPar) > 0 )
      {
         AV59BarCodPar = httpContext.cgiGet( sCtrlAV59BarCodPar) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59BarCodPar", AV59BarCodPar);
      }
      else
      {
         AV59BarCodPar = httpContext.cgiGet( sPrefix+"AV59BarCodPar_PARM") ;
      }
      sCtrlAV69CliCod = httpContext.cgiGet( sPrefix+"AV69CliCod_CTRL") ;
      if ( GXutil.len( sCtrlAV69CliCod) > 0 )
      {
         AV69CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV69CliCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69CliCod), 6, 0));
      }
      else
      {
         AV69CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV69CliCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV70CliNom = httpContext.cgiGet( sPrefix+"AV70CliNom_CTRL") ;
      if ( GXutil.len( sCtrlAV70CliNom) > 0 )
      {
         AV70CliNom = httpContext.cgiGet( sCtrlAV70CliNom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70CliNom", AV70CliNom);
      }
      else
      {
         AV70CliNom = httpContext.cgiGet( sPrefix+"AV70CliNom_PARM") ;
      }
      sCtrlAV71PedidoCliente = httpContext.cgiGet( sPrefix+"AV71PedidoCliente_CTRL") ;
      if ( GXutil.len( sCtrlAV71PedidoCliente) > 0 )
      {
         AV71PedidoCliente = httpContext.cgiGet( sCtrlAV71PedidoCliente) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71PedidoCliente", AV71PedidoCliente);
      }
      else
      {
         AV71PedidoCliente = httpContext.cgiGet( sPrefix+"AV71PedidoCliente_PARM") ;
      }
      sCtrlAV72BarSer = httpContext.cgiGet( sPrefix+"AV72BarSer_CTRL") ;
      if ( GXutil.len( sCtrlAV72BarSer) > 0 )
      {
         AV72BarSer = httpContext.cgiGet( sCtrlAV72BarSer) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72BarSer", AV72BarSer);
      }
      else
      {
         AV72BarSer = httpContext.cgiGet( sPrefix+"AV72BarSer_PARM") ;
      }
      sCtrlAV73BarSerDsc = httpContext.cgiGet( sPrefix+"AV73BarSerDsc_CTRL") ;
      if ( GXutil.len( sCtrlAV73BarSerDsc) > 0 )
      {
         AV73BarSerDsc = httpContext.cgiGet( sCtrlAV73BarSerDsc) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73BarSerDsc", AV73BarSerDsc);
      }
      else
      {
         AV73BarSerDsc = httpContext.cgiGet( sPrefix+"AV73BarSerDsc_PARM") ;
      }
      sCtrlAV74BarColNom = httpContext.cgiGet( sPrefix+"AV74BarColNom_CTRL") ;
      if ( GXutil.len( sCtrlAV74BarColNom) > 0 )
      {
         AV74BarColNom = httpContext.cgiGet( sCtrlAV74BarColNom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74BarColNom", AV74BarColNom);
      }
      else
      {
         AV74BarColNom = httpContext.cgiGet( sPrefix+"AV74BarColNom_PARM") ;
      }
      sCtrlAV75BarColNum = httpContext.cgiGet( sPrefix+"AV75BarColNum_CTRL") ;
      if ( GXutil.len( sCtrlAV75BarColNum) > 0 )
      {
         AV75BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV75BarColNum), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75BarColNum), 6, 0));
      }
      else
      {
         AV75BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV75BarColNum_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa1YN2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1YN2( ) ;
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
      ws1YN2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV56Emprcod_PARM", GXutil.rtrim( AV56Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV56Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV56Emprcod_CTRL", GXutil.rtrim( sCtrlAV56Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV57BarCod_PARM", GXutil.ltrim( localUtil.ntoc( AV57BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV57BarCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV57BarCod_CTRL", GXutil.rtrim( sCtrlAV57BarCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV58BarCodReo_PARM", GXutil.ltrim( localUtil.ntoc( AV58BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV58BarCodReo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV58BarCodReo_CTRL", GXutil.rtrim( sCtrlAV58BarCodReo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV59BarCodPar_PARM", GXutil.rtrim( AV59BarCodPar));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV59BarCodPar)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV59BarCodPar_CTRL", GXutil.rtrim( sCtrlAV59BarCodPar));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV69CliCod_PARM", GXutil.ltrim( localUtil.ntoc( AV69CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV69CliCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV69CliCod_CTRL", GXutil.rtrim( sCtrlAV69CliCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV70CliNom_PARM", GXutil.rtrim( AV70CliNom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV70CliNom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV70CliNom_CTRL", GXutil.rtrim( sCtrlAV70CliNom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV71PedidoCliente_PARM", GXutil.rtrim( AV71PedidoCliente));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV71PedidoCliente)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV71PedidoCliente_CTRL", GXutil.rtrim( sCtrlAV71PedidoCliente));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV72BarSer_PARM", GXutil.rtrim( AV72BarSer));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV72BarSer)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV72BarSer_CTRL", GXutil.rtrim( sCtrlAV72BarSer));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV73BarSerDsc_PARM", GXutil.rtrim( AV73BarSerDsc));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV73BarSerDsc)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV73BarSerDsc_CTRL", GXutil.rtrim( sCtrlAV73BarSerDsc));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV74BarColNom_PARM", GXutil.rtrim( AV74BarColNom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV74BarColNom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV74BarColNom_CTRL", GXutil.rtrim( sCtrlAV74BarColNom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV75BarColNum_PARM", GXutil.ltrim( localUtil.ntoc( AV75BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV75BarColNum)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV75BarColNum_CTRL", GXutil.rtrim( sCtrlAV75BarColNum));
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
      we1YN2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115554428", true, true);
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
      httpContext.AddJavascriptSource("produccion/consultadeproduccion_almacentejido.js", "?202682115554428", false, true);
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
      edtBarPieCod_Internalname = sPrefix+"BARPIECOD_"+sGXsfl_87_idx ;
      edtAlbRecCod_Internalname = sPrefix+"ALBRECCOD_"+sGXsfl_87_idx ;
      edtBarKilLan_Internalname = sPrefix+"BARKILLAN_"+sGXsfl_87_idx ;
      edtBarMetLan_Internalname = sPrefix+"BARMETLAN_"+sGXsfl_87_idx ;
      edtBarPieKil_Internalname = sPrefix+"BARPIEKIL_"+sGXsfl_87_idx ;
      edtBarPieMet_Internalname = sPrefix+"BARPIEMET_"+sGXsfl_87_idx ;
      edtBarPieLoc_Internalname = sPrefix+"BARPIELOC_"+sGXsfl_87_idx ;
      edtBarPieEst_Internalname = sPrefix+"BARPIEEST_"+sGXsfl_87_idx ;
      edtAlbREnt_Internalname = sPrefix+"ALBRENT_"+sGXsfl_87_idx ;
      edtAlbRLote_Internalname = sPrefix+"ALBRLOTE_"+sGXsfl_87_idx ;
      edtAlbRTelar_Internalname = sPrefix+"ALBRTELAR_"+sGXsfl_87_idx ;
      edtAlbRMdlCod_Internalname = sPrefix+"ALBRMDLCOD_"+sGXsfl_87_idx ;
      edtAlbRLu_Internalname = sPrefix+"ALBRLU_"+sGXsfl_87_idx ;
      edtAlbRTara_Internalname = sPrefix+"ALBRTARA_"+sGXsfl_87_idx ;
      edtAlbMaqTej_Internalname = sPrefix+"ALBMAQTEJ_"+sGXsfl_87_idx ;
   }

   public void subsflControlProps_fel_872( )
   {
      edtBarPieCod_Internalname = sPrefix+"BARPIECOD_"+sGXsfl_87_fel_idx ;
      edtAlbRecCod_Internalname = sPrefix+"ALBRECCOD_"+sGXsfl_87_fel_idx ;
      edtBarKilLan_Internalname = sPrefix+"BARKILLAN_"+sGXsfl_87_fel_idx ;
      edtBarMetLan_Internalname = sPrefix+"BARMETLAN_"+sGXsfl_87_fel_idx ;
      edtBarPieKil_Internalname = sPrefix+"BARPIEKIL_"+sGXsfl_87_fel_idx ;
      edtBarPieMet_Internalname = sPrefix+"BARPIEMET_"+sGXsfl_87_fel_idx ;
      edtBarPieLoc_Internalname = sPrefix+"BARPIELOC_"+sGXsfl_87_fel_idx ;
      edtBarPieEst_Internalname = sPrefix+"BARPIEEST_"+sGXsfl_87_fel_idx ;
      edtAlbREnt_Internalname = sPrefix+"ALBRENT_"+sGXsfl_87_fel_idx ;
      edtAlbRLote_Internalname = sPrefix+"ALBRLOTE_"+sGXsfl_87_fel_idx ;
      edtAlbRTelar_Internalname = sPrefix+"ALBRTELAR_"+sGXsfl_87_fel_idx ;
      edtAlbRMdlCod_Internalname = sPrefix+"ALBRMDLCOD_"+sGXsfl_87_fel_idx ;
      edtAlbRLu_Internalname = sPrefix+"ALBRLU_"+sGXsfl_87_fel_idx ;
      edtAlbRTara_Internalname = sPrefix+"ALBRTARA_"+sGXsfl_87_fel_idx ;
      edtAlbMaqTej_Internalname = sPrefix+"ALBMAQTEJ_"+sGXsfl_87_fel_idx ;
   }

   public void sendrow_872( )
   {
      subsflControlProps_872( ) ;
      wb1YN0( ) ;
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
            httpContext.writeText( " class=\""+"GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_87_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarPieCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPieCod_Internalname,GXutil.rtrim( A200BarPieCod),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarPieCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarPieCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(87),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbRecCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecCod_Internalname,GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtAlbRecCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(87),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarKilLan_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarKilLan_Internalname,GXutil.ltrim( localUtil.ntoc( A170BarKilLan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A170BarKilLan, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarKilLan_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarKilLan_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(87),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarMetLan_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarMetLan_Internalname,GXutil.ltrim( localUtil.ntoc( A183BarMetLan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A183BarMetLan, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarMetLan_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarMetLan_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(87),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarPieKil_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPieKil_Internalname,GXutil.ltrim( localUtil.ntoc( A203BarPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A203BarPieKil, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarPieKil_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarPieKil_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(87),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarPieMet_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPieMet_Internalname,GXutil.ltrim( localUtil.ntoc( A205BarPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A205BarPieMet, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarPieMet_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarPieMet_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(87),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarPieLoc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPieLoc_Internalname,GXutil.rtrim( A2186BarPieLoc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarPieLoc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarPieLoc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(87),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarPieEst_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPieEst_Internalname,GXutil.ltrim( localUtil.ntoc( A201BarPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A201BarPieEst), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarPieEst_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarPieEst_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(87),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbREnt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbREnt_Internalname,GXutil.rtrim( A46AlbREnt),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbREnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtAlbREnt_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(87),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbRLote_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRLote_Internalname,GXutil.rtrim( A6463AlbRLote),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbRLote_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtAlbRLote_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(87),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbRTelar_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRTelar_Internalname,GXutil.rtrim( A6464AlbRTelar),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbRTelar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtAlbRTelar_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(87),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbRMdlCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRMdlCod_Internalname,GXutil.rtrim( A4602AlbRMdlCod),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbRMdlCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtAlbRMdlCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(87),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbRLu_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRLu_Internalname,GXutil.ltrim( localUtil.ntoc( A6465AlbRLu, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A6465AlbRLu, "ZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbRLu_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtAlbRLu_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(87),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbRTara_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRTara_Internalname,GXutil.ltrim( localUtil.ntoc( A6470AlbRTara, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A6470AlbRTara, "ZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbRTara_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtAlbRTara_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(87),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbMaqTej_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbMaqTej_Internalname,GXutil.rtrim( A8035AlbMaqTej),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbMaqTej_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtAlbMaqTej_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(87),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes1YN2( ) ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarPieCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Pieza", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRecCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N Recepcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarKilLan_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kgs. Lanz.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarMetLan_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Mts. Lanz.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarPieKil_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kgs", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarPieMet_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Mts", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarPieLoc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Localizacion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarPieEst_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "E", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbREnt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Doc. Entr.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRLote_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Lote", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRTelar_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRMdlCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Jogo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRLu_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pgadas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRTara_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "LFA", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbMaqTej_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maq", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A200BarPieCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarPieCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbRecCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A170BarKilLan, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarKilLan_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A183BarMetLan, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarMetLan_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A203BarPieKil, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarPieKil_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A205BarPieMet, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarPieMet_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A2186BarPieLoc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarPieLoc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A201BarPieEst, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarPieEst_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A46AlbREnt));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbREnt_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A6463AlbRLote));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbRLote_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A6464AlbRTelar));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbRTelar_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4602AlbRMdlCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbRMdlCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6465AlbRLu, (byte)(6), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbRLu_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6470AlbRTara, (byte)(6), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbRTara_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A8035AlbMaqTej));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbMaqTej_Visible, (byte)(5), (byte)(0), ".", "")));
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
      edtBarPieCod_Internalname = sPrefix+"BARPIECOD" ;
      edtAlbRecCod_Internalname = sPrefix+"ALBRECCOD" ;
      edtBarKilLan_Internalname = sPrefix+"BARKILLAN" ;
      edtBarMetLan_Internalname = sPrefix+"BARMETLAN" ;
      edtBarPieKil_Internalname = sPrefix+"BARPIEKIL" ;
      edtBarPieMet_Internalname = sPrefix+"BARPIEMET" ;
      edtBarPieLoc_Internalname = sPrefix+"BARPIELOC" ;
      edtBarPieEst_Internalname = sPrefix+"BARPIEEST" ;
      edtAlbREnt_Internalname = sPrefix+"ALBRENT" ;
      edtAlbRLote_Internalname = sPrefix+"ALBRLOTE" ;
      edtAlbRTelar_Internalname = sPrefix+"ALBRTELAR" ;
      edtAlbRMdlCod_Internalname = sPrefix+"ALBRMDLCOD" ;
      edtAlbRLu_Internalname = sPrefix+"ALBRLU" ;
      edtAlbRTara_Internalname = sPrefix+"ALBRTARA" ;
      edtAlbMaqTej_Internalname = sPrefix+"ALBMAQTEJ" ;
      edtavTotvaluebarkillan_Internalname = sPrefix+"vTOTVALUEBARKILLAN" ;
      edtavTotvaluebarmetlan_Internalname = sPrefix+"vTOTVALUEBARMETLAN" ;
      edtavTotvaluebarpiekil_Internalname = sPrefix+"vTOTVALUEBARPIEKIL" ;
      edtavTotvaluebarpiemet_Internalname = sPrefix+"vTOTVALUEBARPIEMET" ;
      tblGridtabletotalizer_Internalname = sPrefix+"GRIDTABLETOTALIZER" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
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
      edtAlbMaqTej_Jsonclick = "" ;
      edtAlbRTara_Jsonclick = "" ;
      edtAlbRLu_Jsonclick = "" ;
      edtAlbRMdlCod_Jsonclick = "" ;
      edtAlbRTelar_Jsonclick = "" ;
      edtAlbRLote_Jsonclick = "" ;
      edtAlbREnt_Jsonclick = "" ;
      edtBarPieEst_Jsonclick = "" ;
      edtBarPieLoc_Jsonclick = "" ;
      edtBarPieMet_Jsonclick = "" ;
      edtBarPieKil_Jsonclick = "" ;
      edtBarMetLan_Jsonclick = "" ;
      edtBarKilLan_Jsonclick = "" ;
      edtAlbRecCod_Jsonclick = "" ;
      edtBarPieCod_Jsonclick = "" ;
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavTotvaluebarpiemet_Jsonclick = "" ;
      edtavTotvaluebarpiemet_Enabled = 1 ;
      edtavTotvaluebarpiekil_Jsonclick = "" ;
      edtavTotvaluebarpiekil_Enabled = 1 ;
      edtavTotvaluebarmetlan_Jsonclick = "" ;
      edtavTotvaluebarmetlan_Enabled = 1 ;
      edtavTotvaluebarkillan_Jsonclick = "" ;
      edtavTotvaluebarkillan_Enabled = 1 ;
      edtAlbMaqTej_Visible = -1 ;
      edtAlbRTara_Visible = -1 ;
      edtAlbRLu_Visible = -1 ;
      edtAlbRMdlCod_Visible = -1 ;
      edtAlbRTelar_Visible = -1 ;
      edtAlbRLote_Visible = -1 ;
      edtAlbREnt_Visible = -1 ;
      edtBarPieEst_Visible = -1 ;
      edtBarPieLoc_Visible = -1 ;
      edtBarPieMet_Visible = -1 ;
      edtBarPieKil_Visible = -1 ;
      edtBarMetLan_Visible = -1 ;
      edtBarKilLan_Visible = -1 ;
      edtAlbRecCod_Visible = -1 ;
      edtBarPieCod_Visible = -1 ;
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
      Ddo_grid_Datalistproc = "Produccion.ConsultadeProduccion_AlmacenTejidoGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic||||||Dynamic||Dynamic|Dynamic|Dynamic|Dynamic|||Dynamic" ;
      Ddo_grid_Includedatalist = "T||||||T||T|T|T|T|||T" ;
      Ddo_grid_Filterisrange = "|T|T|T|T|T||T|||||T|T|" ;
      Ddo_grid_Filtertype = "Character|Numeric|Numeric|Numeric|Numeric|Numeric|Character|Numeric|Character|Character|Character|Character|Numeric|Numeric|Character" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|7|8|9|10|11|12|13|14|15|16" ;
      Ddo_grid_Columnids = "0:BarPieCod|1:AlbRecCod|2:BarKilLan|3:BarMetLan|4:BarPieKil|5:BarPieMet|6:BarPieLoc|7:BarPieEst|8:AlbREnt|9:AlbRLote|10:AlbRTelar|11:AlbRMdlCod|12:AlbRLu|13:AlbRTara|14:AlbMaqTej" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV56Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV57BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV58BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV59BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV22TFBarPieCod',fld:'vTFBARPIECOD',pic:''},{av:'AV23TFBarPieCod_Sel',fld:'vTFBARPIECOD_SEL',pic:''},{av:'AV24TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV25TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV26TFBarKilLan',fld:'vTFBARKILLAN',pic:'ZZZZZ9.99'},{av:'AV27TFBarKilLan_To',fld:'vTFBARKILLAN_TO',pic:'ZZZZZ9.99'},{av:'AV28TFBarMetLan',fld:'vTFBARMETLAN',pic:'ZZZZZ9.99'},{av:'AV29TFBarMetLan_To',fld:'vTFBARMETLAN_TO',pic:'ZZZZZ9.99'},{av:'AV30TFBarPieKil',fld:'vTFBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV31TFBarPieKil_To',fld:'vTFBARPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV32TFBarPieMet',fld:'vTFBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV33TFBarPieMet_To',fld:'vTFBARPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV34TFBarPieLoc',fld:'vTFBARPIELOC',pic:''},{av:'AV35TFBarPieLoc_Sel',fld:'vTFBARPIELOC_SEL',pic:''},{av:'AV36TFBarPieEst',fld:'vTFBARPIEEST',pic:'9'},{av:'AV37TFBarPieEst_To',fld:'vTFBARPIEEST_TO',pic:'9'},{av:'AV38TFAlbREnt',fld:'vTFALBRENT',pic:''},{av:'AV39TFAlbREnt_Sel',fld:'vTFALBRENT_SEL',pic:''},{av:'AV40TFAlbRLote',fld:'vTFALBRLOTE',pic:''},{av:'AV41TFAlbRLote_Sel',fld:'vTFALBRLOTE_SEL',pic:''},{av:'AV42TFAlbRTelar',fld:'vTFALBRTELAR',pic:''},{av:'AV43TFAlbRTelar_Sel',fld:'vTFALBRTELAR_SEL',pic:''},{av:'AV44TFAlbRMdlCod',fld:'vTFALBRMDLCOD',pic:''},{av:'AV45TFAlbRMdlCod_Sel',fld:'vTFALBRMDLCOD_SEL',pic:''},{av:'AV46TFAlbRLu',fld:'vTFALBRLU',pic:'ZZ9.99'},{av:'AV47TFAlbRLu_To',fld:'vTFALBRLU_TO',pic:'ZZ9.99'},{av:'AV48TFAlbRTara',fld:'vTFALBRTARA',pic:'ZZ9.99'},{av:'AV49TFAlbRTara_To',fld:'vTFALBRTARA_TO',pic:'ZZ9.99'},{av:'AV50TFAlbMaqTej',fld:'vTFALBMAQTEJ',pic:''},{av:'AV51TFAlbMaqTej_Sel',fld:'vTFALBMAQTEJ_SEL',pic:''},{av:'AV78Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV69CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV70CliNom',fld:'vCLINOM',pic:''},{av:'AV71PedidoCliente',fld:'vPEDIDOCLIENTE',pic:''},{av:'AV72BarSer',fld:'vBARSER',pic:''},{av:'AV73BarSerDsc',fld:'vBARSERDSC',pic:''},{av:'AV74BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV75BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV60Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV61TotBarKilLan',fld:'vTOTBARKILLAN',pic:'ZZZZZ9.99',hsh:true},{av:'AV63TotBarMetLan',fld:'vTOTBARMETLAN',pic:'ZZZZZ9.99',hsh:true},{av:'AV65TotBarPieKil',fld:'vTOTBARPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV67TotBarPieMet',fld:'vTOTBARPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A170BarKilLan',fld:'BARKILLAN',pic:'ZZZZZ9.99'},{av:'A183BarMetLan',fld:'BARMETLAN',pic:'ZZZZZ9.99'},{av:'A203BarPieKil',fld:'BARPIEKIL',pic:'ZZZZZ9.99'},{av:'A205BarPieMet',fld:'BARPIEMET',pic:'ZZZZZ9.99'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtBarPieCod_Visible',ctrl:'BARPIECOD',prop:'Visible'},{av:'edtAlbRecCod_Visible',ctrl:'ALBRECCOD',prop:'Visible'},{av:'edtBarKilLan_Visible',ctrl:'BARKILLAN',prop:'Visible'},{av:'edtBarMetLan_Visible',ctrl:'BARMETLAN',prop:'Visible'},{av:'edtBarPieKil_Visible',ctrl:'BARPIEKIL',prop:'Visible'},{av:'edtBarPieMet_Visible',ctrl:'BARPIEMET',prop:'Visible'},{av:'edtBarPieLoc_Visible',ctrl:'BARPIELOC',prop:'Visible'},{av:'edtBarPieEst_Visible',ctrl:'BARPIEEST',prop:'Visible'},{av:'edtAlbREnt_Visible',ctrl:'ALBRENT',prop:'Visible'},{av:'edtAlbRLote_Visible',ctrl:'ALBRLOTE',prop:'Visible'},{av:'edtAlbRTelar_Visible',ctrl:'ALBRTELAR',prop:'Visible'},{av:'edtAlbRMdlCod_Visible',ctrl:'ALBRMDLCOD',prop:'Visible'},{av:'edtAlbRLu_Visible',ctrl:'ALBRLU',prop:'Visible'},{av:'edtAlbRTara_Visible',ctrl:'ALBRTARA',prop:'Visible'},{av:'edtAlbMaqTej_Visible',ctrl:'ALBMAQTEJ',prop:'Visible'},{av:'AV54GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV55GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV40TFAlbRLote',fld:'vTFALBRLOTE',pic:''},{av:'AV41TFAlbRLote_Sel',fld:'vTFALBRLOTE_SEL',pic:''},{av:'AV42TFAlbRTelar',fld:'vTFALBRTELAR',pic:''},{av:'AV43TFAlbRTelar_Sel',fld:'vTFALBRTELAR_SEL',pic:''},{av:'AV44TFAlbRMdlCod',fld:'vTFALBRMDLCOD',pic:''},{av:'AV45TFAlbRMdlCod_Sel',fld:'vTFALBRMDLCOD_SEL',pic:''},{av:'AV46TFAlbRLu',fld:'vTFALBRLU',pic:'ZZ9.99'},{av:'AV47TFAlbRLu_To',fld:'vTFALBRLU_TO',pic:'ZZ9.99'},{av:'AV48TFAlbRTara',fld:'vTFALBRTARA',pic:'ZZ9.99'},{av:'AV49TFAlbRTara_To',fld:'vTFALBRTARA_TO',pic:'ZZ9.99'},{av:'AV50TFAlbMaqTej',fld:'vTFALBMAQTEJ',pic:''},{av:'AV51TFAlbMaqTej_Sel',fld:'vTFALBMAQTEJ_SEL',pic:''},{av:'AV61TotBarKilLan',fld:'vTOTBARKILLAN',pic:'ZZZZZ9.99',hsh:true},{av:'AV63TotBarMetLan',fld:'vTOTBARMETLAN',pic:'ZZZZZ9.99',hsh:true},{av:'AV65TotBarPieKil',fld:'vTOTBARPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV67TotBarPieMet',fld:'vTOTBARPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV62TotValueBarKilLan',fld:'vTOTVALUEBARKILLAN',pic:''},{av:'AV64TotValueBarMetLan',fld:'vTOTVALUEBARMETLAN',pic:''},{av:'AV66TotValueBarPieKil',fld:'vTOTVALUEBARPIEKIL',pic:''},{av:'AV68TotValueBarPieMet',fld:'vTOTVALUEBARPIEMET',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e111YN2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV56Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV57BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV58BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV59BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV22TFBarPieCod',fld:'vTFBARPIECOD',pic:''},{av:'AV23TFBarPieCod_Sel',fld:'vTFBARPIECOD_SEL',pic:''},{av:'AV24TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV25TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV26TFBarKilLan',fld:'vTFBARKILLAN',pic:'ZZZZZ9.99'},{av:'AV27TFBarKilLan_To',fld:'vTFBARKILLAN_TO',pic:'ZZZZZ9.99'},{av:'AV28TFBarMetLan',fld:'vTFBARMETLAN',pic:'ZZZZZ9.99'},{av:'AV29TFBarMetLan_To',fld:'vTFBARMETLAN_TO',pic:'ZZZZZ9.99'},{av:'AV30TFBarPieKil',fld:'vTFBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV31TFBarPieKil_To',fld:'vTFBARPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV32TFBarPieMet',fld:'vTFBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV33TFBarPieMet_To',fld:'vTFBARPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV34TFBarPieLoc',fld:'vTFBARPIELOC',pic:''},{av:'AV35TFBarPieLoc_Sel',fld:'vTFBARPIELOC_SEL',pic:''},{av:'AV36TFBarPieEst',fld:'vTFBARPIEEST',pic:'9'},{av:'AV37TFBarPieEst_To',fld:'vTFBARPIEEST_TO',pic:'9'},{av:'AV38TFAlbREnt',fld:'vTFALBRENT',pic:''},{av:'AV39TFAlbREnt_Sel',fld:'vTFALBRENT_SEL',pic:''},{av:'AV40TFAlbRLote',fld:'vTFALBRLOTE',pic:''},{av:'AV41TFAlbRLote_Sel',fld:'vTFALBRLOTE_SEL',pic:''},{av:'AV42TFAlbRTelar',fld:'vTFALBRTELAR',pic:''},{av:'AV43TFAlbRTelar_Sel',fld:'vTFALBRTELAR_SEL',pic:''},{av:'AV44TFAlbRMdlCod',fld:'vTFALBRMDLCOD',pic:''},{av:'AV45TFAlbRMdlCod_Sel',fld:'vTFALBRMDLCOD_SEL',pic:''},{av:'AV46TFAlbRLu',fld:'vTFALBRLU',pic:'ZZ9.99'},{av:'AV47TFAlbRLu_To',fld:'vTFALBRLU_TO',pic:'ZZ9.99'},{av:'AV48TFAlbRTara',fld:'vTFALBRTARA',pic:'ZZ9.99'},{av:'AV49TFAlbRTara_To',fld:'vTFALBRTARA_TO',pic:'ZZ9.99'},{av:'AV50TFAlbMaqTej',fld:'vTFALBMAQTEJ',pic:''},{av:'AV51TFAlbMaqTej_Sel',fld:'vTFALBMAQTEJ_SEL',pic:''},{av:'AV78Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV69CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV70CliNom',fld:'vCLINOM',pic:''},{av:'AV71PedidoCliente',fld:'vPEDIDOCLIENTE',pic:''},{av:'AV72BarSer',fld:'vBARSER',pic:''},{av:'AV73BarSerDsc',fld:'vBARSERDSC',pic:''},{av:'AV74BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV75BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV60Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV61TotBarKilLan',fld:'vTOTBARKILLAN',pic:'ZZZZZ9.99',hsh:true},{av:'AV63TotBarMetLan',fld:'vTOTBARMETLAN',pic:'ZZZZZ9.99',hsh:true},{av:'AV65TotBarPieKil',fld:'vTOTBARPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV67TotBarPieMet',fld:'vTOTBARPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e121YN2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV56Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV57BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV58BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV59BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV22TFBarPieCod',fld:'vTFBARPIECOD',pic:''},{av:'AV23TFBarPieCod_Sel',fld:'vTFBARPIECOD_SEL',pic:''},{av:'AV24TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV25TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV26TFBarKilLan',fld:'vTFBARKILLAN',pic:'ZZZZZ9.99'},{av:'AV27TFBarKilLan_To',fld:'vTFBARKILLAN_TO',pic:'ZZZZZ9.99'},{av:'AV28TFBarMetLan',fld:'vTFBARMETLAN',pic:'ZZZZZ9.99'},{av:'AV29TFBarMetLan_To',fld:'vTFBARMETLAN_TO',pic:'ZZZZZ9.99'},{av:'AV30TFBarPieKil',fld:'vTFBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV31TFBarPieKil_To',fld:'vTFBARPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV32TFBarPieMet',fld:'vTFBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV33TFBarPieMet_To',fld:'vTFBARPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV34TFBarPieLoc',fld:'vTFBARPIELOC',pic:''},{av:'AV35TFBarPieLoc_Sel',fld:'vTFBARPIELOC_SEL',pic:''},{av:'AV36TFBarPieEst',fld:'vTFBARPIEEST',pic:'9'},{av:'AV37TFBarPieEst_To',fld:'vTFBARPIEEST_TO',pic:'9'},{av:'AV38TFAlbREnt',fld:'vTFALBRENT',pic:''},{av:'AV39TFAlbREnt_Sel',fld:'vTFALBRENT_SEL',pic:''},{av:'AV40TFAlbRLote',fld:'vTFALBRLOTE',pic:''},{av:'AV41TFAlbRLote_Sel',fld:'vTFALBRLOTE_SEL',pic:''},{av:'AV42TFAlbRTelar',fld:'vTFALBRTELAR',pic:''},{av:'AV43TFAlbRTelar_Sel',fld:'vTFALBRTELAR_SEL',pic:''},{av:'AV44TFAlbRMdlCod',fld:'vTFALBRMDLCOD',pic:''},{av:'AV45TFAlbRMdlCod_Sel',fld:'vTFALBRMDLCOD_SEL',pic:''},{av:'AV46TFAlbRLu',fld:'vTFALBRLU',pic:'ZZ9.99'},{av:'AV47TFAlbRLu_To',fld:'vTFALBRLU_TO',pic:'ZZ9.99'},{av:'AV48TFAlbRTara',fld:'vTFALBRTARA',pic:'ZZ9.99'},{av:'AV49TFAlbRTara_To',fld:'vTFALBRTARA_TO',pic:'ZZ9.99'},{av:'AV50TFAlbMaqTej',fld:'vTFALBMAQTEJ',pic:''},{av:'AV51TFAlbMaqTej_Sel',fld:'vTFALBMAQTEJ_SEL',pic:''},{av:'AV78Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV69CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV70CliNom',fld:'vCLINOM',pic:''},{av:'AV71PedidoCliente',fld:'vPEDIDOCLIENTE',pic:''},{av:'AV72BarSer',fld:'vBARSER',pic:''},{av:'AV73BarSerDsc',fld:'vBARSERDSC',pic:''},{av:'AV74BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV75BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV60Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV61TotBarKilLan',fld:'vTOTBARKILLAN',pic:'ZZZZZ9.99',hsh:true},{av:'AV63TotBarMetLan',fld:'vTOTBARMETLAN',pic:'ZZZZZ9.99',hsh:true},{av:'AV65TotBarPieKil',fld:'vTOTBARPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV67TotBarPieMet',fld:'vTOTBARPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e131YN2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV56Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV57BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV58BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV59BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV22TFBarPieCod',fld:'vTFBARPIECOD',pic:''},{av:'AV23TFBarPieCod_Sel',fld:'vTFBARPIECOD_SEL',pic:''},{av:'AV24TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV25TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV26TFBarKilLan',fld:'vTFBARKILLAN',pic:'ZZZZZ9.99'},{av:'AV27TFBarKilLan_To',fld:'vTFBARKILLAN_TO',pic:'ZZZZZ9.99'},{av:'AV28TFBarMetLan',fld:'vTFBARMETLAN',pic:'ZZZZZ9.99'},{av:'AV29TFBarMetLan_To',fld:'vTFBARMETLAN_TO',pic:'ZZZZZ9.99'},{av:'AV30TFBarPieKil',fld:'vTFBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV31TFBarPieKil_To',fld:'vTFBARPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV32TFBarPieMet',fld:'vTFBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV33TFBarPieMet_To',fld:'vTFBARPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV34TFBarPieLoc',fld:'vTFBARPIELOC',pic:''},{av:'AV35TFBarPieLoc_Sel',fld:'vTFBARPIELOC_SEL',pic:''},{av:'AV36TFBarPieEst',fld:'vTFBARPIEEST',pic:'9'},{av:'AV37TFBarPieEst_To',fld:'vTFBARPIEEST_TO',pic:'9'},{av:'AV38TFAlbREnt',fld:'vTFALBRENT',pic:''},{av:'AV39TFAlbREnt_Sel',fld:'vTFALBRENT_SEL',pic:''},{av:'AV40TFAlbRLote',fld:'vTFALBRLOTE',pic:''},{av:'AV41TFAlbRLote_Sel',fld:'vTFALBRLOTE_SEL',pic:''},{av:'AV42TFAlbRTelar',fld:'vTFALBRTELAR',pic:''},{av:'AV43TFAlbRTelar_Sel',fld:'vTFALBRTELAR_SEL',pic:''},{av:'AV44TFAlbRMdlCod',fld:'vTFALBRMDLCOD',pic:''},{av:'AV45TFAlbRMdlCod_Sel',fld:'vTFALBRMDLCOD_SEL',pic:''},{av:'AV46TFAlbRLu',fld:'vTFALBRLU',pic:'ZZ9.99'},{av:'AV47TFAlbRLu_To',fld:'vTFALBRLU_TO',pic:'ZZ9.99'},{av:'AV48TFAlbRTara',fld:'vTFALBRTARA',pic:'ZZ9.99'},{av:'AV49TFAlbRTara_To',fld:'vTFALBRTARA_TO',pic:'ZZ9.99'},{av:'AV50TFAlbMaqTej',fld:'vTFALBMAQTEJ',pic:''},{av:'AV51TFAlbMaqTej_Sel',fld:'vTFALBMAQTEJ_SEL',pic:''},{av:'AV78Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV69CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV70CliNom',fld:'vCLINOM',pic:''},{av:'AV71PedidoCliente',fld:'vPEDIDOCLIENTE',pic:''},{av:'AV72BarSer',fld:'vBARSER',pic:''},{av:'AV73BarSerDsc',fld:'vBARSERDSC',pic:''},{av:'AV74BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV75BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV60Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV61TotBarKilLan',fld:'vTOTBARKILLAN',pic:'ZZZZZ9.99',hsh:true},{av:'AV63TotBarMetLan',fld:'vTOTBARMETLAN',pic:'ZZZZZ9.99',hsh:true},{av:'AV65TotBarPieKil',fld:'vTOTBARPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV67TotBarPieMet',fld:'vTOTBARPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV50TFAlbMaqTej',fld:'vTFALBMAQTEJ',pic:''},{av:'AV51TFAlbMaqTej_Sel',fld:'vTFALBMAQTEJ_SEL',pic:''},{av:'AV48TFAlbRTara',fld:'vTFALBRTARA',pic:'ZZ9.99'},{av:'AV49TFAlbRTara_To',fld:'vTFALBRTARA_TO',pic:'ZZ9.99'},{av:'AV46TFAlbRLu',fld:'vTFALBRLU',pic:'ZZ9.99'},{av:'AV47TFAlbRLu_To',fld:'vTFALBRLU_TO',pic:'ZZ9.99'},{av:'AV44TFAlbRMdlCod',fld:'vTFALBRMDLCOD',pic:''},{av:'AV45TFAlbRMdlCod_Sel',fld:'vTFALBRMDLCOD_SEL',pic:''},{av:'AV42TFAlbRTelar',fld:'vTFALBRTELAR',pic:''},{av:'AV43TFAlbRTelar_Sel',fld:'vTFALBRTELAR_SEL',pic:''},{av:'AV40TFAlbRLote',fld:'vTFALBRLOTE',pic:''},{av:'AV41TFAlbRLote_Sel',fld:'vTFALBRLOTE_SEL',pic:''},{av:'AV38TFAlbREnt',fld:'vTFALBRENT',pic:''},{av:'AV39TFAlbREnt_Sel',fld:'vTFALBRENT_SEL',pic:''},{av:'AV36TFBarPieEst',fld:'vTFBARPIEEST',pic:'9'},{av:'AV37TFBarPieEst_To',fld:'vTFBARPIEEST_TO',pic:'9'},{av:'AV34TFBarPieLoc',fld:'vTFBARPIELOC',pic:''},{av:'AV35TFBarPieLoc_Sel',fld:'vTFBARPIELOC_SEL',pic:''},{av:'AV32TFBarPieMet',fld:'vTFBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV33TFBarPieMet_To',fld:'vTFBARPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV30TFBarPieKil',fld:'vTFBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV31TFBarPieKil_To',fld:'vTFBARPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV28TFBarMetLan',fld:'vTFBARMETLAN',pic:'ZZZZZ9.99'},{av:'AV29TFBarMetLan_To',fld:'vTFBARMETLAN_TO',pic:'ZZZZZ9.99'},{av:'AV26TFBarKilLan',fld:'vTFBARKILLAN',pic:'ZZZZZ9.99'},{av:'AV27TFBarKilLan_To',fld:'vTFBARKILLAN_TO',pic:'ZZZZZ9.99'},{av:'AV24TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV25TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV22TFBarPieCod',fld:'vTFBARPIECOD',pic:''},{av:'AV23TFBarPieCod_Sel',fld:'vTFBARPIECOD_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e191YN2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e141YN2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV56Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV57BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV58BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV59BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV22TFBarPieCod',fld:'vTFBARPIECOD',pic:''},{av:'AV23TFBarPieCod_Sel',fld:'vTFBARPIECOD_SEL',pic:''},{av:'AV24TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV25TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV26TFBarKilLan',fld:'vTFBARKILLAN',pic:'ZZZZZ9.99'},{av:'AV27TFBarKilLan_To',fld:'vTFBARKILLAN_TO',pic:'ZZZZZ9.99'},{av:'AV28TFBarMetLan',fld:'vTFBARMETLAN',pic:'ZZZZZ9.99'},{av:'AV29TFBarMetLan_To',fld:'vTFBARMETLAN_TO',pic:'ZZZZZ9.99'},{av:'AV30TFBarPieKil',fld:'vTFBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV31TFBarPieKil_To',fld:'vTFBARPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV32TFBarPieMet',fld:'vTFBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV33TFBarPieMet_To',fld:'vTFBARPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV34TFBarPieLoc',fld:'vTFBARPIELOC',pic:''},{av:'AV35TFBarPieLoc_Sel',fld:'vTFBARPIELOC_SEL',pic:''},{av:'AV36TFBarPieEst',fld:'vTFBARPIEEST',pic:'9'},{av:'AV37TFBarPieEst_To',fld:'vTFBARPIEEST_TO',pic:'9'},{av:'AV38TFAlbREnt',fld:'vTFALBRENT',pic:''},{av:'AV39TFAlbREnt_Sel',fld:'vTFALBRENT_SEL',pic:''},{av:'AV40TFAlbRLote',fld:'vTFALBRLOTE',pic:''},{av:'AV41TFAlbRLote_Sel',fld:'vTFALBRLOTE_SEL',pic:''},{av:'AV42TFAlbRTelar',fld:'vTFALBRTELAR',pic:''},{av:'AV43TFAlbRTelar_Sel',fld:'vTFALBRTELAR_SEL',pic:''},{av:'AV44TFAlbRMdlCod',fld:'vTFALBRMDLCOD',pic:''},{av:'AV45TFAlbRMdlCod_Sel',fld:'vTFALBRMDLCOD_SEL',pic:''},{av:'AV46TFAlbRLu',fld:'vTFALBRLU',pic:'ZZ9.99'},{av:'AV47TFAlbRLu_To',fld:'vTFALBRLU_TO',pic:'ZZ9.99'},{av:'AV48TFAlbRTara',fld:'vTFALBRTARA',pic:'ZZ9.99'},{av:'AV49TFAlbRTara_To',fld:'vTFALBRTARA_TO',pic:'ZZ9.99'},{av:'AV50TFAlbMaqTej',fld:'vTFALBMAQTEJ',pic:''},{av:'AV51TFAlbMaqTej_Sel',fld:'vTFALBMAQTEJ_SEL',pic:''},{av:'AV78Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV69CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV70CliNom',fld:'vCLINOM',pic:''},{av:'AV71PedidoCliente',fld:'vPEDIDOCLIENTE',pic:''},{av:'AV72BarSer',fld:'vBARSER',pic:''},{av:'AV73BarSerDsc',fld:'vBARSERDSC',pic:''},{av:'AV74BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV75BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV60Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV61TotBarKilLan',fld:'vTOTBARKILLAN',pic:'ZZZZZ9.99',hsh:true},{av:'AV63TotBarMetLan',fld:'vTOTBARMETLAN',pic:'ZZZZZ9.99',hsh:true},{av:'AV65TotBarPieKil',fld:'vTOTBARPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV67TotBarPieMet',fld:'vTOTBARPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A170BarKilLan',fld:'BARKILLAN',pic:'ZZZZZ9.99'},{av:'A183BarMetLan',fld:'BARMETLAN',pic:'ZZZZZ9.99'},{av:'A203BarPieKil',fld:'BARPIEKIL',pic:'ZZZZZ9.99'},{av:'A205BarPieMet',fld:'BARPIEMET',pic:'ZZZZZ9.99'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtBarPieCod_Visible',ctrl:'BARPIECOD',prop:'Visible'},{av:'edtAlbRecCod_Visible',ctrl:'ALBRECCOD',prop:'Visible'},{av:'edtBarKilLan_Visible',ctrl:'BARKILLAN',prop:'Visible'},{av:'edtBarMetLan_Visible',ctrl:'BARMETLAN',prop:'Visible'},{av:'edtBarPieKil_Visible',ctrl:'BARPIEKIL',prop:'Visible'},{av:'edtBarPieMet_Visible',ctrl:'BARPIEMET',prop:'Visible'},{av:'edtBarPieLoc_Visible',ctrl:'BARPIELOC',prop:'Visible'},{av:'edtBarPieEst_Visible',ctrl:'BARPIEEST',prop:'Visible'},{av:'edtAlbREnt_Visible',ctrl:'ALBRENT',prop:'Visible'},{av:'edtAlbRLote_Visible',ctrl:'ALBRLOTE',prop:'Visible'},{av:'edtAlbRTelar_Visible',ctrl:'ALBRTELAR',prop:'Visible'},{av:'edtAlbRMdlCod_Visible',ctrl:'ALBRMDLCOD',prop:'Visible'},{av:'edtAlbRLu_Visible',ctrl:'ALBRLU',prop:'Visible'},{av:'edtAlbRTara_Visible',ctrl:'ALBRTARA',prop:'Visible'},{av:'edtAlbMaqTej_Visible',ctrl:'ALBMAQTEJ',prop:'Visible'},{av:'AV54GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV55GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV40TFAlbRLote',fld:'vTFALBRLOTE',pic:''},{av:'AV41TFAlbRLote_Sel',fld:'vTFALBRLOTE_SEL',pic:''},{av:'AV42TFAlbRTelar',fld:'vTFALBRTELAR',pic:''},{av:'AV43TFAlbRTelar_Sel',fld:'vTFALBRTELAR_SEL',pic:''},{av:'AV44TFAlbRMdlCod',fld:'vTFALBRMDLCOD',pic:''},{av:'AV45TFAlbRMdlCod_Sel',fld:'vTFALBRMDLCOD_SEL',pic:''},{av:'AV46TFAlbRLu',fld:'vTFALBRLU',pic:'ZZ9.99'},{av:'AV47TFAlbRLu_To',fld:'vTFALBRLU_TO',pic:'ZZ9.99'},{av:'AV48TFAlbRTara',fld:'vTFALBRTARA',pic:'ZZ9.99'},{av:'AV49TFAlbRTara_To',fld:'vTFALBRTARA_TO',pic:'ZZ9.99'},{av:'AV50TFAlbMaqTej',fld:'vTFALBMAQTEJ',pic:''},{av:'AV51TFAlbMaqTej_Sel',fld:'vTFALBMAQTEJ_SEL',pic:''},{av:'AV61TotBarKilLan',fld:'vTOTBARKILLAN',pic:'ZZZZZ9.99',hsh:true},{av:'AV63TotBarMetLan',fld:'vTOTBARMETLAN',pic:'ZZZZZ9.99',hsh:true},{av:'AV65TotBarPieKil',fld:'vTOTBARPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV67TotBarPieMet',fld:'vTOTBARPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV62TotValueBarKilLan',fld:'vTOTVALUEBARKILLAN',pic:''},{av:'AV64TotValueBarMetLan',fld:'vTOTVALUEBARMETLAN',pic:''},{av:'AV66TotValueBarPieKil',fld:'vTOTVALUEBARPIEKIL',pic:''},{av:'AV68TotValueBarPieMet',fld:'vTOTVALUEBARPIEMET',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e151YN2',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e161YN2',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VALIDV_BARCOD","{handler:'validv_Barcod',iparms:[]");
      setEventMetadata("VALIDV_BARCOD",",oparms:[]}");
      setEventMetadata("VALIDV_BARCODREO","{handler:'validv_Barcodreo',iparms:[]");
      setEventMetadata("VALIDV_BARCODREO",",oparms:[]}");
      setEventMetadata("VALIDV_BARCODPAR","{handler:'validv_Barcodpar',iparms:[]");
      setEventMetadata("VALIDV_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_ALBRECCOD","{handler:'valid_Albreccod',iparms:[]");
      setEventMetadata("VALID_ALBRECCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Albmaqtej',iparms:[]");
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
      wcpOAV56Emprcod = "" ;
      wcpOAV59BarCodPar = "" ;
      wcpOAV70CliNom = "" ;
      wcpOAV71PedidoCliente = "" ;
      wcpOAV72BarSer = "" ;
      wcpOAV73BarSerDsc = "" ;
      wcpOAV74BarColNom = "" ;
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
      AV56Emprcod = "" ;
      AV59BarCodPar = "" ;
      AV70CliNom = "" ;
      AV71PedidoCliente = "" ;
      AV72BarSer = "" ;
      AV73BarSerDsc = "" ;
      AV74BarColNom = "" ;
      AV19ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV22TFBarPieCod = "" ;
      AV23TFBarPieCod_Sel = "" ;
      AV26TFBarKilLan = DecimalUtil.ZERO ;
      AV27TFBarKilLan_To = DecimalUtil.ZERO ;
      AV28TFBarMetLan = DecimalUtil.ZERO ;
      AV29TFBarMetLan_To = DecimalUtil.ZERO ;
      AV30TFBarPieKil = DecimalUtil.ZERO ;
      AV31TFBarPieKil_To = DecimalUtil.ZERO ;
      AV32TFBarPieMet = DecimalUtil.ZERO ;
      AV33TFBarPieMet_To = DecimalUtil.ZERO ;
      AV34TFBarPieLoc = "" ;
      AV35TFBarPieLoc_Sel = "" ;
      AV38TFAlbREnt = "" ;
      AV39TFAlbREnt_Sel = "" ;
      AV40TFAlbRLote = "" ;
      AV41TFAlbRLote_Sel = "" ;
      AV42TFAlbRTelar = "" ;
      AV43TFAlbRTelar_Sel = "" ;
      AV44TFAlbRMdlCod = "" ;
      AV45TFAlbRMdlCod_Sel = "" ;
      AV46TFAlbRLu = DecimalUtil.ZERO ;
      AV47TFAlbRLu_To = DecimalUtil.ZERO ;
      AV48TFAlbRTara = DecimalUtil.ZERO ;
      AV49TFAlbRTara_To = DecimalUtil.ZERO ;
      AV50TFAlbMaqTej = "" ;
      AV51TFAlbMaqTej_Sel = "" ;
      AV78Pgmname = "" ;
      AV61TotBarKilLan = DecimalUtil.ZERO ;
      AV63TotBarMetLan = DecimalUtil.ZERO ;
      AV65TotBarPieKil = DecimalUtil.ZERO ;
      AV67TotBarPieMet = DecimalUtil.ZERO ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV52DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
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
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A200BarPieCod = "" ;
      A170BarKilLan = DecimalUtil.ZERO ;
      A183BarMetLan = DecimalUtil.ZERO ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A2186BarPieLoc = "" ;
      A46AlbREnt = "" ;
      A6463AlbRLote = "" ;
      A6464AlbRTelar = "" ;
      A4602AlbRMdlCod = "" ;
      A6465AlbRLu = DecimalUtil.ZERO ;
      A6470AlbRTara = DecimalUtil.ZERO ;
      A8035AlbMaqTej = "" ;
      scmdbuf = "" ;
      lV82Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod = "" ;
      lV94Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc = "" ;
      lV98Produccion_consultadeproduccion_almacentejidods_17_tfalbrent = "" ;
      lV100Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote = "" ;
      lV102Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar = "" ;
      lV104Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod = "" ;
      lV110Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej = "" ;
      AV83Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel = "" ;
      AV82Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod = "" ;
      AV86Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan = DecimalUtil.ZERO ;
      AV87Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to = DecimalUtil.ZERO ;
      AV88Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan = DecimalUtil.ZERO ;
      AV89Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to = DecimalUtil.ZERO ;
      AV90Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil = DecimalUtil.ZERO ;
      AV91Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to = DecimalUtil.ZERO ;
      AV92Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet = DecimalUtil.ZERO ;
      AV93Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to = DecimalUtil.ZERO ;
      AV95Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel = "" ;
      AV94Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc = "" ;
      AV99Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel = "" ;
      AV98Produccion_consultadeproduccion_almacentejidods_17_tfalbrent = "" ;
      AV101Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel = "" ;
      AV100Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote = "" ;
      AV103Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel = "" ;
      AV102Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar = "" ;
      AV105Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel = "" ;
      AV104Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod = "" ;
      AV106Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu = DecimalUtil.ZERO ;
      AV107Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to = DecimalUtil.ZERO ;
      AV108Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara = DecimalUtil.ZERO ;
      AV109Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to = DecimalUtil.ZERO ;
      AV111Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel = "" ;
      AV110Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej = "" ;
      H01YN2_A130BarCodPar = new String[] {""} ;
      H01YN2_A132BarCodReo = new byte[1] ;
      H01YN2_A129BarCod = new int[1] ;
      H01YN2_A396EmprCod = new String[] {""} ;
      H01YN2_A8035AlbMaqTej = new String[] {""} ;
      H01YN2_A6470AlbRTara = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01YN2_A6465AlbRLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01YN2_A4602AlbRMdlCod = new String[] {""} ;
      H01YN2_A6464AlbRTelar = new String[] {""} ;
      H01YN2_A6463AlbRLote = new String[] {""} ;
      H01YN2_A46AlbREnt = new String[] {""} ;
      H01YN2_A201BarPieEst = new byte[1] ;
      H01YN2_A2186BarPieLoc = new String[] {""} ;
      H01YN2_n2186BarPieLoc = new boolean[] {false} ;
      H01YN2_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01YN2_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01YN2_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01YN2_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01YN2_A44AlbRecCod = new int[1] ;
      H01YN2_A200BarPieCod = new String[] {""} ;
      H01YN3_AGRID_nRecordCount = new long[1] ;
      AV62TotValueBarKilLan = "" ;
      AV64TotValueBarMetLan = "" ;
      AV66TotValueBarPieKil = "" ;
      AV68TotValueBarPieMet = "" ;
      hsh = "" ;
      GXv_int2 = new byte[1] ;
      AV79Station = "" ;
      AV80Emprnom = "" ;
      AV81Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV21Session = httpContext.getWebSession();
      AV17ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV15ExcelFilename = "" ;
      AV16ErrorMessage = "" ;
      AV18UserCustomValue = "" ;
      AV20ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector11 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char20 = "" ;
      GXv_char21 = new String[1] ;
      GXt_char18 = "" ;
      GXv_char19 = new String[1] ;
      GXt_char16 = "" ;
      GXv_char17 = new String[1] ;
      GXt_char14 = "" ;
      GXv_char15 = new String[1] ;
      GXt_char13 = "" ;
      GXv_char6 = new String[1] ;
      GXt_char12 = "" ;
      GXv_char5 = new String[1] ;
      GXt_char3 = "" ;
      GXv_char4 = new String[1] ;
      GXv_SdtWWPGridState22 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      H01YN4_A130BarCodPar = new String[] {""} ;
      H01YN4_A132BarCodReo = new byte[1] ;
      H01YN4_A129BarCod = new int[1] ;
      H01YN4_A396EmprCod = new String[] {""} ;
      H01YN4_A8035AlbMaqTej = new String[] {""} ;
      H01YN4_A6470AlbRTara = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01YN4_A6465AlbRLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01YN4_A4602AlbRMdlCod = new String[] {""} ;
      H01YN4_A6464AlbRTelar = new String[] {""} ;
      H01YN4_A6463AlbRLote = new String[] {""} ;
      H01YN4_A46AlbREnt = new String[] {""} ;
      H01YN4_A201BarPieEst = new byte[1] ;
      H01YN4_A2186BarPieLoc = new String[] {""} ;
      H01YN4_n2186BarPieLoc = new boolean[] {false} ;
      H01YN4_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01YN4_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01YN4_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01YN4_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01YN4_A44AlbRecCod = new int[1] ;
      H01YN4_A200BarPieCod = new String[] {""} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV56Emprcod = "" ;
      sCtrlAV57BarCod = "" ;
      sCtrlAV58BarCodReo = "" ;
      sCtrlAV59BarCodPar = "" ;
      sCtrlAV69CliCod = "" ;
      sCtrlAV70CliNom = "" ;
      sCtrlAV71PedidoCliente = "" ;
      sCtrlAV72BarSer = "" ;
      sCtrlAV73BarSerDsc = "" ;
      sCtrlAV74BarColNom = "" ;
      sCtrlAV75BarColNum = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.consultadeproduccion_almacentejido__default(),
         new Object[] {
             new Object[] {
            H01YN2_A130BarCodPar, H01YN2_A132BarCodReo, H01YN2_A129BarCod, H01YN2_A396EmprCod, H01YN2_A8035AlbMaqTej, H01YN2_A6470AlbRTara, H01YN2_A6465AlbRLu, H01YN2_A4602AlbRMdlCod, H01YN2_A6464AlbRTelar, H01YN2_A6463AlbRLote,
            H01YN2_A46AlbREnt, H01YN2_A201BarPieEst, H01YN2_A2186BarPieLoc, H01YN2_n2186BarPieLoc, H01YN2_A205BarPieMet, H01YN2_A203BarPieKil, H01YN2_A183BarMetLan, H01YN2_A170BarKilLan, H01YN2_A44AlbRecCod, H01YN2_A200BarPieCod
            }
            , new Object[] {
            H01YN3_AGRID_nRecordCount
            }
            , new Object[] {
            H01YN4_A130BarCodPar, H01YN4_A132BarCodReo, H01YN4_A129BarCod, H01YN4_A396EmprCod, H01YN4_A8035AlbMaqTej, H01YN4_A6470AlbRTara, H01YN4_A6465AlbRLu, H01YN4_A4602AlbRMdlCod, H01YN4_A6464AlbRTelar, H01YN4_A6463AlbRLote,
            H01YN4_A46AlbREnt, H01YN4_A201BarPieEst, H01YN4_A2186BarPieLoc, H01YN4_n2186BarPieLoc, H01YN4_A205BarPieMet, H01YN4_A203BarPieKil, H01YN4_A183BarMetLan, H01YN4_A170BarKilLan, H01YN4_A44AlbRecCod, H01YN4_A200BarPieCod
            }
         }
      );
      AV78Pgmname = "Produccion.ConsultadeProduccion_AlmacenTejido" ;
      /* GeneXus formulas. */
      AV78Pgmname = "Produccion.ConsultadeProduccion_AlmacenTejido" ;
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
      edtavTotvaluebarkillan_Enabled = 0 ;
      edtavTotvaluebarmetlan_Enabled = 0 ;
      edtavTotvaluebarpiekil_Enabled = 0 ;
      edtavTotvaluebarpiemet_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV58BarCodReo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV58BarCodReo ;
   private byte AV36TFBarPieEst ;
   private byte AV37TFBarPieEst_To ;
   private byte A132BarCodReo ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A201BarPieEst ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV96Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest ;
   private byte AV97Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
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
   private short AV60Moda21 ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV57BarCod ;
   private int wcpOAV69CliCod ;
   private int wcpOAV75BarColNum ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_87 ;
   private int AV57BarCod ;
   private int AV69CliCod ;
   private int AV75BarColNum ;
   private int nGXsfl_87_idx=1 ;
   private int AV24TFAlbRecCod ;
   private int AV25TFAlbRecCod_To ;
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
   private int edtavPgmname_Enabled ;
   private int A44AlbRecCod ;
   private int subGrid_Islastpage ;
   private int edtavTotvaluebarkillan_Enabled ;
   private int edtavTotvaluebarmetlan_Enabled ;
   private int edtavTotvaluebarpiekil_Enabled ;
   private int edtavTotvaluebarpiemet_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV84Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod ;
   private int AV85Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to ;
   private int edtBarPieCod_Visible ;
   private int edtAlbRecCod_Visible ;
   private int edtBarKilLan_Visible ;
   private int edtBarMetLan_Visible ;
   private int edtBarPieKil_Visible ;
   private int edtBarPieMet_Visible ;
   private int edtBarPieLoc_Visible ;
   private int edtBarPieEst_Visible ;
   private int edtAlbREnt_Visible ;
   private int edtAlbRLote_Visible ;
   private int edtAlbRTelar_Visible ;
   private int edtAlbRMdlCod_Visible ;
   private int edtAlbRLu_Visible ;
   private int edtAlbRTara_Visible ;
   private int edtAlbMaqTej_Visible ;
   private int AV53PageToGo ;
   private int AV112GXV1 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV54GridCurrentPage ;
   private long AV55GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV26TFBarKilLan ;
   private java.math.BigDecimal AV27TFBarKilLan_To ;
   private java.math.BigDecimal AV28TFBarMetLan ;
   private java.math.BigDecimal AV29TFBarMetLan_To ;
   private java.math.BigDecimal AV30TFBarPieKil ;
   private java.math.BigDecimal AV31TFBarPieKil_To ;
   private java.math.BigDecimal AV32TFBarPieMet ;
   private java.math.BigDecimal AV33TFBarPieMet_To ;
   private java.math.BigDecimal AV46TFAlbRLu ;
   private java.math.BigDecimal AV47TFAlbRLu_To ;
   private java.math.BigDecimal AV48TFAlbRTara ;
   private java.math.BigDecimal AV49TFAlbRTara_To ;
   private java.math.BigDecimal AV61TotBarKilLan ;
   private java.math.BigDecimal AV63TotBarMetLan ;
   private java.math.BigDecimal AV65TotBarPieKil ;
   private java.math.BigDecimal AV67TotBarPieMet ;
   private java.math.BigDecimal A170BarKilLan ;
   private java.math.BigDecimal A183BarMetLan ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal A6465AlbRLu ;
   private java.math.BigDecimal A6470AlbRTara ;
   private java.math.BigDecimal AV86Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan ;
   private java.math.BigDecimal AV87Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to ;
   private java.math.BigDecimal AV88Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan ;
   private java.math.BigDecimal AV89Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to ;
   private java.math.BigDecimal AV90Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil ;
   private java.math.BigDecimal AV91Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to ;
   private java.math.BigDecimal AV92Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet ;
   private java.math.BigDecimal AV93Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to ;
   private java.math.BigDecimal AV106Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu ;
   private java.math.BigDecimal AV107Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to ;
   private java.math.BigDecimal AV108Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara ;
   private java.math.BigDecimal AV109Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to ;
   private String wcpOAV56Emprcod ;
   private String wcpOAV59BarCodPar ;
   private String wcpOAV70CliNom ;
   private String wcpOAV71PedidoCliente ;
   private String wcpOAV72BarSer ;
   private String wcpOAV73BarSerDsc ;
   private String wcpOAV74BarColNom ;
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
   private String AV56Emprcod ;
   private String AV59BarCodPar ;
   private String AV70CliNom ;
   private String AV71PedidoCliente ;
   private String AV72BarSer ;
   private String AV73BarSerDsc ;
   private String AV74BarColNom ;
   private String sGXsfl_87_idx="0001" ;
   private String AV22TFBarPieCod ;
   private String AV23TFBarPieCod_Sel ;
   private String AV34TFBarPieLoc ;
   private String AV35TFBarPieLoc_Sel ;
   private String AV38TFAlbREnt ;
   private String AV39TFAlbREnt_Sel ;
   private String AV40TFAlbRLote ;
   private String AV41TFAlbRLote_Sel ;
   private String AV42TFAlbRTelar ;
   private String AV43TFAlbRTelar_Sel ;
   private String AV44TFAlbRMdlCod ;
   private String AV45TFAlbRMdlCod_Sel ;
   private String AV50TFAlbMaqTej ;
   private String AV51TFAlbMaqTej_Sel ;
   private String AV78Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
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
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavTotvaluebarkillan_Internalname ;
   private String A200BarPieCod ;
   private String edtBarPieCod_Internalname ;
   private String edtAlbRecCod_Internalname ;
   private String edtBarKilLan_Internalname ;
   private String edtBarMetLan_Internalname ;
   private String edtBarPieKil_Internalname ;
   private String edtBarPieMet_Internalname ;
   private String A2186BarPieLoc ;
   private String edtBarPieLoc_Internalname ;
   private String edtBarPieEst_Internalname ;
   private String A46AlbREnt ;
   private String edtAlbREnt_Internalname ;
   private String A6463AlbRLote ;
   private String edtAlbRLote_Internalname ;
   private String A6464AlbRTelar ;
   private String edtAlbRTelar_Internalname ;
   private String A4602AlbRMdlCod ;
   private String edtAlbRMdlCod_Internalname ;
   private String edtAlbRLu_Internalname ;
   private String edtAlbRTara_Internalname ;
   private String A8035AlbMaqTej ;
   private String edtAlbMaqTej_Internalname ;
   private String edtavTotvaluebarmetlan_Internalname ;
   private String edtavTotvaluebarpiekil_Internalname ;
   private String edtavTotvaluebarpiemet_Internalname ;
   private String scmdbuf ;
   private String lV82Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod ;
   private String lV94Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc ;
   private String lV98Produccion_consultadeproduccion_almacentejidods_17_tfalbrent ;
   private String lV100Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote ;
   private String lV102Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar ;
   private String lV104Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod ;
   private String lV110Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej ;
   private String AV83Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel ;
   private String AV82Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod ;
   private String AV95Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel ;
   private String AV94Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc ;
   private String AV99Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel ;
   private String AV98Produccion_consultadeproduccion_almacentejidods_17_tfalbrent ;
   private String AV101Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel ;
   private String AV100Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote ;
   private String AV103Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel ;
   private String AV102Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar ;
   private String AV105Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel ;
   private String AV104Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod ;
   private String AV111Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel ;
   private String AV110Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej ;
   private String hsh ;
   private String AV79Station ;
   private String AV80Emprnom ;
   private String AV81Usurcod ;
   private String GXt_char20 ;
   private String GXv_char21[] ;
   private String GXt_char18 ;
   private String GXv_char19[] ;
   private String GXt_char16 ;
   private String GXv_char17[] ;
   private String GXt_char14 ;
   private String GXv_char15[] ;
   private String GXt_char13 ;
   private String GXv_char6[] ;
   private String GXt_char12 ;
   private String GXv_char5[] ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvaluebarkillan_Jsonclick ;
   private String edtavTotvaluebarmetlan_Jsonclick ;
   private String edtavTotvaluebarpiekil_Jsonclick ;
   private String edtavTotvaluebarpiemet_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String sCtrlAV56Emprcod ;
   private String sCtrlAV57BarCod ;
   private String sCtrlAV58BarCodReo ;
   private String sCtrlAV59BarCodPar ;
   private String sCtrlAV69CliCod ;
   private String sCtrlAV70CliNom ;
   private String sCtrlAV71PedidoCliente ;
   private String sCtrlAV72BarSer ;
   private String sCtrlAV73BarSerDsc ;
   private String sCtrlAV74BarColNom ;
   private String sCtrlAV75BarColNum ;
   private String sGXsfl_87_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtBarPieCod_Jsonclick ;
   private String edtAlbRecCod_Jsonclick ;
   private String edtBarKilLan_Jsonclick ;
   private String edtBarMetLan_Jsonclick ;
   private String edtBarPieKil_Jsonclick ;
   private String edtBarPieMet_Jsonclick ;
   private String edtBarPieLoc_Jsonclick ;
   private String edtBarPieEst_Jsonclick ;
   private String edtAlbREnt_Jsonclick ;
   private String edtAlbRLote_Jsonclick ;
   private String edtAlbRTelar_Jsonclick ;
   private String edtAlbRMdlCod_Jsonclick ;
   private String edtAlbRLu_Jsonclick ;
   private String edtAlbRTara_Jsonclick ;
   private String edtAlbMaqTej_Jsonclick ;
   private String subGrid_Header ;
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
   private boolean n2186BarPieLoc ;
   private boolean bGXsfl_87_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV17ColumnsSelectorXML ;
   private String AV18UserCustomValue ;
   private String AV62TotValueBarKilLan ;
   private String AV64TotValueBarMetLan ;
   private String AV66TotValueBarPieKil ;
   private String AV68TotValueBarPieMet ;
   private String AV15ExcelFilename ;
   private String AV16ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV21Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] H01YN2_A130BarCodPar ;
   private byte[] H01YN2_A132BarCodReo ;
   private int[] H01YN2_A129BarCod ;
   private String[] H01YN2_A396EmprCod ;
   private String[] H01YN2_A8035AlbMaqTej ;
   private java.math.BigDecimal[] H01YN2_A6470AlbRTara ;
   private java.math.BigDecimal[] H01YN2_A6465AlbRLu ;
   private String[] H01YN2_A4602AlbRMdlCod ;
   private String[] H01YN2_A6464AlbRTelar ;
   private String[] H01YN2_A6463AlbRLote ;
   private String[] H01YN2_A46AlbREnt ;
   private byte[] H01YN2_A201BarPieEst ;
   private String[] H01YN2_A2186BarPieLoc ;
   private boolean[] H01YN2_n2186BarPieLoc ;
   private java.math.BigDecimal[] H01YN2_A205BarPieMet ;
   private java.math.BigDecimal[] H01YN2_A203BarPieKil ;
   private java.math.BigDecimal[] H01YN2_A183BarMetLan ;
   private java.math.BigDecimal[] H01YN2_A170BarKilLan ;
   private int[] H01YN2_A44AlbRecCod ;
   private String[] H01YN2_A200BarPieCod ;
   private long[] H01YN3_AGRID_nRecordCount ;
   private String[] H01YN4_A130BarCodPar ;
   private byte[] H01YN4_A132BarCodReo ;
   private int[] H01YN4_A129BarCod ;
   private String[] H01YN4_A396EmprCod ;
   private String[] H01YN4_A8035AlbMaqTej ;
   private java.math.BigDecimal[] H01YN4_A6470AlbRTara ;
   private java.math.BigDecimal[] H01YN4_A6465AlbRLu ;
   private String[] H01YN4_A4602AlbRMdlCod ;
   private String[] H01YN4_A6464AlbRTelar ;
   private String[] H01YN4_A6463AlbRLote ;
   private String[] H01YN4_A46AlbREnt ;
   private byte[] H01YN4_A201BarPieEst ;
   private String[] H01YN4_A2186BarPieLoc ;
   private boolean[] H01YN4_n2186BarPieLoc ;
   private java.math.BigDecimal[] H01YN4_A205BarPieMet ;
   private java.math.BigDecimal[] H01YN4_A203BarPieKil ;
   private java.math.BigDecimal[] H01YN4_A183BarMetLan ;
   private java.math.BigDecimal[] H01YN4_A170BarKilLan ;
   private int[] H01YN4_A44AlbRecCod ;
   private String[] H01YN4_A200BarPieCod ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState22[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV19ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector10[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector11[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV52DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[] ;
}

final  class consultadeproduccion_almacentejido__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01YN2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV83Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel ,
                                          String AV82Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod ,
                                          int AV84Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod ,
                                          int AV85Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to ,
                                          java.math.BigDecimal AV86Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan ,
                                          java.math.BigDecimal AV87Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to ,
                                          java.math.BigDecimal AV88Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan ,
                                          java.math.BigDecimal AV89Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to ,
                                          java.math.BigDecimal AV90Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil ,
                                          java.math.BigDecimal AV91Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to ,
                                          java.math.BigDecimal AV92Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet ,
                                          java.math.BigDecimal AV93Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to ,
                                          String AV95Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel ,
                                          String AV94Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc ,
                                          byte AV96Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest ,
                                          byte AV97Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to ,
                                          String AV99Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel ,
                                          String AV98Produccion_consultadeproduccion_almacentejidods_17_tfalbrent ,
                                          String AV101Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel ,
                                          String AV100Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote ,
                                          String AV103Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel ,
                                          String AV102Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar ,
                                          String AV105Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel ,
                                          String AV104Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod ,
                                          java.math.BigDecimal AV106Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu ,
                                          java.math.BigDecimal AV107Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to ,
                                          java.math.BigDecimal AV108Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara ,
                                          java.math.BigDecimal AV109Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to ,
                                          String AV111Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel ,
                                          String AV110Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej ,
                                          String A200BarPieCod ,
                                          int A44AlbRecCod ,
                                          java.math.BigDecimal A170BarKilLan ,
                                          java.math.BigDecimal A183BarMetLan ,
                                          java.math.BigDecimal A203BarPieKil ,
                                          java.math.BigDecimal A205BarPieMet ,
                                          String A2186BarPieLoc ,
                                          byte A201BarPieEst ,
                                          String A46AlbREnt ,
                                          String A6463AlbRLote ,
                                          String A6464AlbRTelar ,
                                          String A4602AlbRMdlCod ,
                                          java.math.BigDecimal A6465AlbRLu ,
                                          java.math.BigDecimal A6470AlbRTara ,
                                          String A8035AlbMaqTej ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV56Emprcod ,
                                          int AV57BarCod ,
                                          byte AV58BarCodReo ,
                                          String AV59BarCodPar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int23 = new byte[39];
      Object[] GXv_Object24 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T2.AlbMaqTej, T2.AlbRTara, T2.AlbRLu, T2.AlbRMdlCod, T2.AlbRTelar, T2.AlbRLote, T2.AlbREnt, T1.BarPieEst, T1.BarPieLoc," ;
      sSelectString += " T1.BarPieMet, T1.BarPieKil, T1.BarMetLan, T1.BarKilLan, T1.AlbRecCod, T1.BarPieCod" ;
      sFromString = " FROM (TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV83Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel)==0) && ( ! (GXutil.strcmp("", AV82Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarPieCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieCod = ?)");
      }
      else
      {
         GXv_int23[5] = (byte)(1) ;
      }
      if ( ! (0==AV84Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int23[6] = (byte)(1) ;
      }
      if ( ! (0==AV85Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int23[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan)==0) )
      {
         addWhere(sWhereString, "(T1.BarKilLan >= ?)");
      }
      else
      {
         GXv_int23[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarKilLan <= ?)");
      }
      else
      {
         GXv_int23[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan)==0) )
      {
         addWhere(sWhereString, "(T1.BarMetLan >= ?)");
      }
      else
      {
         GXv_int23[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarMetLan <= ?)");
      }
      else
      {
         GXv_int23[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil >= ?)");
      }
      else
      {
         GXv_int23[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil <= ?)");
      }
      else
      {
         GXv_int23[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet >= ?)");
      }
      else
      {
         GXv_int23[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet <= ?)");
      }
      else
      {
         GXv_int23[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel)==0) && ( ! (GXutil.strcmp("", AV94Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarPieLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieLoc = ?)");
      }
      else
      {
         GXv_int23[17] = (byte)(1) ;
      }
      if ( ! (0==AV96Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest) )
      {
         addWhere(sWhereString, "(T1.BarPieEst >= ?)");
      }
      else
      {
         GXv_int23[18] = (byte)(1) ;
      }
      if ( ! (0==AV97Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to) )
      {
         addWhere(sWhereString, "(T1.BarPieEst <= ?)");
      }
      else
      {
         GXv_int23[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel)==0) && ( ! (GXutil.strcmp("", AV98Produccion_consultadeproduccion_almacentejidods_17_tfalbrent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbREnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbREnt = ?)");
      }
      else
      {
         GXv_int23[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel)==0) && ( ! (GXutil.strcmp("", AV100Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLote = ?)");
      }
      else
      {
         GXv_int23[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel)==0) && ( ! (GXutil.strcmp("", AV102Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRTelar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRTelar = ?)");
      }
      else
      {
         GXv_int23[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel)==0) && ( ! (GXutil.strcmp("", AV104Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRMdlCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRMdlCod = ?)");
      }
      else
      {
         GXv_int23[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLu >= ?)");
      }
      else
      {
         GXv_int23[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV107Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLu <= ?)");
      }
      else
      {
         GXv_int23[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV108Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRTara >= ?)");
      }
      else
      {
         GXv_int23[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV109Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRTara <= ?)");
      }
      else
      {
         GXv_int23[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel)==0) && ( ! (GXutil.strcmp("", AV110Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbMaqTej) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbMaqTej = ?)");
      }
      else
      {
         GXv_int23[33] = (byte)(1) ;
      }
      if ( AV12OrderedBy == 1 )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarPieCod" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarPieCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbRecCod" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbRecCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarKilLan" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarKilLan DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarMetLan" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarMetLan DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarPieKil" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarPieKil DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarPieMet" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarPieMet DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarPieLoc" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarPieLoc DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarPieEst" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarPieEst DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.AlbREnt" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.AlbREnt DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.AlbRLote" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.AlbRLote DESC" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.AlbRTelar" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.AlbRTelar DESC" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.AlbRMdlCod" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.AlbRMdlCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.AlbRLu" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.AlbRLu DESC" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.AlbRTara" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.AlbRTara DESC" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.AlbMaqTej" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.AlbMaqTej DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object24[0] = scmdbuf ;
      GXv_Object24[1] = GXv_int23 ;
      return GXv_Object24 ;
   }

   protected Object[] conditional_H01YN3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV83Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel ,
                                          String AV82Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod ,
                                          int AV84Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod ,
                                          int AV85Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to ,
                                          java.math.BigDecimal AV86Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan ,
                                          java.math.BigDecimal AV87Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to ,
                                          java.math.BigDecimal AV88Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan ,
                                          java.math.BigDecimal AV89Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to ,
                                          java.math.BigDecimal AV90Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil ,
                                          java.math.BigDecimal AV91Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to ,
                                          java.math.BigDecimal AV92Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet ,
                                          java.math.BigDecimal AV93Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to ,
                                          String AV95Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel ,
                                          String AV94Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc ,
                                          byte AV96Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest ,
                                          byte AV97Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to ,
                                          String AV99Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel ,
                                          String AV98Produccion_consultadeproduccion_almacentejidods_17_tfalbrent ,
                                          String AV101Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel ,
                                          String AV100Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote ,
                                          String AV103Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel ,
                                          String AV102Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar ,
                                          String AV105Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel ,
                                          String AV104Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod ,
                                          java.math.BigDecimal AV106Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu ,
                                          java.math.BigDecimal AV107Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to ,
                                          java.math.BigDecimal AV108Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara ,
                                          java.math.BigDecimal AV109Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to ,
                                          String AV111Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel ,
                                          String AV110Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej ,
                                          String A200BarPieCod ,
                                          int A44AlbRecCod ,
                                          java.math.BigDecimal A170BarKilLan ,
                                          java.math.BigDecimal A183BarMetLan ,
                                          java.math.BigDecimal A203BarPieKil ,
                                          java.math.BigDecimal A205BarPieMet ,
                                          String A2186BarPieLoc ,
                                          byte A201BarPieEst ,
                                          String A46AlbREnt ,
                                          String A6463AlbRLote ,
                                          String A6464AlbRTelar ,
                                          String A4602AlbRMdlCod ,
                                          java.math.BigDecimal A6465AlbRLu ,
                                          java.math.BigDecimal A6470AlbRTara ,
                                          String A8035AlbMaqTej ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV56Emprcod ,
                                          int AV57BarCod ,
                                          byte AV58BarCodReo ,
                                          String AV59BarCodPar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int25 = new byte[34];
      Object[] GXv_Object26 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV83Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel)==0) && ( ! (GXutil.strcmp("", AV82Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarPieCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieCod = ?)");
      }
      else
      {
         GXv_int25[5] = (byte)(1) ;
      }
      if ( ! (0==AV84Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int25[6] = (byte)(1) ;
      }
      if ( ! (0==AV85Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int25[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan)==0) )
      {
         addWhere(sWhereString, "(T1.BarKilLan >= ?)");
      }
      else
      {
         GXv_int25[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarKilLan <= ?)");
      }
      else
      {
         GXv_int25[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan)==0) )
      {
         addWhere(sWhereString, "(T1.BarMetLan >= ?)");
      }
      else
      {
         GXv_int25[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarMetLan <= ?)");
      }
      else
      {
         GXv_int25[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil >= ?)");
      }
      else
      {
         GXv_int25[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil <= ?)");
      }
      else
      {
         GXv_int25[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet >= ?)");
      }
      else
      {
         GXv_int25[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet <= ?)");
      }
      else
      {
         GXv_int25[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel)==0) && ( ! (GXutil.strcmp("", AV94Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarPieLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieLoc = ?)");
      }
      else
      {
         GXv_int25[17] = (byte)(1) ;
      }
      if ( ! (0==AV96Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest) )
      {
         addWhere(sWhereString, "(T1.BarPieEst >= ?)");
      }
      else
      {
         GXv_int25[18] = (byte)(1) ;
      }
      if ( ! (0==AV97Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to) )
      {
         addWhere(sWhereString, "(T1.BarPieEst <= ?)");
      }
      else
      {
         GXv_int25[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel)==0) && ( ! (GXutil.strcmp("", AV98Produccion_consultadeproduccion_almacentejidods_17_tfalbrent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbREnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbREnt = ?)");
      }
      else
      {
         GXv_int25[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel)==0) && ( ! (GXutil.strcmp("", AV100Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLote = ?)");
      }
      else
      {
         GXv_int25[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel)==0) && ( ! (GXutil.strcmp("", AV102Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRTelar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRTelar = ?)");
      }
      else
      {
         GXv_int25[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel)==0) && ( ! (GXutil.strcmp("", AV104Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRMdlCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRMdlCod = ?)");
      }
      else
      {
         GXv_int25[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLu >= ?)");
      }
      else
      {
         GXv_int25[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV107Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLu <= ?)");
      }
      else
      {
         GXv_int25[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV108Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRTara >= ?)");
      }
      else
      {
         GXv_int25[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV109Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRTara <= ?)");
      }
      else
      {
         GXv_int25[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel)==0) && ( ! (GXutil.strcmp("", AV110Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbMaqTej) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbMaqTej = ?)");
      }
      else
      {
         GXv_int25[33] = (byte)(1) ;
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
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object26[0] = scmdbuf ;
      GXv_Object26[1] = GXv_int25 ;
      return GXv_Object26 ;
   }

   protected Object[] conditional_H01YN4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV83Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel ,
                                          String AV82Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod ,
                                          int AV84Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod ,
                                          int AV85Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to ,
                                          java.math.BigDecimal AV86Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan ,
                                          java.math.BigDecimal AV87Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to ,
                                          java.math.BigDecimal AV88Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan ,
                                          java.math.BigDecimal AV89Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to ,
                                          java.math.BigDecimal AV90Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil ,
                                          java.math.BigDecimal AV91Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to ,
                                          java.math.BigDecimal AV92Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet ,
                                          java.math.BigDecimal AV93Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to ,
                                          String AV95Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel ,
                                          String AV94Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc ,
                                          byte AV96Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest ,
                                          byte AV97Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to ,
                                          String AV99Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel ,
                                          String AV98Produccion_consultadeproduccion_almacentejidods_17_tfalbrent ,
                                          String AV101Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel ,
                                          String AV100Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote ,
                                          String AV103Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel ,
                                          String AV102Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar ,
                                          String AV105Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel ,
                                          String AV104Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod ,
                                          java.math.BigDecimal AV106Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu ,
                                          java.math.BigDecimal AV107Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to ,
                                          java.math.BigDecimal AV108Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara ,
                                          java.math.BigDecimal AV109Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to ,
                                          String AV111Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel ,
                                          String AV110Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej ,
                                          String A200BarPieCod ,
                                          int A44AlbRecCod ,
                                          java.math.BigDecimal A170BarKilLan ,
                                          java.math.BigDecimal A183BarMetLan ,
                                          java.math.BigDecimal A203BarPieKil ,
                                          java.math.BigDecimal A205BarPieMet ,
                                          String A2186BarPieLoc ,
                                          byte A201BarPieEst ,
                                          String A46AlbREnt ,
                                          String A6463AlbRLote ,
                                          String A6464AlbRTelar ,
                                          String A4602AlbRMdlCod ,
                                          java.math.BigDecimal A6465AlbRLu ,
                                          java.math.BigDecimal A6470AlbRTara ,
                                          String A8035AlbMaqTej ,
                                          String AV56Emprcod ,
                                          int AV57BarCod ,
                                          byte AV58BarCodReo ,
                                          String AV59BarCodPar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int27 = new byte[34];
      Object[] GXv_Object28 = new Object[2];
      scmdbuf = "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T2.AlbMaqTej, T2.AlbRTara, T2.AlbRLu, T2.AlbRMdlCod, T2.AlbRTelar, T2.AlbRLote, T2.AlbREnt, T1.BarPieEst," ;
      scmdbuf += " T1.BarPieLoc, T1.BarPieMet, T1.BarPieKil, T1.BarMetLan, T1.BarKilLan, T1.AlbRecCod, T1.BarPieCod FROM (TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.AlbRecCod = T1.AlbRecCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV83Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel)==0) && ( ! (GXutil.strcmp("", AV82Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarPieCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieCod = ?)");
      }
      else
      {
         GXv_int27[5] = (byte)(1) ;
      }
      if ( ! (0==AV84Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int27[6] = (byte)(1) ;
      }
      if ( ! (0==AV85Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int27[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan)==0) )
      {
         addWhere(sWhereString, "(T1.BarKilLan >= ?)");
      }
      else
      {
         GXv_int27[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarKilLan <= ?)");
      }
      else
      {
         GXv_int27[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan)==0) )
      {
         addWhere(sWhereString, "(T1.BarMetLan >= ?)");
      }
      else
      {
         GXv_int27[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarMetLan <= ?)");
      }
      else
      {
         GXv_int27[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil >= ?)");
      }
      else
      {
         GXv_int27[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil <= ?)");
      }
      else
      {
         GXv_int27[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet >= ?)");
      }
      else
      {
         GXv_int27[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet <= ?)");
      }
      else
      {
         GXv_int27[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel)==0) && ( ! (GXutil.strcmp("", AV94Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarPieLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieLoc = ?)");
      }
      else
      {
         GXv_int27[17] = (byte)(1) ;
      }
      if ( ! (0==AV96Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest) )
      {
         addWhere(sWhereString, "(T1.BarPieEst >= ?)");
      }
      else
      {
         GXv_int27[18] = (byte)(1) ;
      }
      if ( ! (0==AV97Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to) )
      {
         addWhere(sWhereString, "(T1.BarPieEst <= ?)");
      }
      else
      {
         GXv_int27[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel)==0) && ( ! (GXutil.strcmp("", AV98Produccion_consultadeproduccion_almacentejidods_17_tfalbrent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbREnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbREnt = ?)");
      }
      else
      {
         GXv_int27[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel)==0) && ( ! (GXutil.strcmp("", AV100Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLote = ?)");
      }
      else
      {
         GXv_int27[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel)==0) && ( ! (GXutil.strcmp("", AV102Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRTelar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRTelar = ?)");
      }
      else
      {
         GXv_int27[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel)==0) && ( ! (GXutil.strcmp("", AV104Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRMdlCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRMdlCod = ?)");
      }
      else
      {
         GXv_int27[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLu >= ?)");
      }
      else
      {
         GXv_int27[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV107Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLu <= ?)");
      }
      else
      {
         GXv_int27[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV108Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRTara >= ?)");
      }
      else
      {
         GXv_int27[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV109Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRTara <= ?)");
      }
      else
      {
         GXv_int27[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel)==0) && ( ! (GXutil.strcmp("", AV110Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbMaqTej) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbMaqTej = ?)");
      }
      else
      {
         GXv_int27[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
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
                  return conditional_H01YN2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).byteValue() , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , ((Boolean) dynConstraints[46]).booleanValue() , (String)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).byteValue() , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).byteValue() , (String)dynConstraints[54] );
            case 1 :
                  return conditional_H01YN3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).byteValue() , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , ((Boolean) dynConstraints[46]).booleanValue() , (String)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).byteValue() , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).byteValue() , (String)dynConstraints[54] );
            case 2 :
                  return conditional_H01YN4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).byteValue() , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).byteValue() , (String)dynConstraints[48] , (String)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , ((Number) dynConstraints[51]).byteValue() , (String)dynConstraints[52] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01YN2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01YN3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01YN4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((String[]) buf[10])[0] = rslt.getString(11, 8);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((int[]) buf[18])[0] = rslt.getInt(18);
               ((String[]) buf[19])[0] = rslt.getString(19, 9);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((String[]) buf[10])[0] = rslt.getString(11, 8);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((int[]) buf[18])[0] = rslt.getInt(18);
               ((String[]) buf[19])[0] = rslt.getString(19, 9);
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
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 9);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 9);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 10);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 10);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[57]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[58]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 20);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 20);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 13);
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
                  stmt.setString(sIdx, (String)parms[71], 12);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 12);
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
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 9);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 9);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 10);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 10);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[52]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 20);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 20);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 13);
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
                  stmt.setString(sIdx, (String)parms[66], 12);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 12);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 9);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 9);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 10);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 10);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[52]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 20);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 20);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 13);
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
                  stmt.setString(sIdx, (String)parms[66], 12);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 12);
               }
               return;
      }
   }

}

