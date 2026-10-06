package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class activarhdr_wc_impl extends GXWebComponent
{
   public activarhdr_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public activarhdr_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( activarhdr_wc_impl.class ));
   }

   public activarhdr_wc_impl( int remoteHandle ,
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
      cmbavAcciones = new HTMLChoice();
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
               AV7Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Emprcod", AV7Emprcod);
               AV8DiaInicial = localUtil.parseDateParm( httpContext.GetPar( "DiaInicial")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8DiaInicial", localUtil.format(AV8DiaInicial, "99/99/99"));
               AV9DiaInicial_to = localUtil.parseDateParm( httpContext.GetPar( "DiaInicial_to")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9DiaInicial_to", localUtil.format(AV9DiaInicial_to, "99/99/99"));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV7Emprcod,AV8DiaInicial,AV9DiaInicial_to});
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
      AV7Emprcod = httpContext.GetPar( "Emprcod") ;
      AV8DiaInicial = localUtil.parseDateParm( httpContext.GetPar( "DiaInicial")) ;
      AV9DiaInicial_to = localUtil.parseDateParm( httpContext.GetPar( "DiaInicial_to")) ;
      AV28ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV23ColumnsSelector);
      AV18FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV29TFStp_Lin = (short)(GXutil.lval( httpContext.GetPar( "TFStp_Lin"))) ;
      AV30TFStp_Lin_To = (short)(GXutil.lval( httpContext.GetPar( "TFStp_Lin_To"))) ;
      AV31TFStp_Dia = localUtil.parseDTimeParm( httpContext.GetPar( "TFStp_Dia")) ;
      AV35TFStp_Mot = httpContext.GetPar( "TFStp_Mot") ;
      AV36TFStp_Mot_Sel = httpContext.GetPar( "TFStp_Mot_Sel") ;
      AV37TFStpHdr = httpContext.GetPar( "TFStpHdr") ;
      AV38TFStpHdr_Sel = httpContext.GetPar( "TFStpHdr_Sel") ;
      AV39TFStpClicod = (int)(GXutil.lval( httpContext.GetPar( "TFStpClicod"))) ;
      AV40TFStpClicod_To = (int)(GXutil.lval( httpContext.GetPar( "TFStpClicod_To"))) ;
      AV41TFStpCliNom = httpContext.GetPar( "TFStpCliNom") ;
      AV42TFStpCliNom_Sel = httpContext.GetPar( "TFStpCliNom_Sel") ;
      AV43TFStpBarser = httpContext.GetPar( "TFStpBarser") ;
      AV44TFStpBarser_Sel = httpContext.GetPar( "TFStpBarser_Sel") ;
      AV45TFStpBarserDsc = httpContext.GetPar( "TFStpBarserDsc") ;
      AV46TFStpBarserDsc_Sel = httpContext.GetPar( "TFStpBarserDsc_Sel") ;
      AV47TFStpColor = httpContext.GetPar( "TFStpColor") ;
      AV48TFStpColor_Sel = httpContext.GetPar( "TFStpColor_Sel") ;
      AV77Pgmname = httpContext.GetPar( "Pgmname") ;
      AV15OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV16OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV7Emprcod, AV8DiaInicial, AV9DiaInicial_to, AV28ManageFiltersExecutionStep, AV23ColumnsSelector, AV18FilterFullText, AV29TFStp_Lin, AV30TFStp_Lin_To, AV31TFStp_Dia, AV35TFStp_Mot, AV36TFStp_Mot_Sel, AV37TFStpHdr, AV38TFStpHdr_Sel, AV39TFStpClicod, AV40TFStpClicod_To, AV41TFStpCliNom, AV42TFStpCliNom_Sel, AV43TFStpBarser, AV44TFStpBarser_Sel, AV45TFStpBarserDsc, AV46TFStpBarserDsc_Sel, AV47TFStpColor, AV48TFStpColor_Sel, AV77Pgmname, AV15OrderedBy, AV16OrderedDsc, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1C12( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "HDRs Suspendidas", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.activarhdr_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV7Emprcod)),GXutil.URLEncode(GXutil.formatDateParm(AV8DiaInicial)),GXutil.URLEncode(GXutil.formatDateParm(AV9DiaInicial_to))}, new String[] {"Emprcod","DiaInicial","DiaInicial_to"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV77Pgmname, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_41", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_41, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV26ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV26ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV51GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV52GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV49DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV49DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV23ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV23ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7Emprcod", GXutil.rtrim( wcpOAV7Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8DiaInicial", localUtil.dtoc( wcpOAV8DiaInicial, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV9DiaInicial_to", localUtil.dtoc( wcpOAV9DiaInicial_to, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV28ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFSTP_LIN", GXutil.ltrim( localUtil.ntoc( AV29TFStp_Lin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFSTP_LIN_TO", GXutil.ltrim( localUtil.ntoc( AV30TFStp_Lin_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFSTP_DIA", localUtil.ttoc( AV31TFStp_Dia, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFSTP_MOT", AV35TFStp_Mot);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFSTP_MOT_SEL", AV36TFStp_Mot_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFSTPHDR", GXutil.rtrim( AV37TFStpHdr));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFSTPHDR_SEL", GXutil.rtrim( AV38TFStpHdr_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFSTPCLICOD", GXutil.ltrim( localUtil.ntoc( AV39TFStpClicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFSTPCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV40TFStpClicod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFSTPCLINOM", GXutil.rtrim( AV41TFStpCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFSTPCLINOM_SEL", GXutil.rtrim( AV42TFStpCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFSTPBARSER", GXutil.rtrim( AV43TFStpBarser));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFSTPBARSER_SEL", GXutil.rtrim( AV44TFStpBarser_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFSTPBARSERDSC", GXutil.rtrim( AV45TFStpBarserDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFSTPBARSERDSC_SEL", GXutil.rtrim( AV46TFStpBarserDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFSTPCOLOR", GXutil.rtrim( AV47TFStpColor));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFSTPCOLOR_SEL", GXutil.rtrim( AV48TFStpColor_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV77Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV77Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV15OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV16OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV7Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vDIAINICIAL", localUtil.dtoc( AV8DiaInicial, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vDIAINICIAL_TO", localUtil.dtoc( AV9DiaInicial_to, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"STP_EST", GXutil.ltrim( localUtil.ntoc( A10755Stp_Est, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV13GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV13GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUSURCOD", GXutil.rtrim( AV55UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSTATION", GXutil.rtrim( AV53Station));
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

   public void renderHtmlCloseForm1C12( )
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
      return "ActivarHdr_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "HDRs Suspendidas", "") ;
   }

   public void wb1C10( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.activarhdr_wc");
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ActivarHdr_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ActivarHdr_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ActivarHdr_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_23_1C12( true) ;
      }
      else
      {
         wb_table1_23_1C12( false) ;
      }
      return  ;
   }

   public void wb_table1_23_1C12e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV51GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV52GridPageCount);
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV49DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV49DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV23ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_stp_diaauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'" + sPrefix + "',false,'" + sGXsfl_41_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_stp_diaauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_stp_diaauxdate_Internalname, localUtil.format(AV33DDO_Stp_DiaAuxDate, "99/99/99"), localUtil.format( AV33DDO_Stp_DiaAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,65);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_stp_diaauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ActivarHdr_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_stp_diaauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ActivarHdr_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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

   public void start1C12( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "HDRs Suspendidas", ""), (short)(0)) ;
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
            strup1C10( ) ;
         }
      }
   }

   public void ws1C12( )
   {
      start1C12( ) ;
      evt1C12( ) ;
   }

   public void evt1C12( )
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
                              strup1C10( ) ;
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
                              strup1C10( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e111C12 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1C10( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e121C12 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1C10( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e131C12 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1C10( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e141C12 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1C10( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e151C12 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1C10( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e161C12 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1C10( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e171C12 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1C10( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = cmbavAcciones.getInternalname() ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 15), "VACCIONES.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 15), "VACCIONES.CLICK") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1C10( ) ;
                           }
                           nGXsfl_41_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_412( ) ;
                           cmbavAcciones.setName( cmbavAcciones.getInternalname() );
                           cmbavAcciones.setValue( httpContext.cgiGet( cmbavAcciones.getInternalname()) );
                           AV56Acciones = (short)(GXutil.lval( httpContext.cgiGet( cmbavAcciones.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavAcciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56Acciones), 4, 0));
                           A10750Stp_Lin = (short)(localUtil.ctol( httpContext.cgiGet( edtStp_Lin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A10751Stp_Dia = localUtil.ctot( httpContext.cgiGet( edtStp_Dia_Internalname), 0) ;
                           A10752Stp_Mot = httpContext.cgiGet( edtStp_Mot_Internalname) ;
                           A13723StpHdr = httpContext.cgiGet( edtStpHdr_Internalname) ;
                           A13726StpClicod = (int)(localUtil.ctol( httpContext.cgiGet( edtStpClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n13726StpClicod = false ;
                           A13727StpCliNom = httpContext.cgiGet( edtStpCliNom_Internalname) ;
                           n13727StpCliNom = false ;
                           A13724StpBarser = httpContext.cgiGet( edtStpBarser_Internalname) ;
                           n13724StpBarser = false ;
                           A13725StpBarserD = httpContext.cgiGet( edtStpBarserD_Internalname) ;
                           n13725StpBarserD = false ;
                           A13728StpColor = httpContext.cgiGet( edtStpColor_Internalname) ;
                           n13728StpColor = false ;
                           A10746Stp_hdr = (int)(localUtil.ctol( httpContext.cgiGet( edtStp_hdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A10747Stp_r = (byte)(localUtil.ctol( httpContext.cgiGet( edtStp_r_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A10748Stp_p = httpContext.cgiGet( edtStp_p_Internalname) ;
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
                                       GX_FocusControl = cmbavAcciones.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e181C12 ();
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
                                       GX_FocusControl = cmbavAcciones.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e191C12 ();
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
                                       GX_FocusControl = cmbavAcciones.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e201C12 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "VACCIONES.CLICK") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavAcciones.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e211C12 ();
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
                                    strup1C10( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavAcciones.getInternalname() ;
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

   public void we1C12( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1C12( ) ;
         }
      }
   }

   public void pa1C12( )
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
                                 String AV7Emprcod ,
                                 java.util.Date AV8DiaInicial ,
                                 java.util.Date AV9DiaInicial_to ,
                                 byte AV28ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelector ,
                                 String AV18FilterFullText ,
                                 short AV29TFStp_Lin ,
                                 short AV30TFStp_Lin_To ,
                                 java.util.Date AV31TFStp_Dia ,
                                 String AV35TFStp_Mot ,
                                 String AV36TFStp_Mot_Sel ,
                                 String AV37TFStpHdr ,
                                 String AV38TFStpHdr_Sel ,
                                 int AV39TFStpClicod ,
                                 int AV40TFStpClicod_To ,
                                 String AV41TFStpCliNom ,
                                 String AV42TFStpCliNom_Sel ,
                                 String AV43TFStpBarser ,
                                 String AV44TFStpBarser_Sel ,
                                 String AV45TFStpBarserDsc ,
                                 String AV46TFStpBarserDsc_Sel ,
                                 String AV47TFStpColor ,
                                 String AV48TFStpColor_Sel ,
                                 String AV77Pgmname ,
                                 short AV15OrderedBy ,
                                 boolean AV16OrderedDsc ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e191C12 ();
      GRID_nCurrentRecord = 0 ;
      rf1C12( ) ;
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
      rf1C12( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV77Pgmname = "ActivarHdr_WC" ;
      Gx_err = (short)(0) ;
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV59Activarhdr_wcds_1_filterfulltext = AV18FilterFullText ;
      AV60Activarhdr_wcds_2_tfstp_lin = AV29TFStp_Lin ;
      AV61Activarhdr_wcds_3_tfstp_lin_to = AV30TFStp_Lin_To ;
      AV62Activarhdr_wcds_4_tfstp_dia = AV31TFStp_Dia ;
      AV63Activarhdr_wcds_5_tfstp_mot = AV35TFStp_Mot ;
      AV64Activarhdr_wcds_6_tfstp_mot_sel = AV36TFStp_Mot_Sel ;
      AV65Activarhdr_wcds_7_tfstphdr = AV37TFStpHdr ;
      AV66Activarhdr_wcds_8_tfstphdr_sel = AV38TFStpHdr_Sel ;
      AV67Activarhdr_wcds_9_tfstpclicod = AV39TFStpClicod ;
      AV68Activarhdr_wcds_10_tfstpclicod_to = AV40TFStpClicod_To ;
      AV69Activarhdr_wcds_11_tfstpclinom = AV41TFStpCliNom ;
      AV70Activarhdr_wcds_12_tfstpclinom_sel = AV42TFStpCliNom_Sel ;
      AV71Activarhdr_wcds_13_tfstpbarser = AV43TFStpBarser ;
      AV72Activarhdr_wcds_14_tfstpbarser_sel = AV44TFStpBarser_Sel ;
      AV73Activarhdr_wcds_15_tfstpbarserdsc = AV45TFStpBarserDsc ;
      AV74Activarhdr_wcds_16_tfstpbarserdsc_sel = AV46TFStpBarserDsc_Sel ;
      AV75Activarhdr_wcds_17_tfstpcolor = AV47TFStpColor ;
      AV76Activarhdr_wcds_18_tfstpcolor_sel = AV48TFStpColor_Sel ;
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV60Activarhdr_wcds_2_tfstp_lin) ,
                                           Short.valueOf(AV61Activarhdr_wcds_3_tfstp_lin_to) ,
                                           AV62Activarhdr_wcds_4_tfstp_dia ,
                                           AV64Activarhdr_wcds_6_tfstp_mot_sel ,
                                           AV63Activarhdr_wcds_5_tfstp_mot ,
                                           AV66Activarhdr_wcds_8_tfstphdr_sel ,
                                           AV65Activarhdr_wcds_7_tfstphdr ,
                                           Short.valueOf(A10750Stp_Lin) ,
                                           A10751Stp_Dia ,
                                           A10752Stp_Mot ,
                                           Integer.valueOf(A10746Stp_hdr) ,
                                           Byte.valueOf(A10747Stp_r) ,
                                           A10748Stp_p ,
                                           Short.valueOf(AV15OrderedBy) ,
                                           Boolean.valueOf(AV16OrderedDsc) ,
                                           AV59Activarhdr_wcds_1_filterfulltext ,
                                           A13723StpHdr ,
                                           Integer.valueOf(A13726StpClicod) ,
                                           A13727StpCliNom ,
                                           A13724StpBarser ,
                                           A13725StpBarserD ,
                                           A13728StpColor ,
                                           Integer.valueOf(AV67Activarhdr_wcds_9_tfstpclicod) ,
                                           Integer.valueOf(AV68Activarhdr_wcds_10_tfstpclicod_to) ,
                                           AV70Activarhdr_wcds_12_tfstpclinom_sel ,
                                           AV69Activarhdr_wcds_11_tfstpclinom ,
                                           AV72Activarhdr_wcds_14_tfstpbarser_sel ,
                                           AV71Activarhdr_wcds_13_tfstpbarser ,
                                           AV74Activarhdr_wcds_16_tfstpbarserdsc_sel ,
                                           AV73Activarhdr_wcds_15_tfstpbarserdsc ,
                                           AV76Activarhdr_wcds_18_tfstpcolor_sel ,
                                           AV75Activarhdr_wcds_17_tfstpcolor ,
                                           AV8DiaInicial ,
                                           AV9DiaInicial_to ,
                                           AV7Emprcod ,
                                           A396EmprCod ,
                                           Byte.valueOf(A10755Stp_Est) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE
                                           }
      });
      lV59Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV59Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV59Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV59Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV59Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV59Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV59Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV59Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV69Activarhdr_wcds_11_tfstpclinom = GXutil.padr( GXutil.rtrim( AV69Activarhdr_wcds_11_tfstpclinom), 30, "%") ;
      lV71Activarhdr_wcds_13_tfstpbarser = GXutil.padr( GXutil.rtrim( AV71Activarhdr_wcds_13_tfstpbarser), 16, "%") ;
      lV73Activarhdr_wcds_15_tfstpbarserdsc = GXutil.padr( GXutil.rtrim( AV73Activarhdr_wcds_15_tfstpbarserdsc), 26, "%") ;
      lV75Activarhdr_wcds_17_tfstpcolor = GXutil.padr( GXutil.rtrim( AV75Activarhdr_wcds_17_tfstpcolor), 13, "%") ;
      lV63Activarhdr_wcds_5_tfstp_mot = GXutil.concat( GXutil.rtrim( AV63Activarhdr_wcds_5_tfstp_mot), "%", "") ;
      lV65Activarhdr_wcds_7_tfstphdr = GXutil.padr( GXutil.rtrim( AV65Activarhdr_wcds_7_tfstphdr), 11, "%") ;
      /* Using cursor H01C13 */
      pr_default.execute(0, new Object[] {AV7Emprcod, AV59Activarhdr_wcds_1_filterfulltext, lV59Activarhdr_wcds_1_filterfulltext, lV59Activarhdr_wcds_1_filterfulltext, lV59Activarhdr_wcds_1_filterfulltext, lV59Activarhdr_wcds_1_filterfulltext, lV59Activarhdr_wcds_1_filterfulltext, lV59Activarhdr_wcds_1_filterfulltext, lV59Activarhdr_wcds_1_filterfulltext, lV59Activarhdr_wcds_1_filterfulltext, Integer.valueOf(AV67Activarhdr_wcds_9_tfstpclicod), Integer.valueOf(AV67Activarhdr_wcds_9_tfstpclicod), Integer.valueOf(AV68Activarhdr_wcds_10_tfstpclicod_to), Integer.valueOf(AV68Activarhdr_wcds_10_tfstpclicod_to), AV70Activarhdr_wcds_12_tfstpclinom_sel, AV69Activarhdr_wcds_11_tfstpclinom, lV69Activarhdr_wcds_11_tfstpclinom, AV70Activarhdr_wcds_12_tfstpclinom_sel, AV70Activarhdr_wcds_12_tfstpclinom_sel, AV72Activarhdr_wcds_14_tfstpbarser_sel, AV71Activarhdr_wcds_13_tfstpbarser, lV71Activarhdr_wcds_13_tfstpbarser, AV72Activarhdr_wcds_14_tfstpbarser_sel, AV72Activarhdr_wcds_14_tfstpbarser_sel, AV74Activarhdr_wcds_16_tfstpbarserdsc_sel, AV73Activarhdr_wcds_15_tfstpbarserdsc, lV73Activarhdr_wcds_15_tfstpbarserdsc, AV74Activarhdr_wcds_16_tfstpbarserdsc_sel, AV74Activarhdr_wcds_16_tfstpbarserdsc_sel, AV76Activarhdr_wcds_18_tfstpcolor_sel, AV75Activarhdr_wcds_17_tfstpcolor, lV75Activarhdr_wcds_17_tfstpcolor, AV76Activarhdr_wcds_18_tfstpcolor_sel, AV76Activarhdr_wcds_18_tfstpcolor_sel, Short.valueOf(AV60Activarhdr_wcds_2_tfstp_lin), Short.valueOf(AV61Activarhdr_wcds_3_tfstp_lin_to), AV62Activarhdr_wcds_4_tfstp_dia, lV63Activarhdr_wcds_5_tfstp_mot, AV64Activarhdr_wcds_6_tfstp_mot_sel, lV65Activarhdr_wcds_7_tfstphdr, AV66Activarhdr_wcds_8_tfstphdr_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = H01C13_A396EmprCod[0] ;
         A10755Stp_Est = H01C13_A10755Stp_Est[0] ;
         A13723StpHdr = H01C13_A13723StpHdr[0] ;
         A10752Stp_Mot = H01C13_A10752Stp_Mot[0] ;
         A10751Stp_Dia = H01C13_A10751Stp_Dia[0] ;
         A10750Stp_Lin = H01C13_A10750Stp_Lin[0] ;
         A13728StpColor = H01C13_A13728StpColor[0] ;
         n13728StpColor = H01C13_n13728StpColor[0] ;
         A13725StpBarserD = H01C13_A13725StpBarserD[0] ;
         n13725StpBarserD = H01C13_n13725StpBarserD[0] ;
         A13724StpBarser = H01C13_A13724StpBarser[0] ;
         n13724StpBarser = H01C13_n13724StpBarser[0] ;
         A13727StpCliNom = H01C13_A13727StpCliNom[0] ;
         n13727StpCliNom = H01C13_n13727StpCliNom[0] ;
         A13726StpClicod = H01C13_A13726StpClicod[0] ;
         n13726StpClicod = H01C13_n13726StpClicod[0] ;
         A10746Stp_hdr = H01C13_A10746Stp_hdr[0] ;
         A10747Stp_r = H01C13_A10747Stp_r[0] ;
         A10748Stp_p = H01C13_A10748Stp_p[0] ;
         A13723StpHdr = H01C13_A13723StpHdr[0] ;
         A13728StpColor = H01C13_A13728StpColor[0] ;
         n13728StpColor = H01C13_n13728StpColor[0] ;
         A13725StpBarserD = H01C13_A13725StpBarserD[0] ;
         n13725StpBarserD = H01C13_n13725StpBarserD[0] ;
         A13724StpBarser = H01C13_A13724StpBarser[0] ;
         n13724StpBarser = H01C13_n13724StpBarser[0] ;
         A13726StpClicod = H01C13_A13726StpClicod[0] ;
         n13726StpClicod = H01C13_n13726StpClicod[0] ;
         A13727StpCliNom = H01C13_A13727StpCliNom[0] ;
         n13727StpCliNom = H01C13_n13727StpCliNom[0] ;
         if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).after( GXutil.resetTime( AV8DiaInicial )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV8DiaInicial)) )) )
         {
            if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).before( GXutil.resetTime( AV9DiaInicial_to )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV9DiaInicial_to)) )) )
            {
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

   public void rf1C12( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(41) ;
      /* Execute user event: Refresh */
      e191C12 ();
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
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              Short.valueOf(AV60Activarhdr_wcds_2_tfstp_lin) ,
                                              Short.valueOf(AV61Activarhdr_wcds_3_tfstp_lin_to) ,
                                              AV62Activarhdr_wcds_4_tfstp_dia ,
                                              AV64Activarhdr_wcds_6_tfstp_mot_sel ,
                                              AV63Activarhdr_wcds_5_tfstp_mot ,
                                              AV66Activarhdr_wcds_8_tfstphdr_sel ,
                                              AV65Activarhdr_wcds_7_tfstphdr ,
                                              Short.valueOf(A10750Stp_Lin) ,
                                              A10751Stp_Dia ,
                                              A10752Stp_Mot ,
                                              Integer.valueOf(A10746Stp_hdr) ,
                                              Byte.valueOf(A10747Stp_r) ,
                                              A10748Stp_p ,
                                              Short.valueOf(AV15OrderedBy) ,
                                              Boolean.valueOf(AV16OrderedDsc) ,
                                              AV59Activarhdr_wcds_1_filterfulltext ,
                                              A13723StpHdr ,
                                              Integer.valueOf(A13726StpClicod) ,
                                              A13727StpCliNom ,
                                              A13724StpBarser ,
                                              A13725StpBarserD ,
                                              A13728StpColor ,
                                              Integer.valueOf(AV67Activarhdr_wcds_9_tfstpclicod) ,
                                              Integer.valueOf(AV68Activarhdr_wcds_10_tfstpclicod_to) ,
                                              AV70Activarhdr_wcds_12_tfstpclinom_sel ,
                                              AV69Activarhdr_wcds_11_tfstpclinom ,
                                              AV72Activarhdr_wcds_14_tfstpbarser_sel ,
                                              AV71Activarhdr_wcds_13_tfstpbarser ,
                                              AV74Activarhdr_wcds_16_tfstpbarserdsc_sel ,
                                              AV73Activarhdr_wcds_15_tfstpbarserdsc ,
                                              AV76Activarhdr_wcds_18_tfstpcolor_sel ,
                                              AV75Activarhdr_wcds_17_tfstpcolor ,
                                              AV8DiaInicial ,
                                              AV9DiaInicial_to ,
                                              AV7Emprcod ,
                                              A396EmprCod ,
                                              Byte.valueOf(A10755Stp_Est) } ,
                                              new int[]{
                                              TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.STRING,
                                              TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                              TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.BYTE
                                              }
         });
         lV59Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Activarhdr_wcds_1_filterfulltext), "%", "") ;
         lV59Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Activarhdr_wcds_1_filterfulltext), "%", "") ;
         lV59Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Activarhdr_wcds_1_filterfulltext), "%", "") ;
         lV59Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Activarhdr_wcds_1_filterfulltext), "%", "") ;
         lV59Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Activarhdr_wcds_1_filterfulltext), "%", "") ;
         lV59Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Activarhdr_wcds_1_filterfulltext), "%", "") ;
         lV59Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Activarhdr_wcds_1_filterfulltext), "%", "") ;
         lV59Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Activarhdr_wcds_1_filterfulltext), "%", "") ;
         lV69Activarhdr_wcds_11_tfstpclinom = GXutil.padr( GXutil.rtrim( AV69Activarhdr_wcds_11_tfstpclinom), 30, "%") ;
         lV71Activarhdr_wcds_13_tfstpbarser = GXutil.padr( GXutil.rtrim( AV71Activarhdr_wcds_13_tfstpbarser), 16, "%") ;
         lV73Activarhdr_wcds_15_tfstpbarserdsc = GXutil.padr( GXutil.rtrim( AV73Activarhdr_wcds_15_tfstpbarserdsc), 26, "%") ;
         lV75Activarhdr_wcds_17_tfstpcolor = GXutil.padr( GXutil.rtrim( AV75Activarhdr_wcds_17_tfstpcolor), 13, "%") ;
         lV63Activarhdr_wcds_5_tfstp_mot = GXutil.concat( GXutil.rtrim( AV63Activarhdr_wcds_5_tfstp_mot), "%", "") ;
         lV65Activarhdr_wcds_7_tfstphdr = GXutil.padr( GXutil.rtrim( AV65Activarhdr_wcds_7_tfstphdr), 11, "%") ;
         /* Using cursor H01C15 */
         pr_default.execute(1, new Object[] {AV7Emprcod, AV59Activarhdr_wcds_1_filterfulltext, lV59Activarhdr_wcds_1_filterfulltext, lV59Activarhdr_wcds_1_filterfulltext, lV59Activarhdr_wcds_1_filterfulltext, lV59Activarhdr_wcds_1_filterfulltext, lV59Activarhdr_wcds_1_filterfulltext, lV59Activarhdr_wcds_1_filterfulltext, lV59Activarhdr_wcds_1_filterfulltext, lV59Activarhdr_wcds_1_filterfulltext, Integer.valueOf(AV67Activarhdr_wcds_9_tfstpclicod), Integer.valueOf(AV67Activarhdr_wcds_9_tfstpclicod), Integer.valueOf(AV68Activarhdr_wcds_10_tfstpclicod_to), Integer.valueOf(AV68Activarhdr_wcds_10_tfstpclicod_to), AV70Activarhdr_wcds_12_tfstpclinom_sel, AV69Activarhdr_wcds_11_tfstpclinom, lV69Activarhdr_wcds_11_tfstpclinom, AV70Activarhdr_wcds_12_tfstpclinom_sel, AV70Activarhdr_wcds_12_tfstpclinom_sel, AV72Activarhdr_wcds_14_tfstpbarser_sel, AV71Activarhdr_wcds_13_tfstpbarser, lV71Activarhdr_wcds_13_tfstpbarser, AV72Activarhdr_wcds_14_tfstpbarser_sel, AV72Activarhdr_wcds_14_tfstpbarser_sel, AV74Activarhdr_wcds_16_tfstpbarserdsc_sel, AV73Activarhdr_wcds_15_tfstpbarserdsc, lV73Activarhdr_wcds_15_tfstpbarserdsc, AV74Activarhdr_wcds_16_tfstpbarserdsc_sel, AV74Activarhdr_wcds_16_tfstpbarserdsc_sel, AV76Activarhdr_wcds_18_tfstpcolor_sel, AV75Activarhdr_wcds_17_tfstpcolor, lV75Activarhdr_wcds_17_tfstpcolor, AV76Activarhdr_wcds_18_tfstpcolor_sel, AV76Activarhdr_wcds_18_tfstpcolor_sel, Short.valueOf(AV60Activarhdr_wcds_2_tfstp_lin), Short.valueOf(AV61Activarhdr_wcds_3_tfstp_lin_to), AV62Activarhdr_wcds_4_tfstp_dia, lV63Activarhdr_wcds_5_tfstp_mot, AV64Activarhdr_wcds_6_tfstp_mot_sel, lV65Activarhdr_wcds_7_tfstphdr, AV66Activarhdr_wcds_8_tfstphdr_sel});
         nGXsfl_41_idx = 1 ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_412( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H01C15_A396EmprCod[0] ;
            A10755Stp_Est = H01C15_A10755Stp_Est[0] ;
            A13723StpHdr = H01C15_A13723StpHdr[0] ;
            A10752Stp_Mot = H01C15_A10752Stp_Mot[0] ;
            A10751Stp_Dia = H01C15_A10751Stp_Dia[0] ;
            A10750Stp_Lin = H01C15_A10750Stp_Lin[0] ;
            A13728StpColor = H01C15_A13728StpColor[0] ;
            n13728StpColor = H01C15_n13728StpColor[0] ;
            A13725StpBarserD = H01C15_A13725StpBarserD[0] ;
            n13725StpBarserD = H01C15_n13725StpBarserD[0] ;
            A13724StpBarser = H01C15_A13724StpBarser[0] ;
            n13724StpBarser = H01C15_n13724StpBarser[0] ;
            A13727StpCliNom = H01C15_A13727StpCliNom[0] ;
            n13727StpCliNom = H01C15_n13727StpCliNom[0] ;
            A13726StpClicod = H01C15_A13726StpClicod[0] ;
            n13726StpClicod = H01C15_n13726StpClicod[0] ;
            A10746Stp_hdr = H01C15_A10746Stp_hdr[0] ;
            A10747Stp_r = H01C15_A10747Stp_r[0] ;
            A10748Stp_p = H01C15_A10748Stp_p[0] ;
            A13723StpHdr = H01C15_A13723StpHdr[0] ;
            A13728StpColor = H01C15_A13728StpColor[0] ;
            n13728StpColor = H01C15_n13728StpColor[0] ;
            A13725StpBarserD = H01C15_A13725StpBarserD[0] ;
            n13725StpBarserD = H01C15_n13725StpBarserD[0] ;
            A13724StpBarser = H01C15_A13724StpBarser[0] ;
            n13724StpBarser = H01C15_n13724StpBarser[0] ;
            A13726StpClicod = H01C15_A13726StpClicod[0] ;
            n13726StpClicod = H01C15_n13726StpClicod[0] ;
            A13727StpCliNom = H01C15_A13727StpCliNom[0] ;
            n13727StpCliNom = H01C15_n13727StpCliNom[0] ;
            if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).after( GXutil.resetTime( AV8DiaInicial )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV8DiaInicial)) )) )
            {
               if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).before( GXutil.resetTime( AV9DiaInicial_to )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV9DiaInicial_to)) )) )
               {
                  e201C12 ();
               }
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(41) ;
         wb1C10( ) ;
      }
      bGXsfl_41_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1C12( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV77Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV77Pgmname, ""))));
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
      AV59Activarhdr_wcds_1_filterfulltext = AV18FilterFullText ;
      AV60Activarhdr_wcds_2_tfstp_lin = AV29TFStp_Lin ;
      AV61Activarhdr_wcds_3_tfstp_lin_to = AV30TFStp_Lin_To ;
      AV62Activarhdr_wcds_4_tfstp_dia = AV31TFStp_Dia ;
      AV63Activarhdr_wcds_5_tfstp_mot = AV35TFStp_Mot ;
      AV64Activarhdr_wcds_6_tfstp_mot_sel = AV36TFStp_Mot_Sel ;
      AV65Activarhdr_wcds_7_tfstphdr = AV37TFStpHdr ;
      AV66Activarhdr_wcds_8_tfstphdr_sel = AV38TFStpHdr_Sel ;
      AV67Activarhdr_wcds_9_tfstpclicod = AV39TFStpClicod ;
      AV68Activarhdr_wcds_10_tfstpclicod_to = AV40TFStpClicod_To ;
      AV69Activarhdr_wcds_11_tfstpclinom = AV41TFStpCliNom ;
      AV70Activarhdr_wcds_12_tfstpclinom_sel = AV42TFStpCliNom_Sel ;
      AV71Activarhdr_wcds_13_tfstpbarser = AV43TFStpBarser ;
      AV72Activarhdr_wcds_14_tfstpbarser_sel = AV44TFStpBarser_Sel ;
      AV73Activarhdr_wcds_15_tfstpbarserdsc = AV45TFStpBarserDsc ;
      AV74Activarhdr_wcds_16_tfstpbarserdsc_sel = AV46TFStpBarserDsc_Sel ;
      AV75Activarhdr_wcds_17_tfstpcolor = AV47TFStpColor ;
      AV76Activarhdr_wcds_18_tfstpcolor_sel = AV48TFStpColor_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV7Emprcod, AV8DiaInicial, AV9DiaInicial_to, AV28ManageFiltersExecutionStep, AV23ColumnsSelector, AV18FilterFullText, AV29TFStp_Lin, AV30TFStp_Lin_To, AV31TFStp_Dia, AV35TFStp_Mot, AV36TFStp_Mot_Sel, AV37TFStpHdr, AV38TFStpHdr_Sel, AV39TFStpClicod, AV40TFStpClicod_To, AV41TFStpCliNom, AV42TFStpCliNom_Sel, AV43TFStpBarser, AV44TFStpBarser_Sel, AV45TFStpBarserDsc, AV46TFStpBarserDsc_Sel, AV47TFStpColor, AV48TFStpColor_Sel, AV77Pgmname, AV15OrderedBy, AV16OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV59Activarhdr_wcds_1_filterfulltext = AV18FilterFullText ;
      AV60Activarhdr_wcds_2_tfstp_lin = AV29TFStp_Lin ;
      AV61Activarhdr_wcds_3_tfstp_lin_to = AV30TFStp_Lin_To ;
      AV62Activarhdr_wcds_4_tfstp_dia = AV31TFStp_Dia ;
      AV63Activarhdr_wcds_5_tfstp_mot = AV35TFStp_Mot ;
      AV64Activarhdr_wcds_6_tfstp_mot_sel = AV36TFStp_Mot_Sel ;
      AV65Activarhdr_wcds_7_tfstphdr = AV37TFStpHdr ;
      AV66Activarhdr_wcds_8_tfstphdr_sel = AV38TFStpHdr_Sel ;
      AV67Activarhdr_wcds_9_tfstpclicod = AV39TFStpClicod ;
      AV68Activarhdr_wcds_10_tfstpclicod_to = AV40TFStpClicod_To ;
      AV69Activarhdr_wcds_11_tfstpclinom = AV41TFStpCliNom ;
      AV70Activarhdr_wcds_12_tfstpclinom_sel = AV42TFStpCliNom_Sel ;
      AV71Activarhdr_wcds_13_tfstpbarser = AV43TFStpBarser ;
      AV72Activarhdr_wcds_14_tfstpbarser_sel = AV44TFStpBarser_Sel ;
      AV73Activarhdr_wcds_15_tfstpbarserdsc = AV45TFStpBarserDsc ;
      AV74Activarhdr_wcds_16_tfstpbarserdsc_sel = AV46TFStpBarserDsc_Sel ;
      AV75Activarhdr_wcds_17_tfstpcolor = AV47TFStpColor ;
      AV76Activarhdr_wcds_18_tfstpcolor_sel = AV48TFStpColor_Sel ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV7Emprcod, AV8DiaInicial, AV9DiaInicial_to, AV28ManageFiltersExecutionStep, AV23ColumnsSelector, AV18FilterFullText, AV29TFStp_Lin, AV30TFStp_Lin_To, AV31TFStp_Dia, AV35TFStp_Mot, AV36TFStp_Mot_Sel, AV37TFStpHdr, AV38TFStpHdr_Sel, AV39TFStpClicod, AV40TFStpClicod_To, AV41TFStpCliNom, AV42TFStpCliNom_Sel, AV43TFStpBarser, AV44TFStpBarser_Sel, AV45TFStpBarserDsc, AV46TFStpBarserDsc_Sel, AV47TFStpColor, AV48TFStpColor_Sel, AV77Pgmname, AV15OrderedBy, AV16OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV59Activarhdr_wcds_1_filterfulltext = AV18FilterFullText ;
      AV60Activarhdr_wcds_2_tfstp_lin = AV29TFStp_Lin ;
      AV61Activarhdr_wcds_3_tfstp_lin_to = AV30TFStp_Lin_To ;
      AV62Activarhdr_wcds_4_tfstp_dia = AV31TFStp_Dia ;
      AV63Activarhdr_wcds_5_tfstp_mot = AV35TFStp_Mot ;
      AV64Activarhdr_wcds_6_tfstp_mot_sel = AV36TFStp_Mot_Sel ;
      AV65Activarhdr_wcds_7_tfstphdr = AV37TFStpHdr ;
      AV66Activarhdr_wcds_8_tfstphdr_sel = AV38TFStpHdr_Sel ;
      AV67Activarhdr_wcds_9_tfstpclicod = AV39TFStpClicod ;
      AV68Activarhdr_wcds_10_tfstpclicod_to = AV40TFStpClicod_To ;
      AV69Activarhdr_wcds_11_tfstpclinom = AV41TFStpCliNom ;
      AV70Activarhdr_wcds_12_tfstpclinom_sel = AV42TFStpCliNom_Sel ;
      AV71Activarhdr_wcds_13_tfstpbarser = AV43TFStpBarser ;
      AV72Activarhdr_wcds_14_tfstpbarser_sel = AV44TFStpBarser_Sel ;
      AV73Activarhdr_wcds_15_tfstpbarserdsc = AV45TFStpBarserDsc ;
      AV74Activarhdr_wcds_16_tfstpbarserdsc_sel = AV46TFStpBarserDsc_Sel ;
      AV75Activarhdr_wcds_17_tfstpcolor = AV47TFStpColor ;
      AV76Activarhdr_wcds_18_tfstpcolor_sel = AV48TFStpColor_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7Emprcod, AV8DiaInicial, AV9DiaInicial_to, AV28ManageFiltersExecutionStep, AV23ColumnsSelector, AV18FilterFullText, AV29TFStp_Lin, AV30TFStp_Lin_To, AV31TFStp_Dia, AV35TFStp_Mot, AV36TFStp_Mot_Sel, AV37TFStpHdr, AV38TFStpHdr_Sel, AV39TFStpClicod, AV40TFStpClicod_To, AV41TFStpCliNom, AV42TFStpCliNom_Sel, AV43TFStpBarser, AV44TFStpBarser_Sel, AV45TFStpBarserDsc, AV46TFStpBarserDsc_Sel, AV47TFStpColor, AV48TFStpColor_Sel, AV77Pgmname, AV15OrderedBy, AV16OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV59Activarhdr_wcds_1_filterfulltext = AV18FilterFullText ;
      AV60Activarhdr_wcds_2_tfstp_lin = AV29TFStp_Lin ;
      AV61Activarhdr_wcds_3_tfstp_lin_to = AV30TFStp_Lin_To ;
      AV62Activarhdr_wcds_4_tfstp_dia = AV31TFStp_Dia ;
      AV63Activarhdr_wcds_5_tfstp_mot = AV35TFStp_Mot ;
      AV64Activarhdr_wcds_6_tfstp_mot_sel = AV36TFStp_Mot_Sel ;
      AV65Activarhdr_wcds_7_tfstphdr = AV37TFStpHdr ;
      AV66Activarhdr_wcds_8_tfstphdr_sel = AV38TFStpHdr_Sel ;
      AV67Activarhdr_wcds_9_tfstpclicod = AV39TFStpClicod ;
      AV68Activarhdr_wcds_10_tfstpclicod_to = AV40TFStpClicod_To ;
      AV69Activarhdr_wcds_11_tfstpclinom = AV41TFStpCliNom ;
      AV70Activarhdr_wcds_12_tfstpclinom_sel = AV42TFStpCliNom_Sel ;
      AV71Activarhdr_wcds_13_tfstpbarser = AV43TFStpBarser ;
      AV72Activarhdr_wcds_14_tfstpbarser_sel = AV44TFStpBarser_Sel ;
      AV73Activarhdr_wcds_15_tfstpbarserdsc = AV45TFStpBarserDsc ;
      AV74Activarhdr_wcds_16_tfstpbarserdsc_sel = AV46TFStpBarserDsc_Sel ;
      AV75Activarhdr_wcds_17_tfstpcolor = AV47TFStpColor ;
      AV76Activarhdr_wcds_18_tfstpcolor_sel = AV48TFStpColor_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7Emprcod, AV8DiaInicial, AV9DiaInicial_to, AV28ManageFiltersExecutionStep, AV23ColumnsSelector, AV18FilterFullText, AV29TFStp_Lin, AV30TFStp_Lin_To, AV31TFStp_Dia, AV35TFStp_Mot, AV36TFStp_Mot_Sel, AV37TFStpHdr, AV38TFStpHdr_Sel, AV39TFStpClicod, AV40TFStpClicod_To, AV41TFStpCliNom, AV42TFStpCliNom_Sel, AV43TFStpBarser, AV44TFStpBarser_Sel, AV45TFStpBarserDsc, AV46TFStpBarserDsc_Sel, AV47TFStpColor, AV48TFStpColor_Sel, AV77Pgmname, AV15OrderedBy, AV16OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV59Activarhdr_wcds_1_filterfulltext = AV18FilterFullText ;
      AV60Activarhdr_wcds_2_tfstp_lin = AV29TFStp_Lin ;
      AV61Activarhdr_wcds_3_tfstp_lin_to = AV30TFStp_Lin_To ;
      AV62Activarhdr_wcds_4_tfstp_dia = AV31TFStp_Dia ;
      AV63Activarhdr_wcds_5_tfstp_mot = AV35TFStp_Mot ;
      AV64Activarhdr_wcds_6_tfstp_mot_sel = AV36TFStp_Mot_Sel ;
      AV65Activarhdr_wcds_7_tfstphdr = AV37TFStpHdr ;
      AV66Activarhdr_wcds_8_tfstphdr_sel = AV38TFStpHdr_Sel ;
      AV67Activarhdr_wcds_9_tfstpclicod = AV39TFStpClicod ;
      AV68Activarhdr_wcds_10_tfstpclicod_to = AV40TFStpClicod_To ;
      AV69Activarhdr_wcds_11_tfstpclinom = AV41TFStpCliNom ;
      AV70Activarhdr_wcds_12_tfstpclinom_sel = AV42TFStpCliNom_Sel ;
      AV71Activarhdr_wcds_13_tfstpbarser = AV43TFStpBarser ;
      AV72Activarhdr_wcds_14_tfstpbarser_sel = AV44TFStpBarser_Sel ;
      AV73Activarhdr_wcds_15_tfstpbarserdsc = AV45TFStpBarserDsc ;
      AV74Activarhdr_wcds_16_tfstpbarserdsc_sel = AV46TFStpBarserDsc_Sel ;
      AV75Activarhdr_wcds_17_tfstpcolor = AV47TFStpColor ;
      AV76Activarhdr_wcds_18_tfstpcolor_sel = AV48TFStpColor_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7Emprcod, AV8DiaInicial, AV9DiaInicial_to, AV28ManageFiltersExecutionStep, AV23ColumnsSelector, AV18FilterFullText, AV29TFStp_Lin, AV30TFStp_Lin_To, AV31TFStp_Dia, AV35TFStp_Mot, AV36TFStp_Mot_Sel, AV37TFStpHdr, AV38TFStpHdr_Sel, AV39TFStpClicod, AV40TFStpClicod_To, AV41TFStpCliNom, AV42TFStpCliNom_Sel, AV43TFStpBarser, AV44TFStpBarser_Sel, AV45TFStpBarserDsc, AV46TFStpBarserDsc_Sel, AV47TFStpColor, AV48TFStpColor_Sel, AV77Pgmname, AV15OrderedBy, AV16OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV77Pgmname = "ActivarHdr_WC" ;
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup1C10( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e181C12 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV26ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV49DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV23ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_41 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_41"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV51GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV52GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV7Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV7Emprcod") ;
         wcpOAV8DiaInicial = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV8DiaInicial"), 0) ;
         wcpOAV9DiaInicial_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV9DiaInicial_to"), 0) ;
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
         AV18FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18FilterFullText", AV18FilterFullText);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_stp_diaauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_STP_DIAAUXDATE");
            GX_FocusControl = edtavDdo_stp_diaauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV33DDO_Stp_DiaAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33DDO_Stp_DiaAuxDate", localUtil.format(AV33DDO_Stp_DiaAuxDate, "99/99/99"));
         }
         else
         {
            AV33DDO_Stp_DiaAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_stp_diaauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33DDO_Stp_DiaAuxDate", localUtil.format(AV33DDO_Stp_DiaAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
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
      e181C12 ();
      if (returnInSub) return;
   }

   public void e181C12( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV53Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      activarhdr_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV53Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53Station", AV53Station);
      GXv_char2[0] = AV7Emprcod ;
      GXv_char3[0] = AV54EmprNom ;
      GXv_char4[0] = AV55UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV53Station, GXv_char2, GXv_char3, GXv_char4) ;
      activarhdr_wc_impl.this.AV7Emprcod = GXv_char2[0] ;
      activarhdr_wc_impl.this.AV54EmprNom = GXv_char3[0] ;
      activarhdr_wc_impl.this.AV55UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Emprcod", AV7Emprcod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55UsurCod", AV55UsurCod);
      GXt_char1 = AV53Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      activarhdr_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      AV53Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53Station", AV53Station);
      GXv_char4[0] = AV7Emprcod ;
      GXv_char3[0] = AV54EmprNom ;
      GXv_char2[0] = AV55UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV53Station, GXv_char4, GXv_char3, GXv_char2) ;
      activarhdr_wc_impl.this.AV7Emprcod = GXv_char4[0] ;
      activarhdr_wc_impl.this.AV54EmprNom = GXv_char3[0] ;
      activarhdr_wc_impl.this.AV55UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Emprcod", AV7Emprcod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55UsurCod", AV55UsurCod);
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
      if ( AV15OrderedBy < 1 )
      {
         AV15OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV49DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV49DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e191C12( )
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
      if ( AV28ManageFiltersExecutionStep == 1 )
      {
         AV28ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28ManageFiltersExecutionStep", GXutil.str( AV28ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV28ManageFiltersExecutionStep == 2 )
      {
         AV28ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28ManageFiltersExecutionStep", GXutil.str( AV28ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV25Session.getValue("ActivarHdr_WCColumnsSelector"), "") != 0 )
      {
         AV21ColumnsSelectorXML = AV25Session.getValue("ActivarHdr_WCColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV21ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtStp_Lin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtStp_Lin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStp_Lin_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtStp_Dia_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtStp_Dia_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStp_Dia_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtStp_Mot_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtStp_Mot_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStp_Mot_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtStpHdr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtStpHdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStpHdr_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtStpClicod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtStpClicod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStpClicod_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtStpCliNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtStpCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStpCliNom_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtStpBarser_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtStpBarser_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStpBarser_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtStpBarserD_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtStpBarserD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStpBarserD_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtStpColor_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtStpColor_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStpColor_Visible), 5, 0), !bGXsfl_41_Refreshing);
      AV51GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51GridCurrentPage), 10, 0));
      AV52GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52GridPageCount), 10, 0));
      cmbavAcciones.setColumnHeaderClass( "WWActionGroupColumn" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavAcciones.getInternalname(), "Columnheaderclass", cmbavAcciones.getColumnHeaderClass(), !bGXsfl_41_Refreshing);
      edtStp_Lin_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtStp_Lin_Internalname, "Columnheaderclass", edtStp_Lin_Columnheaderclass, !bGXsfl_41_Refreshing);
      edtStp_Dia_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtStp_Dia_Internalname, "Columnheaderclass", edtStp_Dia_Columnheaderclass, !bGXsfl_41_Refreshing);
      edtStp_Mot_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtStp_Mot_Internalname, "Columnheaderclass", edtStp_Mot_Columnheaderclass, !bGXsfl_41_Refreshing);
      edtStpHdr_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtStpHdr_Internalname, "Columnheaderclass", edtStpHdr_Columnheaderclass, !bGXsfl_41_Refreshing);
      edtStpClicod_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtStpClicod_Internalname, "Columnheaderclass", edtStpClicod_Columnheaderclass, !bGXsfl_41_Refreshing);
      edtStpCliNom_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtStpCliNom_Internalname, "Columnheaderclass", edtStpCliNom_Columnheaderclass, !bGXsfl_41_Refreshing);
      edtStpBarser_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtStpBarser_Internalname, "Columnheaderclass", edtStpBarser_Columnheaderclass, !bGXsfl_41_Refreshing);
      edtStpBarserD_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtStpBarserD_Internalname, "Columnheaderclass", edtStpBarserD_Columnheaderclass, !bGXsfl_41_Refreshing);
      edtStpColor_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtStpColor_Internalname, "Columnheaderclass", edtStpColor_Columnheaderclass, !bGXsfl_41_Refreshing);
      AV59Activarhdr_wcds_1_filterfulltext = AV18FilterFullText ;
      AV60Activarhdr_wcds_2_tfstp_lin = AV29TFStp_Lin ;
      AV61Activarhdr_wcds_3_tfstp_lin_to = AV30TFStp_Lin_To ;
      AV62Activarhdr_wcds_4_tfstp_dia = AV31TFStp_Dia ;
      AV63Activarhdr_wcds_5_tfstp_mot = AV35TFStp_Mot ;
      AV64Activarhdr_wcds_6_tfstp_mot_sel = AV36TFStp_Mot_Sel ;
      AV65Activarhdr_wcds_7_tfstphdr = AV37TFStpHdr ;
      AV66Activarhdr_wcds_8_tfstphdr_sel = AV38TFStpHdr_Sel ;
      AV67Activarhdr_wcds_9_tfstpclicod = AV39TFStpClicod ;
      AV68Activarhdr_wcds_10_tfstpclicod_to = AV40TFStpClicod_To ;
      AV69Activarhdr_wcds_11_tfstpclinom = AV41TFStpCliNom ;
      AV70Activarhdr_wcds_12_tfstpclinom_sel = AV42TFStpCliNom_Sel ;
      AV71Activarhdr_wcds_13_tfstpbarser = AV43TFStpBarser ;
      AV72Activarhdr_wcds_14_tfstpbarser_sel = AV44TFStpBarser_Sel ;
      AV73Activarhdr_wcds_15_tfstpbarserdsc = AV45TFStpBarserDsc ;
      AV74Activarhdr_wcds_16_tfstpbarserdsc_sel = AV46TFStpBarserDsc_Sel ;
      AV75Activarhdr_wcds_17_tfstpcolor = AV47TFStpColor ;
      AV76Activarhdr_wcds_18_tfstpcolor_sel = AV48TFStpColor_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ColumnsSelector", AV23ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV26ManageFiltersData", AV26ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV13GridState", AV13GridState);
   }

   public void e121C12( )
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
         AV50PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV50PageToGo) ;
      }
   }

   public void e131C12( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e141C12( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV15OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15OrderedBy), 4, 0));
         AV16OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16OrderedDsc", AV16OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Stp_Lin") == 0 )
         {
            AV29TFStp_Lin = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFStp_Lin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFStp_Lin), 4, 0));
            AV30TFStp_Lin_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFStp_Lin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFStp_Lin_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Stp_Dia") == 0 )
         {
            AV31TFStp_Dia = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFStp_Dia", localUtil.ttoc( AV31TFStp_Dia, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Stp_Mot") == 0 )
         {
            AV35TFStp_Mot = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFStp_Mot", AV35TFStp_Mot);
            AV36TFStp_Mot_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFStp_Mot_Sel", AV36TFStp_Mot_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "StpHdr") == 0 )
         {
            AV37TFStpHdr = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFStpHdr", AV37TFStpHdr);
            AV38TFStpHdr_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFStpHdr_Sel", AV38TFStpHdr_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "StpClicod") == 0 )
         {
            AV39TFStpClicod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFStpClicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39TFStpClicod), 6, 0));
            AV40TFStpClicod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFStpClicod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TFStpClicod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "StpCliNom") == 0 )
         {
            AV41TFStpCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFStpCliNom", AV41TFStpCliNom);
            AV42TFStpCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFStpCliNom_Sel", AV42TFStpCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "StpBarser") == 0 )
         {
            AV43TFStpBarser = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFStpBarser", AV43TFStpBarser);
            AV44TFStpBarser_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFStpBarser_Sel", AV44TFStpBarser_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "StpBarserDsc") == 0 )
         {
            AV45TFStpBarserDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFStpBarserDsc", AV45TFStpBarserDsc);
            AV46TFStpBarserDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFStpBarserDsc_Sel", AV46TFStpBarserDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "StpColor") == 0 )
         {
            AV47TFStpColor = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFStpColor", AV47TFStpColor);
            AV48TFStpColor_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFStpColor_Sel", AV48TFStpColor_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e201C12( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         cmbavAcciones.removeAllItems();
         cmbavAcciones.addItem("0", ";fa fa-bars", (short)(0));
         cmbavAcciones.addItem("1", httpContext.getMessage( "Activar", ""), (short)(0));
         if ( A10755Stp_Est == 2 )
         {
            cmbavAcciones.setColumnClass( "WWActionGroupColumn WWColumnDanger WWColumnDangerFirstColumn" );
            edtStp_Lin_Columnclass = "WWColumn WWColumnDanger hidden-xs" ;
            edtStp_Dia_Columnclass = "WWColumn WWColumnDanger" ;
            edtStp_Mot_Columnclass = "WWColumn WWColumnDanger hidden-xs" ;
            edtStpHdr_Columnclass = "WWColumn WWColumnDanger" ;
            edtStpClicod_Columnclass = "WWColumn WWColumnDanger hidden-xs" ;
            edtStpCliNom_Columnclass = "WWColumn WWColumnDanger hidden-xs" ;
            edtStpBarser_Columnclass = "WWColumn WWColumnDanger hidden-xs" ;
            edtStpBarserD_Columnclass = "WWColumn WWColumnDanger hidden-xs" ;
            edtStpColor_Columnclass = "WWColumn WWColumnDanger hidden-xs" ;
         }
         else if ( A10755Stp_Est == 1 )
         {
            cmbavAcciones.setColumnClass( "WWActionGroupColumn WWColumnSuccess WWColumnSuccessFirstColumn" );
            edtStp_Lin_Columnclass = "WWColumn WWColumnSuccess hidden-xs" ;
            edtStp_Dia_Columnclass = "WWColumn WWColumnSuccess" ;
            edtStp_Mot_Columnclass = "WWColumn WWColumnSuccess hidden-xs" ;
            edtStpHdr_Columnclass = "WWColumn WWColumnSuccess" ;
            edtStpClicod_Columnclass = "WWColumn WWColumnSuccess hidden-xs" ;
            edtStpCliNom_Columnclass = "WWColumn WWColumnSuccess hidden-xs" ;
            edtStpBarser_Columnclass = "WWColumn WWColumnSuccess hidden-xs" ;
            edtStpBarserD_Columnclass = "WWColumn WWColumnSuccess hidden-xs" ;
            edtStpColor_Columnclass = "WWColumn WWColumnSuccess hidden-xs" ;
         }
         else
         {
            cmbavAcciones.setColumnClass( httpContext.getMessage( "WWActionGroupColumn", "") );
            edtStp_Lin_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
            edtStp_Dia_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtStp_Mot_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
            edtStpHdr_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtStpClicod_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
            edtStpCliNom_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
            edtStpBarser_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
            edtStpBarserD_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
            edtStpColor_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
         }
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(41) ;
         }
         sendrow_412( ) ;
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
      if ( isFullAjaxMode( ) && ! bGXsfl_41_Refreshing )
      {
         httpContext.doAjaxLoad(41, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavAcciones.setValue( GXutil.trim( GXutil.str( AV56Acciones, 4, 0)) );
   }

   public void e151C12( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV21ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV23ColumnsSelector.fromJSonString(AV21ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "ActivarHdr_WCColumnsSelector", ((GXutil.strcmp("", AV21ColumnsSelectorXML)==0) ? "" : AV23ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ColumnsSelector", AV23ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV26ManageFiltersData", AV26ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV13GridState", AV13GridState);
   }

   public void e111C12( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("ActivarHdr_WCFilters")),GXutil.URLEncode(GXutil.rtrim(AV77Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV28ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28ManageFiltersExecutionStep", GXutil.str( AV28ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("ActivarHdr_WCFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV28ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28ManageFiltersExecutionStep", GXutil.str( AV28ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV27ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "ActivarHdr_WCFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         activarhdr_wc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV27ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV27ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV77Pgmname+"GridState", AV27ManageFiltersXml) ;
            AV13GridState.fromxml(AV27ManageFiltersXml, null, null);
            AV15OrderedBy = AV13GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15OrderedBy), 4, 0));
            AV16OrderedDsc = AV13GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16OrderedDsc", AV16OrderedDsc);
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
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV13GridState", AV13GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ColumnsSelector", AV23ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV26ManageFiltersData", AV26ManageFiltersData);
   }

   public void e211C12( )
   {
      /* Acciones_Click Routine */
      returnInSub = false ;
      if ( AV56Acciones == 1 )
      {
         /* Execute user subroutine: 'DO ACTIVAR' */
         S192 ();
         if (returnInSub) return;
      }
      AV56Acciones = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavAcciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56Acciones), 4, 0));
      /*  Sending Event outputs  */
      cmbavAcciones.setValue( GXutil.trim( GXutil.str( AV56Acciones, 4, 0)) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavAcciones.getInternalname(), "Values", cmbavAcciones.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ColumnsSelector", AV23ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV26ManageFiltersData", AV26ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV13GridState", AV13GridState);
   }

   public void e161C12( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV19ExcelFilename ;
      GXv_char3[0] = AV20ErrorMessage ;
      new app.activarhdr_wcexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      activarhdr_wc_impl.this.AV19ExcelFilename = GXv_char4[0] ;
      activarhdr_wc_impl.this.AV20ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV19ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV19ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV20ErrorMessage);
      }
   }

   public void e171C12( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.activarhdr_wcexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV15OrderedBy, 4, 0))+":"+(AV16OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV23ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Stp_Lin", "", "#", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Stp_Dia", "", "Dia", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Stp_Mot", "", "Motivo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "StpHdr", "", "Hdr", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "StpClicod", "", "Cliente", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "StpCliNom", "", "Nombre", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "StpBarser", "", "Articulo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "StpBarserDsc", "", "Descripcion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "StpColor", "", "Color", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV22UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "ActivarHdr_WCColumnsSelector", GXv_char4) ;
      activarhdr_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      AV22UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV22UserCustomValue)==0) ) )
      {
         AV24ColumnsSelectorAux.fromxml(AV22UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector8[0] = AV24ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector9[0] = AV23ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, GXv_SdtWWPColumnsSelector9) ;
         AV24ColumnsSelectorAux = GXv_SdtWWPColumnsSelector8[0] ;
         AV23ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = AV26ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "ActivarHdr_WCFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV26ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV18FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18FilterFullText", AV18FilterFullText);
      AV29TFStp_Lin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFStp_Lin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFStp_Lin), 4, 0));
      AV30TFStp_Lin_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFStp_Lin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFStp_Lin_To), 4, 0));
      AV31TFStp_Dia = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFStp_Dia", localUtil.ttoc( AV31TFStp_Dia, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV35TFStp_Mot = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFStp_Mot", AV35TFStp_Mot);
      AV36TFStp_Mot_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFStp_Mot_Sel", AV36TFStp_Mot_Sel);
      AV37TFStpHdr = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFStpHdr", AV37TFStpHdr);
      AV38TFStpHdr_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFStpHdr_Sel", AV38TFStpHdr_Sel);
      AV39TFStpClicod = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFStpClicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39TFStpClicod), 6, 0));
      AV40TFStpClicod_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFStpClicod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TFStpClicod_To), 6, 0));
      AV41TFStpCliNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFStpCliNom", AV41TFStpCliNom);
      AV42TFStpCliNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFStpCliNom_Sel", AV42TFStpCliNom_Sel);
      AV43TFStpBarser = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFStpBarser", AV43TFStpBarser);
      AV44TFStpBarser_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFStpBarser_Sel", AV44TFStpBarser_Sel);
      AV45TFStpBarserDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFStpBarserDsc", AV45TFStpBarserDsc);
      AV46TFStpBarserDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFStpBarserDsc_Sel", AV46TFStpBarserDsc_Sel);
      AV47TFStpColor = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFStpColor", AV47TFStpColor);
      AV48TFStpColor_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFStpColor_Sel", AV48TFStpColor_Sel);
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S192( )
   {
      /* 'DO ACTIVAR' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.webhdsto4", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A10746Stp_hdr,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A10747Stp_r,1,0)),GXutil.URLEncode(GXutil.rtrim(A10748Stp_p)),GXutil.URLEncode(GXutil.rtrim(AV55UsurCod)),GXutil.URLEncode(GXutil.rtrim(AV53Station))}, new String[] {"EmprCod","Barcod","Barcodreo","Barcodpar","UsurCod","Station"}) , new Object[] {"A396EmprCod","A10746Stp_hdr","A10747Stp_r","A10748Stp_p","AV55UsurCod","AV53Station"});
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV25Session.getValue(AV77Pgmname+"GridState"), "") == 0 )
      {
         AV13GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV77Pgmname+"GridState"), null, null);
      }
      else
      {
         AV13GridState.fromxml(AV25Session.getValue(AV77Pgmname+"GridState"), null, null);
      }
      AV15OrderedBy = AV13GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15OrderedBy), 4, 0));
      AV16OrderedDsc = AV13GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16OrderedDsc", AV16OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S182 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV13GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV13GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV13GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S182( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV78GXV1 = 1 ;
      while ( AV78GXV1 <= AV13GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV14GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV13GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV78GXV1));
         if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18FilterFullText", AV18FilterFullText);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTP_LIN") == 0 )
         {
            AV29TFStp_Lin = (short)(GXutil.lval( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFStp_Lin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFStp_Lin), 4, 0));
            AV30TFStp_Lin_To = (short)(GXutil.lval( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFStp_Lin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFStp_Lin_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTP_DIA") == 0 )
         {
            AV31TFStp_Dia = localUtil.ctot( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFStp_Dia", localUtil.ttoc( AV31TFStp_Dia, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV33DDO_Stp_DiaAuxDate = GXutil.resetTime(AV31TFStp_Dia) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33DDO_Stp_DiaAuxDate", localUtil.format(AV33DDO_Stp_DiaAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTP_MOT") == 0 )
         {
            AV35TFStp_Mot = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFStp_Mot", AV35TFStp_Mot);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTP_MOT_SEL") == 0 )
         {
            AV36TFStp_Mot_Sel = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFStp_Mot_Sel", AV36TFStp_Mot_Sel);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPHDR") == 0 )
         {
            AV37TFStpHdr = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFStpHdr", AV37TFStpHdr);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPHDR_SEL") == 0 )
         {
            AV38TFStpHdr_Sel = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFStpHdr_Sel", AV38TFStpHdr_Sel);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCLICOD") == 0 )
         {
            AV39TFStpClicod = (int)(GXutil.lval( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFStpClicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39TFStpClicod), 6, 0));
            AV40TFStpClicod_To = (int)(GXutil.lval( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFStpClicod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TFStpClicod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCLINOM") == 0 )
         {
            AV41TFStpCliNom = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFStpCliNom", AV41TFStpCliNom);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCLINOM_SEL") == 0 )
         {
            AV42TFStpCliNom_Sel = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFStpCliNom_Sel", AV42TFStpCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPBARSER") == 0 )
         {
            AV43TFStpBarser = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFStpBarser", AV43TFStpBarser);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPBARSER_SEL") == 0 )
         {
            AV44TFStpBarser_Sel = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFStpBarser_Sel", AV44TFStpBarser_Sel);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPBARSERDSC") == 0 )
         {
            AV45TFStpBarserDsc = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFStpBarserDsc", AV45TFStpBarserDsc);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPBARSERDSC_SEL") == 0 )
         {
            AV46TFStpBarserDsc_Sel = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFStpBarserDsc_Sel", AV46TFStpBarserDsc_Sel);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCOLOR") == 0 )
         {
            AV47TFStpColor = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFStpColor", AV47TFStpColor);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCOLOR_SEL") == 0 )
         {
            AV48TFStpColor_Sel = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFStpColor_Sel", AV48TFStpColor_Sel);
         }
         AV78GXV1 = (int)(AV78GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV36TFStp_Mot_Sel)==0), AV36TFStp_Mot_Sel, GXv_char4) ;
      activarhdr_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV38TFStpHdr_Sel)==0), AV38TFStpHdr_Sel, GXv_char3) ;
      activarhdr_wc_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char2[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV42TFStpCliNom_Sel)==0), AV42TFStpCliNom_Sel, GXv_char2) ;
      activarhdr_wc_impl.this.GXt_char13 = GXv_char2[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV44TFStpBarser_Sel)==0), AV44TFStpBarser_Sel, GXv_char15) ;
      activarhdr_wc_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV46TFStpBarserDsc_Sel)==0), AV46TFStpBarserDsc_Sel, GXv_char17) ;
      activarhdr_wc_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV48TFStpColor_Sel)==0), AV48TFStpColor_Sel, GXv_char19) ;
      activarhdr_wc_impl.this.GXt_char18 = GXv_char19[0] ;
      Ddo_grid_Selectedvalue_set = "||"+GXt_char1+"|"+GXt_char12+"||"+GXt_char13+"|"+GXt_char14+"|"+GXt_char16+"|"+GXt_char18 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV35TFStp_Mot)==0), AV35TFStp_Mot, GXv_char19) ;
      activarhdr_wc_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV37TFStpHdr)==0), AV37TFStpHdr, GXv_char17) ;
      activarhdr_wc_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV41TFStpCliNom)==0), AV41TFStpCliNom, GXv_char15) ;
      activarhdr_wc_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV43TFStpBarser)==0), AV43TFStpBarser, GXv_char4) ;
      activarhdr_wc_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV45TFStpBarserDsc)==0), AV45TFStpBarserDsc, GXv_char3) ;
      activarhdr_wc_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV47TFStpColor)==0), AV47TFStpColor, GXv_char2) ;
      activarhdr_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV29TFStp_Lin) ? "" : GXutil.str( AV29TFStp_Lin, 4, 0))+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV31TFStp_Dia) ? "" : localUtil.dtoc( AV33DDO_Stp_DiaAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char18+"|"+GXt_char16+"|"+((0==AV39TFStpClicod) ? "" : GXutil.str( AV39TFStpClicod, 6, 0))+"|"+GXt_char14+"|"+GXt_char13+"|"+GXt_char12+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV30TFStp_Lin_To) ? "" : GXutil.str( AV30TFStp_Lin_To, 4, 0))+"||||"+((0==AV40TFStpClicod_To) ? "" : GXutil.str( AV40TFStpClicod_To, 6, 0))+"||||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV13GridState.fromxml(AV25Session.getValue(AV77Pgmname+"GridState"), null, null);
      AV13GridState.setgxTv_SdtWWPGridState_Orderedby( AV15OrderedBy );
      AV13GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV16OrderedDsc );
      AV13GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState20[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV18FilterFullText)==0), (short)(0), AV18FilterFullText, "") ;
      AV13GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFSTP_LIN", "", !((0==AV29TFStp_Lin)&&(0==AV30TFStp_Lin_To)), (short)(0), GXutil.trim( GXutil.str( AV29TFStp_Lin, 4, 0)), GXutil.trim( GXutil.str( AV30TFStp_Lin_To, 4, 0))) ;
      AV13GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFSTP_DIA", "", !GXutil.dateCompare(GXutil.nullDate(), AV31TFStp_Dia), (short)(0), GXutil.trim( localUtil.ttoc( AV31TFStp_Dia, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV13GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFSTP_MOT", "", !(GXutil.strcmp("", AV35TFStp_Mot)==0), (short)(0), AV35TFStp_Mot, "", !(GXutil.strcmp("", AV36TFStp_Mot_Sel)==0), AV36TFStp_Mot_Sel, "") ;
      AV13GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFSTPHDR", "", !(GXutil.strcmp("", AV37TFStpHdr)==0), (short)(0), AV37TFStpHdr, "", !(GXutil.strcmp("", AV38TFStpHdr_Sel)==0), AV38TFStpHdr_Sel, "") ;
      AV13GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFSTPCLICOD", "", !((0==AV39TFStpClicod)&&(0==AV40TFStpClicod_To)), (short)(0), GXutil.trim( GXutil.str( AV39TFStpClicod, 6, 0)), GXutil.trim( GXutil.str( AV40TFStpClicod_To, 6, 0))) ;
      AV13GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFSTPCLINOM", "", !(GXutil.strcmp("", AV41TFStpCliNom)==0), (short)(0), AV41TFStpCliNom, "", !(GXutil.strcmp("", AV42TFStpCliNom_Sel)==0), AV42TFStpCliNom_Sel, "") ;
      AV13GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFSTPBARSER", "", !(GXutil.strcmp("", AV43TFStpBarser)==0), (short)(0), AV43TFStpBarser, "", !(GXutil.strcmp("", AV44TFStpBarser_Sel)==0), AV44TFStpBarser_Sel, "") ;
      AV13GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFSTPBARSERDSC", "", !(GXutil.strcmp("", AV45TFStpBarserDsc)==0), (short)(0), AV45TFStpBarserDsc, "", !(GXutil.strcmp("", AV46TFStpBarserDsc_Sel)==0), AV46TFStpBarserDsc_Sel, "") ;
      AV13GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFSTPCOLOR", "", !(GXutil.strcmp("", AV47TFStpColor)==0), (short)(0), AV47TFStpColor, "", !(GXutil.strcmp("", AV48TFStpColor_Sel)==0), AV48TFStpColor_Sel, "") ;
      AV13GridState = GXv_SdtWWPGridState20[0] ;
      if ( ! (GXutil.strcmp("", AV7Emprcod)==0) )
      {
         AV14GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV14GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV14GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV7Emprcod );
         AV13GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV14GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV8DiaInicial)) )
      {
         AV14GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV14GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&DIAINICIAL" );
         AV14GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV8DiaInicial, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV13GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV14GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV9DiaInicial_to)) )
      {
         AV14GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV14GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&DIAINICIAL_TO" );
         AV14GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV9DiaInicial_to, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV13GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV14GridStateFilterValue, 0);
      }
      AV13GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV13GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV77Pgmname+"GridState", AV13GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV11TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV11TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV77Pgmname );
      AV11TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV11TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV10HTTPRequest.getScriptName()+"?"+AV10HTTPRequest.getQuerystring() );
      AV11TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "HDSTO1" );
      AV25Session.setValue("TrnContext", AV11TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_23_1C12( boolean wbgen )
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
         wb_table2_28_1C12( true) ;
      }
      else
      {
         wb_table2_28_1C12( false) ;
      }
      return  ;
   }

   public void wb_table2_28_1C12e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_23_1C12e( true) ;
      }
      else
      {
         wb_table1_23_1C12e( false) ;
      }
   }

   public void wb_table2_28_1C12( boolean wbgen )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV18FilterFullText, GXutil.rtrim( localUtil.format( AV18FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_ActivarHdr_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_28_1C12e( true) ;
      }
      else
      {
         wb_table2_28_1C12e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV7Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Emprcod", AV7Emprcod);
      AV8DiaInicial = (java.util.Date)getParm(obj,1,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8DiaInicial", localUtil.format(AV8DiaInicial, "99/99/99"));
      AV9DiaInicial_to = (java.util.Date)getParm(obj,2,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9DiaInicial_to", localUtil.format(AV9DiaInicial_to, "99/99/99"));
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
      pa1C12( ) ;
      ws1C12( ) ;
      we1C12( ) ;
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
      sCtrlAV7Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV8DiaInicial = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV9DiaInicial_to = (String)getParm(obj,2,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1C12( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "activarhdr_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1C12( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV7Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Emprcod", AV7Emprcod);
         AV8DiaInicial = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8DiaInicial", localUtil.format(AV8DiaInicial, "99/99/99"));
         AV9DiaInicial_to = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9DiaInicial_to", localUtil.format(AV9DiaInicial_to, "99/99/99"));
      }
      wcpOAV7Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV7Emprcod") ;
      wcpOAV8DiaInicial = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV8DiaInicial"), 0) ;
      wcpOAV9DiaInicial_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV9DiaInicial_to"), 0) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV7Emprcod, wcpOAV7Emprcod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV8DiaInicial), GXutil.resetTime(wcpOAV8DiaInicial)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV9DiaInicial_to), GXutil.resetTime(wcpOAV9DiaInicial_to)) ) ) )
      {
         setjustcreated();
      }
      wcpOAV7Emprcod = AV7Emprcod ;
      wcpOAV8DiaInicial = AV8DiaInicial ;
      wcpOAV9DiaInicial_to = AV9DiaInicial_to ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV7Emprcod = httpContext.cgiGet( sPrefix+"AV7Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV7Emprcod) > 0 )
      {
         AV7Emprcod = httpContext.cgiGet( sCtrlAV7Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Emprcod", AV7Emprcod);
      }
      else
      {
         AV7Emprcod = httpContext.cgiGet( sPrefix+"AV7Emprcod_PARM") ;
      }
      sCtrlAV8DiaInicial = httpContext.cgiGet( sPrefix+"AV8DiaInicial_CTRL") ;
      if ( GXutil.len( sCtrlAV8DiaInicial) > 0 )
      {
         AV8DiaInicial = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV8DiaInicial), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8DiaInicial", localUtil.format(AV8DiaInicial, "99/99/99"));
      }
      else
      {
         AV8DiaInicial = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV8DiaInicial_PARM"), 0) ;
      }
      sCtrlAV9DiaInicial_to = httpContext.cgiGet( sPrefix+"AV9DiaInicial_to_CTRL") ;
      if ( GXutil.len( sCtrlAV9DiaInicial_to) > 0 )
      {
         AV9DiaInicial_to = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV9DiaInicial_to), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9DiaInicial_to", localUtil.format(AV9DiaInicial_to, "99/99/99"));
      }
      else
      {
         AV9DiaInicial_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV9DiaInicial_to_PARM"), 0) ;
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
      pa1C12( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1C12( ) ;
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
      ws1C12( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7Emprcod_PARM", GXutil.rtrim( AV7Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7Emprcod_CTRL", GXutil.rtrim( sCtrlAV7Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8DiaInicial_PARM", localUtil.dtoc( AV8DiaInicial, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8DiaInicial)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8DiaInicial_CTRL", GXutil.rtrim( sCtrlAV8DiaInicial));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9DiaInicial_to_PARM", localUtil.dtoc( AV9DiaInicial_to, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV9DiaInicial_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9DiaInicial_to_CTRL", GXutil.rtrim( sCtrlAV9DiaInicial_to));
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
      we1C12( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115563166", true, true);
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
      httpContext.AddJavascriptSource("activarhdr_wc.js", "?202682115563167", false, true);
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
      cmbavAcciones.setInternalname( sPrefix+"vACCIONES_"+sGXsfl_41_idx );
      edtStp_Lin_Internalname = sPrefix+"STP_LIN_"+sGXsfl_41_idx ;
      edtStp_Dia_Internalname = sPrefix+"STP_DIA_"+sGXsfl_41_idx ;
      edtStp_Mot_Internalname = sPrefix+"STP_MOT_"+sGXsfl_41_idx ;
      edtStpHdr_Internalname = sPrefix+"STPHDR_"+sGXsfl_41_idx ;
      edtStpClicod_Internalname = sPrefix+"STPCLICOD_"+sGXsfl_41_idx ;
      edtStpCliNom_Internalname = sPrefix+"STPCLINOM_"+sGXsfl_41_idx ;
      edtStpBarser_Internalname = sPrefix+"STPBARSER_"+sGXsfl_41_idx ;
      edtStpBarserD_Internalname = sPrefix+"STPBARSERD_"+sGXsfl_41_idx ;
      edtStpColor_Internalname = sPrefix+"STPCOLOR_"+sGXsfl_41_idx ;
      edtStp_hdr_Internalname = sPrefix+"STP_HDR_"+sGXsfl_41_idx ;
      edtStp_r_Internalname = sPrefix+"STP_R_"+sGXsfl_41_idx ;
      edtStp_p_Internalname = sPrefix+"STP_P_"+sGXsfl_41_idx ;
   }

   public void subsflControlProps_fel_412( )
   {
      cmbavAcciones.setInternalname( sPrefix+"vACCIONES_"+sGXsfl_41_fel_idx );
      edtStp_Lin_Internalname = sPrefix+"STP_LIN_"+sGXsfl_41_fel_idx ;
      edtStp_Dia_Internalname = sPrefix+"STP_DIA_"+sGXsfl_41_fel_idx ;
      edtStp_Mot_Internalname = sPrefix+"STP_MOT_"+sGXsfl_41_fel_idx ;
      edtStpHdr_Internalname = sPrefix+"STPHDR_"+sGXsfl_41_fel_idx ;
      edtStpClicod_Internalname = sPrefix+"STPCLICOD_"+sGXsfl_41_fel_idx ;
      edtStpCliNom_Internalname = sPrefix+"STPCLINOM_"+sGXsfl_41_fel_idx ;
      edtStpBarser_Internalname = sPrefix+"STPBARSER_"+sGXsfl_41_fel_idx ;
      edtStpBarserD_Internalname = sPrefix+"STPBARSERD_"+sGXsfl_41_fel_idx ;
      edtStpColor_Internalname = sPrefix+"STPCOLOR_"+sGXsfl_41_fel_idx ;
      edtStp_hdr_Internalname = sPrefix+"STP_HDR_"+sGXsfl_41_fel_idx ;
      edtStp_r_Internalname = sPrefix+"STP_R_"+sGXsfl_41_fel_idx ;
      edtStp_p_Internalname = sPrefix+"STP_P_"+sGXsfl_41_fel_idx ;
   }

   public void sendrow_412( )
   {
      subsflControlProps_412( ) ;
      wb1C10( ) ;
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
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavAcciones.getEnabled()!=0)&&(cmbavAcciones.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 42,'"+sPrefix+"',false,'"+sGXsfl_41_idx+"',41)\"" : " ") ;
         if ( ( cmbavAcciones.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vACCIONES_" + sGXsfl_41_idx ;
            cmbavAcciones.setName( GXCCtl );
            cmbavAcciones.setWebtags( "" );
            if ( cmbavAcciones.getItemCount() > 0 )
            {
               AV56Acciones = (short)(GXutil.lval( cmbavAcciones.getValidValue(GXutil.trim( GXutil.str( AV56Acciones, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavAcciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56Acciones), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavAcciones,cmbavAcciones.getInternalname(),GXutil.trim( GXutil.str( AV56Acciones, 4, 0)),Integer.valueOf(1),cmbavAcciones.getJsonclick(),Integer.valueOf(5),"'"+sPrefix+"'"+",false,"+"'"+sPrefix+"EVACCIONES.CLICK."+sGXsfl_41_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO",cmbavAcciones.getColumnClass(),cmbavAcciones.getColumnHeaderClass(),TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavAcciones.getEnabled()!=0)&&(cmbavAcciones.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,42);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavAcciones.setValue( GXutil.trim( GXutil.str( AV56Acciones, 4, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavAcciones.getInternalname(), "Values", cmbavAcciones.ToJavascriptSource(), !bGXsfl_41_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtStp_Lin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtStp_Lin_Internalname,GXutil.ltrim( localUtil.ntoc( A10750Stp_Lin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A10750Stp_Lin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtStp_Lin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtStp_Lin_Columnclass,edtStp_Lin_Columnheaderclass,Integer.valueOf(edtStp_Lin_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtStp_Dia_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtStp_Dia_Internalname,localUtil.ttoc( A10751Stp_Dia, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A10751Stp_Dia, "99/99/99 99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtStp_Dia_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtStp_Dia_Columnclass,edtStp_Dia_Columnheaderclass,Integer.valueOf(edtStp_Dia_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtStp_Mot_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtStp_Mot_Internalname,A10752Stp_Mot,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtStp_Mot_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtStp_Mot_Columnclass,edtStp_Mot_Columnheaderclass,Integer.valueOf(edtStp_Mot_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(300),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtStpHdr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtStpHdr_Internalname,GXutil.rtrim( A13723StpHdr),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtStpHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtStpHdr_Columnclass,edtStpHdr_Columnheaderclass,Integer.valueOf(edtStpHdr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtStpClicod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtStpClicod_Internalname,GXutil.ltrim( localUtil.ntoc( A13726StpClicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13726StpClicod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtStpClicod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtStpClicod_Columnclass,edtStpClicod_Columnheaderclass,Integer.valueOf(edtStpClicod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtStpCliNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtStpCliNom_Internalname,GXutil.rtrim( A13727StpCliNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtStpCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtStpCliNom_Columnclass,edtStpCliNom_Columnheaderclass,Integer.valueOf(edtStpCliNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtStpBarser_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtStpBarser_Internalname,GXutil.rtrim( A13724StpBarser),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtStpBarser_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtStpBarser_Columnclass,edtStpBarser_Columnheaderclass,Integer.valueOf(edtStpBarser_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtStpBarserD_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtStpBarserD_Internalname,GXutil.rtrim( A13725StpBarserD),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtStpBarserD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtStpBarserD_Columnclass,edtStpBarserD_Columnheaderclass,Integer.valueOf(edtStpBarserD_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtStpColor_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtStpColor_Internalname,GXutil.rtrim( A13728StpColor),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtStpColor_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtStpColor_Columnclass,edtStpColor_Columnheaderclass,Integer.valueOf(edtStpColor_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtStp_hdr_Internalname,GXutil.ltrim( localUtil.ntoc( A10746Stp_hdr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A10746Stp_hdr), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtStp_hdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtStp_r_Internalname,GXutil.ltrim( localUtil.ntoc( A10747Stp_r, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A10747Stp_r), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtStp_r_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtStp_p_Internalname,GXutil.rtrim( A10748Stp_p),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtStp_p_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes1C12( ) ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ConvertToDDO"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtStp_Lin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "#") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtStp_Dia_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Dia", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtStp_Mot_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Motivo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtStpHdr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtStpClicod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtStpCliNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtStpBarser_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtStpBarserD_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtStpColor_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV56Acciones, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbavAcciones.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbavAcciones.getColumnHeaderClass()));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10750Stp_Lin, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtStp_Lin_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtStp_Lin_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtStp_Lin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A10751Stp_Dia, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtStp_Dia_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtStp_Dia_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtStp_Dia_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A10752Stp_Mot);
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtStp_Mot_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtStp_Mot_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtStp_Mot_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13723StpHdr));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtStpHdr_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtStpHdr_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtStpHdr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13726StpClicod, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtStpClicod_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtStpClicod_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtStpClicod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13727StpCliNom));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtStpCliNom_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtStpCliNom_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtStpCliNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13724StpBarser));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtStpBarser_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtStpBarser_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtStpBarser_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13725StpBarserD));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtStpBarserD_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtStpBarserD_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtStpBarserD_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13728StpColor));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtStpColor_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtStpColor_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtStpColor_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10746Stp_hdr, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10747Stp_r, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A10748Stp_p));
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
      cmbavAcciones.setInternalname( sPrefix+"vACCIONES" );
      edtStp_Lin_Internalname = sPrefix+"STP_LIN" ;
      edtStp_Dia_Internalname = sPrefix+"STP_DIA" ;
      edtStp_Mot_Internalname = sPrefix+"STP_MOT" ;
      edtStpHdr_Internalname = sPrefix+"STPHDR" ;
      edtStpClicod_Internalname = sPrefix+"STPCLICOD" ;
      edtStpCliNom_Internalname = sPrefix+"STPCLINOM" ;
      edtStpBarser_Internalname = sPrefix+"STPBARSER" ;
      edtStpBarserD_Internalname = sPrefix+"STPBARSERD" ;
      edtStpColor_Internalname = sPrefix+"STPCOLOR" ;
      edtStp_hdr_Internalname = sPrefix+"STP_HDR" ;
      edtStp_r_Internalname = sPrefix+"STP_R" ;
      edtStp_p_Internalname = sPrefix+"STP_P" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      edtavDdo_stp_diaauxdate_Internalname = sPrefix+"vDDO_STP_DIAAUXDATE" ;
      divDdo_stp_diaauxdates_Internalname = sPrefix+"DDO_STP_DIAAUXDATES" ;
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
      edtStp_p_Jsonclick = "" ;
      edtStp_r_Jsonclick = "" ;
      edtStp_hdr_Jsonclick = "" ;
      edtStpColor_Jsonclick = "" ;
      edtStpColor_Columnclass = "WWColumn hidden-xs" ;
      edtStpBarserD_Jsonclick = "" ;
      edtStpBarserD_Columnclass = "WWColumn hidden-xs" ;
      edtStpBarser_Jsonclick = "" ;
      edtStpBarser_Columnclass = "WWColumn hidden-xs" ;
      edtStpCliNom_Jsonclick = "" ;
      edtStpCliNom_Columnclass = "WWColumn hidden-xs" ;
      edtStpClicod_Jsonclick = "" ;
      edtStpClicod_Columnclass = "WWColumn hidden-xs" ;
      edtStpHdr_Jsonclick = "" ;
      edtStpHdr_Columnclass = "WWColumn" ;
      edtStp_Mot_Jsonclick = "" ;
      edtStp_Mot_Columnclass = "WWColumn hidden-xs" ;
      edtStp_Dia_Jsonclick = "" ;
      edtStp_Dia_Columnclass = "WWColumn" ;
      edtStp_Lin_Jsonclick = "" ;
      edtStp_Lin_Columnclass = "WWColumn hidden-xs" ;
      cmbavAcciones.setJsonclick( "" );
      cmbavAcciones.setVisible( -1 );
      cmbavAcciones.setEnabled( 1 );
      cmbavAcciones.setColumnClass( "WWActionGroupColumn" );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtStpColor_Columnheaderclass = "" ;
      edtStpBarserD_Columnheaderclass = "" ;
      edtStpBarser_Columnheaderclass = "" ;
      edtStpCliNom_Columnheaderclass = "" ;
      edtStpClicod_Columnheaderclass = "" ;
      edtStpHdr_Columnheaderclass = "" ;
      edtStp_Mot_Columnheaderclass = "" ;
      edtStp_Dia_Columnheaderclass = "" ;
      edtStp_Lin_Columnheaderclass = "" ;
      cmbavAcciones.setColumnHeaderClass( "" );
      edtStpColor_Visible = -1 ;
      edtStpBarserD_Visible = -1 ;
      edtStpBarser_Visible = -1 ;
      edtStpCliNom_Visible = -1 ;
      edtStpClicod_Visible = -1 ;
      edtStpHdr_Visible = -1 ;
      edtStp_Mot_Visible = -1 ;
      edtStp_Dia_Visible = -1 ;
      edtStp_Lin_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_stp_diaauxdate_Jsonclick = "" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "ActivarHdr_WCGetFilterData" ;
      Ddo_grid_Datalisttype = "||Dynamic|Dynamic||Dynamic|Dynamic|Dynamic|Dynamic" ;
      Ddo_grid_Includedatalist = "||T|T||T|T|T|T" ;
      Ddo_grid_Filterisrange = "T||||T||||" ;
      Ddo_grid_Filtertype = "Numeric|Date|Character|Character|Numeric|Character|Character|Character|Character" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T|T||||||" ;
      Ddo_grid_Columnssortvalues = "2|1|3||||||" ;
      Ddo_grid_Columnids = "1:Stp_Lin|2:Stp_Dia|3:Stp_Mot|4:StpHdr|5:StpClicod|6:StpCliNom|7:StpBarser|8:StpBarserDsc|9:StpColor" ;
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
      GXCCtl = "vACCIONES_" + sGXsfl_41_idx ;
      cmbavAcciones.setName( GXCCtl );
      cmbavAcciones.setWebtags( "" );
      if ( cmbavAcciones.getItemCount() > 0 )
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8DiaInicial',fld:'vDIAINICIAL',pic:''},{av:'AV9DiaInicial_to',fld:'vDIAINICIAL_TO',pic:''},{av:'AV18FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV29TFStp_Lin',fld:'vTFSTP_LIN',pic:'ZZZ9'},{av:'AV30TFStp_Lin_To',fld:'vTFSTP_LIN_TO',pic:'ZZZ9'},{av:'AV31TFStp_Dia',fld:'vTFSTP_DIA',pic:'99/99/99 99:99'},{av:'AV35TFStp_Mot',fld:'vTFSTP_MOT',pic:''},{av:'AV36TFStp_Mot_Sel',fld:'vTFSTP_MOT_SEL',pic:''},{av:'AV37TFStpHdr',fld:'vTFSTPHDR',pic:''},{av:'AV38TFStpHdr_Sel',fld:'vTFSTPHDR_SEL',pic:''},{av:'AV39TFStpClicod',fld:'vTFSTPCLICOD',pic:'ZZZZZ9'},{av:'AV40TFStpClicod_To',fld:'vTFSTPCLICOD_TO',pic:'ZZZZZ9'},{av:'AV41TFStpCliNom',fld:'vTFSTPCLINOM',pic:''},{av:'AV42TFStpCliNom_Sel',fld:'vTFSTPCLINOM_SEL',pic:''},{av:'AV43TFStpBarser',fld:'vTFSTPBARSER',pic:''},{av:'AV44TFStpBarser_Sel',fld:'vTFSTPBARSER_SEL',pic:''},{av:'AV45TFStpBarserDsc',fld:'vTFSTPBARSERDSC',pic:''},{av:'AV46TFStpBarserDsc_Sel',fld:'vTFSTPBARSERDSC_SEL',pic:''},{av:'AV47TFStpColor',fld:'vTFSTPCOLOR',pic:''},{av:'AV48TFStpColor_Sel',fld:'vTFSTPCOLOR_SEL',pic:''},{av:'AV77Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV15OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV16OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtStp_Lin_Visible',ctrl:'STP_LIN',prop:'Visible'},{av:'edtStp_Dia_Visible',ctrl:'STP_DIA',prop:'Visible'},{av:'edtStp_Mot_Visible',ctrl:'STP_MOT',prop:'Visible'},{av:'edtStpHdr_Visible',ctrl:'STPHDR',prop:'Visible'},{av:'edtStpClicod_Visible',ctrl:'STPCLICOD',prop:'Visible'},{av:'edtStpCliNom_Visible',ctrl:'STPCLINOM',prop:'Visible'},{av:'edtStpBarser_Visible',ctrl:'STPBARSER',prop:'Visible'},{av:'edtStpBarserD_Visible',ctrl:'STPBARSERD',prop:'Visible'},{av:'edtStpColor_Visible',ctrl:'STPCOLOR',prop:'Visible'},{av:'AV51GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV52GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavAcciones'},{av:'edtStp_Lin_Columnheaderclass',ctrl:'STP_LIN',prop:'Columnheaderclass'},{av:'edtStp_Dia_Columnheaderclass',ctrl:'STP_DIA',prop:'Columnheaderclass'},{av:'edtStp_Mot_Columnheaderclass',ctrl:'STP_MOT',prop:'Columnheaderclass'},{av:'edtStpHdr_Columnheaderclass',ctrl:'STPHDR',prop:'Columnheaderclass'},{av:'edtStpClicod_Columnheaderclass',ctrl:'STPCLICOD',prop:'Columnheaderclass'},{av:'edtStpCliNom_Columnheaderclass',ctrl:'STPCLINOM',prop:'Columnheaderclass'},{av:'edtStpBarser_Columnheaderclass',ctrl:'STPBARSER',prop:'Columnheaderclass'},{av:'edtStpBarserD_Columnheaderclass',ctrl:'STPBARSERD',prop:'Columnheaderclass'},{av:'edtStpColor_Columnheaderclass',ctrl:'STPCOLOR',prop:'Columnheaderclass'},{av:'AV26ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV13GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e121C12',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8DiaInicial',fld:'vDIAINICIAL',pic:''},{av:'AV9DiaInicial_to',fld:'vDIAINICIAL_TO',pic:''},{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV18FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV29TFStp_Lin',fld:'vTFSTP_LIN',pic:'ZZZ9'},{av:'AV30TFStp_Lin_To',fld:'vTFSTP_LIN_TO',pic:'ZZZ9'},{av:'AV31TFStp_Dia',fld:'vTFSTP_DIA',pic:'99/99/99 99:99'},{av:'AV35TFStp_Mot',fld:'vTFSTP_MOT',pic:''},{av:'AV36TFStp_Mot_Sel',fld:'vTFSTP_MOT_SEL',pic:''},{av:'AV37TFStpHdr',fld:'vTFSTPHDR',pic:''},{av:'AV38TFStpHdr_Sel',fld:'vTFSTPHDR_SEL',pic:''},{av:'AV39TFStpClicod',fld:'vTFSTPCLICOD',pic:'ZZZZZ9'},{av:'AV40TFStpClicod_To',fld:'vTFSTPCLICOD_TO',pic:'ZZZZZ9'},{av:'AV41TFStpCliNom',fld:'vTFSTPCLINOM',pic:''},{av:'AV42TFStpCliNom_Sel',fld:'vTFSTPCLINOM_SEL',pic:''},{av:'AV43TFStpBarser',fld:'vTFSTPBARSER',pic:''},{av:'AV44TFStpBarser_Sel',fld:'vTFSTPBARSER_SEL',pic:''},{av:'AV45TFStpBarserDsc',fld:'vTFSTPBARSERDSC',pic:''},{av:'AV46TFStpBarserDsc_Sel',fld:'vTFSTPBARSERDSC_SEL',pic:''},{av:'AV47TFStpColor',fld:'vTFSTPCOLOR',pic:''},{av:'AV48TFStpColor_Sel',fld:'vTFSTPCOLOR_SEL',pic:''},{av:'AV77Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV15OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV16OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e131C12',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8DiaInicial',fld:'vDIAINICIAL',pic:''},{av:'AV9DiaInicial_to',fld:'vDIAINICIAL_TO',pic:''},{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV18FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV29TFStp_Lin',fld:'vTFSTP_LIN',pic:'ZZZ9'},{av:'AV30TFStp_Lin_To',fld:'vTFSTP_LIN_TO',pic:'ZZZ9'},{av:'AV31TFStp_Dia',fld:'vTFSTP_DIA',pic:'99/99/99 99:99'},{av:'AV35TFStp_Mot',fld:'vTFSTP_MOT',pic:''},{av:'AV36TFStp_Mot_Sel',fld:'vTFSTP_MOT_SEL',pic:''},{av:'AV37TFStpHdr',fld:'vTFSTPHDR',pic:''},{av:'AV38TFStpHdr_Sel',fld:'vTFSTPHDR_SEL',pic:''},{av:'AV39TFStpClicod',fld:'vTFSTPCLICOD',pic:'ZZZZZ9'},{av:'AV40TFStpClicod_To',fld:'vTFSTPCLICOD_TO',pic:'ZZZZZ9'},{av:'AV41TFStpCliNom',fld:'vTFSTPCLINOM',pic:''},{av:'AV42TFStpCliNom_Sel',fld:'vTFSTPCLINOM_SEL',pic:''},{av:'AV43TFStpBarser',fld:'vTFSTPBARSER',pic:''},{av:'AV44TFStpBarser_Sel',fld:'vTFSTPBARSER_SEL',pic:''},{av:'AV45TFStpBarserDsc',fld:'vTFSTPBARSERDSC',pic:''},{av:'AV46TFStpBarserDsc_Sel',fld:'vTFSTPBARSERDSC_SEL',pic:''},{av:'AV47TFStpColor',fld:'vTFSTPCOLOR',pic:''},{av:'AV48TFStpColor_Sel',fld:'vTFSTPCOLOR_SEL',pic:''},{av:'AV77Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV15OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV16OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e141C12',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8DiaInicial',fld:'vDIAINICIAL',pic:''},{av:'AV9DiaInicial_to',fld:'vDIAINICIAL_TO',pic:''},{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV18FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV29TFStp_Lin',fld:'vTFSTP_LIN',pic:'ZZZ9'},{av:'AV30TFStp_Lin_To',fld:'vTFSTP_LIN_TO',pic:'ZZZ9'},{av:'AV31TFStp_Dia',fld:'vTFSTP_DIA',pic:'99/99/99 99:99'},{av:'AV35TFStp_Mot',fld:'vTFSTP_MOT',pic:''},{av:'AV36TFStp_Mot_Sel',fld:'vTFSTP_MOT_SEL',pic:''},{av:'AV37TFStpHdr',fld:'vTFSTPHDR',pic:''},{av:'AV38TFStpHdr_Sel',fld:'vTFSTPHDR_SEL',pic:''},{av:'AV39TFStpClicod',fld:'vTFSTPCLICOD',pic:'ZZZZZ9'},{av:'AV40TFStpClicod_To',fld:'vTFSTPCLICOD_TO',pic:'ZZZZZ9'},{av:'AV41TFStpCliNom',fld:'vTFSTPCLINOM',pic:''},{av:'AV42TFStpCliNom_Sel',fld:'vTFSTPCLINOM_SEL',pic:''},{av:'AV43TFStpBarser',fld:'vTFSTPBARSER',pic:''},{av:'AV44TFStpBarser_Sel',fld:'vTFSTPBARSER_SEL',pic:''},{av:'AV45TFStpBarserDsc',fld:'vTFSTPBARSERDSC',pic:''},{av:'AV46TFStpBarserDsc_Sel',fld:'vTFSTPBARSERDSC_SEL',pic:''},{av:'AV47TFStpColor',fld:'vTFSTPCOLOR',pic:''},{av:'AV48TFStpColor_Sel',fld:'vTFSTPCOLOR_SEL',pic:''},{av:'AV77Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV15OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV16OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV15OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV16OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV47TFStpColor',fld:'vTFSTPCOLOR',pic:''},{av:'AV48TFStpColor_Sel',fld:'vTFSTPCOLOR_SEL',pic:''},{av:'AV45TFStpBarserDsc',fld:'vTFSTPBARSERDSC',pic:''},{av:'AV46TFStpBarserDsc_Sel',fld:'vTFSTPBARSERDSC_SEL',pic:''},{av:'AV43TFStpBarser',fld:'vTFSTPBARSER',pic:''},{av:'AV44TFStpBarser_Sel',fld:'vTFSTPBARSER_SEL',pic:''},{av:'AV41TFStpCliNom',fld:'vTFSTPCLINOM',pic:''},{av:'AV42TFStpCliNom_Sel',fld:'vTFSTPCLINOM_SEL',pic:''},{av:'AV39TFStpClicod',fld:'vTFSTPCLICOD',pic:'ZZZZZ9'},{av:'AV40TFStpClicod_To',fld:'vTFSTPCLICOD_TO',pic:'ZZZZZ9'},{av:'AV37TFStpHdr',fld:'vTFSTPHDR',pic:''},{av:'AV38TFStpHdr_Sel',fld:'vTFSTPHDR_SEL',pic:''},{av:'AV35TFStp_Mot',fld:'vTFSTP_MOT',pic:''},{av:'AV36TFStp_Mot_Sel',fld:'vTFSTP_MOT_SEL',pic:''},{av:'AV31TFStp_Dia',fld:'vTFSTP_DIA',pic:'99/99/99 99:99'},{av:'AV29TFStp_Lin',fld:'vTFSTP_LIN',pic:'ZZZ9'},{av:'AV30TFStp_Lin_To',fld:'vTFSTP_LIN_TO',pic:'ZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e201C12',iparms:[{av:'A10755Stp_Est',fld:'STP_EST',pic:'9'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavAcciones'},{av:'AV56Acciones',fld:'vACCIONES',pic:'ZZZ9'},{av:'edtStp_Lin_Columnclass',ctrl:'STP_LIN',prop:'Columnclass'},{av:'edtStp_Dia_Columnclass',ctrl:'STP_DIA',prop:'Columnclass'},{av:'edtStp_Mot_Columnclass',ctrl:'STP_MOT',prop:'Columnclass'},{av:'edtStpHdr_Columnclass',ctrl:'STPHDR',prop:'Columnclass'},{av:'edtStpClicod_Columnclass',ctrl:'STPCLICOD',prop:'Columnclass'},{av:'edtStpCliNom_Columnclass',ctrl:'STPCLINOM',prop:'Columnclass'},{av:'edtStpBarser_Columnclass',ctrl:'STPBARSER',prop:'Columnclass'},{av:'edtStpBarserD_Columnclass',ctrl:'STPBARSERD',prop:'Columnclass'},{av:'edtStpColor_Columnclass',ctrl:'STPCOLOR',prop:'Columnclass'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e151C12',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8DiaInicial',fld:'vDIAINICIAL',pic:''},{av:'AV9DiaInicial_to',fld:'vDIAINICIAL_TO',pic:''},{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV18FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV29TFStp_Lin',fld:'vTFSTP_LIN',pic:'ZZZ9'},{av:'AV30TFStp_Lin_To',fld:'vTFSTP_LIN_TO',pic:'ZZZ9'},{av:'AV31TFStp_Dia',fld:'vTFSTP_DIA',pic:'99/99/99 99:99'},{av:'AV35TFStp_Mot',fld:'vTFSTP_MOT',pic:''},{av:'AV36TFStp_Mot_Sel',fld:'vTFSTP_MOT_SEL',pic:''},{av:'AV37TFStpHdr',fld:'vTFSTPHDR',pic:''},{av:'AV38TFStpHdr_Sel',fld:'vTFSTPHDR_SEL',pic:''},{av:'AV39TFStpClicod',fld:'vTFSTPCLICOD',pic:'ZZZZZ9'},{av:'AV40TFStpClicod_To',fld:'vTFSTPCLICOD_TO',pic:'ZZZZZ9'},{av:'AV41TFStpCliNom',fld:'vTFSTPCLINOM',pic:''},{av:'AV42TFStpCliNom_Sel',fld:'vTFSTPCLINOM_SEL',pic:''},{av:'AV43TFStpBarser',fld:'vTFSTPBARSER',pic:''},{av:'AV44TFStpBarser_Sel',fld:'vTFSTPBARSER_SEL',pic:''},{av:'AV45TFStpBarserDsc',fld:'vTFSTPBARSERDSC',pic:''},{av:'AV46TFStpBarserDsc_Sel',fld:'vTFSTPBARSERDSC_SEL',pic:''},{av:'AV47TFStpColor',fld:'vTFSTPCOLOR',pic:''},{av:'AV48TFStpColor_Sel',fld:'vTFSTPCOLOR_SEL',pic:''},{av:'AV77Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV15OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV16OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtStp_Lin_Visible',ctrl:'STP_LIN',prop:'Visible'},{av:'edtStp_Dia_Visible',ctrl:'STP_DIA',prop:'Visible'},{av:'edtStp_Mot_Visible',ctrl:'STP_MOT',prop:'Visible'},{av:'edtStpHdr_Visible',ctrl:'STPHDR',prop:'Visible'},{av:'edtStpClicod_Visible',ctrl:'STPCLICOD',prop:'Visible'},{av:'edtStpCliNom_Visible',ctrl:'STPCLINOM',prop:'Visible'},{av:'edtStpBarser_Visible',ctrl:'STPBARSER',prop:'Visible'},{av:'edtStpBarserD_Visible',ctrl:'STPBARSERD',prop:'Visible'},{av:'edtStpColor_Visible',ctrl:'STPCOLOR',prop:'Visible'},{av:'AV51GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV52GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavAcciones'},{av:'edtStp_Lin_Columnheaderclass',ctrl:'STP_LIN',prop:'Columnheaderclass'},{av:'edtStp_Dia_Columnheaderclass',ctrl:'STP_DIA',prop:'Columnheaderclass'},{av:'edtStp_Mot_Columnheaderclass',ctrl:'STP_MOT',prop:'Columnheaderclass'},{av:'edtStpHdr_Columnheaderclass',ctrl:'STPHDR',prop:'Columnheaderclass'},{av:'edtStpClicod_Columnheaderclass',ctrl:'STPCLICOD',prop:'Columnheaderclass'},{av:'edtStpCliNom_Columnheaderclass',ctrl:'STPCLINOM',prop:'Columnheaderclass'},{av:'edtStpBarser_Columnheaderclass',ctrl:'STPBARSER',prop:'Columnheaderclass'},{av:'edtStpBarserD_Columnheaderclass',ctrl:'STPBARSERD',prop:'Columnheaderclass'},{av:'edtStpColor_Columnheaderclass',ctrl:'STPCOLOR',prop:'Columnheaderclass'},{av:'AV26ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV13GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e111C12',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8DiaInicial',fld:'vDIAINICIAL',pic:''},{av:'AV9DiaInicial_to',fld:'vDIAINICIAL_TO',pic:''},{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV18FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV29TFStp_Lin',fld:'vTFSTP_LIN',pic:'ZZZ9'},{av:'AV30TFStp_Lin_To',fld:'vTFSTP_LIN_TO',pic:'ZZZ9'},{av:'AV31TFStp_Dia',fld:'vTFSTP_DIA',pic:'99/99/99 99:99'},{av:'AV35TFStp_Mot',fld:'vTFSTP_MOT',pic:''},{av:'AV36TFStp_Mot_Sel',fld:'vTFSTP_MOT_SEL',pic:''},{av:'AV37TFStpHdr',fld:'vTFSTPHDR',pic:''},{av:'AV38TFStpHdr_Sel',fld:'vTFSTPHDR_SEL',pic:''},{av:'AV39TFStpClicod',fld:'vTFSTPCLICOD',pic:'ZZZZZ9'},{av:'AV40TFStpClicod_To',fld:'vTFSTPCLICOD_TO',pic:'ZZZZZ9'},{av:'AV41TFStpCliNom',fld:'vTFSTPCLINOM',pic:''},{av:'AV42TFStpCliNom_Sel',fld:'vTFSTPCLINOM_SEL',pic:''},{av:'AV43TFStpBarser',fld:'vTFSTPBARSER',pic:''},{av:'AV44TFStpBarser_Sel',fld:'vTFSTPBARSER_SEL',pic:''},{av:'AV45TFStpBarserDsc',fld:'vTFSTPBARSERDSC',pic:''},{av:'AV46TFStpBarserDsc_Sel',fld:'vTFSTPBARSERDSC_SEL',pic:''},{av:'AV47TFStpColor',fld:'vTFSTPCOLOR',pic:''},{av:'AV48TFStpColor_Sel',fld:'vTFSTPCOLOR_SEL',pic:''},{av:'AV77Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV15OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV16OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV13GridState',fld:'vGRIDSTATE',pic:''},{av:'AV33DDO_Stp_DiaAuxDate',fld:'vDDO_STP_DIAAUXDATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV13GridState',fld:'vGRIDSTATE',pic:''},{av:'AV15OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV16OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV18FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV29TFStp_Lin',fld:'vTFSTP_LIN',pic:'ZZZ9'},{av:'AV30TFStp_Lin_To',fld:'vTFSTP_LIN_TO',pic:'ZZZ9'},{av:'AV31TFStp_Dia',fld:'vTFSTP_DIA',pic:'99/99/99 99:99'},{av:'AV35TFStp_Mot',fld:'vTFSTP_MOT',pic:''},{av:'AV36TFStp_Mot_Sel',fld:'vTFSTP_MOT_SEL',pic:''},{av:'AV37TFStpHdr',fld:'vTFSTPHDR',pic:''},{av:'AV38TFStpHdr_Sel',fld:'vTFSTPHDR_SEL',pic:''},{av:'AV39TFStpClicod',fld:'vTFSTPCLICOD',pic:'ZZZZZ9'},{av:'AV40TFStpClicod_To',fld:'vTFSTPCLICOD_TO',pic:'ZZZZZ9'},{av:'AV41TFStpCliNom',fld:'vTFSTPCLINOM',pic:''},{av:'AV42TFStpCliNom_Sel',fld:'vTFSTPCLINOM_SEL',pic:''},{av:'AV43TFStpBarser',fld:'vTFSTPBARSER',pic:''},{av:'AV44TFStpBarser_Sel',fld:'vTFSTPBARSER_SEL',pic:''},{av:'AV45TFStpBarserDsc',fld:'vTFSTPBARSERDSC',pic:''},{av:'AV46TFStpBarserDsc_Sel',fld:'vTFSTPBARSERDSC_SEL',pic:''},{av:'AV47TFStpColor',fld:'vTFSTPCOLOR',pic:''},{av:'AV48TFStpColor_Sel',fld:'vTFSTPCOLOR_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV33DDO_Stp_DiaAuxDate',fld:'vDDO_STP_DIAAUXDATE',pic:''},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtStp_Lin_Visible',ctrl:'STP_LIN',prop:'Visible'},{av:'edtStp_Dia_Visible',ctrl:'STP_DIA',prop:'Visible'},{av:'edtStp_Mot_Visible',ctrl:'STP_MOT',prop:'Visible'},{av:'edtStpHdr_Visible',ctrl:'STPHDR',prop:'Visible'},{av:'edtStpClicod_Visible',ctrl:'STPCLICOD',prop:'Visible'},{av:'edtStpCliNom_Visible',ctrl:'STPCLINOM',prop:'Visible'},{av:'edtStpBarser_Visible',ctrl:'STPBARSER',prop:'Visible'},{av:'edtStpBarserD_Visible',ctrl:'STPBARSERD',prop:'Visible'},{av:'edtStpColor_Visible',ctrl:'STPCOLOR',prop:'Visible'},{av:'AV51GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV52GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavAcciones'},{av:'edtStp_Lin_Columnheaderclass',ctrl:'STP_LIN',prop:'Columnheaderclass'},{av:'edtStp_Dia_Columnheaderclass',ctrl:'STP_DIA',prop:'Columnheaderclass'},{av:'edtStp_Mot_Columnheaderclass',ctrl:'STP_MOT',prop:'Columnheaderclass'},{av:'edtStpHdr_Columnheaderclass',ctrl:'STPHDR',prop:'Columnheaderclass'},{av:'edtStpClicod_Columnheaderclass',ctrl:'STPCLICOD',prop:'Columnheaderclass'},{av:'edtStpCliNom_Columnheaderclass',ctrl:'STPCLINOM',prop:'Columnheaderclass'},{av:'edtStpBarser_Columnheaderclass',ctrl:'STPBARSER',prop:'Columnheaderclass'},{av:'edtStpBarserD_Columnheaderclass',ctrl:'STPBARSERD',prop:'Columnheaderclass'},{av:'edtStpColor_Columnheaderclass',ctrl:'STPCOLOR',prop:'Columnheaderclass'},{av:'AV26ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VACCIONES.CLICK","{handler:'e211C12',iparms:[{av:'cmbavAcciones'},{av:'AV56Acciones',fld:'vACCIONES',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8DiaInicial',fld:'vDIAINICIAL',pic:''},{av:'AV9DiaInicial_to',fld:'vDIAINICIAL_TO',pic:''},{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV18FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV29TFStp_Lin',fld:'vTFSTP_LIN',pic:'ZZZ9'},{av:'AV30TFStp_Lin_To',fld:'vTFSTP_LIN_TO',pic:'ZZZ9'},{av:'AV31TFStp_Dia',fld:'vTFSTP_DIA',pic:'99/99/99 99:99'},{av:'AV35TFStp_Mot',fld:'vTFSTP_MOT',pic:''},{av:'AV36TFStp_Mot_Sel',fld:'vTFSTP_MOT_SEL',pic:''},{av:'AV37TFStpHdr',fld:'vTFSTPHDR',pic:''},{av:'AV38TFStpHdr_Sel',fld:'vTFSTPHDR_SEL',pic:''},{av:'AV39TFStpClicod',fld:'vTFSTPCLICOD',pic:'ZZZZZ9'},{av:'AV40TFStpClicod_To',fld:'vTFSTPCLICOD_TO',pic:'ZZZZZ9'},{av:'AV41TFStpCliNom',fld:'vTFSTPCLINOM',pic:''},{av:'AV42TFStpCliNom_Sel',fld:'vTFSTPCLINOM_SEL',pic:''},{av:'AV43TFStpBarser',fld:'vTFSTPBARSER',pic:''},{av:'AV44TFStpBarser_Sel',fld:'vTFSTPBARSER_SEL',pic:''},{av:'AV45TFStpBarserDsc',fld:'vTFSTPBARSERDSC',pic:''},{av:'AV46TFStpBarserDsc_Sel',fld:'vTFSTPBARSERDSC_SEL',pic:''},{av:'AV47TFStpColor',fld:'vTFSTPCOLOR',pic:''},{av:'AV48TFStpColor_Sel',fld:'vTFSTPCOLOR_SEL',pic:''},{av:'AV77Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV15OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV16OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A10746Stp_hdr',fld:'STP_HDR',pic:'ZZZZZZZ9'},{av:'A10747Stp_r',fld:'STP_R',pic:'9'},{av:'A10748Stp_p',fld:'STP_P',pic:''},{av:'AV55UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV53Station',fld:'vSTATION',pic:''}]");
      setEventMetadata("VACCIONES.CLICK",",oparms:[{av:'cmbavAcciones'},{av:'AV56Acciones',fld:'vACCIONES',pic:'ZZZ9'},{av:'AV53Station',fld:'vSTATION',pic:''},{av:'AV55UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'A10748Stp_p',fld:'STP_P',pic:''},{av:'A10747Stp_r',fld:'STP_R',pic:'9'},{av:'A10746Stp_hdr',fld:'STP_HDR',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtStp_Lin_Visible',ctrl:'STP_LIN',prop:'Visible'},{av:'edtStp_Dia_Visible',ctrl:'STP_DIA',prop:'Visible'},{av:'edtStp_Mot_Visible',ctrl:'STP_MOT',prop:'Visible'},{av:'edtStpHdr_Visible',ctrl:'STPHDR',prop:'Visible'},{av:'edtStpClicod_Visible',ctrl:'STPCLICOD',prop:'Visible'},{av:'edtStpCliNom_Visible',ctrl:'STPCLINOM',prop:'Visible'},{av:'edtStpBarser_Visible',ctrl:'STPBARSER',prop:'Visible'},{av:'edtStpBarserD_Visible',ctrl:'STPBARSERD',prop:'Visible'},{av:'edtStpColor_Visible',ctrl:'STPCOLOR',prop:'Visible'},{av:'AV51GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV52GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtStp_Lin_Columnheaderclass',ctrl:'STP_LIN',prop:'Columnheaderclass'},{av:'edtStp_Dia_Columnheaderclass',ctrl:'STP_DIA',prop:'Columnheaderclass'},{av:'edtStp_Mot_Columnheaderclass',ctrl:'STP_MOT',prop:'Columnheaderclass'},{av:'edtStpHdr_Columnheaderclass',ctrl:'STPHDR',prop:'Columnheaderclass'},{av:'edtStpClicod_Columnheaderclass',ctrl:'STPCLICOD',prop:'Columnheaderclass'},{av:'edtStpCliNom_Columnheaderclass',ctrl:'STPCLINOM',prop:'Columnheaderclass'},{av:'edtStpBarser_Columnheaderclass',ctrl:'STPBARSER',prop:'Columnheaderclass'},{av:'edtStpBarserD_Columnheaderclass',ctrl:'STPBARSERD',prop:'Columnheaderclass'},{av:'edtStpColor_Columnheaderclass',ctrl:'STPCOLOR',prop:'Columnheaderclass'},{av:'AV26ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV13GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e161C12',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e171C12',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VALID_STP_DIA","{handler:'valid_Stp_dia',iparms:[]");
      setEventMetadata("VALID_STP_DIA",",oparms:[]}");
      setEventMetadata("VALID_STP_HDR","{handler:'valid_Stp_hdr',iparms:[]");
      setEventMetadata("VALID_STP_HDR",",oparms:[]}");
      setEventMetadata("VALID_STP_R","{handler:'valid_Stp_r',iparms:[]");
      setEventMetadata("VALID_STP_R",",oparms:[]}");
      setEventMetadata("VALID_STP_P","{handler:'valid_Stp_p',iparms:[]");
      setEventMetadata("VALID_STP_P",",oparms:[]}");
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
      wcpOAV7Emprcod = "" ;
      wcpOAV8DiaInicial = GXutil.nullDate() ;
      wcpOAV9DiaInicial_to = GXutil.nullDate() ;
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
      AV7Emprcod = "" ;
      AV8DiaInicial = GXutil.nullDate() ;
      AV9DiaInicial_to = GXutil.nullDate() ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV18FilterFullText = "" ;
      AV31TFStp_Dia = GXutil.resetTime( GXutil.nullDate() );
      AV35TFStp_Mot = "" ;
      AV36TFStp_Mot_Sel = "" ;
      AV37TFStpHdr = "" ;
      AV38TFStpHdr_Sel = "" ;
      AV41TFStpCliNom = "" ;
      AV42TFStpCliNom_Sel = "" ;
      AV43TFStpBarser = "" ;
      AV44TFStpBarser_Sel = "" ;
      AV45TFStpBarserDsc = "" ;
      AV46TFStpBarserDsc_Sel = "" ;
      AV47TFStpColor = "" ;
      AV48TFStpColor_Sel = "" ;
      AV77Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV26ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV49DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV13GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      A396EmprCod = "" ;
      AV55UsurCod = "" ;
      AV53Station = "" ;
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
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV33DDO_Stp_DiaAuxDate = GXutil.nullDate() ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A10751Stp_Dia = GXutil.resetTime( GXutil.nullDate() );
      A10752Stp_Mot = "" ;
      A13723StpHdr = "" ;
      A13727StpCliNom = "" ;
      A13724StpBarser = "" ;
      A13725StpBarserD = "" ;
      A13728StpColor = "" ;
      A10748Stp_p = "" ;
      AV59Activarhdr_wcds_1_filterfulltext = "" ;
      AV62Activarhdr_wcds_4_tfstp_dia = GXutil.resetTime( GXutil.nullDate() );
      AV63Activarhdr_wcds_5_tfstp_mot = "" ;
      AV64Activarhdr_wcds_6_tfstp_mot_sel = "" ;
      AV65Activarhdr_wcds_7_tfstphdr = "" ;
      AV66Activarhdr_wcds_8_tfstphdr_sel = "" ;
      AV69Activarhdr_wcds_11_tfstpclinom = "" ;
      AV70Activarhdr_wcds_12_tfstpclinom_sel = "" ;
      AV71Activarhdr_wcds_13_tfstpbarser = "" ;
      AV72Activarhdr_wcds_14_tfstpbarser_sel = "" ;
      AV73Activarhdr_wcds_15_tfstpbarserdsc = "" ;
      AV74Activarhdr_wcds_16_tfstpbarserdsc_sel = "" ;
      AV75Activarhdr_wcds_17_tfstpcolor = "" ;
      AV76Activarhdr_wcds_18_tfstpcolor_sel = "" ;
      scmdbuf = "" ;
      lV59Activarhdr_wcds_1_filterfulltext = "" ;
      lV69Activarhdr_wcds_11_tfstpclinom = "" ;
      lV71Activarhdr_wcds_13_tfstpbarser = "" ;
      lV73Activarhdr_wcds_15_tfstpbarserdsc = "" ;
      lV75Activarhdr_wcds_17_tfstpcolor = "" ;
      lV63Activarhdr_wcds_5_tfstp_mot = "" ;
      lV65Activarhdr_wcds_7_tfstphdr = "" ;
      H01C13_A129BarCod = new int[1] ;
      H01C13_A132BarCodReo = new byte[1] ;
      H01C13_A130BarCodPar = new String[] {""} ;
      H01C13_A396EmprCod = new String[] {""} ;
      H01C13_A10755Stp_Est = new byte[1] ;
      H01C13_A13723StpHdr = new String[] {""} ;
      H01C13_A10752Stp_Mot = new String[] {""} ;
      H01C13_A10751Stp_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      H01C13_A10750Stp_Lin = new short[1] ;
      H01C13_A13728StpColor = new String[] {""} ;
      H01C13_n13728StpColor = new boolean[] {false} ;
      H01C13_A13725StpBarserD = new String[] {""} ;
      H01C13_n13725StpBarserD = new boolean[] {false} ;
      H01C13_A13724StpBarser = new String[] {""} ;
      H01C13_n13724StpBarser = new boolean[] {false} ;
      H01C13_A13727StpCliNom = new String[] {""} ;
      H01C13_n13727StpCliNom = new boolean[] {false} ;
      H01C13_A13726StpClicod = new int[1] ;
      H01C13_n13726StpClicod = new boolean[] {false} ;
      H01C13_A10746Stp_hdr = new int[1] ;
      H01C13_A10747Stp_r = new byte[1] ;
      H01C13_A10748Stp_p = new String[] {""} ;
      H01C15_A129BarCod = new int[1] ;
      H01C15_A132BarCodReo = new byte[1] ;
      H01C15_A130BarCodPar = new String[] {""} ;
      H01C15_A396EmprCod = new String[] {""} ;
      H01C15_A10755Stp_Est = new byte[1] ;
      H01C15_A13723StpHdr = new String[] {""} ;
      H01C15_A10752Stp_Mot = new String[] {""} ;
      H01C15_A10751Stp_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      H01C15_A10750Stp_Lin = new short[1] ;
      H01C15_A13728StpColor = new String[] {""} ;
      H01C15_n13728StpColor = new boolean[] {false} ;
      H01C15_A13725StpBarserD = new String[] {""} ;
      H01C15_n13725StpBarserD = new boolean[] {false} ;
      H01C15_A13724StpBarser = new String[] {""} ;
      H01C15_n13724StpBarser = new boolean[] {false} ;
      H01C15_A13727StpCliNom = new String[] {""} ;
      H01C15_n13727StpCliNom = new boolean[] {false} ;
      H01C15_A13726StpClicod = new int[1] ;
      H01C15_n13726StpClicod = new boolean[] {false} ;
      H01C15_A10746Stp_hdr = new int[1] ;
      H01C15_A10747Stp_r = new byte[1] ;
      H01C15_A10748Stp_p = new String[] {""} ;
      AV54EmprNom = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV25Session = httpContext.getWebSession();
      AV21ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV27ManageFiltersXml = "" ;
      AV19ExcelFilename = "" ;
      AV20ErrorMessage = "" ;
      AV22UserCustomValue = "" ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = new GXBaseCollection[1] ;
      AV14GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
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
      GXv_SdtWWPGridState20 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV11TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV10HTTPRequest = httpContext.getHttpRequest();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV7Emprcod = "" ;
      sCtrlAV8DiaInicial = "" ;
      sCtrlAV9DiaInicial_to = "" ;
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.activarhdr_wc__default(),
         new Object[] {
             new Object[] {
            H01C13_A129BarCod, H01C13_A132BarCodReo, H01C13_A130BarCodPar, H01C13_A396EmprCod, H01C13_A10755Stp_Est, H01C13_A13723StpHdr, H01C13_A10752Stp_Mot, H01C13_A10751Stp_Dia, H01C13_A10750Stp_Lin, H01C13_A13728StpColor,
            H01C13_n13728StpColor, H01C13_A13725StpBarserD, H01C13_n13725StpBarserD, H01C13_A13724StpBarser, H01C13_n13724StpBarser, H01C13_A13727StpCliNom, H01C13_n13727StpCliNom, H01C13_A13726StpClicod, H01C13_n13726StpClicod, H01C13_A10746Stp_hdr,
            H01C13_A10747Stp_r, H01C13_A10748Stp_p
            }
            , new Object[] {
            H01C15_A129BarCod, H01C15_A132BarCodReo, H01C15_A130BarCodPar, H01C15_A396EmprCod, H01C15_A10755Stp_Est, H01C15_A13723StpHdr, H01C15_A10752Stp_Mot, H01C15_A10751Stp_Dia, H01C15_A10750Stp_Lin, H01C15_A13728StpColor,
            H01C15_n13728StpColor, H01C15_A13725StpBarserD, H01C15_n13725StpBarserD, H01C15_A13724StpBarser, H01C15_n13724StpBarser, H01C15_A13727StpCliNom, H01C15_n13727StpCliNom, H01C15_A13726StpClicod, H01C15_n13726StpClicod, H01C15_A10746Stp_hdr,
            H01C15_A10747Stp_r, H01C15_A10748Stp_p
            }
         }
      );
      AV77Pgmname = "ActivarHdr_WC" ;
      /* GeneXus formulas. */
      AV77Pgmname = "ActivarHdr_WC" ;
      Gx_err = (short)(0) ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV28ManageFiltersExecutionStep ;
   private byte A10755Stp_Est ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A10747Stp_r ;
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
   private short AV29TFStp_Lin ;
   private short AV30TFStp_Lin_To ;
   private short AV15OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV56Acciones ;
   private short A10750Stp_Lin ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV60Activarhdr_wcds_2_tfstp_lin ;
   private short AV61Activarhdr_wcds_3_tfstp_lin_to ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_41 ;
   private int nGXsfl_41_idx=1 ;
   private int AV39TFStpClicod ;
   private int AV40TFStpClicod_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int A13726StpClicod ;
   private int A10746Stp_hdr ;
   private int subGrid_Islastpage ;
   private int AV67Activarhdr_wcds_9_tfstpclicod ;
   private int AV68Activarhdr_wcds_10_tfstpclicod_to ;
   private int edtStp_Lin_Visible ;
   private int edtStp_Dia_Visible ;
   private int edtStp_Mot_Visible ;
   private int edtStpHdr_Visible ;
   private int edtStpClicod_Visible ;
   private int edtStpCliNom_Visible ;
   private int edtStpBarser_Visible ;
   private int edtStpBarserD_Visible ;
   private int edtStpColor_Visible ;
   private int AV50PageToGo ;
   private int AV78GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV51GridCurrentPage ;
   private long AV52GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String wcpOAV7Emprcod ;
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
   private String AV7Emprcod ;
   private String sGXsfl_41_idx="0001" ;
   private String AV37TFStpHdr ;
   private String AV38TFStpHdr_Sel ;
   private String AV41TFStpCliNom ;
   private String AV42TFStpCliNom_Sel ;
   private String AV43TFStpBarser ;
   private String AV44TFStpBarser_Sel ;
   private String AV45TFStpBarserDsc ;
   private String AV46TFStpBarserDsc_Sel ;
   private String AV47TFStpColor ;
   private String AV48TFStpColor_Sel ;
   private String AV77Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
   private String AV55UsurCod ;
   private String AV53Station ;
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
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_stp_diaauxdates_Internalname ;
   private String edtavDdo_stp_diaauxdate_Internalname ;
   private String edtavDdo_stp_diaauxdate_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtStp_Lin_Internalname ;
   private String edtStp_Dia_Internalname ;
   private String edtStp_Mot_Internalname ;
   private String A13723StpHdr ;
   private String edtStpHdr_Internalname ;
   private String edtStpClicod_Internalname ;
   private String A13727StpCliNom ;
   private String edtStpCliNom_Internalname ;
   private String A13724StpBarser ;
   private String edtStpBarser_Internalname ;
   private String A13725StpBarserD ;
   private String edtStpBarserD_Internalname ;
   private String A13728StpColor ;
   private String edtStpColor_Internalname ;
   private String edtStp_hdr_Internalname ;
   private String edtStp_r_Internalname ;
   private String A10748Stp_p ;
   private String edtStp_p_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String AV65Activarhdr_wcds_7_tfstphdr ;
   private String AV66Activarhdr_wcds_8_tfstphdr_sel ;
   private String AV69Activarhdr_wcds_11_tfstpclinom ;
   private String AV70Activarhdr_wcds_12_tfstpclinom_sel ;
   private String AV71Activarhdr_wcds_13_tfstpbarser ;
   private String AV72Activarhdr_wcds_14_tfstpbarser_sel ;
   private String AV73Activarhdr_wcds_15_tfstpbarserdsc ;
   private String AV74Activarhdr_wcds_16_tfstpbarserdsc_sel ;
   private String AV75Activarhdr_wcds_17_tfstpcolor ;
   private String AV76Activarhdr_wcds_18_tfstpcolor_sel ;
   private String scmdbuf ;
   private String lV69Activarhdr_wcds_11_tfstpclinom ;
   private String lV71Activarhdr_wcds_13_tfstpbarser ;
   private String lV73Activarhdr_wcds_15_tfstpbarserdsc ;
   private String lV75Activarhdr_wcds_17_tfstpcolor ;
   private String lV65Activarhdr_wcds_7_tfstphdr ;
   private String AV54EmprNom ;
   private String edtStp_Lin_Columnheaderclass ;
   private String edtStp_Dia_Columnheaderclass ;
   private String edtStp_Mot_Columnheaderclass ;
   private String edtStpHdr_Columnheaderclass ;
   private String edtStpClicod_Columnheaderclass ;
   private String edtStpCliNom_Columnheaderclass ;
   private String edtStpBarser_Columnheaderclass ;
   private String edtStpBarserD_Columnheaderclass ;
   private String edtStpColor_Columnheaderclass ;
   private String edtStp_Lin_Columnclass ;
   private String edtStp_Dia_Columnclass ;
   private String edtStp_Mot_Columnclass ;
   private String edtStpHdr_Columnclass ;
   private String edtStpClicod_Columnclass ;
   private String edtStpCliNom_Columnclass ;
   private String edtStpBarser_Columnclass ;
   private String edtStpBarserD_Columnclass ;
   private String edtStpColor_Columnclass ;
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
   private String sCtrlAV7Emprcod ;
   private String sCtrlAV8DiaInicial ;
   private String sCtrlAV9DiaInicial_to ;
   private String sGXsfl_41_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtStp_Lin_Jsonclick ;
   private String edtStp_Dia_Jsonclick ;
   private String edtStp_Mot_Jsonclick ;
   private String edtStpHdr_Jsonclick ;
   private String edtStpClicod_Jsonclick ;
   private String edtStpCliNom_Jsonclick ;
   private String edtStpBarser_Jsonclick ;
   private String edtStpBarserD_Jsonclick ;
   private String edtStpColor_Jsonclick ;
   private String edtStp_hdr_Jsonclick ;
   private String edtStp_r_Jsonclick ;
   private String edtStp_p_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV31TFStp_Dia ;
   private java.util.Date A10751Stp_Dia ;
   private java.util.Date AV62Activarhdr_wcds_4_tfstp_dia ;
   private java.util.Date wcpOAV8DiaInicial ;
   private java.util.Date wcpOAV9DiaInicial_to ;
   private java.util.Date AV8DiaInicial ;
   private java.util.Date AV9DiaInicial_to ;
   private java.util.Date AV33DDO_Stp_DiaAuxDate ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV16OrderedDsc ;
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
   private boolean n13726StpClicod ;
   private boolean n13727StpCliNom ;
   private boolean n13724StpBarser ;
   private boolean n13725StpBarserD ;
   private boolean n13728StpColor ;
   private boolean bGXsfl_41_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV21ColumnsSelectorXML ;
   private String AV27ManageFiltersXml ;
   private String AV22UserCustomValue ;
   private String AV18FilterFullText ;
   private String AV35TFStp_Mot ;
   private String AV36TFStp_Mot_Sel ;
   private String A10752Stp_Mot ;
   private String AV59Activarhdr_wcds_1_filterfulltext ;
   private String AV63Activarhdr_wcds_5_tfstp_mot ;
   private String AV64Activarhdr_wcds_6_tfstp_mot_sel ;
   private String lV59Activarhdr_wcds_1_filterfulltext ;
   private String lV63Activarhdr_wcds_5_tfstp_mot ;
   private String AV19ExcelFilename ;
   private String AV20ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV10HTTPRequest ;
   private com.genexus.webpanels.WebSession AV25Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private HTMLChoice cmbavAcciones ;
   private IDataStoreProvider pr_default ;
   private int[] H01C13_A129BarCod ;
   private byte[] H01C13_A132BarCodReo ;
   private String[] H01C13_A130BarCodPar ;
   private String[] H01C13_A396EmprCod ;
   private byte[] H01C13_A10755Stp_Est ;
   private String[] H01C13_A13723StpHdr ;
   private String[] H01C13_A10752Stp_Mot ;
   private java.util.Date[] H01C13_A10751Stp_Dia ;
   private short[] H01C13_A10750Stp_Lin ;
   private String[] H01C13_A13728StpColor ;
   private boolean[] H01C13_n13728StpColor ;
   private String[] H01C13_A13725StpBarserD ;
   private boolean[] H01C13_n13725StpBarserD ;
   private String[] H01C13_A13724StpBarser ;
   private boolean[] H01C13_n13724StpBarser ;
   private String[] H01C13_A13727StpCliNom ;
   private boolean[] H01C13_n13727StpCliNom ;
   private int[] H01C13_A13726StpClicod ;
   private boolean[] H01C13_n13726StpClicod ;
   private int[] H01C13_A10746Stp_hdr ;
   private byte[] H01C13_A10747Stp_r ;
   private String[] H01C13_A10748Stp_p ;
   private int[] H01C15_A129BarCod ;
   private byte[] H01C15_A132BarCodReo ;
   private String[] H01C15_A130BarCodPar ;
   private String[] H01C15_A396EmprCod ;
   private byte[] H01C15_A10755Stp_Est ;
   private String[] H01C15_A13723StpHdr ;
   private String[] H01C15_A10752Stp_Mot ;
   private java.util.Date[] H01C15_A10751Stp_Dia ;
   private short[] H01C15_A10750Stp_Lin ;
   private String[] H01C15_A13728StpColor ;
   private boolean[] H01C15_n13728StpColor ;
   private String[] H01C15_A13725StpBarserD ;
   private boolean[] H01C15_n13725StpBarserD ;
   private String[] H01C15_A13724StpBarser ;
   private boolean[] H01C15_n13724StpBarser ;
   private String[] H01C15_A13727StpCliNom ;
   private boolean[] H01C15_n13727StpCliNom ;
   private int[] H01C15_A13726StpClicod ;
   private boolean[] H01C15_n13726StpClicod ;
   private int[] H01C15_A10746Stp_hdr ;
   private byte[] H01C15_A10747Stp_r ;
   private String[] H01C15_A10748Stp_p ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV26ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV11TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV13GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState20[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV14GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV49DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class activarhdr_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01C13( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV60Activarhdr_wcds_2_tfstp_lin ,
                                          short AV61Activarhdr_wcds_3_tfstp_lin_to ,
                                          java.util.Date AV62Activarhdr_wcds_4_tfstp_dia ,
                                          String AV64Activarhdr_wcds_6_tfstp_mot_sel ,
                                          String AV63Activarhdr_wcds_5_tfstp_mot ,
                                          String AV66Activarhdr_wcds_8_tfstphdr_sel ,
                                          String AV65Activarhdr_wcds_7_tfstphdr ,
                                          short A10750Stp_Lin ,
                                          java.util.Date A10751Stp_Dia ,
                                          String A10752Stp_Mot ,
                                          int A10746Stp_hdr ,
                                          byte A10747Stp_r ,
                                          String A10748Stp_p ,
                                          short AV15OrderedBy ,
                                          boolean AV16OrderedDsc ,
                                          String AV59Activarhdr_wcds_1_filterfulltext ,
                                          String A13723StpHdr ,
                                          int A13726StpClicod ,
                                          String A13727StpCliNom ,
                                          String A13724StpBarser ,
                                          String A13725StpBarserD ,
                                          String A13728StpColor ,
                                          int AV67Activarhdr_wcds_9_tfstpclicod ,
                                          int AV68Activarhdr_wcds_10_tfstpclicod_to ,
                                          String AV70Activarhdr_wcds_12_tfstpclinom_sel ,
                                          String AV69Activarhdr_wcds_11_tfstpclinom ,
                                          String AV72Activarhdr_wcds_14_tfstpbarser_sel ,
                                          String AV71Activarhdr_wcds_13_tfstpbarser ,
                                          String AV74Activarhdr_wcds_16_tfstpbarserdsc_sel ,
                                          String AV73Activarhdr_wcds_15_tfstpbarserdsc ,
                                          String AV76Activarhdr_wcds_18_tfstpcolor_sel ,
                                          String AV75Activarhdr_wcds_17_tfstpcolor ,
                                          java.util.Date AV8DiaInicial ,
                                          java.util.Date AV9DiaInicial_to ,
                                          String AV7Emprcod ,
                                          String A396EmprCod ,
                                          byte A10755Stp_Est )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int21 = new byte[41];
      Object[] GXv_Object22 = new Object[2];
      scmdbuf = "SELECT T3.BarCod, T3.BarCodReo, T3.BarCodPar, T1.EmprCod, T1.Stp_Est, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90')," ;
      scmdbuf += " 2) || T2.Stp_p AS StpHdr, T1.Stp_Mot, T1.Stp_Dia, T1.Stp_Lin, COALESCE( T3.BarColNom, ' ') AS StpColor, COALESCE( T3.BarSerDsc, ' ') AS StpBarserD, COALESCE( T3.BarSer," ;
      scmdbuf += " ' ') AS StpBarser, COALESCE( T4.StpCliNom, ' ') AS StpCliNom, COALESCE( T3.CliCod, 0) AS StpClicod, T1.Stp_hdr, T1.Stp_r, T1.Stp_p FROM (((TXPHDSTO1 T1 INNER JOIN" ;
      scmdbuf += " TXPHDSTOP T2 ON T2.EmprCod = T1.EmprCod AND T2.Stp_hdr = T1.Stp_hdr AND T2.Stp_r = T1.Stp_r AND T2.Stp_p = T1.Stp_p) LEFT JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.BarCod = T1.Stp_hdr AND T3.BarCodReo = T1.Stp_r AND T3.BarCodPar = T1.Stp_p) LEFT JOIN (SELECT T6.CliNom AS StpCliNom, T5.EmprCod, T5.BarCod, T7.Stp_hdr," ;
      scmdbuf += " T5.BarCodReo, T7.Stp_r, T5.BarCodPar, T7.Stp_p FROM ((TXPBARCAD T5 LEFT JOIN TXPCLIENT T6 ON T6.EmprCod = T5.EmprCod AND T6.CliCod = T5.CliCod) INNER JOIN TXPHDSTOP" ;
      scmdbuf += " T7 ON T7.EmprCod = T5.EmprCod) WHERE T5.BarCod = T7.Stp_hdr and T5.BarCodReo = T7.Stp_r and T5.BarCodPar = T7.Stp_p ) T4 ON T4.EmprCod = T1.EmprCod AND T4.Stp_hdr" ;
      scmdbuf += " = T1.Stp_hdr AND T4.Stp_r = T1.Stp_r AND T4.Stp_p = T1.Stp_p)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.Stp_Est = 1)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(T1.Stp_Lin,'9990'), 2) like '%' || ?) or ( UPPER(T1.Stp_Mot) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90'), 2) || T2.Stp_p) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.CliCod, 0),'999990'), 2) like '%' || ?) or ( UPPER(COALESCE( T4.StpCliNom, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSer, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSerDsc, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarColNom, ' ')) like '%' || UPPER(?))))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.CliCod, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.CliCod, 0) <= ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.StpCliNom, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.StpCliNom, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.BarSer, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.BarSer, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.BarSerDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.BarSerDsc, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.BarColNom, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.BarColNom, ' ') = ?))");
      if ( ! (0==AV60Activarhdr_wcds_2_tfstp_lin) )
      {
         addWhere(sWhereString, "(T1.Stp_Lin >= ?)");
      }
      else
      {
         GXv_int21[34] = (byte)(1) ;
      }
      if ( ! (0==AV61Activarhdr_wcds_3_tfstp_lin_to) )
      {
         addWhere(sWhereString, "(T1.Stp_Lin <= ?)");
      }
      else
      {
         GXv_int21[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV62Activarhdr_wcds_4_tfstp_dia) )
      {
         addWhere(sWhereString, "(T1.Stp_Dia >= ?)");
      }
      else
      {
         GXv_int21[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Activarhdr_wcds_6_tfstp_mot_sel)==0) && ( ! (GXutil.strcmp("", AV63Activarhdr_wcds_5_tfstp_mot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Stp_Mot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Activarhdr_wcds_6_tfstp_mot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Stp_Mot = ?)");
      }
      else
      {
         GXv_int21[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Activarhdr_wcds_8_tfstphdr_sel)==0) && ( ! (GXutil.strcmp("", AV65Activarhdr_wcds_7_tfstphdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Activarhdr_wcds_8_tfstphdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p = ?)");
      }
      else
      {
         GXv_int21[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV15OrderedBy == 1 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Stp_Dia" ;
      }
      else if ( ( AV15OrderedBy == 1 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Stp_Dia DESC" ;
      }
      else if ( ( AV15OrderedBy == 2 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Stp_Lin" ;
      }
      else if ( ( AV15OrderedBy == 2 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Stp_Lin DESC" ;
      }
      else if ( ( AV15OrderedBy == 3 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Stp_Mot" ;
      }
      else if ( ( AV15OrderedBy == 3 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Stp_Mot DESC" ;
      }
      GXv_Object22[0] = scmdbuf ;
      GXv_Object22[1] = GXv_int21 ;
      return GXv_Object22 ;
   }

   protected Object[] conditional_H01C15( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV60Activarhdr_wcds_2_tfstp_lin ,
                                          short AV61Activarhdr_wcds_3_tfstp_lin_to ,
                                          java.util.Date AV62Activarhdr_wcds_4_tfstp_dia ,
                                          String AV64Activarhdr_wcds_6_tfstp_mot_sel ,
                                          String AV63Activarhdr_wcds_5_tfstp_mot ,
                                          String AV66Activarhdr_wcds_8_tfstphdr_sel ,
                                          String AV65Activarhdr_wcds_7_tfstphdr ,
                                          short A10750Stp_Lin ,
                                          java.util.Date A10751Stp_Dia ,
                                          String A10752Stp_Mot ,
                                          int A10746Stp_hdr ,
                                          byte A10747Stp_r ,
                                          String A10748Stp_p ,
                                          short AV15OrderedBy ,
                                          boolean AV16OrderedDsc ,
                                          String AV59Activarhdr_wcds_1_filterfulltext ,
                                          String A13723StpHdr ,
                                          int A13726StpClicod ,
                                          String A13727StpCliNom ,
                                          String A13724StpBarser ,
                                          String A13725StpBarserD ,
                                          String A13728StpColor ,
                                          int AV67Activarhdr_wcds_9_tfstpclicod ,
                                          int AV68Activarhdr_wcds_10_tfstpclicod_to ,
                                          String AV70Activarhdr_wcds_12_tfstpclinom_sel ,
                                          String AV69Activarhdr_wcds_11_tfstpclinom ,
                                          String AV72Activarhdr_wcds_14_tfstpbarser_sel ,
                                          String AV71Activarhdr_wcds_13_tfstpbarser ,
                                          String AV74Activarhdr_wcds_16_tfstpbarserdsc_sel ,
                                          String AV73Activarhdr_wcds_15_tfstpbarserdsc ,
                                          String AV76Activarhdr_wcds_18_tfstpcolor_sel ,
                                          String AV75Activarhdr_wcds_17_tfstpcolor ,
                                          java.util.Date AV8DiaInicial ,
                                          java.util.Date AV9DiaInicial_to ,
                                          String AV7Emprcod ,
                                          String A396EmprCod ,
                                          byte A10755Stp_Est )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int23 = new byte[41];
      Object[] GXv_Object24 = new Object[2];
      scmdbuf = "SELECT T3.BarCod, T3.BarCodReo, T3.BarCodPar, T1.EmprCod, T1.Stp_Est, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90')," ;
      scmdbuf += " 2) || T2.Stp_p AS StpHdr, T1.Stp_Mot, T1.Stp_Dia, T1.Stp_Lin, COALESCE( T3.BarColNom, ' ') AS StpColor, COALESCE( T3.BarSerDsc, ' ') AS StpBarserD, COALESCE( T3.BarSer," ;
      scmdbuf += " ' ') AS StpBarser, COALESCE( T4.StpCliNom, ' ') AS StpCliNom, COALESCE( T3.CliCod, 0) AS StpClicod, T1.Stp_hdr, T1.Stp_r, T1.Stp_p FROM (((TXPHDSTO1 T1 INNER JOIN" ;
      scmdbuf += " TXPHDSTOP T2 ON T2.EmprCod = T1.EmprCod AND T2.Stp_hdr = T1.Stp_hdr AND T2.Stp_r = T1.Stp_r AND T2.Stp_p = T1.Stp_p) LEFT JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.BarCod = T1.Stp_hdr AND T3.BarCodReo = T1.Stp_r AND T3.BarCodPar = T1.Stp_p) LEFT JOIN (SELECT T6.CliNom AS StpCliNom, T5.EmprCod, T5.BarCod, T7.Stp_hdr," ;
      scmdbuf += " T5.BarCodReo, T7.Stp_r, T5.BarCodPar, T7.Stp_p FROM ((TXPBARCAD T5 LEFT JOIN TXPCLIENT T6 ON T6.EmprCod = T5.EmprCod AND T6.CliCod = T5.CliCod) INNER JOIN TXPHDSTOP" ;
      scmdbuf += " T7 ON T7.EmprCod = T5.EmprCod) WHERE T5.BarCod = T7.Stp_hdr and T5.BarCodReo = T7.Stp_r and T5.BarCodPar = T7.Stp_p ) T4 ON T4.EmprCod = T1.EmprCod AND T4.Stp_hdr" ;
      scmdbuf += " = T1.Stp_hdr AND T4.Stp_r = T1.Stp_r AND T4.Stp_p = T1.Stp_p)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.Stp_Est = 1)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(T1.Stp_Lin,'9990'), 2) like '%' || ?) or ( UPPER(T1.Stp_Mot) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90'), 2) || T2.Stp_p) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.CliCod, 0),'999990'), 2) like '%' || ?) or ( UPPER(COALESCE( T4.StpCliNom, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSer, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSerDsc, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarColNom, ' ')) like '%' || UPPER(?))))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.CliCod, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.CliCod, 0) <= ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.StpCliNom, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.StpCliNom, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.BarSer, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.BarSer, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.BarSerDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.BarSerDsc, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.BarColNom, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.BarColNom, ' ') = ?))");
      if ( ! (0==AV60Activarhdr_wcds_2_tfstp_lin) )
      {
         addWhere(sWhereString, "(T1.Stp_Lin >= ?)");
      }
      else
      {
         GXv_int23[34] = (byte)(1) ;
      }
      if ( ! (0==AV61Activarhdr_wcds_3_tfstp_lin_to) )
      {
         addWhere(sWhereString, "(T1.Stp_Lin <= ?)");
      }
      else
      {
         GXv_int23[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV62Activarhdr_wcds_4_tfstp_dia) )
      {
         addWhere(sWhereString, "(T1.Stp_Dia >= ?)");
      }
      else
      {
         GXv_int23[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Activarhdr_wcds_6_tfstp_mot_sel)==0) && ( ! (GXutil.strcmp("", AV63Activarhdr_wcds_5_tfstp_mot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Stp_Mot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Activarhdr_wcds_6_tfstp_mot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Stp_Mot = ?)");
      }
      else
      {
         GXv_int23[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Activarhdr_wcds_8_tfstphdr_sel)==0) && ( ! (GXutil.strcmp("", AV65Activarhdr_wcds_7_tfstphdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Activarhdr_wcds_8_tfstphdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p = ?)");
      }
      else
      {
         GXv_int23[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV15OrderedBy == 1 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Stp_Dia" ;
      }
      else if ( ( AV15OrderedBy == 1 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Stp_Dia DESC" ;
      }
      else if ( ( AV15OrderedBy == 2 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Stp_Lin" ;
      }
      else if ( ( AV15OrderedBy == 2 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Stp_Lin DESC" ;
      }
      else if ( ( AV15OrderedBy == 3 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Stp_Mot" ;
      }
      else if ( ( AV15OrderedBy == 3 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Stp_Mot DESC" ;
      }
      GXv_Object24[0] = scmdbuf ;
      GXv_Object24[1] = GXv_int23 ;
      return GXv_Object24 ;
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
                  return conditional_H01C13(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , ((Boolean) dynConstraints[14]).booleanValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.util.Date)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).byteValue() );
            case 1 :
                  return conditional_H01C15(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , ((Boolean) dynConstraints[14]).booleanValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.util.Date)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01C13", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01C15", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 11);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(11, 26);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(12, 16);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(14);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(15);
               ((byte[]) buf[20])[0] = rslt.getByte(16);
               ((String[]) buf[21])[0] = rslt.getString(17, 1);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 11);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(11, 26);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(12, 16);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(14);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(15);
               ((byte[]) buf[20])[0] = rslt.getByte(16);
               ((String[]) buf[21])[0] = rslt.getString(17, 1);
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
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 26);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[75]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[77], false);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 300);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 300);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 11);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 11);
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
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 26);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[75]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[77], false);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 300);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 300);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 11);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 11);
               }
               return;
      }
   }

}

