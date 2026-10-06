package app.almacensindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class listadodeprocedenciastejido_wc_impl extends GXWebComponent
{
   public listadodeprocedenciastejido_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public listadodeprocedenciastejido_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( listadodeprocedenciastejido_wc_impl.class ));
   }

   public listadodeprocedenciastejido_wc_impl( int remoteHandle ,
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
               AV57Procecodfrom = (short)(GXutil.lval( httpContext.GetPar( "Procecodfrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57Procecodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57Procecodfrom), 4, 0));
               AV58Procecodto = (short)(GXutil.lval( httpContext.GetPar( "Procecodto"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58Procecodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58Procecodto), 4, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV56Emprcod,Short.valueOf(AV57Procecodfrom),Short.valueOf(AV58Procecodto)});
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
      nRC_GXsfl_41 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_41"))) ;
      nGXsfl_41_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_41_idx"))) ;
      sGXsfl_41_idx = httpContext.GetPar( "sGXsfl_41_idx") ;
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
      AV15FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV57Procecodfrom = (short)(GXutil.lval( httpContext.GetPar( "Procecodfrom"))) ;
      AV58Procecodto = (short)(GXutil.lval( httpContext.GetPar( "Procecodto"))) ;
      AV25ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV20ColumnsSelector);
      AV56Emprcod = httpContext.GetPar( "Emprcod") ;
      AV26TFProceCod = (short)(GXutil.lval( httpContext.GetPar( "TFProceCod"))) ;
      AV27TFProceCod_To = (short)(GXutil.lval( httpContext.GetPar( "TFProceCod_To"))) ;
      AV28TFProceNom = httpContext.GetPar( "TFProceNom") ;
      AV29TFProceNom_Sel = httpContext.GetPar( "TFProceNom_Sel") ;
      AV30TFProceNif = httpContext.GetPar( "TFProceNif") ;
      AV31TFProceNif_Sel = httpContext.GetPar( "TFProceNif_Sel") ;
      AV32TFProceDom = httpContext.GetPar( "TFProceDom") ;
      AV33TFProceDom_Sel = httpContext.GetPar( "TFProceDom_Sel") ;
      AV34TFProcePob = httpContext.GetPar( "TFProcePob") ;
      AV35TFProcePob_Sel = httpContext.GetPar( "TFProcePob_Sel") ;
      AV36TFPrvCod = (short)(GXutil.lval( httpContext.GetPar( "TFPrvCod"))) ;
      AV37TFPrvCod_To = (short)(GXutil.lval( httpContext.GetPar( "TFPrvCod_To"))) ;
      AV38TFPrvDsc = httpContext.GetPar( "TFPrvDsc") ;
      AV39TFPrvDsc_Sel = httpContext.GetPar( "TFPrvDsc_Sel") ;
      AV40TFPoceCp = httpContext.GetPar( "TFPoceCp") ;
      AV41TFPoceCp_Sel = httpContext.GetPar( "TFPoceCp_Sel") ;
      AV59TFPoceCp2 = httpContext.GetPar( "TFPoceCp2") ;
      AV60TFPoceCp2_Sel = httpContext.GetPar( "TFPoceCp2_Sel") ;
      AV42TFProceTel1 = httpContext.GetPar( "TFProceTel1") ;
      AV43TFProceTel1_Sel = httpContext.GetPar( "TFProceTel1_Sel") ;
      AV44TFProceTel2 = httpContext.GetPar( "TFProceTel2") ;
      AV45TFProceTel2_Sel = httpContext.GetPar( "TFProceTel2_Sel") ;
      AV46TFProceTelex = httpContext.GetPar( "TFProceTelex") ;
      AV47TFProceTelex_Sel = httpContext.GetPar( "TFProceTelex_Sel") ;
      AV48TFProPers = httpContext.GetPar( "TFProPers") ;
      AV49TFProPers_Sel = httpContext.GetPar( "TFProPers_Sel") ;
      AV50TFProEmail = httpContext.GetPar( "TFProEmail") ;
      AV51TFProEmail_Sel = httpContext.GetPar( "TFProEmail_Sel") ;
      AV96Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV66Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod = httpContext.GetPar( "Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV57Procecodfrom, AV58Procecodto, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV56Emprcod, AV26TFProceCod, AV27TFProceCod_To, AV28TFProceNom, AV29TFProceNom_Sel, AV30TFProceNif, AV31TFProceNif_Sel, AV32TFProceDom, AV33TFProceDom_Sel, AV34TFProcePob, AV35TFProcePob_Sel, AV36TFPrvCod, AV37TFPrvCod_To, AV38TFPrvDsc, AV39TFPrvDsc_Sel, AV40TFPoceCp, AV41TFPoceCp_Sel, AV59TFPoceCp2, AV60TFPoceCp2_Sel, AV42TFProceTel1, AV43TFProceTel1_Sel, AV44TFProceTel2, AV45TFProceTel2_Sel, AV46TFProceTelex, AV47TFProceTelex_Sel, AV48TFProPers, AV49TFProPers_Sel, AV50TFProEmail, AV51TFProEmail_Sel, AV96Pgmname, AV12OrderedBy, AV13OrderedDsc, AV66Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1OD2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Listado de Procedencias de Tejido", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.almacensindetalle.listadodeprocedenciastejido_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV56Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV57Procecodfrom,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV58Procecodto,4,0))}, new String[] {"Emprcod","Procecodfrom","Procecodto"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV96Pgmname, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vFILTERFULLTEXT", AV15FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_41", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_41, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
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
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV20ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV20ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV56Emprcod", GXutil.rtrim( wcpOAV56Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV57Procecodfrom", GXutil.ltrim( localUtil.ntoc( wcpOAV57Procecodfrom, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV58Procecodto", GXutil.ltrim( localUtil.ntoc( wcpOAV58Procecodto, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV25ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV56Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPROCECOD", GXutil.ltrim( localUtil.ntoc( AV26TFProceCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPROCECOD_TO", GXutil.ltrim( localUtil.ntoc( AV27TFProceCod_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPROCENOM", GXutil.rtrim( AV28TFProceNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPROCENOM_SEL", GXutil.rtrim( AV29TFProceNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPROCENIF", GXutil.rtrim( AV30TFProceNif));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPROCENIF_SEL", GXutil.rtrim( AV31TFProceNif_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPROCEDOM", GXutil.rtrim( AV32TFProceDom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPROCEDOM_SEL", GXutil.rtrim( AV33TFProceDom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPROCEPOB", GXutil.rtrim( AV34TFProcePob));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPROCEPOB_SEL", GXutil.rtrim( AV35TFProcePob_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVCOD", GXutil.ltrim( localUtil.ntoc( AV36TFPrvCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVCOD_TO", GXutil.ltrim( localUtil.ntoc( AV37TFPrvCod_To, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVDSC", GXutil.rtrim( AV38TFPrvDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVDSC_SEL", GXutil.rtrim( AV39TFPrvDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPOCECP", GXutil.rtrim( AV40TFPoceCp));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPOCECP_SEL", GXutil.rtrim( AV41TFPoceCp_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPOCECP2", GXutil.rtrim( AV59TFPoceCp2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPOCECP2_SEL", GXutil.rtrim( AV60TFPoceCp2_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPROCETEL1", GXutil.rtrim( AV42TFProceTel1));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPROCETEL1_SEL", GXutil.rtrim( AV43TFProceTel1_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPROCETEL2", GXutil.rtrim( AV44TFProceTel2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPROCETEL2_SEL", GXutil.rtrim( AV45TFProceTel2_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPROCETELEX", GXutil.rtrim( AV46TFProceTelex));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPROCETELEX_SEL", GXutil.rtrim( AV47TFProceTelex_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPROPERS", GXutil.rtrim( AV48TFProPers));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPROPERS_SEL", GXutil.rtrim( AV49TFProPers_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPROEMAIL", GXutil.rtrim( AV50TFProEmail));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPROEMAIL_SEL", GXutil.rtrim( AV51TFProEmail_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV96Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV96Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPROCECODFROM", GXutil.ltrim( localUtil.ntoc( AV57Procecodfrom, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPROCECODTO", GXutil.ltrim( localUtil.ntoc( AV58Procecodto, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALMACENSINDETALLE_LISTADODEPROCEDENCIASTEJIDO_WCDS_1_EMPRCOD", GXutil.rtrim( AV66Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod));
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

   public void renderHtmlCloseForm1OD2( )
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
      return "AlmacenSinDetalle.ListadodeProcedenciasTejido_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Listado de Procedencias de Tejido", "") ;
   }

   public void wb1OD0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.almacensindetalle.listadodeprocedenciastejido_wc");
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AlmacenSinDetalle\\ListadodeProcedenciasTejido_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AlmacenSinDetalle\\ListadodeProcedenciasTejido_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AlmacenSinDetalle\\ListadodeProcedenciasTejido_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_23_1OD2( true) ;
      }
      else
      {
         wb_table1_23_1OD2( false) ;
      }
      return  ;
   }

   public void wb_table1_23_1OD2e( boolean wbgen )
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
         startgridcontrol41( ) ;
      }
      if ( wbEnd == 41 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_41 = (int)(nGXsfl_41_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV54GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV55GridPageCount);
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
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV52DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, 0, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\ListadodeProcedenciasTejido_WC.htm");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV52DDO_TitleSettingsIcons);
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
      if ( wbEnd == 41 )
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

   public void start1OD2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Listado de Procedencias de Tejido", ""), (short)(0)) ;
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
            strup1OD0( ) ;
         }
      }
   }

   public void ws1OD2( )
   {
      start1OD2( ) ;
      evt1OD2( ) ;
   }

   public void evt1OD2( )
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
                              strup1OD0( ) ;
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
                              strup1OD0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e111OD2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1OD0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e121OD2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1OD0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e131OD2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1OD0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e141OD2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1OD0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e151OD2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1OD0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e161OD2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1OD0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e171OD2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1OD0( ) ;
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
                              strup1OD0( ) ;
                           }
                           nGXsfl_41_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_412( ) ;
                           A970ProceCod = (short)(localUtil.ctol( httpContext.cgiGet( edtProceCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A971ProceNom = httpContext.cgiGet( edtProceNom_Internalname) ;
                           n971ProceNom = false ;
                           A993ProceNif = httpContext.cgiGet( edtProceNif_Internalname) ;
                           n993ProceNif = false ;
                           A994ProceDom = httpContext.cgiGet( edtProceDom_Internalname) ;
                           n994ProceDom = false ;
                           A988ProcePob = httpContext.cgiGet( edtProcePob_Internalname) ;
                           n988ProcePob = false ;
                           A781PrvCod = (short)(localUtil.ctol( httpContext.cgiGet( edtPrvCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n781PrvCod = false ;
                           A787PrvDsc = GXutil.upper( httpContext.cgiGet( edtPrvDsc_Internalname)) ;
                           n787PrvDsc = false ;
                           A989PoceCp = httpContext.cgiGet( edtPoceCp_Internalname) ;
                           n989PoceCp = false ;
                           A14029PoceCp2 = httpContext.cgiGet( edtPoceCp2_Internalname) ;
                           n14029PoceCp2 = false ;
                           A990ProceTel1 = httpContext.cgiGet( edtProceTel1_Internalname) ;
                           n990ProceTel1 = false ;
                           A991ProceTel2 = httpContext.cgiGet( edtProceTel2_Internalname) ;
                           n991ProceTel2 = false ;
                           A992ProceTelex = httpContext.cgiGet( edtProceTelex_Internalname) ;
                           n992ProceTelex = false ;
                           A6187ProceIe = GXutil.upper( httpContext.cgiGet( edtProceIe_Internalname)) ;
                           n6187ProceIe = false ;
                           A10122GpoEcoCod = (int)(localUtil.ctol( httpContext.cgiGet( edtGpoEcoCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n10122GpoEcoCod = false ;
                           A13820ProceNomID = httpContext.cgiGet( edtProceNomID_Internalname) ;
                           A10123GpoEcoNom = httpContext.cgiGet( edtGpoEcoNom_Internalname) ;
                           n10123GpoEcoNom = false ;
                           A10390ProPers = httpContext.cgiGet( edtProPers_Internalname) ;
                           n10390ProPers = false ;
                           A10391ProEmail = httpContext.cgiGet( edtProEmail_Internalname) ;
                           n10391ProEmail = false ;
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
                                       e181OD2 ();
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
                                       e191OD2 ();
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
                                       e201OD2 ();
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
                                          if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV15FilterFullText) != 0 )
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
                                    strup1OD0( ) ;
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

   public void we1OD2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1OD2( ) ;
         }
      }
   }

   public void pa1OD2( )
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
      subsflControlProps_412( ) ;
      while ( nGXsfl_41_idx <= nRC_GXsfl_41 )
      {
         sendrow_412( ) ;
         nGXsfl_41_idx = ((subGrid_Islastpage==1)&&(nGXsfl_41_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_41_idx+1) ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_412( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV15FilterFullText ,
                                 short AV57Procecodfrom ,
                                 short AV58Procecodto ,
                                 byte AV25ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ,
                                 String AV56Emprcod ,
                                 short AV26TFProceCod ,
                                 short AV27TFProceCod_To ,
                                 String AV28TFProceNom ,
                                 String AV29TFProceNom_Sel ,
                                 String AV30TFProceNif ,
                                 String AV31TFProceNif_Sel ,
                                 String AV32TFProceDom ,
                                 String AV33TFProceDom_Sel ,
                                 String AV34TFProcePob ,
                                 String AV35TFProcePob_Sel ,
                                 short AV36TFPrvCod ,
                                 short AV37TFPrvCod_To ,
                                 String AV38TFPrvDsc ,
                                 String AV39TFPrvDsc_Sel ,
                                 String AV40TFPoceCp ,
                                 String AV41TFPoceCp_Sel ,
                                 String AV59TFPoceCp2 ,
                                 String AV60TFPoceCp2_Sel ,
                                 String AV42TFProceTel1 ,
                                 String AV43TFProceTel1_Sel ,
                                 String AV44TFProceTel2 ,
                                 String AV45TFProceTel2_Sel ,
                                 String AV46TFProceTelex ,
                                 String AV47TFProceTelex_Sel ,
                                 String AV48TFProPers ,
                                 String AV49TFProPers_Sel ,
                                 String AV50TFProEmail ,
                                 String AV51TFProEmail_Sel ,
                                 String AV96Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 String AV66Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e191OD2 ();
      GRID_nCurrentRecord = 0 ;
      rf1OD2( ) ;
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
      rf1OD2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV96Pgmname = "AlmacenSinDetalle.ListadodeProcedenciasTejido_WC" ;
      Gx_err = (short)(0) ;
   }

   public void rf1OD2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(41) ;
      /* Execute user event: Refresh */
      e191OD2 ();
      nGXsfl_41_idx = 1 ;
      sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_412( ) ;
      bGXsfl_41_Refreshing = true ;
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
         subsflControlProps_412( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext ,
                                              Short.valueOf(AV68Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod) ,
                                              Short.valueOf(AV69Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to) ,
                                              AV71Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel ,
                                              AV70Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom ,
                                              AV73Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel ,
                                              AV72Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif ,
                                              AV75Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel ,
                                              AV74Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom ,
                                              AV77Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel ,
                                              AV76Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob ,
                                              Short.valueOf(AV78Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod) ,
                                              Short.valueOf(AV79Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to) ,
                                              AV81Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel ,
                                              AV80Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc ,
                                              AV83Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel ,
                                              AV82Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp ,
                                              AV85Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel ,
                                              AV84Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 ,
                                              AV87Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel ,
                                              AV86Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 ,
                                              AV89Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel ,
                                              AV88Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 ,
                                              AV91Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel ,
                                              AV90Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex ,
                                              AV93Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel ,
                                              AV92Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers ,
                                              AV95Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel ,
                                              AV94Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail ,
                                              Short.valueOf(AV57Procecodfrom) ,
                                              Short.valueOf(AV58Procecodto) ,
                                              Short.valueOf(A970ProceCod) ,
                                              A971ProceNom ,
                                              A993ProceNif ,
                                              A994ProceDom ,
                                              A988ProcePob ,
                                              Short.valueOf(A781PrvCod) ,
                                              A787PrvDsc ,
                                              A989PoceCp ,
                                              A14029PoceCp2 ,
                                              A990ProceTel1 ,
                                              A991ProceTel2 ,
                                              A992ProceTelex ,
                                              A10390ProPers ,
                                              A10391ProEmail ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV66Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                              TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                              TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
         lV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
         lV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
         lV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
         lV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
         lV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
         lV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
         lV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
         lV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
         lV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
         lV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
         lV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
         lV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
         lV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
         lV70Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom = GXutil.padr( GXutil.rtrim( AV70Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom), 30, "%") ;
         lV72Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif = GXutil.padr( GXutil.rtrim( AV72Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif), 20, "%") ;
         lV74Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom = GXutil.padr( GXutil.rtrim( AV74Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom), 34, "%") ;
         lV76Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob = GXutil.padr( GXutil.rtrim( AV76Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob), 30, "%") ;
         lV80Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc = GXutil.padr( GXutil.rtrim( AV80Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc), 30, "%") ;
         lV82Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp = GXutil.padr( GXutil.rtrim( AV82Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp), 6, "%") ;
         lV84Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 = GXutil.padr( GXutil.rtrim( AV84Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2), 6, "%") ;
         lV86Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 = GXutil.padr( GXutil.rtrim( AV86Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1), 9, "%") ;
         lV88Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 = GXutil.padr( GXutil.rtrim( AV88Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2), 9, "%") ;
         lV90Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex = GXutil.padr( GXutil.rtrim( AV90Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex), 14, "%") ;
         lV92Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers = GXutil.padr( GXutil.rtrim( AV92Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers), 40, "%") ;
         lV94Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail = GXutil.padr( GXutil.rtrim( AV94Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail), 40, "%") ;
         /* Using cursor H01OD2 */
         pr_default.execute(0, new Object[] {AV66Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod, lV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, Short.valueOf(AV68Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod), Short.valueOf(AV69Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to), lV70Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom, AV71Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel, lV72Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif, AV73Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel, lV74Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom, AV75Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel, lV76Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob, AV77Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel, Short.valueOf(AV78Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod), Short.valueOf(AV79Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to), lV80Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc, AV81Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel, lV82Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp, AV83Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel, lV84Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2, AV85Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel, lV86Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1, AV87Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel, lV88Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2, AV89Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel, lV90Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex, AV91Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel, lV92Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers, AV93Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel, lV94Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail, AV95Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel, Short.valueOf(AV57Procecodfrom), Short.valueOf(AV58Procecodto), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_41_idx = 1 ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_412( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H01OD2_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
            A10391ProEmail = H01OD2_A10391ProEmail[0] ;
            n10391ProEmail = H01OD2_n10391ProEmail[0] ;
            A10390ProPers = H01OD2_A10390ProPers[0] ;
            n10390ProPers = H01OD2_n10390ProPers[0] ;
            A10123GpoEcoNom = H01OD2_A10123GpoEcoNom[0] ;
            n10123GpoEcoNom = H01OD2_n10123GpoEcoNom[0] ;
            A10122GpoEcoCod = H01OD2_A10122GpoEcoCod[0] ;
            n10122GpoEcoCod = H01OD2_n10122GpoEcoCod[0] ;
            A6187ProceIe = H01OD2_A6187ProceIe[0] ;
            n6187ProceIe = H01OD2_n6187ProceIe[0] ;
            A992ProceTelex = H01OD2_A992ProceTelex[0] ;
            n992ProceTelex = H01OD2_n992ProceTelex[0] ;
            A991ProceTel2 = H01OD2_A991ProceTel2[0] ;
            n991ProceTel2 = H01OD2_n991ProceTel2[0] ;
            A990ProceTel1 = H01OD2_A990ProceTel1[0] ;
            n990ProceTel1 = H01OD2_n990ProceTel1[0] ;
            A14029PoceCp2 = H01OD2_A14029PoceCp2[0] ;
            n14029PoceCp2 = H01OD2_n14029PoceCp2[0] ;
            A989PoceCp = H01OD2_A989PoceCp[0] ;
            n989PoceCp = H01OD2_n989PoceCp[0] ;
            A787PrvDsc = H01OD2_A787PrvDsc[0] ;
            n787PrvDsc = H01OD2_n787PrvDsc[0] ;
            A781PrvCod = H01OD2_A781PrvCod[0] ;
            n781PrvCod = H01OD2_n781PrvCod[0] ;
            A988ProcePob = H01OD2_A988ProcePob[0] ;
            n988ProcePob = H01OD2_n988ProcePob[0] ;
            A994ProceDom = H01OD2_A994ProceDom[0] ;
            n994ProceDom = H01OD2_n994ProceDom[0] ;
            A993ProceNif = H01OD2_A993ProceNif[0] ;
            n993ProceNif = H01OD2_n993ProceNif[0] ;
            A971ProceNom = H01OD2_A971ProceNom[0] ;
            n971ProceNom = H01OD2_n971ProceNom[0] ;
            A970ProceCod = H01OD2_A970ProceCod[0] ;
            A10123GpoEcoNom = H01OD2_A10123GpoEcoNom[0] ;
            n10123GpoEcoNom = H01OD2_n10123GpoEcoNom[0] ;
            A787PrvDsc = H01OD2_A787PrvDsc[0] ;
            n787PrvDsc = H01OD2_n787PrvDsc[0] ;
            A13820ProceNomID = GXutil.trim( GXutil.str( A970ProceCod, 4, 0)) + "-" + GXutil.trim( A971ProceNom) ;
            e201OD2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(41) ;
         wb1OD0( ) ;
      }
      bGXsfl_41_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1OD2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV96Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV96Pgmname, ""))));
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
      AV66Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod = AV56Emprcod ;
      AV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = AV15FilterFullText ;
      AV68Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod = AV26TFProceCod ;
      AV69Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to = AV27TFProceCod_To ;
      AV70Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom = AV28TFProceNom ;
      AV71Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel = AV29TFProceNom_Sel ;
      AV72Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif = AV30TFProceNif ;
      AV73Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel = AV31TFProceNif_Sel ;
      AV74Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom = AV32TFProceDom ;
      AV75Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel = AV33TFProceDom_Sel ;
      AV76Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob = AV34TFProcePob ;
      AV77Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel = AV35TFProcePob_Sel ;
      AV78Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod = AV36TFPrvCod ;
      AV79Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to = AV37TFPrvCod_To ;
      AV80Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc = AV38TFPrvDsc ;
      AV81Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel = AV39TFPrvDsc_Sel ;
      AV82Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp = AV40TFPoceCp ;
      AV83Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel = AV41TFPoceCp_Sel ;
      AV84Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 = AV59TFPoceCp2 ;
      AV85Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel = AV60TFPoceCp2_Sel ;
      AV86Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 = AV42TFProceTel1 ;
      AV87Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel = AV43TFProceTel1_Sel ;
      AV88Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 = AV44TFProceTel2 ;
      AV89Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel = AV45TFProceTel2_Sel ;
      AV90Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex = AV46TFProceTelex ;
      AV91Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel = AV47TFProceTelex_Sel ;
      AV92Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers = AV48TFProPers ;
      AV93Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel = AV49TFProPers_Sel ;
      AV94Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail = AV50TFProEmail ;
      AV95Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel = AV51TFProEmail_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext ,
                                           Short.valueOf(AV68Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod) ,
                                           Short.valueOf(AV69Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to) ,
                                           AV71Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel ,
                                           AV70Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom ,
                                           AV73Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel ,
                                           AV72Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif ,
                                           AV75Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel ,
                                           AV74Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom ,
                                           AV77Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel ,
                                           AV76Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob ,
                                           Short.valueOf(AV78Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod) ,
                                           Short.valueOf(AV79Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to) ,
                                           AV81Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel ,
                                           AV80Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc ,
                                           AV83Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel ,
                                           AV82Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp ,
                                           AV85Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel ,
                                           AV84Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 ,
                                           AV87Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel ,
                                           AV86Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 ,
                                           AV89Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel ,
                                           AV88Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 ,
                                           AV91Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel ,
                                           AV90Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex ,
                                           AV93Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel ,
                                           AV92Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers ,
                                           AV95Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel ,
                                           AV94Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail ,
                                           Short.valueOf(AV57Procecodfrom) ,
                                           Short.valueOf(AV58Procecodto) ,
                                           Short.valueOf(A970ProceCod) ,
                                           A971ProceNom ,
                                           A993ProceNif ,
                                           A994ProceDom ,
                                           A988ProcePob ,
                                           Short.valueOf(A781PrvCod) ,
                                           A787PrvDsc ,
                                           A989PoceCp ,
                                           A14029PoceCp2 ,
                                           A990ProceTel1 ,
                                           A991ProceTel2 ,
                                           A992ProceTelex ,
                                           A10390ProPers ,
                                           A10391ProEmail ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV66Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV70Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom = GXutil.padr( GXutil.rtrim( AV70Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom), 30, "%") ;
      lV72Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif = GXutil.padr( GXutil.rtrim( AV72Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif), 20, "%") ;
      lV74Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom = GXutil.padr( GXutil.rtrim( AV74Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom), 34, "%") ;
      lV76Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob = GXutil.padr( GXutil.rtrim( AV76Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob), 30, "%") ;
      lV80Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc = GXutil.padr( GXutil.rtrim( AV80Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc), 30, "%") ;
      lV82Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp = GXutil.padr( GXutil.rtrim( AV82Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp), 6, "%") ;
      lV84Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 = GXutil.padr( GXutil.rtrim( AV84Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2), 6, "%") ;
      lV86Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 = GXutil.padr( GXutil.rtrim( AV86Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1), 9, "%") ;
      lV88Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 = GXutil.padr( GXutil.rtrim( AV88Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2), 9, "%") ;
      lV90Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex = GXutil.padr( GXutil.rtrim( AV90Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex), 14, "%") ;
      lV92Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers = GXutil.padr( GXutil.rtrim( AV92Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers), 40, "%") ;
      lV94Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail = GXutil.padr( GXutil.rtrim( AV94Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail), 40, "%") ;
      /* Using cursor H01OD3 */
      pr_default.execute(1, new Object[] {AV66Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod, lV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, Short.valueOf(AV68Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod), Short.valueOf(AV69Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to), lV70Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom, AV71Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel, lV72Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif, AV73Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel, lV74Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom, AV75Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel, lV76Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob, AV77Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel, Short.valueOf(AV78Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod), Short.valueOf(AV79Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to), lV80Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc, AV81Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel, lV82Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp, AV83Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel, lV84Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2, AV85Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel, lV86Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1, AV87Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel, lV88Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2, AV89Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel, lV90Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex, AV91Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel, lV92Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers, AV93Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel, lV94Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail, AV95Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel, Short.valueOf(AV57Procecodfrom), Short.valueOf(AV58Procecodto)});
      GRID_nRecordCount = H01OD3_AGRID_nRecordCount[0] ;
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
      AV66Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod = AV56Emprcod ;
      AV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = AV15FilterFullText ;
      AV68Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod = AV26TFProceCod ;
      AV69Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to = AV27TFProceCod_To ;
      AV70Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom = AV28TFProceNom ;
      AV71Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel = AV29TFProceNom_Sel ;
      AV72Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif = AV30TFProceNif ;
      AV73Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel = AV31TFProceNif_Sel ;
      AV74Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom = AV32TFProceDom ;
      AV75Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel = AV33TFProceDom_Sel ;
      AV76Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob = AV34TFProcePob ;
      AV77Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel = AV35TFProcePob_Sel ;
      AV78Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod = AV36TFPrvCod ;
      AV79Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to = AV37TFPrvCod_To ;
      AV80Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc = AV38TFPrvDsc ;
      AV81Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel = AV39TFPrvDsc_Sel ;
      AV82Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp = AV40TFPoceCp ;
      AV83Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel = AV41TFPoceCp_Sel ;
      AV84Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 = AV59TFPoceCp2 ;
      AV85Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel = AV60TFPoceCp2_Sel ;
      AV86Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 = AV42TFProceTel1 ;
      AV87Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel = AV43TFProceTel1_Sel ;
      AV88Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 = AV44TFProceTel2 ;
      AV89Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel = AV45TFProceTel2_Sel ;
      AV90Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex = AV46TFProceTelex ;
      AV91Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel = AV47TFProceTelex_Sel ;
      AV92Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers = AV48TFProPers ;
      AV93Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel = AV49TFProPers_Sel ;
      AV94Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail = AV50TFProEmail ;
      AV95Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel = AV51TFProEmail_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV57Procecodfrom, AV58Procecodto, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV56Emprcod, AV26TFProceCod, AV27TFProceCod_To, AV28TFProceNom, AV29TFProceNom_Sel, AV30TFProceNif, AV31TFProceNif_Sel, AV32TFProceDom, AV33TFProceDom_Sel, AV34TFProcePob, AV35TFProcePob_Sel, AV36TFPrvCod, AV37TFPrvCod_To, AV38TFPrvDsc, AV39TFPrvDsc_Sel, AV40TFPoceCp, AV41TFPoceCp_Sel, AV59TFPoceCp2, AV60TFPoceCp2_Sel, AV42TFProceTel1, AV43TFProceTel1_Sel, AV44TFProceTel2, AV45TFProceTel2_Sel, AV46TFProceTelex, AV47TFProceTelex_Sel, AV48TFProPers, AV49TFProPers_Sel, AV50TFProEmail, AV51TFProEmail_Sel, AV96Pgmname, AV12OrderedBy, AV13OrderedDsc, AV66Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV66Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod = AV56Emprcod ;
      AV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = AV15FilterFullText ;
      AV68Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod = AV26TFProceCod ;
      AV69Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to = AV27TFProceCod_To ;
      AV70Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom = AV28TFProceNom ;
      AV71Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel = AV29TFProceNom_Sel ;
      AV72Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif = AV30TFProceNif ;
      AV73Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel = AV31TFProceNif_Sel ;
      AV74Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom = AV32TFProceDom ;
      AV75Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel = AV33TFProceDom_Sel ;
      AV76Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob = AV34TFProcePob ;
      AV77Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel = AV35TFProcePob_Sel ;
      AV78Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod = AV36TFPrvCod ;
      AV79Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to = AV37TFPrvCod_To ;
      AV80Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc = AV38TFPrvDsc ;
      AV81Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel = AV39TFPrvDsc_Sel ;
      AV82Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp = AV40TFPoceCp ;
      AV83Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel = AV41TFPoceCp_Sel ;
      AV84Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 = AV59TFPoceCp2 ;
      AV85Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel = AV60TFPoceCp2_Sel ;
      AV86Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 = AV42TFProceTel1 ;
      AV87Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel = AV43TFProceTel1_Sel ;
      AV88Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 = AV44TFProceTel2 ;
      AV89Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel = AV45TFProceTel2_Sel ;
      AV90Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex = AV46TFProceTelex ;
      AV91Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel = AV47TFProceTelex_Sel ;
      AV92Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers = AV48TFProPers ;
      AV93Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel = AV49TFProPers_Sel ;
      AV94Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail = AV50TFProEmail ;
      AV95Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel = AV51TFProEmail_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV57Procecodfrom, AV58Procecodto, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV56Emprcod, AV26TFProceCod, AV27TFProceCod_To, AV28TFProceNom, AV29TFProceNom_Sel, AV30TFProceNif, AV31TFProceNif_Sel, AV32TFProceDom, AV33TFProceDom_Sel, AV34TFProcePob, AV35TFProcePob_Sel, AV36TFPrvCod, AV37TFPrvCod_To, AV38TFPrvDsc, AV39TFPrvDsc_Sel, AV40TFPoceCp, AV41TFPoceCp_Sel, AV59TFPoceCp2, AV60TFPoceCp2_Sel, AV42TFProceTel1, AV43TFProceTel1_Sel, AV44TFProceTel2, AV45TFProceTel2_Sel, AV46TFProceTelex, AV47TFProceTelex_Sel, AV48TFProPers, AV49TFProPers_Sel, AV50TFProEmail, AV51TFProEmail_Sel, AV96Pgmname, AV12OrderedBy, AV13OrderedDsc, AV66Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV66Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod = AV56Emprcod ;
      AV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = AV15FilterFullText ;
      AV68Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod = AV26TFProceCod ;
      AV69Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to = AV27TFProceCod_To ;
      AV70Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom = AV28TFProceNom ;
      AV71Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel = AV29TFProceNom_Sel ;
      AV72Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif = AV30TFProceNif ;
      AV73Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel = AV31TFProceNif_Sel ;
      AV74Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom = AV32TFProceDom ;
      AV75Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel = AV33TFProceDom_Sel ;
      AV76Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob = AV34TFProcePob ;
      AV77Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel = AV35TFProcePob_Sel ;
      AV78Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod = AV36TFPrvCod ;
      AV79Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to = AV37TFPrvCod_To ;
      AV80Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc = AV38TFPrvDsc ;
      AV81Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel = AV39TFPrvDsc_Sel ;
      AV82Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp = AV40TFPoceCp ;
      AV83Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel = AV41TFPoceCp_Sel ;
      AV84Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 = AV59TFPoceCp2 ;
      AV85Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel = AV60TFPoceCp2_Sel ;
      AV86Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 = AV42TFProceTel1 ;
      AV87Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel = AV43TFProceTel1_Sel ;
      AV88Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 = AV44TFProceTel2 ;
      AV89Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel = AV45TFProceTel2_Sel ;
      AV90Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex = AV46TFProceTelex ;
      AV91Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel = AV47TFProceTelex_Sel ;
      AV92Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers = AV48TFProPers ;
      AV93Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel = AV49TFProPers_Sel ;
      AV94Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail = AV50TFProEmail ;
      AV95Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel = AV51TFProEmail_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV57Procecodfrom, AV58Procecodto, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV56Emprcod, AV26TFProceCod, AV27TFProceCod_To, AV28TFProceNom, AV29TFProceNom_Sel, AV30TFProceNif, AV31TFProceNif_Sel, AV32TFProceDom, AV33TFProceDom_Sel, AV34TFProcePob, AV35TFProcePob_Sel, AV36TFPrvCod, AV37TFPrvCod_To, AV38TFPrvDsc, AV39TFPrvDsc_Sel, AV40TFPoceCp, AV41TFPoceCp_Sel, AV59TFPoceCp2, AV60TFPoceCp2_Sel, AV42TFProceTel1, AV43TFProceTel1_Sel, AV44TFProceTel2, AV45TFProceTel2_Sel, AV46TFProceTelex, AV47TFProceTelex_Sel, AV48TFProPers, AV49TFProPers_Sel, AV50TFProEmail, AV51TFProEmail_Sel, AV96Pgmname, AV12OrderedBy, AV13OrderedDsc, AV66Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV66Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod = AV56Emprcod ;
      AV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = AV15FilterFullText ;
      AV68Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod = AV26TFProceCod ;
      AV69Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to = AV27TFProceCod_To ;
      AV70Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom = AV28TFProceNom ;
      AV71Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel = AV29TFProceNom_Sel ;
      AV72Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif = AV30TFProceNif ;
      AV73Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel = AV31TFProceNif_Sel ;
      AV74Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom = AV32TFProceDom ;
      AV75Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel = AV33TFProceDom_Sel ;
      AV76Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob = AV34TFProcePob ;
      AV77Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel = AV35TFProcePob_Sel ;
      AV78Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod = AV36TFPrvCod ;
      AV79Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to = AV37TFPrvCod_To ;
      AV80Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc = AV38TFPrvDsc ;
      AV81Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel = AV39TFPrvDsc_Sel ;
      AV82Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp = AV40TFPoceCp ;
      AV83Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel = AV41TFPoceCp_Sel ;
      AV84Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 = AV59TFPoceCp2 ;
      AV85Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel = AV60TFPoceCp2_Sel ;
      AV86Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 = AV42TFProceTel1 ;
      AV87Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel = AV43TFProceTel1_Sel ;
      AV88Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 = AV44TFProceTel2 ;
      AV89Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel = AV45TFProceTel2_Sel ;
      AV90Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex = AV46TFProceTelex ;
      AV91Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel = AV47TFProceTelex_Sel ;
      AV92Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers = AV48TFProPers ;
      AV93Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel = AV49TFProPers_Sel ;
      AV94Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail = AV50TFProEmail ;
      AV95Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel = AV51TFProEmail_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV57Procecodfrom, AV58Procecodto, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV56Emprcod, AV26TFProceCod, AV27TFProceCod_To, AV28TFProceNom, AV29TFProceNom_Sel, AV30TFProceNif, AV31TFProceNif_Sel, AV32TFProceDom, AV33TFProceDom_Sel, AV34TFProcePob, AV35TFProcePob_Sel, AV36TFPrvCod, AV37TFPrvCod_To, AV38TFPrvDsc, AV39TFPrvDsc_Sel, AV40TFPoceCp, AV41TFPoceCp_Sel, AV59TFPoceCp2, AV60TFPoceCp2_Sel, AV42TFProceTel1, AV43TFProceTel1_Sel, AV44TFProceTel2, AV45TFProceTel2_Sel, AV46TFProceTelex, AV47TFProceTelex_Sel, AV48TFProPers, AV49TFProPers_Sel, AV50TFProEmail, AV51TFProEmail_Sel, AV96Pgmname, AV12OrderedBy, AV13OrderedDsc, AV66Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV66Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod = AV56Emprcod ;
      AV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = AV15FilterFullText ;
      AV68Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod = AV26TFProceCod ;
      AV69Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to = AV27TFProceCod_To ;
      AV70Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom = AV28TFProceNom ;
      AV71Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel = AV29TFProceNom_Sel ;
      AV72Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif = AV30TFProceNif ;
      AV73Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel = AV31TFProceNif_Sel ;
      AV74Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom = AV32TFProceDom ;
      AV75Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel = AV33TFProceDom_Sel ;
      AV76Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob = AV34TFProcePob ;
      AV77Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel = AV35TFProcePob_Sel ;
      AV78Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod = AV36TFPrvCod ;
      AV79Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to = AV37TFPrvCod_To ;
      AV80Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc = AV38TFPrvDsc ;
      AV81Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel = AV39TFPrvDsc_Sel ;
      AV82Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp = AV40TFPoceCp ;
      AV83Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel = AV41TFPoceCp_Sel ;
      AV84Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 = AV59TFPoceCp2 ;
      AV85Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel = AV60TFPoceCp2_Sel ;
      AV86Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 = AV42TFProceTel1 ;
      AV87Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel = AV43TFProceTel1_Sel ;
      AV88Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 = AV44TFProceTel2 ;
      AV89Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel = AV45TFProceTel2_Sel ;
      AV90Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex = AV46TFProceTelex ;
      AV91Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel = AV47TFProceTelex_Sel ;
      AV92Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers = AV48TFProPers ;
      AV93Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel = AV49TFProPers_Sel ;
      AV94Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail = AV50TFProEmail ;
      AV95Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel = AV51TFProEmail_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV57Procecodfrom, AV58Procecodto, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV56Emprcod, AV26TFProceCod, AV27TFProceCod_To, AV28TFProceNom, AV29TFProceNom_Sel, AV30TFProceNif, AV31TFProceNif_Sel, AV32TFProceDom, AV33TFProceDom_Sel, AV34TFProcePob, AV35TFProcePob_Sel, AV36TFPrvCod, AV37TFPrvCod_To, AV38TFPrvDsc, AV39TFPrvDsc_Sel, AV40TFPoceCp, AV41TFPoceCp_Sel, AV59TFPoceCp2, AV60TFPoceCp2_Sel, AV42TFProceTel1, AV43TFProceTel1_Sel, AV44TFProceTel2, AV45TFProceTel2_Sel, AV46TFProceTelex, AV47TFProceTelex_Sel, AV48TFProPers, AV49TFProPers_Sel, AV50TFProEmail, AV51TFProEmail_Sel, AV96Pgmname, AV12OrderedBy, AV13OrderedDsc, AV66Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV96Pgmname = "AlmacenSinDetalle.ListadodeProcedenciasTejido_WC" ;
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup1OD0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e181OD2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV23ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV52DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV20ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_41 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_41"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV54GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV55GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV56Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV56Emprcod") ;
         wcpOAV57Procecodfrom = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV57Procecodfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV58Procecodto = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV58Procecodto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         AV15FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV15FilterFullText) != 0 )
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
      e181OD2 ();
      if (returnInSub) return;
   }

   public void e181OD2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV63Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      listadodeprocedenciastejido_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV63Station = GXt_char1 ;
      GXv_char2[0] = AV56Emprcod ;
      GXv_char3[0] = AV64Emprnom ;
      GXv_char4[0] = AV65Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV63Station, GXv_char2, GXv_char3, GXv_char4) ;
      listadodeprocedenciastejido_wc_impl.this.AV56Emprcod = GXv_char2[0] ;
      listadodeprocedenciastejido_wc_impl.this.AV64Emprnom = GXv_char3[0] ;
      listadodeprocedenciastejido_wc_impl.this.AV65Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56Emprcod", AV56Emprcod);
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
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV52DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV52DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e191OD2( )
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
      if ( GXutil.strcmp(AV22Session.getValue("AlmacenSinDetalle.ListadodeProcedenciasTejido_WCColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV22Session.getValue("AlmacenSinDetalle.ListadodeProcedenciasTejido_WCColumnsSelector") ;
         AV20ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtProceCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtProceCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProceCod_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtProceNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtProceNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProceNom_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtProceNif_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtProceNif_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProceNif_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtProceDom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtProceDom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProceDom_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtProcePob_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtProcePob_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProcePob_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtPrvCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrvCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvCod_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtPrvDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrvDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvDsc_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtPoceCp_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPoceCp_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPoceCp_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtPoceCp2_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPoceCp2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPoceCp2_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtProceTel1_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtProceTel1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProceTel1_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtProceTel2_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtProceTel2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProceTel2_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtProceTelex_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtProceTelex_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProceTelex_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtProPers_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtProPers_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProPers_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtProEmail_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtProEmail_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProEmail_Visible), 5, 0), !bGXsfl_41_Refreshing);
      AV54GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54GridCurrentPage), 10, 0));
      AV55GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55GridPageCount), 10, 0));
      AV66Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod = AV56Emprcod ;
      AV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = AV15FilterFullText ;
      AV68Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod = AV26TFProceCod ;
      AV69Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to = AV27TFProceCod_To ;
      AV70Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom = AV28TFProceNom ;
      AV71Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel = AV29TFProceNom_Sel ;
      AV72Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif = AV30TFProceNif ;
      AV73Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel = AV31TFProceNif_Sel ;
      AV74Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom = AV32TFProceDom ;
      AV75Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel = AV33TFProceDom_Sel ;
      AV76Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob = AV34TFProcePob ;
      AV77Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel = AV35TFProcePob_Sel ;
      AV78Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod = AV36TFPrvCod ;
      AV79Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to = AV37TFPrvCod_To ;
      AV80Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc = AV38TFPrvDsc ;
      AV81Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel = AV39TFPrvDsc_Sel ;
      AV82Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp = AV40TFPoceCp ;
      AV83Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel = AV41TFPoceCp_Sel ;
      AV84Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 = AV59TFPoceCp2 ;
      AV85Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel = AV60TFPoceCp2_Sel ;
      AV86Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 = AV42TFProceTel1 ;
      AV87Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel = AV43TFProceTel1_Sel ;
      AV88Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 = AV44TFProceTel2 ;
      AV89Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel = AV45TFProceTel2_Sel ;
      AV90Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex = AV46TFProceTelex ;
      AV91Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel = AV47TFProceTelex_Sel ;
      AV92Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers = AV48TFProPers ;
      AV93Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel = AV49TFProPers_Sel ;
      AV94Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail = AV50TFProEmail ;
      AV95Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel = AV51TFProEmail_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e121OD2( )
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

   public void e131OD2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e141OD2( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProceCod") == 0 )
         {
            AV26TFProceCod = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFProceCod), 4, 0));
            AV27TFProceCod_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFProceCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFProceCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProceNom") == 0 )
         {
            AV28TFProceNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFProceNom", AV28TFProceNom);
            AV29TFProceNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFProceNom_Sel", AV29TFProceNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProceNif") == 0 )
         {
            AV30TFProceNif = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFProceNif", AV30TFProceNif);
            AV31TFProceNif_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFProceNif_Sel", AV31TFProceNif_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProceDom") == 0 )
         {
            AV32TFProceDom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFProceDom", AV32TFProceDom);
            AV33TFProceDom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFProceDom_Sel", AV33TFProceDom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProcePob") == 0 )
         {
            AV34TFProcePob = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFProcePob", AV34TFProcePob);
            AV35TFProcePob_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFProcePob_Sel", AV35TFProcePob_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvCod") == 0 )
         {
            AV36TFPrvCod = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFPrvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFPrvCod), 3, 0));
            AV37TFPrvCod_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFPrvCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFPrvCod_To), 3, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvDsc") == 0 )
         {
            AV38TFPrvDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFPrvDsc", AV38TFPrvDsc);
            AV39TFPrvDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFPrvDsc_Sel", AV39TFPrvDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PoceCp") == 0 )
         {
            AV40TFPoceCp = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFPoceCp", AV40TFPoceCp);
            AV41TFPoceCp_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFPoceCp_Sel", AV41TFPoceCp_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PoceCp2") == 0 )
         {
            AV59TFPoceCp2 = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFPoceCp2", AV59TFPoceCp2);
            AV60TFPoceCp2_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFPoceCp2_Sel", AV60TFPoceCp2_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProceTel1") == 0 )
         {
            AV42TFProceTel1 = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFProceTel1", AV42TFProceTel1);
            AV43TFProceTel1_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFProceTel1_Sel", AV43TFProceTel1_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProceTel2") == 0 )
         {
            AV44TFProceTel2 = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFProceTel2", AV44TFProceTel2);
            AV45TFProceTel2_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFProceTel2_Sel", AV45TFProceTel2_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProceTelex") == 0 )
         {
            AV46TFProceTelex = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFProceTelex", AV46TFProceTelex);
            AV47TFProceTelex_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFProceTelex_Sel", AV47TFProceTelex_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProPers") == 0 )
         {
            AV48TFProPers = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFProPers", AV48TFProPers);
            AV49TFProPers_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFProPers_Sel", AV49TFProPers_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProEmail") == 0 )
         {
            AV50TFProEmail = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFProEmail", AV50TFProEmail);
            AV51TFProEmail_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFProEmail_Sel", AV51TFProEmail_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e201OD2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(41) ;
      }
      sendrow_412( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_41_Refreshing )
      {
         httpContext.doAjaxLoad(41, GridRow);
      }
   }

   public void e151OD2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV18ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV20ColumnsSelector.fromJSonString(AV18ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "AlmacenSinDetalle.ListadodeProcedenciasTejido_WCColumnsSelector", ((GXutil.strcmp("", AV18ColumnsSelectorXML)==0) ? "" : AV20ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e111OD2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("AlmacenSinDetalle.ListadodeProcedenciasTejido_WCFilters")),GXutil.URLEncode(GXutil.rtrim(AV96Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("AlmacenSinDetalle.ListadodeProcedenciasTejido_WCFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV24ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "AlmacenSinDetalle.ListadodeProcedenciasTejido_WCFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         listadodeprocedenciastejido_wc_impl.this.GXt_char1 = GXv_char4[0] ;
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
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV96Pgmname+"GridState", AV24ManageFiltersXml) ;
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
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
   }

   public void e161OD2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV16ExcelFilename ;
      GXv_char3[0] = AV17ErrorMessage ;
      new app.almacensindetalle.listadodeprocedenciastejido_wcexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      listadodeprocedenciastejido_wc_impl.this.AV16ExcelFilename = GXv_char4[0] ;
      listadodeprocedenciastejido_wc_impl.this.AV17ErrorMessage = GXv_char3[0] ;
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

   public void e171OD2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.almacensindetalle.listadodeprocedenciastejido_wcexportcsv", new String[] {}, new String[] {}) );
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ProceCod", "", "Codigo", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ProceNom", "", "Nombre", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ProceNif", "", "Nif", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ProceDom", "", "Domicilio", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ProcePob", "", "Población", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrvCod", "", "Codigo", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrvDsc", "", "Provincia", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PoceCp", "", "Código Postal", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PoceCp2", "", "Postal (PT)", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ProceTel1", "", "Teléfono", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ProceTel2", "", "Teléfono", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ProceTelex", "", "Telex", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ProPers", "", "Persona Contacto", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ProEmail", "", "Email", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV19UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "AlmacenSinDetalle.ListadodeProcedenciasTejido_WCColumnsSelector", GXv_char4) ;
      listadodeprocedenciastejido_wc_impl.this.GXt_char1 = GXv_char4[0] ;
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
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "AlmacenSinDetalle.ListadodeProcedenciasTejido_WCFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV23ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV15FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
      AV26TFProceCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFProceCod), 4, 0));
      AV27TFProceCod_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFProceCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFProceCod_To), 4, 0));
      AV28TFProceNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFProceNom", AV28TFProceNom);
      AV29TFProceNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFProceNom_Sel", AV29TFProceNom_Sel);
      AV30TFProceNif = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFProceNif", AV30TFProceNif);
      AV31TFProceNif_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFProceNif_Sel", AV31TFProceNif_Sel);
      AV32TFProceDom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFProceDom", AV32TFProceDom);
      AV33TFProceDom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFProceDom_Sel", AV33TFProceDom_Sel);
      AV34TFProcePob = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFProcePob", AV34TFProcePob);
      AV35TFProcePob_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFProcePob_Sel", AV35TFProcePob_Sel);
      AV36TFPrvCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFPrvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFPrvCod), 3, 0));
      AV37TFPrvCod_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFPrvCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFPrvCod_To), 3, 0));
      AV38TFPrvDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFPrvDsc", AV38TFPrvDsc);
      AV39TFPrvDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFPrvDsc_Sel", AV39TFPrvDsc_Sel);
      AV40TFPoceCp = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFPoceCp", AV40TFPoceCp);
      AV41TFPoceCp_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFPoceCp_Sel", AV41TFPoceCp_Sel);
      AV59TFPoceCp2 = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFPoceCp2", AV59TFPoceCp2);
      AV60TFPoceCp2_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFPoceCp2_Sel", AV60TFPoceCp2_Sel);
      AV42TFProceTel1 = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFProceTel1", AV42TFProceTel1);
      AV43TFProceTel1_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFProceTel1_Sel", AV43TFProceTel1_Sel);
      AV44TFProceTel2 = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFProceTel2", AV44TFProceTel2);
      AV45TFProceTel2_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFProceTel2_Sel", AV45TFProceTel2_Sel);
      AV46TFProceTelex = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFProceTelex", AV46TFProceTelex);
      AV47TFProceTelex_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFProceTelex_Sel", AV47TFProceTelex_Sel);
      AV48TFProPers = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFProPers", AV48TFProPers);
      AV49TFProPers_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFProPers_Sel", AV49TFProPers_Sel);
      AV50TFProEmail = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFProEmail", AV50TFProEmail);
      AV51TFProEmail_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFProEmail_Sel", AV51TFProEmail_Sel);
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
      if ( GXutil.strcmp(AV22Session.getValue(AV96Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV96Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV96Pgmname+"GridState"), null, null);
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
      AV97GXV1 = 1 ;
      while ( AV97GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV97GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV15FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCECOD") == 0 )
         {
            AV26TFProceCod = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFProceCod), 4, 0));
            AV27TFProceCod_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFProceCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFProceCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENOM") == 0 )
         {
            AV28TFProceNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFProceNom", AV28TFProceNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENOM_SEL") == 0 )
         {
            AV29TFProceNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFProceNom_Sel", AV29TFProceNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENIF") == 0 )
         {
            AV30TFProceNif = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFProceNif", AV30TFProceNif);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENIF_SEL") == 0 )
         {
            AV31TFProceNif_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFProceNif_Sel", AV31TFProceNif_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCEDOM") == 0 )
         {
            AV32TFProceDom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFProceDom", AV32TFProceDom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCEDOM_SEL") == 0 )
         {
            AV33TFProceDom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFProceDom_Sel", AV33TFProceDom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCEPOB") == 0 )
         {
            AV34TFProcePob = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFProcePob", AV34TFProcePob);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCEPOB_SEL") == 0 )
         {
            AV35TFProcePob_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFProcePob_Sel", AV35TFProcePob_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCOD") == 0 )
         {
            AV36TFPrvCod = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFPrvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFPrvCod), 3, 0));
            AV37TFPrvCod_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFPrvCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFPrvCod_To), 3, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDSC") == 0 )
         {
            AV38TFPrvDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFPrvDsc", AV38TFPrvDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDSC_SEL") == 0 )
         {
            AV39TFPrvDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFPrvDsc_Sel", AV39TFPrvDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPOCECP") == 0 )
         {
            AV40TFPoceCp = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFPoceCp", AV40TFPoceCp);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPOCECP_SEL") == 0 )
         {
            AV41TFPoceCp_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFPoceCp_Sel", AV41TFPoceCp_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPOCECP2") == 0 )
         {
            AV59TFPoceCp2 = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFPoceCp2", AV59TFPoceCp2);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPOCECP2_SEL") == 0 )
         {
            AV60TFPoceCp2_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFPoceCp2_Sel", AV60TFPoceCp2_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCETEL1") == 0 )
         {
            AV42TFProceTel1 = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFProceTel1", AV42TFProceTel1);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCETEL1_SEL") == 0 )
         {
            AV43TFProceTel1_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFProceTel1_Sel", AV43TFProceTel1_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCETEL2") == 0 )
         {
            AV44TFProceTel2 = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFProceTel2", AV44TFProceTel2);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCETEL2_SEL") == 0 )
         {
            AV45TFProceTel2_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFProceTel2_Sel", AV45TFProceTel2_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCETELEX") == 0 )
         {
            AV46TFProceTelex = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFProceTelex", AV46TFProceTelex);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCETELEX_SEL") == 0 )
         {
            AV47TFProceTelex_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFProceTelex_Sel", AV47TFProceTelex_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROPERS") == 0 )
         {
            AV48TFProPers = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFProPers", AV48TFProPers);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROPERS_SEL") == 0 )
         {
            AV49TFProPers_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFProPers_Sel", AV49TFProPers_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROEMAIL") == 0 )
         {
            AV50TFProEmail = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFProEmail", AV50TFProEmail);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROEMAIL_SEL") == 0 )
         {
            AV51TFProEmail_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFProEmail_Sel", AV51TFProEmail_Sel);
         }
         AV97GXV1 = (int)(AV97GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV29TFProceNom_Sel)==0), AV29TFProceNom_Sel, GXv_char4) ;
      listadodeprocedenciastejido_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV31TFProceNif_Sel)==0), AV31TFProceNif_Sel, GXv_char3) ;
      listadodeprocedenciastejido_wc_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char2[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV33TFProceDom_Sel)==0), AV33TFProceDom_Sel, GXv_char2) ;
      listadodeprocedenciastejido_wc_impl.this.GXt_char13 = GXv_char2[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV35TFProcePob_Sel)==0), AV35TFProcePob_Sel, GXv_char15) ;
      listadodeprocedenciastejido_wc_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV39TFPrvDsc_Sel)==0), AV39TFPrvDsc_Sel, GXv_char17) ;
      listadodeprocedenciastejido_wc_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV41TFPoceCp_Sel)==0), AV41TFPoceCp_Sel, GXv_char19) ;
      listadodeprocedenciastejido_wc_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV60TFPoceCp2_Sel)==0), AV60TFPoceCp2_Sel, GXv_char21) ;
      listadodeprocedenciastejido_wc_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV43TFProceTel1_Sel)==0), AV43TFProceTel1_Sel, GXv_char23) ;
      listadodeprocedenciastejido_wc_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV45TFProceTel2_Sel)==0), AV45TFProceTel2_Sel, GXv_char25) ;
      listadodeprocedenciastejido_wc_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char26 = "" ;
      GXv_char27[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV47TFProceTelex_Sel)==0), AV47TFProceTelex_Sel, GXv_char27) ;
      listadodeprocedenciastejido_wc_impl.this.GXt_char26 = GXv_char27[0] ;
      GXt_char28 = "" ;
      GXv_char29[0] = GXt_char28 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV49TFProPers_Sel)==0), AV49TFProPers_Sel, GXv_char29) ;
      listadodeprocedenciastejido_wc_impl.this.GXt_char28 = GXv_char29[0] ;
      GXt_char30 = "" ;
      GXv_char31[0] = GXt_char30 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV51TFProEmail_Sel)==0), AV51TFProEmail_Sel, GXv_char31) ;
      listadodeprocedenciastejido_wc_impl.this.GXt_char30 = GXv_char31[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|"+GXt_char12+"|"+GXt_char13+"|"+GXt_char14+"||"+GXt_char16+"|"+GXt_char18+"|"+GXt_char20+"|"+GXt_char22+"|"+GXt_char24+"|"+GXt_char26+"|"+GXt_char28+"|"+GXt_char30 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char30 = "" ;
      GXv_char31[0] = GXt_char30 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV28TFProceNom)==0), AV28TFProceNom, GXv_char31) ;
      listadodeprocedenciastejido_wc_impl.this.GXt_char30 = GXv_char31[0] ;
      GXt_char28 = "" ;
      GXv_char29[0] = GXt_char28 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV30TFProceNif)==0), AV30TFProceNif, GXv_char29) ;
      listadodeprocedenciastejido_wc_impl.this.GXt_char28 = GXv_char29[0] ;
      GXt_char26 = "" ;
      GXv_char27[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV32TFProceDom)==0), AV32TFProceDom, GXv_char27) ;
      listadodeprocedenciastejido_wc_impl.this.GXt_char26 = GXv_char27[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV34TFProcePob)==0), AV34TFProcePob, GXv_char25) ;
      listadodeprocedenciastejido_wc_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV38TFPrvDsc)==0), AV38TFPrvDsc, GXv_char23) ;
      listadodeprocedenciastejido_wc_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV40TFPoceCp)==0), AV40TFPoceCp, GXv_char21) ;
      listadodeprocedenciastejido_wc_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV59TFPoceCp2)==0), AV59TFPoceCp2, GXv_char19) ;
      listadodeprocedenciastejido_wc_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV42TFProceTel1)==0), AV42TFProceTel1, GXv_char17) ;
      listadodeprocedenciastejido_wc_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV44TFProceTel2)==0), AV44TFProceTel2, GXv_char15) ;
      listadodeprocedenciastejido_wc_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV46TFProceTelex)==0), AV46TFProceTelex, GXv_char4) ;
      listadodeprocedenciastejido_wc_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV48TFProPers)==0), AV48TFProPers, GXv_char3) ;
      listadodeprocedenciastejido_wc_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV50TFProEmail)==0), AV50TFProEmail, GXv_char2) ;
      listadodeprocedenciastejido_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV26TFProceCod) ? "" : GXutil.str( AV26TFProceCod, 4, 0))+"|"+GXt_char30+"|"+GXt_char28+"|"+GXt_char26+"|"+GXt_char24+"|"+((0==AV36TFPrvCod) ? "" : GXutil.str( AV36TFPrvCod, 3, 0))+"|"+GXt_char22+"|"+GXt_char20+"|"+GXt_char18+"|"+GXt_char16+"|"+GXt_char14+"|"+GXt_char13+"|"+GXt_char12+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV27TFProceCod_To) ? "" : GXutil.str( AV27TFProceCod_To, 4, 0))+"|||||"+((0==AV37TFPrvCod_To) ? "" : GXutil.str( AV37TFPrvCod_To, 3, 0))+"||||||||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV22Session.getValue(AV96Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState32, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV15FilterFullText)==0), (short)(0), AV15FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFPROCECOD", "", !((0==AV26TFProceCod)&&(0==AV27TFProceCod_To)), (short)(0), GXutil.trim( GXutil.str( AV26TFProceCod, 4, 0)), GXutil.trim( GXutil.str( AV27TFProceCod_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFPROCENOM", "", !(GXutil.strcmp("", AV28TFProceNom)==0), (short)(0), AV28TFProceNom, "", !(GXutil.strcmp("", AV29TFProceNom_Sel)==0), AV29TFProceNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFPROCENIF", "", !(GXutil.strcmp("", AV30TFProceNif)==0), (short)(0), AV30TFProceNif, "", !(GXutil.strcmp("", AV31TFProceNif_Sel)==0), AV31TFProceNif_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFPROCEDOM", "", !(GXutil.strcmp("", AV32TFProceDom)==0), (short)(0), AV32TFProceDom, "", !(GXutil.strcmp("", AV33TFProceDom_Sel)==0), AV33TFProceDom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFPROCEPOB", "", !(GXutil.strcmp("", AV34TFProcePob)==0), (short)(0), AV34TFProcePob, "", !(GXutil.strcmp("", AV35TFProcePob_Sel)==0), AV35TFProcePob_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFPRVCOD", "", !((0==AV36TFPrvCod)&&(0==AV37TFPrvCod_To)), (short)(0), GXutil.trim( GXutil.str( AV36TFPrvCod, 3, 0)), GXutil.trim( GXutil.str( AV37TFPrvCod_To, 3, 0))) ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFPRVDSC", "", !(GXutil.strcmp("", AV38TFPrvDsc)==0), (short)(0), AV38TFPrvDsc, "", !(GXutil.strcmp("", AV39TFPrvDsc_Sel)==0), AV39TFPrvDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFPOCECP", "", !(GXutil.strcmp("", AV40TFPoceCp)==0), (short)(0), AV40TFPoceCp, "", !(GXutil.strcmp("", AV41TFPoceCp_Sel)==0), AV41TFPoceCp_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFPOCECP2", "", !(GXutil.strcmp("", AV59TFPoceCp2)==0), (short)(0), AV59TFPoceCp2, "", !(GXutil.strcmp("", AV60TFPoceCp2_Sel)==0), AV60TFPoceCp2_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFPROCETEL1", "", !(GXutil.strcmp("", AV42TFProceTel1)==0), (short)(0), AV42TFProceTel1, "", !(GXutil.strcmp("", AV43TFProceTel1_Sel)==0), AV43TFProceTel1_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFPROCETEL2", "", !(GXutil.strcmp("", AV44TFProceTel2)==0), (short)(0), AV44TFProceTel2, "", !(GXutil.strcmp("", AV45TFProceTel2_Sel)==0), AV45TFProceTel2_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFPROCETELEX", "", !(GXutil.strcmp("", AV46TFProceTelex)==0), (short)(0), AV46TFProceTelex, "", !(GXutil.strcmp("", AV47TFProceTelex_Sel)==0), AV47TFProceTelex_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFPROPERS", "", !(GXutil.strcmp("", AV48TFProPers)==0), (short)(0), AV48TFProPers, "", !(GXutil.strcmp("", AV49TFProPers_Sel)==0), AV49TFProPers_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFPROEMAIL", "", !(GXutil.strcmp("", AV50TFProEmail)==0), (short)(0), AV50TFProEmail, "", !(GXutil.strcmp("", AV51TFProEmail_Sel)==0), AV51TFProEmail_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      if ( ! (GXutil.strcmp("", AV56Emprcod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV56Emprcod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV57Procecodfrom) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PROCECODFROM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV57Procecodfrom, 4, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV58Procecodto) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PROCECODTO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV58Procecodto, 4, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV96Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV96Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TPROCED" );
      AV9TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "Emprcod" );
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( AV56Emprcod );
      AV8TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_23_1OD2( boolean wbgen )
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
         wb_table2_28_1OD2( true) ;
      }
      else
      {
         wb_table2_28_1OD2( false) ;
      }
      return  ;
   }

   public void wb_table2_28_1OD2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_23_1OD2e( true) ;
      }
      else
      {
         wb_table1_23_1OD2e( false) ;
      }
   }

   public void wb_table2_28_1OD2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'" + sPrefix + "',false,'" + sGXsfl_41_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV15FilterFullText, GXutil.rtrim( localUtil.format( AV15FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_AlmacenSinDetalle\\ListadodeProcedenciasTejido_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_28_1OD2e( true) ;
      }
      else
      {
         wb_table2_28_1OD2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV56Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56Emprcod", AV56Emprcod);
      AV57Procecodfrom = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57Procecodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57Procecodfrom), 4, 0));
      AV58Procecodto = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58Procecodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58Procecodto), 4, 0));
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
      pa1OD2( ) ;
      ws1OD2( ) ;
      we1OD2( ) ;
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
      sCtrlAV57Procecodfrom = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV58Procecodto = (String)getParm(obj,2,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1OD2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "almacensindetalle\\listadodeprocedenciastejido_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1OD2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV56Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56Emprcod", AV56Emprcod);
         AV57Procecodfrom = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57Procecodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57Procecodfrom), 4, 0));
         AV58Procecodto = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58Procecodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58Procecodto), 4, 0));
      }
      wcpOAV56Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV56Emprcod") ;
      wcpOAV57Procecodfrom = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV57Procecodfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV58Procecodto = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV58Procecodto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV56Emprcod, wcpOAV56Emprcod) != 0 ) || ( AV57Procecodfrom != wcpOAV57Procecodfrom ) || ( AV58Procecodto != wcpOAV58Procecodto ) ) )
      {
         setjustcreated();
      }
      wcpOAV56Emprcod = AV56Emprcod ;
      wcpOAV57Procecodfrom = AV57Procecodfrom ;
      wcpOAV58Procecodto = AV58Procecodto ;
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
      sCtrlAV57Procecodfrom = httpContext.cgiGet( sPrefix+"AV57Procecodfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV57Procecodfrom) > 0 )
      {
         AV57Procecodfrom = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV57Procecodfrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57Procecodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57Procecodfrom), 4, 0));
      }
      else
      {
         AV57Procecodfrom = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV57Procecodfrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV58Procecodto = httpContext.cgiGet( sPrefix+"AV58Procecodto_CTRL") ;
      if ( GXutil.len( sCtrlAV58Procecodto) > 0 )
      {
         AV58Procecodto = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV58Procecodto), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58Procecodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58Procecodto), 4, 0));
      }
      else
      {
         AV58Procecodto = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV58Procecodto_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa1OD2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1OD2( ) ;
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
      ws1OD2( ) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV57Procecodfrom_PARM", GXutil.ltrim( localUtil.ntoc( AV57Procecodfrom, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV57Procecodfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV57Procecodfrom_CTRL", GXutil.rtrim( sCtrlAV57Procecodfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV58Procecodto_PARM", GXutil.ltrim( localUtil.ntoc( AV58Procecodto, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV58Procecodto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV58Procecodto_CTRL", GXutil.rtrim( sCtrlAV58Procecodto));
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
      we1OD2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211653826", true, true);
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
      httpContext.AddJavascriptSource("almacensindetalle/listadodeprocedenciastejido_wc.js", "?20268211653826", false, true);
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

   public void subsflControlProps_412( )
   {
      edtProceCod_Internalname = sPrefix+"PROCECOD_"+sGXsfl_41_idx ;
      edtProceNom_Internalname = sPrefix+"PROCENOM_"+sGXsfl_41_idx ;
      edtProceNif_Internalname = sPrefix+"PROCENIF_"+sGXsfl_41_idx ;
      edtProceDom_Internalname = sPrefix+"PROCEDOM_"+sGXsfl_41_idx ;
      edtProcePob_Internalname = sPrefix+"PROCEPOB_"+sGXsfl_41_idx ;
      edtPrvCod_Internalname = sPrefix+"PRVCOD_"+sGXsfl_41_idx ;
      edtPrvDsc_Internalname = sPrefix+"PRVDSC_"+sGXsfl_41_idx ;
      edtPoceCp_Internalname = sPrefix+"POCECP_"+sGXsfl_41_idx ;
      edtPoceCp2_Internalname = sPrefix+"POCECP2_"+sGXsfl_41_idx ;
      edtProceTel1_Internalname = sPrefix+"PROCETEL1_"+sGXsfl_41_idx ;
      edtProceTel2_Internalname = sPrefix+"PROCETEL2_"+sGXsfl_41_idx ;
      edtProceTelex_Internalname = sPrefix+"PROCETELEX_"+sGXsfl_41_idx ;
      edtProceIe_Internalname = sPrefix+"PROCEIE_"+sGXsfl_41_idx ;
      edtGpoEcoCod_Internalname = sPrefix+"GPOECOCOD_"+sGXsfl_41_idx ;
      edtProceNomID_Internalname = sPrefix+"PROCENOMID_"+sGXsfl_41_idx ;
      edtGpoEcoNom_Internalname = sPrefix+"GPOECONOM_"+sGXsfl_41_idx ;
      edtProPers_Internalname = sPrefix+"PROPERS_"+sGXsfl_41_idx ;
      edtProEmail_Internalname = sPrefix+"PROEMAIL_"+sGXsfl_41_idx ;
   }

   public void subsflControlProps_fel_412( )
   {
      edtProceCod_Internalname = sPrefix+"PROCECOD_"+sGXsfl_41_fel_idx ;
      edtProceNom_Internalname = sPrefix+"PROCENOM_"+sGXsfl_41_fel_idx ;
      edtProceNif_Internalname = sPrefix+"PROCENIF_"+sGXsfl_41_fel_idx ;
      edtProceDom_Internalname = sPrefix+"PROCEDOM_"+sGXsfl_41_fel_idx ;
      edtProcePob_Internalname = sPrefix+"PROCEPOB_"+sGXsfl_41_fel_idx ;
      edtPrvCod_Internalname = sPrefix+"PRVCOD_"+sGXsfl_41_fel_idx ;
      edtPrvDsc_Internalname = sPrefix+"PRVDSC_"+sGXsfl_41_fel_idx ;
      edtPoceCp_Internalname = sPrefix+"POCECP_"+sGXsfl_41_fel_idx ;
      edtPoceCp2_Internalname = sPrefix+"POCECP2_"+sGXsfl_41_fel_idx ;
      edtProceTel1_Internalname = sPrefix+"PROCETEL1_"+sGXsfl_41_fel_idx ;
      edtProceTel2_Internalname = sPrefix+"PROCETEL2_"+sGXsfl_41_fel_idx ;
      edtProceTelex_Internalname = sPrefix+"PROCETELEX_"+sGXsfl_41_fel_idx ;
      edtProceIe_Internalname = sPrefix+"PROCEIE_"+sGXsfl_41_fel_idx ;
      edtGpoEcoCod_Internalname = sPrefix+"GPOECOCOD_"+sGXsfl_41_fel_idx ;
      edtProceNomID_Internalname = sPrefix+"PROCENOMID_"+sGXsfl_41_fel_idx ;
      edtGpoEcoNom_Internalname = sPrefix+"GPOECONOM_"+sGXsfl_41_fel_idx ;
      edtProPers_Internalname = sPrefix+"PROPERS_"+sGXsfl_41_fel_idx ;
      edtProEmail_Internalname = sPrefix+"PROEMAIL_"+sGXsfl_41_fel_idx ;
   }

   public void sendrow_412( )
   {
      subsflControlProps_412( ) ;
      wb1OD0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_41_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_41_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_41_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtProceCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProceCod_Internalname,GXutil.ltrim( localUtil.ntoc( A970ProceCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A970ProceCod), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtProceCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtProceCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtProceNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProceNom_Internalname,GXutil.rtrim( A971ProceNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtProceNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtProceNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtProceNif_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProceNif_Internalname,GXutil.rtrim( A993ProceNif),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtProceNif_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtProceNif_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtProceDom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProceDom_Internalname,GXutil.rtrim( A994ProceDom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtProceDom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtProceDom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtProcePob_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProcePob_Internalname,GXutil.rtrim( A988ProcePob),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtProcePob_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtProcePob_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrvCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvCod_Internalname,GXutil.ltrim( localUtil.ntoc( A781PrvCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A781PrvCod), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrvCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrvCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrvDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvDsc_Internalname,GXutil.rtrim( A787PrvDsc),GXutil.rtrim( localUtil.format( A787PrvDsc, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrvDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrvDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPoceCp_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPoceCp_Internalname,GXutil.rtrim( A989PoceCp),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPoceCp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPoceCp_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPoceCp2_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPoceCp2_Internalname,GXutil.rtrim( A14029PoceCp2),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPoceCp2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPoceCp2_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtProceTel1_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProceTel1_Internalname,GXutil.rtrim( A990ProceTel1),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtProceTel1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtProceTel1_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtProceTel2_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProceTel2_Internalname,GXutil.rtrim( A991ProceTel2),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtProceTel2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtProceTel2_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtProceTelex_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProceTelex_Internalname,GXutil.rtrim( A992ProceTelex),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtProceTelex_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtProceTelex_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProceIe_Internalname,GXutil.rtrim( A6187ProceIe),GXutil.rtrim( localUtil.format( A6187ProceIe, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtProceIe_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGpoEcoCod_Internalname,GXutil.ltrim( localUtil.ntoc( A10122GpoEcoCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A10122GpoEcoCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtGpoEcoCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProceNomID_Internalname,A13820ProceNomID,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtProceNomID_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGpoEcoNom_Internalname,A10123GpoEcoNom,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtGpoEcoNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtProPers_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProPers_Internalname,GXutil.rtrim( A10390ProPers),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtProPers_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtProPers_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtProEmail_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProEmail_Internalname,GXutil.rtrim( A10391ProEmail),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtProEmail_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtProEmail_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes1OD2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_41_idx = ((subGrid_Islastpage==1)&&(nGXsfl_41_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_41_idx+1) ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_412( ) ;
      }
      /* End function sendrow_412 */
   }

   public void startgridcontrol41( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"41\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtProceCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtProceNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtProceNif_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nif", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtProceDom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Domicilio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtProcePob_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Población", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrvCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrvDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Provincia", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPoceCp_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código Postal", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPoceCp2_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Postal (PT)", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtProceTel1_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Teléfono", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtProceTel2_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Teléfono", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtProceTelex_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Telex", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtProPers_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Persona Contacto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtProEmail_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Email", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A970ProceCod, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtProceCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A971ProceNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtProceNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A993ProceNif));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtProceNif_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A994ProceDom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtProceDom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A988ProcePob));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtProcePob_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A781PrvCod, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrvCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A787PrvDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrvDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A989PoceCp));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPoceCp_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14029PoceCp2));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPoceCp2_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A990ProceTel1));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtProceTel1_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A991ProceTel2));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtProceTel2_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A992ProceTelex));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtProceTelex_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A6187ProceIe));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10122GpoEcoCod, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A13820ProceNomID);
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A10123GpoEcoNom);
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A10390ProPers));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtProPers_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A10391ProEmail));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtProEmail_Visible, (byte)(5), (byte)(0), ".", "")));
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
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtProceCod_Internalname = sPrefix+"PROCECOD" ;
      edtProceNom_Internalname = sPrefix+"PROCENOM" ;
      edtProceNif_Internalname = sPrefix+"PROCENIF" ;
      edtProceDom_Internalname = sPrefix+"PROCEDOM" ;
      edtProcePob_Internalname = sPrefix+"PROCEPOB" ;
      edtPrvCod_Internalname = sPrefix+"PRVCOD" ;
      edtPrvDsc_Internalname = sPrefix+"PRVDSC" ;
      edtPoceCp_Internalname = sPrefix+"POCECP" ;
      edtPoceCp2_Internalname = sPrefix+"POCECP2" ;
      edtProceTel1_Internalname = sPrefix+"PROCETEL1" ;
      edtProceTel2_Internalname = sPrefix+"PROCETEL2" ;
      edtProceTelex_Internalname = sPrefix+"PROCETELEX" ;
      edtProceIe_Internalname = sPrefix+"PROCEIE" ;
      edtGpoEcoCod_Internalname = sPrefix+"GPOECOCOD" ;
      edtProceNomID_Internalname = sPrefix+"PROCENOMID" ;
      edtGpoEcoNom_Internalname = sPrefix+"GPOECONOM" ;
      edtProPers_Internalname = sPrefix+"PROPERS" ;
      edtProEmail_Internalname = sPrefix+"PROEMAIL" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
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
      edtProEmail_Jsonclick = "" ;
      edtProPers_Jsonclick = "" ;
      edtGpoEcoNom_Jsonclick = "" ;
      edtProceNomID_Jsonclick = "" ;
      edtGpoEcoCod_Jsonclick = "" ;
      edtProceIe_Jsonclick = "" ;
      edtProceTelex_Jsonclick = "" ;
      edtProceTel2_Jsonclick = "" ;
      edtProceTel1_Jsonclick = "" ;
      edtPoceCp2_Jsonclick = "" ;
      edtPoceCp_Jsonclick = "" ;
      edtPrvDsc_Jsonclick = "" ;
      edtPrvCod_Jsonclick = "" ;
      edtProcePob_Jsonclick = "" ;
      edtProceDom_Jsonclick = "" ;
      edtProceNif_Jsonclick = "" ;
      edtProceNom_Jsonclick = "" ;
      edtProceCod_Jsonclick = "" ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtProEmail_Visible = -1 ;
      edtProPers_Visible = -1 ;
      edtProceTelex_Visible = -1 ;
      edtProceTel2_Visible = -1 ;
      edtProceTel1_Visible = -1 ;
      edtPoceCp2_Visible = -1 ;
      edtPoceCp_Visible = -1 ;
      edtPrvDsc_Visible = -1 ;
      edtPrvCod_Visible = -1 ;
      edtProcePob_Visible = -1 ;
      edtProceDom_Visible = -1 ;
      edtProceNif_Visible = -1 ;
      edtProceNom_Visible = -1 ;
      edtProceCod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Visible = 1 ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "AlmacenSinDetalle.ListadodeProcedenciasTejido_WCGetFilterData" ;
      Ddo_grid_Datalisttype = "|Dynamic|Dynamic|Dynamic|Dynamic||Dynamic|Dynamic|Dynamic|Dynamic|Dynamic|Dynamic|Dynamic|Dynamic" ;
      Ddo_grid_Includedatalist = "|T|T|T|T||T|T|T|T|T|T|T|T" ;
      Ddo_grid_Filterisrange = "T|||||T||||||||" ;
      Ddo_grid_Filtertype = "Numeric|Character|Character|Character|Character|Numeric|Character|Character|Character|Character|Character|Character|Character|Character" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|1|3|4|5|6|7|8|9|10|11|12|13|14" ;
      Ddo_grid_Columnids = "0:ProceCod|1:ProceNom|2:ProceNif|3:ProceDom|4:ProcePob|5:PrvCod|6:PrvDsc|7:PoceCp|8:PoceCp2|9:ProceTel1|10:ProceTel2|11:ProceTelex|16:ProPers|17:ProEmail" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV66Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod',fld:'vALMACENSINDETALLE_LISTADODEPROCEDENCIASTEJIDO_WCDS_1_EMPRCOD',pic:'@!'},{av:'sPrefix'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV57Procecodfrom',fld:'vPROCECODFROM',pic:'ZZZ9'},{av:'AV58Procecodto',fld:'vPROCECODTO',pic:'ZZZ9'},{av:'AV56Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV26TFProceCod',fld:'vTFPROCECOD',pic:'ZZZ9'},{av:'AV27TFProceCod_To',fld:'vTFPROCECOD_TO',pic:'ZZZ9'},{av:'AV28TFProceNom',fld:'vTFPROCENOM',pic:''},{av:'AV29TFProceNom_Sel',fld:'vTFPROCENOM_SEL',pic:''},{av:'AV30TFProceNif',fld:'vTFPROCENIF',pic:''},{av:'AV31TFProceNif_Sel',fld:'vTFPROCENIF_SEL',pic:''},{av:'AV32TFProceDom',fld:'vTFPROCEDOM',pic:''},{av:'AV33TFProceDom_Sel',fld:'vTFPROCEDOM_SEL',pic:''},{av:'AV34TFProcePob',fld:'vTFPROCEPOB',pic:''},{av:'AV35TFProcePob_Sel',fld:'vTFPROCEPOB_SEL',pic:''},{av:'AV36TFPrvCod',fld:'vTFPRVCOD',pic:'ZZ9'},{av:'AV37TFPrvCod_To',fld:'vTFPRVCOD_TO',pic:'ZZ9'},{av:'AV38TFPrvDsc',fld:'vTFPRVDSC',pic:'@!'},{av:'AV39TFPrvDsc_Sel',fld:'vTFPRVDSC_SEL',pic:'@!'},{av:'AV40TFPoceCp',fld:'vTFPOCECP',pic:''},{av:'AV41TFPoceCp_Sel',fld:'vTFPOCECP_SEL',pic:''},{av:'AV59TFPoceCp2',fld:'vTFPOCECP2',pic:''},{av:'AV60TFPoceCp2_Sel',fld:'vTFPOCECP2_SEL',pic:''},{av:'AV42TFProceTel1',fld:'vTFPROCETEL1',pic:''},{av:'AV43TFProceTel1_Sel',fld:'vTFPROCETEL1_SEL',pic:''},{av:'AV44TFProceTel2',fld:'vTFPROCETEL2',pic:''},{av:'AV45TFProceTel2_Sel',fld:'vTFPROCETEL2_SEL',pic:''},{av:'AV46TFProceTelex',fld:'vTFPROCETELEX',pic:''},{av:'AV47TFProceTelex_Sel',fld:'vTFPROCETELEX_SEL',pic:''},{av:'AV48TFProPers',fld:'vTFPROPERS',pic:''},{av:'AV49TFProPers_Sel',fld:'vTFPROPERS_SEL',pic:''},{av:'AV50TFProEmail',fld:'vTFPROEMAIL',pic:''},{av:'AV51TFProEmail_Sel',fld:'vTFPROEMAIL_SEL',pic:''},{av:'AV96Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtProceCod_Visible',ctrl:'PROCECOD',prop:'Visible'},{av:'edtProceNom_Visible',ctrl:'PROCENOM',prop:'Visible'},{av:'edtProceNif_Visible',ctrl:'PROCENIF',prop:'Visible'},{av:'edtProceDom_Visible',ctrl:'PROCEDOM',prop:'Visible'},{av:'edtProcePob_Visible',ctrl:'PROCEPOB',prop:'Visible'},{av:'edtPrvCod_Visible',ctrl:'PRVCOD',prop:'Visible'},{av:'edtPrvDsc_Visible',ctrl:'PRVDSC',prop:'Visible'},{av:'edtPoceCp_Visible',ctrl:'POCECP',prop:'Visible'},{av:'edtPoceCp2_Visible',ctrl:'POCECP2',prop:'Visible'},{av:'edtProceTel1_Visible',ctrl:'PROCETEL1',prop:'Visible'},{av:'edtProceTel2_Visible',ctrl:'PROCETEL2',prop:'Visible'},{av:'edtProceTelex_Visible',ctrl:'PROCETELEX',prop:'Visible'},{av:'edtProPers_Visible',ctrl:'PROPERS',prop:'Visible'},{av:'edtProEmail_Visible',ctrl:'PROEMAIL',prop:'Visible'},{av:'AV54GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV55GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e121OD2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV57Procecodfrom',fld:'vPROCECODFROM',pic:'ZZZ9'},{av:'AV58Procecodto',fld:'vPROCECODTO',pic:'ZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV56Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV26TFProceCod',fld:'vTFPROCECOD',pic:'ZZZ9'},{av:'AV27TFProceCod_To',fld:'vTFPROCECOD_TO',pic:'ZZZ9'},{av:'AV28TFProceNom',fld:'vTFPROCENOM',pic:''},{av:'AV29TFProceNom_Sel',fld:'vTFPROCENOM_SEL',pic:''},{av:'AV30TFProceNif',fld:'vTFPROCENIF',pic:''},{av:'AV31TFProceNif_Sel',fld:'vTFPROCENIF_SEL',pic:''},{av:'AV32TFProceDom',fld:'vTFPROCEDOM',pic:''},{av:'AV33TFProceDom_Sel',fld:'vTFPROCEDOM_SEL',pic:''},{av:'AV34TFProcePob',fld:'vTFPROCEPOB',pic:''},{av:'AV35TFProcePob_Sel',fld:'vTFPROCEPOB_SEL',pic:''},{av:'AV36TFPrvCod',fld:'vTFPRVCOD',pic:'ZZ9'},{av:'AV37TFPrvCod_To',fld:'vTFPRVCOD_TO',pic:'ZZ9'},{av:'AV38TFPrvDsc',fld:'vTFPRVDSC',pic:'@!'},{av:'AV39TFPrvDsc_Sel',fld:'vTFPRVDSC_SEL',pic:'@!'},{av:'AV40TFPoceCp',fld:'vTFPOCECP',pic:''},{av:'AV41TFPoceCp_Sel',fld:'vTFPOCECP_SEL',pic:''},{av:'AV59TFPoceCp2',fld:'vTFPOCECP2',pic:''},{av:'AV60TFPoceCp2_Sel',fld:'vTFPOCECP2_SEL',pic:''},{av:'AV42TFProceTel1',fld:'vTFPROCETEL1',pic:''},{av:'AV43TFProceTel1_Sel',fld:'vTFPROCETEL1_SEL',pic:''},{av:'AV44TFProceTel2',fld:'vTFPROCETEL2',pic:''},{av:'AV45TFProceTel2_Sel',fld:'vTFPROCETEL2_SEL',pic:''},{av:'AV46TFProceTelex',fld:'vTFPROCETELEX',pic:''},{av:'AV47TFProceTelex_Sel',fld:'vTFPROCETELEX_SEL',pic:''},{av:'AV48TFProPers',fld:'vTFPROPERS',pic:''},{av:'AV49TFProPers_Sel',fld:'vTFPROPERS_SEL',pic:''},{av:'AV50TFProEmail',fld:'vTFPROEMAIL',pic:''},{av:'AV51TFProEmail_Sel',fld:'vTFPROEMAIL_SEL',pic:''},{av:'AV96Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV66Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod',fld:'vALMACENSINDETALLE_LISTADODEPROCEDENCIASTEJIDO_WCDS_1_EMPRCOD',pic:'@!'},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e131OD2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV57Procecodfrom',fld:'vPROCECODFROM',pic:'ZZZ9'},{av:'AV58Procecodto',fld:'vPROCECODTO',pic:'ZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV56Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV26TFProceCod',fld:'vTFPROCECOD',pic:'ZZZ9'},{av:'AV27TFProceCod_To',fld:'vTFPROCECOD_TO',pic:'ZZZ9'},{av:'AV28TFProceNom',fld:'vTFPROCENOM',pic:''},{av:'AV29TFProceNom_Sel',fld:'vTFPROCENOM_SEL',pic:''},{av:'AV30TFProceNif',fld:'vTFPROCENIF',pic:''},{av:'AV31TFProceNif_Sel',fld:'vTFPROCENIF_SEL',pic:''},{av:'AV32TFProceDom',fld:'vTFPROCEDOM',pic:''},{av:'AV33TFProceDom_Sel',fld:'vTFPROCEDOM_SEL',pic:''},{av:'AV34TFProcePob',fld:'vTFPROCEPOB',pic:''},{av:'AV35TFProcePob_Sel',fld:'vTFPROCEPOB_SEL',pic:''},{av:'AV36TFPrvCod',fld:'vTFPRVCOD',pic:'ZZ9'},{av:'AV37TFPrvCod_To',fld:'vTFPRVCOD_TO',pic:'ZZ9'},{av:'AV38TFPrvDsc',fld:'vTFPRVDSC',pic:'@!'},{av:'AV39TFPrvDsc_Sel',fld:'vTFPRVDSC_SEL',pic:'@!'},{av:'AV40TFPoceCp',fld:'vTFPOCECP',pic:''},{av:'AV41TFPoceCp_Sel',fld:'vTFPOCECP_SEL',pic:''},{av:'AV59TFPoceCp2',fld:'vTFPOCECP2',pic:''},{av:'AV60TFPoceCp2_Sel',fld:'vTFPOCECP2_SEL',pic:''},{av:'AV42TFProceTel1',fld:'vTFPROCETEL1',pic:''},{av:'AV43TFProceTel1_Sel',fld:'vTFPROCETEL1_SEL',pic:''},{av:'AV44TFProceTel2',fld:'vTFPROCETEL2',pic:''},{av:'AV45TFProceTel2_Sel',fld:'vTFPROCETEL2_SEL',pic:''},{av:'AV46TFProceTelex',fld:'vTFPROCETELEX',pic:''},{av:'AV47TFProceTelex_Sel',fld:'vTFPROCETELEX_SEL',pic:''},{av:'AV48TFProPers',fld:'vTFPROPERS',pic:''},{av:'AV49TFProPers_Sel',fld:'vTFPROPERS_SEL',pic:''},{av:'AV50TFProEmail',fld:'vTFPROEMAIL',pic:''},{av:'AV51TFProEmail_Sel',fld:'vTFPROEMAIL_SEL',pic:''},{av:'AV96Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV66Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod',fld:'vALMACENSINDETALLE_LISTADODEPROCEDENCIASTEJIDO_WCDS_1_EMPRCOD',pic:'@!'},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e141OD2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV57Procecodfrom',fld:'vPROCECODFROM',pic:'ZZZ9'},{av:'AV58Procecodto',fld:'vPROCECODTO',pic:'ZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV56Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV26TFProceCod',fld:'vTFPROCECOD',pic:'ZZZ9'},{av:'AV27TFProceCod_To',fld:'vTFPROCECOD_TO',pic:'ZZZ9'},{av:'AV28TFProceNom',fld:'vTFPROCENOM',pic:''},{av:'AV29TFProceNom_Sel',fld:'vTFPROCENOM_SEL',pic:''},{av:'AV30TFProceNif',fld:'vTFPROCENIF',pic:''},{av:'AV31TFProceNif_Sel',fld:'vTFPROCENIF_SEL',pic:''},{av:'AV32TFProceDom',fld:'vTFPROCEDOM',pic:''},{av:'AV33TFProceDom_Sel',fld:'vTFPROCEDOM_SEL',pic:''},{av:'AV34TFProcePob',fld:'vTFPROCEPOB',pic:''},{av:'AV35TFProcePob_Sel',fld:'vTFPROCEPOB_SEL',pic:''},{av:'AV36TFPrvCod',fld:'vTFPRVCOD',pic:'ZZ9'},{av:'AV37TFPrvCod_To',fld:'vTFPRVCOD_TO',pic:'ZZ9'},{av:'AV38TFPrvDsc',fld:'vTFPRVDSC',pic:'@!'},{av:'AV39TFPrvDsc_Sel',fld:'vTFPRVDSC_SEL',pic:'@!'},{av:'AV40TFPoceCp',fld:'vTFPOCECP',pic:''},{av:'AV41TFPoceCp_Sel',fld:'vTFPOCECP_SEL',pic:''},{av:'AV59TFPoceCp2',fld:'vTFPOCECP2',pic:''},{av:'AV60TFPoceCp2_Sel',fld:'vTFPOCECP2_SEL',pic:''},{av:'AV42TFProceTel1',fld:'vTFPROCETEL1',pic:''},{av:'AV43TFProceTel1_Sel',fld:'vTFPROCETEL1_SEL',pic:''},{av:'AV44TFProceTel2',fld:'vTFPROCETEL2',pic:''},{av:'AV45TFProceTel2_Sel',fld:'vTFPROCETEL2_SEL',pic:''},{av:'AV46TFProceTelex',fld:'vTFPROCETELEX',pic:''},{av:'AV47TFProceTelex_Sel',fld:'vTFPROCETELEX_SEL',pic:''},{av:'AV48TFProPers',fld:'vTFPROPERS',pic:''},{av:'AV49TFProPers_Sel',fld:'vTFPROPERS_SEL',pic:''},{av:'AV50TFProEmail',fld:'vTFPROEMAIL',pic:''},{av:'AV51TFProEmail_Sel',fld:'vTFPROEMAIL_SEL',pic:''},{av:'AV96Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV66Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod',fld:'vALMACENSINDETALLE_LISTADODEPROCEDENCIASTEJIDO_WCDS_1_EMPRCOD',pic:'@!'},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV50TFProEmail',fld:'vTFPROEMAIL',pic:''},{av:'AV51TFProEmail_Sel',fld:'vTFPROEMAIL_SEL',pic:''},{av:'AV48TFProPers',fld:'vTFPROPERS',pic:''},{av:'AV49TFProPers_Sel',fld:'vTFPROPERS_SEL',pic:''},{av:'AV46TFProceTelex',fld:'vTFPROCETELEX',pic:''},{av:'AV47TFProceTelex_Sel',fld:'vTFPROCETELEX_SEL',pic:''},{av:'AV44TFProceTel2',fld:'vTFPROCETEL2',pic:''},{av:'AV45TFProceTel2_Sel',fld:'vTFPROCETEL2_SEL',pic:''},{av:'AV42TFProceTel1',fld:'vTFPROCETEL1',pic:''},{av:'AV43TFProceTel1_Sel',fld:'vTFPROCETEL1_SEL',pic:''},{av:'AV59TFPoceCp2',fld:'vTFPOCECP2',pic:''},{av:'AV60TFPoceCp2_Sel',fld:'vTFPOCECP2_SEL',pic:''},{av:'AV40TFPoceCp',fld:'vTFPOCECP',pic:''},{av:'AV41TFPoceCp_Sel',fld:'vTFPOCECP_SEL',pic:''},{av:'AV38TFPrvDsc',fld:'vTFPRVDSC',pic:'@!'},{av:'AV39TFPrvDsc_Sel',fld:'vTFPRVDSC_SEL',pic:'@!'},{av:'AV36TFPrvCod',fld:'vTFPRVCOD',pic:'ZZ9'},{av:'AV37TFPrvCod_To',fld:'vTFPRVCOD_TO',pic:'ZZ9'},{av:'AV34TFProcePob',fld:'vTFPROCEPOB',pic:''},{av:'AV35TFProcePob_Sel',fld:'vTFPROCEPOB_SEL',pic:''},{av:'AV32TFProceDom',fld:'vTFPROCEDOM',pic:''},{av:'AV33TFProceDom_Sel',fld:'vTFPROCEDOM_SEL',pic:''},{av:'AV30TFProceNif',fld:'vTFPROCENIF',pic:''},{av:'AV31TFProceNif_Sel',fld:'vTFPROCENIF_SEL',pic:''},{av:'AV28TFProceNom',fld:'vTFPROCENOM',pic:''},{av:'AV29TFProceNom_Sel',fld:'vTFPROCENOM_SEL',pic:''},{av:'AV26TFProceCod',fld:'vTFPROCECOD',pic:'ZZZ9'},{av:'AV27TFProceCod_To',fld:'vTFPROCECOD_TO',pic:'ZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e201OD2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e151OD2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV57Procecodfrom',fld:'vPROCECODFROM',pic:'ZZZ9'},{av:'AV58Procecodto',fld:'vPROCECODTO',pic:'ZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV56Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV26TFProceCod',fld:'vTFPROCECOD',pic:'ZZZ9'},{av:'AV27TFProceCod_To',fld:'vTFPROCECOD_TO',pic:'ZZZ9'},{av:'AV28TFProceNom',fld:'vTFPROCENOM',pic:''},{av:'AV29TFProceNom_Sel',fld:'vTFPROCENOM_SEL',pic:''},{av:'AV30TFProceNif',fld:'vTFPROCENIF',pic:''},{av:'AV31TFProceNif_Sel',fld:'vTFPROCENIF_SEL',pic:''},{av:'AV32TFProceDom',fld:'vTFPROCEDOM',pic:''},{av:'AV33TFProceDom_Sel',fld:'vTFPROCEDOM_SEL',pic:''},{av:'AV34TFProcePob',fld:'vTFPROCEPOB',pic:''},{av:'AV35TFProcePob_Sel',fld:'vTFPROCEPOB_SEL',pic:''},{av:'AV36TFPrvCod',fld:'vTFPRVCOD',pic:'ZZ9'},{av:'AV37TFPrvCod_To',fld:'vTFPRVCOD_TO',pic:'ZZ9'},{av:'AV38TFPrvDsc',fld:'vTFPRVDSC',pic:'@!'},{av:'AV39TFPrvDsc_Sel',fld:'vTFPRVDSC_SEL',pic:'@!'},{av:'AV40TFPoceCp',fld:'vTFPOCECP',pic:''},{av:'AV41TFPoceCp_Sel',fld:'vTFPOCECP_SEL',pic:''},{av:'AV59TFPoceCp2',fld:'vTFPOCECP2',pic:''},{av:'AV60TFPoceCp2_Sel',fld:'vTFPOCECP2_SEL',pic:''},{av:'AV42TFProceTel1',fld:'vTFPROCETEL1',pic:''},{av:'AV43TFProceTel1_Sel',fld:'vTFPROCETEL1_SEL',pic:''},{av:'AV44TFProceTel2',fld:'vTFPROCETEL2',pic:''},{av:'AV45TFProceTel2_Sel',fld:'vTFPROCETEL2_SEL',pic:''},{av:'AV46TFProceTelex',fld:'vTFPROCETELEX',pic:''},{av:'AV47TFProceTelex_Sel',fld:'vTFPROCETELEX_SEL',pic:''},{av:'AV48TFProPers',fld:'vTFPROPERS',pic:''},{av:'AV49TFProPers_Sel',fld:'vTFPROPERS_SEL',pic:''},{av:'AV50TFProEmail',fld:'vTFPROEMAIL',pic:''},{av:'AV51TFProEmail_Sel',fld:'vTFPROEMAIL_SEL',pic:''},{av:'AV96Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV66Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod',fld:'vALMACENSINDETALLE_LISTADODEPROCEDENCIASTEJIDO_WCDS_1_EMPRCOD',pic:'@!'},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtProceCod_Visible',ctrl:'PROCECOD',prop:'Visible'},{av:'edtProceNom_Visible',ctrl:'PROCENOM',prop:'Visible'},{av:'edtProceNif_Visible',ctrl:'PROCENIF',prop:'Visible'},{av:'edtProceDom_Visible',ctrl:'PROCEDOM',prop:'Visible'},{av:'edtProcePob_Visible',ctrl:'PROCEPOB',prop:'Visible'},{av:'edtPrvCod_Visible',ctrl:'PRVCOD',prop:'Visible'},{av:'edtPrvDsc_Visible',ctrl:'PRVDSC',prop:'Visible'},{av:'edtPoceCp_Visible',ctrl:'POCECP',prop:'Visible'},{av:'edtPoceCp2_Visible',ctrl:'POCECP2',prop:'Visible'},{av:'edtProceTel1_Visible',ctrl:'PROCETEL1',prop:'Visible'},{av:'edtProceTel2_Visible',ctrl:'PROCETEL2',prop:'Visible'},{av:'edtProceTelex_Visible',ctrl:'PROCETELEX',prop:'Visible'},{av:'edtProPers_Visible',ctrl:'PROPERS',prop:'Visible'},{av:'edtProEmail_Visible',ctrl:'PROEMAIL',prop:'Visible'},{av:'AV54GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV55GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e111OD2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV57Procecodfrom',fld:'vPROCECODFROM',pic:'ZZZ9'},{av:'AV58Procecodto',fld:'vPROCECODTO',pic:'ZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV56Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV26TFProceCod',fld:'vTFPROCECOD',pic:'ZZZ9'},{av:'AV27TFProceCod_To',fld:'vTFPROCECOD_TO',pic:'ZZZ9'},{av:'AV28TFProceNom',fld:'vTFPROCENOM',pic:''},{av:'AV29TFProceNom_Sel',fld:'vTFPROCENOM_SEL',pic:''},{av:'AV30TFProceNif',fld:'vTFPROCENIF',pic:''},{av:'AV31TFProceNif_Sel',fld:'vTFPROCENIF_SEL',pic:''},{av:'AV32TFProceDom',fld:'vTFPROCEDOM',pic:''},{av:'AV33TFProceDom_Sel',fld:'vTFPROCEDOM_SEL',pic:''},{av:'AV34TFProcePob',fld:'vTFPROCEPOB',pic:''},{av:'AV35TFProcePob_Sel',fld:'vTFPROCEPOB_SEL',pic:''},{av:'AV36TFPrvCod',fld:'vTFPRVCOD',pic:'ZZ9'},{av:'AV37TFPrvCod_To',fld:'vTFPRVCOD_TO',pic:'ZZ9'},{av:'AV38TFPrvDsc',fld:'vTFPRVDSC',pic:'@!'},{av:'AV39TFPrvDsc_Sel',fld:'vTFPRVDSC_SEL',pic:'@!'},{av:'AV40TFPoceCp',fld:'vTFPOCECP',pic:''},{av:'AV41TFPoceCp_Sel',fld:'vTFPOCECP_SEL',pic:''},{av:'AV59TFPoceCp2',fld:'vTFPOCECP2',pic:''},{av:'AV60TFPoceCp2_Sel',fld:'vTFPOCECP2_SEL',pic:''},{av:'AV42TFProceTel1',fld:'vTFPROCETEL1',pic:''},{av:'AV43TFProceTel1_Sel',fld:'vTFPROCETEL1_SEL',pic:''},{av:'AV44TFProceTel2',fld:'vTFPROCETEL2',pic:''},{av:'AV45TFProceTel2_Sel',fld:'vTFPROCETEL2_SEL',pic:''},{av:'AV46TFProceTelex',fld:'vTFPROCETELEX',pic:''},{av:'AV47TFProceTelex_Sel',fld:'vTFPROCETELEX_SEL',pic:''},{av:'AV48TFProPers',fld:'vTFPROPERS',pic:''},{av:'AV49TFProPers_Sel',fld:'vTFPROPERS_SEL',pic:''},{av:'AV50TFProEmail',fld:'vTFPROEMAIL',pic:''},{av:'AV51TFProEmail_Sel',fld:'vTFPROEMAIL_SEL',pic:''},{av:'AV96Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV66Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod',fld:'vALMACENSINDETALLE_LISTADODEPROCEDENCIASTEJIDO_WCDS_1_EMPRCOD',pic:'@!'},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFProceCod',fld:'vTFPROCECOD',pic:'ZZZ9'},{av:'AV27TFProceCod_To',fld:'vTFPROCECOD_TO',pic:'ZZZ9'},{av:'AV28TFProceNom',fld:'vTFPROCENOM',pic:''},{av:'AV29TFProceNom_Sel',fld:'vTFPROCENOM_SEL',pic:''},{av:'AV30TFProceNif',fld:'vTFPROCENIF',pic:''},{av:'AV31TFProceNif_Sel',fld:'vTFPROCENIF_SEL',pic:''},{av:'AV32TFProceDom',fld:'vTFPROCEDOM',pic:''},{av:'AV33TFProceDom_Sel',fld:'vTFPROCEDOM_SEL',pic:''},{av:'AV34TFProcePob',fld:'vTFPROCEPOB',pic:''},{av:'AV35TFProcePob_Sel',fld:'vTFPROCEPOB_SEL',pic:''},{av:'AV36TFPrvCod',fld:'vTFPRVCOD',pic:'ZZ9'},{av:'AV37TFPrvCod_To',fld:'vTFPRVCOD_TO',pic:'ZZ9'},{av:'AV38TFPrvDsc',fld:'vTFPRVDSC',pic:'@!'},{av:'AV39TFPrvDsc_Sel',fld:'vTFPRVDSC_SEL',pic:'@!'},{av:'AV40TFPoceCp',fld:'vTFPOCECP',pic:''},{av:'AV41TFPoceCp_Sel',fld:'vTFPOCECP_SEL',pic:''},{av:'AV59TFPoceCp2',fld:'vTFPOCECP2',pic:''},{av:'AV60TFPoceCp2_Sel',fld:'vTFPOCECP2_SEL',pic:''},{av:'AV42TFProceTel1',fld:'vTFPROCETEL1',pic:''},{av:'AV43TFProceTel1_Sel',fld:'vTFPROCETEL1_SEL',pic:''},{av:'AV44TFProceTel2',fld:'vTFPROCETEL2',pic:''},{av:'AV45TFProceTel2_Sel',fld:'vTFPROCETEL2_SEL',pic:''},{av:'AV46TFProceTelex',fld:'vTFPROCETELEX',pic:''},{av:'AV47TFProceTelex_Sel',fld:'vTFPROCETELEX_SEL',pic:''},{av:'AV48TFProPers',fld:'vTFPROPERS',pic:''},{av:'AV49TFProPers_Sel',fld:'vTFPROPERS_SEL',pic:''},{av:'AV50TFProEmail',fld:'vTFPROEMAIL',pic:''},{av:'AV51TFProEmail_Sel',fld:'vTFPROEMAIL_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtProceCod_Visible',ctrl:'PROCECOD',prop:'Visible'},{av:'edtProceNom_Visible',ctrl:'PROCENOM',prop:'Visible'},{av:'edtProceNif_Visible',ctrl:'PROCENIF',prop:'Visible'},{av:'edtProceDom_Visible',ctrl:'PROCEDOM',prop:'Visible'},{av:'edtProcePob_Visible',ctrl:'PROCEPOB',prop:'Visible'},{av:'edtPrvCod_Visible',ctrl:'PRVCOD',prop:'Visible'},{av:'edtPrvDsc_Visible',ctrl:'PRVDSC',prop:'Visible'},{av:'edtPoceCp_Visible',ctrl:'POCECP',prop:'Visible'},{av:'edtPoceCp2_Visible',ctrl:'POCECP2',prop:'Visible'},{av:'edtProceTel1_Visible',ctrl:'PROCETEL1',prop:'Visible'},{av:'edtProceTel2_Visible',ctrl:'PROCETEL2',prop:'Visible'},{av:'edtProceTelex_Visible',ctrl:'PROCETELEX',prop:'Visible'},{av:'edtProPers_Visible',ctrl:'PROPERS',prop:'Visible'},{av:'edtProEmail_Visible',ctrl:'PROEMAIL',prop:'Visible'},{av:'AV54GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV55GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e161OD2',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e171OD2',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_PROCECOD","{handler:'valid_Procecod',iparms:[]");
      setEventMetadata("VALID_PROCECOD",",oparms:[]}");
      setEventMetadata("VALID_PROCENOM","{handler:'valid_Procenom',iparms:[]");
      setEventMetadata("VALID_PROCENOM",",oparms:[]}");
      setEventMetadata("VALID_PRVCOD","{handler:'valid_Prvcod',iparms:[]");
      setEventMetadata("VALID_PRVCOD",",oparms:[]}");
      setEventMetadata("VALID_GPOECOCOD","{handler:'valid_Gpoecocod',iparms:[]");
      setEventMetadata("VALID_GPOECOCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Proemail',iparms:[]");
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
      AV56Emprcod = "" ;
      AV15FilterFullText = "" ;
      AV20ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV28TFProceNom = "" ;
      AV29TFProceNom_Sel = "" ;
      AV30TFProceNif = "" ;
      AV31TFProceNif_Sel = "" ;
      AV32TFProceDom = "" ;
      AV33TFProceDom_Sel = "" ;
      AV34TFProcePob = "" ;
      AV35TFProcePob_Sel = "" ;
      AV38TFPrvDsc = "" ;
      AV39TFPrvDsc_Sel = "" ;
      AV40TFPoceCp = "" ;
      AV41TFPoceCp_Sel = "" ;
      AV59TFPoceCp2 = "" ;
      AV60TFPoceCp2_Sel = "" ;
      AV42TFProceTel1 = "" ;
      AV43TFProceTel1_Sel = "" ;
      AV44TFProceTel2 = "" ;
      AV45TFProceTel2_Sel = "" ;
      AV46TFProceTelex = "" ;
      AV47TFProceTelex_Sel = "" ;
      AV48TFProPers = "" ;
      AV49TFProPers_Sel = "" ;
      AV50TFProEmail = "" ;
      AV51TFProEmail_Sel = "" ;
      AV96Pgmname = "" ;
      AV66Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV23ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV52DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
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
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      A396EmprCod = "" ;
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A971ProceNom = "" ;
      A993ProceNif = "" ;
      A994ProceDom = "" ;
      A988ProcePob = "" ;
      A787PrvDsc = "" ;
      A989PoceCp = "" ;
      A14029PoceCp2 = "" ;
      A990ProceTel1 = "" ;
      A991ProceTel2 = "" ;
      A992ProceTelex = "" ;
      A6187ProceIe = "" ;
      A13820ProceNomID = "" ;
      A10123GpoEcoNom = "" ;
      A10390ProPers = "" ;
      A10391ProEmail = "" ;
      scmdbuf = "" ;
      lV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = "" ;
      lV70Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom = "" ;
      lV72Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif = "" ;
      lV74Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom = "" ;
      lV76Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob = "" ;
      lV80Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc = "" ;
      lV82Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp = "" ;
      lV84Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 = "" ;
      lV86Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 = "" ;
      lV88Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 = "" ;
      lV90Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex = "" ;
      lV92Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers = "" ;
      lV94Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail = "" ;
      AV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = "" ;
      AV71Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel = "" ;
      AV70Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom = "" ;
      AV73Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel = "" ;
      AV72Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif = "" ;
      AV75Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel = "" ;
      AV74Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom = "" ;
      AV77Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel = "" ;
      AV76Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob = "" ;
      AV81Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel = "" ;
      AV80Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc = "" ;
      AV83Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel = "" ;
      AV82Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp = "" ;
      AV85Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel = "" ;
      AV84Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 = "" ;
      AV87Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel = "" ;
      AV86Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 = "" ;
      AV89Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel = "" ;
      AV88Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 = "" ;
      AV91Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel = "" ;
      AV90Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex = "" ;
      AV93Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel = "" ;
      AV92Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers = "" ;
      AV95Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel = "" ;
      AV94Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail = "" ;
      H01OD2_A396EmprCod = new String[] {""} ;
      H01OD2_A10391ProEmail = new String[] {""} ;
      H01OD2_n10391ProEmail = new boolean[] {false} ;
      H01OD2_A10390ProPers = new String[] {""} ;
      H01OD2_n10390ProPers = new boolean[] {false} ;
      H01OD2_A10123GpoEcoNom = new String[] {""} ;
      H01OD2_n10123GpoEcoNom = new boolean[] {false} ;
      H01OD2_A10122GpoEcoCod = new int[1] ;
      H01OD2_n10122GpoEcoCod = new boolean[] {false} ;
      H01OD2_A6187ProceIe = new String[] {""} ;
      H01OD2_n6187ProceIe = new boolean[] {false} ;
      H01OD2_A992ProceTelex = new String[] {""} ;
      H01OD2_n992ProceTelex = new boolean[] {false} ;
      H01OD2_A991ProceTel2 = new String[] {""} ;
      H01OD2_n991ProceTel2 = new boolean[] {false} ;
      H01OD2_A990ProceTel1 = new String[] {""} ;
      H01OD2_n990ProceTel1 = new boolean[] {false} ;
      H01OD2_A14029PoceCp2 = new String[] {""} ;
      H01OD2_n14029PoceCp2 = new boolean[] {false} ;
      H01OD2_A989PoceCp = new String[] {""} ;
      H01OD2_n989PoceCp = new boolean[] {false} ;
      H01OD2_A787PrvDsc = new String[] {""} ;
      H01OD2_n787PrvDsc = new boolean[] {false} ;
      H01OD2_A781PrvCod = new short[1] ;
      H01OD2_n781PrvCod = new boolean[] {false} ;
      H01OD2_A988ProcePob = new String[] {""} ;
      H01OD2_n988ProcePob = new boolean[] {false} ;
      H01OD2_A994ProceDom = new String[] {""} ;
      H01OD2_n994ProceDom = new boolean[] {false} ;
      H01OD2_A993ProceNif = new String[] {""} ;
      H01OD2_n993ProceNif = new boolean[] {false} ;
      H01OD2_A971ProceNom = new String[] {""} ;
      H01OD2_n971ProceNom = new boolean[] {false} ;
      H01OD2_A970ProceCod = new short[1] ;
      H01OD3_AGRID_nRecordCount = new long[1] ;
      AV63Station = "" ;
      AV64Emprnom = "" ;
      AV65Usurcod = "" ;
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
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState32 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      AV9TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV56Emprcod = "" ;
      sCtrlAV57Procecodfrom = "" ;
      sCtrlAV58Procecodto = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.almacensindetalle.listadodeprocedenciastejido_wc__default(),
         new Object[] {
             new Object[] {
            H01OD2_A396EmprCod, H01OD2_A10391ProEmail, H01OD2_n10391ProEmail, H01OD2_A10390ProPers, H01OD2_n10390ProPers, H01OD2_A10123GpoEcoNom, H01OD2_n10123GpoEcoNom, H01OD2_A10122GpoEcoCod, H01OD2_n10122GpoEcoCod, H01OD2_A6187ProceIe,
            H01OD2_n6187ProceIe, H01OD2_A992ProceTelex, H01OD2_n992ProceTelex, H01OD2_A991ProceTel2, H01OD2_n991ProceTel2, H01OD2_A990ProceTel1, H01OD2_n990ProceTel1, H01OD2_A14029PoceCp2, H01OD2_n14029PoceCp2, H01OD2_A989PoceCp,
            H01OD2_n989PoceCp, H01OD2_A787PrvDsc, H01OD2_n787PrvDsc, H01OD2_A781PrvCod, H01OD2_n781PrvCod, H01OD2_A988ProcePob, H01OD2_n988ProcePob, H01OD2_A994ProceDom, H01OD2_n994ProceDom, H01OD2_A993ProceNif,
            H01OD2_n993ProceNif, H01OD2_A971ProceNom, H01OD2_n971ProceNom, H01OD2_A970ProceCod
            }
            , new Object[] {
            H01OD3_AGRID_nRecordCount
            }
         }
      );
      AV96Pgmname = "AlmacenSinDetalle.ListadodeProcedenciasTejido_WC" ;
      /* GeneXus formulas. */
      AV96Pgmname = "AlmacenSinDetalle.ListadodeProcedenciasTejido_WC" ;
      Gx_err = (short)(0) ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV25ManageFiltersExecutionStep ;
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
   private short wcpOAV57Procecodfrom ;
   private short wcpOAV58Procecodto ;
   private short AV57Procecodfrom ;
   private short AV58Procecodto ;
   private short AV26TFProceCod ;
   private short AV27TFProceCod_To ;
   private short AV36TFPrvCod ;
   private short AV37TFPrvCod_To ;
   private short AV12OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short A970ProceCod ;
   private short A781PrvCod ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV68Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod ;
   private short AV69Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to ;
   private short AV78Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod ;
   private short AV79Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_41 ;
   private int nGXsfl_41_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtEmprCod_Visible ;
   private int A10122GpoEcoCod ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int edtProceCod_Visible ;
   private int edtProceNom_Visible ;
   private int edtProceNif_Visible ;
   private int edtProceDom_Visible ;
   private int edtProcePob_Visible ;
   private int edtPrvCod_Visible ;
   private int edtPrvDsc_Visible ;
   private int edtPoceCp_Visible ;
   private int edtPoceCp2_Visible ;
   private int edtProceTel1_Visible ;
   private int edtProceTel2_Visible ;
   private int edtProceTelex_Visible ;
   private int edtProPers_Visible ;
   private int edtProEmail_Visible ;
   private int AV53PageToGo ;
   private int AV97GXV1 ;
   private int edtavFilterfulltext_Enabled ;
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
   private String wcpOAV56Emprcod ;
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
   private String AV56Emprcod ;
   private String sGXsfl_41_idx="0001" ;
   private String AV28TFProceNom ;
   private String AV29TFProceNom_Sel ;
   private String AV30TFProceNif ;
   private String AV31TFProceNif_Sel ;
   private String AV32TFProceDom ;
   private String AV33TFProceDom_Sel ;
   private String AV34TFProcePob ;
   private String AV35TFProcePob_Sel ;
   private String AV38TFPrvDsc ;
   private String AV39TFPrvDsc_Sel ;
   private String AV40TFPoceCp ;
   private String AV41TFPoceCp_Sel ;
   private String AV59TFPoceCp2 ;
   private String AV60TFPoceCp2_Sel ;
   private String AV42TFProceTel1 ;
   private String AV43TFProceTel1_Sel ;
   private String AV44TFProceTel2 ;
   private String AV45TFProceTel2_Sel ;
   private String AV46TFProceTelex ;
   private String AV47TFProceTelex_Sel ;
   private String AV48TFProPers ;
   private String AV49TFProPers_Sel ;
   private String AV50TFProEmail ;
   private String AV51TFProEmail_Sel ;
   private String AV96Pgmname ;
   private String AV66Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod ;
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
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String edtEmprCod_Internalname ;
   private String A396EmprCod ;
   private String edtEmprCod_Jsonclick ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavFilterfulltext_Internalname ;
   private String edtProceCod_Internalname ;
   private String A971ProceNom ;
   private String edtProceNom_Internalname ;
   private String A993ProceNif ;
   private String edtProceNif_Internalname ;
   private String A994ProceDom ;
   private String edtProceDom_Internalname ;
   private String A988ProcePob ;
   private String edtProcePob_Internalname ;
   private String edtPrvCod_Internalname ;
   private String A787PrvDsc ;
   private String edtPrvDsc_Internalname ;
   private String A989PoceCp ;
   private String edtPoceCp_Internalname ;
   private String A14029PoceCp2 ;
   private String edtPoceCp2_Internalname ;
   private String A990ProceTel1 ;
   private String edtProceTel1_Internalname ;
   private String A991ProceTel2 ;
   private String edtProceTel2_Internalname ;
   private String A992ProceTelex ;
   private String edtProceTelex_Internalname ;
   private String A6187ProceIe ;
   private String edtProceIe_Internalname ;
   private String edtGpoEcoCod_Internalname ;
   private String edtProceNomID_Internalname ;
   private String edtGpoEcoNom_Internalname ;
   private String A10390ProPers ;
   private String edtProPers_Internalname ;
   private String A10391ProEmail ;
   private String edtProEmail_Internalname ;
   private String scmdbuf ;
   private String lV70Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom ;
   private String lV72Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif ;
   private String lV74Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom ;
   private String lV76Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob ;
   private String lV80Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc ;
   private String lV82Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp ;
   private String lV84Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 ;
   private String lV86Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 ;
   private String lV88Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 ;
   private String lV90Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex ;
   private String lV92Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers ;
   private String lV94Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail ;
   private String AV71Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel ;
   private String AV70Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom ;
   private String AV73Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel ;
   private String AV72Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif ;
   private String AV75Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel ;
   private String AV74Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom ;
   private String AV77Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel ;
   private String AV76Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob ;
   private String AV81Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel ;
   private String AV80Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc ;
   private String AV83Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel ;
   private String AV82Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp ;
   private String AV85Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel ;
   private String AV84Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 ;
   private String AV87Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel ;
   private String AV86Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 ;
   private String AV89Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel ;
   private String AV88Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 ;
   private String AV91Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel ;
   private String AV90Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex ;
   private String AV93Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel ;
   private String AV92Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers ;
   private String AV95Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel ;
   private String AV94Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail ;
   private String AV63Station ;
   private String AV64Emprnom ;
   private String AV65Usurcod ;
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
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV56Emprcod ;
   private String sCtrlAV57Procecodfrom ;
   private String sCtrlAV58Procecodto ;
   private String sGXsfl_41_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtProceCod_Jsonclick ;
   private String edtProceNom_Jsonclick ;
   private String edtProceNif_Jsonclick ;
   private String edtProceDom_Jsonclick ;
   private String edtProcePob_Jsonclick ;
   private String edtPrvCod_Jsonclick ;
   private String edtPrvDsc_Jsonclick ;
   private String edtPoceCp_Jsonclick ;
   private String edtPoceCp2_Jsonclick ;
   private String edtProceTel1_Jsonclick ;
   private String edtProceTel2_Jsonclick ;
   private String edtProceTelex_Jsonclick ;
   private String edtProceIe_Jsonclick ;
   private String edtGpoEcoCod_Jsonclick ;
   private String edtProceNomID_Jsonclick ;
   private String edtGpoEcoNom_Jsonclick ;
   private String edtProPers_Jsonclick ;
   private String edtProEmail_Jsonclick ;
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
   private boolean n971ProceNom ;
   private boolean n993ProceNif ;
   private boolean n994ProceDom ;
   private boolean n988ProcePob ;
   private boolean n781PrvCod ;
   private boolean n787PrvDsc ;
   private boolean n989PoceCp ;
   private boolean n14029PoceCp2 ;
   private boolean n990ProceTel1 ;
   private boolean n991ProceTel2 ;
   private boolean n992ProceTelex ;
   private boolean n6187ProceIe ;
   private boolean n10122GpoEcoCod ;
   private boolean n10123GpoEcoNom ;
   private boolean n10390ProPers ;
   private boolean n10391ProEmail ;
   private boolean bGXsfl_41_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV18ColumnsSelectorXML ;
   private String AV24ManageFiltersXml ;
   private String AV19UserCustomValue ;
   private String AV15FilterFullText ;
   private String A13820ProceNomID ;
   private String A10123GpoEcoNom ;
   private String lV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext ;
   private String AV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext ;
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
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private IDataStoreProvider pr_default ;
   private String[] H01OD2_A396EmprCod ;
   private String[] H01OD2_A10391ProEmail ;
   private boolean[] H01OD2_n10391ProEmail ;
   private String[] H01OD2_A10390ProPers ;
   private boolean[] H01OD2_n10390ProPers ;
   private String[] H01OD2_A10123GpoEcoNom ;
   private boolean[] H01OD2_n10123GpoEcoNom ;
   private int[] H01OD2_A10122GpoEcoCod ;
   private boolean[] H01OD2_n10122GpoEcoCod ;
   private String[] H01OD2_A6187ProceIe ;
   private boolean[] H01OD2_n6187ProceIe ;
   private String[] H01OD2_A992ProceTelex ;
   private boolean[] H01OD2_n992ProceTelex ;
   private String[] H01OD2_A991ProceTel2 ;
   private boolean[] H01OD2_n991ProceTel2 ;
   private String[] H01OD2_A990ProceTel1 ;
   private boolean[] H01OD2_n990ProceTel1 ;
   private String[] H01OD2_A14029PoceCp2 ;
   private boolean[] H01OD2_n14029PoceCp2 ;
   private String[] H01OD2_A989PoceCp ;
   private boolean[] H01OD2_n989PoceCp ;
   private String[] H01OD2_A787PrvDsc ;
   private boolean[] H01OD2_n787PrvDsc ;
   private short[] H01OD2_A781PrvCod ;
   private boolean[] H01OD2_n781PrvCod ;
   private String[] H01OD2_A988ProcePob ;
   private boolean[] H01OD2_n988ProcePob ;
   private String[] H01OD2_A994ProceDom ;
   private boolean[] H01OD2_n994ProceDom ;
   private String[] H01OD2_A993ProceNif ;
   private boolean[] H01OD2_n993ProceNif ;
   private String[] H01OD2_A971ProceNom ;
   private boolean[] H01OD2_n971ProceNom ;
   private short[] H01OD2_A970ProceCod ;
   private long[] H01OD3_AGRID_nRecordCount ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV23ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV9TrnContextAtt ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState32[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV21ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV52DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class listadodeprocedenciastejido_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01OD2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext ,
                                          short AV68Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod ,
                                          short AV69Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to ,
                                          String AV71Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel ,
                                          String AV70Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom ,
                                          String AV73Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel ,
                                          String AV72Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif ,
                                          String AV75Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel ,
                                          String AV74Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom ,
                                          String AV77Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel ,
                                          String AV76Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob ,
                                          short AV78Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod ,
                                          short AV79Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to ,
                                          String AV81Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel ,
                                          String AV80Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc ,
                                          String AV83Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel ,
                                          String AV82Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp ,
                                          String AV85Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel ,
                                          String AV84Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 ,
                                          String AV87Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel ,
                                          String AV86Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 ,
                                          String AV89Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel ,
                                          String AV88Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 ,
                                          String AV91Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel ,
                                          String AV90Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex ,
                                          String AV93Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel ,
                                          String AV92Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers ,
                                          String AV95Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel ,
                                          String AV94Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail ,
                                          short AV57Procecodfrom ,
                                          short AV58Procecodto ,
                                          short A970ProceCod ,
                                          String A971ProceNom ,
                                          String A993ProceNif ,
                                          String A994ProceDom ,
                                          String A988ProcePob ,
                                          short A781PrvCod ,
                                          String A787PrvDsc ,
                                          String A989PoceCp ,
                                          String A14029PoceCp2 ,
                                          String A990ProceTel1 ,
                                          String A991ProceTel2 ,
                                          String A992ProceTelex ,
                                          String A10390ProPers ,
                                          String A10391ProEmail ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV66Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int33 = new byte[50];
      Object[] GXv_Object34 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.EmprCod, T1.ProEmail, T1.ProPers, T2.GpoEcoNom, T1.GpoEcoCod, T1.ProceIe, T1.ProceTelex, T1.ProceTel2, T1.ProceTel1, T1.PoceCp2, T1.PoceCp, T3.PrvDsc, T1.PrvCod," ;
      sSelectString += " T1.ProcePob, T1.ProceDom, T1.ProceNif, T1.ProceNom, T1.ProceCod" ;
      sFromString = " FROM ((TXPPROCED T1 LEFT JOIN TXPGPOECO T2 ON T2.EmprCod = T1.EmprCod AND T2.GpoEcoCod = T1.GpoEcoCod) LEFT JOIN TXPPROVIN T3 ON T3.PrvCod = T1.PrvCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.ProceCod,'9990'), 2) like '%' || ?) or ( UPPER(T1.ProceNom) like '%' || UPPER(?)) or ( UPPER(T1.ProceNif) like '%' || UPPER(?)) or ( UPPER(T1.ProceDom) like '%' || UPPER(?)) or ( UPPER(T1.ProcePob) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvCod,'990'), 2) like '%' || ?) or ( UPPER(T3.PrvDsc) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp2) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel1) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel2) like '%' || UPPER(?)) or ( UPPER(T1.ProceTelex) like '%' || UPPER(?)) or ( UPPER(T1.ProPers) like '%' || UPPER(?)) or ( UPPER(T1.ProEmail) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int33[1] = (byte)(1) ;
         GXv_int33[2] = (byte)(1) ;
         GXv_int33[3] = (byte)(1) ;
         GXv_int33[4] = (byte)(1) ;
         GXv_int33[5] = (byte)(1) ;
         GXv_int33[6] = (byte)(1) ;
         GXv_int33[7] = (byte)(1) ;
         GXv_int33[8] = (byte)(1) ;
         GXv_int33[9] = (byte)(1) ;
         GXv_int33[10] = (byte)(1) ;
         GXv_int33[11] = (byte)(1) ;
         GXv_int33[12] = (byte)(1) ;
         GXv_int33[13] = (byte)(1) ;
         GXv_int33[14] = (byte)(1) ;
      }
      if ( ! (0==AV68Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int33[15] = (byte)(1) ;
      }
      if ( ! (0==AV69Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int33[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV70Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNom = ?)");
      }
      else
      {
         GXv_int33[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel)==0) && ( ! (GXutil.strcmp("", AV72Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNif = ?)");
      }
      else
      {
         GXv_int33[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel)==0) && ( ! (GXutil.strcmp("", AV74Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceDom = ?)");
      }
      else
      {
         GXv_int33[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel)==0) && ( ! (GXutil.strcmp("", AV76Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProcePob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProcePob = ?)");
      }
      else
      {
         GXv_int33[24] = (byte)(1) ;
      }
      if ( ! (0==AV78Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod) )
      {
         addWhere(sWhereString, "(T1.PrvCod >= ?)");
      }
      else
      {
         GXv_int33[25] = (byte)(1) ;
      }
      if ( ! (0==AV79Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to) )
      {
         addWhere(sWhereString, "(T1.PrvCod <= ?)");
      }
      else
      {
         GXv_int33[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel)==0) && ( ! (GXutil.strcmp("", AV80Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PrvDsc = ?)");
      }
      else
      {
         GXv_int33[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel)==0) && ( ! (GXutil.strcmp("", AV82Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp = ?)");
      }
      else
      {
         GXv_int33[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel)==0) && ( ! (GXutil.strcmp("", AV84Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp2 = ?)");
      }
      else
      {
         GXv_int33[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel)==0) && ( ! (GXutil.strcmp("", AV86Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel1) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel1 = ?)");
      }
      else
      {
         GXv_int33[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel)==0) && ( ! (GXutil.strcmp("", AV88Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel2 = ?)");
      }
      else
      {
         GXv_int33[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel)==0) && ( ! (GXutil.strcmp("", AV90Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTelex) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTelex = ?)");
      }
      else
      {
         GXv_int33[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel)==0) && ( ! (GXutil.strcmp("", AV92Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProPers) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProPers = ?)");
      }
      else
      {
         GXv_int33[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel)==0) && ( ! (GXutil.strcmp("", AV94Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProEmail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProEmail = ?)");
      }
      else
      {
         GXv_int33[42] = (byte)(1) ;
      }
      if ( ! (0==AV57Procecodfrom) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int33[43] = (byte)(1) ;
      }
      if ( ! (0==AV58Procecodto) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int33[44] = (byte)(1) ;
      }
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.ProceNom" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.ProceNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.ProceCod" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.ProceCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.ProceNif" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.ProceNif DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.ProceDom" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.ProceDom DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.ProcePob" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.ProcePob DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.PrvCod" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.PrvCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T3.PrvDsc" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T3.PrvDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.PoceCp" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.PoceCp DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.PoceCp2" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.PoceCp2 DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.ProceTel1" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.ProceTel1 DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.ProceTel2" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.ProceTel2 DESC" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.ProceTelex" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.ProceTelex DESC" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.ProPers" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.ProPers DESC" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.ProEmail" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.ProEmail DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.ProceCod" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object34[0] = scmdbuf ;
      GXv_Object34[1] = GXv_int33 ;
      return GXv_Object34 ;
   }

   protected Object[] conditional_H01OD3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext ,
                                          short AV68Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod ,
                                          short AV69Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to ,
                                          String AV71Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel ,
                                          String AV70Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom ,
                                          String AV73Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel ,
                                          String AV72Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif ,
                                          String AV75Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel ,
                                          String AV74Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom ,
                                          String AV77Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel ,
                                          String AV76Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob ,
                                          short AV78Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod ,
                                          short AV79Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to ,
                                          String AV81Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel ,
                                          String AV80Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc ,
                                          String AV83Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel ,
                                          String AV82Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp ,
                                          String AV85Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel ,
                                          String AV84Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 ,
                                          String AV87Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel ,
                                          String AV86Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 ,
                                          String AV89Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel ,
                                          String AV88Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 ,
                                          String AV91Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel ,
                                          String AV90Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex ,
                                          String AV93Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel ,
                                          String AV92Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers ,
                                          String AV95Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel ,
                                          String AV94Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail ,
                                          short AV57Procecodfrom ,
                                          short AV58Procecodto ,
                                          short A970ProceCod ,
                                          String A971ProceNom ,
                                          String A993ProceNif ,
                                          String A994ProceDom ,
                                          String A988ProcePob ,
                                          short A781PrvCod ,
                                          String A787PrvDsc ,
                                          String A989PoceCp ,
                                          String A14029PoceCp2 ,
                                          String A990ProceTel1 ,
                                          String A991ProceTel2 ,
                                          String A992ProceTelex ,
                                          String A10390ProPers ,
                                          String A10391ProEmail ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV66Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int35 = new byte[45];
      Object[] GXv_Object36 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM ((TXPPROCED T1 LEFT JOIN TXPGPOECO T2 ON T2.EmprCod = T1.EmprCod AND T2.GpoEcoCod = T1.GpoEcoCod) LEFT JOIN TXPPROVIN T3 ON T3.PrvCod = T1.PrvCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV67Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.ProceCod,'9990'), 2) like '%' || ?) or ( UPPER(T1.ProceNom) like '%' || UPPER(?)) or ( UPPER(T1.ProceNif) like '%' || UPPER(?)) or ( UPPER(T1.ProceDom) like '%' || UPPER(?)) or ( UPPER(T1.ProcePob) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvCod,'990'), 2) like '%' || ?) or ( UPPER(T3.PrvDsc) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp2) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel1) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel2) like '%' || UPPER(?)) or ( UPPER(T1.ProceTelex) like '%' || UPPER(?)) or ( UPPER(T1.ProPers) like '%' || UPPER(?)) or ( UPPER(T1.ProEmail) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int35[1] = (byte)(1) ;
         GXv_int35[2] = (byte)(1) ;
         GXv_int35[3] = (byte)(1) ;
         GXv_int35[4] = (byte)(1) ;
         GXv_int35[5] = (byte)(1) ;
         GXv_int35[6] = (byte)(1) ;
         GXv_int35[7] = (byte)(1) ;
         GXv_int35[8] = (byte)(1) ;
         GXv_int35[9] = (byte)(1) ;
         GXv_int35[10] = (byte)(1) ;
         GXv_int35[11] = (byte)(1) ;
         GXv_int35[12] = (byte)(1) ;
         GXv_int35[13] = (byte)(1) ;
         GXv_int35[14] = (byte)(1) ;
      }
      if ( ! (0==AV68Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int35[15] = (byte)(1) ;
      }
      if ( ! (0==AV69Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int35[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV70Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNom = ?)");
      }
      else
      {
         GXv_int35[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel)==0) && ( ! (GXutil.strcmp("", AV72Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNif = ?)");
      }
      else
      {
         GXv_int35[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel)==0) && ( ! (GXutil.strcmp("", AV74Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceDom = ?)");
      }
      else
      {
         GXv_int35[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel)==0) && ( ! (GXutil.strcmp("", AV76Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProcePob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProcePob = ?)");
      }
      else
      {
         GXv_int35[24] = (byte)(1) ;
      }
      if ( ! (0==AV78Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod) )
      {
         addWhere(sWhereString, "(T1.PrvCod >= ?)");
      }
      else
      {
         GXv_int35[25] = (byte)(1) ;
      }
      if ( ! (0==AV79Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to) )
      {
         addWhere(sWhereString, "(T1.PrvCod <= ?)");
      }
      else
      {
         GXv_int35[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel)==0) && ( ! (GXutil.strcmp("", AV80Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PrvDsc = ?)");
      }
      else
      {
         GXv_int35[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel)==0) && ( ! (GXutil.strcmp("", AV82Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp = ?)");
      }
      else
      {
         GXv_int35[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel)==0) && ( ! (GXutil.strcmp("", AV84Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp2 = ?)");
      }
      else
      {
         GXv_int35[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel)==0) && ( ! (GXutil.strcmp("", AV86Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel1) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel1 = ?)");
      }
      else
      {
         GXv_int35[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel)==0) && ( ! (GXutil.strcmp("", AV88Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel2 = ?)");
      }
      else
      {
         GXv_int35[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel)==0) && ( ! (GXutil.strcmp("", AV90Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTelex) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTelex = ?)");
      }
      else
      {
         GXv_int35[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel)==0) && ( ! (GXutil.strcmp("", AV92Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProPers) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProPers = ?)");
      }
      else
      {
         GXv_int35[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel)==0) && ( ! (GXutil.strcmp("", AV94Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProEmail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProEmail = ?)");
      }
      else
      {
         GXv_int35[42] = (byte)(1) ;
      }
      if ( ! (0==AV57Procecodfrom) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int35[43] = (byte)(1) ;
      }
      if ( ! (0==AV58Procecodto) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int35[44] = (byte)(1) ;
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
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object36[0] = scmdbuf ;
      GXv_Object36[1] = GXv_int35 ;
      return GXv_Object36 ;
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
                  return conditional_H01OD2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , ((Boolean) dynConstraints[46]).booleanValue() , (String)dynConstraints[47] , (String)dynConstraints[48] );
            case 1 :
                  return conditional_H01OD3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , ((Boolean) dynConstraints[46]).booleanValue() , (String)dynConstraints[47] , (String)dynConstraints[48] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01OD2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01OD3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 40);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 14);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 6);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 6);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 34);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 20);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((short[]) buf[33])[0] = rslt.getShort(18);
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
                  stmt.setString(sIdx, (String)parms[50], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 20);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 20);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 34);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 34);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[75]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 6);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 6);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 6);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 6);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 9);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 9);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 9);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 9);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 14);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 14);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 40);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 40);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 40);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 40);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[93]).shortValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[94]).shortValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[96]).intValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[97]).intValue());
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[98]).intValue());
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[99]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[60]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 20);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 20);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 34);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 34);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[70]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[71]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 6);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 6);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 6);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 6);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 9);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 9);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 9);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 9);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 14);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 14);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 40);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 40);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 40);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 40);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[88]).shortValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[89]).shortValue());
               }
               return;
      }
   }

}

