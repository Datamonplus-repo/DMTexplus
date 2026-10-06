package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class listadodeproveedores_wc_impl extends GXWebComponent
{
   public listadodeproveedores_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public listadodeproveedores_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( listadodeproveedores_wc_impl.class ));
   }

   public listadodeproveedores_wc_impl( int remoteHandle ,
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
      cmbPrvMetTra = new HTMLChoice();
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
               AV70Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70Emprcod", AV70Emprcod);
               AV71PrvNumFrom = (int)(GXutil.lval( httpContext.GetPar( "PrvNumFrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71PrvNumFrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71PrvNumFrom), 6, 0));
               AV72PrvNumTo = (int)(GXutil.lval( httpContext.GetPar( "PrvNumTo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72PrvNumTo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72PrvNumTo), 6, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV70Emprcod,Integer.valueOf(AV71PrvNumFrom),Integer.valueOf(AV72PrvNumTo)});
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
      AV70Emprcod = httpContext.GetPar( "Emprcod") ;
      AV71PrvNumFrom = (int)(GXutil.lval( httpContext.GetPar( "PrvNumFrom"))) ;
      AV72PrvNumTo = (int)(GXutil.lval( httpContext.GetPar( "PrvNumTo"))) ;
      AV25ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV20ColumnsSelector);
      AV15FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV26TFPrvNum = (int)(GXutil.lval( httpContext.GetPar( "TFPrvNum"))) ;
      AV27TFPrvNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFPrvNum_To"))) ;
      AV28TFPrvNom = httpContext.GetPar( "TFPrvNom") ;
      AV29TFPrvNom_Sel = httpContext.GetPar( "TFPrvNom_Sel") ;
      AV30TFPrvDir = httpContext.GetPar( "TFPrvDir") ;
      AV31TFPrvDir_Sel = httpContext.GetPar( "TFPrvDir_Sel") ;
      AV32TFPrvPob = httpContext.GetPar( "TFPrvPob") ;
      AV33TFPrvPob_Sel = httpContext.GetPar( "TFPrvPob_Sel") ;
      AV34TFPrvCpo = httpContext.GetPar( "TFPrvCpo") ;
      AV35TFPrvCpo_Sel = httpContext.GetPar( "TFPrvCpo_Sel") ;
      AV36TFPrvCp2 = httpContext.GetPar( "TFPrvCp2") ;
      AV37TFPrvCp2_Sel = httpContext.GetPar( "TFPrvCp2_Sel") ;
      AV38TFPrvNif = httpContext.GetPar( "TFPrvNif") ;
      AV39TFPrvNif_Sel = httpContext.GetPar( "TFPrvNif_Sel") ;
      AV40TFPrvTlf = httpContext.GetPar( "TFPrvTlf") ;
      AV41TFPrvTlf_Sel = httpContext.GetPar( "TFPrvTlf_Sel") ;
      AV42TFPrvTlx = httpContext.GetPar( "TFPrvTlx") ;
      AV43TFPrvTlx_Sel = httpContext.GetPar( "TFPrvTlx_Sel") ;
      AV44TFPrvFax = httpContext.GetPar( "TFPrvFax") ;
      AV45TFPrvFax_Sel = httpContext.GetPar( "TFPrvFax_Sel") ;
      AV46TFPrvMail = httpContext.GetPar( "TFPrvMail") ;
      AV47TFPrvMail_Sel = httpContext.GetPar( "TFPrvMail_Sel") ;
      AV48TFFpgCod = httpContext.GetPar( "TFFpgCod") ;
      AV49TFFpgCod_Sel = httpContext.GetPar( "TFFpgCod_Sel") ;
      AV50TFFpgDsc = httpContext.GetPar( "TFFpgDsc") ;
      AV51TFFpgDsc_Sel = httpContext.GetPar( "TFFpgDsc_Sel") ;
      AV52TFPrvVto = (byte)(GXutil.lval( httpContext.GetPar( "TFPrvVto"))) ;
      AV53TFPrvVto_To = (byte)(GXutil.lval( httpContext.GetPar( "TFPrvVto_To"))) ;
      AV54TFPrvDiaPag = (int)(GXutil.lval( httpContext.GetPar( "TFPrvDiaPag"))) ;
      AV55TFPrvDiaPag_To = (int)(GXutil.lval( httpContext.GetPar( "TFPrvDiaPag_To"))) ;
      AV56TFPrvPer = (int)(GXutil.lval( httpContext.GetPar( "TFPrvPer"))) ;
      AV57TFPrvPer_To = (int)(GXutil.lval( httpContext.GetPar( "TFPrvPer_To"))) ;
      AV58TFPrvRep = httpContext.GetPar( "TFPrvRep") ;
      AV59TFPrvRep_Sel = httpContext.GetPar( "TFPrvRep_Sel") ;
      AV60TFPrvPlaEnt = (short)(GXutil.lval( httpContext.GetPar( "TFPrvPlaEnt"))) ;
      AV61TFPrvPlaEnt_To = (short)(GXutil.lval( httpContext.GetPar( "TFPrvPlaEnt_To"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV63TFPrvMetTra_Sels);
      AV64TFPrvCta = httpContext.GetPar( "TFPrvCta") ;
      AV65TFPrvCta_Sel = httpContext.GetPar( "TFPrvCta_Sel") ;
      AV77Pgmname = httpContext.GetPar( "Pgmname") ;
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
      gxgrgrid_refresh( subGrid_Rows, AV70Emprcod, AV71PrvNumFrom, AV72PrvNumTo, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFPrvNum, AV27TFPrvNum_To, AV28TFPrvNom, AV29TFPrvNom_Sel, AV30TFPrvDir, AV31TFPrvDir_Sel, AV32TFPrvPob, AV33TFPrvPob_Sel, AV34TFPrvCpo, AV35TFPrvCpo_Sel, AV36TFPrvCp2, AV37TFPrvCp2_Sel, AV38TFPrvNif, AV39TFPrvNif_Sel, AV40TFPrvTlf, AV41TFPrvTlf_Sel, AV42TFPrvTlx, AV43TFPrvTlx_Sel, AV44TFPrvFax, AV45TFPrvFax_Sel, AV46TFPrvMail, AV47TFPrvMail_Sel, AV48TFFpgCod, AV49TFFpgCod_Sel, AV50TFFpgDsc, AV51TFFpgDsc_Sel, AV52TFPrvVto, AV53TFPrvVto_To, AV54TFPrvDiaPag, AV55TFPrvDiaPag_To, AV56TFPrvPer, AV57TFPrvPer_To, AV58TFPrvRep, AV59TFPrvRep_Sel, AV60TFPrvPlaEnt, AV61TFPrvPlaEnt_To, AV63TFPrvMetTra_Sels, AV64TFPrvCta, AV65TFPrvCta_Sel, AV77Pgmname, AV12OrderedBy, AV13OrderedDsc, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1RJ2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Listado de Proveedores", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.stocksquimicos.listadodeproveedores_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV70Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV71PrvNumFrom,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV72PrvNumTo,6,0))}, new String[] {"Emprcod","PrvNumFrom","PrvNumTo"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ListadodeProveedores_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV77Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("stocksquimicos\\listadodeproveedores_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV68GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV69GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV66DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV66DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV20ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV20ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV70Emprcod", GXutil.rtrim( wcpOAV70Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV71PrvNumFrom", GXutil.ltrim( localUtil.ntoc( wcpOAV71PrvNumFrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV72PrvNumTo", GXutil.ltrim( localUtil.ntoc( wcpOAV72PrvNumTo, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV25ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVNUM", GXutil.ltrim( localUtil.ntoc( AV26TFPrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVNUM_TO", GXutil.ltrim( localUtil.ntoc( AV27TFPrvNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVNOM", GXutil.rtrim( AV28TFPrvNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVNOM_SEL", GXutil.rtrim( AV29TFPrvNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVDIR", GXutil.rtrim( AV30TFPrvDir));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVDIR_SEL", GXutil.rtrim( AV31TFPrvDir_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVPOB", GXutil.rtrim( AV32TFPrvPob));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVPOB_SEL", GXutil.rtrim( AV33TFPrvPob_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVCPO", GXutil.rtrim( AV34TFPrvCpo));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVCPO_SEL", GXutil.rtrim( AV35TFPrvCpo_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVCP2", GXutil.rtrim( AV36TFPrvCp2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVCP2_SEL", GXutil.rtrim( AV37TFPrvCp2_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVNIF", GXutil.rtrim( AV38TFPrvNif));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVNIF_SEL", GXutil.rtrim( AV39TFPrvNif_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVTLF", GXutil.rtrim( AV40TFPrvTlf));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVTLF_SEL", GXutil.rtrim( AV41TFPrvTlf_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVTLX", GXutil.rtrim( AV42TFPrvTlx));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVTLX_SEL", GXutil.rtrim( AV43TFPrvTlx_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVFAX", GXutil.rtrim( AV44TFPrvFax));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVFAX_SEL", GXutil.rtrim( AV45TFPrvFax_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVMAIL", GXutil.rtrim( AV46TFPrvMail));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVMAIL_SEL", GXutil.rtrim( AV47TFPrvMail_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFPGCOD", GXutil.rtrim( AV48TFFpgCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFPGCOD_SEL", GXutil.rtrim( AV49TFFpgCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFPGDSC", GXutil.rtrim( AV50TFFpgDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFPGDSC_SEL", GXutil.rtrim( AV51TFFpgDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVVTO", GXutil.ltrim( localUtil.ntoc( AV52TFPrvVto, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVVTO_TO", GXutil.ltrim( localUtil.ntoc( AV53TFPrvVto_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVDIAPAG", GXutil.ltrim( localUtil.ntoc( AV54TFPrvDiaPag, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVDIAPAG_TO", GXutil.ltrim( localUtil.ntoc( AV55TFPrvDiaPag_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVPER", GXutil.ltrim( localUtil.ntoc( AV56TFPrvPer, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVPER_TO", GXutil.ltrim( localUtil.ntoc( AV57TFPrvPer_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVREP", GXutil.rtrim( AV58TFPrvRep));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVREP_SEL", GXutil.rtrim( AV59TFPrvRep_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVPLAENT", GXutil.ltrim( localUtil.ntoc( AV60TFPrvPlaEnt, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVPLAENT_TO", GXutil.ltrim( localUtil.ntoc( AV61TFPrvPlaEnt_To, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vTFPRVMETTRA_SELS", AV63TFPrvMetTra_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vTFPRVMETTRA_SELS", AV63TFPrvMetTra_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVCTA", GXutil.rtrim( AV64TFPrvCta));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVCTA_SEL", GXutil.rtrim( AV65TFPrvCta_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV70Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRVNUMFROM", GXutil.ltrim( localUtil.ntoc( AV71PrvNumFrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRVNUMTO", GXutil.ltrim( localUtil.ntoc( AV72PrvNumTo, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVMETTRA_SELSJSON", AV62TFPrvMetTra_SelsJson);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vIMPCOD", GXutil.rtrim( AV73ImpCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vIMPTAM", GXutil.ltrim( localUtil.ntoc( AV74ImpTam, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INNEWWINDOW1_Width", GXutil.rtrim( Innewwindow1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INNEWWINDOW1_Height", GXutil.rtrim( Innewwindow1_Height));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INNEWWINDOW1_Target", GXutil.rtrim( Innewwindow1_Target));
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

   public void renderHtmlCloseForm1RJ2( )
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
      return "StocksQuimicos.ListadodeProveedores_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Listado de Proveedores", "") ;
   }

   public void wb1RJ0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.stocksquimicos.listadodeproveedores_wc");
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
            httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\ListadodeProveedores_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTREPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\ListadodeProveedores_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\ListadodeProveedores_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\ListadodeProveedores_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_25_1RJ2( true) ;
      }
      else
      {
         wb_table1_25_1RJ2( false) ;
      }
      return  ;
   }

   public void wb_table1_25_1RJ2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV68GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV69GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV77Pgmname), GXutil.rtrim( localUtil.format( AV77Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\ListadodeProveedores_WC.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV66DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, sPrefix+"INNEWWINDOW1Container");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV66DDO_TitleSettingsIcons);
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

   public void start1RJ2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Listado de Proveedores", ""), (short)(0)) ;
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
            strup1RJ0( ) ;
         }
      }
   }

   public void ws1RJ2( )
   {
      start1RJ2( ) ;
      evt1RJ2( ) ;
   }

   public void evt1RJ2( )
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
                              strup1RJ0( ) ;
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
                              strup1RJ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e111RJ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1RJ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e121RJ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1RJ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e131RJ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1RJ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e141RJ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1RJ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e151RJ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1RJ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e161RJ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1RJ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e171RJ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTREPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1RJ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportReport' */
                                 e181RJ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1RJ0( ) ;
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
                              strup1RJ0( ) ;
                           }
                           nGXsfl_43_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_432( ) ;
                           A795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( edtPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A794PrvNom = httpContext.cgiGet( edtPrvNom_Internalname) ;
                           n794PrvNom = false ;
                           A786PrvDir = httpContext.cgiGet( edtPrvDir_Internalname) ;
                           n786PrvDir = false ;
                           A799PrvPob = httpContext.cgiGet( edtPrvPob_Internalname) ;
                           n799PrvPob = false ;
                           A782PrvCpo = httpContext.cgiGet( edtPrvCpo_Internalname) ;
                           n782PrvCpo = false ;
                           A6075PrvCp2 = httpContext.cgiGet( edtPrvCp2_Internalname) ;
                           n6075PrvCp2 = false ;
                           A793PrvNif = httpContext.cgiGet( edtPrvNif_Internalname) ;
                           n793PrvNif = false ;
                           A803PrvTlf = httpContext.cgiGet( edtPrvTlf_Internalname) ;
                           n803PrvTlf = false ;
                           A804PrvTlx = httpContext.cgiGet( edtPrvTlx_Internalname) ;
                           n804PrvTlx = false ;
                           A6076PrvFax = httpContext.cgiGet( edtPrvFax_Internalname) ;
                           n6076PrvFax = false ;
                           A6077PrvMail = httpContext.cgiGet( edtPrvMail_Internalname) ;
                           n6077PrvMail = false ;
                           A497FpgCod = GXutil.upper( httpContext.cgiGet( edtFpgCod_Internalname)) ;
                           n497FpgCod = false ;
                           A498FpgDsc = httpContext.cgiGet( edtFpgDsc_Internalname) ;
                           n498FpgDsc = false ;
                           A805PrvVto = (byte)(localUtil.ctol( httpContext.cgiGet( edtPrvVto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n805PrvVto = false ;
                           A785PrvDiaPag = (int)(localUtil.ctol( httpContext.cgiGet( edtPrvDiaPag_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n785PrvDiaPag = false ;
                           A797PrvPer = (int)(localUtil.ctol( httpContext.cgiGet( edtPrvPer_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n797PrvPer = false ;
                           A801PrvRep = httpContext.cgiGet( edtPrvRep_Internalname) ;
                           n801PrvRep = false ;
                           A798PrvPlaEnt = (short)(localUtil.ctol( httpContext.cgiGet( edtPrvPlaEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n798PrvPlaEnt = false ;
                           cmbPrvMetTra.setName( cmbPrvMetTra.getInternalname() );
                           cmbPrvMetTra.setValue( httpContext.cgiGet( cmbPrvMetTra.getInternalname()) );
                           A792PrvMetTra = httpContext.cgiGet( cmbPrvMetTra.getInternalname()) ;
                           n792PrvMetTra = false ;
                           A783PrvCta = httpContext.cgiGet( edtPrvCta_Internalname) ;
                           n783PrvCta = false ;
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
                                       e191RJ2 ();
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
                                       e201RJ2 ();
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
                                       e211RJ2 ();
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
                                    strup1RJ0( ) ;
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

   public void we1RJ2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1RJ2( ) ;
         }
      }
   }

   public void pa1RJ2( )
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
                                 String AV70Emprcod ,
                                 int AV71PrvNumFrom ,
                                 int AV72PrvNumTo ,
                                 byte AV25ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ,
                                 String AV15FilterFullText ,
                                 int AV26TFPrvNum ,
                                 int AV27TFPrvNum_To ,
                                 String AV28TFPrvNom ,
                                 String AV29TFPrvNom_Sel ,
                                 String AV30TFPrvDir ,
                                 String AV31TFPrvDir_Sel ,
                                 String AV32TFPrvPob ,
                                 String AV33TFPrvPob_Sel ,
                                 String AV34TFPrvCpo ,
                                 String AV35TFPrvCpo_Sel ,
                                 String AV36TFPrvCp2 ,
                                 String AV37TFPrvCp2_Sel ,
                                 String AV38TFPrvNif ,
                                 String AV39TFPrvNif_Sel ,
                                 String AV40TFPrvTlf ,
                                 String AV41TFPrvTlf_Sel ,
                                 String AV42TFPrvTlx ,
                                 String AV43TFPrvTlx_Sel ,
                                 String AV44TFPrvFax ,
                                 String AV45TFPrvFax_Sel ,
                                 String AV46TFPrvMail ,
                                 String AV47TFPrvMail_Sel ,
                                 String AV48TFFpgCod ,
                                 String AV49TFFpgCod_Sel ,
                                 String AV50TFFpgDsc ,
                                 String AV51TFFpgDsc_Sel ,
                                 byte AV52TFPrvVto ,
                                 byte AV53TFPrvVto_To ,
                                 int AV54TFPrvDiaPag ,
                                 int AV55TFPrvDiaPag_To ,
                                 int AV56TFPrvPer ,
                                 int AV57TFPrvPer_To ,
                                 String AV58TFPrvRep ,
                                 String AV59TFPrvRep_Sel ,
                                 short AV60TFPrvPlaEnt ,
                                 short AV61TFPrvPlaEnt_To ,
                                 GXSimpleCollection<String> AV63TFPrvMetTra_Sels ,
                                 String AV64TFPrvCta ,
                                 String AV65TFPrvCta_Sel ,
                                 String AV77Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e201RJ2 ();
      GRID_nCurrentRecord = 0 ;
      rf1RJ2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ListadodeProveedores_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV77Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("stocksquimicos\\listadodeproveedores_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf1RJ2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV77Pgmname = "StocksQuimicos.ListadodeProveedores_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77Pgmname", AV77Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV81Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext = AV15FilterFullText ;
      AV82Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum = AV26TFPrvNum ;
      AV83Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to = AV27TFPrvNum_To ;
      AV84Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom = AV28TFPrvNom ;
      AV85Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel = AV29TFPrvNom_Sel ;
      AV86Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir = AV30TFPrvDir ;
      AV87Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel = AV31TFPrvDir_Sel ;
      AV88Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob = AV32TFPrvPob ;
      AV89Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel = AV33TFPrvPob_Sel ;
      AV90Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo = AV34TFPrvCpo ;
      AV91Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel = AV35TFPrvCpo_Sel ;
      AV92Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 = AV36TFPrvCp2 ;
      AV93Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel = AV37TFPrvCp2_Sel ;
      AV94Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif = AV38TFPrvNif ;
      AV95Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel = AV39TFPrvNif_Sel ;
      AV96Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf = AV40TFPrvTlf ;
      AV97Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel = AV41TFPrvTlf_Sel ;
      AV98Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx = AV42TFPrvTlx ;
      AV99Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel = AV43TFPrvTlx_Sel ;
      AV100Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax = AV44TFPrvFax ;
      AV101Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel = AV45TFPrvFax_Sel ;
      AV102Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail = AV46TFPrvMail ;
      AV103Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel = AV47TFPrvMail_Sel ;
      AV104Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod = AV48TFFpgCod ;
      AV105Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel = AV49TFFpgCod_Sel ;
      AV106Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc = AV50TFFpgDsc ;
      AV107Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel = AV51TFFpgDsc_Sel ;
      AV108Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto = AV52TFPrvVto ;
      AV109Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to = AV53TFPrvVto_To ;
      AV110Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag = AV54TFPrvDiaPag ;
      AV111Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to = AV55TFPrvDiaPag_To ;
      AV112Stocksquimicos_listadodeproveedores_wcds_32_tfprvper = AV56TFPrvPer ;
      AV113Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to = AV57TFPrvPer_To ;
      AV114Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep = AV58TFPrvRep ;
      AV115Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel = AV59TFPrvRep_Sel ;
      AV116Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent = AV60TFPrvPlaEnt ;
      AV117Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to = AV61TFPrvPlaEnt_To ;
      AV118Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels = AV63TFPrvMetTra_Sels ;
      AV119Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta = AV64TFPrvCta ;
      AV120Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel = AV65TFPrvCta_Sel ;
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A792PrvMetTra ,
                                           AV118Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels ,
                                           Integer.valueOf(AV82Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum) ,
                                           Integer.valueOf(AV83Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to) ,
                                           AV85Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel ,
                                           AV84Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom ,
                                           AV87Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel ,
                                           AV86Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir ,
                                           AV89Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel ,
                                           AV88Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob ,
                                           AV91Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel ,
                                           AV90Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo ,
                                           AV93Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel ,
                                           AV92Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 ,
                                           AV95Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel ,
                                           AV94Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif ,
                                           AV97Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel ,
                                           AV96Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf ,
                                           AV99Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel ,
                                           AV98Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx ,
                                           AV101Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel ,
                                           AV100Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax ,
                                           AV103Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel ,
                                           AV102Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail ,
                                           AV105Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel ,
                                           AV104Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod ,
                                           AV107Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel ,
                                           AV106Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc ,
                                           Byte.valueOf(AV108Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto) ,
                                           Byte.valueOf(AV109Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to) ,
                                           Integer.valueOf(AV110Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag) ,
                                           Integer.valueOf(AV111Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to) ,
                                           Integer.valueOf(AV112Stocksquimicos_listadodeproveedores_wcds_32_tfprvper) ,
                                           Integer.valueOf(AV113Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to) ,
                                           AV115Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel ,
                                           AV114Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep ,
                                           Short.valueOf(AV116Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent) ,
                                           Short.valueOf(AV117Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to) ,
                                           Integer.valueOf(AV118Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels.size()) ,
                                           AV120Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel ,
                                           AV119Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta ,
                                           Integer.valueOf(AV71PrvNumFrom) ,
                                           Integer.valueOf(AV72PrvNumTo) ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A786PrvDir ,
                                           A799PrvPob ,
                                           A782PrvCpo ,
                                           A6075PrvCp2 ,
                                           A793PrvNif ,
                                           A803PrvTlf ,
                                           A804PrvTlx ,
                                           A6076PrvFax ,
                                           A6077PrvMail ,
                                           A497FpgCod ,
                                           A498FpgDsc ,
                                           Byte.valueOf(A805PrvVto) ,
                                           Integer.valueOf(A785PrvDiaPag) ,
                                           Integer.valueOf(A797PrvPer) ,
                                           A801PrvRep ,
                                           Short.valueOf(A798PrvPlaEnt) ,
                                           A783PrvCta ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV81Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext ,
                                           AV70Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV84Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom = GXutil.padr( GXutil.rtrim( AV84Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom), 30, "%") ;
      lV86Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir = GXutil.padr( GXutil.rtrim( AV86Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir), 30, "%") ;
      lV88Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob = GXutil.padr( GXutil.rtrim( AV88Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob), 30, "%") ;
      lV90Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo = GXutil.padr( GXutil.rtrim( AV90Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo), 6, "%") ;
      lV92Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 = GXutil.padr( GXutil.rtrim( AV92Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2), 6, "%") ;
      lV94Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif = GXutil.padr( GXutil.rtrim( AV94Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif), 20, "%") ;
      lV96Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf = GXutil.padr( GXutil.rtrim( AV96Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf), 18, "%") ;
      lV98Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx = GXutil.padr( GXutil.rtrim( AV98Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx), 14, "%") ;
      lV100Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax = GXutil.padr( GXutil.rtrim( AV100Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax), 15, "%") ;
      lV102Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail = GXutil.padr( GXutil.rtrim( AV102Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail), 40, "%") ;
      lV104Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod = GXutil.padr( GXutil.rtrim( AV104Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod), 2, "%") ;
      lV106Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc = GXutil.padr( GXutil.rtrim( AV106Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc), 30, "%") ;
      lV114Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep = GXutil.padr( GXutil.rtrim( AV114Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep), 20, "%") ;
      lV119Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta = GXutil.padr( GXutil.rtrim( AV119Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta), 12, "%") ;
      /* Using cursor H01RJ2 */
      pr_default.execute(0, new Object[] {AV70Emprcod, Integer.valueOf(AV82Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum), Integer.valueOf(AV83Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to), lV84Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom, AV85Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel, lV86Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir, AV87Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel, lV88Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob, AV89Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel, lV90Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo, AV91Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel, lV92Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2, AV93Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel, lV94Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif, AV95Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel, lV96Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf, AV97Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel, lV98Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx, AV99Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel, lV100Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax, AV101Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel, lV102Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail, AV103Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel, lV104Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod, AV105Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel, lV106Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc, AV107Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel, Byte.valueOf(AV108Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto), Byte.valueOf(AV109Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to), Integer.valueOf(AV110Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag), Integer.valueOf(AV111Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to), Integer.valueOf(AV112Stocksquimicos_listadodeproveedores_wcds_32_tfprvper), Integer.valueOf(AV113Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to), lV114Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep, AV115Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel, Short.valueOf(AV116Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent), Short.valueOf(AV117Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to), lV119Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta, AV120Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel, Integer.valueOf(AV71PrvNumFrom), Integer.valueOf(AV72PrvNumTo)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = H01RJ2_A396EmprCod[0] ;
         A783PrvCta = H01RJ2_A783PrvCta[0] ;
         n783PrvCta = H01RJ2_n783PrvCta[0] ;
         A792PrvMetTra = H01RJ2_A792PrvMetTra[0] ;
         n792PrvMetTra = H01RJ2_n792PrvMetTra[0] ;
         A798PrvPlaEnt = H01RJ2_A798PrvPlaEnt[0] ;
         n798PrvPlaEnt = H01RJ2_n798PrvPlaEnt[0] ;
         A801PrvRep = H01RJ2_A801PrvRep[0] ;
         n801PrvRep = H01RJ2_n801PrvRep[0] ;
         A797PrvPer = H01RJ2_A797PrvPer[0] ;
         n797PrvPer = H01RJ2_n797PrvPer[0] ;
         A785PrvDiaPag = H01RJ2_A785PrvDiaPag[0] ;
         n785PrvDiaPag = H01RJ2_n785PrvDiaPag[0] ;
         A805PrvVto = H01RJ2_A805PrvVto[0] ;
         n805PrvVto = H01RJ2_n805PrvVto[0] ;
         A498FpgDsc = H01RJ2_A498FpgDsc[0] ;
         n498FpgDsc = H01RJ2_n498FpgDsc[0] ;
         A497FpgCod = H01RJ2_A497FpgCod[0] ;
         n497FpgCod = H01RJ2_n497FpgCod[0] ;
         A6077PrvMail = H01RJ2_A6077PrvMail[0] ;
         n6077PrvMail = H01RJ2_n6077PrvMail[0] ;
         A6076PrvFax = H01RJ2_A6076PrvFax[0] ;
         n6076PrvFax = H01RJ2_n6076PrvFax[0] ;
         A804PrvTlx = H01RJ2_A804PrvTlx[0] ;
         n804PrvTlx = H01RJ2_n804PrvTlx[0] ;
         A803PrvTlf = H01RJ2_A803PrvTlf[0] ;
         n803PrvTlf = H01RJ2_n803PrvTlf[0] ;
         A793PrvNif = H01RJ2_A793PrvNif[0] ;
         n793PrvNif = H01RJ2_n793PrvNif[0] ;
         A6075PrvCp2 = H01RJ2_A6075PrvCp2[0] ;
         n6075PrvCp2 = H01RJ2_n6075PrvCp2[0] ;
         A782PrvCpo = H01RJ2_A782PrvCpo[0] ;
         n782PrvCpo = H01RJ2_n782PrvCpo[0] ;
         A799PrvPob = H01RJ2_A799PrvPob[0] ;
         n799PrvPob = H01RJ2_n799PrvPob[0] ;
         A786PrvDir = H01RJ2_A786PrvDir[0] ;
         n786PrvDir = H01RJ2_n786PrvDir[0] ;
         A794PrvNom = H01RJ2_A794PrvNom[0] ;
         n794PrvNom = H01RJ2_n794PrvNom[0] ;
         A795PrvNum = H01RJ2_A795PrvNum[0] ;
         A498FpgDsc = H01RJ2_A498FpgDsc[0] ;
         n498FpgDsc = H01RJ2_n498FpgDsc[0] ;
         if ( (GXutil.strcmp("", AV81Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV81Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV81Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A786PrvDir) , GXutil.padr( "%" + GXutil.upper( AV81Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A799PrvPob) , GXutil.padr( "%" + GXutil.upper( AV81Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A782PrvCpo) , GXutil.padr( "%" + GXutil.upper( AV81Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6075PrvCp2) , GXutil.padr( "%" + GXutil.upper( AV81Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A793PrvNif) , GXutil.padr( "%" + GXutil.upper( AV81Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A803PrvTlf) , GXutil.padr( "%" + GXutil.upper( AV81Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A804PrvTlx) , GXutil.padr( "%" + GXutil.upper( AV81Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6076PrvFax) , GXutil.padr( "%" + GXutil.upper( AV81Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6077PrvMail) , GXutil.padr( "%" + GXutil.upper( AV81Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A497FpgCod) , GXutil.padr( "%" + GXutil.upper( AV81Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A498FpgDsc) , GXutil.padr( "%" + GXutil.upper( AV81Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A805PrvVto, 2, 0) , GXutil.padr( "%" + AV81Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A785PrvDiaPag, 6, 0) , GXutil.padr( "%" + AV81Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A797PrvPer, 6, 0) , GXutil.padr( "%" + AV81Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A801PrvRep) , GXutil.padr( "%" + GXutil.upper( AV81Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A798PrvPlaEnt, 3, 0) , GXutil.padr( "%" + AV81Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "su transporte", "") , GXutil.padr( "%" + GXutil.lower( AV81Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, "S") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "nuestro", "") , GXutil.padr( "%" + GXutil.lower( AV81Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, "N") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "agencia", "") , GXutil.padr( "%" + GXutil.lower( AV81Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, "A") == 0 ) ) || ( GXutil.like( GXutil.upper( A783PrvCta) , GXutil.padr( "%" + GXutil.upper( AV81Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
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

   public void rf1RJ2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(43) ;
      /* Execute user event: Refresh */
      e201RJ2 ();
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
                                              A792PrvMetTra ,
                                              AV118Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels ,
                                              Integer.valueOf(AV82Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum) ,
                                              Integer.valueOf(AV83Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to) ,
                                              AV85Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel ,
                                              AV84Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom ,
                                              AV87Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel ,
                                              AV86Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir ,
                                              AV89Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel ,
                                              AV88Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob ,
                                              AV91Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel ,
                                              AV90Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo ,
                                              AV93Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel ,
                                              AV92Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 ,
                                              AV95Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel ,
                                              AV94Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif ,
                                              AV97Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel ,
                                              AV96Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf ,
                                              AV99Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel ,
                                              AV98Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx ,
                                              AV101Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel ,
                                              AV100Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax ,
                                              AV103Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel ,
                                              AV102Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail ,
                                              AV105Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel ,
                                              AV104Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod ,
                                              AV107Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel ,
                                              AV106Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc ,
                                              Byte.valueOf(AV108Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto) ,
                                              Byte.valueOf(AV109Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to) ,
                                              Integer.valueOf(AV110Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag) ,
                                              Integer.valueOf(AV111Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to) ,
                                              Integer.valueOf(AV112Stocksquimicos_listadodeproveedores_wcds_32_tfprvper) ,
                                              Integer.valueOf(AV113Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to) ,
                                              AV115Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel ,
                                              AV114Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep ,
                                              Short.valueOf(AV116Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent) ,
                                              Short.valueOf(AV117Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to) ,
                                              Integer.valueOf(AV118Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels.size()) ,
                                              AV120Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel ,
                                              AV119Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta ,
                                              Integer.valueOf(AV71PrvNumFrom) ,
                                              Integer.valueOf(AV72PrvNumTo) ,
                                              Integer.valueOf(A795PrvNum) ,
                                              A794PrvNom ,
                                              A786PrvDir ,
                                              A799PrvPob ,
                                              A782PrvCpo ,
                                              A6075PrvCp2 ,
                                              A793PrvNif ,
                                              A803PrvTlf ,
                                              A804PrvTlx ,
                                              A6076PrvFax ,
                                              A6077PrvMail ,
                                              A497FpgCod ,
                                              A498FpgDsc ,
                                              Byte.valueOf(A805PrvVto) ,
                                              Integer.valueOf(A785PrvDiaPag) ,
                                              Integer.valueOf(A797PrvPer) ,
                                              A801PrvRep ,
                                              Short.valueOf(A798PrvPlaEnt) ,
                                              A783PrvCta ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV81Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext ,
                                              AV70Emprcod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN,
                                              TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                              TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV84Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom = GXutil.padr( GXutil.rtrim( AV84Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom), 30, "%") ;
         lV86Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir = GXutil.padr( GXutil.rtrim( AV86Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir), 30, "%") ;
         lV88Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob = GXutil.padr( GXutil.rtrim( AV88Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob), 30, "%") ;
         lV90Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo = GXutil.padr( GXutil.rtrim( AV90Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo), 6, "%") ;
         lV92Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 = GXutil.padr( GXutil.rtrim( AV92Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2), 6, "%") ;
         lV94Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif = GXutil.padr( GXutil.rtrim( AV94Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif), 20, "%") ;
         lV96Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf = GXutil.padr( GXutil.rtrim( AV96Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf), 18, "%") ;
         lV98Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx = GXutil.padr( GXutil.rtrim( AV98Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx), 14, "%") ;
         lV100Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax = GXutil.padr( GXutil.rtrim( AV100Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax), 15, "%") ;
         lV102Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail = GXutil.padr( GXutil.rtrim( AV102Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail), 40, "%") ;
         lV104Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod = GXutil.padr( GXutil.rtrim( AV104Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod), 2, "%") ;
         lV106Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc = GXutil.padr( GXutil.rtrim( AV106Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc), 30, "%") ;
         lV114Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep = GXutil.padr( GXutil.rtrim( AV114Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep), 20, "%") ;
         lV119Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta = GXutil.padr( GXutil.rtrim( AV119Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta), 12, "%") ;
         /* Using cursor H01RJ3 */
         pr_default.execute(1, new Object[] {AV70Emprcod, Integer.valueOf(AV82Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum), Integer.valueOf(AV83Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to), lV84Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom, AV85Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel, lV86Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir, AV87Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel, lV88Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob, AV89Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel, lV90Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo, AV91Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel, lV92Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2, AV93Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel, lV94Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif, AV95Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel, lV96Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf, AV97Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel, lV98Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx, AV99Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel, lV100Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax, AV101Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel, lV102Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail, AV103Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel, lV104Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod, AV105Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel, lV106Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc, AV107Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel, Byte.valueOf(AV108Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto), Byte.valueOf(AV109Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to), Integer.valueOf(AV110Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag), Integer.valueOf(AV111Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to), Integer.valueOf(AV112Stocksquimicos_listadodeproveedores_wcds_32_tfprvper), Integer.valueOf(AV113Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to), lV114Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep, AV115Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel, Short.valueOf(AV116Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent), Short.valueOf(AV117Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to), lV119Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta, AV120Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel, Integer.valueOf(AV71PrvNumFrom), Integer.valueOf(AV72PrvNumTo)});
         nGXsfl_43_idx = 1 ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_432( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H01RJ3_A396EmprCod[0] ;
            A783PrvCta = H01RJ3_A783PrvCta[0] ;
            n783PrvCta = H01RJ3_n783PrvCta[0] ;
            A792PrvMetTra = H01RJ3_A792PrvMetTra[0] ;
            n792PrvMetTra = H01RJ3_n792PrvMetTra[0] ;
            A798PrvPlaEnt = H01RJ3_A798PrvPlaEnt[0] ;
            n798PrvPlaEnt = H01RJ3_n798PrvPlaEnt[0] ;
            A801PrvRep = H01RJ3_A801PrvRep[0] ;
            n801PrvRep = H01RJ3_n801PrvRep[0] ;
            A797PrvPer = H01RJ3_A797PrvPer[0] ;
            n797PrvPer = H01RJ3_n797PrvPer[0] ;
            A785PrvDiaPag = H01RJ3_A785PrvDiaPag[0] ;
            n785PrvDiaPag = H01RJ3_n785PrvDiaPag[0] ;
            A805PrvVto = H01RJ3_A805PrvVto[0] ;
            n805PrvVto = H01RJ3_n805PrvVto[0] ;
            A498FpgDsc = H01RJ3_A498FpgDsc[0] ;
            n498FpgDsc = H01RJ3_n498FpgDsc[0] ;
            A497FpgCod = H01RJ3_A497FpgCod[0] ;
            n497FpgCod = H01RJ3_n497FpgCod[0] ;
            A6077PrvMail = H01RJ3_A6077PrvMail[0] ;
            n6077PrvMail = H01RJ3_n6077PrvMail[0] ;
            A6076PrvFax = H01RJ3_A6076PrvFax[0] ;
            n6076PrvFax = H01RJ3_n6076PrvFax[0] ;
            A804PrvTlx = H01RJ3_A804PrvTlx[0] ;
            n804PrvTlx = H01RJ3_n804PrvTlx[0] ;
            A803PrvTlf = H01RJ3_A803PrvTlf[0] ;
            n803PrvTlf = H01RJ3_n803PrvTlf[0] ;
            A793PrvNif = H01RJ3_A793PrvNif[0] ;
            n793PrvNif = H01RJ3_n793PrvNif[0] ;
            A6075PrvCp2 = H01RJ3_A6075PrvCp2[0] ;
            n6075PrvCp2 = H01RJ3_n6075PrvCp2[0] ;
            A782PrvCpo = H01RJ3_A782PrvCpo[0] ;
            n782PrvCpo = H01RJ3_n782PrvCpo[0] ;
            A799PrvPob = H01RJ3_A799PrvPob[0] ;
            n799PrvPob = H01RJ3_n799PrvPob[0] ;
            A786PrvDir = H01RJ3_A786PrvDir[0] ;
            n786PrvDir = H01RJ3_n786PrvDir[0] ;
            A794PrvNom = H01RJ3_A794PrvNom[0] ;
            n794PrvNom = H01RJ3_n794PrvNom[0] ;
            A795PrvNum = H01RJ3_A795PrvNum[0] ;
            A498FpgDsc = H01RJ3_A498FpgDsc[0] ;
            n498FpgDsc = H01RJ3_n498FpgDsc[0] ;
            if ( (GXutil.strcmp("", AV81Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV81Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV81Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A786PrvDir) , GXutil.padr( "%" + GXutil.upper( AV81Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A799PrvPob) , GXutil.padr( "%" + GXutil.upper( AV81Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A782PrvCpo) , GXutil.padr( "%" + GXutil.upper( AV81Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6075PrvCp2) , GXutil.padr( "%" + GXutil.upper( AV81Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A793PrvNif) , GXutil.padr( "%" + GXutil.upper( AV81Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A803PrvTlf) , GXutil.padr( "%" + GXutil.upper( AV81Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A804PrvTlx) , GXutil.padr( "%" + GXutil.upper( AV81Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6076PrvFax) , GXutil.padr( "%" + GXutil.upper( AV81Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6077PrvMail) , GXutil.padr( "%" + GXutil.upper( AV81Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A497FpgCod) , GXutil.padr( "%" + GXutil.upper( AV81Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A498FpgDsc) , GXutil.padr( "%" + GXutil.upper( AV81Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A805PrvVto, 2, 0) , GXutil.padr( "%" + AV81Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A785PrvDiaPag, 6, 0) , GXutil.padr( "%" + AV81Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A797PrvPer, 6, 0) , GXutil.padr( "%" + AV81Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A801PrvRep) , GXutil.padr( "%" + GXutil.upper( AV81Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A798PrvPlaEnt, 3, 0) , GXutil.padr( "%" + AV81Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "su transporte", "") , GXutil.padr( "%" + GXutil.lower( AV81Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, "S") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "nuestro", "") , GXutil.padr( "%" + GXutil.lower( AV81Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, "N") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "agencia", "") , GXutil.padr( "%" + GXutil.lower( AV81Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, "A") == 0 ) ) || ( GXutil.like( GXutil.upper( A783PrvCta) , GXutil.padr( "%" + GXutil.upper( AV81Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
            {
               e211RJ2 ();
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(43) ;
         wb1RJ0( ) ;
      }
      bGXsfl_43_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1RJ2( )
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
      AV81Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext = AV15FilterFullText ;
      AV82Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum = AV26TFPrvNum ;
      AV83Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to = AV27TFPrvNum_To ;
      AV84Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom = AV28TFPrvNom ;
      AV85Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel = AV29TFPrvNom_Sel ;
      AV86Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir = AV30TFPrvDir ;
      AV87Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel = AV31TFPrvDir_Sel ;
      AV88Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob = AV32TFPrvPob ;
      AV89Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel = AV33TFPrvPob_Sel ;
      AV90Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo = AV34TFPrvCpo ;
      AV91Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel = AV35TFPrvCpo_Sel ;
      AV92Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 = AV36TFPrvCp2 ;
      AV93Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel = AV37TFPrvCp2_Sel ;
      AV94Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif = AV38TFPrvNif ;
      AV95Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel = AV39TFPrvNif_Sel ;
      AV96Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf = AV40TFPrvTlf ;
      AV97Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel = AV41TFPrvTlf_Sel ;
      AV98Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx = AV42TFPrvTlx ;
      AV99Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel = AV43TFPrvTlx_Sel ;
      AV100Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax = AV44TFPrvFax ;
      AV101Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel = AV45TFPrvFax_Sel ;
      AV102Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail = AV46TFPrvMail ;
      AV103Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel = AV47TFPrvMail_Sel ;
      AV104Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod = AV48TFFpgCod ;
      AV105Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel = AV49TFFpgCod_Sel ;
      AV106Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc = AV50TFFpgDsc ;
      AV107Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel = AV51TFFpgDsc_Sel ;
      AV108Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto = AV52TFPrvVto ;
      AV109Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to = AV53TFPrvVto_To ;
      AV110Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag = AV54TFPrvDiaPag ;
      AV111Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to = AV55TFPrvDiaPag_To ;
      AV112Stocksquimicos_listadodeproveedores_wcds_32_tfprvper = AV56TFPrvPer ;
      AV113Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to = AV57TFPrvPer_To ;
      AV114Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep = AV58TFPrvRep ;
      AV115Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel = AV59TFPrvRep_Sel ;
      AV116Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent = AV60TFPrvPlaEnt ;
      AV117Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to = AV61TFPrvPlaEnt_To ;
      AV118Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels = AV63TFPrvMetTra_Sels ;
      AV119Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta = AV64TFPrvCta ;
      AV120Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel = AV65TFPrvCta_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV70Emprcod, AV71PrvNumFrom, AV72PrvNumTo, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFPrvNum, AV27TFPrvNum_To, AV28TFPrvNom, AV29TFPrvNom_Sel, AV30TFPrvDir, AV31TFPrvDir_Sel, AV32TFPrvPob, AV33TFPrvPob_Sel, AV34TFPrvCpo, AV35TFPrvCpo_Sel, AV36TFPrvCp2, AV37TFPrvCp2_Sel, AV38TFPrvNif, AV39TFPrvNif_Sel, AV40TFPrvTlf, AV41TFPrvTlf_Sel, AV42TFPrvTlx, AV43TFPrvTlx_Sel, AV44TFPrvFax, AV45TFPrvFax_Sel, AV46TFPrvMail, AV47TFPrvMail_Sel, AV48TFFpgCod, AV49TFFpgCod_Sel, AV50TFFpgDsc, AV51TFFpgDsc_Sel, AV52TFPrvVto, AV53TFPrvVto_To, AV54TFPrvDiaPag, AV55TFPrvDiaPag_To, AV56TFPrvPer, AV57TFPrvPer_To, AV58TFPrvRep, AV59TFPrvRep_Sel, AV60TFPrvPlaEnt, AV61TFPrvPlaEnt_To, AV63TFPrvMetTra_Sels, AV64TFPrvCta, AV65TFPrvCta_Sel, AV77Pgmname, AV12OrderedBy, AV13OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV81Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext = AV15FilterFullText ;
      AV82Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum = AV26TFPrvNum ;
      AV83Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to = AV27TFPrvNum_To ;
      AV84Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom = AV28TFPrvNom ;
      AV85Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel = AV29TFPrvNom_Sel ;
      AV86Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir = AV30TFPrvDir ;
      AV87Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel = AV31TFPrvDir_Sel ;
      AV88Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob = AV32TFPrvPob ;
      AV89Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel = AV33TFPrvPob_Sel ;
      AV90Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo = AV34TFPrvCpo ;
      AV91Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel = AV35TFPrvCpo_Sel ;
      AV92Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 = AV36TFPrvCp2 ;
      AV93Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel = AV37TFPrvCp2_Sel ;
      AV94Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif = AV38TFPrvNif ;
      AV95Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel = AV39TFPrvNif_Sel ;
      AV96Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf = AV40TFPrvTlf ;
      AV97Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel = AV41TFPrvTlf_Sel ;
      AV98Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx = AV42TFPrvTlx ;
      AV99Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel = AV43TFPrvTlx_Sel ;
      AV100Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax = AV44TFPrvFax ;
      AV101Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel = AV45TFPrvFax_Sel ;
      AV102Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail = AV46TFPrvMail ;
      AV103Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel = AV47TFPrvMail_Sel ;
      AV104Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod = AV48TFFpgCod ;
      AV105Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel = AV49TFFpgCod_Sel ;
      AV106Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc = AV50TFFpgDsc ;
      AV107Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel = AV51TFFpgDsc_Sel ;
      AV108Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto = AV52TFPrvVto ;
      AV109Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to = AV53TFPrvVto_To ;
      AV110Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag = AV54TFPrvDiaPag ;
      AV111Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to = AV55TFPrvDiaPag_To ;
      AV112Stocksquimicos_listadodeproveedores_wcds_32_tfprvper = AV56TFPrvPer ;
      AV113Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to = AV57TFPrvPer_To ;
      AV114Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep = AV58TFPrvRep ;
      AV115Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel = AV59TFPrvRep_Sel ;
      AV116Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent = AV60TFPrvPlaEnt ;
      AV117Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to = AV61TFPrvPlaEnt_To ;
      AV118Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels = AV63TFPrvMetTra_Sels ;
      AV119Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta = AV64TFPrvCta ;
      AV120Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel = AV65TFPrvCta_Sel ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV70Emprcod, AV71PrvNumFrom, AV72PrvNumTo, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFPrvNum, AV27TFPrvNum_To, AV28TFPrvNom, AV29TFPrvNom_Sel, AV30TFPrvDir, AV31TFPrvDir_Sel, AV32TFPrvPob, AV33TFPrvPob_Sel, AV34TFPrvCpo, AV35TFPrvCpo_Sel, AV36TFPrvCp2, AV37TFPrvCp2_Sel, AV38TFPrvNif, AV39TFPrvNif_Sel, AV40TFPrvTlf, AV41TFPrvTlf_Sel, AV42TFPrvTlx, AV43TFPrvTlx_Sel, AV44TFPrvFax, AV45TFPrvFax_Sel, AV46TFPrvMail, AV47TFPrvMail_Sel, AV48TFFpgCod, AV49TFFpgCod_Sel, AV50TFFpgDsc, AV51TFFpgDsc_Sel, AV52TFPrvVto, AV53TFPrvVto_To, AV54TFPrvDiaPag, AV55TFPrvDiaPag_To, AV56TFPrvPer, AV57TFPrvPer_To, AV58TFPrvRep, AV59TFPrvRep_Sel, AV60TFPrvPlaEnt, AV61TFPrvPlaEnt_To, AV63TFPrvMetTra_Sels, AV64TFPrvCta, AV65TFPrvCta_Sel, AV77Pgmname, AV12OrderedBy, AV13OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV81Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext = AV15FilterFullText ;
      AV82Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum = AV26TFPrvNum ;
      AV83Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to = AV27TFPrvNum_To ;
      AV84Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom = AV28TFPrvNom ;
      AV85Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel = AV29TFPrvNom_Sel ;
      AV86Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir = AV30TFPrvDir ;
      AV87Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel = AV31TFPrvDir_Sel ;
      AV88Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob = AV32TFPrvPob ;
      AV89Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel = AV33TFPrvPob_Sel ;
      AV90Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo = AV34TFPrvCpo ;
      AV91Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel = AV35TFPrvCpo_Sel ;
      AV92Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 = AV36TFPrvCp2 ;
      AV93Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel = AV37TFPrvCp2_Sel ;
      AV94Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif = AV38TFPrvNif ;
      AV95Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel = AV39TFPrvNif_Sel ;
      AV96Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf = AV40TFPrvTlf ;
      AV97Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel = AV41TFPrvTlf_Sel ;
      AV98Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx = AV42TFPrvTlx ;
      AV99Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel = AV43TFPrvTlx_Sel ;
      AV100Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax = AV44TFPrvFax ;
      AV101Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel = AV45TFPrvFax_Sel ;
      AV102Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail = AV46TFPrvMail ;
      AV103Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel = AV47TFPrvMail_Sel ;
      AV104Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod = AV48TFFpgCod ;
      AV105Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel = AV49TFFpgCod_Sel ;
      AV106Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc = AV50TFFpgDsc ;
      AV107Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel = AV51TFFpgDsc_Sel ;
      AV108Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto = AV52TFPrvVto ;
      AV109Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to = AV53TFPrvVto_To ;
      AV110Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag = AV54TFPrvDiaPag ;
      AV111Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to = AV55TFPrvDiaPag_To ;
      AV112Stocksquimicos_listadodeproveedores_wcds_32_tfprvper = AV56TFPrvPer ;
      AV113Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to = AV57TFPrvPer_To ;
      AV114Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep = AV58TFPrvRep ;
      AV115Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel = AV59TFPrvRep_Sel ;
      AV116Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent = AV60TFPrvPlaEnt ;
      AV117Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to = AV61TFPrvPlaEnt_To ;
      AV118Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels = AV63TFPrvMetTra_Sels ;
      AV119Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta = AV64TFPrvCta ;
      AV120Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel = AV65TFPrvCta_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV70Emprcod, AV71PrvNumFrom, AV72PrvNumTo, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFPrvNum, AV27TFPrvNum_To, AV28TFPrvNom, AV29TFPrvNom_Sel, AV30TFPrvDir, AV31TFPrvDir_Sel, AV32TFPrvPob, AV33TFPrvPob_Sel, AV34TFPrvCpo, AV35TFPrvCpo_Sel, AV36TFPrvCp2, AV37TFPrvCp2_Sel, AV38TFPrvNif, AV39TFPrvNif_Sel, AV40TFPrvTlf, AV41TFPrvTlf_Sel, AV42TFPrvTlx, AV43TFPrvTlx_Sel, AV44TFPrvFax, AV45TFPrvFax_Sel, AV46TFPrvMail, AV47TFPrvMail_Sel, AV48TFFpgCod, AV49TFFpgCod_Sel, AV50TFFpgDsc, AV51TFFpgDsc_Sel, AV52TFPrvVto, AV53TFPrvVto_To, AV54TFPrvDiaPag, AV55TFPrvDiaPag_To, AV56TFPrvPer, AV57TFPrvPer_To, AV58TFPrvRep, AV59TFPrvRep_Sel, AV60TFPrvPlaEnt, AV61TFPrvPlaEnt_To, AV63TFPrvMetTra_Sels, AV64TFPrvCta, AV65TFPrvCta_Sel, AV77Pgmname, AV12OrderedBy, AV13OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV81Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext = AV15FilterFullText ;
      AV82Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum = AV26TFPrvNum ;
      AV83Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to = AV27TFPrvNum_To ;
      AV84Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom = AV28TFPrvNom ;
      AV85Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel = AV29TFPrvNom_Sel ;
      AV86Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir = AV30TFPrvDir ;
      AV87Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel = AV31TFPrvDir_Sel ;
      AV88Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob = AV32TFPrvPob ;
      AV89Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel = AV33TFPrvPob_Sel ;
      AV90Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo = AV34TFPrvCpo ;
      AV91Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel = AV35TFPrvCpo_Sel ;
      AV92Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 = AV36TFPrvCp2 ;
      AV93Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel = AV37TFPrvCp2_Sel ;
      AV94Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif = AV38TFPrvNif ;
      AV95Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel = AV39TFPrvNif_Sel ;
      AV96Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf = AV40TFPrvTlf ;
      AV97Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel = AV41TFPrvTlf_Sel ;
      AV98Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx = AV42TFPrvTlx ;
      AV99Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel = AV43TFPrvTlx_Sel ;
      AV100Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax = AV44TFPrvFax ;
      AV101Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel = AV45TFPrvFax_Sel ;
      AV102Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail = AV46TFPrvMail ;
      AV103Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel = AV47TFPrvMail_Sel ;
      AV104Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod = AV48TFFpgCod ;
      AV105Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel = AV49TFFpgCod_Sel ;
      AV106Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc = AV50TFFpgDsc ;
      AV107Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel = AV51TFFpgDsc_Sel ;
      AV108Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto = AV52TFPrvVto ;
      AV109Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to = AV53TFPrvVto_To ;
      AV110Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag = AV54TFPrvDiaPag ;
      AV111Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to = AV55TFPrvDiaPag_To ;
      AV112Stocksquimicos_listadodeproveedores_wcds_32_tfprvper = AV56TFPrvPer ;
      AV113Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to = AV57TFPrvPer_To ;
      AV114Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep = AV58TFPrvRep ;
      AV115Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel = AV59TFPrvRep_Sel ;
      AV116Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent = AV60TFPrvPlaEnt ;
      AV117Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to = AV61TFPrvPlaEnt_To ;
      AV118Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels = AV63TFPrvMetTra_Sels ;
      AV119Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta = AV64TFPrvCta ;
      AV120Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel = AV65TFPrvCta_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV70Emprcod, AV71PrvNumFrom, AV72PrvNumTo, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFPrvNum, AV27TFPrvNum_To, AV28TFPrvNom, AV29TFPrvNom_Sel, AV30TFPrvDir, AV31TFPrvDir_Sel, AV32TFPrvPob, AV33TFPrvPob_Sel, AV34TFPrvCpo, AV35TFPrvCpo_Sel, AV36TFPrvCp2, AV37TFPrvCp2_Sel, AV38TFPrvNif, AV39TFPrvNif_Sel, AV40TFPrvTlf, AV41TFPrvTlf_Sel, AV42TFPrvTlx, AV43TFPrvTlx_Sel, AV44TFPrvFax, AV45TFPrvFax_Sel, AV46TFPrvMail, AV47TFPrvMail_Sel, AV48TFFpgCod, AV49TFFpgCod_Sel, AV50TFFpgDsc, AV51TFFpgDsc_Sel, AV52TFPrvVto, AV53TFPrvVto_To, AV54TFPrvDiaPag, AV55TFPrvDiaPag_To, AV56TFPrvPer, AV57TFPrvPer_To, AV58TFPrvRep, AV59TFPrvRep_Sel, AV60TFPrvPlaEnt, AV61TFPrvPlaEnt_To, AV63TFPrvMetTra_Sels, AV64TFPrvCta, AV65TFPrvCta_Sel, AV77Pgmname, AV12OrderedBy, AV13OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV81Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext = AV15FilterFullText ;
      AV82Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum = AV26TFPrvNum ;
      AV83Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to = AV27TFPrvNum_To ;
      AV84Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom = AV28TFPrvNom ;
      AV85Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel = AV29TFPrvNom_Sel ;
      AV86Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir = AV30TFPrvDir ;
      AV87Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel = AV31TFPrvDir_Sel ;
      AV88Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob = AV32TFPrvPob ;
      AV89Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel = AV33TFPrvPob_Sel ;
      AV90Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo = AV34TFPrvCpo ;
      AV91Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel = AV35TFPrvCpo_Sel ;
      AV92Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 = AV36TFPrvCp2 ;
      AV93Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel = AV37TFPrvCp2_Sel ;
      AV94Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif = AV38TFPrvNif ;
      AV95Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel = AV39TFPrvNif_Sel ;
      AV96Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf = AV40TFPrvTlf ;
      AV97Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel = AV41TFPrvTlf_Sel ;
      AV98Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx = AV42TFPrvTlx ;
      AV99Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel = AV43TFPrvTlx_Sel ;
      AV100Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax = AV44TFPrvFax ;
      AV101Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel = AV45TFPrvFax_Sel ;
      AV102Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail = AV46TFPrvMail ;
      AV103Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel = AV47TFPrvMail_Sel ;
      AV104Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod = AV48TFFpgCod ;
      AV105Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel = AV49TFFpgCod_Sel ;
      AV106Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc = AV50TFFpgDsc ;
      AV107Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel = AV51TFFpgDsc_Sel ;
      AV108Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto = AV52TFPrvVto ;
      AV109Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to = AV53TFPrvVto_To ;
      AV110Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag = AV54TFPrvDiaPag ;
      AV111Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to = AV55TFPrvDiaPag_To ;
      AV112Stocksquimicos_listadodeproveedores_wcds_32_tfprvper = AV56TFPrvPer ;
      AV113Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to = AV57TFPrvPer_To ;
      AV114Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep = AV58TFPrvRep ;
      AV115Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel = AV59TFPrvRep_Sel ;
      AV116Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent = AV60TFPrvPlaEnt ;
      AV117Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to = AV61TFPrvPlaEnt_To ;
      AV118Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels = AV63TFPrvMetTra_Sels ;
      AV119Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta = AV64TFPrvCta ;
      AV120Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel = AV65TFPrvCta_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV70Emprcod, AV71PrvNumFrom, AV72PrvNumTo, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFPrvNum, AV27TFPrvNum_To, AV28TFPrvNom, AV29TFPrvNom_Sel, AV30TFPrvDir, AV31TFPrvDir_Sel, AV32TFPrvPob, AV33TFPrvPob_Sel, AV34TFPrvCpo, AV35TFPrvCpo_Sel, AV36TFPrvCp2, AV37TFPrvCp2_Sel, AV38TFPrvNif, AV39TFPrvNif_Sel, AV40TFPrvTlf, AV41TFPrvTlf_Sel, AV42TFPrvTlx, AV43TFPrvTlx_Sel, AV44TFPrvFax, AV45TFPrvFax_Sel, AV46TFPrvMail, AV47TFPrvMail_Sel, AV48TFFpgCod, AV49TFFpgCod_Sel, AV50TFFpgDsc, AV51TFFpgDsc_Sel, AV52TFPrvVto, AV53TFPrvVto_To, AV54TFPrvDiaPag, AV55TFPrvDiaPag_To, AV56TFPrvPer, AV57TFPrvPer_To, AV58TFPrvRep, AV59TFPrvRep_Sel, AV60TFPrvPlaEnt, AV61TFPrvPlaEnt_To, AV63TFPrvMetTra_Sels, AV64TFPrvCta, AV65TFPrvCta_Sel, AV77Pgmname, AV12OrderedBy, AV13OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV77Pgmname = "StocksQuimicos.ListadodeProveedores_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77Pgmname", AV77Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1RJ0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e191RJ2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV23ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV66DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV20ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_43 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_43"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV68GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV69GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV70Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV70Emprcod") ;
         wcpOAV71PrvNumFrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV71PrvNumFrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV72PrvNumTo = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV72PrvNumTo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Innewwindow1_Width = httpContext.cgiGet( sPrefix+"INNEWWINDOW1_Width") ;
         Innewwindow1_Height = httpContext.cgiGet( sPrefix+"INNEWWINDOW1_Height") ;
         Innewwindow1_Target = httpContext.cgiGet( sPrefix+"INNEWWINDOW1_Target") ;
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
         AV15FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
         AV77Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77Pgmname", AV77Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ListadodeProveedores_WC");
         AV77Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77Pgmname", AV77Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV77Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("stocksquimicos\\listadodeproveedores_wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e191RJ2 ();
      if (returnInSub) return;
   }

   public void e191RJ2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV78Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      listadodeproveedores_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV78Station = GXt_char1 ;
      GXv_char2[0] = AV70Emprcod ;
      GXv_char3[0] = AV79Emprnom ;
      GXv_char4[0] = AV80Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV78Station, GXv_char2, GXv_char3, GXv_char4) ;
      listadodeproveedores_wc_impl.this.AV70Emprcod = GXv_char2[0] ;
      listadodeproveedores_wc_impl.this.AV79Emprnom = GXv_char3[0] ;
      listadodeproveedores_wc_impl.this.AV80Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70Emprcod", AV70Emprcod);
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
      if ( AV12OrderedBy < 1 )
      {
         AV12OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV66DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV66DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e201RJ2( )
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
      if ( GXutil.strcmp(AV22Session.getValue("StocksQuimicos.ListadodeProveedores_WCColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV22Session.getValue("StocksQuimicos.ListadodeProveedores_WCColumnsSelector") ;
         AV20ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtPrvNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrvNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNum_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrvNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrvNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNom_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrvDir_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrvDir_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvDir_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrvPob_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrvPob_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvPob_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrvCpo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrvCpo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvCpo_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrvCp2_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrvCp2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvCp2_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrvNif_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrvNif_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNif_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrvTlf_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrvTlf_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvTlf_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrvTlx_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrvTlx_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvTlx_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrvFax_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrvFax_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvFax_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrvMail_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrvMail_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvMail_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtFpgCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFpgCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFpgCod_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtFpgDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFpgDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFpgDsc_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrvVto_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrvVto_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvVto_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrvDiaPag_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrvDiaPag_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvDiaPag_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrvPer_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrvPer_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvPer_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrvRep_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrvRep_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvRep_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrvPlaEnt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrvPlaEnt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvPlaEnt_Visible), 5, 0), !bGXsfl_43_Refreshing);
      cmbPrvMetTra.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbPrvMetTra.getInternalname(), "Visible", GXutil.ltrimstr( cmbPrvMetTra.getVisible(), 5, 0), !bGXsfl_43_Refreshing);
      edtPrvCta_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrvCta_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvCta_Visible), 5, 0), !bGXsfl_43_Refreshing);
      AV68GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68GridCurrentPage), 10, 0));
      AV69GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69GridPageCount), 10, 0));
      AV81Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext = AV15FilterFullText ;
      AV82Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum = AV26TFPrvNum ;
      AV83Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to = AV27TFPrvNum_To ;
      AV84Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom = AV28TFPrvNom ;
      AV85Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel = AV29TFPrvNom_Sel ;
      AV86Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir = AV30TFPrvDir ;
      AV87Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel = AV31TFPrvDir_Sel ;
      AV88Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob = AV32TFPrvPob ;
      AV89Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel = AV33TFPrvPob_Sel ;
      AV90Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo = AV34TFPrvCpo ;
      AV91Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel = AV35TFPrvCpo_Sel ;
      AV92Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 = AV36TFPrvCp2 ;
      AV93Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel = AV37TFPrvCp2_Sel ;
      AV94Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif = AV38TFPrvNif ;
      AV95Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel = AV39TFPrvNif_Sel ;
      AV96Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf = AV40TFPrvTlf ;
      AV97Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel = AV41TFPrvTlf_Sel ;
      AV98Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx = AV42TFPrvTlx ;
      AV99Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel = AV43TFPrvTlx_Sel ;
      AV100Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax = AV44TFPrvFax ;
      AV101Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel = AV45TFPrvFax_Sel ;
      AV102Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail = AV46TFPrvMail ;
      AV103Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel = AV47TFPrvMail_Sel ;
      AV104Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod = AV48TFFpgCod ;
      AV105Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel = AV49TFFpgCod_Sel ;
      AV106Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc = AV50TFFpgDsc ;
      AV107Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel = AV51TFFpgDsc_Sel ;
      AV108Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto = AV52TFPrvVto ;
      AV109Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to = AV53TFPrvVto_To ;
      AV110Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag = AV54TFPrvDiaPag ;
      AV111Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to = AV55TFPrvDiaPag_To ;
      AV112Stocksquimicos_listadodeproveedores_wcds_32_tfprvper = AV56TFPrvPer ;
      AV113Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to = AV57TFPrvPer_To ;
      AV114Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep = AV58TFPrvRep ;
      AV115Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel = AV59TFPrvRep_Sel ;
      AV116Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent = AV60TFPrvPlaEnt ;
      AV117Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to = AV61TFPrvPlaEnt_To ;
      AV118Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels = AV63TFPrvMetTra_Sels ;
      AV119Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta = AV64TFPrvCta ;
      AV120Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel = AV65TFPrvCta_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e121RJ2( )
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
         AV67PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV67PageToGo) ;
      }
   }

   public void e131RJ2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e141RJ2( )
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
            AV26TFPrvNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFPrvNum), 6, 0));
            AV27TFPrvNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFPrvNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFPrvNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvNom") == 0 )
         {
            AV28TFPrvNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFPrvNom", AV28TFPrvNom);
            AV29TFPrvNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFPrvNom_Sel", AV29TFPrvNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvDir") == 0 )
         {
            AV30TFPrvDir = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFPrvDir", AV30TFPrvDir);
            AV31TFPrvDir_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFPrvDir_Sel", AV31TFPrvDir_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvPob") == 0 )
         {
            AV32TFPrvPob = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFPrvPob", AV32TFPrvPob);
            AV33TFPrvPob_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFPrvPob_Sel", AV33TFPrvPob_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvCpo") == 0 )
         {
            AV34TFPrvCpo = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFPrvCpo", AV34TFPrvCpo);
            AV35TFPrvCpo_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFPrvCpo_Sel", AV35TFPrvCpo_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvCp2") == 0 )
         {
            AV36TFPrvCp2 = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFPrvCp2", AV36TFPrvCp2);
            AV37TFPrvCp2_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFPrvCp2_Sel", AV37TFPrvCp2_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvNif") == 0 )
         {
            AV38TFPrvNif = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFPrvNif", AV38TFPrvNif);
            AV39TFPrvNif_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFPrvNif_Sel", AV39TFPrvNif_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvTlf") == 0 )
         {
            AV40TFPrvTlf = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFPrvTlf", AV40TFPrvTlf);
            AV41TFPrvTlf_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFPrvTlf_Sel", AV41TFPrvTlf_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvTlx") == 0 )
         {
            AV42TFPrvTlx = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFPrvTlx", AV42TFPrvTlx);
            AV43TFPrvTlx_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFPrvTlx_Sel", AV43TFPrvTlx_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvFax") == 0 )
         {
            AV44TFPrvFax = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFPrvFax", AV44TFPrvFax);
            AV45TFPrvFax_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFPrvFax_Sel", AV45TFPrvFax_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvMail") == 0 )
         {
            AV46TFPrvMail = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFPrvMail", AV46TFPrvMail);
            AV47TFPrvMail_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFPrvMail_Sel", AV47TFPrvMail_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FpgCod") == 0 )
         {
            AV48TFFpgCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFFpgCod", AV48TFFpgCod);
            AV49TFFpgCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFFpgCod_Sel", AV49TFFpgCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FpgDsc") == 0 )
         {
            AV50TFFpgDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFFpgDsc", AV50TFFpgDsc);
            AV51TFFpgDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFFpgDsc_Sel", AV51TFFpgDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvVto") == 0 )
         {
            AV52TFPrvVto = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFPrvVto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52TFPrvVto), 2, 0));
            AV53TFPrvVto_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFPrvVto_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53TFPrvVto_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvDiaPag") == 0 )
         {
            AV54TFPrvDiaPag = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFPrvDiaPag", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFPrvDiaPag), 6, 0));
            AV55TFPrvDiaPag_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFPrvDiaPag_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFPrvDiaPag_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvPer") == 0 )
         {
            AV56TFPrvPer = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFPrvPer", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFPrvPer), 6, 0));
            AV57TFPrvPer_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFPrvPer_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TFPrvPer_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvRep") == 0 )
         {
            AV58TFPrvRep = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFPrvRep", AV58TFPrvRep);
            AV59TFPrvRep_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFPrvRep_Sel", AV59TFPrvRep_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvPlaEnt") == 0 )
         {
            AV60TFPrvPlaEnt = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFPrvPlaEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60TFPrvPlaEnt), 3, 0));
            AV61TFPrvPlaEnt_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFPrvPlaEnt_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61TFPrvPlaEnt_To), 3, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvMetTra") == 0 )
         {
            AV62TFPrvMetTra_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFPrvMetTra_SelsJson", AV62TFPrvMetTra_SelsJson);
            AV63TFPrvMetTra_Sels.fromJSonString(AV62TFPrvMetTra_SelsJson, null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvCta") == 0 )
         {
            AV64TFPrvCta = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFPrvCta", AV64TFPrvCta);
            AV65TFPrvCta_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFPrvCta_Sel", AV65TFPrvCta_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV63TFPrvMetTra_Sels", AV63TFPrvMetTra_Sels);
   }

   private void e211RJ2( )
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

   public void e151RJ2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV18ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV20ColumnsSelector.fromJSonString(AV18ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "StocksQuimicos.ListadodeProveedores_WCColumnsSelector", ((GXutil.strcmp("", AV18ColumnsSelectorXML)==0) ? "" : AV20ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e111RJ2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("StocksQuimicos.ListadodeProveedores_WCFilters")),GXutil.URLEncode(GXutil.rtrim(AV77Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("StocksQuimicos.ListadodeProveedores_WCFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV24ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "StocksQuimicos.ListadodeProveedores_WCFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         listadodeproveedores_wc_impl.this.GXt_char1 = GXv_char4[0] ;
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
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV77Pgmname+"GridState", AV24ManageFiltersXml) ;
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
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV63TFPrvMetTra_Sels", AV63TFPrvMetTra_Sels);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
   }

   public void e161RJ2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV16ExcelFilename ;
      GXv_char3[0] = AV17ErrorMessage ;
      new app.stocksquimicos.listadodeproveedores_wcexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      listadodeproveedores_wc_impl.this.AV16ExcelFilename = GXv_char4[0] ;
      listadodeproveedores_wc_impl.this.AV17ErrorMessage = GXv_char3[0] ;
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

   public void e181RJ2( )
   {
      /* 'DoExportReport' Routine */
      returnInSub = false ;
      if ( 1 == 0 )
      {
         Innewwindow1_Target = formatLink("app.stocksquimicos.listadodeproveedores_wcexportreport", new String[] {}, new String[] {})  ;
         ucInnewwindow1.sendProperty(context, sPrefix, false, Innewwindow1_Internalname, "Target", Innewwindow1_Target);
         Innewwindow1_Height = "600" ;
         ucInnewwindow1.sendProperty(context, sPrefix, false, Innewwindow1_Internalname, "Height", Innewwindow1_Height);
         Innewwindow1_Width = "800" ;
         ucInnewwindow1.sendProperty(context, sPrefix, false, Innewwindow1_Internalname, "Width", Innewwindow1_Width);
         this.executeUsercontrolMethod(sPrefix, false, "INNEWWINDOW1Container", "OpenWindow", "", new Object[] {});
      }
      httpContext.popup(formatLink("app.stocksquimicos.rst0028", new String[] {GXutil.URLEncode(GXutil.rtrim(AV70Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV73ImpCod)),GXutil.URLEncode(GXutil.ltrimstr(AV71PrvNumFrom,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV72PrvNumTo,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV74ImpTam,4,0))}, new String[] {"EmprCod","ImpCod","PPrvCod","UPrvCod","ImpTam"}) , new Object[] {"AV70Emprcod","AV73ImpCod","AV71PrvNumFrom","AV72PrvNumTo","AV74ImpTam"});
      /*  Sending Event outputs  */
   }

   public void e171RJ2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.stocksquimicos.listadodeproveedores_wcexportcsv", new String[] {}, new String[] {}) );
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrvNum", "", "Proveedor", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrvNom", "", "Nombre", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrvDir", "", "Direccion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrvPob", "", "Poblacion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrvCpo", "", "Codigo Postal", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrvCp2", "", "C. Postal 2", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrvNif", "", "N.I.F.", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrvTlf", "", "Telefonos", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrvTlx", "", "Telex", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrvFax", "", "Fax", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrvMail", "", "Mail", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "FpgCod", "", "Forma Pago", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "FpgDsc", "", "Descripcion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrvVto", "", "Nº Vtos.", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrvDiaPag", "", "Dias Pago", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrvPer", "", "Periodicidad", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrvRep", "", "Representante", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrvPlaEnt", "", "Dias Plazo Entrega", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrvMetTra", "", "Metodo Transporte", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrvCta", "", "Cuenta Contable", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV19UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "StocksQuimicos.ListadodeProveedores_WCColumnsSelector", GXv_char4) ;
      listadodeproveedores_wc_impl.this.GXt_char1 = GXv_char4[0] ;
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
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "StocksQuimicos.ListadodeProveedores_WCFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV23ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV15FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
      AV26TFPrvNum = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFPrvNum), 6, 0));
      AV27TFPrvNum_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFPrvNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFPrvNum_To), 6, 0));
      AV28TFPrvNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFPrvNom", AV28TFPrvNom);
      AV29TFPrvNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFPrvNom_Sel", AV29TFPrvNom_Sel);
      AV30TFPrvDir = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFPrvDir", AV30TFPrvDir);
      AV31TFPrvDir_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFPrvDir_Sel", AV31TFPrvDir_Sel);
      AV32TFPrvPob = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFPrvPob", AV32TFPrvPob);
      AV33TFPrvPob_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFPrvPob_Sel", AV33TFPrvPob_Sel);
      AV34TFPrvCpo = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFPrvCpo", AV34TFPrvCpo);
      AV35TFPrvCpo_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFPrvCpo_Sel", AV35TFPrvCpo_Sel);
      AV36TFPrvCp2 = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFPrvCp2", AV36TFPrvCp2);
      AV37TFPrvCp2_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFPrvCp2_Sel", AV37TFPrvCp2_Sel);
      AV38TFPrvNif = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFPrvNif", AV38TFPrvNif);
      AV39TFPrvNif_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFPrvNif_Sel", AV39TFPrvNif_Sel);
      AV40TFPrvTlf = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFPrvTlf", AV40TFPrvTlf);
      AV41TFPrvTlf_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFPrvTlf_Sel", AV41TFPrvTlf_Sel);
      AV42TFPrvTlx = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFPrvTlx", AV42TFPrvTlx);
      AV43TFPrvTlx_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFPrvTlx_Sel", AV43TFPrvTlx_Sel);
      AV44TFPrvFax = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFPrvFax", AV44TFPrvFax);
      AV45TFPrvFax_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFPrvFax_Sel", AV45TFPrvFax_Sel);
      AV46TFPrvMail = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFPrvMail", AV46TFPrvMail);
      AV47TFPrvMail_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFPrvMail_Sel", AV47TFPrvMail_Sel);
      AV48TFFpgCod = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFFpgCod", AV48TFFpgCod);
      AV49TFFpgCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFFpgCod_Sel", AV49TFFpgCod_Sel);
      AV50TFFpgDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFFpgDsc", AV50TFFpgDsc);
      AV51TFFpgDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFFpgDsc_Sel", AV51TFFpgDsc_Sel);
      AV52TFPrvVto = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFPrvVto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52TFPrvVto), 2, 0));
      AV53TFPrvVto_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFPrvVto_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53TFPrvVto_To), 2, 0));
      AV54TFPrvDiaPag = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFPrvDiaPag", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFPrvDiaPag), 6, 0));
      AV55TFPrvDiaPag_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFPrvDiaPag_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFPrvDiaPag_To), 6, 0));
      AV56TFPrvPer = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFPrvPer", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFPrvPer), 6, 0));
      AV57TFPrvPer_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFPrvPer_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TFPrvPer_To), 6, 0));
      AV58TFPrvRep = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFPrvRep", AV58TFPrvRep);
      AV59TFPrvRep_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFPrvRep_Sel", AV59TFPrvRep_Sel);
      AV60TFPrvPlaEnt = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFPrvPlaEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60TFPrvPlaEnt), 3, 0));
      AV61TFPrvPlaEnt_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFPrvPlaEnt_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61TFPrvPlaEnt_To), 3, 0));
      AV63TFPrvMetTra_Sels = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV64TFPrvCta = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFPrvCta", AV64TFPrvCta);
      AV65TFPrvCta_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFPrvCta_Sel", AV65TFPrvCta_Sel);
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
      if ( GXutil.strcmp(AV22Session.getValue(AV77Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV77Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV77Pgmname+"GridState"), null, null);
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
      AV121GXV1 = 1 ;
      while ( AV121GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV121GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV15FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNUM") == 0 )
         {
            AV26TFPrvNum = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFPrvNum), 6, 0));
            AV27TFPrvNum_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFPrvNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFPrvNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM") == 0 )
         {
            AV28TFPrvNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFPrvNom", AV28TFPrvNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM_SEL") == 0 )
         {
            AV29TFPrvNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFPrvNom_Sel", AV29TFPrvNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDIR") == 0 )
         {
            AV30TFPrvDir = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFPrvDir", AV30TFPrvDir);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDIR_SEL") == 0 )
         {
            AV31TFPrvDir_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFPrvDir_Sel", AV31TFPrvDir_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVPOB") == 0 )
         {
            AV32TFPrvPob = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFPrvPob", AV32TFPrvPob);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVPOB_SEL") == 0 )
         {
            AV33TFPrvPob_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFPrvPob_Sel", AV33TFPrvPob_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCPO") == 0 )
         {
            AV34TFPrvCpo = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFPrvCpo", AV34TFPrvCpo);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCPO_SEL") == 0 )
         {
            AV35TFPrvCpo_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFPrvCpo_Sel", AV35TFPrvCpo_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCP2") == 0 )
         {
            AV36TFPrvCp2 = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFPrvCp2", AV36TFPrvCp2);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCP2_SEL") == 0 )
         {
            AV37TFPrvCp2_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFPrvCp2_Sel", AV37TFPrvCp2_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNIF") == 0 )
         {
            AV38TFPrvNif = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFPrvNif", AV38TFPrvNif);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNIF_SEL") == 0 )
         {
            AV39TFPrvNif_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFPrvNif_Sel", AV39TFPrvNif_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVTLF") == 0 )
         {
            AV40TFPrvTlf = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFPrvTlf", AV40TFPrvTlf);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVTLF_SEL") == 0 )
         {
            AV41TFPrvTlf_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFPrvTlf_Sel", AV41TFPrvTlf_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVTLX") == 0 )
         {
            AV42TFPrvTlx = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFPrvTlx", AV42TFPrvTlx);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVTLX_SEL") == 0 )
         {
            AV43TFPrvTlx_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFPrvTlx_Sel", AV43TFPrvTlx_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVFAX") == 0 )
         {
            AV44TFPrvFax = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFPrvFax", AV44TFPrvFax);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVFAX_SEL") == 0 )
         {
            AV45TFPrvFax_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFPrvFax_Sel", AV45TFPrvFax_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVMAIL") == 0 )
         {
            AV46TFPrvMail = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFPrvMail", AV46TFPrvMail);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVMAIL_SEL") == 0 )
         {
            AV47TFPrvMail_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFPrvMail_Sel", AV47TFPrvMail_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFPGCOD") == 0 )
         {
            AV48TFFpgCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFFpgCod", AV48TFFpgCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFPGCOD_SEL") == 0 )
         {
            AV49TFFpgCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFFpgCod_Sel", AV49TFFpgCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFPGDSC") == 0 )
         {
            AV50TFFpgDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFFpgDsc", AV50TFFpgDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFPGDSC_SEL") == 0 )
         {
            AV51TFFpgDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFFpgDsc_Sel", AV51TFFpgDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVVTO") == 0 )
         {
            AV52TFPrvVto = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFPrvVto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52TFPrvVto), 2, 0));
            AV53TFPrvVto_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFPrvVto_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53TFPrvVto_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDIAPAG") == 0 )
         {
            AV54TFPrvDiaPag = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFPrvDiaPag", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFPrvDiaPag), 6, 0));
            AV55TFPrvDiaPag_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFPrvDiaPag_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFPrvDiaPag_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVPER") == 0 )
         {
            AV56TFPrvPer = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFPrvPer", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFPrvPer), 6, 0));
            AV57TFPrvPer_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFPrvPer_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TFPrvPer_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVREP") == 0 )
         {
            AV58TFPrvRep = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFPrvRep", AV58TFPrvRep);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVREP_SEL") == 0 )
         {
            AV59TFPrvRep_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFPrvRep_Sel", AV59TFPrvRep_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVPLAENT") == 0 )
         {
            AV60TFPrvPlaEnt = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFPrvPlaEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60TFPrvPlaEnt), 3, 0));
            AV61TFPrvPlaEnt_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFPrvPlaEnt_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61TFPrvPlaEnt_To), 3, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVMETTRA_SEL") == 0 )
         {
            AV62TFPrvMetTra_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFPrvMetTra_SelsJson", AV62TFPrvMetTra_SelsJson);
            AV63TFPrvMetTra_Sels.fromJSonString(AV62TFPrvMetTra_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCTA") == 0 )
         {
            AV64TFPrvCta = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFPrvCta", AV64TFPrvCta);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCTA_SEL") == 0 )
         {
            AV65TFPrvCta_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFPrvCta_Sel", AV65TFPrvCta_Sel);
         }
         AV121GXV1 = (int)(AV121GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV29TFPrvNom_Sel)==0), AV29TFPrvNom_Sel, GXv_char4) ;
      listadodeproveedores_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV31TFPrvDir_Sel)==0), AV31TFPrvDir_Sel, GXv_char3) ;
      listadodeproveedores_wc_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char2[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV33TFPrvPob_Sel)==0), AV33TFPrvPob_Sel, GXv_char2) ;
      listadodeproveedores_wc_impl.this.GXt_char13 = GXv_char2[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV35TFPrvCpo_Sel)==0), AV35TFPrvCpo_Sel, GXv_char15) ;
      listadodeproveedores_wc_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV37TFPrvCp2_Sel)==0), AV37TFPrvCp2_Sel, GXv_char17) ;
      listadodeproveedores_wc_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV39TFPrvNif_Sel)==0), AV39TFPrvNif_Sel, GXv_char19) ;
      listadodeproveedores_wc_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV41TFPrvTlf_Sel)==0), AV41TFPrvTlf_Sel, GXv_char21) ;
      listadodeproveedores_wc_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV43TFPrvTlx_Sel)==0), AV43TFPrvTlx_Sel, GXv_char23) ;
      listadodeproveedores_wc_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV45TFPrvFax_Sel)==0), AV45TFPrvFax_Sel, GXv_char25) ;
      listadodeproveedores_wc_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char26 = "" ;
      GXv_char27[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV47TFPrvMail_Sel)==0), AV47TFPrvMail_Sel, GXv_char27) ;
      listadodeproveedores_wc_impl.this.GXt_char26 = GXv_char27[0] ;
      GXt_char28 = "" ;
      GXv_char29[0] = GXt_char28 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV49TFFpgCod_Sel)==0), AV49TFFpgCod_Sel, GXv_char29) ;
      listadodeproveedores_wc_impl.this.GXt_char28 = GXv_char29[0] ;
      GXt_char30 = "" ;
      GXv_char31[0] = GXt_char30 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV51TFFpgDsc_Sel)==0), AV51TFFpgDsc_Sel, GXv_char31) ;
      listadodeproveedores_wc_impl.this.GXt_char30 = GXv_char31[0] ;
      GXt_char32 = "" ;
      GXv_char33[0] = GXt_char32 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV59TFPrvRep_Sel)==0), AV59TFPrvRep_Sel, GXv_char33) ;
      listadodeproveedores_wc_impl.this.GXt_char32 = GXv_char33[0] ;
      GXt_char34 = "" ;
      GXv_char35[0] = GXt_char34 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV63TFPrvMetTra_Sels.size()==0), AV62TFPrvMetTra_SelsJson, GXv_char35) ;
      listadodeproveedores_wc_impl.this.GXt_char34 = GXv_char35[0] ;
      GXt_char36 = "" ;
      GXv_char37[0] = GXt_char36 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV65TFPrvCta_Sel)==0), AV65TFPrvCta_Sel, GXv_char37) ;
      listadodeproveedores_wc_impl.this.GXt_char36 = GXv_char37[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|"+GXt_char12+"|"+GXt_char13+"|"+GXt_char14+"|"+GXt_char16+"|"+GXt_char18+"|"+GXt_char20+"|"+GXt_char22+"|"+GXt_char24+"|"+GXt_char26+"|"+GXt_char28+"|"+GXt_char30+"||||"+GXt_char32+"||"+GXt_char34+"|"+GXt_char36 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char36 = "" ;
      GXv_char37[0] = GXt_char36 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV28TFPrvNom)==0), AV28TFPrvNom, GXv_char37) ;
      listadodeproveedores_wc_impl.this.GXt_char36 = GXv_char37[0] ;
      GXt_char34 = "" ;
      GXv_char35[0] = GXt_char34 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV30TFPrvDir)==0), AV30TFPrvDir, GXv_char35) ;
      listadodeproveedores_wc_impl.this.GXt_char34 = GXv_char35[0] ;
      GXt_char32 = "" ;
      GXv_char33[0] = GXt_char32 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV32TFPrvPob)==0), AV32TFPrvPob, GXv_char33) ;
      listadodeproveedores_wc_impl.this.GXt_char32 = GXv_char33[0] ;
      GXt_char30 = "" ;
      GXv_char31[0] = GXt_char30 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV34TFPrvCpo)==0), AV34TFPrvCpo, GXv_char31) ;
      listadodeproveedores_wc_impl.this.GXt_char30 = GXv_char31[0] ;
      GXt_char28 = "" ;
      GXv_char29[0] = GXt_char28 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV36TFPrvCp2)==0), AV36TFPrvCp2, GXv_char29) ;
      listadodeproveedores_wc_impl.this.GXt_char28 = GXv_char29[0] ;
      GXt_char26 = "" ;
      GXv_char27[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV38TFPrvNif)==0), AV38TFPrvNif, GXv_char27) ;
      listadodeproveedores_wc_impl.this.GXt_char26 = GXv_char27[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV40TFPrvTlf)==0), AV40TFPrvTlf, GXv_char25) ;
      listadodeproveedores_wc_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV42TFPrvTlx)==0), AV42TFPrvTlx, GXv_char23) ;
      listadodeproveedores_wc_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV44TFPrvFax)==0), AV44TFPrvFax, GXv_char21) ;
      listadodeproveedores_wc_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV46TFPrvMail)==0), AV46TFPrvMail, GXv_char19) ;
      listadodeproveedores_wc_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV48TFFpgCod)==0), AV48TFFpgCod, GXv_char17) ;
      listadodeproveedores_wc_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV50TFFpgDsc)==0), AV50TFFpgDsc, GXv_char15) ;
      listadodeproveedores_wc_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV58TFPrvRep)==0), AV58TFPrvRep, GXv_char4) ;
      listadodeproveedores_wc_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV64TFPrvCta)==0), AV64TFPrvCta, GXv_char3) ;
      listadodeproveedores_wc_impl.this.GXt_char12 = GXv_char3[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV26TFPrvNum) ? "" : GXutil.str( AV26TFPrvNum, 6, 0))+"|"+GXt_char36+"|"+GXt_char34+"|"+GXt_char32+"|"+GXt_char30+"|"+GXt_char28+"|"+GXt_char26+"|"+GXt_char24+"|"+GXt_char22+"|"+GXt_char20+"|"+GXt_char18+"|"+GXt_char16+"|"+GXt_char14+"|"+((0==AV52TFPrvVto) ? "" : GXutil.str( AV52TFPrvVto, 2, 0))+"|"+((0==AV54TFPrvDiaPag) ? "" : GXutil.str( AV54TFPrvDiaPag, 6, 0))+"|"+((0==AV56TFPrvPer) ? "" : GXutil.str( AV56TFPrvPer, 6, 0))+"|"+GXt_char13+"|"+((0==AV60TFPrvPlaEnt) ? "" : GXutil.str( AV60TFPrvPlaEnt, 3, 0))+"||"+GXt_char12 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV27TFPrvNum_To) ? "" : GXutil.str( AV27TFPrvNum_To, 6, 0))+"|||||||||||||"+((0==AV53TFPrvVto_To) ? "" : GXutil.str( AV53TFPrvVto_To, 2, 0))+"|"+((0==AV55TFPrvDiaPag_To) ? "" : GXutil.str( AV55TFPrvDiaPag_To, 6, 0))+"|"+((0==AV57TFPrvPer_To) ? "" : GXutil.str( AV57TFPrvPer_To, 6, 0))+"||"+((0==AV61TFPrvPlaEnt_To) ? "" : GXutil.str( AV61TFPrvPlaEnt_To, 3, 0))+"||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV22Session.getValue(AV77Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState38, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV15FilterFullText)==0), (short)(0), AV15FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFPRVNUM", "", !((0==AV26TFPrvNum)&&(0==AV27TFPrvNum_To)), (short)(0), GXutil.trim( GXutil.str( AV26TFPrvNum, 6, 0)), GXutil.trim( GXutil.str( AV27TFPrvNum_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFPRVNOM", "", !(GXutil.strcmp("", AV28TFPrvNom)==0), (short)(0), AV28TFPrvNom, "", !(GXutil.strcmp("", AV29TFPrvNom_Sel)==0), AV29TFPrvNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFPRVDIR", "", !(GXutil.strcmp("", AV30TFPrvDir)==0), (short)(0), AV30TFPrvDir, "", !(GXutil.strcmp("", AV31TFPrvDir_Sel)==0), AV31TFPrvDir_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFPRVPOB", "", !(GXutil.strcmp("", AV32TFPrvPob)==0), (short)(0), AV32TFPrvPob, "", !(GXutil.strcmp("", AV33TFPrvPob_Sel)==0), AV33TFPrvPob_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFPRVCPO", "", !(GXutil.strcmp("", AV34TFPrvCpo)==0), (short)(0), AV34TFPrvCpo, "", !(GXutil.strcmp("", AV35TFPrvCpo_Sel)==0), AV35TFPrvCpo_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFPRVCP2", "", !(GXutil.strcmp("", AV36TFPrvCp2)==0), (short)(0), AV36TFPrvCp2, "", !(GXutil.strcmp("", AV37TFPrvCp2_Sel)==0), AV37TFPrvCp2_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFPRVNIF", "", !(GXutil.strcmp("", AV38TFPrvNif)==0), (short)(0), AV38TFPrvNif, "", !(GXutil.strcmp("", AV39TFPrvNif_Sel)==0), AV39TFPrvNif_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFPRVTLF", "", !(GXutil.strcmp("", AV40TFPrvTlf)==0), (short)(0), AV40TFPrvTlf, "", !(GXutil.strcmp("", AV41TFPrvTlf_Sel)==0), AV41TFPrvTlf_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFPRVTLX", "", !(GXutil.strcmp("", AV42TFPrvTlx)==0), (short)(0), AV42TFPrvTlx, "", !(GXutil.strcmp("", AV43TFPrvTlx_Sel)==0), AV43TFPrvTlx_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFPRVFAX", "", !(GXutil.strcmp("", AV44TFPrvFax)==0), (short)(0), AV44TFPrvFax, "", !(GXutil.strcmp("", AV45TFPrvFax_Sel)==0), AV45TFPrvFax_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFPRVMAIL", "", !(GXutil.strcmp("", AV46TFPrvMail)==0), (short)(0), AV46TFPrvMail, "", !(GXutil.strcmp("", AV47TFPrvMail_Sel)==0), AV47TFPrvMail_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFFPGCOD", "", !(GXutil.strcmp("", AV48TFFpgCod)==0), (short)(0), AV48TFFpgCod, "", !(GXutil.strcmp("", AV49TFFpgCod_Sel)==0), AV49TFFpgCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFFPGDSC", "", !(GXutil.strcmp("", AV50TFFpgDsc)==0), (short)(0), AV50TFFpgDsc, "", !(GXutil.strcmp("", AV51TFFpgDsc_Sel)==0), AV51TFFpgDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFPRVVTO", "", !((0==AV52TFPrvVto)&&(0==AV53TFPrvVto_To)), (short)(0), GXutil.trim( GXutil.str( AV52TFPrvVto, 2, 0)), GXutil.trim( GXutil.str( AV53TFPrvVto_To, 2, 0))) ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFPRVDIAPAG", "", !((0==AV54TFPrvDiaPag)&&(0==AV55TFPrvDiaPag_To)), (short)(0), GXutil.trim( GXutil.str( AV54TFPrvDiaPag, 6, 0)), GXutil.trim( GXutil.str( AV55TFPrvDiaPag_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFPRVPER", "", !((0==AV56TFPrvPer)&&(0==AV57TFPrvPer_To)), (short)(0), GXutil.trim( GXutil.str( AV56TFPrvPer, 6, 0)), GXutil.trim( GXutil.str( AV57TFPrvPer_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFPRVREP", "", !(GXutil.strcmp("", AV58TFPrvRep)==0), (short)(0), AV58TFPrvRep, "", !(GXutil.strcmp("", AV59TFPrvRep_Sel)==0), AV59TFPrvRep_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFPRVPLAENT", "", !((0==AV60TFPrvPlaEnt)&&(0==AV61TFPrvPlaEnt_To)), (short)(0), GXutil.trim( GXutil.str( AV60TFPrvPlaEnt, 3, 0)), GXutil.trim( GXutil.str( AV61TFPrvPlaEnt_To, 3, 0))) ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFPRVMETTRA_SEL", "", !(AV63TFPrvMetTra_Sels.size()==0), (short)(0), AV63TFPrvMetTra_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFPRVCTA", "", !(GXutil.strcmp("", AV64TFPrvCta)==0), (short)(0), AV64TFPrvCta, "", !(GXutil.strcmp("", AV65TFPrvCta_Sel)==0), AV65TFPrvCta_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      if ( ! (GXutil.strcmp("", AV70Emprcod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV70Emprcod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV71PrvNumFrom) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PRVNUMFROM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV71PrvNumFrom, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV72PrvNumTo) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PRVNUMTO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV72PrvNumTo, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV77Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV77Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TPRVGEN" );
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_25_1RJ2( boolean wbgen )
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
         wb_table2_30_1RJ2( true) ;
      }
      else
      {
         wb_table2_30_1RJ2( false) ;
      }
      return  ;
   }

   public void wb_table2_30_1RJ2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_25_1RJ2e( true) ;
      }
      else
      {
         wb_table1_25_1RJ2e( false) ;
      }
   }

   public void wb_table2_30_1RJ2( boolean wbgen )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV15FilterFullText, GXutil.rtrim( localUtil.format( AV15FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_StocksQuimicos\\ListadodeProveedores_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_30_1RJ2e( true) ;
      }
      else
      {
         wb_table2_30_1RJ2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV70Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70Emprcod", AV70Emprcod);
      AV71PrvNumFrom = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71PrvNumFrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71PrvNumFrom), 6, 0));
      AV72PrvNumTo = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72PrvNumTo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72PrvNumTo), 6, 0));
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
      pa1RJ2( ) ;
      ws1RJ2( ) ;
      we1RJ2( ) ;
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
      sCtrlAV70Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV71PrvNumFrom = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV72PrvNumTo = (String)getParm(obj,2,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1RJ2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "stocksquimicos\\listadodeproveedores_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1RJ2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV70Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70Emprcod", AV70Emprcod);
         AV71PrvNumFrom = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71PrvNumFrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71PrvNumFrom), 6, 0));
         AV72PrvNumTo = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72PrvNumTo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72PrvNumTo), 6, 0));
      }
      wcpOAV70Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV70Emprcod") ;
      wcpOAV71PrvNumFrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV71PrvNumFrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV72PrvNumTo = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV72PrvNumTo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV70Emprcod, wcpOAV70Emprcod) != 0 ) || ( AV71PrvNumFrom != wcpOAV71PrvNumFrom ) || ( AV72PrvNumTo != wcpOAV72PrvNumTo ) ) )
      {
         setjustcreated();
      }
      wcpOAV70Emprcod = AV70Emprcod ;
      wcpOAV71PrvNumFrom = AV71PrvNumFrom ;
      wcpOAV72PrvNumTo = AV72PrvNumTo ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV70Emprcod = httpContext.cgiGet( sPrefix+"AV70Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV70Emprcod) > 0 )
      {
         AV70Emprcod = httpContext.cgiGet( sCtrlAV70Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70Emprcod", AV70Emprcod);
      }
      else
      {
         AV70Emprcod = httpContext.cgiGet( sPrefix+"AV70Emprcod_PARM") ;
      }
      sCtrlAV71PrvNumFrom = httpContext.cgiGet( sPrefix+"AV71PrvNumFrom_CTRL") ;
      if ( GXutil.len( sCtrlAV71PrvNumFrom) > 0 )
      {
         AV71PrvNumFrom = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV71PrvNumFrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71PrvNumFrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71PrvNumFrom), 6, 0));
      }
      else
      {
         AV71PrvNumFrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV71PrvNumFrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV72PrvNumTo = httpContext.cgiGet( sPrefix+"AV72PrvNumTo_CTRL") ;
      if ( GXutil.len( sCtrlAV72PrvNumTo) > 0 )
      {
         AV72PrvNumTo = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV72PrvNumTo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72PrvNumTo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72PrvNumTo), 6, 0));
      }
      else
      {
         AV72PrvNumTo = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV72PrvNumTo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa1RJ2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1RJ2( ) ;
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
      ws1RJ2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV70Emprcod_PARM", GXutil.rtrim( AV70Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV70Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV70Emprcod_CTRL", GXutil.rtrim( sCtrlAV70Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV71PrvNumFrom_PARM", GXutil.ltrim( localUtil.ntoc( AV71PrvNumFrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV71PrvNumFrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV71PrvNumFrom_CTRL", GXutil.rtrim( sCtrlAV71PrvNumFrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV72PrvNumTo_PARM", GXutil.ltrim( localUtil.ntoc( AV72PrvNumTo, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV72PrvNumTo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV72PrvNumTo_CTRL", GXutil.rtrim( sCtrlAV72PrvNumTo));
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
      we1RJ2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211652977", true, true);
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
      httpContext.AddJavascriptSource("stocksquimicos/listadodeproveedores_wc.js", "?20268211652978", false, true);
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
      httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_432( )
   {
      edtPrvNum_Internalname = sPrefix+"PRVNUM_"+sGXsfl_43_idx ;
      edtPrvNom_Internalname = sPrefix+"PRVNOM_"+sGXsfl_43_idx ;
      edtPrvDir_Internalname = sPrefix+"PRVDIR_"+sGXsfl_43_idx ;
      edtPrvPob_Internalname = sPrefix+"PRVPOB_"+sGXsfl_43_idx ;
      edtPrvCpo_Internalname = sPrefix+"PRVCPO_"+sGXsfl_43_idx ;
      edtPrvCp2_Internalname = sPrefix+"PRVCP2_"+sGXsfl_43_idx ;
      edtPrvNif_Internalname = sPrefix+"PRVNIF_"+sGXsfl_43_idx ;
      edtPrvTlf_Internalname = sPrefix+"PRVTLF_"+sGXsfl_43_idx ;
      edtPrvTlx_Internalname = sPrefix+"PRVTLX_"+sGXsfl_43_idx ;
      edtPrvFax_Internalname = sPrefix+"PRVFAX_"+sGXsfl_43_idx ;
      edtPrvMail_Internalname = sPrefix+"PRVMAIL_"+sGXsfl_43_idx ;
      edtFpgCod_Internalname = sPrefix+"FPGCOD_"+sGXsfl_43_idx ;
      edtFpgDsc_Internalname = sPrefix+"FPGDSC_"+sGXsfl_43_idx ;
      edtPrvVto_Internalname = sPrefix+"PRVVTO_"+sGXsfl_43_idx ;
      edtPrvDiaPag_Internalname = sPrefix+"PRVDIAPAG_"+sGXsfl_43_idx ;
      edtPrvPer_Internalname = sPrefix+"PRVPER_"+sGXsfl_43_idx ;
      edtPrvRep_Internalname = sPrefix+"PRVREP_"+sGXsfl_43_idx ;
      edtPrvPlaEnt_Internalname = sPrefix+"PRVPLAENT_"+sGXsfl_43_idx ;
      cmbPrvMetTra.setInternalname( sPrefix+"PRVMETTRA_"+sGXsfl_43_idx );
      edtPrvCta_Internalname = sPrefix+"PRVCTA_"+sGXsfl_43_idx ;
   }

   public void subsflControlProps_fel_432( )
   {
      edtPrvNum_Internalname = sPrefix+"PRVNUM_"+sGXsfl_43_fel_idx ;
      edtPrvNom_Internalname = sPrefix+"PRVNOM_"+sGXsfl_43_fel_idx ;
      edtPrvDir_Internalname = sPrefix+"PRVDIR_"+sGXsfl_43_fel_idx ;
      edtPrvPob_Internalname = sPrefix+"PRVPOB_"+sGXsfl_43_fel_idx ;
      edtPrvCpo_Internalname = sPrefix+"PRVCPO_"+sGXsfl_43_fel_idx ;
      edtPrvCp2_Internalname = sPrefix+"PRVCP2_"+sGXsfl_43_fel_idx ;
      edtPrvNif_Internalname = sPrefix+"PRVNIF_"+sGXsfl_43_fel_idx ;
      edtPrvTlf_Internalname = sPrefix+"PRVTLF_"+sGXsfl_43_fel_idx ;
      edtPrvTlx_Internalname = sPrefix+"PRVTLX_"+sGXsfl_43_fel_idx ;
      edtPrvFax_Internalname = sPrefix+"PRVFAX_"+sGXsfl_43_fel_idx ;
      edtPrvMail_Internalname = sPrefix+"PRVMAIL_"+sGXsfl_43_fel_idx ;
      edtFpgCod_Internalname = sPrefix+"FPGCOD_"+sGXsfl_43_fel_idx ;
      edtFpgDsc_Internalname = sPrefix+"FPGDSC_"+sGXsfl_43_fel_idx ;
      edtPrvVto_Internalname = sPrefix+"PRVVTO_"+sGXsfl_43_fel_idx ;
      edtPrvDiaPag_Internalname = sPrefix+"PRVDIAPAG_"+sGXsfl_43_fel_idx ;
      edtPrvPer_Internalname = sPrefix+"PRVPER_"+sGXsfl_43_fel_idx ;
      edtPrvRep_Internalname = sPrefix+"PRVREP_"+sGXsfl_43_fel_idx ;
      edtPrvPlaEnt_Internalname = sPrefix+"PRVPLAENT_"+sGXsfl_43_fel_idx ;
      cmbPrvMetTra.setInternalname( sPrefix+"PRVMETTRA_"+sGXsfl_43_fel_idx );
      edtPrvCta_Internalname = sPrefix+"PRVCTA_"+sGXsfl_43_fel_idx ;
   }

   public void sendrow_432( )
   {
      subsflControlProps_432( ) ;
      wb1RJ0( ) ;
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
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvNom_Internalname,GXutil.rtrim( A794PrvNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrvNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrvNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrvDir_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvDir_Internalname,GXutil.rtrim( A786PrvDir),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrvDir_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrvDir_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrvPob_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvPob_Internalname,GXutil.rtrim( A799PrvPob),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrvPob_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrvPob_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrvCpo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvCpo_Internalname,GXutil.rtrim( A782PrvCpo),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrvCpo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrvCpo_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrvCp2_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvCp2_Internalname,GXutil.rtrim( A6075PrvCp2),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrvCp2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrvCp2_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrvNif_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvNif_Internalname,GXutil.rtrim( A793PrvNif),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrvNif_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrvNif_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrvTlf_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvTlf_Internalname,GXutil.rtrim( A803PrvTlf),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrvTlf_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrvTlf_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrvTlx_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvTlx_Internalname,GXutil.rtrim( A804PrvTlx),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrvTlx_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrvTlx_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrvFax_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvFax_Internalname,GXutil.rtrim( A6076PrvFax),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrvFax_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrvFax_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrvMail_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvMail_Internalname,GXutil.rtrim( A6077PrvMail),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrvMail_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrvMail_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtFpgCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFpgCod_Internalname,GXutil.rtrim( A497FpgCod),GXutil.rtrim( localUtil.format( A497FpgCod, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtFpgCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtFpgCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtFpgDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFpgDsc_Internalname,GXutil.rtrim( A498FpgDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtFpgDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtFpgDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrvVto_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvVto_Internalname,GXutil.ltrim( localUtil.ntoc( A805PrvVto, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A805PrvVto), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrvVto_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrvVto_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrvDiaPag_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvDiaPag_Internalname,GXutil.ltrim( localUtil.ntoc( A785PrvDiaPag, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A785PrvDiaPag), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrvDiaPag_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrvDiaPag_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrvPer_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvPer_Internalname,GXutil.ltrim( localUtil.ntoc( A797PrvPer, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A797PrvPer), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrvPer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrvPer_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrvRep_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvRep_Internalname,GXutil.rtrim( A801PrvRep),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrvRep_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrvRep_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrvPlaEnt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvPlaEnt_Internalname,GXutil.ltrim( localUtil.ntoc( A798PrvPlaEnt, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A798PrvPlaEnt), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrvPlaEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrvPlaEnt_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbPrvMetTra.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbPrvMetTra.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "PRVMETTRA_" + sGXsfl_43_idx ;
            cmbPrvMetTra.setName( GXCCtl );
            cmbPrvMetTra.setWebtags( "" );
            cmbPrvMetTra.addItem("S", httpContext.getMessage( "Su Transporte", ""), (short)(0));
            cmbPrvMetTra.addItem("N", httpContext.getMessage( "Nuestro", ""), (short)(0));
            cmbPrvMetTra.addItem("A", httpContext.getMessage( "Agencia", ""), (short)(0));
            if ( cmbPrvMetTra.getItemCount() > 0 )
            {
               A792PrvMetTra = cmbPrvMetTra.getValidValue(A792PrvMetTra) ;
               n792PrvMetTra = false ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbPrvMetTra,cmbPrvMetTra.getInternalname(),GXutil.rtrim( A792PrvMetTra),Integer.valueOf(1),cmbPrvMetTra.getJsonclick(),Integer.valueOf(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbPrvMetTra.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn hidden-xs","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbPrvMetTra.setValue( GXutil.rtrim( A792PrvMetTra) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbPrvMetTra.getInternalname(), "Values", cmbPrvMetTra.ToJavascriptSource(), !bGXsfl_43_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrvCta_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvCta_Internalname,GXutil.rtrim( A783PrvCta),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrvCta_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrvCta_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes1RJ2( ) ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrvNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Proveedor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrvNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrvDir_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Direccion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrvPob_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Poblacion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrvCpo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Postal", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrvCp2_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "C. Postal 2", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrvNif_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N.I.F.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrvTlf_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Telefonos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrvTlx_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Telex", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrvFax_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fax", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrvMail_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Mail", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtFpgCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Forma Pago", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtFpgDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrvVto_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Vtos.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrvDiaPag_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Dias Pago", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrvPer_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Periodicidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrvRep_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Representante", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrvPlaEnt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Dias Plazo Entrega", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbPrvMetTra.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metodo Transporte", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrvCta_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cuenta Contable", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A786PrvDir));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrvDir_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A799PrvPob));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrvPob_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A782PrvCpo));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrvCpo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A6075PrvCp2));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrvCp2_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A793PrvNif));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrvNif_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A803PrvTlf));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrvTlf_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A804PrvTlx));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrvTlx_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A6076PrvFax));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrvFax_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A6077PrvMail));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrvMail_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A497FpgCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtFpgCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A498FpgDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtFpgDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A805PrvVto, (byte)(2), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrvVto_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A785PrvDiaPag, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrvDiaPag_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A797PrvPer, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrvPer_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A801PrvRep));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrvRep_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A798PrvPlaEnt, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrvPlaEnt_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A792PrvMetTra));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbPrvMetTra.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A783PrvCta));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrvCta_Visible, (byte)(5), (byte)(0), ".", "")));
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
      bttBtnexportreport_Internalname = sPrefix+"BTNEXPORTREPORT" ;
      bttBtnexportcsv_Internalname = sPrefix+"BTNEXPORTCSV" ;
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
      edtPrvDir_Internalname = sPrefix+"PRVDIR" ;
      edtPrvPob_Internalname = sPrefix+"PRVPOB" ;
      edtPrvCpo_Internalname = sPrefix+"PRVCPO" ;
      edtPrvCp2_Internalname = sPrefix+"PRVCP2" ;
      edtPrvNif_Internalname = sPrefix+"PRVNIF" ;
      edtPrvTlf_Internalname = sPrefix+"PRVTLF" ;
      edtPrvTlx_Internalname = sPrefix+"PRVTLX" ;
      edtPrvFax_Internalname = sPrefix+"PRVFAX" ;
      edtPrvMail_Internalname = sPrefix+"PRVMAIL" ;
      edtFpgCod_Internalname = sPrefix+"FPGCOD" ;
      edtFpgDsc_Internalname = sPrefix+"FPGDSC" ;
      edtPrvVto_Internalname = sPrefix+"PRVVTO" ;
      edtPrvDiaPag_Internalname = sPrefix+"PRVDIAPAG" ;
      edtPrvPer_Internalname = sPrefix+"PRVPER" ;
      edtPrvRep_Internalname = sPrefix+"PRVREP" ;
      edtPrvPlaEnt_Internalname = sPrefix+"PRVPLAENT" ;
      cmbPrvMetTra.setInternalname( sPrefix+"PRVMETTRA" );
      edtPrvCta_Internalname = sPrefix+"PRVCTA" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Innewwindow1_Internalname = sPrefix+"INNEWWINDOW1" ;
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
      edtPrvCta_Jsonclick = "" ;
      cmbPrvMetTra.setJsonclick( "" );
      edtPrvPlaEnt_Jsonclick = "" ;
      edtPrvRep_Jsonclick = "" ;
      edtPrvPer_Jsonclick = "" ;
      edtPrvDiaPag_Jsonclick = "" ;
      edtPrvVto_Jsonclick = "" ;
      edtFpgDsc_Jsonclick = "" ;
      edtFpgCod_Jsonclick = "" ;
      edtPrvMail_Jsonclick = "" ;
      edtPrvFax_Jsonclick = "" ;
      edtPrvTlx_Jsonclick = "" ;
      edtPrvTlf_Jsonclick = "" ;
      edtPrvNif_Jsonclick = "" ;
      edtPrvCp2_Jsonclick = "" ;
      edtPrvCpo_Jsonclick = "" ;
      edtPrvPob_Jsonclick = "" ;
      edtPrvDir_Jsonclick = "" ;
      edtPrvNom_Jsonclick = "" ;
      edtPrvNum_Jsonclick = "" ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtPrvCta_Visible = -1 ;
      cmbPrvMetTra.setVisible( -1 );
      edtPrvPlaEnt_Visible = -1 ;
      edtPrvRep_Visible = -1 ;
      edtPrvPer_Visible = -1 ;
      edtPrvDiaPag_Visible = -1 ;
      edtPrvVto_Visible = -1 ;
      edtFpgDsc_Visible = -1 ;
      edtFpgCod_Visible = -1 ;
      edtPrvMail_Visible = -1 ;
      edtPrvFax_Visible = -1 ;
      edtPrvTlx_Visible = -1 ;
      edtPrvTlf_Visible = -1 ;
      edtPrvNif_Visible = -1 ;
      edtPrvCp2_Visible = -1 ;
      edtPrvCpo_Visible = -1 ;
      edtPrvPob_Visible = -1 ;
      edtPrvDir_Visible = -1 ;
      edtPrvNom_Visible = -1 ;
      edtPrvNum_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Innewwindow1_Target = "" ;
      Innewwindow1_Height = "50" ;
      Innewwindow1_Width = "50" ;
      Ddo_grid_Datalistproc = "StocksQuimicos.ListadodeProveedores_WCGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "||||||||||||||||||S:Su Transporte,N:Nuestro,A:Agencia|" ;
      Ddo_grid_Allowmultipleselection = "||||||||||||||||||T|" ;
      Ddo_grid_Datalisttype = "|Dynamic|Dynamic|Dynamic|Dynamic|Dynamic|Dynamic|Dynamic|Dynamic|Dynamic|Dynamic|Dynamic|Dynamic||||Dynamic||FixedValues|Dynamic" ;
      Ddo_grid_Includedatalist = "|T|T|T|T|T|T|T|T|T|T|T|T||||T||T|T" ;
      Ddo_grid_Filterisrange = "T|||||||||||||T|T|T||T||" ;
      Ddo_grid_Filtertype = "Numeric|Character|Character|Character|Character|Character|Character|Character|Character|Character|Character|Character|Character|Numeric|Numeric|Numeric|Character|Numeric||Character" ;
      Ddo_grid_Includefilter = "T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T||T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|1|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20" ;
      Ddo_grid_Columnids = "0:PrvNum|1:PrvNom|2:PrvDir|3:PrvPob|4:PrvCpo|5:PrvCp2|6:PrvNif|7:PrvTlf|8:PrvTlx|9:PrvFax|10:PrvMail|11:FpgCod|12:FpgDsc|13:PrvVto|14:PrvDiaPag|15:PrvPer|16:PrvRep|17:PrvPlaEnt|18:PrvMetTra|19:PrvCta" ;
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
      GXCCtl = "PRVMETTRA_" + sGXsfl_43_idx ;
      cmbPrvMetTra.setName( GXCCtl );
      cmbPrvMetTra.setWebtags( "" );
      cmbPrvMetTra.addItem("S", httpContext.getMessage( "Su Transporte", ""), (short)(0));
      cmbPrvMetTra.addItem("N", httpContext.getMessage( "Nuestro", ""), (short)(0));
      cmbPrvMetTra.addItem("A", httpContext.getMessage( "Agencia", ""), (short)(0));
      if ( cmbPrvMetTra.getItemCount() > 0 )
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV70Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV71PrvNumFrom',fld:'vPRVNUMFROM',pic:'ZZZZZ9'},{av:'AV72PrvNumTo',fld:'vPRVNUMTO',pic:'ZZZZZ9'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV27TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV28TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV29TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV30TFPrvDir',fld:'vTFPRVDIR',pic:''},{av:'AV31TFPrvDir_Sel',fld:'vTFPRVDIR_SEL',pic:''},{av:'AV32TFPrvPob',fld:'vTFPRVPOB',pic:''},{av:'AV33TFPrvPob_Sel',fld:'vTFPRVPOB_SEL',pic:''},{av:'AV34TFPrvCpo',fld:'vTFPRVCPO',pic:''},{av:'AV35TFPrvCpo_Sel',fld:'vTFPRVCPO_SEL',pic:''},{av:'AV36TFPrvCp2',fld:'vTFPRVCP2',pic:''},{av:'AV37TFPrvCp2_Sel',fld:'vTFPRVCP2_SEL',pic:''},{av:'AV38TFPrvNif',fld:'vTFPRVNIF',pic:''},{av:'AV39TFPrvNif_Sel',fld:'vTFPRVNIF_SEL',pic:''},{av:'AV40TFPrvTlf',fld:'vTFPRVTLF',pic:''},{av:'AV41TFPrvTlf_Sel',fld:'vTFPRVTLF_SEL',pic:''},{av:'AV42TFPrvTlx',fld:'vTFPRVTLX',pic:''},{av:'AV43TFPrvTlx_Sel',fld:'vTFPRVTLX_SEL',pic:''},{av:'AV44TFPrvFax',fld:'vTFPRVFAX',pic:''},{av:'AV45TFPrvFax_Sel',fld:'vTFPRVFAX_SEL',pic:''},{av:'AV46TFPrvMail',fld:'vTFPRVMAIL',pic:''},{av:'AV47TFPrvMail_Sel',fld:'vTFPRVMAIL_SEL',pic:''},{av:'AV48TFFpgCod',fld:'vTFFPGCOD',pic:'@!'},{av:'AV49TFFpgCod_Sel',fld:'vTFFPGCOD_SEL',pic:'@!'},{av:'AV50TFFpgDsc',fld:'vTFFPGDSC',pic:''},{av:'AV51TFFpgDsc_Sel',fld:'vTFFPGDSC_SEL',pic:''},{av:'AV52TFPrvVto',fld:'vTFPRVVTO',pic:'Z9'},{av:'AV53TFPrvVto_To',fld:'vTFPRVVTO_TO',pic:'Z9'},{av:'AV54TFPrvDiaPag',fld:'vTFPRVDIAPAG',pic:'ZZZZZ9'},{av:'AV55TFPrvDiaPag_To',fld:'vTFPRVDIAPAG_TO',pic:'ZZZZZ9'},{av:'AV56TFPrvPer',fld:'vTFPRVPER',pic:'ZZZZZ9'},{av:'AV57TFPrvPer_To',fld:'vTFPRVPER_TO',pic:'ZZZZZ9'},{av:'AV58TFPrvRep',fld:'vTFPRVREP',pic:''},{av:'AV59TFPrvRep_Sel',fld:'vTFPRVREP_SEL',pic:''},{av:'AV60TFPrvPlaEnt',fld:'vTFPRVPLAENT',pic:'ZZ9'},{av:'AV61TFPrvPlaEnt_To',fld:'vTFPRVPLAENT_TO',pic:'ZZ9'},{av:'AV63TFPrvMetTra_Sels',fld:'vTFPRVMETTRA_SELS',pic:''},{av:'AV64TFPrvCta',fld:'vTFPRVCTA',pic:''},{av:'AV65TFPrvCta_Sel',fld:'vTFPRVCTA_SEL',pic:''},{av:'AV77Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtPrvNum_Visible',ctrl:'PRVNUM',prop:'Visible'},{av:'edtPrvNom_Visible',ctrl:'PRVNOM',prop:'Visible'},{av:'edtPrvDir_Visible',ctrl:'PRVDIR',prop:'Visible'},{av:'edtPrvPob_Visible',ctrl:'PRVPOB',prop:'Visible'},{av:'edtPrvCpo_Visible',ctrl:'PRVCPO',prop:'Visible'},{av:'edtPrvCp2_Visible',ctrl:'PRVCP2',prop:'Visible'},{av:'edtPrvNif_Visible',ctrl:'PRVNIF',prop:'Visible'},{av:'edtPrvTlf_Visible',ctrl:'PRVTLF',prop:'Visible'},{av:'edtPrvTlx_Visible',ctrl:'PRVTLX',prop:'Visible'},{av:'edtPrvFax_Visible',ctrl:'PRVFAX',prop:'Visible'},{av:'edtPrvMail_Visible',ctrl:'PRVMAIL',prop:'Visible'},{av:'edtFpgCod_Visible',ctrl:'FPGCOD',prop:'Visible'},{av:'edtFpgDsc_Visible',ctrl:'FPGDSC',prop:'Visible'},{av:'edtPrvVto_Visible',ctrl:'PRVVTO',prop:'Visible'},{av:'edtPrvDiaPag_Visible',ctrl:'PRVDIAPAG',prop:'Visible'},{av:'edtPrvPer_Visible',ctrl:'PRVPER',prop:'Visible'},{av:'edtPrvRep_Visible',ctrl:'PRVREP',prop:'Visible'},{av:'edtPrvPlaEnt_Visible',ctrl:'PRVPLAENT',prop:'Visible'},{av:'cmbPrvMetTra'},{av:'edtPrvCta_Visible',ctrl:'PRVCTA',prop:'Visible'},{av:'AV68GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV69GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e121RJ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV70Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV71PrvNumFrom',fld:'vPRVNUMFROM',pic:'ZZZZZ9'},{av:'AV72PrvNumTo',fld:'vPRVNUMTO',pic:'ZZZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV27TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV28TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV29TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV30TFPrvDir',fld:'vTFPRVDIR',pic:''},{av:'AV31TFPrvDir_Sel',fld:'vTFPRVDIR_SEL',pic:''},{av:'AV32TFPrvPob',fld:'vTFPRVPOB',pic:''},{av:'AV33TFPrvPob_Sel',fld:'vTFPRVPOB_SEL',pic:''},{av:'AV34TFPrvCpo',fld:'vTFPRVCPO',pic:''},{av:'AV35TFPrvCpo_Sel',fld:'vTFPRVCPO_SEL',pic:''},{av:'AV36TFPrvCp2',fld:'vTFPRVCP2',pic:''},{av:'AV37TFPrvCp2_Sel',fld:'vTFPRVCP2_SEL',pic:''},{av:'AV38TFPrvNif',fld:'vTFPRVNIF',pic:''},{av:'AV39TFPrvNif_Sel',fld:'vTFPRVNIF_SEL',pic:''},{av:'AV40TFPrvTlf',fld:'vTFPRVTLF',pic:''},{av:'AV41TFPrvTlf_Sel',fld:'vTFPRVTLF_SEL',pic:''},{av:'AV42TFPrvTlx',fld:'vTFPRVTLX',pic:''},{av:'AV43TFPrvTlx_Sel',fld:'vTFPRVTLX_SEL',pic:''},{av:'AV44TFPrvFax',fld:'vTFPRVFAX',pic:''},{av:'AV45TFPrvFax_Sel',fld:'vTFPRVFAX_SEL',pic:''},{av:'AV46TFPrvMail',fld:'vTFPRVMAIL',pic:''},{av:'AV47TFPrvMail_Sel',fld:'vTFPRVMAIL_SEL',pic:''},{av:'AV48TFFpgCod',fld:'vTFFPGCOD',pic:'@!'},{av:'AV49TFFpgCod_Sel',fld:'vTFFPGCOD_SEL',pic:'@!'},{av:'AV50TFFpgDsc',fld:'vTFFPGDSC',pic:''},{av:'AV51TFFpgDsc_Sel',fld:'vTFFPGDSC_SEL',pic:''},{av:'AV52TFPrvVto',fld:'vTFPRVVTO',pic:'Z9'},{av:'AV53TFPrvVto_To',fld:'vTFPRVVTO_TO',pic:'Z9'},{av:'AV54TFPrvDiaPag',fld:'vTFPRVDIAPAG',pic:'ZZZZZ9'},{av:'AV55TFPrvDiaPag_To',fld:'vTFPRVDIAPAG_TO',pic:'ZZZZZ9'},{av:'AV56TFPrvPer',fld:'vTFPRVPER',pic:'ZZZZZ9'},{av:'AV57TFPrvPer_To',fld:'vTFPRVPER_TO',pic:'ZZZZZ9'},{av:'AV58TFPrvRep',fld:'vTFPRVREP',pic:''},{av:'AV59TFPrvRep_Sel',fld:'vTFPRVREP_SEL',pic:''},{av:'AV60TFPrvPlaEnt',fld:'vTFPRVPLAENT',pic:'ZZ9'},{av:'AV61TFPrvPlaEnt_To',fld:'vTFPRVPLAENT_TO',pic:'ZZ9'},{av:'AV63TFPrvMetTra_Sels',fld:'vTFPRVMETTRA_SELS',pic:''},{av:'AV64TFPrvCta',fld:'vTFPRVCTA',pic:''},{av:'AV65TFPrvCta_Sel',fld:'vTFPRVCTA_SEL',pic:''},{av:'AV77Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e131RJ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV70Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV71PrvNumFrom',fld:'vPRVNUMFROM',pic:'ZZZZZ9'},{av:'AV72PrvNumTo',fld:'vPRVNUMTO',pic:'ZZZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV27TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV28TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV29TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV30TFPrvDir',fld:'vTFPRVDIR',pic:''},{av:'AV31TFPrvDir_Sel',fld:'vTFPRVDIR_SEL',pic:''},{av:'AV32TFPrvPob',fld:'vTFPRVPOB',pic:''},{av:'AV33TFPrvPob_Sel',fld:'vTFPRVPOB_SEL',pic:''},{av:'AV34TFPrvCpo',fld:'vTFPRVCPO',pic:''},{av:'AV35TFPrvCpo_Sel',fld:'vTFPRVCPO_SEL',pic:''},{av:'AV36TFPrvCp2',fld:'vTFPRVCP2',pic:''},{av:'AV37TFPrvCp2_Sel',fld:'vTFPRVCP2_SEL',pic:''},{av:'AV38TFPrvNif',fld:'vTFPRVNIF',pic:''},{av:'AV39TFPrvNif_Sel',fld:'vTFPRVNIF_SEL',pic:''},{av:'AV40TFPrvTlf',fld:'vTFPRVTLF',pic:''},{av:'AV41TFPrvTlf_Sel',fld:'vTFPRVTLF_SEL',pic:''},{av:'AV42TFPrvTlx',fld:'vTFPRVTLX',pic:''},{av:'AV43TFPrvTlx_Sel',fld:'vTFPRVTLX_SEL',pic:''},{av:'AV44TFPrvFax',fld:'vTFPRVFAX',pic:''},{av:'AV45TFPrvFax_Sel',fld:'vTFPRVFAX_SEL',pic:''},{av:'AV46TFPrvMail',fld:'vTFPRVMAIL',pic:''},{av:'AV47TFPrvMail_Sel',fld:'vTFPRVMAIL_SEL',pic:''},{av:'AV48TFFpgCod',fld:'vTFFPGCOD',pic:'@!'},{av:'AV49TFFpgCod_Sel',fld:'vTFFPGCOD_SEL',pic:'@!'},{av:'AV50TFFpgDsc',fld:'vTFFPGDSC',pic:''},{av:'AV51TFFpgDsc_Sel',fld:'vTFFPGDSC_SEL',pic:''},{av:'AV52TFPrvVto',fld:'vTFPRVVTO',pic:'Z9'},{av:'AV53TFPrvVto_To',fld:'vTFPRVVTO_TO',pic:'Z9'},{av:'AV54TFPrvDiaPag',fld:'vTFPRVDIAPAG',pic:'ZZZZZ9'},{av:'AV55TFPrvDiaPag_To',fld:'vTFPRVDIAPAG_TO',pic:'ZZZZZ9'},{av:'AV56TFPrvPer',fld:'vTFPRVPER',pic:'ZZZZZ9'},{av:'AV57TFPrvPer_To',fld:'vTFPRVPER_TO',pic:'ZZZZZ9'},{av:'AV58TFPrvRep',fld:'vTFPRVREP',pic:''},{av:'AV59TFPrvRep_Sel',fld:'vTFPRVREP_SEL',pic:''},{av:'AV60TFPrvPlaEnt',fld:'vTFPRVPLAENT',pic:'ZZ9'},{av:'AV61TFPrvPlaEnt_To',fld:'vTFPRVPLAENT_TO',pic:'ZZ9'},{av:'AV63TFPrvMetTra_Sels',fld:'vTFPRVMETTRA_SELS',pic:''},{av:'AV64TFPrvCta',fld:'vTFPRVCTA',pic:''},{av:'AV65TFPrvCta_Sel',fld:'vTFPRVCTA_SEL',pic:''},{av:'AV77Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e141RJ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV70Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV71PrvNumFrom',fld:'vPRVNUMFROM',pic:'ZZZZZ9'},{av:'AV72PrvNumTo',fld:'vPRVNUMTO',pic:'ZZZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV27TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV28TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV29TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV30TFPrvDir',fld:'vTFPRVDIR',pic:''},{av:'AV31TFPrvDir_Sel',fld:'vTFPRVDIR_SEL',pic:''},{av:'AV32TFPrvPob',fld:'vTFPRVPOB',pic:''},{av:'AV33TFPrvPob_Sel',fld:'vTFPRVPOB_SEL',pic:''},{av:'AV34TFPrvCpo',fld:'vTFPRVCPO',pic:''},{av:'AV35TFPrvCpo_Sel',fld:'vTFPRVCPO_SEL',pic:''},{av:'AV36TFPrvCp2',fld:'vTFPRVCP2',pic:''},{av:'AV37TFPrvCp2_Sel',fld:'vTFPRVCP2_SEL',pic:''},{av:'AV38TFPrvNif',fld:'vTFPRVNIF',pic:''},{av:'AV39TFPrvNif_Sel',fld:'vTFPRVNIF_SEL',pic:''},{av:'AV40TFPrvTlf',fld:'vTFPRVTLF',pic:''},{av:'AV41TFPrvTlf_Sel',fld:'vTFPRVTLF_SEL',pic:''},{av:'AV42TFPrvTlx',fld:'vTFPRVTLX',pic:''},{av:'AV43TFPrvTlx_Sel',fld:'vTFPRVTLX_SEL',pic:''},{av:'AV44TFPrvFax',fld:'vTFPRVFAX',pic:''},{av:'AV45TFPrvFax_Sel',fld:'vTFPRVFAX_SEL',pic:''},{av:'AV46TFPrvMail',fld:'vTFPRVMAIL',pic:''},{av:'AV47TFPrvMail_Sel',fld:'vTFPRVMAIL_SEL',pic:''},{av:'AV48TFFpgCod',fld:'vTFFPGCOD',pic:'@!'},{av:'AV49TFFpgCod_Sel',fld:'vTFFPGCOD_SEL',pic:'@!'},{av:'AV50TFFpgDsc',fld:'vTFFPGDSC',pic:''},{av:'AV51TFFpgDsc_Sel',fld:'vTFFPGDSC_SEL',pic:''},{av:'AV52TFPrvVto',fld:'vTFPRVVTO',pic:'Z9'},{av:'AV53TFPrvVto_To',fld:'vTFPRVVTO_TO',pic:'Z9'},{av:'AV54TFPrvDiaPag',fld:'vTFPRVDIAPAG',pic:'ZZZZZ9'},{av:'AV55TFPrvDiaPag_To',fld:'vTFPRVDIAPAG_TO',pic:'ZZZZZ9'},{av:'AV56TFPrvPer',fld:'vTFPRVPER',pic:'ZZZZZ9'},{av:'AV57TFPrvPer_To',fld:'vTFPRVPER_TO',pic:'ZZZZZ9'},{av:'AV58TFPrvRep',fld:'vTFPRVREP',pic:''},{av:'AV59TFPrvRep_Sel',fld:'vTFPRVREP_SEL',pic:''},{av:'AV60TFPrvPlaEnt',fld:'vTFPRVPLAENT',pic:'ZZ9'},{av:'AV61TFPrvPlaEnt_To',fld:'vTFPRVPLAENT_TO',pic:'ZZ9'},{av:'AV63TFPrvMetTra_Sels',fld:'vTFPRVMETTRA_SELS',pic:''},{av:'AV64TFPrvCta',fld:'vTFPRVCTA',pic:''},{av:'AV65TFPrvCta_Sel',fld:'vTFPRVCTA_SEL',pic:''},{av:'AV77Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV64TFPrvCta',fld:'vTFPRVCTA',pic:''},{av:'AV65TFPrvCta_Sel',fld:'vTFPRVCTA_SEL',pic:''},{av:'AV62TFPrvMetTra_SelsJson',fld:'vTFPRVMETTRA_SELSJSON',pic:''},{av:'AV63TFPrvMetTra_Sels',fld:'vTFPRVMETTRA_SELS',pic:''},{av:'AV60TFPrvPlaEnt',fld:'vTFPRVPLAENT',pic:'ZZ9'},{av:'AV61TFPrvPlaEnt_To',fld:'vTFPRVPLAENT_TO',pic:'ZZ9'},{av:'AV58TFPrvRep',fld:'vTFPRVREP',pic:''},{av:'AV59TFPrvRep_Sel',fld:'vTFPRVREP_SEL',pic:''},{av:'AV56TFPrvPer',fld:'vTFPRVPER',pic:'ZZZZZ9'},{av:'AV57TFPrvPer_To',fld:'vTFPRVPER_TO',pic:'ZZZZZ9'},{av:'AV54TFPrvDiaPag',fld:'vTFPRVDIAPAG',pic:'ZZZZZ9'},{av:'AV55TFPrvDiaPag_To',fld:'vTFPRVDIAPAG_TO',pic:'ZZZZZ9'},{av:'AV52TFPrvVto',fld:'vTFPRVVTO',pic:'Z9'},{av:'AV53TFPrvVto_To',fld:'vTFPRVVTO_TO',pic:'Z9'},{av:'AV50TFFpgDsc',fld:'vTFFPGDSC',pic:''},{av:'AV51TFFpgDsc_Sel',fld:'vTFFPGDSC_SEL',pic:''},{av:'AV48TFFpgCod',fld:'vTFFPGCOD',pic:'@!'},{av:'AV49TFFpgCod_Sel',fld:'vTFFPGCOD_SEL',pic:'@!'},{av:'AV46TFPrvMail',fld:'vTFPRVMAIL',pic:''},{av:'AV47TFPrvMail_Sel',fld:'vTFPRVMAIL_SEL',pic:''},{av:'AV44TFPrvFax',fld:'vTFPRVFAX',pic:''},{av:'AV45TFPrvFax_Sel',fld:'vTFPRVFAX_SEL',pic:''},{av:'AV42TFPrvTlx',fld:'vTFPRVTLX',pic:''},{av:'AV43TFPrvTlx_Sel',fld:'vTFPRVTLX_SEL',pic:''},{av:'AV40TFPrvTlf',fld:'vTFPRVTLF',pic:''},{av:'AV41TFPrvTlf_Sel',fld:'vTFPRVTLF_SEL',pic:''},{av:'AV38TFPrvNif',fld:'vTFPRVNIF',pic:''},{av:'AV39TFPrvNif_Sel',fld:'vTFPRVNIF_SEL',pic:''},{av:'AV36TFPrvCp2',fld:'vTFPRVCP2',pic:''},{av:'AV37TFPrvCp2_Sel',fld:'vTFPRVCP2_SEL',pic:''},{av:'AV34TFPrvCpo',fld:'vTFPRVCPO',pic:''},{av:'AV35TFPrvCpo_Sel',fld:'vTFPRVCPO_SEL',pic:''},{av:'AV32TFPrvPob',fld:'vTFPRVPOB',pic:''},{av:'AV33TFPrvPob_Sel',fld:'vTFPRVPOB_SEL',pic:''},{av:'AV30TFPrvDir',fld:'vTFPRVDIR',pic:''},{av:'AV31TFPrvDir_Sel',fld:'vTFPRVDIR_SEL',pic:''},{av:'AV28TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV29TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV26TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV27TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e211RJ2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e151RJ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV70Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV71PrvNumFrom',fld:'vPRVNUMFROM',pic:'ZZZZZ9'},{av:'AV72PrvNumTo',fld:'vPRVNUMTO',pic:'ZZZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV27TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV28TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV29TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV30TFPrvDir',fld:'vTFPRVDIR',pic:''},{av:'AV31TFPrvDir_Sel',fld:'vTFPRVDIR_SEL',pic:''},{av:'AV32TFPrvPob',fld:'vTFPRVPOB',pic:''},{av:'AV33TFPrvPob_Sel',fld:'vTFPRVPOB_SEL',pic:''},{av:'AV34TFPrvCpo',fld:'vTFPRVCPO',pic:''},{av:'AV35TFPrvCpo_Sel',fld:'vTFPRVCPO_SEL',pic:''},{av:'AV36TFPrvCp2',fld:'vTFPRVCP2',pic:''},{av:'AV37TFPrvCp2_Sel',fld:'vTFPRVCP2_SEL',pic:''},{av:'AV38TFPrvNif',fld:'vTFPRVNIF',pic:''},{av:'AV39TFPrvNif_Sel',fld:'vTFPRVNIF_SEL',pic:''},{av:'AV40TFPrvTlf',fld:'vTFPRVTLF',pic:''},{av:'AV41TFPrvTlf_Sel',fld:'vTFPRVTLF_SEL',pic:''},{av:'AV42TFPrvTlx',fld:'vTFPRVTLX',pic:''},{av:'AV43TFPrvTlx_Sel',fld:'vTFPRVTLX_SEL',pic:''},{av:'AV44TFPrvFax',fld:'vTFPRVFAX',pic:''},{av:'AV45TFPrvFax_Sel',fld:'vTFPRVFAX_SEL',pic:''},{av:'AV46TFPrvMail',fld:'vTFPRVMAIL',pic:''},{av:'AV47TFPrvMail_Sel',fld:'vTFPRVMAIL_SEL',pic:''},{av:'AV48TFFpgCod',fld:'vTFFPGCOD',pic:'@!'},{av:'AV49TFFpgCod_Sel',fld:'vTFFPGCOD_SEL',pic:'@!'},{av:'AV50TFFpgDsc',fld:'vTFFPGDSC',pic:''},{av:'AV51TFFpgDsc_Sel',fld:'vTFFPGDSC_SEL',pic:''},{av:'AV52TFPrvVto',fld:'vTFPRVVTO',pic:'Z9'},{av:'AV53TFPrvVto_To',fld:'vTFPRVVTO_TO',pic:'Z9'},{av:'AV54TFPrvDiaPag',fld:'vTFPRVDIAPAG',pic:'ZZZZZ9'},{av:'AV55TFPrvDiaPag_To',fld:'vTFPRVDIAPAG_TO',pic:'ZZZZZ9'},{av:'AV56TFPrvPer',fld:'vTFPRVPER',pic:'ZZZZZ9'},{av:'AV57TFPrvPer_To',fld:'vTFPRVPER_TO',pic:'ZZZZZ9'},{av:'AV58TFPrvRep',fld:'vTFPRVREP',pic:''},{av:'AV59TFPrvRep_Sel',fld:'vTFPRVREP_SEL',pic:''},{av:'AV60TFPrvPlaEnt',fld:'vTFPRVPLAENT',pic:'ZZ9'},{av:'AV61TFPrvPlaEnt_To',fld:'vTFPRVPLAENT_TO',pic:'ZZ9'},{av:'AV63TFPrvMetTra_Sels',fld:'vTFPRVMETTRA_SELS',pic:''},{av:'AV64TFPrvCta',fld:'vTFPRVCTA',pic:''},{av:'AV65TFPrvCta_Sel',fld:'vTFPRVCTA_SEL',pic:''},{av:'AV77Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtPrvNum_Visible',ctrl:'PRVNUM',prop:'Visible'},{av:'edtPrvNom_Visible',ctrl:'PRVNOM',prop:'Visible'},{av:'edtPrvDir_Visible',ctrl:'PRVDIR',prop:'Visible'},{av:'edtPrvPob_Visible',ctrl:'PRVPOB',prop:'Visible'},{av:'edtPrvCpo_Visible',ctrl:'PRVCPO',prop:'Visible'},{av:'edtPrvCp2_Visible',ctrl:'PRVCP2',prop:'Visible'},{av:'edtPrvNif_Visible',ctrl:'PRVNIF',prop:'Visible'},{av:'edtPrvTlf_Visible',ctrl:'PRVTLF',prop:'Visible'},{av:'edtPrvTlx_Visible',ctrl:'PRVTLX',prop:'Visible'},{av:'edtPrvFax_Visible',ctrl:'PRVFAX',prop:'Visible'},{av:'edtPrvMail_Visible',ctrl:'PRVMAIL',prop:'Visible'},{av:'edtFpgCod_Visible',ctrl:'FPGCOD',prop:'Visible'},{av:'edtFpgDsc_Visible',ctrl:'FPGDSC',prop:'Visible'},{av:'edtPrvVto_Visible',ctrl:'PRVVTO',prop:'Visible'},{av:'edtPrvDiaPag_Visible',ctrl:'PRVDIAPAG',prop:'Visible'},{av:'edtPrvPer_Visible',ctrl:'PRVPER',prop:'Visible'},{av:'edtPrvRep_Visible',ctrl:'PRVREP',prop:'Visible'},{av:'edtPrvPlaEnt_Visible',ctrl:'PRVPLAENT',prop:'Visible'},{av:'cmbPrvMetTra'},{av:'edtPrvCta_Visible',ctrl:'PRVCTA',prop:'Visible'},{av:'AV68GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV69GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e111RJ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV70Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV71PrvNumFrom',fld:'vPRVNUMFROM',pic:'ZZZZZ9'},{av:'AV72PrvNumTo',fld:'vPRVNUMTO',pic:'ZZZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV27TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV28TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV29TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV30TFPrvDir',fld:'vTFPRVDIR',pic:''},{av:'AV31TFPrvDir_Sel',fld:'vTFPRVDIR_SEL',pic:''},{av:'AV32TFPrvPob',fld:'vTFPRVPOB',pic:''},{av:'AV33TFPrvPob_Sel',fld:'vTFPRVPOB_SEL',pic:''},{av:'AV34TFPrvCpo',fld:'vTFPRVCPO',pic:''},{av:'AV35TFPrvCpo_Sel',fld:'vTFPRVCPO_SEL',pic:''},{av:'AV36TFPrvCp2',fld:'vTFPRVCP2',pic:''},{av:'AV37TFPrvCp2_Sel',fld:'vTFPRVCP2_SEL',pic:''},{av:'AV38TFPrvNif',fld:'vTFPRVNIF',pic:''},{av:'AV39TFPrvNif_Sel',fld:'vTFPRVNIF_SEL',pic:''},{av:'AV40TFPrvTlf',fld:'vTFPRVTLF',pic:''},{av:'AV41TFPrvTlf_Sel',fld:'vTFPRVTLF_SEL',pic:''},{av:'AV42TFPrvTlx',fld:'vTFPRVTLX',pic:''},{av:'AV43TFPrvTlx_Sel',fld:'vTFPRVTLX_SEL',pic:''},{av:'AV44TFPrvFax',fld:'vTFPRVFAX',pic:''},{av:'AV45TFPrvFax_Sel',fld:'vTFPRVFAX_SEL',pic:''},{av:'AV46TFPrvMail',fld:'vTFPRVMAIL',pic:''},{av:'AV47TFPrvMail_Sel',fld:'vTFPRVMAIL_SEL',pic:''},{av:'AV48TFFpgCod',fld:'vTFFPGCOD',pic:'@!'},{av:'AV49TFFpgCod_Sel',fld:'vTFFPGCOD_SEL',pic:'@!'},{av:'AV50TFFpgDsc',fld:'vTFFPGDSC',pic:''},{av:'AV51TFFpgDsc_Sel',fld:'vTFFPGDSC_SEL',pic:''},{av:'AV52TFPrvVto',fld:'vTFPRVVTO',pic:'Z9'},{av:'AV53TFPrvVto_To',fld:'vTFPRVVTO_TO',pic:'Z9'},{av:'AV54TFPrvDiaPag',fld:'vTFPRVDIAPAG',pic:'ZZZZZ9'},{av:'AV55TFPrvDiaPag_To',fld:'vTFPRVDIAPAG_TO',pic:'ZZZZZ9'},{av:'AV56TFPrvPer',fld:'vTFPRVPER',pic:'ZZZZZ9'},{av:'AV57TFPrvPer_To',fld:'vTFPRVPER_TO',pic:'ZZZZZ9'},{av:'AV58TFPrvRep',fld:'vTFPRVREP',pic:''},{av:'AV59TFPrvRep_Sel',fld:'vTFPRVREP_SEL',pic:''},{av:'AV60TFPrvPlaEnt',fld:'vTFPRVPLAENT',pic:'ZZ9'},{av:'AV61TFPrvPlaEnt_To',fld:'vTFPRVPLAENT_TO',pic:'ZZ9'},{av:'AV63TFPrvMetTra_Sels',fld:'vTFPRVMETTRA_SELS',pic:''},{av:'AV64TFPrvCta',fld:'vTFPRVCTA',pic:''},{av:'AV65TFPrvCta_Sel',fld:'vTFPRVCTA_SEL',pic:''},{av:'AV77Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV62TFPrvMetTra_SelsJson',fld:'vTFPRVMETTRA_SELSJSON',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV27TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV28TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV29TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV30TFPrvDir',fld:'vTFPRVDIR',pic:''},{av:'AV31TFPrvDir_Sel',fld:'vTFPRVDIR_SEL',pic:''},{av:'AV32TFPrvPob',fld:'vTFPRVPOB',pic:''},{av:'AV33TFPrvPob_Sel',fld:'vTFPRVPOB_SEL',pic:''},{av:'AV34TFPrvCpo',fld:'vTFPRVCPO',pic:''},{av:'AV35TFPrvCpo_Sel',fld:'vTFPRVCPO_SEL',pic:''},{av:'AV36TFPrvCp2',fld:'vTFPRVCP2',pic:''},{av:'AV37TFPrvCp2_Sel',fld:'vTFPRVCP2_SEL',pic:''},{av:'AV38TFPrvNif',fld:'vTFPRVNIF',pic:''},{av:'AV39TFPrvNif_Sel',fld:'vTFPRVNIF_SEL',pic:''},{av:'AV40TFPrvTlf',fld:'vTFPRVTLF',pic:''},{av:'AV41TFPrvTlf_Sel',fld:'vTFPRVTLF_SEL',pic:''},{av:'AV42TFPrvTlx',fld:'vTFPRVTLX',pic:''},{av:'AV43TFPrvTlx_Sel',fld:'vTFPRVTLX_SEL',pic:''},{av:'AV44TFPrvFax',fld:'vTFPRVFAX',pic:''},{av:'AV45TFPrvFax_Sel',fld:'vTFPRVFAX_SEL',pic:''},{av:'AV46TFPrvMail',fld:'vTFPRVMAIL',pic:''},{av:'AV47TFPrvMail_Sel',fld:'vTFPRVMAIL_SEL',pic:''},{av:'AV48TFFpgCod',fld:'vTFFPGCOD',pic:'@!'},{av:'AV49TFFpgCod_Sel',fld:'vTFFPGCOD_SEL',pic:'@!'},{av:'AV50TFFpgDsc',fld:'vTFFPGDSC',pic:''},{av:'AV51TFFpgDsc_Sel',fld:'vTFFPGDSC_SEL',pic:''},{av:'AV52TFPrvVto',fld:'vTFPRVVTO',pic:'Z9'},{av:'AV53TFPrvVto_To',fld:'vTFPRVVTO_TO',pic:'Z9'},{av:'AV54TFPrvDiaPag',fld:'vTFPRVDIAPAG',pic:'ZZZZZ9'},{av:'AV55TFPrvDiaPag_To',fld:'vTFPRVDIAPAG_TO',pic:'ZZZZZ9'},{av:'AV56TFPrvPer',fld:'vTFPRVPER',pic:'ZZZZZ9'},{av:'AV57TFPrvPer_To',fld:'vTFPRVPER_TO',pic:'ZZZZZ9'},{av:'AV58TFPrvRep',fld:'vTFPRVREP',pic:''},{av:'AV59TFPrvRep_Sel',fld:'vTFPRVREP_SEL',pic:''},{av:'AV60TFPrvPlaEnt',fld:'vTFPRVPLAENT',pic:'ZZ9'},{av:'AV61TFPrvPlaEnt_To',fld:'vTFPRVPLAENT_TO',pic:'ZZ9'},{av:'AV63TFPrvMetTra_Sels',fld:'vTFPRVMETTRA_SELS',pic:''},{av:'AV64TFPrvCta',fld:'vTFPRVCTA',pic:''},{av:'AV65TFPrvCta_Sel',fld:'vTFPRVCTA_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV62TFPrvMetTra_SelsJson',fld:'vTFPRVMETTRA_SELSJSON',pic:''},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtPrvNum_Visible',ctrl:'PRVNUM',prop:'Visible'},{av:'edtPrvNom_Visible',ctrl:'PRVNOM',prop:'Visible'},{av:'edtPrvDir_Visible',ctrl:'PRVDIR',prop:'Visible'},{av:'edtPrvPob_Visible',ctrl:'PRVPOB',prop:'Visible'},{av:'edtPrvCpo_Visible',ctrl:'PRVCPO',prop:'Visible'},{av:'edtPrvCp2_Visible',ctrl:'PRVCP2',prop:'Visible'},{av:'edtPrvNif_Visible',ctrl:'PRVNIF',prop:'Visible'},{av:'edtPrvTlf_Visible',ctrl:'PRVTLF',prop:'Visible'},{av:'edtPrvTlx_Visible',ctrl:'PRVTLX',prop:'Visible'},{av:'edtPrvFax_Visible',ctrl:'PRVFAX',prop:'Visible'},{av:'edtPrvMail_Visible',ctrl:'PRVMAIL',prop:'Visible'},{av:'edtFpgCod_Visible',ctrl:'FPGCOD',prop:'Visible'},{av:'edtFpgDsc_Visible',ctrl:'FPGDSC',prop:'Visible'},{av:'edtPrvVto_Visible',ctrl:'PRVVTO',prop:'Visible'},{av:'edtPrvDiaPag_Visible',ctrl:'PRVDIAPAG',prop:'Visible'},{av:'edtPrvPer_Visible',ctrl:'PRVPER',prop:'Visible'},{av:'edtPrvRep_Visible',ctrl:'PRVREP',prop:'Visible'},{av:'edtPrvPlaEnt_Visible',ctrl:'PRVPLAENT',prop:'Visible'},{av:'cmbPrvMetTra'},{av:'edtPrvCta_Visible',ctrl:'PRVCTA',prop:'Visible'},{av:'AV68GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV69GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e161RJ2',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e181RJ2',iparms:[{av:'AV70Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV73ImpCod',fld:'vIMPCOD',pic:''},{av:'AV71PrvNumFrom',fld:'vPRVNUMFROM',pic:'ZZZZZ9'},{av:'AV72PrvNumTo',fld:'vPRVNUMTO',pic:'ZZZZZ9'},{av:'AV74ImpTam',fld:'vIMPTAM',pic:'ZZZ9'}]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'},{av:'AV74ImpTam',fld:'vIMPTAM',pic:'ZZZ9'},{av:'AV72PrvNumTo',fld:'vPRVNUMTO',pic:'ZZZZZ9'},{av:'AV71PrvNumFrom',fld:'vPRVNUMFROM',pic:'ZZZZZ9'},{av:'AV73ImpCod',fld:'vIMPCOD',pic:''},{av:'AV70Emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e171RJ2',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VALID_PRVNUM","{handler:'valid_Prvnum',iparms:[]");
      setEventMetadata("VALID_PRVNUM",",oparms:[]}");
      setEventMetadata("VALID_PRVNOM","{handler:'valid_Prvnom',iparms:[]");
      setEventMetadata("VALID_PRVNOM",",oparms:[]}");
      setEventMetadata("VALID_PRVDIR","{handler:'valid_Prvdir',iparms:[]");
      setEventMetadata("VALID_PRVDIR",",oparms:[]}");
      setEventMetadata("VALID_PRVPOB","{handler:'valid_Prvpob',iparms:[]");
      setEventMetadata("VALID_PRVPOB",",oparms:[]}");
      setEventMetadata("VALID_PRVCPO","{handler:'valid_Prvcpo',iparms:[]");
      setEventMetadata("VALID_PRVCPO",",oparms:[]}");
      setEventMetadata("VALID_PRVCP2","{handler:'valid_Prvcp2',iparms:[]");
      setEventMetadata("VALID_PRVCP2",",oparms:[]}");
      setEventMetadata("VALID_PRVNIF","{handler:'valid_Prvnif',iparms:[]");
      setEventMetadata("VALID_PRVNIF",",oparms:[]}");
      setEventMetadata("VALID_PRVTLF","{handler:'valid_Prvtlf',iparms:[]");
      setEventMetadata("VALID_PRVTLF",",oparms:[]}");
      setEventMetadata("VALID_PRVTLX","{handler:'valid_Prvtlx',iparms:[]");
      setEventMetadata("VALID_PRVTLX",",oparms:[]}");
      setEventMetadata("VALID_PRVFAX","{handler:'valid_Prvfax',iparms:[]");
      setEventMetadata("VALID_PRVFAX",",oparms:[]}");
      setEventMetadata("VALID_PRVMAIL","{handler:'valid_Prvmail',iparms:[]");
      setEventMetadata("VALID_PRVMAIL",",oparms:[]}");
      setEventMetadata("VALID_FPGCOD","{handler:'valid_Fpgcod',iparms:[]");
      setEventMetadata("VALID_FPGCOD",",oparms:[]}");
      setEventMetadata("VALID_FPGDSC","{handler:'valid_Fpgdsc',iparms:[]");
      setEventMetadata("VALID_FPGDSC",",oparms:[]}");
      setEventMetadata("VALID_PRVVTO","{handler:'valid_Prvvto',iparms:[]");
      setEventMetadata("VALID_PRVVTO",",oparms:[]}");
      setEventMetadata("VALID_PRVDIAPAG","{handler:'valid_Prvdiapag',iparms:[]");
      setEventMetadata("VALID_PRVDIAPAG",",oparms:[]}");
      setEventMetadata("VALID_PRVPER","{handler:'valid_Prvper',iparms:[]");
      setEventMetadata("VALID_PRVPER",",oparms:[]}");
      setEventMetadata("VALID_PRVREP","{handler:'valid_Prvrep',iparms:[]");
      setEventMetadata("VALID_PRVREP",",oparms:[]}");
      setEventMetadata("VALID_PRVPLAENT","{handler:'valid_Prvplaent',iparms:[]");
      setEventMetadata("VALID_PRVPLAENT",",oparms:[]}");
      setEventMetadata("VALID_PRVMETTRA","{handler:'valid_Prvmettra',iparms:[]");
      setEventMetadata("VALID_PRVMETTRA",",oparms:[]}");
      setEventMetadata("VALID_PRVCTA","{handler:'valid_Prvcta',iparms:[]");
      setEventMetadata("VALID_PRVCTA",",oparms:[]}");
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
      wcpOAV70Emprcod = "" ;
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
      AV70Emprcod = "" ;
      AV20ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV15FilterFullText = "" ;
      AV28TFPrvNom = "" ;
      AV29TFPrvNom_Sel = "" ;
      AV30TFPrvDir = "" ;
      AV31TFPrvDir_Sel = "" ;
      AV32TFPrvPob = "" ;
      AV33TFPrvPob_Sel = "" ;
      AV34TFPrvCpo = "" ;
      AV35TFPrvCpo_Sel = "" ;
      AV36TFPrvCp2 = "" ;
      AV37TFPrvCp2_Sel = "" ;
      AV38TFPrvNif = "" ;
      AV39TFPrvNif_Sel = "" ;
      AV40TFPrvTlf = "" ;
      AV41TFPrvTlf_Sel = "" ;
      AV42TFPrvTlx = "" ;
      AV43TFPrvTlx_Sel = "" ;
      AV44TFPrvFax = "" ;
      AV45TFPrvFax_Sel = "" ;
      AV46TFPrvMail = "" ;
      AV47TFPrvMail_Sel = "" ;
      AV48TFFpgCod = "" ;
      AV49TFFpgCod_Sel = "" ;
      AV50TFFpgDsc = "" ;
      AV51TFFpgDsc_Sel = "" ;
      AV58TFPrvRep = "" ;
      AV59TFPrvRep_Sel = "" ;
      AV63TFPrvMetTra_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV64TFPrvCta = "" ;
      AV65TFPrvCta_Sel = "" ;
      AV77Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV23ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV66DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV62TFPrvMetTra_SelsJson = "" ;
      AV73ImpCod = "" ;
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
      bttBtnexportreport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucInnewwindow1 = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A794PrvNom = "" ;
      A786PrvDir = "" ;
      A799PrvPob = "" ;
      A782PrvCpo = "" ;
      A6075PrvCp2 = "" ;
      A793PrvNif = "" ;
      A803PrvTlf = "" ;
      A804PrvTlx = "" ;
      A6076PrvFax = "" ;
      A6077PrvMail = "" ;
      A497FpgCod = "" ;
      A498FpgDsc = "" ;
      A801PrvRep = "" ;
      A792PrvMetTra = "" ;
      A783PrvCta = "" ;
      AV81Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext = "" ;
      AV84Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom = "" ;
      AV85Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel = "" ;
      AV86Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir = "" ;
      AV87Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel = "" ;
      AV88Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob = "" ;
      AV89Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel = "" ;
      AV90Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo = "" ;
      AV91Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel = "" ;
      AV92Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 = "" ;
      AV93Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel = "" ;
      AV94Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif = "" ;
      AV95Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel = "" ;
      AV96Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf = "" ;
      AV97Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel = "" ;
      AV98Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx = "" ;
      AV99Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel = "" ;
      AV100Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax = "" ;
      AV101Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel = "" ;
      AV102Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail = "" ;
      AV103Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel = "" ;
      AV104Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod = "" ;
      AV105Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel = "" ;
      AV106Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc = "" ;
      AV107Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel = "" ;
      AV114Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep = "" ;
      AV115Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel = "" ;
      AV118Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV119Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta = "" ;
      AV120Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel = "" ;
      scmdbuf = "" ;
      lV81Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext = "" ;
      lV84Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom = "" ;
      lV86Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir = "" ;
      lV88Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob = "" ;
      lV90Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo = "" ;
      lV92Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 = "" ;
      lV94Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif = "" ;
      lV96Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf = "" ;
      lV98Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx = "" ;
      lV100Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax = "" ;
      lV102Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail = "" ;
      lV104Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod = "" ;
      lV106Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc = "" ;
      lV114Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep = "" ;
      lV119Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta = "" ;
      A396EmprCod = "" ;
      H01RJ2_A396EmprCod = new String[] {""} ;
      H01RJ2_A783PrvCta = new String[] {""} ;
      H01RJ2_n783PrvCta = new boolean[] {false} ;
      H01RJ2_A792PrvMetTra = new String[] {""} ;
      H01RJ2_n792PrvMetTra = new boolean[] {false} ;
      H01RJ2_A798PrvPlaEnt = new short[1] ;
      H01RJ2_n798PrvPlaEnt = new boolean[] {false} ;
      H01RJ2_A801PrvRep = new String[] {""} ;
      H01RJ2_n801PrvRep = new boolean[] {false} ;
      H01RJ2_A797PrvPer = new int[1] ;
      H01RJ2_n797PrvPer = new boolean[] {false} ;
      H01RJ2_A785PrvDiaPag = new int[1] ;
      H01RJ2_n785PrvDiaPag = new boolean[] {false} ;
      H01RJ2_A805PrvVto = new byte[1] ;
      H01RJ2_n805PrvVto = new boolean[] {false} ;
      H01RJ2_A498FpgDsc = new String[] {""} ;
      H01RJ2_n498FpgDsc = new boolean[] {false} ;
      H01RJ2_A497FpgCod = new String[] {""} ;
      H01RJ2_n497FpgCod = new boolean[] {false} ;
      H01RJ2_A6077PrvMail = new String[] {""} ;
      H01RJ2_n6077PrvMail = new boolean[] {false} ;
      H01RJ2_A6076PrvFax = new String[] {""} ;
      H01RJ2_n6076PrvFax = new boolean[] {false} ;
      H01RJ2_A804PrvTlx = new String[] {""} ;
      H01RJ2_n804PrvTlx = new boolean[] {false} ;
      H01RJ2_A803PrvTlf = new String[] {""} ;
      H01RJ2_n803PrvTlf = new boolean[] {false} ;
      H01RJ2_A793PrvNif = new String[] {""} ;
      H01RJ2_n793PrvNif = new boolean[] {false} ;
      H01RJ2_A6075PrvCp2 = new String[] {""} ;
      H01RJ2_n6075PrvCp2 = new boolean[] {false} ;
      H01RJ2_A782PrvCpo = new String[] {""} ;
      H01RJ2_n782PrvCpo = new boolean[] {false} ;
      H01RJ2_A799PrvPob = new String[] {""} ;
      H01RJ2_n799PrvPob = new boolean[] {false} ;
      H01RJ2_A786PrvDir = new String[] {""} ;
      H01RJ2_n786PrvDir = new boolean[] {false} ;
      H01RJ2_A794PrvNom = new String[] {""} ;
      H01RJ2_n794PrvNom = new boolean[] {false} ;
      H01RJ2_A795PrvNum = new int[1] ;
      H01RJ3_A396EmprCod = new String[] {""} ;
      H01RJ3_A783PrvCta = new String[] {""} ;
      H01RJ3_n783PrvCta = new boolean[] {false} ;
      H01RJ3_A792PrvMetTra = new String[] {""} ;
      H01RJ3_n792PrvMetTra = new boolean[] {false} ;
      H01RJ3_A798PrvPlaEnt = new short[1] ;
      H01RJ3_n798PrvPlaEnt = new boolean[] {false} ;
      H01RJ3_A801PrvRep = new String[] {""} ;
      H01RJ3_n801PrvRep = new boolean[] {false} ;
      H01RJ3_A797PrvPer = new int[1] ;
      H01RJ3_n797PrvPer = new boolean[] {false} ;
      H01RJ3_A785PrvDiaPag = new int[1] ;
      H01RJ3_n785PrvDiaPag = new boolean[] {false} ;
      H01RJ3_A805PrvVto = new byte[1] ;
      H01RJ3_n805PrvVto = new boolean[] {false} ;
      H01RJ3_A498FpgDsc = new String[] {""} ;
      H01RJ3_n498FpgDsc = new boolean[] {false} ;
      H01RJ3_A497FpgCod = new String[] {""} ;
      H01RJ3_n497FpgCod = new boolean[] {false} ;
      H01RJ3_A6077PrvMail = new String[] {""} ;
      H01RJ3_n6077PrvMail = new boolean[] {false} ;
      H01RJ3_A6076PrvFax = new String[] {""} ;
      H01RJ3_n6076PrvFax = new boolean[] {false} ;
      H01RJ3_A804PrvTlx = new String[] {""} ;
      H01RJ3_n804PrvTlx = new boolean[] {false} ;
      H01RJ3_A803PrvTlf = new String[] {""} ;
      H01RJ3_n803PrvTlf = new boolean[] {false} ;
      H01RJ3_A793PrvNif = new String[] {""} ;
      H01RJ3_n793PrvNif = new boolean[] {false} ;
      H01RJ3_A6075PrvCp2 = new String[] {""} ;
      H01RJ3_n6075PrvCp2 = new boolean[] {false} ;
      H01RJ3_A782PrvCpo = new String[] {""} ;
      H01RJ3_n782PrvCpo = new boolean[] {false} ;
      H01RJ3_A799PrvPob = new String[] {""} ;
      H01RJ3_n799PrvPob = new boolean[] {false} ;
      H01RJ3_A786PrvDir = new String[] {""} ;
      H01RJ3_n786PrvDir = new boolean[] {false} ;
      H01RJ3_A794PrvNom = new String[] {""} ;
      H01RJ3_n794PrvNom = new boolean[] {false} ;
      H01RJ3_A795PrvNum = new int[1] ;
      hsh = "" ;
      AV78Station = "" ;
      AV79Emprnom = "" ;
      AV80Usurcod = "" ;
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
      GXv_char2 = new String[1] ;
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
      GXt_char14 = "" ;
      GXv_char15 = new String[1] ;
      GXt_char13 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char12 = "" ;
      GXv_char3 = new String[1] ;
      GXv_SdtWWPGridState38 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV70Emprcod = "" ;
      sCtrlAV71PrvNumFrom = "" ;
      sCtrlAV72PrvNumTo = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.listadodeproveedores_wc__default(),
         new Object[] {
             new Object[] {
            H01RJ2_A396EmprCod, H01RJ2_A783PrvCta, H01RJ2_n783PrvCta, H01RJ2_A792PrvMetTra, H01RJ2_n792PrvMetTra, H01RJ2_A798PrvPlaEnt, H01RJ2_n798PrvPlaEnt, H01RJ2_A801PrvRep, H01RJ2_n801PrvRep, H01RJ2_A797PrvPer,
            H01RJ2_n797PrvPer, H01RJ2_A785PrvDiaPag, H01RJ2_n785PrvDiaPag, H01RJ2_A805PrvVto, H01RJ2_n805PrvVto, H01RJ2_A498FpgDsc, H01RJ2_n498FpgDsc, H01RJ2_A497FpgCod, H01RJ2_n497FpgCod, H01RJ2_A6077PrvMail,
            H01RJ2_n6077PrvMail, H01RJ2_A6076PrvFax, H01RJ2_n6076PrvFax, H01RJ2_A804PrvTlx, H01RJ2_n804PrvTlx, H01RJ2_A803PrvTlf, H01RJ2_n803PrvTlf, H01RJ2_A793PrvNif, H01RJ2_n793PrvNif, H01RJ2_A6075PrvCp2,
            H01RJ2_n6075PrvCp2, H01RJ2_A782PrvCpo, H01RJ2_n782PrvCpo, H01RJ2_A799PrvPob, H01RJ2_n799PrvPob, H01RJ2_A786PrvDir, H01RJ2_n786PrvDir, H01RJ2_A794PrvNom, H01RJ2_n794PrvNom, H01RJ2_A795PrvNum
            }
            , new Object[] {
            H01RJ3_A396EmprCod, H01RJ3_A783PrvCta, H01RJ3_n783PrvCta, H01RJ3_A792PrvMetTra, H01RJ3_n792PrvMetTra, H01RJ3_A798PrvPlaEnt, H01RJ3_n798PrvPlaEnt, H01RJ3_A801PrvRep, H01RJ3_n801PrvRep, H01RJ3_A797PrvPer,
            H01RJ3_n797PrvPer, H01RJ3_A785PrvDiaPag, H01RJ3_n785PrvDiaPag, H01RJ3_A805PrvVto, H01RJ3_n805PrvVto, H01RJ3_A498FpgDsc, H01RJ3_n498FpgDsc, H01RJ3_A497FpgCod, H01RJ3_n497FpgCod, H01RJ3_A6077PrvMail,
            H01RJ3_n6077PrvMail, H01RJ3_A6076PrvFax, H01RJ3_n6076PrvFax, H01RJ3_A804PrvTlx, H01RJ3_n804PrvTlx, H01RJ3_A803PrvTlf, H01RJ3_n803PrvTlf, H01RJ3_A793PrvNif, H01RJ3_n793PrvNif, H01RJ3_A6075PrvCp2,
            H01RJ3_n6075PrvCp2, H01RJ3_A782PrvCpo, H01RJ3_n782PrvCpo, H01RJ3_A799PrvPob, H01RJ3_n799PrvPob, H01RJ3_A786PrvDir, H01RJ3_n786PrvDir, H01RJ3_A794PrvNom, H01RJ3_n794PrvNom, H01RJ3_A795PrvNum
            }
         }
      );
      AV77Pgmname = "StocksQuimicos.ListadodeProveedores_WC" ;
      /* GeneXus formulas. */
      AV77Pgmname = "StocksQuimicos.ListadodeProveedores_WC" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV25ManageFiltersExecutionStep ;
   private byte AV52TFPrvVto ;
   private byte AV53TFPrvVto_To ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A805PrvVto ;
   private byte nDonePA ;
   private byte AV108Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto ;
   private byte AV109Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV60TFPrvPlaEnt ;
   private short AV61TFPrvPlaEnt_To ;
   private short AV12OrderedBy ;
   private short AV74ImpTam ;
   private short wbEnd ;
   private short wbStart ;
   private short A798PrvPlaEnt ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV116Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent ;
   private short AV117Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to ;
   private int wcpOAV71PrvNumFrom ;
   private int wcpOAV72PrvNumTo ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_43 ;
   private int AV71PrvNumFrom ;
   private int AV72PrvNumTo ;
   private int nGXsfl_43_idx=1 ;
   private int AV26TFPrvNum ;
   private int AV27TFPrvNum_To ;
   private int AV54TFPrvDiaPag ;
   private int AV55TFPrvDiaPag_To ;
   private int AV56TFPrvPer ;
   private int AV57TFPrvPer_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPgmname_Enabled ;
   private int A795PrvNum ;
   private int A785PrvDiaPag ;
   private int A797PrvPer ;
   private int subGrid_Islastpage ;
   private int AV82Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum ;
   private int AV83Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to ;
   private int AV110Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag ;
   private int AV111Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to ;
   private int AV112Stocksquimicos_listadodeproveedores_wcds_32_tfprvper ;
   private int AV113Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to ;
   private int AV118Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels_size ;
   private int edtPrvNum_Visible ;
   private int edtPrvNom_Visible ;
   private int edtPrvDir_Visible ;
   private int edtPrvPob_Visible ;
   private int edtPrvCpo_Visible ;
   private int edtPrvCp2_Visible ;
   private int edtPrvNif_Visible ;
   private int edtPrvTlf_Visible ;
   private int edtPrvTlx_Visible ;
   private int edtPrvFax_Visible ;
   private int edtPrvMail_Visible ;
   private int edtFpgCod_Visible ;
   private int edtFpgDsc_Visible ;
   private int edtPrvVto_Visible ;
   private int edtPrvDiaPag_Visible ;
   private int edtPrvPer_Visible ;
   private int edtPrvRep_Visible ;
   private int edtPrvPlaEnt_Visible ;
   private int edtPrvCta_Visible ;
   private int AV67PageToGo ;
   private int AV121GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV68GridCurrentPage ;
   private long AV69GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String wcpOAV70Emprcod ;
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
   private String AV70Emprcod ;
   private String sGXsfl_43_idx="0001" ;
   private String AV28TFPrvNom ;
   private String AV29TFPrvNom_Sel ;
   private String AV30TFPrvDir ;
   private String AV31TFPrvDir_Sel ;
   private String AV32TFPrvPob ;
   private String AV33TFPrvPob_Sel ;
   private String AV34TFPrvCpo ;
   private String AV35TFPrvCpo_Sel ;
   private String AV36TFPrvCp2 ;
   private String AV37TFPrvCp2_Sel ;
   private String AV38TFPrvNif ;
   private String AV39TFPrvNif_Sel ;
   private String AV40TFPrvTlf ;
   private String AV41TFPrvTlf_Sel ;
   private String AV42TFPrvTlx ;
   private String AV43TFPrvTlx_Sel ;
   private String AV44TFPrvFax ;
   private String AV45TFPrvFax_Sel ;
   private String AV46TFPrvMail ;
   private String AV47TFPrvMail_Sel ;
   private String AV48TFFpgCod ;
   private String AV49TFFpgCod_Sel ;
   private String AV50TFFpgDsc ;
   private String AV51TFFpgDsc_Sel ;
   private String AV58TFPrvRep ;
   private String AV59TFPrvRep_Sel ;
   private String AV64TFPrvCta ;
   private String AV65TFPrvCta_Sel ;
   private String AV77Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV73ImpCod ;
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
   private String Innewwindow1_Width ;
   private String Innewwindow1_Height ;
   private String Innewwindow1_Target ;
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
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableactions_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtnexport_Internalname ;
   private String bttBtnexport_Jsonclick ;
   private String bttBtnexportreport_Internalname ;
   private String bttBtnexportreport_Jsonclick ;
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
   private String Innewwindow1_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavFilterfulltext_Internalname ;
   private String edtPrvNum_Internalname ;
   private String A794PrvNom ;
   private String edtPrvNom_Internalname ;
   private String A786PrvDir ;
   private String edtPrvDir_Internalname ;
   private String A799PrvPob ;
   private String edtPrvPob_Internalname ;
   private String A782PrvCpo ;
   private String edtPrvCpo_Internalname ;
   private String A6075PrvCp2 ;
   private String edtPrvCp2_Internalname ;
   private String A793PrvNif ;
   private String edtPrvNif_Internalname ;
   private String A803PrvTlf ;
   private String edtPrvTlf_Internalname ;
   private String A804PrvTlx ;
   private String edtPrvTlx_Internalname ;
   private String A6076PrvFax ;
   private String edtPrvFax_Internalname ;
   private String A6077PrvMail ;
   private String edtPrvMail_Internalname ;
   private String A497FpgCod ;
   private String edtFpgCod_Internalname ;
   private String A498FpgDsc ;
   private String edtFpgDsc_Internalname ;
   private String edtPrvVto_Internalname ;
   private String edtPrvDiaPag_Internalname ;
   private String edtPrvPer_Internalname ;
   private String A801PrvRep ;
   private String edtPrvRep_Internalname ;
   private String edtPrvPlaEnt_Internalname ;
   private String A792PrvMetTra ;
   private String A783PrvCta ;
   private String edtPrvCta_Internalname ;
   private String AV84Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom ;
   private String AV85Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel ;
   private String AV86Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir ;
   private String AV87Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel ;
   private String AV88Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob ;
   private String AV89Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel ;
   private String AV90Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo ;
   private String AV91Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel ;
   private String AV92Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 ;
   private String AV93Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel ;
   private String AV94Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif ;
   private String AV95Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel ;
   private String AV96Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf ;
   private String AV97Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel ;
   private String AV98Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx ;
   private String AV99Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel ;
   private String AV100Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax ;
   private String AV101Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel ;
   private String AV102Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail ;
   private String AV103Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel ;
   private String AV104Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod ;
   private String AV105Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel ;
   private String AV106Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc ;
   private String AV107Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel ;
   private String AV114Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep ;
   private String AV115Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel ;
   private String AV119Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta ;
   private String AV120Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel ;
   private String scmdbuf ;
   private String lV84Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom ;
   private String lV86Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir ;
   private String lV88Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob ;
   private String lV90Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo ;
   private String lV92Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 ;
   private String lV94Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif ;
   private String lV96Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf ;
   private String lV98Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx ;
   private String lV100Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax ;
   private String lV102Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail ;
   private String lV104Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod ;
   private String lV106Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc ;
   private String lV114Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep ;
   private String lV119Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta ;
   private String A396EmprCod ;
   private String hsh ;
   private String AV78Station ;
   private String AV79Emprnom ;
   private String AV80Usurcod ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
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
   private String GXt_char14 ;
   private String GXv_char15[] ;
   private String GXt_char13 ;
   private String GXv_char4[] ;
   private String GXt_char12 ;
   private String GXv_char3[] ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV70Emprcod ;
   private String sCtrlAV71PrvNumFrom ;
   private String sCtrlAV72PrvNumTo ;
   private String sGXsfl_43_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtPrvNum_Jsonclick ;
   private String edtPrvNom_Jsonclick ;
   private String edtPrvDir_Jsonclick ;
   private String edtPrvPob_Jsonclick ;
   private String edtPrvCpo_Jsonclick ;
   private String edtPrvCp2_Jsonclick ;
   private String edtPrvNif_Jsonclick ;
   private String edtPrvTlf_Jsonclick ;
   private String edtPrvTlx_Jsonclick ;
   private String edtPrvFax_Jsonclick ;
   private String edtPrvMail_Jsonclick ;
   private String edtFpgCod_Jsonclick ;
   private String edtFpgDsc_Jsonclick ;
   private String edtPrvVto_Jsonclick ;
   private String edtPrvDiaPag_Jsonclick ;
   private String edtPrvPer_Jsonclick ;
   private String edtPrvRep_Jsonclick ;
   private String edtPrvPlaEnt_Jsonclick ;
   private String GXCCtl ;
   private String edtPrvCta_Jsonclick ;
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
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n794PrvNom ;
   private boolean n786PrvDir ;
   private boolean n799PrvPob ;
   private boolean n782PrvCpo ;
   private boolean n6075PrvCp2 ;
   private boolean n793PrvNif ;
   private boolean n803PrvTlf ;
   private boolean n804PrvTlx ;
   private boolean n6076PrvFax ;
   private boolean n6077PrvMail ;
   private boolean n497FpgCod ;
   private boolean n498FpgDsc ;
   private boolean n805PrvVto ;
   private boolean n785PrvDiaPag ;
   private boolean n797PrvPer ;
   private boolean n801PrvRep ;
   private boolean n798PrvPlaEnt ;
   private boolean n792PrvMetTra ;
   private boolean n783PrvCta ;
   private boolean bGXsfl_43_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV62TFPrvMetTra_SelsJson ;
   private String AV18ColumnsSelectorXML ;
   private String AV24ManageFiltersXml ;
   private String AV19UserCustomValue ;
   private String AV15FilterFullText ;
   private String AV81Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext ;
   private String lV81Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext ;
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
   private com.genexus.webpanels.GXUserControl ucInnewwindow1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbPrvMetTra ;
   private IDataStoreProvider pr_default ;
   private String[] H01RJ2_A396EmprCod ;
   private String[] H01RJ2_A783PrvCta ;
   private boolean[] H01RJ2_n783PrvCta ;
   private String[] H01RJ2_A792PrvMetTra ;
   private boolean[] H01RJ2_n792PrvMetTra ;
   private short[] H01RJ2_A798PrvPlaEnt ;
   private boolean[] H01RJ2_n798PrvPlaEnt ;
   private String[] H01RJ2_A801PrvRep ;
   private boolean[] H01RJ2_n801PrvRep ;
   private int[] H01RJ2_A797PrvPer ;
   private boolean[] H01RJ2_n797PrvPer ;
   private int[] H01RJ2_A785PrvDiaPag ;
   private boolean[] H01RJ2_n785PrvDiaPag ;
   private byte[] H01RJ2_A805PrvVto ;
   private boolean[] H01RJ2_n805PrvVto ;
   private String[] H01RJ2_A498FpgDsc ;
   private boolean[] H01RJ2_n498FpgDsc ;
   private String[] H01RJ2_A497FpgCod ;
   private boolean[] H01RJ2_n497FpgCod ;
   private String[] H01RJ2_A6077PrvMail ;
   private boolean[] H01RJ2_n6077PrvMail ;
   private String[] H01RJ2_A6076PrvFax ;
   private boolean[] H01RJ2_n6076PrvFax ;
   private String[] H01RJ2_A804PrvTlx ;
   private boolean[] H01RJ2_n804PrvTlx ;
   private String[] H01RJ2_A803PrvTlf ;
   private boolean[] H01RJ2_n803PrvTlf ;
   private String[] H01RJ2_A793PrvNif ;
   private boolean[] H01RJ2_n793PrvNif ;
   private String[] H01RJ2_A6075PrvCp2 ;
   private boolean[] H01RJ2_n6075PrvCp2 ;
   private String[] H01RJ2_A782PrvCpo ;
   private boolean[] H01RJ2_n782PrvCpo ;
   private String[] H01RJ2_A799PrvPob ;
   private boolean[] H01RJ2_n799PrvPob ;
   private String[] H01RJ2_A786PrvDir ;
   private boolean[] H01RJ2_n786PrvDir ;
   private String[] H01RJ2_A794PrvNom ;
   private boolean[] H01RJ2_n794PrvNom ;
   private int[] H01RJ2_A795PrvNum ;
   private String[] H01RJ3_A396EmprCod ;
   private String[] H01RJ3_A783PrvCta ;
   private boolean[] H01RJ3_n783PrvCta ;
   private String[] H01RJ3_A792PrvMetTra ;
   private boolean[] H01RJ3_n792PrvMetTra ;
   private short[] H01RJ3_A798PrvPlaEnt ;
   private boolean[] H01RJ3_n798PrvPlaEnt ;
   private String[] H01RJ3_A801PrvRep ;
   private boolean[] H01RJ3_n801PrvRep ;
   private int[] H01RJ3_A797PrvPer ;
   private boolean[] H01RJ3_n797PrvPer ;
   private int[] H01RJ3_A785PrvDiaPag ;
   private boolean[] H01RJ3_n785PrvDiaPag ;
   private byte[] H01RJ3_A805PrvVto ;
   private boolean[] H01RJ3_n805PrvVto ;
   private String[] H01RJ3_A498FpgDsc ;
   private boolean[] H01RJ3_n498FpgDsc ;
   private String[] H01RJ3_A497FpgCod ;
   private boolean[] H01RJ3_n497FpgCod ;
   private String[] H01RJ3_A6077PrvMail ;
   private boolean[] H01RJ3_n6077PrvMail ;
   private String[] H01RJ3_A6076PrvFax ;
   private boolean[] H01RJ3_n6076PrvFax ;
   private String[] H01RJ3_A804PrvTlx ;
   private boolean[] H01RJ3_n804PrvTlx ;
   private String[] H01RJ3_A803PrvTlf ;
   private boolean[] H01RJ3_n803PrvTlf ;
   private String[] H01RJ3_A793PrvNif ;
   private boolean[] H01RJ3_n793PrvNif ;
   private String[] H01RJ3_A6075PrvCp2 ;
   private boolean[] H01RJ3_n6075PrvCp2 ;
   private String[] H01RJ3_A782PrvCpo ;
   private boolean[] H01RJ3_n782PrvCpo ;
   private String[] H01RJ3_A799PrvPob ;
   private boolean[] H01RJ3_n799PrvPob ;
   private String[] H01RJ3_A786PrvDir ;
   private boolean[] H01RJ3_n786PrvDir ;
   private String[] H01RJ3_A794PrvNom ;
   private boolean[] H01RJ3_n794PrvNom ;
   private int[] H01RJ3_A795PrvNum ;
   private GXSimpleCollection<String> AV63TFPrvMetTra_Sels ;
   private GXSimpleCollection<String> AV118Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV23ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState38[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV21ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV66DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class listadodeproveedores_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01RJ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A792PrvMetTra ,
                                          GXSimpleCollection<String> AV118Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels ,
                                          int AV82Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum ,
                                          int AV83Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to ,
                                          String AV85Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel ,
                                          String AV84Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom ,
                                          String AV87Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel ,
                                          String AV86Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir ,
                                          String AV89Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel ,
                                          String AV88Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob ,
                                          String AV91Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel ,
                                          String AV90Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo ,
                                          String AV93Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel ,
                                          String AV92Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 ,
                                          String AV95Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel ,
                                          String AV94Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif ,
                                          String AV97Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel ,
                                          String AV96Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf ,
                                          String AV99Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel ,
                                          String AV98Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx ,
                                          String AV101Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel ,
                                          String AV100Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax ,
                                          String AV103Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel ,
                                          String AV102Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail ,
                                          String AV105Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel ,
                                          String AV104Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod ,
                                          String AV107Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel ,
                                          String AV106Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc ,
                                          byte AV108Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto ,
                                          byte AV109Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to ,
                                          int AV110Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag ,
                                          int AV111Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to ,
                                          int AV112Stocksquimicos_listadodeproveedores_wcds_32_tfprvper ,
                                          int AV113Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to ,
                                          String AV115Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel ,
                                          String AV114Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep ,
                                          short AV116Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent ,
                                          short AV117Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to ,
                                          int AV118Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels_size ,
                                          String AV120Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel ,
                                          String AV119Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta ,
                                          int AV71PrvNumFrom ,
                                          int AV72PrvNumTo ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          String A786PrvDir ,
                                          String A799PrvPob ,
                                          String A782PrvCpo ,
                                          String A6075PrvCp2 ,
                                          String A793PrvNif ,
                                          String A803PrvTlf ,
                                          String A804PrvTlx ,
                                          String A6076PrvFax ,
                                          String A6077PrvMail ,
                                          String A497FpgCod ,
                                          String A498FpgDsc ,
                                          byte A805PrvVto ,
                                          int A785PrvDiaPag ,
                                          int A797PrvPer ,
                                          String A801PrvRep ,
                                          short A798PrvPlaEnt ,
                                          String A783PrvCta ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV81Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext ,
                                          String AV70Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int39 = new byte[41];
      Object[] GXv_Object40 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PrvCta, T1.PrvMetTra, T1.PrvPlaEnt, T1.PrvRep, T1.PrvPer, T1.PrvDiaPag, T1.PrvVto, T2.FpgDsc, T1.FpgCod, T1.PrvMail, T1.PrvFax, T1.PrvTlx," ;
      scmdbuf += " T1.PrvTlf, T1.PrvNif, T1.PrvCp2, T1.PrvCpo, T1.PrvPob, T1.PrvDir, T1.PrvNom, T1.PrvNum FROM (TXPPRVGEN T1 LEFT JOIN TXPFORPAG T2 ON T2.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T2.FpgCod = T1.FpgCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV82Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int39[1] = (byte)(1) ;
      }
      if ( ! (0==AV83Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int39[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV84Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvNom = ?)");
      }
      else
      {
         GXv_int39[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel)==0) && ( ! (GXutil.strcmp("", AV86Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvDir) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvDir = ?)");
      }
      else
      {
         GXv_int39[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel)==0) && ( ! (GXutil.strcmp("", AV88Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvPob = ?)");
      }
      else
      {
         GXv_int39[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel)==0) && ( ! (GXutil.strcmp("", AV90Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvCpo = ?)");
      }
      else
      {
         GXv_int39[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel)==0) && ( ! (GXutil.strcmp("", AV92Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvCp2 = ?)");
      }
      else
      {
         GXv_int39[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel)==0) && ( ! (GXutil.strcmp("", AV94Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvNif = ?)");
      }
      else
      {
         GXv_int39[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel)==0) && ( ! (GXutil.strcmp("", AV96Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvTlf) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvTlf = ?)");
      }
      else
      {
         GXv_int39[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel)==0) && ( ! (GXutil.strcmp("", AV98Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvTlx) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvTlx = ?)");
      }
      else
      {
         GXv_int39[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel)==0) && ( ! (GXutil.strcmp("", AV100Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvFax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvFax = ?)");
      }
      else
      {
         GXv_int39[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel)==0) && ( ! (GXutil.strcmp("", AV102Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvMail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvMail = ?)");
      }
      else
      {
         GXv_int39[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel)==0) && ( ! (GXutil.strcmp("", AV104Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FpgCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FpgCod = ?)");
      }
      else
      {
         GXv_int39[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel)==0) && ( ! (GXutil.strcmp("", AV106Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FpgDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FpgDsc = ?)");
      }
      else
      {
         GXv_int39[26] = (byte)(1) ;
      }
      if ( ! (0==AV108Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto) )
      {
         addWhere(sWhereString, "(T1.PrvVto >= ?)");
      }
      else
      {
         GXv_int39[27] = (byte)(1) ;
      }
      if ( ! (0==AV109Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to) )
      {
         addWhere(sWhereString, "(T1.PrvVto <= ?)");
      }
      else
      {
         GXv_int39[28] = (byte)(1) ;
      }
      if ( ! (0==AV110Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag) )
      {
         addWhere(sWhereString, "(T1.PrvDiaPag >= ?)");
      }
      else
      {
         GXv_int39[29] = (byte)(1) ;
      }
      if ( ! (0==AV111Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to) )
      {
         addWhere(sWhereString, "(T1.PrvDiaPag <= ?)");
      }
      else
      {
         GXv_int39[30] = (byte)(1) ;
      }
      if ( ! (0==AV112Stocksquimicos_listadodeproveedores_wcds_32_tfprvper) )
      {
         addWhere(sWhereString, "(T1.PrvPer >= ?)");
      }
      else
      {
         GXv_int39[31] = (byte)(1) ;
      }
      if ( ! (0==AV113Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to) )
      {
         addWhere(sWhereString, "(T1.PrvPer <= ?)");
      }
      else
      {
         GXv_int39[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel)==0) && ( ! (GXutil.strcmp("", AV114Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvRep) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvRep = ?)");
      }
      else
      {
         GXv_int39[34] = (byte)(1) ;
      }
      if ( ! (0==AV116Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent) )
      {
         addWhere(sWhereString, "(T1.PrvPlaEnt >= ?)");
      }
      else
      {
         GXv_int39[35] = (byte)(1) ;
      }
      if ( ! (0==AV117Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to) )
      {
         addWhere(sWhereString, "(T1.PrvPlaEnt <= ?)");
      }
      else
      {
         GXv_int39[36] = (byte)(1) ;
      }
      if ( AV118Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV118Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels, "T1.PrvMetTra IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV120Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel)==0) && ( ! (GXutil.strcmp("", AV119Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvCta) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvCta = ?)");
      }
      else
      {
         GXv_int39[38] = (byte)(1) ;
      }
      if ( ! (0==AV71PrvNumFrom) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int39[39] = (byte)(1) ;
      }
      if ( ! (0==AV72PrvNumTo) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int39[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvNom" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvNum" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvDir" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvDir DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvPob" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvPob DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvCpo" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvCpo DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvCp2" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvCp2 DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvNif" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvNif DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvTlf" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvTlf DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvTlx" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvTlx DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvFax" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvFax DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvMail" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvMail DESC" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FpgCod" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FpgCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.FpgDsc" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.FpgDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvVto" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvVto DESC" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvDiaPag" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvDiaPag DESC" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvPer" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvPer DESC" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvRep" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvRep DESC" ;
      }
      else if ( ( AV12OrderedBy == 18 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvPlaEnt" ;
      }
      else if ( ( AV12OrderedBy == 18 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvPlaEnt DESC" ;
      }
      else if ( ( AV12OrderedBy == 19 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvMetTra" ;
      }
      else if ( ( AV12OrderedBy == 19 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvMetTra DESC" ;
      }
      else if ( ( AV12OrderedBy == 20 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvCta" ;
      }
      else if ( ( AV12OrderedBy == 20 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvCta DESC" ;
      }
      GXv_Object40[0] = scmdbuf ;
      GXv_Object40[1] = GXv_int39 ;
      return GXv_Object40 ;
   }

   protected Object[] conditional_H01RJ3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A792PrvMetTra ,
                                          GXSimpleCollection<String> AV118Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels ,
                                          int AV82Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum ,
                                          int AV83Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to ,
                                          String AV85Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel ,
                                          String AV84Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom ,
                                          String AV87Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel ,
                                          String AV86Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir ,
                                          String AV89Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel ,
                                          String AV88Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob ,
                                          String AV91Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel ,
                                          String AV90Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo ,
                                          String AV93Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel ,
                                          String AV92Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 ,
                                          String AV95Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel ,
                                          String AV94Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif ,
                                          String AV97Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel ,
                                          String AV96Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf ,
                                          String AV99Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel ,
                                          String AV98Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx ,
                                          String AV101Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel ,
                                          String AV100Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax ,
                                          String AV103Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel ,
                                          String AV102Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail ,
                                          String AV105Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel ,
                                          String AV104Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod ,
                                          String AV107Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel ,
                                          String AV106Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc ,
                                          byte AV108Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto ,
                                          byte AV109Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to ,
                                          int AV110Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag ,
                                          int AV111Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to ,
                                          int AV112Stocksquimicos_listadodeproveedores_wcds_32_tfprvper ,
                                          int AV113Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to ,
                                          String AV115Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel ,
                                          String AV114Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep ,
                                          short AV116Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent ,
                                          short AV117Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to ,
                                          int AV118Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels_size ,
                                          String AV120Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel ,
                                          String AV119Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta ,
                                          int AV71PrvNumFrom ,
                                          int AV72PrvNumTo ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          String A786PrvDir ,
                                          String A799PrvPob ,
                                          String A782PrvCpo ,
                                          String A6075PrvCp2 ,
                                          String A793PrvNif ,
                                          String A803PrvTlf ,
                                          String A804PrvTlx ,
                                          String A6076PrvFax ,
                                          String A6077PrvMail ,
                                          String A497FpgCod ,
                                          String A498FpgDsc ,
                                          byte A805PrvVto ,
                                          int A785PrvDiaPag ,
                                          int A797PrvPer ,
                                          String A801PrvRep ,
                                          short A798PrvPlaEnt ,
                                          String A783PrvCta ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV81Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext ,
                                          String AV70Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int42 = new byte[41];
      Object[] GXv_Object43 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PrvCta, T1.PrvMetTra, T1.PrvPlaEnt, T1.PrvRep, T1.PrvPer, T1.PrvDiaPag, T1.PrvVto, T2.FpgDsc, T1.FpgCod, T1.PrvMail, T1.PrvFax, T1.PrvTlx," ;
      scmdbuf += " T1.PrvTlf, T1.PrvNif, T1.PrvCp2, T1.PrvCpo, T1.PrvPob, T1.PrvDir, T1.PrvNom, T1.PrvNum FROM (TXPPRVGEN T1 LEFT JOIN TXPFORPAG T2 ON T2.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T2.FpgCod = T1.FpgCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV82Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int42[1] = (byte)(1) ;
      }
      if ( ! (0==AV83Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int42[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV84Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int42[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvNom = ?)");
      }
      else
      {
         GXv_int42[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel)==0) && ( ! (GXutil.strcmp("", AV86Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvDir) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int42[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvDir = ?)");
      }
      else
      {
         GXv_int42[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel)==0) && ( ! (GXutil.strcmp("", AV88Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int42[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvPob = ?)");
      }
      else
      {
         GXv_int42[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel)==0) && ( ! (GXutil.strcmp("", AV90Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int42[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvCpo = ?)");
      }
      else
      {
         GXv_int42[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel)==0) && ( ! (GXutil.strcmp("", AV92Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int42[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvCp2 = ?)");
      }
      else
      {
         GXv_int42[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel)==0) && ( ! (GXutil.strcmp("", AV94Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int42[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvNif = ?)");
      }
      else
      {
         GXv_int42[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel)==0) && ( ! (GXutil.strcmp("", AV96Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvTlf) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int42[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvTlf = ?)");
      }
      else
      {
         GXv_int42[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel)==0) && ( ! (GXutil.strcmp("", AV98Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvTlx) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int42[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvTlx = ?)");
      }
      else
      {
         GXv_int42[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel)==0) && ( ! (GXutil.strcmp("", AV100Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvFax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int42[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvFax = ?)");
      }
      else
      {
         GXv_int42[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel)==0) && ( ! (GXutil.strcmp("", AV102Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvMail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int42[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvMail = ?)");
      }
      else
      {
         GXv_int42[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel)==0) && ( ! (GXutil.strcmp("", AV104Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FpgCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int42[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FpgCod = ?)");
      }
      else
      {
         GXv_int42[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel)==0) && ( ! (GXutil.strcmp("", AV106Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FpgDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int42[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FpgDsc = ?)");
      }
      else
      {
         GXv_int42[26] = (byte)(1) ;
      }
      if ( ! (0==AV108Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto) )
      {
         addWhere(sWhereString, "(T1.PrvVto >= ?)");
      }
      else
      {
         GXv_int42[27] = (byte)(1) ;
      }
      if ( ! (0==AV109Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to) )
      {
         addWhere(sWhereString, "(T1.PrvVto <= ?)");
      }
      else
      {
         GXv_int42[28] = (byte)(1) ;
      }
      if ( ! (0==AV110Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag) )
      {
         addWhere(sWhereString, "(T1.PrvDiaPag >= ?)");
      }
      else
      {
         GXv_int42[29] = (byte)(1) ;
      }
      if ( ! (0==AV111Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to) )
      {
         addWhere(sWhereString, "(T1.PrvDiaPag <= ?)");
      }
      else
      {
         GXv_int42[30] = (byte)(1) ;
      }
      if ( ! (0==AV112Stocksquimicos_listadodeproveedores_wcds_32_tfprvper) )
      {
         addWhere(sWhereString, "(T1.PrvPer >= ?)");
      }
      else
      {
         GXv_int42[31] = (byte)(1) ;
      }
      if ( ! (0==AV113Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to) )
      {
         addWhere(sWhereString, "(T1.PrvPer <= ?)");
      }
      else
      {
         GXv_int42[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel)==0) && ( ! (GXutil.strcmp("", AV114Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvRep) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int42[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvRep = ?)");
      }
      else
      {
         GXv_int42[34] = (byte)(1) ;
      }
      if ( ! (0==AV116Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent) )
      {
         addWhere(sWhereString, "(T1.PrvPlaEnt >= ?)");
      }
      else
      {
         GXv_int42[35] = (byte)(1) ;
      }
      if ( ! (0==AV117Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to) )
      {
         addWhere(sWhereString, "(T1.PrvPlaEnt <= ?)");
      }
      else
      {
         GXv_int42[36] = (byte)(1) ;
      }
      if ( AV118Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV118Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels, "T1.PrvMetTra IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV120Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel)==0) && ( ! (GXutil.strcmp("", AV119Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvCta) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int42[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvCta = ?)");
      }
      else
      {
         GXv_int42[38] = (byte)(1) ;
      }
      if ( ! (0==AV71PrvNumFrom) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int42[39] = (byte)(1) ;
      }
      if ( ! (0==AV72PrvNumTo) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int42[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvNom" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvNum" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvDir" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvDir DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvPob" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvPob DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvCpo" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvCpo DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvCp2" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvCp2 DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvNif" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvNif DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvTlf" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvTlf DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvTlx" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvTlx DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvFax" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvFax DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvMail" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvMail DESC" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FpgCod" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FpgCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.FpgDsc" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.FpgDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvVto" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvVto DESC" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvDiaPag" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvDiaPag DESC" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvPer" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvPer DESC" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvRep" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvRep DESC" ;
      }
      else if ( ( AV12OrderedBy == 18 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvPlaEnt" ;
      }
      else if ( ( AV12OrderedBy == 18 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvPlaEnt DESC" ;
      }
      else if ( ( AV12OrderedBy == 19 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvMetTra" ;
      }
      else if ( ( AV12OrderedBy == 19 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvMetTra DESC" ;
      }
      else if ( ( AV12OrderedBy == 20 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvCta" ;
      }
      else if ( ( AV12OrderedBy == 20 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvCta DESC" ;
      }
      GXv_Object43[0] = scmdbuf ;
      GXv_Object43[1] = GXv_int42 ;
      return GXv_Object43 ;
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
                  return conditional_H01RJ2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).byteValue() , ((Number) dynConstraints[57]).intValue() , ((Number) dynConstraints[58]).intValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , (String)dynConstraints[61] , ((Number) dynConstraints[62]).shortValue() , ((Boolean) dynConstraints[63]).booleanValue() , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] );
            case 1 :
                  return conditional_H01RJ3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).byteValue() , ((Number) dynConstraints[57]).intValue() , ((Number) dynConstraints[58]).intValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , (String)dynConstraints[61] , ((Number) dynConstraints[62]).shortValue() , ((Boolean) dynConstraints[63]).booleanValue() , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01RJ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01RJ3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 12);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 40);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 15);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 14);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 18);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 20);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 6);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 30);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(20, 30);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((int[]) buf[39])[0] = rslt.getInt(21);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 12);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 40);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 15);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 14);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 18);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 20);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 6);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 30);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(20, 30);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((int[]) buf[39])[0] = rslt.getInt(21);
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
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 18);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 18);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 14);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 14);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 15);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 15);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 40);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 40);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[69]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 20);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 20);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[77]).shortValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 12);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 12);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 18);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 18);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 14);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 14);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 15);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 15);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 40);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 40);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[69]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 20);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 20);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[77]).shortValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 12);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 12);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               return;
      }
   }

}

