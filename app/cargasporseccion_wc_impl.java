package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class cargasporseccion_wc_impl extends GXWebComponent
{
   public cargasporseccion_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public cargasporseccion_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cargasporseccion_wc_impl.class ));
   }

   public cargasporseccion_wc_impl( int remoteHandle ,
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
      cmbBarFasEst = new HTMLChoice();
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( nGotPars == 0 )
         {
            entryPointCalled = false ;
            gxfirstwebparm = httpContext.GetNextPar( ) ;
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
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix});
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
               gxfirstwebparm = httpContext.GetNextPar( ) ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
            {
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxfirstwebparm = httpContext.GetNextPar( ) ;
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
      nRC_GXsfl_39 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_39"))) ;
      nGXsfl_39_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_39_idx"))) ;
      sGXsfl_39_idx = httpContext.GetPar( "sGXsfl_39_idx") ;
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
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV7FasesColeccion);
      AV18FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV111TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV112TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      AV113TFBarFecCli = localUtil.parseDateParm( httpContext.GetPar( "TFBarFecCli")) ;
      AV114TFBarFecCli_To = localUtil.parseDateParm( httpContext.GetPar( "TFBarFecCli_To")) ;
      AV117TFPedidoCliente = httpContext.GetPar( "TFPedidoCliente") ;
      AV118TFPedidoCliente_Sel = httpContext.GetPar( "TFPedidoCliente_Sel") ;
      AV119TFBarFecFpr = localUtil.parseDateParm( httpContext.GetPar( "TFBarFecFpr")) ;
      AV120TFBarFecFpr_To = localUtil.parseDateParm( httpContext.GetPar( "TFBarFecFpr_To")) ;
      AV123TFBarFecGen = localUtil.parseDateParm( httpContext.GetPar( "TFBarFecGen")) ;
      AV124TFBarFecGen_To = localUtil.parseDateParm( httpContext.GetPar( "TFBarFecGen_To")) ;
      AV127TFBarNHdr = httpContext.GetPar( "TFBarNHdr") ;
      AV128TFBarNHdr_Sel = httpContext.GetPar( "TFBarNHdr_Sel") ;
      AV129TFBarSer = httpContext.GetPar( "TFBarSer") ;
      AV130TFBarSer_Sel = httpContext.GetPar( "TFBarSer_Sel") ;
      AV131TFBarSerDsc = httpContext.GetPar( "TFBarSerDsc") ;
      AV132TFBarSerDsc_Sel = httpContext.GetPar( "TFBarSerDsc_Sel") ;
      AV133TFBarColNom = httpContext.GetPar( "TFBarColNom") ;
      AV134TFBarColNom_Sel = httpContext.GetPar( "TFBarColNom_Sel") ;
      AV135TFBarColNum = (int)(GXutil.lval( httpContext.GetPar( "TFBarColNum"))) ;
      AV136TFBarColNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarColNum_To"))) ;
      AV137TFBarTipCol = (byte)(GXutil.lval( httpContext.GetPar( "TFBarTipCol"))) ;
      AV138TFBarTipCol_To = (byte)(GXutil.lval( httpContext.GetPar( "TFBarTipCol_To"))) ;
      AV39TFBarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "TFBarOrdLin"))) ;
      AV40TFBarOrdLin_To = (short)(GXutil.lval( httpContext.GetPar( "TFBarOrdLin_To"))) ;
      AV53TFMaqCodBis = httpContext.GetPar( "TFMaqCodBis") ;
      AV54TFMaqCodBis_Sel = httpContext.GetPar( "TFMaqCodBis_Sel") ;
      AV41TFFasCod = httpContext.GetPar( "TFFasCod") ;
      AV42TFFasCod_Sel = httpContext.GetPar( "TFFasCod_Sel") ;
      AV139TFFasDsc = httpContext.GetPar( "TFFasDsc") ;
      AV140TFFasDsc_Sel = httpContext.GetPar( "TFFasDsc_Sel") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV142TFBarFasEst_Sels);
      AV143TFBarMtr = CommonUtil.decimalVal( httpContext.GetPar( "TFBarMtr"), ".") ;
      AV144TFBarMtr_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarMtr_To"), ".") ;
      AV145TFBarkgm = CommonUtil.decimalVal( httpContext.GetPar( "TFBarkgm"), ".") ;
      AV146TFBarkgm_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarkgm_To"), ".") ;
      AV147TFBarPie = (int)(GXutil.lval( httpContext.GetPar( "TFBarPie"))) ;
      AV148TFBarPie_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarPie_To"))) ;
      AV149TFBarFasCod = httpContext.GetPar( "TFBarFasCod") ;
      AV150TFBarFasCod_Sel = httpContext.GetPar( "TFBarFasCod_Sel") ;
      AV151TFBarFecCum = localUtil.parseDateParm( httpContext.GetPar( "TFBarFecCum")) ;
      AV152TFBarFecCum_To = localUtil.parseDateParm( httpContext.GetPar( "TFBarFecCum_To")) ;
      AV155TFBarSit = (byte)(GXutil.lval( httpContext.GetPar( "TFBarSit"))) ;
      AV156TFBarSit_To = (byte)(GXutil.lval( httpContext.GetPar( "TFBarSit_To"))) ;
      AV5Emprcod = httpContext.GetPar( "Emprcod") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( AV7FasesColeccion, AV18FilterFullText, AV111TFCliNom, AV112TFCliNom_Sel, AV113TFBarFecCli, AV114TFBarFecCli_To, AV117TFPedidoCliente, AV118TFPedidoCliente_Sel, AV119TFBarFecFpr, AV120TFBarFecFpr_To, AV123TFBarFecGen, AV124TFBarFecGen_To, AV127TFBarNHdr, AV128TFBarNHdr_Sel, AV129TFBarSer, AV130TFBarSer_Sel, AV131TFBarSerDsc, AV132TFBarSerDsc_Sel, AV133TFBarColNom, AV134TFBarColNom_Sel, AV135TFBarColNum, AV136TFBarColNum_To, AV137TFBarTipCol, AV138TFBarTipCol_To, AV39TFBarOrdLin, AV40TFBarOrdLin_To, AV53TFMaqCodBis, AV54TFMaqCodBis_Sel, AV41TFFasCod, AV42TFFasCod_Sel, AV139TFFasDsc, AV140TFFasDsc_Sel, AV142TFBarFasEst_Sels, AV143TFBarMtr, AV144TFBarMtr_To, AV145TFBarkgm, AV146TFBarkgm_To, AV147TFBarPie, AV148TFBarPie_To, AV149TFBarFasCod, AV150TFBarFasCod_Sel, AV151TFBarFecCum, AV152TFBarFecCum_To, AV155TFBarSit, AV156TFBarSit_To, AV5Emprcod, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1F92( ) ;
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
         httpContext.writeValue( httpContext.getMessage( " Tabla BARFAS", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.cargasporseccion_wc", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFCLINOM", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV111TFCliNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFCLINOM_SEL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV112TFCliNom_Sel, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARFECCLI", getSecureSignedToken( sPrefix, AV113TFBarFecCli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARFECCLI_TO", getSecureSignedToken( sPrefix, AV114TFBarFecCli_To));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFPEDIDOCLIENTE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV117TFPedidoCliente, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFPEDIDOCLIENTE_SEL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV118TFPedidoCliente_Sel, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARFECFPR", getSecureSignedToken( sPrefix, AV119TFBarFecFpr));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARFECFPR_TO", getSecureSignedToken( sPrefix, AV120TFBarFecFpr_To));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARFECGEN", getSecureSignedToken( sPrefix, AV123TFBarFecGen));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARFECGEN_TO", getSecureSignedToken( sPrefix, AV124TFBarFecGen_To));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARNHDR", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV127TFBarNHdr, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARNHDR_SEL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV128TFBarNHdr_Sel, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARSER", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV129TFBarSer, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARSER_SEL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV130TFBarSer_Sel, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARSERDSC", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV131TFBarSerDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARSERDSC_SEL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV132TFBarSerDsc_Sel, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARCOLNOM", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV133TFBarColNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARCOLNOM_SEL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV134TFBarColNom_Sel, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARCOLNUM", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV135TFBarColNum), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARCOLNUM_TO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV136TFBarColNum_To), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARTIPCOL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV137TFBarTipCol), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARTIPCOL_TO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV138TFBarTipCol_To), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARORDLIN", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV39TFBarOrdLin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARORDLIN_TO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV40TFBarOrdLin_To), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFMAQCODBIS", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV53TFMaqCodBis, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFMAQCODBIS_SEL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV54TFMaqCodBis_Sel, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFFASCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV41TFFasCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFFASCOD_SEL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV42TFFasCod_Sel, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFFASDSC", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV139TFFasDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFFASDSC_SEL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV140TFFasDsc_Sel, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARFASEST_SELS", getSecureSignedToken( sPrefix, AV142TFBarFasEst_Sels));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARMTR", getSecureSignedToken( sPrefix, localUtil.format( AV143TFBarMtr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARMTR_TO", getSecureSignedToken( sPrefix, localUtil.format( AV144TFBarMtr_To, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARKGM", getSecureSignedToken( sPrefix, localUtil.format( AV145TFBarkgm, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARKGM_TO", getSecureSignedToken( sPrefix, localUtil.format( AV146TFBarkgm_To, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARPIE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV147TFBarPie), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARPIE_TO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV148TFBarPie_To), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARFASCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV149TFBarFasCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARFASCOD_SEL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV150TFBarFasCod_Sel, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARFECCUM", getSecureSignedToken( sPrefix, AV151TFBarFecCum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARFECCUM_TO", getSecureSignedToken( sPrefix, AV152TFBarFecCum_To));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARSIT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV155TFBarSit), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARSIT_TO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV156TFBarSit_To), "Z9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_39", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_39, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV26ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV26ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV109GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV110GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV107DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV107DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV23ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV23ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM", GXutil.rtrim( AV111TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFCLINOM", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV111TFCliNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM_SEL", GXutil.rtrim( AV112TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFCLINOM_SEL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV112TFCliNom_Sel, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFECCLI", localUtil.dtoc( AV113TFBarFecCli, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARFECCLI", getSecureSignedToken( sPrefix, AV113TFBarFecCli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFECCLI_TO", localUtil.dtoc( AV114TFBarFecCli_To, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARFECCLI_TO", getSecureSignedToken( sPrefix, AV114TFBarFecCli_To));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPEDIDOCLIENTE", GXutil.rtrim( AV117TFPedidoCliente));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFPEDIDOCLIENTE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV117TFPedidoCliente, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPEDIDOCLIENTE_SEL", GXutil.rtrim( AV118TFPedidoCliente_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFPEDIDOCLIENTE_SEL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV118TFPedidoCliente_Sel, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFECFPR", localUtil.dtoc( AV119TFBarFecFpr, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARFECFPR", getSecureSignedToken( sPrefix, AV119TFBarFecFpr));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFECFPR_TO", localUtil.dtoc( AV120TFBarFecFpr_To, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARFECFPR_TO", getSecureSignedToken( sPrefix, AV120TFBarFecFpr_To));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFECGEN", localUtil.dtoc( AV123TFBarFecGen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARFECGEN", getSecureSignedToken( sPrefix, AV123TFBarFecGen));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFECGEN_TO", localUtil.dtoc( AV124TFBarFecGen_To, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARFECGEN_TO", getSecureSignedToken( sPrefix, AV124TFBarFecGen_To));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNHDR", GXutil.rtrim( AV127TFBarNHdr));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARNHDR", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV127TFBarNHdr, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNHDR_SEL", GXutil.rtrim( AV128TFBarNHdr_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARNHDR_SEL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV128TFBarNHdr_Sel, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSER", GXutil.rtrim( AV129TFBarSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARSER", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV129TFBarSer, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSER_SEL", GXutil.rtrim( AV130TFBarSer_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARSER_SEL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV130TFBarSer_Sel, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSERDSC", GXutil.rtrim( AV131TFBarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARSERDSC", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV131TFBarSerDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSERDSC_SEL", GXutil.rtrim( AV132TFBarSerDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARSERDSC_SEL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV132TFBarSerDsc_Sel, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNOM", GXutil.rtrim( AV133TFBarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARCOLNOM", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV133TFBarColNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNOM_SEL", GXutil.rtrim( AV134TFBarColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARCOLNOM_SEL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV134TFBarColNom_Sel, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNUM", GXutil.ltrim( localUtil.ntoc( AV135TFBarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARCOLNUM", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV135TFBarColNum), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV136TFBarColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARCOLNUM_TO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV136TFBarColNum_To), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARTIPCOL", GXutil.ltrim( localUtil.ntoc( AV137TFBarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARTIPCOL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV137TFBarTipCol), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARTIPCOL_TO", GXutil.ltrim( localUtil.ntoc( AV138TFBarTipCol_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARTIPCOL_TO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV138TFBarTipCol_To), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARORDLIN", GXutil.ltrim( localUtil.ntoc( AV39TFBarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARORDLIN", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV39TFBarOrdLin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARORDLIN_TO", GXutil.ltrim( localUtil.ntoc( AV40TFBarOrdLin_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARORDLIN_TO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV40TFBarOrdLin_To), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMAQCODBIS", GXutil.rtrim( AV53TFMaqCodBis));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFMAQCODBIS", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV53TFMaqCodBis, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMAQCODBIS_SEL", GXutil.rtrim( AV54TFMaqCodBis_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFMAQCODBIS_SEL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV54TFMaqCodBis_Sel, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASCOD", GXutil.rtrim( AV41TFFasCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFFASCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV41TFFasCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASCOD_SEL", GXutil.rtrim( AV42TFFasCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFFASCOD_SEL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV42TFFasCod_Sel, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASDSC", GXutil.rtrim( AV139TFFasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFFASDSC", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV139TFFasDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASDSC_SEL", GXutil.rtrim( AV140TFFasDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFFASDSC_SEL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV140TFFasDsc_Sel, ""))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vTFBARFASEST_SELS", AV142TFBarFasEst_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vTFBARFASEST_SELS", AV142TFBarFasEst_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARFASEST_SELS", getSecureSignedToken( sPrefix, AV142TFBarFasEst_Sels));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARMTR", GXutil.ltrim( localUtil.ntoc( AV143TFBarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARMTR", getSecureSignedToken( sPrefix, localUtil.format( AV143TFBarMtr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARMTR_TO", GXutil.ltrim( localUtil.ntoc( AV144TFBarMtr_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARMTR_TO", getSecureSignedToken( sPrefix, localUtil.format( AV144TFBarMtr_To, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARKGM", GXutil.ltrim( localUtil.ntoc( AV145TFBarkgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARKGM", getSecureSignedToken( sPrefix, localUtil.format( AV145TFBarkgm, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARKGM_TO", GXutil.ltrim( localUtil.ntoc( AV146TFBarkgm_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARKGM_TO", getSecureSignedToken( sPrefix, localUtil.format( AV146TFBarkgm_To, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARPIE", GXutil.ltrim( localUtil.ntoc( AV147TFBarPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARPIE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV147TFBarPie), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARPIE_TO", GXutil.ltrim( localUtil.ntoc( AV148TFBarPie_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARPIE_TO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV148TFBarPie_To), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFASCOD", GXutil.rtrim( AV149TFBarFasCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARFASCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV149TFBarFasCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFASCOD_SEL", GXutil.rtrim( AV150TFBarFasCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARFASCOD_SEL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV150TFBarFasCod_Sel, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFECCUM", localUtil.dtoc( AV151TFBarFecCum, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARFECCUM", getSecureSignedToken( sPrefix, AV151TFBarFecCum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFECCUM_TO", localUtil.dtoc( AV152TFBarFecCum_To, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARFECCUM_TO", getSecureSignedToken( sPrefix, AV152TFBarFecCum_To));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSIT", GXutil.ltrim( localUtil.ntoc( AV155TFBarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARSIT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV155TFBarSit), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSIT_TO", GXutil.ltrim( localUtil.ntoc( AV156TFBarSit_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARSIT_TO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV156TFBarSit_To), "Z9")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vFASESCOLECCION", AV7FasesColeccion);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vFASESCOLECCION", AV7FasesColeccion);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV5Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARENCCLI", GXutil.rtrim( A4812BarEncCli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARDISNUM", GXutil.rtrim( A143BarDisNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARPIENDES", GXutil.ltrim( localUtil.ntoc( A898BarPieNDes, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DISDES", GXutil.rtrim( A365DisDes));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARPIE1", GXutil.ltrim( localUtil.ntoc( A199BarPie1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FASEANTERI", GXutil.ltrim( localUtil.ntoc( A13889FaseAnteri, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageoptions", GXutil.rtrim( Gridpaginationbar_Rowsperpageoptions));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Previous", GXutil.rtrim( Gridpaginationbar_Previous));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Next", GXutil.rtrim( Gridpaginationbar_Next));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Caption", GXutil.rtrim( Gridpaginationbar_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Emptygridcaption", GXutil.rtrim( Gridpaginationbar_Emptygridcaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpagecaption", GXutil.rtrim( Gridpaginationbar_Rowsperpagecaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Caption", GXutil.rtrim( Ddo_grid_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includesortasc", GXutil.rtrim( Ddo_grid_Includesortasc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Fixable", GXutil.rtrim( Ddo_grid_Fixable));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
   }

   public void renderHtmlCloseForm1F92( )
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
      return "CargasporSeccion_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Tabla BARFAS", "") ;
   }

   public void wb1F90( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.cargasporseccion_wc");
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 39, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 7, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e111f91_client"+"'", TempTags, "", 2, "HLP_CargasporSeccion_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 39, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CargasporSeccion_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_21_1F92( true) ;
      }
      else
      {
         wb_table1_21_1F92( false) ;
      }
      return  ;
   }

   public void wb_table1_21_1F92e( boolean wbgen )
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
         startgridcontrol39( ) ;
      }
      if ( wbEnd == 39 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_39 = (int)(nGXsfl_39_idx-1) ;
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
         wb_table2_64_1F92( true) ;
      }
      else
      {
         wb_table2_64_1F92( false) ;
      }
      return  ;
   }

   public void wb_table2_64_1F92e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV109GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV110GridPageCount);
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
         ucDdo_grid.setProperty("AllowMultipleSelection", Ddo_grid_Allowmultipleselection);
         ucDdo_grid.setProperty("DataListFixedValues", Ddo_grid_Datalistfixedvalues);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV107DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV107DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV23ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_barfeccliauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'" + sPrefix + "',false,'" + sGXsfl_39_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_barfeccliauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_barfeccliauxdate_Internalname, localUtil.format(AV115DDO_BarFecCliAuxDate, "99/99/99"), localUtil.format( AV115DDO_BarFecCliAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,104);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_barfeccliauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CargasporSeccion_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_barfeccliauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_CargasporSeccion_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 105,'" + sPrefix + "',false,'" + sGXsfl_39_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_barfeccliauxdateto_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_barfeccliauxdateto_Internalname, localUtil.format(AV116DDO_BarFecCliAuxDateTo, "99/99/99"), localUtil.format( AV116DDO_BarFecCliAuxDateTo, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,105);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_barfeccliauxdateto_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CargasporSeccion_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_barfeccliauxdateto_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_CargasporSeccion_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_barfecfprauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'" + sPrefix + "',false,'" + sGXsfl_39_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_barfecfprauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_barfecfprauxdate_Internalname, localUtil.format(AV121DDO_BarFecFprAuxDate, "99/99/99"), localUtil.format( AV121DDO_BarFecFprAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,107);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_barfecfprauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CargasporSeccion_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_barfecfprauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_CargasporSeccion_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'" + sPrefix + "',false,'" + sGXsfl_39_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_barfecfprauxdateto_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_barfecfprauxdateto_Internalname, localUtil.format(AV122DDO_BarFecFprAuxDateTo, "99/99/99"), localUtil.format( AV122DDO_BarFecFprAuxDateTo, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,108);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_barfecfprauxdateto_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CargasporSeccion_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_barfecfprauxdateto_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_CargasporSeccion_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_barfecgenauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 110,'" + sPrefix + "',false,'" + sGXsfl_39_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_barfecgenauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_barfecgenauxdate_Internalname, localUtil.format(AV125DDO_BarFecGenAuxDate, "99/99/99"), localUtil.format( AV125DDO_BarFecGenAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,110);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_barfecgenauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CargasporSeccion_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_barfecgenauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_CargasporSeccion_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'" + sPrefix + "',false,'" + sGXsfl_39_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_barfecgenauxdateto_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_barfecgenauxdateto_Internalname, localUtil.format(AV126DDO_BarFecGenAuxDateTo, "99/99/99"), localUtil.format( AV126DDO_BarFecGenAuxDateTo, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,111);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_barfecgenauxdateto_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CargasporSeccion_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_barfecgenauxdateto_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_CargasporSeccion_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_barfeccumauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'" + sPrefix + "',false,'" + sGXsfl_39_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_barfeccumauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_barfeccumauxdate_Internalname, localUtil.format(AV153DDO_BarFecCumAuxDate, "99/99/99"), localUtil.format( AV153DDO_BarFecCumAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,113);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_barfeccumauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CargasporSeccion_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_barfeccumauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_CargasporSeccion_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'" + sPrefix + "',false,'" + sGXsfl_39_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_barfeccumauxdateto_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_barfeccumauxdateto_Internalname, localUtil.format(AV154DDO_BarFecCumAuxDateTo, "99/99/99"), localUtil.format( AV154DDO_BarFecCumAuxDateTo, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,114);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_barfeccumauxdateto_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CargasporSeccion_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_barfeccumauxdateto_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_CargasporSeccion_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 39 )
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

   public void start1F92( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( " Tabla BARFAS", ""), (short)(0)) ;
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
            strup1F90( ) ;
         }
      }
   }

   public void ws1F92( )
   {
      start1F92( ) ;
      evt1F92( ) ;
   }

   public void evt1F92( )
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
                              strup1F90( ) ;
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
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1F90( ) ;
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
                              strup1F90( ) ;
                           }
                           nGXsfl_39_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_39_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_392( ) ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A155BarFecCli = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtBarFecCli_Internalname), 0)) ;
                           A13878PedidoClie = httpContext.cgiGet( edtPedidoClie_Internalname) ;
                           A158BarFecFpr = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtBarFecFpr_Internalname), 0)) ;
                           A159BarFecGen = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtBarFecGen_Internalname), 0)) ;
                           A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
                           A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
                           A1652BarSerDsc = httpContext.cgiGet( edtBarSerDsc_Internalname) ;
                           A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
                           A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A218BarTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A603MaqCodBis = httpContext.cgiGet( edtMaqCodBis_Internalname) ;
                           A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
                           A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
                           cmbBarFasEst.setName( cmbBarFasEst.getInternalname() );
                           cmbBarFasEst.setValue( httpContext.cgiGet( cmbBarFasEst.getInternalname()) );
                           A153BarFasEst = (byte)(GXutil.lval( httpContext.cgiGet( cmbBarFasEst.getInternalname()))) ;
                           A184BarMtr = localUtil.ctond( httpContext.cgiGet( edtBarMtr_Internalname)) ;
                           A166BarKgm = localUtil.ctond( httpContext.cgiGet( edtBarKgm_Internalname)) ;
                           A198BarPie = (int)(localUtil.ctol( httpContext.cgiGet( edtBarPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A151BarFasCod = httpContext.cgiGet( edtBarFasCod_Internalname) ;
                           n151BarFasCod = false ;
                           A156BarFecCum = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtBarFecCum_Internalname), 0)) ;
                           n156BarFecCum = false ;
                           A213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
                                       e121F92 ();
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
                                       e131F92 ();
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
                                       e141F92 ();
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
                                    strup1F90( ) ;
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

   public void we1F92( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1F92( ) ;
         }
      }
   }

   public void pa1F92( )
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
      subsflControlProps_392( ) ;
      while ( nGXsfl_39_idx <= nRC_GXsfl_39 )
      {
         sendrow_392( ) ;
         nGXsfl_39_idx = ((subGrid_Islastpage==1)&&(nGXsfl_39_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_39_idx+1) ;
         sGXsfl_39_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_392( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( GXSimpleCollection<String> AV7FasesColeccion ,
                                 String AV18FilterFullText ,
                                 String AV111TFCliNom ,
                                 String AV112TFCliNom_Sel ,
                                 java.util.Date AV113TFBarFecCli ,
                                 java.util.Date AV114TFBarFecCli_To ,
                                 String AV117TFPedidoCliente ,
                                 String AV118TFPedidoCliente_Sel ,
                                 java.util.Date AV119TFBarFecFpr ,
                                 java.util.Date AV120TFBarFecFpr_To ,
                                 java.util.Date AV123TFBarFecGen ,
                                 java.util.Date AV124TFBarFecGen_To ,
                                 String AV127TFBarNHdr ,
                                 String AV128TFBarNHdr_Sel ,
                                 String AV129TFBarSer ,
                                 String AV130TFBarSer_Sel ,
                                 String AV131TFBarSerDsc ,
                                 String AV132TFBarSerDsc_Sel ,
                                 String AV133TFBarColNom ,
                                 String AV134TFBarColNom_Sel ,
                                 int AV135TFBarColNum ,
                                 int AV136TFBarColNum_To ,
                                 byte AV137TFBarTipCol ,
                                 byte AV138TFBarTipCol_To ,
                                 short AV39TFBarOrdLin ,
                                 short AV40TFBarOrdLin_To ,
                                 String AV53TFMaqCodBis ,
                                 String AV54TFMaqCodBis_Sel ,
                                 String AV41TFFasCod ,
                                 String AV42TFFasCod_Sel ,
                                 String AV139TFFasDsc ,
                                 String AV140TFFasDsc_Sel ,
                                 GXSimpleCollection<Byte> AV142TFBarFasEst_Sels ,
                                 java.math.BigDecimal AV143TFBarMtr ,
                                 java.math.BigDecimal AV144TFBarMtr_To ,
                                 java.math.BigDecimal AV145TFBarkgm ,
                                 java.math.BigDecimal AV146TFBarkgm_To ,
                                 int AV147TFBarPie ,
                                 int AV148TFBarPie_To ,
                                 String AV149TFBarFasCod ,
                                 String AV150TFBarFasCod_Sel ,
                                 java.util.Date AV151TFBarFecCum ,
                                 java.util.Date AV152TFBarFecCum_To ,
                                 byte AV155TFBarSit ,
                                 byte AV156TFBarSit_To ,
                                 String AV5Emprcod ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e131F92 ();
      GRID_nCurrentRecord = 0 ;
      rf1F92( ) ;
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
      rf1F92( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavTotvaluebarmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebarmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarmtr_Enabled), 5, 0), true);
      edtavTotvaluebarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarkgm_Enabled), 5, 0), true);
      edtavTotvaluebarpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebarpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarpie_Enabled), 5, 0), true);
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV174Cargasporseccion_wcds_1_filterfulltext = AV18FilterFullText ;
      AV175Cargasporseccion_wcds_2_tfclinom = AV111TFCliNom ;
      AV176Cargasporseccion_wcds_3_tfclinom_sel = AV112TFCliNom_Sel ;
      AV177Cargasporseccion_wcds_4_tfbarfeccli = AV113TFBarFecCli ;
      AV178Cargasporseccion_wcds_5_tfbarfeccli_to = AV114TFBarFecCli_To ;
      AV179Cargasporseccion_wcds_6_tfpedidocliente = AV117TFPedidoCliente ;
      AV180Cargasporseccion_wcds_7_tfpedidocliente_sel = AV118TFPedidoCliente_Sel ;
      AV181Cargasporseccion_wcds_8_tfbarfecfpr = AV119TFBarFecFpr ;
      AV182Cargasporseccion_wcds_9_tfbarfecfpr_to = AV120TFBarFecFpr_To ;
      AV183Cargasporseccion_wcds_10_tfbarfecgen = AV123TFBarFecGen ;
      AV184Cargasporseccion_wcds_11_tfbarfecgen_to = AV124TFBarFecGen_To ;
      AV185Cargasporseccion_wcds_12_tfbarnhdr = AV127TFBarNHdr ;
      AV186Cargasporseccion_wcds_13_tfbarnhdr_sel = AV128TFBarNHdr_Sel ;
      AV187Cargasporseccion_wcds_14_tfbarser = AV129TFBarSer ;
      AV188Cargasporseccion_wcds_15_tfbarser_sel = AV130TFBarSer_Sel ;
      AV189Cargasporseccion_wcds_16_tfbarserdsc = AV131TFBarSerDsc ;
      AV190Cargasporseccion_wcds_17_tfbarserdsc_sel = AV132TFBarSerDsc_Sel ;
      AV191Cargasporseccion_wcds_18_tfbarcolnom = AV133TFBarColNom ;
      AV192Cargasporseccion_wcds_19_tfbarcolnom_sel = AV134TFBarColNom_Sel ;
      AV193Cargasporseccion_wcds_20_tfbarcolnum = AV135TFBarColNum ;
      AV194Cargasporseccion_wcds_21_tfbarcolnum_to = AV136TFBarColNum_To ;
      AV195Cargasporseccion_wcds_22_tfbartipcol = AV137TFBarTipCol ;
      AV196Cargasporseccion_wcds_23_tfbartipcol_to = AV138TFBarTipCol_To ;
      AV197Cargasporseccion_wcds_24_tfbarordlin = AV39TFBarOrdLin ;
      AV198Cargasporseccion_wcds_25_tfbarordlin_to = AV40TFBarOrdLin_To ;
      AV199Cargasporseccion_wcds_26_tfmaqcodbis = AV53TFMaqCodBis ;
      AV200Cargasporseccion_wcds_27_tfmaqcodbis_sel = AV54TFMaqCodBis_Sel ;
      AV201Cargasporseccion_wcds_28_tffascod = AV41TFFasCod ;
      AV202Cargasporseccion_wcds_29_tffascod_sel = AV42TFFasCod_Sel ;
      AV203Cargasporseccion_wcds_30_tffasdsc = AV139TFFasDsc ;
      AV204Cargasporseccion_wcds_31_tffasdsc_sel = AV140TFFasDsc_Sel ;
      AV205Cargasporseccion_wcds_32_tfbarfasest_sels = AV142TFBarFasEst_Sels ;
      AV206Cargasporseccion_wcds_33_tfbarmtr = AV143TFBarMtr ;
      AV207Cargasporseccion_wcds_34_tfbarmtr_to = AV144TFBarMtr_To ;
      AV208Cargasporseccion_wcds_35_tfbarkgm = AV145TFBarkgm ;
      AV209Cargasporseccion_wcds_36_tfbarkgm_to = AV146TFBarkgm_To ;
      AV210Cargasporseccion_wcds_37_tfbarpie = AV147TFBarPie ;
      AV211Cargasporseccion_wcds_38_tfbarpie_to = AV148TFBarPie_To ;
      AV212Cargasporseccion_wcds_39_tfbarfascod = AV149TFBarFasCod ;
      AV213Cargasporseccion_wcds_40_tfbarfascod_sel = AV150TFBarFasCod_Sel ;
      AV214Cargasporseccion_wcds_41_tfbarfeccum = AV151TFBarFecCum ;
      AV215Cargasporseccion_wcds_42_tfbarfeccum_to = AV152TFBarFecCum_To ;
      AV216Cargasporseccion_wcds_43_tfbarsit = AV155TFBarSit ;
      AV217Cargasporseccion_wcds_44_tfbarsit_to = AV156TFBarSit_To ;
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A457FasCod ,
                                           AV7FasesColeccion ,
                                           Byte.valueOf(A153BarFasEst) ,
                                           AV205Cargasporseccion_wcds_32_tfbarfasest_sels ,
                                           AV176Cargasporseccion_wcds_3_tfclinom_sel ,
                                           AV175Cargasporseccion_wcds_2_tfclinom ,
                                           AV177Cargasporseccion_wcds_4_tfbarfeccli ,
                                           AV178Cargasporseccion_wcds_5_tfbarfeccli_to ,
                                           AV181Cargasporseccion_wcds_8_tfbarfecfpr ,
                                           AV182Cargasporseccion_wcds_9_tfbarfecfpr_to ,
                                           AV183Cargasporseccion_wcds_10_tfbarfecgen ,
                                           AV184Cargasporseccion_wcds_11_tfbarfecgen_to ,
                                           AV186Cargasporseccion_wcds_13_tfbarnhdr_sel ,
                                           AV185Cargasporseccion_wcds_12_tfbarnhdr ,
                                           AV188Cargasporseccion_wcds_15_tfbarser_sel ,
                                           AV187Cargasporseccion_wcds_14_tfbarser ,
                                           AV190Cargasporseccion_wcds_17_tfbarserdsc_sel ,
                                           AV189Cargasporseccion_wcds_16_tfbarserdsc ,
                                           AV192Cargasporseccion_wcds_19_tfbarcolnom_sel ,
                                           AV191Cargasporseccion_wcds_18_tfbarcolnom ,
                                           Integer.valueOf(AV193Cargasporseccion_wcds_20_tfbarcolnum) ,
                                           Integer.valueOf(AV194Cargasporseccion_wcds_21_tfbarcolnum_to) ,
                                           Byte.valueOf(AV195Cargasporseccion_wcds_22_tfbartipcol) ,
                                           Byte.valueOf(AV196Cargasporseccion_wcds_23_tfbartipcol_to) ,
                                           Short.valueOf(AV197Cargasporseccion_wcds_24_tfbarordlin) ,
                                           Short.valueOf(AV198Cargasporseccion_wcds_25_tfbarordlin_to) ,
                                           AV200Cargasporseccion_wcds_27_tfmaqcodbis_sel ,
                                           AV199Cargasporseccion_wcds_26_tfmaqcodbis ,
                                           AV202Cargasporseccion_wcds_29_tffascod_sel ,
                                           AV201Cargasporseccion_wcds_28_tffascod ,
                                           AV204Cargasporseccion_wcds_31_tffasdsc_sel ,
                                           AV203Cargasporseccion_wcds_30_tffasdsc ,
                                           Integer.valueOf(AV205Cargasporseccion_wcds_32_tfbarfasest_sels.size()) ,
                                           AV206Cargasporseccion_wcds_33_tfbarmtr ,
                                           AV207Cargasporseccion_wcds_34_tfbarmtr_to ,
                                           AV208Cargasporseccion_wcds_35_tfbarkgm ,
                                           AV209Cargasporseccion_wcds_36_tfbarkgm_to ,
                                           Byte.valueOf(AV216Cargasporseccion_wcds_43_tfbarsit) ,
                                           Byte.valueOf(AV217Cargasporseccion_wcds_44_tfbarsit_to) ,
                                           A279CliNom ,
                                           A155BarFecCli ,
                                           A158BarFecFpr ,
                                           A159BarFecGen ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           Byte.valueOf(A218BarTipCol) ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A603MaqCodBis ,
                                           A460FasDsc ,
                                           A184BarMtr ,
                                           A166BarKgm ,
                                           Byte.valueOf(A213BarSit) ,
                                           Short.valueOf(AV15OrderedBy) ,
                                           Boolean.valueOf(AV16OrderedDsc) ,
                                           AV174Cargasporseccion_wcds_1_filterfulltext ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           Integer.valueOf(A198BarPie) ,
                                           A151BarFasCod ,
                                           AV180Cargasporseccion_wcds_7_tfpedidocliente_sel ,
                                           AV179Cargasporseccion_wcds_6_tfpedidocliente ,
                                           Integer.valueOf(AV210Cargasporseccion_wcds_37_tfbarpie) ,
                                           Integer.valueOf(AV211Cargasporseccion_wcds_38_tfbarpie_to) ,
                                           AV213Cargasporseccion_wcds_40_tfbarfascod_sel ,
                                           AV212Cargasporseccion_wcds_39_tfbarfascod ,
                                           AV214Cargasporseccion_wcds_41_tfbarfeccum ,
                                           A156BarFecCum ,
                                           AV215Cargasporseccion_wcds_42_tfbarfeccum_to ,
                                           AV6MaqcodInout ,
                                           Integer.valueOf(AV7FasesColeccion.size()) ,
                                           Short.valueOf(A13889FaseAnteri) ,
                                           AV171TipoControl ,
                                           Integer.valueOf(AV170Barcod) ,
                                           Byte.valueOf(AV169Barcodreo) ,
                                           AV168Barcodpar ,
                                           AV5Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV212Cargasporseccion_wcds_39_tfbarfascod = GXutil.padr( GXutil.rtrim( AV212Cargasporseccion_wcds_39_tfbarfascod), 8, "%") ;
      lV6MaqcodInout = GXutil.padr( GXutil.rtrim( AV6MaqcodInout), 6, "%") ;
      lV175Cargasporseccion_wcds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV175Cargasporseccion_wcds_2_tfclinom), 30, "%") ;
      lV185Cargasporseccion_wcds_12_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV185Cargasporseccion_wcds_12_tfbarnhdr), 11, "%") ;
      lV187Cargasporseccion_wcds_14_tfbarser = GXutil.padr( GXutil.rtrim( AV187Cargasporseccion_wcds_14_tfbarser), 16, "%") ;
      lV189Cargasporseccion_wcds_16_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV189Cargasporseccion_wcds_16_tfbarserdsc), 26, "%") ;
      lV191Cargasporseccion_wcds_18_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV191Cargasporseccion_wcds_18_tfbarcolnom), 13, "%") ;
      lV199Cargasporseccion_wcds_26_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV199Cargasporseccion_wcds_26_tfmaqcodbis), 6, "%") ;
      lV201Cargasporseccion_wcds_28_tffascod = GXutil.padr( GXutil.rtrim( AV201Cargasporseccion_wcds_28_tffascod), 8, "%") ;
      lV203Cargasporseccion_wcds_30_tffasdsc = GXutil.padr( GXutil.rtrim( AV203Cargasporseccion_wcds_30_tffasdsc), 28, "%") ;
      /* Using cursor H01F99 */
      pr_default.execute(0, new Object[] {AV5Emprcod, AV213Cargasporseccion_wcds_40_tfbarfascod_sel, AV212Cargasporseccion_wcds_39_tfbarfascod, lV212Cargasporseccion_wcds_39_tfbarfascod, AV213Cargasporseccion_wcds_40_tfbarfascod_sel, AV213Cargasporseccion_wcds_40_tfbarfascod_sel, AV214Cargasporseccion_wcds_41_tfbarfeccum, AV214Cargasporseccion_wcds_41_tfbarfeccum, AV215Cargasporseccion_wcds_42_tfbarfeccum_to, AV215Cargasporseccion_wcds_42_tfbarfeccum_to, lV6MaqcodInout, Integer.valueOf(AV7FasesColeccion.size()), Integer.valueOf(AV170Barcod), Integer.valueOf(AV170Barcod), Byte.valueOf(AV169Barcodreo), Byte.valueOf(AV169Barcodreo), AV168Barcodpar, AV168Barcodpar, lV175Cargasporseccion_wcds_2_tfclinom, AV176Cargasporseccion_wcds_3_tfclinom_sel, AV177Cargasporseccion_wcds_4_tfbarfeccli, AV178Cargasporseccion_wcds_5_tfbarfeccli_to, AV181Cargasporseccion_wcds_8_tfbarfecfpr, AV182Cargasporseccion_wcds_9_tfbarfecfpr_to, AV183Cargasporseccion_wcds_10_tfbarfecgen, AV184Cargasporseccion_wcds_11_tfbarfecgen_to, lV185Cargasporseccion_wcds_12_tfbarnhdr, AV186Cargasporseccion_wcds_13_tfbarnhdr_sel, lV187Cargasporseccion_wcds_14_tfbarser, AV188Cargasporseccion_wcds_15_tfbarser_sel, lV189Cargasporseccion_wcds_16_tfbarserdsc, AV190Cargasporseccion_wcds_17_tfbarserdsc_sel, lV191Cargasporseccion_wcds_18_tfbarcolnom, AV192Cargasporseccion_wcds_19_tfbarcolnom_sel, Integer.valueOf(AV193Cargasporseccion_wcds_20_tfbarcolnum), Integer.valueOf(AV194Cargasporseccion_wcds_21_tfbarcolnum_to), Byte.valueOf(AV195Cargasporseccion_wcds_22_tfbartipcol), Byte.valueOf(AV196Cargasporseccion_wcds_23_tfbartipcol_to), Short.valueOf(AV197Cargasporseccion_wcds_24_tfbarordlin), Short.valueOf(AV198Cargasporseccion_wcds_25_tfbarordlin_to), lV199Cargasporseccion_wcds_26_tfmaqcodbis, AV200Cargasporseccion_wcds_27_tfmaqcodbis_sel, lV201Cargasporseccion_wcds_28_tffascod, AV202Cargasporseccion_wcds_29_tffascod_sel, lV203Cargasporseccion_wcds_30_tffasdsc, AV204Cargasporseccion_wcds_31_tffasdsc_sel, AV206Cargasporseccion_wcds_33_tfbarmtr, AV207Cargasporseccion_wcds_34_tfbarmtr_to, AV208Cargasporseccion_wcds_35_tfbarkgm, AV209Cargasporseccion_wcds_36_tfbarkgm_to, Byte.valueOf(AV216Cargasporseccion_wcds_43_tfbarsit), Byte.valueOf(AV217Cargasporseccion_wcds_44_tfbarsit_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = H01F99_A252CliCod[0] ;
         n252CliCod = H01F99_n252CliCod[0] ;
         A213BarSit = H01F99_A213BarSit[0] ;
         A153BarFasEst = H01F99_A153BarFasEst[0] ;
         A460FasDsc = H01F99_A460FasDsc[0] ;
         A457FasCod = H01F99_A457FasCod[0] ;
         A603MaqCodBis = H01F99_A603MaqCodBis[0] ;
         A218BarTipCol = H01F99_A218BarTipCol[0] ;
         A136BarColNum = H01F99_A136BarColNum[0] ;
         A135BarColNom = H01F99_A135BarColNom[0] ;
         A1652BarSerDsc = H01F99_A1652BarSerDsc[0] ;
         A212BarSer = H01F99_A212BarSer[0] ;
         A13696BarNHdr = H01F99_A13696BarNHdr[0] ;
         A159BarFecGen = H01F99_A159BarFecGen[0] ;
         A158BarFecFpr = H01F99_A158BarFecFpr[0] ;
         A155BarFecCli = H01F99_A155BarFecCli[0] ;
         A279CliNom = H01F99_A279CliNom[0] ;
         A156BarFecCum = H01F99_A156BarFecCum[0] ;
         n156BarFecCum = H01F99_n156BarFecCum[0] ;
         A151BarFasCod = H01F99_A151BarFasCod[0] ;
         n151BarFasCod = H01F99_n151BarFasCod[0] ;
         A166BarKgm = H01F99_A166BarKgm[0] ;
         A184BarMtr = H01F99_A184BarMtr[0] ;
         A143BarDisNum = H01F99_A143BarDisNum[0] ;
         A4812BarEncCli = H01F99_A4812BarEncCli[0] ;
         A199BarPie1 = H01F99_A199BarPie1[0] ;
         A365DisDes = H01F99_A365DisDes[0] ;
         A898BarPieNDes = H01F99_A898BarPieNDes[0] ;
         A194BarOrdLin = H01F99_A194BarOrdLin[0] ;
         A130BarCodPar = H01F99_A130BarCodPar[0] ;
         A132BarCodReo = H01F99_A132BarCodReo[0] ;
         A129BarCod = H01F99_A129BarCod[0] ;
         A396EmprCod = H01F99_A396EmprCod[0] ;
         A460FasDsc = H01F99_A460FasDsc[0] ;
         A252CliCod = H01F99_A252CliCod[0] ;
         n252CliCod = H01F99_n252CliCod[0] ;
         A213BarSit = H01F99_A213BarSit[0] ;
         A218BarTipCol = H01F99_A218BarTipCol[0] ;
         A136BarColNum = H01F99_A136BarColNum[0] ;
         A135BarColNom = H01F99_A135BarColNom[0] ;
         A1652BarSerDsc = H01F99_A1652BarSerDsc[0] ;
         A212BarSer = H01F99_A212BarSer[0] ;
         A13696BarNHdr = H01F99_A13696BarNHdr[0] ;
         A159BarFecGen = H01F99_A159BarFecGen[0] ;
         A158BarFecFpr = H01F99_A158BarFecFpr[0] ;
         A155BarFecCli = H01F99_A155BarFecCli[0] ;
         A143BarDisNum = H01F99_A143BarDisNum[0] ;
         A4812BarEncCli = H01F99_A4812BarEncCli[0] ;
         A365DisDes = H01F99_A365DisDes[0] ;
         A279CliNom = H01F99_A279CliNom[0] ;
         A156BarFecCum = H01F99_A156BarFecCum[0] ;
         n156BarFecCum = H01F99_n156BarFecCum[0] ;
         A151BarFasCod = H01F99_A151BarFasCod[0] ;
         n151BarFasCod = H01F99_n151BarFasCod[0] ;
         A166BarKgm = H01F99_A166BarKgm[0] ;
         A184BarMtr = H01F99_A184BarMtr[0] ;
         A199BarPie1 = H01F99_A199BarPie1[0] ;
         A898BarPieNDes = H01F99_A898BarPieNDes[0] ;
         GXt_char1 = A13878PedidoClie ;
         GXv_char2[0] = A396EmprCod ;
         GXv_char3[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char5[0] = GXt_char1 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_char4, GXv_char5) ;
         cargasporseccion_wc_impl.this.A396EmprCod = GXv_char2[0] ;
         cargasporseccion_wc_impl.this.A4812BarEncCli = GXv_char3[0] ;
         cargasporseccion_wc_impl.this.A143BarDisNum = GXv_char4[0] ;
         cargasporseccion_wc_impl.this.GXt_char1 = GXv_char5[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4812BarEncCli", A4812BarEncCli);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A143BarDisNum", A143BarDisNum);
         A13878PedidoClie = GXt_char1 ;
         if ( ! ( (GXutil.strcmp("", AV180Cargasporseccion_wcds_7_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV179Cargasporseccion_wcds_6_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV179Cargasporseccion_wcds_6_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV180Cargasporseccion_wcds_7_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV180Cargasporseccion_wcds_7_tfpedidocliente_sel) == 0 ) ) )
            {
               GXt_int6 = A13889FaseAnteri ;
               GXv_char5[0] = A396EmprCod ;
               GXv_int7[0] = A129BarCod ;
               GXv_int8[0] = A132BarCodReo ;
               GXv_char4[0] = A130BarCodPar ;
               GXv_int9[0] = A194BarOrdLin ;
               GXv_int10[0] = GXt_int6 ;
               new app.core.faseanteriorcontrol_prc(remoteHandle, context).execute( GXv_char5, GXv_int7, GXv_int8, GXv_char4, GXv_int9, GXv_int10) ;
               cargasporseccion_wc_impl.this.A396EmprCod = GXv_char5[0] ;
               cargasporseccion_wc_impl.this.A129BarCod = GXv_int7[0] ;
               cargasporseccion_wc_impl.this.A132BarCodReo = GXv_int8[0] ;
               cargasporseccion_wc_impl.this.A130BarCodPar = GXv_char4[0] ;
               cargasporseccion_wc_impl.this.A194BarOrdLin = GXv_int9[0] ;
               cargasporseccion_wc_impl.this.GXt_int6 = GXv_int10[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A130BarCodPar", A130BarCodPar);
               A13889FaseAnteri = GXt_int6 ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13889FaseAnteri", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13889FaseAnteri), 4, 0));
               if ( ( ( A13889FaseAnteri == 2 ) && ( GXutil.strcmp(AV171TipoControl, "D") == 0 ) ) || ( ( A13889FaseAnteri != 2 ) && ( GXutil.strcmp(AV171TipoControl, "G") == 0 ) ) )
               {
                  if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                  {
                     A198BarPie = A898BarPieNDes ;
                  }
                  else
                  {
                     A198BarPie = A199BarPie1 ;
                  }
                  if ( (GXutil.strcmp("", AV174Cargasporseccion_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV174Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV174Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV174Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV174Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV174Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV174Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV174Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A218BarTipCol, 2, 0) , GXutil.padr( "%" + AV174Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A194BarOrdLin, 4, 0) , GXutil.padr( "%" + AV174Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A603MaqCodBis) , GXutil.padr( "%" + GXutil.upper( AV174Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A457FasCod) , GXutil.padr( "%" + GXutil.upper( AV174Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A460FasDsc) , GXutil.padr( "%" + GXutil.upper( AV174Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A153BarFasEst, 1, 0) , GXutil.padr( "%" + AV174Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A184BarMtr, 9, 2) , GXutil.padr( "%" + AV174Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV174Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A198BarPie, 6, 0) , GXutil.padr( "%" + AV174Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A151BarFasCod) , GXutil.padr( "%" + GXutil.upper( AV174Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV174Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
                  {
                     if ( (0==AV210Cargasporseccion_wcds_37_tfbarpie) || ( ( A198BarPie >= AV210Cargasporseccion_wcds_37_tfbarpie ) ) )
                     {
                        if ( (0==AV211Cargasporseccion_wcds_38_tfbarpie_to) || ( ( A198BarPie <= AV211Cargasporseccion_wcds_38_tfbarpie_to ) ) )
                        {
                           GRID_nRecordCount = (long)(GRID_nRecordCount+1) ;
                        }
                     }
                  }
               }
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      return (int)(GRID_nRecordCount) ;
   }

   public void rf1F92( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(39) ;
      /* Execute user event: Refresh */
      e131F92 ();
      nGXsfl_39_idx = 1 ;
      sGXsfl_39_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_392( ) ;
      bGXsfl_39_Refreshing = true ;
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
         subsflControlProps_392( ) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              A457FasCod ,
                                              AV7FasesColeccion ,
                                              Byte.valueOf(A153BarFasEst) ,
                                              AV205Cargasporseccion_wcds_32_tfbarfasest_sels ,
                                              AV176Cargasporseccion_wcds_3_tfclinom_sel ,
                                              AV175Cargasporseccion_wcds_2_tfclinom ,
                                              AV177Cargasporseccion_wcds_4_tfbarfeccli ,
                                              AV178Cargasporseccion_wcds_5_tfbarfeccli_to ,
                                              AV181Cargasporseccion_wcds_8_tfbarfecfpr ,
                                              AV182Cargasporseccion_wcds_9_tfbarfecfpr_to ,
                                              AV183Cargasporseccion_wcds_10_tfbarfecgen ,
                                              AV184Cargasporseccion_wcds_11_tfbarfecgen_to ,
                                              AV186Cargasporseccion_wcds_13_tfbarnhdr_sel ,
                                              AV185Cargasporseccion_wcds_12_tfbarnhdr ,
                                              AV188Cargasporseccion_wcds_15_tfbarser_sel ,
                                              AV187Cargasporseccion_wcds_14_tfbarser ,
                                              AV190Cargasporseccion_wcds_17_tfbarserdsc_sel ,
                                              AV189Cargasporseccion_wcds_16_tfbarserdsc ,
                                              AV192Cargasporseccion_wcds_19_tfbarcolnom_sel ,
                                              AV191Cargasporseccion_wcds_18_tfbarcolnom ,
                                              Integer.valueOf(AV193Cargasporseccion_wcds_20_tfbarcolnum) ,
                                              Integer.valueOf(AV194Cargasporseccion_wcds_21_tfbarcolnum_to) ,
                                              Byte.valueOf(AV195Cargasporseccion_wcds_22_tfbartipcol) ,
                                              Byte.valueOf(AV196Cargasporseccion_wcds_23_tfbartipcol_to) ,
                                              Short.valueOf(AV197Cargasporseccion_wcds_24_tfbarordlin) ,
                                              Short.valueOf(AV198Cargasporseccion_wcds_25_tfbarordlin_to) ,
                                              AV200Cargasporseccion_wcds_27_tfmaqcodbis_sel ,
                                              AV199Cargasporseccion_wcds_26_tfmaqcodbis ,
                                              AV202Cargasporseccion_wcds_29_tffascod_sel ,
                                              AV201Cargasporseccion_wcds_28_tffascod ,
                                              AV204Cargasporseccion_wcds_31_tffasdsc_sel ,
                                              AV203Cargasporseccion_wcds_30_tffasdsc ,
                                              Integer.valueOf(AV205Cargasporseccion_wcds_32_tfbarfasest_sels.size()) ,
                                              AV206Cargasporseccion_wcds_33_tfbarmtr ,
                                              AV207Cargasporseccion_wcds_34_tfbarmtr_to ,
                                              AV208Cargasporseccion_wcds_35_tfbarkgm ,
                                              AV209Cargasporseccion_wcds_36_tfbarkgm_to ,
                                              Byte.valueOf(AV216Cargasporseccion_wcds_43_tfbarsit) ,
                                              Byte.valueOf(AV217Cargasporseccion_wcds_44_tfbarsit_to) ,
                                              A279CliNom ,
                                              A155BarFecCli ,
                                              A158BarFecFpr ,
                                              A159BarFecGen ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar ,
                                              A212BarSer ,
                                              A1652BarSerDsc ,
                                              A135BarColNom ,
                                              Integer.valueOf(A136BarColNum) ,
                                              Byte.valueOf(A218BarTipCol) ,
                                              Short.valueOf(A194BarOrdLin) ,
                                              A603MaqCodBis ,
                                              A460FasDsc ,
                                              A184BarMtr ,
                                              A166BarKgm ,
                                              Byte.valueOf(A213BarSit) ,
                                              Short.valueOf(AV15OrderedBy) ,
                                              Boolean.valueOf(AV16OrderedDsc) ,
                                              AV174Cargasporseccion_wcds_1_filterfulltext ,
                                              A13878PedidoClie ,
                                              A13696BarNHdr ,
                                              Integer.valueOf(A198BarPie) ,
                                              A151BarFasCod ,
                                              AV180Cargasporseccion_wcds_7_tfpedidocliente_sel ,
                                              AV179Cargasporseccion_wcds_6_tfpedidocliente ,
                                              Integer.valueOf(AV210Cargasporseccion_wcds_37_tfbarpie) ,
                                              Integer.valueOf(AV211Cargasporseccion_wcds_38_tfbarpie_to) ,
                                              AV213Cargasporseccion_wcds_40_tfbarfascod_sel ,
                                              AV212Cargasporseccion_wcds_39_tfbarfascod ,
                                              AV214Cargasporseccion_wcds_41_tfbarfeccum ,
                                              A156BarFecCum ,
                                              AV215Cargasporseccion_wcds_42_tfbarfeccum_to ,
                                              AV6MaqcodInout ,
                                              Integer.valueOf(AV7FasesColeccion.size()) ,
                                              Short.valueOf(A13889FaseAnteri) ,
                                              AV171TipoControl ,
                                              Integer.valueOf(AV170Barcod) ,
                                              Byte.valueOf(AV169Barcodreo) ,
                                              AV168Barcodpar ,
                                              AV5Emprcod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                              TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.SHORT,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                              TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV212Cargasporseccion_wcds_39_tfbarfascod = GXutil.padr( GXutil.rtrim( AV212Cargasporseccion_wcds_39_tfbarfascod), 8, "%") ;
         lV6MaqcodInout = GXutil.padr( GXutil.rtrim( AV6MaqcodInout), 6, "%") ;
         lV175Cargasporseccion_wcds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV175Cargasporseccion_wcds_2_tfclinom), 30, "%") ;
         lV185Cargasporseccion_wcds_12_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV185Cargasporseccion_wcds_12_tfbarnhdr), 11, "%") ;
         lV187Cargasporseccion_wcds_14_tfbarser = GXutil.padr( GXutil.rtrim( AV187Cargasporseccion_wcds_14_tfbarser), 16, "%") ;
         lV189Cargasporseccion_wcds_16_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV189Cargasporseccion_wcds_16_tfbarserdsc), 26, "%") ;
         lV191Cargasporseccion_wcds_18_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV191Cargasporseccion_wcds_18_tfbarcolnom), 13, "%") ;
         lV199Cargasporseccion_wcds_26_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV199Cargasporseccion_wcds_26_tfmaqcodbis), 6, "%") ;
         lV201Cargasporseccion_wcds_28_tffascod = GXutil.padr( GXutil.rtrim( AV201Cargasporseccion_wcds_28_tffascod), 8, "%") ;
         lV203Cargasporseccion_wcds_30_tffasdsc = GXutil.padr( GXutil.rtrim( AV203Cargasporseccion_wcds_30_tffasdsc), 28, "%") ;
         /* Using cursor H01F917 */
         pr_default.execute(1, new Object[] {AV5Emprcod, AV213Cargasporseccion_wcds_40_tfbarfascod_sel, AV212Cargasporseccion_wcds_39_tfbarfascod, lV212Cargasporseccion_wcds_39_tfbarfascod, AV213Cargasporseccion_wcds_40_tfbarfascod_sel, AV213Cargasporseccion_wcds_40_tfbarfascod_sel, AV214Cargasporseccion_wcds_41_tfbarfeccum, AV214Cargasporseccion_wcds_41_tfbarfeccum, AV215Cargasporseccion_wcds_42_tfbarfeccum_to, AV215Cargasporseccion_wcds_42_tfbarfeccum_to, lV6MaqcodInout, Integer.valueOf(AV7FasesColeccion.size()), Integer.valueOf(AV170Barcod), Integer.valueOf(AV170Barcod), Byte.valueOf(AV169Barcodreo), Byte.valueOf(AV169Barcodreo), AV168Barcodpar, AV168Barcodpar, lV175Cargasporseccion_wcds_2_tfclinom, AV176Cargasporseccion_wcds_3_tfclinom_sel, AV177Cargasporseccion_wcds_4_tfbarfeccli, AV178Cargasporseccion_wcds_5_tfbarfeccli_to, AV181Cargasporseccion_wcds_8_tfbarfecfpr, AV182Cargasporseccion_wcds_9_tfbarfecfpr_to, AV183Cargasporseccion_wcds_10_tfbarfecgen, AV184Cargasporseccion_wcds_11_tfbarfecgen_to, lV185Cargasporseccion_wcds_12_tfbarnhdr, AV186Cargasporseccion_wcds_13_tfbarnhdr_sel, lV187Cargasporseccion_wcds_14_tfbarser, AV188Cargasporseccion_wcds_15_tfbarser_sel, lV189Cargasporseccion_wcds_16_tfbarserdsc, AV190Cargasporseccion_wcds_17_tfbarserdsc_sel, lV191Cargasporseccion_wcds_18_tfbarcolnom, AV192Cargasporseccion_wcds_19_tfbarcolnom_sel, Integer.valueOf(AV193Cargasporseccion_wcds_20_tfbarcolnum), Integer.valueOf(AV194Cargasporseccion_wcds_21_tfbarcolnum_to), Byte.valueOf(AV195Cargasporseccion_wcds_22_tfbartipcol), Byte.valueOf(AV196Cargasporseccion_wcds_23_tfbartipcol_to), Short.valueOf(AV197Cargasporseccion_wcds_24_tfbarordlin), Short.valueOf(AV198Cargasporseccion_wcds_25_tfbarordlin_to), lV199Cargasporseccion_wcds_26_tfmaqcodbis, AV200Cargasporseccion_wcds_27_tfmaqcodbis_sel, lV201Cargasporseccion_wcds_28_tffascod, AV202Cargasporseccion_wcds_29_tffascod_sel, lV203Cargasporseccion_wcds_30_tffasdsc, AV204Cargasporseccion_wcds_31_tffasdsc_sel, AV206Cargasporseccion_wcds_33_tfbarmtr, AV207Cargasporseccion_wcds_34_tfbarmtr_to, AV208Cargasporseccion_wcds_35_tfbarkgm, AV209Cargasporseccion_wcds_36_tfbarkgm_to, Byte.valueOf(AV216Cargasporseccion_wcds_43_tfbarsit), Byte.valueOf(AV217Cargasporseccion_wcds_44_tfbarsit_to)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A252CliCod = H01F917_A252CliCod[0] ;
            n252CliCod = H01F917_n252CliCod[0] ;
            A213BarSit = H01F917_A213BarSit[0] ;
            A153BarFasEst = H01F917_A153BarFasEst[0] ;
            A460FasDsc = H01F917_A460FasDsc[0] ;
            A457FasCod = H01F917_A457FasCod[0] ;
            A603MaqCodBis = H01F917_A603MaqCodBis[0] ;
            A218BarTipCol = H01F917_A218BarTipCol[0] ;
            A136BarColNum = H01F917_A136BarColNum[0] ;
            A135BarColNom = H01F917_A135BarColNom[0] ;
            A1652BarSerDsc = H01F917_A1652BarSerDsc[0] ;
            A212BarSer = H01F917_A212BarSer[0] ;
            A13696BarNHdr = H01F917_A13696BarNHdr[0] ;
            A159BarFecGen = H01F917_A159BarFecGen[0] ;
            A158BarFecFpr = H01F917_A158BarFecFpr[0] ;
            A155BarFecCli = H01F917_A155BarFecCli[0] ;
            A279CliNom = H01F917_A279CliNom[0] ;
            A156BarFecCum = H01F917_A156BarFecCum[0] ;
            n156BarFecCum = H01F917_n156BarFecCum[0] ;
            A151BarFasCod = H01F917_A151BarFasCod[0] ;
            n151BarFasCod = H01F917_n151BarFasCod[0] ;
            A166BarKgm = H01F917_A166BarKgm[0] ;
            A184BarMtr = H01F917_A184BarMtr[0] ;
            A143BarDisNum = H01F917_A143BarDisNum[0] ;
            A4812BarEncCli = H01F917_A4812BarEncCli[0] ;
            A199BarPie1 = H01F917_A199BarPie1[0] ;
            A365DisDes = H01F917_A365DisDes[0] ;
            A898BarPieNDes = H01F917_A898BarPieNDes[0] ;
            A194BarOrdLin = H01F917_A194BarOrdLin[0] ;
            A130BarCodPar = H01F917_A130BarCodPar[0] ;
            A132BarCodReo = H01F917_A132BarCodReo[0] ;
            A129BarCod = H01F917_A129BarCod[0] ;
            A396EmprCod = H01F917_A396EmprCod[0] ;
            A460FasDsc = H01F917_A460FasDsc[0] ;
            A252CliCod = H01F917_A252CliCod[0] ;
            n252CliCod = H01F917_n252CliCod[0] ;
            A213BarSit = H01F917_A213BarSit[0] ;
            A218BarTipCol = H01F917_A218BarTipCol[0] ;
            A136BarColNum = H01F917_A136BarColNum[0] ;
            A135BarColNom = H01F917_A135BarColNom[0] ;
            A1652BarSerDsc = H01F917_A1652BarSerDsc[0] ;
            A212BarSer = H01F917_A212BarSer[0] ;
            A13696BarNHdr = H01F917_A13696BarNHdr[0] ;
            A159BarFecGen = H01F917_A159BarFecGen[0] ;
            A158BarFecFpr = H01F917_A158BarFecFpr[0] ;
            A155BarFecCli = H01F917_A155BarFecCli[0] ;
            A143BarDisNum = H01F917_A143BarDisNum[0] ;
            A4812BarEncCli = H01F917_A4812BarEncCli[0] ;
            A365DisDes = H01F917_A365DisDes[0] ;
            A279CliNom = H01F917_A279CliNom[0] ;
            A156BarFecCum = H01F917_A156BarFecCum[0] ;
            n156BarFecCum = H01F917_n156BarFecCum[0] ;
            A151BarFasCod = H01F917_A151BarFasCod[0] ;
            n151BarFasCod = H01F917_n151BarFasCod[0] ;
            A166BarKgm = H01F917_A166BarKgm[0] ;
            A184BarMtr = H01F917_A184BarMtr[0] ;
            A199BarPie1 = H01F917_A199BarPie1[0] ;
            A898BarPieNDes = H01F917_A898BarPieNDes[0] ;
            GXt_char1 = A13878PedidoClie ;
            GXv_char5[0] = A396EmprCod ;
            GXv_char4[0] = A4812BarEncCli ;
            GXv_char3[0] = A143BarDisNum ;
            GXv_char2[0] = GXt_char1 ;
            new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_char3, GXv_char2) ;
            cargasporseccion_wc_impl.this.A396EmprCod = GXv_char5[0] ;
            cargasporseccion_wc_impl.this.A4812BarEncCli = GXv_char4[0] ;
            cargasporseccion_wc_impl.this.A143BarDisNum = GXv_char3[0] ;
            cargasporseccion_wc_impl.this.GXt_char1 = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4812BarEncCli", A4812BarEncCli);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A143BarDisNum", A143BarDisNum);
            A13878PedidoClie = GXt_char1 ;
            if ( ! ( (GXutil.strcmp("", AV180Cargasporseccion_wcds_7_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV179Cargasporseccion_wcds_6_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV179Cargasporseccion_wcds_6_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV180Cargasporseccion_wcds_7_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV180Cargasporseccion_wcds_7_tfpedidocliente_sel) == 0 ) ) )
               {
                  GXt_int6 = A13889FaseAnteri ;
                  GXv_char5[0] = A396EmprCod ;
                  GXv_int7[0] = A129BarCod ;
                  GXv_int8[0] = A132BarCodReo ;
                  GXv_char4[0] = A130BarCodPar ;
                  GXv_int10[0] = A194BarOrdLin ;
                  GXv_int9[0] = GXt_int6 ;
                  new app.core.faseanteriorcontrol_prc(remoteHandle, context).execute( GXv_char5, GXv_int7, GXv_int8, GXv_char4, GXv_int10, GXv_int9) ;
                  cargasporseccion_wc_impl.this.A396EmprCod = GXv_char5[0] ;
                  cargasporseccion_wc_impl.this.A129BarCod = GXv_int7[0] ;
                  cargasporseccion_wc_impl.this.A132BarCodReo = GXv_int8[0] ;
                  cargasporseccion_wc_impl.this.A130BarCodPar = GXv_char4[0] ;
                  cargasporseccion_wc_impl.this.A194BarOrdLin = GXv_int10[0] ;
                  cargasporseccion_wc_impl.this.GXt_int6 = GXv_int9[0] ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "A130BarCodPar", A130BarCodPar);
                  A13889FaseAnteri = GXt_int6 ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13889FaseAnteri", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13889FaseAnteri), 4, 0));
                  if ( ( ( A13889FaseAnteri == 2 ) && ( GXutil.strcmp(AV171TipoControl, "D") == 0 ) ) || ( ( A13889FaseAnteri != 2 ) && ( GXutil.strcmp(AV171TipoControl, "G") == 0 ) ) )
                  {
                     if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                     {
                        A198BarPie = A898BarPieNDes ;
                     }
                     else
                     {
                        A198BarPie = A199BarPie1 ;
                     }
                     if ( (GXutil.strcmp("", AV174Cargasporseccion_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV174Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV174Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV174Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV174Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV174Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV174Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV174Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A218BarTipCol, 2, 0) , GXutil.padr( "%" + AV174Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A194BarOrdLin, 4, 0) , GXutil.padr( "%" + AV174Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A603MaqCodBis) , GXutil.padr( "%" + GXutil.upper( AV174Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A457FasCod) , GXutil.padr( "%" + GXutil.upper( AV174Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A460FasDsc) , GXutil.padr( "%" + GXutil.upper( AV174Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A153BarFasEst, 1, 0) , GXutil.padr( "%" + AV174Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A184BarMtr, 9, 2) , GXutil.padr( "%" + AV174Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV174Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A198BarPie, 6, 0) , GXutil.padr( "%" + AV174Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A151BarFasCod) , GXutil.padr( "%" + GXutil.upper( AV174Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV174Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
                     {
                        if ( (0==AV210Cargasporseccion_wcds_37_tfbarpie) || ( ( A198BarPie >= AV210Cargasporseccion_wcds_37_tfbarpie ) ) )
                        {
                           if ( (0==AV211Cargasporseccion_wcds_38_tfbarpie_to) || ( ( A198BarPie <= AV211Cargasporseccion_wcds_38_tfbarpie_to ) ) )
                           {
                              e141F92 ();
                           }
                        }
                     }
                  }
               }
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         wbEnd = (short)(39) ;
         wb1F90( ) ;
      }
      bGXsfl_39_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1F92( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM", GXutil.rtrim( AV111TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFCLINOM", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV111TFCliNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM_SEL", GXutil.rtrim( AV112TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFCLINOM_SEL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV112TFCliNom_Sel, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFECCLI", localUtil.dtoc( AV113TFBarFecCli, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARFECCLI", getSecureSignedToken( sPrefix, AV113TFBarFecCli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFECCLI_TO", localUtil.dtoc( AV114TFBarFecCli_To, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARFECCLI_TO", getSecureSignedToken( sPrefix, AV114TFBarFecCli_To));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPEDIDOCLIENTE", GXutil.rtrim( AV117TFPedidoCliente));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFPEDIDOCLIENTE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV117TFPedidoCliente, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPEDIDOCLIENTE_SEL", GXutil.rtrim( AV118TFPedidoCliente_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFPEDIDOCLIENTE_SEL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV118TFPedidoCliente_Sel, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFECFPR", localUtil.dtoc( AV119TFBarFecFpr, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARFECFPR", getSecureSignedToken( sPrefix, AV119TFBarFecFpr));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFECFPR_TO", localUtil.dtoc( AV120TFBarFecFpr_To, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARFECFPR_TO", getSecureSignedToken( sPrefix, AV120TFBarFecFpr_To));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFECGEN", localUtil.dtoc( AV123TFBarFecGen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARFECGEN", getSecureSignedToken( sPrefix, AV123TFBarFecGen));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFECGEN_TO", localUtil.dtoc( AV124TFBarFecGen_To, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARFECGEN_TO", getSecureSignedToken( sPrefix, AV124TFBarFecGen_To));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNHDR", GXutil.rtrim( AV127TFBarNHdr));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARNHDR", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV127TFBarNHdr, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNHDR_SEL", GXutil.rtrim( AV128TFBarNHdr_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARNHDR_SEL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV128TFBarNHdr_Sel, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSER", GXutil.rtrim( AV129TFBarSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARSER", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV129TFBarSer, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSER_SEL", GXutil.rtrim( AV130TFBarSer_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARSER_SEL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV130TFBarSer_Sel, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSERDSC", GXutil.rtrim( AV131TFBarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARSERDSC", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV131TFBarSerDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSERDSC_SEL", GXutil.rtrim( AV132TFBarSerDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARSERDSC_SEL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV132TFBarSerDsc_Sel, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNOM", GXutil.rtrim( AV133TFBarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARCOLNOM", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV133TFBarColNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNOM_SEL", GXutil.rtrim( AV134TFBarColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARCOLNOM_SEL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV134TFBarColNom_Sel, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNUM", GXutil.ltrim( localUtil.ntoc( AV135TFBarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARCOLNUM", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV135TFBarColNum), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV136TFBarColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARCOLNUM_TO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV136TFBarColNum_To), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARTIPCOL", GXutil.ltrim( localUtil.ntoc( AV137TFBarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARTIPCOL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV137TFBarTipCol), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARTIPCOL_TO", GXutil.ltrim( localUtil.ntoc( AV138TFBarTipCol_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARTIPCOL_TO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV138TFBarTipCol_To), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARORDLIN", GXutil.ltrim( localUtil.ntoc( AV39TFBarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARORDLIN", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV39TFBarOrdLin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARORDLIN_TO", GXutil.ltrim( localUtil.ntoc( AV40TFBarOrdLin_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARORDLIN_TO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV40TFBarOrdLin_To), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMAQCODBIS", GXutil.rtrim( AV53TFMaqCodBis));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFMAQCODBIS", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV53TFMaqCodBis, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMAQCODBIS_SEL", GXutil.rtrim( AV54TFMaqCodBis_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFMAQCODBIS_SEL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV54TFMaqCodBis_Sel, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASCOD", GXutil.rtrim( AV41TFFasCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFFASCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV41TFFasCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASCOD_SEL", GXutil.rtrim( AV42TFFasCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFFASCOD_SEL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV42TFFasCod_Sel, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASDSC", GXutil.rtrim( AV139TFFasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFFASDSC", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV139TFFasDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASDSC_SEL", GXutil.rtrim( AV140TFFasDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFFASDSC_SEL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV140TFFasDsc_Sel, ""))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vTFBARFASEST_SELS", AV142TFBarFasEst_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vTFBARFASEST_SELS", AV142TFBarFasEst_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARFASEST_SELS", getSecureSignedToken( sPrefix, AV142TFBarFasEst_Sels));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARMTR", GXutil.ltrim( localUtil.ntoc( AV143TFBarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARMTR", getSecureSignedToken( sPrefix, localUtil.format( AV143TFBarMtr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARMTR_TO", GXutil.ltrim( localUtil.ntoc( AV144TFBarMtr_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARMTR_TO", getSecureSignedToken( sPrefix, localUtil.format( AV144TFBarMtr_To, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARKGM", GXutil.ltrim( localUtil.ntoc( AV145TFBarkgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARKGM", getSecureSignedToken( sPrefix, localUtil.format( AV145TFBarkgm, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARKGM_TO", GXutil.ltrim( localUtil.ntoc( AV146TFBarkgm_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARKGM_TO", getSecureSignedToken( sPrefix, localUtil.format( AV146TFBarkgm_To, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARPIE", GXutil.ltrim( localUtil.ntoc( AV147TFBarPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARPIE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV147TFBarPie), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARPIE_TO", GXutil.ltrim( localUtil.ntoc( AV148TFBarPie_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARPIE_TO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV148TFBarPie_To), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFASCOD", GXutil.rtrim( AV149TFBarFasCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARFASCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV149TFBarFasCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFASCOD_SEL", GXutil.rtrim( AV150TFBarFasCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARFASCOD_SEL", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV150TFBarFasCod_Sel, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFECCUM", localUtil.dtoc( AV151TFBarFecCum, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARFECCUM", getSecureSignedToken( sPrefix, AV151TFBarFecCum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFECCUM_TO", localUtil.dtoc( AV152TFBarFecCum_To, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARFECCUM_TO", getSecureSignedToken( sPrefix, AV152TFBarFecCum_To));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSIT", GXutil.ltrim( localUtil.ntoc( AV155TFBarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARSIT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV155TFBarSit), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSIT_TO", GXutil.ltrim( localUtil.ntoc( AV156TFBarSit_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTFBARSIT_TO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV156TFBarSit_To), "Z9")));
   }

   public int subgrid_fnc_pagecount( )
   {
      return -1 ;
   }

   public int subgrid_fnc_recordcount( )
   {
      return -1 ;
   }

   public int subgrid_fnc_recordsperpage( )
   {
      return -1 ;
   }

   public int subgrid_fnc_currentpage( )
   {
      return -1 ;
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      edtavTotvaluebarmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebarmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarmtr_Enabled), 5, 0), true);
      edtavTotvaluebarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarkgm_Enabled), 5, 0), true);
      edtavTotvaluebarpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebarpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarpie_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1F90( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e121F92 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV26ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV107DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV23ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_39 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_39"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV109GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV110GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         Gridpaginationbar_Rowsperpageoptions = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageoptions") ;
         Gridpaginationbar_Previous = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Previous") ;
         Gridpaginationbar_Next = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Next") ;
         Gridpaginationbar_Caption = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Caption") ;
         Gridpaginationbar_Emptygridcaption = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Emptygridcaption") ;
         Gridpaginationbar_Rowsperpagecaption = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpagecaption") ;
         Ddo_grid_Caption = httpContext.cgiGet( sPrefix+"DDO_GRID_Caption") ;
         Ddo_grid_Columnids = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Includesortasc = httpContext.cgiGet( sPrefix+"DDO_GRID_Includesortasc") ;
         Ddo_grid_Fixable = httpContext.cgiGet( sPrefix+"DDO_GRID_Fixable") ;
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
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascolumnsselector")) ;
         /* Read variables values. */
         AV18FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18FilterFullText", AV18FilterFullText);
         AV160TotValueBarMtr = httpContext.cgiGet( edtavTotvaluebarmtr_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV160TotValueBarMtr", AV160TotValueBarMtr);
         AV162TotValueBarkgm = httpContext.cgiGet( edtavTotvaluebarkgm_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV162TotValueBarkgm", AV162TotValueBarkgm);
         AV164TotValueBarPie = httpContext.cgiGet( edtavTotvaluebarpie_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV164TotValueBarPie", AV164TotValueBarPie);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_barfeccliauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_BARFECCLIAUXDATE");
            GX_FocusControl = edtavDdo_barfeccliauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV115DDO_BarFecCliAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV115DDO_BarFecCliAuxDate", localUtil.format(AV115DDO_BarFecCliAuxDate, "99/99/99"));
         }
         else
         {
            AV115DDO_BarFecCliAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_barfeccliauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV115DDO_BarFecCliAuxDate", localUtil.format(AV115DDO_BarFecCliAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_barfeccliauxdateto_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_BARFECCLIAUXDATETO");
            GX_FocusControl = edtavDdo_barfeccliauxdateto_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV116DDO_BarFecCliAuxDateTo = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV116DDO_BarFecCliAuxDateTo", localUtil.format(AV116DDO_BarFecCliAuxDateTo, "99/99/99"));
         }
         else
         {
            AV116DDO_BarFecCliAuxDateTo = localUtil.ctod( httpContext.cgiGet( edtavDdo_barfeccliauxdateto_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV116DDO_BarFecCliAuxDateTo", localUtil.format(AV116DDO_BarFecCliAuxDateTo, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_barfecfprauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_BARFECFPRAUXDATE");
            GX_FocusControl = edtavDdo_barfecfprauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV121DDO_BarFecFprAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV121DDO_BarFecFprAuxDate", localUtil.format(AV121DDO_BarFecFprAuxDate, "99/99/99"));
         }
         else
         {
            AV121DDO_BarFecFprAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_barfecfprauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV121DDO_BarFecFprAuxDate", localUtil.format(AV121DDO_BarFecFprAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_barfecfprauxdateto_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_BARFECFPRAUXDATETO");
            GX_FocusControl = edtavDdo_barfecfprauxdateto_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV122DDO_BarFecFprAuxDateTo = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV122DDO_BarFecFprAuxDateTo", localUtil.format(AV122DDO_BarFecFprAuxDateTo, "99/99/99"));
         }
         else
         {
            AV122DDO_BarFecFprAuxDateTo = localUtil.ctod( httpContext.cgiGet( edtavDdo_barfecfprauxdateto_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV122DDO_BarFecFprAuxDateTo", localUtil.format(AV122DDO_BarFecFprAuxDateTo, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_barfecgenauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_BARFECGENAUXDATE");
            GX_FocusControl = edtavDdo_barfecgenauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV125DDO_BarFecGenAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV125DDO_BarFecGenAuxDate", localUtil.format(AV125DDO_BarFecGenAuxDate, "99/99/99"));
         }
         else
         {
            AV125DDO_BarFecGenAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_barfecgenauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV125DDO_BarFecGenAuxDate", localUtil.format(AV125DDO_BarFecGenAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_barfecgenauxdateto_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_BARFECGENAUXDATETO");
            GX_FocusControl = edtavDdo_barfecgenauxdateto_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV126DDO_BarFecGenAuxDateTo = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV126DDO_BarFecGenAuxDateTo", localUtil.format(AV126DDO_BarFecGenAuxDateTo, "99/99/99"));
         }
         else
         {
            AV126DDO_BarFecGenAuxDateTo = localUtil.ctod( httpContext.cgiGet( edtavDdo_barfecgenauxdateto_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV126DDO_BarFecGenAuxDateTo", localUtil.format(AV126DDO_BarFecGenAuxDateTo, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_barfeccumauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_BARFECCUMAUXDATE");
            GX_FocusControl = edtavDdo_barfeccumauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV153DDO_BarFecCumAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV153DDO_BarFecCumAuxDate", localUtil.format(AV153DDO_BarFecCumAuxDate, "99/99/99"));
         }
         else
         {
            AV153DDO_BarFecCumAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_barfeccumauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV153DDO_BarFecCumAuxDate", localUtil.format(AV153DDO_BarFecCumAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_barfeccumauxdateto_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_BARFECCUMAUXDATETO");
            GX_FocusControl = edtavDdo_barfeccumauxdateto_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV154DDO_BarFecCumAuxDateTo = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV154DDO_BarFecCumAuxDateTo", localUtil.format(AV154DDO_BarFecCumAuxDateTo, "99/99/99"));
         }
         else
         {
            AV154DDO_BarFecCumAuxDateTo = localUtil.ctod( httpContext.cgiGet( edtavDdo_barfeccumauxdateto_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV154DDO_BarFecCumAuxDateTo", localUtil.format(AV154DDO_BarFecCumAuxDateTo, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e121F92 ();
      if (returnInSub) return;
   }

   public void e121F92( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV7FasesColeccion.fromJSonString(AV158FasesToJson, null);
   }

   public void e131F92( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      AV174Cargasporseccion_wcds_1_filterfulltext = AV18FilterFullText ;
      AV175Cargasporseccion_wcds_2_tfclinom = AV111TFCliNom ;
      AV176Cargasporseccion_wcds_3_tfclinom_sel = AV112TFCliNom_Sel ;
      AV177Cargasporseccion_wcds_4_tfbarfeccli = AV113TFBarFecCli ;
      AV178Cargasporseccion_wcds_5_tfbarfeccli_to = AV114TFBarFecCli_To ;
      AV179Cargasporseccion_wcds_6_tfpedidocliente = AV117TFPedidoCliente ;
      AV180Cargasporseccion_wcds_7_tfpedidocliente_sel = AV118TFPedidoCliente_Sel ;
      AV181Cargasporseccion_wcds_8_tfbarfecfpr = AV119TFBarFecFpr ;
      AV182Cargasporseccion_wcds_9_tfbarfecfpr_to = AV120TFBarFecFpr_To ;
      AV183Cargasporseccion_wcds_10_tfbarfecgen = AV123TFBarFecGen ;
      AV184Cargasporseccion_wcds_11_tfbarfecgen_to = AV124TFBarFecGen_To ;
      AV185Cargasporseccion_wcds_12_tfbarnhdr = AV127TFBarNHdr ;
      AV186Cargasporseccion_wcds_13_tfbarnhdr_sel = AV128TFBarNHdr_Sel ;
      AV187Cargasporseccion_wcds_14_tfbarser = AV129TFBarSer ;
      AV188Cargasporseccion_wcds_15_tfbarser_sel = AV130TFBarSer_Sel ;
      AV189Cargasporseccion_wcds_16_tfbarserdsc = AV131TFBarSerDsc ;
      AV190Cargasporseccion_wcds_17_tfbarserdsc_sel = AV132TFBarSerDsc_Sel ;
      AV191Cargasporseccion_wcds_18_tfbarcolnom = AV133TFBarColNom ;
      AV192Cargasporseccion_wcds_19_tfbarcolnom_sel = AV134TFBarColNom_Sel ;
      AV193Cargasporseccion_wcds_20_tfbarcolnum = AV135TFBarColNum ;
      AV194Cargasporseccion_wcds_21_tfbarcolnum_to = AV136TFBarColNum_To ;
      AV195Cargasporseccion_wcds_22_tfbartipcol = AV137TFBarTipCol ;
      AV196Cargasporseccion_wcds_23_tfbartipcol_to = AV138TFBarTipCol_To ;
      AV197Cargasporseccion_wcds_24_tfbarordlin = AV39TFBarOrdLin ;
      AV198Cargasporseccion_wcds_25_tfbarordlin_to = AV40TFBarOrdLin_To ;
      AV199Cargasporseccion_wcds_26_tfmaqcodbis = AV53TFMaqCodBis ;
      AV200Cargasporseccion_wcds_27_tfmaqcodbis_sel = AV54TFMaqCodBis_Sel ;
      AV201Cargasporseccion_wcds_28_tffascod = AV41TFFasCod ;
      AV202Cargasporseccion_wcds_29_tffascod_sel = AV42TFFasCod_Sel ;
      AV203Cargasporseccion_wcds_30_tffasdsc = AV139TFFasDsc ;
      AV204Cargasporseccion_wcds_31_tffasdsc_sel = AV140TFFasDsc_Sel ;
      AV205Cargasporseccion_wcds_32_tfbarfasest_sels = AV142TFBarFasEst_Sels ;
      AV206Cargasporseccion_wcds_33_tfbarmtr = AV143TFBarMtr ;
      AV207Cargasporseccion_wcds_34_tfbarmtr_to = AV144TFBarMtr_To ;
      AV208Cargasporseccion_wcds_35_tfbarkgm = AV145TFBarkgm ;
      AV209Cargasporseccion_wcds_36_tfbarkgm_to = AV146TFBarkgm_To ;
      AV210Cargasporseccion_wcds_37_tfbarpie = AV147TFBarPie ;
      AV211Cargasporseccion_wcds_38_tfbarpie_to = AV148TFBarPie_To ;
      AV212Cargasporseccion_wcds_39_tfbarfascod = AV149TFBarFasCod ;
      AV213Cargasporseccion_wcds_40_tfbarfascod_sel = AV150TFBarFasCod_Sel ;
      AV214Cargasporseccion_wcds_41_tfbarfeccum = AV151TFBarFecCum ;
      AV215Cargasporseccion_wcds_42_tfbarfeccum_to = AV152TFBarFecCum_To ;
      AV216Cargasporseccion_wcds_43_tfbarsit = AV155TFBarSit ;
      AV217Cargasporseccion_wcds_44_tfbarsit_to = AV156TFBarSit_To ;
   }

   private void e141F92( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(39) ;
      }
      sendrow_392( ) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_39_Refreshing )
      {
         httpContext.doAjaxLoad(39, GridRow);
      }
   }

   public void S112( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
   }

   public void S122( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
   }

   public void S132( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
   }

   public void S142( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
   }

   public void S152( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
   }

   public void S162( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
   }

   public void S172( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
   }

   public void S182( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
   }

   public void S192( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
   }

   public void S202( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
   }

   public void wb_table2_64_1F92( boolean wbgen )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluebarmtr_Internalname, httpContext.getMessage( "Tot Value Bar Mtr", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'" + sPrefix + "',false,'" + sGXsfl_39_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluebarmtr_Internalname, AV160TotValueBarMtr, GXutil.rtrim( localUtil.format( AV160TotValueBarMtr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,84);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluebarmtr_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluebarmtr_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CargasporSeccion_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluebarkgm_Internalname, httpContext.getMessage( "Tot Value Barkgm", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'" + sPrefix + "',false,'" + sGXsfl_39_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluebarkgm_Internalname, AV162TotValueBarkgm, GXutil.rtrim( localUtil.format( AV162TotValueBarkgm, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,87);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluebarkgm_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluebarkgm_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CargasporSeccion_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluebarpie_Internalname, httpContext.getMessage( "Tot Value Bar Pie", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 90,'" + sPrefix + "',false,'" + sGXsfl_39_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluebarpie_Internalname, AV164TotValueBarPie, GXutil.rtrim( localUtil.format( AV164TotValueBarPie, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,90);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluebarpie_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluebarpie_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CargasporSeccion_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         wb_table2_64_1F92e( true) ;
      }
      else
      {
         wb_table2_64_1F92e( false) ;
      }
   }

   public void wb_table1_21_1F92( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV26ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table3_26_1F92( true) ;
      }
      else
      {
         wb_table3_26_1F92( false) ;
      }
      return  ;
   }

   public void wb_table3_26_1F92e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_21_1F92e( true) ;
      }
      else
      {
         wb_table1_21_1F92e( false) ;
      }
   }

   public void wb_table3_26_1F92( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'" + sPrefix + "',false,'" + sGXsfl_39_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV18FilterFullText, GXutil.rtrim( localUtil.format( AV18FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_CargasporSeccion_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_26_1F92e( true) ;
      }
      else
      {
         wb_table3_26_1F92e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
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
      pa1F92( ) ;
      ws1F92( ) ;
      we1F92( ) ;
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
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1F92( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "cargasporseccion_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1F92( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
      }
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
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
      pa1F92( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1F92( ) ;
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
      ws1F92( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
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
      we1F92( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211684725", true, true);
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
      httpContext.AddJavascriptSource("cargasporseccion_wc.js", "?20268211684726", false, true);
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

   public void subsflControlProps_392( )
   {
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_39_idx ;
      edtBarFecCli_Internalname = sPrefix+"BARFECCLI_"+sGXsfl_39_idx ;
      edtPedidoClie_Internalname = sPrefix+"PEDIDOCLIE_"+sGXsfl_39_idx ;
      edtBarFecFpr_Internalname = sPrefix+"BARFECFPR_"+sGXsfl_39_idx ;
      edtBarFecGen_Internalname = sPrefix+"BARFECGEN_"+sGXsfl_39_idx ;
      edtBarNHdr_Internalname = sPrefix+"BARNHDR_"+sGXsfl_39_idx ;
      edtBarSer_Internalname = sPrefix+"BARSER_"+sGXsfl_39_idx ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC_"+sGXsfl_39_idx ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM_"+sGXsfl_39_idx ;
      edtBarColNum_Internalname = sPrefix+"BARCOLNUM_"+sGXsfl_39_idx ;
      edtBarTipCol_Internalname = sPrefix+"BARTIPCOL_"+sGXsfl_39_idx ;
      edtBarOrdLin_Internalname = sPrefix+"BARORDLIN_"+sGXsfl_39_idx ;
      edtMaqCodBis_Internalname = sPrefix+"MAQCODBIS_"+sGXsfl_39_idx ;
      edtFasCod_Internalname = sPrefix+"FASCOD_"+sGXsfl_39_idx ;
      edtFasDsc_Internalname = sPrefix+"FASDSC_"+sGXsfl_39_idx ;
      cmbBarFasEst.setInternalname( sPrefix+"BARFASEST_"+sGXsfl_39_idx );
      edtBarMtr_Internalname = sPrefix+"BARMTR_"+sGXsfl_39_idx ;
      edtBarKgm_Internalname = sPrefix+"BARKGM_"+sGXsfl_39_idx ;
      edtBarPie_Internalname = sPrefix+"BARPIE_"+sGXsfl_39_idx ;
      edtBarFasCod_Internalname = sPrefix+"BARFASCOD_"+sGXsfl_39_idx ;
      edtBarFecCum_Internalname = sPrefix+"BARFECCUM_"+sGXsfl_39_idx ;
      edtBarSit_Internalname = sPrefix+"BARSIT_"+sGXsfl_39_idx ;
   }

   public void subsflControlProps_fel_392( )
   {
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_39_fel_idx ;
      edtBarFecCli_Internalname = sPrefix+"BARFECCLI_"+sGXsfl_39_fel_idx ;
      edtPedidoClie_Internalname = sPrefix+"PEDIDOCLIE_"+sGXsfl_39_fel_idx ;
      edtBarFecFpr_Internalname = sPrefix+"BARFECFPR_"+sGXsfl_39_fel_idx ;
      edtBarFecGen_Internalname = sPrefix+"BARFECGEN_"+sGXsfl_39_fel_idx ;
      edtBarNHdr_Internalname = sPrefix+"BARNHDR_"+sGXsfl_39_fel_idx ;
      edtBarSer_Internalname = sPrefix+"BARSER_"+sGXsfl_39_fel_idx ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC_"+sGXsfl_39_fel_idx ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM_"+sGXsfl_39_fel_idx ;
      edtBarColNum_Internalname = sPrefix+"BARCOLNUM_"+sGXsfl_39_fel_idx ;
      edtBarTipCol_Internalname = sPrefix+"BARTIPCOL_"+sGXsfl_39_fel_idx ;
      edtBarOrdLin_Internalname = sPrefix+"BARORDLIN_"+sGXsfl_39_fel_idx ;
      edtMaqCodBis_Internalname = sPrefix+"MAQCODBIS_"+sGXsfl_39_fel_idx ;
      edtFasCod_Internalname = sPrefix+"FASCOD_"+sGXsfl_39_fel_idx ;
      edtFasDsc_Internalname = sPrefix+"FASDSC_"+sGXsfl_39_fel_idx ;
      cmbBarFasEst.setInternalname( sPrefix+"BARFASEST_"+sGXsfl_39_fel_idx );
      edtBarMtr_Internalname = sPrefix+"BARMTR_"+sGXsfl_39_fel_idx ;
      edtBarKgm_Internalname = sPrefix+"BARKGM_"+sGXsfl_39_fel_idx ;
      edtBarPie_Internalname = sPrefix+"BARPIE_"+sGXsfl_39_fel_idx ;
      edtBarFasCod_Internalname = sPrefix+"BARFASCOD_"+sGXsfl_39_fel_idx ;
      edtBarFecCum_Internalname = sPrefix+"BARFECCUM_"+sGXsfl_39_fel_idx ;
      edtBarSit_Internalname = sPrefix+"BARSIT_"+sGXsfl_39_fel_idx ;
   }

   public void sendrow_392( )
   {
      subsflControlProps_392( ) ;
      wb1F90( ) ;
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
         if ( ((int)((nGXsfl_39_idx) % (2))) == 0 )
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
         httpContext.writeText( " gxrow=\""+sGXsfl_39_idx+"\">") ;
      }
      /* Subfile cell */
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecCli_Internalname,localUtil.format(A155BarFecCli, "99/99/99"),localUtil.format( A155BarFecCli, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFecCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPedidoClie_Internalname,GXutil.rtrim( A13878PedidoClie),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPedidoClie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecFpr_Internalname,localUtil.format(A158BarFecFpr, "99/99/99"),localUtil.format( A158BarFecFpr, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFecFpr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecGen_Internalname,localUtil.format(A159BarFecGen, "99/99/99"),localUtil.format( A159BarFecGen, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFecGen_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNHdr_Internalname,GXutil.rtrim( A13696BarNHdr),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarNHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSer_Internalname,GXutil.rtrim( A212BarSer),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSerDsc_Internalname,GXutil.rtrim( A1652BarSerDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSerDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNom_Internalname,GXutil.rtrim( A135BarColNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTipCol_Internalname,GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarTipCol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarOrdLin_Internalname,GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarOrdLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqCodBis_Internalname,GXutil.rtrim( A603MaqCodBis),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMaqCodBis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasCod_Internalname,GXutil.rtrim( A457FasCod),GXutil.rtrim( localUtil.format( A457FasCod, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtFasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasDsc_Internalname,GXutil.rtrim( A460FasDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtFasDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      if ( ( cmbBarFasEst.getItemCount() == 0 ) && isAjaxCallMode( ) )
      {
         GXCCtl = "BARFASEST_" + sGXsfl_39_idx ;
         cmbBarFasEst.setName( GXCCtl );
         cmbBarFasEst.setWebtags( "" );
         cmbBarFasEst.addItem("0", httpContext.getMessage( "Pendiente", ""), (short)(0));
         cmbBarFasEst.addItem("1", httpContext.getMessage( "En Proceso", ""), (short)(0));
         cmbBarFasEst.addItem("2", httpContext.getMessage( "Finalizada", ""), (short)(0));
         if ( cmbBarFasEst.getItemCount() > 0 )
         {
            A153BarFasEst = (byte)(GXutil.lval( cmbBarFasEst.getValidValue(GXutil.trim( GXutil.str( A153BarFasEst, 1, 0))))) ;
         }
      }
      /* ComboBox */
      GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbBarFasEst,cmbBarFasEst.getInternalname(),GXutil.trim( GXutil.str( A153BarFasEst, 1, 0)),Integer.valueOf(1),cmbBarFasEst.getJsonclick(),Integer.valueOf(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn hidden-xs","","","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbBarFasEst.setValue( GXutil.trim( GXutil.str( A153BarFasEst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbBarFasEst.getInternalname(), "Values", cmbBarFasEst.ToJavascriptSource(), !bGXsfl_39_Refreshing);
      /* Subfile cell */
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A184BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A184BarMtr, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A166BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A166BarKgm, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPie_Internalname,GXutil.ltrim( localUtil.ntoc( A198BarPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A198BarPie), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarPie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasCod_Internalname,GXutil.rtrim( A151BarFasCod),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecCum_Internalname,localUtil.format(A156BarFecCum, "99/99/99"),localUtil.format( A156BarFecCum, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFecCum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSit_Internalname,GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSit_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      send_integrity_lvl_hashes1F92( ) ;
      GridContainer.AddRow(GridRow);
      nGXsfl_39_idx = ((subGrid_Islastpage==1)&&(nGXsfl_39_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_39_idx+1) ;
      sGXsfl_39_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_392( ) ;
      /* End function sendrow_392 */
   }

   public void startgridcontrol39( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"39\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Disp Cli", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pedido Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Fin Previsto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha HDR", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción Articulo", "")) ;
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
         httpContext.writeValue( httpContext.getMessage( "Orden", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion ", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Estado", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Piezas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fase Ult", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Ult", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Sit", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A279CliNom));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A155BarFecCli, "99/99/99"));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13878PedidoClie));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A158BarFecFpr, "99/99/99"));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A159BarFecGen, "99/99/99"));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13696BarNHdr));
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A603MaqCodBis));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A457FasCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A460FasDsc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A153BarFasEst, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A184BarMtr, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A166BarKgm, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A198BarPie, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A151BarFasCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A156BarFecCum, "99/99/99"));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), ".", "")));
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
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtCliNom_Internalname = sPrefix+"CLINOM" ;
      edtBarFecCli_Internalname = sPrefix+"BARFECCLI" ;
      edtPedidoClie_Internalname = sPrefix+"PEDIDOCLIE" ;
      edtBarFecFpr_Internalname = sPrefix+"BARFECFPR" ;
      edtBarFecGen_Internalname = sPrefix+"BARFECGEN" ;
      edtBarNHdr_Internalname = sPrefix+"BARNHDR" ;
      edtBarSer_Internalname = sPrefix+"BARSER" ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC" ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM" ;
      edtBarColNum_Internalname = sPrefix+"BARCOLNUM" ;
      edtBarTipCol_Internalname = sPrefix+"BARTIPCOL" ;
      edtBarOrdLin_Internalname = sPrefix+"BARORDLIN" ;
      edtMaqCodBis_Internalname = sPrefix+"MAQCODBIS" ;
      edtFasCod_Internalname = sPrefix+"FASCOD" ;
      edtFasDsc_Internalname = sPrefix+"FASDSC" ;
      cmbBarFasEst.setInternalname( sPrefix+"BARFASEST" );
      edtBarMtr_Internalname = sPrefix+"BARMTR" ;
      edtBarKgm_Internalname = sPrefix+"BARKGM" ;
      edtBarPie_Internalname = sPrefix+"BARPIE" ;
      edtBarFasCod_Internalname = sPrefix+"BARFASCOD" ;
      edtBarFecCum_Internalname = sPrefix+"BARFECCUM" ;
      edtBarSit_Internalname = sPrefix+"BARSIT" ;
      edtavTotvaluebarmtr_Internalname = sPrefix+"vTOTVALUEBARMTR" ;
      edtavTotvaluebarkgm_Internalname = sPrefix+"vTOTVALUEBARKGM" ;
      edtavTotvaluebarpie_Internalname = sPrefix+"vTOTVALUEBARPIE" ;
      tblGridtabletotalizer_Internalname = sPrefix+"GRIDTABLETOTALIZER" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      edtavDdo_barfeccliauxdate_Internalname = sPrefix+"vDDO_BARFECCLIAUXDATE" ;
      edtavDdo_barfeccliauxdateto_Internalname = sPrefix+"vDDO_BARFECCLIAUXDATETO" ;
      divDdo_barfeccliauxdates_Internalname = sPrefix+"DDO_BARFECCLIAUXDATES" ;
      edtavDdo_barfecfprauxdate_Internalname = sPrefix+"vDDO_BARFECFPRAUXDATE" ;
      edtavDdo_barfecfprauxdateto_Internalname = sPrefix+"vDDO_BARFECFPRAUXDATETO" ;
      divDdo_barfecfprauxdates_Internalname = sPrefix+"DDO_BARFECFPRAUXDATES" ;
      edtavDdo_barfecgenauxdate_Internalname = sPrefix+"vDDO_BARFECGENAUXDATE" ;
      edtavDdo_barfecgenauxdateto_Internalname = sPrefix+"vDDO_BARFECGENAUXDATETO" ;
      divDdo_barfecgenauxdates_Internalname = sPrefix+"DDO_BARFECGENAUXDATES" ;
      edtavDdo_barfeccumauxdate_Internalname = sPrefix+"vDDO_BARFECCUMAUXDATE" ;
      edtavDdo_barfeccumauxdateto_Internalname = sPrefix+"vDDO_BARFECCUMAUXDATETO" ;
      divDdo_barfeccumauxdates_Internalname = sPrefix+"DDO_BARFECCUMAUXDATES" ;
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
      edtBarSit_Jsonclick = "" ;
      edtBarFecCum_Jsonclick = "" ;
      edtBarFasCod_Jsonclick = "" ;
      edtBarPie_Jsonclick = "" ;
      edtBarKgm_Jsonclick = "" ;
      edtBarMtr_Jsonclick = "" ;
      cmbBarFasEst.setJsonclick( "" );
      edtFasDsc_Jsonclick = "" ;
      edtFasCod_Jsonclick = "" ;
      edtMaqCodBis_Jsonclick = "" ;
      edtBarOrdLin_Jsonclick = "" ;
      edtBarTipCol_Jsonclick = "" ;
      edtBarColNum_Jsonclick = "" ;
      edtBarColNom_Jsonclick = "" ;
      edtBarSerDsc_Jsonclick = "" ;
      edtBarSer_Jsonclick = "" ;
      edtBarNHdr_Jsonclick = "" ;
      edtBarFecGen_Jsonclick = "" ;
      edtBarFecFpr_Jsonclick = "" ;
      edtPedidoClie_Jsonclick = "" ;
      edtBarFecCli_Jsonclick = "" ;
      edtCliNom_Jsonclick = "" ;
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavTotvaluebarpie_Jsonclick = "" ;
      edtavTotvaluebarpie_Enabled = 1 ;
      edtavTotvaluebarkgm_Jsonclick = "" ;
      edtavTotvaluebarkgm_Enabled = 1 ;
      edtavTotvaluebarmtr_Jsonclick = "" ;
      edtavTotvaluebarmtr_Enabled = 1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_barfeccumauxdateto_Jsonclick = "" ;
      edtavDdo_barfeccumauxdate_Jsonclick = "" ;
      edtavDdo_barfecgenauxdateto_Jsonclick = "" ;
      edtavDdo_barfecgenauxdate_Jsonclick = "" ;
      edtavDdo_barfecfprauxdateto_Jsonclick = "" ;
      edtavDdo_barfecfprauxdate_Jsonclick = "" ;
      edtavDdo_barfeccliauxdateto_Jsonclick = "" ;
      edtavDdo_barfeccliauxdate_Jsonclick = "" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "CargasporSeccion_WCGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "|||||||||||||||0:Pendiente,1:En Proceso,2:Finalizada||||||" ;
      Ddo_grid_Allowmultipleselection = "|||||||||||||||T||||||" ;
      Ddo_grid_Datalisttype = "Dynamic||Dynamic|||Dynamic|Dynamic|Dynamic|Dynamic||||Dynamic|Dynamic|Dynamic|FixedValues||||Dynamic||" ;
      Ddo_grid_Includedatalist = "T||T|||T|T|T|T||||T|T|T|T||||T||" ;
      Ddo_grid_Filterisrange = "|T||T|T|||||T|T|T|||||T|T|T||T|T" ;
      Ddo_grid_Filtertype = "Character|Date|Character|Date|Date|Character|Character|Character|Character|Numeric|Numeric|Numeric|Character|Character|Character||Numeric|Numeric|Numeric|Character|Date|Numeric" ;
      Ddo_grid_Includefilter = "T|T|T|T|T|T|T|T|T|T|T|T|T|T|T||T|T|T|T|T|T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T||T|T||T|T|T|T|T|T|T|T|T|T||||||T" ;
      Ddo_grid_Columnssortvalues = "1|2||3|4||5|6|7|8|9|10|11|12|13|14||||||15" ;
      Ddo_grid_Columnids = "0:CliNom|1:BarFecCli|2:PedidoCliente|3:BarFecFpr|4:BarFecGen|5:BarNHdr|6:BarSer|7:BarSerDsc|8:BarColNom|9:BarColNum|10:BarTipCol|11:BarOrdLin|12:MaqCodBis|13:FasCod|14:FasDsc|15:BarFasEst|16:BarMtr|17:Barkgm|18:BarPie|19:BarFasCod|20:BarFecCum|21:BarSit" ;
      Gridpaginationbar_Rowsperpagecaption = "WWP_PagingRowsPerPage" ;
      Gridpaginationbar_Emptygridcaption = "WWP_PagingEmptyGridCaption" ;
      Gridpaginationbar_Caption = httpContext.getMessage( "WWP_PagingCaption", "") ;
      Gridpaginationbar_Next = "WWP_PagingNextCaption" ;
      Gridpaginationbar_Previous = "WWP_PagingPreviousCaption" ;
      Gridpaginationbar_Rowsperpageoptions = "5:WWP_Rows5,10:WWP_Rows10,20:WWP_Rows20,50:WWP_Rows50" ;
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
      GXCCtl = "BARFASEST_" + sGXsfl_39_idx ;
      cmbBarFasEst.setName( GXCCtl );
      cmbBarFasEst.setWebtags( "" );
      cmbBarFasEst.addItem("0", httpContext.getMessage( "Pendiente", ""), (short)(0));
      cmbBarFasEst.addItem("1", httpContext.getMessage( "En Proceso", ""), (short)(0));
      cmbBarFasEst.addItem("2", httpContext.getMessage( "Finalizada", ""), (short)(0));
      if ( cmbBarFasEst.getItemCount() > 0 )
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV7FasesColeccion',fld:'vFASESCOLECCION',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'sPrefix'},{av:'AV18FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV111TFCliNom',fld:'vTFCLINOM',pic:'',hsh:true},{av:'AV112TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:'',hsh:true},{av:'AV113TFBarFecCli',fld:'vTFBARFECCLI',pic:'',hsh:true},{av:'AV114TFBarFecCli_To',fld:'vTFBARFECCLI_TO',pic:'',hsh:true},{av:'AV117TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:'',hsh:true},{av:'AV118TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:'',hsh:true},{av:'AV119TFBarFecFpr',fld:'vTFBARFECFPR',pic:'',hsh:true},{av:'AV120TFBarFecFpr_To',fld:'vTFBARFECFPR_TO',pic:'',hsh:true},{av:'AV123TFBarFecGen',fld:'vTFBARFECGEN',pic:'',hsh:true},{av:'AV124TFBarFecGen_To',fld:'vTFBARFECGEN_TO',pic:'',hsh:true},{av:'AV127TFBarNHdr',fld:'vTFBARNHDR',pic:'',hsh:true},{av:'AV128TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:'',hsh:true},{av:'AV129TFBarSer',fld:'vTFBARSER',pic:'',hsh:true},{av:'AV130TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:'',hsh:true},{av:'AV131TFBarSerDsc',fld:'vTFBARSERDSC',pic:'',hsh:true},{av:'AV132TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:'',hsh:true},{av:'AV133TFBarColNom',fld:'vTFBARCOLNOM',pic:'',hsh:true},{av:'AV134TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:'',hsh:true},{av:'AV135TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'AV136TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9',hsh:true},{av:'AV137TFBarTipCol',fld:'vTFBARTIPCOL',pic:'Z9',hsh:true},{av:'AV138TFBarTipCol_To',fld:'vTFBARTIPCOL_TO',pic:'Z9',hsh:true},{av:'AV39TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV40TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9',hsh:true},{av:'AV53TFMaqCodBis',fld:'vTFMAQCODBIS',pic:'',hsh:true},{av:'AV54TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:'',hsh:true},{av:'AV41TFFasCod',fld:'vTFFASCOD',pic:'@!',hsh:true},{av:'AV42TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!',hsh:true},{av:'AV139TFFasDsc',fld:'vTFFASDSC',pic:'',hsh:true},{av:'AV140TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:'',hsh:true},{av:'AV142TFBarFasEst_Sels',fld:'vTFBARFASEST_SELS',pic:'',hsh:true},{av:'AV143TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV144TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99',hsh:true},{av:'AV145TFBarkgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV146TFBarkgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99',hsh:true},{av:'AV147TFBarPie',fld:'vTFBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV148TFBarPie_To',fld:'vTFBARPIE_TO',pic:'ZZZZZ9',hsh:true},{av:'AV149TFBarFasCod',fld:'vTFBARFASCOD',pic:'',hsh:true},{av:'AV150TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:'',hsh:true},{av:'AV151TFBarFecCum',fld:'vTFBARFECCUM',pic:'',hsh:true},{av:'AV152TFBarFecCum_To',fld:'vTFBARFECCUM_TO',pic:'',hsh:true},{av:'AV155TFBarSit',fld:'vTFBARSIT',pic:'Z9',hsh:true},{av:'AV156TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("GRID.LOAD","{handler:'e141F92',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e111F91',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("VALID_CLINOM","{handler:'valid_Clinom',iparms:[]");
      setEventMetadata("VALID_CLINOM",",oparms:[]}");
      setEventMetadata("VALID_PEDIDOCLIE","{handler:'valid_Pedidoclie',iparms:[]");
      setEventMetadata("VALID_PEDIDOCLIE",",oparms:[]}");
      setEventMetadata("VALID_BARNHDR","{handler:'valid_Barnhdr',iparms:[]");
      setEventMetadata("VALID_BARNHDR",",oparms:[]}");
      setEventMetadata("VALID_BARSER","{handler:'valid_Barser',iparms:[]");
      setEventMetadata("VALID_BARSER",",oparms:[]}");
      setEventMetadata("VALID_BARSERDSC","{handler:'valid_Barserdsc',iparms:[]");
      setEventMetadata("VALID_BARSERDSC",",oparms:[]}");
      setEventMetadata("VALID_BARCOLNOM","{handler:'valid_Barcolnom',iparms:[]");
      setEventMetadata("VALID_BARCOLNOM",",oparms:[]}");
      setEventMetadata("VALID_BARCOLNUM","{handler:'valid_Barcolnum',iparms:[]");
      setEventMetadata("VALID_BARCOLNUM",",oparms:[]}");
      setEventMetadata("VALID_BARTIPCOL","{handler:'valid_Bartipcol',iparms:[]");
      setEventMetadata("VALID_BARTIPCOL",",oparms:[]}");
      setEventMetadata("VALID_BARORDLIN","{handler:'valid_Barordlin',iparms:[]");
      setEventMetadata("VALID_BARORDLIN",",oparms:[]}");
      setEventMetadata("VALID_MAQCODBIS","{handler:'valid_Maqcodbis',iparms:[]");
      setEventMetadata("VALID_MAQCODBIS",",oparms:[]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[]");
      setEventMetadata("VALID_FASCOD",",oparms:[]}");
      setEventMetadata("VALID_FASDSC","{handler:'valid_Fasdsc',iparms:[]");
      setEventMetadata("VALID_FASDSC",",oparms:[]}");
      setEventMetadata("VALID_BARFASEST","{handler:'valid_Barfasest',iparms:[]");
      setEventMetadata("VALID_BARFASEST",",oparms:[]}");
      setEventMetadata("VALID_BARMTR","{handler:'valid_Barmtr',iparms:[]");
      setEventMetadata("VALID_BARMTR",",oparms:[]}");
      setEventMetadata("VALID_BARKGM","{handler:'valid_Barkgm',iparms:[]");
      setEventMetadata("VALID_BARKGM",",oparms:[]}");
      setEventMetadata("VALID_BARPIE","{handler:'valid_Barpie',iparms:[]");
      setEventMetadata("VALID_BARPIE",",oparms:[]}");
      setEventMetadata("VALID_BARFASCOD","{handler:'valid_Barfascod',iparms:[]");
      setEventMetadata("VALID_BARFASCOD",",oparms:[]}");
      setEventMetadata("VALID_BARSIT","{handler:'valid_Barsit',iparms:[]");
      setEventMetadata("VALID_BARSIT",",oparms:[]}");
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
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV7FasesColeccion = new GXSimpleCollection<String>(String.class, "internal", "");
      AV18FilterFullText = "" ;
      AV111TFCliNom = "" ;
      AV112TFCliNom_Sel = "" ;
      AV113TFBarFecCli = GXutil.nullDate() ;
      AV114TFBarFecCli_To = GXutil.nullDate() ;
      AV117TFPedidoCliente = "" ;
      AV118TFPedidoCliente_Sel = "" ;
      AV119TFBarFecFpr = GXutil.nullDate() ;
      AV120TFBarFecFpr_To = GXutil.nullDate() ;
      AV123TFBarFecGen = GXutil.nullDate() ;
      AV124TFBarFecGen_To = GXutil.nullDate() ;
      AV127TFBarNHdr = "" ;
      AV128TFBarNHdr_Sel = "" ;
      AV129TFBarSer = "" ;
      AV130TFBarSer_Sel = "" ;
      AV131TFBarSerDsc = "" ;
      AV132TFBarSerDsc_Sel = "" ;
      AV133TFBarColNom = "" ;
      AV134TFBarColNom_Sel = "" ;
      AV53TFMaqCodBis = "" ;
      AV54TFMaqCodBis_Sel = "" ;
      AV41TFFasCod = "" ;
      AV42TFFasCod_Sel = "" ;
      AV139TFFasDsc = "" ;
      AV140TFFasDsc_Sel = "" ;
      AV142TFBarFasEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV143TFBarMtr = DecimalUtil.ZERO ;
      AV144TFBarMtr_To = DecimalUtil.ZERO ;
      AV145TFBarkgm = DecimalUtil.ZERO ;
      AV146TFBarkgm_To = DecimalUtil.ZERO ;
      AV149TFBarFasCod = "" ;
      AV150TFBarFasCod_Sel = "" ;
      AV151TFBarFecCum = GXutil.nullDate() ;
      AV152TFBarFecCum_To = GXutil.nullDate() ;
      AV5Emprcod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV26ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV107DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      A396EmprCod = "" ;
      A4812BarEncCli = "" ;
      A143BarDisNum = "" ;
      A365DisDes = "" ;
      A130BarCodPar = "" ;
      Ddo_grid_Caption = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnexport_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV115DDO_BarFecCliAuxDate = GXutil.nullDate() ;
      AV116DDO_BarFecCliAuxDateTo = GXutil.nullDate() ;
      AV121DDO_BarFecFprAuxDate = GXutil.nullDate() ;
      AV122DDO_BarFecFprAuxDateTo = GXutil.nullDate() ;
      AV125DDO_BarFecGenAuxDate = GXutil.nullDate() ;
      AV126DDO_BarFecGenAuxDateTo = GXutil.nullDate() ;
      AV153DDO_BarFecCumAuxDate = GXutil.nullDate() ;
      AV154DDO_BarFecCumAuxDateTo = GXutil.nullDate() ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A279CliNom = "" ;
      A155BarFecCli = GXutil.nullDate() ;
      A13878PedidoClie = "" ;
      A158BarFecFpr = GXutil.nullDate() ;
      A159BarFecGen = GXutil.nullDate() ;
      A13696BarNHdr = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A603MaqCodBis = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A184BarMtr = DecimalUtil.ZERO ;
      A166BarKgm = DecimalUtil.ZERO ;
      A151BarFasCod = "" ;
      A156BarFecCum = GXutil.nullDate() ;
      AV174Cargasporseccion_wcds_1_filterfulltext = "" ;
      AV175Cargasporseccion_wcds_2_tfclinom = "" ;
      AV176Cargasporseccion_wcds_3_tfclinom_sel = "" ;
      AV177Cargasporseccion_wcds_4_tfbarfeccli = GXutil.nullDate() ;
      AV178Cargasporseccion_wcds_5_tfbarfeccli_to = GXutil.nullDate() ;
      AV179Cargasporseccion_wcds_6_tfpedidocliente = "" ;
      AV180Cargasporseccion_wcds_7_tfpedidocliente_sel = "" ;
      AV181Cargasporseccion_wcds_8_tfbarfecfpr = GXutil.nullDate() ;
      AV182Cargasporseccion_wcds_9_tfbarfecfpr_to = GXutil.nullDate() ;
      AV183Cargasporseccion_wcds_10_tfbarfecgen = GXutil.nullDate() ;
      AV184Cargasporseccion_wcds_11_tfbarfecgen_to = GXutil.nullDate() ;
      AV185Cargasporseccion_wcds_12_tfbarnhdr = "" ;
      AV186Cargasporseccion_wcds_13_tfbarnhdr_sel = "" ;
      AV187Cargasporseccion_wcds_14_tfbarser = "" ;
      AV188Cargasporseccion_wcds_15_tfbarser_sel = "" ;
      AV189Cargasporseccion_wcds_16_tfbarserdsc = "" ;
      AV190Cargasporseccion_wcds_17_tfbarserdsc_sel = "" ;
      AV191Cargasporseccion_wcds_18_tfbarcolnom = "" ;
      AV192Cargasporseccion_wcds_19_tfbarcolnom_sel = "" ;
      AV199Cargasporseccion_wcds_26_tfmaqcodbis = "" ;
      AV200Cargasporseccion_wcds_27_tfmaqcodbis_sel = "" ;
      AV201Cargasporseccion_wcds_28_tffascod = "" ;
      AV202Cargasporseccion_wcds_29_tffascod_sel = "" ;
      AV203Cargasporseccion_wcds_30_tffasdsc = "" ;
      AV204Cargasporseccion_wcds_31_tffasdsc_sel = "" ;
      AV205Cargasporseccion_wcds_32_tfbarfasest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV206Cargasporseccion_wcds_33_tfbarmtr = DecimalUtil.ZERO ;
      AV207Cargasporseccion_wcds_34_tfbarmtr_to = DecimalUtil.ZERO ;
      AV208Cargasporseccion_wcds_35_tfbarkgm = DecimalUtil.ZERO ;
      AV209Cargasporseccion_wcds_36_tfbarkgm_to = DecimalUtil.ZERO ;
      AV212Cargasporseccion_wcds_39_tfbarfascod = "" ;
      AV213Cargasporseccion_wcds_40_tfbarfascod_sel = "" ;
      AV214Cargasporseccion_wcds_41_tfbarfeccum = GXutil.nullDate() ;
      AV215Cargasporseccion_wcds_42_tfbarfeccum_to = GXutil.nullDate() ;
      scmdbuf = "" ;
      lV174Cargasporseccion_wcds_1_filterfulltext = "" ;
      lV212Cargasporseccion_wcds_39_tfbarfascod = "" ;
      lV6MaqcodInout = "" ;
      lV175Cargasporseccion_wcds_2_tfclinom = "" ;
      lV185Cargasporseccion_wcds_12_tfbarnhdr = "" ;
      lV187Cargasporseccion_wcds_14_tfbarser = "" ;
      lV189Cargasporseccion_wcds_16_tfbarserdsc = "" ;
      lV191Cargasporseccion_wcds_18_tfbarcolnom = "" ;
      lV199Cargasporseccion_wcds_26_tfmaqcodbis = "" ;
      lV201Cargasporseccion_wcds_28_tffascod = "" ;
      lV203Cargasporseccion_wcds_30_tffasdsc = "" ;
      AV6MaqcodInout = "" ;
      AV171TipoControl = "" ;
      AV168Barcodpar = "" ;
      H01F99_A758ProCod = new String[] {""} ;
      H01F99_A252CliCod = new int[1] ;
      H01F99_n252CliCod = new boolean[] {false} ;
      H01F99_A213BarSit = new byte[1] ;
      H01F99_A153BarFasEst = new byte[1] ;
      H01F99_A460FasDsc = new String[] {""} ;
      H01F99_A457FasCod = new String[] {""} ;
      H01F99_A603MaqCodBis = new String[] {""} ;
      H01F99_A218BarTipCol = new byte[1] ;
      H01F99_A136BarColNum = new int[1] ;
      H01F99_A135BarColNom = new String[] {""} ;
      H01F99_A1652BarSerDsc = new String[] {""} ;
      H01F99_A212BarSer = new String[] {""} ;
      H01F99_A13696BarNHdr = new String[] {""} ;
      H01F99_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      H01F99_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      H01F99_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      H01F99_A279CliNom = new String[] {""} ;
      H01F99_A156BarFecCum = new java.util.Date[] {GXutil.nullDate()} ;
      H01F99_n156BarFecCum = new boolean[] {false} ;
      H01F99_A151BarFasCod = new String[] {""} ;
      H01F99_n151BarFasCod = new boolean[] {false} ;
      H01F99_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01F99_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01F99_A143BarDisNum = new String[] {""} ;
      H01F99_A4812BarEncCli = new String[] {""} ;
      H01F99_A199BarPie1 = new short[1] ;
      H01F99_A365DisDes = new String[] {""} ;
      H01F99_A898BarPieNDes = new int[1] ;
      H01F99_A194BarOrdLin = new short[1] ;
      H01F99_A130BarCodPar = new String[] {""} ;
      H01F99_A132BarCodReo = new byte[1] ;
      H01F99_A129BarCod = new int[1] ;
      H01F99_A396EmprCod = new String[] {""} ;
      H01F917_A758ProCod = new String[] {""} ;
      H01F917_A252CliCod = new int[1] ;
      H01F917_n252CliCod = new boolean[] {false} ;
      H01F917_A213BarSit = new byte[1] ;
      H01F917_A153BarFasEst = new byte[1] ;
      H01F917_A460FasDsc = new String[] {""} ;
      H01F917_A457FasCod = new String[] {""} ;
      H01F917_A603MaqCodBis = new String[] {""} ;
      H01F917_A218BarTipCol = new byte[1] ;
      H01F917_A136BarColNum = new int[1] ;
      H01F917_A135BarColNom = new String[] {""} ;
      H01F917_A1652BarSerDsc = new String[] {""} ;
      H01F917_A212BarSer = new String[] {""} ;
      H01F917_A13696BarNHdr = new String[] {""} ;
      H01F917_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      H01F917_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      H01F917_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      H01F917_A279CliNom = new String[] {""} ;
      H01F917_A156BarFecCum = new java.util.Date[] {GXutil.nullDate()} ;
      H01F917_n156BarFecCum = new boolean[] {false} ;
      H01F917_A151BarFasCod = new String[] {""} ;
      H01F917_n151BarFasCod = new boolean[] {false} ;
      H01F917_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01F917_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01F917_A143BarDisNum = new String[] {""} ;
      H01F917_A4812BarEncCli = new String[] {""} ;
      H01F917_A199BarPie1 = new short[1] ;
      H01F917_A365DisDes = new String[] {""} ;
      H01F917_A898BarPieNDes = new int[1] ;
      H01F917_A194BarOrdLin = new short[1] ;
      H01F917_A130BarCodPar = new String[] {""} ;
      H01F917_A132BarCodReo = new byte[1] ;
      H01F917_A129BarCod = new int[1] ;
      H01F917_A396EmprCod = new String[] {""} ;
      GXt_char1 = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_int8 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_int10 = new short[1] ;
      GXv_int9 = new short[1] ;
      AV160TotValueBarMtr = "" ;
      AV162TotValueBarkgm = "" ;
      AV164TotValueBarPie = "" ;
      AV158FasesToJson = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.cargasporseccion_wc__default(),
         new Object[] {
             new Object[] {
            H01F99_A758ProCod, H01F99_A252CliCod, H01F99_n252CliCod, H01F99_A213BarSit, H01F99_A153BarFasEst, H01F99_A460FasDsc, H01F99_A457FasCod, H01F99_A603MaqCodBis, H01F99_A218BarTipCol, H01F99_A136BarColNum,
            H01F99_A135BarColNom, H01F99_A1652BarSerDsc, H01F99_A212BarSer, H01F99_A13696BarNHdr, H01F99_A159BarFecGen, H01F99_A158BarFecFpr, H01F99_A155BarFecCli, H01F99_A279CliNom, H01F99_A156BarFecCum, H01F99_n156BarFecCum,
            H01F99_A151BarFasCod, H01F99_n151BarFasCod, H01F99_A166BarKgm, H01F99_A184BarMtr, H01F99_A143BarDisNum, H01F99_A4812BarEncCli, H01F99_A199BarPie1, H01F99_A365DisDes, H01F99_A898BarPieNDes, H01F99_A194BarOrdLin,
            H01F99_A130BarCodPar, H01F99_A132BarCodReo, H01F99_A129BarCod, H01F99_A396EmprCod
            }
            , new Object[] {
            H01F917_A758ProCod, H01F917_A252CliCod, H01F917_n252CliCod, H01F917_A213BarSit, H01F917_A153BarFasEst, H01F917_A460FasDsc, H01F917_A457FasCod, H01F917_A603MaqCodBis, H01F917_A218BarTipCol, H01F917_A136BarColNum,
            H01F917_A135BarColNom, H01F917_A1652BarSerDsc, H01F917_A212BarSer, H01F917_A13696BarNHdr, H01F917_A159BarFecGen, H01F917_A158BarFecFpr, H01F917_A155BarFecCli, H01F917_A279CliNom, H01F917_A156BarFecCum, H01F917_n156BarFecCum,
            H01F917_A151BarFasCod, H01F917_n151BarFasCod, H01F917_A166BarKgm, H01F917_A184BarMtr, H01F917_A143BarDisNum, H01F917_A4812BarEncCli, H01F917_A199BarPie1, H01F917_A365DisDes, H01F917_A898BarPieNDes, H01F917_A194BarOrdLin,
            H01F917_A130BarCodPar, H01F917_A132BarCodReo, H01F917_A129BarCod, H01F917_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavTotvaluebarmtr_Enabled = 0 ;
      edtavTotvaluebarkgm_Enabled = 0 ;
      edtavTotvaluebarpie_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV137TFBarTipCol ;
   private byte AV138TFBarTipCol_To ;
   private byte AV155TFBarSit ;
   private byte AV156TFBarSit_To ;
   private byte A132BarCodReo ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A218BarTipCol ;
   private byte A153BarFasEst ;
   private byte A213BarSit ;
   private byte nDonePA ;
   private byte AV195Cargasporseccion_wcds_22_tfbartipcol ;
   private byte AV196Cargasporseccion_wcds_23_tfbartipcol_to ;
   private byte AV216Cargasporseccion_wcds_43_tfbarsit ;
   private byte AV217Cargasporseccion_wcds_44_tfbarsit_to ;
   private byte AV169Barcodreo ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXv_int8[] ;
   private byte GRID_nEOF ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV39TFBarOrdLin ;
   private short AV40TFBarOrdLin_To ;
   private short A199BarPie1 ;
   private short A13889FaseAnteri ;
   private short wbEnd ;
   private short wbStart ;
   private short A194BarOrdLin ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV197Cargasporseccion_wcds_24_tfbarordlin ;
   private short AV198Cargasporseccion_wcds_25_tfbarordlin_to ;
   private short AV15OrderedBy ;
   private short GXt_int6 ;
   private short GXv_int10[] ;
   private short GXv_int9[] ;
   private int nRC_GXsfl_39 ;
   private int nGXsfl_39_idx=1 ;
   private int AV135TFBarColNum ;
   private int AV136TFBarColNum_To ;
   private int AV147TFBarPie ;
   private int AV148TFBarPie_To ;
   private int A898BarPieNDes ;
   private int A129BarCod ;
   private int Gridpaginationbar_Pagestoshow ;
   private int A136BarColNum ;
   private int A198BarPie ;
   private int subGrid_Islastpage ;
   private int edtavTotvaluebarmtr_Enabled ;
   private int edtavTotvaluebarkgm_Enabled ;
   private int edtavTotvaluebarpie_Enabled ;
   private int AV193Cargasporseccion_wcds_20_tfbarcolnum ;
   private int AV194Cargasporseccion_wcds_21_tfbarcolnum_to ;
   private int AV210Cargasporseccion_wcds_37_tfbarpie ;
   private int AV211Cargasporseccion_wcds_38_tfbarpie_to ;
   private int AV205Cargasporseccion_wcds_32_tfbarfasest_sels_size ;
   private int AV7FasesColeccion_size ;
   private int AV170Barcod ;
   private int A252CliCod ;
   private int GXv_int7[] ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long AV109GridCurrentPage ;
   private long AV110GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private long GRID_nFirstRecordOnPage ;
   private java.math.BigDecimal AV143TFBarMtr ;
   private java.math.BigDecimal AV144TFBarMtr_To ;
   private java.math.BigDecimal AV145TFBarkgm ;
   private java.math.BigDecimal AV146TFBarkgm_To ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal AV206Cargasporseccion_wcds_33_tfbarmtr ;
   private java.math.BigDecimal AV207Cargasporseccion_wcds_34_tfbarmtr_to ;
   private java.math.BigDecimal AV208Cargasporseccion_wcds_35_tfbarkgm ;
   private java.math.BigDecimal AV209Cargasporseccion_wcds_36_tfbarkgm_to ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String sGXsfl_39_idx="0001" ;
   private String AV111TFCliNom ;
   private String AV112TFCliNom_Sel ;
   private String AV117TFPedidoCliente ;
   private String AV118TFPedidoCliente_Sel ;
   private String AV127TFBarNHdr ;
   private String AV128TFBarNHdr_Sel ;
   private String AV129TFBarSer ;
   private String AV130TFBarSer_Sel ;
   private String AV131TFBarSerDsc ;
   private String AV132TFBarSerDsc_Sel ;
   private String AV133TFBarColNom ;
   private String AV134TFBarColNom_Sel ;
   private String AV53TFMaqCodBis ;
   private String AV54TFMaqCodBis_Sel ;
   private String AV41TFFasCod ;
   private String AV42TFFasCod_Sel ;
   private String AV139TFFasDsc ;
   private String AV140TFFasDsc_Sel ;
   private String AV149TFBarFasCod ;
   private String AV150TFBarFasCod_Sel ;
   private String AV5Emprcod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
   private String A4812BarEncCli ;
   private String A143BarDisNum ;
   private String A365DisDes ;
   private String A130BarCodPar ;
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
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Includesortasc ;
   private String Ddo_grid_Fixable ;
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
   private String divDdo_barfeccliauxdates_Internalname ;
   private String edtavDdo_barfeccliauxdate_Internalname ;
   private String edtavDdo_barfeccliauxdate_Jsonclick ;
   private String edtavDdo_barfeccliauxdateto_Internalname ;
   private String edtavDdo_barfeccliauxdateto_Jsonclick ;
   private String divDdo_barfecfprauxdates_Internalname ;
   private String edtavDdo_barfecfprauxdate_Internalname ;
   private String edtavDdo_barfecfprauxdate_Jsonclick ;
   private String edtavDdo_barfecfprauxdateto_Internalname ;
   private String edtavDdo_barfecfprauxdateto_Jsonclick ;
   private String divDdo_barfecgenauxdates_Internalname ;
   private String edtavDdo_barfecgenauxdate_Internalname ;
   private String edtavDdo_barfecgenauxdate_Jsonclick ;
   private String edtavDdo_barfecgenauxdateto_Internalname ;
   private String edtavDdo_barfecgenauxdateto_Jsonclick ;
   private String divDdo_barfeccumauxdates_Internalname ;
   private String edtavDdo_barfeccumauxdate_Internalname ;
   private String edtavDdo_barfeccumauxdate_Jsonclick ;
   private String edtavDdo_barfeccumauxdateto_Internalname ;
   private String edtavDdo_barfeccumauxdateto_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavFilterfulltext_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String edtBarFecCli_Internalname ;
   private String A13878PedidoClie ;
   private String edtPedidoClie_Internalname ;
   private String edtBarFecFpr_Internalname ;
   private String edtBarFecGen_Internalname ;
   private String A13696BarNHdr ;
   private String edtBarNHdr_Internalname ;
   private String A212BarSer ;
   private String edtBarSer_Internalname ;
   private String A1652BarSerDsc ;
   private String edtBarSerDsc_Internalname ;
   private String A135BarColNom ;
   private String edtBarColNom_Internalname ;
   private String edtBarColNum_Internalname ;
   private String edtBarTipCol_Internalname ;
   private String edtBarOrdLin_Internalname ;
   private String A603MaqCodBis ;
   private String edtMaqCodBis_Internalname ;
   private String A457FasCod ;
   private String edtFasCod_Internalname ;
   private String A460FasDsc ;
   private String edtFasDsc_Internalname ;
   private String edtBarMtr_Internalname ;
   private String edtBarKgm_Internalname ;
   private String edtBarPie_Internalname ;
   private String A151BarFasCod ;
   private String edtBarFasCod_Internalname ;
   private String edtBarFecCum_Internalname ;
   private String edtBarSit_Internalname ;
   private String edtavTotvaluebarmtr_Internalname ;
   private String edtavTotvaluebarkgm_Internalname ;
   private String edtavTotvaluebarpie_Internalname ;
   private String AV175Cargasporseccion_wcds_2_tfclinom ;
   private String AV176Cargasporseccion_wcds_3_tfclinom_sel ;
   private String AV179Cargasporseccion_wcds_6_tfpedidocliente ;
   private String AV180Cargasporseccion_wcds_7_tfpedidocliente_sel ;
   private String AV185Cargasporseccion_wcds_12_tfbarnhdr ;
   private String AV186Cargasporseccion_wcds_13_tfbarnhdr_sel ;
   private String AV187Cargasporseccion_wcds_14_tfbarser ;
   private String AV188Cargasporseccion_wcds_15_tfbarser_sel ;
   private String AV189Cargasporseccion_wcds_16_tfbarserdsc ;
   private String AV190Cargasporseccion_wcds_17_tfbarserdsc_sel ;
   private String AV191Cargasporseccion_wcds_18_tfbarcolnom ;
   private String AV192Cargasporseccion_wcds_19_tfbarcolnom_sel ;
   private String AV199Cargasporseccion_wcds_26_tfmaqcodbis ;
   private String AV200Cargasporseccion_wcds_27_tfmaqcodbis_sel ;
   private String AV201Cargasporseccion_wcds_28_tffascod ;
   private String AV202Cargasporseccion_wcds_29_tffascod_sel ;
   private String AV203Cargasporseccion_wcds_30_tffasdsc ;
   private String AV204Cargasporseccion_wcds_31_tffasdsc_sel ;
   private String AV212Cargasporseccion_wcds_39_tfbarfascod ;
   private String AV213Cargasporseccion_wcds_40_tfbarfascod_sel ;
   private String scmdbuf ;
   private String lV212Cargasporseccion_wcds_39_tfbarfascod ;
   private String lV6MaqcodInout ;
   private String lV175Cargasporseccion_wcds_2_tfclinom ;
   private String lV185Cargasporseccion_wcds_12_tfbarnhdr ;
   private String lV187Cargasporseccion_wcds_14_tfbarser ;
   private String lV189Cargasporseccion_wcds_16_tfbarserdsc ;
   private String lV191Cargasporseccion_wcds_18_tfbarcolnom ;
   private String lV199Cargasporseccion_wcds_26_tfmaqcodbis ;
   private String lV201Cargasporseccion_wcds_28_tffascod ;
   private String lV203Cargasporseccion_wcds_30_tffasdsc ;
   private String AV6MaqcodInout ;
   private String AV171TipoControl ;
   private String AV168Barcodpar ;
   private String GXt_char1 ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvaluebarmtr_Jsonclick ;
   private String edtavTotvaluebarkgm_Jsonclick ;
   private String edtavTotvaluebarpie_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sGXsfl_39_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtCliNom_Jsonclick ;
   private String edtBarFecCli_Jsonclick ;
   private String edtPedidoClie_Jsonclick ;
   private String edtBarFecFpr_Jsonclick ;
   private String edtBarFecGen_Jsonclick ;
   private String edtBarNHdr_Jsonclick ;
   private String edtBarSer_Jsonclick ;
   private String edtBarSerDsc_Jsonclick ;
   private String edtBarColNom_Jsonclick ;
   private String edtBarColNum_Jsonclick ;
   private String edtBarTipCol_Jsonclick ;
   private String edtBarOrdLin_Jsonclick ;
   private String edtMaqCodBis_Jsonclick ;
   private String edtFasCod_Jsonclick ;
   private String edtFasDsc_Jsonclick ;
   private String GXCCtl ;
   private String edtBarMtr_Jsonclick ;
   private String edtBarKgm_Jsonclick ;
   private String edtBarPie_Jsonclick ;
   private String edtBarFasCod_Jsonclick ;
   private String edtBarFecCum_Jsonclick ;
   private String edtBarSit_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV113TFBarFecCli ;
   private java.util.Date AV114TFBarFecCli_To ;
   private java.util.Date AV119TFBarFecFpr ;
   private java.util.Date AV120TFBarFecFpr_To ;
   private java.util.Date AV123TFBarFecGen ;
   private java.util.Date AV124TFBarFecGen_To ;
   private java.util.Date AV151TFBarFecCum ;
   private java.util.Date AV152TFBarFecCum_To ;
   private java.util.Date AV115DDO_BarFecCliAuxDate ;
   private java.util.Date AV116DDO_BarFecCliAuxDateTo ;
   private java.util.Date AV121DDO_BarFecFprAuxDate ;
   private java.util.Date AV122DDO_BarFecFprAuxDateTo ;
   private java.util.Date AV125DDO_BarFecGenAuxDate ;
   private java.util.Date AV126DDO_BarFecGenAuxDateTo ;
   private java.util.Date AV153DDO_BarFecCumAuxDate ;
   private java.util.Date AV154DDO_BarFecCumAuxDateTo ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date A158BarFecFpr ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A156BarFecCum ;
   private java.util.Date AV177Cargasporseccion_wcds_4_tfbarfeccli ;
   private java.util.Date AV178Cargasporseccion_wcds_5_tfbarfeccli_to ;
   private java.util.Date AV181Cargasporseccion_wcds_8_tfbarfecfpr ;
   private java.util.Date AV182Cargasporseccion_wcds_9_tfbarfecfpr_to ;
   private java.util.Date AV183Cargasporseccion_wcds_10_tfbarfecgen ;
   private java.util.Date AV184Cargasporseccion_wcds_11_tfbarfecgen_to ;
   private java.util.Date AV214Cargasporseccion_wcds_41_tfbarfeccum ;
   private java.util.Date AV215Cargasporseccion_wcds_42_tfbarfeccum_to ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
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
   private boolean n151BarFasCod ;
   private boolean n156BarFecCum ;
   private boolean AV16OrderedDsc ;
   private boolean n252CliCod ;
   private boolean bGXsfl_39_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV18FilterFullText ;
   private String AV174Cargasporseccion_wcds_1_filterfulltext ;
   private String lV174Cargasporseccion_wcds_1_filterfulltext ;
   private String AV160TotValueBarMtr ;
   private String AV162TotValueBarkgm ;
   private String AV164TotValueBarPie ;
   private String AV158FasesToJson ;
   private GXSimpleCollection<Byte> AV142TFBarFasEst_Sels ;
   private GXSimpleCollection<Byte> AV205Cargasporseccion_wcds_32_tfbarfasest_sels ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private HTMLChoice cmbBarFasEst ;
   private IDataStoreProvider pr_default ;
   private String[] H01F99_A758ProCod ;
   private int[] H01F99_A252CliCod ;
   private boolean[] H01F99_n252CliCod ;
   private byte[] H01F99_A213BarSit ;
   private byte[] H01F99_A153BarFasEst ;
   private String[] H01F99_A460FasDsc ;
   private String[] H01F99_A457FasCod ;
   private String[] H01F99_A603MaqCodBis ;
   private byte[] H01F99_A218BarTipCol ;
   private int[] H01F99_A136BarColNum ;
   private String[] H01F99_A135BarColNom ;
   private String[] H01F99_A1652BarSerDsc ;
   private String[] H01F99_A212BarSer ;
   private String[] H01F99_A13696BarNHdr ;
   private java.util.Date[] H01F99_A159BarFecGen ;
   private java.util.Date[] H01F99_A158BarFecFpr ;
   private java.util.Date[] H01F99_A155BarFecCli ;
   private String[] H01F99_A279CliNom ;
   private java.util.Date[] H01F99_A156BarFecCum ;
   private boolean[] H01F99_n156BarFecCum ;
   private String[] H01F99_A151BarFasCod ;
   private boolean[] H01F99_n151BarFasCod ;
   private java.math.BigDecimal[] H01F99_A166BarKgm ;
   private java.math.BigDecimal[] H01F99_A184BarMtr ;
   private String[] H01F99_A143BarDisNum ;
   private String[] H01F99_A4812BarEncCli ;
   private short[] H01F99_A199BarPie1 ;
   private String[] H01F99_A365DisDes ;
   private int[] H01F99_A898BarPieNDes ;
   private short[] H01F99_A194BarOrdLin ;
   private String[] H01F99_A130BarCodPar ;
   private byte[] H01F99_A132BarCodReo ;
   private int[] H01F99_A129BarCod ;
   private String[] H01F99_A396EmprCod ;
   private String[] H01F917_A758ProCod ;
   private int[] H01F917_A252CliCod ;
   private boolean[] H01F917_n252CliCod ;
   private byte[] H01F917_A213BarSit ;
   private byte[] H01F917_A153BarFasEst ;
   private String[] H01F917_A460FasDsc ;
   private String[] H01F917_A457FasCod ;
   private String[] H01F917_A603MaqCodBis ;
   private byte[] H01F917_A218BarTipCol ;
   private int[] H01F917_A136BarColNum ;
   private String[] H01F917_A135BarColNom ;
   private String[] H01F917_A1652BarSerDsc ;
   private String[] H01F917_A212BarSer ;
   private String[] H01F917_A13696BarNHdr ;
   private java.util.Date[] H01F917_A159BarFecGen ;
   private java.util.Date[] H01F917_A158BarFecFpr ;
   private java.util.Date[] H01F917_A155BarFecCli ;
   private String[] H01F917_A279CliNom ;
   private java.util.Date[] H01F917_A156BarFecCum ;
   private boolean[] H01F917_n156BarFecCum ;
   private String[] H01F917_A151BarFasCod ;
   private boolean[] H01F917_n151BarFasCod ;
   private java.math.BigDecimal[] H01F917_A166BarKgm ;
   private java.math.BigDecimal[] H01F917_A184BarMtr ;
   private String[] H01F917_A143BarDisNum ;
   private String[] H01F917_A4812BarEncCli ;
   private short[] H01F917_A199BarPie1 ;
   private String[] H01F917_A365DisDes ;
   private int[] H01F917_A898BarPieNDes ;
   private short[] H01F917_A194BarOrdLin ;
   private String[] H01F917_A130BarCodPar ;
   private byte[] H01F917_A132BarCodReo ;
   private int[] H01F917_A129BarCod ;
   private String[] H01F917_A396EmprCod ;
   private GXSimpleCollection<String> AV7FasesColeccion ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV26ManageFiltersData ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelector ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV107DDO_TitleSettingsIcons ;
}

final  class cargasporseccion_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01F99( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A457FasCod ,
                                          GXSimpleCollection<String> AV7FasesColeccion ,
                                          byte A153BarFasEst ,
                                          GXSimpleCollection<Byte> AV205Cargasporseccion_wcds_32_tfbarfasest_sels ,
                                          String AV176Cargasporseccion_wcds_3_tfclinom_sel ,
                                          String AV175Cargasporseccion_wcds_2_tfclinom ,
                                          java.util.Date AV177Cargasporseccion_wcds_4_tfbarfeccli ,
                                          java.util.Date AV178Cargasporseccion_wcds_5_tfbarfeccli_to ,
                                          java.util.Date AV181Cargasporseccion_wcds_8_tfbarfecfpr ,
                                          java.util.Date AV182Cargasporseccion_wcds_9_tfbarfecfpr_to ,
                                          java.util.Date AV183Cargasporseccion_wcds_10_tfbarfecgen ,
                                          java.util.Date AV184Cargasporseccion_wcds_11_tfbarfecgen_to ,
                                          String AV186Cargasporseccion_wcds_13_tfbarnhdr_sel ,
                                          String AV185Cargasporseccion_wcds_12_tfbarnhdr ,
                                          String AV188Cargasporseccion_wcds_15_tfbarser_sel ,
                                          String AV187Cargasporseccion_wcds_14_tfbarser ,
                                          String AV190Cargasporseccion_wcds_17_tfbarserdsc_sel ,
                                          String AV189Cargasporseccion_wcds_16_tfbarserdsc ,
                                          String AV192Cargasporseccion_wcds_19_tfbarcolnom_sel ,
                                          String AV191Cargasporseccion_wcds_18_tfbarcolnom ,
                                          int AV193Cargasporseccion_wcds_20_tfbarcolnum ,
                                          int AV194Cargasporseccion_wcds_21_tfbarcolnum_to ,
                                          byte AV195Cargasporseccion_wcds_22_tfbartipcol ,
                                          byte AV196Cargasporseccion_wcds_23_tfbartipcol_to ,
                                          short AV197Cargasporseccion_wcds_24_tfbarordlin ,
                                          short AV198Cargasporseccion_wcds_25_tfbarordlin_to ,
                                          String AV200Cargasporseccion_wcds_27_tfmaqcodbis_sel ,
                                          String AV199Cargasporseccion_wcds_26_tfmaqcodbis ,
                                          String AV202Cargasporseccion_wcds_29_tffascod_sel ,
                                          String AV201Cargasporseccion_wcds_28_tffascod ,
                                          String AV204Cargasporseccion_wcds_31_tffasdsc_sel ,
                                          String AV203Cargasporseccion_wcds_30_tffasdsc ,
                                          int AV205Cargasporseccion_wcds_32_tfbarfasest_sels_size ,
                                          java.math.BigDecimal AV206Cargasporseccion_wcds_33_tfbarmtr ,
                                          java.math.BigDecimal AV207Cargasporseccion_wcds_34_tfbarmtr_to ,
                                          java.math.BigDecimal AV208Cargasporseccion_wcds_35_tfbarkgm ,
                                          java.math.BigDecimal AV209Cargasporseccion_wcds_36_tfbarkgm_to ,
                                          byte AV216Cargasporseccion_wcds_43_tfbarsit ,
                                          byte AV217Cargasporseccion_wcds_44_tfbarsit_to ,
                                          String A279CliNom ,
                                          java.util.Date A155BarFecCli ,
                                          java.util.Date A158BarFecFpr ,
                                          java.util.Date A159BarFecGen ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          byte A218BarTipCol ,
                                          short A194BarOrdLin ,
                                          String A603MaqCodBis ,
                                          String A460FasDsc ,
                                          java.math.BigDecimal A184BarMtr ,
                                          java.math.BigDecimal A166BarKgm ,
                                          byte A213BarSit ,
                                          short AV15OrderedBy ,
                                          boolean AV16OrderedDsc ,
                                          String AV174Cargasporseccion_wcds_1_filterfulltext ,
                                          String A13878PedidoClie ,
                                          String A13696BarNHdr ,
                                          int A198BarPie ,
                                          String A151BarFasCod ,
                                          String AV180Cargasporseccion_wcds_7_tfpedidocliente_sel ,
                                          String AV179Cargasporseccion_wcds_6_tfpedidocliente ,
                                          int AV210Cargasporseccion_wcds_37_tfbarpie ,
                                          int AV211Cargasporseccion_wcds_38_tfbarpie_to ,
                                          String AV213Cargasporseccion_wcds_40_tfbarfascod_sel ,
                                          String AV212Cargasporseccion_wcds_39_tfbarfascod ,
                                          java.util.Date AV214Cargasporseccion_wcds_41_tfbarfeccum ,
                                          java.util.Date A156BarFecCum ,
                                          java.util.Date AV215Cargasporseccion_wcds_42_tfbarfeccum_to ,
                                          String AV6MaqcodInout ,
                                          int AV7FasesColeccion_size ,
                                          short A13889FaseAnteri ,
                                          String AV171TipoControl ,
                                          int AV170Barcod ,
                                          byte AV169Barcodreo ,
                                          String AV168Barcodpar ,
                                          String AV5Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[52];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T1.ProCod, T3.CliCod, T3.BarSit, T1.BarFasEst, T2.FasDsc, T1.FasCod, T1.MaqCodBis, T3.BarTipCol, T3.BarColNum, T3.BarColNom, T3.BarSerDsc, T3.BarSer, RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCod,'99999990')," ;
      scmdbuf += " 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCodReo,'90'), 2))) || T3.BarCodPar AS BarNHdr, T3.BarFecGen, T3.BarFecFpr, T3.BarFecCli, T4.CliNom, COALESCE( T5.BarFecCum," ;
      scmdbuf += " TO_DATE('0001-01-01', 'YYYY-MM-DD')) AS BarFecCum, COALESCE( T6.BarFasCod, ' ') AS BarFasCod, COALESCE( T7.BarKgm, 0) AS BarKgm, COALESCE( T7.BarMtr, 0) AS BarMtr," ;
      scmdbuf += " T3.BarDisNum, T3.BarEncCli, COALESCE( T7.BarPie1, 0) AS BarPie1, T3.DisDes, COALESCE( T7.BarPieNDes, 0) AS BarPieNDes, T1.BarOrdLin, T1.BarCodPar, T1.BarCodReo," ;
      scmdbuf += " T1.BarCod, T1.EmprCod FROM ((((((TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod" ;
      scmdbuf += " = T3.CliCod) LEFT JOIN (SELECT MIN(T8.BarFecRea) AS BarFecCum, COALESCE( T9.BarProCod, '') AS BarProCod, COALESCE( T10.BarFasLin, 0) AS BarFasLin, T8.EmprCod, T8.BarCod," ;
      scmdbuf += " T8.BarCodReo, T8.BarCodPar FROM ((TXPBARFAS T8 LEFT JOIN (SELECT MIN(T11.ProCod) AS BarProCod, COALESCE( T12.BarFasLin, 0) AS BarFasLin, T11.EmprCod, T11.BarCod," ;
      scmdbuf += " T11.BarCodReo, T11.BarCodPar FROM (TXPBARFAS T11 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst" ;
      scmdbuf += " <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T12 ON T12.EmprCod = T11.EmprCod AND T12.BarCod = T11.BarCod AND T12.BarCodReo = T11.BarCodReo AND T12.BarCodPar" ;
      scmdbuf += " = T11.BarCodPar) WHERE T11.BarOrdLin = COALESCE( T12.BarFasLin, 0) GROUP BY T12.BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo, T11.BarCodPar ) T9 ON T9.EmprCod" ;
      scmdbuf += " = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod," ;
      scmdbuf += " BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T10 ON T10.EmprCod = T8.EmprCod AND T10.BarCod" ;
      scmdbuf += " = T8.BarCod AND T10.BarCodReo = T8.BarCodReo AND T10.BarCodPar = T8.BarCodPar) WHERE T8.ProCod = COALESCE( T9.BarProCod, '') and T8.BarOrdLin = COALESCE( T10.BarFasLin," ;
      scmdbuf += " 0) GROUP BY T9.BarProCod, T10.BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS" ;
      scmdbuf += " T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin = T9.GXC1) AND (T8.BarFasEst" ;
      scmdbuf += " <> 0) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1, SUM(BarPieKil) AS BarKgm, SUM(BarPieMet)" ;
      scmdbuf += " AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T7.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "((? = TO_DATE('0001-01-01', 'YYYY-MM-DD')) or ( COALESCE( T5.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) >= ?))");
      addWhere(sWhereString, "((? = TO_DATE('0001-01-01', 'YYYY-MM-DD')) or ( COALESCE( T5.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) <= ?))");
      addWhere(sWhereString, "(T3.BarSit < 9)");
      addWhere(sWhereString, "((T1.BarFasEst = 0))");
      addWhere(sWhereString, "(T1.MaqCodBis like ?)");
      addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV7FasesColeccion, "T1.FasCod IN (", ")")+" or ? = 0)");
      addWhere(sWhereString, "(T1.BarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodPar = ? or (rtrim(?) IS NULL))");
      if ( (GXutil.strcmp("", AV176Cargasporseccion_wcds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV175Cargasporseccion_wcds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV176Cargasporseccion_wcds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int11[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV177Cargasporseccion_wcds_4_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T3.BarFecCli >= ?)");
      }
      else
      {
         GXv_int11[20] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV178Cargasporseccion_wcds_5_tfbarfeccli_to)) )
      {
         addWhere(sWhereString, "(T3.BarFecCli <= ?)");
      }
      else
      {
         GXv_int11[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV181Cargasporseccion_wcds_8_tfbarfecfpr)) )
      {
         addWhere(sWhereString, "(T3.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int11[22] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV182Cargasporseccion_wcds_9_tfbarfecfpr_to)) )
      {
         addWhere(sWhereString, "(T3.BarFecFpr <= ?)");
      }
      else
      {
         GXv_int11[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV183Cargasporseccion_wcds_10_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T3.BarFecGen >= ?)");
      }
      else
      {
         GXv_int11[24] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV184Cargasporseccion_wcds_11_tfbarfecgen_to)) )
      {
         addWhere(sWhereString, "(T3.BarFecGen <= ?)");
      }
      else
      {
         GXv_int11[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV186Cargasporseccion_wcds_13_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV185Cargasporseccion_wcds_12_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV186Cargasporseccion_wcds_13_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int11[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV188Cargasporseccion_wcds_15_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV187Cargasporseccion_wcds_14_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV188Cargasporseccion_wcds_15_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSer = ?)");
      }
      else
      {
         GXv_int11[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV190Cargasporseccion_wcds_17_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV189Cargasporseccion_wcds_16_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV190Cargasporseccion_wcds_17_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSerDsc = ?)");
      }
      else
      {
         GXv_int11[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV192Cargasporseccion_wcds_19_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV191Cargasporseccion_wcds_18_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV192Cargasporseccion_wcds_19_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarColNom = ?)");
      }
      else
      {
         GXv_int11[33] = (byte)(1) ;
      }
      if ( ! (0==AV193Cargasporseccion_wcds_20_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T3.BarColNum >= ?)");
      }
      else
      {
         GXv_int11[34] = (byte)(1) ;
      }
      if ( ! (0==AV194Cargasporseccion_wcds_21_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T3.BarColNum <= ?)");
      }
      else
      {
         GXv_int11[35] = (byte)(1) ;
      }
      if ( ! (0==AV195Cargasporseccion_wcds_22_tfbartipcol) )
      {
         addWhere(sWhereString, "(T3.BarTipCol >= ?)");
      }
      else
      {
         GXv_int11[36] = (byte)(1) ;
      }
      if ( ! (0==AV196Cargasporseccion_wcds_23_tfbartipcol_to) )
      {
         addWhere(sWhereString, "(T3.BarTipCol <= ?)");
      }
      else
      {
         GXv_int11[37] = (byte)(1) ;
      }
      if ( ! (0==AV197Cargasporseccion_wcds_24_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int11[38] = (byte)(1) ;
      }
      if ( ! (0==AV198Cargasporseccion_wcds_25_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int11[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV200Cargasporseccion_wcds_27_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV199Cargasporseccion_wcds_26_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV200Cargasporseccion_wcds_27_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int11[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV202Cargasporseccion_wcds_29_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV201Cargasporseccion_wcds_28_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV202Cargasporseccion_wcds_29_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int11[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV204Cargasporseccion_wcds_31_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV203Cargasporseccion_wcds_30_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV204Cargasporseccion_wcds_31_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int11[45] = (byte)(1) ;
      }
      if ( AV205Cargasporseccion_wcds_32_tfbarfasest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV205Cargasporseccion_wcds_32_tfbarfasest_sels, "T1.BarFasEst IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV206Cargasporseccion_wcds_33_tfbarmtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int11[46] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV207Cargasporseccion_wcds_34_tfbarmtr_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int11[47] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV208Cargasporseccion_wcds_35_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int11[48] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV209Cargasporseccion_wcds_36_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int11[49] = (byte)(1) ;
      }
      if ( ! (0==AV216Cargasporseccion_wcds_43_tfbarsit) )
      {
         addWhere(sWhereString, "(T3.BarSit >= ?)");
      }
      else
      {
         GXv_int11[50] = (byte)(1) ;
      }
      if ( ! (0==AV217Cargasporseccion_wcds_44_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T3.BarSit <= ?)");
      }
      else
      {
         GXv_int11[51] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV15OrderedBy == 1 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.CliNom" ;
      }
      else if ( ( AV15OrderedBy == 1 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.CliNom DESC" ;
      }
      else if ( ( AV15OrderedBy == 2 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.BarFecCli" ;
      }
      else if ( ( AV15OrderedBy == 2 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.BarFecCli DESC" ;
      }
      else if ( ( AV15OrderedBy == 3 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.BarFecFpr" ;
      }
      else if ( ( AV15OrderedBy == 3 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.BarFecFpr DESC" ;
      }
      else if ( ( AV15OrderedBy == 4 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.BarFecGen" ;
      }
      else if ( ( AV15OrderedBy == 4 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.BarFecGen DESC" ;
      }
      else if ( ( AV15OrderedBy == 5 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.BarSer" ;
      }
      else if ( ( AV15OrderedBy == 5 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.BarSer DESC" ;
      }
      else if ( ( AV15OrderedBy == 6 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.BarSerDsc" ;
      }
      else if ( ( AV15OrderedBy == 6 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.BarSerDsc DESC" ;
      }
      else if ( ( AV15OrderedBy == 7 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.BarColNom" ;
      }
      else if ( ( AV15OrderedBy == 7 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.BarColNom DESC" ;
      }
      else if ( ( AV15OrderedBy == 8 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.BarColNum" ;
      }
      else if ( ( AV15OrderedBy == 8 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.BarColNum DESC" ;
      }
      else if ( ( AV15OrderedBy == 9 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.BarTipCol" ;
      }
      else if ( ( AV15OrderedBy == 9 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.BarTipCol DESC" ;
      }
      else if ( ( AV15OrderedBy == 10 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarOrdLin" ;
      }
      else if ( ( AV15OrderedBy == 10 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarOrdLin DESC" ;
      }
      else if ( ( AV15OrderedBy == 11 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqCodBis" ;
      }
      else if ( ( AV15OrderedBy == 11 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqCodBis DESC" ;
      }
      else if ( ( AV15OrderedBy == 12 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FasCod" ;
      }
      else if ( ( AV15OrderedBy == 12 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FasCod DESC" ;
      }
      else if ( ( AV15OrderedBy == 13 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.FasDsc" ;
      }
      else if ( ( AV15OrderedBy == 13 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.FasDsc DESC" ;
      }
      else if ( ( AV15OrderedBy == 14 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFasEst" ;
      }
      else if ( ( AV15OrderedBy == 14 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFasEst DESC" ;
      }
      else if ( ( AV15OrderedBy == 15 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.BarSit" ;
      }
      else if ( ( AV15OrderedBy == 15 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.BarSit DESC" ;
      }
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   protected Object[] conditional_H01F917( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String A457FasCod ,
                                           GXSimpleCollection<String> AV7FasesColeccion ,
                                           byte A153BarFasEst ,
                                           GXSimpleCollection<Byte> AV205Cargasporseccion_wcds_32_tfbarfasest_sels ,
                                           String AV176Cargasporseccion_wcds_3_tfclinom_sel ,
                                           String AV175Cargasporseccion_wcds_2_tfclinom ,
                                           java.util.Date AV177Cargasporseccion_wcds_4_tfbarfeccli ,
                                           java.util.Date AV178Cargasporseccion_wcds_5_tfbarfeccli_to ,
                                           java.util.Date AV181Cargasporseccion_wcds_8_tfbarfecfpr ,
                                           java.util.Date AV182Cargasporseccion_wcds_9_tfbarfecfpr_to ,
                                           java.util.Date AV183Cargasporseccion_wcds_10_tfbarfecgen ,
                                           java.util.Date AV184Cargasporseccion_wcds_11_tfbarfecgen_to ,
                                           String AV186Cargasporseccion_wcds_13_tfbarnhdr_sel ,
                                           String AV185Cargasporseccion_wcds_12_tfbarnhdr ,
                                           String AV188Cargasporseccion_wcds_15_tfbarser_sel ,
                                           String AV187Cargasporseccion_wcds_14_tfbarser ,
                                           String AV190Cargasporseccion_wcds_17_tfbarserdsc_sel ,
                                           String AV189Cargasporseccion_wcds_16_tfbarserdsc ,
                                           String AV192Cargasporseccion_wcds_19_tfbarcolnom_sel ,
                                           String AV191Cargasporseccion_wcds_18_tfbarcolnom ,
                                           int AV193Cargasporseccion_wcds_20_tfbarcolnum ,
                                           int AV194Cargasporseccion_wcds_21_tfbarcolnum_to ,
                                           byte AV195Cargasporseccion_wcds_22_tfbartipcol ,
                                           byte AV196Cargasporseccion_wcds_23_tfbartipcol_to ,
                                           short AV197Cargasporseccion_wcds_24_tfbarordlin ,
                                           short AV198Cargasporseccion_wcds_25_tfbarordlin_to ,
                                           String AV200Cargasporseccion_wcds_27_tfmaqcodbis_sel ,
                                           String AV199Cargasporseccion_wcds_26_tfmaqcodbis ,
                                           String AV202Cargasporseccion_wcds_29_tffascod_sel ,
                                           String AV201Cargasporseccion_wcds_28_tffascod ,
                                           String AV204Cargasporseccion_wcds_31_tffasdsc_sel ,
                                           String AV203Cargasporseccion_wcds_30_tffasdsc ,
                                           int AV205Cargasporseccion_wcds_32_tfbarfasest_sels_size ,
                                           java.math.BigDecimal AV206Cargasporseccion_wcds_33_tfbarmtr ,
                                           java.math.BigDecimal AV207Cargasporseccion_wcds_34_tfbarmtr_to ,
                                           java.math.BigDecimal AV208Cargasporseccion_wcds_35_tfbarkgm ,
                                           java.math.BigDecimal AV209Cargasporseccion_wcds_36_tfbarkgm_to ,
                                           byte AV216Cargasporseccion_wcds_43_tfbarsit ,
                                           byte AV217Cargasporseccion_wcds_44_tfbarsit_to ,
                                           String A279CliNom ,
                                           java.util.Date A155BarFecCli ,
                                           java.util.Date A158BarFecFpr ,
                                           java.util.Date A159BarFecGen ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           byte A218BarTipCol ,
                                           short A194BarOrdLin ,
                                           String A603MaqCodBis ,
                                           String A460FasDsc ,
                                           java.math.BigDecimal A184BarMtr ,
                                           java.math.BigDecimal A166BarKgm ,
                                           byte A213BarSit ,
                                           short AV15OrderedBy ,
                                           boolean AV16OrderedDsc ,
                                           String AV174Cargasporseccion_wcds_1_filterfulltext ,
                                           String A13878PedidoClie ,
                                           String A13696BarNHdr ,
                                           int A198BarPie ,
                                           String A151BarFasCod ,
                                           String AV180Cargasporseccion_wcds_7_tfpedidocliente_sel ,
                                           String AV179Cargasporseccion_wcds_6_tfpedidocliente ,
                                           int AV210Cargasporseccion_wcds_37_tfbarpie ,
                                           int AV211Cargasporseccion_wcds_38_tfbarpie_to ,
                                           String AV213Cargasporseccion_wcds_40_tfbarfascod_sel ,
                                           String AV212Cargasporseccion_wcds_39_tfbarfascod ,
                                           java.util.Date AV214Cargasporseccion_wcds_41_tfbarfeccum ,
                                           java.util.Date A156BarFecCum ,
                                           java.util.Date AV215Cargasporseccion_wcds_42_tfbarfeccum_to ,
                                           String AV6MaqcodInout ,
                                           int AV7FasesColeccion_size ,
                                           short A13889FaseAnteri ,
                                           String AV171TipoControl ,
                                           int AV170Barcod ,
                                           byte AV169Barcodreo ,
                                           String AV168Barcodpar ,
                                           String AV5Emprcod ,
                                           String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[52];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.ProCod, T3.CliCod, T3.BarSit, T1.BarFasEst, T2.FasDsc, T1.FasCod, T1.MaqCodBis, T3.BarTipCol, T3.BarColNum, T3.BarColNom, T3.BarSerDsc, T3.BarSer, RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCod,'99999990')," ;
      scmdbuf += " 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCodReo,'90'), 2))) || T3.BarCodPar AS BarNHdr, T3.BarFecGen, T3.BarFecFpr, T3.BarFecCli, T4.CliNom, COALESCE( T5.BarFecCum," ;
      scmdbuf += " TO_DATE('0001-01-01', 'YYYY-MM-DD')) AS BarFecCum, COALESCE( T6.BarFasCod, ' ') AS BarFasCod, COALESCE( T7.BarKgm, 0) AS BarKgm, COALESCE( T7.BarMtr, 0) AS BarMtr," ;
      scmdbuf += " T3.BarDisNum, T3.BarEncCli, COALESCE( T7.BarPie1, 0) AS BarPie1, T3.DisDes, COALESCE( T7.BarPieNDes, 0) AS BarPieNDes, T1.BarOrdLin, T1.BarCodPar, T1.BarCodReo," ;
      scmdbuf += " T1.BarCod, T1.EmprCod FROM ((((((TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod" ;
      scmdbuf += " = T3.CliCod) LEFT JOIN (SELECT MIN(T8.BarFecRea) AS BarFecCum, COALESCE( T9.BarProCod, '') AS BarProCod, COALESCE( T10.BarFasLin, 0) AS BarFasLin, T8.EmprCod, T8.BarCod," ;
      scmdbuf += " T8.BarCodReo, T8.BarCodPar FROM ((TXPBARFAS T8 LEFT JOIN (SELECT MIN(T11.ProCod) AS BarProCod, COALESCE( T12.BarFasLin, 0) AS BarFasLin, T11.EmprCod, T11.BarCod," ;
      scmdbuf += " T11.BarCodReo, T11.BarCodPar FROM (TXPBARFAS T11 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst" ;
      scmdbuf += " <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T12 ON T12.EmprCod = T11.EmprCod AND T12.BarCod = T11.BarCod AND T12.BarCodReo = T11.BarCodReo AND T12.BarCodPar" ;
      scmdbuf += " = T11.BarCodPar) WHERE T11.BarOrdLin = COALESCE( T12.BarFasLin, 0) GROUP BY T12.BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo, T11.BarCodPar ) T9 ON T9.EmprCod" ;
      scmdbuf += " = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod," ;
      scmdbuf += " BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T10 ON T10.EmprCod = T8.EmprCod AND T10.BarCod" ;
      scmdbuf += " = T8.BarCod AND T10.BarCodReo = T8.BarCodReo AND T10.BarCodPar = T8.BarCodPar) WHERE T8.ProCod = COALESCE( T9.BarProCod, '') and T8.BarOrdLin = COALESCE( T10.BarFasLin," ;
      scmdbuf += " 0) GROUP BY T9.BarProCod, T10.BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS" ;
      scmdbuf += " T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin = T9.GXC1) AND (T8.BarFasEst" ;
      scmdbuf += " <> 0) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1, SUM(BarPieKil) AS BarKgm, SUM(BarPieMet)" ;
      scmdbuf += " AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T7.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "((? = TO_DATE('0001-01-01', 'YYYY-MM-DD')) or ( COALESCE( T5.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) >= ?))");
      addWhere(sWhereString, "((? = TO_DATE('0001-01-01', 'YYYY-MM-DD')) or ( COALESCE( T5.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) <= ?))");
      addWhere(sWhereString, "(T3.BarSit < 9)");
      addWhere(sWhereString, "((T1.BarFasEst = 0))");
      addWhere(sWhereString, "(T1.MaqCodBis like ?)");
      addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV7FasesColeccion, "T1.FasCod IN (", ")")+" or ? = 0)");
      addWhere(sWhereString, "(T1.BarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodPar = ? or (rtrim(?) IS NULL))");
      if ( (GXutil.strcmp("", AV176Cargasporseccion_wcds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV175Cargasporseccion_wcds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV176Cargasporseccion_wcds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV177Cargasporseccion_wcds_4_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T3.BarFecCli >= ?)");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV178Cargasporseccion_wcds_5_tfbarfeccli_to)) )
      {
         addWhere(sWhereString, "(T3.BarFecCli <= ?)");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV181Cargasporseccion_wcds_8_tfbarfecfpr)) )
      {
         addWhere(sWhereString, "(T3.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV182Cargasporseccion_wcds_9_tfbarfecfpr_to)) )
      {
         addWhere(sWhereString, "(T3.BarFecFpr <= ?)");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV183Cargasporseccion_wcds_10_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T3.BarFecGen >= ?)");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV184Cargasporseccion_wcds_11_tfbarfecgen_to)) )
      {
         addWhere(sWhereString, "(T3.BarFecGen <= ?)");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV186Cargasporseccion_wcds_13_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV185Cargasporseccion_wcds_12_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV186Cargasporseccion_wcds_13_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int14[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV188Cargasporseccion_wcds_15_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV187Cargasporseccion_wcds_14_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV188Cargasporseccion_wcds_15_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSer = ?)");
      }
      else
      {
         GXv_int14[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV190Cargasporseccion_wcds_17_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV189Cargasporseccion_wcds_16_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV190Cargasporseccion_wcds_17_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSerDsc = ?)");
      }
      else
      {
         GXv_int14[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV192Cargasporseccion_wcds_19_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV191Cargasporseccion_wcds_18_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV192Cargasporseccion_wcds_19_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarColNom = ?)");
      }
      else
      {
         GXv_int14[33] = (byte)(1) ;
      }
      if ( ! (0==AV193Cargasporseccion_wcds_20_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T3.BarColNum >= ?)");
      }
      else
      {
         GXv_int14[34] = (byte)(1) ;
      }
      if ( ! (0==AV194Cargasporseccion_wcds_21_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T3.BarColNum <= ?)");
      }
      else
      {
         GXv_int14[35] = (byte)(1) ;
      }
      if ( ! (0==AV195Cargasporseccion_wcds_22_tfbartipcol) )
      {
         addWhere(sWhereString, "(T3.BarTipCol >= ?)");
      }
      else
      {
         GXv_int14[36] = (byte)(1) ;
      }
      if ( ! (0==AV196Cargasporseccion_wcds_23_tfbartipcol_to) )
      {
         addWhere(sWhereString, "(T3.BarTipCol <= ?)");
      }
      else
      {
         GXv_int14[37] = (byte)(1) ;
      }
      if ( ! (0==AV197Cargasporseccion_wcds_24_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int14[38] = (byte)(1) ;
      }
      if ( ! (0==AV198Cargasporseccion_wcds_25_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int14[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV200Cargasporseccion_wcds_27_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV199Cargasporseccion_wcds_26_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV200Cargasporseccion_wcds_27_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int14[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV202Cargasporseccion_wcds_29_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV201Cargasporseccion_wcds_28_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV202Cargasporseccion_wcds_29_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int14[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV204Cargasporseccion_wcds_31_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV203Cargasporseccion_wcds_30_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV204Cargasporseccion_wcds_31_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int14[45] = (byte)(1) ;
      }
      if ( AV205Cargasporseccion_wcds_32_tfbarfasest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV205Cargasporseccion_wcds_32_tfbarfasest_sels, "T1.BarFasEst IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV206Cargasporseccion_wcds_33_tfbarmtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int14[46] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV207Cargasporseccion_wcds_34_tfbarmtr_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int14[47] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV208Cargasporseccion_wcds_35_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int14[48] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV209Cargasporseccion_wcds_36_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int14[49] = (byte)(1) ;
      }
      if ( ! (0==AV216Cargasporseccion_wcds_43_tfbarsit) )
      {
         addWhere(sWhereString, "(T3.BarSit >= ?)");
      }
      else
      {
         GXv_int14[50] = (byte)(1) ;
      }
      if ( ! (0==AV217Cargasporseccion_wcds_44_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T3.BarSit <= ?)");
      }
      else
      {
         GXv_int14[51] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV15OrderedBy == 1 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.CliNom" ;
      }
      else if ( ( AV15OrderedBy == 1 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.CliNom DESC" ;
      }
      else if ( ( AV15OrderedBy == 2 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.BarFecCli" ;
      }
      else if ( ( AV15OrderedBy == 2 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.BarFecCli DESC" ;
      }
      else if ( ( AV15OrderedBy == 3 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.BarFecFpr" ;
      }
      else if ( ( AV15OrderedBy == 3 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.BarFecFpr DESC" ;
      }
      else if ( ( AV15OrderedBy == 4 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.BarFecGen" ;
      }
      else if ( ( AV15OrderedBy == 4 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.BarFecGen DESC" ;
      }
      else if ( ( AV15OrderedBy == 5 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.BarSer" ;
      }
      else if ( ( AV15OrderedBy == 5 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.BarSer DESC" ;
      }
      else if ( ( AV15OrderedBy == 6 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.BarSerDsc" ;
      }
      else if ( ( AV15OrderedBy == 6 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.BarSerDsc DESC" ;
      }
      else if ( ( AV15OrderedBy == 7 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.BarColNom" ;
      }
      else if ( ( AV15OrderedBy == 7 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.BarColNom DESC" ;
      }
      else if ( ( AV15OrderedBy == 8 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.BarColNum" ;
      }
      else if ( ( AV15OrderedBy == 8 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.BarColNum DESC" ;
      }
      else if ( ( AV15OrderedBy == 9 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.BarTipCol" ;
      }
      else if ( ( AV15OrderedBy == 9 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.BarTipCol DESC" ;
      }
      else if ( ( AV15OrderedBy == 10 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarOrdLin" ;
      }
      else if ( ( AV15OrderedBy == 10 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarOrdLin DESC" ;
      }
      else if ( ( AV15OrderedBy == 11 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqCodBis" ;
      }
      else if ( ( AV15OrderedBy == 11 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqCodBis DESC" ;
      }
      else if ( ( AV15OrderedBy == 12 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FasCod" ;
      }
      else if ( ( AV15OrderedBy == 12 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FasCod DESC" ;
      }
      else if ( ( AV15OrderedBy == 13 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.FasDsc" ;
      }
      else if ( ( AV15OrderedBy == 13 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.FasDsc DESC" ;
      }
      else if ( ( AV15OrderedBy == 14 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFasEst" ;
      }
      else if ( ( AV15OrderedBy == 14 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFasEst DESC" ;
      }
      else if ( ( AV15OrderedBy == 15 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.BarSit" ;
      }
      else if ( ( AV15OrderedBy == 15 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.BarSit DESC" ;
      }
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
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
                  return conditional_H01F99(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , ((Number) dynConstraints[37]).byteValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , ((Number) dynConstraints[44]).byteValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).byteValue() , ((Number) dynConstraints[51]).shortValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] , (java.math.BigDecimal)dynConstraints[55] , ((Number) dynConstraints[56]).byteValue() , ((Number) dynConstraints[57]).shortValue() , ((Boolean) dynConstraints[58]).booleanValue() , (String)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , ((Number) dynConstraints[62]).intValue() , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , ((Number) dynConstraints[66]).intValue() , ((Number) dynConstraints[67]).intValue() , (String)dynConstraints[68] , (String)dynConstraints[69] , (java.util.Date)dynConstraints[70] , (java.util.Date)dynConstraints[71] , (java.util.Date)dynConstraints[72] , (String)dynConstraints[73] , ((Number) dynConstraints[74]).intValue() , ((Number) dynConstraints[75]).shortValue() , (String)dynConstraints[76] , ((Number) dynConstraints[77]).intValue() , ((Number) dynConstraints[78]).byteValue() , (String)dynConstraints[79] , (String)dynConstraints[80] , (String)dynConstraints[81] );
            case 1 :
                  return conditional_H01F917(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , ((Number) dynConstraints[37]).byteValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , ((Number) dynConstraints[44]).byteValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).byteValue() , ((Number) dynConstraints[51]).shortValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] , (java.math.BigDecimal)dynConstraints[55] , ((Number) dynConstraints[56]).byteValue() , ((Number) dynConstraints[57]).shortValue() , ((Boolean) dynConstraints[58]).booleanValue() , (String)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , ((Number) dynConstraints[62]).intValue() , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , ((Number) dynConstraints[66]).intValue() , ((Number) dynConstraints[67]).intValue() , (String)dynConstraints[68] , (String)dynConstraints[69] , (java.util.Date)dynConstraints[70] , (java.util.Date)dynConstraints[71] , (java.util.Date)dynConstraints[72] , (String)dynConstraints[73] , ((Number) dynConstraints[74]).intValue() , ((Number) dynConstraints[75]).shortValue() , (String)dynConstraints[76] , ((Number) dynConstraints[77]).intValue() , ((Number) dynConstraints[78]).byteValue() , (String)dynConstraints[79] , (String)dynConstraints[80] , (String)dynConstraints[81] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01F99", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01F917", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 28);
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               ((String[]) buf[7])[0] = rslt.getString(7, 6);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 13);
               ((String[]) buf[11])[0] = rslt.getString(11, 26);
               ((String[]) buf[12])[0] = rslt.getString(12, 16);
               ((String[]) buf[13])[0] = rslt.getString(13, 11);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(14);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(15);
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(16);
               ((String[]) buf[17])[0] = rslt.getString(17, 30);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(18);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(19, 8);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(20,2);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(21,2);
               ((String[]) buf[24])[0] = rslt.getString(22, 8);
               ((String[]) buf[25])[0] = rslt.getString(23, 20);
               ((short[]) buf[26])[0] = rslt.getShort(24);
               ((String[]) buf[27])[0] = rslt.getString(25, 1);
               ((int[]) buf[28])[0] = rslt.getInt(26);
               ((short[]) buf[29])[0] = rslt.getShort(27);
               ((String[]) buf[30])[0] = rslt.getString(28, 1);
               ((byte[]) buf[31])[0] = rslt.getByte(29);
               ((int[]) buf[32])[0] = rslt.getInt(30);
               ((String[]) buf[33])[0] = rslt.getString(31, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 28);
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               ((String[]) buf[7])[0] = rslt.getString(7, 6);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 13);
               ((String[]) buf[11])[0] = rslt.getString(11, 26);
               ((String[]) buf[12])[0] = rslt.getString(12, 16);
               ((String[]) buf[13])[0] = rslt.getString(13, 11);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(14);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(15);
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(16);
               ((String[]) buf[17])[0] = rslt.getString(17, 30);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(18);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(19, 8);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(20,2);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(21,2);
               ((String[]) buf[24])[0] = rslt.getString(22, 8);
               ((String[]) buf[25])[0] = rslt.getString(23, 20);
               ((short[]) buf[26])[0] = rslt.getShort(24);
               ((String[]) buf[27])[0] = rslt.getString(25, 1);
               ((int[]) buf[28])[0] = rslt.getInt(26);
               ((short[]) buf[29])[0] = rslt.getShort(27);
               ((String[]) buf[30])[0] = rslt.getString(28, 1);
               ((byte[]) buf[31])[0] = rslt.getByte(29);
               ((int[]) buf[32])[0] = rslt.getInt(30);
               ((String[]) buf[33])[0] = rslt.getString(31, 3);
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
                  stmt.setString(sIdx, (String)parms[53], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[58]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[59]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[60]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[61]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[66]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[67]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[72]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[73]);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[74]);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[75]);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[76]);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[77]);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 11);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 11);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 16);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 16);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 26);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 26);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[88]).byteValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[89]).byteValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[90]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[91]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 6);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 6);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 8);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 8);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 28);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 28);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[98], 2);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[99], 2);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[100], 2);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[101], 2);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[102]).byteValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[103]).byteValue());
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
                  stmt.setString(sIdx, (String)parms[53], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[58]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[59]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[60]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[61]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[66]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[67]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[72]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[73]);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[74]);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[75]);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[76]);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[77]);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 11);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 11);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 16);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 16);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 26);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 26);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[88]).byteValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[89]).byteValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[90]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[91]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 6);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 6);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 8);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 8);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 28);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 28);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[98], 2);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[99], 2);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[100], 2);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[101], 2);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[102]).byteValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[103]).byteValue());
               }
               return;
      }
   }

}

