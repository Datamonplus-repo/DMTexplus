package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcpartesproduccion_impl extends GXWebComponent
{
   public wcpartesproduccion_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wcpartesproduccion_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcpartesproduccion_impl.class ));
   }

   public wcpartesproduccion_impl( int remoteHandle ,
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
               AV90EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90EmprCod", AV90EmprCod);
               AV91MaqCod = httpContext.GetPar( "MaqCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91MaqCod", AV91MaqCod);
               AV92Hisprofec = localUtil.parseDateParm( httpContext.GetPar( "Hisprofec")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92Hisprofec", localUtil.format(AV92Hisprofec, "99/99/99"));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV90EmprCod,AV91MaqCod,AV92Hisprofec});
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
      nRC_GXsfl_30 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_30"))) ;
      nGXsfl_30_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_30_idx"))) ;
      sGXsfl_30_idx = httpContext.GetPar( "sGXsfl_30_idx") ;
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
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV19ColumnsSelector);
      AV90EmprCod = httpContext.GetPar( "EmprCod") ;
      AV91MaqCod = httpContext.GetPar( "MaqCod") ;
      AV92Hisprofec = localUtil.parseDateParm( httpContext.GetPar( "Hisprofec")) ;
      AV26TFMaqCod = httpContext.GetPar( "TFMaqCod") ;
      AV27TFMaqCod_Sel = httpContext.GetPar( "TFMaqCod_Sel") ;
      AV42TFMaqDsc = httpContext.GetPar( "TFMaqDsc") ;
      AV43TFMaqDsc_Sel = httpContext.GetPar( "TFMaqDsc_Sel") ;
      AV29TFHisProFec = localUtil.parseDateParm( httpContext.GetPar( "TFHisProFec")) ;
      AV34TFHisProLin = (int)(GXutil.lval( httpContext.GetPar( "TFHisProLin"))) ;
      AV35TFHisProLin_To = (int)(GXutil.lval( httpContext.GetPar( "TFHisProLin_To"))) ;
      AV45TFBarNHdr = httpContext.GetPar( "TFBarNHdr") ;
      AV46TFBarNHdr_Sel = httpContext.GetPar( "TFBarNHdr_Sel") ;
      AV48TFGruOpeCod = (int)(GXutil.lval( httpContext.GetPar( "TFGruOpeCod"))) ;
      AV49TFGruOpeCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFGruOpeCod_To"))) ;
      AV51TFBarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "TFBarOrdLin"))) ;
      AV52TFBarOrdLin_To = (short)(GXutil.lval( httpContext.GetPar( "TFBarOrdLin_To"))) ;
      AV54TFFase = httpContext.GetPar( "TFFase") ;
      AV55TFFase_Sel = httpContext.GetPar( "TFFase_Sel") ;
      AV60TFHisProDTI = localUtil.parseDTimeParm( httpContext.GetPar( "TFHisProDTI")) ;
      AV65TFHisProDTF = localUtil.parseDTimeParm( httpContext.GetPar( "TFHisProDTF")) ;
      AV70TFHisProF = httpContext.GetPar( "TFHisProF") ;
      AV71TFHisProF_Sel = httpContext.GetPar( "TFHisProF_Sel") ;
      AV73TFHisProTur = (byte)(GXutil.lval( httpContext.GetPar( "TFHisProTur"))) ;
      AV74TFHisProTur_To = (byte)(GXutil.lval( httpContext.GetPar( "TFHisProTur_To"))) ;
      AV76TFHisProKgr = CommonUtil.decimalVal( httpContext.GetPar( "TFHisProKgr"), ".") ;
      AV77TFHisProKgr_To = CommonUtil.decimalVal( httpContext.GetPar( "TFHisProKgr_To"), ".") ;
      AV79TFHisProMtr = CommonUtil.decimalVal( httpContext.GetPar( "TFHisProMtr"), ".") ;
      AV80TFHisProMtr_To = CommonUtil.decimalVal( httpContext.GetPar( "TFHisProMtr_To"), ".") ;
      AV82TFHisProNpzs = (short)(GXutil.lval( httpContext.GetPar( "TFHisProNpzs"))) ;
      AV83TFHisProNpzs_To = (short)(GXutil.lval( httpContext.GetPar( "TFHisProNpzs_To"))) ;
      AV85TFParCod = (short)(GXutil.lval( httpContext.GetPar( "TFParCod"))) ;
      AV86TFParCod_To = (short)(GXutil.lval( httpContext.GetPar( "TFParCod_To"))) ;
      AV88TFParCodNom = httpContext.GetPar( "TFParCodNom") ;
      AV89TFParCodNom_Sel = httpContext.GetPar( "TFParCodNom_Sel") ;
      AV133Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV99Wcpartesproduccionds_1_emprcod = httpContext.GetPar( "Wcpartesproduccionds_1_emprcod") ;
      AV100Wcpartesproduccionds_2_maqcod = httpContext.GetPar( "Wcpartesproduccionds_2_maqcod") ;
      AV101Wcpartesproduccionds_3_hisprofec = localUtil.parseDateParm( httpContext.GetPar( "Wcpartesproduccionds_3_hisprofec")) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV19ColumnsSelector, AV90EmprCod, AV91MaqCod, AV92Hisprofec, AV26TFMaqCod, AV27TFMaqCod_Sel, AV42TFMaqDsc, AV43TFMaqDsc_Sel, AV29TFHisProFec, AV34TFHisProLin, AV35TFHisProLin_To, AV45TFBarNHdr, AV46TFBarNHdr_Sel, AV48TFGruOpeCod, AV49TFGruOpeCod_To, AV51TFBarOrdLin, AV52TFBarOrdLin_To, AV54TFFase, AV55TFFase_Sel, AV60TFHisProDTI, AV65TFHisProDTF, AV70TFHisProF, AV71TFHisProF_Sel, AV73TFHisProTur, AV74TFHisProTur_To, AV76TFHisProKgr, AV77TFHisProKgr_To, AV79TFHisProMtr, AV80TFHisProMtr_To, AV82TFHisProNpzs, AV83TFHisProNpzs_To, AV85TFParCod, AV86TFParCod_To, AV88TFParCodNom, AV89TFParCodNom_Sel, AV133Pgmname, AV12OrderedBy, AV13OrderedDsc, AV99Wcpartesproduccionds_1_emprcod, AV100Wcpartesproduccionds_2_maqcod, AV101Wcpartesproduccionds_3_hisprofec, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         paHO2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( " PARTES PRODUCCION", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wcpartesproduccion", new String[] {GXutil.URLEncode(GXutil.rtrim(AV90EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV91MaqCod)),GXutil.URLEncode(GXutil.formatDateParm(AV92Hisprofec))}, new String[] {"EmprCod","MaqCod","Hisprofec"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV133Pgmname, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_30", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_30, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV39GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV40GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV37DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV37DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV19ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV19ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV90EmprCod", GXutil.rtrim( wcpOAV90EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV91MaqCod", GXutil.rtrim( wcpOAV91MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV92Hisprofec", localUtil.dtoc( wcpOAV92Hisprofec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV90EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCOD", GXutil.rtrim( AV91MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISPROFEC", localUtil.dtoc( AV92Hisprofec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMAQCOD", GXutil.rtrim( AV26TFMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMAQCOD_SEL", GXutil.rtrim( AV27TFMaqCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMAQDSC", GXutil.rtrim( AV42TFMaqDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMAQDSC_SEL", GXutil.rtrim( AV43TFMaqDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROFEC", localUtil.dtoc( AV29TFHisProFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROLIN", GXutil.ltrim( localUtil.ntoc( AV34TFHisProLin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROLIN_TO", GXutil.ltrim( localUtil.ntoc( AV35TFHisProLin_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNHDR", GXutil.rtrim( AV45TFBarNHdr));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNHDR_SEL", GXutil.rtrim( AV46TFBarNHdr_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFGRUOPECOD", GXutil.ltrim( localUtil.ntoc( AV48TFGruOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFGRUOPECOD_TO", GXutil.ltrim( localUtil.ntoc( AV49TFGruOpeCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARORDLIN", GXutil.ltrim( localUtil.ntoc( AV51TFBarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARORDLIN_TO", GXutil.ltrim( localUtil.ntoc( AV52TFBarOrdLin_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASE", GXutil.rtrim( AV54TFFase));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASE_SEL", GXutil.rtrim( AV55TFFase_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPRODTI", localUtil.ttoc( AV60TFHisProDTI, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPRODTF", localUtil.ttoc( AV65TFHisProDTF, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROF", GXutil.rtrim( AV70TFHisProF));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROF_SEL", GXutil.rtrim( AV71TFHisProF_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROTUR", GXutil.ltrim( localUtil.ntoc( AV73TFHisProTur, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROTUR_TO", GXutil.ltrim( localUtil.ntoc( AV74TFHisProTur_To, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROKGR", GXutil.ltrim( localUtil.ntoc( AV76TFHisProKgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROKGR_TO", GXutil.ltrim( localUtil.ntoc( AV77TFHisProKgr_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROMTR", GXutil.ltrim( localUtil.ntoc( AV79TFHisProMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROMTR_TO", GXutil.ltrim( localUtil.ntoc( AV80TFHisProMtr_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPRONPZS", GXutil.ltrim( localUtil.ntoc( AV82TFHisProNpzs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPRONPZS_TO", GXutil.ltrim( localUtil.ntoc( AV83TFHisProNpzs_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPARCOD", GXutil.ltrim( localUtil.ntoc( AV85TFParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPARCOD_TO", GXutil.ltrim( localUtil.ntoc( AV86TFParCod_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPARCODNOM", GXutil.rtrim( AV88TFParCodNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPARCODNOM_SEL", GXutil.rtrim( AV89TFParCodNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV133Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV133Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vWCPARTESPRODUCCIONDS_1_EMPRCOD", GXutil.rtrim( AV99Wcpartesproduccionds_1_emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vWCPARTESPRODUCCIONDS_2_MAQCOD", GXutil.rtrim( AV100Wcpartesproduccionds_2_maqcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vWCPARTESPRODUCCIONDS_3_HISPROFEC", localUtil.dtoc( AV101Wcpartesproduccionds_3_hisprofec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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

   public void renderHtmlCloseFormHO2( )
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
      return "WCPartesProduccion" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " PARTES PRODUCCION", "") ;
   }

   public void wbHO0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.wcpartesproduccion");
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
         app.GxWebStd.gx_div_start( httpContext, divLayoutmaintable_Internalname, 1, 0, "px", 0, "px", "Table TableWithSelectableGrid", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 30, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCPartesProduccion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 30, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCPartesProduccion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 30, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCPartesProduccion.htm");
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
         startgridcontrol30( ) ;
      }
      if ( wbEnd == 30 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_30 = (int)(nGXsfl_30_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV39GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV40GridPageCount);
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV37DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, 0, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WCPartesProduccion.htm");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV37DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV19ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_hisprofecauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'" + sPrefix + "',false,'" + sGXsfl_30_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_hisprofecauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_hisprofecauxdate_Internalname, localUtil.format(AV31DDO_HisProFecAuxDate, "99/99/99"), localUtil.format( AV31DDO_HisProFecAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,62);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_hisprofecauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WCPartesProduccion.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_hisprofecauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WCPartesProduccion.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_hisprodtiauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'" + sPrefix + "',false,'" + sGXsfl_30_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_hisprodtiauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_hisprodtiauxdate_Internalname, localUtil.format(AV62DDO_HisProDTIAuxDate, "99/99/99"), localUtil.format( AV62DDO_HisProDTIAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,64);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_hisprodtiauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WCPartesProduccion.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_hisprodtiauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WCPartesProduccion.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_hisprodtfauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'" + sPrefix + "',false,'" + sGXsfl_30_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_hisprodtfauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_hisprodtfauxdate_Internalname, localUtil.format(AV67DDO_HisProDTFAuxDate, "99/99/99"), localUtil.format( AV67DDO_HisProDTFAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,66);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_hisprodtfauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WCPartesProduccion.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_hisprodtfauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WCPartesProduccion.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 30 )
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

   public void startHO2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( " PARTES PRODUCCION", ""), (short)(0)) ;
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
            strupHO0( ) ;
         }
      }
   }

   public void wsHO2( )
   {
      startHO2( ) ;
      evtHO2( ) ;
   }

   public void evtHO2( )
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
                              strupHO0( ) ;
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
                              strupHO0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e11HO2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupHO0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e12HO2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupHO0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e13HO2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupHO0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e14HO2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupHO0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e15HO2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupHO0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e16HO2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupHO0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavDdo_hisprofecauxdate_Internalname ;
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
                              strupHO0( ) ;
                           }
                           nGXsfl_30_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_30_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_30_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_302( ) ;
                           A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
                           A606MaqDsc = httpContext.cgiGet( edtMaqDsc_Internalname) ;
                           n606MaqDsc = false ;
                           A558HisProFec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtHisProFec_Internalname), 0)) ;
                           A561HisProLin = (int)(localUtil.ctol( httpContext.cgiGet( edtHisProLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
                           A503GruOpeCod = (int)(localUtil.ctol( httpContext.cgiGet( edtGruOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A461Fase = httpContext.cgiGet( edtFase_Internalname) ;
                           A4440HisProDTI = localUtil.ctot( httpContext.cgiGet( edtHisProDTI_Internalname), 0) ;
                           A4441HisProDTF = localUtil.ctot( httpContext.cgiGet( edtHisProDTF_Internalname), 0) ;
                           A557HisProF = GXutil.upper( httpContext.cgiGet( edtHisProF_Internalname)) ;
                           A566HisProTur = (byte)(localUtil.ctol( httpContext.cgiGet( edtHisProTur_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1525HisProKgr = localUtil.ctond( httpContext.cgiGet( edtHisProKgr_Internalname)) ;
                           A1526HisProMtr = localUtil.ctond( httpContext.cgiGet( edtHisProMtr_Internalname)) ;
                           A4714HisProNpzs = (short)(localUtil.ctol( httpContext.cgiGet( edtHisProNpzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A656ParCod = (short)(localUtil.ctol( httpContext.cgiGet( edtParCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A867ParCodNom = httpContext.cgiGet( edtParCodNom_Internalname) ;
                           A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
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
                                       GX_FocusControl = edtavDdo_hisprofecauxdate_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e17HO2 ();
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
                                       GX_FocusControl = edtavDdo_hisprofecauxdate_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e18HO2 ();
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
                                       GX_FocusControl = edtavDdo_hisprofecauxdate_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e19HO2 ();
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
                                    strupHO0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavDdo_hisprofecauxdate_Internalname ;
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

   public void weHO2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseFormHO2( ) ;
         }
      }
   }

   public void paHO2( )
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
            GX_FocusControl = edtavDdo_hisprofecauxdate_Internalname ;
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
      subsflControlProps_302( ) ;
      while ( nGXsfl_30_idx <= nRC_GXsfl_30 )
      {
         sendrow_302( ) ;
         nGXsfl_30_idx = ((subGrid_Islastpage==1)&&(nGXsfl_30_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_30_idx+1) ;
         sGXsfl_30_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_30_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_302( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV19ColumnsSelector ,
                                 String AV90EmprCod ,
                                 String AV91MaqCod ,
                                 java.util.Date AV92Hisprofec ,
                                 String AV26TFMaqCod ,
                                 String AV27TFMaqCod_Sel ,
                                 String AV42TFMaqDsc ,
                                 String AV43TFMaqDsc_Sel ,
                                 java.util.Date AV29TFHisProFec ,
                                 int AV34TFHisProLin ,
                                 int AV35TFHisProLin_To ,
                                 String AV45TFBarNHdr ,
                                 String AV46TFBarNHdr_Sel ,
                                 int AV48TFGruOpeCod ,
                                 int AV49TFGruOpeCod_To ,
                                 short AV51TFBarOrdLin ,
                                 short AV52TFBarOrdLin_To ,
                                 String AV54TFFase ,
                                 String AV55TFFase_Sel ,
                                 java.util.Date AV60TFHisProDTI ,
                                 java.util.Date AV65TFHisProDTF ,
                                 String AV70TFHisProF ,
                                 String AV71TFHisProF_Sel ,
                                 byte AV73TFHisProTur ,
                                 byte AV74TFHisProTur_To ,
                                 java.math.BigDecimal AV76TFHisProKgr ,
                                 java.math.BigDecimal AV77TFHisProKgr_To ,
                                 java.math.BigDecimal AV79TFHisProMtr ,
                                 java.math.BigDecimal AV80TFHisProMtr_To ,
                                 short AV82TFHisProNpzs ,
                                 short AV83TFHisProNpzs_To ,
                                 short AV85TFParCod ,
                                 short AV86TFParCod_To ,
                                 String AV88TFParCodNom ,
                                 String AV89TFParCodNom_Sel ,
                                 String AV133Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 String AV99Wcpartesproduccionds_1_emprcod ,
                                 String AV100Wcpartesproduccionds_2_maqcod ,
                                 java.util.Date AV101Wcpartesproduccionds_3_hisprofec ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e18HO2 ();
      GRID_nCurrentRecord = 0 ;
      rfHO2( ) ;
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
      rfHO2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV133Pgmname = "WCPartesProduccion" ;
      Gx_err = (short)(0) ;
   }

   public void rfHO2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(30) ;
      /* Execute user event: Refresh */
      e18HO2 ();
      nGXsfl_30_idx = 1 ;
      sGXsfl_30_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_30_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_302( ) ;
      bGXsfl_30_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
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
         subsflControlProps_302( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV103Wcpartesproduccionds_5_tfmaqcod_sel ,
                                              AV102Wcpartesproduccionds_4_tfmaqcod ,
                                              AV105Wcpartesproduccionds_7_tfmaqdsc_sel ,
                                              AV104Wcpartesproduccionds_6_tfmaqdsc ,
                                              AV106Wcpartesproduccionds_8_tfhisprofec ,
                                              Integer.valueOf(AV107Wcpartesproduccionds_9_tfhisprolin) ,
                                              Integer.valueOf(AV108Wcpartesproduccionds_10_tfhisprolin_to) ,
                                              AV110Wcpartesproduccionds_12_tfbarnhdr_sel ,
                                              AV109Wcpartesproduccionds_11_tfbarnhdr ,
                                              Integer.valueOf(AV111Wcpartesproduccionds_13_tfgruopecod) ,
                                              Integer.valueOf(AV112Wcpartesproduccionds_14_tfgruopecod_to) ,
                                              Short.valueOf(AV113Wcpartesproduccionds_15_tfbarordlin) ,
                                              Short.valueOf(AV114Wcpartesproduccionds_16_tfbarordlin_to) ,
                                              AV116Wcpartesproduccionds_18_tffase_sel ,
                                              AV115Wcpartesproduccionds_17_tffase ,
                                              AV117Wcpartesproduccionds_19_tfhisprodti ,
                                              AV118Wcpartesproduccionds_20_tfhisprodtf ,
                                              AV120Wcpartesproduccionds_22_tfhisprof_sel ,
                                              AV119Wcpartesproduccionds_21_tfhisprof ,
                                              Byte.valueOf(AV121Wcpartesproduccionds_23_tfhisprotur) ,
                                              Byte.valueOf(AV122Wcpartesproduccionds_24_tfhisprotur_to) ,
                                              AV123Wcpartesproduccionds_25_tfhisprokgr ,
                                              AV124Wcpartesproduccionds_26_tfhisprokgr_to ,
                                              AV125Wcpartesproduccionds_27_tfhispromtr ,
                                              AV126Wcpartesproduccionds_28_tfhispromtr_to ,
                                              Short.valueOf(AV127Wcpartesproduccionds_29_tfhispronpzs) ,
                                              Short.valueOf(AV128Wcpartesproduccionds_30_tfhispronpzs_to) ,
                                              Short.valueOf(AV129Wcpartesproduccionds_31_tfparcod) ,
                                              Short.valueOf(AV130Wcpartesproduccionds_32_tfparcod_to) ,
                                              AV132Wcpartesproduccionds_34_tfparcodnom_sel ,
                                              AV131Wcpartesproduccionds_33_tfparcodnom ,
                                              A602MaqCod ,
                                              A606MaqDsc ,
                                              A558HisProFec ,
                                              Integer.valueOf(A561HisProLin) ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar ,
                                              Integer.valueOf(A503GruOpeCod) ,
                                              Short.valueOf(A194BarOrdLin) ,
                                              A461Fase ,
                                              A4440HisProDTI ,
                                              A4441HisProDTF ,
                                              A557HisProF ,
                                              Byte.valueOf(A566HisProTur) ,
                                              A1525HisProKgr ,
                                              A1526HisProMtr ,
                                              Short.valueOf(A4714HisProNpzs) ,
                                              Short.valueOf(A656ParCod) ,
                                              A867ParCodNom ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV99Wcpartesproduccionds_1_emprcod ,
                                              AV100Wcpartesproduccionds_2_maqcod ,
                                              AV101Wcpartesproduccionds_3_hisprofec ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                              TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT,
                                              TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING
                                              }
         });
         lV102Wcpartesproduccionds_4_tfmaqcod = GXutil.padr( GXutil.rtrim( AV102Wcpartesproduccionds_4_tfmaqcod), 6, "%") ;
         lV104Wcpartesproduccionds_6_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV104Wcpartesproduccionds_6_tfmaqdsc), 16, "%") ;
         /* Using cursor H00HO2 */
         pr_default.execute(0, new Object[] {AV99Wcpartesproduccionds_1_emprcod, AV100Wcpartesproduccionds_2_maqcod, AV101Wcpartesproduccionds_3_hisprofec, lV102Wcpartesproduccionds_4_tfmaqcod, AV103Wcpartesproduccionds_5_tfmaqcod_sel, lV104Wcpartesproduccionds_6_tfmaqdsc, AV105Wcpartesproduccionds_7_tfmaqdsc_sel, AV106Wcpartesproduccionds_8_tfhisprofec, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_30_idx = 1 ;
         sGXsfl_30_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_30_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_302( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H00HO2_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
            A558HisProFec = H00HO2_A558HisProFec[0] ;
            A606MaqDsc = H00HO2_A606MaqDsc[0] ;
            n606MaqDsc = H00HO2_n606MaqDsc[0] ;
            A602MaqCod = H00HO2_A602MaqCod[0] ;
            A606MaqDsc = H00HO2_A606MaqDsc[0] ;
            n606MaqDsc = H00HO2_n606MaqDsc[0] ;
            e19HO2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(30) ;
         wbHO0( ) ;
      }
      bGXsfl_30_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesHO2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV133Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV133Pgmname, ""))));
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
      AV99Wcpartesproduccionds_1_emprcod = AV90EmprCod ;
      AV100Wcpartesproduccionds_2_maqcod = AV91MaqCod ;
      AV101Wcpartesproduccionds_3_hisprofec = AV92Hisprofec ;
      AV102Wcpartesproduccionds_4_tfmaqcod = AV26TFMaqCod ;
      AV103Wcpartesproduccionds_5_tfmaqcod_sel = AV27TFMaqCod_Sel ;
      AV104Wcpartesproduccionds_6_tfmaqdsc = AV42TFMaqDsc ;
      AV105Wcpartesproduccionds_7_tfmaqdsc_sel = AV43TFMaqDsc_Sel ;
      AV106Wcpartesproduccionds_8_tfhisprofec = AV29TFHisProFec ;
      AV107Wcpartesproduccionds_9_tfhisprolin = AV34TFHisProLin ;
      AV108Wcpartesproduccionds_10_tfhisprolin_to = AV35TFHisProLin_To ;
      AV109Wcpartesproduccionds_11_tfbarnhdr = AV45TFBarNHdr ;
      AV110Wcpartesproduccionds_12_tfbarnhdr_sel = AV46TFBarNHdr_Sel ;
      AV111Wcpartesproduccionds_13_tfgruopecod = AV48TFGruOpeCod ;
      AV112Wcpartesproduccionds_14_tfgruopecod_to = AV49TFGruOpeCod_To ;
      AV113Wcpartesproduccionds_15_tfbarordlin = AV51TFBarOrdLin ;
      AV114Wcpartesproduccionds_16_tfbarordlin_to = AV52TFBarOrdLin_To ;
      AV115Wcpartesproduccionds_17_tffase = AV54TFFase ;
      AV116Wcpartesproduccionds_18_tffase_sel = AV55TFFase_Sel ;
      AV117Wcpartesproduccionds_19_tfhisprodti = AV60TFHisProDTI ;
      AV118Wcpartesproduccionds_20_tfhisprodtf = AV65TFHisProDTF ;
      AV119Wcpartesproduccionds_21_tfhisprof = AV70TFHisProF ;
      AV120Wcpartesproduccionds_22_tfhisprof_sel = AV71TFHisProF_Sel ;
      AV121Wcpartesproduccionds_23_tfhisprotur = AV73TFHisProTur ;
      AV122Wcpartesproduccionds_24_tfhisprotur_to = AV74TFHisProTur_To ;
      AV123Wcpartesproduccionds_25_tfhisprokgr = AV76TFHisProKgr ;
      AV124Wcpartesproduccionds_26_tfhisprokgr_to = AV77TFHisProKgr_To ;
      AV125Wcpartesproduccionds_27_tfhispromtr = AV79TFHisProMtr ;
      AV126Wcpartesproduccionds_28_tfhispromtr_to = AV80TFHisProMtr_To ;
      AV127Wcpartesproduccionds_29_tfhispronpzs = AV82TFHisProNpzs ;
      AV128Wcpartesproduccionds_30_tfhispronpzs_to = AV83TFHisProNpzs_To ;
      AV129Wcpartesproduccionds_31_tfparcod = AV85TFParCod ;
      AV130Wcpartesproduccionds_32_tfparcod_to = AV86TFParCod_To ;
      AV131Wcpartesproduccionds_33_tfparcodnom = AV88TFParCodNom ;
      AV132Wcpartesproduccionds_34_tfparcodnom_sel = AV89TFParCodNom_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV103Wcpartesproduccionds_5_tfmaqcod_sel ,
                                           AV102Wcpartesproduccionds_4_tfmaqcod ,
                                           AV105Wcpartesproduccionds_7_tfmaqdsc_sel ,
                                           AV104Wcpartesproduccionds_6_tfmaqdsc ,
                                           AV106Wcpartesproduccionds_8_tfhisprofec ,
                                           Integer.valueOf(AV107Wcpartesproduccionds_9_tfhisprolin) ,
                                           Integer.valueOf(AV108Wcpartesproduccionds_10_tfhisprolin_to) ,
                                           AV110Wcpartesproduccionds_12_tfbarnhdr_sel ,
                                           AV109Wcpartesproduccionds_11_tfbarnhdr ,
                                           Integer.valueOf(AV111Wcpartesproduccionds_13_tfgruopecod) ,
                                           Integer.valueOf(AV112Wcpartesproduccionds_14_tfgruopecod_to) ,
                                           Short.valueOf(AV113Wcpartesproduccionds_15_tfbarordlin) ,
                                           Short.valueOf(AV114Wcpartesproduccionds_16_tfbarordlin_to) ,
                                           AV116Wcpartesproduccionds_18_tffase_sel ,
                                           AV115Wcpartesproduccionds_17_tffase ,
                                           AV117Wcpartesproduccionds_19_tfhisprodti ,
                                           AV118Wcpartesproduccionds_20_tfhisprodtf ,
                                           AV120Wcpartesproduccionds_22_tfhisprof_sel ,
                                           AV119Wcpartesproduccionds_21_tfhisprof ,
                                           Byte.valueOf(AV121Wcpartesproduccionds_23_tfhisprotur) ,
                                           Byte.valueOf(AV122Wcpartesproduccionds_24_tfhisprotur_to) ,
                                           AV123Wcpartesproduccionds_25_tfhisprokgr ,
                                           AV124Wcpartesproduccionds_26_tfhisprokgr_to ,
                                           AV125Wcpartesproduccionds_27_tfhispromtr ,
                                           AV126Wcpartesproduccionds_28_tfhispromtr_to ,
                                           Short.valueOf(AV127Wcpartesproduccionds_29_tfhispronpzs) ,
                                           Short.valueOf(AV128Wcpartesproduccionds_30_tfhispronpzs_to) ,
                                           Short.valueOf(AV129Wcpartesproduccionds_31_tfparcod) ,
                                           Short.valueOf(AV130Wcpartesproduccionds_32_tfparcod_to) ,
                                           AV132Wcpartesproduccionds_34_tfparcodnom_sel ,
                                           AV131Wcpartesproduccionds_33_tfparcodnom ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           A558HisProFec ,
                                           Integer.valueOf(A561HisProLin) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A461Fase ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF ,
                                           A557HisProF ,
                                           Byte.valueOf(A566HisProTur) ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Short.valueOf(A4714HisProNpzs) ,
                                           Short.valueOf(A656ParCod) ,
                                           A867ParCodNom ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV99Wcpartesproduccionds_1_emprcod ,
                                           AV100Wcpartesproduccionds_2_maqcod ,
                                           AV101Wcpartesproduccionds_3_hisprofec ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING
                                           }
      });
      lV102Wcpartesproduccionds_4_tfmaqcod = GXutil.padr( GXutil.rtrim( AV102Wcpartesproduccionds_4_tfmaqcod), 6, "%") ;
      lV104Wcpartesproduccionds_6_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV104Wcpartesproduccionds_6_tfmaqdsc), 16, "%") ;
      /* Using cursor H00HO3 */
      pr_default.execute(1, new Object[] {AV99Wcpartesproduccionds_1_emprcod, AV100Wcpartesproduccionds_2_maqcod, AV101Wcpartesproduccionds_3_hisprofec, lV102Wcpartesproduccionds_4_tfmaqcod, AV103Wcpartesproduccionds_5_tfmaqcod_sel, lV104Wcpartesproduccionds_6_tfmaqdsc, AV105Wcpartesproduccionds_7_tfmaqdsc_sel, AV106Wcpartesproduccionds_8_tfhisprofec});
      GRID_nRecordCount = H00HO3_AGRID_nRecordCount[0] ;
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
      AV99Wcpartesproduccionds_1_emprcod = AV90EmprCod ;
      AV100Wcpartesproduccionds_2_maqcod = AV91MaqCod ;
      AV101Wcpartesproduccionds_3_hisprofec = AV92Hisprofec ;
      AV102Wcpartesproduccionds_4_tfmaqcod = AV26TFMaqCod ;
      AV103Wcpartesproduccionds_5_tfmaqcod_sel = AV27TFMaqCod_Sel ;
      AV104Wcpartesproduccionds_6_tfmaqdsc = AV42TFMaqDsc ;
      AV105Wcpartesproduccionds_7_tfmaqdsc_sel = AV43TFMaqDsc_Sel ;
      AV106Wcpartesproduccionds_8_tfhisprofec = AV29TFHisProFec ;
      AV107Wcpartesproduccionds_9_tfhisprolin = AV34TFHisProLin ;
      AV108Wcpartesproduccionds_10_tfhisprolin_to = AV35TFHisProLin_To ;
      AV109Wcpartesproduccionds_11_tfbarnhdr = AV45TFBarNHdr ;
      AV110Wcpartesproduccionds_12_tfbarnhdr_sel = AV46TFBarNHdr_Sel ;
      AV111Wcpartesproduccionds_13_tfgruopecod = AV48TFGruOpeCod ;
      AV112Wcpartesproduccionds_14_tfgruopecod_to = AV49TFGruOpeCod_To ;
      AV113Wcpartesproduccionds_15_tfbarordlin = AV51TFBarOrdLin ;
      AV114Wcpartesproduccionds_16_tfbarordlin_to = AV52TFBarOrdLin_To ;
      AV115Wcpartesproduccionds_17_tffase = AV54TFFase ;
      AV116Wcpartesproduccionds_18_tffase_sel = AV55TFFase_Sel ;
      AV117Wcpartesproduccionds_19_tfhisprodti = AV60TFHisProDTI ;
      AV118Wcpartesproduccionds_20_tfhisprodtf = AV65TFHisProDTF ;
      AV119Wcpartesproduccionds_21_tfhisprof = AV70TFHisProF ;
      AV120Wcpartesproduccionds_22_tfhisprof_sel = AV71TFHisProF_Sel ;
      AV121Wcpartesproduccionds_23_tfhisprotur = AV73TFHisProTur ;
      AV122Wcpartesproduccionds_24_tfhisprotur_to = AV74TFHisProTur_To ;
      AV123Wcpartesproduccionds_25_tfhisprokgr = AV76TFHisProKgr ;
      AV124Wcpartesproduccionds_26_tfhisprokgr_to = AV77TFHisProKgr_To ;
      AV125Wcpartesproduccionds_27_tfhispromtr = AV79TFHisProMtr ;
      AV126Wcpartesproduccionds_28_tfhispromtr_to = AV80TFHisProMtr_To ;
      AV127Wcpartesproduccionds_29_tfhispronpzs = AV82TFHisProNpzs ;
      AV128Wcpartesproduccionds_30_tfhispronpzs_to = AV83TFHisProNpzs_To ;
      AV129Wcpartesproduccionds_31_tfparcod = AV85TFParCod ;
      AV130Wcpartesproduccionds_32_tfparcod_to = AV86TFParCod_To ;
      AV131Wcpartesproduccionds_33_tfparcodnom = AV88TFParCodNom ;
      AV132Wcpartesproduccionds_34_tfparcodnom_sel = AV89TFParCodNom_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV19ColumnsSelector, AV90EmprCod, AV91MaqCod, AV92Hisprofec, AV26TFMaqCod, AV27TFMaqCod_Sel, AV42TFMaqDsc, AV43TFMaqDsc_Sel, AV29TFHisProFec, AV34TFHisProLin, AV35TFHisProLin_To, AV45TFBarNHdr, AV46TFBarNHdr_Sel, AV48TFGruOpeCod, AV49TFGruOpeCod_To, AV51TFBarOrdLin, AV52TFBarOrdLin_To, AV54TFFase, AV55TFFase_Sel, AV60TFHisProDTI, AV65TFHisProDTF, AV70TFHisProF, AV71TFHisProF_Sel, AV73TFHisProTur, AV74TFHisProTur_To, AV76TFHisProKgr, AV77TFHisProKgr_To, AV79TFHisProMtr, AV80TFHisProMtr_To, AV82TFHisProNpzs, AV83TFHisProNpzs_To, AV85TFParCod, AV86TFParCod_To, AV88TFParCodNom, AV89TFParCodNom_Sel, AV133Pgmname, AV12OrderedBy, AV13OrderedDsc, AV99Wcpartesproduccionds_1_emprcod, AV100Wcpartesproduccionds_2_maqcod, AV101Wcpartesproduccionds_3_hisprofec, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV99Wcpartesproduccionds_1_emprcod = AV90EmprCod ;
      AV100Wcpartesproduccionds_2_maqcod = AV91MaqCod ;
      AV101Wcpartesproduccionds_3_hisprofec = AV92Hisprofec ;
      AV102Wcpartesproduccionds_4_tfmaqcod = AV26TFMaqCod ;
      AV103Wcpartesproduccionds_5_tfmaqcod_sel = AV27TFMaqCod_Sel ;
      AV104Wcpartesproduccionds_6_tfmaqdsc = AV42TFMaqDsc ;
      AV105Wcpartesproduccionds_7_tfmaqdsc_sel = AV43TFMaqDsc_Sel ;
      AV106Wcpartesproduccionds_8_tfhisprofec = AV29TFHisProFec ;
      AV107Wcpartesproduccionds_9_tfhisprolin = AV34TFHisProLin ;
      AV108Wcpartesproduccionds_10_tfhisprolin_to = AV35TFHisProLin_To ;
      AV109Wcpartesproduccionds_11_tfbarnhdr = AV45TFBarNHdr ;
      AV110Wcpartesproduccionds_12_tfbarnhdr_sel = AV46TFBarNHdr_Sel ;
      AV111Wcpartesproduccionds_13_tfgruopecod = AV48TFGruOpeCod ;
      AV112Wcpartesproduccionds_14_tfgruopecod_to = AV49TFGruOpeCod_To ;
      AV113Wcpartesproduccionds_15_tfbarordlin = AV51TFBarOrdLin ;
      AV114Wcpartesproduccionds_16_tfbarordlin_to = AV52TFBarOrdLin_To ;
      AV115Wcpartesproduccionds_17_tffase = AV54TFFase ;
      AV116Wcpartesproduccionds_18_tffase_sel = AV55TFFase_Sel ;
      AV117Wcpartesproduccionds_19_tfhisprodti = AV60TFHisProDTI ;
      AV118Wcpartesproduccionds_20_tfhisprodtf = AV65TFHisProDTF ;
      AV119Wcpartesproduccionds_21_tfhisprof = AV70TFHisProF ;
      AV120Wcpartesproduccionds_22_tfhisprof_sel = AV71TFHisProF_Sel ;
      AV121Wcpartesproduccionds_23_tfhisprotur = AV73TFHisProTur ;
      AV122Wcpartesproduccionds_24_tfhisprotur_to = AV74TFHisProTur_To ;
      AV123Wcpartesproduccionds_25_tfhisprokgr = AV76TFHisProKgr ;
      AV124Wcpartesproduccionds_26_tfhisprokgr_to = AV77TFHisProKgr_To ;
      AV125Wcpartesproduccionds_27_tfhispromtr = AV79TFHisProMtr ;
      AV126Wcpartesproduccionds_28_tfhispromtr_to = AV80TFHisProMtr_To ;
      AV127Wcpartesproduccionds_29_tfhispronpzs = AV82TFHisProNpzs ;
      AV128Wcpartesproduccionds_30_tfhispronpzs_to = AV83TFHisProNpzs_To ;
      AV129Wcpartesproduccionds_31_tfparcod = AV85TFParCod ;
      AV130Wcpartesproduccionds_32_tfparcod_to = AV86TFParCod_To ;
      AV131Wcpartesproduccionds_33_tfparcodnom = AV88TFParCodNom ;
      AV132Wcpartesproduccionds_34_tfparcodnom_sel = AV89TFParCodNom_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV19ColumnsSelector, AV90EmprCod, AV91MaqCod, AV92Hisprofec, AV26TFMaqCod, AV27TFMaqCod_Sel, AV42TFMaqDsc, AV43TFMaqDsc_Sel, AV29TFHisProFec, AV34TFHisProLin, AV35TFHisProLin_To, AV45TFBarNHdr, AV46TFBarNHdr_Sel, AV48TFGruOpeCod, AV49TFGruOpeCod_To, AV51TFBarOrdLin, AV52TFBarOrdLin_To, AV54TFFase, AV55TFFase_Sel, AV60TFHisProDTI, AV65TFHisProDTF, AV70TFHisProF, AV71TFHisProF_Sel, AV73TFHisProTur, AV74TFHisProTur_To, AV76TFHisProKgr, AV77TFHisProKgr_To, AV79TFHisProMtr, AV80TFHisProMtr_To, AV82TFHisProNpzs, AV83TFHisProNpzs_To, AV85TFParCod, AV86TFParCod_To, AV88TFParCodNom, AV89TFParCodNom_Sel, AV133Pgmname, AV12OrderedBy, AV13OrderedDsc, AV99Wcpartesproduccionds_1_emprcod, AV100Wcpartesproduccionds_2_maqcod, AV101Wcpartesproduccionds_3_hisprofec, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV99Wcpartesproduccionds_1_emprcod = AV90EmprCod ;
      AV100Wcpartesproduccionds_2_maqcod = AV91MaqCod ;
      AV101Wcpartesproduccionds_3_hisprofec = AV92Hisprofec ;
      AV102Wcpartesproduccionds_4_tfmaqcod = AV26TFMaqCod ;
      AV103Wcpartesproduccionds_5_tfmaqcod_sel = AV27TFMaqCod_Sel ;
      AV104Wcpartesproduccionds_6_tfmaqdsc = AV42TFMaqDsc ;
      AV105Wcpartesproduccionds_7_tfmaqdsc_sel = AV43TFMaqDsc_Sel ;
      AV106Wcpartesproduccionds_8_tfhisprofec = AV29TFHisProFec ;
      AV107Wcpartesproduccionds_9_tfhisprolin = AV34TFHisProLin ;
      AV108Wcpartesproduccionds_10_tfhisprolin_to = AV35TFHisProLin_To ;
      AV109Wcpartesproduccionds_11_tfbarnhdr = AV45TFBarNHdr ;
      AV110Wcpartesproduccionds_12_tfbarnhdr_sel = AV46TFBarNHdr_Sel ;
      AV111Wcpartesproduccionds_13_tfgruopecod = AV48TFGruOpeCod ;
      AV112Wcpartesproduccionds_14_tfgruopecod_to = AV49TFGruOpeCod_To ;
      AV113Wcpartesproduccionds_15_tfbarordlin = AV51TFBarOrdLin ;
      AV114Wcpartesproduccionds_16_tfbarordlin_to = AV52TFBarOrdLin_To ;
      AV115Wcpartesproduccionds_17_tffase = AV54TFFase ;
      AV116Wcpartesproduccionds_18_tffase_sel = AV55TFFase_Sel ;
      AV117Wcpartesproduccionds_19_tfhisprodti = AV60TFHisProDTI ;
      AV118Wcpartesproduccionds_20_tfhisprodtf = AV65TFHisProDTF ;
      AV119Wcpartesproduccionds_21_tfhisprof = AV70TFHisProF ;
      AV120Wcpartesproduccionds_22_tfhisprof_sel = AV71TFHisProF_Sel ;
      AV121Wcpartesproduccionds_23_tfhisprotur = AV73TFHisProTur ;
      AV122Wcpartesproduccionds_24_tfhisprotur_to = AV74TFHisProTur_To ;
      AV123Wcpartesproduccionds_25_tfhisprokgr = AV76TFHisProKgr ;
      AV124Wcpartesproduccionds_26_tfhisprokgr_to = AV77TFHisProKgr_To ;
      AV125Wcpartesproduccionds_27_tfhispromtr = AV79TFHisProMtr ;
      AV126Wcpartesproduccionds_28_tfhispromtr_to = AV80TFHisProMtr_To ;
      AV127Wcpartesproduccionds_29_tfhispronpzs = AV82TFHisProNpzs ;
      AV128Wcpartesproduccionds_30_tfhispronpzs_to = AV83TFHisProNpzs_To ;
      AV129Wcpartesproduccionds_31_tfparcod = AV85TFParCod ;
      AV130Wcpartesproduccionds_32_tfparcod_to = AV86TFParCod_To ;
      AV131Wcpartesproduccionds_33_tfparcodnom = AV88TFParCodNom ;
      AV132Wcpartesproduccionds_34_tfparcodnom_sel = AV89TFParCodNom_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV19ColumnsSelector, AV90EmprCod, AV91MaqCod, AV92Hisprofec, AV26TFMaqCod, AV27TFMaqCod_Sel, AV42TFMaqDsc, AV43TFMaqDsc_Sel, AV29TFHisProFec, AV34TFHisProLin, AV35TFHisProLin_To, AV45TFBarNHdr, AV46TFBarNHdr_Sel, AV48TFGruOpeCod, AV49TFGruOpeCod_To, AV51TFBarOrdLin, AV52TFBarOrdLin_To, AV54TFFase, AV55TFFase_Sel, AV60TFHisProDTI, AV65TFHisProDTF, AV70TFHisProF, AV71TFHisProF_Sel, AV73TFHisProTur, AV74TFHisProTur_To, AV76TFHisProKgr, AV77TFHisProKgr_To, AV79TFHisProMtr, AV80TFHisProMtr_To, AV82TFHisProNpzs, AV83TFHisProNpzs_To, AV85TFParCod, AV86TFParCod_To, AV88TFParCodNom, AV89TFParCodNom_Sel, AV133Pgmname, AV12OrderedBy, AV13OrderedDsc, AV99Wcpartesproduccionds_1_emprcod, AV100Wcpartesproduccionds_2_maqcod, AV101Wcpartesproduccionds_3_hisprofec, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV99Wcpartesproduccionds_1_emprcod = AV90EmprCod ;
      AV100Wcpartesproduccionds_2_maqcod = AV91MaqCod ;
      AV101Wcpartesproduccionds_3_hisprofec = AV92Hisprofec ;
      AV102Wcpartesproduccionds_4_tfmaqcod = AV26TFMaqCod ;
      AV103Wcpartesproduccionds_5_tfmaqcod_sel = AV27TFMaqCod_Sel ;
      AV104Wcpartesproduccionds_6_tfmaqdsc = AV42TFMaqDsc ;
      AV105Wcpartesproduccionds_7_tfmaqdsc_sel = AV43TFMaqDsc_Sel ;
      AV106Wcpartesproduccionds_8_tfhisprofec = AV29TFHisProFec ;
      AV107Wcpartesproduccionds_9_tfhisprolin = AV34TFHisProLin ;
      AV108Wcpartesproduccionds_10_tfhisprolin_to = AV35TFHisProLin_To ;
      AV109Wcpartesproduccionds_11_tfbarnhdr = AV45TFBarNHdr ;
      AV110Wcpartesproduccionds_12_tfbarnhdr_sel = AV46TFBarNHdr_Sel ;
      AV111Wcpartesproduccionds_13_tfgruopecod = AV48TFGruOpeCod ;
      AV112Wcpartesproduccionds_14_tfgruopecod_to = AV49TFGruOpeCod_To ;
      AV113Wcpartesproduccionds_15_tfbarordlin = AV51TFBarOrdLin ;
      AV114Wcpartesproduccionds_16_tfbarordlin_to = AV52TFBarOrdLin_To ;
      AV115Wcpartesproduccionds_17_tffase = AV54TFFase ;
      AV116Wcpartesproduccionds_18_tffase_sel = AV55TFFase_Sel ;
      AV117Wcpartesproduccionds_19_tfhisprodti = AV60TFHisProDTI ;
      AV118Wcpartesproduccionds_20_tfhisprodtf = AV65TFHisProDTF ;
      AV119Wcpartesproduccionds_21_tfhisprof = AV70TFHisProF ;
      AV120Wcpartesproduccionds_22_tfhisprof_sel = AV71TFHisProF_Sel ;
      AV121Wcpartesproduccionds_23_tfhisprotur = AV73TFHisProTur ;
      AV122Wcpartesproduccionds_24_tfhisprotur_to = AV74TFHisProTur_To ;
      AV123Wcpartesproduccionds_25_tfhisprokgr = AV76TFHisProKgr ;
      AV124Wcpartesproduccionds_26_tfhisprokgr_to = AV77TFHisProKgr_To ;
      AV125Wcpartesproduccionds_27_tfhispromtr = AV79TFHisProMtr ;
      AV126Wcpartesproduccionds_28_tfhispromtr_to = AV80TFHisProMtr_To ;
      AV127Wcpartesproduccionds_29_tfhispronpzs = AV82TFHisProNpzs ;
      AV128Wcpartesproduccionds_30_tfhispronpzs_to = AV83TFHisProNpzs_To ;
      AV129Wcpartesproduccionds_31_tfparcod = AV85TFParCod ;
      AV130Wcpartesproduccionds_32_tfparcod_to = AV86TFParCod_To ;
      AV131Wcpartesproduccionds_33_tfparcodnom = AV88TFParCodNom ;
      AV132Wcpartesproduccionds_34_tfparcodnom_sel = AV89TFParCodNom_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV19ColumnsSelector, AV90EmprCod, AV91MaqCod, AV92Hisprofec, AV26TFMaqCod, AV27TFMaqCod_Sel, AV42TFMaqDsc, AV43TFMaqDsc_Sel, AV29TFHisProFec, AV34TFHisProLin, AV35TFHisProLin_To, AV45TFBarNHdr, AV46TFBarNHdr_Sel, AV48TFGruOpeCod, AV49TFGruOpeCod_To, AV51TFBarOrdLin, AV52TFBarOrdLin_To, AV54TFFase, AV55TFFase_Sel, AV60TFHisProDTI, AV65TFHisProDTF, AV70TFHisProF, AV71TFHisProF_Sel, AV73TFHisProTur, AV74TFHisProTur_To, AV76TFHisProKgr, AV77TFHisProKgr_To, AV79TFHisProMtr, AV80TFHisProMtr_To, AV82TFHisProNpzs, AV83TFHisProNpzs_To, AV85TFParCod, AV86TFParCod_To, AV88TFParCodNom, AV89TFParCodNom_Sel, AV133Pgmname, AV12OrderedBy, AV13OrderedDsc, AV99Wcpartesproduccionds_1_emprcod, AV100Wcpartesproduccionds_2_maqcod, AV101Wcpartesproduccionds_3_hisprofec, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV99Wcpartesproduccionds_1_emprcod = AV90EmprCod ;
      AV100Wcpartesproduccionds_2_maqcod = AV91MaqCod ;
      AV101Wcpartesproduccionds_3_hisprofec = AV92Hisprofec ;
      AV102Wcpartesproduccionds_4_tfmaqcod = AV26TFMaqCod ;
      AV103Wcpartesproduccionds_5_tfmaqcod_sel = AV27TFMaqCod_Sel ;
      AV104Wcpartesproduccionds_6_tfmaqdsc = AV42TFMaqDsc ;
      AV105Wcpartesproduccionds_7_tfmaqdsc_sel = AV43TFMaqDsc_Sel ;
      AV106Wcpartesproduccionds_8_tfhisprofec = AV29TFHisProFec ;
      AV107Wcpartesproduccionds_9_tfhisprolin = AV34TFHisProLin ;
      AV108Wcpartesproduccionds_10_tfhisprolin_to = AV35TFHisProLin_To ;
      AV109Wcpartesproduccionds_11_tfbarnhdr = AV45TFBarNHdr ;
      AV110Wcpartesproduccionds_12_tfbarnhdr_sel = AV46TFBarNHdr_Sel ;
      AV111Wcpartesproduccionds_13_tfgruopecod = AV48TFGruOpeCod ;
      AV112Wcpartesproduccionds_14_tfgruopecod_to = AV49TFGruOpeCod_To ;
      AV113Wcpartesproduccionds_15_tfbarordlin = AV51TFBarOrdLin ;
      AV114Wcpartesproduccionds_16_tfbarordlin_to = AV52TFBarOrdLin_To ;
      AV115Wcpartesproduccionds_17_tffase = AV54TFFase ;
      AV116Wcpartesproduccionds_18_tffase_sel = AV55TFFase_Sel ;
      AV117Wcpartesproduccionds_19_tfhisprodti = AV60TFHisProDTI ;
      AV118Wcpartesproduccionds_20_tfhisprodtf = AV65TFHisProDTF ;
      AV119Wcpartesproduccionds_21_tfhisprof = AV70TFHisProF ;
      AV120Wcpartesproduccionds_22_tfhisprof_sel = AV71TFHisProF_Sel ;
      AV121Wcpartesproduccionds_23_tfhisprotur = AV73TFHisProTur ;
      AV122Wcpartesproduccionds_24_tfhisprotur_to = AV74TFHisProTur_To ;
      AV123Wcpartesproduccionds_25_tfhisprokgr = AV76TFHisProKgr ;
      AV124Wcpartesproduccionds_26_tfhisprokgr_to = AV77TFHisProKgr_To ;
      AV125Wcpartesproduccionds_27_tfhispromtr = AV79TFHisProMtr ;
      AV126Wcpartesproduccionds_28_tfhispromtr_to = AV80TFHisProMtr_To ;
      AV127Wcpartesproduccionds_29_tfhispronpzs = AV82TFHisProNpzs ;
      AV128Wcpartesproduccionds_30_tfhispronpzs_to = AV83TFHisProNpzs_To ;
      AV129Wcpartesproduccionds_31_tfparcod = AV85TFParCod ;
      AV130Wcpartesproduccionds_32_tfparcod_to = AV86TFParCod_To ;
      AV131Wcpartesproduccionds_33_tfparcodnom = AV88TFParCodNom ;
      AV132Wcpartesproduccionds_34_tfparcodnom_sel = AV89TFParCodNom_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV19ColumnsSelector, AV90EmprCod, AV91MaqCod, AV92Hisprofec, AV26TFMaqCod, AV27TFMaqCod_Sel, AV42TFMaqDsc, AV43TFMaqDsc_Sel, AV29TFHisProFec, AV34TFHisProLin, AV35TFHisProLin_To, AV45TFBarNHdr, AV46TFBarNHdr_Sel, AV48TFGruOpeCod, AV49TFGruOpeCod_To, AV51TFBarOrdLin, AV52TFBarOrdLin_To, AV54TFFase, AV55TFFase_Sel, AV60TFHisProDTI, AV65TFHisProDTF, AV70TFHisProF, AV71TFHisProF_Sel, AV73TFHisProTur, AV74TFHisProTur_To, AV76TFHisProKgr, AV77TFHisProKgr_To, AV79TFHisProMtr, AV80TFHisProMtr_To, AV82TFHisProNpzs, AV83TFHisProNpzs_To, AV85TFParCod, AV86TFParCod_To, AV88TFParCodNom, AV89TFParCodNom_Sel, AV133Pgmname, AV12OrderedBy, AV13OrderedDsc, AV99Wcpartesproduccionds_1_emprcod, AV100Wcpartesproduccionds_2_maqcod, AV101Wcpartesproduccionds_3_hisprofec, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV133Pgmname = "WCPartesProduccion" ;
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strupHO0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e17HO2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV37DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV19ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_30 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_30"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV39GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV40GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV90EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV90EmprCod") ;
         wcpOAV91MaqCod = httpContext.cgiGet( sPrefix+"wcpOAV91MaqCod") ;
         wcpOAV92Hisprofec = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV92Hisprofec"), 0) ;
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
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_hisprofecauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_HISPROFECAUXDATE");
            GX_FocusControl = edtavDdo_hisprofecauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV31DDO_HisProFecAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31DDO_HisProFecAuxDate", localUtil.format(AV31DDO_HisProFecAuxDate, "99/99/99"));
         }
         else
         {
            AV31DDO_HisProFecAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_hisprofecauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31DDO_HisProFecAuxDate", localUtil.format(AV31DDO_HisProFecAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_hisprodtiauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_HISPRODTIAUXDATE");
            GX_FocusControl = edtavDdo_hisprodtiauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV62DDO_HisProDTIAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62DDO_HisProDTIAuxDate", localUtil.format(AV62DDO_HisProDTIAuxDate, "99/99/99"));
         }
         else
         {
            AV62DDO_HisProDTIAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_hisprodtiauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62DDO_HisProDTIAuxDate", localUtil.format(AV62DDO_HisProDTIAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_hisprodtfauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_HISPRODTFAUXDATE");
            GX_FocusControl = edtavDdo_hisprodtfauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV67DDO_HisProDTFAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67DDO_HisProDTFAuxDate", localUtil.format(AV67DDO_HisProDTFAuxDate, "99/99/99"));
         }
         else
         {
            AV67DDO_HisProDTFAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_hisprodtfauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67DDO_HisProDTFAuxDate", localUtil.format(AV67DDO_HisProDTFAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         nGXsfl_30_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_30_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_30_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_302( ) ;
         if ( nGXsfl_30_idx > 0 )
         {
            A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
            A606MaqDsc = httpContext.cgiGet( edtMaqDsc_Internalname) ;
            n606MaqDsc = false ;
            A558HisProFec = localUtil.ctod( httpContext.cgiGet( edtHisProFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            A561HisProLin = (int)(localUtil.ctol( httpContext.cgiGet( edtHisProLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
            A503GruOpeCod = (int)(localUtil.ctol( httpContext.cgiGet( edtGruOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A461Fase = httpContext.cgiGet( edtFase_Internalname) ;
            A4440HisProDTI = localUtil.ctot( httpContext.cgiGet( edtHisProDTI_Internalname)) ;
            A4441HisProDTF = localUtil.ctot( httpContext.cgiGet( edtHisProDTF_Internalname)) ;
            A557HisProF = GXutil.upper( httpContext.cgiGet( edtHisProF_Internalname)) ;
            A566HisProTur = (byte)(localUtil.ctol( httpContext.cgiGet( edtHisProTur_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1525HisProKgr = localUtil.ctond( httpContext.cgiGet( edtHisProKgr_Internalname)) ;
            A1526HisProMtr = localUtil.ctond( httpContext.cgiGet( edtHisProMtr_Internalname)) ;
            A4714HisProNpzs = (short)(localUtil.ctol( httpContext.cgiGet( edtHisProNpzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A656ParCod = (short)(localUtil.ctol( httpContext.cgiGet( edtParCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A867ParCodNom = httpContext.cgiGet( edtParCodNom_Internalname) ;
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
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
      e17HO2 ();
      if (returnInSub) return;
   }

   public void e17HO2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV96Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wcpartesproduccion_impl.this.GXt_char1 = GXv_char2[0] ;
      AV96Station = GXt_char1 ;
      GXv_char2[0] = AV90EmprCod ;
      GXv_char3[0] = AV97Emprnom ;
      GXv_char4[0] = AV98Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV96Station, GXv_char2, GXv_char3, GXv_char4) ;
      wcpartesproduccion_impl.this.AV90EmprCod = GXv_char2[0] ;
      wcpartesproduccion_impl.this.AV97Emprnom = GXv_char3[0] ;
      wcpartesproduccion_impl.this.AV98Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90EmprCod", AV90EmprCod);
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV37DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV37DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e18HO2( )
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
      if ( GXutil.strcmp(AV21Session.getValue("WCPartesProduccionColumnsSelector"), "") != 0 )
      {
         AV17ColumnsSelectorXML = AV21Session.getValue("WCPartesProduccionColumnsSelector") ;
         AV19ColumnsSelector.fromxml(AV17ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S152 ();
         if (returnInSub) return;
      }
      edtMaqCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMaqCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Visible), 5, 0), !bGXsfl_30_Refreshing);
      edtMaqDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMaqDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqDsc_Visible), 5, 0), !bGXsfl_30_Refreshing);
      edtHisProFec_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisProFec_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProFec_Visible), 5, 0), !bGXsfl_30_Refreshing);
      edtHisProLin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisProLin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProLin_Visible), 5, 0), !bGXsfl_30_Refreshing);
      edtBarNHdr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarNHdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNHdr_Visible), 5, 0), !bGXsfl_30_Refreshing);
      edtGruOpeCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtGruOpeCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGruOpeCod_Visible), 5, 0), !bGXsfl_30_Refreshing);
      edtBarOrdLin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarOrdLin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarOrdLin_Visible), 5, 0), !bGXsfl_30_Refreshing);
      edtFase_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFase_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFase_Visible), 5, 0), !bGXsfl_30_Refreshing);
      edtHisProDTI_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisProDTI_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProDTI_Visible), 5, 0), !bGXsfl_30_Refreshing);
      edtHisProDTF_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisProDTF_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProDTF_Visible), 5, 0), !bGXsfl_30_Refreshing);
      edtHisProF_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisProF_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProF_Visible), 5, 0), !bGXsfl_30_Refreshing);
      edtHisProTur_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisProTur_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProTur_Visible), 5, 0), !bGXsfl_30_Refreshing);
      edtHisProKgr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisProKgr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProKgr_Visible), 5, 0), !bGXsfl_30_Refreshing);
      edtHisProMtr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisProMtr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProMtr_Visible), 5, 0), !bGXsfl_30_Refreshing);
      edtHisProNpzs_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisProNpzs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProNpzs_Visible), 5, 0), !bGXsfl_30_Refreshing);
      edtParCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtParCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParCod_Visible), 5, 0), !bGXsfl_30_Refreshing);
      edtParCodNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtParCodNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParCodNom_Visible), 5, 0), !bGXsfl_30_Refreshing);
      AV39GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39GridCurrentPage), 10, 0));
      AV40GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40GridPageCount), 10, 0));
      AV99Wcpartesproduccionds_1_emprcod = AV90EmprCod ;
      AV100Wcpartesproduccionds_2_maqcod = AV91MaqCod ;
      AV101Wcpartesproduccionds_3_hisprofec = AV92Hisprofec ;
      AV102Wcpartesproduccionds_4_tfmaqcod = AV26TFMaqCod ;
      AV103Wcpartesproduccionds_5_tfmaqcod_sel = AV27TFMaqCod_Sel ;
      AV104Wcpartesproduccionds_6_tfmaqdsc = AV42TFMaqDsc ;
      AV105Wcpartesproduccionds_7_tfmaqdsc_sel = AV43TFMaqDsc_Sel ;
      AV106Wcpartesproduccionds_8_tfhisprofec = AV29TFHisProFec ;
      AV107Wcpartesproduccionds_9_tfhisprolin = AV34TFHisProLin ;
      AV108Wcpartesproduccionds_10_tfhisprolin_to = AV35TFHisProLin_To ;
      AV109Wcpartesproduccionds_11_tfbarnhdr = AV45TFBarNHdr ;
      AV110Wcpartesproduccionds_12_tfbarnhdr_sel = AV46TFBarNHdr_Sel ;
      AV111Wcpartesproduccionds_13_tfgruopecod = AV48TFGruOpeCod ;
      AV112Wcpartesproduccionds_14_tfgruopecod_to = AV49TFGruOpeCod_To ;
      AV113Wcpartesproduccionds_15_tfbarordlin = AV51TFBarOrdLin ;
      AV114Wcpartesproduccionds_16_tfbarordlin_to = AV52TFBarOrdLin_To ;
      AV115Wcpartesproduccionds_17_tffase = AV54TFFase ;
      AV116Wcpartesproduccionds_18_tffase_sel = AV55TFFase_Sel ;
      AV117Wcpartesproduccionds_19_tfhisprodti = AV60TFHisProDTI ;
      AV118Wcpartesproduccionds_20_tfhisprodtf = AV65TFHisProDTF ;
      AV119Wcpartesproduccionds_21_tfhisprof = AV70TFHisProF ;
      AV120Wcpartesproduccionds_22_tfhisprof_sel = AV71TFHisProF_Sel ;
      AV121Wcpartesproduccionds_23_tfhisprotur = AV73TFHisProTur ;
      AV122Wcpartesproduccionds_24_tfhisprotur_to = AV74TFHisProTur_To ;
      AV123Wcpartesproduccionds_25_tfhisprokgr = AV76TFHisProKgr ;
      AV124Wcpartesproduccionds_26_tfhisprokgr_to = AV77TFHisProKgr_To ;
      AV125Wcpartesproduccionds_27_tfhispromtr = AV79TFHisProMtr ;
      AV126Wcpartesproduccionds_28_tfhispromtr_to = AV80TFHisProMtr_To ;
      AV127Wcpartesproduccionds_29_tfhispronpzs = AV82TFHisProNpzs ;
      AV128Wcpartesproduccionds_30_tfhispronpzs_to = AV83TFHisProNpzs_To ;
      AV129Wcpartesproduccionds_31_tfparcod = AV85TFParCod ;
      AV130Wcpartesproduccionds_32_tfparcod_to = AV86TFParCod_To ;
      AV131Wcpartesproduccionds_33_tfparcodnom = AV88TFParCodNom ;
      AV132Wcpartesproduccionds_34_tfparcodnom_sel = AV89TFParCodNom_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV19ColumnsSelector", AV19ColumnsSelector);
   }

   public void e11HO2( )
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
         AV38PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV38PageToGo) ;
      }
   }

   public void e12HO2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e13HO2( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MaqCod") == 0 )
         {
            AV26TFMaqCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFMaqCod", AV26TFMaqCod);
            AV27TFMaqCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFMaqCod_Sel", AV27TFMaqCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MaqDsc") == 0 )
         {
            AV42TFMaqDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFMaqDsc", AV42TFMaqDsc);
            AV43TFMaqDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFMaqDsc_Sel", AV43TFMaqDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProFec") == 0 )
         {
            AV29TFHisProFec = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFHisProFec", localUtil.format(AV29TFHisProFec, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProLin") == 0 )
         {
            AV34TFHisProLin = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFHisProLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFHisProLin), 8, 0));
            AV35TFHisProLin_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFHisProLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFHisProLin_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarNHdr") == 0 )
         {
            AV45TFBarNHdr = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFBarNHdr", AV45TFBarNHdr);
            AV46TFBarNHdr_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFBarNHdr_Sel", AV46TFBarNHdr_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "GruOpeCod") == 0 )
         {
            AV48TFGruOpeCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFGruOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFGruOpeCod), 6, 0));
            AV49TFGruOpeCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFGruOpeCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFGruOpeCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarOrdLin") == 0 )
         {
            AV51TFBarOrdLin = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFBarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51TFBarOrdLin), 4, 0));
            AV52TFBarOrdLin_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFBarOrdLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52TFBarOrdLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Fase") == 0 )
         {
            AV54TFFase = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFFase", AV54TFFase);
            AV55TFFase_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFFase_Sel", AV55TFFase_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProDTI") == 0 )
         {
            AV60TFHisProDTI = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFHisProDTI", localUtil.ttoc( AV60TFHisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProDTF") == 0 )
         {
            AV65TFHisProDTF = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFHisProDTF", localUtil.ttoc( AV65TFHisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProF") == 0 )
         {
            AV70TFHisProF = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70TFHisProF", AV70TFHisProF);
            AV71TFHisProF_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TFHisProF_Sel", AV71TFHisProF_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProTur") == 0 )
         {
            AV73TFHisProTur = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73TFHisProTur", GXutil.str( AV73TFHisProTur, 1, 0));
            AV74TFHisProTur_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74TFHisProTur_To", GXutil.str( AV74TFHisProTur_To, 1, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProKgr") == 0 )
         {
            AV76TFHisProKgr = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76TFHisProKgr", GXutil.ltrimstr( AV76TFHisProKgr, 9, 2));
            AV77TFHisProKgr_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77TFHisProKgr_To", GXutil.ltrimstr( AV77TFHisProKgr_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProMtr") == 0 )
         {
            AV79TFHisProMtr = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV79TFHisProMtr", GXutil.ltrimstr( AV79TFHisProMtr, 9, 2));
            AV80TFHisProMtr_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80TFHisProMtr_To", GXutil.ltrimstr( AV80TFHisProMtr_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProNpzs") == 0 )
         {
            AV82TFHisProNpzs = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82TFHisProNpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82TFHisProNpzs), 4, 0));
            AV83TFHisProNpzs_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83TFHisProNpzs_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83TFHisProNpzs_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ParCod") == 0 )
         {
            AV85TFParCod = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85TFParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV85TFParCod), 4, 0));
            AV86TFParCod_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86TFParCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV86TFParCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ParCodNom") == 0 )
         {
            AV88TFParCodNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88TFParCodNom", AV88TFParCodNom);
            AV89TFParCodNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89TFParCodNom_Sel", AV89TFParCodNom_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e19HO2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(30) ;
      }
      sendrow_302( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_30_Refreshing )
      {
         httpContext.doAjaxLoad(30, GridRow);
      }
   }

   public void e14HO2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV17ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV19ColumnsSelector.fromJSonString(AV17ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "WCPartesProduccionColumnsSelector", ((GXutil.strcmp("", AV17ColumnsSelectorXML)==0) ? "" : AV19ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV19ColumnsSelector", AV19ColumnsSelector);
   }

   public void e15HO2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV15ExcelFilename ;
      GXv_char3[0] = AV16ErrorMessage ;
      new app.wcpartesproduccionexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      wcpartesproduccion_impl.this.AV15ExcelFilename = GXv_char4[0] ;
      wcpartesproduccion_impl.this.AV16ErrorMessage = GXv_char3[0] ;
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

   public void e16HO2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.wcpartesproduccionexportcsv", new String[] {}, new String[] {}) );
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
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MaqCod", "", "Código Máquina", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MaqDsc", "", "Descripcion Maquina", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HisProFec", "", "Fecha", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HisProLin", "", "#", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarNHdr", "", "Hdr", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "GruOpeCod", "", "Operario", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarOrdLin", "", "Orden", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Fase", "", "Fase", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HisProDTI", "", "Inicio", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HisProDTF", "", "Fin", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HisProF", "", "F?", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HisProTur", "", "T", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HisProKgr", "", "Kgs", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HisProMtr", "", "Mts", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HisProNpzs", "", "Pcs", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ParCod", "", "Paro", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ParCodNom", "", "Descripcion", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV18UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCPartesProduccionColumnsSelector", GXv_char4) ;
      wcpartesproduccion_impl.this.GXt_char1 = GXv_char4[0] ;
      AV18UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV18UserCustomValue)==0) ) )
      {
         AV20ColumnsSelectorAux.fromxml(AV18UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector9[0] = AV19ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, GXv_SdtWWPColumnsSelector9) ;
         AV20ColumnsSelectorAux = GXv_SdtWWPColumnsSelector8[0] ;
         AV19ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV21Session.getValue(AV133Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV133Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV21Session.getValue(AV133Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S132 ();
      if (returnInSub) return;
      AV134GXV1 = 1 ;
      while ( AV134GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV134GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV26TFMaqCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFMaqCod", AV26TFMaqCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV27TFMaqCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFMaqCod_Sel", AV27TFMaqCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC") == 0 )
         {
            AV42TFMaqDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFMaqDsc", AV42TFMaqDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC_SEL") == 0 )
         {
            AV43TFMaqDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFMaqDsc_Sel", AV43TFMaqDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROFEC") == 0 )
         {
            AV29TFHisProFec = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFHisProFec", localUtil.format(AV29TFHisProFec, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROLIN") == 0 )
         {
            AV34TFHisProLin = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFHisProLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFHisProLin), 8, 0));
            AV35TFHisProLin_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFHisProLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFHisProLin_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV45TFBarNHdr = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFBarNHdr", AV45TFBarNHdr);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV46TFBarNHdr_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFBarNHdr_Sel", AV46TFBarNHdr_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGRUOPECOD") == 0 )
         {
            AV48TFGruOpeCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFGruOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFGruOpeCod), 6, 0));
            AV49TFGruOpeCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFGruOpeCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFGruOpeCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARORDLIN") == 0 )
         {
            AV51TFBarOrdLin = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFBarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51TFBarOrdLin), 4, 0));
            AV52TFBarOrdLin_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFBarOrdLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52TFBarOrdLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE") == 0 )
         {
            AV54TFFase = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFFase", AV54TFFase);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE_SEL") == 0 )
         {
            AV55TFFase_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFFase_Sel", AV55TFFase_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTI") == 0 )
         {
            AV60TFHisProDTI = localUtil.ctot( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFHisProDTI", localUtil.ttoc( AV60TFHisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV62DDO_HisProDTIAuxDate = GXutil.resetTime(AV60TFHisProDTI) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62DDO_HisProDTIAuxDate", localUtil.format(AV62DDO_HisProDTIAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTF") == 0 )
         {
            AV65TFHisProDTF = localUtil.ctot( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFHisProDTF", localUtil.ttoc( AV65TFHisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV67DDO_HisProDTFAuxDate = GXutil.resetTime(AV65TFHisProDTF) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67DDO_HisProDTFAuxDate", localUtil.format(AV67DDO_HisProDTFAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROF") == 0 )
         {
            AV70TFHisProF = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70TFHisProF", AV70TFHisProF);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROF_SEL") == 0 )
         {
            AV71TFHisProF_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TFHisProF_Sel", AV71TFHisProF_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROTUR") == 0 )
         {
            AV73TFHisProTur = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73TFHisProTur", GXutil.str( AV73TFHisProTur, 1, 0));
            AV74TFHisProTur_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74TFHisProTur_To", GXutil.str( AV74TFHisProTur_To, 1, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROKGR") == 0 )
         {
            AV76TFHisProKgr = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76TFHisProKgr", GXutil.ltrimstr( AV76TFHisProKgr, 9, 2));
            AV77TFHisProKgr_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77TFHisProKgr_To", GXutil.ltrimstr( AV77TFHisProKgr_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROMTR") == 0 )
         {
            AV79TFHisProMtr = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV79TFHisProMtr", GXutil.ltrimstr( AV79TFHisProMtr, 9, 2));
            AV80TFHisProMtr_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80TFHisProMtr_To", GXutil.ltrimstr( AV80TFHisProMtr_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRONPZS") == 0 )
         {
            AV82TFHisProNpzs = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82TFHisProNpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82TFHisProNpzs), 4, 0));
            AV83TFHisProNpzs_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83TFHisProNpzs_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83TFHisProNpzs_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCOD") == 0 )
         {
            AV85TFParCod = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85TFParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV85TFParCod), 4, 0));
            AV86TFParCod_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86TFParCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV86TFParCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCODNOM") == 0 )
         {
            AV88TFParCodNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88TFParCodNom", AV88TFParCodNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCODNOM_SEL") == 0 )
         {
            AV89TFParCodNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89TFParCodNom_Sel", AV89TFParCodNom_Sel);
         }
         AV134GXV1 = (int)(AV134GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV27TFMaqCod_Sel)==0), AV27TFMaqCod_Sel, GXv_char4) ;
      wcpartesproduccion_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char10 = "" ;
      GXv_char3[0] = GXt_char10 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV43TFMaqDsc_Sel)==0), AV43TFMaqDsc_Sel, GXv_char3) ;
      wcpartesproduccion_impl.this.GXt_char10 = GXv_char3[0] ;
      GXt_char11 = "" ;
      GXv_char2[0] = GXt_char11 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV46TFBarNHdr_Sel)==0), AV46TFBarNHdr_Sel, GXv_char2) ;
      wcpartesproduccion_impl.this.GXt_char11 = GXv_char2[0] ;
      GXt_char12 = "" ;
      GXv_char13[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV55TFFase_Sel)==0), AV55TFFase_Sel, GXv_char13) ;
      wcpartesproduccion_impl.this.GXt_char12 = GXv_char13[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV71TFHisProF_Sel)==0), AV71TFHisProF_Sel, GXv_char15) ;
      wcpartesproduccion_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV89TFParCodNom_Sel)==0), AV89TFParCodNom_Sel, GXv_char17) ;
      wcpartesproduccion_impl.this.GXt_char16 = GXv_char17[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|"+GXt_char10+"|||"+GXt_char11+"|||"+GXt_char12+"|||"+GXt_char14+"||||||"+GXt_char16 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV26TFMaqCod)==0), AV26TFMaqCod, GXv_char17) ;
      wcpartesproduccion_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV42TFMaqDsc)==0), AV42TFMaqDsc, GXv_char15) ;
      wcpartesproduccion_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char12 = "" ;
      GXv_char13[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV45TFBarNHdr)==0), AV45TFBarNHdr, GXv_char13) ;
      wcpartesproduccion_impl.this.GXt_char12 = GXv_char13[0] ;
      GXt_char11 = "" ;
      GXv_char4[0] = GXt_char11 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV54TFFase)==0), AV54TFFase, GXv_char4) ;
      wcpartesproduccion_impl.this.GXt_char11 = GXv_char4[0] ;
      GXt_char10 = "" ;
      GXv_char3[0] = GXt_char10 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV70TFHisProF)==0), AV70TFHisProF, GXv_char3) ;
      wcpartesproduccion_impl.this.GXt_char10 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV88TFParCodNom)==0), AV88TFParCodNom, GXv_char2) ;
      wcpartesproduccion_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = GXt_char16+"|"+GXt_char14+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV29TFHisProFec)) ? "" : localUtil.dtoc( AV29TFHisProFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+((0==AV34TFHisProLin) ? "" : GXutil.str( AV34TFHisProLin, 8, 0))+"|"+GXt_char12+"|"+((0==AV48TFGruOpeCod) ? "" : GXutil.str( AV48TFGruOpeCod, 6, 0))+"|"+((0==AV51TFBarOrdLin) ? "" : GXutil.str( AV51TFBarOrdLin, 4, 0))+"|"+GXt_char11+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV60TFHisProDTI) ? "" : localUtil.dtoc( AV62DDO_HisProDTIAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV65TFHisProDTF) ? "" : localUtil.dtoc( AV67DDO_HisProDTFAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char10+"|"+((0==AV73TFHisProTur) ? "" : GXutil.str( AV73TFHisProTur, 1, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV76TFHisProKgr)==0) ? "" : GXutil.str( AV76TFHisProKgr, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV79TFHisProMtr)==0) ? "" : GXutil.str( AV79TFHisProMtr, 9, 2))+"|"+((0==AV82TFHisProNpzs) ? "" : GXutil.str( AV82TFHisProNpzs, 4, 0))+"|"+((0==AV85TFParCod) ? "" : GXutil.str( AV85TFParCod, 4, 0))+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|||"+((0==AV35TFHisProLin_To) ? "" : GXutil.str( AV35TFHisProLin_To, 8, 0))+"||"+((0==AV49TFGruOpeCod_To) ? "" : GXutil.str( AV49TFGruOpeCod_To, 6, 0))+"|"+((0==AV52TFBarOrdLin_To) ? "" : GXutil.str( AV52TFBarOrdLin_To, 4, 0))+"|||||"+((0==AV74TFHisProTur_To) ? "" : GXutil.str( AV74TFHisProTur_To, 1, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV77TFHisProKgr_To)==0) ? "" : GXutil.str( AV77TFHisProKgr_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV80TFHisProMtr_To)==0) ? "" : GXutil.str( AV80TFHisProMtr_To, 9, 2))+"|"+((0==AV83TFHisProNpzs_To) ? "" : GXutil.str( AV83TFHisProNpzs_To, 4, 0))+"|"+((0==AV86TFParCod_To) ? "" : GXutil.str( AV86TFParCod_To, 4, 0))+"|" ;
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
      AV10GridState.fromxml(AV21Session.getValue(AV133Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFMAQCOD", "", !(GXutil.strcmp("", AV26TFMaqCod)==0), (short)(0), AV26TFMaqCod, "", !(GXutil.strcmp("", AV27TFMaqCod_Sel)==0), AV27TFMaqCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFMAQDSC", "", !(GXutil.strcmp("", AV42TFMaqDsc)==0), (short)(0), AV42TFMaqDsc, "", !(GXutil.strcmp("", AV43TFMaqDsc_Sel)==0), AV43TFMaqDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFHISPROFEC", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV29TFHisProFec)), (short)(0), GXutil.trim( localUtil.dtoc( AV29TFHisProFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFHISPROLIN", "", !((0==AV34TFHisProLin)&&(0==AV35TFHisProLin_To)), (short)(0), GXutil.trim( GXutil.str( AV34TFHisProLin, 8, 0)), GXutil.trim( GXutil.str( AV35TFHisProLin_To, 8, 0))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFBARNHDR", "", !(GXutil.strcmp("", AV45TFBarNHdr)==0), (short)(0), AV45TFBarNHdr, "", !(GXutil.strcmp("", AV46TFBarNHdr_Sel)==0), AV46TFBarNHdr_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFGRUOPECOD", "", !((0==AV48TFGruOpeCod)&&(0==AV49TFGruOpeCod_To)), (short)(0), GXutil.trim( GXutil.str( AV48TFGruOpeCod, 6, 0)), GXutil.trim( GXutil.str( AV49TFGruOpeCod_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFBARORDLIN", "", !((0==AV51TFBarOrdLin)&&(0==AV52TFBarOrdLin_To)), (short)(0), GXutil.trim( GXutil.str( AV51TFBarOrdLin, 4, 0)), GXutil.trim( GXutil.str( AV52TFBarOrdLin_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFFASE", "", !(GXutil.strcmp("", AV54TFFase)==0), (short)(0), AV54TFFase, "", !(GXutil.strcmp("", AV55TFFase_Sel)==0), AV55TFFase_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFHISPRODTI", "", !GXutil.dateCompare(GXutil.nullDate(), AV60TFHisProDTI), (short)(0), GXutil.trim( localUtil.ttoc( AV60TFHisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFHISPRODTF", "", !GXutil.dateCompare(GXutil.nullDate(), AV65TFHisProDTF), (short)(0), GXutil.trim( localUtil.ttoc( AV65TFHisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFHISPROF", "", !(GXutil.strcmp("", AV70TFHisProF)==0), (short)(0), AV70TFHisProF, "", !(GXutil.strcmp("", AV71TFHisProF_Sel)==0), AV71TFHisProF_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFHISPROTUR", "", !((0==AV73TFHisProTur)&&(0==AV74TFHisProTur_To)), (short)(0), GXutil.trim( GXutil.str( AV73TFHisProTur, 1, 0)), GXutil.trim( GXutil.str( AV74TFHisProTur_To, 1, 0))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFHISPROKGR", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV76TFHisProKgr)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV77TFHisProKgr_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV76TFHisProKgr, 9, 2)), GXutil.trim( GXutil.str( AV77TFHisProKgr_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFHISPROMTR", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV79TFHisProMtr)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV80TFHisProMtr_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV79TFHisProMtr, 9, 2)), GXutil.trim( GXutil.str( AV80TFHisProMtr_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFHISPRONPZS", "", !((0==AV82TFHisProNpzs)&&(0==AV83TFHisProNpzs_To)), (short)(0), GXutil.trim( GXutil.str( AV82TFHisProNpzs, 4, 0)), GXutil.trim( GXutil.str( AV83TFHisProNpzs_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFPARCOD", "", !((0==AV85TFParCod)&&(0==AV86TFParCod_To)), (short)(0), GXutil.trim( GXutil.str( AV85TFParCod, 4, 0)), GXutil.trim( GXutil.str( AV86TFParCod_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFPARCODNOM", "", !(GXutil.strcmp("", AV88TFParCodNom)==0), (short)(0), AV88TFParCodNom, "", !(GXutil.strcmp("", AV89TFParCodNom_Sel)==0), AV89TFParCodNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      if ( ! (GXutil.strcmp("", AV90EmprCod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV90EmprCod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV91MaqCod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&MAQCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV91MaqCod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV92Hisprofec)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HISPROFEC" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV92Hisprofec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV133Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV133Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TPARPRO" );
      AV9TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "EmprCod" );
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( AV90EmprCod );
      AV8TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV9TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "MaqCod" );
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( AV91MaqCod );
      AV8TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV9TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "HisProFec" );
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( localUtil.dtoc( AV92Hisprofec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
      AV8TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV21Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV90EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90EmprCod", AV90EmprCod);
      AV91MaqCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91MaqCod", AV91MaqCod);
      AV92Hisprofec = (java.util.Date)getParm(obj,2,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92Hisprofec", localUtil.format(AV92Hisprofec, "99/99/99"));
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
      paHO2( ) ;
      wsHO2( ) ;
      weHO2( ) ;
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
      sCtrlAV90EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV91MaqCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV92Hisprofec = (String)getParm(obj,2,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      paHO2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "wcpartesproduccion", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      paHO2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV90EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90EmprCod", AV90EmprCod);
         AV91MaqCod = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91MaqCod", AV91MaqCod);
         AV92Hisprofec = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92Hisprofec", localUtil.format(AV92Hisprofec, "99/99/99"));
      }
      wcpOAV90EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV90EmprCod") ;
      wcpOAV91MaqCod = httpContext.cgiGet( sPrefix+"wcpOAV91MaqCod") ;
      wcpOAV92Hisprofec = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV92Hisprofec"), 0) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV90EmprCod, wcpOAV90EmprCod) != 0 ) || ( GXutil.strcmp(AV91MaqCod, wcpOAV91MaqCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV92Hisprofec), GXutil.resetTime(wcpOAV92Hisprofec)) ) ) )
      {
         setjustcreated();
      }
      wcpOAV90EmprCod = AV90EmprCod ;
      wcpOAV91MaqCod = AV91MaqCod ;
      wcpOAV92Hisprofec = AV92Hisprofec ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV90EmprCod = httpContext.cgiGet( sPrefix+"AV90EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV90EmprCod) > 0 )
      {
         AV90EmprCod = httpContext.cgiGet( sCtrlAV90EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90EmprCod", AV90EmprCod);
      }
      else
      {
         AV90EmprCod = httpContext.cgiGet( sPrefix+"AV90EmprCod_PARM") ;
      }
      sCtrlAV91MaqCod = httpContext.cgiGet( sPrefix+"AV91MaqCod_CTRL") ;
      if ( GXutil.len( sCtrlAV91MaqCod) > 0 )
      {
         AV91MaqCod = httpContext.cgiGet( sCtrlAV91MaqCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91MaqCod", AV91MaqCod);
      }
      else
      {
         AV91MaqCod = httpContext.cgiGet( sPrefix+"AV91MaqCod_PARM") ;
      }
      sCtrlAV92Hisprofec = httpContext.cgiGet( sPrefix+"AV92Hisprofec_CTRL") ;
      if ( GXutil.len( sCtrlAV92Hisprofec) > 0 )
      {
         AV92Hisprofec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV92Hisprofec), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92Hisprofec", localUtil.format(AV92Hisprofec, "99/99/99"));
      }
      else
      {
         AV92Hisprofec = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV92Hisprofec_PARM"), 0) ;
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
      paHO2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      wsHO2( ) ;
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
      wsHO2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV90EmprCod_PARM", GXutil.rtrim( AV90EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV90EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV90EmprCod_CTRL", GXutil.rtrim( sCtrlAV90EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV91MaqCod_PARM", GXutil.rtrim( AV91MaqCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV91MaqCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV91MaqCod_CTRL", GXutil.rtrim( sCtrlAV91MaqCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV92Hisprofec_PARM", localUtil.dtoc( AV92Hisprofec, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV92Hisprofec)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV92Hisprofec_CTRL", GXutil.rtrim( sCtrlAV92Hisprofec));
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
      weHO2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115565774", true, true);
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
      httpContext.AddJavascriptSource("wcpartesproduccion.js", "?202682115565774", false, true);
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

   public void subsflControlProps_302( )
   {
      edtMaqCod_Internalname = sPrefix+"MAQCOD_"+sGXsfl_30_idx ;
      edtMaqDsc_Internalname = sPrefix+"MAQDSC_"+sGXsfl_30_idx ;
      edtHisProFec_Internalname = sPrefix+"HISPROFEC_"+sGXsfl_30_idx ;
      edtHisProLin_Internalname = sPrefix+"HISPROLIN_"+sGXsfl_30_idx ;
      edtBarNHdr_Internalname = sPrefix+"BARNHDR_"+sGXsfl_30_idx ;
      edtGruOpeCod_Internalname = sPrefix+"GRUOPECOD_"+sGXsfl_30_idx ;
      edtBarOrdLin_Internalname = sPrefix+"BARORDLIN_"+sGXsfl_30_idx ;
      edtFase_Internalname = sPrefix+"FASE_"+sGXsfl_30_idx ;
      edtHisProDTI_Internalname = sPrefix+"HISPRODTI_"+sGXsfl_30_idx ;
      edtHisProDTF_Internalname = sPrefix+"HISPRODTF_"+sGXsfl_30_idx ;
      edtHisProF_Internalname = sPrefix+"HISPROF_"+sGXsfl_30_idx ;
      edtHisProTur_Internalname = sPrefix+"HISPROTUR_"+sGXsfl_30_idx ;
      edtHisProKgr_Internalname = sPrefix+"HISPROKGR_"+sGXsfl_30_idx ;
      edtHisProMtr_Internalname = sPrefix+"HISPROMTR_"+sGXsfl_30_idx ;
      edtHisProNpzs_Internalname = sPrefix+"HISPRONPZS_"+sGXsfl_30_idx ;
      edtParCod_Internalname = sPrefix+"PARCOD_"+sGXsfl_30_idx ;
      edtParCodNom_Internalname = sPrefix+"PARCODNOM_"+sGXsfl_30_idx ;
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_30_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_30_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_30_idx ;
   }

   public void subsflControlProps_fel_302( )
   {
      edtMaqCod_Internalname = sPrefix+"MAQCOD_"+sGXsfl_30_fel_idx ;
      edtMaqDsc_Internalname = sPrefix+"MAQDSC_"+sGXsfl_30_fel_idx ;
      edtHisProFec_Internalname = sPrefix+"HISPROFEC_"+sGXsfl_30_fel_idx ;
      edtHisProLin_Internalname = sPrefix+"HISPROLIN_"+sGXsfl_30_fel_idx ;
      edtBarNHdr_Internalname = sPrefix+"BARNHDR_"+sGXsfl_30_fel_idx ;
      edtGruOpeCod_Internalname = sPrefix+"GRUOPECOD_"+sGXsfl_30_fel_idx ;
      edtBarOrdLin_Internalname = sPrefix+"BARORDLIN_"+sGXsfl_30_fel_idx ;
      edtFase_Internalname = sPrefix+"FASE_"+sGXsfl_30_fel_idx ;
      edtHisProDTI_Internalname = sPrefix+"HISPRODTI_"+sGXsfl_30_fel_idx ;
      edtHisProDTF_Internalname = sPrefix+"HISPRODTF_"+sGXsfl_30_fel_idx ;
      edtHisProF_Internalname = sPrefix+"HISPROF_"+sGXsfl_30_fel_idx ;
      edtHisProTur_Internalname = sPrefix+"HISPROTUR_"+sGXsfl_30_fel_idx ;
      edtHisProKgr_Internalname = sPrefix+"HISPROKGR_"+sGXsfl_30_fel_idx ;
      edtHisProMtr_Internalname = sPrefix+"HISPROMTR_"+sGXsfl_30_fel_idx ;
      edtHisProNpzs_Internalname = sPrefix+"HISPRONPZS_"+sGXsfl_30_fel_idx ;
      edtParCod_Internalname = sPrefix+"PARCOD_"+sGXsfl_30_fel_idx ;
      edtParCodNom_Internalname = sPrefix+"PARCODNOM_"+sGXsfl_30_fel_idx ;
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_30_fel_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_30_fel_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_30_fel_idx ;
   }

   public void sendrow_302( )
   {
      subsflControlProps_302( ) ;
      wbHO0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_30_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_30_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_30_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMaqCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqCod_Internalname,GXutil.rtrim( A602MaqCod),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMaqCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtMaqCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMaqDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqDsc_Internalname,GXutil.rtrim( A606MaqDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMaqDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMaqDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisProFec_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProFec_Internalname,localUtil.format(A558HisProFec, "99/99/99"),localUtil.format( A558HisProFec, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisProFec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHisProFec_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisProLin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProLin_Internalname,GXutil.ltrim( localUtil.ntoc( A561HisProLin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A561HisProLin), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisProLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtHisProLin_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarNHdr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNHdr_Internalname,GXutil.rtrim( A13696BarNHdr),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarNHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarNHdr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtGruOpeCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGruOpeCod_Internalname,GXutil.ltrim( localUtil.ntoc( A503GruOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A503GruOpeCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtGruOpeCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtGruOpeCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarOrdLin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarOrdLin_Internalname,GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarOrdLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarOrdLin_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtFase_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFase_Internalname,GXutil.rtrim( A461Fase),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtFase_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtFase_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisProDTI_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProDTI_Internalname,localUtil.ttoc( A4440HisProDTI, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A4440HisProDTI, "99/99/99 99:99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisProDTI_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtHisProDTI_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisProDTF_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProDTF_Internalname,localUtil.ttoc( A4441HisProDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A4441HisProDTF, "99/99/99 99:99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisProDTF_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtHisProDTF_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtHisProF_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProF_Internalname,GXutil.rtrim( A557HisProF),GXutil.rtrim( localUtil.format( A557HisProF, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisProF_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtHisProF_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisProTur_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProTur_Internalname,GXutil.ltrim( localUtil.ntoc( A566HisProTur, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A566HisProTur), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisProTur_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtHisProTur_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisProKgr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProKgr_Internalname,GXutil.ltrim( localUtil.ntoc( A1525HisProKgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1525HisProKgr, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisProKgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtHisProKgr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisProMtr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A1526HisProMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1526HisProMtr, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisProMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtHisProMtr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisProNpzs_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProNpzs_Internalname,GXutil.ltrim( localUtil.ntoc( A4714HisProNpzs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4714HisProNpzs), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisProNpzs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtHisProNpzs_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtParCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParCod_Internalname,GXutil.ltrim( localUtil.ntoc( A656ParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A656ParCod), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtParCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtParCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtParCodNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParCodNom_Internalname,GXutil.rtrim( A867ParCodNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtParCodNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtParCodNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashesHO2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_30_idx = ((subGrid_Islastpage==1)&&(nGXsfl_30_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_30_idx+1) ;
         sGXsfl_30_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_30_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_302( ) ;
      }
      /* End function sendrow_302 */
   }

   public void startgridcontrol30( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"30\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMaqCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código Máquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMaqDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion Maquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisProFec_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisProLin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "#") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarNHdr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtGruOpeCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Operario", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarOrdLin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Orden", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtFase_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisProDTI_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Inicio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisProDTF_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fin", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisProF_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "F?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisProTur_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "T", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisProKgr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kgs", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisProMtr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Mts", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisProNpzs_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pcs", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtParCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Paro", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtParCodNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A602MaqCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMaqCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A606MaqDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMaqDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A558HisProFec, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisProFec_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A561HisProLin, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisProLin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13696BarNHdr));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarNHdr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A503GruOpeCod, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtGruOpeCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarOrdLin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A461Fase));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtFase_Visible, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A557HisProF));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisProF_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A566HisProTur, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisProTur_Visible, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4714HisProNpzs, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisProNpzs_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A656ParCod, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtParCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A867ParCodNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtParCodNom_Visible, (byte)(5), (byte)(0), ".", "")));
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
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtMaqCod_Internalname = sPrefix+"MAQCOD" ;
      edtMaqDsc_Internalname = sPrefix+"MAQDSC" ;
      edtHisProFec_Internalname = sPrefix+"HISPROFEC" ;
      edtHisProLin_Internalname = sPrefix+"HISPROLIN" ;
      edtBarNHdr_Internalname = sPrefix+"BARNHDR" ;
      edtGruOpeCod_Internalname = sPrefix+"GRUOPECOD" ;
      edtBarOrdLin_Internalname = sPrefix+"BARORDLIN" ;
      edtFase_Internalname = sPrefix+"FASE" ;
      edtHisProDTI_Internalname = sPrefix+"HISPRODTI" ;
      edtHisProDTF_Internalname = sPrefix+"HISPRODTF" ;
      edtHisProF_Internalname = sPrefix+"HISPROF" ;
      edtHisProTur_Internalname = sPrefix+"HISPROTUR" ;
      edtHisProKgr_Internalname = sPrefix+"HISPROKGR" ;
      edtHisProMtr_Internalname = sPrefix+"HISPROMTR" ;
      edtHisProNpzs_Internalname = sPrefix+"HISPRONPZS" ;
      edtParCod_Internalname = sPrefix+"PARCOD" ;
      edtParCodNom_Internalname = sPrefix+"PARCODNOM" ;
      edtBarCod_Internalname = sPrefix+"BARCOD" ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO" ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      edtEmprCod_Internalname = sPrefix+"EMPRCOD" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      edtavDdo_hisprofecauxdate_Internalname = sPrefix+"vDDO_HISPROFECAUXDATE" ;
      divDdo_hisprofecauxdates_Internalname = sPrefix+"DDO_HISPROFECAUXDATES" ;
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
      subGrid_Allowhovering = (byte)(-1) ;
      subGrid_Allowselection = (byte)(1) ;
      subGrid_Header = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      edtParCodNom_Jsonclick = "" ;
      edtParCod_Jsonclick = "" ;
      edtHisProNpzs_Jsonclick = "" ;
      edtHisProMtr_Jsonclick = "" ;
      edtHisProKgr_Jsonclick = "" ;
      edtHisProTur_Jsonclick = "" ;
      edtHisProF_Jsonclick = "" ;
      edtHisProDTF_Jsonclick = "" ;
      edtHisProDTI_Jsonclick = "" ;
      edtFase_Jsonclick = "" ;
      edtBarOrdLin_Jsonclick = "" ;
      edtGruOpeCod_Jsonclick = "" ;
      edtBarNHdr_Jsonclick = "" ;
      edtHisProLin_Jsonclick = "" ;
      edtHisProFec_Jsonclick = "" ;
      edtMaqDsc_Jsonclick = "" ;
      edtMaqCod_Jsonclick = "" ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtParCodNom_Visible = -1 ;
      edtParCod_Visible = -1 ;
      edtHisProNpzs_Visible = -1 ;
      edtHisProMtr_Visible = -1 ;
      edtHisProKgr_Visible = -1 ;
      edtHisProTur_Visible = -1 ;
      edtHisProF_Visible = -1 ;
      edtHisProDTF_Visible = -1 ;
      edtHisProDTI_Visible = -1 ;
      edtFase_Visible = -1 ;
      edtBarOrdLin_Visible = -1 ;
      edtGruOpeCod_Visible = -1 ;
      edtBarNHdr_Visible = -1 ;
      edtHisProLin_Visible = -1 ;
      edtHisProFec_Visible = -1 ;
      edtMaqDsc_Visible = -1 ;
      edtMaqCod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_hisprodtfauxdate_Jsonclick = "" ;
      edtavDdo_hisprodtiauxdate_Jsonclick = "" ;
      edtavDdo_hisprofecauxdate_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Visible = 1 ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "WCPartesProduccionGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic|Dynamic|||Dynamic|||Dynamic|||Dynamic||||||Dynamic" ;
      Ddo_grid_Includedatalist = "T|T|||T|||T|||T||||||T" ;
      Ddo_grid_Filterisrange = "|||T||T|T|||||T|T|T|T|T|" ;
      Ddo_grid_Filtertype = "Character|Character|Date|Numeric|Character|Numeric|Numeric|Character|Date|Date|Character|Numeric|Numeric|Numeric|Numeric|Numeric|Character" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T|T|T||T|T|T|T|T|T|T|T|T|T|T|T" ;
      Ddo_grid_Columnssortvalues = "1|2|1|3||4|5|6|7|8|9|10|11|12|13|14|15" ;
      Ddo_grid_Columnids = "0:MaqCod|1:MaqDsc|2:HisProFec|3:HisProLin|4:BarNHdr|5:GruOpeCod|6:BarOrdLin|7:Fase|8:HisProDTI|9:HisProDTF|10:HisProF|11:HisProTur|12:HisProKgr|13:HisProMtr|14:HisProNpzs|15:ParCod|16:ParCodNom" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV99Wcpartesproduccionds_1_emprcod',fld:'vWCPARTESPRODUCCIONDS_1_EMPRCOD',pic:'@!'},{av:'AV100Wcpartesproduccionds_2_maqcod',fld:'vWCPARTESPRODUCCIONDS_2_MAQCOD',pic:''},{av:'AV101Wcpartesproduccionds_3_hisprofec',fld:'vWCPARTESPRODUCCIONDS_3_HISPROFEC',pic:''},{av:'sPrefix'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV90EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV91MaqCod',fld:'vMAQCOD',pic:''},{av:'AV92Hisprofec',fld:'vHISPROFEC',pic:''},{av:'AV26TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV27TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV42TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV43TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV29TFHisProFec',fld:'vTFHISPROFEC',pic:''},{av:'AV34TFHisProLin',fld:'vTFHISPROLIN',pic:'ZZZZZZZ9'},{av:'AV35TFHisProLin_To',fld:'vTFHISPROLIN_TO',pic:'ZZZZZZZ9'},{av:'AV45TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV46TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV48TFGruOpeCod',fld:'vTFGRUOPECOD',pic:'ZZZZZ9'},{av:'AV49TFGruOpeCod_To',fld:'vTFGRUOPECOD_TO',pic:'ZZZZZ9'},{av:'AV51TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV52TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV54TFFase',fld:'vTFFASE',pic:''},{av:'AV55TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV60TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV65TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV70TFHisProF',fld:'vTFHISPROF',pic:'@!'},{av:'AV71TFHisProF_Sel',fld:'vTFHISPROF_SEL',pic:'@!'},{av:'AV73TFHisProTur',fld:'vTFHISPROTUR',pic:'9'},{av:'AV74TFHisProTur_To',fld:'vTFHISPROTUR_TO',pic:'9'},{av:'AV76TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV77TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV79TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV80TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV82TFHisProNpzs',fld:'vTFHISPRONPZS',pic:'ZZZ9'},{av:'AV83TFHisProNpzs_To',fld:'vTFHISPRONPZS_TO',pic:'ZZZ9'},{av:'AV85TFParCod',fld:'vTFPARCOD',pic:'ZZZ9'},{av:'AV86TFParCod_To',fld:'vTFPARCOD_TO',pic:'ZZZ9'},{av:'AV88TFParCodNom',fld:'vTFPARCODNOM',pic:''},{av:'AV89TFParCodNom_Sel',fld:'vTFPARCODNOM_SEL',pic:''},{av:'AV133Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtMaqCod_Visible',ctrl:'MAQCOD',prop:'Visible'},{av:'edtMaqDsc_Visible',ctrl:'MAQDSC',prop:'Visible'},{av:'edtHisProFec_Visible',ctrl:'HISPROFEC',prop:'Visible'},{av:'edtHisProLin_Visible',ctrl:'HISPROLIN',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtGruOpeCod_Visible',ctrl:'GRUOPECOD',prop:'Visible'},{av:'edtBarOrdLin_Visible',ctrl:'BARORDLIN',prop:'Visible'},{av:'edtFase_Visible',ctrl:'FASE',prop:'Visible'},{av:'edtHisProDTI_Visible',ctrl:'HISPRODTI',prop:'Visible'},{av:'edtHisProDTF_Visible',ctrl:'HISPRODTF',prop:'Visible'},{av:'edtHisProF_Visible',ctrl:'HISPROF',prop:'Visible'},{av:'edtHisProTur_Visible',ctrl:'HISPROTUR',prop:'Visible'},{av:'edtHisProKgr_Visible',ctrl:'HISPROKGR',prop:'Visible'},{av:'edtHisProMtr_Visible',ctrl:'HISPROMTR',prop:'Visible'},{av:'edtHisProNpzs_Visible',ctrl:'HISPRONPZS',prop:'Visible'},{av:'edtParCod_Visible',ctrl:'PARCOD',prop:'Visible'},{av:'edtParCodNom_Visible',ctrl:'PARCODNOM',prop:'Visible'},{av:'AV39GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV40GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e11HO2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV90EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV91MaqCod',fld:'vMAQCOD',pic:''},{av:'AV92Hisprofec',fld:'vHISPROFEC',pic:''},{av:'AV26TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV27TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV42TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV43TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV29TFHisProFec',fld:'vTFHISPROFEC',pic:''},{av:'AV34TFHisProLin',fld:'vTFHISPROLIN',pic:'ZZZZZZZ9'},{av:'AV35TFHisProLin_To',fld:'vTFHISPROLIN_TO',pic:'ZZZZZZZ9'},{av:'AV45TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV46TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV48TFGruOpeCod',fld:'vTFGRUOPECOD',pic:'ZZZZZ9'},{av:'AV49TFGruOpeCod_To',fld:'vTFGRUOPECOD_TO',pic:'ZZZZZ9'},{av:'AV51TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV52TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV54TFFase',fld:'vTFFASE',pic:''},{av:'AV55TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV60TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV65TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV70TFHisProF',fld:'vTFHISPROF',pic:'@!'},{av:'AV71TFHisProF_Sel',fld:'vTFHISPROF_SEL',pic:'@!'},{av:'AV73TFHisProTur',fld:'vTFHISPROTUR',pic:'9'},{av:'AV74TFHisProTur_To',fld:'vTFHISPROTUR_TO',pic:'9'},{av:'AV76TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV77TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV79TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV80TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV82TFHisProNpzs',fld:'vTFHISPRONPZS',pic:'ZZZ9'},{av:'AV83TFHisProNpzs_To',fld:'vTFHISPRONPZS_TO',pic:'ZZZ9'},{av:'AV85TFParCod',fld:'vTFPARCOD',pic:'ZZZ9'},{av:'AV86TFParCod_To',fld:'vTFPARCOD_TO',pic:'ZZZ9'},{av:'AV88TFParCodNom',fld:'vTFPARCODNOM',pic:''},{av:'AV89TFParCodNom_Sel',fld:'vTFPARCODNOM_SEL',pic:''},{av:'AV133Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV99Wcpartesproduccionds_1_emprcod',fld:'vWCPARTESPRODUCCIONDS_1_EMPRCOD',pic:'@!'},{av:'AV100Wcpartesproduccionds_2_maqcod',fld:'vWCPARTESPRODUCCIONDS_2_MAQCOD',pic:''},{av:'AV101Wcpartesproduccionds_3_hisprofec',fld:'vWCPARTESPRODUCCIONDS_3_HISPROFEC',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e12HO2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV90EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV91MaqCod',fld:'vMAQCOD',pic:''},{av:'AV92Hisprofec',fld:'vHISPROFEC',pic:''},{av:'AV26TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV27TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV42TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV43TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV29TFHisProFec',fld:'vTFHISPROFEC',pic:''},{av:'AV34TFHisProLin',fld:'vTFHISPROLIN',pic:'ZZZZZZZ9'},{av:'AV35TFHisProLin_To',fld:'vTFHISPROLIN_TO',pic:'ZZZZZZZ9'},{av:'AV45TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV46TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV48TFGruOpeCod',fld:'vTFGRUOPECOD',pic:'ZZZZZ9'},{av:'AV49TFGruOpeCod_To',fld:'vTFGRUOPECOD_TO',pic:'ZZZZZ9'},{av:'AV51TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV52TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV54TFFase',fld:'vTFFASE',pic:''},{av:'AV55TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV60TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV65TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV70TFHisProF',fld:'vTFHISPROF',pic:'@!'},{av:'AV71TFHisProF_Sel',fld:'vTFHISPROF_SEL',pic:'@!'},{av:'AV73TFHisProTur',fld:'vTFHISPROTUR',pic:'9'},{av:'AV74TFHisProTur_To',fld:'vTFHISPROTUR_TO',pic:'9'},{av:'AV76TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV77TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV79TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV80TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV82TFHisProNpzs',fld:'vTFHISPRONPZS',pic:'ZZZ9'},{av:'AV83TFHisProNpzs_To',fld:'vTFHISPRONPZS_TO',pic:'ZZZ9'},{av:'AV85TFParCod',fld:'vTFPARCOD',pic:'ZZZ9'},{av:'AV86TFParCod_To',fld:'vTFPARCOD_TO',pic:'ZZZ9'},{av:'AV88TFParCodNom',fld:'vTFPARCODNOM',pic:''},{av:'AV89TFParCodNom_Sel',fld:'vTFPARCODNOM_SEL',pic:''},{av:'AV133Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV99Wcpartesproduccionds_1_emprcod',fld:'vWCPARTESPRODUCCIONDS_1_EMPRCOD',pic:'@!'},{av:'AV100Wcpartesproduccionds_2_maqcod',fld:'vWCPARTESPRODUCCIONDS_2_MAQCOD',pic:''},{av:'AV101Wcpartesproduccionds_3_hisprofec',fld:'vWCPARTESPRODUCCIONDS_3_HISPROFEC',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e13HO2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV90EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV91MaqCod',fld:'vMAQCOD',pic:''},{av:'AV92Hisprofec',fld:'vHISPROFEC',pic:''},{av:'AV26TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV27TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV42TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV43TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV29TFHisProFec',fld:'vTFHISPROFEC',pic:''},{av:'AV34TFHisProLin',fld:'vTFHISPROLIN',pic:'ZZZZZZZ9'},{av:'AV35TFHisProLin_To',fld:'vTFHISPROLIN_TO',pic:'ZZZZZZZ9'},{av:'AV45TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV46TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV48TFGruOpeCod',fld:'vTFGRUOPECOD',pic:'ZZZZZ9'},{av:'AV49TFGruOpeCod_To',fld:'vTFGRUOPECOD_TO',pic:'ZZZZZ9'},{av:'AV51TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV52TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV54TFFase',fld:'vTFFASE',pic:''},{av:'AV55TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV60TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV65TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV70TFHisProF',fld:'vTFHISPROF',pic:'@!'},{av:'AV71TFHisProF_Sel',fld:'vTFHISPROF_SEL',pic:'@!'},{av:'AV73TFHisProTur',fld:'vTFHISPROTUR',pic:'9'},{av:'AV74TFHisProTur_To',fld:'vTFHISPROTUR_TO',pic:'9'},{av:'AV76TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV77TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV79TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV80TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV82TFHisProNpzs',fld:'vTFHISPRONPZS',pic:'ZZZ9'},{av:'AV83TFHisProNpzs_To',fld:'vTFHISPRONPZS_TO',pic:'ZZZ9'},{av:'AV85TFParCod',fld:'vTFPARCOD',pic:'ZZZ9'},{av:'AV86TFParCod_To',fld:'vTFPARCOD_TO',pic:'ZZZ9'},{av:'AV88TFParCodNom',fld:'vTFPARCODNOM',pic:''},{av:'AV89TFParCodNom_Sel',fld:'vTFPARCODNOM_SEL',pic:''},{av:'AV133Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV99Wcpartesproduccionds_1_emprcod',fld:'vWCPARTESPRODUCCIONDS_1_EMPRCOD',pic:'@!'},{av:'AV100Wcpartesproduccionds_2_maqcod',fld:'vWCPARTESPRODUCCIONDS_2_MAQCOD',pic:''},{av:'AV101Wcpartesproduccionds_3_hisprofec',fld:'vWCPARTESPRODUCCIONDS_3_HISPROFEC',pic:''},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV88TFParCodNom',fld:'vTFPARCODNOM',pic:''},{av:'AV89TFParCodNom_Sel',fld:'vTFPARCODNOM_SEL',pic:''},{av:'AV85TFParCod',fld:'vTFPARCOD',pic:'ZZZ9'},{av:'AV86TFParCod_To',fld:'vTFPARCOD_TO',pic:'ZZZ9'},{av:'AV82TFHisProNpzs',fld:'vTFHISPRONPZS',pic:'ZZZ9'},{av:'AV83TFHisProNpzs_To',fld:'vTFHISPRONPZS_TO',pic:'ZZZ9'},{av:'AV79TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV80TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV76TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV77TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV73TFHisProTur',fld:'vTFHISPROTUR',pic:'9'},{av:'AV74TFHisProTur_To',fld:'vTFHISPROTUR_TO',pic:'9'},{av:'AV70TFHisProF',fld:'vTFHISPROF',pic:'@!'},{av:'AV71TFHisProF_Sel',fld:'vTFHISPROF_SEL',pic:'@!'},{av:'AV65TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV60TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV54TFFase',fld:'vTFFASE',pic:''},{av:'AV55TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV51TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV52TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV48TFGruOpeCod',fld:'vTFGRUOPECOD',pic:'ZZZZZ9'},{av:'AV49TFGruOpeCod_To',fld:'vTFGRUOPECOD_TO',pic:'ZZZZZ9'},{av:'AV45TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV46TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV34TFHisProLin',fld:'vTFHISPROLIN',pic:'ZZZZZZZ9'},{av:'AV35TFHisProLin_To',fld:'vTFHISPROLIN_TO',pic:'ZZZZZZZ9'},{av:'AV29TFHisProFec',fld:'vTFHISPROFEC',pic:''},{av:'AV42TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV43TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV26TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV27TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e19HO2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e14HO2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV90EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV91MaqCod',fld:'vMAQCOD',pic:''},{av:'AV92Hisprofec',fld:'vHISPROFEC',pic:''},{av:'AV26TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV27TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV42TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV43TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV29TFHisProFec',fld:'vTFHISPROFEC',pic:''},{av:'AV34TFHisProLin',fld:'vTFHISPROLIN',pic:'ZZZZZZZ9'},{av:'AV35TFHisProLin_To',fld:'vTFHISPROLIN_TO',pic:'ZZZZZZZ9'},{av:'AV45TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV46TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV48TFGruOpeCod',fld:'vTFGRUOPECOD',pic:'ZZZZZ9'},{av:'AV49TFGruOpeCod_To',fld:'vTFGRUOPECOD_TO',pic:'ZZZZZ9'},{av:'AV51TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV52TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV54TFFase',fld:'vTFFASE',pic:''},{av:'AV55TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV60TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV65TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV70TFHisProF',fld:'vTFHISPROF',pic:'@!'},{av:'AV71TFHisProF_Sel',fld:'vTFHISPROF_SEL',pic:'@!'},{av:'AV73TFHisProTur',fld:'vTFHISPROTUR',pic:'9'},{av:'AV74TFHisProTur_To',fld:'vTFHISPROTUR_TO',pic:'9'},{av:'AV76TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV77TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV79TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV80TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV82TFHisProNpzs',fld:'vTFHISPRONPZS',pic:'ZZZ9'},{av:'AV83TFHisProNpzs_To',fld:'vTFHISPRONPZS_TO',pic:'ZZZ9'},{av:'AV85TFParCod',fld:'vTFPARCOD',pic:'ZZZ9'},{av:'AV86TFParCod_To',fld:'vTFPARCOD_TO',pic:'ZZZ9'},{av:'AV88TFParCodNom',fld:'vTFPARCODNOM',pic:''},{av:'AV89TFParCodNom_Sel',fld:'vTFPARCODNOM_SEL',pic:''},{av:'AV133Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV99Wcpartesproduccionds_1_emprcod',fld:'vWCPARTESPRODUCCIONDS_1_EMPRCOD',pic:'@!'},{av:'AV100Wcpartesproduccionds_2_maqcod',fld:'vWCPARTESPRODUCCIONDS_2_MAQCOD',pic:''},{av:'AV101Wcpartesproduccionds_3_hisprofec',fld:'vWCPARTESPRODUCCIONDS_3_HISPROFEC',pic:''},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtMaqCod_Visible',ctrl:'MAQCOD',prop:'Visible'},{av:'edtMaqDsc_Visible',ctrl:'MAQDSC',prop:'Visible'},{av:'edtHisProFec_Visible',ctrl:'HISPROFEC',prop:'Visible'},{av:'edtHisProLin_Visible',ctrl:'HISPROLIN',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtGruOpeCod_Visible',ctrl:'GRUOPECOD',prop:'Visible'},{av:'edtBarOrdLin_Visible',ctrl:'BARORDLIN',prop:'Visible'},{av:'edtFase_Visible',ctrl:'FASE',prop:'Visible'},{av:'edtHisProDTI_Visible',ctrl:'HISPRODTI',prop:'Visible'},{av:'edtHisProDTF_Visible',ctrl:'HISPRODTF',prop:'Visible'},{av:'edtHisProF_Visible',ctrl:'HISPROF',prop:'Visible'},{av:'edtHisProTur_Visible',ctrl:'HISPROTUR',prop:'Visible'},{av:'edtHisProKgr_Visible',ctrl:'HISPROKGR',prop:'Visible'},{av:'edtHisProMtr_Visible',ctrl:'HISPROMTR',prop:'Visible'},{av:'edtHisProNpzs_Visible',ctrl:'HISPRONPZS',prop:'Visible'},{av:'edtParCod_Visible',ctrl:'PARCOD',prop:'Visible'},{av:'edtParCodNom_Visible',ctrl:'PARCODNOM',prop:'Visible'},{av:'AV39GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV40GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e15HO2',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e16HO2',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_MAQCOD","{handler:'valid_Maqcod',iparms:[]");
      setEventMetadata("VALID_MAQCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Barcodpar',iparms:[]");
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
      wcpOAV90EmprCod = "" ;
      wcpOAV91MaqCod = "" ;
      wcpOAV92Hisprofec = GXutil.nullDate() ;
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
      AV90EmprCod = "" ;
      AV91MaqCod = "" ;
      AV92Hisprofec = GXutil.nullDate() ;
      AV19ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV26TFMaqCod = "" ;
      AV27TFMaqCod_Sel = "" ;
      AV42TFMaqDsc = "" ;
      AV43TFMaqDsc_Sel = "" ;
      AV29TFHisProFec = GXutil.nullDate() ;
      AV45TFBarNHdr = "" ;
      AV46TFBarNHdr_Sel = "" ;
      AV54TFFase = "" ;
      AV55TFFase_Sel = "" ;
      AV60TFHisProDTI = GXutil.resetTime( GXutil.nullDate() );
      AV65TFHisProDTF = GXutil.resetTime( GXutil.nullDate() );
      AV70TFHisProF = "" ;
      AV71TFHisProF_Sel = "" ;
      AV76TFHisProKgr = DecimalUtil.ZERO ;
      AV77TFHisProKgr_To = DecimalUtil.ZERO ;
      AV79TFHisProMtr = DecimalUtil.ZERO ;
      AV80TFHisProMtr_To = DecimalUtil.ZERO ;
      AV88TFParCodNom = "" ;
      AV89TFParCodNom_Sel = "" ;
      AV133Pgmname = "" ;
      AV99Wcpartesproduccionds_1_emprcod = "" ;
      AV100Wcpartesproduccionds_2_maqcod = "" ;
      AV101Wcpartesproduccionds_3_hisprofec = GXutil.nullDate() ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV37DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
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
      AV31DDO_HisProFecAuxDate = GXutil.nullDate() ;
      AV62DDO_HisProDTIAuxDate = GXutil.nullDate() ;
      AV67DDO_HisProDTFAuxDate = GXutil.nullDate() ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      A558HisProFec = GXutil.nullDate() ;
      A13696BarNHdr = "" ;
      A461Fase = "" ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A557HisProF = "" ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A867ParCodNom = "" ;
      A130BarCodPar = "" ;
      scmdbuf = "" ;
      lV102Wcpartesproduccionds_4_tfmaqcod = "" ;
      lV104Wcpartesproduccionds_6_tfmaqdsc = "" ;
      AV103Wcpartesproduccionds_5_tfmaqcod_sel = "" ;
      AV102Wcpartesproduccionds_4_tfmaqcod = "" ;
      AV105Wcpartesproduccionds_7_tfmaqdsc_sel = "" ;
      AV104Wcpartesproduccionds_6_tfmaqdsc = "" ;
      AV106Wcpartesproduccionds_8_tfhisprofec = GXutil.nullDate() ;
      AV110Wcpartesproduccionds_12_tfbarnhdr_sel = "" ;
      AV109Wcpartesproduccionds_11_tfbarnhdr = "" ;
      AV116Wcpartesproduccionds_18_tffase_sel = "" ;
      AV115Wcpartesproduccionds_17_tffase = "" ;
      AV117Wcpartesproduccionds_19_tfhisprodti = GXutil.resetTime( GXutil.nullDate() );
      AV118Wcpartesproduccionds_20_tfhisprodtf = GXutil.resetTime( GXutil.nullDate() );
      AV120Wcpartesproduccionds_22_tfhisprof_sel = "" ;
      AV119Wcpartesproduccionds_21_tfhisprof = "" ;
      AV123Wcpartesproduccionds_25_tfhisprokgr = DecimalUtil.ZERO ;
      AV124Wcpartesproduccionds_26_tfhisprokgr_to = DecimalUtil.ZERO ;
      AV125Wcpartesproduccionds_27_tfhispromtr = DecimalUtil.ZERO ;
      AV126Wcpartesproduccionds_28_tfhispromtr_to = DecimalUtil.ZERO ;
      AV132Wcpartesproduccionds_34_tfparcodnom_sel = "" ;
      AV131Wcpartesproduccionds_33_tfparcodnom = "" ;
      H00HO2_A396EmprCod = new String[] {""} ;
      H00HO2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      H00HO2_A606MaqDsc = new String[] {""} ;
      H00HO2_n606MaqDsc = new boolean[] {false} ;
      H00HO2_A602MaqCod = new String[] {""} ;
      H00HO3_AGRID_nRecordCount = new long[1] ;
      AV96Station = "" ;
      AV97Emprnom = "" ;
      AV98Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV21Session = httpContext.getWebSession();
      AV17ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV15ExcelFilename = "" ;
      AV16ErrorMessage = "" ;
      AV18UserCustomValue = "" ;
      AV20ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
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
      sCtrlAV90EmprCod = "" ;
      sCtrlAV91MaqCod = "" ;
      sCtrlAV92Hisprofec = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcpartesproduccion__default(),
         new Object[] {
             new Object[] {
            H00HO2_A396EmprCod, H00HO2_A558HisProFec, H00HO2_A606MaqDsc, H00HO2_n606MaqDsc, H00HO2_A602MaqCod
            }
            , new Object[] {
            H00HO3_AGRID_nRecordCount
            }
         }
      );
      AV133Pgmname = "WCPartesProduccion" ;
      /* GeneXus formulas. */
      AV133Pgmname = "WCPartesProduccion" ;
      Gx_err = (short)(0) ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV73TFHisProTur ;
   private byte AV74TFHisProTur_To ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A566HisProTur ;
   private byte A132BarCodReo ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV121Wcpartesproduccionds_23_tfhisprotur ;
   private byte AV122Wcpartesproduccionds_24_tfhisprotur_to ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV51TFBarOrdLin ;
   private short AV52TFBarOrdLin_To ;
   private short AV82TFHisProNpzs ;
   private short AV83TFHisProNpzs_To ;
   private short AV85TFParCod ;
   private short AV86TFParCod_To ;
   private short AV12OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short A194BarOrdLin ;
   private short A4714HisProNpzs ;
   private short A656ParCod ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV113Wcpartesproduccionds_15_tfbarordlin ;
   private short AV114Wcpartesproduccionds_16_tfbarordlin_to ;
   private short AV127Wcpartesproduccionds_29_tfhispronpzs ;
   private short AV128Wcpartesproduccionds_30_tfhispronpzs_to ;
   private short AV129Wcpartesproduccionds_31_tfparcod ;
   private short AV130Wcpartesproduccionds_32_tfparcod_to ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_30 ;
   private int nGXsfl_30_idx=1 ;
   private int AV34TFHisProLin ;
   private int AV35TFHisProLin_To ;
   private int AV48TFGruOpeCod ;
   private int AV49TFGruOpeCod_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtEmprCod_Visible ;
   private int A561HisProLin ;
   private int A503GruOpeCod ;
   private int A129BarCod ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV107Wcpartesproduccionds_9_tfhisprolin ;
   private int AV108Wcpartesproduccionds_10_tfhisprolin_to ;
   private int AV111Wcpartesproduccionds_13_tfgruopecod ;
   private int AV112Wcpartesproduccionds_14_tfgruopecod_to ;
   private int edtMaqCod_Visible ;
   private int edtMaqDsc_Visible ;
   private int edtHisProFec_Visible ;
   private int edtHisProLin_Visible ;
   private int edtBarNHdr_Visible ;
   private int edtGruOpeCod_Visible ;
   private int edtBarOrdLin_Visible ;
   private int edtFase_Visible ;
   private int edtHisProDTI_Visible ;
   private int edtHisProDTF_Visible ;
   private int edtHisProF_Visible ;
   private int edtHisProTur_Visible ;
   private int edtHisProKgr_Visible ;
   private int edtHisProMtr_Visible ;
   private int edtHisProNpzs_Visible ;
   private int edtParCod_Visible ;
   private int edtParCodNom_Visible ;
   private int AV38PageToGo ;
   private int AV134GXV1 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV39GridCurrentPage ;
   private long AV40GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV76TFHisProKgr ;
   private java.math.BigDecimal AV77TFHisProKgr_To ;
   private java.math.BigDecimal AV79TFHisProMtr ;
   private java.math.BigDecimal AV80TFHisProMtr_To ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal AV123Wcpartesproduccionds_25_tfhisprokgr ;
   private java.math.BigDecimal AV124Wcpartesproduccionds_26_tfhisprokgr_to ;
   private java.math.BigDecimal AV125Wcpartesproduccionds_27_tfhispromtr ;
   private java.math.BigDecimal AV126Wcpartesproduccionds_28_tfhispromtr_to ;
   private String wcpOAV90EmprCod ;
   private String wcpOAV91MaqCod ;
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
   private String AV90EmprCod ;
   private String AV91MaqCod ;
   private String sGXsfl_30_idx="0001" ;
   private String AV26TFMaqCod ;
   private String AV27TFMaqCod_Sel ;
   private String AV42TFMaqDsc ;
   private String AV43TFMaqDsc_Sel ;
   private String AV45TFBarNHdr ;
   private String AV46TFBarNHdr_Sel ;
   private String AV54TFFase ;
   private String AV55TFFase_Sel ;
   private String AV70TFHisProF ;
   private String AV71TFHisProF_Sel ;
   private String AV88TFParCodNom ;
   private String AV89TFParCodNom_Sel ;
   private String AV133Pgmname ;
   private String AV99Wcpartesproduccionds_1_emprcod ;
   private String AV100Wcpartesproduccionds_2_maqcod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
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
   private String divDdo_hisprofecauxdates_Internalname ;
   private String edtavDdo_hisprofecauxdate_Internalname ;
   private String edtavDdo_hisprofecauxdate_Jsonclick ;
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
   private String A602MaqCod ;
   private String edtMaqCod_Internalname ;
   private String A606MaqDsc ;
   private String edtMaqDsc_Internalname ;
   private String edtHisProFec_Internalname ;
   private String edtHisProLin_Internalname ;
   private String A13696BarNHdr ;
   private String edtBarNHdr_Internalname ;
   private String edtGruOpeCod_Internalname ;
   private String edtBarOrdLin_Internalname ;
   private String A461Fase ;
   private String edtFase_Internalname ;
   private String edtHisProDTI_Internalname ;
   private String edtHisProDTF_Internalname ;
   private String A557HisProF ;
   private String edtHisProF_Internalname ;
   private String edtHisProTur_Internalname ;
   private String edtHisProKgr_Internalname ;
   private String edtHisProMtr_Internalname ;
   private String edtHisProNpzs_Internalname ;
   private String edtParCod_Internalname ;
   private String A867ParCodNom ;
   private String edtParCodNom_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String A130BarCodPar ;
   private String edtBarCodPar_Internalname ;
   private String scmdbuf ;
   private String lV102Wcpartesproduccionds_4_tfmaqcod ;
   private String lV104Wcpartesproduccionds_6_tfmaqdsc ;
   private String AV103Wcpartesproduccionds_5_tfmaqcod_sel ;
   private String AV102Wcpartesproduccionds_4_tfmaqcod ;
   private String AV105Wcpartesproduccionds_7_tfmaqdsc_sel ;
   private String AV104Wcpartesproduccionds_6_tfmaqdsc ;
   private String AV110Wcpartesproduccionds_12_tfbarnhdr_sel ;
   private String AV109Wcpartesproduccionds_11_tfbarnhdr ;
   private String AV116Wcpartesproduccionds_18_tffase_sel ;
   private String AV115Wcpartesproduccionds_17_tffase ;
   private String AV120Wcpartesproduccionds_22_tfhisprof_sel ;
   private String AV119Wcpartesproduccionds_21_tfhisprof ;
   private String AV132Wcpartesproduccionds_34_tfparcodnom_sel ;
   private String AV131Wcpartesproduccionds_33_tfparcodnom ;
   private String AV96Station ;
   private String AV97Emprnom ;
   private String AV98Usurcod ;
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
   private String sCtrlAV90EmprCod ;
   private String sCtrlAV91MaqCod ;
   private String sCtrlAV92Hisprofec ;
   private String sGXsfl_30_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtMaqCod_Jsonclick ;
   private String edtMaqDsc_Jsonclick ;
   private String edtHisProFec_Jsonclick ;
   private String edtHisProLin_Jsonclick ;
   private String edtBarNHdr_Jsonclick ;
   private String edtGruOpeCod_Jsonclick ;
   private String edtBarOrdLin_Jsonclick ;
   private String edtFase_Jsonclick ;
   private String edtHisProDTI_Jsonclick ;
   private String edtHisProDTF_Jsonclick ;
   private String edtHisProF_Jsonclick ;
   private String edtHisProTur_Jsonclick ;
   private String edtHisProKgr_Jsonclick ;
   private String edtHisProMtr_Jsonclick ;
   private String edtHisProNpzs_Jsonclick ;
   private String edtParCod_Jsonclick ;
   private String edtParCodNom_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV60TFHisProDTI ;
   private java.util.Date AV65TFHisProDTF ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date AV117Wcpartesproduccionds_19_tfhisprodti ;
   private java.util.Date AV118Wcpartesproduccionds_20_tfhisprodtf ;
   private java.util.Date wcpOAV92Hisprofec ;
   private java.util.Date AV92Hisprofec ;
   private java.util.Date AV29TFHisProFec ;
   private java.util.Date AV101Wcpartesproduccionds_3_hisprofec ;
   private java.util.Date AV31DDO_HisProFecAuxDate ;
   private java.util.Date AV62DDO_HisProDTIAuxDate ;
   private java.util.Date AV67DDO_HisProDTFAuxDate ;
   private java.util.Date A558HisProFec ;
   private java.util.Date AV106Wcpartesproduccionds_8_tfhisprofec ;
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
   private boolean n606MaqDsc ;
   private boolean bGXsfl_30_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV17ColumnsSelectorXML ;
   private String AV18UserCustomValue ;
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
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private IDataStoreProvider pr_default ;
   private String[] H00HO2_A396EmprCod ;
   private java.util.Date[] H00HO2_A558HisProFec ;
   private String[] H00HO2_A606MaqDsc ;
   private boolean[] H00HO2_n606MaqDsc ;
   private String[] H00HO2_A602MaqCod ;
   private long[] H00HO3_AGRID_nRecordCount ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV9TrnContextAtt ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState18[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV19ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV37DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class wcpartesproduccion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00HO2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV103Wcpartesproduccionds_5_tfmaqcod_sel ,
                                          String AV102Wcpartesproduccionds_4_tfmaqcod ,
                                          String AV105Wcpartesproduccionds_7_tfmaqdsc_sel ,
                                          String AV104Wcpartesproduccionds_6_tfmaqdsc ,
                                          java.util.Date AV106Wcpartesproduccionds_8_tfhisprofec ,
                                          int AV107Wcpartesproduccionds_9_tfhisprolin ,
                                          int AV108Wcpartesproduccionds_10_tfhisprolin_to ,
                                          String AV110Wcpartesproduccionds_12_tfbarnhdr_sel ,
                                          String AV109Wcpartesproduccionds_11_tfbarnhdr ,
                                          int AV111Wcpartesproduccionds_13_tfgruopecod ,
                                          int AV112Wcpartesproduccionds_14_tfgruopecod_to ,
                                          short AV113Wcpartesproduccionds_15_tfbarordlin ,
                                          short AV114Wcpartesproduccionds_16_tfbarordlin_to ,
                                          String AV116Wcpartesproduccionds_18_tffase_sel ,
                                          String AV115Wcpartesproduccionds_17_tffase ,
                                          java.util.Date AV117Wcpartesproduccionds_19_tfhisprodti ,
                                          java.util.Date AV118Wcpartesproduccionds_20_tfhisprodtf ,
                                          String AV120Wcpartesproduccionds_22_tfhisprof_sel ,
                                          String AV119Wcpartesproduccionds_21_tfhisprof ,
                                          byte AV121Wcpartesproduccionds_23_tfhisprotur ,
                                          byte AV122Wcpartesproduccionds_24_tfhisprotur_to ,
                                          java.math.BigDecimal AV123Wcpartesproduccionds_25_tfhisprokgr ,
                                          java.math.BigDecimal AV124Wcpartesproduccionds_26_tfhisprokgr_to ,
                                          java.math.BigDecimal AV125Wcpartesproduccionds_27_tfhispromtr ,
                                          java.math.BigDecimal AV126Wcpartesproduccionds_28_tfhispromtr_to ,
                                          short AV127Wcpartesproduccionds_29_tfhispronpzs ,
                                          short AV128Wcpartesproduccionds_30_tfhispronpzs_to ,
                                          short AV129Wcpartesproduccionds_31_tfparcod ,
                                          short AV130Wcpartesproduccionds_32_tfparcod_to ,
                                          String AV132Wcpartesproduccionds_34_tfparcodnom_sel ,
                                          String AV131Wcpartesproduccionds_33_tfparcodnom ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          java.util.Date A558HisProFec ,
                                          int A561HisProLin ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A503GruOpeCod ,
                                          short A194BarOrdLin ,
                                          String A461Fase ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF ,
                                          String A557HisProF ,
                                          byte A566HisProTur ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          short A4714HisProNpzs ,
                                          short A656ParCod ,
                                          String A867ParCodNom ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV99Wcpartesproduccionds_1_emprcod ,
                                          String AV100Wcpartesproduccionds_2_maqcod ,
                                          java.util.Date AV101Wcpartesproduccionds_3_hisprofec ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int19 = new byte[13];
      Object[] GXv_Object20 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.EmprCod, T1.HisProFec, T2.MaqDsc, T1.MaqCod" ;
      sFromString = " FROM (TXPCHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MaqCod = ? and T1.HisProFec = ?)");
      if ( (GXutil.strcmp("", AV103Wcpartesproduccionds_5_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV102Wcpartesproduccionds_4_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Wcpartesproduccionds_5_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int19[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Wcpartesproduccionds_7_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV104Wcpartesproduccionds_6_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Wcpartesproduccionds_7_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int19[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV106Wcpartesproduccionds_8_tfhisprofec)) )
      {
         addWhere(sWhereString, "(T1.HisProFec >= ?)");
      }
      else
      {
         GXv_int19[7] = (byte)(1) ;
      }
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T1.HisProFec DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec, T2.MaqDsc" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T1.HisProFec DESC, T2.MaqDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T1.HisProFec DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T1.HisProFec DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T1.HisProFec DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T1.HisProFec DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T1.HisProFec DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T1.HisProFec DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T1.HisProFec DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T1.HisProFec DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T1.HisProFec DESC" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T1.HisProFec DESC" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T1.HisProFec DESC" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T1.HisProFec DESC" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T1.HisProFec DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object20[0] = scmdbuf ;
      GXv_Object20[1] = GXv_int19 ;
      return GXv_Object20 ;
   }

   protected Object[] conditional_H00HO3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV103Wcpartesproduccionds_5_tfmaqcod_sel ,
                                          String AV102Wcpartesproduccionds_4_tfmaqcod ,
                                          String AV105Wcpartesproduccionds_7_tfmaqdsc_sel ,
                                          String AV104Wcpartesproduccionds_6_tfmaqdsc ,
                                          java.util.Date AV106Wcpartesproduccionds_8_tfhisprofec ,
                                          int AV107Wcpartesproduccionds_9_tfhisprolin ,
                                          int AV108Wcpartesproduccionds_10_tfhisprolin_to ,
                                          String AV110Wcpartesproduccionds_12_tfbarnhdr_sel ,
                                          String AV109Wcpartesproduccionds_11_tfbarnhdr ,
                                          int AV111Wcpartesproduccionds_13_tfgruopecod ,
                                          int AV112Wcpartesproduccionds_14_tfgruopecod_to ,
                                          short AV113Wcpartesproduccionds_15_tfbarordlin ,
                                          short AV114Wcpartesproduccionds_16_tfbarordlin_to ,
                                          String AV116Wcpartesproduccionds_18_tffase_sel ,
                                          String AV115Wcpartesproduccionds_17_tffase ,
                                          java.util.Date AV117Wcpartesproduccionds_19_tfhisprodti ,
                                          java.util.Date AV118Wcpartesproduccionds_20_tfhisprodtf ,
                                          String AV120Wcpartesproduccionds_22_tfhisprof_sel ,
                                          String AV119Wcpartesproduccionds_21_tfhisprof ,
                                          byte AV121Wcpartesproduccionds_23_tfhisprotur ,
                                          byte AV122Wcpartesproduccionds_24_tfhisprotur_to ,
                                          java.math.BigDecimal AV123Wcpartesproduccionds_25_tfhisprokgr ,
                                          java.math.BigDecimal AV124Wcpartesproduccionds_26_tfhisprokgr_to ,
                                          java.math.BigDecimal AV125Wcpartesproduccionds_27_tfhispromtr ,
                                          java.math.BigDecimal AV126Wcpartesproduccionds_28_tfhispromtr_to ,
                                          short AV127Wcpartesproduccionds_29_tfhispronpzs ,
                                          short AV128Wcpartesproduccionds_30_tfhispronpzs_to ,
                                          short AV129Wcpartesproduccionds_31_tfparcod ,
                                          short AV130Wcpartesproduccionds_32_tfparcod_to ,
                                          String AV132Wcpartesproduccionds_34_tfparcodnom_sel ,
                                          String AV131Wcpartesproduccionds_33_tfparcodnom ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          java.util.Date A558HisProFec ,
                                          int A561HisProLin ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A503GruOpeCod ,
                                          short A194BarOrdLin ,
                                          String A461Fase ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF ,
                                          String A557HisProF ,
                                          byte A566HisProTur ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          short A4714HisProNpzs ,
                                          short A656ParCod ,
                                          String A867ParCodNom ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV99Wcpartesproduccionds_1_emprcod ,
                                          String AV100Wcpartesproduccionds_2_maqcod ,
                                          java.util.Date AV101Wcpartesproduccionds_3_hisprofec ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int21 = new byte[8];
      Object[] GXv_Object22 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPCHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MaqCod = ? and T1.HisProFec = ?)");
      if ( (GXutil.strcmp("", AV103Wcpartesproduccionds_5_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV102Wcpartesproduccionds_4_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Wcpartesproduccionds_5_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int21[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Wcpartesproduccionds_7_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV104Wcpartesproduccionds_6_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Wcpartesproduccionds_7_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int21[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV106Wcpartesproduccionds_8_tfhisprofec)) )
      {
         addWhere(sWhereString, "(T1.HisProFec >= ?)");
      }
      else
      {
         GXv_int21[7] = (byte)(1) ;
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
      else if ( ( AV12OrderedBy == 15 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
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
                  return conditional_H00HO2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.util.Date)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (java.util.Date)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).shortValue() , (String)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , (String)dynConstraints[43] , ((Number) dynConstraints[44]).byteValue() , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , ((Number) dynConstraints[47]).shortValue() , ((Number) dynConstraints[48]).shortValue() , (String)dynConstraints[49] , ((Number) dynConstraints[50]).shortValue() , ((Boolean) dynConstraints[51]).booleanValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (java.util.Date)dynConstraints[54] , (String)dynConstraints[55] );
            case 1 :
                  return conditional_H00HO3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.util.Date)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (java.util.Date)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).shortValue() , (String)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , (String)dynConstraints[43] , ((Number) dynConstraints[44]).byteValue() , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , ((Number) dynConstraints[47]).shortValue() , ((Number) dynConstraints[48]).shortValue() , (String)dynConstraints[49] , ((Number) dynConstraints[50]).shortValue() , ((Boolean) dynConstraints[51]).booleanValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (java.util.Date)dynConstraints[54] , (String)dynConstraints[55] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00HO2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00HO3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
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
                  stmt.setString(sIdx, (String)parms[13], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[15]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[20]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[10]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[15]);
               }
               return;
      }
   }

}

