package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class confirmacionpreciodocumento_producciones_impl extends GXWebComponent
{
   public confirmacionpreciodocumento_producciones_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public confirmacionpreciodocumento_producciones_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( confirmacionpreciodocumento_producciones_impl.class ));
   }

   public confirmacionpreciodocumento_producciones_impl( int remoteHandle ,
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
      chkavSeleccionar = UIFactory.getCheckbox(this);
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
               AV48Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48Emprcod", AV48Emprcod);
               AV49AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49AlbProCod), 10, 0));
               AV54GuiRemCli = (int)(GXutil.lval( httpContext.GetPar( "GuiRemCli"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54GuiRemCli), 6, 0));
               AV55GuiRemCln = httpContext.GetPar( "GuiRemCln") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55GuiRemCln", AV55GuiRemCln);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV48Emprcod,Long.valueOf(AV49AlbProCod),Integer.valueOf(AV54GuiRemCli),AV55GuiRemCln});
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
      nRC_GXsfl_50 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_50"))) ;
      nGXsfl_50_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_50_idx"))) ;
      sGXsfl_50_idx = httpContext.GetPar( "sGXsfl_50_idx") ;
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
      AV48Emprcod = httpContext.GetPar( "Emprcod") ;
      AV49AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
      AV26TFBarNHdr = httpContext.GetPar( "TFBarNHdr") ;
      AV27TFBarNHdr_Sel = httpContext.GetPar( "TFBarNHdr_Sel") ;
      AV28TFPedidoCliente = httpContext.GetPar( "TFPedidoCliente") ;
      AV29TFPedidoCliente_Sel = httpContext.GetPar( "TFPedidoCliente_Sel") ;
      AV30TFBarSer = httpContext.GetPar( "TFBarSer") ;
      AV31TFBarSer_Sel = httpContext.GetPar( "TFBarSer_Sel") ;
      AV32TFBarSerDsc = httpContext.GetPar( "TFBarSerDsc") ;
      AV33TFBarSerDsc_Sel = httpContext.GetPar( "TFBarSerDsc_Sel") ;
      AV34TFBarColNom = httpContext.GetPar( "TFBarColNom") ;
      AV35TFBarColNom_Sel = httpContext.GetPar( "TFBarColNom_Sel") ;
      AV36TFBarColNum = (int)(GXutil.lval( httpContext.GetPar( "TFBarColNum"))) ;
      AV37TFBarColNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarColNum_To"))) ;
      AV38TFBarTipCol = (byte)(GXutil.lval( httpContext.GetPar( "TFBarTipCol"))) ;
      AV39TFBarTipCol_To = (byte)(GXutil.lval( httpContext.GetPar( "TFBarTipCol_To"))) ;
      AV40TFBarAlbKgmE = CommonUtil.decimalVal( httpContext.GetPar( "TFBarAlbKgmE"), ".") ;
      AV41TFBarAlbKgmE_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarAlbKgmE_To"), ".") ;
      AV42TFBarAlbMtrE = CommonUtil.decimalVal( httpContext.GetPar( "TFBarAlbMtrE"), ".") ;
      AV43TFBarAlbMtrE_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarAlbMtrE_To"), ".") ;
      AV56TFAlbProEsp = (byte)(GXutil.lval( httpContext.GetPar( "TFAlbProEsp"))) ;
      AV57TFAlbProEsp_To = (byte)(GXutil.lval( httpContext.GetPar( "TFAlbProEsp_To"))) ;
      AV69Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV54GuiRemCli = (int)(GXutil.lval( httpContext.GetPar( "GuiRemCli"))) ;
      AV55GuiRemCln = httpContext.GetPar( "GuiRemCln") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV51Col_Barcod);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV52Col_Barcodreo);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV53Col_Barcodpar);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV60Col_BarPreKgm);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV59Col_BarPremtr);
      AV65usurcod = httpContext.GetPar( "usurcod") ;
      AV64station = httpContext.GetPar( "station") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV48Emprcod, AV49AlbProCod, AV26TFBarNHdr, AV27TFBarNHdr_Sel, AV28TFPedidoCliente, AV29TFPedidoCliente_Sel, AV30TFBarSer, AV31TFBarSer_Sel, AV32TFBarSerDsc, AV33TFBarSerDsc_Sel, AV34TFBarColNom, AV35TFBarColNom_Sel, AV36TFBarColNum, AV37TFBarColNum_To, AV38TFBarTipCol, AV39TFBarTipCol_To, AV40TFBarAlbKgmE, AV41TFBarAlbKgmE_To, AV42TFBarAlbMtrE, AV43TFBarAlbMtrE_To, AV56TFAlbProEsp, AV57TFAlbProEsp_To, AV69Pgmname, AV12OrderedBy, AV13OrderedDsc, AV54GuiRemCli, AV55GuiRemCln, AV51Col_Barcod, AV52Col_Barcodreo, AV53Col_Barcodpar, AV60Col_BarPreKgm, AV59Col_BarPremtr, AV65usurcod, AV64station, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa2012( ) ;
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
         httpContext.writeValue( httpContext.getMessage( " Guias (Detail HDRs)", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.facturacion.confirmacionpreciodocumento_producciones", new String[] {GXutil.URLEncode(GXutil.rtrim(AV48Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV49AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(AV54GuiRemCli,6,0)),GXutil.URLEncode(GXutil.rtrim(AV55GuiRemCln))}, new String[] {"Emprcod","AlbProCod","GuiRemCli","GuiRemCln"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vUSURCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV65usurcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV64station, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ConfirmacionPrecioDocumento_Producciones");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV69Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\confirmacionpreciodocumento_producciones:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_50", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_50, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV46GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV47GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV44DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV44DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV48Emprcod", GXutil.rtrim( wcpOAV48Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV49AlbProCod", GXutil.ltrim( localUtil.ntoc( wcpOAV49AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV54GuiRemCli", GXutil.ltrim( localUtil.ntoc( wcpOAV54GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV55GuiRemCln", GXutil.rtrim( wcpOAV55GuiRemCln));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNHDR", GXutil.rtrim( AV26TFBarNHdr));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNHDR_SEL", GXutil.rtrim( AV27TFBarNHdr_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPEDIDOCLIENTE", GXutil.rtrim( AV28TFPedidoCliente));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPEDIDOCLIENTE_SEL", GXutil.rtrim( AV29TFPedidoCliente_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSER", GXutil.rtrim( AV30TFBarSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSER_SEL", GXutil.rtrim( AV31TFBarSer_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSERDSC", GXutil.rtrim( AV32TFBarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSERDSC_SEL", GXutil.rtrim( AV33TFBarSerDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNOM", GXutil.rtrim( AV34TFBarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNOM_SEL", GXutil.rtrim( AV35TFBarColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNUM", GXutil.ltrim( localUtil.ntoc( AV36TFBarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV37TFBarColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARTIPCOL", GXutil.ltrim( localUtil.ntoc( AV38TFBarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARTIPCOL_TO", GXutil.ltrim( localUtil.ntoc( AV39TFBarTipCol_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARALBKGME", GXutil.ltrim( localUtil.ntoc( AV40TFBarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARALBKGME_TO", GXutil.ltrim( localUtil.ntoc( AV41TFBarAlbKgmE_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARALBMTRE", GXutil.ltrim( localUtil.ntoc( AV42TFBarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARALBMTRE_TO", GXutil.ltrim( localUtil.ntoc( AV43TFBarAlbMtrE_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBPROESP", GXutil.ltrim( localUtil.ntoc( AV56TFAlbProEsp, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBPROESP_TO", GXutil.ltrim( localUtil.ntoc( AV57TFAlbProEsp_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV48Emprcod));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOL_BARCOD", AV51Col_Barcod);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOL_BARCOD", AV51Col_Barcod);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOL_BARCODREO", AV52Col_Barcodreo);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOL_BARCODREO", AV52Col_Barcodreo);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOL_BARCODPAR", AV53Col_Barcodpar);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOL_BARCODPAR", AV53Col_Barcodpar);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOL_BARPREKGM", AV60Col_BarPreKgm);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOL_BARPREKGM", AV60Col_BarPreKgm);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOL_BARPREMTR", AV59Col_BarPremtr);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOL_BARPREMTR", AV59Col_BarPremtr);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUSURCOD", GXutil.rtrim( AV65usurcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vUSURCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV65usurcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSTATION", GXutil.rtrim( AV64station));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV64station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vI", GXutil.ltrim( localUtil.ntoc( AV58i, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARENCCLI", GXutil.rtrim( A4812BarEncCli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARDISNUM", GXutil.rtrim( A143BarDisNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filterisrange", GXutil.rtrim( Ddo_grid_Filterisrange));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includedatalist", GXutil.rtrim( Ddo_grid_Includedatalist));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalisttype", GXutil.rtrim( Ddo_grid_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNUSERACTION1_Title", GXutil.rtrim( Dvelop_confirmpanel_btnuseraction1_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNUSERACTION1_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_btnuseraction1_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNUSERACTION1_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnuseraction1_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNUSERACTION1_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnuseraction1_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNUSERACTION1_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnuseraction1_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNUSERACTION1_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_btnuseraction1_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNUSERACTION1_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_btnuseraction1_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNUSERACTION2_Title", GXutil.rtrim( Dvelop_confirmpanel_btnuseraction2_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNUSERACTION2_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_btnuseraction2_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNUSERACTION2_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnuseraction2_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNUSERACTION2_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnuseraction2_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNUSERACTION2_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnuseraction2_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNUSERACTION2_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_btnuseraction2_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNUSERACTION2_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_btnuseraction2_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNUSERACTION1_Result", GXutil.rtrim( Dvelop_confirmpanel_btnuseraction1_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNUSERACTION2_Result", GXutil.rtrim( Dvelop_confirmpanel_btnuseraction2_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNUSERACTION1_Result", GXutil.rtrim( Dvelop_confirmpanel_btnuseraction1_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNUSERACTION2_Result", GXutil.rtrim( Dvelop_confirmpanel_btnuseraction2_Result));
   }

   public void renderHtmlCloseForm2012( )
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
      return "Facturacion.ConfirmacionPrecioDocumento_Producciones" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Guias (Detail HDRs)", "") ;
   }

   public void wb2010( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.facturacion.confirmacionpreciodocumento_producciones");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
            httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbprocod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbprocod_Internalname, httpContext.getMessage( "Nº Documento", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbprocod_Internalname, GXutil.ltrim( localUtil.ntoc( AV49AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbprocod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV49AlbProCod), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV49AlbProCod), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbprocod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbprocod_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\ConfirmacionPrecioDocumento_Producciones.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavGuiremcli_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavGuiremcli_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavGuiremcli_Internalname, GXutil.ltrim( localUtil.ntoc( AV54GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavGuiremcli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV54GuiRemCli), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV54GuiRemCli), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavGuiremcli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavGuiremcli_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\ConfirmacionPrecioDocumento_Producciones.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-7", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavGuiremcln_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavGuiremcln_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavGuiremcln_Internalname, GXutil.rtrim( AV55GuiRemCln), GXutil.rtrim( localUtil.format( AV55GuiRemCln, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavGuiremcln_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavGuiremcln_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\ConfirmacionPrecioDocumento_Producciones.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_31_2012( true) ;
      }
      else
      {
         wb_table1_31_2012( false) ;
      }
      return  ;
   }

   public void wb_table1_31_2012e( boolean wbgen )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnuseraction1_Internalname, "gx.evt.setGridEvt("+GXutil.str( 50, 2, 0)+","+"null"+");", httpContext.getMessage( "Confirmar Precios", ""), bttBtnuseraction1_Jsonclick, 7, httpContext.getMessage( "Confirmar Precios", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e112011_client"+"'", TempTags, "", 2, "HLP_Facturacion\\ConfirmacionPrecioDocumento_Producciones.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnuseraction2_Internalname, "gx.evt.setGridEvt("+GXutil.str( 50, 2, 0)+","+"null"+");", httpContext.getMessage( "Dejar como Pdte. Confirmar (E)", ""), bttBtnuseraction2_Jsonclick, 7, httpContext.getMessage( "Dejar como Pdte. Confirmar (E)", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e122011_client"+"'", TempTags, "", 2, "HLP_Facturacion\\ConfirmacionPrecioDocumento_Producciones.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         startgridcontrol50( ) ;
      }
      if ( wbEnd == 50 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_50 = (int)(nGXsfl_50_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV46GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV47GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV69Pgmname), GXutil.rtrim( localUtil.format( AV69Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\ConfirmacionPrecioDocumento_Producciones.htm");
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
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("FilterIsRange", Ddo_grid_Filterisrange);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV44DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         wb_table2_83_2012( true) ;
      }
      else
      {
         wb_table2_83_2012( false) ;
      }
      return  ;
   }

   public void wb_table2_83_2012e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table3_88_2012( true) ;
      }
      else
      {
         wb_table3_88_2012( false) ;
      }
      return  ;
   }

   public void wb_table3_88_2012e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 50 )
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

   public void start2012( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( " Guias (Detail HDRs)", ""), (short)(0)) ;
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
            strup2010( ) ;
         }
      }
   }

   public void ws2012( )
   {
      start2012( ) ;
      evt2012( ) ;
   }

   public void evt2012( )
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
                              strup2010( ) ;
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
                              strup2010( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e132012 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2010( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e142012 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2010( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e152012 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_BTNUSERACTION1.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2010( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e162012 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_BTNUSERACTION2.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2010( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e172012 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2010( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = chkavSeleccionar.getInternalname() ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 30), "VBARPREKGM.CONTROLVALUECHANGED") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 30), "VBARPREMTR.CONTROLVALUECHANGED") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2010( ) ;
                           }
                           nGXsfl_50_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_502( ) ;
                           AV50Seleccionar = GXutil.strtobool( httpContext.cgiGet( chkavSeleccionar.getInternalname())) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionar.getInternalname(), AV50Seleccionar);
                           A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
                           A13878PedidoClie = httpContext.cgiGet( edtPedidoClie_Internalname) ;
                           A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
                           A1652BarSerDsc = httpContext.cgiGet( edtBarSerDsc_Internalname) ;
                           A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
                           A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A218BarTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1261BarAlbKgmE = localUtil.ctond( httpContext.cgiGet( edtBarAlbKgmE_Internalname)) ;
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavBarprekgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavBarprekgm_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARPREKGM");
                              GX_FocusControl = edtavBarprekgm_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV16BarPreKgm = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarprekgm_Internalname, GXutil.ltrimstr( AV16BarPreKgm, 13, 5));
                           }
                           else
                           {
                              AV16BarPreKgm = localUtil.ctond( httpContext.cgiGet( edtavBarprekgm_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarprekgm_Internalname, GXutil.ltrimstr( AV16BarPreKgm, 13, 5));
                           }
                           A1263BarAlbMtrE = localUtil.ctond( httpContext.cgiGet( edtBarAlbMtrE_Internalname)) ;
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavBarpremtr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavBarpremtr_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARPREMTR");
                              GX_FocusControl = edtavBarpremtr_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV17BarPreMtr = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarpremtr_Internalname, GXutil.ltrimstr( AV17BarPreMtr, 13, 5));
                           }
                           else
                           {
                              AV17BarPreMtr = localUtil.ctond( httpContext.cgiGet( edtavBarpremtr_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarpremtr_Internalname, GXutil.ltrimstr( AV17BarPreMtr, 13, 5));
                           }
                           A32AlbProEsp = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbProEsp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1262BarPreKgm = localUtil.ctond( httpContext.cgiGet( edtBarPreKgm_Internalname)) ;
                           A1264BarPreMtr = localUtil.ctond( httpContext.cgiGet( edtBarPreMtr_Internalname)) ;
                           A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
                           A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
                                       GX_FocusControl = chkavSeleccionar.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e182012 ();
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
                                       GX_FocusControl = chkavSeleccionar.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e192012 ();
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
                                       GX_FocusControl = chkavSeleccionar.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e202012 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "VBARPREKGM.CONTROLVALUECHANGED") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = chkavSeleccionar.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e212012 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "VBARPREMTR.CONTROLVALUECHANGED") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = chkavSeleccionar.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e222012 ();
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
                                    strup2010( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = chkavSeleccionar.getInternalname() ;
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

   public void we2012( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm2012( ) ;
         }
      }
   }

   public void pa2012( )
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
      subsflControlProps_502( ) ;
      while ( nGXsfl_50_idx <= nRC_GXsfl_50 )
      {
         sendrow_502( ) ;
         nGXsfl_50_idx = ((subGrid_Islastpage==1)&&(nGXsfl_50_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_502( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV48Emprcod ,
                                 long AV49AlbProCod ,
                                 String AV26TFBarNHdr ,
                                 String AV27TFBarNHdr_Sel ,
                                 String AV28TFPedidoCliente ,
                                 String AV29TFPedidoCliente_Sel ,
                                 String AV30TFBarSer ,
                                 String AV31TFBarSer_Sel ,
                                 String AV32TFBarSerDsc ,
                                 String AV33TFBarSerDsc_Sel ,
                                 String AV34TFBarColNom ,
                                 String AV35TFBarColNom_Sel ,
                                 int AV36TFBarColNum ,
                                 int AV37TFBarColNum_To ,
                                 byte AV38TFBarTipCol ,
                                 byte AV39TFBarTipCol_To ,
                                 java.math.BigDecimal AV40TFBarAlbKgmE ,
                                 java.math.BigDecimal AV41TFBarAlbKgmE_To ,
                                 java.math.BigDecimal AV42TFBarAlbMtrE ,
                                 java.math.BigDecimal AV43TFBarAlbMtrE_To ,
                                 byte AV56TFAlbProEsp ,
                                 byte AV57TFAlbProEsp_To ,
                                 String AV69Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 int AV54GuiRemCli ,
                                 String AV55GuiRemCln ,
                                 GXSimpleCollection<Integer> AV51Col_Barcod ,
                                 GXSimpleCollection<Byte> AV52Col_Barcodreo ,
                                 GXSimpleCollection<String> AV53Col_Barcodpar ,
                                 GXSimpleCollection<java.math.BigDecimal> AV60Col_BarPreKgm ,
                                 GXSimpleCollection<java.math.BigDecimal> AV59Col_BarPremtr ,
                                 String AV65usurcod ,
                                 String AV64station ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e192012 ();
      GRID_nCurrentRecord = 0 ;
      rf2012( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ConfirmacionPrecioDocumento_Producciones");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV69Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\confirmacionpreciodocumento_producciones:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARCOD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARCODPAR", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A130BarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARCODREO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARPREKGM", getSecureSignedToken( sPrefix, localUtil.format( A1262BarPreKgm, "ZZZZZZ9.999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARPREKGM", GXutil.ltrim( localUtil.ntoc( A1262BarPreKgm, (byte)(13), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARPREMTR", getSecureSignedToken( sPrefix, localUtil.format( A1264BarPreMtr, "ZZZZZZ9.999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARPREMTR", GXutil.ltrim( localUtil.ntoc( A1264BarPreMtr, (byte)(13), (byte)(5), ".", "")));
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
      rf2012( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV69Pgmname = "Facturacion.ConfirmacionPrecioDocumento_Producciones" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69Pgmname", AV69Pgmname);
      Gx_err = (short)(0) ;
      edtavAlbprocod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlbprocod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbprocod_Enabled), 5, 0), true);
      edtavGuiremcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavGuiremcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGuiremcli_Enabled), 5, 0), true);
      edtavGuiremcln_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavGuiremcln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGuiremcln_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV70Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr = AV26TFBarNHdr ;
      AV71Facturacion_confirmacionpreciodocumento_produccionesds_2_tfbarnhdr_sel = AV27TFBarNHdr_Sel ;
      AV72Facturacion_confirmacionpreciodocumento_produccionesds_3_tfpedidocliente = AV28TFPedidoCliente ;
      AV73Facturacion_confirmacionpreciodocumento_produccionesds_4_tfpedidocliente_sel = AV29TFPedidoCliente_Sel ;
      AV74Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser = AV30TFBarSer ;
      AV75Facturacion_confirmacionpreciodocumento_produccionesds_6_tfbarser_sel = AV31TFBarSer_Sel ;
      AV76Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc = AV32TFBarSerDsc ;
      AV77Facturacion_confirmacionpreciodocumento_produccionesds_8_tfbarserdsc_sel = AV33TFBarSerDsc_Sel ;
      AV78Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom = AV34TFBarColNom ;
      AV79Facturacion_confirmacionpreciodocumento_produccionesds_10_tfbarcolnom_sel = AV35TFBarColNom_Sel ;
      AV80Facturacion_confirmacionpreciodocumento_produccionesds_11_tfbarcolnum = AV36TFBarColNum ;
      AV81Facturacion_confirmacionpreciodocumento_produccionesds_12_tfbarcolnum_to = AV37TFBarColNum_To ;
      AV82Facturacion_confirmacionpreciodocumento_produccionesds_13_tfbartipcol = AV38TFBarTipCol ;
      AV83Facturacion_confirmacionpreciodocumento_produccionesds_14_tfbartipcol_to = AV39TFBarTipCol_To ;
      AV84Facturacion_confirmacionpreciodocumento_produccionesds_15_tfbaralbkgme = AV40TFBarAlbKgmE ;
      AV85Facturacion_confirmacionpreciodocumento_produccionesds_16_tfbaralbkgme_to = AV41TFBarAlbKgmE_To ;
      AV86Facturacion_confirmacionpreciodocumento_produccionesds_17_tfbaralbmtre = AV42TFBarAlbMtrE ;
      AV87Facturacion_confirmacionpreciodocumento_produccionesds_18_tfbaralbmtre_to = AV43TFBarAlbMtrE_To ;
      AV88Facturacion_confirmacionpreciodocumento_produccionesds_19_tfalbproesp = AV56TFAlbProEsp ;
      AV89Facturacion_confirmacionpreciodocumento_produccionesds_20_tfalbproesp_to = AV57TFAlbProEsp_To ;
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV71Facturacion_confirmacionpreciodocumento_produccionesds_2_tfbarnhdr_sel ,
                                           AV70Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr ,
                                           AV75Facturacion_confirmacionpreciodocumento_produccionesds_6_tfbarser_sel ,
                                           AV74Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser ,
                                           AV77Facturacion_confirmacionpreciodocumento_produccionesds_8_tfbarserdsc_sel ,
                                           AV76Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc ,
                                           AV79Facturacion_confirmacionpreciodocumento_produccionesds_10_tfbarcolnom_sel ,
                                           AV78Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom ,
                                           Integer.valueOf(AV80Facturacion_confirmacionpreciodocumento_produccionesds_11_tfbarcolnum) ,
                                           Integer.valueOf(AV81Facturacion_confirmacionpreciodocumento_produccionesds_12_tfbarcolnum_to) ,
                                           Byte.valueOf(AV82Facturacion_confirmacionpreciodocumento_produccionesds_13_tfbartipcol) ,
                                           Byte.valueOf(AV83Facturacion_confirmacionpreciodocumento_produccionesds_14_tfbartipcol_to) ,
                                           AV84Facturacion_confirmacionpreciodocumento_produccionesds_15_tfbaralbkgme ,
                                           AV85Facturacion_confirmacionpreciodocumento_produccionesds_16_tfbaralbkgme_to ,
                                           AV86Facturacion_confirmacionpreciodocumento_produccionesds_17_tfbaralbmtre ,
                                           AV87Facturacion_confirmacionpreciodocumento_produccionesds_18_tfbaralbmtre_to ,
                                           Byte.valueOf(AV88Facturacion_confirmacionpreciodocumento_produccionesds_19_tfalbproesp) ,
                                           Byte.valueOf(AV89Facturacion_confirmacionpreciodocumento_produccionesds_20_tfalbproesp_to) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           Byte.valueOf(A218BarTipCol) ,
                                           A1261BarAlbKgmE ,
                                           A1263BarAlbMtrE ,
                                           Byte.valueOf(A32AlbProEsp) ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV73Facturacion_confirmacionpreciodocumento_produccionesds_4_tfpedidocliente_sel ,
                                           AV72Facturacion_confirmacionpreciodocumento_produccionesds_3_tfpedidocliente ,
                                           A13878PedidoClie ,
                                           AV48Emprcod ,
                                           Long.valueOf(AV49AlbProCod) ,
                                           A396EmprCod ,
                                           Long.valueOf(A30AlbProCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.LONG
                                           }
      });
      lV70Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV70Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr), 11, "%") ;
      lV74Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser = GXutil.padr( GXutil.rtrim( AV74Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser), 16, "%") ;
      lV76Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV76Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc), 26, "%") ;
      lV78Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV78Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom), 13, "%") ;
      /* Using cursor H02012 */
      pr_default.execute(0, new Object[] {AV48Emprcod, Long.valueOf(AV49AlbProCod), lV70Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr, AV71Facturacion_confirmacionpreciodocumento_produccionesds_2_tfbarnhdr_sel, lV74Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser, AV75Facturacion_confirmacionpreciodocumento_produccionesds_6_tfbarser_sel, lV76Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc, AV77Facturacion_confirmacionpreciodocumento_produccionesds_8_tfbarserdsc_sel, lV78Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom, AV79Facturacion_confirmacionpreciodocumento_produccionesds_10_tfbarcolnom_sel, Integer.valueOf(AV80Facturacion_confirmacionpreciodocumento_produccionesds_11_tfbarcolnum), Integer.valueOf(AV81Facturacion_confirmacionpreciodocumento_produccionesds_12_tfbarcolnum_to), Byte.valueOf(AV82Facturacion_confirmacionpreciodocumento_produccionesds_13_tfbartipcol), Byte.valueOf(AV83Facturacion_confirmacionpreciodocumento_produccionesds_14_tfbartipcol_to), AV84Facturacion_confirmacionpreciodocumento_produccionesds_15_tfbaralbkgme, AV85Facturacion_confirmacionpreciodocumento_produccionesds_16_tfbaralbkgme_to, AV86Facturacion_confirmacionpreciodocumento_produccionesds_17_tfbaralbmtre, AV87Facturacion_confirmacionpreciodocumento_produccionesds_18_tfbaralbmtre_to, Byte.valueOf(AV88Facturacion_confirmacionpreciodocumento_produccionesds_19_tfalbproesp), Byte.valueOf(AV89Facturacion_confirmacionpreciodocumento_produccionesds_20_tfalbproesp_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A30AlbProCod = H02012_A30AlbProCod[0] ;
         A1264BarPreMtr = H02012_A1264BarPreMtr[0] ;
         A1262BarPreKgm = H02012_A1262BarPreKgm[0] ;
         A32AlbProEsp = H02012_A32AlbProEsp[0] ;
         A1263BarAlbMtrE = H02012_A1263BarAlbMtrE[0] ;
         A1261BarAlbKgmE = H02012_A1261BarAlbKgmE[0] ;
         A218BarTipCol = H02012_A218BarTipCol[0] ;
         A136BarColNum = H02012_A136BarColNum[0] ;
         A135BarColNom = H02012_A135BarColNom[0] ;
         A1652BarSerDsc = H02012_A1652BarSerDsc[0] ;
         A212BarSer = H02012_A212BarSer[0] ;
         A130BarCodPar = H02012_A130BarCodPar[0] ;
         A132BarCodReo = H02012_A132BarCodReo[0] ;
         A129BarCod = H02012_A129BarCod[0] ;
         A143BarDisNum = H02012_A143BarDisNum[0] ;
         A4812BarEncCli = H02012_A4812BarEncCli[0] ;
         A396EmprCod = H02012_A396EmprCod[0] ;
         A218BarTipCol = H02012_A218BarTipCol[0] ;
         A136BarColNum = H02012_A136BarColNum[0] ;
         A135BarColNom = H02012_A135BarColNom[0] ;
         A1652BarSerDsc = H02012_A1652BarSerDsc[0] ;
         A212BarSer = H02012_A212BarSer[0] ;
         A143BarDisNum = H02012_A143BarDisNum[0] ;
         A4812BarEncCli = H02012_A4812BarEncCli[0] ;
         GXt_char1 = A13878PedidoClie ;
         GXv_char2[0] = A396EmprCod ;
         GXv_char3[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char5[0] = GXt_char1 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_char4, GXv_char5) ;
         confirmacionpreciodocumento_producciones_impl.this.A396EmprCod = GXv_char2[0] ;
         confirmacionpreciodocumento_producciones_impl.this.A4812BarEncCli = GXv_char3[0] ;
         confirmacionpreciodocumento_producciones_impl.this.A143BarDisNum = GXv_char4[0] ;
         confirmacionpreciodocumento_producciones_impl.this.GXt_char1 = GXv_char5[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4812BarEncCli", A4812BarEncCli);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A143BarDisNum", A143BarDisNum);
         A13878PedidoClie = GXt_char1 ;
         if ( ! ( (GXutil.strcmp("", AV73Facturacion_confirmacionpreciodocumento_produccionesds_4_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV72Facturacion_confirmacionpreciodocumento_produccionesds_3_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV72Facturacion_confirmacionpreciodocumento_produccionesds_3_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV73Facturacion_confirmacionpreciodocumento_produccionesds_4_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV73Facturacion_confirmacionpreciodocumento_produccionesds_4_tfpedidocliente_sel) == 0 ) ) )
            {
               A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
               GRID_nRecordCount = (long)(GRID_nRecordCount+1) ;
            }
         }
         pr_default.readNext(0);
      }
      GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      pr_default.close(0);
      return (int)(GRID_nRecordCount) ;
   }

   public void rf2012( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(50) ;
      /* Execute user event: Refresh */
      e192012 ();
      nGXsfl_50_idx = 1 ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_502( ) ;
      bGXsfl_50_Refreshing = true ;
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
         subsflControlProps_502( ) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              AV71Facturacion_confirmacionpreciodocumento_produccionesds_2_tfbarnhdr_sel ,
                                              AV70Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr ,
                                              AV75Facturacion_confirmacionpreciodocumento_produccionesds_6_tfbarser_sel ,
                                              AV74Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser ,
                                              AV77Facturacion_confirmacionpreciodocumento_produccionesds_8_tfbarserdsc_sel ,
                                              AV76Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc ,
                                              AV79Facturacion_confirmacionpreciodocumento_produccionesds_10_tfbarcolnom_sel ,
                                              AV78Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom ,
                                              Integer.valueOf(AV80Facturacion_confirmacionpreciodocumento_produccionesds_11_tfbarcolnum) ,
                                              Integer.valueOf(AV81Facturacion_confirmacionpreciodocumento_produccionesds_12_tfbarcolnum_to) ,
                                              Byte.valueOf(AV82Facturacion_confirmacionpreciodocumento_produccionesds_13_tfbartipcol) ,
                                              Byte.valueOf(AV83Facturacion_confirmacionpreciodocumento_produccionesds_14_tfbartipcol_to) ,
                                              AV84Facturacion_confirmacionpreciodocumento_produccionesds_15_tfbaralbkgme ,
                                              AV85Facturacion_confirmacionpreciodocumento_produccionesds_16_tfbaralbkgme_to ,
                                              AV86Facturacion_confirmacionpreciodocumento_produccionesds_17_tfbaralbmtre ,
                                              AV87Facturacion_confirmacionpreciodocumento_produccionesds_18_tfbaralbmtre_to ,
                                              Byte.valueOf(AV88Facturacion_confirmacionpreciodocumento_produccionesds_19_tfalbproesp) ,
                                              Byte.valueOf(AV89Facturacion_confirmacionpreciodocumento_produccionesds_20_tfalbproesp_to) ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar ,
                                              A212BarSer ,
                                              A1652BarSerDsc ,
                                              A135BarColNom ,
                                              Integer.valueOf(A136BarColNum) ,
                                              Byte.valueOf(A218BarTipCol) ,
                                              A1261BarAlbKgmE ,
                                              A1263BarAlbMtrE ,
                                              Byte.valueOf(A32AlbProEsp) ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV73Facturacion_confirmacionpreciodocumento_produccionesds_4_tfpedidocliente_sel ,
                                              AV72Facturacion_confirmacionpreciodocumento_produccionesds_3_tfpedidocliente ,
                                              A13878PedidoClie ,
                                              AV48Emprcod ,
                                              Long.valueOf(AV49AlbProCod) ,
                                              A396EmprCod ,
                                              Long.valueOf(A30AlbProCod) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.SHORT,
                                              TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.LONG
                                              }
         });
         lV70Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV70Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr), 11, "%") ;
         lV74Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser = GXutil.padr( GXutil.rtrim( AV74Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser), 16, "%") ;
         lV76Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV76Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc), 26, "%") ;
         lV78Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV78Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom), 13, "%") ;
         /* Using cursor H02013 */
         pr_default.execute(1, new Object[] {AV48Emprcod, Long.valueOf(AV49AlbProCod), lV70Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr, AV71Facturacion_confirmacionpreciodocumento_produccionesds_2_tfbarnhdr_sel, lV74Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser, AV75Facturacion_confirmacionpreciodocumento_produccionesds_6_tfbarser_sel, lV76Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc, AV77Facturacion_confirmacionpreciodocumento_produccionesds_8_tfbarserdsc_sel, lV78Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom, AV79Facturacion_confirmacionpreciodocumento_produccionesds_10_tfbarcolnom_sel, Integer.valueOf(AV80Facturacion_confirmacionpreciodocumento_produccionesds_11_tfbarcolnum), Integer.valueOf(AV81Facturacion_confirmacionpreciodocumento_produccionesds_12_tfbarcolnum_to), Byte.valueOf(AV82Facturacion_confirmacionpreciodocumento_produccionesds_13_tfbartipcol), Byte.valueOf(AV83Facturacion_confirmacionpreciodocumento_produccionesds_14_tfbartipcol_to), AV84Facturacion_confirmacionpreciodocumento_produccionesds_15_tfbaralbkgme, AV85Facturacion_confirmacionpreciodocumento_produccionesds_16_tfbaralbkgme_to, AV86Facturacion_confirmacionpreciodocumento_produccionesds_17_tfbaralbmtre, AV87Facturacion_confirmacionpreciodocumento_produccionesds_18_tfbaralbmtre_to, Byte.valueOf(AV88Facturacion_confirmacionpreciodocumento_produccionesds_19_tfalbproesp), Byte.valueOf(AV89Facturacion_confirmacionpreciodocumento_produccionesds_20_tfalbproesp_to)});
         nGXsfl_50_idx = 1 ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_502( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A30AlbProCod = H02013_A30AlbProCod[0] ;
            A1264BarPreMtr = H02013_A1264BarPreMtr[0] ;
            A1262BarPreKgm = H02013_A1262BarPreKgm[0] ;
            A32AlbProEsp = H02013_A32AlbProEsp[0] ;
            A1263BarAlbMtrE = H02013_A1263BarAlbMtrE[0] ;
            A1261BarAlbKgmE = H02013_A1261BarAlbKgmE[0] ;
            A218BarTipCol = H02013_A218BarTipCol[0] ;
            A136BarColNum = H02013_A136BarColNum[0] ;
            A135BarColNom = H02013_A135BarColNom[0] ;
            A1652BarSerDsc = H02013_A1652BarSerDsc[0] ;
            A212BarSer = H02013_A212BarSer[0] ;
            A130BarCodPar = H02013_A130BarCodPar[0] ;
            A132BarCodReo = H02013_A132BarCodReo[0] ;
            A129BarCod = H02013_A129BarCod[0] ;
            A143BarDisNum = H02013_A143BarDisNum[0] ;
            A4812BarEncCli = H02013_A4812BarEncCli[0] ;
            A396EmprCod = H02013_A396EmprCod[0] ;
            A218BarTipCol = H02013_A218BarTipCol[0] ;
            A136BarColNum = H02013_A136BarColNum[0] ;
            A135BarColNom = H02013_A135BarColNom[0] ;
            A1652BarSerDsc = H02013_A1652BarSerDsc[0] ;
            A212BarSer = H02013_A212BarSer[0] ;
            A143BarDisNum = H02013_A143BarDisNum[0] ;
            A4812BarEncCli = H02013_A4812BarEncCli[0] ;
            GXt_char1 = A13878PedidoClie ;
            GXv_char5[0] = A396EmprCod ;
            GXv_char4[0] = A4812BarEncCli ;
            GXv_char3[0] = A143BarDisNum ;
            GXv_char2[0] = GXt_char1 ;
            new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_char3, GXv_char2) ;
            confirmacionpreciodocumento_producciones_impl.this.A396EmprCod = GXv_char5[0] ;
            confirmacionpreciodocumento_producciones_impl.this.A4812BarEncCli = GXv_char4[0] ;
            confirmacionpreciodocumento_producciones_impl.this.A143BarDisNum = GXv_char3[0] ;
            confirmacionpreciodocumento_producciones_impl.this.GXt_char1 = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4812BarEncCli", A4812BarEncCli);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A143BarDisNum", A143BarDisNum);
            A13878PedidoClie = GXt_char1 ;
            if ( ! ( (GXutil.strcmp("", AV73Facturacion_confirmacionpreciodocumento_produccionesds_4_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV72Facturacion_confirmacionpreciodocumento_produccionesds_3_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV72Facturacion_confirmacionpreciodocumento_produccionesds_3_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV73Facturacion_confirmacionpreciodocumento_produccionesds_4_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV73Facturacion_confirmacionpreciodocumento_produccionesds_4_tfpedidocliente_sel) == 0 ) ) )
               {
                  A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
                  e202012 ();
               }
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(50) ;
         wb2010( ) ;
      }
      bGXsfl_50_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2012( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUSURCOD", GXutil.rtrim( AV65usurcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vUSURCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV65usurcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSTATION", GXutil.rtrim( AV64station));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV64station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARCOD"+"_"+sGXsfl_50_idx, getSecureSignedToken( sPrefix+sGXsfl_50_idx, localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARCODPAR"+"_"+sGXsfl_50_idx, getSecureSignedToken( sPrefix+sGXsfl_50_idx, GXutil.rtrim( localUtil.format( A130BarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARCODREO"+"_"+sGXsfl_50_idx, getSecureSignedToken( sPrefix+sGXsfl_50_idx, localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARPREKGM"+"_"+sGXsfl_50_idx, getSecureSignedToken( sPrefix+sGXsfl_50_idx, localUtil.format( A1262BarPreKgm, "ZZZZZZ9.999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARPREMTR"+"_"+sGXsfl_50_idx, getSecureSignedToken( sPrefix+sGXsfl_50_idx, localUtil.format( A1264BarPreMtr, "ZZZZZZ9.999")));
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
      AV70Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr = AV26TFBarNHdr ;
      AV71Facturacion_confirmacionpreciodocumento_produccionesds_2_tfbarnhdr_sel = AV27TFBarNHdr_Sel ;
      AV72Facturacion_confirmacionpreciodocumento_produccionesds_3_tfpedidocliente = AV28TFPedidoCliente ;
      AV73Facturacion_confirmacionpreciodocumento_produccionesds_4_tfpedidocliente_sel = AV29TFPedidoCliente_Sel ;
      AV74Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser = AV30TFBarSer ;
      AV75Facturacion_confirmacionpreciodocumento_produccionesds_6_tfbarser_sel = AV31TFBarSer_Sel ;
      AV76Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc = AV32TFBarSerDsc ;
      AV77Facturacion_confirmacionpreciodocumento_produccionesds_8_tfbarserdsc_sel = AV33TFBarSerDsc_Sel ;
      AV78Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom = AV34TFBarColNom ;
      AV79Facturacion_confirmacionpreciodocumento_produccionesds_10_tfbarcolnom_sel = AV35TFBarColNom_Sel ;
      AV80Facturacion_confirmacionpreciodocumento_produccionesds_11_tfbarcolnum = AV36TFBarColNum ;
      AV81Facturacion_confirmacionpreciodocumento_produccionesds_12_tfbarcolnum_to = AV37TFBarColNum_To ;
      AV82Facturacion_confirmacionpreciodocumento_produccionesds_13_tfbartipcol = AV38TFBarTipCol ;
      AV83Facturacion_confirmacionpreciodocumento_produccionesds_14_tfbartipcol_to = AV39TFBarTipCol_To ;
      AV84Facturacion_confirmacionpreciodocumento_produccionesds_15_tfbaralbkgme = AV40TFBarAlbKgmE ;
      AV85Facturacion_confirmacionpreciodocumento_produccionesds_16_tfbaralbkgme_to = AV41TFBarAlbKgmE_To ;
      AV86Facturacion_confirmacionpreciodocumento_produccionesds_17_tfbaralbmtre = AV42TFBarAlbMtrE ;
      AV87Facturacion_confirmacionpreciodocumento_produccionesds_18_tfbaralbmtre_to = AV43TFBarAlbMtrE_To ;
      AV88Facturacion_confirmacionpreciodocumento_produccionesds_19_tfalbproesp = AV56TFAlbProEsp ;
      AV89Facturacion_confirmacionpreciodocumento_produccionesds_20_tfalbproesp_to = AV57TFAlbProEsp_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV48Emprcod, AV49AlbProCod, AV26TFBarNHdr, AV27TFBarNHdr_Sel, AV28TFPedidoCliente, AV29TFPedidoCliente_Sel, AV30TFBarSer, AV31TFBarSer_Sel, AV32TFBarSerDsc, AV33TFBarSerDsc_Sel, AV34TFBarColNom, AV35TFBarColNom_Sel, AV36TFBarColNum, AV37TFBarColNum_To, AV38TFBarTipCol, AV39TFBarTipCol_To, AV40TFBarAlbKgmE, AV41TFBarAlbKgmE_To, AV42TFBarAlbMtrE, AV43TFBarAlbMtrE_To, AV56TFAlbProEsp, AV57TFAlbProEsp_To, AV69Pgmname, AV12OrderedBy, AV13OrderedDsc, AV54GuiRemCli, AV55GuiRemCln, AV51Col_Barcod, AV52Col_Barcodreo, AV53Col_Barcodpar, AV60Col_BarPreKgm, AV59Col_BarPremtr, AV65usurcod, AV64station, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV70Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr = AV26TFBarNHdr ;
      AV71Facturacion_confirmacionpreciodocumento_produccionesds_2_tfbarnhdr_sel = AV27TFBarNHdr_Sel ;
      AV72Facturacion_confirmacionpreciodocumento_produccionesds_3_tfpedidocliente = AV28TFPedidoCliente ;
      AV73Facturacion_confirmacionpreciodocumento_produccionesds_4_tfpedidocliente_sel = AV29TFPedidoCliente_Sel ;
      AV74Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser = AV30TFBarSer ;
      AV75Facturacion_confirmacionpreciodocumento_produccionesds_6_tfbarser_sel = AV31TFBarSer_Sel ;
      AV76Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc = AV32TFBarSerDsc ;
      AV77Facturacion_confirmacionpreciodocumento_produccionesds_8_tfbarserdsc_sel = AV33TFBarSerDsc_Sel ;
      AV78Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom = AV34TFBarColNom ;
      AV79Facturacion_confirmacionpreciodocumento_produccionesds_10_tfbarcolnom_sel = AV35TFBarColNom_Sel ;
      AV80Facturacion_confirmacionpreciodocumento_produccionesds_11_tfbarcolnum = AV36TFBarColNum ;
      AV81Facturacion_confirmacionpreciodocumento_produccionesds_12_tfbarcolnum_to = AV37TFBarColNum_To ;
      AV82Facturacion_confirmacionpreciodocumento_produccionesds_13_tfbartipcol = AV38TFBarTipCol ;
      AV83Facturacion_confirmacionpreciodocumento_produccionesds_14_tfbartipcol_to = AV39TFBarTipCol_To ;
      AV84Facturacion_confirmacionpreciodocumento_produccionesds_15_tfbaralbkgme = AV40TFBarAlbKgmE ;
      AV85Facturacion_confirmacionpreciodocumento_produccionesds_16_tfbaralbkgme_to = AV41TFBarAlbKgmE_To ;
      AV86Facturacion_confirmacionpreciodocumento_produccionesds_17_tfbaralbmtre = AV42TFBarAlbMtrE ;
      AV87Facturacion_confirmacionpreciodocumento_produccionesds_18_tfbaralbmtre_to = AV43TFBarAlbMtrE_To ;
      AV88Facturacion_confirmacionpreciodocumento_produccionesds_19_tfalbproesp = AV56TFAlbProEsp ;
      AV89Facturacion_confirmacionpreciodocumento_produccionesds_20_tfalbproesp_to = AV57TFAlbProEsp_To ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV48Emprcod, AV49AlbProCod, AV26TFBarNHdr, AV27TFBarNHdr_Sel, AV28TFPedidoCliente, AV29TFPedidoCliente_Sel, AV30TFBarSer, AV31TFBarSer_Sel, AV32TFBarSerDsc, AV33TFBarSerDsc_Sel, AV34TFBarColNom, AV35TFBarColNom_Sel, AV36TFBarColNum, AV37TFBarColNum_To, AV38TFBarTipCol, AV39TFBarTipCol_To, AV40TFBarAlbKgmE, AV41TFBarAlbKgmE_To, AV42TFBarAlbMtrE, AV43TFBarAlbMtrE_To, AV56TFAlbProEsp, AV57TFAlbProEsp_To, AV69Pgmname, AV12OrderedBy, AV13OrderedDsc, AV54GuiRemCli, AV55GuiRemCln, AV51Col_Barcod, AV52Col_Barcodreo, AV53Col_Barcodpar, AV60Col_BarPreKgm, AV59Col_BarPremtr, AV65usurcod, AV64station, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV70Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr = AV26TFBarNHdr ;
      AV71Facturacion_confirmacionpreciodocumento_produccionesds_2_tfbarnhdr_sel = AV27TFBarNHdr_Sel ;
      AV72Facturacion_confirmacionpreciodocumento_produccionesds_3_tfpedidocliente = AV28TFPedidoCliente ;
      AV73Facturacion_confirmacionpreciodocumento_produccionesds_4_tfpedidocliente_sel = AV29TFPedidoCliente_Sel ;
      AV74Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser = AV30TFBarSer ;
      AV75Facturacion_confirmacionpreciodocumento_produccionesds_6_tfbarser_sel = AV31TFBarSer_Sel ;
      AV76Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc = AV32TFBarSerDsc ;
      AV77Facturacion_confirmacionpreciodocumento_produccionesds_8_tfbarserdsc_sel = AV33TFBarSerDsc_Sel ;
      AV78Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom = AV34TFBarColNom ;
      AV79Facturacion_confirmacionpreciodocumento_produccionesds_10_tfbarcolnom_sel = AV35TFBarColNom_Sel ;
      AV80Facturacion_confirmacionpreciodocumento_produccionesds_11_tfbarcolnum = AV36TFBarColNum ;
      AV81Facturacion_confirmacionpreciodocumento_produccionesds_12_tfbarcolnum_to = AV37TFBarColNum_To ;
      AV82Facturacion_confirmacionpreciodocumento_produccionesds_13_tfbartipcol = AV38TFBarTipCol ;
      AV83Facturacion_confirmacionpreciodocumento_produccionesds_14_tfbartipcol_to = AV39TFBarTipCol_To ;
      AV84Facturacion_confirmacionpreciodocumento_produccionesds_15_tfbaralbkgme = AV40TFBarAlbKgmE ;
      AV85Facturacion_confirmacionpreciodocumento_produccionesds_16_tfbaralbkgme_to = AV41TFBarAlbKgmE_To ;
      AV86Facturacion_confirmacionpreciodocumento_produccionesds_17_tfbaralbmtre = AV42TFBarAlbMtrE ;
      AV87Facturacion_confirmacionpreciodocumento_produccionesds_18_tfbaralbmtre_to = AV43TFBarAlbMtrE_To ;
      AV88Facturacion_confirmacionpreciodocumento_produccionesds_19_tfalbproesp = AV56TFAlbProEsp ;
      AV89Facturacion_confirmacionpreciodocumento_produccionesds_20_tfalbproesp_to = AV57TFAlbProEsp_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV48Emprcod, AV49AlbProCod, AV26TFBarNHdr, AV27TFBarNHdr_Sel, AV28TFPedidoCliente, AV29TFPedidoCliente_Sel, AV30TFBarSer, AV31TFBarSer_Sel, AV32TFBarSerDsc, AV33TFBarSerDsc_Sel, AV34TFBarColNom, AV35TFBarColNom_Sel, AV36TFBarColNum, AV37TFBarColNum_To, AV38TFBarTipCol, AV39TFBarTipCol_To, AV40TFBarAlbKgmE, AV41TFBarAlbKgmE_To, AV42TFBarAlbMtrE, AV43TFBarAlbMtrE_To, AV56TFAlbProEsp, AV57TFAlbProEsp_To, AV69Pgmname, AV12OrderedBy, AV13OrderedDsc, AV54GuiRemCli, AV55GuiRemCln, AV51Col_Barcod, AV52Col_Barcodreo, AV53Col_Barcodpar, AV60Col_BarPreKgm, AV59Col_BarPremtr, AV65usurcod, AV64station, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV70Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr = AV26TFBarNHdr ;
      AV71Facturacion_confirmacionpreciodocumento_produccionesds_2_tfbarnhdr_sel = AV27TFBarNHdr_Sel ;
      AV72Facturacion_confirmacionpreciodocumento_produccionesds_3_tfpedidocliente = AV28TFPedidoCliente ;
      AV73Facturacion_confirmacionpreciodocumento_produccionesds_4_tfpedidocliente_sel = AV29TFPedidoCliente_Sel ;
      AV74Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser = AV30TFBarSer ;
      AV75Facturacion_confirmacionpreciodocumento_produccionesds_6_tfbarser_sel = AV31TFBarSer_Sel ;
      AV76Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc = AV32TFBarSerDsc ;
      AV77Facturacion_confirmacionpreciodocumento_produccionesds_8_tfbarserdsc_sel = AV33TFBarSerDsc_Sel ;
      AV78Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom = AV34TFBarColNom ;
      AV79Facturacion_confirmacionpreciodocumento_produccionesds_10_tfbarcolnom_sel = AV35TFBarColNom_Sel ;
      AV80Facturacion_confirmacionpreciodocumento_produccionesds_11_tfbarcolnum = AV36TFBarColNum ;
      AV81Facturacion_confirmacionpreciodocumento_produccionesds_12_tfbarcolnum_to = AV37TFBarColNum_To ;
      AV82Facturacion_confirmacionpreciodocumento_produccionesds_13_tfbartipcol = AV38TFBarTipCol ;
      AV83Facturacion_confirmacionpreciodocumento_produccionesds_14_tfbartipcol_to = AV39TFBarTipCol_To ;
      AV84Facturacion_confirmacionpreciodocumento_produccionesds_15_tfbaralbkgme = AV40TFBarAlbKgmE ;
      AV85Facturacion_confirmacionpreciodocumento_produccionesds_16_tfbaralbkgme_to = AV41TFBarAlbKgmE_To ;
      AV86Facturacion_confirmacionpreciodocumento_produccionesds_17_tfbaralbmtre = AV42TFBarAlbMtrE ;
      AV87Facturacion_confirmacionpreciodocumento_produccionesds_18_tfbaralbmtre_to = AV43TFBarAlbMtrE_To ;
      AV88Facturacion_confirmacionpreciodocumento_produccionesds_19_tfalbproesp = AV56TFAlbProEsp ;
      AV89Facturacion_confirmacionpreciodocumento_produccionesds_20_tfalbproesp_to = AV57TFAlbProEsp_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV48Emprcod, AV49AlbProCod, AV26TFBarNHdr, AV27TFBarNHdr_Sel, AV28TFPedidoCliente, AV29TFPedidoCliente_Sel, AV30TFBarSer, AV31TFBarSer_Sel, AV32TFBarSerDsc, AV33TFBarSerDsc_Sel, AV34TFBarColNom, AV35TFBarColNom_Sel, AV36TFBarColNum, AV37TFBarColNum_To, AV38TFBarTipCol, AV39TFBarTipCol_To, AV40TFBarAlbKgmE, AV41TFBarAlbKgmE_To, AV42TFBarAlbMtrE, AV43TFBarAlbMtrE_To, AV56TFAlbProEsp, AV57TFAlbProEsp_To, AV69Pgmname, AV12OrderedBy, AV13OrderedDsc, AV54GuiRemCli, AV55GuiRemCln, AV51Col_Barcod, AV52Col_Barcodreo, AV53Col_Barcodpar, AV60Col_BarPreKgm, AV59Col_BarPremtr, AV65usurcod, AV64station, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV70Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr = AV26TFBarNHdr ;
      AV71Facturacion_confirmacionpreciodocumento_produccionesds_2_tfbarnhdr_sel = AV27TFBarNHdr_Sel ;
      AV72Facturacion_confirmacionpreciodocumento_produccionesds_3_tfpedidocliente = AV28TFPedidoCliente ;
      AV73Facturacion_confirmacionpreciodocumento_produccionesds_4_tfpedidocliente_sel = AV29TFPedidoCliente_Sel ;
      AV74Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser = AV30TFBarSer ;
      AV75Facturacion_confirmacionpreciodocumento_produccionesds_6_tfbarser_sel = AV31TFBarSer_Sel ;
      AV76Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc = AV32TFBarSerDsc ;
      AV77Facturacion_confirmacionpreciodocumento_produccionesds_8_tfbarserdsc_sel = AV33TFBarSerDsc_Sel ;
      AV78Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom = AV34TFBarColNom ;
      AV79Facturacion_confirmacionpreciodocumento_produccionesds_10_tfbarcolnom_sel = AV35TFBarColNom_Sel ;
      AV80Facturacion_confirmacionpreciodocumento_produccionesds_11_tfbarcolnum = AV36TFBarColNum ;
      AV81Facturacion_confirmacionpreciodocumento_produccionesds_12_tfbarcolnum_to = AV37TFBarColNum_To ;
      AV82Facturacion_confirmacionpreciodocumento_produccionesds_13_tfbartipcol = AV38TFBarTipCol ;
      AV83Facturacion_confirmacionpreciodocumento_produccionesds_14_tfbartipcol_to = AV39TFBarTipCol_To ;
      AV84Facturacion_confirmacionpreciodocumento_produccionesds_15_tfbaralbkgme = AV40TFBarAlbKgmE ;
      AV85Facturacion_confirmacionpreciodocumento_produccionesds_16_tfbaralbkgme_to = AV41TFBarAlbKgmE_To ;
      AV86Facturacion_confirmacionpreciodocumento_produccionesds_17_tfbaralbmtre = AV42TFBarAlbMtrE ;
      AV87Facturacion_confirmacionpreciodocumento_produccionesds_18_tfbaralbmtre_to = AV43TFBarAlbMtrE_To ;
      AV88Facturacion_confirmacionpreciodocumento_produccionesds_19_tfalbproesp = AV56TFAlbProEsp ;
      AV89Facturacion_confirmacionpreciodocumento_produccionesds_20_tfalbproesp_to = AV57TFAlbProEsp_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV48Emprcod, AV49AlbProCod, AV26TFBarNHdr, AV27TFBarNHdr_Sel, AV28TFPedidoCliente, AV29TFPedidoCliente_Sel, AV30TFBarSer, AV31TFBarSer_Sel, AV32TFBarSerDsc, AV33TFBarSerDsc_Sel, AV34TFBarColNom, AV35TFBarColNom_Sel, AV36TFBarColNum, AV37TFBarColNum_To, AV38TFBarTipCol, AV39TFBarTipCol_To, AV40TFBarAlbKgmE, AV41TFBarAlbKgmE_To, AV42TFBarAlbMtrE, AV43TFBarAlbMtrE_To, AV56TFAlbProEsp, AV57TFAlbProEsp_To, AV69Pgmname, AV12OrderedBy, AV13OrderedDsc, AV54GuiRemCli, AV55GuiRemCln, AV51Col_Barcod, AV52Col_Barcodreo, AV53Col_Barcodpar, AV60Col_BarPreKgm, AV59Col_BarPremtr, AV65usurcod, AV64station, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV69Pgmname = "Facturacion.ConfirmacionPrecioDocumento_Producciones" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69Pgmname", AV69Pgmname);
      Gx_err = (short)(0) ;
      edtavAlbprocod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlbprocod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbprocod_Enabled), 5, 0), true);
      edtavGuiremcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavGuiremcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGuiremcli_Enabled), 5, 0), true);
      edtavGuiremcln_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavGuiremcln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGuiremcln_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2010( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e182012 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV44DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOL_BARCODPAR"), AV53Col_Barcodpar);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOL_BARCODREO"), AV52Col_Barcodreo);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOL_BARCOD"), AV51Col_Barcod);
         /* Read saved values. */
         nRC_GXsfl_50 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_50"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV46GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV47GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV48Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV48Emprcod") ;
         wcpOAV49AlbProCod = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV49AlbProCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV54GuiRemCli = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV54GuiRemCli"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV55GuiRemCln = httpContext.cgiGet( sPrefix+"wcpOAV55GuiRemCln") ;
         AV58i = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
         Ddo_grid_Sortedstatus = httpContext.cgiGet( sPrefix+"DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( sPrefix+"DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( sPrefix+"DDO_GRID_Filtertype") ;
         Ddo_grid_Filterisrange = httpContext.cgiGet( sPrefix+"DDO_GRID_Filterisrange") ;
         Ddo_grid_Includedatalist = httpContext.cgiGet( sPrefix+"DDO_GRID_Includedatalist") ;
         Ddo_grid_Datalisttype = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalisttype") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalistproc") ;
         Dvelop_confirmpanel_btnuseraction1_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNUSERACTION1_Title") ;
         Dvelop_confirmpanel_btnuseraction1_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNUSERACTION1_Confirmationtext") ;
         Dvelop_confirmpanel_btnuseraction1_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNUSERACTION1_Yesbuttoncaption") ;
         Dvelop_confirmpanel_btnuseraction1_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNUSERACTION1_Nobuttoncaption") ;
         Dvelop_confirmpanel_btnuseraction1_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNUSERACTION1_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_btnuseraction1_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNUSERACTION1_Yesbuttonposition") ;
         Dvelop_confirmpanel_btnuseraction1_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNUSERACTION1_Confirmtype") ;
         Dvelop_confirmpanel_btnuseraction2_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNUSERACTION2_Title") ;
         Dvelop_confirmpanel_btnuseraction2_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNUSERACTION2_Confirmationtext") ;
         Dvelop_confirmpanel_btnuseraction2_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNUSERACTION2_Yesbuttoncaption") ;
         Dvelop_confirmpanel_btnuseraction2_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNUSERACTION2_Nobuttoncaption") ;
         Dvelop_confirmpanel_btnuseraction2_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNUSERACTION2_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_btnuseraction2_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNUSERACTION2_Yesbuttonposition") ;
         Dvelop_confirmpanel_btnuseraction2_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNUSERACTION2_Confirmtype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedcolumn") ;
         Dvelop_confirmpanel_btnuseraction1_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNUSERACTION1_Result") ;
         Dvelop_confirmpanel_btnuseraction2_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNUSERACTION2_Result") ;
         /* Read variables values. */
         AV69Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69Pgmname", AV69Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ConfirmacionPrecioDocumento_Producciones");
         AV69Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69Pgmname", AV69Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV69Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("facturacion\\confirmacionpreciodocumento_producciones:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e182012 ();
      if (returnInSub) return;
   }

   public void e182012( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV64station ;
      GXv_char5[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char5) ;
      confirmacionpreciodocumento_producciones_impl.this.GXt_char1 = GXv_char5[0] ;
      AV64station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64station", AV64station);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV64station, ""))));
      GXv_char5[0] = AV48Emprcod ;
      GXv_char4[0] = AV66EmprNom ;
      GXv_char3[0] = AV65usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV64station, GXv_char5, GXv_char4, GXv_char3) ;
      confirmacionpreciodocumento_producciones_impl.this.AV48Emprcod = GXv_char5[0] ;
      confirmacionpreciodocumento_producciones_impl.this.AV66EmprNom = GXv_char4[0] ;
      confirmacionpreciodocumento_producciones_impl.this.AV65usurcod = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48Emprcod", AV48Emprcod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65usurcod", AV65usurcod);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vUSURCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV65usurcod, "@!"))));
      GXt_char1 = AV64station ;
      GXv_char5[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char5) ;
      confirmacionpreciodocumento_producciones_impl.this.GXt_char1 = GXv_char5[0] ;
      AV64station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64station", AV64station);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV64station, ""))));
      GXv_char5[0] = AV48Emprcod ;
      GXv_char4[0] = AV66EmprNom ;
      GXv_char3[0] = AV65usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV64station, GXv_char5, GXv_char4, GXv_char3) ;
      confirmacionpreciodocumento_producciones_impl.this.AV48Emprcod = GXv_char5[0] ;
      confirmacionpreciodocumento_producciones_impl.this.AV66EmprNom = GXv_char4[0] ;
      confirmacionpreciodocumento_producciones_impl.this.AV65usurcod = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48Emprcod", AV48Emprcod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65usurcod", AV65usurcod);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vUSURCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV65usurcod, "@!"))));
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = AV44DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] ;
      AV44DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e192012( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext8[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext8) ;
      AV6WWPContext = GXv_SdtWWPContext8[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      AV46GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46GridCurrentPage), 10, 0));
      AV47GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47GridPageCount), 10, 0));
      AV70Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr = AV26TFBarNHdr ;
      AV71Facturacion_confirmacionpreciodocumento_produccionesds_2_tfbarnhdr_sel = AV27TFBarNHdr_Sel ;
      AV72Facturacion_confirmacionpreciodocumento_produccionesds_3_tfpedidocliente = AV28TFPedidoCliente ;
      AV73Facturacion_confirmacionpreciodocumento_produccionesds_4_tfpedidocliente_sel = AV29TFPedidoCliente_Sel ;
      AV74Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser = AV30TFBarSer ;
      AV75Facturacion_confirmacionpreciodocumento_produccionesds_6_tfbarser_sel = AV31TFBarSer_Sel ;
      AV76Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc = AV32TFBarSerDsc ;
      AV77Facturacion_confirmacionpreciodocumento_produccionesds_8_tfbarserdsc_sel = AV33TFBarSerDsc_Sel ;
      AV78Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom = AV34TFBarColNom ;
      AV79Facturacion_confirmacionpreciodocumento_produccionesds_10_tfbarcolnom_sel = AV35TFBarColNom_Sel ;
      AV80Facturacion_confirmacionpreciodocumento_produccionesds_11_tfbarcolnum = AV36TFBarColNum ;
      AV81Facturacion_confirmacionpreciodocumento_produccionesds_12_tfbarcolnum_to = AV37TFBarColNum_To ;
      AV82Facturacion_confirmacionpreciodocumento_produccionesds_13_tfbartipcol = AV38TFBarTipCol ;
      AV83Facturacion_confirmacionpreciodocumento_produccionesds_14_tfbartipcol_to = AV39TFBarTipCol_To ;
      AV84Facturacion_confirmacionpreciodocumento_produccionesds_15_tfbaralbkgme = AV40TFBarAlbKgmE ;
      AV85Facturacion_confirmacionpreciodocumento_produccionesds_16_tfbaralbkgme_to = AV41TFBarAlbKgmE_To ;
      AV86Facturacion_confirmacionpreciodocumento_produccionesds_17_tfbaralbmtre = AV42TFBarAlbMtrE ;
      AV87Facturacion_confirmacionpreciodocumento_produccionesds_18_tfbaralbmtre_to = AV43TFBarAlbMtrE_To ;
      AV88Facturacion_confirmacionpreciodocumento_produccionesds_19_tfalbproesp = AV56TFAlbProEsp ;
      AV89Facturacion_confirmacionpreciodocumento_produccionesds_20_tfalbproesp_to = AV57TFAlbProEsp_To ;
      /*  Sending Event outputs  */
   }

   public void e132012( )
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
         AV45PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV45PageToGo) ;
      }
   }

   public void e142012( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e152012( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarNHdr") == 0 )
         {
            AV26TFBarNHdr = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFBarNHdr", AV26TFBarNHdr);
            AV27TFBarNHdr_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFBarNHdr_Sel", AV27TFBarNHdr_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PedidoCliente") == 0 )
         {
            AV28TFPedidoCliente = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFPedidoCliente", AV28TFPedidoCliente);
            AV29TFPedidoCliente_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFPedidoCliente_Sel", AV29TFPedidoCliente_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSer") == 0 )
         {
            AV30TFBarSer = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFBarSer", AV30TFBarSer);
            AV31TFBarSer_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFBarSer_Sel", AV31TFBarSer_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSerDsc") == 0 )
         {
            AV32TFBarSerDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFBarSerDsc", AV32TFBarSerDsc);
            AV33TFBarSerDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFBarSerDsc_Sel", AV33TFBarSerDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarColNom") == 0 )
         {
            AV34TFBarColNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFBarColNom", AV34TFBarColNom);
            AV35TFBarColNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFBarColNom_Sel", AV35TFBarColNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarColNum") == 0 )
         {
            AV36TFBarColNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFBarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFBarColNum), 6, 0));
            AV37TFBarColNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFBarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFBarColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarTipCol") == 0 )
         {
            AV38TFBarTipCol = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFBarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TFBarTipCol), 2, 0));
            AV39TFBarTipCol_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFBarTipCol_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39TFBarTipCol_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAlbKgmE") == 0 )
         {
            AV40TFBarAlbKgmE = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFBarAlbKgmE", GXutil.ltrimstr( AV40TFBarAlbKgmE, 9, 2));
            AV41TFBarAlbKgmE_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFBarAlbKgmE_To", GXutil.ltrimstr( AV41TFBarAlbKgmE_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAlbMtrE") == 0 )
         {
            AV42TFBarAlbMtrE = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFBarAlbMtrE", GXutil.ltrimstr( AV42TFBarAlbMtrE, 9, 2));
            AV43TFBarAlbMtrE_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFBarAlbMtrE_To", GXutil.ltrimstr( AV43TFBarAlbMtrE_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProEsp") == 0 )
         {
            AV56TFAlbProEsp = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFAlbProEsp", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFAlbProEsp), 2, 0));
            AV57TFAlbProEsp_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFAlbProEsp_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TFAlbProEsp_To), 2, 0));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e202012( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         AV16BarPreKgm = A1262BarPreKgm ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarprekgm_Internalname, GXutil.ltrimstr( AV16BarPreKgm, 13, 5));
         AV17BarPreMtr = A1264BarPreMtr ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarpremtr_Internalname, GXutil.ltrimstr( AV17BarPreMtr, 13, 5));
         AV50Seleccionar = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionar.getInternalname(), AV50Seleccionar);
         AV58i = (short)(1) ;
         while ( AV58i <= AV51Col_Barcod.size() )
         {
            if ( ( ((Number) AV51Col_Barcod.elementAt(-1+AV58i)).intValue() == A129BarCod ) && ( ((Number) AV52Col_Barcodreo.elementAt(-1+AV58i)).byteValue() == A132BarCodReo ) && ( GXutil.strcmp((String)AV53Col_Barcodpar.elementAt(-1+AV58i), A130BarCodPar) == 0 ) )
            {
               AV50Seleccionar = true ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionar.getInternalname(), AV50Seleccionar);
               AV16BarPreKgm = AV60Col_BarPreKgm.elementAt(-1+AV58i) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarprekgm_Internalname, GXutil.ltrimstr( AV16BarPreKgm, 13, 5));
               AV17BarPreMtr = AV59Col_BarPremtr.elementAt(-1+AV58i) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarpremtr_Internalname, GXutil.ltrimstr( AV17BarPreMtr, 13, 5));
               if (true) break;
            }
            AV58i = (short)(AV58i+1) ;
         }
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(50) ;
         }
         sendrow_502( ) ;
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
      if ( isFullAjaxMode( ) && ! bGXsfl_50_Refreshing )
      {
         httpContext.doAjaxLoad(50, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e162012( )
   {
      /* Dvelop_confirmpanel_btnuseraction1_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_btnuseraction1_Result, "Yes") == 0 )
      {
         AV58i = (short)(1) ;
         while ( AV58i <= AV51Col_Barcod.size() )
         {
            AV61barcod = ((Number) AV51Col_Barcod.elementAt(-1+AV58i)).intValue() ;
            AV62barcodreo = ((Number) AV52Col_Barcodreo.elementAt(-1+AV58i)).byteValue() ;
            AV63barcodpar = (String)AV53Col_Barcodpar.elementAt(-1+AV58i) ;
            AV16BarPreKgm = AV60Col_BarPreKgm.elementAt(-1+AV58i) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarprekgm_Internalname, GXutil.ltrimstr( AV16BarPreKgm, 13, 5));
            AV17BarPreMtr = AV59Col_BarPremtr.elementAt(-1+AV58i) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarpremtr_Internalname, GXutil.ltrimstr( AV17BarPreMtr, 13, 5));
            new app.facturacion.confirmacionpreciodocumento_producciones_prc(remoteHandle, context).execute( AV48Emprcod, AV49AlbProCod, AV61barcod, AV62barcodreo, AV63barcodpar, AV16BarPreKgm, AV17BarPreMtr, DecimalUtil.doubleToDec(0), DecimalUtil.doubleToDec(0), DecimalUtil.doubleToDec(0), AV65usurcod, AV64station) ;
            AV58i = (short)(AV58i+1) ;
         }
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      /*  Sending Event outputs  */
   }

   public void e172012( )
   {
      /* Dvelop_confirmpanel_btnuseraction2_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_btnuseraction2_Result, "Yes") == 0 )
      {
         AV58i = (short)(1) ;
         while ( AV58i <= AV51Col_Barcod.size() )
         {
            AV61barcod = ((Number) AV51Col_Barcod.elementAt(-1+AV58i)).intValue() ;
            AV62barcodreo = ((Number) AV52Col_Barcodreo.elementAt(-1+AV58i)).byteValue() ;
            AV63barcodpar = (String)AV53Col_Barcodpar.elementAt(-1+AV58i) ;
            AV16BarPreKgm = AV60Col_BarPreKgm.elementAt(-1+AV58i) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarprekgm_Internalname, GXutil.ltrimstr( AV16BarPreKgm, 13, 5));
            AV17BarPreMtr = AV59Col_BarPremtr.elementAt(-1+AV58i) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarpremtr_Internalname, GXutil.ltrimstr( AV17BarPreMtr, 13, 5));
            new app.facturacion.confirmacionpreciodocumento_producciones_estado_2_prc(remoteHandle, context).execute( AV48Emprcod, AV49AlbProCod, AV61barcod, AV62barcodreo, AV63barcodpar, AV65usurcod, AV64station) ;
            AV58i = (short)(AV58i+1) ;
         }
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      /*  Sending Event outputs  */
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
      if ( GXutil.strcmp(AV22Session.getValue(AV69Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV69Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV69Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S132 ();
      if (returnInSub) return;
      AV90GXV1 = 1 ;
      while ( AV90GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV90GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV26TFBarNHdr = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFBarNHdr", AV26TFBarNHdr);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV27TFBarNHdr_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFBarNHdr_Sel", AV27TFBarNHdr_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE") == 0 )
         {
            AV28TFPedidoCliente = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFPedidoCliente", AV28TFPedidoCliente);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE_SEL") == 0 )
         {
            AV29TFPedidoCliente_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFPedidoCliente_Sel", AV29TFPedidoCliente_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV30TFBarSer = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFBarSer", AV30TFBarSer);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV31TFBarSer_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFBarSer_Sel", AV31TFBarSer_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV32TFBarSerDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFBarSerDsc", AV32TFBarSerDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV33TFBarSerDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFBarSerDsc_Sel", AV33TFBarSerDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV34TFBarColNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFBarColNom", AV34TFBarColNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV35TFBarColNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFBarColNom_Sel", AV35TFBarColNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV36TFBarColNum = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFBarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFBarColNum), 6, 0));
            AV37TFBarColNum_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFBarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFBarColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPCOL") == 0 )
         {
            AV38TFBarTipCol = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFBarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TFBarTipCol), 2, 0));
            AV39TFBarTipCol_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFBarTipCol_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39TFBarTipCol_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBKGME") == 0 )
         {
            AV40TFBarAlbKgmE = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFBarAlbKgmE", GXutil.ltrimstr( AV40TFBarAlbKgmE, 9, 2));
            AV41TFBarAlbKgmE_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFBarAlbKgmE_To", GXutil.ltrimstr( AV41TFBarAlbKgmE_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBMTRE") == 0 )
         {
            AV42TFBarAlbMtrE = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFBarAlbMtrE", GXutil.ltrimstr( AV42TFBarAlbMtrE, 9, 2));
            AV43TFBarAlbMtrE_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFBarAlbMtrE_To", GXutil.ltrimstr( AV43TFBarAlbMtrE_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROESP") == 0 )
         {
            AV56TFAlbProEsp = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFAlbProEsp", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFAlbProEsp), 2, 0));
            AV57TFAlbProEsp_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFAlbProEsp_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TFAlbProEsp_To), 2, 0));
         }
         AV90GXV1 = (int)(AV90GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char5[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV27TFBarNHdr_Sel)==0), AV27TFBarNHdr_Sel, GXv_char5) ;
      confirmacionpreciodocumento_producciones_impl.this.GXt_char1 = GXv_char5[0] ;
      GXt_char9 = "" ;
      GXv_char4[0] = GXt_char9 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV29TFPedidoCliente_Sel)==0), AV29TFPedidoCliente_Sel, GXv_char4) ;
      confirmacionpreciodocumento_producciones_impl.this.GXt_char9 = GXv_char4[0] ;
      GXt_char10 = "" ;
      GXv_char3[0] = GXt_char10 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV31TFBarSer_Sel)==0), AV31TFBarSer_Sel, GXv_char3) ;
      confirmacionpreciodocumento_producciones_impl.this.GXt_char10 = GXv_char3[0] ;
      GXt_char11 = "" ;
      GXv_char2[0] = GXt_char11 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV33TFBarSerDsc_Sel)==0), AV33TFBarSerDsc_Sel, GXv_char2) ;
      confirmacionpreciodocumento_producciones_impl.this.GXt_char11 = GXv_char2[0] ;
      GXt_char12 = "" ;
      GXv_char13[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV35TFBarColNom_Sel)==0), AV35TFBarColNom_Sel, GXv_char13) ;
      confirmacionpreciodocumento_producciones_impl.this.GXt_char12 = GXv_char13[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|"+GXt_char9+"|"+GXt_char10+"|"+GXt_char11+"|"+GXt_char12+"|||||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char12 = "" ;
      GXv_char13[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV26TFBarNHdr)==0), AV26TFBarNHdr, GXv_char13) ;
      confirmacionpreciodocumento_producciones_impl.this.GXt_char12 = GXv_char13[0] ;
      GXt_char11 = "" ;
      GXv_char5[0] = GXt_char11 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV28TFPedidoCliente)==0), AV28TFPedidoCliente, GXv_char5) ;
      confirmacionpreciodocumento_producciones_impl.this.GXt_char11 = GXv_char5[0] ;
      GXt_char10 = "" ;
      GXv_char4[0] = GXt_char10 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV30TFBarSer)==0), AV30TFBarSer, GXv_char4) ;
      confirmacionpreciodocumento_producciones_impl.this.GXt_char10 = GXv_char4[0] ;
      GXt_char9 = "" ;
      GXv_char3[0] = GXt_char9 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV32TFBarSerDsc)==0), AV32TFBarSerDsc, GXv_char3) ;
      confirmacionpreciodocumento_producciones_impl.this.GXt_char9 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV34TFBarColNom)==0), AV34TFBarColNom, GXv_char2) ;
      confirmacionpreciodocumento_producciones_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = GXt_char12+"|"+GXt_char11+"|"+GXt_char10+"|"+GXt_char9+"|"+GXt_char1+"|"+((0==AV36TFBarColNum) ? "" : GXutil.str( AV36TFBarColNum, 6, 0))+"|"+((0==AV38TFBarTipCol) ? "" : GXutil.str( AV38TFBarTipCol, 2, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFBarAlbKgmE)==0) ? "" : GXutil.str( AV40TFBarAlbKgmE, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFBarAlbMtrE)==0) ? "" : GXutil.str( AV42TFBarAlbMtrE, 9, 2))+"|"+((0==AV56TFAlbProEsp) ? "" : GXutil.str( AV56TFAlbProEsp, 2, 0)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|||||"+((0==AV37TFBarColNum_To) ? "" : GXutil.str( AV37TFBarColNum_To, 6, 0))+"|"+((0==AV39TFBarTipCol_To) ? "" : GXutil.str( AV39TFBarTipCol_To, 2, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFBarAlbKgmE_To)==0) ? "" : GXutil.str( AV41TFBarAlbKgmE_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFBarAlbMtrE_To)==0) ? "" : GXutil.str( AV43TFBarAlbMtrE_To, 9, 2))+"|"+((0==AV57TFAlbProEsp_To) ? "" : GXutil.str( AV57TFAlbProEsp_To, 2, 0)) ;
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
      AV10GridState.fromxml(AV22Session.getValue(AV69Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFBARNHDR", "", !(GXutil.strcmp("", AV26TFBarNHdr)==0), (short)(0), AV26TFBarNHdr, "", !(GXutil.strcmp("", AV27TFBarNHdr_Sel)==0), AV27TFBarNHdr_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFPEDIDOCLIENTE", "", !(GXutil.strcmp("", AV28TFPedidoCliente)==0), (short)(0), AV28TFPedidoCliente, "", !(GXutil.strcmp("", AV29TFPedidoCliente_Sel)==0), AV29TFPedidoCliente_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFBARSER", "", !(GXutil.strcmp("", AV30TFBarSer)==0), (short)(0), AV30TFBarSer, "", !(GXutil.strcmp("", AV31TFBarSer_Sel)==0), AV31TFBarSer_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFBARSERDSC", "", !(GXutil.strcmp("", AV32TFBarSerDsc)==0), (short)(0), AV32TFBarSerDsc, "", !(GXutil.strcmp("", AV33TFBarSerDsc_Sel)==0), AV33TFBarSerDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFBARCOLNOM", "", !(GXutil.strcmp("", AV34TFBarColNom)==0), (short)(0), AV34TFBarColNom, "", !(GXutil.strcmp("", AV35TFBarColNom_Sel)==0), AV35TFBarColNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFBARCOLNUM", "", !((0==AV36TFBarColNum)&&(0==AV37TFBarColNum_To)), (short)(0), GXutil.trim( GXutil.str( AV36TFBarColNum, 6, 0)), GXutil.trim( GXutil.str( AV37TFBarColNum_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFBARTIPCOL", "", !((0==AV38TFBarTipCol)&&(0==AV39TFBarTipCol_To)), (short)(0), GXutil.trim( GXutil.str( AV38TFBarTipCol, 2, 0)), GXutil.trim( GXutil.str( AV39TFBarTipCol_To, 2, 0))) ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFBARALBKGME", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFBarAlbKgmE)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFBarAlbKgmE_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV40TFBarAlbKgmE, 9, 2)), GXutil.trim( GXutil.str( AV41TFBarAlbKgmE_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFBARALBMTRE", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFBarAlbMtrE)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFBarAlbMtrE_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV42TFBarAlbMtrE, 9, 2)), GXutil.trim( GXutil.str( AV43TFBarAlbMtrE_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFALBPROESP", "", !((0==AV56TFAlbProEsp)&&(0==AV57TFAlbProEsp_To)), (short)(0), GXutil.trim( GXutil.str( AV56TFAlbProEsp, 2, 0)), GXutil.trim( GXutil.str( AV57TFAlbProEsp_To, 2, 0))) ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      if ( ! (GXutil.strcmp("", AV48Emprcod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV48Emprcod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV49AlbProCod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBPROCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV49AlbProCod, 10, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV54GuiRemCli) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&GUIREMCLI" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV54GuiRemCli, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV55GuiRemCln)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&GUIREMCLN" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV55GuiRemCln );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV69Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV69Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TTrn07" );
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void e212012( )
   {
      /* Barprekgm_Controlvaluechanged Routine */
      returnInSub = false ;
      if ( DecimalUtil.compareTo(AV16BarPreKgm, A1262BarPreKgm) != 0 )
      {
         AV58i = (short)(1) ;
         while ( AV58i <= AV51Col_Barcod.size() )
         {
            if ( ( ((Number) AV51Col_Barcod.elementAt(-1+AV58i)).intValue() == A129BarCod ) && ( ((Number) AV52Col_Barcodreo.elementAt(-1+AV58i)).byteValue() == A132BarCodReo ) && ( GXutil.strcmp((String)AV53Col_Barcodpar.elementAt(-1+AV58i), A130BarCodPar) == 0 ) )
            {
               if (true) break;
            }
            AV58i = (short)(AV58i+1) ;
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV60Col_BarPreKgm", AV60Col_BarPreKgm);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV59Col_BarPremtr", AV59Col_BarPremtr);
   }

   public void e222012( )
   {
      /* Barpremtr_Controlvaluechanged Routine */
      returnInSub = false ;
      if ( DecimalUtil.compareTo(AV17BarPreMtr, A1264BarPreMtr) != 0 )
      {
         AV58i = (short)(1) ;
         while ( AV58i <= AV51Col_Barcod.size() )
         {
            if ( ( ((Number) AV51Col_Barcod.elementAt(-1+AV58i)).intValue() == A129BarCod ) && ( ((Number) AV52Col_Barcodreo.elementAt(-1+AV58i)).byteValue() == A132BarCodReo ) && ( GXutil.strcmp((String)AV53Col_Barcodpar.elementAt(-1+AV58i), A130BarCodPar) == 0 ) )
            {
               if (true) break;
            }
            AV58i = (short)(AV58i+1) ;
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV60Col_BarPreKgm", AV60Col_BarPreKgm);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV59Col_BarPremtr", AV59Col_BarPremtr);
   }

   public void wb_table3_88_2012( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_btnuseraction2_Internalname, tblTabledvelop_confirmpanel_btnuseraction2_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_btnuseraction2.setProperty("Title", Dvelop_confirmpanel_btnuseraction2_Title);
         ucDvelop_confirmpanel_btnuseraction2.setProperty("ConfirmationText", Dvelop_confirmpanel_btnuseraction2_Confirmationtext);
         ucDvelop_confirmpanel_btnuseraction2.setProperty("YesButtonCaption", Dvelop_confirmpanel_btnuseraction2_Yesbuttoncaption);
         ucDvelop_confirmpanel_btnuseraction2.setProperty("NoButtonCaption", Dvelop_confirmpanel_btnuseraction2_Nobuttoncaption);
         ucDvelop_confirmpanel_btnuseraction2.setProperty("CancelButtonCaption", Dvelop_confirmpanel_btnuseraction2_Cancelbuttoncaption);
         ucDvelop_confirmpanel_btnuseraction2.setProperty("YesButtonPosition", Dvelop_confirmpanel_btnuseraction2_Yesbuttonposition);
         ucDvelop_confirmpanel_btnuseraction2.setProperty("ConfirmType", Dvelop_confirmpanel_btnuseraction2_Confirmtype);
         ucDvelop_confirmpanel_btnuseraction2.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_btnuseraction2_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_BTNUSERACTION2Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_BTNUSERACTION2Container"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_88_2012e( true) ;
      }
      else
      {
         wb_table3_88_2012e( false) ;
      }
   }

   public void wb_table2_83_2012( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_btnuseraction1_Internalname, tblTabledvelop_confirmpanel_btnuseraction1_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_btnuseraction1.setProperty("Title", Dvelop_confirmpanel_btnuseraction1_Title);
         ucDvelop_confirmpanel_btnuseraction1.setProperty("ConfirmationText", Dvelop_confirmpanel_btnuseraction1_Confirmationtext);
         ucDvelop_confirmpanel_btnuseraction1.setProperty("YesButtonCaption", Dvelop_confirmpanel_btnuseraction1_Yesbuttoncaption);
         ucDvelop_confirmpanel_btnuseraction1.setProperty("NoButtonCaption", Dvelop_confirmpanel_btnuseraction1_Nobuttoncaption);
         ucDvelop_confirmpanel_btnuseraction1.setProperty("CancelButtonCaption", Dvelop_confirmpanel_btnuseraction1_Cancelbuttoncaption);
         ucDvelop_confirmpanel_btnuseraction1.setProperty("YesButtonPosition", Dvelop_confirmpanel_btnuseraction1_Yesbuttonposition);
         ucDvelop_confirmpanel_btnuseraction1.setProperty("ConfirmType", Dvelop_confirmpanel_btnuseraction1_Confirmtype);
         ucDvelop_confirmpanel_btnuseraction1.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_btnuseraction1_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_BTNUSERACTION1Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_BTNUSERACTION1Container"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_83_2012e( true) ;
      }
      else
      {
         wb_table2_83_2012e( false) ;
      }
   }

   public void wb_table1_31_2012( boolean wbgen )
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
         wb_table1_31_2012e( true) ;
      }
      else
      {
         wb_table1_31_2012e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV48Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48Emprcod", AV48Emprcod);
      AV49AlbProCod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49AlbProCod), 10, 0));
      AV54GuiRemCli = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54GuiRemCli), 6, 0));
      AV55GuiRemCln = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55GuiRemCln", AV55GuiRemCln);
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
      pa2012( ) ;
      ws2012( ) ;
      we2012( ) ;
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
      sCtrlAV48Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV49AlbProCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV54GuiRemCli = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV55GuiRemCln = (String)getParm(obj,3,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa2012( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "facturacion\\confirmacionpreciodocumento_producciones", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa2012( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV48Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48Emprcod", AV48Emprcod);
         AV49AlbProCod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49AlbProCod), 10, 0));
         AV54GuiRemCli = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54GuiRemCli), 6, 0));
         AV55GuiRemCln = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55GuiRemCln", AV55GuiRemCln);
      }
      wcpOAV48Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV48Emprcod") ;
      wcpOAV49AlbProCod = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV49AlbProCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      wcpOAV54GuiRemCli = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV54GuiRemCli"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV55GuiRemCln = httpContext.cgiGet( sPrefix+"wcpOAV55GuiRemCln") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV48Emprcod, wcpOAV48Emprcod) != 0 ) || ( AV49AlbProCod != wcpOAV49AlbProCod ) || ( AV54GuiRemCli != wcpOAV54GuiRemCli ) || ( GXutil.strcmp(AV55GuiRemCln, wcpOAV55GuiRemCln) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV48Emprcod = AV48Emprcod ;
      wcpOAV49AlbProCod = AV49AlbProCod ;
      wcpOAV54GuiRemCli = AV54GuiRemCli ;
      wcpOAV55GuiRemCln = AV55GuiRemCln ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV48Emprcod = httpContext.cgiGet( sPrefix+"AV48Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV48Emprcod) > 0 )
      {
         AV48Emprcod = httpContext.cgiGet( sCtrlAV48Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48Emprcod", AV48Emprcod);
      }
      else
      {
         AV48Emprcod = httpContext.cgiGet( sPrefix+"AV48Emprcod_PARM") ;
      }
      sCtrlAV49AlbProCod = httpContext.cgiGet( sPrefix+"AV49AlbProCod_CTRL") ;
      if ( GXutil.len( sCtrlAV49AlbProCod) > 0 )
      {
         AV49AlbProCod = localUtil.ctol( httpContext.cgiGet( sCtrlAV49AlbProCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49AlbProCod), 10, 0));
      }
      else
      {
         AV49AlbProCod = localUtil.ctol( httpContext.cgiGet( sPrefix+"AV49AlbProCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      }
      sCtrlAV54GuiRemCli = httpContext.cgiGet( sPrefix+"AV54GuiRemCli_CTRL") ;
      if ( GXutil.len( sCtrlAV54GuiRemCli) > 0 )
      {
         AV54GuiRemCli = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV54GuiRemCli), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54GuiRemCli), 6, 0));
      }
      else
      {
         AV54GuiRemCli = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV54GuiRemCli_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV55GuiRemCln = httpContext.cgiGet( sPrefix+"AV55GuiRemCln_CTRL") ;
      if ( GXutil.len( sCtrlAV55GuiRemCln) > 0 )
      {
         AV55GuiRemCln = httpContext.cgiGet( sCtrlAV55GuiRemCln) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55GuiRemCln", AV55GuiRemCln);
      }
      else
      {
         AV55GuiRemCln = httpContext.cgiGet( sPrefix+"AV55GuiRemCln_PARM") ;
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
      pa2012( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws2012( ) ;
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
      ws2012( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV48Emprcod_PARM", GXutil.rtrim( AV48Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV48Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV48Emprcod_CTRL", GXutil.rtrim( sCtrlAV48Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV49AlbProCod_PARM", GXutil.ltrim( localUtil.ntoc( AV49AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV49AlbProCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV49AlbProCod_CTRL", GXutil.rtrim( sCtrlAV49AlbProCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV54GuiRemCli_PARM", GXutil.ltrim( localUtil.ntoc( AV54GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV54GuiRemCli)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV54GuiRemCli_CTRL", GXutil.rtrim( sCtrlAV54GuiRemCli));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV55GuiRemCln_PARM", GXutil.rtrim( AV55GuiRemCln));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV55GuiRemCln)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV55GuiRemCln_CTRL", GXutil.rtrim( sCtrlAV55GuiRemCln));
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
      we2012( ) ;
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
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026821166458", true, true);
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
      httpContext.AddJavascriptSource("facturacion/confirmacionpreciodocumento_producciones.js", "?2026821166458", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_502( )
   {
      chkavSeleccionar.setInternalname( sPrefix+"vSELECCIONAR_"+sGXsfl_50_idx );
      edtBarNHdr_Internalname = sPrefix+"BARNHDR_"+sGXsfl_50_idx ;
      edtPedidoClie_Internalname = sPrefix+"PEDIDOCLIE_"+sGXsfl_50_idx ;
      edtBarSer_Internalname = sPrefix+"BARSER_"+sGXsfl_50_idx ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC_"+sGXsfl_50_idx ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM_"+sGXsfl_50_idx ;
      edtBarColNum_Internalname = sPrefix+"BARCOLNUM_"+sGXsfl_50_idx ;
      edtBarTipCol_Internalname = sPrefix+"BARTIPCOL_"+sGXsfl_50_idx ;
      edtBarAlbKgmE_Internalname = sPrefix+"BARALBKGME_"+sGXsfl_50_idx ;
      edtavBarprekgm_Internalname = sPrefix+"vBARPREKGM_"+sGXsfl_50_idx ;
      edtBarAlbMtrE_Internalname = sPrefix+"BARALBMTRE_"+sGXsfl_50_idx ;
      edtavBarpremtr_Internalname = sPrefix+"vBARPREMTR_"+sGXsfl_50_idx ;
      edtAlbProEsp_Internalname = sPrefix+"ALBPROESP_"+sGXsfl_50_idx ;
      edtBarPreKgm_Internalname = sPrefix+"BARPREKGM_"+sGXsfl_50_idx ;
      edtBarPreMtr_Internalname = sPrefix+"BARPREMTR_"+sGXsfl_50_idx ;
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_50_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_50_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_50_idx ;
   }

   public void subsflControlProps_fel_502( )
   {
      chkavSeleccionar.setInternalname( sPrefix+"vSELECCIONAR_"+sGXsfl_50_fel_idx );
      edtBarNHdr_Internalname = sPrefix+"BARNHDR_"+sGXsfl_50_fel_idx ;
      edtPedidoClie_Internalname = sPrefix+"PEDIDOCLIE_"+sGXsfl_50_fel_idx ;
      edtBarSer_Internalname = sPrefix+"BARSER_"+sGXsfl_50_fel_idx ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC_"+sGXsfl_50_fel_idx ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM_"+sGXsfl_50_fel_idx ;
      edtBarColNum_Internalname = sPrefix+"BARCOLNUM_"+sGXsfl_50_fel_idx ;
      edtBarTipCol_Internalname = sPrefix+"BARTIPCOL_"+sGXsfl_50_fel_idx ;
      edtBarAlbKgmE_Internalname = sPrefix+"BARALBKGME_"+sGXsfl_50_fel_idx ;
      edtavBarprekgm_Internalname = sPrefix+"vBARPREKGM_"+sGXsfl_50_fel_idx ;
      edtBarAlbMtrE_Internalname = sPrefix+"BARALBMTRE_"+sGXsfl_50_fel_idx ;
      edtavBarpremtr_Internalname = sPrefix+"vBARPREMTR_"+sGXsfl_50_fel_idx ;
      edtAlbProEsp_Internalname = sPrefix+"ALBPROESP_"+sGXsfl_50_fel_idx ;
      edtBarPreKgm_Internalname = sPrefix+"BARPREKGM_"+sGXsfl_50_fel_idx ;
      edtBarPreMtr_Internalname = sPrefix+"BARPREMTR_"+sGXsfl_50_fel_idx ;
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_50_fel_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_50_fel_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_50_fel_idx ;
   }

   public void sendrow_502( )
   {
      subsflControlProps_502( ) ;
      wb2010( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_50_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_50_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_50_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavSeleccionar.getEnabled()!=0)&&(chkavSeleccionar.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 51,'"+sPrefix+"',false,'"+sGXsfl_50_idx+"',50)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "vSELECCIONAR_" + sGXsfl_50_idx ;
         chkavSeleccionar.setName( GXCCtl );
         chkavSeleccionar.setWebtags( "" );
         chkavSeleccionar.setCaption( "" );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSeleccionar.getInternalname(), "TitleCaption", chkavSeleccionar.getCaption(), !bGXsfl_50_Refreshing);
         chkavSeleccionar.setCheckedValue( "false" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSeleccionar.getInternalname(),GXutil.booltostr( AV50Seleccionar),"","",Integer.valueOf(-1),Integer.valueOf(1),"true","",StyleString,ClassString,"WWColumn","",TempTags+((chkavSeleccionar.getEnabled()!=0)&&(chkavSeleccionar.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,51);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNHdr_Internalname,GXutil.rtrim( A13696BarNHdr),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarNHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPedidoClie_Internalname,GXutil.rtrim( A13878PedidoClie),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPedidoClie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSer_Internalname,GXutil.rtrim( A212BarSer),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSerDsc_Internalname,GXutil.rtrim( A1652BarSerDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSerDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNom_Internalname,GXutil.rtrim( A135BarColNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTipCol_Internalname,GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarTipCol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbKgmE_Internalname,GXutil.ltrim( localUtil.ntoc( A1261BarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1261BarAlbKgmE, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbKgmE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarprekgm_Enabled!=0)&&(edtavBarprekgm_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 60,'"+sPrefix+"',false,'"+sGXsfl_50_idx+"',50)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarprekgm_Internalname,GXutil.ltrim( localUtil.ntoc( AV16BarPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( AV16BarPreKgm, "ZZZZZZ9.999")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+((edtavBarprekgm_Enabled!=0)&&(edtavBarprekgm_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,60);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBarprekgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbMtrE_Internalname,GXutil.ltrim( localUtil.ntoc( A1263BarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1263BarAlbMtrE, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbMtrE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarpremtr_Enabled!=0)&&(edtavBarpremtr_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 62,'"+sPrefix+"',false,'"+sGXsfl_50_idx+"',50)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarpremtr_Internalname,GXutil.ltrim( localUtil.ntoc( AV17BarPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( AV17BarPreMtr, "ZZZZZZ9.999")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+((edtavBarpremtr_Enabled!=0)&&(edtavBarpremtr_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,62);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBarpremtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProEsp_Internalname,GXutil.ltrim( localUtil.ntoc( A32AlbProEsp, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A32AlbProEsp), "99"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbProEsp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPreKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A1262BarPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1262BarPreKgm, "ZZZZZZ9.999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarPreKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPreMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A1264BarPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1264BarPreMtr, "ZZZZZZ9.999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarPreMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes2012( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_50_idx = ((subGrid_Islastpage==1)&&(nGXsfl_50_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_502( ) ;
      }
      /* End function sendrow_502 */
   }

   public void startgridcontrol50( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"50\">") ;
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
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pedido Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "TC", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos Ent.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Precio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros Ent.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Precio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "E", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Precio Kilo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Precio Metro", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Barcada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Particion Barcada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Reoperado Barcada", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.booltostr( AV50Seleccionar));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13696BarNHdr));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13878PedidoClie));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A212BarSer));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1652BarSerDsc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A135BarColNom));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1261BarAlbKgmE, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV16BarPreKgm, (byte)(13), (byte)(5), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1263BarAlbMtrE, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV17BarPreMtr, (byte)(13), (byte)(5), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A32AlbProEsp, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1262BarPreKgm, (byte)(13), (byte)(5), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1264BarPreMtr, (byte)(13), (byte)(5), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A130BarCodPar));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
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
      edtavAlbprocod_Internalname = sPrefix+"vALBPROCOD" ;
      edtavGuiremcli_Internalname = sPrefix+"vGUIREMCLI" ;
      edtavGuiremcln_Internalname = sPrefix+"vGUIREMCLN" ;
      divUnnamedtable3_Internalname = sPrefix+"UNNAMEDTABLE3" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      bttBtnuseraction1_Internalname = sPrefix+"BTNUSERACTION1" ;
      bttBtnuseraction2_Internalname = sPrefix+"BTNUSERACTION2" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      chkavSeleccionar.setInternalname( sPrefix+"vSELECCIONAR" );
      edtBarNHdr_Internalname = sPrefix+"BARNHDR" ;
      edtPedidoClie_Internalname = sPrefix+"PEDIDOCLIE" ;
      edtBarSer_Internalname = sPrefix+"BARSER" ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC" ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM" ;
      edtBarColNum_Internalname = sPrefix+"BARCOLNUM" ;
      edtBarTipCol_Internalname = sPrefix+"BARTIPCOL" ;
      edtBarAlbKgmE_Internalname = sPrefix+"BARALBKGME" ;
      edtavBarprekgm_Internalname = sPrefix+"vBARPREKGM" ;
      edtBarAlbMtrE_Internalname = sPrefix+"BARALBMTRE" ;
      edtavBarpremtr_Internalname = sPrefix+"vBARPREMTR" ;
      edtAlbProEsp_Internalname = sPrefix+"ALBPROESP" ;
      edtBarPreKgm_Internalname = sPrefix+"BARPREKGM" ;
      edtBarPreMtr_Internalname = sPrefix+"BARPREMTR" ;
      edtBarCod_Internalname = sPrefix+"BARCOD" ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR" ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      Datamonjs_Internalname = sPrefix+"DATAMONJS" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Dvelop_confirmpanel_btnuseraction1_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_BTNUSERACTION1" ;
      tblTabledvelop_confirmpanel_btnuseraction1_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_BTNUSERACTION1" ;
      Dvelop_confirmpanel_btnuseraction2_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_BTNUSERACTION2" ;
      tblTabledvelop_confirmpanel_btnuseraction2_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_BTNUSERACTION2" ;
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
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      edtBarPreMtr_Jsonclick = "" ;
      edtBarPreKgm_Jsonclick = "" ;
      edtAlbProEsp_Jsonclick = "" ;
      edtavBarpremtr_Jsonclick = "" ;
      edtavBarpremtr_Visible = -1 ;
      edtavBarpremtr_Enabled = 1 ;
      edtBarAlbMtrE_Jsonclick = "" ;
      edtavBarprekgm_Jsonclick = "" ;
      edtavBarprekgm_Visible = -1 ;
      edtavBarprekgm_Enabled = 1 ;
      edtBarAlbKgmE_Jsonclick = "" ;
      edtBarTipCol_Jsonclick = "" ;
      edtBarColNum_Jsonclick = "" ;
      edtBarColNom_Jsonclick = "" ;
      edtBarSerDsc_Jsonclick = "" ;
      edtBarSer_Jsonclick = "" ;
      edtPedidoClie_Jsonclick = "" ;
      edtBarNHdr_Jsonclick = "" ;
      chkavSeleccionar.setCaption( "" );
      chkavSeleccionar.setVisible( -1 );
      chkavSeleccionar.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavGuiremcln_Jsonclick = "" ;
      edtavGuiremcln_Enabled = 0 ;
      edtavGuiremcli_Jsonclick = "" ;
      edtavGuiremcli_Enabled = 0 ;
      edtavAlbprocod_Jsonclick = "" ;
      edtavAlbprocod_Enabled = 0 ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_btnuseraction2_Confirmtype = "1" ;
      Dvelop_confirmpanel_btnuseraction2_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_btnuseraction2_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_btnuseraction2_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_btnuseraction2_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_btnuseraction2_Confirmationtext = "¿Confirmar dejar como Pdte. Confirmar?" ;
      Dvelop_confirmpanel_btnuseraction2_Title = "" ;
      Dvelop_confirmpanel_btnuseraction1_Confirmtype = "1" ;
      Dvelop_confirmpanel_btnuseraction1_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_btnuseraction1_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_btnuseraction1_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_btnuseraction1_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_btnuseraction1_Confirmationtext = "¿Confirma los precios?" ;
      Dvelop_confirmpanel_btnuseraction1_Title = "" ;
      Ddo_grid_Datalistproc = "Facturacion.ConfirmacionPrecioDocumento_ProduccionesGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic|Dynamic|Dynamic|Dynamic|Dynamic|||||" ;
      Ddo_grid_Includedatalist = "T|T|T|T|T|||||" ;
      Ddo_grid_Filterisrange = "|||||T|T|T|T|T" ;
      Ddo_grid_Filtertype = "Character|Character|Character|Character|Character|Numeric|Numeric|Numeric|Numeric|Numeric" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "||T|T|T|T|T|T|T|T" ;
      Ddo_grid_Columnssortvalues = "||2|3|4|5|6|7|8|9" ;
      Ddo_grid_Columnids = "1:BarNHdr|2:PedidoCliente|3:BarSer|4:BarSerDsc|5:BarColNom|6:BarColNum|7:BarTipCol|8:BarAlbKgmE|10:BarAlbMtrE|12:AlbProEsp" ;
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
      GXCCtl = "vSELECCIONAR_" + sGXsfl_50_idx ;
      chkavSeleccionar.setName( GXCCtl );
      chkavSeleccionar.setWebtags( "" );
      chkavSeleccionar.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSeleccionar.getInternalname(), "TitleCaption", chkavSeleccionar.getCaption(), !bGXsfl_50_Refreshing);
      chkavSeleccionar.setCheckedValue( "false" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV51Col_Barcod',fld:'vCOL_BARCOD',pic:''},{av:'AV52Col_Barcodreo',fld:'vCOL_BARCODREO',pic:''},{av:'AV53Col_Barcodpar',fld:'vCOL_BARCODPAR',pic:''},{av:'AV60Col_BarPreKgm',fld:'vCOL_BARPREKGM',pic:''},{av:'AV59Col_BarPremtr',fld:'vCOL_BARPREMTR',pic:''},{av:'sPrefix'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV48Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV49AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV26TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV27TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV28TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV29TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV30TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV31TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV32TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV33TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV34TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV35TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV36TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV37TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV38TFBarTipCol',fld:'vTFBARTIPCOL',pic:'Z9'},{av:'AV39TFBarTipCol_To',fld:'vTFBARTIPCOL_TO',pic:'Z9'},{av:'AV40TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV41TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV42TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV43TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV56TFAlbProEsp',fld:'vTFALBPROESP',pic:'99'},{av:'AV57TFAlbProEsp_To',fld:'vTFALBPROESP_TO',pic:'99'},{av:'AV69Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV54GuiRemCli',fld:'vGUIREMCLI',pic:'ZZZZZ9'},{av:'AV55GuiRemCln',fld:'vGUIREMCLN',pic:''},{av:'AV65usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV64station',fld:'vSTATION',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV46GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV47GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e132012',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV48Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV49AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV26TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV27TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV28TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV29TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV30TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV31TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV32TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV33TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV34TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV35TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV36TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV37TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV38TFBarTipCol',fld:'vTFBARTIPCOL',pic:'Z9'},{av:'AV39TFBarTipCol_To',fld:'vTFBARTIPCOL_TO',pic:'Z9'},{av:'AV40TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV41TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV42TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV43TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV56TFAlbProEsp',fld:'vTFALBPROESP',pic:'99'},{av:'AV57TFAlbProEsp_To',fld:'vTFALBPROESP_TO',pic:'99'},{av:'AV69Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV54GuiRemCli',fld:'vGUIREMCLI',pic:'ZZZZZ9'},{av:'AV55GuiRemCln',fld:'vGUIREMCLN',pic:''},{av:'AV51Col_Barcod',fld:'vCOL_BARCOD',pic:''},{av:'AV52Col_Barcodreo',fld:'vCOL_BARCODREO',pic:''},{av:'AV53Col_Barcodpar',fld:'vCOL_BARCODPAR',pic:''},{av:'AV60Col_BarPreKgm',fld:'vCOL_BARPREKGM',pic:''},{av:'AV59Col_BarPremtr',fld:'vCOL_BARPREMTR',pic:''},{av:'AV65usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV64station',fld:'vSTATION',pic:'',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e142012',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV48Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV49AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV26TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV27TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV28TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV29TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV30TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV31TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV32TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV33TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV34TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV35TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV36TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV37TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV38TFBarTipCol',fld:'vTFBARTIPCOL',pic:'Z9'},{av:'AV39TFBarTipCol_To',fld:'vTFBARTIPCOL_TO',pic:'Z9'},{av:'AV40TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV41TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV42TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV43TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV56TFAlbProEsp',fld:'vTFALBPROESP',pic:'99'},{av:'AV57TFAlbProEsp_To',fld:'vTFALBPROESP_TO',pic:'99'},{av:'AV69Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV54GuiRemCli',fld:'vGUIREMCLI',pic:'ZZZZZ9'},{av:'AV55GuiRemCln',fld:'vGUIREMCLN',pic:''},{av:'AV51Col_Barcod',fld:'vCOL_BARCOD',pic:''},{av:'AV52Col_Barcodreo',fld:'vCOL_BARCODREO',pic:''},{av:'AV53Col_Barcodpar',fld:'vCOL_BARCODPAR',pic:''},{av:'AV60Col_BarPreKgm',fld:'vCOL_BARPREKGM',pic:''},{av:'AV59Col_BarPremtr',fld:'vCOL_BARPREMTR',pic:''},{av:'AV65usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV64station',fld:'vSTATION',pic:'',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e152012',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV48Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV49AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV26TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV27TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV28TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV29TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV30TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV31TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV32TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV33TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV34TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV35TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV36TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV37TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV38TFBarTipCol',fld:'vTFBARTIPCOL',pic:'Z9'},{av:'AV39TFBarTipCol_To',fld:'vTFBARTIPCOL_TO',pic:'Z9'},{av:'AV40TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV41TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV42TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV43TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV56TFAlbProEsp',fld:'vTFALBPROESP',pic:'99'},{av:'AV57TFAlbProEsp_To',fld:'vTFALBPROESP_TO',pic:'99'},{av:'AV69Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV54GuiRemCli',fld:'vGUIREMCLI',pic:'ZZZZZ9'},{av:'AV55GuiRemCln',fld:'vGUIREMCLN',pic:''},{av:'AV51Col_Barcod',fld:'vCOL_BARCOD',pic:''},{av:'AV52Col_Barcodreo',fld:'vCOL_BARCODREO',pic:''},{av:'AV53Col_Barcodpar',fld:'vCOL_BARCODPAR',pic:''},{av:'AV60Col_BarPreKgm',fld:'vCOL_BARPREKGM',pic:''},{av:'AV59Col_BarPremtr',fld:'vCOL_BARPREMTR',pic:''},{av:'AV65usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV64station',fld:'vSTATION',pic:'',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV56TFAlbProEsp',fld:'vTFALBPROESP',pic:'99'},{av:'AV57TFAlbProEsp_To',fld:'vTFALBPROESP_TO',pic:'99'},{av:'AV42TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV43TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV40TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV41TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV38TFBarTipCol',fld:'vTFBARTIPCOL',pic:'Z9'},{av:'AV39TFBarTipCol_To',fld:'vTFBARTIPCOL_TO',pic:'Z9'},{av:'AV36TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV37TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV34TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV35TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV32TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV33TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV30TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV31TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV28TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV29TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV26TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV27TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e202012',iparms:[{av:'A1262BarPreKgm',fld:'BARPREKGM',pic:'ZZZZZZ9.999',hsh:true},{av:'A1264BarPreMtr',fld:'BARPREMTR',pic:'ZZZZZZ9.999',hsh:true},{av:'AV51Col_Barcod',fld:'vCOL_BARCOD',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV52Col_Barcodreo',fld:'vCOL_BARCODREO',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9',hsh:true},{av:'AV53Col_Barcodpar',fld:'vCOL_BARCODPAR',pic:''},{av:'A130BarCodPar',fld:'BARCODPAR',pic:'',hsh:true},{av:'AV60Col_BarPreKgm',fld:'vCOL_BARPREKGM',pic:''},{av:'AV59Col_BarPremtr',fld:'vCOL_BARPREMTR',pic:''}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV16BarPreKgm',fld:'vBARPREKGM',pic:'ZZZZZZ9.999'},{av:'AV17BarPreMtr',fld:'vBARPREMTR',pic:'ZZZZZZ9.999'},{av:'AV50Seleccionar',fld:'vSELECCIONAR',pic:''}]}");
      setEventMetadata("'DOUSERACTION1'","{handler:'e112011',iparms:[]");
      setEventMetadata("'DOUSERACTION1'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNUSERACTION1.CLOSE","{handler:'e162012',iparms:[{av:'Dvelop_confirmpanel_btnuseraction1_Result',ctrl:'DVELOP_CONFIRMPANEL_BTNUSERACTION1',prop:'Result'},{av:'AV51Col_Barcod',fld:'vCOL_BARCOD',pic:''},{av:'AV52Col_Barcodreo',fld:'vCOL_BARCODREO',pic:''},{av:'AV53Col_Barcodpar',fld:'vCOL_BARCODPAR',pic:''},{av:'AV60Col_BarPreKgm',fld:'vCOL_BARPREKGM',pic:''},{av:'AV59Col_BarPremtr',fld:'vCOL_BARPREMTR',pic:''},{av:'AV48Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV49AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV65usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV64station',fld:'vSTATION',pic:'',hsh:true}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNUSERACTION1.CLOSE",",oparms:[{av:'AV16BarPreKgm',fld:'vBARPREKGM',pic:'ZZZZZZ9.999'},{av:'AV17BarPreMtr',fld:'vBARPREMTR',pic:'ZZZZZZ9.999'}]}");
      setEventMetadata("'DOUSERACTION2'","{handler:'e122011',iparms:[]");
      setEventMetadata("'DOUSERACTION2'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNUSERACTION2.CLOSE","{handler:'e172012',iparms:[{av:'Dvelop_confirmpanel_btnuseraction2_Result',ctrl:'DVELOP_CONFIRMPANEL_BTNUSERACTION2',prop:'Result'},{av:'AV51Col_Barcod',fld:'vCOL_BARCOD',pic:''},{av:'AV52Col_Barcodreo',fld:'vCOL_BARCODREO',pic:''},{av:'AV53Col_Barcodpar',fld:'vCOL_BARCODPAR',pic:''},{av:'AV60Col_BarPreKgm',fld:'vCOL_BARPREKGM',pic:''},{av:'AV59Col_BarPremtr',fld:'vCOL_BARPREMTR',pic:''},{av:'AV48Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV49AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV65usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV64station',fld:'vSTATION',pic:'',hsh:true}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNUSERACTION2.CLOSE",",oparms:[{av:'AV16BarPreKgm',fld:'vBARPREKGM',pic:'ZZZZZZ9.999'},{av:'AV17BarPreMtr',fld:'vBARPREMTR',pic:'ZZZZZZ9.999'}]}");
      setEventMetadata("VBARPREKGM.CONTROLVALUECHANGED","{handler:'e212012',iparms:[{av:'AV16BarPreKgm',fld:'vBARPREKGM',pic:'ZZZZZZ9.999'},{av:'A1262BarPreKgm',fld:'BARPREKGM',pic:'ZZZZZZ9.999',hsh:true},{av:'AV51Col_Barcod',fld:'vCOL_BARCOD',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV52Col_Barcodreo',fld:'vCOL_BARCODREO',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9',hsh:true},{av:'AV53Col_Barcodpar',fld:'vCOL_BARCODPAR',pic:''},{av:'A130BarCodPar',fld:'BARCODPAR',pic:'',hsh:true},{av:'AV60Col_BarPreKgm',fld:'vCOL_BARPREKGM',pic:''},{av:'AV17BarPreMtr',fld:'vBARPREMTR',pic:'ZZZZZZ9.999'},{av:'AV59Col_BarPremtr',fld:'vCOL_BARPREMTR',pic:''}]");
      setEventMetadata("VBARPREKGM.CONTROLVALUECHANGED",",oparms:[{av:'AV60Col_BarPreKgm',fld:'vCOL_BARPREKGM',pic:''},{av:'AV59Col_BarPremtr',fld:'vCOL_BARPREMTR',pic:''}]}");
      setEventMetadata("VBARPREMTR.CONTROLVALUECHANGED","{handler:'e222012',iparms:[{av:'AV17BarPreMtr',fld:'vBARPREMTR',pic:'ZZZZZZ9.999'},{av:'A1264BarPreMtr',fld:'BARPREMTR',pic:'ZZZZZZ9.999',hsh:true},{av:'AV51Col_Barcod',fld:'vCOL_BARCOD',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV52Col_Barcodreo',fld:'vCOL_BARCODREO',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9',hsh:true},{av:'AV53Col_Barcodpar',fld:'vCOL_BARCODPAR',pic:''},{av:'A130BarCodPar',fld:'BARCODPAR',pic:'',hsh:true},{av:'AV16BarPreKgm',fld:'vBARPREKGM',pic:'ZZZZZZ9.999'},{av:'AV60Col_BarPreKgm',fld:'vCOL_BARPREKGM',pic:''},{av:'AV59Col_BarPremtr',fld:'vCOL_BARPREMTR',pic:''}]");
      setEventMetadata("VBARPREMTR.CONTROLVALUECHANGED",",oparms:[{av:'AV60Col_BarPreKgm',fld:'vCOL_BARPREKGM',pic:''},{av:'AV59Col_BarPremtr',fld:'vCOL_BARPREMTR',pic:''}]}");
      setEventMetadata("VALIDV_ALBPROCOD","{handler:'validv_Albprocod',iparms:[]");
      setEventMetadata("VALIDV_ALBPROCOD",",oparms:[]}");
      setEventMetadata("VALID_PEDIDOCLIE","{handler:'valid_Pedidoclie',iparms:[]");
      setEventMetadata("VALID_PEDIDOCLIE",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
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
      wcpOAV48Emprcod = "" ;
      wcpOAV55GuiRemCln = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Dvelop_confirmpanel_btnuseraction1_Result = "" ;
      Dvelop_confirmpanel_btnuseraction2_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV48Emprcod = "" ;
      AV55GuiRemCln = "" ;
      AV26TFBarNHdr = "" ;
      AV27TFBarNHdr_Sel = "" ;
      AV28TFPedidoCliente = "" ;
      AV29TFPedidoCliente_Sel = "" ;
      AV30TFBarSer = "" ;
      AV31TFBarSer_Sel = "" ;
      AV32TFBarSerDsc = "" ;
      AV33TFBarSerDsc_Sel = "" ;
      AV34TFBarColNom = "" ;
      AV35TFBarColNom_Sel = "" ;
      AV40TFBarAlbKgmE = DecimalUtil.ZERO ;
      AV41TFBarAlbKgmE_To = DecimalUtil.ZERO ;
      AV42TFBarAlbMtrE = DecimalUtil.ZERO ;
      AV43TFBarAlbMtrE_To = DecimalUtil.ZERO ;
      AV69Pgmname = "" ;
      AV51Col_Barcod = new GXSimpleCollection<Integer>(Integer.class, "internal", "");
      AV52Col_Barcodreo = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV53Col_Barcodpar = new GXSimpleCollection<String>(String.class, "internal", "");
      AV60Col_BarPreKgm = new GXSimpleCollection<java.math.BigDecimal>(java.math.BigDecimal.class, "internal", "");
      AV59Col_BarPremtr = new GXSimpleCollection<java.math.BigDecimal>(java.math.BigDecimal.class, "internal", "");
      AV65usurcod = "" ;
      AV64station = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV44DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A396EmprCod = "" ;
      A4812BarEncCli = "" ;
      A143BarDisNum = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      bttBtnuseraction1_Jsonclick = "" ;
      bttBtnuseraction2_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A13696BarNHdr = "" ;
      A13878PedidoClie = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      AV16BarPreKgm = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      AV17BarPreMtr = DecimalUtil.ZERO ;
      A1262BarPreKgm = DecimalUtil.ZERO ;
      A1264BarPreMtr = DecimalUtil.ZERO ;
      A130BarCodPar = "" ;
      AV70Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr = "" ;
      AV71Facturacion_confirmacionpreciodocumento_produccionesds_2_tfbarnhdr_sel = "" ;
      AV72Facturacion_confirmacionpreciodocumento_produccionesds_3_tfpedidocliente = "" ;
      AV73Facturacion_confirmacionpreciodocumento_produccionesds_4_tfpedidocliente_sel = "" ;
      AV74Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser = "" ;
      AV75Facturacion_confirmacionpreciodocumento_produccionesds_6_tfbarser_sel = "" ;
      AV76Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc = "" ;
      AV77Facturacion_confirmacionpreciodocumento_produccionesds_8_tfbarserdsc_sel = "" ;
      AV78Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom = "" ;
      AV79Facturacion_confirmacionpreciodocumento_produccionesds_10_tfbarcolnom_sel = "" ;
      AV84Facturacion_confirmacionpreciodocumento_produccionesds_15_tfbaralbkgme = DecimalUtil.ZERO ;
      AV85Facturacion_confirmacionpreciodocumento_produccionesds_16_tfbaralbkgme_to = DecimalUtil.ZERO ;
      AV86Facturacion_confirmacionpreciodocumento_produccionesds_17_tfbaralbmtre = DecimalUtil.ZERO ;
      AV87Facturacion_confirmacionpreciodocumento_produccionesds_18_tfbaralbmtre_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV70Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr = "" ;
      lV74Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser = "" ;
      lV76Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc = "" ;
      lV78Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom = "" ;
      H02012_A30AlbProCod = new long[1] ;
      H02012_A1264BarPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02012_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02012_A32AlbProEsp = new byte[1] ;
      H02012_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02012_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02012_A218BarTipCol = new byte[1] ;
      H02012_A136BarColNum = new int[1] ;
      H02012_A135BarColNom = new String[] {""} ;
      H02012_A1652BarSerDsc = new String[] {""} ;
      H02012_A212BarSer = new String[] {""} ;
      H02012_A130BarCodPar = new String[] {""} ;
      H02012_A132BarCodReo = new byte[1] ;
      H02012_A129BarCod = new int[1] ;
      H02012_A143BarDisNum = new String[] {""} ;
      H02012_A4812BarEncCli = new String[] {""} ;
      H02012_A396EmprCod = new String[] {""} ;
      H02013_A30AlbProCod = new long[1] ;
      H02013_A1264BarPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02013_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02013_A32AlbProEsp = new byte[1] ;
      H02013_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02013_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02013_A218BarTipCol = new byte[1] ;
      H02013_A136BarColNum = new int[1] ;
      H02013_A135BarColNom = new String[] {""} ;
      H02013_A1652BarSerDsc = new String[] {""} ;
      H02013_A212BarSer = new String[] {""} ;
      H02013_A130BarCodPar = new String[] {""} ;
      H02013_A132BarCodReo = new byte[1] ;
      H02013_A129BarCod = new int[1] ;
      H02013_A143BarDisNum = new String[] {""} ;
      H02013_A4812BarEncCli = new String[] {""} ;
      H02013_A396EmprCod = new String[] {""} ;
      hsh = "" ;
      AV66EmprNom = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext8 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV63barcodpar = "" ;
      AV22Session = httpContext.getWebSession();
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char12 = "" ;
      GXv_char13 = new String[1] ;
      GXt_char11 = "" ;
      GXv_char5 = new String[1] ;
      GXt_char10 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char9 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState14 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      ucDvelop_confirmpanel_btnuseraction2 = new com.genexus.webpanels.GXUserControl();
      ucDvelop_confirmpanel_btnuseraction1 = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV48Emprcod = "" ;
      sCtrlAV49AlbProCod = "" ;
      sCtrlAV54GuiRemCli = "" ;
      sCtrlAV55GuiRemCln = "" ;
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.confirmacionpreciodocumento_producciones__default(),
         new Object[] {
             new Object[] {
            H02012_A30AlbProCod, H02012_A1264BarPreMtr, H02012_A1262BarPreKgm, H02012_A32AlbProEsp, H02012_A1263BarAlbMtrE, H02012_A1261BarAlbKgmE, H02012_A218BarTipCol, H02012_A136BarColNum, H02012_A135BarColNom, H02012_A1652BarSerDsc,
            H02012_A212BarSer, H02012_A130BarCodPar, H02012_A132BarCodReo, H02012_A129BarCod, H02012_A143BarDisNum, H02012_A4812BarEncCli, H02012_A396EmprCod
            }
            , new Object[] {
            H02013_A30AlbProCod, H02013_A1264BarPreMtr, H02013_A1262BarPreKgm, H02013_A32AlbProEsp, H02013_A1263BarAlbMtrE, H02013_A1261BarAlbKgmE, H02013_A218BarTipCol, H02013_A136BarColNum, H02013_A135BarColNom, H02013_A1652BarSerDsc,
            H02013_A212BarSer, H02013_A130BarCodPar, H02013_A132BarCodReo, H02013_A129BarCod, H02013_A143BarDisNum, H02013_A4812BarEncCli, H02013_A396EmprCod
            }
         }
      );
      AV69Pgmname = "Facturacion.ConfirmacionPrecioDocumento_Producciones" ;
      /* GeneXus formulas. */
      AV69Pgmname = "Facturacion.ConfirmacionPrecioDocumento_Producciones" ;
      Gx_err = (short)(0) ;
      edtavAlbprocod_Enabled = 0 ;
      edtavGuiremcli_Enabled = 0 ;
      edtavGuiremcln_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV38TFBarTipCol ;
   private byte AV39TFBarTipCol_To ;
   private byte AV56TFAlbProEsp ;
   private byte AV57TFAlbProEsp_To ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A218BarTipCol ;
   private byte A32AlbProEsp ;
   private byte A132BarCodReo ;
   private byte nDonePA ;
   private byte AV82Facturacion_confirmacionpreciodocumento_produccionesds_13_tfbartipcol ;
   private byte AV83Facturacion_confirmacionpreciodocumento_produccionesds_14_tfbartipcol_to ;
   private byte AV88Facturacion_confirmacionpreciodocumento_produccionesds_19_tfalbproesp ;
   private byte AV89Facturacion_confirmacionpreciodocumento_produccionesds_20_tfalbproesp_to ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV62barcodreo ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV12OrderedBy ;
   private short AV58i ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV54GuiRemCli ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_50 ;
   private int AV54GuiRemCli ;
   private int nGXsfl_50_idx=1 ;
   private int AV36TFBarColNum ;
   private int AV37TFBarColNum_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavAlbprocod_Enabled ;
   private int edtavGuiremcli_Enabled ;
   private int edtavGuiremcln_Enabled ;
   private int edtavPgmname_Enabled ;
   private int A136BarColNum ;
   private int A129BarCod ;
   private int subGrid_Islastpage ;
   private int AV80Facturacion_confirmacionpreciodocumento_produccionesds_11_tfbarcolnum ;
   private int AV81Facturacion_confirmacionpreciodocumento_produccionesds_12_tfbarcolnum_to ;
   private int AV45PageToGo ;
   private int AV61barcod ;
   private int AV90GXV1 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavBarprekgm_Enabled ;
   private int edtavBarprekgm_Visible ;
   private int edtavBarpremtr_Enabled ;
   private int edtavBarpremtr_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long wcpOAV49AlbProCod ;
   private long GRID_nFirstRecordOnPage ;
   private long AV49AlbProCod ;
   private long AV46GridCurrentPage ;
   private long AV47GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV40TFBarAlbKgmE ;
   private java.math.BigDecimal AV41TFBarAlbKgmE_To ;
   private java.math.BigDecimal AV42TFBarAlbMtrE ;
   private java.math.BigDecimal AV43TFBarAlbMtrE_To ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal AV16BarPreKgm ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal AV17BarPreMtr ;
   private java.math.BigDecimal A1262BarPreKgm ;
   private java.math.BigDecimal A1264BarPreMtr ;
   private java.math.BigDecimal AV84Facturacion_confirmacionpreciodocumento_produccionesds_15_tfbaralbkgme ;
   private java.math.BigDecimal AV85Facturacion_confirmacionpreciodocumento_produccionesds_16_tfbaralbkgme_to ;
   private java.math.BigDecimal AV86Facturacion_confirmacionpreciodocumento_produccionesds_17_tfbaralbmtre ;
   private java.math.BigDecimal AV87Facturacion_confirmacionpreciodocumento_produccionesds_18_tfbaralbmtre_to ;
   private String wcpOAV48Emprcod ;
   private String wcpOAV55GuiRemCln ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Dvelop_confirmpanel_btnuseraction1_Result ;
   private String Dvelop_confirmpanel_btnuseraction2_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV48Emprcod ;
   private String AV55GuiRemCln ;
   private String sGXsfl_50_idx="0001" ;
   private String AV26TFBarNHdr ;
   private String AV27TFBarNHdr_Sel ;
   private String AV28TFPedidoCliente ;
   private String AV29TFPedidoCliente_Sel ;
   private String AV30TFBarSer ;
   private String AV31TFBarSer_Sel ;
   private String AV32TFBarSerDsc ;
   private String AV33TFBarSerDsc_Sel ;
   private String AV34TFBarColNom ;
   private String AV35TFBarColNom_Sel ;
   private String AV69Pgmname ;
   private String AV65usurcod ;
   private String AV64station ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
   private String A4812BarEncCli ;
   private String A143BarDisNum ;
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
   private String Ddo_grid_Sortedstatus ;
   private String Ddo_grid_Includefilter ;
   private String Ddo_grid_Filtertype ;
   private String Ddo_grid_Filterisrange ;
   private String Ddo_grid_Includedatalist ;
   private String Ddo_grid_Datalisttype ;
   private String Ddo_grid_Datalistproc ;
   private String Dvelop_confirmpanel_btnuseraction1_Title ;
   private String Dvelop_confirmpanel_btnuseraction1_Confirmationtext ;
   private String Dvelop_confirmpanel_btnuseraction1_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_btnuseraction1_Nobuttoncaption ;
   private String Dvelop_confirmpanel_btnuseraction1_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_btnuseraction1_Yesbuttonposition ;
   private String Dvelop_confirmpanel_btnuseraction1_Confirmtype ;
   private String Dvelop_confirmpanel_btnuseraction2_Title ;
   private String Dvelop_confirmpanel_btnuseraction2_Confirmationtext ;
   private String Dvelop_confirmpanel_btnuseraction2_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_btnuseraction2_Nobuttoncaption ;
   private String Dvelop_confirmpanel_btnuseraction2_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_btnuseraction2_Yesbuttonposition ;
   private String Dvelop_confirmpanel_btnuseraction2_Confirmtype ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String edtavAlbprocod_Internalname ;
   private String edtavAlbprocod_Jsonclick ;
   private String edtavGuiremcli_Internalname ;
   private String edtavGuiremcli_Jsonclick ;
   private String edtavGuiremcln_Internalname ;
   private String edtavGuiremcln_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String TempTags ;
   private String bttBtnuseraction1_Internalname ;
   private String bttBtnuseraction1_Jsonclick ;
   private String bttBtnuseraction2_Internalname ;
   private String bttBtnuseraction2_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String A13696BarNHdr ;
   private String edtBarNHdr_Internalname ;
   private String A13878PedidoClie ;
   private String edtPedidoClie_Internalname ;
   private String A212BarSer ;
   private String edtBarSer_Internalname ;
   private String A1652BarSerDsc ;
   private String edtBarSerDsc_Internalname ;
   private String A135BarColNom ;
   private String edtBarColNom_Internalname ;
   private String edtBarColNum_Internalname ;
   private String edtBarTipCol_Internalname ;
   private String edtBarAlbKgmE_Internalname ;
   private String edtavBarprekgm_Internalname ;
   private String edtBarAlbMtrE_Internalname ;
   private String edtavBarpremtr_Internalname ;
   private String edtAlbProEsp_Internalname ;
   private String edtBarPreKgm_Internalname ;
   private String edtBarPreMtr_Internalname ;
   private String edtBarCod_Internalname ;
   private String A130BarCodPar ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String AV70Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr ;
   private String AV71Facturacion_confirmacionpreciodocumento_produccionesds_2_tfbarnhdr_sel ;
   private String AV72Facturacion_confirmacionpreciodocumento_produccionesds_3_tfpedidocliente ;
   private String AV73Facturacion_confirmacionpreciodocumento_produccionesds_4_tfpedidocliente_sel ;
   private String AV74Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser ;
   private String AV75Facturacion_confirmacionpreciodocumento_produccionesds_6_tfbarser_sel ;
   private String AV76Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc ;
   private String AV77Facturacion_confirmacionpreciodocumento_produccionesds_8_tfbarserdsc_sel ;
   private String AV78Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom ;
   private String AV79Facturacion_confirmacionpreciodocumento_produccionesds_10_tfbarcolnom_sel ;
   private String scmdbuf ;
   private String lV70Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr ;
   private String lV74Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser ;
   private String lV76Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc ;
   private String lV78Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom ;
   private String hsh ;
   private String AV66EmprNom ;
   private String AV63barcodpar ;
   private String GXt_char12 ;
   private String GXv_char13[] ;
   private String GXt_char11 ;
   private String GXv_char5[] ;
   private String GXt_char10 ;
   private String GXv_char4[] ;
   private String GXt_char9 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblTabledvelop_confirmpanel_btnuseraction2_Internalname ;
   private String Dvelop_confirmpanel_btnuseraction2_Internalname ;
   private String tblTabledvelop_confirmpanel_btnuseraction1_Internalname ;
   private String Dvelop_confirmpanel_btnuseraction1_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String sCtrlAV48Emprcod ;
   private String sCtrlAV49AlbProCod ;
   private String sCtrlAV54GuiRemCli ;
   private String sCtrlAV55GuiRemCln ;
   private String sGXsfl_50_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtBarNHdr_Jsonclick ;
   private String edtPedidoClie_Jsonclick ;
   private String edtBarSer_Jsonclick ;
   private String edtBarSerDsc_Jsonclick ;
   private String edtBarColNom_Jsonclick ;
   private String edtBarColNum_Jsonclick ;
   private String edtBarTipCol_Jsonclick ;
   private String edtBarAlbKgmE_Jsonclick ;
   private String edtavBarprekgm_Jsonclick ;
   private String edtBarAlbMtrE_Jsonclick ;
   private String edtavBarpremtr_Jsonclick ;
   private String edtAlbProEsp_Jsonclick ;
   private String edtBarPreKgm_Jsonclick ;
   private String edtBarPreMtr_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String subGrid_Header ;
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
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean AV50Seleccionar ;
   private boolean bGXsfl_50_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private GXSimpleCollection<Byte> AV52Col_Barcodreo ;
   private GXSimpleCollection<Integer> AV51Col_Barcod ;
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
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_btnuseraction2 ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_btnuseraction1 ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkavSeleccionar ;
   private IDataStoreProvider pr_default ;
   private long[] H02012_A30AlbProCod ;
   private java.math.BigDecimal[] H02012_A1264BarPreMtr ;
   private java.math.BigDecimal[] H02012_A1262BarPreKgm ;
   private byte[] H02012_A32AlbProEsp ;
   private java.math.BigDecimal[] H02012_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] H02012_A1261BarAlbKgmE ;
   private byte[] H02012_A218BarTipCol ;
   private int[] H02012_A136BarColNum ;
   private String[] H02012_A135BarColNom ;
   private String[] H02012_A1652BarSerDsc ;
   private String[] H02012_A212BarSer ;
   private String[] H02012_A130BarCodPar ;
   private byte[] H02012_A132BarCodReo ;
   private int[] H02012_A129BarCod ;
   private String[] H02012_A143BarDisNum ;
   private String[] H02012_A4812BarEncCli ;
   private String[] H02012_A396EmprCod ;
   private long[] H02013_A30AlbProCod ;
   private java.math.BigDecimal[] H02013_A1264BarPreMtr ;
   private java.math.BigDecimal[] H02013_A1262BarPreKgm ;
   private byte[] H02013_A32AlbProEsp ;
   private java.math.BigDecimal[] H02013_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] H02013_A1261BarAlbKgmE ;
   private byte[] H02013_A218BarTipCol ;
   private int[] H02013_A136BarColNum ;
   private String[] H02013_A135BarColNom ;
   private String[] H02013_A1652BarSerDsc ;
   private String[] H02013_A212BarSer ;
   private String[] H02013_A130BarCodPar ;
   private byte[] H02013_A132BarCodReo ;
   private int[] H02013_A129BarCod ;
   private String[] H02013_A143BarDisNum ;
   private String[] H02013_A4812BarEncCli ;
   private String[] H02013_A396EmprCod ;
   private GXSimpleCollection<java.math.BigDecimal> AV60Col_BarPreKgm ;
   private GXSimpleCollection<java.math.BigDecimal> AV59Col_BarPremtr ;
   private GXSimpleCollection<String> AV53Col_Barcodpar ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV44DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState14[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext8[] ;
}

final  class confirmacionpreciodocumento_producciones__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H02012( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV71Facturacion_confirmacionpreciodocumento_produccionesds_2_tfbarnhdr_sel ,
                                          String AV70Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr ,
                                          String AV75Facturacion_confirmacionpreciodocumento_produccionesds_6_tfbarser_sel ,
                                          String AV74Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser ,
                                          String AV77Facturacion_confirmacionpreciodocumento_produccionesds_8_tfbarserdsc_sel ,
                                          String AV76Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc ,
                                          String AV79Facturacion_confirmacionpreciodocumento_produccionesds_10_tfbarcolnom_sel ,
                                          String AV78Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom ,
                                          int AV80Facturacion_confirmacionpreciodocumento_produccionesds_11_tfbarcolnum ,
                                          int AV81Facturacion_confirmacionpreciodocumento_produccionesds_12_tfbarcolnum_to ,
                                          byte AV82Facturacion_confirmacionpreciodocumento_produccionesds_13_tfbartipcol ,
                                          byte AV83Facturacion_confirmacionpreciodocumento_produccionesds_14_tfbartipcol_to ,
                                          java.math.BigDecimal AV84Facturacion_confirmacionpreciodocumento_produccionesds_15_tfbaralbkgme ,
                                          java.math.BigDecimal AV85Facturacion_confirmacionpreciodocumento_produccionesds_16_tfbaralbkgme_to ,
                                          java.math.BigDecimal AV86Facturacion_confirmacionpreciodocumento_produccionesds_17_tfbaralbmtre ,
                                          java.math.BigDecimal AV87Facturacion_confirmacionpreciodocumento_produccionesds_18_tfbaralbmtre_to ,
                                          byte AV88Facturacion_confirmacionpreciodocumento_produccionesds_19_tfalbproesp ,
                                          byte AV89Facturacion_confirmacionpreciodocumento_produccionesds_20_tfalbproesp_to ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          byte A218BarTipCol ,
                                          java.math.BigDecimal A1261BarAlbKgmE ,
                                          java.math.BigDecimal A1263BarAlbMtrE ,
                                          byte A32AlbProEsp ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV73Facturacion_confirmacionpreciodocumento_produccionesds_4_tfpedidocliente_sel ,
                                          String AV72Facturacion_confirmacionpreciodocumento_produccionesds_3_tfpedidocliente ,
                                          String A13878PedidoClie ,
                                          String AV48Emprcod ,
                                          long AV49AlbProCod ,
                                          String A396EmprCod ,
                                          long A30AlbProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int15 = new byte[20];
      Object[] GXv_Object16 = new Object[2];
      scmdbuf = "SELECT T1.AlbProCod, T1.BarPreMtr, T1.BarPreKgm, T1.AlbProEsp, T1.BarAlbMtrE, T1.BarAlbKgmE, T2.BarTipCol, T2.BarColNum, T2.BarColNom, T2.BarSerDsc, T2.BarSer, T1.BarCodPar," ;
      scmdbuf += " T1.BarCodReo, T1.BarCod, T2.BarDisNum, T2.BarEncCli, T1.EmprCod FROM (TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod" ;
      scmdbuf += " AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.AlbProCod = ?)");
      if ( (GXutil.strcmp("", AV71Facturacion_confirmacionpreciodocumento_produccionesds_2_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV70Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Facturacion_confirmacionpreciodocumento_produccionesds_2_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int15[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Facturacion_confirmacionpreciodocumento_produccionesds_6_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV74Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Facturacion_confirmacionpreciodocumento_produccionesds_6_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int15[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Facturacion_confirmacionpreciodocumento_produccionesds_8_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV76Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Facturacion_confirmacionpreciodocumento_produccionesds_8_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int15[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Facturacion_confirmacionpreciodocumento_produccionesds_10_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV78Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Facturacion_confirmacionpreciodocumento_produccionesds_10_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int15[9] = (byte)(1) ;
      }
      if ( ! (0==AV80Facturacion_confirmacionpreciodocumento_produccionesds_11_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int15[10] = (byte)(1) ;
      }
      if ( ! (0==AV81Facturacion_confirmacionpreciodocumento_produccionesds_12_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int15[11] = (byte)(1) ;
      }
      if ( ! (0==AV82Facturacion_confirmacionpreciodocumento_produccionesds_13_tfbartipcol) )
      {
         addWhere(sWhereString, "(T2.BarTipCol >= ?)");
      }
      else
      {
         GXv_int15[12] = (byte)(1) ;
      }
      if ( ! (0==AV83Facturacion_confirmacionpreciodocumento_produccionesds_14_tfbartipcol_to) )
      {
         addWhere(sWhereString, "(T2.BarTipCol <= ?)");
      }
      else
      {
         GXv_int15[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Facturacion_confirmacionpreciodocumento_produccionesds_15_tfbaralbkgme)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE >= ?)");
      }
      else
      {
         GXv_int15[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Facturacion_confirmacionpreciodocumento_produccionesds_16_tfbaralbkgme_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE <= ?)");
      }
      else
      {
         GXv_int15[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Facturacion_confirmacionpreciodocumento_produccionesds_17_tfbaralbmtre)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE >= ?)");
      }
      else
      {
         GXv_int15[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Facturacion_confirmacionpreciodocumento_produccionesds_18_tfbaralbmtre_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE <= ?)");
      }
      else
      {
         GXv_int15[17] = (byte)(1) ;
      }
      if ( ! (0==AV88Facturacion_confirmacionpreciodocumento_produccionesds_19_tfalbproesp) )
      {
         addWhere(sWhereString, "(T1.AlbProEsp >= ?)");
      }
      else
      {
         GXv_int15[18] = (byte)(1) ;
      }
      if ( ! (0==AV89Facturacion_confirmacionpreciodocumento_produccionesds_20_tfalbproesp_to) )
      {
         addWhere(sWhereString, "(T1.AlbProEsp <= ?)");
      }
      else
      {
         GXv_int15[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV12OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSer" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSer DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSerDsc" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSerDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarColNom" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarColNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarColNum" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarColNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarTipCol" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarTipCol DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarAlbKgmE" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarAlbKgmE DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarAlbMtrE" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarAlbMtrE DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProEsp" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProEsp DESC" ;
      }
      GXv_Object16[0] = scmdbuf ;
      GXv_Object16[1] = GXv_int15 ;
      return GXv_Object16 ;
   }

   protected Object[] conditional_H02013( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV71Facturacion_confirmacionpreciodocumento_produccionesds_2_tfbarnhdr_sel ,
                                          String AV70Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr ,
                                          String AV75Facturacion_confirmacionpreciodocumento_produccionesds_6_tfbarser_sel ,
                                          String AV74Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser ,
                                          String AV77Facturacion_confirmacionpreciodocumento_produccionesds_8_tfbarserdsc_sel ,
                                          String AV76Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc ,
                                          String AV79Facturacion_confirmacionpreciodocumento_produccionesds_10_tfbarcolnom_sel ,
                                          String AV78Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom ,
                                          int AV80Facturacion_confirmacionpreciodocumento_produccionesds_11_tfbarcolnum ,
                                          int AV81Facturacion_confirmacionpreciodocumento_produccionesds_12_tfbarcolnum_to ,
                                          byte AV82Facturacion_confirmacionpreciodocumento_produccionesds_13_tfbartipcol ,
                                          byte AV83Facturacion_confirmacionpreciodocumento_produccionesds_14_tfbartipcol_to ,
                                          java.math.BigDecimal AV84Facturacion_confirmacionpreciodocumento_produccionesds_15_tfbaralbkgme ,
                                          java.math.BigDecimal AV85Facturacion_confirmacionpreciodocumento_produccionesds_16_tfbaralbkgme_to ,
                                          java.math.BigDecimal AV86Facturacion_confirmacionpreciodocumento_produccionesds_17_tfbaralbmtre ,
                                          java.math.BigDecimal AV87Facturacion_confirmacionpreciodocumento_produccionesds_18_tfbaralbmtre_to ,
                                          byte AV88Facturacion_confirmacionpreciodocumento_produccionesds_19_tfalbproesp ,
                                          byte AV89Facturacion_confirmacionpreciodocumento_produccionesds_20_tfalbproesp_to ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          byte A218BarTipCol ,
                                          java.math.BigDecimal A1261BarAlbKgmE ,
                                          java.math.BigDecimal A1263BarAlbMtrE ,
                                          byte A32AlbProEsp ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV73Facturacion_confirmacionpreciodocumento_produccionesds_4_tfpedidocliente_sel ,
                                          String AV72Facturacion_confirmacionpreciodocumento_produccionesds_3_tfpedidocliente ,
                                          String A13878PedidoClie ,
                                          String AV48Emprcod ,
                                          long AV49AlbProCod ,
                                          String A396EmprCod ,
                                          long A30AlbProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[20];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT T1.AlbProCod, T1.BarPreMtr, T1.BarPreKgm, T1.AlbProEsp, T1.BarAlbMtrE, T1.BarAlbKgmE, T2.BarTipCol, T2.BarColNum, T2.BarColNom, T2.BarSerDsc, T2.BarSer, T1.BarCodPar," ;
      scmdbuf += " T1.BarCodReo, T1.BarCod, T2.BarDisNum, T2.BarEncCli, T1.EmprCod FROM (TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod" ;
      scmdbuf += " AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.AlbProCod = ?)");
      if ( (GXutil.strcmp("", AV71Facturacion_confirmacionpreciodocumento_produccionesds_2_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV70Facturacion_confirmacionpreciodocumento_produccionesds_1_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Facturacion_confirmacionpreciodocumento_produccionesds_2_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int17[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Facturacion_confirmacionpreciodocumento_produccionesds_6_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV74Facturacion_confirmacionpreciodocumento_produccionesds_5_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Facturacion_confirmacionpreciodocumento_produccionesds_6_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int17[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Facturacion_confirmacionpreciodocumento_produccionesds_8_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV76Facturacion_confirmacionpreciodocumento_produccionesds_7_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Facturacion_confirmacionpreciodocumento_produccionesds_8_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int17[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Facturacion_confirmacionpreciodocumento_produccionesds_10_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV78Facturacion_confirmacionpreciodocumento_produccionesds_9_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Facturacion_confirmacionpreciodocumento_produccionesds_10_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int17[9] = (byte)(1) ;
      }
      if ( ! (0==AV80Facturacion_confirmacionpreciodocumento_produccionesds_11_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int17[10] = (byte)(1) ;
      }
      if ( ! (0==AV81Facturacion_confirmacionpreciodocumento_produccionesds_12_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int17[11] = (byte)(1) ;
      }
      if ( ! (0==AV82Facturacion_confirmacionpreciodocumento_produccionesds_13_tfbartipcol) )
      {
         addWhere(sWhereString, "(T2.BarTipCol >= ?)");
      }
      else
      {
         GXv_int17[12] = (byte)(1) ;
      }
      if ( ! (0==AV83Facturacion_confirmacionpreciodocumento_produccionesds_14_tfbartipcol_to) )
      {
         addWhere(sWhereString, "(T2.BarTipCol <= ?)");
      }
      else
      {
         GXv_int17[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Facturacion_confirmacionpreciodocumento_produccionesds_15_tfbaralbkgme)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE >= ?)");
      }
      else
      {
         GXv_int17[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Facturacion_confirmacionpreciodocumento_produccionesds_16_tfbaralbkgme_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE <= ?)");
      }
      else
      {
         GXv_int17[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Facturacion_confirmacionpreciodocumento_produccionesds_17_tfbaralbmtre)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE >= ?)");
      }
      else
      {
         GXv_int17[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Facturacion_confirmacionpreciodocumento_produccionesds_18_tfbaralbmtre_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE <= ?)");
      }
      else
      {
         GXv_int17[17] = (byte)(1) ;
      }
      if ( ! (0==AV88Facturacion_confirmacionpreciodocumento_produccionesds_19_tfalbproesp) )
      {
         addWhere(sWhereString, "(T1.AlbProEsp >= ?)");
      }
      else
      {
         GXv_int17[18] = (byte)(1) ;
      }
      if ( ! (0==AV89Facturacion_confirmacionpreciodocumento_produccionesds_20_tfalbproesp_to) )
      {
         addWhere(sWhereString, "(T1.AlbProEsp <= ?)");
      }
      else
      {
         GXv_int17[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV12OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSer" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSer DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSerDsc" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSerDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarColNom" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarColNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarColNum" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarColNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarTipCol" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarTipCol DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarAlbKgmE" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarAlbKgmE DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarAlbMtrE" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarAlbMtrE DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProEsp" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProEsp DESC" ;
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
                  return conditional_H02012(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).byteValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).byteValue() , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).shortValue() , ((Boolean) dynConstraints[30]).booleanValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).longValue() , (String)dynConstraints[36] , ((Number) dynConstraints[37]).longValue() );
            case 1 :
                  return conditional_H02013(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).byteValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).byteValue() , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).shortValue() , ((Boolean) dynConstraints[30]).booleanValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).longValue() , (String)dynConstraints[36] , ((Number) dynConstraints[37]).longValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02012", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02013", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((String[]) buf[9])[0] = rslt.getString(10, 26);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 8);
               ((String[]) buf[15])[0] = rslt.getString(16, 20);
               ((String[]) buf[16])[0] = rslt.getString(17, 3);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((String[]) buf[9])[0] = rslt.getString(10, 26);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 8);
               ((String[]) buf[15])[0] = rslt.getString(16, 20);
               ((String[]) buf[16])[0] = rslt.getString(17, 3);
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
                  stmt.setString(sIdx, (String)parms[20], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[21]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 11);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 11);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 13);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[32]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[33]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[21]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 11);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 11);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 13);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[32]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[33]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               return;
      }
   }

}

