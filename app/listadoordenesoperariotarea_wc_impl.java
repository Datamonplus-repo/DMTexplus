package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class listadoordenesoperariotarea_wc_impl extends GXWebComponent
{
   public listadoordenesoperariotarea_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public listadoordenesoperariotarea_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( listadoordenesoperariotarea_wc_impl.class ));
   }

   public listadoordenesoperariotarea_wc_impl( int remoteHandle ,
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
            gxfirstwebparm = httpContext.GetFirstPar( "Omcod") ;
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
               AV7Omcod = (int)(GXutil.lval( httpContext.GetPar( "Omcod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Omcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7Omcod), 8, 0));
               AV36OmCod_to = (int)(GXutil.lval( httpContext.GetPar( "OmCod_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36OmCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36OmCod_to), 8, 0));
               AV44OmMaqCod = httpContext.GetPar( "OmMaqCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44OmMaqCod", AV44OmMaqCod);
               AV45OmMaqCod_to = httpContext.GetPar( "OmMaqCod_to") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45OmMaqCod_to", AV45OmMaqCod_to);
               AV8Omopecod = (int)(GXutil.lval( httpContext.GetPar( "Omopecod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Omopecod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8Omopecod), 6, 0));
               AV53OmOpeCod_to = (int)(GXutil.lval( httpContext.GetPar( "OmOpeCod_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53OmOpeCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53OmOpeCod_to), 6, 0));
               AV39Omfchcer = localUtil.parseDateParm( httpContext.GetPar( "Omfchcer")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39Omfchcer", localUtil.format(AV39Omfchcer, "99/99/99"));
               AV40OMFchCer_to = localUtil.parseDateParm( httpContext.GetPar( "OMFchCer_to")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40OMFchCer_to", localUtil.format(AV40OMFchCer_to, "99/99/99"));
               AV60Preventivos = (byte)(GXutil.lval( httpContext.GetPar( "Preventivos"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60Preventivos", GXutil.str( AV60Preventivos, 1, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,Integer.valueOf(AV7Omcod),Integer.valueOf(AV36OmCod_to),AV44OmMaqCod,AV45OmMaqCod_to,Integer.valueOf(AV8Omopecod),Integer.valueOf(AV53OmOpeCod_to),AV39Omfchcer,AV40OMFchCer_to,Byte.valueOf(AV60Preventivos)});
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
               gxfirstwebparm = httpContext.GetFirstPar( "Omcod") ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
            {
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxfirstwebparm = httpContext.GetFirstPar( "Omcod") ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid1") == 0 )
            {
               gxnrgrid1_newrow_invoke( ) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Grid1") == 0 )
            {
               gxgrgrid1_refresh_invoke( ) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid2") == 0 )
            {
               gxnrgrid2_newrow_invoke( ) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Grid2") == 0 )
            {
               gxgrgrid2_refresh_invoke( ) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid3") == 0 )
            {
               gxnrgrid3_newrow_invoke( ) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Grid3") == 0 )
            {
               gxgrgrid3_refresh_invoke( ) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid4") == 0 )
            {
               gxnrgrid4_newrow_invoke( ) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Grid4") == 0 )
            {
               gxgrgrid4_refresh_invoke( ) ;
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

   public void gxnrgrid1_newrow_invoke( )
   {
      nRC_GXsfl_44 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_44"))) ;
      nGXsfl_44_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_44_idx"))) ;
      sGXsfl_44_idx = httpContext.GetPar( "sGXsfl_44_idx") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid1_newrow( ) ;
      /* End function gxnrGrid1_newrow_invoke */
   }

   public void gxgrgrid1_refresh_invoke( )
   {
      subGrid1_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid1_Rows"))) ;
      subGrid2_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid2_Rows"))) ;
      subGrid3_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid3_Rows"))) ;
      subGrid4_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid4_Rows"))) ;
      AV40OMFchCer_to = localUtil.parseDateParm( httpContext.GetPar( "OMFchCer_to")) ;
      AV53OmOpeCod_to = (int)(GXutil.lval( httpContext.GetPar( "OmOpeCod_to"))) ;
      AV36OmCod_to = (int)(GXutil.lval( httpContext.GetPar( "OmCod_to"))) ;
      AV45OmMaqCod_to = httpContext.GetPar( "OmMaqCod_to") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A9445OMEst = httpContext.GetPar( "OMEst") ;
      A9439OMFchCer = localUtil.parseDTimeParm( httpContext.GetPar( "OMFchCer")) ;
      AV5EmprCod = httpContext.GetPar( "EmprCod") ;
      A9425OMCod = (int)(GXutil.lval( httpContext.GetPar( "OMCod"))) ;
      AV7Omcod = (int)(GXutil.lval( httpContext.GetPar( "Omcod"))) ;
      AV39Omfchcer = localUtil.parseDateParm( httpContext.GetPar( "Omfchcer")) ;
      A9429PMCod = (int)(GXutil.lval( httpContext.GetPar( "PMCod"))) ;
      n9429PMCod = false ;
      AV60Preventivos = (byte)(GXutil.lval( httpContext.GetPar( "Preventivos"))) ;
      A9426OMMaqCod = httpContext.GetPar( "OMMaqCod") ;
      AV44OmMaqCod = httpContext.GetPar( "OmMaqCod") ;
      A9455OMOpeCod = (int)(GXutil.lval( httpContext.GetPar( "OMOpeCod"))) ;
      AV8Omopecod = (int)(GXutil.lval( httpContext.GetPar( "Omopecod"))) ;
      A9469OMMCFin = localUtil.parseDTimeParm( httpContext.GetPar( "OMMCFin")) ;
      A9468OMMCIni = localUtil.parseDTimeParm( httpContext.GetPar( "OMMCIni")) ;
      A9427OMMaqDsc = httpContext.GetPar( "OMMaqDsc") ;
      n9427OMMaqDsc = false ;
      A9436OMFchCre = localUtil.parseDTimeParm( httpContext.GetPar( "OMFchCre")) ;
      A9433OMTxt = httpContext.GetPar( "OMTxt") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid1_refresh( subGrid1_Rows, subGrid2_Rows, subGrid3_Rows, subGrid4_Rows, AV40OMFchCer_to, AV53OmOpeCod_to, AV36OmCod_to, AV45OmMaqCod_to, A396EmprCod, A9445OMEst, A9439OMFchCer, AV5EmprCod, A9425OMCod, AV7Omcod, AV39Omfchcer, A9429PMCod, AV60Preventivos, A9426OMMaqCod, AV44OmMaqCod, A9455OMOpeCod, AV8Omopecod, A9469OMMCFin, A9468OMMCIni, A9427OMMaqDsc, A9436OMFchCre, A9433OMTxt, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid1_refresh_invoke */
   }

   public void gxnrgrid2_newrow_invoke( )
   {
      nRC_GXsfl_67 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_67"))) ;
      nGXsfl_67_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_67_idx"))) ;
      sGXsfl_67_idx = httpContext.GetPar( "sGXsfl_67_idx") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid2_newrow( ) ;
      /* End function gxnrGrid2_newrow_invoke */
   }

   public void gxgrgrid2_refresh_invoke( )
   {
      subGrid1_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid1_Rows"))) ;
      subGrid2_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid2_Rows"))) ;
      subGrid3_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid3_Rows"))) ;
      subGrid4_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid4_Rows"))) ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A9425OMCod = (int)(GXutil.lval( httpContext.GetPar( "OMCod"))) ;
      A9455OMOpeCod = (int)(GXutil.lval( httpContext.GetPar( "OMOpeCod"))) ;
      AV5EmprCod = httpContext.GetPar( "EmprCod") ;
      AV71OmCodSelected = (int)(GXutil.lval( httpContext.GetPar( "OmCodSelected"))) ;
      A9456OMOpeNom = httpContext.GetPar( "OMOpeNom") ;
      n9456OMOpeNom = false ;
      A9469OMMCFin = localUtil.parseDTimeParm( httpContext.GetPar( "OMMCFin")) ;
      A9468OMMCIni = localUtil.parseDTimeParm( httpContext.GetPar( "OMMCIni")) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid2_refresh( subGrid1_Rows, subGrid2_Rows, subGrid3_Rows, subGrid4_Rows, A396EmprCod, A9425OMCod, A9455OMOpeCod, AV5EmprCod, AV71OmCodSelected, A9456OMOpeNom, A9469OMMCFin, A9468OMMCIni, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid2_refresh_invoke */
   }

   public void gxnrgrid3_newrow_invoke( )
   {
      nRC_GXsfl_81 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_81"))) ;
      nGXsfl_81_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_81_idx"))) ;
      sGXsfl_81_idx = httpContext.GetPar( "sGXsfl_81_idx") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid3_newrow( ) ;
      /* End function gxnrGrid3_newrow_invoke */
   }

   public void gxgrgrid3_refresh_invoke( )
   {
      subGrid1_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid1_Rows"))) ;
      subGrid2_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid2_Rows"))) ;
      subGrid3_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid3_Rows"))) ;
      subGrid4_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid4_Rows"))) ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A9425OMCod = (int)(GXutil.lval( httpContext.GetPar( "OMCod"))) ;
      A9430TMCod = (int)(GXutil.lval( httpContext.GetPar( "TMCod"))) ;
      AV5EmprCod = httpContext.GetPar( "EmprCod") ;
      AV71OmCodSelected = (int)(GXutil.lval( httpContext.GetPar( "OmCodSelected"))) ;
      A9431TMDsc = httpContext.GetPar( "TMDsc") ;
      n9431TMDsc = false ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid3_refresh( subGrid1_Rows, subGrid2_Rows, subGrid3_Rows, subGrid4_Rows, A396EmprCod, A9425OMCod, A9430TMCod, AV5EmprCod, AV71OmCodSelected, A9431TMDsc, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid3_refresh_invoke */
   }

   public void gxnrgrid4_newrow_invoke( )
   {
      nRC_GXsfl_92 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_92"))) ;
      nGXsfl_92_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_92_idx"))) ;
      sGXsfl_92_idx = httpContext.GetPar( "sGXsfl_92_idx") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid4_newrow( ) ;
      /* End function gxnrGrid4_newrow_invoke */
   }

   public void gxgrgrid4_refresh_invoke( )
   {
      subGrid1_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid1_Rows"))) ;
      subGrid2_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid2_Rows"))) ;
      subGrid3_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid3_Rows"))) ;
      subGrid4_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid4_Rows"))) ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A9425OMCod = (int)(GXutil.lval( httpContext.GetPar( "OMCod"))) ;
      A9446OMRepCod = (int)(GXutil.lval( httpContext.GetPar( "OMRepCod"))) ;
      AV5EmprCod = httpContext.GetPar( "EmprCod") ;
      AV38OmCodGrid = (int)(GXutil.lval( httpContext.GetPar( "OmCodGrid"))) ;
      A9447OMRepNom = httpContext.GetPar( "OMRepNom") ;
      n9447OMRepNom = false ;
      A9452OMRCCnt = CommonUtil.decimalVal( httpContext.GetPar( "OMRCCnt"), ".") ;
      A9453OMRCPre = CommonUtil.decimalVal( httpContext.GetPar( "OMRCPre"), ".") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid4_refresh( subGrid1_Rows, subGrid2_Rows, subGrid3_Rows, subGrid4_Rows, A396EmprCod, A9425OMCod, A9446OMRepCod, AV5EmprCod, AV38OmCodGrid, A9447OMRepNom, A9452OMRCCnt, A9453OMRCPre, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid4_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1PV2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Listado Ordenes de Mantenimiento", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.closeHtmlHeader();
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
         FormProcess = ((nGXWrapped==0) ? " data-HasEnter=\"false\" data-Skiponenter=\"false\"" : "") ;
         httpContext.writeText( "<body ") ;
         bodyStyle = "" ;
         if ( nGXWrapped == 0 )
         {
            bodyStyle += "-moz-opacity:0;opacity:0;" ;
         }
         httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
         httpContext.writeText( FormProcess+">") ;
         httpContext.skipLines( 1 );
         if ( nGXWrapped != 1 )
         {
            httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.listadoordenesoperariotarea_wc", new String[] {GXutil.URLEncode(GXutil.ltrimstr(AV7Omcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV36OmCod_to,8,0)),GXutil.URLEncode(GXutil.rtrim(AV44OmMaqCod)),GXutil.URLEncode(GXutil.rtrim(AV45OmMaqCod_to)),GXutil.URLEncode(GXutil.ltrimstr(AV8Omopecod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV53OmOpeCod_to,6,0)),GXutil.URLEncode(GXutil.formatDateParm(AV39Omfchcer)),GXutil.URLEncode(GXutil.formatDateParm(AV40OMFchCer_to)),GXutil.URLEncode(GXutil.ltrimstr(AV60Preventivos,1,0))}, new String[] {"Omcod","OmCod_to","OmMaqCod","OmMaqCod_to","Omopecod","OmOpeCod_to","Omfchcer","OMFchCer_to","Preventivos"}) +"\">") ;
            app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
            app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
            app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
            httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, "FORM", "Class", "form-horizontal Form", true);
         }
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
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_44", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_44, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_67", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_67, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_81", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_81, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_92", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_92, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7Omcod", GXutil.ltrim( localUtil.ntoc( wcpOAV7Omcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV36OmCod_to", GXutil.ltrim( localUtil.ntoc( wcpOAV36OmCod_to, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV44OmMaqCod", GXutil.rtrim( wcpOAV44OmMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV45OmMaqCod_to", GXutil.rtrim( wcpOAV45OmMaqCod_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8Omopecod", GXutil.ltrim( localUtil.ntoc( wcpOAV8Omopecod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV53OmOpeCod_to", GXutil.ltrim( localUtil.ntoc( wcpOAV53OmOpeCod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV39Omfchcer", localUtil.dtoc( wcpOAV39Omfchcer, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV40OMFchCer_to", localUtil.dtoc( wcpOAV40OMFchCer_to, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV60Preventivos", GXutil.ltrim( localUtil.ntoc( wcpOAV60Preventivos, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"OMCOD", GXutil.ltrim( localUtil.ntoc( A9425OMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"OMREPCOD", GXutil.ltrim( localUtil.ntoc( A9446OMRepCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"OMREPNOM", GXutil.rtrim( A9447OMRepNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"OMRCCNT", GXutil.ltrim( localUtil.ntoc( A9452OMRCCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"OMRCPRE", GXutil.ltrim( localUtil.ntoc( A9453OMRCPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TMCOD", GXutil.ltrim( localUtil.ntoc( A9430TMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vOMCODSELECTED", GXutil.ltrim( localUtil.ntoc( AV71OmCodSelected, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TMDSC", GXutil.rtrim( A9431TMDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"OMOPECOD", GXutil.ltrim( localUtil.ntoc( A9455OMOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"OMOPENOM", GXutil.rtrim( A9456OMOpeNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"OMMCFIN", localUtil.ttoc( A9469OMMCFin, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"OMMCINI", localUtil.ttoc( A9468OMMCIni, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vOMFCHCER_TO", localUtil.dtoc( AV40OMFchCer_to, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vOMOPECOD_TO", GXutil.ltrim( localUtil.ntoc( AV53OmOpeCod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vOMCOD_TO", GXutil.ltrim( localUtil.ntoc( AV36OmCod_to, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vOMMAQCOD_TO", GXutil.rtrim( AV45OmMaqCod_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vOMCOD", GXutil.ltrim( localUtil.ntoc( AV7Omcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vOMFCHCER", localUtil.dtoc( AV39Omfchcer, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PMCOD", GXutil.ltrim( localUtil.ntoc( A9429PMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPREVENTIVOS", GXutil.ltrim( localUtil.ntoc( AV60Preventivos, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"OMMAQCOD", GXutil.rtrim( A9426OMMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vOMMAQCOD", GXutil.rtrim( AV44OmMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vOMOPECOD", GXutil.ltrim( localUtil.ntoc( AV8Omopecod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"OMMAQDSC", GXutil.rtrim( A9427OMMaqDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"OMFCHCRE", localUtil.ttoc( A9436OMFchCre, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"OMTXT", A9433OMTxt);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID2_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID2_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID3_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID3_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID4_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID4_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID2_nEOF", GXutil.ltrim( localUtil.ntoc( GRID2_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID3_nEOF", GXutil.ltrim( localUtil.ntoc( GRID3_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID4_nEOF", GXutil.ltrim( localUtil.ntoc( GRID4_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"OMEST", GXutil.rtrim( A9445OMEst));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"OMFCHCER", localUtil.ttoc( A9439OMFchCer, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID2_Rows", GXutil.ltrim( localUtil.ntoc( subGrid2_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID3_Rows", GXutil.ltrim( localUtil.ntoc( subGrid3_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID4_Rows", GXutil.ltrim( localUtil.ntoc( subGrid4_Rows, (byte)(6), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID4_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid4_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID3_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid3_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID3_EMPOWERER_Infinitescrolling", GXutil.rtrim( Grid3_empowerer_Infinitescrolling));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID2_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid2_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID2_EMPOWERER_Infinitescrolling", GXutil.rtrim( Grid2_empowerer_Infinitescrolling));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID1_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid1_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID1_EMPOWERER_Infinitescrolling", GXutil.rtrim( Grid1_empowerer_Infinitescrolling));
   }

   public void renderHtmlCloseForm1PV2( )
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
         if ( nGXWrapped != 1 )
         {
            httpContext.writeTextNL( "</form>") ;
         }
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
      return "ListadoOrdenesOperarioTarea_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Listado Ordenes de Mantenimiento", "") ;
   }

   public void wb1PV0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.listadoordenesoperariotarea_wc");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, sPrefix, "false");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexcel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 44, 2, 0)+","+"null"+");", httpContext.getMessage( "Excel", ""), bttBtnexcel_Jsonclick, 5, httpContext.getMessage( "Excel", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXCEL\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ListadoOrdenesOperarioTarea_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexcel_2_Internalname, "gx.evt.setGridEvt("+GXutil.str( 44, 2, 0)+","+"null"+");", httpContext.getMessage( "Excel 'Detallado'", ""), bttBtnexcel_2_Jsonclick, 5, httpContext.getMessage( "Excel 'Detallado'", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXCEL_2\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ListadoOrdenesOperarioTarea_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_27_1PV2( true) ;
      }
      else
      {
         wb_table1_27_1PV2( false) ;
      }
      return  ;
   }

   public void wb_table1_27_1PV2e( boolean wbgen )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableordenes_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-7", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableordensmanten_Internalname, 1, 0, "px", divTableordensmanten_Height, "px", "GridVerticalScroll", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "Center", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock_resultado1_Internalname, httpContext.getMessage( "Ordenes de Mantenimiento", ""), "", "", lblTextblock_resultado1_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "WizardStepDescription", 0, "", 1, 1, 0, (short)(1), "HLP_ListadoOrdenesOperarioTarea_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 HasGridEmpowerer", "left", "top", "", "", "div");
         /*  Grid Control  */
         Grid1Container.SetWrapped(nGXWrapped);
         startgridcontrol44( ) ;
      }
      if ( wbEnd == 44 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_44 = (int)(nGXsfl_44_idx-1) ;
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            Grid1Container.AddObjectProperty("GRID1_nEOF", GRID1_nEOF);
            Grid1Container.AddObjectProperty("GRID1_nFirstRecordOnPage", GRID1_nFirstRecordOnPage);
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+sPrefix+"Grid1Container"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Grid1", Grid1Container, subGrid1_Internalname);
            if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Grid1ContainerData", Grid1Container.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Grid1ContainerData"+"V", Grid1Container.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"Grid1ContainerData"+"V"+"\" value='"+Grid1Container.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableoperario_Internalname, 1, 0, "px", divTableoperario_Height, "px", "GridVerticalScroll", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "Center", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock_resultado2_Internalname, httpContext.getMessage( "Operario de Orden", ""), "", "", lblTextblock_resultado2_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "WizardStepDescription", 0, "", 1, 1, 0, (short)(1), "HLP_ListadoOrdenesOperarioTarea_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 HasGridEmpowerer", "left", "top", "", "", "div");
         /*  Grid Control  */
         Grid2Container.SetWrapped(nGXWrapped);
         startgridcontrol67( ) ;
      }
      if ( wbEnd == 67 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_67 = (int)(nGXsfl_67_idx-1) ;
         if ( Grid2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            Grid2Container.AddObjectProperty("GRID2_nEOF", GRID2_nEOF);
            Grid2Container.AddObjectProperty("GRID2_nFirstRecordOnPage", GRID2_nFirstRecordOnPage);
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+sPrefix+"Grid2Container"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Grid2", Grid2Container, subGrid2_Internalname);
            if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Grid2ContainerData", Grid2Container.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Grid2ContainerData"+"V", Grid2Container.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"Grid2ContainerData"+"V"+"\" value='"+Grid2Container.GridValuesHidden()+"'/>") ;
            }
         }
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
         app.GxWebStd.gx_div_start( httpContext, divTabletarea_Internalname, 1, 0, "px", divTabletarea_Height, "px", "GridVerticalScroll", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "Center", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock_resultado3_Internalname, httpContext.getMessage( "Tarea de Operario", ""), "", "", lblTextblock_resultado3_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "WizardStepDescription", 0, "", 1, 1, 0, (short)(1), "HLP_ListadoOrdenesOperarioTarea_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 HasGridEmpowerer", "left", "top", "", "", "div");
         /*  Grid Control  */
         Grid3Container.SetWrapped(nGXWrapped);
         startgridcontrol81( ) ;
      }
      if ( wbEnd == 81 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_81 = (int)(nGXsfl_81_idx-1) ;
         if ( Grid3Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            Grid3Container.AddObjectProperty("GRID3_nEOF", GRID3_nEOF);
            Grid3Container.AddObjectProperty("GRID3_nFirstRecordOnPage", GRID3_nFirstRecordOnPage);
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+sPrefix+"Grid3Container"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Grid3", Grid3Container, subGrid3_Internalname);
            if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Grid3ContainerData", Grid3Container.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Grid3ContainerData"+"V", Grid3Container.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"Grid3ContainerData"+"V"+"\" value='"+Grid3Container.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, divTablerepuestos_Internalname, divTablerepuestos_Visible, 0, "px", divTablerepuestos_Height, "px", "GroupVerticalScroll", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "Center", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock_repuestos_Internalname, httpContext.getMessage( "Repuestos", ""), "", "", lblTextblock_repuestos_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "WizardStepDescription", 0, "", 1, 1, 0, (short)(1), "HLP_ListadoOrdenesOperarioTarea_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 HasGridEmpowerer", "left", "top", "", "", "div");
         /*  Grid Control  */
         Grid4Container.SetWrapped(nGXWrapped);
         startgridcontrol92( ) ;
      }
      if ( wbEnd == 92 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_92 = (int)(nGXsfl_92_idx-1) ;
         if ( Grid4Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            Grid4Container.AddObjectProperty("GRID4_nEOF", GRID4_nEOF);
            Grid4Container.AddObjectProperty("GRID4_nFirstRecordOnPage", GRID4_nFirstRecordOnPage);
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+sPrefix+"Grid4Container"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Grid4", Grid4Container, subGrid4_Internalname);
            if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Grid4ContainerData", Grid4Container.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Grid4ContainerData"+"V", Grid4Container.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"Grid4ContainerData"+"V"+"\" value='"+Grid4Container.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 100,'" + sPrefix + "',false,'" + sGXsfl_44_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavEmprcod_Internalname, GXutil.rtrim( AV5EmprCod), GXutil.rtrim( localUtil.format( AV5EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,100);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavEmprcod_Jsonclick, 0, "Attribute", "", "", "", "", edtavEmprcod_Visible, 1, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ListadoOrdenesOperarioTarea_WC.htm");
         /* User Defined Control */
         ucGrid4_empowerer.render(context, "wwp.gridempowerer", Grid4_empowerer_Internalname, sPrefix+"GRID4_EMPOWERERContainer");
         /* User Defined Control */
         ucGrid3_empowerer.setProperty("InfiniteScrolling", Grid3_empowerer_Infinitescrolling);
         ucGrid3_empowerer.render(context, "wwp.gridempowerer", Grid3_empowerer_Internalname, sPrefix+"GRID3_EMPOWERERContainer");
         /* User Defined Control */
         ucGrid2_empowerer.setProperty("InfiniteScrolling", Grid2_empowerer_Infinitescrolling);
         ucGrid2_empowerer.render(context, "wwp.gridempowerer", Grid2_empowerer_Internalname, sPrefix+"GRID2_EMPOWERERContainer");
         /* User Defined Control */
         ucGrid1_empowerer.setProperty("InfiniteScrolling", Grid1_empowerer_Infinitescrolling);
         ucGrid1_empowerer.render(context, "wwp.gridempowerer", Grid1_empowerer_Internalname, sPrefix+"GRID1_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 44 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( Grid1Container.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               Grid1Container.AddObjectProperty("GRID1_nEOF", GRID1_nEOF);
               Grid1Container.AddObjectProperty("GRID1_nFirstRecordOnPage", GRID1_nFirstRecordOnPage);
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+sPrefix+"Grid1Container"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Grid1", Grid1Container, subGrid1_Internalname);
               if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Grid1ContainerData", Grid1Container.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Grid1ContainerData"+"V", Grid1Container.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"Grid1ContainerData"+"V"+"\" value='"+Grid1Container.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      if ( wbEnd == 67 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( Grid2Container.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               Grid2Container.AddObjectProperty("GRID2_nEOF", GRID2_nEOF);
               Grid2Container.AddObjectProperty("GRID2_nFirstRecordOnPage", GRID2_nFirstRecordOnPage);
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+sPrefix+"Grid2Container"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Grid2", Grid2Container, subGrid2_Internalname);
               if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Grid2ContainerData", Grid2Container.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Grid2ContainerData"+"V", Grid2Container.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"Grid2ContainerData"+"V"+"\" value='"+Grid2Container.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      if ( wbEnd == 81 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( Grid3Container.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               Grid3Container.AddObjectProperty("GRID3_nEOF", GRID3_nEOF);
               Grid3Container.AddObjectProperty("GRID3_nFirstRecordOnPage", GRID3_nFirstRecordOnPage);
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+sPrefix+"Grid3Container"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Grid3", Grid3Container, subGrid3_Internalname);
               if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Grid3ContainerData", Grid3Container.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Grid3ContainerData"+"V", Grid3Container.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"Grid3ContainerData"+"V"+"\" value='"+Grid3Container.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      if ( wbEnd == 92 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( Grid4Container.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               Grid4Container.AddObjectProperty("GRID4_nEOF", GRID4_nEOF);
               Grid4Container.AddObjectProperty("GRID4_nFirstRecordOnPage", GRID4_nFirstRecordOnPage);
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+sPrefix+"Grid4Container"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Grid4", Grid4Container, subGrid4_Internalname);
               if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Grid4ContainerData", Grid4Container.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Grid4ContainerData"+"V", Grid4Container.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"Grid4ContainerData"+"V"+"\" value='"+Grid4Container.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void start1PV2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Listado Ordenes de Mantenimiento", ""), (short)(0)) ;
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
            strup1PV0( ) ;
         }
      }
   }

   public void ws1PV2( )
   {
      start1PV2( ) ;
      evt1PV2( ) ;
   }

   public void evt1PV2( )
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
                              strup1PV0( ) ;
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
                        else if ( GXutil.strcmp(sEvt, "'DOEXCEL'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1PV0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExcel' */
                                 e111PV2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXCEL_2'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1PV0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExcel_2' */
                                 e121PV2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1PV0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavOmcodgrid_Internalname ;
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRID1PAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1PV0( ) ;
                           }
                           sEvt = httpContext.cgiGet( sPrefix+"GRID1PAGING") ;
                           if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                           {
                              subgrid1_firstpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "PREV") == 0 )
                           {
                              subgrid1_previouspage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                           {
                              subgrid1_nextpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                           {
                              subgrid1_lastpage( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRID2PAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1PV0( ) ;
                           }
                           sEvt = httpContext.cgiGet( sPrefix+"GRID2PAGING") ;
                           if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                           {
                              subgrid2_firstpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "PREV") == 0 )
                           {
                              subgrid2_previouspage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                           {
                              subgrid2_nextpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                           {
                              subgrid2_lastpage( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRID3PAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1PV0( ) ;
                           }
                           sEvt = httpContext.cgiGet( sPrefix+"GRID3PAGING") ;
                           if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                           {
                              subgrid3_firstpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "PREV") == 0 )
                           {
                              subgrid3_previouspage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                           {
                              subgrid3_nextpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                           {
                              subgrid3_lastpage( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRID4PAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1PV0( ) ;
                           }
                           sEvt = httpContext.cgiGet( sPrefix+"GRID4PAGING") ;
                           if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                           {
                              subgrid4_firstpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "PREV") == 0 )
                           {
                              subgrid4_previouspage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                           {
                              subgrid4_nextpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                           {
                              subgrid4_lastpage( ) ;
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID1.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 16), "VOMCODGRID.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 20), "GRID1.ONLINEACTIVATE") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 16), "VOMCODGRID.CLICK") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1PV0( ) ;
                           }
                           nGXsfl_44_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_44_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_44_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_442( ) ;
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavOmcodgrid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavOmcodgrid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vOMCODGRID");
                              GX_FocusControl = edtavOmcodgrid_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV38OmCodGrid = 0 ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOmcodgrid_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38OmCodGrid), 8, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vOMCODGRID"+"_"+sGXsfl_44_idx, getSecureSignedToken( sPrefix+sGXsfl_44_idx, localUtil.format( DecimalUtil.doubleToDec(AV38OmCodGrid), "ZZZZZZZ9")));
                           }
                           else
                           {
                              AV38OmCodGrid = (int)(localUtil.ctol( httpContext.cgiGet( edtavOmcodgrid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOmcodgrid_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38OmCodGrid), 8, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vOMCODGRID"+"_"+sGXsfl_44_idx, getSecureSignedToken( sPrefix+sGXsfl_44_idx, localUtil.format( DecimalUtil.doubleToDec(AV38OmCodGrid), "ZZZZZZZ9")));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavPmcodgrid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavPmcodgrid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPMCODGRID");
                              GX_FocusControl = edtavPmcodgrid_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV59PmCodGrid = 0 ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPmcodgrid_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59PmCodGrid), 8, 0));
                           }
                           else
                           {
                              AV59PmCodGrid = (int)(localUtil.ctol( httpContext.cgiGet( edtavPmcodgrid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPmcodgrid_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59PmCodGrid), 8, 0));
                           }
                           AV47OmMaqCodGrid = httpContext.cgiGet( edtavOmmaqcodgrid_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOmmaqcodgrid_Internalname, AV47OmMaqCodGrid);
                           AV83OMMaqDsc = httpContext.cgiGet( edtavOmmaqdsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOmmaqdsc_Internalname, AV83OMMaqDsc);
                           if ( localUtil.vcdtime( httpContext.cgiGet( edtavOmfchcre_Internalname), (byte)(0), (byte)(0)) == 0 )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vOMFCHCRE");
                              GX_FocusControl = edtavOmfchcre_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV43OmFchCre = GXutil.resetTime( GXutil.nullDate() );
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOmfchcre_Internalname, localUtil.ttoc( AV43OmFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
                           }
                           else
                           {
                              AV43OmFchCre = localUtil.ctot( httpContext.cgiGet( edtavOmfchcre_Internalname), 0) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOmfchcre_Internalname, localUtil.ttoc( AV43OmFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
                           }
                           if ( localUtil.vcdtime( httpContext.cgiGet( edtavOmfchcergrid_Internalname), (byte)(0), (byte)(0)) == 0 )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vOMFCHCERGRID");
                              GX_FocusControl = edtavOmfchcergrid_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV42OmFchCerGrid = GXutil.resetTime( GXutil.nullDate() );
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOmfchcergrid_Internalname, localUtil.ttoc( AV42OmFchCerGrid, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
                           }
                           else
                           {
                              AV42OmFchCerGrid = localUtil.ctot( httpContext.cgiGet( edtavOmfchcergrid_Internalname), 0) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOmfchcergrid_Internalname, localUtil.ttoc( AV42OmFchCerGrid, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
                           }
                           if ( localUtil.vcdtime( httpContext.cgiGet( edtavOmmctie_Internalname), (byte)(0), (byte)(0)) == 0 )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vOMMCTIE");
                              GX_FocusControl = edtavOmmctie_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV50OmMcTie = GXutil.resetTime( GXutil.nullDate() );
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOmmctie_Internalname, localUtil.ttoc( AV50OmMcTie, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
                           }
                           else
                           {
                              AV50OmMcTie = localUtil.ctot( httpContext.cgiGet( edtavOmmctie_Internalname), 0) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOmmctie_Internalname, localUtil.ttoc( AV50OmMcTie, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
                           }
                           AV26HHMMAlfa = httpContext.cgiGet( edtavHhmmalfa_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHhmmalfa_Internalname, AV26HHMMAlfa);
                           AV57OMTxtGrid = httpContext.cgiGet( edtavOmtxtgrid_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOmtxtgrid_Internalname, AV57OMTxtGrid);
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavHorreaint_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavHorreaint_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vHORREAINT");
                              GX_FocusControl = edtavHorreaint_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV28HorReaint = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHorreaint_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28HorReaint), 4, 0));
                           }
                           else
                           {
                              AV28HorReaint = (short)(localUtil.ctol( httpContext.cgiGet( edtavHorreaint_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHorreaint_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28HorReaint), 4, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavMinrea_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavMinrea_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMINREA");
                              GX_FocusControl = edtavMinrea_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV34MinRea = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMinrea_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34MinRea), 4, 0));
                           }
                           else
                           {
                              AV34MinRea = (short)(localUtil.ctol( httpContext.cgiGet( edtavMinrea_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMinrea_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34MinRea), 4, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavMinutos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavMinutos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMINUTOS");
                              GX_FocusControl = edtavMinutos_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV35Minutos = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMinutos_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35Minutos), 4, 0));
                           }
                           else
                           {
                              AV35Minutos = (short)(localUtil.ctol( httpContext.cgiGet( edtavMinutos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMinutos_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35Minutos), 4, 0));
                           }
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
                                       GX_FocusControl = edtavOmcodgrid_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e131PV2 ();
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
                                       GX_FocusControl = edtavOmcodgrid_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e141PV2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavOmcodgrid_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e151PV2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "VOMCODGRID.CLICK") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavOmcodgrid_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e161PV2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID1.ONLINEACTIVATE") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavOmcodgrid_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e171PV2 ();
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
                                    strup1PV0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavOmcodgrid_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                    }
                                 }
                              }
                           }
                           else
                           {
                           }
                        }
                        else if ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID2.LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1PV0( ) ;
                           }
                           nGXsfl_67_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_67_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_67_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_677( ) ;
                           AV55OMOpeCodGrid = (int)(localUtil.ctol( httpContext.cgiGet( edtavOmopecodgrid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOmopecodgrid_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55OMOpeCodGrid), 6, 0));
                           AV56OmOpeNomGrid = httpContext.cgiGet( edtavOmopenomgrid_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOmopenomgrid_Internalname, AV56OmOpeNomGrid);
                           AV49OmMcIniGrid = localUtil.ctot( httpContext.cgiGet( edtavOmmcinigrid_Internalname), 0) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOmmcinigrid_Internalname, localUtil.ttoc( AV49OmMcIniGrid, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
                           AV48OMMcFinGrid = localUtil.ctot( httpContext.cgiGet( edtavOmmcfingrid_Internalname), 0) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOmmcfingrid_Internalname, localUtil.ttoc( AV48OMMcFinGrid, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
                           AV51OMMcTieGrid = localUtil.ctond( httpContext.cgiGet( edtavOmmctiegrid_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOmmctiegrid_Internalname, GXutil.ltrimstr( AV51OMMcTieGrid, 12, 3));
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "GRID2.LOAD") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavEmprcod_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e181PV7 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                              {
                                 if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                                 {
                                    strup1PV0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavOmcodgrid_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                    }
                                 }
                              }
                           }
                           else
                           {
                           }
                        }
                        else if ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID3.LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1PV0( ) ;
                           }
                           nGXsfl_81_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_81_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_81_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_815( ) ;
                           AV64TmCodGrid = (int)(localUtil.ctol( httpContext.cgiGet( edtavTmcodgrid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTmcodgrid_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64TmCodGrid), 8, 0));
                           AV65TmDscGrid = httpContext.cgiGet( edtavTmdscgrid_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTmdscgrid_Internalname, AV65TmDscGrid);
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "GRID3.LOAD") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavEmprcod_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e191PV5 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                              {
                                 if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                                 {
                                    strup1PV0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavOmcodgrid_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                    }
                                 }
                              }
                           }
                           else
                           {
                           }
                        }
                        else if ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID4.LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1PV0( ) ;
                           }
                           nGXsfl_92_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_92_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_92_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_923( ) ;
                           AV73OmRepCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavOmrepcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOmrepcod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73OmRepCod), 8, 0));
                           AV74OmRepNom = httpContext.cgiGet( edtavOmrepnom_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOmrepnom_Internalname, AV74OmRepNom);
                           AV75OmRcCnt = localUtil.ctond( httpContext.cgiGet( edtavOmrccnt_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOmrccnt_Internalname, GXutil.ltrimstr( AV75OmRcCnt, 12, 3));
                           AV76OmRcPre = localUtil.ctond( httpContext.cgiGet( edtavOmrcpre_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOmrcpre_Internalname, GXutil.ltrimstr( AV76OmRcPre, 12, 3));
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "GRID4.LOAD") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavEmprcod_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e201PV3 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                              {
                                 if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                                 {
                                    strup1PV0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavOmcodgrid_Internalname ;
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

   public void we1PV2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1PV2( ) ;
         }
      }
   }

   public void pa1PV2( )
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
            GX_FocusControl = edtavEmprcod_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgrid1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_442( ) ;
      while ( nGXsfl_44_idx <= nRC_GXsfl_44 )
      {
         sendrow_442( ) ;
         nGXsfl_44_idx = ((subGrid1_Islastpage==1)&&(nGXsfl_44_idx+1>subgrid1_fnc_recordsperpage( )) ? 1 : nGXsfl_44_idx+1) ;
         sGXsfl_44_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_44_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_442( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void gxnrgrid4_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_923( ) ;
      while ( nGXsfl_92_idx <= nRC_GXsfl_92 )
      {
         sendrow_923( ) ;
         nGXsfl_92_idx = ((subGrid4_Islastpage==1)&&(nGXsfl_92_idx+1>subgrid4_fnc_recordsperpage( )) ? 1 : nGXsfl_92_idx+1) ;
         sGXsfl_92_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_92_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_923( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid4Container)) ;
      /* End function gxnrGrid4_newrow */
   }

   public void gxnrgrid3_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_815( ) ;
      while ( nGXsfl_81_idx <= nRC_GXsfl_81 )
      {
         sendrow_815( ) ;
         nGXsfl_81_idx = ((subGrid3_Islastpage==1)&&(nGXsfl_81_idx+1>subgrid3_fnc_recordsperpage( )) ? 1 : nGXsfl_81_idx+1) ;
         sGXsfl_81_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_81_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_815( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid3Container)) ;
      /* End function gxnrGrid3_newrow */
   }

   public void gxnrgrid2_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_677( ) ;
      while ( nGXsfl_67_idx <= nRC_GXsfl_67 )
      {
         sendrow_677( ) ;
         nGXsfl_67_idx = ((subGrid2_Islastpage==1)&&(nGXsfl_67_idx+1>subgrid2_fnc_recordsperpage( )) ? 1 : nGXsfl_67_idx+1) ;
         sGXsfl_67_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_67_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_677( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid2Container)) ;
      /* End function gxnrGrid2_newrow */
   }

   public void gxgrgrid1_refresh( int subGrid1_Rows ,
                                  int subGrid2_Rows ,
                                  int subGrid3_Rows ,
                                  int subGrid4_Rows ,
                                  java.util.Date AV40OMFchCer_to ,
                                  int AV53OmOpeCod_to ,
                                  int AV36OmCod_to ,
                                  String AV45OmMaqCod_to ,
                                  String A396EmprCod ,
                                  String A9445OMEst ,
                                  java.util.Date A9439OMFchCer ,
                                  String AV5EmprCod ,
                                  int A9425OMCod ,
                                  int AV7Omcod ,
                                  java.util.Date AV39Omfchcer ,
                                  int A9429PMCod ,
                                  byte AV60Preventivos ,
                                  String A9426OMMaqCod ,
                                  String AV44OmMaqCod ,
                                  int A9455OMOpeCod ,
                                  int AV8Omopecod ,
                                  java.util.Date A9469OMMCFin ,
                                  java.util.Date A9468OMMCIni ,
                                  String A9427OMMaqDsc ,
                                  java.util.Date A9436OMFchCre ,
                                  String A9433OMTxt ,
                                  String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e141PV2 ();
      GRID1_nCurrentRecord = 0 ;
      rf1PV2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid1_refresh */
   }

   public void gxgrgrid2_refresh( int subGrid1_Rows ,
                                  int subGrid2_Rows ,
                                  int subGrid3_Rows ,
                                  int subGrid4_Rows ,
                                  String A396EmprCod ,
                                  int A9425OMCod ,
                                  int A9455OMOpeCod ,
                                  String AV5EmprCod ,
                                  int AV71OmCodSelected ,
                                  String A9456OMOpeNom ,
                                  java.util.Date A9469OMMCFin ,
                                  java.util.Date A9468OMMCIni ,
                                  String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e141PV2 ();
      GRID2_nCurrentRecord = 0 ;
      rf1PV7( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid2_refresh */
   }

   public void gxgrgrid3_refresh( int subGrid1_Rows ,
                                  int subGrid2_Rows ,
                                  int subGrid3_Rows ,
                                  int subGrid4_Rows ,
                                  String A396EmprCod ,
                                  int A9425OMCod ,
                                  int A9430TMCod ,
                                  String AV5EmprCod ,
                                  int AV71OmCodSelected ,
                                  String A9431TMDsc ,
                                  String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e141PV2 ();
      GRID3_nCurrentRecord = 0 ;
      rf1PV5( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid3_refresh */
   }

   public void gxgrgrid4_refresh( int subGrid1_Rows ,
                                  int subGrid2_Rows ,
                                  int subGrid3_Rows ,
                                  int subGrid4_Rows ,
                                  String A396EmprCod ,
                                  int A9425OMCod ,
                                  int A9446OMRepCod ,
                                  String AV5EmprCod ,
                                  int AV38OmCodGrid ,
                                  String A9447OMRepNom ,
                                  java.math.BigDecimal A9452OMRCCnt ,
                                  java.math.BigDecimal A9453OMRCPre ,
                                  String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e141PV2 ();
      GRID4_nCurrentRecord = 0 ;
      rf1PV3( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid4_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vOMCODGRID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV38OmCodGrid), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vOMCODGRID", GXutil.ltrim( localUtil.ntoc( AV38OmCodGrid, (byte)(8), (byte)(0), ".", "")));
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
      GRID1_nFirstRecordOnPage = 0 ;
      GRID1_nCurrentRecord = 0 ;
      GXCCtl = "GRID1_nFirstRecordOnPage_" + sGXsfl_44_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GRID2_nFirstRecordOnPage = 0 ;
      GRID2_nCurrentRecord = 0 ;
      GXCCtl = "GRID2_nFirstRecordOnPage_" + sGXsfl_67_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID2_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GRID3_nFirstRecordOnPage = 0 ;
      GRID3_nCurrentRecord = 0 ;
      GXCCtl = "GRID3_nFirstRecordOnPage_" + sGXsfl_81_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID3_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      send_integrity_hashes( ) ;
      rf1PV2( ) ;
      rf1PV7( ) ;
      rf1PV5( ) ;
      rf1PV3( ) ;
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
      edtavOmcodgrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavOmcodgrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOmcodgrid_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavPmcodgrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPmcodgrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPmcodgrid_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavOmmaqcodgrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavOmmaqcodgrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOmmaqcodgrid_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavOmmaqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavOmmaqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOmmaqdsc_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavOmfchcre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavOmfchcre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOmfchcre_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavOmfchcergrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavOmfchcergrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOmfchcergrid_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavOmmctie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavOmmctie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOmmctie_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavHhmmalfa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHhmmalfa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHhmmalfa_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavOmtxtgrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavOmtxtgrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOmtxtgrid_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavHorreaint_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHorreaint_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHorreaint_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavMinrea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMinrea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMinrea_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavMinutos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMinutos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMinutos_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavOmopecodgrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavOmopecodgrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOmopecodgrid_Enabled), 5, 0), !bGXsfl_67_Refreshing);
      edtavOmopenomgrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavOmopenomgrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOmopenomgrid_Enabled), 5, 0), !bGXsfl_67_Refreshing);
      edtavOmmcinigrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavOmmcinigrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOmmcinigrid_Enabled), 5, 0), !bGXsfl_67_Refreshing);
      edtavOmmcfingrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavOmmcfingrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOmmcfingrid_Enabled), 5, 0), !bGXsfl_67_Refreshing);
      edtavOmmctiegrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavOmmctiegrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOmmctiegrid_Enabled), 5, 0), !bGXsfl_67_Refreshing);
      edtavTmcodgrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTmcodgrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTmcodgrid_Enabled), 5, 0), !bGXsfl_81_Refreshing);
      edtavTmdscgrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTmdscgrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTmdscgrid_Enabled), 5, 0), !bGXsfl_81_Refreshing);
      edtavOmrepcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavOmrepcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOmrepcod_Enabled), 5, 0), !bGXsfl_92_Refreshing);
      edtavOmrepnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavOmrepnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOmrepnom_Enabled), 5, 0), !bGXsfl_92_Refreshing);
      edtavOmrccnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavOmrccnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOmrccnt_Enabled), 5, 0), !bGXsfl_92_Refreshing);
      edtavOmrcpre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavOmrcpre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOmrcpre_Enabled), 5, 0), !bGXsfl_92_Refreshing);
   }

   public void rf1PV2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(44) ;
      /* Execute user event: Refresh */
      e141PV2 ();
      nGXsfl_44_idx = (int)(1+GRID1_nFirstRecordOnPage) ;
      sGXsfl_44_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_44_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_442( ) ;
      bGXsfl_44_Refreshing = true ;
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("CmpContext", sPrefix);
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Container.AddObjectProperty("Class", "GridNoBorder WorkWithSelection WorkWith");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.setPageSize( subgrid1_fnc_recordsperpage( ) );
      if ( subGrid1_Islastpage != 0 )
      {
         GRID1_nFirstRecordOnPage = (long)(subgrid1_fnc_recordcount( )-subgrid1_fnc_recordsperpage( )) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("GRID1_nFirstRecordOnPage", GRID1_nFirstRecordOnPage);
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_442( ) ;
         e151PV2 ();
         if ( ( GRID1_nCurrentRecord > 0 ) && ( GRID1_nGridOutOfScope == 0 ) && ( nGXsfl_44_idx == 1 ) )
         {
            GRID1_nCurrentRecord = 0 ;
            GRID1_nGridOutOfScope = 1 ;
            subgrid1_firstpage( ) ;
            e151PV2 ();
         }
         wbEnd = (short)(44) ;
         wb1PV0( ) ;
      }
      bGXsfl_44_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1PV2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vOMCODGRID"+"_"+sGXsfl_44_idx, getSecureSignedToken( sPrefix+sGXsfl_44_idx, localUtil.format( DecimalUtil.doubleToDec(AV38OmCodGrid), "ZZZZZZZ9")));
   }

   public void rf1PV3( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid4Container.ClearRows();
      }
      wbStart = (short)(92) ;
      nGXsfl_92_idx = 1 ;
      sGXsfl_92_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_92_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_923( ) ;
      bGXsfl_92_Refreshing = true ;
      Grid4Container.AddObjectProperty("GridName", "Grid4");
      Grid4Container.AddObjectProperty("CmpContext", sPrefix);
      Grid4Container.AddObjectProperty("InMasterPage", "false");
      Grid4Container.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Grid4Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid4Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid4Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid4_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid4Container.setPageSize( subgrid4_fnc_recordsperpage( ) );
      if ( subGrid1_Islastpage != 0 )
      {
         GRID1_nFirstRecordOnPage = (long)(subgrid1_fnc_recordcount( )-subgrid1_fnc_recordsperpage( )) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("GRID1_nFirstRecordOnPage", GRID1_nFirstRecordOnPage);
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_923( ) ;
         e201PV3 ();
         if ( ( GRID4_nCurrentRecord > 0 ) && ( GRID4_nGridOutOfScope == 0 ) && ( nGXsfl_92_idx == 1 ) )
         {
            GRID4_nCurrentRecord = 0 ;
            GRID4_nGridOutOfScope = 1 ;
            subgrid4_firstpage( ) ;
            e201PV3 ();
         }
         wbEnd = (short)(92) ;
         wb1PV0( ) ;
      }
      bGXsfl_92_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1PV3( )
   {
   }

   public void rf1PV5( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid3Container.ClearRows();
      }
      wbStart = (short)(81) ;
      nGXsfl_81_idx = (int)(1+GRID3_nFirstRecordOnPage) ;
      sGXsfl_81_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_81_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_815( ) ;
      bGXsfl_81_Refreshing = true ;
      Grid3Container.AddObjectProperty("GridName", "Grid3");
      Grid3Container.AddObjectProperty("CmpContext", sPrefix);
      Grid3Container.AddObjectProperty("InMasterPage", "false");
      Grid3Container.AddObjectProperty("Class", "GridNoBorder WorkWithSelection WorkWith");
      Grid3Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid3_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid3Container.setPageSize( subgrid3_fnc_recordsperpage( ) );
      if ( subGrid1_Islastpage != 0 )
      {
         GRID1_nFirstRecordOnPage = (long)(subgrid1_fnc_recordcount( )-subgrid1_fnc_recordsperpage( )) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("GRID1_nFirstRecordOnPage", GRID1_nFirstRecordOnPage);
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_815( ) ;
         e191PV5 ();
         if ( ( GRID3_nCurrentRecord > 0 ) && ( GRID3_nGridOutOfScope == 0 ) && ( nGXsfl_81_idx == 1 ) )
         {
            GRID3_nCurrentRecord = 0 ;
            GRID3_nGridOutOfScope = 1 ;
            subgrid3_firstpage( ) ;
            e191PV5 ();
         }
         wbEnd = (short)(81) ;
         wb1PV0( ) ;
      }
      bGXsfl_81_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1PV5( )
   {
   }

   public void rf1PV7( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid2Container.ClearRows();
      }
      wbStart = (short)(67) ;
      nGXsfl_67_idx = (int)(1+GRID2_nFirstRecordOnPage) ;
      sGXsfl_67_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_67_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_677( ) ;
      bGXsfl_67_Refreshing = true ;
      Grid2Container.AddObjectProperty("GridName", "Grid2");
      Grid2Container.AddObjectProperty("CmpContext", sPrefix);
      Grid2Container.AddObjectProperty("InMasterPage", "false");
      Grid2Container.AddObjectProperty("Class", "GridNoBorder WorkWithSelection WorkWith");
      Grid2Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid2_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.setPageSize( subgrid2_fnc_recordsperpage( ) );
      if ( subGrid1_Islastpage != 0 )
      {
         GRID1_nFirstRecordOnPage = (long)(subgrid1_fnc_recordcount( )-subgrid1_fnc_recordsperpage( )) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("GRID1_nFirstRecordOnPage", GRID1_nFirstRecordOnPage);
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_677( ) ;
         e181PV7 ();
         if ( ( GRID2_nCurrentRecord > 0 ) && ( GRID2_nGridOutOfScope == 0 ) && ( nGXsfl_67_idx == 1 ) )
         {
            GRID2_nCurrentRecord = 0 ;
            GRID2_nGridOutOfScope = 1 ;
            subgrid2_firstpage( ) ;
            e181PV7 ();
         }
         wbEnd = (short)(67) ;
         wb1PV0( ) ;
      }
      bGXsfl_67_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1PV7( )
   {
   }

   public int subgrid1_fnc_pagecount( )
   {
      return -1 ;
   }

   public int subgrid1_fnc_recordcount( )
   {
      return (int)(((subGrid1_Recordcount==0) ? GRID1_nFirstRecordOnPage+1 : subGrid1_Recordcount)) ;
   }

   public int subgrid1_fnc_recordsperpage( )
   {
      if ( subGrid1_Rows > 0 )
      {
         return subGrid1_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subgrid1_fnc_currentpage( )
   {
      return (int)(((subGrid1_Islastpage==1) ? subgrid1_fnc_recordcount( )/ (double) (subgrid1_fnc_recordsperpage( ))+((((int)((subgrid1_fnc_recordcount( )) % (subgrid1_fnc_recordsperpage( ))))==0) ? 0 : 1) : GXutil.Int( GRID1_nFirstRecordOnPage/ (double) (subgrid1_fnc_recordsperpage( )))+1)) ;
   }

   public short subgrid1_firstpage( )
   {
      GRID1_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, subGrid2_Rows, subGrid3_Rows, subGrid4_Rows, AV40OMFchCer_to, AV53OmOpeCod_to, AV36OmCod_to, AV45OmMaqCod_to, A396EmprCod, A9445OMEst, A9439OMFchCer, AV5EmprCod, A9425OMCod, AV7Omcod, AV39Omfchcer, A9429PMCod, AV60Preventivos, A9426OMMaqCod, AV44OmMaqCod, A9455OMOpeCod, AV8Omopecod, A9469OMMCFin, A9468OMMCIni, A9427OMMaqDsc, A9436OMFchCre, A9433OMTxt, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid1_nextpage( )
   {
      if ( GRID1_nEOF == 0 )
      {
         GRID1_nFirstRecordOnPage = (long)(GRID1_nFirstRecordOnPage+subgrid1_fnc_recordsperpage( )) ;
      }
      if ( GRID1_nEOF == 1 )
      {
         GRID1_nFirstRecordOnPage = GRID1_nCurrentRecord ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("GRID1_nFirstRecordOnPage", GRID1_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, subGrid2_Rows, subGrid3_Rows, subGrid4_Rows, AV40OMFchCer_to, AV53OmOpeCod_to, AV36OmCod_to, AV45OmMaqCod_to, A396EmprCod, A9445OMEst, A9439OMFchCer, AV5EmprCod, A9425OMCod, AV7Omcod, AV39Omfchcer, A9429PMCod, AV60Preventivos, A9426OMMaqCod, AV44OmMaqCod, A9455OMOpeCod, AV8Omopecod, A9469OMMCFin, A9468OMMCIni, A9427OMMaqDsc, A9436OMFchCre, A9433OMTxt, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID1_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid1_previouspage( )
   {
      if ( GRID1_nFirstRecordOnPage >= subgrid1_fnc_recordsperpage( ) )
      {
         GRID1_nFirstRecordOnPage = (long)(GRID1_nFirstRecordOnPage-subgrid1_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, subGrid2_Rows, subGrid3_Rows, subGrid4_Rows, AV40OMFchCer_to, AV53OmOpeCod_to, AV36OmCod_to, AV45OmMaqCod_to, A396EmprCod, A9445OMEst, A9439OMFchCer, AV5EmprCod, A9425OMCod, AV7Omcod, AV39Omfchcer, A9429PMCod, AV60Preventivos, A9426OMMaqCod, AV44OmMaqCod, A9455OMOpeCod, AV8Omopecod, A9469OMMCFin, A9468OMMCIni, A9427OMMaqDsc, A9436OMFchCre, A9433OMTxt, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid1_lastpage( )
   {
      subGrid1_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, subGrid2_Rows, subGrid3_Rows, subGrid4_Rows, AV40OMFchCer_to, AV53OmOpeCod_to, AV36OmCod_to, AV45OmMaqCod_to, A396EmprCod, A9445OMEst, A9439OMFchCer, AV5EmprCod, A9425OMCod, AV7Omcod, AV39Omfchcer, A9429PMCod, AV60Preventivos, A9426OMMaqCod, AV44OmMaqCod, A9455OMOpeCod, AV8Omopecod, A9469OMMCFin, A9468OMMCIni, A9427OMMaqDsc, A9436OMFchCre, A9433OMTxt, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid1_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRID1_nFirstRecordOnPage = (long)(subgrid1_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRID1_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, subGrid2_Rows, subGrid3_Rows, subGrid4_Rows, AV40OMFchCer_to, AV53OmOpeCod_to, AV36OmCod_to, AV45OmMaqCod_to, A396EmprCod, A9445OMEst, A9439OMFchCer, AV5EmprCod, A9425OMCod, AV7Omcod, AV39Omfchcer, A9429PMCod, AV60Preventivos, A9426OMMaqCod, AV44OmMaqCod, A9455OMOpeCod, AV8Omopecod, A9469OMMCFin, A9468OMMCIni, A9427OMMaqDsc, A9436OMFchCre, A9433OMTxt, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public int subgrid4_fnc_pagecount( )
   {
      return -1 ;
   }

   public int subgrid4_fnc_recordcount( )
   {
      return (int)(((subGrid4_Recordcount==0) ? GRID4_nFirstRecordOnPage+1 : subGrid4_Recordcount)) ;
   }

   public int subgrid4_fnc_recordsperpage( )
   {
      if ( subGrid4_Rows > 0 )
      {
         return subGrid4_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subgrid4_fnc_currentpage( )
   {
      return (int)(((subGrid4_Islastpage==1) ? subgrid4_fnc_recordcount( )/ (double) (subgrid4_fnc_recordsperpage( ))+((((int)((subgrid4_fnc_recordcount( )) % (subgrid4_fnc_recordsperpage( ))))==0) ? 0 : 1) : GXutil.Int( GRID4_nFirstRecordOnPage/ (double) (subgrid4_fnc_recordsperpage( )))+1)) ;
   }

   public short subgrid4_firstpage( )
   {
      GRID4_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID4_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID4_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid4_refresh( subGrid1_Rows, subGrid2_Rows, subGrid3_Rows, subGrid4_Rows, A396EmprCod, A9425OMCod, A9446OMRepCod, AV5EmprCod, AV38OmCodGrid, A9447OMRepNom, A9452OMRCCnt, A9453OMRCPre, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid4_nextpage( )
   {
      if ( GRID4_nEOF == 0 )
      {
         GRID4_nFirstRecordOnPage = (long)(GRID4_nFirstRecordOnPage+subgrid4_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID4_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID4_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      Grid4Container.AddObjectProperty("GRID4_nFirstRecordOnPage", GRID4_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid4_refresh( subGrid1_Rows, subGrid2_Rows, subGrid3_Rows, subGrid4_Rows, A396EmprCod, A9425OMCod, A9446OMRepCod, AV5EmprCod, AV38OmCodGrid, A9447OMRepNom, A9452OMRCCnt, A9453OMRCPre, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID4_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid4_previouspage( )
   {
      if ( GRID4_nFirstRecordOnPage >= subgrid4_fnc_recordsperpage( ) )
      {
         GRID4_nFirstRecordOnPage = (long)(GRID4_nFirstRecordOnPage-subgrid4_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID4_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID4_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid4_refresh( subGrid1_Rows, subGrid2_Rows, subGrid3_Rows, subGrid4_Rows, A396EmprCod, A9425OMCod, A9446OMRepCod, AV5EmprCod, AV38OmCodGrid, A9447OMRepNom, A9452OMRCCnt, A9453OMRCPre, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid4_lastpage( )
   {
      subGrid4_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid4_refresh( subGrid1_Rows, subGrid2_Rows, subGrid3_Rows, subGrid4_Rows, A396EmprCod, A9425OMCod, A9446OMRepCod, AV5EmprCod, AV38OmCodGrid, A9447OMRepNom, A9452OMRCCnt, A9453OMRCPre, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid4_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRID4_nFirstRecordOnPage = (long)(subgrid4_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRID4_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID4_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID4_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid4_refresh( subGrid1_Rows, subGrid2_Rows, subGrid3_Rows, subGrid4_Rows, A396EmprCod, A9425OMCod, A9446OMRepCod, AV5EmprCod, AV38OmCodGrid, A9447OMRepNom, A9452OMRCCnt, A9453OMRCPre, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public int subgrid3_fnc_pagecount( )
   {
      return -1 ;
   }

   public int subgrid3_fnc_recordcount( )
   {
      return (int)(((subGrid3_Recordcount==0) ? GRID3_nFirstRecordOnPage+1 : subGrid3_Recordcount)) ;
   }

   public int subgrid3_fnc_recordsperpage( )
   {
      if ( subGrid3_Rows > 0 )
      {
         return subGrid3_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subgrid3_fnc_currentpage( )
   {
      return (int)(((subGrid3_Islastpage==1) ? subgrid3_fnc_recordcount( )/ (double) (subgrid3_fnc_recordsperpage( ))+((((int)((subgrid3_fnc_recordcount( )) % (subgrid3_fnc_recordsperpage( ))))==0) ? 0 : 1) : GXutil.Int( GRID3_nFirstRecordOnPage/ (double) (subgrid3_fnc_recordsperpage( )))+1)) ;
   }

   public short subgrid3_firstpage( )
   {
      GRID3_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID3_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID3_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid3_refresh( subGrid1_Rows, subGrid2_Rows, subGrid3_Rows, subGrid4_Rows, A396EmprCod, A9425OMCod, A9430TMCod, AV5EmprCod, AV71OmCodSelected, A9431TMDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid3_nextpage( )
   {
      if ( GRID3_nEOF == 0 )
      {
         GRID3_nFirstRecordOnPage = (long)(GRID3_nFirstRecordOnPage+subgrid3_fnc_recordsperpage( )) ;
      }
      if ( GRID3_nEOF == 1 )
      {
         GRID3_nFirstRecordOnPage = GRID3_nCurrentRecord ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID3_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID3_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("GRID3_nFirstRecordOnPage", GRID3_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid3_refresh( subGrid1_Rows, subGrid2_Rows, subGrid3_Rows, subGrid4_Rows, A396EmprCod, A9425OMCod, A9430TMCod, AV5EmprCod, AV71OmCodSelected, A9431TMDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID3_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid3_previouspage( )
   {
      if ( GRID3_nFirstRecordOnPage >= subgrid3_fnc_recordsperpage( ) )
      {
         GRID3_nFirstRecordOnPage = (long)(GRID3_nFirstRecordOnPage-subgrid3_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID3_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID3_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid3_refresh( subGrid1_Rows, subGrid2_Rows, subGrid3_Rows, subGrid4_Rows, A396EmprCod, A9425OMCod, A9430TMCod, AV5EmprCod, AV71OmCodSelected, A9431TMDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid3_lastpage( )
   {
      subGrid3_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid3_refresh( subGrid1_Rows, subGrid2_Rows, subGrid3_Rows, subGrid4_Rows, A396EmprCod, A9425OMCod, A9430TMCod, AV5EmprCod, AV71OmCodSelected, A9431TMDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid3_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRID3_nFirstRecordOnPage = (long)(subgrid3_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRID3_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID3_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID3_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid3_refresh( subGrid1_Rows, subGrid2_Rows, subGrid3_Rows, subGrid4_Rows, A396EmprCod, A9425OMCod, A9430TMCod, AV5EmprCod, AV71OmCodSelected, A9431TMDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public int subgrid2_fnc_pagecount( )
   {
      return -1 ;
   }

   public int subgrid2_fnc_recordcount( )
   {
      return (int)(((subGrid2_Recordcount==0) ? GRID2_nFirstRecordOnPage+1 : subGrid2_Recordcount)) ;
   }

   public int subgrid2_fnc_recordsperpage( )
   {
      if ( subGrid2_Rows > 0 )
      {
         return subGrid2_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subgrid2_fnc_currentpage( )
   {
      return (int)(((subGrid2_Islastpage==1) ? subgrid2_fnc_recordcount( )/ (double) (subgrid2_fnc_recordsperpage( ))+((((int)((subgrid2_fnc_recordcount( )) % (subgrid2_fnc_recordsperpage( ))))==0) ? 0 : 1) : GXutil.Int( GRID2_nFirstRecordOnPage/ (double) (subgrid2_fnc_recordsperpage( )))+1)) ;
   }

   public short subgrid2_firstpage( )
   {
      GRID2_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID2_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID2_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid2_refresh( subGrid1_Rows, subGrid2_Rows, subGrid3_Rows, subGrid4_Rows, A396EmprCod, A9425OMCod, A9455OMOpeCod, AV5EmprCod, AV71OmCodSelected, A9456OMOpeNom, A9469OMMCFin, A9468OMMCIni, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid2_nextpage( )
   {
      if ( GRID2_nEOF == 0 )
      {
         GRID2_nFirstRecordOnPage = (long)(GRID2_nFirstRecordOnPage+subgrid2_fnc_recordsperpage( )) ;
      }
      if ( GRID2_nEOF == 1 )
      {
         GRID2_nFirstRecordOnPage = GRID2_nCurrentRecord ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID2_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID2_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("GRID2_nFirstRecordOnPage", GRID2_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid2_refresh( subGrid1_Rows, subGrid2_Rows, subGrid3_Rows, subGrid4_Rows, A396EmprCod, A9425OMCod, A9455OMOpeCod, AV5EmprCod, AV71OmCodSelected, A9456OMOpeNom, A9469OMMCFin, A9468OMMCIni, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID2_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid2_previouspage( )
   {
      if ( GRID2_nFirstRecordOnPage >= subgrid2_fnc_recordsperpage( ) )
      {
         GRID2_nFirstRecordOnPage = (long)(GRID2_nFirstRecordOnPage-subgrid2_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID2_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID2_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid2_refresh( subGrid1_Rows, subGrid2_Rows, subGrid3_Rows, subGrid4_Rows, A396EmprCod, A9425OMCod, A9455OMOpeCod, AV5EmprCod, AV71OmCodSelected, A9456OMOpeNom, A9469OMMCFin, A9468OMMCIni, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid2_lastpage( )
   {
      subGrid2_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid2_refresh( subGrid1_Rows, subGrid2_Rows, subGrid3_Rows, subGrid4_Rows, A396EmprCod, A9425OMCod, A9455OMOpeCod, AV5EmprCod, AV71OmCodSelected, A9456OMOpeNom, A9469OMMCFin, A9468OMMCIni, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid2_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRID2_nFirstRecordOnPage = (long)(subgrid2_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRID2_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID2_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID2_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid2_refresh( subGrid1_Rows, subGrid2_Rows, subGrid3_Rows, subGrid4_Rows, A396EmprCod, A9425OMCod, A9455OMOpeCod, AV5EmprCod, AV71OmCodSelected, A9456OMOpeNom, A9469OMMCFin, A9468OMMCIni, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      edtavOmcodgrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavOmcodgrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOmcodgrid_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavPmcodgrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPmcodgrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPmcodgrid_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavOmmaqcodgrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavOmmaqcodgrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOmmaqcodgrid_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavOmmaqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavOmmaqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOmmaqdsc_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavOmfchcre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavOmfchcre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOmfchcre_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavOmfchcergrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavOmfchcergrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOmfchcergrid_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavOmmctie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavOmmctie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOmmctie_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavHhmmalfa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHhmmalfa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHhmmalfa_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavOmtxtgrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavOmtxtgrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOmtxtgrid_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavHorreaint_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHorreaint_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHorreaint_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavMinrea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMinrea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMinrea_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavMinutos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMinutos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMinutos_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavOmopecodgrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavOmopecodgrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOmopecodgrid_Enabled), 5, 0), !bGXsfl_67_Refreshing);
      edtavOmopenomgrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavOmopenomgrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOmopenomgrid_Enabled), 5, 0), !bGXsfl_67_Refreshing);
      edtavOmmcinigrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavOmmcinigrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOmmcinigrid_Enabled), 5, 0), !bGXsfl_67_Refreshing);
      edtavOmmcfingrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavOmmcfingrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOmmcfingrid_Enabled), 5, 0), !bGXsfl_67_Refreshing);
      edtavOmmctiegrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavOmmctiegrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOmmctiegrid_Enabled), 5, 0), !bGXsfl_67_Refreshing);
      edtavTmcodgrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTmcodgrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTmcodgrid_Enabled), 5, 0), !bGXsfl_81_Refreshing);
      edtavTmdscgrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTmdscgrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTmdscgrid_Enabled), 5, 0), !bGXsfl_81_Refreshing);
      edtavOmrepcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavOmrepcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOmrepcod_Enabled), 5, 0), !bGXsfl_92_Refreshing);
      edtavOmrepnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavOmrepnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOmrepnom_Enabled), 5, 0), !bGXsfl_92_Refreshing);
      edtavOmrccnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavOmrccnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOmrccnt_Enabled), 5, 0), !bGXsfl_92_Refreshing);
      edtavOmrcpre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavOmrcpre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOmrcpre_Enabled), 5, 0), !bGXsfl_92_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strup1PV0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e131PV2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         nRC_GXsfl_44 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_44"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nRC_GXsfl_67 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_67"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nRC_GXsfl_81 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_81"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nRC_GXsfl_92 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_92"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV7Omcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV7Omcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV36OmCod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV36OmCod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV44OmMaqCod = httpContext.cgiGet( sPrefix+"wcpOAV44OmMaqCod") ;
         wcpOAV45OmMaqCod_to = httpContext.cgiGet( sPrefix+"wcpOAV45OmMaqCod_to") ;
         wcpOAV8Omopecod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV8Omopecod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV53OmOpeCod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV53OmOpeCod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV39Omfchcer = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV39Omfchcer"), 0) ;
         wcpOAV40OMFchCer_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV40OMFchCer_to"), 0) ;
         wcpOAV60Preventivos = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV60Preventivos"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID1_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID2_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID2_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID3_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID3_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID4_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID4_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID1_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         GRID2_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID2_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         GRID3_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID3_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         GRID4_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID4_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid1_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID1_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
         subGrid2_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID2_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID2_Rows", GXutil.ltrim( localUtil.ntoc( subGrid2_Rows, (byte)(6), (byte)(0), ".", "")));
         subGrid3_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID3_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID3_Rows", GXutil.ltrim( localUtil.ntoc( subGrid3_Rows, (byte)(6), (byte)(0), ".", "")));
         subGrid4_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID4_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID4_Rows", GXutil.ltrim( localUtil.ntoc( subGrid4_Rows, (byte)(6), (byte)(0), ".", "")));
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
         Grid4_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID4_EMPOWERER_Gridinternalname") ;
         Grid3_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID3_EMPOWERER_Gridinternalname") ;
         Grid3_empowerer_Infinitescrolling = httpContext.cgiGet( sPrefix+"GRID3_EMPOWERER_Infinitescrolling") ;
         Grid2_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID2_EMPOWERER_Gridinternalname") ;
         Grid2_empowerer_Infinitescrolling = httpContext.cgiGet( sPrefix+"GRID2_EMPOWERER_Infinitescrolling") ;
         Grid1_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID1_EMPOWERER_Gridinternalname") ;
         Grid1_empowerer_Infinitescrolling = httpContext.cgiGet( sPrefix+"GRID1_EMPOWERER_Infinitescrolling") ;
         /* Read variables values. */
         AV5EmprCod = GXutil.upper( httpContext.cgiGet( edtavEmprcod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5EmprCod", AV5EmprCod);
         /* Read subfile selected row values. */
         nGXsfl_44_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid1_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_44_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_44_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_442( ) ;
         if ( nGXsfl_44_idx > 0 )
         {
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavOmcodgrid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavOmcodgrid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vOMCODGRID");
               GX_FocusControl = edtavOmcodgrid_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV38OmCodGrid = 0 ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOmcodgrid_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38OmCodGrid), 8, 0));
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vOMCODGRID"+"_"+sGXsfl_44_idx, getSecureSignedToken( sPrefix+sGXsfl_44_idx, localUtil.format( DecimalUtil.doubleToDec(AV38OmCodGrid), "ZZZZZZZ9")));
            }
            else
            {
               AV38OmCodGrid = (int)(localUtil.ctol( httpContext.cgiGet( edtavOmcodgrid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOmcodgrid_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38OmCodGrid), 8, 0));
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vOMCODGRID"+"_"+sGXsfl_44_idx, getSecureSignedToken( sPrefix+sGXsfl_44_idx, localUtil.format( DecimalUtil.doubleToDec(AV38OmCodGrid), "ZZZZZZZ9")));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavPmcodgrid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavPmcodgrid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPMCODGRID");
               GX_FocusControl = edtavPmcodgrid_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV59PmCodGrid = 0 ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPmcodgrid_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59PmCodGrid), 8, 0));
            }
            else
            {
               AV59PmCodGrid = (int)(localUtil.ctol( httpContext.cgiGet( edtavPmcodgrid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPmcodgrid_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59PmCodGrid), 8, 0));
            }
            AV47OmMaqCodGrid = httpContext.cgiGet( edtavOmmaqcodgrid_Internalname) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOmmaqcodgrid_Internalname, AV47OmMaqCodGrid);
            AV83OMMaqDsc = httpContext.cgiGet( edtavOmmaqdsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOmmaqdsc_Internalname, AV83OMMaqDsc);
            if ( localUtil.vcdtime( httpContext.cgiGet( edtavOmfchcre_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vOMFCHCRE");
               GX_FocusControl = edtavOmfchcre_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV43OmFchCre = GXutil.resetTime( GXutil.nullDate() );
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOmfchcre_Internalname, localUtil.ttoc( AV43OmFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               AV43OmFchCre = localUtil.ctot( httpContext.cgiGet( edtavOmfchcre_Internalname)) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOmfchcre_Internalname, localUtil.ttoc( AV43OmFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            if ( localUtil.vcdtime( httpContext.cgiGet( edtavOmfchcergrid_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vOMFCHCERGRID");
               GX_FocusControl = edtavOmfchcergrid_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV42OmFchCerGrid = GXutil.resetTime( GXutil.nullDate() );
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOmfchcergrid_Internalname, localUtil.ttoc( AV42OmFchCerGrid, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               AV42OmFchCerGrid = localUtil.ctot( httpContext.cgiGet( edtavOmfchcergrid_Internalname)) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOmfchcergrid_Internalname, localUtil.ttoc( AV42OmFchCerGrid, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            if ( localUtil.vcdtime( httpContext.cgiGet( edtavOmmctie_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vOMMCTIE");
               GX_FocusControl = edtavOmmctie_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV50OmMcTie = GXutil.resetTime( GXutil.nullDate() );
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOmmctie_Internalname, localUtil.ttoc( AV50OmMcTie, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               AV50OmMcTie = localUtil.ctot( httpContext.cgiGet( edtavOmmctie_Internalname)) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOmmctie_Internalname, localUtil.ttoc( AV50OmMcTie, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            AV26HHMMAlfa = httpContext.cgiGet( edtavHhmmalfa_Internalname) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHhmmalfa_Internalname, AV26HHMMAlfa);
            AV57OMTxtGrid = httpContext.cgiGet( edtavOmtxtgrid_Internalname) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOmtxtgrid_Internalname, AV57OMTxtGrid);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavHorreaint_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavHorreaint_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vHORREAINT");
               GX_FocusControl = edtavHorreaint_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV28HorReaint = (short)(0) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHorreaint_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28HorReaint), 4, 0));
            }
            else
            {
               AV28HorReaint = (short)(localUtil.ctol( httpContext.cgiGet( edtavHorreaint_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHorreaint_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28HorReaint), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavMinrea_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavMinrea_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMINREA");
               GX_FocusControl = edtavMinrea_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV34MinRea = (short)(0) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMinrea_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34MinRea), 4, 0));
            }
            else
            {
               AV34MinRea = (short)(localUtil.ctol( httpContext.cgiGet( edtavMinrea_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMinrea_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34MinRea), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavMinutos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavMinutos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMINUTOS");
               GX_FocusControl = edtavMinutos_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV35Minutos = (short)(0) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMinutos_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35Minutos), 4, 0));
            }
            else
            {
               AV35Minutos = (short)(localUtil.ctol( httpContext.cgiGet( edtavMinutos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMinutos_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35Minutos), 4, 0));
            }
         }
         nGXsfl_67_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid2_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_67_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_67_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_677( ) ;
         if ( nGXsfl_67_idx > 0 )
         {
            AV55OMOpeCodGrid = (int)(localUtil.ctol( httpContext.cgiGet( edtavOmopecodgrid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOmopecodgrid_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55OMOpeCodGrid), 6, 0));
            AV56OmOpeNomGrid = httpContext.cgiGet( edtavOmopenomgrid_Internalname) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOmopenomgrid_Internalname, AV56OmOpeNomGrid);
            AV49OmMcIniGrid = localUtil.ctot( httpContext.cgiGet( edtavOmmcinigrid_Internalname)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOmmcinigrid_Internalname, localUtil.ttoc( AV49OmMcIniGrid, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV48OMMcFinGrid = localUtil.ctot( httpContext.cgiGet( edtavOmmcfingrid_Internalname)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOmmcfingrid_Internalname, localUtil.ttoc( AV48OMMcFinGrid, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV51OMMcTieGrid = localUtil.ctond( httpContext.cgiGet( edtavOmmctiegrid_Internalname)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOmmctiegrid_Internalname, GXutil.ltrimstr( AV51OMMcTieGrid, 12, 3));
         }
         nGXsfl_81_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid3_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_81_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_81_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_815( ) ;
         if ( nGXsfl_81_idx > 0 )
         {
            AV64TmCodGrid = (int)(localUtil.ctol( httpContext.cgiGet( edtavTmcodgrid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTmcodgrid_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64TmCodGrid), 8, 0));
            AV65TmDscGrid = httpContext.cgiGet( edtavTmdscgrid_Internalname) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTmdscgrid_Internalname, AV65TmDscGrid);
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         /* Check if conditions changed and reset current page numbers */
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
      e131PV2 ();
      if (returnInSub) return;
   }

   public void e131PV2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV9Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      listadoordenesoperariotarea_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9Station = GXt_char1 ;
      GXv_char2[0] = AV5EmprCod ;
      GXv_char3[0] = AV6EmprNom ;
      GXv_char4[0] = AV10UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV9Station, GXv_char2, GXv_char3, GXv_char4) ;
      listadoordenesoperariotarea_wc_impl.this.AV5EmprCod = GXv_char2[0] ;
      listadoordenesoperariotarea_wc_impl.this.AV6EmprNom = GXv_char3[0] ;
      listadoordenesoperariotarea_wc_impl.this.AV10UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5EmprCod", AV5EmprCod);
      GXt_char1 = AV9Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      listadoordenesoperariotarea_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      AV9Station = GXt_char1 ;
      GXv_char4[0] = AV5EmprCod ;
      GXv_char3[0] = AV6EmprNom ;
      GXv_char2[0] = AV10UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV9Station, GXv_char4, GXv_char3, GXv_char2) ;
      listadoordenesoperariotarea_wc_impl.this.AV5EmprCod = GXv_char4[0] ;
      listadoordenesoperariotarea_wc_impl.this.AV6EmprNom = GXv_char3[0] ;
      listadoordenesoperariotarea_wc_impl.this.AV10UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5EmprCod", AV5EmprCod);
      divTablerepuestos_Height = 400 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, divTablerepuestos_Internalname, "Height", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTablerepuestos_Height), 9, 0), true);
      divTabletarea_Height = 250 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, divTabletarea_Internalname, "Height", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTabletarea_Height), 9, 0), true);
      divTableoperario_Height = 250 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, divTableoperario_Internalname, "Height", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTableoperario_Height), 9, 0), true);
      divTableordensmanten_Height = 500 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, divTableordensmanten_Internalname, "Height", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTableordensmanten_Height), 9, 0), true);
      edtavEmprcod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEmprcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEmprcod_Visible), 5, 0), true);
      Grid4_empowerer_Gridinternalname = subGrid4_Internalname ;
      ucGrid4_empowerer.sendProperty(context, sPrefix, false, Grid4_empowerer_Internalname, "GridInternalName", Grid4_empowerer_Gridinternalname);
      subGrid4_Rows = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID4_Rows", GXutil.ltrim( localUtil.ntoc( subGrid4_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid3_empowerer_Gridinternalname = subGrid3_Internalname ;
      ucGrid3_empowerer.sendProperty(context, sPrefix, false, Grid3_empowerer_Internalname, "GridInternalName", Grid3_empowerer_Gridinternalname);
      subGrid3_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID3_Rows", GXutil.ltrim( localUtil.ntoc( subGrid3_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid2_empowerer_Gridinternalname = subGrid2_Internalname ;
      ucGrid2_empowerer.sendProperty(context, sPrefix, false, Grid2_empowerer_Internalname, "GridInternalName", Grid2_empowerer_Gridinternalname);
      subGrid2_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID2_Rows", GXutil.ltrim( localUtil.ntoc( subGrid2_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid1_empowerer_Gridinternalname = subGrid1_Internalname ;
      ucGrid1_empowerer.sendProperty(context, sPrefix, false, Grid1_empowerer_Internalname, "GridInternalName", Grid1_empowerer_Gridinternalname);
      subGrid1_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      divTablerepuestos_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, divTablerepuestos_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTablerepuestos_Visible), 5, 0), true);
      AV69WebSession.setValue("ListadoTiempoDedicadoOrdenWP", httpContext.getMessage( "FINALIZADO", ""));
      AV61ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(1) );
      AV61ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
      AV61ProgressIndicator.setgxTv_SdtProgress_Value( 0 );
      AV61ProgressIndicator.showwithtitle(httpContext.getMessage( "Iniciando proceso...", ""));
      AV61ProgressIndicator.show();
   }

   public void e141PV2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(GXutil.upper( GXutil.trim( AV69WebSession.getValue("ListadoTiempoDedicadoOrdenWP"))), httpContext.getMessage( "FINALIZADO", "")) == 0 )
      {
         AV69WebSession.remove("ListadoTiempoDedicadoOrdenWP");
         AV61ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
         AV61ProgressIndicator.showwithtitle(httpContext.getMessage( "Proceso finalizado", ""));
         AV79i = GXutil.sleep( 1) ;
         AV61ProgressIndicator.hide();
      }
      edtavOmcodgrid_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavOmcodgrid_Internalname, "Columnheaderclass", edtavOmcodgrid_Columnheaderclass, !bGXsfl_44_Refreshing);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV61ProgressIndicator", AV61ProgressIndicator);
   }

   private void e151PV2( )
   {
      /* Grid1_Load Routine */
      returnInSub = false ;
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV40OMFchCer_to)) )
      {
         AV41Omfchcer_to2 = GXutil.serverDate( context, remoteHandle, pr_default) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41Omfchcer_to2", localUtil.format(AV41Omfchcer_to2, "99/99/99"));
      }
      else
      {
         AV41Omfchcer_to2 = AV40OMFchCer_to ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41Omfchcer_to2", localUtil.format(AV41Omfchcer_to2, "99/99/99"));
      }
      AV54Omopecod_to2 = ((0==AV53OmOpeCod_to) ? 999999 : AV53OmOpeCod_to) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54Omopecod_to2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54Omopecod_to2), 6, 0));
      AV37Omcod_to2 = ((0==AV36OmCod_to) ? 99999999 : AV36OmCod_to) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37Omcod_to2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37Omcod_to2), 8, 0));
      AV46Ommaqcod_to2 = ((GXutil.strcmp("", AV45OmMaqCod_to)==0) ? httpContext.getMessage( "zzzzzz", "") : AV45OmMaqCod_to) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46Ommaqcod_to2", AV46Ommaqcod_to2);
      /* Using cursor H01PV2 */
      pr_default.execute(0, new Object[] {AV5EmprCod, Integer.valueOf(AV7Omcod), Integer.valueOf(AV37Omcod_to2), Byte.valueOf(AV60Preventivos), Byte.valueOf(AV60Preventivos), AV44OmMaqCod, AV46Ommaqcod_to2});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = H01PV2_A396EmprCod[0] ;
         A9425OMCod = H01PV2_A9425OMCod[0] ;
         A9426OMMaqCod = H01PV2_A9426OMMaqCod[0] ;
         A9429PMCod = H01PV2_A9429PMCod[0] ;
         n9429PMCod = H01PV2_n9429PMCod[0] ;
         A9439OMFchCer = H01PV2_A9439OMFchCer[0] ;
         A9445OMEst = H01PV2_A9445OMEst[0] ;
         A9427OMMaqDsc = H01PV2_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = H01PV2_n9427OMMaqDsc[0] ;
         A9436OMFchCre = H01PV2_A9436OMFchCre[0] ;
         A9433OMTxt = H01PV2_A9433OMTxt[0] ;
         A9427OMMaqDsc = H01PV2_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = H01PV2_n9427OMMaqDsc[0] ;
         if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 )
         {
            if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A9439OMFchCer, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).after( GXutil.resetTime( AV39Omfchcer )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A9439OMFchCer, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV39Omfchcer)) )) )
            {
               if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A9439OMFchCer, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).before( GXutil.resetTime( AV41Omfchcer_to2 )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A9439OMFchCer, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV41Omfchcer_to2)) )) )
               {
                  AV52OmMcTiem = DecimalUtil.ZERO ;
                  /* Using cursor H01PV3 */
                  pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(AV8Omopecod), Integer.valueOf(AV54Omopecod_to2)});
                  while ( (pr_default.getStatus(1) != 101) )
                  {
                     A9455OMOpeCod = H01PV3_A9455OMOpeCod[0] ;
                     A9468OMMCIni = H01PV3_A9468OMMCIni[0] ;
                     A9469OMMCFin = H01PV3_A9469OMMCFin[0] ;
                     AV63tiempo = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A9469OMMCFin, A9468OMMCIni)/ (double) (60)), 0))) ;
                     AV52OmMcTiem = AV52OmMcTiem.add(DecimalUtil.doubleToDec(AV63tiempo)) ;
                     pr_default.readNext(1);
                  }
                  pr_default.close(1);
                  AV27HorRea = (short)(DecimalUtil.decToDouble(AV52OmMcTiem.divide(DecimalUtil.doubleToDec(60), 18, java.math.RoundingMode.DOWN))) ;
                  AV28HorReaint = (short)(GXutil.Int( AV27HorRea)) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHorreaint_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28HorReaint), 4, 0));
                  AV34MinRea = (short)(DecimalUtil.decToDouble(AV52OmMcTiem.subtract(DecimalUtil.doubleToDec((AV28HorReaint*60))))) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMinrea_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34MinRea), 4, 0));
                  AV34MinRea = (short)(GXutil.Int( AV34MinRea)) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMinrea_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34MinRea), 4, 0));
                  AV26HHMMAlfa = GXutil.padl( GXutil.trim( GXutil.str( AV28HorReaint, 4, 0)), (short)(2), "0") + ":" + GXutil.padl( GXutil.trim( GXutil.str( AV34MinRea, 4, 0)), (short)(2), "0") ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHhmmalfa_Internalname, AV26HHMMAlfa);
                  AV38OmCodGrid = A9425OMCod ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOmcodgrid_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38OmCodGrid), 8, 0));
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vOMCODGRID"+"_"+sGXsfl_44_idx, getSecureSignedToken( sPrefix+sGXsfl_44_idx, localUtil.format( DecimalUtil.doubleToDec(AV38OmCodGrid), "ZZZZZZZ9")));
                  AV42OmFchCerGrid = A9439OMFchCer ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOmfchcergrid_Internalname, localUtil.ttoc( AV42OmFchCerGrid, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
                  AV59PmCodGrid = A9429PMCod ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPmcodgrid_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59PmCodGrid), 8, 0));
                  AV47OmMaqCodGrid = A9426OMMaqCod ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOmmaqcodgrid_Internalname, AV47OmMaqCodGrid);
                  AV83OMMaqDsc = A9427OMMaqDsc ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOmmaqdsc_Internalname, AV83OMMaqDsc);
                  AV43OmFchCre = A9436OMFchCre ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOmfchcre_Internalname, localUtil.ttoc( AV43OmFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
                  AV57OMTxtGrid = GXutil.trim( A9433OMTxt) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOmtxtgrid_Internalname, AV57OMTxtGrid);
                  /* Load Method */
                  if ( wbStart != -1 )
                  {
                     wbStart = (short)(44) ;
                  }
                  if ( ( subGrid1_Islastpage == 1 ) || ( subGrid1_Rows == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_fnc_recordsperpage( ) ) ) )
                  {
                     sendrow_442( ) ;
                     GRID1_nEOF = (byte)(1) ;
                     app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
                     if ( ( subGrid1_Islastpage == 1 ) && ( ((int)((GRID1_nCurrentRecord) % (subgrid1_fnc_recordsperpage( )))) == 0 ) )
                     {
                        GRID1_nFirstRecordOnPage = GRID1_nCurrentRecord ;
                     }
                  }
                  if ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage + subgrid1_fnc_recordsperpage( ) )
                  {
                     GRID1_nEOF = (byte)(0) ;
                     app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
                  }
                  GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
                  if ( isFullAjaxMode( ) && ! bGXsfl_44_Refreshing )
                  {
                     httpContext.doAjaxLoad(44, Grid1Row);
                  }
               }
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      edtavOmcodgrid_Columnclass = ((AV38OmCodGrid!=0) ? "WWColumn WWColumnTag WWColumnTagDanger WWColumnTagDangerSingleCell" : "WWColumn") ;
      /*  Sending Event outputs  */
   }

   public void e111PV2( )
   {
      /* 'DoExcel' Routine */
      returnInSub = false ;
      AV69WebSession.setValue("Proceso_ListadoTiempoDedicadoOrden", httpContext.getMessage( "FINALIZADO", ""));
      AV61ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(1) );
      AV61ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
      AV61ProgressIndicator.setgxTv_SdtProgress_Value( 0 );
      AV61ProgressIndicator.showwithtitle(httpContext.getMessage( "Iniciando proceso...", ""));
      AV61ProgressIndicator.show();
      GXv_char4[0] = AV82ExcelFilename ;
      GXv_char3[0] = AV81ErrorMessage ;
      new app.listadotiempodedicadoorden_wcexport(remoteHandle, context).execute( AV7Omcod, AV36OmCod_to, AV44OmMaqCod, AV45OmMaqCod_to, AV8Omopecod, AV53OmOpeCod_to, AV39Omfchcer, AV40OMFchCer_to, AV60Preventivos, GXv_char4, GXv_char3) ;
      listadoordenesoperariotarea_wc_impl.this.AV82ExcelFilename = GXv_char4[0] ;
      listadoordenesoperariotarea_wc_impl.this.AV81ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV82ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV82ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV81ErrorMessage);
      }
      if ( GXutil.strcmp(GXutil.upper( GXutil.trim( AV69WebSession.getValue("Proceso_ListadoTiempoDedicadoOrden"))), httpContext.getMessage( "FINALIZADO", "")) == 0 )
      {
         AV69WebSession.remove("Proceso_ListadoTiempoDedicadoOrden");
         AV61ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
         AV61ProgressIndicator.showwithtitle(httpContext.getMessage( "Proceso finalizado", ""));
         AV61ProgressIndicator.hide();
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV61ProgressIndicator", AV61ProgressIndicator);
   }

   public void e121PV2( )
   {
      /* 'DoExcel_2' Routine */
      returnInSub = false ;
      AV69WebSession.setValue("Proceso_ListadoTiempoDedicadoOrden", httpContext.getMessage( "FINALIZADO", ""));
      AV61ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(1) );
      AV61ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
      AV61ProgressIndicator.setgxTv_SdtProgress_Value( 0 );
      AV61ProgressIndicator.showwithtitle(httpContext.getMessage( "Iniciando proceso...", ""));
      AV61ProgressIndicator.show();
      GXv_char4[0] = AV82ExcelFilename ;
      GXv_char3[0] = AV81ErrorMessage ;
      new app.listadotiempodedicadoordendetallado_wcexport(remoteHandle, context).execute( AV7Omcod, AV36OmCod_to, AV44OmMaqCod, AV45OmMaqCod_to, AV8Omopecod, AV53OmOpeCod_to, AV39Omfchcer, AV40OMFchCer_to, AV60Preventivos, GXv_char4, GXv_char3) ;
      listadoordenesoperariotarea_wc_impl.this.AV82ExcelFilename = GXv_char4[0] ;
      listadoordenesoperariotarea_wc_impl.this.AV81ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV82ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV82ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV81ErrorMessage);
      }
      if ( GXutil.strcmp(GXutil.upper( GXutil.trim( AV69WebSession.getValue("Proceso_ListadoTiempoDedicadoOrden"))), httpContext.getMessage( "FINALIZADO", "")) == 0 )
      {
         AV69WebSession.remove("Proceso_ListadoTiempoDedicadoOrden");
         AV61ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
         AV61ProgressIndicator.showwithtitle(httpContext.getMessage( "Proceso finalizado", ""));
         AV61ProgressIndicator.hide();
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV61ProgressIndicator", AV61ProgressIndicator);
   }

   public void e171PV2( )
   {
      /* Grid1_Onlineactivate Routine */
      returnInSub = false ;
      divTablerepuestos_Visible = 1 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, divTablerepuestos_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTablerepuestos_Visible), 5, 0), true);
      AV71OmCodSelected = AV38OmCodGrid ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71OmCodSelected", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71OmCodSelected), 8, 0));
      GRID2_nFirstRecordOnPage = 0 ;
      GRID2_nCurrentRecord = 0 ;
      GXCCtl = "GRID2_nFirstRecordOnPage_" + sGXsfl_67_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID2_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      gxgrgrid2_refresh( subGrid1_Rows, subGrid2_Rows, subGrid3_Rows, subGrid4_Rows, A396EmprCod, A9425OMCod, A9455OMOpeCod, AV5EmprCod, AV71OmCodSelected, A9456OMOpeNom, A9469OMMCFin, A9468OMMCIni, sPrefix) ;
      GRID3_nFirstRecordOnPage = 0 ;
      GRID3_nCurrentRecord = 0 ;
      GXCCtl = "GRID3_nFirstRecordOnPage_" + sGXsfl_81_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID3_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      gxgrgrid3_refresh( subGrid1_Rows, subGrid2_Rows, subGrid3_Rows, subGrid4_Rows, A396EmprCod, A9425OMCod, A9430TMCod, AV5EmprCod, AV71OmCodSelected, A9431TMDsc, sPrefix) ;
      gxgrgrid4_refresh( subGrid1_Rows, subGrid2_Rows, subGrid3_Rows, subGrid4_Rows, A396EmprCod, A9425OMCod, A9446OMRepCod, AV5EmprCod, AV38OmCodGrid, A9447OMRepNom, A9452OMRCCnt, A9453OMRCPre, sPrefix) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV61ProgressIndicator", AV61ProgressIndicator);
   }

   public void e161PV2( )
   {
      /* Omcodgrid_Click Routine */
      returnInSub = false ;
      divTablerepuestos_Visible = 1 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, divTablerepuestos_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTablerepuestos_Visible), 5, 0), true);
      gxgrgrid4_refresh( subGrid1_Rows, subGrid2_Rows, subGrid3_Rows, subGrid4_Rows, A396EmprCod, A9425OMCod, A9446OMRepCod, AV5EmprCod, AV38OmCodGrid, A9447OMRepNom, A9452OMRCCnt, A9453OMRCPre, sPrefix) ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(92) ;
      }
      if ( ( subGrid4_Islastpage == 1 ) || ( subGrid4_Rows == 0 ) || ( ( GRID4_nCurrentRecord >= GRID4_nFirstRecordOnPage ) && ( GRID4_nCurrentRecord < GRID4_nFirstRecordOnPage + subgrid4_fnc_recordsperpage( ) ) ) )
      {
         sendrow_923( ) ;
         GRID4_nEOF = (byte)(1) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID4_nEOF", GXutil.ltrim( localUtil.ntoc( GRID4_nEOF, (byte)(1), (byte)(0), ".", "")));
         if ( ( subGrid4_Islastpage == 1 ) && ( ((int)((GRID4_nCurrentRecord) % (subgrid4_fnc_recordsperpage( )))) == 0 ) )
         {
            GRID4_nFirstRecordOnPage = GRID4_nCurrentRecord ;
         }
      }
      if ( GRID4_nCurrentRecord >= GRID4_nFirstRecordOnPage + subgrid4_fnc_recordsperpage( ) )
      {
         GRID4_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID4_nEOF", GXutil.ltrim( localUtil.ntoc( GRID4_nEOF, (byte)(1), (byte)(0), ".", "")));
      }
      GRID4_nCurrentRecord = (long)(GRID4_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_92_Refreshing )
      {
         httpContext.doAjaxLoad(92, Grid4Row);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV61ProgressIndicator", AV61ProgressIndicator);
   }

   private void e201PV3( )
   {
      /* Grid4_Load Routine */
      returnInSub = false ;
      AV74OmRepNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOmrepnom_Internalname, AV74OmRepNom);
      AV73OmRepCod = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOmrepcod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73OmRepCod), 8, 0));
      AV75OmRcCnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOmrccnt_Internalname, GXutil.ltrimstr( AV75OmRcCnt, 12, 3));
      AV76OmRcPre = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOmrcpre_Internalname, GXutil.ltrimstr( AV76OmRcPre, 12, 3));
      /* Using cursor H01PV4 */
      pr_default.execute(2, new Object[] {AV5EmprCod, Integer.valueOf(AV38OmCodGrid)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A9425OMCod = H01PV4_A9425OMCod[0] ;
         A396EmprCod = H01PV4_A396EmprCod[0] ;
         A9447OMRepNom = H01PV4_A9447OMRepNom[0] ;
         n9447OMRepNom = H01PV4_n9447OMRepNom[0] ;
         A9452OMRCCnt = H01PV4_A9452OMRCCnt[0] ;
         A9453OMRCPre = H01PV4_A9453OMRCPre[0] ;
         A9446OMRepCod = H01PV4_A9446OMRepCod[0] ;
         A9447OMRepNom = H01PV4_A9447OMRepNom[0] ;
         n9447OMRepNom = H01PV4_n9447OMRepNom[0] ;
         AV74OmRepNom = A9447OMRepNom ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOmrepnom_Internalname, AV74OmRepNom);
         AV73OmRepCod = A9446OMRepCod ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOmrepcod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73OmRepCod), 8, 0));
         AV75OmRcCnt = A9452OMRCCnt ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOmrccnt_Internalname, GXutil.ltrimstr( AV75OmRcCnt, 12, 3));
         AV76OmRcPre = A9453OMRCPre ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOmrcpre_Internalname, GXutil.ltrimstr( AV76OmRcPre, 12, 3));
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(92) ;
         }
         if ( ( subGrid4_Islastpage == 1 ) || ( subGrid4_Rows == 0 ) || ( ( GRID4_nCurrentRecord >= GRID4_nFirstRecordOnPage ) && ( GRID4_nCurrentRecord < GRID4_nFirstRecordOnPage + subgrid4_fnc_recordsperpage( ) ) ) )
         {
            sendrow_923( ) ;
            GRID4_nEOF = (byte)(1) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID4_nEOF", GXutil.ltrim( localUtil.ntoc( GRID4_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( ( subGrid4_Islastpage == 1 ) && ( ((int)((GRID4_nCurrentRecord) % (subgrid4_fnc_recordsperpage( )))) == 0 ) )
            {
               GRID4_nFirstRecordOnPage = GRID4_nCurrentRecord ;
            }
         }
         if ( GRID4_nCurrentRecord >= GRID4_nFirstRecordOnPage + subgrid4_fnc_recordsperpage( ) )
         {
            GRID4_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID4_nEOF", GXutil.ltrim( localUtil.ntoc( GRID4_nEOF, (byte)(1), (byte)(0), ".", "")));
         }
         GRID4_nCurrentRecord = (long)(GRID4_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_92_Refreshing )
         {
            httpContext.doAjaxLoad(92, Grid4Row);
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
      /*  Sending Event outputs  */
   }

   private void e191PV5( )
   {
      /* Grid3_Load Routine */
      returnInSub = false ;
      /* Using cursor H01PV5 */
      pr_default.execute(3, new Object[] {AV5EmprCod, Integer.valueOf(AV71OmCodSelected)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A9425OMCod = H01PV5_A9425OMCod[0] ;
         A396EmprCod = H01PV5_A396EmprCod[0] ;
         A9431TMDsc = H01PV5_A9431TMDsc[0] ;
         n9431TMDsc = H01PV5_n9431TMDsc[0] ;
         A9430TMCod = H01PV5_A9430TMCod[0] ;
         A9431TMDsc = H01PV5_A9431TMDsc[0] ;
         n9431TMDsc = H01PV5_n9431TMDsc[0] ;
         AV64TmCodGrid = A9430TMCod ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTmcodgrid_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64TmCodGrid), 8, 0));
         AV65TmDscGrid = A9431TMDsc ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTmdscgrid_Internalname, AV65TmDscGrid);
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(81) ;
         }
         if ( ( subGrid3_Islastpage == 1 ) || ( subGrid3_Rows == 0 ) || ( ( GRID3_nCurrentRecord >= GRID3_nFirstRecordOnPage ) && ( GRID3_nCurrentRecord < GRID3_nFirstRecordOnPage + subgrid3_fnc_recordsperpage( ) ) ) )
         {
            sendrow_815( ) ;
            GRID3_nEOF = (byte)(1) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID3_nEOF", GXutil.ltrim( localUtil.ntoc( GRID3_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( ( subGrid3_Islastpage == 1 ) && ( ((int)((GRID3_nCurrentRecord) % (subgrid3_fnc_recordsperpage( )))) == 0 ) )
            {
               GRID3_nFirstRecordOnPage = GRID3_nCurrentRecord ;
            }
         }
         if ( GRID3_nCurrentRecord >= GRID3_nFirstRecordOnPage + subgrid3_fnc_recordsperpage( ) )
         {
            GRID3_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID3_nEOF", GXutil.ltrim( localUtil.ntoc( GRID3_nEOF, (byte)(1), (byte)(0), ".", "")));
         }
         GRID3_nCurrentRecord = (long)(GRID3_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_81_Refreshing )
         {
            httpContext.doAjaxLoad(81, Grid3Row);
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
      /*  Sending Event outputs  */
   }

   private void e181PV7( )
   {
      /* Grid2_Load Routine */
      returnInSub = false ;
      /* Using cursor H01PV6 */
      pr_default.execute(4, new Object[] {AV5EmprCod, Integer.valueOf(AV71OmCodSelected)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A9425OMCod = H01PV6_A9425OMCod[0] ;
         A396EmprCod = H01PV6_A396EmprCod[0] ;
         A9456OMOpeNom = H01PV6_A9456OMOpeNom[0] ;
         n9456OMOpeNom = H01PV6_n9456OMOpeNom[0] ;
         A9469OMMCFin = H01PV6_A9469OMMCFin[0] ;
         A9468OMMCIni = H01PV6_A9468OMMCIni[0] ;
         A9455OMOpeCod = H01PV6_A9455OMOpeCod[0] ;
         A9456OMOpeNom = H01PV6_A9456OMOpeNom[0] ;
         n9456OMOpeNom = H01PV6_n9456OMOpeNom[0] ;
         AV55OMOpeCodGrid = A9455OMOpeCod ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOmopecodgrid_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55OMOpeCodGrid), 6, 0));
         AV56OmOpeNomGrid = A9456OMOpeNom ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOmopenomgrid_Internalname, AV56OmOpeNomGrid);
         AV48OMMcFinGrid = A9469OMMCFin ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOmmcfingrid_Internalname, localUtil.ttoc( AV48OMMcFinGrid, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV49OmMcIniGrid = A9468OMMCIni ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOmmcinigrid_Internalname, localUtil.ttoc( AV49OmMcIniGrid, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV51OMMcTieGrid = GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A9469OMMCFin, A9468OMMCIni)/ (double) (60)), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOmmctiegrid_Internalname, GXutil.ltrimstr( AV51OMMcTieGrid, 12, 3));
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(67) ;
         }
         if ( ( subGrid2_Islastpage == 1 ) || ( subGrid2_Rows == 0 ) || ( ( GRID2_nCurrentRecord >= GRID2_nFirstRecordOnPage ) && ( GRID2_nCurrentRecord < GRID2_nFirstRecordOnPage + subgrid2_fnc_recordsperpage( ) ) ) )
         {
            sendrow_677( ) ;
            GRID2_nEOF = (byte)(1) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID2_nEOF", GXutil.ltrim( localUtil.ntoc( GRID2_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( ( subGrid2_Islastpage == 1 ) && ( ((int)((GRID2_nCurrentRecord) % (subgrid2_fnc_recordsperpage( )))) == 0 ) )
            {
               GRID2_nFirstRecordOnPage = GRID2_nCurrentRecord ;
            }
         }
         if ( GRID2_nCurrentRecord >= GRID2_nFirstRecordOnPage + subgrid2_fnc_recordsperpage( ) )
         {
            GRID2_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID2_nEOF", GXutil.ltrim( localUtil.ntoc( GRID2_nEOF, (byte)(1), (byte)(0), ".", "")));
         }
         GRID2_nCurrentRecord = (long)(GRID2_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_67_Refreshing )
         {
            httpContext.doAjaxLoad(67, Grid2Row);
         }
         pr_default.readNext(4);
      }
      pr_default.close(4);
      /*  Sending Event outputs  */
   }

   public void wb_table1_27_1PV2( boolean wbgen )
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
         wb_table1_27_1PV2e( true) ;
      }
      else
      {
         wb_table1_27_1PV2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV7Omcod = ((Number) GXutil.testNumericType( getParm(obj,0,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Omcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7Omcod), 8, 0));
      AV36OmCod_to = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36OmCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36OmCod_to), 8, 0));
      AV44OmMaqCod = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44OmMaqCod", AV44OmMaqCod);
      AV45OmMaqCod_to = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45OmMaqCod_to", AV45OmMaqCod_to);
      AV8Omopecod = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Omopecod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8Omopecod), 6, 0));
      AV53OmOpeCod_to = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53OmOpeCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53OmOpeCod_to), 6, 0));
      AV39Omfchcer = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39Omfchcer", localUtil.format(AV39Omfchcer, "99/99/99"));
      AV40OMFchCer_to = (java.util.Date)getParm(obj,7,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40OMFchCer_to", localUtil.format(AV40OMFchCer_to, "99/99/99"));
      AV60Preventivos = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60Preventivos", GXutil.str( AV60Preventivos, 1, 0));
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
      pa1PV2( ) ;
      ws1PV2( ) ;
      we1PV2( ) ;
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
      sCtrlAV7Omcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV36OmCod_to = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV44OmMaqCod = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV45OmMaqCod_to = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV8Omopecod = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV53OmOpeCod_to = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV39Omfchcer = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV40OMFchCer_to = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV60Preventivos = (String)getParm(obj,8,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1PV2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "listadoordenesoperariotarea_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1PV2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV7Omcod = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Omcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7Omcod), 8, 0));
         AV36OmCod_to = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36OmCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36OmCod_to), 8, 0));
         AV44OmMaqCod = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44OmMaqCod", AV44OmMaqCod);
         AV45OmMaqCod_to = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45OmMaqCod_to", AV45OmMaqCod_to);
         AV8Omopecod = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Omopecod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8Omopecod), 6, 0));
         AV53OmOpeCod_to = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53OmOpeCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53OmOpeCod_to), 6, 0));
         AV39Omfchcer = (java.util.Date)getParm(obj,8,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39Omfchcer", localUtil.format(AV39Omfchcer, "99/99/99"));
         AV40OMFchCer_to = (java.util.Date)getParm(obj,9,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40OMFchCer_to", localUtil.format(AV40OMFchCer_to, "99/99/99"));
         AV60Preventivos = ((Number) GXutil.testNumericType( getParm(obj,10,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60Preventivos", GXutil.str( AV60Preventivos, 1, 0));
      }
      wcpOAV7Omcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV7Omcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV36OmCod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV36OmCod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV44OmMaqCod = httpContext.cgiGet( sPrefix+"wcpOAV44OmMaqCod") ;
      wcpOAV45OmMaqCod_to = httpContext.cgiGet( sPrefix+"wcpOAV45OmMaqCod_to") ;
      wcpOAV8Omopecod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV8Omopecod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV53OmOpeCod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV53OmOpeCod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV39Omfchcer = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV39Omfchcer"), 0) ;
      wcpOAV40OMFchCer_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV40OMFchCer_to"), 0) ;
      wcpOAV60Preventivos = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV60Preventivos"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( AV7Omcod != wcpOAV7Omcod ) || ( AV36OmCod_to != wcpOAV36OmCod_to ) || ( GXutil.strcmp(AV44OmMaqCod, wcpOAV44OmMaqCod) != 0 ) || ( GXutil.strcmp(AV45OmMaqCod_to, wcpOAV45OmMaqCod_to) != 0 ) || ( AV8Omopecod != wcpOAV8Omopecod ) || ( AV53OmOpeCod_to != wcpOAV53OmOpeCod_to ) || !( GXutil.dateCompare(GXutil.resetTime(AV39Omfchcer), GXutil.resetTime(wcpOAV39Omfchcer)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV40OMFchCer_to), GXutil.resetTime(wcpOAV40OMFchCer_to)) ) || ( AV60Preventivos != wcpOAV60Preventivos ) ) )
      {
         setjustcreated();
      }
      wcpOAV7Omcod = AV7Omcod ;
      wcpOAV36OmCod_to = AV36OmCod_to ;
      wcpOAV44OmMaqCod = AV44OmMaqCod ;
      wcpOAV45OmMaqCod_to = AV45OmMaqCod_to ;
      wcpOAV8Omopecod = AV8Omopecod ;
      wcpOAV53OmOpeCod_to = AV53OmOpeCod_to ;
      wcpOAV39Omfchcer = AV39Omfchcer ;
      wcpOAV40OMFchCer_to = AV40OMFchCer_to ;
      wcpOAV60Preventivos = AV60Preventivos ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV7Omcod = httpContext.cgiGet( sPrefix+"AV7Omcod_CTRL") ;
      if ( GXutil.len( sCtrlAV7Omcod) > 0 )
      {
         AV7Omcod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV7Omcod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Omcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7Omcod), 8, 0));
      }
      else
      {
         AV7Omcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV7Omcod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV36OmCod_to = httpContext.cgiGet( sPrefix+"AV36OmCod_to_CTRL") ;
      if ( GXutil.len( sCtrlAV36OmCod_to) > 0 )
      {
         AV36OmCod_to = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV36OmCod_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36OmCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36OmCod_to), 8, 0));
      }
      else
      {
         AV36OmCod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV36OmCod_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV44OmMaqCod = httpContext.cgiGet( sPrefix+"AV44OmMaqCod_CTRL") ;
      if ( GXutil.len( sCtrlAV44OmMaqCod) > 0 )
      {
         AV44OmMaqCod = httpContext.cgiGet( sCtrlAV44OmMaqCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44OmMaqCod", AV44OmMaqCod);
      }
      else
      {
         AV44OmMaqCod = httpContext.cgiGet( sPrefix+"AV44OmMaqCod_PARM") ;
      }
      sCtrlAV45OmMaqCod_to = httpContext.cgiGet( sPrefix+"AV45OmMaqCod_to_CTRL") ;
      if ( GXutil.len( sCtrlAV45OmMaqCod_to) > 0 )
      {
         AV45OmMaqCod_to = httpContext.cgiGet( sCtrlAV45OmMaqCod_to) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45OmMaqCod_to", AV45OmMaqCod_to);
      }
      else
      {
         AV45OmMaqCod_to = httpContext.cgiGet( sPrefix+"AV45OmMaqCod_to_PARM") ;
      }
      sCtrlAV8Omopecod = httpContext.cgiGet( sPrefix+"AV8Omopecod_CTRL") ;
      if ( GXutil.len( sCtrlAV8Omopecod) > 0 )
      {
         AV8Omopecod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV8Omopecod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Omopecod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8Omopecod), 6, 0));
      }
      else
      {
         AV8Omopecod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV8Omopecod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV53OmOpeCod_to = httpContext.cgiGet( sPrefix+"AV53OmOpeCod_to_CTRL") ;
      if ( GXutil.len( sCtrlAV53OmOpeCod_to) > 0 )
      {
         AV53OmOpeCod_to = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV53OmOpeCod_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53OmOpeCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53OmOpeCod_to), 6, 0));
      }
      else
      {
         AV53OmOpeCod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV53OmOpeCod_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV39Omfchcer = httpContext.cgiGet( sPrefix+"AV39Omfchcer_CTRL") ;
      if ( GXutil.len( sCtrlAV39Omfchcer) > 0 )
      {
         AV39Omfchcer = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV39Omfchcer), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39Omfchcer", localUtil.format(AV39Omfchcer, "99/99/99"));
      }
      else
      {
         AV39Omfchcer = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV39Omfchcer_PARM"), 0) ;
      }
      sCtrlAV40OMFchCer_to = httpContext.cgiGet( sPrefix+"AV40OMFchCer_to_CTRL") ;
      if ( GXutil.len( sCtrlAV40OMFchCer_to) > 0 )
      {
         AV40OMFchCer_to = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV40OMFchCer_to), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40OMFchCer_to", localUtil.format(AV40OMFchCer_to, "99/99/99"));
      }
      else
      {
         AV40OMFchCer_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV40OMFchCer_to_PARM"), 0) ;
      }
      sCtrlAV60Preventivos = httpContext.cgiGet( sPrefix+"AV60Preventivos_CTRL") ;
      if ( GXutil.len( sCtrlAV60Preventivos) > 0 )
      {
         AV60Preventivos = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV60Preventivos), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60Preventivos", GXutil.str( AV60Preventivos, 1, 0));
      }
      else
      {
         AV60Preventivos = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV60Preventivos_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa1PV2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1PV2( ) ;
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
      ws1PV2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7Omcod_PARM", GXutil.ltrim( localUtil.ntoc( AV7Omcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7Omcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7Omcod_CTRL", GXutil.rtrim( sCtrlAV7Omcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV36OmCod_to_PARM", GXutil.ltrim( localUtil.ntoc( AV36OmCod_to, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV36OmCod_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV36OmCod_to_CTRL", GXutil.rtrim( sCtrlAV36OmCod_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV44OmMaqCod_PARM", GXutil.rtrim( AV44OmMaqCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV44OmMaqCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV44OmMaqCod_CTRL", GXutil.rtrim( sCtrlAV44OmMaqCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV45OmMaqCod_to_PARM", GXutil.rtrim( AV45OmMaqCod_to));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV45OmMaqCod_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV45OmMaqCod_to_CTRL", GXutil.rtrim( sCtrlAV45OmMaqCod_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8Omopecod_PARM", GXutil.ltrim( localUtil.ntoc( AV8Omopecod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8Omopecod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8Omopecod_CTRL", GXutil.rtrim( sCtrlAV8Omopecod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV53OmOpeCod_to_PARM", GXutil.ltrim( localUtil.ntoc( AV53OmOpeCod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV53OmOpeCod_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV53OmOpeCod_to_CTRL", GXutil.rtrim( sCtrlAV53OmOpeCod_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV39Omfchcer_PARM", localUtil.dtoc( AV39Omfchcer, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV39Omfchcer)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV39Omfchcer_CTRL", GXutil.rtrim( sCtrlAV39Omfchcer));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV40OMFchCer_to_PARM", localUtil.dtoc( AV40OMFchCer_to, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV40OMFchCer_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV40OMFchCer_to_CTRL", GXutil.rtrim( sCtrlAV40OMFchCer_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV60Preventivos_PARM", GXutil.ltrim( localUtil.ntoc( AV60Preventivos, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV60Preventivos)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV60Preventivos_CTRL", GXutil.rtrim( sCtrlAV60Preventivos));
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
      we1PV2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211556117", true, true);
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
      if ( nGXWrapped != 1 )
      {
         httpContext.AddJavascriptSource("listadoordenesoperariotarea_wc.js", "?20268211556117", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_442( )
   {
      edtavOmcodgrid_Internalname = sPrefix+"vOMCODGRID_"+sGXsfl_44_idx ;
      edtavPmcodgrid_Internalname = sPrefix+"vPMCODGRID_"+sGXsfl_44_idx ;
      edtavOmmaqcodgrid_Internalname = sPrefix+"vOMMAQCODGRID_"+sGXsfl_44_idx ;
      edtavOmmaqdsc_Internalname = sPrefix+"vOMMAQDSC_"+sGXsfl_44_idx ;
      edtavOmfchcre_Internalname = sPrefix+"vOMFCHCRE_"+sGXsfl_44_idx ;
      edtavOmfchcergrid_Internalname = sPrefix+"vOMFCHCERGRID_"+sGXsfl_44_idx ;
      edtavOmmctie_Internalname = sPrefix+"vOMMCTIE_"+sGXsfl_44_idx ;
      edtavHhmmalfa_Internalname = sPrefix+"vHHMMALFA_"+sGXsfl_44_idx ;
      edtavOmtxtgrid_Internalname = sPrefix+"vOMTXTGRID_"+sGXsfl_44_idx ;
      edtavHorreaint_Internalname = sPrefix+"vHORREAINT_"+sGXsfl_44_idx ;
      edtavMinrea_Internalname = sPrefix+"vMINREA_"+sGXsfl_44_idx ;
      edtavMinutos_Internalname = sPrefix+"vMINUTOS_"+sGXsfl_44_idx ;
   }

   public void subsflControlProps_fel_442( )
   {
      edtavOmcodgrid_Internalname = sPrefix+"vOMCODGRID_"+sGXsfl_44_fel_idx ;
      edtavPmcodgrid_Internalname = sPrefix+"vPMCODGRID_"+sGXsfl_44_fel_idx ;
      edtavOmmaqcodgrid_Internalname = sPrefix+"vOMMAQCODGRID_"+sGXsfl_44_fel_idx ;
      edtavOmmaqdsc_Internalname = sPrefix+"vOMMAQDSC_"+sGXsfl_44_fel_idx ;
      edtavOmfchcre_Internalname = sPrefix+"vOMFCHCRE_"+sGXsfl_44_fel_idx ;
      edtavOmfchcergrid_Internalname = sPrefix+"vOMFCHCERGRID_"+sGXsfl_44_fel_idx ;
      edtavOmmctie_Internalname = sPrefix+"vOMMCTIE_"+sGXsfl_44_fel_idx ;
      edtavHhmmalfa_Internalname = sPrefix+"vHHMMALFA_"+sGXsfl_44_fel_idx ;
      edtavOmtxtgrid_Internalname = sPrefix+"vOMTXTGRID_"+sGXsfl_44_fel_idx ;
      edtavHorreaint_Internalname = sPrefix+"vHORREAINT_"+sGXsfl_44_fel_idx ;
      edtavMinrea_Internalname = sPrefix+"vMINREA_"+sGXsfl_44_fel_idx ;
      edtavMinutos_Internalname = sPrefix+"vMINUTOS_"+sGXsfl_44_fel_idx ;
   }

   public void sendrow_442( )
   {
      subsflControlProps_442( ) ;
      wb1PV0( ) ;
      if ( ( subGrid1_Rows * 1 == 0 ) || ( nGXsfl_44_idx - GRID1_nFirstRecordOnPage <= subgrid1_fnc_recordsperpage( ) * 1 ) )
      {
         Grid1Row = GXWebRow.GetNew(context,Grid1Container) ;
         if ( subGrid1_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGrid1_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Odd" ;
            }
         }
         else if ( subGrid1_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGrid1_Backstyle = (byte)(0) ;
            subGrid1_Backcolor = subGrid1_Allbackcolor ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Uniform" ;
            }
         }
         else if ( subGrid1_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGrid1_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Odd" ;
            }
            subGrid1_Backcolor = (int)(0x0) ;
         }
         else if ( subGrid1_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGrid1_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_44_idx) % (2))) == 0 )
            {
               subGrid1_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Even" ;
               }
            }
            else
            {
               subGrid1_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Odd" ;
               }
            }
         }
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"GridNoBorder WorkWithSelection WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_44_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavOmcodgrid_Enabled!=0)&&(edtavOmcodgrid_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 45,'"+sPrefix+"',false,'"+sGXsfl_44_idx+"',44)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavOmcodgrid_Internalname,GXutil.ltrim( localUtil.ntoc( AV38OmCodGrid, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavOmcodgrid_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV38OmCodGrid), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV38OmCodGrid), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavOmcodgrid_Enabled!=0)&&(edtavOmcodgrid_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,45);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+sPrefix+"EVOMCODGRID.CLICK."+sGXsfl_44_idx+"'","","","","",edtavOmcodgrid_Jsonclick,Integer.valueOf(5),"Attribute","",ROClassString,edtavOmcodgrid_Columnclass,edtavOmcodgrid_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavOmcodgrid_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavPmcodgrid_Enabled!=0)&&(edtavPmcodgrid_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 46,'"+sPrefix+"',false,'"+sGXsfl_44_idx+"',44)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPmcodgrid_Internalname,GXutil.ltrim( localUtil.ntoc( AV59PmCodGrid, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPmcodgrid_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV59PmCodGrid), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV59PmCodGrid), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavPmcodgrid_Enabled!=0)&&(edtavPmcodgrid_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPmcodgrid_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavPmcodgrid_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavOmmaqcodgrid_Enabled!=0)&&(edtavOmmaqcodgrid_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 47,'"+sPrefix+"',false,'"+sGXsfl_44_idx+"',44)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavOmmaqcodgrid_Internalname,GXutil.rtrim( AV47OmMaqCodGrid),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavOmmaqcodgrid_Enabled!=0)&&(edtavOmmaqcodgrid_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,47);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavOmmaqcodgrid_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavOmmaqcodgrid_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavOmmaqdsc_Enabled!=0)&&(edtavOmmaqdsc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 48,'"+sPrefix+"',false,'"+sGXsfl_44_idx+"',44)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavOmmaqdsc_Internalname,GXutil.rtrim( AV83OMMaqDsc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavOmmaqdsc_Enabled!=0)&&(edtavOmmaqdsc_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,48);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavOmmaqdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavOmmaqdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavOmfchcre_Enabled!=0)&&(edtavOmfchcre_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 49,'"+sPrefix+"',false,'"+sGXsfl_44_idx+"',44)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavOmfchcre_Internalname,localUtil.ttoc( AV43OmFchCre, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( AV43OmFchCre, "99/99/99 99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+((edtavOmfchcre_Enabled!=0)&&(edtavOmfchcre_Visible!=0) ? " onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,49);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavOmfchcre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavOmfchcre_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavOmfchcergrid_Enabled!=0)&&(edtavOmfchcergrid_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 50,'"+sPrefix+"',false,'"+sGXsfl_44_idx+"',44)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavOmfchcergrid_Internalname,localUtil.ttoc( AV42OmFchCerGrid, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( AV42OmFchCerGrid, "99/99/99 99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+((edtavOmfchcergrid_Enabled!=0)&&(edtavOmfchcergrid_Visible!=0) ? " onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,50);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavOmfchcergrid_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavOmfchcergrid_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavOmmctie_Enabled!=0)&&(edtavOmmctie_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 51,'"+sPrefix+"',false,'"+sGXsfl_44_idx+"',44)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavOmmctie_Internalname,localUtil.ttoc( AV50OmMcTie, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( AV50OmMcTie, "99/99/99 99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+((edtavOmmctie_Enabled!=0)&&(edtavOmmctie_Visible!=0) ? " onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,51);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavOmmctie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavOmmctie_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHhmmalfa_Enabled!=0)&&(edtavHhmmalfa_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 52,'"+sPrefix+"',false,'"+sGXsfl_44_idx+"',44)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHhmmalfa_Internalname,GXutil.rtrim( AV26HHMMAlfa),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavHhmmalfa_Enabled!=0)&&(edtavHhmmalfa_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,52);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHhmmalfa_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavHhmmalfa_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavOmtxtgrid_Enabled!=0)&&(edtavOmtxtgrid_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 53,'"+sPrefix+"',false,'"+sGXsfl_44_idx+"',44)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavOmtxtgrid_Internalname,AV57OMTxtGrid,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavOmtxtgrid_Enabled!=0)&&(edtavOmtxtgrid_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,53);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavOmtxtgrid_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavOmtxtgrid_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2000),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHorreaint_Enabled!=0)&&(edtavHorreaint_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 54,'"+sPrefix+"',false,'"+sGXsfl_44_idx+"',44)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHorreaint_Internalname,GXutil.ltrim( localUtil.ntoc( AV28HorReaint, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavHorreaint_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV28HorReaint), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV28HorReaint), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavHorreaint_Enabled!=0)&&(edtavHorreaint_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,54);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHorreaint_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavHorreaint_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavMinrea_Enabled!=0)&&(edtavMinrea_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 55,'"+sPrefix+"',false,'"+sGXsfl_44_idx+"',44)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMinrea_Internalname,GXutil.ltrim( localUtil.ntoc( AV34MinRea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavMinrea_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV34MinRea), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV34MinRea), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavMinrea_Enabled!=0)&&(edtavMinrea_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,55);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavMinrea_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavMinrea_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavMinutos_Enabled!=0)&&(edtavMinutos_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 56,'"+sPrefix+"',false,'"+sGXsfl_44_idx+"',44)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMinutos_Internalname,GXutil.ltrim( localUtil.ntoc( AV35Minutos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavMinutos_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV35Minutos), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV35Minutos), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavMinutos_Enabled!=0)&&(edtavMinutos_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavMinutos_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavMinutos_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1PV2( ) ;
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_44_idx = ((subGrid1_Islastpage==1)&&(nGXsfl_44_idx+1>subgrid1_fnc_recordsperpage( )) ? 1 : nGXsfl_44_idx+1) ;
         sGXsfl_44_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_44_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_442( ) ;
      }
      /* End function sendrow_442 */
   }

   public void subsflControlProps_677( )
   {
      edtavOmopecodgrid_Internalname = sPrefix+"vOMOPECODGRID_"+sGXsfl_67_idx ;
      edtavOmopenomgrid_Internalname = sPrefix+"vOMOPENOMGRID_"+sGXsfl_67_idx ;
      edtavOmmcinigrid_Internalname = sPrefix+"vOMMCINIGRID_"+sGXsfl_67_idx ;
      edtavOmmcfingrid_Internalname = sPrefix+"vOMMCFINGRID_"+sGXsfl_67_idx ;
      edtavOmmctiegrid_Internalname = sPrefix+"vOMMCTIEGRID_"+sGXsfl_67_idx ;
   }

   public void subsflControlProps_fel_677( )
   {
      edtavOmopecodgrid_Internalname = sPrefix+"vOMOPECODGRID_"+sGXsfl_67_fel_idx ;
      edtavOmopenomgrid_Internalname = sPrefix+"vOMOPENOMGRID_"+sGXsfl_67_fel_idx ;
      edtavOmmcinigrid_Internalname = sPrefix+"vOMMCINIGRID_"+sGXsfl_67_fel_idx ;
      edtavOmmcfingrid_Internalname = sPrefix+"vOMMCFINGRID_"+sGXsfl_67_fel_idx ;
      edtavOmmctiegrid_Internalname = sPrefix+"vOMMCTIEGRID_"+sGXsfl_67_fel_idx ;
   }

   public void sendrow_677( )
   {
      subsflControlProps_677( ) ;
      wb1PV0( ) ;
      if ( ( subGrid2_Rows * 1 == 0 ) || ( nGXsfl_67_idx - GRID2_nFirstRecordOnPage <= subgrid2_fnc_recordsperpage( ) * 1 ) )
      {
         Grid2Row = GXWebRow.GetNew(context,Grid2Container) ;
         if ( subGrid2_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGrid2_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
            {
               subGrid2_Linesclass = subGrid2_Class+"Odd" ;
            }
         }
         else if ( subGrid2_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGrid2_Backstyle = (byte)(0) ;
            subGrid2_Backcolor = subGrid2_Allbackcolor ;
            if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
            {
               subGrid2_Linesclass = subGrid2_Class+"Uniform" ;
            }
         }
         else if ( subGrid2_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGrid2_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
            {
               subGrid2_Linesclass = subGrid2_Class+"Odd" ;
            }
            subGrid2_Backcolor = (int)(0x0) ;
         }
         else if ( subGrid2_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGrid2_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_67_idx) % (2))) == 0 )
            {
               subGrid2_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
               {
                  subGrid2_Linesclass = subGrid2_Class+"Even" ;
               }
            }
            else
            {
               subGrid2_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
               {
                  subGrid2_Linesclass = subGrid2_Class+"Odd" ;
               }
            }
         }
         if ( Grid2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"GridNoBorder WorkWithSelection WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_67_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Grid2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavOmopecodgrid_Internalname,GXutil.ltrim( localUtil.ntoc( AV55OMOpeCodGrid, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavOmopecodgrid_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV55OMOpeCodGrid), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV55OMOpeCodGrid), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavOmopecodgrid_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavOmopecodgrid_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(67),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavOmopenomgrid_Internalname,GXutil.rtrim( AV56OmOpeNomGrid),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavOmopenomgrid_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavOmopenomgrid_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(67),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Grid2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavOmmcinigrid_Internalname,localUtil.ttoc( AV49OmMcIniGrid, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( AV49OmMcIniGrid, "99/99/99 99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavOmmcinigrid_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavOmmcinigrid_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(67),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavOmmcfingrid_Internalname,localUtil.ttoc( AV48OMMcFinGrid, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( AV48OMMcFinGrid, "99/99/99 99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavOmmcfingrid_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavOmmcfingrid_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(67),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavOmmctiegrid_Internalname,GXutil.ltrim( localUtil.ntoc( AV51OMMcTieGrid, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavOmmctiegrid_Enabled!=0) ? localUtil.format( AV51OMMcTieGrid, "ZZ,ZZZ,ZZ9.999") : localUtil.format( AV51OMMcTieGrid, "ZZ,ZZZ,ZZ9.999"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavOmmctiegrid_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavOmmctiegrid_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(67),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1PV7( ) ;
         Grid2Container.AddRow(Grid2Row);
         nGXsfl_67_idx = ((subGrid2_Islastpage==1)&&(nGXsfl_67_idx+1>subgrid2_fnc_recordsperpage( )) ? 1 : nGXsfl_67_idx+1) ;
         sGXsfl_67_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_67_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_677( ) ;
      }
      /* End function sendrow_677 */
   }

   public void subsflControlProps_815( )
   {
      edtavTmcodgrid_Internalname = sPrefix+"vTMCODGRID_"+sGXsfl_81_idx ;
      edtavTmdscgrid_Internalname = sPrefix+"vTMDSCGRID_"+sGXsfl_81_idx ;
   }

   public void subsflControlProps_fel_815( )
   {
      edtavTmcodgrid_Internalname = sPrefix+"vTMCODGRID_"+sGXsfl_81_fel_idx ;
      edtavTmdscgrid_Internalname = sPrefix+"vTMDSCGRID_"+sGXsfl_81_fel_idx ;
   }

   public void sendrow_815( )
   {
      subsflControlProps_815( ) ;
      wb1PV0( ) ;
      if ( ( subGrid3_Rows * 1 == 0 ) || ( nGXsfl_81_idx - GRID3_nFirstRecordOnPage <= subgrid3_fnc_recordsperpage( ) * 1 ) )
      {
         Grid3Row = GXWebRow.GetNew(context,Grid3Container) ;
         if ( subGrid3_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGrid3_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGrid3_Class, "") != 0 )
            {
               subGrid3_Linesclass = subGrid3_Class+"Odd" ;
            }
         }
         else if ( subGrid3_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGrid3_Backstyle = (byte)(0) ;
            subGrid3_Backcolor = subGrid3_Allbackcolor ;
            if ( GXutil.strcmp(subGrid3_Class, "") != 0 )
            {
               subGrid3_Linesclass = subGrid3_Class+"Uniform" ;
            }
         }
         else if ( subGrid3_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGrid3_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGrid3_Class, "") != 0 )
            {
               subGrid3_Linesclass = subGrid3_Class+"Odd" ;
            }
            subGrid3_Backcolor = (int)(0x0) ;
         }
         else if ( subGrid3_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGrid3_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_81_idx) % (2))) == 0 )
            {
               subGrid3_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid3_Class, "") != 0 )
               {
                  subGrid3_Linesclass = subGrid3_Class+"Even" ;
               }
            }
            else
            {
               subGrid3_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid3_Class, "") != 0 )
               {
                  subGrid3_Linesclass = subGrid3_Class+"Odd" ;
               }
            }
         }
         if ( Grid3Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"GridNoBorder WorkWithSelection WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_81_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Grid3Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTmcodgrid_Internalname,GXutil.ltrim( localUtil.ntoc( AV64TmCodGrid, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavTmcodgrid_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV64TmCodGrid), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV64TmCodGrid), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavTmcodgrid_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavTmcodgrid_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(81),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid3Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTmdscgrid_Internalname,GXutil.rtrim( AV65TmDscGrid),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavTmdscgrid_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavTmdscgrid_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(81),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes1PV5( ) ;
         Grid3Container.AddRow(Grid3Row);
         nGXsfl_81_idx = ((subGrid3_Islastpage==1)&&(nGXsfl_81_idx+1>subgrid3_fnc_recordsperpage( )) ? 1 : nGXsfl_81_idx+1) ;
         sGXsfl_81_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_81_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_815( ) ;
      }
      /* End function sendrow_815 */
   }

   public void subsflControlProps_923( )
   {
      edtavOmrepcod_Internalname = sPrefix+"vOMREPCOD_"+sGXsfl_92_idx ;
      edtavOmrepnom_Internalname = sPrefix+"vOMREPNOM_"+sGXsfl_92_idx ;
      edtavOmrccnt_Internalname = sPrefix+"vOMRCCNT_"+sGXsfl_92_idx ;
      edtavOmrcpre_Internalname = sPrefix+"vOMRCPRE_"+sGXsfl_92_idx ;
   }

   public void subsflControlProps_fel_923( )
   {
      edtavOmrepcod_Internalname = sPrefix+"vOMREPCOD_"+sGXsfl_92_fel_idx ;
      edtavOmrepnom_Internalname = sPrefix+"vOMREPNOM_"+sGXsfl_92_fel_idx ;
      edtavOmrccnt_Internalname = sPrefix+"vOMRCCNT_"+sGXsfl_92_fel_idx ;
      edtavOmrcpre_Internalname = sPrefix+"vOMRCPRE_"+sGXsfl_92_fel_idx ;
   }

   public void sendrow_923( )
   {
      subsflControlProps_923( ) ;
      wb1PV0( ) ;
      if ( ( subGrid4_Rows * 1 == 0 ) || ( nGXsfl_92_idx <= subgrid4_fnc_recordsperpage( ) * 1 ) )
      {
         Grid4Row = GXWebRow.GetNew(context,Grid4Container) ;
         if ( subGrid4_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGrid4_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGrid4_Class, "") != 0 )
            {
               subGrid4_Linesclass = subGrid4_Class+"Odd" ;
            }
         }
         else if ( subGrid4_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGrid4_Backstyle = (byte)(0) ;
            subGrid4_Backcolor = subGrid4_Allbackcolor ;
            if ( GXutil.strcmp(subGrid4_Class, "") != 0 )
            {
               subGrid4_Linesclass = subGrid4_Class+"Uniform" ;
            }
         }
         else if ( subGrid4_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGrid4_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGrid4_Class, "") != 0 )
            {
               subGrid4_Linesclass = subGrid4_Class+"Odd" ;
            }
            subGrid4_Backcolor = (int)(0x0) ;
         }
         else if ( subGrid4_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGrid4_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_92_idx) % (2))) == 0 )
            {
               subGrid4_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid4_Class, "") != 0 )
               {
                  subGrid4_Linesclass = subGrid4_Class+"Even" ;
               }
            }
            else
            {
               subGrid4_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid4_Class, "") != 0 )
               {
                  subGrid4_Linesclass = subGrid4_Class+"Odd" ;
               }
            }
         }
         if ( Grid4Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_92_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Grid4Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid4Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavOmrepcod_Internalname,GXutil.ltrim( localUtil.ntoc( AV73OmRepCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavOmrepcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV73OmRepCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV73OmRepCod), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavOmrepcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavOmrepcod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(92),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(false),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid4Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid4Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavOmrepnom_Internalname,GXutil.rtrim( AV74OmRepNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavOmrepnom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavOmrepnom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(92),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(false),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Grid4Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid4Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavOmrccnt_Internalname,GXutil.ltrim( localUtil.ntoc( AV75OmRcCnt, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavOmrccnt_Enabled!=0) ? localUtil.format( AV75OmRcCnt, "ZZ,ZZZ,ZZ9.999") : localUtil.format( AV75OmRcCnt, "ZZ,ZZZ,ZZ9.999"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavOmrccnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavOmrccnt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(92),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(false),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid4Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid4Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavOmrcpre_Internalname,GXutil.ltrim( localUtil.ntoc( AV76OmRcPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavOmrcpre_Enabled!=0) ? localUtil.format( AV76OmRcPre, "ZZZZZZZ9.999") : localUtil.format( AV76OmRcPre, "ZZZZZZZ9.999"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavOmrcpre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavOmrcpre_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(92),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(false),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1PV3( ) ;
         Grid4Container.AddRow(Grid4Row);
         nGXsfl_92_idx = ((subGrid4_Islastpage==1)&&(nGXsfl_92_idx+1>subgrid4_fnc_recordsperpage( )) ? 1 : nGXsfl_92_idx+1) ;
         sGXsfl_92_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_92_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_923( ) ;
      }
      /* End function sendrow_923 */
   }

   public void startgridcontrol44( )
   {
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"Grid1Container"+"DivS\" data-gxgridid=\"44\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid1_Internalname, subGrid1_Internalname, "", "GridNoBorder WorkWithSelection WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subGrid1_Backcolorstyle == 0 )
         {
            subGrid1_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subGrid1_Class) > 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Title" ;
            }
         }
         else
         {
            subGrid1_Titlebackstyle = (byte)(1) ;
            if ( subGrid1_Backcolorstyle == 1 )
            {
               subGrid1_Titlebackcolor = subGrid1_Allbackcolor ;
               if ( GXutil.len( subGrid1_Class) > 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subGrid1_Class) > 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Title" ;
               }
            }
         }
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Orden", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Preventivo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Máquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Alta", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Cierre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tiempo(m)", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "hh:mm", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Trabajo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hh", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Mm", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Minutos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         Grid1Container.AddObjectProperty("GridName", "Grid1");
      }
      else
      {
         Grid1Container.AddObjectProperty("GridName", "Grid1");
         Grid1Container.AddObjectProperty("Header", subGrid1_Header);
         Grid1Container.AddObjectProperty("Class", "GridNoBorder WorkWithSelection WorkWith");
         Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("CmpContext", sPrefix);
         Grid1Container.AddObjectProperty("InMasterPage", "false");
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV38OmCodGrid, (byte)(8), (byte)(0), ".", "")));
         Grid1Column.AddObjectProperty("Columnclass", GXutil.rtrim( edtavOmcodgrid_Columnclass));
         Grid1Column.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavOmcodgrid_Columnheaderclass));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavOmcodgrid_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV59PmCodGrid, (byte)(8), (byte)(0), ".", "")));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPmcodgrid_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV47OmMaqCodGrid));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavOmmaqcodgrid_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV83OMMaqDsc));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavOmmaqdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", localUtil.ttoc( AV43OmFchCre, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavOmfchcre_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", localUtil.ttoc( AV42OmFchCerGrid, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavOmfchcergrid_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", localUtil.ttoc( AV50OmMcTie, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavOmmctie_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV26HHMMAlfa));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHhmmalfa_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", AV57OMTxtGrid);
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavOmtxtgrid_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV28HorReaint, (byte)(4), (byte)(0), ".", "")));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHorreaint_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV34MinRea, (byte)(4), (byte)(0), ".", "")));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMinrea_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV35Minutos, (byte)(4), (byte)(0), ".", "")));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMinutos_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void startgridcontrol67( )
   {
      if ( Grid2Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"Grid2Container"+"DivS\" data-gxgridid=\"67\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid2_Internalname, subGrid2_Internalname, "", "GridNoBorder WorkWithSelection WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subGrid2_Backcolorstyle == 0 )
         {
            subGrid2_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subGrid2_Class) > 0 )
            {
               subGrid2_Linesclass = subGrid2_Class+"Title" ;
            }
         }
         else
         {
            subGrid2_Titlebackstyle = (byte)(1) ;
            if ( subGrid2_Backcolorstyle == 1 )
            {
               subGrid2_Titlebackcolor = subGrid2_Allbackcolor ;
               if ( GXutil.len( subGrid2_Class) > 0 )
               {
                  subGrid2_Linesclass = subGrid2_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subGrid2_Class) > 0 )
               {
                  subGrid2_Linesclass = subGrid2_Class+"Title" ;
               }
            }
         }
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Operario Mantenimiento", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Inicio del Control", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fin del Control", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Duración del Control", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         Grid2Container.AddObjectProperty("GridName", "Grid2");
      }
      else
      {
         Grid2Container.AddObjectProperty("GridName", "Grid2");
         Grid2Container.AddObjectProperty("Header", subGrid2_Header);
         Grid2Container.AddObjectProperty("Class", "GridNoBorder WorkWithSelection WorkWith");
         Grid2Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         Grid2Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         Grid2Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid2_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         Grid2Container.AddObjectProperty("CmpContext", sPrefix);
         Grid2Container.AddObjectProperty("InMasterPage", "false");
         Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV55OMOpeCodGrid, (byte)(6), (byte)(0), ".", "")));
         Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavOmopecodgrid_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid2Container.AddColumnProperties(Grid2Column);
         Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid2Column.AddObjectProperty("Value", GXutil.rtrim( AV56OmOpeNomGrid));
         Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavOmopenomgrid_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid2Container.AddColumnProperties(Grid2Column);
         Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid2Column.AddObjectProperty("Value", localUtil.ttoc( AV49OmMcIniGrid, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavOmmcinigrid_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid2Container.AddColumnProperties(Grid2Column);
         Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid2Column.AddObjectProperty("Value", localUtil.ttoc( AV48OMMcFinGrid, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavOmmcfingrid_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid2Container.AddColumnProperties(Grid2Column);
         Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV51OMMcTieGrid, (byte)(14), (byte)(3), ".", "")));
         Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavOmmctiegrid_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid2Container.AddColumnProperties(Grid2Column);
         Grid2Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid2_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         Grid2Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowselection, (byte)(1), (byte)(0), ".", "")));
         Grid2Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         Grid2Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         Grid2Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         Grid2Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         Grid2Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid2_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void startgridcontrol81( )
   {
      if ( Grid3Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"Grid3Container"+"DivS\" data-gxgridid=\"81\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid3_Internalname, subGrid3_Internalname, "", "GridNoBorder WorkWithSelection WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subGrid3_Backcolorstyle == 0 )
         {
            subGrid3_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subGrid3_Class) > 0 )
            {
               subGrid3_Linesclass = subGrid3_Class+"Title" ;
            }
         }
         else
         {
            subGrid3_Titlebackstyle = (byte)(1) ;
            if ( subGrid3_Backcolorstyle == 1 )
            {
               subGrid3_Titlebackcolor = subGrid3_Allbackcolor ;
               if ( GXutil.len( subGrid3_Class) > 0 )
               {
                  subGrid3_Linesclass = subGrid3_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subGrid3_Class) > 0 )
               {
                  subGrid3_Linesclass = subGrid3_Class+"Title" ;
               }
            }
         }
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tarea", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         Grid3Container.AddObjectProperty("GridName", "Grid3");
      }
      else
      {
         Grid3Container.AddObjectProperty("GridName", "Grid3");
         Grid3Container.AddObjectProperty("Header", subGrid3_Header);
         Grid3Container.AddObjectProperty("Class", "GridNoBorder WorkWithSelection WorkWith");
         Grid3Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         Grid3Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         Grid3Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid3_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         Grid3Container.AddObjectProperty("CmpContext", sPrefix);
         Grid3Container.AddObjectProperty("InMasterPage", "false");
         Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid3Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV64TmCodGrid, (byte)(8), (byte)(0), ".", "")));
         Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTmcodgrid_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid3Container.AddColumnProperties(Grid3Column);
         Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid3Column.AddObjectProperty("Value", GXutil.rtrim( AV65TmDscGrid));
         Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTmdscgrid_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid3Container.AddColumnProperties(Grid3Column);
         Grid3Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid3_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         Grid3Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid3_Allowselection, (byte)(1), (byte)(0), ".", "")));
         Grid3Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid3_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         Grid3Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid3_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         Grid3Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid3_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         Grid3Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid3_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         Grid3Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid3_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void startgridcontrol92( )
   {
      if ( Grid4Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"Grid4Container"+"DivS\" data-gxgridid=\"92\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid4_Internalname, subGrid4_Internalname, "", "GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subGrid4_Backcolorstyle == 0 )
         {
            subGrid4_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subGrid4_Class) > 0 )
            {
               subGrid4_Linesclass = subGrid4_Class+"Title" ;
            }
         }
         else
         {
            subGrid4_Titlebackstyle = (byte)(1) ;
            if ( subGrid4_Backcolorstyle == 1 )
            {
               subGrid4_Titlebackcolor = subGrid4_Allbackcolor ;
               if ( GXutil.len( subGrid4_Class) > 0 )
               {
                  subGrid4_Linesclass = subGrid4_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subGrid4_Class) > 0 )
               {
                  subGrid4_Linesclass = subGrid4_Class+"Title" ;
               }
            }
         }
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Repuesto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cant.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Precio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         Grid4Container.AddObjectProperty("GridName", "Grid4");
      }
      else
      {
         Grid4Container.AddObjectProperty("GridName", "Grid4");
         Grid4Container.AddObjectProperty("Header", subGrid4_Header);
         Grid4Container.AddObjectProperty("Class", "GridNoBorder WorkWith");
         Grid4Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         Grid4Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         Grid4Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid4_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         Grid4Container.AddObjectProperty("CmpContext", sPrefix);
         Grid4Container.AddObjectProperty("InMasterPage", "false");
         Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid4Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV73OmRepCod, (byte)(8), (byte)(0), ".", "")));
         Grid4Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavOmrepcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid4Container.AddColumnProperties(Grid4Column);
         Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid4Column.AddObjectProperty("Value", GXutil.rtrim( AV74OmRepNom));
         Grid4Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavOmrepnom_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid4Container.AddColumnProperties(Grid4Column);
         Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid4Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV75OmRcCnt, (byte)(14), (byte)(3), ".", "")));
         Grid4Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavOmrccnt_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid4Container.AddColumnProperties(Grid4Column);
         Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid4Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV76OmRcPre, (byte)(12), (byte)(3), ".", "")));
         Grid4Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavOmrcpre_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid4Container.AddColumnProperties(Grid4Column);
         Grid4Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid4_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         Grid4Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid4_Allowselection, (byte)(1), (byte)(0), ".", "")));
         Grid4Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid4_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         Grid4Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid4_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         Grid4Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid4_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         Grid4Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid4_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         Grid4Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid4_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void init_default_properties( )
   {
      bttBtnexcel_Internalname = sPrefix+"BTNEXCEL" ;
      bttBtnexcel_2_Internalname = sPrefix+"BTNEXCEL_2" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      lblTextblock_resultado1_Internalname = sPrefix+"TEXTBLOCK_RESULTADO1" ;
      edtavOmcodgrid_Internalname = sPrefix+"vOMCODGRID" ;
      edtavPmcodgrid_Internalname = sPrefix+"vPMCODGRID" ;
      edtavOmmaqcodgrid_Internalname = sPrefix+"vOMMAQCODGRID" ;
      edtavOmmaqdsc_Internalname = sPrefix+"vOMMAQDSC" ;
      edtavOmfchcre_Internalname = sPrefix+"vOMFCHCRE" ;
      edtavOmfchcergrid_Internalname = sPrefix+"vOMFCHCERGRID" ;
      edtavOmmctie_Internalname = sPrefix+"vOMMCTIE" ;
      edtavHhmmalfa_Internalname = sPrefix+"vHHMMALFA" ;
      edtavOmtxtgrid_Internalname = sPrefix+"vOMTXTGRID" ;
      edtavHorreaint_Internalname = sPrefix+"vHORREAINT" ;
      edtavMinrea_Internalname = sPrefix+"vMINREA" ;
      edtavMinutos_Internalname = sPrefix+"vMINUTOS" ;
      divTableordensmanten_Internalname = sPrefix+"TABLEORDENSMANTEN" ;
      lblTextblock_resultado2_Internalname = sPrefix+"TEXTBLOCK_RESULTADO2" ;
      edtavOmopecodgrid_Internalname = sPrefix+"vOMOPECODGRID" ;
      edtavOmopenomgrid_Internalname = sPrefix+"vOMOPENOMGRID" ;
      edtavOmmcinigrid_Internalname = sPrefix+"vOMMCINIGRID" ;
      edtavOmmcfingrid_Internalname = sPrefix+"vOMMCFINGRID" ;
      edtavOmmctiegrid_Internalname = sPrefix+"vOMMCTIEGRID" ;
      divTableoperario_Internalname = sPrefix+"TABLEOPERARIO" ;
      lblTextblock_resultado3_Internalname = sPrefix+"TEXTBLOCK_RESULTADO3" ;
      edtavTmcodgrid_Internalname = sPrefix+"vTMCODGRID" ;
      edtavTmdscgrid_Internalname = sPrefix+"vTMDSCGRID" ;
      divTabletarea_Internalname = sPrefix+"TABLETAREA" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      divTableordenes_Internalname = sPrefix+"TABLEORDENES" ;
      lblTextblock_repuestos_Internalname = sPrefix+"TEXTBLOCK_REPUESTOS" ;
      edtavOmrepcod_Internalname = sPrefix+"vOMREPCOD" ;
      edtavOmrepnom_Internalname = sPrefix+"vOMREPNOM" ;
      edtavOmrccnt_Internalname = sPrefix+"vOMRCCNT" ;
      edtavOmrcpre_Internalname = sPrefix+"vOMRCPRE" ;
      divTablerepuestos_Internalname = sPrefix+"TABLEREPUESTOS" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      divTablecontent_Internalname = sPrefix+"TABLECONTENT" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      edtavEmprcod_Internalname = sPrefix+"vEMPRCOD" ;
      Grid4_empowerer_Internalname = sPrefix+"GRID4_EMPOWERER" ;
      Grid3_empowerer_Internalname = sPrefix+"GRID3_EMPOWERER" ;
      Grid2_empowerer_Internalname = sPrefix+"GRID2_EMPOWERER" ;
      Grid1_empowerer_Internalname = sPrefix+"GRID1_EMPOWERER" ;
      divHtml_bottomauxiliarcontrols_Internalname = sPrefix+"HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = sPrefix+"LAYOUTMAINTABLE" ;
      Form.setInternalname( sPrefix+"FORM" );
      subGrid1_Internalname = sPrefix+"GRID1" ;
      subGrid2_Internalname = sPrefix+"GRID2" ;
      subGrid3_Internalname = sPrefix+"GRID3" ;
      subGrid4_Internalname = sPrefix+"GRID4" ;
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
      subGrid4_Allowcollapsing = (byte)(0) ;
      subGrid4_Allowselection = (byte)(0) ;
      subGrid4_Header = "" ;
      subGrid3_Allowcollapsing = (byte)(0) ;
      subGrid3_Allowhovering = (byte)(-1) ;
      subGrid3_Allowselection = (byte)(1) ;
      subGrid3_Header = "" ;
      subGrid2_Allowcollapsing = (byte)(0) ;
      subGrid2_Allowhovering = (byte)(-1) ;
      subGrid2_Allowselection = (byte)(1) ;
      subGrid2_Header = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowhovering = (byte)(-1) ;
      subGrid1_Allowselection = (byte)(1) ;
      subGrid1_Header = "" ;
      edtavOmrcpre_Jsonclick = "" ;
      edtavOmrcpre_Enabled = 0 ;
      edtavOmrccnt_Jsonclick = "" ;
      edtavOmrccnt_Enabled = 0 ;
      edtavOmrepnom_Jsonclick = "" ;
      edtavOmrepnom_Enabled = 0 ;
      edtavOmrepcod_Jsonclick = "" ;
      edtavOmrepcod_Enabled = 0 ;
      subGrid4_Class = "GridNoBorder WorkWith" ;
      subGrid4_Backcolorstyle = (byte)(0) ;
      edtavTmdscgrid_Jsonclick = "" ;
      edtavTmdscgrid_Enabled = 0 ;
      edtavTmcodgrid_Jsonclick = "" ;
      edtavTmcodgrid_Enabled = 0 ;
      subGrid3_Class = "GridNoBorder WorkWithSelection WorkWith" ;
      subGrid3_Backcolorstyle = (byte)(0) ;
      edtavOmmctiegrid_Jsonclick = "" ;
      edtavOmmctiegrid_Enabled = 0 ;
      edtavOmmcfingrid_Jsonclick = "" ;
      edtavOmmcfingrid_Enabled = 0 ;
      edtavOmmcinigrid_Jsonclick = "" ;
      edtavOmmcinigrid_Enabled = 0 ;
      edtavOmopenomgrid_Jsonclick = "" ;
      edtavOmopenomgrid_Enabled = 0 ;
      edtavOmopecodgrid_Jsonclick = "" ;
      edtavOmopecodgrid_Enabled = 0 ;
      subGrid2_Class = "GridNoBorder WorkWithSelection WorkWith" ;
      subGrid2_Backcolorstyle = (byte)(0) ;
      edtavMinutos_Jsonclick = "" ;
      edtavMinutos_Visible = 0 ;
      edtavMinutos_Enabled = 1 ;
      edtavMinrea_Jsonclick = "" ;
      edtavMinrea_Visible = 0 ;
      edtavMinrea_Enabled = 1 ;
      edtavHorreaint_Jsonclick = "" ;
      edtavHorreaint_Visible = 0 ;
      edtavHorreaint_Enabled = 1 ;
      edtavOmtxtgrid_Jsonclick = "" ;
      edtavOmtxtgrid_Visible = -1 ;
      edtavOmtxtgrid_Enabled = 1 ;
      edtavHhmmalfa_Jsonclick = "" ;
      edtavHhmmalfa_Visible = -1 ;
      edtavHhmmalfa_Enabled = 1 ;
      edtavOmmctie_Jsonclick = "" ;
      edtavOmmctie_Visible = -1 ;
      edtavOmmctie_Enabled = 1 ;
      edtavOmfchcergrid_Jsonclick = "" ;
      edtavOmfchcergrid_Visible = -1 ;
      edtavOmfchcergrid_Enabled = 1 ;
      edtavOmfchcre_Jsonclick = "" ;
      edtavOmfchcre_Visible = -1 ;
      edtavOmfchcre_Enabled = 1 ;
      edtavOmmaqdsc_Jsonclick = "" ;
      edtavOmmaqdsc_Visible = -1 ;
      edtavOmmaqdsc_Enabled = 1 ;
      edtavOmmaqcodgrid_Jsonclick = "" ;
      edtavOmmaqcodgrid_Visible = -1 ;
      edtavOmmaqcodgrid_Enabled = 1 ;
      edtavPmcodgrid_Jsonclick = "" ;
      edtavPmcodgrid_Visible = -1 ;
      edtavPmcodgrid_Enabled = 1 ;
      edtavOmcodgrid_Jsonclick = "" ;
      edtavOmcodgrid_Columnclass = "WWColumn" ;
      edtavOmcodgrid_Visible = -1 ;
      edtavOmcodgrid_Enabled = 1 ;
      subGrid1_Class = "GridNoBorder WorkWithSelection WorkWith" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtavOmcodgrid_Columnheaderclass = "" ;
      edtavEmprcod_Jsonclick = "" ;
      edtavEmprcod_Visible = 1 ;
      divTablerepuestos_Visible = 1 ;
      divTablerepuestos_Height = 0 ;
      divTabletarea_Height = 0 ;
      divTableoperario_Height = 0 ;
      divTableordensmanten_Height = 0 ;
      Grid1_empowerer_Infinitescrolling = "Grid" ;
      Grid2_empowerer_Infinitescrolling = "Grid" ;
      Grid3_empowerer_Infinitescrolling = "Grid" ;
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
      subGrid4_Rows = 0 ;
      subGrid3_Rows = 50 ;
      subGrid2_Rows = 50 ;
      subGrid1_Rows = 50 ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'AV40OMFchCer_to',fld:'vOMFCHCER_TO',pic:''},{av:'AV53OmOpeCod_to',fld:'vOMOPECOD_TO',pic:'ZZZZZ9'},{av:'AV36OmCod_to',fld:'vOMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV45OmMaqCod_to',fld:'vOMMAQCOD_TO',pic:''},{av:'A9445OMEst',fld:'OMEST',pic:''},{av:'A9439OMFchCer',fld:'OMFCHCER',pic:'99/99/99 99:99'},{av:'AV7Omcod',fld:'vOMCOD',pic:'ZZZZZZZ9'},{av:'AV39Omfchcer',fld:'vOMFCHCER',pic:''},{av:'A9429PMCod',fld:'PMCOD',pic:'ZZZZZZZ9'},{av:'AV60Preventivos',fld:'vPREVENTIVOS',pic:'9'},{av:'A9426OMMaqCod',fld:'OMMAQCOD',pic:''},{av:'AV44OmMaqCod',fld:'vOMMAQCOD',pic:''},{av:'AV8Omopecod',fld:'vOMOPECOD',pic:'ZZZZZ9'},{av:'A9427OMMaqDsc',fld:'OMMAQDSC',pic:''},{av:'A9436OMFchCre',fld:'OMFCHCRE',pic:'99/99/99 99:99'},{av:'A9433OMTxt',fld:'OMTXT',pic:''},{av:'GRID4_nFirstRecordOnPage'},{av:'GRID4_nEOF'},{av:'A9446OMRepCod',fld:'OMREPCOD',pic:'ZZZZZZZ9'},{av:'AV38OmCodGrid',fld:'vOMCODGRID',pic:'ZZZZZZZ9',hsh:true},{av:'A9447OMRepNom',fld:'OMREPNOM',pic:''},{av:'A9452OMRCCnt',fld:'OMRCCNT',pic:'ZZ,ZZZ,ZZ9.999'},{av:'A9453OMRCPre',fld:'OMRCPRE',pic:'ZZ,ZZZ,ZZ9.999'},{av:'GRID3_nFirstRecordOnPage'},{av:'GRID3_nEOF'},{av:'A9430TMCod',fld:'TMCOD',pic:'ZZZZZZZ9'},{av:'A9431TMDsc',fld:'TMDSC',pic:''},{av:'GRID2_nFirstRecordOnPage'},{av:'GRID2_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'subGrid2_Rows',ctrl:'GRID2',prop:'Rows'},{av:'subGrid3_Rows',ctrl:'GRID3',prop:'Rows'},{av:'subGrid4_Rows',ctrl:'GRID4',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9425OMCod',fld:'OMCOD',pic:'ZZZZZZZ9'},{av:'A9455OMOpeCod',fld:'OMOPECOD',pic:'ZZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV71OmCodSelected',fld:'vOMCODSELECTED',pic:'ZZZZZZZ9'},{av:'A9456OMOpeNom',fld:'OMOPENOM',pic:''},{av:'A9469OMMCFin',fld:'OMMCFIN',pic:'99/99/99 99:99'},{av:'A9468OMMCIni',fld:'OMMCINI',pic:'99/99/99 99:99'},{av:'sPrefix'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'edtavOmcodgrid_Columnheaderclass',ctrl:'vOMCODGRID',prop:'Columnheaderclass'}]}");
      setEventMetadata("GRID4.LOAD","{handler:'e201PV3',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9425OMCod',fld:'OMCOD',pic:'ZZZZZZZ9'},{av:'A9446OMRepCod',fld:'OMREPCOD',pic:'ZZZZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV38OmCodGrid',fld:'vOMCODGRID',pic:'ZZZZZZZ9',hsh:true},{av:'A9447OMRepNom',fld:'OMREPNOM',pic:''},{av:'A9452OMRCCnt',fld:'OMRCCNT',pic:'ZZ,ZZZ,ZZ9.999'},{av:'A9453OMRCPre',fld:'OMRCPRE',pic:'ZZ,ZZZ,ZZ9.999'}]");
      setEventMetadata("GRID4.LOAD",",oparms:[{av:'AV74OmRepNom',fld:'vOMREPNOM',pic:''},{av:'AV73OmRepCod',fld:'vOMREPCOD',pic:'ZZZZZZZ9'},{av:'AV75OmRcCnt',fld:'vOMRCCNT',pic:'ZZ,ZZZ,ZZ9.999'},{av:'AV76OmRcPre',fld:'vOMRCPRE',pic:'ZZZZZZZ9.999'}]}");
      setEventMetadata("GRID3.LOAD","{handler:'e191PV5',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9425OMCod',fld:'OMCOD',pic:'ZZZZZZZ9'},{av:'A9430TMCod',fld:'TMCOD',pic:'ZZZZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV71OmCodSelected',fld:'vOMCODSELECTED',pic:'ZZZZZZZ9'},{av:'A9431TMDsc',fld:'TMDSC',pic:''}]");
      setEventMetadata("GRID3.LOAD",",oparms:[{av:'AV64TmCodGrid',fld:'vTMCODGRID',pic:'ZZZZZZZ9'},{av:'AV65TmDscGrid',fld:'vTMDSCGRID',pic:''}]}");
      setEventMetadata("GRID2.LOAD","{handler:'e181PV7',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9425OMCod',fld:'OMCOD',pic:'ZZZZZZZ9'},{av:'A9455OMOpeCod',fld:'OMOPECOD',pic:'ZZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV71OmCodSelected',fld:'vOMCODSELECTED',pic:'ZZZZZZZ9'},{av:'A9456OMOpeNom',fld:'OMOPENOM',pic:''},{av:'A9469OMMCFin',fld:'OMMCFIN',pic:'99/99/99 99:99'},{av:'A9468OMMCIni',fld:'OMMCINI',pic:'99/99/99 99:99'}]");
      setEventMetadata("GRID2.LOAD",",oparms:[{av:'AV55OMOpeCodGrid',fld:'vOMOPECODGRID',pic:'ZZZZZ9'},{av:'AV56OmOpeNomGrid',fld:'vOMOPENOMGRID',pic:''},{av:'AV48OMMcFinGrid',fld:'vOMMCFINGRID',pic:'99/99/99 99:99'},{av:'AV49OmMcIniGrid',fld:'vOMMCINIGRID',pic:'99/99/99 99:99'},{av:'AV51OMMcTieGrid',fld:'vOMMCTIEGRID',pic:'ZZ,ZZZ,ZZ9.999'}]}");
      setEventMetadata("GRID1.LOAD","{handler:'e151PV2',iparms:[{av:'AV40OMFchCer_to',fld:'vOMFCHCER_TO',pic:''},{av:'AV53OmOpeCod_to',fld:'vOMOPECOD_TO',pic:'ZZZZZ9'},{av:'AV36OmCod_to',fld:'vOMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV45OmMaqCod_to',fld:'vOMMAQCOD_TO',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9445OMEst',fld:'OMEST',pic:''},{av:'A9439OMFchCer',fld:'OMFCHCER',pic:'99/99/99 99:99'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A9425OMCod',fld:'OMCOD',pic:'ZZZZZZZ9'},{av:'AV7Omcod',fld:'vOMCOD',pic:'ZZZZZZZ9'},{av:'AV39Omfchcer',fld:'vOMFCHCER',pic:''},{av:'A9429PMCod',fld:'PMCOD',pic:'ZZZZZZZ9'},{av:'AV60Preventivos',fld:'vPREVENTIVOS',pic:'9'},{av:'A9426OMMaqCod',fld:'OMMAQCOD',pic:''},{av:'AV44OmMaqCod',fld:'vOMMAQCOD',pic:''},{av:'A9455OMOpeCod',fld:'OMOPECOD',pic:'ZZZZZ9'},{av:'AV8Omopecod',fld:'vOMOPECOD',pic:'ZZZZZ9'},{av:'A9469OMMCFin',fld:'OMMCFIN',pic:'99/99/99 99:99'},{av:'A9468OMMCIni',fld:'OMMCINI',pic:'99/99/99 99:99'},{av:'A9427OMMaqDsc',fld:'OMMAQDSC',pic:''},{av:'A9436OMFchCre',fld:'OMFCHCRE',pic:'99/99/99 99:99'},{av:'A9433OMTxt',fld:'OMTXT',pic:''}]");
      setEventMetadata("GRID1.LOAD",",oparms:[{av:'AV41Omfchcer_to2',fld:'vOMFCHCER_TO2',pic:''},{av:'AV54Omopecod_to2',fld:'vOMOPECOD_TO2',pic:'ZZZZZ9'},{av:'AV37Omcod_to2',fld:'vOMCOD_TO2',pic:'ZZZZZZZ9'},{av:'AV46Ommaqcod_to2',fld:'vOMMAQCOD_TO2',pic:''},{av:'AV28HorReaint',fld:'vHORREAINT',pic:'ZZZ9'},{av:'AV34MinRea',fld:'vMINREA',pic:'ZZZ9'},{av:'AV26HHMMAlfa',fld:'vHHMMALFA',pic:''},{av:'AV38OmCodGrid',fld:'vOMCODGRID',pic:'ZZZZZZZ9',hsh:true},{av:'AV42OmFchCerGrid',fld:'vOMFCHCERGRID',pic:'99/99/99 99:99'},{av:'AV59PmCodGrid',fld:'vPMCODGRID',pic:'ZZZZZZZ9'},{av:'AV47OmMaqCodGrid',fld:'vOMMAQCODGRID',pic:''},{av:'AV83OMMaqDsc',fld:'vOMMAQDSC',pic:''},{av:'AV43OmFchCre',fld:'vOMFCHCRE',pic:'99/99/99 99:99'},{av:'AV57OMTxtGrid',fld:'vOMTXTGRID',pic:''},{av:'edtavOmcodgrid_Columnclass',ctrl:'vOMCODGRID',prop:'Columnclass'}]}");
      setEventMetadata("'DOEXCEL'","{handler:'e111PV2',iparms:[{av:'AV7Omcod',fld:'vOMCOD',pic:'ZZZZZZZ9'},{av:'AV36OmCod_to',fld:'vOMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV44OmMaqCod',fld:'vOMMAQCOD',pic:''},{av:'AV45OmMaqCod_to',fld:'vOMMAQCOD_TO',pic:''},{av:'AV8Omopecod',fld:'vOMOPECOD',pic:'ZZZZZ9'},{av:'AV53OmOpeCod_to',fld:'vOMOPECOD_TO',pic:'ZZZZZ9'},{av:'AV39Omfchcer',fld:'vOMFCHCER',pic:''},{av:'AV40OMFchCer_to',fld:'vOMFCHCER_TO',pic:''},{av:'AV60Preventivos',fld:'vPREVENTIVOS',pic:'9'}]");
      setEventMetadata("'DOEXCEL'",",oparms:[]}");
      setEventMetadata("'DOEXCEL_2'","{handler:'e121PV2',iparms:[{av:'AV7Omcod',fld:'vOMCOD',pic:'ZZZZZZZ9'},{av:'AV36OmCod_to',fld:'vOMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV44OmMaqCod',fld:'vOMMAQCOD',pic:''},{av:'AV45OmMaqCod_to',fld:'vOMMAQCOD_TO',pic:''},{av:'AV8Omopecod',fld:'vOMOPECOD',pic:'ZZZZZ9'},{av:'AV53OmOpeCod_to',fld:'vOMOPECOD_TO',pic:'ZZZZZ9'},{av:'AV39Omfchcer',fld:'vOMFCHCER',pic:''},{av:'AV40OMFchCer_to',fld:'vOMFCHCER_TO',pic:''},{av:'AV60Preventivos',fld:'vPREVENTIVOS',pic:'9'}]");
      setEventMetadata("'DOEXCEL_2'",",oparms:[]}");
      setEventMetadata("GRID1.ONLINEACTIVATE","{handler:'e171PV2',iparms:[{av:'GRID4_nFirstRecordOnPage'},{av:'GRID4_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'subGrid2_Rows',ctrl:'GRID2',prop:'Rows'},{av:'subGrid3_Rows',ctrl:'GRID3',prop:'Rows'},{av:'subGrid4_Rows',ctrl:'GRID4',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9425OMCod',fld:'OMCOD',pic:'ZZZZZZZ9'},{av:'A9446OMRepCod',fld:'OMREPCOD',pic:'ZZZZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV38OmCodGrid',fld:'vOMCODGRID',pic:'ZZZZZZZ9',hsh:true},{av:'A9447OMRepNom',fld:'OMREPNOM',pic:''},{av:'A9452OMRCCnt',fld:'OMRCCNT',pic:'ZZ,ZZZ,ZZ9.999'},{av:'A9453OMRCPre',fld:'OMRCPRE',pic:'ZZ,ZZZ,ZZ9.999'},{av:'sPrefix'},{av:'GRID3_nFirstRecordOnPage'},{av:'GRID3_nEOF'},{av:'A9430TMCod',fld:'TMCOD',pic:'ZZZZZZZ9'},{av:'AV71OmCodSelected',fld:'vOMCODSELECTED',pic:'ZZZZZZZ9'},{av:'A9431TMDsc',fld:'TMDSC',pic:''},{av:'GRID2_nFirstRecordOnPage'},{av:'GRID2_nEOF'},{av:'A9455OMOpeCod',fld:'OMOPECOD',pic:'ZZZZZ9'},{av:'A9456OMOpeNom',fld:'OMOPENOM',pic:''},{av:'A9469OMMCFin',fld:'OMMCFIN',pic:'99/99/99 99:99'},{av:'A9468OMMCIni',fld:'OMMCINI',pic:'99/99/99 99:99'},{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'AV40OMFchCer_to',fld:'vOMFCHCER_TO',pic:''},{av:'AV53OmOpeCod_to',fld:'vOMOPECOD_TO',pic:'ZZZZZ9'},{av:'AV36OmCod_to',fld:'vOMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV45OmMaqCod_to',fld:'vOMMAQCOD_TO',pic:''},{av:'A9445OMEst',fld:'OMEST',pic:''},{av:'A9439OMFchCer',fld:'OMFCHCER',pic:'99/99/99 99:99'},{av:'AV7Omcod',fld:'vOMCOD',pic:'ZZZZZZZ9'},{av:'AV39Omfchcer',fld:'vOMFCHCER',pic:''},{av:'A9429PMCod',fld:'PMCOD',pic:'ZZZZZZZ9'},{av:'AV60Preventivos',fld:'vPREVENTIVOS',pic:'9'},{av:'A9426OMMaqCod',fld:'OMMAQCOD',pic:''},{av:'AV44OmMaqCod',fld:'vOMMAQCOD',pic:''},{av:'AV8Omopecod',fld:'vOMOPECOD',pic:'ZZZZZ9'},{av:'A9427OMMaqDsc',fld:'OMMAQDSC',pic:''},{av:'A9436OMFchCre',fld:'OMFCHCRE',pic:'99/99/99 99:99'},{av:'A9433OMTxt',fld:'OMTXT',pic:''}]");
      setEventMetadata("GRID1.ONLINEACTIVATE",",oparms:[{av:'divTablerepuestos_Visible',ctrl:'TABLEREPUESTOS',prop:'Visible'},{av:'AV71OmCodSelected',fld:'vOMCODSELECTED',pic:'ZZZZZZZ9'},{av:'edtavOmcodgrid_Columnheaderclass',ctrl:'vOMCODGRID',prop:'Columnheaderclass'}]}");
      setEventMetadata("VOMCODGRID.CLICK","{handler:'e161PV2',iparms:[{av:'GRID4_nFirstRecordOnPage'},{av:'GRID4_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'subGrid2_Rows',ctrl:'GRID2',prop:'Rows'},{av:'subGrid3_Rows',ctrl:'GRID3',prop:'Rows'},{av:'subGrid4_Rows',ctrl:'GRID4',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9425OMCod',fld:'OMCOD',pic:'ZZZZZZZ9'},{av:'A9446OMRepCod',fld:'OMREPCOD',pic:'ZZZZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV38OmCodGrid',fld:'vOMCODGRID',pic:'ZZZZZZZ9',hsh:true},{av:'A9447OMRepNom',fld:'OMREPNOM',pic:''},{av:'A9452OMRCCnt',fld:'OMRCCNT',pic:'ZZ,ZZZ,ZZ9.999'},{av:'A9453OMRCPre',fld:'OMRCPRE',pic:'ZZ,ZZZ,ZZ9.999'},{av:'sPrefix'},{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'AV40OMFchCer_to',fld:'vOMFCHCER_TO',pic:''},{av:'AV53OmOpeCod_to',fld:'vOMOPECOD_TO',pic:'ZZZZZ9'},{av:'AV36OmCod_to',fld:'vOMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV45OmMaqCod_to',fld:'vOMMAQCOD_TO',pic:''},{av:'A9445OMEst',fld:'OMEST',pic:''},{av:'A9439OMFchCer',fld:'OMFCHCER',pic:'99/99/99 99:99'},{av:'AV7Omcod',fld:'vOMCOD',pic:'ZZZZZZZ9'},{av:'AV39Omfchcer',fld:'vOMFCHCER',pic:''},{av:'A9429PMCod',fld:'PMCOD',pic:'ZZZZZZZ9'},{av:'AV60Preventivos',fld:'vPREVENTIVOS',pic:'9'},{av:'A9426OMMaqCod',fld:'OMMAQCOD',pic:''},{av:'AV44OmMaqCod',fld:'vOMMAQCOD',pic:''},{av:'AV8Omopecod',fld:'vOMOPECOD',pic:'ZZZZZ9'},{av:'A9427OMMaqDsc',fld:'OMMAQDSC',pic:''},{av:'A9436OMFchCre',fld:'OMFCHCRE',pic:'99/99/99 99:99'},{av:'A9433OMTxt',fld:'OMTXT',pic:''},{av:'GRID3_nFirstRecordOnPage'},{av:'GRID3_nEOF'},{av:'A9430TMCod',fld:'TMCOD',pic:'ZZZZZZZ9'},{av:'A9431TMDsc',fld:'TMDSC',pic:''},{av:'GRID2_nFirstRecordOnPage'},{av:'GRID2_nEOF'},{av:'A9455OMOpeCod',fld:'OMOPECOD',pic:'ZZZZZ9'},{av:'AV71OmCodSelected',fld:'vOMCODSELECTED',pic:'ZZZZZZZ9'},{av:'A9456OMOpeNom',fld:'OMOPENOM',pic:''},{av:'A9469OMMCFin',fld:'OMMCFIN',pic:'99/99/99 99:99'},{av:'A9468OMMCIni',fld:'OMMCINI',pic:'99/99/99 99:99'}]");
      setEventMetadata("VOMCODGRID.CLICK",",oparms:[{av:'divTablerepuestos_Visible',ctrl:'TABLEREPUESTOS',prop:'Visible'},{av:'edtavOmcodgrid_Columnheaderclass',ctrl:'vOMCODGRID',prop:'Columnheaderclass'}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'subGrid2_Rows',ctrl:'GRID2',prop:'Rows'},{av:'subGrid3_Rows',ctrl:'GRID3',prop:'Rows'},{av:'subGrid4_Rows',ctrl:'GRID4',prop:'Rows'},{av:'AV40OMFchCer_to',fld:'vOMFCHCER_TO',pic:''},{av:'AV53OmOpeCod_to',fld:'vOMOPECOD_TO',pic:'ZZZZZ9'},{av:'AV36OmCod_to',fld:'vOMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV45OmMaqCod_to',fld:'vOMMAQCOD_TO',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9445OMEst',fld:'OMEST',pic:''},{av:'A9439OMFchCer',fld:'OMFCHCER',pic:'99/99/99 99:99'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A9425OMCod',fld:'OMCOD',pic:'ZZZZZZZ9'},{av:'AV7Omcod',fld:'vOMCOD',pic:'ZZZZZZZ9'},{av:'AV39Omfchcer',fld:'vOMFCHCER',pic:''},{av:'A9429PMCod',fld:'PMCOD',pic:'ZZZZZZZ9'},{av:'AV60Preventivos',fld:'vPREVENTIVOS',pic:'9'},{av:'A9426OMMaqCod',fld:'OMMAQCOD',pic:''},{av:'AV44OmMaqCod',fld:'vOMMAQCOD',pic:''},{av:'A9455OMOpeCod',fld:'OMOPECOD',pic:'ZZZZZ9'},{av:'AV8Omopecod',fld:'vOMOPECOD',pic:'ZZZZZ9'},{av:'A9469OMMCFin',fld:'OMMCFIN',pic:'99/99/99 99:99'},{av:'A9468OMMCIni',fld:'OMMCINI',pic:'99/99/99 99:99'},{av:'A9427OMMaqDsc',fld:'OMMAQDSC',pic:''},{av:'A9436OMFchCre',fld:'OMFCHCRE',pic:'99/99/99 99:99'},{av:'A9433OMTxt',fld:'OMTXT',pic:''},{av:'sPrefix'}]");
      setEventMetadata("GRID1_FIRSTPAGE",",oparms:[{av:'edtavOmcodgrid_Columnheaderclass',ctrl:'vOMCODGRID',prop:'Columnheaderclass'}]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'subGrid2_Rows',ctrl:'GRID2',prop:'Rows'},{av:'subGrid3_Rows',ctrl:'GRID3',prop:'Rows'},{av:'subGrid4_Rows',ctrl:'GRID4',prop:'Rows'},{av:'AV40OMFchCer_to',fld:'vOMFCHCER_TO',pic:''},{av:'AV53OmOpeCod_to',fld:'vOMOPECOD_TO',pic:'ZZZZZ9'},{av:'AV36OmCod_to',fld:'vOMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV45OmMaqCod_to',fld:'vOMMAQCOD_TO',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9445OMEst',fld:'OMEST',pic:''},{av:'A9439OMFchCer',fld:'OMFCHCER',pic:'99/99/99 99:99'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A9425OMCod',fld:'OMCOD',pic:'ZZZZZZZ9'},{av:'AV7Omcod',fld:'vOMCOD',pic:'ZZZZZZZ9'},{av:'AV39Omfchcer',fld:'vOMFCHCER',pic:''},{av:'A9429PMCod',fld:'PMCOD',pic:'ZZZZZZZ9'},{av:'AV60Preventivos',fld:'vPREVENTIVOS',pic:'9'},{av:'A9426OMMaqCod',fld:'OMMAQCOD',pic:''},{av:'AV44OmMaqCod',fld:'vOMMAQCOD',pic:''},{av:'A9455OMOpeCod',fld:'OMOPECOD',pic:'ZZZZZ9'},{av:'AV8Omopecod',fld:'vOMOPECOD',pic:'ZZZZZ9'},{av:'A9469OMMCFin',fld:'OMMCFIN',pic:'99/99/99 99:99'},{av:'A9468OMMCIni',fld:'OMMCINI',pic:'99/99/99 99:99'},{av:'A9427OMMaqDsc',fld:'OMMAQDSC',pic:''},{av:'A9436OMFchCre',fld:'OMFCHCRE',pic:'99/99/99 99:99'},{av:'A9433OMTxt',fld:'OMTXT',pic:''},{av:'sPrefix'}]");
      setEventMetadata("GRID1_PREVPAGE",",oparms:[{av:'edtavOmcodgrid_Columnheaderclass',ctrl:'vOMCODGRID',prop:'Columnheaderclass'}]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'subGrid2_Rows',ctrl:'GRID2',prop:'Rows'},{av:'subGrid3_Rows',ctrl:'GRID3',prop:'Rows'},{av:'subGrid4_Rows',ctrl:'GRID4',prop:'Rows'},{av:'AV40OMFchCer_to',fld:'vOMFCHCER_TO',pic:''},{av:'AV53OmOpeCod_to',fld:'vOMOPECOD_TO',pic:'ZZZZZ9'},{av:'AV36OmCod_to',fld:'vOMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV45OmMaqCod_to',fld:'vOMMAQCOD_TO',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9445OMEst',fld:'OMEST',pic:''},{av:'A9439OMFchCer',fld:'OMFCHCER',pic:'99/99/99 99:99'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A9425OMCod',fld:'OMCOD',pic:'ZZZZZZZ9'},{av:'AV7Omcod',fld:'vOMCOD',pic:'ZZZZZZZ9'},{av:'AV39Omfchcer',fld:'vOMFCHCER',pic:''},{av:'A9429PMCod',fld:'PMCOD',pic:'ZZZZZZZ9'},{av:'AV60Preventivos',fld:'vPREVENTIVOS',pic:'9'},{av:'A9426OMMaqCod',fld:'OMMAQCOD',pic:''},{av:'AV44OmMaqCod',fld:'vOMMAQCOD',pic:''},{av:'A9455OMOpeCod',fld:'OMOPECOD',pic:'ZZZZZ9'},{av:'AV8Omopecod',fld:'vOMOPECOD',pic:'ZZZZZ9'},{av:'A9469OMMCFin',fld:'OMMCFIN',pic:'99/99/99 99:99'},{av:'A9468OMMCIni',fld:'OMMCINI',pic:'99/99/99 99:99'},{av:'A9427OMMaqDsc',fld:'OMMAQDSC',pic:''},{av:'A9436OMFchCre',fld:'OMFCHCRE',pic:'99/99/99 99:99'},{av:'A9433OMTxt',fld:'OMTXT',pic:''},{av:'sPrefix'}]");
      setEventMetadata("GRID1_NEXTPAGE",",oparms:[{av:'edtavOmcodgrid_Columnheaderclass',ctrl:'vOMCODGRID',prop:'Columnheaderclass'}]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'subGrid2_Rows',ctrl:'GRID2',prop:'Rows'},{av:'subGrid3_Rows',ctrl:'GRID3',prop:'Rows'},{av:'subGrid4_Rows',ctrl:'GRID4',prop:'Rows'},{av:'AV40OMFchCer_to',fld:'vOMFCHCER_TO',pic:''},{av:'AV53OmOpeCod_to',fld:'vOMOPECOD_TO',pic:'ZZZZZ9'},{av:'AV36OmCod_to',fld:'vOMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV45OmMaqCod_to',fld:'vOMMAQCOD_TO',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9445OMEst',fld:'OMEST',pic:''},{av:'A9439OMFchCer',fld:'OMFCHCER',pic:'99/99/99 99:99'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A9425OMCod',fld:'OMCOD',pic:'ZZZZZZZ9'},{av:'AV7Omcod',fld:'vOMCOD',pic:'ZZZZZZZ9'},{av:'AV39Omfchcer',fld:'vOMFCHCER',pic:''},{av:'A9429PMCod',fld:'PMCOD',pic:'ZZZZZZZ9'},{av:'AV60Preventivos',fld:'vPREVENTIVOS',pic:'9'},{av:'A9426OMMaqCod',fld:'OMMAQCOD',pic:''},{av:'AV44OmMaqCod',fld:'vOMMAQCOD',pic:''},{av:'A9455OMOpeCod',fld:'OMOPECOD',pic:'ZZZZZ9'},{av:'AV8Omopecod',fld:'vOMOPECOD',pic:'ZZZZZ9'},{av:'A9469OMMCFin',fld:'OMMCFIN',pic:'99/99/99 99:99'},{av:'A9468OMMCIni',fld:'OMMCINI',pic:'99/99/99 99:99'},{av:'A9427OMMaqDsc',fld:'OMMAQDSC',pic:''},{av:'A9436OMFchCre',fld:'OMFCHCRE',pic:'99/99/99 99:99'},{av:'A9433OMTxt',fld:'OMTXT',pic:''},{av:'sPrefix'}]");
      setEventMetadata("GRID1_LASTPAGE",",oparms:[{av:'edtavOmcodgrid_Columnheaderclass',ctrl:'vOMCODGRID',prop:'Columnheaderclass'}]}");
      setEventMetadata("GRID4_FIRSTPAGE","{handler:'subgrid4_firstpage',iparms:[{av:'GRID4_nFirstRecordOnPage'},{av:'GRID4_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'subGrid2_Rows',ctrl:'GRID2',prop:'Rows'},{av:'subGrid3_Rows',ctrl:'GRID3',prop:'Rows'},{av:'subGrid4_Rows',ctrl:'GRID4',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9425OMCod',fld:'OMCOD',pic:'ZZZZZZZ9'},{av:'A9446OMRepCod',fld:'OMREPCOD',pic:'ZZZZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV38OmCodGrid',fld:'vOMCODGRID',pic:'ZZZZZZZ9',hsh:true},{av:'A9447OMRepNom',fld:'OMREPNOM',pic:''},{av:'A9452OMRCCnt',fld:'OMRCCNT',pic:'ZZ,ZZZ,ZZ9.999'},{av:'A9453OMRCPre',fld:'OMRCPRE',pic:'ZZ,ZZZ,ZZ9.999'},{av:'sPrefix'}]");
      setEventMetadata("GRID4_FIRSTPAGE",",oparms:[{av:'edtavOmcodgrid_Columnheaderclass',ctrl:'vOMCODGRID',prop:'Columnheaderclass'}]}");
      setEventMetadata("GRID4_PREVPAGE","{handler:'subgrid4_previouspage',iparms:[{av:'GRID4_nFirstRecordOnPage'},{av:'GRID4_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'subGrid2_Rows',ctrl:'GRID2',prop:'Rows'},{av:'subGrid3_Rows',ctrl:'GRID3',prop:'Rows'},{av:'subGrid4_Rows',ctrl:'GRID4',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9425OMCod',fld:'OMCOD',pic:'ZZZZZZZ9'},{av:'A9446OMRepCod',fld:'OMREPCOD',pic:'ZZZZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV38OmCodGrid',fld:'vOMCODGRID',pic:'ZZZZZZZ9',hsh:true},{av:'A9447OMRepNom',fld:'OMREPNOM',pic:''},{av:'A9452OMRCCnt',fld:'OMRCCNT',pic:'ZZ,ZZZ,ZZ9.999'},{av:'A9453OMRCPre',fld:'OMRCPRE',pic:'ZZ,ZZZ,ZZ9.999'},{av:'sPrefix'}]");
      setEventMetadata("GRID4_PREVPAGE",",oparms:[{av:'edtavOmcodgrid_Columnheaderclass',ctrl:'vOMCODGRID',prop:'Columnheaderclass'}]}");
      setEventMetadata("GRID4_NEXTPAGE","{handler:'subgrid4_nextpage',iparms:[{av:'GRID4_nFirstRecordOnPage'},{av:'GRID4_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'subGrid2_Rows',ctrl:'GRID2',prop:'Rows'},{av:'subGrid3_Rows',ctrl:'GRID3',prop:'Rows'},{av:'subGrid4_Rows',ctrl:'GRID4',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9425OMCod',fld:'OMCOD',pic:'ZZZZZZZ9'},{av:'A9446OMRepCod',fld:'OMREPCOD',pic:'ZZZZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV38OmCodGrid',fld:'vOMCODGRID',pic:'ZZZZZZZ9',hsh:true},{av:'A9447OMRepNom',fld:'OMREPNOM',pic:''},{av:'A9452OMRCCnt',fld:'OMRCCNT',pic:'ZZ,ZZZ,ZZ9.999'},{av:'A9453OMRCPre',fld:'OMRCPRE',pic:'ZZ,ZZZ,ZZ9.999'},{av:'sPrefix'}]");
      setEventMetadata("GRID4_NEXTPAGE",",oparms:[{av:'edtavOmcodgrid_Columnheaderclass',ctrl:'vOMCODGRID',prop:'Columnheaderclass'}]}");
      setEventMetadata("GRID4_LASTPAGE","{handler:'subgrid4_lastpage',iparms:[{av:'GRID4_nFirstRecordOnPage'},{av:'GRID4_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'subGrid2_Rows',ctrl:'GRID2',prop:'Rows'},{av:'subGrid3_Rows',ctrl:'GRID3',prop:'Rows'},{av:'subGrid4_Rows',ctrl:'GRID4',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9425OMCod',fld:'OMCOD',pic:'ZZZZZZZ9'},{av:'A9446OMRepCod',fld:'OMREPCOD',pic:'ZZZZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV38OmCodGrid',fld:'vOMCODGRID',pic:'ZZZZZZZ9',hsh:true},{av:'A9447OMRepNom',fld:'OMREPNOM',pic:''},{av:'A9452OMRCCnt',fld:'OMRCCNT',pic:'ZZ,ZZZ,ZZ9.999'},{av:'A9453OMRCPre',fld:'OMRCPRE',pic:'ZZ,ZZZ,ZZ9.999'},{av:'sPrefix'}]");
      setEventMetadata("GRID4_LASTPAGE",",oparms:[{av:'edtavOmcodgrid_Columnheaderclass',ctrl:'vOMCODGRID',prop:'Columnheaderclass'}]}");
      setEventMetadata("GRID3_FIRSTPAGE","{handler:'subgrid3_firstpage',iparms:[{av:'GRID3_nFirstRecordOnPage'},{av:'GRID3_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'subGrid2_Rows',ctrl:'GRID2',prop:'Rows'},{av:'subGrid3_Rows',ctrl:'GRID3',prop:'Rows'},{av:'subGrid4_Rows',ctrl:'GRID4',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9425OMCod',fld:'OMCOD',pic:'ZZZZZZZ9'},{av:'A9430TMCod',fld:'TMCOD',pic:'ZZZZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV71OmCodSelected',fld:'vOMCODSELECTED',pic:'ZZZZZZZ9'},{av:'A9431TMDsc',fld:'TMDSC',pic:''},{av:'sPrefix'}]");
      setEventMetadata("GRID3_FIRSTPAGE",",oparms:[{av:'edtavOmcodgrid_Columnheaderclass',ctrl:'vOMCODGRID',prop:'Columnheaderclass'}]}");
      setEventMetadata("GRID3_PREVPAGE","{handler:'subgrid3_previouspage',iparms:[{av:'GRID3_nFirstRecordOnPage'},{av:'GRID3_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'subGrid2_Rows',ctrl:'GRID2',prop:'Rows'},{av:'subGrid3_Rows',ctrl:'GRID3',prop:'Rows'},{av:'subGrid4_Rows',ctrl:'GRID4',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9425OMCod',fld:'OMCOD',pic:'ZZZZZZZ9'},{av:'A9430TMCod',fld:'TMCOD',pic:'ZZZZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV71OmCodSelected',fld:'vOMCODSELECTED',pic:'ZZZZZZZ9'},{av:'A9431TMDsc',fld:'TMDSC',pic:''},{av:'sPrefix'}]");
      setEventMetadata("GRID3_PREVPAGE",",oparms:[{av:'edtavOmcodgrid_Columnheaderclass',ctrl:'vOMCODGRID',prop:'Columnheaderclass'}]}");
      setEventMetadata("GRID3_NEXTPAGE","{handler:'subgrid3_nextpage',iparms:[{av:'GRID3_nFirstRecordOnPage'},{av:'GRID3_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'subGrid2_Rows',ctrl:'GRID2',prop:'Rows'},{av:'subGrid3_Rows',ctrl:'GRID3',prop:'Rows'},{av:'subGrid4_Rows',ctrl:'GRID4',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9425OMCod',fld:'OMCOD',pic:'ZZZZZZZ9'},{av:'A9430TMCod',fld:'TMCOD',pic:'ZZZZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV71OmCodSelected',fld:'vOMCODSELECTED',pic:'ZZZZZZZ9'},{av:'A9431TMDsc',fld:'TMDSC',pic:''},{av:'sPrefix'}]");
      setEventMetadata("GRID3_NEXTPAGE",",oparms:[{av:'edtavOmcodgrid_Columnheaderclass',ctrl:'vOMCODGRID',prop:'Columnheaderclass'}]}");
      setEventMetadata("GRID3_LASTPAGE","{handler:'subgrid3_lastpage',iparms:[{av:'GRID3_nFirstRecordOnPage'},{av:'GRID3_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'subGrid2_Rows',ctrl:'GRID2',prop:'Rows'},{av:'subGrid3_Rows',ctrl:'GRID3',prop:'Rows'},{av:'subGrid4_Rows',ctrl:'GRID4',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9425OMCod',fld:'OMCOD',pic:'ZZZZZZZ9'},{av:'A9430TMCod',fld:'TMCOD',pic:'ZZZZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV71OmCodSelected',fld:'vOMCODSELECTED',pic:'ZZZZZZZ9'},{av:'A9431TMDsc',fld:'TMDSC',pic:''},{av:'sPrefix'}]");
      setEventMetadata("GRID3_LASTPAGE",",oparms:[{av:'edtavOmcodgrid_Columnheaderclass',ctrl:'vOMCODGRID',prop:'Columnheaderclass'}]}");
      setEventMetadata("GRID2_FIRSTPAGE","{handler:'subgrid2_firstpage',iparms:[{av:'GRID2_nFirstRecordOnPage'},{av:'GRID2_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'subGrid2_Rows',ctrl:'GRID2',prop:'Rows'},{av:'subGrid3_Rows',ctrl:'GRID3',prop:'Rows'},{av:'subGrid4_Rows',ctrl:'GRID4',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9425OMCod',fld:'OMCOD',pic:'ZZZZZZZ9'},{av:'A9455OMOpeCod',fld:'OMOPECOD',pic:'ZZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV71OmCodSelected',fld:'vOMCODSELECTED',pic:'ZZZZZZZ9'},{av:'A9456OMOpeNom',fld:'OMOPENOM',pic:''},{av:'A9469OMMCFin',fld:'OMMCFIN',pic:'99/99/99 99:99'},{av:'A9468OMMCIni',fld:'OMMCINI',pic:'99/99/99 99:99'},{av:'sPrefix'}]");
      setEventMetadata("GRID2_FIRSTPAGE",",oparms:[{av:'edtavOmcodgrid_Columnheaderclass',ctrl:'vOMCODGRID',prop:'Columnheaderclass'}]}");
      setEventMetadata("GRID2_PREVPAGE","{handler:'subgrid2_previouspage',iparms:[{av:'GRID2_nFirstRecordOnPage'},{av:'GRID2_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'subGrid2_Rows',ctrl:'GRID2',prop:'Rows'},{av:'subGrid3_Rows',ctrl:'GRID3',prop:'Rows'},{av:'subGrid4_Rows',ctrl:'GRID4',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9425OMCod',fld:'OMCOD',pic:'ZZZZZZZ9'},{av:'A9455OMOpeCod',fld:'OMOPECOD',pic:'ZZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV71OmCodSelected',fld:'vOMCODSELECTED',pic:'ZZZZZZZ9'},{av:'A9456OMOpeNom',fld:'OMOPENOM',pic:''},{av:'A9469OMMCFin',fld:'OMMCFIN',pic:'99/99/99 99:99'},{av:'A9468OMMCIni',fld:'OMMCINI',pic:'99/99/99 99:99'},{av:'sPrefix'}]");
      setEventMetadata("GRID2_PREVPAGE",",oparms:[{av:'edtavOmcodgrid_Columnheaderclass',ctrl:'vOMCODGRID',prop:'Columnheaderclass'}]}");
      setEventMetadata("GRID2_NEXTPAGE","{handler:'subgrid2_nextpage',iparms:[{av:'GRID2_nFirstRecordOnPage'},{av:'GRID2_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'subGrid2_Rows',ctrl:'GRID2',prop:'Rows'},{av:'subGrid3_Rows',ctrl:'GRID3',prop:'Rows'},{av:'subGrid4_Rows',ctrl:'GRID4',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9425OMCod',fld:'OMCOD',pic:'ZZZZZZZ9'},{av:'A9455OMOpeCod',fld:'OMOPECOD',pic:'ZZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV71OmCodSelected',fld:'vOMCODSELECTED',pic:'ZZZZZZZ9'},{av:'A9456OMOpeNom',fld:'OMOPENOM',pic:''},{av:'A9469OMMCFin',fld:'OMMCFIN',pic:'99/99/99 99:99'},{av:'A9468OMMCIni',fld:'OMMCINI',pic:'99/99/99 99:99'},{av:'sPrefix'}]");
      setEventMetadata("GRID2_NEXTPAGE",",oparms:[{av:'edtavOmcodgrid_Columnheaderclass',ctrl:'vOMCODGRID',prop:'Columnheaderclass'}]}");
      setEventMetadata("GRID2_LASTPAGE","{handler:'subgrid2_lastpage',iparms:[{av:'GRID2_nFirstRecordOnPage'},{av:'GRID2_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'subGrid2_Rows',ctrl:'GRID2',prop:'Rows'},{av:'subGrid3_Rows',ctrl:'GRID3',prop:'Rows'},{av:'subGrid4_Rows',ctrl:'GRID4',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9425OMCod',fld:'OMCOD',pic:'ZZZZZZZ9'},{av:'A9455OMOpeCod',fld:'OMOPECOD',pic:'ZZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV71OmCodSelected',fld:'vOMCODSELECTED',pic:'ZZZZZZZ9'},{av:'A9456OMOpeNom',fld:'OMOPENOM',pic:''},{av:'A9469OMMCFin',fld:'OMMCFIN',pic:'99/99/99 99:99'},{av:'A9468OMMCIni',fld:'OMMCINI',pic:'99/99/99 99:99'},{av:'sPrefix'}]");
      setEventMetadata("GRID2_LASTPAGE",",oparms:[{av:'edtavOmcodgrid_Columnheaderclass',ctrl:'vOMCODGRID',prop:'Columnheaderclass'}]}");
      setEventMetadata("VALIDV_EMPRCOD","{handler:'validv_Emprcod',iparms:[]");
      setEventMetadata("VALIDV_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALIDV_OMCODGRID","{handler:'validv_Omcodgrid',iparms:[]");
      setEventMetadata("VALIDV_OMCODGRID",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Minutos',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Ommctiegrid',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Tmdscgrid',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Omrcpre',iparms:[]");
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
      wcpOAV44OmMaqCod = "" ;
      wcpOAV45OmMaqCod_to = "" ;
      wcpOAV39Omfchcer = GXutil.nullDate() ;
      wcpOAV40OMFchCer_to = GXutil.nullDate() ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV44OmMaqCod = "" ;
      AV45OmMaqCod_to = "" ;
      AV39Omfchcer = GXutil.nullDate() ;
      AV40OMFchCer_to = GXutil.nullDate() ;
      A396EmprCod = "" ;
      A9445OMEst = "" ;
      A9439OMFchCer = GXutil.resetTime( GXutil.nullDate() );
      AV5EmprCod = "" ;
      A9426OMMaqCod = "" ;
      A9469OMMCFin = GXutil.resetTime( GXutil.nullDate() );
      A9468OMMCIni = GXutil.resetTime( GXutil.nullDate() );
      A9427OMMaqDsc = "" ;
      A9436OMFchCre = GXutil.resetTime( GXutil.nullDate() );
      A9433OMTxt = "" ;
      A9456OMOpeNom = "" ;
      A9431TMDsc = "" ;
      A9447OMRepNom = "" ;
      A9452OMRCCnt = DecimalUtil.ZERO ;
      A9453OMRCPre = DecimalUtil.ZERO ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      Grid4_empowerer_Gridinternalname = "" ;
      Grid3_empowerer_Gridinternalname = "" ;
      Grid2_empowerer_Gridinternalname = "" ;
      Grid1_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      bttBtnexcel_Jsonclick = "" ;
      bttBtnexcel_2_Jsonclick = "" ;
      lblTextblock_resultado1_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      lblTextblock_resultado2_Jsonclick = "" ;
      Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      lblTextblock_resultado3_Jsonclick = "" ;
      Grid3Container = new com.genexus.webpanels.GXWebGrid(context);
      lblTextblock_repuestos_Jsonclick = "" ;
      Grid4Container = new com.genexus.webpanels.GXWebGrid(context);
      ucGrid4_empowerer = new com.genexus.webpanels.GXUserControl();
      ucGrid3_empowerer = new com.genexus.webpanels.GXUserControl();
      ucGrid2_empowerer = new com.genexus.webpanels.GXUserControl();
      ucGrid1_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV47OmMaqCodGrid = "" ;
      AV83OMMaqDsc = "" ;
      AV43OmFchCre = GXutil.resetTime( GXutil.nullDate() );
      AV42OmFchCerGrid = GXutil.resetTime( GXutil.nullDate() );
      AV50OmMcTie = GXutil.resetTime( GXutil.nullDate() );
      AV26HHMMAlfa = "" ;
      AV57OMTxtGrid = "" ;
      AV56OmOpeNomGrid = "" ;
      AV49OmMcIniGrid = GXutil.resetTime( GXutil.nullDate() );
      AV48OMMcFinGrid = GXutil.resetTime( GXutil.nullDate() );
      AV51OMMcTieGrid = DecimalUtil.ZERO ;
      AV65TmDscGrid = "" ;
      AV74OmRepNom = "" ;
      AV75OmRcCnt = DecimalUtil.ZERO ;
      AV76OmRcPre = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      AV9Station = "" ;
      AV6EmprNom = "" ;
      AV10UsurCod = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV69WebSession = httpContext.getWebSession();
      AV61ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      AV41Omfchcer_to2 = GXutil.nullDate() ;
      AV46Ommaqcod_to2 = "" ;
      scmdbuf = "" ;
      H01PV2_A396EmprCod = new String[] {""} ;
      H01PV2_A9425OMCod = new int[1] ;
      H01PV2_A9426OMMaqCod = new String[] {""} ;
      H01PV2_A9429PMCod = new int[1] ;
      H01PV2_n9429PMCod = new boolean[] {false} ;
      H01PV2_A9439OMFchCer = new java.util.Date[] {GXutil.nullDate()} ;
      H01PV2_A9445OMEst = new String[] {""} ;
      H01PV2_A9427OMMaqDsc = new String[] {""} ;
      H01PV2_n9427OMMaqDsc = new boolean[] {false} ;
      H01PV2_A9436OMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      H01PV2_A9433OMTxt = new String[] {""} ;
      AV52OmMcTiem = DecimalUtil.ZERO ;
      H01PV3_A9458OMMTpo = new String[] {""} ;
      H01PV3_A9466OMMCLin = new short[1] ;
      H01PV3_A396EmprCod = new String[] {""} ;
      H01PV3_A9425OMCod = new int[1] ;
      H01PV3_A9455OMOpeCod = new int[1] ;
      H01PV3_A9468OMMCIni = new java.util.Date[] {GXutil.nullDate()} ;
      H01PV3_A9469OMMCFin = new java.util.Date[] {GXutil.nullDate()} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      AV82ExcelFilename = "" ;
      AV81ErrorMessage = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      Grid4Row = new com.genexus.webpanels.GXWebRow();
      H01PV4_A9449OMRTpo = new String[] {""} ;
      H01PV4_A9425OMCod = new int[1] ;
      H01PV4_A396EmprCod = new String[] {""} ;
      H01PV4_A9447OMRepNom = new String[] {""} ;
      H01PV4_n9447OMRepNom = new boolean[] {false} ;
      H01PV4_A9452OMRCCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01PV4_A9453OMRCPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01PV4_A9446OMRepCod = new int[1] ;
      H01PV5_A9425OMCod = new int[1] ;
      H01PV5_A396EmprCod = new String[] {""} ;
      H01PV5_A9431TMDsc = new String[] {""} ;
      H01PV5_n9431TMDsc = new boolean[] {false} ;
      H01PV5_A9430TMCod = new int[1] ;
      Grid3Row = new com.genexus.webpanels.GXWebRow();
      H01PV6_A9458OMMTpo = new String[] {""} ;
      H01PV6_A9466OMMCLin = new short[1] ;
      H01PV6_A9425OMCod = new int[1] ;
      H01PV6_A396EmprCod = new String[] {""} ;
      H01PV6_A9456OMOpeNom = new String[] {""} ;
      H01PV6_n9456OMOpeNom = new boolean[] {false} ;
      H01PV6_A9469OMMCFin = new java.util.Date[] {GXutil.nullDate()} ;
      H01PV6_A9468OMMCIni = new java.util.Date[] {GXutil.nullDate()} ;
      H01PV6_A9455OMOpeCod = new int[1] ;
      Grid2Row = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV7Omcod = "" ;
      sCtrlAV36OmCod_to = "" ;
      sCtrlAV44OmMaqCod = "" ;
      sCtrlAV45OmMaqCod_to = "" ;
      sCtrlAV8Omopecod = "" ;
      sCtrlAV53OmOpeCod_to = "" ;
      sCtrlAV39Omfchcer = "" ;
      sCtrlAV40OMFchCer_to = "" ;
      sCtrlAV60Preventivos = "" ;
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      subGrid2_Linesclass = "" ;
      subGrid3_Linesclass = "" ;
      subGrid4_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      Grid2Column = new com.genexus.webpanels.GXWebColumn();
      Grid3Column = new com.genexus.webpanels.GXWebColumn();
      Grid4Column = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.listadoordenesoperariotarea_wc__default(),
         new Object[] {
             new Object[] {
            H01PV2_A396EmprCod, H01PV2_A9425OMCod, H01PV2_A9426OMMaqCod, H01PV2_A9429PMCod, H01PV2_n9429PMCod, H01PV2_A9439OMFchCer, H01PV2_A9445OMEst, H01PV2_A9427OMMaqDsc, H01PV2_n9427OMMaqDsc, H01PV2_A9436OMFchCre,
            H01PV2_A9433OMTxt
            }
            , new Object[] {
            H01PV3_A9458OMMTpo, H01PV3_A9466OMMCLin, H01PV3_A396EmprCod, H01PV3_A9425OMCod, H01PV3_A9455OMOpeCod, H01PV3_A9468OMMCIni, H01PV3_A9469OMMCFin
            }
            , new Object[] {
            H01PV4_A9449OMRTpo, H01PV4_A9425OMCod, H01PV4_A396EmprCod, H01PV4_A9447OMRepNom, H01PV4_n9447OMRepNom, H01PV4_A9452OMRCCnt, H01PV4_A9453OMRCPre, H01PV4_A9446OMRepCod
            }
            , new Object[] {
            H01PV5_A9425OMCod, H01PV5_A396EmprCod, H01PV5_A9431TMDsc, H01PV5_n9431TMDsc, H01PV5_A9430TMCod
            }
            , new Object[] {
            H01PV6_A9458OMMTpo, H01PV6_A9466OMMCLin, H01PV6_A9425OMCod, H01PV6_A396EmprCod, H01PV6_A9456OMOpeNom, H01PV6_n9456OMOpeNom, H01PV6_A9469OMMCFin, H01PV6_A9468OMMCIni, H01PV6_A9455OMOpeCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavOmcodgrid_Enabled = 0 ;
      edtavPmcodgrid_Enabled = 0 ;
      edtavOmmaqcodgrid_Enabled = 0 ;
      edtavOmmaqdsc_Enabled = 0 ;
      edtavOmfchcre_Enabled = 0 ;
      edtavOmfchcergrid_Enabled = 0 ;
      edtavOmmctie_Enabled = 0 ;
      edtavHhmmalfa_Enabled = 0 ;
      edtavOmtxtgrid_Enabled = 0 ;
      edtavHorreaint_Enabled = 0 ;
      edtavMinrea_Enabled = 0 ;
      edtavMinutos_Enabled = 0 ;
      edtavOmopecodgrid_Enabled = 0 ;
      edtavOmopenomgrid_Enabled = 0 ;
      edtavOmmcinigrid_Enabled = 0 ;
      edtavOmmcfingrid_Enabled = 0 ;
      edtavOmmctiegrid_Enabled = 0 ;
      edtavTmcodgrid_Enabled = 0 ;
      edtavTmdscgrid_Enabled = 0 ;
      edtavOmrepcod_Enabled = 0 ;
      edtavOmrepnom_Enabled = 0 ;
      edtavOmrccnt_Enabled = 0 ;
      edtavOmrcpre_Enabled = 0 ;
   }

   private byte wcpOAV60Preventivos ;
   private byte GRID1_nEOF ;
   private byte GRID2_nEOF ;
   private byte GRID3_nEOF ;
   private byte GRID4_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV60Preventivos ;
   private byte nGXWrapped ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid4_Backcolorstyle ;
   private byte subGrid3_Backcolorstyle ;
   private byte subGrid2_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte subGrid2_Backstyle ;
   private byte subGrid3_Backstyle ;
   private byte subGrid4_Backstyle ;
   private byte subGrid1_Titlebackstyle ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte subGrid2_Titlebackstyle ;
   private byte subGrid2_Allowselection ;
   private byte subGrid2_Allowhovering ;
   private byte subGrid2_Allowcollapsing ;
   private byte subGrid2_Collapsed ;
   private byte subGrid3_Titlebackstyle ;
   private byte subGrid3_Allowselection ;
   private byte subGrid3_Allowhovering ;
   private byte subGrid3_Allowcollapsing ;
   private byte subGrid3_Collapsed ;
   private byte subGrid4_Titlebackstyle ;
   private byte subGrid4_Allowselection ;
   private byte subGrid4_Allowhovering ;
   private byte subGrid4_Allowcollapsing ;
   private byte subGrid4_Collapsed ;
   private short nRcdExists_9 ;
   private short nIsMod_9 ;
   private short nRcdExists_10 ;
   private short nIsMod_10 ;
   private short nRcdExists_7 ;
   private short nIsMod_7 ;
   private short nRcdExists_8 ;
   private short nIsMod_8 ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_6 ;
   private short nIsMod_6 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short wbEnd ;
   private short wbStart ;
   private short AV28HorReaint ;
   private short AV34MinRea ;
   private short AV35Minutos ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV79i ;
   private short AV63tiempo ;
   private short AV27HorRea ;
   private int wcpOAV7Omcod ;
   private int wcpOAV36OmCod_to ;
   private int wcpOAV8Omopecod ;
   private int wcpOAV53OmOpeCod_to ;
   private int nRC_GXsfl_44 ;
   private int nRC_GXsfl_67 ;
   private int nRC_GXsfl_81 ;
   private int nRC_GXsfl_92 ;
   private int AV7Omcod ;
   private int AV36OmCod_to ;
   private int AV8Omopecod ;
   private int AV53OmOpeCod_to ;
   private int subGrid1_Rows ;
   private int subGrid2_Rows ;
   private int subGrid3_Rows ;
   private int subGrid4_Rows ;
   private int nGXsfl_44_idx=1 ;
   private int A9425OMCod ;
   private int A9429PMCod ;
   private int A9455OMOpeCod ;
   private int nGXsfl_67_idx=1 ;
   private int AV71OmCodSelected ;
   private int nGXsfl_81_idx=1 ;
   private int A9430TMCod ;
   private int nGXsfl_92_idx=1 ;
   private int A9446OMRepCod ;
   private int AV38OmCodGrid ;
   private int divTableordensmanten_Height ;
   private int divTableoperario_Height ;
   private int divTabletarea_Height ;
   private int divTablerepuestos_Visible ;
   private int divTablerepuestos_Height ;
   private int edtavEmprcod_Visible ;
   private int AV59PmCodGrid ;
   private int AV55OMOpeCodGrid ;
   private int AV64TmCodGrid ;
   private int AV73OmRepCod ;
   private int subGrid1_Islastpage ;
   private int subGrid4_Islastpage ;
   private int subGrid3_Islastpage ;
   private int subGrid2_Islastpage ;
   private int edtavOmcodgrid_Enabled ;
   private int edtavPmcodgrid_Enabled ;
   private int edtavOmmaqcodgrid_Enabled ;
   private int edtavOmmaqdsc_Enabled ;
   private int edtavOmfchcre_Enabled ;
   private int edtavOmfchcergrid_Enabled ;
   private int edtavOmmctie_Enabled ;
   private int edtavHhmmalfa_Enabled ;
   private int edtavOmtxtgrid_Enabled ;
   private int edtavHorreaint_Enabled ;
   private int edtavMinrea_Enabled ;
   private int edtavMinutos_Enabled ;
   private int edtavOmopecodgrid_Enabled ;
   private int edtavOmopenomgrid_Enabled ;
   private int edtavOmmcinigrid_Enabled ;
   private int edtavOmmcfingrid_Enabled ;
   private int edtavOmmctiegrid_Enabled ;
   private int edtavTmcodgrid_Enabled ;
   private int edtavTmdscgrid_Enabled ;
   private int edtavOmrepcod_Enabled ;
   private int edtavOmrepnom_Enabled ;
   private int edtavOmrccnt_Enabled ;
   private int edtavOmrcpre_Enabled ;
   private int GRID1_nGridOutOfScope ;
   private int GRID4_nGridOutOfScope ;
   private int GRID3_nGridOutOfScope ;
   private int GRID2_nGridOutOfScope ;
   private int subGrid1_Recordcount ;
   private int subGrid4_Recordcount ;
   private int subGrid3_Recordcount ;
   private int subGrid2_Recordcount ;
   private int AV54Omopecod_to2 ;
   private int AV37Omcod_to2 ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int edtavOmcodgrid_Visible ;
   private int edtavPmcodgrid_Visible ;
   private int edtavOmmaqcodgrid_Visible ;
   private int edtavOmmaqdsc_Visible ;
   private int edtavOmfchcre_Visible ;
   private int edtavOmfchcergrid_Visible ;
   private int edtavOmmctie_Visible ;
   private int edtavHhmmalfa_Visible ;
   private int edtavOmtxtgrid_Visible ;
   private int edtavHorreaint_Visible ;
   private int edtavMinrea_Visible ;
   private int edtavMinutos_Visible ;
   private int subGrid2_Backcolor ;
   private int subGrid2_Allbackcolor ;
   private int subGrid3_Backcolor ;
   private int subGrid3_Allbackcolor ;
   private int subGrid4_Backcolor ;
   private int subGrid4_Allbackcolor ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid2_Titlebackcolor ;
   private int subGrid2_Selectedindex ;
   private int subGrid2_Selectioncolor ;
   private int subGrid2_Hoveringcolor ;
   private int subGrid3_Titlebackcolor ;
   private int subGrid3_Selectedindex ;
   private int subGrid3_Selectioncolor ;
   private int subGrid3_Hoveringcolor ;
   private int subGrid4_Titlebackcolor ;
   private int subGrid4_Selectedindex ;
   private int subGrid4_Selectioncolor ;
   private int subGrid4_Hoveringcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private long GRID2_nFirstRecordOnPage ;
   private long GRID3_nFirstRecordOnPage ;
   private long GRID4_nFirstRecordOnPage ;
   private long GRID1_nCurrentRecord ;
   private long GRID2_nCurrentRecord ;
   private long GRID3_nCurrentRecord ;
   private long GRID4_nCurrentRecord ;
   private java.math.BigDecimal A9452OMRCCnt ;
   private java.math.BigDecimal A9453OMRCPre ;
   private java.math.BigDecimal AV51OMMcTieGrid ;
   private java.math.BigDecimal AV75OmRcCnt ;
   private java.math.BigDecimal AV76OmRcPre ;
   private java.math.BigDecimal AV52OmMcTiem ;
   private String wcpOAV44OmMaqCod ;
   private String wcpOAV45OmMaqCod_to ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV44OmMaqCod ;
   private String AV45OmMaqCod_to ;
   private String sGXsfl_44_idx="0001" ;
   private String A396EmprCod ;
   private String A9445OMEst ;
   private String AV5EmprCod ;
   private String A9426OMMaqCod ;
   private String A9427OMMaqDsc ;
   private String sGXsfl_67_idx="0001" ;
   private String A9456OMOpeNom ;
   private String sGXsfl_81_idx="0001" ;
   private String A9431TMDsc ;
   private String sGXsfl_92_idx="0001" ;
   private String A9447OMRepNom ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
   private String Grid4_empowerer_Gridinternalname ;
   private String Grid3_empowerer_Gridinternalname ;
   private String Grid3_empowerer_Infinitescrolling ;
   private String Grid2_empowerer_Gridinternalname ;
   private String Grid2_empowerer_Infinitescrolling ;
   private String Grid1_empowerer_Gridinternalname ;
   private String Grid1_empowerer_Infinitescrolling ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableactions_Internalname ;
   private String TempTags ;
   private String bttBtnexcel_Internalname ;
   private String bttBtnexcel_Jsonclick ;
   private String bttBtnexcel_2_Internalname ;
   private String bttBtnexcel_2_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String divTableordenes_Internalname ;
   private String divTableordensmanten_Internalname ;
   private String lblTextblock_resultado1_Internalname ;
   private String lblTextblock_resultado1_Jsonclick ;
   private String sStyleString ;
   private String subGrid1_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divTableoperario_Internalname ;
   private String lblTextblock_resultado2_Internalname ;
   private String lblTextblock_resultado2_Jsonclick ;
   private String subGrid2_Internalname ;
   private String divTabletarea_Internalname ;
   private String lblTextblock_resultado3_Internalname ;
   private String lblTextblock_resultado3_Jsonclick ;
   private String subGrid3_Internalname ;
   private String divTablerepuestos_Internalname ;
   private String lblTextblock_repuestos_Internalname ;
   private String lblTextblock_repuestos_Jsonclick ;
   private String subGrid4_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavEmprcod_Internalname ;
   private String edtavEmprcod_Jsonclick ;
   private String Grid4_empowerer_Internalname ;
   private String Grid3_empowerer_Internalname ;
   private String Grid2_empowerer_Internalname ;
   private String Grid1_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavOmcodgrid_Internalname ;
   private String edtavPmcodgrid_Internalname ;
   private String AV47OmMaqCodGrid ;
   private String edtavOmmaqcodgrid_Internalname ;
   private String AV83OMMaqDsc ;
   private String edtavOmmaqdsc_Internalname ;
   private String edtavOmfchcre_Internalname ;
   private String edtavOmfchcergrid_Internalname ;
   private String edtavOmmctie_Internalname ;
   private String AV26HHMMAlfa ;
   private String edtavHhmmalfa_Internalname ;
   private String edtavOmtxtgrid_Internalname ;
   private String edtavHorreaint_Internalname ;
   private String edtavMinrea_Internalname ;
   private String edtavMinutos_Internalname ;
   private String edtavOmopecodgrid_Internalname ;
   private String AV56OmOpeNomGrid ;
   private String edtavOmopenomgrid_Internalname ;
   private String edtavOmmcinigrid_Internalname ;
   private String edtavOmmcfingrid_Internalname ;
   private String edtavOmmctiegrid_Internalname ;
   private String edtavTmcodgrid_Internalname ;
   private String AV65TmDscGrid ;
   private String edtavTmdscgrid_Internalname ;
   private String edtavOmrepcod_Internalname ;
   private String AV74OmRepNom ;
   private String edtavOmrepnom_Internalname ;
   private String edtavOmrccnt_Internalname ;
   private String edtavOmrcpre_Internalname ;
   private String GXCCtl ;
   private String AV9Station ;
   private String AV6EmprNom ;
   private String AV10UsurCod ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String edtavOmcodgrid_Columnheaderclass ;
   private String AV46Ommaqcod_to2 ;
   private String scmdbuf ;
   private String edtavOmcodgrid_Columnclass ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String tblTablerightheader_Internalname ;
   private String sCtrlAV7Omcod ;
   private String sCtrlAV36OmCod_to ;
   private String sCtrlAV44OmMaqCod ;
   private String sCtrlAV45OmMaqCod_to ;
   private String sCtrlAV8Omopecod ;
   private String sCtrlAV53OmOpeCod_to ;
   private String sCtrlAV39Omfchcer ;
   private String sCtrlAV40OMFchCer_to ;
   private String sCtrlAV60Preventivos ;
   private String sGXsfl_44_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavOmcodgrid_Jsonclick ;
   private String edtavPmcodgrid_Jsonclick ;
   private String edtavOmmaqcodgrid_Jsonclick ;
   private String edtavOmmaqdsc_Jsonclick ;
   private String edtavOmfchcre_Jsonclick ;
   private String edtavOmfchcergrid_Jsonclick ;
   private String edtavOmmctie_Jsonclick ;
   private String edtavHhmmalfa_Jsonclick ;
   private String edtavOmtxtgrid_Jsonclick ;
   private String edtavHorreaint_Jsonclick ;
   private String edtavMinrea_Jsonclick ;
   private String edtavMinutos_Jsonclick ;
   private String sGXsfl_67_fel_idx="0001" ;
   private String subGrid2_Class ;
   private String subGrid2_Linesclass ;
   private String edtavOmopecodgrid_Jsonclick ;
   private String edtavOmopenomgrid_Jsonclick ;
   private String edtavOmmcinigrid_Jsonclick ;
   private String edtavOmmcfingrid_Jsonclick ;
   private String edtavOmmctiegrid_Jsonclick ;
   private String sGXsfl_81_fel_idx="0001" ;
   private String subGrid3_Class ;
   private String subGrid3_Linesclass ;
   private String edtavTmcodgrid_Jsonclick ;
   private String edtavTmdscgrid_Jsonclick ;
   private String sGXsfl_92_fel_idx="0001" ;
   private String subGrid4_Class ;
   private String subGrid4_Linesclass ;
   private String edtavOmrepcod_Jsonclick ;
   private String edtavOmrepnom_Jsonclick ;
   private String edtavOmrccnt_Jsonclick ;
   private String edtavOmrcpre_Jsonclick ;
   private String subGrid1_Header ;
   private String subGrid2_Header ;
   private String subGrid3_Header ;
   private String subGrid4_Header ;
   private java.util.Date A9439OMFchCer ;
   private java.util.Date A9469OMMCFin ;
   private java.util.Date A9468OMMCIni ;
   private java.util.Date A9436OMFchCre ;
   private java.util.Date AV43OmFchCre ;
   private java.util.Date AV42OmFchCerGrid ;
   private java.util.Date AV50OmMcTie ;
   private java.util.Date AV49OmMcIniGrid ;
   private java.util.Date AV48OMMcFinGrid ;
   private java.util.Date wcpOAV39Omfchcer ;
   private java.util.Date wcpOAV40OMFchCer_to ;
   private java.util.Date AV39Omfchcer ;
   private java.util.Date AV40OMFchCer_to ;
   private java.util.Date AV41Omfchcer_to2 ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n9429PMCod ;
   private boolean n9427OMMaqDsc ;
   private boolean n9456OMOpeNom ;
   private boolean n9431TMDsc ;
   private boolean n9447OMRepNom ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_44_Refreshing=false ;
   private boolean bGXsfl_67_Refreshing=false ;
   private boolean bGXsfl_81_Refreshing=false ;
   private boolean bGXsfl_92_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String A9433OMTxt ;
   private String AV57OMTxtGrid ;
   private String AV82ExcelFilename ;
   private String AV81ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebGrid Grid2Container ;
   private com.genexus.webpanels.GXWebGrid Grid3Container ;
   private com.genexus.webpanels.GXWebGrid Grid4Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebRow Grid4Row ;
   private com.genexus.webpanels.GXWebRow Grid3Row ;
   private com.genexus.webpanels.GXWebRow Grid2Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebColumn Grid2Column ;
   private com.genexus.webpanels.GXWebColumn Grid3Column ;
   private com.genexus.webpanels.GXWebColumn Grid4Column ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGrid4_empowerer ;
   private com.genexus.webpanels.GXUserControl ucGrid3_empowerer ;
   private com.genexus.webpanels.GXUserControl ucGrid2_empowerer ;
   private com.genexus.webpanels.GXUserControl ucGrid1_empowerer ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV61ProgressIndicator ;
   private IDataStoreProvider pr_default ;
   private String[] H01PV2_A396EmprCod ;
   private int[] H01PV2_A9425OMCod ;
   private String[] H01PV2_A9426OMMaqCod ;
   private int[] H01PV2_A9429PMCod ;
   private boolean[] H01PV2_n9429PMCod ;
   private java.util.Date[] H01PV2_A9439OMFchCer ;
   private String[] H01PV2_A9445OMEst ;
   private String[] H01PV2_A9427OMMaqDsc ;
   private boolean[] H01PV2_n9427OMMaqDsc ;
   private java.util.Date[] H01PV2_A9436OMFchCre ;
   private String[] H01PV2_A9433OMTxt ;
   private String[] H01PV3_A9458OMMTpo ;
   private short[] H01PV3_A9466OMMCLin ;
   private String[] H01PV3_A396EmprCod ;
   private int[] H01PV3_A9425OMCod ;
   private int[] H01PV3_A9455OMOpeCod ;
   private java.util.Date[] H01PV3_A9468OMMCIni ;
   private java.util.Date[] H01PV3_A9469OMMCFin ;
   private String[] H01PV4_A9449OMRTpo ;
   private int[] H01PV4_A9425OMCod ;
   private String[] H01PV4_A396EmprCod ;
   private String[] H01PV4_A9447OMRepNom ;
   private boolean[] H01PV4_n9447OMRepNom ;
   private java.math.BigDecimal[] H01PV4_A9452OMRCCnt ;
   private java.math.BigDecimal[] H01PV4_A9453OMRCPre ;
   private int[] H01PV4_A9446OMRepCod ;
   private int[] H01PV5_A9425OMCod ;
   private String[] H01PV5_A396EmprCod ;
   private String[] H01PV5_A9431TMDsc ;
   private boolean[] H01PV5_n9431TMDsc ;
   private int[] H01PV5_A9430TMCod ;
   private String[] H01PV6_A9458OMMTpo ;
   private short[] H01PV6_A9466OMMCLin ;
   private int[] H01PV6_A9425OMCod ;
   private String[] H01PV6_A396EmprCod ;
   private String[] H01PV6_A9456OMOpeNom ;
   private boolean[] H01PV6_n9456OMOpeNom ;
   private java.util.Date[] H01PV6_A9469OMMCFin ;
   private java.util.Date[] H01PV6_A9468OMMCIni ;
   private int[] H01PV6_A9455OMOpeCod ;
   private com.genexus.webpanels.WebSession AV69WebSession ;
}

final  class listadoordenesoperariotarea_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01PV2", "SELECT T1.EmprCod, T1.OMCod, T1.OMMaqCod AS OMMaqCod, T1.PMCod, T1.OMFchCer, T1.OMEst, T2.MaqDsc AS OMMaqDsc, T1.OMFchCre, T1.OMTxt FROM (TXPMORDEN T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.OMMaqCod) WHERE (T1.EmprCod = ?) AND (T1.OMCod >= ?) AND (T1.OMCod <= ?) AND (T1.PMCod > 0 and ? = 1 or (? = 0)) AND (T1.OMMaqCod >= ?) AND (T1.OMMaqCod <= ?) ORDER BY T1.EmprCod, T1.OMEst, T1.OMFchCer ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01PV3", "SELECT OMMTpo, OMMCLin, EmprCod, OMCod, OMOpeCod, OMMCIni, OMMCFin FROM TXPMOrMCo WHERE (EmprCod = ? and OMCod = ? and OMOpeCod >= ?) AND (OMOpeCod <= ?) ORDER BY EmprCod, OMCod, OMOpeCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01PV4", "SELECT T1.OMRTpo, T1.OMCod, T1.EmprCod, T2.MRNom AS OMRepNom, T1.OMRCCnt, T1.OMRCPre, T1.OMRepCod AS OMRepCod FROM (TXPMOrRep T1 INNER JOIN TXPMREPUE T2 ON T2.EmprCod = T1.EmprCod AND T2.MRCod = T1.OMRepCod) WHERE T1.EmprCod = ? and T1.OMCod = ? ORDER BY T1.EmprCod, T1.OMCod, T1.OMRepCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01PV5", "SELECT T1.OMCod, T1.EmprCod, T2.TMDsc, T1.TMCod FROM (TXPMOrde2 T1 INNER JOIN TXPMTAREA T2 ON T2.EmprCod = T1.EmprCod AND T2.TMCod = T1.TMCod) WHERE T1.EmprCod = ? and T1.OMCod = ? ORDER BY T1.EmprCod, T1.OMCod, T1.TMCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01PV6", "SELECT T1.OMMTpo, T1.OMMCLin, T1.OMCod, T1.EmprCod, T2.OpeNom AS OMOpeNom, T1.OMMCFin, T1.OMMCIni, T1.OMOpeCod AS OMOpeCod FROM (TXPMOrMCo T1 INNER JOIN TXPOPERAR T2 ON T2.EmprCod = T1.EmprCod AND T2.OpeCod = T1.OMOpeCod) WHERE T1.EmprCod = ? and T1.OMCod = ? ORDER BY T1.EmprCod, T1.OMCod, T1.OMOpeCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(8);
               ((String[]) buf[10])[0] = rslt.getVarchar(9);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 100);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,3);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,3);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(6);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(7);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 6);
               stmt.setString(7, (String)parms[6], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

