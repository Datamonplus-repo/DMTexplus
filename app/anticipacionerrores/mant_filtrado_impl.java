package app.anticipacionerrores ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class mant_filtrado_impl extends GXWebComponent
{
   public mant_filtrado_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public mant_filtrado_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mant_filtrado_impl.class ));
   }

   public mant_filtrado_impl( int remoteHandle ,
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
            gxfirstwebparm = httpContext.GetFirstPar( "MAntEmprCod") ;
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
               AV61MAntEmprCod = httpContext.GetPar( "MAntEmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61MAntEmprCod", AV61MAntEmprCod);
               AV65CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65CliCod), 6, 0));
               AV66ArtCod = httpContext.GetPar( "ArtCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66ArtCod", AV66ArtCod);
               AV67ForColNum = (int)(GXutil.lval( httpContext.GetPar( "ForColNum"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67ForColNum), 6, 0));
               AV68TipMaqCodJSON = httpContext.GetPar( "TipMaqCodJSON") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TipMaqCodJSON", AV68TipMaqCodJSON);
               AV70FechaInicio = localUtil.parseDateParm( httpContext.GetPar( "FechaInicio")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70FechaInicio", localUtil.format(AV70FechaInicio, "99/99/99"));
               AV71FechaFin = localUtil.parseDateParm( httpContext.GetPar( "FechaFin")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71FechaFin", localUtil.format(AV71FechaFin, "99/99/99"));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV61MAntEmprCod,Integer.valueOf(AV65CliCod),AV66ArtCod,Integer.valueOf(AV67ForColNum),AV68TipMaqCodJSON,AV70FechaInicio,AV71FechaFin});
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
               gxfirstwebparm = httpContext.GetFirstPar( "MAntEmprCod") ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
            {
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxfirstwebparm = httpContext.GetFirstPar( "MAntEmprCod") ;
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
      nRC_GXsfl_38 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_38"))) ;
      nGXsfl_38_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_38_idx"))) ;
      sGXsfl_38_idx = httpContext.GetPar( "sGXsfl_38_idx") ;
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
      AV61MAntEmprCod = httpContext.GetPar( "MAntEmprCod") ;
      AV65CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
      AV66ArtCod = httpContext.GetPar( "ArtCod") ;
      AV67ForColNum = (int)(GXutil.lval( httpContext.GetPar( "ForColNum"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV69TipMaqCodCollection);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV78sdtMTok);
      AV18ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV6ColumnsSelector);
      AV40TFMAntId = GXutil.lval( httpContext.GetPar( "TFMAntId")) ;
      AV41TFMAntId_To = GXutil.lval( httpContext.GetPar( "TFMAntId_To")) ;
      AV38TFMAntEmprCod = httpContext.GetPar( "TFMAntEmprCod") ;
      AV39TFMAntEmprCod_Sel = httpContext.GetPar( "TFMAntEmprCod_Sel") ;
      AV28TFMAntCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFMAntCliCod"))) ;
      AV29TFMAntCliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFMAntCliCod_To"))) ;
      AV30TFMAntCliNom = httpContext.GetPar( "TFMAntCliNom") ;
      AV31TFMAntCliNom_Sel = httpContext.GetPar( "TFMAntCliNom_Sel") ;
      AV24TFMAntArtCod = httpContext.GetPar( "TFMAntArtCod") ;
      AV25TFMAntArtCod_Sel = httpContext.GetPar( "TFMAntArtCod_Sel") ;
      AV26TFMAntArtDsc = httpContext.GetPar( "TFMAntArtDsc") ;
      AV27TFMAntArtDsc_Sel = httpContext.GetPar( "TFMAntArtDsc_Sel") ;
      AV36TFMAntColNum = (int)(GXutil.lval( httpContext.GetPar( "TFMAntColNum"))) ;
      AV37TFMAntColNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFMAntColNum_To"))) ;
      AV34TFMAntColNom = httpContext.GetPar( "TFMAntColNom") ;
      AV35TFMAntColNom_Sel = httpContext.GetPar( "TFMAntColNom_Sel") ;
      AV32TFMAntColCod = (byte)(GXutil.lval( httpContext.GetPar( "TFMAntColCod"))) ;
      AV33TFMAntColCod_To = (byte)(GXutil.lval( httpContext.GetPar( "TFMAntColCod_To"))) ;
      AV46TFMAntMaqCod = httpContext.GetPar( "TFMAntMaqCod") ;
      AV47TFMAntMaqCod_Sel = httpContext.GetPar( "TFMAntMaqCod_Sel") ;
      AV48TFMAntMaqDsc = httpContext.GetPar( "TFMAntMaqDsc") ;
      AV49TFMAntMaqDsc_Sel = httpContext.GetPar( "TFMAntMaqDsc_Sel") ;
      AV52TFMAntTipMCod = httpContext.GetPar( "TFMAntTipMCod") ;
      AV53TFMAntTipMCod_Sel = httpContext.GetPar( "TFMAntTipMCod_Sel") ;
      AV54TFMAntTipMDsc = httpContext.GetPar( "TFMAntTipMDsc") ;
      AV55TFMAntTipMDsc_Sel = httpContext.GetPar( "TFMAntTipMDsc_Sel") ;
      AV72TFMAntKilTot = CommonUtil.decimalVal( httpContext.GetPar( "TFMAntKilTot"), ".") ;
      AV73TFMAntKilTot_To = CommonUtil.decimalVal( httpContext.GetPar( "TFMAntKilTot_To"), ".") ;
      AV42TFMAntKilProd = CommonUtil.decimalVal( httpContext.GetPar( "TFMAntKilProd"), ".") ;
      AV43TFMAntKilProd_To = CommonUtil.decimalVal( httpContext.GetPar( "TFMAntKilProd_To"), ".") ;
      AV44TFMAntKilReo = CommonUtil.decimalVal( httpContext.GetPar( "TFMAntKilReo"), ".") ;
      AV45TFMAntKilReo_To = CommonUtil.decimalVal( httpContext.GetPar( "TFMAntKilReo_To"), ".") ;
      AV50TFMAntPorc = CommonUtil.decimalVal( httpContext.GetPar( "TFMAntPorc"), ".") ;
      AV51TFMAntPorc_To = CommonUtil.decimalVal( httpContext.GetPar( "TFMAntPorc_To"), ".") ;
      AV87TFMAntMetTot = CommonUtil.decimalVal( httpContext.GetPar( "TFMAntMetTot"), ".") ;
      AV88TFMAntMetTot_To = CommonUtil.decimalVal( httpContext.GetPar( "TFMAntMetTot_To"), ".") ;
      AV83TFMAntMetProd = CommonUtil.decimalVal( httpContext.GetPar( "TFMAntMetProd"), ".") ;
      AV84TFMAntMetProd_To = CommonUtil.decimalVal( httpContext.GetPar( "TFMAntMetProd_To"), ".") ;
      AV85TFMAntMetReo = CommonUtil.decimalVal( httpContext.GetPar( "TFMAntMetReo"), ".") ;
      AV86TFMAntMetReo_To = CommonUtil.decimalVal( httpContext.GetPar( "TFMAntMetReo_To"), ".") ;
      AV89TFMantMetPor = CommonUtil.decimalVal( httpContext.GetPar( "TFMantMetPor"), ".") ;
      AV90TFMantMetPor_To = CommonUtil.decimalVal( httpContext.GetPar( "TFMantMetPor_To"), ".") ;
      AV97Pgmname = httpContext.GetPar( "Pgmname") ;
      AV20OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV22OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV68TipMaqCodJSON = httpContext.GetPar( "TipMaqCodJSON") ;
      AV70FechaInicio = localUtil.parseDateParm( httpContext.GetPar( "FechaInicio")) ;
      AV71FechaFin = localUtil.parseDateParm( httpContext.GetPar( "FechaFin")) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV12FilterFullText, AV61MAntEmprCod, AV65CliCod, AV66ArtCod, AV67ForColNum, AV69TipMaqCodCollection, AV78sdtMTok, AV18ManageFiltersExecutionStep, AV6ColumnsSelector, AV40TFMAntId, AV41TFMAntId_To, AV38TFMAntEmprCod, AV39TFMAntEmprCod_Sel, AV28TFMAntCliCod, AV29TFMAntCliCod_To, AV30TFMAntCliNom, AV31TFMAntCliNom_Sel, AV24TFMAntArtCod, AV25TFMAntArtCod_Sel, AV26TFMAntArtDsc, AV27TFMAntArtDsc_Sel, AV36TFMAntColNum, AV37TFMAntColNum_To, AV34TFMAntColNom, AV35TFMAntColNom_Sel, AV32TFMAntColCod, AV33TFMAntColCod_To, AV46TFMAntMaqCod, AV47TFMAntMaqCod_Sel, AV48TFMAntMaqDsc, AV49TFMAntMaqDsc_Sel, AV52TFMAntTipMCod, AV53TFMAntTipMCod_Sel, AV54TFMAntTipMDsc, AV55TFMAntTipMDsc_Sel, AV72TFMAntKilTot, AV73TFMAntKilTot_To, AV42TFMAntKilProd, AV43TFMAntKilProd_To, AV44TFMAntKilReo, AV45TFMAntKilReo_To, AV50TFMAntPorc, AV51TFMAntPorc_To, AV87TFMAntMetTot, AV88TFMAntMetTot_To, AV83TFMAntMetProd, AV84TFMAntMetProd_To, AV85TFMAntMetReo, AV86TFMAntMetReo_To, AV89TFMantMetPor, AV90TFMantMetPor_To, AV97Pgmname, AV20OrderedBy, AV22OrderedDsc, AV68TipMaqCodJSON, AV70FechaInicio, AV71FechaFin, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa2DQ2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( " MAnt", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.anticipacionerrores.mant_filtrado", new String[] {GXutil.URLEncode(GXutil.rtrim(AV61MAntEmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV65CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV66ArtCod)),GXutil.URLEncode(GXutil.ltrimstr(AV67ForColNum,6,0)),GXutil.URLEncode(GXutil.rtrim(AV68TipMaqCodJSON)),GXutil.URLEncode(GXutil.formatDateParm(AV70FechaInicio)),GXutil.URLEncode(GXutil.formatDateParm(AV71FechaFin))}, new String[] {"MAntEmprCod","CliCod","ArtCod","ForColNum","TipMaqCodJSON","FechaInicio","FechaFin"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"MAnt_Filtrado");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV97Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("anticipacionerrores\\mant_filtrado:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vFILTERFULLTEXT", AV12FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_38", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_38, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV17ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV17ManageFiltersData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV9DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV9DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV6ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV6ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV61MAntEmprCod", GXutil.rtrim( wcpOAV61MAntEmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV65CliCod", GXutil.ltrim( localUtil.ntoc( wcpOAV65CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV66ArtCod", GXutil.rtrim( wcpOAV66ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV67ForColNum", GXutil.ltrim( localUtil.ntoc( wcpOAV67ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV68TipMaqCodJSON", wcpOAV68TipMaqCodJSON);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV70FechaInicio", localUtil.dtoc( wcpOAV70FechaInicio, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV71FechaFin", localUtil.dtoc( wcpOAV71FechaFin, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV18ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMANTID", GXutil.ltrim( localUtil.ntoc( AV40TFMAntId, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMANTID_TO", GXutil.ltrim( localUtil.ntoc( AV41TFMAntId_To, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMANTEMPRCOD", GXutil.rtrim( AV38TFMAntEmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMANTEMPRCOD_SEL", GXutil.rtrim( AV39TFMAntEmprCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMANTCLICOD", GXutil.ltrim( localUtil.ntoc( AV28TFMAntCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMANTCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV29TFMAntCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMANTCLINOM", AV30TFMAntCliNom);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMANTCLINOM_SEL", AV31TFMAntCliNom_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMANTARTCOD", GXutil.rtrim( AV24TFMAntArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMANTARTCOD_SEL", GXutil.rtrim( AV25TFMAntArtCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMANTARTDSC", AV26TFMAntArtDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMANTARTDSC_SEL", AV27TFMAntArtDsc_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMANTCOLNUM", GXutil.ltrim( localUtil.ntoc( AV36TFMAntColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMANTCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV37TFMAntColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMANTCOLNOM", GXutil.rtrim( AV34TFMAntColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMANTCOLNOM_SEL", GXutil.rtrim( AV35TFMAntColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMANTCOLCOD", GXutil.ltrim( localUtil.ntoc( AV32TFMAntColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMANTCOLCOD_TO", GXutil.ltrim( localUtil.ntoc( AV33TFMAntColCod_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMANTMAQCOD", GXutil.rtrim( AV46TFMAntMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMANTMAQCOD_SEL", GXutil.rtrim( AV47TFMAntMaqCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMANTMAQDSC", AV48TFMAntMaqDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMANTMAQDSC_SEL", AV49TFMAntMaqDsc_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMANTTIPMCOD", GXutil.rtrim( AV52TFMAntTipMCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMANTTIPMCOD_SEL", GXutil.rtrim( AV53TFMAntTipMCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMANTTIPMDSC", AV54TFMAntTipMDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMANTTIPMDSC_SEL", AV55TFMAntTipMDsc_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMANTKILTOT", GXutil.ltrim( localUtil.ntoc( AV72TFMAntKilTot, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMANTKILTOT_TO", GXutil.ltrim( localUtil.ntoc( AV73TFMAntKilTot_To, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMANTKILPROD", GXutil.ltrim( localUtil.ntoc( AV42TFMAntKilProd, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMANTKILPROD_TO", GXutil.ltrim( localUtil.ntoc( AV43TFMAntKilProd_To, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMANTKILREO", GXutil.ltrim( localUtil.ntoc( AV44TFMAntKilReo, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMANTKILREO_TO", GXutil.ltrim( localUtil.ntoc( AV45TFMAntKilReo_To, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMANTPORC", GXutil.ltrim( localUtil.ntoc( AV50TFMAntPorc, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMANTPORC_TO", GXutil.ltrim( localUtil.ntoc( AV51TFMAntPorc_To, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMANTMETTOT", GXutil.ltrim( localUtil.ntoc( AV87TFMAntMetTot, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMANTMETTOT_TO", GXutil.ltrim( localUtil.ntoc( AV88TFMAntMetTot_To, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMANTMETPROD", GXutil.ltrim( localUtil.ntoc( AV83TFMAntMetProd, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMANTMETPROD_TO", GXutil.ltrim( localUtil.ntoc( AV84TFMAntMetProd_To, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMANTMETREO", GXutil.ltrim( localUtil.ntoc( AV85TFMAntMetReo, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMANTMETREO_TO", GXutil.ltrim( localUtil.ntoc( AV86TFMAntMetReo_To, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMANTMETPOR", GXutil.ltrim( localUtil.ntoc( AV89TFMantMetPor, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMANTMETPOR_TO", GXutil.ltrim( localUtil.ntoc( AV90TFMantMetPor_To, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV20OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV22OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANTEMPRCOD", GXutil.rtrim( AV61MAntEmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD", GXutil.ltrim( localUtil.ntoc( AV65CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vARTCOD", GXutil.rtrim( AV66ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORCOLNUM", GXutil.ltrim( localUtil.ntoc( AV67ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPMAQCODJSON", AV68TipMaqCodJSON);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFECHAINICIO", localUtil.dtoc( AV70FechaInicio, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFECHAFIN", localUtil.dtoc( AV71FechaFin, 0, "/"));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV13GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV13GridState);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vSDTPARAMETROS", AV81sdtParametros);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vSDTPARAMETROS", AV81sdtParametros);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vTIPMAQCODCOLLECTION", AV69TipMaqCodCollection);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vTIPMAQCODCOLLECTION", AV69TipMaqCodCollection);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vSDTMTOK", AV78sdtMTok);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vSDTMTOK", AV78sdtMTok);
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Infinitescrolling", GXutil.rtrim( Grid_empowerer_Infinitescrolling));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
   }

   public void renderHtmlCloseForm2DQ2( )
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
      return "AnticipacionErrores.MAnt_Filtrado" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " MAnt", "") ;
   }

   public void wb2DQ0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.anticipacionerrores.mant_filtrado");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroupGrouped", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 38, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AnticipacionErrores\\MAnt_Filtrado.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 38, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AnticipacionErrores\\MAnt_Filtrado.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "CellAlignCenter", "left", "top", "", "flex-grow:1;", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTitulo_Internalname, lblTitulo_Caption, "", "", lblTitulo_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_AnticipacionErrores\\MAnt_Filtrado.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_23_2DQ2( true) ;
      }
      else
      {
         wb_table1_23_2DQ2( false) ;
      }
      return  ;
   }

   public void wb_table1_23_2DQ2e( boolean wbgen )
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
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol38( ) ;
      }
      if ( wbEnd == 38 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_38 = (int)(nGXsfl_38_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            GridContainer.AddObjectProperty("GRID_nEOF", GRID_nEOF);
            GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV97Pgmname), GXutil.rtrim( localUtil.format( AV97Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AnticipacionErrores\\MAnt_Filtrado.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV9DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV9DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV6ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("InfiniteScrolling", Grid_empowerer_Infinitescrolling);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 38 )
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
               GridContainer.AddObjectProperty("GRID_nEOF", GRID_nEOF);
               GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
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

   public void start2DQ2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( " MAnt", ""), (short)(0)) ;
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
            strup2DQ0( ) ;
         }
      }
   }

   public void ws2DQ2( )
   {
      start2DQ2( ) ;
      evt2DQ2( ) ;
   }

   public void evt2DQ2( )
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
                              strup2DQ0( ) ;
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
                              strup2DQ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e112DQ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DQ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e122DQ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DQ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e132DQ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DQ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e142DQ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DQ0( ) ;
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
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DQ0( ) ;
                           }
                           AV98Anticipacionerrores_mant_filtradods_1_filterfulltext = AV12FilterFullText ;
                           AV99Anticipacionerrores_mant_filtradods_2_tfmantid = AV40TFMAntId ;
                           AV100Anticipacionerrores_mant_filtradods_3_tfmantid_to = AV41TFMAntId_To ;
                           AV101Anticipacionerrores_mant_filtradods_4_tfmantemprcod = AV38TFMAntEmprCod ;
                           AV102Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel = AV39TFMAntEmprCod_Sel ;
                           AV103Anticipacionerrores_mant_filtradods_6_tfmantclicod = AV28TFMAntCliCod ;
                           AV104Anticipacionerrores_mant_filtradods_7_tfmantclicod_to = AV29TFMAntCliCod_To ;
                           AV105Anticipacionerrores_mant_filtradods_8_tfmantclinom = AV30TFMAntCliNom ;
                           AV106Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel = AV31TFMAntCliNom_Sel ;
                           AV107Anticipacionerrores_mant_filtradods_10_tfmantartcod = AV24TFMAntArtCod ;
                           AV108Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel = AV25TFMAntArtCod_Sel ;
                           AV109Anticipacionerrores_mant_filtradods_12_tfmantartdsc = AV26TFMAntArtDsc ;
                           AV110Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel = AV27TFMAntArtDsc_Sel ;
                           AV111Anticipacionerrores_mant_filtradods_14_tfmantcolnum = AV36TFMAntColNum ;
                           AV112Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to = AV37TFMAntColNum_To ;
                           AV113Anticipacionerrores_mant_filtradods_16_tfmantcolnom = AV34TFMAntColNom ;
                           AV114Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel = AV35TFMAntColNom_Sel ;
                           AV115Anticipacionerrores_mant_filtradods_18_tfmantcolcod = AV32TFMAntColCod ;
                           AV116Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to = AV33TFMAntColCod_To ;
                           AV117Anticipacionerrores_mant_filtradods_20_tfmantmaqcod = AV46TFMAntMaqCod ;
                           AV118Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel = AV47TFMAntMaqCod_Sel ;
                           AV119Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc = AV48TFMAntMaqDsc ;
                           AV120Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel = AV49TFMAntMaqDsc_Sel ;
                           AV121Anticipacionerrores_mant_filtradods_24_tfmanttipmcod = AV52TFMAntTipMCod ;
                           AV122Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel = AV53TFMAntTipMCod_Sel ;
                           AV123Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc = AV54TFMAntTipMDsc ;
                           AV124Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel = AV55TFMAntTipMDsc_Sel ;
                           AV125Anticipacionerrores_mant_filtradods_28_tfmantkiltot = AV72TFMAntKilTot ;
                           AV126Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to = AV73TFMAntKilTot_To ;
                           AV127Anticipacionerrores_mant_filtradods_30_tfmantkilprod = AV42TFMAntKilProd ;
                           AV128Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to = AV43TFMAntKilProd_To ;
                           AV129Anticipacionerrores_mant_filtradods_32_tfmantkilreo = AV44TFMAntKilReo ;
                           AV130Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to = AV45TFMAntKilReo_To ;
                           AV131Anticipacionerrores_mant_filtradods_34_tfmantporc = AV50TFMAntPorc ;
                           AV132Anticipacionerrores_mant_filtradods_35_tfmantporc_to = AV51TFMAntPorc_To ;
                           AV133Anticipacionerrores_mant_filtradods_36_tfmantmettot = AV87TFMAntMetTot ;
                           AV134Anticipacionerrores_mant_filtradods_37_tfmantmettot_to = AV88TFMAntMetTot_To ;
                           AV135Anticipacionerrores_mant_filtradods_38_tfmantmetprod = AV83TFMAntMetProd ;
                           AV136Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to = AV84TFMAntMetProd_To ;
                           AV137Anticipacionerrores_mant_filtradods_40_tfmantmetreo = AV85TFMAntMetReo ;
                           AV138Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to = AV86TFMAntMetReo_To ;
                           AV139Anticipacionerrores_mant_filtradods_42_tfmantmetpor = AV89TFMantMetPor ;
                           AV140Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to = AV90TFMantMetPor_To ;
                           sEvt = httpContext.cgiGet( sPrefix+"GRIDPAGING") ;
                           if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                           {
                              subgrid_firstpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "PREV") == 0 )
                           {
                              subgrid_previouspage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                           {
                              subgrid_nextpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                           {
                              subgrid_lastpage( ) ;
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 14), "MANTPORC.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 16), "MANTMETPOR.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 16), "MANTKILREO.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 16), "MANTMETREO.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 16), "MANTKILREO.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 14), "MANTPORC.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 16), "MANTMETREO.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 16), "MANTMETPOR.CLICK") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DQ0( ) ;
                           }
                           nGXsfl_38_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_38_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_38_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_382( ) ;
                           A14562MAntId = localUtil.ctol( httpContext.cgiGet( edtMAntId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           A14566MAntEmprCo = httpContext.cgiGet( edtMAntEmprCo_Internalname) ;
                           A14565MAntCliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtMAntCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A14611MAntCliNom = httpContext.cgiGet( edtMAntCliNom_Internalname) ;
                           A14567MAntArtCod = httpContext.cgiGet( edtMAntArtCod_Internalname) ;
                           A14613MAntArtDsc = httpContext.cgiGet( edtMAntArtDsc_Internalname) ;
                           A14568MAntColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtMAntColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A14623MAntColNom = httpContext.cgiGet( edtMAntColNom_Internalname) ;
                           A14642MAntColCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtMAntColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A14570MAntMaqCod = httpContext.cgiGet( edtMAntMaqCod_Internalname) ;
                           A14610MAntMaqDsc = httpContext.cgiGet( edtMAntMaqDsc_Internalname) ;
                           A14569MAntTipMCo = httpContext.cgiGet( edtMAntTipMCo_Internalname) ;
                           A14612MAntTipMDs = httpContext.cgiGet( edtMAntTipMDs_Internalname) ;
                           A14646MAntKilTot = localUtil.ctond( httpContext.cgiGet( edtMAntKilTot_Internalname)) ;
                           A14643MAntKilPro = localUtil.ctond( httpContext.cgiGet( edtMAntKilPro_Internalname)) ;
                           A14644MAntKilReo = localUtil.ctond( httpContext.cgiGet( edtMAntKilReo_Internalname)) ;
                           A14645MAntPorc = localUtil.ctond( httpContext.cgiGet( edtMAntPorc_Internalname)) ;
                           A14647MAntMetTot = localUtil.ctond( httpContext.cgiGet( edtMAntMetTot_Internalname)) ;
                           n14647MAntMetTot = false ;
                           A14648MAntMetPro = localUtil.ctond( httpContext.cgiGet( edtMAntMetPro_Internalname)) ;
                           n14648MAntMetPro = false ;
                           A14649MAntMetReo = localUtil.ctond( httpContext.cgiGet( edtMAntMetReo_Internalname)) ;
                           n14649MAntMetReo = false ;
                           A14650MantMetPor = localUtil.ctond( httpContext.cgiGet( edtMantMetPor_Internalname)) ;
                           A14564MAntUsu = httpContext.cgiGet( edtMAntUsu_Internalname) ;
                           A14563MAntTkn = httpContext.cgiGet( edtMAntTkn_Internalname) ;
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
                                       e152DQ2 ();
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
                                       e162DQ2 ();
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
                                       e172DQ2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "MANTPORC.CLICK") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e182DQ2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "MANTMETPOR.CLICK") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e192DQ2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "MANTKILREO.CLICK") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e202DQ2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "MANTMETREO.CLICK") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e212DQ2 ();
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
                                    strup2DQ0( ) ;
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

   public void we2DQ2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm2DQ2( ) ;
         }
      }
   }

   public void pa2DQ2( )
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
      subsflControlProps_382( ) ;
      while ( nGXsfl_38_idx <= nRC_GXsfl_38 )
      {
         sendrow_382( ) ;
         nGXsfl_38_idx = ((subGrid_Islastpage==1)&&(nGXsfl_38_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_38_idx+1) ;
         sGXsfl_38_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_38_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_382( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV12FilterFullText ,
                                 String AV61MAntEmprCod ,
                                 int AV65CliCod ,
                                 String AV66ArtCod ,
                                 int AV67ForColNum ,
                                 GXSimpleCollection<String> AV69TipMaqCodCollection ,
                                 app.anticipacionerrores.SdtsdtMTok AV78sdtMTok ,
                                 byte AV18ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV6ColumnsSelector ,
                                 long AV40TFMAntId ,
                                 long AV41TFMAntId_To ,
                                 String AV38TFMAntEmprCod ,
                                 String AV39TFMAntEmprCod_Sel ,
                                 int AV28TFMAntCliCod ,
                                 int AV29TFMAntCliCod_To ,
                                 String AV30TFMAntCliNom ,
                                 String AV31TFMAntCliNom_Sel ,
                                 String AV24TFMAntArtCod ,
                                 String AV25TFMAntArtCod_Sel ,
                                 String AV26TFMAntArtDsc ,
                                 String AV27TFMAntArtDsc_Sel ,
                                 int AV36TFMAntColNum ,
                                 int AV37TFMAntColNum_To ,
                                 String AV34TFMAntColNom ,
                                 String AV35TFMAntColNom_Sel ,
                                 byte AV32TFMAntColCod ,
                                 byte AV33TFMAntColCod_To ,
                                 String AV46TFMAntMaqCod ,
                                 String AV47TFMAntMaqCod_Sel ,
                                 String AV48TFMAntMaqDsc ,
                                 String AV49TFMAntMaqDsc_Sel ,
                                 String AV52TFMAntTipMCod ,
                                 String AV53TFMAntTipMCod_Sel ,
                                 String AV54TFMAntTipMDsc ,
                                 String AV55TFMAntTipMDsc_Sel ,
                                 java.math.BigDecimal AV72TFMAntKilTot ,
                                 java.math.BigDecimal AV73TFMAntKilTot_To ,
                                 java.math.BigDecimal AV42TFMAntKilProd ,
                                 java.math.BigDecimal AV43TFMAntKilProd_To ,
                                 java.math.BigDecimal AV44TFMAntKilReo ,
                                 java.math.BigDecimal AV45TFMAntKilReo_To ,
                                 java.math.BigDecimal AV50TFMAntPorc ,
                                 java.math.BigDecimal AV51TFMAntPorc_To ,
                                 java.math.BigDecimal AV87TFMAntMetTot ,
                                 java.math.BigDecimal AV88TFMAntMetTot_To ,
                                 java.math.BigDecimal AV83TFMAntMetProd ,
                                 java.math.BigDecimal AV84TFMAntMetProd_To ,
                                 java.math.BigDecimal AV85TFMAntMetReo ,
                                 java.math.BigDecimal AV86TFMAntMetReo_To ,
                                 java.math.BigDecimal AV89TFMantMetPor ,
                                 java.math.BigDecimal AV90TFMantMetPor_To ,
                                 String AV97Pgmname ,
                                 short AV20OrderedBy ,
                                 boolean AV22OrderedDsc ,
                                 String AV68TipMaqCodJSON ,
                                 java.util.Date AV70FechaInicio ,
                                 java.util.Date AV71FechaFin ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e162DQ2 ();
      GRID_nCurrentRecord = 0 ;
      rf2DQ2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"MAnt_Filtrado");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV97Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("anticipacionerrores\\mant_filtrado:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MANTPORC", getSecureSignedToken( sPrefix, localUtil.format( A14645MAntPorc, "ZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"MANTPORC", GXutil.ltrim( localUtil.ntoc( A14645MAntPorc, (byte)(7), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MANTEMPRCO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A14566MAntEmprCo, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"MANTEMPRCO", GXutil.rtrim( A14566MAntEmprCo));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MANTCLICOD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A14565MAntCliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"MANTCLICOD", GXutil.ltrim( localUtil.ntoc( A14565MAntCliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MANTARTCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A14567MAntArtCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"MANTARTCOD", GXutil.rtrim( A14567MAntArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MANTCOLNUM", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A14568MAntColNum), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"MANTCOLNUM", GXutil.ltrim( localUtil.ntoc( A14568MAntColNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MANTTIPMCO", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A14569MAntTipMCo, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"MANTTIPMCO", GXutil.rtrim( A14569MAntTipMCo));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MANTMAQCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A14570MAntMaqCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"MANTMAQCOD", GXutil.rtrim( A14570MAntMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MANTUSU", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A14564MAntUsu, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"MANTUSU", GXutil.rtrim( A14564MAntUsu));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MANTTKN", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A14563MAntTkn, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"MANTTKN", A14563MAntTkn);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MANTMETPOR", getSecureSignedToken( sPrefix, localUtil.format( A14650MantMetPor, "ZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"MANTMETPOR", GXutil.ltrim( localUtil.ntoc( A14650MantMetPor, (byte)(7), (byte)(2), ".", "")));
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
      GRID_nFirstRecordOnPage = 0 ;
      GRID_nCurrentRecord = 0 ;
      GXCCtl = "GRID_nFirstRecordOnPage_" + sGXsfl_38_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      send_integrity_hashes( ) ;
      rf2DQ2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV97Pgmname = "AnticipacionErrores.MAnt_Filtrado" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV97Pgmname", AV97Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2DQ2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(38) ;
      /* Execute user event: Refresh */
      e162DQ2 ();
      nGXsfl_38_idx = (int)(1+GRID_nFirstRecordOnPage) ;
      sGXsfl_38_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_38_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_382( ) ;
      bGXsfl_38_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
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
         subsflControlProps_382( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              A14569MAntTipMCo ,
                                              AV69TipMaqCodCollection ,
                                              AV98Anticipacionerrores_mant_filtradods_1_filterfulltext ,
                                              Long.valueOf(AV99Anticipacionerrores_mant_filtradods_2_tfmantid) ,
                                              Long.valueOf(AV100Anticipacionerrores_mant_filtradods_3_tfmantid_to) ,
                                              AV102Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel ,
                                              AV101Anticipacionerrores_mant_filtradods_4_tfmantemprcod ,
                                              Integer.valueOf(AV103Anticipacionerrores_mant_filtradods_6_tfmantclicod) ,
                                              Integer.valueOf(AV104Anticipacionerrores_mant_filtradods_7_tfmantclicod_to) ,
                                              AV106Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel ,
                                              AV105Anticipacionerrores_mant_filtradods_8_tfmantclinom ,
                                              AV108Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel ,
                                              AV107Anticipacionerrores_mant_filtradods_10_tfmantartcod ,
                                              AV110Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel ,
                                              AV109Anticipacionerrores_mant_filtradods_12_tfmantartdsc ,
                                              Integer.valueOf(AV111Anticipacionerrores_mant_filtradods_14_tfmantcolnum) ,
                                              Integer.valueOf(AV112Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to) ,
                                              AV114Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel ,
                                              AV113Anticipacionerrores_mant_filtradods_16_tfmantcolnom ,
                                              Byte.valueOf(AV115Anticipacionerrores_mant_filtradods_18_tfmantcolcod) ,
                                              Byte.valueOf(AV116Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to) ,
                                              AV118Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel ,
                                              AV117Anticipacionerrores_mant_filtradods_20_tfmantmaqcod ,
                                              AV120Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel ,
                                              AV119Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc ,
                                              AV122Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel ,
                                              AV121Anticipacionerrores_mant_filtradods_24_tfmanttipmcod ,
                                              AV124Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel ,
                                              AV123Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc ,
                                              AV125Anticipacionerrores_mant_filtradods_28_tfmantkiltot ,
                                              AV126Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to ,
                                              AV127Anticipacionerrores_mant_filtradods_30_tfmantkilprod ,
                                              AV128Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to ,
                                              AV129Anticipacionerrores_mant_filtradods_32_tfmantkilreo ,
                                              AV130Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to ,
                                              AV131Anticipacionerrores_mant_filtradods_34_tfmantporc ,
                                              AV132Anticipacionerrores_mant_filtradods_35_tfmantporc_to ,
                                              AV133Anticipacionerrores_mant_filtradods_36_tfmantmettot ,
                                              AV134Anticipacionerrores_mant_filtradods_37_tfmantmettot_to ,
                                              AV135Anticipacionerrores_mant_filtradods_38_tfmantmetprod ,
                                              AV136Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to ,
                                              AV137Anticipacionerrores_mant_filtradods_40_tfmantmetreo ,
                                              AV138Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to ,
                                              AV139Anticipacionerrores_mant_filtradods_42_tfmantmetpor ,
                                              AV140Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to ,
                                              AV66ArtCod ,
                                              Integer.valueOf(AV67ForColNum) ,
                                              Integer.valueOf(AV69TipMaqCodCollection.size()) ,
                                              Long.valueOf(A14562MAntId) ,
                                              A14566MAntEmprCo ,
                                              Integer.valueOf(A14565MAntCliCod) ,
                                              A14611MAntCliNom ,
                                              A14567MAntArtCod ,
                                              A14613MAntArtDsc ,
                                              Integer.valueOf(A14568MAntColNum) ,
                                              A14623MAntColNom ,
                                              Byte.valueOf(A14642MAntColCod) ,
                                              A14570MAntMaqCod ,
                                              A14610MAntMaqDsc ,
                                              A14612MAntTipMDs ,
                                              A14646MAntKilTot ,
                                              A14643MAntKilPro ,
                                              A14644MAntKilReo ,
                                              A14647MAntMetTot ,
                                              A14648MAntMetPro ,
                                              A14649MAntMetReo ,
                                              Short.valueOf(AV20OrderedBy) ,
                                              Boolean.valueOf(AV22OrderedDsc) ,
                                              AV78sdtMTok.getgxTv_SdtsdtMTok_Mtkn() ,
                                              AV78sdtMTok.getgxTv_SdtsdtMTok_Mtknusu() ,
                                              Integer.valueOf(AV65CliCod) ,
                                              AV61MAntEmprCod ,
                                              A14563MAntTkn ,
                                              A14564MAntUsu } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV98Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
         lV98Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
         lV98Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
         lV98Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
         lV98Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
         lV98Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
         lV98Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
         lV98Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
         lV98Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
         lV98Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
         lV98Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
         lV98Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
         lV98Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
         lV98Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
         lV98Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
         lV98Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
         lV98Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
         lV98Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
         lV98Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
         lV98Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
         lV98Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
         lV101Anticipacionerrores_mant_filtradods_4_tfmantemprcod = GXutil.padr( GXutil.rtrim( AV101Anticipacionerrores_mant_filtradods_4_tfmantemprcod), 3, "%") ;
         lV105Anticipacionerrores_mant_filtradods_8_tfmantclinom = GXutil.concat( GXutil.rtrim( AV105Anticipacionerrores_mant_filtradods_8_tfmantclinom), "%", "") ;
         lV107Anticipacionerrores_mant_filtradods_10_tfmantartcod = GXutil.padr( GXutil.rtrim( AV107Anticipacionerrores_mant_filtradods_10_tfmantartcod), 16, "%") ;
         lV109Anticipacionerrores_mant_filtradods_12_tfmantartdsc = GXutil.concat( GXutil.rtrim( AV109Anticipacionerrores_mant_filtradods_12_tfmantartdsc), "%", "") ;
         lV113Anticipacionerrores_mant_filtradods_16_tfmantcolnom = GXutil.padr( GXutil.rtrim( AV113Anticipacionerrores_mant_filtradods_16_tfmantcolnom), 13, "%") ;
         lV117Anticipacionerrores_mant_filtradods_20_tfmantmaqcod = GXutil.padr( GXutil.rtrim( AV117Anticipacionerrores_mant_filtradods_20_tfmantmaqcod), 6, "%") ;
         lV119Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc = GXutil.concat( GXutil.rtrim( AV119Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc), "%", "") ;
         lV121Anticipacionerrores_mant_filtradods_24_tfmanttipmcod = GXutil.padr( GXutil.rtrim( AV121Anticipacionerrores_mant_filtradods_24_tfmanttipmcod), 4, "%") ;
         lV123Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc = GXutil.concat( GXutil.rtrim( AV123Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc), "%", "") ;
         /* Using cursor H02DQ2 */
         pr_default.execute(0, new Object[] {AV78sdtMTok.getgxTv_SdtsdtMTok_Mtkn(), AV78sdtMTok.getgxTv_SdtsdtMTok_Mtknusu(), Integer.valueOf(AV65CliCod), AV61MAntEmprCod, lV98Anticipacionerrores_mant_filtradods_1_filterfulltext, lV98Anticipacionerrores_mant_filtradods_1_filterfulltext, lV98Anticipacionerrores_mant_filtradods_1_filterfulltext, lV98Anticipacionerrores_mant_filtradods_1_filterfulltext, lV98Anticipacionerrores_mant_filtradods_1_filterfulltext, lV98Anticipacionerrores_mant_filtradods_1_filterfulltext, lV98Anticipacionerrores_mant_filtradods_1_filterfulltext, lV98Anticipacionerrores_mant_filtradods_1_filterfulltext, lV98Anticipacionerrores_mant_filtradods_1_filterfulltext, lV98Anticipacionerrores_mant_filtradods_1_filterfulltext, lV98Anticipacionerrores_mant_filtradods_1_filterfulltext, lV98Anticipacionerrores_mant_filtradods_1_filterfulltext, lV98Anticipacionerrores_mant_filtradods_1_filterfulltext, lV98Anticipacionerrores_mant_filtradods_1_filterfulltext, lV98Anticipacionerrores_mant_filtradods_1_filterfulltext, lV98Anticipacionerrores_mant_filtradods_1_filterfulltext, lV98Anticipacionerrores_mant_filtradods_1_filterfulltext, lV98Anticipacionerrores_mant_filtradods_1_filterfulltext, lV98Anticipacionerrores_mant_filtradods_1_filterfulltext, lV98Anticipacionerrores_mant_filtradods_1_filterfulltext, lV98Anticipacionerrores_mant_filtradods_1_filterfulltext, Long.valueOf(AV99Anticipacionerrores_mant_filtradods_2_tfmantid), Long.valueOf(AV100Anticipacionerrores_mant_filtradods_3_tfmantid_to), lV101Anticipacionerrores_mant_filtradods_4_tfmantemprcod, AV102Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel, Integer.valueOf(AV103Anticipacionerrores_mant_filtradods_6_tfmantclicod), Integer.valueOf(AV104Anticipacionerrores_mant_filtradods_7_tfmantclicod_to), lV105Anticipacionerrores_mant_filtradods_8_tfmantclinom, AV106Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel, lV107Anticipacionerrores_mant_filtradods_10_tfmantartcod, AV108Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel, lV109Anticipacionerrores_mant_filtradods_12_tfmantartdsc, AV110Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel, Integer.valueOf(AV111Anticipacionerrores_mant_filtradods_14_tfmantcolnum), Integer.valueOf(AV112Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to), lV113Anticipacionerrores_mant_filtradods_16_tfmantcolnom, AV114Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel, Byte.valueOf(AV115Anticipacionerrores_mant_filtradods_18_tfmantcolcod), Byte.valueOf(AV116Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to), lV117Anticipacionerrores_mant_filtradods_20_tfmantmaqcod, AV118Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel, lV119Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc, AV120Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel, lV121Anticipacionerrores_mant_filtradods_24_tfmanttipmcod, AV122Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel, lV123Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc, AV124Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel, AV125Anticipacionerrores_mant_filtradods_28_tfmantkiltot, AV126Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to, AV127Anticipacionerrores_mant_filtradods_30_tfmantkilprod, AV128Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to, AV129Anticipacionerrores_mant_filtradods_32_tfmantkilreo, AV130Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to, AV131Anticipacionerrores_mant_filtradods_34_tfmantporc, AV132Anticipacionerrores_mant_filtradods_35_tfmantporc_to, AV133Anticipacionerrores_mant_filtradods_36_tfmantmettot, AV134Anticipacionerrores_mant_filtradods_37_tfmantmettot_to, AV135Anticipacionerrores_mant_filtradods_38_tfmantmetprod, AV136Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to, AV137Anticipacionerrores_mant_filtradods_40_tfmantmetreo, AV138Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to, AV139Anticipacionerrores_mant_filtradods_42_tfmantmetpor, AV140Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to, AV66ArtCod, Integer.valueOf(AV67ForColNum), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_38_idx = (int)(1+GRID_nFirstRecordOnPage) ;
         sGXsfl_38_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_38_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_382( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A14563MAntTkn = H02DQ2_A14563MAntTkn[0] ;
            A14564MAntUsu = H02DQ2_A14564MAntUsu[0] ;
            A14648MAntMetPro = H02DQ2_A14648MAntMetPro[0] ;
            n14648MAntMetPro = H02DQ2_n14648MAntMetPro[0] ;
            A14643MAntKilPro = H02DQ2_A14643MAntKilPro[0] ;
            A14612MAntTipMDs = H02DQ2_A14612MAntTipMDs[0] ;
            A14569MAntTipMCo = H02DQ2_A14569MAntTipMCo[0] ;
            A14610MAntMaqDsc = H02DQ2_A14610MAntMaqDsc[0] ;
            A14570MAntMaqCod = H02DQ2_A14570MAntMaqCod[0] ;
            A14642MAntColCod = H02DQ2_A14642MAntColCod[0] ;
            A14623MAntColNom = H02DQ2_A14623MAntColNom[0] ;
            A14568MAntColNum = H02DQ2_A14568MAntColNum[0] ;
            A14613MAntArtDsc = H02DQ2_A14613MAntArtDsc[0] ;
            A14567MAntArtCod = H02DQ2_A14567MAntArtCod[0] ;
            A14611MAntCliNom = H02DQ2_A14611MAntCliNom[0] ;
            A14565MAntCliCod = H02DQ2_A14565MAntCliCod[0] ;
            A14566MAntEmprCo = H02DQ2_A14566MAntEmprCo[0] ;
            A14562MAntId = H02DQ2_A14562MAntId[0] ;
            A14644MAntKilReo = H02DQ2_A14644MAntKilReo[0] ;
            A14646MAntKilTot = H02DQ2_A14646MAntKilTot[0] ;
            A14649MAntMetReo = H02DQ2_A14649MAntMetReo[0] ;
            n14649MAntMetReo = H02DQ2_n14649MAntMetReo[0] ;
            A14647MAntMetTot = H02DQ2_A14647MAntMetTot[0] ;
            n14647MAntMetTot = H02DQ2_n14647MAntMetTot[0] ;
            A14650MantMetPor = ((A14647MAntMetTot.doubleValue()>0) ? (A14649MAntMetReo.divide(A14647MAntMetTot, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
            A14645MAntPorc = ((A14646MAntKilTot.doubleValue()>0) ? (A14644MAntKilReo.divide(A14646MAntKilTot, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
            e172DQ2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(38) ;
         wb2DQ0( ) ;
      }
      bGXsfl_38_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2DQ2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MANTPORC"+"_"+sGXsfl_38_idx, getSecureSignedToken( sPrefix+sGXsfl_38_idx, localUtil.format( A14645MAntPorc, "ZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MANTEMPRCO"+"_"+sGXsfl_38_idx, getSecureSignedToken( sPrefix+sGXsfl_38_idx, GXutil.rtrim( localUtil.format( A14566MAntEmprCo, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MANTCLICOD"+"_"+sGXsfl_38_idx, getSecureSignedToken( sPrefix+sGXsfl_38_idx, localUtil.format( DecimalUtil.doubleToDec(A14565MAntCliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MANTARTCOD"+"_"+sGXsfl_38_idx, getSecureSignedToken( sPrefix+sGXsfl_38_idx, GXutil.rtrim( localUtil.format( A14567MAntArtCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MANTCOLNUM"+"_"+sGXsfl_38_idx, getSecureSignedToken( sPrefix+sGXsfl_38_idx, localUtil.format( DecimalUtil.doubleToDec(A14568MAntColNum), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MANTTIPMCO"+"_"+sGXsfl_38_idx, getSecureSignedToken( sPrefix+sGXsfl_38_idx, GXutil.rtrim( localUtil.format( A14569MAntTipMCo, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MANTMAQCOD"+"_"+sGXsfl_38_idx, getSecureSignedToken( sPrefix+sGXsfl_38_idx, GXutil.rtrim( localUtil.format( A14570MAntMaqCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MANTUSU"+"_"+sGXsfl_38_idx, getSecureSignedToken( sPrefix+sGXsfl_38_idx, GXutil.rtrim( localUtil.format( A14564MAntUsu, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MANTTKN"+"_"+sGXsfl_38_idx, getSecureSignedToken( sPrefix+sGXsfl_38_idx, GXutil.rtrim( localUtil.format( A14563MAntTkn, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MANTMETPOR"+"_"+sGXsfl_38_idx, getSecureSignedToken( sPrefix+sGXsfl_38_idx, localUtil.format( A14650MantMetPor, "ZZZ9.99")));
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
      AV98Anticipacionerrores_mant_filtradods_1_filterfulltext = AV12FilterFullText ;
      AV99Anticipacionerrores_mant_filtradods_2_tfmantid = AV40TFMAntId ;
      AV100Anticipacionerrores_mant_filtradods_3_tfmantid_to = AV41TFMAntId_To ;
      AV101Anticipacionerrores_mant_filtradods_4_tfmantemprcod = AV38TFMAntEmprCod ;
      AV102Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel = AV39TFMAntEmprCod_Sel ;
      AV103Anticipacionerrores_mant_filtradods_6_tfmantclicod = AV28TFMAntCliCod ;
      AV104Anticipacionerrores_mant_filtradods_7_tfmantclicod_to = AV29TFMAntCliCod_To ;
      AV105Anticipacionerrores_mant_filtradods_8_tfmantclinom = AV30TFMAntCliNom ;
      AV106Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel = AV31TFMAntCliNom_Sel ;
      AV107Anticipacionerrores_mant_filtradods_10_tfmantartcod = AV24TFMAntArtCod ;
      AV108Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel = AV25TFMAntArtCod_Sel ;
      AV109Anticipacionerrores_mant_filtradods_12_tfmantartdsc = AV26TFMAntArtDsc ;
      AV110Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel = AV27TFMAntArtDsc_Sel ;
      AV111Anticipacionerrores_mant_filtradods_14_tfmantcolnum = AV36TFMAntColNum ;
      AV112Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to = AV37TFMAntColNum_To ;
      AV113Anticipacionerrores_mant_filtradods_16_tfmantcolnom = AV34TFMAntColNom ;
      AV114Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel = AV35TFMAntColNom_Sel ;
      AV115Anticipacionerrores_mant_filtradods_18_tfmantcolcod = AV32TFMAntColCod ;
      AV116Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to = AV33TFMAntColCod_To ;
      AV117Anticipacionerrores_mant_filtradods_20_tfmantmaqcod = AV46TFMAntMaqCod ;
      AV118Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel = AV47TFMAntMaqCod_Sel ;
      AV119Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc = AV48TFMAntMaqDsc ;
      AV120Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel = AV49TFMAntMaqDsc_Sel ;
      AV121Anticipacionerrores_mant_filtradods_24_tfmanttipmcod = AV52TFMAntTipMCod ;
      AV122Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel = AV53TFMAntTipMCod_Sel ;
      AV123Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc = AV54TFMAntTipMDsc ;
      AV124Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel = AV55TFMAntTipMDsc_Sel ;
      AV125Anticipacionerrores_mant_filtradods_28_tfmantkiltot = AV72TFMAntKilTot ;
      AV126Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to = AV73TFMAntKilTot_To ;
      AV127Anticipacionerrores_mant_filtradods_30_tfmantkilprod = AV42TFMAntKilProd ;
      AV128Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to = AV43TFMAntKilProd_To ;
      AV129Anticipacionerrores_mant_filtradods_32_tfmantkilreo = AV44TFMAntKilReo ;
      AV130Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to = AV45TFMAntKilReo_To ;
      AV131Anticipacionerrores_mant_filtradods_34_tfmantporc = AV50TFMAntPorc ;
      AV132Anticipacionerrores_mant_filtradods_35_tfmantporc_to = AV51TFMAntPorc_To ;
      AV133Anticipacionerrores_mant_filtradods_36_tfmantmettot = AV87TFMAntMetTot ;
      AV134Anticipacionerrores_mant_filtradods_37_tfmantmettot_to = AV88TFMAntMetTot_To ;
      AV135Anticipacionerrores_mant_filtradods_38_tfmantmetprod = AV83TFMAntMetProd ;
      AV136Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to = AV84TFMAntMetProd_To ;
      AV137Anticipacionerrores_mant_filtradods_40_tfmantmetreo = AV85TFMAntMetReo ;
      AV138Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to = AV86TFMAntMetReo_To ;
      AV139Anticipacionerrores_mant_filtradods_42_tfmantmetpor = AV89TFMantMetPor ;
      AV140Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to = AV90TFMantMetPor_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A14569MAntTipMCo ,
                                           AV69TipMaqCodCollection ,
                                           AV98Anticipacionerrores_mant_filtradods_1_filterfulltext ,
                                           Long.valueOf(AV99Anticipacionerrores_mant_filtradods_2_tfmantid) ,
                                           Long.valueOf(AV100Anticipacionerrores_mant_filtradods_3_tfmantid_to) ,
                                           AV102Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel ,
                                           AV101Anticipacionerrores_mant_filtradods_4_tfmantemprcod ,
                                           Integer.valueOf(AV103Anticipacionerrores_mant_filtradods_6_tfmantclicod) ,
                                           Integer.valueOf(AV104Anticipacionerrores_mant_filtradods_7_tfmantclicod_to) ,
                                           AV106Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel ,
                                           AV105Anticipacionerrores_mant_filtradods_8_tfmantclinom ,
                                           AV108Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel ,
                                           AV107Anticipacionerrores_mant_filtradods_10_tfmantartcod ,
                                           AV110Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel ,
                                           AV109Anticipacionerrores_mant_filtradods_12_tfmantartdsc ,
                                           Integer.valueOf(AV111Anticipacionerrores_mant_filtradods_14_tfmantcolnum) ,
                                           Integer.valueOf(AV112Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to) ,
                                           AV114Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel ,
                                           AV113Anticipacionerrores_mant_filtradods_16_tfmantcolnom ,
                                           Byte.valueOf(AV115Anticipacionerrores_mant_filtradods_18_tfmantcolcod) ,
                                           Byte.valueOf(AV116Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to) ,
                                           AV118Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel ,
                                           AV117Anticipacionerrores_mant_filtradods_20_tfmantmaqcod ,
                                           AV120Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel ,
                                           AV119Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc ,
                                           AV122Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel ,
                                           AV121Anticipacionerrores_mant_filtradods_24_tfmanttipmcod ,
                                           AV124Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel ,
                                           AV123Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc ,
                                           AV125Anticipacionerrores_mant_filtradods_28_tfmantkiltot ,
                                           AV126Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to ,
                                           AV127Anticipacionerrores_mant_filtradods_30_tfmantkilprod ,
                                           AV128Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to ,
                                           AV129Anticipacionerrores_mant_filtradods_32_tfmantkilreo ,
                                           AV130Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to ,
                                           AV131Anticipacionerrores_mant_filtradods_34_tfmantporc ,
                                           AV132Anticipacionerrores_mant_filtradods_35_tfmantporc_to ,
                                           AV133Anticipacionerrores_mant_filtradods_36_tfmantmettot ,
                                           AV134Anticipacionerrores_mant_filtradods_37_tfmantmettot_to ,
                                           AV135Anticipacionerrores_mant_filtradods_38_tfmantmetprod ,
                                           AV136Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to ,
                                           AV137Anticipacionerrores_mant_filtradods_40_tfmantmetreo ,
                                           AV138Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to ,
                                           AV139Anticipacionerrores_mant_filtradods_42_tfmantmetpor ,
                                           AV140Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to ,
                                           AV66ArtCod ,
                                           Integer.valueOf(AV67ForColNum) ,
                                           Integer.valueOf(AV69TipMaqCodCollection.size()) ,
                                           Long.valueOf(A14562MAntId) ,
                                           A14566MAntEmprCo ,
                                           Integer.valueOf(A14565MAntCliCod) ,
                                           A14611MAntCliNom ,
                                           A14567MAntArtCod ,
                                           A14613MAntArtDsc ,
                                           Integer.valueOf(A14568MAntColNum) ,
                                           A14623MAntColNom ,
                                           Byte.valueOf(A14642MAntColCod) ,
                                           A14570MAntMaqCod ,
                                           A14610MAntMaqDsc ,
                                           A14612MAntTipMDs ,
                                           A14646MAntKilTot ,
                                           A14643MAntKilPro ,
                                           A14644MAntKilReo ,
                                           A14647MAntMetTot ,
                                           A14648MAntMetPro ,
                                           A14649MAntMetReo ,
                                           Short.valueOf(AV20OrderedBy) ,
                                           Boolean.valueOf(AV22OrderedDsc) ,
                                           AV78sdtMTok.getgxTv_SdtsdtMTok_Mtkn() ,
                                           AV78sdtMTok.getgxTv_SdtsdtMTok_Mtknusu() ,
                                           Integer.valueOf(AV65CliCod) ,
                                           AV61MAntEmprCod ,
                                           A14563MAntTkn ,
                                           A14564MAntUsu } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV98Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV98Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV98Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV98Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV98Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV98Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV98Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV98Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV98Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV98Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV98Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV98Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV98Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV98Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV98Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV98Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV98Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV98Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV98Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV98Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV98Anticipacionerrores_mant_filtradods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Anticipacionerrores_mant_filtradods_1_filterfulltext), "%", "") ;
      lV101Anticipacionerrores_mant_filtradods_4_tfmantemprcod = GXutil.padr( GXutil.rtrim( AV101Anticipacionerrores_mant_filtradods_4_tfmantemprcod), 3, "%") ;
      lV105Anticipacionerrores_mant_filtradods_8_tfmantclinom = GXutil.concat( GXutil.rtrim( AV105Anticipacionerrores_mant_filtradods_8_tfmantclinom), "%", "") ;
      lV107Anticipacionerrores_mant_filtradods_10_tfmantartcod = GXutil.padr( GXutil.rtrim( AV107Anticipacionerrores_mant_filtradods_10_tfmantartcod), 16, "%") ;
      lV109Anticipacionerrores_mant_filtradods_12_tfmantartdsc = GXutil.concat( GXutil.rtrim( AV109Anticipacionerrores_mant_filtradods_12_tfmantartdsc), "%", "") ;
      lV113Anticipacionerrores_mant_filtradods_16_tfmantcolnom = GXutil.padr( GXutil.rtrim( AV113Anticipacionerrores_mant_filtradods_16_tfmantcolnom), 13, "%") ;
      lV117Anticipacionerrores_mant_filtradods_20_tfmantmaqcod = GXutil.padr( GXutil.rtrim( AV117Anticipacionerrores_mant_filtradods_20_tfmantmaqcod), 6, "%") ;
      lV119Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc = GXutil.concat( GXutil.rtrim( AV119Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc), "%", "") ;
      lV121Anticipacionerrores_mant_filtradods_24_tfmanttipmcod = GXutil.padr( GXutil.rtrim( AV121Anticipacionerrores_mant_filtradods_24_tfmanttipmcod), 4, "%") ;
      lV123Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc = GXutil.concat( GXutil.rtrim( AV123Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc), "%", "") ;
      /* Using cursor H02DQ3 */
      pr_default.execute(1, new Object[] {AV78sdtMTok.getgxTv_SdtsdtMTok_Mtkn(), AV78sdtMTok.getgxTv_SdtsdtMTok_Mtknusu(), Integer.valueOf(AV65CliCod), AV61MAntEmprCod, lV98Anticipacionerrores_mant_filtradods_1_filterfulltext, lV98Anticipacionerrores_mant_filtradods_1_filterfulltext, lV98Anticipacionerrores_mant_filtradods_1_filterfulltext, lV98Anticipacionerrores_mant_filtradods_1_filterfulltext, lV98Anticipacionerrores_mant_filtradods_1_filterfulltext, lV98Anticipacionerrores_mant_filtradods_1_filterfulltext, lV98Anticipacionerrores_mant_filtradods_1_filterfulltext, lV98Anticipacionerrores_mant_filtradods_1_filterfulltext, lV98Anticipacionerrores_mant_filtradods_1_filterfulltext, lV98Anticipacionerrores_mant_filtradods_1_filterfulltext, lV98Anticipacionerrores_mant_filtradods_1_filterfulltext, lV98Anticipacionerrores_mant_filtradods_1_filterfulltext, lV98Anticipacionerrores_mant_filtradods_1_filterfulltext, lV98Anticipacionerrores_mant_filtradods_1_filterfulltext, lV98Anticipacionerrores_mant_filtradods_1_filterfulltext, lV98Anticipacionerrores_mant_filtradods_1_filterfulltext, lV98Anticipacionerrores_mant_filtradods_1_filterfulltext, lV98Anticipacionerrores_mant_filtradods_1_filterfulltext, lV98Anticipacionerrores_mant_filtradods_1_filterfulltext, lV98Anticipacionerrores_mant_filtradods_1_filterfulltext, lV98Anticipacionerrores_mant_filtradods_1_filterfulltext, Long.valueOf(AV99Anticipacionerrores_mant_filtradods_2_tfmantid), Long.valueOf(AV100Anticipacionerrores_mant_filtradods_3_tfmantid_to), lV101Anticipacionerrores_mant_filtradods_4_tfmantemprcod, AV102Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel, Integer.valueOf(AV103Anticipacionerrores_mant_filtradods_6_tfmantclicod), Integer.valueOf(AV104Anticipacionerrores_mant_filtradods_7_tfmantclicod_to), lV105Anticipacionerrores_mant_filtradods_8_tfmantclinom, AV106Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel, lV107Anticipacionerrores_mant_filtradods_10_tfmantartcod, AV108Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel, lV109Anticipacionerrores_mant_filtradods_12_tfmantartdsc, AV110Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel, Integer.valueOf(AV111Anticipacionerrores_mant_filtradods_14_tfmantcolnum), Integer.valueOf(AV112Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to), lV113Anticipacionerrores_mant_filtradods_16_tfmantcolnom, AV114Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel, Byte.valueOf(AV115Anticipacionerrores_mant_filtradods_18_tfmantcolcod), Byte.valueOf(AV116Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to), lV117Anticipacionerrores_mant_filtradods_20_tfmantmaqcod, AV118Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel, lV119Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc, AV120Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel, lV121Anticipacionerrores_mant_filtradods_24_tfmanttipmcod, AV122Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel, lV123Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc, AV124Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel, AV125Anticipacionerrores_mant_filtradods_28_tfmantkiltot, AV126Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to, AV127Anticipacionerrores_mant_filtradods_30_tfmantkilprod, AV128Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to, AV129Anticipacionerrores_mant_filtradods_32_tfmantkilreo, AV130Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to, AV131Anticipacionerrores_mant_filtradods_34_tfmantporc, AV132Anticipacionerrores_mant_filtradods_35_tfmantporc_to, AV133Anticipacionerrores_mant_filtradods_36_tfmantmettot, AV134Anticipacionerrores_mant_filtradods_37_tfmantmettot_to, AV135Anticipacionerrores_mant_filtradods_38_tfmantmetprod, AV136Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to, AV137Anticipacionerrores_mant_filtradods_40_tfmantmetreo, AV138Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to, AV139Anticipacionerrores_mant_filtradods_42_tfmantmetpor, AV140Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to, AV66ArtCod, Integer.valueOf(AV67ForColNum)});
      GRID_nRecordCount = H02DQ3_AGRID_nRecordCount[0] ;
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
      AV98Anticipacionerrores_mant_filtradods_1_filterfulltext = AV12FilterFullText ;
      AV99Anticipacionerrores_mant_filtradods_2_tfmantid = AV40TFMAntId ;
      AV100Anticipacionerrores_mant_filtradods_3_tfmantid_to = AV41TFMAntId_To ;
      AV101Anticipacionerrores_mant_filtradods_4_tfmantemprcod = AV38TFMAntEmprCod ;
      AV102Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel = AV39TFMAntEmprCod_Sel ;
      AV103Anticipacionerrores_mant_filtradods_6_tfmantclicod = AV28TFMAntCliCod ;
      AV104Anticipacionerrores_mant_filtradods_7_tfmantclicod_to = AV29TFMAntCliCod_To ;
      AV105Anticipacionerrores_mant_filtradods_8_tfmantclinom = AV30TFMAntCliNom ;
      AV106Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel = AV31TFMAntCliNom_Sel ;
      AV107Anticipacionerrores_mant_filtradods_10_tfmantartcod = AV24TFMAntArtCod ;
      AV108Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel = AV25TFMAntArtCod_Sel ;
      AV109Anticipacionerrores_mant_filtradods_12_tfmantartdsc = AV26TFMAntArtDsc ;
      AV110Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel = AV27TFMAntArtDsc_Sel ;
      AV111Anticipacionerrores_mant_filtradods_14_tfmantcolnum = AV36TFMAntColNum ;
      AV112Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to = AV37TFMAntColNum_To ;
      AV113Anticipacionerrores_mant_filtradods_16_tfmantcolnom = AV34TFMAntColNom ;
      AV114Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel = AV35TFMAntColNom_Sel ;
      AV115Anticipacionerrores_mant_filtradods_18_tfmantcolcod = AV32TFMAntColCod ;
      AV116Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to = AV33TFMAntColCod_To ;
      AV117Anticipacionerrores_mant_filtradods_20_tfmantmaqcod = AV46TFMAntMaqCod ;
      AV118Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel = AV47TFMAntMaqCod_Sel ;
      AV119Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc = AV48TFMAntMaqDsc ;
      AV120Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel = AV49TFMAntMaqDsc_Sel ;
      AV121Anticipacionerrores_mant_filtradods_24_tfmanttipmcod = AV52TFMAntTipMCod ;
      AV122Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel = AV53TFMAntTipMCod_Sel ;
      AV123Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc = AV54TFMAntTipMDsc ;
      AV124Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel = AV55TFMAntTipMDsc_Sel ;
      AV125Anticipacionerrores_mant_filtradods_28_tfmantkiltot = AV72TFMAntKilTot ;
      AV126Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to = AV73TFMAntKilTot_To ;
      AV127Anticipacionerrores_mant_filtradods_30_tfmantkilprod = AV42TFMAntKilProd ;
      AV128Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to = AV43TFMAntKilProd_To ;
      AV129Anticipacionerrores_mant_filtradods_32_tfmantkilreo = AV44TFMAntKilReo ;
      AV130Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to = AV45TFMAntKilReo_To ;
      AV131Anticipacionerrores_mant_filtradods_34_tfmantporc = AV50TFMAntPorc ;
      AV132Anticipacionerrores_mant_filtradods_35_tfmantporc_to = AV51TFMAntPorc_To ;
      AV133Anticipacionerrores_mant_filtradods_36_tfmantmettot = AV87TFMAntMetTot ;
      AV134Anticipacionerrores_mant_filtradods_37_tfmantmettot_to = AV88TFMAntMetTot_To ;
      AV135Anticipacionerrores_mant_filtradods_38_tfmantmetprod = AV83TFMAntMetProd ;
      AV136Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to = AV84TFMAntMetProd_To ;
      AV137Anticipacionerrores_mant_filtradods_40_tfmantmetreo = AV85TFMAntMetReo ;
      AV138Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to = AV86TFMAntMetReo_To ;
      AV139Anticipacionerrores_mant_filtradods_42_tfmantmetpor = AV89TFMantMetPor ;
      AV140Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to = AV90TFMantMetPor_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV12FilterFullText, AV61MAntEmprCod, AV65CliCod, AV66ArtCod, AV67ForColNum, AV69TipMaqCodCollection, AV78sdtMTok, AV18ManageFiltersExecutionStep, AV6ColumnsSelector, AV40TFMAntId, AV41TFMAntId_To, AV38TFMAntEmprCod, AV39TFMAntEmprCod_Sel, AV28TFMAntCliCod, AV29TFMAntCliCod_To, AV30TFMAntCliNom, AV31TFMAntCliNom_Sel, AV24TFMAntArtCod, AV25TFMAntArtCod_Sel, AV26TFMAntArtDsc, AV27TFMAntArtDsc_Sel, AV36TFMAntColNum, AV37TFMAntColNum_To, AV34TFMAntColNom, AV35TFMAntColNom_Sel, AV32TFMAntColCod, AV33TFMAntColCod_To, AV46TFMAntMaqCod, AV47TFMAntMaqCod_Sel, AV48TFMAntMaqDsc, AV49TFMAntMaqDsc_Sel, AV52TFMAntTipMCod, AV53TFMAntTipMCod_Sel, AV54TFMAntTipMDsc, AV55TFMAntTipMDsc_Sel, AV72TFMAntKilTot, AV73TFMAntKilTot_To, AV42TFMAntKilProd, AV43TFMAntKilProd_To, AV44TFMAntKilReo, AV45TFMAntKilReo_To, AV50TFMAntPorc, AV51TFMAntPorc_To, AV87TFMAntMetTot, AV88TFMAntMetTot_To, AV83TFMAntMetProd, AV84TFMAntMetProd_To, AV85TFMAntMetReo, AV86TFMAntMetReo_To, AV89TFMantMetPor, AV90TFMantMetPor_To, AV97Pgmname, AV20OrderedBy, AV22OrderedDsc, AV68TipMaqCodJSON, AV70FechaInicio, AV71FechaFin, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV98Anticipacionerrores_mant_filtradods_1_filterfulltext = AV12FilterFullText ;
      AV99Anticipacionerrores_mant_filtradods_2_tfmantid = AV40TFMAntId ;
      AV100Anticipacionerrores_mant_filtradods_3_tfmantid_to = AV41TFMAntId_To ;
      AV101Anticipacionerrores_mant_filtradods_4_tfmantemprcod = AV38TFMAntEmprCod ;
      AV102Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel = AV39TFMAntEmprCod_Sel ;
      AV103Anticipacionerrores_mant_filtradods_6_tfmantclicod = AV28TFMAntCliCod ;
      AV104Anticipacionerrores_mant_filtradods_7_tfmantclicod_to = AV29TFMAntCliCod_To ;
      AV105Anticipacionerrores_mant_filtradods_8_tfmantclinom = AV30TFMAntCliNom ;
      AV106Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel = AV31TFMAntCliNom_Sel ;
      AV107Anticipacionerrores_mant_filtradods_10_tfmantartcod = AV24TFMAntArtCod ;
      AV108Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel = AV25TFMAntArtCod_Sel ;
      AV109Anticipacionerrores_mant_filtradods_12_tfmantartdsc = AV26TFMAntArtDsc ;
      AV110Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel = AV27TFMAntArtDsc_Sel ;
      AV111Anticipacionerrores_mant_filtradods_14_tfmantcolnum = AV36TFMAntColNum ;
      AV112Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to = AV37TFMAntColNum_To ;
      AV113Anticipacionerrores_mant_filtradods_16_tfmantcolnom = AV34TFMAntColNom ;
      AV114Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel = AV35TFMAntColNom_Sel ;
      AV115Anticipacionerrores_mant_filtradods_18_tfmantcolcod = AV32TFMAntColCod ;
      AV116Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to = AV33TFMAntColCod_To ;
      AV117Anticipacionerrores_mant_filtradods_20_tfmantmaqcod = AV46TFMAntMaqCod ;
      AV118Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel = AV47TFMAntMaqCod_Sel ;
      AV119Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc = AV48TFMAntMaqDsc ;
      AV120Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel = AV49TFMAntMaqDsc_Sel ;
      AV121Anticipacionerrores_mant_filtradods_24_tfmanttipmcod = AV52TFMAntTipMCod ;
      AV122Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel = AV53TFMAntTipMCod_Sel ;
      AV123Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc = AV54TFMAntTipMDsc ;
      AV124Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel = AV55TFMAntTipMDsc_Sel ;
      AV125Anticipacionerrores_mant_filtradods_28_tfmantkiltot = AV72TFMAntKilTot ;
      AV126Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to = AV73TFMAntKilTot_To ;
      AV127Anticipacionerrores_mant_filtradods_30_tfmantkilprod = AV42TFMAntKilProd ;
      AV128Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to = AV43TFMAntKilProd_To ;
      AV129Anticipacionerrores_mant_filtradods_32_tfmantkilreo = AV44TFMAntKilReo ;
      AV130Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to = AV45TFMAntKilReo_To ;
      AV131Anticipacionerrores_mant_filtradods_34_tfmantporc = AV50TFMAntPorc ;
      AV132Anticipacionerrores_mant_filtradods_35_tfmantporc_to = AV51TFMAntPorc_To ;
      AV133Anticipacionerrores_mant_filtradods_36_tfmantmettot = AV87TFMAntMetTot ;
      AV134Anticipacionerrores_mant_filtradods_37_tfmantmettot_to = AV88TFMAntMetTot_To ;
      AV135Anticipacionerrores_mant_filtradods_38_tfmantmetprod = AV83TFMAntMetProd ;
      AV136Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to = AV84TFMAntMetProd_To ;
      AV137Anticipacionerrores_mant_filtradods_40_tfmantmetreo = AV85TFMAntMetReo ;
      AV138Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to = AV86TFMAntMetReo_To ;
      AV139Anticipacionerrores_mant_filtradods_42_tfmantmetpor = AV89TFMantMetPor ;
      AV140Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to = AV90TFMantMetPor_To ;
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( ( GRID_nRecordCount >= subgrid_fnc_recordsperpage( ) ) && ( GRID_nEOF == 0 ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      if ( GRID_nEOF == 1 )
      {
         GRID_nFirstRecordOnPage = GRID_nCurrentRecord ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV12FilterFullText, AV61MAntEmprCod, AV65CliCod, AV66ArtCod, AV67ForColNum, AV69TipMaqCodCollection, AV78sdtMTok, AV18ManageFiltersExecutionStep, AV6ColumnsSelector, AV40TFMAntId, AV41TFMAntId_To, AV38TFMAntEmprCod, AV39TFMAntEmprCod_Sel, AV28TFMAntCliCod, AV29TFMAntCliCod_To, AV30TFMAntCliNom, AV31TFMAntCliNom_Sel, AV24TFMAntArtCod, AV25TFMAntArtCod_Sel, AV26TFMAntArtDsc, AV27TFMAntArtDsc_Sel, AV36TFMAntColNum, AV37TFMAntColNum_To, AV34TFMAntColNom, AV35TFMAntColNom_Sel, AV32TFMAntColCod, AV33TFMAntColCod_To, AV46TFMAntMaqCod, AV47TFMAntMaqCod_Sel, AV48TFMAntMaqDsc, AV49TFMAntMaqDsc_Sel, AV52TFMAntTipMCod, AV53TFMAntTipMCod_Sel, AV54TFMAntTipMDsc, AV55TFMAntTipMDsc_Sel, AV72TFMAntKilTot, AV73TFMAntKilTot_To, AV42TFMAntKilProd, AV43TFMAntKilProd_To, AV44TFMAntKilReo, AV45TFMAntKilReo_To, AV50TFMAntPorc, AV51TFMAntPorc_To, AV87TFMAntMetTot, AV88TFMAntMetTot_To, AV83TFMAntMetProd, AV84TFMAntMetProd_To, AV85TFMAntMetReo, AV86TFMAntMetReo_To, AV89TFMantMetPor, AV90TFMantMetPor_To, AV97Pgmname, AV20OrderedBy, AV22OrderedDsc, AV68TipMaqCodJSON, AV70FechaInicio, AV71FechaFin, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV98Anticipacionerrores_mant_filtradods_1_filterfulltext = AV12FilterFullText ;
      AV99Anticipacionerrores_mant_filtradods_2_tfmantid = AV40TFMAntId ;
      AV100Anticipacionerrores_mant_filtradods_3_tfmantid_to = AV41TFMAntId_To ;
      AV101Anticipacionerrores_mant_filtradods_4_tfmantemprcod = AV38TFMAntEmprCod ;
      AV102Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel = AV39TFMAntEmprCod_Sel ;
      AV103Anticipacionerrores_mant_filtradods_6_tfmantclicod = AV28TFMAntCliCod ;
      AV104Anticipacionerrores_mant_filtradods_7_tfmantclicod_to = AV29TFMAntCliCod_To ;
      AV105Anticipacionerrores_mant_filtradods_8_tfmantclinom = AV30TFMAntCliNom ;
      AV106Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel = AV31TFMAntCliNom_Sel ;
      AV107Anticipacionerrores_mant_filtradods_10_tfmantartcod = AV24TFMAntArtCod ;
      AV108Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel = AV25TFMAntArtCod_Sel ;
      AV109Anticipacionerrores_mant_filtradods_12_tfmantartdsc = AV26TFMAntArtDsc ;
      AV110Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel = AV27TFMAntArtDsc_Sel ;
      AV111Anticipacionerrores_mant_filtradods_14_tfmantcolnum = AV36TFMAntColNum ;
      AV112Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to = AV37TFMAntColNum_To ;
      AV113Anticipacionerrores_mant_filtradods_16_tfmantcolnom = AV34TFMAntColNom ;
      AV114Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel = AV35TFMAntColNom_Sel ;
      AV115Anticipacionerrores_mant_filtradods_18_tfmantcolcod = AV32TFMAntColCod ;
      AV116Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to = AV33TFMAntColCod_To ;
      AV117Anticipacionerrores_mant_filtradods_20_tfmantmaqcod = AV46TFMAntMaqCod ;
      AV118Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel = AV47TFMAntMaqCod_Sel ;
      AV119Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc = AV48TFMAntMaqDsc ;
      AV120Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel = AV49TFMAntMaqDsc_Sel ;
      AV121Anticipacionerrores_mant_filtradods_24_tfmanttipmcod = AV52TFMAntTipMCod ;
      AV122Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel = AV53TFMAntTipMCod_Sel ;
      AV123Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc = AV54TFMAntTipMDsc ;
      AV124Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel = AV55TFMAntTipMDsc_Sel ;
      AV125Anticipacionerrores_mant_filtradods_28_tfmantkiltot = AV72TFMAntKilTot ;
      AV126Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to = AV73TFMAntKilTot_To ;
      AV127Anticipacionerrores_mant_filtradods_30_tfmantkilprod = AV42TFMAntKilProd ;
      AV128Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to = AV43TFMAntKilProd_To ;
      AV129Anticipacionerrores_mant_filtradods_32_tfmantkilreo = AV44TFMAntKilReo ;
      AV130Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to = AV45TFMAntKilReo_To ;
      AV131Anticipacionerrores_mant_filtradods_34_tfmantporc = AV50TFMAntPorc ;
      AV132Anticipacionerrores_mant_filtradods_35_tfmantporc_to = AV51TFMAntPorc_To ;
      AV133Anticipacionerrores_mant_filtradods_36_tfmantmettot = AV87TFMAntMetTot ;
      AV134Anticipacionerrores_mant_filtradods_37_tfmantmettot_to = AV88TFMAntMetTot_To ;
      AV135Anticipacionerrores_mant_filtradods_38_tfmantmetprod = AV83TFMAntMetProd ;
      AV136Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to = AV84TFMAntMetProd_To ;
      AV137Anticipacionerrores_mant_filtradods_40_tfmantmetreo = AV85TFMAntMetReo ;
      AV138Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to = AV86TFMAntMetReo_To ;
      AV139Anticipacionerrores_mant_filtradods_42_tfmantmetpor = AV89TFMantMetPor ;
      AV140Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to = AV90TFMantMetPor_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV12FilterFullText, AV61MAntEmprCod, AV65CliCod, AV66ArtCod, AV67ForColNum, AV69TipMaqCodCollection, AV78sdtMTok, AV18ManageFiltersExecutionStep, AV6ColumnsSelector, AV40TFMAntId, AV41TFMAntId_To, AV38TFMAntEmprCod, AV39TFMAntEmprCod_Sel, AV28TFMAntCliCod, AV29TFMAntCliCod_To, AV30TFMAntCliNom, AV31TFMAntCliNom_Sel, AV24TFMAntArtCod, AV25TFMAntArtCod_Sel, AV26TFMAntArtDsc, AV27TFMAntArtDsc_Sel, AV36TFMAntColNum, AV37TFMAntColNum_To, AV34TFMAntColNom, AV35TFMAntColNom_Sel, AV32TFMAntColCod, AV33TFMAntColCod_To, AV46TFMAntMaqCod, AV47TFMAntMaqCod_Sel, AV48TFMAntMaqDsc, AV49TFMAntMaqDsc_Sel, AV52TFMAntTipMCod, AV53TFMAntTipMCod_Sel, AV54TFMAntTipMDsc, AV55TFMAntTipMDsc_Sel, AV72TFMAntKilTot, AV73TFMAntKilTot_To, AV42TFMAntKilProd, AV43TFMAntKilProd_To, AV44TFMAntKilReo, AV45TFMAntKilReo_To, AV50TFMAntPorc, AV51TFMAntPorc_To, AV87TFMAntMetTot, AV88TFMAntMetTot_To, AV83TFMAntMetProd, AV84TFMAntMetProd_To, AV85TFMAntMetReo, AV86TFMAntMetReo_To, AV89TFMantMetPor, AV90TFMantMetPor_To, AV97Pgmname, AV20OrderedBy, AV22OrderedDsc, AV68TipMaqCodJSON, AV70FechaInicio, AV71FechaFin, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV98Anticipacionerrores_mant_filtradods_1_filterfulltext = AV12FilterFullText ;
      AV99Anticipacionerrores_mant_filtradods_2_tfmantid = AV40TFMAntId ;
      AV100Anticipacionerrores_mant_filtradods_3_tfmantid_to = AV41TFMAntId_To ;
      AV101Anticipacionerrores_mant_filtradods_4_tfmantemprcod = AV38TFMAntEmprCod ;
      AV102Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel = AV39TFMAntEmprCod_Sel ;
      AV103Anticipacionerrores_mant_filtradods_6_tfmantclicod = AV28TFMAntCliCod ;
      AV104Anticipacionerrores_mant_filtradods_7_tfmantclicod_to = AV29TFMAntCliCod_To ;
      AV105Anticipacionerrores_mant_filtradods_8_tfmantclinom = AV30TFMAntCliNom ;
      AV106Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel = AV31TFMAntCliNom_Sel ;
      AV107Anticipacionerrores_mant_filtradods_10_tfmantartcod = AV24TFMAntArtCod ;
      AV108Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel = AV25TFMAntArtCod_Sel ;
      AV109Anticipacionerrores_mant_filtradods_12_tfmantartdsc = AV26TFMAntArtDsc ;
      AV110Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel = AV27TFMAntArtDsc_Sel ;
      AV111Anticipacionerrores_mant_filtradods_14_tfmantcolnum = AV36TFMAntColNum ;
      AV112Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to = AV37TFMAntColNum_To ;
      AV113Anticipacionerrores_mant_filtradods_16_tfmantcolnom = AV34TFMAntColNom ;
      AV114Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel = AV35TFMAntColNom_Sel ;
      AV115Anticipacionerrores_mant_filtradods_18_tfmantcolcod = AV32TFMAntColCod ;
      AV116Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to = AV33TFMAntColCod_To ;
      AV117Anticipacionerrores_mant_filtradods_20_tfmantmaqcod = AV46TFMAntMaqCod ;
      AV118Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel = AV47TFMAntMaqCod_Sel ;
      AV119Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc = AV48TFMAntMaqDsc ;
      AV120Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel = AV49TFMAntMaqDsc_Sel ;
      AV121Anticipacionerrores_mant_filtradods_24_tfmanttipmcod = AV52TFMAntTipMCod ;
      AV122Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel = AV53TFMAntTipMCod_Sel ;
      AV123Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc = AV54TFMAntTipMDsc ;
      AV124Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel = AV55TFMAntTipMDsc_Sel ;
      AV125Anticipacionerrores_mant_filtradods_28_tfmantkiltot = AV72TFMAntKilTot ;
      AV126Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to = AV73TFMAntKilTot_To ;
      AV127Anticipacionerrores_mant_filtradods_30_tfmantkilprod = AV42TFMAntKilProd ;
      AV128Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to = AV43TFMAntKilProd_To ;
      AV129Anticipacionerrores_mant_filtradods_32_tfmantkilreo = AV44TFMAntKilReo ;
      AV130Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to = AV45TFMAntKilReo_To ;
      AV131Anticipacionerrores_mant_filtradods_34_tfmantporc = AV50TFMAntPorc ;
      AV132Anticipacionerrores_mant_filtradods_35_tfmantporc_to = AV51TFMAntPorc_To ;
      AV133Anticipacionerrores_mant_filtradods_36_tfmantmettot = AV87TFMAntMetTot ;
      AV134Anticipacionerrores_mant_filtradods_37_tfmantmettot_to = AV88TFMAntMetTot_To ;
      AV135Anticipacionerrores_mant_filtradods_38_tfmantmetprod = AV83TFMAntMetProd ;
      AV136Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to = AV84TFMAntMetProd_To ;
      AV137Anticipacionerrores_mant_filtradods_40_tfmantmetreo = AV85TFMAntMetReo ;
      AV138Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to = AV86TFMAntMetReo_To ;
      AV139Anticipacionerrores_mant_filtradods_42_tfmantmetpor = AV89TFMantMetPor ;
      AV140Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to = AV90TFMantMetPor_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV12FilterFullText, AV61MAntEmprCod, AV65CliCod, AV66ArtCod, AV67ForColNum, AV69TipMaqCodCollection, AV78sdtMTok, AV18ManageFiltersExecutionStep, AV6ColumnsSelector, AV40TFMAntId, AV41TFMAntId_To, AV38TFMAntEmprCod, AV39TFMAntEmprCod_Sel, AV28TFMAntCliCod, AV29TFMAntCliCod_To, AV30TFMAntCliNom, AV31TFMAntCliNom_Sel, AV24TFMAntArtCod, AV25TFMAntArtCod_Sel, AV26TFMAntArtDsc, AV27TFMAntArtDsc_Sel, AV36TFMAntColNum, AV37TFMAntColNum_To, AV34TFMAntColNom, AV35TFMAntColNom_Sel, AV32TFMAntColCod, AV33TFMAntColCod_To, AV46TFMAntMaqCod, AV47TFMAntMaqCod_Sel, AV48TFMAntMaqDsc, AV49TFMAntMaqDsc_Sel, AV52TFMAntTipMCod, AV53TFMAntTipMCod_Sel, AV54TFMAntTipMDsc, AV55TFMAntTipMDsc_Sel, AV72TFMAntKilTot, AV73TFMAntKilTot_To, AV42TFMAntKilProd, AV43TFMAntKilProd_To, AV44TFMAntKilReo, AV45TFMAntKilReo_To, AV50TFMAntPorc, AV51TFMAntPorc_To, AV87TFMAntMetTot, AV88TFMAntMetTot_To, AV83TFMAntMetProd, AV84TFMAntMetProd_To, AV85TFMAntMetReo, AV86TFMAntMetReo_To, AV89TFMantMetPor, AV90TFMantMetPor_To, AV97Pgmname, AV20OrderedBy, AV22OrderedDsc, AV68TipMaqCodJSON, AV70FechaInicio, AV71FechaFin, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV98Anticipacionerrores_mant_filtradods_1_filterfulltext = AV12FilterFullText ;
      AV99Anticipacionerrores_mant_filtradods_2_tfmantid = AV40TFMAntId ;
      AV100Anticipacionerrores_mant_filtradods_3_tfmantid_to = AV41TFMAntId_To ;
      AV101Anticipacionerrores_mant_filtradods_4_tfmantemprcod = AV38TFMAntEmprCod ;
      AV102Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel = AV39TFMAntEmprCod_Sel ;
      AV103Anticipacionerrores_mant_filtradods_6_tfmantclicod = AV28TFMAntCliCod ;
      AV104Anticipacionerrores_mant_filtradods_7_tfmantclicod_to = AV29TFMAntCliCod_To ;
      AV105Anticipacionerrores_mant_filtradods_8_tfmantclinom = AV30TFMAntCliNom ;
      AV106Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel = AV31TFMAntCliNom_Sel ;
      AV107Anticipacionerrores_mant_filtradods_10_tfmantartcod = AV24TFMAntArtCod ;
      AV108Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel = AV25TFMAntArtCod_Sel ;
      AV109Anticipacionerrores_mant_filtradods_12_tfmantartdsc = AV26TFMAntArtDsc ;
      AV110Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel = AV27TFMAntArtDsc_Sel ;
      AV111Anticipacionerrores_mant_filtradods_14_tfmantcolnum = AV36TFMAntColNum ;
      AV112Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to = AV37TFMAntColNum_To ;
      AV113Anticipacionerrores_mant_filtradods_16_tfmantcolnom = AV34TFMAntColNom ;
      AV114Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel = AV35TFMAntColNom_Sel ;
      AV115Anticipacionerrores_mant_filtradods_18_tfmantcolcod = AV32TFMAntColCod ;
      AV116Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to = AV33TFMAntColCod_To ;
      AV117Anticipacionerrores_mant_filtradods_20_tfmantmaqcod = AV46TFMAntMaqCod ;
      AV118Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel = AV47TFMAntMaqCod_Sel ;
      AV119Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc = AV48TFMAntMaqDsc ;
      AV120Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel = AV49TFMAntMaqDsc_Sel ;
      AV121Anticipacionerrores_mant_filtradods_24_tfmanttipmcod = AV52TFMAntTipMCod ;
      AV122Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel = AV53TFMAntTipMCod_Sel ;
      AV123Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc = AV54TFMAntTipMDsc ;
      AV124Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel = AV55TFMAntTipMDsc_Sel ;
      AV125Anticipacionerrores_mant_filtradods_28_tfmantkiltot = AV72TFMAntKilTot ;
      AV126Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to = AV73TFMAntKilTot_To ;
      AV127Anticipacionerrores_mant_filtradods_30_tfmantkilprod = AV42TFMAntKilProd ;
      AV128Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to = AV43TFMAntKilProd_To ;
      AV129Anticipacionerrores_mant_filtradods_32_tfmantkilreo = AV44TFMAntKilReo ;
      AV130Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to = AV45TFMAntKilReo_To ;
      AV131Anticipacionerrores_mant_filtradods_34_tfmantporc = AV50TFMAntPorc ;
      AV132Anticipacionerrores_mant_filtradods_35_tfmantporc_to = AV51TFMAntPorc_To ;
      AV133Anticipacionerrores_mant_filtradods_36_tfmantmettot = AV87TFMAntMetTot ;
      AV134Anticipacionerrores_mant_filtradods_37_tfmantmettot_to = AV88TFMAntMetTot_To ;
      AV135Anticipacionerrores_mant_filtradods_38_tfmantmetprod = AV83TFMAntMetProd ;
      AV136Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to = AV84TFMAntMetProd_To ;
      AV137Anticipacionerrores_mant_filtradods_40_tfmantmetreo = AV85TFMAntMetReo ;
      AV138Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to = AV86TFMAntMetReo_To ;
      AV139Anticipacionerrores_mant_filtradods_42_tfmantmetpor = AV89TFMantMetPor ;
      AV140Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to = AV90TFMantMetPor_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV12FilterFullText, AV61MAntEmprCod, AV65CliCod, AV66ArtCod, AV67ForColNum, AV69TipMaqCodCollection, AV78sdtMTok, AV18ManageFiltersExecutionStep, AV6ColumnsSelector, AV40TFMAntId, AV41TFMAntId_To, AV38TFMAntEmprCod, AV39TFMAntEmprCod_Sel, AV28TFMAntCliCod, AV29TFMAntCliCod_To, AV30TFMAntCliNom, AV31TFMAntCliNom_Sel, AV24TFMAntArtCod, AV25TFMAntArtCod_Sel, AV26TFMAntArtDsc, AV27TFMAntArtDsc_Sel, AV36TFMAntColNum, AV37TFMAntColNum_To, AV34TFMAntColNom, AV35TFMAntColNom_Sel, AV32TFMAntColCod, AV33TFMAntColCod_To, AV46TFMAntMaqCod, AV47TFMAntMaqCod_Sel, AV48TFMAntMaqDsc, AV49TFMAntMaqDsc_Sel, AV52TFMAntTipMCod, AV53TFMAntTipMCod_Sel, AV54TFMAntTipMDsc, AV55TFMAntTipMDsc_Sel, AV72TFMAntKilTot, AV73TFMAntKilTot_To, AV42TFMAntKilProd, AV43TFMAntKilProd_To, AV44TFMAntKilReo, AV45TFMAntKilReo_To, AV50TFMAntPorc, AV51TFMAntPorc_To, AV87TFMAntMetTot, AV88TFMAntMetTot_To, AV83TFMAntMetProd, AV84TFMAntMetProd_To, AV85TFMAntMetReo, AV86TFMAntMetReo_To, AV89TFMantMetPor, AV90TFMantMetPor_To, AV97Pgmname, AV20OrderedBy, AV22OrderedDsc, AV68TipMaqCodJSON, AV70FechaInicio, AV71FechaFin, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV97Pgmname = "AnticipacionErrores.MAnt_Filtrado" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV97Pgmname", AV97Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2DQ0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e152DQ2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV17ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV9DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV6ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_38 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_38"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV61MAntEmprCod = httpContext.cgiGet( sPrefix+"wcpOAV61MAntEmprCod") ;
         wcpOAV65CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV65CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV66ArtCod = httpContext.cgiGet( sPrefix+"wcpOAV66ArtCod") ;
         wcpOAV67ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV67ForColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV68TipMaqCodJSON = httpContext.cgiGet( sPrefix+"wcpOAV68TipMaqCodJSON") ;
         wcpOAV70FechaInicio = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV70FechaInicio"), 0) ;
         wcpOAV71FechaFin = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV71FechaFin"), 0) ;
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
         Grid_empowerer_Infinitescrolling = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Infinitescrolling") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascolumnsselector")) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedcolumn") ;
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Activeeventkey") ;
         /* Read variables values. */
         AV12FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12FilterFullText", AV12FilterFullText);
         AV97Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV97Pgmname", AV97Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"MAnt_Filtrado");
         AV97Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV97Pgmname", AV97Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV97Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("anticipacionerrores\\mant_filtrado:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e152DQ2 ();
      if (returnInSub) return;
   }

   public void e152DQ2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV69TipMaqCodCollection.fromJSonString(AV68TipMaqCodJSON, null);
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "... Ingresando con filtros para Empresa=%1, Cliente=%2, Articulo:%3, Color=%4, Tipo Maquinas:%5, Fechas:%6-%7.", ""), AV61MAntEmprCod, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65CliCod), 6, 0), AV66ArtCod, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67ForColNum), 6, 0), AV69TipMaqCodCollection.toJSonString(false), localUtil.dtoc( AV70FechaInicio, 0, "-"), localUtil.dtoc( AV71FechaFin, 0, "-"), "", ""), AV97Pgmname) ;
      AV78sdtMTok.fromJSonString(AV79WebSession.getValue("TexplusNET_Token"), null);
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "MAnt .. Web Session token>%1", ""), AV78sdtMTok.toJSonString(false, true), "", "", "", "", "", "", "", ""), AV97Pgmname) ;
      GXt_char1 = AV91Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      mant_filtrado_impl.this.GXt_char1 = GXv_char2[0] ;
      AV91Station = GXt_char1 ;
      GXv_char2[0] = AV92EmprCod ;
      GXv_char3[0] = AV93EmprNom ;
      GXv_char4[0] = AV94UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV91Station, GXv_char2, GXv_char3, GXv_char4) ;
      mant_filtrado_impl.this.AV92EmprCod = GXv_char2[0] ;
      mant_filtrado_impl.this.AV93EmprNom = GXv_char3[0] ;
      mant_filtrado_impl.this.AV94UsurCod = GXv_char4[0] ;
      subGrid_Rows = 50 ;
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
      if ( AV20OrderedBy < 1 )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         AV20OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV9DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV9DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      lblTitulo_Caption = GXutil.format( httpContext.getMessage( "Filtrando por Cliente:%1, Articulo:%2, Color:%3, Fechas:%4-%5, Tipo Maquinas:%6.", ""), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65CliCod), 6, 0), AV66ArtCod, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67ForColNum), 6, 0), localUtil.dtoc( AV70FechaInicio, 0, "-"), localUtil.dtoc( AV71FechaFin, 0, "-"), AV69TipMaqCodCollection.toJSonString(false), "", "", "") ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTitulo_Internalname, "Caption", lblTitulo_Caption, true);
   }

   public void e162DQ2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV59WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV59WWPContext = GXv_SdtWWPContext7[0] ;
      if ( AV18ManageFiltersExecutionStep == 1 )
      {
         AV18ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18ManageFiltersExecutionStep", GXutil.str( AV18ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV18ManageFiltersExecutionStep == 2 )
      {
         AV18ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18ManageFiltersExecutionStep", GXutil.str( AV18ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV23Session.getValue("AnticipacionErrores.MAnt_FiltradoColumnsSelector"), "") != 0 )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         AV8ColumnsSelectorXML = AV23Session.getValue("AnticipacionErrores.MAnt_FiltradoColumnsSelector") ;
         AV6ColumnsSelector.fromxml(AV8ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtMAntId_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMAntId_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAntId_Visible), 5, 0), !bGXsfl_38_Refreshing);
      edtMAntEmprCo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMAntEmprCo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAntEmprCo_Visible), 5, 0), !bGXsfl_38_Refreshing);
      edtMAntCliCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMAntCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAntCliCod_Visible), 5, 0), !bGXsfl_38_Refreshing);
      edtMAntCliNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMAntCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAntCliNom_Visible), 5, 0), !bGXsfl_38_Refreshing);
      edtMAntArtCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMAntArtCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAntArtCod_Visible), 5, 0), !bGXsfl_38_Refreshing);
      edtMAntArtDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMAntArtDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAntArtDsc_Visible), 5, 0), !bGXsfl_38_Refreshing);
      edtMAntColNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMAntColNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAntColNum_Visible), 5, 0), !bGXsfl_38_Refreshing);
      edtMAntColNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMAntColNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAntColNom_Visible), 5, 0), !bGXsfl_38_Refreshing);
      edtMAntColCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMAntColCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAntColCod_Visible), 5, 0), !bGXsfl_38_Refreshing);
      edtMAntMaqCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMAntMaqCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAntMaqCod_Visible), 5, 0), !bGXsfl_38_Refreshing);
      edtMAntMaqDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMAntMaqDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAntMaqDsc_Visible), 5, 0), !bGXsfl_38_Refreshing);
      edtMAntTipMCo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMAntTipMCo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAntTipMCo_Visible), 5, 0), !bGXsfl_38_Refreshing);
      edtMAntTipMDs_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMAntTipMDs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAntTipMDs_Visible), 5, 0), !bGXsfl_38_Refreshing);
      edtMAntKilTot_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMAntKilTot_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAntKilTot_Visible), 5, 0), !bGXsfl_38_Refreshing);
      edtMAntKilPro_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMAntKilPro_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAntKilPro_Visible), 5, 0), !bGXsfl_38_Refreshing);
      edtMAntKilReo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMAntKilReo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAntKilReo_Visible), 5, 0), !bGXsfl_38_Refreshing);
      edtMAntPorc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMAntPorc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAntPorc_Visible), 5, 0), !bGXsfl_38_Refreshing);
      edtMAntMetTot_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMAntMetTot_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAntMetTot_Visible), 5, 0), !bGXsfl_38_Refreshing);
      edtMAntMetPro_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMAntMetPro_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAntMetPro_Visible), 5, 0), !bGXsfl_38_Refreshing);
      edtMAntMetReo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMAntMetReo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAntMetReo_Visible), 5, 0), !bGXsfl_38_Refreshing);
      edtMantMetPor_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMantMetPor_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMantMetPor_Visible), 5, 0), !bGXsfl_38_Refreshing);
      AV98Anticipacionerrores_mant_filtradods_1_filterfulltext = AV12FilterFullText ;
      AV99Anticipacionerrores_mant_filtradods_2_tfmantid = AV40TFMAntId ;
      AV100Anticipacionerrores_mant_filtradods_3_tfmantid_to = AV41TFMAntId_To ;
      AV101Anticipacionerrores_mant_filtradods_4_tfmantemprcod = AV38TFMAntEmprCod ;
      AV102Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel = AV39TFMAntEmprCod_Sel ;
      AV103Anticipacionerrores_mant_filtradods_6_tfmantclicod = AV28TFMAntCliCod ;
      AV104Anticipacionerrores_mant_filtradods_7_tfmantclicod_to = AV29TFMAntCliCod_To ;
      AV105Anticipacionerrores_mant_filtradods_8_tfmantclinom = AV30TFMAntCliNom ;
      AV106Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel = AV31TFMAntCliNom_Sel ;
      AV107Anticipacionerrores_mant_filtradods_10_tfmantartcod = AV24TFMAntArtCod ;
      AV108Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel = AV25TFMAntArtCod_Sel ;
      AV109Anticipacionerrores_mant_filtradods_12_tfmantartdsc = AV26TFMAntArtDsc ;
      AV110Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel = AV27TFMAntArtDsc_Sel ;
      AV111Anticipacionerrores_mant_filtradods_14_tfmantcolnum = AV36TFMAntColNum ;
      AV112Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to = AV37TFMAntColNum_To ;
      AV113Anticipacionerrores_mant_filtradods_16_tfmantcolnom = AV34TFMAntColNom ;
      AV114Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel = AV35TFMAntColNom_Sel ;
      AV115Anticipacionerrores_mant_filtradods_18_tfmantcolcod = AV32TFMAntColCod ;
      AV116Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to = AV33TFMAntColCod_To ;
      AV117Anticipacionerrores_mant_filtradods_20_tfmantmaqcod = AV46TFMAntMaqCod ;
      AV118Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel = AV47TFMAntMaqCod_Sel ;
      AV119Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc = AV48TFMAntMaqDsc ;
      AV120Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel = AV49TFMAntMaqDsc_Sel ;
      AV121Anticipacionerrores_mant_filtradods_24_tfmanttipmcod = AV52TFMAntTipMCod ;
      AV122Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel = AV53TFMAntTipMCod_Sel ;
      AV123Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc = AV54TFMAntTipMDsc ;
      AV124Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel = AV55TFMAntTipMDsc_Sel ;
      AV125Anticipacionerrores_mant_filtradods_28_tfmantkiltot = AV72TFMAntKilTot ;
      AV126Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to = AV73TFMAntKilTot_To ;
      AV127Anticipacionerrores_mant_filtradods_30_tfmantkilprod = AV42TFMAntKilProd ;
      AV128Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to = AV43TFMAntKilProd_To ;
      AV129Anticipacionerrores_mant_filtradods_32_tfmantkilreo = AV44TFMAntKilReo ;
      AV130Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to = AV45TFMAntKilReo_To ;
      AV131Anticipacionerrores_mant_filtradods_34_tfmantporc = AV50TFMAntPorc ;
      AV132Anticipacionerrores_mant_filtradods_35_tfmantporc_to = AV51TFMAntPorc_To ;
      AV133Anticipacionerrores_mant_filtradods_36_tfmantmettot = AV87TFMAntMetTot ;
      AV134Anticipacionerrores_mant_filtradods_37_tfmantmettot_to = AV88TFMAntMetTot_To ;
      AV135Anticipacionerrores_mant_filtradods_38_tfmantmetprod = AV83TFMAntMetProd ;
      AV136Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to = AV84TFMAntMetProd_To ;
      AV137Anticipacionerrores_mant_filtradods_40_tfmantmetreo = AV85TFMAntMetReo ;
      AV138Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to = AV86TFMAntMetReo_To ;
      AV139Anticipacionerrores_mant_filtradods_42_tfmantmetpor = AV89TFMantMetPor ;
      AV140Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to = AV90TFMantMetPor_To ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV6ColumnsSelector", AV6ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV17ManageFiltersData", AV17ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV13GridState", AV13GridState);
   }

   public void e122DQ2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV20OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20OrderedBy), 4, 0));
         AV22OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22OrderedDsc", AV22OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MAntId") == 0 )
         {
            AV40TFMAntId = GXutil.lval( Ddo_grid_Filteredtext_get) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFMAntId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TFMAntId), 10, 0));
            AV41TFMAntId_To = GXutil.lval( Ddo_grid_Filteredtextto_get) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFMAntId_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFMAntId_To), 10, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MAntEmprCod") == 0 )
         {
            AV38TFMAntEmprCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFMAntEmprCod", AV38TFMAntEmprCod);
            AV39TFMAntEmprCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFMAntEmprCod_Sel", AV39TFMAntEmprCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MAntCliCod") == 0 )
         {
            AV28TFMAntCliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFMAntCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFMAntCliCod), 6, 0));
            AV29TFMAntCliCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFMAntCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFMAntCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MAntCliNom") == 0 )
         {
            AV30TFMAntCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFMAntCliNom", AV30TFMAntCliNom);
            AV31TFMAntCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFMAntCliNom_Sel", AV31TFMAntCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MAntArtCod") == 0 )
         {
            AV24TFMAntArtCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24TFMAntArtCod", AV24TFMAntArtCod);
            AV25TFMAntArtCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25TFMAntArtCod_Sel", AV25TFMAntArtCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MAntArtDsc") == 0 )
         {
            AV26TFMAntArtDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFMAntArtDsc", AV26TFMAntArtDsc);
            AV27TFMAntArtDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFMAntArtDsc_Sel", AV27TFMAntArtDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MAntColNum") == 0 )
         {
            AV36TFMAntColNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFMAntColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFMAntColNum), 6, 0));
            AV37TFMAntColNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFMAntColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFMAntColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MAntColNom") == 0 )
         {
            AV34TFMAntColNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFMAntColNom", AV34TFMAntColNom);
            AV35TFMAntColNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFMAntColNom_Sel", AV35TFMAntColNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MAntColCod") == 0 )
         {
            AV32TFMAntColCod = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFMAntColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32TFMAntColCod), 2, 0));
            AV33TFMAntColCod_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFMAntColCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33TFMAntColCod_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MAntMaqCod") == 0 )
         {
            AV46TFMAntMaqCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFMAntMaqCod", AV46TFMAntMaqCod);
            AV47TFMAntMaqCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFMAntMaqCod_Sel", AV47TFMAntMaqCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MAntMaqDsc") == 0 )
         {
            AV48TFMAntMaqDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFMAntMaqDsc", AV48TFMAntMaqDsc);
            AV49TFMAntMaqDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFMAntMaqDsc_Sel", AV49TFMAntMaqDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MAntTipMCod") == 0 )
         {
            AV52TFMAntTipMCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFMAntTipMCod", AV52TFMAntTipMCod);
            AV53TFMAntTipMCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFMAntTipMCod_Sel", AV53TFMAntTipMCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MAntTipMDsc") == 0 )
         {
            AV54TFMAntTipMDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFMAntTipMDsc", AV54TFMAntTipMDsc);
            AV55TFMAntTipMDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFMAntTipMDsc_Sel", AV55TFMAntTipMDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MAntKilTot") == 0 )
         {
            AV72TFMAntKilTot = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72TFMAntKilTot", GXutil.ltrimstr( AV72TFMAntKilTot, 12, 2));
            AV73TFMAntKilTot_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73TFMAntKilTot_To", GXutil.ltrimstr( AV73TFMAntKilTot_To, 12, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MAntKilProd") == 0 )
         {
            AV42TFMAntKilProd = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFMAntKilProd", GXutil.ltrimstr( AV42TFMAntKilProd, 12, 2));
            AV43TFMAntKilProd_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFMAntKilProd_To", GXutil.ltrimstr( AV43TFMAntKilProd_To, 12, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MAntKilReo") == 0 )
         {
            AV44TFMAntKilReo = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFMAntKilReo", GXutil.ltrimstr( AV44TFMAntKilReo, 12, 2));
            AV45TFMAntKilReo_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFMAntKilReo_To", GXutil.ltrimstr( AV45TFMAntKilReo_To, 12, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MAntPorc") == 0 )
         {
            AV50TFMAntPorc = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFMAntPorc", GXutil.ltrimstr( AV50TFMAntPorc, 7, 2));
            AV51TFMAntPorc_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFMAntPorc_To", GXutil.ltrimstr( AV51TFMAntPorc_To, 7, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MAntMetTot") == 0 )
         {
            AV87TFMAntMetTot = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV87TFMAntMetTot", GXutil.ltrimstr( AV87TFMAntMetTot, 12, 2));
            AV88TFMAntMetTot_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88TFMAntMetTot_To", GXutil.ltrimstr( AV88TFMAntMetTot_To, 12, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MAntMetProd") == 0 )
         {
            AV83TFMAntMetProd = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83TFMAntMetProd", GXutil.ltrimstr( AV83TFMAntMetProd, 12, 2));
            AV84TFMAntMetProd_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84TFMAntMetProd_To", GXutil.ltrimstr( AV84TFMAntMetProd_To, 12, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MAntMetReo") == 0 )
         {
            AV85TFMAntMetReo = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85TFMAntMetReo", GXutil.ltrimstr( AV85TFMAntMetReo, 12, 2));
            AV86TFMAntMetReo_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86TFMAntMetReo_To", GXutil.ltrimstr( AV86TFMAntMetReo_To, 12, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MantMetPor") == 0 )
         {
            AV89TFMantMetPor = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89TFMantMetPor", GXutil.ltrimstr( AV89TFMantMetPor, 7, 2));
            AV90TFMantMetPor_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90TFMantMetPor_To", GXutil.ltrimstr( AV90TFMantMetPor_To, 7, 2));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e172DQ2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      edtMAntEmprCo_Link = formatLink("app.anticipacionerrores.mantview", new String[] {GXutil.URLEncode(GXutil.ltrimstr(A14562MAntId,10,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"MAntId","TabCode"})  ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(38) ;
      }
      sendrow_382( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_38_Refreshing )
      {
         httpContext.doAjaxLoad(38, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e132DQ2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV8ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV6ColumnsSelector.fromJSonString(AV8ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "AnticipacionErrores.MAnt_FiltradoColumnsSelector", ((GXutil.strcmp("", AV8ColumnsSelectorXML)==0) ? "" : AV6ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV6ColumnsSelector", AV6ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV17ManageFiltersData", AV17ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV13GridState", AV13GridState);
   }

   public void e112DQ2( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S172 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S152 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("AnticipacionErrores.MAnt_FiltradoFilters")),GXutil.URLEncode(GXutil.rtrim(AV97Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV18ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18ManageFiltersExecutionStep", GXutil.str( AV18ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("AnticipacionErrores.MAnt_FiltradoFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV18ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18ManageFiltersExecutionStep", GXutil.str( AV18ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV19ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "AnticipacionErrores.MAnt_FiltradoFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         mant_filtrado_impl.this.GXt_char1 = GXv_char4[0] ;
         AV19ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV19ManageFiltersXml)==0) )
         {
            Cond_result = true ;
         }
         else
         {
            Cond_result = false ;
         }
         if ( Cond_result )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV97Pgmname+"GridState", AV19ManageFiltersXml) ;
            AV13GridState.fromxml(AV19ManageFiltersXml, null, null);
            AV20OrderedBy = AV13GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20OrderedBy), 4, 0));
            AV22OrderedDsc = AV13GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22OrderedDsc", AV22OrderedDsc);
            /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
            S142 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S182 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV13GridState", AV13GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV6ColumnsSelector", AV6ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV17ManageFiltersData", AV17ManageFiltersData);
   }

   public void e142DQ2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV11ExcelFilename ;
      GXv_char3[0] = AV10ErrorMessage ;
      new app.anticipacionerrores.mant_filtradoexport(remoteHandle, context).execute( AV61MAntEmprCod, AV65CliCod, AV66ArtCod, AV67ForColNum, AV68TipMaqCodJSON, GXv_char4, GXv_char3) ;
      mant_filtrado_impl.this.AV11ExcelFilename = GXv_char4[0] ;
      mant_filtrado_impl.this.AV10ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV11ExcelFilename, "") != 0 )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         callWebObject(formatLink(AV11ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV10ErrorMessage);
      }
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV20OrderedBy, 4, 0))+":"+(AV22OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV6ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MAntId", "", "Id", false, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MAntEmprCod", "", "Empresa", false, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MAntCliCod", "", "Cliente", false, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MAntCliNom", "", "Cliente", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MAntArtCod", "", "Cód Artículo", false, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MAntArtDsc", "", "Artículo", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MAntColNum", "", "Color", false, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MAntColNom", "", "Color", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MAntColCod", "", "Tipo Colorante", false, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MAntMaqCod", "", "máquina", false, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MAntMaqDsc", "", "Máquina", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MAntTipMCod", "", "Cód.  Tipo Máquina", false, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MAntTipMDsc", "", "Tipo Máquina", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MAntKilTot", "", "Kilos Total", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MAntKilProd", "", "Kilos Produccion", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MAntKilReo", "", "Kilos Reoperados", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MAntPorc", "", "Porc", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MAntMetTot", "", "Metros Total", false, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MAntMetProd", "", "M.  Produccion", false, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MAntMetReo", "", "M. Reoperados", false, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MantMetPor", "", "Porc Met", false, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV58UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "AnticipacionErrores.MAnt_FiltradoColumnsSelector", GXv_char4) ;
      mant_filtrado_impl.this.GXt_char1 = GXv_char4[0] ;
      AV58UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV58UserCustomValue)==0) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         AV7ColumnsSelectorAux.fromxml(AV58UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector8[0] = AV7ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector9[0] = AV6ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, GXv_SdtWWPColumnsSelector9) ;
         AV7ColumnsSelectorAux = GXv_SdtWWPColumnsSelector8[0] ;
         AV6ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = AV17ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "AnticipacionErrores.MAnt_FiltradoFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV17ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV12FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12FilterFullText", AV12FilterFullText);
      AV40TFMAntId = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFMAntId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TFMAntId), 10, 0));
      AV41TFMAntId_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFMAntId_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFMAntId_To), 10, 0));
      AV38TFMAntEmprCod = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFMAntEmprCod", AV38TFMAntEmprCod);
      AV39TFMAntEmprCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFMAntEmprCod_Sel", AV39TFMAntEmprCod_Sel);
      AV28TFMAntCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFMAntCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFMAntCliCod), 6, 0));
      AV29TFMAntCliCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFMAntCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFMAntCliCod_To), 6, 0));
      AV30TFMAntCliNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFMAntCliNom", AV30TFMAntCliNom);
      AV31TFMAntCliNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFMAntCliNom_Sel", AV31TFMAntCliNom_Sel);
      AV24TFMAntArtCod = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24TFMAntArtCod", AV24TFMAntArtCod);
      AV25TFMAntArtCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25TFMAntArtCod_Sel", AV25TFMAntArtCod_Sel);
      AV26TFMAntArtDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFMAntArtDsc", AV26TFMAntArtDsc);
      AV27TFMAntArtDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFMAntArtDsc_Sel", AV27TFMAntArtDsc_Sel);
      AV36TFMAntColNum = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFMAntColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFMAntColNum), 6, 0));
      AV37TFMAntColNum_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFMAntColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFMAntColNum_To), 6, 0));
      AV34TFMAntColNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFMAntColNom", AV34TFMAntColNom);
      AV35TFMAntColNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFMAntColNom_Sel", AV35TFMAntColNom_Sel);
      AV32TFMAntColCod = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFMAntColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32TFMAntColCod), 2, 0));
      AV33TFMAntColCod_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFMAntColCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33TFMAntColCod_To), 2, 0));
      AV46TFMAntMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFMAntMaqCod", AV46TFMAntMaqCod);
      AV47TFMAntMaqCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFMAntMaqCod_Sel", AV47TFMAntMaqCod_Sel);
      AV48TFMAntMaqDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFMAntMaqDsc", AV48TFMAntMaqDsc);
      AV49TFMAntMaqDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFMAntMaqDsc_Sel", AV49TFMAntMaqDsc_Sel);
      AV52TFMAntTipMCod = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFMAntTipMCod", AV52TFMAntTipMCod);
      AV53TFMAntTipMCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFMAntTipMCod_Sel", AV53TFMAntTipMCod_Sel);
      AV54TFMAntTipMDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFMAntTipMDsc", AV54TFMAntTipMDsc);
      AV55TFMAntTipMDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFMAntTipMDsc_Sel", AV55TFMAntTipMDsc_Sel);
      AV72TFMAntKilTot = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72TFMAntKilTot", GXutil.ltrimstr( AV72TFMAntKilTot, 12, 2));
      AV73TFMAntKilTot_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73TFMAntKilTot_To", GXutil.ltrimstr( AV73TFMAntKilTot_To, 12, 2));
      AV42TFMAntKilProd = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFMAntKilProd", GXutil.ltrimstr( AV42TFMAntKilProd, 12, 2));
      AV43TFMAntKilProd_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFMAntKilProd_To", GXutil.ltrimstr( AV43TFMAntKilProd_To, 12, 2));
      AV44TFMAntKilReo = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFMAntKilReo", GXutil.ltrimstr( AV44TFMAntKilReo, 12, 2));
      AV45TFMAntKilReo_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFMAntKilReo_To", GXutil.ltrimstr( AV45TFMAntKilReo_To, 12, 2));
      AV50TFMAntPorc = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFMAntPorc", GXutil.ltrimstr( AV50TFMAntPorc, 7, 2));
      AV51TFMAntPorc_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFMAntPorc_To", GXutil.ltrimstr( AV51TFMAntPorc_To, 7, 2));
      AV87TFMAntMetTot = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV87TFMAntMetTot", GXutil.ltrimstr( AV87TFMAntMetTot, 12, 2));
      AV88TFMAntMetTot_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88TFMAntMetTot_To", GXutil.ltrimstr( AV88TFMAntMetTot_To, 12, 2));
      AV83TFMAntMetProd = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83TFMAntMetProd", GXutil.ltrimstr( AV83TFMAntMetProd, 12, 2));
      AV84TFMAntMetProd_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84TFMAntMetProd_To", GXutil.ltrimstr( AV84TFMAntMetProd_To, 12, 2));
      AV85TFMAntMetReo = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85TFMAntMetReo", GXutil.ltrimstr( AV85TFMAntMetReo, 12, 2));
      AV86TFMAntMetReo_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86TFMAntMetReo_To", GXutil.ltrimstr( AV86TFMAntMetReo_To, 12, 2));
      AV89TFMantMetPor = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89TFMantMetPor", GXutil.ltrimstr( AV89TFMantMetPor, 7, 2));
      AV90TFMantMetPor_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90TFMantMetPor_To", GXutil.ltrimstr( AV90TFMantMetPor_To, 7, 2));
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
      if ( GXutil.strcmp(AV23Session.getValue(AV97Pgmname+"GridState"), "") == 0 )
      {
         AV13GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV97Pgmname+"GridState"), null, null);
      }
      else
      {
         AV13GridState.fromxml(AV23Session.getValue(AV97Pgmname+"GridState"), null, null);
      }
      AV20OrderedBy = AV13GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20OrderedBy), 4, 0));
      AV22OrderedDsc = AV13GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22OrderedDsc", AV22OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S182 ();
      if (returnInSub) return;
   }

   public void S182( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV141GXV1 = 1 ;
      while ( AV141GXV1 <= AV13GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV14GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV13GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV141GXV1));
         if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12FilterFullText", AV12FilterFullText);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTID") == 0 )
         {
            AV40TFMAntId = GXutil.lval( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFMAntId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TFMAntId), 10, 0));
            AV41TFMAntId_To = GXutil.lval( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFMAntId_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFMAntId_To), 10, 0));
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTEMPRCOD") == 0 )
         {
            AV38TFMAntEmprCod = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFMAntEmprCod", AV38TFMAntEmprCod);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTEMPRCOD_SEL") == 0 )
         {
            AV39TFMAntEmprCod_Sel = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFMAntEmprCod_Sel", AV39TFMAntEmprCod_Sel);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTCLICOD") == 0 )
         {
            AV28TFMAntCliCod = (int)(GXutil.lval( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFMAntCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFMAntCliCod), 6, 0));
            AV29TFMAntCliCod_To = (int)(GXutil.lval( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFMAntCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFMAntCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTCLINOM") == 0 )
         {
            AV30TFMAntCliNom = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFMAntCliNom", AV30TFMAntCliNom);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTCLINOM_SEL") == 0 )
         {
            AV31TFMAntCliNom_Sel = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFMAntCliNom_Sel", AV31TFMAntCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTARTCOD") == 0 )
         {
            AV24TFMAntArtCod = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24TFMAntArtCod", AV24TFMAntArtCod);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTARTCOD_SEL") == 0 )
         {
            AV25TFMAntArtCod_Sel = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25TFMAntArtCod_Sel", AV25TFMAntArtCod_Sel);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTARTDSC") == 0 )
         {
            AV26TFMAntArtDsc = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFMAntArtDsc", AV26TFMAntArtDsc);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTARTDSC_SEL") == 0 )
         {
            AV27TFMAntArtDsc_Sel = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFMAntArtDsc_Sel", AV27TFMAntArtDsc_Sel);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTCOLNUM") == 0 )
         {
            AV36TFMAntColNum = (int)(GXutil.lval( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFMAntColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFMAntColNum), 6, 0));
            AV37TFMAntColNum_To = (int)(GXutil.lval( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFMAntColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFMAntColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTCOLNOM") == 0 )
         {
            AV34TFMAntColNom = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFMAntColNom", AV34TFMAntColNom);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTCOLNOM_SEL") == 0 )
         {
            AV35TFMAntColNom_Sel = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFMAntColNom_Sel", AV35TFMAntColNom_Sel);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTCOLCOD") == 0 )
         {
            AV32TFMAntColCod = (byte)(GXutil.lval( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFMAntColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32TFMAntColCod), 2, 0));
            AV33TFMAntColCod_To = (byte)(GXutil.lval( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFMAntColCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33TFMAntColCod_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTMAQCOD") == 0 )
         {
            AV46TFMAntMaqCod = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFMAntMaqCod", AV46TFMAntMaqCod);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTMAQCOD_SEL") == 0 )
         {
            AV47TFMAntMaqCod_Sel = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFMAntMaqCod_Sel", AV47TFMAntMaqCod_Sel);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTMAQDSC") == 0 )
         {
            AV48TFMAntMaqDsc = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFMAntMaqDsc", AV48TFMAntMaqDsc);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTMAQDSC_SEL") == 0 )
         {
            AV49TFMAntMaqDsc_Sel = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFMAntMaqDsc_Sel", AV49TFMAntMaqDsc_Sel);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTTIPMCOD") == 0 )
         {
            AV52TFMAntTipMCod = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFMAntTipMCod", AV52TFMAntTipMCod);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTTIPMCOD_SEL") == 0 )
         {
            AV53TFMAntTipMCod_Sel = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFMAntTipMCod_Sel", AV53TFMAntTipMCod_Sel);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTTIPMDSC") == 0 )
         {
            AV54TFMAntTipMDsc = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFMAntTipMDsc", AV54TFMAntTipMDsc);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTTIPMDSC_SEL") == 0 )
         {
            AV55TFMAntTipMDsc_Sel = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFMAntTipMDsc_Sel", AV55TFMAntTipMDsc_Sel);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTKILTOT") == 0 )
         {
            AV72TFMAntKilTot = CommonUtil.decimalVal( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72TFMAntKilTot", GXutil.ltrimstr( AV72TFMAntKilTot, 12, 2));
            AV73TFMAntKilTot_To = CommonUtil.decimalVal( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73TFMAntKilTot_To", GXutil.ltrimstr( AV73TFMAntKilTot_To, 12, 2));
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTKILPROD") == 0 )
         {
            AV42TFMAntKilProd = CommonUtil.decimalVal( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFMAntKilProd", GXutil.ltrimstr( AV42TFMAntKilProd, 12, 2));
            AV43TFMAntKilProd_To = CommonUtil.decimalVal( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFMAntKilProd_To", GXutil.ltrimstr( AV43TFMAntKilProd_To, 12, 2));
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTKILREO") == 0 )
         {
            AV44TFMAntKilReo = CommonUtil.decimalVal( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFMAntKilReo", GXutil.ltrimstr( AV44TFMAntKilReo, 12, 2));
            AV45TFMAntKilReo_To = CommonUtil.decimalVal( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFMAntKilReo_To", GXutil.ltrimstr( AV45TFMAntKilReo_To, 12, 2));
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTPORC") == 0 )
         {
            AV50TFMAntPorc = CommonUtil.decimalVal( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFMAntPorc", GXutil.ltrimstr( AV50TFMAntPorc, 7, 2));
            AV51TFMAntPorc_To = CommonUtil.decimalVal( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFMAntPorc_To", GXutil.ltrimstr( AV51TFMAntPorc_To, 7, 2));
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTMETTOT") == 0 )
         {
            AV87TFMAntMetTot = CommonUtil.decimalVal( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV87TFMAntMetTot", GXutil.ltrimstr( AV87TFMAntMetTot, 12, 2));
            AV88TFMAntMetTot_To = CommonUtil.decimalVal( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88TFMAntMetTot_To", GXutil.ltrimstr( AV88TFMAntMetTot_To, 12, 2));
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTMETPROD") == 0 )
         {
            AV83TFMAntMetProd = CommonUtil.decimalVal( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83TFMAntMetProd", GXutil.ltrimstr( AV83TFMAntMetProd, 12, 2));
            AV84TFMAntMetProd_To = CommonUtil.decimalVal( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84TFMAntMetProd_To", GXutil.ltrimstr( AV84TFMAntMetProd_To, 12, 2));
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTMETREO") == 0 )
         {
            AV85TFMAntMetReo = CommonUtil.decimalVal( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85TFMAntMetReo", GXutil.ltrimstr( AV85TFMAntMetReo, 12, 2));
            AV86TFMAntMetReo_To = CommonUtil.decimalVal( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86TFMAntMetReo_To", GXutil.ltrimstr( AV86TFMAntMetReo_To, 12, 2));
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTMETPOR") == 0 )
         {
            AV89TFMantMetPor = CommonUtil.decimalVal( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89TFMantMetPor", GXutil.ltrimstr( AV89TFMantMetPor, 7, 2));
            AV90TFMantMetPor_To = CommonUtil.decimalVal( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90TFMantMetPor_To", GXutil.ltrimstr( AV90TFMantMetPor_To, 7, 2));
         }
         AV141GXV1 = (int)(AV141GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV39TFMAntEmprCod_Sel)==0), AV39TFMAntEmprCod_Sel, GXv_char4) ;
      mant_filtrado_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV31TFMAntCliNom_Sel)==0), AV31TFMAntCliNom_Sel, GXv_char3) ;
      mant_filtrado_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char2[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV25TFMAntArtCod_Sel)==0), AV25TFMAntArtCod_Sel, GXv_char2) ;
      mant_filtrado_impl.this.GXt_char13 = GXv_char2[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV27TFMAntArtDsc_Sel)==0), AV27TFMAntArtDsc_Sel, GXv_char15) ;
      mant_filtrado_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV35TFMAntColNom_Sel)==0), AV35TFMAntColNom_Sel, GXv_char17) ;
      mant_filtrado_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV47TFMAntMaqCod_Sel)==0), AV47TFMAntMaqCod_Sel, GXv_char19) ;
      mant_filtrado_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV49TFMAntMaqDsc_Sel)==0), AV49TFMAntMaqDsc_Sel, GXv_char21) ;
      mant_filtrado_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV53TFMAntTipMCod_Sel)==0), AV53TFMAntTipMCod_Sel, GXv_char23) ;
      mant_filtrado_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV55TFMAntTipMDsc_Sel)==0), AV55TFMAntTipMDsc_Sel, GXv_char25) ;
      mant_filtrado_impl.this.GXt_char24 = GXv_char25[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"||"+GXt_char12+"|"+GXt_char13+"|"+GXt_char14+"||"+GXt_char16+"||"+GXt_char18+"|"+GXt_char20+"|"+GXt_char22+"|"+GXt_char24+"||||||||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV38TFMAntEmprCod)==0), AV38TFMAntEmprCod, GXv_char25) ;
      mant_filtrado_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV30TFMAntCliNom)==0), AV30TFMAntCliNom, GXv_char23) ;
      mant_filtrado_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV24TFMAntArtCod)==0), AV24TFMAntArtCod, GXv_char21) ;
      mant_filtrado_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV26TFMAntArtDsc)==0), AV26TFMAntArtDsc, GXv_char19) ;
      mant_filtrado_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV34TFMAntColNom)==0), AV34TFMAntColNom, GXv_char17) ;
      mant_filtrado_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV46TFMAntMaqCod)==0), AV46TFMAntMaqCod, GXv_char15) ;
      mant_filtrado_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV48TFMAntMaqDsc)==0), AV48TFMAntMaqDsc, GXv_char4) ;
      mant_filtrado_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV52TFMAntTipMCod)==0), AV52TFMAntTipMCod, GXv_char3) ;
      mant_filtrado_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV54TFMAntTipMDsc)==0), AV54TFMAntTipMDsc, GXv_char2) ;
      mant_filtrado_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV40TFMAntId) ? "" : GXutil.str( AV40TFMAntId, 10, 0))+"|"+GXt_char24+"|"+((0==AV28TFMAntCliCod) ? "" : GXutil.str( AV28TFMAntCliCod, 6, 0))+"|"+GXt_char22+"|"+GXt_char20+"|"+GXt_char18+"|"+((0==AV36TFMAntColNum) ? "" : GXutil.str( AV36TFMAntColNum, 6, 0))+"|"+GXt_char16+"|"+((0==AV32TFMAntColCod) ? "" : GXutil.str( AV32TFMAntColCod, 2, 0))+"|"+GXt_char14+"|"+GXt_char13+"|"+GXt_char12+"|"+GXt_char1+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV72TFMAntKilTot)==0) ? "" : GXutil.str( AV72TFMAntKilTot, 12, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFMAntKilProd)==0) ? "" : GXutil.str( AV42TFMAntKilProd, 12, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV44TFMAntKilReo)==0) ? "" : GXutil.str( AV44TFMAntKilReo, 12, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFMAntPorc)==0) ? "" : GXutil.str( AV50TFMAntPorc, 7, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV87TFMAntMetTot)==0) ? "" : GXutil.str( AV87TFMAntMetTot, 12, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV83TFMAntMetProd)==0) ? "" : GXutil.str( AV83TFMAntMetProd, 12, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV85TFMAntMetReo)==0) ? "" : GXutil.str( AV85TFMAntMetReo, 12, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV89TFMantMetPor)==0) ? "" : GXutil.str( AV89TFMantMetPor, 7, 2)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV41TFMAntId_To) ? "" : GXutil.str( AV41TFMAntId_To, 10, 0))+"||"+((0==AV29TFMAntCliCod_To) ? "" : GXutil.str( AV29TFMAntCliCod_To, 6, 0))+"||||"+((0==AV37TFMAntColNum_To) ? "" : GXutil.str( AV37TFMAntColNum_To, 6, 0))+"||"+((0==AV33TFMAntColCod_To) ? "" : GXutil.str( AV33TFMAntColCod_To, 2, 0))+"|||||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV73TFMAntKilTot_To)==0) ? "" : GXutil.str( AV73TFMAntKilTot_To, 12, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFMAntKilProd_To)==0) ? "" : GXutil.str( AV43TFMAntKilProd_To, 12, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV45TFMAntKilReo_To)==0) ? "" : GXutil.str( AV45TFMAntKilReo_To, 12, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFMAntPorc_To)==0) ? "" : GXutil.str( AV51TFMAntPorc_To, 7, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV88TFMAntMetTot_To)==0) ? "" : GXutil.str( AV88TFMAntMetTot_To, 12, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV84TFMAntMetProd_To)==0) ? "" : GXutil.str( AV84TFMAntMetProd_To, 12, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV86TFMAntMetReo_To)==0) ? "" : GXutil.str( AV86TFMAntMetReo_To, 12, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV90TFMantMetPor_To)==0) ? "" : GXutil.str( AV90TFMantMetPor_To, 7, 2)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV13GridState.fromxml(AV23Session.getValue(AV97Pgmname+"GridState"), null, null);
      AV13GridState.setgxTv_SdtWWPGridState_Orderedby( AV20OrderedBy );
      AV13GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV22OrderedDsc );
      AV13GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState26[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV12FilterFullText)==0), (short)(0), AV12FilterFullText, "") ;
      AV13GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFMANTID", "", !((0==AV40TFMAntId)&&(0==AV41TFMAntId_To)), (short)(0), GXutil.trim( GXutil.str( AV40TFMAntId, 10, 0)), GXutil.trim( GXutil.str( AV41TFMAntId_To, 10, 0))) ;
      AV13GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFMANTEMPRCOD", "", !(GXutil.strcmp("", AV38TFMAntEmprCod)==0), (short)(0), AV38TFMAntEmprCod, "", !(GXutil.strcmp("", AV39TFMAntEmprCod_Sel)==0), AV39TFMAntEmprCod_Sel, "") ;
      AV13GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFMANTCLICOD", "", !((0==AV28TFMAntCliCod)&&(0==AV29TFMAntCliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV28TFMAntCliCod, 6, 0)), GXutil.trim( GXutil.str( AV29TFMAntCliCod_To, 6, 0))) ;
      AV13GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFMANTCLINOM", "", !(GXutil.strcmp("", AV30TFMAntCliNom)==0), (short)(0), AV30TFMAntCliNom, "", !(GXutil.strcmp("", AV31TFMAntCliNom_Sel)==0), AV31TFMAntCliNom_Sel, "") ;
      AV13GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFMANTARTCOD", "", !(GXutil.strcmp("", AV24TFMAntArtCod)==0), (short)(0), AV24TFMAntArtCod, "", !(GXutil.strcmp("", AV25TFMAntArtCod_Sel)==0), AV25TFMAntArtCod_Sel, "") ;
      AV13GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFMANTARTDSC", "", !(GXutil.strcmp("", AV26TFMAntArtDsc)==0), (short)(0), AV26TFMAntArtDsc, "", !(GXutil.strcmp("", AV27TFMAntArtDsc_Sel)==0), AV27TFMAntArtDsc_Sel, "") ;
      AV13GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFMANTCOLNUM", "", !((0==AV36TFMAntColNum)&&(0==AV37TFMAntColNum_To)), (short)(0), GXutil.trim( GXutil.str( AV36TFMAntColNum, 6, 0)), GXutil.trim( GXutil.str( AV37TFMAntColNum_To, 6, 0))) ;
      AV13GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFMANTCOLNOM", "", !(GXutil.strcmp("", AV34TFMAntColNom)==0), (short)(0), AV34TFMAntColNom, "", !(GXutil.strcmp("", AV35TFMAntColNom_Sel)==0), AV35TFMAntColNom_Sel, "") ;
      AV13GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFMANTCOLCOD", "", !((0==AV32TFMAntColCod)&&(0==AV33TFMAntColCod_To)), (short)(0), GXutil.trim( GXutil.str( AV32TFMAntColCod, 2, 0)), GXutil.trim( GXutil.str( AV33TFMAntColCod_To, 2, 0))) ;
      AV13GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFMANTMAQCOD", "", !(GXutil.strcmp("", AV46TFMAntMaqCod)==0), (short)(0), AV46TFMAntMaqCod, "", !(GXutil.strcmp("", AV47TFMAntMaqCod_Sel)==0), AV47TFMAntMaqCod_Sel, "") ;
      AV13GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFMANTMAQDSC", "", !(GXutil.strcmp("", AV48TFMAntMaqDsc)==0), (short)(0), AV48TFMAntMaqDsc, "", !(GXutil.strcmp("", AV49TFMAntMaqDsc_Sel)==0), AV49TFMAntMaqDsc_Sel, "") ;
      AV13GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFMANTTIPMCOD", "", !(GXutil.strcmp("", AV52TFMAntTipMCod)==0), (short)(0), AV52TFMAntTipMCod, "", !(GXutil.strcmp("", AV53TFMAntTipMCod_Sel)==0), AV53TFMAntTipMCod_Sel, "") ;
      AV13GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFMANTTIPMDSC", "", !(GXutil.strcmp("", AV54TFMAntTipMDsc)==0), (short)(0), AV54TFMAntTipMDsc, "", !(GXutil.strcmp("", AV55TFMAntTipMDsc_Sel)==0), AV55TFMAntTipMDsc_Sel, "") ;
      AV13GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFMANTKILTOT", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV72TFMAntKilTot)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV73TFMAntKilTot_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV72TFMAntKilTot, 12, 2)), GXutil.trim( GXutil.str( AV73TFMAntKilTot_To, 12, 2))) ;
      AV13GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFMANTKILPROD", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFMAntKilProd)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFMAntKilProd_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV42TFMAntKilProd, 12, 2)), GXutil.trim( GXutil.str( AV43TFMAntKilProd_To, 12, 2))) ;
      AV13GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFMANTKILREO", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV44TFMAntKilReo)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV45TFMAntKilReo_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV44TFMAntKilReo, 12, 2)), GXutil.trim( GXutil.str( AV45TFMAntKilReo_To, 12, 2))) ;
      AV13GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFMANTPORC", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFMAntPorc)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFMAntPorc_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV50TFMAntPorc, 7, 2)), GXutil.trim( GXutil.str( AV51TFMAntPorc_To, 7, 2))) ;
      AV13GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFMANTMETTOT", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV87TFMAntMetTot)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV88TFMAntMetTot_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV87TFMAntMetTot, 12, 2)), GXutil.trim( GXutil.str( AV88TFMAntMetTot_To, 12, 2))) ;
      AV13GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFMANTMETPROD", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV83TFMAntMetProd)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV84TFMAntMetProd_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV83TFMAntMetProd, 12, 2)), GXutil.trim( GXutil.str( AV84TFMAntMetProd_To, 12, 2))) ;
      AV13GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFMANTMETREO", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV85TFMAntMetReo)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV86TFMAntMetReo_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV85TFMAntMetReo, 12, 2)), GXutil.trim( GXutil.str( AV86TFMAntMetReo_To, 12, 2))) ;
      AV13GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFMANTMETPOR", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV89TFMantMetPor)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV90TFMantMetPor_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV89TFMantMetPor, 7, 2)), GXutil.trim( GXutil.str( AV90TFMantMetPor_To, 7, 2))) ;
      AV13GridState = GXv_SdtWWPGridState26[0] ;
      if ( ! (GXutil.strcmp("", AV61MAntEmprCod)==0) )
      {
         AV14GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV14GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&MANTEMPRCOD" );
         AV14GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV61MAntEmprCod );
         AV13GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV14GridStateFilterValue, 0);
      }
      if ( ! (0==AV65CliCod) )
      {
         AV14GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV14GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICOD" );
         AV14GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV65CliCod, 6, 0) );
         AV13GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV14GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV66ArtCod)==0) )
      {
         AV14GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV14GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ARTCOD" );
         AV14GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV66ArtCod );
         AV13GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV14GridStateFilterValue, 0);
      }
      if ( ! (0==AV67ForColNum) )
      {
         AV14GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV14GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FORCOLNUM" );
         AV14GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV67ForColNum, 6, 0) );
         AV13GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV14GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV68TipMaqCodJSON)==0) )
      {
         AV14GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV14GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&TIPMAQCODJSON" );
         AV14GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV68TipMaqCodJSON );
         AV13GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV14GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV70FechaInicio)) )
      {
         AV14GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV14GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FECHAINICIO" );
         AV14GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV70FechaInicio, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV13GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV14GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV71FechaFin)) )
      {
         AV14GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV14GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FECHAFIN" );
         AV14GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV71FechaFin, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV13GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV14GridStateFilterValue, 0);
      }
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV97Pgmname+"GridState", AV13GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV56TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV56TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV97Pgmname );
      AV56TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV56TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV15HTTPRequest.getScriptName()+"?"+AV15HTTPRequest.getQuerystring() );
      AV56TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "AnticipacionErrores.MAnt" );
      AV23Session.setValue("TrnContext", AV56TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void e182DQ2( )
   {
      /* MAntPorc_Click Routine */
      returnInSub = false ;
      if ( A14645MAntPorc.doubleValue() > 0 )
      {
         AV81sdtParametros.setgxTv_SdtsdtParametros_Emprcod( A14566MAntEmprCo );
         AV81sdtParametros.setgxTv_SdtsdtParametros_Clicod( A14565MAntCliCod );
         AV81sdtParametros.setgxTv_SdtsdtParametros_Artcod( A14567MAntArtCod );
         AV81sdtParametros.setgxTv_SdtsdtParametros_Forcolnum( A14568MAntColNum );
         AV81sdtParametros.setgxTv_SdtsdtParametros_Tipmaqcod( A14569MAntTipMCo );
         AV81sdtParametros.setgxTv_SdtsdtParametros_Maqcod( A14570MAntMaqCod );
         AV81sdtParametros.setgxTv_SdtsdtParametros_Fechainicio( AV70FechaInicio );
         AV81sdtParametros.setgxTv_SdtsdtParametros_Fechafin( AV71FechaFin );
         AV81sdtParametros.setgxTv_SdtsdtParametros_Mtknusu( A14564MAntUsu );
         AV81sdtParametros.setgxTv_SdtsdtParametros_Mtkn( A14563MAntTkn );
         AV80ValorRecibidoVariable = AV81sdtParametros.toJSonString(false, true) ;
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Porcentaje  parametros:%1", ""), AV80ValorRecibidoVariable, "", "", "", "", "", "", "", ""), AV97Pgmname) ;
         this.executeExternalObjectMethod(sPrefix, false, "GlobalEvents", "RefreshGrid", new Object[] {"MAnt_Filtrado",AV80ValorRecibidoVariable}, true);
      }
      else
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "Porcentaje es cero, no existen, Reoperados para mostrar, en la maquina:%1", ""), A14570MAntMaqCod, "", "", "", "", "", "", "", ""));
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV81sdtParametros", AV81sdtParametros);
   }

   public void e192DQ2( )
   {
      /* MantMetPor_Click Routine */
      returnInSub = false ;
      if ( A14650MantMetPor.doubleValue() > 0 )
      {
         AV81sdtParametros.setgxTv_SdtsdtParametros_Emprcod( A14566MAntEmprCo );
         AV81sdtParametros.setgxTv_SdtsdtParametros_Clicod( A14565MAntCliCod );
         AV81sdtParametros.setgxTv_SdtsdtParametros_Artcod( A14567MAntArtCod );
         AV81sdtParametros.setgxTv_SdtsdtParametros_Forcolnum( A14568MAntColNum );
         AV81sdtParametros.setgxTv_SdtsdtParametros_Tipmaqcod( A14569MAntTipMCo );
         AV81sdtParametros.setgxTv_SdtsdtParametros_Maqcod( A14570MAntMaqCod );
         AV81sdtParametros.setgxTv_SdtsdtParametros_Fechainicio( AV70FechaInicio );
         AV81sdtParametros.setgxTv_SdtsdtParametros_Fechafin( AV71FechaFin );
         AV81sdtParametros.setgxTv_SdtsdtParametros_Mtknusu( A14564MAntUsu );
         AV81sdtParametros.setgxTv_SdtsdtParametros_Mtkn( A14563MAntTkn );
         AV80ValorRecibidoVariable = AV81sdtParametros.toJSonString(false, true) ;
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Porcentaje  parametros:%1", ""), AV80ValorRecibidoVariable, "", "", "", "", "", "", "", ""), AV97Pgmname) ;
         this.executeExternalObjectMethod(sPrefix, false, "GlobalEvents", "RefreshGrid", new Object[] {"MAnt_Filtrado",AV80ValorRecibidoVariable}, true);
      }
      else
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "Porcentaje es cero, no existen, Reoperados para mostrar, en la maquina:%1", ""), A14570MAntMaqCod, "", "", "", "", "", "", "", ""));
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV81sdtParametros", AV81sdtParametros);
   }

   public void e202DQ2( )
   {
      /* MAntKilReo_Click Routine */
      returnInSub = false ;
      AV81sdtParametros.setgxTv_SdtsdtParametros_Emprcod( A14566MAntEmprCo );
      AV81sdtParametros.setgxTv_SdtsdtParametros_Clicod( A14565MAntCliCod );
      AV81sdtParametros.setgxTv_SdtsdtParametros_Artcod( A14567MAntArtCod );
      AV81sdtParametros.setgxTv_SdtsdtParametros_Forcolnum( A14568MAntColNum );
      AV81sdtParametros.setgxTv_SdtsdtParametros_Tipmaqcod( A14569MAntTipMCo );
      AV81sdtParametros.setgxTv_SdtsdtParametros_Maqcod( A14570MAntMaqCod );
      AV81sdtParametros.setgxTv_SdtsdtParametros_Fechainicio( AV70FechaInicio );
      AV81sdtParametros.setgxTv_SdtsdtParametros_Fechafin( AV71FechaFin );
      AV81sdtParametros.setgxTv_SdtsdtParametros_Mtknusu( A14564MAntUsu );
      AV81sdtParametros.setgxTv_SdtsdtParametros_Mtkn( A14563MAntTkn );
      AV80ValorRecibidoVariable = AV81sdtParametros.toJSonString(false, true) ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Reoperado parametros:%1", ""), AV80ValorRecibidoVariable, "", "", "", "", "", "", "", ""), AV97Pgmname) ;
      this.executeExternalObjectMethod(sPrefix, false, "GlobalEvents", "RefreshGrid", new Object[] {"MAnt_Filtrado_RightButton",AV80ValorRecibidoVariable}, true);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV81sdtParametros", AV81sdtParametros);
   }

   public void e212DQ2( )
   {
      /* MAntMetReo_Click Routine */
      returnInSub = false ;
      AV81sdtParametros.setgxTv_SdtsdtParametros_Emprcod( A14566MAntEmprCo );
      AV81sdtParametros.setgxTv_SdtsdtParametros_Clicod( A14565MAntCliCod );
      AV81sdtParametros.setgxTv_SdtsdtParametros_Artcod( A14567MAntArtCod );
      AV81sdtParametros.setgxTv_SdtsdtParametros_Forcolnum( A14568MAntColNum );
      AV81sdtParametros.setgxTv_SdtsdtParametros_Tipmaqcod( A14569MAntTipMCo );
      AV81sdtParametros.setgxTv_SdtsdtParametros_Maqcod( A14570MAntMaqCod );
      AV81sdtParametros.setgxTv_SdtsdtParametros_Fechainicio( AV70FechaInicio );
      AV81sdtParametros.setgxTv_SdtsdtParametros_Fechafin( AV71FechaFin );
      AV81sdtParametros.setgxTv_SdtsdtParametros_Mtknusu( A14564MAntUsu );
      AV81sdtParametros.setgxTv_SdtsdtParametros_Mtkn( A14563MAntTkn );
      AV80ValorRecibidoVariable = AV81sdtParametros.toJSonString(false, true) ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Reoperado parametros:%1", ""), AV80ValorRecibidoVariable, "", "", "", "", "", "", "", ""), AV97Pgmname) ;
      this.executeExternalObjectMethod(sPrefix, false, "GlobalEvents", "RefreshGrid", new Object[] {"MAnt_Filtrado_RightButton",AV80ValorRecibidoVariable}, true);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV81sdtParametros", AV81sdtParametros);
   }

   public void wb_table1_23_2DQ2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV17ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_28_2DQ2( true) ;
      }
      else
      {
         wb_table2_28_2DQ2( false) ;
      }
      return  ;
   }

   public void wb_table2_28_2DQ2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_23_2DQ2e( true) ;
      }
      else
      {
         wb_table1_23_2DQ2e( false) ;
      }
   }

   public void wb_table2_28_2DQ2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'" + sPrefix + "',false,'" + sGXsfl_38_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV12FilterFullText, GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_AnticipacionErrores\\MAnt_Filtrado.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_28_2DQ2e( true) ;
      }
      else
      {
         wb_table2_28_2DQ2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV61MAntEmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61MAntEmprCod", AV61MAntEmprCod);
      AV65CliCod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65CliCod), 6, 0));
      AV66ArtCod = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66ArtCod", AV66ArtCod);
      AV67ForColNum = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67ForColNum), 6, 0));
      AV68TipMaqCodJSON = (String)getParm(obj,4,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TipMaqCodJSON", AV68TipMaqCodJSON);
      AV70FechaInicio = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70FechaInicio", localUtil.format(AV70FechaInicio, "99/99/99"));
      AV71FechaFin = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71FechaFin", localUtil.format(AV71FechaFin, "99/99/99"));
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
      pa2DQ2( ) ;
      ws2DQ2( ) ;
      we2DQ2( ) ;
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
      sCtrlAV61MAntEmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV65CliCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV66ArtCod = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV67ForColNum = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV68TipMaqCodJSON = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV70FechaInicio = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV71FechaFin = (String)getParm(obj,6,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa2DQ2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "anticipacionerrores\\mant_filtrado", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa2DQ2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV61MAntEmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61MAntEmprCod", AV61MAntEmprCod);
         AV65CliCod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65CliCod), 6, 0));
         AV66ArtCod = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66ArtCod", AV66ArtCod);
         AV67ForColNum = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67ForColNum), 6, 0));
         AV68TipMaqCodJSON = (String)getParm(obj,6,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TipMaqCodJSON", AV68TipMaqCodJSON);
         AV70FechaInicio = (java.util.Date)getParm(obj,7,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70FechaInicio", localUtil.format(AV70FechaInicio, "99/99/99"));
         AV71FechaFin = (java.util.Date)getParm(obj,8,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71FechaFin", localUtil.format(AV71FechaFin, "99/99/99"));
      }
      wcpOAV61MAntEmprCod = httpContext.cgiGet( sPrefix+"wcpOAV61MAntEmprCod") ;
      wcpOAV65CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV65CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV66ArtCod = httpContext.cgiGet( sPrefix+"wcpOAV66ArtCod") ;
      wcpOAV67ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV67ForColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV68TipMaqCodJSON = httpContext.cgiGet( sPrefix+"wcpOAV68TipMaqCodJSON") ;
      wcpOAV70FechaInicio = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV70FechaInicio"), 0) ;
      wcpOAV71FechaFin = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV71FechaFin"), 0) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV61MAntEmprCod, wcpOAV61MAntEmprCod) != 0 ) || ( AV65CliCod != wcpOAV65CliCod ) || ( GXutil.strcmp(AV66ArtCod, wcpOAV66ArtCod) != 0 ) || ( AV67ForColNum != wcpOAV67ForColNum ) || ( GXutil.strcmp(AV68TipMaqCodJSON, wcpOAV68TipMaqCodJSON) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV70FechaInicio), GXutil.resetTime(wcpOAV70FechaInicio)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV71FechaFin), GXutil.resetTime(wcpOAV71FechaFin)) ) ) )
      {
         setjustcreated();
      }
      wcpOAV61MAntEmprCod = AV61MAntEmprCod ;
      wcpOAV65CliCod = AV65CliCod ;
      wcpOAV66ArtCod = AV66ArtCod ;
      wcpOAV67ForColNum = AV67ForColNum ;
      wcpOAV68TipMaqCodJSON = AV68TipMaqCodJSON ;
      wcpOAV70FechaInicio = AV70FechaInicio ;
      wcpOAV71FechaFin = AV71FechaFin ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV61MAntEmprCod = httpContext.cgiGet( sPrefix+"AV61MAntEmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV61MAntEmprCod) > 0 )
      {
         AV61MAntEmprCod = httpContext.cgiGet( sCtrlAV61MAntEmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61MAntEmprCod", AV61MAntEmprCod);
      }
      else
      {
         AV61MAntEmprCod = httpContext.cgiGet( sPrefix+"AV61MAntEmprCod_PARM") ;
      }
      sCtrlAV65CliCod = httpContext.cgiGet( sPrefix+"AV65CliCod_CTRL") ;
      if ( GXutil.len( sCtrlAV65CliCod) > 0 )
      {
         AV65CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV65CliCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65CliCod), 6, 0));
      }
      else
      {
         AV65CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV65CliCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV66ArtCod = httpContext.cgiGet( sPrefix+"AV66ArtCod_CTRL") ;
      if ( GXutil.len( sCtrlAV66ArtCod) > 0 )
      {
         AV66ArtCod = httpContext.cgiGet( sCtrlAV66ArtCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66ArtCod", AV66ArtCod);
      }
      else
      {
         AV66ArtCod = httpContext.cgiGet( sPrefix+"AV66ArtCod_PARM") ;
      }
      sCtrlAV67ForColNum = httpContext.cgiGet( sPrefix+"AV67ForColNum_CTRL") ;
      if ( GXutil.len( sCtrlAV67ForColNum) > 0 )
      {
         AV67ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV67ForColNum), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67ForColNum), 6, 0));
      }
      else
      {
         AV67ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV67ForColNum_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV68TipMaqCodJSON = httpContext.cgiGet( sPrefix+"AV68TipMaqCodJSON_CTRL") ;
      if ( GXutil.len( sCtrlAV68TipMaqCodJSON) > 0 )
      {
         AV68TipMaqCodJSON = httpContext.cgiGet( sCtrlAV68TipMaqCodJSON) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TipMaqCodJSON", AV68TipMaqCodJSON);
      }
      else
      {
         AV68TipMaqCodJSON = httpContext.cgiGet( sPrefix+"AV68TipMaqCodJSON_PARM") ;
      }
      sCtrlAV70FechaInicio = httpContext.cgiGet( sPrefix+"AV70FechaInicio_CTRL") ;
      if ( GXutil.len( sCtrlAV70FechaInicio) > 0 )
      {
         AV70FechaInicio = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV70FechaInicio), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70FechaInicio", localUtil.format(AV70FechaInicio, "99/99/99"));
      }
      else
      {
         AV70FechaInicio = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV70FechaInicio_PARM"), 0) ;
      }
      sCtrlAV71FechaFin = httpContext.cgiGet( sPrefix+"AV71FechaFin_CTRL") ;
      if ( GXutil.len( sCtrlAV71FechaFin) > 0 )
      {
         AV71FechaFin = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV71FechaFin), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71FechaFin", localUtil.format(AV71FechaFin, "99/99/99"));
      }
      else
      {
         AV71FechaFin = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV71FechaFin_PARM"), 0) ;
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
      pa2DQ2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws2DQ2( ) ;
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
      ws2DQ2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV61MAntEmprCod_PARM", GXutil.rtrim( AV61MAntEmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV61MAntEmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV61MAntEmprCod_CTRL", GXutil.rtrim( sCtrlAV61MAntEmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV65CliCod_PARM", GXutil.ltrim( localUtil.ntoc( AV65CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV65CliCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV65CliCod_CTRL", GXutil.rtrim( sCtrlAV65CliCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV66ArtCod_PARM", GXutil.rtrim( AV66ArtCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV66ArtCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV66ArtCod_CTRL", GXutil.rtrim( sCtrlAV66ArtCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV67ForColNum_PARM", GXutil.ltrim( localUtil.ntoc( AV67ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV67ForColNum)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV67ForColNum_CTRL", GXutil.rtrim( sCtrlAV67ForColNum));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV68TipMaqCodJSON_PARM", AV68TipMaqCodJSON);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV68TipMaqCodJSON)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV68TipMaqCodJSON_CTRL", GXutil.rtrim( sCtrlAV68TipMaqCodJSON));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV70FechaInicio_PARM", localUtil.dtoc( AV70FechaInicio, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV70FechaInicio)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV70FechaInicio_CTRL", GXutil.rtrim( sCtrlAV70FechaInicio));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV71FechaFin_PARM", localUtil.dtoc( AV71FechaFin, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV71FechaFin)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV71FechaFin_CTRL", GXutil.rtrim( sCtrlAV71FechaFin));
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
      we2DQ2( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116111018", true, true);
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
      httpContext.AddJavascriptSource("anticipacionerrores/mant_filtrado.js", "?202682116111019", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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

   public void subsflControlProps_382( )
   {
      edtMAntId_Internalname = sPrefix+"MANTID_"+sGXsfl_38_idx ;
      edtMAntEmprCo_Internalname = sPrefix+"MANTEMPRCO_"+sGXsfl_38_idx ;
      edtMAntCliCod_Internalname = sPrefix+"MANTCLICOD_"+sGXsfl_38_idx ;
      edtMAntCliNom_Internalname = sPrefix+"MANTCLINOM_"+sGXsfl_38_idx ;
      edtMAntArtCod_Internalname = sPrefix+"MANTARTCOD_"+sGXsfl_38_idx ;
      edtMAntArtDsc_Internalname = sPrefix+"MANTARTDSC_"+sGXsfl_38_idx ;
      edtMAntColNum_Internalname = sPrefix+"MANTCOLNUM_"+sGXsfl_38_idx ;
      edtMAntColNom_Internalname = sPrefix+"MANTCOLNOM_"+sGXsfl_38_idx ;
      edtMAntColCod_Internalname = sPrefix+"MANTCOLCOD_"+sGXsfl_38_idx ;
      edtMAntMaqCod_Internalname = sPrefix+"MANTMAQCOD_"+sGXsfl_38_idx ;
      edtMAntMaqDsc_Internalname = sPrefix+"MANTMAQDSC_"+sGXsfl_38_idx ;
      edtMAntTipMCo_Internalname = sPrefix+"MANTTIPMCO_"+sGXsfl_38_idx ;
      edtMAntTipMDs_Internalname = sPrefix+"MANTTIPMDS_"+sGXsfl_38_idx ;
      edtMAntKilTot_Internalname = sPrefix+"MANTKILTOT_"+sGXsfl_38_idx ;
      edtMAntKilPro_Internalname = sPrefix+"MANTKILPRO_"+sGXsfl_38_idx ;
      edtMAntKilReo_Internalname = sPrefix+"MANTKILREO_"+sGXsfl_38_idx ;
      edtMAntPorc_Internalname = sPrefix+"MANTPORC_"+sGXsfl_38_idx ;
      edtMAntMetTot_Internalname = sPrefix+"MANTMETTOT_"+sGXsfl_38_idx ;
      edtMAntMetPro_Internalname = sPrefix+"MANTMETPRO_"+sGXsfl_38_idx ;
      edtMAntMetReo_Internalname = sPrefix+"MANTMETREO_"+sGXsfl_38_idx ;
      edtMantMetPor_Internalname = sPrefix+"MANTMETPOR_"+sGXsfl_38_idx ;
      edtMAntUsu_Internalname = sPrefix+"MANTUSU_"+sGXsfl_38_idx ;
      edtMAntTkn_Internalname = sPrefix+"MANTTKN_"+sGXsfl_38_idx ;
   }

   public void subsflControlProps_fel_382( )
   {
      edtMAntId_Internalname = sPrefix+"MANTID_"+sGXsfl_38_fel_idx ;
      edtMAntEmprCo_Internalname = sPrefix+"MANTEMPRCO_"+sGXsfl_38_fel_idx ;
      edtMAntCliCod_Internalname = sPrefix+"MANTCLICOD_"+sGXsfl_38_fel_idx ;
      edtMAntCliNom_Internalname = sPrefix+"MANTCLINOM_"+sGXsfl_38_fel_idx ;
      edtMAntArtCod_Internalname = sPrefix+"MANTARTCOD_"+sGXsfl_38_fel_idx ;
      edtMAntArtDsc_Internalname = sPrefix+"MANTARTDSC_"+sGXsfl_38_fel_idx ;
      edtMAntColNum_Internalname = sPrefix+"MANTCOLNUM_"+sGXsfl_38_fel_idx ;
      edtMAntColNom_Internalname = sPrefix+"MANTCOLNOM_"+sGXsfl_38_fel_idx ;
      edtMAntColCod_Internalname = sPrefix+"MANTCOLCOD_"+sGXsfl_38_fel_idx ;
      edtMAntMaqCod_Internalname = sPrefix+"MANTMAQCOD_"+sGXsfl_38_fel_idx ;
      edtMAntMaqDsc_Internalname = sPrefix+"MANTMAQDSC_"+sGXsfl_38_fel_idx ;
      edtMAntTipMCo_Internalname = sPrefix+"MANTTIPMCO_"+sGXsfl_38_fel_idx ;
      edtMAntTipMDs_Internalname = sPrefix+"MANTTIPMDS_"+sGXsfl_38_fel_idx ;
      edtMAntKilTot_Internalname = sPrefix+"MANTKILTOT_"+sGXsfl_38_fel_idx ;
      edtMAntKilPro_Internalname = sPrefix+"MANTKILPRO_"+sGXsfl_38_fel_idx ;
      edtMAntKilReo_Internalname = sPrefix+"MANTKILREO_"+sGXsfl_38_fel_idx ;
      edtMAntPorc_Internalname = sPrefix+"MANTPORC_"+sGXsfl_38_fel_idx ;
      edtMAntMetTot_Internalname = sPrefix+"MANTMETTOT_"+sGXsfl_38_fel_idx ;
      edtMAntMetPro_Internalname = sPrefix+"MANTMETPRO_"+sGXsfl_38_fel_idx ;
      edtMAntMetReo_Internalname = sPrefix+"MANTMETREO_"+sGXsfl_38_fel_idx ;
      edtMantMetPor_Internalname = sPrefix+"MANTMETPOR_"+sGXsfl_38_fel_idx ;
      edtMAntUsu_Internalname = sPrefix+"MANTUSU_"+sGXsfl_38_fel_idx ;
      edtMAntTkn_Internalname = sPrefix+"MANTTKN_"+sGXsfl_38_fel_idx ;
   }

   public void sendrow_382( )
   {
      subsflControlProps_382( ) ;
      wb2DQ0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_38_idx - GRID_nFirstRecordOnPage <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_38_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_38_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMAntId_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMAntId_Internalname,GXutil.ltrim( localUtil.ntoc( A14562MAntId, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14562MAntId), "ZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMAntId_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMAntId_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"AnticipacionErrores\\Id","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMAntEmprCo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMAntEmprCo_Internalname,GXutil.rtrim( A14566MAntEmprCo),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'",edtMAntEmprCo_Link,"","","",edtMAntEmprCo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMAntEmprCo_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMAntCliCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMAntCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A14565MAntCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14565MAntCliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMAntCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMAntCliCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMAntCliNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMAntCliNom_Internalname,A14611MAntCliNom,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMAntCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMAntCliNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(255),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"Mensaje","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMAntArtCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMAntArtCod_Internalname,GXutil.rtrim( A14567MAntArtCod),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMAntArtCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMAntArtCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMAntArtDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMAntArtDsc_Internalname,A14613MAntArtDsc,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMAntArtDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMAntArtDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(255),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"Mensaje","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMAntColNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMAntColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A14568MAntColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14568MAntColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMAntColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMAntColNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMAntColNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMAntColNom_Internalname,GXutil.rtrim( A14623MAntColNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMAntColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMAntColNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMAntColCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMAntColCod_Internalname,GXutil.ltrim( localUtil.ntoc( A14642MAntColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14642MAntColCod), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMAntColCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMAntColCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMAntMaqCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMAntMaqCod_Internalname,GXutil.rtrim( A14570MAntMaqCod),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMAntMaqCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMAntMaqCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMAntMaqDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMAntMaqDsc_Internalname,A14610MAntMaqDsc,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMAntMaqDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMAntMaqDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(255),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"Mensaje","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMAntTipMCo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMAntTipMCo_Internalname,GXutil.rtrim( A14569MAntTipMCo),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMAntTipMCo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMAntTipMCo_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMAntTipMDs_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMAntTipMDs_Internalname,A14612MAntTipMDs,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMAntTipMDs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMAntTipMDs_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(255),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"Mensaje","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMAntKilTot_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMAntKilTot_Internalname,GXutil.ltrim( localUtil.ntoc( A14646MAntKilTot, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A14646MAntKilTot, "ZZZZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMAntKilTot_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMAntKilTot_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMAntKilPro_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMAntKilPro_Internalname,GXutil.ltrim( localUtil.ntoc( A14643MAntKilPro, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A14643MAntKilPro, "ZZZZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMAntKilPro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMAntKilPro_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMAntKilReo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMAntKilReo_Internalname,GXutil.ltrim( localUtil.ntoc( A14644MAntKilReo, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A14644MAntKilReo, "ZZZZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+sPrefix+"EMANTKILREO.CLICK."+sGXsfl_38_idx+"'","","","","",edtMAntKilReo_Jsonclick,Integer.valueOf(5),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMAntKilReo_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMAntPorc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMAntPorc_Internalname,GXutil.ltrim( localUtil.ntoc( A14645MAntPorc, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A14645MAntPorc, "ZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+sPrefix+"EMANTPORC.CLICK."+sGXsfl_38_idx+"'","","","","",edtMAntPorc_Jsonclick,Integer.valueOf(5),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMAntPorc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMAntMetTot_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMAntMetTot_Internalname,GXutil.ltrim( localUtil.ntoc( A14647MAntMetTot, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A14647MAntMetTot, "ZZZZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMAntMetTot_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMAntMetTot_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMAntMetPro_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMAntMetPro_Internalname,GXutil.ltrim( localUtil.ntoc( A14648MAntMetPro, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A14648MAntMetPro, "ZZZZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMAntMetPro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMAntMetPro_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMAntMetReo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMAntMetReo_Internalname,GXutil.ltrim( localUtil.ntoc( A14649MAntMetReo, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A14649MAntMetReo, "ZZZZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+sPrefix+"EMANTMETREO.CLICK."+sGXsfl_38_idx+"'","","","","",edtMAntMetReo_Jsonclick,Integer.valueOf(5),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMAntMetReo_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMantMetPor_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMantMetPor_Internalname,GXutil.ltrim( localUtil.ntoc( A14650MantMetPor, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A14650MantMetPor, "ZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+sPrefix+"EMANTMETPOR.CLICK."+sGXsfl_38_idx+"'","","","","",edtMantMetPor_Jsonclick,Integer.valueOf(5),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMantMetPor_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMAntUsu_Internalname,GXutil.rtrim( A14564MAntUsu),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMAntUsu_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMAntTkn_Internalname,A14563MAntTkn,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMAntTkn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(256),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes2DQ2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_38_idx = ((subGrid_Islastpage==1)&&(nGXsfl_38_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_38_idx+1) ;
         sGXsfl_38_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_38_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_382( ) ;
      }
      /* End function sendrow_382 */
   }

   public void startgridcontrol38( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"38\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMAntId_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Id", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMAntEmprCo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Empresa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMAntCliCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMAntCliNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMAntArtCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cód Artículo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMAntArtDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Artículo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMAntColNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMAntColNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMAntColCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo Colorante", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMAntMaqCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "máquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMAntMaqDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Máquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMAntTipMCo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cód.  Tipo Máquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMAntTipMDs_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo Máquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMAntKilTot_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos Total", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMAntKilPro_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos Produccion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMAntKilReo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos Reoperados", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMAntPorc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Porc", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMAntMetTot_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros Total", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMAntMetPro_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "M.  Produccion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMAntMetReo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "M. Reoperados", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMantMetPor_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Porc Met", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
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
         GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14562MAntId, (byte)(10), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMAntId_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14566MAntEmprCo));
         GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtMAntEmprCo_Link));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMAntEmprCo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14565MAntCliCod, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMAntCliCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A14611MAntCliNom);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMAntCliNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14567MAntArtCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMAntArtCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A14613MAntArtDsc);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMAntArtDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14568MAntColNum, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMAntColNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14623MAntColNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMAntColNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14642MAntColCod, (byte)(2), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMAntColCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14570MAntMaqCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMAntMaqCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A14610MAntMaqDsc);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMAntMaqDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14569MAntTipMCo));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMAntTipMCo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A14612MAntTipMDs);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMAntTipMDs_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14646MAntKilTot, (byte)(12), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMAntKilTot_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14643MAntKilPro, (byte)(12), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMAntKilPro_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14644MAntKilReo, (byte)(12), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMAntKilReo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14645MAntPorc, (byte)(7), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMAntPorc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14647MAntMetTot, (byte)(12), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMAntMetTot_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14648MAntMetPro, (byte)(12), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMAntMetPro_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14649MAntMetReo, (byte)(12), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMAntMetReo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14650MantMetPor, (byte)(7), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMantMetPor_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14564MAntUsu));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A14563MAntTkn);
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
      lblTitulo_Internalname = sPrefix+"TITULO" ;
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtMAntId_Internalname = sPrefix+"MANTID" ;
      edtMAntEmprCo_Internalname = sPrefix+"MANTEMPRCO" ;
      edtMAntCliCod_Internalname = sPrefix+"MANTCLICOD" ;
      edtMAntCliNom_Internalname = sPrefix+"MANTCLINOM" ;
      edtMAntArtCod_Internalname = sPrefix+"MANTARTCOD" ;
      edtMAntArtDsc_Internalname = sPrefix+"MANTARTDSC" ;
      edtMAntColNum_Internalname = sPrefix+"MANTCOLNUM" ;
      edtMAntColNom_Internalname = sPrefix+"MANTCOLNOM" ;
      edtMAntColCod_Internalname = sPrefix+"MANTCOLCOD" ;
      edtMAntMaqCod_Internalname = sPrefix+"MANTMAQCOD" ;
      edtMAntMaqDsc_Internalname = sPrefix+"MANTMAQDSC" ;
      edtMAntTipMCo_Internalname = sPrefix+"MANTTIPMCO" ;
      edtMAntTipMDs_Internalname = sPrefix+"MANTTIPMDS" ;
      edtMAntKilTot_Internalname = sPrefix+"MANTKILTOT" ;
      edtMAntKilPro_Internalname = sPrefix+"MANTKILPRO" ;
      edtMAntKilReo_Internalname = sPrefix+"MANTKILREO" ;
      edtMAntPorc_Internalname = sPrefix+"MANTPORC" ;
      edtMAntMetTot_Internalname = sPrefix+"MANTMETTOT" ;
      edtMAntMetPro_Internalname = sPrefix+"MANTMETPRO" ;
      edtMAntMetReo_Internalname = sPrefix+"MANTMETREO" ;
      edtMantMetPor_Internalname = sPrefix+"MANTMETPOR" ;
      edtMAntUsu_Internalname = sPrefix+"MANTUSU" ;
      edtMAntTkn_Internalname = sPrefix+"MANTTKN" ;
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
      edtMAntTkn_Jsonclick = "" ;
      edtMAntUsu_Jsonclick = "" ;
      edtMantMetPor_Jsonclick = "" ;
      edtMAntMetReo_Jsonclick = "" ;
      edtMAntMetPro_Jsonclick = "" ;
      edtMAntMetTot_Jsonclick = "" ;
      edtMAntPorc_Jsonclick = "" ;
      edtMAntKilReo_Jsonclick = "" ;
      edtMAntKilPro_Jsonclick = "" ;
      edtMAntKilTot_Jsonclick = "" ;
      edtMAntTipMDs_Jsonclick = "" ;
      edtMAntTipMCo_Jsonclick = "" ;
      edtMAntMaqDsc_Jsonclick = "" ;
      edtMAntMaqCod_Jsonclick = "" ;
      edtMAntColCod_Jsonclick = "" ;
      edtMAntColNom_Jsonclick = "" ;
      edtMAntColNum_Jsonclick = "" ;
      edtMAntArtDsc_Jsonclick = "" ;
      edtMAntArtCod_Jsonclick = "" ;
      edtMAntCliNom_Jsonclick = "" ;
      edtMAntCliCod_Jsonclick = "" ;
      edtMAntEmprCo_Jsonclick = "" ;
      edtMAntEmprCo_Link = "" ;
      edtMAntId_Jsonclick = "" ;
      subGrid_Class = "GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtMantMetPor_Visible = -1 ;
      edtMAntMetReo_Visible = -1 ;
      edtMAntMetPro_Visible = -1 ;
      edtMAntMetTot_Visible = -1 ;
      edtMAntPorc_Visible = -1 ;
      edtMAntKilReo_Visible = -1 ;
      edtMAntKilPro_Visible = -1 ;
      edtMAntKilTot_Visible = -1 ;
      edtMAntTipMDs_Visible = -1 ;
      edtMAntTipMCo_Visible = -1 ;
      edtMAntMaqDsc_Visible = -1 ;
      edtMAntMaqCod_Visible = -1 ;
      edtMAntColCod_Visible = -1 ;
      edtMAntColNom_Visible = -1 ;
      edtMAntColNum_Visible = -1 ;
      edtMAntArtDsc_Visible = -1 ;
      edtMAntArtCod_Visible = -1 ;
      edtMAntCliNom_Visible = -1 ;
      edtMAntCliCod_Visible = -1 ;
      edtMAntEmprCo_Visible = -1 ;
      edtMAntId_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      lblTitulo_Caption = "" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Infinitescrolling = "Form" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "AnticipacionErrores.MAnt_FiltradoGetFilterData" ;
      Ddo_grid_Datalisttype = "|Dynamic||Dynamic|Dynamic|Dynamic||Dynamic||Dynamic|Dynamic|Dynamic|Dynamic||||||||" ;
      Ddo_grid_Includedatalist = "|T||T|T|T||T||T|T|T|T||||||||" ;
      Ddo_grid_Filterisrange = "T||T||||T||T|||||T|T|T|T|T|T|T|T" ;
      Ddo_grid_Filtertype = "Numeric|Character|Numeric|Character|Character|Character|Numeric|Character|Numeric|Character|Character|Character|Character|Numeric|Numeric|Numeric|Numeric|Numeric|Numeric|Numeric|Numeric" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T||T|T|T|" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16||17|18|19|" ;
      Ddo_grid_Columnids = "0:MAntId|1:MAntEmprCod|2:MAntCliCod|3:MAntCliNom|4:MAntArtCod|5:MAntArtDsc|6:MAntColNum|7:MAntColNom|8:MAntColCod|9:MAntMaqCod|10:MAntMaqDsc|11:MAntTipMCod|12:MAntTipMDsc|13:MAntKilTot|14:MAntKilProd|15:MAntKilReo|16:MAntPorc|17:MAntMetTot|18:MAntMetProd|19:MAntMetReo|20:MantMetPor" ;
      Ddo_grid_Gridinternalname = "" ;
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
      subGrid_Rows = 50 ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV69TipMaqCodCollection',fld:'vTIPMAQCODCOLLECTION',pic:''},{av:'AV78sdtMTok',fld:'vSDTMTOK',pic:''},{av:'sPrefix'},{av:'AV18ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV6ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV40TFMAntId',fld:'vTFMANTID',pic:'ZZZZZZZZZ9'},{av:'AV41TFMAntId_To',fld:'vTFMANTID_TO',pic:'ZZZZZZZZZ9'},{av:'AV38TFMAntEmprCod',fld:'vTFMANTEMPRCOD',pic:''},{av:'AV39TFMAntEmprCod_Sel',fld:'vTFMANTEMPRCOD_SEL',pic:''},{av:'AV28TFMAntCliCod',fld:'vTFMANTCLICOD',pic:'ZZZZZ9'},{av:'AV29TFMAntCliCod_To',fld:'vTFMANTCLICOD_TO',pic:'ZZZZZ9'},{av:'AV30TFMAntCliNom',fld:'vTFMANTCLINOM',pic:''},{av:'AV31TFMAntCliNom_Sel',fld:'vTFMANTCLINOM_SEL',pic:''},{av:'AV24TFMAntArtCod',fld:'vTFMANTARTCOD',pic:''},{av:'AV25TFMAntArtCod_Sel',fld:'vTFMANTARTCOD_SEL',pic:''},{av:'AV26TFMAntArtDsc',fld:'vTFMANTARTDSC',pic:''},{av:'AV27TFMAntArtDsc_Sel',fld:'vTFMANTARTDSC_SEL',pic:''},{av:'AV36TFMAntColNum',fld:'vTFMANTCOLNUM',pic:'ZZZZZ9'},{av:'AV37TFMAntColNum_To',fld:'vTFMANTCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV34TFMAntColNom',fld:'vTFMANTCOLNOM',pic:''},{av:'AV35TFMAntColNom_Sel',fld:'vTFMANTCOLNOM_SEL',pic:''},{av:'AV32TFMAntColCod',fld:'vTFMANTCOLCOD',pic:'Z9'},{av:'AV33TFMAntColCod_To',fld:'vTFMANTCOLCOD_TO',pic:'Z9'},{av:'AV46TFMAntMaqCod',fld:'vTFMANTMAQCOD',pic:''},{av:'AV47TFMAntMaqCod_Sel',fld:'vTFMANTMAQCOD_SEL',pic:''},{av:'AV48TFMAntMaqDsc',fld:'vTFMANTMAQDSC',pic:''},{av:'AV49TFMAntMaqDsc_Sel',fld:'vTFMANTMAQDSC_SEL',pic:''},{av:'AV52TFMAntTipMCod',fld:'vTFMANTTIPMCOD',pic:''},{av:'AV53TFMAntTipMCod_Sel',fld:'vTFMANTTIPMCOD_SEL',pic:''},{av:'AV54TFMAntTipMDsc',fld:'vTFMANTTIPMDSC',pic:''},{av:'AV55TFMAntTipMDsc_Sel',fld:'vTFMANTTIPMDSC_SEL',pic:''},{av:'AV72TFMAntKilTot',fld:'vTFMANTKILTOT',pic:'ZZZZZZZZ9.99'},{av:'AV73TFMAntKilTot_To',fld:'vTFMANTKILTOT_TO',pic:'ZZZZZZZZ9.99'},{av:'AV42TFMAntKilProd',fld:'vTFMANTKILPROD',pic:'ZZZZZZZZ9.99'},{av:'AV43TFMAntKilProd_To',fld:'vTFMANTKILPROD_TO',pic:'ZZZZZZZZ9.99'},{av:'AV44TFMAntKilReo',fld:'vTFMANTKILREO',pic:'ZZZZZZZZ9.99'},{av:'AV45TFMAntKilReo_To',fld:'vTFMANTKILREO_TO',pic:'ZZZZZZZZ9.99'},{av:'AV50TFMAntPorc',fld:'vTFMANTPORC',pic:'ZZZ9.99'},{av:'AV51TFMAntPorc_To',fld:'vTFMANTPORC_TO',pic:'ZZZ9.99'},{av:'AV87TFMAntMetTot',fld:'vTFMANTMETTOT',pic:'ZZZZZZZZ9.99'},{av:'AV88TFMAntMetTot_To',fld:'vTFMANTMETTOT_TO',pic:'ZZZZZZZZ9.99'},{av:'AV83TFMAntMetProd',fld:'vTFMANTMETPROD',pic:'ZZZZZZZZ9.99'},{av:'AV84TFMAntMetProd_To',fld:'vTFMANTMETPROD_TO',pic:'ZZZZZZZZ9.99'},{av:'AV85TFMAntMetReo',fld:'vTFMANTMETREO',pic:'ZZZZZZZZ9.99'},{av:'AV86TFMAntMetReo_To',fld:'vTFMANTMETREO_TO',pic:'ZZZZZZZZ9.99'},{av:'AV89TFMantMetPor',fld:'vTFMANTMETPOR',pic:'ZZZ9.99'},{av:'AV90TFMantMetPor_To',fld:'vTFMANTMETPOR_TO',pic:'ZZZ9.99'},{av:'AV20OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV22OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV61MAntEmprCod',fld:'vMANTEMPRCOD',pic:''},{av:'AV65CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV66ArtCod',fld:'vARTCOD',pic:''},{av:'AV67ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV68TipMaqCodJSON',fld:'vTIPMAQCODJSON',pic:''},{av:'AV70FechaInicio',fld:'vFECHAINICIO',pic:''},{av:'AV71FechaFin',fld:'vFECHAFIN',pic:''},{av:'AV97Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV18ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV6ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtMAntId_Visible',ctrl:'MANTID',prop:'Visible'},{av:'edtMAntEmprCo_Visible',ctrl:'MANTEMPRCO',prop:'Visible'},{av:'edtMAntCliCod_Visible',ctrl:'MANTCLICOD',prop:'Visible'},{av:'edtMAntCliNom_Visible',ctrl:'MANTCLINOM',prop:'Visible'},{av:'edtMAntArtCod_Visible',ctrl:'MANTARTCOD',prop:'Visible'},{av:'edtMAntArtDsc_Visible',ctrl:'MANTARTDSC',prop:'Visible'},{av:'edtMAntColNum_Visible',ctrl:'MANTCOLNUM',prop:'Visible'},{av:'edtMAntColNom_Visible',ctrl:'MANTCOLNOM',prop:'Visible'},{av:'edtMAntColCod_Visible',ctrl:'MANTCOLCOD',prop:'Visible'},{av:'edtMAntMaqCod_Visible',ctrl:'MANTMAQCOD',prop:'Visible'},{av:'edtMAntMaqDsc_Visible',ctrl:'MANTMAQDSC',prop:'Visible'},{av:'edtMAntTipMCo_Visible',ctrl:'MANTTIPMCO',prop:'Visible'},{av:'edtMAntTipMDs_Visible',ctrl:'MANTTIPMDS',prop:'Visible'},{av:'edtMAntKilTot_Visible',ctrl:'MANTKILTOT',prop:'Visible'},{av:'edtMAntKilPro_Visible',ctrl:'MANTKILPRO',prop:'Visible'},{av:'edtMAntKilReo_Visible',ctrl:'MANTKILREO',prop:'Visible'},{av:'edtMAntPorc_Visible',ctrl:'MANTPORC',prop:'Visible'},{av:'edtMAntMetTot_Visible',ctrl:'MANTMETTOT',prop:'Visible'},{av:'edtMAntMetPro_Visible',ctrl:'MANTMETPRO',prop:'Visible'},{av:'edtMAntMetReo_Visible',ctrl:'MANTMETREO',prop:'Visible'},{av:'edtMantMetPor_Visible',ctrl:'MANTMETPOR',prop:'Visible'},{av:'AV17ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV13GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e122DQ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV61MAntEmprCod',fld:'vMANTEMPRCOD',pic:''},{av:'AV65CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV66ArtCod',fld:'vARTCOD',pic:''},{av:'AV67ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV69TipMaqCodCollection',fld:'vTIPMAQCODCOLLECTION',pic:''},{av:'AV78sdtMTok',fld:'vSDTMTOK',pic:''},{av:'AV18ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV6ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV40TFMAntId',fld:'vTFMANTID',pic:'ZZZZZZZZZ9'},{av:'AV41TFMAntId_To',fld:'vTFMANTID_TO',pic:'ZZZZZZZZZ9'},{av:'AV38TFMAntEmprCod',fld:'vTFMANTEMPRCOD',pic:''},{av:'AV39TFMAntEmprCod_Sel',fld:'vTFMANTEMPRCOD_SEL',pic:''},{av:'AV28TFMAntCliCod',fld:'vTFMANTCLICOD',pic:'ZZZZZ9'},{av:'AV29TFMAntCliCod_To',fld:'vTFMANTCLICOD_TO',pic:'ZZZZZ9'},{av:'AV30TFMAntCliNom',fld:'vTFMANTCLINOM',pic:''},{av:'AV31TFMAntCliNom_Sel',fld:'vTFMANTCLINOM_SEL',pic:''},{av:'AV24TFMAntArtCod',fld:'vTFMANTARTCOD',pic:''},{av:'AV25TFMAntArtCod_Sel',fld:'vTFMANTARTCOD_SEL',pic:''},{av:'AV26TFMAntArtDsc',fld:'vTFMANTARTDSC',pic:''},{av:'AV27TFMAntArtDsc_Sel',fld:'vTFMANTARTDSC_SEL',pic:''},{av:'AV36TFMAntColNum',fld:'vTFMANTCOLNUM',pic:'ZZZZZ9'},{av:'AV37TFMAntColNum_To',fld:'vTFMANTCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV34TFMAntColNom',fld:'vTFMANTCOLNOM',pic:''},{av:'AV35TFMAntColNom_Sel',fld:'vTFMANTCOLNOM_SEL',pic:''},{av:'AV32TFMAntColCod',fld:'vTFMANTCOLCOD',pic:'Z9'},{av:'AV33TFMAntColCod_To',fld:'vTFMANTCOLCOD_TO',pic:'Z9'},{av:'AV46TFMAntMaqCod',fld:'vTFMANTMAQCOD',pic:''},{av:'AV47TFMAntMaqCod_Sel',fld:'vTFMANTMAQCOD_SEL',pic:''},{av:'AV48TFMAntMaqDsc',fld:'vTFMANTMAQDSC',pic:''},{av:'AV49TFMAntMaqDsc_Sel',fld:'vTFMANTMAQDSC_SEL',pic:''},{av:'AV52TFMAntTipMCod',fld:'vTFMANTTIPMCOD',pic:''},{av:'AV53TFMAntTipMCod_Sel',fld:'vTFMANTTIPMCOD_SEL',pic:''},{av:'AV54TFMAntTipMDsc',fld:'vTFMANTTIPMDSC',pic:''},{av:'AV55TFMAntTipMDsc_Sel',fld:'vTFMANTTIPMDSC_SEL',pic:''},{av:'AV72TFMAntKilTot',fld:'vTFMANTKILTOT',pic:'ZZZZZZZZ9.99'},{av:'AV73TFMAntKilTot_To',fld:'vTFMANTKILTOT_TO',pic:'ZZZZZZZZ9.99'},{av:'AV42TFMAntKilProd',fld:'vTFMANTKILPROD',pic:'ZZZZZZZZ9.99'},{av:'AV43TFMAntKilProd_To',fld:'vTFMANTKILPROD_TO',pic:'ZZZZZZZZ9.99'},{av:'AV44TFMAntKilReo',fld:'vTFMANTKILREO',pic:'ZZZZZZZZ9.99'},{av:'AV45TFMAntKilReo_To',fld:'vTFMANTKILREO_TO',pic:'ZZZZZZZZ9.99'},{av:'AV50TFMAntPorc',fld:'vTFMANTPORC',pic:'ZZZ9.99'},{av:'AV51TFMAntPorc_To',fld:'vTFMANTPORC_TO',pic:'ZZZ9.99'},{av:'AV87TFMAntMetTot',fld:'vTFMANTMETTOT',pic:'ZZZZZZZZ9.99'},{av:'AV88TFMAntMetTot_To',fld:'vTFMANTMETTOT_TO',pic:'ZZZZZZZZ9.99'},{av:'AV83TFMAntMetProd',fld:'vTFMANTMETPROD',pic:'ZZZZZZZZ9.99'},{av:'AV84TFMAntMetProd_To',fld:'vTFMANTMETPROD_TO',pic:'ZZZZZZZZ9.99'},{av:'AV85TFMAntMetReo',fld:'vTFMANTMETREO',pic:'ZZZZZZZZ9.99'},{av:'AV86TFMAntMetReo_To',fld:'vTFMANTMETREO_TO',pic:'ZZZZZZZZ9.99'},{av:'AV89TFMantMetPor',fld:'vTFMANTMETPOR',pic:'ZZZ9.99'},{av:'AV90TFMantMetPor_To',fld:'vTFMANTMETPOR_TO',pic:'ZZZ9.99'},{av:'AV97Pgmname',fld:'vPGMNAME',pic:''},{av:'AV20OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV22OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV68TipMaqCodJSON',fld:'vTIPMAQCODJSON',pic:''},{av:'AV70FechaInicio',fld:'vFECHAINICIO',pic:''},{av:'AV71FechaFin',fld:'vFECHAFIN',pic:''},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV20OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV22OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV89TFMantMetPor',fld:'vTFMANTMETPOR',pic:'ZZZ9.99'},{av:'AV90TFMantMetPor_To',fld:'vTFMANTMETPOR_TO',pic:'ZZZ9.99'},{av:'AV85TFMAntMetReo',fld:'vTFMANTMETREO',pic:'ZZZZZZZZ9.99'},{av:'AV86TFMAntMetReo_To',fld:'vTFMANTMETREO_TO',pic:'ZZZZZZZZ9.99'},{av:'AV83TFMAntMetProd',fld:'vTFMANTMETPROD',pic:'ZZZZZZZZ9.99'},{av:'AV84TFMAntMetProd_To',fld:'vTFMANTMETPROD_TO',pic:'ZZZZZZZZ9.99'},{av:'AV87TFMAntMetTot',fld:'vTFMANTMETTOT',pic:'ZZZZZZZZ9.99'},{av:'AV88TFMAntMetTot_To',fld:'vTFMANTMETTOT_TO',pic:'ZZZZZZZZ9.99'},{av:'AV50TFMAntPorc',fld:'vTFMANTPORC',pic:'ZZZ9.99'},{av:'AV51TFMAntPorc_To',fld:'vTFMANTPORC_TO',pic:'ZZZ9.99'},{av:'AV44TFMAntKilReo',fld:'vTFMANTKILREO',pic:'ZZZZZZZZ9.99'},{av:'AV45TFMAntKilReo_To',fld:'vTFMANTKILREO_TO',pic:'ZZZZZZZZ9.99'},{av:'AV42TFMAntKilProd',fld:'vTFMANTKILPROD',pic:'ZZZZZZZZ9.99'},{av:'AV43TFMAntKilProd_To',fld:'vTFMANTKILPROD_TO',pic:'ZZZZZZZZ9.99'},{av:'AV72TFMAntKilTot',fld:'vTFMANTKILTOT',pic:'ZZZZZZZZ9.99'},{av:'AV73TFMAntKilTot_To',fld:'vTFMANTKILTOT_TO',pic:'ZZZZZZZZ9.99'},{av:'AV54TFMAntTipMDsc',fld:'vTFMANTTIPMDSC',pic:''},{av:'AV55TFMAntTipMDsc_Sel',fld:'vTFMANTTIPMDSC_SEL',pic:''},{av:'AV52TFMAntTipMCod',fld:'vTFMANTTIPMCOD',pic:''},{av:'AV53TFMAntTipMCod_Sel',fld:'vTFMANTTIPMCOD_SEL',pic:''},{av:'AV48TFMAntMaqDsc',fld:'vTFMANTMAQDSC',pic:''},{av:'AV49TFMAntMaqDsc_Sel',fld:'vTFMANTMAQDSC_SEL',pic:''},{av:'AV46TFMAntMaqCod',fld:'vTFMANTMAQCOD',pic:''},{av:'AV47TFMAntMaqCod_Sel',fld:'vTFMANTMAQCOD_SEL',pic:''},{av:'AV32TFMAntColCod',fld:'vTFMANTCOLCOD',pic:'Z9'},{av:'AV33TFMAntColCod_To',fld:'vTFMANTCOLCOD_TO',pic:'Z9'},{av:'AV34TFMAntColNom',fld:'vTFMANTCOLNOM',pic:''},{av:'AV35TFMAntColNom_Sel',fld:'vTFMANTCOLNOM_SEL',pic:''},{av:'AV36TFMAntColNum',fld:'vTFMANTCOLNUM',pic:'ZZZZZ9'},{av:'AV37TFMAntColNum_To',fld:'vTFMANTCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV26TFMAntArtDsc',fld:'vTFMANTARTDSC',pic:''},{av:'AV27TFMAntArtDsc_Sel',fld:'vTFMANTARTDSC_SEL',pic:''},{av:'AV24TFMAntArtCod',fld:'vTFMANTARTCOD',pic:''},{av:'AV25TFMAntArtCod_Sel',fld:'vTFMANTARTCOD_SEL',pic:''},{av:'AV30TFMAntCliNom',fld:'vTFMANTCLINOM',pic:''},{av:'AV31TFMAntCliNom_Sel',fld:'vTFMANTCLINOM_SEL',pic:''},{av:'AV28TFMAntCliCod',fld:'vTFMANTCLICOD',pic:'ZZZZZ9'},{av:'AV29TFMAntCliCod_To',fld:'vTFMANTCLICOD_TO',pic:'ZZZZZ9'},{av:'AV38TFMAntEmprCod',fld:'vTFMANTEMPRCOD',pic:''},{av:'AV39TFMAntEmprCod_Sel',fld:'vTFMANTEMPRCOD_SEL',pic:''},{av:'AV40TFMAntId',fld:'vTFMANTID',pic:'ZZZZZZZZZ9'},{av:'AV41TFMAntId_To',fld:'vTFMANTID_TO',pic:'ZZZZZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e172DQ2',iparms:[{av:'A14562MAntId',fld:'MANTID',pic:'ZZZZZZZZZ9'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'edtMAntEmprCo_Link',ctrl:'MANTEMPRCO',prop:'Link'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e132DQ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV61MAntEmprCod',fld:'vMANTEMPRCOD',pic:''},{av:'AV65CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV66ArtCod',fld:'vARTCOD',pic:''},{av:'AV67ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV69TipMaqCodCollection',fld:'vTIPMAQCODCOLLECTION',pic:''},{av:'AV78sdtMTok',fld:'vSDTMTOK',pic:''},{av:'AV18ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV6ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV40TFMAntId',fld:'vTFMANTID',pic:'ZZZZZZZZZ9'},{av:'AV41TFMAntId_To',fld:'vTFMANTID_TO',pic:'ZZZZZZZZZ9'},{av:'AV38TFMAntEmprCod',fld:'vTFMANTEMPRCOD',pic:''},{av:'AV39TFMAntEmprCod_Sel',fld:'vTFMANTEMPRCOD_SEL',pic:''},{av:'AV28TFMAntCliCod',fld:'vTFMANTCLICOD',pic:'ZZZZZ9'},{av:'AV29TFMAntCliCod_To',fld:'vTFMANTCLICOD_TO',pic:'ZZZZZ9'},{av:'AV30TFMAntCliNom',fld:'vTFMANTCLINOM',pic:''},{av:'AV31TFMAntCliNom_Sel',fld:'vTFMANTCLINOM_SEL',pic:''},{av:'AV24TFMAntArtCod',fld:'vTFMANTARTCOD',pic:''},{av:'AV25TFMAntArtCod_Sel',fld:'vTFMANTARTCOD_SEL',pic:''},{av:'AV26TFMAntArtDsc',fld:'vTFMANTARTDSC',pic:''},{av:'AV27TFMAntArtDsc_Sel',fld:'vTFMANTARTDSC_SEL',pic:''},{av:'AV36TFMAntColNum',fld:'vTFMANTCOLNUM',pic:'ZZZZZ9'},{av:'AV37TFMAntColNum_To',fld:'vTFMANTCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV34TFMAntColNom',fld:'vTFMANTCOLNOM',pic:''},{av:'AV35TFMAntColNom_Sel',fld:'vTFMANTCOLNOM_SEL',pic:''},{av:'AV32TFMAntColCod',fld:'vTFMANTCOLCOD',pic:'Z9'},{av:'AV33TFMAntColCod_To',fld:'vTFMANTCOLCOD_TO',pic:'Z9'},{av:'AV46TFMAntMaqCod',fld:'vTFMANTMAQCOD',pic:''},{av:'AV47TFMAntMaqCod_Sel',fld:'vTFMANTMAQCOD_SEL',pic:''},{av:'AV48TFMAntMaqDsc',fld:'vTFMANTMAQDSC',pic:''},{av:'AV49TFMAntMaqDsc_Sel',fld:'vTFMANTMAQDSC_SEL',pic:''},{av:'AV52TFMAntTipMCod',fld:'vTFMANTTIPMCOD',pic:''},{av:'AV53TFMAntTipMCod_Sel',fld:'vTFMANTTIPMCOD_SEL',pic:''},{av:'AV54TFMAntTipMDsc',fld:'vTFMANTTIPMDSC',pic:''},{av:'AV55TFMAntTipMDsc_Sel',fld:'vTFMANTTIPMDSC_SEL',pic:''},{av:'AV72TFMAntKilTot',fld:'vTFMANTKILTOT',pic:'ZZZZZZZZ9.99'},{av:'AV73TFMAntKilTot_To',fld:'vTFMANTKILTOT_TO',pic:'ZZZZZZZZ9.99'},{av:'AV42TFMAntKilProd',fld:'vTFMANTKILPROD',pic:'ZZZZZZZZ9.99'},{av:'AV43TFMAntKilProd_To',fld:'vTFMANTKILPROD_TO',pic:'ZZZZZZZZ9.99'},{av:'AV44TFMAntKilReo',fld:'vTFMANTKILREO',pic:'ZZZZZZZZ9.99'},{av:'AV45TFMAntKilReo_To',fld:'vTFMANTKILREO_TO',pic:'ZZZZZZZZ9.99'},{av:'AV50TFMAntPorc',fld:'vTFMANTPORC',pic:'ZZZ9.99'},{av:'AV51TFMAntPorc_To',fld:'vTFMANTPORC_TO',pic:'ZZZ9.99'},{av:'AV87TFMAntMetTot',fld:'vTFMANTMETTOT',pic:'ZZZZZZZZ9.99'},{av:'AV88TFMAntMetTot_To',fld:'vTFMANTMETTOT_TO',pic:'ZZZZZZZZ9.99'},{av:'AV83TFMAntMetProd',fld:'vTFMANTMETPROD',pic:'ZZZZZZZZ9.99'},{av:'AV84TFMAntMetProd_To',fld:'vTFMANTMETPROD_TO',pic:'ZZZZZZZZ9.99'},{av:'AV85TFMAntMetReo',fld:'vTFMANTMETREO',pic:'ZZZZZZZZ9.99'},{av:'AV86TFMAntMetReo_To',fld:'vTFMANTMETREO_TO',pic:'ZZZZZZZZ9.99'},{av:'AV89TFMantMetPor',fld:'vTFMANTMETPOR',pic:'ZZZ9.99'},{av:'AV90TFMantMetPor_To',fld:'vTFMANTMETPOR_TO',pic:'ZZZ9.99'},{av:'AV97Pgmname',fld:'vPGMNAME',pic:''},{av:'AV20OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV22OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV68TipMaqCodJSON',fld:'vTIPMAQCODJSON',pic:''},{av:'AV70FechaInicio',fld:'vFECHAINICIO',pic:''},{av:'AV71FechaFin',fld:'vFECHAFIN',pic:''},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV6ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV18ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtMAntId_Visible',ctrl:'MANTID',prop:'Visible'},{av:'edtMAntEmprCo_Visible',ctrl:'MANTEMPRCO',prop:'Visible'},{av:'edtMAntCliCod_Visible',ctrl:'MANTCLICOD',prop:'Visible'},{av:'edtMAntCliNom_Visible',ctrl:'MANTCLINOM',prop:'Visible'},{av:'edtMAntArtCod_Visible',ctrl:'MANTARTCOD',prop:'Visible'},{av:'edtMAntArtDsc_Visible',ctrl:'MANTARTDSC',prop:'Visible'},{av:'edtMAntColNum_Visible',ctrl:'MANTCOLNUM',prop:'Visible'},{av:'edtMAntColNom_Visible',ctrl:'MANTCOLNOM',prop:'Visible'},{av:'edtMAntColCod_Visible',ctrl:'MANTCOLCOD',prop:'Visible'},{av:'edtMAntMaqCod_Visible',ctrl:'MANTMAQCOD',prop:'Visible'},{av:'edtMAntMaqDsc_Visible',ctrl:'MANTMAQDSC',prop:'Visible'},{av:'edtMAntTipMCo_Visible',ctrl:'MANTTIPMCO',prop:'Visible'},{av:'edtMAntTipMDs_Visible',ctrl:'MANTTIPMDS',prop:'Visible'},{av:'edtMAntKilTot_Visible',ctrl:'MANTKILTOT',prop:'Visible'},{av:'edtMAntKilPro_Visible',ctrl:'MANTKILPRO',prop:'Visible'},{av:'edtMAntKilReo_Visible',ctrl:'MANTKILREO',prop:'Visible'},{av:'edtMAntPorc_Visible',ctrl:'MANTPORC',prop:'Visible'},{av:'edtMAntMetTot_Visible',ctrl:'MANTMETTOT',prop:'Visible'},{av:'edtMAntMetPro_Visible',ctrl:'MANTMETPRO',prop:'Visible'},{av:'edtMAntMetReo_Visible',ctrl:'MANTMETREO',prop:'Visible'},{av:'edtMantMetPor_Visible',ctrl:'MANTMETPOR',prop:'Visible'},{av:'AV17ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV13GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e112DQ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV61MAntEmprCod',fld:'vMANTEMPRCOD',pic:''},{av:'AV65CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV66ArtCod',fld:'vARTCOD',pic:''},{av:'AV67ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV69TipMaqCodCollection',fld:'vTIPMAQCODCOLLECTION',pic:''},{av:'AV78sdtMTok',fld:'vSDTMTOK',pic:''},{av:'AV18ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV6ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV40TFMAntId',fld:'vTFMANTID',pic:'ZZZZZZZZZ9'},{av:'AV41TFMAntId_To',fld:'vTFMANTID_TO',pic:'ZZZZZZZZZ9'},{av:'AV38TFMAntEmprCod',fld:'vTFMANTEMPRCOD',pic:''},{av:'AV39TFMAntEmprCod_Sel',fld:'vTFMANTEMPRCOD_SEL',pic:''},{av:'AV28TFMAntCliCod',fld:'vTFMANTCLICOD',pic:'ZZZZZ9'},{av:'AV29TFMAntCliCod_To',fld:'vTFMANTCLICOD_TO',pic:'ZZZZZ9'},{av:'AV30TFMAntCliNom',fld:'vTFMANTCLINOM',pic:''},{av:'AV31TFMAntCliNom_Sel',fld:'vTFMANTCLINOM_SEL',pic:''},{av:'AV24TFMAntArtCod',fld:'vTFMANTARTCOD',pic:''},{av:'AV25TFMAntArtCod_Sel',fld:'vTFMANTARTCOD_SEL',pic:''},{av:'AV26TFMAntArtDsc',fld:'vTFMANTARTDSC',pic:''},{av:'AV27TFMAntArtDsc_Sel',fld:'vTFMANTARTDSC_SEL',pic:''},{av:'AV36TFMAntColNum',fld:'vTFMANTCOLNUM',pic:'ZZZZZ9'},{av:'AV37TFMAntColNum_To',fld:'vTFMANTCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV34TFMAntColNom',fld:'vTFMANTCOLNOM',pic:''},{av:'AV35TFMAntColNom_Sel',fld:'vTFMANTCOLNOM_SEL',pic:''},{av:'AV32TFMAntColCod',fld:'vTFMANTCOLCOD',pic:'Z9'},{av:'AV33TFMAntColCod_To',fld:'vTFMANTCOLCOD_TO',pic:'Z9'},{av:'AV46TFMAntMaqCod',fld:'vTFMANTMAQCOD',pic:''},{av:'AV47TFMAntMaqCod_Sel',fld:'vTFMANTMAQCOD_SEL',pic:''},{av:'AV48TFMAntMaqDsc',fld:'vTFMANTMAQDSC',pic:''},{av:'AV49TFMAntMaqDsc_Sel',fld:'vTFMANTMAQDSC_SEL',pic:''},{av:'AV52TFMAntTipMCod',fld:'vTFMANTTIPMCOD',pic:''},{av:'AV53TFMAntTipMCod_Sel',fld:'vTFMANTTIPMCOD_SEL',pic:''},{av:'AV54TFMAntTipMDsc',fld:'vTFMANTTIPMDSC',pic:''},{av:'AV55TFMAntTipMDsc_Sel',fld:'vTFMANTTIPMDSC_SEL',pic:''},{av:'AV72TFMAntKilTot',fld:'vTFMANTKILTOT',pic:'ZZZZZZZZ9.99'},{av:'AV73TFMAntKilTot_To',fld:'vTFMANTKILTOT_TO',pic:'ZZZZZZZZ9.99'},{av:'AV42TFMAntKilProd',fld:'vTFMANTKILPROD',pic:'ZZZZZZZZ9.99'},{av:'AV43TFMAntKilProd_To',fld:'vTFMANTKILPROD_TO',pic:'ZZZZZZZZ9.99'},{av:'AV44TFMAntKilReo',fld:'vTFMANTKILREO',pic:'ZZZZZZZZ9.99'},{av:'AV45TFMAntKilReo_To',fld:'vTFMANTKILREO_TO',pic:'ZZZZZZZZ9.99'},{av:'AV50TFMAntPorc',fld:'vTFMANTPORC',pic:'ZZZ9.99'},{av:'AV51TFMAntPorc_To',fld:'vTFMANTPORC_TO',pic:'ZZZ9.99'},{av:'AV87TFMAntMetTot',fld:'vTFMANTMETTOT',pic:'ZZZZZZZZ9.99'},{av:'AV88TFMAntMetTot_To',fld:'vTFMANTMETTOT_TO',pic:'ZZZZZZZZ9.99'},{av:'AV83TFMAntMetProd',fld:'vTFMANTMETPROD',pic:'ZZZZZZZZ9.99'},{av:'AV84TFMAntMetProd_To',fld:'vTFMANTMETPROD_TO',pic:'ZZZZZZZZ9.99'},{av:'AV85TFMAntMetReo',fld:'vTFMANTMETREO',pic:'ZZZZZZZZ9.99'},{av:'AV86TFMAntMetReo_To',fld:'vTFMANTMETREO_TO',pic:'ZZZZZZZZ9.99'},{av:'AV89TFMantMetPor',fld:'vTFMANTMETPOR',pic:'ZZZ9.99'},{av:'AV90TFMantMetPor_To',fld:'vTFMANTMETPOR_TO',pic:'ZZZ9.99'},{av:'AV97Pgmname',fld:'vPGMNAME',pic:''},{av:'AV20OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV22OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV68TipMaqCodJSON',fld:'vTIPMAQCODJSON',pic:''},{av:'AV70FechaInicio',fld:'vFECHAINICIO',pic:''},{av:'AV71FechaFin',fld:'vFECHAFIN',pic:''},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV13GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV18ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV13GridState',fld:'vGRIDSTATE',pic:''},{av:'AV20OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV22OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV40TFMAntId',fld:'vTFMANTID',pic:'ZZZZZZZZZ9'},{av:'AV41TFMAntId_To',fld:'vTFMANTID_TO',pic:'ZZZZZZZZZ9'},{av:'AV38TFMAntEmprCod',fld:'vTFMANTEMPRCOD',pic:''},{av:'AV39TFMAntEmprCod_Sel',fld:'vTFMANTEMPRCOD_SEL',pic:''},{av:'AV28TFMAntCliCod',fld:'vTFMANTCLICOD',pic:'ZZZZZ9'},{av:'AV29TFMAntCliCod_To',fld:'vTFMANTCLICOD_TO',pic:'ZZZZZ9'},{av:'AV30TFMAntCliNom',fld:'vTFMANTCLINOM',pic:''},{av:'AV31TFMAntCliNom_Sel',fld:'vTFMANTCLINOM_SEL',pic:''},{av:'AV24TFMAntArtCod',fld:'vTFMANTARTCOD',pic:''},{av:'AV25TFMAntArtCod_Sel',fld:'vTFMANTARTCOD_SEL',pic:''},{av:'AV26TFMAntArtDsc',fld:'vTFMANTARTDSC',pic:''},{av:'AV27TFMAntArtDsc_Sel',fld:'vTFMANTARTDSC_SEL',pic:''},{av:'AV36TFMAntColNum',fld:'vTFMANTCOLNUM',pic:'ZZZZZ9'},{av:'AV37TFMAntColNum_To',fld:'vTFMANTCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV34TFMAntColNom',fld:'vTFMANTCOLNOM',pic:''},{av:'AV35TFMAntColNom_Sel',fld:'vTFMANTCOLNOM_SEL',pic:''},{av:'AV32TFMAntColCod',fld:'vTFMANTCOLCOD',pic:'Z9'},{av:'AV33TFMAntColCod_To',fld:'vTFMANTCOLCOD_TO',pic:'Z9'},{av:'AV46TFMAntMaqCod',fld:'vTFMANTMAQCOD',pic:''},{av:'AV47TFMAntMaqCod_Sel',fld:'vTFMANTMAQCOD_SEL',pic:''},{av:'AV48TFMAntMaqDsc',fld:'vTFMANTMAQDSC',pic:''},{av:'AV49TFMAntMaqDsc_Sel',fld:'vTFMANTMAQDSC_SEL',pic:''},{av:'AV52TFMAntTipMCod',fld:'vTFMANTTIPMCOD',pic:''},{av:'AV53TFMAntTipMCod_Sel',fld:'vTFMANTTIPMCOD_SEL',pic:''},{av:'AV54TFMAntTipMDsc',fld:'vTFMANTTIPMDSC',pic:''},{av:'AV55TFMAntTipMDsc_Sel',fld:'vTFMANTTIPMDSC_SEL',pic:''},{av:'AV72TFMAntKilTot',fld:'vTFMANTKILTOT',pic:'ZZZZZZZZ9.99'},{av:'AV73TFMAntKilTot_To',fld:'vTFMANTKILTOT_TO',pic:'ZZZZZZZZ9.99'},{av:'AV42TFMAntKilProd',fld:'vTFMANTKILPROD',pic:'ZZZZZZZZ9.99'},{av:'AV43TFMAntKilProd_To',fld:'vTFMANTKILPROD_TO',pic:'ZZZZZZZZ9.99'},{av:'AV44TFMAntKilReo',fld:'vTFMANTKILREO',pic:'ZZZZZZZZ9.99'},{av:'AV45TFMAntKilReo_To',fld:'vTFMANTKILREO_TO',pic:'ZZZZZZZZ9.99'},{av:'AV50TFMAntPorc',fld:'vTFMANTPORC',pic:'ZZZ9.99'},{av:'AV51TFMAntPorc_To',fld:'vTFMANTPORC_TO',pic:'ZZZ9.99'},{av:'AV87TFMAntMetTot',fld:'vTFMANTMETTOT',pic:'ZZZZZZZZ9.99'},{av:'AV88TFMAntMetTot_To',fld:'vTFMANTMETTOT_TO',pic:'ZZZZZZZZ9.99'},{av:'AV83TFMAntMetProd',fld:'vTFMANTMETPROD',pic:'ZZZZZZZZ9.99'},{av:'AV84TFMAntMetProd_To',fld:'vTFMANTMETPROD_TO',pic:'ZZZZZZZZ9.99'},{av:'AV85TFMAntMetReo',fld:'vTFMANTMETREO',pic:'ZZZZZZZZ9.99'},{av:'AV86TFMAntMetReo_To',fld:'vTFMANTMETREO_TO',pic:'ZZZZZZZZ9.99'},{av:'AV89TFMantMetPor',fld:'vTFMANTMETPOR',pic:'ZZZ9.99'},{av:'AV90TFMantMetPor_To',fld:'vTFMANTMETPOR_TO',pic:'ZZZ9.99'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV6ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtMAntId_Visible',ctrl:'MANTID',prop:'Visible'},{av:'edtMAntEmprCo_Visible',ctrl:'MANTEMPRCO',prop:'Visible'},{av:'edtMAntCliCod_Visible',ctrl:'MANTCLICOD',prop:'Visible'},{av:'edtMAntCliNom_Visible',ctrl:'MANTCLINOM',prop:'Visible'},{av:'edtMAntArtCod_Visible',ctrl:'MANTARTCOD',prop:'Visible'},{av:'edtMAntArtDsc_Visible',ctrl:'MANTARTDSC',prop:'Visible'},{av:'edtMAntColNum_Visible',ctrl:'MANTCOLNUM',prop:'Visible'},{av:'edtMAntColNom_Visible',ctrl:'MANTCOLNOM',prop:'Visible'},{av:'edtMAntColCod_Visible',ctrl:'MANTCOLCOD',prop:'Visible'},{av:'edtMAntMaqCod_Visible',ctrl:'MANTMAQCOD',prop:'Visible'},{av:'edtMAntMaqDsc_Visible',ctrl:'MANTMAQDSC',prop:'Visible'},{av:'edtMAntTipMCo_Visible',ctrl:'MANTTIPMCO',prop:'Visible'},{av:'edtMAntTipMDs_Visible',ctrl:'MANTTIPMDS',prop:'Visible'},{av:'edtMAntKilTot_Visible',ctrl:'MANTKILTOT',prop:'Visible'},{av:'edtMAntKilPro_Visible',ctrl:'MANTKILPRO',prop:'Visible'},{av:'edtMAntKilReo_Visible',ctrl:'MANTKILREO',prop:'Visible'},{av:'edtMAntPorc_Visible',ctrl:'MANTPORC',prop:'Visible'},{av:'edtMAntMetTot_Visible',ctrl:'MANTMETTOT',prop:'Visible'},{av:'edtMAntMetPro_Visible',ctrl:'MANTMETPRO',prop:'Visible'},{av:'edtMAntMetReo_Visible',ctrl:'MANTMETREO',prop:'Visible'},{av:'edtMantMetPor_Visible',ctrl:'MANTMETPOR',prop:'Visible'},{av:'AV17ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e142DQ2',iparms:[{av:'AV61MAntEmprCod',fld:'vMANTEMPRCOD',pic:''},{av:'AV65CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV66ArtCod',fld:'vARTCOD',pic:''},{av:'AV67ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV68TipMaqCodJSON',fld:'vTIPMAQCODJSON',pic:''}]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("MANTPORC.CLICK","{handler:'e182DQ2',iparms:[{av:'A14645MAntPorc',fld:'MANTPORC',pic:'ZZZ9.99',hsh:true},{av:'A14566MAntEmprCo',fld:'MANTEMPRCO',pic:'',hsh:true},{av:'AV81sdtParametros',fld:'vSDTPARAMETROS',pic:''},{av:'A14565MAntCliCod',fld:'MANTCLICOD',pic:'ZZZZZ9',hsh:true},{av:'A14567MAntArtCod',fld:'MANTARTCOD',pic:'',hsh:true},{av:'A14568MAntColNum',fld:'MANTCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'A14569MAntTipMCo',fld:'MANTTIPMCO',pic:'',hsh:true},{av:'A14570MAntMaqCod',fld:'MANTMAQCOD',pic:'',hsh:true},{av:'AV70FechaInicio',fld:'vFECHAINICIO',pic:''},{av:'AV71FechaFin',fld:'vFECHAFIN',pic:''},{av:'A14564MAntUsu',fld:'MANTUSU',pic:'',hsh:true},{av:'A14563MAntTkn',fld:'MANTTKN',pic:'',hsh:true},{av:'AV97Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("MANTPORC.CLICK",",oparms:[{av:'AV81sdtParametros',fld:'vSDTPARAMETROS',pic:''}]}");
      setEventMetadata("MANTMETPOR.CLICK","{handler:'e192DQ2',iparms:[{av:'A14650MantMetPor',fld:'MANTMETPOR',pic:'ZZZ9.99',hsh:true},{av:'A14566MAntEmprCo',fld:'MANTEMPRCO',pic:'',hsh:true},{av:'AV81sdtParametros',fld:'vSDTPARAMETROS',pic:''},{av:'A14565MAntCliCod',fld:'MANTCLICOD',pic:'ZZZZZ9',hsh:true},{av:'A14567MAntArtCod',fld:'MANTARTCOD',pic:'',hsh:true},{av:'A14568MAntColNum',fld:'MANTCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'A14569MAntTipMCo',fld:'MANTTIPMCO',pic:'',hsh:true},{av:'A14570MAntMaqCod',fld:'MANTMAQCOD',pic:'',hsh:true},{av:'AV70FechaInicio',fld:'vFECHAINICIO',pic:''},{av:'AV71FechaFin',fld:'vFECHAFIN',pic:''},{av:'A14564MAntUsu',fld:'MANTUSU',pic:'',hsh:true},{av:'A14563MAntTkn',fld:'MANTTKN',pic:'',hsh:true},{av:'AV97Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("MANTMETPOR.CLICK",",oparms:[{av:'AV81sdtParametros',fld:'vSDTPARAMETROS',pic:''}]}");
      setEventMetadata("MANTKILREO.CLICK","{handler:'e202DQ2',iparms:[{av:'A14566MAntEmprCo',fld:'MANTEMPRCO',pic:'',hsh:true},{av:'AV81sdtParametros',fld:'vSDTPARAMETROS',pic:''},{av:'A14565MAntCliCod',fld:'MANTCLICOD',pic:'ZZZZZ9',hsh:true},{av:'A14567MAntArtCod',fld:'MANTARTCOD',pic:'',hsh:true},{av:'A14568MAntColNum',fld:'MANTCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'A14569MAntTipMCo',fld:'MANTTIPMCO',pic:'',hsh:true},{av:'A14570MAntMaqCod',fld:'MANTMAQCOD',pic:'',hsh:true},{av:'AV70FechaInicio',fld:'vFECHAINICIO',pic:''},{av:'AV71FechaFin',fld:'vFECHAFIN',pic:''},{av:'A14564MAntUsu',fld:'MANTUSU',pic:'',hsh:true},{av:'A14563MAntTkn',fld:'MANTTKN',pic:'',hsh:true},{av:'AV97Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("MANTKILREO.CLICK",",oparms:[{av:'AV81sdtParametros',fld:'vSDTPARAMETROS',pic:''}]}");
      setEventMetadata("MANTMETREO.CLICK","{handler:'e212DQ2',iparms:[{av:'A14566MAntEmprCo',fld:'MANTEMPRCO',pic:'',hsh:true},{av:'AV81sdtParametros',fld:'vSDTPARAMETROS',pic:''},{av:'A14565MAntCliCod',fld:'MANTCLICOD',pic:'ZZZZZ9',hsh:true},{av:'A14567MAntArtCod',fld:'MANTARTCOD',pic:'',hsh:true},{av:'A14568MAntColNum',fld:'MANTCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'A14569MAntTipMCo',fld:'MANTTIPMCO',pic:'',hsh:true},{av:'A14570MAntMaqCod',fld:'MANTMAQCOD',pic:'',hsh:true},{av:'AV70FechaInicio',fld:'vFECHAINICIO',pic:''},{av:'AV71FechaFin',fld:'vFECHAFIN',pic:''},{av:'A14564MAntUsu',fld:'MANTUSU',pic:'',hsh:true},{av:'A14563MAntTkn',fld:'MANTTKN',pic:'',hsh:true},{av:'AV97Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("MANTMETREO.CLICK",",oparms:[{av:'AV81sdtParametros',fld:'vSDTPARAMETROS',pic:''}]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV69TipMaqCodCollection',fld:'vTIPMAQCODCOLLECTION',pic:''},{av:'AV78sdtMTok',fld:'vSDTMTOK',pic:''},{av:'sPrefix'},{av:'AV18ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV6ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV40TFMAntId',fld:'vTFMANTID',pic:'ZZZZZZZZZ9'},{av:'AV41TFMAntId_To',fld:'vTFMANTID_TO',pic:'ZZZZZZZZZ9'},{av:'AV38TFMAntEmprCod',fld:'vTFMANTEMPRCOD',pic:''},{av:'AV39TFMAntEmprCod_Sel',fld:'vTFMANTEMPRCOD_SEL',pic:''},{av:'AV28TFMAntCliCod',fld:'vTFMANTCLICOD',pic:'ZZZZZ9'},{av:'AV29TFMAntCliCod_To',fld:'vTFMANTCLICOD_TO',pic:'ZZZZZ9'},{av:'AV30TFMAntCliNom',fld:'vTFMANTCLINOM',pic:''},{av:'AV31TFMAntCliNom_Sel',fld:'vTFMANTCLINOM_SEL',pic:''},{av:'AV24TFMAntArtCod',fld:'vTFMANTARTCOD',pic:''},{av:'AV25TFMAntArtCod_Sel',fld:'vTFMANTARTCOD_SEL',pic:''},{av:'AV26TFMAntArtDsc',fld:'vTFMANTARTDSC',pic:''},{av:'AV27TFMAntArtDsc_Sel',fld:'vTFMANTARTDSC_SEL',pic:''},{av:'AV36TFMAntColNum',fld:'vTFMANTCOLNUM',pic:'ZZZZZ9'},{av:'AV37TFMAntColNum_To',fld:'vTFMANTCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV34TFMAntColNom',fld:'vTFMANTCOLNOM',pic:''},{av:'AV35TFMAntColNom_Sel',fld:'vTFMANTCOLNOM_SEL',pic:''},{av:'AV32TFMAntColCod',fld:'vTFMANTCOLCOD',pic:'Z9'},{av:'AV33TFMAntColCod_To',fld:'vTFMANTCOLCOD_TO',pic:'Z9'},{av:'AV46TFMAntMaqCod',fld:'vTFMANTMAQCOD',pic:''},{av:'AV47TFMAntMaqCod_Sel',fld:'vTFMANTMAQCOD_SEL',pic:''},{av:'AV48TFMAntMaqDsc',fld:'vTFMANTMAQDSC',pic:''},{av:'AV49TFMAntMaqDsc_Sel',fld:'vTFMANTMAQDSC_SEL',pic:''},{av:'AV52TFMAntTipMCod',fld:'vTFMANTTIPMCOD',pic:''},{av:'AV53TFMAntTipMCod_Sel',fld:'vTFMANTTIPMCOD_SEL',pic:''},{av:'AV54TFMAntTipMDsc',fld:'vTFMANTTIPMDSC',pic:''},{av:'AV55TFMAntTipMDsc_Sel',fld:'vTFMANTTIPMDSC_SEL',pic:''},{av:'AV72TFMAntKilTot',fld:'vTFMANTKILTOT',pic:'ZZZZZZZZ9.99'},{av:'AV73TFMAntKilTot_To',fld:'vTFMANTKILTOT_TO',pic:'ZZZZZZZZ9.99'},{av:'AV42TFMAntKilProd',fld:'vTFMANTKILPROD',pic:'ZZZZZZZZ9.99'},{av:'AV43TFMAntKilProd_To',fld:'vTFMANTKILPROD_TO',pic:'ZZZZZZZZ9.99'},{av:'AV44TFMAntKilReo',fld:'vTFMANTKILREO',pic:'ZZZZZZZZ9.99'},{av:'AV45TFMAntKilReo_To',fld:'vTFMANTKILREO_TO',pic:'ZZZZZZZZ9.99'},{av:'AV50TFMAntPorc',fld:'vTFMANTPORC',pic:'ZZZ9.99'},{av:'AV51TFMAntPorc_To',fld:'vTFMANTPORC_TO',pic:'ZZZ9.99'},{av:'AV87TFMAntMetTot',fld:'vTFMANTMETTOT',pic:'ZZZZZZZZ9.99'},{av:'AV88TFMAntMetTot_To',fld:'vTFMANTMETTOT_TO',pic:'ZZZZZZZZ9.99'},{av:'AV83TFMAntMetProd',fld:'vTFMANTMETPROD',pic:'ZZZZZZZZ9.99'},{av:'AV84TFMAntMetProd_To',fld:'vTFMANTMETPROD_TO',pic:'ZZZZZZZZ9.99'},{av:'AV85TFMAntMetReo',fld:'vTFMANTMETREO',pic:'ZZZZZZZZ9.99'},{av:'AV86TFMAntMetReo_To',fld:'vTFMANTMETREO_TO',pic:'ZZZZZZZZ9.99'},{av:'AV89TFMantMetPor',fld:'vTFMANTMETPOR',pic:'ZZZ9.99'},{av:'AV90TFMantMetPor_To',fld:'vTFMANTMETPOR_TO',pic:'ZZZ9.99'},{av:'AV97Pgmname',fld:'vPGMNAME',pic:''},{av:'AV20OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV22OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV61MAntEmprCod',fld:'vMANTEMPRCOD',pic:''},{av:'AV65CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV66ArtCod',fld:'vARTCOD',pic:''},{av:'AV67ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV68TipMaqCodJSON',fld:'vTIPMAQCODJSON',pic:''},{av:'AV70FechaInicio',fld:'vFECHAINICIO',pic:''},{av:'AV71FechaFin',fld:'vFECHAFIN',pic:''}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[{av:'AV18ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV6ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtMAntId_Visible',ctrl:'MANTID',prop:'Visible'},{av:'edtMAntEmprCo_Visible',ctrl:'MANTEMPRCO',prop:'Visible'},{av:'edtMAntCliCod_Visible',ctrl:'MANTCLICOD',prop:'Visible'},{av:'edtMAntCliNom_Visible',ctrl:'MANTCLINOM',prop:'Visible'},{av:'edtMAntArtCod_Visible',ctrl:'MANTARTCOD',prop:'Visible'},{av:'edtMAntArtDsc_Visible',ctrl:'MANTARTDSC',prop:'Visible'},{av:'edtMAntColNum_Visible',ctrl:'MANTCOLNUM',prop:'Visible'},{av:'edtMAntColNom_Visible',ctrl:'MANTCOLNOM',prop:'Visible'},{av:'edtMAntColCod_Visible',ctrl:'MANTCOLCOD',prop:'Visible'},{av:'edtMAntMaqCod_Visible',ctrl:'MANTMAQCOD',prop:'Visible'},{av:'edtMAntMaqDsc_Visible',ctrl:'MANTMAQDSC',prop:'Visible'},{av:'edtMAntTipMCo_Visible',ctrl:'MANTTIPMCO',prop:'Visible'},{av:'edtMAntTipMDs_Visible',ctrl:'MANTTIPMDS',prop:'Visible'},{av:'edtMAntKilTot_Visible',ctrl:'MANTKILTOT',prop:'Visible'},{av:'edtMAntKilPro_Visible',ctrl:'MANTKILPRO',prop:'Visible'},{av:'edtMAntKilReo_Visible',ctrl:'MANTKILREO',prop:'Visible'},{av:'edtMAntPorc_Visible',ctrl:'MANTPORC',prop:'Visible'},{av:'edtMAntMetTot_Visible',ctrl:'MANTMETTOT',prop:'Visible'},{av:'edtMAntMetPro_Visible',ctrl:'MANTMETPRO',prop:'Visible'},{av:'edtMAntMetReo_Visible',ctrl:'MANTMETREO',prop:'Visible'},{av:'edtMantMetPor_Visible',ctrl:'MANTMETPOR',prop:'Visible'},{av:'AV17ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV13GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV69TipMaqCodCollection',fld:'vTIPMAQCODCOLLECTION',pic:''},{av:'AV78sdtMTok',fld:'vSDTMTOK',pic:''},{av:'sPrefix'},{av:'AV18ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV6ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV40TFMAntId',fld:'vTFMANTID',pic:'ZZZZZZZZZ9'},{av:'AV41TFMAntId_To',fld:'vTFMANTID_TO',pic:'ZZZZZZZZZ9'},{av:'AV38TFMAntEmprCod',fld:'vTFMANTEMPRCOD',pic:''},{av:'AV39TFMAntEmprCod_Sel',fld:'vTFMANTEMPRCOD_SEL',pic:''},{av:'AV28TFMAntCliCod',fld:'vTFMANTCLICOD',pic:'ZZZZZ9'},{av:'AV29TFMAntCliCod_To',fld:'vTFMANTCLICOD_TO',pic:'ZZZZZ9'},{av:'AV30TFMAntCliNom',fld:'vTFMANTCLINOM',pic:''},{av:'AV31TFMAntCliNom_Sel',fld:'vTFMANTCLINOM_SEL',pic:''},{av:'AV24TFMAntArtCod',fld:'vTFMANTARTCOD',pic:''},{av:'AV25TFMAntArtCod_Sel',fld:'vTFMANTARTCOD_SEL',pic:''},{av:'AV26TFMAntArtDsc',fld:'vTFMANTARTDSC',pic:''},{av:'AV27TFMAntArtDsc_Sel',fld:'vTFMANTARTDSC_SEL',pic:''},{av:'AV36TFMAntColNum',fld:'vTFMANTCOLNUM',pic:'ZZZZZ9'},{av:'AV37TFMAntColNum_To',fld:'vTFMANTCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV34TFMAntColNom',fld:'vTFMANTCOLNOM',pic:''},{av:'AV35TFMAntColNom_Sel',fld:'vTFMANTCOLNOM_SEL',pic:''},{av:'AV32TFMAntColCod',fld:'vTFMANTCOLCOD',pic:'Z9'},{av:'AV33TFMAntColCod_To',fld:'vTFMANTCOLCOD_TO',pic:'Z9'},{av:'AV46TFMAntMaqCod',fld:'vTFMANTMAQCOD',pic:''},{av:'AV47TFMAntMaqCod_Sel',fld:'vTFMANTMAQCOD_SEL',pic:''},{av:'AV48TFMAntMaqDsc',fld:'vTFMANTMAQDSC',pic:''},{av:'AV49TFMAntMaqDsc_Sel',fld:'vTFMANTMAQDSC_SEL',pic:''},{av:'AV52TFMAntTipMCod',fld:'vTFMANTTIPMCOD',pic:''},{av:'AV53TFMAntTipMCod_Sel',fld:'vTFMANTTIPMCOD_SEL',pic:''},{av:'AV54TFMAntTipMDsc',fld:'vTFMANTTIPMDSC',pic:''},{av:'AV55TFMAntTipMDsc_Sel',fld:'vTFMANTTIPMDSC_SEL',pic:''},{av:'AV72TFMAntKilTot',fld:'vTFMANTKILTOT',pic:'ZZZZZZZZ9.99'},{av:'AV73TFMAntKilTot_To',fld:'vTFMANTKILTOT_TO',pic:'ZZZZZZZZ9.99'},{av:'AV42TFMAntKilProd',fld:'vTFMANTKILPROD',pic:'ZZZZZZZZ9.99'},{av:'AV43TFMAntKilProd_To',fld:'vTFMANTKILPROD_TO',pic:'ZZZZZZZZ9.99'},{av:'AV44TFMAntKilReo',fld:'vTFMANTKILREO',pic:'ZZZZZZZZ9.99'},{av:'AV45TFMAntKilReo_To',fld:'vTFMANTKILREO_TO',pic:'ZZZZZZZZ9.99'},{av:'AV50TFMAntPorc',fld:'vTFMANTPORC',pic:'ZZZ9.99'},{av:'AV51TFMAntPorc_To',fld:'vTFMANTPORC_TO',pic:'ZZZ9.99'},{av:'AV87TFMAntMetTot',fld:'vTFMANTMETTOT',pic:'ZZZZZZZZ9.99'},{av:'AV88TFMAntMetTot_To',fld:'vTFMANTMETTOT_TO',pic:'ZZZZZZZZ9.99'},{av:'AV83TFMAntMetProd',fld:'vTFMANTMETPROD',pic:'ZZZZZZZZ9.99'},{av:'AV84TFMAntMetProd_To',fld:'vTFMANTMETPROD_TO',pic:'ZZZZZZZZ9.99'},{av:'AV85TFMAntMetReo',fld:'vTFMANTMETREO',pic:'ZZZZZZZZ9.99'},{av:'AV86TFMAntMetReo_To',fld:'vTFMANTMETREO_TO',pic:'ZZZZZZZZ9.99'},{av:'AV89TFMantMetPor',fld:'vTFMANTMETPOR',pic:'ZZZ9.99'},{av:'AV90TFMantMetPor_To',fld:'vTFMANTMETPOR_TO',pic:'ZZZ9.99'},{av:'AV97Pgmname',fld:'vPGMNAME',pic:''},{av:'AV20OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV22OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV61MAntEmprCod',fld:'vMANTEMPRCOD',pic:''},{av:'AV65CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV66ArtCod',fld:'vARTCOD',pic:''},{av:'AV67ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV68TipMaqCodJSON',fld:'vTIPMAQCODJSON',pic:''},{av:'AV70FechaInicio',fld:'vFECHAINICIO',pic:''},{av:'AV71FechaFin',fld:'vFECHAFIN',pic:''}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[{av:'AV18ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV6ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtMAntId_Visible',ctrl:'MANTID',prop:'Visible'},{av:'edtMAntEmprCo_Visible',ctrl:'MANTEMPRCO',prop:'Visible'},{av:'edtMAntCliCod_Visible',ctrl:'MANTCLICOD',prop:'Visible'},{av:'edtMAntCliNom_Visible',ctrl:'MANTCLINOM',prop:'Visible'},{av:'edtMAntArtCod_Visible',ctrl:'MANTARTCOD',prop:'Visible'},{av:'edtMAntArtDsc_Visible',ctrl:'MANTARTDSC',prop:'Visible'},{av:'edtMAntColNum_Visible',ctrl:'MANTCOLNUM',prop:'Visible'},{av:'edtMAntColNom_Visible',ctrl:'MANTCOLNOM',prop:'Visible'},{av:'edtMAntColCod_Visible',ctrl:'MANTCOLCOD',prop:'Visible'},{av:'edtMAntMaqCod_Visible',ctrl:'MANTMAQCOD',prop:'Visible'},{av:'edtMAntMaqDsc_Visible',ctrl:'MANTMAQDSC',prop:'Visible'},{av:'edtMAntTipMCo_Visible',ctrl:'MANTTIPMCO',prop:'Visible'},{av:'edtMAntTipMDs_Visible',ctrl:'MANTTIPMDS',prop:'Visible'},{av:'edtMAntKilTot_Visible',ctrl:'MANTKILTOT',prop:'Visible'},{av:'edtMAntKilPro_Visible',ctrl:'MANTKILPRO',prop:'Visible'},{av:'edtMAntKilReo_Visible',ctrl:'MANTKILREO',prop:'Visible'},{av:'edtMAntPorc_Visible',ctrl:'MANTPORC',prop:'Visible'},{av:'edtMAntMetTot_Visible',ctrl:'MANTMETTOT',prop:'Visible'},{av:'edtMAntMetPro_Visible',ctrl:'MANTMETPRO',prop:'Visible'},{av:'edtMAntMetReo_Visible',ctrl:'MANTMETREO',prop:'Visible'},{av:'edtMantMetPor_Visible',ctrl:'MANTMETPOR',prop:'Visible'},{av:'AV17ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV13GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV69TipMaqCodCollection',fld:'vTIPMAQCODCOLLECTION',pic:''},{av:'AV78sdtMTok',fld:'vSDTMTOK',pic:''},{av:'sPrefix'},{av:'AV18ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV6ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV40TFMAntId',fld:'vTFMANTID',pic:'ZZZZZZZZZ9'},{av:'AV41TFMAntId_To',fld:'vTFMANTID_TO',pic:'ZZZZZZZZZ9'},{av:'AV38TFMAntEmprCod',fld:'vTFMANTEMPRCOD',pic:''},{av:'AV39TFMAntEmprCod_Sel',fld:'vTFMANTEMPRCOD_SEL',pic:''},{av:'AV28TFMAntCliCod',fld:'vTFMANTCLICOD',pic:'ZZZZZ9'},{av:'AV29TFMAntCliCod_To',fld:'vTFMANTCLICOD_TO',pic:'ZZZZZ9'},{av:'AV30TFMAntCliNom',fld:'vTFMANTCLINOM',pic:''},{av:'AV31TFMAntCliNom_Sel',fld:'vTFMANTCLINOM_SEL',pic:''},{av:'AV24TFMAntArtCod',fld:'vTFMANTARTCOD',pic:''},{av:'AV25TFMAntArtCod_Sel',fld:'vTFMANTARTCOD_SEL',pic:''},{av:'AV26TFMAntArtDsc',fld:'vTFMANTARTDSC',pic:''},{av:'AV27TFMAntArtDsc_Sel',fld:'vTFMANTARTDSC_SEL',pic:''},{av:'AV36TFMAntColNum',fld:'vTFMANTCOLNUM',pic:'ZZZZZ9'},{av:'AV37TFMAntColNum_To',fld:'vTFMANTCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV34TFMAntColNom',fld:'vTFMANTCOLNOM',pic:''},{av:'AV35TFMAntColNom_Sel',fld:'vTFMANTCOLNOM_SEL',pic:''},{av:'AV32TFMAntColCod',fld:'vTFMANTCOLCOD',pic:'Z9'},{av:'AV33TFMAntColCod_To',fld:'vTFMANTCOLCOD_TO',pic:'Z9'},{av:'AV46TFMAntMaqCod',fld:'vTFMANTMAQCOD',pic:''},{av:'AV47TFMAntMaqCod_Sel',fld:'vTFMANTMAQCOD_SEL',pic:''},{av:'AV48TFMAntMaqDsc',fld:'vTFMANTMAQDSC',pic:''},{av:'AV49TFMAntMaqDsc_Sel',fld:'vTFMANTMAQDSC_SEL',pic:''},{av:'AV52TFMAntTipMCod',fld:'vTFMANTTIPMCOD',pic:''},{av:'AV53TFMAntTipMCod_Sel',fld:'vTFMANTTIPMCOD_SEL',pic:''},{av:'AV54TFMAntTipMDsc',fld:'vTFMANTTIPMDSC',pic:''},{av:'AV55TFMAntTipMDsc_Sel',fld:'vTFMANTTIPMDSC_SEL',pic:''},{av:'AV72TFMAntKilTot',fld:'vTFMANTKILTOT',pic:'ZZZZZZZZ9.99'},{av:'AV73TFMAntKilTot_To',fld:'vTFMANTKILTOT_TO',pic:'ZZZZZZZZ9.99'},{av:'AV42TFMAntKilProd',fld:'vTFMANTKILPROD',pic:'ZZZZZZZZ9.99'},{av:'AV43TFMAntKilProd_To',fld:'vTFMANTKILPROD_TO',pic:'ZZZZZZZZ9.99'},{av:'AV44TFMAntKilReo',fld:'vTFMANTKILREO',pic:'ZZZZZZZZ9.99'},{av:'AV45TFMAntKilReo_To',fld:'vTFMANTKILREO_TO',pic:'ZZZZZZZZ9.99'},{av:'AV50TFMAntPorc',fld:'vTFMANTPORC',pic:'ZZZ9.99'},{av:'AV51TFMAntPorc_To',fld:'vTFMANTPORC_TO',pic:'ZZZ9.99'},{av:'AV87TFMAntMetTot',fld:'vTFMANTMETTOT',pic:'ZZZZZZZZ9.99'},{av:'AV88TFMAntMetTot_To',fld:'vTFMANTMETTOT_TO',pic:'ZZZZZZZZ9.99'},{av:'AV83TFMAntMetProd',fld:'vTFMANTMETPROD',pic:'ZZZZZZZZ9.99'},{av:'AV84TFMAntMetProd_To',fld:'vTFMANTMETPROD_TO',pic:'ZZZZZZZZ9.99'},{av:'AV85TFMAntMetReo',fld:'vTFMANTMETREO',pic:'ZZZZZZZZ9.99'},{av:'AV86TFMAntMetReo_To',fld:'vTFMANTMETREO_TO',pic:'ZZZZZZZZ9.99'},{av:'AV89TFMantMetPor',fld:'vTFMANTMETPOR',pic:'ZZZ9.99'},{av:'AV90TFMantMetPor_To',fld:'vTFMANTMETPOR_TO',pic:'ZZZ9.99'},{av:'AV97Pgmname',fld:'vPGMNAME',pic:''},{av:'AV20OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV22OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV61MAntEmprCod',fld:'vMANTEMPRCOD',pic:''},{av:'AV65CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV66ArtCod',fld:'vARTCOD',pic:''},{av:'AV67ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV68TipMaqCodJSON',fld:'vTIPMAQCODJSON',pic:''},{av:'AV70FechaInicio',fld:'vFECHAINICIO',pic:''},{av:'AV71FechaFin',fld:'vFECHAFIN',pic:''}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[{av:'AV18ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV6ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtMAntId_Visible',ctrl:'MANTID',prop:'Visible'},{av:'edtMAntEmprCo_Visible',ctrl:'MANTEMPRCO',prop:'Visible'},{av:'edtMAntCliCod_Visible',ctrl:'MANTCLICOD',prop:'Visible'},{av:'edtMAntCliNom_Visible',ctrl:'MANTCLINOM',prop:'Visible'},{av:'edtMAntArtCod_Visible',ctrl:'MANTARTCOD',prop:'Visible'},{av:'edtMAntArtDsc_Visible',ctrl:'MANTARTDSC',prop:'Visible'},{av:'edtMAntColNum_Visible',ctrl:'MANTCOLNUM',prop:'Visible'},{av:'edtMAntColNom_Visible',ctrl:'MANTCOLNOM',prop:'Visible'},{av:'edtMAntColCod_Visible',ctrl:'MANTCOLCOD',prop:'Visible'},{av:'edtMAntMaqCod_Visible',ctrl:'MANTMAQCOD',prop:'Visible'},{av:'edtMAntMaqDsc_Visible',ctrl:'MANTMAQDSC',prop:'Visible'},{av:'edtMAntTipMCo_Visible',ctrl:'MANTTIPMCO',prop:'Visible'},{av:'edtMAntTipMDs_Visible',ctrl:'MANTTIPMDS',prop:'Visible'},{av:'edtMAntKilTot_Visible',ctrl:'MANTKILTOT',prop:'Visible'},{av:'edtMAntKilPro_Visible',ctrl:'MANTKILPRO',prop:'Visible'},{av:'edtMAntKilReo_Visible',ctrl:'MANTKILREO',prop:'Visible'},{av:'edtMAntPorc_Visible',ctrl:'MANTPORC',prop:'Visible'},{av:'edtMAntMetTot_Visible',ctrl:'MANTMETTOT',prop:'Visible'},{av:'edtMAntMetPro_Visible',ctrl:'MANTMETPRO',prop:'Visible'},{av:'edtMAntMetReo_Visible',ctrl:'MANTMETREO',prop:'Visible'},{av:'edtMantMetPor_Visible',ctrl:'MANTMETPOR',prop:'Visible'},{av:'AV17ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV13GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV69TipMaqCodCollection',fld:'vTIPMAQCODCOLLECTION',pic:''},{av:'AV78sdtMTok',fld:'vSDTMTOK',pic:''},{av:'sPrefix'},{av:'AV18ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV6ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV40TFMAntId',fld:'vTFMANTID',pic:'ZZZZZZZZZ9'},{av:'AV41TFMAntId_To',fld:'vTFMANTID_TO',pic:'ZZZZZZZZZ9'},{av:'AV38TFMAntEmprCod',fld:'vTFMANTEMPRCOD',pic:''},{av:'AV39TFMAntEmprCod_Sel',fld:'vTFMANTEMPRCOD_SEL',pic:''},{av:'AV28TFMAntCliCod',fld:'vTFMANTCLICOD',pic:'ZZZZZ9'},{av:'AV29TFMAntCliCod_To',fld:'vTFMANTCLICOD_TO',pic:'ZZZZZ9'},{av:'AV30TFMAntCliNom',fld:'vTFMANTCLINOM',pic:''},{av:'AV31TFMAntCliNom_Sel',fld:'vTFMANTCLINOM_SEL',pic:''},{av:'AV24TFMAntArtCod',fld:'vTFMANTARTCOD',pic:''},{av:'AV25TFMAntArtCod_Sel',fld:'vTFMANTARTCOD_SEL',pic:''},{av:'AV26TFMAntArtDsc',fld:'vTFMANTARTDSC',pic:''},{av:'AV27TFMAntArtDsc_Sel',fld:'vTFMANTARTDSC_SEL',pic:''},{av:'AV36TFMAntColNum',fld:'vTFMANTCOLNUM',pic:'ZZZZZ9'},{av:'AV37TFMAntColNum_To',fld:'vTFMANTCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV34TFMAntColNom',fld:'vTFMANTCOLNOM',pic:''},{av:'AV35TFMAntColNom_Sel',fld:'vTFMANTCOLNOM_SEL',pic:''},{av:'AV32TFMAntColCod',fld:'vTFMANTCOLCOD',pic:'Z9'},{av:'AV33TFMAntColCod_To',fld:'vTFMANTCOLCOD_TO',pic:'Z9'},{av:'AV46TFMAntMaqCod',fld:'vTFMANTMAQCOD',pic:''},{av:'AV47TFMAntMaqCod_Sel',fld:'vTFMANTMAQCOD_SEL',pic:''},{av:'AV48TFMAntMaqDsc',fld:'vTFMANTMAQDSC',pic:''},{av:'AV49TFMAntMaqDsc_Sel',fld:'vTFMANTMAQDSC_SEL',pic:''},{av:'AV52TFMAntTipMCod',fld:'vTFMANTTIPMCOD',pic:''},{av:'AV53TFMAntTipMCod_Sel',fld:'vTFMANTTIPMCOD_SEL',pic:''},{av:'AV54TFMAntTipMDsc',fld:'vTFMANTTIPMDSC',pic:''},{av:'AV55TFMAntTipMDsc_Sel',fld:'vTFMANTTIPMDSC_SEL',pic:''},{av:'AV72TFMAntKilTot',fld:'vTFMANTKILTOT',pic:'ZZZZZZZZ9.99'},{av:'AV73TFMAntKilTot_To',fld:'vTFMANTKILTOT_TO',pic:'ZZZZZZZZ9.99'},{av:'AV42TFMAntKilProd',fld:'vTFMANTKILPROD',pic:'ZZZZZZZZ9.99'},{av:'AV43TFMAntKilProd_To',fld:'vTFMANTKILPROD_TO',pic:'ZZZZZZZZ9.99'},{av:'AV44TFMAntKilReo',fld:'vTFMANTKILREO',pic:'ZZZZZZZZ9.99'},{av:'AV45TFMAntKilReo_To',fld:'vTFMANTKILREO_TO',pic:'ZZZZZZZZ9.99'},{av:'AV50TFMAntPorc',fld:'vTFMANTPORC',pic:'ZZZ9.99'},{av:'AV51TFMAntPorc_To',fld:'vTFMANTPORC_TO',pic:'ZZZ9.99'},{av:'AV87TFMAntMetTot',fld:'vTFMANTMETTOT',pic:'ZZZZZZZZ9.99'},{av:'AV88TFMAntMetTot_To',fld:'vTFMANTMETTOT_TO',pic:'ZZZZZZZZ9.99'},{av:'AV83TFMAntMetProd',fld:'vTFMANTMETPROD',pic:'ZZZZZZZZ9.99'},{av:'AV84TFMAntMetProd_To',fld:'vTFMANTMETPROD_TO',pic:'ZZZZZZZZ9.99'},{av:'AV85TFMAntMetReo',fld:'vTFMANTMETREO',pic:'ZZZZZZZZ9.99'},{av:'AV86TFMAntMetReo_To',fld:'vTFMANTMETREO_TO',pic:'ZZZZZZZZ9.99'},{av:'AV89TFMantMetPor',fld:'vTFMANTMETPOR',pic:'ZZZ9.99'},{av:'AV90TFMantMetPor_To',fld:'vTFMANTMETPOR_TO',pic:'ZZZ9.99'},{av:'AV97Pgmname',fld:'vPGMNAME',pic:''},{av:'AV20OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV22OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV61MAntEmprCod',fld:'vMANTEMPRCOD',pic:''},{av:'AV65CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV66ArtCod',fld:'vARTCOD',pic:''},{av:'AV67ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV68TipMaqCodJSON',fld:'vTIPMAQCODJSON',pic:''},{av:'AV70FechaInicio',fld:'vFECHAINICIO',pic:''},{av:'AV71FechaFin',fld:'vFECHAFIN',pic:''}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[{av:'AV18ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV6ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtMAntId_Visible',ctrl:'MANTID',prop:'Visible'},{av:'edtMAntEmprCo_Visible',ctrl:'MANTEMPRCO',prop:'Visible'},{av:'edtMAntCliCod_Visible',ctrl:'MANTCLICOD',prop:'Visible'},{av:'edtMAntCliNom_Visible',ctrl:'MANTCLINOM',prop:'Visible'},{av:'edtMAntArtCod_Visible',ctrl:'MANTARTCOD',prop:'Visible'},{av:'edtMAntArtDsc_Visible',ctrl:'MANTARTDSC',prop:'Visible'},{av:'edtMAntColNum_Visible',ctrl:'MANTCOLNUM',prop:'Visible'},{av:'edtMAntColNom_Visible',ctrl:'MANTCOLNOM',prop:'Visible'},{av:'edtMAntColCod_Visible',ctrl:'MANTCOLCOD',prop:'Visible'},{av:'edtMAntMaqCod_Visible',ctrl:'MANTMAQCOD',prop:'Visible'},{av:'edtMAntMaqDsc_Visible',ctrl:'MANTMAQDSC',prop:'Visible'},{av:'edtMAntTipMCo_Visible',ctrl:'MANTTIPMCO',prop:'Visible'},{av:'edtMAntTipMDs_Visible',ctrl:'MANTTIPMDS',prop:'Visible'},{av:'edtMAntKilTot_Visible',ctrl:'MANTKILTOT',prop:'Visible'},{av:'edtMAntKilPro_Visible',ctrl:'MANTKILPRO',prop:'Visible'},{av:'edtMAntKilReo_Visible',ctrl:'MANTKILREO',prop:'Visible'},{av:'edtMAntPorc_Visible',ctrl:'MANTPORC',prop:'Visible'},{av:'edtMAntMetTot_Visible',ctrl:'MANTMETTOT',prop:'Visible'},{av:'edtMAntMetPro_Visible',ctrl:'MANTMETPRO',prop:'Visible'},{av:'edtMAntMetReo_Visible',ctrl:'MANTMETREO',prop:'Visible'},{av:'edtMantMetPor_Visible',ctrl:'MANTMETPOR',prop:'Visible'},{av:'AV17ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV13GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("VALID_MANTKILTOT","{handler:'valid_Mantkiltot',iparms:[]");
      setEventMetadata("VALID_MANTKILTOT",",oparms:[]}");
      setEventMetadata("VALID_MANTKILREO","{handler:'valid_Mantkilreo',iparms:[]");
      setEventMetadata("VALID_MANTKILREO",",oparms:[]}");
      setEventMetadata("VALID_MANTMETTOT","{handler:'valid_Mantmettot',iparms:[]");
      setEventMetadata("VALID_MANTMETTOT",",oparms:[]}");
      setEventMetadata("VALID_MANTMETREO","{handler:'valid_Mantmetreo',iparms:[]");
      setEventMetadata("VALID_MANTMETREO",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Manttkn',iparms:[]");
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
      wcpOAV61MAntEmprCod = "" ;
      wcpOAV66ArtCod = "" ;
      wcpOAV68TipMaqCodJSON = "" ;
      wcpOAV70FechaInicio = GXutil.nullDate() ;
      wcpOAV71FechaFin = GXutil.nullDate() ;
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
      AV61MAntEmprCod = "" ;
      AV66ArtCod = "" ;
      AV68TipMaqCodJSON = "" ;
      AV70FechaInicio = GXutil.nullDate() ;
      AV71FechaFin = GXutil.nullDate() ;
      AV12FilterFullText = "" ;
      AV69TipMaqCodCollection = new GXSimpleCollection<String>(String.class, "internal", "");
      AV78sdtMTok = new app.anticipacionerrores.SdtsdtMTok(remoteHandle, context);
      AV6ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV38TFMAntEmprCod = "" ;
      AV39TFMAntEmprCod_Sel = "" ;
      AV30TFMAntCliNom = "" ;
      AV31TFMAntCliNom_Sel = "" ;
      AV24TFMAntArtCod = "" ;
      AV25TFMAntArtCod_Sel = "" ;
      AV26TFMAntArtDsc = "" ;
      AV27TFMAntArtDsc_Sel = "" ;
      AV34TFMAntColNom = "" ;
      AV35TFMAntColNom_Sel = "" ;
      AV46TFMAntMaqCod = "" ;
      AV47TFMAntMaqCod_Sel = "" ;
      AV48TFMAntMaqDsc = "" ;
      AV49TFMAntMaqDsc_Sel = "" ;
      AV52TFMAntTipMCod = "" ;
      AV53TFMAntTipMCod_Sel = "" ;
      AV54TFMAntTipMDsc = "" ;
      AV55TFMAntTipMDsc_Sel = "" ;
      AV72TFMAntKilTot = DecimalUtil.ZERO ;
      AV73TFMAntKilTot_To = DecimalUtil.ZERO ;
      AV42TFMAntKilProd = DecimalUtil.ZERO ;
      AV43TFMAntKilProd_To = DecimalUtil.ZERO ;
      AV44TFMAntKilReo = DecimalUtil.ZERO ;
      AV45TFMAntKilReo_To = DecimalUtil.ZERO ;
      AV50TFMAntPorc = DecimalUtil.ZERO ;
      AV51TFMAntPorc_To = DecimalUtil.ZERO ;
      AV87TFMAntMetTot = DecimalUtil.ZERO ;
      AV88TFMAntMetTot_To = DecimalUtil.ZERO ;
      AV83TFMAntMetProd = DecimalUtil.ZERO ;
      AV84TFMAntMetProd_To = DecimalUtil.ZERO ;
      AV85TFMAntMetReo = DecimalUtil.ZERO ;
      AV86TFMAntMetReo_To = DecimalUtil.ZERO ;
      AV89TFMantMetPor = DecimalUtil.ZERO ;
      AV90TFMantMetPor_To = DecimalUtil.ZERO ;
      AV97Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV17ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV9DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV13GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV81sdtParametros = new app.anticipacionerrores.SdtsdtParametros(remoteHandle, context);
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
      bttBtneditcolumns_Jsonclick = "" ;
      lblTitulo_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV98Anticipacionerrores_mant_filtradods_1_filterfulltext = "" ;
      AV101Anticipacionerrores_mant_filtradods_4_tfmantemprcod = "" ;
      AV102Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel = "" ;
      AV105Anticipacionerrores_mant_filtradods_8_tfmantclinom = "" ;
      AV106Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel = "" ;
      AV107Anticipacionerrores_mant_filtradods_10_tfmantartcod = "" ;
      AV108Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel = "" ;
      AV109Anticipacionerrores_mant_filtradods_12_tfmantartdsc = "" ;
      AV110Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel = "" ;
      AV113Anticipacionerrores_mant_filtradods_16_tfmantcolnom = "" ;
      AV114Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel = "" ;
      AV117Anticipacionerrores_mant_filtradods_20_tfmantmaqcod = "" ;
      AV118Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel = "" ;
      AV119Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc = "" ;
      AV120Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel = "" ;
      AV121Anticipacionerrores_mant_filtradods_24_tfmanttipmcod = "" ;
      AV122Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel = "" ;
      AV123Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc = "" ;
      AV124Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel = "" ;
      AV125Anticipacionerrores_mant_filtradods_28_tfmantkiltot = DecimalUtil.ZERO ;
      AV126Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to = DecimalUtil.ZERO ;
      AV127Anticipacionerrores_mant_filtradods_30_tfmantkilprod = DecimalUtil.ZERO ;
      AV128Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to = DecimalUtil.ZERO ;
      AV129Anticipacionerrores_mant_filtradods_32_tfmantkilreo = DecimalUtil.ZERO ;
      AV130Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to = DecimalUtil.ZERO ;
      AV131Anticipacionerrores_mant_filtradods_34_tfmantporc = DecimalUtil.ZERO ;
      AV132Anticipacionerrores_mant_filtradods_35_tfmantporc_to = DecimalUtil.ZERO ;
      AV133Anticipacionerrores_mant_filtradods_36_tfmantmettot = DecimalUtil.ZERO ;
      AV134Anticipacionerrores_mant_filtradods_37_tfmantmettot_to = DecimalUtil.ZERO ;
      AV135Anticipacionerrores_mant_filtradods_38_tfmantmetprod = DecimalUtil.ZERO ;
      AV136Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to = DecimalUtil.ZERO ;
      AV137Anticipacionerrores_mant_filtradods_40_tfmantmetreo = DecimalUtil.ZERO ;
      AV138Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to = DecimalUtil.ZERO ;
      AV139Anticipacionerrores_mant_filtradods_42_tfmantmetpor = DecimalUtil.ZERO ;
      AV140Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to = DecimalUtil.ZERO ;
      A14566MAntEmprCo = "" ;
      A14611MAntCliNom = "" ;
      A14567MAntArtCod = "" ;
      A14613MAntArtDsc = "" ;
      A14623MAntColNom = "" ;
      A14570MAntMaqCod = "" ;
      A14610MAntMaqDsc = "" ;
      A14569MAntTipMCo = "" ;
      A14612MAntTipMDs = "" ;
      A14646MAntKilTot = DecimalUtil.ZERO ;
      A14643MAntKilPro = DecimalUtil.ZERO ;
      A14644MAntKilReo = DecimalUtil.ZERO ;
      A14645MAntPorc = DecimalUtil.ZERO ;
      A14647MAntMetTot = DecimalUtil.ZERO ;
      A14648MAntMetPro = DecimalUtil.ZERO ;
      A14649MAntMetReo = DecimalUtil.ZERO ;
      A14650MantMetPor = DecimalUtil.ZERO ;
      A14564MAntUsu = "" ;
      A14563MAntTkn = "" ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      lV98Anticipacionerrores_mant_filtradods_1_filterfulltext = "" ;
      lV101Anticipacionerrores_mant_filtradods_4_tfmantemprcod = "" ;
      lV105Anticipacionerrores_mant_filtradods_8_tfmantclinom = "" ;
      lV107Anticipacionerrores_mant_filtradods_10_tfmantartcod = "" ;
      lV109Anticipacionerrores_mant_filtradods_12_tfmantartdsc = "" ;
      lV113Anticipacionerrores_mant_filtradods_16_tfmantcolnom = "" ;
      lV117Anticipacionerrores_mant_filtradods_20_tfmantmaqcod = "" ;
      lV119Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc = "" ;
      lV121Anticipacionerrores_mant_filtradods_24_tfmanttipmcod = "" ;
      lV123Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc = "" ;
      H02DQ2_A14563MAntTkn = new String[] {""} ;
      H02DQ2_A14564MAntUsu = new String[] {""} ;
      H02DQ2_A14648MAntMetPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02DQ2_n14648MAntMetPro = new boolean[] {false} ;
      H02DQ2_A14643MAntKilPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02DQ2_A14612MAntTipMDs = new String[] {""} ;
      H02DQ2_A14569MAntTipMCo = new String[] {""} ;
      H02DQ2_A14610MAntMaqDsc = new String[] {""} ;
      H02DQ2_A14570MAntMaqCod = new String[] {""} ;
      H02DQ2_A14642MAntColCod = new byte[1] ;
      H02DQ2_A14623MAntColNom = new String[] {""} ;
      H02DQ2_A14568MAntColNum = new int[1] ;
      H02DQ2_A14613MAntArtDsc = new String[] {""} ;
      H02DQ2_A14567MAntArtCod = new String[] {""} ;
      H02DQ2_A14611MAntCliNom = new String[] {""} ;
      H02DQ2_A14565MAntCliCod = new int[1] ;
      H02DQ2_A14566MAntEmprCo = new String[] {""} ;
      H02DQ2_A14562MAntId = new long[1] ;
      H02DQ2_A14644MAntKilReo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02DQ2_A14646MAntKilTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02DQ2_A14649MAntMetReo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02DQ2_n14649MAntMetReo = new boolean[] {false} ;
      H02DQ2_A14647MAntMetTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02DQ2_n14647MAntMetTot = new boolean[] {false} ;
      H02DQ3_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV79WebSession = httpContext.getWebSession();
      AV91Station = "" ;
      AV92EmprCod = "" ;
      AV93EmprNom = "" ;
      AV94UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV59WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV23Session = httpContext.getWebSession();
      AV8ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV19ManageFiltersXml = "" ;
      AV11ExcelFilename = "" ;
      AV10ErrorMessage = "" ;
      AV58UserCustomValue = "" ;
      AV7ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = new GXBaseCollection[1] ;
      AV14GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
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
      GXt_char14 = "" ;
      GXv_char15 = new String[1] ;
      GXt_char13 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char12 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState26 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV56TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV15HTTPRequest = httpContext.getHttpRequest();
      AV80ValorRecibidoVariable = "" ;
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV61MAntEmprCod = "" ;
      sCtrlAV65CliCod = "" ;
      sCtrlAV66ArtCod = "" ;
      sCtrlAV67ForColNum = "" ;
      sCtrlAV68TipMaqCodJSON = "" ;
      sCtrlAV70FechaInicio = "" ;
      sCtrlAV71FechaFin = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.anticipacionerrores.mant_filtrado__default(),
         new Object[] {
             new Object[] {
            H02DQ2_A14563MAntTkn, H02DQ2_A14564MAntUsu, H02DQ2_A14648MAntMetPro, H02DQ2_n14648MAntMetPro, H02DQ2_A14643MAntKilPro, H02DQ2_A14612MAntTipMDs, H02DQ2_A14569MAntTipMCo, H02DQ2_A14610MAntMaqDsc, H02DQ2_A14570MAntMaqCod, H02DQ2_A14642MAntColCod,
            H02DQ2_A14623MAntColNom, H02DQ2_A14568MAntColNum, H02DQ2_A14613MAntArtDsc, H02DQ2_A14567MAntArtCod, H02DQ2_A14611MAntCliNom, H02DQ2_A14565MAntCliCod, H02DQ2_A14566MAntEmprCo, H02DQ2_A14562MAntId, H02DQ2_A14644MAntKilReo, H02DQ2_A14646MAntKilTot,
            H02DQ2_A14649MAntMetReo, H02DQ2_n14649MAntMetReo, H02DQ2_A14647MAntMetTot, H02DQ2_n14647MAntMetTot
            }
            , new Object[] {
            H02DQ3_AGRID_nRecordCount
            }
         }
      );
      AV97Pgmname = "AnticipacionErrores.MAnt_Filtrado" ;
      /* GeneXus formulas. */
      AV97Pgmname = "AnticipacionErrores.MAnt_Filtrado" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV18ManageFiltersExecutionStep ;
   private byte AV32TFMAntColCod ;
   private byte AV33TFMAntColCod_To ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte AV115Anticipacionerrores_mant_filtradods_18_tfmantcolcod ;
   private byte AV116Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to ;
   private byte A14642MAntColCod ;
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
   private short AV20OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV65CliCod ;
   private int wcpOAV67ForColNum ;
   private int nRC_GXsfl_38 ;
   private int AV65CliCod ;
   private int AV67ForColNum ;
   private int subGrid_Rows ;
   private int nGXsfl_38_idx=1 ;
   private int AV28TFMAntCliCod ;
   private int AV29TFMAntCliCod_To ;
   private int AV36TFMAntColNum ;
   private int AV37TFMAntColNum_To ;
   private int edtavPgmname_Enabled ;
   private int AV103Anticipacionerrores_mant_filtradods_6_tfmantclicod ;
   private int AV104Anticipacionerrores_mant_filtradods_7_tfmantclicod_to ;
   private int AV111Anticipacionerrores_mant_filtradods_14_tfmantcolnum ;
   private int AV112Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to ;
   private int A14565MAntCliCod ;
   private int A14568MAntColNum ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV69TipMaqCodCollection_size ;
   private int edtMAntId_Visible ;
   private int edtMAntEmprCo_Visible ;
   private int edtMAntCliCod_Visible ;
   private int edtMAntCliNom_Visible ;
   private int edtMAntArtCod_Visible ;
   private int edtMAntArtDsc_Visible ;
   private int edtMAntColNum_Visible ;
   private int edtMAntColNom_Visible ;
   private int edtMAntColCod_Visible ;
   private int edtMAntMaqCod_Visible ;
   private int edtMAntMaqDsc_Visible ;
   private int edtMAntTipMCo_Visible ;
   private int edtMAntTipMDs_Visible ;
   private int edtMAntKilTot_Visible ;
   private int edtMAntKilPro_Visible ;
   private int edtMAntKilReo_Visible ;
   private int edtMAntPorc_Visible ;
   private int edtMAntMetTot_Visible ;
   private int edtMAntMetPro_Visible ;
   private int edtMAntMetReo_Visible ;
   private int edtMantMetPor_Visible ;
   private int AV141GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV40TFMAntId ;
   private long AV41TFMAntId_To ;
   private long AV99Anticipacionerrores_mant_filtradods_2_tfmantid ;
   private long AV100Anticipacionerrores_mant_filtradods_3_tfmantid_to ;
   private long A14562MAntId ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV72TFMAntKilTot ;
   private java.math.BigDecimal AV73TFMAntKilTot_To ;
   private java.math.BigDecimal AV42TFMAntKilProd ;
   private java.math.BigDecimal AV43TFMAntKilProd_To ;
   private java.math.BigDecimal AV44TFMAntKilReo ;
   private java.math.BigDecimal AV45TFMAntKilReo_To ;
   private java.math.BigDecimal AV50TFMAntPorc ;
   private java.math.BigDecimal AV51TFMAntPorc_To ;
   private java.math.BigDecimal AV87TFMAntMetTot ;
   private java.math.BigDecimal AV88TFMAntMetTot_To ;
   private java.math.BigDecimal AV83TFMAntMetProd ;
   private java.math.BigDecimal AV84TFMAntMetProd_To ;
   private java.math.BigDecimal AV85TFMAntMetReo ;
   private java.math.BigDecimal AV86TFMAntMetReo_To ;
   private java.math.BigDecimal AV89TFMantMetPor ;
   private java.math.BigDecimal AV90TFMantMetPor_To ;
   private java.math.BigDecimal AV125Anticipacionerrores_mant_filtradods_28_tfmantkiltot ;
   private java.math.BigDecimal AV126Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to ;
   private java.math.BigDecimal AV127Anticipacionerrores_mant_filtradods_30_tfmantkilprod ;
   private java.math.BigDecimal AV128Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to ;
   private java.math.BigDecimal AV129Anticipacionerrores_mant_filtradods_32_tfmantkilreo ;
   private java.math.BigDecimal AV130Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to ;
   private java.math.BigDecimal AV131Anticipacionerrores_mant_filtradods_34_tfmantporc ;
   private java.math.BigDecimal AV132Anticipacionerrores_mant_filtradods_35_tfmantporc_to ;
   private java.math.BigDecimal AV133Anticipacionerrores_mant_filtradods_36_tfmantmettot ;
   private java.math.BigDecimal AV134Anticipacionerrores_mant_filtradods_37_tfmantmettot_to ;
   private java.math.BigDecimal AV135Anticipacionerrores_mant_filtradods_38_tfmantmetprod ;
   private java.math.BigDecimal AV136Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to ;
   private java.math.BigDecimal AV137Anticipacionerrores_mant_filtradods_40_tfmantmetreo ;
   private java.math.BigDecimal AV138Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to ;
   private java.math.BigDecimal AV139Anticipacionerrores_mant_filtradods_42_tfmantmetpor ;
   private java.math.BigDecimal AV140Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to ;
   private java.math.BigDecimal A14646MAntKilTot ;
   private java.math.BigDecimal A14643MAntKilPro ;
   private java.math.BigDecimal A14644MAntKilReo ;
   private java.math.BigDecimal A14645MAntPorc ;
   private java.math.BigDecimal A14647MAntMetTot ;
   private java.math.BigDecimal A14648MAntMetPro ;
   private java.math.BigDecimal A14649MAntMetReo ;
   private java.math.BigDecimal A14650MantMetPor ;
   private String wcpOAV61MAntEmprCod ;
   private String wcpOAV66ArtCod ;
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
   private String AV61MAntEmprCod ;
   private String AV66ArtCod ;
   private String sGXsfl_38_idx="0001" ;
   private String AV38TFMAntEmprCod ;
   private String AV39TFMAntEmprCod_Sel ;
   private String AV24TFMAntArtCod ;
   private String AV25TFMAntArtCod_Sel ;
   private String AV34TFMAntColNom ;
   private String AV35TFMAntColNom_Sel ;
   private String AV46TFMAntMaqCod ;
   private String AV47TFMAntMaqCod_Sel ;
   private String AV52TFMAntTipMCod ;
   private String AV53TFMAntTipMCod_Sel ;
   private String AV97Pgmname ;
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
   private String Grid_empowerer_Infinitescrolling ;
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
   private String lblTitulo_Internalname ;
   private String lblTitulo_Caption ;
   private String lblTitulo_Jsonclick ;
   private String sStyleString ;
   private String subGrid_Internalname ;
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
   private String edtavFilterfulltext_Internalname ;
   private String AV101Anticipacionerrores_mant_filtradods_4_tfmantemprcod ;
   private String AV102Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel ;
   private String AV107Anticipacionerrores_mant_filtradods_10_tfmantartcod ;
   private String AV108Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel ;
   private String AV113Anticipacionerrores_mant_filtradods_16_tfmantcolnom ;
   private String AV114Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel ;
   private String AV117Anticipacionerrores_mant_filtradods_20_tfmantmaqcod ;
   private String AV118Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel ;
   private String AV121Anticipacionerrores_mant_filtradods_24_tfmanttipmcod ;
   private String AV122Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel ;
   private String edtMAntId_Internalname ;
   private String A14566MAntEmprCo ;
   private String edtMAntEmprCo_Internalname ;
   private String edtMAntCliCod_Internalname ;
   private String edtMAntCliNom_Internalname ;
   private String A14567MAntArtCod ;
   private String edtMAntArtCod_Internalname ;
   private String edtMAntArtDsc_Internalname ;
   private String edtMAntColNum_Internalname ;
   private String A14623MAntColNom ;
   private String edtMAntColNom_Internalname ;
   private String edtMAntColCod_Internalname ;
   private String A14570MAntMaqCod ;
   private String edtMAntMaqCod_Internalname ;
   private String edtMAntMaqDsc_Internalname ;
   private String A14569MAntTipMCo ;
   private String edtMAntTipMCo_Internalname ;
   private String edtMAntTipMDs_Internalname ;
   private String edtMAntKilTot_Internalname ;
   private String edtMAntKilPro_Internalname ;
   private String edtMAntKilReo_Internalname ;
   private String edtMAntPorc_Internalname ;
   private String edtMAntMetTot_Internalname ;
   private String edtMAntMetPro_Internalname ;
   private String edtMAntMetReo_Internalname ;
   private String edtMantMetPor_Internalname ;
   private String A14564MAntUsu ;
   private String edtMAntUsu_Internalname ;
   private String edtMAntTkn_Internalname ;
   private String GXCCtl ;
   private String AV78sdtMTok_getgxTv_SdtsdtMTok_Mtknusu ;
   private String scmdbuf ;
   private String lV101Anticipacionerrores_mant_filtradods_4_tfmantemprcod ;
   private String lV107Anticipacionerrores_mant_filtradods_10_tfmantartcod ;
   private String lV113Anticipacionerrores_mant_filtradods_16_tfmantcolnom ;
   private String lV117Anticipacionerrores_mant_filtradods_20_tfmantmaqcod ;
   private String lV121Anticipacionerrores_mant_filtradods_24_tfmanttipmcod ;
   private String hsh ;
   private String AV91Station ;
   private String AV92EmprCod ;
   private String AV93EmprNom ;
   private String AV94UsurCod ;
   private String edtMAntEmprCo_Link ;
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
   private String GXt_char14 ;
   private String GXv_char15[] ;
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
   private String sCtrlAV61MAntEmprCod ;
   private String sCtrlAV65CliCod ;
   private String sCtrlAV66ArtCod ;
   private String sCtrlAV67ForColNum ;
   private String sCtrlAV68TipMaqCodJSON ;
   private String sCtrlAV70FechaInicio ;
   private String sCtrlAV71FechaFin ;
   private String sGXsfl_38_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtMAntId_Jsonclick ;
   private String edtMAntEmprCo_Jsonclick ;
   private String edtMAntCliCod_Jsonclick ;
   private String edtMAntCliNom_Jsonclick ;
   private String edtMAntArtCod_Jsonclick ;
   private String edtMAntArtDsc_Jsonclick ;
   private String edtMAntColNum_Jsonclick ;
   private String edtMAntColNom_Jsonclick ;
   private String edtMAntColCod_Jsonclick ;
   private String edtMAntMaqCod_Jsonclick ;
   private String edtMAntMaqDsc_Jsonclick ;
   private String edtMAntTipMCo_Jsonclick ;
   private String edtMAntTipMDs_Jsonclick ;
   private String edtMAntKilTot_Jsonclick ;
   private String edtMAntKilPro_Jsonclick ;
   private String edtMAntKilReo_Jsonclick ;
   private String edtMAntPorc_Jsonclick ;
   private String edtMAntMetTot_Jsonclick ;
   private String edtMAntMetPro_Jsonclick ;
   private String edtMAntMetReo_Jsonclick ;
   private String edtMantMetPor_Jsonclick ;
   private String edtMAntUsu_Jsonclick ;
   private String edtMAntTkn_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV70FechaInicio ;
   private java.util.Date wcpOAV71FechaFin ;
   private java.util.Date AV70FechaInicio ;
   private java.util.Date AV71FechaFin ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV22OrderedDsc ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n14647MAntMetTot ;
   private boolean n14648MAntMetPro ;
   private boolean n14649MAntMetReo ;
   private boolean bGXsfl_38_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean Cond_result ;
   private boolean gx_refresh_fired ;
   private String AV8ColumnsSelectorXML ;
   private String AV19ManageFiltersXml ;
   private String AV58UserCustomValue ;
   private String wcpOAV68TipMaqCodJSON ;
   private String AV68TipMaqCodJSON ;
   private String AV12FilterFullText ;
   private String AV30TFMAntCliNom ;
   private String AV31TFMAntCliNom_Sel ;
   private String AV26TFMAntArtDsc ;
   private String AV27TFMAntArtDsc_Sel ;
   private String AV48TFMAntMaqDsc ;
   private String AV49TFMAntMaqDsc_Sel ;
   private String AV54TFMAntTipMDsc ;
   private String AV55TFMAntTipMDsc_Sel ;
   private String AV98Anticipacionerrores_mant_filtradods_1_filterfulltext ;
   private String AV105Anticipacionerrores_mant_filtradods_8_tfmantclinom ;
   private String AV106Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel ;
   private String AV109Anticipacionerrores_mant_filtradods_12_tfmantartdsc ;
   private String AV110Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel ;
   private String AV119Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc ;
   private String AV120Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel ;
   private String AV123Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc ;
   private String AV124Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel ;
   private String A14611MAntCliNom ;
   private String A14613MAntArtDsc ;
   private String A14610MAntMaqDsc ;
   private String A14612MAntTipMDs ;
   private String A14563MAntTkn ;
   private String AV78sdtMTok_getgxTv_SdtsdtMTok_Mtkn ;
   private String lV98Anticipacionerrores_mant_filtradods_1_filterfulltext ;
   private String lV105Anticipacionerrores_mant_filtradods_8_tfmantclinom ;
   private String lV109Anticipacionerrores_mant_filtradods_12_tfmantartdsc ;
   private String lV119Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc ;
   private String lV123Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc ;
   private String AV11ExcelFilename ;
   private String AV10ErrorMessage ;
   private String AV80ValorRecibidoVariable ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV15HTTPRequest ;
   private com.genexus.webpanels.WebSession AV79WebSession ;
   private com.genexus.webpanels.WebSession AV23Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] H02DQ2_A14563MAntTkn ;
   private String[] H02DQ2_A14564MAntUsu ;
   private java.math.BigDecimal[] H02DQ2_A14648MAntMetPro ;
   private boolean[] H02DQ2_n14648MAntMetPro ;
   private java.math.BigDecimal[] H02DQ2_A14643MAntKilPro ;
   private String[] H02DQ2_A14612MAntTipMDs ;
   private String[] H02DQ2_A14569MAntTipMCo ;
   private String[] H02DQ2_A14610MAntMaqDsc ;
   private String[] H02DQ2_A14570MAntMaqCod ;
   private byte[] H02DQ2_A14642MAntColCod ;
   private String[] H02DQ2_A14623MAntColNom ;
   private int[] H02DQ2_A14568MAntColNum ;
   private String[] H02DQ2_A14613MAntArtDsc ;
   private String[] H02DQ2_A14567MAntArtCod ;
   private String[] H02DQ2_A14611MAntCliNom ;
   private int[] H02DQ2_A14565MAntCliCod ;
   private String[] H02DQ2_A14566MAntEmprCo ;
   private long[] H02DQ2_A14562MAntId ;
   private java.math.BigDecimal[] H02DQ2_A14644MAntKilReo ;
   private java.math.BigDecimal[] H02DQ2_A14646MAntKilTot ;
   private java.math.BigDecimal[] H02DQ2_A14649MAntMetReo ;
   private boolean[] H02DQ2_n14649MAntMetReo ;
   private java.math.BigDecimal[] H02DQ2_A14647MAntMetTot ;
   private boolean[] H02DQ2_n14647MAntMetTot ;
   private long[] H02DQ3_AGRID_nRecordCount ;
   private GXSimpleCollection<String> AV69TipMaqCodCollection ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV17ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV6ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV7ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV9DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV13GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState26[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV14GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV56TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV59WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.anticipacionerrores.SdtsdtMTok AV78sdtMTok ;
   private app.anticipacionerrores.SdtsdtParametros AV81sdtParametros ;
}

final  class mant_filtrado__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H02DQ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A14569MAntTipMCo ,
                                          GXSimpleCollection<String> AV69TipMaqCodCollection ,
                                          String AV98Anticipacionerrores_mant_filtradods_1_filterfulltext ,
                                          long AV99Anticipacionerrores_mant_filtradods_2_tfmantid ,
                                          long AV100Anticipacionerrores_mant_filtradods_3_tfmantid_to ,
                                          String AV102Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel ,
                                          String AV101Anticipacionerrores_mant_filtradods_4_tfmantemprcod ,
                                          int AV103Anticipacionerrores_mant_filtradods_6_tfmantclicod ,
                                          int AV104Anticipacionerrores_mant_filtradods_7_tfmantclicod_to ,
                                          String AV106Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel ,
                                          String AV105Anticipacionerrores_mant_filtradods_8_tfmantclinom ,
                                          String AV108Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel ,
                                          String AV107Anticipacionerrores_mant_filtradods_10_tfmantartcod ,
                                          String AV110Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel ,
                                          String AV109Anticipacionerrores_mant_filtradods_12_tfmantartdsc ,
                                          int AV111Anticipacionerrores_mant_filtradods_14_tfmantcolnum ,
                                          int AV112Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to ,
                                          String AV114Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel ,
                                          String AV113Anticipacionerrores_mant_filtradods_16_tfmantcolnom ,
                                          byte AV115Anticipacionerrores_mant_filtradods_18_tfmantcolcod ,
                                          byte AV116Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to ,
                                          String AV118Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel ,
                                          String AV117Anticipacionerrores_mant_filtradods_20_tfmantmaqcod ,
                                          String AV120Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel ,
                                          String AV119Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc ,
                                          String AV122Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel ,
                                          String AV121Anticipacionerrores_mant_filtradods_24_tfmanttipmcod ,
                                          String AV124Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel ,
                                          String AV123Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc ,
                                          java.math.BigDecimal AV125Anticipacionerrores_mant_filtradods_28_tfmantkiltot ,
                                          java.math.BigDecimal AV126Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to ,
                                          java.math.BigDecimal AV127Anticipacionerrores_mant_filtradods_30_tfmantkilprod ,
                                          java.math.BigDecimal AV128Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to ,
                                          java.math.BigDecimal AV129Anticipacionerrores_mant_filtradods_32_tfmantkilreo ,
                                          java.math.BigDecimal AV130Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to ,
                                          java.math.BigDecimal AV131Anticipacionerrores_mant_filtradods_34_tfmantporc ,
                                          java.math.BigDecimal AV132Anticipacionerrores_mant_filtradods_35_tfmantporc_to ,
                                          java.math.BigDecimal AV133Anticipacionerrores_mant_filtradods_36_tfmantmettot ,
                                          java.math.BigDecimal AV134Anticipacionerrores_mant_filtradods_37_tfmantmettot_to ,
                                          java.math.BigDecimal AV135Anticipacionerrores_mant_filtradods_38_tfmantmetprod ,
                                          java.math.BigDecimal AV136Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to ,
                                          java.math.BigDecimal AV137Anticipacionerrores_mant_filtradods_40_tfmantmetreo ,
                                          java.math.BigDecimal AV138Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to ,
                                          java.math.BigDecimal AV139Anticipacionerrores_mant_filtradods_42_tfmantmetpor ,
                                          java.math.BigDecimal AV140Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to ,
                                          String AV66ArtCod ,
                                          int AV67ForColNum ,
                                          int AV69TipMaqCodCollection_size ,
                                          long A14562MAntId ,
                                          String A14566MAntEmprCo ,
                                          int A14565MAntCliCod ,
                                          String A14611MAntCliNom ,
                                          String A14567MAntArtCod ,
                                          String A14613MAntArtDsc ,
                                          int A14568MAntColNum ,
                                          String A14623MAntColNom ,
                                          byte A14642MAntColCod ,
                                          String A14570MAntMaqCod ,
                                          String A14610MAntMaqDsc ,
                                          String A14612MAntTipMDs ,
                                          java.math.BigDecimal A14646MAntKilTot ,
                                          java.math.BigDecimal A14643MAntKilPro ,
                                          java.math.BigDecimal A14644MAntKilReo ,
                                          java.math.BigDecimal A14647MAntMetTot ,
                                          java.math.BigDecimal A14648MAntMetPro ,
                                          java.math.BigDecimal A14649MAntMetReo ,
                                          short AV20OrderedBy ,
                                          boolean AV22OrderedDsc ,
                                          String AV78sdtMTok_getgxTv_SdtsdtMTok_Mtkn ,
                                          String AV78sdtMTok_getgxTv_SdtsdtMTok_Mtknusu ,
                                          int AV65CliCod ,
                                          String AV61MAntEmprCod ,
                                          String A14563MAntTkn ,
                                          String A14564MAntUsu )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int27 = new byte[74];
      Object[] GXv_Object28 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " /*+ FIRST_ROWS(51) */ MAntTkn, MAntUsu, MAntMetPro, MAntKilPro, MAntTipMDs, MAntTipMCo, MAntMaqDsc, MAntMaqCod, MAntColCod, MAntColNom, MAntColNum, MAntArtDsc," ;
      sSelectString += " MAntArtCod, MAntCliNom, MAntCliCod, MAntEmprCo, MAntId, MAntKilReo, MAntKilTot, MAntMetReo, MAntMetTot" ;
      sFromString = " FROM MAnt" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(MAntTkn = ? and MAntUsu = ? and MAntCliCod = ? and MAntEmprCo = ?)");
      if ( ! (GXutil.strcmp("", AV98Anticipacionerrores_mant_filtradods_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(MAntId,'9999999990'), 2) like '%' || ?) or ( UPPER(MAntEmprCo) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntCliCod,'999990'), 2) like '%' || ?) or ( UPPER(MAntCliNom) like '%' || UPPER(?)) or ( UPPER(MAntArtCod) like '%' || UPPER(?)) or ( UPPER(MAntArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntColNum,'999990'), 2) like '%' || ?) or ( UPPER(MAntColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntColCod,'90'), 2) like '%' || ?) or ( UPPER(MAntMaqCod) like '%' || UPPER(?)) or ( UPPER(MAntMaqDsc) like '%' || UPPER(?)) or ( UPPER(MAntTipMCo) like '%' || UPPER(?)) or ( UPPER(MAntTipMDs) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntKilTot,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntKilPro,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntKilReo,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END,'9990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntMetTot,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntMetPro,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntMetReo,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CASE  WHEN MAntMetTot > 0 THEN ( CAST(MAntMetReo / MAntMetTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END,'9990.99'), 2) like '%' || ?))");
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
         GXv_int27[15] = (byte)(1) ;
         GXv_int27[16] = (byte)(1) ;
         GXv_int27[17] = (byte)(1) ;
         GXv_int27[18] = (byte)(1) ;
         GXv_int27[19] = (byte)(1) ;
         GXv_int27[20] = (byte)(1) ;
         GXv_int27[21] = (byte)(1) ;
         GXv_int27[22] = (byte)(1) ;
         GXv_int27[23] = (byte)(1) ;
         GXv_int27[24] = (byte)(1) ;
      }
      if ( ! (0==AV99Anticipacionerrores_mant_filtradods_2_tfmantid) )
      {
         addWhere(sWhereString, "(MAntId >= ?)");
      }
      else
      {
         GXv_int27[25] = (byte)(1) ;
      }
      if ( ! (0==AV100Anticipacionerrores_mant_filtradods_3_tfmantid_to) )
      {
         addWhere(sWhereString, "(MAntId <= ?)");
      }
      else
      {
         GXv_int27[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV101Anticipacionerrores_mant_filtradods_4_tfmantemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntEmprCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntEmprCo = ?)");
      }
      else
      {
         GXv_int27[28] = (byte)(1) ;
      }
      if ( ! (0==AV103Anticipacionerrores_mant_filtradods_6_tfmantclicod) )
      {
         addWhere(sWhereString, "(MAntCliCod >= ?)");
      }
      else
      {
         GXv_int27[29] = (byte)(1) ;
      }
      if ( ! (0==AV104Anticipacionerrores_mant_filtradods_7_tfmantclicod_to) )
      {
         addWhere(sWhereString, "(MAntCliCod <= ?)");
      }
      else
      {
         GXv_int27[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel)==0) && ( ! (GXutil.strcmp("", AV105Anticipacionerrores_mant_filtradods_8_tfmantclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntCliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel)==0) )
      {
         addWhere(sWhereString, "(MAntCliNom = ?)");
      }
      else
      {
         GXv_int27[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel)==0) && ( ! (GXutil.strcmp("", AV107Anticipacionerrores_mant_filtradods_10_tfmantartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntArtCod = ?)");
      }
      else
      {
         GXv_int27[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV109Anticipacionerrores_mant_filtradods_12_tfmantartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntArtDsc = ?)");
      }
      else
      {
         GXv_int27[36] = (byte)(1) ;
      }
      if ( ! (0==AV111Anticipacionerrores_mant_filtradods_14_tfmantcolnum) )
      {
         addWhere(sWhereString, "(MAntColNum >= ?)");
      }
      else
      {
         GXv_int27[37] = (byte)(1) ;
      }
      if ( ! (0==AV112Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to) )
      {
         addWhere(sWhereString, "(MAntColNum <= ?)");
      }
      else
      {
         GXv_int27[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV113Anticipacionerrores_mant_filtradods_16_tfmantcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(MAntColNom = ?)");
      }
      else
      {
         GXv_int27[40] = (byte)(1) ;
      }
      if ( ! (0==AV115Anticipacionerrores_mant_filtradods_18_tfmantcolcod) )
      {
         addWhere(sWhereString, "(MAntColCod >= ?)");
      }
      else
      {
         GXv_int27[41] = (byte)(1) ;
      }
      if ( ! (0==AV116Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to) )
      {
         addWhere(sWhereString, "(MAntColCod <= ?)");
      }
      else
      {
         GXv_int27[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV117Anticipacionerrores_mant_filtradods_20_tfmantmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntMaqCod = ?)");
      }
      else
      {
         GXv_int27[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV119Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntMaqDsc = ?)");
      }
      else
      {
         GXv_int27[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel)==0) && ( ! (GXutil.strcmp("", AV121Anticipacionerrores_mant_filtradods_24_tfmanttipmcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntTipMCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntTipMCo = ?)");
      }
      else
      {
         GXv_int27[48] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV123Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntTipMDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[49] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntTipMDs = ?)");
      }
      else
      {
         GXv_int27[50] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Anticipacionerrores_mant_filtradods_28_tfmantkiltot)==0) )
      {
         addWhere(sWhereString, "(MAntKilTot >= ?)");
      }
      else
      {
         GXv_int27[51] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to)==0) )
      {
         addWhere(sWhereString, "(MAntKilTot <= ?)");
      }
      else
      {
         GXv_int27[52] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV127Anticipacionerrores_mant_filtradods_30_tfmantkilprod)==0) )
      {
         addWhere(sWhereString, "(MAntKilPro >= ?)");
      }
      else
      {
         GXv_int27[53] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV128Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to)==0) )
      {
         addWhere(sWhereString, "(MAntKilPro <= ?)");
      }
      else
      {
         GXv_int27[54] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Anticipacionerrores_mant_filtradods_32_tfmantkilreo)==0) )
      {
         addWhere(sWhereString, "(MAntKilReo >= ?)");
      }
      else
      {
         GXv_int27[55] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV130Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to)==0) )
      {
         addWhere(sWhereString, "(MAntKilReo <= ?)");
      }
      else
      {
         GXv_int27[56] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV131Anticipacionerrores_mant_filtradods_34_tfmantporc)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END >= ?)");
      }
      else
      {
         GXv_int27[57] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV132Anticipacionerrores_mant_filtradods_35_tfmantporc_to)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END <= ?)");
      }
      else
      {
         GXv_int27[58] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV133Anticipacionerrores_mant_filtradods_36_tfmantmettot)==0) )
      {
         addWhere(sWhereString, "(MAntMetTot >= ?)");
      }
      else
      {
         GXv_int27[59] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV134Anticipacionerrores_mant_filtradods_37_tfmantmettot_to)==0) )
      {
         addWhere(sWhereString, "(MAntMetTot <= ?)");
      }
      else
      {
         GXv_int27[60] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV135Anticipacionerrores_mant_filtradods_38_tfmantmetprod)==0) )
      {
         addWhere(sWhereString, "(MAntMetPro >= ?)");
      }
      else
      {
         GXv_int27[61] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV136Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to)==0) )
      {
         addWhere(sWhereString, "(MAntMetPro <= ?)");
      }
      else
      {
         GXv_int27[62] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV137Anticipacionerrores_mant_filtradods_40_tfmantmetreo)==0) )
      {
         addWhere(sWhereString, "(MAntMetReo >= ?)");
      }
      else
      {
         GXv_int27[63] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV138Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to)==0) )
      {
         addWhere(sWhereString, "(MAntMetReo <= ?)");
      }
      else
      {
         GXv_int27[64] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV139Anticipacionerrores_mant_filtradods_42_tfmantmetpor)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntMetTot > 0 THEN ( CAST(MAntMetReo / MAntMetTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END >= ?)");
      }
      else
      {
         GXv_int27[65] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV140Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntMetTot > 0 THEN ( CAST(MAntMetReo / MAntMetTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END <= ?)");
      }
      else
      {
         GXv_int27[66] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66ArtCod)==0) )
      {
         addWhere(sWhereString, "(MAntArtCod = ?)");
      }
      else
      {
         GXv_int27[67] = (byte)(1) ;
      }
      if ( ! (0==AV67ForColNum) )
      {
         addWhere(sWhereString, "(MAntColNum = ?)");
      }
      else
      {
         GXv_int27[68] = (byte)(1) ;
      }
      if ( AV69TipMaqCodCollection_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV69TipMaqCodCollection, "MAntTipMCo IN (", ")")+")");
      }
      if ( ( AV20OrderedBy == 1 ) && ! AV22OrderedDsc )
      {
         sOrderString += " ORDER BY MAntId" ;
      }
      else if ( ( AV20OrderedBy == 1 ) && ( AV22OrderedDsc ) )
      {
         sOrderString += " ORDER BY MAntId DESC" ;
      }
      else if ( ( AV20OrderedBy == 2 ) && ! AV22OrderedDsc )
      {
         sOrderString += " ORDER BY MAntEmprCo" ;
      }
      else if ( ( AV20OrderedBy == 2 ) && ( AV22OrderedDsc ) )
      {
         sOrderString += " ORDER BY MAntEmprCo DESC" ;
      }
      else if ( ( AV20OrderedBy == 3 ) && ! AV22OrderedDsc )
      {
         sOrderString += " ORDER BY MAntCliCod" ;
      }
      else if ( ( AV20OrderedBy == 3 ) && ( AV22OrderedDsc ) )
      {
         sOrderString += " ORDER BY MAntCliCod DESC" ;
      }
      else if ( ( AV20OrderedBy == 4 ) && ! AV22OrderedDsc )
      {
         sOrderString += " ORDER BY MAntCliNom" ;
      }
      else if ( ( AV20OrderedBy == 4 ) && ( AV22OrderedDsc ) )
      {
         sOrderString += " ORDER BY MAntCliNom DESC" ;
      }
      else if ( ( AV20OrderedBy == 5 ) && ! AV22OrderedDsc )
      {
         sOrderString += " ORDER BY MAntArtCod" ;
      }
      else if ( ( AV20OrderedBy == 5 ) && ( AV22OrderedDsc ) )
      {
         sOrderString += " ORDER BY MAntArtCod DESC" ;
      }
      else if ( ( AV20OrderedBy == 6 ) && ! AV22OrderedDsc )
      {
         sOrderString += " ORDER BY MAntArtDsc" ;
      }
      else if ( ( AV20OrderedBy == 6 ) && ( AV22OrderedDsc ) )
      {
         sOrderString += " ORDER BY MAntArtDsc DESC" ;
      }
      else if ( ( AV20OrderedBy == 7 ) && ! AV22OrderedDsc )
      {
         sOrderString += " ORDER BY MAntColNum" ;
      }
      else if ( ( AV20OrderedBy == 7 ) && ( AV22OrderedDsc ) )
      {
         sOrderString += " ORDER BY MAntColNum DESC" ;
      }
      else if ( ( AV20OrderedBy == 8 ) && ! AV22OrderedDsc )
      {
         sOrderString += " ORDER BY MAntColNom" ;
      }
      else if ( ( AV20OrderedBy == 8 ) && ( AV22OrderedDsc ) )
      {
         sOrderString += " ORDER BY MAntColNom DESC" ;
      }
      else if ( ( AV20OrderedBy == 9 ) && ! AV22OrderedDsc )
      {
         sOrderString += " ORDER BY MAntColCod" ;
      }
      else if ( ( AV20OrderedBy == 9 ) && ( AV22OrderedDsc ) )
      {
         sOrderString += " ORDER BY MAntColCod DESC" ;
      }
      else if ( ( AV20OrderedBy == 10 ) && ! AV22OrderedDsc )
      {
         sOrderString += " ORDER BY MAntMaqCod" ;
      }
      else if ( ( AV20OrderedBy == 10 ) && ( AV22OrderedDsc ) )
      {
         sOrderString += " ORDER BY MAntMaqCod DESC" ;
      }
      else if ( ( AV20OrderedBy == 11 ) && ! AV22OrderedDsc )
      {
         sOrderString += " ORDER BY MAntMaqDsc" ;
      }
      else if ( ( AV20OrderedBy == 11 ) && ( AV22OrderedDsc ) )
      {
         sOrderString += " ORDER BY MAntMaqDsc DESC" ;
      }
      else if ( ( AV20OrderedBy == 12 ) && ! AV22OrderedDsc )
      {
         sOrderString += " ORDER BY MAntTipMCo" ;
      }
      else if ( ( AV20OrderedBy == 12 ) && ( AV22OrderedDsc ) )
      {
         sOrderString += " ORDER BY MAntTipMCo DESC" ;
      }
      else if ( ( AV20OrderedBy == 13 ) && ! AV22OrderedDsc )
      {
         sOrderString += " ORDER BY MAntTipMDs" ;
      }
      else if ( ( AV20OrderedBy == 13 ) && ( AV22OrderedDsc ) )
      {
         sOrderString += " ORDER BY MAntTipMDs DESC" ;
      }
      else if ( ( AV20OrderedBy == 14 ) && ! AV22OrderedDsc )
      {
         sOrderString += " ORDER BY MAntKilTot" ;
      }
      else if ( ( AV20OrderedBy == 14 ) && ( AV22OrderedDsc ) )
      {
         sOrderString += " ORDER BY MAntKilTot DESC" ;
      }
      else if ( ( AV20OrderedBy == 15 ) && ! AV22OrderedDsc )
      {
         sOrderString += " ORDER BY MAntKilPro" ;
      }
      else if ( ( AV20OrderedBy == 15 ) && ( AV22OrderedDsc ) )
      {
         sOrderString += " ORDER BY MAntKilPro DESC" ;
      }
      else if ( ( AV20OrderedBy == 16 ) && ! AV22OrderedDsc )
      {
         sOrderString += " ORDER BY MAntKilReo" ;
      }
      else if ( ( AV20OrderedBy == 16 ) && ( AV22OrderedDsc ) )
      {
         sOrderString += " ORDER BY MAntKilReo DESC" ;
      }
      else if ( ( AV20OrderedBy == 17 ) && ! AV22OrderedDsc )
      {
         sOrderString += " ORDER BY MAntMetTot" ;
      }
      else if ( ( AV20OrderedBy == 17 ) && ( AV22OrderedDsc ) )
      {
         sOrderString += " ORDER BY MAntMetTot DESC" ;
      }
      else if ( ( AV20OrderedBy == 18 ) && ! AV22OrderedDsc )
      {
         sOrderString += " ORDER BY MAntMetPro" ;
      }
      else if ( ( AV20OrderedBy == 18 ) && ( AV22OrderedDsc ) )
      {
         sOrderString += " ORDER BY MAntMetPro DESC" ;
      }
      else if ( ( AV20OrderedBy == 19 ) && ! AV22OrderedDsc )
      {
         sOrderString += " ORDER BY MAntMetReo" ;
      }
      else if ( ( AV20OrderedBy == 19 ) && ( AV22OrderedDsc ) )
      {
         sOrderString += " ORDER BY MAntMetReo DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY MAntId" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object28[0] = scmdbuf ;
      GXv_Object28[1] = GXv_int27 ;
      return GXv_Object28 ;
   }

   protected Object[] conditional_H02DQ3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A14569MAntTipMCo ,
                                          GXSimpleCollection<String> AV69TipMaqCodCollection ,
                                          String AV98Anticipacionerrores_mant_filtradods_1_filterfulltext ,
                                          long AV99Anticipacionerrores_mant_filtradods_2_tfmantid ,
                                          long AV100Anticipacionerrores_mant_filtradods_3_tfmantid_to ,
                                          String AV102Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel ,
                                          String AV101Anticipacionerrores_mant_filtradods_4_tfmantemprcod ,
                                          int AV103Anticipacionerrores_mant_filtradods_6_tfmantclicod ,
                                          int AV104Anticipacionerrores_mant_filtradods_7_tfmantclicod_to ,
                                          String AV106Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel ,
                                          String AV105Anticipacionerrores_mant_filtradods_8_tfmantclinom ,
                                          String AV108Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel ,
                                          String AV107Anticipacionerrores_mant_filtradods_10_tfmantartcod ,
                                          String AV110Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel ,
                                          String AV109Anticipacionerrores_mant_filtradods_12_tfmantartdsc ,
                                          int AV111Anticipacionerrores_mant_filtradods_14_tfmantcolnum ,
                                          int AV112Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to ,
                                          String AV114Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel ,
                                          String AV113Anticipacionerrores_mant_filtradods_16_tfmantcolnom ,
                                          byte AV115Anticipacionerrores_mant_filtradods_18_tfmantcolcod ,
                                          byte AV116Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to ,
                                          String AV118Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel ,
                                          String AV117Anticipacionerrores_mant_filtradods_20_tfmantmaqcod ,
                                          String AV120Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel ,
                                          String AV119Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc ,
                                          String AV122Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel ,
                                          String AV121Anticipacionerrores_mant_filtradods_24_tfmanttipmcod ,
                                          String AV124Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel ,
                                          String AV123Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc ,
                                          java.math.BigDecimal AV125Anticipacionerrores_mant_filtradods_28_tfmantkiltot ,
                                          java.math.BigDecimal AV126Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to ,
                                          java.math.BigDecimal AV127Anticipacionerrores_mant_filtradods_30_tfmantkilprod ,
                                          java.math.BigDecimal AV128Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to ,
                                          java.math.BigDecimal AV129Anticipacionerrores_mant_filtradods_32_tfmantkilreo ,
                                          java.math.BigDecimal AV130Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to ,
                                          java.math.BigDecimal AV131Anticipacionerrores_mant_filtradods_34_tfmantporc ,
                                          java.math.BigDecimal AV132Anticipacionerrores_mant_filtradods_35_tfmantporc_to ,
                                          java.math.BigDecimal AV133Anticipacionerrores_mant_filtradods_36_tfmantmettot ,
                                          java.math.BigDecimal AV134Anticipacionerrores_mant_filtradods_37_tfmantmettot_to ,
                                          java.math.BigDecimal AV135Anticipacionerrores_mant_filtradods_38_tfmantmetprod ,
                                          java.math.BigDecimal AV136Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to ,
                                          java.math.BigDecimal AV137Anticipacionerrores_mant_filtradods_40_tfmantmetreo ,
                                          java.math.BigDecimal AV138Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to ,
                                          java.math.BigDecimal AV139Anticipacionerrores_mant_filtradods_42_tfmantmetpor ,
                                          java.math.BigDecimal AV140Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to ,
                                          String AV66ArtCod ,
                                          int AV67ForColNum ,
                                          int AV69TipMaqCodCollection_size ,
                                          long A14562MAntId ,
                                          String A14566MAntEmprCo ,
                                          int A14565MAntCliCod ,
                                          String A14611MAntCliNom ,
                                          String A14567MAntArtCod ,
                                          String A14613MAntArtDsc ,
                                          int A14568MAntColNum ,
                                          String A14623MAntColNom ,
                                          byte A14642MAntColCod ,
                                          String A14570MAntMaqCod ,
                                          String A14610MAntMaqDsc ,
                                          String A14612MAntTipMDs ,
                                          java.math.BigDecimal A14646MAntKilTot ,
                                          java.math.BigDecimal A14643MAntKilPro ,
                                          java.math.BigDecimal A14644MAntKilReo ,
                                          java.math.BigDecimal A14647MAntMetTot ,
                                          java.math.BigDecimal A14648MAntMetPro ,
                                          java.math.BigDecimal A14649MAntMetReo ,
                                          short AV20OrderedBy ,
                                          boolean AV22OrderedDsc ,
                                          String AV78sdtMTok_getgxTv_SdtsdtMTok_Mtkn ,
                                          String AV78sdtMTok_getgxTv_SdtsdtMTok_Mtknusu ,
                                          int AV65CliCod ,
                                          String AV61MAntEmprCod ,
                                          String A14563MAntTkn ,
                                          String A14564MAntUsu )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int30 = new byte[69];
      Object[] GXv_Object31 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM MAnt" ;
      addWhere(sWhereString, "(MAntTkn = ? and MAntUsu = ? and MAntCliCod = ? and MAntEmprCo = ?)");
      if ( ! (GXutil.strcmp("", AV98Anticipacionerrores_mant_filtradods_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(MAntId,'9999999990'), 2) like '%' || ?) or ( UPPER(MAntEmprCo) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntCliCod,'999990'), 2) like '%' || ?) or ( UPPER(MAntCliNom) like '%' || UPPER(?)) or ( UPPER(MAntArtCod) like '%' || UPPER(?)) or ( UPPER(MAntArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntColNum,'999990'), 2) like '%' || ?) or ( UPPER(MAntColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntColCod,'90'), 2) like '%' || ?) or ( UPPER(MAntMaqCod) like '%' || UPPER(?)) or ( UPPER(MAntMaqDsc) like '%' || UPPER(?)) or ( UPPER(MAntTipMCo) like '%' || UPPER(?)) or ( UPPER(MAntTipMDs) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntKilTot,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntKilPro,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntKilReo,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END,'9990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntMetTot,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntMetPro,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntMetReo,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CASE  WHEN MAntMetTot > 0 THEN ( CAST(MAntMetReo / MAntMetTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END,'9990.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int30[4] = (byte)(1) ;
         GXv_int30[5] = (byte)(1) ;
         GXv_int30[6] = (byte)(1) ;
         GXv_int30[7] = (byte)(1) ;
         GXv_int30[8] = (byte)(1) ;
         GXv_int30[9] = (byte)(1) ;
         GXv_int30[10] = (byte)(1) ;
         GXv_int30[11] = (byte)(1) ;
         GXv_int30[12] = (byte)(1) ;
         GXv_int30[13] = (byte)(1) ;
         GXv_int30[14] = (byte)(1) ;
         GXv_int30[15] = (byte)(1) ;
         GXv_int30[16] = (byte)(1) ;
         GXv_int30[17] = (byte)(1) ;
         GXv_int30[18] = (byte)(1) ;
         GXv_int30[19] = (byte)(1) ;
         GXv_int30[20] = (byte)(1) ;
         GXv_int30[21] = (byte)(1) ;
         GXv_int30[22] = (byte)(1) ;
         GXv_int30[23] = (byte)(1) ;
         GXv_int30[24] = (byte)(1) ;
      }
      if ( ! (0==AV99Anticipacionerrores_mant_filtradods_2_tfmantid) )
      {
         addWhere(sWhereString, "(MAntId >= ?)");
      }
      else
      {
         GXv_int30[25] = (byte)(1) ;
      }
      if ( ! (0==AV100Anticipacionerrores_mant_filtradods_3_tfmantid_to) )
      {
         addWhere(sWhereString, "(MAntId <= ?)");
      }
      else
      {
         GXv_int30[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV101Anticipacionerrores_mant_filtradods_4_tfmantemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntEmprCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Anticipacionerrores_mant_filtradods_5_tfmantemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntEmprCo = ?)");
      }
      else
      {
         GXv_int30[28] = (byte)(1) ;
      }
      if ( ! (0==AV103Anticipacionerrores_mant_filtradods_6_tfmantclicod) )
      {
         addWhere(sWhereString, "(MAntCliCod >= ?)");
      }
      else
      {
         GXv_int30[29] = (byte)(1) ;
      }
      if ( ! (0==AV104Anticipacionerrores_mant_filtradods_7_tfmantclicod_to) )
      {
         addWhere(sWhereString, "(MAntCliCod <= ?)");
      }
      else
      {
         GXv_int30[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel)==0) && ( ! (GXutil.strcmp("", AV105Anticipacionerrores_mant_filtradods_8_tfmantclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntCliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Anticipacionerrores_mant_filtradods_9_tfmantclinom_sel)==0) )
      {
         addWhere(sWhereString, "(MAntCliNom = ?)");
      }
      else
      {
         GXv_int30[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel)==0) && ( ! (GXutil.strcmp("", AV107Anticipacionerrores_mant_filtradods_10_tfmantartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Anticipacionerrores_mant_filtradods_11_tfmantartcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntArtCod = ?)");
      }
      else
      {
         GXv_int30[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV109Anticipacionerrores_mant_filtradods_12_tfmantartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Anticipacionerrores_mant_filtradods_13_tfmantartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntArtDsc = ?)");
      }
      else
      {
         GXv_int30[36] = (byte)(1) ;
      }
      if ( ! (0==AV111Anticipacionerrores_mant_filtradods_14_tfmantcolnum) )
      {
         addWhere(sWhereString, "(MAntColNum >= ?)");
      }
      else
      {
         GXv_int30[37] = (byte)(1) ;
      }
      if ( ! (0==AV112Anticipacionerrores_mant_filtradods_15_tfmantcolnum_to) )
      {
         addWhere(sWhereString, "(MAntColNum <= ?)");
      }
      else
      {
         GXv_int30[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV113Anticipacionerrores_mant_filtradods_16_tfmantcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Anticipacionerrores_mant_filtradods_17_tfmantcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(MAntColNom = ?)");
      }
      else
      {
         GXv_int30[40] = (byte)(1) ;
      }
      if ( ! (0==AV115Anticipacionerrores_mant_filtradods_18_tfmantcolcod) )
      {
         addWhere(sWhereString, "(MAntColCod >= ?)");
      }
      else
      {
         GXv_int30[41] = (byte)(1) ;
      }
      if ( ! (0==AV116Anticipacionerrores_mant_filtradods_19_tfmantcolcod_to) )
      {
         addWhere(sWhereString, "(MAntColCod <= ?)");
      }
      else
      {
         GXv_int30[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV117Anticipacionerrores_mant_filtradods_20_tfmantmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Anticipacionerrores_mant_filtradods_21_tfmantmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntMaqCod = ?)");
      }
      else
      {
         GXv_int30[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV119Anticipacionerrores_mant_filtradods_22_tfmantmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Anticipacionerrores_mant_filtradods_23_tfmantmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntMaqDsc = ?)");
      }
      else
      {
         GXv_int30[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel)==0) && ( ! (GXutil.strcmp("", AV121Anticipacionerrores_mant_filtradods_24_tfmanttipmcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntTipMCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Anticipacionerrores_mant_filtradods_25_tfmanttipmcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntTipMCo = ?)");
      }
      else
      {
         GXv_int30[48] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV123Anticipacionerrores_mant_filtradods_26_tfmanttipmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntTipMDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[49] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Anticipacionerrores_mant_filtradods_27_tfmanttipmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntTipMDs = ?)");
      }
      else
      {
         GXv_int30[50] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Anticipacionerrores_mant_filtradods_28_tfmantkiltot)==0) )
      {
         addWhere(sWhereString, "(MAntKilTot >= ?)");
      }
      else
      {
         GXv_int30[51] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Anticipacionerrores_mant_filtradods_29_tfmantkiltot_to)==0) )
      {
         addWhere(sWhereString, "(MAntKilTot <= ?)");
      }
      else
      {
         GXv_int30[52] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV127Anticipacionerrores_mant_filtradods_30_tfmantkilprod)==0) )
      {
         addWhere(sWhereString, "(MAntKilPro >= ?)");
      }
      else
      {
         GXv_int30[53] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV128Anticipacionerrores_mant_filtradods_31_tfmantkilprod_to)==0) )
      {
         addWhere(sWhereString, "(MAntKilPro <= ?)");
      }
      else
      {
         GXv_int30[54] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Anticipacionerrores_mant_filtradods_32_tfmantkilreo)==0) )
      {
         addWhere(sWhereString, "(MAntKilReo >= ?)");
      }
      else
      {
         GXv_int30[55] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV130Anticipacionerrores_mant_filtradods_33_tfmantkilreo_to)==0) )
      {
         addWhere(sWhereString, "(MAntKilReo <= ?)");
      }
      else
      {
         GXv_int30[56] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV131Anticipacionerrores_mant_filtradods_34_tfmantporc)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END >= ?)");
      }
      else
      {
         GXv_int30[57] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV132Anticipacionerrores_mant_filtradods_35_tfmantporc_to)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END <= ?)");
      }
      else
      {
         GXv_int30[58] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV133Anticipacionerrores_mant_filtradods_36_tfmantmettot)==0) )
      {
         addWhere(sWhereString, "(MAntMetTot >= ?)");
      }
      else
      {
         GXv_int30[59] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV134Anticipacionerrores_mant_filtradods_37_tfmantmettot_to)==0) )
      {
         addWhere(sWhereString, "(MAntMetTot <= ?)");
      }
      else
      {
         GXv_int30[60] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV135Anticipacionerrores_mant_filtradods_38_tfmantmetprod)==0) )
      {
         addWhere(sWhereString, "(MAntMetPro >= ?)");
      }
      else
      {
         GXv_int30[61] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV136Anticipacionerrores_mant_filtradods_39_tfmantmetprod_to)==0) )
      {
         addWhere(sWhereString, "(MAntMetPro <= ?)");
      }
      else
      {
         GXv_int30[62] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV137Anticipacionerrores_mant_filtradods_40_tfmantmetreo)==0) )
      {
         addWhere(sWhereString, "(MAntMetReo >= ?)");
      }
      else
      {
         GXv_int30[63] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV138Anticipacionerrores_mant_filtradods_41_tfmantmetreo_to)==0) )
      {
         addWhere(sWhereString, "(MAntMetReo <= ?)");
      }
      else
      {
         GXv_int30[64] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV139Anticipacionerrores_mant_filtradods_42_tfmantmetpor)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntMetTot > 0 THEN ( CAST(MAntMetReo / MAntMetTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END >= ?)");
      }
      else
      {
         GXv_int30[65] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV140Anticipacionerrores_mant_filtradods_43_tfmantmetpor_to)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntMetTot > 0 THEN ( CAST(MAntMetReo / MAntMetTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END <= ?)");
      }
      else
      {
         GXv_int30[66] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66ArtCod)==0) )
      {
         addWhere(sWhereString, "(MAntArtCod = ?)");
      }
      else
      {
         GXv_int30[67] = (byte)(1) ;
      }
      if ( ! (0==AV67ForColNum) )
      {
         addWhere(sWhereString, "(MAntColNum = ?)");
      }
      else
      {
         GXv_int30[68] = (byte)(1) ;
      }
      if ( AV69TipMaqCodCollection_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV69TipMaqCodCollection, "MAntTipMCo IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      if ( ( AV20OrderedBy == 1 ) && ! AV22OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 1 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 2 ) && ! AV22OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 2 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 3 ) && ! AV22OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 3 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 4 ) && ! AV22OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 4 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 5 ) && ! AV22OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 5 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 6 ) && ! AV22OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 6 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 7 ) && ! AV22OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 7 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 8 ) && ! AV22OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 8 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 9 ) && ! AV22OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 9 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 10 ) && ! AV22OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 10 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 11 ) && ! AV22OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 11 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 12 ) && ! AV22OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 12 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 13 ) && ! AV22OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 13 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 14 ) && ! AV22OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 14 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 15 ) && ! AV22OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 15 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 16 ) && ! AV22OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 16 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 17 ) && ! AV22OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 17 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 18 ) && ! AV22OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 18 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 19 ) && ! AV22OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 19 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object31[0] = scmdbuf ;
      GXv_Object31[1] = GXv_int30 ;
      return GXv_Object31 ;
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
                  return conditional_H02DQ2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).longValue() , ((Number) dynConstraints[4]).longValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).intValue() , ((Number) dynConstraints[48]).longValue() , (String)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , (String)dynConstraints[55] , ((Number) dynConstraints[56]).byteValue() , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , (java.math.BigDecimal)dynConstraints[60] , (java.math.BigDecimal)dynConstraints[61] , (java.math.BigDecimal)dynConstraints[62] , (java.math.BigDecimal)dynConstraints[63] , (java.math.BigDecimal)dynConstraints[64] , (java.math.BigDecimal)dynConstraints[65] , ((Number) dynConstraints[66]).shortValue() , ((Boolean) dynConstraints[67]).booleanValue() , (String)dynConstraints[68] , (String)dynConstraints[69] , ((Number) dynConstraints[70]).intValue() , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] );
            case 1 :
                  return conditional_H02DQ3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).longValue() , ((Number) dynConstraints[4]).longValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).intValue() , ((Number) dynConstraints[48]).longValue() , (String)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , (String)dynConstraints[55] , ((Number) dynConstraints[56]).byteValue() , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , (java.math.BigDecimal)dynConstraints[60] , (java.math.BigDecimal)dynConstraints[61] , (java.math.BigDecimal)dynConstraints[62] , (java.math.BigDecimal)dynConstraints[63] , (java.math.BigDecimal)dynConstraints[64] , (java.math.BigDecimal)dynConstraints[65] , ((Number) dynConstraints[66]).shortValue() , ((Boolean) dynConstraints[67]).booleanValue() , (String)dynConstraints[68] , (String)dynConstraints[69] , ((Number) dynConstraints[70]).intValue() , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02DQ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,51, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02DQ3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[5])[0] = rslt.getVarchar(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 4);
               ((String[]) buf[7])[0] = rslt.getVarchar(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 13);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((String[]) buf[12])[0] = rslt.getVarchar(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 16);
               ((String[]) buf[14])[0] = rslt.getVarchar(14);
               ((int[]) buf[15])[0] = rslt.getInt(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 3);
               ((long[]) buf[17])[0] = rslt.getLong(17);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(20,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
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
                  stmt.setVarchar(sIdx, (String)parms[74], 256);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 3);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[92], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[93], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[94], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[95], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[96], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[97], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[98], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[99]).longValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[100]).longValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 3);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 3);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[103]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[104]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[105], 255);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[106], 255);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[107], 16);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 16);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[109], 255);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[110], 255);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[111]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[112]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[114], 13);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[115]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[116]).byteValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 6);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 6);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[119], 255);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[120], 255);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[121], 4);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[122], 4);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[123], 255);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[124], 255);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[125], 2);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[126], 2);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[127], 2);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[128], 2);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[129], 2);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[130], 2);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[131], 2);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[132], 2);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[133], 2);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[134], 2);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[135], 2);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[136], 2);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[137], 2);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[138], 2);
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[139], 2);
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[140], 2);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 16);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[142]).intValue());
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[143]).intValue());
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[144]).intValue());
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[145]).intValue());
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[146]).intValue());
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[147]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 256);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 3);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[92], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[93], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[94]).longValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[95]).longValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 3);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 3);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[98]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[99]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[100], 255);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[101], 255);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 16);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 16);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[104], 255);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[105], 255);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[106]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[107]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 13);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[110]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[111]).byteValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 6);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 6);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[114], 255);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[115], 255);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 4);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 4);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[118], 255);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[119], 255);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[120], 2);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[121], 2);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[122], 2);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[123], 2);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[124], 2);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[125], 2);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[126], 2);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[127], 2);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[128], 2);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[129], 2);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[130], 2);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[131], 2);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[132], 2);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[133], 2);
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[134], 2);
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[135], 2);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[136], 16);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               return;
      }
   }

}

