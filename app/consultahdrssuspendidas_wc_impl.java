package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class consultahdrssuspendidas_wc_impl extends GXWebComponent
{
   public consultahdrssuspendidas_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public consultahdrssuspendidas_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultahdrssuspendidas_wc_impl.class ));
   }

   public consultahdrssuspendidas_wc_impl( int remoteHandle ,
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
               AV58Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58Emprcod", AV58Emprcod);
               AV54DiaSuspension = localUtil.parseDateParm( httpContext.GetPar( "DiaSuspension")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54DiaSuspension", localUtil.format(AV54DiaSuspension, "99/99/99"));
               AV59DiaSuspension_to = localUtil.parseDateParm( httpContext.GetPar( "DiaSuspension_to")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59DiaSuspension_to", localUtil.format(AV59DiaSuspension_to, "99/99/99"));
               AV56DiaActivacion = localUtil.parseDateParm( httpContext.GetPar( "DiaActivacion")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56DiaActivacion", localUtil.format(AV56DiaActivacion, "99/99/99"));
               AV57DiaActivacion_to = localUtil.parseDateParm( httpContext.GetPar( "DiaActivacion_to")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57DiaActivacion_to", localUtil.format(AV57DiaActivacion_to, "99/99/99"));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV58Emprcod,AV54DiaSuspension,AV59DiaSuspension_to,AV56DiaActivacion,AV57DiaActivacion_to});
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
      AV58Emprcod = httpContext.GetPar( "Emprcod") ;
      AV54DiaSuspension = localUtil.parseDateParm( httpContext.GetPar( "DiaSuspension")) ;
      AV59DiaSuspension_to = localUtil.parseDateParm( httpContext.GetPar( "DiaSuspension_to")) ;
      AV56DiaActivacion = localUtil.parseDateParm( httpContext.GetPar( "DiaActivacion")) ;
      AV57DiaActivacion_to = localUtil.parseDateParm( httpContext.GetPar( "DiaActivacion_to")) ;
      AV25ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV20ColumnsSelector);
      AV15FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV26TFStpHdr = httpContext.GetPar( "TFStpHdr") ;
      AV27TFStpHdr_Sel = httpContext.GetPar( "TFStpHdr_Sel") ;
      AV28TFStpClicod = (int)(GXutil.lval( httpContext.GetPar( "TFStpClicod"))) ;
      AV29TFStpClicod_To = (int)(GXutil.lval( httpContext.GetPar( "TFStpClicod_To"))) ;
      AV30TFStpCliNom = httpContext.GetPar( "TFStpCliNom") ;
      AV31TFStpCliNom_Sel = httpContext.GetPar( "TFStpCliNom_Sel") ;
      AV32TFStpBarser = httpContext.GetPar( "TFStpBarser") ;
      AV33TFStpBarser_Sel = httpContext.GetPar( "TFStpBarser_Sel") ;
      AV34TFStpBarserDsc = httpContext.GetPar( "TFStpBarserDsc") ;
      AV35TFStpBarserDsc_Sel = httpContext.GetPar( "TFStpBarserDsc_Sel") ;
      AV36TFStpColor = httpContext.GetPar( "TFStpColor") ;
      AV37TFStpColor_Sel = httpContext.GetPar( "TFStpColor_Sel") ;
      AV38TFStp_Dia = localUtil.parseDTimeParm( httpContext.GetPar( "TFStp_Dia")) ;
      AV42TFStp_Mot = httpContext.GetPar( "TFStp_Mot") ;
      AV43TFStp_Mot_Sel = httpContext.GetPar( "TFStp_Mot_Sel") ;
      AV44TFStp_DiaA = localUtil.parseDTimeParm( httpContext.GetPar( "TFStp_DiaA")) ;
      AV48TFStp_MotA = httpContext.GetPar( "TFStp_MotA") ;
      AV49TFStp_MotA_Sel = httpContext.GetPar( "TFStp_MotA_Sel") ;
      AV84Pgmname = httpContext.GetPar( "Pgmname") ;
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
      gxgrgrid_refresh( subGrid_Rows, AV58Emprcod, AV54DiaSuspension, AV59DiaSuspension_to, AV56DiaActivacion, AV57DiaActivacion_to, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFStpHdr, AV27TFStpHdr_Sel, AV28TFStpClicod, AV29TFStpClicod_To, AV30TFStpCliNom, AV31TFStpCliNom_Sel, AV32TFStpBarser, AV33TFStpBarser_Sel, AV34TFStpBarserDsc, AV35TFStpBarserDsc_Sel, AV36TFStpColor, AV37TFStpColor_Sel, AV38TFStp_Dia, AV42TFStp_Mot, AV43TFStp_Mot_Sel, AV44TFStp_DiaA, AV48TFStp_MotA, AV49TFStp_MotA_Sel, AV84Pgmname, AV12OrderedBy, AV13OrderedDsc, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1C32( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Consulta de Hdrs Suspendidas ", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.consultahdrssuspendidas_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV58Emprcod)),GXutil.URLEncode(GXutil.formatDateParm(AV54DiaSuspension)),GXutil.URLEncode(GXutil.formatDateParm(AV59DiaSuspension_to)),GXutil.URLEncode(GXutil.formatDateParm(AV56DiaActivacion)),GXutil.URLEncode(GXutil.formatDateParm(AV57DiaActivacion_to))}, new String[] {"Emprcod","DiaSuspension","DiaSuspension_to","DiaActivacion","DiaActivacion_to"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV84Pgmname, ""))));
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
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV52GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV53GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV50DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV50DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV20ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV20ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV58Emprcod", GXutil.rtrim( wcpOAV58Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV54DiaSuspension", localUtil.dtoc( wcpOAV54DiaSuspension, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV59DiaSuspension_to", localUtil.dtoc( wcpOAV59DiaSuspension_to, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV56DiaActivacion", localUtil.dtoc( wcpOAV56DiaActivacion, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV57DiaActivacion_to", localUtil.dtoc( wcpOAV57DiaActivacion_to, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV25ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFSTPHDR", GXutil.rtrim( AV26TFStpHdr));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFSTPHDR_SEL", GXutil.rtrim( AV27TFStpHdr_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFSTPCLICOD", GXutil.ltrim( localUtil.ntoc( AV28TFStpClicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFSTPCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV29TFStpClicod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFSTPCLINOM", GXutil.rtrim( AV30TFStpCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFSTPCLINOM_SEL", GXutil.rtrim( AV31TFStpCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFSTPBARSER", GXutil.rtrim( AV32TFStpBarser));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFSTPBARSER_SEL", GXutil.rtrim( AV33TFStpBarser_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFSTPBARSERDSC", GXutil.rtrim( AV34TFStpBarserDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFSTPBARSERDSC_SEL", GXutil.rtrim( AV35TFStpBarserDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFSTPCOLOR", GXutil.rtrim( AV36TFStpColor));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFSTPCOLOR_SEL", GXutil.rtrim( AV37TFStpColor_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFSTP_DIA", localUtil.ttoc( AV38TFStp_Dia, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFSTP_MOT", AV42TFStp_Mot);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFSTP_MOT_SEL", AV43TFStp_Mot_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFSTP_DIAA", localUtil.ttoc( AV44TFStp_DiaA, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFSTP_MOTA", AV48TFStp_MotA);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFSTP_MOTA_SEL", AV49TFStp_MotA_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV84Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV84Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV58Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vDIASUSPENSION", localUtil.dtoc( AV54DiaSuspension, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vDIASUSPENSION_TO", localUtil.dtoc( AV59DiaSuspension_to, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vDIAACTIVACION", localUtil.dtoc( AV56DiaActivacion, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vDIAACTIVACION_TO", localUtil.dtoc( AV57DiaActivacion_to, 0, "/"));
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

   public void renderHtmlCloseForm1C32( )
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
      return "ConsultaHdrsSuspendidas_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Consulta de Hdrs Suspendidas ", "") ;
   }

   public void wb1C30( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.consultahdrssuspendidas_wc");
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ConsultaHdrsSuspendidas_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ConsultaHdrsSuspendidas_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ConsultaHdrsSuspendidas_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_23_1C32( true) ;
      }
      else
      {
         wb_table1_23_1C32( false) ;
      }
      return  ;
   }

   public void wb_table1_23_1C32e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV52GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV53GridPageCount);
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV50DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV50DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV20ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_stp_diaauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'" + sPrefix + "',false,'" + sGXsfl_41_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_stp_diaauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_stp_diaauxdate_Internalname, localUtil.format(AV40DDO_Stp_DiaAuxDate, "99/99/99"), localUtil.format( AV40DDO_Stp_DiaAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,62);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_stp_diaauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ConsultaHdrsSuspendidas_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_stp_diaauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ConsultaHdrsSuspendidas_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_stp_diaaauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'" + sPrefix + "',false,'" + sGXsfl_41_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_stp_diaaauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_stp_diaaauxdate_Internalname, localUtil.format(AV46DDO_Stp_DiaAAuxDate, "99/99/99"), localUtil.format( AV46DDO_Stp_DiaAAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,64);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_stp_diaaauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ConsultaHdrsSuspendidas_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_stp_diaaauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ConsultaHdrsSuspendidas_WC.htm");
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

   public void start1C32( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Consulta de Hdrs Suspendidas ", ""), (short)(0)) ;
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
            strup1C30( ) ;
         }
      }
   }

   public void ws1C32( )
   {
      start1C32( ) ;
      evt1C32( ) ;
   }

   public void evt1C32( )
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
                              strup1C30( ) ;
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
                              strup1C30( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e111C32 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1C30( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e121C32 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1C30( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e131C32 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1C30( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e141C32 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1C30( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e151C32 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1C30( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e161C32 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1C30( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e171C32 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1C30( ) ;
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
                              strup1C30( ) ;
                           }
                           nGXsfl_41_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_412( ) ;
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
                           A10751Stp_Dia = localUtil.ctot( httpContext.cgiGet( edtStp_Dia_Internalname), 0) ;
                           A10752Stp_Mot = httpContext.cgiGet( edtStp_Mot_Internalname) ;
                           A10756Stp_DiaA = localUtil.ctot( httpContext.cgiGet( edtStp_DiaA_Internalname), 0) ;
                           A10757Stp_MotA = httpContext.cgiGet( edtStp_MotA_Internalname) ;
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
                                       e181C32 ();
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
                                       e191C32 ();
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
                                       e201C32 ();
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
                                    strup1C30( ) ;
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

   public void we1C32( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1C32( ) ;
         }
      }
   }

   public void pa1C32( )
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
                                 String AV58Emprcod ,
                                 java.util.Date AV54DiaSuspension ,
                                 java.util.Date AV59DiaSuspension_to ,
                                 java.util.Date AV56DiaActivacion ,
                                 java.util.Date AV57DiaActivacion_to ,
                                 byte AV25ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ,
                                 String AV15FilterFullText ,
                                 String AV26TFStpHdr ,
                                 String AV27TFStpHdr_Sel ,
                                 int AV28TFStpClicod ,
                                 int AV29TFStpClicod_To ,
                                 String AV30TFStpCliNom ,
                                 String AV31TFStpCliNom_Sel ,
                                 String AV32TFStpBarser ,
                                 String AV33TFStpBarser_Sel ,
                                 String AV34TFStpBarserDsc ,
                                 String AV35TFStpBarserDsc_Sel ,
                                 String AV36TFStpColor ,
                                 String AV37TFStpColor_Sel ,
                                 java.util.Date AV38TFStp_Dia ,
                                 String AV42TFStp_Mot ,
                                 String AV43TFStp_Mot_Sel ,
                                 java.util.Date AV44TFStp_DiaA ,
                                 String AV48TFStp_MotA ,
                                 String AV49TFStp_MotA_Sel ,
                                 String AV84Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e191C32 ();
      GRID_nCurrentRecord = 0 ;
      rf1C32( ) ;
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
      rf1C32( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV84Pgmname = "ConsultaHdrsSuspendidas_WC" ;
      Gx_err = (short)(0) ;
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV65Consultahdrssuspendidas_wcds_1_filterfulltext = AV15FilterFullText ;
      AV66Consultahdrssuspendidas_wcds_2_tfstphdr = AV26TFStpHdr ;
      AV67Consultahdrssuspendidas_wcds_3_tfstphdr_sel = AV27TFStpHdr_Sel ;
      AV68Consultahdrssuspendidas_wcds_4_tfstpclicod = AV28TFStpClicod ;
      AV69Consultahdrssuspendidas_wcds_5_tfstpclicod_to = AV29TFStpClicod_To ;
      AV70Consultahdrssuspendidas_wcds_6_tfstpclinom = AV30TFStpCliNom ;
      AV71Consultahdrssuspendidas_wcds_7_tfstpclinom_sel = AV31TFStpCliNom_Sel ;
      AV72Consultahdrssuspendidas_wcds_8_tfstpbarser = AV32TFStpBarser ;
      AV73Consultahdrssuspendidas_wcds_9_tfstpbarser_sel = AV33TFStpBarser_Sel ;
      AV74Consultahdrssuspendidas_wcds_10_tfstpbarserdsc = AV34TFStpBarserDsc ;
      AV75Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel = AV35TFStpBarserDsc_Sel ;
      AV76Consultahdrssuspendidas_wcds_12_tfstpcolor = AV36TFStpColor ;
      AV77Consultahdrssuspendidas_wcds_13_tfstpcolor_sel = AV37TFStpColor_Sel ;
      AV78Consultahdrssuspendidas_wcds_14_tfstp_dia = AV38TFStp_Dia ;
      AV79Consultahdrssuspendidas_wcds_15_tfstp_mot = AV42TFStp_Mot ;
      AV80Consultahdrssuspendidas_wcds_16_tfstp_mot_sel = AV43TFStp_Mot_Sel ;
      AV81Consultahdrssuspendidas_wcds_17_tfstp_diaa = AV44TFStp_DiaA ;
      AV82Consultahdrssuspendidas_wcds_18_tfstp_mota = AV48TFStp_MotA ;
      AV83Consultahdrssuspendidas_wcds_19_tfstp_mota_sel = AV49TFStp_MotA_Sel ;
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV67Consultahdrssuspendidas_wcds_3_tfstphdr_sel ,
                                           AV66Consultahdrssuspendidas_wcds_2_tfstphdr ,
                                           AV78Consultahdrssuspendidas_wcds_14_tfstp_dia ,
                                           AV80Consultahdrssuspendidas_wcds_16_tfstp_mot_sel ,
                                           AV79Consultahdrssuspendidas_wcds_15_tfstp_mot ,
                                           AV81Consultahdrssuspendidas_wcds_17_tfstp_diaa ,
                                           AV83Consultahdrssuspendidas_wcds_19_tfstp_mota_sel ,
                                           AV82Consultahdrssuspendidas_wcds_18_tfstp_mota ,
                                           Integer.valueOf(A10746Stp_hdr) ,
                                           Byte.valueOf(A10747Stp_r) ,
                                           A10748Stp_p ,
                                           A10751Stp_Dia ,
                                           A10752Stp_Mot ,
                                           A10756Stp_DiaA ,
                                           A10757Stp_MotA ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV65Consultahdrssuspendidas_wcds_1_filterfulltext ,
                                           A13723StpHdr ,
                                           Integer.valueOf(A13726StpClicod) ,
                                           A13727StpCliNom ,
                                           A13724StpBarser ,
                                           A13725StpBarserD ,
                                           A13728StpColor ,
                                           Integer.valueOf(AV68Consultahdrssuspendidas_wcds_4_tfstpclicod) ,
                                           Integer.valueOf(AV69Consultahdrssuspendidas_wcds_5_tfstpclicod_to) ,
                                           AV71Consultahdrssuspendidas_wcds_7_tfstpclinom_sel ,
                                           AV70Consultahdrssuspendidas_wcds_6_tfstpclinom ,
                                           AV73Consultahdrssuspendidas_wcds_9_tfstpbarser_sel ,
                                           AV72Consultahdrssuspendidas_wcds_8_tfstpbarser ,
                                           AV75Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel ,
                                           AV74Consultahdrssuspendidas_wcds_10_tfstpbarserdsc ,
                                           AV77Consultahdrssuspendidas_wcds_13_tfstpcolor_sel ,
                                           AV76Consultahdrssuspendidas_wcds_12_tfstpcolor ,
                                           AV54DiaSuspension ,
                                           AV59DiaSuspension_to ,
                                           AV56DiaActivacion ,
                                           AV57DiaActivacion_to ,
                                           AV58Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV65Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV65Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV65Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV65Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV65Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV65Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV65Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV65Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV70Consultahdrssuspendidas_wcds_6_tfstpclinom = GXutil.padr( GXutil.rtrim( AV70Consultahdrssuspendidas_wcds_6_tfstpclinom), 30, "%") ;
      lV72Consultahdrssuspendidas_wcds_8_tfstpbarser = GXutil.padr( GXutil.rtrim( AV72Consultahdrssuspendidas_wcds_8_tfstpbarser), 16, "%") ;
      lV74Consultahdrssuspendidas_wcds_10_tfstpbarserdsc = GXutil.padr( GXutil.rtrim( AV74Consultahdrssuspendidas_wcds_10_tfstpbarserdsc), 26, "%") ;
      lV76Consultahdrssuspendidas_wcds_12_tfstpcolor = GXutil.padr( GXutil.rtrim( AV76Consultahdrssuspendidas_wcds_12_tfstpcolor), 13, "%") ;
      lV66Consultahdrssuspendidas_wcds_2_tfstphdr = GXutil.padr( GXutil.rtrim( AV66Consultahdrssuspendidas_wcds_2_tfstphdr), 11, "%") ;
      lV79Consultahdrssuspendidas_wcds_15_tfstp_mot = GXutil.concat( GXutil.rtrim( AV79Consultahdrssuspendidas_wcds_15_tfstp_mot), "%", "") ;
      lV82Consultahdrssuspendidas_wcds_18_tfstp_mota = GXutil.concat( GXutil.rtrim( AV82Consultahdrssuspendidas_wcds_18_tfstp_mota), "%", "") ;
      /* Using cursor H01C33 */
      pr_default.execute(0, new Object[] {AV58Emprcod, AV65Consultahdrssuspendidas_wcds_1_filterfulltext, lV65Consultahdrssuspendidas_wcds_1_filterfulltext, lV65Consultahdrssuspendidas_wcds_1_filterfulltext, lV65Consultahdrssuspendidas_wcds_1_filterfulltext, lV65Consultahdrssuspendidas_wcds_1_filterfulltext, lV65Consultahdrssuspendidas_wcds_1_filterfulltext, lV65Consultahdrssuspendidas_wcds_1_filterfulltext, lV65Consultahdrssuspendidas_wcds_1_filterfulltext, lV65Consultahdrssuspendidas_wcds_1_filterfulltext, Integer.valueOf(AV68Consultahdrssuspendidas_wcds_4_tfstpclicod), Integer.valueOf(AV68Consultahdrssuspendidas_wcds_4_tfstpclicod), Integer.valueOf(AV69Consultahdrssuspendidas_wcds_5_tfstpclicod_to), Integer.valueOf(AV69Consultahdrssuspendidas_wcds_5_tfstpclicod_to), AV71Consultahdrssuspendidas_wcds_7_tfstpclinom_sel, AV70Consultahdrssuspendidas_wcds_6_tfstpclinom, lV70Consultahdrssuspendidas_wcds_6_tfstpclinom, AV71Consultahdrssuspendidas_wcds_7_tfstpclinom_sel, AV71Consultahdrssuspendidas_wcds_7_tfstpclinom_sel, AV73Consultahdrssuspendidas_wcds_9_tfstpbarser_sel, AV72Consultahdrssuspendidas_wcds_8_tfstpbarser, lV72Consultahdrssuspendidas_wcds_8_tfstpbarser, AV73Consultahdrssuspendidas_wcds_9_tfstpbarser_sel, AV73Consultahdrssuspendidas_wcds_9_tfstpbarser_sel, AV75Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel, AV74Consultahdrssuspendidas_wcds_10_tfstpbarserdsc, lV74Consultahdrssuspendidas_wcds_10_tfstpbarserdsc, AV75Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel, AV75Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel, AV77Consultahdrssuspendidas_wcds_13_tfstpcolor_sel, AV76Consultahdrssuspendidas_wcds_12_tfstpcolor, lV76Consultahdrssuspendidas_wcds_12_tfstpcolor, AV77Consultahdrssuspendidas_wcds_13_tfstpcolor_sel, AV77Consultahdrssuspendidas_wcds_13_tfstpcolor_sel, lV66Consultahdrssuspendidas_wcds_2_tfstphdr, AV67Consultahdrssuspendidas_wcds_3_tfstphdr_sel, AV78Consultahdrssuspendidas_wcds_14_tfstp_dia, lV79Consultahdrssuspendidas_wcds_15_tfstp_mot, AV80Consultahdrssuspendidas_wcds_16_tfstp_mot_sel, AV81Consultahdrssuspendidas_wcds_17_tfstp_diaa, lV82Consultahdrssuspendidas_wcds_18_tfstp_mota, AV83Consultahdrssuspendidas_wcds_19_tfstp_mota_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = H01C33_A396EmprCod[0] ;
         A10755Stp_Est = H01C33_A10755Stp_Est[0] ;
         A10757Stp_MotA = H01C33_A10757Stp_MotA[0] ;
         A10756Stp_DiaA = H01C33_A10756Stp_DiaA[0] ;
         A10752Stp_Mot = H01C33_A10752Stp_Mot[0] ;
         A10751Stp_Dia = H01C33_A10751Stp_Dia[0] ;
         A13723StpHdr = H01C33_A13723StpHdr[0] ;
         A13728StpColor = H01C33_A13728StpColor[0] ;
         n13728StpColor = H01C33_n13728StpColor[0] ;
         A13725StpBarserD = H01C33_A13725StpBarserD[0] ;
         n13725StpBarserD = H01C33_n13725StpBarserD[0] ;
         A13724StpBarser = H01C33_A13724StpBarser[0] ;
         n13724StpBarser = H01C33_n13724StpBarser[0] ;
         A13727StpCliNom = H01C33_A13727StpCliNom[0] ;
         n13727StpCliNom = H01C33_n13727StpCliNom[0] ;
         A13726StpClicod = H01C33_A13726StpClicod[0] ;
         n13726StpClicod = H01C33_n13726StpClicod[0] ;
         A10746Stp_hdr = H01C33_A10746Stp_hdr[0] ;
         A10747Stp_r = H01C33_A10747Stp_r[0] ;
         A10748Stp_p = H01C33_A10748Stp_p[0] ;
         A13723StpHdr = H01C33_A13723StpHdr[0] ;
         A13728StpColor = H01C33_A13728StpColor[0] ;
         n13728StpColor = H01C33_n13728StpColor[0] ;
         A13725StpBarserD = H01C33_A13725StpBarserD[0] ;
         n13725StpBarserD = H01C33_n13725StpBarserD[0] ;
         A13724StpBarser = H01C33_A13724StpBarser[0] ;
         n13724StpBarser = H01C33_n13724StpBarser[0] ;
         A13726StpClicod = H01C33_A13726StpClicod[0] ;
         n13726StpClicod = H01C33_n13726StpClicod[0] ;
         A13727StpCliNom = H01C33_A13727StpCliNom[0] ;
         n13727StpCliNom = H01C33_n13727StpCliNom[0] ;
         if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).after( GXutil.resetTime( AV54DiaSuspension )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV54DiaSuspension)) )) )
         {
            if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).before( GXutil.resetTime( AV59DiaSuspension_to )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV59DiaSuspension_to)) )) )
            {
               if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10756Stp_DiaA, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).after( GXutil.resetTime( AV56DiaActivacion )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10756Stp_DiaA, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV56DiaActivacion)) )) || GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV56DiaActivacion)) )
               {
                  if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10756Stp_DiaA, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).before( GXutil.resetTime( AV57DiaActivacion_to )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10756Stp_DiaA, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV57DiaActivacion_to)) )) || GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV57DiaActivacion_to)) )
                  {
                     GRID_nRecordCount = (long)(GRID_nRecordCount+1) ;
                  }
               }
            }
         }
         pr_default.readNext(0);
      }
      GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      pr_default.close(0);
      return (int)(GRID_nRecordCount) ;
   }

   public void rf1C32( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(41) ;
      /* Execute user event: Refresh */
      e191C32 ();
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
                                              AV67Consultahdrssuspendidas_wcds_3_tfstphdr_sel ,
                                              AV66Consultahdrssuspendidas_wcds_2_tfstphdr ,
                                              AV78Consultahdrssuspendidas_wcds_14_tfstp_dia ,
                                              AV80Consultahdrssuspendidas_wcds_16_tfstp_mot_sel ,
                                              AV79Consultahdrssuspendidas_wcds_15_tfstp_mot ,
                                              AV81Consultahdrssuspendidas_wcds_17_tfstp_diaa ,
                                              AV83Consultahdrssuspendidas_wcds_19_tfstp_mota_sel ,
                                              AV82Consultahdrssuspendidas_wcds_18_tfstp_mota ,
                                              Integer.valueOf(A10746Stp_hdr) ,
                                              Byte.valueOf(A10747Stp_r) ,
                                              A10748Stp_p ,
                                              A10751Stp_Dia ,
                                              A10752Stp_Mot ,
                                              A10756Stp_DiaA ,
                                              A10757Stp_MotA ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV65Consultahdrssuspendidas_wcds_1_filterfulltext ,
                                              A13723StpHdr ,
                                              Integer.valueOf(A13726StpClicod) ,
                                              A13727StpCliNom ,
                                              A13724StpBarser ,
                                              A13725StpBarserD ,
                                              A13728StpColor ,
                                              Integer.valueOf(AV68Consultahdrssuspendidas_wcds_4_tfstpclicod) ,
                                              Integer.valueOf(AV69Consultahdrssuspendidas_wcds_5_tfstpclicod_to) ,
                                              AV71Consultahdrssuspendidas_wcds_7_tfstpclinom_sel ,
                                              AV70Consultahdrssuspendidas_wcds_6_tfstpclinom ,
                                              AV73Consultahdrssuspendidas_wcds_9_tfstpbarser_sel ,
                                              AV72Consultahdrssuspendidas_wcds_8_tfstpbarser ,
                                              AV75Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel ,
                                              AV74Consultahdrssuspendidas_wcds_10_tfstpbarserdsc ,
                                              AV77Consultahdrssuspendidas_wcds_13_tfstpcolor_sel ,
                                              AV76Consultahdrssuspendidas_wcds_12_tfstpcolor ,
                                              AV54DiaSuspension ,
                                              AV59DiaSuspension_to ,
                                              AV56DiaActivacion ,
                                              AV57DiaActivacion_to ,
                                              AV58Emprcod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                              TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                              TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                              TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV65Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
         lV65Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
         lV65Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
         lV65Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
         lV65Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
         lV65Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
         lV65Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
         lV65Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
         lV70Consultahdrssuspendidas_wcds_6_tfstpclinom = GXutil.padr( GXutil.rtrim( AV70Consultahdrssuspendidas_wcds_6_tfstpclinom), 30, "%") ;
         lV72Consultahdrssuspendidas_wcds_8_tfstpbarser = GXutil.padr( GXutil.rtrim( AV72Consultahdrssuspendidas_wcds_8_tfstpbarser), 16, "%") ;
         lV74Consultahdrssuspendidas_wcds_10_tfstpbarserdsc = GXutil.padr( GXutil.rtrim( AV74Consultahdrssuspendidas_wcds_10_tfstpbarserdsc), 26, "%") ;
         lV76Consultahdrssuspendidas_wcds_12_tfstpcolor = GXutil.padr( GXutil.rtrim( AV76Consultahdrssuspendidas_wcds_12_tfstpcolor), 13, "%") ;
         lV66Consultahdrssuspendidas_wcds_2_tfstphdr = GXutil.padr( GXutil.rtrim( AV66Consultahdrssuspendidas_wcds_2_tfstphdr), 11, "%") ;
         lV79Consultahdrssuspendidas_wcds_15_tfstp_mot = GXutil.concat( GXutil.rtrim( AV79Consultahdrssuspendidas_wcds_15_tfstp_mot), "%", "") ;
         lV82Consultahdrssuspendidas_wcds_18_tfstp_mota = GXutil.concat( GXutil.rtrim( AV82Consultahdrssuspendidas_wcds_18_tfstp_mota), "%", "") ;
         /* Using cursor H01C35 */
         pr_default.execute(1, new Object[] {AV58Emprcod, AV65Consultahdrssuspendidas_wcds_1_filterfulltext, lV65Consultahdrssuspendidas_wcds_1_filterfulltext, lV65Consultahdrssuspendidas_wcds_1_filterfulltext, lV65Consultahdrssuspendidas_wcds_1_filterfulltext, lV65Consultahdrssuspendidas_wcds_1_filterfulltext, lV65Consultahdrssuspendidas_wcds_1_filterfulltext, lV65Consultahdrssuspendidas_wcds_1_filterfulltext, lV65Consultahdrssuspendidas_wcds_1_filterfulltext, lV65Consultahdrssuspendidas_wcds_1_filterfulltext, Integer.valueOf(AV68Consultahdrssuspendidas_wcds_4_tfstpclicod), Integer.valueOf(AV68Consultahdrssuspendidas_wcds_4_tfstpclicod), Integer.valueOf(AV69Consultahdrssuspendidas_wcds_5_tfstpclicod_to), Integer.valueOf(AV69Consultahdrssuspendidas_wcds_5_tfstpclicod_to), AV71Consultahdrssuspendidas_wcds_7_tfstpclinom_sel, AV70Consultahdrssuspendidas_wcds_6_tfstpclinom, lV70Consultahdrssuspendidas_wcds_6_tfstpclinom, AV71Consultahdrssuspendidas_wcds_7_tfstpclinom_sel, AV71Consultahdrssuspendidas_wcds_7_tfstpclinom_sel, AV73Consultahdrssuspendidas_wcds_9_tfstpbarser_sel, AV72Consultahdrssuspendidas_wcds_8_tfstpbarser, lV72Consultahdrssuspendidas_wcds_8_tfstpbarser, AV73Consultahdrssuspendidas_wcds_9_tfstpbarser_sel, AV73Consultahdrssuspendidas_wcds_9_tfstpbarser_sel, AV75Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel, AV74Consultahdrssuspendidas_wcds_10_tfstpbarserdsc, lV74Consultahdrssuspendidas_wcds_10_tfstpbarserdsc, AV75Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel, AV75Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel, AV77Consultahdrssuspendidas_wcds_13_tfstpcolor_sel, AV76Consultahdrssuspendidas_wcds_12_tfstpcolor, lV76Consultahdrssuspendidas_wcds_12_tfstpcolor, AV77Consultahdrssuspendidas_wcds_13_tfstpcolor_sel, AV77Consultahdrssuspendidas_wcds_13_tfstpcolor_sel, lV66Consultahdrssuspendidas_wcds_2_tfstphdr, AV67Consultahdrssuspendidas_wcds_3_tfstphdr_sel, AV78Consultahdrssuspendidas_wcds_14_tfstp_dia, lV79Consultahdrssuspendidas_wcds_15_tfstp_mot, AV80Consultahdrssuspendidas_wcds_16_tfstp_mot_sel, AV81Consultahdrssuspendidas_wcds_17_tfstp_diaa, lV82Consultahdrssuspendidas_wcds_18_tfstp_mota, AV83Consultahdrssuspendidas_wcds_19_tfstp_mota_sel});
         nGXsfl_41_idx = 1 ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_412( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H01C35_A396EmprCod[0] ;
            A10755Stp_Est = H01C35_A10755Stp_Est[0] ;
            A10757Stp_MotA = H01C35_A10757Stp_MotA[0] ;
            A10756Stp_DiaA = H01C35_A10756Stp_DiaA[0] ;
            A10752Stp_Mot = H01C35_A10752Stp_Mot[0] ;
            A10751Stp_Dia = H01C35_A10751Stp_Dia[0] ;
            A13723StpHdr = H01C35_A13723StpHdr[0] ;
            A13728StpColor = H01C35_A13728StpColor[0] ;
            n13728StpColor = H01C35_n13728StpColor[0] ;
            A13725StpBarserD = H01C35_A13725StpBarserD[0] ;
            n13725StpBarserD = H01C35_n13725StpBarserD[0] ;
            A13724StpBarser = H01C35_A13724StpBarser[0] ;
            n13724StpBarser = H01C35_n13724StpBarser[0] ;
            A13727StpCliNom = H01C35_A13727StpCliNom[0] ;
            n13727StpCliNom = H01C35_n13727StpCliNom[0] ;
            A13726StpClicod = H01C35_A13726StpClicod[0] ;
            n13726StpClicod = H01C35_n13726StpClicod[0] ;
            A10746Stp_hdr = H01C35_A10746Stp_hdr[0] ;
            A10747Stp_r = H01C35_A10747Stp_r[0] ;
            A10748Stp_p = H01C35_A10748Stp_p[0] ;
            A13723StpHdr = H01C35_A13723StpHdr[0] ;
            A13728StpColor = H01C35_A13728StpColor[0] ;
            n13728StpColor = H01C35_n13728StpColor[0] ;
            A13725StpBarserD = H01C35_A13725StpBarserD[0] ;
            n13725StpBarserD = H01C35_n13725StpBarserD[0] ;
            A13724StpBarser = H01C35_A13724StpBarser[0] ;
            n13724StpBarser = H01C35_n13724StpBarser[0] ;
            A13726StpClicod = H01C35_A13726StpClicod[0] ;
            n13726StpClicod = H01C35_n13726StpClicod[0] ;
            A13727StpCliNom = H01C35_A13727StpCliNom[0] ;
            n13727StpCliNom = H01C35_n13727StpCliNom[0] ;
            if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).after( GXutil.resetTime( AV54DiaSuspension )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV54DiaSuspension)) )) )
            {
               if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).before( GXutil.resetTime( AV59DiaSuspension_to )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV59DiaSuspension_to)) )) )
               {
                  if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10756Stp_DiaA, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).after( GXutil.resetTime( AV56DiaActivacion )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10756Stp_DiaA, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV56DiaActivacion)) )) || GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV56DiaActivacion)) )
                  {
                     if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10756Stp_DiaA, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).before( GXutil.resetTime( AV57DiaActivacion_to )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10756Stp_DiaA, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV57DiaActivacion_to)) )) || GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV57DiaActivacion_to)) )
                     {
                        e201C32 ();
                     }
                  }
               }
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(41) ;
         wb1C30( ) ;
      }
      bGXsfl_41_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1C32( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV84Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV84Pgmname, ""))));
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
      AV65Consultahdrssuspendidas_wcds_1_filterfulltext = AV15FilterFullText ;
      AV66Consultahdrssuspendidas_wcds_2_tfstphdr = AV26TFStpHdr ;
      AV67Consultahdrssuspendidas_wcds_3_tfstphdr_sel = AV27TFStpHdr_Sel ;
      AV68Consultahdrssuspendidas_wcds_4_tfstpclicod = AV28TFStpClicod ;
      AV69Consultahdrssuspendidas_wcds_5_tfstpclicod_to = AV29TFStpClicod_To ;
      AV70Consultahdrssuspendidas_wcds_6_tfstpclinom = AV30TFStpCliNom ;
      AV71Consultahdrssuspendidas_wcds_7_tfstpclinom_sel = AV31TFStpCliNom_Sel ;
      AV72Consultahdrssuspendidas_wcds_8_tfstpbarser = AV32TFStpBarser ;
      AV73Consultahdrssuspendidas_wcds_9_tfstpbarser_sel = AV33TFStpBarser_Sel ;
      AV74Consultahdrssuspendidas_wcds_10_tfstpbarserdsc = AV34TFStpBarserDsc ;
      AV75Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel = AV35TFStpBarserDsc_Sel ;
      AV76Consultahdrssuspendidas_wcds_12_tfstpcolor = AV36TFStpColor ;
      AV77Consultahdrssuspendidas_wcds_13_tfstpcolor_sel = AV37TFStpColor_Sel ;
      AV78Consultahdrssuspendidas_wcds_14_tfstp_dia = AV38TFStp_Dia ;
      AV79Consultahdrssuspendidas_wcds_15_tfstp_mot = AV42TFStp_Mot ;
      AV80Consultahdrssuspendidas_wcds_16_tfstp_mot_sel = AV43TFStp_Mot_Sel ;
      AV81Consultahdrssuspendidas_wcds_17_tfstp_diaa = AV44TFStp_DiaA ;
      AV82Consultahdrssuspendidas_wcds_18_tfstp_mota = AV48TFStp_MotA ;
      AV83Consultahdrssuspendidas_wcds_19_tfstp_mota_sel = AV49TFStp_MotA_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV58Emprcod, AV54DiaSuspension, AV59DiaSuspension_to, AV56DiaActivacion, AV57DiaActivacion_to, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFStpHdr, AV27TFStpHdr_Sel, AV28TFStpClicod, AV29TFStpClicod_To, AV30TFStpCliNom, AV31TFStpCliNom_Sel, AV32TFStpBarser, AV33TFStpBarser_Sel, AV34TFStpBarserDsc, AV35TFStpBarserDsc_Sel, AV36TFStpColor, AV37TFStpColor_Sel, AV38TFStp_Dia, AV42TFStp_Mot, AV43TFStp_Mot_Sel, AV44TFStp_DiaA, AV48TFStp_MotA, AV49TFStp_MotA_Sel, AV84Pgmname, AV12OrderedBy, AV13OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV65Consultahdrssuspendidas_wcds_1_filterfulltext = AV15FilterFullText ;
      AV66Consultahdrssuspendidas_wcds_2_tfstphdr = AV26TFStpHdr ;
      AV67Consultahdrssuspendidas_wcds_3_tfstphdr_sel = AV27TFStpHdr_Sel ;
      AV68Consultahdrssuspendidas_wcds_4_tfstpclicod = AV28TFStpClicod ;
      AV69Consultahdrssuspendidas_wcds_5_tfstpclicod_to = AV29TFStpClicod_To ;
      AV70Consultahdrssuspendidas_wcds_6_tfstpclinom = AV30TFStpCliNom ;
      AV71Consultahdrssuspendidas_wcds_7_tfstpclinom_sel = AV31TFStpCliNom_Sel ;
      AV72Consultahdrssuspendidas_wcds_8_tfstpbarser = AV32TFStpBarser ;
      AV73Consultahdrssuspendidas_wcds_9_tfstpbarser_sel = AV33TFStpBarser_Sel ;
      AV74Consultahdrssuspendidas_wcds_10_tfstpbarserdsc = AV34TFStpBarserDsc ;
      AV75Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel = AV35TFStpBarserDsc_Sel ;
      AV76Consultahdrssuspendidas_wcds_12_tfstpcolor = AV36TFStpColor ;
      AV77Consultahdrssuspendidas_wcds_13_tfstpcolor_sel = AV37TFStpColor_Sel ;
      AV78Consultahdrssuspendidas_wcds_14_tfstp_dia = AV38TFStp_Dia ;
      AV79Consultahdrssuspendidas_wcds_15_tfstp_mot = AV42TFStp_Mot ;
      AV80Consultahdrssuspendidas_wcds_16_tfstp_mot_sel = AV43TFStp_Mot_Sel ;
      AV81Consultahdrssuspendidas_wcds_17_tfstp_diaa = AV44TFStp_DiaA ;
      AV82Consultahdrssuspendidas_wcds_18_tfstp_mota = AV48TFStp_MotA ;
      AV83Consultahdrssuspendidas_wcds_19_tfstp_mota_sel = AV49TFStp_MotA_Sel ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV58Emprcod, AV54DiaSuspension, AV59DiaSuspension_to, AV56DiaActivacion, AV57DiaActivacion_to, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFStpHdr, AV27TFStpHdr_Sel, AV28TFStpClicod, AV29TFStpClicod_To, AV30TFStpCliNom, AV31TFStpCliNom_Sel, AV32TFStpBarser, AV33TFStpBarser_Sel, AV34TFStpBarserDsc, AV35TFStpBarserDsc_Sel, AV36TFStpColor, AV37TFStpColor_Sel, AV38TFStp_Dia, AV42TFStp_Mot, AV43TFStp_Mot_Sel, AV44TFStp_DiaA, AV48TFStp_MotA, AV49TFStp_MotA_Sel, AV84Pgmname, AV12OrderedBy, AV13OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV65Consultahdrssuspendidas_wcds_1_filterfulltext = AV15FilterFullText ;
      AV66Consultahdrssuspendidas_wcds_2_tfstphdr = AV26TFStpHdr ;
      AV67Consultahdrssuspendidas_wcds_3_tfstphdr_sel = AV27TFStpHdr_Sel ;
      AV68Consultahdrssuspendidas_wcds_4_tfstpclicod = AV28TFStpClicod ;
      AV69Consultahdrssuspendidas_wcds_5_tfstpclicod_to = AV29TFStpClicod_To ;
      AV70Consultahdrssuspendidas_wcds_6_tfstpclinom = AV30TFStpCliNom ;
      AV71Consultahdrssuspendidas_wcds_7_tfstpclinom_sel = AV31TFStpCliNom_Sel ;
      AV72Consultahdrssuspendidas_wcds_8_tfstpbarser = AV32TFStpBarser ;
      AV73Consultahdrssuspendidas_wcds_9_tfstpbarser_sel = AV33TFStpBarser_Sel ;
      AV74Consultahdrssuspendidas_wcds_10_tfstpbarserdsc = AV34TFStpBarserDsc ;
      AV75Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel = AV35TFStpBarserDsc_Sel ;
      AV76Consultahdrssuspendidas_wcds_12_tfstpcolor = AV36TFStpColor ;
      AV77Consultahdrssuspendidas_wcds_13_tfstpcolor_sel = AV37TFStpColor_Sel ;
      AV78Consultahdrssuspendidas_wcds_14_tfstp_dia = AV38TFStp_Dia ;
      AV79Consultahdrssuspendidas_wcds_15_tfstp_mot = AV42TFStp_Mot ;
      AV80Consultahdrssuspendidas_wcds_16_tfstp_mot_sel = AV43TFStp_Mot_Sel ;
      AV81Consultahdrssuspendidas_wcds_17_tfstp_diaa = AV44TFStp_DiaA ;
      AV82Consultahdrssuspendidas_wcds_18_tfstp_mota = AV48TFStp_MotA ;
      AV83Consultahdrssuspendidas_wcds_19_tfstp_mota_sel = AV49TFStp_MotA_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV58Emprcod, AV54DiaSuspension, AV59DiaSuspension_to, AV56DiaActivacion, AV57DiaActivacion_to, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFStpHdr, AV27TFStpHdr_Sel, AV28TFStpClicod, AV29TFStpClicod_To, AV30TFStpCliNom, AV31TFStpCliNom_Sel, AV32TFStpBarser, AV33TFStpBarser_Sel, AV34TFStpBarserDsc, AV35TFStpBarserDsc_Sel, AV36TFStpColor, AV37TFStpColor_Sel, AV38TFStp_Dia, AV42TFStp_Mot, AV43TFStp_Mot_Sel, AV44TFStp_DiaA, AV48TFStp_MotA, AV49TFStp_MotA_Sel, AV84Pgmname, AV12OrderedBy, AV13OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV65Consultahdrssuspendidas_wcds_1_filterfulltext = AV15FilterFullText ;
      AV66Consultahdrssuspendidas_wcds_2_tfstphdr = AV26TFStpHdr ;
      AV67Consultahdrssuspendidas_wcds_3_tfstphdr_sel = AV27TFStpHdr_Sel ;
      AV68Consultahdrssuspendidas_wcds_4_tfstpclicod = AV28TFStpClicod ;
      AV69Consultahdrssuspendidas_wcds_5_tfstpclicod_to = AV29TFStpClicod_To ;
      AV70Consultahdrssuspendidas_wcds_6_tfstpclinom = AV30TFStpCliNom ;
      AV71Consultahdrssuspendidas_wcds_7_tfstpclinom_sel = AV31TFStpCliNom_Sel ;
      AV72Consultahdrssuspendidas_wcds_8_tfstpbarser = AV32TFStpBarser ;
      AV73Consultahdrssuspendidas_wcds_9_tfstpbarser_sel = AV33TFStpBarser_Sel ;
      AV74Consultahdrssuspendidas_wcds_10_tfstpbarserdsc = AV34TFStpBarserDsc ;
      AV75Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel = AV35TFStpBarserDsc_Sel ;
      AV76Consultahdrssuspendidas_wcds_12_tfstpcolor = AV36TFStpColor ;
      AV77Consultahdrssuspendidas_wcds_13_tfstpcolor_sel = AV37TFStpColor_Sel ;
      AV78Consultahdrssuspendidas_wcds_14_tfstp_dia = AV38TFStp_Dia ;
      AV79Consultahdrssuspendidas_wcds_15_tfstp_mot = AV42TFStp_Mot ;
      AV80Consultahdrssuspendidas_wcds_16_tfstp_mot_sel = AV43TFStp_Mot_Sel ;
      AV81Consultahdrssuspendidas_wcds_17_tfstp_diaa = AV44TFStp_DiaA ;
      AV82Consultahdrssuspendidas_wcds_18_tfstp_mota = AV48TFStp_MotA ;
      AV83Consultahdrssuspendidas_wcds_19_tfstp_mota_sel = AV49TFStp_MotA_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV58Emprcod, AV54DiaSuspension, AV59DiaSuspension_to, AV56DiaActivacion, AV57DiaActivacion_to, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFStpHdr, AV27TFStpHdr_Sel, AV28TFStpClicod, AV29TFStpClicod_To, AV30TFStpCliNom, AV31TFStpCliNom_Sel, AV32TFStpBarser, AV33TFStpBarser_Sel, AV34TFStpBarserDsc, AV35TFStpBarserDsc_Sel, AV36TFStpColor, AV37TFStpColor_Sel, AV38TFStp_Dia, AV42TFStp_Mot, AV43TFStp_Mot_Sel, AV44TFStp_DiaA, AV48TFStp_MotA, AV49TFStp_MotA_Sel, AV84Pgmname, AV12OrderedBy, AV13OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV65Consultahdrssuspendidas_wcds_1_filterfulltext = AV15FilterFullText ;
      AV66Consultahdrssuspendidas_wcds_2_tfstphdr = AV26TFStpHdr ;
      AV67Consultahdrssuspendidas_wcds_3_tfstphdr_sel = AV27TFStpHdr_Sel ;
      AV68Consultahdrssuspendidas_wcds_4_tfstpclicod = AV28TFStpClicod ;
      AV69Consultahdrssuspendidas_wcds_5_tfstpclicod_to = AV29TFStpClicod_To ;
      AV70Consultahdrssuspendidas_wcds_6_tfstpclinom = AV30TFStpCliNom ;
      AV71Consultahdrssuspendidas_wcds_7_tfstpclinom_sel = AV31TFStpCliNom_Sel ;
      AV72Consultahdrssuspendidas_wcds_8_tfstpbarser = AV32TFStpBarser ;
      AV73Consultahdrssuspendidas_wcds_9_tfstpbarser_sel = AV33TFStpBarser_Sel ;
      AV74Consultahdrssuspendidas_wcds_10_tfstpbarserdsc = AV34TFStpBarserDsc ;
      AV75Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel = AV35TFStpBarserDsc_Sel ;
      AV76Consultahdrssuspendidas_wcds_12_tfstpcolor = AV36TFStpColor ;
      AV77Consultahdrssuspendidas_wcds_13_tfstpcolor_sel = AV37TFStpColor_Sel ;
      AV78Consultahdrssuspendidas_wcds_14_tfstp_dia = AV38TFStp_Dia ;
      AV79Consultahdrssuspendidas_wcds_15_tfstp_mot = AV42TFStp_Mot ;
      AV80Consultahdrssuspendidas_wcds_16_tfstp_mot_sel = AV43TFStp_Mot_Sel ;
      AV81Consultahdrssuspendidas_wcds_17_tfstp_diaa = AV44TFStp_DiaA ;
      AV82Consultahdrssuspendidas_wcds_18_tfstp_mota = AV48TFStp_MotA ;
      AV83Consultahdrssuspendidas_wcds_19_tfstp_mota_sel = AV49TFStp_MotA_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV58Emprcod, AV54DiaSuspension, AV59DiaSuspension_to, AV56DiaActivacion, AV57DiaActivacion_to, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFStpHdr, AV27TFStpHdr_Sel, AV28TFStpClicod, AV29TFStpClicod_To, AV30TFStpCliNom, AV31TFStpCliNom_Sel, AV32TFStpBarser, AV33TFStpBarser_Sel, AV34TFStpBarserDsc, AV35TFStpBarserDsc_Sel, AV36TFStpColor, AV37TFStpColor_Sel, AV38TFStp_Dia, AV42TFStp_Mot, AV43TFStp_Mot_Sel, AV44TFStp_DiaA, AV48TFStp_MotA, AV49TFStp_MotA_Sel, AV84Pgmname, AV12OrderedBy, AV13OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV84Pgmname = "ConsultaHdrsSuspendidas_WC" ;
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup1C30( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e181C32 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV23ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV50DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV20ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_41 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_41"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV52GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV53GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV58Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV58Emprcod") ;
         wcpOAV54DiaSuspension = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV54DiaSuspension"), 0) ;
         wcpOAV59DiaSuspension_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV59DiaSuspension_to"), 0) ;
         wcpOAV56DiaActivacion = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV56DiaActivacion"), 0) ;
         wcpOAV57DiaActivacion_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV57DiaActivacion_to"), 0) ;
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
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_stp_diaauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_STP_DIAAUXDATE");
            GX_FocusControl = edtavDdo_stp_diaauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV40DDO_Stp_DiaAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40DDO_Stp_DiaAuxDate", localUtil.format(AV40DDO_Stp_DiaAuxDate, "99/99/99"));
         }
         else
         {
            AV40DDO_Stp_DiaAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_stp_diaauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40DDO_Stp_DiaAuxDate", localUtil.format(AV40DDO_Stp_DiaAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_stp_diaaauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_STP_DIAAAUXDATE");
            GX_FocusControl = edtavDdo_stp_diaaauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV46DDO_Stp_DiaAAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46DDO_Stp_DiaAAuxDate", localUtil.format(AV46DDO_Stp_DiaAAuxDate, "99/99/99"));
         }
         else
         {
            AV46DDO_Stp_DiaAAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_stp_diaaauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46DDO_Stp_DiaAAuxDate", localUtil.format(AV46DDO_Stp_DiaAAuxDate, "99/99/99"));
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
      e181C32 ();
      if (returnInSub) return;
   }

   public void e181C32( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV62Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      consultahdrssuspendidas_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV62Station = GXt_char1 ;
      GXv_char2[0] = AV58Emprcod ;
      GXv_char3[0] = AV63Emprnom ;
      GXv_char4[0] = AV64Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV62Station, GXv_char2, GXv_char3, GXv_char4) ;
      consultahdrssuspendidas_wc_impl.this.AV58Emprcod = GXv_char2[0] ;
      consultahdrssuspendidas_wc_impl.this.AV63Emprnom = GXv_char3[0] ;
      consultahdrssuspendidas_wc_impl.this.AV64Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58Emprcod", AV58Emprcod);
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV50DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV50DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e191C32( )
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
      if ( GXutil.strcmp(AV22Session.getValue("ConsultaHdrsSuspendidas_WCColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV22Session.getValue("ConsultaHdrsSuspendidas_WCColumnsSelector") ;
         AV20ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtStpHdr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtStpHdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStpHdr_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtStpClicod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtStpClicod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStpClicod_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtStpCliNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtStpCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStpCliNom_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtStpBarser_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtStpBarser_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStpBarser_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtStpBarserD_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtStpBarserD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStpBarserD_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtStpColor_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtStpColor_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStpColor_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtStp_Dia_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtStp_Dia_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStp_Dia_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtStp_Mot_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtStp_Mot_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStp_Mot_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtStp_DiaA_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtStp_DiaA_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStp_DiaA_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtStp_MotA_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtStp_MotA_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStp_MotA_Visible), 5, 0), !bGXsfl_41_Refreshing);
      AV52GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52GridCurrentPage), 10, 0));
      AV53GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53GridPageCount), 10, 0));
      AV65Consultahdrssuspendidas_wcds_1_filterfulltext = AV15FilterFullText ;
      AV66Consultahdrssuspendidas_wcds_2_tfstphdr = AV26TFStpHdr ;
      AV67Consultahdrssuspendidas_wcds_3_tfstphdr_sel = AV27TFStpHdr_Sel ;
      AV68Consultahdrssuspendidas_wcds_4_tfstpclicod = AV28TFStpClicod ;
      AV69Consultahdrssuspendidas_wcds_5_tfstpclicod_to = AV29TFStpClicod_To ;
      AV70Consultahdrssuspendidas_wcds_6_tfstpclinom = AV30TFStpCliNom ;
      AV71Consultahdrssuspendidas_wcds_7_tfstpclinom_sel = AV31TFStpCliNom_Sel ;
      AV72Consultahdrssuspendidas_wcds_8_tfstpbarser = AV32TFStpBarser ;
      AV73Consultahdrssuspendidas_wcds_9_tfstpbarser_sel = AV33TFStpBarser_Sel ;
      AV74Consultahdrssuspendidas_wcds_10_tfstpbarserdsc = AV34TFStpBarserDsc ;
      AV75Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel = AV35TFStpBarserDsc_Sel ;
      AV76Consultahdrssuspendidas_wcds_12_tfstpcolor = AV36TFStpColor ;
      AV77Consultahdrssuspendidas_wcds_13_tfstpcolor_sel = AV37TFStpColor_Sel ;
      AV78Consultahdrssuspendidas_wcds_14_tfstp_dia = AV38TFStp_Dia ;
      AV79Consultahdrssuspendidas_wcds_15_tfstp_mot = AV42TFStp_Mot ;
      AV80Consultahdrssuspendidas_wcds_16_tfstp_mot_sel = AV43TFStp_Mot_Sel ;
      AV81Consultahdrssuspendidas_wcds_17_tfstp_diaa = AV44TFStp_DiaA ;
      AV82Consultahdrssuspendidas_wcds_18_tfstp_mota = AV48TFStp_MotA ;
      AV83Consultahdrssuspendidas_wcds_19_tfstp_mota_sel = AV49TFStp_MotA_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e121C32( )
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
         AV51PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV51PageToGo) ;
      }
   }

   public void e131C32( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e141C32( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "StpHdr") == 0 )
         {
            AV26TFStpHdr = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFStpHdr", AV26TFStpHdr);
            AV27TFStpHdr_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFStpHdr_Sel", AV27TFStpHdr_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "StpClicod") == 0 )
         {
            AV28TFStpClicod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFStpClicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFStpClicod), 6, 0));
            AV29TFStpClicod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFStpClicod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFStpClicod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "StpCliNom") == 0 )
         {
            AV30TFStpCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFStpCliNom", AV30TFStpCliNom);
            AV31TFStpCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFStpCliNom_Sel", AV31TFStpCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "StpBarser") == 0 )
         {
            AV32TFStpBarser = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFStpBarser", AV32TFStpBarser);
            AV33TFStpBarser_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFStpBarser_Sel", AV33TFStpBarser_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "StpBarserDsc") == 0 )
         {
            AV34TFStpBarserDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFStpBarserDsc", AV34TFStpBarserDsc);
            AV35TFStpBarserDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFStpBarserDsc_Sel", AV35TFStpBarserDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "StpColor") == 0 )
         {
            AV36TFStpColor = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFStpColor", AV36TFStpColor);
            AV37TFStpColor_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFStpColor_Sel", AV37TFStpColor_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Stp_Dia") == 0 )
         {
            AV38TFStp_Dia = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFStp_Dia", localUtil.ttoc( AV38TFStp_Dia, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Stp_Mot") == 0 )
         {
            AV42TFStp_Mot = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFStp_Mot", AV42TFStp_Mot);
            AV43TFStp_Mot_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFStp_Mot_Sel", AV43TFStp_Mot_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Stp_DiaA") == 0 )
         {
            AV44TFStp_DiaA = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFStp_DiaA", localUtil.ttoc( AV44TFStp_DiaA, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Stp_MotA") == 0 )
         {
            AV48TFStp_MotA = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFStp_MotA", AV48TFStp_MotA);
            AV49TFStp_MotA_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFStp_MotA_Sel", AV49TFStp_MotA_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e201C32( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
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
   }

   public void e151C32( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV18ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV20ColumnsSelector.fromJSonString(AV18ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "ConsultaHdrsSuspendidas_WCColumnsSelector", ((GXutil.strcmp("", AV18ColumnsSelectorXML)==0) ? "" : AV20ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e111C32( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("ConsultaHdrsSuspendidas_WCFilters")),GXutil.URLEncode(GXutil.rtrim(AV84Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("ConsultaHdrsSuspendidas_WCFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV24ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "ConsultaHdrsSuspendidas_WCFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         consultahdrssuspendidas_wc_impl.this.GXt_char1 = GXv_char4[0] ;
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
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV84Pgmname+"GridState", AV24ManageFiltersXml) ;
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

   public void e161C32( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV16ExcelFilename ;
      GXv_char3[0] = AV17ErrorMessage ;
      new app.consultahdrssuspendidas_wcexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      consultahdrssuspendidas_wc_impl.this.AV16ExcelFilename = GXv_char4[0] ;
      consultahdrssuspendidas_wc_impl.this.AV17ErrorMessage = GXv_char3[0] ;
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

   public void e171C32( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.consultahdrssuspendidas_wcexportcsv", new String[] {}, new String[] {}) );
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "StpHdr", "", "Hdr", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "StpClicod", "", "Cliente", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "StpCliNom", "", "Nombre", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "StpBarser", "", "Articulo", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "StpBarserDsc", "", "Descripcion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "StpColor", "", "Color", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Stp_Dia", "", "Dia Suspension", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Stp_Mot", "", "Motivo Suspension", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Stp_DiaA", "", "Dia Activacion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Stp_MotA", "", "Motivo Activacion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV19UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "ConsultaHdrsSuspendidas_WCColumnsSelector", GXv_char4) ;
      consultahdrssuspendidas_wc_impl.this.GXt_char1 = GXv_char4[0] ;
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
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "ConsultaHdrsSuspendidas_WCFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV23ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV15FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
      AV26TFStpHdr = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFStpHdr", AV26TFStpHdr);
      AV27TFStpHdr_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFStpHdr_Sel", AV27TFStpHdr_Sel);
      AV28TFStpClicod = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFStpClicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFStpClicod), 6, 0));
      AV29TFStpClicod_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFStpClicod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFStpClicod_To), 6, 0));
      AV30TFStpCliNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFStpCliNom", AV30TFStpCliNom);
      AV31TFStpCliNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFStpCliNom_Sel", AV31TFStpCliNom_Sel);
      AV32TFStpBarser = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFStpBarser", AV32TFStpBarser);
      AV33TFStpBarser_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFStpBarser_Sel", AV33TFStpBarser_Sel);
      AV34TFStpBarserDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFStpBarserDsc", AV34TFStpBarserDsc);
      AV35TFStpBarserDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFStpBarserDsc_Sel", AV35TFStpBarserDsc_Sel);
      AV36TFStpColor = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFStpColor", AV36TFStpColor);
      AV37TFStpColor_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFStpColor_Sel", AV37TFStpColor_Sel);
      AV38TFStp_Dia = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFStp_Dia", localUtil.ttoc( AV38TFStp_Dia, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV42TFStp_Mot = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFStp_Mot", AV42TFStp_Mot);
      AV43TFStp_Mot_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFStp_Mot_Sel", AV43TFStp_Mot_Sel);
      AV44TFStp_DiaA = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFStp_DiaA", localUtil.ttoc( AV44TFStp_DiaA, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV48TFStp_MotA = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFStp_MotA", AV48TFStp_MotA);
      AV49TFStp_MotA_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFStp_MotA_Sel", AV49TFStp_MotA_Sel);
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
      if ( GXutil.strcmp(AV22Session.getValue(AV84Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV84Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV84Pgmname+"GridState"), null, null);
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
      AV85GXV1 = 1 ;
      while ( AV85GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV85GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV15FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPHDR") == 0 )
         {
            AV26TFStpHdr = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFStpHdr", AV26TFStpHdr);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPHDR_SEL") == 0 )
         {
            AV27TFStpHdr_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFStpHdr_Sel", AV27TFStpHdr_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCLICOD") == 0 )
         {
            AV28TFStpClicod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFStpClicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFStpClicod), 6, 0));
            AV29TFStpClicod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFStpClicod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFStpClicod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCLINOM") == 0 )
         {
            AV30TFStpCliNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFStpCliNom", AV30TFStpCliNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCLINOM_SEL") == 0 )
         {
            AV31TFStpCliNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFStpCliNom_Sel", AV31TFStpCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPBARSER") == 0 )
         {
            AV32TFStpBarser = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFStpBarser", AV32TFStpBarser);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPBARSER_SEL") == 0 )
         {
            AV33TFStpBarser_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFStpBarser_Sel", AV33TFStpBarser_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPBARSERDSC") == 0 )
         {
            AV34TFStpBarserDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFStpBarserDsc", AV34TFStpBarserDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPBARSERDSC_SEL") == 0 )
         {
            AV35TFStpBarserDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFStpBarserDsc_Sel", AV35TFStpBarserDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCOLOR") == 0 )
         {
            AV36TFStpColor = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFStpColor", AV36TFStpColor);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCOLOR_SEL") == 0 )
         {
            AV37TFStpColor_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFStpColor_Sel", AV37TFStpColor_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTP_DIA") == 0 )
         {
            AV38TFStp_Dia = localUtil.ctot( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFStp_Dia", localUtil.ttoc( AV38TFStp_Dia, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV40DDO_Stp_DiaAuxDate = GXutil.resetTime(AV38TFStp_Dia) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40DDO_Stp_DiaAuxDate", localUtil.format(AV40DDO_Stp_DiaAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTP_MOT") == 0 )
         {
            AV42TFStp_Mot = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFStp_Mot", AV42TFStp_Mot);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTP_MOT_SEL") == 0 )
         {
            AV43TFStp_Mot_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFStp_Mot_Sel", AV43TFStp_Mot_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTP_DIAA") == 0 )
         {
            AV44TFStp_DiaA = localUtil.ctot( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFStp_DiaA", localUtil.ttoc( AV44TFStp_DiaA, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV46DDO_Stp_DiaAAuxDate = GXutil.resetTime(AV44TFStp_DiaA) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46DDO_Stp_DiaAAuxDate", localUtil.format(AV46DDO_Stp_DiaAAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTP_MOTA") == 0 )
         {
            AV48TFStp_MotA = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFStp_MotA", AV48TFStp_MotA);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTP_MOTA_SEL") == 0 )
         {
            AV49TFStp_MotA_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFStp_MotA_Sel", AV49TFStp_MotA_Sel);
         }
         AV85GXV1 = (int)(AV85GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV27TFStpHdr_Sel)==0), AV27TFStpHdr_Sel, GXv_char4) ;
      consultahdrssuspendidas_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV31TFStpCliNom_Sel)==0), AV31TFStpCliNom_Sel, GXv_char3) ;
      consultahdrssuspendidas_wc_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char2[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV33TFStpBarser_Sel)==0), AV33TFStpBarser_Sel, GXv_char2) ;
      consultahdrssuspendidas_wc_impl.this.GXt_char13 = GXv_char2[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV35TFStpBarserDsc_Sel)==0), AV35TFStpBarserDsc_Sel, GXv_char15) ;
      consultahdrssuspendidas_wc_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV37TFStpColor_Sel)==0), AV37TFStpColor_Sel, GXv_char17) ;
      consultahdrssuspendidas_wc_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV43TFStp_Mot_Sel)==0), AV43TFStp_Mot_Sel, GXv_char19) ;
      consultahdrssuspendidas_wc_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV49TFStp_MotA_Sel)==0), AV49TFStp_MotA_Sel, GXv_char21) ;
      consultahdrssuspendidas_wc_impl.this.GXt_char20 = GXv_char21[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"||"+GXt_char12+"|"+GXt_char13+"|"+GXt_char14+"|"+GXt_char16+"||"+GXt_char18+"||"+GXt_char20 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV26TFStpHdr)==0), AV26TFStpHdr, GXv_char21) ;
      consultahdrssuspendidas_wc_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV30TFStpCliNom)==0), AV30TFStpCliNom, GXv_char19) ;
      consultahdrssuspendidas_wc_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV32TFStpBarser)==0), AV32TFStpBarser, GXv_char17) ;
      consultahdrssuspendidas_wc_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV34TFStpBarserDsc)==0), AV34TFStpBarserDsc, GXv_char15) ;
      consultahdrssuspendidas_wc_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV36TFStpColor)==0), AV36TFStpColor, GXv_char4) ;
      consultahdrssuspendidas_wc_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV42TFStp_Mot)==0), AV42TFStp_Mot, GXv_char3) ;
      consultahdrssuspendidas_wc_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV48TFStp_MotA)==0), AV48TFStp_MotA, GXv_char2) ;
      consultahdrssuspendidas_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = GXt_char20+"|"+((0==AV28TFStpClicod) ? "" : GXutil.str( AV28TFStpClicod, 6, 0))+"|"+GXt_char18+"|"+GXt_char16+"|"+GXt_char14+"|"+GXt_char13+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV38TFStp_Dia) ? "" : localUtil.dtoc( AV40DDO_Stp_DiaAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char12+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV44TFStp_DiaA) ? "" : localUtil.dtoc( AV46DDO_Stp_DiaAAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|"+((0==AV29TFStpClicod_To) ? "" : GXutil.str( AV29TFStpClicod_To, 6, 0))+"||||||||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV22Session.getValue(AV84Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV15FilterFullText)==0), (short)(0), AV15FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFSTPHDR", "", !(GXutil.strcmp("", AV26TFStpHdr)==0), (short)(0), AV26TFStpHdr, "", !(GXutil.strcmp("", AV27TFStpHdr_Sel)==0), AV27TFStpHdr_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFSTPCLICOD", "", !((0==AV28TFStpClicod)&&(0==AV29TFStpClicod_To)), (short)(0), GXutil.trim( GXutil.str( AV28TFStpClicod, 6, 0)), GXutil.trim( GXutil.str( AV29TFStpClicod_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFSTPCLINOM", "", !(GXutil.strcmp("", AV30TFStpCliNom)==0), (short)(0), AV30TFStpCliNom, "", !(GXutil.strcmp("", AV31TFStpCliNom_Sel)==0), AV31TFStpCliNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFSTPBARSER", "", !(GXutil.strcmp("", AV32TFStpBarser)==0), (short)(0), AV32TFStpBarser, "", !(GXutil.strcmp("", AV33TFStpBarser_Sel)==0), AV33TFStpBarser_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFSTPBARSERDSC", "", !(GXutil.strcmp("", AV34TFStpBarserDsc)==0), (short)(0), AV34TFStpBarserDsc, "", !(GXutil.strcmp("", AV35TFStpBarserDsc_Sel)==0), AV35TFStpBarserDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFSTPCOLOR", "", !(GXutil.strcmp("", AV36TFStpColor)==0), (short)(0), AV36TFStpColor, "", !(GXutil.strcmp("", AV37TFStpColor_Sel)==0), AV37TFStpColor_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFSTP_DIA", "", !GXutil.dateCompare(GXutil.nullDate(), AV38TFStp_Dia), (short)(0), GXutil.trim( localUtil.ttoc( AV38TFStp_Dia, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFSTP_MOT", "", !(GXutil.strcmp("", AV42TFStp_Mot)==0), (short)(0), AV42TFStp_Mot, "", !(GXutil.strcmp("", AV43TFStp_Mot_Sel)==0), AV43TFStp_Mot_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFSTP_DIAA", "", !GXutil.dateCompare(GXutil.nullDate(), AV44TFStp_DiaA), (short)(0), GXutil.trim( localUtil.ttoc( AV44TFStp_DiaA, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFSTP_MOTA", "", !(GXutil.strcmp("", AV48TFStp_MotA)==0), (short)(0), AV48TFStp_MotA, "", !(GXutil.strcmp("", AV49TFStp_MotA_Sel)==0), AV49TFStp_MotA_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      if ( ! (GXutil.strcmp("", AV58Emprcod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV58Emprcod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV54DiaSuspension)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&DIASUSPENSION" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV54DiaSuspension, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV59DiaSuspension_to)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&DIASUSPENSION_TO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV59DiaSuspension_to, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV56DiaActivacion)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&DIAACTIVACION" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV56DiaActivacion, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV57DiaActivacion_to)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&DIAACTIVACION_TO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV57DiaActivacion_to, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV84Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV84Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "HDSTO1" );
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_23_1C32( boolean wbgen )
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
         wb_table2_28_1C32( true) ;
      }
      else
      {
         wb_table2_28_1C32( false) ;
      }
      return  ;
   }

   public void wb_table2_28_1C32e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_23_1C32e( true) ;
      }
      else
      {
         wb_table1_23_1C32e( false) ;
      }
   }

   public void wb_table2_28_1C32( boolean wbgen )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV15FilterFullText, GXutil.rtrim( localUtil.format( AV15FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_ConsultaHdrsSuspendidas_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_28_1C32e( true) ;
      }
      else
      {
         wb_table2_28_1C32e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV58Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58Emprcod", AV58Emprcod);
      AV54DiaSuspension = (java.util.Date)getParm(obj,1,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54DiaSuspension", localUtil.format(AV54DiaSuspension, "99/99/99"));
      AV59DiaSuspension_to = (java.util.Date)getParm(obj,2,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59DiaSuspension_to", localUtil.format(AV59DiaSuspension_to, "99/99/99"));
      AV56DiaActivacion = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56DiaActivacion", localUtil.format(AV56DiaActivacion, "99/99/99"));
      AV57DiaActivacion_to = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57DiaActivacion_to", localUtil.format(AV57DiaActivacion_to, "99/99/99"));
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
      pa1C32( ) ;
      ws1C32( ) ;
      we1C32( ) ;
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
      sCtrlAV58Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV54DiaSuspension = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV59DiaSuspension_to = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV56DiaActivacion = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV57DiaActivacion_to = (String)getParm(obj,4,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1C32( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "consultahdrssuspendidas_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1C32( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV58Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58Emprcod", AV58Emprcod);
         AV54DiaSuspension = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54DiaSuspension", localUtil.format(AV54DiaSuspension, "99/99/99"));
         AV59DiaSuspension_to = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59DiaSuspension_to", localUtil.format(AV59DiaSuspension_to, "99/99/99"));
         AV56DiaActivacion = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56DiaActivacion", localUtil.format(AV56DiaActivacion, "99/99/99"));
         AV57DiaActivacion_to = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57DiaActivacion_to", localUtil.format(AV57DiaActivacion_to, "99/99/99"));
      }
      wcpOAV58Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV58Emprcod") ;
      wcpOAV54DiaSuspension = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV54DiaSuspension"), 0) ;
      wcpOAV59DiaSuspension_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV59DiaSuspension_to"), 0) ;
      wcpOAV56DiaActivacion = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV56DiaActivacion"), 0) ;
      wcpOAV57DiaActivacion_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV57DiaActivacion_to"), 0) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV58Emprcod, wcpOAV58Emprcod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV54DiaSuspension), GXutil.resetTime(wcpOAV54DiaSuspension)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV59DiaSuspension_to), GXutil.resetTime(wcpOAV59DiaSuspension_to)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV56DiaActivacion), GXutil.resetTime(wcpOAV56DiaActivacion)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV57DiaActivacion_to), GXutil.resetTime(wcpOAV57DiaActivacion_to)) ) ) )
      {
         setjustcreated();
      }
      wcpOAV58Emprcod = AV58Emprcod ;
      wcpOAV54DiaSuspension = AV54DiaSuspension ;
      wcpOAV59DiaSuspension_to = AV59DiaSuspension_to ;
      wcpOAV56DiaActivacion = AV56DiaActivacion ;
      wcpOAV57DiaActivacion_to = AV57DiaActivacion_to ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV58Emprcod = httpContext.cgiGet( sPrefix+"AV58Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV58Emprcod) > 0 )
      {
         AV58Emprcod = httpContext.cgiGet( sCtrlAV58Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58Emprcod", AV58Emprcod);
      }
      else
      {
         AV58Emprcod = httpContext.cgiGet( sPrefix+"AV58Emprcod_PARM") ;
      }
      sCtrlAV54DiaSuspension = httpContext.cgiGet( sPrefix+"AV54DiaSuspension_CTRL") ;
      if ( GXutil.len( sCtrlAV54DiaSuspension) > 0 )
      {
         AV54DiaSuspension = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV54DiaSuspension), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54DiaSuspension", localUtil.format(AV54DiaSuspension, "99/99/99"));
      }
      else
      {
         AV54DiaSuspension = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV54DiaSuspension_PARM"), 0) ;
      }
      sCtrlAV59DiaSuspension_to = httpContext.cgiGet( sPrefix+"AV59DiaSuspension_to_CTRL") ;
      if ( GXutil.len( sCtrlAV59DiaSuspension_to) > 0 )
      {
         AV59DiaSuspension_to = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV59DiaSuspension_to), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59DiaSuspension_to", localUtil.format(AV59DiaSuspension_to, "99/99/99"));
      }
      else
      {
         AV59DiaSuspension_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV59DiaSuspension_to_PARM"), 0) ;
      }
      sCtrlAV56DiaActivacion = httpContext.cgiGet( sPrefix+"AV56DiaActivacion_CTRL") ;
      if ( GXutil.len( sCtrlAV56DiaActivacion) > 0 )
      {
         AV56DiaActivacion = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV56DiaActivacion), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56DiaActivacion", localUtil.format(AV56DiaActivacion, "99/99/99"));
      }
      else
      {
         AV56DiaActivacion = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV56DiaActivacion_PARM"), 0) ;
      }
      sCtrlAV57DiaActivacion_to = httpContext.cgiGet( sPrefix+"AV57DiaActivacion_to_CTRL") ;
      if ( GXutil.len( sCtrlAV57DiaActivacion_to) > 0 )
      {
         AV57DiaActivacion_to = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV57DiaActivacion_to), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57DiaActivacion_to", localUtil.format(AV57DiaActivacion_to, "99/99/99"));
      }
      else
      {
         AV57DiaActivacion_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV57DiaActivacion_to_PARM"), 0) ;
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
      pa1C32( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1C32( ) ;
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
      ws1C32( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV58Emprcod_PARM", GXutil.rtrim( AV58Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV58Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV58Emprcod_CTRL", GXutil.rtrim( sCtrlAV58Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV54DiaSuspension_PARM", localUtil.dtoc( AV54DiaSuspension, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV54DiaSuspension)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV54DiaSuspension_CTRL", GXutil.rtrim( sCtrlAV54DiaSuspension));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV59DiaSuspension_to_PARM", localUtil.dtoc( AV59DiaSuspension_to, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV59DiaSuspension_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV59DiaSuspension_to_CTRL", GXutil.rtrim( sCtrlAV59DiaSuspension_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV56DiaActivacion_PARM", localUtil.dtoc( AV56DiaActivacion, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV56DiaActivacion)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV56DiaActivacion_CTRL", GXutil.rtrim( sCtrlAV56DiaActivacion));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV57DiaActivacion_to_PARM", localUtil.dtoc( AV57DiaActivacion_to, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV57DiaActivacion_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV57DiaActivacion_to_CTRL", GXutil.rtrim( sCtrlAV57DiaActivacion_to));
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
      we1C32( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115563683", true, true);
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
      httpContext.AddJavascriptSource("consultahdrssuspendidas_wc.js", "?202682115563683", false, true);
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
      edtStpHdr_Internalname = sPrefix+"STPHDR_"+sGXsfl_41_idx ;
      edtStpClicod_Internalname = sPrefix+"STPCLICOD_"+sGXsfl_41_idx ;
      edtStpCliNom_Internalname = sPrefix+"STPCLINOM_"+sGXsfl_41_idx ;
      edtStpBarser_Internalname = sPrefix+"STPBARSER_"+sGXsfl_41_idx ;
      edtStpBarserD_Internalname = sPrefix+"STPBARSERD_"+sGXsfl_41_idx ;
      edtStpColor_Internalname = sPrefix+"STPCOLOR_"+sGXsfl_41_idx ;
      edtStp_Dia_Internalname = sPrefix+"STP_DIA_"+sGXsfl_41_idx ;
      edtStp_Mot_Internalname = sPrefix+"STP_MOT_"+sGXsfl_41_idx ;
      edtStp_DiaA_Internalname = sPrefix+"STP_DIAA_"+sGXsfl_41_idx ;
      edtStp_MotA_Internalname = sPrefix+"STP_MOTA_"+sGXsfl_41_idx ;
   }

   public void subsflControlProps_fel_412( )
   {
      edtStpHdr_Internalname = sPrefix+"STPHDR_"+sGXsfl_41_fel_idx ;
      edtStpClicod_Internalname = sPrefix+"STPCLICOD_"+sGXsfl_41_fel_idx ;
      edtStpCliNom_Internalname = sPrefix+"STPCLINOM_"+sGXsfl_41_fel_idx ;
      edtStpBarser_Internalname = sPrefix+"STPBARSER_"+sGXsfl_41_fel_idx ;
      edtStpBarserD_Internalname = sPrefix+"STPBARSERD_"+sGXsfl_41_fel_idx ;
      edtStpColor_Internalname = sPrefix+"STPCOLOR_"+sGXsfl_41_fel_idx ;
      edtStp_Dia_Internalname = sPrefix+"STP_DIA_"+sGXsfl_41_fel_idx ;
      edtStp_Mot_Internalname = sPrefix+"STP_MOT_"+sGXsfl_41_fel_idx ;
      edtStp_DiaA_Internalname = sPrefix+"STP_DIAA_"+sGXsfl_41_fel_idx ;
      edtStp_MotA_Internalname = sPrefix+"STP_MOTA_"+sGXsfl_41_fel_idx ;
   }

   public void sendrow_412( )
   {
      subsflControlProps_412( ) ;
      wb1C30( ) ;
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
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtStpHdr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtStpHdr_Internalname,GXutil.rtrim( A13723StpHdr),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtStpHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtStpHdr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtStpClicod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtStpClicod_Internalname,GXutil.ltrim( localUtil.ntoc( A13726StpClicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13726StpClicod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtStpClicod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtStpClicod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtStpCliNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtStpCliNom_Internalname,GXutil.rtrim( A13727StpCliNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtStpCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtStpCliNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtStpBarser_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtStpBarser_Internalname,GXutil.rtrim( A13724StpBarser),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtStpBarser_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtStpBarser_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtStpBarserD_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtStpBarserD_Internalname,GXutil.rtrim( A13725StpBarserD),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtStpBarserD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtStpBarserD_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtStpColor_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtStpColor_Internalname,GXutil.rtrim( A13728StpColor),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtStpColor_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtStpColor_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtStp_Dia_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtStp_Dia_Internalname,localUtil.ttoc( A10751Stp_Dia, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A10751Stp_Dia, "99/99/99 99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtStp_Dia_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtStp_Dia_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtStp_Mot_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtStp_Mot_Internalname,A10752Stp_Mot,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtStp_Mot_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtStp_Mot_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(300),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtStp_DiaA_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtStp_DiaA_Internalname,localUtil.ttoc( A10756Stp_DiaA, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A10756Stp_DiaA, "99/99/99 99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtStp_DiaA_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtStp_DiaA_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtStp_MotA_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtStp_MotA_Internalname,A10757Stp_MotA,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtStp_MotA_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtStp_MotA_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(300),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes1C32( ) ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtStp_Dia_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Dia Suspension", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtStp_Mot_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Motivo Suspension", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtStp_DiaA_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Dia Activacion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtStp_MotA_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Motivo Activacion", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13723StpHdr));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtStpHdr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13726StpClicod, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtStpClicod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13727StpCliNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtStpCliNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13724StpBarser));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtStpBarser_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13725StpBarserD));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtStpBarserD_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13728StpColor));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtStpColor_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A10751Stp_Dia, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtStp_Dia_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A10752Stp_Mot);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtStp_Mot_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A10756Stp_DiaA, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtStp_DiaA_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A10757Stp_MotA);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtStp_MotA_Visible, (byte)(5), (byte)(0), ".", "")));
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
      edtStpHdr_Internalname = sPrefix+"STPHDR" ;
      edtStpClicod_Internalname = sPrefix+"STPCLICOD" ;
      edtStpCliNom_Internalname = sPrefix+"STPCLINOM" ;
      edtStpBarser_Internalname = sPrefix+"STPBARSER" ;
      edtStpBarserD_Internalname = sPrefix+"STPBARSERD" ;
      edtStpColor_Internalname = sPrefix+"STPCOLOR" ;
      edtStp_Dia_Internalname = sPrefix+"STP_DIA" ;
      edtStp_Mot_Internalname = sPrefix+"STP_MOT" ;
      edtStp_DiaA_Internalname = sPrefix+"STP_DIAA" ;
      edtStp_MotA_Internalname = sPrefix+"STP_MOTA" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      edtavDdo_stp_diaauxdate_Internalname = sPrefix+"vDDO_STP_DIAAUXDATE" ;
      divDdo_stp_diaauxdates_Internalname = sPrefix+"DDO_STP_DIAAUXDATES" ;
      edtavDdo_stp_diaaauxdate_Internalname = sPrefix+"vDDO_STP_DIAAAUXDATE" ;
      divDdo_stp_diaaauxdates_Internalname = sPrefix+"DDO_STP_DIAAAUXDATES" ;
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
      edtStp_MotA_Jsonclick = "" ;
      edtStp_DiaA_Jsonclick = "" ;
      edtStp_Mot_Jsonclick = "" ;
      edtStp_Dia_Jsonclick = "" ;
      edtStpColor_Jsonclick = "" ;
      edtStpBarserD_Jsonclick = "" ;
      edtStpBarser_Jsonclick = "" ;
      edtStpCliNom_Jsonclick = "" ;
      edtStpClicod_Jsonclick = "" ;
      edtStpHdr_Jsonclick = "" ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtStp_MotA_Visible = -1 ;
      edtStp_DiaA_Visible = -1 ;
      edtStp_Mot_Visible = -1 ;
      edtStp_Dia_Visible = -1 ;
      edtStpColor_Visible = -1 ;
      edtStpBarserD_Visible = -1 ;
      edtStpBarser_Visible = -1 ;
      edtStpCliNom_Visible = -1 ;
      edtStpClicod_Visible = -1 ;
      edtStpHdr_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_stp_diaaauxdate_Jsonclick = "" ;
      edtavDdo_stp_diaauxdate_Jsonclick = "" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "ConsultaHdrsSuspendidas_WCGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic||Dynamic|Dynamic|Dynamic|Dynamic||Dynamic||Dynamic" ;
      Ddo_grid_Includedatalist = "T||T|T|T|T||T||T" ;
      Ddo_grid_Filterisrange = "|T||||||||" ;
      Ddo_grid_Filtertype = "Character|Numeric|Character|Character|Character|Character|Date|Character|Date|Character" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "||||||T|T|T|T" ;
      Ddo_grid_Columnssortvalues = "||||||1|2|3|4" ;
      Ddo_grid_Columnids = "0:StpHdr|1:StpClicod|2:StpCliNom|3:StpBarser|4:StpBarserDsc|5:StpColor|6:Stp_Dia|7:Stp_Mot|8:Stp_DiaA|9:Stp_MotA" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV58Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV54DiaSuspension',fld:'vDIASUSPENSION',pic:''},{av:'AV59DiaSuspension_to',fld:'vDIASUSPENSION_TO',pic:''},{av:'AV56DiaActivacion',fld:'vDIAACTIVACION',pic:''},{av:'AV57DiaActivacion_to',fld:'vDIAACTIVACION_TO',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFStpHdr',fld:'vTFSTPHDR',pic:''},{av:'AV27TFStpHdr_Sel',fld:'vTFSTPHDR_SEL',pic:''},{av:'AV28TFStpClicod',fld:'vTFSTPCLICOD',pic:'ZZZZZ9'},{av:'AV29TFStpClicod_To',fld:'vTFSTPCLICOD_TO',pic:'ZZZZZ9'},{av:'AV30TFStpCliNom',fld:'vTFSTPCLINOM',pic:''},{av:'AV31TFStpCliNom_Sel',fld:'vTFSTPCLINOM_SEL',pic:''},{av:'AV32TFStpBarser',fld:'vTFSTPBARSER',pic:''},{av:'AV33TFStpBarser_Sel',fld:'vTFSTPBARSER_SEL',pic:''},{av:'AV34TFStpBarserDsc',fld:'vTFSTPBARSERDSC',pic:''},{av:'AV35TFStpBarserDsc_Sel',fld:'vTFSTPBARSERDSC_SEL',pic:''},{av:'AV36TFStpColor',fld:'vTFSTPCOLOR',pic:''},{av:'AV37TFStpColor_Sel',fld:'vTFSTPCOLOR_SEL',pic:''},{av:'AV38TFStp_Dia',fld:'vTFSTP_DIA',pic:'99/99/99 99:99'},{av:'AV42TFStp_Mot',fld:'vTFSTP_MOT',pic:''},{av:'AV43TFStp_Mot_Sel',fld:'vTFSTP_MOT_SEL',pic:''},{av:'AV44TFStp_DiaA',fld:'vTFSTP_DIAA',pic:'99/99/99 99:99'},{av:'AV48TFStp_MotA',fld:'vTFSTP_MOTA',pic:''},{av:'AV49TFStp_MotA_Sel',fld:'vTFSTP_MOTA_SEL',pic:''},{av:'AV84Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtStpHdr_Visible',ctrl:'STPHDR',prop:'Visible'},{av:'edtStpClicod_Visible',ctrl:'STPCLICOD',prop:'Visible'},{av:'edtStpCliNom_Visible',ctrl:'STPCLINOM',prop:'Visible'},{av:'edtStpBarser_Visible',ctrl:'STPBARSER',prop:'Visible'},{av:'edtStpBarserD_Visible',ctrl:'STPBARSERD',prop:'Visible'},{av:'edtStpColor_Visible',ctrl:'STPCOLOR',prop:'Visible'},{av:'edtStp_Dia_Visible',ctrl:'STP_DIA',prop:'Visible'},{av:'edtStp_Mot_Visible',ctrl:'STP_MOT',prop:'Visible'},{av:'edtStp_DiaA_Visible',ctrl:'STP_DIAA',prop:'Visible'},{av:'edtStp_MotA_Visible',ctrl:'STP_MOTA',prop:'Visible'},{av:'AV52GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV53GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e121C32',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV58Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV54DiaSuspension',fld:'vDIASUSPENSION',pic:''},{av:'AV59DiaSuspension_to',fld:'vDIASUSPENSION_TO',pic:''},{av:'AV56DiaActivacion',fld:'vDIAACTIVACION',pic:''},{av:'AV57DiaActivacion_to',fld:'vDIAACTIVACION_TO',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFStpHdr',fld:'vTFSTPHDR',pic:''},{av:'AV27TFStpHdr_Sel',fld:'vTFSTPHDR_SEL',pic:''},{av:'AV28TFStpClicod',fld:'vTFSTPCLICOD',pic:'ZZZZZ9'},{av:'AV29TFStpClicod_To',fld:'vTFSTPCLICOD_TO',pic:'ZZZZZ9'},{av:'AV30TFStpCliNom',fld:'vTFSTPCLINOM',pic:''},{av:'AV31TFStpCliNom_Sel',fld:'vTFSTPCLINOM_SEL',pic:''},{av:'AV32TFStpBarser',fld:'vTFSTPBARSER',pic:''},{av:'AV33TFStpBarser_Sel',fld:'vTFSTPBARSER_SEL',pic:''},{av:'AV34TFStpBarserDsc',fld:'vTFSTPBARSERDSC',pic:''},{av:'AV35TFStpBarserDsc_Sel',fld:'vTFSTPBARSERDSC_SEL',pic:''},{av:'AV36TFStpColor',fld:'vTFSTPCOLOR',pic:''},{av:'AV37TFStpColor_Sel',fld:'vTFSTPCOLOR_SEL',pic:''},{av:'AV38TFStp_Dia',fld:'vTFSTP_DIA',pic:'99/99/99 99:99'},{av:'AV42TFStp_Mot',fld:'vTFSTP_MOT',pic:''},{av:'AV43TFStp_Mot_Sel',fld:'vTFSTP_MOT_SEL',pic:''},{av:'AV44TFStp_DiaA',fld:'vTFSTP_DIAA',pic:'99/99/99 99:99'},{av:'AV48TFStp_MotA',fld:'vTFSTP_MOTA',pic:''},{av:'AV49TFStp_MotA_Sel',fld:'vTFSTP_MOTA_SEL',pic:''},{av:'AV84Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e131C32',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV58Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV54DiaSuspension',fld:'vDIASUSPENSION',pic:''},{av:'AV59DiaSuspension_to',fld:'vDIASUSPENSION_TO',pic:''},{av:'AV56DiaActivacion',fld:'vDIAACTIVACION',pic:''},{av:'AV57DiaActivacion_to',fld:'vDIAACTIVACION_TO',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFStpHdr',fld:'vTFSTPHDR',pic:''},{av:'AV27TFStpHdr_Sel',fld:'vTFSTPHDR_SEL',pic:''},{av:'AV28TFStpClicod',fld:'vTFSTPCLICOD',pic:'ZZZZZ9'},{av:'AV29TFStpClicod_To',fld:'vTFSTPCLICOD_TO',pic:'ZZZZZ9'},{av:'AV30TFStpCliNom',fld:'vTFSTPCLINOM',pic:''},{av:'AV31TFStpCliNom_Sel',fld:'vTFSTPCLINOM_SEL',pic:''},{av:'AV32TFStpBarser',fld:'vTFSTPBARSER',pic:''},{av:'AV33TFStpBarser_Sel',fld:'vTFSTPBARSER_SEL',pic:''},{av:'AV34TFStpBarserDsc',fld:'vTFSTPBARSERDSC',pic:''},{av:'AV35TFStpBarserDsc_Sel',fld:'vTFSTPBARSERDSC_SEL',pic:''},{av:'AV36TFStpColor',fld:'vTFSTPCOLOR',pic:''},{av:'AV37TFStpColor_Sel',fld:'vTFSTPCOLOR_SEL',pic:''},{av:'AV38TFStp_Dia',fld:'vTFSTP_DIA',pic:'99/99/99 99:99'},{av:'AV42TFStp_Mot',fld:'vTFSTP_MOT',pic:''},{av:'AV43TFStp_Mot_Sel',fld:'vTFSTP_MOT_SEL',pic:''},{av:'AV44TFStp_DiaA',fld:'vTFSTP_DIAA',pic:'99/99/99 99:99'},{av:'AV48TFStp_MotA',fld:'vTFSTP_MOTA',pic:''},{av:'AV49TFStp_MotA_Sel',fld:'vTFSTP_MOTA_SEL',pic:''},{av:'AV84Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e141C32',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV58Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV54DiaSuspension',fld:'vDIASUSPENSION',pic:''},{av:'AV59DiaSuspension_to',fld:'vDIASUSPENSION_TO',pic:''},{av:'AV56DiaActivacion',fld:'vDIAACTIVACION',pic:''},{av:'AV57DiaActivacion_to',fld:'vDIAACTIVACION_TO',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFStpHdr',fld:'vTFSTPHDR',pic:''},{av:'AV27TFStpHdr_Sel',fld:'vTFSTPHDR_SEL',pic:''},{av:'AV28TFStpClicod',fld:'vTFSTPCLICOD',pic:'ZZZZZ9'},{av:'AV29TFStpClicod_To',fld:'vTFSTPCLICOD_TO',pic:'ZZZZZ9'},{av:'AV30TFStpCliNom',fld:'vTFSTPCLINOM',pic:''},{av:'AV31TFStpCliNom_Sel',fld:'vTFSTPCLINOM_SEL',pic:''},{av:'AV32TFStpBarser',fld:'vTFSTPBARSER',pic:''},{av:'AV33TFStpBarser_Sel',fld:'vTFSTPBARSER_SEL',pic:''},{av:'AV34TFStpBarserDsc',fld:'vTFSTPBARSERDSC',pic:''},{av:'AV35TFStpBarserDsc_Sel',fld:'vTFSTPBARSERDSC_SEL',pic:''},{av:'AV36TFStpColor',fld:'vTFSTPCOLOR',pic:''},{av:'AV37TFStpColor_Sel',fld:'vTFSTPCOLOR_SEL',pic:''},{av:'AV38TFStp_Dia',fld:'vTFSTP_DIA',pic:'99/99/99 99:99'},{av:'AV42TFStp_Mot',fld:'vTFSTP_MOT',pic:''},{av:'AV43TFStp_Mot_Sel',fld:'vTFSTP_MOT_SEL',pic:''},{av:'AV44TFStp_DiaA',fld:'vTFSTP_DIAA',pic:'99/99/99 99:99'},{av:'AV48TFStp_MotA',fld:'vTFSTP_MOTA',pic:''},{av:'AV49TFStp_MotA_Sel',fld:'vTFSTP_MOTA_SEL',pic:''},{av:'AV84Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV48TFStp_MotA',fld:'vTFSTP_MOTA',pic:''},{av:'AV49TFStp_MotA_Sel',fld:'vTFSTP_MOTA_SEL',pic:''},{av:'AV44TFStp_DiaA',fld:'vTFSTP_DIAA',pic:'99/99/99 99:99'},{av:'AV42TFStp_Mot',fld:'vTFSTP_MOT',pic:''},{av:'AV43TFStp_Mot_Sel',fld:'vTFSTP_MOT_SEL',pic:''},{av:'AV38TFStp_Dia',fld:'vTFSTP_DIA',pic:'99/99/99 99:99'},{av:'AV36TFStpColor',fld:'vTFSTPCOLOR',pic:''},{av:'AV37TFStpColor_Sel',fld:'vTFSTPCOLOR_SEL',pic:''},{av:'AV34TFStpBarserDsc',fld:'vTFSTPBARSERDSC',pic:''},{av:'AV35TFStpBarserDsc_Sel',fld:'vTFSTPBARSERDSC_SEL',pic:''},{av:'AV32TFStpBarser',fld:'vTFSTPBARSER',pic:''},{av:'AV33TFStpBarser_Sel',fld:'vTFSTPBARSER_SEL',pic:''},{av:'AV30TFStpCliNom',fld:'vTFSTPCLINOM',pic:''},{av:'AV31TFStpCliNom_Sel',fld:'vTFSTPCLINOM_SEL',pic:''},{av:'AV28TFStpClicod',fld:'vTFSTPCLICOD',pic:'ZZZZZ9'},{av:'AV29TFStpClicod_To',fld:'vTFSTPCLICOD_TO',pic:'ZZZZZ9'},{av:'AV26TFStpHdr',fld:'vTFSTPHDR',pic:''},{av:'AV27TFStpHdr_Sel',fld:'vTFSTPHDR_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e201C32',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e151C32',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV58Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV54DiaSuspension',fld:'vDIASUSPENSION',pic:''},{av:'AV59DiaSuspension_to',fld:'vDIASUSPENSION_TO',pic:''},{av:'AV56DiaActivacion',fld:'vDIAACTIVACION',pic:''},{av:'AV57DiaActivacion_to',fld:'vDIAACTIVACION_TO',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFStpHdr',fld:'vTFSTPHDR',pic:''},{av:'AV27TFStpHdr_Sel',fld:'vTFSTPHDR_SEL',pic:''},{av:'AV28TFStpClicod',fld:'vTFSTPCLICOD',pic:'ZZZZZ9'},{av:'AV29TFStpClicod_To',fld:'vTFSTPCLICOD_TO',pic:'ZZZZZ9'},{av:'AV30TFStpCliNom',fld:'vTFSTPCLINOM',pic:''},{av:'AV31TFStpCliNom_Sel',fld:'vTFSTPCLINOM_SEL',pic:''},{av:'AV32TFStpBarser',fld:'vTFSTPBARSER',pic:''},{av:'AV33TFStpBarser_Sel',fld:'vTFSTPBARSER_SEL',pic:''},{av:'AV34TFStpBarserDsc',fld:'vTFSTPBARSERDSC',pic:''},{av:'AV35TFStpBarserDsc_Sel',fld:'vTFSTPBARSERDSC_SEL',pic:''},{av:'AV36TFStpColor',fld:'vTFSTPCOLOR',pic:''},{av:'AV37TFStpColor_Sel',fld:'vTFSTPCOLOR_SEL',pic:''},{av:'AV38TFStp_Dia',fld:'vTFSTP_DIA',pic:'99/99/99 99:99'},{av:'AV42TFStp_Mot',fld:'vTFSTP_MOT',pic:''},{av:'AV43TFStp_Mot_Sel',fld:'vTFSTP_MOT_SEL',pic:''},{av:'AV44TFStp_DiaA',fld:'vTFSTP_DIAA',pic:'99/99/99 99:99'},{av:'AV48TFStp_MotA',fld:'vTFSTP_MOTA',pic:''},{av:'AV49TFStp_MotA_Sel',fld:'vTFSTP_MOTA_SEL',pic:''},{av:'AV84Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtStpHdr_Visible',ctrl:'STPHDR',prop:'Visible'},{av:'edtStpClicod_Visible',ctrl:'STPCLICOD',prop:'Visible'},{av:'edtStpCliNom_Visible',ctrl:'STPCLINOM',prop:'Visible'},{av:'edtStpBarser_Visible',ctrl:'STPBARSER',prop:'Visible'},{av:'edtStpBarserD_Visible',ctrl:'STPBARSERD',prop:'Visible'},{av:'edtStpColor_Visible',ctrl:'STPCOLOR',prop:'Visible'},{av:'edtStp_Dia_Visible',ctrl:'STP_DIA',prop:'Visible'},{av:'edtStp_Mot_Visible',ctrl:'STP_MOT',prop:'Visible'},{av:'edtStp_DiaA_Visible',ctrl:'STP_DIAA',prop:'Visible'},{av:'edtStp_MotA_Visible',ctrl:'STP_MOTA',prop:'Visible'},{av:'AV52GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV53GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e111C32',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV58Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV54DiaSuspension',fld:'vDIASUSPENSION',pic:''},{av:'AV59DiaSuspension_to',fld:'vDIASUSPENSION_TO',pic:''},{av:'AV56DiaActivacion',fld:'vDIAACTIVACION',pic:''},{av:'AV57DiaActivacion_to',fld:'vDIAACTIVACION_TO',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFStpHdr',fld:'vTFSTPHDR',pic:''},{av:'AV27TFStpHdr_Sel',fld:'vTFSTPHDR_SEL',pic:''},{av:'AV28TFStpClicod',fld:'vTFSTPCLICOD',pic:'ZZZZZ9'},{av:'AV29TFStpClicod_To',fld:'vTFSTPCLICOD_TO',pic:'ZZZZZ9'},{av:'AV30TFStpCliNom',fld:'vTFSTPCLINOM',pic:''},{av:'AV31TFStpCliNom_Sel',fld:'vTFSTPCLINOM_SEL',pic:''},{av:'AV32TFStpBarser',fld:'vTFSTPBARSER',pic:''},{av:'AV33TFStpBarser_Sel',fld:'vTFSTPBARSER_SEL',pic:''},{av:'AV34TFStpBarserDsc',fld:'vTFSTPBARSERDSC',pic:''},{av:'AV35TFStpBarserDsc_Sel',fld:'vTFSTPBARSERDSC_SEL',pic:''},{av:'AV36TFStpColor',fld:'vTFSTPCOLOR',pic:''},{av:'AV37TFStpColor_Sel',fld:'vTFSTPCOLOR_SEL',pic:''},{av:'AV38TFStp_Dia',fld:'vTFSTP_DIA',pic:'99/99/99 99:99'},{av:'AV42TFStp_Mot',fld:'vTFSTP_MOT',pic:''},{av:'AV43TFStp_Mot_Sel',fld:'vTFSTP_MOT_SEL',pic:''},{av:'AV44TFStp_DiaA',fld:'vTFSTP_DIAA',pic:'99/99/99 99:99'},{av:'AV48TFStp_MotA',fld:'vTFSTP_MOTA',pic:''},{av:'AV49TFStp_MotA_Sel',fld:'vTFSTP_MOTA_SEL',pic:''},{av:'AV84Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV40DDO_Stp_DiaAuxDate',fld:'vDDO_STP_DIAAUXDATE',pic:''},{av:'AV46DDO_Stp_DiaAAuxDate',fld:'vDDO_STP_DIAAAUXDATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFStpHdr',fld:'vTFSTPHDR',pic:''},{av:'AV27TFStpHdr_Sel',fld:'vTFSTPHDR_SEL',pic:''},{av:'AV28TFStpClicod',fld:'vTFSTPCLICOD',pic:'ZZZZZ9'},{av:'AV29TFStpClicod_To',fld:'vTFSTPCLICOD_TO',pic:'ZZZZZ9'},{av:'AV30TFStpCliNom',fld:'vTFSTPCLINOM',pic:''},{av:'AV31TFStpCliNom_Sel',fld:'vTFSTPCLINOM_SEL',pic:''},{av:'AV32TFStpBarser',fld:'vTFSTPBARSER',pic:''},{av:'AV33TFStpBarser_Sel',fld:'vTFSTPBARSER_SEL',pic:''},{av:'AV34TFStpBarserDsc',fld:'vTFSTPBARSERDSC',pic:''},{av:'AV35TFStpBarserDsc_Sel',fld:'vTFSTPBARSERDSC_SEL',pic:''},{av:'AV36TFStpColor',fld:'vTFSTPCOLOR',pic:''},{av:'AV37TFStpColor_Sel',fld:'vTFSTPCOLOR_SEL',pic:''},{av:'AV38TFStp_Dia',fld:'vTFSTP_DIA',pic:'99/99/99 99:99'},{av:'AV42TFStp_Mot',fld:'vTFSTP_MOT',pic:''},{av:'AV43TFStp_Mot_Sel',fld:'vTFSTP_MOT_SEL',pic:''},{av:'AV44TFStp_DiaA',fld:'vTFSTP_DIAA',pic:'99/99/99 99:99'},{av:'AV48TFStp_MotA',fld:'vTFSTP_MOTA',pic:''},{av:'AV49TFStp_MotA_Sel',fld:'vTFSTP_MOTA_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV46DDO_Stp_DiaAAuxDate',fld:'vDDO_STP_DIAAAUXDATE',pic:''},{av:'AV40DDO_Stp_DiaAuxDate',fld:'vDDO_STP_DIAAUXDATE',pic:''},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtStpHdr_Visible',ctrl:'STPHDR',prop:'Visible'},{av:'edtStpClicod_Visible',ctrl:'STPCLICOD',prop:'Visible'},{av:'edtStpCliNom_Visible',ctrl:'STPCLINOM',prop:'Visible'},{av:'edtStpBarser_Visible',ctrl:'STPBARSER',prop:'Visible'},{av:'edtStpBarserD_Visible',ctrl:'STPBARSERD',prop:'Visible'},{av:'edtStpColor_Visible',ctrl:'STPCOLOR',prop:'Visible'},{av:'edtStp_Dia_Visible',ctrl:'STP_DIA',prop:'Visible'},{av:'edtStp_Mot_Visible',ctrl:'STP_MOT',prop:'Visible'},{av:'edtStp_DiaA_Visible',ctrl:'STP_DIAA',prop:'Visible'},{av:'edtStp_MotA_Visible',ctrl:'STP_MOTA',prop:'Visible'},{av:'AV52GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV53GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e161C32',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e171C32',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VALID_STP_DIA","{handler:'valid_Stp_dia',iparms:[]");
      setEventMetadata("VALID_STP_DIA",",oparms:[]}");
      setEventMetadata("VALID_STP_DIAA","{handler:'valid_Stp_diaa',iparms:[]");
      setEventMetadata("VALID_STP_DIAA",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Stp_mota',iparms:[]");
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
      wcpOAV58Emprcod = "" ;
      wcpOAV54DiaSuspension = GXutil.nullDate() ;
      wcpOAV59DiaSuspension_to = GXutil.nullDate() ;
      wcpOAV56DiaActivacion = GXutil.nullDate() ;
      wcpOAV57DiaActivacion_to = GXutil.nullDate() ;
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
      AV58Emprcod = "" ;
      AV54DiaSuspension = GXutil.nullDate() ;
      AV59DiaSuspension_to = GXutil.nullDate() ;
      AV56DiaActivacion = GXutil.nullDate() ;
      AV57DiaActivacion_to = GXutil.nullDate() ;
      AV20ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV15FilterFullText = "" ;
      AV26TFStpHdr = "" ;
      AV27TFStpHdr_Sel = "" ;
      AV30TFStpCliNom = "" ;
      AV31TFStpCliNom_Sel = "" ;
      AV32TFStpBarser = "" ;
      AV33TFStpBarser_Sel = "" ;
      AV34TFStpBarserDsc = "" ;
      AV35TFStpBarserDsc_Sel = "" ;
      AV36TFStpColor = "" ;
      AV37TFStpColor_Sel = "" ;
      AV38TFStp_Dia = GXutil.resetTime( GXutil.nullDate() );
      AV42TFStp_Mot = "" ;
      AV43TFStp_Mot_Sel = "" ;
      AV44TFStp_DiaA = GXutil.resetTime( GXutil.nullDate() );
      AV48TFStp_MotA = "" ;
      AV49TFStp_MotA_Sel = "" ;
      AV84Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV23ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV50DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
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
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV40DDO_Stp_DiaAuxDate = GXutil.nullDate() ;
      AV46DDO_Stp_DiaAAuxDate = GXutil.nullDate() ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A13723StpHdr = "" ;
      A13727StpCliNom = "" ;
      A13724StpBarser = "" ;
      A13725StpBarserD = "" ;
      A13728StpColor = "" ;
      A10751Stp_Dia = GXutil.resetTime( GXutil.nullDate() );
      A10752Stp_Mot = "" ;
      A10756Stp_DiaA = GXutil.resetTime( GXutil.nullDate() );
      A10757Stp_MotA = "" ;
      AV65Consultahdrssuspendidas_wcds_1_filterfulltext = "" ;
      AV66Consultahdrssuspendidas_wcds_2_tfstphdr = "" ;
      AV67Consultahdrssuspendidas_wcds_3_tfstphdr_sel = "" ;
      AV70Consultahdrssuspendidas_wcds_6_tfstpclinom = "" ;
      AV71Consultahdrssuspendidas_wcds_7_tfstpclinom_sel = "" ;
      AV72Consultahdrssuspendidas_wcds_8_tfstpbarser = "" ;
      AV73Consultahdrssuspendidas_wcds_9_tfstpbarser_sel = "" ;
      AV74Consultahdrssuspendidas_wcds_10_tfstpbarserdsc = "" ;
      AV75Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel = "" ;
      AV76Consultahdrssuspendidas_wcds_12_tfstpcolor = "" ;
      AV77Consultahdrssuspendidas_wcds_13_tfstpcolor_sel = "" ;
      AV78Consultahdrssuspendidas_wcds_14_tfstp_dia = GXutil.resetTime( GXutil.nullDate() );
      AV79Consultahdrssuspendidas_wcds_15_tfstp_mot = "" ;
      AV80Consultahdrssuspendidas_wcds_16_tfstp_mot_sel = "" ;
      AV81Consultahdrssuspendidas_wcds_17_tfstp_diaa = GXutil.resetTime( GXutil.nullDate() );
      AV82Consultahdrssuspendidas_wcds_18_tfstp_mota = "" ;
      AV83Consultahdrssuspendidas_wcds_19_tfstp_mota_sel = "" ;
      scmdbuf = "" ;
      lV65Consultahdrssuspendidas_wcds_1_filterfulltext = "" ;
      lV70Consultahdrssuspendidas_wcds_6_tfstpclinom = "" ;
      lV72Consultahdrssuspendidas_wcds_8_tfstpbarser = "" ;
      lV74Consultahdrssuspendidas_wcds_10_tfstpbarserdsc = "" ;
      lV76Consultahdrssuspendidas_wcds_12_tfstpcolor = "" ;
      lV66Consultahdrssuspendidas_wcds_2_tfstphdr = "" ;
      lV79Consultahdrssuspendidas_wcds_15_tfstp_mot = "" ;
      lV82Consultahdrssuspendidas_wcds_18_tfstp_mota = "" ;
      A10748Stp_p = "" ;
      A396EmprCod = "" ;
      H01C33_A129BarCod = new int[1] ;
      H01C33_A132BarCodReo = new byte[1] ;
      H01C33_A130BarCodPar = new String[] {""} ;
      H01C33_A10750Stp_Lin = new short[1] ;
      H01C33_A396EmprCod = new String[] {""} ;
      H01C33_A10755Stp_Est = new byte[1] ;
      H01C33_A10757Stp_MotA = new String[] {""} ;
      H01C33_A10756Stp_DiaA = new java.util.Date[] {GXutil.nullDate()} ;
      H01C33_A10752Stp_Mot = new String[] {""} ;
      H01C33_A10751Stp_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      H01C33_A13723StpHdr = new String[] {""} ;
      H01C33_A13728StpColor = new String[] {""} ;
      H01C33_n13728StpColor = new boolean[] {false} ;
      H01C33_A13725StpBarserD = new String[] {""} ;
      H01C33_n13725StpBarserD = new boolean[] {false} ;
      H01C33_A13724StpBarser = new String[] {""} ;
      H01C33_n13724StpBarser = new boolean[] {false} ;
      H01C33_A13727StpCliNom = new String[] {""} ;
      H01C33_n13727StpCliNom = new boolean[] {false} ;
      H01C33_A13726StpClicod = new int[1] ;
      H01C33_n13726StpClicod = new boolean[] {false} ;
      H01C33_A10746Stp_hdr = new int[1] ;
      H01C33_A10747Stp_r = new byte[1] ;
      H01C33_A10748Stp_p = new String[] {""} ;
      H01C35_A129BarCod = new int[1] ;
      H01C35_A132BarCodReo = new byte[1] ;
      H01C35_A130BarCodPar = new String[] {""} ;
      H01C35_A10750Stp_Lin = new short[1] ;
      H01C35_A396EmprCod = new String[] {""} ;
      H01C35_A10755Stp_Est = new byte[1] ;
      H01C35_A10757Stp_MotA = new String[] {""} ;
      H01C35_A10756Stp_DiaA = new java.util.Date[] {GXutil.nullDate()} ;
      H01C35_A10752Stp_Mot = new String[] {""} ;
      H01C35_A10751Stp_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      H01C35_A13723StpHdr = new String[] {""} ;
      H01C35_A13728StpColor = new String[] {""} ;
      H01C35_n13728StpColor = new boolean[] {false} ;
      H01C35_A13725StpBarserD = new String[] {""} ;
      H01C35_n13725StpBarserD = new boolean[] {false} ;
      H01C35_A13724StpBarser = new String[] {""} ;
      H01C35_n13724StpBarser = new boolean[] {false} ;
      H01C35_A13727StpCliNom = new String[] {""} ;
      H01C35_n13727StpCliNom = new boolean[] {false} ;
      H01C35_A13726StpClicod = new int[1] ;
      H01C35_n13726StpClicod = new boolean[] {false} ;
      H01C35_A10746Stp_hdr = new int[1] ;
      H01C35_A10747Stp_r = new byte[1] ;
      H01C35_A10748Stp_p = new String[] {""} ;
      AV62Station = "" ;
      AV63Emprnom = "" ;
      AV64Usurcod = "" ;
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
      GXv_SdtWWPGridState22 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV58Emprcod = "" ;
      sCtrlAV54DiaSuspension = "" ;
      sCtrlAV59DiaSuspension_to = "" ;
      sCtrlAV56DiaActivacion = "" ;
      sCtrlAV57DiaActivacion_to = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.consultahdrssuspendidas_wc__default(),
         new Object[] {
             new Object[] {
            H01C33_A129BarCod, H01C33_A132BarCodReo, H01C33_A130BarCodPar, H01C33_A10750Stp_Lin, H01C33_A396EmprCod, H01C33_A10755Stp_Est, H01C33_A10757Stp_MotA, H01C33_A10756Stp_DiaA, H01C33_A10752Stp_Mot, H01C33_A10751Stp_Dia,
            H01C33_A13723StpHdr, H01C33_A13728StpColor, H01C33_n13728StpColor, H01C33_A13725StpBarserD, H01C33_n13725StpBarserD, H01C33_A13724StpBarser, H01C33_n13724StpBarser, H01C33_A13727StpCliNom, H01C33_n13727StpCliNom, H01C33_A13726StpClicod,
            H01C33_n13726StpClicod, H01C33_A10746Stp_hdr, H01C33_A10747Stp_r, H01C33_A10748Stp_p
            }
            , new Object[] {
            H01C35_A129BarCod, H01C35_A132BarCodReo, H01C35_A130BarCodPar, H01C35_A10750Stp_Lin, H01C35_A396EmprCod, H01C35_A10755Stp_Est, H01C35_A10757Stp_MotA, H01C35_A10756Stp_DiaA, H01C35_A10752Stp_Mot, H01C35_A10751Stp_Dia,
            H01C35_A13723StpHdr, H01C35_A13728StpColor, H01C35_n13728StpColor, H01C35_A13725StpBarserD, H01C35_n13725StpBarserD, H01C35_A13724StpBarser, H01C35_n13724StpBarser, H01C35_A13727StpCliNom, H01C35_n13727StpCliNom, H01C35_A13726StpClicod,
            H01C35_n13726StpClicod, H01C35_A10746Stp_hdr, H01C35_A10747Stp_r, H01C35_A10748Stp_p
            }
         }
      );
      AV84Pgmname = "ConsultaHdrsSuspendidas_WC" ;
      /* GeneXus formulas. */
      AV84Pgmname = "ConsultaHdrsSuspendidas_WC" ;
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
   private byte A10747Stp_r ;
   private byte A10755Stp_Est ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV12OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_41 ;
   private int nGXsfl_41_idx=1 ;
   private int AV28TFStpClicod ;
   private int AV29TFStpClicod_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int A13726StpClicod ;
   private int subGrid_Islastpage ;
   private int AV68Consultahdrssuspendidas_wcds_4_tfstpclicod ;
   private int AV69Consultahdrssuspendidas_wcds_5_tfstpclicod_to ;
   private int A10746Stp_hdr ;
   private int edtStpHdr_Visible ;
   private int edtStpClicod_Visible ;
   private int edtStpCliNom_Visible ;
   private int edtStpBarser_Visible ;
   private int edtStpBarserD_Visible ;
   private int edtStpColor_Visible ;
   private int edtStp_Dia_Visible ;
   private int edtStp_Mot_Visible ;
   private int edtStp_DiaA_Visible ;
   private int edtStp_MotA_Visible ;
   private int AV51PageToGo ;
   private int AV85GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV52GridCurrentPage ;
   private long AV53GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String wcpOAV58Emprcod ;
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
   private String AV58Emprcod ;
   private String sGXsfl_41_idx="0001" ;
   private String AV26TFStpHdr ;
   private String AV27TFStpHdr_Sel ;
   private String AV30TFStpCliNom ;
   private String AV31TFStpCliNom_Sel ;
   private String AV32TFStpBarser ;
   private String AV33TFStpBarser_Sel ;
   private String AV34TFStpBarserDsc ;
   private String AV35TFStpBarserDsc_Sel ;
   private String AV36TFStpColor ;
   private String AV37TFStpColor_Sel ;
   private String AV84Pgmname ;
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
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_stp_diaauxdates_Internalname ;
   private String edtavDdo_stp_diaauxdate_Internalname ;
   private String edtavDdo_stp_diaauxdate_Jsonclick ;
   private String divDdo_stp_diaaauxdates_Internalname ;
   private String edtavDdo_stp_diaaauxdate_Internalname ;
   private String edtavDdo_stp_diaaauxdate_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavFilterfulltext_Internalname ;
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
   private String edtStp_Dia_Internalname ;
   private String edtStp_Mot_Internalname ;
   private String edtStp_DiaA_Internalname ;
   private String edtStp_MotA_Internalname ;
   private String AV66Consultahdrssuspendidas_wcds_2_tfstphdr ;
   private String AV67Consultahdrssuspendidas_wcds_3_tfstphdr_sel ;
   private String AV70Consultahdrssuspendidas_wcds_6_tfstpclinom ;
   private String AV71Consultahdrssuspendidas_wcds_7_tfstpclinom_sel ;
   private String AV72Consultahdrssuspendidas_wcds_8_tfstpbarser ;
   private String AV73Consultahdrssuspendidas_wcds_9_tfstpbarser_sel ;
   private String AV74Consultahdrssuspendidas_wcds_10_tfstpbarserdsc ;
   private String AV75Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel ;
   private String AV76Consultahdrssuspendidas_wcds_12_tfstpcolor ;
   private String AV77Consultahdrssuspendidas_wcds_13_tfstpcolor_sel ;
   private String scmdbuf ;
   private String lV70Consultahdrssuspendidas_wcds_6_tfstpclinom ;
   private String lV72Consultahdrssuspendidas_wcds_8_tfstpbarser ;
   private String lV74Consultahdrssuspendidas_wcds_10_tfstpbarserdsc ;
   private String lV76Consultahdrssuspendidas_wcds_12_tfstpcolor ;
   private String lV66Consultahdrssuspendidas_wcds_2_tfstphdr ;
   private String A10748Stp_p ;
   private String A396EmprCod ;
   private String AV62Station ;
   private String AV63Emprnom ;
   private String AV64Usurcod ;
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
   private String sCtrlAV58Emprcod ;
   private String sCtrlAV54DiaSuspension ;
   private String sCtrlAV59DiaSuspension_to ;
   private String sCtrlAV56DiaActivacion ;
   private String sCtrlAV57DiaActivacion_to ;
   private String sGXsfl_41_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtStpHdr_Jsonclick ;
   private String edtStpClicod_Jsonclick ;
   private String edtStpCliNom_Jsonclick ;
   private String edtStpBarser_Jsonclick ;
   private String edtStpBarserD_Jsonclick ;
   private String edtStpColor_Jsonclick ;
   private String edtStp_Dia_Jsonclick ;
   private String edtStp_Mot_Jsonclick ;
   private String edtStp_DiaA_Jsonclick ;
   private String edtStp_MotA_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV38TFStp_Dia ;
   private java.util.Date AV44TFStp_DiaA ;
   private java.util.Date A10751Stp_Dia ;
   private java.util.Date A10756Stp_DiaA ;
   private java.util.Date AV78Consultahdrssuspendidas_wcds_14_tfstp_dia ;
   private java.util.Date AV81Consultahdrssuspendidas_wcds_17_tfstp_diaa ;
   private java.util.Date wcpOAV54DiaSuspension ;
   private java.util.Date wcpOAV59DiaSuspension_to ;
   private java.util.Date wcpOAV56DiaActivacion ;
   private java.util.Date wcpOAV57DiaActivacion_to ;
   private java.util.Date AV54DiaSuspension ;
   private java.util.Date AV59DiaSuspension_to ;
   private java.util.Date AV56DiaActivacion ;
   private java.util.Date AV57DiaActivacion_to ;
   private java.util.Date AV40DDO_Stp_DiaAuxDate ;
   private java.util.Date AV46DDO_Stp_DiaAAuxDate ;
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
   private boolean n13726StpClicod ;
   private boolean n13727StpCliNom ;
   private boolean n13724StpBarser ;
   private boolean n13725StpBarserD ;
   private boolean n13728StpColor ;
   private boolean bGXsfl_41_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV18ColumnsSelectorXML ;
   private String AV24ManageFiltersXml ;
   private String AV19UserCustomValue ;
   private String AV15FilterFullText ;
   private String AV42TFStp_Mot ;
   private String AV43TFStp_Mot_Sel ;
   private String AV48TFStp_MotA ;
   private String AV49TFStp_MotA_Sel ;
   private String A10752Stp_Mot ;
   private String A10757Stp_MotA ;
   private String AV65Consultahdrssuspendidas_wcds_1_filterfulltext ;
   private String AV79Consultahdrssuspendidas_wcds_15_tfstp_mot ;
   private String AV80Consultahdrssuspendidas_wcds_16_tfstp_mot_sel ;
   private String AV82Consultahdrssuspendidas_wcds_18_tfstp_mota ;
   private String AV83Consultahdrssuspendidas_wcds_19_tfstp_mota_sel ;
   private String lV65Consultahdrssuspendidas_wcds_1_filterfulltext ;
   private String lV79Consultahdrssuspendidas_wcds_15_tfstp_mot ;
   private String lV82Consultahdrssuspendidas_wcds_18_tfstp_mota ;
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
   private int[] H01C33_A129BarCod ;
   private byte[] H01C33_A132BarCodReo ;
   private String[] H01C33_A130BarCodPar ;
   private short[] H01C33_A10750Stp_Lin ;
   private String[] H01C33_A396EmprCod ;
   private byte[] H01C33_A10755Stp_Est ;
   private String[] H01C33_A10757Stp_MotA ;
   private java.util.Date[] H01C33_A10756Stp_DiaA ;
   private String[] H01C33_A10752Stp_Mot ;
   private java.util.Date[] H01C33_A10751Stp_Dia ;
   private String[] H01C33_A13723StpHdr ;
   private String[] H01C33_A13728StpColor ;
   private boolean[] H01C33_n13728StpColor ;
   private String[] H01C33_A13725StpBarserD ;
   private boolean[] H01C33_n13725StpBarserD ;
   private String[] H01C33_A13724StpBarser ;
   private boolean[] H01C33_n13724StpBarser ;
   private String[] H01C33_A13727StpCliNom ;
   private boolean[] H01C33_n13727StpCliNom ;
   private int[] H01C33_A13726StpClicod ;
   private boolean[] H01C33_n13726StpClicod ;
   private int[] H01C33_A10746Stp_hdr ;
   private byte[] H01C33_A10747Stp_r ;
   private String[] H01C33_A10748Stp_p ;
   private int[] H01C35_A129BarCod ;
   private byte[] H01C35_A132BarCodReo ;
   private String[] H01C35_A130BarCodPar ;
   private short[] H01C35_A10750Stp_Lin ;
   private String[] H01C35_A396EmprCod ;
   private byte[] H01C35_A10755Stp_Est ;
   private String[] H01C35_A10757Stp_MotA ;
   private java.util.Date[] H01C35_A10756Stp_DiaA ;
   private String[] H01C35_A10752Stp_Mot ;
   private java.util.Date[] H01C35_A10751Stp_Dia ;
   private String[] H01C35_A13723StpHdr ;
   private String[] H01C35_A13728StpColor ;
   private boolean[] H01C35_n13728StpColor ;
   private String[] H01C35_A13725StpBarserD ;
   private boolean[] H01C35_n13725StpBarserD ;
   private String[] H01C35_A13724StpBarser ;
   private boolean[] H01C35_n13724StpBarser ;
   private String[] H01C35_A13727StpCliNom ;
   private boolean[] H01C35_n13727StpCliNom ;
   private int[] H01C35_A13726StpClicod ;
   private boolean[] H01C35_n13726StpClicod ;
   private int[] H01C35_A10746Stp_hdr ;
   private byte[] H01C35_A10747Stp_r ;
   private String[] H01C35_A10748Stp_p ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV23ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV21ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV50DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState22[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

final  class consultahdrssuspendidas_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01C33( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV67Consultahdrssuspendidas_wcds_3_tfstphdr_sel ,
                                          String AV66Consultahdrssuspendidas_wcds_2_tfstphdr ,
                                          java.util.Date AV78Consultahdrssuspendidas_wcds_14_tfstp_dia ,
                                          String AV80Consultahdrssuspendidas_wcds_16_tfstp_mot_sel ,
                                          String AV79Consultahdrssuspendidas_wcds_15_tfstp_mot ,
                                          java.util.Date AV81Consultahdrssuspendidas_wcds_17_tfstp_diaa ,
                                          String AV83Consultahdrssuspendidas_wcds_19_tfstp_mota_sel ,
                                          String AV82Consultahdrssuspendidas_wcds_18_tfstp_mota ,
                                          int A10746Stp_hdr ,
                                          byte A10747Stp_r ,
                                          String A10748Stp_p ,
                                          java.util.Date A10751Stp_Dia ,
                                          String A10752Stp_Mot ,
                                          java.util.Date A10756Stp_DiaA ,
                                          String A10757Stp_MotA ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV65Consultahdrssuspendidas_wcds_1_filterfulltext ,
                                          String A13723StpHdr ,
                                          int A13726StpClicod ,
                                          String A13727StpCliNom ,
                                          String A13724StpBarser ,
                                          String A13725StpBarserD ,
                                          String A13728StpColor ,
                                          int AV68Consultahdrssuspendidas_wcds_4_tfstpclicod ,
                                          int AV69Consultahdrssuspendidas_wcds_5_tfstpclicod_to ,
                                          String AV71Consultahdrssuspendidas_wcds_7_tfstpclinom_sel ,
                                          String AV70Consultahdrssuspendidas_wcds_6_tfstpclinom ,
                                          String AV73Consultahdrssuspendidas_wcds_9_tfstpbarser_sel ,
                                          String AV72Consultahdrssuspendidas_wcds_8_tfstpbarser ,
                                          String AV75Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel ,
                                          String AV74Consultahdrssuspendidas_wcds_10_tfstpbarserdsc ,
                                          String AV77Consultahdrssuspendidas_wcds_13_tfstpcolor_sel ,
                                          String AV76Consultahdrssuspendidas_wcds_12_tfstpcolor ,
                                          java.util.Date AV54DiaSuspension ,
                                          java.util.Date AV59DiaSuspension_to ,
                                          java.util.Date AV56DiaActivacion ,
                                          java.util.Date AV57DiaActivacion_to ,
                                          String AV58Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int23 = new byte[42];
      Object[] GXv_Object24 = new Object[2];
      scmdbuf = "SELECT T3.BarCod, T3.BarCodReo, T3.BarCodPar, T1.Stp_Lin, T1.EmprCod, T1.Stp_Est, T1.Stp_MotA, T1.Stp_DiaA, T1.Stp_Mot, T1.Stp_Dia, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990')," ;
      scmdbuf += " 2))) || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90'), 2) || T2.Stp_p AS StpHdr, COALESCE( T3.BarColNom, ' ') AS StpColor, COALESCE( T3.BarSerDsc, ' ') AS StpBarserD, COALESCE(" ;
      scmdbuf += " T3.BarSer, ' ') AS StpBarser, COALESCE( T4.StpCliNom, ' ') AS StpCliNom, COALESCE( T3.CliCod, 0) AS StpClicod, T1.Stp_hdr, T1.Stp_r, T1.Stp_p FROM (((TXPHDSTO1" ;
      scmdbuf += " T1 INNER JOIN TXPHDSTOP T2 ON T2.EmprCod = T1.EmprCod AND T2.Stp_hdr = T1.Stp_hdr AND T2.Stp_r = T1.Stp_r AND T2.Stp_p = T1.Stp_p) LEFT JOIN TXPBARCAD T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.BarCod = T1.Stp_hdr AND T3.BarCodReo = T1.Stp_r AND T3.BarCodPar = T1.Stp_p) LEFT JOIN (SELECT T6.CliNom AS StpCliNom, T5.EmprCod, T5.BarCod," ;
      scmdbuf += " T7.Stp_hdr, T5.BarCodReo, T7.Stp_r, T5.BarCodPar, T7.Stp_p FROM ((TXPBARCAD T5 LEFT JOIN TXPCLIENT T6 ON T6.EmprCod = T5.EmprCod AND T6.CliCod = T5.CliCod) INNER" ;
      scmdbuf += " JOIN TXPHDSTOP T7 ON T7.EmprCod = T5.EmprCod) WHERE T5.BarCod = T7.Stp_hdr and T5.BarCodReo = T7.Stp_r and T5.BarCodPar = T7.Stp_p ) T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.Stp_hdr = T1.Stp_hdr AND T4.Stp_r = T1.Stp_r AND T4.Stp_p = T1.Stp_p)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90'), 2) || T2.Stp_p) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.CliCod, 0),'999990'), 2) like '%' || ?) or ( UPPER(COALESCE( T4.StpCliNom, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSer, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSerDsc, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarColNom, ' ')) like '%' || UPPER(?)) or ( UPPER(T1.Stp_Mot) like '%' || UPPER(?)) or ( UPPER(T1.Stp_MotA) like '%' || UPPER(?))))");
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
      if ( (GXutil.strcmp("", AV67Consultahdrssuspendidas_wcds_3_tfstphdr_sel)==0) && ( ! (GXutil.strcmp("", AV66Consultahdrssuspendidas_wcds_2_tfstphdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Consultahdrssuspendidas_wcds_3_tfstphdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p = ?)");
      }
      else
      {
         GXv_int23[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV78Consultahdrssuspendidas_wcds_14_tfstp_dia) )
      {
         addWhere(sWhereString, "(T1.Stp_Dia >= ?)");
      }
      else
      {
         GXv_int23[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Consultahdrssuspendidas_wcds_16_tfstp_mot_sel)==0) && ( ! (GXutil.strcmp("", AV79Consultahdrssuspendidas_wcds_15_tfstp_mot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Stp_Mot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Consultahdrssuspendidas_wcds_16_tfstp_mot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Stp_Mot = ?)");
      }
      else
      {
         GXv_int23[38] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV81Consultahdrssuspendidas_wcds_17_tfstp_diaa) )
      {
         addWhere(sWhereString, "(T1.Stp_DiaA >= ?)");
      }
      else
      {
         GXv_int23[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Consultahdrssuspendidas_wcds_19_tfstp_mota_sel)==0) && ( ! (GXutil.strcmp("", AV82Consultahdrssuspendidas_wcds_18_tfstp_mota)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Stp_MotA) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Consultahdrssuspendidas_wcds_19_tfstp_mota_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Stp_MotA = ?)");
      }
      else
      {
         GXv_int23[41] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Stp_Dia" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Stp_Dia DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Stp_Mot" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Stp_Mot DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Stp_DiaA" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Stp_DiaA DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Stp_MotA" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Stp_MotA DESC" ;
      }
      GXv_Object24[0] = scmdbuf ;
      GXv_Object24[1] = GXv_int23 ;
      return GXv_Object24 ;
   }

   protected Object[] conditional_H01C35( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV67Consultahdrssuspendidas_wcds_3_tfstphdr_sel ,
                                          String AV66Consultahdrssuspendidas_wcds_2_tfstphdr ,
                                          java.util.Date AV78Consultahdrssuspendidas_wcds_14_tfstp_dia ,
                                          String AV80Consultahdrssuspendidas_wcds_16_tfstp_mot_sel ,
                                          String AV79Consultahdrssuspendidas_wcds_15_tfstp_mot ,
                                          java.util.Date AV81Consultahdrssuspendidas_wcds_17_tfstp_diaa ,
                                          String AV83Consultahdrssuspendidas_wcds_19_tfstp_mota_sel ,
                                          String AV82Consultahdrssuspendidas_wcds_18_tfstp_mota ,
                                          int A10746Stp_hdr ,
                                          byte A10747Stp_r ,
                                          String A10748Stp_p ,
                                          java.util.Date A10751Stp_Dia ,
                                          String A10752Stp_Mot ,
                                          java.util.Date A10756Stp_DiaA ,
                                          String A10757Stp_MotA ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV65Consultahdrssuspendidas_wcds_1_filterfulltext ,
                                          String A13723StpHdr ,
                                          int A13726StpClicod ,
                                          String A13727StpCliNom ,
                                          String A13724StpBarser ,
                                          String A13725StpBarserD ,
                                          String A13728StpColor ,
                                          int AV68Consultahdrssuspendidas_wcds_4_tfstpclicod ,
                                          int AV69Consultahdrssuspendidas_wcds_5_tfstpclicod_to ,
                                          String AV71Consultahdrssuspendidas_wcds_7_tfstpclinom_sel ,
                                          String AV70Consultahdrssuspendidas_wcds_6_tfstpclinom ,
                                          String AV73Consultahdrssuspendidas_wcds_9_tfstpbarser_sel ,
                                          String AV72Consultahdrssuspendidas_wcds_8_tfstpbarser ,
                                          String AV75Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel ,
                                          String AV74Consultahdrssuspendidas_wcds_10_tfstpbarserdsc ,
                                          String AV77Consultahdrssuspendidas_wcds_13_tfstpcolor_sel ,
                                          String AV76Consultahdrssuspendidas_wcds_12_tfstpcolor ,
                                          java.util.Date AV54DiaSuspension ,
                                          java.util.Date AV59DiaSuspension_to ,
                                          java.util.Date AV56DiaActivacion ,
                                          java.util.Date AV57DiaActivacion_to ,
                                          String AV58Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int25 = new byte[42];
      Object[] GXv_Object26 = new Object[2];
      scmdbuf = "SELECT T3.BarCod, T3.BarCodReo, T3.BarCodPar, T1.Stp_Lin, T1.EmprCod, T1.Stp_Est, T1.Stp_MotA, T1.Stp_DiaA, T1.Stp_Mot, T1.Stp_Dia, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990')," ;
      scmdbuf += " 2))) || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90'), 2) || T2.Stp_p AS StpHdr, COALESCE( T3.BarColNom, ' ') AS StpColor, COALESCE( T3.BarSerDsc, ' ') AS StpBarserD, COALESCE(" ;
      scmdbuf += " T3.BarSer, ' ') AS StpBarser, COALESCE( T4.StpCliNom, ' ') AS StpCliNom, COALESCE( T3.CliCod, 0) AS StpClicod, T1.Stp_hdr, T1.Stp_r, T1.Stp_p FROM (((TXPHDSTO1" ;
      scmdbuf += " T1 INNER JOIN TXPHDSTOP T2 ON T2.EmprCod = T1.EmprCod AND T2.Stp_hdr = T1.Stp_hdr AND T2.Stp_r = T1.Stp_r AND T2.Stp_p = T1.Stp_p) LEFT JOIN TXPBARCAD T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.BarCod = T1.Stp_hdr AND T3.BarCodReo = T1.Stp_r AND T3.BarCodPar = T1.Stp_p) LEFT JOIN (SELECT T6.CliNom AS StpCliNom, T5.EmprCod, T5.BarCod," ;
      scmdbuf += " T7.Stp_hdr, T5.BarCodReo, T7.Stp_r, T5.BarCodPar, T7.Stp_p FROM ((TXPBARCAD T5 LEFT JOIN TXPCLIENT T6 ON T6.EmprCod = T5.EmprCod AND T6.CliCod = T5.CliCod) INNER" ;
      scmdbuf += " JOIN TXPHDSTOP T7 ON T7.EmprCod = T5.EmprCod) WHERE T5.BarCod = T7.Stp_hdr and T5.BarCodReo = T7.Stp_r and T5.BarCodPar = T7.Stp_p ) T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.Stp_hdr = T1.Stp_hdr AND T4.Stp_r = T1.Stp_r AND T4.Stp_p = T1.Stp_p)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90'), 2) || T2.Stp_p) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.CliCod, 0),'999990'), 2) like '%' || ?) or ( UPPER(COALESCE( T4.StpCliNom, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSer, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSerDsc, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarColNom, ' ')) like '%' || UPPER(?)) or ( UPPER(T1.Stp_Mot) like '%' || UPPER(?)) or ( UPPER(T1.Stp_MotA) like '%' || UPPER(?))))");
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
      if ( (GXutil.strcmp("", AV67Consultahdrssuspendidas_wcds_3_tfstphdr_sel)==0) && ( ! (GXutil.strcmp("", AV66Consultahdrssuspendidas_wcds_2_tfstphdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Consultahdrssuspendidas_wcds_3_tfstphdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p = ?)");
      }
      else
      {
         GXv_int25[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV78Consultahdrssuspendidas_wcds_14_tfstp_dia) )
      {
         addWhere(sWhereString, "(T1.Stp_Dia >= ?)");
      }
      else
      {
         GXv_int25[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Consultahdrssuspendidas_wcds_16_tfstp_mot_sel)==0) && ( ! (GXutil.strcmp("", AV79Consultahdrssuspendidas_wcds_15_tfstp_mot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Stp_Mot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Consultahdrssuspendidas_wcds_16_tfstp_mot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Stp_Mot = ?)");
      }
      else
      {
         GXv_int25[38] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV81Consultahdrssuspendidas_wcds_17_tfstp_diaa) )
      {
         addWhere(sWhereString, "(T1.Stp_DiaA >= ?)");
      }
      else
      {
         GXv_int25[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Consultahdrssuspendidas_wcds_19_tfstp_mota_sel)==0) && ( ! (GXutil.strcmp("", AV82Consultahdrssuspendidas_wcds_18_tfstp_mota)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Stp_MotA) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Consultahdrssuspendidas_wcds_19_tfstp_mota_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Stp_MotA = ?)");
      }
      else
      {
         GXv_int25[41] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Stp_Dia" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Stp_Dia DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Stp_Mot" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Stp_Mot DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Stp_DiaA" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Stp_DiaA DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Stp_MotA" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Stp_MotA DESC" ;
      }
      GXv_Object26[0] = scmdbuf ;
      GXv_Object26[1] = GXv_int25 ;
      return GXv_Object26 ;
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
                  return conditional_H01C33(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , ((Boolean) dynConstraints[16]).booleanValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (java.util.Date)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] );
            case 1 :
                  return conditional_H01C35(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , ((Boolean) dynConstraints[16]).booleanValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (java.util.Date)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01C33", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01C35", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((String[]) buf[8])[0] = rslt.getVarchar(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 11);
               ((String[]) buf[11])[0] = rslt.getString(12, 13);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(13, 26);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(14, 16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(15, 30);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(16);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(17);
               ((byte[]) buf[22])[0] = rslt.getByte(18);
               ((String[]) buf[23])[0] = rslt.getString(19, 1);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((String[]) buf[8])[0] = rslt.getVarchar(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 11);
               ((String[]) buf[11])[0] = rslt.getString(12, 13);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(13, 26);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(14, 16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(15, 30);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(16);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(17);
               ((byte[]) buf[22])[0] = rslt.getByte(18);
               ((String[]) buf[23])[0] = rslt.getString(19, 1);
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
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
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
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
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
                  stmt.setString(sIdx, (String)parms[69], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 26);
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
                  stmt.setString(sIdx, (String)parms[73], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 11);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 11);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[78], false);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 300);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 300);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[81], false);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 300);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 300);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
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
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
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
                  stmt.setString(sIdx, (String)parms[69], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 26);
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
                  stmt.setString(sIdx, (String)parms[73], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 11);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 11);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[78], false);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 300);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 300);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[81], false);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 300);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 300);
               }
               return;
      }
   }

}

