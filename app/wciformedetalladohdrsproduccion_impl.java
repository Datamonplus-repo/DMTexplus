package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wciformedetalladohdrsproduccion_impl extends GXWebComponent
{
   public wciformedetalladohdrsproduccion_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wciformedetalladohdrsproduccion_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wciformedetalladohdrsproduccion_impl.class ));
   }

   public wciformedetalladohdrsproduccion_impl( int remoteHandle ,
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
               AV5Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
               AV9MaqCodInicial = httpContext.GetPar( "MaqCodInicial") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9MaqCodInicial", AV9MaqCodInicial);
               AV8MaqCodFinal = httpContext.GetPar( "MaqCodFinal") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8MaqCodFinal", AV8MaqCodFinal);
               AV7Hisprodti = localUtil.parseDTimeParm( httpContext.GetPar( "Hisprodti")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Hisprodti", localUtil.ttoc( AV7Hisprodti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV6HisProdtf = localUtil.parseDTimeParm( httpContext.GetPar( "HisProdtf")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6HisProdtf", localUtil.ttoc( AV6HisProdtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV105HisProReo = (byte)(GXutil.lval( httpContext.GetPar( "HisProReo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV105HisProReo", GXutil.str( AV105HisProReo, 1, 0));
               AV106ParCod = (short)(GXutil.lval( httpContext.GetPar( "ParCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV106ParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV106ParCod), 4, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV5Emprcod,AV9MaqCodInicial,AV8MaqCodFinal,AV7Hisprodti,AV6HisProdtf,Byte.valueOf(AV105HisProReo),Short.valueOf(AV106ParCod)});
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
      AV5Emprcod = httpContext.GetPar( "Emprcod") ;
      AV9MaqCodInicial = httpContext.GetPar( "MaqCodInicial") ;
      AV8MaqCodFinal = httpContext.GetPar( "MaqCodFinal") ;
      AV7Hisprodti = localUtil.parseDTimeParm( httpContext.GetPar( "Hisprodti")) ;
      AV6HisProdtf = localUtil.parseDTimeParm( httpContext.GetPar( "HisProdtf")) ;
      AV105HisProReo = (byte)(GXutil.lval( httpContext.GetPar( "HisProReo"))) ;
      AV106ParCod = (short)(GXutil.lval( httpContext.GetPar( "ParCod"))) ;
      AV29ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV24ColumnsSelector);
      AV103FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV31TFMaqCod = httpContext.GetPar( "TFMaqCod") ;
      AV32TFMaqCod_Sel = httpContext.GetPar( "TFMaqCod_Sel") ;
      AV59TFMaqDsc = httpContext.GetPar( "TFMaqDsc") ;
      AV60TFMaqDsc_Sel = httpContext.GetPar( "TFMaqDsc_Sel") ;
      AV34TFBarNHdr = httpContext.GetPar( "TFBarNHdr") ;
      AV35TFBarNHdr_Sel = httpContext.GetPar( "TFBarNHdr_Sel") ;
      AV101TFHisProLot = httpContext.GetPar( "TFHisProLot") ;
      AV102TFHisProLot_Sel = httpContext.GetPar( "TFHisProLot_Sel") ;
      AV62TFCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod"))) ;
      AV63TFCliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod_To"))) ;
      AV65TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV66TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      AV121TFPedidoCliente = httpContext.GetPar( "TFPedidoCliente") ;
      AV122TFPedidoCliente_Sel = httpContext.GetPar( "TFPedidoCliente_Sel") ;
      AV68TFBarFecGen = localUtil.parseDateParm( httpContext.GetPar( "TFBarFecGen")) ;
      AV73TFBarSer = httpContext.GetPar( "TFBarSer") ;
      AV74TFBarSer_Sel = httpContext.GetPar( "TFBarSer_Sel") ;
      AV76TFBarSerDsc = httpContext.GetPar( "TFBarSerDsc") ;
      AV77TFBarSerDsc_Sel = httpContext.GetPar( "TFBarSerDsc_Sel") ;
      AV117TFBarTipArtDsc = httpContext.GetPar( "TFBarTipArtDsc") ;
      AV118TFBarTipArtDsc_Sel = httpContext.GetPar( "TFBarTipArtDsc_Sel") ;
      AV119TFBarTipColDsc = httpContext.GetPar( "TFBarTipColDsc") ;
      AV120TFBarTipColDsc_Sel = httpContext.GetPar( "TFBarTipColDsc_Sel") ;
      AV37TFFase = httpContext.GetPar( "TFFase") ;
      AV38TFFase_Sel = httpContext.GetPar( "TFFase_Sel") ;
      AV125TFFaseDescripcion = httpContext.GetPar( "TFFaseDescripcion") ;
      AV126TFFaseDescripcion_Sel = httpContext.GetPar( "TFFaseDescripcion_Sel") ;
      AV40TFHisProDTI = localUtil.parseDTimeParm( httpContext.GetPar( "TFHisProDTI")) ;
      AV45TFHisProDTF = localUtil.parseDTimeParm( httpContext.GetPar( "TFHisProDTF")) ;
      AV79TFHisProKgr = CommonUtil.decimalVal( httpContext.GetPar( "TFHisProKgr"), ".") ;
      AV80TFHisProKgr_To = CommonUtil.decimalVal( httpContext.GetPar( "TFHisProKgr_To"), ".") ;
      AV82TFHisProMtr = CommonUtil.decimalVal( httpContext.GetPar( "TFHisProMtr"), ".") ;
      AV83TFHisProMtr_To = CommonUtil.decimalVal( httpContext.GetPar( "TFHisProMtr_To"), ".") ;
      AV92TFParCod = (short)(GXutil.lval( httpContext.GetPar( "TFParCod"))) ;
      AV93TFParCod_To = (short)(GXutil.lval( httpContext.GetPar( "TFParCod_To"))) ;
      AV98TFParCodNom = httpContext.GetPar( "TFParCodNom") ;
      AV99TFParCodNom_Sel = httpContext.GetPar( "TFParCodNom_Sel") ;
      AV95TFHisProTur = (byte)(GXutil.lval( httpContext.GetPar( "TFHisProTur"))) ;
      AV96TFHisProTur_To = (byte)(GXutil.lval( httpContext.GetPar( "TFHisProTur_To"))) ;
      AV107TFHisProReo = (byte)(GXutil.lval( httpContext.GetPar( "TFHisProReo"))) ;
      AV108TFHisProReo_To = (byte)(GXutil.lval( httpContext.GetPar( "TFHisProReo_To"))) ;
      AV175Pgmname = httpContext.GetPar( "Pgmname") ;
      AV17OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV18OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV84TotHisProKgr = CommonUtil.decimalVal( httpContext.GetPar( "TotHisProKgr"), ".") ;
      AV86TotHisProMtr = CommonUtil.decimalVal( httpContext.GetPar( "TotHisProMtr"), ".") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV9MaqCodInicial, AV8MaqCodFinal, AV7Hisprodti, AV6HisProdtf, AV105HisProReo, AV106ParCod, AV29ManageFiltersExecutionStep, AV24ColumnsSelector, AV103FilterFullText, AV31TFMaqCod, AV32TFMaqCod_Sel, AV59TFMaqDsc, AV60TFMaqDsc_Sel, AV34TFBarNHdr, AV35TFBarNHdr_Sel, AV101TFHisProLot, AV102TFHisProLot_Sel, AV62TFCliCod, AV63TFCliCod_To, AV65TFCliNom, AV66TFCliNom_Sel, AV121TFPedidoCliente, AV122TFPedidoCliente_Sel, AV68TFBarFecGen, AV73TFBarSer, AV74TFBarSer_Sel, AV76TFBarSerDsc, AV77TFBarSerDsc_Sel, AV117TFBarTipArtDsc, AV118TFBarTipArtDsc_Sel, AV119TFBarTipColDsc, AV120TFBarTipColDsc_Sel, AV37TFFase, AV38TFFase_Sel, AV125TFFaseDescripcion, AV126TFFaseDescripcion_Sel, AV40TFHisProDTI, AV45TFHisProDTF, AV79TFHisProKgr, AV80TFHisProKgr_To, AV82TFHisProMtr, AV83TFHisProMtr_To, AV92TFParCod, AV93TFParCod_To, AV98TFParCodNom, AV99TFParCodNom_Sel, AV95TFHisProTur, AV96TFHisProTur_To, AV107TFHisProReo, AV108TFHisProReo_To, AV175Pgmname, AV17OrderedBy, AV18OrderedDsc, AV84TotHisProKgr, AV86TotHisProMtr, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         paTI2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( " Table LHIPRO", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wciformedetalladohdrsproduccion", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV9MaqCodInicial)),GXutil.URLEncode(GXutil.rtrim(AV8MaqCodFinal)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV7Hisprodti)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV6HisProdtf)),GXutil.URLEncode(GXutil.ltrimstr(AV105HisProReo,1,0)),GXutil.URLEncode(GXutil.ltrimstr(AV106ParCod,4,0))}, new String[] {"Emprcod","MaqCodInicial","MaqCodFinal","Hisprodti","HisProdtf","HisProReo","ParCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV175Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTHISPROKGR", getSecureSignedToken( sPrefix, localUtil.format( AV84TotHisProKgr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTHISPROMTR", getSecureSignedToken( sPrefix, localUtil.format( AV86TotHisProMtr, "ZZZZZ9.99")));
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
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV27ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV27ManageFiltersData);
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
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV24ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV24ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV5Emprcod", GXutil.rtrim( wcpOAV5Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV9MaqCodInicial", GXutil.rtrim( wcpOAV9MaqCodInicial));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8MaqCodFinal", GXutil.rtrim( wcpOAV8MaqCodFinal));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7Hisprodti", localUtil.ttoc( wcpOAV7Hisprodti, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV6HisProdtf", localUtil.ttoc( wcpOAV6HisProdtf, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV105HisProReo", GXutil.ltrim( localUtil.ntoc( wcpOAV105HisProReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV106ParCod", GXutil.ltrim( localUtil.ntoc( wcpOAV106ParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV29ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMAQCOD", GXutil.rtrim( AV31TFMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMAQCOD_SEL", GXutil.rtrim( AV32TFMaqCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMAQDSC", GXutil.rtrim( AV59TFMaqDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMAQDSC_SEL", GXutil.rtrim( AV60TFMaqDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNHDR", GXutil.rtrim( AV34TFBarNHdr));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNHDR_SEL", GXutil.rtrim( AV35TFBarNHdr_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROLOT", GXutil.rtrim( AV101TFHisProLot));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROLOT_SEL", GXutil.rtrim( AV102TFHisProLot_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICOD", GXutil.ltrim( localUtil.ntoc( AV62TFCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV63TFCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM", GXutil.rtrim( AV65TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM_SEL", GXutil.rtrim( AV66TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPEDIDOCLIENTE", GXutil.rtrim( AV121TFPedidoCliente));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPEDIDOCLIENTE_SEL", GXutil.rtrim( AV122TFPedidoCliente_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFECGEN", localUtil.dtoc( AV68TFBarFecGen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSER", GXutil.rtrim( AV73TFBarSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSER_SEL", GXutil.rtrim( AV74TFBarSer_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSERDSC", GXutil.rtrim( AV76TFBarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSERDSC_SEL", GXutil.rtrim( AV77TFBarSerDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARTIPARTDSC", GXutil.rtrim( AV117TFBarTipArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARTIPARTDSC_SEL", GXutil.rtrim( AV118TFBarTipArtDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARTIPCOLDSC", GXutil.rtrim( AV119TFBarTipColDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARTIPCOLDSC_SEL", GXutil.rtrim( AV120TFBarTipColDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASE", GXutil.rtrim( AV37TFFase));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASE_SEL", GXutil.rtrim( AV38TFFase_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASEDESCRIPCION", GXutil.rtrim( AV125TFFaseDescripcion));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASEDESCRIPCION_SEL", GXutil.rtrim( AV126TFFaseDescripcion_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPRODTI", localUtil.ttoc( AV40TFHisProDTI, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPRODTF", localUtil.ttoc( AV45TFHisProDTF, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROKGR", GXutil.ltrim( localUtil.ntoc( AV79TFHisProKgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROKGR_TO", GXutil.ltrim( localUtil.ntoc( AV80TFHisProKgr_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROMTR", GXutil.ltrim( localUtil.ntoc( AV82TFHisProMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROMTR_TO", GXutil.ltrim( localUtil.ntoc( AV83TFHisProMtr_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPARCOD", GXutil.ltrim( localUtil.ntoc( AV92TFParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPARCOD_TO", GXutil.ltrim( localUtil.ntoc( AV93TFParCod_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPARCODNOM", GXutil.rtrim( AV98TFParCodNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPARCODNOM_SEL", GXutil.rtrim( AV99TFParCodNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROTUR", GXutil.ltrim( localUtil.ntoc( AV95TFHisProTur, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROTUR_TO", GXutil.ltrim( localUtil.ntoc( AV96TFHisProTur_To, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROREO", GXutil.ltrim( localUtil.ntoc( AV107TFHisProReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROREO_TO", GXutil.ltrim( localUtil.ntoc( AV108TFHisProReo_To, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV175Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV175Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV17OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV18OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV5Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCODINICIAL", GXutil.rtrim( AV9MaqCodInicial));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCODFINAL", GXutil.rtrim( AV8MaqCodFinal));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISPRODTI", localUtil.ttoc( AV7Hisprodti, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISPRODTF", localUtil.ttoc( AV6HisProdtf, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISPROREO", GXutil.ltrim( localUtil.ntoc( AV105HisProReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPARCOD", GXutil.ltrim( localUtil.ntoc( AV106ParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTHISPROKGR", GXutil.ltrim( localUtil.ntoc( AV84TotHisProKgr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTHISPROKGR", getSecureSignedToken( sPrefix, localUtil.format( AV84TotHisProKgr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTHISPROMTR", GXutil.ltrim( localUtil.ntoc( AV86TotHisProMtr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTHISPROMTR", getSecureSignedToken( sPrefix, localUtil.format( AV86TotHisProMtr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCODPAR", GXutil.rtrim( A130BarCodPar));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV15GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV15GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARENCCLI", GXutil.rtrim( A4812BarEncCli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARDISNUM", GXutil.rtrim( A143BarDisNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARTIPCOL", GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRUOPECOD", GXutil.ltrim( localUtil.ntoc( A503GruOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HISPROTR2", GXutil.ltrim( localUtil.ntoc( A5605HisProTr2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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

   public void renderHtmlCloseFormTI2( )
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
      return "WCIformedetalladoHdrsProduccion" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Table LHIPRO", "") ;
   }

   public void wbTI0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.wciformedetalladohdrsproduccion");
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCIformedetalladoHdrsProduccion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCIformedetalladoHdrsProduccion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCIformedetalladoHdrsProduccion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_23_TI2( true) ;
      }
      else
      {
         wb_table1_23_TI2( false) ;
      }
      return  ;
   }

   public void wb_table1_23_TI2e( boolean wbgen )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row Invisible", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table2_69_TI2( true) ;
      }
      else
      {
         wb_table2_69_TI2( false) ;
      }
      return  ;
   }

   public void wb_table2_69_TI2e( boolean wbgen )
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
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV24ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_barfecgenauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 110,'" + sPrefix + "',false,'" + sGXsfl_41_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_barfecgenauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_barfecgenauxdate_Internalname, localUtil.format(AV70DDO_BarFecGenAuxDate, "99/99/99"), localUtil.format( AV70DDO_BarFecGenAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,110);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_barfecgenauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WCIformedetalladoHdrsProduccion.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_barfecgenauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WCIformedetalladoHdrsProduccion.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_hisprodtiauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 112,'" + sPrefix + "',false,'" + sGXsfl_41_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_hisprodtiauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_hisprodtiauxdate_Internalname, localUtil.format(AV42DDO_HisProDTIAuxDate, "99/99/99"), localUtil.format( AV42DDO_HisProDTIAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,112);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_hisprodtiauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WCIformedetalladoHdrsProduccion.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_hisprodtiauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WCIformedetalladoHdrsProduccion.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_hisprodtfauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'" + sPrefix + "',false,'" + sGXsfl_41_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_hisprodtfauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_hisprodtfauxdate_Internalname, localUtil.format(AV47DDO_HisProDTFAuxDate, "99/99/99"), localUtil.format( AV47DDO_HisProDTFAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,114);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_hisprodtfauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WCIformedetalladoHdrsProduccion.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_hisprodtfauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WCIformedetalladoHdrsProduccion.htm");
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

   public void startTI2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( " Table LHIPRO", ""), (short)(0)) ;
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
            strupTI0( ) ;
         }
      }
   }

   public void wsTI2( )
   {
      startTI2( ) ;
      evtTI2( ) ;
   }

   public void evtTI2( )
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
                              strupTI0( ) ;
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
                              strupTI0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e11TI2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupTI0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e12TI2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupTI0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e13TI2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupTI0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e14TI2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupTI0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e15TI2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupTI0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e16TI2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupTI0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e17TI2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupTI0( ) ;
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
                              strupTI0( ) ;
                           }
                           nGXsfl_41_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_412( ) ;
                           A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
                           A606MaqDsc = httpContext.cgiGet( edtMaqDsc_Internalname) ;
                           n606MaqDsc = false ;
                           A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
                           A3610HisProLot = httpContext.cgiGet( edtHisProLot_Internalname) ;
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n252CliCod = false ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A13878PedidoClie = httpContext.cgiGet( edtPedidoClie_Internalname) ;
                           A159BarFecGen = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtBarFecGen_Internalname), 0)) ;
                           A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
                           A1652BarSerDsc = httpContext.cgiGet( edtBarSerDsc_Internalname) ;
                           A13711BarTipArtD = httpContext.cgiGet( edtBarTipArtD_Internalname) ;
                           n13711BarTipArtD = false ;
                           A13868BarTipColD = httpContext.cgiGet( edtBarTipColD_Internalname) ;
                           A461Fase = httpContext.cgiGet( edtFase_Internalname) ;
                           A13893FaseDescri = httpContext.cgiGet( edtFaseDescri_Internalname) ;
                           A4440HisProDTI = localUtil.ctot( httpContext.cgiGet( edtHisProDTI_Internalname), 0) ;
                           n4440HisProDTI = false ;
                           A4441HisProDTF = localUtil.ctot( httpContext.cgiGet( edtHisProDTF_Internalname), 0) ;
                           n4441HisProDTF = false ;
                           A1525HisProKgr = localUtil.ctond( httpContext.cgiGet( edtHisProKgr_Internalname)) ;
                           A1526HisProMtr = localUtil.ctond( httpContext.cgiGet( edtHisProMtr_Internalname)) ;
                           A656ParCod = (short)(localUtil.ctol( httpContext.cgiGet( edtParCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n656ParCod = false ;
                           A867ParCodNom = httpContext.cgiGet( edtParCodNom_Internalname) ;
                           n867ParCodNom = false ;
                           A13892GruOpeCodN = httpContext.cgiGet( edtGruOpeCodN_Internalname) ;
                           AV90Tinte = httpContext.cgiGet( edtavTinte_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTinte_Internalname, AV90Tinte);
                           A566HisProTur = (byte)(localUtil.ctol( httpContext.cgiGet( edtHisProTur_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           AV88Tiempom = (short)(localUtil.ctol( httpContext.cgiGet( edtavTiempom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTiempom_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV88Tiempom), 4, 0));
                           A3612HisProReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtHisProReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
                                       e18TI2 ();
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
                                       e19TI2 ();
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
                                       e20TI2 ();
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
                                    strupTI0( ) ;
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

   public void weTI2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseFormTI2( ) ;
         }
      }
   }

   public void paTI2( )
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
                                 String AV5Emprcod ,
                                 String AV9MaqCodInicial ,
                                 String AV8MaqCodFinal ,
                                 java.util.Date AV7Hisprodti ,
                                 java.util.Date AV6HisProdtf ,
                                 byte AV105HisProReo ,
                                 short AV106ParCod ,
                                 byte AV29ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelector ,
                                 String AV103FilterFullText ,
                                 String AV31TFMaqCod ,
                                 String AV32TFMaqCod_Sel ,
                                 String AV59TFMaqDsc ,
                                 String AV60TFMaqDsc_Sel ,
                                 String AV34TFBarNHdr ,
                                 String AV35TFBarNHdr_Sel ,
                                 String AV101TFHisProLot ,
                                 String AV102TFHisProLot_Sel ,
                                 int AV62TFCliCod ,
                                 int AV63TFCliCod_To ,
                                 String AV65TFCliNom ,
                                 String AV66TFCliNom_Sel ,
                                 String AV121TFPedidoCliente ,
                                 String AV122TFPedidoCliente_Sel ,
                                 java.util.Date AV68TFBarFecGen ,
                                 String AV73TFBarSer ,
                                 String AV74TFBarSer_Sel ,
                                 String AV76TFBarSerDsc ,
                                 String AV77TFBarSerDsc_Sel ,
                                 String AV117TFBarTipArtDsc ,
                                 String AV118TFBarTipArtDsc_Sel ,
                                 String AV119TFBarTipColDsc ,
                                 String AV120TFBarTipColDsc_Sel ,
                                 String AV37TFFase ,
                                 String AV38TFFase_Sel ,
                                 String AV125TFFaseDescripcion ,
                                 String AV126TFFaseDescripcion_Sel ,
                                 java.util.Date AV40TFHisProDTI ,
                                 java.util.Date AV45TFHisProDTF ,
                                 java.math.BigDecimal AV79TFHisProKgr ,
                                 java.math.BigDecimal AV80TFHisProKgr_To ,
                                 java.math.BigDecimal AV82TFHisProMtr ,
                                 java.math.BigDecimal AV83TFHisProMtr_To ,
                                 short AV92TFParCod ,
                                 short AV93TFParCod_To ,
                                 String AV98TFParCodNom ,
                                 String AV99TFParCodNom_Sel ,
                                 byte AV95TFHisProTur ,
                                 byte AV96TFHisProTur_To ,
                                 byte AV107TFHisProReo ,
                                 byte AV108TFHisProReo_To ,
                                 String AV175Pgmname ,
                                 short AV17OrderedBy ,
                                 boolean AV18OrderedDsc ,
                                 java.math.BigDecimal AV84TotHisProKgr ,
                                 java.math.BigDecimal AV86TotHisProMtr ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e19TI2 ();
      GRID_nCurrentRecord = 0 ;
      rfTI2( ) ;
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
      rfTI2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV175Pgmname = "WCIformedetalladoHdrsProduccion" ;
      Gx_err = (short)(0) ;
      edtavTinte_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTinte_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTinte_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavTiempom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTiempom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTiempom_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavTotvaluehisprokgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluehisprokgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluehisprokgr_Enabled), 5, 0), true);
      edtavTotvaluehispromtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluehispromtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluehispromtr_Enabled), 5, 0), true);
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV133Wciformedetalladohdrsproduccionds_1_filterfulltext = AV103FilterFullText ;
      AV134Wciformedetalladohdrsproduccionds_2_tfmaqcod = AV31TFMaqCod ;
      AV135Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel = AV32TFMaqCod_Sel ;
      AV136Wciformedetalladohdrsproduccionds_4_tfmaqdsc = AV59TFMaqDsc ;
      AV137Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel = AV60TFMaqDsc_Sel ;
      AV138Wciformedetalladohdrsproduccionds_6_tfbarnhdr = AV34TFBarNHdr ;
      AV139Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel = AV35TFBarNHdr_Sel ;
      AV140Wciformedetalladohdrsproduccionds_8_tfhisprolot = AV101TFHisProLot ;
      AV141Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel = AV102TFHisProLot_Sel ;
      AV142Wciformedetalladohdrsproduccionds_10_tfclicod = AV62TFCliCod ;
      AV143Wciformedetalladohdrsproduccionds_11_tfclicod_to = AV63TFCliCod_To ;
      AV144Wciformedetalladohdrsproduccionds_12_tfclinom = AV65TFCliNom ;
      AV145Wciformedetalladohdrsproduccionds_13_tfclinom_sel = AV66TFCliNom_Sel ;
      AV146Wciformedetalladohdrsproduccionds_14_tfpedidocliente = AV121TFPedidoCliente ;
      AV147Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel = AV122TFPedidoCliente_Sel ;
      AV148Wciformedetalladohdrsproduccionds_16_tfbarfecgen = AV68TFBarFecGen ;
      AV149Wciformedetalladohdrsproduccionds_17_tfbarser = AV73TFBarSer ;
      AV150Wciformedetalladohdrsproduccionds_18_tfbarser_sel = AV74TFBarSer_Sel ;
      AV151Wciformedetalladohdrsproduccionds_19_tfbarserdsc = AV76TFBarSerDsc ;
      AV152Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel = AV77TFBarSerDsc_Sel ;
      AV153Wciformedetalladohdrsproduccionds_21_tfbartipartdsc = AV117TFBarTipArtDsc ;
      AV154Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel = AV118TFBarTipArtDsc_Sel ;
      AV155Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc = AV119TFBarTipColDsc ;
      AV156Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel = AV120TFBarTipColDsc_Sel ;
      AV157Wciformedetalladohdrsproduccionds_25_tffase = AV37TFFase ;
      AV158Wciformedetalladohdrsproduccionds_26_tffase_sel = AV38TFFase_Sel ;
      AV159Wciformedetalladohdrsproduccionds_27_tffasedescripcion = AV125TFFaseDescripcion ;
      AV160Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel = AV126TFFaseDescripcion_Sel ;
      AV161Wciformedetalladohdrsproduccionds_29_tfhisprodti = AV40TFHisProDTI ;
      AV162Wciformedetalladohdrsproduccionds_30_tfhisprodtf = AV45TFHisProDTF ;
      AV163Wciformedetalladohdrsproduccionds_31_tfhisprokgr = AV79TFHisProKgr ;
      AV164Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to = AV80TFHisProKgr_To ;
      AV165Wciformedetalladohdrsproduccionds_33_tfhispromtr = AV82TFHisProMtr ;
      AV166Wciformedetalladohdrsproduccionds_34_tfhispromtr_to = AV83TFHisProMtr_To ;
      AV167Wciformedetalladohdrsproduccionds_35_tfparcod = AV92TFParCod ;
      AV168Wciformedetalladohdrsproduccionds_36_tfparcod_to = AV93TFParCod_To ;
      AV169Wciformedetalladohdrsproduccionds_37_tfparcodnom = AV98TFParCodNom ;
      AV170Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel = AV99TFParCodNom_Sel ;
      AV171Wciformedetalladohdrsproduccionds_39_tfhisprotur = AV95TFHisProTur ;
      AV172Wciformedetalladohdrsproduccionds_40_tfhisprotur_to = AV96TFHisProTur_To ;
      AV173Wciformedetalladohdrsproduccionds_41_tfhisproreo = AV107TFHisProReo ;
      AV174Wciformedetalladohdrsproduccionds_42_tfhisproreo_to = AV108TFHisProReo_To ;
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV135Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel ,
                                           AV134Wciformedetalladohdrsproduccionds_2_tfmaqcod ,
                                           AV137Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel ,
                                           AV136Wciformedetalladohdrsproduccionds_4_tfmaqdsc ,
                                           AV139Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel ,
                                           AV138Wciformedetalladohdrsproduccionds_6_tfbarnhdr ,
                                           AV141Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel ,
                                           AV140Wciformedetalladohdrsproduccionds_8_tfhisprolot ,
                                           Integer.valueOf(AV142Wciformedetalladohdrsproduccionds_10_tfclicod) ,
                                           Integer.valueOf(AV143Wciformedetalladohdrsproduccionds_11_tfclicod_to) ,
                                           AV145Wciformedetalladohdrsproduccionds_13_tfclinom_sel ,
                                           AV144Wciformedetalladohdrsproduccionds_12_tfclinom ,
                                           AV148Wciformedetalladohdrsproduccionds_16_tfbarfecgen ,
                                           AV150Wciformedetalladohdrsproduccionds_18_tfbarser_sel ,
                                           AV149Wciformedetalladohdrsproduccionds_17_tfbarser ,
                                           AV152Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel ,
                                           AV151Wciformedetalladohdrsproduccionds_19_tfbarserdsc ,
                                           AV154Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel ,
                                           AV153Wciformedetalladohdrsproduccionds_21_tfbartipartdsc ,
                                           AV158Wciformedetalladohdrsproduccionds_26_tffase_sel ,
                                           AV157Wciformedetalladohdrsproduccionds_25_tffase ,
                                           AV161Wciformedetalladohdrsproduccionds_29_tfhisprodti ,
                                           AV162Wciformedetalladohdrsproduccionds_30_tfhisprodtf ,
                                           AV163Wciformedetalladohdrsproduccionds_31_tfhisprokgr ,
                                           AV164Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to ,
                                           AV165Wciformedetalladohdrsproduccionds_33_tfhispromtr ,
                                           AV166Wciformedetalladohdrsproduccionds_34_tfhispromtr_to ,
                                           Short.valueOf(AV167Wciformedetalladohdrsproduccionds_35_tfparcod) ,
                                           Short.valueOf(AV168Wciformedetalladohdrsproduccionds_36_tfparcod_to) ,
                                           AV170Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel ,
                                           AV169Wciformedetalladohdrsproduccionds_37_tfparcodnom ,
                                           Byte.valueOf(AV171Wciformedetalladohdrsproduccionds_39_tfhisprotur) ,
                                           Byte.valueOf(AV172Wciformedetalladohdrsproduccionds_40_tfhisprotur_to) ,
                                           Byte.valueOf(AV173Wciformedetalladohdrsproduccionds_41_tfhisproreo) ,
                                           Byte.valueOf(AV174Wciformedetalladohdrsproduccionds_42_tfhisproreo_to) ,
                                           AV9MaqCodInicial ,
                                           AV8MaqCodFinal ,
                                           AV7Hisprodti ,
                                           AV6HisProdtf ,
                                           Byte.valueOf(AV105HisProReo) ,
                                           Short.valueOf(AV106ParCod) ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A3610HisProLot ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A159BarFecGen ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A13711BarTipArtD ,
                                           A461Fase ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Short.valueOf(A656ParCod) ,
                                           A867ParCodNom ,
                                           Byte.valueOf(A566HisProTur) ,
                                           Byte.valueOf(A3612HisProReo) ,
                                           Short.valueOf(AV17OrderedBy) ,
                                           Boolean.valueOf(AV18OrderedDsc) ,
                                           AV133Wciformedetalladohdrsproduccionds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A13878PedidoClie ,
                                           A13868BarTipColD ,
                                           A13893FaseDescri ,
                                           AV147Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel ,
                                           AV146Wciformedetalladohdrsproduccionds_14_tfpedidocliente ,
                                           AV156Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel ,
                                           AV155Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc ,
                                           AV160Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel ,
                                           AV159Wciformedetalladohdrsproduccionds_27_tffasedescripcion ,
                                           AV5Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV134Wciformedetalladohdrsproduccionds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV134Wciformedetalladohdrsproduccionds_2_tfmaqcod), 6, "%") ;
      lV136Wciformedetalladohdrsproduccionds_4_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV136Wciformedetalladohdrsproduccionds_4_tfmaqdsc), 16, "%") ;
      lV138Wciformedetalladohdrsproduccionds_6_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV138Wciformedetalladohdrsproduccionds_6_tfbarnhdr), 11, "%") ;
      lV140Wciformedetalladohdrsproduccionds_8_tfhisprolot = GXutil.padr( GXutil.rtrim( AV140Wciformedetalladohdrsproduccionds_8_tfhisprolot), 10, "%") ;
      lV144Wciformedetalladohdrsproduccionds_12_tfclinom = GXutil.padr( GXutil.rtrim( AV144Wciformedetalladohdrsproduccionds_12_tfclinom), 30, "%") ;
      lV149Wciformedetalladohdrsproduccionds_17_tfbarser = GXutil.padr( GXutil.rtrim( AV149Wciformedetalladohdrsproduccionds_17_tfbarser), 16, "%") ;
      lV151Wciformedetalladohdrsproduccionds_19_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV151Wciformedetalladohdrsproduccionds_19_tfbarserdsc), 26, "%") ;
      lV153Wciformedetalladohdrsproduccionds_21_tfbartipartdsc = GXutil.padr( GXutil.rtrim( AV153Wciformedetalladohdrsproduccionds_21_tfbartipartdsc), 30, "%") ;
      lV157Wciformedetalladohdrsproduccionds_25_tffase = GXutil.padr( GXutil.rtrim( AV157Wciformedetalladohdrsproduccionds_25_tffase), 8, "%") ;
      lV169Wciformedetalladohdrsproduccionds_37_tfparcodnom = GXutil.padr( GXutil.rtrim( AV169Wciformedetalladohdrsproduccionds_37_tfparcodnom), 30, "%") ;
      /* Using cursor H00TI2 */
      pr_default.execute(0, new Object[] {AV5Emprcod, lV134Wciformedetalladohdrsproduccionds_2_tfmaqcod, AV135Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel, lV136Wciformedetalladohdrsproduccionds_4_tfmaqdsc, AV137Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel, lV138Wciformedetalladohdrsproduccionds_6_tfbarnhdr, AV139Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel, lV140Wciformedetalladohdrsproduccionds_8_tfhisprolot, AV141Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel, Integer.valueOf(AV142Wciformedetalladohdrsproduccionds_10_tfclicod), Integer.valueOf(AV143Wciformedetalladohdrsproduccionds_11_tfclicod_to), lV144Wciformedetalladohdrsproduccionds_12_tfclinom, AV145Wciformedetalladohdrsproduccionds_13_tfclinom_sel, AV148Wciformedetalladohdrsproduccionds_16_tfbarfecgen, lV149Wciformedetalladohdrsproduccionds_17_tfbarser, AV150Wciformedetalladohdrsproduccionds_18_tfbarser_sel, lV151Wciformedetalladohdrsproduccionds_19_tfbarserdsc, AV152Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel, lV153Wciformedetalladohdrsproduccionds_21_tfbartipartdsc, AV154Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel, lV157Wciformedetalladohdrsproduccionds_25_tffase, AV158Wciformedetalladohdrsproduccionds_26_tffase_sel, AV161Wciformedetalladohdrsproduccionds_29_tfhisprodti, AV162Wciformedetalladohdrsproduccionds_30_tfhisprodtf, AV163Wciformedetalladohdrsproduccionds_31_tfhisprokgr, AV164Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to, AV165Wciformedetalladohdrsproduccionds_33_tfhispromtr, AV166Wciformedetalladohdrsproduccionds_34_tfhispromtr_to, Short.valueOf(AV167Wciformedetalladohdrsproduccionds_35_tfparcod), Short.valueOf(AV168Wciformedetalladohdrsproduccionds_36_tfparcod_to), lV169Wciformedetalladohdrsproduccionds_37_tfparcodnom, AV170Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel, Byte.valueOf(AV171Wciformedetalladohdrsproduccionds_39_tfhisprotur), Byte.valueOf(AV172Wciformedetalladohdrsproduccionds_40_tfhisprotur_to), Byte.valueOf(AV173Wciformedetalladohdrsproduccionds_41_tfhisproreo), Byte.valueOf(AV174Wciformedetalladohdrsproduccionds_42_tfhisproreo_to), AV9MaqCodInicial, AV8MaqCodFinal, AV7Hisprodti, AV6HisProdtf, Byte.valueOf(AV105HisProReo), Short.valueOf(AV106ParCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A217BarTipArt = H00TI2_A217BarTipArt[0] ;
         n217BarTipArt = H00TI2_n217BarTipArt[0] ;
         A3612HisProReo = H00TI2_A3612HisProReo[0] ;
         A566HisProTur = H00TI2_A566HisProTur[0] ;
         A867ParCodNom = H00TI2_A867ParCodNom[0] ;
         n867ParCodNom = H00TI2_n867ParCodNom[0] ;
         A656ParCod = H00TI2_A656ParCod[0] ;
         n656ParCod = H00TI2_n656ParCod[0] ;
         A1526HisProMtr = H00TI2_A1526HisProMtr[0] ;
         A1525HisProKgr = H00TI2_A1525HisProKgr[0] ;
         A13711BarTipArtD = H00TI2_A13711BarTipArtD[0] ;
         n13711BarTipArtD = H00TI2_n13711BarTipArtD[0] ;
         A1652BarSerDsc = H00TI2_A1652BarSerDsc[0] ;
         A212BarSer = H00TI2_A212BarSer[0] ;
         A159BarFecGen = H00TI2_A159BarFecGen[0] ;
         A279CliNom = H00TI2_A279CliNom[0] ;
         A252CliCod = H00TI2_A252CliCod[0] ;
         n252CliCod = H00TI2_n252CliCod[0] ;
         A3610HisProLot = H00TI2_A3610HisProLot[0] ;
         A13696BarNHdr = H00TI2_A13696BarNHdr[0] ;
         A606MaqDsc = H00TI2_A606MaqDsc[0] ;
         n606MaqDsc = H00TI2_n606MaqDsc[0] ;
         A602MaqCod = H00TI2_A602MaqCod[0] ;
         A129BarCod = H00TI2_A129BarCod[0] ;
         A132BarCodReo = H00TI2_A132BarCodReo[0] ;
         A130BarCodPar = H00TI2_A130BarCodPar[0] ;
         A143BarDisNum = H00TI2_A143BarDisNum[0] ;
         A4812BarEncCli = H00TI2_A4812BarEncCli[0] ;
         A218BarTipCol = H00TI2_A218BarTipCol[0] ;
         A461Fase = H00TI2_A461Fase[0] ;
         A503GruOpeCod = H00TI2_A503GruOpeCod[0] ;
         A396EmprCod = H00TI2_A396EmprCod[0] ;
         A4440HisProDTI = H00TI2_A4440HisProDTI[0] ;
         n4440HisProDTI = H00TI2_n4440HisProDTI[0] ;
         A4441HisProDTF = H00TI2_A4441HisProDTF[0] ;
         n4441HisProDTF = H00TI2_n4441HisProDTF[0] ;
         A606MaqDsc = H00TI2_A606MaqDsc[0] ;
         n606MaqDsc = H00TI2_n606MaqDsc[0] ;
         A217BarTipArt = H00TI2_A217BarTipArt[0] ;
         n217BarTipArt = H00TI2_n217BarTipArt[0] ;
         A1652BarSerDsc = H00TI2_A1652BarSerDsc[0] ;
         A212BarSer = H00TI2_A212BarSer[0] ;
         A159BarFecGen = H00TI2_A159BarFecGen[0] ;
         A252CliCod = H00TI2_A252CliCod[0] ;
         n252CliCod = H00TI2_n252CliCod[0] ;
         A13696BarNHdr = H00TI2_A13696BarNHdr[0] ;
         A143BarDisNum = H00TI2_A143BarDisNum[0] ;
         A4812BarEncCli = H00TI2_A4812BarEncCli[0] ;
         A218BarTipCol = H00TI2_A218BarTipCol[0] ;
         A279CliNom = H00TI2_A279CliNom[0] ;
         A13711BarTipArtD = H00TI2_A13711BarTipArtD[0] ;
         n13711BarTipArtD = H00TI2_n13711BarTipArtD[0] ;
         A867ParCodNom = H00TI2_A867ParCodNom[0] ;
         n867ParCodNom = H00TI2_n867ParCodNom[0] ;
         if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
         {
            A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5605HisProTr2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5605HisProTr2), 4, 0));
         }
         else
         {
            A5605HisProTr2 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5605HisProTr2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5605HisProTr2), 4, 0));
         }
         GXt_char1 = A13878PedidoClie ;
         GXv_char2[0] = A396EmprCod ;
         GXv_char3[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char5[0] = GXt_char1 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_char4, GXv_char5) ;
         wciformedetalladohdrsproduccion_impl.this.A396EmprCod = GXv_char2[0] ;
         wciformedetalladohdrsproduccion_impl.this.A4812BarEncCli = GXv_char3[0] ;
         wciformedetalladohdrsproduccion_impl.this.A143BarDisNum = GXv_char4[0] ;
         wciformedetalladohdrsproduccion_impl.this.GXt_char1 = GXv_char5[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4812BarEncCli", A4812BarEncCli);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A143BarDisNum", A143BarDisNum);
         A13878PedidoClie = GXt_char1 ;
         if ( ! ( (GXutil.strcmp("", AV147Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV146Wciformedetalladohdrsproduccionds_14_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV146Wciformedetalladohdrsproduccionds_14_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV147Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV147Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel) == 0 ) ) )
            {
               GXt_char1 = A13868BarTipColD ;
               GXv_char5[0] = A396EmprCod ;
               GXv_int6[0] = A218BarTipCol ;
               GXv_char4[0] = GXt_char1 ;
               new app.pfcoldsc(remoteHandle, context).execute( GXv_char5, GXv_int6, GXv_char4) ;
               wciformedetalladohdrsproduccion_impl.this.A396EmprCod = GXv_char5[0] ;
               wciformedetalladohdrsproduccion_impl.this.A218BarTipCol = GXv_int6[0] ;
               wciformedetalladohdrsproduccion_impl.this.GXt_char1 = GXv_char4[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
               A13868BarTipColD = GXt_char1 ;
               if ( ! ( (GXutil.strcmp("", AV156Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV155Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc)==0) ) ) || ( GXutil.like( GXutil.upper( A13868BarTipColD) , GXutil.padr( "%" + GXutil.upper( AV155Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV156Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel)==0) || ( ( GXutil.strcmp(A13868BarTipColD, AV156Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel) == 0 ) ) )
                  {
                     GXt_char1 = A13893FaseDescri ;
                     GXv_char5[0] = GXt_char1 ;
                     new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char5) ;
                     wciformedetalladohdrsproduccion_impl.this.GXt_char1 = GXv_char5[0] ;
                     A13893FaseDescri = GXt_char1 ;
                     if ( (GXutil.strcmp("", AV133Wciformedetalladohdrsproduccionds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A602MaqCod) , GXutil.padr( "%" + GXutil.upper( AV133Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A606MaqDsc) , GXutil.padr( "%" + GXutil.upper( AV133Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV133Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3610HisProLot) , GXutil.padr( "%" + GXutil.upper( AV133Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV133Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV133Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV133Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV133Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV133Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13711BarTipArtD) , GXutil.padr( "%" + GXutil.upper( AV133Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13868BarTipColD) , GXutil.padr( "%" + GXutil.upper( AV133Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A461Fase) , GXutil.padr( "%" + GXutil.upper( AV133Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13893FaseDescri) , GXutil.padr( "%" + GXutil.upper( AV133Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1525HisProKgr, 9, 2) , GXutil.padr( "%" + AV133Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1526HisProMtr, 9, 2) , GXutil.padr( "%" + AV133Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A656ParCod, 4, 0) , GXutil.padr( "%" + AV133Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A867ParCodNom) , GXutil.padr( "%" + GXutil.upper( AV133Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A566HisProTur, 1, 0) , GXutil.padr( "%" + AV133Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A3612HisProReo, 1, 0) , GXutil.padr( "%" + AV133Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
                     {
                        if ( ! ( (GXutil.strcmp("", AV160Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel)==0) && ( ! (GXutil.strcmp("", AV159Wciformedetalladohdrsproduccionds_27_tffasedescripcion)==0) ) ) || ( GXutil.like( GXutil.upper( A13893FaseDescri) , GXutil.padr( "%" + GXutil.upper( AV159Wciformedetalladohdrsproduccionds_27_tffasedescripcion) , 255 , "%"),  ' ' ) ) )
                        {
                           if ( (GXutil.strcmp("", AV160Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel)==0) || ( ( GXutil.strcmp(A13893FaseDescri, AV160Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel) == 0 ) ) )
                           {
                              GXt_char1 = A13892GruOpeCodN ;
                              GXv_char5[0] = GXt_char1 ;
                              new app.popenom(remoteHandle, context).execute( A396EmprCod, A503GruOpeCod, GXv_char5) ;
                              wciformedetalladohdrsproduccion_impl.this.GXt_char1 = GXv_char5[0] ;
                              A13892GruOpeCodN = GXt_char1 ;
                              GRID_nRecordCount = (long)(GRID_nRecordCount+1) ;
                           }
                        }
                     }
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

   public void rfTI2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(41) ;
      /* Execute user event: Refresh */
      e19TI2 ();
      nGXsfl_41_idx = 1 ;
      sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_412( ) ;
      bGXsfl_41_Refreshing = true ;
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
         subsflControlProps_412( ) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              AV135Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel ,
                                              AV134Wciformedetalladohdrsproduccionds_2_tfmaqcod ,
                                              AV137Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel ,
                                              AV136Wciformedetalladohdrsproduccionds_4_tfmaqdsc ,
                                              AV139Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel ,
                                              AV138Wciformedetalladohdrsproduccionds_6_tfbarnhdr ,
                                              AV141Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel ,
                                              AV140Wciformedetalladohdrsproduccionds_8_tfhisprolot ,
                                              Integer.valueOf(AV142Wciformedetalladohdrsproduccionds_10_tfclicod) ,
                                              Integer.valueOf(AV143Wciformedetalladohdrsproduccionds_11_tfclicod_to) ,
                                              AV145Wciformedetalladohdrsproduccionds_13_tfclinom_sel ,
                                              AV144Wciformedetalladohdrsproduccionds_12_tfclinom ,
                                              AV148Wciformedetalladohdrsproduccionds_16_tfbarfecgen ,
                                              AV150Wciformedetalladohdrsproduccionds_18_tfbarser_sel ,
                                              AV149Wciformedetalladohdrsproduccionds_17_tfbarser ,
                                              AV152Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel ,
                                              AV151Wciformedetalladohdrsproduccionds_19_tfbarserdsc ,
                                              AV154Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel ,
                                              AV153Wciformedetalladohdrsproduccionds_21_tfbartipartdsc ,
                                              AV158Wciformedetalladohdrsproduccionds_26_tffase_sel ,
                                              AV157Wciformedetalladohdrsproduccionds_25_tffase ,
                                              AV161Wciformedetalladohdrsproduccionds_29_tfhisprodti ,
                                              AV162Wciformedetalladohdrsproduccionds_30_tfhisprodtf ,
                                              AV163Wciformedetalladohdrsproduccionds_31_tfhisprokgr ,
                                              AV164Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to ,
                                              AV165Wciformedetalladohdrsproduccionds_33_tfhispromtr ,
                                              AV166Wciformedetalladohdrsproduccionds_34_tfhispromtr_to ,
                                              Short.valueOf(AV167Wciformedetalladohdrsproduccionds_35_tfparcod) ,
                                              Short.valueOf(AV168Wciformedetalladohdrsproduccionds_36_tfparcod_to) ,
                                              AV170Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel ,
                                              AV169Wciformedetalladohdrsproduccionds_37_tfparcodnom ,
                                              Byte.valueOf(AV171Wciformedetalladohdrsproduccionds_39_tfhisprotur) ,
                                              Byte.valueOf(AV172Wciformedetalladohdrsproduccionds_40_tfhisprotur_to) ,
                                              Byte.valueOf(AV173Wciformedetalladohdrsproduccionds_41_tfhisproreo) ,
                                              Byte.valueOf(AV174Wciformedetalladohdrsproduccionds_42_tfhisproreo_to) ,
                                              AV9MaqCodInicial ,
                                              AV8MaqCodFinal ,
                                              AV7Hisprodti ,
                                              AV6HisProdtf ,
                                              Byte.valueOf(AV105HisProReo) ,
                                              Short.valueOf(AV106ParCod) ,
                                              A602MaqCod ,
                                              A606MaqDsc ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar ,
                                              A3610HisProLot ,
                                              Integer.valueOf(A252CliCod) ,
                                              A279CliNom ,
                                              A159BarFecGen ,
                                              A212BarSer ,
                                              A1652BarSerDsc ,
                                              A13711BarTipArtD ,
                                              A461Fase ,
                                              A4440HisProDTI ,
                                              A4441HisProDTF ,
                                              A1525HisProKgr ,
                                              A1526HisProMtr ,
                                              Short.valueOf(A656ParCod) ,
                                              A867ParCodNom ,
                                              Byte.valueOf(A566HisProTur) ,
                                              Byte.valueOf(A3612HisProReo) ,
                                              Short.valueOf(AV17OrderedBy) ,
                                              Boolean.valueOf(AV18OrderedDsc) ,
                                              AV133Wciformedetalladohdrsproduccionds_1_filterfulltext ,
                                              A13696BarNHdr ,
                                              A13878PedidoClie ,
                                              A13868BarTipColD ,
                                              A13893FaseDescri ,
                                              AV147Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel ,
                                              AV146Wciformedetalladohdrsproduccionds_14_tfpedidocliente ,
                                              AV156Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel ,
                                              AV155Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc ,
                                              AV160Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel ,
                                              AV159Wciformedetalladohdrsproduccionds_27_tffasedescripcion ,
                                              AV5Emprcod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE,
                                              TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                              TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT,
                                              TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV134Wciformedetalladohdrsproduccionds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV134Wciformedetalladohdrsproduccionds_2_tfmaqcod), 6, "%") ;
         lV136Wciformedetalladohdrsproduccionds_4_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV136Wciformedetalladohdrsproduccionds_4_tfmaqdsc), 16, "%") ;
         lV138Wciformedetalladohdrsproduccionds_6_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV138Wciformedetalladohdrsproduccionds_6_tfbarnhdr), 11, "%") ;
         lV140Wciformedetalladohdrsproduccionds_8_tfhisprolot = GXutil.padr( GXutil.rtrim( AV140Wciformedetalladohdrsproduccionds_8_tfhisprolot), 10, "%") ;
         lV144Wciformedetalladohdrsproduccionds_12_tfclinom = GXutil.padr( GXutil.rtrim( AV144Wciformedetalladohdrsproduccionds_12_tfclinom), 30, "%") ;
         lV149Wciformedetalladohdrsproduccionds_17_tfbarser = GXutil.padr( GXutil.rtrim( AV149Wciformedetalladohdrsproduccionds_17_tfbarser), 16, "%") ;
         lV151Wciformedetalladohdrsproduccionds_19_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV151Wciformedetalladohdrsproduccionds_19_tfbarserdsc), 26, "%") ;
         lV153Wciformedetalladohdrsproduccionds_21_tfbartipartdsc = GXutil.padr( GXutil.rtrim( AV153Wciformedetalladohdrsproduccionds_21_tfbartipartdsc), 30, "%") ;
         lV157Wciformedetalladohdrsproduccionds_25_tffase = GXutil.padr( GXutil.rtrim( AV157Wciformedetalladohdrsproduccionds_25_tffase), 8, "%") ;
         lV169Wciformedetalladohdrsproduccionds_37_tfparcodnom = GXutil.padr( GXutil.rtrim( AV169Wciformedetalladohdrsproduccionds_37_tfparcodnom), 30, "%") ;
         /* Using cursor H00TI3 */
         pr_default.execute(1, new Object[] {AV5Emprcod, lV134Wciformedetalladohdrsproduccionds_2_tfmaqcod, AV135Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel, lV136Wciformedetalladohdrsproduccionds_4_tfmaqdsc, AV137Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel, lV138Wciformedetalladohdrsproduccionds_6_tfbarnhdr, AV139Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel, lV140Wciformedetalladohdrsproduccionds_8_tfhisprolot, AV141Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel, Integer.valueOf(AV142Wciformedetalladohdrsproduccionds_10_tfclicod), Integer.valueOf(AV143Wciformedetalladohdrsproduccionds_11_tfclicod_to), lV144Wciformedetalladohdrsproduccionds_12_tfclinom, AV145Wciformedetalladohdrsproduccionds_13_tfclinom_sel, AV148Wciformedetalladohdrsproduccionds_16_tfbarfecgen, lV149Wciformedetalladohdrsproduccionds_17_tfbarser, AV150Wciformedetalladohdrsproduccionds_18_tfbarser_sel, lV151Wciformedetalladohdrsproduccionds_19_tfbarserdsc, AV152Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel, lV153Wciformedetalladohdrsproduccionds_21_tfbartipartdsc, AV154Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel, lV157Wciformedetalladohdrsproduccionds_25_tffase, AV158Wciformedetalladohdrsproduccionds_26_tffase_sel, AV161Wciformedetalladohdrsproduccionds_29_tfhisprodti, AV162Wciformedetalladohdrsproduccionds_30_tfhisprodtf, AV163Wciformedetalladohdrsproduccionds_31_tfhisprokgr, AV164Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to, AV165Wciformedetalladohdrsproduccionds_33_tfhispromtr, AV166Wciformedetalladohdrsproduccionds_34_tfhispromtr_to, Short.valueOf(AV167Wciformedetalladohdrsproduccionds_35_tfparcod), Short.valueOf(AV168Wciformedetalladohdrsproduccionds_36_tfparcod_to), lV169Wciformedetalladohdrsproduccionds_37_tfparcodnom, AV170Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel, Byte.valueOf(AV171Wciformedetalladohdrsproduccionds_39_tfhisprotur), Byte.valueOf(AV172Wciformedetalladohdrsproduccionds_40_tfhisprotur_to), Byte.valueOf(AV173Wciformedetalladohdrsproduccionds_41_tfhisproreo), Byte.valueOf(AV174Wciformedetalladohdrsproduccionds_42_tfhisproreo_to), AV9MaqCodInicial, AV8MaqCodFinal, AV7Hisprodti, AV6HisProdtf, Byte.valueOf(AV105HisProReo), Short.valueOf(AV106ParCod)});
         nGXsfl_41_idx = 1 ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_412( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A217BarTipArt = H00TI3_A217BarTipArt[0] ;
            n217BarTipArt = H00TI3_n217BarTipArt[0] ;
            A3612HisProReo = H00TI3_A3612HisProReo[0] ;
            A566HisProTur = H00TI3_A566HisProTur[0] ;
            A867ParCodNom = H00TI3_A867ParCodNom[0] ;
            n867ParCodNom = H00TI3_n867ParCodNom[0] ;
            A656ParCod = H00TI3_A656ParCod[0] ;
            n656ParCod = H00TI3_n656ParCod[0] ;
            A1526HisProMtr = H00TI3_A1526HisProMtr[0] ;
            A1525HisProKgr = H00TI3_A1525HisProKgr[0] ;
            A13711BarTipArtD = H00TI3_A13711BarTipArtD[0] ;
            n13711BarTipArtD = H00TI3_n13711BarTipArtD[0] ;
            A1652BarSerDsc = H00TI3_A1652BarSerDsc[0] ;
            A212BarSer = H00TI3_A212BarSer[0] ;
            A159BarFecGen = H00TI3_A159BarFecGen[0] ;
            A279CliNom = H00TI3_A279CliNom[0] ;
            A252CliCod = H00TI3_A252CliCod[0] ;
            n252CliCod = H00TI3_n252CliCod[0] ;
            A3610HisProLot = H00TI3_A3610HisProLot[0] ;
            A13696BarNHdr = H00TI3_A13696BarNHdr[0] ;
            A606MaqDsc = H00TI3_A606MaqDsc[0] ;
            n606MaqDsc = H00TI3_n606MaqDsc[0] ;
            A602MaqCod = H00TI3_A602MaqCod[0] ;
            A129BarCod = H00TI3_A129BarCod[0] ;
            A132BarCodReo = H00TI3_A132BarCodReo[0] ;
            A130BarCodPar = H00TI3_A130BarCodPar[0] ;
            A143BarDisNum = H00TI3_A143BarDisNum[0] ;
            A4812BarEncCli = H00TI3_A4812BarEncCli[0] ;
            A218BarTipCol = H00TI3_A218BarTipCol[0] ;
            A461Fase = H00TI3_A461Fase[0] ;
            A503GruOpeCod = H00TI3_A503GruOpeCod[0] ;
            A396EmprCod = H00TI3_A396EmprCod[0] ;
            A4440HisProDTI = H00TI3_A4440HisProDTI[0] ;
            n4440HisProDTI = H00TI3_n4440HisProDTI[0] ;
            A4441HisProDTF = H00TI3_A4441HisProDTF[0] ;
            n4441HisProDTF = H00TI3_n4441HisProDTF[0] ;
            A606MaqDsc = H00TI3_A606MaqDsc[0] ;
            n606MaqDsc = H00TI3_n606MaqDsc[0] ;
            A217BarTipArt = H00TI3_A217BarTipArt[0] ;
            n217BarTipArt = H00TI3_n217BarTipArt[0] ;
            A1652BarSerDsc = H00TI3_A1652BarSerDsc[0] ;
            A212BarSer = H00TI3_A212BarSer[0] ;
            A159BarFecGen = H00TI3_A159BarFecGen[0] ;
            A252CliCod = H00TI3_A252CliCod[0] ;
            n252CliCod = H00TI3_n252CliCod[0] ;
            A13696BarNHdr = H00TI3_A13696BarNHdr[0] ;
            A143BarDisNum = H00TI3_A143BarDisNum[0] ;
            A4812BarEncCli = H00TI3_A4812BarEncCli[0] ;
            A218BarTipCol = H00TI3_A218BarTipCol[0] ;
            A279CliNom = H00TI3_A279CliNom[0] ;
            A13711BarTipArtD = H00TI3_A13711BarTipArtD[0] ;
            n13711BarTipArtD = H00TI3_n13711BarTipArtD[0] ;
            A867ParCodNom = H00TI3_A867ParCodNom[0] ;
            n867ParCodNom = H00TI3_n867ParCodNom[0] ;
            if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
            {
               A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5605HisProTr2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5605HisProTr2), 4, 0));
            }
            else
            {
               A5605HisProTr2 = (short)(0) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5605HisProTr2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5605HisProTr2), 4, 0));
            }
            GXt_char1 = A13878PedidoClie ;
            GXv_char5[0] = A396EmprCod ;
            GXv_char4[0] = A4812BarEncCli ;
            GXv_char3[0] = A143BarDisNum ;
            GXv_char2[0] = GXt_char1 ;
            new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_char3, GXv_char2) ;
            wciformedetalladohdrsproduccion_impl.this.A396EmprCod = GXv_char5[0] ;
            wciformedetalladohdrsproduccion_impl.this.A4812BarEncCli = GXv_char4[0] ;
            wciformedetalladohdrsproduccion_impl.this.A143BarDisNum = GXv_char3[0] ;
            wciformedetalladohdrsproduccion_impl.this.GXt_char1 = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4812BarEncCli", A4812BarEncCli);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A143BarDisNum", A143BarDisNum);
            A13878PedidoClie = GXt_char1 ;
            if ( ! ( (GXutil.strcmp("", AV147Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV146Wciformedetalladohdrsproduccionds_14_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV146Wciformedetalladohdrsproduccionds_14_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV147Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV147Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel) == 0 ) ) )
               {
                  GXt_char1 = A13868BarTipColD ;
                  GXv_char5[0] = A396EmprCod ;
                  GXv_int6[0] = A218BarTipCol ;
                  GXv_char4[0] = GXt_char1 ;
                  new app.pfcoldsc(remoteHandle, context).execute( GXv_char5, GXv_int6, GXv_char4) ;
                  wciformedetalladohdrsproduccion_impl.this.A396EmprCod = GXv_char5[0] ;
                  wciformedetalladohdrsproduccion_impl.this.A218BarTipCol = GXv_int6[0] ;
                  wciformedetalladohdrsproduccion_impl.this.GXt_char1 = GXv_char4[0] ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
                  A13868BarTipColD = GXt_char1 ;
                  if ( ! ( (GXutil.strcmp("", AV156Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV155Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc)==0) ) ) || ( GXutil.like( GXutil.upper( A13868BarTipColD) , GXutil.padr( "%" + GXutil.upper( AV155Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc) , 255 , "%"),  ' ' ) ) )
                  {
                     if ( (GXutil.strcmp("", AV156Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel)==0) || ( ( GXutil.strcmp(A13868BarTipColD, AV156Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel) == 0 ) ) )
                     {
                        GXt_char1 = A13893FaseDescri ;
                        GXv_char5[0] = GXt_char1 ;
                        new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char5) ;
                        wciformedetalladohdrsproduccion_impl.this.GXt_char1 = GXv_char5[0] ;
                        A13893FaseDescri = GXt_char1 ;
                        if ( (GXutil.strcmp("", AV133Wciformedetalladohdrsproduccionds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A602MaqCod) , GXutil.padr( "%" + GXutil.upper( AV133Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A606MaqDsc) , GXutil.padr( "%" + GXutil.upper( AV133Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV133Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3610HisProLot) , GXutil.padr( "%" + GXutil.upper( AV133Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV133Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV133Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV133Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV133Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV133Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13711BarTipArtD) , GXutil.padr( "%" + GXutil.upper( AV133Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13868BarTipColD) , GXutil.padr( "%" + GXutil.upper( AV133Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A461Fase) , GXutil.padr( "%" + GXutil.upper( AV133Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13893FaseDescri) , GXutil.padr( "%" + GXutil.upper( AV133Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1525HisProKgr, 9, 2) , GXutil.padr( "%" + AV133Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1526HisProMtr, 9, 2) , GXutil.padr( "%" + AV133Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A656ParCod, 4, 0) , GXutil.padr( "%" + AV133Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A867ParCodNom) , GXutil.padr( "%" + GXutil.upper( AV133Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A566HisProTur, 1, 0) , GXutil.padr( "%" + AV133Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A3612HisProReo, 1, 0) , GXutil.padr( "%" + AV133Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
                        {
                           if ( ! ( (GXutil.strcmp("", AV160Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel)==0) && ( ! (GXutil.strcmp("", AV159Wciformedetalladohdrsproduccionds_27_tffasedescripcion)==0) ) ) || ( GXutil.like( GXutil.upper( A13893FaseDescri) , GXutil.padr( "%" + GXutil.upper( AV159Wciformedetalladohdrsproduccionds_27_tffasedescripcion) , 255 , "%"),  ' ' ) ) )
                           {
                              if ( (GXutil.strcmp("", AV160Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel)==0) || ( ( GXutil.strcmp(A13893FaseDescri, AV160Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel) == 0 ) ) )
                              {
                                 GXt_char1 = A13892GruOpeCodN ;
                                 GXv_char5[0] = GXt_char1 ;
                                 new app.popenom(remoteHandle, context).execute( A396EmprCod, A503GruOpeCod, GXv_char5) ;
                                 wciformedetalladohdrsproduccion_impl.this.GXt_char1 = GXv_char5[0] ;
                                 A13892GruOpeCodN = GXt_char1 ;
                                 e20TI2 ();
                              }
                           }
                        }
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
         wbTI0( ) ;
      }
      bGXsfl_41_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesTI2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV175Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV175Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTHISPROKGR", GXutil.ltrim( localUtil.ntoc( AV84TotHisProKgr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTHISPROKGR", getSecureSignedToken( sPrefix, localUtil.format( AV84TotHisProKgr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTHISPROMTR", GXutil.ltrim( localUtil.ntoc( AV86TotHisProMtr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTHISPROMTR", getSecureSignedToken( sPrefix, localUtil.format( AV86TotHisProMtr, "ZZZZZ9.99")));
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
      AV133Wciformedetalladohdrsproduccionds_1_filterfulltext = AV103FilterFullText ;
      AV134Wciformedetalladohdrsproduccionds_2_tfmaqcod = AV31TFMaqCod ;
      AV135Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel = AV32TFMaqCod_Sel ;
      AV136Wciformedetalladohdrsproduccionds_4_tfmaqdsc = AV59TFMaqDsc ;
      AV137Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel = AV60TFMaqDsc_Sel ;
      AV138Wciformedetalladohdrsproduccionds_6_tfbarnhdr = AV34TFBarNHdr ;
      AV139Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel = AV35TFBarNHdr_Sel ;
      AV140Wciformedetalladohdrsproduccionds_8_tfhisprolot = AV101TFHisProLot ;
      AV141Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel = AV102TFHisProLot_Sel ;
      AV142Wciformedetalladohdrsproduccionds_10_tfclicod = AV62TFCliCod ;
      AV143Wciformedetalladohdrsproduccionds_11_tfclicod_to = AV63TFCliCod_To ;
      AV144Wciformedetalladohdrsproduccionds_12_tfclinom = AV65TFCliNom ;
      AV145Wciformedetalladohdrsproduccionds_13_tfclinom_sel = AV66TFCliNom_Sel ;
      AV146Wciformedetalladohdrsproduccionds_14_tfpedidocliente = AV121TFPedidoCliente ;
      AV147Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel = AV122TFPedidoCliente_Sel ;
      AV148Wciformedetalladohdrsproduccionds_16_tfbarfecgen = AV68TFBarFecGen ;
      AV149Wciformedetalladohdrsproduccionds_17_tfbarser = AV73TFBarSer ;
      AV150Wciformedetalladohdrsproduccionds_18_tfbarser_sel = AV74TFBarSer_Sel ;
      AV151Wciformedetalladohdrsproduccionds_19_tfbarserdsc = AV76TFBarSerDsc ;
      AV152Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel = AV77TFBarSerDsc_Sel ;
      AV153Wciformedetalladohdrsproduccionds_21_tfbartipartdsc = AV117TFBarTipArtDsc ;
      AV154Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel = AV118TFBarTipArtDsc_Sel ;
      AV155Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc = AV119TFBarTipColDsc ;
      AV156Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel = AV120TFBarTipColDsc_Sel ;
      AV157Wciformedetalladohdrsproduccionds_25_tffase = AV37TFFase ;
      AV158Wciformedetalladohdrsproduccionds_26_tffase_sel = AV38TFFase_Sel ;
      AV159Wciformedetalladohdrsproduccionds_27_tffasedescripcion = AV125TFFaseDescripcion ;
      AV160Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel = AV126TFFaseDescripcion_Sel ;
      AV161Wciformedetalladohdrsproduccionds_29_tfhisprodti = AV40TFHisProDTI ;
      AV162Wciformedetalladohdrsproduccionds_30_tfhisprodtf = AV45TFHisProDTF ;
      AV163Wciformedetalladohdrsproduccionds_31_tfhisprokgr = AV79TFHisProKgr ;
      AV164Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to = AV80TFHisProKgr_To ;
      AV165Wciformedetalladohdrsproduccionds_33_tfhispromtr = AV82TFHisProMtr ;
      AV166Wciformedetalladohdrsproduccionds_34_tfhispromtr_to = AV83TFHisProMtr_To ;
      AV167Wciformedetalladohdrsproduccionds_35_tfparcod = AV92TFParCod ;
      AV168Wciformedetalladohdrsproduccionds_36_tfparcod_to = AV93TFParCod_To ;
      AV169Wciformedetalladohdrsproduccionds_37_tfparcodnom = AV98TFParCodNom ;
      AV170Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel = AV99TFParCodNom_Sel ;
      AV171Wciformedetalladohdrsproduccionds_39_tfhisprotur = AV95TFHisProTur ;
      AV172Wciformedetalladohdrsproduccionds_40_tfhisprotur_to = AV96TFHisProTur_To ;
      AV173Wciformedetalladohdrsproduccionds_41_tfhisproreo = AV107TFHisProReo ;
      AV174Wciformedetalladohdrsproduccionds_42_tfhisproreo_to = AV108TFHisProReo_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV9MaqCodInicial, AV8MaqCodFinal, AV7Hisprodti, AV6HisProdtf, AV105HisProReo, AV106ParCod, AV29ManageFiltersExecutionStep, AV24ColumnsSelector, AV103FilterFullText, AV31TFMaqCod, AV32TFMaqCod_Sel, AV59TFMaqDsc, AV60TFMaqDsc_Sel, AV34TFBarNHdr, AV35TFBarNHdr_Sel, AV101TFHisProLot, AV102TFHisProLot_Sel, AV62TFCliCod, AV63TFCliCod_To, AV65TFCliNom, AV66TFCliNom_Sel, AV121TFPedidoCliente, AV122TFPedidoCliente_Sel, AV68TFBarFecGen, AV73TFBarSer, AV74TFBarSer_Sel, AV76TFBarSerDsc, AV77TFBarSerDsc_Sel, AV117TFBarTipArtDsc, AV118TFBarTipArtDsc_Sel, AV119TFBarTipColDsc, AV120TFBarTipColDsc_Sel, AV37TFFase, AV38TFFase_Sel, AV125TFFaseDescripcion, AV126TFFaseDescripcion_Sel, AV40TFHisProDTI, AV45TFHisProDTF, AV79TFHisProKgr, AV80TFHisProKgr_To, AV82TFHisProMtr, AV83TFHisProMtr_To, AV92TFParCod, AV93TFParCod_To, AV98TFParCodNom, AV99TFParCodNom_Sel, AV95TFHisProTur, AV96TFHisProTur_To, AV107TFHisProReo, AV108TFHisProReo_To, AV175Pgmname, AV17OrderedBy, AV18OrderedDsc, AV84TotHisProKgr, AV86TotHisProMtr, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV133Wciformedetalladohdrsproduccionds_1_filterfulltext = AV103FilterFullText ;
      AV134Wciformedetalladohdrsproduccionds_2_tfmaqcod = AV31TFMaqCod ;
      AV135Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel = AV32TFMaqCod_Sel ;
      AV136Wciformedetalladohdrsproduccionds_4_tfmaqdsc = AV59TFMaqDsc ;
      AV137Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel = AV60TFMaqDsc_Sel ;
      AV138Wciformedetalladohdrsproduccionds_6_tfbarnhdr = AV34TFBarNHdr ;
      AV139Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel = AV35TFBarNHdr_Sel ;
      AV140Wciformedetalladohdrsproduccionds_8_tfhisprolot = AV101TFHisProLot ;
      AV141Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel = AV102TFHisProLot_Sel ;
      AV142Wciformedetalladohdrsproduccionds_10_tfclicod = AV62TFCliCod ;
      AV143Wciformedetalladohdrsproduccionds_11_tfclicod_to = AV63TFCliCod_To ;
      AV144Wciformedetalladohdrsproduccionds_12_tfclinom = AV65TFCliNom ;
      AV145Wciformedetalladohdrsproduccionds_13_tfclinom_sel = AV66TFCliNom_Sel ;
      AV146Wciformedetalladohdrsproduccionds_14_tfpedidocliente = AV121TFPedidoCliente ;
      AV147Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel = AV122TFPedidoCliente_Sel ;
      AV148Wciformedetalladohdrsproduccionds_16_tfbarfecgen = AV68TFBarFecGen ;
      AV149Wciformedetalladohdrsproduccionds_17_tfbarser = AV73TFBarSer ;
      AV150Wciformedetalladohdrsproduccionds_18_tfbarser_sel = AV74TFBarSer_Sel ;
      AV151Wciformedetalladohdrsproduccionds_19_tfbarserdsc = AV76TFBarSerDsc ;
      AV152Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel = AV77TFBarSerDsc_Sel ;
      AV153Wciformedetalladohdrsproduccionds_21_tfbartipartdsc = AV117TFBarTipArtDsc ;
      AV154Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel = AV118TFBarTipArtDsc_Sel ;
      AV155Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc = AV119TFBarTipColDsc ;
      AV156Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel = AV120TFBarTipColDsc_Sel ;
      AV157Wciformedetalladohdrsproduccionds_25_tffase = AV37TFFase ;
      AV158Wciformedetalladohdrsproduccionds_26_tffase_sel = AV38TFFase_Sel ;
      AV159Wciformedetalladohdrsproduccionds_27_tffasedescripcion = AV125TFFaseDescripcion ;
      AV160Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel = AV126TFFaseDescripcion_Sel ;
      AV161Wciformedetalladohdrsproduccionds_29_tfhisprodti = AV40TFHisProDTI ;
      AV162Wciformedetalladohdrsproduccionds_30_tfhisprodtf = AV45TFHisProDTF ;
      AV163Wciformedetalladohdrsproduccionds_31_tfhisprokgr = AV79TFHisProKgr ;
      AV164Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to = AV80TFHisProKgr_To ;
      AV165Wciformedetalladohdrsproduccionds_33_tfhispromtr = AV82TFHisProMtr ;
      AV166Wciformedetalladohdrsproduccionds_34_tfhispromtr_to = AV83TFHisProMtr_To ;
      AV167Wciformedetalladohdrsproduccionds_35_tfparcod = AV92TFParCod ;
      AV168Wciformedetalladohdrsproduccionds_36_tfparcod_to = AV93TFParCod_To ;
      AV169Wciformedetalladohdrsproduccionds_37_tfparcodnom = AV98TFParCodNom ;
      AV170Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel = AV99TFParCodNom_Sel ;
      AV171Wciformedetalladohdrsproduccionds_39_tfhisprotur = AV95TFHisProTur ;
      AV172Wciformedetalladohdrsproduccionds_40_tfhisprotur_to = AV96TFHisProTur_To ;
      AV173Wciformedetalladohdrsproduccionds_41_tfhisproreo = AV107TFHisProReo ;
      AV174Wciformedetalladohdrsproduccionds_42_tfhisproreo_to = AV108TFHisProReo_To ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV9MaqCodInicial, AV8MaqCodFinal, AV7Hisprodti, AV6HisProdtf, AV105HisProReo, AV106ParCod, AV29ManageFiltersExecutionStep, AV24ColumnsSelector, AV103FilterFullText, AV31TFMaqCod, AV32TFMaqCod_Sel, AV59TFMaqDsc, AV60TFMaqDsc_Sel, AV34TFBarNHdr, AV35TFBarNHdr_Sel, AV101TFHisProLot, AV102TFHisProLot_Sel, AV62TFCliCod, AV63TFCliCod_To, AV65TFCliNom, AV66TFCliNom_Sel, AV121TFPedidoCliente, AV122TFPedidoCliente_Sel, AV68TFBarFecGen, AV73TFBarSer, AV74TFBarSer_Sel, AV76TFBarSerDsc, AV77TFBarSerDsc_Sel, AV117TFBarTipArtDsc, AV118TFBarTipArtDsc_Sel, AV119TFBarTipColDsc, AV120TFBarTipColDsc_Sel, AV37TFFase, AV38TFFase_Sel, AV125TFFaseDescripcion, AV126TFFaseDescripcion_Sel, AV40TFHisProDTI, AV45TFHisProDTF, AV79TFHisProKgr, AV80TFHisProKgr_To, AV82TFHisProMtr, AV83TFHisProMtr_To, AV92TFParCod, AV93TFParCod_To, AV98TFParCodNom, AV99TFParCodNom_Sel, AV95TFHisProTur, AV96TFHisProTur_To, AV107TFHisProReo, AV108TFHisProReo_To, AV175Pgmname, AV17OrderedBy, AV18OrderedDsc, AV84TotHisProKgr, AV86TotHisProMtr, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV133Wciformedetalladohdrsproduccionds_1_filterfulltext = AV103FilterFullText ;
      AV134Wciformedetalladohdrsproduccionds_2_tfmaqcod = AV31TFMaqCod ;
      AV135Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel = AV32TFMaqCod_Sel ;
      AV136Wciformedetalladohdrsproduccionds_4_tfmaqdsc = AV59TFMaqDsc ;
      AV137Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel = AV60TFMaqDsc_Sel ;
      AV138Wciformedetalladohdrsproduccionds_6_tfbarnhdr = AV34TFBarNHdr ;
      AV139Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel = AV35TFBarNHdr_Sel ;
      AV140Wciformedetalladohdrsproduccionds_8_tfhisprolot = AV101TFHisProLot ;
      AV141Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel = AV102TFHisProLot_Sel ;
      AV142Wciformedetalladohdrsproduccionds_10_tfclicod = AV62TFCliCod ;
      AV143Wciformedetalladohdrsproduccionds_11_tfclicod_to = AV63TFCliCod_To ;
      AV144Wciformedetalladohdrsproduccionds_12_tfclinom = AV65TFCliNom ;
      AV145Wciformedetalladohdrsproduccionds_13_tfclinom_sel = AV66TFCliNom_Sel ;
      AV146Wciformedetalladohdrsproduccionds_14_tfpedidocliente = AV121TFPedidoCliente ;
      AV147Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel = AV122TFPedidoCliente_Sel ;
      AV148Wciformedetalladohdrsproduccionds_16_tfbarfecgen = AV68TFBarFecGen ;
      AV149Wciformedetalladohdrsproduccionds_17_tfbarser = AV73TFBarSer ;
      AV150Wciformedetalladohdrsproduccionds_18_tfbarser_sel = AV74TFBarSer_Sel ;
      AV151Wciformedetalladohdrsproduccionds_19_tfbarserdsc = AV76TFBarSerDsc ;
      AV152Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel = AV77TFBarSerDsc_Sel ;
      AV153Wciformedetalladohdrsproduccionds_21_tfbartipartdsc = AV117TFBarTipArtDsc ;
      AV154Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel = AV118TFBarTipArtDsc_Sel ;
      AV155Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc = AV119TFBarTipColDsc ;
      AV156Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel = AV120TFBarTipColDsc_Sel ;
      AV157Wciformedetalladohdrsproduccionds_25_tffase = AV37TFFase ;
      AV158Wciformedetalladohdrsproduccionds_26_tffase_sel = AV38TFFase_Sel ;
      AV159Wciformedetalladohdrsproduccionds_27_tffasedescripcion = AV125TFFaseDescripcion ;
      AV160Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel = AV126TFFaseDescripcion_Sel ;
      AV161Wciformedetalladohdrsproduccionds_29_tfhisprodti = AV40TFHisProDTI ;
      AV162Wciformedetalladohdrsproduccionds_30_tfhisprodtf = AV45TFHisProDTF ;
      AV163Wciformedetalladohdrsproduccionds_31_tfhisprokgr = AV79TFHisProKgr ;
      AV164Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to = AV80TFHisProKgr_To ;
      AV165Wciformedetalladohdrsproduccionds_33_tfhispromtr = AV82TFHisProMtr ;
      AV166Wciformedetalladohdrsproduccionds_34_tfhispromtr_to = AV83TFHisProMtr_To ;
      AV167Wciformedetalladohdrsproduccionds_35_tfparcod = AV92TFParCod ;
      AV168Wciformedetalladohdrsproduccionds_36_tfparcod_to = AV93TFParCod_To ;
      AV169Wciformedetalladohdrsproduccionds_37_tfparcodnom = AV98TFParCodNom ;
      AV170Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel = AV99TFParCodNom_Sel ;
      AV171Wciformedetalladohdrsproduccionds_39_tfhisprotur = AV95TFHisProTur ;
      AV172Wciformedetalladohdrsproduccionds_40_tfhisprotur_to = AV96TFHisProTur_To ;
      AV173Wciformedetalladohdrsproduccionds_41_tfhisproreo = AV107TFHisProReo ;
      AV174Wciformedetalladohdrsproduccionds_42_tfhisproreo_to = AV108TFHisProReo_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV9MaqCodInicial, AV8MaqCodFinal, AV7Hisprodti, AV6HisProdtf, AV105HisProReo, AV106ParCod, AV29ManageFiltersExecutionStep, AV24ColumnsSelector, AV103FilterFullText, AV31TFMaqCod, AV32TFMaqCod_Sel, AV59TFMaqDsc, AV60TFMaqDsc_Sel, AV34TFBarNHdr, AV35TFBarNHdr_Sel, AV101TFHisProLot, AV102TFHisProLot_Sel, AV62TFCliCod, AV63TFCliCod_To, AV65TFCliNom, AV66TFCliNom_Sel, AV121TFPedidoCliente, AV122TFPedidoCliente_Sel, AV68TFBarFecGen, AV73TFBarSer, AV74TFBarSer_Sel, AV76TFBarSerDsc, AV77TFBarSerDsc_Sel, AV117TFBarTipArtDsc, AV118TFBarTipArtDsc_Sel, AV119TFBarTipColDsc, AV120TFBarTipColDsc_Sel, AV37TFFase, AV38TFFase_Sel, AV125TFFaseDescripcion, AV126TFFaseDescripcion_Sel, AV40TFHisProDTI, AV45TFHisProDTF, AV79TFHisProKgr, AV80TFHisProKgr_To, AV82TFHisProMtr, AV83TFHisProMtr_To, AV92TFParCod, AV93TFParCod_To, AV98TFParCodNom, AV99TFParCodNom_Sel, AV95TFHisProTur, AV96TFHisProTur_To, AV107TFHisProReo, AV108TFHisProReo_To, AV175Pgmname, AV17OrderedBy, AV18OrderedDsc, AV84TotHisProKgr, AV86TotHisProMtr, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV133Wciformedetalladohdrsproduccionds_1_filterfulltext = AV103FilterFullText ;
      AV134Wciformedetalladohdrsproduccionds_2_tfmaqcod = AV31TFMaqCod ;
      AV135Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel = AV32TFMaqCod_Sel ;
      AV136Wciformedetalladohdrsproduccionds_4_tfmaqdsc = AV59TFMaqDsc ;
      AV137Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel = AV60TFMaqDsc_Sel ;
      AV138Wciformedetalladohdrsproduccionds_6_tfbarnhdr = AV34TFBarNHdr ;
      AV139Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel = AV35TFBarNHdr_Sel ;
      AV140Wciformedetalladohdrsproduccionds_8_tfhisprolot = AV101TFHisProLot ;
      AV141Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel = AV102TFHisProLot_Sel ;
      AV142Wciformedetalladohdrsproduccionds_10_tfclicod = AV62TFCliCod ;
      AV143Wciformedetalladohdrsproduccionds_11_tfclicod_to = AV63TFCliCod_To ;
      AV144Wciformedetalladohdrsproduccionds_12_tfclinom = AV65TFCliNom ;
      AV145Wciformedetalladohdrsproduccionds_13_tfclinom_sel = AV66TFCliNom_Sel ;
      AV146Wciformedetalladohdrsproduccionds_14_tfpedidocliente = AV121TFPedidoCliente ;
      AV147Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel = AV122TFPedidoCliente_Sel ;
      AV148Wciformedetalladohdrsproduccionds_16_tfbarfecgen = AV68TFBarFecGen ;
      AV149Wciformedetalladohdrsproduccionds_17_tfbarser = AV73TFBarSer ;
      AV150Wciformedetalladohdrsproduccionds_18_tfbarser_sel = AV74TFBarSer_Sel ;
      AV151Wciformedetalladohdrsproduccionds_19_tfbarserdsc = AV76TFBarSerDsc ;
      AV152Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel = AV77TFBarSerDsc_Sel ;
      AV153Wciformedetalladohdrsproduccionds_21_tfbartipartdsc = AV117TFBarTipArtDsc ;
      AV154Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel = AV118TFBarTipArtDsc_Sel ;
      AV155Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc = AV119TFBarTipColDsc ;
      AV156Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel = AV120TFBarTipColDsc_Sel ;
      AV157Wciformedetalladohdrsproduccionds_25_tffase = AV37TFFase ;
      AV158Wciformedetalladohdrsproduccionds_26_tffase_sel = AV38TFFase_Sel ;
      AV159Wciformedetalladohdrsproduccionds_27_tffasedescripcion = AV125TFFaseDescripcion ;
      AV160Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel = AV126TFFaseDescripcion_Sel ;
      AV161Wciformedetalladohdrsproduccionds_29_tfhisprodti = AV40TFHisProDTI ;
      AV162Wciformedetalladohdrsproduccionds_30_tfhisprodtf = AV45TFHisProDTF ;
      AV163Wciformedetalladohdrsproduccionds_31_tfhisprokgr = AV79TFHisProKgr ;
      AV164Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to = AV80TFHisProKgr_To ;
      AV165Wciformedetalladohdrsproduccionds_33_tfhispromtr = AV82TFHisProMtr ;
      AV166Wciformedetalladohdrsproduccionds_34_tfhispromtr_to = AV83TFHisProMtr_To ;
      AV167Wciformedetalladohdrsproduccionds_35_tfparcod = AV92TFParCod ;
      AV168Wciformedetalladohdrsproduccionds_36_tfparcod_to = AV93TFParCod_To ;
      AV169Wciformedetalladohdrsproduccionds_37_tfparcodnom = AV98TFParCodNom ;
      AV170Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel = AV99TFParCodNom_Sel ;
      AV171Wciformedetalladohdrsproduccionds_39_tfhisprotur = AV95TFHisProTur ;
      AV172Wciformedetalladohdrsproduccionds_40_tfhisprotur_to = AV96TFHisProTur_To ;
      AV173Wciformedetalladohdrsproduccionds_41_tfhisproreo = AV107TFHisProReo ;
      AV174Wciformedetalladohdrsproduccionds_42_tfhisproreo_to = AV108TFHisProReo_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV9MaqCodInicial, AV8MaqCodFinal, AV7Hisprodti, AV6HisProdtf, AV105HisProReo, AV106ParCod, AV29ManageFiltersExecutionStep, AV24ColumnsSelector, AV103FilterFullText, AV31TFMaqCod, AV32TFMaqCod_Sel, AV59TFMaqDsc, AV60TFMaqDsc_Sel, AV34TFBarNHdr, AV35TFBarNHdr_Sel, AV101TFHisProLot, AV102TFHisProLot_Sel, AV62TFCliCod, AV63TFCliCod_To, AV65TFCliNom, AV66TFCliNom_Sel, AV121TFPedidoCliente, AV122TFPedidoCliente_Sel, AV68TFBarFecGen, AV73TFBarSer, AV74TFBarSer_Sel, AV76TFBarSerDsc, AV77TFBarSerDsc_Sel, AV117TFBarTipArtDsc, AV118TFBarTipArtDsc_Sel, AV119TFBarTipColDsc, AV120TFBarTipColDsc_Sel, AV37TFFase, AV38TFFase_Sel, AV125TFFaseDescripcion, AV126TFFaseDescripcion_Sel, AV40TFHisProDTI, AV45TFHisProDTF, AV79TFHisProKgr, AV80TFHisProKgr_To, AV82TFHisProMtr, AV83TFHisProMtr_To, AV92TFParCod, AV93TFParCod_To, AV98TFParCodNom, AV99TFParCodNom_Sel, AV95TFHisProTur, AV96TFHisProTur_To, AV107TFHisProReo, AV108TFHisProReo_To, AV175Pgmname, AV17OrderedBy, AV18OrderedDsc, AV84TotHisProKgr, AV86TotHisProMtr, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV133Wciformedetalladohdrsproduccionds_1_filterfulltext = AV103FilterFullText ;
      AV134Wciformedetalladohdrsproduccionds_2_tfmaqcod = AV31TFMaqCod ;
      AV135Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel = AV32TFMaqCod_Sel ;
      AV136Wciformedetalladohdrsproduccionds_4_tfmaqdsc = AV59TFMaqDsc ;
      AV137Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel = AV60TFMaqDsc_Sel ;
      AV138Wciformedetalladohdrsproduccionds_6_tfbarnhdr = AV34TFBarNHdr ;
      AV139Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel = AV35TFBarNHdr_Sel ;
      AV140Wciformedetalladohdrsproduccionds_8_tfhisprolot = AV101TFHisProLot ;
      AV141Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel = AV102TFHisProLot_Sel ;
      AV142Wciformedetalladohdrsproduccionds_10_tfclicod = AV62TFCliCod ;
      AV143Wciformedetalladohdrsproduccionds_11_tfclicod_to = AV63TFCliCod_To ;
      AV144Wciformedetalladohdrsproduccionds_12_tfclinom = AV65TFCliNom ;
      AV145Wciformedetalladohdrsproduccionds_13_tfclinom_sel = AV66TFCliNom_Sel ;
      AV146Wciformedetalladohdrsproduccionds_14_tfpedidocliente = AV121TFPedidoCliente ;
      AV147Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel = AV122TFPedidoCliente_Sel ;
      AV148Wciformedetalladohdrsproduccionds_16_tfbarfecgen = AV68TFBarFecGen ;
      AV149Wciformedetalladohdrsproduccionds_17_tfbarser = AV73TFBarSer ;
      AV150Wciformedetalladohdrsproduccionds_18_tfbarser_sel = AV74TFBarSer_Sel ;
      AV151Wciformedetalladohdrsproduccionds_19_tfbarserdsc = AV76TFBarSerDsc ;
      AV152Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel = AV77TFBarSerDsc_Sel ;
      AV153Wciformedetalladohdrsproduccionds_21_tfbartipartdsc = AV117TFBarTipArtDsc ;
      AV154Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel = AV118TFBarTipArtDsc_Sel ;
      AV155Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc = AV119TFBarTipColDsc ;
      AV156Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel = AV120TFBarTipColDsc_Sel ;
      AV157Wciformedetalladohdrsproduccionds_25_tffase = AV37TFFase ;
      AV158Wciformedetalladohdrsproduccionds_26_tffase_sel = AV38TFFase_Sel ;
      AV159Wciformedetalladohdrsproduccionds_27_tffasedescripcion = AV125TFFaseDescripcion ;
      AV160Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel = AV126TFFaseDescripcion_Sel ;
      AV161Wciformedetalladohdrsproduccionds_29_tfhisprodti = AV40TFHisProDTI ;
      AV162Wciformedetalladohdrsproduccionds_30_tfhisprodtf = AV45TFHisProDTF ;
      AV163Wciformedetalladohdrsproduccionds_31_tfhisprokgr = AV79TFHisProKgr ;
      AV164Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to = AV80TFHisProKgr_To ;
      AV165Wciformedetalladohdrsproduccionds_33_tfhispromtr = AV82TFHisProMtr ;
      AV166Wciformedetalladohdrsproduccionds_34_tfhispromtr_to = AV83TFHisProMtr_To ;
      AV167Wciformedetalladohdrsproduccionds_35_tfparcod = AV92TFParCod ;
      AV168Wciformedetalladohdrsproduccionds_36_tfparcod_to = AV93TFParCod_To ;
      AV169Wciformedetalladohdrsproduccionds_37_tfparcodnom = AV98TFParCodNom ;
      AV170Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel = AV99TFParCodNom_Sel ;
      AV171Wciformedetalladohdrsproduccionds_39_tfhisprotur = AV95TFHisProTur ;
      AV172Wciformedetalladohdrsproduccionds_40_tfhisprotur_to = AV96TFHisProTur_To ;
      AV173Wciformedetalladohdrsproduccionds_41_tfhisproreo = AV107TFHisProReo ;
      AV174Wciformedetalladohdrsproduccionds_42_tfhisproreo_to = AV108TFHisProReo_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV9MaqCodInicial, AV8MaqCodFinal, AV7Hisprodti, AV6HisProdtf, AV105HisProReo, AV106ParCod, AV29ManageFiltersExecutionStep, AV24ColumnsSelector, AV103FilterFullText, AV31TFMaqCod, AV32TFMaqCod_Sel, AV59TFMaqDsc, AV60TFMaqDsc_Sel, AV34TFBarNHdr, AV35TFBarNHdr_Sel, AV101TFHisProLot, AV102TFHisProLot_Sel, AV62TFCliCod, AV63TFCliCod_To, AV65TFCliNom, AV66TFCliNom_Sel, AV121TFPedidoCliente, AV122TFPedidoCliente_Sel, AV68TFBarFecGen, AV73TFBarSer, AV74TFBarSer_Sel, AV76TFBarSerDsc, AV77TFBarSerDsc_Sel, AV117TFBarTipArtDsc, AV118TFBarTipArtDsc_Sel, AV119TFBarTipColDsc, AV120TFBarTipColDsc_Sel, AV37TFFase, AV38TFFase_Sel, AV125TFFaseDescripcion, AV126TFFaseDescripcion_Sel, AV40TFHisProDTI, AV45TFHisProDTF, AV79TFHisProKgr, AV80TFHisProKgr_To, AV82TFHisProMtr, AV83TFHisProMtr_To, AV92TFParCod, AV93TFParCod_To, AV98TFParCodNom, AV99TFParCodNom_Sel, AV95TFHisProTur, AV96TFHisProTur_To, AV107TFHisProReo, AV108TFHisProReo_To, AV175Pgmname, AV17OrderedBy, AV18OrderedDsc, AV84TotHisProKgr, AV86TotHisProMtr, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV175Pgmname = "WCIformedetalladoHdrsProduccion" ;
      Gx_err = (short)(0) ;
      edtavTinte_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTinte_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTinte_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavTiempom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTiempom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTiempom_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavTotvaluehisprokgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluehisprokgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluehisprokgr_Enabled), 5, 0), true);
      edtavTotvaluehispromtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluehispromtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluehispromtr_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strupTI0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e18TI2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV27ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV50DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV24ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_41 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_41"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV52GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV53GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV5Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV5Emprcod") ;
         wcpOAV9MaqCodInicial = httpContext.cgiGet( sPrefix+"wcpOAV9MaqCodInicial") ;
         wcpOAV8MaqCodFinal = httpContext.cgiGet( sPrefix+"wcpOAV8MaqCodFinal") ;
         wcpOAV7Hisprodti = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV7Hisprodti"), 0) ;
         wcpOAV6HisProdtf = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV6HisProdtf"), 0) ;
         wcpOAV105HisProReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV105HisProReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV106ParCod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV106ParCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         AV103FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV103FilterFullText", AV103FilterFullText);
         AV85TotValueHisProKgr = httpContext.cgiGet( edtavTotvaluehisprokgr_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85TotValueHisProKgr", AV85TotValueHisProKgr);
         AV87TotValueHisProMtr = httpContext.cgiGet( edtavTotvaluehispromtr_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV87TotValueHisProMtr", AV87TotValueHisProMtr);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_barfecgenauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_BARFECGENAUXDATE");
            GX_FocusControl = edtavDdo_barfecgenauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV70DDO_BarFecGenAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70DDO_BarFecGenAuxDate", localUtil.format(AV70DDO_BarFecGenAuxDate, "99/99/99"));
         }
         else
         {
            AV70DDO_BarFecGenAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_barfecgenauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70DDO_BarFecGenAuxDate", localUtil.format(AV70DDO_BarFecGenAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_hisprodtiauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_HISPRODTIAUXDATE");
            GX_FocusControl = edtavDdo_hisprodtiauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV42DDO_HisProDTIAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42DDO_HisProDTIAuxDate", localUtil.format(AV42DDO_HisProDTIAuxDate, "99/99/99"));
         }
         else
         {
            AV42DDO_HisProDTIAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_hisprodtiauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42DDO_HisProDTIAuxDate", localUtil.format(AV42DDO_HisProDTIAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_hisprodtfauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_HISPRODTFAUXDATE");
            GX_FocusControl = edtavDdo_hisprodtfauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV47DDO_HisProDTFAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47DDO_HisProDTFAuxDate", localUtil.format(AV47DDO_HisProDTFAuxDate, "99/99/99"));
         }
         else
         {
            AV47DDO_HisProDTFAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_hisprodtfauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47DDO_HisProDTFAuxDate", localUtil.format(AV47DDO_HisProDTFAuxDate, "99/99/99"));
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
      e18TI2 ();
      if (returnInSub) return;
   }

   public void e18TI2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV130Station ;
      GXv_char5[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char5) ;
      wciformedetalladohdrsproduccion_impl.this.GXt_char1 = GXv_char5[0] ;
      AV130Station = GXt_char1 ;
      GXv_char5[0] = AV5Emprcod ;
      GXv_char4[0] = AV131Emprnom ;
      GXv_char3[0] = AV132Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV130Station, GXv_char5, GXv_char4, GXv_char3) ;
      wciformedetalladohdrsproduccion_impl.this.AV5Emprcod = GXv_char5[0] ;
      wciformedetalladohdrsproduccion_impl.this.AV131Emprnom = GXv_char4[0] ;
      wciformedetalladohdrsproduccion_impl.this.AV132Usurcod = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
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
      if ( AV17OrderedBy < 1 )
      {
         AV17OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = AV50DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] ;
      AV50DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e19TI2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext9[0] = AV11WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV11WWPContext = GXv_SdtWWPContext9[0] ;
      if ( AV29ManageFiltersExecutionStep == 1 )
      {
         AV29ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29ManageFiltersExecutionStep", GXutil.str( AV29ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV29ManageFiltersExecutionStep == 2 )
      {
         AV29ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29ManageFiltersExecutionStep", GXutil.str( AV29ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV26Session.getValue("WCIformedetalladoHdrsProduccionColumnsSelector"), "") != 0 )
      {
         AV22ColumnsSelectorXML = AV26Session.getValue("WCIformedetalladoHdrsProduccionColumnsSelector") ;
         AV24ColumnsSelector.fromxml(AV22ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtMaqCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMaqCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtMaqDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMaqDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqDsc_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarNHdr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarNHdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNHdr_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtHisProLot_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisProLot_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProLot_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtCliCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtCliNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtPedidoClie_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPedidoClie_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedidoClie_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarFecGen_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarFecGen_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecGen_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarSer_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarSer_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarSerDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarSerDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSerDsc_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarTipArtD_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarTipArtD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipArtD_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarTipColD_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarTipColD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipColD_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtFase_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFase_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFase_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtFaseDescri_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFaseDescri_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFaseDescri_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtHisProDTI_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisProDTI_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProDTI_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtHisProDTF_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisProDTF_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProDTF_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtHisProKgr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisProKgr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProKgr_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtHisProMtr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisProMtr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProMtr_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtParCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtParCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParCod_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtParCodNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtParCodNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParCodNom_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtHisProTur_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisProTur_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProTur_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavTiempom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTiempom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTiempom_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtHisProReo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisProReo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProReo_Visible), 5, 0), !bGXsfl_41_Refreshing);
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S172 ();
      if (returnInSub) return;
      AV52GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52GridCurrentPage), 10, 0));
      AV53GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53GridPageCount), 10, 0));
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S182 ();
      if (returnInSub) return;
      AV133Wciformedetalladohdrsproduccionds_1_filterfulltext = AV103FilterFullText ;
      AV134Wciformedetalladohdrsproduccionds_2_tfmaqcod = AV31TFMaqCod ;
      AV135Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel = AV32TFMaqCod_Sel ;
      AV136Wciformedetalladohdrsproduccionds_4_tfmaqdsc = AV59TFMaqDsc ;
      AV137Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel = AV60TFMaqDsc_Sel ;
      AV138Wciformedetalladohdrsproduccionds_6_tfbarnhdr = AV34TFBarNHdr ;
      AV139Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel = AV35TFBarNHdr_Sel ;
      AV140Wciformedetalladohdrsproduccionds_8_tfhisprolot = AV101TFHisProLot ;
      AV141Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel = AV102TFHisProLot_Sel ;
      AV142Wciformedetalladohdrsproduccionds_10_tfclicod = AV62TFCliCod ;
      AV143Wciformedetalladohdrsproduccionds_11_tfclicod_to = AV63TFCliCod_To ;
      AV144Wciformedetalladohdrsproduccionds_12_tfclinom = AV65TFCliNom ;
      AV145Wciformedetalladohdrsproduccionds_13_tfclinom_sel = AV66TFCliNom_Sel ;
      AV146Wciformedetalladohdrsproduccionds_14_tfpedidocliente = AV121TFPedidoCliente ;
      AV147Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel = AV122TFPedidoCliente_Sel ;
      AV148Wciformedetalladohdrsproduccionds_16_tfbarfecgen = AV68TFBarFecGen ;
      AV149Wciformedetalladohdrsproduccionds_17_tfbarser = AV73TFBarSer ;
      AV150Wciformedetalladohdrsproduccionds_18_tfbarser_sel = AV74TFBarSer_Sel ;
      AV151Wciformedetalladohdrsproduccionds_19_tfbarserdsc = AV76TFBarSerDsc ;
      AV152Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel = AV77TFBarSerDsc_Sel ;
      AV153Wciformedetalladohdrsproduccionds_21_tfbartipartdsc = AV117TFBarTipArtDsc ;
      AV154Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel = AV118TFBarTipArtDsc_Sel ;
      AV155Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc = AV119TFBarTipColDsc ;
      AV156Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel = AV120TFBarTipColDsc_Sel ;
      AV157Wciformedetalladohdrsproduccionds_25_tffase = AV37TFFase ;
      AV158Wciformedetalladohdrsproduccionds_26_tffase_sel = AV38TFFase_Sel ;
      AV159Wciformedetalladohdrsproduccionds_27_tffasedescripcion = AV125TFFaseDescripcion ;
      AV160Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel = AV126TFFaseDescripcion_Sel ;
      AV161Wciformedetalladohdrsproduccionds_29_tfhisprodti = AV40TFHisProDTI ;
      AV162Wciformedetalladohdrsproduccionds_30_tfhisprodtf = AV45TFHisProDTF ;
      AV163Wciformedetalladohdrsproduccionds_31_tfhisprokgr = AV79TFHisProKgr ;
      AV164Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to = AV80TFHisProKgr_To ;
      AV165Wciformedetalladohdrsproduccionds_33_tfhispromtr = AV82TFHisProMtr ;
      AV166Wciformedetalladohdrsproduccionds_34_tfhispromtr_to = AV83TFHisProMtr_To ;
      AV167Wciformedetalladohdrsproduccionds_35_tfparcod = AV92TFParCod ;
      AV168Wciformedetalladohdrsproduccionds_36_tfparcod_to = AV93TFParCod_To ;
      AV169Wciformedetalladohdrsproduccionds_37_tfparcodnom = AV98TFParCodNom ;
      AV170Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel = AV99TFParCodNom_Sel ;
      AV171Wciformedetalladohdrsproduccionds_39_tfhisprotur = AV95TFHisProTur ;
      AV172Wciformedetalladohdrsproduccionds_40_tfhisprotur_to = AV96TFHisProTur_To ;
      AV173Wciformedetalladohdrsproduccionds_41_tfhisproreo = AV107TFHisProReo ;
      AV174Wciformedetalladohdrsproduccionds_42_tfhisproreo_to = AV108TFHisProReo_To ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV24ColumnsSelector", AV24ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV27ManageFiltersData", AV27ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV15GridState", AV15GridState);
   }

   public void e12TI2( )
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

   public void e13TI2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e14TI2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV17OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17OrderedBy), 4, 0));
         AV18OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18OrderedDsc", AV18OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MaqCod") == 0 )
         {
            AV31TFMaqCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFMaqCod", AV31TFMaqCod);
            AV32TFMaqCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFMaqCod_Sel", AV32TFMaqCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MaqDsc") == 0 )
         {
            AV59TFMaqDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFMaqDsc", AV59TFMaqDsc);
            AV60TFMaqDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFMaqDsc_Sel", AV60TFMaqDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarNHdr") == 0 )
         {
            AV34TFBarNHdr = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFBarNHdr", AV34TFBarNHdr);
            AV35TFBarNHdr_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFBarNHdr_Sel", AV35TFBarNHdr_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProLot") == 0 )
         {
            AV101TFHisProLot = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV101TFHisProLot", AV101TFHisProLot);
            AV102TFHisProLot_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV102TFHisProLot_Sel", AV102TFHisProLot_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliCod") == 0 )
         {
            AV62TFCliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62TFCliCod), 6, 0));
            AV63TFCliCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliNom") == 0 )
         {
            AV65TFCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFCliNom", AV65TFCliNom);
            AV66TFCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFCliNom_Sel", AV66TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PedidoCliente") == 0 )
         {
            AV121TFPedidoCliente = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV121TFPedidoCliente", AV121TFPedidoCliente);
            AV122TFPedidoCliente_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV122TFPedidoCliente_Sel", AV122TFPedidoCliente_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFecGen") == 0 )
         {
            AV68TFBarFecGen = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TFBarFecGen", localUtil.format(AV68TFBarFecGen, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSer") == 0 )
         {
            AV73TFBarSer = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73TFBarSer", AV73TFBarSer);
            AV74TFBarSer_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74TFBarSer_Sel", AV74TFBarSer_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSerDsc") == 0 )
         {
            AV76TFBarSerDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76TFBarSerDsc", AV76TFBarSerDsc);
            AV77TFBarSerDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77TFBarSerDsc_Sel", AV77TFBarSerDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarTipArtDsc") == 0 )
         {
            AV117TFBarTipArtDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV117TFBarTipArtDsc", AV117TFBarTipArtDsc);
            AV118TFBarTipArtDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV118TFBarTipArtDsc_Sel", AV118TFBarTipArtDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarTipColDsc") == 0 )
         {
            AV119TFBarTipColDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV119TFBarTipColDsc", AV119TFBarTipColDsc);
            AV120TFBarTipColDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV120TFBarTipColDsc_Sel", AV120TFBarTipColDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Fase") == 0 )
         {
            AV37TFFase = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFFase", AV37TFFase);
            AV38TFFase_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFFase_Sel", AV38TFFase_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FaseDescripcion") == 0 )
         {
            AV125TFFaseDescripcion = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV125TFFaseDescripcion", AV125TFFaseDescripcion);
            AV126TFFaseDescripcion_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV126TFFaseDescripcion_Sel", AV126TFFaseDescripcion_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProDTI") == 0 )
         {
            AV40TFHisProDTI = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFHisProDTI", localUtil.ttoc( AV40TFHisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProDTF") == 0 )
         {
            AV45TFHisProDTF = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFHisProDTF", localUtil.ttoc( AV45TFHisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProKgr") == 0 )
         {
            AV79TFHisProKgr = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV79TFHisProKgr", GXutil.ltrimstr( AV79TFHisProKgr, 9, 2));
            AV80TFHisProKgr_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80TFHisProKgr_To", GXutil.ltrimstr( AV80TFHisProKgr_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProMtr") == 0 )
         {
            AV82TFHisProMtr = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82TFHisProMtr", GXutil.ltrimstr( AV82TFHisProMtr, 9, 2));
            AV83TFHisProMtr_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83TFHisProMtr_To", GXutil.ltrimstr( AV83TFHisProMtr_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ParCod") == 0 )
         {
            AV92TFParCod = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92TFParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV92TFParCod), 4, 0));
            AV93TFParCod_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV93TFParCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV93TFParCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ParCodNom") == 0 )
         {
            AV98TFParCodNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV98TFParCodNom", AV98TFParCodNom);
            AV99TFParCodNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV99TFParCodNom_Sel", AV99TFParCodNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProTur") == 0 )
         {
            AV95TFHisProTur = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95TFHisProTur", GXutil.str( AV95TFHisProTur, 1, 0));
            AV96TFHisProTur_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV96TFHisProTur_To", GXutil.str( AV96TFHisProTur_To, 1, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProReo") == 0 )
         {
            AV107TFHisProReo = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV107TFHisProReo", GXutil.str( AV107TFHisProReo, 1, 0));
            AV108TFHisProReo_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV108TFHisProReo_To", GXutil.str( AV108TFHisProReo_To, 1, 0));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e20TI2( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         edtParCodNom_Link = formatLink("app.tcodparview", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A656ParCod,4,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","ParCod","TabCode"})  ;
         GXt_char1 = AV90Tinte ;
         GXv_char5[0] = A396EmprCod ;
         GXv_char4[0] = A461Fase ;
         GXv_char3[0] = GXt_char1 ;
         new app.fasetinte(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_char3) ;
         wciformedetalladohdrsproduccion_impl.this.A396EmprCod = GXv_char5[0] ;
         wciformedetalladohdrsproduccion_impl.this.A461Fase = GXv_char4[0] ;
         wciformedetalladohdrsproduccion_impl.this.GXt_char1 = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         AV90Tinte = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTinte_Internalname, AV90Tinte);
         GXt_int10 = AV88Tiempom ;
         GXv_char5[0] = A461Fase ;
         GXv_char4[0] = A3610HisProLot ;
         GXv_int11[0] = A129BarCod ;
         GXv_int6[0] = A132BarCodReo ;
         GXv_char3[0] = A130BarCodPar ;
         GXv_int12[0] = A5605HisProTr2 ;
         GXv_int13[0] = GXt_int10 ;
         new app.tiemporeallector(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_int11, GXv_int6, GXv_char3, GXv_int12, GXv_int13) ;
         wciformedetalladohdrsproduccion_impl.this.A461Fase = GXv_char5[0] ;
         wciformedetalladohdrsproduccion_impl.this.A3610HisProLot = GXv_char4[0] ;
         wciformedetalladohdrsproduccion_impl.this.A129BarCod = GXv_int11[0] ;
         wciformedetalladohdrsproduccion_impl.this.A132BarCodReo = GXv_int6[0] ;
         wciformedetalladohdrsproduccion_impl.this.A130BarCodPar = GXv_char3[0] ;
         wciformedetalladohdrsproduccion_impl.this.A5605HisProTr2 = GXv_int12[0] ;
         wciformedetalladohdrsproduccion_impl.this.GXt_int10 = GXv_int13[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A130BarCodPar", A130BarCodPar);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5605HisProTr2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5605HisProTr2), 4, 0));
         AV88Tiempom = GXt_int10 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTiempom_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV88Tiempom), 4, 0));
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
   }

   public void e15TI2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV22ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV24ColumnsSelector.fromJSonString(AV22ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "WCIformedetalladoHdrsProduccionColumnsSelector", ((GXutil.strcmp("", AV22ColumnsSelectorXML)==0) ? "" : AV24ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV24ColumnsSelector", AV24ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV27ManageFiltersData", AV27ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV15GridState", AV15GridState);
   }

   public void e11TI2( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S192 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S152 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("WCIformedetalladoHdrsProduccionFilters")),GXutil.URLEncode(GXutil.rtrim(AV175Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV29ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29ManageFiltersExecutionStep", GXutil.str( AV29ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("WCIformedetalladoHdrsProduccionFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV29ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29ManageFiltersExecutionStep", GXutil.str( AV29ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV28ManageFiltersXml ;
         GXv_char5[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "WCIformedetalladoHdrsProduccionFilters", Ddo_managefilters_Activeeventkey, GXv_char5) ;
         wciformedetalladohdrsproduccion_impl.this.GXt_char1 = GXv_char5[0] ;
         AV28ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV28ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S192 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV175Pgmname+"GridState", AV28ManageFiltersXml) ;
            AV15GridState.fromxml(AV28ManageFiltersXml, null, null);
            AV17OrderedBy = AV15GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17OrderedBy), 4, 0));
            AV18OrderedDsc = AV15GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18OrderedDsc", AV18OrderedDsc);
            /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
            S142 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S202 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefreshCmp(sPrefix);
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV15GridState", AV15GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV24ColumnsSelector", AV24ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV27ManageFiltersData", AV27ManageFiltersData);
   }

   public void e16TI2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char5[0] = AV20ExcelFilename ;
      GXv_char4[0] = AV21ErrorMessage ;
      new app.wciformedetalladohdrsproduccionexport(remoteHandle, context).execute( GXv_char5, GXv_char4) ;
      wciformedetalladohdrsproduccion_impl.this.AV20ExcelFilename = GXv_char5[0] ;
      wciformedetalladohdrsproduccion_impl.this.AV21ErrorMessage = GXv_char4[0] ;
      if ( GXutil.strcmp(AV20ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV20ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV21ErrorMessage);
      }
   }

   public void e17TI2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.wciformedetalladohdrsproduccionexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV17OrderedBy, 4, 0))+":"+(AV18OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV24ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector14[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "MaqCod", "", "Código Máquina", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "MaqDsc", "", "Descripcion Maquina", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarNHdr", "", "N Hdr", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "HisProLot", "", "Lote", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "CliCod", "", "Cliente", false, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "CliNom", "", "Nombre Cliente", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "PedidoCliente", "", "Pedido Cliente", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarFecGen", "", "Fecha Hdr", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarSer", "", "Serie", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarSerDsc", "", "Descripción Serie", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarTipArtDsc", "", "Tipo Articulo", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarTipColDsc", "", "TC", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "Fase", "", "Codigo Fase", false, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "FaseDescripcion", "", "Fase", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "HisProDTI", "", "Inicio", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "HisProDTF", "", "Fin", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "HisProKgr", "", "Kilos", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "HisProMtr", "", "Metros", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "ParCod", "", "Paro", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "ParCodNom", "", "Descripcion", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "HisProTur", "", "T", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&Tiempom", "", "TReal", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "HisProReo", "", "Tipo Reoperado", false, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXt_char1 = AV23UserCustomValue ;
      GXv_char5[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCIformedetalladoHdrsProduccionColumnsSelector", GXv_char5) ;
      wciformedetalladohdrsproduccion_impl.this.GXt_char1 = GXv_char5[0] ;
      AV23UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV23UserCustomValue)==0) ) )
      {
         AV25ColumnsSelectorAux.fromxml(AV23UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector14[0] = AV25ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector15[0] = AV24ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, GXv_SdtWWPColumnsSelector15) ;
         AV25ColumnsSelectorAux = GXv_SdtWWPColumnsSelector14[0] ;
         AV24ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item16 = AV27ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item17[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item16 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "WCIformedetalladoHdrsProduccionFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item17) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item16 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item17[0] ;
      AV27ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item16 ;
   }

   public void S192( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV103FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV103FilterFullText", AV103FilterFullText);
      AV31TFMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFMaqCod", AV31TFMaqCod);
      AV32TFMaqCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFMaqCod_Sel", AV32TFMaqCod_Sel);
      AV59TFMaqDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFMaqDsc", AV59TFMaqDsc);
      AV60TFMaqDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFMaqDsc_Sel", AV60TFMaqDsc_Sel);
      AV34TFBarNHdr = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFBarNHdr", AV34TFBarNHdr);
      AV35TFBarNHdr_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFBarNHdr_Sel", AV35TFBarNHdr_Sel);
      AV101TFHisProLot = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV101TFHisProLot", AV101TFHisProLot);
      AV102TFHisProLot_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV102TFHisProLot_Sel", AV102TFHisProLot_Sel);
      AV62TFCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62TFCliCod), 6, 0));
      AV63TFCliCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63TFCliCod_To), 6, 0));
      AV65TFCliNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFCliNom", AV65TFCliNom);
      AV66TFCliNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFCliNom_Sel", AV66TFCliNom_Sel);
      AV121TFPedidoCliente = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV121TFPedidoCliente", AV121TFPedidoCliente);
      AV122TFPedidoCliente_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV122TFPedidoCliente_Sel", AV122TFPedidoCliente_Sel);
      AV68TFBarFecGen = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TFBarFecGen", localUtil.format(AV68TFBarFecGen, "99/99/99"));
      AV73TFBarSer = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73TFBarSer", AV73TFBarSer);
      AV74TFBarSer_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74TFBarSer_Sel", AV74TFBarSer_Sel);
      AV76TFBarSerDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76TFBarSerDsc", AV76TFBarSerDsc);
      AV77TFBarSerDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77TFBarSerDsc_Sel", AV77TFBarSerDsc_Sel);
      AV117TFBarTipArtDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV117TFBarTipArtDsc", AV117TFBarTipArtDsc);
      AV118TFBarTipArtDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV118TFBarTipArtDsc_Sel", AV118TFBarTipArtDsc_Sel);
      AV119TFBarTipColDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV119TFBarTipColDsc", AV119TFBarTipColDsc);
      AV120TFBarTipColDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV120TFBarTipColDsc_Sel", AV120TFBarTipColDsc_Sel);
      AV37TFFase = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFFase", AV37TFFase);
      AV38TFFase_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFFase_Sel", AV38TFFase_Sel);
      AV125TFFaseDescripcion = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV125TFFaseDescripcion", AV125TFFaseDescripcion);
      AV126TFFaseDescripcion_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV126TFFaseDescripcion_Sel", AV126TFFaseDescripcion_Sel);
      AV40TFHisProDTI = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFHisProDTI", localUtil.ttoc( AV40TFHisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV45TFHisProDTF = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFHisProDTF", localUtil.ttoc( AV45TFHisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV79TFHisProKgr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV79TFHisProKgr", GXutil.ltrimstr( AV79TFHisProKgr, 9, 2));
      AV80TFHisProKgr_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80TFHisProKgr_To", GXutil.ltrimstr( AV80TFHisProKgr_To, 9, 2));
      AV82TFHisProMtr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82TFHisProMtr", GXutil.ltrimstr( AV82TFHisProMtr, 9, 2));
      AV83TFHisProMtr_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83TFHisProMtr_To", GXutil.ltrimstr( AV83TFHisProMtr_To, 9, 2));
      AV92TFParCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92TFParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV92TFParCod), 4, 0));
      AV93TFParCod_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV93TFParCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV93TFParCod_To), 4, 0));
      AV98TFParCodNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV98TFParCodNom", AV98TFParCodNom);
      AV99TFParCodNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV99TFParCodNom_Sel", AV99TFParCodNom_Sel);
      AV95TFHisProTur = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95TFHisProTur", GXutil.str( AV95TFHisProTur, 1, 0));
      AV96TFHisProTur_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV96TFHisProTur_To", GXutil.str( AV96TFHisProTur_To, 1, 0));
      AV107TFHisProReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV107TFHisProReo", GXutil.str( AV107TFHisProReo, 1, 0));
      AV108TFHisProReo_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV108TFHisProReo_To", GXutil.str( AV108TFHisProReo_To, 1, 0));
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
      if ( GXutil.strcmp(AV26Session.getValue(AV175Pgmname+"GridState"), "") == 0 )
      {
         AV15GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV175Pgmname+"GridState"), null, null);
      }
      else
      {
         AV15GridState.fromxml(AV26Session.getValue(AV175Pgmname+"GridState"), null, null);
      }
      AV17OrderedBy = AV15GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17OrderedBy), 4, 0));
      AV18OrderedDsc = AV15GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18OrderedDsc", AV18OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S202 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV15GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV15GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV15GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S202( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV176GXV1 = 1 ;
      while ( AV176GXV1 <= AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV176GXV1));
         if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV103FilterFullText = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV103FilterFullText", AV103FilterFullText);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV31TFMaqCod = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFMaqCod", AV31TFMaqCod);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV32TFMaqCod_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFMaqCod_Sel", AV32TFMaqCod_Sel);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC") == 0 )
         {
            AV59TFMaqDsc = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFMaqDsc", AV59TFMaqDsc);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC_SEL") == 0 )
         {
            AV60TFMaqDsc_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFMaqDsc_Sel", AV60TFMaqDsc_Sel);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV34TFBarNHdr = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFBarNHdr", AV34TFBarNHdr);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV35TFBarNHdr_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFBarNHdr_Sel", AV35TFBarNHdr_Sel);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROLOT") == 0 )
         {
            AV101TFHisProLot = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV101TFHisProLot", AV101TFHisProLot);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROLOT_SEL") == 0 )
         {
            AV102TFHisProLot_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV102TFHisProLot_Sel", AV102TFHisProLot_Sel);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV62TFCliCod = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62TFCliCod), 6, 0));
            AV63TFCliCod_To = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV65TFCliNom = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFCliNom", AV65TFCliNom);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV66TFCliNom_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFCliNom_Sel", AV66TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE") == 0 )
         {
            AV121TFPedidoCliente = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV121TFPedidoCliente", AV121TFPedidoCliente);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE_SEL") == 0 )
         {
            AV122TFPedidoCliente_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV122TFPedidoCliente_Sel", AV122TFPedidoCliente_Sel);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECGEN") == 0 )
         {
            AV68TFBarFecGen = localUtil.ctod( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TFBarFecGen", localUtil.format(AV68TFBarFecGen, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV73TFBarSer = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73TFBarSer", AV73TFBarSer);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV74TFBarSer_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74TFBarSer_Sel", AV74TFBarSer_Sel);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV76TFBarSerDsc = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76TFBarSerDsc", AV76TFBarSerDsc);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV77TFBarSerDsc_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77TFBarSerDsc_Sel", AV77TFBarSerDsc_Sel);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPARTDSC") == 0 )
         {
            AV117TFBarTipArtDsc = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV117TFBarTipArtDsc", AV117TFBarTipArtDsc);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPARTDSC_SEL") == 0 )
         {
            AV118TFBarTipArtDsc_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV118TFBarTipArtDsc_Sel", AV118TFBarTipArtDsc_Sel);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPCOLDSC") == 0 )
         {
            AV119TFBarTipColDsc = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV119TFBarTipColDsc", AV119TFBarTipColDsc);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPCOLDSC_SEL") == 0 )
         {
            AV120TFBarTipColDsc_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV120TFBarTipColDsc_Sel", AV120TFBarTipColDsc_Sel);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE") == 0 )
         {
            AV37TFFase = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFFase", AV37TFFase);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE_SEL") == 0 )
         {
            AV38TFFase_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFFase_Sel", AV38TFFase_Sel);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASEDESCRIPCION") == 0 )
         {
            AV125TFFaseDescripcion = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV125TFFaseDescripcion", AV125TFFaseDescripcion);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASEDESCRIPCION_SEL") == 0 )
         {
            AV126TFFaseDescripcion_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV126TFFaseDescripcion_Sel", AV126TFFaseDescripcion_Sel);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTI") == 0 )
         {
            AV40TFHisProDTI = localUtil.ctot( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFHisProDTI", localUtil.ttoc( AV40TFHisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV42DDO_HisProDTIAuxDate = GXutil.resetTime(AV40TFHisProDTI) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42DDO_HisProDTIAuxDate", localUtil.format(AV42DDO_HisProDTIAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTF") == 0 )
         {
            AV45TFHisProDTF = localUtil.ctot( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFHisProDTF", localUtil.ttoc( AV45TFHisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV47DDO_HisProDTFAuxDate = GXutil.resetTime(AV45TFHisProDTF) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47DDO_HisProDTFAuxDate", localUtil.format(AV47DDO_HisProDTFAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROKGR") == 0 )
         {
            AV79TFHisProKgr = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV79TFHisProKgr", GXutil.ltrimstr( AV79TFHisProKgr, 9, 2));
            AV80TFHisProKgr_To = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80TFHisProKgr_To", GXutil.ltrimstr( AV80TFHisProKgr_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROMTR") == 0 )
         {
            AV82TFHisProMtr = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82TFHisProMtr", GXutil.ltrimstr( AV82TFHisProMtr, 9, 2));
            AV83TFHisProMtr_To = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83TFHisProMtr_To", GXutil.ltrimstr( AV83TFHisProMtr_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCOD") == 0 )
         {
            AV92TFParCod = (short)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92TFParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV92TFParCod), 4, 0));
            AV93TFParCod_To = (short)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV93TFParCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV93TFParCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCODNOM") == 0 )
         {
            AV98TFParCodNom = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV98TFParCodNom", AV98TFParCodNom);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCODNOM_SEL") == 0 )
         {
            AV99TFParCodNom_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV99TFParCodNom_Sel", AV99TFParCodNom_Sel);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROTUR") == 0 )
         {
            AV95TFHisProTur = (byte)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95TFHisProTur", GXutil.str( AV95TFHisProTur, 1, 0));
            AV96TFHisProTur_To = (byte)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV96TFHisProTur_To", GXutil.str( AV96TFHisProTur_To, 1, 0));
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROREO") == 0 )
         {
            AV107TFHisProReo = (byte)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV107TFHisProReo", GXutil.str( AV107TFHisProReo, 1, 0));
            AV108TFHisProReo_To = (byte)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV108TFHisProReo_To", GXutil.str( AV108TFHisProReo_To, 1, 0));
         }
         AV176GXV1 = (int)(AV176GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char5[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV32TFMaqCod_Sel)==0), AV32TFMaqCod_Sel, GXv_char5) ;
      wciformedetalladohdrsproduccion_impl.this.GXt_char1 = GXv_char5[0] ;
      GXt_char18 = "" ;
      GXv_char4[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV60TFMaqDsc_Sel)==0), AV60TFMaqDsc_Sel, GXv_char4) ;
      wciformedetalladohdrsproduccion_impl.this.GXt_char18 = GXv_char4[0] ;
      GXt_char19 = "" ;
      GXv_char3[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV35TFBarNHdr_Sel)==0), AV35TFBarNHdr_Sel, GXv_char3) ;
      wciformedetalladohdrsproduccion_impl.this.GXt_char19 = GXv_char3[0] ;
      GXt_char20 = "" ;
      GXv_char2[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV102TFHisProLot_Sel)==0), AV102TFHisProLot_Sel, GXv_char2) ;
      wciformedetalladohdrsproduccion_impl.this.GXt_char20 = GXv_char2[0] ;
      GXt_char21 = "" ;
      GXv_char22[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV66TFCliNom_Sel)==0), AV66TFCliNom_Sel, GXv_char22) ;
      wciformedetalladohdrsproduccion_impl.this.GXt_char21 = GXv_char22[0] ;
      GXt_char23 = "" ;
      GXv_char24[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV122TFPedidoCliente_Sel)==0), AV122TFPedidoCliente_Sel, GXv_char24) ;
      wciformedetalladohdrsproduccion_impl.this.GXt_char23 = GXv_char24[0] ;
      GXt_char25 = "" ;
      GXv_char26[0] = GXt_char25 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV74TFBarSer_Sel)==0), AV74TFBarSer_Sel, GXv_char26) ;
      wciformedetalladohdrsproduccion_impl.this.GXt_char25 = GXv_char26[0] ;
      GXt_char27 = "" ;
      GXv_char28[0] = GXt_char27 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV77TFBarSerDsc_Sel)==0), AV77TFBarSerDsc_Sel, GXv_char28) ;
      wciformedetalladohdrsproduccion_impl.this.GXt_char27 = GXv_char28[0] ;
      GXt_char29 = "" ;
      GXv_char30[0] = GXt_char29 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV118TFBarTipArtDsc_Sel)==0), AV118TFBarTipArtDsc_Sel, GXv_char30) ;
      wciformedetalladohdrsproduccion_impl.this.GXt_char29 = GXv_char30[0] ;
      GXt_char31 = "" ;
      GXv_char32[0] = GXt_char31 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV120TFBarTipColDsc_Sel)==0), AV120TFBarTipColDsc_Sel, GXv_char32) ;
      wciformedetalladohdrsproduccion_impl.this.GXt_char31 = GXv_char32[0] ;
      GXt_char33 = "" ;
      GXv_char34[0] = GXt_char33 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV38TFFase_Sel)==0), AV38TFFase_Sel, GXv_char34) ;
      wciformedetalladohdrsproduccion_impl.this.GXt_char33 = GXv_char34[0] ;
      GXt_char35 = "" ;
      GXv_char36[0] = GXt_char35 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV126TFFaseDescripcion_Sel)==0), AV126TFFaseDescripcion_Sel, GXv_char36) ;
      wciformedetalladohdrsproduccion_impl.this.GXt_char35 = GXv_char36[0] ;
      GXt_char37 = "" ;
      GXv_char38[0] = GXt_char37 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV99TFParCodNom_Sel)==0), AV99TFParCodNom_Sel, GXv_char38) ;
      wciformedetalladohdrsproduccion_impl.this.GXt_char37 = GXv_char38[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|"+GXt_char18+"|"+GXt_char19+"|"+GXt_char20+"||"+GXt_char21+"|"+GXt_char23+"||"+GXt_char25+"|"+GXt_char27+"|"+GXt_char29+"|"+GXt_char31+"|"+GXt_char33+"|"+GXt_char35+"||||||"+GXt_char37+"|||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char37 = "" ;
      GXv_char38[0] = GXt_char37 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV31TFMaqCod)==0), AV31TFMaqCod, GXv_char38) ;
      wciformedetalladohdrsproduccion_impl.this.GXt_char37 = GXv_char38[0] ;
      GXt_char35 = "" ;
      GXv_char36[0] = GXt_char35 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV59TFMaqDsc)==0), AV59TFMaqDsc, GXv_char36) ;
      wciformedetalladohdrsproduccion_impl.this.GXt_char35 = GXv_char36[0] ;
      GXt_char33 = "" ;
      GXv_char34[0] = GXt_char33 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV34TFBarNHdr)==0), AV34TFBarNHdr, GXv_char34) ;
      wciformedetalladohdrsproduccion_impl.this.GXt_char33 = GXv_char34[0] ;
      GXt_char31 = "" ;
      GXv_char32[0] = GXt_char31 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV101TFHisProLot)==0), AV101TFHisProLot, GXv_char32) ;
      wciformedetalladohdrsproduccion_impl.this.GXt_char31 = GXv_char32[0] ;
      GXt_char29 = "" ;
      GXv_char30[0] = GXt_char29 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV65TFCliNom)==0), AV65TFCliNom, GXv_char30) ;
      wciformedetalladohdrsproduccion_impl.this.GXt_char29 = GXv_char30[0] ;
      GXt_char27 = "" ;
      GXv_char28[0] = GXt_char27 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV121TFPedidoCliente)==0), AV121TFPedidoCliente, GXv_char28) ;
      wciformedetalladohdrsproduccion_impl.this.GXt_char27 = GXv_char28[0] ;
      GXt_char25 = "" ;
      GXv_char26[0] = GXt_char25 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV73TFBarSer)==0), AV73TFBarSer, GXv_char26) ;
      wciformedetalladohdrsproduccion_impl.this.GXt_char25 = GXv_char26[0] ;
      GXt_char23 = "" ;
      GXv_char24[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV76TFBarSerDsc)==0), AV76TFBarSerDsc, GXv_char24) ;
      wciformedetalladohdrsproduccion_impl.this.GXt_char23 = GXv_char24[0] ;
      GXt_char21 = "" ;
      GXv_char22[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV117TFBarTipArtDsc)==0), AV117TFBarTipArtDsc, GXv_char22) ;
      wciformedetalladohdrsproduccion_impl.this.GXt_char21 = GXv_char22[0] ;
      GXt_char20 = "" ;
      GXv_char5[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV119TFBarTipColDsc)==0), AV119TFBarTipColDsc, GXv_char5) ;
      wciformedetalladohdrsproduccion_impl.this.GXt_char20 = GXv_char5[0] ;
      GXt_char19 = "" ;
      GXv_char4[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV37TFFase)==0), AV37TFFase, GXv_char4) ;
      wciformedetalladohdrsproduccion_impl.this.GXt_char19 = GXv_char4[0] ;
      GXt_char18 = "" ;
      GXv_char3[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV125TFFaseDescripcion)==0), AV125TFFaseDescripcion, GXv_char3) ;
      wciformedetalladohdrsproduccion_impl.this.GXt_char18 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV98TFParCodNom)==0), AV98TFParCodNom, GXv_char2) ;
      wciformedetalladohdrsproduccion_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = GXt_char37+"|"+GXt_char35+"|"+GXt_char33+"|"+GXt_char31+"|"+((0==AV62TFCliCod) ? "" : GXutil.str( AV62TFCliCod, 6, 0))+"|"+GXt_char29+"|"+GXt_char27+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV68TFBarFecGen)) ? "" : localUtil.dtoc( AV68TFBarFecGen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char25+"|"+GXt_char23+"|"+GXt_char21+"|"+GXt_char20+"|"+GXt_char19+"|"+GXt_char18+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV40TFHisProDTI) ? "" : localUtil.dtoc( AV42DDO_HisProDTIAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV45TFHisProDTF) ? "" : localUtil.dtoc( AV47DDO_HisProDTFAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV79TFHisProKgr)==0) ? "" : GXutil.str( AV79TFHisProKgr, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV82TFHisProMtr)==0) ? "" : GXutil.str( AV82TFHisProMtr, 9, 2))+"|"+((0==AV92TFParCod) ? "" : GXutil.str( AV92TFParCod, 4, 0))+"|"+GXt_char1+"|"+((0==AV95TFHisProTur) ? "" : GXutil.str( AV95TFHisProTur, 1, 0))+"||"+((0==AV107TFHisProReo) ? "" : GXutil.str( AV107TFHisProReo, 1, 0)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "||||"+((0==AV63TFCliCod_To) ? "" : GXutil.str( AV63TFCliCod_To, 6, 0))+"||||||||||||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV80TFHisProKgr_To)==0) ? "" : GXutil.str( AV80TFHisProKgr_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV83TFHisProMtr_To)==0) ? "" : GXutil.str( AV83TFHisProMtr_To, 9, 2))+"|"+((0==AV93TFParCod_To) ? "" : GXutil.str( AV93TFParCod_To, 4, 0))+"||"+((0==AV96TFHisProTur_To) ? "" : GXutil.str( AV96TFHisProTur_To, 1, 0))+"||"+((0==AV108TFHisProReo_To) ? "" : GXutil.str( AV108TFHisProReo_To, 1, 0)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV15GridState.fromxml(AV26Session.getValue(AV175Pgmname+"GridState"), null, null);
      AV15GridState.setgxTv_SdtWWPGridState_Orderedby( AV17OrderedBy );
      AV15GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV18OrderedDsc );
      AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState39[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState39, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV103FilterFullText)==0), (short)(0), AV103FilterFullText, "") ;
      AV15GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFMAQCOD", "", !(GXutil.strcmp("", AV31TFMaqCod)==0), (short)(0), AV31TFMaqCod, "", !(GXutil.strcmp("", AV32TFMaqCod_Sel)==0), AV32TFMaqCod_Sel, "") ;
      AV15GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFMAQDSC", "", !(GXutil.strcmp("", AV59TFMaqDsc)==0), (short)(0), AV59TFMaqDsc, "", !(GXutil.strcmp("", AV60TFMaqDsc_Sel)==0), AV60TFMaqDsc_Sel, "") ;
      AV15GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFBARNHDR", "", !(GXutil.strcmp("", AV34TFBarNHdr)==0), (short)(0), AV34TFBarNHdr, "", !(GXutil.strcmp("", AV35TFBarNHdr_Sel)==0), AV35TFBarNHdr_Sel, "") ;
      AV15GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFHISPROLOT", "", !(GXutil.strcmp("", AV101TFHisProLot)==0), (short)(0), AV101TFHisProLot, "", !(GXutil.strcmp("", AV102TFHisProLot_Sel)==0), AV102TFHisProLot_Sel, "") ;
      AV15GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFCLICOD", "", !((0==AV62TFCliCod)&&(0==AV63TFCliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV62TFCliCod, 6, 0)), GXutil.trim( GXutil.str( AV63TFCliCod_To, 6, 0))) ;
      AV15GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFCLINOM", "", !(GXutil.strcmp("", AV65TFCliNom)==0), (short)(0), AV65TFCliNom, "", !(GXutil.strcmp("", AV66TFCliNom_Sel)==0), AV66TFCliNom_Sel, "") ;
      AV15GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFPEDIDOCLIENTE", "", !(GXutil.strcmp("", AV121TFPedidoCliente)==0), (short)(0), AV121TFPedidoCliente, "", !(GXutil.strcmp("", AV122TFPedidoCliente_Sel)==0), AV122TFPedidoCliente_Sel, "") ;
      AV15GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFBARFECGEN", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV68TFBarFecGen)), (short)(0), GXutil.trim( localUtil.dtoc( AV68TFBarFecGen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV15GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFBARSER", "", !(GXutil.strcmp("", AV73TFBarSer)==0), (short)(0), AV73TFBarSer, "", !(GXutil.strcmp("", AV74TFBarSer_Sel)==0), AV74TFBarSer_Sel, "") ;
      AV15GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFBARSERDSC", "", !(GXutil.strcmp("", AV76TFBarSerDsc)==0), (short)(0), AV76TFBarSerDsc, "", !(GXutil.strcmp("", AV77TFBarSerDsc_Sel)==0), AV77TFBarSerDsc_Sel, "") ;
      AV15GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFBARTIPARTDSC", "", !(GXutil.strcmp("", AV117TFBarTipArtDsc)==0), (short)(0), AV117TFBarTipArtDsc, "", !(GXutil.strcmp("", AV118TFBarTipArtDsc_Sel)==0), AV118TFBarTipArtDsc_Sel, "") ;
      AV15GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFBARTIPCOLDSC", "", !(GXutil.strcmp("", AV119TFBarTipColDsc)==0), (short)(0), AV119TFBarTipColDsc, "", !(GXutil.strcmp("", AV120TFBarTipColDsc_Sel)==0), AV120TFBarTipColDsc_Sel, "") ;
      AV15GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFFASE", "", !(GXutil.strcmp("", AV37TFFase)==0), (short)(0), AV37TFFase, "", !(GXutil.strcmp("", AV38TFFase_Sel)==0), AV38TFFase_Sel, "") ;
      AV15GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFFASEDESCRIPCION", "", !(GXutil.strcmp("", AV125TFFaseDescripcion)==0), (short)(0), AV125TFFaseDescripcion, "", !(GXutil.strcmp("", AV126TFFaseDescripcion_Sel)==0), AV126TFFaseDescripcion_Sel, "") ;
      AV15GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFHISPRODTI", "", !GXutil.dateCompare(GXutil.nullDate(), AV40TFHisProDTI), (short)(0), GXutil.trim( localUtil.ttoc( AV40TFHisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV15GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFHISPRODTF", "", !GXutil.dateCompare(GXutil.nullDate(), AV45TFHisProDTF), (short)(0), GXutil.trim( localUtil.ttoc( AV45TFHisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV15GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFHISPROKGR", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV79TFHisProKgr)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV80TFHisProKgr_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV79TFHisProKgr, 9, 2)), GXutil.trim( GXutil.str( AV80TFHisProKgr_To, 9, 2))) ;
      AV15GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFHISPROMTR", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV82TFHisProMtr)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV83TFHisProMtr_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV82TFHisProMtr, 9, 2)), GXutil.trim( GXutil.str( AV83TFHisProMtr_To, 9, 2))) ;
      AV15GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFPARCOD", "", !((0==AV92TFParCod)&&(0==AV93TFParCod_To)), (short)(0), GXutil.trim( GXutil.str( AV92TFParCod, 4, 0)), GXutil.trim( GXutil.str( AV93TFParCod_To, 4, 0))) ;
      AV15GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFPARCODNOM", "", !(GXutil.strcmp("", AV98TFParCodNom)==0), (short)(0), AV98TFParCodNom, "", !(GXutil.strcmp("", AV99TFParCodNom_Sel)==0), AV99TFParCodNom_Sel, "") ;
      AV15GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFHISPROTUR", "", !((0==AV95TFHisProTur)&&(0==AV96TFHisProTur_To)), (short)(0), GXutil.trim( GXutil.str( AV95TFHisProTur, 1, 0)), GXutil.trim( GXutil.str( AV96TFHisProTur_To, 1, 0))) ;
      AV15GridState = GXv_SdtWWPGridState39[0] ;
      GXv_SdtWWPGridState39[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState39, "TFHISPROREO", "", !((0==AV107TFHisProReo)&&(0==AV108TFHisProReo_To)), (short)(0), GXutil.trim( GXutil.str( AV107TFHisProReo, 1, 0)), GXutil.trim( GXutil.str( AV108TFHisProReo_To, 1, 0))) ;
      AV15GridState = GXv_SdtWWPGridState39[0] ;
      if ( ! (GXutil.strcmp("", AV5Emprcod)==0) )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV5Emprcod );
         AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV16GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV9MaqCodInicial)==0) )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&MAQCODINICIAL" );
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV9MaqCodInicial );
         AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV16GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV8MaqCodFinal)==0) )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&MAQCODFINAL" );
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV8MaqCodFinal );
         AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV16GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV7Hisprodti) )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HISPRODTI" );
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.ttoc( AV7Hisprodti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") );
         AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV16GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV6HisProdtf) )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HISPRODTF" );
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.ttoc( AV6HisProdtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") );
         AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV16GridStateFilterValue, 0);
      }
      if ( ! (0==AV105HisProReo) )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HISPROREO" );
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV105HisProReo, 1, 0) );
         AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV16GridStateFilterValue, 0);
      }
      if ( ! (0==AV106ParCod) )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PARCOD" );
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV106ParCod, 4, 0) );
         AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV16GridStateFilterValue, 0);
      }
      AV15GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV15GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV175Pgmname+"GridState", AV15GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV13TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV13TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV175Pgmname );
      AV13TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV13TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV12HTTPRequest.getScriptName()+"?"+AV12HTTPRequest.getQuerystring() );
      AV13TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "LHIPRO" );
      AV26Session.setValue("TrnContext", AV13TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S172( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV84TotHisProKgr = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84TotHisProKgr", GXutil.ltrimstr( AV84TotHisProKgr, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTHISPROKGR", getSecureSignedToken( sPrefix, localUtil.format( AV84TotHisProKgr, "ZZZZZ9.99")));
      AV86TotHisProMtr = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86TotHisProMtr", GXutil.ltrimstr( AV86TotHisProMtr, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTHISPROMTR", getSecureSignedToken( sPrefix, localUtil.format( AV86TotHisProMtr, "ZZZZZ9.99")));
   }

   public void S182( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      AV133Wciformedetalladohdrsproduccionds_1_filterfulltext = AV103FilterFullText ;
      AV134Wciformedetalladohdrsproduccionds_2_tfmaqcod = AV31TFMaqCod ;
      AV135Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel = AV32TFMaqCod_Sel ;
      AV136Wciformedetalladohdrsproduccionds_4_tfmaqdsc = AV59TFMaqDsc ;
      AV137Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel = AV60TFMaqDsc_Sel ;
      AV138Wciformedetalladohdrsproduccionds_6_tfbarnhdr = AV34TFBarNHdr ;
      AV139Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel = AV35TFBarNHdr_Sel ;
      AV140Wciformedetalladohdrsproduccionds_8_tfhisprolot = AV101TFHisProLot ;
      AV141Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel = AV102TFHisProLot_Sel ;
      AV142Wciformedetalladohdrsproduccionds_10_tfclicod = AV62TFCliCod ;
      AV143Wciformedetalladohdrsproduccionds_11_tfclicod_to = AV63TFCliCod_To ;
      AV144Wciformedetalladohdrsproduccionds_12_tfclinom = AV65TFCliNom ;
      AV145Wciformedetalladohdrsproduccionds_13_tfclinom_sel = AV66TFCliNom_Sel ;
      AV146Wciformedetalladohdrsproduccionds_14_tfpedidocliente = AV121TFPedidoCliente ;
      AV147Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel = AV122TFPedidoCliente_Sel ;
      AV148Wciformedetalladohdrsproduccionds_16_tfbarfecgen = AV68TFBarFecGen ;
      AV149Wciformedetalladohdrsproduccionds_17_tfbarser = AV73TFBarSer ;
      AV150Wciformedetalladohdrsproduccionds_18_tfbarser_sel = AV74TFBarSer_Sel ;
      AV151Wciformedetalladohdrsproduccionds_19_tfbarserdsc = AV76TFBarSerDsc ;
      AV152Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel = AV77TFBarSerDsc_Sel ;
      AV153Wciformedetalladohdrsproduccionds_21_tfbartipartdsc = AV117TFBarTipArtDsc ;
      AV154Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel = AV118TFBarTipArtDsc_Sel ;
      AV155Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc = AV119TFBarTipColDsc ;
      AV156Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel = AV120TFBarTipColDsc_Sel ;
      AV157Wciformedetalladohdrsproduccionds_25_tffase = AV37TFFase ;
      AV158Wciformedetalladohdrsproduccionds_26_tffase_sel = AV38TFFase_Sel ;
      AV159Wciformedetalladohdrsproduccionds_27_tffasedescripcion = AV125TFFaseDescripcion ;
      AV160Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel = AV126TFFaseDescripcion_Sel ;
      AV161Wciformedetalladohdrsproduccionds_29_tfhisprodti = AV40TFHisProDTI ;
      AV162Wciformedetalladohdrsproduccionds_30_tfhisprodtf = AV45TFHisProDTF ;
      AV163Wciformedetalladohdrsproduccionds_31_tfhisprokgr = AV79TFHisProKgr ;
      AV164Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to = AV80TFHisProKgr_To ;
      AV165Wciformedetalladohdrsproduccionds_33_tfhispromtr = AV82TFHisProMtr ;
      AV166Wciformedetalladohdrsproduccionds_34_tfhispromtr_to = AV83TFHisProMtr_To ;
      AV167Wciformedetalladohdrsproduccionds_35_tfparcod = AV92TFParCod ;
      AV168Wciformedetalladohdrsproduccionds_36_tfparcod_to = AV93TFParCod_To ;
      AV169Wciformedetalladohdrsproduccionds_37_tfparcodnom = AV98TFParCodNom ;
      AV170Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel = AV99TFParCodNom_Sel ;
      AV171Wciformedetalladohdrsproduccionds_39_tfhisprotur = AV95TFHisProTur ;
      AV172Wciformedetalladohdrsproduccionds_40_tfhisprotur_to = AV96TFHisProTur_To ;
      AV173Wciformedetalladohdrsproduccionds_41_tfhisproreo = AV107TFHisProReo ;
      AV174Wciformedetalladohdrsproduccionds_42_tfhisproreo_to = AV108TFHisProReo_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV135Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel ,
                                           AV134Wciformedetalladohdrsproduccionds_2_tfmaqcod ,
                                           AV137Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel ,
                                           AV136Wciformedetalladohdrsproduccionds_4_tfmaqdsc ,
                                           AV139Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel ,
                                           AV138Wciformedetalladohdrsproduccionds_6_tfbarnhdr ,
                                           AV141Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel ,
                                           AV140Wciformedetalladohdrsproduccionds_8_tfhisprolot ,
                                           Integer.valueOf(AV142Wciformedetalladohdrsproduccionds_10_tfclicod) ,
                                           Integer.valueOf(AV143Wciformedetalladohdrsproduccionds_11_tfclicod_to) ,
                                           AV145Wciformedetalladohdrsproduccionds_13_tfclinom_sel ,
                                           AV144Wciformedetalladohdrsproduccionds_12_tfclinom ,
                                           AV148Wciformedetalladohdrsproduccionds_16_tfbarfecgen ,
                                           AV150Wciformedetalladohdrsproduccionds_18_tfbarser_sel ,
                                           AV149Wciformedetalladohdrsproduccionds_17_tfbarser ,
                                           AV152Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel ,
                                           AV151Wciformedetalladohdrsproduccionds_19_tfbarserdsc ,
                                           AV154Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel ,
                                           AV153Wciformedetalladohdrsproduccionds_21_tfbartipartdsc ,
                                           AV158Wciformedetalladohdrsproduccionds_26_tffase_sel ,
                                           AV157Wciformedetalladohdrsproduccionds_25_tffase ,
                                           AV161Wciformedetalladohdrsproduccionds_29_tfhisprodti ,
                                           AV162Wciformedetalladohdrsproduccionds_30_tfhisprodtf ,
                                           AV163Wciformedetalladohdrsproduccionds_31_tfhisprokgr ,
                                           AV164Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to ,
                                           AV165Wciformedetalladohdrsproduccionds_33_tfhispromtr ,
                                           AV166Wciformedetalladohdrsproduccionds_34_tfhispromtr_to ,
                                           Short.valueOf(AV167Wciformedetalladohdrsproduccionds_35_tfparcod) ,
                                           Short.valueOf(AV168Wciformedetalladohdrsproduccionds_36_tfparcod_to) ,
                                           AV170Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel ,
                                           AV169Wciformedetalladohdrsproduccionds_37_tfparcodnom ,
                                           Byte.valueOf(AV171Wciformedetalladohdrsproduccionds_39_tfhisprotur) ,
                                           Byte.valueOf(AV172Wciformedetalladohdrsproduccionds_40_tfhisprotur_to) ,
                                           Byte.valueOf(AV173Wciformedetalladohdrsproduccionds_41_tfhisproreo) ,
                                           Byte.valueOf(AV174Wciformedetalladohdrsproduccionds_42_tfhisproreo_to) ,
                                           AV9MaqCodInicial ,
                                           AV8MaqCodFinal ,
                                           AV7Hisprodti ,
                                           AV6HisProdtf ,
                                           Byte.valueOf(AV105HisProReo) ,
                                           Short.valueOf(AV106ParCod) ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A3610HisProLot ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A159BarFecGen ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A13711BarTipArtD ,
                                           A461Fase ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Short.valueOf(A656ParCod) ,
                                           A867ParCodNom ,
                                           Byte.valueOf(A566HisProTur) ,
                                           Byte.valueOf(A3612HisProReo) ,
                                           AV133Wciformedetalladohdrsproduccionds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A13878PedidoClie ,
                                           A13868BarTipColD ,
                                           A13893FaseDescri ,
                                           AV147Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel ,
                                           AV146Wciformedetalladohdrsproduccionds_14_tfpedidocliente ,
                                           AV156Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel ,
                                           AV155Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc ,
                                           AV160Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel ,
                                           AV159Wciformedetalladohdrsproduccionds_27_tffasedescripcion ,
                                           AV5Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV134Wciformedetalladohdrsproduccionds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV134Wciformedetalladohdrsproduccionds_2_tfmaqcod), 6, "%") ;
      lV136Wciformedetalladohdrsproduccionds_4_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV136Wciformedetalladohdrsproduccionds_4_tfmaqdsc), 16, "%") ;
      lV138Wciformedetalladohdrsproduccionds_6_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV138Wciformedetalladohdrsproduccionds_6_tfbarnhdr), 11, "%") ;
      lV140Wciformedetalladohdrsproduccionds_8_tfhisprolot = GXutil.padr( GXutil.rtrim( AV140Wciformedetalladohdrsproduccionds_8_tfhisprolot), 10, "%") ;
      lV144Wciformedetalladohdrsproduccionds_12_tfclinom = GXutil.padr( GXutil.rtrim( AV144Wciformedetalladohdrsproduccionds_12_tfclinom), 30, "%") ;
      lV149Wciformedetalladohdrsproduccionds_17_tfbarser = GXutil.padr( GXutil.rtrim( AV149Wciformedetalladohdrsproduccionds_17_tfbarser), 16, "%") ;
      lV151Wciformedetalladohdrsproduccionds_19_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV151Wciformedetalladohdrsproduccionds_19_tfbarserdsc), 26, "%") ;
      lV153Wciformedetalladohdrsproduccionds_21_tfbartipartdsc = GXutil.padr( GXutil.rtrim( AV153Wciformedetalladohdrsproduccionds_21_tfbartipartdsc), 30, "%") ;
      lV157Wciformedetalladohdrsproduccionds_25_tffase = GXutil.padr( GXutil.rtrim( AV157Wciformedetalladohdrsproduccionds_25_tffase), 8, "%") ;
      lV169Wciformedetalladohdrsproduccionds_37_tfparcodnom = GXutil.padr( GXutil.rtrim( AV169Wciformedetalladohdrsproduccionds_37_tfparcodnom), 30, "%") ;
      /* Using cursor H00TI4 */
      pr_default.execute(2, new Object[] {AV5Emprcod, lV134Wciformedetalladohdrsproduccionds_2_tfmaqcod, AV135Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel, lV136Wciformedetalladohdrsproduccionds_4_tfmaqdsc, AV137Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel, lV138Wciformedetalladohdrsproduccionds_6_tfbarnhdr, AV139Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel, lV140Wciformedetalladohdrsproduccionds_8_tfhisprolot, AV141Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel, Integer.valueOf(AV142Wciformedetalladohdrsproduccionds_10_tfclicod), Integer.valueOf(AV143Wciformedetalladohdrsproduccionds_11_tfclicod_to), lV144Wciformedetalladohdrsproduccionds_12_tfclinom, AV145Wciformedetalladohdrsproduccionds_13_tfclinom_sel, AV148Wciformedetalladohdrsproduccionds_16_tfbarfecgen, lV149Wciformedetalladohdrsproduccionds_17_tfbarser, AV150Wciformedetalladohdrsproduccionds_18_tfbarser_sel, lV151Wciformedetalladohdrsproduccionds_19_tfbarserdsc, AV152Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel, lV153Wciformedetalladohdrsproduccionds_21_tfbartipartdsc, AV154Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel, lV157Wciformedetalladohdrsproduccionds_25_tffase, AV158Wciformedetalladohdrsproduccionds_26_tffase_sel, AV161Wciformedetalladohdrsproduccionds_29_tfhisprodti, AV162Wciformedetalladohdrsproduccionds_30_tfhisprodtf, AV163Wciformedetalladohdrsproduccionds_31_tfhisprokgr, AV164Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to, AV165Wciformedetalladohdrsproduccionds_33_tfhispromtr, AV166Wciformedetalladohdrsproduccionds_34_tfhispromtr_to, Short.valueOf(AV167Wciformedetalladohdrsproduccionds_35_tfparcod), Short.valueOf(AV168Wciformedetalladohdrsproduccionds_36_tfparcod_to), lV169Wciformedetalladohdrsproduccionds_37_tfparcodnom, AV170Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel, Byte.valueOf(AV171Wciformedetalladohdrsproduccionds_39_tfhisprotur), Byte.valueOf(AV172Wciformedetalladohdrsproduccionds_40_tfhisprotur_to), Byte.valueOf(AV173Wciformedetalladohdrsproduccionds_41_tfhisproreo), Byte.valueOf(AV174Wciformedetalladohdrsproduccionds_42_tfhisproreo_to), AV9MaqCodInicial, AV8MaqCodFinal, AV7Hisprodti, AV6HisProdtf, Byte.valueOf(AV105HisProReo), Short.valueOf(AV106ParCod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A217BarTipArt = H00TI4_A217BarTipArt[0] ;
         n217BarTipArt = H00TI4_n217BarTipArt[0] ;
         A3612HisProReo = H00TI4_A3612HisProReo[0] ;
         A566HisProTur = H00TI4_A566HisProTur[0] ;
         A867ParCodNom = H00TI4_A867ParCodNom[0] ;
         n867ParCodNom = H00TI4_n867ParCodNom[0] ;
         A656ParCod = H00TI4_A656ParCod[0] ;
         n656ParCod = H00TI4_n656ParCod[0] ;
         A1526HisProMtr = H00TI4_A1526HisProMtr[0] ;
         A1525HisProKgr = H00TI4_A1525HisProKgr[0] ;
         A4441HisProDTF = H00TI4_A4441HisProDTF[0] ;
         n4441HisProDTF = H00TI4_n4441HisProDTF[0] ;
         A4440HisProDTI = H00TI4_A4440HisProDTI[0] ;
         n4440HisProDTI = H00TI4_n4440HisProDTI[0] ;
         A13711BarTipArtD = H00TI4_A13711BarTipArtD[0] ;
         n13711BarTipArtD = H00TI4_n13711BarTipArtD[0] ;
         A1652BarSerDsc = H00TI4_A1652BarSerDsc[0] ;
         A212BarSer = H00TI4_A212BarSer[0] ;
         A159BarFecGen = H00TI4_A159BarFecGen[0] ;
         A279CliNom = H00TI4_A279CliNom[0] ;
         A252CliCod = H00TI4_A252CliCod[0] ;
         n252CliCod = H00TI4_n252CliCod[0] ;
         A3610HisProLot = H00TI4_A3610HisProLot[0] ;
         A13696BarNHdr = H00TI4_A13696BarNHdr[0] ;
         A606MaqDsc = H00TI4_A606MaqDsc[0] ;
         n606MaqDsc = H00TI4_n606MaqDsc[0] ;
         A602MaqCod = H00TI4_A602MaqCod[0] ;
         A129BarCod = H00TI4_A129BarCod[0] ;
         A132BarCodReo = H00TI4_A132BarCodReo[0] ;
         A130BarCodPar = H00TI4_A130BarCodPar[0] ;
         A143BarDisNum = H00TI4_A143BarDisNum[0] ;
         A4812BarEncCli = H00TI4_A4812BarEncCli[0] ;
         A218BarTipCol = H00TI4_A218BarTipCol[0] ;
         A461Fase = H00TI4_A461Fase[0] ;
         A396EmprCod = H00TI4_A396EmprCod[0] ;
         A606MaqDsc = H00TI4_A606MaqDsc[0] ;
         n606MaqDsc = H00TI4_n606MaqDsc[0] ;
         A217BarTipArt = H00TI4_A217BarTipArt[0] ;
         n217BarTipArt = H00TI4_n217BarTipArt[0] ;
         A1652BarSerDsc = H00TI4_A1652BarSerDsc[0] ;
         A212BarSer = H00TI4_A212BarSer[0] ;
         A159BarFecGen = H00TI4_A159BarFecGen[0] ;
         A252CliCod = H00TI4_A252CliCod[0] ;
         n252CliCod = H00TI4_n252CliCod[0] ;
         A13696BarNHdr = H00TI4_A13696BarNHdr[0] ;
         A143BarDisNum = H00TI4_A143BarDisNum[0] ;
         A4812BarEncCli = H00TI4_A4812BarEncCli[0] ;
         A218BarTipCol = H00TI4_A218BarTipCol[0] ;
         A279CliNom = H00TI4_A279CliNom[0] ;
         A13711BarTipArtD = H00TI4_A13711BarTipArtD[0] ;
         n13711BarTipArtD = H00TI4_n13711BarTipArtD[0] ;
         A867ParCodNom = H00TI4_A867ParCodNom[0] ;
         n867ParCodNom = H00TI4_n867ParCodNom[0] ;
         GXt_char37 = A13878PedidoClie ;
         GXv_char38[0] = A396EmprCod ;
         GXv_char36[0] = A4812BarEncCli ;
         GXv_char34[0] = A143BarDisNum ;
         GXv_char32[0] = GXt_char37 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char38, GXv_char36, GXv_char34, GXv_char32) ;
         wciformedetalladohdrsproduccion_impl.this.A396EmprCod = GXv_char38[0] ;
         wciformedetalladohdrsproduccion_impl.this.A4812BarEncCli = GXv_char36[0] ;
         wciformedetalladohdrsproduccion_impl.this.A143BarDisNum = GXv_char34[0] ;
         wciformedetalladohdrsproduccion_impl.this.GXt_char37 = GXv_char32[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4812BarEncCli", A4812BarEncCli);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A143BarDisNum", A143BarDisNum);
         A13878PedidoClie = GXt_char37 ;
         if ( ! ( (GXutil.strcmp("", AV147Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV146Wciformedetalladohdrsproduccionds_14_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV146Wciformedetalladohdrsproduccionds_14_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV147Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV147Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel) == 0 ) ) )
            {
               GXt_char37 = A13868BarTipColD ;
               GXv_char38[0] = A396EmprCod ;
               GXv_int6[0] = A218BarTipCol ;
               GXv_char36[0] = GXt_char37 ;
               new app.pfcoldsc(remoteHandle, context).execute( GXv_char38, GXv_int6, GXv_char36) ;
               wciformedetalladohdrsproduccion_impl.this.A396EmprCod = GXv_char38[0] ;
               wciformedetalladohdrsproduccion_impl.this.A218BarTipCol = GXv_int6[0] ;
               wciformedetalladohdrsproduccion_impl.this.GXt_char37 = GXv_char36[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
               A13868BarTipColD = GXt_char37 ;
               if ( ! ( (GXutil.strcmp("", AV156Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV155Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc)==0) ) ) || ( GXutil.like( GXutil.upper( A13868BarTipColD) , GXutil.padr( "%" + GXutil.upper( AV155Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV156Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel)==0) || ( ( GXutil.strcmp(A13868BarTipColD, AV156Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel) == 0 ) ) )
                  {
                     GXt_char37 = A13893FaseDescri ;
                     GXv_char38[0] = GXt_char37 ;
                     new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char38) ;
                     wciformedetalladohdrsproduccion_impl.this.GXt_char37 = GXv_char38[0] ;
                     A13893FaseDescri = GXt_char37 ;
                     if ( (GXutil.strcmp("", AV133Wciformedetalladohdrsproduccionds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A602MaqCod) , GXutil.padr( "%" + GXutil.upper( AV133Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A606MaqDsc) , GXutil.padr( "%" + GXutil.upper( AV133Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV133Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3610HisProLot) , GXutil.padr( "%" + GXutil.upper( AV133Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV133Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV133Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV133Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV133Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV133Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13711BarTipArtD) , GXutil.padr( "%" + GXutil.upper( AV133Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13868BarTipColD) , GXutil.padr( "%" + GXutil.upper( AV133Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A461Fase) , GXutil.padr( "%" + GXutil.upper( AV133Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13893FaseDescri) , GXutil.padr( "%" + GXutil.upper( AV133Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1525HisProKgr, 9, 2) , GXutil.padr( "%" + AV133Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1526HisProMtr, 9, 2) , GXutil.padr( "%" + AV133Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A656ParCod, 4, 0) , GXutil.padr( "%" + AV133Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A867ParCodNom) , GXutil.padr( "%" + GXutil.upper( AV133Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A566HisProTur, 1, 0) , GXutil.padr( "%" + AV133Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A3612HisProReo, 1, 0) , GXutil.padr( "%" + AV133Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
                     {
                        if ( ! ( (GXutil.strcmp("", AV160Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel)==0) && ( ! (GXutil.strcmp("", AV159Wciformedetalladohdrsproduccionds_27_tffasedescripcion)==0) ) ) || ( GXutil.like( GXutil.upper( A13893FaseDescri) , GXutil.padr( "%" + GXutil.upper( AV159Wciformedetalladohdrsproduccionds_27_tffasedescripcion) , 255 , "%"),  ' ' ) ) )
                        {
                           if ( (GXutil.strcmp("", AV160Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel)==0) || ( ( GXutil.strcmp(A13893FaseDescri, AV160Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel) == 0 ) ) )
                           {
                              AV84TotHisProKgr = A1525HisProKgr.add(AV84TotHisProKgr) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84TotHisProKgr", GXutil.ltrimstr( AV84TotHisProKgr, 18, 2));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTHISPROKGR", getSecureSignedToken( sPrefix, localUtil.format( AV84TotHisProKgr, "ZZZZZ9.99")));
                              AV86TotHisProMtr = A1526HisProMtr.add(AV86TotHisProMtr) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86TotHisProMtr", GXutil.ltrimstr( AV86TotHisProMtr, 18, 2));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTHISPROMTR", getSecureSignedToken( sPrefix, localUtil.format( AV86TotHisProMtr, "ZZZZZ9.99")));
                           }
                        }
                     }
                  }
               }
            }
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV85TotValueHisProKgr = localUtil.format( AV84TotHisProKgr, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85TotValueHisProKgr", AV85TotValueHisProKgr);
      AV87TotValueHisProMtr = localUtil.format( AV86TotHisProMtr, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV87TotValueHisProMtr", AV87TotValueHisProMtr);
   }

   public void wb_table2_69_TI2( boolean wbgen )
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
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluehisprokgr_Internalname, httpContext.getMessage( "Tot Value His Pro Kgr", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'" + sPrefix + "',false,'" + sGXsfl_41_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluehisprokgr_Internalname, AV85TotValueHisProKgr, GXutil.rtrim( localUtil.format( AV85TotValueHisProKgr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,89);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluehisprokgr_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluehisprokgr_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WCIformedetalladoHdrsProduccion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluehispromtr_Internalname, httpContext.getMessage( "Tot Value His Pro Mtr", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 92,'" + sPrefix + "',false,'" + sGXsfl_41_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluehispromtr_Internalname, AV87TotValueHisProMtr, GXutil.rtrim( localUtil.format( AV87TotValueHisProMtr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,92);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluehispromtr_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluehispromtr_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WCIformedetalladoHdrsProduccion.htm");
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
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_69_TI2e( true) ;
      }
      else
      {
         wb_table2_69_TI2e( false) ;
      }
   }

   public void wb_table1_23_TI2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV27ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table3_28_TI2( true) ;
      }
      else
      {
         wb_table3_28_TI2( false) ;
      }
      return  ;
   }

   public void wb_table3_28_TI2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_23_TI2e( true) ;
      }
      else
      {
         wb_table1_23_TI2e( false) ;
      }
   }

   public void wb_table3_28_TI2( boolean wbgen )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV103FilterFullText, GXutil.rtrim( localUtil.format( AV103FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_WCIformedetalladoHdrsProduccion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_28_TI2e( true) ;
      }
      else
      {
         wb_table3_28_TI2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV5Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      AV9MaqCodInicial = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9MaqCodInicial", AV9MaqCodInicial);
      AV8MaqCodFinal = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8MaqCodFinal", AV8MaqCodFinal);
      AV7Hisprodti = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Hisprodti", localUtil.ttoc( AV7Hisprodti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV6HisProdtf = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6HisProdtf", localUtil.ttoc( AV6HisProdtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV105HisProReo = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV105HisProReo", GXutil.str( AV105HisProReo, 1, 0));
      AV106ParCod = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV106ParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV106ParCod), 4, 0));
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
      paTI2( ) ;
      wsTI2( ) ;
      weTI2( ) ;
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
      sCtrlAV5Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV9MaqCodInicial = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV8MaqCodFinal = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV7Hisprodti = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV6HisProdtf = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV105HisProReo = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV106ParCod = (String)getParm(obj,6,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      paTI2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "wciformedetalladohdrsproduccion", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      paTI2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV5Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
         AV9MaqCodInicial = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9MaqCodInicial", AV9MaqCodInicial);
         AV8MaqCodFinal = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8MaqCodFinal", AV8MaqCodFinal);
         AV7Hisprodti = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Hisprodti", localUtil.ttoc( AV7Hisprodti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV6HisProdtf = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6HisProdtf", localUtil.ttoc( AV6HisProdtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV105HisProReo = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV105HisProReo", GXutil.str( AV105HisProReo, 1, 0));
         AV106ParCod = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV106ParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV106ParCod), 4, 0));
      }
      wcpOAV5Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV5Emprcod") ;
      wcpOAV9MaqCodInicial = httpContext.cgiGet( sPrefix+"wcpOAV9MaqCodInicial") ;
      wcpOAV8MaqCodFinal = httpContext.cgiGet( sPrefix+"wcpOAV8MaqCodFinal") ;
      wcpOAV7Hisprodti = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV7Hisprodti"), 0) ;
      wcpOAV6HisProdtf = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV6HisProdtf"), 0) ;
      wcpOAV105HisProReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV105HisProReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV106ParCod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV106ParCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV5Emprcod, wcpOAV5Emprcod) != 0 ) || ( GXutil.strcmp(AV9MaqCodInicial, wcpOAV9MaqCodInicial) != 0 ) || ( GXutil.strcmp(AV8MaqCodFinal, wcpOAV8MaqCodFinal) != 0 ) || !( GXutil.dateCompare(AV7Hisprodti, wcpOAV7Hisprodti) ) || !( GXutil.dateCompare(AV6HisProdtf, wcpOAV6HisProdtf) ) || ( AV105HisProReo != wcpOAV105HisProReo ) || ( AV106ParCod != wcpOAV106ParCod ) ) )
      {
         setjustcreated();
      }
      wcpOAV5Emprcod = AV5Emprcod ;
      wcpOAV9MaqCodInicial = AV9MaqCodInicial ;
      wcpOAV8MaqCodFinal = AV8MaqCodFinal ;
      wcpOAV7Hisprodti = AV7Hisprodti ;
      wcpOAV6HisProdtf = AV6HisProdtf ;
      wcpOAV105HisProReo = AV105HisProReo ;
      wcpOAV106ParCod = AV106ParCod ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV5Emprcod = httpContext.cgiGet( sPrefix+"AV5Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV5Emprcod) > 0 )
      {
         AV5Emprcod = httpContext.cgiGet( sCtrlAV5Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      }
      else
      {
         AV5Emprcod = httpContext.cgiGet( sPrefix+"AV5Emprcod_PARM") ;
      }
      sCtrlAV9MaqCodInicial = httpContext.cgiGet( sPrefix+"AV9MaqCodInicial_CTRL") ;
      if ( GXutil.len( sCtrlAV9MaqCodInicial) > 0 )
      {
         AV9MaqCodInicial = httpContext.cgiGet( sCtrlAV9MaqCodInicial) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9MaqCodInicial", AV9MaqCodInicial);
      }
      else
      {
         AV9MaqCodInicial = httpContext.cgiGet( sPrefix+"AV9MaqCodInicial_PARM") ;
      }
      sCtrlAV8MaqCodFinal = httpContext.cgiGet( sPrefix+"AV8MaqCodFinal_CTRL") ;
      if ( GXutil.len( sCtrlAV8MaqCodFinal) > 0 )
      {
         AV8MaqCodFinal = httpContext.cgiGet( sCtrlAV8MaqCodFinal) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8MaqCodFinal", AV8MaqCodFinal);
      }
      else
      {
         AV8MaqCodFinal = httpContext.cgiGet( sPrefix+"AV8MaqCodFinal_PARM") ;
      }
      sCtrlAV7Hisprodti = httpContext.cgiGet( sPrefix+"AV7Hisprodti_CTRL") ;
      if ( GXutil.len( sCtrlAV7Hisprodti) > 0 )
      {
         AV7Hisprodti = localUtil.ctot( httpContext.cgiGet( sCtrlAV7Hisprodti), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Hisprodti", localUtil.ttoc( AV7Hisprodti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV7Hisprodti = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV7Hisprodti_PARM"), 0) ;
      }
      sCtrlAV6HisProdtf = httpContext.cgiGet( sPrefix+"AV6HisProdtf_CTRL") ;
      if ( GXutil.len( sCtrlAV6HisProdtf) > 0 )
      {
         AV6HisProdtf = localUtil.ctot( httpContext.cgiGet( sCtrlAV6HisProdtf), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6HisProdtf", localUtil.ttoc( AV6HisProdtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV6HisProdtf = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV6HisProdtf_PARM"), 0) ;
      }
      sCtrlAV105HisProReo = httpContext.cgiGet( sPrefix+"AV105HisProReo_CTRL") ;
      if ( GXutil.len( sCtrlAV105HisProReo) > 0 )
      {
         AV105HisProReo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV105HisProReo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV105HisProReo", GXutil.str( AV105HisProReo, 1, 0));
      }
      else
      {
         AV105HisProReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV105HisProReo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV106ParCod = httpContext.cgiGet( sPrefix+"AV106ParCod_CTRL") ;
      if ( GXutil.len( sCtrlAV106ParCod) > 0 )
      {
         AV106ParCod = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV106ParCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV106ParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV106ParCod), 4, 0));
      }
      else
      {
         AV106ParCod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV106ParCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      paTI2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      wsTI2( ) ;
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
      wsTI2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5Emprcod_PARM", GXutil.rtrim( AV5Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV5Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5Emprcod_CTRL", GXutil.rtrim( sCtrlAV5Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9MaqCodInicial_PARM", GXutil.rtrim( AV9MaqCodInicial));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV9MaqCodInicial)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9MaqCodInicial_CTRL", GXutil.rtrim( sCtrlAV9MaqCodInicial));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8MaqCodFinal_PARM", GXutil.rtrim( AV8MaqCodFinal));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8MaqCodFinal)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8MaqCodFinal_CTRL", GXutil.rtrim( sCtrlAV8MaqCodFinal));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7Hisprodti_PARM", localUtil.ttoc( AV7Hisprodti, 10, 8, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7Hisprodti)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7Hisprodti_CTRL", GXutil.rtrim( sCtrlAV7Hisprodti));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6HisProdtf_PARM", localUtil.ttoc( AV6HisProdtf, 10, 8, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV6HisProdtf)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6HisProdtf_CTRL", GXutil.rtrim( sCtrlAV6HisProdtf));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV105HisProReo_PARM", GXutil.ltrim( localUtil.ntoc( AV105HisProReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV105HisProReo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV105HisProReo_CTRL", GXutil.rtrim( sCtrlAV105HisProReo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV106ParCod_PARM", GXutil.ltrim( localUtil.ntoc( AV106ParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV106ParCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV106ParCod_CTRL", GXutil.rtrim( sCtrlAV106ParCod));
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
      weTI2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211557147", true, true);
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
      httpContext.AddJavascriptSource("wciformedetalladohdrsproduccion.js", "?20268211557147", false, true);
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
      edtMaqCod_Internalname = sPrefix+"MAQCOD_"+sGXsfl_41_idx ;
      edtMaqDsc_Internalname = sPrefix+"MAQDSC_"+sGXsfl_41_idx ;
      edtBarNHdr_Internalname = sPrefix+"BARNHDR_"+sGXsfl_41_idx ;
      edtHisProLot_Internalname = sPrefix+"HISPROLOT_"+sGXsfl_41_idx ;
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_41_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_41_idx ;
      edtPedidoClie_Internalname = sPrefix+"PEDIDOCLIE_"+sGXsfl_41_idx ;
      edtBarFecGen_Internalname = sPrefix+"BARFECGEN_"+sGXsfl_41_idx ;
      edtBarSer_Internalname = sPrefix+"BARSER_"+sGXsfl_41_idx ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC_"+sGXsfl_41_idx ;
      edtBarTipArtD_Internalname = sPrefix+"BARTIPARTD_"+sGXsfl_41_idx ;
      edtBarTipColD_Internalname = sPrefix+"BARTIPCOLD_"+sGXsfl_41_idx ;
      edtFase_Internalname = sPrefix+"FASE_"+sGXsfl_41_idx ;
      edtFaseDescri_Internalname = sPrefix+"FASEDESCRI_"+sGXsfl_41_idx ;
      edtHisProDTI_Internalname = sPrefix+"HISPRODTI_"+sGXsfl_41_idx ;
      edtHisProDTF_Internalname = sPrefix+"HISPRODTF_"+sGXsfl_41_idx ;
      edtHisProKgr_Internalname = sPrefix+"HISPROKGR_"+sGXsfl_41_idx ;
      edtHisProMtr_Internalname = sPrefix+"HISPROMTR_"+sGXsfl_41_idx ;
      edtParCod_Internalname = sPrefix+"PARCOD_"+sGXsfl_41_idx ;
      edtParCodNom_Internalname = sPrefix+"PARCODNOM_"+sGXsfl_41_idx ;
      edtGruOpeCodN_Internalname = sPrefix+"GRUOPECODN_"+sGXsfl_41_idx ;
      edtavTinte_Internalname = sPrefix+"vTINTE_"+sGXsfl_41_idx ;
      edtHisProTur_Internalname = sPrefix+"HISPROTUR_"+sGXsfl_41_idx ;
      edtavTiempom_Internalname = sPrefix+"vTIEMPOM_"+sGXsfl_41_idx ;
      edtHisProReo_Internalname = sPrefix+"HISPROREO_"+sGXsfl_41_idx ;
   }

   public void subsflControlProps_fel_412( )
   {
      edtMaqCod_Internalname = sPrefix+"MAQCOD_"+sGXsfl_41_fel_idx ;
      edtMaqDsc_Internalname = sPrefix+"MAQDSC_"+sGXsfl_41_fel_idx ;
      edtBarNHdr_Internalname = sPrefix+"BARNHDR_"+sGXsfl_41_fel_idx ;
      edtHisProLot_Internalname = sPrefix+"HISPROLOT_"+sGXsfl_41_fel_idx ;
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_41_fel_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_41_fel_idx ;
      edtPedidoClie_Internalname = sPrefix+"PEDIDOCLIE_"+sGXsfl_41_fel_idx ;
      edtBarFecGen_Internalname = sPrefix+"BARFECGEN_"+sGXsfl_41_fel_idx ;
      edtBarSer_Internalname = sPrefix+"BARSER_"+sGXsfl_41_fel_idx ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC_"+sGXsfl_41_fel_idx ;
      edtBarTipArtD_Internalname = sPrefix+"BARTIPARTD_"+sGXsfl_41_fel_idx ;
      edtBarTipColD_Internalname = sPrefix+"BARTIPCOLD_"+sGXsfl_41_fel_idx ;
      edtFase_Internalname = sPrefix+"FASE_"+sGXsfl_41_fel_idx ;
      edtFaseDescri_Internalname = sPrefix+"FASEDESCRI_"+sGXsfl_41_fel_idx ;
      edtHisProDTI_Internalname = sPrefix+"HISPRODTI_"+sGXsfl_41_fel_idx ;
      edtHisProDTF_Internalname = sPrefix+"HISPRODTF_"+sGXsfl_41_fel_idx ;
      edtHisProKgr_Internalname = sPrefix+"HISPROKGR_"+sGXsfl_41_fel_idx ;
      edtHisProMtr_Internalname = sPrefix+"HISPROMTR_"+sGXsfl_41_fel_idx ;
      edtParCod_Internalname = sPrefix+"PARCOD_"+sGXsfl_41_fel_idx ;
      edtParCodNom_Internalname = sPrefix+"PARCODNOM_"+sGXsfl_41_fel_idx ;
      edtGruOpeCodN_Internalname = sPrefix+"GRUOPECODN_"+sGXsfl_41_fel_idx ;
      edtavTinte_Internalname = sPrefix+"vTINTE_"+sGXsfl_41_fel_idx ;
      edtHisProTur_Internalname = sPrefix+"HISPROTUR_"+sGXsfl_41_fel_idx ;
      edtavTiempom_Internalname = sPrefix+"vTIEMPOM_"+sGXsfl_41_fel_idx ;
      edtHisProReo_Internalname = sPrefix+"HISPROREO_"+sGXsfl_41_fel_idx ;
   }

   public void sendrow_412( )
   {
      subsflControlProps_412( ) ;
      wbTI0( ) ;
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
            httpContext.writeText( " class=\""+"GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_41_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMaqCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqCod_Internalname,GXutil.rtrim( A602MaqCod),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMaqCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtMaqCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMaqDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqDsc_Internalname,GXutil.rtrim( A606MaqDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMaqDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMaqDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarNHdr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNHdr_Internalname,GXutil.rtrim( A13696BarNHdr),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarNHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarNHdr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtHisProLot_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProLot_Internalname,GXutil.rtrim( A3610HisProLot),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisProLot_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHisProLot_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCliCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCliNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPedidoClie_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPedidoClie_Internalname,GXutil.rtrim( A13878PedidoClie),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPedidoClie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPedidoClie_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarFecGen_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecGen_Internalname,localUtil.format(A159BarFecGen, "99/99/99"),localUtil.format( A159BarFecGen, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFecGen_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarFecGen_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarSer_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSer_Internalname,GXutil.rtrim( A212BarSer),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarSer_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarSerDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSerDsc_Internalname,GXutil.rtrim( A1652BarSerDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSerDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarSerDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarTipArtD_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTipArtD_Internalname,GXutil.rtrim( A13711BarTipArtD),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarTipArtD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarTipArtD_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarTipColD_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTipColD_Internalname,GXutil.rtrim( A13868BarTipColD),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarTipColD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarTipColD_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtFase_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFase_Internalname,GXutil.rtrim( A461Fase),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtFase_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtFase_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtFaseDescri_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFaseDescri_Internalname,GXutil.rtrim( A13893FaseDescri),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtFaseDescri_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtFaseDescri_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisProDTI_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProDTI_Internalname,localUtil.ttoc( A4440HisProDTI, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A4440HisProDTI, "99/99/99 99:99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisProDTI_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtHisProDTI_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisProDTF_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProDTF_Internalname,localUtil.ttoc( A4441HisProDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A4441HisProDTF, "99/99/99 99:99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisProDTF_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtHisProDTF_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisProKgr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProKgr_Internalname,GXutil.ltrim( localUtil.ntoc( A1525HisProKgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1525HisProKgr, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisProKgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHisProKgr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisProMtr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A1526HisProMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1526HisProMtr, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisProMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHisProMtr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtParCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParCod_Internalname,GXutil.ltrim( localUtil.ntoc( A656ParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A656ParCod), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtParCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtParCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtParCodNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParCodNom_Internalname,GXutil.rtrim( A867ParCodNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'",edtParCodNom_Link,"","","",edtParCodNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtParCodNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGruOpeCodN_Internalname,GXutil.rtrim( A13892GruOpeCodN),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtGruOpeCodN_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTinte_Internalname,GXutil.rtrim( AV90Tinte),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavTinte_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavTinte_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisProTur_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProTur_Internalname,GXutil.ltrim( localUtil.ntoc( A566HisProTur, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A566HisProTur), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisProTur_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHisProTur_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavTiempom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTiempom_Internalname,GXutil.ltrim( localUtil.ntoc( AV88Tiempom, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavTiempom_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV88Tiempom), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV88Tiempom), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavTiempom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavTiempom_Visible),Integer.valueOf(edtavTiempom_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisProReo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProReo_Internalname,GXutil.ltrim( localUtil.ntoc( A3612HisProReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3612HisProReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisProReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHisProReo_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashesTI2( ) ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMaqCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código Máquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMaqDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion Maquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarNHdr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisProLot_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Lote", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPedidoClie_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pedido Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarFecGen_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarSer_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Serie", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarSerDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción Serie", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarTipArtD_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarTipColD_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "TC", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtFase_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtFaseDescri_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisProDTI_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Inicio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisProDTF_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fin", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisProKgr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisProMtr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtParCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Paro", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtParCodNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisProTur_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "T", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavTiempom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "TReal", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisProReo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo Reoperado", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A602MaqCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMaqCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A606MaqDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMaqDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13696BarNHdr));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarNHdr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3610HisProLot));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisProLot_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A279CliNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13878PedidoClie));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPedidoClie_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A159BarFecGen, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarFecGen_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A212BarSer));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarSer_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1652BarSerDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarSerDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13711BarTipArtD));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarTipArtD_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13868BarTipColD));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarTipColD_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A461Fase));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtFase_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13893FaseDescri));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtFaseDescri_Visible, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1525HisProKgr, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisProKgr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1526HisProMtr, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisProMtr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A656ParCod, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtParCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A867ParCodNom));
         GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtParCodNom_Link));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtParCodNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13892GruOpeCodN));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV90Tinte));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTinte_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A566HisProTur, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisProTur_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV88Tiempom, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTiempom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavTiempom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3612HisProReo, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisProReo_Visible, (byte)(5), (byte)(0), ".", "")));
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
      edtMaqCod_Internalname = sPrefix+"MAQCOD" ;
      edtMaqDsc_Internalname = sPrefix+"MAQDSC" ;
      edtBarNHdr_Internalname = sPrefix+"BARNHDR" ;
      edtHisProLot_Internalname = sPrefix+"HISPROLOT" ;
      edtCliCod_Internalname = sPrefix+"CLICOD" ;
      edtCliNom_Internalname = sPrefix+"CLINOM" ;
      edtPedidoClie_Internalname = sPrefix+"PEDIDOCLIE" ;
      edtBarFecGen_Internalname = sPrefix+"BARFECGEN" ;
      edtBarSer_Internalname = sPrefix+"BARSER" ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC" ;
      edtBarTipArtD_Internalname = sPrefix+"BARTIPARTD" ;
      edtBarTipColD_Internalname = sPrefix+"BARTIPCOLD" ;
      edtFase_Internalname = sPrefix+"FASE" ;
      edtFaseDescri_Internalname = sPrefix+"FASEDESCRI" ;
      edtHisProDTI_Internalname = sPrefix+"HISPRODTI" ;
      edtHisProDTF_Internalname = sPrefix+"HISPRODTF" ;
      edtHisProKgr_Internalname = sPrefix+"HISPROKGR" ;
      edtHisProMtr_Internalname = sPrefix+"HISPROMTR" ;
      edtParCod_Internalname = sPrefix+"PARCOD" ;
      edtParCodNom_Internalname = sPrefix+"PARCODNOM" ;
      edtGruOpeCodN_Internalname = sPrefix+"GRUOPECODN" ;
      edtavTinte_Internalname = sPrefix+"vTINTE" ;
      edtHisProTur_Internalname = sPrefix+"HISPROTUR" ;
      edtavTiempom_Internalname = sPrefix+"vTIEMPOM" ;
      edtHisProReo_Internalname = sPrefix+"HISPROREO" ;
      edtavTotvaluehisprokgr_Internalname = sPrefix+"vTOTVALUEHISPROKGR" ;
      edtavTotvaluehispromtr_Internalname = sPrefix+"vTOTVALUEHISPROMTR" ;
      tblGridtabletotalizer_Internalname = sPrefix+"GRIDTABLETOTALIZER" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      edtavDdo_barfecgenauxdate_Internalname = sPrefix+"vDDO_BARFECGENAUXDATE" ;
      divDdo_barfecgenauxdates_Internalname = sPrefix+"DDO_BARFECGENAUXDATES" ;
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
      subGrid_Allowselection = (byte)(0) ;
      subGrid_Header = "" ;
      edtHisProReo_Jsonclick = "" ;
      edtavTiempom_Jsonclick = "" ;
      edtavTiempom_Enabled = 0 ;
      edtHisProTur_Jsonclick = "" ;
      edtavTinte_Jsonclick = "" ;
      edtavTinte_Enabled = 0 ;
      edtGruOpeCodN_Jsonclick = "" ;
      edtParCodNom_Jsonclick = "" ;
      edtParCodNom_Link = "" ;
      edtParCod_Jsonclick = "" ;
      edtHisProMtr_Jsonclick = "" ;
      edtHisProKgr_Jsonclick = "" ;
      edtHisProDTF_Jsonclick = "" ;
      edtHisProDTI_Jsonclick = "" ;
      edtFaseDescri_Jsonclick = "" ;
      edtFase_Jsonclick = "" ;
      edtBarTipColD_Jsonclick = "" ;
      edtBarTipArtD_Jsonclick = "" ;
      edtBarSerDsc_Jsonclick = "" ;
      edtBarSer_Jsonclick = "" ;
      edtBarFecGen_Jsonclick = "" ;
      edtPedidoClie_Jsonclick = "" ;
      edtCliNom_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      edtHisProLot_Jsonclick = "" ;
      edtBarNHdr_Jsonclick = "" ;
      edtMaqDsc_Jsonclick = "" ;
      edtMaqCod_Jsonclick = "" ;
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavTotvaluehispromtr_Jsonclick = "" ;
      edtavTotvaluehispromtr_Enabled = 1 ;
      edtavTotvaluehisprokgr_Jsonclick = "" ;
      edtavTotvaluehisprokgr_Enabled = 1 ;
      edtHisProReo_Visible = -1 ;
      edtavTiempom_Visible = -1 ;
      edtHisProTur_Visible = -1 ;
      edtParCodNom_Visible = -1 ;
      edtParCod_Visible = -1 ;
      edtHisProMtr_Visible = -1 ;
      edtHisProKgr_Visible = -1 ;
      edtHisProDTF_Visible = -1 ;
      edtHisProDTI_Visible = -1 ;
      edtFaseDescri_Visible = -1 ;
      edtFase_Visible = -1 ;
      edtBarTipColD_Visible = -1 ;
      edtBarTipArtD_Visible = -1 ;
      edtBarSerDsc_Visible = -1 ;
      edtBarSer_Visible = -1 ;
      edtBarFecGen_Visible = -1 ;
      edtPedidoClie_Visible = -1 ;
      edtCliNom_Visible = -1 ;
      edtCliCod_Visible = -1 ;
      edtHisProLot_Visible = -1 ;
      edtBarNHdr_Visible = -1 ;
      edtMaqDsc_Visible = -1 ;
      edtMaqCod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_hisprodtfauxdate_Jsonclick = "" ;
      edtavDdo_hisprodtiauxdate_Jsonclick = "" ;
      edtavDdo_barfecgenauxdate_Jsonclick = "" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "WCIformedetalladoHdrsProduccionGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic|Dynamic|Dynamic|Dynamic||Dynamic|Dynamic||Dynamic|Dynamic|Dynamic|Dynamic|Dynamic|Dynamic||||||Dynamic|||" ;
      Ddo_grid_Includedatalist = "T|T|T|T||T|T||T|T|T|T|T|T||||||T|||" ;
      Ddo_grid_Filterisrange = "||||T||||||||||||T|T|T||T||T" ;
      Ddo_grid_Filtertype = "Character|Character|Character|Character|Numeric|Character|Character|Date|Character|Character|Character|Character|Character|Character|Date|Date|Numeric|Numeric|Numeric|Character|Numeric||Numeric" ;
      Ddo_grid_Includefilter = "T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T||T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T||T|T|T||T|T|T|T||T||T|T|T|T|T|T|T||T" ;
      Ddo_grid_Columnssortvalues = "1|2||3|4|5||6|7|8|9||10||11|12|13|14|15|16|17||18" ;
      Ddo_grid_Columnids = "0:MaqCod|1:MaqDsc|2:BarNHdr|3:HisProLot|4:CliCod|5:CliNom|6:PedidoCliente|7:BarFecGen|8:BarSer|9:BarSerDsc|10:BarTipArtDsc|11:BarTipColDsc|12:Fase|13:FaseDescripcion|14:HisProDTI|15:HisProDTF|16:HisProKgr|17:HisProMtr|18:ParCod|19:ParCodNom|22:HisProTur|23:Tiempom|24:HisProReo" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9MaqCodInicial',fld:'vMAQCODINICIAL',pic:''},{av:'AV8MaqCodFinal',fld:'vMAQCODFINAL',pic:''},{av:'AV7Hisprodti',fld:'vHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV6HisProdtf',fld:'vHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV105HisProReo',fld:'vHISPROREO',pic:'9'},{av:'AV106ParCod',fld:'vPARCOD',pic:'ZZZ9'},{av:'AV103FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV31TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV32TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV59TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV60TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV34TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV35TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV101TFHisProLot',fld:'vTFHISPROLOT',pic:''},{av:'AV102TFHisProLot_Sel',fld:'vTFHISPROLOT_SEL',pic:''},{av:'AV62TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV63TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV65TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV66TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV121TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV122TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV68TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV73TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV74TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV76TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV77TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV117TFBarTipArtDsc',fld:'vTFBARTIPARTDSC',pic:''},{av:'AV118TFBarTipArtDsc_Sel',fld:'vTFBARTIPARTDSC_SEL',pic:''},{av:'AV119TFBarTipColDsc',fld:'vTFBARTIPCOLDSC',pic:''},{av:'AV120TFBarTipColDsc_Sel',fld:'vTFBARTIPCOLDSC_SEL',pic:''},{av:'AV37TFFase',fld:'vTFFASE',pic:''},{av:'AV38TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV125TFFaseDescripcion',fld:'vTFFASEDESCRIPCION',pic:''},{av:'AV126TFFaseDescripcion_Sel',fld:'vTFFASEDESCRIPCION_SEL',pic:''},{av:'AV40TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV45TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV79TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV80TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV82TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV83TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV92TFParCod',fld:'vTFPARCOD',pic:'ZZZ9'},{av:'AV93TFParCod_To',fld:'vTFPARCOD_TO',pic:'ZZZ9'},{av:'AV98TFParCodNom',fld:'vTFPARCODNOM',pic:''},{av:'AV99TFParCodNom_Sel',fld:'vTFPARCODNOM_SEL',pic:''},{av:'AV95TFHisProTur',fld:'vTFHISPROTUR',pic:'9'},{av:'AV96TFHisProTur_To',fld:'vTFHISPROTUR_TO',pic:'9'},{av:'AV107TFHisProReo',fld:'vTFHISPROREO',pic:'9'},{av:'AV108TFHisProReo_To',fld:'vTFHISPROREO_TO',pic:'9'},{av:'AV175Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV84TotHisProKgr',fld:'vTOTHISPROKGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV86TotHisProMtr',fld:'vTOTHISPROMTR',pic:'ZZZZZ9.99',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A4441HisProDTF',fld:'HISPRODTF',pic:'99/99/99 99:99:99'},{av:'A3612HisProReo',fld:'HISPROREO',pic:'9'},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'},{av:'A1525HisProKgr',fld:'HISPROKGR',pic:'ZZZZZ9.99'},{av:'A1526HisProMtr',fld:'HISPROMTR',pic:'ZZZZZ9.99'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtMaqCod_Visible',ctrl:'MAQCOD',prop:'Visible'},{av:'edtMaqDsc_Visible',ctrl:'MAQDSC',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtHisProLot_Visible',ctrl:'HISPROLOT',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtPedidoClie_Visible',ctrl:'PEDIDOCLIE',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarTipArtD_Visible',ctrl:'BARTIPARTD',prop:'Visible'},{av:'edtBarTipColD_Visible',ctrl:'BARTIPCOLD',prop:'Visible'},{av:'edtFase_Visible',ctrl:'FASE',prop:'Visible'},{av:'edtFaseDescri_Visible',ctrl:'FASEDESCRI',prop:'Visible'},{av:'edtHisProDTI_Visible',ctrl:'HISPRODTI',prop:'Visible'},{av:'edtHisProDTF_Visible',ctrl:'HISPRODTF',prop:'Visible'},{av:'edtHisProKgr_Visible',ctrl:'HISPROKGR',prop:'Visible'},{av:'edtHisProMtr_Visible',ctrl:'HISPROMTR',prop:'Visible'},{av:'edtParCod_Visible',ctrl:'PARCOD',prop:'Visible'},{av:'edtParCodNom_Visible',ctrl:'PARCODNOM',prop:'Visible'},{av:'edtHisProTur_Visible',ctrl:'HISPROTUR',prop:'Visible'},{av:'edtavTiempom_Visible',ctrl:'vTIEMPOM',prop:'Visible'},{av:'edtHisProReo_Visible',ctrl:'HISPROREO',prop:'Visible'},{av:'AV52GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV53GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV27ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV15GridState',fld:'vGRIDSTATE',pic:''},{av:'AV84TotHisProKgr',fld:'vTOTHISPROKGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV86TotHisProMtr',fld:'vTOTHISPROMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV85TotValueHisProKgr',fld:'vTOTVALUEHISPROKGR',pic:''},{av:'AV87TotValueHisProMtr',fld:'vTOTVALUEHISPROMTR',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e12TI2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9MaqCodInicial',fld:'vMAQCODINICIAL',pic:''},{av:'AV8MaqCodFinal',fld:'vMAQCODFINAL',pic:''},{av:'AV7Hisprodti',fld:'vHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV6HisProdtf',fld:'vHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV105HisProReo',fld:'vHISPROREO',pic:'9'},{av:'AV106ParCod',fld:'vPARCOD',pic:'ZZZ9'},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV103FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV31TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV32TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV59TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV60TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV34TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV35TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV101TFHisProLot',fld:'vTFHISPROLOT',pic:''},{av:'AV102TFHisProLot_Sel',fld:'vTFHISPROLOT_SEL',pic:''},{av:'AV62TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV63TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV65TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV66TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV121TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV122TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV68TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV73TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV74TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV76TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV77TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV117TFBarTipArtDsc',fld:'vTFBARTIPARTDSC',pic:''},{av:'AV118TFBarTipArtDsc_Sel',fld:'vTFBARTIPARTDSC_SEL',pic:''},{av:'AV119TFBarTipColDsc',fld:'vTFBARTIPCOLDSC',pic:''},{av:'AV120TFBarTipColDsc_Sel',fld:'vTFBARTIPCOLDSC_SEL',pic:''},{av:'AV37TFFase',fld:'vTFFASE',pic:''},{av:'AV38TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV125TFFaseDescripcion',fld:'vTFFASEDESCRIPCION',pic:''},{av:'AV126TFFaseDescripcion_Sel',fld:'vTFFASEDESCRIPCION_SEL',pic:''},{av:'AV40TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV45TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV79TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV80TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV82TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV83TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV92TFParCod',fld:'vTFPARCOD',pic:'ZZZ9'},{av:'AV93TFParCod_To',fld:'vTFPARCOD_TO',pic:'ZZZ9'},{av:'AV98TFParCodNom',fld:'vTFPARCODNOM',pic:''},{av:'AV99TFParCodNom_Sel',fld:'vTFPARCODNOM_SEL',pic:''},{av:'AV95TFHisProTur',fld:'vTFHISPROTUR',pic:'9'},{av:'AV96TFHisProTur_To',fld:'vTFHISPROTUR_TO',pic:'9'},{av:'AV107TFHisProReo',fld:'vTFHISPROREO',pic:'9'},{av:'AV108TFHisProReo_To',fld:'vTFHISPROREO_TO',pic:'9'},{av:'AV175Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV84TotHisProKgr',fld:'vTOTHISPROKGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV86TotHisProMtr',fld:'vTOTHISPROMTR',pic:'ZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e13TI2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9MaqCodInicial',fld:'vMAQCODINICIAL',pic:''},{av:'AV8MaqCodFinal',fld:'vMAQCODFINAL',pic:''},{av:'AV7Hisprodti',fld:'vHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV6HisProdtf',fld:'vHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV105HisProReo',fld:'vHISPROREO',pic:'9'},{av:'AV106ParCod',fld:'vPARCOD',pic:'ZZZ9'},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV103FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV31TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV32TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV59TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV60TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV34TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV35TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV101TFHisProLot',fld:'vTFHISPROLOT',pic:''},{av:'AV102TFHisProLot_Sel',fld:'vTFHISPROLOT_SEL',pic:''},{av:'AV62TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV63TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV65TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV66TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV121TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV122TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV68TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV73TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV74TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV76TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV77TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV117TFBarTipArtDsc',fld:'vTFBARTIPARTDSC',pic:''},{av:'AV118TFBarTipArtDsc_Sel',fld:'vTFBARTIPARTDSC_SEL',pic:''},{av:'AV119TFBarTipColDsc',fld:'vTFBARTIPCOLDSC',pic:''},{av:'AV120TFBarTipColDsc_Sel',fld:'vTFBARTIPCOLDSC_SEL',pic:''},{av:'AV37TFFase',fld:'vTFFASE',pic:''},{av:'AV38TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV125TFFaseDescripcion',fld:'vTFFASEDESCRIPCION',pic:''},{av:'AV126TFFaseDescripcion_Sel',fld:'vTFFASEDESCRIPCION_SEL',pic:''},{av:'AV40TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV45TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV79TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV80TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV82TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV83TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV92TFParCod',fld:'vTFPARCOD',pic:'ZZZ9'},{av:'AV93TFParCod_To',fld:'vTFPARCOD_TO',pic:'ZZZ9'},{av:'AV98TFParCodNom',fld:'vTFPARCODNOM',pic:''},{av:'AV99TFParCodNom_Sel',fld:'vTFPARCODNOM_SEL',pic:''},{av:'AV95TFHisProTur',fld:'vTFHISPROTUR',pic:'9'},{av:'AV96TFHisProTur_To',fld:'vTFHISPROTUR_TO',pic:'9'},{av:'AV107TFHisProReo',fld:'vTFHISPROREO',pic:'9'},{av:'AV108TFHisProReo_To',fld:'vTFHISPROREO_TO',pic:'9'},{av:'AV175Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV84TotHisProKgr',fld:'vTOTHISPROKGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV86TotHisProMtr',fld:'vTOTHISPROMTR',pic:'ZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e14TI2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9MaqCodInicial',fld:'vMAQCODINICIAL',pic:''},{av:'AV8MaqCodFinal',fld:'vMAQCODFINAL',pic:''},{av:'AV7Hisprodti',fld:'vHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV6HisProdtf',fld:'vHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV105HisProReo',fld:'vHISPROREO',pic:'9'},{av:'AV106ParCod',fld:'vPARCOD',pic:'ZZZ9'},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV103FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV31TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV32TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV59TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV60TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV34TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV35TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV101TFHisProLot',fld:'vTFHISPROLOT',pic:''},{av:'AV102TFHisProLot_Sel',fld:'vTFHISPROLOT_SEL',pic:''},{av:'AV62TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV63TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV65TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV66TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV121TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV122TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV68TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV73TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV74TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV76TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV77TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV117TFBarTipArtDsc',fld:'vTFBARTIPARTDSC',pic:''},{av:'AV118TFBarTipArtDsc_Sel',fld:'vTFBARTIPARTDSC_SEL',pic:''},{av:'AV119TFBarTipColDsc',fld:'vTFBARTIPCOLDSC',pic:''},{av:'AV120TFBarTipColDsc_Sel',fld:'vTFBARTIPCOLDSC_SEL',pic:''},{av:'AV37TFFase',fld:'vTFFASE',pic:''},{av:'AV38TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV125TFFaseDescripcion',fld:'vTFFASEDESCRIPCION',pic:''},{av:'AV126TFFaseDescripcion_Sel',fld:'vTFFASEDESCRIPCION_SEL',pic:''},{av:'AV40TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV45TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV79TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV80TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV82TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV83TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV92TFParCod',fld:'vTFPARCOD',pic:'ZZZ9'},{av:'AV93TFParCod_To',fld:'vTFPARCOD_TO',pic:'ZZZ9'},{av:'AV98TFParCodNom',fld:'vTFPARCODNOM',pic:''},{av:'AV99TFParCodNom_Sel',fld:'vTFPARCODNOM_SEL',pic:''},{av:'AV95TFHisProTur',fld:'vTFHISPROTUR',pic:'9'},{av:'AV96TFHisProTur_To',fld:'vTFHISPROTUR_TO',pic:'9'},{av:'AV107TFHisProReo',fld:'vTFHISPROREO',pic:'9'},{av:'AV108TFHisProReo_To',fld:'vTFHISPROREO_TO',pic:'9'},{av:'AV175Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV84TotHisProKgr',fld:'vTOTHISPROKGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV86TotHisProMtr',fld:'vTOTHISPROMTR',pic:'ZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV107TFHisProReo',fld:'vTFHISPROREO',pic:'9'},{av:'AV108TFHisProReo_To',fld:'vTFHISPROREO_TO',pic:'9'},{av:'AV95TFHisProTur',fld:'vTFHISPROTUR',pic:'9'},{av:'AV96TFHisProTur_To',fld:'vTFHISPROTUR_TO',pic:'9'},{av:'AV98TFParCodNom',fld:'vTFPARCODNOM',pic:''},{av:'AV99TFParCodNom_Sel',fld:'vTFPARCODNOM_SEL',pic:''},{av:'AV92TFParCod',fld:'vTFPARCOD',pic:'ZZZ9'},{av:'AV93TFParCod_To',fld:'vTFPARCOD_TO',pic:'ZZZ9'},{av:'AV82TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV83TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV79TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV80TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV45TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV40TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV125TFFaseDescripcion',fld:'vTFFASEDESCRIPCION',pic:''},{av:'AV126TFFaseDescripcion_Sel',fld:'vTFFASEDESCRIPCION_SEL',pic:''},{av:'AV37TFFase',fld:'vTFFASE',pic:''},{av:'AV38TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV119TFBarTipColDsc',fld:'vTFBARTIPCOLDSC',pic:''},{av:'AV120TFBarTipColDsc_Sel',fld:'vTFBARTIPCOLDSC_SEL',pic:''},{av:'AV117TFBarTipArtDsc',fld:'vTFBARTIPARTDSC',pic:''},{av:'AV118TFBarTipArtDsc_Sel',fld:'vTFBARTIPARTDSC_SEL',pic:''},{av:'AV76TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV77TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV73TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV74TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV68TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV121TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV122TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV65TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV66TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV62TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV63TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV101TFHisProLot',fld:'vTFHISPROLOT',pic:''},{av:'AV102TFHisProLot_Sel',fld:'vTFHISPROLOT_SEL',pic:''},{av:'AV34TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV35TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV59TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV60TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV31TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV32TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e20TI2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'},{av:'A461Fase',fld:'FASE',pic:''},{av:'A3610HisProLot',fld:'HISPROLOT',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A5605HisProTr2',fld:'HISPROTR2',pic:'ZZZ9'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'edtParCodNom_Link',ctrl:'PARCODNOM',prop:'Link'},{av:'AV90Tinte',fld:'vTINTE',pic:''},{av:'AV88Tiempom',fld:'vTIEMPOM',pic:'ZZZ9'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e15TI2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9MaqCodInicial',fld:'vMAQCODINICIAL',pic:''},{av:'AV8MaqCodFinal',fld:'vMAQCODFINAL',pic:''},{av:'AV7Hisprodti',fld:'vHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV6HisProdtf',fld:'vHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV105HisProReo',fld:'vHISPROREO',pic:'9'},{av:'AV106ParCod',fld:'vPARCOD',pic:'ZZZ9'},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV103FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV31TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV32TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV59TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV60TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV34TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV35TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV101TFHisProLot',fld:'vTFHISPROLOT',pic:''},{av:'AV102TFHisProLot_Sel',fld:'vTFHISPROLOT_SEL',pic:''},{av:'AV62TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV63TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV65TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV66TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV121TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV122TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV68TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV73TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV74TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV76TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV77TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV117TFBarTipArtDsc',fld:'vTFBARTIPARTDSC',pic:''},{av:'AV118TFBarTipArtDsc_Sel',fld:'vTFBARTIPARTDSC_SEL',pic:''},{av:'AV119TFBarTipColDsc',fld:'vTFBARTIPCOLDSC',pic:''},{av:'AV120TFBarTipColDsc_Sel',fld:'vTFBARTIPCOLDSC_SEL',pic:''},{av:'AV37TFFase',fld:'vTFFASE',pic:''},{av:'AV38TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV125TFFaseDescripcion',fld:'vTFFASEDESCRIPCION',pic:''},{av:'AV126TFFaseDescripcion_Sel',fld:'vTFFASEDESCRIPCION_SEL',pic:''},{av:'AV40TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV45TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV79TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV80TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV82TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV83TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV92TFParCod',fld:'vTFPARCOD',pic:'ZZZ9'},{av:'AV93TFParCod_To',fld:'vTFPARCOD_TO',pic:'ZZZ9'},{av:'AV98TFParCodNom',fld:'vTFPARCODNOM',pic:''},{av:'AV99TFParCodNom_Sel',fld:'vTFPARCODNOM_SEL',pic:''},{av:'AV95TFHisProTur',fld:'vTFHISPROTUR',pic:'9'},{av:'AV96TFHisProTur_To',fld:'vTFHISPROTUR_TO',pic:'9'},{av:'AV107TFHisProReo',fld:'vTFHISPROREO',pic:'9'},{av:'AV108TFHisProReo_To',fld:'vTFHISPROREO_TO',pic:'9'},{av:'AV175Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV84TotHisProKgr',fld:'vTOTHISPROKGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV86TotHisProMtr',fld:'vTOTHISPROMTR',pic:'ZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A4441HisProDTF',fld:'HISPRODTF',pic:'99/99/99 99:99:99'},{av:'A3612HisProReo',fld:'HISPROREO',pic:'9'},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'},{av:'A1525HisProKgr',fld:'HISPROKGR',pic:'ZZZZZ9.99'},{av:'A1526HisProMtr',fld:'HISPROMTR',pic:'ZZZZZ9.99'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtMaqCod_Visible',ctrl:'MAQCOD',prop:'Visible'},{av:'edtMaqDsc_Visible',ctrl:'MAQDSC',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtHisProLot_Visible',ctrl:'HISPROLOT',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtPedidoClie_Visible',ctrl:'PEDIDOCLIE',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarTipArtD_Visible',ctrl:'BARTIPARTD',prop:'Visible'},{av:'edtBarTipColD_Visible',ctrl:'BARTIPCOLD',prop:'Visible'},{av:'edtFase_Visible',ctrl:'FASE',prop:'Visible'},{av:'edtFaseDescri_Visible',ctrl:'FASEDESCRI',prop:'Visible'},{av:'edtHisProDTI_Visible',ctrl:'HISPRODTI',prop:'Visible'},{av:'edtHisProDTF_Visible',ctrl:'HISPRODTF',prop:'Visible'},{av:'edtHisProKgr_Visible',ctrl:'HISPROKGR',prop:'Visible'},{av:'edtHisProMtr_Visible',ctrl:'HISPROMTR',prop:'Visible'},{av:'edtParCod_Visible',ctrl:'PARCOD',prop:'Visible'},{av:'edtParCodNom_Visible',ctrl:'PARCODNOM',prop:'Visible'},{av:'edtHisProTur_Visible',ctrl:'HISPROTUR',prop:'Visible'},{av:'edtavTiempom_Visible',ctrl:'vTIEMPOM',prop:'Visible'},{av:'edtHisProReo_Visible',ctrl:'HISPROREO',prop:'Visible'},{av:'AV52GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV53GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV27ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV15GridState',fld:'vGRIDSTATE',pic:''},{av:'AV84TotHisProKgr',fld:'vTOTHISPROKGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV86TotHisProMtr',fld:'vTOTHISPROMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV85TotValueHisProKgr',fld:'vTOTVALUEHISPROKGR',pic:''},{av:'AV87TotValueHisProMtr',fld:'vTOTVALUEHISPROMTR',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e11TI2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9MaqCodInicial',fld:'vMAQCODINICIAL',pic:''},{av:'AV8MaqCodFinal',fld:'vMAQCODFINAL',pic:''},{av:'AV7Hisprodti',fld:'vHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV6HisProdtf',fld:'vHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV105HisProReo',fld:'vHISPROREO',pic:'9'},{av:'AV106ParCod',fld:'vPARCOD',pic:'ZZZ9'},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV103FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV31TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV32TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV59TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV60TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV34TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV35TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV101TFHisProLot',fld:'vTFHISPROLOT',pic:''},{av:'AV102TFHisProLot_Sel',fld:'vTFHISPROLOT_SEL',pic:''},{av:'AV62TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV63TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV65TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV66TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV121TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV122TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV68TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV73TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV74TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV76TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV77TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV117TFBarTipArtDsc',fld:'vTFBARTIPARTDSC',pic:''},{av:'AV118TFBarTipArtDsc_Sel',fld:'vTFBARTIPARTDSC_SEL',pic:''},{av:'AV119TFBarTipColDsc',fld:'vTFBARTIPCOLDSC',pic:''},{av:'AV120TFBarTipColDsc_Sel',fld:'vTFBARTIPCOLDSC_SEL',pic:''},{av:'AV37TFFase',fld:'vTFFASE',pic:''},{av:'AV38TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV125TFFaseDescripcion',fld:'vTFFASEDESCRIPCION',pic:''},{av:'AV126TFFaseDescripcion_Sel',fld:'vTFFASEDESCRIPCION_SEL',pic:''},{av:'AV40TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV45TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV79TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV80TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV82TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV83TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV92TFParCod',fld:'vTFPARCOD',pic:'ZZZ9'},{av:'AV93TFParCod_To',fld:'vTFPARCOD_TO',pic:'ZZZ9'},{av:'AV98TFParCodNom',fld:'vTFPARCODNOM',pic:''},{av:'AV99TFParCodNom_Sel',fld:'vTFPARCODNOM_SEL',pic:''},{av:'AV95TFHisProTur',fld:'vTFHISPROTUR',pic:'9'},{av:'AV96TFHisProTur_To',fld:'vTFHISPROTUR_TO',pic:'9'},{av:'AV107TFHisProReo',fld:'vTFHISPROREO',pic:'9'},{av:'AV108TFHisProReo_To',fld:'vTFHISPROREO_TO',pic:'9'},{av:'AV175Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV84TotHisProKgr',fld:'vTOTHISPROKGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV86TotHisProMtr',fld:'vTOTHISPROMTR',pic:'ZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV15GridState',fld:'vGRIDSTATE',pic:''},{av:'AV42DDO_HisProDTIAuxDate',fld:'vDDO_HISPRODTIAUXDATE',pic:''},{av:'AV47DDO_HisProDTFAuxDate',fld:'vDDO_HISPRODTFAUXDATE',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A4441HisProDTF',fld:'HISPRODTF',pic:'99/99/99 99:99:99'},{av:'A3612HisProReo',fld:'HISPROREO',pic:'9'},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'},{av:'A1525HisProKgr',fld:'HISPROKGR',pic:'ZZZZZ9.99'},{av:'A1526HisProMtr',fld:'HISPROMTR',pic:'ZZZZZ9.99'}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV15GridState',fld:'vGRIDSTATE',pic:''},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV103FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV31TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV32TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV59TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV60TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV34TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV35TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV101TFHisProLot',fld:'vTFHISPROLOT',pic:''},{av:'AV102TFHisProLot_Sel',fld:'vTFHISPROLOT_SEL',pic:''},{av:'AV62TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV63TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV65TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV66TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV121TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV122TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV68TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV73TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV74TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV76TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV77TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV117TFBarTipArtDsc',fld:'vTFBARTIPARTDSC',pic:''},{av:'AV118TFBarTipArtDsc_Sel',fld:'vTFBARTIPARTDSC_SEL',pic:''},{av:'AV119TFBarTipColDsc',fld:'vTFBARTIPCOLDSC',pic:''},{av:'AV120TFBarTipColDsc_Sel',fld:'vTFBARTIPCOLDSC_SEL',pic:''},{av:'AV37TFFase',fld:'vTFFASE',pic:''},{av:'AV38TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV125TFFaseDescripcion',fld:'vTFFASEDESCRIPCION',pic:''},{av:'AV126TFFaseDescripcion_Sel',fld:'vTFFASEDESCRIPCION_SEL',pic:''},{av:'AV40TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV45TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV79TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV80TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV82TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV83TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV92TFParCod',fld:'vTFPARCOD',pic:'ZZZ9'},{av:'AV93TFParCod_To',fld:'vTFPARCOD_TO',pic:'ZZZ9'},{av:'AV98TFParCodNom',fld:'vTFPARCODNOM',pic:''},{av:'AV99TFParCodNom_Sel',fld:'vTFPARCODNOM_SEL',pic:''},{av:'AV95TFHisProTur',fld:'vTFHISPROTUR',pic:'9'},{av:'AV96TFHisProTur_To',fld:'vTFHISPROTUR_TO',pic:'9'},{av:'AV107TFHisProReo',fld:'vTFHISPROREO',pic:'9'},{av:'AV108TFHisProReo_To',fld:'vTFHISPROREO_TO',pic:'9'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV47DDO_HisProDTFAuxDate',fld:'vDDO_HISPRODTFAUXDATE',pic:''},{av:'AV42DDO_HisProDTIAuxDate',fld:'vDDO_HISPRODTIAUXDATE',pic:''},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtMaqCod_Visible',ctrl:'MAQCOD',prop:'Visible'},{av:'edtMaqDsc_Visible',ctrl:'MAQDSC',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtHisProLot_Visible',ctrl:'HISPROLOT',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtPedidoClie_Visible',ctrl:'PEDIDOCLIE',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarTipArtD_Visible',ctrl:'BARTIPARTD',prop:'Visible'},{av:'edtBarTipColD_Visible',ctrl:'BARTIPCOLD',prop:'Visible'},{av:'edtFase_Visible',ctrl:'FASE',prop:'Visible'},{av:'edtFaseDescri_Visible',ctrl:'FASEDESCRI',prop:'Visible'},{av:'edtHisProDTI_Visible',ctrl:'HISPRODTI',prop:'Visible'},{av:'edtHisProDTF_Visible',ctrl:'HISPRODTF',prop:'Visible'},{av:'edtHisProKgr_Visible',ctrl:'HISPROKGR',prop:'Visible'},{av:'edtHisProMtr_Visible',ctrl:'HISPROMTR',prop:'Visible'},{av:'edtParCod_Visible',ctrl:'PARCOD',prop:'Visible'},{av:'edtParCodNom_Visible',ctrl:'PARCODNOM',prop:'Visible'},{av:'edtHisProTur_Visible',ctrl:'HISPROTUR',prop:'Visible'},{av:'edtavTiempom_Visible',ctrl:'vTIEMPOM',prop:'Visible'},{av:'edtHisProReo_Visible',ctrl:'HISPROREO',prop:'Visible'},{av:'AV52GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV53GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV27ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV84TotHisProKgr',fld:'vTOTHISPROKGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV86TotHisProMtr',fld:'vTOTHISPROMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV85TotValueHisProKgr',fld:'vTOTVALUEHISPROKGR',pic:''},{av:'AV87TotValueHisProMtr',fld:'vTOTVALUEHISPROMTR',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e16TI2',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e17TI2',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VALID_MAQCOD","{handler:'valid_Maqcod',iparms:[]");
      setEventMetadata("VALID_MAQCOD",",oparms:[]}");
      setEventMetadata("VALID_MAQDSC","{handler:'valid_Maqdsc',iparms:[]");
      setEventMetadata("VALID_MAQDSC",",oparms:[]}");
      setEventMetadata("VALID_BARNHDR","{handler:'valid_Barnhdr',iparms:[]");
      setEventMetadata("VALID_BARNHDR",",oparms:[]}");
      setEventMetadata("VALID_HISPROLOT","{handler:'valid_Hisprolot',iparms:[]");
      setEventMetadata("VALID_HISPROLOT",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_CLINOM","{handler:'valid_Clinom',iparms:[]");
      setEventMetadata("VALID_CLINOM",",oparms:[]}");
      setEventMetadata("VALID_PEDIDOCLIE","{handler:'valid_Pedidoclie',iparms:[]");
      setEventMetadata("VALID_PEDIDOCLIE",",oparms:[]}");
      setEventMetadata("VALID_BARSER","{handler:'valid_Barser',iparms:[]");
      setEventMetadata("VALID_BARSER",",oparms:[]}");
      setEventMetadata("VALID_BARSERDSC","{handler:'valid_Barserdsc',iparms:[]");
      setEventMetadata("VALID_BARSERDSC",",oparms:[]}");
      setEventMetadata("VALID_BARTIPARTD","{handler:'valid_Bartipartd',iparms:[]");
      setEventMetadata("VALID_BARTIPARTD",",oparms:[]}");
      setEventMetadata("VALID_BARTIPCOLD","{handler:'valid_Bartipcold',iparms:[]");
      setEventMetadata("VALID_BARTIPCOLD",",oparms:[]}");
      setEventMetadata("VALID_FASE","{handler:'valid_Fase',iparms:[]");
      setEventMetadata("VALID_FASE",",oparms:[]}");
      setEventMetadata("VALID_FASEDESCRI","{handler:'valid_Fasedescri',iparms:[]");
      setEventMetadata("VALID_FASEDESCRI",",oparms:[]}");
      setEventMetadata("VALID_HISPRODTI","{handler:'valid_Hisprodti',iparms:[]");
      setEventMetadata("VALID_HISPRODTI",",oparms:[]}");
      setEventMetadata("VALID_HISPRODTF","{handler:'valid_Hisprodtf',iparms:[]");
      setEventMetadata("VALID_HISPRODTF",",oparms:[]}");
      setEventMetadata("VALID_HISPROKGR","{handler:'valid_Hisprokgr',iparms:[]");
      setEventMetadata("VALID_HISPROKGR",",oparms:[]}");
      setEventMetadata("VALID_HISPROMTR","{handler:'valid_Hispromtr',iparms:[]");
      setEventMetadata("VALID_HISPROMTR",",oparms:[]}");
      setEventMetadata("VALID_PARCOD","{handler:'valid_Parcod',iparms:[]");
      setEventMetadata("VALID_PARCOD",",oparms:[]}");
      setEventMetadata("VALID_PARCODNOM","{handler:'valid_Parcodnom',iparms:[]");
      setEventMetadata("VALID_PARCODNOM",",oparms:[]}");
      setEventMetadata("VALID_HISPROTUR","{handler:'valid_Hisprotur',iparms:[]");
      setEventMetadata("VALID_HISPROTUR",",oparms:[]}");
      setEventMetadata("VALID_HISPROREO","{handler:'valid_Hisproreo',iparms:[]");
      setEventMetadata("VALID_HISPROREO",",oparms:[]}");
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
      wcpOAV5Emprcod = "" ;
      wcpOAV9MaqCodInicial = "" ;
      wcpOAV8MaqCodFinal = "" ;
      wcpOAV7Hisprodti = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV6HisProdtf = GXutil.resetTime( GXutil.nullDate() );
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
      AV5Emprcod = "" ;
      AV9MaqCodInicial = "" ;
      AV8MaqCodFinal = "" ;
      AV7Hisprodti = GXutil.resetTime( GXutil.nullDate() );
      AV6HisProdtf = GXutil.resetTime( GXutil.nullDate() );
      AV24ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV103FilterFullText = "" ;
      AV31TFMaqCod = "" ;
      AV32TFMaqCod_Sel = "" ;
      AV59TFMaqDsc = "" ;
      AV60TFMaqDsc_Sel = "" ;
      AV34TFBarNHdr = "" ;
      AV35TFBarNHdr_Sel = "" ;
      AV101TFHisProLot = "" ;
      AV102TFHisProLot_Sel = "" ;
      AV65TFCliNom = "" ;
      AV66TFCliNom_Sel = "" ;
      AV121TFPedidoCliente = "" ;
      AV122TFPedidoCliente_Sel = "" ;
      AV68TFBarFecGen = GXutil.nullDate() ;
      AV73TFBarSer = "" ;
      AV74TFBarSer_Sel = "" ;
      AV76TFBarSerDsc = "" ;
      AV77TFBarSerDsc_Sel = "" ;
      AV117TFBarTipArtDsc = "" ;
      AV118TFBarTipArtDsc_Sel = "" ;
      AV119TFBarTipColDsc = "" ;
      AV120TFBarTipColDsc_Sel = "" ;
      AV37TFFase = "" ;
      AV38TFFase_Sel = "" ;
      AV125TFFaseDescripcion = "" ;
      AV126TFFaseDescripcion_Sel = "" ;
      AV40TFHisProDTI = GXutil.resetTime( GXutil.nullDate() );
      AV45TFHisProDTF = GXutil.resetTime( GXutil.nullDate() );
      AV79TFHisProKgr = DecimalUtil.ZERO ;
      AV80TFHisProKgr_To = DecimalUtil.ZERO ;
      AV82TFHisProMtr = DecimalUtil.ZERO ;
      AV83TFHisProMtr_To = DecimalUtil.ZERO ;
      AV98TFParCodNom = "" ;
      AV99TFParCodNom_Sel = "" ;
      AV175Pgmname = "" ;
      AV84TotHisProKgr = DecimalUtil.ZERO ;
      AV86TotHisProMtr = DecimalUtil.ZERO ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV27ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV50DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A130BarCodPar = "" ;
      AV15GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      A396EmprCod = "" ;
      A4812BarEncCli = "" ;
      A143BarDisNum = "" ;
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
      AV70DDO_BarFecGenAuxDate = GXutil.nullDate() ;
      AV42DDO_HisProDTIAuxDate = GXutil.nullDate() ;
      AV47DDO_HisProDTFAuxDate = GXutil.nullDate() ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      A13696BarNHdr = "" ;
      A3610HisProLot = "" ;
      A279CliNom = "" ;
      A13878PedidoClie = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A13711BarTipArtD = "" ;
      A13868BarTipColD = "" ;
      A461Fase = "" ;
      A13893FaseDescri = "" ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A867ParCodNom = "" ;
      A13892GruOpeCodN = "" ;
      AV90Tinte = "" ;
      AV133Wciformedetalladohdrsproduccionds_1_filterfulltext = "" ;
      AV134Wciformedetalladohdrsproduccionds_2_tfmaqcod = "" ;
      AV135Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel = "" ;
      AV136Wciformedetalladohdrsproduccionds_4_tfmaqdsc = "" ;
      AV137Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel = "" ;
      AV138Wciformedetalladohdrsproduccionds_6_tfbarnhdr = "" ;
      AV139Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel = "" ;
      AV140Wciformedetalladohdrsproduccionds_8_tfhisprolot = "" ;
      AV141Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel = "" ;
      AV144Wciformedetalladohdrsproduccionds_12_tfclinom = "" ;
      AV145Wciformedetalladohdrsproduccionds_13_tfclinom_sel = "" ;
      AV146Wciformedetalladohdrsproduccionds_14_tfpedidocliente = "" ;
      AV147Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel = "" ;
      AV148Wciformedetalladohdrsproduccionds_16_tfbarfecgen = GXutil.nullDate() ;
      AV149Wciformedetalladohdrsproduccionds_17_tfbarser = "" ;
      AV150Wciformedetalladohdrsproduccionds_18_tfbarser_sel = "" ;
      AV151Wciformedetalladohdrsproduccionds_19_tfbarserdsc = "" ;
      AV152Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel = "" ;
      AV153Wciformedetalladohdrsproduccionds_21_tfbartipartdsc = "" ;
      AV154Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel = "" ;
      AV155Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc = "" ;
      AV156Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel = "" ;
      AV157Wciformedetalladohdrsproduccionds_25_tffase = "" ;
      AV158Wciformedetalladohdrsproduccionds_26_tffase_sel = "" ;
      AV159Wciformedetalladohdrsproduccionds_27_tffasedescripcion = "" ;
      AV160Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel = "" ;
      AV161Wciformedetalladohdrsproduccionds_29_tfhisprodti = GXutil.resetTime( GXutil.nullDate() );
      AV162Wciformedetalladohdrsproduccionds_30_tfhisprodtf = GXutil.resetTime( GXutil.nullDate() );
      AV163Wciformedetalladohdrsproduccionds_31_tfhisprokgr = DecimalUtil.ZERO ;
      AV164Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to = DecimalUtil.ZERO ;
      AV165Wciformedetalladohdrsproduccionds_33_tfhispromtr = DecimalUtil.ZERO ;
      AV166Wciformedetalladohdrsproduccionds_34_tfhispromtr_to = DecimalUtil.ZERO ;
      AV169Wciformedetalladohdrsproduccionds_37_tfparcodnom = "" ;
      AV170Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel = "" ;
      scmdbuf = "" ;
      lV133Wciformedetalladohdrsproduccionds_1_filterfulltext = "" ;
      lV134Wciformedetalladohdrsproduccionds_2_tfmaqcod = "" ;
      lV136Wciformedetalladohdrsproduccionds_4_tfmaqdsc = "" ;
      lV138Wciformedetalladohdrsproduccionds_6_tfbarnhdr = "" ;
      lV140Wciformedetalladohdrsproduccionds_8_tfhisprolot = "" ;
      lV144Wciformedetalladohdrsproduccionds_12_tfclinom = "" ;
      lV149Wciformedetalladohdrsproduccionds_17_tfbarser = "" ;
      lV151Wciformedetalladohdrsproduccionds_19_tfbarserdsc = "" ;
      lV153Wciformedetalladohdrsproduccionds_21_tfbartipartdsc = "" ;
      lV157Wciformedetalladohdrsproduccionds_25_tffase = "" ;
      lV169Wciformedetalladohdrsproduccionds_37_tfparcodnom = "" ;
      H00TI2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      H00TI2_A561HisProLin = new int[1] ;
      H00TI2_A217BarTipArt = new short[1] ;
      H00TI2_n217BarTipArt = new boolean[] {false} ;
      H00TI2_A3612HisProReo = new byte[1] ;
      H00TI2_A566HisProTur = new byte[1] ;
      H00TI2_A867ParCodNom = new String[] {""} ;
      H00TI2_n867ParCodNom = new boolean[] {false} ;
      H00TI2_A656ParCod = new short[1] ;
      H00TI2_n656ParCod = new boolean[] {false} ;
      H00TI2_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00TI2_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00TI2_A13711BarTipArtD = new String[] {""} ;
      H00TI2_n13711BarTipArtD = new boolean[] {false} ;
      H00TI2_A1652BarSerDsc = new String[] {""} ;
      H00TI2_A212BarSer = new String[] {""} ;
      H00TI2_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      H00TI2_A279CliNom = new String[] {""} ;
      H00TI2_A252CliCod = new int[1] ;
      H00TI2_n252CliCod = new boolean[] {false} ;
      H00TI2_A3610HisProLot = new String[] {""} ;
      H00TI2_A13696BarNHdr = new String[] {""} ;
      H00TI2_A606MaqDsc = new String[] {""} ;
      H00TI2_n606MaqDsc = new boolean[] {false} ;
      H00TI2_A602MaqCod = new String[] {""} ;
      H00TI2_A129BarCod = new int[1] ;
      H00TI2_A132BarCodReo = new byte[1] ;
      H00TI2_A130BarCodPar = new String[] {""} ;
      H00TI2_A143BarDisNum = new String[] {""} ;
      H00TI2_A4812BarEncCli = new String[] {""} ;
      H00TI2_A218BarTipCol = new byte[1] ;
      H00TI2_A461Fase = new String[] {""} ;
      H00TI2_A503GruOpeCod = new int[1] ;
      H00TI2_A396EmprCod = new String[] {""} ;
      H00TI2_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      H00TI2_n4440HisProDTI = new boolean[] {false} ;
      H00TI2_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      H00TI2_n4441HisProDTF = new boolean[] {false} ;
      H00TI3_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      H00TI3_A561HisProLin = new int[1] ;
      H00TI3_A217BarTipArt = new short[1] ;
      H00TI3_n217BarTipArt = new boolean[] {false} ;
      H00TI3_A3612HisProReo = new byte[1] ;
      H00TI3_A566HisProTur = new byte[1] ;
      H00TI3_A867ParCodNom = new String[] {""} ;
      H00TI3_n867ParCodNom = new boolean[] {false} ;
      H00TI3_A656ParCod = new short[1] ;
      H00TI3_n656ParCod = new boolean[] {false} ;
      H00TI3_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00TI3_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00TI3_A13711BarTipArtD = new String[] {""} ;
      H00TI3_n13711BarTipArtD = new boolean[] {false} ;
      H00TI3_A1652BarSerDsc = new String[] {""} ;
      H00TI3_A212BarSer = new String[] {""} ;
      H00TI3_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      H00TI3_A279CliNom = new String[] {""} ;
      H00TI3_A252CliCod = new int[1] ;
      H00TI3_n252CliCod = new boolean[] {false} ;
      H00TI3_A3610HisProLot = new String[] {""} ;
      H00TI3_A13696BarNHdr = new String[] {""} ;
      H00TI3_A606MaqDsc = new String[] {""} ;
      H00TI3_n606MaqDsc = new boolean[] {false} ;
      H00TI3_A602MaqCod = new String[] {""} ;
      H00TI3_A129BarCod = new int[1] ;
      H00TI3_A132BarCodReo = new byte[1] ;
      H00TI3_A130BarCodPar = new String[] {""} ;
      H00TI3_A143BarDisNum = new String[] {""} ;
      H00TI3_A4812BarEncCli = new String[] {""} ;
      H00TI3_A218BarTipCol = new byte[1] ;
      H00TI3_A461Fase = new String[] {""} ;
      H00TI3_A503GruOpeCod = new int[1] ;
      H00TI3_A396EmprCod = new String[] {""} ;
      H00TI3_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      H00TI3_n4440HisProDTI = new boolean[] {false} ;
      H00TI3_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      H00TI3_n4441HisProDTF = new boolean[] {false} ;
      AV85TotValueHisProKgr = "" ;
      AV87TotValueHisProMtr = "" ;
      AV130Station = "" ;
      AV131Emprnom = "" ;
      AV132Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV11WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV26Session = httpContext.getWebSession();
      AV22ColumnsSelectorXML = "" ;
      GXv_int11 = new int[1] ;
      GXv_int12 = new short[1] ;
      GXv_int13 = new short[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV28ManageFiltersXml = "" ;
      AV20ExcelFilename = "" ;
      AV21ErrorMessage = "" ;
      AV23UserCustomValue = "" ;
      AV25ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector14 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector15 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item16 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item17 = new GXBaseCollection[1] ;
      AV16GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char35 = "" ;
      GXt_char33 = "" ;
      GXt_char31 = "" ;
      GXt_char29 = "" ;
      GXv_char30 = new String[1] ;
      GXt_char27 = "" ;
      GXv_char28 = new String[1] ;
      GXt_char25 = "" ;
      GXv_char26 = new String[1] ;
      GXt_char23 = "" ;
      GXv_char24 = new String[1] ;
      GXt_char21 = "" ;
      GXv_char22 = new String[1] ;
      GXt_char20 = "" ;
      GXv_char5 = new String[1] ;
      GXt_char19 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char18 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState39 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV13TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV12HTTPRequest = httpContext.getHttpRequest();
      H00TI4_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      H00TI4_A561HisProLin = new int[1] ;
      H00TI4_A217BarTipArt = new short[1] ;
      H00TI4_n217BarTipArt = new boolean[] {false} ;
      H00TI4_A3612HisProReo = new byte[1] ;
      H00TI4_A566HisProTur = new byte[1] ;
      H00TI4_A867ParCodNom = new String[] {""} ;
      H00TI4_n867ParCodNom = new boolean[] {false} ;
      H00TI4_A656ParCod = new short[1] ;
      H00TI4_n656ParCod = new boolean[] {false} ;
      H00TI4_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00TI4_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00TI4_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      H00TI4_n4441HisProDTF = new boolean[] {false} ;
      H00TI4_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      H00TI4_n4440HisProDTI = new boolean[] {false} ;
      H00TI4_A13711BarTipArtD = new String[] {""} ;
      H00TI4_n13711BarTipArtD = new boolean[] {false} ;
      H00TI4_A1652BarSerDsc = new String[] {""} ;
      H00TI4_A212BarSer = new String[] {""} ;
      H00TI4_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      H00TI4_A279CliNom = new String[] {""} ;
      H00TI4_A252CliCod = new int[1] ;
      H00TI4_n252CliCod = new boolean[] {false} ;
      H00TI4_A3610HisProLot = new String[] {""} ;
      H00TI4_A13696BarNHdr = new String[] {""} ;
      H00TI4_A606MaqDsc = new String[] {""} ;
      H00TI4_n606MaqDsc = new boolean[] {false} ;
      H00TI4_A602MaqCod = new String[] {""} ;
      H00TI4_A129BarCod = new int[1] ;
      H00TI4_A132BarCodReo = new byte[1] ;
      H00TI4_A130BarCodPar = new String[] {""} ;
      H00TI4_A143BarDisNum = new String[] {""} ;
      H00TI4_A4812BarEncCli = new String[] {""} ;
      H00TI4_A218BarTipCol = new byte[1] ;
      H00TI4_A461Fase = new String[] {""} ;
      H00TI4_A396EmprCod = new String[] {""} ;
      GXv_char34 = new String[1] ;
      GXv_char32 = new String[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char36 = new String[1] ;
      GXt_char37 = "" ;
      GXv_char38 = new String[1] ;
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV5Emprcod = "" ;
      sCtrlAV9MaqCodInicial = "" ;
      sCtrlAV8MaqCodFinal = "" ;
      sCtrlAV7Hisprodti = "" ;
      sCtrlAV6HisProdtf = "" ;
      sCtrlAV105HisProReo = "" ;
      sCtrlAV106ParCod = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wciformedetalladohdrsproduccion__default(),
         new Object[] {
             new Object[] {
            H00TI2_A558HisProFec, H00TI2_A561HisProLin, H00TI2_A217BarTipArt, H00TI2_n217BarTipArt, H00TI2_A3612HisProReo, H00TI2_A566HisProTur, H00TI2_A867ParCodNom, H00TI2_n867ParCodNom, H00TI2_A656ParCod, H00TI2_n656ParCod,
            H00TI2_A1526HisProMtr, H00TI2_A1525HisProKgr, H00TI2_A13711BarTipArtD, H00TI2_n13711BarTipArtD, H00TI2_A1652BarSerDsc, H00TI2_A212BarSer, H00TI2_A159BarFecGen, H00TI2_A279CliNom, H00TI2_A252CliCod, H00TI2_n252CliCod,
            H00TI2_A3610HisProLot, H00TI2_A13696BarNHdr, H00TI2_A606MaqDsc, H00TI2_n606MaqDsc, H00TI2_A602MaqCod, H00TI2_A129BarCod, H00TI2_A132BarCodReo, H00TI2_A130BarCodPar, H00TI2_A143BarDisNum, H00TI2_A4812BarEncCli,
            H00TI2_A218BarTipCol, H00TI2_A461Fase, H00TI2_A503GruOpeCod, H00TI2_A396EmprCod, H00TI2_A4440HisProDTI, H00TI2_n4440HisProDTI, H00TI2_A4441HisProDTF, H00TI2_n4441HisProDTF
            }
            , new Object[] {
            H00TI3_A558HisProFec, H00TI3_A561HisProLin, H00TI3_A217BarTipArt, H00TI3_n217BarTipArt, H00TI3_A3612HisProReo, H00TI3_A566HisProTur, H00TI3_A867ParCodNom, H00TI3_n867ParCodNom, H00TI3_A656ParCod, H00TI3_n656ParCod,
            H00TI3_A1526HisProMtr, H00TI3_A1525HisProKgr, H00TI3_A13711BarTipArtD, H00TI3_n13711BarTipArtD, H00TI3_A1652BarSerDsc, H00TI3_A212BarSer, H00TI3_A159BarFecGen, H00TI3_A279CliNom, H00TI3_A252CliCod, H00TI3_n252CliCod,
            H00TI3_A3610HisProLot, H00TI3_A13696BarNHdr, H00TI3_A606MaqDsc, H00TI3_n606MaqDsc, H00TI3_A602MaqCod, H00TI3_A129BarCod, H00TI3_A132BarCodReo, H00TI3_A130BarCodPar, H00TI3_A143BarDisNum, H00TI3_A4812BarEncCli,
            H00TI3_A218BarTipCol, H00TI3_A461Fase, H00TI3_A503GruOpeCod, H00TI3_A396EmprCod, H00TI3_A4440HisProDTI, H00TI3_n4440HisProDTI, H00TI3_A4441HisProDTF, H00TI3_n4441HisProDTF
            }
            , new Object[] {
            H00TI4_A558HisProFec, H00TI4_A561HisProLin, H00TI4_A217BarTipArt, H00TI4_n217BarTipArt, H00TI4_A3612HisProReo, H00TI4_A566HisProTur, H00TI4_A867ParCodNom, H00TI4_n867ParCodNom, H00TI4_A656ParCod, H00TI4_n656ParCod,
            H00TI4_A1526HisProMtr, H00TI4_A1525HisProKgr, H00TI4_A4441HisProDTF, H00TI4_n4441HisProDTF, H00TI4_A4440HisProDTI, H00TI4_n4440HisProDTI, H00TI4_A13711BarTipArtD, H00TI4_n13711BarTipArtD, H00TI4_A1652BarSerDsc, H00TI4_A212BarSer,
            H00TI4_A159BarFecGen, H00TI4_A279CliNom, H00TI4_A252CliCod, H00TI4_n252CliCod, H00TI4_A3610HisProLot, H00TI4_A13696BarNHdr, H00TI4_A606MaqDsc, H00TI4_n606MaqDsc, H00TI4_A602MaqCod, H00TI4_A129BarCod,
            H00TI4_A132BarCodReo, H00TI4_A130BarCodPar, H00TI4_A143BarDisNum, H00TI4_A4812BarEncCli, H00TI4_A218BarTipCol, H00TI4_A461Fase, H00TI4_A396EmprCod
            }
         }
      );
      AV175Pgmname = "WCIformedetalladoHdrsProduccion" ;
      /* GeneXus formulas. */
      AV175Pgmname = "WCIformedetalladoHdrsProduccion" ;
      Gx_err = (short)(0) ;
      edtavTinte_Enabled = 0 ;
      edtavTiempom_Enabled = 0 ;
      edtavTotvaluehisprokgr_Enabled = 0 ;
      edtavTotvaluehispromtr_Enabled = 0 ;
   }

   private byte wcpOAV105HisProReo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV105HisProReo ;
   private byte AV29ManageFiltersExecutionStep ;
   private byte AV95TFHisProTur ;
   private byte AV96TFHisProTur_To ;
   private byte AV107TFHisProReo ;
   private byte AV108TFHisProReo_To ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A566HisProTur ;
   private byte A3612HisProReo ;
   private byte nDonePA ;
   private byte AV171Wciformedetalladohdrsproduccionds_39_tfhisprotur ;
   private byte AV172Wciformedetalladohdrsproduccionds_40_tfhisprotur_to ;
   private byte AV173Wciformedetalladohdrsproduccionds_41_tfhisproreo ;
   private byte AV174Wciformedetalladohdrsproduccionds_42_tfhisproreo_to ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXv_int6[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wcpOAV106ParCod ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV106ParCod ;
   private short AV92TFParCod ;
   private short AV93TFParCod_To ;
   private short AV17OrderedBy ;
   private short A5605HisProTr2 ;
   private short wbEnd ;
   private short wbStart ;
   private short A656ParCod ;
   private short AV88Tiempom ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV167Wciformedetalladohdrsproduccionds_35_tfparcod ;
   private short AV168Wciformedetalladohdrsproduccionds_36_tfparcod_to ;
   private short A217BarTipArt ;
   private short GXt_int10 ;
   private short GXv_int12[] ;
   private short GXv_int13[] ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_41 ;
   private int nGXsfl_41_idx=1 ;
   private int AV62TFCliCod ;
   private int AV63TFCliCod_To ;
   private int A129BarCod ;
   private int A503GruOpeCod ;
   private int Gridpaginationbar_Pagestoshow ;
   private int A252CliCod ;
   private int subGrid_Islastpage ;
   private int edtavTinte_Enabled ;
   private int edtavTiempom_Enabled ;
   private int edtavTotvaluehisprokgr_Enabled ;
   private int edtavTotvaluehispromtr_Enabled ;
   private int AV142Wciformedetalladohdrsproduccionds_10_tfclicod ;
   private int AV143Wciformedetalladohdrsproduccionds_11_tfclicod_to ;
   private int edtMaqCod_Visible ;
   private int edtMaqDsc_Visible ;
   private int edtBarNHdr_Visible ;
   private int edtHisProLot_Visible ;
   private int edtCliCod_Visible ;
   private int edtCliNom_Visible ;
   private int edtPedidoClie_Visible ;
   private int edtBarFecGen_Visible ;
   private int edtBarSer_Visible ;
   private int edtBarSerDsc_Visible ;
   private int edtBarTipArtD_Visible ;
   private int edtBarTipColD_Visible ;
   private int edtFase_Visible ;
   private int edtFaseDescri_Visible ;
   private int edtHisProDTI_Visible ;
   private int edtHisProDTF_Visible ;
   private int edtHisProKgr_Visible ;
   private int edtHisProMtr_Visible ;
   private int edtParCod_Visible ;
   private int edtParCodNom_Visible ;
   private int edtHisProTur_Visible ;
   private int edtavTiempom_Visible ;
   private int edtHisProReo_Visible ;
   private int AV51PageToGo ;
   private int GXv_int11[] ;
   private int AV176GXV1 ;
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
   private java.math.BigDecimal AV79TFHisProKgr ;
   private java.math.BigDecimal AV80TFHisProKgr_To ;
   private java.math.BigDecimal AV82TFHisProMtr ;
   private java.math.BigDecimal AV83TFHisProMtr_To ;
   private java.math.BigDecimal AV84TotHisProKgr ;
   private java.math.BigDecimal AV86TotHisProMtr ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal AV163Wciformedetalladohdrsproduccionds_31_tfhisprokgr ;
   private java.math.BigDecimal AV164Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to ;
   private java.math.BigDecimal AV165Wciformedetalladohdrsproduccionds_33_tfhispromtr ;
   private java.math.BigDecimal AV166Wciformedetalladohdrsproduccionds_34_tfhispromtr_to ;
   private String wcpOAV5Emprcod ;
   private String wcpOAV9MaqCodInicial ;
   private String wcpOAV8MaqCodFinal ;
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
   private String AV5Emprcod ;
   private String AV9MaqCodInicial ;
   private String AV8MaqCodFinal ;
   private String sGXsfl_41_idx="0001" ;
   private String AV31TFMaqCod ;
   private String AV32TFMaqCod_Sel ;
   private String AV59TFMaqDsc ;
   private String AV60TFMaqDsc_Sel ;
   private String AV34TFBarNHdr ;
   private String AV35TFBarNHdr_Sel ;
   private String AV101TFHisProLot ;
   private String AV102TFHisProLot_Sel ;
   private String AV65TFCliNom ;
   private String AV66TFCliNom_Sel ;
   private String AV121TFPedidoCliente ;
   private String AV122TFPedidoCliente_Sel ;
   private String AV73TFBarSer ;
   private String AV74TFBarSer_Sel ;
   private String AV76TFBarSerDsc ;
   private String AV77TFBarSerDsc_Sel ;
   private String AV117TFBarTipArtDsc ;
   private String AV118TFBarTipArtDsc_Sel ;
   private String AV119TFBarTipColDsc ;
   private String AV120TFBarTipColDsc_Sel ;
   private String AV37TFFase ;
   private String AV38TFFase_Sel ;
   private String AV125TFFaseDescripcion ;
   private String AV126TFFaseDescripcion_Sel ;
   private String AV98TFParCodNom ;
   private String AV99TFParCodNom_Sel ;
   private String AV175Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A4812BarEncCli ;
   private String A143BarDisNum ;
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
   private String divDdo_barfecgenauxdates_Internalname ;
   private String edtavDdo_barfecgenauxdate_Internalname ;
   private String edtavDdo_barfecgenauxdate_Jsonclick ;
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
   private String edtavFilterfulltext_Internalname ;
   private String A602MaqCod ;
   private String edtMaqCod_Internalname ;
   private String A606MaqDsc ;
   private String edtMaqDsc_Internalname ;
   private String A13696BarNHdr ;
   private String edtBarNHdr_Internalname ;
   private String A3610HisProLot ;
   private String edtHisProLot_Internalname ;
   private String edtCliCod_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String A13878PedidoClie ;
   private String edtPedidoClie_Internalname ;
   private String edtBarFecGen_Internalname ;
   private String A212BarSer ;
   private String edtBarSer_Internalname ;
   private String A1652BarSerDsc ;
   private String edtBarSerDsc_Internalname ;
   private String A13711BarTipArtD ;
   private String edtBarTipArtD_Internalname ;
   private String A13868BarTipColD ;
   private String edtBarTipColD_Internalname ;
   private String A461Fase ;
   private String edtFase_Internalname ;
   private String A13893FaseDescri ;
   private String edtFaseDescri_Internalname ;
   private String edtHisProDTI_Internalname ;
   private String edtHisProDTF_Internalname ;
   private String edtHisProKgr_Internalname ;
   private String edtHisProMtr_Internalname ;
   private String edtParCod_Internalname ;
   private String A867ParCodNom ;
   private String edtParCodNom_Internalname ;
   private String A13892GruOpeCodN ;
   private String edtGruOpeCodN_Internalname ;
   private String AV90Tinte ;
   private String edtavTinte_Internalname ;
   private String edtHisProTur_Internalname ;
   private String edtavTiempom_Internalname ;
   private String edtHisProReo_Internalname ;
   private String edtavTotvaluehisprokgr_Internalname ;
   private String edtavTotvaluehispromtr_Internalname ;
   private String AV134Wciformedetalladohdrsproduccionds_2_tfmaqcod ;
   private String AV135Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel ;
   private String AV136Wciformedetalladohdrsproduccionds_4_tfmaqdsc ;
   private String AV137Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel ;
   private String AV138Wciformedetalladohdrsproduccionds_6_tfbarnhdr ;
   private String AV139Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel ;
   private String AV140Wciformedetalladohdrsproduccionds_8_tfhisprolot ;
   private String AV141Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel ;
   private String AV144Wciformedetalladohdrsproduccionds_12_tfclinom ;
   private String AV145Wciformedetalladohdrsproduccionds_13_tfclinom_sel ;
   private String AV146Wciformedetalladohdrsproduccionds_14_tfpedidocliente ;
   private String AV147Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel ;
   private String AV149Wciformedetalladohdrsproduccionds_17_tfbarser ;
   private String AV150Wciformedetalladohdrsproduccionds_18_tfbarser_sel ;
   private String AV151Wciformedetalladohdrsproduccionds_19_tfbarserdsc ;
   private String AV152Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel ;
   private String AV153Wciformedetalladohdrsproduccionds_21_tfbartipartdsc ;
   private String AV154Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel ;
   private String AV155Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc ;
   private String AV156Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel ;
   private String AV157Wciformedetalladohdrsproduccionds_25_tffase ;
   private String AV158Wciformedetalladohdrsproduccionds_26_tffase_sel ;
   private String AV159Wciformedetalladohdrsproduccionds_27_tffasedescripcion ;
   private String AV160Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel ;
   private String AV169Wciformedetalladohdrsproduccionds_37_tfparcodnom ;
   private String AV170Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel ;
   private String scmdbuf ;
   private String lV134Wciformedetalladohdrsproduccionds_2_tfmaqcod ;
   private String lV136Wciformedetalladohdrsproduccionds_4_tfmaqdsc ;
   private String lV138Wciformedetalladohdrsproduccionds_6_tfbarnhdr ;
   private String lV140Wciformedetalladohdrsproduccionds_8_tfhisprolot ;
   private String lV144Wciformedetalladohdrsproduccionds_12_tfclinom ;
   private String lV149Wciformedetalladohdrsproduccionds_17_tfbarser ;
   private String lV151Wciformedetalladohdrsproduccionds_19_tfbarserdsc ;
   private String lV153Wciformedetalladohdrsproduccionds_21_tfbartipartdsc ;
   private String lV157Wciformedetalladohdrsproduccionds_25_tffase ;
   private String lV169Wciformedetalladohdrsproduccionds_37_tfparcodnom ;
   private String AV130Station ;
   private String AV131Emprnom ;
   private String AV132Usurcod ;
   private String edtParCodNom_Link ;
   private String GXt_char35 ;
   private String GXt_char33 ;
   private String GXt_char31 ;
   private String GXt_char29 ;
   private String GXv_char30[] ;
   private String GXt_char27 ;
   private String GXv_char28[] ;
   private String GXt_char25 ;
   private String GXv_char26[] ;
   private String GXt_char23 ;
   private String GXv_char24[] ;
   private String GXt_char21 ;
   private String GXv_char22[] ;
   private String GXt_char20 ;
   private String GXv_char5[] ;
   private String GXt_char19 ;
   private String GXv_char4[] ;
   private String GXt_char18 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char34[] ;
   private String GXv_char32[] ;
   private String GXv_char36[] ;
   private String GXt_char37 ;
   private String GXv_char38[] ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvaluehisprokgr_Jsonclick ;
   private String edtavTotvaluehispromtr_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV5Emprcod ;
   private String sCtrlAV9MaqCodInicial ;
   private String sCtrlAV8MaqCodFinal ;
   private String sCtrlAV7Hisprodti ;
   private String sCtrlAV6HisProdtf ;
   private String sCtrlAV105HisProReo ;
   private String sCtrlAV106ParCod ;
   private String sGXsfl_41_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtMaqCod_Jsonclick ;
   private String edtMaqDsc_Jsonclick ;
   private String edtBarNHdr_Jsonclick ;
   private String edtHisProLot_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtPedidoClie_Jsonclick ;
   private String edtBarFecGen_Jsonclick ;
   private String edtBarSer_Jsonclick ;
   private String edtBarSerDsc_Jsonclick ;
   private String edtBarTipArtD_Jsonclick ;
   private String edtBarTipColD_Jsonclick ;
   private String edtFase_Jsonclick ;
   private String edtFaseDescri_Jsonclick ;
   private String edtHisProDTI_Jsonclick ;
   private String edtHisProDTF_Jsonclick ;
   private String edtHisProKgr_Jsonclick ;
   private String edtHisProMtr_Jsonclick ;
   private String edtParCod_Jsonclick ;
   private String edtParCodNom_Jsonclick ;
   private String edtGruOpeCodN_Jsonclick ;
   private String edtavTinte_Jsonclick ;
   private String edtHisProTur_Jsonclick ;
   private String edtavTiempom_Jsonclick ;
   private String edtHisProReo_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV7Hisprodti ;
   private java.util.Date wcpOAV6HisProdtf ;
   private java.util.Date AV7Hisprodti ;
   private java.util.Date AV6HisProdtf ;
   private java.util.Date AV40TFHisProDTI ;
   private java.util.Date AV45TFHisProDTF ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date AV161Wciformedetalladohdrsproduccionds_29_tfhisprodti ;
   private java.util.Date AV162Wciformedetalladohdrsproduccionds_30_tfhisprodtf ;
   private java.util.Date AV68TFBarFecGen ;
   private java.util.Date AV70DDO_BarFecGenAuxDate ;
   private java.util.Date AV42DDO_HisProDTIAuxDate ;
   private java.util.Date AV47DDO_HisProDTFAuxDate ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date AV148Wciformedetalladohdrsproduccionds_16_tfbarfecgen ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV18OrderedDsc ;
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
   private boolean n252CliCod ;
   private boolean n13711BarTipArtD ;
   private boolean n4440HisProDTI ;
   private boolean n4441HisProDTF ;
   private boolean n656ParCod ;
   private boolean n867ParCodNom ;
   private boolean bGXsfl_41_Refreshing=false ;
   private boolean n217BarTipArt ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV22ColumnsSelectorXML ;
   private String AV28ManageFiltersXml ;
   private String AV23UserCustomValue ;
   private String AV103FilterFullText ;
   private String AV133Wciformedetalladohdrsproduccionds_1_filterfulltext ;
   private String lV133Wciformedetalladohdrsproduccionds_1_filterfulltext ;
   private String AV85TotValueHisProKgr ;
   private String AV87TotValueHisProMtr ;
   private String AV20ExcelFilename ;
   private String AV21ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV12HTTPRequest ;
   private com.genexus.webpanels.WebSession AV26Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] H00TI2_A558HisProFec ;
   private int[] H00TI2_A561HisProLin ;
   private short[] H00TI2_A217BarTipArt ;
   private boolean[] H00TI2_n217BarTipArt ;
   private byte[] H00TI2_A3612HisProReo ;
   private byte[] H00TI2_A566HisProTur ;
   private String[] H00TI2_A867ParCodNom ;
   private boolean[] H00TI2_n867ParCodNom ;
   private short[] H00TI2_A656ParCod ;
   private boolean[] H00TI2_n656ParCod ;
   private java.math.BigDecimal[] H00TI2_A1526HisProMtr ;
   private java.math.BigDecimal[] H00TI2_A1525HisProKgr ;
   private String[] H00TI2_A13711BarTipArtD ;
   private boolean[] H00TI2_n13711BarTipArtD ;
   private String[] H00TI2_A1652BarSerDsc ;
   private String[] H00TI2_A212BarSer ;
   private java.util.Date[] H00TI2_A159BarFecGen ;
   private String[] H00TI2_A279CliNom ;
   private int[] H00TI2_A252CliCod ;
   private boolean[] H00TI2_n252CliCod ;
   private String[] H00TI2_A3610HisProLot ;
   private String[] H00TI2_A13696BarNHdr ;
   private String[] H00TI2_A606MaqDsc ;
   private boolean[] H00TI2_n606MaqDsc ;
   private String[] H00TI2_A602MaqCod ;
   private int[] H00TI2_A129BarCod ;
   private byte[] H00TI2_A132BarCodReo ;
   private String[] H00TI2_A130BarCodPar ;
   private String[] H00TI2_A143BarDisNum ;
   private String[] H00TI2_A4812BarEncCli ;
   private byte[] H00TI2_A218BarTipCol ;
   private String[] H00TI2_A461Fase ;
   private int[] H00TI2_A503GruOpeCod ;
   private String[] H00TI2_A396EmprCod ;
   private java.util.Date[] H00TI2_A4440HisProDTI ;
   private boolean[] H00TI2_n4440HisProDTI ;
   private java.util.Date[] H00TI2_A4441HisProDTF ;
   private boolean[] H00TI2_n4441HisProDTF ;
   private java.util.Date[] H00TI3_A558HisProFec ;
   private int[] H00TI3_A561HisProLin ;
   private short[] H00TI3_A217BarTipArt ;
   private boolean[] H00TI3_n217BarTipArt ;
   private byte[] H00TI3_A3612HisProReo ;
   private byte[] H00TI3_A566HisProTur ;
   private String[] H00TI3_A867ParCodNom ;
   private boolean[] H00TI3_n867ParCodNom ;
   private short[] H00TI3_A656ParCod ;
   private boolean[] H00TI3_n656ParCod ;
   private java.math.BigDecimal[] H00TI3_A1526HisProMtr ;
   private java.math.BigDecimal[] H00TI3_A1525HisProKgr ;
   private String[] H00TI3_A13711BarTipArtD ;
   private boolean[] H00TI3_n13711BarTipArtD ;
   private String[] H00TI3_A1652BarSerDsc ;
   private String[] H00TI3_A212BarSer ;
   private java.util.Date[] H00TI3_A159BarFecGen ;
   private String[] H00TI3_A279CliNom ;
   private int[] H00TI3_A252CliCod ;
   private boolean[] H00TI3_n252CliCod ;
   private String[] H00TI3_A3610HisProLot ;
   private String[] H00TI3_A13696BarNHdr ;
   private String[] H00TI3_A606MaqDsc ;
   private boolean[] H00TI3_n606MaqDsc ;
   private String[] H00TI3_A602MaqCod ;
   private int[] H00TI3_A129BarCod ;
   private byte[] H00TI3_A132BarCodReo ;
   private String[] H00TI3_A130BarCodPar ;
   private String[] H00TI3_A143BarDisNum ;
   private String[] H00TI3_A4812BarEncCli ;
   private byte[] H00TI3_A218BarTipCol ;
   private String[] H00TI3_A461Fase ;
   private int[] H00TI3_A503GruOpeCod ;
   private String[] H00TI3_A396EmprCod ;
   private java.util.Date[] H00TI3_A4440HisProDTI ;
   private boolean[] H00TI3_n4440HisProDTI ;
   private java.util.Date[] H00TI3_A4441HisProDTF ;
   private boolean[] H00TI3_n4441HisProDTF ;
   private java.util.Date[] H00TI4_A558HisProFec ;
   private int[] H00TI4_A561HisProLin ;
   private short[] H00TI4_A217BarTipArt ;
   private boolean[] H00TI4_n217BarTipArt ;
   private byte[] H00TI4_A3612HisProReo ;
   private byte[] H00TI4_A566HisProTur ;
   private String[] H00TI4_A867ParCodNom ;
   private boolean[] H00TI4_n867ParCodNom ;
   private short[] H00TI4_A656ParCod ;
   private boolean[] H00TI4_n656ParCod ;
   private java.math.BigDecimal[] H00TI4_A1526HisProMtr ;
   private java.math.BigDecimal[] H00TI4_A1525HisProKgr ;
   private java.util.Date[] H00TI4_A4441HisProDTF ;
   private boolean[] H00TI4_n4441HisProDTF ;
   private java.util.Date[] H00TI4_A4440HisProDTI ;
   private boolean[] H00TI4_n4440HisProDTI ;
   private String[] H00TI4_A13711BarTipArtD ;
   private boolean[] H00TI4_n13711BarTipArtD ;
   private String[] H00TI4_A1652BarSerDsc ;
   private String[] H00TI4_A212BarSer ;
   private java.util.Date[] H00TI4_A159BarFecGen ;
   private String[] H00TI4_A279CliNom ;
   private int[] H00TI4_A252CliCod ;
   private boolean[] H00TI4_n252CliCod ;
   private String[] H00TI4_A3610HisProLot ;
   private String[] H00TI4_A13696BarNHdr ;
   private String[] H00TI4_A606MaqDsc ;
   private boolean[] H00TI4_n606MaqDsc ;
   private String[] H00TI4_A602MaqCod ;
   private int[] H00TI4_A129BarCod ;
   private byte[] H00TI4_A132BarCodReo ;
   private String[] H00TI4_A130BarCodPar ;
   private String[] H00TI4_A143BarDisNum ;
   private String[] H00TI4_A4812BarEncCli ;
   private byte[] H00TI4_A218BarTipCol ;
   private String[] H00TI4_A461Fase ;
   private String[] H00TI4_A396EmprCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV27ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item16 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item17[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV25ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector14[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector15[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV50DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV15GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState39[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV16GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV13TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV11WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
}

final  class wciformedetalladohdrsproduccion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00TI2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV135Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel ,
                                          String AV134Wciformedetalladohdrsproduccionds_2_tfmaqcod ,
                                          String AV137Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel ,
                                          String AV136Wciformedetalladohdrsproduccionds_4_tfmaqdsc ,
                                          String AV139Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel ,
                                          String AV138Wciformedetalladohdrsproduccionds_6_tfbarnhdr ,
                                          String AV141Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel ,
                                          String AV140Wciformedetalladohdrsproduccionds_8_tfhisprolot ,
                                          int AV142Wciformedetalladohdrsproduccionds_10_tfclicod ,
                                          int AV143Wciformedetalladohdrsproduccionds_11_tfclicod_to ,
                                          String AV145Wciformedetalladohdrsproduccionds_13_tfclinom_sel ,
                                          String AV144Wciformedetalladohdrsproduccionds_12_tfclinom ,
                                          java.util.Date AV148Wciformedetalladohdrsproduccionds_16_tfbarfecgen ,
                                          String AV150Wciformedetalladohdrsproduccionds_18_tfbarser_sel ,
                                          String AV149Wciformedetalladohdrsproduccionds_17_tfbarser ,
                                          String AV152Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel ,
                                          String AV151Wciformedetalladohdrsproduccionds_19_tfbarserdsc ,
                                          String AV154Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel ,
                                          String AV153Wciformedetalladohdrsproduccionds_21_tfbartipartdsc ,
                                          String AV158Wciformedetalladohdrsproduccionds_26_tffase_sel ,
                                          String AV157Wciformedetalladohdrsproduccionds_25_tffase ,
                                          java.util.Date AV161Wciformedetalladohdrsproduccionds_29_tfhisprodti ,
                                          java.util.Date AV162Wciformedetalladohdrsproduccionds_30_tfhisprodtf ,
                                          java.math.BigDecimal AV163Wciformedetalladohdrsproduccionds_31_tfhisprokgr ,
                                          java.math.BigDecimal AV164Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to ,
                                          java.math.BigDecimal AV165Wciformedetalladohdrsproduccionds_33_tfhispromtr ,
                                          java.math.BigDecimal AV166Wciformedetalladohdrsproduccionds_34_tfhispromtr_to ,
                                          short AV167Wciformedetalladohdrsproduccionds_35_tfparcod ,
                                          short AV168Wciformedetalladohdrsproduccionds_36_tfparcod_to ,
                                          String AV170Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel ,
                                          String AV169Wciformedetalladohdrsproduccionds_37_tfparcodnom ,
                                          byte AV171Wciformedetalladohdrsproduccionds_39_tfhisprotur ,
                                          byte AV172Wciformedetalladohdrsproduccionds_40_tfhisprotur_to ,
                                          byte AV173Wciformedetalladohdrsproduccionds_41_tfhisproreo ,
                                          byte AV174Wciformedetalladohdrsproduccionds_42_tfhisproreo_to ,
                                          String AV9MaqCodInicial ,
                                          String AV8MaqCodFinal ,
                                          java.util.Date AV7Hisprodti ,
                                          java.util.Date AV6HisProdtf ,
                                          byte AV105HisProReo ,
                                          short AV106ParCod ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A3610HisProLot ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          java.util.Date A159BarFecGen ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A13711BarTipArtD ,
                                          String A461Fase ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          short A656ParCod ,
                                          String A867ParCodNom ,
                                          byte A566HisProTur ,
                                          byte A3612HisProReo ,
                                          short AV17OrderedBy ,
                                          boolean AV18OrderedDsc ,
                                          String AV133Wciformedetalladohdrsproduccionds_1_filterfulltext ,
                                          String A13696BarNHdr ,
                                          String A13878PedidoClie ,
                                          String A13868BarTipColD ,
                                          String A13893FaseDescri ,
                                          String AV147Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel ,
                                          String AV146Wciformedetalladohdrsproduccionds_14_tfpedidocliente ,
                                          String AV156Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel ,
                                          String AV155Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc ,
                                          String AV160Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel ,
                                          String AV159Wciformedetalladohdrsproduccionds_27_tffasedescripcion ,
                                          String AV5Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int40 = new byte[42];
      Object[] GXv_Object41 = new Object[2];
      scmdbuf = "SELECT T1.HisProFec, T1.HisProLin, T3.BarTipArt AS BarTipArt, T1.HisProReo, T1.HisProTur, T6.ParCodNom, T1.ParCod, T1.HisProMtr, T1.HisProKgr, T5.TipArtDsc AS BarTipArtD," ;
      scmdbuf += " T3.BarSerDsc, T3.BarSer, T3.BarFecGen, T4.CliNom, T3.CliCod, T1.HisProLot, RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCodReo,'90')," ;
      scmdbuf += " 2))) || T3.BarCodPar AS BarNHdr, T2.MaqDsc, T1.MaqCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T3.BarDisNum, T3.BarEncCli, T3.BarTipCol, T1.Fase, T1.GruOpeCod, T1.EmprCod," ;
      scmdbuf += " T1.HisProDTI, T1.HisProDTF FROM (((((TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod" ;
      scmdbuf += " = T3.CliCod) LEFT JOIN TXPTIPART T5 ON T5.EmprCod = T1.EmprCod AND T5.TipArtCod = T3.BarTipArt) LEFT JOIN TXPCODPAR T6 ON T6.EmprCod = T1.EmprCod AND T6.ParCod" ;
      scmdbuf += " = T1.ParCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV135Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV134Wciformedetalladohdrsproduccionds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int40[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV137Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV136Wciformedetalladohdrsproduccionds_4_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV137Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int40[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV138Wciformedetalladohdrsproduccionds_6_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int40[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV141Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel)==0) && ( ! (GXutil.strcmp("", AV140Wciformedetalladohdrsproduccionds_8_tfhisprolot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV141Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProLot = ?)");
      }
      else
      {
         GXv_int40[8] = (byte)(1) ;
      }
      if ( ! (0==AV142Wciformedetalladohdrsproduccionds_10_tfclicod) )
      {
         addWhere(sWhereString, "(T3.CliCod >= ?)");
      }
      else
      {
         GXv_int40[9] = (byte)(1) ;
      }
      if ( ! (0==AV143Wciformedetalladohdrsproduccionds_11_tfclicod_to) )
      {
         addWhere(sWhereString, "(T3.CliCod <= ?)");
      }
      else
      {
         GXv_int40[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV145Wciformedetalladohdrsproduccionds_13_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV144Wciformedetalladohdrsproduccionds_12_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV145Wciformedetalladohdrsproduccionds_13_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int40[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV148Wciformedetalladohdrsproduccionds_16_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T3.BarFecGen >= ?)");
      }
      else
      {
         GXv_int40[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV150Wciformedetalladohdrsproduccionds_18_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV149Wciformedetalladohdrsproduccionds_17_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV150Wciformedetalladohdrsproduccionds_18_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSer = ?)");
      }
      else
      {
         GXv_int40[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV152Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV151Wciformedetalladohdrsproduccionds_19_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV152Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSerDsc = ?)");
      }
      else
      {
         GXv_int40[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV154Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV153Wciformedetalladohdrsproduccionds_21_tfbartipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV154Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipArtDsc = ?)");
      }
      else
      {
         GXv_int40[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV158Wciformedetalladohdrsproduccionds_26_tffase_sel)==0) && ( ! (GXutil.strcmp("", AV157Wciformedetalladohdrsproduccionds_25_tffase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Fase) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV158Wciformedetalladohdrsproduccionds_26_tffase_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Fase = ?)");
      }
      else
      {
         GXv_int40[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV161Wciformedetalladohdrsproduccionds_29_tfhisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      }
      else
      {
         GXv_int40[22] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV162Wciformedetalladohdrsproduccionds_30_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int40[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV163Wciformedetalladohdrsproduccionds_31_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int40[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV164Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int40[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV165Wciformedetalladohdrsproduccionds_33_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int40[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV166Wciformedetalladohdrsproduccionds_34_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int40[27] = (byte)(1) ;
      }
      if ( ! (0==AV167Wciformedetalladohdrsproduccionds_35_tfparcod) )
      {
         addWhere(sWhereString, "(T1.ParCod >= ?)");
      }
      else
      {
         GXv_int40[28] = (byte)(1) ;
      }
      if ( ! (0==AV168Wciformedetalladohdrsproduccionds_36_tfparcod_to) )
      {
         addWhere(sWhereString, "(T1.ParCod <= ?)");
      }
      else
      {
         GXv_int40[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV170Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel)==0) && ( ! (GXutil.strcmp("", AV169Wciformedetalladohdrsproduccionds_37_tfparcodnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T6.ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV170Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel)==0) )
      {
         addWhere(sWhereString, "(T6.ParCodNom = ?)");
      }
      else
      {
         GXv_int40[31] = (byte)(1) ;
      }
      if ( ! (0==AV171Wciformedetalladohdrsproduccionds_39_tfhisprotur) )
      {
         addWhere(sWhereString, "(T1.HisProTur >= ?)");
      }
      else
      {
         GXv_int40[32] = (byte)(1) ;
      }
      if ( ! (0==AV172Wciformedetalladohdrsproduccionds_40_tfhisprotur_to) )
      {
         addWhere(sWhereString, "(T1.HisProTur <= ?)");
      }
      else
      {
         GXv_int40[33] = (byte)(1) ;
      }
      if ( ! (0==AV173Wciformedetalladohdrsproduccionds_41_tfhisproreo) )
      {
         addWhere(sWhereString, "(T1.HisProReo >= ?)");
      }
      else
      {
         GXv_int40[34] = (byte)(1) ;
      }
      if ( ! (0==AV174Wciformedetalladohdrsproduccionds_42_tfhisproreo_to) )
      {
         addWhere(sWhereString, "(T1.HisProReo <= ?)");
      }
      else
      {
         GXv_int40[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV9MaqCodInicial)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod >= ?)");
      }
      else
      {
         GXv_int40[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8MaqCodFinal)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod <= ?)");
      }
      else
      {
         GXv_int40[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV7Hisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int40[38] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV6HisProdtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF <= ?)");
      }
      else
      {
         GXv_int40[39] = (byte)(1) ;
      }
      if ( ! ( AV105HisProReo == 9 ) )
      {
         addWhere(sWhereString, "(T1.HisProReo = ?)");
      }
      else
      {
         GXv_int40[40] = (byte)(1) ;
      }
      if ( AV106ParCod >= 0 )
      {
         addWhere(sWhereString, "(T1.ParCod = ?)");
      }
      else
      {
         GXv_int40[41] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV17OrderedBy == 1 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqCod" ;
      }
      else if ( ( AV17OrderedBy == 1 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqCod DESC" ;
      }
      else if ( ( AV17OrderedBy == 2 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.MaqDsc" ;
      }
      else if ( ( AV17OrderedBy == 2 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.MaqDsc DESC" ;
      }
      else if ( ( AV17OrderedBy == 3 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProLot" ;
      }
      else if ( ( AV17OrderedBy == 3 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProLot DESC" ;
      }
      else if ( ( AV17OrderedBy == 4 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliCod" ;
      }
      else if ( ( AV17OrderedBy == 4 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliCod DESC" ;
      }
      else if ( ( AV17OrderedBy == 5 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.CliNom" ;
      }
      else if ( ( AV17OrderedBy == 5 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.CliNom DESC" ;
      }
      else if ( ( AV17OrderedBy == 6 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.BarFecGen" ;
      }
      else if ( ( AV17OrderedBy == 6 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.BarFecGen DESC" ;
      }
      else if ( ( AV17OrderedBy == 7 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.BarSer" ;
      }
      else if ( ( AV17OrderedBy == 7 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.BarSer DESC" ;
      }
      else if ( ( AV17OrderedBy == 8 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.BarSerDsc" ;
      }
      else if ( ( AV17OrderedBy == 8 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.BarSerDsc DESC" ;
      }
      else if ( ( AV17OrderedBy == 9 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T5.TipArtDsc" ;
      }
      else if ( ( AV17OrderedBy == 9 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T5.TipArtDsc DESC" ;
      }
      else if ( ( AV17OrderedBy == 10 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Fase" ;
      }
      else if ( ( AV17OrderedBy == 10 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Fase DESC" ;
      }
      else if ( ( AV17OrderedBy == 11 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProDTI" ;
      }
      else if ( ( AV17OrderedBy == 11 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProDTI DESC" ;
      }
      else if ( ( AV17OrderedBy == 12 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProDTF" ;
      }
      else if ( ( AV17OrderedBy == 12 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProDTF DESC" ;
      }
      else if ( ( AV17OrderedBy == 13 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProKgr" ;
      }
      else if ( ( AV17OrderedBy == 13 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProKgr DESC" ;
      }
      else if ( ( AV17OrderedBy == 14 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProMtr" ;
      }
      else if ( ( AV17OrderedBy == 14 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProMtr DESC" ;
      }
      else if ( ( AV17OrderedBy == 15 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ParCod" ;
      }
      else if ( ( AV17OrderedBy == 15 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ParCod DESC" ;
      }
      else if ( ( AV17OrderedBy == 16 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T6.ParCodNom" ;
      }
      else if ( ( AV17OrderedBy == 16 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T6.ParCodNom DESC" ;
      }
      else if ( ( AV17OrderedBy == 17 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProTur" ;
      }
      else if ( ( AV17OrderedBy == 17 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProTur DESC" ;
      }
      else if ( ( AV17OrderedBy == 18 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProReo" ;
      }
      else if ( ( AV17OrderedBy == 18 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProReo DESC" ;
      }
      GXv_Object41[0] = scmdbuf ;
      GXv_Object41[1] = GXv_int40 ;
      return GXv_Object41 ;
   }

   protected Object[] conditional_H00TI3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV135Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel ,
                                          String AV134Wciformedetalladohdrsproduccionds_2_tfmaqcod ,
                                          String AV137Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel ,
                                          String AV136Wciformedetalladohdrsproduccionds_4_tfmaqdsc ,
                                          String AV139Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel ,
                                          String AV138Wciformedetalladohdrsproduccionds_6_tfbarnhdr ,
                                          String AV141Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel ,
                                          String AV140Wciformedetalladohdrsproduccionds_8_tfhisprolot ,
                                          int AV142Wciformedetalladohdrsproduccionds_10_tfclicod ,
                                          int AV143Wciformedetalladohdrsproduccionds_11_tfclicod_to ,
                                          String AV145Wciformedetalladohdrsproduccionds_13_tfclinom_sel ,
                                          String AV144Wciformedetalladohdrsproduccionds_12_tfclinom ,
                                          java.util.Date AV148Wciformedetalladohdrsproduccionds_16_tfbarfecgen ,
                                          String AV150Wciformedetalladohdrsproduccionds_18_tfbarser_sel ,
                                          String AV149Wciformedetalladohdrsproduccionds_17_tfbarser ,
                                          String AV152Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel ,
                                          String AV151Wciformedetalladohdrsproduccionds_19_tfbarserdsc ,
                                          String AV154Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel ,
                                          String AV153Wciformedetalladohdrsproduccionds_21_tfbartipartdsc ,
                                          String AV158Wciformedetalladohdrsproduccionds_26_tffase_sel ,
                                          String AV157Wciformedetalladohdrsproduccionds_25_tffase ,
                                          java.util.Date AV161Wciformedetalladohdrsproduccionds_29_tfhisprodti ,
                                          java.util.Date AV162Wciformedetalladohdrsproduccionds_30_tfhisprodtf ,
                                          java.math.BigDecimal AV163Wciformedetalladohdrsproduccionds_31_tfhisprokgr ,
                                          java.math.BigDecimal AV164Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to ,
                                          java.math.BigDecimal AV165Wciformedetalladohdrsproduccionds_33_tfhispromtr ,
                                          java.math.BigDecimal AV166Wciformedetalladohdrsproduccionds_34_tfhispromtr_to ,
                                          short AV167Wciformedetalladohdrsproduccionds_35_tfparcod ,
                                          short AV168Wciformedetalladohdrsproduccionds_36_tfparcod_to ,
                                          String AV170Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel ,
                                          String AV169Wciformedetalladohdrsproduccionds_37_tfparcodnom ,
                                          byte AV171Wciformedetalladohdrsproduccionds_39_tfhisprotur ,
                                          byte AV172Wciformedetalladohdrsproduccionds_40_tfhisprotur_to ,
                                          byte AV173Wciformedetalladohdrsproduccionds_41_tfhisproreo ,
                                          byte AV174Wciformedetalladohdrsproduccionds_42_tfhisproreo_to ,
                                          String AV9MaqCodInicial ,
                                          String AV8MaqCodFinal ,
                                          java.util.Date AV7Hisprodti ,
                                          java.util.Date AV6HisProdtf ,
                                          byte AV105HisProReo ,
                                          short AV106ParCod ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A3610HisProLot ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          java.util.Date A159BarFecGen ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A13711BarTipArtD ,
                                          String A461Fase ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          short A656ParCod ,
                                          String A867ParCodNom ,
                                          byte A566HisProTur ,
                                          byte A3612HisProReo ,
                                          short AV17OrderedBy ,
                                          boolean AV18OrderedDsc ,
                                          String AV133Wciformedetalladohdrsproduccionds_1_filterfulltext ,
                                          String A13696BarNHdr ,
                                          String A13878PedidoClie ,
                                          String A13868BarTipColD ,
                                          String A13893FaseDescri ,
                                          String AV147Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel ,
                                          String AV146Wciformedetalladohdrsproduccionds_14_tfpedidocliente ,
                                          String AV156Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel ,
                                          String AV155Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc ,
                                          String AV160Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel ,
                                          String AV159Wciformedetalladohdrsproduccionds_27_tffasedescripcion ,
                                          String AV5Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int42 = new byte[42];
      Object[] GXv_Object43 = new Object[2];
      scmdbuf = "SELECT T1.HisProFec, T1.HisProLin, T3.BarTipArt AS BarTipArt, T1.HisProReo, T1.HisProTur, T6.ParCodNom, T1.ParCod, T1.HisProMtr, T1.HisProKgr, T5.TipArtDsc AS BarTipArtD," ;
      scmdbuf += " T3.BarSerDsc, T3.BarSer, T3.BarFecGen, T4.CliNom, T3.CliCod, T1.HisProLot, RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCodReo,'90')," ;
      scmdbuf += " 2))) || T3.BarCodPar AS BarNHdr, T2.MaqDsc, T1.MaqCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T3.BarDisNum, T3.BarEncCli, T3.BarTipCol, T1.Fase, T1.GruOpeCod, T1.EmprCod," ;
      scmdbuf += " T1.HisProDTI, T1.HisProDTF FROM (((((TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod" ;
      scmdbuf += " = T3.CliCod) LEFT JOIN TXPTIPART T5 ON T5.EmprCod = T1.EmprCod AND T5.TipArtCod = T3.BarTipArt) LEFT JOIN TXPCODPAR T6 ON T6.EmprCod = T1.EmprCod AND T6.ParCod" ;
      scmdbuf += " = T1.ParCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV135Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV134Wciformedetalladohdrsproduccionds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int42[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int42[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV137Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV136Wciformedetalladohdrsproduccionds_4_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int42[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV137Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int42[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV138Wciformedetalladohdrsproduccionds_6_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int42[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int42[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV141Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel)==0) && ( ! (GXutil.strcmp("", AV140Wciformedetalladohdrsproduccionds_8_tfhisprolot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int42[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV141Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProLot = ?)");
      }
      else
      {
         GXv_int42[8] = (byte)(1) ;
      }
      if ( ! (0==AV142Wciformedetalladohdrsproduccionds_10_tfclicod) )
      {
         addWhere(sWhereString, "(T3.CliCod >= ?)");
      }
      else
      {
         GXv_int42[9] = (byte)(1) ;
      }
      if ( ! (0==AV143Wciformedetalladohdrsproduccionds_11_tfclicod_to) )
      {
         addWhere(sWhereString, "(T3.CliCod <= ?)");
      }
      else
      {
         GXv_int42[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV145Wciformedetalladohdrsproduccionds_13_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV144Wciformedetalladohdrsproduccionds_12_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int42[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV145Wciformedetalladohdrsproduccionds_13_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int42[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV148Wciformedetalladohdrsproduccionds_16_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T3.BarFecGen >= ?)");
      }
      else
      {
         GXv_int42[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV150Wciformedetalladohdrsproduccionds_18_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV149Wciformedetalladohdrsproduccionds_17_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int42[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV150Wciformedetalladohdrsproduccionds_18_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSer = ?)");
      }
      else
      {
         GXv_int42[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV152Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV151Wciformedetalladohdrsproduccionds_19_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int42[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV152Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSerDsc = ?)");
      }
      else
      {
         GXv_int42[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV154Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV153Wciformedetalladohdrsproduccionds_21_tfbartipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int42[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV154Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipArtDsc = ?)");
      }
      else
      {
         GXv_int42[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV158Wciformedetalladohdrsproduccionds_26_tffase_sel)==0) && ( ! (GXutil.strcmp("", AV157Wciformedetalladohdrsproduccionds_25_tffase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Fase) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int42[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV158Wciformedetalladohdrsproduccionds_26_tffase_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Fase = ?)");
      }
      else
      {
         GXv_int42[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV161Wciformedetalladohdrsproduccionds_29_tfhisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      }
      else
      {
         GXv_int42[22] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV162Wciformedetalladohdrsproduccionds_30_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int42[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV163Wciformedetalladohdrsproduccionds_31_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int42[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV164Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int42[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV165Wciformedetalladohdrsproduccionds_33_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int42[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV166Wciformedetalladohdrsproduccionds_34_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int42[27] = (byte)(1) ;
      }
      if ( ! (0==AV167Wciformedetalladohdrsproduccionds_35_tfparcod) )
      {
         addWhere(sWhereString, "(T1.ParCod >= ?)");
      }
      else
      {
         GXv_int42[28] = (byte)(1) ;
      }
      if ( ! (0==AV168Wciformedetalladohdrsproduccionds_36_tfparcod_to) )
      {
         addWhere(sWhereString, "(T1.ParCod <= ?)");
      }
      else
      {
         GXv_int42[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV170Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel)==0) && ( ! (GXutil.strcmp("", AV169Wciformedetalladohdrsproduccionds_37_tfparcodnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T6.ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int42[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV170Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel)==0) )
      {
         addWhere(sWhereString, "(T6.ParCodNom = ?)");
      }
      else
      {
         GXv_int42[31] = (byte)(1) ;
      }
      if ( ! (0==AV171Wciformedetalladohdrsproduccionds_39_tfhisprotur) )
      {
         addWhere(sWhereString, "(T1.HisProTur >= ?)");
      }
      else
      {
         GXv_int42[32] = (byte)(1) ;
      }
      if ( ! (0==AV172Wciformedetalladohdrsproduccionds_40_tfhisprotur_to) )
      {
         addWhere(sWhereString, "(T1.HisProTur <= ?)");
      }
      else
      {
         GXv_int42[33] = (byte)(1) ;
      }
      if ( ! (0==AV173Wciformedetalladohdrsproduccionds_41_tfhisproreo) )
      {
         addWhere(sWhereString, "(T1.HisProReo >= ?)");
      }
      else
      {
         GXv_int42[34] = (byte)(1) ;
      }
      if ( ! (0==AV174Wciformedetalladohdrsproduccionds_42_tfhisproreo_to) )
      {
         addWhere(sWhereString, "(T1.HisProReo <= ?)");
      }
      else
      {
         GXv_int42[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV9MaqCodInicial)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod >= ?)");
      }
      else
      {
         GXv_int42[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8MaqCodFinal)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod <= ?)");
      }
      else
      {
         GXv_int42[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV7Hisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int42[38] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV6HisProdtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF <= ?)");
      }
      else
      {
         GXv_int42[39] = (byte)(1) ;
      }
      if ( ! ( AV105HisProReo == 9 ) )
      {
         addWhere(sWhereString, "(T1.HisProReo = ?)");
      }
      else
      {
         GXv_int42[40] = (byte)(1) ;
      }
      if ( AV106ParCod >= 0 )
      {
         addWhere(sWhereString, "(T1.ParCod = ?)");
      }
      else
      {
         GXv_int42[41] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV17OrderedBy == 1 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqCod" ;
      }
      else if ( ( AV17OrderedBy == 1 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqCod DESC" ;
      }
      else if ( ( AV17OrderedBy == 2 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.MaqDsc" ;
      }
      else if ( ( AV17OrderedBy == 2 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.MaqDsc DESC" ;
      }
      else if ( ( AV17OrderedBy == 3 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProLot" ;
      }
      else if ( ( AV17OrderedBy == 3 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProLot DESC" ;
      }
      else if ( ( AV17OrderedBy == 4 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliCod" ;
      }
      else if ( ( AV17OrderedBy == 4 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliCod DESC" ;
      }
      else if ( ( AV17OrderedBy == 5 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.CliNom" ;
      }
      else if ( ( AV17OrderedBy == 5 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.CliNom DESC" ;
      }
      else if ( ( AV17OrderedBy == 6 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.BarFecGen" ;
      }
      else if ( ( AV17OrderedBy == 6 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.BarFecGen DESC" ;
      }
      else if ( ( AV17OrderedBy == 7 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.BarSer" ;
      }
      else if ( ( AV17OrderedBy == 7 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.BarSer DESC" ;
      }
      else if ( ( AV17OrderedBy == 8 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.BarSerDsc" ;
      }
      else if ( ( AV17OrderedBy == 8 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.BarSerDsc DESC" ;
      }
      else if ( ( AV17OrderedBy == 9 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T5.TipArtDsc" ;
      }
      else if ( ( AV17OrderedBy == 9 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T5.TipArtDsc DESC" ;
      }
      else if ( ( AV17OrderedBy == 10 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Fase" ;
      }
      else if ( ( AV17OrderedBy == 10 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Fase DESC" ;
      }
      else if ( ( AV17OrderedBy == 11 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProDTI" ;
      }
      else if ( ( AV17OrderedBy == 11 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProDTI DESC" ;
      }
      else if ( ( AV17OrderedBy == 12 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProDTF" ;
      }
      else if ( ( AV17OrderedBy == 12 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProDTF DESC" ;
      }
      else if ( ( AV17OrderedBy == 13 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProKgr" ;
      }
      else if ( ( AV17OrderedBy == 13 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProKgr DESC" ;
      }
      else if ( ( AV17OrderedBy == 14 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProMtr" ;
      }
      else if ( ( AV17OrderedBy == 14 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProMtr DESC" ;
      }
      else if ( ( AV17OrderedBy == 15 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ParCod" ;
      }
      else if ( ( AV17OrderedBy == 15 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ParCod DESC" ;
      }
      else if ( ( AV17OrderedBy == 16 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T6.ParCodNom" ;
      }
      else if ( ( AV17OrderedBy == 16 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T6.ParCodNom DESC" ;
      }
      else if ( ( AV17OrderedBy == 17 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProTur" ;
      }
      else if ( ( AV17OrderedBy == 17 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProTur DESC" ;
      }
      else if ( ( AV17OrderedBy == 18 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProReo" ;
      }
      else if ( ( AV17OrderedBy == 18 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProReo DESC" ;
      }
      GXv_Object43[0] = scmdbuf ;
      GXv_Object43[1] = GXv_int42 ;
      return GXv_Object43 ;
   }

   protected Object[] conditional_H00TI4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV135Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel ,
                                          String AV134Wciformedetalladohdrsproduccionds_2_tfmaqcod ,
                                          String AV137Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel ,
                                          String AV136Wciformedetalladohdrsproduccionds_4_tfmaqdsc ,
                                          String AV139Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel ,
                                          String AV138Wciformedetalladohdrsproduccionds_6_tfbarnhdr ,
                                          String AV141Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel ,
                                          String AV140Wciformedetalladohdrsproduccionds_8_tfhisprolot ,
                                          int AV142Wciformedetalladohdrsproduccionds_10_tfclicod ,
                                          int AV143Wciformedetalladohdrsproduccionds_11_tfclicod_to ,
                                          String AV145Wciformedetalladohdrsproduccionds_13_tfclinom_sel ,
                                          String AV144Wciformedetalladohdrsproduccionds_12_tfclinom ,
                                          java.util.Date AV148Wciformedetalladohdrsproduccionds_16_tfbarfecgen ,
                                          String AV150Wciformedetalladohdrsproduccionds_18_tfbarser_sel ,
                                          String AV149Wciformedetalladohdrsproduccionds_17_tfbarser ,
                                          String AV152Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel ,
                                          String AV151Wciformedetalladohdrsproduccionds_19_tfbarserdsc ,
                                          String AV154Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel ,
                                          String AV153Wciformedetalladohdrsproduccionds_21_tfbartipartdsc ,
                                          String AV158Wciformedetalladohdrsproduccionds_26_tffase_sel ,
                                          String AV157Wciformedetalladohdrsproduccionds_25_tffase ,
                                          java.util.Date AV161Wciformedetalladohdrsproduccionds_29_tfhisprodti ,
                                          java.util.Date AV162Wciformedetalladohdrsproduccionds_30_tfhisprodtf ,
                                          java.math.BigDecimal AV163Wciformedetalladohdrsproduccionds_31_tfhisprokgr ,
                                          java.math.BigDecimal AV164Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to ,
                                          java.math.BigDecimal AV165Wciformedetalladohdrsproduccionds_33_tfhispromtr ,
                                          java.math.BigDecimal AV166Wciformedetalladohdrsproduccionds_34_tfhispromtr_to ,
                                          short AV167Wciformedetalladohdrsproduccionds_35_tfparcod ,
                                          short AV168Wciformedetalladohdrsproduccionds_36_tfparcod_to ,
                                          String AV170Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel ,
                                          String AV169Wciformedetalladohdrsproduccionds_37_tfparcodnom ,
                                          byte AV171Wciformedetalladohdrsproduccionds_39_tfhisprotur ,
                                          byte AV172Wciformedetalladohdrsproduccionds_40_tfhisprotur_to ,
                                          byte AV173Wciformedetalladohdrsproduccionds_41_tfhisproreo ,
                                          byte AV174Wciformedetalladohdrsproduccionds_42_tfhisproreo_to ,
                                          String AV9MaqCodInicial ,
                                          String AV8MaqCodFinal ,
                                          java.util.Date AV7Hisprodti ,
                                          java.util.Date AV6HisProdtf ,
                                          byte AV105HisProReo ,
                                          short AV106ParCod ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A3610HisProLot ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          java.util.Date A159BarFecGen ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A13711BarTipArtD ,
                                          String A461Fase ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          short A656ParCod ,
                                          String A867ParCodNom ,
                                          byte A566HisProTur ,
                                          byte A3612HisProReo ,
                                          String AV133Wciformedetalladohdrsproduccionds_1_filterfulltext ,
                                          String A13696BarNHdr ,
                                          String A13878PedidoClie ,
                                          String A13868BarTipColD ,
                                          String A13893FaseDescri ,
                                          String AV147Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel ,
                                          String AV146Wciformedetalladohdrsproduccionds_14_tfpedidocliente ,
                                          String AV156Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel ,
                                          String AV155Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc ,
                                          String AV160Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel ,
                                          String AV159Wciformedetalladohdrsproduccionds_27_tffasedescripcion ,
                                          String AV5Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int44 = new byte[42];
      Object[] GXv_Object45 = new Object[2];
      scmdbuf = "SELECT T1.HisProFec, T1.HisProLin, T3.BarTipArt AS BarTipArt, T1.HisProReo, T1.HisProTur, T6.ParCodNom, T1.ParCod, T1.HisProMtr, T1.HisProKgr, T1.HisProDTF, T1.HisProDTI," ;
      scmdbuf += " T5.TipArtDsc AS BarTipArtD, T3.BarSerDsc, T3.BarSer, T3.BarFecGen, T4.CliNom, T3.CliCod, T1.HisProLot, RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCod,'99999990'), 2))) ||" ;
      scmdbuf += " '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCodReo,'90'), 2))) || T3.BarCodPar AS BarNHdr, T2.MaqDsc, T1.MaqCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T3.BarDisNum," ;
      scmdbuf += " T3.BarEncCli, T3.BarTipCol, T1.Fase, T1.EmprCod FROM (((((TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) INNER JOIN" ;
      scmdbuf += " TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T4.CliCod = T3.CliCod) LEFT JOIN TXPTIPART T5 ON T5.EmprCod = T1.EmprCod AND T5.TipArtCod = T3.BarTipArt) LEFT JOIN TXPCODPAR T6 ON T6.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T6.ParCod = T1.ParCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV135Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV134Wciformedetalladohdrsproduccionds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int44[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int44[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV137Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV136Wciformedetalladohdrsproduccionds_4_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int44[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV137Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int44[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV138Wciformedetalladohdrsproduccionds_6_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int44[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int44[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV141Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel)==0) && ( ! (GXutil.strcmp("", AV140Wciformedetalladohdrsproduccionds_8_tfhisprolot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int44[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV141Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProLot = ?)");
      }
      else
      {
         GXv_int44[8] = (byte)(1) ;
      }
      if ( ! (0==AV142Wciformedetalladohdrsproduccionds_10_tfclicod) )
      {
         addWhere(sWhereString, "(T3.CliCod >= ?)");
      }
      else
      {
         GXv_int44[9] = (byte)(1) ;
      }
      if ( ! (0==AV143Wciformedetalladohdrsproduccionds_11_tfclicod_to) )
      {
         addWhere(sWhereString, "(T3.CliCod <= ?)");
      }
      else
      {
         GXv_int44[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV145Wciformedetalladohdrsproduccionds_13_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV144Wciformedetalladohdrsproduccionds_12_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int44[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV145Wciformedetalladohdrsproduccionds_13_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int44[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV148Wciformedetalladohdrsproduccionds_16_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T3.BarFecGen >= ?)");
      }
      else
      {
         GXv_int44[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV150Wciformedetalladohdrsproduccionds_18_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV149Wciformedetalladohdrsproduccionds_17_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int44[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV150Wciformedetalladohdrsproduccionds_18_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSer = ?)");
      }
      else
      {
         GXv_int44[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV152Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV151Wciformedetalladohdrsproduccionds_19_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int44[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV152Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSerDsc = ?)");
      }
      else
      {
         GXv_int44[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV154Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV153Wciformedetalladohdrsproduccionds_21_tfbartipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int44[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV154Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipArtDsc = ?)");
      }
      else
      {
         GXv_int44[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV158Wciformedetalladohdrsproduccionds_26_tffase_sel)==0) && ( ! (GXutil.strcmp("", AV157Wciformedetalladohdrsproduccionds_25_tffase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Fase) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int44[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV158Wciformedetalladohdrsproduccionds_26_tffase_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Fase = ?)");
      }
      else
      {
         GXv_int44[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV161Wciformedetalladohdrsproduccionds_29_tfhisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      }
      else
      {
         GXv_int44[22] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV162Wciformedetalladohdrsproduccionds_30_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int44[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV163Wciformedetalladohdrsproduccionds_31_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int44[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV164Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int44[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV165Wciformedetalladohdrsproduccionds_33_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int44[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV166Wciformedetalladohdrsproduccionds_34_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int44[27] = (byte)(1) ;
      }
      if ( ! (0==AV167Wciformedetalladohdrsproduccionds_35_tfparcod) )
      {
         addWhere(sWhereString, "(T1.ParCod >= ?)");
      }
      else
      {
         GXv_int44[28] = (byte)(1) ;
      }
      if ( ! (0==AV168Wciformedetalladohdrsproduccionds_36_tfparcod_to) )
      {
         addWhere(sWhereString, "(T1.ParCod <= ?)");
      }
      else
      {
         GXv_int44[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV170Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel)==0) && ( ! (GXutil.strcmp("", AV169Wciformedetalladohdrsproduccionds_37_tfparcodnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T6.ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int44[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV170Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel)==0) )
      {
         addWhere(sWhereString, "(T6.ParCodNom = ?)");
      }
      else
      {
         GXv_int44[31] = (byte)(1) ;
      }
      if ( ! (0==AV171Wciformedetalladohdrsproduccionds_39_tfhisprotur) )
      {
         addWhere(sWhereString, "(T1.HisProTur >= ?)");
      }
      else
      {
         GXv_int44[32] = (byte)(1) ;
      }
      if ( ! (0==AV172Wciformedetalladohdrsproduccionds_40_tfhisprotur_to) )
      {
         addWhere(sWhereString, "(T1.HisProTur <= ?)");
      }
      else
      {
         GXv_int44[33] = (byte)(1) ;
      }
      if ( ! (0==AV173Wciformedetalladohdrsproduccionds_41_tfhisproreo) )
      {
         addWhere(sWhereString, "(T1.HisProReo >= ?)");
      }
      else
      {
         GXv_int44[34] = (byte)(1) ;
      }
      if ( ! (0==AV174Wciformedetalladohdrsproduccionds_42_tfhisproreo_to) )
      {
         addWhere(sWhereString, "(T1.HisProReo <= ?)");
      }
      else
      {
         GXv_int44[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV9MaqCodInicial)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod >= ?)");
      }
      else
      {
         GXv_int44[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8MaqCodFinal)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod <= ?)");
      }
      else
      {
         GXv_int44[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV7Hisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int44[38] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV6HisProdtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF <= ?)");
      }
      else
      {
         GXv_int44[39] = (byte)(1) ;
      }
      if ( ! ( AV105HisProReo == 9 ) )
      {
         addWhere(sWhereString, "(T1.HisProReo = ?)");
      }
      else
      {
         GXv_int44[40] = (byte)(1) ;
      }
      if ( AV106ParCod >= 0 )
      {
         addWhere(sWhereString, "(T1.ParCod = ?)");
      }
      else
      {
         GXv_int44[41] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object45[0] = scmdbuf ;
      GXv_Object45[1] = GXv_int44 ;
      return GXv_Object45 ;
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
                  return conditional_H00TI2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).byteValue() , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , ((Number) dynConstraints[39]).byteValue() , ((Number) dynConstraints[40]).shortValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , ((Number) dynConstraints[44]).byteValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() , (String)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (java.util.Date)dynConstraints[54] , (java.util.Date)dynConstraints[55] , (java.math.BigDecimal)dynConstraints[56] , (java.math.BigDecimal)dynConstraints[57] , ((Number) dynConstraints[58]).shortValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).byteValue() , ((Number) dynConstraints[61]).byteValue() , ((Number) dynConstraints[62]).shortValue() , ((Boolean) dynConstraints[63]).booleanValue() , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] );
            case 1 :
                  return conditional_H00TI3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).byteValue() , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , ((Number) dynConstraints[39]).byteValue() , ((Number) dynConstraints[40]).shortValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , ((Number) dynConstraints[44]).byteValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() , (String)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (java.util.Date)dynConstraints[54] , (java.util.Date)dynConstraints[55] , (java.math.BigDecimal)dynConstraints[56] , (java.math.BigDecimal)dynConstraints[57] , ((Number) dynConstraints[58]).shortValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).byteValue() , ((Number) dynConstraints[61]).byteValue() , ((Number) dynConstraints[62]).shortValue() , ((Boolean) dynConstraints[63]).booleanValue() , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] );
            case 2 :
                  return conditional_H00TI4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).byteValue() , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , ((Number) dynConstraints[39]).byteValue() , ((Number) dynConstraints[40]).shortValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , ((Number) dynConstraints[44]).byteValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() , (String)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (java.util.Date)dynConstraints[54] , (java.util.Date)dynConstraints[55] , (java.math.BigDecimal)dynConstraints[56] , (java.math.BigDecimal)dynConstraints[57] , ((Number) dynConstraints[58]).shortValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).byteValue() , ((Number) dynConstraints[61]).byteValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00TI2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00TI3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00TI4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[12])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 26);
               ((String[]) buf[15])[0] = rslt.getString(12, 16);
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(13);
               ((String[]) buf[17])[0] = rslt.getString(14, 30);
               ((int[]) buf[18])[0] = rslt.getInt(15);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(16, 10);
               ((String[]) buf[21])[0] = rslt.getString(17, 11);
               ((String[]) buf[22])[0] = rslt.getString(18, 16);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(19, 6);
               ((int[]) buf[25])[0] = rslt.getInt(20);
               ((byte[]) buf[26])[0] = rslt.getByte(21);
               ((String[]) buf[27])[0] = rslt.getString(22, 1);
               ((String[]) buf[28])[0] = rslt.getString(23, 8);
               ((String[]) buf[29])[0] = rslt.getString(24, 20);
               ((byte[]) buf[30])[0] = rslt.getByte(25);
               ((String[]) buf[31])[0] = rslt.getString(26, 8);
               ((int[]) buf[32])[0] = rslt.getInt(27);
               ((String[]) buf[33])[0] = rslt.getString(28, 3);
               ((java.util.Date[]) buf[34])[0] = rslt.getGXDateTime(29);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[36])[0] = rslt.getGXDateTime(30);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               return;
            case 1 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[12])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 26);
               ((String[]) buf[15])[0] = rslt.getString(12, 16);
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(13);
               ((String[]) buf[17])[0] = rslt.getString(14, 30);
               ((int[]) buf[18])[0] = rslt.getInt(15);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(16, 10);
               ((String[]) buf[21])[0] = rslt.getString(17, 11);
               ((String[]) buf[22])[0] = rslt.getString(18, 16);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(19, 6);
               ((int[]) buf[25])[0] = rslt.getInt(20);
               ((byte[]) buf[26])[0] = rslt.getByte(21);
               ((String[]) buf[27])[0] = rslt.getString(22, 1);
               ((String[]) buf[28])[0] = rslt.getString(23, 8);
               ((String[]) buf[29])[0] = rslt.getString(24, 20);
               ((byte[]) buf[30])[0] = rslt.getByte(25);
               ((String[]) buf[31])[0] = rslt.getString(26, 8);
               ((int[]) buf[32])[0] = rslt.getInt(27);
               ((String[]) buf[33])[0] = rslt.getString(28, 3);
               ((java.util.Date[]) buf[34])[0] = rslt.getGXDateTime(29);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[36])[0] = rslt.getGXDateTime(30);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               return;
            case 2 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(13, 26);
               ((String[]) buf[19])[0] = rslt.getString(14, 16);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(15);
               ((String[]) buf[21])[0] = rslt.getString(16, 30);
               ((int[]) buf[22])[0] = rslt.getInt(17);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(18, 10);
               ((String[]) buf[25])[0] = rslt.getString(19, 11);
               ((String[]) buf[26])[0] = rslt.getString(20, 16);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(21, 6);
               ((int[]) buf[29])[0] = rslt.getInt(22);
               ((byte[]) buf[30])[0] = rslt.getByte(23);
               ((String[]) buf[31])[0] = rslt.getString(24, 1);
               ((String[]) buf[32])[0] = rslt.getString(25, 8);
               ((String[]) buf[33])[0] = rslt.getString(26, 20);
               ((byte[]) buf[34])[0] = rslt.getByte(27);
               ((String[]) buf[35])[0] = rslt.getString(28, 8);
               ((String[]) buf[36])[0] = rslt.getString(29, 3);
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
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 10);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 10);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[55]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[64], false);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[65], false);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[70]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[71]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[76]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[77]).byteValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 6);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 6);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[80], false);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[81], false);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[82]).byteValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[83]).shortValue());
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
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 10);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 10);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[55]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[64], false);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[65], false);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[70]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[71]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[76]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[77]).byteValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 6);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 6);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[80], false);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[81], false);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[82]).byteValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[83]).shortValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 10);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 10);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[55]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[64], false);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[65], false);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[70]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[71]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[76]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[77]).byteValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 6);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 6);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[80], false);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[81], false);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[82]).byteValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[83]).shortValue());
               }
               return;
      }
   }

}

